// Generated from /Users/clalleme/git/testantlr/src/main/resources/smartrfq.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class smartrfqLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, RELATIVE_WAY=2, NUMBER_SUFFIX=3, NUMBER=4, KILO=5, MEGA=6, GIGA=7, 
		PLUS=8, MINUS=9, EQUAL=10, WS=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "RELATIVE_WAY", "NUMBER_SUFFIX", "NUMBER", "KILO", "MEGA", "GIGA", 
		"PLUS", "MINUS", "EQUAL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'z'", null, null, null, null, null, null, "'+'", "'-'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "RELATIVE_WAY", "NUMBER_SUFFIX", "NUMBER", "KILO", "MEGA", 
		"GIGA", "PLUS", "MINUS", "EQUAL", "WS"
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


	public smartrfqLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "smartrfq.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\r=\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\5\4$\n\4\3\5\6"+
		"\5\'\n\5\r\5\16\5(\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\6\f8\n\f\r\f\16\f9\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\3\2\6\4\2MMmm\4\2OOoo\4\2IIii\5\2\13\f\17\17\"\"B\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31"+
		"\3\2\2\2\5\36\3\2\2\2\7#\3\2\2\2\t&\3\2\2\2\13*\3\2\2\2\r,\3\2\2\2\17"+
		".\3\2\2\2\21\60\3\2\2\2\23\62\3\2\2\2\25\64\3\2\2\2\27\67\3\2\2\2\31\32"+
		"\7|\2\2\32\4\3\2\2\2\33\37\5\21\t\2\34\37\5\23\n\2\35\37\5\25\13\2\36"+
		"\33\3\2\2\2\36\34\3\2\2\2\36\35\3\2\2\2\37\6\3\2\2\2 $\5\13\6\2!$\5\r"+
		"\7\2\"$\5\17\b\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2$\b\3\2\2\2%\'\4\62;\2"+
		"&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\n\3\2\2\2*+\t\2\2\2+\f\3\2"+
		"\2\2,-\t\3\2\2-\16\3\2\2\2./\t\4\2\2/\20\3\2\2\2\60\61\7-\2\2\61\22\3"+
		"\2\2\2\62\63\7/\2\2\63\24\3\2\2\2\64\65\7?\2\2\65\26\3\2\2\2\668\t\5\2"+
		"\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\b\f\2\2<"+
		"\30\3\2\2\2\7\2\36#(9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}