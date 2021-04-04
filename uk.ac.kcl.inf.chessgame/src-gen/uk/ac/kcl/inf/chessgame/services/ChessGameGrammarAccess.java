/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.chessgame.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ChessGameGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ChessProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.chessgame.ChessGame.ChessProgram");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSizeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSizeFieldSpecificationParserRuleCall_0_0 = (RuleCall)cSizeAssignment_0.eContents().get(0);
		private final Assignment cOptionsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOptionsOptionSpecificationParserRuleCall_1_0 = (RuleCall)cOptionsAssignment_1.eContents().get(0);
		private final Assignment cEndGameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cEndGameGameEndParserRuleCall_2_0 = (RuleCall)cEndGameAssignment_2.eContents().get(0);
		
		//ChessProgram:
		//	size=FieldSpecification
		//	options+=OptionSpecification
		//	endGame=GameEnd;
		@Override public ParserRule getRule() { return rule; }
		
		//size=FieldSpecification
		//options+=OptionSpecification
		//endGame=GameEnd
		public Group getGroup() { return cGroup; }
		
		//size=FieldSpecification
		public Assignment getSizeAssignment_0() { return cSizeAssignment_0; }
		
		//FieldSpecification
		public RuleCall getSizeFieldSpecificationParserRuleCall_0_0() { return cSizeFieldSpecificationParserRuleCall_0_0; }
		
		//options+=OptionSpecification
		public Assignment getOptionsAssignment_1() { return cOptionsAssignment_1; }
		
		//OptionSpecification
		public RuleCall getOptionsOptionSpecificationParserRuleCall_1_0() { return cOptionsOptionSpecificationParserRuleCall_1_0; }
		
		//endGame=GameEnd
		public Assignment getEndGameAssignment_2() { return cEndGameAssignment_2; }
		
		//GameEnd
		public RuleCall getEndGameGameEndParserRuleCall_2_0() { return cEndGameGameEndParserRuleCall_2_0; }
	}
	public class FieldSpecificationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.chessgame.ChessGame.FieldSpecification");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFieldKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cWidthKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cWidthAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cWidthINTTerminalRuleCall_4_0 = (RuleCall)cWidthAssignment_4.eContents().get(0);
		private final Keyword cHeightKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cEqualsSignKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cHeightAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cHeightINTTerminalRuleCall_7_0 = (RuleCall)cHeightAssignment_7.eContents().get(0);
		private final Keyword cFirstPlayerKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cEqualsSignKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cNameAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final Alternatives cNameAlternatives_10_0 = (Alternatives)cNameAssignment_10.eContents().get(0);
		private final Keyword cNameBlackFirstKeyword_10_0_0 = (Keyword)cNameAlternatives_10_0.eContents().get(0);
		private final Keyword cNameWhiteFirstKeyword_10_0_1 = (Keyword)cNameAlternatives_10_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//FieldSpecification:
		//	'field' '{'
		//	"width" "=" width=INT
		//	"height" "=" height=INT
		//	"FirstPlayer" "=" name=("BlackFirst" | "WhiteFirst")
		////		"Counter" "=" counter=INT
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'field' '{'
		//"width" "=" width=INT
		//"height" "=" height=INT
		//"FirstPlayer" "=" name=("BlackFirst" | "WhiteFirst")
		////		"Counter" "=" counter=INT
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'field'
		public Keyword getFieldKeyword_0() { return cFieldKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//"width"
		public Keyword getWidthKeyword_2() { return cWidthKeyword_2; }
		
		//"="
		public Keyword getEqualsSignKeyword_3() { return cEqualsSignKeyword_3; }
		
		//width=INT
		public Assignment getWidthAssignment_4() { return cWidthAssignment_4; }
		
		//INT
		public RuleCall getWidthINTTerminalRuleCall_4_0() { return cWidthINTTerminalRuleCall_4_0; }
		
		//"height"
		public Keyword getHeightKeyword_5() { return cHeightKeyword_5; }
		
		//"="
		public Keyword getEqualsSignKeyword_6() { return cEqualsSignKeyword_6; }
		
		//height=INT
		public Assignment getHeightAssignment_7() { return cHeightAssignment_7; }
		
		//INT
		public RuleCall getHeightINTTerminalRuleCall_7_0() { return cHeightINTTerminalRuleCall_7_0; }
		
		//"FirstPlayer"
		public Keyword getFirstPlayerKeyword_8() { return cFirstPlayerKeyword_8; }
		
		//"="
		public Keyword getEqualsSignKeyword_9() { return cEqualsSignKeyword_9; }
		
		//name=("BlackFirst" | "WhiteFirst")
		public Assignment getNameAssignment_10() { return cNameAssignment_10; }
		
		//("BlackFirst" | "WhiteFirst")
		public Alternatives getNameAlternatives_10_0() { return cNameAlternatives_10_0; }
		
		//"BlackFirst"
		public Keyword getNameBlackFirstKeyword_10_0_0() { return cNameBlackFirstKeyword_10_0_0; }
		
		//"WhiteFirst"
		public Keyword getNameWhiteFirstKeyword_10_0_1() { return cNameWhiteFirstKeyword_10_0_1; }
		
		////		"Counter" "=" counter=INT
		//'}'
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
	}
	public class OptionSpecificationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.chessgame.ChessGame.OptionSpecification");
		private final Assignment cStatesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cStatesCellStateParserRuleCall_0 = (RuleCall)cStatesAssignment.eContents().get(0);
		
		//OptionSpecification:
		//	states+=CellState+;
		@Override public ParserRule getRule() { return rule; }
		
		//states+=CellState+
		public Assignment getStatesAssignment() { return cStatesAssignment; }
		
		//CellState
		public RuleCall getStatesCellStateParserRuleCall_0() { return cStatesCellStateParserRuleCall_0; }
	}
	public class CellStateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.chessgame.ChessGame.CellState");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cDisplayAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDisplayCellDisplaySpecParserRuleCall_2_0 = (RuleCall)cDisplayAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cTransitionsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cTransitionsAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cTransitionsTransitionSpecParserRuleCall_3_2_0 = (RuleCall)cTransitionsAssignment_3_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//CellState:
		//	name=ID "{"
		//	display=CellDisplaySpec ("transitions" "{"
		//	transitions+=TransitionSpec+
		//	"}")?
		//	"}";
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID "{"
		//display=CellDisplaySpec ("transitions" "{"
		//transitions+=TransitionSpec+
		//"}")?
		//"}"
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//display=CellDisplaySpec
		public Assignment getDisplayAssignment_2() { return cDisplayAssignment_2; }
		
		//CellDisplaySpec
		public RuleCall getDisplayCellDisplaySpecParserRuleCall_2_0() { return cDisplayCellDisplaySpecParserRuleCall_2_0; }
		
		//("transitions" "{"
		//transitions+=TransitionSpec+
		//"}")?
		public Group getGroup_3() { return cGroup_3; }
		
		//"transitions"
		public Keyword getTransitionsKeyword_3_0() { return cTransitionsKeyword_3_0; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_3_1() { return cLeftCurlyBracketKeyword_3_1; }
		
		//transitions+=TransitionSpec+
		public Assignment getTransitionsAssignment_3_2() { return cTransitionsAssignment_3_2; }
		
		//TransitionSpec
		public RuleCall getTransitionsTransitionSpecParserRuleCall_3_2_0() { return cTransitionsTransitionSpecParserRuleCall_3_2_0; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_3_3() { return cRightCurlyBracketKeyword_3_3; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class CellDisplaySpecElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.chessgame.ChessGame.CellDisplaySpec");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDisplayKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Keyword cTextKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2_0_1 = (Keyword)cGroup_2_0.eContents().get(1);
		private final Assignment cTextAssignment_2_0_2 = (Assignment)cGroup_2_0.eContents().get(2);
		private final RuleCall cTextSTRINGTerminalRuleCall_2_0_2_0 = (RuleCall)cTextAssignment_2_0_2.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final Keyword cColorKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2_1_1 = (Keyword)cGroup_2_1.eContents().get(1);
		private final Assignment cColorAssignment_2_1_2 = (Assignment)cGroup_2_1.eContents().get(2);
		private final Alternatives cColorAlternatives_2_1_2_0 = (Alternatives)cColorAssignment_2_1_2.eContents().get(0);
		private final Keyword cColorBlackKeyword_2_1_2_0_0 = (Keyword)cColorAlternatives_2_1_2_0.eContents().get(0);
		private final Keyword cColorWhiteKeyword_2_1_2_0_1 = (Keyword)cColorAlternatives_2_1_2_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//CellDisplaySpec:
		//	"display" "{" ("text" "=" text=STRING | "color" "=" color=("black" | "white"))
		//	"}";
		@Override public ParserRule getRule() { return rule; }
		
		//"display" "{" ("text" "=" text=STRING | "color" "=" color=("black" | "white"))
		//"}"
		public Group getGroup() { return cGroup; }
		
		//"display"
		public Keyword getDisplayKeyword_0() { return cDisplayKeyword_0; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//("text" "=" text=STRING | "color" "=" color=("black" | "white"))
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//"text" "=" text=STRING
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//"text"
		public Keyword getTextKeyword_2_0_0() { return cTextKeyword_2_0_0; }
		
		//"="
		public Keyword getEqualsSignKeyword_2_0_1() { return cEqualsSignKeyword_2_0_1; }
		
		//text=STRING
		public Assignment getTextAssignment_2_0_2() { return cTextAssignment_2_0_2; }
		
		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_2_0_2_0() { return cTextSTRINGTerminalRuleCall_2_0_2_0; }
		
		//"color" "=" color=("black" | "white")
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//"color"
		public Keyword getColorKeyword_2_1_0() { return cColorKeyword_2_1_0; }
		
		//"="
		public Keyword getEqualsSignKeyword_2_1_1() { return cEqualsSignKeyword_2_1_1; }
		
		//color=("black" | "white")
		public Assignment getColorAssignment_2_1_2() { return cColorAssignment_2_1_2; }
		
		//("black" | "white")
		public Alternatives getColorAlternatives_2_1_2_0() { return cColorAlternatives_2_1_2_0; }
		
		//"black"
		public Keyword getColorBlackKeyword_2_1_2_0_0() { return cColorBlackKeyword_2_1_2_0_0; }
		
		//"white"
		public Keyword getColorWhiteKeyword_2_1_2_0_1() { return cColorWhiteKeyword_2_1_2_0_1; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class TransitionSpecElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.chessgame.ChessGame.TransitionSpec");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClickKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTriggerAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTriggerMouseTriggerParserRuleCall_1_0 = (RuleCall)cTriggerAssignment_1.eContents().get(0);
		private final Keyword cAndKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cGotoKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTargetAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cTargetCellStateCrossReference_4_0 = (CrossReference)cTargetAssignment_4.eContents().get(0);
		private final RuleCall cTargetCellStateIDTerminalRuleCall_4_0_1 = (RuleCall)cTargetCellStateCrossReference_4_0.eContents().get(1);
		
		//TransitionSpec:
		//	"click" trigger=MouseTrigger "and" "goto" target=[CellState];
		@Override public ParserRule getRule() { return rule; }
		
		//"click" trigger=MouseTrigger "and" "goto" target=[CellState]
		public Group getGroup() { return cGroup; }
		
		//"click"
		public Keyword getClickKeyword_0() { return cClickKeyword_0; }
		
		//trigger=MouseTrigger
		public Assignment getTriggerAssignment_1() { return cTriggerAssignment_1; }
		
		//MouseTrigger
		public RuleCall getTriggerMouseTriggerParserRuleCall_1_0() { return cTriggerMouseTriggerParserRuleCall_1_0; }
		
		//"and"
		public Keyword getAndKeyword_2() { return cAndKeyword_2; }
		
		//"goto"
		public Keyword getGotoKeyword_3() { return cGotoKeyword_3; }
		
		//target=[CellState]
		public Assignment getTargetAssignment_4() { return cTargetAssignment_4; }
		
		//[CellState]
		public CrossReference getTargetCellStateCrossReference_4_0() { return cTargetCellStateCrossReference_4_0; }
		
		//ID
		public RuleCall getTargetCellStateIDTerminalRuleCall_4_0_1() { return cTargetCellStateIDTerminalRuleCall_4_0_1; }
	}
	public class MouseTriggerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.chessgame.ChessGame.MouseTrigger");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cMouseAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cMouseMouseLeftKeyword_0_0 = (Keyword)cMouseAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cMouseRightKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Action cMouseTriggerAction_1_1 = (Action)cGroup_1.eContents().get(1);
		
		//MouseTrigger:
		//	mouse?="mouse-left" | "mouse-right" {MouseTrigger};
		@Override public ParserRule getRule() { return rule; }
		
		//mouse?="mouse-left" | "mouse-right" {MouseTrigger}
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//mouse?="mouse-left"
		public Assignment getMouseAssignment_0() { return cMouseAssignment_0; }
		
		//"mouse-left"
		public Keyword getMouseMouseLeftKeyword_0_0() { return cMouseMouseLeftKeyword_0_0; }
		
		//"mouse-right" {MouseTrigger}
		public Group getGroup_1() { return cGroup_1; }
		
		//"mouse-right"
		public Keyword getMouseRightKeyword_1_0() { return cMouseRightKeyword_1_0; }
		
		//{MouseTrigger}
		public Action getMouseTriggerAction_1_1() { return cMouseTriggerAction_1_1; }
	}
	public class GameEndElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.chessgame.ChessGame.GameEnd");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cActionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cWhenKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cActionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cActionContextExpressionParserRuleCall_4_0 = (RuleCall)cActionAssignment_4.eContents().get(0);
		private final Keyword cDoKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cBehaviourAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cBehaviourEndBehaviourParserRuleCall_6_0 = (RuleCall)cBehaviourAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//GameEnd:
		//	"action" name=ID "{"
		//	"when" action=ContextExpression
		//	"do" behaviour=EndBehaviour
		//	"}";
		@Override public ParserRule getRule() { return rule; }
		
		//"action" name=ID "{"
		//"when" action=ContextExpression
		//"do" behaviour=EndBehaviour
		//"}"
		public Group getGroup() { return cGroup; }
		
		//"action"
		public Keyword getActionKeyword_0() { return cActionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//"when"
		public Keyword getWhenKeyword_3() { return cWhenKeyword_3; }
		
		//action=ContextExpression
		public Assignment getActionAssignment_4() { return cActionAssignment_4; }
		
		//ContextExpression
		public RuleCall getActionContextExpressionParserRuleCall_4_0() { return cActionContextExpressionParserRuleCall_4_0; }
		
		//"do"
		public Keyword getDoKeyword_5() { return cDoKeyword_5; }
		
		//behaviour=EndBehaviour
		public Assignment getBehaviourAssignment_6() { return cBehaviourAssignment_6; }
		
		//EndBehaviour
		public RuleCall getBehaviourEndBehaviourParserRuleCall_6_0() { return cBehaviourEndBehaviourParserRuleCall_6_0; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class ContextExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.chessgame.ChessGame.ContextExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSub_expAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSub_expStateFilterExpressionParserRuleCall_0_0 = (RuleCall)cSub_expAssignment_0.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cCellStateAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCellStateEmptyExpressionParserRuleCall_2_0 = (RuleCall)cCellStateAssignment_2.eContents().get(0);
		
		////ContextExpression:
		////	"noEmptyCellLeft" "("  ")"
		////;
		//ContextExpression:
		//	sub_exp=StateFilterExpression "." cellState=EmptyExpression;
		@Override public ParserRule getRule() { return rule; }
		
		//sub_exp=StateFilterExpression "." cellState=EmptyExpression
		public Group getGroup() { return cGroup; }
		
		//sub_exp=StateFilterExpression
		public Assignment getSub_expAssignment_0() { return cSub_expAssignment_0; }
		
		//StateFilterExpression
		public RuleCall getSub_expStateFilterExpressionParserRuleCall_0_0() { return cSub_expStateFilterExpressionParserRuleCall_0_0; }
		
		//"."
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//cellState=EmptyExpression
		public Assignment getCellStateAssignment_2() { return cCellStateAssignment_2; }
		
		//EmptyExpression
		public RuleCall getCellStateEmptyExpressionParserRuleCall_2_0() { return cCellStateEmptyExpressionParserRuleCall_2_0; }
	}
	public class StateFilterExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.chessgame.ChessGame.StateFilterExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAllCellStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cCell_stateAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cCell_stateCellStateCrossReference_2_0 = (CrossReference)cCell_stateAssignment_2.eContents().get(0);
		private final RuleCall cCell_stateCellStateIDTerminalRuleCall_2_0_1 = (RuleCall)cCell_stateCellStateCrossReference_2_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//StateFilterExpression:
		//	"allCellState" "(" cell_state=[CellState] ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"allCellState" "(" cell_state=[CellState] ")"
		public Group getGroup() { return cGroup; }
		
		//"allCellState"
		public Keyword getAllCellStateKeyword_0() { return cAllCellStateKeyword_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//cell_state=[CellState]
		public Assignment getCell_stateAssignment_2() { return cCell_stateAssignment_2; }
		
		//[CellState]
		public CrossReference getCell_stateCellStateCrossReference_2_0() { return cCell_stateCellStateCrossReference_2_0; }
		
		//ID
		public RuleCall getCell_stateCellStateIDTerminalRuleCall_2_0_1() { return cCell_stateCellStateIDTerminalRuleCall_2_0_1; }
		
		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class EmptyExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.chessgame.ChessGame.EmptyExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEmptyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Action cEmptyExpressionAction_3 = (Action)cGroup.eContents().get(3);
		
		//EmptyExpression:
		//	"empty" "(" ")" {EmptyExpression};
		@Override public ParserRule getRule() { return rule; }
		
		//"empty" "(" ")" {EmptyExpression}
		public Group getGroup() { return cGroup; }
		
		//"empty"
		public Keyword getEmptyKeyword_0() { return cEmptyKeyword_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//")"
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
		
		//{EmptyExpression}
		public Action getEmptyExpressionAction_3() { return cEmptyExpressionAction_3; }
	}
	public class EndBehaviourElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.chessgame.ChessGame.EndBehaviour");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEndGameKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMessageAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMessageSTRINGTerminalRuleCall_2_0 = (RuleCall)cMessageAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//EndBehaviour:
		//	"end-game" "(" message=STRING ")";
		@Override public ParserRule getRule() { return rule; }
		
		//"end-game" "(" message=STRING ")"
		public Group getGroup() { return cGroup; }
		
		//"end-game"
		public Keyword getEndGameKeyword_0() { return cEndGameKeyword_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//message=STRING
		public Assignment getMessageAssignment_2() { return cMessageAssignment_2; }
		
		//STRING
		public RuleCall getMessageSTRINGTerminalRuleCall_2_0() { return cMessageSTRINGTerminalRuleCall_2_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	
	
	private final ChessProgramElements pChessProgram;
	private final FieldSpecificationElements pFieldSpecification;
	private final OptionSpecificationElements pOptionSpecification;
	private final CellStateElements pCellState;
	private final CellDisplaySpecElements pCellDisplaySpec;
	private final TransitionSpecElements pTransitionSpec;
	private final MouseTriggerElements pMouseTrigger;
	private final GameEndElements pGameEnd;
	private final ContextExpressionElements pContextExpression;
	private final StateFilterExpressionElements pStateFilterExpression;
	private final EmptyExpressionElements pEmptyExpression;
	private final EndBehaviourElements pEndBehaviour;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ChessGameGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pChessProgram = new ChessProgramElements();
		this.pFieldSpecification = new FieldSpecificationElements();
		this.pOptionSpecification = new OptionSpecificationElements();
		this.pCellState = new CellStateElements();
		this.pCellDisplaySpec = new CellDisplaySpecElements();
		this.pTransitionSpec = new TransitionSpecElements();
		this.pMouseTrigger = new MouseTriggerElements();
		this.pGameEnd = new GameEndElements();
		this.pContextExpression = new ContextExpressionElements();
		this.pStateFilterExpression = new StateFilterExpressionElements();
		this.pEmptyExpression = new EmptyExpressionElements();
		this.pEndBehaviour = new EndBehaviourElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("uk.ac.kcl.inf.chessgame.ChessGame".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ChessProgram:
	//	size=FieldSpecification
	//	options+=OptionSpecification
	//	endGame=GameEnd;
	public ChessProgramElements getChessProgramAccess() {
		return pChessProgram;
	}
	
	public ParserRule getChessProgramRule() {
		return getChessProgramAccess().getRule();
	}
	
	//FieldSpecification:
	//	'field' '{'
	//	"width" "=" width=INT
	//	"height" "=" height=INT
	//	"FirstPlayer" "=" name=("BlackFirst" | "WhiteFirst")
	////		"Counter" "=" counter=INT
	//	'}';
	public FieldSpecificationElements getFieldSpecificationAccess() {
		return pFieldSpecification;
	}
	
	public ParserRule getFieldSpecificationRule() {
		return getFieldSpecificationAccess().getRule();
	}
	
	//OptionSpecification:
	//	states+=CellState+;
	public OptionSpecificationElements getOptionSpecificationAccess() {
		return pOptionSpecification;
	}
	
	public ParserRule getOptionSpecificationRule() {
		return getOptionSpecificationAccess().getRule();
	}
	
	//CellState:
	//	name=ID "{"
	//	display=CellDisplaySpec ("transitions" "{"
	//	transitions+=TransitionSpec+
	//	"}")?
	//	"}";
	public CellStateElements getCellStateAccess() {
		return pCellState;
	}
	
	public ParserRule getCellStateRule() {
		return getCellStateAccess().getRule();
	}
	
	//CellDisplaySpec:
	//	"display" "{" ("text" "=" text=STRING | "color" "=" color=("black" | "white"))
	//	"}";
	public CellDisplaySpecElements getCellDisplaySpecAccess() {
		return pCellDisplaySpec;
	}
	
	public ParserRule getCellDisplaySpecRule() {
		return getCellDisplaySpecAccess().getRule();
	}
	
	//TransitionSpec:
	//	"click" trigger=MouseTrigger "and" "goto" target=[CellState];
	public TransitionSpecElements getTransitionSpecAccess() {
		return pTransitionSpec;
	}
	
	public ParserRule getTransitionSpecRule() {
		return getTransitionSpecAccess().getRule();
	}
	
	//MouseTrigger:
	//	mouse?="mouse-left" | "mouse-right" {MouseTrigger};
	public MouseTriggerElements getMouseTriggerAccess() {
		return pMouseTrigger;
	}
	
	public ParserRule getMouseTriggerRule() {
		return getMouseTriggerAccess().getRule();
	}
	
	//GameEnd:
	//	"action" name=ID "{"
	//	"when" action=ContextExpression
	//	"do" behaviour=EndBehaviour
	//	"}";
	public GameEndElements getGameEndAccess() {
		return pGameEnd;
	}
	
	public ParserRule getGameEndRule() {
		return getGameEndAccess().getRule();
	}
	
	////ContextExpression:
	////	"noEmptyCellLeft" "("  ")"
	////;
	//ContextExpression:
	//	sub_exp=StateFilterExpression "." cellState=EmptyExpression;
	public ContextExpressionElements getContextExpressionAccess() {
		return pContextExpression;
	}
	
	public ParserRule getContextExpressionRule() {
		return getContextExpressionAccess().getRule();
	}
	
	//StateFilterExpression:
	//	"allCellState" "(" cell_state=[CellState] ")";
	public StateFilterExpressionElements getStateFilterExpressionAccess() {
		return pStateFilterExpression;
	}
	
	public ParserRule getStateFilterExpressionRule() {
		return getStateFilterExpressionAccess().getRule();
	}
	
	//EmptyExpression:
	//	"empty" "(" ")" {EmptyExpression};
	public EmptyExpressionElements getEmptyExpressionAccess() {
		return pEmptyExpression;
	}
	
	public ParserRule getEmptyExpressionRule() {
		return getEmptyExpressionAccess().getRule();
	}
	
	//EndBehaviour:
	//	"end-game" "(" message=STRING ")";
	public EndBehaviourElements getEndBehaviourAccess() {
		return pEndBehaviour;
	}
	
	public ParserRule getEndBehaviourRule() {
		return getEndBehaviourAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
