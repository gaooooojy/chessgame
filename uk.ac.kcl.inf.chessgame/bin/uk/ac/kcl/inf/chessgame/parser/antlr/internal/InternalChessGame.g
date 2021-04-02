/*
 * generated by Xtext 2.24.0
 */
grammar InternalChessGame;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package uk.ac.kcl.inf.chessgame.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package uk.ac.kcl.inf.chessgame.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.chessgame.services.ChessGameGrammarAccess;

}

@parser::members {

 	private ChessGameGrammarAccess grammarAccess;

    public InternalChessGameParser(TokenStream input, ChessGameGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "ChessProgram";
   	}

   	@Override
   	protected ChessGameGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleChessProgram
entryRuleChessProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChessProgramRule()); }
	iv_ruleChessProgram=ruleChessProgram
	{ $current=$iv_ruleChessProgram.current; }
	EOF;

// Rule ChessProgram
ruleChessProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getChessProgramAccess().getStatementsStatementsParserRuleCall_0());
			}
			lv_statements_0_0=ruleStatements
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getChessProgramRule());
				}
				add(
					$current,
					"statements",
					lv_statements_0_0,
					"uk.ac.kcl.inf.chessgame.ChessGame.Statements");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleStatements
entryRuleStatements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementsRule()); }
	iv_ruleStatements=ruleStatements
	{ $current=$iv_ruleStatements.current; }
	EOF;

// Rule Statements
ruleStatements returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStatementsAccess().getWidthParserRuleCall_0());
		}
		this_width_0=rulewidth
		{
			$current = $this_width_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementsAccess().getHeightParserRuleCall_1());
		}
		this_height_1=ruleheight
		{
			$current = $this_height_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulewidth
entryRulewidth returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWidthRule()); }
	iv_rulewidth=rulewidth
	{ $current=$iv_rulewidth.current; }
	EOF;

// Rule width
rulewidth returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='width'
		{
			newLeafNode(otherlv_0, grammarAccess.getWidthAccess().getWidthKeyword_0());
		}
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getWidthAccess().getEqualsSignKeyword_1());
		}
		(
			(
				lv_WIDTH_2_0=RULE_INT
				{
					newLeafNode(lv_WIDTH_2_0, grammarAccess.getWidthAccess().getWIDTHINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWidthRule());
					}
					setWithLastConsumed(
						$current,
						"WIDTH",
						lv_WIDTH_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleheight
entryRuleheight returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHeightRule()); }
	iv_ruleheight=ruleheight
	{ $current=$iv_ruleheight.current; }
	EOF;

// Rule height
ruleheight returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='height'
		{
			newLeafNode(otherlv_0, grammarAccess.getHeightAccess().getHeightKeyword_0());
		}
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getHeightAccess().getEqualsSignKeyword_1());
		}
		(
			(
				lv_HEIGHT_2_0=RULE_INT
				{
					newLeafNode(lv_HEIGHT_2_0, grammarAccess.getHeightAccess().getHEIGHTINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHeightRule());
					}
					setWithLastConsumed(
						$current,
						"HEIGHT",
						lv_HEIGHT_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
