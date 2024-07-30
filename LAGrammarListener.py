# Generated from LAGrammar.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .LAGrammarParser import LAGrammarParser
else:
    from LAGrammarParser import LAGrammarParser

# This class defines a complete listener for a parse tree produced by LAGrammarParser.
class LAGrammarListener(ParseTreeListener):

    # Enter a parse tree produced by LAGrammarParser#programa.
    def enterPrograma(self, ctx:LAGrammarParser.ProgramaContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#programa.
    def exitPrograma(self, ctx:LAGrammarParser.ProgramaContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#declaracoes.
    def enterDeclaracoes(self, ctx:LAGrammarParser.DeclaracoesContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#declaracoes.
    def exitDeclaracoes(self, ctx:LAGrammarParser.DeclaracoesContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#decl_local_global.
    def enterDecl_local_global(self, ctx:LAGrammarParser.Decl_local_globalContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#decl_local_global.
    def exitDecl_local_global(self, ctx:LAGrammarParser.Decl_local_globalContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#declaracao_local.
    def enterDeclaracao_local(self, ctx:LAGrammarParser.Declaracao_localContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#declaracao_local.
    def exitDeclaracao_local(self, ctx:LAGrammarParser.Declaracao_localContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#declaracao_global.
    def enterDeclaracao_global(self, ctx:LAGrammarParser.Declaracao_globalContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#declaracao_global.
    def exitDeclaracao_global(self, ctx:LAGrammarParser.Declaracao_globalContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#declaracoes_variaveis.
    def enterDeclaracoes_variaveis(self, ctx:LAGrammarParser.Declaracoes_variaveisContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#declaracoes_variaveis.
    def exitDeclaracoes_variaveis(self, ctx:LAGrammarParser.Declaracoes_variaveisContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#declaracao_registro.
    def enterDeclaracao_registro(self, ctx:LAGrammarParser.Declaracao_registroContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#declaracao_registro.
    def exitDeclaracao_registro(self, ctx:LAGrammarParser.Declaracao_registroContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#declaracao_variavel.
    def enterDeclaracao_variavel(self, ctx:LAGrammarParser.Declaracao_variavelContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#declaracao_variavel.
    def exitDeclaracao_variavel(self, ctx:LAGrammarParser.Declaracao_variavelContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#identificadores.
    def enterIdentificadores(self, ctx:LAGrammarParser.IdentificadoresContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#identificadores.
    def exitIdentificadores(self, ctx:LAGrammarParser.IdentificadoresContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#corpo.
    def enterCorpo(self, ctx:LAGrammarParser.CorpoContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#corpo.
    def exitCorpo(self, ctx:LAGrammarParser.CorpoContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#comandos.
    def enterComandos(self, ctx:LAGrammarParser.ComandosContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#comandos.
    def exitComandos(self, ctx:LAGrammarParser.ComandosContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#comando.
    def enterComando(self, ctx:LAGrammarParser.ComandoContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#comando.
    def exitComando(self, ctx:LAGrammarParser.ComandoContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#leia_cmd.
    def enterLeia_cmd(self, ctx:LAGrammarParser.Leia_cmdContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#leia_cmd.
    def exitLeia_cmd(self, ctx:LAGrammarParser.Leia_cmdContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#coordenadas.
    def enterCoordenadas(self, ctx:LAGrammarParser.CoordenadasContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#coordenadas.
    def exitCoordenadas(self, ctx:LAGrammarParser.CoordenadasContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#escreva_cdm.
    def enterEscreva_cdm(self, ctx:LAGrammarParser.Escreva_cdmContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#escreva_cdm.
    def exitEscreva_cdm(self, ctx:LAGrammarParser.Escreva_cdmContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#mensagem_literal.
    def enterMensagem_literal(self, ctx:LAGrammarParser.Mensagem_literalContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#mensagem_literal.
    def exitMensagem_literal(self, ctx:LAGrammarParser.Mensagem_literalContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#atribuicao_cmd.
    def enterAtribuicao_cmd(self, ctx:LAGrammarParser.Atribuicao_cmdContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#atribuicao_cmd.
    def exitAtribuicao_cmd(self, ctx:LAGrammarParser.Atribuicao_cmdContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#chamada_funcao_cmd.
    def enterChamada_funcao_cmd(self, ctx:LAGrammarParser.Chamada_funcao_cmdContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#chamada_funcao_cmd.
    def exitChamada_funcao_cmd(self, ctx:LAGrammarParser.Chamada_funcao_cmdContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#chamada_tipo_cdm.
    def enterChamada_tipo_cdm(self, ctx:LAGrammarParser.Chamada_tipo_cdmContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#chamada_tipo_cdm.
    def exitChamada_tipo_cdm(self, ctx:LAGrammarParser.Chamada_tipo_cdmContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#chamada_procedimento_cmd.
    def enterChamada_procedimento_cmd(self, ctx:LAGrammarParser.Chamada_procedimento_cmdContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#chamada_procedimento_cmd.
    def exitChamada_procedimento_cmd(self, ctx:LAGrammarParser.Chamada_procedimento_cmdContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#argumentos.
    def enterArgumentos(self, ctx:LAGrammarParser.ArgumentosContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#argumentos.
    def exitArgumentos(self, ctx:LAGrammarParser.ArgumentosContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#cmd_condicional.
    def enterCmd_condicional(self, ctx:LAGrammarParser.Cmd_condicionalContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#cmd_condicional.
    def exitCmd_condicional(self, ctx:LAGrammarParser.Cmd_condicionalContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#cmd_faca.
    def enterCmd_faca(self, ctx:LAGrammarParser.Cmd_facaContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#cmd_faca.
    def exitCmd_faca(self, ctx:LAGrammarParser.Cmd_facaContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#cmd_enquanto.
    def enterCmd_enquanto(self, ctx:LAGrammarParser.Cmd_enquantoContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#cmd_enquanto.
    def exitCmd_enquanto(self, ctx:LAGrammarParser.Cmd_enquantoContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#cmd_para.
    def enterCmd_para(self, ctx:LAGrammarParser.Cmd_paraContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#cmd_para.
    def exitCmd_para(self, ctx:LAGrammarParser.Cmd_paraContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#retorno.
    def enterRetorno(self, ctx:LAGrammarParser.RetornoContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#retorno.
    def exitRetorno(self, ctx:LAGrammarParser.RetornoContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#caso_cmd.
    def enterCaso_cmd(self, ctx:LAGrammarParser.Caso_cmdContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#caso_cmd.
    def exitCaso_cmd(self, ctx:LAGrammarParser.Caso_cmdContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#intervalo.
    def enterIntervalo(self, ctx:LAGrammarParser.IntervaloContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#intervalo.
    def exitIntervalo(self, ctx:LAGrammarParser.IntervaloContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#expressao.
    def enterExpressao(self, ctx:LAGrammarParser.ExpressaoContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#expressao.
    def exitExpressao(self, ctx:LAGrammarParser.ExpressaoContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#literal.
    def enterLiteral(self, ctx:LAGrammarParser.LiteralContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#literal.
    def exitLiteral(self, ctx:LAGrammarParser.LiteralContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#tipo.
    def enterTipo(self, ctx:LAGrammarParser.TipoContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#tipo.
    def exitTipo(self, ctx:LAGrammarParser.TipoContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#operacao.
    def enterOperacao(self, ctx:LAGrammarParser.OperacaoContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#operacao.
    def exitOperacao(self, ctx:LAGrammarParser.OperacaoContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#operando.
    def enterOperando(self, ctx:LAGrammarParser.OperandoContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#operando.
    def exitOperando(self, ctx:LAGrammarParser.OperandoContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#termo.
    def enterTermo(self, ctx:LAGrammarParser.TermoContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#termo.
    def exitTermo(self, ctx:LAGrammarParser.TermoContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#fator.
    def enterFator(self, ctx:LAGrammarParser.FatorContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#fator.
    def exitFator(self, ctx:LAGrammarParser.FatorContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#registro.
    def enterRegistro(self, ctx:LAGrammarParser.RegistroContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#registro.
    def exitRegistro(self, ctx:LAGrammarParser.RegistroContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#termo_logico.
    def enterTermo_logico(self, ctx:LAGrammarParser.Termo_logicoContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#termo_logico.
    def exitTermo_logico(self, ctx:LAGrammarParser.Termo_logicoContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#fator_logico.
    def enterFator_logico(self, ctx:LAGrammarParser.Fator_logicoContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#fator_logico.
    def exitFator_logico(self, ctx:LAGrammarParser.Fator_logicoContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#parcela_logica.
    def enterParcela_logica(self, ctx:LAGrammarParser.Parcela_logicaContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#parcela_logica.
    def exitParcela_logica(self, ctx:LAGrammarParser.Parcela_logicaContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#expressao_relacional.
    def enterExpressao_relacional(self, ctx:LAGrammarParser.Expressao_relacionalContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#expressao_relacional.
    def exitExpressao_relacional(self, ctx:LAGrammarParser.Expressao_relacionalContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#expressao_aritmetica.
    def enterExpressao_aritmetica(self, ctx:LAGrammarParser.Expressao_aritmeticaContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#expressao_aritmetica.
    def exitExpressao_aritmetica(self, ctx:LAGrammarParser.Expressao_aritmeticaContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#campos_registro.
    def enterCampos_registro(self, ctx:LAGrammarParser.Campos_registroContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#campos_registro.
    def exitCampos_registro(self, ctx:LAGrammarParser.Campos_registroContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#campo_registro.
    def enterCampo_registro(self, ctx:LAGrammarParser.Campo_registroContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#campo_registro.
    def exitCampo_registro(self, ctx:LAGrammarParser.Campo_registroContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#declaracao_tipo.
    def enterDeclaracao_tipo(self, ctx:LAGrammarParser.Declaracao_tipoContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#declaracao_tipo.
    def exitDeclaracao_tipo(self, ctx:LAGrammarParser.Declaracao_tipoContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#declaracoes_tipos.
    def enterDeclaracoes_tipos(self, ctx:LAGrammarParser.Declaracoes_tiposContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#declaracoes_tipos.
    def exitDeclaracoes_tipos(self, ctx:LAGrammarParser.Declaracoes_tiposContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#declaracao_tipo_lista.
    def enterDeclaracao_tipo_lista(self, ctx:LAGrammarParser.Declaracao_tipo_listaContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#declaracao_tipo_lista.
    def exitDeclaracao_tipo_lista(self, ctx:LAGrammarParser.Declaracao_tipo_listaContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#identificador.
    def enterIdentificador(self, ctx:LAGrammarParser.IdentificadorContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#identificador.
    def exitIdentificador(self, ctx:LAGrammarParser.IdentificadorContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#constante.
    def enterConstante(self, ctx:LAGrammarParser.ConstanteContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#constante.
    def exitConstante(self, ctx:LAGrammarParser.ConstanteContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#dimensao.
    def enterDimensao(self, ctx:LAGrammarParser.DimensaoContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#dimensao.
    def exitDimensao(self, ctx:LAGrammarParser.DimensaoContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#ponteiro.
    def enterPonteiro(self, ctx:LAGrammarParser.PonteiroContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#ponteiro.
    def exitPonteiro(self, ctx:LAGrammarParser.PonteiroContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#logico.
    def enterLogico(self, ctx:LAGrammarParser.LogicoContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#logico.
    def exitLogico(self, ctx:LAGrammarParser.LogicoContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#endereco.
    def enterEndereco(self, ctx:LAGrammarParser.EnderecoContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#endereco.
    def exitEndereco(self, ctx:LAGrammarParser.EnderecoContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#operador.
    def enterOperador(self, ctx:LAGrammarParser.OperadorContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#operador.
    def exitOperador(self, ctx:LAGrammarParser.OperadorContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#parametros.
    def enterParametros(self, ctx:LAGrammarParser.ParametrosContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#parametros.
    def exitParametros(self, ctx:LAGrammarParser.ParametrosContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#parametro.
    def enterParametro(self, ctx:LAGrammarParser.ParametroContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#parametro.
    def exitParametro(self, ctx:LAGrammarParser.ParametroContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#procedimento.
    def enterProcedimento(self, ctx:LAGrammarParser.ProcedimentoContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#procedimento.
    def exitProcedimento(self, ctx:LAGrammarParser.ProcedimentoContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#funcao.
    def enterFuncao(self, ctx:LAGrammarParser.FuncaoContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#funcao.
    def exitFuncao(self, ctx:LAGrammarParser.FuncaoContext):
        pass


    # Enter a parse tree produced by LAGrammarParser#bloco.
    def enterBloco(self, ctx:LAGrammarParser.BlocoContext):
        pass

    # Exit a parse tree produced by LAGrammarParser#bloco.
    def exitBloco(self, ctx:LAGrammarParser.BlocoContext):
        pass



del LAGrammarParser