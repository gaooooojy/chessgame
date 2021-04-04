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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'field'", "'{'", "'width'", "'='", "'height'", "'FirstPlayer'", "'BlackFirst'", "'WhiteFirst'", "'}'", "'transitions'", "'display'", "'text'", "'color'", "'black'", "'white'", "'click'", "'and'", "'goto'", "'mouse-left'", "'mouse-right'", "'action'", "'when'", "'do'", "'.'", "'allCellState'", "'('", "')'", "'empty'", "'end-game'"
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
    // InternalChessGame.g:71:1: ruleChessProgram returns [EObject current=null] : ( ( (lv_size_0_0= ruleFieldSpecification ) ) ( (lv_options_1_0= ruleOptionSpecification ) ) ( (lv_endGame_2_0= ruleGameEnd ) ) ) ;
    public final EObject ruleChessProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_size_0_0 = null;

        EObject lv_options_1_0 = null;

        EObject lv_endGame_2_0 = null;



        	enterRule();

        try {
            // InternalChessGame.g:77:2: ( ( ( (lv_size_0_0= ruleFieldSpecification ) ) ( (lv_options_1_0= ruleOptionSpecification ) ) ( (lv_endGame_2_0= ruleGameEnd ) ) ) )
            // InternalChessGame.g:78:2: ( ( (lv_size_0_0= ruleFieldSpecification ) ) ( (lv_options_1_0= ruleOptionSpecification ) ) ( (lv_endGame_2_0= ruleGameEnd ) ) )
            {
            // InternalChessGame.g:78:2: ( ( (lv_size_0_0= ruleFieldSpecification ) ) ( (lv_options_1_0= ruleOptionSpecification ) ) ( (lv_endGame_2_0= ruleGameEnd ) ) )
            // InternalChessGame.g:79:3: ( (lv_size_0_0= ruleFieldSpecification ) ) ( (lv_options_1_0= ruleOptionSpecification ) ) ( (lv_endGame_2_0= ruleGameEnd ) )
            {
            // InternalChessGame.g:79:3: ( (lv_size_0_0= ruleFieldSpecification ) )
            // InternalChessGame.g:80:4: (lv_size_0_0= ruleFieldSpecification )
            {
            // InternalChessGame.g:80:4: (lv_size_0_0= ruleFieldSpecification )
            // InternalChessGame.g:81:5: lv_size_0_0= ruleFieldSpecification
            {

            					newCompositeNode(grammarAccess.getChessProgramAccess().getSizeFieldSpecificationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_size_0_0=ruleFieldSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChessProgramRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_0_0,
            						"uk.ac.kcl.inf.chessgame.ChessGame.FieldSpecification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChessGame.g:98:3: ( (lv_options_1_0= ruleOptionSpecification ) )
            // InternalChessGame.g:99:4: (lv_options_1_0= ruleOptionSpecification )
            {
            // InternalChessGame.g:99:4: (lv_options_1_0= ruleOptionSpecification )
            // InternalChessGame.g:100:5: lv_options_1_0= ruleOptionSpecification
            {

            					newCompositeNode(grammarAccess.getChessProgramAccess().getOptionsOptionSpecificationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_options_1_0=ruleOptionSpecification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChessProgramRule());
            					}
            					add(
            						current,
            						"options",
            						lv_options_1_0,
            						"uk.ac.kcl.inf.chessgame.ChessGame.OptionSpecification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChessGame.g:117:3: ( (lv_endGame_2_0= ruleGameEnd ) )
            // InternalChessGame.g:118:4: (lv_endGame_2_0= ruleGameEnd )
            {
            // InternalChessGame.g:118:4: (lv_endGame_2_0= ruleGameEnd )
            // InternalChessGame.g:119:5: lv_endGame_2_0= ruleGameEnd
            {

            					newCompositeNode(grammarAccess.getChessProgramAccess().getEndGameGameEndParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_endGame_2_0=ruleGameEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChessProgramRule());
            					}
            					set(
            						current,
            						"endGame",
            						lv_endGame_2_0,
            						"uk.ac.kcl.inf.chessgame.ChessGame.GameEnd");
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
    // $ANTLR end "ruleChessProgram"


    // $ANTLR start "entryRuleFieldSpecification"
    // InternalChessGame.g:140:1: entryRuleFieldSpecification returns [EObject current=null] : iv_ruleFieldSpecification= ruleFieldSpecification EOF ;
    public final EObject entryRuleFieldSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldSpecification = null;


        try {
            // InternalChessGame.g:140:59: (iv_ruleFieldSpecification= ruleFieldSpecification EOF )
            // InternalChessGame.g:141:2: iv_ruleFieldSpecification= ruleFieldSpecification EOF
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
    // InternalChessGame.g:147:1: ruleFieldSpecification returns [EObject current=null] : (otherlv_0= 'field' otherlv_1= '{' otherlv_2= 'width' otherlv_3= '=' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'height' otherlv_6= '=' ( (lv_height_7_0= RULE_INT ) ) otherlv_8= 'FirstPlayer' otherlv_9= '=' ( ( (lv_name_10_1= 'BlackFirst' | lv_name_10_2= 'WhiteFirst' ) ) ) otherlv_11= '}' ) ;
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
        Token otherlv_9=null;
        Token lv_name_10_1=null;
        Token lv_name_10_2=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalChessGame.g:153:2: ( (otherlv_0= 'field' otherlv_1= '{' otherlv_2= 'width' otherlv_3= '=' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'height' otherlv_6= '=' ( (lv_height_7_0= RULE_INT ) ) otherlv_8= 'FirstPlayer' otherlv_9= '=' ( ( (lv_name_10_1= 'BlackFirst' | lv_name_10_2= 'WhiteFirst' ) ) ) otherlv_11= '}' ) )
            // InternalChessGame.g:154:2: (otherlv_0= 'field' otherlv_1= '{' otherlv_2= 'width' otherlv_3= '=' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'height' otherlv_6= '=' ( (lv_height_7_0= RULE_INT ) ) otherlv_8= 'FirstPlayer' otherlv_9= '=' ( ( (lv_name_10_1= 'BlackFirst' | lv_name_10_2= 'WhiteFirst' ) ) ) otherlv_11= '}' )
            {
            // InternalChessGame.g:154:2: (otherlv_0= 'field' otherlv_1= '{' otherlv_2= 'width' otherlv_3= '=' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'height' otherlv_6= '=' ( (lv_height_7_0= RULE_INT ) ) otherlv_8= 'FirstPlayer' otherlv_9= '=' ( ( (lv_name_10_1= 'BlackFirst' | lv_name_10_2= 'WhiteFirst' ) ) ) otherlv_11= '}' )
            // InternalChessGame.g:155:3: otherlv_0= 'field' otherlv_1= '{' otherlv_2= 'width' otherlv_3= '=' ( (lv_width_4_0= RULE_INT ) ) otherlv_5= 'height' otherlv_6= '=' ( (lv_height_7_0= RULE_INT ) ) otherlv_8= 'FirstPlayer' otherlv_9= '=' ( ( (lv_name_10_1= 'BlackFirst' | lv_name_10_2= 'WhiteFirst' ) ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldSpecificationAccess().getFieldKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldSpecificationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getFieldSpecificationAccess().getWidthKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_3());
            		
            // InternalChessGame.g:171:3: ( (lv_width_4_0= RULE_INT ) )
            // InternalChessGame.g:172:4: (lv_width_4_0= RULE_INT )
            {
            // InternalChessGame.g:172:4: (lv_width_4_0= RULE_INT )
            // InternalChessGame.g:173:5: lv_width_4_0= RULE_INT
            {
            lv_width_4_0=(Token)match(input,RULE_INT,FOLLOW_9); 

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

            otherlv_5=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getFieldSpecificationAccess().getHeightKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_6());
            		
            // InternalChessGame.g:197:3: ( (lv_height_7_0= RULE_INT ) )
            // InternalChessGame.g:198:4: (lv_height_7_0= RULE_INT )
            {
            // InternalChessGame.g:198:4: (lv_height_7_0= RULE_INT )
            // InternalChessGame.g:199:5: lv_height_7_0= RULE_INT
            {
            lv_height_7_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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

            otherlv_8=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getFieldSpecificationAccess().getFirstPlayerKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getFieldSpecificationAccess().getEqualsSignKeyword_9());
            		
            // InternalChessGame.g:223:3: ( ( (lv_name_10_1= 'BlackFirst' | lv_name_10_2= 'WhiteFirst' ) ) )
            // InternalChessGame.g:224:4: ( (lv_name_10_1= 'BlackFirst' | lv_name_10_2= 'WhiteFirst' ) )
            {
            // InternalChessGame.g:224:4: ( (lv_name_10_1= 'BlackFirst' | lv_name_10_2= 'WhiteFirst' ) )
            // InternalChessGame.g:225:5: (lv_name_10_1= 'BlackFirst' | lv_name_10_2= 'WhiteFirst' )
            {
            // InternalChessGame.g:225:5: (lv_name_10_1= 'BlackFirst' | lv_name_10_2= 'WhiteFirst' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalChessGame.g:226:6: lv_name_10_1= 'BlackFirst'
                    {
                    lv_name_10_1=(Token)match(input,17,FOLLOW_12); 

                    						newLeafNode(lv_name_10_1, grammarAccess.getFieldSpecificationAccess().getNameBlackFirstKeyword_10_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldSpecificationRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_10_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalChessGame.g:237:6: lv_name_10_2= 'WhiteFirst'
                    {
                    lv_name_10_2=(Token)match(input,18,FOLLOW_12); 

                    						newLeafNode(lv_name_10_2, grammarAccess.getFieldSpecificationAccess().getNameWhiteFirstKeyword_10_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldSpecificationRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_10_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_11=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getFieldSpecificationAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalChessGame.g:258:1: entryRuleOptionSpecification returns [EObject current=null] : iv_ruleOptionSpecification= ruleOptionSpecification EOF ;
    public final EObject entryRuleOptionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionSpecification = null;


        try {
            // InternalChessGame.g:258:60: (iv_ruleOptionSpecification= ruleOptionSpecification EOF )
            // InternalChessGame.g:259:2: iv_ruleOptionSpecification= ruleOptionSpecification EOF
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
    // InternalChessGame.g:265:1: ruleOptionSpecification returns [EObject current=null] : ( (lv_states_0_0= ruleCellState ) )+ ;
    public final EObject ruleOptionSpecification() throws RecognitionException {
        EObject current = null;

        EObject lv_states_0_0 = null;



        	enterRule();

        try {
            // InternalChessGame.g:271:2: ( ( (lv_states_0_0= ruleCellState ) )+ )
            // InternalChessGame.g:272:2: ( (lv_states_0_0= ruleCellState ) )+
            {
            // InternalChessGame.g:272:2: ( (lv_states_0_0= ruleCellState ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalChessGame.g:273:3: (lv_states_0_0= ruleCellState )
            	    {
            	    // InternalChessGame.g:273:3: (lv_states_0_0= ruleCellState )
            	    // InternalChessGame.g:274:4: lv_states_0_0= ruleCellState
            	    {

            	    				newCompositeNode(grammarAccess.getOptionSpecificationAccess().getStatesCellStateParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_13);
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // InternalChessGame.g:294:1: entryRuleCellState returns [EObject current=null] : iv_ruleCellState= ruleCellState EOF ;
    public final EObject entryRuleCellState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellState = null;


        try {
            // InternalChessGame.g:294:50: (iv_ruleCellState= ruleCellState EOF )
            // InternalChessGame.g:295:2: iv_ruleCellState= ruleCellState EOF
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
    // InternalChessGame.g:301:1: ruleCellState returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplaySpec ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )? otherlv_7= '}' ) ;
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
            // InternalChessGame.g:307:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplaySpec ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )? otherlv_7= '}' ) )
            // InternalChessGame.g:308:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplaySpec ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )? otherlv_7= '}' )
            {
            // InternalChessGame.g:308:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplaySpec ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )? otherlv_7= '}' )
            // InternalChessGame.g:309:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_display_2_0= ruleCellDisplaySpec ) ) (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )? otherlv_7= '}'
            {
            // InternalChessGame.g:309:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalChessGame.g:310:4: (lv_name_0_0= RULE_ID )
            {
            // InternalChessGame.g:310:4: (lv_name_0_0= RULE_ID )
            // InternalChessGame.g:311:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalChessGame.g:331:3: ( (lv_display_2_0= ruleCellDisplaySpec ) )
            // InternalChessGame.g:332:4: (lv_display_2_0= ruleCellDisplaySpec )
            {
            // InternalChessGame.g:332:4: (lv_display_2_0= ruleCellDisplaySpec )
            // InternalChessGame.g:333:5: lv_display_2_0= ruleCellDisplaySpec
            {

            					newCompositeNode(grammarAccess.getCellStateAccess().getDisplayCellDisplaySpecParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_display_2_0=ruleCellDisplaySpec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCellStateRule());
            					}
            					set(
            						current,
            						"display",
            						lv_display_2_0,
            						"uk.ac.kcl.inf.chessgame.ChessGame.CellDisplaySpec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalChessGame.g:350:3: (otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalChessGame.g:351:4: otherlv_3= 'transitions' otherlv_4= '{' ( (lv_transitions_5_0= ruleTransitionSpec ) )+ otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getCellStateAccess().getTransitionsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getCellStateAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalChessGame.g:359:4: ( (lv_transitions_5_0= ruleTransitionSpec ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==26) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalChessGame.g:360:5: (lv_transitions_5_0= ruleTransitionSpec )
                    	    {
                    	    // InternalChessGame.g:360:5: (lv_transitions_5_0= ruleTransitionSpec )
                    	    // InternalChessGame.g:361:6: lv_transitions_5_0= ruleTransitionSpec
                    	    {

                    	    						newCompositeNode(grammarAccess.getCellStateAccess().getTransitionsTransitionSpecParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_transitions_5_0=ruleTransitionSpec();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCellStateRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"transitions",
                    	    							lv_transitions_5_0,
                    	    							"uk.ac.kcl.inf.chessgame.ChessGame.TransitionSpec");
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

                    otherlv_6=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getCellStateAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

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


    // $ANTLR start "entryRuleCellDisplaySpec"
    // InternalChessGame.g:391:1: entryRuleCellDisplaySpec returns [EObject current=null] : iv_ruleCellDisplaySpec= ruleCellDisplaySpec EOF ;
    public final EObject entryRuleCellDisplaySpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellDisplaySpec = null;


        try {
            // InternalChessGame.g:391:56: (iv_ruleCellDisplaySpec= ruleCellDisplaySpec EOF )
            // InternalChessGame.g:392:2: iv_ruleCellDisplaySpec= ruleCellDisplaySpec EOF
            {
             newCompositeNode(grammarAccess.getCellDisplaySpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCellDisplaySpec=ruleCellDisplaySpec();

            state._fsp--;

             current =iv_ruleCellDisplaySpec; 
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
    // $ANTLR end "entryRuleCellDisplaySpec"


    // $ANTLR start "ruleCellDisplaySpec"
    // InternalChessGame.g:398:1: ruleCellDisplaySpec returns [EObject current=null] : (otherlv_0= 'display' otherlv_1= '{' ( (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) ) | (otherlv_5= 'color' otherlv_6= '=' ( ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) ) ) ) ) otherlv_8= '}' ) ;
    public final EObject ruleCellDisplaySpec() throws RecognitionException {
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
            // InternalChessGame.g:404:2: ( (otherlv_0= 'display' otherlv_1= '{' ( (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) ) | (otherlv_5= 'color' otherlv_6= '=' ( ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) ) ) ) ) otherlv_8= '}' ) )
            // InternalChessGame.g:405:2: (otherlv_0= 'display' otherlv_1= '{' ( (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) ) | (otherlv_5= 'color' otherlv_6= '=' ( ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) ) ) ) ) otherlv_8= '}' )
            {
            // InternalChessGame.g:405:2: (otherlv_0= 'display' otherlv_1= '{' ( (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) ) | (otherlv_5= 'color' otherlv_6= '=' ( ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) ) ) ) ) otherlv_8= '}' )
            // InternalChessGame.g:406:3: otherlv_0= 'display' otherlv_1= '{' ( (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) ) | (otherlv_5= 'color' otherlv_6= '=' ( ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) ) ) ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCellDisplaySpecAccess().getDisplayKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getCellDisplaySpecAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalChessGame.g:414:3: ( (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) ) | (otherlv_5= 'color' otherlv_6= '=' ( ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalChessGame.g:415:4: (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) )
                    {
                    // InternalChessGame.g:415:4: (otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) ) )
                    // InternalChessGame.g:416:5: otherlv_2= 'text' otherlv_3= '=' ( (lv_text_4_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_7); 

                    					newLeafNode(otherlv_2, grammarAccess.getCellDisplaySpecAccess().getTextKeyword_2_0_0());
                    				
                    otherlv_3=(Token)match(input,14,FOLLOW_19); 

                    					newLeafNode(otherlv_3, grammarAccess.getCellDisplaySpecAccess().getEqualsSignKeyword_2_0_1());
                    				
                    // InternalChessGame.g:424:5: ( (lv_text_4_0= RULE_STRING ) )
                    // InternalChessGame.g:425:6: (lv_text_4_0= RULE_STRING )
                    {
                    // InternalChessGame.g:425:6: (lv_text_4_0= RULE_STRING )
                    // InternalChessGame.g:426:7: lv_text_4_0= RULE_STRING
                    {
                    lv_text_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    							newLeafNode(lv_text_4_0, grammarAccess.getCellDisplaySpecAccess().getTextSTRINGTerminalRuleCall_2_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCellDisplaySpecRule());
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
                    // InternalChessGame.g:444:4: (otherlv_5= 'color' otherlv_6= '=' ( ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) ) ) )
                    {
                    // InternalChessGame.g:444:4: (otherlv_5= 'color' otherlv_6= '=' ( ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) ) ) )
                    // InternalChessGame.g:445:5: otherlv_5= 'color' otherlv_6= '=' ( ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_7); 

                    					newLeafNode(otherlv_5, grammarAccess.getCellDisplaySpecAccess().getColorKeyword_2_1_0());
                    				
                    otherlv_6=(Token)match(input,14,FOLLOW_20); 

                    					newLeafNode(otherlv_6, grammarAccess.getCellDisplaySpecAccess().getEqualsSignKeyword_2_1_1());
                    				
                    // InternalChessGame.g:453:5: ( ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) ) )
                    // InternalChessGame.g:454:6: ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) )
                    {
                    // InternalChessGame.g:454:6: ( (lv_color_7_1= 'black' | lv_color_7_2= 'white' ) )
                    // InternalChessGame.g:455:7: (lv_color_7_1= 'black' | lv_color_7_2= 'white' )
                    {
                    // InternalChessGame.g:455:7: (lv_color_7_1= 'black' | lv_color_7_2= 'white' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==24) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==25) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalChessGame.g:456:8: lv_color_7_1= 'black'
                            {
                            lv_color_7_1=(Token)match(input,24,FOLLOW_12); 

                            								newLeafNode(lv_color_7_1, grammarAccess.getCellDisplaySpecAccess().getColorBlackKeyword_2_1_2_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getCellDisplaySpecRule());
                            								}
                            								setWithLastConsumed(current, "color", lv_color_7_1, null);
                            							

                            }
                            break;
                        case 2 :
                            // InternalChessGame.g:467:8: lv_color_7_2= 'white'
                            {
                            lv_color_7_2=(Token)match(input,25,FOLLOW_12); 

                            								newLeafNode(lv_color_7_2, grammarAccess.getCellDisplaySpecAccess().getColorWhiteKeyword_2_1_2_0_1());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getCellDisplaySpecRule());
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

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCellDisplaySpecAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleCellDisplaySpec"


    // $ANTLR start "entryRuleTransitionSpec"
    // InternalChessGame.g:490:1: entryRuleTransitionSpec returns [EObject current=null] : iv_ruleTransitionSpec= ruleTransitionSpec EOF ;
    public final EObject entryRuleTransitionSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpec = null;


        try {
            // InternalChessGame.g:490:55: (iv_ruleTransitionSpec= ruleTransitionSpec EOF )
            // InternalChessGame.g:491:2: iv_ruleTransitionSpec= ruleTransitionSpec EOF
            {
             newCompositeNode(grammarAccess.getTransitionSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionSpec=ruleTransitionSpec();

            state._fsp--;

             current =iv_ruleTransitionSpec; 
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
    // $ANTLR end "entryRuleTransitionSpec"


    // $ANTLR start "ruleTransitionSpec"
    // InternalChessGame.g:497:1: ruleTransitionSpec returns [EObject current=null] : (otherlv_0= 'click' ( (lv_trigger_1_0= ruleMouseTrigger ) ) otherlv_2= 'and' otherlv_3= 'goto' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleTransitionSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_trigger_1_0 = null;



        	enterRule();

        try {
            // InternalChessGame.g:503:2: ( (otherlv_0= 'click' ( (lv_trigger_1_0= ruleMouseTrigger ) ) otherlv_2= 'and' otherlv_3= 'goto' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalChessGame.g:504:2: (otherlv_0= 'click' ( (lv_trigger_1_0= ruleMouseTrigger ) ) otherlv_2= 'and' otherlv_3= 'goto' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalChessGame.g:504:2: (otherlv_0= 'click' ( (lv_trigger_1_0= ruleMouseTrigger ) ) otherlv_2= 'and' otherlv_3= 'goto' ( (otherlv_4= RULE_ID ) ) )
            // InternalChessGame.g:505:3: otherlv_0= 'click' ( (lv_trigger_1_0= ruleMouseTrigger ) ) otherlv_2= 'and' otherlv_3= 'goto' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionSpecAccess().getClickKeyword_0());
            		
            // InternalChessGame.g:509:3: ( (lv_trigger_1_0= ruleMouseTrigger ) )
            // InternalChessGame.g:510:4: (lv_trigger_1_0= ruleMouseTrigger )
            {
            // InternalChessGame.g:510:4: (lv_trigger_1_0= ruleMouseTrigger )
            // InternalChessGame.g:511:5: lv_trigger_1_0= ruleMouseTrigger
            {

            					newCompositeNode(grammarAccess.getTransitionSpecAccess().getTriggerMouseTriggerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_trigger_1_0=ruleMouseTrigger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionSpecRule());
            					}
            					set(
            						current,
            						"trigger",
            						lv_trigger_1_0,
            						"uk.ac.kcl.inf.chessgame.ChessGame.MouseTrigger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionSpecAccess().getAndKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionSpecAccess().getGotoKeyword_3());
            		
            // InternalChessGame.g:536:3: ( (otherlv_4= RULE_ID ) )
            // InternalChessGame.g:537:4: (otherlv_4= RULE_ID )
            {
            // InternalChessGame.g:537:4: (otherlv_4= RULE_ID )
            // InternalChessGame.g:538:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionSpecRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getTransitionSpecAccess().getTargetCellStateCrossReference_4_0());
            				

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
    // $ANTLR end "ruleTransitionSpec"


    // $ANTLR start "entryRuleMouseTrigger"
    // InternalChessGame.g:553:1: entryRuleMouseTrigger returns [EObject current=null] : iv_ruleMouseTrigger= ruleMouseTrigger EOF ;
    public final EObject entryRuleMouseTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMouseTrigger = null;


        try {
            // InternalChessGame.g:553:53: (iv_ruleMouseTrigger= ruleMouseTrigger EOF )
            // InternalChessGame.g:554:2: iv_ruleMouseTrigger= ruleMouseTrigger EOF
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
    // InternalChessGame.g:560:1: ruleMouseTrigger returns [EObject current=null] : ( ( (lv_mouse_0_0= 'mouse-left' ) ) | (otherlv_1= 'mouse-right' () ) ) ;
    public final EObject ruleMouseTrigger() throws RecognitionException {
        EObject current = null;

        Token lv_mouse_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalChessGame.g:566:2: ( ( ( (lv_mouse_0_0= 'mouse-left' ) ) | (otherlv_1= 'mouse-right' () ) ) )
            // InternalChessGame.g:567:2: ( ( (lv_mouse_0_0= 'mouse-left' ) ) | (otherlv_1= 'mouse-right' () ) )
            {
            // InternalChessGame.g:567:2: ( ( (lv_mouse_0_0= 'mouse-left' ) ) | (otherlv_1= 'mouse-right' () ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            else if ( (LA7_0==30) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalChessGame.g:568:3: ( (lv_mouse_0_0= 'mouse-left' ) )
                    {
                    // InternalChessGame.g:568:3: ( (lv_mouse_0_0= 'mouse-left' ) )
                    // InternalChessGame.g:569:4: (lv_mouse_0_0= 'mouse-left' )
                    {
                    // InternalChessGame.g:569:4: (lv_mouse_0_0= 'mouse-left' )
                    // InternalChessGame.g:570:5: lv_mouse_0_0= 'mouse-left'
                    {
                    lv_mouse_0_0=(Token)match(input,29,FOLLOW_2); 

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
                    // InternalChessGame.g:583:3: (otherlv_1= 'mouse-right' () )
                    {
                    // InternalChessGame.g:583:3: (otherlv_1= 'mouse-right' () )
                    // InternalChessGame.g:584:4: otherlv_1= 'mouse-right' ()
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getMouseTriggerAccess().getMouseRightKeyword_1_0());
                    			
                    // InternalChessGame.g:588:4: ()
                    // InternalChessGame.g:589:5: 
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
    // InternalChessGame.g:600:1: entryRuleGameEnd returns [EObject current=null] : iv_ruleGameEnd= ruleGameEnd EOF ;
    public final EObject entryRuleGameEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGameEnd = null;


        try {
            // InternalChessGame.g:600:48: (iv_ruleGameEnd= ruleGameEnd EOF )
            // InternalChessGame.g:601:2: iv_ruleGameEnd= ruleGameEnd EOF
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
    // InternalChessGame.g:607:1: ruleGameEnd returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'when' ( (lv_action_4_0= ruleContextExpression ) ) otherlv_5= 'do' ( (lv_behaviour_6_0= ruleEndBehaviour ) ) otherlv_7= '}' ) ;
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
            // InternalChessGame.g:613:2: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'when' ( (lv_action_4_0= ruleContextExpression ) ) otherlv_5= 'do' ( (lv_behaviour_6_0= ruleEndBehaviour ) ) otherlv_7= '}' ) )
            // InternalChessGame.g:614:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'when' ( (lv_action_4_0= ruleContextExpression ) ) otherlv_5= 'do' ( (lv_behaviour_6_0= ruleEndBehaviour ) ) otherlv_7= '}' )
            {
            // InternalChessGame.g:614:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'when' ( (lv_action_4_0= ruleContextExpression ) ) otherlv_5= 'do' ( (lv_behaviour_6_0= ruleEndBehaviour ) ) otherlv_7= '}' )
            // InternalChessGame.g:615:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'when' ( (lv_action_4_0= ruleContextExpression ) ) otherlv_5= 'do' ( (lv_behaviour_6_0= ruleEndBehaviour ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGameEndAccess().getActionKeyword_0());
            		
            // InternalChessGame.g:619:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalChessGame.g:620:4: (lv_name_1_0= RULE_ID )
            {
            // InternalChessGame.g:620:4: (lv_name_1_0= RULE_ID )
            // InternalChessGame.g:621:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getGameEndAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getGameEndAccess().getWhenKeyword_3());
            		
            // InternalChessGame.g:645:3: ( (lv_action_4_0= ruleContextExpression ) )
            // InternalChessGame.g:646:4: (lv_action_4_0= ruleContextExpression )
            {
            // InternalChessGame.g:646:4: (lv_action_4_0= ruleContextExpression )
            // InternalChessGame.g:647:5: lv_action_4_0= ruleContextExpression
            {

            					newCompositeNode(grammarAccess.getGameEndAccess().getActionContextExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
            lv_action_4_0=ruleContextExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameEndRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_4_0,
            						"uk.ac.kcl.inf.chessgame.ChessGame.ContextExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_27); 

            			newLeafNode(otherlv_5, grammarAccess.getGameEndAccess().getDoKeyword_5());
            		
            // InternalChessGame.g:668:3: ( (lv_behaviour_6_0= ruleEndBehaviour ) )
            // InternalChessGame.g:669:4: (lv_behaviour_6_0= ruleEndBehaviour )
            {
            // InternalChessGame.g:669:4: (lv_behaviour_6_0= ruleEndBehaviour )
            // InternalChessGame.g:670:5: lv_behaviour_6_0= ruleEndBehaviour
            {

            					newCompositeNode(grammarAccess.getGameEndAccess().getBehaviourEndBehaviourParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

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


    // $ANTLR start "entryRuleContextExpression"
    // InternalChessGame.g:695:1: entryRuleContextExpression returns [EObject current=null] : iv_ruleContextExpression= ruleContextExpression EOF ;
    public final EObject entryRuleContextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextExpression = null;


        try {
            // InternalChessGame.g:695:58: (iv_ruleContextExpression= ruleContextExpression EOF )
            // InternalChessGame.g:696:2: iv_ruleContextExpression= ruleContextExpression EOF
            {
             newCompositeNode(grammarAccess.getContextExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextExpression=ruleContextExpression();

            state._fsp--;

             current =iv_ruleContextExpression; 
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
    // $ANTLR end "entryRuleContextExpression"


    // $ANTLR start "ruleContextExpression"
    // InternalChessGame.g:702:1: ruleContextExpression returns [EObject current=null] : ( ( (lv_sub_exp_0_0= ruleStateFilterExpression ) ) otherlv_1= '.' ( (lv_cellState_2_0= ruleEmptyExpression ) ) ) ;
    public final EObject ruleContextExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sub_exp_0_0 = null;

        EObject lv_cellState_2_0 = null;



        	enterRule();

        try {
            // InternalChessGame.g:708:2: ( ( ( (lv_sub_exp_0_0= ruleStateFilterExpression ) ) otherlv_1= '.' ( (lv_cellState_2_0= ruleEmptyExpression ) ) ) )
            // InternalChessGame.g:709:2: ( ( (lv_sub_exp_0_0= ruleStateFilterExpression ) ) otherlv_1= '.' ( (lv_cellState_2_0= ruleEmptyExpression ) ) )
            {
            // InternalChessGame.g:709:2: ( ( (lv_sub_exp_0_0= ruleStateFilterExpression ) ) otherlv_1= '.' ( (lv_cellState_2_0= ruleEmptyExpression ) ) )
            // InternalChessGame.g:710:3: ( (lv_sub_exp_0_0= ruleStateFilterExpression ) ) otherlv_1= '.' ( (lv_cellState_2_0= ruleEmptyExpression ) )
            {
            // InternalChessGame.g:710:3: ( (lv_sub_exp_0_0= ruleStateFilterExpression ) )
            // InternalChessGame.g:711:4: (lv_sub_exp_0_0= ruleStateFilterExpression )
            {
            // InternalChessGame.g:711:4: (lv_sub_exp_0_0= ruleStateFilterExpression )
            // InternalChessGame.g:712:5: lv_sub_exp_0_0= ruleStateFilterExpression
            {

            					newCompositeNode(grammarAccess.getContextExpressionAccess().getSub_expStateFilterExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
            lv_sub_exp_0_0=ruleStateFilterExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextExpressionRule());
            					}
            					set(
            						current,
            						"sub_exp",
            						lv_sub_exp_0_0,
            						"uk.ac.kcl.inf.chessgame.ChessGame.StateFilterExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getContextExpressionAccess().getFullStopKeyword_1());
            		
            // InternalChessGame.g:733:3: ( (lv_cellState_2_0= ruleEmptyExpression ) )
            // InternalChessGame.g:734:4: (lv_cellState_2_0= ruleEmptyExpression )
            {
            // InternalChessGame.g:734:4: (lv_cellState_2_0= ruleEmptyExpression )
            // InternalChessGame.g:735:5: lv_cellState_2_0= ruleEmptyExpression
            {

            					newCompositeNode(grammarAccess.getContextExpressionAccess().getCellStateEmptyExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_cellState_2_0=ruleEmptyExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextExpressionRule());
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
    // $ANTLR end "ruleContextExpression"


    // $ANTLR start "entryRuleStateFilterExpression"
    // InternalChessGame.g:756:1: entryRuleStateFilterExpression returns [EObject current=null] : iv_ruleStateFilterExpression= ruleStateFilterExpression EOF ;
    public final EObject entryRuleStateFilterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateFilterExpression = null;


        try {
            // InternalChessGame.g:756:62: (iv_ruleStateFilterExpression= ruleStateFilterExpression EOF )
            // InternalChessGame.g:757:2: iv_ruleStateFilterExpression= ruleStateFilterExpression EOF
            {
             newCompositeNode(grammarAccess.getStateFilterExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateFilterExpression=ruleStateFilterExpression();

            state._fsp--;

             current =iv_ruleStateFilterExpression; 
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
    // $ANTLR end "entryRuleStateFilterExpression"


    // $ANTLR start "ruleStateFilterExpression"
    // InternalChessGame.g:763:1: ruleStateFilterExpression returns [EObject current=null] : (otherlv_0= 'allCellState' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleStateFilterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalChessGame.g:769:2: ( (otherlv_0= 'allCellState' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalChessGame.g:770:2: (otherlv_0= 'allCellState' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalChessGame.g:770:2: (otherlv_0= 'allCellState' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalChessGame.g:771:3: otherlv_0= 'allCellState' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getStateFilterExpressionAccess().getAllCellStateKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateFilterExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalChessGame.g:779:3: ( (otherlv_2= RULE_ID ) )
            // InternalChessGame.g:780:4: (otherlv_2= RULE_ID )
            {
            // InternalChessGame.g:780:4: (otherlv_2= RULE_ID )
            // InternalChessGame.g:781:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateFilterExpressionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_2, grammarAccess.getStateFilterExpressionAccess().getCell_stateCellStateCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getStateFilterExpressionAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleStateFilterExpression"


    // $ANTLR start "entryRuleEmptyExpression"
    // InternalChessGame.g:800:1: entryRuleEmptyExpression returns [EObject current=null] : iv_ruleEmptyExpression= ruleEmptyExpression EOF ;
    public final EObject entryRuleEmptyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyExpression = null;


        try {
            // InternalChessGame.g:800:56: (iv_ruleEmptyExpression= ruleEmptyExpression EOF )
            // InternalChessGame.g:801:2: iv_ruleEmptyExpression= ruleEmptyExpression EOF
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
    // InternalChessGame.g:807:1: ruleEmptyExpression returns [EObject current=null] : (otherlv_0= 'empty' otherlv_1= '(' otherlv_2= ')' () ) ;
    public final EObject ruleEmptyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalChessGame.g:813:2: ( (otherlv_0= 'empty' otherlv_1= '(' otherlv_2= ')' () ) )
            // InternalChessGame.g:814:2: (otherlv_0= 'empty' otherlv_1= '(' otherlv_2= ')' () )
            {
            // InternalChessGame.g:814:2: (otherlv_0= 'empty' otherlv_1= '(' otherlv_2= ')' () )
            // InternalChessGame.g:815:3: otherlv_0= 'empty' otherlv_1= '(' otherlv_2= ')' ()
            {
            otherlv_0=(Token)match(input,38,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getEmptyExpressionAccess().getEmptyKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getEmptyExpressionAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEmptyExpressionAccess().getRightParenthesisKeyword_2());
            		
            // InternalChessGame.g:827:3: ()
            // InternalChessGame.g:828:4: 
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
    // InternalChessGame.g:838:1: entryRuleEndBehaviour returns [EObject current=null] : iv_ruleEndBehaviour= ruleEndBehaviour EOF ;
    public final EObject entryRuleEndBehaviour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndBehaviour = null;


        try {
            // InternalChessGame.g:838:53: (iv_ruleEndBehaviour= ruleEndBehaviour EOF )
            // InternalChessGame.g:839:2: iv_ruleEndBehaviour= ruleEndBehaviour EOF
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
    // InternalChessGame.g:845:1: ruleEndBehaviour returns [EObject current=null] : (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleEndBehaviour() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_message_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalChessGame.g:851:2: ( (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalChessGame.g:852:2: (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalChessGame.g:852:2: (otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalChessGame.g:853:3: otherlv_0= 'end-game' otherlv_1= '(' ( (lv_message_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getEndBehaviourAccess().getEndGameKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getEndBehaviourAccess().getLeftParenthesisKeyword_1());
            		
            // InternalChessGame.g:861:3: ( (lv_message_2_0= RULE_STRING ) )
            // InternalChessGame.g:862:4: (lv_message_2_0= RULE_STRING )
            {
            // InternalChessGame.g:862:4: (lv_message_2_0= RULE_STRING )
            // InternalChessGame.g:863:5: lv_message_2_0= RULE_STRING
            {
            lv_message_2_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

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

            otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});

}