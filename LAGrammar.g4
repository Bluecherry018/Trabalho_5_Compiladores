grammar LAGrammar;

programa: declaracoes 'algoritmo' corpo 'fim_algoritmo';

declaracoes: (decl_local_global)*;

decl_local_global: declaracao_global | declaracao_local | constante;

declaracao_local: 'declare' declaracao_variavel;

declaracao_global: declaracoes_variaveis | procedimento | funcao | declaracao_tipo |  declaracao_registro;

declaracoes_variaveis: 'declare' declaracao_variavel (',' declaracao_variavel)*;

declaracao_registro : 'declare' identificador ':' registro;
declaracao_variavel: identificadores DOISPONTOS tipo | declaracao_tipo | registro;

identificadores: identificador (',' identificador)*;

corpo: (declaracao_local | comandos | funcao | procedimento | registro | declaracao_tipo)*;

comandos: comando (comando)*;

comando: caso_cmd
       | leia_cmd
       | escreva_cdm
       | cmd_para
       | atribuicao_cmd
       | chamada_tipo_cdm
       | declaracao_tipo
       | chamada_procedimento_cmd
       | registro
       | chamada_funcao_cmd
       | cmd_condicional
       | cmd_faca
       | cmd_enquanto
       | retorno;

leia_cmd: 'leia' '(' coordenadas ')';

coordenadas: identificador ('.' IDENT)* (',' identificador ('.' IDENT)*)*;

escreva_cdm: 'escreva' '(' expressao(',' expressao)* ')';

mensagem_literal: '"' .*? '"';

atribuicao_cmd: (identificador | ponteiro) '<-' expressao;

chamada_funcao_cmd: IDENT '(' argumentos? ')';

chamada_tipo_cdm: identificador ':' registro;

chamada_procedimento_cmd: identificador '(' expressao? ')';

argumentos: expressao (',' expressao)*;

cmd_condicional: 'se' expressao 'entao' corpo ('senao' corpo)? 'fim_se';

cmd_faca: 'faca' corpo 'ate' expressao;

cmd_enquanto: 'enquanto ' expressao 'faca' corpo 'fim_enquanto';

cmd_para: 'para' identificador '<-' expressao 'ate' expressao ('passo' expressao)? 'faca' corpo 'fim_para';

retorno: 'retorne' expressao;

caso_cmd : 'caso' expressao 'seja'
              ( intervalo ':' comando (',' intervalo ':' comando)* 
              | 'senao' comando
              )* 
              'fim_caso' ;


intervalo : expressao '..' expressao
          | expressao;



expressao: operacao
         | mensagem_literal
         | literal
         | termo (( '+' | '-' ) termo)*
         | NUM_INT
         | NUM_REAL
         | IDENT
         | identificador
         | ponteiro
         |'-' identificador
         | endereco
         | chamada_funcao_cmd
         | chamada_tipo_cdm
         | chamada_procedimento_cmd
         | constante
         | termo_logico ( 'ou' termo_logico )* 
         | '(' expressao ')'
         | expressao ('+'|'-'|'*'|'/'|'>'|'<'|'>='|'<='|'<>'|'='|) expressao
         | expressao logico expressao;


literal: CADEIA | LOGICO | endereco | IDENT;

tipo: 'literal'
    | literal
    | NUM_INT
    | NUM_REAL
    | IDENT
    | identificador
    | 'inteiro'
    | 'real'
    | 'logico'
    | endereco
    | ponteiro
    | registro;



operacao: operando (operador operando)* ;

operando: '(' operacao ')' 
        | identificador 
        | NUM_INT 
        | NUM_REAL 
        ;

termo
    : fator (( '*' | '/' ) fator)*
    ;

fator
    : IDENT
    | NUM_INT
    | NUM_REAL
    | IDENT
    | '(' expressao ')'
    ;


registro: 'registro' campos_registro 'fim_registro';

termo_logico: fator_logico ( 'e' fator_logico )* ;

fator_logico: 'nao'? parcela_logica ;

parcela_logica: '(' expressao ')' | identificador | constante | '(' expressao_relacional ')' ;

expressao_relacional: expressao_aritmetica ( operador expressao_aritmetica )? ;

expressao_aritmetica: termo ( ( '+' | '-' ) termo )* ;

campos_registro: campo_registro (campo_registro)+;

campo_registro: identificadores ':' tipo;

declaracao_tipo: 'tipo' declaracoes_tipos;

declaracoes_tipos: (declaracao_tipo_lista)+;

declaracao_tipo_lista: IDENT ':' registro;

identificador: IDENT ('.' IDENT)* dimensao?;

constante: 'constante' IDENT DOISPONTOS tipo '=' expressao;


dimensao: ('[' expressao ']');

ponteiro: '^' tipo;

logico: 'e' | 'ou';

endereco: '&' identificador;

operador: '+' | '-' | '*' | '/' | '>' | '<' | '>=' | '<=' | '<>' | '=' ;

parametros: parametro (',' parametro)*;

parametro: 'var'? identificador ':' tipo;

procedimento: 'procedimento' IDENT '(' parametros? ')' corpo 'fim_procedimento';

funcao: 'funcao' identificador '(' parametros? ')' ':' tipo corpo 'fim_funcao';

bloco: '{' corpo '}';

DOISPONTOS: ':';

DIFERENTE : '<>';

IDENT: [a-zA-Z] [a-zA-Z0-9_]*;

CADEIA: '"' (~('\n'|'"'))* '"';

LOGICO: 'verdadeiro' | 'falso';

NUM_INT: [0-9]+;

NUM_REAL: [0-9]+'.'[0-9]+;

WS: [ \t\r\n]+ -> skip;

COMMENTS: '{' ~('}')* '}' -> skip;

ErrorChar: .;

