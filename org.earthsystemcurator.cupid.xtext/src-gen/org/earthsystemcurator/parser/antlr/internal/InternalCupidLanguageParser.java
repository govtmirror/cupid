package org.earthsystemcurator.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.earthsystemcurator.services.CupidLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCupidLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ANNOTATION_ID", "RULE_INT", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'language '", "'{'", "'}'", "'='", "'<'", "'>'", "'concept'", "'top'", "'!'", "'!!'", "':'", "'attrib'", "'*'", "'+'", "'before'", "'('", "')'", "'after'", "'module'", "'moduleName'", "'usesModule'", "'usesEntity'", "'subroutine'", "','", "'in'", "'out'", "'inout'", "'integer'", "'character'", "'logical'", "'real'", "'double'", "'precision'", "'type'", "'subroutineName'", "'call'", "'?'", "'actualParamByKeyword'", "'declaration'", "'declaredEntity'", "'functionAssignment'", "'#'", "'/'", "'^'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int T__50=50;
    public static final int RULE_ANNOTATION_ID=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalCupidLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCupidLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCupidLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g"; }



     	private CupidLanguageGrammarAccess grammarAccess;
     	
        public InternalCupidLanguageParser(TokenStream input, CupidLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Language";	
       	}
       	
       	@Override
       	protected CupidLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLanguage"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:67:1: entryRuleLanguage returns [EObject current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final EObject entryRuleLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguage = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:68:2: (iv_ruleLanguage= ruleLanguage EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:69:2: iv_ruleLanguage= ruleLanguage EOF
            {
             newCompositeNode(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_ruleLanguage_in_entryRuleLanguage75);
            iv_ruleLanguage=ruleLanguage();

            state._fsp--;

             current =iv_ruleLanguage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLanguage85); 

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
    // $ANTLR end "entryRuleLanguage"


    // $ANTLR start "ruleLanguage"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:76:1: ruleLanguage returns [EObject current=null] : (otherlv_0= 'language ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_conceptDef_4_0= ruleTopConceptDef ) ) ( (lv_conceptDef_5_0= ruleNamedConceptDef ) )* otherlv_6= '}' ) ;
    public final EObject ruleLanguage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_uri_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_conceptDef_4_0 = null;

        EObject lv_conceptDef_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:79:28: ( (otherlv_0= 'language ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_conceptDef_4_0= ruleTopConceptDef ) ) ( (lv_conceptDef_5_0= ruleNamedConceptDef ) )* otherlv_6= '}' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:80:1: (otherlv_0= 'language ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_conceptDef_4_0= ruleTopConceptDef ) ) ( (lv_conceptDef_5_0= ruleNamedConceptDef ) )* otherlv_6= '}' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:80:1: (otherlv_0= 'language ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_conceptDef_4_0= ruleTopConceptDef ) ) ( (lv_conceptDef_5_0= ruleNamedConceptDef ) )* otherlv_6= '}' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:80:3: otherlv_0= 'language ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_conceptDef_4_0= ruleTopConceptDef ) ) ( (lv_conceptDef_5_0= ruleNamedConceptDef ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleLanguage122); 

                	newLeafNode(otherlv_0, grammarAccess.getLanguageAccess().getLanguageKeyword_0());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:85:1: (lv_name_1_0= RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLanguage139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLanguageAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLanguageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:102:2: ( (lv_uri_2_0= RULE_STRING ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:103:1: (lv_uri_2_0= RULE_STRING )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:103:1: (lv_uri_2_0= RULE_STRING )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:104:3: lv_uri_2_0= RULE_STRING
            {
            lv_uri_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLanguage161); 

            			newLeafNode(lv_uri_2_0, grammarAccess.getLanguageAccess().getUriSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLanguageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"uri",
                    		lv_uri_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleLanguage178); 

                	newLeafNode(otherlv_3, grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:124:1: ( (lv_conceptDef_4_0= ruleTopConceptDef ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:125:1: (lv_conceptDef_4_0= ruleTopConceptDef )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:125:1: (lv_conceptDef_4_0= ruleTopConceptDef )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:126:3: lv_conceptDef_4_0= ruleTopConceptDef
            {
             
            	        newCompositeNode(grammarAccess.getLanguageAccess().getConceptDefTopConceptDefParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTopConceptDef_in_ruleLanguage199);
            lv_conceptDef_4_0=ruleTopConceptDef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLanguageRule());
            	        }
                   		add(
                   			current, 
                   			"conceptDef",
                    		lv_conceptDef_4_0, 
                    		"TopConceptDef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:142:2: ( (lv_conceptDef_5_0= ruleNamedConceptDef ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:143:1: (lv_conceptDef_5_0= ruleNamedConceptDef )
            	    {
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:143:1: (lv_conceptDef_5_0= ruleNamedConceptDef )
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:144:3: lv_conceptDef_5_0= ruleNamedConceptDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLanguageAccess().getConceptDefNamedConceptDefParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNamedConceptDef_in_ruleLanguage220);
            	    lv_conceptDef_5_0=ruleNamedConceptDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLanguageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"conceptDef",
            	            		lv_conceptDef_5_0, 
            	            		"NamedConceptDef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleLanguage233); 

                	newLeafNode(otherlv_6, grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "entryRuleAnnotation"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:172:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:173:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:174:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation269);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation279); 

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:181:1: ruleAnnotation returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ANNOTATION_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:184:28: ( ( ( (lv_key_0_0= RULE_ANNOTATION_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:185:1: ( ( (lv_key_0_0= RULE_ANNOTATION_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:185:1: ( ( (lv_key_0_0= RULE_ANNOTATION_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:185:2: ( (lv_key_0_0= RULE_ANNOTATION_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )?
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:185:2: ( (lv_key_0_0= RULE_ANNOTATION_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:186:1: (lv_key_0_0= RULE_ANNOTATION_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:186:1: (lv_key_0_0= RULE_ANNOTATION_ID )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:187:3: lv_key_0_0= RULE_ANNOTATION_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ANNOTATION_ID,FOLLOW_RULE_ANNOTATION_ID_in_ruleAnnotation321); 

            			newLeafNode(lv_key_0_0, grammarAccess.getAnnotationAccess().getKeyANNOTATION_IDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_0_0, 
                    		"ANNOTATION_ID");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:203:2: (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:203:4: otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleAnnotation339); 

                        	newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getEqualsSignKeyword_1_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:207:1: ( (lv_value_2_0= RULE_STRING ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:208:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:208:1: (lv_value_2_0= RULE_STRING )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:209:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAnnotation356); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnnotationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleAnonymousConceptDef"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:233:1: entryRuleAnonymousConceptDef returns [EObject current=null] : iv_ruleAnonymousConceptDef= ruleAnonymousConceptDef EOF ;
    public final EObject entryRuleAnonymousConceptDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonymousConceptDef = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:234:2: (iv_ruleAnonymousConceptDef= ruleAnonymousConceptDef EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:235:2: iv_ruleAnonymousConceptDef= ruleAnonymousConceptDef EOF
            {
             newCompositeNode(grammarAccess.getAnonymousConceptDefRule()); 
            pushFollow(FOLLOW_ruleAnonymousConceptDef_in_entryRuleAnonymousConceptDef399);
            iv_ruleAnonymousConceptDef=ruleAnonymousConceptDef();

            state._fsp--;

             current =iv_ruleAnonymousConceptDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnonymousConceptDef409); 

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
    // $ANTLR end "entryRuleAnonymousConceptDef"


    // $ANTLR start "ruleAnonymousConceptDef"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:242:1: ruleAnonymousConceptDef returns [EObject current=null] : ( () (otherlv_1= '<' ( (lv_mapping_2_0= ruleMapping ) ) otherlv_3= '>' )? (otherlv_4= '{' ( (lv_annotation_5_0= ruleAnnotation ) )* ( (lv_child_6_0= ruleSubconceptOrAttribute ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleAnonymousConceptDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_mapping_2_0 = null;

        EObject lv_annotation_5_0 = null;

        EObject lv_child_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:245:28: ( ( () (otherlv_1= '<' ( (lv_mapping_2_0= ruleMapping ) ) otherlv_3= '>' )? (otherlv_4= '{' ( (lv_annotation_5_0= ruleAnnotation ) )* ( (lv_child_6_0= ruleSubconceptOrAttribute ) )* otherlv_7= '}' )? ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:246:1: ( () (otherlv_1= '<' ( (lv_mapping_2_0= ruleMapping ) ) otherlv_3= '>' )? (otherlv_4= '{' ( (lv_annotation_5_0= ruleAnnotation ) )* ( (lv_child_6_0= ruleSubconceptOrAttribute ) )* otherlv_7= '}' )? )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:246:1: ( () (otherlv_1= '<' ( (lv_mapping_2_0= ruleMapping ) ) otherlv_3= '>' )? (otherlv_4= '{' ( (lv_annotation_5_0= ruleAnnotation ) )* ( (lv_child_6_0= ruleSubconceptOrAttribute ) )* otherlv_7= '}' )? )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:246:2: () (otherlv_1= '<' ( (lv_mapping_2_0= ruleMapping ) ) otherlv_3= '>' )? (otherlv_4= '{' ( (lv_annotation_5_0= ruleAnnotation ) )* ( (lv_child_6_0= ruleSubconceptOrAttribute ) )* otherlv_7= '}' )?
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:246:2: ()
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:247:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnonymousConceptDefAccess().getConceptDefAction_0(),
                        current);
                

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:252:2: (otherlv_1= '<' ( (lv_mapping_2_0= ruleMapping ) ) otherlv_3= '>' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:252:4: otherlv_1= '<' ( (lv_mapping_2_0= ruleMapping ) ) otherlv_3= '>'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleAnonymousConceptDef456); 

                        	newLeafNode(otherlv_1, grammarAccess.getAnonymousConceptDefAccess().getLessThanSignKeyword_1_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:256:1: ( (lv_mapping_2_0= ruleMapping ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:257:1: (lv_mapping_2_0= ruleMapping )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:257:1: (lv_mapping_2_0= ruleMapping )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:258:3: lv_mapping_2_0= ruleMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnonymousConceptDefAccess().getMappingMappingParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapping_in_ruleAnonymousConceptDef477);
                    lv_mapping_2_0=ruleMapping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnonymousConceptDefRule());
                    	        }
                           		set(
                           			current, 
                           			"mapping",
                            		lv_mapping_2_0, 
                            		"Mapping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleAnonymousConceptDef489); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnonymousConceptDefAccess().getGreaterThanSignKeyword_1_2());
                        

                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:278:3: (otherlv_4= '{' ( (lv_annotation_5_0= ruleAnnotation ) )* ( (lv_child_6_0= ruleSubconceptOrAttribute ) )* otherlv_7= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:278:5: otherlv_4= '{' ( (lv_annotation_5_0= ruleAnnotation ) )* ( (lv_child_6_0= ruleSubconceptOrAttribute ) )* otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleAnonymousConceptDef504); 

                        	newLeafNode(otherlv_4, grammarAccess.getAnonymousConceptDefAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:282:1: ( (lv_annotation_5_0= ruleAnnotation ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ANNOTATION_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:283:1: (lv_annotation_5_0= ruleAnnotation )
                    	    {
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:283:1: (lv_annotation_5_0= ruleAnnotation )
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:284:3: lv_annotation_5_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnonymousConceptDefAccess().getAnnotationAnnotationParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAnonymousConceptDef525);
                    	    lv_annotation_5_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnonymousConceptDefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotation",
                    	            		lv_annotation_5_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:300:3: ( (lv_child_6_0= ruleSubconceptOrAttribute ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID||LA5_0==23) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:301:1: (lv_child_6_0= ruleSubconceptOrAttribute )
                    	    {
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:301:1: (lv_child_6_0= ruleSubconceptOrAttribute )
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:302:3: lv_child_6_0= ruleSubconceptOrAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnonymousConceptDefAccess().getChildSubconceptOrAttributeParserRuleCall_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSubconceptOrAttribute_in_ruleAnonymousConceptDef547);
                    	    lv_child_6_0=ruleSubconceptOrAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnonymousConceptDefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"child",
                    	            		lv_child_6_0, 
                    	            		"SubconceptOrAttribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleAnonymousConceptDef560); 

                        	newLeafNode(otherlv_7, grammarAccess.getAnonymousConceptDefAccess().getRightCurlyBracketKeyword_2_3());
                        

                    }
                    break;

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
    // $ANTLR end "ruleAnonymousConceptDef"


    // $ANTLR start "entryRuleNamedConceptDef"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:330:1: entryRuleNamedConceptDef returns [EObject current=null] : iv_ruleNamedConceptDef= ruleNamedConceptDef EOF ;
    public final EObject entryRuleNamedConceptDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedConceptDef = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:331:2: (iv_ruleNamedConceptDef= ruleNamedConceptDef EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:332:2: iv_ruleNamedConceptDef= ruleNamedConceptDef EOF
            {
             newCompositeNode(grammarAccess.getNamedConceptDefRule()); 
            pushFollow(FOLLOW_ruleNamedConceptDef_in_entryRuleNamedConceptDef598);
            iv_ruleNamedConceptDef=ruleNamedConceptDef();

            state._fsp--;

             current =iv_ruleNamedConceptDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedConceptDef608); 

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
    // $ANTLR end "entryRuleNamedConceptDef"


    // $ANTLR start "ruleNamedConceptDef"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:339:1: ruleNamedConceptDef returns [EObject current=null] : ( ( (lv_named_0_0= 'concept' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_mapping_3_0= ruleMapping ) ) otherlv_4= '>' )? (otherlv_5= '{' ( (lv_annotation_6_0= ruleAnnotation ) )* ( (lv_child_7_0= ruleSubconceptOrAttribute ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleNamedConceptDef() throws RecognitionException {
        EObject current = null;

        Token lv_named_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_mapping_3_0 = null;

        EObject lv_annotation_6_0 = null;

        EObject lv_child_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:342:28: ( ( ( (lv_named_0_0= 'concept' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_mapping_3_0= ruleMapping ) ) otherlv_4= '>' )? (otherlv_5= '{' ( (lv_annotation_6_0= ruleAnnotation ) )* ( (lv_child_7_0= ruleSubconceptOrAttribute ) )* otherlv_8= '}' )? ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:343:1: ( ( (lv_named_0_0= 'concept' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_mapping_3_0= ruleMapping ) ) otherlv_4= '>' )? (otherlv_5= '{' ( (lv_annotation_6_0= ruleAnnotation ) )* ( (lv_child_7_0= ruleSubconceptOrAttribute ) )* otherlv_8= '}' )? )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:343:1: ( ( (lv_named_0_0= 'concept' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_mapping_3_0= ruleMapping ) ) otherlv_4= '>' )? (otherlv_5= '{' ( (lv_annotation_6_0= ruleAnnotation ) )* ( (lv_child_7_0= ruleSubconceptOrAttribute ) )* otherlv_8= '}' )? )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:343:2: ( (lv_named_0_0= 'concept' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_mapping_3_0= ruleMapping ) ) otherlv_4= '>' )? (otherlv_5= '{' ( (lv_annotation_6_0= ruleAnnotation ) )* ( (lv_child_7_0= ruleSubconceptOrAttribute ) )* otherlv_8= '}' )?
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:343:2: ( (lv_named_0_0= 'concept' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:344:1: (lv_named_0_0= 'concept' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:344:1: (lv_named_0_0= 'concept' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:345:3: lv_named_0_0= 'concept'
            {
            lv_named_0_0=(Token)match(input,18,FOLLOW_18_in_ruleNamedConceptDef651); 

                    newLeafNode(lv_named_0_0, grammarAccess.getNamedConceptDefAccess().getNamedConceptKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNamedConceptDefRule());
            	        }
                   		setWithLastConsumed(current, "named", true, "concept");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:358:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:359:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:359:1: (lv_name_1_0= RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:360:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedConceptDef681); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNamedConceptDefAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNamedConceptDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:376:2: (otherlv_2= '<' ( (lv_mapping_3_0= ruleMapping ) ) otherlv_4= '>' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:376:4: otherlv_2= '<' ( (lv_mapping_3_0= ruleMapping ) ) otherlv_4= '>'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleNamedConceptDef699); 

                        	newLeafNode(otherlv_2, grammarAccess.getNamedConceptDefAccess().getLessThanSignKeyword_2_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:380:1: ( (lv_mapping_3_0= ruleMapping ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:381:1: (lv_mapping_3_0= ruleMapping )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:381:1: (lv_mapping_3_0= ruleMapping )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:382:3: lv_mapping_3_0= ruleMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getNamedConceptDefAccess().getMappingMappingParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapping_in_ruleNamedConceptDef720);
                    lv_mapping_3_0=ruleMapping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNamedConceptDefRule());
                    	        }
                           		set(
                           			current, 
                           			"mapping",
                            		lv_mapping_3_0, 
                            		"Mapping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleNamedConceptDef732); 

                        	newLeafNode(otherlv_4, grammarAccess.getNamedConceptDefAccess().getGreaterThanSignKeyword_2_2());
                        

                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:402:3: (otherlv_5= '{' ( (lv_annotation_6_0= ruleAnnotation ) )* ( (lv_child_7_0= ruleSubconceptOrAttribute ) )* otherlv_8= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:402:5: otherlv_5= '{' ( (lv_annotation_6_0= ruleAnnotation ) )* ( (lv_child_7_0= ruleSubconceptOrAttribute ) )* otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleNamedConceptDef747); 

                        	newLeafNode(otherlv_5, grammarAccess.getNamedConceptDefAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:406:1: ( (lv_annotation_6_0= ruleAnnotation ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ANNOTATION_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:407:1: (lv_annotation_6_0= ruleAnnotation )
                    	    {
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:407:1: (lv_annotation_6_0= ruleAnnotation )
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:408:3: lv_annotation_6_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNamedConceptDefAccess().getAnnotationAnnotationParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleNamedConceptDef768);
                    	    lv_annotation_6_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNamedConceptDefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotation",
                    	            		lv_annotation_6_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:424:3: ( (lv_child_7_0= ruleSubconceptOrAttribute ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID||LA9_0==23) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:425:1: (lv_child_7_0= ruleSubconceptOrAttribute )
                    	    {
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:425:1: (lv_child_7_0= ruleSubconceptOrAttribute )
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:426:3: lv_child_7_0= ruleSubconceptOrAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNamedConceptDefAccess().getChildSubconceptOrAttributeParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSubconceptOrAttribute_in_ruleNamedConceptDef790);
                    	    lv_child_7_0=ruleSubconceptOrAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNamedConceptDefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"child",
                    	            		lv_child_7_0, 
                    	            		"SubconceptOrAttribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleNamedConceptDef803); 

                        	newLeafNode(otherlv_8, grammarAccess.getNamedConceptDefAccess().getRightCurlyBracketKeyword_3_3());
                        

                    }
                    break;

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
    // $ANTLR end "ruleNamedConceptDef"


    // $ANTLR start "entryRuleTopConceptDef"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:454:1: entryRuleTopConceptDef returns [EObject current=null] : iv_ruleTopConceptDef= ruleTopConceptDef EOF ;
    public final EObject entryRuleTopConceptDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopConceptDef = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:455:2: (iv_ruleTopConceptDef= ruleTopConceptDef EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:456:2: iv_ruleTopConceptDef= ruleTopConceptDef EOF
            {
             newCompositeNode(grammarAccess.getTopConceptDefRule()); 
            pushFollow(FOLLOW_ruleTopConceptDef_in_entryRuleTopConceptDef841);
            iv_ruleTopConceptDef=ruleTopConceptDef();

            state._fsp--;

             current =iv_ruleTopConceptDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopConceptDef851); 

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
    // $ANTLR end "entryRuleTopConceptDef"


    // $ANTLR start "ruleTopConceptDef"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:463:1: ruleTopConceptDef returns [EObject current=null] : ( ( (lv_top_0_0= 'top' ) ) ( (lv_named_1_0= 'concept' ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? (otherlv_6= '{' ( (lv_annotation_7_0= ruleAnnotation ) )* ( (lv_child_8_0= ruleSubconceptOrAttribute ) )* otherlv_9= '}' )? ) ;
    public final EObject ruleTopConceptDef() throws RecognitionException {
        EObject current = null;

        Token lv_top_0_0=null;
        Token lv_named_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_mapping_4_0 = null;

        EObject lv_annotation_7_0 = null;

        EObject lv_child_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:466:28: ( ( ( (lv_top_0_0= 'top' ) ) ( (lv_named_1_0= 'concept' ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? (otherlv_6= '{' ( (lv_annotation_7_0= ruleAnnotation ) )* ( (lv_child_8_0= ruleSubconceptOrAttribute ) )* otherlv_9= '}' )? ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:467:1: ( ( (lv_top_0_0= 'top' ) ) ( (lv_named_1_0= 'concept' ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? (otherlv_6= '{' ( (lv_annotation_7_0= ruleAnnotation ) )* ( (lv_child_8_0= ruleSubconceptOrAttribute ) )* otherlv_9= '}' )? )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:467:1: ( ( (lv_top_0_0= 'top' ) ) ( (lv_named_1_0= 'concept' ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? (otherlv_6= '{' ( (lv_annotation_7_0= ruleAnnotation ) )* ( (lv_child_8_0= ruleSubconceptOrAttribute ) )* otherlv_9= '}' )? )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:467:2: ( (lv_top_0_0= 'top' ) ) ( (lv_named_1_0= 'concept' ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? (otherlv_6= '{' ( (lv_annotation_7_0= ruleAnnotation ) )* ( (lv_child_8_0= ruleSubconceptOrAttribute ) )* otherlv_9= '}' )?
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:467:2: ( (lv_top_0_0= 'top' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:468:1: (lv_top_0_0= 'top' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:468:1: (lv_top_0_0= 'top' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:469:3: lv_top_0_0= 'top'
            {
            lv_top_0_0=(Token)match(input,19,FOLLOW_19_in_ruleTopConceptDef894); 

                    newLeafNode(lv_top_0_0, grammarAccess.getTopConceptDefAccess().getTopTopKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTopConceptDefRule());
            	        }
                   		setWithLastConsumed(current, "top", true, "top");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:482:2: ( (lv_named_1_0= 'concept' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:483:1: (lv_named_1_0= 'concept' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:483:1: (lv_named_1_0= 'concept' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:484:3: lv_named_1_0= 'concept'
            {
            lv_named_1_0=(Token)match(input,18,FOLLOW_18_in_ruleTopConceptDef925); 

                    newLeafNode(lv_named_1_0, grammarAccess.getTopConceptDefAccess().getNamedConceptKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTopConceptDefRule());
            	        }
                   		setWithLastConsumed(current, "named", true, "concept");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:497:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:498:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:498:1: (lv_name_2_0= RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:499:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTopConceptDef955); 

            			newLeafNode(lv_name_2_0, grammarAccess.getTopConceptDefAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTopConceptDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:515:2: (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:515:4: otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleTopConceptDef973); 

                        	newLeafNode(otherlv_3, grammarAccess.getTopConceptDefAccess().getLessThanSignKeyword_3_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:519:1: ( (lv_mapping_4_0= ruleMapping ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:520:1: (lv_mapping_4_0= ruleMapping )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:520:1: (lv_mapping_4_0= ruleMapping )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:521:3: lv_mapping_4_0= ruleMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getTopConceptDefAccess().getMappingMappingParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapping_in_ruleTopConceptDef994);
                    lv_mapping_4_0=ruleMapping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTopConceptDefRule());
                    	        }
                           		set(
                           			current, 
                           			"mapping",
                            		lv_mapping_4_0, 
                            		"Mapping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleTopConceptDef1006); 

                        	newLeafNode(otherlv_5, grammarAccess.getTopConceptDefAccess().getGreaterThanSignKeyword_3_2());
                        

                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:541:3: (otherlv_6= '{' ( (lv_annotation_7_0= ruleAnnotation ) )* ( (lv_child_8_0= ruleSubconceptOrAttribute ) )* otherlv_9= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:541:5: otherlv_6= '{' ( (lv_annotation_7_0= ruleAnnotation ) )* ( (lv_child_8_0= ruleSubconceptOrAttribute ) )* otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleTopConceptDef1021); 

                        	newLeafNode(otherlv_6, grammarAccess.getTopConceptDefAccess().getLeftCurlyBracketKeyword_4_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:545:1: ( (lv_annotation_7_0= ruleAnnotation ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ANNOTATION_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:546:1: (lv_annotation_7_0= ruleAnnotation )
                    	    {
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:546:1: (lv_annotation_7_0= ruleAnnotation )
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:547:3: lv_annotation_7_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTopConceptDefAccess().getAnnotationAnnotationParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleTopConceptDef1042);
                    	    lv_annotation_7_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTopConceptDefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotation",
                    	            		lv_annotation_7_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:563:3: ( (lv_child_8_0= ruleSubconceptOrAttribute ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID||LA13_0==23) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:564:1: (lv_child_8_0= ruleSubconceptOrAttribute )
                    	    {
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:564:1: (lv_child_8_0= ruleSubconceptOrAttribute )
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:565:3: lv_child_8_0= ruleSubconceptOrAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTopConceptDefAccess().getChildSubconceptOrAttributeParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSubconceptOrAttribute_in_ruleTopConceptDef1064);
                    	    lv_child_8_0=ruleSubconceptOrAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTopConceptDefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"child",
                    	            		lv_child_8_0, 
                    	            		"SubconceptOrAttribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleTopConceptDef1077); 

                        	newLeafNode(otherlv_9, grammarAccess.getTopConceptDefAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

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
    // $ANTLR end "ruleTopConceptDef"


    // $ANTLR start "entryRuleSubconceptOrAttribute"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:593:1: entryRuleSubconceptOrAttribute returns [EObject current=null] : iv_ruleSubconceptOrAttribute= ruleSubconceptOrAttribute EOF ;
    public final EObject entryRuleSubconceptOrAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubconceptOrAttribute = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:594:2: (iv_ruleSubconceptOrAttribute= ruleSubconceptOrAttribute EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:595:2: iv_ruleSubconceptOrAttribute= ruleSubconceptOrAttribute EOF
            {
             newCompositeNode(grammarAccess.getSubconceptOrAttributeRule()); 
            pushFollow(FOLLOW_ruleSubconceptOrAttribute_in_entryRuleSubconceptOrAttribute1115);
            iv_ruleSubconceptOrAttribute=ruleSubconceptOrAttribute();

            state._fsp--;

             current =iv_ruleSubconceptOrAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubconceptOrAttribute1125); 

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
    // $ANTLR end "entryRuleSubconceptOrAttribute"


    // $ANTLR start "ruleSubconceptOrAttribute"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:602:1: ruleSubconceptOrAttribute returns [EObject current=null] : (this_Subconcept_0= ruleSubconcept | this_Attribute_1= ruleAttribute ) ;
    public final EObject ruleSubconceptOrAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_Subconcept_0 = null;

        EObject this_Attribute_1 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:605:28: ( (this_Subconcept_0= ruleSubconcept | this_Attribute_1= ruleAttribute ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:606:1: (this_Subconcept_0= ruleSubconcept | this_Attribute_1= ruleAttribute )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:606:1: (this_Subconcept_0= ruleSubconcept | this_Attribute_1= ruleAttribute )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==23) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:607:5: this_Subconcept_0= ruleSubconcept
                    {
                     
                            newCompositeNode(grammarAccess.getSubconceptOrAttributeAccess().getSubconceptParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSubconcept_in_ruleSubconceptOrAttribute1172);
                    this_Subconcept_0=ruleSubconcept();

                    state._fsp--;

                     
                            current = this_Subconcept_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:617:5: this_Attribute_1= ruleAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getSubconceptOrAttributeAccess().getAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAttribute_in_ruleSubconceptOrAttribute1199);
                    this_Attribute_1=ruleAttribute();

                    state._fsp--;

                     
                            current = this_Attribute_1; 
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
    // $ANTLR end "ruleSubconceptOrAttribute"


    // $ANTLR start "entryRuleSubconcept"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:633:1: entryRuleSubconcept returns [EObject current=null] : iv_ruleSubconcept= ruleSubconcept EOF ;
    public final EObject entryRuleSubconcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubconcept = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:634:2: (iv_ruleSubconcept= ruleSubconcept EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:635:2: iv_ruleSubconcept= ruleSubconcept EOF
            {
             newCompositeNode(grammarAccess.getSubconceptRule()); 
            pushFollow(FOLLOW_ruleSubconcept_in_entryRuleSubconcept1234);
            iv_ruleSubconcept=ruleSubconcept();

            state._fsp--;

             current =iv_ruleSubconcept; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubconcept1244); 

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
    // $ANTLR end "entryRuleSubconcept"


    // $ANTLR start "ruleSubconcept"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:642:1: ruleSubconcept returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleCardinality ) )? ( ( (lv_essential_2_0= '!' ) )? | ( (lv_mustBeNull_3_0= '!!' ) ) ) ( (otherlv_4= ':' ( (lv_def_5_0= ruleNamedConceptDef ) ) ) | ( (lv_def_6_0= ruleAnonymousConceptDef ) ) | ( ( (lv_reference_7_0= ':' ) ) ( (otherlv_8= RULE_ID ) ) ) ) ) ;
    public final EObject ruleSubconcept() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_essential_2_0=null;
        Token lv_mustBeNull_3_0=null;
        Token otherlv_4=null;
        Token lv_reference_7_0=null;
        Token otherlv_8=null;
        EObject lv_cardinality_1_0 = null;

        EObject lv_def_5_0 = null;

        EObject lv_def_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:645:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleCardinality ) )? ( ( (lv_essential_2_0= '!' ) )? | ( (lv_mustBeNull_3_0= '!!' ) ) ) ( (otherlv_4= ':' ( (lv_def_5_0= ruleNamedConceptDef ) ) ) | ( (lv_def_6_0= ruleAnonymousConceptDef ) ) | ( ( (lv_reference_7_0= ':' ) ) ( (otherlv_8= RULE_ID ) ) ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:646:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleCardinality ) )? ( ( (lv_essential_2_0= '!' ) )? | ( (lv_mustBeNull_3_0= '!!' ) ) ) ( (otherlv_4= ':' ( (lv_def_5_0= ruleNamedConceptDef ) ) ) | ( (lv_def_6_0= ruleAnonymousConceptDef ) ) | ( ( (lv_reference_7_0= ':' ) ) ( (otherlv_8= RULE_ID ) ) ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:646:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleCardinality ) )? ( ( (lv_essential_2_0= '!' ) )? | ( (lv_mustBeNull_3_0= '!!' ) ) ) ( (otherlv_4= ':' ( (lv_def_5_0= ruleNamedConceptDef ) ) ) | ( (lv_def_6_0= ruleAnonymousConceptDef ) ) | ( ( (lv_reference_7_0= ':' ) ) ( (otherlv_8= RULE_ID ) ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:646:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleCardinality ) )? ( ( (lv_essential_2_0= '!' ) )? | ( (lv_mustBeNull_3_0= '!!' ) ) ) ( (otherlv_4= ':' ( (lv_def_5_0= ruleNamedConceptDef ) ) ) | ( (lv_def_6_0= ruleAnonymousConceptDef ) ) | ( ( (lv_reference_7_0= ':' ) ) ( (otherlv_8= RULE_ID ) ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:646:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:647:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:647:1: (lv_name_0_0= RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:648:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubconcept1286); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSubconceptAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubconceptRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:664:2: ( (lv_cardinality_1_0= ruleCardinality ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=24 && LA16_0<=25)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:665:1: (lv_cardinality_1_0= ruleCardinality )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:665:1: (lv_cardinality_1_0= ruleCardinality )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:666:3: lv_cardinality_1_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubconceptAccess().getCardinalityCardinalityParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleSubconcept1312);
                    lv_cardinality_1_0=ruleCardinality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubconceptRule());
                    	        }
                           		set(
                           			current, 
                           			"cardinality",
                            		lv_cardinality_1_0, 
                            		"Cardinality");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:682:3: ( ( (lv_essential_2_0= '!' ) )? | ( (lv_mustBeNull_3_0= '!!' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==EOF||LA18_0==RULE_ID||(LA18_0>=13 && LA18_0<=14)||LA18_0==16||LA18_0==20||(LA18_0>=22 && LA18_0<=23)) ) {
                alt18=1;
            }
            else if ( (LA18_0==21) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:682:4: ( (lv_essential_2_0= '!' ) )?
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:682:4: ( (lv_essential_2_0= '!' ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==20) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:683:1: (lv_essential_2_0= '!' )
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:683:1: (lv_essential_2_0= '!' )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:684:3: lv_essential_2_0= '!'
                            {
                            lv_essential_2_0=(Token)match(input,20,FOLLOW_20_in_ruleSubconcept1332); 

                                    newLeafNode(lv_essential_2_0, grammarAccess.getSubconceptAccess().getEssentialExclamationMarkKeyword_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getSubconceptRule());
                            	        }
                                   		setWithLastConsumed(current, "essential", true, "!");
                            	    

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:698:6: ( (lv_mustBeNull_3_0= '!!' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:698:6: ( (lv_mustBeNull_3_0= '!!' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:699:1: (lv_mustBeNull_3_0= '!!' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:699:1: (lv_mustBeNull_3_0= '!!' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:700:3: lv_mustBeNull_3_0= '!!'
                    {
                    lv_mustBeNull_3_0=(Token)match(input,21,FOLLOW_21_in_ruleSubconcept1370); 

                            newLeafNode(lv_mustBeNull_3_0, grammarAccess.getSubconceptAccess().getMustBeNullExclamationMarkExclamationMarkKeyword_2_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubconceptRule());
                    	        }
                           		setWithLastConsumed(current, "mustBeNull", true, "!!");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:713:3: ( (otherlv_4= ':' ( (lv_def_5_0= ruleNamedConceptDef ) ) ) | ( (lv_def_6_0= ruleAnonymousConceptDef ) ) | ( ( (lv_reference_7_0= ':' ) ) ( (otherlv_8= RULE_ID ) ) ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_ID) ) {
                    alt19=3;
                }
                else if ( (LA19_1==18) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA19_0==EOF||LA19_0==RULE_ID||(LA19_0>=13 && LA19_0<=14)||LA19_0==16||LA19_0==23) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:713:4: (otherlv_4= ':' ( (lv_def_5_0= ruleNamedConceptDef ) ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:713:4: (otherlv_4= ':' ( (lv_def_5_0= ruleNamedConceptDef ) ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:713:6: otherlv_4= ':' ( (lv_def_5_0= ruleNamedConceptDef ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleSubconcept1398); 

                        	newLeafNode(otherlv_4, grammarAccess.getSubconceptAccess().getColonKeyword_3_0_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:717:1: ( (lv_def_5_0= ruleNamedConceptDef ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:718:1: (lv_def_5_0= ruleNamedConceptDef )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:718:1: (lv_def_5_0= ruleNamedConceptDef )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:719:3: lv_def_5_0= ruleNamedConceptDef
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubconceptAccess().getDefNamedConceptDefParserRuleCall_3_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNamedConceptDef_in_ruleSubconcept1419);
                    lv_def_5_0=ruleNamedConceptDef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubconceptRule());
                    	        }
                           		set(
                           			current, 
                           			"def",
                            		lv_def_5_0, 
                            		"NamedConceptDef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:736:6: ( (lv_def_6_0= ruleAnonymousConceptDef ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:736:6: ( (lv_def_6_0= ruleAnonymousConceptDef ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:737:1: (lv_def_6_0= ruleAnonymousConceptDef )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:737:1: (lv_def_6_0= ruleAnonymousConceptDef )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:738:3: lv_def_6_0= ruleAnonymousConceptDef
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubconceptAccess().getDefAnonymousConceptDefParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnonymousConceptDef_in_ruleSubconcept1447);
                    lv_def_6_0=ruleAnonymousConceptDef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubconceptRule());
                    	        }
                           		set(
                           			current, 
                           			"def",
                            		lv_def_6_0, 
                            		"AnonymousConceptDef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:755:6: ( ( (lv_reference_7_0= ':' ) ) ( (otherlv_8= RULE_ID ) ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:755:6: ( ( (lv_reference_7_0= ':' ) ) ( (otherlv_8= RULE_ID ) ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:755:7: ( (lv_reference_7_0= ':' ) ) ( (otherlv_8= RULE_ID ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:755:7: ( (lv_reference_7_0= ':' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:756:1: (lv_reference_7_0= ':' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:756:1: (lv_reference_7_0= ':' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:757:3: lv_reference_7_0= ':'
                    {
                    lv_reference_7_0=(Token)match(input,22,FOLLOW_22_in_ruleSubconcept1472); 

                            newLeafNode(lv_reference_7_0, grammarAccess.getSubconceptAccess().getReferenceColonKeyword_3_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubconceptRule());
                    	        }
                           		setWithLastConsumed(current, "reference", true, ":");
                    	    

                    }


                    }

                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:770:2: ( (otherlv_8= RULE_ID ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:771:1: (otherlv_8= RULE_ID )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:771:1: (otherlv_8= RULE_ID )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:772:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubconceptRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubconcept1505); 

                    		newLeafNode(otherlv_8, grammarAccess.getSubconceptAccess().getRefConceptDefCrossReference_3_2_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleSubconcept"


    // $ANTLR start "entryRuleAttribute"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:791:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:792:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:793:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1543);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1553); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:800:1: ruleAttribute returns [EObject current=null] : ( ( (lv_attrib_0_0= 'attrib' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( (lv_essential_3_0= '!' ) )? | ( (lv_mustBeNull_4_0= '!!' ) ) ) (otherlv_5= '<' ( (lv_attribMapping_6_0= ruleMapping ) ) otherlv_7= '>' )? (otherlv_8= '{' ( (lv_annotation_9_0= ruleAnnotation ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_attrib_0_0=null;
        Token lv_name_1_0=null;
        Token lv_essential_3_0=null;
        Token lv_mustBeNull_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_cardinality_2_0 = null;

        EObject lv_attribMapping_6_0 = null;

        EObject lv_annotation_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:803:28: ( ( ( (lv_attrib_0_0= 'attrib' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( (lv_essential_3_0= '!' ) )? | ( (lv_mustBeNull_4_0= '!!' ) ) ) (otherlv_5= '<' ( (lv_attribMapping_6_0= ruleMapping ) ) otherlv_7= '>' )? (otherlv_8= '{' ( (lv_annotation_9_0= ruleAnnotation ) )* otherlv_10= '}' )? ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:804:1: ( ( (lv_attrib_0_0= 'attrib' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( (lv_essential_3_0= '!' ) )? | ( (lv_mustBeNull_4_0= '!!' ) ) ) (otherlv_5= '<' ( (lv_attribMapping_6_0= ruleMapping ) ) otherlv_7= '>' )? (otherlv_8= '{' ( (lv_annotation_9_0= ruleAnnotation ) )* otherlv_10= '}' )? )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:804:1: ( ( (lv_attrib_0_0= 'attrib' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( (lv_essential_3_0= '!' ) )? | ( (lv_mustBeNull_4_0= '!!' ) ) ) (otherlv_5= '<' ( (lv_attribMapping_6_0= ruleMapping ) ) otherlv_7= '>' )? (otherlv_8= '{' ( (lv_annotation_9_0= ruleAnnotation ) )* otherlv_10= '}' )? )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:804:2: ( (lv_attrib_0_0= 'attrib' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( ( (lv_essential_3_0= '!' ) )? | ( (lv_mustBeNull_4_0= '!!' ) ) ) (otherlv_5= '<' ( (lv_attribMapping_6_0= ruleMapping ) ) otherlv_7= '>' )? (otherlv_8= '{' ( (lv_annotation_9_0= ruleAnnotation ) )* otherlv_10= '}' )?
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:804:2: ( (lv_attrib_0_0= 'attrib' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:805:1: (lv_attrib_0_0= 'attrib' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:805:1: (lv_attrib_0_0= 'attrib' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:806:3: lv_attrib_0_0= 'attrib'
            {
            lv_attrib_0_0=(Token)match(input,23,FOLLOW_23_in_ruleAttribute1596); 

                    newLeafNode(lv_attrib_0_0, grammarAccess.getAttributeAccess().getAttribAttribKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(current, "attrib", true, "attrib");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:819:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:820:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:820:1: (lv_name_1_0= RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:821:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1626); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:837:2: ( (lv_cardinality_2_0= ruleCardinality ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=24 && LA20_0<=25)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:838:1: (lv_cardinality_2_0= ruleCardinality )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:838:1: (lv_cardinality_2_0= ruleCardinality )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:839:3: lv_cardinality_2_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getCardinalityCardinalityParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleAttribute1652);
                    lv_cardinality_2_0=ruleCardinality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"cardinality",
                            		lv_cardinality_2_0, 
                            		"Cardinality");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:855:3: ( ( (lv_essential_3_0= '!' ) )? | ( (lv_mustBeNull_4_0= '!!' ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==EOF||LA22_0==RULE_ID||(LA22_0>=13 && LA22_0<=14)||LA22_0==16||LA22_0==20||LA22_0==23) ) {
                alt22=1;
            }
            else if ( (LA22_0==21) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:855:4: ( (lv_essential_3_0= '!' ) )?
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:855:4: ( (lv_essential_3_0= '!' ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==20) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:856:1: (lv_essential_3_0= '!' )
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:856:1: (lv_essential_3_0= '!' )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:857:3: lv_essential_3_0= '!'
                            {
                            lv_essential_3_0=(Token)match(input,20,FOLLOW_20_in_ruleAttribute1672); 

                                    newLeafNode(lv_essential_3_0, grammarAccess.getAttributeAccess().getEssentialExclamationMarkKeyword_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getAttributeRule());
                            	        }
                                   		setWithLastConsumed(current, "essential", true, "!");
                            	    

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:871:6: ( (lv_mustBeNull_4_0= '!!' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:871:6: ( (lv_mustBeNull_4_0= '!!' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:872:1: (lv_mustBeNull_4_0= '!!' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:872:1: (lv_mustBeNull_4_0= '!!' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:873:3: lv_mustBeNull_4_0= '!!'
                    {
                    lv_mustBeNull_4_0=(Token)match(input,21,FOLLOW_21_in_ruleAttribute1710); 

                            newLeafNode(lv_mustBeNull_4_0, grammarAccess.getAttributeAccess().getMustBeNullExclamationMarkExclamationMarkKeyword_3_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "mustBeNull", true, "!!");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:886:3: (otherlv_5= '<' ( (lv_attribMapping_6_0= ruleMapping ) ) otherlv_7= '>' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==16) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:886:5: otherlv_5= '<' ( (lv_attribMapping_6_0= ruleMapping ) ) otherlv_7= '>'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleAttribute1737); 

                        	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getLessThanSignKeyword_4_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:890:1: ( (lv_attribMapping_6_0= ruleMapping ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:891:1: (lv_attribMapping_6_0= ruleMapping )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:891:1: (lv_attribMapping_6_0= ruleMapping )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:892:3: lv_attribMapping_6_0= ruleMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getAttribMappingMappingParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapping_in_ruleAttribute1758);
                    lv_attribMapping_6_0=ruleMapping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"attribMapping",
                            		lv_attribMapping_6_0, 
                            		"Mapping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleAttribute1770); 

                        	newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getGreaterThanSignKeyword_4_2());
                        

                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:912:3: (otherlv_8= '{' ( (lv_annotation_9_0= ruleAnnotation ) )* otherlv_10= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:912:5: otherlv_8= '{' ( (lv_annotation_9_0= ruleAnnotation ) )* otherlv_10= '}'
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleAttribute1785); 

                        	newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:916:1: ( (lv_annotation_9_0= ruleAnnotation ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_ANNOTATION_ID) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:917:1: (lv_annotation_9_0= ruleAnnotation )
                    	    {
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:917:1: (lv_annotation_9_0= ruleAnnotation )
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:918:3: lv_annotation_9_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationAnnotationParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAttribute1806);
                    	    lv_annotation_9_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotation",
                    	            		lv_annotation_9_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleAttribute1819); 

                        	newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2());
                        

                    }
                    break;

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleCardinality"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:946:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:947:2: (iv_ruleCardinality= ruleCardinality EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:948:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality1857);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality1867); 

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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:955:1: ruleCardinality returns [EObject current=null] : ( ( (lv_zeroOrMore_0_0= '*' ) ) | ( (lv_oneOrMore_1_0= '+' ) ) ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token lv_zeroOrMore_0_0=null;
        Token lv_oneOrMore_1_0=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:958:28: ( ( ( (lv_zeroOrMore_0_0= '*' ) ) | ( (lv_oneOrMore_1_0= '+' ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:959:1: ( ( (lv_zeroOrMore_0_0= '*' ) ) | ( (lv_oneOrMore_1_0= '+' ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:959:1: ( ( (lv_zeroOrMore_0_0= '*' ) ) | ( (lv_oneOrMore_1_0= '+' ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24) ) {
                alt26=1;
            }
            else if ( (LA26_0==25) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:959:2: ( (lv_zeroOrMore_0_0= '*' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:959:2: ( (lv_zeroOrMore_0_0= '*' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:960:1: (lv_zeroOrMore_0_0= '*' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:960:1: (lv_zeroOrMore_0_0= '*' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:961:3: lv_zeroOrMore_0_0= '*'
                    {
                    lv_zeroOrMore_0_0=(Token)match(input,24,FOLLOW_24_in_ruleCardinality1910); 

                            newLeafNode(lv_zeroOrMore_0_0, grammarAccess.getCardinalityAccess().getZeroOrMoreAsteriskKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCardinalityRule());
                    	        }
                           		setWithLastConsumed(current, "zeroOrMore", true, "*");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:975:6: ( (lv_oneOrMore_1_0= '+' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:975:6: ( (lv_oneOrMore_1_0= '+' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:976:1: (lv_oneOrMore_1_0= '+' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:976:1: (lv_oneOrMore_1_0= '+' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:977:3: lv_oneOrMore_1_0= '+'
                    {
                    lv_oneOrMore_1_0=(Token)match(input,25,FOLLOW_25_in_ruleCardinality1947); 

                            newLeafNode(lv_oneOrMore_1_0, grammarAccess.getCardinalityAccess().getOneOrMorePlusSignKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCardinalityRule());
                    	        }
                           		setWithLastConsumed(current, "oneOrMore", true, "+");
                    	    

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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleMapping"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:998:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:999:2: (iv_ruleMapping= ruleMapping EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1000:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping1996);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping2006); 

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
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1007:1: ruleMapping returns [EObject current=null] : ( ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) ) (otherlv_2= 'before' otherlv_3= '(' ( (lv_before_4_0= rulePathExpr ) ) otherlv_5= ')' )? (otherlv_6= 'after' otherlv_7= '(' ( (lv_after_8_0= rulePathExpr ) ) otherlv_9= ')' )? ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_context_0_0 = null;

        EObject lv_mapping_1_0 = null;

        EObject lv_before_4_0 = null;

        EObject lv_after_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1010:28: ( ( ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) ) (otherlv_2= 'before' otherlv_3= '(' ( (lv_before_4_0= rulePathExpr ) ) otherlv_5= ')' )? (otherlv_6= 'after' otherlv_7= '(' ( (lv_after_8_0= rulePathExpr ) ) otherlv_9= ')' )? ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1011:1: ( ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) ) (otherlv_2= 'before' otherlv_3= '(' ( (lv_before_4_0= rulePathExpr ) ) otherlv_5= ')' )? (otherlv_6= 'after' otherlv_7= '(' ( (lv_after_8_0= rulePathExpr ) ) otherlv_9= ')' )? )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1011:1: ( ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) ) (otherlv_2= 'before' otherlv_3= '(' ( (lv_before_4_0= rulePathExpr ) ) otherlv_5= ')' )? (otherlv_6= 'after' otherlv_7= '(' ( (lv_after_8_0= rulePathExpr ) ) otherlv_9= ')' )? )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1011:2: ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) ) (otherlv_2= 'before' otherlv_3= '(' ( (lv_before_4_0= rulePathExpr ) ) otherlv_5= ')' )? (otherlv_6= 'after' otherlv_7= '(' ( (lv_after_8_0= rulePathExpr ) ) otherlv_9= ')' )?
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1011:2: ( (lv_context_0_0= rulePathExpr ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==53) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1012:1: (lv_context_0_0= rulePathExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1012:1: (lv_context_0_0= rulePathExpr )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1013:3: lv_context_0_0= rulePathExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getMappingAccess().getContextPathExprParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePathExpr_in_ruleMapping2052);
                    lv_context_0_0=rulePathExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMappingRule());
                    	        }
                           		set(
                           			current, 
                           			"context",
                            		lv_context_0_0, 
                            		"PathExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1029:3: ( (lv_mapping_1_0= ruleImplicitContextMapping ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1030:1: (lv_mapping_1_0= ruleImplicitContextMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1030:1: (lv_mapping_1_0= ruleImplicitContextMapping )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1031:3: lv_mapping_1_0= ruleImplicitContextMapping
            {
             
            	        newCompositeNode(grammarAccess.getMappingAccess().getMappingImplicitContextMappingParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleImplicitContextMapping_in_ruleMapping2074);
            lv_mapping_1_0=ruleImplicitContextMapping();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMappingRule());
            	        }
                   		set(
                   			current, 
                   			"mapping",
                    		lv_mapping_1_0, 
                    		"ImplicitContextMapping");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1047:2: (otherlv_2= 'before' otherlv_3= '(' ( (lv_before_4_0= rulePathExpr ) ) otherlv_5= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==26) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1047:4: otherlv_2= 'before' otherlv_3= '(' ( (lv_before_4_0= rulePathExpr ) ) otherlv_5= ')'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleMapping2087); 

                        	newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getBeforeKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleMapping2099); 

                        	newLeafNode(otherlv_3, grammarAccess.getMappingAccess().getLeftParenthesisKeyword_2_1());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1055:1: ( (lv_before_4_0= rulePathExpr ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1056:1: (lv_before_4_0= rulePathExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1056:1: (lv_before_4_0= rulePathExpr )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1057:3: lv_before_4_0= rulePathExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getMappingAccess().getBeforePathExprParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePathExpr_in_ruleMapping2120);
                    lv_before_4_0=rulePathExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMappingRule());
                    	        }
                           		set(
                           			current, 
                           			"before",
                            		lv_before_4_0, 
                            		"PathExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleMapping2132); 

                        	newLeafNode(otherlv_5, grammarAccess.getMappingAccess().getRightParenthesisKeyword_2_3());
                        

                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1077:3: (otherlv_6= 'after' otherlv_7= '(' ( (lv_after_8_0= rulePathExpr ) ) otherlv_9= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1077:5: otherlv_6= 'after' otherlv_7= '(' ( (lv_after_8_0= rulePathExpr ) ) otherlv_9= ')'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleMapping2147); 

                        	newLeafNode(otherlv_6, grammarAccess.getMappingAccess().getAfterKeyword_3_0());
                        
                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleMapping2159); 

                        	newLeafNode(otherlv_7, grammarAccess.getMappingAccess().getLeftParenthesisKeyword_3_1());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1085:1: ( (lv_after_8_0= rulePathExpr ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1086:1: (lv_after_8_0= rulePathExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1086:1: (lv_after_8_0= rulePathExpr )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1087:3: lv_after_8_0= rulePathExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getMappingAccess().getAfterPathExprParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePathExpr_in_ruleMapping2180);
                    lv_after_8_0=rulePathExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMappingRule());
                    	        }
                           		set(
                           			current, 
                           			"after",
                            		lv_after_8_0, 
                            		"PathExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleMapping2192); 

                        	newLeafNode(otherlv_9, grammarAccess.getMappingAccess().getRightParenthesisKeyword_3_3());
                        

                    }
                    break;

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
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleImplicitContextMapping"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1115:1: entryRuleImplicitContextMapping returns [EObject current=null] : iv_ruleImplicitContextMapping= ruleImplicitContextMapping EOF ;
    public final EObject entryRuleImplicitContextMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitContextMapping = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1116:2: (iv_ruleImplicitContextMapping= ruleImplicitContextMapping EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1117:2: iv_ruleImplicitContextMapping= ruleImplicitContextMapping EOF
            {
             newCompositeNode(grammarAccess.getImplicitContextMappingRule()); 
            pushFollow(FOLLOW_ruleImplicitContextMapping_in_entryRuleImplicitContextMapping2230);
            iv_ruleImplicitContextMapping=ruleImplicitContextMapping();

            state._fsp--;

             current =iv_ruleImplicitContextMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitContextMapping2240); 

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
    // $ANTLR end "entryRuleImplicitContextMapping"


    // $ANTLR start "ruleImplicitContextMapping"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1124:1: ruleImplicitContextMapping returns [EObject current=null] : (this_Module_0= ruleModule | this_ModuleName_1= ruleModuleName | this_UsesModule_2= ruleUsesModule | this_UsesEntity_3= ruleUsesEntity | this_Call_4= ruleCall | this_Subroutine_5= ruleSubroutine | this_SubroutineName_6= ruleSubroutineName | this_ActualParamByKeyword_7= ruleActualParamByKeyword | this_VariableDeclaration_8= ruleVariableDeclaration | ( () ruleDeclaredEntity ) | this_FunctionAssignment_11= ruleFunctionAssignment ) ;
    public final EObject ruleImplicitContextMapping() throws RecognitionException {
        EObject current = null;

        EObject this_Module_0 = null;

        EObject this_ModuleName_1 = null;

        EObject this_UsesModule_2 = null;

        EObject this_UsesEntity_3 = null;

        EObject this_Call_4 = null;

        EObject this_Subroutine_5 = null;

        EObject this_SubroutineName_6 = null;

        EObject this_ActualParamByKeyword_7 = null;

        EObject this_VariableDeclaration_8 = null;

        EObject this_FunctionAssignment_11 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1127:28: ( (this_Module_0= ruleModule | this_ModuleName_1= ruleModuleName | this_UsesModule_2= ruleUsesModule | this_UsesEntity_3= ruleUsesEntity | this_Call_4= ruleCall | this_Subroutine_5= ruleSubroutine | this_SubroutineName_6= ruleSubroutineName | this_ActualParamByKeyword_7= ruleActualParamByKeyword | this_VariableDeclaration_8= ruleVariableDeclaration | ( () ruleDeclaredEntity ) | this_FunctionAssignment_11= ruleFunctionAssignment ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1128:1: (this_Module_0= ruleModule | this_ModuleName_1= ruleModuleName | this_UsesModule_2= ruleUsesModule | this_UsesEntity_3= ruleUsesEntity | this_Call_4= ruleCall | this_Subroutine_5= ruleSubroutine | this_SubroutineName_6= ruleSubroutineName | this_ActualParamByKeyword_7= ruleActualParamByKeyword | this_VariableDeclaration_8= ruleVariableDeclaration | ( () ruleDeclaredEntity ) | this_FunctionAssignment_11= ruleFunctionAssignment )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1128:1: (this_Module_0= ruleModule | this_ModuleName_1= ruleModuleName | this_UsesModule_2= ruleUsesModule | this_UsesEntity_3= ruleUsesEntity | this_Call_4= ruleCall | this_Subroutine_5= ruleSubroutine | this_SubroutineName_6= ruleSubroutineName | this_ActualParamByKeyword_7= ruleActualParamByKeyword | this_VariableDeclaration_8= ruleVariableDeclaration | ( () ruleDeclaredEntity ) | this_FunctionAssignment_11= ruleFunctionAssignment )
            int alt30=11;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt30=1;
                }
                break;
            case 31:
                {
                alt30=2;
                }
                break;
            case 32:
                {
                alt30=3;
                }
                break;
            case 33:
                {
                alt30=4;
                }
                break;
            case 47:
                {
                alt30=5;
                }
                break;
            case 34:
                {
                alt30=6;
                }
                break;
            case 46:
                {
                alt30=7;
                }
                break;
            case 49:
                {
                alt30=8;
                }
                break;
            case 50:
                {
                alt30=9;
                }
                break;
            case 51:
                {
                alt30=10;
                }
                break;
            case 52:
                {
                alt30=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1129:5: this_Module_0= ruleModule
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getModuleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleModule_in_ruleImplicitContextMapping2287);
                    this_Module_0=ruleModule();

                    state._fsp--;

                     
                            current = this_Module_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1139:5: this_ModuleName_1= ruleModuleName
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getModuleNameParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleModuleName_in_ruleImplicitContextMapping2314);
                    this_ModuleName_1=ruleModuleName();

                    state._fsp--;

                     
                            current = this_ModuleName_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1149:5: this_UsesModule_2= ruleUsesModule
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getUsesModuleParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleUsesModule_in_ruleImplicitContextMapping2341);
                    this_UsesModule_2=ruleUsesModule();

                    state._fsp--;

                     
                            current = this_UsesModule_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1159:5: this_UsesEntity_3= ruleUsesEntity
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getUsesEntityParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleUsesEntity_in_ruleImplicitContextMapping2368);
                    this_UsesEntity_3=ruleUsesEntity();

                    state._fsp--;

                     
                            current = this_UsesEntity_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1169:5: this_Call_4= ruleCall
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getCallParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCall_in_ruleImplicitContextMapping2395);
                    this_Call_4=ruleCall();

                    state._fsp--;

                     
                            current = this_Call_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1179:5: this_Subroutine_5= ruleSubroutine
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getSubroutineParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleSubroutine_in_ruleImplicitContextMapping2422);
                    this_Subroutine_5=ruleSubroutine();

                    state._fsp--;

                     
                            current = this_Subroutine_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1189:5: this_SubroutineName_6= ruleSubroutineName
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getSubroutineNameParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleSubroutineName_in_ruleImplicitContextMapping2449);
                    this_SubroutineName_6=ruleSubroutineName();

                    state._fsp--;

                     
                            current = this_SubroutineName_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1199:5: this_ActualParamByKeyword_7= ruleActualParamByKeyword
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getActualParamByKeywordParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleActualParamByKeyword_in_ruleImplicitContextMapping2476);
                    this_ActualParamByKeyword_7=ruleActualParamByKeyword();

                    state._fsp--;

                     
                            current = this_ActualParamByKeyword_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1209:5: this_VariableDeclaration_8= ruleVariableDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getVariableDeclarationParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleImplicitContextMapping2503);
                    this_VariableDeclaration_8=ruleVariableDeclaration();

                    state._fsp--;

                     
                            current = this_VariableDeclaration_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1218:6: ( () ruleDeclaredEntity )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1218:6: ( () ruleDeclaredEntity )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1218:7: () ruleDeclaredEntity
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1218:7: ()
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1219:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getImplicitContextMappingAccess().getDeclaredEntityAction_9_0(),
                                current);
                        

                    }

                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getDeclaredEntityParserRuleCall_9_1()); 
                        
                    pushFollow(FOLLOW_ruleDeclaredEntity_in_ruleImplicitContextMapping2534);
                    ruleDeclaredEntity();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1234:5: this_FunctionAssignment_11= ruleFunctionAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getFunctionAssignmentParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleFunctionAssignment_in_ruleImplicitContextMapping2562);
                    this_FunctionAssignment_11=ruleFunctionAssignment();

                    state._fsp--;

                     
                            current = this_FunctionAssignment_11; 
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
    // $ANTLR end "ruleImplicitContextMapping"


    // $ANTLR start "entryRuleModule"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1250:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1251:2: (iv_ruleModule= ruleModule EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1252:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule2597);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule2607); 

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1259:1: ruleModule returns [EObject current=null] : ( () otherlv_1= 'module' (otherlv_2= '(' ( (lv_name_3_0= ruleExpr ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1262:28: ( ( () otherlv_1= 'module' (otherlv_2= '(' ( (lv_name_3_0= ruleExpr ) ) otherlv_4= ')' )? ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1263:1: ( () otherlv_1= 'module' (otherlv_2= '(' ( (lv_name_3_0= ruleExpr ) ) otherlv_4= ')' )? )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1263:1: ( () otherlv_1= 'module' (otherlv_2= '(' ( (lv_name_3_0= ruleExpr ) ) otherlv_4= ')' )? )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1263:2: () otherlv_1= 'module' (otherlv_2= '(' ( (lv_name_3_0= ruleExpr ) ) otherlv_4= ')' )?
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1263:2: ()
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1264:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModuleAccess().getModuleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleModule2653); 

                	newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getModuleKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1273:1: (otherlv_2= '(' ( (lv_name_3_0= ruleExpr ) ) otherlv_4= ')' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1273:3: otherlv_2= '(' ( (lv_name_3_0= ruleExpr ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleModule2666); 

                        	newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1277:1: ( (lv_name_3_0= ruleExpr ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1278:1: (lv_name_3_0= ruleExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1278:1: (lv_name_3_0= ruleExpr )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1279:3: lv_name_3_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getNameExprParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleModule2687);
                    lv_name_3_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleModule2699); 

                        	newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleModuleName"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1307:1: entryRuleModuleName returns [EObject current=null] : iv_ruleModuleName= ruleModuleName EOF ;
    public final EObject entryRuleModuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleName = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1308:2: (iv_ruleModuleName= ruleModuleName EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1309:2: iv_ruleModuleName= ruleModuleName EOF
            {
             newCompositeNode(grammarAccess.getModuleNameRule()); 
            pushFollow(FOLLOW_ruleModuleName_in_entryRuleModuleName2737);
            iv_ruleModuleName=ruleModuleName();

            state._fsp--;

             current =iv_ruleModuleName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleName2747); 

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
    // $ANTLR end "entryRuleModuleName"


    // $ANTLR start "ruleModuleName"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1316:1: ruleModuleName returns [EObject current=null] : ( () otherlv_1= 'moduleName' ) ;
    public final EObject ruleModuleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1319:28: ( ( () otherlv_1= 'moduleName' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1320:1: ( () otherlv_1= 'moduleName' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1320:1: ( () otherlv_1= 'moduleName' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1320:2: () otherlv_1= 'moduleName'
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1320:2: ()
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1321:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModuleNameAccess().getModuleNameAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleModuleName2793); 

                	newLeafNode(otherlv_1, grammarAccess.getModuleNameAccess().getModuleNameKeyword_1());
                

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
    // $ANTLR end "ruleModuleName"


    // $ANTLR start "entryRuleUsesModule"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1338:1: entryRuleUsesModule returns [EObject current=null] : iv_ruleUsesModule= ruleUsesModule EOF ;
    public final EObject entryRuleUsesModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsesModule = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1339:2: (iv_ruleUsesModule= ruleUsesModule EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1340:2: iv_ruleUsesModule= ruleUsesModule EOF
            {
             newCompositeNode(grammarAccess.getUsesModuleRule()); 
            pushFollow(FOLLOW_ruleUsesModule_in_entryRuleUsesModule2829);
            iv_ruleUsesModule=ruleUsesModule();

            state._fsp--;

             current =iv_ruleUsesModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsesModule2839); 

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
    // $ANTLR end "entryRuleUsesModule"


    // $ANTLR start "ruleUsesModule"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1347:1: ruleUsesModule returns [EObject current=null] : (otherlv_0= 'usesModule' otherlv_1= '(' ( (lv_name_2_0= ruleExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleUsesModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1350:28: ( (otherlv_0= 'usesModule' otherlv_1= '(' ( (lv_name_2_0= ruleExpr ) ) otherlv_3= ')' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1351:1: (otherlv_0= 'usesModule' otherlv_1= '(' ( (lv_name_2_0= ruleExpr ) ) otherlv_3= ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1351:1: (otherlv_0= 'usesModule' otherlv_1= '(' ( (lv_name_2_0= ruleExpr ) ) otherlv_3= ')' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1351:3: otherlv_0= 'usesModule' otherlv_1= '(' ( (lv_name_2_0= ruleExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleUsesModule2876); 

                	newLeafNode(otherlv_0, grammarAccess.getUsesModuleAccess().getUsesModuleKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleUsesModule2888); 

                	newLeafNode(otherlv_1, grammarAccess.getUsesModuleAccess().getLeftParenthesisKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1359:1: ( (lv_name_2_0= ruleExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1360:1: (lv_name_2_0= ruleExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1360:1: (lv_name_2_0= ruleExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1361:3: lv_name_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getUsesModuleAccess().getNameExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleUsesModule2909);
            lv_name_2_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUsesModuleRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleUsesModule2921); 

                	newLeafNode(otherlv_3, grammarAccess.getUsesModuleAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleUsesModule"


    // $ANTLR start "entryRuleUsesEntity"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1389:1: entryRuleUsesEntity returns [EObject current=null] : iv_ruleUsesEntity= ruleUsesEntity EOF ;
    public final EObject entryRuleUsesEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsesEntity = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1390:2: (iv_ruleUsesEntity= ruleUsesEntity EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1391:2: iv_ruleUsesEntity= ruleUsesEntity EOF
            {
             newCompositeNode(grammarAccess.getUsesEntityRule()); 
            pushFollow(FOLLOW_ruleUsesEntity_in_entryRuleUsesEntity2957);
            iv_ruleUsesEntity=ruleUsesEntity();

            state._fsp--;

             current =iv_ruleUsesEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsesEntity2967); 

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
    // $ANTLR end "entryRuleUsesEntity"


    // $ANTLR start "ruleUsesEntity"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1398:1: ruleUsesEntity returns [EObject current=null] : (otherlv_0= 'usesEntity' otherlv_1= '(' ( (lv_name_2_0= ruleExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleUsesEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1401:28: ( (otherlv_0= 'usesEntity' otherlv_1= '(' ( (lv_name_2_0= ruleExpr ) ) otherlv_3= ')' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1402:1: (otherlv_0= 'usesEntity' otherlv_1= '(' ( (lv_name_2_0= ruleExpr ) ) otherlv_3= ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1402:1: (otherlv_0= 'usesEntity' otherlv_1= '(' ( (lv_name_2_0= ruleExpr ) ) otherlv_3= ')' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1402:3: otherlv_0= 'usesEntity' otherlv_1= '(' ( (lv_name_2_0= ruleExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleUsesEntity3004); 

                	newLeafNode(otherlv_0, grammarAccess.getUsesEntityAccess().getUsesEntityKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleUsesEntity3016); 

                	newLeafNode(otherlv_1, grammarAccess.getUsesEntityAccess().getLeftParenthesisKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1410:1: ( (lv_name_2_0= ruleExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1411:1: (lv_name_2_0= ruleExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1411:1: (lv_name_2_0= ruleExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1412:3: lv_name_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getUsesEntityAccess().getNameExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleUsesEntity3037);
            lv_name_2_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUsesEntityRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleUsesEntity3049); 

                	newLeafNode(otherlv_3, grammarAccess.getUsesEntityAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleUsesEntity"


    // $ANTLR start "entryRuleSubroutine"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1440:1: entryRuleSubroutine returns [EObject current=null] : iv_ruleSubroutine= ruleSubroutine EOF ;
    public final EObject entryRuleSubroutine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubroutine = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1441:2: (iv_ruleSubroutine= ruleSubroutine EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1442:2: iv_ruleSubroutine= ruleSubroutine EOF
            {
             newCompositeNode(grammarAccess.getSubroutineRule()); 
            pushFollow(FOLLOW_ruleSubroutine_in_entryRuleSubroutine3085);
            iv_ruleSubroutine=ruleSubroutine();

            state._fsp--;

             current =iv_ruleSubroutine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubroutine3095); 

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
    // $ANTLR end "entryRuleSubroutine"


    // $ANTLR start "ruleSubroutine"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1449:1: ruleSubroutine returns [EObject current=null] : (otherlv_0= 'subroutine' otherlv_1= '(' ( (lv_name_2_0= ruleExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' ) ;
    public final EObject ruleSubroutine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_name_2_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_params_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1452:28: ( (otherlv_0= 'subroutine' otherlv_1= '(' ( (lv_name_2_0= ruleExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1453:1: (otherlv_0= 'subroutine' otherlv_1= '(' ( (lv_name_2_0= ruleExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1453:1: (otherlv_0= 'subroutine' otherlv_1= '(' ( (lv_name_2_0= ruleExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1453:3: otherlv_0= 'subroutine' otherlv_1= '(' ( (lv_name_2_0= ruleExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleSubroutine3132); 

                	newLeafNode(otherlv_0, grammarAccess.getSubroutineAccess().getSubroutineKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleSubroutine3144); 

                	newLeafNode(otherlv_1, grammarAccess.getSubroutineAccess().getLeftParenthesisKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1461:1: ( (lv_name_2_0= ruleExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1462:1: (lv_name_2_0= ruleExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1462:1: (lv_name_2_0= ruleExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1463:3: lv_name_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getSubroutineAccess().getNameExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleSubroutine3165);
            lv_name_2_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubroutineRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1479:2: (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==27) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1479:4: otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleSubroutine3178); 

                        	newLeafNode(otherlv_3, grammarAccess.getSubroutineAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1483:1: ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=36 && LA33_0<=43)||LA33_0==45) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1483:2: ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )*
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1483:2: ( (lv_params_4_0= ruleFormalParam ) )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1484:1: (lv_params_4_0= ruleFormalParam )
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1484:1: (lv_params_4_0= ruleFormalParam )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1485:3: lv_params_4_0= ruleFormalParam
                            {
                             
                            	        newCompositeNode(grammarAccess.getSubroutineAccess().getParamsFormalParamParserRuleCall_3_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFormalParam_in_ruleSubroutine3200);
                            lv_params_4_0=ruleFormalParam();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSubroutineRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"params",
                                    		lv_params_4_0, 
                                    		"FormalParam");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1501:2: (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )*
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0==35) ) {
                                    alt32=1;
                                }


                                switch (alt32) {
                            	case 1 :
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1501:4: otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) )
                            	    {
                            	    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleSubroutine3213); 

                            	        	newLeafNode(otherlv_5, grammarAccess.getSubroutineAccess().getCommaKeyword_3_1_1_0());
                            	        
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1505:1: ( (lv_params_6_0= ruleFormalParam ) )
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1506:1: (lv_params_6_0= ruleFormalParam )
                            	    {
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1506:1: (lv_params_6_0= ruleFormalParam )
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1507:3: lv_params_6_0= ruleFormalParam
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getSubroutineAccess().getParamsFormalParamParserRuleCall_3_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleFormalParam_in_ruleSubroutine3234);
                            	    lv_params_6_0=ruleFormalParam();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getSubroutineRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"params",
                            	            		lv_params_6_0, 
                            	            		"FormalParam");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop32;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleSubroutine3250); 

                        	newLeafNode(otherlv_7, grammarAccess.getSubroutineAccess().getRightParenthesisKeyword_3_2());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleSubroutine3264); 

                	newLeafNode(otherlv_8, grammarAccess.getSubroutineAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleSubroutine"


    // $ANTLR start "entryRuleFormalParam"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1539:1: entryRuleFormalParam returns [EObject current=null] : iv_ruleFormalParam= ruleFormalParam EOF ;
    public final EObject entryRuleFormalParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalParam = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1540:2: (iv_ruleFormalParam= ruleFormalParam EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1541:2: iv_ruleFormalParam= ruleFormalParam EOF
            {
             newCompositeNode(grammarAccess.getFormalParamRule()); 
            pushFollow(FOLLOW_ruleFormalParam_in_entryRuleFormalParam3300);
            iv_ruleFormalParam=ruleFormalParam();

            state._fsp--;

             current =iv_ruleFormalParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalParam3310); 

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
    // $ANTLR end "entryRuleFormalParam"


    // $ANTLR start "ruleFormalParam"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1548:1: ruleFormalParam returns [EObject current=null] : ( ( (lv_intent_0_0= ruleIntent ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleExpr ) ) ) ;
    public final EObject ruleFormalParam() throws RecognitionException {
        EObject current = null;

        EObject lv_intent_0_0 = null;

        EObject lv_type_1_0 = null;

        EObject lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1551:28: ( ( ( (lv_intent_0_0= ruleIntent ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleExpr ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1552:1: ( ( (lv_intent_0_0= ruleIntent ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleExpr ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1552:1: ( ( (lv_intent_0_0= ruleIntent ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleExpr ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1552:2: ( (lv_intent_0_0= ruleIntent ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleExpr ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1552:2: ( (lv_intent_0_0= ruleIntent ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=36 && LA35_0<=38)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1553:1: (lv_intent_0_0= ruleIntent )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1553:1: (lv_intent_0_0= ruleIntent )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1554:3: lv_intent_0_0= ruleIntent
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormalParamAccess().getIntentIntentParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIntent_in_ruleFormalParam3356);
                    lv_intent_0_0=ruleIntent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormalParamRule());
                    	        }
                           		set(
                           			current, 
                           			"intent",
                            		lv_intent_0_0, 
                            		"Intent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1570:3: ( (lv_type_1_0= ruleType ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1571:1: (lv_type_1_0= ruleType )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1571:1: (lv_type_1_0= ruleType )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1572:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getFormalParamAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleFormalParam3378);
            lv_type_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormalParamRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1588:2: ( (lv_name_2_0= ruleExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1589:1: (lv_name_2_0= ruleExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1589:1: (lv_name_2_0= ruleExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1590:3: lv_name_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getFormalParamAccess().getNameExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleFormalParam3399);
            lv_name_2_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormalParamRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"Expr");
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
    // $ANTLR end "ruleFormalParam"


    // $ANTLR start "entryRuleIntent"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1614:1: entryRuleIntent returns [EObject current=null] : iv_ruleIntent= ruleIntent EOF ;
    public final EObject entryRuleIntent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntent = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1615:2: (iv_ruleIntent= ruleIntent EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1616:2: iv_ruleIntent= ruleIntent EOF
            {
             newCompositeNode(grammarAccess.getIntentRule()); 
            pushFollow(FOLLOW_ruleIntent_in_entryRuleIntent3435);
            iv_ruleIntent=ruleIntent();

            state._fsp--;

             current =iv_ruleIntent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntent3445); 

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
    // $ANTLR end "entryRuleIntent"


    // $ANTLR start "ruleIntent"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1623:1: ruleIntent returns [EObject current=null] : ( ( (lv_in_0_0= 'in' ) ) | ( (lv_out_1_0= 'out' ) ) | ( (lv_inout_2_0= 'inout' ) ) ) ;
    public final EObject ruleIntent() throws RecognitionException {
        EObject current = null;

        Token lv_in_0_0=null;
        Token lv_out_1_0=null;
        Token lv_inout_2_0=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1626:28: ( ( ( (lv_in_0_0= 'in' ) ) | ( (lv_out_1_0= 'out' ) ) | ( (lv_inout_2_0= 'inout' ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1627:1: ( ( (lv_in_0_0= 'in' ) ) | ( (lv_out_1_0= 'out' ) ) | ( (lv_inout_2_0= 'inout' ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1627:1: ( ( (lv_in_0_0= 'in' ) ) | ( (lv_out_1_0= 'out' ) ) | ( (lv_inout_2_0= 'inout' ) ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt36=1;
                }
                break;
            case 37:
                {
                alt36=2;
                }
                break;
            case 38:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1627:2: ( (lv_in_0_0= 'in' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1627:2: ( (lv_in_0_0= 'in' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1628:1: (lv_in_0_0= 'in' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1628:1: (lv_in_0_0= 'in' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1629:3: lv_in_0_0= 'in'
                    {
                    lv_in_0_0=(Token)match(input,36,FOLLOW_36_in_ruleIntent3488); 

                            newLeafNode(lv_in_0_0, grammarAccess.getIntentAccess().getInInKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntentRule());
                    	        }
                           		setWithLastConsumed(current, "in", true, "in");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1643:6: ( (lv_out_1_0= 'out' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1643:6: ( (lv_out_1_0= 'out' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1644:1: (lv_out_1_0= 'out' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1644:1: (lv_out_1_0= 'out' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1645:3: lv_out_1_0= 'out'
                    {
                    lv_out_1_0=(Token)match(input,37,FOLLOW_37_in_ruleIntent3525); 

                            newLeafNode(lv_out_1_0, grammarAccess.getIntentAccess().getOutOutKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntentRule());
                    	        }
                           		setWithLastConsumed(current, "out", true, "out");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1659:6: ( (lv_inout_2_0= 'inout' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1659:6: ( (lv_inout_2_0= 'inout' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1660:1: (lv_inout_2_0= 'inout' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1660:1: (lv_inout_2_0= 'inout' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1661:3: lv_inout_2_0= 'inout'
                    {
                    lv_inout_2_0=(Token)match(input,38,FOLLOW_38_in_ruleIntent3562); 

                            newLeafNode(lv_inout_2_0, grammarAccess.getIntentAccess().getInoutInoutKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntentRule());
                    	        }
                           		setWithLastConsumed(current, "inout", true, "inout");
                    	    

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
    // $ANTLR end "ruleIntent"


    // $ANTLR start "entryRuleType"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1682:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1683:2: (iv_ruleType= ruleType EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1684:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType3611);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType3621); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1691:1: ruleType returns [EObject current=null] : ( ( (lv_integer_0_0= 'integer' ) ) | ( (lv_character_1_0= 'character' ) ) | ( (lv_logical_2_0= 'logical' ) ) | ( (lv_real_3_0= 'real' ) ) | ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? ) | ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleExpr ) ) otherlv_9= ')' ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_character_1_0=null;
        Token lv_logical_2_0=null;
        Token lv_real_3_0=null;
        Token lv_double_4_0=null;
        Token otherlv_5=null;
        Token lv_derived_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_derivedType_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1694:28: ( ( ( (lv_integer_0_0= 'integer' ) ) | ( (lv_character_1_0= 'character' ) ) | ( (lv_logical_2_0= 'logical' ) ) | ( (lv_real_3_0= 'real' ) ) | ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? ) | ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleExpr ) ) otherlv_9= ')' ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1695:1: ( ( (lv_integer_0_0= 'integer' ) ) | ( (lv_character_1_0= 'character' ) ) | ( (lv_logical_2_0= 'logical' ) ) | ( (lv_real_3_0= 'real' ) ) | ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? ) | ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleExpr ) ) otherlv_9= ')' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1695:1: ( ( (lv_integer_0_0= 'integer' ) ) | ( (lv_character_1_0= 'character' ) ) | ( (lv_logical_2_0= 'logical' ) ) | ( (lv_real_3_0= 'real' ) ) | ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? ) | ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleExpr ) ) otherlv_9= ')' ) )
            int alt38=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt38=1;
                }
                break;
            case 40:
                {
                alt38=2;
                }
                break;
            case 41:
                {
                alt38=3;
                }
                break;
            case 42:
                {
                alt38=4;
                }
                break;
            case 43:
                {
                alt38=5;
                }
                break;
            case 45:
                {
                alt38=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1695:2: ( (lv_integer_0_0= 'integer' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1695:2: ( (lv_integer_0_0= 'integer' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1696:1: (lv_integer_0_0= 'integer' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1696:1: (lv_integer_0_0= 'integer' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1697:3: lv_integer_0_0= 'integer'
                    {
                    lv_integer_0_0=(Token)match(input,39,FOLLOW_39_in_ruleType3664); 

                            newLeafNode(lv_integer_0_0, grammarAccess.getTypeAccess().getIntegerIntegerKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "integer", true, "integer");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1711:6: ( (lv_character_1_0= 'character' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1711:6: ( (lv_character_1_0= 'character' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1712:1: (lv_character_1_0= 'character' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1712:1: (lv_character_1_0= 'character' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1713:3: lv_character_1_0= 'character'
                    {
                    lv_character_1_0=(Token)match(input,40,FOLLOW_40_in_ruleType3701); 

                            newLeafNode(lv_character_1_0, grammarAccess.getTypeAccess().getCharacterCharacterKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "character", true, "character");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1727:6: ( (lv_logical_2_0= 'logical' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1727:6: ( (lv_logical_2_0= 'logical' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1728:1: (lv_logical_2_0= 'logical' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1728:1: (lv_logical_2_0= 'logical' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1729:3: lv_logical_2_0= 'logical'
                    {
                    lv_logical_2_0=(Token)match(input,41,FOLLOW_41_in_ruleType3738); 

                            newLeafNode(lv_logical_2_0, grammarAccess.getTypeAccess().getLogicalLogicalKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "logical", true, "logical");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1743:6: ( (lv_real_3_0= 'real' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1743:6: ( (lv_real_3_0= 'real' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1744:1: (lv_real_3_0= 'real' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1744:1: (lv_real_3_0= 'real' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1745:3: lv_real_3_0= 'real'
                    {
                    lv_real_3_0=(Token)match(input,42,FOLLOW_42_in_ruleType3775); 

                            newLeafNode(lv_real_3_0, grammarAccess.getTypeAccess().getRealRealKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "real", true, "real");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1759:6: ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1759:6: ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1759:7: ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )?
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1759:7: ( (lv_double_4_0= 'double' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1760:1: (lv_double_4_0= 'double' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1760:1: (lv_double_4_0= 'double' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1761:3: lv_double_4_0= 'double'
                    {
                    lv_double_4_0=(Token)match(input,43,FOLLOW_43_in_ruleType3813); 

                            newLeafNode(lv_double_4_0, grammarAccess.getTypeAccess().getDoubleDoubleKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "double", true, "double");
                    	    

                    }


                    }

                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1774:2: (otherlv_5= 'precision' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==44) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1774:4: otherlv_5= 'precision'
                            {
                            otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleType3839); 

                                	newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getPrecisionKeyword_4_1());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1779:6: ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleExpr ) ) otherlv_9= ')' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1779:6: ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleExpr ) ) otherlv_9= ')' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1779:7: ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleExpr ) ) otherlv_9= ')'
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1779:7: ( (lv_derived_6_0= 'type' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1780:1: (lv_derived_6_0= 'type' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1780:1: (lv_derived_6_0= 'type' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1781:3: lv_derived_6_0= 'type'
                    {
                    lv_derived_6_0=(Token)match(input,45,FOLLOW_45_in_ruleType3867); 

                            newLeafNode(lv_derived_6_0, grammarAccess.getTypeAccess().getDerivedTypeKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "derived", true, "type");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleType3892); 

                        	newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1798:1: ( (lv_derivedType_8_0= ruleExpr ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1799:1: (lv_derivedType_8_0= ruleExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1799:1: (lv_derivedType_8_0= ruleExpr )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1800:3: lv_derivedType_8_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getDerivedTypeExprParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleType3913);
                    lv_derivedType_8_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"derivedType",
                            		lv_derivedType_8_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleType3925); 

                        	newLeafNode(otherlv_9, grammarAccess.getTypeAccess().getRightParenthesisKeyword_5_3());
                        

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSubroutineName"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1828:1: entryRuleSubroutineName returns [EObject current=null] : iv_ruleSubroutineName= ruleSubroutineName EOF ;
    public final EObject entryRuleSubroutineName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubroutineName = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1829:2: (iv_ruleSubroutineName= ruleSubroutineName EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1830:2: iv_ruleSubroutineName= ruleSubroutineName EOF
            {
             newCompositeNode(grammarAccess.getSubroutineNameRule()); 
            pushFollow(FOLLOW_ruleSubroutineName_in_entryRuleSubroutineName3962);
            iv_ruleSubroutineName=ruleSubroutineName();

            state._fsp--;

             current =iv_ruleSubroutineName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubroutineName3972); 

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
    // $ANTLR end "entryRuleSubroutineName"


    // $ANTLR start "ruleSubroutineName"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1837:1: ruleSubroutineName returns [EObject current=null] : (otherlv_0= 'subroutineName' () (otherlv_2= '(' ( (lv_name_3_0= ruleExpr ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleSubroutineName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1840:28: ( (otherlv_0= 'subroutineName' () (otherlv_2= '(' ( (lv_name_3_0= ruleExpr ) ) otherlv_4= ')' )? ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1841:1: (otherlv_0= 'subroutineName' () (otherlv_2= '(' ( (lv_name_3_0= ruleExpr ) ) otherlv_4= ')' )? )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1841:1: (otherlv_0= 'subroutineName' () (otherlv_2= '(' ( (lv_name_3_0= ruleExpr ) ) otherlv_4= ')' )? )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1841:3: otherlv_0= 'subroutineName' () (otherlv_2= '(' ( (lv_name_3_0= ruleExpr ) ) otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleSubroutineName4009); 

                	newLeafNode(otherlv_0, grammarAccess.getSubroutineNameAccess().getSubroutineNameKeyword_0());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1845:1: ()
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1846:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSubroutineNameAccess().getSubroutineNameAction_1(),
                        current);
                

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1851:2: (otherlv_2= '(' ( (lv_name_3_0= ruleExpr ) ) otherlv_4= ')' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==27) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1851:4: otherlv_2= '(' ( (lv_name_3_0= ruleExpr ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleSubroutineName4031); 

                        	newLeafNode(otherlv_2, grammarAccess.getSubroutineNameAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1855:1: ( (lv_name_3_0= ruleExpr ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1856:1: (lv_name_3_0= ruleExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1856:1: (lv_name_3_0= ruleExpr )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1857:3: lv_name_3_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubroutineNameAccess().getNameExprParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleSubroutineName4052);
                    lv_name_3_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubroutineNameRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleSubroutineName4064); 

                        	newLeafNode(otherlv_4, grammarAccess.getSubroutineNameAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

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
    // $ANTLR end "ruleSubroutineName"


    // $ANTLR start "entryRuleCall"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1885:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1886:2: (iv_ruleCall= ruleCall EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1887:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall4102);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall4112); 

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
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1894:1: ruleCall returns [EObject current=null] : (otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_subroutineName_2_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_params_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1897:28: ( (otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1898:1: (otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1898:1: (otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1898:3: otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleCall4149); 

                	newLeafNode(otherlv_0, grammarAccess.getCallAccess().getCallKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleCall4161); 

                	newLeafNode(otherlv_1, grammarAccess.getCallAccess().getLeftParenthesisKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1906:1: ( (lv_subroutineName_2_0= ruleExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1907:1: (lv_subroutineName_2_0= ruleExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1907:1: (lv_subroutineName_2_0= ruleExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1908:3: lv_subroutineName_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getCallAccess().getSubroutineNameExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleCall4182);
            lv_subroutineName_2_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCallRule());
            	        }
                   		set(
                   			current, 
                   			"subroutineName",
                    		lv_subroutineName_2_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1924:2: (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==27) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1924:4: otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleCall4195); 

                        	newLeafNode(otherlv_3, grammarAccess.getCallAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1928:1: ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_STRING)||LA41_0==RULE_INT||LA41_0==24||LA41_0==53) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1928:2: ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )*
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1928:2: ( (lv_params_4_0= ruleActualParam ) )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1929:1: (lv_params_4_0= ruleActualParam )
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1929:1: (lv_params_4_0= ruleActualParam )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1930:3: lv_params_4_0= ruleActualParam
                            {
                             
                            	        newCompositeNode(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleActualParam_in_ruleCall4217);
                            lv_params_4_0=ruleActualParam();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getCallRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"params",
                                    		lv_params_4_0, 
                                    		"ActualParam");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1946:2: (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==35) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1946:4: otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) )
                            	    {
                            	    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleCall4230); 

                            	        	newLeafNode(otherlv_5, grammarAccess.getCallAccess().getCommaKeyword_3_1_1_0());
                            	        
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1950:1: ( (lv_params_6_0= ruleActualParam ) )
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1951:1: (lv_params_6_0= ruleActualParam )
                            	    {
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1951:1: (lv_params_6_0= ruleActualParam )
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1952:3: lv_params_6_0= ruleActualParam
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleActualParam_in_ruleCall4251);
                            	    lv_params_6_0=ruleActualParam();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getCallRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"params",
                            	            		lv_params_6_0, 
                            	            		"ActualParam");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop40;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleCall4267); 

                        	newLeafNode(otherlv_7, grammarAccess.getCallAccess().getRightParenthesisKeyword_3_2());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleCall4281); 

                	newLeafNode(otherlv_8, grammarAccess.getCallAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleActualParam"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1984:1: entryRuleActualParam returns [EObject current=null] : iv_ruleActualParam= ruleActualParam EOF ;
    public final EObject entryRuleActualParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActualParam = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1985:2: (iv_ruleActualParam= ruleActualParam EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1986:2: iv_ruleActualParam= ruleActualParam EOF
            {
             newCompositeNode(grammarAccess.getActualParamRule()); 
            pushFollow(FOLLOW_ruleActualParam_in_entryRuleActualParam4317);
            iv_ruleActualParam=ruleActualParam();

            state._fsp--;

             current =iv_ruleActualParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActualParam4327); 

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
    // $ANTLR end "entryRuleActualParam"


    // $ANTLR start "ruleActualParam"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1993:1: ruleActualParam returns [EObject current=null] : ( ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleExpr ) ) ) ;
    public final EObject ruleActualParam() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token lv_optional_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1996:28: ( ( ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleExpr ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1997:1: ( ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleExpr ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1997:1: ( ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleExpr ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1997:2: ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleExpr ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1997:2: ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==15||LA44_1==48) ) {
                    alt44=1;
                }
            }
            switch (alt44) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1997:3: ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '='
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1997:3: ( (lv_keyword_0_0= RULE_ID ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1998:1: (lv_keyword_0_0= RULE_ID )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1998:1: (lv_keyword_0_0= RULE_ID )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1999:3: lv_keyword_0_0= RULE_ID
                    {
                    lv_keyword_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActualParam4370); 

                    			newLeafNode(lv_keyword_0_0, grammarAccess.getActualParamAccess().getKeywordIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActualParamRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"keyword",
                            		lv_keyword_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2015:2: ( (lv_optional_1_0= '?' ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==48) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2016:1: (lv_optional_1_0= '?' )
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2016:1: (lv_optional_1_0= '?' )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2017:3: lv_optional_1_0= '?'
                            {
                            lv_optional_1_0=(Token)match(input,48,FOLLOW_48_in_ruleActualParam4393); 

                                    newLeafNode(lv_optional_1_0, grammarAccess.getActualParamAccess().getOptionalQuestionMarkKeyword_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getActualParamRule());
                            	        }
                                   		setWithLastConsumed(current, "optional", true, "?");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleActualParam4419); 

                        	newLeafNode(otherlv_2, grammarAccess.getActualParamAccess().getEqualsSignKeyword_0_2());
                        

                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2034:3: ( (lv_value_3_0= ruleExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2035:1: (lv_value_3_0= ruleExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2035:1: (lv_value_3_0= ruleExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2036:3: lv_value_3_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getActualParamAccess().getValueExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleActualParam4442);
            lv_value_3_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActualParamRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"Expr");
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
    // $ANTLR end "ruleActualParam"


    // $ANTLR start "entryRuleActualParamByKeyword"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2060:1: entryRuleActualParamByKeyword returns [EObject current=null] : iv_ruleActualParamByKeyword= ruleActualParamByKeyword EOF ;
    public final EObject entryRuleActualParamByKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActualParamByKeyword = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2061:2: (iv_ruleActualParamByKeyword= ruleActualParamByKeyword EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2062:2: iv_ruleActualParamByKeyword= ruleActualParamByKeyword EOF
            {
             newCompositeNode(grammarAccess.getActualParamByKeywordRule()); 
            pushFollow(FOLLOW_ruleActualParamByKeyword_in_entryRuleActualParamByKeyword4478);
            iv_ruleActualParamByKeyword=ruleActualParamByKeyword();

            state._fsp--;

             current =iv_ruleActualParamByKeyword; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActualParamByKeyword4488); 

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
    // $ANTLR end "entryRuleActualParamByKeyword"


    // $ANTLR start "ruleActualParamByKeyword"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2069:1: ruleActualParamByKeyword returns [EObject current=null] : (otherlv_0= 'actualParamByKeyword' otherlv_1= '(' ( (lv_keyword_2_0= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleActualParamByKeyword() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_keyword_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2072:28: ( (otherlv_0= 'actualParamByKeyword' otherlv_1= '(' ( (lv_keyword_2_0= RULE_ID ) ) otherlv_3= ')' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2073:1: (otherlv_0= 'actualParamByKeyword' otherlv_1= '(' ( (lv_keyword_2_0= RULE_ID ) ) otherlv_3= ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2073:1: (otherlv_0= 'actualParamByKeyword' otherlv_1= '(' ( (lv_keyword_2_0= RULE_ID ) ) otherlv_3= ')' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2073:3: otherlv_0= 'actualParamByKeyword' otherlv_1= '(' ( (lv_keyword_2_0= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleActualParamByKeyword4525); 

                	newLeafNode(otherlv_0, grammarAccess.getActualParamByKeywordAccess().getActualParamByKeywordKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleActualParamByKeyword4537); 

                	newLeafNode(otherlv_1, grammarAccess.getActualParamByKeywordAccess().getLeftParenthesisKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2081:1: ( (lv_keyword_2_0= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2082:1: (lv_keyword_2_0= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2082:1: (lv_keyword_2_0= RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2083:3: lv_keyword_2_0= RULE_ID
            {
            lv_keyword_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActualParamByKeyword4554); 

            			newLeafNode(lv_keyword_2_0, grammarAccess.getActualParamByKeywordAccess().getKeywordIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActualParamByKeywordRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"keyword",
                    		lv_keyword_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleActualParamByKeyword4571); 

                	newLeafNode(otherlv_3, grammarAccess.getActualParamByKeywordAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleActualParamByKeyword"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2111:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2112:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2113:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4607);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration4617); 

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2120:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= 'declaration' otherlv_1= '(' ( (lv_type_2_0= ruleType ) ) otherlv_3= ')' ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2123:28: ( (otherlv_0= 'declaration' otherlv_1= '(' ( (lv_type_2_0= ruleType ) ) otherlv_3= ')' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2124:1: (otherlv_0= 'declaration' otherlv_1= '(' ( (lv_type_2_0= ruleType ) ) otherlv_3= ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2124:1: (otherlv_0= 'declaration' otherlv_1= '(' ( (lv_type_2_0= ruleType ) ) otherlv_3= ')' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2124:3: otherlv_0= 'declaration' otherlv_1= '(' ( (lv_type_2_0= ruleType ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleVariableDeclaration4654); 

                	newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getDeclarationKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleVariableDeclaration4666); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationAccess().getLeftParenthesisKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2132:1: ( (lv_type_2_0= ruleType ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2133:1: (lv_type_2_0= ruleType )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2133:1: (lv_type_2_0= ruleType )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2134:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVariableDeclaration4687);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleVariableDeclaration4699); 

                	newLeafNode(otherlv_3, grammarAccess.getVariableDeclarationAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleDeclaredEntity"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2162:1: entryRuleDeclaredEntity returns [String current=null] : iv_ruleDeclaredEntity= ruleDeclaredEntity EOF ;
    public final String entryRuleDeclaredEntity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclaredEntity = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2163:2: (iv_ruleDeclaredEntity= ruleDeclaredEntity EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2164:2: iv_ruleDeclaredEntity= ruleDeclaredEntity EOF
            {
             newCompositeNode(grammarAccess.getDeclaredEntityRule()); 
            pushFollow(FOLLOW_ruleDeclaredEntity_in_entryRuleDeclaredEntity4736);
            iv_ruleDeclaredEntity=ruleDeclaredEntity();

            state._fsp--;

             current =iv_ruleDeclaredEntity.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaredEntity4747); 

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
    // $ANTLR end "entryRuleDeclaredEntity"


    // $ANTLR start "ruleDeclaredEntity"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2171:1: ruleDeclaredEntity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'declaredEntity' ;
    public final AntlrDatatypeRuleToken ruleDeclaredEntity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2174:28: (kw= 'declaredEntity' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2176:2: kw= 'declaredEntity'
            {
            kw=(Token)match(input,51,FOLLOW_51_in_ruleDeclaredEntity4784); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDeclaredEntityAccess().getDeclaredEntityKeyword()); 
                

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
    // $ANTLR end "ruleDeclaredEntity"


    // $ANTLR start "entryRuleFunctionAssignment"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2189:1: entryRuleFunctionAssignment returns [EObject current=null] : iv_ruleFunctionAssignment= ruleFunctionAssignment EOF ;
    public final EObject entryRuleFunctionAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionAssignment = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2190:2: (iv_ruleFunctionAssignment= ruleFunctionAssignment EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2191:2: iv_ruleFunctionAssignment= ruleFunctionAssignment EOF
            {
             newCompositeNode(grammarAccess.getFunctionAssignmentRule()); 
            pushFollow(FOLLOW_ruleFunctionAssignment_in_entryRuleFunctionAssignment4823);
            iv_ruleFunctionAssignment=ruleFunctionAssignment();

            state._fsp--;

             current =iv_ruleFunctionAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionAssignment4833); 

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
    // $ANTLR end "entryRuleFunctionAssignment"


    // $ANTLR start "ruleFunctionAssignment"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2198:1: ruleFunctionAssignment returns [EObject current=null] : (otherlv_0= 'functionAssignment' otherlv_1= '(' ( (lv_lhs_2_0= ruleExpr ) ) otherlv_3= ',' ( (lv_functionName_4_0= ruleExpr ) ) (otherlv_5= '(' ( ( (lv_params_6_0= ruleActualParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleActualParam ) ) )* )? otherlv_9= ')' )? otherlv_10= ')' ) ;
    public final EObject ruleFunctionAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_lhs_2_0 = null;

        EObject lv_functionName_4_0 = null;

        EObject lv_params_6_0 = null;

        EObject lv_params_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2201:28: ( (otherlv_0= 'functionAssignment' otherlv_1= '(' ( (lv_lhs_2_0= ruleExpr ) ) otherlv_3= ',' ( (lv_functionName_4_0= ruleExpr ) ) (otherlv_5= '(' ( ( (lv_params_6_0= ruleActualParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleActualParam ) ) )* )? otherlv_9= ')' )? otherlv_10= ')' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2202:1: (otherlv_0= 'functionAssignment' otherlv_1= '(' ( (lv_lhs_2_0= ruleExpr ) ) otherlv_3= ',' ( (lv_functionName_4_0= ruleExpr ) ) (otherlv_5= '(' ( ( (lv_params_6_0= ruleActualParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleActualParam ) ) )* )? otherlv_9= ')' )? otherlv_10= ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2202:1: (otherlv_0= 'functionAssignment' otherlv_1= '(' ( (lv_lhs_2_0= ruleExpr ) ) otherlv_3= ',' ( (lv_functionName_4_0= ruleExpr ) ) (otherlv_5= '(' ( ( (lv_params_6_0= ruleActualParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleActualParam ) ) )* )? otherlv_9= ')' )? otherlv_10= ')' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2202:3: otherlv_0= 'functionAssignment' otherlv_1= '(' ( (lv_lhs_2_0= ruleExpr ) ) otherlv_3= ',' ( (lv_functionName_4_0= ruleExpr ) ) (otherlv_5= '(' ( ( (lv_params_6_0= ruleActualParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleActualParam ) ) )* )? otherlv_9= ')' )? otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleFunctionAssignment4870); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionAssignmentAccess().getFunctionAssignmentKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleFunctionAssignment4882); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionAssignmentAccess().getLeftParenthesisKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2210:1: ( (lv_lhs_2_0= ruleExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2211:1: (lv_lhs_2_0= ruleExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2211:1: (lv_lhs_2_0= ruleExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2212:3: lv_lhs_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getFunctionAssignmentAccess().getLhsExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleFunctionAssignment4903);
            lv_lhs_2_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"lhs",
                    		lv_lhs_2_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleFunctionAssignment4915); 

                	newLeafNode(otherlv_3, grammarAccess.getFunctionAssignmentAccess().getCommaKeyword_3());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2232:1: ( (lv_functionName_4_0= ruleExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2233:1: (lv_functionName_4_0= ruleExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2233:1: (lv_functionName_4_0= ruleExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2234:3: lv_functionName_4_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getFunctionAssignmentAccess().getFunctionNameExprParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleFunctionAssignment4936);
            lv_functionName_4_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"functionName",
                    		lv_functionName_4_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2250:2: (otherlv_5= '(' ( ( (lv_params_6_0= ruleActualParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleActualParam ) ) )* )? otherlv_9= ')' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==27) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2250:4: otherlv_5= '(' ( ( (lv_params_6_0= ruleActualParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleActualParam ) ) )* )? otherlv_9= ')'
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleFunctionAssignment4949); 

                        	newLeafNode(otherlv_5, grammarAccess.getFunctionAssignmentAccess().getLeftParenthesisKeyword_5_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2254:1: ( ( (lv_params_6_0= ruleActualParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleActualParam ) ) )* )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_STRING)||LA46_0==RULE_INT||LA46_0==24||LA46_0==53) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2254:2: ( (lv_params_6_0= ruleActualParam ) ) (otherlv_7= ',' ( (lv_params_8_0= ruleActualParam ) ) )*
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2254:2: ( (lv_params_6_0= ruleActualParam ) )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2255:1: (lv_params_6_0= ruleActualParam )
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2255:1: (lv_params_6_0= ruleActualParam )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2256:3: lv_params_6_0= ruleActualParam
                            {
                             
                            	        newCompositeNode(grammarAccess.getFunctionAssignmentAccess().getParamsActualParamParserRuleCall_5_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleActualParam_in_ruleFunctionAssignment4971);
                            lv_params_6_0=ruleActualParam();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFunctionAssignmentRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"params",
                                    		lv_params_6_0, 
                                    		"ActualParam");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2272:2: (otherlv_7= ',' ( (lv_params_8_0= ruleActualParam ) ) )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==35) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2272:4: otherlv_7= ',' ( (lv_params_8_0= ruleActualParam ) )
                            	    {
                            	    otherlv_7=(Token)match(input,35,FOLLOW_35_in_ruleFunctionAssignment4984); 

                            	        	newLeafNode(otherlv_7, grammarAccess.getFunctionAssignmentAccess().getCommaKeyword_5_1_1_0());
                            	        
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2276:1: ( (lv_params_8_0= ruleActualParam ) )
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2277:1: (lv_params_8_0= ruleActualParam )
                            	    {
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2277:1: (lv_params_8_0= ruleActualParam )
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2278:3: lv_params_8_0= ruleActualParam
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFunctionAssignmentAccess().getParamsActualParamParserRuleCall_5_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleActualParam_in_ruleFunctionAssignment5005);
                            	    lv_params_8_0=ruleActualParam();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getFunctionAssignmentRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"params",
                            	            		lv_params_8_0, 
                            	            		"ActualParam");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop45;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleFunctionAssignment5021); 

                        	newLeafNode(otherlv_9, grammarAccess.getFunctionAssignmentAccess().getRightParenthesisKeyword_5_2());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleFunctionAssignment5035); 

                	newLeafNode(otherlv_10, grammarAccess.getFunctionAssignmentAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleFunctionAssignment"


    // $ANTLR start "entryRuleLocalExpression"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2310:1: entryRuleLocalExpression returns [EObject current=null] : iv_ruleLocalExpression= ruleLocalExpression EOF ;
    public final EObject entryRuleLocalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalExpression = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2311:2: (iv_ruleLocalExpression= ruleLocalExpression EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2312:2: iv_ruleLocalExpression= ruleLocalExpression EOF
            {
             newCompositeNode(grammarAccess.getLocalExpressionRule()); 
            pushFollow(FOLLOW_ruleLocalExpression_in_entryRuleLocalExpression5071);
            iv_ruleLocalExpression=ruleLocalExpression();

            state._fsp--;

             current =iv_ruleLocalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalExpression5081); 

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
    // $ANTLR end "entryRuleLocalExpression"


    // $ANTLR start "ruleLocalExpression"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2319:1: ruleLocalExpression returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) | ( (lv_literal_1_0= ruleLiteral ) ) ) ;
    public final EObject ruleLocalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        AntlrDatatypeRuleToken lv_literal_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2322:28: ( ( ( (lv_id_0_0= RULE_ID ) ) | ( (lv_literal_1_0= ruleLiteral ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2323:1: ( ( (lv_id_0_0= RULE_ID ) ) | ( (lv_literal_1_0= ruleLiteral ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2323:1: ( ( (lv_id_0_0= RULE_ID ) ) | ( (lv_literal_1_0= ruleLiteral ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_STRING||LA48_0==RULE_INT) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2323:2: ( (lv_id_0_0= RULE_ID ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2323:2: ( (lv_id_0_0= RULE_ID ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2324:1: (lv_id_0_0= RULE_ID )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2324:1: (lv_id_0_0= RULE_ID )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2325:3: lv_id_0_0= RULE_ID
                    {
                    lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalExpression5123); 

                    			newLeafNode(lv_id_0_0, grammarAccess.getLocalExpressionAccess().getIdIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLocalExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_0_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2342:6: ( (lv_literal_1_0= ruleLiteral ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2342:6: ( (lv_literal_1_0= ruleLiteral ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2343:1: (lv_literal_1_0= ruleLiteral )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2343:1: (lv_literal_1_0= ruleLiteral )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2344:3: lv_literal_1_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalExpressionAccess().getLiteralLiteralParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleLocalExpression5155);
                    lv_literal_1_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"literal",
                            		lv_literal_1_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleLocalExpression"


    // $ANTLR start "entryRuleExpr"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2368:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2369:2: (iv_ruleExpr= ruleExpr EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2370:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr5191);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr5201); 

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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2377:1: ruleExpr returns [EObject current=null] : ( ( (lv_wildcard_0_0= '*' ) ) | ( (lv_expr_1_0= ruleLocalExpression ) ) | ( (lv_pathExpr_2_0= rulePathExpr ) ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        Token lv_wildcard_0_0=null;
        EObject lv_expr_1_0 = null;

        EObject lv_pathExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2380:28: ( ( ( (lv_wildcard_0_0= '*' ) ) | ( (lv_expr_1_0= ruleLocalExpression ) ) | ( (lv_pathExpr_2_0= rulePathExpr ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2381:1: ( ( (lv_wildcard_0_0= '*' ) ) | ( (lv_expr_1_0= ruleLocalExpression ) ) | ( (lv_pathExpr_2_0= rulePathExpr ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2381:1: ( ( (lv_wildcard_0_0= '*' ) ) | ( (lv_expr_1_0= ruleLocalExpression ) ) | ( (lv_pathExpr_2_0= rulePathExpr ) ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt49=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
                {
                alt49=2;
                }
                break;
            case 53:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2381:2: ( (lv_wildcard_0_0= '*' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2381:2: ( (lv_wildcard_0_0= '*' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2382:1: (lv_wildcard_0_0= '*' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2382:1: (lv_wildcard_0_0= '*' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2383:3: lv_wildcard_0_0= '*'
                    {
                    lv_wildcard_0_0=(Token)match(input,24,FOLLOW_24_in_ruleExpr5244); 

                            newLeafNode(lv_wildcard_0_0, grammarAccess.getExprAccess().getWildcardAsteriskKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExprRule());
                    	        }
                           		setWithLastConsumed(current, "wildcard", true, "*");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2397:6: ( (lv_expr_1_0= ruleLocalExpression ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2397:6: ( (lv_expr_1_0= ruleLocalExpression ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2398:1: (lv_expr_1_0= ruleLocalExpression )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2398:1: (lv_expr_1_0= ruleLocalExpression )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2399:3: lv_expr_1_0= ruleLocalExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprAccess().getExprLocalExpressionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLocalExpression_in_ruleExpr5284);
                    lv_expr_1_0=ruleLocalExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExprRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_1_0, 
                            		"LocalExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2416:6: ( (lv_pathExpr_2_0= rulePathExpr ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2416:6: ( (lv_pathExpr_2_0= rulePathExpr ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2417:1: (lv_pathExpr_2_0= rulePathExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2417:1: (lv_pathExpr_2_0= rulePathExpr )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2418:3: lv_pathExpr_2_0= rulePathExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprAccess().getPathExprPathExprParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePathExpr_in_ruleExpr5311);
                    lv_pathExpr_2_0=rulePathExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExprRule());
                    	        }
                           		set(
                           			current, 
                           			"pathExpr",
                            		lv_pathExpr_2_0, 
                            		"PathExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleLiteral"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2442:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2443:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2444:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral5348);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral5359); 

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2451:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )+ | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2454:28: ( ( (this_INT_0= RULE_INT )+ | this_STRING_1= RULE_STRING ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2455:1: ( (this_INT_0= RULE_INT )+ | this_STRING_1= RULE_STRING )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2455:1: ( (this_INT_0= RULE_INT )+ | this_STRING_1= RULE_STRING )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_INT) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_STRING) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2455:2: (this_INT_0= RULE_INT )+
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2455:2: (this_INT_0= RULE_INT )+
                    int cnt50=0;
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==RULE_INT) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2455:7: this_INT_0= RULE_INT
                    	    {
                    	    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLiteral5400); 

                    	    		current.merge(this_INT_0);
                    	        
                    	     
                    	        newLeafNode(this_INT_0, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt50 >= 1 ) break loop50;
                                EarlyExitException eee =
                                    new EarlyExitException(50, input);
                                throw eee;
                        }
                        cnt50++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2463:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteral5428); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRulePathExpr"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2478:1: entryRulePathExpr returns [EObject current=null] : iv_rulePathExpr= rulePathExpr EOF ;
    public final EObject entryRulePathExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathExpr = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2479:2: (iv_rulePathExpr= rulePathExpr EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2480:2: iv_rulePathExpr= rulePathExpr EOF
            {
             newCompositeNode(grammarAccess.getPathExprRule()); 
            pushFollow(FOLLOW_rulePathExpr_in_entryRulePathExpr5473);
            iv_rulePathExpr=rulePathExpr();

            state._fsp--;

             current =iv_rulePathExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExpr5483); 

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
    // $ANTLR end "entryRulePathExpr"


    // $ANTLR start "rulePathExpr"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2487:1: rulePathExpr returns [EObject current=null] : (otherlv_0= '#' this_PathExprNode_1= rulePathExprNode ) ;
    public final EObject rulePathExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_PathExprNode_1 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2490:28: ( (otherlv_0= '#' this_PathExprNode_1= rulePathExprNode ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2491:1: (otherlv_0= '#' this_PathExprNode_1= rulePathExprNode )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2491:1: (otherlv_0= '#' this_PathExprNode_1= rulePathExprNode )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2491:3: otherlv_0= '#' this_PathExprNode_1= rulePathExprNode
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_rulePathExpr5520); 

                	newLeafNode(otherlv_0, grammarAccess.getPathExprAccess().getNumberSignKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getPathExprAccess().getPathExprNodeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulePathExprNode_in_rulePathExpr5542);
            this_PathExprNode_1=rulePathExprNode();

            state._fsp--;

             
                    current = this_PathExprNode_1; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "rulePathExpr"


    // $ANTLR start "entryRulePathExprNode"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2512:1: entryRulePathExprNode returns [EObject current=null] : iv_rulePathExprNode= rulePathExprNode EOF ;
    public final EObject entryRulePathExprNode() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathExprNode = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2513:2: (iv_rulePathExprNode= rulePathExprNode EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2514:2: iv_rulePathExprNode= rulePathExprNode EOF
            {
             newCompositeNode(grammarAccess.getPathExprNodeRule()); 
            pushFollow(FOLLOW_rulePathExprNode_in_entryRulePathExprNode5577);
            iv_rulePathExprNode=rulePathExprNode();

            state._fsp--;

             current =iv_rulePathExprNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExprNode5587); 

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
    // $ANTLR end "entryRulePathExprNode"


    // $ANTLR start "rulePathExprNode"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2521:1: rulePathExprNode returns [EObject current=null] : (this_PathExprTerm_0= rulePathExprTerm ( () otherlv_2= '/' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject rulePathExprNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_PathExprTerm_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2524:28: ( (this_PathExprTerm_0= rulePathExprTerm ( () otherlv_2= '/' ( (otherlv_3= RULE_ID ) ) )* ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2525:1: (this_PathExprTerm_0= rulePathExprTerm ( () otherlv_2= '/' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2525:1: (this_PathExprTerm_0= rulePathExprTerm ( () otherlv_2= '/' ( (otherlv_3= RULE_ID ) ) )* )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2526:5: this_PathExprTerm_0= rulePathExprTerm ( () otherlv_2= '/' ( (otherlv_3= RULE_ID ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPathExprNodeAccess().getPathExprTermParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePathExprTerm_in_rulePathExprNode5634);
            this_PathExprTerm_0=rulePathExprTerm();

            state._fsp--;

             
                    current = this_PathExprTerm_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2534:1: ( () otherlv_2= '/' ( (otherlv_3= RULE_ID ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==54) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2534:2: () otherlv_2= '/' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2534:2: ()
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2535:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPathExprNodeAccess().getPathExprHeadAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,54,FOLLOW_54_in_rulePathExprNode5655); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPathExprNodeAccess().getSolidusKeyword_1_1());
            	        
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2544:1: ( (otherlv_3= RULE_ID ) )
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2545:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2545:1: (otherlv_3= RULE_ID )
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2546:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPathExprNodeRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathExprNode5675); 

            	    		newLeafNode(otherlv_3, grammarAccess.getPathExprNodeAccess().getTailSubconceptOrAttributeCrossReference_1_2_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


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
    // $ANTLR end "rulePathExprNode"


    // $ANTLR start "entryRulePathExprTerm"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2565:1: entryRulePathExprTerm returns [EObject current=null] : iv_rulePathExprTerm= rulePathExprTerm EOF ;
    public final EObject entryRulePathExprTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathExprTerm = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2566:2: (iv_rulePathExprTerm= rulePathExprTerm EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2567:2: iv_rulePathExprTerm= rulePathExprTerm EOF
            {
             newCompositeNode(grammarAccess.getPathExprTermRule()); 
            pushFollow(FOLLOW_rulePathExprTerm_in_entryRulePathExprTerm5713);
            iv_rulePathExprTerm=rulePathExprTerm();

            state._fsp--;

             current =iv_rulePathExprTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExprTerm5723); 

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
    // $ANTLR end "entryRulePathExprTerm"


    // $ANTLR start "rulePathExprTerm"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2574:1: rulePathExprTerm returns [EObject current=null] : ( () ( (lv_axis_1_0= ruleAxis ) )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject rulePathExprTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_axis_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2577:28: ( ( () ( (lv_axis_1_0= ruleAxis ) )? ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2578:1: ( () ( (lv_axis_1_0= ruleAxis ) )? ( (otherlv_2= RULE_ID ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2578:1: ( () ( (lv_axis_1_0= ruleAxis ) )? ( (otherlv_2= RULE_ID ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2578:2: () ( (lv_axis_1_0= ruleAxis ) )? ( (otherlv_2= RULE_ID ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2578:2: ()
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2579:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPathExprTermAccess().getPathExprTermAction_0(),
                        current);
                

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2584:2: ( (lv_axis_1_0= ruleAxis ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==55) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2585:1: (lv_axis_1_0= ruleAxis )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2585:1: (lv_axis_1_0= ruleAxis )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2586:3: lv_axis_1_0= ruleAxis
                    {
                     
                    	        newCompositeNode(grammarAccess.getPathExprTermAccess().getAxisAxisParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAxis_in_rulePathExprTerm5778);
                    lv_axis_1_0=ruleAxis();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPathExprTermRule());
                    	        }
                           		set(
                           			current, 
                           			"axis",
                            		lv_axis_1_0, 
                            		"Axis");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2602:3: ( (otherlv_2= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2603:1: (otherlv_2= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2603:1: (otherlv_2= RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2604:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPathExprTermRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathExprTerm5799); 

            		newLeafNode(otherlv_2, grammarAccess.getPathExprTermAccess().getRefSubconceptOrAttributeCrossReference_2_0()); 
            	

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
    // $ANTLR end "rulePathExprTerm"


    // $ANTLR start "entryRuleAxis"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2623:1: entryRuleAxis returns [EObject current=null] : iv_ruleAxis= ruleAxis EOF ;
    public final EObject entryRuleAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxis = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2624:2: (iv_ruleAxis= ruleAxis EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2625:2: iv_ruleAxis= ruleAxis EOF
            {
             newCompositeNode(grammarAccess.getAxisRule()); 
            pushFollow(FOLLOW_ruleAxis_in_entryRuleAxis5835);
            iv_ruleAxis=ruleAxis();

            state._fsp--;

             current =iv_ruleAxis; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAxis5845); 

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
    // $ANTLR end "entryRuleAxis"


    // $ANTLR start "ruleAxis"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2632:1: ruleAxis returns [EObject current=null] : ( (lv_ancestor_0_0= '^' ) ) ;
    public final EObject ruleAxis() throws RecognitionException {
        EObject current = null;

        Token lv_ancestor_0_0=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2635:28: ( ( (lv_ancestor_0_0= '^' ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2636:1: ( (lv_ancestor_0_0= '^' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2636:1: ( (lv_ancestor_0_0= '^' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2637:1: (lv_ancestor_0_0= '^' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2637:1: (lv_ancestor_0_0= '^' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2638:3: lv_ancestor_0_0= '^'
            {
            lv_ancestor_0_0=(Token)match(input,55,FOLLOW_55_in_ruleAxis5887); 

                    newLeafNode(lv_ancestor_0_0, grammarAccess.getAxisAccess().getAncestorCircumflexAccentKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAxisRule());
            	        }
                   		setWithLastConsumed(current, "ancestor", true, "^");
            	    

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
    // $ANTLR end "ruleAxis"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguage85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleLanguage122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLanguage139 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLanguage161 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLanguage178 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleTopConceptDef_in_ruleLanguage199 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_ruleNamedConceptDef_in_ruleLanguage220 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_14_in_ruleLanguage233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANNOTATION_ID_in_ruleAnnotation321 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleAnnotation339 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAnnotation356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnonymousConceptDef_in_entryRuleAnonymousConceptDef399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnonymousConceptDef409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAnonymousConceptDef456 = new BitSet(new long[]{0x003EC007C0000000L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleAnonymousConceptDef477 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAnonymousConceptDef489 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleAnonymousConceptDef504 = new BitSet(new long[]{0x0000000000804050L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnonymousConceptDef525 = new BitSet(new long[]{0x0000000000804050L});
    public static final BitSet FOLLOW_ruleSubconceptOrAttribute_in_ruleAnonymousConceptDef547 = new BitSet(new long[]{0x0000000000804010L});
    public static final BitSet FOLLOW_14_in_ruleAnonymousConceptDef560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedConceptDef_in_entryRuleNamedConceptDef598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedConceptDef608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleNamedConceptDef651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedConceptDef681 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_16_in_ruleNamedConceptDef699 = new BitSet(new long[]{0x003EC007C0000000L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleNamedConceptDef720 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleNamedConceptDef732 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleNamedConceptDef747 = new BitSet(new long[]{0x0000000000804050L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleNamedConceptDef768 = new BitSet(new long[]{0x0000000000804050L});
    public static final BitSet FOLLOW_ruleSubconceptOrAttribute_in_ruleNamedConceptDef790 = new BitSet(new long[]{0x0000000000804010L});
    public static final BitSet FOLLOW_14_in_ruleNamedConceptDef803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopConceptDef_in_entryRuleTopConceptDef841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopConceptDef851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTopConceptDef894 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTopConceptDef925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTopConceptDef955 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_16_in_ruleTopConceptDef973 = new BitSet(new long[]{0x003EC007C0000000L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleTopConceptDef994 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTopConceptDef1006 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleTopConceptDef1021 = new BitSet(new long[]{0x0000000000804050L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleTopConceptDef1042 = new BitSet(new long[]{0x0000000000804050L});
    public static final BitSet FOLLOW_ruleSubconceptOrAttribute_in_ruleTopConceptDef1064 = new BitSet(new long[]{0x0000000000804010L});
    public static final BitSet FOLLOW_14_in_ruleTopConceptDef1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconceptOrAttribute_in_entryRuleSubconceptOrAttribute1115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubconceptOrAttribute1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconcept_in_ruleSubconceptOrAttribute1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleSubconceptOrAttribute1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconcept_in_entryRuleSubconcept1234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubconcept1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubconcept1286 = new BitSet(new long[]{0x0000000003712000L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleSubconcept1312 = new BitSet(new long[]{0x0000000000712000L});
    public static final BitSet FOLLOW_20_in_ruleSubconcept1332 = new BitSet(new long[]{0x0000000000412000L});
    public static final BitSet FOLLOW_21_in_ruleSubconcept1370 = new BitSet(new long[]{0x0000000000412000L});
    public static final BitSet FOLLOW_22_in_ruleSubconcept1398 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleNamedConceptDef_in_ruleSubconcept1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnonymousConceptDef_in_ruleSubconcept1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSubconcept1472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubconcept1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAttribute1596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1626 = new BitSet(new long[]{0x0000000003312002L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleAttribute1652 = new BitSet(new long[]{0x0000000000312002L});
    public static final BitSet FOLLOW_20_in_ruleAttribute1672 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_21_in_ruleAttribute1710 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_16_in_ruleAttribute1737 = new BitSet(new long[]{0x003EC007C0000000L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleAttribute1758 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAttribute1770 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleAttribute1785 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAttribute1806 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_14_in_ruleAttribute1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality1857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCardinality1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCardinality1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping1996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_ruleMapping2052 = new BitSet(new long[]{0x003EC007C0000000L});
    public static final BitSet FOLLOW_ruleImplicitContextMapping_in_ruleMapping2074 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_26_in_ruleMapping2087 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMapping2099 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rulePathExpr_in_ruleMapping2120 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMapping2132 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleMapping2147 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMapping2159 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rulePathExpr_in_ruleMapping2180 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMapping2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitContextMapping_in_entryRuleImplicitContextMapping2230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitContextMapping2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_ruleImplicitContextMapping2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleName_in_ruleImplicitContextMapping2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesModule_in_ruleImplicitContextMapping2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesEntity_in_ruleImplicitContextMapping2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleImplicitContextMapping2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutine_in_ruleImplicitContextMapping2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutineName_in_ruleImplicitContextMapping2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParamByKeyword_in_ruleImplicitContextMapping2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleImplicitContextMapping2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredEntity_in_ruleImplicitContextMapping2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionAssignment_in_ruleImplicitContextMapping2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule2597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleModule2653 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleModule2666 = new BitSet(new long[]{0x00200000010000B0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleModule2687 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleModule2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleName_in_entryRuleModuleName2737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleName2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleModuleName2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesModule_in_entryRuleUsesModule2829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsesModule2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleUsesModule2876 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleUsesModule2888 = new BitSet(new long[]{0x00200000010000B0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleUsesModule2909 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleUsesModule2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesEntity_in_entryRuleUsesEntity2957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsesEntity2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleUsesEntity3004 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleUsesEntity3016 = new BitSet(new long[]{0x00200000010000B0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleUsesEntity3037 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleUsesEntity3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutine_in_entryRuleSubroutine3085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubroutine3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSubroutine3132 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSubroutine3144 = new BitSet(new long[]{0x00200000010000B0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleSubroutine3165 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_ruleSubroutine3178 = new BitSet(new long[]{0x00002FF010000000L});
    public static final BitSet FOLLOW_ruleFormalParam_in_ruleSubroutine3200 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_35_in_ruleSubroutine3213 = new BitSet(new long[]{0x00002FF000000000L});
    public static final BitSet FOLLOW_ruleFormalParam_in_ruleSubroutine3234 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_28_in_ruleSubroutine3250 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSubroutine3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalParam_in_entryRuleFormalParam3300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalParam3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_ruleFormalParam3356 = new BitSet(new long[]{0x00002FF000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleFormalParam3378 = new BitSet(new long[]{0x00200000010000B0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleFormalParam3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_entryRuleIntent3435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntent3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleIntent3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleIntent3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleIntent3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType3611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleType3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleType3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleType3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleType3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleType3813 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleType3839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleType3867 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleType3892 = new BitSet(new long[]{0x00200000010000B0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleType3913 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleType3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutineName_in_entryRuleSubroutineName3962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubroutineName3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleSubroutineName4009 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleSubroutineName4031 = new BitSet(new long[]{0x00200000010000B0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleSubroutineName4052 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSubroutineName4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall4102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleCall4149 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCall4161 = new BitSet(new long[]{0x00200000010000B0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCall4182 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_ruleCall4195 = new BitSet(new long[]{0x00200000110000B0L});
    public static final BitSet FOLLOW_ruleActualParam_in_ruleCall4217 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_35_in_ruleCall4230 = new BitSet(new long[]{0x00200000010000B0L});
    public static final BitSet FOLLOW_ruleActualParam_in_ruleCall4251 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_28_in_ruleCall4267 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCall4281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParam_in_entryRuleActualParam4317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActualParam4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActualParam4370 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_48_in_ruleActualParam4393 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleActualParam4419 = new BitSet(new long[]{0x00200000010000B0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleActualParam4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParamByKeyword_in_entryRuleActualParamByKeyword4478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActualParamByKeyword4488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleActualParamByKeyword4525 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleActualParamByKeyword4537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActualParamByKeyword4554 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleActualParamByKeyword4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleVariableDeclaration4654 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleVariableDeclaration4666 = new BitSet(new long[]{0x00002FF000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariableDeclaration4687 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleVariableDeclaration4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredEntity_in_entryRuleDeclaredEntity4736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredEntity4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleDeclaredEntity4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionAssignment_in_entryRuleFunctionAssignment4823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionAssignment4833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleFunctionAssignment4870 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFunctionAssignment4882 = new BitSet(new long[]{0x00200000010000B0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleFunctionAssignment4903 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleFunctionAssignment4915 = new BitSet(new long[]{0x00200000010000B0L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleFunctionAssignment4936 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_ruleFunctionAssignment4949 = new BitSet(new long[]{0x00200000110000B0L});
    public static final BitSet FOLLOW_ruleActualParam_in_ruleFunctionAssignment4971 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_35_in_ruleFunctionAssignment4984 = new BitSet(new long[]{0x00200000010000B0L});
    public static final BitSet FOLLOW_ruleActualParam_in_ruleFunctionAssignment5005 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_28_in_ruleFunctionAssignment5021 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleFunctionAssignment5035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalExpression_in_entryRuleLocalExpression5071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalExpression5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalExpression5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleLocalExpression5155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr5191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr5201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleExpr5244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalExpression_in_ruleExpr5284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_ruleExpr5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral5348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral5359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLiteral5400 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral5428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_entryRulePathExpr5473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExpr5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePathExpr5520 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_rulePathExprNode_in_rulePathExpr5542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExprNode_in_entryRulePathExprNode5577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExprNode5587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExprTerm_in_rulePathExprNode5634 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_rulePathExprNode5655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathExprNode5675 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_rulePathExprTerm_in_entryRulePathExprTerm5713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExprTerm5723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAxis_in_rulePathExprTerm5778 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathExprTerm5799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAxis_in_entryRuleAxis5835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAxis5845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleAxis5887 = new BitSet(new long[]{0x0000000000000002L});

}