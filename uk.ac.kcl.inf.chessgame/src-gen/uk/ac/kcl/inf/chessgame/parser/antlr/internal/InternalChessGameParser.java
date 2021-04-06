package uk.ac.kcl.inf.chessgame.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.chessgame.services.ChessGameGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChessGameParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'field'", "'{'", "'width'", "'='", "'height'", "'}'", "'transitions'", "'display'", "'text'", "'color'", "'click'", "'and'", "'goto'", "'mouse-left'", "'mouse-right'", "'action'", "'when'", "'do'", "'.'", "'allCellState'", "'('", "')'", "'empty'", "'end-game'", "'black'", "'white'"
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




    // $ANTLR start "entryRuleChessProgram"
    // InternalChessGame.g:65:1: entryRuleChessProgram returns [EObject current=null] : iv_ruleChessProgram= ruleChessProgram EOF ;
    public final EObject entryRuleChessProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChessProgram = null;


        try {
            // InternalChessGame.g:65:53: (iv_ruleChessProgram= ruleChessProgram EOF )
            // InternalChessGame.g:66:2: iv_ruleChessProgram= ruleChessProgram EOF
            {
             newCompositeNode(grammarAccess.getChessProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChessProgram=ruleChessProgram();

            state._fsp--;

             current =iv_ruleChessProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChessProgram"


    // $ANTLR start "ruleChessProgram"
    // InternalChessGame.g:72:1: ruleChessProgram returns [EObject current=null] : ( (lv_states_0_0= ruleStatements ) )* ;
    public final EObject ruleChessProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_states_0_0 = null;



        	enterRule();

        try {
            // InternalChessGame.g:78:2: ( ( (lv_states_0_0= ruleStatements ) )* )
            // InternalChessGame.g:79:2: ( (lv_states_0_0= ruleStatements ) )*
            {
            // InternalChessGame.g:79:2: ( (lv_states_0_0= ruleStatements ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11||LA1_0==26) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalChessGame.g:80:3: (lv_states_0_0= ruleStatements )
            	    {
            	    // InternalChessGame.g:80:3: (lv_states_0_0= ruleStatements )
            	    // InternalChessGame.g:81:4: lv_states_0_0= ruleStatements
            	    {

            	    				newCompositeNode(grammarAccess.getChessProgramAccess().getStatesStatementsParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_states_0_0=ruleStatements();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getChessProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"states",
            	    					lv_states_0_0,
            	    					"uk.ac.kcl.inf.chessgame.ChessGame.Statements");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChessProgram"


    // $ANTLR start "entryRuleStatements"
    // InternalChessGame.g:101:1: entryRuleStatements returns [EObject current=null] : iv_ruleStatements= ruleStatements EOF ;
    public final EObject entryRuleStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatements = null;


        try {
            // InternalChessGame.g:101:51: (iv_ruleStatements= ruleStatements EOF )
            // InternalChessGame.g:102:2: iv_ruleStatements= ruleStatements EOF
            {
             newCompositeNode(grammarAccess.getStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatements=ruleStatements();

            state._fsp--;

             current =iv_ruleStatements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatements"


    // $ANTLR start "ruleStatements"
    // InternalChessGame.g:108:1: ruleStatements returns [EObject current=null] : (this_FieldSpecification_0= ruleFieldSpecification | this_CellState_1= ruleCellState | this_GameEnd_2= ruleGameEnd ) ;
    public final EObject ruleStatements() throws RecognitionException {
        EObject current = null;

        EObject this_FieldSpecification_0 = null;

        EObject this_CellState_1 = null;

        EObject this_GameEnd_2 = null;



        	enterRule();

        try {
            // InternalChessGame.g:114:2: ( (this_FieldSpecification_0= ruleFieldSpecification | this_CellState_1= ruleCellState | this_GameEnd_2= ruleGameEnd ) )
            // InternalChessGame.g:115:2: (this_FieldSpecification_0= ruleFieldSpecification | this_CellState_1= ruleCellState | this_GameEnd_2= ruleGameEnd )
            {
            // InternalChessGame.g:115:2: (this_FieldSpecification_0= ruleFieldSpecification | this_CellState_1= ruleCellState | this_GameEnd_2= ruleGameEnd )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                alt2=2;
                }
                break;
            case 26:
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
                    // InternalChessGame.g:116:3: this_FieldSpecification_0= ruleFieldSpecification
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getFieldSpecificationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FieldSpecification_0=ruleFieldSpecification();

                    state._fsp--;


                    			current = this_FieldSpecification_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalChessGame.g:125:3: this_CellState_1= ruleCellState
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getCellStateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CellState_1=ruleCellState();

                    state._fsp--;


                    			current = this_CellState_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalChessGame.g:134:3: this_GameEnd_2= ruleGameEnd
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getGameEndParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GameEnd_2=ruleGameEnd();

                    state._fsp--;


                    			current = this_GameEnd_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatements"


    // $ANTLR start "entryRuleFieldSpecification"
    // InternalChessGame.g:146:1: entryRuleFieldSpecification returns [EObject current=null] : iv_ruleFieldSpecification= ruleFieldSpecification EOF ;
    public final EObject entryRuleFieldSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSpecification = null;


        try {
            // InternalChessGame.g:146:59: (iv_ruleFieldSpecification= ruleFieldSpecification EOF )
            // InternalChessGame.g:147:2: iv_ruleFieldSpecification= ruleFieldSpecification EOF
            {
             newCompositeNode(grammarAccess.getFieldSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldSpecification=ruleFieldSpecification();

            state._fsp--;

             current =iv_ruleFieldSpecification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldSpecification"


    // $ANTLR start "ruleFieldSpecification"
    // InternalChessGame.g:153:1: ruleFieldSpecification returns [EObject current=null] : (otherlv_0= 'field' otherlv_1= '{' otherlv_2= 'width' otherlv_3= '=' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'height' otherlv_6= '=' ( (lv_height_7_0= RULE_INT ) ) otherlv_8= '}' ) ;
    public final EObject ruleFieldSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_width_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_height_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalChessGame.g:159:2: ( (otherlv_0= 'field' otherlv_1= '{' otherlv_2= 'width' otherlv_3= '=' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'height' otherlv_6= '=' ( (lv_height_7_0= RULE_INT ) ) otherlv_8= '}' ) )
            // InternalChessGame.g:160:2: (otherlv_0= 'field' otherlv_1= '{' otherlv_2= 'width' otherlv_3= '=' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'height' otherlv_6= '=' ( (lv_height_7_0= RULE_INT ) ) otherlv_8= '}' )
            {
            // InternalChessGame.g:160:2: (otherlv_0= 'field' otherlv_1= '{' otherlv_2= 'width' otherlv_3= '=' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'height' otherlv_6= '=' ( (lv_height_7_0= RULE_INT ) ) otherlv_8= '}' )
            // InternalChessGame.g:161:3: otherlv_0= 'field' otherlv_1= '{' otherlv_2= 'width' otherlv_3= '=' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'height' otherlv_6= '=' ( (lv_height_7_0= RULE_INT ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldSpecificationAccess().getFieldKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldSpecificationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFieldSpecificationAccess().getWidthKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_3());
            		
            // InternalChessGame.g:177:3: ( (lv_width_4_0= RULE_INT ) )
            // InternalChessGame.g:178:4: (lv_width_4_0= RULE_INT )
            {
            // InternalChessGame.g:178:4: (lv_width_4_0= RULE_INT )
            // InternalChessGame.g:179:5: lv_width_4_0= RULE_INT
            {
            lv_width_4_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_width_4_0, grammarAccess.getFieldSpecificationAccess().getWidthINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getFieldSpecificationAccess().getHeightKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_6());
            		
            // InternalChessGame.g:203:3: ( (lv_height_7_0= RULE_INT ) )
            // InternalChessGame.g:204:4: (lv_height_7_0= RULE_INT )
            {
            // InternalChessGame.g:204:4: (lv_height_7_0= RULE_INT )
            // InternalChessGame.g:205:5: lv_height_7_0= RULE_INT
            {
            lv_height_7_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_height_7_0, grammarAccess.getFieldSpecificationAccess().getHeightINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"height",
            						lv_height_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getFieldSpecificationAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldSpecification"


    // $ANTLR start "entryRuleCellState"
    // InternalChessGame.g:229:1: entryRuleCellState returns [EObject current=null] : iv_ruleCellState= ruleCellState EOF ;
    public final EObject entryRuleCellState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellState = null;


        try {
            // InternalChessGame.g:229:50: (iv_ruleCellState= ruleCellState EOF )
            // InternalChessGame.g:230:2: iv_ruleCellState= ruleCellState EOF
            {
             newCompositeNode(grammarAccess.getCellStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCellState=ruleCellState();

            state._fsp--;

             current =iv_ruleCellState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCellState"


    // $ANTLR start "ruleCellState"
    // InternalChessGame.g:236:1: ruleCellState returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplay ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransition ) )+ otherlv_6= '}' )? otherlv_7= '}' ) ;
    public final EObject ruleCellState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_display_2_0 = null;

        EObject lv_transitions_5_0 = null;



        	enterRule();

        try {
            // InternalChessGame.g:242:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplay ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransition ) )+ otherlv_6= '}' )? otherlv_7= '}' ) )
            // InternalChessGame.g:243:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplay ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransition ) )+ otherlv_6= '}' )? otherlv_7= '}' )
            {
            // InternalChessGame.g:243:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplay ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransition ) )+ otherlv_6= '}' )? otherlv_7= '}' )
            // InternalChessGame.g:244:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplay ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransition ) )+ otherlv_6= '}' )? otherlv_7= '}'
            {
            // InternalChessGame.g:244:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalChessGame.g:245:4: (lv_name_0_0= RULE_ID )
            {
            // InternalChessGame.g:245:4: (lv_name_0_0= RULE_ID )
            // InternalChessGame.g:246:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCellStateAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCellStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalChessGame.g:266:3: ( (lv_display_2_0= ruleCellDisplay ) )
            // InternalChessGame.g:267:4: (lv_display_2_0= ruleCellDisplay )
            {
            // InternalChessGame.g:267:4: (lv_display_2_0= ruleCellDisplay )
            // InternalChessGame.g:268:5: lv_display_2_0= ruleCellDisplay
            {

            					newCompositeNode(grammarAccess.getCellStateAccess().getDisplayCellDisplayParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_display_2_0=ruleCellDisplay();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCellStateRule());
            					}
            					set(
            						current,
            						"display",
            						lv_display_2_0,
            						"uk.ac.kcl.inf.chessgame.ChessGame.CellDisplay");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChessGame.g:285:3: (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransition ) )+ otherlv_6= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalChessGame.g:286:4: otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransition ) )+ otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getCellStateAccess().getTransitionsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalChessGame.g:294:4: ( (lv_transitions_5_0= ruleTransition ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==21) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalChessGame.g:295:5: (lv_transitions_5_0= ruleTransition )
                    	    {
                    	    // InternalChessGame.g:295:5: (lv_transitions_5_0= ruleTransition )
                    	    // InternalChessGame.g:296:6: lv_transitions_5_0= ruleTransition
                    	    {

                    	    						newCompositeNode(grammarAccess.getCellStateAccess().getTransitionsTransitionParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_transitions_5_0=ruleTransition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCellStateRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"transitions",
                    	    							lv_transitions_5_0,
                    	    							"uk.ac.kcl.inf.chessgame.ChessGame.Transition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCellState"


    // $ANTLR start "entryRuleCellDisplay"
    // InternalChessGame.g:326:1: entryRuleCellDisplay returns [EObject current=null] : iv_ruleCellDisplay= ruleCellDisplay EOF ;
    public final EObject entryRuleCellDisplay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellDisplay = null;


        try {
            // InternalChessGame.g:326:52: (iv_ruleCellDisplay= ruleCellDisplay EOF )
            // InternalChessGame.g:327:2: iv_ruleCellDisplay= ruleCellDisplay EOF
            {
             newCompositeNode(grammarAccess.getCellDisplayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCellDisplay=ruleCellDisplay();

            state._fsp--;

             current =iv_ruleCellDisplay; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCellDisplay"


    // $ANTLR start "ruleCellDisplay"
    // InternalChessGame.g:333:1: ruleCellDisplay returns [EObject current=null] : (otherlv_0= 'display' otherlv_1= '{' ( (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) ) | (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= rulecolorChoice ) ) ) ) otherlv_8= '}' ) ;
    public final EObject ruleCellDisplay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_text_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_color_7_0 = null;



        	enterRule();

        try {
            // InternalChessGame.g:339:2: ( (otherlv_0= 'display' otherlv_1= '{' ( (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) ) | (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= rulecolorChoice ) ) ) ) otherlv_8= '}' ) )
            // InternalChessGame.g:340:2: (otherlv_0= 'display' otherlv_1= '{' ( (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) ) | (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= rulecolorChoice ) ) ) ) otherlv_8= '}' )
            {
            // InternalChessGame.g:340:2: (otherlv_0= 'display' otherlv_1= '{' ( (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) ) | (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= rulecolorChoice ) ) ) ) otherlv_8= '}' )
            // InternalChessGame.g:341:3: otherlv_0= 'display' otherlv_1= '{' ( (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) ) | (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= rulecolorChoice ) ) ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCellDisplayAccess().getDisplayKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getCellDisplayAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalChessGame.g:349:3: ( (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) ) | (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= rulecolorChoice ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalChessGame.g:350:4: (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) )
                    {
                    // InternalChessGame.g:350:4: (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) )
                    // InternalChessGame.g:351:5: otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getCellDisplayAccess().getTextKeyword_2_0_0());
                    				
                    otherlv_3=(Token)match(input,14,FOLLOW_15); 

                    					newLeafNode(otherlv_3, grammarAccess.getCellDisplayAccess().getEqualsSignKeyword_2_0_1());
                    				
                    // InternalChessGame.g:359:5: ( (lv_text_4_0= RULE_STRING ) )
                    // InternalChessGame.g:360:6: (lv_text_4_0= RULE_STRING )
                    {
                    // InternalChessGame.g:360:6: (lv_text_4_0= RULE_STRING )
                    // InternalChessGame.g:361:7: lv_text_4_0= RULE_STRING
                    {
                    lv_text_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    							newLeafNode(lv_text_4_0, grammarAccess.getCellDisplayAccess().getTextSTRINGTerminalRuleCall_2_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCellDisplayRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"text",
                    								lv_text_4_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalChessGame.g:379:4: (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= rulecolorChoice ) ) )
                    {
                    // InternalChessGame.g:379:4: (otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= rulecolorChoice ) ) )
                    // InternalChessGame.g:380:5: otherlv_5= 'color' otherlv_6= '=' ( (lv_color_7_0= rulecolorChoice ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_6); 

                    					newLeafNode(otherlv_5, grammarAccess.getCellDisplayAccess().getColorKeyword_2_1_0());
                    				
                    otherlv_6=(Token)match(input,14,FOLLOW_16); 

                    					newLeafNode(otherlv_6, grammarAccess.getCellDisplayAccess().getEqualsSignKeyword_2_1_1());
                    				
                    // InternalChessGame.g:388:5: ( (lv_color_7_0= rulecolorChoice ) )
                    // InternalChessGame.g:389:6: (lv_color_7_0= rulecolorChoice )
                    {
                    // InternalChessGame.g:389:6: (lv_color_7_0= rulecolorChoice )
                    // InternalChessGame.g:390:7: lv_color_7_0= rulecolorChoice
                    {

                    							newCompositeNode(grammarAccess.getCellDisplayAccess().getColorColorChoiceEnumRuleCall_2_1_2_0());
                    						
                    pushFollow(FOLLOW_9);
                    lv_color_7_0=rulecolorChoice();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCellDisplayRule());
                    							}
                    							set(
                    								current,
                    								"color",
                    								lv_color_7_0,
                    								"uk.ac.kcl.inf.chessgame.ChessGame.colorChoice");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCellDisplayAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCellDisplay"


    // $ANTLR start "entryRuleTransition"
    // InternalChessGame.g:417:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalChessGame.g:417:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalChessGame.g:418:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalChessGame.g:424:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'click' ( (lv_trigger_1_0= ruleMouseTrigger ) ) otherlv_2= 'and' otherlv_3= 'goto' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_trigger_1_0 = null;



        	enterRule();

        try {
            // InternalChessGame.g:430:2: ( (otherlv_0= 'click' ( (lv_trigger_1_0= ruleMouseTrigger ) ) otherlv_2= 'and' otherlv_3= 'goto' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalChessGame.g:431:2: (otherlv_0= 'click' ( (lv_trigger_1_0= ruleMouseTrigger ) ) otherlv_2= 'and' otherlv_3= 'goto' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalChessGame.g:431:2: (otherlv_0= 'click' ( (lv_trigger_1_0= ruleMouseTrigger ) ) otherlv_2= 'and' otherlv_3= 'goto' ( (otherlv_4= RULE_ID ) ) )
            // InternalChessGame.g:432:3: otherlv_0= 'click' ( (lv_trigger_1_0= ruleMouseTrigger ) ) otherlv_2= 'and' otherlv_3= 'goto' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getClickKeyword_0());
            		
            // InternalChessGame.g:436:3: ( (lv_trigger_1_0= ruleMouseTrigger ) )
            // InternalChessGame.g:437:4: (lv_trigger_1_0= ruleMouseTrigger )
            {
            // InternalChessGame.g:437:4: (lv_trigger_1_0= ruleMouseTrigger )
            // InternalChessGame.g:438:5: lv_trigger_1_0= ruleMouseTrigger
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getTriggerMouseTriggerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_trigger_1_0=ruleMouseTrigger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"trigger",
            						lv_trigger_1_0,
            						"uk.ac.kcl.inf.chessgame.ChessGame.MouseTrigger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getAndKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getGotoKeyword_3());
            		
            // InternalChessGame.g:463:3: ( (otherlv_4= RULE_ID ) )
            // InternalChessGame.g:464:4: (otherlv_4= RULE_ID )
            {
            // InternalChessGame.g:464:4: (otherlv_4= RULE_ID )
            // InternalChessGame.g:465:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getTargetCellStateCrossReference_4_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleMouseTrigger"
    // InternalChessGame.g:480:1: entryRuleMouseTrigger returns [EObject current=null] : iv_ruleMouseTrigger= ruleMouseTrigger EOF ;
    public final EObject entryRuleMouseTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMouseTrigger = null;


        try {
            // InternalChessGame.g:480:53: (iv_ruleMouseTrigger= ruleMouseTrigger EOF )
            // InternalChessGame.g:481:2: iv_ruleMouseTrigger= ruleMouseTrigger EOF
            {
             newCompositeNode(grammarAccess.getMouseTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMouseTrigger=ruleMouseTrigger();

            state._fsp--;

             current =iv_ruleMouseTrigger; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMouseTrigger"


    // $ANTLR start "ruleMouseTrigger"
    // InternalChessGame.g:487:1: ruleMouseTrigger returns [EObject current=null] : ( ( (lv_mouse_0_0= 'mouse-left' ) ) | (otherlv_1= 'mouse-right' () ) ) ;
    public final EObject ruleMouseTrigger() throws RecognitionException {
        EObject current = null;

        Token lv_mouse_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalChessGame.g:493:2: ( ( ( (lv_mouse_0_0= 'mouse-left' ) ) | (otherlv_1= 'mouse-right' () ) ) )
            // InternalChessGame.g:494:2: ( ( (lv_mouse_0_0= 'mouse-left' ) ) | (otherlv_1= 'mouse-right' () ) )
            {
            // InternalChessGame.g:494:2: ( ( (lv_mouse_0_0= 'mouse-left' ) ) | (otherlv_1= 'mouse-right' () ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalChessGame.g:495:3: ( (lv_mouse_0_0= 'mouse-left' ) )
                    {
                    // InternalChessGame.g:495:3: ( (lv_mouse_0_0= 'mouse-left' ) )
                    // InternalChessGame.g:496:4: (lv_mouse_0_0= 'mouse-left' )
                    {
                    // InternalChessGame.g:496:4: (lv_mouse_0_0= 'mouse-left' )
                    // InternalChessGame.g:497:5: lv_mouse_0_0= 'mouse-left'
                    {
                    lv_mouse_0_0=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_mouse_0_0, grammarAccess.getMouseTriggerAccess().getMouseMouseLeftKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMouseTriggerRule());
                    					}
                    					setWithLastConsumed(current, "mouse", lv_mouse_0_0 != null, "mouse-left");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalChessGame.g:510:3: (otherlv_1= 'mouse-right' () )
                    {
                    // InternalChessGame.g:510:3: (otherlv_1= 'mouse-right' () )
                    // InternalChessGame.g:511:4: otherlv_1= 'mouse-right' ()
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getMouseTriggerAccess().getMouseRightKeyword_1_0());
                    			
                    // InternalChessGame.g:515:4: ()
                    // InternalChessGame.g:516:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMouseTriggerAccess().getMouseTriggerAction_1_1(),
                    						current);
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMouseTrigger"


    // $ANTLR start "entryRuleGameEnd"
    // InternalChessGame.g:527:1: entryRuleGameEnd returns [EObject current=null] : iv_ruleGameEnd= ruleGameEnd EOF ;
    public final EObject entryRuleGameEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGameEnd = null;


        try {
            // InternalChessGame.g:527:48: (iv_ruleGameEnd= ruleGameEnd EOF )
            // InternalChessGame.g:528:2: iv_ruleGameEnd= ruleGameEnd EOF
            {
             newCompositeNode(grammarAccess.getGameEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGameEnd=ruleGameEnd();

            state._fsp--;

             current =iv_ruleGameEnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGameEnd"


    // $ANTLR start "ruleGameEnd"
    // InternalChessGame.g:534:1: ruleGameEnd returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'when' ( (lv_action_4_0= ruleCellExpression ) ) otherlv_5= 'do' ( (lv_behaviour_6_0= ruleEndBehaviour ) ) otherlv_7= '}' ) ;
    public final EObject ruleGameEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_action_4_0 = null;

        EObject lv_behaviour_6_0 = null;



        	enterRule();

        try {
            // InternalChessGame.g:540:2: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'when' ( (lv_action_4_0= ruleCellExpression ) ) otherlv_5= 'do' ( (lv_behaviour_6_0= ruleEndBehaviour ) ) otherlv_7= '}' ) )
            // InternalChessGame.g:541:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'when' ( (lv_action_4_0= ruleCellExpression ) ) otherlv_5= 'do' ( (lv_behaviour_6_0= ruleEndBehaviour ) ) otherlv_7= '}' )
            {
            // InternalChessGame.g:541:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'when' ( (lv_action_4_0= ruleCellExpression ) ) otherlv_5= 'do' ( (lv_behaviour_6_0= ruleEndBehaviour ) ) otherlv_7= '}' )
            // InternalChessGame.g:542:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'when' ( (lv_action_4_0= ruleCellExpression ) ) otherlv_5= 'do' ( (lv_behaviour_6_0= ruleEndBehaviour ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getGameEndAccess().getActionKeyword_0());
            		
            // InternalChessGame.g:546:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalChessGame.g:547:4: (lv_name_1_0= RULE_ID )
            {
            // InternalChessGame.g:547:4: (lv_name_1_0= RULE_ID )
            // InternalChessGame.g:548:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGameEndAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGameEndRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getGameEndAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getGameEndAccess().getWhenKeyword_3());
            		
            // InternalChessGame.g:572:3: ( (lv_action_4_0= ruleCellExpression ) )
            // InternalChessGame.g:573:4: (lv_action_4_0= ruleCellExpression )
            {
            // InternalChessGame.g:573:4: (lv_action_4_0= ruleCellExpression )
            // InternalChessGame.g:574:5: lv_action_4_0= ruleCellExpression
            {

            					newCompositeNode(grammarAccess.getGameEndAccess().getActionCellExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_action_4_0=ruleCellExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameEndRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_4_0,
            						"uk.ac.kcl.inf.chessgame.ChessGame.CellExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getGameEndAccess().getDoKeyword_5());
            		
            // InternalChessGame.g:595:3: ( (lv_behaviour_6_0= ruleEndBehaviour ) )
            // InternalChessGame.g:596:4: (lv_behaviour_6_0= ruleEndBehaviour )
            {
            // InternalChessGame.g:596:4: (lv_behaviour_6_0= ruleEndBehaviour )
            // InternalChessGame.g:597:5: lv_behaviour_6_0= ruleEndBehaviour
            {

            					newCompositeNode(grammarAccess.getGameEndAccess().getBehaviourEndBehaviourParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_behaviour_6_0=ruleEndBehaviour();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameEndRule());
            					}
            					set(
            						current,
            						"behaviour",
            						lv_behaviour_6_0,
            						"uk.ac.kcl.inf.chessgame.ChessGame.EndBehaviour");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getGameEndAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGameEnd"


    // $ANTLR start "entryRuleCellExpression"
    // InternalChessGame.g:622:1: entryRuleCellExpression returns [EObject current=null] : iv_ruleCellExpression= ruleCellExpression EOF ;
    public final EObject entryRuleCellExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellExpression = null;


        try {
            // InternalChessGame.g:622:55: (iv_ruleCellExpression= ruleCellExpression EOF )
            // InternalChessGame.g:623:2: iv_ruleCellExpression= ruleCellExpression EOF
            {
             newCompositeNode(grammarAccess.getCellExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCellExpression=ruleCellExpression();

            state._fsp--;

             current =iv_ruleCellExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCellExpression"


    // $ANTLR start "ruleCellExpression"
    // InternalChessGame.g:629:1: ruleCellExpression returns [EObject current=null] : ( ( (lv_state_0_0= ruleStateCheck ) ) otherlv_1= '.' ( (lv_cellState_2_0= ruleEmptyExpression ) ) ) ;
    public final EObject ruleCellExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_state_0_0 = null;

        EObject lv_cellState_2_0 = null;



        	enterRule();

        try {
            // InternalChessGame.g:635:2: ( ( ( (lv_state_0_0= ruleStateCheck ) ) otherlv_1= '.' ( (lv_cellState_2_0= ruleEmptyExpression ) ) ) )
            // InternalChessGame.g:636:2: ( ( (lv_state_0_0= ruleStateCheck ) ) otherlv_1= '.' ( (lv_cellState_2_0= ruleEmptyExpression ) ) )
            {
            // InternalChessGame.g:636:2: ( ( (lv_state_0_0= ruleStateCheck ) ) otherlv_1= '.' ( (lv_cellState_2_0= ruleEmptyExpression ) ) )
            // InternalChessGame.g:637:3: ( (lv_state_0_0= ruleStateCheck ) ) otherlv_1= '.' ( (lv_cellState_2_0= ruleEmptyExpression ) )
            {
            // InternalChessGame.g:637:3: ( (lv_state_0_0= ruleStateCheck ) )
            // InternalChessGame.g:638:4: (lv_state_0_0= ruleStateCheck )
            {
            // InternalChessGame.g:638:4: (lv_state_0_0= ruleStateCheck )
            // InternalChessGame.g:639:5: lv_state_0_0= ruleStateCheck
            {

            					newCompositeNode(grammarAccess.getCellExpressionAccess().getStateStateCheckParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_state_0_0=ruleStateCheck();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCellExpressionRule());
            					}
            					set(
            						current,
            						"state",
            						lv_state_0_0,
            						"uk.ac.kcl.inf.chessgame.ChessGame.StateCheck");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getCellExpressionAccess().getFullStopKeyword_1());
            		
            // InternalChessGame.g:660:3: ( (lv_cellState_2_0= ruleEmptyExpression ) )
            // InternalChessGame.g:661:4: (lv_cellState_2_0= ruleEmptyExpression )
            {
            // InternalChessGame.g:661:4: (lv_cellState_2_0= ruleEmptyExpression )
            // InternalChessGame.g:662:5: lv_cellState_2_0= ruleEmptyExpression
            {

            					newCompositeNode(grammarAccess.getCellExpressionAccess().getCellStateEmptyExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_cellState_2_0=ruleEmptyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCellExpressionRule());
            					}
            					set(
            						current,
            						"cellState",
            						lv_cellState_2_0,
            						"uk.ac.kcl.inf.chessgame.ChessGame.EmptyExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCellExpression"


    // $ANTLR start "entryRuleStateCheck"
    // InternalChessGame.g:683:1: entryRuleStateCheck returns [EObject current=null] : iv_ruleStateCheck= ruleStateCheck EOF ;
    public final EObject entryRuleStateCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateCheck = null;


        try {
            // InternalChessGame.g:683:51: (iv_ruleStateCheck= ruleStateCheck EOF )
            // InternalChessGame.g:684:2: iv_ruleStateCheck= ruleStateCheck EOF
            {
             newCompositeNode(grammarAccess.getStateCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateCheck=ruleStateCheck();

            state._fsp--;

             current =iv_ruleStateCheck; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateCheck"


    // $ANTLR start "ruleStateCheck"
    // InternalChessGame.g:690:1: ruleStateCheck returns [EObject current=null] : (otherlv_0= 'allCellState' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleStateCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalChessGame.g:696:2: ( (otherlv_0= 'allCellState' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalChessGame.g:697:2: (otherlv_0= 'allCellState' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalChessGame.g:697:2: (otherlv_0= 'allCellState' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalChessGame.g:698:3: otherlv_0= 'allCellState' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getStateCheckAccess().getAllCellStateKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getStateCheckAccess().getLeftParenthesisKeyword_1());
            		
            // InternalChessGame.g:706:3: ( (otherlv_2= RULE_ID ) )
            // InternalChessGame.g:707:4: (otherlv_2= RULE_ID )
            {
            // InternalChessGame.g:707:4: (otherlv_2= RULE_ID )
            // InternalChessGame.g:708:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateCheckRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_2, grammarAccess.getStateCheckAccess().getCell_stateCellStateCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getStateCheckAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateCheck"


    // $ANTLR start "entryRuleEmptyExpression"
    // InternalChessGame.g:727:1: entryRuleEmptyExpression returns [EObject current=null] : iv_ruleEmptyExpression= ruleEmptyExpression EOF ;
    public final EObject entryRuleEmptyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyExpression = null;


        try {
            // InternalChessGame.g:727:56: (iv_ruleEmptyExpression= ruleEmptyExpression EOF )
            // InternalChessGame.g:728:2: iv_ruleEmptyExpression= ruleEmptyExpression EOF
            {
             newCompositeNode(grammarAccess.getEmptyExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmptyExpression=ruleEmptyExpression();

            state._fsp--;

             current =iv_ruleEmptyExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmptyExpression"


    // $ANTLR start "ruleEmptyExpression"
    // InternalChessGame.g:734:1: ruleEmptyExpression returns [EObject current=null] : (otherlv_0= 'empty' otherlv_1= '(' otherlv_2= ')' () ) ;
    public final EObject ruleEmptyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalChessGame.g:740:2: ( (otherlv_0= 'empty' otherlv_1= '(' otherlv_2= ')' () ) )
            // InternalChessGame.g:741:2: (otherlv_0= 'empty' otherlv_1= '(' otherlv_2= ')' () )
            {
            // InternalChessGame.g:741:2: (otherlv_0= 'empty' otherlv_1= '(' otherlv_2= ')' () )
            // InternalChessGame.g:742:3: otherlv_0= 'empty' otherlv_1= '(' otherlv_2= ')' ()
            {
            otherlv_0=(Token)match(input,33,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getEmptyExpressionAccess().getEmptyKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getEmptyExpressionAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEmptyExpressionAccess().getRightParenthesisKeyword_2());
            		
            // InternalChessGame.g:754:3: ()
            // InternalChessGame.g:755:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmptyExpressionAccess().getEmptyExpressionAction_3(),
            					current);
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmptyExpression"


    // $ANTLR start "entryRuleEndBehaviour"
    // InternalChessGame.g:765:1: entryRuleEndBehaviour returns [EObject current=null] : iv_ruleEndBehaviour= ruleEndBehaviour EOF ;
    public final EObject entryRuleEndBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndBehaviour = null;


        try {
            // InternalChessGame.g:765:53: (iv_ruleEndBehaviour= ruleEndBehaviour EOF )
            // InternalChessGame.g:766:2: iv_ruleEndBehaviour= ruleEndBehaviour EOF
            {
             newCompositeNode(grammarAccess.getEndBehaviourRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndBehaviour=ruleEndBehaviour();

            state._fsp--;

             current =iv_ruleEndBehaviour; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEndBehaviour"


    // $ANTLR start "ruleEndBehaviour"
    // InternalChessGame.g:772:1: ruleEndBehaviour returns [EObject current=null] : (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleEndBehaviour() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_message_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalChessGame.g:778:2: ( (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalChessGame.g:779:2: (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalChessGame.g:779:2: (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalChessGame.g:780:3: otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getEndBehaviourAccess().getEndGameKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getEndBehaviourAccess().getLeftParenthesisKeyword_1());
            		
            // InternalChessGame.g:788:3: ( (lv_message_2_0= RULE_STRING ) )
            // InternalChessGame.g:789:4: (lv_message_2_0= RULE_STRING )
            {
            // InternalChessGame.g:789:4: (lv_message_2_0= RULE_STRING )
            // InternalChessGame.g:790:5: lv_message_2_0= RULE_STRING
            {
            lv_message_2_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_message_2_0, grammarAccess.getEndBehaviourAccess().getMessageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndBehaviourRule());
            					}
            					setWithLastConsumed(
            						current,
            						"message",
            						lv_message_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEndBehaviourAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndBehaviour"


    // $ANTLR start "rulecolorChoice"
    // InternalChessGame.g:814:1: rulecolorChoice returns [Enumerator current=null] : ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'white' ) ) ;
    public final Enumerator rulecolorChoice() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalChessGame.g:820:2: ( ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'white' ) ) )
            // InternalChessGame.g:821:2: ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'white' ) )
            {
            // InternalChessGame.g:821:2: ( (enumLiteral_0= 'black' ) | (enumLiteral_1= 'white' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==35) ) {
                alt7=1;
            }
            else if ( (LA7_0==36) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalChessGame.g:822:3: (enumLiteral_0= 'black' )
                    {
                    // InternalChessGame.g:822:3: (enumLiteral_0= 'black' )
                    // InternalChessGame.g:823:4: enumLiteral_0= 'black'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getColorChoiceAccess().getBlackEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorChoiceAccess().getBlackEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalChessGame.g:830:3: (enumLiteral_1= 'white' )
                    {
                    // InternalChessGame.g:830:3: (enumLiteral_1= 'white' )
                    // InternalChessGame.g:831:4: enumLiteral_1= 'white'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getColorChoiceAccess().getWhiteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorChoiceAccess().getWhiteEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecolorChoice"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000822L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});

}