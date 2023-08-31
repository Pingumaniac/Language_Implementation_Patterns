package types;
// Generated from Types.g by ANTLR 4.13.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TypesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9,
		T__9=10, T__10=11, T__11=12, T__12=13, VAR_DECL=14, ID=15, EXPR=16, CHAR=17,
		INT=18, FLOAT=19, CALL=20, ELIST=21, UNARY_MINUS=22, UNARY_NOT=23, ADDR=24,
		DEREF=25, SEMI=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
			"T__9", "T__10", "T__11", "T__12", "VAR_DECL", "ID", "EXPR", "CHAR",
			"INT", "FLOAT", "CALL", "ELIST", "UNARY_MINUS", "UNARY_NOT", "ADDR",
			"DEREF", "SEMI"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'return'", "'true'", "'false'", "'.'", "'+'", "'/'", "'<'",
			"'>'", "'<='", "'>='", "'!='", "'=='", "'var'", null, "'='", null, null,
			null, "'call'", "'elist'", "'-'", "'!'", "'&'", "'*'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, "VAR_DECL", "ID", "EXPR", "CHAR", "INT", "FLOAT", "CALL",
			"ELIST", "UNARY_MINUS", "UNARY_NOT", "ADDR", "DEREF", "SEMI"
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


	  SymbolTable symtab;
	  Type evalType;
	  public Types(CharStream input, SymbolTable symtab) {
	    this(input);
	    this.symtab = symtab;
	  }


	public TypesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Types.g"; }

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
		"\u0004\u0000\u001a\u009f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0005\u000eg\b\u000e\n\u000e\f\u000ej\t\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011"+
		"s\b\u0011\u000b\u0011\f\u0011t\u0001\u0012\u0004\u0012x\b\u0012\u000b"+
		"\u0012\f\u0012y\u0001\u0012\u0001\u0012\u0005\u0012~\b\u0012\n\u0012\f"+
		"\u0012\u0081\t\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u0085\b\u0012"+
		"\u000b\u0012\f\u0012\u0086\u0003\u0012\u0089\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0000\u0000\u001a\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a\u0001\u0000"+
		"\u0004\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u0000\'\'\u0001\u0000"+
		"09\u00a4\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003"+
		"\u0001\u0000\u0000\u0000\u00015\u0001\u0000\u0000\u0000\u00038\u0001\u0000"+
		"\u0000\u0000\u0005?\u0001\u0000\u0000\u0000\u0007D\u0001\u0000\u0000\u0000"+
		"\tJ\u0001\u0000\u0000\u0000\u000bL\u0001\u0000\u0000\u0000\rN\u0001\u0000"+
		"\u0000\u0000\u000fP\u0001\u0000\u0000\u0000\u0011R\u0001\u0000\u0000\u0000"+
		"\u0013T\u0001\u0000\u0000\u0000\u0015W\u0001\u0000\u0000\u0000\u0017Z"+
		"\u0001\u0000\u0000\u0000\u0019]\u0001\u0000\u0000\u0000\u001b`\u0001\u0000"+
		"\u0000\u0000\u001dd\u0001\u0000\u0000\u0000\u001fk\u0001\u0000\u0000\u0000"+
		"!m\u0001\u0000\u0000\u0000#r\u0001\u0000\u0000\u0000%\u0088\u0001\u0000"+
		"\u0000\u0000\'\u008a\u0001\u0000\u0000\u0000)\u008f\u0001\u0000\u0000"+
		"\u0000+\u0095\u0001\u0000\u0000\u0000-\u0097\u0001\u0000\u0000\u0000/"+
		"\u0099\u0001\u0000\u0000\u00001\u009b\u0001\u0000\u0000\u00003\u009d\u0001"+
		"\u0000\u0000\u000056\u0005i\u0000\u000067\u0005f\u0000\u00007\u0002\u0001"+
		"\u0000\u0000\u000089\u0005r\u0000\u00009:\u0005e\u0000\u0000:;\u0005t"+
		"\u0000\u0000;<\u0005u\u0000\u0000<=\u0005r\u0000\u0000=>\u0005n\u0000"+
		"\u0000>\u0004\u0001\u0000\u0000\u0000?@\u0005t\u0000\u0000@A\u0005r\u0000"+
		"\u0000AB\u0005u\u0000\u0000BC\u0005e\u0000\u0000C\u0006\u0001\u0000\u0000"+
		"\u0000DE\u0005f\u0000\u0000EF\u0005a\u0000\u0000FG\u0005l\u0000\u0000"+
		"GH\u0005s\u0000\u0000HI\u0005e\u0000\u0000I\b\u0001\u0000\u0000\u0000"+
		"JK\u0005.\u0000\u0000K\n\u0001\u0000\u0000\u0000LM\u0005+\u0000\u0000"+
		"M\f\u0001\u0000\u0000\u0000NO\u0005/\u0000\u0000O\u000e\u0001\u0000\u0000"+
		"\u0000PQ\u0005<\u0000\u0000Q\u0010\u0001\u0000\u0000\u0000RS\u0005>\u0000"+
		"\u0000S\u0012\u0001\u0000\u0000\u0000TU\u0005<\u0000\u0000UV\u0005=\u0000"+
		"\u0000V\u0014\u0001\u0000\u0000\u0000WX\u0005>\u0000\u0000XY\u0005=\u0000"+
		"\u0000Y\u0016\u0001\u0000\u0000\u0000Z[\u0005!\u0000\u0000[\\\u0005=\u0000"+
		"\u0000\\\u0018\u0001\u0000\u0000\u0000]^\u0005=\u0000\u0000^_\u0005=\u0000"+
		"\u0000_\u001a\u0001\u0000\u0000\u0000`a\u0005v\u0000\u0000ab\u0005a\u0000"+
		"\u0000bc\u0005r\u0000\u0000c\u001c\u0001\u0000\u0000\u0000dh\u0007\u0000"+
		"\u0000\u0000eg\u0007\u0001\u0000\u0000fe\u0001\u0000\u0000\u0000gj\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"i\u001e\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0005=\u0000"+
		"\u0000l \u0001\u0000\u0000\u0000mn\u0005\'\u0000\u0000no\b\u0002\u0000"+
		"\u0000op\u0005\'\u0000\u0000p\"\u0001\u0000\u0000\u0000qs\u0007\u0003"+
		"\u0000\u0000rq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u$\u0001\u0000\u0000\u0000"+
		"vx\u0007\u0003\u0000\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{\u007f\u0005.\u0000\u0000|~\u0007\u0003\u0000\u0000}|\u0001"+
		"\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0089\u0001\u0000\u0000"+
		"\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0084\u0005.\u0000\u0000"+
		"\u0083\u0085\u0007\u0003\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000"+
		"\u0088w\u0001\u0000\u0000\u0000\u0088\u0082\u0001\u0000\u0000\u0000\u0089"+
		"&\u0001\u0000\u0000\u0000\u008a\u008b\u0005c\u0000\u0000\u008b\u008c\u0005"+
		"a\u0000\u0000\u008c\u008d\u0005l\u0000\u0000\u008d\u008e\u0005l\u0000"+
		"\u0000\u008e(\u0001\u0000\u0000\u0000\u008f\u0090\u0005e\u0000\u0000\u0090"+
		"\u0091\u0005l\u0000\u0000\u0091\u0092\u0005i\u0000\u0000\u0092\u0093\u0005"+
		"s\u0000\u0000\u0093\u0094\u0005t\u0000\u0000\u0094*\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005-\u0000\u0000\u0096,\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005!\u0000\u0000\u0098.\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"&\u0000\u0000\u009a0\u0001\u0000\u0000\u0000\u009b\u009c\u0005*\u0000"+
		"\u0000\u009c2\u0001\u0000\u0000\u0000\u009d\u009e\u0005;\u0000\u0000\u009e"+
		"4\u0001\u0000\u0000\u0000\u0007\u0000hty\u007f\u0086\u0088\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
