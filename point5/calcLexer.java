// Generated from calc.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COS=1, SIN=2, TAN=3, ACOS=4, ASIN=5, ATAN=6, LN=7, LOG=8, SQRT=9, PAREN_IZQ=10, 
		PAREN_DER=11, PLUS=12, MINUS=13, TIMES=14, DIV=15, MOD=16, GT=17, LT=18, 
		EQ=19, COMMA=20, POINT=21, POW=22, PI=23, EULER=24, I=25, VARIABLE=26, 
		NUMERO=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COS", "SIN", "TAN", "ACOS", "ASIN", "ATAN", "LN", "LOG", "SQRT", "PAREN_IZQ", 
		"PAREN_DER", "PLUS", "MINUS", "TIMES", "DIV", "MOD", "GT", "LT", "EQ", 
		"COMMA", "POINT", "POW", "PI", "EULER", "I", "VARIABLE", "VALID_ID_START", 
		"VALID_ID_CHAR", "NUMERO", "NUM", "E1", "E2", "SIGN", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'cos'", "'sin'", "'tan'", "'acos'", "'asin'", "'atan'", "'ln'", 
		"'log'", "'sqrt'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'%'", "'>'", 
		"'<'", "'='", "','", "'.'", "'^'", "'pi'", null, "'i'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COS", "SIN", "TAN", "ACOS", "ASIN", "ATAN", "LN", "LOG", "SQRT", 
		"PAREN_IZQ", "PAREN_DER", "PLUS", "MINUS", "TIMES", "DIV", "MOD", "GT", 
		"LT", "EQ", "COMMA", "POINT", "POW", "PI", "EULER", "I", "VARIABLE", "NUMERO", 
		"WS"
	};
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


	public calcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "calc.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00c3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\7\33\u0092\n\33\f\33\16\33\u0095\13\33\3\34\5\34\u0098\n\34\3\35\3\35"+
		"\5\35\u009c\n\35\3\36\3\36\3\36\5\36\u00a1\n\36\3\36\5\36\u00a4\n\36\3"+
		"\36\3\36\5\36\u00a8\n\36\3\37\6\37\u00ab\n\37\r\37\16\37\u00ac\3\37\3"+
		"\37\6\37\u00b1\n\37\r\37\16\37\u00b2\5\37\u00b5\n\37\3 \3 \3!\3!\3\"\3"+
		"\"\3#\6#\u00be\n#\r#\16#\u00bf\3#\3#\2\2$\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\29\2;\35=\2?\2A\2C\2E\36\3\2\5\5\2C\\"+
		"aac|\4\2--//\5\2\13\f\17\17\"\"\2\u00c5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2;\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5K\3\2\2\2\7O\3\2\2\2\tS"+
		"\3\2\2\2\13X\3\2\2\2\r]\3\2\2\2\17b\3\2\2\2\21e\3\2\2\2\23i\3\2\2\2\25"+
		"n\3\2\2\2\27p\3\2\2\2\31r\3\2\2\2\33t\3\2\2\2\35v\3\2\2\2\37x\3\2\2\2"+
		"!z\3\2\2\2#|\3\2\2\2%~\3\2\2\2\'\u0080\3\2\2\2)\u0082\3\2\2\2+\u0084\3"+
		"\2\2\2-\u0086\3\2\2\2/\u0088\3\2\2\2\61\u008b\3\2\2\2\63\u008d\3\2\2\2"+
		"\65\u008f\3\2\2\2\67\u0097\3\2\2\29\u009b\3\2\2\2;\u009d\3\2\2\2=\u00aa"+
		"\3\2\2\2?\u00b6\3\2\2\2A\u00b8\3\2\2\2C\u00ba\3\2\2\2E\u00bd\3\2\2\2G"+
		"H\7e\2\2HI\7q\2\2IJ\7u\2\2J\4\3\2\2\2KL\7u\2\2LM\7k\2\2MN\7p\2\2N\6\3"+
		"\2\2\2OP\7v\2\2PQ\7c\2\2QR\7p\2\2R\b\3\2\2\2ST\7c\2\2TU\7e\2\2UV\7q\2"+
		"\2VW\7u\2\2W\n\3\2\2\2XY\7c\2\2YZ\7u\2\2Z[\7k\2\2[\\\7p\2\2\\\f\3\2\2"+
		"\2]^\7c\2\2^_\7v\2\2_`\7c\2\2`a\7p\2\2a\16\3\2\2\2bc\7n\2\2cd\7p\2\2d"+
		"\20\3\2\2\2ef\7n\2\2fg\7q\2\2gh\7i\2\2h\22\3\2\2\2ij\7u\2\2jk\7s\2\2k"+
		"l\7t\2\2lm\7v\2\2m\24\3\2\2\2no\7*\2\2o\26\3\2\2\2pq\7+\2\2q\30\3\2\2"+
		"\2rs\7-\2\2s\32\3\2\2\2tu\7/\2\2u\34\3\2\2\2vw\7,\2\2w\36\3\2\2\2xy\7"+
		"\61\2\2y \3\2\2\2z{\7\'\2\2{\"\3\2\2\2|}\7@\2\2}$\3\2\2\2~\177\7>\2\2"+
		"\177&\3\2\2\2\u0080\u0081\7?\2\2\u0081(\3\2\2\2\u0082\u0083\7.\2\2\u0083"+
		"*\3\2\2\2\u0084\u0085\7\60\2\2\u0085,\3\2\2\2\u0086\u0087\7`\2\2\u0087"+
		".\3\2\2\2\u0088\u0089\7r\2\2\u0089\u008a\7k\2\2\u008a\60\3\2\2\2\u008b"+
		"\u008c\5A!\2\u008c\62\3\2\2\2\u008d\u008e\7k\2\2\u008e\64\3\2\2\2\u008f"+
		"\u0093\5\67\34\2\u0090\u0092\59\35\2\u0091\u0090\3\2\2\2\u0092\u0095\3"+
		"\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\66\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0098\t\2\2\2\u0097\u0096\3\2\2\2\u00988\3\2\2\2"+
		"\u0099\u009c\5\67\34\2\u009a\u009c\4\62;\2\u009b\u0099\3\2\2\2\u009b\u009a"+
		"\3\2\2\2\u009c:\3\2\2\2\u009d\u00a7\5=\37\2\u009e\u00a1\5? \2\u009f\u00a1"+
		"\5A!\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2"+
		"\u00a4\5C\"\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a6\5=\37\2\u00a6\u00a8\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8<\3\2\2\2\u00a9\u00ab\4\62;\2\u00aa\u00a9\3\2\2\2"+
		"\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b4"+
		"\3\2\2\2\u00ae\u00b0\7\60\2\2\u00af\u00b1\4\62;\2\u00b0\u00af\3\2\2\2"+
		"\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5"+
		"\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5>\3\2\2\2\u00b6"+
		"\u00b7\7G\2\2\u00b7@\3\2\2\2\u00b8\u00b9\7g\2\2\u00b9B\3\2\2\2\u00ba\u00bb"+
		"\t\3\2\2\u00bbD\3\2\2\2\u00bc\u00be\t\4\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c2\b#\2\2\u00c2F\3\2\2\2\r\2\u0093\u0097\u009b\u00a0\u00a3"+
		"\u00a7\u00ac\u00b2\u00b4\u00bf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}