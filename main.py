from antlr4 import *
from LAGrammarLexer import LAGrammarLexer
from LAGrammarParser import LAGrammarParser
from LAGrammarListener import LAGrammarListener

import sys

class CCodeGenerator(LAGrammarListener):
    def __init__(self):
        self.output_lines = []
        self.indentation_level = 0
        self.symbol_table = {}
        self.comandos_processados = set()
        self.comandos = set()


    def print_(self, output_file):
        with open(output_file, 'w') as f:
            for line in self.output_lines:
                f.write(line + '\n')


    def enterPrograma(self, ctx: LAGrammarParser.ProgramaContext):

        self.output_lines.append("#include <stdio.h>")
        self.output_lines.append("#include <stdlib.h>")
        self.output_lines.append("")

        self.enterDeclaracoes(ctx.declaracoes())
 
        self.output_lines.append("int main() {")
        self.indentation_level += 1
        self.enterCorpo(ctx.corpo())
        self.indentation_level -= 1
        self.output_lines.append("\treturn 0;")
        self.output_lines.append("}")
        

    def enterDeclaracoes(self, ctx: LAGrammarParser.DeclaracoesContext):
        for decl in ctx.decl_local_global():
            if decl.declaracao_global():
                self.enterDeclaracao_global(decl.declaracao_global())
            elif decl.declaracao_local():
                self.enterDeclaracao_local(decl.declaracao_local())
            elif decl.constante():
                self.enterConstante(decl.constante())


    def enterDecl_local_global(self, ctx: LAGrammarParser.Decl_local_globalContext):
        if ctx.declaracao_global():
            self.enterDeclaracao_global(ctx.declaracao_global())
        elif ctx.declaracao_local():
            self.enterDeclaracao_local(ctx.declaracao_local())
        elif ctx.constante():
            self.enterConstante(ctx.constante())

    def enterDeclaracao_local(self, ctx: LAGrammarParser.Declaracao_localContext):
        self.enterDeclaracao_variavel(ctx.declaracao_variavel())

    def enterDeclaracao_global(self, ctx: LAGrammarParser.Declaracao_globalContext):
       
        if ctx.declaracoes_variaveis():
            self.enterDeclaracoes_variaveis(ctx.declaracoes_variaveis())
        elif ctx.procedimento():
            self.enterProcedimento(ctx.procedimento())
        elif ctx.funcao():
            self.enterFuncao(ctx.funcao())
        elif ctx.declaracao_tipo():
            self.enterDeclaracao_tipo(ctx.declaracao_tipo())
        elif ctx.declaracao_registro():
            self.enterDeclaracao_registro(ctx.declaracao_registro())

    def enterDeclaracoes_variaveis(self, ctx: LAGrammarParser.Declaracoes_variaveisContext):
        for decl_var in ctx.declaracao_variavel():
            self.enterDeclaracao_variavel(decl_var)

    def enterDeclaracao_registro(self, ctx: LAGrammarParser.Declaracao_registroContext):

        if ctx in self.comandos_processados:
            return 

        self.comandos_processados.add(ctx)
        for declaracao in ctx.identificadores():
            nome = declaracao.IDENT().getText() 
            tipo =self.visitRegistro(declaracao.registro())
        
        self.output_lines.append(self.indentation_level * '\t' + f"struct {{")
        for field_name, field_type in tipo.items():
            if field_type == "char*":
                self.output_lines.append(self.indentation_level * '\t' + f"char {field_name}[80];")
            elif field_type == "int":
                self.output_lines.append(self.indentation_level * '\t' + f"int {field_name};")
            elif field_type == "float":
                self.output_lines.append(self.indentation_level * '\t' + f"float {field_name};")
            elif field_type == "bool":
                self.output_lines.append(self.indentation_level * '\t' + f"int {field_name};") 
            else:
                raise ValueError(f"Tipo de campo não reconhecido: {field_type}")
        
        self.output_lines.append(self.indentation_level * '\t' + f"}} {nome};")


    def enterDeclaracao_variavel(self, ctx: LAGrammarParser.Declaracao_variavelContext):
        if ctx in self.comandos_processados:
            return  

        self.comandos_processados.add(ctx)

        tipo = self.visitTipo(ctx.tipo())
        ident_list = []

        for ident in ctx.identificadores().identificador():
            if isinstance(tipo, dict):
                self.output_lines.append(self.indentation_level * "\t" + f"struct {{")
                for field, field_type in tipo.items():
                    if field_type == "char*":
                        self.output_lines.append(self.indentation_level * "\t\t" + f"char {field}[80];")
                    else:
                        self.output_lines.append(self.indentation_level * "\t\t" + f"{field_type} {field};")
                self.output_lines.append(self.indentation_level * "\t" + f"}} {ident.getText()};")
                self.symbol_table[ident.getText()] = tipo
            elif tipo in self.symbol_table:
                    registro_tipo = self.symbol_table[tipo]
                    self.symbol_table[ident.getText()] = registro_tipo
                    ident_list.append(ident.getText())
            else:
                self.symbol_table[ident.getText()] = tipo
                ident_list.append(ident.getText())

        if tipo == "char*":
            ident_str = ', '.join([f"{ident}[80]" for ident in ident_list])
            self.output_lines.append(self.indentation_level * "\t" + f"char {ident_str};")
        else:
            if not isinstance(tipo, dict):
                ident_str = ', '.join(ident_list)
                self.output_lines.append(self.indentation_level * "\t" + f"{tipo} {ident_str};")

        return None



    def enterDeclaracao_tipo(self, ctx: LAGrammarParser.Declaracao_tipoContext):
        if ctx in self.comandos_processados:
            return 

        self.comandos_processados.add(ctx)


        for declaracao in ctx.declaracoes_tipos().declaracao_tipo_lista():
            tipo_nome = declaracao.IDENT().getText()
            tipo_definition =self.visitRegistro(declaracao.registro())

        
        self.output_lines.append(self.indentation_level * '\t' + f"typedef struct {{")
        self.indentation_level += 1
        for field_name, field_type in tipo_definition.items():

            if field_type == "char*":
                self.output_lines.append(self.indentation_level * '\t' + f"char {field_name}[80];")
            elif field_type == "int":
                self.output_lines.append(self.indentation_level * '\t' + f"int {field_name};")
            elif field_type == "float":
                self.output_lines.append(self.indentation_level * '\t' + f"float {field_name};")
            elif field_type == "bool":
                self.output_lines.append(self.indentation_level * '\t' + f"int {field_name};")  
            else:
                raise ValueError(f"Tipo de campo não reconhecido: {field_type}")
        
        self.indentation_level -= 1
        self.output_lines.append(self.indentation_level * '\t' + f"}} {tipo_nome};")

        self.symbol_table[tipo_nome] = tipo_definition

    def visitTipo(self, ctx: LAGrammarParser.TipoContext):
        if ctx.getText() == 'literal':
            return "char*"
        elif ctx.getText() == 'inteiro':
            return "int"
        elif ctx.getText() == 'real':
            return "float"
        elif ctx.getText() == 'logico':
            return "bool"
        elif ctx.NUM_INT():
            return "int"
        elif ctx.NUM_REAL():
            return "float"
        elif ctx.ponteiro():
            return self.visitPonteiro(ctx.ponteiro())
        elif ctx.registro():
            return self.visitRegistro(ctx.registro())
        elif ctx.endereco():
            return "void*"  
        elif ctx.IDENT():
            return ctx.IDENT().getText()
        else:
            return ctx.getText()

    
    def visitRegistro(self, ctx: LAGrammarParser.RegistroContext):
        registro_fields = {}
        for campo in ctx.campos_registro().campo_registro():
            tipo = self.visitTipo(campo.tipo())
            for ident in campo.identificadores().identificador():
                nome = ident.getText()
                registro_fields[nome] = tipo

        return registro_fields


    def enterCorpo(self, ctx: LAGrammarParser.CorpoContext):
        for child in ctx.children:
            if isinstance(child,LAGrammarParser.Decl_local_globalContext):
                self.enterDecl_local_global(child)
            elif isinstance(child, LAGrammarParser.Declaracao_localContext):
                self.enterDeclaracao_local(child)
            elif isinstance(child, LAGrammarParser.ComandosContext):
                self.enterComandos(child)


    def enterComandos(self, ctx: LAGrammarParser.ComandosContext):
        if ctx in self.comandos_processados:
            return  

        self.comandos_processados.add(ctx)
        for cmd in ctx.comando():
            self.visitCmd(cmd)

    def visitComando(self, ctx: LAGrammarParser.ComandoContext):
        if ctx.caso_cmd():
            self.visitComando_caso(ctx.caso_cmd())
        elif ctx.escreva_cdm():
            self.enterEscreva_cdm(ctx.escreva_cdm())

    def tipo_expressao(self, expr):

        componentes = expr.split()
        
        tipo = set()
        
        for componente in componentes:
            if '.' in componente:
                registro, campo = componente.split('.')
            
                if registro in self.symbol_table:
                    registro_tipo = self.symbol_table[registro]
                    if isinstance(registro_tipo, dict) and campo in registro_tipo:
                        tipo.add(registro_tipo[campo])
        
            elif componente in self.symbol_table:

                tipo.add(self.symbol_table[componente])
                

        
        if len(tipo) == 1:
            return tipo.pop()
        
        if "float" in tipo:
            return "float"
        
        return "int"

    
    def enterFuncao(self, ctx: LAGrammarParser.FuncaoContext):
        if ctx in self.comandos_processados:
            return 

        self.comandos_processados.add(ctx)

        nome_funcao = ctx.identificador().getText()
        tipo_retorno = self.visitTipo(ctx.tipo())
        parametros = []


        if ctx.parametros():
            for parametro in ctx.parametros().parametro():
                nome_param = parametro.identificador().getText()
                tipo_param = parametro.tipo().getText()
                if tipo_param == "literal":
                    tipo_param = "char*"
                elif tipo_param == "inteiro":
                    tipo_param = "int"
                elif tipo_param == "real":
                    tipo_param = "float"
                elif tipo_param == "logico":
                    tipo_param = "int"
                
                if parametro.getChild(0).getText() == 'var':
                    tipo_param += '*'
                    
                parametros.append(f"{tipo_param} {nome_param}")
            self.symbol_table[nome_param] = tipo_param
            
        parametros_str = ", ".join(parametros)

        self.output_lines.append(f"{tipo_retorno} {nome_funcao}({parametros_str}) {{")
        self.indentation_level += 1
        self.enterCorpo(ctx.corpo())
        self.indentation_level -= 1
        self.output_lines.append("}")


    def enterEscreva_cdm(self, ctx: LAGrammarParser.Escreva_cdmContext):
        if ctx in self.comandos_processados:
            return

        self.comandos_processados.add(ctx)

        format_string_parts = []

        if len(ctx.expressao()) == 2:
            for expr in ctx.expressao():
                arg = self.visitExpressao(expr)

                if arg.startswith('"') and arg.endswith('"'):
                    format_string_parts.append(arg[1:-1])
                else:
                        
                    tipo = self.tipo_expressao(arg)
                    if tipo == "int":
                        if format_string_parts:
                            format_string = ''.join(format_string_parts)
                            if arg:
                                self.output_lines.append(self.indentation_level * "\t" + f'printf("{format_string}%d",{arg});')
                                format_string_parts = []
                            else:
                                self.output_lines.append(self.indentation_level * "\t" + f'printf("{format_string}");')
                                format_string_parts = []
                        else:
                            self.output_lines.append(self.indentation_level * "\t" + f'printf("%d",{arg});')
                    elif tipo == "float":
                        if format_string_parts:
                            format_string = ''.join(format_string_parts)
                            if arg:
                                self.output_lines.append(self.indentation_level * "\t" + f'printf("{format_string}%f",{arg});')
                                format_string_parts = []
                            else:
                                self.output_lines.append(self.indentation_level * "\t" + f'printf("{format_string}");')
                                format_string_parts = []
                        else:
                            self.output_lines.append(self.indentation_level * "\t" + f'printf("%f",{arg});')
                 
                    elif tipo == "char*":
                        if format_string_parts:
                            format_string = ''.join(format_string_parts)
                            if arg:
                                self.output_lines.append(self.indentation_level * "\t" + f'printf("{format_string}%s",{arg});')
                                format_string_parts = []
                            else:
                                self.output_lines.append(self.indentation_level * "\t" + f'printf("{format_string}");')
                                format_string_parts = []
                        else:
                            self.output_lines.append(self.indentation_level * "\t" + f'printf("%s",{arg});')
                    elif tipo == "bool":
                        if format_string_parts:
                            format_string = ''.join(format_string_parts)
                            if arg:
                                self.output_lines.append(self.indentation_level * "\t" + f'printf("{format_string}%d",{arg});')
                                format_string_parts = []
                            else:
                                self.output_lines.append(self.indentation_level * "\t" + f'printf("{format_string}");')
                                format_string_parts = []
                        else:
                            self.output_lines.append(self.indentation_level * "\t" + f'printf("%d",{arg});')
                    else:
                        raise ValueError(f"Tipo de variável não suportado para escrita: {tipo}")

            if format_string_parts:
                format_string = ''.join(format_string_parts)
                self.output_lines.append(self.indentation_level * "\t" + f'printf("{format_string}");')

        else:
            for expr in ctx.expressao():
                arg = self.visitExpressao(expr)
                
               
                if arg.startswith('"') and arg.endswith('"'):
                    self.output_lines.append(self.indentation_level * "\t" + f'printf("{arg[1:-1]}");')
                else:
                    tipo = self.tipo_expressao(arg)
                    if tipo == "int":
                        self.output_lines.append(self.indentation_level * "\t" + f'printf("%d",{arg});')
                    elif tipo == "float":
                        self.output_lines.append(self.indentation_level * "\t" + f'printf("%f",{arg});')
                    elif tipo == "char*":
                        self.output_lines.append(self.indentation_level * "\t" + f'printf("%s",{arg});')
                    elif tipo == "bool":
                        self.output_lines.append(self.indentation_level * "\t" + f'printf("%d",{arg});')
                    else:
                        raise ValueError(f"Tipo de variável não suportado para escrita: {tipo}")

    

    def enterProcedimento(self, ctx: LAGrammarParser.ProcedimentoContext):
        if ctx in self.comandos_processados:
            return 

        self.comandos_processados.add(ctx)

        nome_procedimento = ctx.IDENT().getText()
        parametros = []

        if ctx.parametros():
            for parametro in ctx.parametros().parametro():
                nome_param = parametro.identificador().getText()
                tipo_param = parametro.tipo().getText()
                if tipo_param == "literal":
                    tipo_param = "char*"
                elif tipo_param == "inteiro":
                    tipo_param = "int"
                elif tipo_param == "real":
                    tipo_param = "float"
                elif tipo_param == "logico":
                    tipo_param = "int"
                
                if parametro.getChild(0).getText() == 'var':
                    tipo_param += '*'
                    
                parametros.append(f"{tipo_param} {nome_param}")
            self.symbol_table[nome_param] = tipo_param

        parametros_str = ", ".join(parametros)
        self.output_lines.append(f"void {nome_procedimento} ({parametros_str}){{")
        
        self.indentation_level += 1
        self.enterCorpo(ctx.corpo())
        self.indentation_level -= 1
        
        self.output_lines.append("}")
        self.output_lines.append("")  


    def enterCaso_cmd(self, ctx: LAGrammarParser.Caso_cmdContext):
        if ctx in self.comandos_processados:
            return 

        self.comandos_processados.add(ctx)

        expressao = self.visitExpressao(ctx.expressao())
        self.output_lines.append(self.indentation_level * "\t" +f"switch ({expressao}) {{")
        
        inside_interval = False  
        
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            
            if isinstance(child, LAGrammarParser.IntervaloContext):
                
                intervalo = self.visitIntervalo(child)

                self.output_lines.append(f"\t{intervalo}")
                
                inside_interval = True
                

            elif child.getText() == 'senao':
                
                self.output_lines.append(self.indentation_level * "\t\t" +f"default:")
                inside_interval = False
            
            elif isinstance(child, LAGrammarParser.ComandoContext):
                self.indentation_level += 2
                self.visitComando(child)
                if inside_interval:
                    self.output_lines.append(self.indentation_level * "\t" +f"break;")
                   
                self.indentation_level -= 2
        self.output_lines.append(self.indentation_level * "\t" +f"}}")

                
    def visitIntervalo(self, ctx: LAGrammarParser.IntervaloContext):
        inicio_expr = ctx.expressao(0)
        fim_expr = ctx.expressao(1)

        if fim_expr is None:
            return self.indentation_level * "\t"+ f"case {int(self.visitExpressao(inicio_expr))}:"
        
        inicio = int(self.visitExpressao(inicio_expr))
        fim = int(self.visitExpressao(fim_expr))
        
        intervalos = []
        for valor in range(inicio, fim + 1):
            intervalos.append(self.indentation_level * "\t"+f"case {valor}:")
        
        return "\n\t".join(intervalos)

    
    def enterConstante(self, ctx: LAGrammarParser.ConstanteContext):
        if ctx in self.comandos_processados:
            return 

        self.comandos_processados.add(ctx)

        const_name = ctx.IDENT().getText()
        const_type = self.visitTipo(ctx.tipo())
        const_value = self.visitExpressao(ctx.expressao())
        self.symbol_table[const_name] = ('constante', const_value)
        self.output_lines.append(f"#define {const_name} {const_value}\n")



    def enterAtribuicao_cmd(self, ctx: LAGrammarParser.Atribuicao_cmdContext):
        if ctx in self.comandos_processados:
            return 
        
        self.comandos_processados.add(ctx)

        ident = None
        if ctx.identificador():
            ident = ctx.identificador().getText()

        elif ctx.ponteiro():
            ident = ctx.ponteiro().getText()
            if ident.startswith('^'):
                ident = '*' + ident[1:]

        expr = self.visitExpressao(ctx.expressao())
        if expr.startswith('"') and expr.endswith('"'):
                self.output_lines.append(self.indentation_level * "\t" +f"strcpy({ident},{expr});")
        elif ident:
            self.output_lines.append(self.indentation_level * "\t" +f"{ident} = {expr};")
        return None
    

    def enterCmd_faca(self, ctx: LAGrammarParser.Cmd_facaContext):
        if ctx in self.comandos_processados:
            return 

        self.comandos_processados.add(ctx)

        self.output_lines.append(self.indentation_level * "\t" +f"do {{")
        self.indentation_level += 1

        self.enterCorpo(ctx.corpo())

        self.indentation_level -= 1
        condition = self.visitExpressao(ctx.expressao())
        self.output_lines.append(self.indentation_level * "\t" +f"}} while ({condition});")


    def enterCmd_condicional(self, ctx: LAGrammarParser.Cmd_condicionalContext):
        if ctx in self.comandos_processados:
            return 
        
        self.comandos_processados.add(ctx)

        self.output_lines.append(self.indentation_level * "\t" +f"if ({self.visitExpressao(ctx.expressao())}) {{")
        self.indentation_level += 1
        self.enterCorpo(ctx.corpo(0))
        self.indentation_level -= 1
        if ctx.corpo(1):
            self.output_lines.append(self.indentation_level * "\t" +f"}} \n\telse {{")
            self.indentation_level += 1
            self.enterCorpo(ctx.corpo(1))
            self.indentation_level -= 1
        self.output_lines.append("\t}") 

    def enterCmd_enquanto(self, ctx: LAGrammarParser.Cmd_enquantoContext):
        if ctx in self.comandos_processados:
            return 
        
        self.comandos_processados.add(ctx)

        self.output_lines.append(self.indentation_level * "\t" +f"while ({self.visitExpressao(ctx.expressao())}) {{")
        self.indentation_level += 1
        self.enterCorpo(ctx.corpo())
        self.indentation_level -= 1
        self.output_lines.append(self.indentation_level * "\t" +f"}}")

    def enterRetorno(self, ctx: LAGrammarParser.RetornoContext):
        if ctx in self.comandos_processados:
            return 
        
        self.comandos_processados.add(ctx)
        
        expr = self.visitExpressao(ctx.expressao())
        self.output_lines.append(self.indentation_level * "\t" + f"return {expr};")

    def visitExpressao(self, ctx: LAGrammarParser.ExpressaoContext):
        if ctx is None:
            return "" 
        if ctx.operacao():
            return self.visitOperacao(ctx.operacao())
        elif ctx.mensagem_literal():
            return ctx.mensagem_literal().getText()
        elif ctx.literal():
            return self.visitLiteral(ctx.literal())
        elif ctx.termo():
            return self.visitTermo(ctx.termo())
        elif ctx.NUM_INT():
            return ctx.NUM_INT().getText()
        elif ctx.NUM_REAL():
            return ctx.NUM_REAL().getText()
        elif ctx.IDENT():
            return ctx.IDENT().getText()
        elif ctx.chamada_funcao_cmd():
            return self.visitChamada_funcao_cmd(ctx.chamada_funcao_cmd())
        elif ctx.chamada_tipo_cdm():
            return self.visitChamada_tipo_cdm(ctx.chamada_tipo_cdm())
        elif ctx.chamada_procedimento_cmd():
            return self.visitChamada_procedimento_cmd(ctx.chamada_procedimento_cmd())
        elif ctx.logico():
            left_expr = self.visitExpressao(ctx.expressao(0))  
            operator = ctx.logico().getText()  
            if operator == 'e':
                right_expr = self.visitExpressao(ctx.expressao(1))  
                return f"{left_expr} && {right_expr}"
            else:
                right_expr = self.visitExpressao(ctx.expressao(1))  
                return f"{left_expr} || {right_expr}"
                
        elif ctx.endereco():
            return ctx.endereco().getText()
        elif ctx.termo_logico():
            return self.visitTermo_logico(ctx.termo_logico(0))
        elif ctx.getChildCount() == 2:
            op = ctx.getChild(0).getText()
            expr = self.visitExpressao(ctx.expressao(1))
            return f"{op}{expr}"
        else:
            raise ValueError("Tipo de expressão não reconhecido")

    
    def visitOperacao(self, ctx: LAGrammarParser.OperacaoContext):
        operacao_str = ""
        operando_count = len(ctx.operando())

        for i in range(operando_count):
            operando = self.visitOperando(ctx.operando(i))
            operacao_str += operando

            if i < operando_count - 1:
                operador = ctx.operador(i).getText()
                if operador == '=':
                    operacao_str += f" == "
                else:

                    operacao_str += f" {operador} "

        return operacao_str
 
    def visitOperando(self, ctx: LAGrammarParser.OperandoContext):
        if ctx.NUM_INT():
            return ctx.NUM_INT().getText()
        elif ctx.NUM_REAL():
            return ctx.NUM_REAL().getText()
        elif ctx.identificador():
            return self.visitIdentificador(ctx.identificador())
        elif ctx.operacao():
            return f"({self.visitOperacao(ctx.operacao())})"
        else:
            raise ValueError("Tipo de operando não reconhecido")

    def visitIdentificador(self, ctx: LAGrammarParser.IdentificadorContext):
        return ctx.getText()

    def visitTermo(self, ctx: LAGrammarParser.TermoContext):
        if ctx.fator():
            return self.visitFator(ctx.fator())
        elif ctx.IDENT():
            return ctx.IDENT().getText()
        elif ctx.NUM_INT():
            return ctx.NUM_INT().getText()
        elif ctx.NUM_REAL():
            return ctx.NUM_REAL().getText()
        elif ctx.expressao():
            return self.visitExpressao(ctx.expressao())
        else:
            raise ValueError("Tipo de termo não reconhecido")

    def visitFator(self, ctx: LAGrammarParser.FatorContext):
        if ctx.IDENT():
            return ctx.IDENT().getText()
        elif ctx.NUM_INT():
            return ctx.NUM_INT().getText()
        elif ctx.NUM_REAL():
            return ctx.NUM_REAL().getText()
        elif ctx.expressao():
            return self.visitExpressao(ctx.expressao())

    def visitLiteral(self, ctx: LAGrammarParser.LiteralContext):
        if ctx.CADEIA():
            return ctx.CADEIA().getText()
        elif ctx.LOGICO():
            return ctx.LOGICO().getText()
        elif ctx.endereco():
            return ctx.endereco().getText()
        elif ctx.IDENT():
            return ctx.IDENT().getText()
        else:
            raise ValueError("Tipo de literal não reconhecido")


    def visitChamada_procedimento_cmd(self, ctx: LAGrammarParser.Chamada_procedimento_cmdContext):
        procedure_name = ctx.identificador().getText()
        argumentos = ctx.expressao().getText()
        self.output_lines.append(self.indentation_level * "\t" +f"{procedure_name}({argumentos});")
        return None

    def visitChamada_funcao_cmd(self, ctx: LAGrammarParser.Chamada_funcao_cmdContext):
        function_name = ctx.identificador().getText()  
        arguments = ""
        if ctx.argumentos():
            arguments = self.visitArgumentos(ctx.argumentos())  
        self.output_lines.append(f"{function_name}({arguments});")  
        return None

    def visitArgumentos(self, ctx: LAGrammarParser.ArgumentosContext):
        if ctx.expressao():
            return ", ".join(self.visit(expr) for expr in ctx.expressao())  
        else:
            return "" 

    def enterLeia_cmd(self, ctx: LAGrammarParser.Leia_cmdContext):
        if ctx in self.comandos_processados:
            return 
        
        self.comandos_processados.add(ctx)

        coordinates = ctx.coordenadas()
        identifiers = coordinates.identificador()
        
        for ident in identifiers:
            ident_name = ident.getText()
            tipo = self.symbol_table.get(ident_name)
            
            
            if tipo == "int":
                self.output_lines.append(self.indentation_level * "\t" +f'scanf("%d",&{ident_name});')
            elif tipo == "float":
                self.output_lines.append(self.indentation_level * "\t" +f'scanf("%f",&{ident_name});')
            elif tipo == "char*":
                self.output_lines.append(self.indentation_level * "\t" +f'gets({ident_name});')
            elif tipo == "bool":
                self.output_lines.append(self.indentation_level * "\t" +f'scanf("%d",&{ident_name});')
            else:
                raise ValueError(f"Tipo de variável não suportado para leitura: {tipo}")

    def enterCmd_para(self, ctx: LAGrammarParser.Cmd_paraContext):
        if ctx in self.comandos_processados:
            return
        
        self.comandos_processados.add(ctx)
        
        loop_var = ctx.identificador().getText()
        
        start_expr = self.visitExpressao(ctx.expressao(0))
        end_expr = self.visitExpressao(ctx.expressao(1))
        step_expr = self.visitExpressao(ctx.expressao(2)) if ctx.expressao(2) else "1"
        
        self.output_lines.append(self.indentation_level * "\t" +f"for ({loop_var} = {start_expr}; {loop_var} <= {end_expr}; {loop_var}++) {{")

        self.indentation_level += 1
        self.enterCorpo(ctx.corpo())
        self.indentation_level -= 1
        self.output_lines.append(self.indentation_level * '\t' + f"}}")

    def visitTermo_logico(self, ctx: LAGrammarParser.Termo_logicoContext):
        result = self.visitFator_logico(ctx.fator_logico(0))
        for i in range(1, len(ctx.fator_logico())):
            result += " || " + self.visitFator_logico(ctx.fator_logico(i))
        return result

    def visitFator_logico(self, ctx: LAGrammarParser.Fator_logicoContext):
        if ctx.getChildCount() == 2: 
            return "!" + self.visitParcela_logica(ctx.parcela_logica())
        else:
            return self.visitParcela_logica(ctx.parcela_logica())

    def visitParcela_logica(self, ctx: LAGrammarParser.Parcela_logicaContext):
        if ctx.expressao():
            return "(" + self.visitExpressao(ctx.expressao()) + ")"
        elif ctx.identificador():
            return ctx.identificador().getText()
        elif ctx.constante():
            return ctx.constante().getText()
        elif ctx.expressao_relacional():
            return self.visitExpressao_relacional(ctx.expressao_relacional())
        else:
            raise ValueError("Tipo de parcela lógica não reconhecido")

    def visitExpressao_relacional(self, ctx: LAGrammarParser.Expressao_relacionalContext):
        left = self.visitExpressao_aritmetica(ctx.expressao_aritmetica(0))
        if ctx.expressao_aritmetica(1):
            operator = ctx.operador_relacional().getText()
            right = self.visitExpressao_aritmetica(ctx.expressao_aritmetica(1))
            return f"{left} {operator} {right}"
        return left

    def visitExpressao_aritmetica(self, ctx: LAGrammarParser.Expressao_aritmeticaContext):
        result = self.visitTermo(ctx.termo(0))
        for i in range(1, len(ctx.termo())):
            operator = ctx.getChild(2 * i - 1).getText()
            result += f" {operator} " + self.visitTermo(ctx.termo(i))
        return result


    def visitPonteiro(self, ctx: LAGrammarParser.PonteiroContext):
        tipo_apontado = self.visitTipo(ctx.tipo())
        return f"{tipo_apontado}*"


    def visitCmd(self, ctx: LAGrammarParser.ComandoContext):
        if ctx.cmd_condicional():
            self.enterCmd_condicional(ctx.cmd_condicional())
        elif ctx.cmd_enquanto():
            self.enterCmd_enquanto(ctx.cmd_enquanto())
        elif ctx.cmd_faca():
            self.enterCmd_faca(ctx.cmd_faca())
        elif ctx.atribuicao_cmd():
            self.enterAtribuicao_cmd(ctx.atribuicao_cmd())
        elif ctx.declaracao_tipo():
            self.enterDeclaracao_tipo(ctx.declaracao_tipo())
        elif ctx.leia_cmd():
            self.enterLeia_cmd(ctx.leia_cmd())
        elif ctx.escreva_cdm():
            self.enterEscreva_cdm(ctx.escreva_cdm())
        elif ctx.retorno():
            self.enterRetorno(ctx.retorno())
        elif ctx.chamada_procedimento_cmd():
            self.visitChamada_procedimento_cmd(ctx.chamada_procedimento_cmd())
        elif ctx.chamada_funcao_cmd():
            self.vistChamada_funcao_cmd(ctx.chamada_funcao_cmd())
        elif ctx.cmd_para():
            self.enterCmd_para(ctx.cmd_para())
        elif ctx.caso_cmd:
            self.enterCaso_cmd(ctx.caso_cmd())
        elif ctx.registro():
            self.enterDeclaracao_registro(ctx.registro())
        elif ctx.chamada_tipo_cdm:
            self.enterDeclaracao_tipo(ctx.chamada_tipo_cdm())
        elif ctx.retorno:
            self.enterRetorno(ctx.retorno())
        else:
            print("Comando não existe:", ctx.getText()) 



if __name__ == '__main__':
    input_stream = FileStream(sys.argv[1])
    output_file = sys.argv[2]
    lexer = LAGrammarLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = LAGrammarParser(token_stream)
    tree = parser.programa()

    code_generator = CCodeGenerator()
    walker = ParseTreeWalker()
    walker.walk(code_generator, tree)

    code_generator.print_(output_file)

