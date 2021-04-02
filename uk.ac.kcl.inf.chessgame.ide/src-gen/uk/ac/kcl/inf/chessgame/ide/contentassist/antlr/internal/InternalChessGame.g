/*
 * generated by Xtext 2.24.0
 */
grammar InternalChessGame;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package uk.ac.kcl.inf.chessgame.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package uk.ac.kcl.inf.chessgame.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.inf.chessgame.services.ChessGameGrammarAccess;

}
@parser::members {
	private ChessGameGrammarAccess grammarAccess;

	public void setGrammarAccess(ChessGameGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleChessProgram
entryRuleChessProgram
:
{ before(grammarAccess.getChessProgramRule()); }
	 ruleChessProgram
{ after(grammarAccess.getChessProgramRule()); } 
	 EOF 
;

// Rule ChessProgram
ruleChessProgram 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChessProgramAccess().getStatementsAssignment()); }
		(rule__ChessProgram__StatementsAssignment)*
		{ after(grammarAccess.getChessProgramAccess().getStatementsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStatements
entryRuleStatements
:
{ before(grammarAccess.getStatementsRule()); }
	 ruleStatements
{ after(grammarAccess.getStatementsRule()); } 
	 EOF 
;

// Rule Statements
ruleStatements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStatementsAccess().getAlternatives()); }
		(rule__Statements__Alternatives)
		{ after(grammarAccess.getStatementsAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulewidth
entryRulewidth
:
{ before(grammarAccess.getWidthRule()); }
	 rulewidth
{ after(grammarAccess.getWidthRule()); } 
	 EOF 
;

// Rule width
rulewidth 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWidthAccess().getGroup()); }
		(rule__Width__Group__0)
		{ after(grammarAccess.getWidthAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleheight
entryRuleheight
:
{ before(grammarAccess.getHeightRule()); }
	 ruleheight
{ after(grammarAccess.getHeightRule()); } 
	 EOF 
;

// Rule height
ruleheight 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getHeightAccess().getGroup()); }
		(rule__Height__Group__0)
		{ after(grammarAccess.getHeightAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statements__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatementsAccess().getWidthParserRuleCall_0()); }
		rulewidth
		{ after(grammarAccess.getStatementsAccess().getWidthParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getStatementsAccess().getHeightParserRuleCall_1()); }
		ruleheight
		{ after(grammarAccess.getStatementsAccess().getHeightParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Width__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Width__Group__0__Impl
	rule__Width__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Width__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWidthAccess().getWidthKeyword_0()); }
	'width'
	{ after(grammarAccess.getWidthAccess().getWidthKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Width__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Width__Group__1__Impl
	rule__Width__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Width__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWidthAccess().getEqualsSignKeyword_1()); }
	'='
	{ after(grammarAccess.getWidthAccess().getEqualsSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Width__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Width__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Width__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWidthAccess().getWIDTHAssignment_2()); }
	(rule__Width__WIDTHAssignment_2)
	{ after(grammarAccess.getWidthAccess().getWIDTHAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Height__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Height__Group__0__Impl
	rule__Height__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Height__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHeightAccess().getHeightKeyword_0()); }
	'height'
	{ after(grammarAccess.getHeightAccess().getHeightKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Height__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Height__Group__1__Impl
	rule__Height__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Height__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHeightAccess().getEqualsSignKeyword_1()); }
	'='
	{ after(grammarAccess.getHeightAccess().getEqualsSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Height__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Height__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Height__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHeightAccess().getHEIGHTAssignment_2()); }
	(rule__Height__HEIGHTAssignment_2)
	{ after(grammarAccess.getHeightAccess().getHEIGHTAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ChessProgram__StatementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChessProgramAccess().getStatementsStatementsParserRuleCall_0()); }
		ruleStatements
		{ after(grammarAccess.getChessProgramAccess().getStatementsStatementsParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Width__WIDTHAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWidthAccess().getWIDTHINTTerminalRuleCall_2_0()); }
		RULE_INT
		{ after(grammarAccess.getWidthAccess().getWIDTHINTTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Height__HEIGHTAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHeightAccess().getHEIGHTINTTerminalRuleCall_2_0()); }
		RULE_INT
		{ after(grammarAccess.getHeightAccess().getHEIGHTINTTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;