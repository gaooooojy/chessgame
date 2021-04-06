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


    // $ANTLR start "entryRuleOptionSpecification"
    // InternalChessGame.g:128:1: entryRuleOptionSpecification : ruleOptionSpecification EOF ;
    public final void entryRuleOptionSpecification() throws RecognitionException {
        try {
            // InternalChessGame.g:129:1: ( ruleOptionSpecification EOF )
            // InternalChessGame.g:130:1: ruleOptionSpecification EOF
            {
             before(grammarAccess.getOptionSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleOptionSpecification();

            state._fsp--;

             after(grammarAccess.getOptionSpecificationRule()); 
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
    // $ANTLR end "entryRuleOptionSpecification"


    // $ANTLR start "ruleOptionSpecification"
    // InternalChessGame.g:137:1: ruleOptionSpecification : ( ( ( rule__OptionSpecification__StatesAssignment ) ) ( ( rule__OptionSpecification__StatesAssignment )* ) ) ;
    public final void ruleOptionSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:141:2: ( ( ( ( rule__OptionSpecification__StatesAssignment ) ) ( ( rule__OptionSpecification__StatesAssignment )* ) ) )
            // InternalChessGame.g:142:2: ( ( ( rule__OptionSpecification__StatesAssignment ) ) ( ( rule__OptionSpecification__StatesAssignment )* ) )
            {
            // InternalChessGame.g:142:2: ( ( ( rule__OptionSpecification__StatesAssignment ) ) ( ( rule__OptionSpecification__StatesAssignment )* ) )
            // InternalChessGame.g:143:3: ( ( rule__OptionSpecification__StatesAssignment ) ) ( ( rule__OptionSpecification__StatesAssignment )* )
            {
            // InternalChessGame.g:143:3: ( ( rule__OptionSpecification__StatesAssignment ) )
            // InternalChessGame.g:144:4: ( rule__OptionSpecification__StatesAssignment )
            {
             before(grammarAccess.getOptionSpecificationAccess().getStatesAssignment()); 
            // InternalChessGame.g:145:4: ( rule__OptionSpecification__StatesAssignment )
            // InternalChessGame.g:145:5: rule__OptionSpecification__StatesAssignment
            {
            pushFollow(FOLLOW_4);
            rule__OptionSpecification__StatesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOptionSpecificationAccess().getStatesAssignment()); 

            }

            // InternalChessGame.g:148:3: ( ( rule__OptionSpecification__StatesAssignment )* )
            // InternalChessGame.g:149:4: ( rule__OptionSpecification__StatesAssignment )*
            {
             before(grammarAccess.getOptionSpecificationAccess().getStatesAssignment()); 
            // InternalChessGame.g:150:4: ( rule__OptionSpecification__StatesAssignment )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalChessGame.g:150:5: rule__OptionSpecification__StatesAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__OptionSpecification__StatesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getOptionSpecificationAccess().getStatesAssignment()); 

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
    // $ANTLR end "ruleOptionSpecification"


    // $ANTLR start "entryRuleCellState"
    // InternalChessGame.g:160:1: entryRuleCellState : ruleCellState EOF ;
    public final void entryRuleCellState() throws RecognitionException {
        try {
            // InternalChessGame.g:161:1: ( ruleCellState EOF )
            // InternalChessGame.g:162:1: ruleCellState EOF
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
    // InternalChessGame.g:169:1: ruleCellState : ( ( rule__CellState__Group__0 ) ) ;
    public final void ruleCellState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:173:2: ( ( ( rule__CellState__Group__0 ) ) )
            // InternalChessGame.g:174:2: ( ( rule__CellState__Group__0 ) )
            {
            // InternalChessGame.g:174:2: ( ( rule__CellState__Group__0 ) )
            // InternalChessGame.g:175:3: ( rule__CellState__Group__0 )
            {
             before(grammarAccess.getCellStateAccess().getGroup()); 
            // InternalChessGame.g:176:3: ( rule__CellState__Group__0 )
            // InternalChessGame.g:176:4: rule__CellState__Group__0
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
    // InternalChessGame.g:185:1: entryRuleCellDisplay : ruleCellDisplay EOF ;
    public final void entryRuleCellDisplay() throws RecognitionException {
        try {
            // InternalChessGame.g:186:1: ( ruleCellDisplay EOF )
            // InternalChessGame.g:187:1: ruleCellDisplay EOF
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
    // InternalChessGame.g:194:1: ruleCellDisplay : ( ( rule__CellDisplay__Group__0 ) ) ;
    public final void ruleCellDisplay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:198:2: ( ( ( rule__CellDisplay__Group__0 ) ) )
            // InternalChessGame.g:199:2: ( ( rule__CellDisplay__Group__0 ) )
            {
            // InternalChessGame.g:199:2: ( ( rule__CellDisplay__Group__0 ) )
            // InternalChessGame.g:200:3: ( rule__CellDisplay__Group__0 )
            {
             before(grammarAccess.getCellDisplayAccess().getGroup()); 
            // InternalChessGame.g:201:3: ( rule__CellDisplay__Group__0 )
            // InternalChessGame.g:201:4: rule__CellDisplay__Group__0
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
    // InternalChessGame.g:210:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalChessGame.g:211:1: ( ruleTransition EOF )
            // InternalChessGame.g:212:1: ruleTransition EOF
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
    // InternalChessGame.g:219:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:223:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalChessGame.g:224:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalChessGame.g:224:2: ( ( rule__Transition__Group__0 ) )
            // InternalChessGame.g:225:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalChessGame.g:226:3: ( rule__Transition__Group__0 )
            // InternalChessGame.g:226:4: rule__Transition__Group__0
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
    // InternalChessGame.g:235:1: entryRuleMouseTrigger : ruleMouseTrigger EOF ;
    public final void entryRuleMouseTrigger() throws RecognitionException {
        try {
            // InternalChessGame.g:236:1: ( ruleMouseTrigger EOF )
            // InternalChessGame.g:237:1: ruleMouseTrigger EOF
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
    // InternalChessGame.g:244:1: ruleMouseTrigger : ( ( rule__MouseTrigger__Alternatives ) ) ;
    public final void ruleMouseTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:248:2: ( ( ( rule__MouseTrigger__Alternatives ) ) )
            // InternalChessGame.g:249:2: ( ( rule__MouseTrigger__Alternatives ) )
            {
            // InternalChessGame.g:249:2: ( ( rule__MouseTrigger__Alternatives ) )
            // InternalChessGame.g:250:3: ( rule__MouseTrigger__Alternatives )
            {
             before(grammarAccess.getMouseTriggerAccess().getAlternatives()); 
            // InternalChessGame.g:251:3: ( rule__MouseTrigger__Alternatives )
            // InternalChessGame.g:251:4: rule__MouseTrigger__Alternatives
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
    // InternalChessGame.g:260:1: entryRuleGameEnd : ruleGameEnd EOF ;
    public final void entryRuleGameEnd() throws RecognitionException {
        try {
            // InternalChessGame.g:261:1: ( ruleGameEnd EOF )
            // InternalChessGame.g:262:1: ruleGameEnd EOF
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
    // InternalChessGame.g:269:1: ruleGameEnd : ( ( rule__GameEnd__Group__0 ) ) ;
    public final void ruleGameEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:273:2: ( ( ( rule__GameEnd__Group__0 ) ) )
            // InternalChessGame.g:274:2: ( ( rule__GameEnd__Group__0 ) )
            {
            // InternalChessGame.g:274:2: ( ( rule__GameEnd__Group__0 ) )
            // InternalChessGame.g:275:3: ( rule__GameEnd__Group__0 )
            {
             before(grammarAccess.getGameEndAccess().getGroup()); 
            // InternalChessGame.g:276:3: ( rule__GameEnd__Group__0 )
            // InternalChessGame.g:276:4: rule__GameEnd__Group__0
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
    // InternalChessGame.g:285:1: entryRuleCellExpression : ruleCellExpression EOF ;
    public final void entryRuleCellExpression() throws RecognitionException {
        try {
            // InternalChessGame.g:286:1: ( ruleCellExpression EOF )
            // InternalChessGame.g:287:1: ruleCellExpression EOF
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
    // InternalChessGame.g:294:1: ruleCellExpression : ( ( rule__CellExpression__Group__0 ) ) ;
    public final void ruleCellExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:298:2: ( ( ( rule__CellExpression__Group__0 ) ) )
            // InternalChessGame.g:299:2: ( ( rule__CellExpression__Group__0 ) )
            {
            // InternalChessGame.g:299:2: ( ( rule__CellExpression__Group__0 ) )
            // InternalChessGame.g:300:3: ( rule__CellExpression__Group__0 )
            {
             before(grammarAccess.getCellExpressionAccess().getGroup()); 
            // InternalChessGame.g:301:3: ( rule__CellExpression__Group__0 )
            // InternalChessGame.g:301:4: rule__CellExpression__Group__0
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
    // InternalChessGame.g:310:1: entryRuleStateCheck : ruleStateCheck EOF ;
    public final void entryRuleStateCheck() throws RecognitionException {
        try {
            // InternalChessGame.g:311:1: ( ruleStateCheck EOF )
            // InternalChessGame.g:312:1: ruleStateCheck EOF
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
    // InternalChessGame.g:319:1: ruleStateCheck : ( ( rule__StateCheck__Group__0 ) ) ;
    public final void ruleStateCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:323:2: ( ( ( rule__StateCheck__Group__0 ) ) )
            // InternalChessGame.g:324:2: ( ( rule__StateCheck__Group__0 ) )
            {
            // InternalChessGame.g:324:2: ( ( rule__StateCheck__Group__0 ) )
            // InternalChessGame.g:325:3: ( rule__StateCheck__Group__0 )
            {
             before(grammarAccess.getStateCheckAccess().getGroup()); 
            // InternalChessGame.g:326:3: ( rule__StateCheck__Group__0 )
            // InternalChessGame.g:326:4: rule__StateCheck__Group__0
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
    // InternalChessGame.g:335:1: entryRuleEmptyExpression : ruleEmptyExpression EOF ;
    public final void entryRuleEmptyExpression() throws RecognitionException {
        try {
            // InternalChessGame.g:336:1: ( ruleEmptyExpression EOF )
            // InternalChessGame.g:337:1: ruleEmptyExpression EOF
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
    // InternalChessGame.g:344:1: ruleEmptyExpression : ( ( rule__EmptyExpression__Group__0 ) ) ;
    public final void ruleEmptyExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:348:2: ( ( ( rule__EmptyExpression__Group__0 ) ) )
            // InternalChessGame.g:349:2: ( ( rule__EmptyExpression__Group__0 ) )
            {
            // InternalChessGame.g:349:2: ( ( rule__EmptyExpression__Group__0 ) )
            // InternalChessGame.g:350:3: ( rule__EmptyExpression__Group__0 )
            {
             before(grammarAccess.getEmptyExpressionAccess().getGroup()); 
            // InternalChessGame.g:351:3: ( rule__EmptyExpression__Group__0 )
            // InternalChessGame.g:351:4: rule__EmptyExpression__Group__0
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
    // InternalChessGame.g:360:1: entryRuleEndBehaviour : ruleEndBehaviour EOF ;
    public final void entryRuleEndBehaviour() throws RecognitionException {
        try {
            // InternalChessGame.g:361:1: ( ruleEndBehaviour EOF )
            // InternalChessGame.g:362:1: ruleEndBehaviour EOF
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
    // InternalChessGame.g:369:1: ruleEndBehaviour : ( ( rule__EndBehaviour__Group__0 ) ) ;
    public final void ruleEndBehaviour() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:373:2: ( ( ( rule__EndBehaviour__Group__0 ) ) )
            // InternalChessGame.g:374:2: ( ( rule__EndBehaviour__Group__0 ) )
            {
            // InternalChessGame.g:374:2: ( ( rule__EndBehaviour__Group__0 ) )
            // InternalChessGame.g:375:3: ( rule__EndBehaviour__Group__0 )
            {
             before(grammarAccess.getEndBehaviourAccess().getGroup()); 
            // InternalChessGame.g:376:3: ( rule__EndBehaviour__Group__0 )
            // InternalChessGame.g:376:4: rule__EndBehaviour__Group__0
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


    // $ANTLR start "rule__Statements__Alternatives"
    // InternalChessGame.g:384:1: rule__Statements__Alternatives : ( ( ruleFieldSpecification ) | ( ruleOptionSpecification ) | ( ruleGameEnd ) );
    public final void rule__Statements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:388:1: ( ( ruleFieldSpecification ) | ( ruleOptionSpecification ) | ( ruleGameEnd ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalChessGame.g:389:2: ( ruleFieldSpecification )
                    {
                    // InternalChessGame.g:389:2: ( ruleFieldSpecification )
                    // InternalChessGame.g:390:3: ruleFieldSpecification
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
                    // InternalChessGame.g:395:2: ( ruleOptionSpecification )
                    {
                    // InternalChessGame.g:395:2: ( ruleOptionSpecification )
                    // InternalChessGame.g:396:3: ruleOptionSpecification
                    {
                     before(grammarAccess.getStatementsAccess().getOptionSpecificationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOptionSpecification();

                    state._fsp--;

                     after(grammarAccess.getStatementsAccess().getOptionSpecificationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalChessGame.g:401:2: ( ruleGameEnd )
                    {
                    // InternalChessGame.g:401:2: ( ruleGameEnd )
                    // InternalChessGame.g:402:3: ruleGameEnd
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
    // InternalChessGame.g:411:1: rule__CellDisplay__Alternatives_2 : ( ( ( rule__CellDisplay__Group_2_0__0 ) ) | ( ( rule__CellDisplay__Group_2_1__0 ) ) );
    public final void rule__CellDisplay__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:415:1: ( ( ( rule__CellDisplay__Group_2_0__0 ) ) | ( ( rule__CellDisplay__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalChessGame.g:416:2: ( ( rule__CellDisplay__Group_2_0__0 ) )
                    {
                    // InternalChessGame.g:416:2: ( ( rule__CellDisplay__Group_2_0__0 ) )
                    // InternalChessGame.g:417:3: ( rule__CellDisplay__Group_2_0__0 )
                    {
                     before(grammarAccess.getCellDisplayAccess().getGroup_2_0()); 
                    // InternalChessGame.g:418:3: ( rule__CellDisplay__Group_2_0__0 )
                    // InternalChessGame.g:418:4: rule__CellDisplay__Group_2_0__0
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
                    // InternalChessGame.g:422:2: ( ( rule__CellDisplay__Group_2_1__0 ) )
                    {
                    // InternalChessGame.g:422:2: ( ( rule__CellDisplay__Group_2_1__0 ) )
                    // InternalChessGame.g:423:3: ( rule__CellDisplay__Group_2_1__0 )
                    {
                     before(grammarAccess.getCellDisplayAccess().getGroup_2_1()); 
                    // InternalChessGame.g:424:3: ( rule__CellDisplay__Group_2_1__0 )
                    // InternalChessGame.g:424:4: rule__CellDisplay__Group_2_1__0
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


    // $ANTLR start "rule__CellDisplay__ColorAlternatives_2_1_2_0"
    // InternalChessGame.g:432:1: rule__CellDisplay__ColorAlternatives_2_1_2_0 : ( ( 'black' ) | ( 'white' ) );
    public final void rule__CellDisplay__ColorAlternatives_2_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:436:1: ( ( 'black' ) | ( 'white' ) )
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
                    // InternalChessGame.g:437:2: ( 'black' )
                    {
                    // InternalChessGame.g:437:2: ( 'black' )
                    // InternalChessGame.g:438:3: 'black'
                    {
                     before(grammarAccess.getCellDisplayAccess().getColorBlackKeyword_2_1_2_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getCellDisplayAccess().getColorBlackKeyword_2_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessGame.g:443:2: ( 'white' )
                    {
                    // InternalChessGame.g:443:2: ( 'white' )
                    // InternalChessGame.g:444:3: 'white'
                    {
                     before(grammarAccess.getCellDisplayAccess().getColorWhiteKeyword_2_1_2_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getCellDisplayAccess().getColorWhiteKeyword_2_1_2_0_1()); 

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
    // $ANTLR end "rule__CellDisplay__ColorAlternatives_2_1_2_0"


    // $ANTLR start "rule__MouseTrigger__Alternatives"
    // InternalChessGame.g:453:1: rule__MouseTrigger__Alternatives : ( ( ( rule__MouseTrigger__MouseAssignment_0 ) ) | ( ( rule__MouseTrigger__Group_1__0 ) ) );
    public final void rule__MouseTrigger__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:457:1: ( ( ( rule__MouseTrigger__MouseAssignment_0 ) ) | ( ( rule__MouseTrigger__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==36) ) {
                alt6=1;
            }
            else if ( (LA6_0==26) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalChessGame.g:458:2: ( ( rule__MouseTrigger__MouseAssignment_0 ) )
                    {
                    // InternalChessGame.g:458:2: ( ( rule__MouseTrigger__MouseAssignment_0 ) )
                    // InternalChessGame.g:459:3: ( rule__MouseTrigger__MouseAssignment_0 )
                    {
                     before(grammarAccess.getMouseTriggerAccess().getMouseAssignment_0()); 
                    // InternalChessGame.g:460:3: ( rule__MouseTrigger__MouseAssignment_0 )
                    // InternalChessGame.g:460:4: rule__MouseTrigger__MouseAssignment_0
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
                    // InternalChessGame.g:464:2: ( ( rule__MouseTrigger__Group_1__0 ) )
                    {
                    // InternalChessGame.g:464:2: ( ( rule__MouseTrigger__Group_1__0 ) )
                    // InternalChessGame.g:465:3: ( rule__MouseTrigger__Group_1__0 )
                    {
                     before(grammarAccess.getMouseTriggerAccess().getGroup_1()); 
                    // InternalChessGame.g:466:3: ( rule__MouseTrigger__Group_1__0 )
                    // InternalChessGame.g:466:4: rule__MouseTrigger__Group_1__0
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


    // $ANTLR start "rule__FieldSpecification__Group__0"
    // InternalChessGame.g:474:1: rule__FieldSpecification__Group__0 : rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1 ;
    public final void rule__FieldSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:478:1: ( rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1 )
            // InternalChessGame.g:479:2: rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalChessGame.g:486:1: rule__FieldSpecification__Group__0__Impl : ( 'field' ) ;
    public final void rule__FieldSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:490:1: ( ( 'field' ) )
            // InternalChessGame.g:491:1: ( 'field' )
            {
            // InternalChessGame.g:491:1: ( 'field' )
            // InternalChessGame.g:492:2: 'field'
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
    // InternalChessGame.g:501:1: rule__FieldSpecification__Group__1 : rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2 ;
    public final void rule__FieldSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:505:1: ( rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2 )
            // InternalChessGame.g:506:2: rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalChessGame.g:513:1: rule__FieldSpecification__Group__1__Impl : ( '{' ) ;
    public final void rule__FieldSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:517:1: ( ( '{' ) )
            // InternalChessGame.g:518:1: ( '{' )
            {
            // InternalChessGame.g:518:1: ( '{' )
            // InternalChessGame.g:519:2: '{'
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
    // InternalChessGame.g:528:1: rule__FieldSpecification__Group__2 : rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3 ;
    public final void rule__FieldSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:532:1: ( rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3 )
            // InternalChessGame.g:533:2: rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalChessGame.g:540:1: rule__FieldSpecification__Group__2__Impl : ( 'width' ) ;
    public final void rule__FieldSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:544:1: ( ( 'width' ) )
            // InternalChessGame.g:545:1: ( 'width' )
            {
            // InternalChessGame.g:545:1: ( 'width' )
            // InternalChessGame.g:546:2: 'width'
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
    // InternalChessGame.g:555:1: rule__FieldSpecification__Group__3 : rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4 ;
    public final void rule__FieldSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:559:1: ( rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4 )
            // InternalChessGame.g:560:2: rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalChessGame.g:567:1: rule__FieldSpecification__Group__3__Impl : ( '=' ) ;
    public final void rule__FieldSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:571:1: ( ( '=' ) )
            // InternalChessGame.g:572:1: ( '=' )
            {
            // InternalChessGame.g:572:1: ( '=' )
            // InternalChessGame.g:573:2: '='
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
    // InternalChessGame.g:582:1: rule__FieldSpecification__Group__4 : rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5 ;
    public final void rule__FieldSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:586:1: ( rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5 )
            // InternalChessGame.g:587:2: rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalChessGame.g:594:1: rule__FieldSpecification__Group__4__Impl : ( ( rule__FieldSpecification__WidthAssignment_4 ) ) ;
    public final void rule__FieldSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:598:1: ( ( ( rule__FieldSpecification__WidthAssignment_4 ) ) )
            // InternalChessGame.g:599:1: ( ( rule__FieldSpecification__WidthAssignment_4 ) )
            {
            // InternalChessGame.g:599:1: ( ( rule__FieldSpecification__WidthAssignment_4 ) )
            // InternalChessGame.g:600:2: ( rule__FieldSpecification__WidthAssignment_4 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getWidthAssignment_4()); 
            // InternalChessGame.g:601:2: ( rule__FieldSpecification__WidthAssignment_4 )
            // InternalChessGame.g:601:3: rule__FieldSpecification__WidthAssignment_4
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
    // InternalChessGame.g:609:1: rule__FieldSpecification__Group__5 : rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6 ;
    public final void rule__FieldSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:613:1: ( rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6 )
            // InternalChessGame.g:614:2: rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalChessGame.g:621:1: rule__FieldSpecification__Group__5__Impl : ( 'height' ) ;
    public final void rule__FieldSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:625:1: ( ( 'height' ) )
            // InternalChessGame.g:626:1: ( 'height' )
            {
            // InternalChessGame.g:626:1: ( 'height' )
            // InternalChessGame.g:627:2: 'height'
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
    // InternalChessGame.g:636:1: rule__FieldSpecification__Group__6 : rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7 ;
    public final void rule__FieldSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:640:1: ( rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7 )
            // InternalChessGame.g:641:2: rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalChessGame.g:648:1: rule__FieldSpecification__Group__6__Impl : ( '=' ) ;
    public final void rule__FieldSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:652:1: ( ( '=' ) )
            // InternalChessGame.g:653:1: ( '=' )
            {
            // InternalChessGame.g:653:1: ( '=' )
            // InternalChessGame.g:654:2: '='
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
    // InternalChessGame.g:663:1: rule__FieldSpecification__Group__7 : rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8 ;
    public final void rule__FieldSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:667:1: ( rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8 )
            // InternalChessGame.g:668:2: rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8
            {
            pushFollow(FOLLOW_10);
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
    // InternalChessGame.g:675:1: rule__FieldSpecification__Group__7__Impl : ( ( rule__FieldSpecification__HeightAssignment_7 ) ) ;
    public final void rule__FieldSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:679:1: ( ( ( rule__FieldSpecification__HeightAssignment_7 ) ) )
            // InternalChessGame.g:680:1: ( ( rule__FieldSpecification__HeightAssignment_7 ) )
            {
            // InternalChessGame.g:680:1: ( ( rule__FieldSpecification__HeightAssignment_7 ) )
            // InternalChessGame.g:681:2: ( rule__FieldSpecification__HeightAssignment_7 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getHeightAssignment_7()); 
            // InternalChessGame.g:682:2: ( rule__FieldSpecification__HeightAssignment_7 )
            // InternalChessGame.g:682:3: rule__FieldSpecification__HeightAssignment_7
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
    // InternalChessGame.g:690:1: rule__FieldSpecification__Group__8 : rule__FieldSpecification__Group__8__Impl ;
    public final void rule__FieldSpecification__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:694:1: ( rule__FieldSpecification__Group__8__Impl )
            // InternalChessGame.g:695:2: rule__FieldSpecification__Group__8__Impl
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
    // InternalChessGame.g:701:1: rule__FieldSpecification__Group__8__Impl : ( '}' ) ;
    public final void rule__FieldSpecification__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:705:1: ( ( '}' ) )
            // InternalChessGame.g:706:1: ( '}' )
            {
            // InternalChessGame.g:706:1: ( '}' )
            // InternalChessGame.g:707:2: '}'
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
    // InternalChessGame.g:717:1: rule__CellState__Group__0 : rule__CellState__Group__0__Impl rule__CellState__Group__1 ;
    public final void rule__CellState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:721:1: ( rule__CellState__Group__0__Impl rule__CellState__Group__1 )
            // InternalChessGame.g:722:2: rule__CellState__Group__0__Impl rule__CellState__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalChessGame.g:729:1: rule__CellState__Group__0__Impl : ( ( rule__CellState__NameAssignment_0 ) ) ;
    public final void rule__CellState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:733:1: ( ( ( rule__CellState__NameAssignment_0 ) ) )
            // InternalChessGame.g:734:1: ( ( rule__CellState__NameAssignment_0 ) )
            {
            // InternalChessGame.g:734:1: ( ( rule__CellState__NameAssignment_0 ) )
            // InternalChessGame.g:735:2: ( rule__CellState__NameAssignment_0 )
            {
             before(grammarAccess.getCellStateAccess().getNameAssignment_0()); 
            // InternalChessGame.g:736:2: ( rule__CellState__NameAssignment_0 )
            // InternalChessGame.g:736:3: rule__CellState__NameAssignment_0
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
    // InternalChessGame.g:744:1: rule__CellState__Group__1 : rule__CellState__Group__1__Impl rule__CellState__Group__2 ;
    public final void rule__CellState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:748:1: ( rule__CellState__Group__1__Impl rule__CellState__Group__2 )
            // InternalChessGame.g:749:2: rule__CellState__Group__1__Impl rule__CellState__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalChessGame.g:756:1: rule__CellState__Group__1__Impl : ( '{' ) ;
    public final void rule__CellState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:760:1: ( ( '{' ) )
            // InternalChessGame.g:761:1: ( '{' )
            {
            // InternalChessGame.g:761:1: ( '{' )
            // InternalChessGame.g:762:2: '{'
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
    // InternalChessGame.g:771:1: rule__CellState__Group__2 : rule__CellState__Group__2__Impl rule__CellState__Group__3 ;
    public final void rule__CellState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:775:1: ( rule__CellState__Group__2__Impl rule__CellState__Group__3 )
            // InternalChessGame.g:776:2: rule__CellState__Group__2__Impl rule__CellState__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalChessGame.g:783:1: rule__CellState__Group__2__Impl : ( ( rule__CellState__DisplayAssignment_2 ) ) ;
    public final void rule__CellState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:787:1: ( ( ( rule__CellState__DisplayAssignment_2 ) ) )
            // InternalChessGame.g:788:1: ( ( rule__CellState__DisplayAssignment_2 ) )
            {
            // InternalChessGame.g:788:1: ( ( rule__CellState__DisplayAssignment_2 ) )
            // InternalChessGame.g:789:2: ( rule__CellState__DisplayAssignment_2 )
            {
             before(grammarAccess.getCellStateAccess().getDisplayAssignment_2()); 
            // InternalChessGame.g:790:2: ( rule__CellState__DisplayAssignment_2 )
            // InternalChessGame.g:790:3: rule__CellState__DisplayAssignment_2
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
    // InternalChessGame.g:798:1: rule__CellState__Group__3 : rule__CellState__Group__3__Impl rule__CellState__Group__4 ;
    public final void rule__CellState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:802:1: ( rule__CellState__Group__3__Impl rule__CellState__Group__4 )
            // InternalChessGame.g:803:2: rule__CellState__Group__3__Impl rule__CellState__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalChessGame.g:810:1: rule__CellState__Group__3__Impl : ( ( rule__CellState__Group_3__0 )? ) ;
    public final void rule__CellState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:814:1: ( ( ( rule__CellState__Group_3__0 )? ) )
            // InternalChessGame.g:815:1: ( ( rule__CellState__Group_3__0 )? )
            {
            // InternalChessGame.g:815:1: ( ( rule__CellState__Group_3__0 )? )
            // InternalChessGame.g:816:2: ( rule__CellState__Group_3__0 )?
            {
             before(grammarAccess.getCellStateAccess().getGroup_3()); 
            // InternalChessGame.g:817:2: ( rule__CellState__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalChessGame.g:817:3: rule__CellState__Group_3__0
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
    // InternalChessGame.g:825:1: rule__CellState__Group__4 : rule__CellState__Group__4__Impl ;
    public final void rule__CellState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:829:1: ( rule__CellState__Group__4__Impl )
            // InternalChessGame.g:830:2: rule__CellState__Group__4__Impl
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
    // InternalChessGame.g:836:1: rule__CellState__Group__4__Impl : ( '}' ) ;
    public final void rule__CellState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:840:1: ( ( '}' ) )
            // InternalChessGame.g:841:1: ( '}' )
            {
            // InternalChessGame.g:841:1: ( '}' )
            // InternalChessGame.g:842:2: '}'
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
    // InternalChessGame.g:852:1: rule__CellState__Group_3__0 : rule__CellState__Group_3__0__Impl rule__CellState__Group_3__1 ;
    public final void rule__CellState__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:856:1: ( rule__CellState__Group_3__0__Impl rule__CellState__Group_3__1 )
            // InternalChessGame.g:857:2: rule__CellState__Group_3__0__Impl rule__CellState__Group_3__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalChessGame.g:864:1: rule__CellState__Group_3__0__Impl : ( 'transitions' ) ;
    public final void rule__CellState__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:868:1: ( ( 'transitions' ) )
            // InternalChessGame.g:869:1: ( 'transitions' )
            {
            // InternalChessGame.g:869:1: ( 'transitions' )
            // InternalChessGame.g:870:2: 'transitions'
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
    // InternalChessGame.g:879:1: rule__CellState__Group_3__1 : rule__CellState__Group_3__1__Impl rule__CellState__Group_3__2 ;
    public final void rule__CellState__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:883:1: ( rule__CellState__Group_3__1__Impl rule__CellState__Group_3__2 )
            // InternalChessGame.g:884:2: rule__CellState__Group_3__1__Impl rule__CellState__Group_3__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalChessGame.g:891:1: rule__CellState__Group_3__1__Impl : ( '{' ) ;
    public final void rule__CellState__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:895:1: ( ( '{' ) )
            // InternalChessGame.g:896:1: ( '{' )
            {
            // InternalChessGame.g:896:1: ( '{' )
            // InternalChessGame.g:897:2: '{'
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
    // InternalChessGame.g:906:1: rule__CellState__Group_3__2 : rule__CellState__Group_3__2__Impl rule__CellState__Group_3__3 ;
    public final void rule__CellState__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:910:1: ( rule__CellState__Group_3__2__Impl rule__CellState__Group_3__3 )
            // InternalChessGame.g:911:2: rule__CellState__Group_3__2__Impl rule__CellState__Group_3__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalChessGame.g:918:1: rule__CellState__Group_3__2__Impl : ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) ) ;
    public final void rule__CellState__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:922:1: ( ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) ) )
            // InternalChessGame.g:923:1: ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) )
            {
            // InternalChessGame.g:923:1: ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) )
            // InternalChessGame.g:924:2: ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* )
            {
            // InternalChessGame.g:924:2: ( ( rule__CellState__TransitionsAssignment_3_2 ) )
            // InternalChessGame.g:925:3: ( rule__CellState__TransitionsAssignment_3_2 )
            {
             before(grammarAccess.getCellStateAccess().getTransitionsAssignment_3_2()); 
            // InternalChessGame.g:926:3: ( rule__CellState__TransitionsAssignment_3_2 )
            // InternalChessGame.g:926:4: rule__CellState__TransitionsAssignment_3_2
            {
            pushFollow(FOLLOW_14);
            rule__CellState__TransitionsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCellStateAccess().getTransitionsAssignment_3_2()); 

            }

            // InternalChessGame.g:929:2: ( ( rule__CellState__TransitionsAssignment_3_2 )* )
            // InternalChessGame.g:930:3: ( rule__CellState__TransitionsAssignment_3_2 )*
            {
             before(grammarAccess.getCellStateAccess().getTransitionsAssignment_3_2()); 
            // InternalChessGame.g:931:3: ( rule__CellState__TransitionsAssignment_3_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalChessGame.g:931:4: rule__CellState__TransitionsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__CellState__TransitionsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalChessGame.g:940:1: rule__CellState__Group_3__3 : rule__CellState__Group_3__3__Impl ;
    public final void rule__CellState__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:944:1: ( rule__CellState__Group_3__3__Impl )
            // InternalChessGame.g:945:2: rule__CellState__Group_3__3__Impl
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
    // InternalChessGame.g:951:1: rule__CellState__Group_3__3__Impl : ( '}' ) ;
    public final void rule__CellState__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:955:1: ( ( '}' ) )
            // InternalChessGame.g:956:1: ( '}' )
            {
            // InternalChessGame.g:956:1: ( '}' )
            // InternalChessGame.g:957:2: '}'
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
    // InternalChessGame.g:967:1: rule__CellDisplay__Group__0 : rule__CellDisplay__Group__0__Impl rule__CellDisplay__Group__1 ;
    public final void rule__CellDisplay__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:971:1: ( rule__CellDisplay__Group__0__Impl rule__CellDisplay__Group__1 )
            // InternalChessGame.g:972:2: rule__CellDisplay__Group__0__Impl rule__CellDisplay__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalChessGame.g:979:1: rule__CellDisplay__Group__0__Impl : ( 'display' ) ;
    public final void rule__CellDisplay__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:983:1: ( ( 'display' ) )
            // InternalChessGame.g:984:1: ( 'display' )
            {
            // InternalChessGame.g:984:1: ( 'display' )
            // InternalChessGame.g:985:2: 'display'
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
    // InternalChessGame.g:994:1: rule__CellDisplay__Group__1 : rule__CellDisplay__Group__1__Impl rule__CellDisplay__Group__2 ;
    public final void rule__CellDisplay__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:998:1: ( rule__CellDisplay__Group__1__Impl rule__CellDisplay__Group__2 )
            // InternalChessGame.g:999:2: rule__CellDisplay__Group__1__Impl rule__CellDisplay__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalChessGame.g:1006:1: rule__CellDisplay__Group__1__Impl : ( '{' ) ;
    public final void rule__CellDisplay__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1010:1: ( ( '{' ) )
            // InternalChessGame.g:1011:1: ( '{' )
            {
            // InternalChessGame.g:1011:1: ( '{' )
            // InternalChessGame.g:1012:2: '{'
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
    // InternalChessGame.g:1021:1: rule__CellDisplay__Group__2 : rule__CellDisplay__Group__2__Impl rule__CellDisplay__Group__3 ;
    public final void rule__CellDisplay__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1025:1: ( rule__CellDisplay__Group__2__Impl rule__CellDisplay__Group__3 )
            // InternalChessGame.g:1026:2: rule__CellDisplay__Group__2__Impl rule__CellDisplay__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalChessGame.g:1033:1: rule__CellDisplay__Group__2__Impl : ( ( rule__CellDisplay__Alternatives_2 ) ) ;
    public final void rule__CellDisplay__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1037:1: ( ( ( rule__CellDisplay__Alternatives_2 ) ) )
            // InternalChessGame.g:1038:1: ( ( rule__CellDisplay__Alternatives_2 ) )
            {
            // InternalChessGame.g:1038:1: ( ( rule__CellDisplay__Alternatives_2 ) )
            // InternalChessGame.g:1039:2: ( rule__CellDisplay__Alternatives_2 )
            {
             before(grammarAccess.getCellDisplayAccess().getAlternatives_2()); 
            // InternalChessGame.g:1040:2: ( rule__CellDisplay__Alternatives_2 )
            // InternalChessGame.g:1040:3: rule__CellDisplay__Alternatives_2
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
    // InternalChessGame.g:1048:1: rule__CellDisplay__Group__3 : rule__CellDisplay__Group__3__Impl ;
    public final void rule__CellDisplay__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1052:1: ( rule__CellDisplay__Group__3__Impl )
            // InternalChessGame.g:1053:2: rule__CellDisplay__Group__3__Impl
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
    // InternalChessGame.g:1059:1: rule__CellDisplay__Group__3__Impl : ( '}' ) ;
    public final void rule__CellDisplay__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1063:1: ( ( '}' ) )
            // InternalChessGame.g:1064:1: ( '}' )
            {
            // InternalChessGame.g:1064:1: ( '}' )
            // InternalChessGame.g:1065:2: '}'
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
    // InternalChessGame.g:1075:1: rule__CellDisplay__Group_2_0__0 : rule__CellDisplay__Group_2_0__0__Impl rule__CellDisplay__Group_2_0__1 ;
    public final void rule__CellDisplay__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1079:1: ( rule__CellDisplay__Group_2_0__0__Impl rule__CellDisplay__Group_2_0__1 )
            // InternalChessGame.g:1080:2: rule__CellDisplay__Group_2_0__0__Impl rule__CellDisplay__Group_2_0__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalChessGame.g:1087:1: rule__CellDisplay__Group_2_0__0__Impl : ( 'text' ) ;
    public final void rule__CellDisplay__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1091:1: ( ( 'text' ) )
            // InternalChessGame.g:1092:1: ( 'text' )
            {
            // InternalChessGame.g:1092:1: ( 'text' )
            // InternalChessGame.g:1093:2: 'text'
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
    // InternalChessGame.g:1102:1: rule__CellDisplay__Group_2_0__1 : rule__CellDisplay__Group_2_0__1__Impl rule__CellDisplay__Group_2_0__2 ;
    public final void rule__CellDisplay__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1106:1: ( rule__CellDisplay__Group_2_0__1__Impl rule__CellDisplay__Group_2_0__2 )
            // InternalChessGame.g:1107:2: rule__CellDisplay__Group_2_0__1__Impl rule__CellDisplay__Group_2_0__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalChessGame.g:1114:1: rule__CellDisplay__Group_2_0__1__Impl : ( '=' ) ;
    public final void rule__CellDisplay__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1118:1: ( ( '=' ) )
            // InternalChessGame.g:1119:1: ( '=' )
            {
            // InternalChessGame.g:1119:1: ( '=' )
            // InternalChessGame.g:1120:2: '='
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
    // InternalChessGame.g:1129:1: rule__CellDisplay__Group_2_0__2 : rule__CellDisplay__Group_2_0__2__Impl ;
    public final void rule__CellDisplay__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1133:1: ( rule__CellDisplay__Group_2_0__2__Impl )
            // InternalChessGame.g:1134:2: rule__CellDisplay__Group_2_0__2__Impl
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
    // InternalChessGame.g:1140:1: rule__CellDisplay__Group_2_0__2__Impl : ( ( rule__CellDisplay__TextAssignment_2_0_2 ) ) ;
    public final void rule__CellDisplay__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1144:1: ( ( ( rule__CellDisplay__TextAssignment_2_0_2 ) ) )
            // InternalChessGame.g:1145:1: ( ( rule__CellDisplay__TextAssignment_2_0_2 ) )
            {
            // InternalChessGame.g:1145:1: ( ( rule__CellDisplay__TextAssignment_2_0_2 ) )
            // InternalChessGame.g:1146:2: ( rule__CellDisplay__TextAssignment_2_0_2 )
            {
             before(grammarAccess.getCellDisplayAccess().getTextAssignment_2_0_2()); 
            // InternalChessGame.g:1147:2: ( rule__CellDisplay__TextAssignment_2_0_2 )
            // InternalChessGame.g:1147:3: rule__CellDisplay__TextAssignment_2_0_2
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
    // InternalChessGame.g:1156:1: rule__CellDisplay__Group_2_1__0 : rule__CellDisplay__Group_2_1__0__Impl rule__CellDisplay__Group_2_1__1 ;
    public final void rule__CellDisplay__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1160:1: ( rule__CellDisplay__Group_2_1__0__Impl rule__CellDisplay__Group_2_1__1 )
            // InternalChessGame.g:1161:2: rule__CellDisplay__Group_2_1__0__Impl rule__CellDisplay__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalChessGame.g:1168:1: rule__CellDisplay__Group_2_1__0__Impl : ( 'color' ) ;
    public final void rule__CellDisplay__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1172:1: ( ( 'color' ) )
            // InternalChessGame.g:1173:1: ( 'color' )
            {
            // InternalChessGame.g:1173:1: ( 'color' )
            // InternalChessGame.g:1174:2: 'color'
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
    // InternalChessGame.g:1183:1: rule__CellDisplay__Group_2_1__1 : rule__CellDisplay__Group_2_1__1__Impl rule__CellDisplay__Group_2_1__2 ;
    public final void rule__CellDisplay__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1187:1: ( rule__CellDisplay__Group_2_1__1__Impl rule__CellDisplay__Group_2_1__2 )
            // InternalChessGame.g:1188:2: rule__CellDisplay__Group_2_1__1__Impl rule__CellDisplay__Group_2_1__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalChessGame.g:1195:1: rule__CellDisplay__Group_2_1__1__Impl : ( '=' ) ;
    public final void rule__CellDisplay__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1199:1: ( ( '=' ) )
            // InternalChessGame.g:1200:1: ( '=' )
            {
            // InternalChessGame.g:1200:1: ( '=' )
            // InternalChessGame.g:1201:2: '='
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
    // InternalChessGame.g:1210:1: rule__CellDisplay__Group_2_1__2 : rule__CellDisplay__Group_2_1__2__Impl ;
    public final void rule__CellDisplay__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1214:1: ( rule__CellDisplay__Group_2_1__2__Impl )
            // InternalChessGame.g:1215:2: rule__CellDisplay__Group_2_1__2__Impl
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
    // InternalChessGame.g:1221:1: rule__CellDisplay__Group_2_1__2__Impl : ( ( rule__CellDisplay__ColorAssignment_2_1_2 ) ) ;
    public final void rule__CellDisplay__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1225:1: ( ( ( rule__CellDisplay__ColorAssignment_2_1_2 ) ) )
            // InternalChessGame.g:1226:1: ( ( rule__CellDisplay__ColorAssignment_2_1_2 ) )
            {
            // InternalChessGame.g:1226:1: ( ( rule__CellDisplay__ColorAssignment_2_1_2 ) )
            // InternalChessGame.g:1227:2: ( rule__CellDisplay__ColorAssignment_2_1_2 )
            {
             before(grammarAccess.getCellDisplayAccess().getColorAssignment_2_1_2()); 
            // InternalChessGame.g:1228:2: ( rule__CellDisplay__ColorAssignment_2_1_2 )
            // InternalChessGame.g:1228:3: rule__CellDisplay__ColorAssignment_2_1_2
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
    // InternalChessGame.g:1237:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1241:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalChessGame.g:1242:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalChessGame.g:1249:1: rule__Transition__Group__0__Impl : ( 'click' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1253:1: ( ( 'click' ) )
            // InternalChessGame.g:1254:1: ( 'click' )
            {
            // InternalChessGame.g:1254:1: ( 'click' )
            // InternalChessGame.g:1255:2: 'click'
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
    // InternalChessGame.g:1264:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1268:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalChessGame.g:1269:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalChessGame.g:1276:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__TriggerAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1280:1: ( ( ( rule__Transition__TriggerAssignment_1 ) ) )
            // InternalChessGame.g:1281:1: ( ( rule__Transition__TriggerAssignment_1 ) )
            {
            // InternalChessGame.g:1281:1: ( ( rule__Transition__TriggerAssignment_1 ) )
            // InternalChessGame.g:1282:2: ( rule__Transition__TriggerAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getTriggerAssignment_1()); 
            // InternalChessGame.g:1283:2: ( rule__Transition__TriggerAssignment_1 )
            // InternalChessGame.g:1283:3: rule__Transition__TriggerAssignment_1
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
    // InternalChessGame.g:1291:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1295:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalChessGame.g:1296:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalChessGame.g:1303:1: rule__Transition__Group__2__Impl : ( 'and' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1307:1: ( ( 'and' ) )
            // InternalChessGame.g:1308:1: ( 'and' )
            {
            // InternalChessGame.g:1308:1: ( 'and' )
            // InternalChessGame.g:1309:2: 'and'
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
    // InternalChessGame.g:1318:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1322:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalChessGame.g:1323:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalChessGame.g:1330:1: rule__Transition__Group__3__Impl : ( 'goto' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1334:1: ( ( 'goto' ) )
            // InternalChessGame.g:1335:1: ( 'goto' )
            {
            // InternalChessGame.g:1335:1: ( 'goto' )
            // InternalChessGame.g:1336:2: 'goto'
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
    // InternalChessGame.g:1345:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1349:1: ( rule__Transition__Group__4__Impl )
            // InternalChessGame.g:1350:2: rule__Transition__Group__4__Impl
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
    // InternalChessGame.g:1356:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__TargetAssignment_4 ) ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1360:1: ( ( ( rule__Transition__TargetAssignment_4 ) ) )
            // InternalChessGame.g:1361:1: ( ( rule__Transition__TargetAssignment_4 ) )
            {
            // InternalChessGame.g:1361:1: ( ( rule__Transition__TargetAssignment_4 ) )
            // InternalChessGame.g:1362:2: ( rule__Transition__TargetAssignment_4 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_4()); 
            // InternalChessGame.g:1363:2: ( rule__Transition__TargetAssignment_4 )
            // InternalChessGame.g:1363:3: rule__Transition__TargetAssignment_4
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
    // InternalChessGame.g:1372:1: rule__MouseTrigger__Group_1__0 : rule__MouseTrigger__Group_1__0__Impl rule__MouseTrigger__Group_1__1 ;
    public final void rule__MouseTrigger__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1376:1: ( rule__MouseTrigger__Group_1__0__Impl rule__MouseTrigger__Group_1__1 )
            // InternalChessGame.g:1377:2: rule__MouseTrigger__Group_1__0__Impl rule__MouseTrigger__Group_1__1
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
    // InternalChessGame.g:1384:1: rule__MouseTrigger__Group_1__0__Impl : ( 'mouse-right' ) ;
    public final void rule__MouseTrigger__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1388:1: ( ( 'mouse-right' ) )
            // InternalChessGame.g:1389:1: ( 'mouse-right' )
            {
            // InternalChessGame.g:1389:1: ( 'mouse-right' )
            // InternalChessGame.g:1390:2: 'mouse-right'
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
    // InternalChessGame.g:1399:1: rule__MouseTrigger__Group_1__1 : rule__MouseTrigger__Group_1__1__Impl ;
    public final void rule__MouseTrigger__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1403:1: ( rule__MouseTrigger__Group_1__1__Impl )
            // InternalChessGame.g:1404:2: rule__MouseTrigger__Group_1__1__Impl
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
    // InternalChessGame.g:1410:1: rule__MouseTrigger__Group_1__1__Impl : ( () ) ;
    public final void rule__MouseTrigger__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1414:1: ( ( () ) )
            // InternalChessGame.g:1415:1: ( () )
            {
            // InternalChessGame.g:1415:1: ( () )
            // InternalChessGame.g:1416:2: ()
            {
             before(grammarAccess.getMouseTriggerAccess().getMouseTriggerAction_1_1()); 
            // InternalChessGame.g:1417:2: ()
            // InternalChessGame.g:1417:3: 
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
    // InternalChessGame.g:1426:1: rule__GameEnd__Group__0 : rule__GameEnd__Group__0__Impl rule__GameEnd__Group__1 ;
    public final void rule__GameEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1430:1: ( rule__GameEnd__Group__0__Impl rule__GameEnd__Group__1 )
            // InternalChessGame.g:1431:2: rule__GameEnd__Group__0__Impl rule__GameEnd__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalChessGame.g:1438:1: rule__GameEnd__Group__0__Impl : ( 'action' ) ;
    public final void rule__GameEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1442:1: ( ( 'action' ) )
            // InternalChessGame.g:1443:1: ( 'action' )
            {
            // InternalChessGame.g:1443:1: ( 'action' )
            // InternalChessGame.g:1444:2: 'action'
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
    // InternalChessGame.g:1453:1: rule__GameEnd__Group__1 : rule__GameEnd__Group__1__Impl rule__GameEnd__Group__2 ;
    public final void rule__GameEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1457:1: ( rule__GameEnd__Group__1__Impl rule__GameEnd__Group__2 )
            // InternalChessGame.g:1458:2: rule__GameEnd__Group__1__Impl rule__GameEnd__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalChessGame.g:1465:1: rule__GameEnd__Group__1__Impl : ( ( rule__GameEnd__NameAssignment_1 ) ) ;
    public final void rule__GameEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1469:1: ( ( ( rule__GameEnd__NameAssignment_1 ) ) )
            // InternalChessGame.g:1470:1: ( ( rule__GameEnd__NameAssignment_1 ) )
            {
            // InternalChessGame.g:1470:1: ( ( rule__GameEnd__NameAssignment_1 ) )
            // InternalChessGame.g:1471:2: ( rule__GameEnd__NameAssignment_1 )
            {
             before(grammarAccess.getGameEndAccess().getNameAssignment_1()); 
            // InternalChessGame.g:1472:2: ( rule__GameEnd__NameAssignment_1 )
            // InternalChessGame.g:1472:3: rule__GameEnd__NameAssignment_1
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
    // InternalChessGame.g:1480:1: rule__GameEnd__Group__2 : rule__GameEnd__Group__2__Impl rule__GameEnd__Group__3 ;
    public final void rule__GameEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1484:1: ( rule__GameEnd__Group__2__Impl rule__GameEnd__Group__3 )
            // InternalChessGame.g:1485:2: rule__GameEnd__Group__2__Impl rule__GameEnd__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalChessGame.g:1492:1: rule__GameEnd__Group__2__Impl : ( '{' ) ;
    public final void rule__GameEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1496:1: ( ( '{' ) )
            // InternalChessGame.g:1497:1: ( '{' )
            {
            // InternalChessGame.g:1497:1: ( '{' )
            // InternalChessGame.g:1498:2: '{'
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
    // InternalChessGame.g:1507:1: rule__GameEnd__Group__3 : rule__GameEnd__Group__3__Impl rule__GameEnd__Group__4 ;
    public final void rule__GameEnd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1511:1: ( rule__GameEnd__Group__3__Impl rule__GameEnd__Group__4 )
            // InternalChessGame.g:1512:2: rule__GameEnd__Group__3__Impl rule__GameEnd__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalChessGame.g:1519:1: rule__GameEnd__Group__3__Impl : ( 'when' ) ;
    public final void rule__GameEnd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1523:1: ( ( 'when' ) )
            // InternalChessGame.g:1524:1: ( 'when' )
            {
            // InternalChessGame.g:1524:1: ( 'when' )
            // InternalChessGame.g:1525:2: 'when'
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
    // InternalChessGame.g:1534:1: rule__GameEnd__Group__4 : rule__GameEnd__Group__4__Impl rule__GameEnd__Group__5 ;
    public final void rule__GameEnd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1538:1: ( rule__GameEnd__Group__4__Impl rule__GameEnd__Group__5 )
            // InternalChessGame.g:1539:2: rule__GameEnd__Group__4__Impl rule__GameEnd__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalChessGame.g:1546:1: rule__GameEnd__Group__4__Impl : ( ( rule__GameEnd__ActionAssignment_4 ) ) ;
    public final void rule__GameEnd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1550:1: ( ( ( rule__GameEnd__ActionAssignment_4 ) ) )
            // InternalChessGame.g:1551:1: ( ( rule__GameEnd__ActionAssignment_4 ) )
            {
            // InternalChessGame.g:1551:1: ( ( rule__GameEnd__ActionAssignment_4 ) )
            // InternalChessGame.g:1552:2: ( rule__GameEnd__ActionAssignment_4 )
            {
             before(grammarAccess.getGameEndAccess().getActionAssignment_4()); 
            // InternalChessGame.g:1553:2: ( rule__GameEnd__ActionAssignment_4 )
            // InternalChessGame.g:1553:3: rule__GameEnd__ActionAssignment_4
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
    // InternalChessGame.g:1561:1: rule__GameEnd__Group__5 : rule__GameEnd__Group__5__Impl rule__GameEnd__Group__6 ;
    public final void rule__GameEnd__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1565:1: ( rule__GameEnd__Group__5__Impl rule__GameEnd__Group__6 )
            // InternalChessGame.g:1566:2: rule__GameEnd__Group__5__Impl rule__GameEnd__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalChessGame.g:1573:1: rule__GameEnd__Group__5__Impl : ( 'do' ) ;
    public final void rule__GameEnd__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1577:1: ( ( 'do' ) )
            // InternalChessGame.g:1578:1: ( 'do' )
            {
            // InternalChessGame.g:1578:1: ( 'do' )
            // InternalChessGame.g:1579:2: 'do'
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
    // InternalChessGame.g:1588:1: rule__GameEnd__Group__6 : rule__GameEnd__Group__6__Impl rule__GameEnd__Group__7 ;
    public final void rule__GameEnd__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1592:1: ( rule__GameEnd__Group__6__Impl rule__GameEnd__Group__7 )
            // InternalChessGame.g:1593:2: rule__GameEnd__Group__6__Impl rule__GameEnd__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalChessGame.g:1600:1: rule__GameEnd__Group__6__Impl : ( ( rule__GameEnd__BehaviourAssignment_6 ) ) ;
    public final void rule__GameEnd__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1604:1: ( ( ( rule__GameEnd__BehaviourAssignment_6 ) ) )
            // InternalChessGame.g:1605:1: ( ( rule__GameEnd__BehaviourAssignment_6 ) )
            {
            // InternalChessGame.g:1605:1: ( ( rule__GameEnd__BehaviourAssignment_6 ) )
            // InternalChessGame.g:1606:2: ( rule__GameEnd__BehaviourAssignment_6 )
            {
             before(grammarAccess.getGameEndAccess().getBehaviourAssignment_6()); 
            // InternalChessGame.g:1607:2: ( rule__GameEnd__BehaviourAssignment_6 )
            // InternalChessGame.g:1607:3: rule__GameEnd__BehaviourAssignment_6
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
    // InternalChessGame.g:1615:1: rule__GameEnd__Group__7 : rule__GameEnd__Group__7__Impl ;
    public final void rule__GameEnd__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1619:1: ( rule__GameEnd__Group__7__Impl )
            // InternalChessGame.g:1620:2: rule__GameEnd__Group__7__Impl
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
    // InternalChessGame.g:1626:1: rule__GameEnd__Group__7__Impl : ( '}' ) ;
    public final void rule__GameEnd__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1630:1: ( ( '}' ) )
            // InternalChessGame.g:1631:1: ( '}' )
            {
            // InternalChessGame.g:1631:1: ( '}' )
            // InternalChessGame.g:1632:2: '}'
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
    // InternalChessGame.g:1642:1: rule__CellExpression__Group__0 : rule__CellExpression__Group__0__Impl rule__CellExpression__Group__1 ;
    public final void rule__CellExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1646:1: ( rule__CellExpression__Group__0__Impl rule__CellExpression__Group__1 )
            // InternalChessGame.g:1647:2: rule__CellExpression__Group__0__Impl rule__CellExpression__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalChessGame.g:1654:1: rule__CellExpression__Group__0__Impl : ( ( rule__CellExpression__StateAssignment_0 ) ) ;
    public final void rule__CellExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1658:1: ( ( ( rule__CellExpression__StateAssignment_0 ) ) )
            // InternalChessGame.g:1659:1: ( ( rule__CellExpression__StateAssignment_0 ) )
            {
            // InternalChessGame.g:1659:1: ( ( rule__CellExpression__StateAssignment_0 ) )
            // InternalChessGame.g:1660:2: ( rule__CellExpression__StateAssignment_0 )
            {
             before(grammarAccess.getCellExpressionAccess().getStateAssignment_0()); 
            // InternalChessGame.g:1661:2: ( rule__CellExpression__StateAssignment_0 )
            // InternalChessGame.g:1661:3: rule__CellExpression__StateAssignment_0
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
    // InternalChessGame.g:1669:1: rule__CellExpression__Group__1 : rule__CellExpression__Group__1__Impl rule__CellExpression__Group__2 ;
    public final void rule__CellExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1673:1: ( rule__CellExpression__Group__1__Impl rule__CellExpression__Group__2 )
            // InternalChessGame.g:1674:2: rule__CellExpression__Group__1__Impl rule__CellExpression__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalChessGame.g:1681:1: rule__CellExpression__Group__1__Impl : ( '.' ) ;
    public final void rule__CellExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1685:1: ( ( '.' ) )
            // InternalChessGame.g:1686:1: ( '.' )
            {
            // InternalChessGame.g:1686:1: ( '.' )
            // InternalChessGame.g:1687:2: '.'
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
    // InternalChessGame.g:1696:1: rule__CellExpression__Group__2 : rule__CellExpression__Group__2__Impl ;
    public final void rule__CellExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1700:1: ( rule__CellExpression__Group__2__Impl )
            // InternalChessGame.g:1701:2: rule__CellExpression__Group__2__Impl
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
    // InternalChessGame.g:1707:1: rule__CellExpression__Group__2__Impl : ( ( rule__CellExpression__CellStateAssignment_2 ) ) ;
    public final void rule__CellExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1711:1: ( ( ( rule__CellExpression__CellStateAssignment_2 ) ) )
            // InternalChessGame.g:1712:1: ( ( rule__CellExpression__CellStateAssignment_2 ) )
            {
            // InternalChessGame.g:1712:1: ( ( rule__CellExpression__CellStateAssignment_2 ) )
            // InternalChessGame.g:1713:2: ( rule__CellExpression__CellStateAssignment_2 )
            {
             before(grammarAccess.getCellExpressionAccess().getCellStateAssignment_2()); 
            // InternalChessGame.g:1714:2: ( rule__CellExpression__CellStateAssignment_2 )
            // InternalChessGame.g:1714:3: rule__CellExpression__CellStateAssignment_2
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
    // InternalChessGame.g:1723:1: rule__StateCheck__Group__0 : rule__StateCheck__Group__0__Impl rule__StateCheck__Group__1 ;
    public final void rule__StateCheck__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1727:1: ( rule__StateCheck__Group__0__Impl rule__StateCheck__Group__1 )
            // InternalChessGame.g:1728:2: rule__StateCheck__Group__0__Impl rule__StateCheck__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalChessGame.g:1735:1: rule__StateCheck__Group__0__Impl : ( 'allCellState' ) ;
    public final void rule__StateCheck__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1739:1: ( ( 'allCellState' ) )
            // InternalChessGame.g:1740:1: ( 'allCellState' )
            {
            // InternalChessGame.g:1740:1: ( 'allCellState' )
            // InternalChessGame.g:1741:2: 'allCellState'
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
    // InternalChessGame.g:1750:1: rule__StateCheck__Group__1 : rule__StateCheck__Group__1__Impl rule__StateCheck__Group__2 ;
    public final void rule__StateCheck__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1754:1: ( rule__StateCheck__Group__1__Impl rule__StateCheck__Group__2 )
            // InternalChessGame.g:1755:2: rule__StateCheck__Group__1__Impl rule__StateCheck__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalChessGame.g:1762:1: rule__StateCheck__Group__1__Impl : ( '(' ) ;
    public final void rule__StateCheck__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1766:1: ( ( '(' ) )
            // InternalChessGame.g:1767:1: ( '(' )
            {
            // InternalChessGame.g:1767:1: ( '(' )
            // InternalChessGame.g:1768:2: '('
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
    // InternalChessGame.g:1777:1: rule__StateCheck__Group__2 : rule__StateCheck__Group__2__Impl rule__StateCheck__Group__3 ;
    public final void rule__StateCheck__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1781:1: ( rule__StateCheck__Group__2__Impl rule__StateCheck__Group__3 )
            // InternalChessGame.g:1782:2: rule__StateCheck__Group__2__Impl rule__StateCheck__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalChessGame.g:1789:1: rule__StateCheck__Group__2__Impl : ( ( rule__StateCheck__Cell_stateAssignment_2 ) ) ;
    public final void rule__StateCheck__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1793:1: ( ( ( rule__StateCheck__Cell_stateAssignment_2 ) ) )
            // InternalChessGame.g:1794:1: ( ( rule__StateCheck__Cell_stateAssignment_2 ) )
            {
            // InternalChessGame.g:1794:1: ( ( rule__StateCheck__Cell_stateAssignment_2 ) )
            // InternalChessGame.g:1795:2: ( rule__StateCheck__Cell_stateAssignment_2 )
            {
             before(grammarAccess.getStateCheckAccess().getCell_stateAssignment_2()); 
            // InternalChessGame.g:1796:2: ( rule__StateCheck__Cell_stateAssignment_2 )
            // InternalChessGame.g:1796:3: rule__StateCheck__Cell_stateAssignment_2
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
    // InternalChessGame.g:1804:1: rule__StateCheck__Group__3 : rule__StateCheck__Group__3__Impl ;
    public final void rule__StateCheck__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1808:1: ( rule__StateCheck__Group__3__Impl )
            // InternalChessGame.g:1809:2: rule__StateCheck__Group__3__Impl
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
    // InternalChessGame.g:1815:1: rule__StateCheck__Group__3__Impl : ( ')' ) ;
    public final void rule__StateCheck__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1819:1: ( ( ')' ) )
            // InternalChessGame.g:1820:1: ( ')' )
            {
            // InternalChessGame.g:1820:1: ( ')' )
            // InternalChessGame.g:1821:2: ')'
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
    // InternalChessGame.g:1831:1: rule__EmptyExpression__Group__0 : rule__EmptyExpression__Group__0__Impl rule__EmptyExpression__Group__1 ;
    public final void rule__EmptyExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1835:1: ( rule__EmptyExpression__Group__0__Impl rule__EmptyExpression__Group__1 )
            // InternalChessGame.g:1836:2: rule__EmptyExpression__Group__0__Impl rule__EmptyExpression__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalChessGame.g:1843:1: rule__EmptyExpression__Group__0__Impl : ( 'empty' ) ;
    public final void rule__EmptyExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1847:1: ( ( 'empty' ) )
            // InternalChessGame.g:1848:1: ( 'empty' )
            {
            // InternalChessGame.g:1848:1: ( 'empty' )
            // InternalChessGame.g:1849:2: 'empty'
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
    // InternalChessGame.g:1858:1: rule__EmptyExpression__Group__1 : rule__EmptyExpression__Group__1__Impl rule__EmptyExpression__Group__2 ;
    public final void rule__EmptyExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1862:1: ( rule__EmptyExpression__Group__1__Impl rule__EmptyExpression__Group__2 )
            // InternalChessGame.g:1863:2: rule__EmptyExpression__Group__1__Impl rule__EmptyExpression__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalChessGame.g:1870:1: rule__EmptyExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__EmptyExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1874:1: ( ( '(' ) )
            // InternalChessGame.g:1875:1: ( '(' )
            {
            // InternalChessGame.g:1875:1: ( '(' )
            // InternalChessGame.g:1876:2: '('
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
    // InternalChessGame.g:1885:1: rule__EmptyExpression__Group__2 : rule__EmptyExpression__Group__2__Impl rule__EmptyExpression__Group__3 ;
    public final void rule__EmptyExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1889:1: ( rule__EmptyExpression__Group__2__Impl rule__EmptyExpression__Group__3 )
            // InternalChessGame.g:1890:2: rule__EmptyExpression__Group__2__Impl rule__EmptyExpression__Group__3
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
    // InternalChessGame.g:1897:1: rule__EmptyExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__EmptyExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1901:1: ( ( ')' ) )
            // InternalChessGame.g:1902:1: ( ')' )
            {
            // InternalChessGame.g:1902:1: ( ')' )
            // InternalChessGame.g:1903:2: ')'
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
    // InternalChessGame.g:1912:1: rule__EmptyExpression__Group__3 : rule__EmptyExpression__Group__3__Impl ;
    public final void rule__EmptyExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1916:1: ( rule__EmptyExpression__Group__3__Impl )
            // InternalChessGame.g:1917:2: rule__EmptyExpression__Group__3__Impl
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
    // InternalChessGame.g:1923:1: rule__EmptyExpression__Group__3__Impl : ( () ) ;
    public final void rule__EmptyExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1927:1: ( ( () ) )
            // InternalChessGame.g:1928:1: ( () )
            {
            // InternalChessGame.g:1928:1: ( () )
            // InternalChessGame.g:1929:2: ()
            {
             before(grammarAccess.getEmptyExpressionAccess().getEmptyExpressionAction_3()); 
            // InternalChessGame.g:1930:2: ()
            // InternalChessGame.g:1930:3: 
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
    // InternalChessGame.g:1939:1: rule__EndBehaviour__Group__0 : rule__EndBehaviour__Group__0__Impl rule__EndBehaviour__Group__1 ;
    public final void rule__EndBehaviour__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1943:1: ( rule__EndBehaviour__Group__0__Impl rule__EndBehaviour__Group__1 )
            // InternalChessGame.g:1944:2: rule__EndBehaviour__Group__0__Impl rule__EndBehaviour__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalChessGame.g:1951:1: rule__EndBehaviour__Group__0__Impl : ( 'end-game' ) ;
    public final void rule__EndBehaviour__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1955:1: ( ( 'end-game' ) )
            // InternalChessGame.g:1956:1: ( 'end-game' )
            {
            // InternalChessGame.g:1956:1: ( 'end-game' )
            // InternalChessGame.g:1957:2: 'end-game'
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
    // InternalChessGame.g:1966:1: rule__EndBehaviour__Group__1 : rule__EndBehaviour__Group__1__Impl rule__EndBehaviour__Group__2 ;
    public final void rule__EndBehaviour__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1970:1: ( rule__EndBehaviour__Group__1__Impl rule__EndBehaviour__Group__2 )
            // InternalChessGame.g:1971:2: rule__EndBehaviour__Group__1__Impl rule__EndBehaviour__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalChessGame.g:1978:1: rule__EndBehaviour__Group__1__Impl : ( '(' ) ;
    public final void rule__EndBehaviour__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1982:1: ( ( '(' ) )
            // InternalChessGame.g:1983:1: ( '(' )
            {
            // InternalChessGame.g:1983:1: ( '(' )
            // InternalChessGame.g:1984:2: '('
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
    // InternalChessGame.g:1993:1: rule__EndBehaviour__Group__2 : rule__EndBehaviour__Group__2__Impl rule__EndBehaviour__Group__3 ;
    public final void rule__EndBehaviour__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1997:1: ( rule__EndBehaviour__Group__2__Impl rule__EndBehaviour__Group__3 )
            // InternalChessGame.g:1998:2: rule__EndBehaviour__Group__2__Impl rule__EndBehaviour__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalChessGame.g:2005:1: rule__EndBehaviour__Group__2__Impl : ( ( rule__EndBehaviour__MessageAssignment_2 ) ) ;
    public final void rule__EndBehaviour__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2009:1: ( ( ( rule__EndBehaviour__MessageAssignment_2 ) ) )
            // InternalChessGame.g:2010:1: ( ( rule__EndBehaviour__MessageAssignment_2 ) )
            {
            // InternalChessGame.g:2010:1: ( ( rule__EndBehaviour__MessageAssignment_2 ) )
            // InternalChessGame.g:2011:2: ( rule__EndBehaviour__MessageAssignment_2 )
            {
             before(grammarAccess.getEndBehaviourAccess().getMessageAssignment_2()); 
            // InternalChessGame.g:2012:2: ( rule__EndBehaviour__MessageAssignment_2 )
            // InternalChessGame.g:2012:3: rule__EndBehaviour__MessageAssignment_2
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
    // InternalChessGame.g:2020:1: rule__EndBehaviour__Group__3 : rule__EndBehaviour__Group__3__Impl ;
    public final void rule__EndBehaviour__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2024:1: ( rule__EndBehaviour__Group__3__Impl )
            // InternalChessGame.g:2025:2: rule__EndBehaviour__Group__3__Impl
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
    // InternalChessGame.g:2031:1: rule__EndBehaviour__Group__3__Impl : ( ')' ) ;
    public final void rule__EndBehaviour__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2035:1: ( ( ')' ) )
            // InternalChessGame.g:2036:1: ( ')' )
            {
            // InternalChessGame.g:2036:1: ( ')' )
            // InternalChessGame.g:2037:2: ')'
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
    // InternalChessGame.g:2047:1: rule__ChessProgram__StatesAssignment : ( ruleStatements ) ;
    public final void rule__ChessProgram__StatesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2051:1: ( ( ruleStatements ) )
            // InternalChessGame.g:2052:2: ( ruleStatements )
            {
            // InternalChessGame.g:2052:2: ( ruleStatements )
            // InternalChessGame.g:2053:3: ruleStatements
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
    // InternalChessGame.g:2062:1: rule__FieldSpecification__WidthAssignment_4 : ( RULE_INT ) ;
    public final void rule__FieldSpecification__WidthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2066:1: ( ( RULE_INT ) )
            // InternalChessGame.g:2067:2: ( RULE_INT )
            {
            // InternalChessGame.g:2067:2: ( RULE_INT )
            // InternalChessGame.g:2068:3: RULE_INT
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
    // InternalChessGame.g:2077:1: rule__FieldSpecification__HeightAssignment_7 : ( RULE_INT ) ;
    public final void rule__FieldSpecification__HeightAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2081:1: ( ( RULE_INT ) )
            // InternalChessGame.g:2082:2: ( RULE_INT )
            {
            // InternalChessGame.g:2082:2: ( RULE_INT )
            // InternalChessGame.g:2083:3: RULE_INT
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


    // $ANTLR start "rule__OptionSpecification__StatesAssignment"
    // InternalChessGame.g:2092:1: rule__OptionSpecification__StatesAssignment : ( ruleCellState ) ;
    public final void rule__OptionSpecification__StatesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2096:1: ( ( ruleCellState ) )
            // InternalChessGame.g:2097:2: ( ruleCellState )
            {
            // InternalChessGame.g:2097:2: ( ruleCellState )
            // InternalChessGame.g:2098:3: ruleCellState
            {
             before(grammarAccess.getOptionSpecificationAccess().getStatesCellStateParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCellState();

            state._fsp--;

             after(grammarAccess.getOptionSpecificationAccess().getStatesCellStateParserRuleCall_0()); 

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
    // $ANTLR end "rule__OptionSpecification__StatesAssignment"


    // $ANTLR start "rule__CellState__NameAssignment_0"
    // InternalChessGame.g:2107:1: rule__CellState__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__CellState__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2111:1: ( ( RULE_ID ) )
            // InternalChessGame.g:2112:2: ( RULE_ID )
            {
            // InternalChessGame.g:2112:2: ( RULE_ID )
            // InternalChessGame.g:2113:3: RULE_ID
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
    // InternalChessGame.g:2122:1: rule__CellState__DisplayAssignment_2 : ( ruleCellDisplay ) ;
    public final void rule__CellState__DisplayAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2126:1: ( ( ruleCellDisplay ) )
            // InternalChessGame.g:2127:2: ( ruleCellDisplay )
            {
            // InternalChessGame.g:2127:2: ( ruleCellDisplay )
            // InternalChessGame.g:2128:3: ruleCellDisplay
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
    // InternalChessGame.g:2137:1: rule__CellState__TransitionsAssignment_3_2 : ( ruleTransition ) ;
    public final void rule__CellState__TransitionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2141:1: ( ( ruleTransition ) )
            // InternalChessGame.g:2142:2: ( ruleTransition )
            {
            // InternalChessGame.g:2142:2: ( ruleTransition )
            // InternalChessGame.g:2143:3: ruleTransition
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
    // InternalChessGame.g:2152:1: rule__CellDisplay__TextAssignment_2_0_2 : ( RULE_STRING ) ;
    public final void rule__CellDisplay__TextAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2156:1: ( ( RULE_STRING ) )
            // InternalChessGame.g:2157:2: ( RULE_STRING )
            {
            // InternalChessGame.g:2157:2: ( RULE_STRING )
            // InternalChessGame.g:2158:3: RULE_STRING
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
    // InternalChessGame.g:2167:1: rule__CellDisplay__ColorAssignment_2_1_2 : ( ( rule__CellDisplay__ColorAlternatives_2_1_2_0 ) ) ;
    public final void rule__CellDisplay__ColorAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2171:1: ( ( ( rule__CellDisplay__ColorAlternatives_2_1_2_0 ) ) )
            // InternalChessGame.g:2172:2: ( ( rule__CellDisplay__ColorAlternatives_2_1_2_0 ) )
            {
            // InternalChessGame.g:2172:2: ( ( rule__CellDisplay__ColorAlternatives_2_1_2_0 ) )
            // InternalChessGame.g:2173:3: ( rule__CellDisplay__ColorAlternatives_2_1_2_0 )
            {
             before(grammarAccess.getCellDisplayAccess().getColorAlternatives_2_1_2_0()); 
            // InternalChessGame.g:2174:3: ( rule__CellDisplay__ColorAlternatives_2_1_2_0 )
            // InternalChessGame.g:2174:4: rule__CellDisplay__ColorAlternatives_2_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__CellDisplay__ColorAlternatives_2_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCellDisplayAccess().getColorAlternatives_2_1_2_0()); 

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
    // InternalChessGame.g:2182:1: rule__Transition__TriggerAssignment_1 : ( ruleMouseTrigger ) ;
    public final void rule__Transition__TriggerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2186:1: ( ( ruleMouseTrigger ) )
            // InternalChessGame.g:2187:2: ( ruleMouseTrigger )
            {
            // InternalChessGame.g:2187:2: ( ruleMouseTrigger )
            // InternalChessGame.g:2188:3: ruleMouseTrigger
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
    // InternalChessGame.g:2197:1: rule__Transition__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2201:1: ( ( ( RULE_ID ) ) )
            // InternalChessGame.g:2202:2: ( ( RULE_ID ) )
            {
            // InternalChessGame.g:2202:2: ( ( RULE_ID ) )
            // InternalChessGame.g:2203:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getTargetCellStateCrossReference_4_0()); 
            // InternalChessGame.g:2204:3: ( RULE_ID )
            // InternalChessGame.g:2205:4: RULE_ID
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
    // InternalChessGame.g:2216:1: rule__MouseTrigger__MouseAssignment_0 : ( ( 'mouse-left' ) ) ;
    public final void rule__MouseTrigger__MouseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2220:1: ( ( ( 'mouse-left' ) ) )
            // InternalChessGame.g:2221:2: ( ( 'mouse-left' ) )
            {
            // InternalChessGame.g:2221:2: ( ( 'mouse-left' ) )
            // InternalChessGame.g:2222:3: ( 'mouse-left' )
            {
             before(grammarAccess.getMouseTriggerAccess().getMouseMouseLeftKeyword_0_0()); 
            // InternalChessGame.g:2223:3: ( 'mouse-left' )
            // InternalChessGame.g:2224:4: 'mouse-left'
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
    // InternalChessGame.g:2235:1: rule__GameEnd__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GameEnd__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2239:1: ( ( RULE_ID ) )
            // InternalChessGame.g:2240:2: ( RULE_ID )
            {
            // InternalChessGame.g:2240:2: ( RULE_ID )
            // InternalChessGame.g:2241:3: RULE_ID
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
    // InternalChessGame.g:2250:1: rule__GameEnd__ActionAssignment_4 : ( ruleCellExpression ) ;
    public final void rule__GameEnd__ActionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2254:1: ( ( ruleCellExpression ) )
            // InternalChessGame.g:2255:2: ( ruleCellExpression )
            {
            // InternalChessGame.g:2255:2: ( ruleCellExpression )
            // InternalChessGame.g:2256:3: ruleCellExpression
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
    // InternalChessGame.g:2265:1: rule__GameEnd__BehaviourAssignment_6 : ( ruleEndBehaviour ) ;
    public final void rule__GameEnd__BehaviourAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2269:1: ( ( ruleEndBehaviour ) )
            // InternalChessGame.g:2270:2: ( ruleEndBehaviour )
            {
            // InternalChessGame.g:2270:2: ( ruleEndBehaviour )
            // InternalChessGame.g:2271:3: ruleEndBehaviour
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
    // InternalChessGame.g:2280:1: rule__CellExpression__StateAssignment_0 : ( ruleStateCheck ) ;
    public final void rule__CellExpression__StateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2284:1: ( ( ruleStateCheck ) )
            // InternalChessGame.g:2285:2: ( ruleStateCheck )
            {
            // InternalChessGame.g:2285:2: ( ruleStateCheck )
            // InternalChessGame.g:2286:3: ruleStateCheck
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
    // InternalChessGame.g:2295:1: rule__CellExpression__CellStateAssignment_2 : ( ruleEmptyExpression ) ;
    public final void rule__CellExpression__CellStateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2299:1: ( ( ruleEmptyExpression ) )
            // InternalChessGame.g:2300:2: ( ruleEmptyExpression )
            {
            // InternalChessGame.g:2300:2: ( ruleEmptyExpression )
            // InternalChessGame.g:2301:3: ruleEmptyExpression
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
    // InternalChessGame.g:2310:1: rule__StateCheck__Cell_stateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StateCheck__Cell_stateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2314:1: ( ( ( RULE_ID ) ) )
            // InternalChessGame.g:2315:2: ( ( RULE_ID ) )
            {
            // InternalChessGame.g:2315:2: ( ( RULE_ID ) )
            // InternalChessGame.g:2316:3: ( RULE_ID )
            {
             before(grammarAccess.getStateCheckAccess().getCell_stateCellStateCrossReference_2_0()); 
            // InternalChessGame.g:2317:3: ( RULE_ID )
            // InternalChessGame.g:2318:4: RULE_ID
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
    // InternalChessGame.g:2329:1: rule__EndBehaviour__MessageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EndBehaviour__MessageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2333:1: ( ( RULE_STRING ) )
            // InternalChessGame.g:2334:2: ( RULE_STRING )
            {
            // InternalChessGame.g:2334:2: ( RULE_STRING )
            // InternalChessGame.g:2335:3: RULE_STRING
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


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\36\uffff";
    static final String dfa_2s = "\1\1\35\uffff";
    static final String dfa_3s = "\1\5\1\uffff\1\16\1\24\1\16\1\25\2\20\1\6\1\13\4\22\1\16\1\uffff\1\27\1\32\2\30\1\31\1\5\1\22\1\32\1\22\2\30\1\31\1\5\1\22";
    static final String dfa_4s = "\1\33\1\uffff\1\16\1\24\1\16\1\26\2\20\1\6\1\14\3\22\1\23\1\16\1\uffff\1\27\1\44\2\30\1\31\1\5\1\27\1\44\1\22\2\30\1\31\1\5\1\27";
    static final String dfa_5s = "\1\uffff\1\2\15\uffff\1\1\16\uffff";
    static final String dfa_6s = "\36\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\7\uffff\1\1\15\uffff\1\1",
            "",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13\1\14",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\17\1\16",
            "\1\20",
            "",
            "\1\21",
            "\1\23\11\uffff\1\22",
            "\1\24",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\30\4\uffff\1\27",
            "\1\32\11\uffff\1\31",
            "\1\17",
            "\1\33",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\30\4\uffff\1\27"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 150:4: ( rule__OptionSpecification__StatesAssignment )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008002022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});

}