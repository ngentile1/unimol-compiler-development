// Generated from /home/nik/Desktop/compiler/assign1/alan/src/main/antlr4/Alan.g4 by ANTLR 4.13.1

package it.unimol.alan;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlanParser extends Parser {
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
		RULE_source = 0, RULE_funcdef = 1, RULE_body = 2, RULE_type = 3, RULE_vardef = 4, 
		RULE_statements = 5, RULE_statement = 6, RULE_assign = 7, RULE_expr_list = 8, 
		RULE_call = 9, RULE_if = 10, RULE_elsif = 11, RULE_else = 12, RULE_input = 13, 
		RULE_leave = 14, RULE_output = 15, RULE_while = 16, RULE_expr = 17, RULE_relop = 18, 
		RULE_simple = 19, RULE_addop = 20, RULE_term = 21, RULE_mulop = 22, RULE_factor = 23, 
		RULE_factor_tail = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"source", "funcdef", "body", "type", "vardef", "statements", "statement", 
			"assign", "expr_list", "call", "if", "elsif", "else", "input", "leave", 
			"output", "while", "expr", "relop", "simple", "addop", "term", "mulop", 
			"factor", "factor_tail"
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
	public String getGrammarFileName() { return "Alan.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlanParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceContext extends ParserRuleContext {
		public TerminalNode SOURCE() { return getToken(AlanParser.SOURCE, 0); }
		public TerminalNode ID() { return getToken(AlanParser.ID, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<FuncdefContext> funcdef() {
			return getRuleContexts(FuncdefContext.class);
		}
		public FuncdefContext funcdef(int i) {
			return getRuleContext(FuncdefContext.class,i);
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
			setState(50);
			match(SOURCE);
			setState(51);
			match(ID);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(52);
				funcdef();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
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
	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(AlanParser.FUNCTION, 0); }
		public List<TerminalNode> ID() { return getTokens(AlanParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AlanParser.ID, i);
		}
		public TerminalNode OPENPAR() { return getToken(AlanParser.OPENPAR, 0); }
		public TerminalNode CLOSEPAR() { return getToken(AlanParser.CLOSEPAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode TO() { return getToken(AlanParser.TO, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AlanParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AlanParser.COMMA, i);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(FUNCTION);
			setState(61);
			match(ID);
			setState(62);
			match(OPENPAR);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOL || _la==INT) {
				{
				setState(63);
				type();
				setState(64);
				match(ID);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(65);
					match(COMMA);
					setState(66);
					type();
					setState(67);
					match(ID);
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(76);
			match(CLOSEPAR);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(77);
				match(TO);
				setState(78);
				type();
				}
			}

			setState(81);
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
		public TerminalNode BEGIN() { return getToken(AlanParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(AlanParser.END, 0); }
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(BEGIN);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOL || _la==INT) {
				{
				{
				setState(84);
				vardef();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			statements();
			setState(91);
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
		public TerminalNode BOOL() { return getToken(AlanParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(AlanParser.INT, 0); }
		public TerminalNode ARRAY() { return getToken(AlanParser.ARRAY, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !(_la==BOOL || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY) {
				{
				setState(94);
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
	public static class VardefContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AlanParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AlanParser.ID, i);
		}
		public TerminalNode SEMI() { return getToken(AlanParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AlanParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AlanParser.COMMA, i);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			type();
			setState(98);
			match(ID);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(99);
				match(COMMA);
				setState(100);
				match(ID);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
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
		public TerminalNode RELAX() { return getToken(AlanParser.RELAX, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(AlanParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AlanParser.SEMI, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statements);
		int _la;
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELAX:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
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
				setState(109);
				statement();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(110);
					match(SEMI);
					setState(111);
					statement();
					}
					}
					setState(116);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				assign();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				call();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				if_();
				}
				break;
			case GET:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				input();
				}
				break;
			case LEAVE:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				leave();
				}
				break;
			case PUT:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				output();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
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
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AlanParser.ID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(AlanParser.ASSIGNMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(AlanParser.ARRAY, 0); }
		public List<SimpleContext> simple() {
			return getRuleContexts(SimpleContext.class);
		}
		public SimpleContext simple(int i) {
			return getRuleContext(SimpleContext.class,i);
		}
		public TerminalNode OPENBRA() { return getToken(AlanParser.OPENBRA, 0); }
		public TerminalNode CLOSEBRA() { return getToken(AlanParser.CLOSEBRA, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(ID);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPENBRA) {
				{
				setState(129);
				match(OPENBRA);
				setState(130);
				simple();
				setState(131);
				match(CLOSEBRA);
				}
			}

			setState(135);
			match(ASSIGNMENT);
			setState(139);
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
				setState(136);
				expr();
				}
				break;
			case ARRAY:
				{
				setState(137);
				match(ARRAY);
				setState(138);
				simple();
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
	public static class Expr_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AlanParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AlanParser.COMMA, i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			expr();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(142);
				match(COMMA);
				setState(143);
				expr();
				}
				}
				setState(148);
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
	public static class CallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(AlanParser.CALL, 0); }
		public TerminalNode ID() { return getToken(AlanParser.ID, 0); }
		public TerminalNode OPENPAR() { return getToken(AlanParser.OPENPAR, 0); }
		public TerminalNode CLOSEPAR() { return getToken(AlanParser.CLOSEPAR, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(CALL);
			setState(150);
			match(ID);
			setState(151);
			match(OPENPAR);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68186900791304L) != 0)) {
				{
				setState(152);
				expr_list();
				}
			}

			setState(155);
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
		public TerminalNode IF() { return getToken(AlanParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(AlanParser.THEN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(AlanParser.END, 0); }
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
		enterRule(_localctx, 20, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(IF);
			setState(158);
			expr();
			setState(159);
			match(THEN);
			setState(160);
			statements();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(161);
				elsif();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(167);
				else_();
				}
			}

			setState(170);
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
		public TerminalNode ELSIF() { return getToken(AlanParser.ELSIF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(AlanParser.THEN, 0); }
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
		enterRule(_localctx, 22, RULE_elsif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(ELSIF);
			setState(173);
			expr();
			setState(174);
			match(THEN);
			setState(175);
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
		public TerminalNode ELSE() { return getToken(AlanParser.ELSE, 0); }
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
		enterRule(_localctx, 24, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(ELSE);
			setState(178);
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
		public TerminalNode GET() { return getToken(AlanParser.GET, 0); }
		public TerminalNode ID() { return getToken(AlanParser.ID, 0); }
		public TerminalNode OPENBRA() { return getToken(AlanParser.OPENBRA, 0); }
		public SimpleContext simple() {
			return getRuleContext(SimpleContext.class,0);
		}
		public TerminalNode CLOSEBRA() { return getToken(AlanParser.CLOSEBRA, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(GET);
			setState(181);
			match(ID);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPENBRA) {
				{
				setState(182);
				match(OPENBRA);
				setState(183);
				simple();
				setState(184);
				match(CLOSEBRA);
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
	public static class LeaveContext extends ParserRuleContext {
		public TerminalNode LEAVE() { return getToken(AlanParser.LEAVE, 0); }
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
		enterRule(_localctx, 28, RULE_leave);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(LEAVE);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68186900791304L) != 0)) {
				{
				setState(189);
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
		public TerminalNode PUT() { return getToken(AlanParser.PUT, 0); }
		public List<TerminalNode> STRING() { return getTokens(AlanParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AlanParser.STRING, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(AlanParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AlanParser.DOT, i);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(PUT);
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(193);
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
				setState(194);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(197);
				match(DOT);
				setState(200);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(198);
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
					setState(199);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(206);
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
		public TerminalNode WHILE() { return getToken(AlanParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(AlanParser.DO, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(AlanParser.END, 0); }
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(WHILE);
			setState(208);
			expr();
			setState(209);
			match(DO);
			setState(210);
			statements();
			setState(211);
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
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			simple();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16911433728L) != 0)) {
				{
				setState(214);
				relop();
				setState(215);
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
	public static class RelopContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(AlanParser.EQ, 0); }
		public TerminalNode GE() { return getToken(AlanParser.GE, 0); }
		public TerminalNode GT() { return getToken(AlanParser.GT, 0); }
		public TerminalNode LE() { return getToken(AlanParser.LE, 0); }
		public TerminalNode LT() { return getToken(AlanParser.LT, 0); }
		public TerminalNode NE() { return getToken(AlanParser.NE, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16911433728L) != 0)) ) {
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
	public static class SimpleContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(AlanParser.MINUS, 0); }
		public List<AddopContext> addop() {
			return getRuleContexts(AddopContext.class);
		}
		public AddopContext addop(int i) {
			return getRuleContext(AddopContext.class,i);
		}
		public SimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple; }
	}

	public final SimpleContext simple() throws RecognitionException {
		SimpleContext _localctx = new SimpleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(221);
				match(MINUS);
				}
			}

			setState(224);
			term();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) {
				{
				{
				setState(225);
				addop();
				setState(226);
				term();
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
	public static class AddopContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(AlanParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(AlanParser.PLUS, 0); }
		public TerminalNode OR() { return getToken(AlanParser.OR, 0); }
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) ) {
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
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MulopContext> mulop() {
			return getRuleContexts(MulopContext.class);
		}
		public MulopContext mulop(int i) {
			return getRuleContext(MulopContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			factor();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2061584302080L) != 0)) {
				{
				{
				setState(236);
				mulop();
				setState(237);
				factor();
				}
				}
				setState(243);
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
	public static class MulopContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(AlanParser.AND, 0); }
		public TerminalNode DIV() { return getToken(AlanParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(AlanParser.MUL, 0); }
		public TerminalNode REM() { return getToken(AlanParser.REM, 0); }
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2061584302080L) != 0)) ) {
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
		public TerminalNode ID() { return getToken(AlanParser.ID, 0); }
		public TerminalNode OPENBRA() { return getToken(AlanParser.OPENBRA, 0); }
		public SimpleContext simple() {
			return getRuleContext(SimpleContext.class,0);
		}
		public TerminalNode CLOSEBRA() { return getToken(AlanParser.CLOSEBRA, 0); }
		public TerminalNode OPENPAR() { return getToken(AlanParser.OPENPAR, 0); }
		public TerminalNode CLOSEPAR() { return getToken(AlanParser.CLOSEPAR, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUM() { return getToken(AlanParser.NUM, 0); }
		public TerminalNode NOT() { return getToken(AlanParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(AlanParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AlanParser.FALSE, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_factor);
		int _la;
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(ID);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPENBRA) {
					{
					setState(247);
					match(OPENBRA);
					setState(248);
					simple();
					setState(249);
					match(CLOSEBRA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(ID);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPENPAR) {
					{
					setState(254);
					match(OPENPAR);
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68186900791304L) != 0)) {
						{
						setState(255);
						expr_list();
						}
					}

					setState(258);
					match(CLOSEPAR);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(OPENPAR);
				setState(262);
				expr();
				setState(263);
				match(CLOSEPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				match(NUM);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
				match(NOT);
				setState(267);
				factor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(268);
				match(TRUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(269);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Factor_tailContext extends ParserRuleContext {
		public TerminalNode OPENBRA() { return getToken(AlanParser.OPENBRA, 0); }
		public SimpleContext simple() {
			return getRuleContext(SimpleContext.class,0);
		}
		public TerminalNode CLOSEBRA() { return getToken(AlanParser.CLOSEBRA, 0); }
		public TerminalNode OPENPAR() { return getToken(AlanParser.OPENPAR, 0); }
		public TerminalNode CLOSEPAR() { return getToken(AlanParser.CLOSEPAR, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Factor_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_tail; }
	}

	public final Factor_tailContext factor_tail() throws RecognitionException {
		Factor_tailContext _localctx = new Factor_tailContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_factor_tail);
		int _la;
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENBRA:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(OPENBRA);
				setState(273);
				simple();
				setState(274);
				match(CLOSEBRA);
				}
				break;
			case OPENPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(OPENPAR);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68186900791304L) != 0)) {
					{
					setState(277);
					expr_list();
					}
				}

				setState(280);
				match(CLOSEPAR);
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

	public static final String _serializedATN =
		"\u0004\u00010\u011c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u00006\b\u0000\n\u0000\f\u0000"+
		"9\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001F\b\u0001\n\u0001\f\u0001I\t\u0001\u0003\u0001K\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001P\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0005\u0002V\b\u0002\n\u0002\f\u0002Y\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003"+
		"\u0003`\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004f\b\u0004\n\u0004\f\u0004i\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005q\b\u0005\n\u0005"+
		"\f\u0005t\t\u0005\u0003\u0005v\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u007f\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0086\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u008c\b\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u0091\b\b\n\b\f\b\u0094"+
		"\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u009a\b\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00a3\b\n\n\n\f\n\u00a6"+
		"\t\n\u0001\n\u0003\n\u00a9\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00bb\b\r\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00bf\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00c4\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00c9"+
		"\b\u000f\u0005\u000f\u00cb\b\u000f\n\u000f\f\u000f\u00ce\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00da\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0003\u0013\u00df\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00e5\b\u0013\n\u0013\f\u0013"+
		"\u00e8\t\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u00f0\b\u0015\n\u0015\f\u0015\u00f3\t\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u00fc\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0101\b\u0017\u0001\u0017\u0003\u0017\u0104\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u010f\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0117\b\u0018"+
		"\u0001\u0018\u0003\u0018\u011a\b\u0018\u0001\u0018\u0000\u0000\u0019\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.0\u0000\u0004\u0001\u0000\t\n\u0001\u0000\u001c!\u0001"+
		"\u0000\"$\u0001\u0000%(\u012b\u00002\u0001\u0000\u0000\u0000\u0002<\u0001"+
		"\u0000\u0000\u0000\u0004S\u0001\u0000\u0000\u0000\u0006]\u0001\u0000\u0000"+
		"\u0000\ba\u0001\u0000\u0000\u0000\nu\u0001\u0000\u0000\u0000\f~\u0001"+
		"\u0000\u0000\u0000\u000e\u0080\u0001\u0000\u0000\u0000\u0010\u008d\u0001"+
		"\u0000\u0000\u0000\u0012\u0095\u0001\u0000\u0000\u0000\u0014\u009d\u0001"+
		"\u0000\u0000\u0000\u0016\u00ac\u0001\u0000\u0000\u0000\u0018\u00b1\u0001"+
		"\u0000\u0000\u0000\u001a\u00b4\u0001\u0000\u0000\u0000\u001c\u00bc\u0001"+
		"\u0000\u0000\u0000\u001e\u00c0\u0001\u0000\u0000\u0000 \u00cf\u0001\u0000"+
		"\u0000\u0000\"\u00d5\u0001\u0000\u0000\u0000$\u00db\u0001\u0000\u0000"+
		"\u0000&\u00de\u0001\u0000\u0000\u0000(\u00e9\u0001\u0000\u0000\u0000*"+
		"\u00eb\u0001\u0000\u0000\u0000,\u00f4\u0001\u0000\u0000\u0000.\u010e\u0001"+
		"\u0000\u0000\u00000\u0119\u0001\u0000\u0000\u000023\u0005\u0001\u0000"+
		"\u000037\u0005,\u0000\u000046\u0003\u0002\u0001\u000054\u0001\u0000\u0000"+
		"\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:;\u0003"+
		"\u0004\u0002\u0000;\u0001\u0001\u0000\u0000\u0000<=\u0005\u0002\u0000"+
		"\u0000=>\u0005,\u0000\u0000>J\u0005\u0003\u0000\u0000?@\u0003\u0006\u0003"+
		"\u0000@G\u0005,\u0000\u0000AB\u0005\u0005\u0000\u0000BC\u0003\u0006\u0003"+
		"\u0000CD\u0005,\u0000\u0000DF\u0001\u0000\u0000\u0000EA\u0001\u0000\u0000"+
		"\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000J?\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LO\u0005\u0004\u0000\u0000MN\u0005\u0006\u0000\u0000NP\u0003\u0006\u0003"+
		"\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000QR\u0003\u0004\u0002\u0000R\u0003\u0001\u0000\u0000\u0000"+
		"SW\u0005\u0007\u0000\u0000TV\u0003\b\u0004\u0000UT\u0001\u0000\u0000\u0000"+
		"VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0003\n\u0005"+
		"\u0000[\\\u0005\b\u0000\u0000\\\u0005\u0001\u0000\u0000\u0000]_\u0007"+
		"\u0000\u0000\u0000^`\u0005\u000b\u0000\u0000_^\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`\u0007\u0001\u0000\u0000\u0000ab\u0003\u0006"+
		"\u0003\u0000bg\u0005,\u0000\u0000cd\u0005\u0005\u0000\u0000df\u0005,\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000jk\u0005\f\u0000\u0000k\t\u0001\u0000\u0000\u0000lv"+
		"\u0005\r\u0000\u0000mr\u0003\f\u0006\u0000no\u0005\f\u0000\u0000oq\u0003"+
		"\f\u0006\u0000pn\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000"+
		"tr\u0001\u0000\u0000\u0000ul\u0001\u0000\u0000\u0000um\u0001\u0000\u0000"+
		"\u0000v\u000b\u0001\u0000\u0000\u0000w\u007f\u0003\u000e\u0007\u0000x"+
		"\u007f\u0003\u0012\t\u0000y\u007f\u0003\u0014\n\u0000z\u007f\u0003\u001a"+
		"\r\u0000{\u007f\u0003\u001c\u000e\u0000|\u007f\u0003\u001e\u000f\u0000"+
		"}\u007f\u0003 \u0010\u0000~w\u0001\u0000\u0000\u0000~x\u0001\u0000\u0000"+
		"\u0000~y\u0001\u0000\u0000\u0000~z\u0001\u0000\u0000\u0000~{\u0001\u0000"+
		"\u0000\u0000~|\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f"+
		"\r\u0001\u0000\u0000\u0000\u0080\u0085\u0005,\u0000\u0000\u0081\u0082"+
		"\u0005\u000e\u0000\u0000\u0082\u0083\u0003&\u0013\u0000\u0083\u0084\u0005"+
		"\u000f\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0081\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u008b\u0005\u0010\u0000\u0000\u0088\u008c\u0003"+
		"\"\u0011\u0000\u0089\u008a\u0005\u000b\u0000\u0000\u008a\u008c\u0003&"+
		"\u0013\u0000\u008b\u0088\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008c\u000f\u0001\u0000\u0000\u0000\u008d\u0092\u0003\"\u0011"+
		"\u0000\u008e\u008f\u0005\u0005\u0000\u0000\u008f\u0091\u0003\"\u0011\u0000"+
		"\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000"+
		"\u0093\u0011\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005\u0011\u0000\u0000\u0096\u0097\u0005,\u0000\u0000\u0097"+
		"\u0099\u0005\u0003\u0000\u0000\u0098\u009a\u0003\u0010\b\u0000\u0099\u0098"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u0004\u0000\u0000\u009c\u0013"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u0012\u0000\u0000\u009e\u009f"+
		"\u0003\"\u0011\u0000\u009f\u00a0\u0005\u0013\u0000\u0000\u00a0\u00a4\u0003"+
		"\n\u0005\u0000\u00a1\u00a3\u0003\u0016\u000b\u0000\u00a2\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a9\u0003\u0018"+
		"\f\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\b\u0000\u0000"+
		"\u00ab\u0015\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0014\u0000\u0000"+
		"\u00ad\u00ae\u0003\"\u0011\u0000\u00ae\u00af\u0005\u0013\u0000\u0000\u00af"+
		"\u00b0\u0003\n\u0005\u0000\u00b0\u0017\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0005\u0015\u0000\u0000\u00b2\u00b3\u0003\n\u0005\u0000\u00b3\u0019\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0005\u0016\u0000\u0000\u00b5\u00ba\u0005"+
		",\u0000\u0000\u00b6\u00b7\u0005\u000e\u0000\u0000\u00b7\u00b8\u0003&\u0013"+
		"\u0000\u00b8\u00b9\u0005\u000f\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b6\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb\u001b\u0001\u0000\u0000\u0000\u00bc\u00be\u0005\u0017\u0000"+
		"\u0000\u00bd\u00bf\u0003\"\u0011\u0000\u00be\u00bd\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u001d\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c3\u0005\u0018\u0000\u0000\u00c1\u00c4\u0005.\u0000\u0000\u00c2"+
		"\u00c4\u0003\"\u0011\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c4\u00cc\u0001\u0000\u0000\u0000\u00c5\u00c8"+
		"\u0005\u0019\u0000\u0000\u00c6\u00c9\u0005.\u0000\u0000\u00c7\u00c9\u0003"+
		"\"\u0011\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c5\u0001\u0000"+
		"\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u001f\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u001a"+
		"\u0000\u0000\u00d0\u00d1\u0003\"\u0011\u0000\u00d1\u00d2\u0005\u001b\u0000"+
		"\u0000\u00d2\u00d3\u0003\n\u0005\u0000\u00d3\u00d4\u0005\b\u0000\u0000"+
		"\u00d4!\u0001\u0000\u0000\u0000\u00d5\u00d9\u0003&\u0013\u0000\u00d6\u00d7"+
		"\u0003$\u0012\u0000\u00d7\u00d8\u0003&\u0013\u0000\u00d8\u00da\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d6\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000"+
		"\u0000\u0000\u00da#\u0001\u0000\u0000\u0000\u00db\u00dc\u0007\u0001\u0000"+
		"\u0000\u00dc%\u0001\u0000\u0000\u0000\u00dd\u00df\u0005\"\u0000\u0000"+
		"\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e6\u0003*\u0015\u0000\u00e1"+
		"\u00e2\u0003(\u0014\u0000\u00e2\u00e3\u0003*\u0015\u0000\u00e3\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e1\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e7\'\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0007\u0002\u0000\u0000\u00ea)\u0001\u0000\u0000"+
		"\u0000\u00eb\u00f1\u0003.\u0017\u0000\u00ec\u00ed\u0003,\u0016\u0000\u00ed"+
		"\u00ee\u0003.\u0017\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00ec"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2+\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f5\u0007"+
		"\u0003\u0000\u0000\u00f5-\u0001\u0000\u0000\u0000\u00f6\u00fb\u0005,\u0000"+
		"\u0000\u00f7\u00f8\u0005\u000e\u0000\u0000\u00f8\u00f9\u0003&\u0013\u0000"+
		"\u00f9\u00fa\u0005\u000f\u0000\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fb\u00f7\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fc\u010f\u0001\u0000\u0000\u0000\u00fd\u0103\u0005,\u0000\u0000\u00fe"+
		"\u0100\u0005\u0003\u0000\u0000\u00ff\u0101\u0003\u0010\b\u0000\u0100\u00ff"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0001\u0000\u0000\u0000\u0102\u0104\u0005\u0004\u0000\u0000\u0103\u00fe"+
		"\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u010f"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\u0005\u0003\u0000\u0000\u0106\u0107"+
		"\u0003\"\u0011\u0000\u0107\u0108\u0005\u0004\u0000\u0000\u0108\u010f\u0001"+
		"\u0000\u0000\u0000\u0109\u010f\u0005-\u0000\u0000\u010a\u010b\u0005)\u0000"+
		"\u0000\u010b\u010f\u0003.\u0017\u0000\u010c\u010f\u0005*\u0000\u0000\u010d"+
		"\u010f\u0005+\u0000\u0000\u010e\u00f6\u0001\u0000\u0000\u0000\u010e\u00fd"+
		"\u0001\u0000\u0000\u0000\u010e\u0105\u0001\u0000\u0000\u0000\u010e\u0109"+
		"\u0001\u0000\u0000\u0000\u010e\u010a\u0001\u0000\u0000\u0000\u010e\u010c"+
		"\u0001\u0000\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f/\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0005\u000e\u0000\u0000\u0111\u0112\u0003"+
		"&\u0013\u0000\u0112\u0113\u0005\u000f\u0000\u0000\u0113\u011a\u0001\u0000"+
		"\u0000\u0000\u0114\u0116\u0005\u0003\u0000\u0000\u0115\u0117\u0003\u0010"+
		"\b\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u011a\u0005\u0004\u0000"+
		"\u0000\u0119\u0110\u0001\u0000\u0000\u0000\u0119\u0114\u0001\u0000\u0000"+
		"\u0000\u011a1\u0001\u0000\u0000\u0000\u001f7GJOW_gru~\u0085\u008b\u0092"+
		"\u0099\u00a4\u00a8\u00ba\u00be\u00c3\u00c8\u00cc\u00d9\u00de\u00e6\u00f1"+
		"\u00fb\u0100\u0103\u010e\u0116\u0119";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}