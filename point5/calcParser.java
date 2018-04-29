// Generated from calc.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COS=1, SIN=2, TAN=3, ACOS=4, ASIN=5, ATAN=6, LN=7, LOG=8, SQRT=9, PAREN_IZQ=10, 
		PAREN_DER=11, PLUS=12, MINUS=13, TIMES=14, DIV=15, MOD=16, GT=17, LT=18, 
		EQ=19, COMMA=20, POINT=21, POW=22, PI=23, EULER=24, I=25, VARIABLE=26, 
		NUMERO=27, WS=28;
	public static final int
		RULE_ecuacion = 0, RULE_expresion = 1, RULE_multiplyingexpresion = 2, 
		RULE_powexpresion = 3, RULE_signedAtom = 4, RULE_atom = 5, RULE_scientific = 6, 
		RULE_constante = 7, RULE_variable = 8, RULE_func = 9, RULE_func_nombre = 10, 
		RULE_relop = 11;
	public static final String[] ruleNames = {
		"ecuacion", "expresion", "multiplyingexpresion", "powexpresion", "signedAtom", 
		"atom", "scientific", "constante", "variable", "func", "func_nombre", 
		"relop"
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

	@Override
	public String getGrammarFileName() { return "calc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public calcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EcuacionContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public EcuacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ecuacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterEcuacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitEcuacion(this);
		}
	}

	public final EcuacionContext ecuacion() throws RecognitionException {
		EcuacionContext _localctx = new EcuacionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ecuacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			expresion();
			setState(25);
			relop();
			setState(26);
			expresion();
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

	public static class ExpresionContext extends ParserRuleContext {
		public List<MultiplyingexpresionContext> multiplyingexpresion() {
			return getRuleContexts(MultiplyingexpresionContext.class);
		}
		public MultiplyingexpresionContext multiplyingexpresion(int i) {
			return getRuleContext(MultiplyingexpresionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(calcParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(calcParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(calcParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(calcParser.MINUS, i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			multiplyingexpresion();
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(29);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(30);
				multiplyingexpresion();
				}
				}
				setState(35);
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

	public static class MultiplyingexpresionContext extends ParserRuleContext {
		public List<PowexpresionContext> powexpresion() {
			return getRuleContexts(PowexpresionContext.class);
		}
		public PowexpresionContext powexpresion(int i) {
			return getRuleContext(PowexpresionContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(calcParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(calcParser.TIMES, i);
		}
		public List<TerminalNode> DIV() { return getTokens(calcParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(calcParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(calcParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(calcParser.MOD, i);
		}
		public MultiplyingexpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingexpresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterMultiplyingexpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitMultiplyingexpresion(this);
		}
	}

	public final MultiplyingexpresionContext multiplyingexpresion() throws RecognitionException {
		MultiplyingexpresionContext _localctx = new MultiplyingexpresionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multiplyingexpresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			powexpresion();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(37);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIV) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(38);
				powexpresion();
				}
				}
				setState(43);
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

	public static class PowexpresionContext extends ParserRuleContext {
		public List<SignedAtomContext> signedAtom() {
			return getRuleContexts(SignedAtomContext.class);
		}
		public SignedAtomContext signedAtom(int i) {
			return getRuleContext(SignedAtomContext.class,i);
		}
		public List<TerminalNode> POW() { return getTokens(calcParser.POW); }
		public TerminalNode POW(int i) {
			return getToken(calcParser.POW, i);
		}
		public PowexpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powexpresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterPowexpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitPowexpresion(this);
		}
	}

	public final PowexpresionContext powexpresion() throws RecognitionException {
		PowexpresionContext _localctx = new PowexpresionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_powexpresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			signedAtom();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POW) {
				{
				{
				setState(45);
				match(POW);
				setState(46);
				signedAtom();
				}
				}
				setState(51);
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

	public static class SignedAtomContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(calcParser.PLUS, 0); }
		public SignedAtomContext signedAtom() {
			return getRuleContext(SignedAtomContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(calcParser.MINUS, 0); }
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public SignedAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterSignedAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitSignedAtom(this);
		}
	}

	public final SignedAtomContext signedAtom() throws RecognitionException {
		SignedAtomContext _localctx = new SignedAtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_signedAtom);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(PLUS);
				setState(53);
				signedAtom();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(MINUS);
				setState(55);
				signedAtom();
				}
				break;
			case COS:
			case SIN:
			case TAN:
			case ACOS:
			case ASIN:
			case ATAN:
			case LN:
			case LOG:
			case SQRT:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				func();
				}
				break;
			case PAREN_IZQ:
			case PI:
			case EULER:
			case I:
			case VARIABLE:
			case NUMERO:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				atom();
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

	public static class AtomContext extends ParserRuleContext {
		public ScientificContext scientific() {
			return getRuleContext(ScientificContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public TerminalNode PAREN_IZQ() { return getToken(calcParser.PAREN_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_DER() { return getToken(calcParser.PAREN_DER, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atom);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				scientific();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				variable();
				}
				break;
			case PI:
			case EULER:
			case I:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				constante();
				}
				break;
			case PAREN_IZQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				match(PAREN_IZQ);
				setState(64);
				expresion();
				setState(65);
				match(PAREN_DER);
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

	public static class ScientificContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(calcParser.NUMERO, 0); }
		public ScientificContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scientific; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterScientific(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitScientific(this);
		}
	}

	public final ScientificContext scientific() throws RecognitionException {
		ScientificContext _localctx = new ScientificContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_scientific);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(NUMERO);
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

	public static class ConstanteContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(calcParser.PI, 0); }
		public TerminalNode EULER() { return getToken(calcParser.EULER, 0); }
		public TerminalNode I() { return getToken(calcParser.I, 0); }
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitConstante(this);
		}
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PI) | (1L << EULER) | (1L << I))) != 0)) ) {
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(calcParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(VARIABLE);
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

	public static class FuncContext extends ParserRuleContext {
		public Func_nombreContext func_nombre() {
			return getRuleContext(Func_nombreContext.class,0);
		}
		public TerminalNode PAREN_IZQ() { return getToken(calcParser.PAREN_IZQ, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PAREN_DER() { return getToken(calcParser.PAREN_DER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(calcParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(calcParser.COMMA, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			func_nombre();
			setState(76);
			match(PAREN_IZQ);
			setState(77);
			expresion();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(78);
				match(COMMA);
				setState(79);
				expresion();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(PAREN_DER);
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

	public static class Func_nombreContext extends ParserRuleContext {
		public TerminalNode COS() { return getToken(calcParser.COS, 0); }
		public TerminalNode TAN() { return getToken(calcParser.TAN, 0); }
		public TerminalNode SIN() { return getToken(calcParser.SIN, 0); }
		public TerminalNode ACOS() { return getToken(calcParser.ACOS, 0); }
		public TerminalNode ATAN() { return getToken(calcParser.ATAN, 0); }
		public TerminalNode ASIN() { return getToken(calcParser.ASIN, 0); }
		public TerminalNode LOG() { return getToken(calcParser.LOG, 0); }
		public TerminalNode LN() { return getToken(calcParser.LN, 0); }
		public TerminalNode SQRT() { return getToken(calcParser.SQRT, 0); }
		public Func_nombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_nombre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterFunc_nombre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitFunc_nombre(this);
		}
	}

	public final Func_nombreContext func_nombre() throws RecognitionException {
		Func_nombreContext _localctx = new Func_nombreContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_func_nombre);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COS) | (1L << SIN) | (1L << TAN) | (1L << ACOS) | (1L << ASIN) | (1L << ATAN) | (1L << LN) | (1L << LOG) | (1L << SQRT))) != 0)) ) {
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

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(calcParser.EQ, 0); }
		public TerminalNode GT() { return getToken(calcParser.GT, 0); }
		public TerminalNode LT() { return getToken(calcParser.LT, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitRelop(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36^\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\"\n\3\f\3\16\3%\13\3\3"+
		"\4\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\5\3\5\3\5\7\5\62\n\5\f\5\16\5\65"+
		"\13\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6=\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"F\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13S\n\13\f\13"+
		"\16\13V\13\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\2\7\3\2\16\17\3\2\20\22\3\2\31\33\3\2\3\13\3\2\23\25\2[\2\32"+
		"\3\2\2\2\4\36\3\2\2\2\6&\3\2\2\2\b.\3\2\2\2\n<\3\2\2\2\fE\3\2\2\2\16G"+
		"\3\2\2\2\20I\3\2\2\2\22K\3\2\2\2\24M\3\2\2\2\26Y\3\2\2\2\30[\3\2\2\2\32"+
		"\33\5\4\3\2\33\34\5\30\r\2\34\35\5\4\3\2\35\3\3\2\2\2\36#\5\6\4\2\37 "+
		"\t\2\2\2 \"\5\6\4\2!\37\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\5\3\2"+
		"\2\2%#\3\2\2\2&+\5\b\5\2\'(\t\3\2\2(*\5\b\5\2)\'\3\2\2\2*-\3\2\2\2+)\3"+
		"\2\2\2+,\3\2\2\2,\7\3\2\2\2-+\3\2\2\2.\63\5\n\6\2/\60\7\30\2\2\60\62\5"+
		"\n\6\2\61/\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\t\3\2"+
		"\2\2\65\63\3\2\2\2\66\67\7\16\2\2\67=\5\n\6\289\7\17\2\29=\5\n\6\2:=\5"+
		"\24\13\2;=\5\f\7\2<\66\3\2\2\2<8\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\13\3\2\2"+
		"\2>F\5\16\b\2?F\5\22\n\2@F\5\20\t\2AB\7\f\2\2BC\5\4\3\2CD\7\r\2\2DF\3"+
		"\2\2\2E>\3\2\2\2E?\3\2\2\2E@\3\2\2\2EA\3\2\2\2F\r\3\2\2\2GH\7\35\2\2H"+
		"\17\3\2\2\2IJ\t\4\2\2J\21\3\2\2\2KL\7\34\2\2L\23\3\2\2\2MN\5\26\f\2NO"+
		"\7\f\2\2OT\5\4\3\2PQ\7\26\2\2QS\5\4\3\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2"+
		"TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\r\2\2X\25\3\2\2\2YZ\t\5\2\2Z\27\3\2"+
		"\2\2[\\\t\6\2\2\\\31\3\2\2\2\b#+\63<ET";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}