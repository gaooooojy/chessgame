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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChessGameParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'field'", "'{'", "'width'", "'='", "'height'", "'}'", "'transitions'", "'display'", "'text'", "'color'", "'black'", "'white'", "'click'", "'and'", "'goto'", "'mouse-left'", "'mouse-right'", "'action'", "'when'", "'do'", "'.'", "'allCellState'", "'('", "')'", "'empty'", "'end-game'"
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
    // InternalChessGame.g:64:1: entryRuleChessProgram returns [EObject current=null] : iv_ruleChessProgram= ruleChessProgram EOF ;
    public final EObject entryRuleChessProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChessProgram = null;


        try {
            // InternalChessGame.g:64:53: (iv_ruleChessProgram= ruleChessProgram EOF )
            // InternalChessGame.g:65:2: iv_ruleChessProgram= ruleChessProgram EOF
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
    // InternalChessGame.g:71:1: ruleChessProgram returns [EObject current=null] : ( (lv_states_0_0= ruleStatements ) )* ;
    public final EObject ruleChessProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_states_0_0 = null;



        	enterRule();

        try {
            // InternalChessGame.g:77:2: ( ( (lv_states_0_0= ruleStatements ) )* )
            // InternalChessGame.g:78:2: ( (lv_states_0_0= ruleStatements ) )*
            {
            // InternalChessGame.g:78:2: ( (lv_states_0_0= ruleStatements ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11||LA1_0==28) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalChessGame.g:79:3: (lv_states_0_0= ruleStatements )
            	    {
            	    // InternalChessGame.g:79:3: (lv_states_0_0= ruleStatements )
            	    // InternalChessGame.g:80:4: lv_states_0_0= ruleStatements
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
    // InternalChessGame.g:100:1: entryRuleStatements returns [EObject current=null] : iv_ruleStatements= ruleStatements EOF ;
    public final EObject entryRuleStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatements = null;


        try {
            // InternalChessGame.g:100:51: (iv_ruleStatements= ruleStatements EOF )
            // InternalChessGame.g:101:2: iv_ruleStatements= ruleStatements EOF
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
    // InternalChessGame.g:107:1: ruleStatements returns [EObject current=null] : (this_FieldSpecification_0= ruleFieldSpecification | this_OptionSpecification_1= ruleOptionSpecification | this_GameEnd_2= ruleGameEnd ) ;
    public final EObject ruleStatements() throws RecognitionException {
        EObject current = null;

        EObject this_FieldSpecification_0 = null;

        EObject this_OptionSpecification_1 = null;

        EObject this_GameEnd_2 = null;



        	enterRule();

        try {
            // InternalChessGame.g:113:2: ( (this_FieldSpecification_0= ruleFieldSpecification | this_OptionSpecification_1= ruleOptionSpecification | this_GameEnd_2= ruleGameEnd ) )
            // InternalChessGame.g:114:2: (this_FieldSpecification_0= ruleFieldSpecification | this_OptionSpecification_1= ruleOptionSpecification | this_GameEnd_2= ruleGameEnd )
            {
            // InternalChessGame.g:114:2: (this_FieldSpecification_0= ruleFieldSpecification | this_OptionSpecification_1= ruleOptionSpecification | this_GameEnd_2= ruleGameEnd )
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
            case 28:
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
                    // InternalChessGame.g:115:3: this_FieldSpecification_0= ruleFieldSpecification
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
                    // InternalChessGame.g:124:3: this_OptionSpecification_1= ruleOptionSpecification
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getOptionSpecificationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OptionSpecification_1=ruleOptionSpecification();

                    state._fsp--;


                    			current = this_OptionSpecification_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalChessGame.g:133:3: this_GameEnd_2= ruleGameEnd
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
    // InternalChessGame.g:145:1: entryRuleFieldSpecification returns [EObject current=null] : iv_ruleFieldSpecification= ruleFieldSpecification EOF ;
    public final EObject entryRuleFieldSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSpecification = null;


        try {
            // InternalChessGame.g:145:59: (iv_ruleFieldSpecification= ruleFieldSpecification EOF )
            // InternalChessGame.g:146:2: iv_ruleFieldSpecification= ruleFieldSpecification EOF
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
    // InternalChessGame.g:152:1: ruleFieldSpecification returns [EObject current=null] : (otherlv_0= 'field' otherlv_1= '{' otherlv_2= 'width' otherlv_3= '=' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'height' otherlv_6= '=' ( (lv_height_7_0= RULE_INT ) ) otherlv_8= '}' ) ;
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
            // InternalChessGame.g:158:2: ( (otherlv_0= 'field' otherlv_1= '{' otherlv_2= 'width' otherlv_3= '=' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'height' otherlv_6= '=' ( (lv_height_7_0= RULE_INT ) ) otherlv_8= '}' ) )
            // InternalChessGame.g:159:2: (otherlv_0= 'field' otherlv_1= '{' otherlv_2= 'width' otherlv_3= '=' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'height' otherlv_6= '=' ( (lv_height_7_0= RULE_INT ) ) otherlv_8= '}' )
            {
            // InternalChessGame.g:159:2: (otherlv_0= 'field' otherlv_1= '{' otherlv_2= 'width' otherlv_3= '=' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'height' otherlv_6= '=' ( (lv_height_7_0= RULE_INT ) ) otherlv_8= '}' )
            // InternalChessGame.g:160:3: otherlv_0= 'field' otherlv_1= '{' otherlv_2= 'width' otherlv_3= '=' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'height' otherlv_6= '=' ( (lv_height_7_0= RULE_INT ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldSpecificationAccess().getFieldKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldSpecificationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFieldSpecificationAccess().getWidthKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_3());
            		
            // InternalChessGame.g:176:3: ( (lv_width_4_0= RULE_INT ) )
            // InternalChessGame.g:177:4: (lv_width_4_0= RULE_INT )
            {
            // InternalChessGame.g:177:4: (lv_width_4_0= RULE_INT )
            // InternalChessGame.g:178:5: lv_width_4_0= RULE_INT
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
            		
            // InternalChessGame.g:202:3: ( (lv_height_7_0= RULE_INT ) )
            // InternalChessGame.g:203:4: (lv_height_7_0= RULE_INT )
            {
            // InternalChessGame.g:203:4: (lv_height_7_0= RULE_INT )
            // InternalChessGame.g:204:5: lv_height_7_0= RULE_INT
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


    // $ANTLR start "entryRuleOptionSpecification"
    // InternalChessGame.g:228:1: entryRuleOptionSpecification returns [EObject current=null] : iv_ruleOptionSpecification= ruleOptionSpecification EOF ;
    public final EObject entryRuleOptionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionSpecification = null;


        try {
            // InternalChessGame.g:228:60: (iv_ruleOptionSpecification= ruleOptionSpecification EOF )
            // InternalChessGame.g:229:2: iv_ruleOptionSpecification= ruleOptionSpecification EOF
            {
             newCompositeNode(grammarAccess.getOptionSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionSpecification=ruleOptionSpecification();

            state._fsp--;

             current =iv_ruleOptionSpecification; 
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
    // $ANTLR end "entryRuleOptionSpecification"


    // $ANTLR start "ruleOptionSpecification"
    // InternalChessGame.g:235:1: ruleOptionSpecification returns [EObject current=null] : ( (lv_states_0_0= ruleCellState ) )+ ;
    public final EObject ruleOptionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_states_0_0 = null;



        	enterRule();

        try {
            // InternalChessGame.g:241:2: ( ( (lv_states_0_0= ruleCellState ) )+ )
            // InternalChessGame.g:242:2: ( (lv_states_0_0= ruleCellState ) )+
            {
            // InternalChessGame.g:242:2: ( (lv_states_0_0= ruleCellState ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalChessGame.g:243:3: (lv_states_0_0= ruleCellState )
            	    {
            	    // InternalChessGame.g:243:3: (lv_states_0_0= ruleCellState )
            	    // InternalChessGame.g:244:4: lv_states_0_0= ruleCellState
            	    {

            	    				newCompositeNode(grammarAccess.getOptionSpecificationAccess().getStatesCellStateParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_10);
            	    lv_states_0_0=ruleCellState();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getOptionSpecificationRule());
            	    				}
            	    				add(
            	    					current,
            	    					"states",
            	    					lv_states_0_0,
            	    					"uk.ac.kcl.inf.chessgame.ChessGame.CellState");
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
    // $ANTLR end "ruleOptionSpecification"


    // $ANTLR start "entryRuleCellState"
    // InternalChessGame.g:264:1: entryRuleCellState returns [EObject current=null] : iv_ruleCellState= ruleCellState EOF ;
    public final EObject entryRuleCellState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellState = null;


        try {
            // InternalChessGame.g:264:50: (iv_ruleCellState= ruleCellState EOF )
            // InternalChessGame.g:265:2: iv_ruleCellState= ruleCellState EOF
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
    // InternalChessGame.g:271:1: ruleCellState returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplay ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransition ) )+ otherlv_6= '}' )? otherlv_7= '}' ) ;
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
            // InternalChessGame.g:277:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplay ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransition ) )+ otherlv_6= '}' )? otherlv_7= '}' ) )
            // InternalChessGame.g:278:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplay ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransition ) )+ otherlv_6= '}' )? otherlv_7= '}' )
            {
            // InternalChessGame.g:278:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplay ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransition ) )+ otherlv_6= '}' )? otherlv_7= '}' )
            // InternalChessGame.g:279:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplay ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransition ) )+ otherlv_6= '}' )? otherlv_7= '}'
            {
            // InternalChessGame.g:279:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalChessGame.g:280:4: (lv_name_0_0= RULE_ID )
            {
            // InternalChessGame.g:280:4: (lv_name_0_0= RULE_ID )
            // InternalChessGame.g:281:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalChessGame.g:301:3: ( (lv_display_2_0= ruleCellDisplay ) )
            // InternalChessGame.g:302:4: (lv_display_2_0= ruleCellDisplay )
            {
            // InternalChessGame.g:302:4: (lv_display_2_0= ruleCellDisplay )
            // InternalChessGame.g:303:5: lv_display_2_0= ruleCellDisplay
            {

            					newCompositeNode(grammarAccess.getCellStateAccess().getDisplayCellDisplayParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalChessGame.g:320:3: (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransition ) )+ otherlv_6= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalChessGame.g:321:4: otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransition ) )+ otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getCellStateAccess().getTransitionsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalChessGame.g:329:4: ( (lv_transitions_5_0= ruleTransition ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==23) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalChessGame.g:330:5: (lv_transitions_5_0= ruleTransition )
                    	    {
                    	    // InternalChessGame.g:330:5: (lv_transitions_5_0= ruleTransition )
                    	    // InternalChessGame.g:331:6: lv_transitions_5_0= ruleTransition
                    	    {

                    	    						newCompositeNode(grammarAccess.getCellStateAccess().getTransitionsTransitionParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
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
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
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
    // InternalChessGame.g:361:1: entryRuleCellDisplay returns [EObject current=null] : iv_ruleCellDisplay= ruleCellDisplay EOF ;
    public final EObject entryRuleCellDisplay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellDisplay = null;


        try {
            // InternalChessGame.g:361:52: (iv_ruleCellDisplay= ruleCellDisplay EOF )
            // InternalChessGame.g:362:2: iv_ruleCellDisplay= ruleCellDisplay EOF
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
    // InternalChessGame.g:368:1: ruleCellDisplay returns [EObject current=null] : (otherlv_0= 'display' otherlv_1= '{' ( (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) ) | (otherlv_5= 'color' otherlv_6= '=' ( ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) ) ) ) ) otherlv_8= '}' ) ;
    public final EObject ruleCellDisplay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_text_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_color_7_1=null;
        Token lv_color_7_2=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalChessGame.g:374:2: ( (otherlv_0= 'display' otherlv_1= '{' ( (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) ) | (otherlv_5= 'color' otherlv_6= '=' ( ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) ) ) ) ) otherlv_8= '}' ) )
            // InternalChessGame.g:375:2: (otherlv_0= 'display' otherlv_1= '{' ( (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) ) | (otherlv_5= 'color' otherlv_6= '=' ( ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) ) ) ) ) otherlv_8= '}' )
            {
            // InternalChessGame.g:375:2: (otherlv_0= 'display' otherlv_1= '{' ( (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) ) | (otherlv_5= 'color' otherlv_6= '=' ( ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) ) ) ) ) otherlv_8= '}' )
            // InternalChessGame.g:376:3: otherlv_0= 'display' otherlv_1= '{' ( (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) ) | (otherlv_5= 'color' otherlv_6= '=' ( ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) ) ) ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCellDisplayAccess().getDisplayKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getCellDisplayAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalChessGame.g:384:3: ( (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) ) | (otherlv_5= 'color' otherlv_6= '=' ( ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalChessGame.g:385:4: (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) )
                    {
                    // InternalChessGame.g:385:4: (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) )
                    // InternalChessGame.g:386:5: otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getCellDisplayAccess().getTextKeyword_2_0_0());
                    				
                    otherlv_3=(Token)match(input,14,FOLLOW_16); 

                    					newLeafNode(otherlv_3, grammarAccess.getCellDisplayAccess().getEqualsSignKeyword_2_0_1());
                    				
                    // InternalChessGame.g:394:5: ( (lv_text_4_0= RULE_STRING ) )
                    // InternalChessGame.g:395:6: (lv_text_4_0= RULE_STRING )
                    {
                    // InternalChessGame.g:395:6: (lv_text_4_0= RULE_STRING )
                    // InternalChessGame.g:396:7: lv_text_4_0= RULE_STRING
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
                    // InternalChessGame.g:414:4: (otherlv_5= 'color' otherlv_6= '=' ( ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) ) ) )
                    {
                    // InternalChessGame.g:414:4: (otherlv_5= 'color' otherlv_6= '=' ( ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) ) ) )
                    // InternalChessGame.g:415:5: otherlv_5= 'color' otherlv_6= '=' ( ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_6); 

                    					newLeafNode(otherlv_5, grammarAccess.getCellDisplayAccess().getColorKeyword_2_1_0());
                    				
                    otherlv_6=(Token)match(input,14,FOLLOW_17); 

                    					newLeafNode(otherlv_6, grammarAccess.getCellDisplayAccess().getEqualsSignKeyword_2_1_1());
                    				
                    // InternalChessGame.g:423:5: ( ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) ) )
                    // InternalChessGame.g:424:6: ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) )
                    {
                    // InternalChessGame.g:424:6: ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) )
                    // InternalChessGame.g:425:7: (lv_color_7_1= 'black' | lv_color_7_2= 'white' )
                    {
                    // InternalChessGame.g:425:7: (lv_color_7_1= 'black' | lv_color_7_2= 'white' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==21) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==22) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalChessGame.g:426:8: lv_color_7_1= 'black'
                            {
                            lv_color_7_1=(Token)match(input,21,FOLLOW_9); 

                            								newLeafNode(lv_color_7_1, grammarAccess.getCellDisplayAccess().getColorBlackKeyword_2_1_2_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getCellDisplayRule());
                            								}
                            								setWithLastConsumed(current, "color", lv_color_7_1, null);
                            							

                            }
                            break;
                        case 2 :
                            // InternalChessGame.g:437:8: lv_color_7_2= 'white'
                            {
                            lv_color_7_2=(Token)match(input,22,FOLLOW_9); 

                            								newLeafNode(lv_color_7_2, grammarAccess.getCellDisplayAccess().getColorWhiteKeyword_2_1_2_0_1());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getCellDisplayRule());
                            								}
                            								setWithLastConsumed(current, "color", lv_color_7_2, null);
                            							

                            }
                            break;

                    }


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
    // InternalChessGame.g:460:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalChessGame.g:460:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalChessGame.g:461:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalChessGame.g:467:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'click' ( (lv_trigger_1_0= ruleMouseTrigger ) ) otherlv_2= 'and' otherlv_3= 'goto' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_trigger_1_0 = null;



        	enterRule();

        try {
            // InternalChessGame.g:473:2: ( (otherlv_0= 'click' ( (lv_trigger_1_0= ruleMouseTrigger ) ) otherlv_2= 'and' otherlv_3= 'goto' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalChessGame.g:474:2: (otherlv_0= 'click' ( (lv_trigger_1_0= ruleMouseTrigger ) ) otherlv_2= 'and' otherlv_3= 'goto' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalChessGame.g:474:2: (otherlv_0= 'click' ( (lv_trigger_1_0= ruleMouseTrigger ) ) otherlv_2= 'and' otherlv_3= 'goto' ( (otherlv_4= RULE_ID ) ) )
            // InternalChessGame.g:475:3: otherlv_0= 'click' ( (lv_trigger_1_0= ruleMouseTrigger ) ) otherlv_2= 'and' otherlv_3= 'goto' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getClickKeyword_0());
            		
            // InternalChessGame.g:479:3: ( (lv_trigger_1_0= ruleMouseTrigger ) )
            // InternalChessGame.g:480:4: (lv_trigger_1_0= ruleMouseTrigger )
            {
            // InternalChessGame.g:480:4: (lv_trigger_1_0= ruleMouseTrigger )
            // InternalChessGame.g:481:5: lv_trigger_1_0= ruleMouseTrigger
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getTriggerMouseTriggerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_2=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getAndKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getGotoKeyword_3());
            		
            // InternalChessGame.g:506:3: ( (otherlv_4= RULE_ID ) )
            // InternalChessGame.g:507:4: (otherlv_4= RULE_ID )
            {
            // InternalChessGame.g:507:4: (otherlv_4= RULE_ID )
            // InternalChessGame.g:508:5: otherlv_4= RULE_ID
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
    // InternalChessGame.g:523:1: entryRuleMouseTrigger returns [EObject current=null] : iv_ruleMouseTrigger= ruleMouseTrigger EOF ;
    public final EObject entryRuleMouseTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMouseTrigger = null;


        try {
            // InternalChessGame.g:523:53: (iv_ruleMouseTrigger= ruleMouseTrigger EOF )
            // InternalChessGame.g:524:2: iv_ruleMouseTrigger= ruleMouseTrigger EOF
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
    // InternalChessGame.g:530:1: ruleMouseTrigger returns [EObject current=null] : ( ( (lv_mouse_0_0= 'mouse-left' ) ) | (otherlv_1= 'mouse-right' () ) ) ;
    public final EObject ruleMouseTrigger() throws RecognitionException {
        EObject current = null;

        Token lv_mouse_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalChessGame.g:536:2: ( ( ( (lv_mouse_0_0= 'mouse-left' ) ) | (otherlv_1= 'mouse-right' () ) ) )
            // InternalChessGame.g:537:2: ( ( (lv_mouse_0_0= 'mouse-left' ) ) | (otherlv_1= 'mouse-right' () ) )
            {
            // InternalChessGame.g:537:2: ( ( (lv_mouse_0_0= 'mouse-left' ) ) | (otherlv_1= 'mouse-right' () ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalChessGame.g:538:3: ( (lv_mouse_0_0= 'mouse-left' ) )
                    {
                    // InternalChessGame.g:538:3: ( (lv_mouse_0_0= 'mouse-left' ) )
                    // InternalChessGame.g:539:4: (lv_mouse_0_0= 'mouse-left' )
                    {
                    // InternalChessGame.g:539:4: (lv_mouse_0_0= 'mouse-left' )
                    // InternalChessGame.g:540:5: lv_mouse_0_0= 'mouse-left'
                    {
                    lv_mouse_0_0=(Token)match(input,26,FOLLOW_2); 

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
                    // InternalChessGame.g:553:3: (otherlv_1= 'mouse-right' () )
                    {
                    // InternalChessGame.g:553:3: (otherlv_1= 'mouse-right' () )
                    // InternalChessGame.g:554:4: otherlv_1= 'mouse-right' ()
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getMouseTriggerAccess().getMouseRightKeyword_1_0());
                    			
                    // InternalChessGame.g:558:4: ()
                    // InternalChessGame.g:559:5: 
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
    // InternalChessGame.g:570:1: entryRuleGameEnd returns [EObject current=null] : iv_ruleGameEnd= ruleGameEnd EOF ;
    public final EObject entryRuleGameEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGameEnd = null;


        try {
            // InternalChessGame.g:570:48: (iv_ruleGameEnd= ruleGameEnd EOF )
            // InternalChessGame.g:571:2: iv_ruleGameEnd= ruleGameEnd EOF
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
    // InternalChessGame.g:577:1: ruleGameEnd returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'when' ( (lv_action_4_0= ruleCellExpression ) ) otherlv_5= 'do' ( (lv_behaviour_6_0= ruleEndBehaviour ) ) otherlv_7= '}' ) ;
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
            // InternalChessGame.g:583:2: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'when' ( (lv_action_4_0= ruleCellExpression ) ) otherlv_5= 'do' ( (lv_behaviour_6_0= ruleEndBehaviour ) ) otherlv_7= '}' ) )
            // InternalChessGame.g:584:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'when' ( (lv_action_4_0= ruleCellExpression ) ) otherlv_5= 'do' ( (lv_behaviour_6_0= ruleEndBehaviour ) ) otherlv_7= '}' )
            {
            // InternalChessGame.g:584:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'when' ( (lv_action_4_0= ruleCellExpression ) ) otherlv_5= 'do' ( (lv_behaviour_6_0= ruleEndBehaviour ) ) otherlv_7= '}' )
            // InternalChessGame.g:585:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'when' ( (lv_action_4_0= ruleCellExpression ) ) otherlv_5= 'do' ( (lv_behaviour_6_0= ruleEndBehaviour ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getGameEndAccess().getActionKeyword_0());
            		
            // InternalChessGame.g:589:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalChessGame.g:590:4: (lv_name_1_0= RULE_ID )
            {
            // InternalChessGame.g:590:4: (lv_name_1_0= RULE_ID )
            // InternalChessGame.g:591:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getGameEndAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getGameEndAccess().getWhenKeyword_3());
            		
            // InternalChessGame.g:615:3: ( (lv_action_4_0= ruleCellExpression ) )
            // InternalChessGame.g:616:4: (lv_action_4_0= ruleCellExpression )
            {
            // InternalChessGame.g:616:4: (lv_action_4_0= ruleCellExpression )
            // InternalChessGame.g:617:5: lv_action_4_0= ruleCellExpression
            {

            					newCompositeNode(grammarAccess.getGameEndAccess().getActionCellExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_5=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getGameEndAccess().getDoKeyword_5());
            		
            // InternalChessGame.g:638:3: ( (lv_behaviour_6_0= ruleEndBehaviour ) )
            // InternalChessGame.g:639:4: (lv_behaviour_6_0= ruleEndBehaviour )
            {
            // InternalChessGame.g:639:4: (lv_behaviour_6_0= ruleEndBehaviour )
            // InternalChessGame.g:640:5: lv_behaviour_6_0= ruleEndBehaviour
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
    // InternalChessGame.g:665:1: entryRuleCellExpression returns [EObject current=null] : iv_ruleCellExpression= ruleCellExpression EOF ;
    public final EObject entryRuleCellExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellExpression = null;


        try {
            // InternalChessGame.g:665:55: (iv_ruleCellExpression= ruleCellExpression EOF )
            // InternalChessGame.g:666:2: iv_ruleCellExpression= ruleCellExpression EOF
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
    // InternalChessGame.g:672:1: ruleCellExpression returns [EObject current=null] : ( ( (lv_state_0_0= ruleStateCheck ) ) otherlv_1= '.' ( (lv_cellState_2_0= ruleEmptyExpression ) ) ) ;
    public final EObject ruleCellExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_state_0_0 = null;

        EObject lv_cellState_2_0 = null;



        	enterRule();

        try {
            // InternalChessGame.g:678:2: ( ( ( (lv_state_0_0= ruleStateCheck ) ) otherlv_1= '.' ( (lv_cellState_2_0= ruleEmptyExpression ) ) ) )
            // InternalChessGame.g:679:2: ( ( (lv_state_0_0= ruleStateCheck ) ) otherlv_1= '.' ( (lv_cellState_2_0= ruleEmptyExpression ) ) )
            {
            // InternalChessGame.g:679:2: ( ( (lv_state_0_0= ruleStateCheck ) ) otherlv_1= '.' ( (lv_cellState_2_0= ruleEmptyExpression ) ) )
            // InternalChessGame.g:680:3: ( (lv_state_0_0= ruleStateCheck ) ) otherlv_1= '.' ( (lv_cellState_2_0= ruleEmptyExpression ) )
            {
            // InternalChessGame.g:680:3: ( (lv_state_0_0= ruleStateCheck ) )
            // InternalChessGame.g:681:4: (lv_state_0_0= ruleStateCheck )
            {
            // InternalChessGame.g:681:4: (lv_state_0_0= ruleStateCheck )
            // InternalChessGame.g:682:5: lv_state_0_0= ruleStateCheck
            {

            					newCompositeNode(grammarAccess.getCellExpressionAccess().getStateStateCheckParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_1=(Token)match(input,31,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getCellExpressionAccess().getFullStopKeyword_1());
            		
            // InternalChessGame.g:703:3: ( (lv_cellState_2_0= ruleEmptyExpression ) )
            // InternalChessGame.g:704:4: (lv_cellState_2_0= ruleEmptyExpression )
            {
            // InternalChessGame.g:704:4: (lv_cellState_2_0= ruleEmptyExpression )
            // InternalChessGame.g:705:5: lv_cellState_2_0= ruleEmptyExpression
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
    // InternalChessGame.g:726:1: entryRuleStateCheck returns [EObject current=null] : iv_ruleStateCheck= ruleStateCheck EOF ;
    public final EObject entryRuleStateCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateCheck = null;


        try {
            // InternalChessGame.g:726:51: (iv_ruleStateCheck= ruleStateCheck EOF )
            // InternalChessGame.g:727:2: iv_ruleStateCheck= ruleStateCheck EOF
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
    // InternalChessGame.g:733:1: ruleStateCheck returns [EObject current=null] : (otherlv_0= 'allCellState' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleStateCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalChessGame.g:739:2: ( (otherlv_0= 'allCellState' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalChessGame.g:740:2: (otherlv_0= 'allCellState' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalChessGame.g:740:2: (otherlv_0= 'allCellState' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalChessGame.g:741:3: otherlv_0= 'allCellState' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getStateCheckAccess().getAllCellStateKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getStateCheckAccess().getLeftParenthesisKeyword_1());
            		
            // InternalChessGame.g:749:3: ( (otherlv_2= RULE_ID ) )
            // InternalChessGame.g:750:4: (otherlv_2= RULE_ID )
            {
            // InternalChessGame.g:750:4: (otherlv_2= RULE_ID )
            // InternalChessGame.g:751:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateCheckRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_2, grammarAccess.getStateCheckAccess().getCell_stateCellStateCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_2); 

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
    // InternalChessGame.g:770:1: entryRuleEmptyExpression returns [EObject current=null] : iv_ruleEmptyExpression= ruleEmptyExpression EOF ;
    public final EObject entryRuleEmptyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyExpression = null;


        try {
            // InternalChessGame.g:770:56: (iv_ruleEmptyExpression= ruleEmptyExpression EOF )
            // InternalChessGame.g:771:2: iv_ruleEmptyExpression= ruleEmptyExpression EOF
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
    // InternalChessGame.g:777:1: ruleEmptyExpression returns [EObject current=null] : (otherlv_0= 'empty' otherlv_1= '(' otherlv_2= ')' () ) ;
    public final EObject ruleEmptyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalChessGame.g:783:2: ( (otherlv_0= 'empty' otherlv_1= '(' otherlv_2= ')' () ) )
            // InternalChessGame.g:784:2: (otherlv_0= 'empty' otherlv_1= '(' otherlv_2= ')' () )
            {
            // InternalChessGame.g:784:2: (otherlv_0= 'empty' otherlv_1= '(' otherlv_2= ')' () )
            // InternalChessGame.g:785:3: otherlv_0= 'empty' otherlv_1= '(' otherlv_2= ')' ()
            {
            otherlv_0=(Token)match(input,35,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getEmptyExpressionAccess().getEmptyKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getEmptyExpressionAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEmptyExpressionAccess().getRightParenthesisKeyword_2());
            		
            // InternalChessGame.g:797:3: ()
            // InternalChessGame.g:798:4: 
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
    // InternalChessGame.g:808:1: entryRuleEndBehaviour returns [EObject current=null] : iv_ruleEndBehaviour= ruleEndBehaviour EOF ;
    public final EObject entryRuleEndBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndBehaviour = null;


        try {
            // InternalChessGame.g:808:53: (iv_ruleEndBehaviour= ruleEndBehaviour EOF )
            // InternalChessGame.g:809:2: iv_ruleEndBehaviour= ruleEndBehaviour EOF
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
    // InternalChessGame.g:815:1: ruleEndBehaviour returns [EObject current=null] : (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleEndBehaviour() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_message_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalChessGame.g:821:2: ( (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalChessGame.g:822:2: (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalChessGame.g:822:2: (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalChessGame.g:823:3: otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getEndBehaviourAccess().getEndGameKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getEndBehaviourAccess().getLeftParenthesisKeyword_1());
            		
            // InternalChessGame.g:831:3: ( (lv_message_2_0= RULE_STRING ) )
            // InternalChessGame.g:832:4: (lv_message_2_0= RULE_STRING )
            {
            // InternalChessGame.g:832:4: (lv_message_2_0= RULE_STRING )
            // InternalChessGame.g:833:5: lv_message_2_0= RULE_STRING
            {
            lv_message_2_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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

            otherlv_3=(Token)match(input,34,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000822L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});

}