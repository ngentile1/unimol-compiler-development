// Generated from /home/nik/Desktop/unimol-compiler-development/alan2pp/src/main/antlr4/Alan2.g4 by ANTLR 4.13.1

package it.unimol.alan2pp;

import it.unimol.alan2pp.TooLongIDException;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Alan2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SOURCE=1, FUNCTION=2, OPENPAR=3, CLOSEPAR=4, COMMA=5, TO=6, BEGIN=7, END=8, 
		BOOL=9, INT=10, ARRAY=11, SEMI=12, RELAX=13, OPENBRA=14, CLOSEBRA=15, 
		ASSIGNMENT=16, CALL=17, IF=18, THEN=19, ELSIF=20, ELSE=21, GET=22, LEAVE=23, 
		PUT=24, DOT=25, WHILE=26, DO=27, EQ=28, GE=29, GT=30, LE=31, LT=32, NE=33, 
		MINUS=34, PLUS=35, OR=36, AND=37, DIV=38, MUL=39, REM=40, NOT=41, TRUE=42, 
		FALSE=43, ID=44, NUM=45, STRING=46, COMMENT=47, WS=48;
	public static final int
		RULE_source = 0, RULE_param = 1, RULE_param_comma = 2, RULE_params = 3, 
		RULE_return_type = 4, RULE_funcdef = 5, RULE_body = 6, RULE_type = 7, 
		RULE_id_comma = 8, RULE_def = 9, RULE_vardef = 10, RULE_statements = 11, 
		RULE_statement = 12, RULE_array_access_begin = 13, RULE_array_access = 14, 
		RULE_array_simple = 15, RULE_assign = 16, RULE_expr_comma = 17, RULE_function_call_begin = 18, 
		RULE_function_call = 19, RULE_if = 20, RULE_elsif = 21, RULE_else = 22, 
		RULE_input = 23, RULE_leave = 24, RULE_put_expr_dot = 25, RULE_output = 26, 
		RULE_while = 27, RULE_expr = 28, RULE_simple = 29, RULE_term = 30, RULE_factor = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"source", "param", "param_comma", "params", "return_type", "funcdef", 
			"body", "type", "id_comma", "def", "vardef", "statements", "statement", 
			"array_access_begin", "array_access", "array_simple", "assign", "expr_comma", 
			"function_call_begin", "function_call", "if", "elsif", "else", "input", 
			"leave", "put_expr_dot", "output", "while", "expr", "simple", "term", 
			"factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'source'", "'function'", "'('", "')'", "','", "'to'", "'begin'", 
			"'end'", "'boolean'", "'integer'", "'array'", "';'", "'relax'", "'['", 
			"']'", "':='", "'call'", "'if'", "'then'", "'elsif'", "'else'", "'get'", 
			"'leave'", "'put'", "'.'", "'while'", "'do'", "'='", "'>='", "'>'", "'<='", 
			"'<'", "'<>'", "'-'", "'+'", "'or'", "'and'", "'/'", "'*'", "'rem'", 
			"'not'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SOURCE", "FUNCTION", "OPENPAR", "CLOSEPAR", "COMMA", "TO", "BEGIN", 
			"END", "BOOL", "INT", "ARRAY", "SEMI", "RELAX", "OPENBRA", "CLOSEBRA", 
			"ASSIGNMENT", "CALL", "IF", "THEN", "ELSIF", "ELSE", "GET", "LEAVE", 
			"PUT", "DOT", "WHILE", "DO", "EQ", "GE", "GT", "LE", "LT", "NE", "MINUS", 
			"PLUS", "OR", "AND", "DIV", "MUL", "REM", "NOT", "TRUE", "FALSE", "ID", 
			"NUM", "STRING", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "Alan2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Alan2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceContext extends ParserRuleContext {
		public TerminalNode SOURCE() { return getToken(Alan2Parser.SOURCE, 0); }
		public TerminalNode ID() { return getToken(Alan2Parser.ID, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(SOURCE);
			setState(65);
			match(ID);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1540L) != 0)) {
				{
				{
				setState(66);
				def();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			body();
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
	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(Alan2Parser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			type();
			setState(75);
			match(ID);
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
	public static class Param_commaContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Alan2Parser.COMMA, 0); }
		public Param_commaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_comma; }
	}

	public final Param_commaContext param_comma() throws RecognitionException {
		Param_commaContext _localctx = new Param_commaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_param_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			param();
			setState(78);
			match(COMMA);
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
	public static class ParamsContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public List<Param_commaContext> param_comma() {
			return getRuleContexts(Param_commaContext.class);
		}
		public Param_commaContext param_comma(int i) {
			return getRuleContext(Param_commaContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					param_comma();
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(86);
			param();
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
	public static class Return_typeContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(Alan2Parser.TO, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_return_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(TO);
			setState(89);
			type();
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
	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(Alan2Parser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(Alan2Parser.ID, 0); }
		public TerminalNode OPENPAR() { return getToken(Alan2Parser.OPENPAR, 0); }
		public TerminalNode CLOSEPAR() { return getToken(Alan2Parser.CLOSEPAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(FUNCTION);
			setState(92);
			match(ID);
			setState(93);
			match(OPENPAR);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOL || _la==INT) {
				{
				setState(94);
				params();
				}
			}

			setState(97);
			match(CLOSEPAR);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(98);
				return_type();
				}
			}

			setState(101);
			body();
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
	public static class BodyContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(Alan2Parser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(Alan2Parser.END, 0); }
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(BEGIN);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1540L) != 0)) {
				{
				{
				setState(104);
				def();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			statements();
			setState(111);
			match(END);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(Alan2Parser.INT, 0); }
		public TerminalNode BOOL() { return getToken(Alan2Parser.BOOL, 0); }
		public TerminalNode ARRAY() { return getToken(Alan2Parser.ARRAY, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==BOOL || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY) {
				{
				setState(114);
				match(ARRAY);
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
	public static class Id_commaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Alan2Parser.ID, 0); }
		public TerminalNode COMMA() { return getToken(Alan2Parser.COMMA, 0); }
		public Id_commaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_comma; }
	}

	public final Id_commaContext id_comma() throws RecognitionException {
		Id_commaContext _localctx = new Id_commaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_id_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ID);
			setState(118);
			match(COMMA);
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
	public static class DefContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(Alan2Parser.ID, 0); }
		public TerminalNode SEMI() { return getToken(Alan2Parser.SEMI, 0); }
		public List<Id_commaContext> id_comma() {
			return getRuleContexts(Id_commaContext.class);
		}
		public Id_commaContext id_comma(int i) {
			return getRuleContext(Id_commaContext.class,i);
		}
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_def);
		try {
			int _alt;
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				type();
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(121);
						id_comma();
						}
						} 
					}
					setState(126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(127);
				match(ID);
				setState(128);
				match(SEMI);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				funcdef();
				setState(131);
				match(SEMI);
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
	public static class VardefContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(Alan2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Alan2Parser.ID, i);
		}
		public TerminalNode SEMI() { return getToken(Alan2Parser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Alan2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Alan2Parser.COMMA, i);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vardef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			type();
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(136);
					match(ID);
					setState(137);
					match(COMMA);
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(143);
			match(ID);
			setState(144);
			match(SEMI);
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
	public static class StatementsContext extends ParserRuleContext {
		public TerminalNode RELAX() { return getToken(Alan2Parser.RELAX, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(Alan2Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Alan2Parser.SEMI, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statements);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELAX:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(RELAX);
				}
				break;
			case CALL:
			case IF:
			case GET:
			case LEAVE:
			case PUT:
			case WHILE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				statement();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(148);
					match(SEMI);
					setState(149);
					statement();
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class StatementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode CALL() { return getToken(Alan2Parser.CALL, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public LeaveContext leave() {
			return getRuleContext(LeaveContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				assign();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(CALL);
				setState(159);
				function_call();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				if_();
				}
				break;
			case GET:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				input();
				}
				break;
			case LEAVE:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				leave();
				}
				break;
			case PUT:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				output();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(164);
				while_();
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
	public static class Array_access_beginContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Alan2Parser.ID, 0); }
		public TerminalNode OPENBRA() { return getToken(Alan2Parser.OPENBRA, 0); }
		public Array_access_beginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_access_begin; }
	}

	public final Array_access_beginContext array_access_begin() throws RecognitionException {
		Array_access_beginContext _localctx = new Array_access_beginContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_array_access_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ID);
			setState(168);
			match(OPENBRA);
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
	public static class Array_accessContext extends ParserRuleContext {
		public Array_access_beginContext array_access_begin() {
			return getRuleContext(Array_access_beginContext.class,0);
		}
		public SimpleContext simple() {
			return getRuleContext(SimpleContext.class,0);
		}
		public TerminalNode CLOSEBRA() { return getToken(Alan2Parser.CLOSEBRA, 0); }
		public Array_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_access; }
	}

	public final Array_accessContext array_access() throws RecognitionException {
		Array_accessContext _localctx = new Array_accessContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_array_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			array_access_begin();
			setState(171);
			simple();
			setState(172);
			match(CLOSEBRA);
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
	public static class Array_simpleContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(Alan2Parser.ARRAY, 0); }
		public SimpleContext simple() {
			return getRuleContext(SimpleContext.class,0);
		}
		public Array_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_simple; }
	}

	public final Array_simpleContext array_simple() throws RecognitionException {
		Array_simpleContext _localctx = new Array_simpleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_array_simple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(ARRAY);
			setState(175);
			simple();
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
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT() { return getToken(Alan2Parser.ASSIGNMENT, 0); }
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public TerminalNode ID() { return getToken(Alan2Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Array_simpleContext array_simple() {
			return getRuleContext(Array_simpleContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(177);
				array_access();
				}
				break;
			case 2:
				{
				setState(178);
				match(ID);
				}
				break;
			}
			setState(181);
			match(ASSIGNMENT);
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENPAR:
			case MINUS:
			case NOT:
			case TRUE:
			case FALSE:
			case ID:
			case NUM:
				{
				setState(182);
				expr();
				}
				break;
			case ARRAY:
				{
				setState(183);
				array_simple();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Expr_commaContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Alan2Parser.COMMA, 0); }
		public Expr_commaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_comma; }
	}

	public final Expr_commaContext expr_comma() throws RecognitionException {
		Expr_commaContext _localctx = new Expr_commaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			expr();
			setState(187);
			match(COMMA);
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
	public static class Function_call_beginContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Alan2Parser.ID, 0); }
		public TerminalNode OPENPAR() { return getToken(Alan2Parser.OPENPAR, 0); }
		public Function_call_beginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_begin; }
	}

	public final Function_call_beginContext function_call_begin() throws RecognitionException {
		Function_call_beginContext _localctx = new Function_call_beginContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_call_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(ID);
			setState(190);
			match(OPENPAR);
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
	public static class Function_callContext extends ParserRuleContext {
		public Function_call_beginContext function_call_begin() {
			return getRuleContext(Function_call_beginContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(Alan2Parser.CLOSEPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Expr_commaContext> expr_comma() {
			return getRuleContexts(Expr_commaContext.class);
		}
		public Expr_commaContext expr_comma(int i) {
			return getRuleContext(Expr_commaContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_call);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			function_call_begin();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68186900791304L) != 0)) {
				{
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(193);
						expr_comma();
						}
						} 
					}
					setState(198);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(199);
				expr();
				}
			}

			setState(202);
			match(CLOSEPAR);
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
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Alan2Parser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(Alan2Parser.THEN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(Alan2Parser.END, 0); }
		public List<ElsifContext> elsif() {
			return getRuleContexts(ElsifContext.class);
		}
		public ElsifContext elsif(int i) {
			return getRuleContext(ElsifContext.class,i);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(IF);
			setState(205);
			expr();
			setState(206);
			match(THEN);
			setState(207);
			statements();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(208);
				elsif();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(214);
				else_();
				}
			}

			setState(217);
			match(END);
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
	public static class ElsifContext extends ParserRuleContext {
		public TerminalNode ELSIF() { return getToken(Alan2Parser.ELSIF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(Alan2Parser.THEN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ElsifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsif; }
	}

	public final ElsifContext elsif() throws RecognitionException {
		ElsifContext _localctx = new ElsifContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elsif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(ELSIF);
			setState(220);
			expr();
			setState(221);
			match(THEN);
			setState(222);
			statements();
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
	public static class ElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(Alan2Parser.ELSE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(ELSE);
			setState(225);
			statements();
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
	public static class InputContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(Alan2Parser.GET, 0); }
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public TerminalNode ID() { return getToken(Alan2Parser.ID, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(GET);
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(228);
				array_access();
				}
				break;
			case 2:
				{
				setState(229);
				match(ID);
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
	public static class LeaveContext extends ParserRuleContext {
		public TerminalNode LEAVE() { return getToken(Alan2Parser.LEAVE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LeaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leave; }
	}

	public final LeaveContext leave() throws RecognitionException {
		LeaveContext _localctx = new LeaveContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_leave);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(LEAVE);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68186900791304L) != 0)) {
				{
				setState(233);
				expr();
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
	public static class Put_expr_dotContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Alan2Parser.DOT, 0); }
		public TerminalNode STRING() { return getToken(Alan2Parser.STRING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Put_expr_dotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_put_expr_dot; }
	}

	public final Put_expr_dotContext put_expr_dot() throws RecognitionException {
		Put_expr_dotContext _localctx = new Put_expr_dotContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_put_expr_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(236);
				match(STRING);
				}
				break;
			case OPENPAR:
			case MINUS:
			case NOT:
			case TRUE:
			case FALSE:
			case ID:
			case NUM:
				{
				setState(237);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(240);
			match(DOT);
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
	public static class OutputContext extends ParserRuleContext {
		public TerminalNode PUT() { return getToken(Alan2Parser.PUT, 0); }
		public TerminalNode STRING() { return getToken(Alan2Parser.STRING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Put_expr_dotContext> put_expr_dot() {
			return getRuleContexts(Put_expr_dotContext.class);
		}
		public Put_expr_dotContext put_expr_dot(int i) {
			return getRuleContext(Put_expr_dotContext.class,i);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_output);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(PUT);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(243);
					put_expr_dot();
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(249);
				match(STRING);
				}
				break;
			case OPENPAR:
			case MINUS:
			case NOT:
			case TRUE:
			case FALSE:
			case ID:
			case NUM:
				{
				setState(250);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Alan2Parser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(Alan2Parser.DO, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(Alan2Parser.END, 0); }
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(WHILE);
			setState(254);
			expr();
			setState(255);
			match(DO);
			setState(256);
			statements();
			setState(257);
			match(END);
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
	public static class ExprContext extends ParserRuleContext {
		public List<SimpleContext> simple() {
			return getRuleContexts(SimpleContext.class);
		}
		public SimpleContext simple(int i) {
			return getRuleContext(SimpleContext.class,i);
		}
		public TerminalNode EQ() { return getToken(Alan2Parser.EQ, 0); }
		public TerminalNode NE() { return getToken(Alan2Parser.NE, 0); }
		public TerminalNode GE() { return getToken(Alan2Parser.GE, 0); }
		public TerminalNode GT() { return getToken(Alan2Parser.GT, 0); }
		public TerminalNode LE() { return getToken(Alan2Parser.LE, 0); }
		public TerminalNode LT() { return getToken(Alan2Parser.LT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			simple();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16911433728L) != 0)) {
				{
				setState(260);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16911433728L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(261);
				simple();
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
	public static class SimpleContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> MINUS() { return getTokens(Alan2Parser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(Alan2Parser.MINUS, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(Alan2Parser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(Alan2Parser.PLUS, i);
		}
		public List<TerminalNode> OR() { return getTokens(Alan2Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(Alan2Parser.OR, i);
		}
		public SimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple; }
	}

	public final SimpleContext simple() throws RecognitionException {
		SimpleContext _localctx = new SimpleContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(264);
				match(MINUS);
				}
			}

			setState(267);
			term();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) {
				{
				{
				setState(268);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(269);
				term();
				}
				}
				setState(274);
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
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(Alan2Parser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(Alan2Parser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(Alan2Parser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(Alan2Parser.DIV, i);
		}
		public List<TerminalNode> REM() { return getTokens(Alan2Parser.REM); }
		public TerminalNode REM(int i) {
			return getToken(Alan2Parser.REM, i);
		}
		public List<TerminalNode> AND() { return getTokens(Alan2Parser.AND); }
		public TerminalNode AND(int i) {
			return getToken(Alan2Parser.AND, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			factor();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2061584302080L) != 0)) {
				{
				{
				setState(276);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2061584302080L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(277);
				factor();
				}
				}
				setState(282);
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
	public static class FactorContext extends ParserRuleContext {
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode ID() { return getToken(Alan2Parser.ID, 0); }
		public TerminalNode OPENPAR() { return getToken(Alan2Parser.OPENPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(Alan2Parser.CLOSEPAR, 0); }
		public TerminalNode NUM() { return getToken(Alan2Parser.NUM, 0); }
		public TerminalNode NOT() { return getToken(Alan2Parser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(Alan2Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Alan2Parser.FALSE, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_factor);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				array_access();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				function_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				match(OPENPAR);
				setState(287);
				expr();
				setState(288);
				match(CLOSEPAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
				match(NUM);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(291);
				match(NOT);
				setState(292);
				factor();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(293);
				match(TRUE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(294);
				match(FALSE);
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

	public static final String _serializedATN =
		"\u0004\u00010\u012a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"D\b\u0000\n\u0000\f\u0000G\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0005\u0003R\b\u0003\n\u0003\f\u0003U\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005`\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"d\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006"+
		"j\b\u0006\n\u0006\f\u0006m\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0003\u0007t\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0005\t{\b\t\n\t\f\t~\t\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u0086\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u008b"+
		"\b\n\n\n\f\n\u008e\t\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u0097\b\u000b\n\u000b\f\u000b\u009a"+
		"\t\u000b\u0003\u000b\u009c\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a6\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u00b4\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00b9\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u00c3\b\u0013\n\u0013\f\u0013\u00c6\t\u0013\u0001\u0013\u0003\u0013"+
		"\u00c9\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u00d2\b\u0014\n\u0014\f\u0014\u00d5"+
		"\t\u0014\u0001\u0014\u0003\u0014\u00d8\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u00e7\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u00eb\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u00ef\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u00f5\b\u001a\n\u001a\f\u001a\u00f8\t\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u00fc\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u0107\b\u001c\u0001\u001d\u0003\u001d\u010a\b"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u010f\b\u001d\n"+
		"\u001d\f\u001d\u0112\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u0117\b\u001e\n\u001e\f\u001e\u011a\t\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0128\b\u001f"+
		"\u0001\u001f\u0000\u0000 \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>\u0000\u0004\u0001"+
		"\u0000\t\n\u0001\u0000\u001c!\u0001\u0000\"$\u0001\u0000%(\u0130\u0000"+
		"@\u0001\u0000\u0000\u0000\u0002J\u0001\u0000\u0000\u0000\u0004M\u0001"+
		"\u0000\u0000\u0000\u0006S\u0001\u0000\u0000\u0000\bX\u0001\u0000\u0000"+
		"\u0000\n[\u0001\u0000\u0000\u0000\fg\u0001\u0000\u0000\u0000\u000eq\u0001"+
		"\u0000\u0000\u0000\u0010u\u0001\u0000\u0000\u0000\u0012\u0085\u0001\u0000"+
		"\u0000\u0000\u0014\u0087\u0001\u0000\u0000\u0000\u0016\u009b\u0001\u0000"+
		"\u0000\u0000\u0018\u00a5\u0001\u0000\u0000\u0000\u001a\u00a7\u0001\u0000"+
		"\u0000\u0000\u001c\u00aa\u0001\u0000\u0000\u0000\u001e\u00ae\u0001\u0000"+
		"\u0000\u0000 \u00b3\u0001\u0000\u0000\u0000\"\u00ba\u0001\u0000\u0000"+
		"\u0000$\u00bd\u0001\u0000\u0000\u0000&\u00c0\u0001\u0000\u0000\u0000("+
		"\u00cc\u0001\u0000\u0000\u0000*\u00db\u0001\u0000\u0000\u0000,\u00e0\u0001"+
		"\u0000\u0000\u0000.\u00e3\u0001\u0000\u0000\u00000\u00e8\u0001\u0000\u0000"+
		"\u00002\u00ee\u0001\u0000\u0000\u00004\u00f2\u0001\u0000\u0000\u00006"+
		"\u00fd\u0001\u0000\u0000\u00008\u0103\u0001\u0000\u0000\u0000:\u0109\u0001"+
		"\u0000\u0000\u0000<\u0113\u0001\u0000\u0000\u0000>\u0127\u0001\u0000\u0000"+
		"\u0000@A\u0005\u0001\u0000\u0000AE\u0005,\u0000\u0000BD\u0003\u0012\t"+
		"\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000HI\u0003\f\u0006\u0000I\u0001\u0001\u0000\u0000\u0000"+
		"JK\u0003\u000e\u0007\u0000KL\u0005,\u0000\u0000L\u0003\u0001\u0000\u0000"+
		"\u0000MN\u0003\u0002\u0001\u0000NO\u0005\u0005\u0000\u0000O\u0005\u0001"+
		"\u0000\u0000\u0000PR\u0003\u0004\u0002\u0000QP\u0001\u0000\u0000\u0000"+
		"RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0003\u0002"+
		"\u0001\u0000W\u0007\u0001\u0000\u0000\u0000XY\u0005\u0006\u0000\u0000"+
		"YZ\u0003\u000e\u0007\u0000Z\t\u0001\u0000\u0000\u0000[\\\u0005\u0002\u0000"+
		"\u0000\\]\u0005,\u0000\u0000]_\u0005\u0003\u0000\u0000^`\u0003\u0006\u0003"+
		"\u0000_^\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000ac\u0005\u0004\u0000\u0000bd\u0003\b\u0004\u0000cb\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0003"+
		"\f\u0006\u0000f\u000b\u0001\u0000\u0000\u0000gk\u0005\u0007\u0000\u0000"+
		"hj\u0003\u0012\t\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000no\u0003\u0016\u000b\u0000op\u0005\b\u0000"+
		"\u0000p\r\u0001\u0000\u0000\u0000qs\u0007\u0000\u0000\u0000rt\u0005\u000b"+
		"\u0000\u0000sr\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t\u000f"+
		"\u0001\u0000\u0000\u0000uv\u0005,\u0000\u0000vw\u0005\u0005\u0000\u0000"+
		"w\u0011\u0001\u0000\u0000\u0000x|\u0003\u000e\u0007\u0000y{\u0003\u0010"+
		"\b\u0000zy\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000\u007f\u0080\u0005,\u0000\u0000\u0080\u0081"+
		"\u0005\f\u0000\u0000\u0081\u0086\u0001\u0000\u0000\u0000\u0082\u0083\u0003"+
		"\n\u0005\u0000\u0083\u0084\u0005\f\u0000\u0000\u0084\u0086\u0001\u0000"+
		"\u0000\u0000\u0085x\u0001\u0000\u0000\u0000\u0085\u0082\u0001\u0000\u0000"+
		"\u0000\u0086\u0013\u0001\u0000\u0000\u0000\u0087\u008c\u0003\u000e\u0007"+
		"\u0000\u0088\u0089\u0005,\u0000\u0000\u0089\u008b\u0005\u0005\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0005,\u0000\u0000\u0090\u0091\u0005\f\u0000\u0000\u0091"+
		"\u0015\u0001\u0000\u0000\u0000\u0092\u009c\u0005\r\u0000\u0000\u0093\u0098"+
		"\u0003\u0018\f\u0000\u0094\u0095\u0005\f\u0000\u0000\u0095\u0097\u0003"+
		"\u0018\f\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000"+
		"\u0000\u0000\u009b\u0092\u0001\u0000\u0000\u0000\u009b\u0093\u0001\u0000"+
		"\u0000\u0000\u009c\u0017\u0001\u0000\u0000\u0000\u009d\u00a6\u0003 \u0010"+
		"\u0000\u009e\u009f\u0005\u0011\u0000\u0000\u009f\u00a6\u0003&\u0013\u0000"+
		"\u00a0\u00a6\u0003(\u0014\u0000\u00a1\u00a6\u0003.\u0017\u0000\u00a2\u00a6"+
		"\u00030\u0018\u0000\u00a3\u00a6\u00034\u001a\u0000\u00a4\u00a6\u00036"+
		"\u001b\u0000\u00a5\u009d\u0001\u0000\u0000\u0000\u00a5\u009e\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a0\u0001\u0000\u0000\u0000\u00a5\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u0019\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0005,\u0000\u0000\u00a8\u00a9\u0005\u000e\u0000"+
		"\u0000\u00a9\u001b\u0001\u0000\u0000\u0000\u00aa\u00ab\u0003\u001a\r\u0000"+
		"\u00ab\u00ac\u0003:\u001d\u0000\u00ac\u00ad\u0005\u000f\u0000\u0000\u00ad"+
		"\u001d\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u000b\u0000\u0000\u00af"+
		"\u00b0\u0003:\u001d\u0000\u00b0\u001f\u0001\u0000\u0000\u0000\u00b1\u00b4"+
		"\u0003\u001c\u000e\u0000\u00b2\u00b4\u0005,\u0000\u0000\u00b3\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b8\u0005\u0010\u0000\u0000\u00b6\u00b9\u0003"+
		"8\u001c\u0000\u00b7\u00b9\u0003\u001e\u000f\u0000\u00b8\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9!\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u00038\u001c\u0000\u00bb\u00bc\u0005\u0005\u0000\u0000"+
		"\u00bc#\u0001\u0000\u0000\u0000\u00bd\u00be\u0005,\u0000\u0000\u00be\u00bf"+
		"\u0005\u0003\u0000\u0000\u00bf%\u0001\u0000\u0000\u0000\u00c0\u00c8\u0003"+
		"$\u0012\u0000\u00c1\u00c3\u0003\"\u0011\u0000\u00c2\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c9\u00038\u001c"+
		"\u0000\u00c8\u00c4\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u0004\u0000"+
		"\u0000\u00cb\'\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u0012\u0000\u0000"+
		"\u00cd\u00ce\u00038\u001c\u0000\u00ce\u00cf\u0005\u0013\u0000\u0000\u00cf"+
		"\u00d3\u0003\u0016\u000b\u0000\u00d0\u00d2\u0003*\u0015\u0000\u00d1\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d8"+
		"\u0003,\u0016\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0005"+
		"\b\u0000\u0000\u00da)\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u0014"+
		"\u0000\u0000\u00dc\u00dd\u00038\u001c\u0000\u00dd\u00de\u0005\u0013\u0000"+
		"\u0000\u00de\u00df\u0003\u0016\u000b\u0000\u00df+\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0005\u0015\u0000\u0000\u00e1\u00e2\u0003\u0016\u000b\u0000"+
		"\u00e2-\u0001\u0000\u0000\u0000\u00e3\u00e6\u0005\u0016\u0000\u0000\u00e4"+
		"\u00e7\u0003\u001c\u000e\u0000\u00e5\u00e7\u0005,\u0000\u0000\u00e6\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7/\u0001"+
		"\u0000\u0000\u0000\u00e8\u00ea\u0005\u0017\u0000\u0000\u00e9\u00eb\u0003"+
		"8\u001c\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000"+
		"\u0000\u0000\u00eb1\u0001\u0000\u0000\u0000\u00ec\u00ef\u0005.\u0000\u0000"+
		"\u00ed\u00ef\u00038\u001c\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0005\u0019\u0000\u0000\u00f13\u0001\u0000\u0000\u0000\u00f2\u00f6"+
		"\u0005\u0018\u0000\u0000\u00f3\u00f5\u00032\u0019\u0000\u00f4\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00fb\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fc\u0005"+
		".\u0000\u0000\u00fa\u00fc\u00038\u001c\u0000\u00fb\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc5\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0005\u001a\u0000\u0000\u00fe\u00ff\u00038\u001c\u0000\u00ff"+
		"\u0100\u0005\u001b\u0000\u0000\u0100\u0101\u0003\u0016\u000b\u0000\u0101"+
		"\u0102\u0005\b\u0000\u0000\u01027\u0001\u0000\u0000\u0000\u0103\u0106"+
		"\u0003:\u001d\u0000\u0104\u0105\u0007\u0001\u0000\u0000\u0105\u0107\u0003"+
		":\u001d\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000"+
		"\u0000\u0000\u01079\u0001\u0000\u0000\u0000\u0108\u010a\u0005\"\u0000"+
		"\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u0110\u0003<\u001e\u0000"+
		"\u010c\u010d\u0007\u0002\u0000\u0000\u010d\u010f\u0003<\u001e\u0000\u010e"+
		"\u010c\u0001\u0000\u0000\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110"+
		"\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111"+
		";\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0118"+
		"\u0003>\u001f\u0000\u0114\u0115\u0007\u0003\u0000\u0000\u0115\u0117\u0003"+
		">\u001f\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000"+
		"\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000"+
		"\u0000\u0000\u0119=\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000"+
		"\u0000\u011b\u0128\u0003\u001c\u000e\u0000\u011c\u0128\u0003&\u0013\u0000"+
		"\u011d\u0128\u0005,\u0000\u0000\u011e\u011f\u0005\u0003\u0000\u0000\u011f"+
		"\u0120\u00038\u001c\u0000\u0120\u0121\u0005\u0004\u0000\u0000\u0121\u0128"+
		"\u0001\u0000\u0000\u0000\u0122\u0128\u0005-\u0000\u0000\u0123\u0124\u0005"+
		")\u0000\u0000\u0124\u0128\u0003>\u001f\u0000\u0125\u0128\u0005*\u0000"+
		"\u0000\u0126\u0128\u0005+\u0000\u0000\u0127\u011b\u0001\u0000\u0000\u0000"+
		"\u0127\u011c\u0001\u0000\u0000\u0000\u0127\u011d\u0001\u0000\u0000\u0000"+
		"\u0127\u011e\u0001\u0000\u0000\u0000\u0127\u0122\u0001\u0000\u0000\u0000"+
		"\u0127\u0123\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000"+
		"\u0127\u0126\u0001\u0000\u0000\u0000\u0128?\u0001\u0000\u0000\u0000\u001c"+
		"ES_cks|\u0085\u008c\u0098\u009b\u00a5\u00b3\u00b8\u00c4\u00c8\u00d3\u00d7"+
		"\u00e6\u00ea\u00ee\u00f6\u00fb\u0106\u0109\u0110\u0118\u0127";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}