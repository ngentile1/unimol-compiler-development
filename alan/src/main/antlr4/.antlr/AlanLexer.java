// Generated from /home/nik/Desktop/unimol-compiler-development/alan/src/main/antlr4/Alan.g4 by ANTLR 4.13.1

package it.unimol.alan;

import it.unimol.alan.TooLongIDException;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AlanLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SOURCE", "FUNCTION", "OPENPAR", "CLOSEPAR", "COMMA", "TO", "BEGIN", 
			"END", "BOOL", "INT", "ARRAY", "SEMI", "RELAX", "OPENBRA", "CLOSEBRA", 
			"ASSIGNMENT", "CALL", "IF", "THEN", "ELSIF", "ELSE", "GET", "LEAVE", 
			"PUT", "DOT", "WHILE", "DO", "EQ", "GE", "GT", "LE", "LT", "NE", "MINUS", 
			"PLUS", "OR", "AND", "DIV", "MUL", "REM", "NOT", "TRUE", "FALSE", "DIGIT", 
			"LETTER", "ID", "NUM", "ESCAPE_CHAR", "PRINTABLE_CHAR", "STRING", "COMMENT_TEXT", 
			"COMMENT", "WS"
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


	public AlanLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Alan.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 45:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 if(getText().length() > 32) throw new TooLongIDException("Identifier must at most 32 character: " + getText()); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u00000\u0154\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001-\u0005-\u011d\b-\n-"+
		"\f-\u0120\t-\u0001-\u0001-\u0001.\u0001.\u0005.\u0126\b.\n.\f.\u0129\t"+
		".\u0001/\u0001/\u00010\u00010\u00010\u00030\u0130\b0\u00011\u00011\u0005"+
		"1\u0134\b1\n1\f1\u0137\t1\u00011\u00011\u00012\u00042\u013c\b2\u000b2"+
		"\f2\u013d\u00013\u00013\u00033\u0142\b3\u00013\u00033\u0145\b3\u00013"+
		"\u00033\u0148\b3\u00013\u00013\u00013\u00013\u00014\u00044\u014f\b4\u000b"+
		"4\f4\u0150\u00014\u00014\u0000\u00005\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c"+
		"9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W\u0000Y\u0000[,]-_\u0000"+
		"a\u0000c.e\u0000g/i0\u0001\u0000\u0005\u0003\u0000AZ__az\u0004\u0000\""+
		"\"\\\\nntt\u0003\u0000 !#[]~\u0001\u0000{{\u0003\u0000\t\n\r\r  \u0158"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K"+
		"\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000"+
		"\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000"+
		"\u0000U\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]"+
		"\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000g\u0001\u0000"+
		"\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0001k\u0001\u0000\u0000\u0000"+
		"\u0003r\u0001\u0000\u0000\u0000\u0005{\u0001\u0000\u0000\u0000\u0007}"+
		"\u0001\u0000\u0000\u0000\t\u007f\u0001\u0000\u0000\u0000\u000b\u0081\u0001"+
		"\u0000\u0000\u0000\r\u0084\u0001\u0000\u0000\u0000\u000f\u008a\u0001\u0000"+
		"\u0000\u0000\u0011\u008e\u0001\u0000\u0000\u0000\u0013\u0096\u0001\u0000"+
		"\u0000\u0000\u0015\u009e\u0001\u0000\u0000\u0000\u0017\u00a4\u0001\u0000"+
		"\u0000\u0000\u0019\u00a6\u0001\u0000\u0000\u0000\u001b\u00ac\u0001\u0000"+
		"\u0000\u0000\u001d\u00ae\u0001\u0000\u0000\u0000\u001f\u00b0\u0001\u0000"+
		"\u0000\u0000!\u00b3\u0001\u0000\u0000\u0000#\u00b8\u0001\u0000\u0000\u0000"+
		"%\u00bb\u0001\u0000\u0000\u0000\'\u00c0\u0001\u0000\u0000\u0000)\u00c6"+
		"\u0001\u0000\u0000\u0000+\u00cb\u0001\u0000\u0000\u0000-\u00cf\u0001\u0000"+
		"\u0000\u0000/\u00d5\u0001\u0000\u0000\u00001\u00d9\u0001\u0000\u0000\u0000"+
		"3\u00db\u0001\u0000\u0000\u00005\u00e1\u0001\u0000\u0000\u00007\u00e4"+
		"\u0001\u0000\u0000\u00009\u00e6\u0001\u0000\u0000\u0000;\u00e9\u0001\u0000"+
		"\u0000\u0000=\u00eb\u0001\u0000\u0000\u0000?\u00ee\u0001\u0000\u0000\u0000"+
		"A\u00f0\u0001\u0000\u0000\u0000C\u00f3\u0001\u0000\u0000\u0000E\u00f5"+
		"\u0001\u0000\u0000\u0000G\u00f7\u0001\u0000\u0000\u0000I\u00fa\u0001\u0000"+
		"\u0000\u0000K\u00fe\u0001\u0000\u0000\u0000M\u0100\u0001\u0000\u0000\u0000"+
		"O\u0102\u0001\u0000\u0000\u0000Q\u0106\u0001\u0000\u0000\u0000S\u010a"+
		"\u0001\u0000\u0000\u0000U\u010f\u0001\u0000\u0000\u0000W\u0115\u0001\u0000"+
		"\u0000\u0000Y\u0117\u0001\u0000\u0000\u0000[\u0119\u0001\u0000\u0000\u0000"+
		"]\u0123\u0001\u0000\u0000\u0000_\u012a\u0001\u0000\u0000\u0000a\u012f"+
		"\u0001\u0000\u0000\u0000c\u0131\u0001\u0000\u0000\u0000e\u013b\u0001\u0000"+
		"\u0000\u0000g\u013f\u0001\u0000\u0000\u0000i\u014e\u0001\u0000\u0000\u0000"+
		"kl\u0005s\u0000\u0000lm\u0005o\u0000\u0000mn\u0005u\u0000\u0000no\u0005"+
		"r\u0000\u0000op\u0005c\u0000\u0000pq\u0005e\u0000\u0000q\u0002\u0001\u0000"+
		"\u0000\u0000rs\u0005f\u0000\u0000st\u0005u\u0000\u0000tu\u0005n\u0000"+
		"\u0000uv\u0005c\u0000\u0000vw\u0005t\u0000\u0000wx\u0005i\u0000\u0000"+
		"xy\u0005o\u0000\u0000yz\u0005n\u0000\u0000z\u0004\u0001\u0000\u0000\u0000"+
		"{|\u0005(\u0000\u0000|\u0006\u0001\u0000\u0000\u0000}~\u0005)\u0000\u0000"+
		"~\b\u0001\u0000\u0000\u0000\u007f\u0080\u0005,\u0000\u0000\u0080\n\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0005t\u0000\u0000\u0082\u0083\u0005o\u0000"+
		"\u0000\u0083\f\u0001\u0000\u0000\u0000\u0084\u0085\u0005b\u0000\u0000"+
		"\u0085\u0086\u0005e\u0000\u0000\u0086\u0087\u0005g\u0000\u0000\u0087\u0088"+
		"\u0005i\u0000\u0000\u0088\u0089\u0005n\u0000\u0000\u0089\u000e\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0005e\u0000\u0000\u008b\u008c\u0005n\u0000\u0000"+
		"\u008c\u008d\u0005d\u0000\u0000\u008d\u0010\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0005b\u0000\u0000\u008f\u0090\u0005o\u0000\u0000\u0090\u0091\u0005"+
		"o\u0000\u0000\u0091\u0092\u0005l\u0000\u0000\u0092\u0093\u0005e\u0000"+
		"\u0000\u0093\u0094\u0005a\u0000\u0000\u0094\u0095\u0005n\u0000\u0000\u0095"+
		"\u0012\u0001\u0000\u0000\u0000\u0096\u0097\u0005i\u0000\u0000\u0097\u0098"+
		"\u0005n\u0000\u0000\u0098\u0099\u0005t\u0000\u0000\u0099\u009a\u0005e"+
		"\u0000\u0000\u009a\u009b\u0005g\u0000\u0000\u009b\u009c\u0005e\u0000\u0000"+
		"\u009c\u009d\u0005r\u0000\u0000\u009d\u0014\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0005a\u0000\u0000\u009f\u00a0\u0005r\u0000\u0000\u00a0\u00a1\u0005"+
		"r\u0000\u0000\u00a1\u00a2\u0005a\u0000\u0000\u00a2\u00a3\u0005y\u0000"+
		"\u0000\u00a3\u0016\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005;\u0000\u0000"+
		"\u00a5\u0018\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005r\u0000\u0000\u00a7"+
		"\u00a8\u0005e\u0000\u0000\u00a8\u00a9\u0005l\u0000\u0000\u00a9\u00aa\u0005"+
		"a\u0000\u0000\u00aa\u00ab\u0005x\u0000\u0000\u00ab\u001a\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0005[\u0000\u0000\u00ad\u001c\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0005]\u0000\u0000\u00af\u001e\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0005:\u0000\u0000\u00b1\u00b2\u0005=\u0000\u0000\u00b2 \u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0005c\u0000\u0000\u00b4\u00b5\u0005a\u0000"+
		"\u0000\u00b5\u00b6\u0005l\u0000\u0000\u00b6\u00b7\u0005l\u0000\u0000\u00b7"+
		"\"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005i\u0000\u0000\u00b9\u00ba"+
		"\u0005f\u0000\u0000\u00ba$\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005t"+
		"\u0000\u0000\u00bc\u00bd\u0005h\u0000\u0000\u00bd\u00be\u0005e\u0000\u0000"+
		"\u00be\u00bf\u0005n\u0000\u0000\u00bf&\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0005e\u0000\u0000\u00c1\u00c2\u0005l\u0000\u0000\u00c2\u00c3\u0005s"+
		"\u0000\u0000\u00c3\u00c4\u0005i\u0000\u0000\u00c4\u00c5\u0005f\u0000\u0000"+
		"\u00c5(\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005e\u0000\u0000\u00c7\u00c8"+
		"\u0005l\u0000\u0000\u00c8\u00c9\u0005s\u0000\u0000\u00c9\u00ca\u0005e"+
		"\u0000\u0000\u00ca*\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005g\u0000\u0000"+
		"\u00cc\u00cd\u0005e\u0000\u0000\u00cd\u00ce\u0005t\u0000\u0000\u00ce,"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005l\u0000\u0000\u00d0\u00d1\u0005"+
		"e\u0000\u0000\u00d1\u00d2\u0005a\u0000\u0000\u00d2\u00d3\u0005v\u0000"+
		"\u0000\u00d3\u00d4\u0005e\u0000\u0000\u00d4.\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0005p\u0000\u0000\u00d6\u00d7\u0005u\u0000\u0000\u00d7\u00d8\u0005"+
		"t\u0000\u0000\u00d80\u0001\u0000\u0000\u0000\u00d9\u00da\u0005.\u0000"+
		"\u0000\u00da2\u0001\u0000\u0000\u0000\u00db\u00dc\u0005w\u0000\u0000\u00dc"+
		"\u00dd\u0005h\u0000\u0000\u00dd\u00de\u0005i\u0000\u0000\u00de\u00df\u0005"+
		"l\u0000\u0000\u00df\u00e0\u0005e\u0000\u0000\u00e04\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0005d\u0000\u0000\u00e2\u00e3\u0005o\u0000\u0000\u00e3"+
		"6\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005=\u0000\u0000\u00e58\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0005>\u0000\u0000\u00e7\u00e8\u0005=\u0000"+
		"\u0000\u00e8:\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005>\u0000\u0000\u00ea"+
		"<\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005<\u0000\u0000\u00ec\u00ed\u0005"+
		"=\u0000\u0000\u00ed>\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005<\u0000"+
		"\u0000\u00ef@\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005<\u0000\u0000\u00f1"+
		"\u00f2\u0005>\u0000\u0000\u00f2B\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005"+
		"-\u0000\u0000\u00f4D\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005+\u0000"+
		"\u0000\u00f6F\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005o\u0000\u0000\u00f8"+
		"\u00f9\u0005r\u0000\u0000\u00f9H\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005"+
		"a\u0000\u0000\u00fb\u00fc\u0005n\u0000\u0000\u00fc\u00fd\u0005d\u0000"+
		"\u0000\u00fdJ\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005/\u0000\u0000\u00ff"+
		"L\u0001\u0000\u0000\u0000\u0100\u0101\u0005*\u0000\u0000\u0101N\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u0005r\u0000\u0000\u0103\u0104\u0005e\u0000"+
		"\u0000\u0104\u0105\u0005m\u0000\u0000\u0105P\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0005n\u0000\u0000\u0107\u0108\u0005o\u0000\u0000\u0108\u0109\u0005"+
		"t\u0000\u0000\u0109R\u0001\u0000\u0000\u0000\u010a\u010b\u0005t\u0000"+
		"\u0000\u010b\u010c\u0005r\u0000\u0000\u010c\u010d\u0005u\u0000\u0000\u010d"+
		"\u010e\u0005e\u0000\u0000\u010eT\u0001\u0000\u0000\u0000\u010f\u0110\u0005"+
		"f\u0000\u0000\u0110\u0111\u0005a\u0000\u0000\u0111\u0112\u0005l\u0000"+
		"\u0000\u0112\u0113\u0005s\u0000\u0000\u0113\u0114\u0005e\u0000\u0000\u0114"+
		"V\u0001\u0000\u0000\u0000\u0115\u0116\u000209\u0000\u0116X\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0007\u0000\u0000\u0000\u0118Z\u0001\u0000\u0000"+
		"\u0000\u0119\u011e\u0003Y,\u0000\u011a\u011d\u0003Y,\u0000\u011b\u011d"+
		"\u0003W+\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011b\u0001\u0000"+
		"\u0000\u0000\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0121\u0001\u0000"+
		"\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u0122\u0006-\u0000"+
		"\u0000\u0122\\\u0001\u0000\u0000\u0000\u0123\u0127\u0003W+\u0000\u0124"+
		"\u0126\u0003W+\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0126\u0129\u0001"+
		"\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001"+
		"\u0000\u0000\u0000\u0128^\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\u0007\u0001\u0000\u0000\u012b`\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0005\\\u0000\u0000\u012d\u0130\u0003_/\u0000\u012e"+
		"\u0130\u0007\u0002\u0000\u0000\u012f\u012c\u0001\u0000\u0000\u0000\u012f"+
		"\u012e\u0001\u0000\u0000\u0000\u0130b\u0001\u0000\u0000\u0000\u0131\u0135"+
		"\u0005\"\u0000\u0000\u0132\u0134\u0003a0\u0000\u0133\u0132\u0001\u0000"+
		"\u0000\u0000\u0134\u0137\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000"+
		"\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0138\u0001\u0000"+
		"\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u0139\u0005\"\u0000"+
		"\u0000\u0139d\u0001\u0000\u0000\u0000\u013a\u013c\b\u0003\u0000\u0000"+
		"\u013b\u013a\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000"+
		"\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000"+
		"\u013ef\u0001\u0000\u0000\u0000\u013f\u0141\u0005{\u0000\u0000\u0140\u0142"+
		"\u0003e2\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000"+
		"\u0000\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0145\u0003g3\u0000"+
		"\u0144\u0143\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000"+
		"\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u0148\u0003e2\u0000\u0147\u0146"+
		"\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\u0001\u0000\u0000\u0000\u0149\u014a\u0005}\u0000\u0000\u014a\u014b\u0001"+
		"\u0000\u0000\u0000\u014b\u014c\u00063\u0001\u0000\u014ch\u0001\u0000\u0000"+
		"\u0000\u014d\u014f\u0007\u0004\u0000\u0000\u014e\u014d\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u00064\u0001\u0000\u0153j\u0001\u0000\u0000\u0000\u000b"+
		"\u0000\u011c\u011e\u0127\u012f\u0135\u013d\u0141\u0144\u0147\u0150\u0002"+
		"\u0001-\u0000\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}