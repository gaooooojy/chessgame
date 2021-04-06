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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChessGameParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'black'", "'white'", "'field'", "'{'", "'width'", "'='", "'height'", "'}'", "'transitions'", "'display'", "'text'", "'color'", "'click'", "'and'", "'goto'", "'mouse-right'", "'action'", "'when'", "'do'", "'.'", "'allCellState'", "'('", "')'", "'empty'", "'end-game'", "'mouse-left'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalChessGameParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalChessGameParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalChessGameParser.tokenNames; }
    public String getGrammarFileName() { return "InternalChessGame.g"; }


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



    // $ANTLR start "entryRuleChessProgram"
    // InternalChessGame.g:53:1: entryRuleChessProgram : ruleChessProgram EOF ;
    public final void entryRuleChessProgram() throws RecognitionException {
        try {
            // InternalChessGame.g:54:1: ( ruleChessProgram EOF )
            // InternalChessGame.g:55:1: ruleChessProgram EOF
            {
             before(grammarAccess.getChessProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleChessProgram();

            state._fsp--;

             after(grammarAccess.getChessProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChessProgram"


    // $ANTLR start "ruleChessProgram"
    // InternalChessGame.g:62:1: ruleChessProgram : ( ( rule__ChessProgram__StatesAssignment )* ) ;
    public final void ruleChessProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:66:2: ( ( ( rule__ChessProgram__StatesAssignment )* ) )
            // InternalChessGame.g:67:2: ( ( rule__ChessProgram__StatesAssignment )* )
            {
            // InternalChessGame.g:67:2: ( ( rule__ChessProgram__StatesAssignment )* )
            // InternalChessGame.g:68:3: ( rule__ChessProgram__StatesAssignment )*
            {
             before(grammarAccess.getChessProgramAccess().getStatesAssignment()); 
            // InternalChessGame.g:69:3: ( rule__ChessProgram__StatesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==13||LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalChessGame.g:69:4: rule__ChessProgram__StatesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ChessProgram__StatesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getChessProgramAccess().getStatesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChessProgram"


    // $ANTLR start "entryRuleStatements"
    // InternalChessGame.g:78:1: entryRuleStatements : ruleStatements EOF ;
    public final void entryRuleStatements() throws RecognitionException {
        try {
            // InternalChessGame.g:79:1: ( ruleStatements EOF )
            // InternalChessGame.g:80:1: ruleStatements EOF
            {
             before(grammarAccess.getStatementsRule()); 
            pushFollow(FOLLOW_1);
            ruleStatements();

            state._fsp--;

             after(grammarAccess.getStatementsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatements"


    // $ANTLR start "ruleStatements"
    // InternalChessGame.g:87:1: ruleStatements : ( ( rule__Statements__Alternatives ) ) ;
    public final void ruleStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:91:2: ( ( ( rule__Statements__Alternatives ) ) )
            // InternalChessGame.g:92:2: ( ( rule__Statements__Alternatives ) )
            {
            // InternalChessGame.g:92:2: ( ( rule__Statements__Alternatives ) )
            // InternalChessGame.g:93:3: ( rule__Statements__Alternatives )
            {
             before(grammarAccess.getStatementsAccess().getAlternatives()); 
            // InternalChessGame.g:94:3: ( rule__Statements__Alternatives )
            // InternalChessGame.g:94:4: rule__Statements__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statements__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatements"


    // $ANTLR start "entryRuleFieldSpecification"
    // InternalChessGame.g:103:1: entryRuleFieldSpecification : ruleFieldSpecification EOF ;
    public final void entryRuleFieldSpecification() throws RecognitionException {
        try {
            // InternalChessGame.g:104:1: ( ruleFieldSpecification EOF )
            // InternalChessGame.g:105:1: ruleFieldSpecification EOF
            {
             before(grammarAccess.getFieldSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldSpecification();

            state._fsp--;

             after(grammarAccess.getFieldSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldSpecification"


    // $ANTLR start "ruleFieldSpecification"
    // InternalChessGame.g:112:1: ruleFieldSpecification : ( ( rule__FieldSpecification__Group__0 ) ) ;
    public final void ruleFieldSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:116:2: ( ( ( rule__FieldSpecification__Group__0 ) ) )
            // InternalChessGame.g:117:2: ( ( rule__FieldSpecification__Group__0 ) )
            {
            // InternalChessGame.g:117:2: ( ( rule__FieldSpecification__Group__0 ) )
            // InternalChessGame.g:118:3: ( rule__FieldSpecification__Group__0 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getGroup()); 
            // InternalChessGame.g:119:3: ( rule__FieldSpecification__Group__0 )
            // InternalChessGame.g:119:4: rule__FieldSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldSpecification"


    // $ANTLR start "entryRuleCellState"
    // InternalChessGame.g:128:1: entryRuleCellState : ruleCellState EOF ;
    public final void entryRuleCellState() throws RecognitionException {
        try {
            // InternalChessGame.g:129:1: ( ruleCellState EOF )
            // InternalChessGame.g:130:1: ruleCellState EOF
            {
             before(grammarAccess.getCellStateRule()); 
            pushFollow(FOLLOW_1);
            ruleCellState();

            state._fsp--;

             after(grammarAccess.getCellStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCellState"


    // $ANTLR start "ruleCellState"
    // InternalChessGame.g:137:1: ruleCellState : ( ( rule__CellState__Group__0 ) ) ;
    public final void ruleCellState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:141:2: ( ( ( rule__CellState__Group__0 ) ) )
            // InternalChessGame.g:142:2: ( ( rule__CellState__Group__0 ) )
            {
            // InternalChessGame.g:142:2: ( ( rule__CellState__Group__0 ) )
            // InternalChessGame.g:143:3: ( rule__CellState__Group__0 )
            {
             before(grammarAccess.getCellStateAccess().getGroup()); 
            // InternalChessGame.g:144:3: ( rule__CellState__Group__0 )
            // InternalChessGame.g:144:4: rule__CellState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CellState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCellState"


    // $ANTLR start "entryRuleCellDisplay"
    // InternalChessGame.g:153:1: entryRuleCellDisplay : ruleCellDisplay EOF ;
    public final void entryRuleCellDisplay() throws RecognitionException {
        try {
            // InternalChessGame.g:154:1: ( ruleCellDisplay EOF )
            // InternalChessGame.g:155:1: ruleCellDisplay EOF
            {
             before(grammarAccess.getCellDisplayRule()); 
            pushFollow(FOLLOW_1);
            ruleCellDisplay();

            state._fsp--;

             after(grammarAccess.getCellDisplayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCellDisplay"


    // $ANTLR start "ruleCellDisplay"
    // InternalChessGame.g:162:1: ruleCellDisplay : ( ( rule__CellDisplay__Group__0 ) ) ;
    public final void ruleCellDisplay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:166:2: ( ( ( rule__CellDisplay__Group__0 ) ) )
            // InternalChessGame.g:167:2: ( ( rule__CellDisplay__Group__0 ) )
            {
            // InternalChessGame.g:167:2: ( ( rule__CellDisplay__Group__0 ) )
            // InternalChessGame.g:168:3: ( rule__CellDisplay__Group__0 )
            {
             before(grammarAccess.getCellDisplayAccess().getGroup()); 
            // InternalChessGame.g:169:3: ( rule__CellDisplay__Group__0 )
            // InternalChessGame.g:169:4: rule__CellDisplay__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CellDisplay__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellDisplayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCellDisplay"


    // $ANTLR start "entryRuleTransition"
    // InternalChessGame.g:178:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalChessGame.g:179:1: ( ruleTransition EOF )
            // InternalChessGame.g:180:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalChessGame.g:187:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:191:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalChessGame.g:192:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalChessGame.g:192:2: ( ( rule__Transition__Group__0 ) )
            // InternalChessGame.g:193:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalChessGame.g:194:3: ( rule__Transition__Group__0 )
            // InternalChessGame.g:194:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleMouseTrigger"
    // InternalChessGame.g:203:1: entryRuleMouseTrigger : ruleMouseTrigger EOF ;
    public final void entryRuleMouseTrigger() throws RecognitionException {
        try {
            // InternalChessGame.g:204:1: ( ruleMouseTrigger EOF )
            // InternalChessGame.g:205:1: ruleMouseTrigger EOF
            {
             before(grammarAccess.getMouseTriggerRule()); 
            pushFollow(FOLLOW_1);
            ruleMouseTrigger();

            state._fsp--;

             after(grammarAccess.getMouseTriggerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMouseTrigger"


    // $ANTLR start "ruleMouseTrigger"
    // InternalChessGame.g:212:1: ruleMouseTrigger : ( ( rule__MouseTrigger__Alternatives ) ) ;
    public final void ruleMouseTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:216:2: ( ( ( rule__MouseTrigger__Alternatives ) ) )
            // InternalChessGame.g:217:2: ( ( rule__MouseTrigger__Alternatives ) )
            {
            // InternalChessGame.g:217:2: ( ( rule__MouseTrigger__Alternatives ) )
            // InternalChessGame.g:218:3: ( rule__MouseTrigger__Alternatives )
            {
             before(grammarAccess.getMouseTriggerAccess().getAlternatives()); 
            // InternalChessGame.g:219:3: ( rule__MouseTrigger__Alternatives )
            // InternalChessGame.g:219:4: rule__MouseTrigger__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MouseTrigger__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMouseTriggerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMouseTrigger"


    // $ANTLR start "entryRuleGameEnd"
    // InternalChessGame.g:228:1: entryRuleGameEnd : ruleGameEnd EOF ;
    public final void entryRuleGameEnd() throws RecognitionException {
        try {
            // InternalChessGame.g:229:1: ( ruleGameEnd EOF )
            // InternalChessGame.g:230:1: ruleGameEnd EOF
            {
             before(grammarAccess.getGameEndRule()); 
            pushFollow(FOLLOW_1);
            ruleGameEnd();

            state._fsp--;

             after(grammarAccess.getGameEndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGameEnd"


    // $ANTLR start "ruleGameEnd"
    // InternalChessGame.g:237:1: ruleGameEnd : ( ( rule__GameEnd__Group__0 ) ) ;
    public final void ruleGameEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:241:2: ( ( ( rule__GameEnd__Group__0 ) ) )
            // InternalChessGame.g:242:2: ( ( rule__GameEnd__Group__0 ) )
            {
            // InternalChessGame.g:242:2: ( ( rule__GameEnd__Group__0 ) )
            // InternalChessGame.g:243:3: ( rule__GameEnd__Group__0 )
            {
             before(grammarAccess.getGameEndAccess().getGroup()); 
            // InternalChessGame.g:244:3: ( rule__GameEnd__Group__0 )
            // InternalChessGame.g:244:4: rule__GameEnd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GameEnd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameEndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGameEnd"


    // $ANTLR start "entryRuleCellExpression"
    // InternalChessGame.g:253:1: entryRuleCellExpression : ruleCellExpression EOF ;
    public final void entryRuleCellExpression() throws RecognitionException {
        try {
            // InternalChessGame.g:254:1: ( ruleCellExpression EOF )
            // InternalChessGame.g:255:1: ruleCellExpression EOF
            {
             before(grammarAccess.getCellExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleCellExpression();

            state._fsp--;

             after(grammarAccess.getCellExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCellExpression"


    // $ANTLR start "ruleCellExpression"
    // InternalChessGame.g:262:1: ruleCellExpression : ( ( rule__CellExpression__Group__0 ) ) ;
    public final void ruleCellExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:266:2: ( ( ( rule__CellExpression__Group__0 ) ) )
            // InternalChessGame.g:267:2: ( ( rule__CellExpression__Group__0 ) )
            {
            // InternalChessGame.g:267:2: ( ( rule__CellExpression__Group__0 ) )
            // InternalChessGame.g:268:3: ( rule__CellExpression__Group__0 )
            {
             before(grammarAccess.getCellExpressionAccess().getGroup()); 
            // InternalChessGame.g:269:3: ( rule__CellExpression__Group__0 )
            // InternalChessGame.g:269:4: rule__CellExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CellExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCellExpression"


    // $ANTLR start "entryRuleStateCheck"
    // InternalChessGame.g:278:1: entryRuleStateCheck : ruleStateCheck EOF ;
    public final void entryRuleStateCheck() throws RecognitionException {
        try {
            // InternalChessGame.g:279:1: ( ruleStateCheck EOF )
            // InternalChessGame.g:280:1: ruleStateCheck EOF
            {
             before(grammarAccess.getStateCheckRule()); 
            pushFollow(FOLLOW_1);
            ruleStateCheck();

            state._fsp--;

             after(grammarAccess.getStateCheckRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateCheck"


    // $ANTLR start "ruleStateCheck"
    // InternalChessGame.g:287:1: ruleStateCheck : ( ( rule__StateCheck__Group__0 ) ) ;
    public final void ruleStateCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:291:2: ( ( ( rule__StateCheck__Group__0 ) ) )
            // InternalChessGame.g:292:2: ( ( rule__StateCheck__Group__0 ) )
            {
            // InternalChessGame.g:292:2: ( ( rule__StateCheck__Group__0 ) )
            // InternalChessGame.g:293:3: ( rule__StateCheck__Group__0 )
            {
             before(grammarAccess.getStateCheckAccess().getGroup()); 
            // InternalChessGame.g:294:3: ( rule__StateCheck__Group__0 )
            // InternalChessGame.g:294:4: rule__StateCheck__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StateCheck__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateCheckAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateCheck"


    // $ANTLR start "entryRuleEmptyExpression"
    // InternalChessGame.g:303:1: entryRuleEmptyExpression : ruleEmptyExpression EOF ;
    public final void entryRuleEmptyExpression() throws RecognitionException {
        try {
            // InternalChessGame.g:304:1: ( ruleEmptyExpression EOF )
            // InternalChessGame.g:305:1: ruleEmptyExpression EOF
            {
             before(grammarAccess.getEmptyExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEmptyExpression();

            state._fsp--;

             after(grammarAccess.getEmptyExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmptyExpression"


    // $ANTLR start "ruleEmptyExpression"
    // InternalChessGame.g:312:1: ruleEmptyExpression : ( ( rule__EmptyExpression__Group__0 ) ) ;
    public final void ruleEmptyExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:316:2: ( ( ( rule__EmptyExpression__Group__0 ) ) )
            // InternalChessGame.g:317:2: ( ( rule__EmptyExpression__Group__0 ) )
            {
            // InternalChessGame.g:317:2: ( ( rule__EmptyExpression__Group__0 ) )
            // InternalChessGame.g:318:3: ( rule__EmptyExpression__Group__0 )
            {
             before(grammarAccess.getEmptyExpressionAccess().getGroup()); 
            // InternalChessGame.g:319:3: ( rule__EmptyExpression__Group__0 )
            // InternalChessGame.g:319:4: rule__EmptyExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EmptyExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmptyExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmptyExpression"


    // $ANTLR start "entryRuleEndBehaviour"
    // InternalChessGame.g:328:1: entryRuleEndBehaviour : ruleEndBehaviour EOF ;
    public final void entryRuleEndBehaviour() throws RecognitionException {
        try {
            // InternalChessGame.g:329:1: ( ruleEndBehaviour EOF )
            // InternalChessGame.g:330:1: ruleEndBehaviour EOF
            {
             before(grammarAccess.getEndBehaviourRule()); 
            pushFollow(FOLLOW_1);
            ruleEndBehaviour();

            state._fsp--;

             after(grammarAccess.getEndBehaviourRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEndBehaviour"


    // $ANTLR start "ruleEndBehaviour"
    // InternalChessGame.g:337:1: ruleEndBehaviour : ( ( rule__EndBehaviour__Group__0 ) ) ;
    public final void ruleEndBehaviour() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:341:2: ( ( ( rule__EndBehaviour__Group__0 ) ) )
            // InternalChessGame.g:342:2: ( ( rule__EndBehaviour__Group__0 ) )
            {
            // InternalChessGame.g:342:2: ( ( rule__EndBehaviour__Group__0 ) )
            // InternalChessGame.g:343:3: ( rule__EndBehaviour__Group__0 )
            {
             before(grammarAccess.getEndBehaviourAccess().getGroup()); 
            // InternalChessGame.g:344:3: ( rule__EndBehaviour__Group__0 )
            // InternalChessGame.g:344:4: rule__EndBehaviour__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EndBehaviour__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEndBehaviourAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndBehaviour"


    // $ANTLR start "rulecolorChoice"
    // InternalChessGame.g:353:1: rulecolorChoice : ( ( rule__ColorChoice__Alternatives ) ) ;
    public final void rulecolorChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:357:1: ( ( ( rule__ColorChoice__Alternatives ) ) )
            // InternalChessGame.g:358:2: ( ( rule__ColorChoice__Alternatives ) )
            {
            // InternalChessGame.g:358:2: ( ( rule__ColorChoice__Alternatives ) )
            // InternalChessGame.g:359:3: ( rule__ColorChoice__Alternatives )
            {
             before(grammarAccess.getColorChoiceAccess().getAlternatives()); 
            // InternalChessGame.g:360:3: ( rule__ColorChoice__Alternatives )
            // InternalChessGame.g:360:4: rule__ColorChoice__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ColorChoice__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorChoiceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecolorChoice"


    // $ANTLR start "rule__Statements__Alternatives"
    // InternalChessGame.g:368:1: rule__Statements__Alternatives : ( ( ruleFieldSpecification ) | ( ruleCellState ) | ( ruleGameEnd ) );
    public final void rule__Statements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:372:1: ( ( ruleFieldSpecification ) | ( ruleCellState ) | ( ruleGameEnd ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalChessGame.g:373:2: ( ruleFieldSpecification )
                    {
                    // InternalChessGame.g:373:2: ( ruleFieldSpecification )
                    // InternalChessGame.g:374:3: ruleFieldSpecification
                    {
                     before(grammarAccess.getStatementsAccess().getFieldSpecificationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFieldSpecification();

                    state._fsp--;

                     after(grammarAccess.getStatementsAccess().getFieldSpecificationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessGame.g:379:2: ( ruleCellState )
                    {
                    // InternalChessGame.g:379:2: ( ruleCellState )
                    // InternalChessGame.g:380:3: ruleCellState
                    {
                     before(grammarAccess.getStatementsAccess().getCellStateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCellState();

                    state._fsp--;

                     after(grammarAccess.getStatementsAccess().getCellStateParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChessGame.g:385:2: ( ruleGameEnd )
                    {
                    // InternalChessGame.g:385:2: ( ruleGameEnd )
                    // InternalChessGame.g:386:3: ruleGameEnd
                    {
                     before(grammarAccess.getStatementsAccess().getGameEndParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGameEnd();

                    state._fsp--;

                     after(grammarAccess.getStatementsAccess().getGameEndParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Alternatives"


    // $ANTLR start "rule__CellDisplay__Alternatives_2"
    // InternalChessGame.g:395:1: rule__CellDisplay__Alternatives_2 : ( ( ( rule__CellDisplay__Group_2_0__0 ) ) | ( ( rule__CellDisplay__Group_2_1__0 ) ) );
    public final void rule__CellDisplay__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:399:1: ( ( ( rule__CellDisplay__Group_2_0__0 ) ) | ( ( rule__CellDisplay__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalChessGame.g:400:2: ( ( rule__CellDisplay__Group_2_0__0 ) )
                    {
                    // InternalChessGame.g:400:2: ( ( rule__CellDisplay__Group_2_0__0 ) )
                    // InternalChessGame.g:401:3: ( rule__CellDisplay__Group_2_0__0 )
                    {
                     before(grammarAccess.getCellDisplayAccess().getGroup_2_0()); 
                    // InternalChessGame.g:402:3: ( rule__CellDisplay__Group_2_0__0 )
                    // InternalChessGame.g:402:4: rule__CellDisplay__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CellDisplay__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCellDisplayAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessGame.g:406:2: ( ( rule__CellDisplay__Group_2_1__0 ) )
                    {
                    // InternalChessGame.g:406:2: ( ( rule__CellDisplay__Group_2_1__0 ) )
                    // InternalChessGame.g:407:3: ( rule__CellDisplay__Group_2_1__0 )
                    {
                     before(grammarAccess.getCellDisplayAccess().getGroup_2_1()); 
                    // InternalChessGame.g:408:3: ( rule__CellDisplay__Group_2_1__0 )
                    // InternalChessGame.g:408:4: rule__CellDisplay__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CellDisplay__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCellDisplayAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplay__Alternatives_2"


    // $ANTLR start "rule__MouseTrigger__Alternatives"
    // InternalChessGame.g:416:1: rule__MouseTrigger__Alternatives : ( ( ( rule__MouseTrigger__MouseAssignment_0 ) ) | ( ( rule__MouseTrigger__Group_1__0 ) ) );
    public final void rule__MouseTrigger__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:420:1: ( ( ( rule__MouseTrigger__MouseAssignment_0 ) ) | ( ( rule__MouseTrigger__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==36) ) {
                alt4=1;
            }
            else if ( (LA4_0==26) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalChessGame.g:421:2: ( ( rule__MouseTrigger__MouseAssignment_0 ) )
                    {
                    // InternalChessGame.g:421:2: ( ( rule__MouseTrigger__MouseAssignment_0 ) )
                    // InternalChessGame.g:422:3: ( rule__MouseTrigger__MouseAssignment_0 )
                    {
                     before(grammarAccess.getMouseTriggerAccess().getMouseAssignment_0()); 
                    // InternalChessGame.g:423:3: ( rule__MouseTrigger__MouseAssignment_0 )
                    // InternalChessGame.g:423:4: rule__MouseTrigger__MouseAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MouseTrigger__MouseAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMouseTriggerAccess().getMouseAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessGame.g:427:2: ( ( rule__MouseTrigger__Group_1__0 ) )
                    {
                    // InternalChessGame.g:427:2: ( ( rule__MouseTrigger__Group_1__0 ) )
                    // InternalChessGame.g:428:3: ( rule__MouseTrigger__Group_1__0 )
                    {
                     before(grammarAccess.getMouseTriggerAccess().getGroup_1()); 
                    // InternalChessGame.g:429:3: ( rule__MouseTrigger__Group_1__0 )
                    // InternalChessGame.g:429:4: rule__MouseTrigger__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MouseTrigger__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMouseTriggerAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MouseTrigger__Alternatives"


    // $ANTLR start "rule__ColorChoice__Alternatives"
    // InternalChessGame.g:437:1: rule__ColorChoice__Alternatives : ( ( ( 'black' ) ) | ( ( 'white' ) ) );
    public final void rule__ColorChoice__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:441:1: ( ( ( 'black' ) ) | ( ( 'white' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalChessGame.g:442:2: ( ( 'black' ) )
                    {
                    // InternalChessGame.g:442:2: ( ( 'black' ) )
                    // InternalChessGame.g:443:3: ( 'black' )
                    {
                     before(grammarAccess.getColorChoiceAccess().getBlackEnumLiteralDeclaration_0()); 
                    // InternalChessGame.g:444:3: ( 'black' )
                    // InternalChessGame.g:444:4: 'black'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorChoiceAccess().getBlackEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessGame.g:448:2: ( ( 'white' ) )
                    {
                    // InternalChessGame.g:448:2: ( ( 'white' ) )
                    // InternalChessGame.g:449:3: ( 'white' )
                    {
                     before(grammarAccess.getColorChoiceAccess().getWhiteEnumLiteralDeclaration_1()); 
                    // InternalChessGame.g:450:3: ( 'white' )
                    // InternalChessGame.g:450:4: 'white'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorChoiceAccess().getWhiteEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorChoice__Alternatives"


    // $ANTLR start "rule__FieldSpecification__Group__0"
    // InternalChessGame.g:458:1: rule__FieldSpecification__Group__0 : rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1 ;
    public final void rule__FieldSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:462:1: ( rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1 )
            // InternalChessGame.g:463:2: rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__FieldSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__0"


    // $ANTLR start "rule__FieldSpecification__Group__0__Impl"
    // InternalChessGame.g:470:1: rule__FieldSpecification__Group__0__Impl : ( 'field' ) ;
    public final void rule__FieldSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:474:1: ( ( 'field' ) )
            // InternalChessGame.g:475:1: ( 'field' )
            {
            // InternalChessGame.g:475:1: ( 'field' )
            // InternalChessGame.g:476:2: 'field'
            {
             before(grammarAccess.getFieldSpecificationAccess().getFieldKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFieldSpecificationAccess().getFieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__0__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__1"
    // InternalChessGame.g:485:1: rule__FieldSpecification__Group__1 : rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2 ;
    public final void rule__FieldSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:489:1: ( rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2 )
            // InternalChessGame.g:490:2: rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__FieldSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__1"


    // $ANTLR start "rule__FieldSpecification__Group__1__Impl"
    // InternalChessGame.g:497:1: rule__FieldSpecification__Group__1__Impl : ( '{' ) ;
    public final void rule__FieldSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:501:1: ( ( '{' ) )
            // InternalChessGame.g:502:1: ( '{' )
            {
            // InternalChessGame.g:502:1: ( '{' )
            // InternalChessGame.g:503:2: '{'
            {
             before(grammarAccess.getFieldSpecificationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFieldSpecificationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__1__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__2"
    // InternalChessGame.g:512:1: rule__FieldSpecification__Group__2 : rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3 ;
    public final void rule__FieldSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:516:1: ( rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3 )
            // InternalChessGame.g:517:2: rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__FieldSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__2"


    // $ANTLR start "rule__FieldSpecification__Group__2__Impl"
    // InternalChessGame.g:524:1: rule__FieldSpecification__Group__2__Impl : ( 'width' ) ;
    public final void rule__FieldSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:528:1: ( ( 'width' ) )
            // InternalChessGame.g:529:1: ( 'width' )
            {
            // InternalChessGame.g:529:1: ( 'width' )
            // InternalChessGame.g:530:2: 'width'
            {
             before(grammarAccess.getFieldSpecificationAccess().getWidthKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFieldSpecificationAccess().getWidthKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__2__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__3"
    // InternalChessGame.g:539:1: rule__FieldSpecification__Group__3 : rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4 ;
    public final void rule__FieldSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:543:1: ( rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4 )
            // InternalChessGame.g:544:2: rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__FieldSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__3"


    // $ANTLR start "rule__FieldSpecification__Group__3__Impl"
    // InternalChessGame.g:551:1: rule__FieldSpecification__Group__3__Impl : ( '=' ) ;
    public final void rule__FieldSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:555:1: ( ( '=' ) )
            // InternalChessGame.g:556:1: ( '=' )
            {
            // InternalChessGame.g:556:1: ( '=' )
            // InternalChessGame.g:557:2: '='
            {
             before(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__3__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__4"
    // InternalChessGame.g:566:1: rule__FieldSpecification__Group__4 : rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5 ;
    public final void rule__FieldSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:570:1: ( rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5 )
            // InternalChessGame.g:571:2: rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__FieldSpecification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__4"


    // $ANTLR start "rule__FieldSpecification__Group__4__Impl"
    // InternalChessGame.g:578:1: rule__FieldSpecification__Group__4__Impl : ( ( rule__FieldSpecification__WidthAssignment_4 ) ) ;
    public final void rule__FieldSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:582:1: ( ( ( rule__FieldSpecification__WidthAssignment_4 ) ) )
            // InternalChessGame.g:583:1: ( ( rule__FieldSpecification__WidthAssignment_4 ) )
            {
            // InternalChessGame.g:583:1: ( ( rule__FieldSpecification__WidthAssignment_4 ) )
            // InternalChessGame.g:584:2: ( rule__FieldSpecification__WidthAssignment_4 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getWidthAssignment_4()); 
            // InternalChessGame.g:585:2: ( rule__FieldSpecification__WidthAssignment_4 )
            // InternalChessGame.g:585:3: rule__FieldSpecification__WidthAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FieldSpecification__WidthAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFieldSpecificationAccess().getWidthAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__4__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__5"
    // InternalChessGame.g:593:1: rule__FieldSpecification__Group__5 : rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6 ;
    public final void rule__FieldSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:597:1: ( rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6 )
            // InternalChessGame.g:598:2: rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__FieldSpecification__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__5"


    // $ANTLR start "rule__FieldSpecification__Group__5__Impl"
    // InternalChessGame.g:605:1: rule__FieldSpecification__Group__5__Impl : ( 'height' ) ;
    public final void rule__FieldSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:609:1: ( ( 'height' ) )
            // InternalChessGame.g:610:1: ( 'height' )
            {
            // InternalChessGame.g:610:1: ( 'height' )
            // InternalChessGame.g:611:2: 'height'
            {
             before(grammarAccess.getFieldSpecificationAccess().getHeightKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFieldSpecificationAccess().getHeightKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__5__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__6"
    // InternalChessGame.g:620:1: rule__FieldSpecification__Group__6 : rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7 ;
    public final void rule__FieldSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:624:1: ( rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7 )
            // InternalChessGame.g:625:2: rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__FieldSpecification__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__6"


    // $ANTLR start "rule__FieldSpecification__Group__6__Impl"
    // InternalChessGame.g:632:1: rule__FieldSpecification__Group__6__Impl : ( '=' ) ;
    public final void rule__FieldSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:636:1: ( ( '=' ) )
            // InternalChessGame.g:637:1: ( '=' )
            {
            // InternalChessGame.g:637:1: ( '=' )
            // InternalChessGame.g:638:2: '='
            {
             before(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__6__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__7"
    // InternalChessGame.g:647:1: rule__FieldSpecification__Group__7 : rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8 ;
    public final void rule__FieldSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:651:1: ( rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8 )
            // InternalChessGame.g:652:2: rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__FieldSpecification__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__7"


    // $ANTLR start "rule__FieldSpecification__Group__7__Impl"
    // InternalChessGame.g:659:1: rule__FieldSpecification__Group__7__Impl : ( ( rule__FieldSpecification__HeightAssignment_7 ) ) ;
    public final void rule__FieldSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:663:1: ( ( ( rule__FieldSpecification__HeightAssignment_7 ) ) )
            // InternalChessGame.g:664:1: ( ( rule__FieldSpecification__HeightAssignment_7 ) )
            {
            // InternalChessGame.g:664:1: ( ( rule__FieldSpecification__HeightAssignment_7 ) )
            // InternalChessGame.g:665:2: ( rule__FieldSpecification__HeightAssignment_7 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getHeightAssignment_7()); 
            // InternalChessGame.g:666:2: ( rule__FieldSpecification__HeightAssignment_7 )
            // InternalChessGame.g:666:3: rule__FieldSpecification__HeightAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__FieldSpecification__HeightAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getFieldSpecificationAccess().getHeightAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__7__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__8"
    // InternalChessGame.g:674:1: rule__FieldSpecification__Group__8 : rule__FieldSpecification__Group__8__Impl ;
    public final void rule__FieldSpecification__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:678:1: ( rule__FieldSpecification__Group__8__Impl )
            // InternalChessGame.g:679:2: rule__FieldSpecification__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__8"


    // $ANTLR start "rule__FieldSpecification__Group__8__Impl"
    // InternalChessGame.g:685:1: rule__FieldSpecification__Group__8__Impl : ( '}' ) ;
    public final void rule__FieldSpecification__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:689:1: ( ( '}' ) )
            // InternalChessGame.g:690:1: ( '}' )
            {
            // InternalChessGame.g:690:1: ( '}' )
            // InternalChessGame.g:691:2: '}'
            {
             before(grammarAccess.getFieldSpecificationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFieldSpecificationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__Group__8__Impl"


    // $ANTLR start "rule__CellState__Group__0"
    // InternalChessGame.g:701:1: rule__CellState__Group__0 : rule__CellState__Group__0__Impl rule__CellState__Group__1 ;
    public final void rule__CellState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:705:1: ( rule__CellState__Group__0__Impl rule__CellState__Group__1 )
            // InternalChessGame.g:706:2: rule__CellState__Group__0__Impl rule__CellState__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CellState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellState__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group__0"


    // $ANTLR start "rule__CellState__Group__0__Impl"
    // InternalChessGame.g:713:1: rule__CellState__Group__0__Impl : ( ( rule__CellState__NameAssignment_0 ) ) ;
    public final void rule__CellState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:717:1: ( ( ( rule__CellState__NameAssignment_0 ) ) )
            // InternalChessGame.g:718:1: ( ( rule__CellState__NameAssignment_0 ) )
            {
            // InternalChessGame.g:718:1: ( ( rule__CellState__NameAssignment_0 ) )
            // InternalChessGame.g:719:2: ( rule__CellState__NameAssignment_0 )
            {
             before(grammarAccess.getCellStateAccess().getNameAssignment_0()); 
            // InternalChessGame.g:720:2: ( rule__CellState__NameAssignment_0 )
            // InternalChessGame.g:720:3: rule__CellState__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CellState__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCellStateAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group__0__Impl"


    // $ANTLR start "rule__CellState__Group__1"
    // InternalChessGame.g:728:1: rule__CellState__Group__1 : rule__CellState__Group__1__Impl rule__CellState__Group__2 ;
    public final void rule__CellState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:732:1: ( rule__CellState__Group__1__Impl rule__CellState__Group__2 )
            // InternalChessGame.g:733:2: rule__CellState__Group__1__Impl rule__CellState__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__CellState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellState__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group__1"


    // $ANTLR start "rule__CellState__Group__1__Impl"
    // InternalChessGame.g:740:1: rule__CellState__Group__1__Impl : ( '{' ) ;
    public final void rule__CellState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:744:1: ( ( '{' ) )
            // InternalChessGame.g:745:1: ( '{' )
            {
            // InternalChessGame.g:745:1: ( '{' )
            // InternalChessGame.g:746:2: '{'
            {
             before(grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group__1__Impl"


    // $ANTLR start "rule__CellState__Group__2"
    // InternalChessGame.g:755:1: rule__CellState__Group__2 : rule__CellState__Group__2__Impl rule__CellState__Group__3 ;
    public final void rule__CellState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:759:1: ( rule__CellState__Group__2__Impl rule__CellState__Group__3 )
            // InternalChessGame.g:760:2: rule__CellState__Group__2__Impl rule__CellState__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__CellState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellState__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group__2"


    // $ANTLR start "rule__CellState__Group__2__Impl"
    // InternalChessGame.g:767:1: rule__CellState__Group__2__Impl : ( ( rule__CellState__DisplayAssignment_2 ) ) ;
    public final void rule__CellState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:771:1: ( ( ( rule__CellState__DisplayAssignment_2 ) ) )
            // InternalChessGame.g:772:1: ( ( rule__CellState__DisplayAssignment_2 ) )
            {
            // InternalChessGame.g:772:1: ( ( rule__CellState__DisplayAssignment_2 ) )
            // InternalChessGame.g:773:2: ( rule__CellState__DisplayAssignment_2 )
            {
             before(grammarAccess.getCellStateAccess().getDisplayAssignment_2()); 
            // InternalChessGame.g:774:2: ( rule__CellState__DisplayAssignment_2 )
            // InternalChessGame.g:774:3: rule__CellState__DisplayAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CellState__DisplayAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCellStateAccess().getDisplayAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group__2__Impl"


    // $ANTLR start "rule__CellState__Group__3"
    // InternalChessGame.g:782:1: rule__CellState__Group__3 : rule__CellState__Group__3__Impl rule__CellState__Group__4 ;
    public final void rule__CellState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:786:1: ( rule__CellState__Group__3__Impl rule__CellState__Group__4 )
            // InternalChessGame.g:787:2: rule__CellState__Group__3__Impl rule__CellState__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__CellState__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellState__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group__3"


    // $ANTLR start "rule__CellState__Group__3__Impl"
    // InternalChessGame.g:794:1: rule__CellState__Group__3__Impl : ( ( rule__CellState__Group_3__0 )? ) ;
    public final void rule__CellState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:798:1: ( ( ( rule__CellState__Group_3__0 )? ) )
            // InternalChessGame.g:799:1: ( ( rule__CellState__Group_3__0 )? )
            {
            // InternalChessGame.g:799:1: ( ( rule__CellState__Group_3__0 )? )
            // InternalChessGame.g:800:2: ( rule__CellState__Group_3__0 )?
            {
             before(grammarAccess.getCellStateAccess().getGroup_3()); 
            // InternalChessGame.g:801:2: ( rule__CellState__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalChessGame.g:801:3: rule__CellState__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CellState__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCellStateAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group__3__Impl"


    // $ANTLR start "rule__CellState__Group__4"
    // InternalChessGame.g:809:1: rule__CellState__Group__4 : rule__CellState__Group__4__Impl ;
    public final void rule__CellState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:813:1: ( rule__CellState__Group__4__Impl )
            // InternalChessGame.g:814:2: rule__CellState__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CellState__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group__4"


    // $ANTLR start "rule__CellState__Group__4__Impl"
    // InternalChessGame.g:820:1: rule__CellState__Group__4__Impl : ( '}' ) ;
    public final void rule__CellState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:824:1: ( ( '}' ) )
            // InternalChessGame.g:825:1: ( '}' )
            {
            // InternalChessGame.g:825:1: ( '}' )
            // InternalChessGame.g:826:2: '}'
            {
             before(grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group__4__Impl"


    // $ANTLR start "rule__CellState__Group_3__0"
    // InternalChessGame.g:836:1: rule__CellState__Group_3__0 : rule__CellState__Group_3__0__Impl rule__CellState__Group_3__1 ;
    public final void rule__CellState__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:840:1: ( rule__CellState__Group_3__0__Impl rule__CellState__Group_3__1 )
            // InternalChessGame.g:841:2: rule__CellState__Group_3__0__Impl rule__CellState__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__CellState__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellState__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group_3__0"


    // $ANTLR start "rule__CellState__Group_3__0__Impl"
    // InternalChessGame.g:848:1: rule__CellState__Group_3__0__Impl : ( 'transitions' ) ;
    public final void rule__CellState__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:852:1: ( ( 'transitions' ) )
            // InternalChessGame.g:853:1: ( 'transitions' )
            {
            // InternalChessGame.g:853:1: ( 'transitions' )
            // InternalChessGame.g:854:2: 'transitions'
            {
             before(grammarAccess.getCellStateAccess().getTransitionsKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCellStateAccess().getTransitionsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group_3__0__Impl"


    // $ANTLR start "rule__CellState__Group_3__1"
    // InternalChessGame.g:863:1: rule__CellState__Group_3__1 : rule__CellState__Group_3__1__Impl rule__CellState__Group_3__2 ;
    public final void rule__CellState__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:867:1: ( rule__CellState__Group_3__1__Impl rule__CellState__Group_3__2 )
            // InternalChessGame.g:868:2: rule__CellState__Group_3__1__Impl rule__CellState__Group_3__2
            {
            pushFollow(FOLLOW_12);
            rule__CellState__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellState__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group_3__1"


    // $ANTLR start "rule__CellState__Group_3__1__Impl"
    // InternalChessGame.g:875:1: rule__CellState__Group_3__1__Impl : ( '{' ) ;
    public final void rule__CellState__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:879:1: ( ( '{' ) )
            // InternalChessGame.g:880:1: ( '{' )
            {
            // InternalChessGame.g:880:1: ( '{' )
            // InternalChessGame.g:881:2: '{'
            {
             before(grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group_3__1__Impl"


    // $ANTLR start "rule__CellState__Group_3__2"
    // InternalChessGame.g:890:1: rule__CellState__Group_3__2 : rule__CellState__Group_3__2__Impl rule__CellState__Group_3__3 ;
    public final void rule__CellState__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:894:1: ( rule__CellState__Group_3__2__Impl rule__CellState__Group_3__3 )
            // InternalChessGame.g:895:2: rule__CellState__Group_3__2__Impl rule__CellState__Group_3__3
            {
            pushFollow(FOLLOW_9);
            rule__CellState__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellState__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group_3__2"


    // $ANTLR start "rule__CellState__Group_3__2__Impl"
    // InternalChessGame.g:902:1: rule__CellState__Group_3__2__Impl : ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) ) ;
    public final void rule__CellState__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:906:1: ( ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) ) )
            // InternalChessGame.g:907:1: ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) )
            {
            // InternalChessGame.g:907:1: ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) )
            // InternalChessGame.g:908:2: ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* )
            {
            // InternalChessGame.g:908:2: ( ( rule__CellState__TransitionsAssignment_3_2 ) )
            // InternalChessGame.g:909:3: ( rule__CellState__TransitionsAssignment_3_2 )
            {
             before(grammarAccess.getCellStateAccess().getTransitionsAssignment_3_2()); 
            // InternalChessGame.g:910:3: ( rule__CellState__TransitionsAssignment_3_2 )
            // InternalChessGame.g:910:4: rule__CellState__TransitionsAssignment_3_2
            {
            pushFollow(FOLLOW_13);
            rule__CellState__TransitionsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCellStateAccess().getTransitionsAssignment_3_2()); 

            }

            // InternalChessGame.g:913:2: ( ( rule__CellState__TransitionsAssignment_3_2 )* )
            // InternalChessGame.g:914:3: ( rule__CellState__TransitionsAssignment_3_2 )*
            {
             before(grammarAccess.getCellStateAccess().getTransitionsAssignment_3_2()); 
            // InternalChessGame.g:915:3: ( rule__CellState__TransitionsAssignment_3_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalChessGame.g:915:4: rule__CellState__TransitionsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__CellState__TransitionsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getCellStateAccess().getTransitionsAssignment_3_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group_3__2__Impl"


    // $ANTLR start "rule__CellState__Group_3__3"
    // InternalChessGame.g:924:1: rule__CellState__Group_3__3 : rule__CellState__Group_3__3__Impl ;
    public final void rule__CellState__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:928:1: ( rule__CellState__Group_3__3__Impl )
            // InternalChessGame.g:929:2: rule__CellState__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CellState__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group_3__3"


    // $ANTLR start "rule__CellState__Group_3__3__Impl"
    // InternalChessGame.g:935:1: rule__CellState__Group_3__3__Impl : ( '}' ) ;
    public final void rule__CellState__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:939:1: ( ( '}' ) )
            // InternalChessGame.g:940:1: ( '}' )
            {
            // InternalChessGame.g:940:1: ( '}' )
            // InternalChessGame.g:941:2: '}'
            {
             before(grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__Group_3__3__Impl"


    // $ANTLR start "rule__CellDisplay__Group__0"
    // InternalChessGame.g:951:1: rule__CellDisplay__Group__0 : rule__CellDisplay__Group__0__Impl rule__CellDisplay__Group__1 ;
    public final void rule__CellDisplay__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:955:1: ( rule__CellDisplay__Group__0__Impl rule__CellDisplay__Group__1 )
            // InternalChessGame.g:956:2: rule__CellDisplay__Group__0__Impl rule__CellDisplay__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CellDisplay__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellDisplay__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplay__Group__0"


    // $ANTLR start "rule__CellDisplay__Group__0__Impl"
    // InternalChessGame.g:963:1: rule__CellDisplay__Group__0__Impl : ( 'display' ) ;
    public final void rule__CellDisplay__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:967:1: ( ( 'display' ) )
            // InternalChessGame.g:968:1: ( 'display' )
            {
            // InternalChessGame.g:968:1: ( 'display' )
            // InternalChessGame.g:969:2: 'display'
            {
             before(grammarAccess.getCellDisplayAccess().getDisplayKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCellDisplayAccess().getDisplayKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplay__Group__0__Impl"


    // $ANTLR start "rule__CellDisplay__Group__1"
    // InternalChessGame.g:978:1: rule__CellDisplay__Group__1 : rule__CellDisplay__Group__1__Impl rule__CellDisplay__Group__2 ;
    public final void rule__CellDisplay__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:982:1: ( rule__CellDisplay__Group__1__Impl rule__CellDisplay__Group__2 )
            // InternalChessGame.g:983:2: rule__CellDisplay__Group__1__Impl rule__CellDisplay__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__CellDisplay__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellDisplay__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplay__Group__1"


    // $ANTLR start "rule__CellDisplay__Group__1__Impl"
    // InternalChessGame.g:990:1: rule__CellDisplay__Group__1__Impl : ( '{' ) ;
    public final void rule__CellDisplay__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:994:1: ( ( '{' ) )
            // InternalChessGame.g:995:1: ( '{' )
            {
            // InternalChessGame.g:995:1: ( '{' )
            // InternalChessGame.g:996:2: '{'
            {
             before(grammarAccess.getCellDisplayAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCellDisplayAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplay__Group__1__Impl"


    // $ANTLR start "rule__CellDisplay__Group__2"
    // InternalChessGame.g:1005:1: rule__CellDisplay__Group__2 : rule__CellDisplay__Group__2__Impl rule__CellDisplay__Group__3 ;
    public final void rule__CellDisplay__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1009:1: ( rule__CellDisplay__Group__2__Impl rule__CellDisplay__Group__3 )
            // InternalChessGame.g:1010:2: rule__CellDisplay__Group__2__Impl rule__CellDisplay__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__CellDisplay__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellDisplay__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplay__Group__2"


    // $ANTLR start "rule__CellDisplay__Group__2__Impl"
    // InternalChessGame.g:1017:1: rule__CellDisplay__Group__2__Impl : ( ( rule__CellDisplay__Alternatives_2 ) ) ;
    public final void rule__CellDisplay__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1021:1: ( ( ( rule__CellDisplay__Alternatives_2 ) ) )
            // InternalChessGame.g:1022:1: ( ( rule__CellDisplay__Alternatives_2 ) )
            {
            // InternalChessGame.g:1022:1: ( ( rule__CellDisplay__Alternatives_2 ) )
            // InternalChessGame.g:1023:2: ( rule__CellDisplay__Alternatives_2 )
            {
             before(grammarAccess.getCellDisplayAccess().getAlternatives_2()); 
            // InternalChessGame.g:1024:2: ( rule__CellDisplay__Alternatives_2 )
            // InternalChessGame.g:1024:3: rule__CellDisplay__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__CellDisplay__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getCellDisplayAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplay__Group__2__Impl"


    // $ANTLR start "rule__CellDisplay__Group__3"
    // InternalChessGame.g:1032:1: rule__CellDisplay__Group__3 : rule__CellDisplay__Group__3__Impl ;
    public final void rule__CellDisplay__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1036:1: ( rule__CellDisplay__Group__3__Impl )
            // InternalChessGame.g:1037:2: rule__CellDisplay__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CellDisplay__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplay__Group__3"


    // $ANTLR start "rule__CellDisplay__Group__3__Impl"
    // InternalChessGame.g:1043:1: rule__CellDisplay__Group__3__Impl : ( '}' ) ;
    public final void rule__CellDisplay__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1047:1: ( ( '}' ) )
            // InternalChessGame.g:1048:1: ( '}' )
            {
            // InternalChessGame.g:1048:1: ( '}' )
            // InternalChessGame.g:1049:2: '}'
            {
             before(grammarAccess.getCellDisplayAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCellDisplayAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplay__Group__3__Impl"


    // $ANTLR start "rule__CellDisplay__Group_2_0__0"
    // InternalChessGame.g:1059:1: rule__CellDisplay__Group_2_0__0 : rule__CellDisplay__Group_2_0__0__Impl rule__CellDisplay__Group_2_0__1 ;
    public final void rule__CellDisplay__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1063:1: ( rule__CellDisplay__Group_2_0__0__Impl rule__CellDisplay__Group_2_0__1 )
            // InternalChessGame.g:1064:2: rule__CellDisplay__Group_2_0__0__Impl rule__CellDisplay__Group_2_0__1
            {
            pushFollow(FOLLOW_6);
            rule__CellDisplay__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellDisplay__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplay__Group_2_0__0"


    // $ANTLR start "rule__CellDisplay__Group_2_0__0__Impl"
    // InternalChessGame.g:1071:1: rule__CellDisplay__Group_2_0__0__Impl : ( 'text' ) ;
    public final void rule__CellDisplay__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1075:1: ( ( 'text' ) )
            // InternalChessGame.g:1076:1: ( 'text' )
            {
            // InternalChessGame.g:1076:1: ( 'text' )
            // InternalChessGame.g:1077:2: 'text'
            {
             before(grammarAccess.getCellDisplayAccess().getTextKeyword_2_0_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCellDisplayAccess().getTextKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplay__Group_2_0__0__Impl"


    // $ANTLR start "rule__CellDisplay__Group_2_0__1"
    // InternalChessGame.g:1086:1: rule__CellDisplay__Group_2_0__1 : rule__CellDisplay__Group_2_0__1__Impl rule__CellDisplay__Group_2_0__2 ;
    public final void rule__CellDisplay__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1090:1: ( rule__CellDisplay__Group_2_0__1__Impl rule__CellDisplay__Group_2_0__2 )
            // InternalChessGame.g:1091:2: rule__CellDisplay__Group_2_0__1__Impl rule__CellDisplay__Group_2_0__2
            {
            pushFollow(FOLLOW_15);
            rule__CellDisplay__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellDisplay__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplay__Group_2_0__1"


    // $ANTLR start "rule__CellDisplay__Group_2_0__1__Impl"
    // InternalChessGame.g:1098:1: rule__CellDisplay__Group_2_0__1__Impl : ( '=' ) ;
    public final void rule__CellDisplay__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1102:1: ( ( '=' ) )
            // InternalChessGame.g:1103:1: ( '=' )
            {
            // InternalChessGame.g:1103:1: ( '=' )
            // InternalChessGame.g:1104:2: '='
            {
             before(grammarAccess.getCellDisplayAccess().getEqualsSignKeyword_2_0_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCellDisplayAccess().getEqualsSignKeyword_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplay__Group_2_0__1__Impl"


    // $ANTLR start "rule__CellDisplay__Group_2_0__2"
    // InternalChessGame.g:1113:1: rule__CellDisplay__Group_2_0__2 : rule__CellDisplay__Group_2_0__2__Impl ;
    public final void rule__CellDisplay__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1117:1: ( rule__CellDisplay__Group_2_0__2__Impl )
            // InternalChessGame.g:1118:2: rule__CellDisplay__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CellDisplay__Group_2_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplay__Group_2_0__2"


    // $ANTLR start "rule__CellDisplay__Group_2_0__2__Impl"
    // InternalChessGame.g:1124:1: rule__CellDisplay__Group_2_0__2__Impl : ( ( rule__CellDisplay__TextAssignment_2_0_2 ) ) ;
    public final void rule__CellDisplay__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1128:1: ( ( ( rule__CellDisplay__TextAssignment_2_0_2 ) ) )
            // InternalChessGame.g:1129:1: ( ( rule__CellDisplay__TextAssignment_2_0_2 ) )
            {
            // InternalChessGame.g:1129:1: ( ( rule__CellDisplay__TextAssignment_2_0_2 ) )
            // InternalChessGame.g:1130:2: ( rule__CellDisplay__TextAssignment_2_0_2 )
            {
             before(grammarAccess.getCellDisplayAccess().getTextAssignment_2_0_2()); 
            // InternalChessGame.g:1131:2: ( rule__CellDisplay__TextAssignment_2_0_2 )
            // InternalChessGame.g:1131:3: rule__CellDisplay__TextAssignment_2_0_2
            {
            pushFollow(FOLLOW_2);
            rule__CellDisplay__TextAssignment_2_0_2();

            state._fsp--;


            }

             after(grammarAccess.getCellDisplayAccess().getTextAssignment_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplay__Group_2_0__2__Impl"


    // $ANTLR start "rule__CellDisplay__Group_2_1__0"
    // InternalChessGame.g:1140:1: rule__CellDisplay__Group_2_1__0 : rule__CellDisplay__Group_2_1__0__Impl rule__CellDisplay__Group_2_1__1 ;
    public final void rule__CellDisplay__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1144:1: ( rule__CellDisplay__Group_2_1__0__Impl rule__CellDisplay__Group_2_1__1 )
            // InternalChessGame.g:1145:2: rule__CellDisplay__Group_2_1__0__Impl rule__CellDisplay__Group_2_1__1
            {
            pushFollow(FOLLOW_6);
            rule__CellDisplay__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellDisplay__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplay__Group_2_1__0"


    // $ANTLR start "rule__CellDisplay__Group_2_1__0__Impl"
    // InternalChessGame.g:1152:1: rule__CellDisplay__Group_2_1__0__Impl : ( 'color' ) ;
    public final void rule__CellDisplay__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1156:1: ( ( 'color' ) )
            // InternalChessGame.g:1157:1: ( 'color' )
            {
            // InternalChessGame.g:1157:1: ( 'color' )
            // InternalChessGame.g:1158:2: 'color'
            {
             before(grammarAccess.getCellDisplayAccess().getColorKeyword_2_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCellDisplayAccess().getColorKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplay__Group_2_1__0__Impl"


    // $ANTLR start "rule__CellDisplay__Group_2_1__1"
    // InternalChessGame.g:1167:1: rule__CellDisplay__Group_2_1__1 : rule__CellDisplay__Group_2_1__1__Impl rule__CellDisplay__Group_2_1__2 ;
    public final void rule__CellDisplay__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1171:1: ( rule__CellDisplay__Group_2_1__1__Impl rule__CellDisplay__Group_2_1__2 )
            // InternalChessGame.g:1172:2: rule__CellDisplay__Group_2_1__1__Impl rule__CellDisplay__Group_2_1__2
            {
            pushFollow(FOLLOW_16);
            rule__CellDisplay__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellDisplay__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplay__Group_2_1__1"


    // $ANTLR start "rule__CellDisplay__Group_2_1__1__Impl"
    // InternalChessGame.g:1179:1: rule__CellDisplay__Group_2_1__1__Impl : ( '=' ) ;
    public final void rule__CellDisplay__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1183:1: ( ( '=' ) )
            // InternalChessGame.g:1184:1: ( '=' )
            {
            // InternalChessGame.g:1184:1: ( '=' )
            // InternalChessGame.g:1185:2: '='
            {
             before(grammarAccess.getCellDisplayAccess().getEqualsSignKeyword_2_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCellDisplayAccess().getEqualsSignKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplay__Group_2_1__1__Impl"


    // $ANTLR start "rule__CellDisplay__Group_2_1__2"
    // InternalChessGame.g:1194:1: rule__CellDisplay__Group_2_1__2 : rule__CellDisplay__Group_2_1__2__Impl ;
    public final void rule__CellDisplay__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1198:1: ( rule__CellDisplay__Group_2_1__2__Impl )
            // InternalChessGame.g:1199:2: rule__CellDisplay__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CellDisplay__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplay__Group_2_1__2"


    // $ANTLR start "rule__CellDisplay__Group_2_1__2__Impl"
    // InternalChessGame.g:1205:1: rule__CellDisplay__Group_2_1__2__Impl : ( ( rule__CellDisplay__ColorAssignment_2_1_2 ) ) ;
    public final void rule__CellDisplay__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1209:1: ( ( ( rule__CellDisplay__ColorAssignment_2_1_2 ) ) )
            // InternalChessGame.g:1210:1: ( ( rule__CellDisplay__ColorAssignment_2_1_2 ) )
            {
            // InternalChessGame.g:1210:1: ( ( rule__CellDisplay__ColorAssignment_2_1_2 ) )
            // InternalChessGame.g:1211:2: ( rule__CellDisplay__ColorAssignment_2_1_2 )
            {
             before(grammarAccess.getCellDisplayAccess().getColorAssignment_2_1_2()); 
            // InternalChessGame.g:1212:2: ( rule__CellDisplay__ColorAssignment_2_1_2 )
            // InternalChessGame.g:1212:3: rule__CellDisplay__ColorAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__CellDisplay__ColorAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCellDisplayAccess().getColorAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplay__Group_2_1__2__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalChessGame.g:1221:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1225:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalChessGame.g:1226:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalChessGame.g:1233:1: rule__Transition__Group__0__Impl : ( 'click' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1237:1: ( ( 'click' ) )
            // InternalChessGame.g:1238:1: ( 'click' )
            {
            // InternalChessGame.g:1238:1: ( 'click' )
            // InternalChessGame.g:1239:2: 'click'
            {
             before(grammarAccess.getTransitionAccess().getClickKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getClickKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalChessGame.g:1248:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1252:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalChessGame.g:1253:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalChessGame.g:1260:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__TriggerAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1264:1: ( ( ( rule__Transition__TriggerAssignment_1 ) ) )
            // InternalChessGame.g:1265:1: ( ( rule__Transition__TriggerAssignment_1 ) )
            {
            // InternalChessGame.g:1265:1: ( ( rule__Transition__TriggerAssignment_1 ) )
            // InternalChessGame.g:1266:2: ( rule__Transition__TriggerAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getTriggerAssignment_1()); 
            // InternalChessGame.g:1267:2: ( rule__Transition__TriggerAssignment_1 )
            // InternalChessGame.g:1267:3: rule__Transition__TriggerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__TriggerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTriggerAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalChessGame.g:1275:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1279:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalChessGame.g:1280:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalChessGame.g:1287:1: rule__Transition__Group__2__Impl : ( 'and' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1291:1: ( ( 'and' ) )
            // InternalChessGame.g:1292:1: ( 'and' )
            {
            // InternalChessGame.g:1292:1: ( 'and' )
            // InternalChessGame.g:1293:2: 'and'
            {
             before(grammarAccess.getTransitionAccess().getAndKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getAndKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalChessGame.g:1302:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1306:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalChessGame.g:1307:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalChessGame.g:1314:1: rule__Transition__Group__3__Impl : ( 'goto' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1318:1: ( ( 'goto' ) )
            // InternalChessGame.g:1319:1: ( 'goto' )
            {
            // InternalChessGame.g:1319:1: ( 'goto' )
            // InternalChessGame.g:1320:2: 'goto'
            {
             before(grammarAccess.getTransitionAccess().getGotoKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getGotoKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalChessGame.g:1329:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1333:1: ( rule__Transition__Group__4__Impl )
            // InternalChessGame.g:1334:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalChessGame.g:1340:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__TargetAssignment_4 ) ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1344:1: ( ( ( rule__Transition__TargetAssignment_4 ) ) )
            // InternalChessGame.g:1345:1: ( ( rule__Transition__TargetAssignment_4 ) )
            {
            // InternalChessGame.g:1345:1: ( ( rule__Transition__TargetAssignment_4 ) )
            // InternalChessGame.g:1346:2: ( rule__Transition__TargetAssignment_4 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_4()); 
            // InternalChessGame.g:1347:2: ( rule__Transition__TargetAssignment_4 )
            // InternalChessGame.g:1347:3: rule__Transition__TargetAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Transition__TargetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__MouseTrigger__Group_1__0"
    // InternalChessGame.g:1356:1: rule__MouseTrigger__Group_1__0 : rule__MouseTrigger__Group_1__0__Impl rule__MouseTrigger__Group_1__1 ;
    public final void rule__MouseTrigger__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1360:1: ( rule__MouseTrigger__Group_1__0__Impl rule__MouseTrigger__Group_1__1 )
            // InternalChessGame.g:1361:2: rule__MouseTrigger__Group_1__0__Impl rule__MouseTrigger__Group_1__1
            {
            pushFollow(FOLLOW_1);
            rule__MouseTrigger__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MouseTrigger__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MouseTrigger__Group_1__0"


    // $ANTLR start "rule__MouseTrigger__Group_1__0__Impl"
    // InternalChessGame.g:1368:1: rule__MouseTrigger__Group_1__0__Impl : ( 'mouse-right' ) ;
    public final void rule__MouseTrigger__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1372:1: ( ( 'mouse-right' ) )
            // InternalChessGame.g:1373:1: ( 'mouse-right' )
            {
            // InternalChessGame.g:1373:1: ( 'mouse-right' )
            // InternalChessGame.g:1374:2: 'mouse-right'
            {
             before(grammarAccess.getMouseTriggerAccess().getMouseRightKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMouseTriggerAccess().getMouseRightKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MouseTrigger__Group_1__0__Impl"


    // $ANTLR start "rule__MouseTrigger__Group_1__1"
    // InternalChessGame.g:1383:1: rule__MouseTrigger__Group_1__1 : rule__MouseTrigger__Group_1__1__Impl ;
    public final void rule__MouseTrigger__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1387:1: ( rule__MouseTrigger__Group_1__1__Impl )
            // InternalChessGame.g:1388:2: rule__MouseTrigger__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MouseTrigger__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MouseTrigger__Group_1__1"


    // $ANTLR start "rule__MouseTrigger__Group_1__1__Impl"
    // InternalChessGame.g:1394:1: rule__MouseTrigger__Group_1__1__Impl : ( () ) ;
    public final void rule__MouseTrigger__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1398:1: ( ( () ) )
            // InternalChessGame.g:1399:1: ( () )
            {
            // InternalChessGame.g:1399:1: ( () )
            // InternalChessGame.g:1400:2: ()
            {
             before(grammarAccess.getMouseTriggerAccess().getMouseTriggerAction_1_1()); 
            // InternalChessGame.g:1401:2: ()
            // InternalChessGame.g:1401:3: 
            {
            }

             after(grammarAccess.getMouseTriggerAccess().getMouseTriggerAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MouseTrigger__Group_1__1__Impl"


    // $ANTLR start "rule__GameEnd__Group__0"
    // InternalChessGame.g:1410:1: rule__GameEnd__Group__0 : rule__GameEnd__Group__0__Impl rule__GameEnd__Group__1 ;
    public final void rule__GameEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1414:1: ( rule__GameEnd__Group__0__Impl rule__GameEnd__Group__1 )
            // InternalChessGame.g:1415:2: rule__GameEnd__Group__0__Impl rule__GameEnd__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__GameEnd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameEnd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameEnd__Group__0"


    // $ANTLR start "rule__GameEnd__Group__0__Impl"
    // InternalChessGame.g:1422:1: rule__GameEnd__Group__0__Impl : ( 'action' ) ;
    public final void rule__GameEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1426:1: ( ( 'action' ) )
            // InternalChessGame.g:1427:1: ( 'action' )
            {
            // InternalChessGame.g:1427:1: ( 'action' )
            // InternalChessGame.g:1428:2: 'action'
            {
             before(grammarAccess.getGameEndAccess().getActionKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGameEndAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameEnd__Group__0__Impl"


    // $ANTLR start "rule__GameEnd__Group__1"
    // InternalChessGame.g:1437:1: rule__GameEnd__Group__1 : rule__GameEnd__Group__1__Impl rule__GameEnd__Group__2 ;
    public final void rule__GameEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1441:1: ( rule__GameEnd__Group__1__Impl rule__GameEnd__Group__2 )
            // InternalChessGame.g:1442:2: rule__GameEnd__Group__1__Impl rule__GameEnd__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GameEnd__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameEnd__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameEnd__Group__1"


    // $ANTLR start "rule__GameEnd__Group__1__Impl"
    // InternalChessGame.g:1449:1: rule__GameEnd__Group__1__Impl : ( ( rule__GameEnd__NameAssignment_1 ) ) ;
    public final void rule__GameEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1453:1: ( ( ( rule__GameEnd__NameAssignment_1 ) ) )
            // InternalChessGame.g:1454:1: ( ( rule__GameEnd__NameAssignment_1 ) )
            {
            // InternalChessGame.g:1454:1: ( ( rule__GameEnd__NameAssignment_1 ) )
            // InternalChessGame.g:1455:2: ( rule__GameEnd__NameAssignment_1 )
            {
             before(grammarAccess.getGameEndAccess().getNameAssignment_1()); 
            // InternalChessGame.g:1456:2: ( rule__GameEnd__NameAssignment_1 )
            // InternalChessGame.g:1456:3: rule__GameEnd__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GameEnd__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGameEndAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameEnd__Group__1__Impl"


    // $ANTLR start "rule__GameEnd__Group__2"
    // InternalChessGame.g:1464:1: rule__GameEnd__Group__2 : rule__GameEnd__Group__2__Impl rule__GameEnd__Group__3 ;
    public final void rule__GameEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1468:1: ( rule__GameEnd__Group__2__Impl rule__GameEnd__Group__3 )
            // InternalChessGame.g:1469:2: rule__GameEnd__Group__2__Impl rule__GameEnd__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__GameEnd__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameEnd__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameEnd__Group__2"


    // $ANTLR start "rule__GameEnd__Group__2__Impl"
    // InternalChessGame.g:1476:1: rule__GameEnd__Group__2__Impl : ( '{' ) ;
    public final void rule__GameEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1480:1: ( ( '{' ) )
            // InternalChessGame.g:1481:1: ( '{' )
            {
            // InternalChessGame.g:1481:1: ( '{' )
            // InternalChessGame.g:1482:2: '{'
            {
             before(grammarAccess.getGameEndAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGameEndAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameEnd__Group__2__Impl"


    // $ANTLR start "rule__GameEnd__Group__3"
    // InternalChessGame.g:1491:1: rule__GameEnd__Group__3 : rule__GameEnd__Group__3__Impl rule__GameEnd__Group__4 ;
    public final void rule__GameEnd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1495:1: ( rule__GameEnd__Group__3__Impl rule__GameEnd__Group__4 )
            // InternalChessGame.g:1496:2: rule__GameEnd__Group__3__Impl rule__GameEnd__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__GameEnd__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameEnd__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameEnd__Group__3"


    // $ANTLR start "rule__GameEnd__Group__3__Impl"
    // InternalChessGame.g:1503:1: rule__GameEnd__Group__3__Impl : ( 'when' ) ;
    public final void rule__GameEnd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1507:1: ( ( 'when' ) )
            // InternalChessGame.g:1508:1: ( 'when' )
            {
            // InternalChessGame.g:1508:1: ( 'when' )
            // InternalChessGame.g:1509:2: 'when'
            {
             before(grammarAccess.getGameEndAccess().getWhenKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGameEndAccess().getWhenKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameEnd__Group__3__Impl"


    // $ANTLR start "rule__GameEnd__Group__4"
    // InternalChessGame.g:1518:1: rule__GameEnd__Group__4 : rule__GameEnd__Group__4__Impl rule__GameEnd__Group__5 ;
    public final void rule__GameEnd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1522:1: ( rule__GameEnd__Group__4__Impl rule__GameEnd__Group__5 )
            // InternalChessGame.g:1523:2: rule__GameEnd__Group__4__Impl rule__GameEnd__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__GameEnd__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameEnd__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameEnd__Group__4"


    // $ANTLR start "rule__GameEnd__Group__4__Impl"
    // InternalChessGame.g:1530:1: rule__GameEnd__Group__4__Impl : ( ( rule__GameEnd__ActionAssignment_4 ) ) ;
    public final void rule__GameEnd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1534:1: ( ( ( rule__GameEnd__ActionAssignment_4 ) ) )
            // InternalChessGame.g:1535:1: ( ( rule__GameEnd__ActionAssignment_4 ) )
            {
            // InternalChessGame.g:1535:1: ( ( rule__GameEnd__ActionAssignment_4 ) )
            // InternalChessGame.g:1536:2: ( rule__GameEnd__ActionAssignment_4 )
            {
             before(grammarAccess.getGameEndAccess().getActionAssignment_4()); 
            // InternalChessGame.g:1537:2: ( rule__GameEnd__ActionAssignment_4 )
            // InternalChessGame.g:1537:3: rule__GameEnd__ActionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__GameEnd__ActionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGameEndAccess().getActionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameEnd__Group__4__Impl"


    // $ANTLR start "rule__GameEnd__Group__5"
    // InternalChessGame.g:1545:1: rule__GameEnd__Group__5 : rule__GameEnd__Group__5__Impl rule__GameEnd__Group__6 ;
    public final void rule__GameEnd__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1549:1: ( rule__GameEnd__Group__5__Impl rule__GameEnd__Group__6 )
            // InternalChessGame.g:1550:2: rule__GameEnd__Group__5__Impl rule__GameEnd__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__GameEnd__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameEnd__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameEnd__Group__5"


    // $ANTLR start "rule__GameEnd__Group__5__Impl"
    // InternalChessGame.g:1557:1: rule__GameEnd__Group__5__Impl : ( 'do' ) ;
    public final void rule__GameEnd__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1561:1: ( ( 'do' ) )
            // InternalChessGame.g:1562:1: ( 'do' )
            {
            // InternalChessGame.g:1562:1: ( 'do' )
            // InternalChessGame.g:1563:2: 'do'
            {
             before(grammarAccess.getGameEndAccess().getDoKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGameEndAccess().getDoKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameEnd__Group__5__Impl"


    // $ANTLR start "rule__GameEnd__Group__6"
    // InternalChessGame.g:1572:1: rule__GameEnd__Group__6 : rule__GameEnd__Group__6__Impl rule__GameEnd__Group__7 ;
    public final void rule__GameEnd__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1576:1: ( rule__GameEnd__Group__6__Impl rule__GameEnd__Group__7 )
            // InternalChessGame.g:1577:2: rule__GameEnd__Group__6__Impl rule__GameEnd__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__GameEnd__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameEnd__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameEnd__Group__6"


    // $ANTLR start "rule__GameEnd__Group__6__Impl"
    // InternalChessGame.g:1584:1: rule__GameEnd__Group__6__Impl : ( ( rule__GameEnd__BehaviourAssignment_6 ) ) ;
    public final void rule__GameEnd__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1588:1: ( ( ( rule__GameEnd__BehaviourAssignment_6 ) ) )
            // InternalChessGame.g:1589:1: ( ( rule__GameEnd__BehaviourAssignment_6 ) )
            {
            // InternalChessGame.g:1589:1: ( ( rule__GameEnd__BehaviourAssignment_6 ) )
            // InternalChessGame.g:1590:2: ( rule__GameEnd__BehaviourAssignment_6 )
            {
             before(grammarAccess.getGameEndAccess().getBehaviourAssignment_6()); 
            // InternalChessGame.g:1591:2: ( rule__GameEnd__BehaviourAssignment_6 )
            // InternalChessGame.g:1591:3: rule__GameEnd__BehaviourAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__GameEnd__BehaviourAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getGameEndAccess().getBehaviourAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameEnd__Group__6__Impl"


    // $ANTLR start "rule__GameEnd__Group__7"
    // InternalChessGame.g:1599:1: rule__GameEnd__Group__7 : rule__GameEnd__Group__7__Impl ;
    public final void rule__GameEnd__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1603:1: ( rule__GameEnd__Group__7__Impl )
            // InternalChessGame.g:1604:2: rule__GameEnd__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameEnd__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameEnd__Group__7"


    // $ANTLR start "rule__GameEnd__Group__7__Impl"
    // InternalChessGame.g:1610:1: rule__GameEnd__Group__7__Impl : ( '}' ) ;
    public final void rule__GameEnd__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1614:1: ( ( '}' ) )
            // InternalChessGame.g:1615:1: ( '}' )
            {
            // InternalChessGame.g:1615:1: ( '}' )
            // InternalChessGame.g:1616:2: '}'
            {
             before(grammarAccess.getGameEndAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGameEndAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameEnd__Group__7__Impl"


    // $ANTLR start "rule__CellExpression__Group__0"
    // InternalChessGame.g:1626:1: rule__CellExpression__Group__0 : rule__CellExpression__Group__0__Impl rule__CellExpression__Group__1 ;
    public final void rule__CellExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1630:1: ( rule__CellExpression__Group__0__Impl rule__CellExpression__Group__1 )
            // InternalChessGame.g:1631:2: rule__CellExpression__Group__0__Impl rule__CellExpression__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__CellExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellExpression__Group__0"


    // $ANTLR start "rule__CellExpression__Group__0__Impl"
    // InternalChessGame.g:1638:1: rule__CellExpression__Group__0__Impl : ( ( rule__CellExpression__StateAssignment_0 ) ) ;
    public final void rule__CellExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1642:1: ( ( ( rule__CellExpression__StateAssignment_0 ) ) )
            // InternalChessGame.g:1643:1: ( ( rule__CellExpression__StateAssignment_0 ) )
            {
            // InternalChessGame.g:1643:1: ( ( rule__CellExpression__StateAssignment_0 ) )
            // InternalChessGame.g:1644:2: ( rule__CellExpression__StateAssignment_0 )
            {
             before(grammarAccess.getCellExpressionAccess().getStateAssignment_0()); 
            // InternalChessGame.g:1645:2: ( rule__CellExpression__StateAssignment_0 )
            // InternalChessGame.g:1645:3: rule__CellExpression__StateAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CellExpression__StateAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCellExpressionAccess().getStateAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellExpression__Group__0__Impl"


    // $ANTLR start "rule__CellExpression__Group__1"
    // InternalChessGame.g:1653:1: rule__CellExpression__Group__1 : rule__CellExpression__Group__1__Impl rule__CellExpression__Group__2 ;
    public final void rule__CellExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1657:1: ( rule__CellExpression__Group__1__Impl rule__CellExpression__Group__2 )
            // InternalChessGame.g:1658:2: rule__CellExpression__Group__1__Impl rule__CellExpression__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__CellExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellExpression__Group__1"


    // $ANTLR start "rule__CellExpression__Group__1__Impl"
    // InternalChessGame.g:1665:1: rule__CellExpression__Group__1__Impl : ( '.' ) ;
    public final void rule__CellExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1669:1: ( ( '.' ) )
            // InternalChessGame.g:1670:1: ( '.' )
            {
            // InternalChessGame.g:1670:1: ( '.' )
            // InternalChessGame.g:1671:2: '.'
            {
             before(grammarAccess.getCellExpressionAccess().getFullStopKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCellExpressionAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellExpression__Group__1__Impl"


    // $ANTLR start "rule__CellExpression__Group__2"
    // InternalChessGame.g:1680:1: rule__CellExpression__Group__2 : rule__CellExpression__Group__2__Impl ;
    public final void rule__CellExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1684:1: ( rule__CellExpression__Group__2__Impl )
            // InternalChessGame.g:1685:2: rule__CellExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CellExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellExpression__Group__2"


    // $ANTLR start "rule__CellExpression__Group__2__Impl"
    // InternalChessGame.g:1691:1: rule__CellExpression__Group__2__Impl : ( ( rule__CellExpression__CellStateAssignment_2 ) ) ;
    public final void rule__CellExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1695:1: ( ( ( rule__CellExpression__CellStateAssignment_2 ) ) )
            // InternalChessGame.g:1696:1: ( ( rule__CellExpression__CellStateAssignment_2 ) )
            {
            // InternalChessGame.g:1696:1: ( ( rule__CellExpression__CellStateAssignment_2 ) )
            // InternalChessGame.g:1697:2: ( rule__CellExpression__CellStateAssignment_2 )
            {
             before(grammarAccess.getCellExpressionAccess().getCellStateAssignment_2()); 
            // InternalChessGame.g:1698:2: ( rule__CellExpression__CellStateAssignment_2 )
            // InternalChessGame.g:1698:3: rule__CellExpression__CellStateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CellExpression__CellStateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCellExpressionAccess().getCellStateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellExpression__Group__2__Impl"


    // $ANTLR start "rule__StateCheck__Group__0"
    // InternalChessGame.g:1707:1: rule__StateCheck__Group__0 : rule__StateCheck__Group__0__Impl rule__StateCheck__Group__1 ;
    public final void rule__StateCheck__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1711:1: ( rule__StateCheck__Group__0__Impl rule__StateCheck__Group__1 )
            // InternalChessGame.g:1712:2: rule__StateCheck__Group__0__Impl rule__StateCheck__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__StateCheck__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateCheck__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateCheck__Group__0"


    // $ANTLR start "rule__StateCheck__Group__0__Impl"
    // InternalChessGame.g:1719:1: rule__StateCheck__Group__0__Impl : ( 'allCellState' ) ;
    public final void rule__StateCheck__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1723:1: ( ( 'allCellState' ) )
            // InternalChessGame.g:1724:1: ( 'allCellState' )
            {
            // InternalChessGame.g:1724:1: ( 'allCellState' )
            // InternalChessGame.g:1725:2: 'allCellState'
            {
             before(grammarAccess.getStateCheckAccess().getAllCellStateKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStateCheckAccess().getAllCellStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateCheck__Group__0__Impl"


    // $ANTLR start "rule__StateCheck__Group__1"
    // InternalChessGame.g:1734:1: rule__StateCheck__Group__1 : rule__StateCheck__Group__1__Impl rule__StateCheck__Group__2 ;
    public final void rule__StateCheck__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1738:1: ( rule__StateCheck__Group__1__Impl rule__StateCheck__Group__2 )
            // InternalChessGame.g:1739:2: rule__StateCheck__Group__1__Impl rule__StateCheck__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__StateCheck__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateCheck__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateCheck__Group__1"


    // $ANTLR start "rule__StateCheck__Group__1__Impl"
    // InternalChessGame.g:1746:1: rule__StateCheck__Group__1__Impl : ( '(' ) ;
    public final void rule__StateCheck__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1750:1: ( ( '(' ) )
            // InternalChessGame.g:1751:1: ( '(' )
            {
            // InternalChessGame.g:1751:1: ( '(' )
            // InternalChessGame.g:1752:2: '('
            {
             before(grammarAccess.getStateCheckAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStateCheckAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateCheck__Group__1__Impl"


    // $ANTLR start "rule__StateCheck__Group__2"
    // InternalChessGame.g:1761:1: rule__StateCheck__Group__2 : rule__StateCheck__Group__2__Impl rule__StateCheck__Group__3 ;
    public final void rule__StateCheck__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1765:1: ( rule__StateCheck__Group__2__Impl rule__StateCheck__Group__3 )
            // InternalChessGame.g:1766:2: rule__StateCheck__Group__2__Impl rule__StateCheck__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__StateCheck__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateCheck__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateCheck__Group__2"


    // $ANTLR start "rule__StateCheck__Group__2__Impl"
    // InternalChessGame.g:1773:1: rule__StateCheck__Group__2__Impl : ( ( rule__StateCheck__Cell_stateAssignment_2 ) ) ;
    public final void rule__StateCheck__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1777:1: ( ( ( rule__StateCheck__Cell_stateAssignment_2 ) ) )
            // InternalChessGame.g:1778:1: ( ( rule__StateCheck__Cell_stateAssignment_2 ) )
            {
            // InternalChessGame.g:1778:1: ( ( rule__StateCheck__Cell_stateAssignment_2 ) )
            // InternalChessGame.g:1779:2: ( rule__StateCheck__Cell_stateAssignment_2 )
            {
             before(grammarAccess.getStateCheckAccess().getCell_stateAssignment_2()); 
            // InternalChessGame.g:1780:2: ( rule__StateCheck__Cell_stateAssignment_2 )
            // InternalChessGame.g:1780:3: rule__StateCheck__Cell_stateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StateCheck__Cell_stateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateCheckAccess().getCell_stateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateCheck__Group__2__Impl"


    // $ANTLR start "rule__StateCheck__Group__3"
    // InternalChessGame.g:1788:1: rule__StateCheck__Group__3 : rule__StateCheck__Group__3__Impl ;
    public final void rule__StateCheck__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1792:1: ( rule__StateCheck__Group__3__Impl )
            // InternalChessGame.g:1793:2: rule__StateCheck__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateCheck__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateCheck__Group__3"


    // $ANTLR start "rule__StateCheck__Group__3__Impl"
    // InternalChessGame.g:1799:1: rule__StateCheck__Group__3__Impl : ( ')' ) ;
    public final void rule__StateCheck__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1803:1: ( ( ')' ) )
            // InternalChessGame.g:1804:1: ( ')' )
            {
            // InternalChessGame.g:1804:1: ( ')' )
            // InternalChessGame.g:1805:2: ')'
            {
             before(grammarAccess.getStateCheckAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getStateCheckAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateCheck__Group__3__Impl"


    // $ANTLR start "rule__EmptyExpression__Group__0"
    // InternalChessGame.g:1815:1: rule__EmptyExpression__Group__0 : rule__EmptyExpression__Group__0__Impl rule__EmptyExpression__Group__1 ;
    public final void rule__EmptyExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1819:1: ( rule__EmptyExpression__Group__0__Impl rule__EmptyExpression__Group__1 )
            // InternalChessGame.g:1820:2: rule__EmptyExpression__Group__0__Impl rule__EmptyExpression__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__EmptyExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmptyExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyExpression__Group__0"


    // $ANTLR start "rule__EmptyExpression__Group__0__Impl"
    // InternalChessGame.g:1827:1: rule__EmptyExpression__Group__0__Impl : ( 'empty' ) ;
    public final void rule__EmptyExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1831:1: ( ( 'empty' ) )
            // InternalChessGame.g:1832:1: ( 'empty' )
            {
            // InternalChessGame.g:1832:1: ( 'empty' )
            // InternalChessGame.g:1833:2: 'empty'
            {
             before(grammarAccess.getEmptyExpressionAccess().getEmptyKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEmptyExpressionAccess().getEmptyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyExpression__Group__0__Impl"


    // $ANTLR start "rule__EmptyExpression__Group__1"
    // InternalChessGame.g:1842:1: rule__EmptyExpression__Group__1 : rule__EmptyExpression__Group__1__Impl rule__EmptyExpression__Group__2 ;
    public final void rule__EmptyExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1846:1: ( rule__EmptyExpression__Group__1__Impl rule__EmptyExpression__Group__2 )
            // InternalChessGame.g:1847:2: rule__EmptyExpression__Group__1__Impl rule__EmptyExpression__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__EmptyExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmptyExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyExpression__Group__1"


    // $ANTLR start "rule__EmptyExpression__Group__1__Impl"
    // InternalChessGame.g:1854:1: rule__EmptyExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__EmptyExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1858:1: ( ( '(' ) )
            // InternalChessGame.g:1859:1: ( '(' )
            {
            // InternalChessGame.g:1859:1: ( '(' )
            // InternalChessGame.g:1860:2: '('
            {
             before(grammarAccess.getEmptyExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEmptyExpressionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyExpression__Group__1__Impl"


    // $ANTLR start "rule__EmptyExpression__Group__2"
    // InternalChessGame.g:1869:1: rule__EmptyExpression__Group__2 : rule__EmptyExpression__Group__2__Impl rule__EmptyExpression__Group__3 ;
    public final void rule__EmptyExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1873:1: ( rule__EmptyExpression__Group__2__Impl rule__EmptyExpression__Group__3 )
            // InternalChessGame.g:1874:2: rule__EmptyExpression__Group__2__Impl rule__EmptyExpression__Group__3
            {
            pushFollow(FOLLOW_1);
            rule__EmptyExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmptyExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyExpression__Group__2"


    // $ANTLR start "rule__EmptyExpression__Group__2__Impl"
    // InternalChessGame.g:1881:1: rule__EmptyExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__EmptyExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1885:1: ( ( ')' ) )
            // InternalChessGame.g:1886:1: ( ')' )
            {
            // InternalChessGame.g:1886:1: ( ')' )
            // InternalChessGame.g:1887:2: ')'
            {
             before(grammarAccess.getEmptyExpressionAccess().getRightParenthesisKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEmptyExpressionAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyExpression__Group__2__Impl"


    // $ANTLR start "rule__EmptyExpression__Group__3"
    // InternalChessGame.g:1896:1: rule__EmptyExpression__Group__3 : rule__EmptyExpression__Group__3__Impl ;
    public final void rule__EmptyExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1900:1: ( rule__EmptyExpression__Group__3__Impl )
            // InternalChessGame.g:1901:2: rule__EmptyExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmptyExpression__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyExpression__Group__3"


    // $ANTLR start "rule__EmptyExpression__Group__3__Impl"
    // InternalChessGame.g:1907:1: rule__EmptyExpression__Group__3__Impl : ( () ) ;
    public final void rule__EmptyExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1911:1: ( ( () ) )
            // InternalChessGame.g:1912:1: ( () )
            {
            // InternalChessGame.g:1912:1: ( () )
            // InternalChessGame.g:1913:2: ()
            {
             before(grammarAccess.getEmptyExpressionAccess().getEmptyExpressionAction_3()); 
            // InternalChessGame.g:1914:2: ()
            // InternalChessGame.g:1914:3: 
            {
            }

             after(grammarAccess.getEmptyExpressionAccess().getEmptyExpressionAction_3()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyExpression__Group__3__Impl"


    // $ANTLR start "rule__EndBehaviour__Group__0"
    // InternalChessGame.g:1923:1: rule__EndBehaviour__Group__0 : rule__EndBehaviour__Group__0__Impl rule__EndBehaviour__Group__1 ;
    public final void rule__EndBehaviour__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1927:1: ( rule__EndBehaviour__Group__0__Impl rule__EndBehaviour__Group__1 )
            // InternalChessGame.g:1928:2: rule__EndBehaviour__Group__0__Impl rule__EndBehaviour__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__EndBehaviour__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndBehaviour__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndBehaviour__Group__0"


    // $ANTLR start "rule__EndBehaviour__Group__0__Impl"
    // InternalChessGame.g:1935:1: rule__EndBehaviour__Group__0__Impl : ( 'end-game' ) ;
    public final void rule__EndBehaviour__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1939:1: ( ( 'end-game' ) )
            // InternalChessGame.g:1940:1: ( 'end-game' )
            {
            // InternalChessGame.g:1940:1: ( 'end-game' )
            // InternalChessGame.g:1941:2: 'end-game'
            {
             before(grammarAccess.getEndBehaviourAccess().getEndGameKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEndBehaviourAccess().getEndGameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndBehaviour__Group__0__Impl"


    // $ANTLR start "rule__EndBehaviour__Group__1"
    // InternalChessGame.g:1950:1: rule__EndBehaviour__Group__1 : rule__EndBehaviour__Group__1__Impl rule__EndBehaviour__Group__2 ;
    public final void rule__EndBehaviour__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1954:1: ( rule__EndBehaviour__Group__1__Impl rule__EndBehaviour__Group__2 )
            // InternalChessGame.g:1955:2: rule__EndBehaviour__Group__1__Impl rule__EndBehaviour__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__EndBehaviour__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndBehaviour__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndBehaviour__Group__1"


    // $ANTLR start "rule__EndBehaviour__Group__1__Impl"
    // InternalChessGame.g:1962:1: rule__EndBehaviour__Group__1__Impl : ( '(' ) ;
    public final void rule__EndBehaviour__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1966:1: ( ( '(' ) )
            // InternalChessGame.g:1967:1: ( '(' )
            {
            // InternalChessGame.g:1967:1: ( '(' )
            // InternalChessGame.g:1968:2: '('
            {
             before(grammarAccess.getEndBehaviourAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEndBehaviourAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndBehaviour__Group__1__Impl"


    // $ANTLR start "rule__EndBehaviour__Group__2"
    // InternalChessGame.g:1977:1: rule__EndBehaviour__Group__2 : rule__EndBehaviour__Group__2__Impl rule__EndBehaviour__Group__3 ;
    public final void rule__EndBehaviour__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1981:1: ( rule__EndBehaviour__Group__2__Impl rule__EndBehaviour__Group__3 )
            // InternalChessGame.g:1982:2: rule__EndBehaviour__Group__2__Impl rule__EndBehaviour__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__EndBehaviour__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndBehaviour__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndBehaviour__Group__2"


    // $ANTLR start "rule__EndBehaviour__Group__2__Impl"
    // InternalChessGame.g:1989:1: rule__EndBehaviour__Group__2__Impl : ( ( rule__EndBehaviour__MessageAssignment_2 ) ) ;
    public final void rule__EndBehaviour__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1993:1: ( ( ( rule__EndBehaviour__MessageAssignment_2 ) ) )
            // InternalChessGame.g:1994:1: ( ( rule__EndBehaviour__MessageAssignment_2 ) )
            {
            // InternalChessGame.g:1994:1: ( ( rule__EndBehaviour__MessageAssignment_2 ) )
            // InternalChessGame.g:1995:2: ( rule__EndBehaviour__MessageAssignment_2 )
            {
             before(grammarAccess.getEndBehaviourAccess().getMessageAssignment_2()); 
            // InternalChessGame.g:1996:2: ( rule__EndBehaviour__MessageAssignment_2 )
            // InternalChessGame.g:1996:3: rule__EndBehaviour__MessageAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EndBehaviour__MessageAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEndBehaviourAccess().getMessageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndBehaviour__Group__2__Impl"


    // $ANTLR start "rule__EndBehaviour__Group__3"
    // InternalChessGame.g:2004:1: rule__EndBehaviour__Group__3 : rule__EndBehaviour__Group__3__Impl ;
    public final void rule__EndBehaviour__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2008:1: ( rule__EndBehaviour__Group__3__Impl )
            // InternalChessGame.g:2009:2: rule__EndBehaviour__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndBehaviour__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndBehaviour__Group__3"


    // $ANTLR start "rule__EndBehaviour__Group__3__Impl"
    // InternalChessGame.g:2015:1: rule__EndBehaviour__Group__3__Impl : ( ')' ) ;
    public final void rule__EndBehaviour__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2019:1: ( ( ')' ) )
            // InternalChessGame.g:2020:1: ( ')' )
            {
            // InternalChessGame.g:2020:1: ( ')' )
            // InternalChessGame.g:2021:2: ')'
            {
             before(grammarAccess.getEndBehaviourAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEndBehaviourAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndBehaviour__Group__3__Impl"


    // $ANTLR start "rule__ChessProgram__StatesAssignment"
    // InternalChessGame.g:2031:1: rule__ChessProgram__StatesAssignment : ( ruleStatements ) ;
    public final void rule__ChessProgram__StatesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2035:1: ( ( ruleStatements ) )
            // InternalChessGame.g:2036:2: ( ruleStatements )
            {
            // InternalChessGame.g:2036:2: ( ruleStatements )
            // InternalChessGame.g:2037:3: ruleStatements
            {
             before(grammarAccess.getChessProgramAccess().getStatesStatementsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatements();

            state._fsp--;

             after(grammarAccess.getChessProgramAccess().getStatesStatementsParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChessProgram__StatesAssignment"


    // $ANTLR start "rule__FieldSpecification__WidthAssignment_4"
    // InternalChessGame.g:2046:1: rule__FieldSpecification__WidthAssignment_4 : ( RULE_INT ) ;
    public final void rule__FieldSpecification__WidthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2050:1: ( ( RULE_INT ) )
            // InternalChessGame.g:2051:2: ( RULE_INT )
            {
            // InternalChessGame.g:2051:2: ( RULE_INT )
            // InternalChessGame.g:2052:3: RULE_INT
            {
             before(grammarAccess.getFieldSpecificationAccess().getWidthINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFieldSpecificationAccess().getWidthINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__WidthAssignment_4"


    // $ANTLR start "rule__FieldSpecification__HeightAssignment_7"
    // InternalChessGame.g:2061:1: rule__FieldSpecification__HeightAssignment_7 : ( RULE_INT ) ;
    public final void rule__FieldSpecification__HeightAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2065:1: ( ( RULE_INT ) )
            // InternalChessGame.g:2066:2: ( RULE_INT )
            {
            // InternalChessGame.g:2066:2: ( RULE_INT )
            // InternalChessGame.g:2067:3: RULE_INT
            {
             before(grammarAccess.getFieldSpecificationAccess().getHeightINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFieldSpecificationAccess().getHeightINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldSpecification__HeightAssignment_7"


    // $ANTLR start "rule__CellState__NameAssignment_0"
    // InternalChessGame.g:2076:1: rule__CellState__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__CellState__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2080:1: ( ( RULE_ID ) )
            // InternalChessGame.g:2081:2: ( RULE_ID )
            {
            // InternalChessGame.g:2081:2: ( RULE_ID )
            // InternalChessGame.g:2082:3: RULE_ID
            {
             before(grammarAccess.getCellStateAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCellStateAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__NameAssignment_0"


    // $ANTLR start "rule__CellState__DisplayAssignment_2"
    // InternalChessGame.g:2091:1: rule__CellState__DisplayAssignment_2 : ( ruleCellDisplay ) ;
    public final void rule__CellState__DisplayAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2095:1: ( ( ruleCellDisplay ) )
            // InternalChessGame.g:2096:2: ( ruleCellDisplay )
            {
            // InternalChessGame.g:2096:2: ( ruleCellDisplay )
            // InternalChessGame.g:2097:3: ruleCellDisplay
            {
             before(grammarAccess.getCellStateAccess().getDisplayCellDisplayParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCellDisplay();

            state._fsp--;

             after(grammarAccess.getCellStateAccess().getDisplayCellDisplayParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__DisplayAssignment_2"


    // $ANTLR start "rule__CellState__TransitionsAssignment_3_2"
    // InternalChessGame.g:2106:1: rule__CellState__TransitionsAssignment_3_2 : ( ruleTransition ) ;
    public final void rule__CellState__TransitionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2110:1: ( ( ruleTransition ) )
            // InternalChessGame.g:2111:2: ( ruleTransition )
            {
            // InternalChessGame.g:2111:2: ( ruleTransition )
            // InternalChessGame.g:2112:3: ruleTransition
            {
             before(grammarAccess.getCellStateAccess().getTransitionsTransitionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getCellStateAccess().getTransitionsTransitionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellState__TransitionsAssignment_3_2"


    // $ANTLR start "rule__CellDisplay__TextAssignment_2_0_2"
    // InternalChessGame.g:2121:1: rule__CellDisplay__TextAssignment_2_0_2 : ( RULE_STRING ) ;
    public final void rule__CellDisplay__TextAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2125:1: ( ( RULE_STRING ) )
            // InternalChessGame.g:2126:2: ( RULE_STRING )
            {
            // InternalChessGame.g:2126:2: ( RULE_STRING )
            // InternalChessGame.g:2127:3: RULE_STRING
            {
             before(grammarAccess.getCellDisplayAccess().getTextSTRINGTerminalRuleCall_2_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCellDisplayAccess().getTextSTRINGTerminalRuleCall_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplay__TextAssignment_2_0_2"


    // $ANTLR start "rule__CellDisplay__ColorAssignment_2_1_2"
    // InternalChessGame.g:2136:1: rule__CellDisplay__ColorAssignment_2_1_2 : ( rulecolorChoice ) ;
    public final void rule__CellDisplay__ColorAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2140:1: ( ( rulecolorChoice ) )
            // InternalChessGame.g:2141:2: ( rulecolorChoice )
            {
            // InternalChessGame.g:2141:2: ( rulecolorChoice )
            // InternalChessGame.g:2142:3: rulecolorChoice
            {
             before(grammarAccess.getCellDisplayAccess().getColorColorChoiceEnumRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulecolorChoice();

            state._fsp--;

             after(grammarAccess.getCellDisplayAccess().getColorColorChoiceEnumRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellDisplay__ColorAssignment_2_1_2"


    // $ANTLR start "rule__Transition__TriggerAssignment_1"
    // InternalChessGame.g:2151:1: rule__Transition__TriggerAssignment_1 : ( ruleMouseTrigger ) ;
    public final void rule__Transition__TriggerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2155:1: ( ( ruleMouseTrigger ) )
            // InternalChessGame.g:2156:2: ( ruleMouseTrigger )
            {
            // InternalChessGame.g:2156:2: ( ruleMouseTrigger )
            // InternalChessGame.g:2157:3: ruleMouseTrigger
            {
             before(grammarAccess.getTransitionAccess().getTriggerMouseTriggerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMouseTrigger();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getTriggerMouseTriggerParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TriggerAssignment_1"


    // $ANTLR start "rule__Transition__TargetAssignment_4"
    // InternalChessGame.g:2166:1: rule__Transition__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2170:1: ( ( ( RULE_ID ) ) )
            // InternalChessGame.g:2171:2: ( ( RULE_ID ) )
            {
            // InternalChessGame.g:2171:2: ( ( RULE_ID ) )
            // InternalChessGame.g:2172:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getTargetCellStateCrossReference_4_0()); 
            // InternalChessGame.g:2173:3: ( RULE_ID )
            // InternalChessGame.g:2174:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getTargetCellStateIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTargetCellStateIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetCellStateCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TargetAssignment_4"


    // $ANTLR start "rule__MouseTrigger__MouseAssignment_0"
    // InternalChessGame.g:2185:1: rule__MouseTrigger__MouseAssignment_0 : ( ( 'mouse-left' ) ) ;
    public final void rule__MouseTrigger__MouseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2189:1: ( ( ( 'mouse-left' ) ) )
            // InternalChessGame.g:2190:2: ( ( 'mouse-left' ) )
            {
            // InternalChessGame.g:2190:2: ( ( 'mouse-left' ) )
            // InternalChessGame.g:2191:3: ( 'mouse-left' )
            {
             before(grammarAccess.getMouseTriggerAccess().getMouseMouseLeftKeyword_0_0()); 
            // InternalChessGame.g:2192:3: ( 'mouse-left' )
            // InternalChessGame.g:2193:4: 'mouse-left'
            {
             before(grammarAccess.getMouseTriggerAccess().getMouseMouseLeftKeyword_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMouseTriggerAccess().getMouseMouseLeftKeyword_0_0()); 

            }

             after(grammarAccess.getMouseTriggerAccess().getMouseMouseLeftKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MouseTrigger__MouseAssignment_0"


    // $ANTLR start "rule__GameEnd__NameAssignment_1"
    // InternalChessGame.g:2204:1: rule__GameEnd__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GameEnd__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2208:1: ( ( RULE_ID ) )
            // InternalChessGame.g:2209:2: ( RULE_ID )
            {
            // InternalChessGame.g:2209:2: ( RULE_ID )
            // InternalChessGame.g:2210:3: RULE_ID
            {
             before(grammarAccess.getGameEndAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGameEndAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameEnd__NameAssignment_1"


    // $ANTLR start "rule__GameEnd__ActionAssignment_4"
    // InternalChessGame.g:2219:1: rule__GameEnd__ActionAssignment_4 : ( ruleCellExpression ) ;
    public final void rule__GameEnd__ActionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2223:1: ( ( ruleCellExpression ) )
            // InternalChessGame.g:2224:2: ( ruleCellExpression )
            {
            // InternalChessGame.g:2224:2: ( ruleCellExpression )
            // InternalChessGame.g:2225:3: ruleCellExpression
            {
             before(grammarAccess.getGameEndAccess().getActionCellExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCellExpression();

            state._fsp--;

             after(grammarAccess.getGameEndAccess().getActionCellExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameEnd__ActionAssignment_4"


    // $ANTLR start "rule__GameEnd__BehaviourAssignment_6"
    // InternalChessGame.g:2234:1: rule__GameEnd__BehaviourAssignment_6 : ( ruleEndBehaviour ) ;
    public final void rule__GameEnd__BehaviourAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2238:1: ( ( ruleEndBehaviour ) )
            // InternalChessGame.g:2239:2: ( ruleEndBehaviour )
            {
            // InternalChessGame.g:2239:2: ( ruleEndBehaviour )
            // InternalChessGame.g:2240:3: ruleEndBehaviour
            {
             before(grammarAccess.getGameEndAccess().getBehaviourEndBehaviourParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEndBehaviour();

            state._fsp--;

             after(grammarAccess.getGameEndAccess().getBehaviourEndBehaviourParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GameEnd__BehaviourAssignment_6"


    // $ANTLR start "rule__CellExpression__StateAssignment_0"
    // InternalChessGame.g:2249:1: rule__CellExpression__StateAssignment_0 : ( ruleStateCheck ) ;
    public final void rule__CellExpression__StateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2253:1: ( ( ruleStateCheck ) )
            // InternalChessGame.g:2254:2: ( ruleStateCheck )
            {
            // InternalChessGame.g:2254:2: ( ruleStateCheck )
            // InternalChessGame.g:2255:3: ruleStateCheck
            {
             before(grammarAccess.getCellExpressionAccess().getStateStateCheckParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStateCheck();

            state._fsp--;

             after(grammarAccess.getCellExpressionAccess().getStateStateCheckParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellExpression__StateAssignment_0"


    // $ANTLR start "rule__CellExpression__CellStateAssignment_2"
    // InternalChessGame.g:2264:1: rule__CellExpression__CellStateAssignment_2 : ( ruleEmptyExpression ) ;
    public final void rule__CellExpression__CellStateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2268:1: ( ( ruleEmptyExpression ) )
            // InternalChessGame.g:2269:2: ( ruleEmptyExpression )
            {
            // InternalChessGame.g:2269:2: ( ruleEmptyExpression )
            // InternalChessGame.g:2270:3: ruleEmptyExpression
            {
             before(grammarAccess.getCellExpressionAccess().getCellStateEmptyExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEmptyExpression();

            state._fsp--;

             after(grammarAccess.getCellExpressionAccess().getCellStateEmptyExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellExpression__CellStateAssignment_2"


    // $ANTLR start "rule__StateCheck__Cell_stateAssignment_2"
    // InternalChessGame.g:2279:1: rule__StateCheck__Cell_stateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StateCheck__Cell_stateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2283:1: ( ( ( RULE_ID ) ) )
            // InternalChessGame.g:2284:2: ( ( RULE_ID ) )
            {
            // InternalChessGame.g:2284:2: ( ( RULE_ID ) )
            // InternalChessGame.g:2285:3: ( RULE_ID )
            {
             before(grammarAccess.getStateCheckAccess().getCell_stateCellStateCrossReference_2_0()); 
            // InternalChessGame.g:2286:3: ( RULE_ID )
            // InternalChessGame.g:2287:4: RULE_ID
            {
             before(grammarAccess.getStateCheckAccess().getCell_stateCellStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateCheckAccess().getCell_stateCellStateIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getStateCheckAccess().getCell_stateCellStateCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateCheck__Cell_stateAssignment_2"


    // $ANTLR start "rule__EndBehaviour__MessageAssignment_2"
    // InternalChessGame.g:2298:1: rule__EndBehaviour__MessageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EndBehaviour__MessageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2302:1: ( ( RULE_STRING ) )
            // InternalChessGame.g:2303:2: ( RULE_STRING )
            {
            // InternalChessGame.g:2303:2: ( RULE_STRING )
            // InternalChessGame.g:2304:3: RULE_STRING
            {
             before(grammarAccess.getEndBehaviourAccess().getMessageSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEndBehaviourAccess().getMessageSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndBehaviour__MessageAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008002022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});

}