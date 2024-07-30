// Generated from /Users/alexandrafloriano/Desktop/Trabalho 5/Trabalho_5_Compiladores/LAGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LAGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, DOISPONTOS=59, 
		DIFERENTE=60, IDENT=61, CADEIA=62, LOGICO=63, NUM_INT=64, NUM_REAL=65, 
		WS=66, COMMENTS=67, ErrorChar=68;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_declaracao_local = 3, 
		RULE_declaracao_global = 4, RULE_declaracoes_variaveis = 5, RULE_declaracao_registro = 6, 
		RULE_declaracao_variavel = 7, RULE_identificadores = 8, RULE_corpo = 9, 
		RULE_comandos = 10, RULE_comando = 11, RULE_leia_cmd = 12, RULE_coordenadas = 13, 
		RULE_escreva_cdm = 14, RULE_mensagem_literal = 15, RULE_atribuicao_cmd = 16, 
		RULE_chamada_funcao_cmd = 17, RULE_chamada_tipo_cdm = 18, RULE_chamada_procedimento_cmd = 19, 
		RULE_argumentos = 20, RULE_cmd_condicional = 21, RULE_cmd_faca = 22, RULE_cmd_enquanto = 23, 
		RULE_cmd_para = 24, RULE_retorno = 25, RULE_caso_cmd = 26, RULE_intervalo = 27, 
		RULE_expressao = 28, RULE_literal = 29, RULE_tipo = 30, RULE_operacao = 31, 
		RULE_operando = 32, RULE_termo = 33, RULE_fator = 34, RULE_registro = 35, 
		RULE_termo_logico = 36, RULE_fator_logico = 37, RULE_parcela_logica = 38, 
		RULE_expressao_relacional = 39, RULE_expressao_aritmetica = 40, RULE_campos_registro = 41, 
		RULE_campo_registro = 42, RULE_declaracao_tipo = 43, RULE_declaracoes_tipos = 44, 
		RULE_declaracao_tipo_lista = 45, RULE_identificador = 46, RULE_constante = 47, 
		RULE_dimensao = 48, RULE_ponteiro = 49, RULE_logico = 50, RULE_endereco = 51, 
		RULE_operador = 52, RULE_parametros = 53, RULE_parametro = 54, RULE_procedimento = 55, 
		RULE_funcao = 56, RULE_bloco = 57;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "decl_local_global", "declaracao_local", "declaracao_global", 
			"declaracoes_variaveis", "declaracao_registro", "declaracao_variavel", 
			"identificadores", "corpo", "comandos", "comando", "leia_cmd", "coordenadas", 
			"escreva_cdm", "mensagem_literal", "atribuicao_cmd", "chamada_funcao_cmd", 
			"chamada_tipo_cdm", "chamada_procedimento_cmd", "argumentos", "cmd_condicional", 
			"cmd_faca", "cmd_enquanto", "cmd_para", "retorno", "caso_cmd", "intervalo", 
			"expressao", "literal", "tipo", "operacao", "operando", "termo", "fator", 
			"registro", "termo_logico", "fator_logico", "parcela_logica", "expressao_relacional", 
			"expressao_aritmetica", "campos_registro", "campo_registro", "declaracao_tipo", 
			"declaracoes_tipos", "declaracao_tipo_lista", "identificador", "constante", 
			"dimensao", "ponteiro", "logico", "endereco", "operador", "parametros", 
			"parametro", "procedimento", "funcao", "bloco"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'algoritmo'", "'fim_algoritmo'", "'declare'", "','", "'leia'", 
			"'('", "')'", "'.'", "'escreva'", "'\"'", "'<-'", "'se'", "'entao'", 
			"'senao'", "'fim_se'", "'faca'", "'ate'", "'enquanto '", "'fim_enquanto'", 
			"'para'", "'passo'", "'fim_para'", "'retorne'", "'caso'", "'seja'", "'fim_caso'", 
			"'..'", "'+'", "'-'", "'ou'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", 
			"'='", "'literal'", "'inteiro'", "'real'", "'logico'", "'registro'", 
			"'fim_registro'", "'e'", "'nao'", "'tipo'", "'constante'", "'['", "']'", 
			"'^'", "'&'", "'var'", "'procedimento'", "'fim_procedimento'", "'funcao'", 
			"'fim_funcao'", "'{'", "'}'", "':'", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "DOISPONTOS", 
			"DIFERENTE", "IDENT", "CADEIA", "LOGICO", "NUM_INT", "NUM_REAL", "WS", 
			"COMMENTS", "ErrorChar"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LAGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LAGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			declaracoes();
			setState(117);
			match(T__0);
			setState(118);
			corpo();
			setState(119);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracoesContext extends ParserRuleContext {
		public List<Decl_local_globalContext> decl_local_global() {
			return getRuleContexts(Decl_local_globalContext.class);
		}
		public Decl_local_globalContext decl_local_global(int i) {
			return getRuleContext(Decl_local_globalContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 45247102506237960L) != 0)) {
				{
				{
				setState(121);
				decl_local_global();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Decl_local_globalContext extends ParserRuleContext {
		public Declaracao_globalContext declaracao_global() {
			return getRuleContext(Declaracao_globalContext.class,0);
		}
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public Decl_local_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_local_global; }
	}

	public final Decl_local_globalContext decl_local_global() throws RecognitionException {
		Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_local_global);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				declaracao_global();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				declaracao_local();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				constante();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_localContext extends ParserRuleContext {
		public Declaracao_variavelContext declaracao_variavel() {
			return getRuleContext(Declaracao_variavelContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_local);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__2);
			setState(133);
			declaracao_variavel();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_globalContext extends ParserRuleContext {
		public Declaracoes_variaveisContext declaracoes_variaveis() {
			return getRuleContext(Declaracoes_variaveisContext.class,0);
		}
		public ProcedimentoContext procedimento() {
			return getRuleContext(ProcedimentoContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public Declaracao_tipoContext declaracao_tipo() {
			return getRuleContext(Declaracao_tipoContext.class,0);
		}
		public Declaracao_registroContext declaracao_registro() {
			return getRuleContext(Declaracao_registroContext.class,0);
		}
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracao_global);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				declaracoes_variaveis();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				procedimento();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				funcao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				declaracao_tipo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				declaracao_registro();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracoes_variaveisContext extends ParserRuleContext {
		public List<Declaracao_variavelContext> declaracao_variavel() {
			return getRuleContexts(Declaracao_variavelContext.class);
		}
		public Declaracao_variavelContext declaracao_variavel(int i) {
			return getRuleContext(Declaracao_variavelContext.class,i);
		}
		public Declaracoes_variaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes_variaveis; }
	}

	public final Declaracoes_variaveisContext declaracoes_variaveis() throws RecognitionException {
		Declaracoes_variaveisContext _localctx = new Declaracoes_variaveisContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracoes_variaveis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__2);
			setState(143);
			declaracao_variavel();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(144);
				match(T__3);
				setState(145);
				declaracao_variavel();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_registroContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode DOISPONTOS() { return getToken(LAGrammarParser.DOISPONTOS, 0); }
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Declaracao_registroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_registro; }
	}

	public final Declaracao_registroContext declaracao_registro() throws RecognitionException {
		Declaracao_registroContext _localctx = new Declaracao_registroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracao_registro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__2);
			setState(152);
			identificador();
			setState(153);
			match(DOISPONTOS);
			setState(154);
			registro();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_variavelContext extends ParserRuleContext {
		public IdentificadoresContext identificadores() {
			return getRuleContext(IdentificadoresContext.class,0);
		}
		public TerminalNode DOISPONTOS() { return getToken(LAGrammarParser.DOISPONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracao_tipoContext declaracao_tipo() {
			return getRuleContext(Declaracao_tipoContext.class,0);
		}
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Declaracao_variavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_variavel; }
	}

	public final Declaracao_variavelContext declaracao_variavel() throws RecognitionException {
		Declaracao_variavelContext _localctx = new Declaracao_variavelContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracao_variavel);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				identificadores();
				setState(157);
				match(DOISPONTOS);
				setState(158);
				tipo();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				declaracao_tipo();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				registro();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentificadoresContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public IdentificadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificadores; }
	}

	public final IdentificadoresContext identificadores() throws RecognitionException {
		IdentificadoresContext _localctx = new IdentificadoresContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identificadores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			identificador();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(165);
				match(T__3);
				setState(166);
				identificador();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CorpoContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public List<ProcedimentoContext> procedimento() {
			return getRuleContexts(ProcedimentoContext.class);
		}
		public ProcedimentoContext procedimento(int i) {
			return getRuleContext(ProcedimentoContext.class,i);
		}
		public List<RegistroContext> registro() {
			return getRuleContexts(RegistroContext.class);
		}
		public RegistroContext registro(int i) {
			return getRuleContext(RegistroContext.class,i);
		}
		public List<Declaracao_tipoContext> declaracao_tipo() {
			return getRuleContexts(Declaracao_tipoContext.class);
		}
		public Declaracao_tipoContext declaracao_tipo(int i) {
			return getRuleContext(Declaracao_tipoContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2352079672211477032L) != 0)) {
				{
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(172);
					declaracao_local();
					}
					break;
				case 2:
					{
					setState(173);
					comandos();
					}
					break;
				case 3:
					{
					setState(174);
					funcao();
					}
					break;
				case 4:
					{
					setState(175);
					procedimento();
					}
					break;
				case 5:
					{
					setState(176);
					registro();
					}
					break;
				case 6:
					{
					setState(177);
					declaracao_tipo();
					}
					break;
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandosContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comandos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			comando();
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(184);
					comando();
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public Caso_cmdContext caso_cmd() {
			return getRuleContext(Caso_cmdContext.class,0);
		}
		public Leia_cmdContext leia_cmd() {
			return getRuleContext(Leia_cmdContext.class,0);
		}
		public Escreva_cdmContext escreva_cdm() {
			return getRuleContext(Escreva_cdmContext.class,0);
		}
		public Cmd_paraContext cmd_para() {
			return getRuleContext(Cmd_paraContext.class,0);
		}
		public Atribuicao_cmdContext atribuicao_cmd() {
			return getRuleContext(Atribuicao_cmdContext.class,0);
		}
		public Chamada_tipo_cdmContext chamada_tipo_cdm() {
			return getRuleContext(Chamada_tipo_cdmContext.class,0);
		}
		public Declaracao_tipoContext declaracao_tipo() {
			return getRuleContext(Declaracao_tipoContext.class,0);
		}
		public Chamada_procedimento_cmdContext chamada_procedimento_cmd() {
			return getRuleContext(Chamada_procedimento_cmdContext.class,0);
		}
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Chamada_funcao_cmdContext chamada_funcao_cmd() {
			return getRuleContext(Chamada_funcao_cmdContext.class,0);
		}
		public Cmd_condicionalContext cmd_condicional() {
			return getRuleContext(Cmd_condicionalContext.class,0);
		}
		public Cmd_facaContext cmd_faca() {
			return getRuleContext(Cmd_facaContext.class,0);
		}
		public Cmd_enquantoContext cmd_enquanto() {
			return getRuleContext(Cmd_enquantoContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comando);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				caso_cmd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				leia_cmd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				escreva_cdm();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				cmd_para();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				atribuicao_cmd();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				chamada_tipo_cdm();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(196);
				declaracao_tipo();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(197);
				chamada_procedimento_cmd();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(198);
				registro();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(199);
				chamada_funcao_cmd();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(200);
				cmd_condicional();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(201);
				cmd_faca();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(202);
				cmd_enquanto();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(203);
				retorno();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Leia_cmdContext extends ParserRuleContext {
		public CoordenadasContext coordenadas() {
			return getRuleContext(CoordenadasContext.class,0);
		}
		public Leia_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leia_cmd; }
	}

	public final Leia_cmdContext leia_cmd() throws RecognitionException {
		Leia_cmdContext _localctx = new Leia_cmdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_leia_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__4);
			setState(207);
			match(T__5);
			setState(208);
			coordenadas();
			setState(209);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CoordenadasContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public List<TerminalNode> IDENT() { return getTokens(LAGrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LAGrammarParser.IDENT, i);
		}
		public CoordenadasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordenadas; }
	}

	public final CoordenadasContext coordenadas() throws RecognitionException {
		CoordenadasContext _localctx = new CoordenadasContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_coordenadas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			identificador();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(212);
				match(T__7);
				setState(213);
				match(IDENT);
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(219);
				match(T__3);
				setState(220);
				identificador();
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(221);
					match(T__7);
					setState(222);
					match(IDENT);
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Escreva_cdmContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public Escreva_cdmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escreva_cdm; }
	}

	public final Escreva_cdmContext escreva_cdm() throws RecognitionException {
		Escreva_cdmContext _localctx = new Escreva_cdmContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_escreva_cdm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__8);
			setState(234);
			match(T__5);
			setState(235);
			expressao(0);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(236);
				match(T__3);
				setState(237);
				expressao(0);
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mensagem_literalContext extends ParserRuleContext {
		public Mensagem_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mensagem_literal; }
	}

	public final Mensagem_literalContext mensagem_literal() throws RecognitionException {
		Mensagem_literalContext _localctx = new Mensagem_literalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mensagem_literal);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__9);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(246);
					matchWildcard();
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(252);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Atribuicao_cmdContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public PonteiroContext ponteiro() {
			return getRuleContext(PonteiroContext.class,0);
		}
		public Atribuicao_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_cmd; }
	}

	public final Atribuicao_cmdContext atribuicao_cmd() throws RecognitionException {
		Atribuicao_cmdContext _localctx = new Atribuicao_cmdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atribuicao_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(254);
				identificador();
				}
				break;
			case T__49:
				{
				setState(255);
				ponteiro();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(258);
			match(T__10);
			setState(259);
			expressao(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Chamada_funcao_cmdContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LAGrammarParser.IDENT, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public Chamada_funcao_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_funcao_cmd; }
	}

	public final Chamada_funcao_cmdContext chamada_funcao_cmd() throws RecognitionException {
		Chamada_funcao_cmdContext _localctx = new Chamada_funcao_cmdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_chamada_funcao_cmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(IDENT);
			setState(262);
			match(T__5);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 1116948232933474321L) != 0)) {
				{
				setState(263);
				argumentos();
				}
			}

			setState(266);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Chamada_tipo_cdmContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode DOISPONTOS() { return getToken(LAGrammarParser.DOISPONTOS, 0); }
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Chamada_tipo_cdmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_tipo_cdm; }
	}

	public final Chamada_tipo_cdmContext chamada_tipo_cdm() throws RecognitionException {
		Chamada_tipo_cdmContext _localctx = new Chamada_tipo_cdmContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_chamada_tipo_cdm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			identificador();
			setState(269);
			match(DOISPONTOS);
			setState(270);
			registro();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Chamada_procedimento_cmdContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Chamada_procedimento_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_procedimento_cmd; }
	}

	public final Chamada_procedimento_cmdContext chamada_procedimento_cmd() throws RecognitionException {
		Chamada_procedimento_cmdContext _localctx = new Chamada_procedimento_cmdContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_chamada_procedimento_cmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			identificador();
			setState(273);
			match(T__5);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 1116948232933474321L) != 0)) {
				{
				setState(274);
				expressao(0);
				}
			}

			setState(277);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			expressao(0);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(280);
				match(T__3);
				setState(281);
				expressao(0);
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cmd_condicionalContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CorpoContext> corpo() {
			return getRuleContexts(CorpoContext.class);
		}
		public CorpoContext corpo(int i) {
			return getRuleContext(CorpoContext.class,i);
		}
		public Cmd_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_condicional; }
	}

	public final Cmd_condicionalContext cmd_condicional() throws RecognitionException {
		Cmd_condicionalContext _localctx = new Cmd_condicionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmd_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__11);
			setState(288);
			expressao(0);
			setState(289);
			match(T__12);
			setState(290);
			corpo();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(291);
				match(T__13);
				setState(292);
				corpo();
				}
			}

			setState(295);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cmd_facaContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Cmd_facaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_faca; }
	}

	public final Cmd_facaContext cmd_faca() throws RecognitionException {
		Cmd_facaContext _localctx = new Cmd_facaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cmd_faca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__15);
			setState(298);
			corpo();
			setState(299);
			match(T__16);
			setState(300);
			expressao(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cmd_enquantoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public Cmd_enquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_enquanto; }
	}

	public final Cmd_enquantoContext cmd_enquanto() throws RecognitionException {
		Cmd_enquantoContext _localctx = new Cmd_enquantoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cmd_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__17);
			setState(303);
			expressao(0);
			setState(304);
			match(T__15);
			setState(305);
			corpo();
			setState(306);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cmd_paraContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public Cmd_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_para; }
	}

	public final Cmd_paraContext cmd_para() throws RecognitionException {
		Cmd_paraContext _localctx = new Cmd_paraContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cmd_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__19);
			setState(309);
			identificador();
			setState(310);
			match(T__10);
			setState(311);
			expressao(0);
			setState(312);
			match(T__16);
			setState(313);
			expressao(0);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(314);
				match(T__20);
				setState(315);
				expressao(0);
				}
			}

			setState(318);
			match(T__15);
			setState(319);
			corpo();
			setState(320);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RetornoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(T__22);
			setState(323);
			expressao(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Caso_cmdContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<IntervaloContext> intervalo() {
			return getRuleContexts(IntervaloContext.class);
		}
		public IntervaloContext intervalo(int i) {
			return getRuleContext(IntervaloContext.class,i);
		}
		public List<TerminalNode> DOISPONTOS() { return getTokens(LAGrammarParser.DOISPONTOS); }
		public TerminalNode DOISPONTOS(int i) {
			return getToken(LAGrammarParser.DOISPONTOS, i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public Caso_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso_cmd; }
	}

	public final Caso_cmdContext caso_cmd() throws RecognitionException {
		Caso_cmdContext _localctx = new Caso_cmdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_caso_cmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(T__23);
			setState(326);
			expressao(0);
			setState(327);
			match(T__24);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 1116948232933474577L) != 0)) {
				{
				setState(343);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
				case T__9:
				case T__28:
				case T__44:
				case T__46:
				case T__49:
				case T__50:
				case IDENT:
				case CADEIA:
				case LOGICO:
				case NUM_INT:
				case NUM_REAL:
					{
					setState(328);
					intervalo();
					setState(329);
					match(DOISPONTOS);
					setState(330);
					comando();
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(331);
						match(T__3);
						setState(332);
						intervalo();
						setState(333);
						match(DOISPONTOS);
						setState(334);
						comando();
						}
						}
						setState(340);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__13:
					{
					setState(341);
					match(T__13);
					setState(342);
					comando();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
			match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntervaloContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public IntervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalo; }
	}

	public final IntervaloContext intervalo() throws RecognitionException {
		IntervaloContext _localctx = new IntervaloContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_intervalo);
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				expressao(0);
				setState(351);
				match(T__26);
				setState(352);
				expressao(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				expressao(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public Mensagem_literalContext mensagem_literal() {
			return getRuleContext(Mensagem_literalContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public TerminalNode NUM_INT() { return getToken(LAGrammarParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LAGrammarParser.NUM_REAL, 0); }
		public TerminalNode IDENT() { return getToken(LAGrammarParser.IDENT, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public PonteiroContext ponteiro() {
			return getRuleContext(PonteiroContext.class,0);
		}
		public EnderecoContext endereco() {
			return getRuleContext(EnderecoContext.class,0);
		}
		public Chamada_funcao_cmdContext chamada_funcao_cmd() {
			return getRuleContext(Chamada_funcao_cmdContext.class,0);
		}
		public Chamada_tipo_cdmContext chamada_tipo_cdm() {
			return getRuleContext(Chamada_tipo_cdmContext.class,0);
		}
		public Chamada_procedimento_cmdContext chamada_procedimento_cmd() {
			return getRuleContext(Chamada_procedimento_cmdContext.class,0);
		}
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode DIFERENTE() { return getToken(LAGrammarParser.DIFERENTE, 0); }
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expressao, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(358);
				operacao();
				}
				break;
			case 2:
				{
				setState(359);
				mensagem_literal();
				}
				break;
			case 3:
				{
				setState(360);
				literal();
				}
				break;
			case 4:
				{
				setState(361);
				termo();
				setState(366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(362);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(363);
						termo();
						}
						} 
					}
					setState(368);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case 5:
				{
				setState(369);
				match(NUM_INT);
				}
				break;
			case 6:
				{
				setState(370);
				match(NUM_REAL);
				}
				break;
			case 7:
				{
				setState(371);
				match(IDENT);
				}
				break;
			case 8:
				{
				setState(372);
				identificador();
				}
				break;
			case 9:
				{
				setState(373);
				ponteiro();
				}
				break;
			case 10:
				{
				setState(374);
				match(T__28);
				setState(375);
				identificador();
				}
				break;
			case 11:
				{
				setState(376);
				endereco();
				}
				break;
			case 12:
				{
				setState(377);
				chamada_funcao_cmd();
				}
				break;
			case 13:
				{
				setState(378);
				chamada_tipo_cdm();
				}
				break;
			case 14:
				{
				setState(379);
				chamada_procedimento_cmd();
				}
				break;
			case 15:
				{
				setState(380);
				constante();
				}
				break;
			case 16:
				{
				setState(381);
				termo_logico();
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(382);
						match(T__29);
						setState(383);
						termo_logico();
						}
						} 
					}
					setState(388);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				}
				break;
			case 17:
				{
				setState(389);
				match(T__5);
				setState(390);
				expressao(0);
				setState(391);
				match(T__6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(414);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(395);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(407);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
						case 1:
							{
							setState(396);
							match(T__27);
							}
							break;
						case 2:
							{
							setState(397);
							match(T__28);
							}
							break;
						case 3:
							{
							setState(398);
							match(T__30);
							}
							break;
						case 4:
							{
							setState(399);
							match(T__31);
							}
							break;
						case 5:
							{
							setState(400);
							match(T__32);
							}
							break;
						case 6:
							{
							setState(401);
							match(T__33);
							}
							break;
						case 7:
							{
							setState(402);
							match(T__34);
							}
							break;
						case 8:
							{
							setState(403);
							match(T__35);
							}
							break;
						case 9:
							{
							setState(404);
							match(DIFERENTE);
							}
							break;
						case 10:
							{
							setState(405);
							match(T__36);
							}
							break;
						case 11:
							{
							}
							break;
						}
						setState(409);
						expressao(3);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(410);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(411);
						logico();
						setState(412);
						expressao(2);
						}
						break;
					}
					} 
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(LAGrammarParser.CADEIA, 0); }
		public TerminalNode LOGICO() { return getToken(LAGrammarParser.LOGICO, 0); }
		public EnderecoContext endereco() {
			return getRuleContext(EnderecoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAGrammarParser.IDENT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_literal);
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(CADEIA);
				}
				break;
			case LOGICO:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				match(LOGICO);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				endereco();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(422);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LAGrammarParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LAGrammarParser.NUM_REAL, 0); }
		public TerminalNode IDENT() { return getToken(LAGrammarParser.IDENT, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public EnderecoContext endereco() {
			return getRuleContext(EnderecoContext.class,0);
		}
		public PonteiroContext ponteiro() {
			return getRuleContext(PonteiroContext.class,0);
		}
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tipo);
		try {
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(T__37);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(427);
				match(NUM_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(428);
				match(NUM_REAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(429);
				match(IDENT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(430);
				identificador();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(431);
				match(T__38);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(432);
				match(T__39);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(433);
				match(T__40);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(434);
				endereco();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(435);
				ponteiro();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(436);
				registro();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoContext extends ParserRuleContext {
		public List<OperandoContext> operando() {
			return getRuleContexts(OperandoContext.class);
		}
		public OperandoContext operando(int i) {
			return getRuleContext(OperandoContext.class,i);
		}
		public List<OperadorContext> operador() {
			return getRuleContexts(OperadorContext.class);
		}
		public OperadorContext operador(int i) {
			return getRuleContext(OperadorContext.class,i);
		}
		public OperacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao; }
	}

	public final OperacaoContext operacao() throws RecognitionException {
		OperacaoContext _localctx = new OperacaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_operacao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			operando();
			setState(445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(440);
					operador();
					setState(441);
					operando();
					}
					} 
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperandoContext extends ParserRuleContext {
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LAGrammarParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LAGrammarParser.NUM_REAL, 0); }
		public OperandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando; }
	}

	public final OperandoContext operando() throws RecognitionException {
		OperandoContext _localctx = new OperandoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operando);
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(T__5);
				setState(449);
				operacao();
				setState(450);
				match(T__6);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				identificador();
				}
				break;
			case NUM_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				match(NUM_INT);
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(454);
				match(NUM_REAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_termo);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			fator();
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(458);
					_la = _input.LA(1);
					if ( !(_la==T__30 || _la==T__31) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(459);
					fator();
					}
					} 
				}
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LAGrammarParser.IDENT, 0); }
		public TerminalNode NUM_INT() { return getToken(LAGrammarParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LAGrammarParser.NUM_REAL, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fator);
		try {
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(NUM_INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				match(NUM_REAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(468);
				match(IDENT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(469);
				match(T__5);
				setState(470);
				expressao(0);
				setState(471);
				match(T__6);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RegistroContext extends ParserRuleContext {
		public Campos_registroContext campos_registro() {
			return getRuleContext(Campos_registroContext.class,0);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_registro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(T__41);
			setState(476);
			campos_registro();
			setState(477);
			match(T__42);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Termo_logicoContext extends ParserRuleContext {
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_termo_logico);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			fator_logico();
			setState(484);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(480);
					match(T__43);
					setState(481);
					fator_logico();
					}
					} 
				}
				setState(486);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fator_logicoContext extends ParserRuleContext {
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_fator_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(487);
				match(T__44);
				}
			}

			setState(490);
			parcela_logica();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parcela_logicaContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public Expressao_relacionalContext expressao_relacional() {
			return getRuleContext(Expressao_relacionalContext.class,0);
		}
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_parcela_logica);
		try {
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				match(T__5);
				setState(493);
				expressao(0);
				setState(494);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				identificador();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				constante();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(498);
				match(T__5);
				setState(499);
				expressao_relacional();
				setState(500);
				match(T__6);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_relacionalContext extends ParserRuleContext {
		public List<Expressao_aritmeticaContext> expressao_aritmetica() {
			return getRuleContexts(Expressao_aritmeticaContext.class);
		}
		public Expressao_aritmeticaContext expressao_aritmetica(int i) {
			return getRuleContext(Expressao_aritmeticaContext.class,i);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public Expressao_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_relacional; }
	}

	public final Expressao_relacionalContext expressao_relacional() throws RecognitionException {
		Expressao_relacionalContext _localctx = new Expressao_relacionalContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expressao_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			expressao_aritmetica();
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921778142576640L) != 0)) {
				{
				setState(505);
				operador();
				setState(506);
				expressao_aritmetica();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_aritmeticaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public Expressao_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_aritmetica; }
	}

	public final Expressao_aritmeticaContext expressao_aritmetica() throws RecognitionException {
		Expressao_aritmeticaContext _localctx = new Expressao_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expressao_aritmetica);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			termo();
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(511);
					_la = _input.LA(1);
					if ( !(_la==T__27 || _la==T__28) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(512);
					termo();
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Campos_registroContext extends ParserRuleContext {
		public List<Campo_registroContext> campo_registro() {
			return getRuleContexts(Campo_registroContext.class);
		}
		public Campo_registroContext campo_registro(int i) {
			return getRuleContext(Campo_registroContext.class,i);
		}
		public Campos_registroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campos_registro; }
	}

	public final Campos_registroContext campos_registro() throws RecognitionException {
		Campos_registroContext _localctx = new Campos_registroContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_campos_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			campo_registro();
			setState(520); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(519);
				campo_registro();
				}
				}
				setState(522); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Campo_registroContext extends ParserRuleContext {
		public IdentificadoresContext identificadores() {
			return getRuleContext(IdentificadoresContext.class,0);
		}
		public TerminalNode DOISPONTOS() { return getToken(LAGrammarParser.DOISPONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Campo_registroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo_registro; }
	}

	public final Campo_registroContext campo_registro() throws RecognitionException {
		Campo_registroContext _localctx = new Campo_registroContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_campo_registro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			identificadores();
			setState(525);
			match(DOISPONTOS);
			setState(526);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_tipoContext extends ParserRuleContext {
		public Declaracoes_tiposContext declaracoes_tipos() {
			return getRuleContext(Declaracoes_tiposContext.class,0);
		}
		public Declaracao_tipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_tipo; }
	}

	public final Declaracao_tipoContext declaracao_tipo() throws RecognitionException {
		Declaracao_tipoContext _localctx = new Declaracao_tipoContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_declaracao_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(T__45);
			setState(529);
			declaracoes_tipos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracoes_tiposContext extends ParserRuleContext {
		public List<Declaracao_tipo_listaContext> declaracao_tipo_lista() {
			return getRuleContexts(Declaracao_tipo_listaContext.class);
		}
		public Declaracao_tipo_listaContext declaracao_tipo_lista(int i) {
			return getRuleContext(Declaracao_tipo_listaContext.class,i);
		}
		public Declaracoes_tiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes_tipos; }
	}

	public final Declaracoes_tiposContext declaracoes_tipos() throws RecognitionException {
		Declaracoes_tiposContext _localctx = new Declaracoes_tiposContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_declaracoes_tipos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(532); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(531);
					declaracao_tipo_lista();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(534); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_tipo_listaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LAGrammarParser.IDENT, 0); }
		public TerminalNode DOISPONTOS() { return getToken(LAGrammarParser.DOISPONTOS, 0); }
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Declaracao_tipo_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_tipo_lista; }
	}

	public final Declaracao_tipo_listaContext declaracao_tipo_lista() throws RecognitionException {
		Declaracao_tipo_listaContext _localctx = new Declaracao_tipo_listaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_declaracao_tipo_lista);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(IDENT);
			setState(537);
			match(DOISPONTOS);
			setState(538);
			registro();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(LAGrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LAGrammarParser.IDENT, i);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_identificador);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(IDENT);
			setState(545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(541);
					match(T__7);
					setState(542);
					match(IDENT);
					}
					} 
				}
				setState(547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(548);
				dimensao();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstanteContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LAGrammarParser.IDENT, 0); }
		public TerminalNode DOISPONTOS() { return getToken(LAGrammarParser.DOISPONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_constante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(T__46);
			setState(552);
			match(IDENT);
			setState(553);
			match(DOISPONTOS);
			setState(554);
			tipo();
			setState(555);
			match(T__36);
			setState(556);
			expressao(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DimensaoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_dimensao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(558);
			match(T__47);
			setState(559);
			expressao(0);
			setState(560);
			match(T__48);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PonteiroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public PonteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponteiro; }
	}

	public final PonteiroContext ponteiro() throws RecognitionException {
		PonteiroContext _localctx = new PonteiroContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_ponteiro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(T__49);
			setState(563);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicoContext extends ParserRuleContext {
		public LogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico; }
	}

	public final LogicoContext logico() throws RecognitionException {
		LogicoContext _localctx = new LogicoContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			_la = _input.LA(1);
			if ( !(_la==T__29 || _la==T__43) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnderecoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public EnderecoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endereco; }
	}

	public final EnderecoContext endereco() throws RecognitionException {
		EnderecoContext _localctx = new EnderecoContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_endereco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(T__50);
			setState(568);
			identificador();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode DIFERENTE() { return getToken(LAGrammarParser.DIFERENTE, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921778142576640L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			parametro();
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(573);
				match(T__3);
				setState(574);
				parametro();
				}
				}
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode DOISPONTOS() { return getToken(LAGrammarParser.DOISPONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__51) {
				{
				setState(580);
				match(T__51);
				}
			}

			setState(583);
			identificador();
			setState(584);
			match(DOISPONTOS);
			setState(585);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedimentoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LAGrammarParser.IDENT, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public ProcedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimento; }
	}

	public final ProcedimentoContext procedimento() throws RecognitionException {
		ProcedimentoContext _localctx = new ProcedimentoContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_procedimento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(T__52);
			setState(588);
			match(IDENT);
			setState(589);
			match(T__5);
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__51 || _la==IDENT) {
				{
				setState(590);
				parametros();
				}
			}

			setState(593);
			match(T__6);
			setState(594);
			corpo();
			setState(595);
			match(T__53);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncaoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode DOISPONTOS() { return getToken(LAGrammarParser.DOISPONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(T__54);
			setState(598);
			identificador();
			setState(599);
			match(T__5);
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__51 || _la==IDENT) {
				{
				setState(600);
				parametros();
				}
			}

			setState(603);
			match(T__6);
			setState(604);
			match(DOISPONTOS);
			setState(605);
			tipo();
			setState(606);
			corpo();
			setState(607);
			match(T__55);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(T__56);
			setState(610);
			corpo();
			setState(611);
			match(T__57);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001D\u0266\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001{\b\u0001\n\u0001\f\u0001"+
		"~\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0083\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u008d\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u0093\b\u0005\n\u0005\f\u0005\u0096"+
		"\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00a3\b\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00a8\b\b\n\b\f\b"+
		"\u00ab\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00b3"+
		"\b\t\n\t\f\t\u00b6\t\t\u0001\n\u0001\n\u0005\n\u00ba\b\n\n\n\f\n\u00bd"+
		"\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00cd\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u00d7\b\r\n"+
		"\r\f\r\u00da\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00e0\b\r\n\r"+
		"\f\r\u00e3\t\r\u0005\r\u00e5\b\r\n\r\f\r\u00e8\t\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00ef\b\u000e\n\u000e"+
		"\f\u000e\u00f2\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u00f8\b\u000f\n\u000f\f\u000f\u00fb\t\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u0101\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0109"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0114\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u011b"+
		"\b\u0014\n\u0014\f\u0014\u011e\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0126\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u013d\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0151\b\u001a"+
		"\n\u001a\f\u001a\u0154\t\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0158"+
		"\b\u001a\n\u001a\f\u001a\u015b\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0164\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0005\u001c\u016d\b\u001c\n\u001c\f\u001c\u0170\t\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0181\b\u001c\n\u001c\f\u001c"+
		"\u0184\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u018a\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u0198\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u019f\b\u001c\n\u001c\f\u001c\u01a2"+
		"\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01a8"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u01b6\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0005\u001f\u01bc\b\u001f\n\u001f\f\u001f\u01bf\t\u001f\u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01c8\b \u0001!\u0001"+
		"!\u0001!\u0005!\u01cd\b!\n!\f!\u01d0\t!\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01da\b\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0005$\u01e3\b$\n$\f$\u01e6\t$\u0001%\u0003"+
		"%\u01e9\b%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u01f7\b&\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0003\'\u01fd\b\'\u0001(\u0001(\u0001(\u0005(\u0202\b(\n(\f(\u0205\t"+
		"(\u0001)\u0001)\u0004)\u0209\b)\u000b)\f)\u020a\u0001*\u0001*\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0001,\u0004,\u0215\b,\u000b,\f,\u0216\u0001-\u0001"+
		"-\u0001-\u0001-\u0001.\u0001.\u0001.\u0005.\u0220\b.\n.\f.\u0223\t.\u0001"+
		".\u0003.\u0226\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"0\u00010\u00010\u00010\u00011\u00011\u00011\u00012\u00012\u00013\u0001"+
		"3\u00013\u00014\u00014\u00015\u00015\u00015\u00055\u0240\b5\n5\f5\u0243"+
		"\t5\u00016\u00036\u0246\b6\u00016\u00016\u00016\u00016\u00017\u00017\u0001"+
		"7\u00017\u00037\u0250\b7\u00017\u00017\u00017\u00017\u00018\u00018\u0001"+
		"8\u00018\u00038\u025a\b8\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"9\u00019\u00019\u00019\u00019\u0001\u00f9\u00018:\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\u0000\u0004\u0001\u0000\u001c\u001d"+
		"\u0001\u0000\u001f \u0002\u0000\u001e\u001e,,\u0003\u0000\u001c\u001d"+
		"\u001f%<<\u029d\u0000t\u0001\u0000\u0000\u0000\u0002|\u0001\u0000\u0000"+
		"\u0000\u0004\u0082\u0001\u0000\u0000\u0000\u0006\u0084\u0001\u0000\u0000"+
		"\u0000\b\u008c\u0001\u0000\u0000\u0000\n\u008e\u0001\u0000\u0000\u0000"+
		"\f\u0097\u0001\u0000\u0000\u0000\u000e\u00a2\u0001\u0000\u0000\u0000\u0010"+
		"\u00a4\u0001\u0000\u0000\u0000\u0012\u00b4\u0001\u0000\u0000\u0000\u0014"+
		"\u00b7\u0001\u0000\u0000\u0000\u0016\u00cc\u0001\u0000\u0000\u0000\u0018"+
		"\u00ce\u0001\u0000\u0000\u0000\u001a\u00d3\u0001\u0000\u0000\u0000\u001c"+
		"\u00e9\u0001\u0000\u0000\u0000\u001e\u00f5\u0001\u0000\u0000\u0000 \u0100"+
		"\u0001\u0000\u0000\u0000\"\u0105\u0001\u0000\u0000\u0000$\u010c\u0001"+
		"\u0000\u0000\u0000&\u0110\u0001\u0000\u0000\u0000(\u0117\u0001\u0000\u0000"+
		"\u0000*\u011f\u0001\u0000\u0000\u0000,\u0129\u0001\u0000\u0000\u0000."+
		"\u012e\u0001\u0000\u0000\u00000\u0134\u0001\u0000\u0000\u00002\u0142\u0001"+
		"\u0000\u0000\u00004\u0145\u0001\u0000\u0000\u00006\u0163\u0001\u0000\u0000"+
		"\u00008\u0189\u0001\u0000\u0000\u0000:\u01a7\u0001\u0000\u0000\u0000<"+
		"\u01b5\u0001\u0000\u0000\u0000>\u01b7\u0001\u0000\u0000\u0000@\u01c7\u0001"+
		"\u0000\u0000\u0000B\u01c9\u0001\u0000\u0000\u0000D\u01d9\u0001\u0000\u0000"+
		"\u0000F\u01db\u0001\u0000\u0000\u0000H\u01df\u0001\u0000\u0000\u0000J"+
		"\u01e8\u0001\u0000\u0000\u0000L\u01f6\u0001\u0000\u0000\u0000N\u01f8\u0001"+
		"\u0000\u0000\u0000P\u01fe\u0001\u0000\u0000\u0000R\u0206\u0001\u0000\u0000"+
		"\u0000T\u020c\u0001\u0000\u0000\u0000V\u0210\u0001\u0000\u0000\u0000X"+
		"\u0214\u0001\u0000\u0000\u0000Z\u0218\u0001\u0000\u0000\u0000\\\u021c"+
		"\u0001\u0000\u0000\u0000^\u0227\u0001\u0000\u0000\u0000`\u022e\u0001\u0000"+
		"\u0000\u0000b\u0232\u0001\u0000\u0000\u0000d\u0235\u0001\u0000\u0000\u0000"+
		"f\u0237\u0001\u0000\u0000\u0000h\u023a\u0001\u0000\u0000\u0000j\u023c"+
		"\u0001\u0000\u0000\u0000l\u0245\u0001\u0000\u0000\u0000n\u024b\u0001\u0000"+
		"\u0000\u0000p\u0255\u0001\u0000\u0000\u0000r\u0261\u0001\u0000\u0000\u0000"+
		"tu\u0003\u0002\u0001\u0000uv\u0005\u0001\u0000\u0000vw\u0003\u0012\t\u0000"+
		"wx\u0005\u0002\u0000\u0000x\u0001\u0001\u0000\u0000\u0000y{\u0003\u0004"+
		"\u0002\u0000zy\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0003\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000\u007f\u0083\u0003\b\u0004\u0000\u0080"+
		"\u0083\u0003\u0006\u0003\u0000\u0081\u0083\u0003^/\u0000\u0082\u007f\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0005\u0001\u0000\u0000\u0000\u0084\u0085\u0005"+
		"\u0003\u0000\u0000\u0085\u0086\u0003\u000e\u0007\u0000\u0086\u0007\u0001"+
		"\u0000\u0000\u0000\u0087\u008d\u0003\n\u0005\u0000\u0088\u008d\u0003n"+
		"7\u0000\u0089\u008d\u0003p8\u0000\u008a\u008d\u0003V+\u0000\u008b\u008d"+
		"\u0003\f\u0006\u0000\u008c\u0087\u0001\u0000\u0000\u0000\u008c\u0088\u0001"+
		"\u0000\u0000\u0000\u008c\u0089\u0001\u0000\u0000\u0000\u008c\u008a\u0001"+
		"\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\t\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0005\u0003\u0000\u0000\u008f\u0094\u0003\u000e"+
		"\u0007\u0000\u0090\u0091\u0005\u0004\u0000\u0000\u0091\u0093\u0003\u000e"+
		"\u0007\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000"+
		"\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u000b\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0005\u0003\u0000\u0000\u0098\u0099\u0003\\."+
		"\u0000\u0099\u009a\u0005;\u0000\u0000\u009a\u009b\u0003F#\u0000\u009b"+
		"\r\u0001\u0000\u0000\u0000\u009c\u009d\u0003\u0010\b\u0000\u009d\u009e"+
		"\u0005;\u0000\u0000\u009e\u009f\u0003<\u001e\u0000\u009f\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a3\u0003V+\u0000\u00a1\u00a3\u0003F#\u0000\u00a2"+
		"\u009c\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\u000f\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a9\u0003\\.\u0000\u00a5\u00a6\u0005\u0004\u0000\u0000\u00a6\u00a8"+
		"\u0003\\.\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u0011\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ac\u00b3\u0003\u0006\u0003\u0000\u00ad\u00b3\u0003"+
		"\u0014\n\u0000\u00ae\u00b3\u0003p8\u0000\u00af\u00b3\u0003n7\u0000\u00b0"+
		"\u00b3\u0003F#\u0000\u00b1\u00b3\u0003V+\u0000\u00b2\u00ac\u0001\u0000"+
		"\u0000\u0000\u00b2\u00ad\u0001\u0000\u0000\u0000\u00b2\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b2\u00af\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u0013\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b7\u00bb\u0003\u0016\u000b\u0000\u00b8\u00ba\u0003\u0016"+
		"\u000b\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bc\u0015\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000"+
		"\u0000\u0000\u00be\u00cd\u00034\u001a\u0000\u00bf\u00cd\u0003\u0018\f"+
		"\u0000\u00c0\u00cd\u0003\u001c\u000e\u0000\u00c1\u00cd\u00030\u0018\u0000"+
		"\u00c2\u00cd\u0003 \u0010\u0000\u00c3\u00cd\u0003$\u0012\u0000\u00c4\u00cd"+
		"\u0003V+\u0000\u00c5\u00cd\u0003&\u0013\u0000\u00c6\u00cd\u0003F#\u0000"+
		"\u00c7\u00cd\u0003\"\u0011\u0000\u00c8\u00cd\u0003*\u0015\u0000\u00c9"+
		"\u00cd\u0003,\u0016\u0000\u00ca\u00cd\u0003.\u0017\u0000\u00cb\u00cd\u0003"+
		"2\u0019\u0000\u00cc\u00be\u0001\u0000\u0000\u0000\u00cc\u00bf\u0001\u0000"+
		"\u0000\u0000\u00cc\u00c0\u0001\u0000\u0000\u0000\u00cc\u00c1\u0001\u0000"+
		"\u0000\u0000\u00cc\u00c2\u0001\u0000\u0000\u0000\u00cc\u00c3\u0001\u0000"+
		"\u0000\u0000\u00cc\u00c4\u0001\u0000\u0000\u0000\u00cc\u00c5\u0001\u0000"+
		"\u0000\u0000\u00cc\u00c6\u0001\u0000\u0000\u0000\u00cc\u00c7\u0001\u0000"+
		"\u0000\u0000\u00cc\u00c8\u0001\u0000\u0000\u0000\u00cc\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u0017\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u0005"+
		"\u0000\u0000\u00cf\u00d0\u0005\u0006\u0000\u0000\u00d0\u00d1\u0003\u001a"+
		"\r\u0000\u00d1\u00d2\u0005\u0007\u0000\u0000\u00d2\u0019\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d8\u0003\\.\u0000\u00d4\u00d5\u0005\b\u0000\u0000\u00d5"+
		"\u00d7\u0005=\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00da"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d9\u00e6\u0001\u0000\u0000\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u0004\u0000\u0000\u00dc\u00e1"+
		"\u0003\\.\u0000\u00dd\u00de\u0005\b\u0000\u0000\u00de\u00e0\u0005=\u0000"+
		"\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e4\u00db\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e7\u001b\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0005\t\u0000\u0000\u00ea\u00eb\u0005\u0006\u0000\u0000"+
		"\u00eb\u00f0\u00038\u001c\u0000\u00ec\u00ed\u0005\u0004\u0000\u0000\u00ed"+
		"\u00ef\u00038\u001c\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u0007\u0000\u0000\u00f4\u001d"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f9\u0005\n\u0000\u0000\u00f6\u00f8\t"+
		"\u0000\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0005\n\u0000\u0000\u00fd\u001f\u0001\u0000"+
		"\u0000\u0000\u00fe\u0101\u0003\\.\u0000\u00ff\u0101\u0003b1\u0000\u0100"+
		"\u00fe\u0001\u0000\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u000b\u0000\u0000\u0103"+
		"\u0104\u00038\u001c\u0000\u0104!\u0001\u0000\u0000\u0000\u0105\u0106\u0005"+
		"=\u0000\u0000\u0106\u0108\u0005\u0006\u0000\u0000\u0107\u0109\u0003(\u0014"+
		"\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b\u0005\u0007\u0000"+
		"\u0000\u010b#\u0001\u0000\u0000\u0000\u010c\u010d\u0003\\.\u0000\u010d"+
		"\u010e\u0005;\u0000\u0000\u010e\u010f\u0003F#\u0000\u010f%\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0003\\.\u0000\u0111\u0113\u0005\u0006\u0000"+
		"\u0000\u0112\u0114\u00038\u001c\u0000\u0113\u0112\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0005\u0007\u0000\u0000\u0116\'\u0001\u0000\u0000\u0000\u0117"+
		"\u011c\u00038\u001c\u0000\u0118\u0119\u0005\u0004\u0000\u0000\u0119\u011b"+
		"\u00038\u001c\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u011e\u0001"+
		"\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001"+
		"\u0000\u0000\u0000\u011d)\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0005\f\u0000\u0000\u0120\u0121\u00038\u001c"+
		"\u0000\u0121\u0122\u0005\r\u0000\u0000\u0122\u0125\u0003\u0012\t\u0000"+
		"\u0123\u0124\u0005\u000e\u0000\u0000\u0124\u0126\u0003\u0012\t\u0000\u0125"+
		"\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u000f\u0000\u0000\u0128"+
		"+\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u0010\u0000\u0000\u012a\u012b"+
		"\u0003\u0012\t\u0000\u012b\u012c\u0005\u0011\u0000\u0000\u012c\u012d\u0003"+
		"8\u001c\u0000\u012d-\u0001\u0000\u0000\u0000\u012e\u012f\u0005\u0012\u0000"+
		"\u0000\u012f\u0130\u00038\u001c\u0000\u0130\u0131\u0005\u0010\u0000\u0000"+
		"\u0131\u0132\u0003\u0012\t\u0000\u0132\u0133\u0005\u0013\u0000\u0000\u0133"+
		"/\u0001\u0000\u0000\u0000\u0134\u0135\u0005\u0014\u0000\u0000\u0135\u0136"+
		"\u0003\\.\u0000\u0136\u0137\u0005\u000b\u0000\u0000\u0137\u0138\u0003"+
		"8\u001c\u0000\u0138\u0139\u0005\u0011\u0000\u0000\u0139\u013c\u00038\u001c"+
		"\u0000\u013a\u013b\u0005\u0015\u0000\u0000\u013b\u013d\u00038\u001c\u0000"+
		"\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000"+
		"\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0005\u0010\u0000\u0000"+
		"\u013f\u0140\u0003\u0012\t\u0000\u0140\u0141\u0005\u0016\u0000\u0000\u0141"+
		"1\u0001\u0000\u0000\u0000\u0142\u0143\u0005\u0017\u0000\u0000\u0143\u0144"+
		"\u00038\u001c\u0000\u01443\u0001\u0000\u0000\u0000\u0145\u0146\u0005\u0018"+
		"\u0000\u0000\u0146\u0147\u00038\u001c\u0000\u0147\u0159\u0005\u0019\u0000"+
		"\u0000\u0148\u0149\u00036\u001b\u0000\u0149\u014a\u0005;\u0000\u0000\u014a"+
		"\u0152\u0003\u0016\u000b\u0000\u014b\u014c\u0005\u0004\u0000\u0000\u014c"+
		"\u014d\u00036\u001b\u0000\u014d\u014e\u0005;\u0000\u0000\u014e\u014f\u0003"+
		"\u0016\u000b\u0000\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u014b\u0001"+
		"\u0000\u0000\u0000\u0151\u0154\u0001\u0000\u0000\u0000\u0152\u0150\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0158\u0001"+
		"\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0155\u0156\u0005"+
		"\u000e\u0000\u0000\u0156\u0158\u0003\u0016\u000b\u0000\u0157\u0148\u0001"+
		"\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u015b\u0001"+
		"\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u015a\u0001"+
		"\u0000\u0000\u0000\u015a\u015c\u0001\u0000\u0000\u0000\u015b\u0159\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0005\u001a\u0000\u0000\u015d5\u0001\u0000"+
		"\u0000\u0000\u015e\u015f\u00038\u001c\u0000\u015f\u0160\u0005\u001b\u0000"+
		"\u0000\u0160\u0161\u00038\u001c\u0000\u0161\u0164\u0001\u0000\u0000\u0000"+
		"\u0162\u0164\u00038\u001c\u0000\u0163\u015e\u0001\u0000\u0000\u0000\u0163"+
		"\u0162\u0001\u0000\u0000\u0000\u01647\u0001\u0000\u0000\u0000\u0165\u0166"+
		"\u0006\u001c\uffff\uffff\u0000\u0166\u018a\u0003>\u001f\u0000\u0167\u018a"+
		"\u0003\u001e\u000f\u0000\u0168\u018a\u0003:\u001d\u0000\u0169\u016e\u0003"+
		"B!\u0000\u016a\u016b\u0007\u0000\u0000\u0000\u016b\u016d\u0003B!\u0000"+
		"\u016c\u016a\u0001\u0000\u0000\u0000\u016d\u0170\u0001\u0000\u0000\u0000"+
		"\u016e\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000"+
		"\u016f\u018a\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000"+
		"\u0171\u018a\u0005@\u0000\u0000\u0172\u018a\u0005A\u0000\u0000\u0173\u018a"+
		"\u0005=\u0000\u0000\u0174\u018a\u0003\\.\u0000\u0175\u018a\u0003b1\u0000"+
		"\u0176\u0177\u0005\u001d\u0000\u0000\u0177\u018a\u0003\\.\u0000\u0178"+
		"\u018a\u0003f3\u0000\u0179\u018a\u0003\"\u0011\u0000\u017a\u018a\u0003"+
		"$\u0012\u0000\u017b\u018a\u0003&\u0013\u0000\u017c\u018a\u0003^/\u0000"+
		"\u017d\u0182\u0003H$\u0000\u017e\u017f\u0005\u001e\u0000\u0000\u017f\u0181"+
		"\u0003H$\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0181\u0184\u0001\u0000"+
		"\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000"+
		"\u0000\u0000\u0183\u018a\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000"+
		"\u0000\u0000\u0185\u0186\u0005\u0006\u0000\u0000\u0186\u0187\u00038\u001c"+
		"\u0000\u0187\u0188\u0005\u0007\u0000\u0000\u0188\u018a\u0001\u0000\u0000"+
		"\u0000\u0189\u0165\u0001\u0000\u0000\u0000\u0189\u0167\u0001\u0000\u0000"+
		"\u0000\u0189\u0168\u0001\u0000\u0000\u0000\u0189\u0169\u0001\u0000\u0000"+
		"\u0000\u0189\u0171\u0001\u0000\u0000\u0000\u0189\u0172\u0001\u0000\u0000"+
		"\u0000\u0189\u0173\u0001\u0000\u0000\u0000\u0189\u0174\u0001\u0000\u0000"+
		"\u0000\u0189\u0175\u0001\u0000\u0000\u0000\u0189\u0176\u0001\u0000\u0000"+
		"\u0000\u0189\u0178\u0001\u0000\u0000\u0000\u0189\u0179\u0001\u0000\u0000"+
		"\u0000\u0189\u017a\u0001\u0000\u0000\u0000\u0189\u017b\u0001\u0000\u0000"+
		"\u0000\u0189\u017c\u0001\u0000\u0000\u0000\u0189\u017d\u0001\u0000\u0000"+
		"\u0000\u0189\u0185\u0001\u0000\u0000\u0000\u018a\u01a0\u0001\u0000\u0000"+
		"\u0000\u018b\u0197\n\u0002\u0000\u0000\u018c\u0198\u0005\u001c\u0000\u0000"+
		"\u018d\u0198\u0005\u001d\u0000\u0000\u018e\u0198\u0005\u001f\u0000\u0000"+
		"\u018f\u0198\u0005 \u0000\u0000\u0190\u0198\u0005!\u0000\u0000\u0191\u0198"+
		"\u0005\"\u0000\u0000\u0192\u0198\u0005#\u0000\u0000\u0193\u0198\u0005"+
		"$\u0000\u0000\u0194\u0198\u0005<\u0000\u0000\u0195\u0198\u0005%\u0000"+
		"\u0000\u0196\u0198\u0001\u0000\u0000\u0000\u0197\u018c\u0001\u0000\u0000"+
		"\u0000\u0197\u018d\u0001\u0000\u0000\u0000\u0197\u018e\u0001\u0000\u0000"+
		"\u0000\u0197\u018f\u0001\u0000\u0000\u0000\u0197\u0190\u0001\u0000\u0000"+
		"\u0000\u0197\u0191\u0001\u0000\u0000\u0000\u0197\u0192\u0001\u0000\u0000"+
		"\u0000\u0197\u0193\u0001\u0000\u0000\u0000\u0197\u0194\u0001\u0000\u0000"+
		"\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0196\u0001\u0000\u0000"+
		"\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019f\u00038\u001c\u0003"+
		"\u019a\u019b\n\u0001\u0000\u0000\u019b\u019c\u0003d2\u0000\u019c\u019d"+
		"\u00038\u001c\u0002\u019d\u019f\u0001\u0000\u0000\u0000\u019e\u018b\u0001"+
		"\u0000\u0000\u0000\u019e\u019a\u0001\u0000\u0000\u0000\u019f\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001"+
		"\u0000\u0000\u0000\u01a19\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a8\u0005>\u0000\u0000\u01a4\u01a8\u0005?\u0000\u0000"+
		"\u01a5\u01a8\u0003f3\u0000\u01a6\u01a8\u0005=\u0000\u0000\u01a7\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a4\u0001\u0000\u0000\u0000\u01a7\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a8;\u0001"+
		"\u0000\u0000\u0000\u01a9\u01b6\u0005&\u0000\u0000\u01aa\u01b6\u0003:\u001d"+
		"\u0000\u01ab\u01b6\u0005@\u0000\u0000\u01ac\u01b6\u0005A\u0000\u0000\u01ad"+
		"\u01b6\u0005=\u0000\u0000\u01ae\u01b6\u0003\\.\u0000\u01af\u01b6\u0005"+
		"\'\u0000\u0000\u01b0\u01b6\u0005(\u0000\u0000\u01b1\u01b6\u0005)\u0000"+
		"\u0000\u01b2\u01b6\u0003f3\u0000\u01b3\u01b6\u0003b1\u0000\u01b4\u01b6"+
		"\u0003F#\u0000\u01b5\u01a9\u0001\u0000\u0000\u0000\u01b5\u01aa\u0001\u0000"+
		"\u0000\u0000\u01b5\u01ab\u0001\u0000\u0000\u0000\u01b5\u01ac\u0001\u0000"+
		"\u0000\u0000\u01b5\u01ad\u0001\u0000\u0000\u0000\u01b5\u01ae\u0001\u0000"+
		"\u0000\u0000\u01b5\u01af\u0001\u0000\u0000\u0000\u01b5\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b1\u0001\u0000\u0000\u0000\u01b5\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b6=\u0001\u0000\u0000\u0000\u01b7\u01bd\u0003@ \u0000"+
		"\u01b8\u01b9\u0003h4\u0000\u01b9\u01ba\u0003@ \u0000\u01ba\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bb\u01b8\u0001\u0000\u0000\u0000\u01bc\u01bf\u0001"+
		"\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd\u01be\u0001"+
		"\u0000\u0000\u0000\u01be?\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c1\u0005\u0006\u0000\u0000\u01c1\u01c2\u0003>\u001f"+
		"\u0000\u01c2\u01c3\u0005\u0007\u0000\u0000\u01c3\u01c8\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c8\u0003\\.\u0000\u01c5\u01c8\u0005@\u0000\u0000\u01c6"+
		"\u01c8\u0005A\u0000\u0000\u01c7\u01c0\u0001\u0000\u0000\u0000\u01c7\u01c4"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c8A\u0001\u0000\u0000\u0000\u01c9\u01ce\u0003"+
		"D\"\u0000\u01ca\u01cb\u0007\u0001\u0000\u0000\u01cb\u01cd\u0003D\"\u0000"+
		"\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cd\u01d0\u0001\u0000\u0000\u0000"+
		"\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000"+
		"\u01cfC\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d1"+
		"\u01da\u0005=\u0000\u0000\u01d2\u01da\u0005@\u0000\u0000\u01d3\u01da\u0005"+
		"A\u0000\u0000\u01d4\u01da\u0005=\u0000\u0000\u01d5\u01d6\u0005\u0006\u0000"+
		"\u0000\u01d6\u01d7\u00038\u001c\u0000\u01d7\u01d8\u0005\u0007\u0000\u0000"+
		"\u01d8\u01da\u0001\u0000\u0000\u0000\u01d9\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d9\u01d2\u0001\u0000\u0000\u0000\u01d9\u01d3\u0001\u0000\u0000\u0000"+
		"\u01d9\u01d4\u0001\u0000\u0000\u0000\u01d9\u01d5\u0001\u0000\u0000\u0000"+
		"\u01daE\u0001\u0000\u0000\u0000\u01db\u01dc\u0005*\u0000\u0000\u01dc\u01dd"+
		"\u0003R)\u0000\u01dd\u01de\u0005+\u0000\u0000\u01deG\u0001\u0000\u0000"+
		"\u0000\u01df\u01e4\u0003J%\u0000\u01e0\u01e1\u0005,\u0000\u0000\u01e1"+
		"\u01e3\u0003J%\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e3\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e5I\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e9\u0005-\u0000\u0000\u01e8\u01e7\u0001\u0000\u0000"+
		"\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000"+
		"\u0000\u01ea\u01eb\u0003L&\u0000\u01ebK\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ed\u0005\u0006\u0000\u0000\u01ed\u01ee\u00038\u001c\u0000\u01ee\u01ef"+
		"\u0005\u0007\u0000\u0000\u01ef\u01f7\u0001\u0000\u0000\u0000\u01f0\u01f7"+
		"\u0003\\.\u0000\u01f1\u01f7\u0003^/\u0000\u01f2\u01f3\u0005\u0006\u0000"+
		"\u0000\u01f3\u01f4\u0003N\'\u0000\u01f4\u01f5\u0005\u0007\u0000\u0000"+
		"\u01f5\u01f7\u0001\u0000\u0000\u0000\u01f6\u01ec\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f0\u0001\u0000\u0000\u0000\u01f6\u01f1\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f2\u0001\u0000\u0000\u0000\u01f7M\u0001\u0000\u0000\u0000\u01f8"+
		"\u01fc\u0003P(\u0000\u01f9\u01fa\u0003h4\u0000\u01fa\u01fb\u0003P(\u0000"+
		"\u01fb\u01fd\u0001\u0000\u0000\u0000\u01fc\u01f9\u0001\u0000\u0000\u0000"+
		"\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fdO\u0001\u0000\u0000\u0000\u01fe"+
		"\u0203\u0003B!\u0000\u01ff\u0200\u0007\u0000\u0000\u0000\u0200\u0202\u0003"+
		"B!\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0202\u0205\u0001\u0000\u0000"+
		"\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000"+
		"\u0000\u0204Q\u0001\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000"+
		"\u0206\u0208\u0003T*\u0000\u0207\u0209\u0003T*\u0000\u0208\u0207\u0001"+
		"\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u0208\u0001"+
		"\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020bS\u0001\u0000"+
		"\u0000\u0000\u020c\u020d\u0003\u0010\b\u0000\u020d\u020e\u0005;\u0000"+
		"\u0000\u020e\u020f\u0003<\u001e\u0000\u020fU\u0001\u0000\u0000\u0000\u0210"+
		"\u0211\u0005.\u0000\u0000\u0211\u0212\u0003X,\u0000\u0212W\u0001\u0000"+
		"\u0000\u0000\u0213\u0215\u0003Z-\u0000\u0214\u0213\u0001\u0000\u0000\u0000"+
		"\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000\u0000\u0000"+
		"\u0216\u0217\u0001\u0000\u0000\u0000\u0217Y\u0001\u0000\u0000\u0000\u0218"+
		"\u0219\u0005=\u0000\u0000\u0219\u021a\u0005;\u0000\u0000\u021a\u021b\u0003"+
		"F#\u0000\u021b[\u0001\u0000\u0000\u0000\u021c\u0221\u0005=\u0000\u0000"+
		"\u021d\u021e\u0005\b\u0000\u0000\u021e\u0220\u0005=\u0000\u0000\u021f"+
		"\u021d\u0001\u0000\u0000\u0000\u0220\u0223\u0001\u0000\u0000\u0000\u0221"+
		"\u021f\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222"+
		"\u0225\u0001\u0000\u0000\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0224"+
		"\u0226\u0003`0\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0225\u0226\u0001"+
		"\u0000\u0000\u0000\u0226]\u0001\u0000\u0000\u0000\u0227\u0228\u0005/\u0000"+
		"\u0000\u0228\u0229\u0005=\u0000\u0000\u0229\u022a\u0005;\u0000\u0000\u022a"+
		"\u022b\u0003<\u001e\u0000\u022b\u022c\u0005%\u0000\u0000\u022c\u022d\u0003"+
		"8\u001c\u0000\u022d_\u0001\u0000\u0000\u0000\u022e\u022f\u00050\u0000"+
		"\u0000\u022f\u0230\u00038\u001c\u0000\u0230\u0231\u00051\u0000\u0000\u0231"+
		"a\u0001\u0000\u0000\u0000\u0232\u0233\u00052\u0000\u0000\u0233\u0234\u0003"+
		"<\u001e\u0000\u0234c\u0001\u0000\u0000\u0000\u0235\u0236\u0007\u0002\u0000"+
		"\u0000\u0236e\u0001\u0000\u0000\u0000\u0237\u0238\u00053\u0000\u0000\u0238"+
		"\u0239\u0003\\.\u0000\u0239g\u0001\u0000\u0000\u0000\u023a\u023b\u0007"+
		"\u0003\u0000\u0000\u023bi\u0001\u0000\u0000\u0000\u023c\u0241\u0003l6"+
		"\u0000\u023d\u023e\u0005\u0004\u0000\u0000\u023e\u0240\u0003l6\u0000\u023f"+
		"\u023d\u0001\u0000\u0000\u0000\u0240\u0243\u0001\u0000\u0000\u0000\u0241"+
		"\u023f\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242"+
		"k\u0001\u0000\u0000\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0244\u0246"+
		"\u00054\u0000\u0000\u0245\u0244\u0001\u0000\u0000\u0000\u0245\u0246\u0001"+
		"\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u0248\u0003"+
		"\\.\u0000\u0248\u0249\u0005;\u0000\u0000\u0249\u024a\u0003<\u001e\u0000"+
		"\u024am\u0001\u0000\u0000\u0000\u024b\u024c\u00055\u0000\u0000\u024c\u024d"+
		"\u0005=\u0000\u0000\u024d\u024f\u0005\u0006\u0000\u0000\u024e\u0250\u0003"+
		"j5\u0000\u024f\u024e\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000\u0000"+
		"\u0000\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0252\u0005\u0007\u0000"+
		"\u0000\u0252\u0253\u0003\u0012\t\u0000\u0253\u0254\u00056\u0000\u0000"+
		"\u0254o\u0001\u0000\u0000\u0000\u0255\u0256\u00057\u0000\u0000\u0256\u0257"+
		"\u0003\\.\u0000\u0257\u0259\u0005\u0006\u0000\u0000\u0258\u025a\u0003"+
		"j5\u0000\u0259\u0258\u0001\u0000\u0000\u0000\u0259\u025a\u0001\u0000\u0000"+
		"\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b\u025c\u0005\u0007\u0000"+
		"\u0000\u025c\u025d\u0005;\u0000\u0000\u025d\u025e\u0003<\u001e\u0000\u025e"+
		"\u025f\u0003\u0012\t\u0000\u025f\u0260\u00058\u0000\u0000\u0260q\u0001"+
		"\u0000\u0000\u0000\u0261\u0262\u00059\u0000\u0000\u0262\u0263\u0003\u0012"+
		"\t\u0000\u0263\u0264\u0005:\u0000\u0000\u0264s\u0001\u0000\u0000\u0000"+
		"2|\u0082\u008c\u0094\u00a2\u00a9\u00b2\u00b4\u00bb\u00cc\u00d8\u00e1\u00e6"+
		"\u00f0\u00f9\u0100\u0108\u0113\u011c\u0125\u013c\u0152\u0157\u0159\u0163"+
		"\u016e\u0182\u0189\u0197\u019e\u01a0\u01a7\u01b5\u01bd\u01c7\u01ce\u01d9"+
		"\u01e4\u01e8\u01f6\u01fc\u0203\u020a\u0216\u0221\u0225\u0241\u0245\u024f"+
		"\u0259";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}