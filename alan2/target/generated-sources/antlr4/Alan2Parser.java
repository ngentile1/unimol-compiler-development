// Generated from Alan2.g4 by ANTLR 4.13.2

package it.unimol.alan2;

import it.unimol.alan2.TooLongIDException;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Alan2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

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
		RULE_source = 0, RULE_param = 1, RULE_params = 2, RULE_return_type = 3, 
		RULE_funcdef = 4, RULE_body = 5, RULE_native_type = 6, RULE_type = 7, 
		RULE_def = 8, RULE_vardef = 9, RULE_statements = 10, RULE_statement = 11, 
		RULE_array_access = 12, RULE_left_operand = 13, RULE_array_simple = 14, 
		RULE_right_operand = 15, RULE_assign = 16, RULE_function_call = 17, RULE_call = 18, 
		RULE_condition = 19, RULE_if = 20, RULE_elsif = 21, RULE_else = 22, RULE_input = 23, 
		RULE_leave = 24, RULE_output = 25, RULE_while = 26, RULE_eq_op = 27, RULE_eq_cmp_simples = 28, 
		RULE_diseq_op = 29, RULE_diseq_cmp_simples = 30, RULE_cmp_simples = 31, 
		RULE_expr = 32, RULE_simple_tail = 33, RULE_simple_or_tail = 34, RULE_simple_alg_op = 35, 
		RULE_simple_alg_tail = 36, RULE_simple = 37, RULE_term_and_tail = 38, 
		RULE_term_alg_op = 39, RULE_term_alg_tail = 40, RULE_term_tail = 41, RULE_term = 42, 
		RULE_par_expr = 43, RULE_negate_factor = 44, RULE_id = 45, RULE_num = 46, 
		RULE_bool_const = 47, RULE_factor = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"source", "param", "params", "return_type", "funcdef", "body", "native_type", 
			"type", "def", "vardef", "statements", "statement", "array_access", "left_operand", 
			"array_simple", "right_operand", "assign", "function_call", "call", "condition", 
			"if", "elsif", "else", "input", "leave", "output", "while", "eq_op", 
			"eq_cmp_simples", "diseq_op", "diseq_cmp_simples", "cmp_simples", "expr", 
			"simple_tail", "simple_or_tail", "simple_alg_op", "simple_alg_tail", 
			"simple", "term_and_tail", "term_alg_op", "term_alg_tail", "term_tail", 
			"term", "par_expr", "negate_factor", "id", "num", "bool_const", "factor"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(SOURCE);
			setState(99);
			match(ID);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1540L) != 0)) {
				{
				{
				setState(100);
				def();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			type();
			setState(109);
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
	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Alan2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Alan2Parser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(111);
			param();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(112);
				match(COMMA);
				setState(113);
				param();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class Return_typeContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(Alan2Parser.TO, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitReturn_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_return_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(119);
			match(TO);
			setState(120);
			type();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterFuncdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitFuncdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitFuncdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(FUNCTION);
			setState(123);
			match(ID);
			setState(124);
			match(OPENPAR);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOL || _la==INT) {
				{
				setState(125);
				params();
				}
			}

			setState(128);
			match(CLOSEPAR);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(129);
				return_type();
				}
			}

			setState(132);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(BEGIN);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1540L) != 0)) {
				{
				{
				setState(135);
				def();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			statements();
			setState(142);
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
	public static class Native_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(Alan2Parser.INT, 0); }
		public TerminalNode BOOL() { return getToken(Alan2Parser.BOOL, 0); }
		public Native_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterNative_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitNative_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitNative_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Native_typeContext native_type() throws RecognitionException {
		Native_typeContext _localctx = new Native_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_native_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !(_la==BOOL || _la==INT) ) {
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
	public static class TypeContext extends ParserRuleContext {
		public Native_typeContext native_type() {
			return getRuleContext(Native_typeContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(Alan2Parser.ARRAY, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			native_type();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY) {
				{
				setState(147);
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
	public static class DefContext extends ParserRuleContext {
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Alan2Parser.SEMI, 0); }
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_def);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				vardef();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				funcdef();
				setState(152);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterVardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitVardef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitVardef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_vardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			type();
			setState(157);
			match(ID);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(158);
				match(COMMA);
				setState(159);
				match(ID);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statements);
		int _la;
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELAX:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
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
				setState(168);
				statement();
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(169);
					match(SEMI);
					setState(170);
					statement();
					}
					}
					setState(175);
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
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				assign();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				call();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				if_();
				}
				break;
			case GET:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				input();
				}
				break;
			case LEAVE:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				leave();
				}
				break;
			case PUT:
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				output();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
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
	public static class Array_accessContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Alan2Parser.ID, 0); }
		public TerminalNode OPENBRA() { return getToken(Alan2Parser.OPENBRA, 0); }
		public SimpleContext simple() {
			return getRuleContext(SimpleContext.class,0);
		}
		public TerminalNode CLOSEBRA() { return getToken(Alan2Parser.CLOSEBRA, 0); }
		public Array_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterArray_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitArray_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitArray_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_accessContext array_access() throws RecognitionException {
		Array_accessContext _localctx = new Array_accessContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_array_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(ID);
			setState(188);
			match(OPENBRA);
			setState(189);
			simple();
			setState(190);
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
	public static class Left_operandContext extends ParserRuleContext {
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Left_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterLeft_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitLeft_operand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitLeft_operand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_operandContext left_operand() throws RecognitionException {
		Left_operandContext _localctx = new Left_operandContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_left_operand);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				array_access();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				id();
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
	public static class Array_simpleContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(Alan2Parser.ARRAY, 0); }
		public SimpleContext simple() {
			return getRuleContext(SimpleContext.class,0);
		}
		public Array_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterArray_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitArray_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitArray_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_simpleContext array_simple() throws RecognitionException {
		Array_simpleContext _localctx = new Array_simpleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_array_simple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(ARRAY);
			setState(197);
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
	public static class Right_operandContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Array_simpleContext array_simple() {
			return getRuleContext(Array_simpleContext.class,0);
		}
		public Right_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterRight_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitRight_operand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitRight_operand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_operandContext right_operand() throws RecognitionException {
		Right_operandContext _localctx = new Right_operandContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_right_operand);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENPAR:
			case MINUS:
			case NOT:
			case TRUE:
			case FALSE:
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				expr();
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				array_simple();
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
	public static class AssignContext extends ParserRuleContext {
		public Left_operandContext left_operand() {
			return getRuleContext(Left_operandContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(Alan2Parser.ASSIGNMENT, 0); }
		public Right_operandContext right_operand() {
			return getRuleContext(Right_operandContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			left_operand();
			setState(204);
			match(ASSIGNMENT);
			setState(205);
			right_operand();
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
		public TerminalNode ID() { return getToken(Alan2Parser.ID, 0); }
		public TerminalNode OPENPAR() { return getToken(Alan2Parser.OPENPAR, 0); }
		public TerminalNode CLOSEPAR() { return getToken(Alan2Parser.CLOSEPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Alan2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Alan2Parser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(ID);
			setState(208);
			match(OPENPAR);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68186900791304L) != 0)) {
				{
				setState(209);
				expr();
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(210);
					match(COMMA);
					setState(211);
					expr();
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(219);
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
	public static class CallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(Alan2Parser.CALL, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(CALL);
			setState(222);
			function_call();
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
	public static class ConditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			expr();
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(IF);
			setState(227);
			condition();
			setState(228);
			match(THEN);
			setState(229);
			statements();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(230);
				elsif();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(236);
				else_();
				}
			}

			setState(239);
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(Alan2Parser.THEN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ElsifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterElsif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitElsif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitElsif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsifContext elsif() throws RecognitionException {
		ElsifContext _localctx = new ElsifContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elsif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(ELSIF);
			setState(242);
			condition();
			setState(243);
			match(THEN);
			setState(244);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(ELSE);
			setState(247);
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
		public Left_operandContext left_operand() {
			return getRuleContext(Left_operandContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(GET);
			setState(250);
			left_operand();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterLeave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitLeave(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitLeave(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeaveContext leave() throws RecognitionException {
		LeaveContext _localctx = new LeaveContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_leave);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(LEAVE);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68186900791304L) != 0)) {
				{
				setState(253);
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
	public static class OutputContext extends ParserRuleContext {
		public TerminalNode PUT() { return getToken(Alan2Parser.PUT, 0); }
		public List<TerminalNode> STRING() { return getTokens(Alan2Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(Alan2Parser.STRING, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(Alan2Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Alan2Parser.DOT, i);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(PUT);
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(257);
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
				setState(258);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(261);
				match(DOT);
				setState(264);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(262);
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
					setState(263);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(270);
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
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Alan2Parser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(WHILE);
			setState(272);
			condition();
			setState(273);
			match(DO);
			setState(274);
			statements();
			setState(275);
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
	public static class Eq_opContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(Alan2Parser.EQ, 0); }
		public TerminalNode NE() { return getToken(Alan2Parser.NE, 0); }
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterEq_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitEq_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitEq_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !(_la==EQ || _la==NE) ) {
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
	public static class Eq_cmp_simplesContext extends ParserRuleContext {
		public List<SimpleContext> simple() {
			return getRuleContexts(SimpleContext.class);
		}
		public SimpleContext simple(int i) {
			return getRuleContext(SimpleContext.class,i);
		}
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public Eq_cmp_simplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_cmp_simples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterEq_cmp_simples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitEq_cmp_simples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitEq_cmp_simples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_cmp_simplesContext eq_cmp_simples() throws RecognitionException {
		Eq_cmp_simplesContext _localctx = new Eq_cmp_simplesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_eq_cmp_simples);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			simple();
			setState(280);
			eq_op();
			setState(281);
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
	public static class Diseq_opContext extends ParserRuleContext {
		public TerminalNode GE() { return getToken(Alan2Parser.GE, 0); }
		public TerminalNode GT() { return getToken(Alan2Parser.GT, 0); }
		public TerminalNode LE() { return getToken(Alan2Parser.LE, 0); }
		public TerminalNode LT() { return getToken(Alan2Parser.LT, 0); }
		public Diseq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diseq_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterDiseq_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitDiseq_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitDiseq_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Diseq_opContext diseq_op() throws RecognitionException {
		Diseq_opContext _localctx = new Diseq_opContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_diseq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8053063680L) != 0)) ) {
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
	public static class Diseq_cmp_simplesContext extends ParserRuleContext {
		public List<SimpleContext> simple() {
			return getRuleContexts(SimpleContext.class);
		}
		public SimpleContext simple(int i) {
			return getRuleContext(SimpleContext.class,i);
		}
		public Diseq_opContext diseq_op() {
			return getRuleContext(Diseq_opContext.class,0);
		}
		public Diseq_cmp_simplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diseq_cmp_simples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterDiseq_cmp_simples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitDiseq_cmp_simples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitDiseq_cmp_simples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Diseq_cmp_simplesContext diseq_cmp_simples() throws RecognitionException {
		Diseq_cmp_simplesContext _localctx = new Diseq_cmp_simplesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_diseq_cmp_simples);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			simple();
			setState(286);
			diseq_op();
			setState(287);
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
	public static class Cmp_simplesContext extends ParserRuleContext {
		public Eq_cmp_simplesContext eq_cmp_simples() {
			return getRuleContext(Eq_cmp_simplesContext.class,0);
		}
		public Diseq_cmp_simplesContext diseq_cmp_simples() {
			return getRuleContext(Diseq_cmp_simplesContext.class,0);
		}
		public Cmp_simplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_simples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterCmp_simples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitCmp_simples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitCmp_simples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmp_simplesContext cmp_simples() throws RecognitionException {
		Cmp_simplesContext _localctx = new Cmp_simplesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_cmp_simples);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				eq_cmp_simples();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				diseq_cmp_simples();
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
	public static class ExprContext extends ParserRuleContext {
		public SimpleContext simple() {
			return getRuleContext(SimpleContext.class,0);
		}
		public Cmp_simplesContext cmp_simples() {
			return getRuleContext(Cmp_simplesContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expr);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				cmp_simples();
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
	public static class Simple_tailContext extends ParserRuleContext {
		public Simple_or_tailContext simple_or_tail() {
			return getRuleContext(Simple_or_tailContext.class,0);
		}
		public Simple_alg_tailContext simple_alg_tail() {
			return getRuleContext(Simple_alg_tailContext.class,0);
		}
		public Simple_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterSimple_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitSimple_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitSimple_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_tailContext simple_tail() throws RecognitionException {
		Simple_tailContext _localctx = new Simple_tailContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_simple_tail);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				simple_or_tail();
				}
				break;
			case MINUS:
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				simple_alg_tail();
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
	public static class Simple_or_tailContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(Alan2Parser.OR, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Simple_or_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_or_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterSimple_or_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitSimple_or_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitSimple_or_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_or_tailContext simple_or_tail() throws RecognitionException {
		Simple_or_tailContext _localctx = new Simple_or_tailContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_simple_or_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(OR);
			setState(302);
			term();
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
	public static class Simple_alg_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(Alan2Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Alan2Parser.MINUS, 0); }
		public Simple_alg_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_alg_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterSimple_alg_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitSimple_alg_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitSimple_alg_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_alg_opContext simple_alg_op() throws RecognitionException {
		Simple_alg_opContext _localctx = new Simple_alg_opContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_simple_alg_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==PLUS) ) {
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
	public static class Simple_alg_tailContext extends ParserRuleContext {
		public Simple_alg_opContext simple_alg_op() {
			return getRuleContext(Simple_alg_opContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Simple_alg_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_alg_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterSimple_alg_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitSimple_alg_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitSimple_alg_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_alg_tailContext simple_alg_tail() throws RecognitionException {
		Simple_alg_tailContext _localctx = new Simple_alg_tailContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_simple_alg_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			simple_alg_op();
			setState(307);
			term();
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(Alan2Parser.MINUS, 0); }
		public List<Simple_tailContext> simple_tail() {
			return getRuleContexts(Simple_tailContext.class);
		}
		public Simple_tailContext simple_tail(int i) {
			return getRuleContext(Simple_tailContext.class,i);
		}
		public SimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleContext simple() throws RecognitionException {
		SimpleContext _localctx = new SimpleContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(309);
				match(MINUS);
				}
			}

			setState(312);
			term();
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) {
				{
				{
				setState(313);
				simple_tail();
				}
				}
				setState(318);
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
	public static class Term_and_tailContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(Alan2Parser.AND, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Term_and_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_and_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterTerm_and_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitTerm_and_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitTerm_and_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_and_tailContext term_and_tail() throws RecognitionException {
		Term_and_tailContext _localctx = new Term_and_tailContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_term_and_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(AND);
			setState(320);
			factor();
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
	public static class Term_alg_opContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(Alan2Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(Alan2Parser.DIV, 0); }
		public TerminalNode REM() { return getToken(Alan2Parser.REM, 0); }
		public Term_alg_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_alg_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterTerm_alg_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitTerm_alg_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitTerm_alg_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_alg_opContext term_alg_op() throws RecognitionException {
		Term_alg_opContext _localctx = new Term_alg_opContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_term_alg_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1924145348608L) != 0)) ) {
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
	public static class Term_alg_tailContext extends ParserRuleContext {
		public Term_alg_opContext term_alg_op() {
			return getRuleContext(Term_alg_opContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Term_alg_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_alg_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterTerm_alg_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitTerm_alg_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitTerm_alg_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_alg_tailContext term_alg_tail() throws RecognitionException {
		Term_alg_tailContext _localctx = new Term_alg_tailContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_term_alg_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			term_alg_op();
			setState(325);
			factor();
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
	public static class Term_tailContext extends ParserRuleContext {
		public Term_and_tailContext term_and_tail() {
			return getRuleContext(Term_and_tailContext.class,0);
		}
		public Term_alg_tailContext term_alg_tail() {
			return getRuleContext(Term_alg_tailContext.class,0);
		}
		public Term_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterTerm_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitTerm_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitTerm_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_tailContext term_tail() throws RecognitionException {
		Term_tailContext _localctx = new Term_tailContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_term_tail);
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				term_and_tail();
				}
				break;
			case DIV:
			case MUL:
			case REM:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				term_alg_tail();
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
	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<Term_tailContext> term_tail() {
			return getRuleContexts(Term_tailContext.class);
		}
		public Term_tailContext term_tail(int i) {
			return getRuleContext(Term_tailContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			factor();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2061584302080L) != 0)) {
				{
				{
				setState(332);
				term_tail();
				}
				}
				setState(337);
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
	public static class Par_exprContext extends ParserRuleContext {
		public TerminalNode OPENPAR() { return getToken(Alan2Parser.OPENPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSEPAR() { return getToken(Alan2Parser.CLOSEPAR, 0); }
		public Par_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_par_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterPar_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitPar_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitPar_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Par_exprContext par_expr() throws RecognitionException {
		Par_exprContext _localctx = new Par_exprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_par_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(OPENPAR);
			setState(339);
			expr();
			setState(340);
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
	public static class Negate_factorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(Alan2Parser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Negate_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negate_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterNegate_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitNegate_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitNegate_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Negate_factorContext negate_factor() throws RecognitionException {
		Negate_factorContext _localctx = new Negate_factorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_negate_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(NOT);
			setState(343);
			factor();
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
	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Alan2Parser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
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
	public static class NumContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(Alan2Parser.NUM, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(NUM);
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
	public static class Bool_constContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(Alan2Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Alan2Parser.FALSE, 0); }
		public Bool_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterBool_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitBool_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitBool_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_constContext bool_const() throws RecognitionException {
		Bool_constContext _localctx = new Bool_constContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_bool_const);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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
	public static class FactorContext extends ParserRuleContext {
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Par_exprContext par_expr() {
			return getRuleContext(Par_exprContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public Negate_factorContext negate_factor() {
			return getRuleContext(Negate_factorContext.class,0);
		}
		public Bool_constContext bool_const() {
			return getRuleContext(Bool_constContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Alan2Listener ) ((Alan2Listener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Alan2Visitor ) return ((Alan2Visitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_factor);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				array_access();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				function_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				id();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				par_expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(355);
				num();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(356);
				negate_factor();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(357);
				bool_const();
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
		"\u0004\u00010\u0169\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000f\b\u0000\n\u0000\f\u0000i\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002s\b\u0002\n\u0002\f\u0002v\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u007f\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0083\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005\u0089"+
		"\b\u0005\n\u0005\f\u0005\u008c\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u0095\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u009b\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u00a1\b\t\n\t\f\t\u00a4\t\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0005\n\u00ac\b\n\n\n\f\n\u00af\t\n\u0003\n\u00b1"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00ba\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0003\r\u00c3\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00ca\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u00d5\b\u0011\n\u0011\f\u0011\u00d8\t\u0011"+
		"\u0003\u0011\u00da\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u00e8\b\u0014\n\u0014\f\u0014\u00eb"+
		"\t\u0014\u0001\u0014\u0003\u0014\u00ee\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u00ff\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0104\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0109\b\u0019\u0005\u0019\u010b\b\u0019\n\u0019\f\u0019\u010e\t\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u0124\b\u001f\u0001 \u0001 \u0003"+
		" \u0128\b \u0001!\u0001!\u0003!\u012c\b!\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0001%\u0003%\u0137\b%\u0001%\u0001%\u0005"+
		"%\u013b\b%\n%\f%\u013e\t%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001("+
		"\u0001(\u0001(\u0001)\u0001)\u0003)\u014a\b)\u0001*\u0001*\u0005*\u014e"+
		"\b*\n*\f*\u0151\t*\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001"+
		"-\u0001-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00030\u0167\b0\u00010\u0000\u00001\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`\u0000\u0006\u0001\u0000\t\n\u0002\u0000"+
		"\u001c\u001c!!\u0001\u0000\u001d \u0001\u0000\"#\u0001\u0000&(\u0001\u0000"+
		"*+\u015e\u0000b\u0001\u0000\u0000\u0000\u0002l\u0001\u0000\u0000\u0000"+
		"\u0004o\u0001\u0000\u0000\u0000\u0006w\u0001\u0000\u0000\u0000\bz\u0001"+
		"\u0000\u0000\u0000\n\u0086\u0001\u0000\u0000\u0000\f\u0090\u0001\u0000"+
		"\u0000\u0000\u000e\u0092\u0001\u0000\u0000\u0000\u0010\u009a\u0001\u0000"+
		"\u0000\u0000\u0012\u009c\u0001\u0000\u0000\u0000\u0014\u00b0\u0001\u0000"+
		"\u0000\u0000\u0016\u00b9\u0001\u0000\u0000\u0000\u0018\u00bb\u0001\u0000"+
		"\u0000\u0000\u001a\u00c2\u0001\u0000\u0000\u0000\u001c\u00c4\u0001\u0000"+
		"\u0000\u0000\u001e\u00c9\u0001\u0000\u0000\u0000 \u00cb\u0001\u0000\u0000"+
		"\u0000\"\u00cf\u0001\u0000\u0000\u0000$\u00dd\u0001\u0000\u0000\u0000"+
		"&\u00e0\u0001\u0000\u0000\u0000(\u00e2\u0001\u0000\u0000\u0000*\u00f1"+
		"\u0001\u0000\u0000\u0000,\u00f6\u0001\u0000\u0000\u0000.\u00f9\u0001\u0000"+
		"\u0000\u00000\u00fc\u0001\u0000\u0000\u00002\u0100\u0001\u0000\u0000\u0000"+
		"4\u010f\u0001\u0000\u0000\u00006\u0115\u0001\u0000\u0000\u00008\u0117"+
		"\u0001\u0000\u0000\u0000:\u011b\u0001\u0000\u0000\u0000<\u011d\u0001\u0000"+
		"\u0000\u0000>\u0123\u0001\u0000\u0000\u0000@\u0127\u0001\u0000\u0000\u0000"+
		"B\u012b\u0001\u0000\u0000\u0000D\u012d\u0001\u0000\u0000\u0000F\u0130"+
		"\u0001\u0000\u0000\u0000H\u0132\u0001\u0000\u0000\u0000J\u0136\u0001\u0000"+
		"\u0000\u0000L\u013f\u0001\u0000\u0000\u0000N\u0142\u0001\u0000\u0000\u0000"+
		"P\u0144\u0001\u0000\u0000\u0000R\u0149\u0001\u0000\u0000\u0000T\u014b"+
		"\u0001\u0000\u0000\u0000V\u0152\u0001\u0000\u0000\u0000X\u0156\u0001\u0000"+
		"\u0000\u0000Z\u0159\u0001\u0000\u0000\u0000\\\u015b\u0001\u0000\u0000"+
		"\u0000^\u015d\u0001\u0000\u0000\u0000`\u0166\u0001\u0000\u0000\u0000b"+
		"c\u0005\u0001\u0000\u0000cg\u0005,\u0000\u0000df\u0003\u0010\b\u0000e"+
		"d\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000jk\u0003\n\u0005\u0000k\u0001\u0001\u0000\u0000\u0000lm\u0003"+
		"\u000e\u0007\u0000mn\u0005,\u0000\u0000n\u0003\u0001\u0000\u0000\u0000"+
		"ot\u0003\u0002\u0001\u0000pq\u0005\u0005\u0000\u0000qs\u0003\u0002\u0001"+
		"\u0000rp\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000u\u0005\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000wx\u0005\u0006\u0000\u0000xy\u0003\u000e\u0007"+
		"\u0000y\u0007\u0001\u0000\u0000\u0000z{\u0005\u0002\u0000\u0000{|\u0005"+
		",\u0000\u0000|~\u0005\u0003\u0000\u0000}\u007f\u0003\u0004\u0002\u0000"+
		"~}\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0082\u0005\u0004\u0000\u0000\u0081\u0083"+
		"\u0003\u0006\u0003\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0003\n\u0005\u0000\u0085\t\u0001\u0000\u0000\u0000\u0086\u008a\u0005"+
		"\u0007\u0000\u0000\u0087\u0089\u0003\u0010\b\u0000\u0088\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000"+
		"\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008e\u0003\u0014"+
		"\n\u0000\u008e\u008f\u0005\b\u0000\u0000\u008f\u000b\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0007\u0000\u0000\u0000\u0091\r\u0001\u0000\u0000\u0000"+
		"\u0092\u0094\u0003\f\u0006\u0000\u0093\u0095\u0005\u000b\u0000\u0000\u0094"+
		"\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\u000f\u0001\u0000\u0000\u0000\u0096\u009b\u0003\u0012\t\u0000\u0097\u0098"+
		"\u0003\b\u0004\u0000\u0098\u0099\u0005\f\u0000\u0000\u0099\u009b\u0001"+
		"\u0000\u0000\u0000\u009a\u0096\u0001\u0000\u0000\u0000\u009a\u0097\u0001"+
		"\u0000\u0000\u0000\u009b\u0011\u0001\u0000\u0000\u0000\u009c\u009d\u0003"+
		"\u000e\u0007\u0000\u009d\u00a2\u0005,\u0000\u0000\u009e\u009f\u0005\u0005"+
		"\u0000\u0000\u009f\u00a1\u0005,\u0000\u0000\u00a0\u009e\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\f\u0000\u0000"+
		"\u00a6\u0013\u0001\u0000\u0000\u0000\u00a7\u00b1\u0005\r\u0000\u0000\u00a8"+
		"\u00ad\u0003\u0016\u000b\u0000\u00a9\u00aa\u0005\f\u0000\u0000\u00aa\u00ac"+
		"\u0003\u0016\u000b\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00af"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b0\u00a7\u0001\u0000\u0000\u0000\u00b0\u00a8"+
		"\u0001\u0000\u0000\u0000\u00b1\u0015\u0001\u0000\u0000\u0000\u00b2\u00ba"+
		"\u0003 \u0010\u0000\u00b3\u00ba\u0003$\u0012\u0000\u00b4\u00ba\u0003("+
		"\u0014\u0000\u00b5\u00ba\u0003.\u0017\u0000\u00b6\u00ba\u00030\u0018\u0000"+
		"\u00b7\u00ba\u00032\u0019\u0000\u00b8\u00ba\u00034\u001a\u0000\u00b9\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b3\u0001\u0000\u0000\u0000\u00b9\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b5\u0001\u0000\u0000\u0000\u00b9\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00b8"+
		"\u0001\u0000\u0000\u0000\u00ba\u0017\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0005,\u0000\u0000\u00bc\u00bd\u0005\u000e\u0000\u0000\u00bd\u00be\u0003"+
		"J%\u0000\u00be\u00bf\u0005\u000f\u0000\u0000\u00bf\u0019\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c3\u0003\u0018\f\u0000\u00c1\u00c3\u0003Z-\u0000\u00c2"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3"+
		"\u001b\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u000b\u0000\u0000\u00c5"+
		"\u00c6\u0003J%\u0000\u00c6\u001d\u0001\u0000\u0000\u0000\u00c7\u00ca\u0003"+
		"@ \u0000\u00c8\u00ca\u0003\u001c\u000e\u0000\u00c9\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca\u001f\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0003\u001a\r\u0000\u00cc\u00cd\u0005\u0010\u0000\u0000"+
		"\u00cd\u00ce\u0003\u001e\u000f\u0000\u00ce!\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0005,\u0000\u0000\u00d0\u00d9\u0005\u0003\u0000\u0000\u00d1\u00d6"+
		"\u0003@ \u0000\u00d2\u00d3\u0005\u0005\u0000\u0000\u00d3\u00d5\u0003@"+
		" \u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d9\u00d1\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u0004\u0000"+
		"\u0000\u00dc#\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u0011\u0000\u0000"+
		"\u00de\u00df\u0003\"\u0011\u0000\u00df%\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0003@ \u0000\u00e1\'\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005"+
		"\u0012\u0000\u0000\u00e3\u00e4\u0003&\u0013\u0000\u00e4\u00e5\u0005\u0013"+
		"\u0000\u0000\u00e5\u00e9\u0003\u0014\n\u0000\u00e6\u00e8\u0003*\u0015"+
		"\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ee\u0003,\u0016\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0005\b\u0000\u0000\u00f0)\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0005\u0014\u0000\u0000\u00f2\u00f3\u0003&\u0013\u0000\u00f3\u00f4"+
		"\u0005\u0013\u0000\u0000\u00f4\u00f5\u0003\u0014\n\u0000\u00f5+\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0005\u0015\u0000\u0000\u00f7\u00f8\u0003"+
		"\u0014\n\u0000\u00f8-\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u0016"+
		"\u0000\u0000\u00fa\u00fb\u0003\u001a\r\u0000\u00fb/\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fe\u0005\u0017\u0000\u0000\u00fd\u00ff\u0003@ \u0000\u00fe"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff"+
		"1\u0001\u0000\u0000\u0000\u0100\u0103\u0005\u0018\u0000\u0000\u0101\u0104"+
		"\u0005.\u0000\u0000\u0102\u0104\u0003@ \u0000\u0103\u0101\u0001\u0000"+
		"\u0000\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u010c\u0001\u0000"+
		"\u0000\u0000\u0105\u0108\u0005\u0019\u0000\u0000\u0106\u0109\u0005.\u0000"+
		"\u0000\u0107\u0109\u0003@ \u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108"+
		"\u0107\u0001\u0000\u0000\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a"+
		"\u0105\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c"+
		"\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d"+
		"3\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0005\u001a\u0000\u0000\u0110\u0111\u0003&\u0013\u0000\u0111\u0112\u0005"+
		"\u001b\u0000\u0000\u0112\u0113\u0003\u0014\n\u0000\u0113\u0114\u0005\b"+
		"\u0000\u0000\u01145\u0001\u0000\u0000\u0000\u0115\u0116\u0007\u0001\u0000"+
		"\u0000\u01167\u0001\u0000\u0000\u0000\u0117\u0118\u0003J%\u0000\u0118"+
		"\u0119\u00036\u001b\u0000\u0119\u011a\u0003J%\u0000\u011a9\u0001\u0000"+
		"\u0000\u0000\u011b\u011c\u0007\u0002\u0000\u0000\u011c;\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0003J%\u0000\u011e\u011f\u0003:\u001d\u0000\u011f"+
		"\u0120\u0003J%\u0000\u0120=\u0001\u0000\u0000\u0000\u0121\u0124\u0003"+
		"8\u001c\u0000\u0122\u0124\u0003<\u001e\u0000\u0123\u0121\u0001\u0000\u0000"+
		"\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0124?\u0001\u0000\u0000\u0000"+
		"\u0125\u0128\u0003J%\u0000\u0126\u0128\u0003>\u001f\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0128A\u0001"+
		"\u0000\u0000\u0000\u0129\u012c\u0003D\"\u0000\u012a\u012c\u0003H$\u0000"+
		"\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000"+
		"\u012cC\u0001\u0000\u0000\u0000\u012d\u012e\u0005$\u0000\u0000\u012e\u012f"+
		"\u0003T*\u0000\u012fE\u0001\u0000\u0000\u0000\u0130\u0131\u0007\u0003"+
		"\u0000\u0000\u0131G\u0001\u0000\u0000\u0000\u0132\u0133\u0003F#\u0000"+
		"\u0133\u0134\u0003T*\u0000\u0134I\u0001\u0000\u0000\u0000\u0135\u0137"+
		"\u0005\"\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0136\u0137\u0001"+
		"\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u013c\u0003"+
		"T*\u0000\u0139\u013b\u0003B!\u0000\u013a\u0139\u0001\u0000\u0000\u0000"+
		"\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000"+
		"\u013c\u013d\u0001\u0000\u0000\u0000\u013dK\u0001\u0000\u0000\u0000\u013e"+
		"\u013c\u0001\u0000\u0000\u0000\u013f\u0140\u0005%\u0000\u0000\u0140\u0141"+
		"\u0003`0\u0000\u0141M\u0001\u0000\u0000\u0000\u0142\u0143\u0007\u0004"+
		"\u0000\u0000\u0143O\u0001\u0000\u0000\u0000\u0144\u0145\u0003N\'\u0000"+
		"\u0145\u0146\u0003`0\u0000\u0146Q\u0001\u0000\u0000\u0000\u0147\u014a"+
		"\u0003L&\u0000\u0148\u014a\u0003P(\u0000\u0149\u0147\u0001\u0000\u0000"+
		"\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u014aS\u0001\u0000\u0000\u0000"+
		"\u014b\u014f\u0003`0\u0000\u014c\u014e\u0003R)\u0000\u014d\u014c\u0001"+
		"\u0000\u0000\u0000\u014e\u0151\u0001\u0000\u0000\u0000\u014f\u014d\u0001"+
		"\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150U\u0001\u0000"+
		"\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0153\u0005\u0003"+
		"\u0000\u0000\u0153\u0154\u0003@ \u0000\u0154\u0155\u0005\u0004\u0000\u0000"+
		"\u0155W\u0001\u0000\u0000\u0000\u0156\u0157\u0005)\u0000\u0000\u0157\u0158"+
		"\u0003`0\u0000\u0158Y\u0001\u0000\u0000\u0000\u0159\u015a\u0005,\u0000"+
		"\u0000\u015a[\u0001\u0000\u0000\u0000\u015b\u015c\u0005-\u0000\u0000\u015c"+
		"]\u0001\u0000\u0000\u0000\u015d\u015e\u0007\u0005\u0000\u0000\u015e_\u0001"+
		"\u0000\u0000\u0000\u015f\u0167\u0003\u0018\f\u0000\u0160\u0167\u0003\""+
		"\u0011\u0000\u0161\u0167\u0003Z-\u0000\u0162\u0167\u0003V+\u0000\u0163"+
		"\u0167\u0003\\.\u0000\u0164\u0167\u0003X,\u0000\u0165\u0167\u0003^/\u0000"+
		"\u0166\u015f\u0001\u0000\u0000\u0000\u0166\u0160\u0001\u0000\u0000\u0000"+
		"\u0166\u0161\u0001\u0000\u0000\u0000\u0166\u0162\u0001\u0000\u0000\u0000"+
		"\u0166\u0163\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000"+
		"\u0166\u0165\u0001\u0000\u0000\u0000\u0167a\u0001\u0000\u0000\u0000\u001d"+
		"gt~\u0082\u008a\u0094\u009a\u00a2\u00ad\u00b0\u00b9\u00c2\u00c9\u00d6"+
		"\u00d9\u00e9\u00ed\u00fe\u0103\u0108\u010c\u0123\u0127\u012b\u0136\u013c"+
		"\u0149\u014f\u0166";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}