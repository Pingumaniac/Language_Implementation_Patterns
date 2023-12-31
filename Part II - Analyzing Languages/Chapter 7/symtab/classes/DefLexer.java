// Generated from Def.g by ANTLR 4.13.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DefLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, BLOCK=3, METHOD_DECL=4, EXTENDS=5, FIELD_DECL=6, VAR_DECL=7, 
		ARG_DECL=8, ID=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "BLOCK", "METHOD_DECL", "EXTENDS", "FIELD_DECL", "VAR_DECL", 
			"ARG_DECL", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'this'", "'BLOCK'", "'METHOD_DECL'", "'extends'", "'FIELD_DECL'", 
			"'VAR_DECL'", "'ARG_DECL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "BLOCK", "METHOD_DECL", "EXTENDS", "FIELD_DECL", "VAR_DECL", 
			"ARG_DECL", "ID"
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


	public DefLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Def.g"; }

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
		"\u0004\u0000\tZ\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0004\bW\b\b\u000b\b\f\bX\u0000"+
		"\u0000\t\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0001\u0000\u0001\u0002\u0000AZazZ\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0001\u0013\u0001\u0000\u0000\u0000\u0003\u0019"+
		"\u0001\u0000\u0000\u0000\u0005\u001e\u0001\u0000\u0000\u0000\u0007$\u0001"+
		"\u0000\u0000\u0000\t0\u0001\u0000\u0000\u0000\u000b8\u0001\u0000\u0000"+
		"\u0000\rC\u0001\u0000\u0000\u0000\u000fL\u0001\u0000\u0000\u0000\u0011"+
		"V\u0001\u0000\u0000\u0000\u0013\u0014\u0005c\u0000\u0000\u0014\u0015\u0005"+
		"l\u0000\u0000\u0015\u0016\u0005a\u0000\u0000\u0016\u0017\u0005s\u0000"+
		"\u0000\u0017\u0018\u0005s\u0000\u0000\u0018\u0002\u0001\u0000\u0000\u0000"+
		"\u0019\u001a\u0005t\u0000\u0000\u001a\u001b\u0005h\u0000\u0000\u001b\u001c"+
		"\u0005i\u0000\u0000\u001c\u001d\u0005s\u0000\u0000\u001d\u0004\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0005B\u0000\u0000\u001f \u0005L\u0000\u0000"+
		" !\u0005O\u0000\u0000!\"\u0005C\u0000\u0000\"#\u0005K\u0000\u0000#\u0006"+
		"\u0001\u0000\u0000\u0000$%\u0005M\u0000\u0000%&\u0005E\u0000\u0000&\'"+
		"\u0005T\u0000\u0000\'(\u0005H\u0000\u0000()\u0005O\u0000\u0000)*\u0005"+
		"D\u0000\u0000*+\u0005_\u0000\u0000+,\u0005D\u0000\u0000,-\u0005E\u0000"+
		"\u0000-.\u0005C\u0000\u0000./\u0005L\u0000\u0000/\b\u0001\u0000\u0000"+
		"\u000001\u0005e\u0000\u000012\u0005x\u0000\u000023\u0005t\u0000\u0000"+
		"34\u0005e\u0000\u000045\u0005n\u0000\u000056\u0005d\u0000\u000067\u0005"+
		"s\u0000\u00007\n\u0001\u0000\u0000\u000089\u0005F\u0000\u00009:\u0005"+
		"I\u0000\u0000:;\u0005E\u0000\u0000;<\u0005L\u0000\u0000<=\u0005D\u0000"+
		"\u0000=>\u0005_\u0000\u0000>?\u0005D\u0000\u0000?@\u0005E\u0000\u0000"+
		"@A\u0005C\u0000\u0000AB\u0005L\u0000\u0000B\f\u0001\u0000\u0000\u0000"+
		"CD\u0005V\u0000\u0000DE\u0005A\u0000\u0000EF\u0005R\u0000\u0000FG\u0005"+
		"_\u0000\u0000GH\u0005D\u0000\u0000HI\u0005E\u0000\u0000IJ\u0005C\u0000"+
		"\u0000JK\u0005L\u0000\u0000K\u000e\u0001\u0000\u0000\u0000LM\u0005A\u0000"+
		"\u0000MN\u0005R\u0000\u0000NO\u0005G\u0000\u0000OP\u0005_\u0000\u0000"+
		"PQ\u0005D\u0000\u0000QR\u0005E\u0000\u0000RS\u0005C\u0000\u0000ST\u0005"+
		"L\u0000\u0000T\u0010\u0001\u0000\u0000\u0000UW\u0007\u0000\u0000\u0000"+
		"VU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Y\u0012\u0001\u0000\u0000\u0000\u0002"+
		"\u0000X\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}