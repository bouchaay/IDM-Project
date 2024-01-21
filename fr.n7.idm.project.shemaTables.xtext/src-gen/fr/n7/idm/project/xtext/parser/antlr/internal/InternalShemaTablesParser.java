package fr.n7.idm.project.xtext.parser.antlr.internal;

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
import fr.n7.idm.project.xtext.services.ShemaTablesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalShemaTablesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Tables'", "'{'", "'shematables'", "'}'", "'ShemaTable'", "'name'", "'id'", "'columns'", "'catalogue'", "'Column'", "'dataType'", "'constraint'", "'Constraint'", "'filePath'", "'Catalogue'", "'algorithms'", "'Algorithm'", "'path'", "'output'", "'input'", "'Input'", "'constante'", "'Output'", "'Constant'", "'value'", "'int'", "'float'", "'string'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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


        public InternalShemaTablesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalShemaTablesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalShemaTablesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalShemaTables.g"; }



     	private ShemaTablesGrammarAccess grammarAccess;

        public InternalShemaTablesParser(TokenStream input, ShemaTablesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Tables";
       	}

       	@Override
       	protected ShemaTablesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTables"
    // InternalShemaTables.g:65:1: entryRuleTables returns [EObject current=null] : iv_ruleTables= ruleTables EOF ;
    public final EObject entryRuleTables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTables = null;


        try {
            // InternalShemaTables.g:65:47: (iv_ruleTables= ruleTables EOF )
            // InternalShemaTables.g:66:2: iv_ruleTables= ruleTables EOF
            {
             newCompositeNode(grammarAccess.getTablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTables=ruleTables();

            state._fsp--;

             current =iv_ruleTables; 
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
    // $ANTLR end "entryRuleTables"


    // $ANTLR start "ruleTables"
    // InternalShemaTables.g:72:1: ruleTables returns [EObject current=null] : (otherlv_0= 'Tables' ( (lv_name_1_0= 'Tables' ) ) otherlv_2= '{' otherlv_3= 'shematables' ( (lv_shematables_4_0= ruleShemaTable ) )* otherlv_5= '}' ) ;
    public final EObject ruleTables() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_shematables_4_0 = null;



        	enterRule();

        try {
            // InternalShemaTables.g:78:2: ( (otherlv_0= 'Tables' ( (lv_name_1_0= 'Tables' ) ) otherlv_2= '{' otherlv_3= 'shematables' ( (lv_shematables_4_0= ruleShemaTable ) )* otherlv_5= '}' ) )
            // InternalShemaTables.g:79:2: (otherlv_0= 'Tables' ( (lv_name_1_0= 'Tables' ) ) otherlv_2= '{' otherlv_3= 'shematables' ( (lv_shematables_4_0= ruleShemaTable ) )* otherlv_5= '}' )
            {
            // InternalShemaTables.g:79:2: (otherlv_0= 'Tables' ( (lv_name_1_0= 'Tables' ) ) otherlv_2= '{' otherlv_3= 'shematables' ( (lv_shematables_4_0= ruleShemaTable ) )* otherlv_5= '}' )
            // InternalShemaTables.g:80:3: otherlv_0= 'Tables' ( (lv_name_1_0= 'Tables' ) ) otherlv_2= '{' otherlv_3= 'shematables' ( (lv_shematables_4_0= ruleShemaTable ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTablesAccess().getTablesKeyword_0());
            		
            // InternalShemaTables.g:84:3: ( (lv_name_1_0= 'Tables' ) )
            // InternalShemaTables.g:85:4: (lv_name_1_0= 'Tables' )
            {
            // InternalShemaTables.g:85:4: (lv_name_1_0= 'Tables' )
            // InternalShemaTables.g:86:5: lv_name_1_0= 'Tables'
            {
            lv_name_1_0=(Token)match(input,11,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTablesAccess().getNameTablesKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTablesRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "Tables");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTablesAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getTablesAccess().getShematablesKeyword_3());
            		
            // InternalShemaTables.g:106:3: ( (lv_shematables_4_0= ruleShemaTable ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalShemaTables.g:107:4: (lv_shematables_4_0= ruleShemaTable )
            	    {
            	    // InternalShemaTables.g:107:4: (lv_shematables_4_0= ruleShemaTable )
            	    // InternalShemaTables.g:108:5: lv_shematables_4_0= ruleShemaTable
            	    {

            	    					newCompositeNode(grammarAccess.getTablesAccess().getShematablesShemaTableParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_shematables_4_0=ruleShemaTable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTablesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"shematables",
            	    						lv_shematables_4_0,
            	    						"fr.n7.idm.project.xtext.ShemaTables.ShemaTable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTablesAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleTables"


    // $ANTLR start "entryRuleShemaTable"
    // InternalShemaTables.g:133:1: entryRuleShemaTable returns [EObject current=null] : iv_ruleShemaTable= ruleShemaTable EOF ;
    public final EObject entryRuleShemaTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShemaTable = null;


        try {
            // InternalShemaTables.g:133:51: (iv_ruleShemaTable= ruleShemaTable EOF )
            // InternalShemaTables.g:134:2: iv_ruleShemaTable= ruleShemaTable EOF
            {
             newCompositeNode(grammarAccess.getShemaTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShemaTable=ruleShemaTable();

            state._fsp--;

             current =iv_ruleShemaTable; 
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
    // $ANTLR end "entryRuleShemaTable"


    // $ANTLR start "ruleShemaTable"
    // InternalShemaTables.g:140:1: ruleShemaTable returns [EObject current=null] : (otherlv_0= 'ShemaTable' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'id' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'columns' ( (lv_columns_7_0= ruleColumn ) )* otherlv_8= 'catalogue' ( (lv_catalogue_9_0= ruleCatalogue ) ) otherlv_10= '}' ) ;
    public final EObject ruleShemaTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_columns_7_0 = null;

        EObject lv_catalogue_9_0 = null;



        	enterRule();

        try {
            // InternalShemaTables.g:146:2: ( (otherlv_0= 'ShemaTable' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'id' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'columns' ( (lv_columns_7_0= ruleColumn ) )* otherlv_8= 'catalogue' ( (lv_catalogue_9_0= ruleCatalogue ) ) otherlv_10= '}' ) )
            // InternalShemaTables.g:147:2: (otherlv_0= 'ShemaTable' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'id' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'columns' ( (lv_columns_7_0= ruleColumn ) )* otherlv_8= 'catalogue' ( (lv_catalogue_9_0= ruleCatalogue ) ) otherlv_10= '}' )
            {
            // InternalShemaTables.g:147:2: (otherlv_0= 'ShemaTable' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'id' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'columns' ( (lv_columns_7_0= ruleColumn ) )* otherlv_8= 'catalogue' ( (lv_catalogue_9_0= ruleCatalogue ) ) otherlv_10= '}' )
            // InternalShemaTables.g:148:3: otherlv_0= 'ShemaTable' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'id' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'columns' ( (lv_columns_7_0= ruleColumn ) )* otherlv_8= 'catalogue' ( (lv_catalogue_9_0= ruleCatalogue ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getShemaTableAccess().getShemaTableKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getShemaTableAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getShemaTableAccess().getNameKeyword_2());
            		
            // InternalShemaTables.g:160:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalShemaTables.g:161:4: (lv_name_3_0= RULE_ID )
            {
            // InternalShemaTables.g:161:4: (lv_name_3_0= RULE_ID )
            // InternalShemaTables.g:162:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_3_0, grammarAccess.getShemaTableAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShemaTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getShemaTableAccess().getIdKeyword_4());
            		
            // InternalShemaTables.g:182:3: ( (lv_id_5_0= RULE_INT ) )
            // InternalShemaTables.g:183:4: (lv_id_5_0= RULE_INT )
            {
            // InternalShemaTables.g:183:4: (lv_id_5_0= RULE_INT )
            // InternalShemaTables.g:184:5: lv_id_5_0= RULE_INT
            {
            lv_id_5_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_id_5_0, grammarAccess.getShemaTableAccess().getIdINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShemaTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getShemaTableAccess().getColumnsKeyword_6());
            		
            // InternalShemaTables.g:204:3: ( (lv_columns_7_0= ruleColumn ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalShemaTables.g:205:4: (lv_columns_7_0= ruleColumn )
            	    {
            	    // InternalShemaTables.g:205:4: (lv_columns_7_0= ruleColumn )
            	    // InternalShemaTables.g:206:5: lv_columns_7_0= ruleColumn
            	    {

            	    					newCompositeNode(grammarAccess.getShemaTableAccess().getColumnsColumnParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_columns_7_0=ruleColumn();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getShemaTableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"columns",
            	    						lv_columns_7_0,
            	    						"fr.n7.idm.project.xtext.ShemaTables.Column");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getShemaTableAccess().getCatalogueKeyword_8());
            		
            // InternalShemaTables.g:227:3: ( (lv_catalogue_9_0= ruleCatalogue ) )
            // InternalShemaTables.g:228:4: (lv_catalogue_9_0= ruleCatalogue )
            {
            // InternalShemaTables.g:228:4: (lv_catalogue_9_0= ruleCatalogue )
            // InternalShemaTables.g:229:5: lv_catalogue_9_0= ruleCatalogue
            {

            					newCompositeNode(grammarAccess.getShemaTableAccess().getCatalogueCatalogueParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_14);
            lv_catalogue_9_0=ruleCatalogue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShemaTableRule());
            					}
            					set(
            						current,
            						"catalogue",
            						lv_catalogue_9_0,
            						"fr.n7.idm.project.xtext.ShemaTables.Catalogue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getShemaTableAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleShemaTable"


    // $ANTLR start "entryRuleColumn"
    // InternalShemaTables.g:254:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalShemaTables.g:254:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalShemaTables.g:255:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalShemaTables.g:261:1: ruleColumn returns [EObject current=null] : (otherlv_0= 'Column' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'id' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'dataType' ( (lv_dataType_7_0= ruleColumnDataType ) ) otherlv_8= 'constraint' ( (lv_constraint_9_0= ruleConstraint ) ) otherlv_10= '}' ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_dataType_7_0 = null;

        EObject lv_constraint_9_0 = null;



        	enterRule();

        try {
            // InternalShemaTables.g:267:2: ( (otherlv_0= 'Column' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'id' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'dataType' ( (lv_dataType_7_0= ruleColumnDataType ) ) otherlv_8= 'constraint' ( (lv_constraint_9_0= ruleConstraint ) ) otherlv_10= '}' ) )
            // InternalShemaTables.g:268:2: (otherlv_0= 'Column' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'id' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'dataType' ( (lv_dataType_7_0= ruleColumnDataType ) ) otherlv_8= 'constraint' ( (lv_constraint_9_0= ruleConstraint ) ) otherlv_10= '}' )
            {
            // InternalShemaTables.g:268:2: (otherlv_0= 'Column' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'id' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'dataType' ( (lv_dataType_7_0= ruleColumnDataType ) ) otherlv_8= 'constraint' ( (lv_constraint_9_0= ruleConstraint ) ) otherlv_10= '}' )
            // InternalShemaTables.g:269:3: otherlv_0= 'Column' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'id' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'dataType' ( (lv_dataType_7_0= ruleColumnDataType ) ) otherlv_8= 'constraint' ( (lv_constraint_9_0= ruleConstraint ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getColumnKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getNameKeyword_2());
            		
            // InternalShemaTables.g:281:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalShemaTables.g:282:4: (lv_name_3_0= RULE_ID )
            {
            // InternalShemaTables.g:282:4: (lv_name_3_0= RULE_ID )
            // InternalShemaTables.g:283:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_3_0, grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getIdKeyword_4());
            		
            // InternalShemaTables.g:303:3: ( (lv_id_5_0= RULE_INT ) )
            // InternalShemaTables.g:304:4: (lv_id_5_0= RULE_INT )
            {
            // InternalShemaTables.g:304:4: (lv_id_5_0= RULE_INT )
            // InternalShemaTables.g:305:5: lv_id_5_0= RULE_INT
            {
            lv_id_5_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_id_5_0, grammarAccess.getColumnAccess().getIdINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getColumnAccess().getDataTypeKeyword_6());
            		
            // InternalShemaTables.g:325:3: ( (lv_dataType_7_0= ruleColumnDataType ) )
            // InternalShemaTables.g:326:4: (lv_dataType_7_0= ruleColumnDataType )
            {
            // InternalShemaTables.g:326:4: (lv_dataType_7_0= ruleColumnDataType )
            // InternalShemaTables.g:327:5: lv_dataType_7_0= ruleColumnDataType
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getDataTypeColumnDataTypeEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_17);
            lv_dataType_7_0=ruleColumnDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"dataType",
            						lv_dataType_7_0,
            						"fr.n7.idm.project.xtext.ShemaTables.ColumnDataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getColumnAccess().getConstraintKeyword_8());
            		
            // InternalShemaTables.g:348:3: ( (lv_constraint_9_0= ruleConstraint ) )
            // InternalShemaTables.g:349:4: (lv_constraint_9_0= ruleConstraint )
            {
            // InternalShemaTables.g:349:4: (lv_constraint_9_0= ruleConstraint )
            // InternalShemaTables.g:350:5: lv_constraint_9_0= ruleConstraint
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getConstraintConstraintParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_14);
            lv_constraint_9_0=ruleConstraint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"constraint",
            						lv_constraint_9_0,
            						"fr.n7.idm.project.xtext.ShemaTables.Constraint");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleConstraint"
    // InternalShemaTables.g:375:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalShemaTables.g:375:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalShemaTables.g:376:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalShemaTables.g:382:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'filePath' ( (lv_filePath_3_0= RULE_STRING ) ) otherlv_4= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_filePath_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalShemaTables.g:388:2: ( (otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'filePath' ( (lv_filePath_3_0= RULE_STRING ) ) otherlv_4= '}' ) )
            // InternalShemaTables.g:389:2: (otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'filePath' ( (lv_filePath_3_0= RULE_STRING ) ) otherlv_4= '}' )
            {
            // InternalShemaTables.g:389:2: (otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'filePath' ( (lv_filePath_3_0= RULE_STRING ) ) otherlv_4= '}' )
            // InternalShemaTables.g:390:3: otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'filePath' ( (lv_filePath_3_0= RULE_STRING ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getFilePathKeyword_2());
            		
            // InternalShemaTables.g:402:3: ( (lv_filePath_3_0= RULE_STRING ) )
            // InternalShemaTables.g:403:4: (lv_filePath_3_0= RULE_STRING )
            {
            // InternalShemaTables.g:403:4: (lv_filePath_3_0= RULE_STRING )
            // InternalShemaTables.g:404:5: lv_filePath_3_0= RULE_STRING
            {
            lv_filePath_3_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_filePath_3_0, grammarAccess.getConstraintAccess().getFilePathSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"filePath",
            						lv_filePath_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleCatalogue"
    // InternalShemaTables.g:428:1: entryRuleCatalogue returns [EObject current=null] : iv_ruleCatalogue= ruleCatalogue EOF ;
    public final EObject entryRuleCatalogue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCatalogue = null;


        try {
            // InternalShemaTables.g:428:50: (iv_ruleCatalogue= ruleCatalogue EOF )
            // InternalShemaTables.g:429:2: iv_ruleCatalogue= ruleCatalogue EOF
            {
             newCompositeNode(grammarAccess.getCatalogueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCatalogue=ruleCatalogue();

            state._fsp--;

             current =iv_ruleCatalogue; 
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
    // $ANTLR end "entryRuleCatalogue"


    // $ANTLR start "ruleCatalogue"
    // InternalShemaTables.g:435:1: ruleCatalogue returns [EObject current=null] : (otherlv_0= 'Catalogue' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'algorithms' ( (lv_algorithms_5_0= ruleAlgorithm ) )* otherlv_6= '}' ) ;
    public final EObject ruleCatalogue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_algorithms_5_0 = null;



        	enterRule();

        try {
            // InternalShemaTables.g:441:2: ( (otherlv_0= 'Catalogue' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'algorithms' ( (lv_algorithms_5_0= ruleAlgorithm ) )* otherlv_6= '}' ) )
            // InternalShemaTables.g:442:2: (otherlv_0= 'Catalogue' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'algorithms' ( (lv_algorithms_5_0= ruleAlgorithm ) )* otherlv_6= '}' )
            {
            // InternalShemaTables.g:442:2: (otherlv_0= 'Catalogue' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'algorithms' ( (lv_algorithms_5_0= ruleAlgorithm ) )* otherlv_6= '}' )
            // InternalShemaTables.g:443:3: otherlv_0= 'Catalogue' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'algorithms' ( (lv_algorithms_5_0= ruleAlgorithm ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCatalogueAccess().getCatalogueKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCatalogueAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getCatalogueAccess().getNameKeyword_2());
            		
            // InternalShemaTables.g:455:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalShemaTables.g:456:4: (lv_name_3_0= RULE_ID )
            {
            // InternalShemaTables.g:456:4: (lv_name_3_0= RULE_ID )
            // InternalShemaTables.g:457:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_3_0, grammarAccess.getCatalogueAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCatalogueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getCatalogueAccess().getAlgorithmsKeyword_4());
            		
            // InternalShemaTables.g:477:3: ( (lv_algorithms_5_0= ruleAlgorithm ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==27) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalShemaTables.g:478:4: (lv_algorithms_5_0= ruleAlgorithm )
            	    {
            	    // InternalShemaTables.g:478:4: (lv_algorithms_5_0= ruleAlgorithm )
            	    // InternalShemaTables.g:479:5: lv_algorithms_5_0= ruleAlgorithm
            	    {

            	    					newCompositeNode(grammarAccess.getCatalogueAccess().getAlgorithmsAlgorithmParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_algorithms_5_0=ruleAlgorithm();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCatalogueRule());
            	    					}
            	    					add(
            	    						current,
            	    						"algorithms",
            	    						lv_algorithms_5_0,
            	    						"fr.n7.idm.project.xtext.ShemaTables.Algorithm");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCatalogueAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCatalogue"


    // $ANTLR start "entryRuleAlgorithm"
    // InternalShemaTables.g:504:1: entryRuleAlgorithm returns [EObject current=null] : iv_ruleAlgorithm= ruleAlgorithm EOF ;
    public final EObject entryRuleAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithm = null;


        try {
            // InternalShemaTables.g:504:50: (iv_ruleAlgorithm= ruleAlgorithm EOF )
            // InternalShemaTables.g:505:2: iv_ruleAlgorithm= ruleAlgorithm EOF
            {
             newCompositeNode(grammarAccess.getAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgorithm=ruleAlgorithm();

            state._fsp--;

             current =iv_ruleAlgorithm; 
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
    // $ANTLR end "entryRuleAlgorithm"


    // $ANTLR start "ruleAlgorithm"
    // InternalShemaTables.g:511:1: ruleAlgorithm returns [EObject current=null] : (otherlv_0= 'Algorithm' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= 'output' ( (lv_output_7_0= ruleOutput ) ) otherlv_8= 'input' ( (lv_input_9_0= ruleInput ) ) otherlv_10= '}' ) ;
    public final EObject ruleAlgorithm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_path_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_output_7_0 = null;

        EObject lv_input_9_0 = null;



        	enterRule();

        try {
            // InternalShemaTables.g:517:2: ( (otherlv_0= 'Algorithm' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= 'output' ( (lv_output_7_0= ruleOutput ) ) otherlv_8= 'input' ( (lv_input_9_0= ruleInput ) ) otherlv_10= '}' ) )
            // InternalShemaTables.g:518:2: (otherlv_0= 'Algorithm' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= 'output' ( (lv_output_7_0= ruleOutput ) ) otherlv_8= 'input' ( (lv_input_9_0= ruleInput ) ) otherlv_10= '}' )
            {
            // InternalShemaTables.g:518:2: (otherlv_0= 'Algorithm' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= 'output' ( (lv_output_7_0= ruleOutput ) ) otherlv_8= 'input' ( (lv_input_9_0= ruleInput ) ) otherlv_10= '}' )
            // InternalShemaTables.g:519:3: otherlv_0= 'Algorithm' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= 'output' ( (lv_output_7_0= ruleOutput ) ) otherlv_8= 'input' ( (lv_input_9_0= ruleInput ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAlgorithmAccess().getAlgorithmKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getAlgorithmAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getAlgorithmAccess().getNameKeyword_2());
            		
            // InternalShemaTables.g:531:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalShemaTables.g:532:4: (lv_name_3_0= RULE_ID )
            {
            // InternalShemaTables.g:532:4: (lv_name_3_0= RULE_ID )
            // InternalShemaTables.g:533:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_3_0, grammarAccess.getAlgorithmAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlgorithmRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getAlgorithmAccess().getPathKeyword_4());
            		
            // InternalShemaTables.g:553:3: ( (lv_path_5_0= RULE_STRING ) )
            // InternalShemaTables.g:554:4: (lv_path_5_0= RULE_STRING )
            {
            // InternalShemaTables.g:554:4: (lv_path_5_0= RULE_STRING )
            // InternalShemaTables.g:555:5: lv_path_5_0= RULE_STRING
            {
            lv_path_5_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_path_5_0, grammarAccess.getAlgorithmAccess().getPathSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlgorithmRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getAlgorithmAccess().getOutputKeyword_6());
            		
            // InternalShemaTables.g:575:3: ( (lv_output_7_0= ruleOutput ) )
            // InternalShemaTables.g:576:4: (lv_output_7_0= ruleOutput )
            {
            // InternalShemaTables.g:576:4: (lv_output_7_0= ruleOutput )
            // InternalShemaTables.g:577:5: lv_output_7_0= ruleOutput
            {

            					newCompositeNode(grammarAccess.getAlgorithmAccess().getOutputOutputParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_26);
            lv_output_7_0=ruleOutput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlgorithmRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_7_0,
            						"fr.n7.idm.project.xtext.ShemaTables.Output");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_27); 

            			newLeafNode(otherlv_8, grammarAccess.getAlgorithmAccess().getInputKeyword_8());
            		
            // InternalShemaTables.g:598:3: ( (lv_input_9_0= ruleInput ) )
            // InternalShemaTables.g:599:4: (lv_input_9_0= ruleInput )
            {
            // InternalShemaTables.g:599:4: (lv_input_9_0= ruleInput )
            // InternalShemaTables.g:600:5: lv_input_9_0= ruleInput
            {

            					newCompositeNode(grammarAccess.getAlgorithmAccess().getInputInputParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_14);
            lv_input_9_0=ruleInput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlgorithmRule());
            					}
            					set(
            						current,
            						"input",
            						lv_input_9_0,
            						"fr.n7.idm.project.xtext.ShemaTables.Input");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getAlgorithmAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleAlgorithm"


    // $ANTLR start "entryRuleInput"
    // InternalShemaTables.g:625:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalShemaTables.g:625:46: (iv_ruleInput= ruleInput EOF )
            // InternalShemaTables.g:626:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalShemaTables.g:632:1: ruleInput returns [EObject current=null] : (otherlv_0= 'Input' otherlv_1= '{' otherlv_2= 'constante' ( (lv_constante_3_0= ruleConstant ) ) otherlv_4= 'columns' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_constante_3_0 = null;



        	enterRule();

        try {
            // InternalShemaTables.g:638:2: ( (otherlv_0= 'Input' otherlv_1= '{' otherlv_2= 'constante' ( (lv_constante_3_0= ruleConstant ) ) otherlv_4= 'columns' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' ) )
            // InternalShemaTables.g:639:2: (otherlv_0= 'Input' otherlv_1= '{' otherlv_2= 'constante' ( (lv_constante_3_0= ruleConstant ) ) otherlv_4= 'columns' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )
            {
            // InternalShemaTables.g:639:2: (otherlv_0= 'Input' otherlv_1= '{' otherlv_2= 'constante' ( (lv_constante_3_0= ruleConstant ) ) otherlv_4= 'columns' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}' )
            // InternalShemaTables.g:640:3: otherlv_0= 'Input' otherlv_1= '{' otherlv_2= 'constante' ( (lv_constante_3_0= ruleConstant ) ) otherlv_4= 'columns' ( (otherlv_5= RULE_ID ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getInputKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getInputAccess().getConstanteKeyword_2());
            		
            // InternalShemaTables.g:652:3: ( (lv_constante_3_0= ruleConstant ) )
            // InternalShemaTables.g:653:4: (lv_constante_3_0= ruleConstant )
            {
            // InternalShemaTables.g:653:4: (lv_constante_3_0= ruleConstant )
            // InternalShemaTables.g:654:5: lv_constante_3_0= ruleConstant
            {

            					newCompositeNode(grammarAccess.getInputAccess().getConstanteConstantParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_constante_3_0=ruleConstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputRule());
            					}
            					set(
            						current,
            						"constante",
            						lv_constante_3_0,
            						"fr.n7.idm.project.xtext.ShemaTables.Constant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_30); 

            			newLeafNode(otherlv_4, grammarAccess.getInputAccess().getColumnsKeyword_4());
            		
            // InternalShemaTables.g:675:3: ( (otherlv_5= RULE_ID ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalShemaTables.g:676:4: (otherlv_5= RULE_ID )
            	    {
            	    // InternalShemaTables.g:676:4: (otherlv_5= RULE_ID )
            	    // InternalShemaTables.g:677:5: otherlv_5= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getInputRule());
            	    					}
            	    				
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_30); 

            	    					newLeafNode(otherlv_5, grammarAccess.getInputAccess().getColumnsColumnCrossReference_5_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getInputAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalShemaTables.g:696:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalShemaTables.g:696:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalShemaTables.g:697:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalShemaTables.g:703:1: ruleOutput returns [EObject current=null] : (otherlv_0= 'Output' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'id' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'dataType' ( (lv_dataType_7_0= ruleColumnDataType ) ) otherlv_8= 'constraint' ( (lv_constraint_9_0= ruleConstraint ) ) otherlv_10= '}' ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_dataType_7_0 = null;

        EObject lv_constraint_9_0 = null;



        	enterRule();

        try {
            // InternalShemaTables.g:709:2: ( (otherlv_0= 'Output' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'id' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'dataType' ( (lv_dataType_7_0= ruleColumnDataType ) ) otherlv_8= 'constraint' ( (lv_constraint_9_0= ruleConstraint ) ) otherlv_10= '}' ) )
            // InternalShemaTables.g:710:2: (otherlv_0= 'Output' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'id' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'dataType' ( (lv_dataType_7_0= ruleColumnDataType ) ) otherlv_8= 'constraint' ( (lv_constraint_9_0= ruleConstraint ) ) otherlv_10= '}' )
            {
            // InternalShemaTables.g:710:2: (otherlv_0= 'Output' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'id' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'dataType' ( (lv_dataType_7_0= ruleColumnDataType ) ) otherlv_8= 'constraint' ( (lv_constraint_9_0= ruleConstraint ) ) otherlv_10= '}' )
            // InternalShemaTables.g:711:3: otherlv_0= 'Output' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'id' ( (lv_id_5_0= RULE_INT ) ) otherlv_6= 'dataType' ( (lv_dataType_7_0= ruleColumnDataType ) ) otherlv_8= 'constraint' ( (lv_constraint_9_0= ruleConstraint ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputAccess().getOutputKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getOutputAccess().getNameKeyword_2());
            		
            // InternalShemaTables.g:723:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalShemaTables.g:724:4: (lv_name_3_0= RULE_ID )
            {
            // InternalShemaTables.g:724:4: (lv_name_3_0= RULE_ID )
            // InternalShemaTables.g:725:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_3_0, grammarAccess.getOutputAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getOutputAccess().getIdKeyword_4());
            		
            // InternalShemaTables.g:745:3: ( (lv_id_5_0= RULE_INT ) )
            // InternalShemaTables.g:746:4: (lv_id_5_0= RULE_INT )
            {
            // InternalShemaTables.g:746:4: (lv_id_5_0= RULE_INT )
            // InternalShemaTables.g:747:5: lv_id_5_0= RULE_INT
            {
            lv_id_5_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_id_5_0, grammarAccess.getOutputAccess().getIdINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getOutputAccess().getDataTypeKeyword_6());
            		
            // InternalShemaTables.g:767:3: ( (lv_dataType_7_0= ruleColumnDataType ) )
            // InternalShemaTables.g:768:4: (lv_dataType_7_0= ruleColumnDataType )
            {
            // InternalShemaTables.g:768:4: (lv_dataType_7_0= ruleColumnDataType )
            // InternalShemaTables.g:769:5: lv_dataType_7_0= ruleColumnDataType
            {

            					newCompositeNode(grammarAccess.getOutputAccess().getDataTypeColumnDataTypeEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_17);
            lv_dataType_7_0=ruleColumnDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputRule());
            					}
            					set(
            						current,
            						"dataType",
            						lv_dataType_7_0,
            						"fr.n7.idm.project.xtext.ShemaTables.ColumnDataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getOutputAccess().getConstraintKeyword_8());
            		
            // InternalShemaTables.g:790:3: ( (lv_constraint_9_0= ruleConstraint ) )
            // InternalShemaTables.g:791:4: (lv_constraint_9_0= ruleConstraint )
            {
            // InternalShemaTables.g:791:4: (lv_constraint_9_0= ruleConstraint )
            // InternalShemaTables.g:792:5: lv_constraint_9_0= ruleConstraint
            {

            					newCompositeNode(grammarAccess.getOutputAccess().getConstraintConstraintParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_14);
            lv_constraint_9_0=ruleConstraint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputRule());
            					}
            					set(
            						current,
            						"constraint",
            						lv_constraint_9_0,
            						"fr.n7.idm.project.xtext.ShemaTables.Constraint");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleConstant"
    // InternalShemaTables.g:817:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalShemaTables.g:817:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalShemaTables.g:818:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalShemaTables.g:824:1: ruleConstant returns [EObject current=null] : (otherlv_0= 'Constant' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= '}' ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalShemaTables.g:830:2: ( (otherlv_0= 'Constant' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= '}' ) )
            // InternalShemaTables.g:831:2: (otherlv_0= 'Constant' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= '}' )
            {
            // InternalShemaTables.g:831:2: (otherlv_0= 'Constant' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= '}' )
            // InternalShemaTables.g:832:3: otherlv_0= 'Constant' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= RULE_INT ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConstantAccess().getConstantKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getConstantAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getValueKeyword_2());
            		
            // InternalShemaTables.g:844:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalShemaTables.g:845:4: (lv_value_3_0= RULE_INT )
            {
            // InternalShemaTables.g:845:4: (lv_value_3_0= RULE_INT )
            // InternalShemaTables.g:846:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_value_3_0, grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConstantAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "ruleColumnDataType"
    // InternalShemaTables.g:870:1: ruleColumnDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'string' ) ) ;
    public final Enumerator ruleColumnDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalShemaTables.g:876:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'string' ) ) )
            // InternalShemaTables.g:877:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'string' ) )
            {
            // InternalShemaTables.g:877:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'string' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt5=1;
                }
                break;
            case 37:
                {
                alt5=2;
                }
                break;
            case 38:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalShemaTables.g:878:3: (enumLiteral_0= 'int' )
                    {
                    // InternalShemaTables.g:878:3: (enumLiteral_0= 'int' )
                    // InternalShemaTables.g:879:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getColumnDataTypeAccess().getIntEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColumnDataTypeAccess().getIntEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalShemaTables.g:886:3: (enumLiteral_1= 'float' )
                    {
                    // InternalShemaTables.g:886:3: (enumLiteral_1= 'float' )
                    // InternalShemaTables.g:887:4: enumLiteral_1= 'float'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getColumnDataTypeAccess().getFloatEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColumnDataTypeAccess().getFloatEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalShemaTables.g:894:3: (enumLiteral_2= 'string' )
                    {
                    // InternalShemaTables.g:894:3: (enumLiteral_2= 'string' )
                    // InternalShemaTables.g:895:4: enumLiteral_2= 'string'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getColumnDataTypeAccess().getStringEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColumnDataTypeAccess().getStringEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleColumnDataType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});

}