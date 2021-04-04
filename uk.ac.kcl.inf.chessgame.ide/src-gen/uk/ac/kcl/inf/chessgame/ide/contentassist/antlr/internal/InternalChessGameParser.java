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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BlackFirst'", "'WhiteFirst'", "'black'", "'white'", "'field'", "'{'", "'width'", "'='", "'height'", "'FirstPlayer'", "'}'", "'transitions'", "'display'", "'text'", "'color'", "'click'", "'and'", "'goto'", "'mouse-right'", "'action'", "'when'", "'do'", "'.'", "'allCellState'", "'('", "')'", "'empty'", "'end-game'", "'mouse-left'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
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
    // InternalChessGame.g:62:1: ruleChessProgram : ( ( rule__ChessProgram__Group__0 ) ) ;
    public final void ruleChessProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:66:2: ( ( ( rule__ChessProgram__Group__0 ) ) )
            // InternalChessGame.g:67:2: ( ( rule__ChessProgram__Group__0 ) )
            {
            // InternalChessGame.g:67:2: ( ( rule__ChessProgram__Group__0 ) )
            // InternalChessGame.g:68:3: ( rule__ChessProgram__Group__0 )
            {
             before(grammarAccess.getChessProgramAccess().getGroup()); 
            // InternalChessGame.g:69:3: ( rule__ChessProgram__Group__0 )
            // InternalChessGame.g:69:4: rule__ChessProgram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChessProgram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChessProgramAccess().getGroup()); 

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


    // $ANTLR start "entryRuleFieldSpecification"
    // InternalChessGame.g:78:1: entryRuleFieldSpecification : ruleFieldSpecification EOF ;
    public final void entryRuleFieldSpecification() throws RecognitionException {
        try {
            // InternalChessGame.g:79:1: ( ruleFieldSpecification EOF )
            // InternalChessGame.g:80:1: ruleFieldSpecification EOF
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
    // InternalChessGame.g:87:1: ruleFieldSpecification : ( ( rule__FieldSpecification__Group__0 ) ) ;
    public final void ruleFieldSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:91:2: ( ( ( rule__FieldSpecification__Group__0 ) ) )
            // InternalChessGame.g:92:2: ( ( rule__FieldSpecification__Group__0 ) )
            {
            // InternalChessGame.g:92:2: ( ( rule__FieldSpecification__Group__0 ) )
            // InternalChessGame.g:93:3: ( rule__FieldSpecification__Group__0 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getGroup()); 
            // InternalChessGame.g:94:3: ( rule__FieldSpecification__Group__0 )
            // InternalChessGame.g:94:4: rule__FieldSpecification__Group__0
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
    // InternalChessGame.g:103:1: entryRuleOptionSpecification : ruleOptionSpecification EOF ;
    public final void entryRuleOptionSpecification() throws RecognitionException {
        try {
            // InternalChessGame.g:104:1: ( ruleOptionSpecification EOF )
            // InternalChessGame.g:105:1: ruleOptionSpecification EOF
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
    // InternalChessGame.g:112:1: ruleOptionSpecification : ( ( ( rule__OptionSpecification__StatesAssignment ) ) ( ( rule__OptionSpecification__StatesAssignment )* ) ) ;
    public final void ruleOptionSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:116:2: ( ( ( ( rule__OptionSpecification__StatesAssignment ) ) ( ( rule__OptionSpecification__StatesAssignment )* ) ) )
            // InternalChessGame.g:117:2: ( ( ( rule__OptionSpecification__StatesAssignment ) ) ( ( rule__OptionSpecification__StatesAssignment )* ) )
            {
            // InternalChessGame.g:117:2: ( ( ( rule__OptionSpecification__StatesAssignment ) ) ( ( rule__OptionSpecification__StatesAssignment )* ) )
            // InternalChessGame.g:118:3: ( ( rule__OptionSpecification__StatesAssignment ) ) ( ( rule__OptionSpecification__StatesAssignment )* )
            {
            // InternalChessGame.g:118:3: ( ( rule__OptionSpecification__StatesAssignment ) )
            // InternalChessGame.g:119:4: ( rule__OptionSpecification__StatesAssignment )
            {
             before(grammarAccess.getOptionSpecificationAccess().getStatesAssignment()); 
            // InternalChessGame.g:120:4: ( rule__OptionSpecification__StatesAssignment )
            // InternalChessGame.g:120:5: rule__OptionSpecification__StatesAssignment
            {
            pushFollow(FOLLOW_3);
            rule__OptionSpecification__StatesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOptionSpecificationAccess().getStatesAssignment()); 

            }

            // InternalChessGame.g:123:3: ( ( rule__OptionSpecification__StatesAssignment )* )
            // InternalChessGame.g:124:4: ( rule__OptionSpecification__StatesAssignment )*
            {
             before(grammarAccess.getOptionSpecificationAccess().getStatesAssignment()); 
            // InternalChessGame.g:125:4: ( rule__OptionSpecification__StatesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalChessGame.g:125:5: rule__OptionSpecification__StatesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__OptionSpecification__StatesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // InternalChessGame.g:135:1: entryRuleCellState : ruleCellState EOF ;
    public final void entryRuleCellState() throws RecognitionException {
        try {
            // InternalChessGame.g:136:1: ( ruleCellState EOF )
            // InternalChessGame.g:137:1: ruleCellState EOF
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
    // InternalChessGame.g:144:1: ruleCellState : ( ( rule__CellState__Group__0 ) ) ;
    public final void ruleCellState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:148:2: ( ( ( rule__CellState__Group__0 ) ) )
            // InternalChessGame.g:149:2: ( ( rule__CellState__Group__0 ) )
            {
            // InternalChessGame.g:149:2: ( ( rule__CellState__Group__0 ) )
            // InternalChessGame.g:150:3: ( rule__CellState__Group__0 )
            {
             before(grammarAccess.getCellStateAccess().getGroup()); 
            // InternalChessGame.g:151:3: ( rule__CellState__Group__0 )
            // InternalChessGame.g:151:4: rule__CellState__Group__0
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


    // $ANTLR start "entryRuleCellDisplaySpec"
    // InternalChessGame.g:160:1: entryRuleCellDisplaySpec : ruleCellDisplaySpec EOF ;
    public final void entryRuleCellDisplaySpec() throws RecognitionException {
        try {
            // InternalChessGame.g:161:1: ( ruleCellDisplaySpec EOF )
            // InternalChessGame.g:162:1: ruleCellDisplaySpec EOF
            {
             before(grammarAccess.getCellDisplaySpecRule()); 
            pushFollow(FOLLOW_1);
            ruleCellDisplaySpec();

            state._fsp--;

             after(grammarAccess.getCellDisplaySpecRule()); 
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
    // $ANTLR end "entryRuleCellDisplaySpec"


    // $ANTLR start "ruleCellDisplaySpec"
    // InternalChessGame.g:169:1: ruleCellDisplaySpec : ( ( rule__CellDisplaySpec__Group__0 ) ) ;
    public final void ruleCellDisplaySpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:173:2: ( ( ( rule__CellDisplaySpec__Group__0 ) ) )
            // InternalChessGame.g:174:2: ( ( rule__CellDisplaySpec__Group__0 ) )
            {
            // InternalChessGame.g:174:2: ( ( rule__CellDisplaySpec__Group__0 ) )
            // InternalChessGame.g:175:3: ( rule__CellDisplaySpec__Group__0 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getGroup()); 
            // InternalChessGame.g:176:3: ( rule__CellDisplaySpec__Group__0 )
            // InternalChessGame.g:176:4: rule__CellDisplaySpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CellDisplaySpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellDisplaySpecAccess().getGroup()); 

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
    // $ANTLR end "ruleCellDisplaySpec"


    // $ANTLR start "entryRuleTransitionSpec"
    // InternalChessGame.g:185:1: entryRuleTransitionSpec : ruleTransitionSpec EOF ;
    public final void entryRuleTransitionSpec() throws RecognitionException {
        try {
            // InternalChessGame.g:186:1: ( ruleTransitionSpec EOF )
            // InternalChessGame.g:187:1: ruleTransitionSpec EOF
            {
             before(grammarAccess.getTransitionSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleTransitionSpec();

            state._fsp--;

             after(grammarAccess.getTransitionSpecRule()); 
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
    // $ANTLR end "entryRuleTransitionSpec"


    // $ANTLR start "ruleTransitionSpec"
    // InternalChessGame.g:194:1: ruleTransitionSpec : ( ( rule__TransitionSpec__Group__0 ) ) ;
    public final void ruleTransitionSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:198:2: ( ( ( rule__TransitionSpec__Group__0 ) ) )
            // InternalChessGame.g:199:2: ( ( rule__TransitionSpec__Group__0 ) )
            {
            // InternalChessGame.g:199:2: ( ( rule__TransitionSpec__Group__0 ) )
            // InternalChessGame.g:200:3: ( rule__TransitionSpec__Group__0 )
            {
             before(grammarAccess.getTransitionSpecAccess().getGroup()); 
            // InternalChessGame.g:201:3: ( rule__TransitionSpec__Group__0 )
            // InternalChessGame.g:201:4: rule__TransitionSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TransitionSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionSpecAccess().getGroup()); 

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
    // $ANTLR end "ruleTransitionSpec"


    // $ANTLR start "entryRuleMouseTrigger"
    // InternalChessGame.g:210:1: entryRuleMouseTrigger : ruleMouseTrigger EOF ;
    public final void entryRuleMouseTrigger() throws RecognitionException {
        try {
            // InternalChessGame.g:211:1: ( ruleMouseTrigger EOF )
            // InternalChessGame.g:212:1: ruleMouseTrigger EOF
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
    // InternalChessGame.g:219:1: ruleMouseTrigger : ( ( rule__MouseTrigger__Alternatives ) ) ;
    public final void ruleMouseTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:223:2: ( ( ( rule__MouseTrigger__Alternatives ) ) )
            // InternalChessGame.g:224:2: ( ( rule__MouseTrigger__Alternatives ) )
            {
            // InternalChessGame.g:224:2: ( ( rule__MouseTrigger__Alternatives ) )
            // InternalChessGame.g:225:3: ( rule__MouseTrigger__Alternatives )
            {
             before(grammarAccess.getMouseTriggerAccess().getAlternatives()); 
            // InternalChessGame.g:226:3: ( rule__MouseTrigger__Alternatives )
            // InternalChessGame.g:226:4: rule__MouseTrigger__Alternatives
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
    // InternalChessGame.g:235:1: entryRuleGameEnd : ruleGameEnd EOF ;
    public final void entryRuleGameEnd() throws RecognitionException {
        try {
            // InternalChessGame.g:236:1: ( ruleGameEnd EOF )
            // InternalChessGame.g:237:1: ruleGameEnd EOF
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
    // InternalChessGame.g:244:1: ruleGameEnd : ( ( rule__GameEnd__Group__0 ) ) ;
    public final void ruleGameEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:248:2: ( ( ( rule__GameEnd__Group__0 ) ) )
            // InternalChessGame.g:249:2: ( ( rule__GameEnd__Group__0 ) )
            {
            // InternalChessGame.g:249:2: ( ( rule__GameEnd__Group__0 ) )
            // InternalChessGame.g:250:3: ( rule__GameEnd__Group__0 )
            {
             before(grammarAccess.getGameEndAccess().getGroup()); 
            // InternalChessGame.g:251:3: ( rule__GameEnd__Group__0 )
            // InternalChessGame.g:251:4: rule__GameEnd__Group__0
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


    // $ANTLR start "entryRuleContextExpression"
    // InternalChessGame.g:260:1: entryRuleContextExpression : ruleContextExpression EOF ;
    public final void entryRuleContextExpression() throws RecognitionException {
        try {
            // InternalChessGame.g:261:1: ( ruleContextExpression EOF )
            // InternalChessGame.g:262:1: ruleContextExpression EOF
            {
             before(grammarAccess.getContextExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleContextExpression();

            state._fsp--;

             after(grammarAccess.getContextExpressionRule()); 
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
    // $ANTLR end "entryRuleContextExpression"


    // $ANTLR start "ruleContextExpression"
    // InternalChessGame.g:269:1: ruleContextExpression : ( ( rule__ContextExpression__Group__0 ) ) ;
    public final void ruleContextExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:273:2: ( ( ( rule__ContextExpression__Group__0 ) ) )
            // InternalChessGame.g:274:2: ( ( rule__ContextExpression__Group__0 ) )
            {
            // InternalChessGame.g:274:2: ( ( rule__ContextExpression__Group__0 ) )
            // InternalChessGame.g:275:3: ( rule__ContextExpression__Group__0 )
            {
             before(grammarAccess.getContextExpressionAccess().getGroup()); 
            // InternalChessGame.g:276:3: ( rule__ContextExpression__Group__0 )
            // InternalChessGame.g:276:4: rule__ContextExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContextExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleContextExpression"


    // $ANTLR start "entryRuleStateFilterExpression"
    // InternalChessGame.g:285:1: entryRuleStateFilterExpression : ruleStateFilterExpression EOF ;
    public final void entryRuleStateFilterExpression() throws RecognitionException {
        try {
            // InternalChessGame.g:286:1: ( ruleStateFilterExpression EOF )
            // InternalChessGame.g:287:1: ruleStateFilterExpression EOF
            {
             before(grammarAccess.getStateFilterExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleStateFilterExpression();

            state._fsp--;

             after(grammarAccess.getStateFilterExpressionRule()); 
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
    // $ANTLR end "entryRuleStateFilterExpression"


    // $ANTLR start "ruleStateFilterExpression"
    // InternalChessGame.g:294:1: ruleStateFilterExpression : ( ( rule__StateFilterExpression__Group__0 ) ) ;
    public final void ruleStateFilterExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:298:2: ( ( ( rule__StateFilterExpression__Group__0 ) ) )
            // InternalChessGame.g:299:2: ( ( rule__StateFilterExpression__Group__0 ) )
            {
            // InternalChessGame.g:299:2: ( ( rule__StateFilterExpression__Group__0 ) )
            // InternalChessGame.g:300:3: ( rule__StateFilterExpression__Group__0 )
            {
             before(grammarAccess.getStateFilterExpressionAccess().getGroup()); 
            // InternalChessGame.g:301:3: ( rule__StateFilterExpression__Group__0 )
            // InternalChessGame.g:301:4: rule__StateFilterExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StateFilterExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateFilterExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleStateFilterExpression"


    // $ANTLR start "entryRuleEmptyExpression"
    // InternalChessGame.g:310:1: entryRuleEmptyExpression : ruleEmptyExpression EOF ;
    public final void entryRuleEmptyExpression() throws RecognitionException {
        try {
            // InternalChessGame.g:311:1: ( ruleEmptyExpression EOF )
            // InternalChessGame.g:312:1: ruleEmptyExpression EOF
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
    // InternalChessGame.g:319:1: ruleEmptyExpression : ( ( rule__EmptyExpression__Group__0 ) ) ;
    public final void ruleEmptyExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:323:2: ( ( ( rule__EmptyExpression__Group__0 ) ) )
            // InternalChessGame.g:324:2: ( ( rule__EmptyExpression__Group__0 ) )
            {
            // InternalChessGame.g:324:2: ( ( rule__EmptyExpression__Group__0 ) )
            // InternalChessGame.g:325:3: ( rule__EmptyExpression__Group__0 )
            {
             before(grammarAccess.getEmptyExpressionAccess().getGroup()); 
            // InternalChessGame.g:326:3: ( rule__EmptyExpression__Group__0 )
            // InternalChessGame.g:326:4: rule__EmptyExpression__Group__0
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
    // InternalChessGame.g:335:1: entryRuleEndBehaviour : ruleEndBehaviour EOF ;
    public final void entryRuleEndBehaviour() throws RecognitionException {
        try {
            // InternalChessGame.g:336:1: ( ruleEndBehaviour EOF )
            // InternalChessGame.g:337:1: ruleEndBehaviour EOF
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
    // InternalChessGame.g:344:1: ruleEndBehaviour : ( ( rule__EndBehaviour__Group__0 ) ) ;
    public final void ruleEndBehaviour() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:348:2: ( ( ( rule__EndBehaviour__Group__0 ) ) )
            // InternalChessGame.g:349:2: ( ( rule__EndBehaviour__Group__0 ) )
            {
            // InternalChessGame.g:349:2: ( ( rule__EndBehaviour__Group__0 ) )
            // InternalChessGame.g:350:3: ( rule__EndBehaviour__Group__0 )
            {
             before(grammarAccess.getEndBehaviourAccess().getGroup()); 
            // InternalChessGame.g:351:3: ( rule__EndBehaviour__Group__0 )
            // InternalChessGame.g:351:4: rule__EndBehaviour__Group__0
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


    // $ANTLR start "rule__FieldSpecification__NameAlternatives_10_0"
    // InternalChessGame.g:359:1: rule__FieldSpecification__NameAlternatives_10_0 : ( ( 'BlackFirst' ) | ( 'WhiteFirst' ) );
    public final void rule__FieldSpecification__NameAlternatives_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:363:1: ( ( 'BlackFirst' ) | ( 'WhiteFirst' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalChessGame.g:364:2: ( 'BlackFirst' )
                    {
                    // InternalChessGame.g:364:2: ( 'BlackFirst' )
                    // InternalChessGame.g:365:3: 'BlackFirst'
                    {
                     before(grammarAccess.getFieldSpecificationAccess().getNameBlackFirstKeyword_10_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getFieldSpecificationAccess().getNameBlackFirstKeyword_10_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessGame.g:370:2: ( 'WhiteFirst' )
                    {
                    // InternalChessGame.g:370:2: ( 'WhiteFirst' )
                    // InternalChessGame.g:371:3: 'WhiteFirst'
                    {
                     before(grammarAccess.getFieldSpecificationAccess().getNameWhiteFirstKeyword_10_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getFieldSpecificationAccess().getNameWhiteFirstKeyword_10_0_1()); 

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
    // $ANTLR end "rule__FieldSpecification__NameAlternatives_10_0"


    // $ANTLR start "rule__CellDisplaySpec__Alternatives_2"
    // InternalChessGame.g:380:1: rule__CellDisplaySpec__Alternatives_2 : ( ( ( rule__CellDisplaySpec__Group_2_0__0 ) ) | ( ( rule__CellDisplaySpec__Group_2_1__0 ) ) );
    public final void rule__CellDisplaySpec__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:384:1: ( ( ( rule__CellDisplaySpec__Group_2_0__0 ) ) | ( ( rule__CellDisplaySpec__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            else if ( (LA3_0==25) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalChessGame.g:385:2: ( ( rule__CellDisplaySpec__Group_2_0__0 ) )
                    {
                    // InternalChessGame.g:385:2: ( ( rule__CellDisplaySpec__Group_2_0__0 ) )
                    // InternalChessGame.g:386:3: ( rule__CellDisplaySpec__Group_2_0__0 )
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getGroup_2_0()); 
                    // InternalChessGame.g:387:3: ( rule__CellDisplaySpec__Group_2_0__0 )
                    // InternalChessGame.g:387:4: rule__CellDisplaySpec__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CellDisplaySpec__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCellDisplaySpecAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessGame.g:391:2: ( ( rule__CellDisplaySpec__Group_2_1__0 ) )
                    {
                    // InternalChessGame.g:391:2: ( ( rule__CellDisplaySpec__Group_2_1__0 ) )
                    // InternalChessGame.g:392:3: ( rule__CellDisplaySpec__Group_2_1__0 )
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getGroup_2_1()); 
                    // InternalChessGame.g:393:3: ( rule__CellDisplaySpec__Group_2_1__0 )
                    // InternalChessGame.g:393:4: rule__CellDisplaySpec__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CellDisplaySpec__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCellDisplaySpecAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__CellDisplaySpec__Alternatives_2"


    // $ANTLR start "rule__CellDisplaySpec__ColorAlternatives_2_1_2_0"
    // InternalChessGame.g:401:1: rule__CellDisplaySpec__ColorAlternatives_2_1_2_0 : ( ( 'black' ) | ( 'white' ) );
    public final void rule__CellDisplaySpec__ColorAlternatives_2_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:405:1: ( ( 'black' ) | ( 'white' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalChessGame.g:406:2: ( 'black' )
                    {
                    // InternalChessGame.g:406:2: ( 'black' )
                    // InternalChessGame.g:407:3: 'black'
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getColorBlackKeyword_2_1_2_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getCellDisplaySpecAccess().getColorBlackKeyword_2_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChessGame.g:412:2: ( 'white' )
                    {
                    // InternalChessGame.g:412:2: ( 'white' )
                    // InternalChessGame.g:413:3: 'white'
                    {
                     before(grammarAccess.getCellDisplaySpecAccess().getColorWhiteKeyword_2_1_2_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getCellDisplaySpecAccess().getColorWhiteKeyword_2_1_2_0_1()); 

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
    // $ANTLR end "rule__CellDisplaySpec__ColorAlternatives_2_1_2_0"


    // $ANTLR start "rule__MouseTrigger__Alternatives"
    // InternalChessGame.g:422:1: rule__MouseTrigger__Alternatives : ( ( ( rule__MouseTrigger__MouseAssignment_0 ) ) | ( ( rule__MouseTrigger__Group_1__0 ) ) );
    public final void rule__MouseTrigger__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:426:1: ( ( ( rule__MouseTrigger__MouseAssignment_0 ) ) | ( ( rule__MouseTrigger__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==39) ) {
                alt5=1;
            }
            else if ( (LA5_0==29) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalChessGame.g:427:2: ( ( rule__MouseTrigger__MouseAssignment_0 ) )
                    {
                    // InternalChessGame.g:427:2: ( ( rule__MouseTrigger__MouseAssignment_0 ) )
                    // InternalChessGame.g:428:3: ( rule__MouseTrigger__MouseAssignment_0 )
                    {
                     before(grammarAccess.getMouseTriggerAccess().getMouseAssignment_0()); 
                    // InternalChessGame.g:429:3: ( rule__MouseTrigger__MouseAssignment_0 )
                    // InternalChessGame.g:429:4: rule__MouseTrigger__MouseAssignment_0
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
                    // InternalChessGame.g:433:2: ( ( rule__MouseTrigger__Group_1__0 ) )
                    {
                    // InternalChessGame.g:433:2: ( ( rule__MouseTrigger__Group_1__0 ) )
                    // InternalChessGame.g:434:3: ( rule__MouseTrigger__Group_1__0 )
                    {
                     before(grammarAccess.getMouseTriggerAccess().getGroup_1()); 
                    // InternalChessGame.g:435:3: ( rule__MouseTrigger__Group_1__0 )
                    // InternalChessGame.g:435:4: rule__MouseTrigger__Group_1__0
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


    // $ANTLR start "rule__ChessProgram__Group__0"
    // InternalChessGame.g:443:1: rule__ChessProgram__Group__0 : rule__ChessProgram__Group__0__Impl rule__ChessProgram__Group__1 ;
    public final void rule__ChessProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:447:1: ( rule__ChessProgram__Group__0__Impl rule__ChessProgram__Group__1 )
            // InternalChessGame.g:448:2: rule__ChessProgram__Group__0__Impl rule__ChessProgram__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ChessProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChessProgram__Group__1();

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
    // $ANTLR end "rule__ChessProgram__Group__0"


    // $ANTLR start "rule__ChessProgram__Group__0__Impl"
    // InternalChessGame.g:455:1: rule__ChessProgram__Group__0__Impl : ( ( rule__ChessProgram__SizeAssignment_0 ) ) ;
    public final void rule__ChessProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:459:1: ( ( ( rule__ChessProgram__SizeAssignment_0 ) ) )
            // InternalChessGame.g:460:1: ( ( rule__ChessProgram__SizeAssignment_0 ) )
            {
            // InternalChessGame.g:460:1: ( ( rule__ChessProgram__SizeAssignment_0 ) )
            // InternalChessGame.g:461:2: ( rule__ChessProgram__SizeAssignment_0 )
            {
             before(grammarAccess.getChessProgramAccess().getSizeAssignment_0()); 
            // InternalChessGame.g:462:2: ( rule__ChessProgram__SizeAssignment_0 )
            // InternalChessGame.g:462:3: rule__ChessProgram__SizeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ChessProgram__SizeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getChessProgramAccess().getSizeAssignment_0()); 

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
    // $ANTLR end "rule__ChessProgram__Group__0__Impl"


    // $ANTLR start "rule__ChessProgram__Group__1"
    // InternalChessGame.g:470:1: rule__ChessProgram__Group__1 : rule__ChessProgram__Group__1__Impl rule__ChessProgram__Group__2 ;
    public final void rule__ChessProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:474:1: ( rule__ChessProgram__Group__1__Impl rule__ChessProgram__Group__2 )
            // InternalChessGame.g:475:2: rule__ChessProgram__Group__1__Impl rule__ChessProgram__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ChessProgram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChessProgram__Group__2();

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
    // $ANTLR end "rule__ChessProgram__Group__1"


    // $ANTLR start "rule__ChessProgram__Group__1__Impl"
    // InternalChessGame.g:482:1: rule__ChessProgram__Group__1__Impl : ( ( rule__ChessProgram__OptionsAssignment_1 ) ) ;
    public final void rule__ChessProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:486:1: ( ( ( rule__ChessProgram__OptionsAssignment_1 ) ) )
            // InternalChessGame.g:487:1: ( ( rule__ChessProgram__OptionsAssignment_1 ) )
            {
            // InternalChessGame.g:487:1: ( ( rule__ChessProgram__OptionsAssignment_1 ) )
            // InternalChessGame.g:488:2: ( rule__ChessProgram__OptionsAssignment_1 )
            {
             before(grammarAccess.getChessProgramAccess().getOptionsAssignment_1()); 
            // InternalChessGame.g:489:2: ( rule__ChessProgram__OptionsAssignment_1 )
            // InternalChessGame.g:489:3: rule__ChessProgram__OptionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ChessProgram__OptionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChessProgramAccess().getOptionsAssignment_1()); 

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
    // $ANTLR end "rule__ChessProgram__Group__1__Impl"


    // $ANTLR start "rule__ChessProgram__Group__2"
    // InternalChessGame.g:497:1: rule__ChessProgram__Group__2 : rule__ChessProgram__Group__2__Impl ;
    public final void rule__ChessProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:501:1: ( rule__ChessProgram__Group__2__Impl )
            // InternalChessGame.g:502:2: rule__ChessProgram__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChessProgram__Group__2__Impl();

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
    // $ANTLR end "rule__ChessProgram__Group__2"


    // $ANTLR start "rule__ChessProgram__Group__2__Impl"
    // InternalChessGame.g:508:1: rule__ChessProgram__Group__2__Impl : ( ( rule__ChessProgram__EndGameAssignment_2 ) ) ;
    public final void rule__ChessProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:512:1: ( ( ( rule__ChessProgram__EndGameAssignment_2 ) ) )
            // InternalChessGame.g:513:1: ( ( rule__ChessProgram__EndGameAssignment_2 ) )
            {
            // InternalChessGame.g:513:1: ( ( rule__ChessProgram__EndGameAssignment_2 ) )
            // InternalChessGame.g:514:2: ( rule__ChessProgram__EndGameAssignment_2 )
            {
             before(grammarAccess.getChessProgramAccess().getEndGameAssignment_2()); 
            // InternalChessGame.g:515:2: ( rule__ChessProgram__EndGameAssignment_2 )
            // InternalChessGame.g:515:3: rule__ChessProgram__EndGameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ChessProgram__EndGameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChessProgramAccess().getEndGameAssignment_2()); 

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
    // $ANTLR end "rule__ChessProgram__Group__2__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__0"
    // InternalChessGame.g:524:1: rule__FieldSpecification__Group__0 : rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1 ;
    public final void rule__FieldSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:528:1: ( rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1 )
            // InternalChessGame.g:529:2: rule__FieldSpecification__Group__0__Impl rule__FieldSpecification__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalChessGame.g:536:1: rule__FieldSpecification__Group__0__Impl : ( 'field' ) ;
    public final void rule__FieldSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:540:1: ( ( 'field' ) )
            // InternalChessGame.g:541:1: ( 'field' )
            {
            // InternalChessGame.g:541:1: ( 'field' )
            // InternalChessGame.g:542:2: 'field'
            {
             before(grammarAccess.getFieldSpecificationAccess().getFieldKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalChessGame.g:551:1: rule__FieldSpecification__Group__1 : rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2 ;
    public final void rule__FieldSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:555:1: ( rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2 )
            // InternalChessGame.g:556:2: rule__FieldSpecification__Group__1__Impl rule__FieldSpecification__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalChessGame.g:563:1: rule__FieldSpecification__Group__1__Impl : ( '{' ) ;
    public final void rule__FieldSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:567:1: ( ( '{' ) )
            // InternalChessGame.g:568:1: ( '{' )
            {
            // InternalChessGame.g:568:1: ( '{' )
            // InternalChessGame.g:569:2: '{'
            {
             before(grammarAccess.getFieldSpecificationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalChessGame.g:578:1: rule__FieldSpecification__Group__2 : rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3 ;
    public final void rule__FieldSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:582:1: ( rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3 )
            // InternalChessGame.g:583:2: rule__FieldSpecification__Group__2__Impl rule__FieldSpecification__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalChessGame.g:590:1: rule__FieldSpecification__Group__2__Impl : ( 'width' ) ;
    public final void rule__FieldSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:594:1: ( ( 'width' ) )
            // InternalChessGame.g:595:1: ( 'width' )
            {
            // InternalChessGame.g:595:1: ( 'width' )
            // InternalChessGame.g:596:2: 'width'
            {
             before(grammarAccess.getFieldSpecificationAccess().getWidthKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalChessGame.g:605:1: rule__FieldSpecification__Group__3 : rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4 ;
    public final void rule__FieldSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:609:1: ( rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4 )
            // InternalChessGame.g:610:2: rule__FieldSpecification__Group__3__Impl rule__FieldSpecification__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalChessGame.g:617:1: rule__FieldSpecification__Group__3__Impl : ( '=' ) ;
    public final void rule__FieldSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:621:1: ( ( '=' ) )
            // InternalChessGame.g:622:1: ( '=' )
            {
            // InternalChessGame.g:622:1: ( '=' )
            // InternalChessGame.g:623:2: '='
            {
             before(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalChessGame.g:632:1: rule__FieldSpecification__Group__4 : rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5 ;
    public final void rule__FieldSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:636:1: ( rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5 )
            // InternalChessGame.g:637:2: rule__FieldSpecification__Group__4__Impl rule__FieldSpecification__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalChessGame.g:644:1: rule__FieldSpecification__Group__4__Impl : ( ( rule__FieldSpecification__WidthAssignment_4 ) ) ;
    public final void rule__FieldSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:648:1: ( ( ( rule__FieldSpecification__WidthAssignment_4 ) ) )
            // InternalChessGame.g:649:1: ( ( rule__FieldSpecification__WidthAssignment_4 ) )
            {
            // InternalChessGame.g:649:1: ( ( rule__FieldSpecification__WidthAssignment_4 ) )
            // InternalChessGame.g:650:2: ( rule__FieldSpecification__WidthAssignment_4 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getWidthAssignment_4()); 
            // InternalChessGame.g:651:2: ( rule__FieldSpecification__WidthAssignment_4 )
            // InternalChessGame.g:651:3: rule__FieldSpecification__WidthAssignment_4
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
    // InternalChessGame.g:659:1: rule__FieldSpecification__Group__5 : rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6 ;
    public final void rule__FieldSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:663:1: ( rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6 )
            // InternalChessGame.g:664:2: rule__FieldSpecification__Group__5__Impl rule__FieldSpecification__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalChessGame.g:671:1: rule__FieldSpecification__Group__5__Impl : ( 'height' ) ;
    public final void rule__FieldSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:675:1: ( ( 'height' ) )
            // InternalChessGame.g:676:1: ( 'height' )
            {
            // InternalChessGame.g:676:1: ( 'height' )
            // InternalChessGame.g:677:2: 'height'
            {
             before(grammarAccess.getFieldSpecificationAccess().getHeightKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalChessGame.g:686:1: rule__FieldSpecification__Group__6 : rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7 ;
    public final void rule__FieldSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:690:1: ( rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7 )
            // InternalChessGame.g:691:2: rule__FieldSpecification__Group__6__Impl rule__FieldSpecification__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalChessGame.g:698:1: rule__FieldSpecification__Group__6__Impl : ( '=' ) ;
    public final void rule__FieldSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:702:1: ( ( '=' ) )
            // InternalChessGame.g:703:1: ( '=' )
            {
            // InternalChessGame.g:703:1: ( '=' )
            // InternalChessGame.g:704:2: '='
            {
             before(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_6()); 
            match(input,18,FOLLOW_2); 
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
    // InternalChessGame.g:713:1: rule__FieldSpecification__Group__7 : rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8 ;
    public final void rule__FieldSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:717:1: ( rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8 )
            // InternalChessGame.g:718:2: rule__FieldSpecification__Group__7__Impl rule__FieldSpecification__Group__8
            {
            pushFollow(FOLLOW_11);
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
    // InternalChessGame.g:725:1: rule__FieldSpecification__Group__7__Impl : ( ( rule__FieldSpecification__HeightAssignment_7 ) ) ;
    public final void rule__FieldSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:729:1: ( ( ( rule__FieldSpecification__HeightAssignment_7 ) ) )
            // InternalChessGame.g:730:1: ( ( rule__FieldSpecification__HeightAssignment_7 ) )
            {
            // InternalChessGame.g:730:1: ( ( rule__FieldSpecification__HeightAssignment_7 ) )
            // InternalChessGame.g:731:2: ( rule__FieldSpecification__HeightAssignment_7 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getHeightAssignment_7()); 
            // InternalChessGame.g:732:2: ( rule__FieldSpecification__HeightAssignment_7 )
            // InternalChessGame.g:732:3: rule__FieldSpecification__HeightAssignment_7
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
    // InternalChessGame.g:740:1: rule__FieldSpecification__Group__8 : rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9 ;
    public final void rule__FieldSpecification__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:744:1: ( rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9 )
            // InternalChessGame.g:745:2: rule__FieldSpecification__Group__8__Impl rule__FieldSpecification__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__FieldSpecification__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__9();

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
    // InternalChessGame.g:752:1: rule__FieldSpecification__Group__8__Impl : ( 'FirstPlayer' ) ;
    public final void rule__FieldSpecification__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:756:1: ( ( 'FirstPlayer' ) )
            // InternalChessGame.g:757:1: ( 'FirstPlayer' )
            {
            // InternalChessGame.g:757:1: ( 'FirstPlayer' )
            // InternalChessGame.g:758:2: 'FirstPlayer'
            {
             before(grammarAccess.getFieldSpecificationAccess().getFirstPlayerKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFieldSpecificationAccess().getFirstPlayerKeyword_8()); 

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


    // $ANTLR start "rule__FieldSpecification__Group__9"
    // InternalChessGame.g:767:1: rule__FieldSpecification__Group__9 : rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10 ;
    public final void rule__FieldSpecification__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:771:1: ( rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10 )
            // InternalChessGame.g:772:2: rule__FieldSpecification__Group__9__Impl rule__FieldSpecification__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__FieldSpecification__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__10();

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
    // $ANTLR end "rule__FieldSpecification__Group__9"


    // $ANTLR start "rule__FieldSpecification__Group__9__Impl"
    // InternalChessGame.g:779:1: rule__FieldSpecification__Group__9__Impl : ( '=' ) ;
    public final void rule__FieldSpecification__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:783:1: ( ( '=' ) )
            // InternalChessGame.g:784:1: ( '=' )
            {
            // InternalChessGame.g:784:1: ( '=' )
            // InternalChessGame.g:785:2: '='
            {
             before(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_9()); 

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
    // $ANTLR end "rule__FieldSpecification__Group__9__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__10"
    // InternalChessGame.g:794:1: rule__FieldSpecification__Group__10 : rule__FieldSpecification__Group__10__Impl rule__FieldSpecification__Group__11 ;
    public final void rule__FieldSpecification__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:798:1: ( rule__FieldSpecification__Group__10__Impl rule__FieldSpecification__Group__11 )
            // InternalChessGame.g:799:2: rule__FieldSpecification__Group__10__Impl rule__FieldSpecification__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__FieldSpecification__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__11();

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
    // $ANTLR end "rule__FieldSpecification__Group__10"


    // $ANTLR start "rule__FieldSpecification__Group__10__Impl"
    // InternalChessGame.g:806:1: rule__FieldSpecification__Group__10__Impl : ( ( rule__FieldSpecification__NameAssignment_10 ) ) ;
    public final void rule__FieldSpecification__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:810:1: ( ( ( rule__FieldSpecification__NameAssignment_10 ) ) )
            // InternalChessGame.g:811:1: ( ( rule__FieldSpecification__NameAssignment_10 ) )
            {
            // InternalChessGame.g:811:1: ( ( rule__FieldSpecification__NameAssignment_10 ) )
            // InternalChessGame.g:812:2: ( rule__FieldSpecification__NameAssignment_10 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getNameAssignment_10()); 
            // InternalChessGame.g:813:2: ( rule__FieldSpecification__NameAssignment_10 )
            // InternalChessGame.g:813:3: rule__FieldSpecification__NameAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__FieldSpecification__NameAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getFieldSpecificationAccess().getNameAssignment_10()); 

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
    // $ANTLR end "rule__FieldSpecification__Group__10__Impl"


    // $ANTLR start "rule__FieldSpecification__Group__11"
    // InternalChessGame.g:821:1: rule__FieldSpecification__Group__11 : rule__FieldSpecification__Group__11__Impl ;
    public final void rule__FieldSpecification__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:825:1: ( rule__FieldSpecification__Group__11__Impl )
            // InternalChessGame.g:826:2: rule__FieldSpecification__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldSpecification__Group__11__Impl();

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
    // $ANTLR end "rule__FieldSpecification__Group__11"


    // $ANTLR start "rule__FieldSpecification__Group__11__Impl"
    // InternalChessGame.g:832:1: rule__FieldSpecification__Group__11__Impl : ( '}' ) ;
    public final void rule__FieldSpecification__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:836:1: ( ( '}' ) )
            // InternalChessGame.g:837:1: ( '}' )
            {
            // InternalChessGame.g:837:1: ( '}' )
            // InternalChessGame.g:838:2: '}'
            {
             before(grammarAccess.getFieldSpecificationAccess().getRightCurlyBracketKeyword_11()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFieldSpecificationAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__FieldSpecification__Group__11__Impl"


    // $ANTLR start "rule__CellState__Group__0"
    // InternalChessGame.g:848:1: rule__CellState__Group__0 : rule__CellState__Group__0__Impl rule__CellState__Group__1 ;
    public final void rule__CellState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:852:1: ( rule__CellState__Group__0__Impl rule__CellState__Group__1 )
            // InternalChessGame.g:853:2: rule__CellState__Group__0__Impl rule__CellState__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalChessGame.g:860:1: rule__CellState__Group__0__Impl : ( ( rule__CellState__NameAssignment_0 ) ) ;
    public final void rule__CellState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:864:1: ( ( ( rule__CellState__NameAssignment_0 ) ) )
            // InternalChessGame.g:865:1: ( ( rule__CellState__NameAssignment_0 ) )
            {
            // InternalChessGame.g:865:1: ( ( rule__CellState__NameAssignment_0 ) )
            // InternalChessGame.g:866:2: ( rule__CellState__NameAssignment_0 )
            {
             before(grammarAccess.getCellStateAccess().getNameAssignment_0()); 
            // InternalChessGame.g:867:2: ( rule__CellState__NameAssignment_0 )
            // InternalChessGame.g:867:3: rule__CellState__NameAssignment_0
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
    // InternalChessGame.g:875:1: rule__CellState__Group__1 : rule__CellState__Group__1__Impl rule__CellState__Group__2 ;
    public final void rule__CellState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:879:1: ( rule__CellState__Group__1__Impl rule__CellState__Group__2 )
            // InternalChessGame.g:880:2: rule__CellState__Group__1__Impl rule__CellState__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalChessGame.g:887:1: rule__CellState__Group__1__Impl : ( '{' ) ;
    public final void rule__CellState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:891:1: ( ( '{' ) )
            // InternalChessGame.g:892:1: ( '{' )
            {
            // InternalChessGame.g:892:1: ( '{' )
            // InternalChessGame.g:893:2: '{'
            {
             before(grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalChessGame.g:902:1: rule__CellState__Group__2 : rule__CellState__Group__2__Impl rule__CellState__Group__3 ;
    public final void rule__CellState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:906:1: ( rule__CellState__Group__2__Impl rule__CellState__Group__3 )
            // InternalChessGame.g:907:2: rule__CellState__Group__2__Impl rule__CellState__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalChessGame.g:914:1: rule__CellState__Group__2__Impl : ( ( rule__CellState__DisplayAssignment_2 ) ) ;
    public final void rule__CellState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:918:1: ( ( ( rule__CellState__DisplayAssignment_2 ) ) )
            // InternalChessGame.g:919:1: ( ( rule__CellState__DisplayAssignment_2 ) )
            {
            // InternalChessGame.g:919:1: ( ( rule__CellState__DisplayAssignment_2 ) )
            // InternalChessGame.g:920:2: ( rule__CellState__DisplayAssignment_2 )
            {
             before(grammarAccess.getCellStateAccess().getDisplayAssignment_2()); 
            // InternalChessGame.g:921:2: ( rule__CellState__DisplayAssignment_2 )
            // InternalChessGame.g:921:3: rule__CellState__DisplayAssignment_2
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
    // InternalChessGame.g:929:1: rule__CellState__Group__3 : rule__CellState__Group__3__Impl rule__CellState__Group__4 ;
    public final void rule__CellState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:933:1: ( rule__CellState__Group__3__Impl rule__CellState__Group__4 )
            // InternalChessGame.g:934:2: rule__CellState__Group__3__Impl rule__CellState__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalChessGame.g:941:1: rule__CellState__Group__3__Impl : ( ( rule__CellState__Group_3__0 )? ) ;
    public final void rule__CellState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:945:1: ( ( ( rule__CellState__Group_3__0 )? ) )
            // InternalChessGame.g:946:1: ( ( rule__CellState__Group_3__0 )? )
            {
            // InternalChessGame.g:946:1: ( ( rule__CellState__Group_3__0 )? )
            // InternalChessGame.g:947:2: ( rule__CellState__Group_3__0 )?
            {
             before(grammarAccess.getCellStateAccess().getGroup_3()); 
            // InternalChessGame.g:948:2: ( rule__CellState__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalChessGame.g:948:3: rule__CellState__Group_3__0
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
    // InternalChessGame.g:956:1: rule__CellState__Group__4 : rule__CellState__Group__4__Impl ;
    public final void rule__CellState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:960:1: ( rule__CellState__Group__4__Impl )
            // InternalChessGame.g:961:2: rule__CellState__Group__4__Impl
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
    // InternalChessGame.g:967:1: rule__CellState__Group__4__Impl : ( '}' ) ;
    public final void rule__CellState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:971:1: ( ( '}' ) )
            // InternalChessGame.g:972:1: ( '}' )
            {
            // InternalChessGame.g:972:1: ( '}' )
            // InternalChessGame.g:973:2: '}'
            {
             before(grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
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
    // InternalChessGame.g:983:1: rule__CellState__Group_3__0 : rule__CellState__Group_3__0__Impl rule__CellState__Group_3__1 ;
    public final void rule__CellState__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:987:1: ( rule__CellState__Group_3__0__Impl rule__CellState__Group_3__1 )
            // InternalChessGame.g:988:2: rule__CellState__Group_3__0__Impl rule__CellState__Group_3__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalChessGame.g:995:1: rule__CellState__Group_3__0__Impl : ( 'transitions' ) ;
    public final void rule__CellState__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:999:1: ( ( 'transitions' ) )
            // InternalChessGame.g:1000:1: ( 'transitions' )
            {
            // InternalChessGame.g:1000:1: ( 'transitions' )
            // InternalChessGame.g:1001:2: 'transitions'
            {
             before(grammarAccess.getCellStateAccess().getTransitionsKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalChessGame.g:1010:1: rule__CellState__Group_3__1 : rule__CellState__Group_3__1__Impl rule__CellState__Group_3__2 ;
    public final void rule__CellState__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1014:1: ( rule__CellState__Group_3__1__Impl rule__CellState__Group_3__2 )
            // InternalChessGame.g:1015:2: rule__CellState__Group_3__1__Impl rule__CellState__Group_3__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalChessGame.g:1022:1: rule__CellState__Group_3__1__Impl : ( '{' ) ;
    public final void rule__CellState__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1026:1: ( ( '{' ) )
            // InternalChessGame.g:1027:1: ( '{' )
            {
            // InternalChessGame.g:1027:1: ( '{' )
            // InternalChessGame.g:1028:2: '{'
            {
             before(grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalChessGame.g:1037:1: rule__CellState__Group_3__2 : rule__CellState__Group_3__2__Impl rule__CellState__Group_3__3 ;
    public final void rule__CellState__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1041:1: ( rule__CellState__Group_3__2__Impl rule__CellState__Group_3__3 )
            // InternalChessGame.g:1042:2: rule__CellState__Group_3__2__Impl rule__CellState__Group_3__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalChessGame.g:1049:1: rule__CellState__Group_3__2__Impl : ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) ) ;
    public final void rule__CellState__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1053:1: ( ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) ) )
            // InternalChessGame.g:1054:1: ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) )
            {
            // InternalChessGame.g:1054:1: ( ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* ) )
            // InternalChessGame.g:1055:2: ( ( rule__CellState__TransitionsAssignment_3_2 ) ) ( ( rule__CellState__TransitionsAssignment_3_2 )* )
            {
            // InternalChessGame.g:1055:2: ( ( rule__CellState__TransitionsAssignment_3_2 ) )
            // InternalChessGame.g:1056:3: ( rule__CellState__TransitionsAssignment_3_2 )
            {
             before(grammarAccess.getCellStateAccess().getTransitionsAssignment_3_2()); 
            // InternalChessGame.g:1057:3: ( rule__CellState__TransitionsAssignment_3_2 )
            // InternalChessGame.g:1057:4: rule__CellState__TransitionsAssignment_3_2
            {
            pushFollow(FOLLOW_17);
            rule__CellState__TransitionsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getCellStateAccess().getTransitionsAssignment_3_2()); 

            }

            // InternalChessGame.g:1060:2: ( ( rule__CellState__TransitionsAssignment_3_2 )* )
            // InternalChessGame.g:1061:3: ( rule__CellState__TransitionsAssignment_3_2 )*
            {
             before(grammarAccess.getCellStateAccess().getTransitionsAssignment_3_2()); 
            // InternalChessGame.g:1062:3: ( rule__CellState__TransitionsAssignment_3_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalChessGame.g:1062:4: rule__CellState__TransitionsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalChessGame.g:1071:1: rule__CellState__Group_3__3 : rule__CellState__Group_3__3__Impl ;
    public final void rule__CellState__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1075:1: ( rule__CellState__Group_3__3__Impl )
            // InternalChessGame.g:1076:2: rule__CellState__Group_3__3__Impl
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
    // InternalChessGame.g:1082:1: rule__CellState__Group_3__3__Impl : ( '}' ) ;
    public final void rule__CellState__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1086:1: ( ( '}' ) )
            // InternalChessGame.g:1087:1: ( '}' )
            {
            // InternalChessGame.g:1087:1: ( '}' )
            // InternalChessGame.g:1088:2: '}'
            {
             before(grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,21,FOLLOW_2); 
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


    // $ANTLR start "rule__CellDisplaySpec__Group__0"
    // InternalChessGame.g:1098:1: rule__CellDisplaySpec__Group__0 : rule__CellDisplaySpec__Group__0__Impl rule__CellDisplaySpec__Group__1 ;
    public final void rule__CellDisplaySpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1102:1: ( rule__CellDisplaySpec__Group__0__Impl rule__CellDisplaySpec__Group__1 )
            // InternalChessGame.g:1103:2: rule__CellDisplaySpec__Group__0__Impl rule__CellDisplaySpec__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CellDisplaySpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellDisplaySpec__Group__1();

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
    // $ANTLR end "rule__CellDisplaySpec__Group__0"


    // $ANTLR start "rule__CellDisplaySpec__Group__0__Impl"
    // InternalChessGame.g:1110:1: rule__CellDisplaySpec__Group__0__Impl : ( 'display' ) ;
    public final void rule__CellDisplaySpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1114:1: ( ( 'display' ) )
            // InternalChessGame.g:1115:1: ( 'display' )
            {
            // InternalChessGame.g:1115:1: ( 'display' )
            // InternalChessGame.g:1116:2: 'display'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getDisplayKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCellDisplaySpecAccess().getDisplayKeyword_0()); 

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
    // $ANTLR end "rule__CellDisplaySpec__Group__0__Impl"


    // $ANTLR start "rule__CellDisplaySpec__Group__1"
    // InternalChessGame.g:1125:1: rule__CellDisplaySpec__Group__1 : rule__CellDisplaySpec__Group__1__Impl rule__CellDisplaySpec__Group__2 ;
    public final void rule__CellDisplaySpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1129:1: ( rule__CellDisplaySpec__Group__1__Impl rule__CellDisplaySpec__Group__2 )
            // InternalChessGame.g:1130:2: rule__CellDisplaySpec__Group__1__Impl rule__CellDisplaySpec__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__CellDisplaySpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellDisplaySpec__Group__2();

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
    // $ANTLR end "rule__CellDisplaySpec__Group__1"


    // $ANTLR start "rule__CellDisplaySpec__Group__1__Impl"
    // InternalChessGame.g:1137:1: rule__CellDisplaySpec__Group__1__Impl : ( '{' ) ;
    public final void rule__CellDisplaySpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1141:1: ( ( '{' ) )
            // InternalChessGame.g:1142:1: ( '{' )
            {
            // InternalChessGame.g:1142:1: ( '{' )
            // InternalChessGame.g:1143:2: '{'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCellDisplaySpecAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__CellDisplaySpec__Group__1__Impl"


    // $ANTLR start "rule__CellDisplaySpec__Group__2"
    // InternalChessGame.g:1152:1: rule__CellDisplaySpec__Group__2 : rule__CellDisplaySpec__Group__2__Impl rule__CellDisplaySpec__Group__3 ;
    public final void rule__CellDisplaySpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1156:1: ( rule__CellDisplaySpec__Group__2__Impl rule__CellDisplaySpec__Group__3 )
            // InternalChessGame.g:1157:2: rule__CellDisplaySpec__Group__2__Impl rule__CellDisplaySpec__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__CellDisplaySpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellDisplaySpec__Group__3();

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
    // $ANTLR end "rule__CellDisplaySpec__Group__2"


    // $ANTLR start "rule__CellDisplaySpec__Group__2__Impl"
    // InternalChessGame.g:1164:1: rule__CellDisplaySpec__Group__2__Impl : ( ( rule__CellDisplaySpec__Alternatives_2 ) ) ;
    public final void rule__CellDisplaySpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1168:1: ( ( ( rule__CellDisplaySpec__Alternatives_2 ) ) )
            // InternalChessGame.g:1169:1: ( ( rule__CellDisplaySpec__Alternatives_2 ) )
            {
            // InternalChessGame.g:1169:1: ( ( rule__CellDisplaySpec__Alternatives_2 ) )
            // InternalChessGame.g:1170:2: ( rule__CellDisplaySpec__Alternatives_2 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getAlternatives_2()); 
            // InternalChessGame.g:1171:2: ( rule__CellDisplaySpec__Alternatives_2 )
            // InternalChessGame.g:1171:3: rule__CellDisplaySpec__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__CellDisplaySpec__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getCellDisplaySpecAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__CellDisplaySpec__Group__2__Impl"


    // $ANTLR start "rule__CellDisplaySpec__Group__3"
    // InternalChessGame.g:1179:1: rule__CellDisplaySpec__Group__3 : rule__CellDisplaySpec__Group__3__Impl ;
    public final void rule__CellDisplaySpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1183:1: ( rule__CellDisplaySpec__Group__3__Impl )
            // InternalChessGame.g:1184:2: rule__CellDisplaySpec__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CellDisplaySpec__Group__3__Impl();

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
    // $ANTLR end "rule__CellDisplaySpec__Group__3"


    // $ANTLR start "rule__CellDisplaySpec__Group__3__Impl"
    // InternalChessGame.g:1190:1: rule__CellDisplaySpec__Group__3__Impl : ( '}' ) ;
    public final void rule__CellDisplaySpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1194:1: ( ( '}' ) )
            // InternalChessGame.g:1195:1: ( '}' )
            {
            // InternalChessGame.g:1195:1: ( '}' )
            // InternalChessGame.g:1196:2: '}'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getRightCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCellDisplaySpecAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__CellDisplaySpec__Group__3__Impl"


    // $ANTLR start "rule__CellDisplaySpec__Group_2_0__0"
    // InternalChessGame.g:1206:1: rule__CellDisplaySpec__Group_2_0__0 : rule__CellDisplaySpec__Group_2_0__0__Impl rule__CellDisplaySpec__Group_2_0__1 ;
    public final void rule__CellDisplaySpec__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1210:1: ( rule__CellDisplaySpec__Group_2_0__0__Impl rule__CellDisplaySpec__Group_2_0__1 )
            // InternalChessGame.g:1211:2: rule__CellDisplaySpec__Group_2_0__0__Impl rule__CellDisplaySpec__Group_2_0__1
            {
            pushFollow(FOLLOW_8);
            rule__CellDisplaySpec__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellDisplaySpec__Group_2_0__1();

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
    // $ANTLR end "rule__CellDisplaySpec__Group_2_0__0"


    // $ANTLR start "rule__CellDisplaySpec__Group_2_0__0__Impl"
    // InternalChessGame.g:1218:1: rule__CellDisplaySpec__Group_2_0__0__Impl : ( 'text' ) ;
    public final void rule__CellDisplaySpec__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1222:1: ( ( 'text' ) )
            // InternalChessGame.g:1223:1: ( 'text' )
            {
            // InternalChessGame.g:1223:1: ( 'text' )
            // InternalChessGame.g:1224:2: 'text'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getTextKeyword_2_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCellDisplaySpecAccess().getTextKeyword_2_0_0()); 

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
    // $ANTLR end "rule__CellDisplaySpec__Group_2_0__0__Impl"


    // $ANTLR start "rule__CellDisplaySpec__Group_2_0__1"
    // InternalChessGame.g:1233:1: rule__CellDisplaySpec__Group_2_0__1 : rule__CellDisplaySpec__Group_2_0__1__Impl rule__CellDisplaySpec__Group_2_0__2 ;
    public final void rule__CellDisplaySpec__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1237:1: ( rule__CellDisplaySpec__Group_2_0__1__Impl rule__CellDisplaySpec__Group_2_0__2 )
            // InternalChessGame.g:1238:2: rule__CellDisplaySpec__Group_2_0__1__Impl rule__CellDisplaySpec__Group_2_0__2
            {
            pushFollow(FOLLOW_19);
            rule__CellDisplaySpec__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellDisplaySpec__Group_2_0__2();

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
    // $ANTLR end "rule__CellDisplaySpec__Group_2_0__1"


    // $ANTLR start "rule__CellDisplaySpec__Group_2_0__1__Impl"
    // InternalChessGame.g:1245:1: rule__CellDisplaySpec__Group_2_0__1__Impl : ( '=' ) ;
    public final void rule__CellDisplaySpec__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1249:1: ( ( '=' ) )
            // InternalChessGame.g:1250:1: ( '=' )
            {
            // InternalChessGame.g:1250:1: ( '=' )
            // InternalChessGame.g:1251:2: '='
            {
             before(grammarAccess.getCellDisplaySpecAccess().getEqualsSignKeyword_2_0_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCellDisplaySpecAccess().getEqualsSignKeyword_2_0_1()); 

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
    // $ANTLR end "rule__CellDisplaySpec__Group_2_0__1__Impl"


    // $ANTLR start "rule__CellDisplaySpec__Group_2_0__2"
    // InternalChessGame.g:1260:1: rule__CellDisplaySpec__Group_2_0__2 : rule__CellDisplaySpec__Group_2_0__2__Impl ;
    public final void rule__CellDisplaySpec__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1264:1: ( rule__CellDisplaySpec__Group_2_0__2__Impl )
            // InternalChessGame.g:1265:2: rule__CellDisplaySpec__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CellDisplaySpec__Group_2_0__2__Impl();

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
    // $ANTLR end "rule__CellDisplaySpec__Group_2_0__2"


    // $ANTLR start "rule__CellDisplaySpec__Group_2_0__2__Impl"
    // InternalChessGame.g:1271:1: rule__CellDisplaySpec__Group_2_0__2__Impl : ( ( rule__CellDisplaySpec__TextAssignment_2_0_2 ) ) ;
    public final void rule__CellDisplaySpec__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1275:1: ( ( ( rule__CellDisplaySpec__TextAssignment_2_0_2 ) ) )
            // InternalChessGame.g:1276:1: ( ( rule__CellDisplaySpec__TextAssignment_2_0_2 ) )
            {
            // InternalChessGame.g:1276:1: ( ( rule__CellDisplaySpec__TextAssignment_2_0_2 ) )
            // InternalChessGame.g:1277:2: ( rule__CellDisplaySpec__TextAssignment_2_0_2 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getTextAssignment_2_0_2()); 
            // InternalChessGame.g:1278:2: ( rule__CellDisplaySpec__TextAssignment_2_0_2 )
            // InternalChessGame.g:1278:3: rule__CellDisplaySpec__TextAssignment_2_0_2
            {
            pushFollow(FOLLOW_2);
            rule__CellDisplaySpec__TextAssignment_2_0_2();

            state._fsp--;


            }

             after(grammarAccess.getCellDisplaySpecAccess().getTextAssignment_2_0_2()); 

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
    // $ANTLR end "rule__CellDisplaySpec__Group_2_0__2__Impl"


    // $ANTLR start "rule__CellDisplaySpec__Group_2_1__0"
    // InternalChessGame.g:1287:1: rule__CellDisplaySpec__Group_2_1__0 : rule__CellDisplaySpec__Group_2_1__0__Impl rule__CellDisplaySpec__Group_2_1__1 ;
    public final void rule__CellDisplaySpec__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1291:1: ( rule__CellDisplaySpec__Group_2_1__0__Impl rule__CellDisplaySpec__Group_2_1__1 )
            // InternalChessGame.g:1292:2: rule__CellDisplaySpec__Group_2_1__0__Impl rule__CellDisplaySpec__Group_2_1__1
            {
            pushFollow(FOLLOW_8);
            rule__CellDisplaySpec__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellDisplaySpec__Group_2_1__1();

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
    // $ANTLR end "rule__CellDisplaySpec__Group_2_1__0"


    // $ANTLR start "rule__CellDisplaySpec__Group_2_1__0__Impl"
    // InternalChessGame.g:1299:1: rule__CellDisplaySpec__Group_2_1__0__Impl : ( 'color' ) ;
    public final void rule__CellDisplaySpec__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1303:1: ( ( 'color' ) )
            // InternalChessGame.g:1304:1: ( 'color' )
            {
            // InternalChessGame.g:1304:1: ( 'color' )
            // InternalChessGame.g:1305:2: 'color'
            {
             before(grammarAccess.getCellDisplaySpecAccess().getColorKeyword_2_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCellDisplaySpecAccess().getColorKeyword_2_1_0()); 

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
    // $ANTLR end "rule__CellDisplaySpec__Group_2_1__0__Impl"


    // $ANTLR start "rule__CellDisplaySpec__Group_2_1__1"
    // InternalChessGame.g:1314:1: rule__CellDisplaySpec__Group_2_1__1 : rule__CellDisplaySpec__Group_2_1__1__Impl rule__CellDisplaySpec__Group_2_1__2 ;
    public final void rule__CellDisplaySpec__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1318:1: ( rule__CellDisplaySpec__Group_2_1__1__Impl rule__CellDisplaySpec__Group_2_1__2 )
            // InternalChessGame.g:1319:2: rule__CellDisplaySpec__Group_2_1__1__Impl rule__CellDisplaySpec__Group_2_1__2
            {
            pushFollow(FOLLOW_20);
            rule__CellDisplaySpec__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CellDisplaySpec__Group_2_1__2();

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
    // $ANTLR end "rule__CellDisplaySpec__Group_2_1__1"


    // $ANTLR start "rule__CellDisplaySpec__Group_2_1__1__Impl"
    // InternalChessGame.g:1326:1: rule__CellDisplaySpec__Group_2_1__1__Impl : ( '=' ) ;
    public final void rule__CellDisplaySpec__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1330:1: ( ( '=' ) )
            // InternalChessGame.g:1331:1: ( '=' )
            {
            // InternalChessGame.g:1331:1: ( '=' )
            // InternalChessGame.g:1332:2: '='
            {
             before(grammarAccess.getCellDisplaySpecAccess().getEqualsSignKeyword_2_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCellDisplaySpecAccess().getEqualsSignKeyword_2_1_1()); 

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
    // $ANTLR end "rule__CellDisplaySpec__Group_2_1__1__Impl"


    // $ANTLR start "rule__CellDisplaySpec__Group_2_1__2"
    // InternalChessGame.g:1341:1: rule__CellDisplaySpec__Group_2_1__2 : rule__CellDisplaySpec__Group_2_1__2__Impl ;
    public final void rule__CellDisplaySpec__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1345:1: ( rule__CellDisplaySpec__Group_2_1__2__Impl )
            // InternalChessGame.g:1346:2: rule__CellDisplaySpec__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CellDisplaySpec__Group_2_1__2__Impl();

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
    // $ANTLR end "rule__CellDisplaySpec__Group_2_1__2"


    // $ANTLR start "rule__CellDisplaySpec__Group_2_1__2__Impl"
    // InternalChessGame.g:1352:1: rule__CellDisplaySpec__Group_2_1__2__Impl : ( ( rule__CellDisplaySpec__ColorAssignment_2_1_2 ) ) ;
    public final void rule__CellDisplaySpec__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1356:1: ( ( ( rule__CellDisplaySpec__ColorAssignment_2_1_2 ) ) )
            // InternalChessGame.g:1357:1: ( ( rule__CellDisplaySpec__ColorAssignment_2_1_2 ) )
            {
            // InternalChessGame.g:1357:1: ( ( rule__CellDisplaySpec__ColorAssignment_2_1_2 ) )
            // InternalChessGame.g:1358:2: ( rule__CellDisplaySpec__ColorAssignment_2_1_2 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getColorAssignment_2_1_2()); 
            // InternalChessGame.g:1359:2: ( rule__CellDisplaySpec__ColorAssignment_2_1_2 )
            // InternalChessGame.g:1359:3: rule__CellDisplaySpec__ColorAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__CellDisplaySpec__ColorAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCellDisplaySpecAccess().getColorAssignment_2_1_2()); 

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
    // $ANTLR end "rule__CellDisplaySpec__Group_2_1__2__Impl"


    // $ANTLR start "rule__TransitionSpec__Group__0"
    // InternalChessGame.g:1368:1: rule__TransitionSpec__Group__0 : rule__TransitionSpec__Group__0__Impl rule__TransitionSpec__Group__1 ;
    public final void rule__TransitionSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1372:1: ( rule__TransitionSpec__Group__0__Impl rule__TransitionSpec__Group__1 )
            // InternalChessGame.g:1373:2: rule__TransitionSpec__Group__0__Impl rule__TransitionSpec__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__TransitionSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionSpec__Group__1();

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
    // $ANTLR end "rule__TransitionSpec__Group__0"


    // $ANTLR start "rule__TransitionSpec__Group__0__Impl"
    // InternalChessGame.g:1380:1: rule__TransitionSpec__Group__0__Impl : ( 'click' ) ;
    public final void rule__TransitionSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1384:1: ( ( 'click' ) )
            // InternalChessGame.g:1385:1: ( 'click' )
            {
            // InternalChessGame.g:1385:1: ( 'click' )
            // InternalChessGame.g:1386:2: 'click'
            {
             before(grammarAccess.getTransitionSpecAccess().getClickKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTransitionSpecAccess().getClickKeyword_0()); 

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
    // $ANTLR end "rule__TransitionSpec__Group__0__Impl"


    // $ANTLR start "rule__TransitionSpec__Group__1"
    // InternalChessGame.g:1395:1: rule__TransitionSpec__Group__1 : rule__TransitionSpec__Group__1__Impl rule__TransitionSpec__Group__2 ;
    public final void rule__TransitionSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1399:1: ( rule__TransitionSpec__Group__1__Impl rule__TransitionSpec__Group__2 )
            // InternalChessGame.g:1400:2: rule__TransitionSpec__Group__1__Impl rule__TransitionSpec__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__TransitionSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionSpec__Group__2();

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
    // $ANTLR end "rule__TransitionSpec__Group__1"


    // $ANTLR start "rule__TransitionSpec__Group__1__Impl"
    // InternalChessGame.g:1407:1: rule__TransitionSpec__Group__1__Impl : ( ( rule__TransitionSpec__TriggerAssignment_1 ) ) ;
    public final void rule__TransitionSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1411:1: ( ( ( rule__TransitionSpec__TriggerAssignment_1 ) ) )
            // InternalChessGame.g:1412:1: ( ( rule__TransitionSpec__TriggerAssignment_1 ) )
            {
            // InternalChessGame.g:1412:1: ( ( rule__TransitionSpec__TriggerAssignment_1 ) )
            // InternalChessGame.g:1413:2: ( rule__TransitionSpec__TriggerAssignment_1 )
            {
             before(grammarAccess.getTransitionSpecAccess().getTriggerAssignment_1()); 
            // InternalChessGame.g:1414:2: ( rule__TransitionSpec__TriggerAssignment_1 )
            // InternalChessGame.g:1414:3: rule__TransitionSpec__TriggerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TransitionSpec__TriggerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionSpecAccess().getTriggerAssignment_1()); 

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
    // $ANTLR end "rule__TransitionSpec__Group__1__Impl"


    // $ANTLR start "rule__TransitionSpec__Group__2"
    // InternalChessGame.g:1422:1: rule__TransitionSpec__Group__2 : rule__TransitionSpec__Group__2__Impl rule__TransitionSpec__Group__3 ;
    public final void rule__TransitionSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1426:1: ( rule__TransitionSpec__Group__2__Impl rule__TransitionSpec__Group__3 )
            // InternalChessGame.g:1427:2: rule__TransitionSpec__Group__2__Impl rule__TransitionSpec__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__TransitionSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionSpec__Group__3();

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
    // $ANTLR end "rule__TransitionSpec__Group__2"


    // $ANTLR start "rule__TransitionSpec__Group__2__Impl"
    // InternalChessGame.g:1434:1: rule__TransitionSpec__Group__2__Impl : ( 'and' ) ;
    public final void rule__TransitionSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1438:1: ( ( 'and' ) )
            // InternalChessGame.g:1439:1: ( 'and' )
            {
            // InternalChessGame.g:1439:1: ( 'and' )
            // InternalChessGame.g:1440:2: 'and'
            {
             before(grammarAccess.getTransitionSpecAccess().getAndKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTransitionSpecAccess().getAndKeyword_2()); 

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
    // $ANTLR end "rule__TransitionSpec__Group__2__Impl"


    // $ANTLR start "rule__TransitionSpec__Group__3"
    // InternalChessGame.g:1449:1: rule__TransitionSpec__Group__3 : rule__TransitionSpec__Group__3__Impl rule__TransitionSpec__Group__4 ;
    public final void rule__TransitionSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1453:1: ( rule__TransitionSpec__Group__3__Impl rule__TransitionSpec__Group__4 )
            // InternalChessGame.g:1454:2: rule__TransitionSpec__Group__3__Impl rule__TransitionSpec__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__TransitionSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransitionSpec__Group__4();

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
    // $ANTLR end "rule__TransitionSpec__Group__3"


    // $ANTLR start "rule__TransitionSpec__Group__3__Impl"
    // InternalChessGame.g:1461:1: rule__TransitionSpec__Group__3__Impl : ( 'goto' ) ;
    public final void rule__TransitionSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1465:1: ( ( 'goto' ) )
            // InternalChessGame.g:1466:1: ( 'goto' )
            {
            // InternalChessGame.g:1466:1: ( 'goto' )
            // InternalChessGame.g:1467:2: 'goto'
            {
             before(grammarAccess.getTransitionSpecAccess().getGotoKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTransitionSpecAccess().getGotoKeyword_3()); 

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
    // $ANTLR end "rule__TransitionSpec__Group__3__Impl"


    // $ANTLR start "rule__TransitionSpec__Group__4"
    // InternalChessGame.g:1476:1: rule__TransitionSpec__Group__4 : rule__TransitionSpec__Group__4__Impl ;
    public final void rule__TransitionSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1480:1: ( rule__TransitionSpec__Group__4__Impl )
            // InternalChessGame.g:1481:2: rule__TransitionSpec__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransitionSpec__Group__4__Impl();

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
    // $ANTLR end "rule__TransitionSpec__Group__4"


    // $ANTLR start "rule__TransitionSpec__Group__4__Impl"
    // InternalChessGame.g:1487:1: rule__TransitionSpec__Group__4__Impl : ( ( rule__TransitionSpec__TargetAssignment_4 ) ) ;
    public final void rule__TransitionSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1491:1: ( ( ( rule__TransitionSpec__TargetAssignment_4 ) ) )
            // InternalChessGame.g:1492:1: ( ( rule__TransitionSpec__TargetAssignment_4 ) )
            {
            // InternalChessGame.g:1492:1: ( ( rule__TransitionSpec__TargetAssignment_4 ) )
            // InternalChessGame.g:1493:2: ( rule__TransitionSpec__TargetAssignment_4 )
            {
             before(grammarAccess.getTransitionSpecAccess().getTargetAssignment_4()); 
            // InternalChessGame.g:1494:2: ( rule__TransitionSpec__TargetAssignment_4 )
            // InternalChessGame.g:1494:3: rule__TransitionSpec__TargetAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TransitionSpec__TargetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransitionSpecAccess().getTargetAssignment_4()); 

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
    // $ANTLR end "rule__TransitionSpec__Group__4__Impl"


    // $ANTLR start "rule__MouseTrigger__Group_1__0"
    // InternalChessGame.g:1503:1: rule__MouseTrigger__Group_1__0 : rule__MouseTrigger__Group_1__0__Impl rule__MouseTrigger__Group_1__1 ;
    public final void rule__MouseTrigger__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1507:1: ( rule__MouseTrigger__Group_1__0__Impl rule__MouseTrigger__Group_1__1 )
            // InternalChessGame.g:1508:2: rule__MouseTrigger__Group_1__0__Impl rule__MouseTrigger__Group_1__1
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
    // InternalChessGame.g:1515:1: rule__MouseTrigger__Group_1__0__Impl : ( 'mouse-right' ) ;
    public final void rule__MouseTrigger__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1519:1: ( ( 'mouse-right' ) )
            // InternalChessGame.g:1520:1: ( 'mouse-right' )
            {
            // InternalChessGame.g:1520:1: ( 'mouse-right' )
            // InternalChessGame.g:1521:2: 'mouse-right'
            {
             before(grammarAccess.getMouseTriggerAccess().getMouseRightKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalChessGame.g:1530:1: rule__MouseTrigger__Group_1__1 : rule__MouseTrigger__Group_1__1__Impl ;
    public final void rule__MouseTrigger__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1534:1: ( rule__MouseTrigger__Group_1__1__Impl )
            // InternalChessGame.g:1535:2: rule__MouseTrigger__Group_1__1__Impl
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
    // InternalChessGame.g:1541:1: rule__MouseTrigger__Group_1__1__Impl : ( () ) ;
    public final void rule__MouseTrigger__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1545:1: ( ( () ) )
            // InternalChessGame.g:1546:1: ( () )
            {
            // InternalChessGame.g:1546:1: ( () )
            // InternalChessGame.g:1547:2: ()
            {
             before(grammarAccess.getMouseTriggerAccess().getMouseTriggerAction_1_1()); 
            // InternalChessGame.g:1548:2: ()
            // InternalChessGame.g:1548:3: 
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
    // InternalChessGame.g:1557:1: rule__GameEnd__Group__0 : rule__GameEnd__Group__0__Impl rule__GameEnd__Group__1 ;
    public final void rule__GameEnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1561:1: ( rule__GameEnd__Group__0__Impl rule__GameEnd__Group__1 )
            // InternalChessGame.g:1562:2: rule__GameEnd__Group__0__Impl rule__GameEnd__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalChessGame.g:1569:1: rule__GameEnd__Group__0__Impl : ( 'action' ) ;
    public final void rule__GameEnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1573:1: ( ( 'action' ) )
            // InternalChessGame.g:1574:1: ( 'action' )
            {
            // InternalChessGame.g:1574:1: ( 'action' )
            // InternalChessGame.g:1575:2: 'action'
            {
             before(grammarAccess.getGameEndAccess().getActionKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalChessGame.g:1584:1: rule__GameEnd__Group__1 : rule__GameEnd__Group__1__Impl rule__GameEnd__Group__2 ;
    public final void rule__GameEnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1588:1: ( rule__GameEnd__Group__1__Impl rule__GameEnd__Group__2 )
            // InternalChessGame.g:1589:2: rule__GameEnd__Group__1__Impl rule__GameEnd__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalChessGame.g:1596:1: rule__GameEnd__Group__1__Impl : ( ( rule__GameEnd__NameAssignment_1 ) ) ;
    public final void rule__GameEnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1600:1: ( ( ( rule__GameEnd__NameAssignment_1 ) ) )
            // InternalChessGame.g:1601:1: ( ( rule__GameEnd__NameAssignment_1 ) )
            {
            // InternalChessGame.g:1601:1: ( ( rule__GameEnd__NameAssignment_1 ) )
            // InternalChessGame.g:1602:2: ( rule__GameEnd__NameAssignment_1 )
            {
             before(grammarAccess.getGameEndAccess().getNameAssignment_1()); 
            // InternalChessGame.g:1603:2: ( rule__GameEnd__NameAssignment_1 )
            // InternalChessGame.g:1603:3: rule__GameEnd__NameAssignment_1
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
    // InternalChessGame.g:1611:1: rule__GameEnd__Group__2 : rule__GameEnd__Group__2__Impl rule__GameEnd__Group__3 ;
    public final void rule__GameEnd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1615:1: ( rule__GameEnd__Group__2__Impl rule__GameEnd__Group__3 )
            // InternalChessGame.g:1616:2: rule__GameEnd__Group__2__Impl rule__GameEnd__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalChessGame.g:1623:1: rule__GameEnd__Group__2__Impl : ( '{' ) ;
    public final void rule__GameEnd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1627:1: ( ( '{' ) )
            // InternalChessGame.g:1628:1: ( '{' )
            {
            // InternalChessGame.g:1628:1: ( '{' )
            // InternalChessGame.g:1629:2: '{'
            {
             before(grammarAccess.getGameEndAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalChessGame.g:1638:1: rule__GameEnd__Group__3 : rule__GameEnd__Group__3__Impl rule__GameEnd__Group__4 ;
    public final void rule__GameEnd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1642:1: ( rule__GameEnd__Group__3__Impl rule__GameEnd__Group__4 )
            // InternalChessGame.g:1643:2: rule__GameEnd__Group__3__Impl rule__GameEnd__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalChessGame.g:1650:1: rule__GameEnd__Group__3__Impl : ( 'when' ) ;
    public final void rule__GameEnd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1654:1: ( ( 'when' ) )
            // InternalChessGame.g:1655:1: ( 'when' )
            {
            // InternalChessGame.g:1655:1: ( 'when' )
            // InternalChessGame.g:1656:2: 'when'
            {
             before(grammarAccess.getGameEndAccess().getWhenKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalChessGame.g:1665:1: rule__GameEnd__Group__4 : rule__GameEnd__Group__4__Impl rule__GameEnd__Group__5 ;
    public final void rule__GameEnd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1669:1: ( rule__GameEnd__Group__4__Impl rule__GameEnd__Group__5 )
            // InternalChessGame.g:1670:2: rule__GameEnd__Group__4__Impl rule__GameEnd__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalChessGame.g:1677:1: rule__GameEnd__Group__4__Impl : ( ( rule__GameEnd__ActionAssignment_4 ) ) ;
    public final void rule__GameEnd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1681:1: ( ( ( rule__GameEnd__ActionAssignment_4 ) ) )
            // InternalChessGame.g:1682:1: ( ( rule__GameEnd__ActionAssignment_4 ) )
            {
            // InternalChessGame.g:1682:1: ( ( rule__GameEnd__ActionAssignment_4 ) )
            // InternalChessGame.g:1683:2: ( rule__GameEnd__ActionAssignment_4 )
            {
             before(grammarAccess.getGameEndAccess().getActionAssignment_4()); 
            // InternalChessGame.g:1684:2: ( rule__GameEnd__ActionAssignment_4 )
            // InternalChessGame.g:1684:3: rule__GameEnd__ActionAssignment_4
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
    // InternalChessGame.g:1692:1: rule__GameEnd__Group__5 : rule__GameEnd__Group__5__Impl rule__GameEnd__Group__6 ;
    public final void rule__GameEnd__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1696:1: ( rule__GameEnd__Group__5__Impl rule__GameEnd__Group__6 )
            // InternalChessGame.g:1697:2: rule__GameEnd__Group__5__Impl rule__GameEnd__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalChessGame.g:1704:1: rule__GameEnd__Group__5__Impl : ( 'do' ) ;
    public final void rule__GameEnd__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1708:1: ( ( 'do' ) )
            // InternalChessGame.g:1709:1: ( 'do' )
            {
            // InternalChessGame.g:1709:1: ( 'do' )
            // InternalChessGame.g:1710:2: 'do'
            {
             before(grammarAccess.getGameEndAccess().getDoKeyword_5()); 
            match(input,32,FOLLOW_2); 
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
    // InternalChessGame.g:1719:1: rule__GameEnd__Group__6 : rule__GameEnd__Group__6__Impl rule__GameEnd__Group__7 ;
    public final void rule__GameEnd__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1723:1: ( rule__GameEnd__Group__6__Impl rule__GameEnd__Group__7 )
            // InternalChessGame.g:1724:2: rule__GameEnd__Group__6__Impl rule__GameEnd__Group__7
            {
            pushFollow(FOLLOW_13);
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
    // InternalChessGame.g:1731:1: rule__GameEnd__Group__6__Impl : ( ( rule__GameEnd__BehaviourAssignment_6 ) ) ;
    public final void rule__GameEnd__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1735:1: ( ( ( rule__GameEnd__BehaviourAssignment_6 ) ) )
            // InternalChessGame.g:1736:1: ( ( rule__GameEnd__BehaviourAssignment_6 ) )
            {
            // InternalChessGame.g:1736:1: ( ( rule__GameEnd__BehaviourAssignment_6 ) )
            // InternalChessGame.g:1737:2: ( rule__GameEnd__BehaviourAssignment_6 )
            {
             before(grammarAccess.getGameEndAccess().getBehaviourAssignment_6()); 
            // InternalChessGame.g:1738:2: ( rule__GameEnd__BehaviourAssignment_6 )
            // InternalChessGame.g:1738:3: rule__GameEnd__BehaviourAssignment_6
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
    // InternalChessGame.g:1746:1: rule__GameEnd__Group__7 : rule__GameEnd__Group__7__Impl ;
    public final void rule__GameEnd__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1750:1: ( rule__GameEnd__Group__7__Impl )
            // InternalChessGame.g:1751:2: rule__GameEnd__Group__7__Impl
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
    // InternalChessGame.g:1757:1: rule__GameEnd__Group__7__Impl : ( '}' ) ;
    public final void rule__GameEnd__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1761:1: ( ( '}' ) )
            // InternalChessGame.g:1762:1: ( '}' )
            {
            // InternalChessGame.g:1762:1: ( '}' )
            // InternalChessGame.g:1763:2: '}'
            {
             before(grammarAccess.getGameEndAccess().getRightCurlyBracketKeyword_7()); 
            match(input,21,FOLLOW_2); 
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


    // $ANTLR start "rule__ContextExpression__Group__0"
    // InternalChessGame.g:1773:1: rule__ContextExpression__Group__0 : rule__ContextExpression__Group__0__Impl rule__ContextExpression__Group__1 ;
    public final void rule__ContextExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1777:1: ( rule__ContextExpression__Group__0__Impl rule__ContextExpression__Group__1 )
            // InternalChessGame.g:1778:2: rule__ContextExpression__Group__0__Impl rule__ContextExpression__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__ContextExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextExpression__Group__1();

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
    // $ANTLR end "rule__ContextExpression__Group__0"


    // $ANTLR start "rule__ContextExpression__Group__0__Impl"
    // InternalChessGame.g:1785:1: rule__ContextExpression__Group__0__Impl : ( ( rule__ContextExpression__Sub_expAssignment_0 ) ) ;
    public final void rule__ContextExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1789:1: ( ( ( rule__ContextExpression__Sub_expAssignment_0 ) ) )
            // InternalChessGame.g:1790:1: ( ( rule__ContextExpression__Sub_expAssignment_0 ) )
            {
            // InternalChessGame.g:1790:1: ( ( rule__ContextExpression__Sub_expAssignment_0 ) )
            // InternalChessGame.g:1791:2: ( rule__ContextExpression__Sub_expAssignment_0 )
            {
             before(grammarAccess.getContextExpressionAccess().getSub_expAssignment_0()); 
            // InternalChessGame.g:1792:2: ( rule__ContextExpression__Sub_expAssignment_0 )
            // InternalChessGame.g:1792:3: rule__ContextExpression__Sub_expAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ContextExpression__Sub_expAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getContextExpressionAccess().getSub_expAssignment_0()); 

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
    // $ANTLR end "rule__ContextExpression__Group__0__Impl"


    // $ANTLR start "rule__ContextExpression__Group__1"
    // InternalChessGame.g:1800:1: rule__ContextExpression__Group__1 : rule__ContextExpression__Group__1__Impl rule__ContextExpression__Group__2 ;
    public final void rule__ContextExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1804:1: ( rule__ContextExpression__Group__1__Impl rule__ContextExpression__Group__2 )
            // InternalChessGame.g:1805:2: rule__ContextExpression__Group__1__Impl rule__ContextExpression__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__ContextExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextExpression__Group__2();

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
    // $ANTLR end "rule__ContextExpression__Group__1"


    // $ANTLR start "rule__ContextExpression__Group__1__Impl"
    // InternalChessGame.g:1812:1: rule__ContextExpression__Group__1__Impl : ( '.' ) ;
    public final void rule__ContextExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1816:1: ( ( '.' ) )
            // InternalChessGame.g:1817:1: ( '.' )
            {
            // InternalChessGame.g:1817:1: ( '.' )
            // InternalChessGame.g:1818:2: '.'
            {
             before(grammarAccess.getContextExpressionAccess().getFullStopKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getContextExpressionAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__ContextExpression__Group__1__Impl"


    // $ANTLR start "rule__ContextExpression__Group__2"
    // InternalChessGame.g:1827:1: rule__ContextExpression__Group__2 : rule__ContextExpression__Group__2__Impl ;
    public final void rule__ContextExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1831:1: ( rule__ContextExpression__Group__2__Impl )
            // InternalChessGame.g:1832:2: rule__ContextExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextExpression__Group__2__Impl();

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
    // $ANTLR end "rule__ContextExpression__Group__2"


    // $ANTLR start "rule__ContextExpression__Group__2__Impl"
    // InternalChessGame.g:1838:1: rule__ContextExpression__Group__2__Impl : ( ( rule__ContextExpression__CellStateAssignment_2 ) ) ;
    public final void rule__ContextExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1842:1: ( ( ( rule__ContextExpression__CellStateAssignment_2 ) ) )
            // InternalChessGame.g:1843:1: ( ( rule__ContextExpression__CellStateAssignment_2 ) )
            {
            // InternalChessGame.g:1843:1: ( ( rule__ContextExpression__CellStateAssignment_2 ) )
            // InternalChessGame.g:1844:2: ( rule__ContextExpression__CellStateAssignment_2 )
            {
             before(grammarAccess.getContextExpressionAccess().getCellStateAssignment_2()); 
            // InternalChessGame.g:1845:2: ( rule__ContextExpression__CellStateAssignment_2 )
            // InternalChessGame.g:1845:3: rule__ContextExpression__CellStateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ContextExpression__CellStateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContextExpressionAccess().getCellStateAssignment_2()); 

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
    // $ANTLR end "rule__ContextExpression__Group__2__Impl"


    // $ANTLR start "rule__StateFilterExpression__Group__0"
    // InternalChessGame.g:1854:1: rule__StateFilterExpression__Group__0 : rule__StateFilterExpression__Group__0__Impl rule__StateFilterExpression__Group__1 ;
    public final void rule__StateFilterExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1858:1: ( rule__StateFilterExpression__Group__0__Impl rule__StateFilterExpression__Group__1 )
            // InternalChessGame.g:1859:2: rule__StateFilterExpression__Group__0__Impl rule__StateFilterExpression__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__StateFilterExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateFilterExpression__Group__1();

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
    // $ANTLR end "rule__StateFilterExpression__Group__0"


    // $ANTLR start "rule__StateFilterExpression__Group__0__Impl"
    // InternalChessGame.g:1866:1: rule__StateFilterExpression__Group__0__Impl : ( 'allCellState' ) ;
    public final void rule__StateFilterExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1870:1: ( ( 'allCellState' ) )
            // InternalChessGame.g:1871:1: ( 'allCellState' )
            {
            // InternalChessGame.g:1871:1: ( 'allCellState' )
            // InternalChessGame.g:1872:2: 'allCellState'
            {
             before(grammarAccess.getStateFilterExpressionAccess().getAllCellStateKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getStateFilterExpressionAccess().getAllCellStateKeyword_0()); 

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
    // $ANTLR end "rule__StateFilterExpression__Group__0__Impl"


    // $ANTLR start "rule__StateFilterExpression__Group__1"
    // InternalChessGame.g:1881:1: rule__StateFilterExpression__Group__1 : rule__StateFilterExpression__Group__1__Impl rule__StateFilterExpression__Group__2 ;
    public final void rule__StateFilterExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1885:1: ( rule__StateFilterExpression__Group__1__Impl rule__StateFilterExpression__Group__2 )
            // InternalChessGame.g:1886:2: rule__StateFilterExpression__Group__1__Impl rule__StateFilterExpression__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__StateFilterExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateFilterExpression__Group__2();

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
    // $ANTLR end "rule__StateFilterExpression__Group__1"


    // $ANTLR start "rule__StateFilterExpression__Group__1__Impl"
    // InternalChessGame.g:1893:1: rule__StateFilterExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__StateFilterExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1897:1: ( ( '(' ) )
            // InternalChessGame.g:1898:1: ( '(' )
            {
            // InternalChessGame.g:1898:1: ( '(' )
            // InternalChessGame.g:1899:2: '('
            {
             before(grammarAccess.getStateFilterExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getStateFilterExpressionAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__StateFilterExpression__Group__1__Impl"


    // $ANTLR start "rule__StateFilterExpression__Group__2"
    // InternalChessGame.g:1908:1: rule__StateFilterExpression__Group__2 : rule__StateFilterExpression__Group__2__Impl rule__StateFilterExpression__Group__3 ;
    public final void rule__StateFilterExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1912:1: ( rule__StateFilterExpression__Group__2__Impl rule__StateFilterExpression__Group__3 )
            // InternalChessGame.g:1913:2: rule__StateFilterExpression__Group__2__Impl rule__StateFilterExpression__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__StateFilterExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateFilterExpression__Group__3();

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
    // $ANTLR end "rule__StateFilterExpression__Group__2"


    // $ANTLR start "rule__StateFilterExpression__Group__2__Impl"
    // InternalChessGame.g:1920:1: rule__StateFilterExpression__Group__2__Impl : ( ( rule__StateFilterExpression__Cell_stateAssignment_2 ) ) ;
    public final void rule__StateFilterExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1924:1: ( ( ( rule__StateFilterExpression__Cell_stateAssignment_2 ) ) )
            // InternalChessGame.g:1925:1: ( ( rule__StateFilterExpression__Cell_stateAssignment_2 ) )
            {
            // InternalChessGame.g:1925:1: ( ( rule__StateFilterExpression__Cell_stateAssignment_2 ) )
            // InternalChessGame.g:1926:2: ( rule__StateFilterExpression__Cell_stateAssignment_2 )
            {
             before(grammarAccess.getStateFilterExpressionAccess().getCell_stateAssignment_2()); 
            // InternalChessGame.g:1927:2: ( rule__StateFilterExpression__Cell_stateAssignment_2 )
            // InternalChessGame.g:1927:3: rule__StateFilterExpression__Cell_stateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StateFilterExpression__Cell_stateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateFilterExpressionAccess().getCell_stateAssignment_2()); 

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
    // $ANTLR end "rule__StateFilterExpression__Group__2__Impl"


    // $ANTLR start "rule__StateFilterExpression__Group__3"
    // InternalChessGame.g:1935:1: rule__StateFilterExpression__Group__3 : rule__StateFilterExpression__Group__3__Impl ;
    public final void rule__StateFilterExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1939:1: ( rule__StateFilterExpression__Group__3__Impl )
            // InternalChessGame.g:1940:2: rule__StateFilterExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateFilterExpression__Group__3__Impl();

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
    // $ANTLR end "rule__StateFilterExpression__Group__3"


    // $ANTLR start "rule__StateFilterExpression__Group__3__Impl"
    // InternalChessGame.g:1946:1: rule__StateFilterExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__StateFilterExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1950:1: ( ( ')' ) )
            // InternalChessGame.g:1951:1: ( ')' )
            {
            // InternalChessGame.g:1951:1: ( ')' )
            // InternalChessGame.g:1952:2: ')'
            {
             before(grammarAccess.getStateFilterExpressionAccess().getRightParenthesisKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getStateFilterExpressionAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__StateFilterExpression__Group__3__Impl"


    // $ANTLR start "rule__EmptyExpression__Group__0"
    // InternalChessGame.g:1962:1: rule__EmptyExpression__Group__0 : rule__EmptyExpression__Group__0__Impl rule__EmptyExpression__Group__1 ;
    public final void rule__EmptyExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1966:1: ( rule__EmptyExpression__Group__0__Impl rule__EmptyExpression__Group__1 )
            // InternalChessGame.g:1967:2: rule__EmptyExpression__Group__0__Impl rule__EmptyExpression__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalChessGame.g:1974:1: rule__EmptyExpression__Group__0__Impl : ( 'empty' ) ;
    public final void rule__EmptyExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1978:1: ( ( 'empty' ) )
            // InternalChessGame.g:1979:1: ( 'empty' )
            {
            // InternalChessGame.g:1979:1: ( 'empty' )
            // InternalChessGame.g:1980:2: 'empty'
            {
             before(grammarAccess.getEmptyExpressionAccess().getEmptyKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalChessGame.g:1989:1: rule__EmptyExpression__Group__1 : rule__EmptyExpression__Group__1__Impl rule__EmptyExpression__Group__2 ;
    public final void rule__EmptyExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:1993:1: ( rule__EmptyExpression__Group__1__Impl rule__EmptyExpression__Group__2 )
            // InternalChessGame.g:1994:2: rule__EmptyExpression__Group__1__Impl rule__EmptyExpression__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalChessGame.g:2001:1: rule__EmptyExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__EmptyExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2005:1: ( ( '(' ) )
            // InternalChessGame.g:2006:1: ( '(' )
            {
            // InternalChessGame.g:2006:1: ( '(' )
            // InternalChessGame.g:2007:2: '('
            {
             before(grammarAccess.getEmptyExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalChessGame.g:2016:1: rule__EmptyExpression__Group__2 : rule__EmptyExpression__Group__2__Impl rule__EmptyExpression__Group__3 ;
    public final void rule__EmptyExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2020:1: ( rule__EmptyExpression__Group__2__Impl rule__EmptyExpression__Group__3 )
            // InternalChessGame.g:2021:2: rule__EmptyExpression__Group__2__Impl rule__EmptyExpression__Group__3
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
    // InternalChessGame.g:2028:1: rule__EmptyExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__EmptyExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2032:1: ( ( ')' ) )
            // InternalChessGame.g:2033:1: ( ')' )
            {
            // InternalChessGame.g:2033:1: ( ')' )
            // InternalChessGame.g:2034:2: ')'
            {
             before(grammarAccess.getEmptyExpressionAccess().getRightParenthesisKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalChessGame.g:2043:1: rule__EmptyExpression__Group__3 : rule__EmptyExpression__Group__3__Impl ;
    public final void rule__EmptyExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2047:1: ( rule__EmptyExpression__Group__3__Impl )
            // InternalChessGame.g:2048:2: rule__EmptyExpression__Group__3__Impl
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
    // InternalChessGame.g:2054:1: rule__EmptyExpression__Group__3__Impl : ( () ) ;
    public final void rule__EmptyExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2058:1: ( ( () ) )
            // InternalChessGame.g:2059:1: ( () )
            {
            // InternalChessGame.g:2059:1: ( () )
            // InternalChessGame.g:2060:2: ()
            {
             before(grammarAccess.getEmptyExpressionAccess().getEmptyExpressionAction_3()); 
            // InternalChessGame.g:2061:2: ()
            // InternalChessGame.g:2061:3: 
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
    // InternalChessGame.g:2070:1: rule__EndBehaviour__Group__0 : rule__EndBehaviour__Group__0__Impl rule__EndBehaviour__Group__1 ;
    public final void rule__EndBehaviour__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2074:1: ( rule__EndBehaviour__Group__0__Impl rule__EndBehaviour__Group__1 )
            // InternalChessGame.g:2075:2: rule__EndBehaviour__Group__0__Impl rule__EndBehaviour__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalChessGame.g:2082:1: rule__EndBehaviour__Group__0__Impl : ( 'end-game' ) ;
    public final void rule__EndBehaviour__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2086:1: ( ( 'end-game' ) )
            // InternalChessGame.g:2087:1: ( 'end-game' )
            {
            // InternalChessGame.g:2087:1: ( 'end-game' )
            // InternalChessGame.g:2088:2: 'end-game'
            {
             before(grammarAccess.getEndBehaviourAccess().getEndGameKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalChessGame.g:2097:1: rule__EndBehaviour__Group__1 : rule__EndBehaviour__Group__1__Impl rule__EndBehaviour__Group__2 ;
    public final void rule__EndBehaviour__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2101:1: ( rule__EndBehaviour__Group__1__Impl rule__EndBehaviour__Group__2 )
            // InternalChessGame.g:2102:2: rule__EndBehaviour__Group__1__Impl rule__EndBehaviour__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalChessGame.g:2109:1: rule__EndBehaviour__Group__1__Impl : ( '(' ) ;
    public final void rule__EndBehaviour__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2113:1: ( ( '(' ) )
            // InternalChessGame.g:2114:1: ( '(' )
            {
            // InternalChessGame.g:2114:1: ( '(' )
            // InternalChessGame.g:2115:2: '('
            {
             before(grammarAccess.getEndBehaviourAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalChessGame.g:2124:1: rule__EndBehaviour__Group__2 : rule__EndBehaviour__Group__2__Impl rule__EndBehaviour__Group__3 ;
    public final void rule__EndBehaviour__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2128:1: ( rule__EndBehaviour__Group__2__Impl rule__EndBehaviour__Group__3 )
            // InternalChessGame.g:2129:2: rule__EndBehaviour__Group__2__Impl rule__EndBehaviour__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalChessGame.g:2136:1: rule__EndBehaviour__Group__2__Impl : ( ( rule__EndBehaviour__MessageAssignment_2 ) ) ;
    public final void rule__EndBehaviour__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2140:1: ( ( ( rule__EndBehaviour__MessageAssignment_2 ) ) )
            // InternalChessGame.g:2141:1: ( ( rule__EndBehaviour__MessageAssignment_2 ) )
            {
            // InternalChessGame.g:2141:1: ( ( rule__EndBehaviour__MessageAssignment_2 ) )
            // InternalChessGame.g:2142:2: ( rule__EndBehaviour__MessageAssignment_2 )
            {
             before(grammarAccess.getEndBehaviourAccess().getMessageAssignment_2()); 
            // InternalChessGame.g:2143:2: ( rule__EndBehaviour__MessageAssignment_2 )
            // InternalChessGame.g:2143:3: rule__EndBehaviour__MessageAssignment_2
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
    // InternalChessGame.g:2151:1: rule__EndBehaviour__Group__3 : rule__EndBehaviour__Group__3__Impl ;
    public final void rule__EndBehaviour__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2155:1: ( rule__EndBehaviour__Group__3__Impl )
            // InternalChessGame.g:2156:2: rule__EndBehaviour__Group__3__Impl
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
    // InternalChessGame.g:2162:1: rule__EndBehaviour__Group__3__Impl : ( ')' ) ;
    public final void rule__EndBehaviour__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2166:1: ( ( ')' ) )
            // InternalChessGame.g:2167:1: ( ')' )
            {
            // InternalChessGame.g:2167:1: ( ')' )
            // InternalChessGame.g:2168:2: ')'
            {
             before(grammarAccess.getEndBehaviourAccess().getRightParenthesisKeyword_3()); 
            match(input,36,FOLLOW_2); 
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


    // $ANTLR start "rule__ChessProgram__SizeAssignment_0"
    // InternalChessGame.g:2178:1: rule__ChessProgram__SizeAssignment_0 : ( ruleFieldSpecification ) ;
    public final void rule__ChessProgram__SizeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2182:1: ( ( ruleFieldSpecification ) )
            // InternalChessGame.g:2183:2: ( ruleFieldSpecification )
            {
            // InternalChessGame.g:2183:2: ( ruleFieldSpecification )
            // InternalChessGame.g:2184:3: ruleFieldSpecification
            {
             before(grammarAccess.getChessProgramAccess().getSizeFieldSpecificationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldSpecification();

            state._fsp--;

             after(grammarAccess.getChessProgramAccess().getSizeFieldSpecificationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ChessProgram__SizeAssignment_0"


    // $ANTLR start "rule__ChessProgram__OptionsAssignment_1"
    // InternalChessGame.g:2193:1: rule__ChessProgram__OptionsAssignment_1 : ( ruleOptionSpecification ) ;
    public final void rule__ChessProgram__OptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2197:1: ( ( ruleOptionSpecification ) )
            // InternalChessGame.g:2198:2: ( ruleOptionSpecification )
            {
            // InternalChessGame.g:2198:2: ( ruleOptionSpecification )
            // InternalChessGame.g:2199:3: ruleOptionSpecification
            {
             before(grammarAccess.getChessProgramAccess().getOptionsOptionSpecificationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOptionSpecification();

            state._fsp--;

             after(grammarAccess.getChessProgramAccess().getOptionsOptionSpecificationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ChessProgram__OptionsAssignment_1"


    // $ANTLR start "rule__ChessProgram__EndGameAssignment_2"
    // InternalChessGame.g:2208:1: rule__ChessProgram__EndGameAssignment_2 : ( ruleGameEnd ) ;
    public final void rule__ChessProgram__EndGameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2212:1: ( ( ruleGameEnd ) )
            // InternalChessGame.g:2213:2: ( ruleGameEnd )
            {
            // InternalChessGame.g:2213:2: ( ruleGameEnd )
            // InternalChessGame.g:2214:3: ruleGameEnd
            {
             before(grammarAccess.getChessProgramAccess().getEndGameGameEndParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGameEnd();

            state._fsp--;

             after(grammarAccess.getChessProgramAccess().getEndGameGameEndParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ChessProgram__EndGameAssignment_2"


    // $ANTLR start "rule__FieldSpecification__WidthAssignment_4"
    // InternalChessGame.g:2223:1: rule__FieldSpecification__WidthAssignment_4 : ( RULE_INT ) ;
    public final void rule__FieldSpecification__WidthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2227:1: ( ( RULE_INT ) )
            // InternalChessGame.g:2228:2: ( RULE_INT )
            {
            // InternalChessGame.g:2228:2: ( RULE_INT )
            // InternalChessGame.g:2229:3: RULE_INT
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
    // InternalChessGame.g:2238:1: rule__FieldSpecification__HeightAssignment_7 : ( RULE_INT ) ;
    public final void rule__FieldSpecification__HeightAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2242:1: ( ( RULE_INT ) )
            // InternalChessGame.g:2243:2: ( RULE_INT )
            {
            // InternalChessGame.g:2243:2: ( RULE_INT )
            // InternalChessGame.g:2244:3: RULE_INT
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


    // $ANTLR start "rule__FieldSpecification__NameAssignment_10"
    // InternalChessGame.g:2253:1: rule__FieldSpecification__NameAssignment_10 : ( ( rule__FieldSpecification__NameAlternatives_10_0 ) ) ;
    public final void rule__FieldSpecification__NameAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2257:1: ( ( ( rule__FieldSpecification__NameAlternatives_10_0 ) ) )
            // InternalChessGame.g:2258:2: ( ( rule__FieldSpecification__NameAlternatives_10_0 ) )
            {
            // InternalChessGame.g:2258:2: ( ( rule__FieldSpecification__NameAlternatives_10_0 ) )
            // InternalChessGame.g:2259:3: ( rule__FieldSpecification__NameAlternatives_10_0 )
            {
             before(grammarAccess.getFieldSpecificationAccess().getNameAlternatives_10_0()); 
            // InternalChessGame.g:2260:3: ( rule__FieldSpecification__NameAlternatives_10_0 )
            // InternalChessGame.g:2260:4: rule__FieldSpecification__NameAlternatives_10_0
            {
            pushFollow(FOLLOW_2);
            rule__FieldSpecification__NameAlternatives_10_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldSpecificationAccess().getNameAlternatives_10_0()); 

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
    // $ANTLR end "rule__FieldSpecification__NameAssignment_10"


    // $ANTLR start "rule__OptionSpecification__StatesAssignment"
    // InternalChessGame.g:2268:1: rule__OptionSpecification__StatesAssignment : ( ruleCellState ) ;
    public final void rule__OptionSpecification__StatesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2272:1: ( ( ruleCellState ) )
            // InternalChessGame.g:2273:2: ( ruleCellState )
            {
            // InternalChessGame.g:2273:2: ( ruleCellState )
            // InternalChessGame.g:2274:3: ruleCellState
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
    // InternalChessGame.g:2283:1: rule__CellState__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__CellState__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2287:1: ( ( RULE_ID ) )
            // InternalChessGame.g:2288:2: ( RULE_ID )
            {
            // InternalChessGame.g:2288:2: ( RULE_ID )
            // InternalChessGame.g:2289:3: RULE_ID
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
    // InternalChessGame.g:2298:1: rule__CellState__DisplayAssignment_2 : ( ruleCellDisplaySpec ) ;
    public final void rule__CellState__DisplayAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2302:1: ( ( ruleCellDisplaySpec ) )
            // InternalChessGame.g:2303:2: ( ruleCellDisplaySpec )
            {
            // InternalChessGame.g:2303:2: ( ruleCellDisplaySpec )
            // InternalChessGame.g:2304:3: ruleCellDisplaySpec
            {
             before(grammarAccess.getCellStateAccess().getDisplayCellDisplaySpecParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCellDisplaySpec();

            state._fsp--;

             after(grammarAccess.getCellStateAccess().getDisplayCellDisplaySpecParserRuleCall_2_0()); 

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
    // InternalChessGame.g:2313:1: rule__CellState__TransitionsAssignment_3_2 : ( ruleTransitionSpec ) ;
    public final void rule__CellState__TransitionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2317:1: ( ( ruleTransitionSpec ) )
            // InternalChessGame.g:2318:2: ( ruleTransitionSpec )
            {
            // InternalChessGame.g:2318:2: ( ruleTransitionSpec )
            // InternalChessGame.g:2319:3: ruleTransitionSpec
            {
             before(grammarAccess.getCellStateAccess().getTransitionsTransitionSpecParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransitionSpec();

            state._fsp--;

             after(grammarAccess.getCellStateAccess().getTransitionsTransitionSpecParserRuleCall_3_2_0()); 

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


    // $ANTLR start "rule__CellDisplaySpec__TextAssignment_2_0_2"
    // InternalChessGame.g:2328:1: rule__CellDisplaySpec__TextAssignment_2_0_2 : ( RULE_STRING ) ;
    public final void rule__CellDisplaySpec__TextAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2332:1: ( ( RULE_STRING ) )
            // InternalChessGame.g:2333:2: ( RULE_STRING )
            {
            // InternalChessGame.g:2333:2: ( RULE_STRING )
            // InternalChessGame.g:2334:3: RULE_STRING
            {
             before(grammarAccess.getCellDisplaySpecAccess().getTextSTRINGTerminalRuleCall_2_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCellDisplaySpecAccess().getTextSTRINGTerminalRuleCall_2_0_2_0()); 

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
    // $ANTLR end "rule__CellDisplaySpec__TextAssignment_2_0_2"


    // $ANTLR start "rule__CellDisplaySpec__ColorAssignment_2_1_2"
    // InternalChessGame.g:2343:1: rule__CellDisplaySpec__ColorAssignment_2_1_2 : ( ( rule__CellDisplaySpec__ColorAlternatives_2_1_2_0 ) ) ;
    public final void rule__CellDisplaySpec__ColorAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2347:1: ( ( ( rule__CellDisplaySpec__ColorAlternatives_2_1_2_0 ) ) )
            // InternalChessGame.g:2348:2: ( ( rule__CellDisplaySpec__ColorAlternatives_2_1_2_0 ) )
            {
            // InternalChessGame.g:2348:2: ( ( rule__CellDisplaySpec__ColorAlternatives_2_1_2_0 ) )
            // InternalChessGame.g:2349:3: ( rule__CellDisplaySpec__ColorAlternatives_2_1_2_0 )
            {
             before(grammarAccess.getCellDisplaySpecAccess().getColorAlternatives_2_1_2_0()); 
            // InternalChessGame.g:2350:3: ( rule__CellDisplaySpec__ColorAlternatives_2_1_2_0 )
            // InternalChessGame.g:2350:4: rule__CellDisplaySpec__ColorAlternatives_2_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__CellDisplaySpec__ColorAlternatives_2_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCellDisplaySpecAccess().getColorAlternatives_2_1_2_0()); 

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
    // $ANTLR end "rule__CellDisplaySpec__ColorAssignment_2_1_2"


    // $ANTLR start "rule__TransitionSpec__TriggerAssignment_1"
    // InternalChessGame.g:2358:1: rule__TransitionSpec__TriggerAssignment_1 : ( ruleMouseTrigger ) ;
    public final void rule__TransitionSpec__TriggerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2362:1: ( ( ruleMouseTrigger ) )
            // InternalChessGame.g:2363:2: ( ruleMouseTrigger )
            {
            // InternalChessGame.g:2363:2: ( ruleMouseTrigger )
            // InternalChessGame.g:2364:3: ruleMouseTrigger
            {
             before(grammarAccess.getTransitionSpecAccess().getTriggerMouseTriggerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMouseTrigger();

            state._fsp--;

             after(grammarAccess.getTransitionSpecAccess().getTriggerMouseTriggerParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TransitionSpec__TriggerAssignment_1"


    // $ANTLR start "rule__TransitionSpec__TargetAssignment_4"
    // InternalChessGame.g:2373:1: rule__TransitionSpec__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__TransitionSpec__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2377:1: ( ( ( RULE_ID ) ) )
            // InternalChessGame.g:2378:2: ( ( RULE_ID ) )
            {
            // InternalChessGame.g:2378:2: ( ( RULE_ID ) )
            // InternalChessGame.g:2379:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionSpecAccess().getTargetCellStateCrossReference_4_0()); 
            // InternalChessGame.g:2380:3: ( RULE_ID )
            // InternalChessGame.g:2381:4: RULE_ID
            {
             before(grammarAccess.getTransitionSpecAccess().getTargetCellStateIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionSpecAccess().getTargetCellStateIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTransitionSpecAccess().getTargetCellStateCrossReference_4_0()); 

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
    // $ANTLR end "rule__TransitionSpec__TargetAssignment_4"


    // $ANTLR start "rule__MouseTrigger__MouseAssignment_0"
    // InternalChessGame.g:2392:1: rule__MouseTrigger__MouseAssignment_0 : ( ( 'mouse-left' ) ) ;
    public final void rule__MouseTrigger__MouseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2396:1: ( ( ( 'mouse-left' ) ) )
            // InternalChessGame.g:2397:2: ( ( 'mouse-left' ) )
            {
            // InternalChessGame.g:2397:2: ( ( 'mouse-left' ) )
            // InternalChessGame.g:2398:3: ( 'mouse-left' )
            {
             before(grammarAccess.getMouseTriggerAccess().getMouseMouseLeftKeyword_0_0()); 
            // InternalChessGame.g:2399:3: ( 'mouse-left' )
            // InternalChessGame.g:2400:4: 'mouse-left'
            {
             before(grammarAccess.getMouseTriggerAccess().getMouseMouseLeftKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalChessGame.g:2411:1: rule__GameEnd__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GameEnd__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2415:1: ( ( RULE_ID ) )
            // InternalChessGame.g:2416:2: ( RULE_ID )
            {
            // InternalChessGame.g:2416:2: ( RULE_ID )
            // InternalChessGame.g:2417:3: RULE_ID
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
    // InternalChessGame.g:2426:1: rule__GameEnd__ActionAssignment_4 : ( ruleContextExpression ) ;
    public final void rule__GameEnd__ActionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2430:1: ( ( ruleContextExpression ) )
            // InternalChessGame.g:2431:2: ( ruleContextExpression )
            {
            // InternalChessGame.g:2431:2: ( ruleContextExpression )
            // InternalChessGame.g:2432:3: ruleContextExpression
            {
             before(grammarAccess.getGameEndAccess().getActionContextExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleContextExpression();

            state._fsp--;

             after(grammarAccess.getGameEndAccess().getActionContextExpressionParserRuleCall_4_0()); 

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
    // InternalChessGame.g:2441:1: rule__GameEnd__BehaviourAssignment_6 : ( ruleEndBehaviour ) ;
    public final void rule__GameEnd__BehaviourAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2445:1: ( ( ruleEndBehaviour ) )
            // InternalChessGame.g:2446:2: ( ruleEndBehaviour )
            {
            // InternalChessGame.g:2446:2: ( ruleEndBehaviour )
            // InternalChessGame.g:2447:3: ruleEndBehaviour
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


    // $ANTLR start "rule__ContextExpression__Sub_expAssignment_0"
    // InternalChessGame.g:2456:1: rule__ContextExpression__Sub_expAssignment_0 : ( ruleStateFilterExpression ) ;
    public final void rule__ContextExpression__Sub_expAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2460:1: ( ( ruleStateFilterExpression ) )
            // InternalChessGame.g:2461:2: ( ruleStateFilterExpression )
            {
            // InternalChessGame.g:2461:2: ( ruleStateFilterExpression )
            // InternalChessGame.g:2462:3: ruleStateFilterExpression
            {
             before(grammarAccess.getContextExpressionAccess().getSub_expStateFilterExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStateFilterExpression();

            state._fsp--;

             after(grammarAccess.getContextExpressionAccess().getSub_expStateFilterExpressionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ContextExpression__Sub_expAssignment_0"


    // $ANTLR start "rule__ContextExpression__CellStateAssignment_2"
    // InternalChessGame.g:2471:1: rule__ContextExpression__CellStateAssignment_2 : ( ruleEmptyExpression ) ;
    public final void rule__ContextExpression__CellStateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2475:1: ( ( ruleEmptyExpression ) )
            // InternalChessGame.g:2476:2: ( ruleEmptyExpression )
            {
            // InternalChessGame.g:2476:2: ( ruleEmptyExpression )
            // InternalChessGame.g:2477:3: ruleEmptyExpression
            {
             before(grammarAccess.getContextExpressionAccess().getCellStateEmptyExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEmptyExpression();

            state._fsp--;

             after(grammarAccess.getContextExpressionAccess().getCellStateEmptyExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ContextExpression__CellStateAssignment_2"


    // $ANTLR start "rule__StateFilterExpression__Cell_stateAssignment_2"
    // InternalChessGame.g:2486:1: rule__StateFilterExpression__Cell_stateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__StateFilterExpression__Cell_stateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2490:1: ( ( ( RULE_ID ) ) )
            // InternalChessGame.g:2491:2: ( ( RULE_ID ) )
            {
            // InternalChessGame.g:2491:2: ( ( RULE_ID ) )
            // InternalChessGame.g:2492:3: ( RULE_ID )
            {
             before(grammarAccess.getStateFilterExpressionAccess().getCell_stateCellStateCrossReference_2_0()); 
            // InternalChessGame.g:2493:3: ( RULE_ID )
            // InternalChessGame.g:2494:4: RULE_ID
            {
             before(grammarAccess.getStateFilterExpressionAccess().getCell_stateCellStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateFilterExpressionAccess().getCell_stateCellStateIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getStateFilterExpressionAccess().getCell_stateCellStateCrossReference_2_0()); 

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
    // $ANTLR end "rule__StateFilterExpression__Cell_stateAssignment_2"


    // $ANTLR start "rule__EndBehaviour__MessageAssignment_2"
    // InternalChessGame.g:2505:1: rule__EndBehaviour__MessageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EndBehaviour__MessageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChessGame.g:2509:1: ( ( RULE_STRING ) )
            // InternalChessGame.g:2510:2: ( RULE_STRING )
            {
            // InternalChessGame.g:2510:2: ( RULE_STRING )
            // InternalChessGame.g:2511:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});

}