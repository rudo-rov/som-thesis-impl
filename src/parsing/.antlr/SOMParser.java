// Generated from c:\diplomka\som-thesis-impl\src\parsing\SOM.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SOMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KEYWORD=1, IDENTIFIER=2, WHITESPACE=3, COMMENT=4, INTEGER=5, DOUBLE=6, 
		STRING=7, PLUS=8, MINUS=9, MULT=10, DIV=11, MOD=12, EQUALS=13, GREATER=14, 
		LESS=15, GREATER_EQ=16, LESS_EQ=17, ASSIGN=18, SEPARATOR=19, VBAR=20, 
		SIMPLE_QUOTE=21, COLON=22, COMMA=23, RETURN=24, PERIOD=25, POUND=26, OPEN_PAR=27, 
		CLOSE_PAR=28, NEW_BLOCK=29, CLOSE_BLOCK=30;
	public static final int
		RULE_classDefinition = 0, RULE_superclass = 1, RULE_instanceFields = 2, 
		RULE_classFields = 3, RULE_method = 4, RULE_methodBlock = 5, RULE_blockContents = 6, 
		RULE_localDefinitions = 7, RULE_blockBody = 8, RULE_result = 9, RULE_expression = 10, 
		RULE_assignation = 11, RULE_assignments = 12, RULE_assignment = 13, RULE_evaluation = 14, 
		RULE_primary = 15, RULE_messages = 16, RULE_unaryMessage = 17, RULE_binaryMessage = 18, 
		RULE_binaryOperand = 19, RULE_keywordMessage = 20, RULE_formula = 21, 
		RULE_nestedTerm = 22, RULE_nestedBlock = 23, RULE_blockPattern = 24, RULE_blockArgs = 25, 
		RULE_variable = 26, RULE_pattern = 27, RULE_unaryPattern = 28, RULE_unarySelector = 29, 
		RULE_binaryPattern = 30, RULE_keywordPattern = 31, RULE_binarySelector = 32, 
		RULE_argument = 33, RULE_literal = 34, RULE_literalNumber = 35, RULE_literalString = 36, 
		RULE_literalArray = 37, RULE_literalSymbol = 38, RULE_selector = 39, RULE_keywordSelector = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"classDefinition", "superclass", "instanceFields", "classFields", "method", 
			"methodBlock", "blockContents", "localDefinitions", "blockBody", "result", 
			"expression", "assignation", "assignments", "assignment", "evaluation", 
			"primary", "messages", "unaryMessage", "binaryMessage", "binaryOperand", 
			"keywordMessage", "formula", "nestedTerm", "nestedBlock", "blockPattern", 
			"blockArgs", "variable", "pattern", "unaryPattern", "unarySelector", 
			"binaryPattern", "keywordPattern", "binarySelector", "argument", "literal", 
			"literalNumber", "literalString", "literalArray", "literalSymbol", "selector", 
			"keywordSelector"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'+'", "'-'", "'*'", 
			"'/'", "'\\'", "'='", "'>'", "'<'", "'>='", "'<='", "':='", "'----'", 
			"'|'", "'''", "':'", "','", "'^'", "'.'", "'#'", "'('", "')'", "'['", 
			"']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KEYWORD", "IDENTIFIER", "WHITESPACE", "COMMENT", "INTEGER", "DOUBLE", 
			"STRING", "PLUS", "MINUS", "MULT", "DIV", "MOD", "EQUALS", "GREATER", 
			"LESS", "GREATER_EQ", "LESS_EQ", "ASSIGN", "SEPARATOR", "VBAR", "SIMPLE_QUOTE", 
			"COLON", "COMMA", "RETURN", "PERIOD", "POUND", "OPEN_PAR", "CLOSE_PAR", 
			"NEW_BLOCK", "CLOSE_BLOCK"
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
	public String getGrammarFileName() { return "SOM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SOMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ClassDefinitionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SOMParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(SOMParser.EQUALS, 0); }
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public InstanceFieldsContext instanceFields() {
			return getRuleContext(InstanceFieldsContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SOMParser.CLOSE_PAR, 0); }
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public TerminalNode SEPARATOR() { return getToken(SOMParser.SEPARATOR, 0); }
		public ClassFieldsContext classFields() {
			return getRuleContext(ClassFieldsContext.class,0);
		}
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_classDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(IDENTIFIER);
			setState(83);
			match(EQUALS);
			setState(84);
			superclass();
			setState(85);
			instanceFields();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << IDENTIFIER) | (1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV) | (1L << MOD) | (1L << EQUALS) | (1L << GREATER) | (1L << LESS) | (1L << GREATER_EQ) | (1L << LESS_EQ) | (1L << VBAR))) != 0)) {
				{
				{
				setState(86);
				method();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR) {
				{
				setState(92);
				match(SEPARATOR);
				setState(93);
				classFields();
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << IDENTIFIER) | (1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV) | (1L << MOD) | (1L << EQUALS) | (1L << GREATER) | (1L << LESS) | (1L << GREATER_EQ) | (1L << LESS_EQ) | (1L << VBAR))) != 0)) {
					{
					{
					setState(94);
					method();
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(102);
			match(CLOSE_PAR);
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

	public static class SuperclassContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SOMParser.OPEN_PAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOMParser.IDENTIFIER, 0); }
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_superclass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(104);
				match(IDENTIFIER);
				}
			}

			setState(107);
			match(OPEN_PAR);
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

	public static class InstanceFieldsContext extends ParserRuleContext {
		public List<TerminalNode> VBAR() { return getTokens(SOMParser.VBAR); }
		public TerminalNode VBAR(int i) {
			return getToken(SOMParser.VBAR, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public InstanceFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceFields; }
	}

	public final InstanceFieldsContext instanceFields() throws RecognitionException {
		InstanceFieldsContext _localctx = new InstanceFieldsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instanceFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(109);
				match(VBAR);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(110);
					variable();
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(116);
				match(VBAR);
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

	public static class ClassFieldsContext extends ParserRuleContext {
		public List<TerminalNode> VBAR() { return getTokens(SOMParser.VBAR); }
		public TerminalNode VBAR(int i) {
			return getToken(SOMParser.VBAR, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ClassFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classFields; }
	}

	public final ClassFieldsContext classFields() throws RecognitionException {
		ClassFieldsContext _localctx = new ClassFieldsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(119);
				match(VBAR);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(120);
					variable();
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				match(VBAR);
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

	public static class MethodContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(SOMParser.EQUALS, 0); }
		public MethodBlockContext methodBlock() {
			return getRuleContext(MethodBlockContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			pattern();
			setState(130);
			match(EQUALS);
			setState(131);
			methodBlock();
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

	public static class MethodBlockContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SOMParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SOMParser.CLOSE_PAR, 0); }
		public BlockContentsContext blockContents() {
			return getRuleContext(BlockContentsContext.class,0);
		}
		public MethodBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBlock; }
	}

	public final MethodBlockContext methodBlock() throws RecognitionException {
		MethodBlockContext _localctx = new MethodBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(OPEN_PAR);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << MINUS) | (1L << VBAR) | (1L << RETURN) | (1L << POUND) | (1L << OPEN_PAR) | (1L << NEW_BLOCK))) != 0)) {
				{
				setState(134);
				blockContents();
				}
			}

			setState(137);
			match(CLOSE_PAR);
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

	public static class BlockContentsContext extends ParserRuleContext {
		public BlockBodyContext blockBody() {
			return getRuleContext(BlockBodyContext.class,0);
		}
		public List<TerminalNode> VBAR() { return getTokens(SOMParser.VBAR); }
		public TerminalNode VBAR(int i) {
			return getToken(SOMParser.VBAR, i);
		}
		public LocalDefinitionsContext localDefinitions() {
			return getRuleContext(LocalDefinitionsContext.class,0);
		}
		public BlockContentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockContents; }
	}

	public final BlockContentsContext blockContents() throws RecognitionException {
		BlockContentsContext _localctx = new BlockContentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blockContents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VBAR) {
				{
				setState(139);
				match(VBAR);
				setState(140);
				localDefinitions();
				setState(141);
				match(VBAR);
				}
			}

			setState(145);
			blockBody();
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

	public static class LocalDefinitionsContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public LocalDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDefinitions; }
	}

	public final LocalDefinitionsContext localDefinitions() throws RecognitionException {
		LocalDefinitionsContext _localctx = new LocalDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_localDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(147);
				variable();
				}
				}
				setState(152);
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

	public static class BlockBodyContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SOMParser.RETURN, 0); }
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(SOMParser.PERIOD, 0); }
		public BlockBodyContext blockBody() {
			return getRuleContext(BlockBodyContext.class,0);
		}
		public BlockBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockBody; }
	}

	public final BlockBodyContext blockBody() throws RecognitionException {
		BlockBodyContext _localctx = new BlockBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blockBody);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(RETURN);
				setState(154);
				result();
				}
				break;
			case IDENTIFIER:
			case INTEGER:
			case DOUBLE:
			case STRING:
			case MINUS:
			case POUND:
			case OPEN_PAR:
			case NEW_BLOCK:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				expression();
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PERIOD) {
					{
					setState(156);
					match(PERIOD);
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << MINUS) | (1L << RETURN) | (1L << POUND) | (1L << OPEN_PAR) | (1L << NEW_BLOCK))) != 0)) {
						{
						setState(157);
						blockBody();
						}
					}

					}
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

	public static class ResultContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(SOMParser.PERIOD, 0); }
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_result);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			expression();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERIOD) {
				{
				setState(165);
				match(PERIOD);
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public EvaluationContext evaluation() {
			return getRuleContext(EvaluationContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				assignation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				evaluation();
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

	public static class AssignationContext extends ParserRuleContext {
		public AssignmentsContext assignments() {
			return getRuleContext(AssignmentsContext.class,0);
		}
		public EvaluationContext evaluation() {
			return getRuleContext(EvaluationContext.class,0);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			assignments();
			setState(173);
			evaluation();
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

	public static class AssignmentsContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public AssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignments; }
	}

	public final AssignmentsContext assignments() throws RecognitionException {
		AssignmentsContext _localctx = new AssignmentsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(175);
					assignment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(178); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SOMParser.ASSIGN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			variable();
			setState(181);
			match(ASSIGN);
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

	public static class EvaluationContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MessagesContext messages() {
			return getRuleContext(MessagesContext.class,0);
		}
		public EvaluationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evaluation; }
	}

	public final EvaluationContext evaluation() throws RecognitionException {
		EvaluationContext _localctx = new EvaluationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_evaluation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			primary();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD) | (1L << IDENTIFIER) | (1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV) | (1L << MOD) | (1L << EQUALS) | (1L << GREATER) | (1L << LESS) | (1L << GREATER_EQ) | (1L << LESS_EQ) | (1L << VBAR))) != 0)) {
				{
				setState(184);
				messages();
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

	public static class PrimaryContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NestedTermContext nestedTerm() {
			return getRuleContext(NestedTermContext.class,0);
		}
		public NestedBlockContext nestedBlock() {
			return getRuleContext(NestedBlockContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primary);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				variable();
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				nestedTerm();
				}
				break;
			case NEW_BLOCK:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				nestedBlock();
				}
				break;
			case INTEGER:
			case DOUBLE:
			case STRING:
			case MINUS:
			case POUND:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				literal();
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

	public static class MessagesContext extends ParserRuleContext {
		public List<UnaryMessageContext> unaryMessage() {
			return getRuleContexts(UnaryMessageContext.class);
		}
		public UnaryMessageContext unaryMessage(int i) {
			return getRuleContext(UnaryMessageContext.class,i);
		}
		public List<BinaryMessageContext> binaryMessage() {
			return getRuleContexts(BinaryMessageContext.class);
		}
		public BinaryMessageContext binaryMessage(int i) {
			return getRuleContext(BinaryMessageContext.class,i);
		}
		public KeywordMessageContext keywordMessage() {
			return getRuleContext(KeywordMessageContext.class,0);
		}
		public MessagesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messages; }
	}

	public final MessagesContext messages() throws RecognitionException {
		MessagesContext _localctx = new MessagesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_messages);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(193);
					unaryMessage();
					}
					}
					setState(196); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV) | (1L << MOD) | (1L << EQUALS) | (1L << GREATER) | (1L << LESS) | (1L << GREATER_EQ) | (1L << LESS_EQ) | (1L << VBAR))) != 0)) {
					{
					{
					setState(198);
					binaryMessage();
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEYWORD) {
					{
					setState(204);
					keywordMessage();
					}
				}

				}
				break;
			case PLUS:
			case MINUS:
			case MULT:
			case DIV:
			case MOD:
			case EQUALS:
			case GREATER:
			case LESS:
			case GREATER_EQ:
			case LESS_EQ:
			case VBAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(207);
					binaryMessage();
					}
					}
					setState(210); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV) | (1L << MOD) | (1L << EQUALS) | (1L << GREATER) | (1L << LESS) | (1L << GREATER_EQ) | (1L << LESS_EQ) | (1L << VBAR))) != 0) );
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEYWORD) {
					{
					setState(212);
					keywordMessage();
					}
				}

				}
				break;
			case KEYWORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				keywordMessage();
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

	public static class UnaryMessageContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SOMParser.IDENTIFIER, 0); }
		public UnaryMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryMessage; }
	}

	public final UnaryMessageContext unaryMessage() throws RecognitionException {
		UnaryMessageContext _localctx = new UnaryMessageContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unaryMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(IDENTIFIER);
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

	public static class BinaryMessageContext extends ParserRuleContext {
		public BinarySelectorContext binarySelector() {
			return getRuleContext(BinarySelectorContext.class,0);
		}
		public BinaryOperandContext binaryOperand() {
			return getRuleContext(BinaryOperandContext.class,0);
		}
		public BinaryMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryMessage; }
	}

	public final BinaryMessageContext binaryMessage() throws RecognitionException {
		BinaryMessageContext _localctx = new BinaryMessageContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_binaryMessage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			binarySelector();
			setState(221);
			binaryOperand();
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

	public static class BinaryOperandContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<UnaryMessageContext> unaryMessage() {
			return getRuleContexts(UnaryMessageContext.class);
		}
		public UnaryMessageContext unaryMessage(int i) {
			return getRuleContext(UnaryMessageContext.class,i);
		}
		public BinaryOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperand; }
	}

	public final BinaryOperandContext binaryOperand() throws RecognitionException {
		BinaryOperandContext _localctx = new BinaryOperandContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_binaryOperand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			primary();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(224);
				unaryMessage();
				}
				}
				setState(229);
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

	public static class KeywordMessageContext extends ParserRuleContext {
		public List<TerminalNode> KEYWORD() { return getTokens(SOMParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SOMParser.KEYWORD, i);
		}
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public KeywordMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordMessage; }
	}

	public final KeywordMessageContext keywordMessage() throws RecognitionException {
		KeywordMessageContext _localctx = new KeywordMessageContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_keywordMessage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(230);
				match(KEYWORD);
				setState(231);
				formula();
				}
				}
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KEYWORD );
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

	public static class FormulaContext extends ParserRuleContext {
		public BinaryOperandContext binaryOperand() {
			return getRuleContext(BinaryOperandContext.class,0);
		}
		public List<BinaryMessageContext> binaryMessage() {
			return getRuleContexts(BinaryMessageContext.class);
		}
		public BinaryMessageContext binaryMessage(int i) {
			return getRuleContext(BinaryMessageContext.class,i);
		}
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_formula);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			binaryOperand();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV) | (1L << MOD) | (1L << EQUALS) | (1L << GREATER) | (1L << LESS) | (1L << GREATER_EQ) | (1L << LESS_EQ) | (1L << VBAR))) != 0)) {
				{
				{
				setState(237);
				binaryMessage();
				}
				}
				setState(242);
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

	public static class NestedTermContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SOMParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SOMParser.CLOSE_PAR, 0); }
		public NestedTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedTerm; }
	}

	public final NestedTermContext nestedTerm() throws RecognitionException {
		NestedTermContext _localctx = new NestedTermContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_nestedTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(OPEN_PAR);
			setState(244);
			expression();
			setState(245);
			match(CLOSE_PAR);
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

	public static class NestedBlockContext extends ParserRuleContext {
		public TerminalNode NEW_BLOCK() { return getToken(SOMParser.NEW_BLOCK, 0); }
		public TerminalNode CLOSE_BLOCK() { return getToken(SOMParser.CLOSE_BLOCK, 0); }
		public BlockPatternContext blockPattern() {
			return getRuleContext(BlockPatternContext.class,0);
		}
		public BlockContentsContext blockContents() {
			return getRuleContext(BlockContentsContext.class,0);
		}
		public NestedBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedBlock; }
	}

	public final NestedBlockContext nestedBlock() throws RecognitionException {
		NestedBlockContext _localctx = new NestedBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_nestedBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(NEW_BLOCK);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(248);
				blockPattern();
				}
			}

			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << MINUS) | (1L << VBAR) | (1L << RETURN) | (1L << POUND) | (1L << OPEN_PAR) | (1L << NEW_BLOCK))) != 0)) {
				{
				setState(251);
				blockContents();
				}
			}

			setState(254);
			match(CLOSE_BLOCK);
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

	public static class BlockPatternContext extends ParserRuleContext {
		public BlockArgsContext blockArgs() {
			return getRuleContext(BlockArgsContext.class,0);
		}
		public TerminalNode VBAR() { return getToken(SOMParser.VBAR, 0); }
		public BlockPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockPattern; }
	}

	public final BlockPatternContext blockPattern() throws RecognitionException {
		BlockPatternContext _localctx = new BlockPatternContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_blockPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			blockArgs();
			setState(257);
			match(VBAR);
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

	public static class BlockArgsContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(SOMParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SOMParser.COLON, i);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public BlockArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockArgs; }
	}

	public final BlockArgsContext blockArgs() throws RecognitionException {
		BlockArgsContext _localctx = new BlockArgsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_blockArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(259);
				match(COLON);
				setState(260);
				argument();
				}
				}
				setState(263); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COLON );
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
		public TerminalNode IDENTIFIER() { return getToken(SOMParser.IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(IDENTIFIER);
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

	public static class PatternContext extends ParserRuleContext {
		public UnaryPatternContext unaryPattern() {
			return getRuleContext(UnaryPatternContext.class,0);
		}
		public KeywordPatternContext keywordPattern() {
			return getRuleContext(KeywordPatternContext.class,0);
		}
		public BinaryPatternContext binaryPattern() {
			return getRuleContext(BinaryPatternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_pattern);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				unaryPattern();
				}
				break;
			case KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				keywordPattern();
				}
				break;
			case PLUS:
			case MINUS:
			case MULT:
			case DIV:
			case MOD:
			case EQUALS:
			case GREATER:
			case LESS:
			case GREATER_EQ:
			case LESS_EQ:
			case VBAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				binaryPattern();
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

	public static class UnaryPatternContext extends ParserRuleContext {
		public UnarySelectorContext unarySelector() {
			return getRuleContext(UnarySelectorContext.class,0);
		}
		public UnaryPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryPattern; }
	}

	public final UnaryPatternContext unaryPattern() throws RecognitionException {
		UnaryPatternContext _localctx = new UnaryPatternContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_unaryPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			unarySelector();
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

	public static class UnarySelectorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SOMParser.IDENTIFIER, 0); }
		public UnarySelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unarySelector; }
	}

	public final UnarySelectorContext unarySelector() throws RecognitionException {
		UnarySelectorContext _localctx = new UnarySelectorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_unarySelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(IDENTIFIER);
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

	public static class BinaryPatternContext extends ParserRuleContext {
		public BinarySelectorContext binarySelector() {
			return getRuleContext(BinarySelectorContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public BinaryPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryPattern; }
	}

	public final BinaryPatternContext binaryPattern() throws RecognitionException {
		BinaryPatternContext _localctx = new BinaryPatternContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_binaryPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			binarySelector();
			setState(277);
			argument();
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

	public static class KeywordPatternContext extends ParserRuleContext {
		public List<TerminalNode> KEYWORD() { return getTokens(SOMParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SOMParser.KEYWORD, i);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public KeywordPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordPattern; }
	}

	public final KeywordPatternContext keywordPattern() throws RecognitionException {
		KeywordPatternContext _localctx = new KeywordPatternContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_keywordPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(279);
				match(KEYWORD);
				setState(280);
				argument();
				}
				}
				setState(283); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KEYWORD );
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

	public static class BinarySelectorContext extends ParserRuleContext {
		public TerminalNode VBAR() { return getToken(SOMParser.VBAR, 0); }
		public TerminalNode PLUS() { return getToken(SOMParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SOMParser.MINUS, 0); }
		public TerminalNode EQUALS() { return getToken(SOMParser.EQUALS, 0); }
		public TerminalNode MULT() { return getToken(SOMParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(SOMParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SOMParser.MOD, 0); }
		public TerminalNode GREATER() { return getToken(SOMParser.GREATER, 0); }
		public TerminalNode GREATER_EQ() { return getToken(SOMParser.GREATER_EQ, 0); }
		public TerminalNode LESS() { return getToken(SOMParser.LESS, 0); }
		public TerminalNode LESS_EQ() { return getToken(SOMParser.LESS_EQ, 0); }
		public BinarySelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binarySelector; }
	}

	public final BinarySelectorContext binarySelector() throws RecognitionException {
		BinarySelectorContext _localctx = new BinarySelectorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_binarySelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV) | (1L << MOD) | (1L << EQUALS) | (1L << GREATER) | (1L << LESS) | (1L << GREATER_EQ) | (1L << LESS_EQ) | (1L << VBAR))) != 0)) ) {
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

	public static class ArgumentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			variable();
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralNumberContext literalNumber() {
			return getRuleContext(LiteralNumberContext.class,0);
		}
		public LiteralStringContext literalString() {
			return getRuleContext(LiteralStringContext.class,0);
		}
		public LiteralArrayContext literalArray() {
			return getRuleContext(LiteralArrayContext.class,0);
		}
		public LiteralSymbolContext literalSymbol() {
			return getRuleContext(LiteralSymbolContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_literal);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				literalNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				literalString();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				literalArray();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				literalSymbol();
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

	public static class LiteralNumberContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SOMParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(SOMParser.DOUBLE, 0); }
		public TerminalNode MINUS() { return getToken(SOMParser.MINUS, 0); }
		public LiteralNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalNumber; }
	}

	public final LiteralNumberContext literalNumber() throws RecognitionException {
		LiteralNumberContext _localctx = new LiteralNumberContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_literalNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(295);
				match(MINUS);
				}
			}

			setState(298);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==DOUBLE) ) {
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

	public static class LiteralStringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SOMParser.STRING, 0); }
		public LiteralStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalString; }
	}

	public final LiteralStringContext literalString() throws RecognitionException {
		LiteralStringContext _localctx = new LiteralStringContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_literalString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(STRING);
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

	public static class LiteralArrayContext extends ParserRuleContext {
		public TerminalNode POUND() { return getToken(SOMParser.POUND, 0); }
		public TerminalNode NEW_BLOCK() { return getToken(SOMParser.NEW_BLOCK, 0); }
		public TerminalNode CLOSE_BLOCK() { return getToken(SOMParser.CLOSE_BLOCK, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public LiteralArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalArray; }
	}

	public final LiteralArrayContext literalArray() throws RecognitionException {
		LiteralArrayContext _localctx = new LiteralArrayContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_literalArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(POUND);
			setState(303);
			match(NEW_BLOCK);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << DOUBLE) | (1L << STRING) | (1L << MINUS) | (1L << POUND))) != 0)) {
				{
				{
				setState(304);
				literal();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			match(CLOSE_BLOCK);
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

	public static class LiteralSymbolContext extends ParserRuleContext {
		public TerminalNode POUND() { return getToken(SOMParser.POUND, 0); }
		public TerminalNode STRING() { return getToken(SOMParser.STRING, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public LiteralSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalSymbol; }
	}

	public final LiteralSymbolContext literalSymbol() throws RecognitionException {
		LiteralSymbolContext _localctx = new LiteralSymbolContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_literalSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(POUND);
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(313);
				match(STRING);
				}
				break;
			case KEYWORD:
			case IDENTIFIER:
			case PLUS:
			case MINUS:
			case MULT:
			case DIV:
			case MOD:
			case EQUALS:
			case GREATER:
			case LESS:
			case GREATER_EQ:
			case LESS_EQ:
			case VBAR:
				{
				setState(314);
				selector();
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

	public static class SelectorContext extends ParserRuleContext {
		public BinarySelectorContext binarySelector() {
			return getRuleContext(BinarySelectorContext.class,0);
		}
		public KeywordSelectorContext keywordSelector() {
			return getRuleContext(KeywordSelectorContext.class,0);
		}
		public UnarySelectorContext unarySelector() {
			return getRuleContext(UnarySelectorContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_selector);
		try {
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case MULT:
			case DIV:
			case MOD:
			case EQUALS:
			case GREATER:
			case LESS:
			case GREATER_EQ:
			case LESS_EQ:
			case VBAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				binarySelector();
				}
				break;
			case KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				keywordSelector();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				unarySelector();
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

	public static class KeywordSelectorContext extends ParserRuleContext {
		public List<TerminalNode> KEYWORD() { return getTokens(SOMParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SOMParser.KEYWORD, i);
		}
		public KeywordSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordSelector; }
	}

	public final KeywordSelectorContext keywordSelector() throws RecognitionException {
		KeywordSelectorContext _localctx = new KeywordSelectorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_keywordSelector);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(323); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(322);
					match(KEYWORD);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(325); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u014a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2\3\2\7\2b\n\2\f\2\16\2e\13"+
		"\2\5\2g\n\2\3\2\3\2\3\3\5\3l\n\3\3\3\3\3\3\4\3\4\7\4r\n\4\f\4\16\4u\13"+
		"\4\3\4\5\4x\n\4\3\5\3\5\7\5|\n\5\f\5\16\5\177\13\5\3\5\5\5\u0082\n\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\5\7\u008a\n\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0092"+
		"\n\b\3\b\3\b\3\t\7\t\u0097\n\t\f\t\16\t\u009a\13\t\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u00a1\n\n\5\n\u00a3\n\n\5\n\u00a5\n\n\3\13\3\13\5\13\u00a9\n\13\3"+
		"\f\3\f\5\f\u00ad\n\f\3\r\3\r\3\r\3\16\6\16\u00b3\n\16\r\16\16\16\u00b4"+
		"\3\17\3\17\3\17\3\20\3\20\5\20\u00bc\n\20\3\21\3\21\3\21\3\21\5\21\u00c2"+
		"\n\21\3\22\6\22\u00c5\n\22\r\22\16\22\u00c6\3\22\7\22\u00ca\n\22\f\22"+
		"\16\22\u00cd\13\22\3\22\5\22\u00d0\n\22\3\22\6\22\u00d3\n\22\r\22\16\22"+
		"\u00d4\3\22\5\22\u00d8\n\22\3\22\5\22\u00db\n\22\3\23\3\23\3\24\3\24\3"+
		"\24\3\25\3\25\7\25\u00e4\n\25\f\25\16\25\u00e7\13\25\3\26\3\26\6\26\u00eb"+
		"\n\26\r\26\16\26\u00ec\3\27\3\27\7\27\u00f1\n\27\f\27\16\27\u00f4\13\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\5\31\u00fc\n\31\3\31\5\31\u00ff\n\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\33\3\33\6\33\u0108\n\33\r\33\16\33\u0109\3\34"+
		"\3\34\3\35\3\35\3\35\5\35\u0111\n\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3"+
		"!\6!\u011c\n!\r!\16!\u011d\3\"\3\"\3#\3#\3$\3$\3$\3$\5$\u0128\n$\3%\5"+
		"%\u012b\n%\3%\3%\3&\3&\3\'\3\'\3\'\7\'\u0134\n\'\f\'\16\'\u0137\13\'\3"+
		"\'\3\'\3(\3(\3(\5(\u013e\n(\3)\3)\3)\5)\u0143\n)\3*\6*\u0146\n*\r*\16"+
		"*\u0147\3*\2\2+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPR\2\4\4\2\n\23\26\26\3\2\7\b\2\u014e\2T\3\2\2\2\4k"+
		"\3\2\2\2\6w\3\2\2\2\b\u0081\3\2\2\2\n\u0083\3\2\2\2\f\u0087\3\2\2\2\16"+
		"\u0091\3\2\2\2\20\u0098\3\2\2\2\22\u00a4\3\2\2\2\24\u00a6\3\2\2\2\26\u00ac"+
		"\3\2\2\2\30\u00ae\3\2\2\2\32\u00b2\3\2\2\2\34\u00b6\3\2\2\2\36\u00b9\3"+
		"\2\2\2 \u00c1\3\2\2\2\"\u00da\3\2\2\2$\u00dc\3\2\2\2&\u00de\3\2\2\2(\u00e1"+
		"\3\2\2\2*\u00ea\3\2\2\2,\u00ee\3\2\2\2.\u00f5\3\2\2\2\60\u00f9\3\2\2\2"+
		"\62\u0102\3\2\2\2\64\u0107\3\2\2\2\66\u010b\3\2\2\28\u0110\3\2\2\2:\u0112"+
		"\3\2\2\2<\u0114\3\2\2\2>\u0116\3\2\2\2@\u011b\3\2\2\2B\u011f\3\2\2\2D"+
		"\u0121\3\2\2\2F\u0127\3\2\2\2H\u012a\3\2\2\2J\u012e\3\2\2\2L\u0130\3\2"+
		"\2\2N\u013a\3\2\2\2P\u0142\3\2\2\2R\u0145\3\2\2\2TU\7\4\2\2UV\7\17\2\2"+
		"VW\5\4\3\2W[\5\6\4\2XZ\5\n\6\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2"+
		"\2\\f\3\2\2\2][\3\2\2\2^_\7\25\2\2_c\5\b\5\2`b\5\n\6\2a`\3\2\2\2be\3\2"+
		"\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3\2\2\2f^\3\2\2\2fg\3\2\2\2gh\3\2"+
		"\2\2hi\7\36\2\2i\3\3\2\2\2jl\7\4\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7"+
		"\35\2\2n\5\3\2\2\2os\7\26\2\2pr\5\66\34\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2"+
		"\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vx\7\26\2\2wo\3\2\2\2wx\3\2\2\2x\7\3\2"+
		"\2\2y}\7\26\2\2z|\5\66\34\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2"+
		"~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0082\7\26\2\2\u0081y\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\t\3\2\2\2\u0083\u0084\58\35\2\u0084\u0085\7\17\2"+
		"\2\u0085\u0086\5\f\7\2\u0086\13\3\2\2\2\u0087\u0089\7\35\2\2\u0088\u008a"+
		"\5\16\b\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2"+
		"\u008b\u008c\7\36\2\2\u008c\r\3\2\2\2\u008d\u008e\7\26\2\2\u008e\u008f"+
		"\5\20\t\2\u008f\u0090\7\26\2\2\u0090\u0092\3\2\2\2\u0091\u008d\3\2\2\2"+
		"\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\5\22\n\2\u0094\17"+
		"\3\2\2\2\u0095\u0097\5\66\34\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2"+
		"\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\21\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009b\u009c\7\32\2\2\u009c\u00a5\5\24\13\2\u009d\u00a2\5\26\f"+
		"\2\u009e\u00a0\7\33\2\2\u009f\u00a1\5\22\n\2\u00a0\u009f\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009e\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a5\3\2\2\2\u00a4\u009b\3\2\2\2\u00a4\u009d\3\2\2\2\u00a5"+
		"\23\3\2\2\2\u00a6\u00a8\5\26\f\2\u00a7\u00a9\7\33\2\2\u00a8\u00a7\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\25\3\2\2\2\u00aa\u00ad\5\30\r\2\u00ab\u00ad"+
		"\5\36\20\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\27\3\2\2\2\u00ae"+
		"\u00af\5\32\16\2\u00af\u00b0\5\36\20\2\u00b0\31\3\2\2\2\u00b1\u00b3\5"+
		"\34\17\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\33\3\2\2\2\u00b6\u00b7\5\66\34\2\u00b7\u00b8\7\24"+
		"\2\2\u00b8\35\3\2\2\2\u00b9\u00bb\5 \21\2\u00ba\u00bc\5\"\22\2\u00bb\u00ba"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\37\3\2\2\2\u00bd\u00c2\5\66\34\2\u00be"+
		"\u00c2\5.\30\2\u00bf\u00c2\5\60\31\2\u00c0\u00c2\5F$\2\u00c1\u00bd\3\2"+
		"\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"!\3\2\2\2\u00c3\u00c5\5$\23\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2"+
		"\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00cb\3\2\2\2\u00c8\u00ca"+
		"\5&\24\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\5*"+
		"\26\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00db\3\2\2\2\u00d1"+
		"\u00d3\5&\24\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d8\5*\26\2\u00d7"+
		"\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00db\5*"+
		"\26\2\u00da\u00c4\3\2\2\2\u00da\u00d2\3\2\2\2\u00da\u00d9\3\2\2\2\u00db"+
		"#\3\2\2\2\u00dc\u00dd\7\4\2\2\u00dd%\3\2\2\2\u00de\u00df\5B\"\2\u00df"+
		"\u00e0\5(\25\2\u00e0\'\3\2\2\2\u00e1\u00e5\5 \21\2\u00e2\u00e4\5$\23\2"+
		"\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6)\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\3\2\2\u00e9"+
		"\u00eb\5,\27\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed+\3\2\2\2\u00ee\u00f2\5(\25\2\u00ef\u00f1"+
		"\5&\24\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3-\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7\35\2\2"+
		"\u00f6\u00f7\5\26\f\2\u00f7\u00f8\7\36\2\2\u00f8/\3\2\2\2\u00f9\u00fb"+
		"\7\37\2\2\u00fa\u00fc\5\62\32\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2"+
		"\2\u00fc\u00fe\3\2\2\2\u00fd\u00ff\5\16\b\2\u00fe\u00fd\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7 \2\2\u0101\61\3\2\2\2"+
		"\u0102\u0103\5\64\33\2\u0103\u0104\7\26\2\2\u0104\63\3\2\2\2\u0105\u0106"+
		"\7\30\2\2\u0106\u0108\5D#\2\u0107\u0105\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\65\3\2\2\2\u010b\u010c\7\4\2"+
		"\2\u010c\67\3\2\2\2\u010d\u0111\5:\36\2\u010e\u0111\5@!\2\u010f\u0111"+
		"\5> \2\u0110\u010d\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111"+
		"9\3\2\2\2\u0112\u0113\5<\37\2\u0113;\3\2\2\2\u0114\u0115\7\4\2\2\u0115"+
		"=\3\2\2\2\u0116\u0117\5B\"\2\u0117\u0118\5D#\2\u0118?\3\2\2\2\u0119\u011a"+
		"\7\3\2\2\u011a\u011c\5D#\2\u011b\u0119\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011eA\3\2\2\2\u011f\u0120\t\2\2\2"+
		"\u0120C\3\2\2\2\u0121\u0122\5\66\34\2\u0122E\3\2\2\2\u0123\u0128\5H%\2"+
		"\u0124\u0128\5J&\2\u0125\u0128\5L\'\2\u0126\u0128\5N(\2\u0127\u0123\3"+
		"\2\2\2\u0127\u0124\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128"+
		"G\3\2\2\2\u0129\u012b\7\13\2\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2"+
		"\u012b\u012c\3\2\2\2\u012c\u012d\t\3\2\2\u012dI\3\2\2\2\u012e\u012f\7"+
		"\t\2\2\u012fK\3\2\2\2\u0130\u0131\7\34\2\2\u0131\u0135\7\37\2\2\u0132"+
		"\u0134\5F$\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2"+
		"\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139"+
		"\7 \2\2\u0139M\3\2\2\2\u013a\u013d\7\34\2\2\u013b\u013e\7\t\2\2\u013c"+
		"\u013e\5P)\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013eO\3\2\2\2\u013f"+
		"\u0143\5B\"\2\u0140\u0143\5R*\2\u0141\u0143\5<\37\2\u0142\u013f\3\2\2"+
		"\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143Q\3\2\2\2\u0144\u0146"+
		"\7\3\2\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148S\3\2\2\2)[cfksw}\u0081\u0089\u0091\u0098\u00a0\u00a2"+
		"\u00a4\u00a8\u00ac\u00b4\u00bb\u00c1\u00c6\u00cb\u00cf\u00d4\u00d7\u00da"+
		"\u00e5\u00ec\u00f2\u00fb\u00fe\u0109\u0110\u011d\u0127\u012a\u0135\u013d"+
		"\u0142\u0147";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}