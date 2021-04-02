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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'width'", "'='", "'height'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

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
    // InternalChessGame.g:71:1: ruleChessProgram returns [EObject current=null] : ( (lv_statements_0_0= ruleStatements ) )* ;
    public final EObject ruleChessProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalChessGame.g:77:2: ( ( (lv_statements_0_0= ruleStatements ) )* )
            // InternalChessGame.g:78:2: ( (lv_statements_0_0= ruleStatements ) )*
            {
            // InternalChessGame.g:78:2: ( (lv_statements_0_0= ruleStatements ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalChessGame.g:79:3: (lv_statements_0_0= ruleStatements )
            	    {
            	    // InternalChessGame.g:79:3: (lv_statements_0_0= ruleStatements )
            	    // InternalChessGame.g:80:4: lv_statements_0_0= ruleStatements
            	    {

            	    				newCompositeNode(grammarAccess.getChessProgramAccess().getStatementsStatementsParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatements();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getChessProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
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
    // InternalChessGame.g:107:1: ruleStatements returns [EObject current=null] : (this_width_0= rulewidth | this_height_1= ruleheight ) ;
    public final EObject ruleStatements() throws RecognitionException {
        EObject current = null;

        EObject this_width_0 = null;

        EObject this_height_1 = null;



        	enterRule();

        try {
            // InternalChessGame.g:113:2: ( (this_width_0= rulewidth | this_height_1= ruleheight ) )
            // InternalChessGame.g:114:2: (this_width_0= rulewidth | this_height_1= ruleheight )
            {
            // InternalChessGame.g:114:2: (this_width_0= rulewidth | this_height_1= ruleheight )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalChessGame.g:115:3: this_width_0= rulewidth
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getWidthParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_width_0=rulewidth();

                    state._fsp--;


                    			current = this_width_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalChessGame.g:124:3: this_height_1= ruleheight
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getHeightParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_height_1=ruleheight();

                    state._fsp--;


                    			current = this_height_1;
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


    // $ANTLR start "entryRulewidth"
    // InternalChessGame.g:136:1: entryRulewidth returns [EObject current=null] : iv_rulewidth= rulewidth EOF ;
    public final EObject entryRulewidth() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewidth = null;


        try {
            // InternalChessGame.g:136:46: (iv_rulewidth= rulewidth EOF )
            // InternalChessGame.g:137:2: iv_rulewidth= rulewidth EOF
            {
             newCompositeNode(grammarAccess.getWidthRule()); 
            pushFollow(FOLLOW_1);
            iv_rulewidth=rulewidth();

            state._fsp--;

             current =iv_rulewidth; 
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
    // $ANTLR end "entryRulewidth"


    // $ANTLR start "rulewidth"
    // InternalChessGame.g:143:1: rulewidth returns [EObject current=null] : (otherlv_0= 'width' otherlv_1= '=' ( (lv_WIDTH_2_0= RULE_INT ) ) ) ;
    public final EObject rulewidth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_WIDTH_2_0=null;


        	enterRule();

        try {
            // InternalChessGame.g:149:2: ( (otherlv_0= 'width' otherlv_1= '=' ( (lv_WIDTH_2_0= RULE_INT ) ) ) )
            // InternalChessGame.g:150:2: (otherlv_0= 'width' otherlv_1= '=' ( (lv_WIDTH_2_0= RULE_INT ) ) )
            {
            // InternalChessGame.g:150:2: (otherlv_0= 'width' otherlv_1= '=' ( (lv_WIDTH_2_0= RULE_INT ) ) )
            // InternalChessGame.g:151:3: otherlv_0= 'width' otherlv_1= '=' ( (lv_WIDTH_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWidthAccess().getWidthKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getWidthAccess().getEqualsSignKeyword_1());
            		
            // InternalChessGame.g:159:3: ( (lv_WIDTH_2_0= RULE_INT ) )
            // InternalChessGame.g:160:4: (lv_WIDTH_2_0= RULE_INT )
            {
            // InternalChessGame.g:160:4: (lv_WIDTH_2_0= RULE_INT )
            // InternalChessGame.g:161:5: lv_WIDTH_2_0= RULE_INT
            {
            lv_WIDTH_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_WIDTH_2_0, grammarAccess.getWidthAccess().getWIDTHINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWidthRule());
            					}
            					setWithLastConsumed(
            						current,
            						"WIDTH",
            						lv_WIDTH_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "rulewidth"


    // $ANTLR start "entryRuleheight"
    // InternalChessGame.g:181:1: entryRuleheight returns [EObject current=null] : iv_ruleheight= ruleheight EOF ;
    public final EObject entryRuleheight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleheight = null;


        try {
            // InternalChessGame.g:181:47: (iv_ruleheight= ruleheight EOF )
            // InternalChessGame.g:182:2: iv_ruleheight= ruleheight EOF
            {
             newCompositeNode(grammarAccess.getHeightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleheight=ruleheight();

            state._fsp--;

             current =iv_ruleheight; 
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
    // $ANTLR end "entryRuleheight"


    // $ANTLR start "ruleheight"
    // InternalChessGame.g:188:1: ruleheight returns [EObject current=null] : (otherlv_0= 'height' otherlv_1= '=' ( (lv_HEIGHT_2_0= RULE_INT ) ) ) ;
    public final EObject ruleheight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_HEIGHT_2_0=null;


        	enterRule();

        try {
            // InternalChessGame.g:194:2: ( (otherlv_0= 'height' otherlv_1= '=' ( (lv_HEIGHT_2_0= RULE_INT ) ) ) )
            // InternalChessGame.g:195:2: (otherlv_0= 'height' otherlv_1= '=' ( (lv_HEIGHT_2_0= RULE_INT ) ) )
            {
            // InternalChessGame.g:195:2: (otherlv_0= 'height' otherlv_1= '=' ( (lv_HEIGHT_2_0= RULE_INT ) ) )
            // InternalChessGame.g:196:3: otherlv_0= 'height' otherlv_1= '=' ( (lv_HEIGHT_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHeightAccess().getHeightKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getHeightAccess().getEqualsSignKeyword_1());
            		
            // InternalChessGame.g:204:3: ( (lv_HEIGHT_2_0= RULE_INT ) )
            // InternalChessGame.g:205:4: (lv_HEIGHT_2_0= RULE_INT )
            {
            // InternalChessGame.g:205:4: (lv_HEIGHT_2_0= RULE_INT )
            // InternalChessGame.g:206:5: lv_HEIGHT_2_0= RULE_INT
            {
            lv_HEIGHT_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_HEIGHT_2_0, grammarAccess.getHeightAccess().getHEIGHTINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHeightRule());
            					}
            					setWithLastConsumed(
            						current,
            						"HEIGHT",
            						lv_HEIGHT_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleheight"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});

}