package org.iobserve.rac.constraint.parser.antlr.internal; 

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
import org.iobserve.rac.constraint.services.ConstraintLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalConstraintLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'select'", "','", "'from'", "'store'", "'('", "')'", "':'", "'.'", "'filter'", "'?'", "'uses'", "'{'", "'}'", "'KIEKER_VERSION'", "'*'", "'super'", "'extends'", "'&'", "'|'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'~'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_NUMBER=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_FLOAT=7;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalConstraintLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConstraintLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConstraintLangParser.tokenNames; }
    public String getGrammarFileName() { return "../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g"; }



     	private ConstraintLangGrammarAccess grammarAccess;
     	
        public InternalConstraintLangParser(TokenStream input, ConstraintLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ConstraintLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:70:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:77:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_operations_3_0= ruleOperation ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_operations_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:80:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_operations_3_0= ruleOperation ) )* ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:81:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_operations_3_0= ruleOperation ) )* )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:81:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_operations_3_0= ruleOperation ) )* )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:81:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_operations_3_0= ruleOperation ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleModel122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
                  
            }
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:85:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:86:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:86:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:87:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleModel143);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:103:2: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:104:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:104:1: (lv_imports_2_0= ruleImport )
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:105:3: lv_imports_2_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel164);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_2_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:121:3: ( (lv_operations_3_0= ruleOperation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:122:1: (lv_operations_3_0= ruleOperation )
            	    {
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:122:1: (lv_operations_3_0= ruleOperation )
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:123:3: lv_operations_3_0= ruleOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getOperationsOperationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOperation_in_ruleModel186);
            	    lv_operations_3_0=ruleOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"operations",
            	              		lv_operations_3_0, 
            	              		"Operation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:147:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:148:2: (iv_ruleImport= ruleImport EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:149:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport223);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport233); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:156:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:159:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:160:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:160:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:160:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleImport270); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:164:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:165:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:165:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:166:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport291);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleOperation"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:190:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:191:2: (iv_ruleOperation= ruleOperation EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:192:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation327);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation337); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:199:1: ruleOperation returns [EObject current=null] : (this_Filter_0= ruleFilter | this_Selection_1= ruleSelection ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Filter_0 = null;

        EObject this_Selection_1 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:202:28: ( (this_Filter_0= ruleFilter | this_Selection_1= ruleSelection ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:203:1: (this_Filter_0= ruleFilter | this_Selection_1= ruleSelection )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:203:1: (this_Filter_0= ruleFilter | this_Selection_1= ruleSelection )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:204:5: this_Filter_0= ruleFilter
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationAccess().getFilterParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFilter_in_ruleOperation384);
                    this_Filter_0=ruleFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Filter_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:214:5: this_Selection_1= ruleSelection
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperationAccess().getSelectionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelection_in_ruleOperation411);
                    this_Selection_1=ruleSelection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Selection_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleSelection"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:230:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:231:2: (iv_ruleSelection= ruleSelection EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:232:2: iv_ruleSelection= ruleSelection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectionRule()); 
            }
            pushFollow(FOLLOW_ruleSelection_in_entryRuleSelection446);
            iv_ruleSelection=ruleSelection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelection456); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelection"


    // $ANTLR start "ruleSelection"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:239:1: ruleSelection returns [EObject current=null] : (otherlv_0= 'select' ( (lv_inputs_1_0= ruleSelectInput ) ) (otherlv_2= ',' ( (lv_inputs_3_0= ruleSelectInput ) ) )* otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'store' ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' ( (lv_paremterExpressions_9_0= ruleParameterExpression ) ) (otherlv_10= ',' ( (lv_paremterExpressions_11_0= ruleParameterExpression ) ) )* otherlv_12= ')' ) ;
    public final EObject ruleSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_inputs_1_0 = null;

        EObject lv_inputs_3_0 = null;

        EObject lv_paremterExpressions_9_0 = null;

        EObject lv_paremterExpressions_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:242:28: ( (otherlv_0= 'select' ( (lv_inputs_1_0= ruleSelectInput ) ) (otherlv_2= ',' ( (lv_inputs_3_0= ruleSelectInput ) ) )* otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'store' ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' ( (lv_paremterExpressions_9_0= ruleParameterExpression ) ) (otherlv_10= ',' ( (lv_paremterExpressions_11_0= ruleParameterExpression ) ) )* otherlv_12= ')' ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:243:1: (otherlv_0= 'select' ( (lv_inputs_1_0= ruleSelectInput ) ) (otherlv_2= ',' ( (lv_inputs_3_0= ruleSelectInput ) ) )* otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'store' ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' ( (lv_paremterExpressions_9_0= ruleParameterExpression ) ) (otherlv_10= ',' ( (lv_paremterExpressions_11_0= ruleParameterExpression ) ) )* otherlv_12= ')' )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:243:1: (otherlv_0= 'select' ( (lv_inputs_1_0= ruleSelectInput ) ) (otherlv_2= ',' ( (lv_inputs_3_0= ruleSelectInput ) ) )* otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'store' ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' ( (lv_paremterExpressions_9_0= ruleParameterExpression ) ) (otherlv_10= ',' ( (lv_paremterExpressions_11_0= ruleParameterExpression ) ) )* otherlv_12= ')' )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:243:3: otherlv_0= 'select' ( (lv_inputs_1_0= ruleSelectInput ) ) (otherlv_2= ',' ( (lv_inputs_3_0= ruleSelectInput ) ) )* otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'store' ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' ( (lv_paremterExpressions_9_0= ruleParameterExpression ) ) (otherlv_10= ',' ( (lv_paremterExpressions_11_0= ruleParameterExpression ) ) )* otherlv_12= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleSelection493); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSelectionAccess().getSelectKeyword_0());
                  
            }
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:247:1: ( (lv_inputs_1_0= ruleSelectInput ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:248:1: (lv_inputs_1_0= ruleSelectInput )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:248:1: (lv_inputs_1_0= ruleSelectInput )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:249:3: lv_inputs_1_0= ruleSelectInput
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectionAccess().getInputsSelectInputParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectInput_in_ruleSelection514);
            lv_inputs_1_0=ruleSelectInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelectionRule());
              	        }
                     		add(
                     			current, 
                     			"inputs",
                      		lv_inputs_1_0, 
                      		"SelectInput");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:265:2: (otherlv_2= ',' ( (lv_inputs_3_0= ruleSelectInput ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:265:4: otherlv_2= ',' ( (lv_inputs_3_0= ruleSelectInput ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSelection527); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSelectionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:269:1: ( (lv_inputs_3_0= ruleSelectInput ) )
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:270:1: (lv_inputs_3_0= ruleSelectInput )
            	    {
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:270:1: (lv_inputs_3_0= ruleSelectInput )
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:271:3: lv_inputs_3_0= ruleSelectInput
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectionAccess().getInputsSelectInputParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSelectInput_in_ruleSelection548);
            	    lv_inputs_3_0=ruleSelectInput();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSelectionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"inputs",
            	              		lv_inputs_3_0, 
            	              		"SelectInput");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleSelection562); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSelectionAccess().getFromKeyword_3());
                  
            }
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:291:1: ( (otherlv_5= RULE_ID ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:292:1: (otherlv_5= RULE_ID )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:292:1: (otherlv_5= RULE_ID )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:293:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSelectionRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelection582); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getSelectionAccess().getFilterFilterCrossReference_4_0()); 
              	
            }

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleSelection594); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSelectionAccess().getStoreKeyword_5());
                  
            }
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:308:1: ( (otherlv_7= RULE_ID ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:309:1: (otherlv_7= RULE_ID )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:309:1: (otherlv_7= RULE_ID )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:310:3: otherlv_7= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSelectionRule());
              	        }
                      
            }
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelection614); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_7, grammarAccess.getSelectionAccess().getRecordTypeRecordTypeCrossReference_6_0()); 
              	
            }

            }


            }

            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleSelection626); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getSelectionAccess().getLeftParenthesisKeyword_7());
                  
            }
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:325:1: ( (lv_paremterExpressions_9_0= ruleParameterExpression ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:326:1: (lv_paremterExpressions_9_0= ruleParameterExpression )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:326:1: (lv_paremterExpressions_9_0= ruleParameterExpression )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:327:3: lv_paremterExpressions_9_0= ruleParameterExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectionAccess().getParemterExpressionsParameterExpressionParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleParameterExpression_in_ruleSelection647);
            lv_paremterExpressions_9_0=ruleParameterExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelectionRule());
              	        }
                     		add(
                     			current, 
                     			"paremterExpressions",
                      		lv_paremterExpressions_9_0, 
                      		"ParameterExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:343:2: (otherlv_10= ',' ( (lv_paremterExpressions_11_0= ruleParameterExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:343:4: otherlv_10= ',' ( (lv_paremterExpressions_11_0= ruleParameterExpression ) )
            	    {
            	    otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleSelection660); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getSelectionAccess().getCommaKeyword_9_0());
            	          
            	    }
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:347:1: ( (lv_paremterExpressions_11_0= ruleParameterExpression ) )
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:348:1: (lv_paremterExpressions_11_0= ruleParameterExpression )
            	    {
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:348:1: (lv_paremterExpressions_11_0= ruleParameterExpression )
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:349:3: lv_paremterExpressions_11_0= ruleParameterExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSelectionAccess().getParemterExpressionsParameterExpressionParserRuleCall_9_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameterExpression_in_ruleSelection681);
            	    lv_paremterExpressions_11_0=ruleParameterExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSelectionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"paremterExpressions",
            	              		lv_paremterExpressions_11_0, 
            	              		"ParameterExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleSelection695); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getSelectionAccess().getRightParenthesisKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleSelectInput"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:377:1: entryRuleSelectInput returns [EObject current=null] : iv_ruleSelectInput= ruleSelectInput EOF ;
    public final EObject entryRuleSelectInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectInput = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:378:2: (iv_ruleSelectInput= ruleSelectInput EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:379:2: iv_ruleSelectInput= ruleSelectInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectInputRule()); 
            }
            pushFollow(FOLLOW_ruleSelectInput_in_entryRuleSelectInput731);
            iv_ruleSelectInput=ruleSelectInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectInput; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectInput741); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelectInput"


    // $ANTLR start "ruleSelectInput"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:386:1: ruleSelectInput returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_selectConstraint_3_0= ruleSelectConstaintExpression ) ) )? ) ;
    public final EObject ruleSelectInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_selectConstraint_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:389:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_selectConstraint_3_0= ruleSelectConstaintExpression ) ) )? ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:390:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_selectConstraint_3_0= ruleSelectConstaintExpression ) ) )? )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:390:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_selectConstraint_3_0= ruleSelectConstaintExpression ) ) )? )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:390:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_selectConstraint_3_0= ruleSelectConstaintExpression ) ) )?
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:390:2: ( (otherlv_0= RULE_ID ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:391:1: (otherlv_0= RULE_ID )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:391:1: (otherlv_0= RULE_ID )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:392:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSelectInputRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectInput786); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getSelectInputAccess().getRecordTypeRecordTypeCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:403:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:404:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:404:1: (lv_name_1_0= RULE_ID )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:405:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectInput803); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getSelectInputAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSelectInputRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:421:2: (otherlv_2= ':' ( (lv_selectConstraint_3_0= ruleSelectConstaintExpression ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:421:4: otherlv_2= ':' ( (lv_selectConstraint_3_0= ruleSelectConstaintExpression ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleSelectInput821); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSelectInputAccess().getColonKeyword_2_0());
                          
                    }
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:425:1: ( (lv_selectConstraint_3_0= ruleSelectConstaintExpression ) )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:426:1: (lv_selectConstraint_3_0= ruleSelectConstaintExpression )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:426:1: (lv_selectConstraint_3_0= ruleSelectConstaintExpression )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:427:3: lv_selectConstraint_3_0= ruleSelectConstaintExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectInputAccess().getSelectConstraintSelectConstaintExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectConstaintExpression_in_ruleSelectInput842);
                    lv_selectConstraint_3_0=ruleSelectConstaintExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectInputRule());
                      	        }
                             		set(
                             			current, 
                             			"selectConstraint",
                              		lv_selectConstraint_3_0, 
                              		"SelectConstaintExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSelectInput"


    // $ANTLR start "entryRuleSelectConstaintExpression"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:451:1: entryRuleSelectConstaintExpression returns [EObject current=null] : iv_ruleSelectConstaintExpression= ruleSelectConstaintExpression EOF ;
    public final EObject entryRuleSelectConstaintExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectConstaintExpression = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:452:2: (iv_ruleSelectConstaintExpression= ruleSelectConstaintExpression EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:453:2: iv_ruleSelectConstaintExpression= ruleSelectConstaintExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectConstaintExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectConstaintExpression_in_entryRuleSelectConstaintExpression880);
            iv_ruleSelectConstaintExpression=ruleSelectConstaintExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectConstaintExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectConstaintExpression890); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelectConstaintExpression"


    // $ANTLR start "ruleSelectConstaintExpression"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:460:1: ruleSelectConstaintExpression returns [EObject current=null] : (this_BasicSelectConstraint_0= ruleBasicSelectConstraint ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleSelectConstaintExpression ) ) )? ) ;
    public final EObject ruleSelectConstaintExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BasicSelectConstraint_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:463:28: ( (this_BasicSelectConstraint_0= ruleBasicSelectConstraint ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleSelectConstaintExpression ) ) )? ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:464:1: (this_BasicSelectConstraint_0= ruleBasicSelectConstraint ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleSelectConstaintExpression ) ) )? )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:464:1: (this_BasicSelectConstraint_0= ruleBasicSelectConstraint ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleSelectConstaintExpression ) ) )? )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:465:5: this_BasicSelectConstraint_0= ruleBasicSelectConstraint ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleSelectConstaintExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSelectConstaintExpressionAccess().getBasicSelectConstraintParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBasicSelectConstraint_in_ruleSelectConstaintExpression937);
            this_BasicSelectConstraint_0=ruleBasicSelectConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BasicSelectConstraint_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:473:1: ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleSelectConstaintExpression ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) && (synpred1_InternalConstraintLang())) {
                alt7=1;
            }
            else if ( (LA7_0==34) && (synpred1_InternalConstraintLang())) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:473:2: ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleSelectConstaintExpression ) )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:473:2: ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:473:3: ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:478:6: ( () ( (lv_operator_2_0= ruleLogicOperator ) ) )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:478:7: () ( (lv_operator_2_0= ruleLogicOperator ) )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:478:7: ()
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:479:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getSelectConstaintExpressionAccess().getSelectConstaintExpressionLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:484:2: ( (lv_operator_2_0= ruleLogicOperator ) )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:485:1: (lv_operator_2_0= ruleLogicOperator )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:485:1: (lv_operator_2_0= ruleLogicOperator )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:486:3: lv_operator_2_0= ruleLogicOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectConstaintExpressionAccess().getOperatorLogicOperatorEnumRuleCall_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicOperator_in_ruleSelectConstaintExpression986);
                    lv_operator_2_0=ruleLogicOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectConstaintExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"LogicOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }

                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:502:4: ( (lv_right_3_0= ruleSelectConstaintExpression ) )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:503:1: (lv_right_3_0= ruleSelectConstaintExpression )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:503:1: (lv_right_3_0= ruleSelectConstaintExpression )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:504:3: lv_right_3_0= ruleSelectConstaintExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectConstaintExpressionAccess().getRightSelectConstaintExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSelectConstaintExpression_in_ruleSelectConstaintExpression1009);
                    lv_right_3_0=ruleSelectConstaintExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectConstaintExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"SelectConstaintExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSelectConstaintExpression"


    // $ANTLR start "entryRuleBasicSelectConstraint"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:528:1: entryRuleBasicSelectConstraint returns [EObject current=null] : iv_ruleBasicSelectConstraint= ruleBasicSelectConstraint EOF ;
    public final EObject entryRuleBasicSelectConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicSelectConstraint = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:529:2: (iv_ruleBasicSelectConstraint= ruleBasicSelectConstraint EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:530:2: iv_ruleBasicSelectConstraint= ruleBasicSelectConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicSelectConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleBasicSelectConstraint_in_entryRuleBasicSelectConstraint1047);
            iv_ruleBasicSelectConstraint=ruleBasicSelectConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicSelectConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicSelectConstraint1057); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBasicSelectConstraint"


    // $ANTLR start "ruleBasicSelectConstraint"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:537:1: ruleBasicSelectConstraint returns [EObject current=null] : (this_ParenthesisSelectConstraint_0= ruleParenthesisSelectConstraint | this_SelectConstraint_1= ruleSelectConstraint ) ;
    public final EObject ruleBasicSelectConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_ParenthesisSelectConstraint_0 = null;

        EObject this_SelectConstraint_1 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:540:28: ( (this_ParenthesisSelectConstraint_0= ruleParenthesisSelectConstraint | this_SelectConstraint_1= ruleSelectConstraint ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:541:1: (this_ParenthesisSelectConstraint_0= ruleParenthesisSelectConstraint | this_SelectConstraint_1= ruleSelectConstraint )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:541:1: (this_ParenthesisSelectConstraint_0= ruleParenthesisSelectConstraint | this_SelectConstraint_1= ruleSelectConstraint )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_BOOLEAN)||LA8_0==27||LA8_0==29) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:542:5: this_ParenthesisSelectConstraint_0= ruleParenthesisSelectConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicSelectConstraintAccess().getParenthesisSelectConstraintParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesisSelectConstraint_in_ruleBasicSelectConstraint1104);
                    this_ParenthesisSelectConstraint_0=ruleParenthesisSelectConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParenthesisSelectConstraint_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:552:5: this_SelectConstraint_1= ruleSelectConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicSelectConstraintAccess().getSelectConstraintParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectConstraint_in_ruleBasicSelectConstraint1131);
                    this_SelectConstraint_1=ruleSelectConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SelectConstraint_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBasicSelectConstraint"


    // $ANTLR start "entryRuleParenthesisSelectConstraint"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:568:1: entryRuleParenthesisSelectConstraint returns [EObject current=null] : iv_ruleParenthesisSelectConstraint= ruleParenthesisSelectConstraint EOF ;
    public final EObject entryRuleParenthesisSelectConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesisSelectConstraint = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:569:2: (iv_ruleParenthesisSelectConstraint= ruleParenthesisSelectConstraint EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:570:2: iv_ruleParenthesisSelectConstraint= ruleParenthesisSelectConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesisSelectConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesisSelectConstraint_in_entryRuleParenthesisSelectConstraint1166);
            iv_ruleParenthesisSelectConstraint=ruleParenthesisSelectConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesisSelectConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisSelectConstraint1176); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParenthesisSelectConstraint"


    // $ANTLR start "ruleParenthesisSelectConstraint"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:577:1: ruleParenthesisSelectConstraint returns [EObject current=null] : (otherlv_0= '(' ( (lv_constraint_1_0= ruleSelectConstaintExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesisSelectConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_constraint_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:580:28: ( (otherlv_0= '(' ( (lv_constraint_1_0= ruleSelectConstaintExpression ) ) otherlv_2= ')' ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:581:1: (otherlv_0= '(' ( (lv_constraint_1_0= ruleSelectConstaintExpression ) ) otherlv_2= ')' )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:581:1: (otherlv_0= '(' ( (lv_constraint_1_0= ruleSelectConstaintExpression ) ) otherlv_2= ')' )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:581:3: otherlv_0= '(' ( (lv_constraint_1_0= ruleSelectConstaintExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleParenthesisSelectConstraint1213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesisSelectConstraintAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:585:1: ( (lv_constraint_1_0= ruleSelectConstaintExpression ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:586:1: (lv_constraint_1_0= ruleSelectConstaintExpression )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:586:1: (lv_constraint_1_0= ruleSelectConstaintExpression )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:587:3: lv_constraint_1_0= ruleSelectConstaintExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesisSelectConstraintAccess().getConstraintSelectConstaintExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSelectConstaintExpression_in_ruleParenthesisSelectConstraint1234);
            lv_constraint_1_0=ruleSelectConstaintExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParenthesisSelectConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"constraint",
                      		lv_constraint_1_0, 
                      		"SelectConstaintExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleParenthesisSelectConstraint1246); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParenthesisSelectConstraintAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParenthesisSelectConstraint"


    // $ANTLR start "entryRuleSelectConstraint"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:615:1: entryRuleSelectConstraint returns [EObject current=null] : iv_ruleSelectConstraint= ruleSelectConstraint EOF ;
    public final EObject entryRuleSelectConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectConstraint = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:616:2: (iv_ruleSelectConstraint= ruleSelectConstraint EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:617:2: iv_ruleSelectConstraint= ruleSelectConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleSelectConstraint_in_entryRuleSelectConstraint1282);
            iv_ruleSelectConstraint=ruleSelectConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectConstraint1292); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelectConstraint"


    // $ANTLR start "ruleSelectConstraint"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:624:1: ruleSelectConstraint returns [EObject current=null] : ( ( (lv_left_0_0= ruleCompareOperand ) ) ( (lv_comperator_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleCompareOperand ) ) ) ;
    public final EObject ruleSelectConstraint() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        Enumerator lv_comperator_1_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:627:28: ( ( ( (lv_left_0_0= ruleCompareOperand ) ) ( (lv_comperator_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleCompareOperand ) ) ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:628:1: ( ( (lv_left_0_0= ruleCompareOperand ) ) ( (lv_comperator_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleCompareOperand ) ) )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:628:1: ( ( (lv_left_0_0= ruleCompareOperand ) ) ( (lv_comperator_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleCompareOperand ) ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:628:2: ( (lv_left_0_0= ruleCompareOperand ) ) ( (lv_comperator_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleCompareOperand ) )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:628:2: ( (lv_left_0_0= ruleCompareOperand ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:629:1: (lv_left_0_0= ruleCompareOperand )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:629:1: (lv_left_0_0= ruleCompareOperand )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:630:3: lv_left_0_0= ruleCompareOperand
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectConstraintAccess().getLeftCompareOperandParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCompareOperand_in_ruleSelectConstraint1338);
            lv_left_0_0=ruleCompareOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelectConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"CompareOperand");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:646:2: ( (lv_comperator_1_0= ruleComparator ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:647:1: (lv_comperator_1_0= ruleComparator )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:647:1: (lv_comperator_1_0= ruleComparator )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:648:3: lv_comperator_1_0= ruleComparator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectConstraintAccess().getComperatorComparatorEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleComparator_in_ruleSelectConstraint1359);
            lv_comperator_1_0=ruleComparator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelectConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"comperator",
                      		lv_comperator_1_0, 
                      		"Comparator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:664:2: ( (lv_right_2_0= ruleCompareOperand ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:665:1: (lv_right_2_0= ruleCompareOperand )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:665:1: (lv_right_2_0= ruleCompareOperand )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:666:3: lv_right_2_0= ruleCompareOperand
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectConstraintAccess().getRightCompareOperandParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCompareOperand_in_ruleSelectConstraint1380);
            lv_right_2_0=ruleCompareOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelectConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_2_0, 
                      		"CompareOperand");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSelectConstraint"


    // $ANTLR start "entryRuleCompareOperand"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:690:1: entryRuleCompareOperand returns [EObject current=null] : iv_ruleCompareOperand= ruleCompareOperand EOF ;
    public final EObject entryRuleCompareOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperand = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:691:2: (iv_ruleCompareOperand= ruleCompareOperand EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:692:2: iv_ruleCompareOperand= ruleCompareOperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperandRule()); 
            }
            pushFollow(FOLLOW_ruleCompareOperand_in_entryRuleCompareOperand1416);
            iv_ruleCompareOperand=ruleCompareOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperand1426); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompareOperand"


    // $ANTLR start "ruleCompareOperand"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:699:1: ruleCompareOperand returns [EObject current=null] : (this_ParameterExpression_0= ruleParameterExpression | this_Literal_1= ruleLiteral ) ;
    public final EObject ruleCompareOperand() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterExpression_0 = null;

        EObject this_Literal_1 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:702:28: ( (this_ParameterExpression_0= ruleParameterExpression | this_Literal_1= ruleLiteral ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:703:1: (this_ParameterExpression_0= ruleParameterExpression | this_Literal_1= ruleLiteral )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:703:1: (this_ParameterExpression_0= ruleParameterExpression | this_Literal_1= ruleLiteral )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_BOOLEAN)||LA9_0==27||LA9_0==29) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:704:5: this_ParameterExpression_0= ruleParameterExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompareOperandAccess().getParameterExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterExpression_in_ruleCompareOperand1473);
                    this_ParameterExpression_0=ruleParameterExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParameterExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:714:5: this_Literal_1= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompareOperandAccess().getLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleCompareOperand1500);
                    this_Literal_1=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Literal_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCompareOperand"


    // $ANTLR start "entryRuleParameterExpression"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:730:1: entryRuleParameterExpression returns [EObject current=null] : iv_ruleParameterExpression= ruleParameterExpression EOF ;
    public final EObject entryRuleParameterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterExpression = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:731:2: (iv_ruleParameterExpression= ruleParameterExpression EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:732:2: iv_ruleParameterExpression= ruleParameterExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParameterExpression_in_entryRuleParameterExpression1535);
            iv_ruleParameterExpression=ruleParameterExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterExpression1545); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameterExpression"


    // $ANTLR start "ruleParameterExpression"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:739:1: ruleParameterExpression returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleParameterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:742:28: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:743:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:743:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:743:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( (otherlv_2= RULE_ID ) )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:743:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==23) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:743:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.'
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:743:3: ( (otherlv_0= RULE_ID ) )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:744:1: (otherlv_0= RULE_ID )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:744:1: (otherlv_0= RULE_ID )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:745:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameterExpressionRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterExpression1591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getParameterExpressionAccess().getInputSelectInputCrossReference_0_0_0()); 
                      	
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleParameterExpression1603); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getParameterExpressionAccess().getFullStopKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:760:3: ( (otherlv_2= RULE_ID ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:761:1: (otherlv_2= RULE_ID )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:761:1: (otherlv_2= RULE_ID )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:762:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterExpressionRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterExpression1625); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getParameterExpressionAccess().getPropertyReferencePropertyCrossReference_1_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParameterExpression"


    // $ANTLR start "entryRuleFilter"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:781:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:782:2: (iv_ruleFilter= ruleFilter EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:783:2: iv_ruleFilter= ruleFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFilterRule()); 
            }
            pushFollow(FOLLOW_ruleFilter_in_entryRuleFilter1661);
            iv_ruleFilter=ruleFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFilter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilter1671); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:790:1: ruleFilter returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_constraint_2_0= ruleConstraintExpression ) ) ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_constraint_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:793:28: ( (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_constraint_2_0= ruleConstraintExpression ) ) ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:794:1: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_constraint_2_0= ruleConstraintExpression ) ) )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:794:1: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_constraint_2_0= ruleConstraintExpression ) ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:794:3: otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) ( (lv_constraint_2_0= ruleConstraintExpression ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleFilter1708); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFilterAccess().getFilterKeyword_0());
                  
            }
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:798:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:799:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:799:1: (lv_name_1_0= RULE_ID )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:800:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFilter1725); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getFilterAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFilterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:816:2: ( (lv_constraint_2_0= ruleConstraintExpression ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:817:1: (lv_constraint_2_0= ruleConstraintExpression )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:817:1: (lv_constraint_2_0= ruleConstraintExpression )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:818:3: lv_constraint_2_0= ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFilterAccess().getConstraintConstraintExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_ruleFilter1751);
            lv_constraint_2_0=ruleConstraintExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFilterRule());
              	        }
                     		set(
                     			current, 
                     			"constraint",
                      		lv_constraint_2_0, 
                      		"ConstraintExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleConstraintExpression"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:842:1: entryRuleConstraintExpression returns [EObject current=null] : iv_ruleConstraintExpression= ruleConstraintExpression EOF ;
    public final EObject entryRuleConstraintExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintExpression = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:843:2: (iv_ruleConstraintExpression= ruleConstraintExpression EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:844:2: iv_ruleConstraintExpression= ruleConstraintExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_entryRuleConstraintExpression1787);
            iv_ruleConstraintExpression=ruleConstraintExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraintExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintExpression1797); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstraintExpression"


    // $ANTLR start "ruleConstraintExpression"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:851:1: ruleConstraintExpression returns [EObject current=null] : (this_BasicConstraint_0= ruleBasicConstraint ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= rulePropertyConstraint ) ) )? ) ;
    public final EObject ruleConstraintExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BasicConstraint_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:854:28: ( (this_BasicConstraint_0= ruleBasicConstraint ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= rulePropertyConstraint ) ) )? ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:855:1: (this_BasicConstraint_0= ruleBasicConstraint ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= rulePropertyConstraint ) ) )? )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:855:1: (this_BasicConstraint_0= ruleBasicConstraint ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= rulePropertyConstraint ) ) )? )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:856:5: this_BasicConstraint_0= ruleBasicConstraint ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= rulePropertyConstraint ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConstraintExpressionAccess().getBasicConstraintParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBasicConstraint_in_ruleConstraintExpression1844);
            this_BasicConstraint_0=ruleBasicConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BasicConstraint_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:864:1: ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= rulePropertyConstraint ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) && (synpred2_InternalConstraintLang())) {
                alt11=1;
            }
            else if ( (LA11_0==34) && (synpred2_InternalConstraintLang())) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:864:2: ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= rulePropertyConstraint ) )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:864:2: ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:864:3: ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:869:6: ( () ( (lv_operator_2_0= ruleLogicOperator ) ) )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:869:7: () ( (lv_operator_2_0= ruleLogicOperator ) )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:869:7: ()
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:870:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:875:2: ( (lv_operator_2_0= ruleLogicOperator ) )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:876:1: (lv_operator_2_0= ruleLogicOperator )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:876:1: (lv_operator_2_0= ruleLogicOperator )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:877:3: lv_operator_2_0= ruleLogicOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstraintExpressionAccess().getOperatorLogicOperatorEnumRuleCall_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicOperator_in_ruleConstraintExpression1893);
                    lv_operator_2_0=ruleLogicOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstraintExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"LogicOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }

                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:893:4: ( (lv_right_3_0= rulePropertyConstraint ) )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:894:1: (lv_right_3_0= rulePropertyConstraint )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:894:1: (lv_right_3_0= rulePropertyConstraint )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:895:3: lv_right_3_0= rulePropertyConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstraintExpressionAccess().getRightPropertyConstraintParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyConstraint_in_ruleConstraintExpression1916);
                    lv_right_3_0=rulePropertyConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstraintExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"PropertyConstraint");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConstraintExpression"


    // $ANTLR start "entryRuleBasicConstraint"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:919:1: entryRuleBasicConstraint returns [EObject current=null] : iv_ruleBasicConstraint= ruleBasicConstraint EOF ;
    public final EObject entryRuleBasicConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicConstraint = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:920:2: (iv_ruleBasicConstraint= ruleBasicConstraint EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:921:2: iv_ruleBasicConstraint= ruleBasicConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleBasicConstraint_in_entryRuleBasicConstraint1954);
            iv_ruleBasicConstraint=ruleBasicConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicConstraint1964); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBasicConstraint"


    // $ANTLR start "ruleBasicConstraint"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:928:1: ruleBasicConstraint returns [EObject current=null] : (this_ParenthesisConstraint_0= ruleParenthesisConstraint | this_Constraint_1= ruleConstraint ) ;
    public final EObject ruleBasicConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_ParenthesisConstraint_0 = null;

        EObject this_Constraint_1 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:931:28: ( (this_ParenthesisConstraint_0= ruleParenthesisConstraint | this_Constraint_1= ruleConstraint ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:932:1: (this_ParenthesisConstraint_0= ruleParenthesisConstraint | this_Constraint_1= ruleConstraint )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:932:1: (this_ParenthesisConstraint_0= ruleParenthesisConstraint | this_Constraint_1= ruleConstraint )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID||LA12_0==25) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:933:5: this_ParenthesisConstraint_0= ruleParenthesisConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicConstraintAccess().getParenthesisConstraintParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesisConstraint_in_ruleBasicConstraint2011);
                    this_ParenthesisConstraint_0=ruleParenthesisConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParenthesisConstraint_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:943:5: this_Constraint_1= ruleConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicConstraintAccess().getConstraintParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstraint_in_ruleBasicConstraint2038);
                    this_Constraint_1=ruleConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Constraint_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBasicConstraint"


    // $ANTLR start "entryRuleParenthesisConstraint"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:959:1: entryRuleParenthesisConstraint returns [EObject current=null] : iv_ruleParenthesisConstraint= ruleParenthesisConstraint EOF ;
    public final EObject entryRuleParenthesisConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesisConstraint = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:960:2: (iv_ruleParenthesisConstraint= ruleParenthesisConstraint EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:961:2: iv_ruleParenthesisConstraint= ruleParenthesisConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesisConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesisConstraint_in_entryRuleParenthesisConstraint2073);
            iv_ruleParenthesisConstraint=ruleParenthesisConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesisConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisConstraint2083); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParenthesisConstraint"


    // $ANTLR start "ruleParenthesisConstraint"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:968:1: ruleParenthesisConstraint returns [EObject current=null] : (otherlv_0= '(' ( (lv_constraint_1_0= ruleConstraintExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesisConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_constraint_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:971:28: ( (otherlv_0= '(' ( (lv_constraint_1_0= ruleConstraintExpression ) ) otherlv_2= ')' ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:972:1: (otherlv_0= '(' ( (lv_constraint_1_0= ruleConstraintExpression ) ) otherlv_2= ')' )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:972:1: (otherlv_0= '(' ( (lv_constraint_1_0= ruleConstraintExpression ) ) otherlv_2= ')' )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:972:3: otherlv_0= '(' ( (lv_constraint_1_0= ruleConstraintExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleParenthesisConstraint2120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesisConstraintAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:976:1: ( (lv_constraint_1_0= ruleConstraintExpression ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:977:1: (lv_constraint_1_0= ruleConstraintExpression )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:977:1: (lv_constraint_1_0= ruleConstraintExpression )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:978:3: lv_constraint_1_0= ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesisConstraintAccess().getConstraintConstraintExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_ruleParenthesisConstraint2141);
            lv_constraint_1_0=ruleConstraintExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParenthesisConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"constraint",
                      		lv_constraint_1_0, 
                      		"ConstraintExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleParenthesisConstraint2153); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParenthesisConstraintAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParenthesisConstraint"


    // $ANTLR start "entryRuleConstraint"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1006:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1007:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1008:2: iv_ruleConstraint= ruleConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint2189);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint2199); if (state.failed) return current;

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
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1015:1: ruleConstraint returns [EObject current=null] : ( ( (lv_typeSelection_0_0= ruleTypeSelection ) ) ( (lv_propertyConstraint_1_0= rulePropertyConstraint ) )? ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject lv_typeSelection_0_0 = null;

        EObject lv_propertyConstraint_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1018:28: ( ( ( (lv_typeSelection_0_0= ruleTypeSelection ) ) ( (lv_propertyConstraint_1_0= rulePropertyConstraint ) )? ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1019:1: ( ( (lv_typeSelection_0_0= ruleTypeSelection ) ) ( (lv_propertyConstraint_1_0= rulePropertyConstraint ) )? )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1019:1: ( ( (lv_typeSelection_0_0= ruleTypeSelection ) ) ( (lv_propertyConstraint_1_0= rulePropertyConstraint ) )? )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1019:2: ( (lv_typeSelection_0_0= ruleTypeSelection ) ) ( (lv_propertyConstraint_1_0= rulePropertyConstraint ) )?
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1019:2: ( (lv_typeSelection_0_0= ruleTypeSelection ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1020:1: (lv_typeSelection_0_0= ruleTypeSelection )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1020:1: (lv_typeSelection_0_0= ruleTypeSelection )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1021:3: lv_typeSelection_0_0= ruleTypeSelection
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstraintAccess().getTypeSelectionTypeSelectionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeSelection_in_ruleConstraint2245);
            lv_typeSelection_0_0=ruleTypeSelection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"typeSelection",
                      		lv_typeSelection_0_0, 
                      		"TypeSelection");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1037:2: ( (lv_propertyConstraint_1_0= rulePropertyConstraint ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1038:1: (lv_propertyConstraint_1_0= rulePropertyConstraint )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1038:1: (lv_propertyConstraint_1_0= rulePropertyConstraint )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1039:3: lv_propertyConstraint_1_0= rulePropertyConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstraintAccess().getPropertyConstraintPropertyConstraintParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyConstraint_in_ruleConstraint2266);
                    lv_propertyConstraint_1_0=rulePropertyConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"propertyConstraint",
                              		lv_propertyConstraint_1_0, 
                              		"PropertyConstraint");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRulePropertyConstraint"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1063:1: entryRulePropertyConstraint returns [EObject current=null] : iv_rulePropertyConstraint= rulePropertyConstraint EOF ;
    public final EObject entryRulePropertyConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyConstraint = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1064:2: (iv_rulePropertyConstraint= rulePropertyConstraint EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1065:2: iv_rulePropertyConstraint= rulePropertyConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyConstraintRule()); 
            }
            pushFollow(FOLLOW_rulePropertyConstraint_in_entryRulePropertyConstraint2303);
            iv_rulePropertyConstraint=rulePropertyConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyConstraint2313); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyConstraint"


    // $ANTLR start "rulePropertyConstraint"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1072:1: rulePropertyConstraint returns [EObject current=null] : (this_BasicPropertyConstraint_0= ruleBasicPropertyConstraint ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= rulePropertyConstraint ) ) )? ) ;
    public final EObject rulePropertyConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_BasicPropertyConstraint_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1075:28: ( (this_BasicPropertyConstraint_0= ruleBasicPropertyConstraint ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= rulePropertyConstraint ) ) )? ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1076:1: (this_BasicPropertyConstraint_0= ruleBasicPropertyConstraint ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= rulePropertyConstraint ) ) )? )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1076:1: (this_BasicPropertyConstraint_0= ruleBasicPropertyConstraint ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= rulePropertyConstraint ) ) )? )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1077:5: this_BasicPropertyConstraint_0= ruleBasicPropertyConstraint ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= rulePropertyConstraint ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPropertyConstraintAccess().getBasicPropertyConstraintParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBasicPropertyConstraint_in_rulePropertyConstraint2360);
            this_BasicPropertyConstraint_0=ruleBasicPropertyConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BasicPropertyConstraint_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1085:1: ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= rulePropertyConstraint ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                int LA14_1 = input.LA(2);

                if ( (synpred3_InternalConstraintLang()) ) {
                    alt14=1;
                }
            }
            else if ( (LA14_0==34) ) {
                int LA14_2 = input.LA(2);

                if ( (synpred3_InternalConstraintLang()) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1085:2: ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= rulePropertyConstraint ) )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1085:2: ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1085:3: ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1090:6: ( () ( (lv_operator_2_0= ruleLogicOperator ) ) )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1090:7: () ( (lv_operator_2_0= ruleLogicOperator ) )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1090:7: ()
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1091:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPropertyConstraintAccess().getPropertyConstraintLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1096:2: ( (lv_operator_2_0= ruleLogicOperator ) )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1097:1: (lv_operator_2_0= ruleLogicOperator )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1097:1: (lv_operator_2_0= ruleLogicOperator )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1098:3: lv_operator_2_0= ruleLogicOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyConstraintAccess().getOperatorLogicOperatorEnumRuleCall_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicOperator_in_rulePropertyConstraint2409);
                    lv_operator_2_0=ruleLogicOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"LogicOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }

                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1114:4: ( (lv_right_3_0= rulePropertyConstraint ) )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1115:1: (lv_right_3_0= rulePropertyConstraint )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1115:1: (lv_right_3_0= rulePropertyConstraint )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1116:3: lv_right_3_0= rulePropertyConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyConstraintAccess().getRightPropertyConstraintParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyConstraint_in_rulePropertyConstraint2432);
                    lv_right_3_0=rulePropertyConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"PropertyConstraint");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropertyConstraint"


    // $ANTLR start "entryRuleBasicPropertyConstraint"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1140:1: entryRuleBasicPropertyConstraint returns [EObject current=null] : iv_ruleBasicPropertyConstraint= ruleBasicPropertyConstraint EOF ;
    public final EObject entryRuleBasicPropertyConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicPropertyConstraint = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1141:2: (iv_ruleBasicPropertyConstraint= ruleBasicPropertyConstraint EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1142:2: iv_ruleBasicPropertyConstraint= ruleBasicPropertyConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicPropertyConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleBasicPropertyConstraint_in_entryRuleBasicPropertyConstraint2470);
            iv_ruleBasicPropertyConstraint=ruleBasicPropertyConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicPropertyConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicPropertyConstraint2480); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBasicPropertyConstraint"


    // $ANTLR start "ruleBasicPropertyConstraint"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1149:1: ruleBasicPropertyConstraint returns [EObject current=null] : (this_PropertyParenthesisConstraint_0= rulePropertyParenthesisConstraint | this_PropertyValueConstraint_1= rulePropertyValueConstraint ) ;
    public final EObject ruleBasicPropertyConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyParenthesisConstraint_0 = null;

        EObject this_PropertyValueConstraint_1 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1152:28: ( (this_PropertyParenthesisConstraint_0= rulePropertyParenthesisConstraint | this_PropertyValueConstraint_1= rulePropertyValueConstraint ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1153:1: (this_PropertyParenthesisConstraint_0= rulePropertyParenthesisConstraint | this_PropertyValueConstraint_1= rulePropertyValueConstraint )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1153:1: (this_PropertyParenthesisConstraint_0= rulePropertyParenthesisConstraint | this_PropertyValueConstraint_1= rulePropertyValueConstraint )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1154:5: this_PropertyParenthesisConstraint_0= rulePropertyParenthesisConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicPropertyConstraintAccess().getPropertyParenthesisConstraintParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePropertyParenthesisConstraint_in_ruleBasicPropertyConstraint2527);
                    this_PropertyParenthesisConstraint_0=rulePropertyParenthesisConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PropertyParenthesisConstraint_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1164:5: this_PropertyValueConstraint_1= rulePropertyValueConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicPropertyConstraintAccess().getPropertyValueConstraintParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePropertyValueConstraint_in_ruleBasicPropertyConstraint2554);
                    this_PropertyValueConstraint_1=rulePropertyValueConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PropertyValueConstraint_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBasicPropertyConstraint"


    // $ANTLR start "entryRulePropertyParenthesisConstraint"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1180:1: entryRulePropertyParenthesisConstraint returns [EObject current=null] : iv_rulePropertyParenthesisConstraint= rulePropertyParenthesisConstraint EOF ;
    public final EObject entryRulePropertyParenthesisConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyParenthesisConstraint = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1181:2: (iv_rulePropertyParenthesisConstraint= rulePropertyParenthesisConstraint EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1182:2: iv_rulePropertyParenthesisConstraint= rulePropertyParenthesisConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyParenthesisConstraintRule()); 
            }
            pushFollow(FOLLOW_rulePropertyParenthesisConstraint_in_entryRulePropertyParenthesisConstraint2589);
            iv_rulePropertyParenthesisConstraint=rulePropertyParenthesisConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyParenthesisConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyParenthesisConstraint2599); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyParenthesisConstraint"


    // $ANTLR start "rulePropertyParenthesisConstraint"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1189:1: rulePropertyParenthesisConstraint returns [EObject current=null] : (otherlv_0= '(' ( (lv_constraint_1_0= rulePropertyConstraint ) ) otherlv_2= ')' ) ;
    public final EObject rulePropertyParenthesisConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_constraint_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1192:28: ( (otherlv_0= '(' ( (lv_constraint_1_0= rulePropertyConstraint ) ) otherlv_2= ')' ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1193:1: (otherlv_0= '(' ( (lv_constraint_1_0= rulePropertyConstraint ) ) otherlv_2= ')' )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1193:1: (otherlv_0= '(' ( (lv_constraint_1_0= rulePropertyConstraint ) ) otherlv_2= ')' )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1193:3: otherlv_0= '(' ( (lv_constraint_1_0= rulePropertyConstraint ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_rulePropertyParenthesisConstraint2636); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPropertyParenthesisConstraintAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1197:1: ( (lv_constraint_1_0= rulePropertyConstraint ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1198:1: (lv_constraint_1_0= rulePropertyConstraint )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1198:1: (lv_constraint_1_0= rulePropertyConstraint )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1199:3: lv_constraint_1_0= rulePropertyConstraint
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyParenthesisConstraintAccess().getConstraintPropertyConstraintParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyConstraint_in_rulePropertyParenthesisConstraint2657);
            lv_constraint_1_0=rulePropertyConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyParenthesisConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"constraint",
                      		lv_constraint_1_0, 
                      		"PropertyConstraint");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_rulePropertyParenthesisConstraint2669); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPropertyParenthesisConstraintAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropertyParenthesisConstraint"


    // $ANTLR start "entryRulePropertyValueConstraint"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1227:1: entryRulePropertyValueConstraint returns [EObject current=null] : iv_rulePropertyValueConstraint= rulePropertyValueConstraint EOF ;
    public final EObject entryRulePropertyValueConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValueConstraint = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1228:2: (iv_rulePropertyValueConstraint= rulePropertyValueConstraint EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1229:2: iv_rulePropertyValueConstraint= rulePropertyValueConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValueConstraintRule()); 
            }
            pushFollow(FOLLOW_rulePropertyValueConstraint_in_entryRulePropertyValueConstraint2705);
            iv_rulePropertyValueConstraint=rulePropertyValueConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValueConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValueConstraint2715); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyValueConstraint"


    // $ANTLR start "rulePropertyValueConstraint"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1236:1: rulePropertyValueConstraint returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_comparator_1_0= ruleComparator ) ) ( (lv_value_2_0= ruleLiteral ) ) ) ;
    public final EObject rulePropertyValueConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_comparator_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1239:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_comparator_1_0= ruleComparator ) ) ( (lv_value_2_0= ruleLiteral ) ) ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1240:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_comparator_1_0= ruleComparator ) ) ( (lv_value_2_0= ruleLiteral ) ) )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1240:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_comparator_1_0= ruleComparator ) ) ( (lv_value_2_0= ruleLiteral ) ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1240:2: ( (otherlv_0= RULE_ID ) ) ( (lv_comparator_1_0= ruleComparator ) ) ( (lv_value_2_0= ruleLiteral ) )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1240:2: ( (otherlv_0= RULE_ID ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1241:1: (otherlv_0= RULE_ID )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1241:1: (otherlv_0= RULE_ID )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1242:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyValueConstraintRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyValueConstraint2760); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getPropertyValueConstraintAccess().getPropertyPropertyCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1253:2: ( (lv_comparator_1_0= ruleComparator ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1254:1: (lv_comparator_1_0= ruleComparator )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1254:1: (lv_comparator_1_0= ruleComparator )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1255:3: lv_comparator_1_0= ruleComparator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValueConstraintAccess().getComparatorComparatorEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleComparator_in_rulePropertyValueConstraint2781);
            lv_comparator_1_0=ruleComparator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyValueConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"comparator",
                      		lv_comparator_1_0, 
                      		"Comparator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1271:2: ( (lv_value_2_0= ruleLiteral ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1272:1: (lv_value_2_0= ruleLiteral )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1272:1: (lv_value_2_0= ruleLiteral )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1273:3: lv_value_2_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValueConstraintAccess().getValueLiteralParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_rulePropertyValueConstraint2802);
            lv_value_2_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyValueConstraintRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Literal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropertyValueConstraint"


    // $ANTLR start "entryRuleTypeSelection"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1297:1: entryRuleTypeSelection returns [EObject current=null] : iv_ruleTypeSelection= ruleTypeSelection EOF ;
    public final EObject entryRuleTypeSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSelection = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1298:2: (iv_ruleTypeSelection= ruleTypeSelection EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1299:2: iv_ruleTypeSelection= ruleTypeSelection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeSelectionRule()); 
            }
            pushFollow(FOLLOW_ruleTypeSelection_in_entryRuleTypeSelection2838);
            iv_ruleTypeSelection=ruleTypeSelection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeSelection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeSelection2848); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeSelection"


    // $ANTLR start "ruleTypeSelection"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1306:1: ruleTypeSelection returns [EObject current=null] : (this_ConcreteType_0= ruleConcreteType | this_TemplateTypeSelection_1= ruleTemplateTypeSelection | this_RecordTypeSelection_2= ruleRecordTypeSelection ) ;
    public final EObject ruleTypeSelection() throws RecognitionException {
        EObject current = null;

        EObject this_ConcreteType_0 = null;

        EObject this_TemplateTypeSelection_1 = null;

        EObject this_RecordTypeSelection_2 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1309:28: ( (this_ConcreteType_0= ruleConcreteType | this_TemplateTypeSelection_1= ruleTemplateTypeSelection | this_RecordTypeSelection_2= ruleRecordTypeSelection ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1310:1: (this_ConcreteType_0= ruleConcreteType | this_TemplateTypeSelection_1= ruleTemplateTypeSelection | this_RecordTypeSelection_2= ruleRecordTypeSelection )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1310:1: (this_ConcreteType_0= ruleConcreteType | this_TemplateTypeSelection_1= ruleTemplateTypeSelection | this_RecordTypeSelection_2= ruleRecordTypeSelection )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==25) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==26) ) {
                    alt16=2;
                }
                else if ( ((LA16_2>=31 && LA16_2<=32)) ) {
                    alt16=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1311:5: this_ConcreteType_0= ruleConcreteType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeSelectionAccess().getConcreteTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConcreteType_in_ruleTypeSelection2895);
                    this_ConcreteType_0=ruleConcreteType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConcreteType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1321:5: this_TemplateTypeSelection_1= ruleTemplateTypeSelection
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeSelectionAccess().getTemplateTypeSelectionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTemplateTypeSelection_in_ruleTypeSelection2922);
                    this_TemplateTypeSelection_1=ruleTemplateTypeSelection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TemplateTypeSelection_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1331:5: this_RecordTypeSelection_2= ruleRecordTypeSelection
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeSelectionAccess().getRecordTypeSelectionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRecordTypeSelection_in_ruleTypeSelection2949);
                    this_RecordTypeSelection_2=ruleRecordTypeSelection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RecordTypeSelection_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeSelection"


    // $ANTLR start "entryRuleConcreteType"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1347:1: entryRuleConcreteType returns [EObject current=null] : iv_ruleConcreteType= ruleConcreteType EOF ;
    public final EObject entryRuleConcreteType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteType = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1348:2: (iv_ruleConcreteType= ruleConcreteType EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1349:2: iv_ruleConcreteType= ruleConcreteType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConcreteTypeRule()); 
            }
            pushFollow(FOLLOW_ruleConcreteType_in_entryRuleConcreteType2984);
            iv_ruleConcreteType=ruleConcreteType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConcreteType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcreteType2994); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConcreteType"


    // $ANTLR start "ruleConcreteType"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1356:1: ruleConcreteType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleConcreteType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1359:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1360:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1360:1: ( (otherlv_0= RULE_ID ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1361:1: (otherlv_0= RULE_ID )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1361:1: (otherlv_0= RULE_ID )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1362:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConcreteTypeRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConcreteType3038); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getConcreteTypeAccess().getTypeTypeCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConcreteType"


    // $ANTLR start "entryRuleTemplateTypeSelection"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1381:1: entryRuleTemplateTypeSelection returns [EObject current=null] : iv_ruleTemplateTypeSelection= ruleTemplateTypeSelection EOF ;
    public final EObject entryRuleTemplateTypeSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateTypeSelection = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1382:2: (iv_ruleTemplateTypeSelection= ruleTemplateTypeSelection EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1383:2: iv_ruleTemplateTypeSelection= ruleTemplateTypeSelection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateTypeSelectionRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateTypeSelection_in_entryRuleTemplateTypeSelection3073);
            iv_ruleTemplateTypeSelection=ruleTemplateTypeSelection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateTypeSelection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateTypeSelection3083); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTemplateTypeSelection"


    // $ANTLR start "ruleTemplateTypeSelection"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1390:1: ruleTemplateTypeSelection returns [EObject current=null] : (otherlv_0= '?' otherlv_1= 'uses' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* ) ;
    public final EObject ruleTemplateTypeSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1393:28: ( (otherlv_0= '?' otherlv_1= 'uses' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1394:1: (otherlv_0= '?' otherlv_1= 'uses' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1394:1: (otherlv_0= '?' otherlv_1= 'uses' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1394:3: otherlv_0= '?' otherlv_1= 'uses' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleTemplateTypeSelection3120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTemplateTypeSelectionAccess().getQuestionMarkKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleTemplateTypeSelection3132); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTemplateTypeSelectionAccess().getUsesKeyword_1());
                  
            }
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1402:1: ( (otherlv_2= RULE_ID ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1403:1: (otherlv_2= RULE_ID )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1403:1: (otherlv_2= RULE_ID )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1404:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTemplateTypeSelectionRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateTypeSelection3152); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getTemplateTypeSelectionAccess().getTypesTemplateTypeCrossReference_2_0()); 
              	
            }

            }


            }

            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1415:2: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==17) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1415:4: otherlv_3= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleTemplateTypeSelection3165); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTemplateTypeSelectionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1419:1: ( ( ruleQualifiedName ) )
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1420:1: ( ruleQualifiedName )
            	    {
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1420:1: ( ruleQualifiedName )
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1421:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getTemplateTypeSelectionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTemplateTypeSelectionAccess().getTypesTemplateTypeCrossReference_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTemplateTypeSelection3188);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTemplateTypeSelection"


    // $ANTLR start "entryRuleRecordTypeSelection"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1442:1: entryRuleRecordTypeSelection returns [EObject current=null] : iv_ruleRecordTypeSelection= ruleRecordTypeSelection EOF ;
    public final EObject entryRuleRecordTypeSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTypeSelection = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1443:2: (iv_ruleRecordTypeSelection= ruleRecordTypeSelection EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1444:2: iv_ruleRecordTypeSelection= ruleRecordTypeSelection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecordTypeSelectionRule()); 
            }
            pushFollow(FOLLOW_ruleRecordTypeSelection_in_entryRuleRecordTypeSelection3226);
            iv_ruleRecordTypeSelection=ruleRecordTypeSelection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecordTypeSelection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordTypeSelection3236); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRecordTypeSelection"


    // $ANTLR start "ruleRecordTypeSelection"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1451:1: ruleRecordTypeSelection returns [EObject current=null] : (otherlv_0= '?' ( (lv_modifier_1_0= ruleRecordTypeModifier ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleRecordTypeSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_modifier_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1454:28: ( (otherlv_0= '?' ( (lv_modifier_1_0= ruleRecordTypeModifier ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1455:1: (otherlv_0= '?' ( (lv_modifier_1_0= ruleRecordTypeModifier ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1455:1: (otherlv_0= '?' ( (lv_modifier_1_0= ruleRecordTypeModifier ) ) ( (otherlv_2= RULE_ID ) ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1455:3: otherlv_0= '?' ( (lv_modifier_1_0= ruleRecordTypeModifier ) ) ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleRecordTypeSelection3273); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRecordTypeSelectionAccess().getQuestionMarkKeyword_0());
                  
            }
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1459:1: ( (lv_modifier_1_0= ruleRecordTypeModifier ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1460:1: (lv_modifier_1_0= ruleRecordTypeModifier )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1460:1: (lv_modifier_1_0= ruleRecordTypeModifier )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1461:3: lv_modifier_1_0= ruleRecordTypeModifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRecordTypeSelectionAccess().getModifierRecordTypeModifierEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleRecordTypeModifier_in_ruleRecordTypeSelection3294);
            lv_modifier_1_0=ruleRecordTypeModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRecordTypeSelectionRule());
              	        }
                     		set(
                     			current, 
                     			"modifier",
                      		lv_modifier_1_0, 
                      		"RecordTypeModifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1477:2: ( (otherlv_2= RULE_ID ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1478:1: (otherlv_2= RULE_ID )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1478:1: (otherlv_2= RULE_ID )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1479:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRecordTypeSelectionRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecordTypeSelection3314); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getRecordTypeSelectionAccess().getTypeRecordTypeCrossReference_2_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRecordTypeSelection"


    // $ANTLR start "entryRuleLiteral"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1498:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1499:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1500:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral3350);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral3360); if (state.failed) return current;

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
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1507:1: ruleLiteral returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ArrayLiteral_4= ruleArrayLiteral | this_BuiltInValueLiteral_5= ruleBuiltInValueLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_FloatLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;

        EObject this_ArrayLiteral_4 = null;

        EObject this_BuiltInValueLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1510:28: ( (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ArrayLiteral_4= ruleArrayLiteral | this_BuiltInValueLiteral_5= ruleBuiltInValueLiteral ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1511:1: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ArrayLiteral_4= ruleArrayLiteral | this_BuiltInValueLiteral_5= ruleBuiltInValueLiteral )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1511:1: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ArrayLiteral_4= ruleArrayLiteral | this_BuiltInValueLiteral_5= ruleBuiltInValueLiteral )
            int alt18=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt18=1;
                }
                break;
            case RULE_INT:
                {
                alt18=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt18=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt18=4;
                }
                break;
            case 27:
                {
                alt18=5;
                }
                break;
            case 29:
                {
                alt18=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1512:5: this_StringLiteral_0= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral3407);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1522:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral3434);
                    this_IntLiteral_1=ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1532:5: this_FloatLiteral_2= ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatLiteral_in_ruleLiteral3461);
                    this_FloatLiteral_2=ruleFloatLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FloatLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1542:5: this_BooleanLiteral_3= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral3488);
                    this_BooleanLiteral_3=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1552:5: this_ArrayLiteral_4= ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getArrayLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayLiteral_in_ruleLiteral3515);
                    this_ArrayLiteral_4=ruleArrayLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArrayLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1562:5: this_BuiltInValueLiteral_5= ruleBuiltInValueLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBuiltInValueLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBuiltInValueLiteral_in_ruleLiteral3542);
                    this_BuiltInValueLiteral_5=ruleBuiltInValueLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BuiltInValueLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleArrayLiteral"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1578:1: entryRuleArrayLiteral returns [EObject current=null] : iv_ruleArrayLiteral= ruleArrayLiteral EOF ;
    public final EObject entryRuleArrayLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayLiteral = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1579:2: (iv_ruleArrayLiteral= ruleArrayLiteral EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1580:2: iv_ruleArrayLiteral= ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral3577);
            iv_ruleArrayLiteral=ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLiteral3587); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayLiteral"


    // $ANTLR start "ruleArrayLiteral"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1587:1: ruleArrayLiteral returns [EObject current=null] : (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleArrayLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_literals_1_0 = null;

        EObject lv_literals_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1590:28: ( (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1591:1: (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1591:1: (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1591:3: otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleArrayLiteral3624); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayLiteralAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1595:1: ( (lv_literals_1_0= ruleLiteral ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1596:1: (lv_literals_1_0= ruleLiteral )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1596:1: (lv_literals_1_0= ruleLiteral )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1597:3: lv_literals_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_ruleArrayLiteral3645);
            lv_literals_1_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayLiteralRule());
              	        }
                     		add(
                     			current, 
                     			"literals",
                      		lv_literals_1_0, 
                      		"Literal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1613:2: (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==17) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1613:4: otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleArrayLiteral3658); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1617:1: ( (lv_literals_3_0= ruleLiteral ) )
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1618:1: (lv_literals_3_0= ruleLiteral )
            	    {
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1618:1: (lv_literals_3_0= ruleLiteral )
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1619:3: lv_literals_3_0= ruleLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLiteral_in_ruleArrayLiteral3679);
            	    lv_literals_3_0=ruleLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArrayLiteralRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"literals",
            	              		lv_literals_3_0, 
            	              		"Literal");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleArrayLiteral3693); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getArrayLiteralAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArrayLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1647:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1648:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1649:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3729);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral3739); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1656:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1659:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1660:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1660:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1661:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1661:1: (lv_value_0_0= RULE_STRING )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1662:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral3780); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1686:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1687:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1688:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral3820);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral3830); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1695:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1698:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1699:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1699:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1700:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1700:1: (lv_value_0_0= RULE_INT )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1701:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral3871); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"INT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleFloatLiteral"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1725:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLiteral = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1726:2: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1727:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral3911);
            iv_ruleFloatLiteral=ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatLiteral3921); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFloatLiteral"


    // $ANTLR start "ruleFloatLiteral"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1734:1: ruleFloatLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1737:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1738:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1738:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1739:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1739:1: (lv_value_0_0= RULE_FLOAT )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1740:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatLiteral3962); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFloatLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"FLOAT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFloatLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1764:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1765:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1766:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral4002);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral4012); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1773:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1776:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1777:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1777:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1778:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1778:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1779:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBooleanLiteral4053); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"BOOLEAN");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleBuiltInValueLiteral"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1803:1: entryRuleBuiltInValueLiteral returns [EObject current=null] : iv_ruleBuiltInValueLiteral= ruleBuiltInValueLiteral EOF ;
    public final EObject entryRuleBuiltInValueLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltInValueLiteral = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1804:2: (iv_ruleBuiltInValueLiteral= ruleBuiltInValueLiteral EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1805:2: iv_ruleBuiltInValueLiteral= ruleBuiltInValueLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBuiltInValueLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltInValueLiteral_in_entryRuleBuiltInValueLiteral4093);
            iv_ruleBuiltInValueLiteral=ruleBuiltInValueLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBuiltInValueLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInValueLiteral4103); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBuiltInValueLiteral"


    // $ANTLR start "ruleBuiltInValueLiteral"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1812:1: ruleBuiltInValueLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= 'KIEKER_VERSION' ) ) ) ;
    public final EObject ruleBuiltInValueLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1815:28: ( ( () ( (lv_value_1_0= 'KIEKER_VERSION' ) ) ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1816:1: ( () ( (lv_value_1_0= 'KIEKER_VERSION' ) ) )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1816:1: ( () ( (lv_value_1_0= 'KIEKER_VERSION' ) ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1816:2: () ( (lv_value_1_0= 'KIEKER_VERSION' ) )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1816:2: ()
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1817:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBuiltInValueLiteralAccess().getBuiltInValueLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1822:2: ( (lv_value_1_0= 'KIEKER_VERSION' ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1823:1: (lv_value_1_0= 'KIEKER_VERSION' )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1823:1: (lv_value_1_0= 'KIEKER_VERSION' )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1824:3: lv_value_1_0= 'KIEKER_VERSION'
            {
            lv_value_1_0=(Token)match(input,29,FOLLOW_29_in_ruleBuiltInValueLiteral4155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_value_1_0, grammarAccess.getBuiltInValueLiteralAccess().getValueKIEKER_VERSIONKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBuiltInValueLiteralRule());
              	        }
                     		setWithLastConsumed(current, "value", lv_value_1_0, "KIEKER_VERSION");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBuiltInValueLiteral"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1845:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1846:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1847:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4205);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName4216); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1854:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1857:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1858:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1858:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1858:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4256); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1865:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==23) ) {
                    int LA20_2 = input.LA(2);

                    if ( (LA20_2==RULE_ID) && (synpred4_InternalConstraintLang())) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1865:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1865:2: ( ( '.' )=>kw= '.' )
            	    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1865:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,23,FOLLOW_23_in_ruleQualifiedName4284); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4300); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1888:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1889:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1890:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard4348);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard4359); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1897:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1900:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1901:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1901:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1902:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard4406);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1912:1: (kw= '.' kw= '*' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1913:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleQualifiedNameWithWildcard4425); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleQualifiedNameWithWildcard4438); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "ruleRecordTypeModifier"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1932:1: ruleRecordTypeModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'extends' ) ) ;
    public final Enumerator ruleRecordTypeModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1934:28: ( ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'extends' ) ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1935:1: ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'extends' ) )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1935:1: ( (enumLiteral_0= 'super' ) | (enumLiteral_1= 'extends' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            else if ( (LA22_0==32) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1935:2: (enumLiteral_0= 'super' )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1935:2: (enumLiteral_0= 'super' )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1935:4: enumLiteral_0= 'super'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_31_in_ruleRecordTypeModifier4494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRecordTypeModifierAccess().getSUPEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRecordTypeModifierAccess().getSUPEREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1941:6: (enumLiteral_1= 'extends' )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1941:6: (enumLiteral_1= 'extends' )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1941:8: enumLiteral_1= 'extends'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_32_in_ruleRecordTypeModifier4511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRecordTypeModifierAccess().getEXTENDSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRecordTypeModifierAccess().getEXTENDSEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRecordTypeModifier"


    // $ANTLR start "ruleLogicOperator"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1951:1: ruleLogicOperator returns [Enumerator current=null] : ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) ;
    public final Enumerator ruleLogicOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1953:28: ( ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1954:1: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1954:1: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            else if ( (LA23_0==34) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1954:2: (enumLiteral_0= '&' )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1954:2: (enumLiteral_0= '&' )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1954:4: enumLiteral_0= '&'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_33_in_ruleLogicOperator4556); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1960:6: (enumLiteral_1= '|' )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1960:6: (enumLiteral_1= '|' )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1960:8: enumLiteral_1= '|'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_34_in_ruleLogicOperator4573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLogicOperator"


    // $ANTLR start "ruleComparator"
    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1970:1: ruleComparator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '~' ) ) ;
    public final Enumerator ruleComparator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

         enterRule(); 
        try {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1972:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '~' ) ) )
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1973:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '~' ) )
            {
            // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1973:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '~' ) )
            int alt24=7;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt24=1;
                }
                break;
            case 36:
                {
                alt24=2;
                }
                break;
            case 37:
                {
                alt24=3;
                }
                break;
            case 38:
                {
                alt24=4;
                }
                break;
            case 39:
                {
                alt24=5;
                }
                break;
            case 40:
                {
                alt24=6;
                }
                break;
            case 41:
                {
                alt24=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1973:2: (enumLiteral_0= '==' )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1973:2: (enumLiteral_0= '==' )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1973:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_35_in_ruleComparator4618); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getComparatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1979:6: (enumLiteral_1= '!=' )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1979:6: (enumLiteral_1= '!=' )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1979:8: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_36_in_ruleComparator4635); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparatorAccess().getNEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getComparatorAccess().getNEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1985:6: (enumLiteral_2= '>' )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1985:6: (enumLiteral_2= '>' )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1985:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_37_in_ruleComparator4652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparatorAccess().getGREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getComparatorAccess().getGREnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1991:6: (enumLiteral_3= '<' )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1991:6: (enumLiteral_3= '<' )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1991:8: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_38_in_ruleComparator4669); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparatorAccess().getLWEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getComparatorAccess().getLWEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1997:6: (enumLiteral_4= '>=' )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1997:6: (enumLiteral_4= '>=' )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1997:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,39,FOLLOW_39_in_ruleComparator4686); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparatorAccess().getGEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getComparatorAccess().getGEEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:2003:6: (enumLiteral_5= '<=' )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:2003:6: (enumLiteral_5= '<=' )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:2003:8: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,40,FOLLOW_40_in_ruleComparator4703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparatorAccess().getLEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getComparatorAccess().getLEEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:2009:6: (enumLiteral_6= '~' )
                    {
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:2009:6: (enumLiteral_6= '~' )
                    // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:2009:8: enumLiteral_6= '~'
                    {
                    enumLiteral_6=(Token)match(input,41,FOLLOW_41_in_ruleComparator4720); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparatorAccess().getLIKEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getComparatorAccess().getLIKEEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleComparator"

    // $ANTLR start synpred1_InternalConstraintLang
    public final void synpred1_InternalConstraintLang_fragment() throws RecognitionException {   
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:473:3: ( ( () ( ( ruleLogicOperator ) ) ) )
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:473:4: ( () ( ( ruleLogicOperator ) ) )
        {
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:473:4: ( () ( ( ruleLogicOperator ) ) )
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:473:5: () ( ( ruleLogicOperator ) )
        {
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:473:5: ()
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:474:1: 
        {
        }

        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:474:2: ( ( ruleLogicOperator ) )
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:475:1: ( ruleLogicOperator )
        {
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:475:1: ( ruleLogicOperator )
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:476:1: ruleLogicOperator
        {
        pushFollow(FOLLOW_ruleLogicOperator_in_synpred1_InternalConstraintLang956);
        ruleLogicOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalConstraintLang

    // $ANTLR start synpred2_InternalConstraintLang
    public final void synpred2_InternalConstraintLang_fragment() throws RecognitionException {   
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:864:3: ( ( () ( ( ruleLogicOperator ) ) ) )
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:864:4: ( () ( ( ruleLogicOperator ) ) )
        {
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:864:4: ( () ( ( ruleLogicOperator ) ) )
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:864:5: () ( ( ruleLogicOperator ) )
        {
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:864:5: ()
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:865:1: 
        {
        }

        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:865:2: ( ( ruleLogicOperator ) )
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:866:1: ( ruleLogicOperator )
        {
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:866:1: ( ruleLogicOperator )
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:867:1: ruleLogicOperator
        {
        pushFollow(FOLLOW_ruleLogicOperator_in_synpred2_InternalConstraintLang1863);
        ruleLogicOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalConstraintLang

    // $ANTLR start synpred3_InternalConstraintLang
    public final void synpred3_InternalConstraintLang_fragment() throws RecognitionException {   
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1085:3: ( ( () ( ( ruleLogicOperator ) ) ) )
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1085:4: ( () ( ( ruleLogicOperator ) ) )
        {
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1085:4: ( () ( ( ruleLogicOperator ) ) )
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1085:5: () ( ( ruleLogicOperator ) )
        {
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1085:5: ()
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1086:1: 
        {
        }

        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1086:2: ( ( ruleLogicOperator ) )
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1087:1: ( ruleLogicOperator )
        {
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1087:1: ( ruleLogicOperator )
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1088:1: ruleLogicOperator
        {
        pushFollow(FOLLOW_ruleLogicOperator_in_synpred3_InternalConstraintLang2379);
        ruleLogicOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalConstraintLang

    // $ANTLR start synpred4_InternalConstraintLang
    public final void synpred4_InternalConstraintLang_fragment() throws RecognitionException {   
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1865:3: ( '.' )
        // ../org.iobserve.rac.constraint/src-gen/org/iobserve/rac/constraint/parser/antlr/internal/InternalConstraintLang.g:1866:2: '.'
        {
        match(input,23,FOLLOW_23_in_synpred4_InternalConstraintLang4275); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalConstraintLang

    // Delegated rules

    public final boolean synpred2_InternalConstraintLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalConstraintLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalConstraintLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalConstraintLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalConstraintLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalConstraintLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalConstraintLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalConstraintLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModel143 = new BitSet(new long[]{0x0000000001018002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel164 = new BitSet(new long[]{0x0000000001018002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleModel186 = new BitSet(new long[]{0x0000000001010002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImport270 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilter_in_ruleOperation384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_ruleOperation411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_entryRuleSelection446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelection456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSelection493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSelectInput_in_ruleSelection514 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleSelection527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSelectInput_in_ruleSelection548 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleSelection562 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelection582 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSelection594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelection614 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSelection626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_ruleSelection647 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_17_in_ruleSelection660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_ruleSelection681 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_21_in_ruleSelection695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectInput_in_entryRuleSelectInput731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectInput741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectInput786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectInput803 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleSelectInput821 = new BitSet(new long[]{0x00000000281001F0L});
    public static final BitSet FOLLOW_ruleSelectConstaintExpression_in_ruleSelectInput842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstaintExpression_in_entryRuleSelectConstaintExpression880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectConstaintExpression890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicSelectConstraint_in_ruleSelectConstaintExpression937 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_ruleSelectConstaintExpression986 = new BitSet(new long[]{0x00000000281001F0L});
    public static final BitSet FOLLOW_ruleSelectConstaintExpression_in_ruleSelectConstaintExpression1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicSelectConstraint_in_entryRuleBasicSelectConstraint1047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicSelectConstraint1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisSelectConstraint_in_ruleBasicSelectConstraint1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstraint_in_ruleBasicSelectConstraint1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisSelectConstraint_in_entryRuleParenthesisSelectConstraint1166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisSelectConstraint1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleParenthesisSelectConstraint1213 = new BitSet(new long[]{0x00000000281001F0L});
    public static final BitSet FOLLOW_ruleSelectConstaintExpression_in_ruleParenthesisSelectConstraint1234 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleParenthesisSelectConstraint1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstraint_in_entryRuleSelectConstraint1282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectConstraint1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperand_in_ruleSelectConstraint1338 = new BitSet(new long[]{0x000003F800000000L});
    public static final BitSet FOLLOW_ruleComparator_in_ruleSelectConstraint1359 = new BitSet(new long[]{0x00000000281001F0L});
    public static final BitSet FOLLOW_ruleCompareOperand_in_ruleSelectConstraint1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperand_in_entryRuleCompareOperand1416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperand1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_ruleCompareOperand1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleCompareOperand1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_entryRuleParameterExpression1535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterExpression1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterExpression1591 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleParameterExpression1603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterExpression1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilter_in_entryRuleFilter1661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilter1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleFilter1708 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFilter1725 = new BitSet(new long[]{0x0000000002100010L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_ruleFilter1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_entryRuleConstraintExpression1787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintExpression1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicConstraint_in_ruleConstraintExpression1844 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_ruleConstraintExpression1893 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rulePropertyConstraint_in_ruleConstraintExpression1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicConstraint_in_entryRuleBasicConstraint1954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicConstraint1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisConstraint_in_ruleBasicConstraint2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleBasicConstraint2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisConstraint_in_entryRuleParenthesisConstraint2073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisConstraint2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleParenthesisConstraint2120 = new BitSet(new long[]{0x0000000002100010L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_ruleParenthesisConstraint2141 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleParenthesisConstraint2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint2189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSelection_in_ruleConstraint2245 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_rulePropertyConstraint_in_ruleConstraint2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyConstraint_in_entryRulePropertyConstraint2303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyConstraint2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicPropertyConstraint_in_rulePropertyConstraint2360 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_rulePropertyConstraint2409 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rulePropertyConstraint_in_rulePropertyConstraint2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicPropertyConstraint_in_entryRuleBasicPropertyConstraint2470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicPropertyConstraint2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyParenthesisConstraint_in_ruleBasicPropertyConstraint2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValueConstraint_in_ruleBasicPropertyConstraint2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyParenthesisConstraint_in_entryRulePropertyParenthesisConstraint2589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyParenthesisConstraint2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulePropertyParenthesisConstraint2636 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rulePropertyConstraint_in_rulePropertyParenthesisConstraint2657 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePropertyParenthesisConstraint2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValueConstraint_in_entryRulePropertyValueConstraint2705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValueConstraint2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyValueConstraint2760 = new BitSet(new long[]{0x000003F800000000L});
    public static final BitSet FOLLOW_ruleComparator_in_rulePropertyValueConstraint2781 = new BitSet(new long[]{0x00000000281001F0L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePropertyValueConstraint2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSelection_in_entryRuleTypeSelection2838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeSelection2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteType_in_ruleTypeSelection2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateTypeSelection_in_ruleTypeSelection2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTypeSelection_in_ruleTypeSelection2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteType_in_entryRuleConcreteType2984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcreteType2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConcreteType3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateTypeSelection_in_entryRuleTemplateTypeSelection3073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateTypeSelection3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTemplateTypeSelection3120 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTemplateTypeSelection3132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateTypeSelection3152 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleTemplateTypeSelection3165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTemplateTypeSelection3188 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleRecordTypeSelection_in_entryRuleRecordTypeSelection3226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordTypeSelection3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRecordTypeSelection3273 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_ruleRecordTypeModifier_in_ruleRecordTypeSelection3294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecordTypeSelection3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral3350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_ruleLiteral3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_ruleLiteral3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInValueLiteral_in_ruleLiteral3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral3577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteral3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleArrayLiteral3624 = new BitSet(new long[]{0x00000000281001F0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleArrayLiteral3645 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_17_in_ruleArrayLiteral3658 = new BitSet(new long[]{0x00000000281001F0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleArrayLiteral3679 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_28_in_ruleArrayLiteral3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral3820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral3911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatLiteral3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral4002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBooleanLiteral4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInValueLiteral_in_entryRuleBuiltInValueLiteral4093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInValueLiteral4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleBuiltInValueLiteral4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4256 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleQualifiedName4284 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4300 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard4348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard4359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard4406 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleQualifiedNameWithWildcard4425 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleQualifiedNameWithWildcard4438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleRecordTypeModifier4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleRecordTypeModifier4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleLogicOperator4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleLogicOperator4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleComparator4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleComparator4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleComparator4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleComparator4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleComparator4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleComparator4703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleComparator4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_synpred1_InternalConstraintLang956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_synpred2_InternalConstraintLang1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_synpred3_InternalConstraintLang2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred4_InternalConstraintLang4275 = new BitSet(new long[]{0x0000000000000002L});

}