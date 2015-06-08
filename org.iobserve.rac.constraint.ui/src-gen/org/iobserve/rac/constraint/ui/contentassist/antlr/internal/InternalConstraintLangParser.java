package org.iobserve.rac.constraint.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.iobserve.rac.constraint.services.ConstraintLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalConstraintLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'super'", "'extends'", "'&'", "'|'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'~'", "'package'", "'import'", "'select'", "':'", "'store'", "'('", "')'", "','", "'.'", "'filter'", "'?'", "'uses'", "'from'", "'{'", "'}'", "'*'", "'default'", "'KIEKER_VERSION'"
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
    public static final int T__42=42;
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
    public String getGrammarFileName() { return "../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g"; }


     
     	private ConstraintLangGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ConstraintLangGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:62:1: ( ruleModel EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:63:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:76:1: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:77:1: ( rule__Model__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:77:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel100);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:90:1: ( ruleImport EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:91:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport127);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:103:1: ( ( rule__Import__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:104:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:105:1: ( rule__Import__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:105:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport160);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleOperation"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:117:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:118:1: ( ruleOperation EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:119:1: ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation187);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:126:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:130:2: ( ( ( rule__Operation__Alternatives ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:131:1: ( ( rule__Operation__Alternatives ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:131:1: ( ( rule__Operation__Alternatives ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:132:1: ( rule__Operation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getAlternatives()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:133:1: ( rule__Operation__Alternatives )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:133:2: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_rule__Operation__Alternatives_in_ruleOperation220);
            rule__Operation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getAlternatives()); 
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleSelection"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:145:1: entryRuleSelection : ruleSelection EOF ;
    public final void entryRuleSelection() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:146:1: ( ruleSelection EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:147:1: ruleSelection EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionRule()); 
            }
            pushFollow(FOLLOW_ruleSelection_in_entryRuleSelection247);
            ruleSelection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelection254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSelection"


    // $ANTLR start "ruleSelection"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:154:1: ruleSelection : ( ( rule__Selection__Group__0 ) ) ;
    public final void ruleSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:158:2: ( ( ( rule__Selection__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:159:1: ( ( rule__Selection__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:159:1: ( ( rule__Selection__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:160:1: ( rule__Selection__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:161:1: ( rule__Selection__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:161:2: rule__Selection__Group__0
            {
            pushFollow(FOLLOW_rule__Selection__Group__0_in_ruleSelection280);
            rule__Selection__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getGroup()); 
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
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleSelectInput"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:173:1: entryRuleSelectInput : ruleSelectInput EOF ;
    public final void entryRuleSelectInput() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:174:1: ( ruleSelectInput EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:175:1: ruleSelectInput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectInputRule()); 
            }
            pushFollow(FOLLOW_ruleSelectInput_in_entryRuleSelectInput307);
            ruleSelectInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectInputRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectInput314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSelectInput"


    // $ANTLR start "ruleSelectInput"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:182:1: ruleSelectInput : ( ( rule__SelectInput__Group__0 ) ) ;
    public final void ruleSelectInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:186:2: ( ( ( rule__SelectInput__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:187:1: ( ( rule__SelectInput__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:187:1: ( ( rule__SelectInput__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:188:1: ( rule__SelectInput__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectInputAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:189:1: ( rule__SelectInput__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:189:2: rule__SelectInput__Group__0
            {
            pushFollow(FOLLOW_rule__SelectInput__Group__0_in_ruleSelectInput340);
            rule__SelectInput__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectInputAccess().getGroup()); 
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
    // $ANTLR end "ruleSelectInput"


    // $ANTLR start "entryRuleSelectConstaintExpression"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:201:1: entryRuleSelectConstaintExpression : ruleSelectConstaintExpression EOF ;
    public final void entryRuleSelectConstaintExpression() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:202:1: ( ruleSelectConstaintExpression EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:203:1: ruleSelectConstaintExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstaintExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSelectConstaintExpression_in_entryRuleSelectConstaintExpression367);
            ruleSelectConstaintExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectConstaintExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectConstaintExpression374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSelectConstaintExpression"


    // $ANTLR start "ruleSelectConstaintExpression"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:210:1: ruleSelectConstaintExpression : ( ( rule__SelectConstaintExpression__Group__0 ) ) ;
    public final void ruleSelectConstaintExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:214:2: ( ( ( rule__SelectConstaintExpression__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:215:1: ( ( rule__SelectConstaintExpression__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:215:1: ( ( rule__SelectConstaintExpression__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:216:1: ( rule__SelectConstaintExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstaintExpressionAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:217:1: ( rule__SelectConstaintExpression__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:217:2: rule__SelectConstaintExpression__Group__0
            {
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group__0_in_ruleSelectConstaintExpression400);
            rule__SelectConstaintExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectConstaintExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleSelectConstaintExpression"


    // $ANTLR start "entryRuleBasicSelectConstraint"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:229:1: entryRuleBasicSelectConstraint : ruleBasicSelectConstraint EOF ;
    public final void entryRuleBasicSelectConstraint() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:230:1: ( ruleBasicSelectConstraint EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:231:1: ruleBasicSelectConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicSelectConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleBasicSelectConstraint_in_entryRuleBasicSelectConstraint427);
            ruleBasicSelectConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicSelectConstraintRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicSelectConstraint434); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBasicSelectConstraint"


    // $ANTLR start "ruleBasicSelectConstraint"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:238:1: ruleBasicSelectConstraint : ( ( rule__BasicSelectConstraint__Alternatives ) ) ;
    public final void ruleBasicSelectConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:242:2: ( ( ( rule__BasicSelectConstraint__Alternatives ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:243:1: ( ( rule__BasicSelectConstraint__Alternatives ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:243:1: ( ( rule__BasicSelectConstraint__Alternatives ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:244:1: ( rule__BasicSelectConstraint__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicSelectConstraintAccess().getAlternatives()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:245:1: ( rule__BasicSelectConstraint__Alternatives )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:245:2: rule__BasicSelectConstraint__Alternatives
            {
            pushFollow(FOLLOW_rule__BasicSelectConstraint__Alternatives_in_ruleBasicSelectConstraint460);
            rule__BasicSelectConstraint__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicSelectConstraintAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBasicSelectConstraint"


    // $ANTLR start "entryRuleParenthesisSelectConstraint"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:257:1: entryRuleParenthesisSelectConstraint : ruleParenthesisSelectConstraint EOF ;
    public final void entryRuleParenthesisSelectConstraint() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:258:1: ( ruleParenthesisSelectConstraint EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:259:1: ruleParenthesisSelectConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisSelectConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesisSelectConstraint_in_entryRuleParenthesisSelectConstraint487);
            ruleParenthesisSelectConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisSelectConstraintRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisSelectConstraint494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParenthesisSelectConstraint"


    // $ANTLR start "ruleParenthesisSelectConstraint"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:266:1: ruleParenthesisSelectConstraint : ( ( rule__ParenthesisSelectConstraint__Group__0 ) ) ;
    public final void ruleParenthesisSelectConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:270:2: ( ( ( rule__ParenthesisSelectConstraint__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:271:1: ( ( rule__ParenthesisSelectConstraint__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:271:1: ( ( rule__ParenthesisSelectConstraint__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:272:1: ( rule__ParenthesisSelectConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisSelectConstraintAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:273:1: ( rule__ParenthesisSelectConstraint__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:273:2: rule__ParenthesisSelectConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__ParenthesisSelectConstraint__Group__0_in_ruleParenthesisSelectConstraint520);
            rule__ParenthesisSelectConstraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisSelectConstraintAccess().getGroup()); 
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
    // $ANTLR end "ruleParenthesisSelectConstraint"


    // $ANTLR start "entryRuleSelectConstraint"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:285:1: entryRuleSelectConstraint : ruleSelectConstraint EOF ;
    public final void entryRuleSelectConstraint() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:286:1: ( ruleSelectConstraint EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:287:1: ruleSelectConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleSelectConstraint_in_entryRuleSelectConstraint547);
            ruleSelectConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectConstraintRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectConstraint554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSelectConstraint"


    // $ANTLR start "ruleSelectConstraint"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:294:1: ruleSelectConstraint : ( ( rule__SelectConstraint__Group__0 ) ) ;
    public final void ruleSelectConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:298:2: ( ( ( rule__SelectConstraint__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:299:1: ( ( rule__SelectConstraint__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:299:1: ( ( rule__SelectConstraint__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:300:1: ( rule__SelectConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstraintAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:301:1: ( rule__SelectConstraint__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:301:2: rule__SelectConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__SelectConstraint__Group__0_in_ruleSelectConstraint580);
            rule__SelectConstraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectConstraintAccess().getGroup()); 
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
    // $ANTLR end "ruleSelectConstraint"


    // $ANTLR start "entryRuleCompareOperand"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:313:1: entryRuleCompareOperand : ruleCompareOperand EOF ;
    public final void entryRuleCompareOperand() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:314:1: ( ruleCompareOperand EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:315:1: ruleCompareOperand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperandRule()); 
            }
            pushFollow(FOLLOW_ruleCompareOperand_in_entryRuleCompareOperand607);
            ruleCompareOperand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperandRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOperand614); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCompareOperand"


    // $ANTLR start "ruleCompareOperand"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:322:1: ruleCompareOperand : ( ( rule__CompareOperand__Alternatives ) ) ;
    public final void ruleCompareOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:326:2: ( ( ( rule__CompareOperand__Alternatives ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:327:1: ( ( rule__CompareOperand__Alternatives ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:327:1: ( ( rule__CompareOperand__Alternatives ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:328:1: ( rule__CompareOperand__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperandAccess().getAlternatives()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:329:1: ( rule__CompareOperand__Alternatives )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:329:2: rule__CompareOperand__Alternatives
            {
            pushFollow(FOLLOW_rule__CompareOperand__Alternatives_in_ruleCompareOperand640);
            rule__CompareOperand__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperandAccess().getAlternatives()); 
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
    // $ANTLR end "ruleCompareOperand"


    // $ANTLR start "entryRuleParameterExpression"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:341:1: entryRuleParameterExpression : ruleParameterExpression EOF ;
    public final void entryRuleParameterExpression() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:342:1: ( ruleParameterExpression EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:343:1: ruleParameterExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParameterExpression_in_entryRuleParameterExpression667);
            ruleParameterExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterExpression674); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParameterExpression"


    // $ANTLR start "ruleParameterExpression"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:350:1: ruleParameterExpression : ( ( rule__ParameterExpression__Group__0 ) ) ;
    public final void ruleParameterExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:354:2: ( ( ( rule__ParameterExpression__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:355:1: ( ( rule__ParameterExpression__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:355:1: ( ( rule__ParameterExpression__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:356:1: ( rule__ParameterExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterExpressionAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:357:1: ( rule__ParameterExpression__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:357:2: rule__ParameterExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterExpression__Group__0_in_ruleParameterExpression700);
            rule__ParameterExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleParameterExpression"


    // $ANTLR start "entryRuleFilter"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:369:1: entryRuleFilter : ruleFilter EOF ;
    public final void entryRuleFilter() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:370:1: ( ruleFilter EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:371:1: ruleFilter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFilterRule()); 
            }
            pushFollow(FOLLOW_ruleFilter_in_entryRuleFilter727);
            ruleFilter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFilterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilter734); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:378:1: ruleFilter : ( ( rule__Filter__Group__0 ) ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:382:2: ( ( ( rule__Filter__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:383:1: ( ( rule__Filter__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:383:1: ( ( rule__Filter__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:384:1: ( rule__Filter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFilterAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:385:1: ( rule__Filter__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:385:2: rule__Filter__Group__0
            {
            pushFollow(FOLLOW_rule__Filter__Group__0_in_ruleFilter760);
            rule__Filter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFilterAccess().getGroup()); 
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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleConstraintExpression"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:397:1: entryRuleConstraintExpression : ruleConstraintExpression EOF ;
    public final void entryRuleConstraintExpression() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:398:1: ( ruleConstraintExpression EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:399:1: ruleConstraintExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_entryRuleConstraintExpression787);
            ruleConstraintExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintExpression794); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConstraintExpression"


    // $ANTLR start "ruleConstraintExpression"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:406:1: ruleConstraintExpression : ( ( rule__ConstraintExpression__Group__0 ) ) ;
    public final void ruleConstraintExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:410:2: ( ( ( rule__ConstraintExpression__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:411:1: ( ( rule__ConstraintExpression__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:411:1: ( ( rule__ConstraintExpression__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:412:1: ( rule__ConstraintExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:413:1: ( rule__ConstraintExpression__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:413:2: rule__ConstraintExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__0_in_ruleConstraintExpression820);
            rule__ConstraintExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleConstraintExpression"


    // $ANTLR start "entryRuleBasicConstraint"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:425:1: entryRuleBasicConstraint : ruleBasicConstraint EOF ;
    public final void entryRuleBasicConstraint() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:426:1: ( ruleBasicConstraint EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:427:1: ruleBasicConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleBasicConstraint_in_entryRuleBasicConstraint847);
            ruleBasicConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConstraintRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicConstraint854); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBasicConstraint"


    // $ANTLR start "ruleBasicConstraint"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:434:1: ruleBasicConstraint : ( ( rule__BasicConstraint__Alternatives ) ) ;
    public final void ruleBasicConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:438:2: ( ( ( rule__BasicConstraint__Alternatives ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:439:1: ( ( rule__BasicConstraint__Alternatives ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:439:1: ( ( rule__BasicConstraint__Alternatives ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:440:1: ( rule__BasicConstraint__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConstraintAccess().getAlternatives()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:441:1: ( rule__BasicConstraint__Alternatives )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:441:2: rule__BasicConstraint__Alternatives
            {
            pushFollow(FOLLOW_rule__BasicConstraint__Alternatives_in_ruleBasicConstraint880);
            rule__BasicConstraint__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConstraintAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBasicConstraint"


    // $ANTLR start "entryRuleParenthesisConstraint"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:453:1: entryRuleParenthesisConstraint : ruleParenthesisConstraint EOF ;
    public final void entryRuleParenthesisConstraint() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:454:1: ( ruleParenthesisConstraint EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:455:1: ruleParenthesisConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesisConstraint_in_entryRuleParenthesisConstraint907);
            ruleParenthesisConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisConstraintRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisConstraint914); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParenthesisConstraint"


    // $ANTLR start "ruleParenthesisConstraint"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:462:1: ruleParenthesisConstraint : ( ( rule__ParenthesisConstraint__Group__0 ) ) ;
    public final void ruleParenthesisConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:466:2: ( ( ( rule__ParenthesisConstraint__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:467:1: ( ( rule__ParenthesisConstraint__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:467:1: ( ( rule__ParenthesisConstraint__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:468:1: ( rule__ParenthesisConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:469:1: ( rule__ParenthesisConstraint__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:469:2: rule__ParenthesisConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__0_in_ruleParenthesisConstraint940);
            rule__ParenthesisConstraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisConstraintAccess().getGroup()); 
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
    // $ANTLR end "ruleParenthesisConstraint"


    // $ANTLR start "entryRuleConstraint"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:481:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:482:1: ( ruleConstraint EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:483:1: ruleConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint967);
            ruleConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint974); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:490:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:494:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:495:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:495:1: ( ( rule__Constraint__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:496:1: ( rule__Constraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:497:1: ( rule__Constraint__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:497:2: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0_in_ruleConstraint1000);
            rule__Constraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getGroup()); 
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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRulePropertyConstraint"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:509:1: entryRulePropertyConstraint : rulePropertyConstraint EOF ;
    public final void entryRulePropertyConstraint() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:510:1: ( rulePropertyConstraint EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:511:1: rulePropertyConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintRule()); 
            }
            pushFollow(FOLLOW_rulePropertyConstraint_in_entryRulePropertyConstraint1027);
            rulePropertyConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyConstraint1034); if (state.failed) return ;

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
    // $ANTLR end "entryRulePropertyConstraint"


    // $ANTLR start "rulePropertyConstraint"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:518:1: rulePropertyConstraint : ( ( rule__PropertyConstraint__Group__0 ) ) ;
    public final void rulePropertyConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:522:2: ( ( ( rule__PropertyConstraint__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:523:1: ( ( rule__PropertyConstraint__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:523:1: ( ( rule__PropertyConstraint__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:524:1: ( rule__PropertyConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:525:1: ( rule__PropertyConstraint__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:525:2: rule__PropertyConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyConstraint__Group__0_in_rulePropertyConstraint1060);
            rule__PropertyConstraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintAccess().getGroup()); 
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
    // $ANTLR end "rulePropertyConstraint"


    // $ANTLR start "entryRuleBasicPropertyConstraint"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:537:1: entryRuleBasicPropertyConstraint : ruleBasicPropertyConstraint EOF ;
    public final void entryRuleBasicPropertyConstraint() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:538:1: ( ruleBasicPropertyConstraint EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:539:1: ruleBasicPropertyConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicPropertyConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleBasicPropertyConstraint_in_entryRuleBasicPropertyConstraint1087);
            ruleBasicPropertyConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicPropertyConstraintRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicPropertyConstraint1094); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBasicPropertyConstraint"


    // $ANTLR start "ruleBasicPropertyConstraint"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:546:1: ruleBasicPropertyConstraint : ( ( rule__BasicPropertyConstraint__Alternatives ) ) ;
    public final void ruleBasicPropertyConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:550:2: ( ( ( rule__BasicPropertyConstraint__Alternatives ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:551:1: ( ( rule__BasicPropertyConstraint__Alternatives ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:551:1: ( ( rule__BasicPropertyConstraint__Alternatives ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:552:1: ( rule__BasicPropertyConstraint__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicPropertyConstraintAccess().getAlternatives()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:553:1: ( rule__BasicPropertyConstraint__Alternatives )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:553:2: rule__BasicPropertyConstraint__Alternatives
            {
            pushFollow(FOLLOW_rule__BasicPropertyConstraint__Alternatives_in_ruleBasicPropertyConstraint1120);
            rule__BasicPropertyConstraint__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicPropertyConstraintAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBasicPropertyConstraint"


    // $ANTLR start "entryRulePropertyParenthesisConstraint"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:565:1: entryRulePropertyParenthesisConstraint : rulePropertyParenthesisConstraint EOF ;
    public final void entryRulePropertyParenthesisConstraint() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:566:1: ( rulePropertyParenthesisConstraint EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:567:1: rulePropertyParenthesisConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyParenthesisConstraintRule()); 
            }
            pushFollow(FOLLOW_rulePropertyParenthesisConstraint_in_entryRulePropertyParenthesisConstraint1147);
            rulePropertyParenthesisConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyParenthesisConstraintRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyParenthesisConstraint1154); if (state.failed) return ;

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
    // $ANTLR end "entryRulePropertyParenthesisConstraint"


    // $ANTLR start "rulePropertyParenthesisConstraint"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:574:1: rulePropertyParenthesisConstraint : ( ( rule__PropertyParenthesisConstraint__Group__0 ) ) ;
    public final void rulePropertyParenthesisConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:578:2: ( ( ( rule__PropertyParenthesisConstraint__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:579:1: ( ( rule__PropertyParenthesisConstraint__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:579:1: ( ( rule__PropertyParenthesisConstraint__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:580:1: ( rule__PropertyParenthesisConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyParenthesisConstraintAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:581:1: ( rule__PropertyParenthesisConstraint__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:581:2: rule__PropertyParenthesisConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyParenthesisConstraint__Group__0_in_rulePropertyParenthesisConstraint1180);
            rule__PropertyParenthesisConstraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyParenthesisConstraintAccess().getGroup()); 
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
    // $ANTLR end "rulePropertyParenthesisConstraint"


    // $ANTLR start "entryRulePropertyValueConstraint"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:593:1: entryRulePropertyValueConstraint : rulePropertyValueConstraint EOF ;
    public final void entryRulePropertyValueConstraint() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:594:1: ( rulePropertyValueConstraint EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:595:1: rulePropertyValueConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueConstraintRule()); 
            }
            pushFollow(FOLLOW_rulePropertyValueConstraint_in_entryRulePropertyValueConstraint1207);
            rulePropertyValueConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueConstraintRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValueConstraint1214); if (state.failed) return ;

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
    // $ANTLR end "entryRulePropertyValueConstraint"


    // $ANTLR start "rulePropertyValueConstraint"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:602:1: rulePropertyValueConstraint : ( ( rule__PropertyValueConstraint__Group__0 ) ) ;
    public final void rulePropertyValueConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:606:2: ( ( ( rule__PropertyValueConstraint__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:607:1: ( ( rule__PropertyValueConstraint__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:607:1: ( ( rule__PropertyValueConstraint__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:608:1: ( rule__PropertyValueConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueConstraintAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:609:1: ( rule__PropertyValueConstraint__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:609:2: rule__PropertyValueConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyValueConstraint__Group__0_in_rulePropertyValueConstraint1240);
            rule__PropertyValueConstraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueConstraintAccess().getGroup()); 
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
    // $ANTLR end "rulePropertyValueConstraint"


    // $ANTLR start "entryRuleTypeSelection"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:621:1: entryRuleTypeSelection : ruleTypeSelection EOF ;
    public final void entryRuleTypeSelection() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:622:1: ( ruleTypeSelection EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:623:1: ruleTypeSelection EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeSelectionRule()); 
            }
            pushFollow(FOLLOW_ruleTypeSelection_in_entryRuleTypeSelection1267);
            ruleTypeSelection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeSelectionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeSelection1274); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTypeSelection"


    // $ANTLR start "ruleTypeSelection"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:630:1: ruleTypeSelection : ( ( rule__TypeSelection__Alternatives ) ) ;
    public final void ruleTypeSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:634:2: ( ( ( rule__TypeSelection__Alternatives ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:635:1: ( ( rule__TypeSelection__Alternatives ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:635:1: ( ( rule__TypeSelection__Alternatives ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:636:1: ( rule__TypeSelection__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeSelectionAccess().getAlternatives()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:637:1: ( rule__TypeSelection__Alternatives )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:637:2: rule__TypeSelection__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeSelection__Alternatives_in_ruleTypeSelection1300);
            rule__TypeSelection__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeSelectionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTypeSelection"


    // $ANTLR start "entryRuleConcreteType"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:649:1: entryRuleConcreteType : ruleConcreteType EOF ;
    public final void entryRuleConcreteType() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:650:1: ( ruleConcreteType EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:651:1: ruleConcreteType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteTypeRule()); 
            }
            pushFollow(FOLLOW_ruleConcreteType_in_entryRuleConcreteType1327);
            ruleConcreteType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcreteTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcreteType1334); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConcreteType"


    // $ANTLR start "ruleConcreteType"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:658:1: ruleConcreteType : ( ( rule__ConcreteType__TypeAssignment ) ) ;
    public final void ruleConcreteType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:662:2: ( ( ( rule__ConcreteType__TypeAssignment ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:663:1: ( ( rule__ConcreteType__TypeAssignment ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:663:1: ( ( rule__ConcreteType__TypeAssignment ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:664:1: ( rule__ConcreteType__TypeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteTypeAccess().getTypeAssignment()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:665:1: ( rule__ConcreteType__TypeAssignment )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:665:2: rule__ConcreteType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__ConcreteType__TypeAssignment_in_ruleConcreteType1360);
            rule__ConcreteType__TypeAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcreteTypeAccess().getTypeAssignment()); 
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
    // $ANTLR end "ruleConcreteType"


    // $ANTLR start "entryRuleTemplateTypeSelection"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:677:1: entryRuleTemplateTypeSelection : ruleTemplateTypeSelection EOF ;
    public final void entryRuleTemplateTypeSelection() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:678:1: ( ruleTemplateTypeSelection EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:679:1: ruleTemplateTypeSelection EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeSelectionRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateTypeSelection_in_entryRuleTemplateTypeSelection1387);
            ruleTemplateTypeSelection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeSelectionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateTypeSelection1394); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTemplateTypeSelection"


    // $ANTLR start "ruleTemplateTypeSelection"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:686:1: ruleTemplateTypeSelection : ( ( rule__TemplateTypeSelection__Group__0 ) ) ;
    public final void ruleTemplateTypeSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:690:2: ( ( ( rule__TemplateTypeSelection__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:691:1: ( ( rule__TemplateTypeSelection__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:691:1: ( ( rule__TemplateTypeSelection__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:692:1: ( rule__TemplateTypeSelection__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeSelectionAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:693:1: ( rule__TemplateTypeSelection__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:693:2: rule__TemplateTypeSelection__Group__0
            {
            pushFollow(FOLLOW_rule__TemplateTypeSelection__Group__0_in_ruleTemplateTypeSelection1420);
            rule__TemplateTypeSelection__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeSelectionAccess().getGroup()); 
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
    // $ANTLR end "ruleTemplateTypeSelection"


    // $ANTLR start "entryRuleRecordTypeSelection"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:705:1: entryRuleRecordTypeSelection : ruleRecordTypeSelection EOF ;
    public final void entryRuleRecordTypeSelection() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:706:1: ( ruleRecordTypeSelection EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:707:1: ruleRecordTypeSelection EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeSelectionRule()); 
            }
            pushFollow(FOLLOW_ruleRecordTypeSelection_in_entryRuleRecordTypeSelection1447);
            ruleRecordTypeSelection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeSelectionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordTypeSelection1454); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRecordTypeSelection"


    // $ANTLR start "ruleRecordTypeSelection"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:714:1: ruleRecordTypeSelection : ( ( rule__RecordTypeSelection__Group__0 ) ) ;
    public final void ruleRecordTypeSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:718:2: ( ( ( rule__RecordTypeSelection__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:719:1: ( ( rule__RecordTypeSelection__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:719:1: ( ( rule__RecordTypeSelection__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:720:1: ( rule__RecordTypeSelection__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeSelectionAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:721:1: ( rule__RecordTypeSelection__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:721:2: rule__RecordTypeSelection__Group__0
            {
            pushFollow(FOLLOW_rule__RecordTypeSelection__Group__0_in_ruleRecordTypeSelection1480);
            rule__RecordTypeSelection__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeSelectionAccess().getGroup()); 
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
    // $ANTLR end "ruleRecordTypeSelection"


    // $ANTLR start "entryRuleSourceReference"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:733:1: entryRuleSourceReference : ruleSourceReference EOF ;
    public final void entryRuleSourceReference() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:734:1: ( ruleSourceReference EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:735:1: ruleSourceReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleSourceReference_in_entryRuleSourceReference1507);
            ruleSourceReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSourceReference1514); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSourceReference"


    // $ANTLR start "ruleSourceReference"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:742:1: ruleSourceReference : ( ( rule__SourceReference__Group__0 ) ) ;
    public final void ruleSourceReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:746:2: ( ( ( rule__SourceReference__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:747:1: ( ( rule__SourceReference__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:747:1: ( ( rule__SourceReference__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:748:1: ( rule__SourceReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceReferenceAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:749:1: ( rule__SourceReference__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:749:2: rule__SourceReference__Group__0
            {
            pushFollow(FOLLOW_rule__SourceReference__Group__0_in_ruleSourceReference1540);
            rule__SourceReference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceReferenceAccess().getGroup()); 
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
    // $ANTLR end "ruleSourceReference"


    // $ANTLR start "entryRuleLiteral"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:761:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:762:1: ( ruleLiteral EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:763:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1567);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1574); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:770:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:774:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:775:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:775:1: ( ( rule__Literal__Alternatives ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:776:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:777:1: ( rule__Literal__Alternatives )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:777:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1600);
            rule__Literal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getAlternatives()); 
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleArrayLiteral"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:789:1: entryRuleArrayLiteral : ruleArrayLiteral EOF ;
    public final void entryRuleArrayLiteral() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:790:1: ( ruleArrayLiteral EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:791:1: ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral1627);
            ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLiteral1634); if (state.failed) return ;

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
    // $ANTLR end "entryRuleArrayLiteral"


    // $ANTLR start "ruleArrayLiteral"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:798:1: ruleArrayLiteral : ( ( rule__ArrayLiteral__Group__0 ) ) ;
    public final void ruleArrayLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:802:2: ( ( ( rule__ArrayLiteral__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:803:1: ( ( rule__ArrayLiteral__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:803:1: ( ( rule__ArrayLiteral__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:804:1: ( rule__ArrayLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:805:1: ( rule__ArrayLiteral__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:805:2: rule__ArrayLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__0_in_ruleArrayLiteral1660);
            rule__ArrayLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getGroup()); 
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
    // $ANTLR end "ruleArrayLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:817:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:818:1: ( ruleStringLiteral EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:819:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1687);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1694); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:826:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:830:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:831:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:831:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:832:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:833:1: ( rule__StringLiteral__ValueAssignment )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:833:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1720);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:845:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:846:1: ( ruleIntLiteral EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:847:1: ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral1747);
            ruleIntLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral1754); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:854:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:858:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:859:1: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:859:1: ( ( rule__IntLiteral__ValueAssignment ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:860:1: ( rule__IntLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:861:1: ( rule__IntLiteral__ValueAssignment )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:861:2: rule__IntLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral1780);
            rule__IntLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleFloatLiteral"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:873:1: entryRuleFloatLiteral : ruleFloatLiteral EOF ;
    public final void entryRuleFloatLiteral() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:874:1: ( ruleFloatLiteral EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:875:1: ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral1807);
            ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatLiteral1814); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFloatLiteral"


    // $ANTLR start "ruleFloatLiteral"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:882:1: ruleFloatLiteral : ( ( rule__FloatLiteral__ValueAssignment ) ) ;
    public final void ruleFloatLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:886:2: ( ( ( rule__FloatLiteral__ValueAssignment ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:887:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:887:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:888:1: ( rule__FloatLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueAssignment()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:889:1: ( rule__FloatLiteral__ValueAssignment )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:889:2: rule__FloatLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatLiteral__ValueAssignment_in_ruleFloatLiteral1840);
            rule__FloatLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatLiteralAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleFloatLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:901:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:902:1: ( ruleBooleanLiteral EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:903:1: ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1867);
            ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral1874); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:910:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:914:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:915:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:915:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:916:1: ( rule__BooleanLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:917:1: ( rule__BooleanLiteral__ValueAssignment )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:917:2: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral1900);
            rule__BooleanLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleBuiltInValueLiteral"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:929:1: entryRuleBuiltInValueLiteral : ruleBuiltInValueLiteral EOF ;
    public final void entryRuleBuiltInValueLiteral() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:930:1: ( ruleBuiltInValueLiteral EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:931:1: ruleBuiltInValueLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltInValueLiteral_in_entryRuleBuiltInValueLiteral1927);
            ruleBuiltInValueLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltInValueLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInValueLiteral1934); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBuiltInValueLiteral"


    // $ANTLR start "ruleBuiltInValueLiteral"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:938:1: ruleBuiltInValueLiteral : ( ( rule__BuiltInValueLiteral__Group__0 ) ) ;
    public final void ruleBuiltInValueLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:942:2: ( ( ( rule__BuiltInValueLiteral__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:943:1: ( ( rule__BuiltInValueLiteral__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:943:1: ( ( rule__BuiltInValueLiteral__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:944:1: ( rule__BuiltInValueLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:945:1: ( rule__BuiltInValueLiteral__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:945:2: rule__BuiltInValueLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__BuiltInValueLiteral__Group__0_in_ruleBuiltInValueLiteral1960);
            rule__BuiltInValueLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltInValueLiteralAccess().getGroup()); 
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
    // $ANTLR end "ruleBuiltInValueLiteral"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:957:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:958:1: ( ruleQualifiedName EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:959:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1987);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1994); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:966:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:970:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:971:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:971:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:972:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:973:1: ( rule__QualifiedName__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:973:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName2020);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:985:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:986:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:987:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard2047);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard2054); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:994:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:998:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:999:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:999:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1000:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1001:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1001:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard2080);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "ruleRecordTypeModifier"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1014:1: ruleRecordTypeModifier : ( ( rule__RecordTypeModifier__Alternatives ) ) ;
    public final void ruleRecordTypeModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1018:1: ( ( ( rule__RecordTypeModifier__Alternatives ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1019:1: ( ( rule__RecordTypeModifier__Alternatives ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1019:1: ( ( rule__RecordTypeModifier__Alternatives ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1020:1: ( rule__RecordTypeModifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeModifierAccess().getAlternatives()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1021:1: ( rule__RecordTypeModifier__Alternatives )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1021:2: rule__RecordTypeModifier__Alternatives
            {
            pushFollow(FOLLOW_rule__RecordTypeModifier__Alternatives_in_ruleRecordTypeModifier2117);
            rule__RecordTypeModifier__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeModifierAccess().getAlternatives()); 
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
    // $ANTLR end "ruleRecordTypeModifier"


    // $ANTLR start "ruleLogicOperator"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1033:1: ruleLogicOperator : ( ( rule__LogicOperator__Alternatives ) ) ;
    public final void ruleLogicOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1037:1: ( ( ( rule__LogicOperator__Alternatives ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1038:1: ( ( rule__LogicOperator__Alternatives ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1038:1: ( ( rule__LogicOperator__Alternatives ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1039:1: ( rule__LogicOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getAlternatives()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1040:1: ( rule__LogicOperator__Alternatives )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1040:2: rule__LogicOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__LogicOperator__Alternatives_in_ruleLogicOperator2153);
            rule__LogicOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleLogicOperator"


    // $ANTLR start "ruleComparator"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1052:1: ruleComparator : ( ( rule__Comparator__Alternatives ) ) ;
    public final void ruleComparator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1056:1: ( ( ( rule__Comparator__Alternatives ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1057:1: ( ( rule__Comparator__Alternatives ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1057:1: ( ( rule__Comparator__Alternatives ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1058:1: ( rule__Comparator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getAlternatives()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1059:1: ( rule__Comparator__Alternatives )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1059:2: rule__Comparator__Alternatives
            {
            pushFollow(FOLLOW_rule__Comparator__Alternatives_in_ruleComparator2189);
            rule__Comparator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparatorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleComparator"


    // $ANTLR start "rule__Operation__Alternatives"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1070:1: rule__Operation__Alternatives : ( ( ruleFilter ) | ( ruleSelection ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1074:1: ( ( ruleFilter ) | ( ruleSelection ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==34) ) {
                alt1=1;
            }
            else if ( (LA1_0==27) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1075:1: ( ruleFilter )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1075:1: ( ruleFilter )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1076:1: ruleFilter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationAccess().getFilterParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleFilter_in_rule__Operation__Alternatives2224);
                    ruleFilter();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperationAccess().getFilterParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1081:6: ( ruleSelection )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1081:6: ( ruleSelection )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1082:1: ruleSelection
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationAccess().getSelectionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSelection_in_rule__Operation__Alternatives2241);
                    ruleSelection();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperationAccess().getSelectionParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__BasicSelectConstraint__Alternatives"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1092:1: rule__BasicSelectConstraint__Alternatives : ( ( ruleParenthesisSelectConstraint ) | ( ruleSelectConstraint ) );
    public final void rule__BasicSelectConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1096:1: ( ( ruleParenthesisSelectConstraint ) | ( ruleSelectConstraint ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_BOOLEAN)||LA2_0==38||LA2_0==42) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1097:1: ( ruleParenthesisSelectConstraint )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1097:1: ( ruleParenthesisSelectConstraint )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1098:1: ruleParenthesisSelectConstraint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicSelectConstraintAccess().getParenthesisSelectConstraintParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleParenthesisSelectConstraint_in_rule__BasicSelectConstraint__Alternatives2273);
                    ruleParenthesisSelectConstraint();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicSelectConstraintAccess().getParenthesisSelectConstraintParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1103:6: ( ruleSelectConstraint )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1103:6: ( ruleSelectConstraint )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1104:1: ruleSelectConstraint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicSelectConstraintAccess().getSelectConstraintParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSelectConstraint_in_rule__BasicSelectConstraint__Alternatives2290);
                    ruleSelectConstraint();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicSelectConstraintAccess().getSelectConstraintParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__BasicSelectConstraint__Alternatives"


    // $ANTLR start "rule__CompareOperand__Alternatives"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1114:1: rule__CompareOperand__Alternatives : ( ( ruleParameterExpression ) | ( ruleLiteral ) );
    public final void rule__CompareOperand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1118:1: ( ( ruleParameterExpression ) | ( ruleLiteral ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_BOOLEAN)||LA3_0==38||LA3_0==42) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1119:1: ( ruleParameterExpression )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1119:1: ( ruleParameterExpression )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1120:1: ruleParameterExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperandAccess().getParameterExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleParameterExpression_in_rule__CompareOperand__Alternatives2322);
                    ruleParameterExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperandAccess().getParameterExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1125:6: ( ruleLiteral )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1125:6: ( ruleLiteral )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1126:1: ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperandAccess().getLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_rule__CompareOperand__Alternatives2339);
                    ruleLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperandAccess().getLiteralParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__CompareOperand__Alternatives"


    // $ANTLR start "rule__BasicConstraint__Alternatives"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1136:1: rule__BasicConstraint__Alternatives : ( ( ruleParenthesisConstraint ) | ( ruleConstraint ) );
    public final void rule__BasicConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1140:1: ( ( ruleParenthesisConstraint ) | ( ruleConstraint ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID||LA4_0==35) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1141:1: ( ruleParenthesisConstraint )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1141:1: ( ruleParenthesisConstraint )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1142:1: ruleParenthesisConstraint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicConstraintAccess().getParenthesisConstraintParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleParenthesisConstraint_in_rule__BasicConstraint__Alternatives2371);
                    ruleParenthesisConstraint();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicConstraintAccess().getParenthesisConstraintParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1147:6: ( ruleConstraint )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1147:6: ( ruleConstraint )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1148:1: ruleConstraint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicConstraintAccess().getConstraintParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleConstraint_in_rule__BasicConstraint__Alternatives2388);
                    ruleConstraint();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicConstraintAccess().getConstraintParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__BasicConstraint__Alternatives"


    // $ANTLR start "rule__BasicPropertyConstraint__Alternatives"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1158:1: rule__BasicPropertyConstraint__Alternatives : ( ( rulePropertyParenthesisConstraint ) | ( rulePropertyValueConstraint ) );
    public final void rule__BasicPropertyConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1162:1: ( ( rulePropertyParenthesisConstraint ) | ( rulePropertyValueConstraint ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1163:1: ( rulePropertyParenthesisConstraint )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1163:1: ( rulePropertyParenthesisConstraint )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1164:1: rulePropertyParenthesisConstraint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicPropertyConstraintAccess().getPropertyParenthesisConstraintParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePropertyParenthesisConstraint_in_rule__BasicPropertyConstraint__Alternatives2420);
                    rulePropertyParenthesisConstraint();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicPropertyConstraintAccess().getPropertyParenthesisConstraintParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1169:6: ( rulePropertyValueConstraint )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1169:6: ( rulePropertyValueConstraint )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1170:1: rulePropertyValueConstraint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicPropertyConstraintAccess().getPropertyValueConstraintParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_rulePropertyValueConstraint_in_rule__BasicPropertyConstraint__Alternatives2437);
                    rulePropertyValueConstraint();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicPropertyConstraintAccess().getPropertyValueConstraintParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__BasicPropertyConstraint__Alternatives"


    // $ANTLR start "rule__TypeSelection__Alternatives"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1180:1: rule__TypeSelection__Alternatives : ( ( ruleConcreteType ) | ( ruleTemplateTypeSelection ) | ( ruleRecordTypeSelection ) );
    public final void rule__TypeSelection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1184:1: ( ( ruleConcreteType ) | ( ruleTemplateTypeSelection ) | ( ruleRecordTypeSelection ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==35) ) {
                int LA6_2 = input.LA(2);

                if ( ((LA6_2>=14 && LA6_2<=15)) ) {
                    alt6=3;
                }
                else if ( (LA6_2==36) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1185:1: ( ruleConcreteType )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1185:1: ( ruleConcreteType )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1186:1: ruleConcreteType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeSelectionAccess().getConcreteTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleConcreteType_in_rule__TypeSelection__Alternatives2469);
                    ruleConcreteType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeSelectionAccess().getConcreteTypeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1191:6: ( ruleTemplateTypeSelection )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1191:6: ( ruleTemplateTypeSelection )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1192:1: ruleTemplateTypeSelection
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeSelectionAccess().getTemplateTypeSelectionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleTemplateTypeSelection_in_rule__TypeSelection__Alternatives2486);
                    ruleTemplateTypeSelection();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeSelectionAccess().getTemplateTypeSelectionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1197:6: ( ruleRecordTypeSelection )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1197:6: ( ruleRecordTypeSelection )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1198:1: ruleRecordTypeSelection
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeSelectionAccess().getRecordTypeSelectionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleRecordTypeSelection_in_rule__TypeSelection__Alternatives2503);
                    ruleRecordTypeSelection();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeSelectionAccess().getRecordTypeSelectionParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__TypeSelection__Alternatives"


    // $ANTLR start "rule__SourceReference__Alternatives_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1208:1: rule__SourceReference__Alternatives_1 : ( ( ( rule__SourceReference__FilterAssignment_1_0 ) ) | ( ( rule__SourceReference__DefaultAssignment_1_1 ) ) );
    public final void rule__SourceReference__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1212:1: ( ( ( rule__SourceReference__FilterAssignment_1_0 ) ) | ( ( rule__SourceReference__DefaultAssignment_1_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==41) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1213:1: ( ( rule__SourceReference__FilterAssignment_1_0 ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1213:1: ( ( rule__SourceReference__FilterAssignment_1_0 ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1214:1: ( rule__SourceReference__FilterAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSourceReferenceAccess().getFilterAssignment_1_0()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1215:1: ( rule__SourceReference__FilterAssignment_1_0 )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1215:2: rule__SourceReference__FilterAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__SourceReference__FilterAssignment_1_0_in_rule__SourceReference__Alternatives_12535);
                    rule__SourceReference__FilterAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSourceReferenceAccess().getFilterAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1219:6: ( ( rule__SourceReference__DefaultAssignment_1_1 ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1219:6: ( ( rule__SourceReference__DefaultAssignment_1_1 ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1220:1: ( rule__SourceReference__DefaultAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSourceReferenceAccess().getDefaultAssignment_1_1()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1221:1: ( rule__SourceReference__DefaultAssignment_1_1 )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1221:2: rule__SourceReference__DefaultAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__SourceReference__DefaultAssignment_1_1_in_rule__SourceReference__Alternatives_12553);
                    rule__SourceReference__DefaultAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSourceReferenceAccess().getDefaultAssignment_1_1()); 
                    }

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
    // $ANTLR end "rule__SourceReference__Alternatives_1"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1230:1: rule__Literal__Alternatives : ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleArrayLiteral ) | ( ruleBuiltInValueLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1234:1: ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleArrayLiteral ) | ( ruleBuiltInValueLiteral ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
                {
                alt8=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt8=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt8=4;
                }
                break;
            case 38:
                {
                alt8=5;
                }
                break;
            case 42:
                {
                alt8=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1235:1: ( ruleStringLiteral )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1235:1: ( ruleStringLiteral )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1236:1: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives2586);
                    ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1241:6: ( ruleIntLiteral )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1241:6: ( ruleIntLiteral )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1242:1: ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_rule__Literal__Alternatives2603);
                    ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1247:6: ( ruleFloatLiteral )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1247:6: ( ruleFloatLiteral )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1248:1: ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives2620);
                    ruleFloatLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1253:6: ( ruleBooleanLiteral )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1253:6: ( ruleBooleanLiteral )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1254:1: ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives2637);
                    ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1259:6: ( ruleArrayLiteral )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1259:6: ( ruleArrayLiteral )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1260:1: ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getArrayLiteralParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleArrayLiteral_in_rule__Literal__Alternatives2654);
                    ruleArrayLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getArrayLiteralParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1265:6: ( ruleBuiltInValueLiteral )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1265:6: ( ruleBuiltInValueLiteral )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1266:1: ruleBuiltInValueLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBuiltInValueLiteralParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleBuiltInValueLiteral_in_rule__Literal__Alternatives2671);
                    ruleBuiltInValueLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getBuiltInValueLiteralParserRuleCall_5()); 
                    }

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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__RecordTypeModifier__Alternatives"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1276:1: rule__RecordTypeModifier__Alternatives : ( ( ( 'super' ) ) | ( ( 'extends' ) ) );
    public final void rule__RecordTypeModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1280:1: ( ( ( 'super' ) ) | ( ( 'extends' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            else if ( (LA9_0==15) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1281:1: ( ( 'super' ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1281:1: ( ( 'super' ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1282:1: ( 'super' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecordTypeModifierAccess().getSUPEREnumLiteralDeclaration_0()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1283:1: ( 'super' )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1283:3: 'super'
                    {
                    match(input,14,FOLLOW_14_in_rule__RecordTypeModifier__Alternatives2704); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRecordTypeModifierAccess().getSUPEREnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1288:6: ( ( 'extends' ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1288:6: ( ( 'extends' ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1289:1: ( 'extends' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecordTypeModifierAccess().getEXTENDSEnumLiteralDeclaration_1()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1290:1: ( 'extends' )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1290:3: 'extends'
                    {
                    match(input,15,FOLLOW_15_in_rule__RecordTypeModifier__Alternatives2725); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRecordTypeModifierAccess().getEXTENDSEnumLiteralDeclaration_1()); 
                    }

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
    // $ANTLR end "rule__RecordTypeModifier__Alternatives"


    // $ANTLR start "rule__LogicOperator__Alternatives"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1300:1: rule__LogicOperator__Alternatives : ( ( ( '&' ) ) | ( ( '|' ) ) );
    public final void rule__LogicOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1304:1: ( ( ( '&' ) ) | ( ( '|' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            else if ( (LA10_0==17) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1305:1: ( ( '&' ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1305:1: ( ( '&' ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1306:1: ( '&' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1307:1: ( '&' )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1307:3: '&'
                    {
                    match(input,16,FOLLOW_16_in_rule__LogicOperator__Alternatives2761); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1312:6: ( ( '|' ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1312:6: ( ( '|' ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1313:1: ( '|' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1314:1: ( '|' )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1314:3: '|'
                    {
                    match(input,17,FOLLOW_17_in_rule__LogicOperator__Alternatives2782); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    }

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
    // $ANTLR end "rule__LogicOperator__Alternatives"


    // $ANTLR start "rule__Comparator__Alternatives"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1324:1: rule__Comparator__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '~' ) ) );
    public final void rule__Comparator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1328:1: ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '~' ) ) )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt11=1;
                }
                break;
            case 19:
                {
                alt11=2;
                }
                break;
            case 20:
                {
                alt11=3;
                }
                break;
            case 21:
                {
                alt11=4;
                }
                break;
            case 22:
                {
                alt11=5;
                }
                break;
            case 23:
                {
                alt11=6;
                }
                break;
            case 24:
                {
                alt11=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1329:1: ( ( '==' ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1329:1: ( ( '==' ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1330:1: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1331:1: ( '==' )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1331:3: '=='
                    {
                    match(input,18,FOLLOW_18_in_rule__Comparator__Alternatives2818); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1336:6: ( ( '!=' ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1336:6: ( ( '!=' ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1337:1: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getNEEnumLiteralDeclaration_1()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1338:1: ( '!=' )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1338:3: '!='
                    {
                    match(input,19,FOLLOW_19_in_rule__Comparator__Alternatives2839); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getNEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1343:6: ( ( '>' ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1343:6: ( ( '>' ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1344:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getGREnumLiteralDeclaration_2()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1345:1: ( '>' )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1345:3: '>'
                    {
                    match(input,20,FOLLOW_20_in_rule__Comparator__Alternatives2860); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getGREnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1350:6: ( ( '<' ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1350:6: ( ( '<' ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1351:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getLWEnumLiteralDeclaration_3()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1352:1: ( '<' )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1352:3: '<'
                    {
                    match(input,21,FOLLOW_21_in_rule__Comparator__Alternatives2881); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getLWEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1357:6: ( ( '>=' ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1357:6: ( ( '>=' ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1358:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getGEEnumLiteralDeclaration_4()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1359:1: ( '>=' )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1359:3: '>='
                    {
                    match(input,22,FOLLOW_22_in_rule__Comparator__Alternatives2902); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getGEEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1364:6: ( ( '<=' ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1364:6: ( ( '<=' ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1365:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getLEEnumLiteralDeclaration_5()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1366:1: ( '<=' )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1366:3: '<='
                    {
                    match(input,23,FOLLOW_23_in_rule__Comparator__Alternatives2923); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getLEEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1371:6: ( ( '~' ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1371:6: ( ( '~' ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1372:1: ( '~' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getLIKEEnumLiteralDeclaration_6()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1373:1: ( '~' )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1373:3: '~'
                    {
                    match(input,24,FOLLOW_24_in_rule__Comparator__Alternatives2944); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getLIKEEnumLiteralDeclaration_6()); 
                    }

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
    // $ANTLR end "rule__Comparator__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1385:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1389:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1390:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02977);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02980);
            rule__Model__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1397:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1401:1: ( ( 'package' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1402:1: ( 'package' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1402:1: ( 'package' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1403:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Model__Group__0__Impl3008); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPackageKeyword_0()); 
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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1416:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1420:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1421:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13039);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13042);
            rule__Model__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1428:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1432:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1433:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1433:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1434:1: ( rule__Model__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1435:1: ( rule__Model__NameAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1435:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl3069);
            rule__Model__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1445:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1449:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1450:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23099);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__23102);
            rule__Model__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1457:1: rule__Model__Group__2__Impl : ( ( rule__Model__ImportsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1461:1: ( ( ( rule__Model__ImportsAssignment_2 )* ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1462:1: ( ( rule__Model__ImportsAssignment_2 )* )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1462:1: ( ( rule__Model__ImportsAssignment_2 )* )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1463:1: ( rule__Model__ImportsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_2()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1464:1: ( rule__Model__ImportsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1464:2: rule__Model__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_2_in_rule__Model__Group__2__Impl3129);
            	    rule__Model__ImportsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getImportsAssignment_2()); 
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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1474:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1478:1: ( rule__Model__Group__3__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1479:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33160);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1485:1: rule__Model__Group__3__Impl : ( ( rule__Model__OperationsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1489:1: ( ( ( rule__Model__OperationsAssignment_3 )* ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1490:1: ( ( rule__Model__OperationsAssignment_3 )* )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1490:1: ( ( rule__Model__OperationsAssignment_3 )* )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1491:1: ( rule__Model__OperationsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getOperationsAssignment_3()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1492:1: ( rule__Model__OperationsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27||LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1492:2: rule__Model__OperationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__OperationsAssignment_3_in_rule__Model__Group__3__Impl3187);
            	    rule__Model__OperationsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getOperationsAssignment_3()); 
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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1510:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1514:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1515:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03226);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03229);
            rule__Import__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1522:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1526:1: ( ( 'import' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1527:1: ( 'import' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1527:1: ( 'import' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1528:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Import__Group__0__Impl3257); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1541:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1545:1: ( rule__Import__Group__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1546:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13288);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1552:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1556:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1557:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1557:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1558:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1559:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1559:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3315);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Selection__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1573:1: rule__Selection__Group__0 : rule__Selection__Group__0__Impl rule__Selection__Group__1 ;
    public final void rule__Selection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1577:1: ( rule__Selection__Group__0__Impl rule__Selection__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1578:2: rule__Selection__Group__0__Impl rule__Selection__Group__1
            {
            pushFollow(FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__03349);
            rule__Selection__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__03352);
            rule__Selection__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__0"


    // $ANTLR start "rule__Selection__Group__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1585:1: rule__Selection__Group__0__Impl : ( 'select' ) ;
    public final void rule__Selection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1589:1: ( ( 'select' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1590:1: ( 'select' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1590:1: ( 'select' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1591:1: 'select'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getSelectKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Selection__Group__0__Impl3380); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getSelectKeyword_0()); 
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
    // $ANTLR end "rule__Selection__Group__0__Impl"


    // $ANTLR start "rule__Selection__Group__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1604:1: rule__Selection__Group__1 : rule__Selection__Group__1__Impl rule__Selection__Group__2 ;
    public final void rule__Selection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1608:1: ( rule__Selection__Group__1__Impl rule__Selection__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1609:2: rule__Selection__Group__1__Impl rule__Selection__Group__2
            {
            pushFollow(FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__13411);
            rule__Selection__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__13414);
            rule__Selection__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__1"


    // $ANTLR start "rule__Selection__Group__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1616:1: rule__Selection__Group__1__Impl : ( ( rule__Selection__NameAssignment_1 ) ) ;
    public final void rule__Selection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1620:1: ( ( ( rule__Selection__NameAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1621:1: ( ( rule__Selection__NameAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1621:1: ( ( rule__Selection__NameAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1622:1: ( rule__Selection__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getNameAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1623:1: ( rule__Selection__NameAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1623:2: rule__Selection__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Selection__NameAssignment_1_in_rule__Selection__Group__1__Impl3441);
            rule__Selection__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Selection__Group__1__Impl"


    // $ANTLR start "rule__Selection__Group__2"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1633:1: rule__Selection__Group__2 : rule__Selection__Group__2__Impl rule__Selection__Group__3 ;
    public final void rule__Selection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1637:1: ( rule__Selection__Group__2__Impl rule__Selection__Group__3 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1638:2: rule__Selection__Group__2__Impl rule__Selection__Group__3
            {
            pushFollow(FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__23471);
            rule__Selection__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group__3_in_rule__Selection__Group__23474);
            rule__Selection__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__2"


    // $ANTLR start "rule__Selection__Group__2__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1645:1: rule__Selection__Group__2__Impl : ( ( rule__Selection__SourceReferenceAssignment_2 ) ) ;
    public final void rule__Selection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1649:1: ( ( ( rule__Selection__SourceReferenceAssignment_2 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1650:1: ( ( rule__Selection__SourceReferenceAssignment_2 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1650:1: ( ( rule__Selection__SourceReferenceAssignment_2 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1651:1: ( rule__Selection__SourceReferenceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getSourceReferenceAssignment_2()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1652:1: ( rule__Selection__SourceReferenceAssignment_2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1652:2: rule__Selection__SourceReferenceAssignment_2
            {
            pushFollow(FOLLOW_rule__Selection__SourceReferenceAssignment_2_in_rule__Selection__Group__2__Impl3501);
            rule__Selection__SourceReferenceAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getSourceReferenceAssignment_2()); 
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
    // $ANTLR end "rule__Selection__Group__2__Impl"


    // $ANTLR start "rule__Selection__Group__3"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1662:1: rule__Selection__Group__3 : rule__Selection__Group__3__Impl rule__Selection__Group__4 ;
    public final void rule__Selection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1666:1: ( rule__Selection__Group__3__Impl rule__Selection__Group__4 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1667:2: rule__Selection__Group__3__Impl rule__Selection__Group__4
            {
            pushFollow(FOLLOW_rule__Selection__Group__3__Impl_in_rule__Selection__Group__33531);
            rule__Selection__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group__4_in_rule__Selection__Group__33534);
            rule__Selection__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__3"


    // $ANTLR start "rule__Selection__Group__3__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1674:1: rule__Selection__Group__3__Impl : ( ':' ) ;
    public final void rule__Selection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1678:1: ( ( ':' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1679:1: ( ':' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1679:1: ( ':' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1680:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getColonKeyword_3()); 
            }
            match(input,28,FOLLOW_28_in_rule__Selection__Group__3__Impl3562); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getColonKeyword_3()); 
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
    // $ANTLR end "rule__Selection__Group__3__Impl"


    // $ANTLR start "rule__Selection__Group__4"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1693:1: rule__Selection__Group__4 : rule__Selection__Group__4__Impl rule__Selection__Group__5 ;
    public final void rule__Selection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1697:1: ( rule__Selection__Group__4__Impl rule__Selection__Group__5 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1698:2: rule__Selection__Group__4__Impl rule__Selection__Group__5
            {
            pushFollow(FOLLOW_rule__Selection__Group__4__Impl_in_rule__Selection__Group__43593);
            rule__Selection__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group__5_in_rule__Selection__Group__43596);
            rule__Selection__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__4"


    // $ANTLR start "rule__Selection__Group__4__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1705:1: rule__Selection__Group__4__Impl : ( ( rule__Selection__InputsAssignment_4 ) ) ;
    public final void rule__Selection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1709:1: ( ( ( rule__Selection__InputsAssignment_4 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1710:1: ( ( rule__Selection__InputsAssignment_4 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1710:1: ( ( rule__Selection__InputsAssignment_4 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1711:1: ( rule__Selection__InputsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getInputsAssignment_4()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1712:1: ( rule__Selection__InputsAssignment_4 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1712:2: rule__Selection__InputsAssignment_4
            {
            pushFollow(FOLLOW_rule__Selection__InputsAssignment_4_in_rule__Selection__Group__4__Impl3623);
            rule__Selection__InputsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getInputsAssignment_4()); 
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
    // $ANTLR end "rule__Selection__Group__4__Impl"


    // $ANTLR start "rule__Selection__Group__5"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1722:1: rule__Selection__Group__5 : rule__Selection__Group__5__Impl rule__Selection__Group__6 ;
    public final void rule__Selection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1726:1: ( rule__Selection__Group__5__Impl rule__Selection__Group__6 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1727:2: rule__Selection__Group__5__Impl rule__Selection__Group__6
            {
            pushFollow(FOLLOW_rule__Selection__Group__5__Impl_in_rule__Selection__Group__53653);
            rule__Selection__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group__6_in_rule__Selection__Group__53656);
            rule__Selection__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__5"


    // $ANTLR start "rule__Selection__Group__5__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1734:1: rule__Selection__Group__5__Impl : ( ( rule__Selection__Group_5__0 )* ) ;
    public final void rule__Selection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1738:1: ( ( ( rule__Selection__Group_5__0 )* ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1739:1: ( ( rule__Selection__Group_5__0 )* )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1739:1: ( ( rule__Selection__Group_5__0 )* )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1740:1: ( rule__Selection__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getGroup_5()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1741:1: ( rule__Selection__Group_5__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1741:2: rule__Selection__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Selection__Group_5__0_in_rule__Selection__Group__5__Impl3683);
            	    rule__Selection__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getGroup_5()); 
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
    // $ANTLR end "rule__Selection__Group__5__Impl"


    // $ANTLR start "rule__Selection__Group__6"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1751:1: rule__Selection__Group__6 : rule__Selection__Group__6__Impl rule__Selection__Group__7 ;
    public final void rule__Selection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1755:1: ( rule__Selection__Group__6__Impl rule__Selection__Group__7 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1756:2: rule__Selection__Group__6__Impl rule__Selection__Group__7
            {
            pushFollow(FOLLOW_rule__Selection__Group__6__Impl_in_rule__Selection__Group__63714);
            rule__Selection__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group__7_in_rule__Selection__Group__63717);
            rule__Selection__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__6"


    // $ANTLR start "rule__Selection__Group__6__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1763:1: rule__Selection__Group__6__Impl : ( 'store' ) ;
    public final void rule__Selection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1767:1: ( ( 'store' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1768:1: ( 'store' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1768:1: ( 'store' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1769:1: 'store'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getStoreKeyword_6()); 
            }
            match(input,29,FOLLOW_29_in_rule__Selection__Group__6__Impl3745); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getStoreKeyword_6()); 
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
    // $ANTLR end "rule__Selection__Group__6__Impl"


    // $ANTLR start "rule__Selection__Group__7"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1782:1: rule__Selection__Group__7 : rule__Selection__Group__7__Impl rule__Selection__Group__8 ;
    public final void rule__Selection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1786:1: ( rule__Selection__Group__7__Impl rule__Selection__Group__8 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1787:2: rule__Selection__Group__7__Impl rule__Selection__Group__8
            {
            pushFollow(FOLLOW_rule__Selection__Group__7__Impl_in_rule__Selection__Group__73776);
            rule__Selection__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group__8_in_rule__Selection__Group__73779);
            rule__Selection__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__7"


    // $ANTLR start "rule__Selection__Group__7__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1794:1: rule__Selection__Group__7__Impl : ( ( rule__Selection__RecordTypeAssignment_7 ) ) ;
    public final void rule__Selection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1798:1: ( ( ( rule__Selection__RecordTypeAssignment_7 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1799:1: ( ( rule__Selection__RecordTypeAssignment_7 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1799:1: ( ( rule__Selection__RecordTypeAssignment_7 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1800:1: ( rule__Selection__RecordTypeAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getRecordTypeAssignment_7()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1801:1: ( rule__Selection__RecordTypeAssignment_7 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1801:2: rule__Selection__RecordTypeAssignment_7
            {
            pushFollow(FOLLOW_rule__Selection__RecordTypeAssignment_7_in_rule__Selection__Group__7__Impl3806);
            rule__Selection__RecordTypeAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getRecordTypeAssignment_7()); 
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
    // $ANTLR end "rule__Selection__Group__7__Impl"


    // $ANTLR start "rule__Selection__Group__8"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1811:1: rule__Selection__Group__8 : rule__Selection__Group__8__Impl rule__Selection__Group__9 ;
    public final void rule__Selection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1815:1: ( rule__Selection__Group__8__Impl rule__Selection__Group__9 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1816:2: rule__Selection__Group__8__Impl rule__Selection__Group__9
            {
            pushFollow(FOLLOW_rule__Selection__Group__8__Impl_in_rule__Selection__Group__83836);
            rule__Selection__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group__9_in_rule__Selection__Group__83839);
            rule__Selection__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__8"


    // $ANTLR start "rule__Selection__Group__8__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1823:1: rule__Selection__Group__8__Impl : ( '(' ) ;
    public final void rule__Selection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1827:1: ( ( '(' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1828:1: ( '(' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1828:1: ( '(' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1829:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getLeftParenthesisKeyword_8()); 
            }
            match(input,30,FOLLOW_30_in_rule__Selection__Group__8__Impl3867); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getLeftParenthesisKeyword_8()); 
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
    // $ANTLR end "rule__Selection__Group__8__Impl"


    // $ANTLR start "rule__Selection__Group__9"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1842:1: rule__Selection__Group__9 : rule__Selection__Group__9__Impl rule__Selection__Group__10 ;
    public final void rule__Selection__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1846:1: ( rule__Selection__Group__9__Impl rule__Selection__Group__10 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1847:2: rule__Selection__Group__9__Impl rule__Selection__Group__10
            {
            pushFollow(FOLLOW_rule__Selection__Group__9__Impl_in_rule__Selection__Group__93898);
            rule__Selection__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group__10_in_rule__Selection__Group__93901);
            rule__Selection__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__9"


    // $ANTLR start "rule__Selection__Group__9__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1854:1: rule__Selection__Group__9__Impl : ( ( rule__Selection__ParemterExpressionsAssignment_9 ) ) ;
    public final void rule__Selection__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1858:1: ( ( ( rule__Selection__ParemterExpressionsAssignment_9 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1859:1: ( ( rule__Selection__ParemterExpressionsAssignment_9 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1859:1: ( ( rule__Selection__ParemterExpressionsAssignment_9 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1860:1: ( rule__Selection__ParemterExpressionsAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getParemterExpressionsAssignment_9()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1861:1: ( rule__Selection__ParemterExpressionsAssignment_9 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1861:2: rule__Selection__ParemterExpressionsAssignment_9
            {
            pushFollow(FOLLOW_rule__Selection__ParemterExpressionsAssignment_9_in_rule__Selection__Group__9__Impl3928);
            rule__Selection__ParemterExpressionsAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getParemterExpressionsAssignment_9()); 
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
    // $ANTLR end "rule__Selection__Group__9__Impl"


    // $ANTLR start "rule__Selection__Group__10"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1871:1: rule__Selection__Group__10 : rule__Selection__Group__10__Impl rule__Selection__Group__11 ;
    public final void rule__Selection__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1875:1: ( rule__Selection__Group__10__Impl rule__Selection__Group__11 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1876:2: rule__Selection__Group__10__Impl rule__Selection__Group__11
            {
            pushFollow(FOLLOW_rule__Selection__Group__10__Impl_in_rule__Selection__Group__103958);
            rule__Selection__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group__11_in_rule__Selection__Group__103961);
            rule__Selection__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__10"


    // $ANTLR start "rule__Selection__Group__10__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1883:1: rule__Selection__Group__10__Impl : ( ( rule__Selection__Group_10__0 )* ) ;
    public final void rule__Selection__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1887:1: ( ( ( rule__Selection__Group_10__0 )* ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1888:1: ( ( rule__Selection__Group_10__0 )* )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1888:1: ( ( rule__Selection__Group_10__0 )* )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1889:1: ( rule__Selection__Group_10__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getGroup_10()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1890:1: ( rule__Selection__Group_10__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1890:2: rule__Selection__Group_10__0
            	    {
            	    pushFollow(FOLLOW_rule__Selection__Group_10__0_in_rule__Selection__Group__10__Impl3988);
            	    rule__Selection__Group_10__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getGroup_10()); 
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
    // $ANTLR end "rule__Selection__Group__10__Impl"


    // $ANTLR start "rule__Selection__Group__11"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1900:1: rule__Selection__Group__11 : rule__Selection__Group__11__Impl ;
    public final void rule__Selection__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1904:1: ( rule__Selection__Group__11__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1905:2: rule__Selection__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Selection__Group__11__Impl_in_rule__Selection__Group__114019);
            rule__Selection__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__11"


    // $ANTLR start "rule__Selection__Group__11__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1911:1: rule__Selection__Group__11__Impl : ( ')' ) ;
    public final void rule__Selection__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1915:1: ( ( ')' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1916:1: ( ')' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1916:1: ( ')' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1917:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getRightParenthesisKeyword_11()); 
            }
            match(input,31,FOLLOW_31_in_rule__Selection__Group__11__Impl4047); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getRightParenthesisKeyword_11()); 
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
    // $ANTLR end "rule__Selection__Group__11__Impl"


    // $ANTLR start "rule__Selection__Group_5__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1954:1: rule__Selection__Group_5__0 : rule__Selection__Group_5__0__Impl rule__Selection__Group_5__1 ;
    public final void rule__Selection__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1958:1: ( rule__Selection__Group_5__0__Impl rule__Selection__Group_5__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1959:2: rule__Selection__Group_5__0__Impl rule__Selection__Group_5__1
            {
            pushFollow(FOLLOW_rule__Selection__Group_5__0__Impl_in_rule__Selection__Group_5__04102);
            rule__Selection__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group_5__1_in_rule__Selection__Group_5__04105);
            rule__Selection__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_5__0"


    // $ANTLR start "rule__Selection__Group_5__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1966:1: rule__Selection__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Selection__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1970:1: ( ( ',' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1971:1: ( ',' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1971:1: ( ',' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1972:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getCommaKeyword_5_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Selection__Group_5__0__Impl4133); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getCommaKeyword_5_0()); 
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
    // $ANTLR end "rule__Selection__Group_5__0__Impl"


    // $ANTLR start "rule__Selection__Group_5__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1985:1: rule__Selection__Group_5__1 : rule__Selection__Group_5__1__Impl ;
    public final void rule__Selection__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1989:1: ( rule__Selection__Group_5__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1990:2: rule__Selection__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Selection__Group_5__1__Impl_in_rule__Selection__Group_5__14164);
            rule__Selection__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_5__1"


    // $ANTLR start "rule__Selection__Group_5__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1996:1: rule__Selection__Group_5__1__Impl : ( ( rule__Selection__InputsAssignment_5_1 ) ) ;
    public final void rule__Selection__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2000:1: ( ( ( rule__Selection__InputsAssignment_5_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2001:1: ( ( rule__Selection__InputsAssignment_5_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2001:1: ( ( rule__Selection__InputsAssignment_5_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2002:1: ( rule__Selection__InputsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getInputsAssignment_5_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2003:1: ( rule__Selection__InputsAssignment_5_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2003:2: rule__Selection__InputsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Selection__InputsAssignment_5_1_in_rule__Selection__Group_5__1__Impl4191);
            rule__Selection__InputsAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getInputsAssignment_5_1()); 
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
    // $ANTLR end "rule__Selection__Group_5__1__Impl"


    // $ANTLR start "rule__Selection__Group_10__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2017:1: rule__Selection__Group_10__0 : rule__Selection__Group_10__0__Impl rule__Selection__Group_10__1 ;
    public final void rule__Selection__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2021:1: ( rule__Selection__Group_10__0__Impl rule__Selection__Group_10__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2022:2: rule__Selection__Group_10__0__Impl rule__Selection__Group_10__1
            {
            pushFollow(FOLLOW_rule__Selection__Group_10__0__Impl_in_rule__Selection__Group_10__04225);
            rule__Selection__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group_10__1_in_rule__Selection__Group_10__04228);
            rule__Selection__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_10__0"


    // $ANTLR start "rule__Selection__Group_10__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2029:1: rule__Selection__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Selection__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2033:1: ( ( ',' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2034:1: ( ',' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2034:1: ( ',' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2035:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getCommaKeyword_10_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Selection__Group_10__0__Impl4256); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getCommaKeyword_10_0()); 
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
    // $ANTLR end "rule__Selection__Group_10__0__Impl"


    // $ANTLR start "rule__Selection__Group_10__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2048:1: rule__Selection__Group_10__1 : rule__Selection__Group_10__1__Impl ;
    public final void rule__Selection__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2052:1: ( rule__Selection__Group_10__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2053:2: rule__Selection__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__Selection__Group_10__1__Impl_in_rule__Selection__Group_10__14287);
            rule__Selection__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_10__1"


    // $ANTLR start "rule__Selection__Group_10__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2059:1: rule__Selection__Group_10__1__Impl : ( ( rule__Selection__ParemterExpressionsAssignment_10_1 ) ) ;
    public final void rule__Selection__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2063:1: ( ( ( rule__Selection__ParemterExpressionsAssignment_10_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2064:1: ( ( rule__Selection__ParemterExpressionsAssignment_10_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2064:1: ( ( rule__Selection__ParemterExpressionsAssignment_10_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2065:1: ( rule__Selection__ParemterExpressionsAssignment_10_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getParemterExpressionsAssignment_10_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2066:1: ( rule__Selection__ParemterExpressionsAssignment_10_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2066:2: rule__Selection__ParemterExpressionsAssignment_10_1
            {
            pushFollow(FOLLOW_rule__Selection__ParemterExpressionsAssignment_10_1_in_rule__Selection__Group_10__1__Impl4314);
            rule__Selection__ParemterExpressionsAssignment_10_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getParemterExpressionsAssignment_10_1()); 
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
    // $ANTLR end "rule__Selection__Group_10__1__Impl"


    // $ANTLR start "rule__SelectInput__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2080:1: rule__SelectInput__Group__0 : rule__SelectInput__Group__0__Impl rule__SelectInput__Group__1 ;
    public final void rule__SelectInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2084:1: ( rule__SelectInput__Group__0__Impl rule__SelectInput__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2085:2: rule__SelectInput__Group__0__Impl rule__SelectInput__Group__1
            {
            pushFollow(FOLLOW_rule__SelectInput__Group__0__Impl_in_rule__SelectInput__Group__04348);
            rule__SelectInput__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SelectInput__Group__1_in_rule__SelectInput__Group__04351);
            rule__SelectInput__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectInput__Group__0"


    // $ANTLR start "rule__SelectInput__Group__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2092:1: rule__SelectInput__Group__0__Impl : ( ( rule__SelectInput__RecordTypeAssignment_0 ) ) ;
    public final void rule__SelectInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2096:1: ( ( ( rule__SelectInput__RecordTypeAssignment_0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2097:1: ( ( rule__SelectInput__RecordTypeAssignment_0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2097:1: ( ( rule__SelectInput__RecordTypeAssignment_0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2098:1: ( rule__SelectInput__RecordTypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectInputAccess().getRecordTypeAssignment_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2099:1: ( rule__SelectInput__RecordTypeAssignment_0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2099:2: rule__SelectInput__RecordTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__SelectInput__RecordTypeAssignment_0_in_rule__SelectInput__Group__0__Impl4378);
            rule__SelectInput__RecordTypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectInputAccess().getRecordTypeAssignment_0()); 
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
    // $ANTLR end "rule__SelectInput__Group__0__Impl"


    // $ANTLR start "rule__SelectInput__Group__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2109:1: rule__SelectInput__Group__1 : rule__SelectInput__Group__1__Impl rule__SelectInput__Group__2 ;
    public final void rule__SelectInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2113:1: ( rule__SelectInput__Group__1__Impl rule__SelectInput__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2114:2: rule__SelectInput__Group__1__Impl rule__SelectInput__Group__2
            {
            pushFollow(FOLLOW_rule__SelectInput__Group__1__Impl_in_rule__SelectInput__Group__14408);
            rule__SelectInput__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SelectInput__Group__2_in_rule__SelectInput__Group__14411);
            rule__SelectInput__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectInput__Group__1"


    // $ANTLR start "rule__SelectInput__Group__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2121:1: rule__SelectInput__Group__1__Impl : ( ( rule__SelectInput__NameAssignment_1 ) ) ;
    public final void rule__SelectInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2125:1: ( ( ( rule__SelectInput__NameAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2126:1: ( ( rule__SelectInput__NameAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2126:1: ( ( rule__SelectInput__NameAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2127:1: ( rule__SelectInput__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectInputAccess().getNameAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2128:1: ( rule__SelectInput__NameAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2128:2: rule__SelectInput__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SelectInput__NameAssignment_1_in_rule__SelectInput__Group__1__Impl4438);
            rule__SelectInput__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectInputAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__SelectInput__Group__1__Impl"


    // $ANTLR start "rule__SelectInput__Group__2"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2138:1: rule__SelectInput__Group__2 : rule__SelectInput__Group__2__Impl ;
    public final void rule__SelectInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2142:1: ( rule__SelectInput__Group__2__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2143:2: rule__SelectInput__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SelectInput__Group__2__Impl_in_rule__SelectInput__Group__24468);
            rule__SelectInput__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectInput__Group__2"


    // $ANTLR start "rule__SelectInput__Group__2__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2149:1: rule__SelectInput__Group__2__Impl : ( ( rule__SelectInput__Group_2__0 )? ) ;
    public final void rule__SelectInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2153:1: ( ( ( rule__SelectInput__Group_2__0 )? ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2154:1: ( ( rule__SelectInput__Group_2__0 )? )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2154:1: ( ( rule__SelectInput__Group_2__0 )? )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2155:1: ( rule__SelectInput__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectInputAccess().getGroup_2()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2156:1: ( rule__SelectInput__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2156:2: rule__SelectInput__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SelectInput__Group_2__0_in_rule__SelectInput__Group__2__Impl4495);
                    rule__SelectInput__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectInputAccess().getGroup_2()); 
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
    // $ANTLR end "rule__SelectInput__Group__2__Impl"


    // $ANTLR start "rule__SelectInput__Group_2__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2172:1: rule__SelectInput__Group_2__0 : rule__SelectInput__Group_2__0__Impl rule__SelectInput__Group_2__1 ;
    public final void rule__SelectInput__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2176:1: ( rule__SelectInput__Group_2__0__Impl rule__SelectInput__Group_2__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2177:2: rule__SelectInput__Group_2__0__Impl rule__SelectInput__Group_2__1
            {
            pushFollow(FOLLOW_rule__SelectInput__Group_2__0__Impl_in_rule__SelectInput__Group_2__04532);
            rule__SelectInput__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SelectInput__Group_2__1_in_rule__SelectInput__Group_2__04535);
            rule__SelectInput__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectInput__Group_2__0"


    // $ANTLR start "rule__SelectInput__Group_2__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2184:1: rule__SelectInput__Group_2__0__Impl : ( ':' ) ;
    public final void rule__SelectInput__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2188:1: ( ( ':' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2189:1: ( ':' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2189:1: ( ':' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2190:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectInputAccess().getColonKeyword_2_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__SelectInput__Group_2__0__Impl4563); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectInputAccess().getColonKeyword_2_0()); 
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
    // $ANTLR end "rule__SelectInput__Group_2__0__Impl"


    // $ANTLR start "rule__SelectInput__Group_2__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2203:1: rule__SelectInput__Group_2__1 : rule__SelectInput__Group_2__1__Impl ;
    public final void rule__SelectInput__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2207:1: ( rule__SelectInput__Group_2__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2208:2: rule__SelectInput__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SelectInput__Group_2__1__Impl_in_rule__SelectInput__Group_2__14594);
            rule__SelectInput__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectInput__Group_2__1"


    // $ANTLR start "rule__SelectInput__Group_2__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2214:1: rule__SelectInput__Group_2__1__Impl : ( ( rule__SelectInput__SelectConstraintAssignment_2_1 ) ) ;
    public final void rule__SelectInput__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2218:1: ( ( ( rule__SelectInput__SelectConstraintAssignment_2_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2219:1: ( ( rule__SelectInput__SelectConstraintAssignment_2_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2219:1: ( ( rule__SelectInput__SelectConstraintAssignment_2_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2220:1: ( rule__SelectInput__SelectConstraintAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectInputAccess().getSelectConstraintAssignment_2_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2221:1: ( rule__SelectInput__SelectConstraintAssignment_2_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2221:2: rule__SelectInput__SelectConstraintAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SelectInput__SelectConstraintAssignment_2_1_in_rule__SelectInput__Group_2__1__Impl4621);
            rule__SelectInput__SelectConstraintAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectInputAccess().getSelectConstraintAssignment_2_1()); 
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
    // $ANTLR end "rule__SelectInput__Group_2__1__Impl"


    // $ANTLR start "rule__SelectConstaintExpression__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2235:1: rule__SelectConstaintExpression__Group__0 : rule__SelectConstaintExpression__Group__0__Impl rule__SelectConstaintExpression__Group__1 ;
    public final void rule__SelectConstaintExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2239:1: ( rule__SelectConstaintExpression__Group__0__Impl rule__SelectConstaintExpression__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2240:2: rule__SelectConstaintExpression__Group__0__Impl rule__SelectConstaintExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group__0__Impl_in_rule__SelectConstaintExpression__Group__04655);
            rule__SelectConstaintExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group__1_in_rule__SelectConstaintExpression__Group__04658);
            rule__SelectConstaintExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectConstaintExpression__Group__0"


    // $ANTLR start "rule__SelectConstaintExpression__Group__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2247:1: rule__SelectConstaintExpression__Group__0__Impl : ( ruleBasicSelectConstraint ) ;
    public final void rule__SelectConstaintExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2251:1: ( ( ruleBasicSelectConstraint ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2252:1: ( ruleBasicSelectConstraint )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2252:1: ( ruleBasicSelectConstraint )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2253:1: ruleBasicSelectConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstaintExpressionAccess().getBasicSelectConstraintParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBasicSelectConstraint_in_rule__SelectConstaintExpression__Group__0__Impl4685);
            ruleBasicSelectConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectConstaintExpressionAccess().getBasicSelectConstraintParserRuleCall_0()); 
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
    // $ANTLR end "rule__SelectConstaintExpression__Group__0__Impl"


    // $ANTLR start "rule__SelectConstaintExpression__Group__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2264:1: rule__SelectConstaintExpression__Group__1 : rule__SelectConstaintExpression__Group__1__Impl ;
    public final void rule__SelectConstaintExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2268:1: ( rule__SelectConstaintExpression__Group__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2269:2: rule__SelectConstaintExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group__1__Impl_in_rule__SelectConstaintExpression__Group__14714);
            rule__SelectConstaintExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectConstaintExpression__Group__1"


    // $ANTLR start "rule__SelectConstaintExpression__Group__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2275:1: rule__SelectConstaintExpression__Group__1__Impl : ( ( rule__SelectConstaintExpression__Group_1__0 )? ) ;
    public final void rule__SelectConstaintExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2279:1: ( ( ( rule__SelectConstaintExpression__Group_1__0 )? ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2280:1: ( ( rule__SelectConstaintExpression__Group_1__0 )? )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2280:1: ( ( rule__SelectConstaintExpression__Group_1__0 )? )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2281:1: ( rule__SelectConstaintExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstaintExpressionAccess().getGroup_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2282:1: ( rule__SelectConstaintExpression__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=16 && LA17_0<=17)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2282:2: rule__SelectConstaintExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SelectConstaintExpression__Group_1__0_in_rule__SelectConstaintExpression__Group__1__Impl4741);
                    rule__SelectConstaintExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectConstaintExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__SelectConstaintExpression__Group__1__Impl"


    // $ANTLR start "rule__SelectConstaintExpression__Group_1__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2296:1: rule__SelectConstaintExpression__Group_1__0 : rule__SelectConstaintExpression__Group_1__0__Impl rule__SelectConstaintExpression__Group_1__1 ;
    public final void rule__SelectConstaintExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2300:1: ( rule__SelectConstaintExpression__Group_1__0__Impl rule__SelectConstaintExpression__Group_1__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2301:2: rule__SelectConstaintExpression__Group_1__0__Impl rule__SelectConstaintExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group_1__0__Impl_in_rule__SelectConstaintExpression__Group_1__04776);
            rule__SelectConstaintExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group_1__1_in_rule__SelectConstaintExpression__Group_1__04779);
            rule__SelectConstaintExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectConstaintExpression__Group_1__0"


    // $ANTLR start "rule__SelectConstaintExpression__Group_1__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2308:1: rule__SelectConstaintExpression__Group_1__0__Impl : ( ( rule__SelectConstaintExpression__Group_1_0__0 ) ) ;
    public final void rule__SelectConstaintExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2312:1: ( ( ( rule__SelectConstaintExpression__Group_1_0__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2313:1: ( ( rule__SelectConstaintExpression__Group_1_0__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2313:1: ( ( rule__SelectConstaintExpression__Group_1_0__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2314:1: ( rule__SelectConstaintExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstaintExpressionAccess().getGroup_1_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2315:1: ( rule__SelectConstaintExpression__Group_1_0__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2315:2: rule__SelectConstaintExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group_1_0__0_in_rule__SelectConstaintExpression__Group_1__0__Impl4806);
            rule__SelectConstaintExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectConstaintExpressionAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__SelectConstaintExpression__Group_1__0__Impl"


    // $ANTLR start "rule__SelectConstaintExpression__Group_1__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2325:1: rule__SelectConstaintExpression__Group_1__1 : rule__SelectConstaintExpression__Group_1__1__Impl ;
    public final void rule__SelectConstaintExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2329:1: ( rule__SelectConstaintExpression__Group_1__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2330:2: rule__SelectConstaintExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group_1__1__Impl_in_rule__SelectConstaintExpression__Group_1__14836);
            rule__SelectConstaintExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectConstaintExpression__Group_1__1"


    // $ANTLR start "rule__SelectConstaintExpression__Group_1__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2336:1: rule__SelectConstaintExpression__Group_1__1__Impl : ( ( rule__SelectConstaintExpression__RightAssignment_1_1 ) ) ;
    public final void rule__SelectConstaintExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2340:1: ( ( ( rule__SelectConstaintExpression__RightAssignment_1_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2341:1: ( ( rule__SelectConstaintExpression__RightAssignment_1_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2341:1: ( ( rule__SelectConstaintExpression__RightAssignment_1_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2342:1: ( rule__SelectConstaintExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstaintExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2343:1: ( rule__SelectConstaintExpression__RightAssignment_1_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2343:2: rule__SelectConstaintExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SelectConstaintExpression__RightAssignment_1_1_in_rule__SelectConstaintExpression__Group_1__1__Impl4863);
            rule__SelectConstaintExpression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectConstaintExpressionAccess().getRightAssignment_1_1()); 
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
    // $ANTLR end "rule__SelectConstaintExpression__Group_1__1__Impl"


    // $ANTLR start "rule__SelectConstaintExpression__Group_1_0__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2357:1: rule__SelectConstaintExpression__Group_1_0__0 : rule__SelectConstaintExpression__Group_1_0__0__Impl ;
    public final void rule__SelectConstaintExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2361:1: ( rule__SelectConstaintExpression__Group_1_0__0__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2362:2: rule__SelectConstaintExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group_1_0__0__Impl_in_rule__SelectConstaintExpression__Group_1_0__04897);
            rule__SelectConstaintExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectConstaintExpression__Group_1_0__0"


    // $ANTLR start "rule__SelectConstaintExpression__Group_1_0__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2368:1: rule__SelectConstaintExpression__Group_1_0__0__Impl : ( ( rule__SelectConstaintExpression__Group_1_0_0__0 ) ) ;
    public final void rule__SelectConstaintExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2372:1: ( ( ( rule__SelectConstaintExpression__Group_1_0_0__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2373:1: ( ( rule__SelectConstaintExpression__Group_1_0_0__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2373:1: ( ( rule__SelectConstaintExpression__Group_1_0_0__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2374:1: ( rule__SelectConstaintExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstaintExpressionAccess().getGroup_1_0_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2375:1: ( rule__SelectConstaintExpression__Group_1_0_0__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2375:2: rule__SelectConstaintExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group_1_0_0__0_in_rule__SelectConstaintExpression__Group_1_0__0__Impl4924);
            rule__SelectConstaintExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectConstaintExpressionAccess().getGroup_1_0_0()); 
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
    // $ANTLR end "rule__SelectConstaintExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__SelectConstaintExpression__Group_1_0_0__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2387:1: rule__SelectConstaintExpression__Group_1_0_0__0 : rule__SelectConstaintExpression__Group_1_0_0__0__Impl rule__SelectConstaintExpression__Group_1_0_0__1 ;
    public final void rule__SelectConstaintExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2391:1: ( rule__SelectConstaintExpression__Group_1_0_0__0__Impl rule__SelectConstaintExpression__Group_1_0_0__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2392:2: rule__SelectConstaintExpression__Group_1_0_0__0__Impl rule__SelectConstaintExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group_1_0_0__0__Impl_in_rule__SelectConstaintExpression__Group_1_0_0__04956);
            rule__SelectConstaintExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group_1_0_0__1_in_rule__SelectConstaintExpression__Group_1_0_0__04959);
            rule__SelectConstaintExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectConstaintExpression__Group_1_0_0__0"


    // $ANTLR start "rule__SelectConstaintExpression__Group_1_0_0__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2399:1: rule__SelectConstaintExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__SelectConstaintExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2403:1: ( ( () ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2404:1: ( () )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2404:1: ( () )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2405:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstaintExpressionAccess().getSelectConstaintExpressionLeftAction_1_0_0_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2406:1: ()
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2408:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectConstaintExpressionAccess().getSelectConstaintExpressionLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectConstaintExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__SelectConstaintExpression__Group_1_0_0__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2418:1: rule__SelectConstaintExpression__Group_1_0_0__1 : rule__SelectConstaintExpression__Group_1_0_0__1__Impl ;
    public final void rule__SelectConstaintExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2422:1: ( rule__SelectConstaintExpression__Group_1_0_0__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2423:2: rule__SelectConstaintExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group_1_0_0__1__Impl_in_rule__SelectConstaintExpression__Group_1_0_0__15017);
            rule__SelectConstaintExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectConstaintExpression__Group_1_0_0__1"


    // $ANTLR start "rule__SelectConstaintExpression__Group_1_0_0__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2429:1: rule__SelectConstaintExpression__Group_1_0_0__1__Impl : ( ( rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__SelectConstaintExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2433:1: ( ( ( rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2434:1: ( ( rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2434:1: ( ( rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2435:1: ( rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstaintExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2436:1: ( rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2436:2: rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1_in_rule__SelectConstaintExpression__Group_1_0_0__1__Impl5044);
            rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectConstaintExpressionAccess().getOperatorAssignment_1_0_0_1()); 
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
    // $ANTLR end "rule__SelectConstaintExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__ParenthesisSelectConstraint__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2450:1: rule__ParenthesisSelectConstraint__Group__0 : rule__ParenthesisSelectConstraint__Group__0__Impl rule__ParenthesisSelectConstraint__Group__1 ;
    public final void rule__ParenthesisSelectConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2454:1: ( rule__ParenthesisSelectConstraint__Group__0__Impl rule__ParenthesisSelectConstraint__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2455:2: rule__ParenthesisSelectConstraint__Group__0__Impl rule__ParenthesisSelectConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__ParenthesisSelectConstraint__Group__0__Impl_in_rule__ParenthesisSelectConstraint__Group__05078);
            rule__ParenthesisSelectConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisSelectConstraint__Group__1_in_rule__ParenthesisSelectConstraint__Group__05081);
            rule__ParenthesisSelectConstraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisSelectConstraint__Group__0"


    // $ANTLR start "rule__ParenthesisSelectConstraint__Group__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2462:1: rule__ParenthesisSelectConstraint__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesisSelectConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2466:1: ( ( '(' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2467:1: ( '(' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2467:1: ( '(' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2468:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisSelectConstraintAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__ParenthesisSelectConstraint__Group__0__Impl5109); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisSelectConstraintAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__ParenthesisSelectConstraint__Group__0__Impl"


    // $ANTLR start "rule__ParenthesisSelectConstraint__Group__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2481:1: rule__ParenthesisSelectConstraint__Group__1 : rule__ParenthesisSelectConstraint__Group__1__Impl rule__ParenthesisSelectConstraint__Group__2 ;
    public final void rule__ParenthesisSelectConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2485:1: ( rule__ParenthesisSelectConstraint__Group__1__Impl rule__ParenthesisSelectConstraint__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2486:2: rule__ParenthesisSelectConstraint__Group__1__Impl rule__ParenthesisSelectConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__ParenthesisSelectConstraint__Group__1__Impl_in_rule__ParenthesisSelectConstraint__Group__15140);
            rule__ParenthesisSelectConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisSelectConstraint__Group__2_in_rule__ParenthesisSelectConstraint__Group__15143);
            rule__ParenthesisSelectConstraint__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisSelectConstraint__Group__1"


    // $ANTLR start "rule__ParenthesisSelectConstraint__Group__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2493:1: rule__ParenthesisSelectConstraint__Group__1__Impl : ( ( rule__ParenthesisSelectConstraint__ConstraintAssignment_1 ) ) ;
    public final void rule__ParenthesisSelectConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2497:1: ( ( ( rule__ParenthesisSelectConstraint__ConstraintAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2498:1: ( ( rule__ParenthesisSelectConstraint__ConstraintAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2498:1: ( ( rule__ParenthesisSelectConstraint__ConstraintAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2499:1: ( rule__ParenthesisSelectConstraint__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisSelectConstraintAccess().getConstraintAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2500:1: ( rule__ParenthesisSelectConstraint__ConstraintAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2500:2: rule__ParenthesisSelectConstraint__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__ParenthesisSelectConstraint__ConstraintAssignment_1_in_rule__ParenthesisSelectConstraint__Group__1__Impl5170);
            rule__ParenthesisSelectConstraint__ConstraintAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisSelectConstraintAccess().getConstraintAssignment_1()); 
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
    // $ANTLR end "rule__ParenthesisSelectConstraint__Group__1__Impl"


    // $ANTLR start "rule__ParenthesisSelectConstraint__Group__2"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2510:1: rule__ParenthesisSelectConstraint__Group__2 : rule__ParenthesisSelectConstraint__Group__2__Impl ;
    public final void rule__ParenthesisSelectConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2514:1: ( rule__ParenthesisSelectConstraint__Group__2__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2515:2: rule__ParenthesisSelectConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParenthesisSelectConstraint__Group__2__Impl_in_rule__ParenthesisSelectConstraint__Group__25200);
            rule__ParenthesisSelectConstraint__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisSelectConstraint__Group__2"


    // $ANTLR start "rule__ParenthesisSelectConstraint__Group__2__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2521:1: rule__ParenthesisSelectConstraint__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesisSelectConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2525:1: ( ( ')' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2526:1: ( ')' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2526:1: ( ')' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2527:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisSelectConstraintAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__ParenthesisSelectConstraint__Group__2__Impl5228); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisSelectConstraintAccess().getRightParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__ParenthesisSelectConstraint__Group__2__Impl"


    // $ANTLR start "rule__SelectConstraint__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2546:1: rule__SelectConstraint__Group__0 : rule__SelectConstraint__Group__0__Impl rule__SelectConstraint__Group__1 ;
    public final void rule__SelectConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2550:1: ( rule__SelectConstraint__Group__0__Impl rule__SelectConstraint__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2551:2: rule__SelectConstraint__Group__0__Impl rule__SelectConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__SelectConstraint__Group__0__Impl_in_rule__SelectConstraint__Group__05265);
            rule__SelectConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SelectConstraint__Group__1_in_rule__SelectConstraint__Group__05268);
            rule__SelectConstraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectConstraint__Group__0"


    // $ANTLR start "rule__SelectConstraint__Group__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2558:1: rule__SelectConstraint__Group__0__Impl : ( ( rule__SelectConstraint__LeftAssignment_0 ) ) ;
    public final void rule__SelectConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2562:1: ( ( ( rule__SelectConstraint__LeftAssignment_0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2563:1: ( ( rule__SelectConstraint__LeftAssignment_0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2563:1: ( ( rule__SelectConstraint__LeftAssignment_0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2564:1: ( rule__SelectConstraint__LeftAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstraintAccess().getLeftAssignment_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2565:1: ( rule__SelectConstraint__LeftAssignment_0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2565:2: rule__SelectConstraint__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__SelectConstraint__LeftAssignment_0_in_rule__SelectConstraint__Group__0__Impl5295);
            rule__SelectConstraint__LeftAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectConstraintAccess().getLeftAssignment_0()); 
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
    // $ANTLR end "rule__SelectConstraint__Group__0__Impl"


    // $ANTLR start "rule__SelectConstraint__Group__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2575:1: rule__SelectConstraint__Group__1 : rule__SelectConstraint__Group__1__Impl rule__SelectConstraint__Group__2 ;
    public final void rule__SelectConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2579:1: ( rule__SelectConstraint__Group__1__Impl rule__SelectConstraint__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2580:2: rule__SelectConstraint__Group__1__Impl rule__SelectConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__SelectConstraint__Group__1__Impl_in_rule__SelectConstraint__Group__15325);
            rule__SelectConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SelectConstraint__Group__2_in_rule__SelectConstraint__Group__15328);
            rule__SelectConstraint__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectConstraint__Group__1"


    // $ANTLR start "rule__SelectConstraint__Group__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2587:1: rule__SelectConstraint__Group__1__Impl : ( ( rule__SelectConstraint__ComperatorAssignment_1 ) ) ;
    public final void rule__SelectConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2591:1: ( ( ( rule__SelectConstraint__ComperatorAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2592:1: ( ( rule__SelectConstraint__ComperatorAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2592:1: ( ( rule__SelectConstraint__ComperatorAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2593:1: ( rule__SelectConstraint__ComperatorAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstraintAccess().getComperatorAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2594:1: ( rule__SelectConstraint__ComperatorAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2594:2: rule__SelectConstraint__ComperatorAssignment_1
            {
            pushFollow(FOLLOW_rule__SelectConstraint__ComperatorAssignment_1_in_rule__SelectConstraint__Group__1__Impl5355);
            rule__SelectConstraint__ComperatorAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectConstraintAccess().getComperatorAssignment_1()); 
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
    // $ANTLR end "rule__SelectConstraint__Group__1__Impl"


    // $ANTLR start "rule__SelectConstraint__Group__2"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2604:1: rule__SelectConstraint__Group__2 : rule__SelectConstraint__Group__2__Impl ;
    public final void rule__SelectConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2608:1: ( rule__SelectConstraint__Group__2__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2609:2: rule__SelectConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SelectConstraint__Group__2__Impl_in_rule__SelectConstraint__Group__25385);
            rule__SelectConstraint__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectConstraint__Group__2"


    // $ANTLR start "rule__SelectConstraint__Group__2__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2615:1: rule__SelectConstraint__Group__2__Impl : ( ( rule__SelectConstraint__RightAssignment_2 ) ) ;
    public final void rule__SelectConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2619:1: ( ( ( rule__SelectConstraint__RightAssignment_2 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2620:1: ( ( rule__SelectConstraint__RightAssignment_2 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2620:1: ( ( rule__SelectConstraint__RightAssignment_2 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2621:1: ( rule__SelectConstraint__RightAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstraintAccess().getRightAssignment_2()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2622:1: ( rule__SelectConstraint__RightAssignment_2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2622:2: rule__SelectConstraint__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__SelectConstraint__RightAssignment_2_in_rule__SelectConstraint__Group__2__Impl5412);
            rule__SelectConstraint__RightAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectConstraintAccess().getRightAssignment_2()); 
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
    // $ANTLR end "rule__SelectConstraint__Group__2__Impl"


    // $ANTLR start "rule__ParameterExpression__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2638:1: rule__ParameterExpression__Group__0 : rule__ParameterExpression__Group__0__Impl rule__ParameterExpression__Group__1 ;
    public final void rule__ParameterExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2642:1: ( rule__ParameterExpression__Group__0__Impl rule__ParameterExpression__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2643:2: rule__ParameterExpression__Group__0__Impl rule__ParameterExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterExpression__Group__0__Impl_in_rule__ParameterExpression__Group__05448);
            rule__ParameterExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterExpression__Group__1_in_rule__ParameterExpression__Group__05451);
            rule__ParameterExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterExpression__Group__0"


    // $ANTLR start "rule__ParameterExpression__Group__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2650:1: rule__ParameterExpression__Group__0__Impl : ( ( rule__ParameterExpression__Group_0__0 )? ) ;
    public final void rule__ParameterExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2654:1: ( ( ( rule__ParameterExpression__Group_0__0 )? ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2655:1: ( ( rule__ParameterExpression__Group_0__0 )? )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2655:1: ( ( rule__ParameterExpression__Group_0__0 )? )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2656:1: ( rule__ParameterExpression__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterExpressionAccess().getGroup_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2657:1: ( rule__ParameterExpression__Group_0__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==33) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2657:2: rule__ParameterExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ParameterExpression__Group_0__0_in_rule__ParameterExpression__Group__0__Impl5478);
                    rule__ParameterExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterExpressionAccess().getGroup_0()); 
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
    // $ANTLR end "rule__ParameterExpression__Group__0__Impl"


    // $ANTLR start "rule__ParameterExpression__Group__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2667:1: rule__ParameterExpression__Group__1 : rule__ParameterExpression__Group__1__Impl ;
    public final void rule__ParameterExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2671:1: ( rule__ParameterExpression__Group__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2672:2: rule__ParameterExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterExpression__Group__1__Impl_in_rule__ParameterExpression__Group__15509);
            rule__ParameterExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterExpression__Group__1"


    // $ANTLR start "rule__ParameterExpression__Group__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2678:1: rule__ParameterExpression__Group__1__Impl : ( ( rule__ParameterExpression__PropertyReferenceAssignment_1 ) ) ;
    public final void rule__ParameterExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2682:1: ( ( ( rule__ParameterExpression__PropertyReferenceAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2683:1: ( ( rule__ParameterExpression__PropertyReferenceAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2683:1: ( ( rule__ParameterExpression__PropertyReferenceAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2684:1: ( rule__ParameterExpression__PropertyReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterExpressionAccess().getPropertyReferenceAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2685:1: ( rule__ParameterExpression__PropertyReferenceAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2685:2: rule__ParameterExpression__PropertyReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__ParameterExpression__PropertyReferenceAssignment_1_in_rule__ParameterExpression__Group__1__Impl5536);
            rule__ParameterExpression__PropertyReferenceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterExpressionAccess().getPropertyReferenceAssignment_1()); 
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
    // $ANTLR end "rule__ParameterExpression__Group__1__Impl"


    // $ANTLR start "rule__ParameterExpression__Group_0__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2699:1: rule__ParameterExpression__Group_0__0 : rule__ParameterExpression__Group_0__0__Impl rule__ParameterExpression__Group_0__1 ;
    public final void rule__ParameterExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2703:1: ( rule__ParameterExpression__Group_0__0__Impl rule__ParameterExpression__Group_0__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2704:2: rule__ParameterExpression__Group_0__0__Impl rule__ParameterExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__ParameterExpression__Group_0__0__Impl_in_rule__ParameterExpression__Group_0__05570);
            rule__ParameterExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterExpression__Group_0__1_in_rule__ParameterExpression__Group_0__05573);
            rule__ParameterExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterExpression__Group_0__0"


    // $ANTLR start "rule__ParameterExpression__Group_0__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2711:1: rule__ParameterExpression__Group_0__0__Impl : ( ( rule__ParameterExpression__InputAssignment_0_0 ) ) ;
    public final void rule__ParameterExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2715:1: ( ( ( rule__ParameterExpression__InputAssignment_0_0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2716:1: ( ( rule__ParameterExpression__InputAssignment_0_0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2716:1: ( ( rule__ParameterExpression__InputAssignment_0_0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2717:1: ( rule__ParameterExpression__InputAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterExpressionAccess().getInputAssignment_0_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2718:1: ( rule__ParameterExpression__InputAssignment_0_0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2718:2: rule__ParameterExpression__InputAssignment_0_0
            {
            pushFollow(FOLLOW_rule__ParameterExpression__InputAssignment_0_0_in_rule__ParameterExpression__Group_0__0__Impl5600);
            rule__ParameterExpression__InputAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterExpressionAccess().getInputAssignment_0_0()); 
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
    // $ANTLR end "rule__ParameterExpression__Group_0__0__Impl"


    // $ANTLR start "rule__ParameterExpression__Group_0__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2728:1: rule__ParameterExpression__Group_0__1 : rule__ParameterExpression__Group_0__1__Impl ;
    public final void rule__ParameterExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2732:1: ( rule__ParameterExpression__Group_0__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2733:2: rule__ParameterExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterExpression__Group_0__1__Impl_in_rule__ParameterExpression__Group_0__15630);
            rule__ParameterExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterExpression__Group_0__1"


    // $ANTLR start "rule__ParameterExpression__Group_0__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2739:1: rule__ParameterExpression__Group_0__1__Impl : ( '.' ) ;
    public final void rule__ParameterExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2743:1: ( ( '.' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2744:1: ( '.' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2744:1: ( '.' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2745:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterExpressionAccess().getFullStopKeyword_0_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__ParameterExpression__Group_0__1__Impl5658); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterExpressionAccess().getFullStopKeyword_0_1()); 
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
    // $ANTLR end "rule__ParameterExpression__Group_0__1__Impl"


    // $ANTLR start "rule__Filter__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2762:1: rule__Filter__Group__0 : rule__Filter__Group__0__Impl rule__Filter__Group__1 ;
    public final void rule__Filter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2766:1: ( rule__Filter__Group__0__Impl rule__Filter__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2767:2: rule__Filter__Group__0__Impl rule__Filter__Group__1
            {
            pushFollow(FOLLOW_rule__Filter__Group__0__Impl_in_rule__Filter__Group__05693);
            rule__Filter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Filter__Group__1_in_rule__Filter__Group__05696);
            rule__Filter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__0"


    // $ANTLR start "rule__Filter__Group__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2774:1: rule__Filter__Group__0__Impl : ( 'filter' ) ;
    public final void rule__Filter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2778:1: ( ( 'filter' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2779:1: ( 'filter' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2779:1: ( 'filter' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2780:1: 'filter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFilterAccess().getFilterKeyword_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Filter__Group__0__Impl5724); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFilterAccess().getFilterKeyword_0()); 
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
    // $ANTLR end "rule__Filter__Group__0__Impl"


    // $ANTLR start "rule__Filter__Group__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2793:1: rule__Filter__Group__1 : rule__Filter__Group__1__Impl rule__Filter__Group__2 ;
    public final void rule__Filter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2797:1: ( rule__Filter__Group__1__Impl rule__Filter__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2798:2: rule__Filter__Group__1__Impl rule__Filter__Group__2
            {
            pushFollow(FOLLOW_rule__Filter__Group__1__Impl_in_rule__Filter__Group__15755);
            rule__Filter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Filter__Group__2_in_rule__Filter__Group__15758);
            rule__Filter__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__1"


    // $ANTLR start "rule__Filter__Group__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2805:1: rule__Filter__Group__1__Impl : ( ( rule__Filter__NameAssignment_1 ) ) ;
    public final void rule__Filter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2809:1: ( ( ( rule__Filter__NameAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2810:1: ( ( rule__Filter__NameAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2810:1: ( ( rule__Filter__NameAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2811:1: ( rule__Filter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFilterAccess().getNameAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2812:1: ( rule__Filter__NameAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2812:2: rule__Filter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Filter__NameAssignment_1_in_rule__Filter__Group__1__Impl5785);
            rule__Filter__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFilterAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Filter__Group__1__Impl"


    // $ANTLR start "rule__Filter__Group__2"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2822:1: rule__Filter__Group__2 : rule__Filter__Group__2__Impl rule__Filter__Group__3 ;
    public final void rule__Filter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2826:1: ( rule__Filter__Group__2__Impl rule__Filter__Group__3 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2827:2: rule__Filter__Group__2__Impl rule__Filter__Group__3
            {
            pushFollow(FOLLOW_rule__Filter__Group__2__Impl_in_rule__Filter__Group__25815);
            rule__Filter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Filter__Group__3_in_rule__Filter__Group__25818);
            rule__Filter__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__2"


    // $ANTLR start "rule__Filter__Group__2__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2834:1: rule__Filter__Group__2__Impl : ( ( rule__Filter__SourceReferenceAssignment_2 ) ) ;
    public final void rule__Filter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2838:1: ( ( ( rule__Filter__SourceReferenceAssignment_2 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2839:1: ( ( rule__Filter__SourceReferenceAssignment_2 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2839:1: ( ( rule__Filter__SourceReferenceAssignment_2 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2840:1: ( rule__Filter__SourceReferenceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFilterAccess().getSourceReferenceAssignment_2()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2841:1: ( rule__Filter__SourceReferenceAssignment_2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2841:2: rule__Filter__SourceReferenceAssignment_2
            {
            pushFollow(FOLLOW_rule__Filter__SourceReferenceAssignment_2_in_rule__Filter__Group__2__Impl5845);
            rule__Filter__SourceReferenceAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFilterAccess().getSourceReferenceAssignment_2()); 
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
    // $ANTLR end "rule__Filter__Group__2__Impl"


    // $ANTLR start "rule__Filter__Group__3"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2851:1: rule__Filter__Group__3 : rule__Filter__Group__3__Impl ;
    public final void rule__Filter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2855:1: ( rule__Filter__Group__3__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2856:2: rule__Filter__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Filter__Group__3__Impl_in_rule__Filter__Group__35875);
            rule__Filter__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__3"


    // $ANTLR start "rule__Filter__Group__3__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2862:1: rule__Filter__Group__3__Impl : ( ( rule__Filter__ConstraintAssignment_3 ) ) ;
    public final void rule__Filter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2866:1: ( ( ( rule__Filter__ConstraintAssignment_3 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2867:1: ( ( rule__Filter__ConstraintAssignment_3 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2867:1: ( ( rule__Filter__ConstraintAssignment_3 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2868:1: ( rule__Filter__ConstraintAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFilterAccess().getConstraintAssignment_3()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2869:1: ( rule__Filter__ConstraintAssignment_3 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2869:2: rule__Filter__ConstraintAssignment_3
            {
            pushFollow(FOLLOW_rule__Filter__ConstraintAssignment_3_in_rule__Filter__Group__3__Impl5902);
            rule__Filter__ConstraintAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFilterAccess().getConstraintAssignment_3()); 
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
    // $ANTLR end "rule__Filter__Group__3__Impl"


    // $ANTLR start "rule__ConstraintExpression__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2887:1: rule__ConstraintExpression__Group__0 : rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1 ;
    public final void rule__ConstraintExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2891:1: ( rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2892:2: rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__0__Impl_in_rule__ConstraintExpression__Group__05940);
            rule__ConstraintExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__1_in_rule__ConstraintExpression__Group__05943);
            rule__ConstraintExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group__0"


    // $ANTLR start "rule__ConstraintExpression__Group__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2899:1: rule__ConstraintExpression__Group__0__Impl : ( ruleBasicConstraint ) ;
    public final void rule__ConstraintExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2903:1: ( ( ruleBasicConstraint ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2904:1: ( ruleBasicConstraint )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2904:1: ( ruleBasicConstraint )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2905:1: ruleBasicConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getBasicConstraintParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBasicConstraint_in_rule__ConstraintExpression__Group__0__Impl5970);
            ruleBasicConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionAccess().getBasicConstraintParserRuleCall_0()); 
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
    // $ANTLR end "rule__ConstraintExpression__Group__0__Impl"


    // $ANTLR start "rule__ConstraintExpression__Group__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2916:1: rule__ConstraintExpression__Group__1 : rule__ConstraintExpression__Group__1__Impl ;
    public final void rule__ConstraintExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2920:1: ( rule__ConstraintExpression__Group__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2921:2: rule__ConstraintExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__1__Impl_in_rule__ConstraintExpression__Group__15999);
            rule__ConstraintExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group__1"


    // $ANTLR start "rule__ConstraintExpression__Group__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2927:1: rule__ConstraintExpression__Group__1__Impl : ( ( rule__ConstraintExpression__Group_1__0 )? ) ;
    public final void rule__ConstraintExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2931:1: ( ( ( rule__ConstraintExpression__Group_1__0 )? ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2932:1: ( ( rule__ConstraintExpression__Group_1__0 )? )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2932:1: ( ( rule__ConstraintExpression__Group_1__0 )? )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2933:1: ( rule__ConstraintExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2934:1: ( rule__ConstraintExpression__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=16 && LA19_0<=17)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2934:2: rule__ConstraintExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__0_in_rule__ConstraintExpression__Group__1__Impl6026);
                    rule__ConstraintExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__ConstraintExpression__Group__1__Impl"


    // $ANTLR start "rule__ConstraintExpression__Group_1__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2948:1: rule__ConstraintExpression__Group_1__0 : rule__ConstraintExpression__Group_1__0__Impl rule__ConstraintExpression__Group_1__1 ;
    public final void rule__ConstraintExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2952:1: ( rule__ConstraintExpression__Group_1__0__Impl rule__ConstraintExpression__Group_1__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2953:2: rule__ConstraintExpression__Group_1__0__Impl rule__ConstraintExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__0__Impl_in_rule__ConstraintExpression__Group_1__06061);
            rule__ConstraintExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__1_in_rule__ConstraintExpression__Group_1__06064);
            rule__ConstraintExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group_1__0"


    // $ANTLR start "rule__ConstraintExpression__Group_1__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2960:1: rule__ConstraintExpression__Group_1__0__Impl : ( ( rule__ConstraintExpression__Group_1_0__0 ) ) ;
    public final void rule__ConstraintExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2964:1: ( ( ( rule__ConstraintExpression__Group_1_0__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2965:1: ( ( rule__ConstraintExpression__Group_1_0__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2965:1: ( ( rule__ConstraintExpression__Group_1_0__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2966:1: ( rule__ConstraintExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup_1_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2967:1: ( rule__ConstraintExpression__Group_1_0__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2967:2: rule__ConstraintExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0__0_in_rule__ConstraintExpression__Group_1__0__Impl6091);
            rule__ConstraintExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__ConstraintExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ConstraintExpression__Group_1__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2977:1: rule__ConstraintExpression__Group_1__1 : rule__ConstraintExpression__Group_1__1__Impl ;
    public final void rule__ConstraintExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2981:1: ( rule__ConstraintExpression__Group_1__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2982:2: rule__ConstraintExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__1__Impl_in_rule__ConstraintExpression__Group_1__16121);
            rule__ConstraintExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group_1__1"


    // $ANTLR start "rule__ConstraintExpression__Group_1__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2988:1: rule__ConstraintExpression__Group_1__1__Impl : ( ( rule__ConstraintExpression__RightAssignment_1_1 ) ) ;
    public final void rule__ConstraintExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2992:1: ( ( ( rule__ConstraintExpression__RightAssignment_1_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2993:1: ( ( rule__ConstraintExpression__RightAssignment_1_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2993:1: ( ( rule__ConstraintExpression__RightAssignment_1_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2994:1: ( rule__ConstraintExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2995:1: ( rule__ConstraintExpression__RightAssignment_1_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2995:2: rule__ConstraintExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__RightAssignment_1_1_in_rule__ConstraintExpression__Group_1__1__Impl6148);
            rule__ConstraintExpression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionAccess().getRightAssignment_1_1()); 
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
    // $ANTLR end "rule__ConstraintExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ConstraintExpression__Group_1_0__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3009:1: rule__ConstraintExpression__Group_1_0__0 : rule__ConstraintExpression__Group_1_0__0__Impl ;
    public final void rule__ConstraintExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3013:1: ( rule__ConstraintExpression__Group_1_0__0__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3014:2: rule__ConstraintExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0__0__Impl_in_rule__ConstraintExpression__Group_1_0__06182);
            rule__ConstraintExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group_1_0__0"


    // $ANTLR start "rule__ConstraintExpression__Group_1_0__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3020:1: rule__ConstraintExpression__Group_1_0__0__Impl : ( ( rule__ConstraintExpression__Group_1_0_0__0 ) ) ;
    public final void rule__ConstraintExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3024:1: ( ( ( rule__ConstraintExpression__Group_1_0_0__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3025:1: ( ( rule__ConstraintExpression__Group_1_0_0__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3025:1: ( ( rule__ConstraintExpression__Group_1_0_0__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3026:1: ( rule__ConstraintExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup_1_0_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3027:1: ( rule__ConstraintExpression__Group_1_0_0__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3027:2: rule__ConstraintExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__0_in_rule__ConstraintExpression__Group_1_0__0__Impl6209);
            rule__ConstraintExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionAccess().getGroup_1_0_0()); 
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
    // $ANTLR end "rule__ConstraintExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__ConstraintExpression__Group_1_0_0__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3039:1: rule__ConstraintExpression__Group_1_0_0__0 : rule__ConstraintExpression__Group_1_0_0__0__Impl rule__ConstraintExpression__Group_1_0_0__1 ;
    public final void rule__ConstraintExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3043:1: ( rule__ConstraintExpression__Group_1_0_0__0__Impl rule__ConstraintExpression__Group_1_0_0__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3044:2: rule__ConstraintExpression__Group_1_0_0__0__Impl rule__ConstraintExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__0__Impl_in_rule__ConstraintExpression__Group_1_0_0__06241);
            rule__ConstraintExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__1_in_rule__ConstraintExpression__Group_1_0_0__06244);
            rule__ConstraintExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group_1_0_0__0"


    // $ANTLR start "rule__ConstraintExpression__Group_1_0_0__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3051:1: rule__ConstraintExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ConstraintExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3055:1: ( ( () ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3056:1: ( () )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3056:1: ( () )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3057:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3058:1: ()
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3060:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__ConstraintExpression__Group_1_0_0__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3070:1: rule__ConstraintExpression__Group_1_0_0__1 : rule__ConstraintExpression__Group_1_0_0__1__Impl ;
    public final void rule__ConstraintExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3074:1: ( rule__ConstraintExpression__Group_1_0_0__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3075:2: rule__ConstraintExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__1__Impl_in_rule__ConstraintExpression__Group_1_0_0__16302);
            rule__ConstraintExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group_1_0_0__1"


    // $ANTLR start "rule__ConstraintExpression__Group_1_0_0__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3081:1: rule__ConstraintExpression__Group_1_0_0__1__Impl : ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__ConstraintExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3085:1: ( ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3086:1: ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3086:1: ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3087:1: ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3088:1: ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3088:2: rule__ConstraintExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__OperatorAssignment_1_0_0_1_in_rule__ConstraintExpression__Group_1_0_0__1__Impl6329);
            rule__ConstraintExpression__OperatorAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionAccess().getOperatorAssignment_1_0_0_1()); 
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
    // $ANTLR end "rule__ConstraintExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__ParenthesisConstraint__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3102:1: rule__ParenthesisConstraint__Group__0 : rule__ParenthesisConstraint__Group__0__Impl rule__ParenthesisConstraint__Group__1 ;
    public final void rule__ParenthesisConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3106:1: ( rule__ParenthesisConstraint__Group__0__Impl rule__ParenthesisConstraint__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3107:2: rule__ParenthesisConstraint__Group__0__Impl rule__ParenthesisConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__0__Impl_in_rule__ParenthesisConstraint__Group__06363);
            rule__ParenthesisConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__1_in_rule__ParenthesisConstraint__Group__06366);
            rule__ParenthesisConstraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisConstraint__Group__0"


    // $ANTLR start "rule__ParenthesisConstraint__Group__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3114:1: rule__ParenthesisConstraint__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesisConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3118:1: ( ( '(' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3119:1: ( '(' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3119:1: ( '(' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3120:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__ParenthesisConstraint__Group__0__Impl6394); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisConstraintAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__ParenthesisConstraint__Group__0__Impl"


    // $ANTLR start "rule__ParenthesisConstraint__Group__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3133:1: rule__ParenthesisConstraint__Group__1 : rule__ParenthesisConstraint__Group__1__Impl rule__ParenthesisConstraint__Group__2 ;
    public final void rule__ParenthesisConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3137:1: ( rule__ParenthesisConstraint__Group__1__Impl rule__ParenthesisConstraint__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3138:2: rule__ParenthesisConstraint__Group__1__Impl rule__ParenthesisConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__1__Impl_in_rule__ParenthesisConstraint__Group__16425);
            rule__ParenthesisConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__2_in_rule__ParenthesisConstraint__Group__16428);
            rule__ParenthesisConstraint__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisConstraint__Group__1"


    // $ANTLR start "rule__ParenthesisConstraint__Group__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3145:1: rule__ParenthesisConstraint__Group__1__Impl : ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) ) ;
    public final void rule__ParenthesisConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3149:1: ( ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3150:1: ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3150:1: ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3151:1: ( rule__ParenthesisConstraint__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getConstraintAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3152:1: ( rule__ParenthesisConstraint__ConstraintAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3152:2: rule__ParenthesisConstraint__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__ConstraintAssignment_1_in_rule__ParenthesisConstraint__Group__1__Impl6455);
            rule__ParenthesisConstraint__ConstraintAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisConstraintAccess().getConstraintAssignment_1()); 
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
    // $ANTLR end "rule__ParenthesisConstraint__Group__1__Impl"


    // $ANTLR start "rule__ParenthesisConstraint__Group__2"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3162:1: rule__ParenthesisConstraint__Group__2 : rule__ParenthesisConstraint__Group__2__Impl ;
    public final void rule__ParenthesisConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3166:1: ( rule__ParenthesisConstraint__Group__2__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3167:2: rule__ParenthesisConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__2__Impl_in_rule__ParenthesisConstraint__Group__26485);
            rule__ParenthesisConstraint__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisConstraint__Group__2"


    // $ANTLR start "rule__ParenthesisConstraint__Group__2__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3173:1: rule__ParenthesisConstraint__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesisConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3177:1: ( ( ')' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3178:1: ( ')' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3178:1: ( ')' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3179:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__ParenthesisConstraint__Group__2__Impl6513); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisConstraintAccess().getRightParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__ParenthesisConstraint__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3198:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3202:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3203:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__06550);
            rule__Constraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__06553);
            rule__Constraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3210:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__TypeSelectionAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3214:1: ( ( ( rule__Constraint__TypeSelectionAssignment_0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3215:1: ( ( rule__Constraint__TypeSelectionAssignment_0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3215:1: ( ( rule__Constraint__TypeSelectionAssignment_0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3216:1: ( rule__Constraint__TypeSelectionAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getTypeSelectionAssignment_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3217:1: ( rule__Constraint__TypeSelectionAssignment_0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3217:2: rule__Constraint__TypeSelectionAssignment_0
            {
            pushFollow(FOLLOW_rule__Constraint__TypeSelectionAssignment_0_in_rule__Constraint__Group__0__Impl6580);
            rule__Constraint__TypeSelectionAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getTypeSelectionAssignment_0()); 
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
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3227:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3231:1: ( rule__Constraint__Group__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3232:2: rule__Constraint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__16610);
            rule__Constraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3238:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__PropertyConstraintAssignment_1 )? ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3242:1: ( ( ( rule__Constraint__PropertyConstraintAssignment_1 )? ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3243:1: ( ( rule__Constraint__PropertyConstraintAssignment_1 )? )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3243:1: ( ( rule__Constraint__PropertyConstraintAssignment_1 )? )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3244:1: ( rule__Constraint__PropertyConstraintAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getPropertyConstraintAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3245:1: ( rule__Constraint__PropertyConstraintAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3245:2: rule__Constraint__PropertyConstraintAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Constraint__PropertyConstraintAssignment_1_in_rule__Constraint__Group__1__Impl6637);
                    rule__Constraint__PropertyConstraintAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getPropertyConstraintAssignment_1()); 
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
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__PropertyConstraint__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3259:1: rule__PropertyConstraint__Group__0 : rule__PropertyConstraint__Group__0__Impl rule__PropertyConstraint__Group__1 ;
    public final void rule__PropertyConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3263:1: ( rule__PropertyConstraint__Group__0__Impl rule__PropertyConstraint__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3264:2: rule__PropertyConstraint__Group__0__Impl rule__PropertyConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyConstraint__Group__0__Impl_in_rule__PropertyConstraint__Group__06672);
            rule__PropertyConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyConstraint__Group__1_in_rule__PropertyConstraint__Group__06675);
            rule__PropertyConstraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraint__Group__0"


    // $ANTLR start "rule__PropertyConstraint__Group__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3271:1: rule__PropertyConstraint__Group__0__Impl : ( ruleBasicPropertyConstraint ) ;
    public final void rule__PropertyConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3275:1: ( ( ruleBasicPropertyConstraint ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3276:1: ( ruleBasicPropertyConstraint )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3276:1: ( ruleBasicPropertyConstraint )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3277:1: ruleBasicPropertyConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getBasicPropertyConstraintParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBasicPropertyConstraint_in_rule__PropertyConstraint__Group__0__Impl6702);
            ruleBasicPropertyConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintAccess().getBasicPropertyConstraintParserRuleCall_0()); 
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
    // $ANTLR end "rule__PropertyConstraint__Group__0__Impl"


    // $ANTLR start "rule__PropertyConstraint__Group__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3288:1: rule__PropertyConstraint__Group__1 : rule__PropertyConstraint__Group__1__Impl ;
    public final void rule__PropertyConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3292:1: ( rule__PropertyConstraint__Group__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3293:2: rule__PropertyConstraint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyConstraint__Group__1__Impl_in_rule__PropertyConstraint__Group__16731);
            rule__PropertyConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraint__Group__1"


    // $ANTLR start "rule__PropertyConstraint__Group__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3299:1: rule__PropertyConstraint__Group__1__Impl : ( ( rule__PropertyConstraint__Group_1__0 )? ) ;
    public final void rule__PropertyConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3303:1: ( ( ( rule__PropertyConstraint__Group_1__0 )? ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3304:1: ( ( rule__PropertyConstraint__Group_1__0 )? )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3304:1: ( ( rule__PropertyConstraint__Group_1__0 )? )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3305:1: ( rule__PropertyConstraint__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getGroup_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3306:1: ( rule__PropertyConstraint__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==16) ) {
                int LA21_1 = input.LA(2);

                if ( (synpred31_InternalConstraintLang()) ) {
                    alt21=1;
                }
            }
            else if ( (LA21_0==17) ) {
                int LA21_2 = input.LA(2);

                if ( (synpred31_InternalConstraintLang()) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3306:2: rule__PropertyConstraint__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PropertyConstraint__Group_1__0_in_rule__PropertyConstraint__Group__1__Impl6758);
                    rule__PropertyConstraint__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintAccess().getGroup_1()); 
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
    // $ANTLR end "rule__PropertyConstraint__Group__1__Impl"


    // $ANTLR start "rule__PropertyConstraint__Group_1__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3320:1: rule__PropertyConstraint__Group_1__0 : rule__PropertyConstraint__Group_1__0__Impl rule__PropertyConstraint__Group_1__1 ;
    public final void rule__PropertyConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3324:1: ( rule__PropertyConstraint__Group_1__0__Impl rule__PropertyConstraint__Group_1__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3325:2: rule__PropertyConstraint__Group_1__0__Impl rule__PropertyConstraint__Group_1__1
            {
            pushFollow(FOLLOW_rule__PropertyConstraint__Group_1__0__Impl_in_rule__PropertyConstraint__Group_1__06793);
            rule__PropertyConstraint__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyConstraint__Group_1__1_in_rule__PropertyConstraint__Group_1__06796);
            rule__PropertyConstraint__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraint__Group_1__0"


    // $ANTLR start "rule__PropertyConstraint__Group_1__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3332:1: rule__PropertyConstraint__Group_1__0__Impl : ( ( rule__PropertyConstraint__Group_1_0__0 ) ) ;
    public final void rule__PropertyConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3336:1: ( ( ( rule__PropertyConstraint__Group_1_0__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3337:1: ( ( rule__PropertyConstraint__Group_1_0__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3337:1: ( ( rule__PropertyConstraint__Group_1_0__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3338:1: ( rule__PropertyConstraint__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getGroup_1_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3339:1: ( rule__PropertyConstraint__Group_1_0__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3339:2: rule__PropertyConstraint__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__PropertyConstraint__Group_1_0__0_in_rule__PropertyConstraint__Group_1__0__Impl6823);
            rule__PropertyConstraint__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__PropertyConstraint__Group_1__0__Impl"


    // $ANTLR start "rule__PropertyConstraint__Group_1__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3349:1: rule__PropertyConstraint__Group_1__1 : rule__PropertyConstraint__Group_1__1__Impl ;
    public final void rule__PropertyConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3353:1: ( rule__PropertyConstraint__Group_1__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3354:2: rule__PropertyConstraint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyConstraint__Group_1__1__Impl_in_rule__PropertyConstraint__Group_1__16853);
            rule__PropertyConstraint__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraint__Group_1__1"


    // $ANTLR start "rule__PropertyConstraint__Group_1__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3360:1: rule__PropertyConstraint__Group_1__1__Impl : ( ( rule__PropertyConstraint__RightAssignment_1_1 ) ) ;
    public final void rule__PropertyConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3364:1: ( ( ( rule__PropertyConstraint__RightAssignment_1_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3365:1: ( ( rule__PropertyConstraint__RightAssignment_1_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3365:1: ( ( rule__PropertyConstraint__RightAssignment_1_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3366:1: ( rule__PropertyConstraint__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getRightAssignment_1_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3367:1: ( rule__PropertyConstraint__RightAssignment_1_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3367:2: rule__PropertyConstraint__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PropertyConstraint__RightAssignment_1_1_in_rule__PropertyConstraint__Group_1__1__Impl6880);
            rule__PropertyConstraint__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintAccess().getRightAssignment_1_1()); 
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
    // $ANTLR end "rule__PropertyConstraint__Group_1__1__Impl"


    // $ANTLR start "rule__PropertyConstraint__Group_1_0__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3381:1: rule__PropertyConstraint__Group_1_0__0 : rule__PropertyConstraint__Group_1_0__0__Impl ;
    public final void rule__PropertyConstraint__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3385:1: ( rule__PropertyConstraint__Group_1_0__0__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3386:2: rule__PropertyConstraint__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__PropertyConstraint__Group_1_0__0__Impl_in_rule__PropertyConstraint__Group_1_0__06914);
            rule__PropertyConstraint__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraint__Group_1_0__0"


    // $ANTLR start "rule__PropertyConstraint__Group_1_0__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3392:1: rule__PropertyConstraint__Group_1_0__0__Impl : ( ( rule__PropertyConstraint__Group_1_0_0__0 ) ) ;
    public final void rule__PropertyConstraint__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3396:1: ( ( ( rule__PropertyConstraint__Group_1_0_0__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3397:1: ( ( rule__PropertyConstraint__Group_1_0_0__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3397:1: ( ( rule__PropertyConstraint__Group_1_0_0__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3398:1: ( rule__PropertyConstraint__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getGroup_1_0_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3399:1: ( rule__PropertyConstraint__Group_1_0_0__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3399:2: rule__PropertyConstraint__Group_1_0_0__0
            {
            pushFollow(FOLLOW_rule__PropertyConstraint__Group_1_0_0__0_in_rule__PropertyConstraint__Group_1_0__0__Impl6941);
            rule__PropertyConstraint__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintAccess().getGroup_1_0_0()); 
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
    // $ANTLR end "rule__PropertyConstraint__Group_1_0__0__Impl"


    // $ANTLR start "rule__PropertyConstraint__Group_1_0_0__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3411:1: rule__PropertyConstraint__Group_1_0_0__0 : rule__PropertyConstraint__Group_1_0_0__0__Impl rule__PropertyConstraint__Group_1_0_0__1 ;
    public final void rule__PropertyConstraint__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3415:1: ( rule__PropertyConstraint__Group_1_0_0__0__Impl rule__PropertyConstraint__Group_1_0_0__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3416:2: rule__PropertyConstraint__Group_1_0_0__0__Impl rule__PropertyConstraint__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__PropertyConstraint__Group_1_0_0__0__Impl_in_rule__PropertyConstraint__Group_1_0_0__06973);
            rule__PropertyConstraint__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyConstraint__Group_1_0_0__1_in_rule__PropertyConstraint__Group_1_0_0__06976);
            rule__PropertyConstraint__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraint__Group_1_0_0__0"


    // $ANTLR start "rule__PropertyConstraint__Group_1_0_0__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3423:1: rule__PropertyConstraint__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PropertyConstraint__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3427:1: ( ( () ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3428:1: ( () )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3428:1: ( () )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3429:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getPropertyConstraintLeftAction_1_0_0_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3430:1: ()
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3432:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintAccess().getPropertyConstraintLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraint__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__PropertyConstraint__Group_1_0_0__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3442:1: rule__PropertyConstraint__Group_1_0_0__1 : rule__PropertyConstraint__Group_1_0_0__1__Impl ;
    public final void rule__PropertyConstraint__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3446:1: ( rule__PropertyConstraint__Group_1_0_0__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3447:2: rule__PropertyConstraint__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyConstraint__Group_1_0_0__1__Impl_in_rule__PropertyConstraint__Group_1_0_0__17034);
            rule__PropertyConstraint__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraint__Group_1_0_0__1"


    // $ANTLR start "rule__PropertyConstraint__Group_1_0_0__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3453:1: rule__PropertyConstraint__Group_1_0_0__1__Impl : ( ( rule__PropertyConstraint__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__PropertyConstraint__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3457:1: ( ( ( rule__PropertyConstraint__OperatorAssignment_1_0_0_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3458:1: ( ( rule__PropertyConstraint__OperatorAssignment_1_0_0_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3458:1: ( ( rule__PropertyConstraint__OperatorAssignment_1_0_0_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3459:1: ( rule__PropertyConstraint__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3460:1: ( rule__PropertyConstraint__OperatorAssignment_1_0_0_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3460:2: rule__PropertyConstraint__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__PropertyConstraint__OperatorAssignment_1_0_0_1_in_rule__PropertyConstraint__Group_1_0_0__1__Impl7061);
            rule__PropertyConstraint__OperatorAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintAccess().getOperatorAssignment_1_0_0_1()); 
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
    // $ANTLR end "rule__PropertyConstraint__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PropertyParenthesisConstraint__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3474:1: rule__PropertyParenthesisConstraint__Group__0 : rule__PropertyParenthesisConstraint__Group__0__Impl rule__PropertyParenthesisConstraint__Group__1 ;
    public final void rule__PropertyParenthesisConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3478:1: ( rule__PropertyParenthesisConstraint__Group__0__Impl rule__PropertyParenthesisConstraint__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3479:2: rule__PropertyParenthesisConstraint__Group__0__Impl rule__PropertyParenthesisConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyParenthesisConstraint__Group__0__Impl_in_rule__PropertyParenthesisConstraint__Group__07095);
            rule__PropertyParenthesisConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyParenthesisConstraint__Group__1_in_rule__PropertyParenthesisConstraint__Group__07098);
            rule__PropertyParenthesisConstraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyParenthesisConstraint__Group__0"


    // $ANTLR start "rule__PropertyParenthesisConstraint__Group__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3486:1: rule__PropertyParenthesisConstraint__Group__0__Impl : ( '(' ) ;
    public final void rule__PropertyParenthesisConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3490:1: ( ( '(' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3491:1: ( '(' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3491:1: ( '(' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3492:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyParenthesisConstraintAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__PropertyParenthesisConstraint__Group__0__Impl7126); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyParenthesisConstraintAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__PropertyParenthesisConstraint__Group__0__Impl"


    // $ANTLR start "rule__PropertyParenthesisConstraint__Group__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3505:1: rule__PropertyParenthesisConstraint__Group__1 : rule__PropertyParenthesisConstraint__Group__1__Impl rule__PropertyParenthesisConstraint__Group__2 ;
    public final void rule__PropertyParenthesisConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3509:1: ( rule__PropertyParenthesisConstraint__Group__1__Impl rule__PropertyParenthesisConstraint__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3510:2: rule__PropertyParenthesisConstraint__Group__1__Impl rule__PropertyParenthesisConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyParenthesisConstraint__Group__1__Impl_in_rule__PropertyParenthesisConstraint__Group__17157);
            rule__PropertyParenthesisConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyParenthesisConstraint__Group__2_in_rule__PropertyParenthesisConstraint__Group__17160);
            rule__PropertyParenthesisConstraint__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyParenthesisConstraint__Group__1"


    // $ANTLR start "rule__PropertyParenthesisConstraint__Group__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3517:1: rule__PropertyParenthesisConstraint__Group__1__Impl : ( ( rule__PropertyParenthesisConstraint__ConstraintAssignment_1 ) ) ;
    public final void rule__PropertyParenthesisConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3521:1: ( ( ( rule__PropertyParenthesisConstraint__ConstraintAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3522:1: ( ( rule__PropertyParenthesisConstraint__ConstraintAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3522:1: ( ( rule__PropertyParenthesisConstraint__ConstraintAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3523:1: ( rule__PropertyParenthesisConstraint__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyParenthesisConstraintAccess().getConstraintAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3524:1: ( rule__PropertyParenthesisConstraint__ConstraintAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3524:2: rule__PropertyParenthesisConstraint__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__PropertyParenthesisConstraint__ConstraintAssignment_1_in_rule__PropertyParenthesisConstraint__Group__1__Impl7187);
            rule__PropertyParenthesisConstraint__ConstraintAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyParenthesisConstraintAccess().getConstraintAssignment_1()); 
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
    // $ANTLR end "rule__PropertyParenthesisConstraint__Group__1__Impl"


    // $ANTLR start "rule__PropertyParenthesisConstraint__Group__2"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3534:1: rule__PropertyParenthesisConstraint__Group__2 : rule__PropertyParenthesisConstraint__Group__2__Impl ;
    public final void rule__PropertyParenthesisConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3538:1: ( rule__PropertyParenthesisConstraint__Group__2__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3539:2: rule__PropertyParenthesisConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyParenthesisConstraint__Group__2__Impl_in_rule__PropertyParenthesisConstraint__Group__27217);
            rule__PropertyParenthesisConstraint__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyParenthesisConstraint__Group__2"


    // $ANTLR start "rule__PropertyParenthesisConstraint__Group__2__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3545:1: rule__PropertyParenthesisConstraint__Group__2__Impl : ( ')' ) ;
    public final void rule__PropertyParenthesisConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3549:1: ( ( ')' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3550:1: ( ')' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3550:1: ( ')' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3551:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyParenthesisConstraintAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__PropertyParenthesisConstraint__Group__2__Impl7245); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyParenthesisConstraintAccess().getRightParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__PropertyParenthesisConstraint__Group__2__Impl"


    // $ANTLR start "rule__PropertyValueConstraint__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3570:1: rule__PropertyValueConstraint__Group__0 : rule__PropertyValueConstraint__Group__0__Impl rule__PropertyValueConstraint__Group__1 ;
    public final void rule__PropertyValueConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3574:1: ( rule__PropertyValueConstraint__Group__0__Impl rule__PropertyValueConstraint__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3575:2: rule__PropertyValueConstraint__Group__0__Impl rule__PropertyValueConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyValueConstraint__Group__0__Impl_in_rule__PropertyValueConstraint__Group__07282);
            rule__PropertyValueConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyValueConstraint__Group__1_in_rule__PropertyValueConstraint__Group__07285);
            rule__PropertyValueConstraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueConstraint__Group__0"


    // $ANTLR start "rule__PropertyValueConstraint__Group__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3582:1: rule__PropertyValueConstraint__Group__0__Impl : ( ( rule__PropertyValueConstraint__PropertyAssignment_0 ) ) ;
    public final void rule__PropertyValueConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3586:1: ( ( ( rule__PropertyValueConstraint__PropertyAssignment_0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3587:1: ( ( rule__PropertyValueConstraint__PropertyAssignment_0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3587:1: ( ( rule__PropertyValueConstraint__PropertyAssignment_0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3588:1: ( rule__PropertyValueConstraint__PropertyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueConstraintAccess().getPropertyAssignment_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3589:1: ( rule__PropertyValueConstraint__PropertyAssignment_0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3589:2: rule__PropertyValueConstraint__PropertyAssignment_0
            {
            pushFollow(FOLLOW_rule__PropertyValueConstraint__PropertyAssignment_0_in_rule__PropertyValueConstraint__Group__0__Impl7312);
            rule__PropertyValueConstraint__PropertyAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueConstraintAccess().getPropertyAssignment_0()); 
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
    // $ANTLR end "rule__PropertyValueConstraint__Group__0__Impl"


    // $ANTLR start "rule__PropertyValueConstraint__Group__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3599:1: rule__PropertyValueConstraint__Group__1 : rule__PropertyValueConstraint__Group__1__Impl rule__PropertyValueConstraint__Group__2 ;
    public final void rule__PropertyValueConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3603:1: ( rule__PropertyValueConstraint__Group__1__Impl rule__PropertyValueConstraint__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3604:2: rule__PropertyValueConstraint__Group__1__Impl rule__PropertyValueConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyValueConstraint__Group__1__Impl_in_rule__PropertyValueConstraint__Group__17342);
            rule__PropertyValueConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyValueConstraint__Group__2_in_rule__PropertyValueConstraint__Group__17345);
            rule__PropertyValueConstraint__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueConstraint__Group__1"


    // $ANTLR start "rule__PropertyValueConstraint__Group__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3611:1: rule__PropertyValueConstraint__Group__1__Impl : ( ( rule__PropertyValueConstraint__ComparatorAssignment_1 ) ) ;
    public final void rule__PropertyValueConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3615:1: ( ( ( rule__PropertyValueConstraint__ComparatorAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3616:1: ( ( rule__PropertyValueConstraint__ComparatorAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3616:1: ( ( rule__PropertyValueConstraint__ComparatorAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3617:1: ( rule__PropertyValueConstraint__ComparatorAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueConstraintAccess().getComparatorAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3618:1: ( rule__PropertyValueConstraint__ComparatorAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3618:2: rule__PropertyValueConstraint__ComparatorAssignment_1
            {
            pushFollow(FOLLOW_rule__PropertyValueConstraint__ComparatorAssignment_1_in_rule__PropertyValueConstraint__Group__1__Impl7372);
            rule__PropertyValueConstraint__ComparatorAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueConstraintAccess().getComparatorAssignment_1()); 
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
    // $ANTLR end "rule__PropertyValueConstraint__Group__1__Impl"


    // $ANTLR start "rule__PropertyValueConstraint__Group__2"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3628:1: rule__PropertyValueConstraint__Group__2 : rule__PropertyValueConstraint__Group__2__Impl ;
    public final void rule__PropertyValueConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3632:1: ( rule__PropertyValueConstraint__Group__2__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3633:2: rule__PropertyValueConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyValueConstraint__Group__2__Impl_in_rule__PropertyValueConstraint__Group__27402);
            rule__PropertyValueConstraint__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValueConstraint__Group__2"


    // $ANTLR start "rule__PropertyValueConstraint__Group__2__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3639:1: rule__PropertyValueConstraint__Group__2__Impl : ( ( rule__PropertyValueConstraint__ValueAssignment_2 ) ) ;
    public final void rule__PropertyValueConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3643:1: ( ( ( rule__PropertyValueConstraint__ValueAssignment_2 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3644:1: ( ( rule__PropertyValueConstraint__ValueAssignment_2 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3644:1: ( ( rule__PropertyValueConstraint__ValueAssignment_2 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3645:1: ( rule__PropertyValueConstraint__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueConstraintAccess().getValueAssignment_2()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3646:1: ( rule__PropertyValueConstraint__ValueAssignment_2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3646:2: rule__PropertyValueConstraint__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyValueConstraint__ValueAssignment_2_in_rule__PropertyValueConstraint__Group__2__Impl7429);
            rule__PropertyValueConstraint__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueConstraintAccess().getValueAssignment_2()); 
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
    // $ANTLR end "rule__PropertyValueConstraint__Group__2__Impl"


    // $ANTLR start "rule__TemplateTypeSelection__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3662:1: rule__TemplateTypeSelection__Group__0 : rule__TemplateTypeSelection__Group__0__Impl rule__TemplateTypeSelection__Group__1 ;
    public final void rule__TemplateTypeSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3666:1: ( rule__TemplateTypeSelection__Group__0__Impl rule__TemplateTypeSelection__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3667:2: rule__TemplateTypeSelection__Group__0__Impl rule__TemplateTypeSelection__Group__1
            {
            pushFollow(FOLLOW_rule__TemplateTypeSelection__Group__0__Impl_in_rule__TemplateTypeSelection__Group__07465);
            rule__TemplateTypeSelection__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemplateTypeSelection__Group__1_in_rule__TemplateTypeSelection__Group__07468);
            rule__TemplateTypeSelection__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateTypeSelection__Group__0"


    // $ANTLR start "rule__TemplateTypeSelection__Group__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3674:1: rule__TemplateTypeSelection__Group__0__Impl : ( '?' ) ;
    public final void rule__TemplateTypeSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3678:1: ( ( '?' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3679:1: ( '?' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3679:1: ( '?' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3680:1: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeSelectionAccess().getQuestionMarkKeyword_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__TemplateTypeSelection__Group__0__Impl7496); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeSelectionAccess().getQuestionMarkKeyword_0()); 
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
    // $ANTLR end "rule__TemplateTypeSelection__Group__0__Impl"


    // $ANTLR start "rule__TemplateTypeSelection__Group__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3693:1: rule__TemplateTypeSelection__Group__1 : rule__TemplateTypeSelection__Group__1__Impl rule__TemplateTypeSelection__Group__2 ;
    public final void rule__TemplateTypeSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3697:1: ( rule__TemplateTypeSelection__Group__1__Impl rule__TemplateTypeSelection__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3698:2: rule__TemplateTypeSelection__Group__1__Impl rule__TemplateTypeSelection__Group__2
            {
            pushFollow(FOLLOW_rule__TemplateTypeSelection__Group__1__Impl_in_rule__TemplateTypeSelection__Group__17527);
            rule__TemplateTypeSelection__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemplateTypeSelection__Group__2_in_rule__TemplateTypeSelection__Group__17530);
            rule__TemplateTypeSelection__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateTypeSelection__Group__1"


    // $ANTLR start "rule__TemplateTypeSelection__Group__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3705:1: rule__TemplateTypeSelection__Group__1__Impl : ( 'uses' ) ;
    public final void rule__TemplateTypeSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3709:1: ( ( 'uses' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3710:1: ( 'uses' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3710:1: ( 'uses' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3711:1: 'uses'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeSelectionAccess().getUsesKeyword_1()); 
            }
            match(input,36,FOLLOW_36_in_rule__TemplateTypeSelection__Group__1__Impl7558); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeSelectionAccess().getUsesKeyword_1()); 
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
    // $ANTLR end "rule__TemplateTypeSelection__Group__1__Impl"


    // $ANTLR start "rule__TemplateTypeSelection__Group__2"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3724:1: rule__TemplateTypeSelection__Group__2 : rule__TemplateTypeSelection__Group__2__Impl rule__TemplateTypeSelection__Group__3 ;
    public final void rule__TemplateTypeSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3728:1: ( rule__TemplateTypeSelection__Group__2__Impl rule__TemplateTypeSelection__Group__3 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3729:2: rule__TemplateTypeSelection__Group__2__Impl rule__TemplateTypeSelection__Group__3
            {
            pushFollow(FOLLOW_rule__TemplateTypeSelection__Group__2__Impl_in_rule__TemplateTypeSelection__Group__27589);
            rule__TemplateTypeSelection__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemplateTypeSelection__Group__3_in_rule__TemplateTypeSelection__Group__27592);
            rule__TemplateTypeSelection__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateTypeSelection__Group__2"


    // $ANTLR start "rule__TemplateTypeSelection__Group__2__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3736:1: rule__TemplateTypeSelection__Group__2__Impl : ( ( rule__TemplateTypeSelection__TypesAssignment_2 ) ) ;
    public final void rule__TemplateTypeSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3740:1: ( ( ( rule__TemplateTypeSelection__TypesAssignment_2 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3741:1: ( ( rule__TemplateTypeSelection__TypesAssignment_2 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3741:1: ( ( rule__TemplateTypeSelection__TypesAssignment_2 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3742:1: ( rule__TemplateTypeSelection__TypesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeSelectionAccess().getTypesAssignment_2()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3743:1: ( rule__TemplateTypeSelection__TypesAssignment_2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3743:2: rule__TemplateTypeSelection__TypesAssignment_2
            {
            pushFollow(FOLLOW_rule__TemplateTypeSelection__TypesAssignment_2_in_rule__TemplateTypeSelection__Group__2__Impl7619);
            rule__TemplateTypeSelection__TypesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeSelectionAccess().getTypesAssignment_2()); 
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
    // $ANTLR end "rule__TemplateTypeSelection__Group__2__Impl"


    // $ANTLR start "rule__TemplateTypeSelection__Group__3"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3753:1: rule__TemplateTypeSelection__Group__3 : rule__TemplateTypeSelection__Group__3__Impl ;
    public final void rule__TemplateTypeSelection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3757:1: ( rule__TemplateTypeSelection__Group__3__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3758:2: rule__TemplateTypeSelection__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TemplateTypeSelection__Group__3__Impl_in_rule__TemplateTypeSelection__Group__37649);
            rule__TemplateTypeSelection__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateTypeSelection__Group__3"


    // $ANTLR start "rule__TemplateTypeSelection__Group__3__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3764:1: rule__TemplateTypeSelection__Group__3__Impl : ( ( rule__TemplateTypeSelection__Group_3__0 )* ) ;
    public final void rule__TemplateTypeSelection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3768:1: ( ( ( rule__TemplateTypeSelection__Group_3__0 )* ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3769:1: ( ( rule__TemplateTypeSelection__Group_3__0 )* )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3769:1: ( ( rule__TemplateTypeSelection__Group_3__0 )* )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3770:1: ( rule__TemplateTypeSelection__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeSelectionAccess().getGroup_3()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3771:1: ( rule__TemplateTypeSelection__Group_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3771:2: rule__TemplateTypeSelection__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__TemplateTypeSelection__Group_3__0_in_rule__TemplateTypeSelection__Group__3__Impl7676);
            	    rule__TemplateTypeSelection__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeSelectionAccess().getGroup_3()); 
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
    // $ANTLR end "rule__TemplateTypeSelection__Group__3__Impl"


    // $ANTLR start "rule__TemplateTypeSelection__Group_3__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3789:1: rule__TemplateTypeSelection__Group_3__0 : rule__TemplateTypeSelection__Group_3__0__Impl rule__TemplateTypeSelection__Group_3__1 ;
    public final void rule__TemplateTypeSelection__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3793:1: ( rule__TemplateTypeSelection__Group_3__0__Impl rule__TemplateTypeSelection__Group_3__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3794:2: rule__TemplateTypeSelection__Group_3__0__Impl rule__TemplateTypeSelection__Group_3__1
            {
            pushFollow(FOLLOW_rule__TemplateTypeSelection__Group_3__0__Impl_in_rule__TemplateTypeSelection__Group_3__07715);
            rule__TemplateTypeSelection__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemplateTypeSelection__Group_3__1_in_rule__TemplateTypeSelection__Group_3__07718);
            rule__TemplateTypeSelection__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateTypeSelection__Group_3__0"


    // $ANTLR start "rule__TemplateTypeSelection__Group_3__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3801:1: rule__TemplateTypeSelection__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TemplateTypeSelection__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3805:1: ( ( ',' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3806:1: ( ',' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3806:1: ( ',' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3807:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeSelectionAccess().getCommaKeyword_3_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__TemplateTypeSelection__Group_3__0__Impl7746); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeSelectionAccess().getCommaKeyword_3_0()); 
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
    // $ANTLR end "rule__TemplateTypeSelection__Group_3__0__Impl"


    // $ANTLR start "rule__TemplateTypeSelection__Group_3__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3820:1: rule__TemplateTypeSelection__Group_3__1 : rule__TemplateTypeSelection__Group_3__1__Impl ;
    public final void rule__TemplateTypeSelection__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3824:1: ( rule__TemplateTypeSelection__Group_3__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3825:2: rule__TemplateTypeSelection__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TemplateTypeSelection__Group_3__1__Impl_in_rule__TemplateTypeSelection__Group_3__17777);
            rule__TemplateTypeSelection__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateTypeSelection__Group_3__1"


    // $ANTLR start "rule__TemplateTypeSelection__Group_3__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3831:1: rule__TemplateTypeSelection__Group_3__1__Impl : ( ( rule__TemplateTypeSelection__TypesAssignment_3_1 ) ) ;
    public final void rule__TemplateTypeSelection__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3835:1: ( ( ( rule__TemplateTypeSelection__TypesAssignment_3_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3836:1: ( ( rule__TemplateTypeSelection__TypesAssignment_3_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3836:1: ( ( rule__TemplateTypeSelection__TypesAssignment_3_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3837:1: ( rule__TemplateTypeSelection__TypesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeSelectionAccess().getTypesAssignment_3_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3838:1: ( rule__TemplateTypeSelection__TypesAssignment_3_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3838:2: rule__TemplateTypeSelection__TypesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TemplateTypeSelection__TypesAssignment_3_1_in_rule__TemplateTypeSelection__Group_3__1__Impl7804);
            rule__TemplateTypeSelection__TypesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeSelectionAccess().getTypesAssignment_3_1()); 
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
    // $ANTLR end "rule__TemplateTypeSelection__Group_3__1__Impl"


    // $ANTLR start "rule__RecordTypeSelection__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3852:1: rule__RecordTypeSelection__Group__0 : rule__RecordTypeSelection__Group__0__Impl rule__RecordTypeSelection__Group__1 ;
    public final void rule__RecordTypeSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3856:1: ( rule__RecordTypeSelection__Group__0__Impl rule__RecordTypeSelection__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3857:2: rule__RecordTypeSelection__Group__0__Impl rule__RecordTypeSelection__Group__1
            {
            pushFollow(FOLLOW_rule__RecordTypeSelection__Group__0__Impl_in_rule__RecordTypeSelection__Group__07838);
            rule__RecordTypeSelection__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordTypeSelection__Group__1_in_rule__RecordTypeSelection__Group__07841);
            rule__RecordTypeSelection__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordTypeSelection__Group__0"


    // $ANTLR start "rule__RecordTypeSelection__Group__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3864:1: rule__RecordTypeSelection__Group__0__Impl : ( '?' ) ;
    public final void rule__RecordTypeSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3868:1: ( ( '?' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3869:1: ( '?' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3869:1: ( '?' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3870:1: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeSelectionAccess().getQuestionMarkKeyword_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__RecordTypeSelection__Group__0__Impl7869); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeSelectionAccess().getQuestionMarkKeyword_0()); 
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
    // $ANTLR end "rule__RecordTypeSelection__Group__0__Impl"


    // $ANTLR start "rule__RecordTypeSelection__Group__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3883:1: rule__RecordTypeSelection__Group__1 : rule__RecordTypeSelection__Group__1__Impl rule__RecordTypeSelection__Group__2 ;
    public final void rule__RecordTypeSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3887:1: ( rule__RecordTypeSelection__Group__1__Impl rule__RecordTypeSelection__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3888:2: rule__RecordTypeSelection__Group__1__Impl rule__RecordTypeSelection__Group__2
            {
            pushFollow(FOLLOW_rule__RecordTypeSelection__Group__1__Impl_in_rule__RecordTypeSelection__Group__17900);
            rule__RecordTypeSelection__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordTypeSelection__Group__2_in_rule__RecordTypeSelection__Group__17903);
            rule__RecordTypeSelection__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordTypeSelection__Group__1"


    // $ANTLR start "rule__RecordTypeSelection__Group__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3895:1: rule__RecordTypeSelection__Group__1__Impl : ( ( rule__RecordTypeSelection__ModifierAssignment_1 ) ) ;
    public final void rule__RecordTypeSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3899:1: ( ( ( rule__RecordTypeSelection__ModifierAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3900:1: ( ( rule__RecordTypeSelection__ModifierAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3900:1: ( ( rule__RecordTypeSelection__ModifierAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3901:1: ( rule__RecordTypeSelection__ModifierAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeSelectionAccess().getModifierAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3902:1: ( rule__RecordTypeSelection__ModifierAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3902:2: rule__RecordTypeSelection__ModifierAssignment_1
            {
            pushFollow(FOLLOW_rule__RecordTypeSelection__ModifierAssignment_1_in_rule__RecordTypeSelection__Group__1__Impl7930);
            rule__RecordTypeSelection__ModifierAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeSelectionAccess().getModifierAssignment_1()); 
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
    // $ANTLR end "rule__RecordTypeSelection__Group__1__Impl"


    // $ANTLR start "rule__RecordTypeSelection__Group__2"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3912:1: rule__RecordTypeSelection__Group__2 : rule__RecordTypeSelection__Group__2__Impl ;
    public final void rule__RecordTypeSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3916:1: ( rule__RecordTypeSelection__Group__2__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3917:2: rule__RecordTypeSelection__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RecordTypeSelection__Group__2__Impl_in_rule__RecordTypeSelection__Group__27960);
            rule__RecordTypeSelection__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordTypeSelection__Group__2"


    // $ANTLR start "rule__RecordTypeSelection__Group__2__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3923:1: rule__RecordTypeSelection__Group__2__Impl : ( ( rule__RecordTypeSelection__TypeAssignment_2 ) ) ;
    public final void rule__RecordTypeSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3927:1: ( ( ( rule__RecordTypeSelection__TypeAssignment_2 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3928:1: ( ( rule__RecordTypeSelection__TypeAssignment_2 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3928:1: ( ( rule__RecordTypeSelection__TypeAssignment_2 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3929:1: ( rule__RecordTypeSelection__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeSelectionAccess().getTypeAssignment_2()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3930:1: ( rule__RecordTypeSelection__TypeAssignment_2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3930:2: rule__RecordTypeSelection__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__RecordTypeSelection__TypeAssignment_2_in_rule__RecordTypeSelection__Group__2__Impl7987);
            rule__RecordTypeSelection__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeSelectionAccess().getTypeAssignment_2()); 
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
    // $ANTLR end "rule__RecordTypeSelection__Group__2__Impl"


    // $ANTLR start "rule__SourceReference__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3946:1: rule__SourceReference__Group__0 : rule__SourceReference__Group__0__Impl rule__SourceReference__Group__1 ;
    public final void rule__SourceReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3950:1: ( rule__SourceReference__Group__0__Impl rule__SourceReference__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3951:2: rule__SourceReference__Group__0__Impl rule__SourceReference__Group__1
            {
            pushFollow(FOLLOW_rule__SourceReference__Group__0__Impl_in_rule__SourceReference__Group__08023);
            rule__SourceReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceReference__Group__1_in_rule__SourceReference__Group__08026);
            rule__SourceReference__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceReference__Group__0"


    // $ANTLR start "rule__SourceReference__Group__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3958:1: rule__SourceReference__Group__0__Impl : ( 'from' ) ;
    public final void rule__SourceReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3962:1: ( ( 'from' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3963:1: ( 'from' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3963:1: ( 'from' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3964:1: 'from'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceReferenceAccess().getFromKeyword_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__SourceReference__Group__0__Impl8054); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceReferenceAccess().getFromKeyword_0()); 
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
    // $ANTLR end "rule__SourceReference__Group__0__Impl"


    // $ANTLR start "rule__SourceReference__Group__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3977:1: rule__SourceReference__Group__1 : rule__SourceReference__Group__1__Impl ;
    public final void rule__SourceReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3981:1: ( rule__SourceReference__Group__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3982:2: rule__SourceReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SourceReference__Group__1__Impl_in_rule__SourceReference__Group__18085);
            rule__SourceReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceReference__Group__1"


    // $ANTLR start "rule__SourceReference__Group__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3988:1: rule__SourceReference__Group__1__Impl : ( ( rule__SourceReference__Alternatives_1 ) ) ;
    public final void rule__SourceReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3992:1: ( ( ( rule__SourceReference__Alternatives_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3993:1: ( ( rule__SourceReference__Alternatives_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3993:1: ( ( rule__SourceReference__Alternatives_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3994:1: ( rule__SourceReference__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceReferenceAccess().getAlternatives_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3995:1: ( rule__SourceReference__Alternatives_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3995:2: rule__SourceReference__Alternatives_1
            {
            pushFollow(FOLLOW_rule__SourceReference__Alternatives_1_in_rule__SourceReference__Group__1__Impl8112);
            rule__SourceReference__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceReferenceAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__SourceReference__Group__1__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4009:1: rule__ArrayLiteral__Group__0 : rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 ;
    public final void rule__ArrayLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4013:1: ( rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4014:2: rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__08146);
            rule__ArrayLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__08149);
            rule__ArrayLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__0"


    // $ANTLR start "rule__ArrayLiteral__Group__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4021:1: rule__ArrayLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__ArrayLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4025:1: ( ( '{' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4026:1: ( '{' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4026:1: ( '{' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4027:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__ArrayLiteral__Group__0__Impl8177); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getLeftCurlyBracketKeyword_0()); 
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
    // $ANTLR end "rule__ArrayLiteral__Group__0__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4040:1: rule__ArrayLiteral__Group__1 : rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 ;
    public final void rule__ArrayLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4044:1: ( rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4045:2: rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__18208);
            rule__ArrayLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__18211);
            rule__ArrayLiteral__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__1"


    // $ANTLR start "rule__ArrayLiteral__Group__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4052:1: rule__ArrayLiteral__Group__1__Impl : ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) ) ;
    public final void rule__ArrayLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4056:1: ( ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4057:1: ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4057:1: ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4058:1: ( rule__ArrayLiteral__LiteralsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4059:1: ( rule__ArrayLiteral__LiteralsAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4059:2: rule__ArrayLiteral__LiteralsAssignment_1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__LiteralsAssignment_1_in_rule__ArrayLiteral__Group__1__Impl8238);
            rule__ArrayLiteral__LiteralsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_1()); 
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
    // $ANTLR end "rule__ArrayLiteral__Group__1__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group__2"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4069:1: rule__ArrayLiteral__Group__2 : rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 ;
    public final void rule__ArrayLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4073:1: ( rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4074:2: rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__28268);
            rule__ArrayLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__28271);
            rule__ArrayLiteral__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__2"


    // $ANTLR start "rule__ArrayLiteral__Group__2__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4081:1: rule__ArrayLiteral__Group__2__Impl : ( ( rule__ArrayLiteral__Group_2__0 )* ) ;
    public final void rule__ArrayLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4085:1: ( ( ( rule__ArrayLiteral__Group_2__0 )* ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4086:1: ( ( rule__ArrayLiteral__Group_2__0 )* )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4086:1: ( ( rule__ArrayLiteral__Group_2__0 )* )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4087:1: ( rule__ArrayLiteral__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup_2()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4088:1: ( rule__ArrayLiteral__Group_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4088:2: rule__ArrayLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__0_in_rule__ArrayLiteral__Group__2__Impl8298);
            	    rule__ArrayLiteral__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getGroup_2()); 
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
    // $ANTLR end "rule__ArrayLiteral__Group__2__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group__3"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4098:1: rule__ArrayLiteral__Group__3 : rule__ArrayLiteral__Group__3__Impl ;
    public final void rule__ArrayLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4102:1: ( rule__ArrayLiteral__Group__3__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4103:2: rule__ArrayLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__38329);
            rule__ArrayLiteral__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__3"


    // $ANTLR start "rule__ArrayLiteral__Group__3__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4109:1: rule__ArrayLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__ArrayLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4113:1: ( ( '}' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4114:1: ( '}' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4114:1: ( '}' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4115:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,39,FOLLOW_39_in_rule__ArrayLiteral__Group__3__Impl8357); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getRightCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__ArrayLiteral__Group__3__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group_2__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4136:1: rule__ArrayLiteral__Group_2__0 : rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 ;
    public final void rule__ArrayLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4140:1: ( rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4141:2: rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__0__Impl_in_rule__ArrayLiteral__Group_2__08396);
            rule__ArrayLiteral__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__1_in_rule__ArrayLiteral__Group_2__08399);
            rule__ArrayLiteral__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group_2__0"


    // $ANTLR start "rule__ArrayLiteral__Group_2__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4148:1: rule__ArrayLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4152:1: ( ( ',' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4153:1: ( ',' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4153:1: ( ',' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4154:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__ArrayLiteral__Group_2__0__Impl8427); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_0()); 
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
    // $ANTLR end "rule__ArrayLiteral__Group_2__0__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group_2__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4167:1: rule__ArrayLiteral__Group_2__1 : rule__ArrayLiteral__Group_2__1__Impl ;
    public final void rule__ArrayLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4171:1: ( rule__ArrayLiteral__Group_2__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4172:2: rule__ArrayLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__1__Impl_in_rule__ArrayLiteral__Group_2__18458);
            rule__ArrayLiteral__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group_2__1"


    // $ANTLR start "rule__ArrayLiteral__Group_2__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4178:1: rule__ArrayLiteral__Group_2__1__Impl : ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) ) ;
    public final void rule__ArrayLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4182:1: ( ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4183:1: ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4183:1: ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4184:1: ( rule__ArrayLiteral__LiteralsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_2_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4185:1: ( rule__ArrayLiteral__LiteralsAssignment_2_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4185:2: rule__ArrayLiteral__LiteralsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__LiteralsAssignment_2_1_in_rule__ArrayLiteral__Group_2__1__Impl8485);
            rule__ArrayLiteral__LiteralsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_2_1()); 
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
    // $ANTLR end "rule__ArrayLiteral__Group_2__1__Impl"


    // $ANTLR start "rule__BuiltInValueLiteral__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4199:1: rule__BuiltInValueLiteral__Group__0 : rule__BuiltInValueLiteral__Group__0__Impl rule__BuiltInValueLiteral__Group__1 ;
    public final void rule__BuiltInValueLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4203:1: ( rule__BuiltInValueLiteral__Group__0__Impl rule__BuiltInValueLiteral__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4204:2: rule__BuiltInValueLiteral__Group__0__Impl rule__BuiltInValueLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__BuiltInValueLiteral__Group__0__Impl_in_rule__BuiltInValueLiteral__Group__08519);
            rule__BuiltInValueLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BuiltInValueLiteral__Group__1_in_rule__BuiltInValueLiteral__Group__08522);
            rule__BuiltInValueLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInValueLiteral__Group__0"


    // $ANTLR start "rule__BuiltInValueLiteral__Group__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4211:1: rule__BuiltInValueLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BuiltInValueLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4215:1: ( ( () ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4216:1: ( () )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4216:1: ( () )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4217:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getBuiltInValueLiteralAction_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4218:1: ()
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4220:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltInValueLiteralAccess().getBuiltInValueLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInValueLiteral__Group__0__Impl"


    // $ANTLR start "rule__BuiltInValueLiteral__Group__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4230:1: rule__BuiltInValueLiteral__Group__1 : rule__BuiltInValueLiteral__Group__1__Impl ;
    public final void rule__BuiltInValueLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4234:1: ( rule__BuiltInValueLiteral__Group__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4235:2: rule__BuiltInValueLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BuiltInValueLiteral__Group__1__Impl_in_rule__BuiltInValueLiteral__Group__18580);
            rule__BuiltInValueLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInValueLiteral__Group__1"


    // $ANTLR start "rule__BuiltInValueLiteral__Group__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4241:1: rule__BuiltInValueLiteral__Group__1__Impl : ( ( rule__BuiltInValueLiteral__ValueAssignment_1 ) ) ;
    public final void rule__BuiltInValueLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4245:1: ( ( ( rule__BuiltInValueLiteral__ValueAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4246:1: ( ( rule__BuiltInValueLiteral__ValueAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4246:1: ( ( rule__BuiltInValueLiteral__ValueAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4247:1: ( rule__BuiltInValueLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getValueAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4248:1: ( rule__BuiltInValueLiteral__ValueAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4248:2: rule__BuiltInValueLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__BuiltInValueLiteral__ValueAssignment_1_in_rule__BuiltInValueLiteral__Group__1__Impl8607);
            rule__BuiltInValueLiteral__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltInValueLiteralAccess().getValueAssignment_1()); 
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
    // $ANTLR end "rule__BuiltInValueLiteral__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4262:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4266:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4267:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08641);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08644);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4274:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4278:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4279:1: ( RULE_ID )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4279:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4280:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8671); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4291:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4295:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4296:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18700);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4302:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4306:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4307:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4307:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4308:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4309:1: ( rule__QualifiedName__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==33) ) {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2==RULE_ID) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4309:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8727);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4323:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4327:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4328:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08762);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08765);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4335:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4339:1: ( ( ( '.' ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4340:1: ( ( '.' ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4340:1: ( ( '.' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4341:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4342:1: ( '.' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4343:2: '.'
            {
            match(input,33,FOLLOW_33_in_rule__QualifiedName__Group_1__0__Impl8794); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4354:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4358:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4359:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18826);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4365:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4369:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4370:1: ( RULE_ID )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4370:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4371:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl8853); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4386:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4390:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4391:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__08886);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__08889);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4398:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4402:1: ( ( ruleQualifiedName ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4403:1: ( ruleQualifiedName )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4403:1: ( ruleQualifiedName )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4404:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl8916);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4415:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4419:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4420:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__18945);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4426:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4430:1: ( ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4431:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4431:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4432:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4433:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4433:2: rule__QualifiedNameWithWildcard__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl8972);
                    rule__QualifiedNameWithWildcard__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4447:1: rule__QualifiedNameWithWildcard__Group_1__0 : rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4451:1: ( rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4452:2: rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__09007);
            rule__QualifiedNameWithWildcard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__09010);
            rule__QualifiedNameWithWildcard__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4459:1: rule__QualifiedNameWithWildcard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4463:1: ( ( '.' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4464:1: ( '.' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4464:1: ( '.' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4465:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl9038); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4478:1: rule__QualifiedNameWithWildcard__Group_1__1 : rule__QualifiedNameWithWildcard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4482:1: ( rule__QualifiedNameWithWildcard__Group_1__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4483:2: rule__QualifiedNameWithWildcard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__19069);
            rule__QualifiedNameWithWildcard__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4489:1: rule__QualifiedNameWithWildcard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4493:1: ( ( '*' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4494:1: ( '*' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4494:1: ( '*' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4495:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,40,FOLLOW_40_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl9097); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__1__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4513:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4517:1: ( ( ruleQualifiedName ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4518:1: ( ruleQualifiedName )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4518:1: ( ruleQualifiedName )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4519:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_19137);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__ImportsAssignment_2"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4528:1: rule__Model__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4532:1: ( ( ruleImport ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4533:1: ( ruleImport )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4533:1: ( ruleImport )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4534:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_29168);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Model__ImportsAssignment_2"


    // $ANTLR start "rule__Model__OperationsAssignment_3"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4543:1: rule__Model__OperationsAssignment_3 : ( ruleOperation ) ;
    public final void rule__Model__OperationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4547:1: ( ( ruleOperation ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4548:1: ( ruleOperation )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4548:1: ( ruleOperation )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4549:1: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getOperationsOperationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_rule__Model__OperationsAssignment_39199);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getOperationsOperationParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Model__OperationsAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4558:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4562:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4563:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4563:1: ( ruleQualifiedNameWithWildcard )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4564:1: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_19230);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Selection__NameAssignment_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4573:1: rule__Selection__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Selection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4577:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4578:1: ( RULE_ID )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4578:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4579:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Selection__NameAssignment_19261); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Selection__NameAssignment_1"


    // $ANTLR start "rule__Selection__SourceReferenceAssignment_2"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4588:1: rule__Selection__SourceReferenceAssignment_2 : ( ruleSourceReference ) ;
    public final void rule__Selection__SourceReferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4592:1: ( ( ruleSourceReference ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4593:1: ( ruleSourceReference )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4593:1: ( ruleSourceReference )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4594:1: ruleSourceReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getSourceReferenceSourceReferenceParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleSourceReference_in_rule__Selection__SourceReferenceAssignment_29292);
            ruleSourceReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getSourceReferenceSourceReferenceParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Selection__SourceReferenceAssignment_2"


    // $ANTLR start "rule__Selection__InputsAssignment_4"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4603:1: rule__Selection__InputsAssignment_4 : ( ruleSelectInput ) ;
    public final void rule__Selection__InputsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4607:1: ( ( ruleSelectInput ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4608:1: ( ruleSelectInput )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4608:1: ( ruleSelectInput )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4609:1: ruleSelectInput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getInputsSelectInputParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleSelectInput_in_rule__Selection__InputsAssignment_49323);
            ruleSelectInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getInputsSelectInputParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Selection__InputsAssignment_4"


    // $ANTLR start "rule__Selection__InputsAssignment_5_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4618:1: rule__Selection__InputsAssignment_5_1 : ( ruleSelectInput ) ;
    public final void rule__Selection__InputsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4622:1: ( ( ruleSelectInput ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4623:1: ( ruleSelectInput )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4623:1: ( ruleSelectInput )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4624:1: ruleSelectInput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getInputsSelectInputParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleSelectInput_in_rule__Selection__InputsAssignment_5_19354);
            ruleSelectInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getInputsSelectInputParserRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__Selection__InputsAssignment_5_1"


    // $ANTLR start "rule__Selection__RecordTypeAssignment_7"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4633:1: rule__Selection__RecordTypeAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Selection__RecordTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4637:1: ( ( ( RULE_ID ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4638:1: ( ( RULE_ID ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4638:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4639:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getRecordTypeRecordTypeCrossReference_7_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4640:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4641:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getRecordTypeRecordTypeIDTerminalRuleCall_7_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Selection__RecordTypeAssignment_79389); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getRecordTypeRecordTypeIDTerminalRuleCall_7_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getRecordTypeRecordTypeCrossReference_7_0()); 
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
    // $ANTLR end "rule__Selection__RecordTypeAssignment_7"


    // $ANTLR start "rule__Selection__ParemterExpressionsAssignment_9"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4652:1: rule__Selection__ParemterExpressionsAssignment_9 : ( ruleParameterExpression ) ;
    public final void rule__Selection__ParemterExpressionsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4656:1: ( ( ruleParameterExpression ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4657:1: ( ruleParameterExpression )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4657:1: ( ruleParameterExpression )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4658:1: ruleParameterExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getParemterExpressionsParameterExpressionParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_ruleParameterExpression_in_rule__Selection__ParemterExpressionsAssignment_99424);
            ruleParameterExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getParemterExpressionsParameterExpressionParserRuleCall_9_0()); 
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
    // $ANTLR end "rule__Selection__ParemterExpressionsAssignment_9"


    // $ANTLR start "rule__Selection__ParemterExpressionsAssignment_10_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4667:1: rule__Selection__ParemterExpressionsAssignment_10_1 : ( ruleParameterExpression ) ;
    public final void rule__Selection__ParemterExpressionsAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4671:1: ( ( ruleParameterExpression ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4672:1: ( ruleParameterExpression )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4672:1: ( ruleParameterExpression )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4673:1: ruleParameterExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getParemterExpressionsParameterExpressionParserRuleCall_10_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameterExpression_in_rule__Selection__ParemterExpressionsAssignment_10_19455);
            ruleParameterExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getParemterExpressionsParameterExpressionParserRuleCall_10_1_0()); 
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
    // $ANTLR end "rule__Selection__ParemterExpressionsAssignment_10_1"


    // $ANTLR start "rule__SelectInput__RecordTypeAssignment_0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4682:1: rule__SelectInput__RecordTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SelectInput__RecordTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4686:1: ( ( ( RULE_ID ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4687:1: ( ( RULE_ID ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4687:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4688:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectInputAccess().getRecordTypeRecordTypeCrossReference_0_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4689:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4690:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectInputAccess().getRecordTypeRecordTypeIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SelectInput__RecordTypeAssignment_09490); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectInputAccess().getRecordTypeRecordTypeIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectInputAccess().getRecordTypeRecordTypeCrossReference_0_0()); 
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
    // $ANTLR end "rule__SelectInput__RecordTypeAssignment_0"


    // $ANTLR start "rule__SelectInput__NameAssignment_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4701:1: rule__SelectInput__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SelectInput__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4705:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4706:1: ( RULE_ID )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4706:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4707:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectInputAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SelectInput__NameAssignment_19525); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectInputAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__SelectInput__NameAssignment_1"


    // $ANTLR start "rule__SelectInput__SelectConstraintAssignment_2_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4716:1: rule__SelectInput__SelectConstraintAssignment_2_1 : ( ruleSelectConstaintExpression ) ;
    public final void rule__SelectInput__SelectConstraintAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4720:1: ( ( ruleSelectConstaintExpression ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4721:1: ( ruleSelectConstaintExpression )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4721:1: ( ruleSelectConstaintExpression )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4722:1: ruleSelectConstaintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectInputAccess().getSelectConstraintSelectConstaintExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleSelectConstaintExpression_in_rule__SelectInput__SelectConstraintAssignment_2_19556);
            ruleSelectConstaintExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectInputAccess().getSelectConstraintSelectConstaintExpressionParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__SelectInput__SelectConstraintAssignment_2_1"


    // $ANTLR start "rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4731:1: rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1 : ( ruleLogicOperator ) ;
    public final void rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4735:1: ( ( ruleLogicOperator ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4736:1: ( ruleLogicOperator )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4736:1: ( ruleLogicOperator )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4737:1: ruleLogicOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstaintExpressionAccess().getOperatorLogicOperatorEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleLogicOperator_in_rule__SelectConstaintExpression__OperatorAssignment_1_0_0_19587);
            ruleLogicOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectConstaintExpressionAccess().getOperatorLogicOperatorEnumRuleCall_1_0_0_1_0()); 
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
    // $ANTLR end "rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1"


    // $ANTLR start "rule__SelectConstaintExpression__RightAssignment_1_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4746:1: rule__SelectConstaintExpression__RightAssignment_1_1 : ( ruleSelectConstaintExpression ) ;
    public final void rule__SelectConstaintExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4750:1: ( ( ruleSelectConstaintExpression ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4751:1: ( ruleSelectConstaintExpression )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4751:1: ( ruleSelectConstaintExpression )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4752:1: ruleSelectConstaintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstaintExpressionAccess().getRightSelectConstaintExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleSelectConstaintExpression_in_rule__SelectConstaintExpression__RightAssignment_1_19618);
            ruleSelectConstaintExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectConstaintExpressionAccess().getRightSelectConstaintExpressionParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__SelectConstaintExpression__RightAssignment_1_1"


    // $ANTLR start "rule__ParenthesisSelectConstraint__ConstraintAssignment_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4761:1: rule__ParenthesisSelectConstraint__ConstraintAssignment_1 : ( ruleSelectConstaintExpression ) ;
    public final void rule__ParenthesisSelectConstraint__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4765:1: ( ( ruleSelectConstaintExpression ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4766:1: ( ruleSelectConstaintExpression )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4766:1: ( ruleSelectConstaintExpression )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4767:1: ruleSelectConstaintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisSelectConstraintAccess().getConstraintSelectConstaintExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSelectConstaintExpression_in_rule__ParenthesisSelectConstraint__ConstraintAssignment_19649);
            ruleSelectConstaintExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisSelectConstraintAccess().getConstraintSelectConstaintExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ParenthesisSelectConstraint__ConstraintAssignment_1"


    // $ANTLR start "rule__SelectConstraint__LeftAssignment_0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4776:1: rule__SelectConstraint__LeftAssignment_0 : ( ruleCompareOperand ) ;
    public final void rule__SelectConstraint__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4780:1: ( ( ruleCompareOperand ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4781:1: ( ruleCompareOperand )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4781:1: ( ruleCompareOperand )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4782:1: ruleCompareOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstraintAccess().getLeftCompareOperandParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleCompareOperand_in_rule__SelectConstraint__LeftAssignment_09680);
            ruleCompareOperand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectConstraintAccess().getLeftCompareOperandParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__SelectConstraint__LeftAssignment_0"


    // $ANTLR start "rule__SelectConstraint__ComperatorAssignment_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4791:1: rule__SelectConstraint__ComperatorAssignment_1 : ( ruleComparator ) ;
    public final void rule__SelectConstraint__ComperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4795:1: ( ( ruleComparator ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4796:1: ( ruleComparator )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4796:1: ( ruleComparator )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4797:1: ruleComparator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstraintAccess().getComperatorComparatorEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleComparator_in_rule__SelectConstraint__ComperatorAssignment_19711);
            ruleComparator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectConstraintAccess().getComperatorComparatorEnumRuleCall_1_0()); 
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
    // $ANTLR end "rule__SelectConstraint__ComperatorAssignment_1"


    // $ANTLR start "rule__SelectConstraint__RightAssignment_2"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4806:1: rule__SelectConstraint__RightAssignment_2 : ( ruleCompareOperand ) ;
    public final void rule__SelectConstraint__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4810:1: ( ( ruleCompareOperand ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4811:1: ( ruleCompareOperand )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4811:1: ( ruleCompareOperand )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4812:1: ruleCompareOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstraintAccess().getRightCompareOperandParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleCompareOperand_in_rule__SelectConstraint__RightAssignment_29742);
            ruleCompareOperand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectConstraintAccess().getRightCompareOperandParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__SelectConstraint__RightAssignment_2"


    // $ANTLR start "rule__ParameterExpression__InputAssignment_0_0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4821:1: rule__ParameterExpression__InputAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterExpression__InputAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4825:1: ( ( ( RULE_ID ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4826:1: ( ( RULE_ID ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4826:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4827:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterExpressionAccess().getInputSelectInputCrossReference_0_0_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4828:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4829:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterExpressionAccess().getInputSelectInputIDTerminalRuleCall_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterExpression__InputAssignment_0_09777); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterExpressionAccess().getInputSelectInputIDTerminalRuleCall_0_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterExpressionAccess().getInputSelectInputCrossReference_0_0_0()); 
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
    // $ANTLR end "rule__ParameterExpression__InputAssignment_0_0"


    // $ANTLR start "rule__ParameterExpression__PropertyReferenceAssignment_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4840:1: rule__ParameterExpression__PropertyReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterExpression__PropertyReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4844:1: ( ( ( RULE_ID ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4845:1: ( ( RULE_ID ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4845:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4846:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterExpressionAccess().getPropertyReferencePropertyCrossReference_1_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4847:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4848:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterExpressionAccess().getPropertyReferencePropertyIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterExpression__PropertyReferenceAssignment_19816); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterExpressionAccess().getPropertyReferencePropertyIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterExpressionAccess().getPropertyReferencePropertyCrossReference_1_0()); 
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
    // $ANTLR end "rule__ParameterExpression__PropertyReferenceAssignment_1"


    // $ANTLR start "rule__Filter__NameAssignment_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4859:1: rule__Filter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Filter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4863:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4864:1: ( RULE_ID )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4864:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4865:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFilterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Filter__NameAssignment_19851); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFilterAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Filter__NameAssignment_1"


    // $ANTLR start "rule__Filter__SourceReferenceAssignment_2"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4874:1: rule__Filter__SourceReferenceAssignment_2 : ( ruleSourceReference ) ;
    public final void rule__Filter__SourceReferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4878:1: ( ( ruleSourceReference ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4879:1: ( ruleSourceReference )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4879:1: ( ruleSourceReference )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4880:1: ruleSourceReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFilterAccess().getSourceReferenceSourceReferenceParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleSourceReference_in_rule__Filter__SourceReferenceAssignment_29882);
            ruleSourceReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFilterAccess().getSourceReferenceSourceReferenceParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Filter__SourceReferenceAssignment_2"


    // $ANTLR start "rule__Filter__ConstraintAssignment_3"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4889:1: rule__Filter__ConstraintAssignment_3 : ( ruleConstraintExpression ) ;
    public final void rule__Filter__ConstraintAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4893:1: ( ( ruleConstraintExpression ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4894:1: ( ruleConstraintExpression )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4894:1: ( ruleConstraintExpression )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4895:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFilterAccess().getConstraintConstraintExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__Filter__ConstraintAssignment_39913);
            ruleConstraintExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFilterAccess().getConstraintConstraintExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Filter__ConstraintAssignment_3"


    // $ANTLR start "rule__ConstraintExpression__OperatorAssignment_1_0_0_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4904:1: rule__ConstraintExpression__OperatorAssignment_1_0_0_1 : ( ruleLogicOperator ) ;
    public final void rule__ConstraintExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4908:1: ( ( ruleLogicOperator ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4909:1: ( ruleLogicOperator )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4909:1: ( ruleLogicOperator )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4910:1: ruleLogicOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getOperatorLogicOperatorEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleLogicOperator_in_rule__ConstraintExpression__OperatorAssignment_1_0_0_19944);
            ruleLogicOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionAccess().getOperatorLogicOperatorEnumRuleCall_1_0_0_1_0()); 
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
    // $ANTLR end "rule__ConstraintExpression__OperatorAssignment_1_0_0_1"


    // $ANTLR start "rule__ConstraintExpression__RightAssignment_1_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4919:1: rule__ConstraintExpression__RightAssignment_1_1 : ( rulePropertyConstraint ) ;
    public final void rule__ConstraintExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4923:1: ( ( rulePropertyConstraint ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4924:1: ( rulePropertyConstraint )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4924:1: ( rulePropertyConstraint )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4925:1: rulePropertyConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getRightPropertyConstraintParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulePropertyConstraint_in_rule__ConstraintExpression__RightAssignment_1_19975);
            rulePropertyConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionAccess().getRightPropertyConstraintParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__ConstraintExpression__RightAssignment_1_1"


    // $ANTLR start "rule__ParenthesisConstraint__ConstraintAssignment_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4934:1: rule__ParenthesisConstraint__ConstraintAssignment_1 : ( ruleConstraintExpression ) ;
    public final void rule__ParenthesisConstraint__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4938:1: ( ( ruleConstraintExpression ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4939:1: ( ruleConstraintExpression )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4939:1: ( ruleConstraintExpression )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4940:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getConstraintConstraintExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__ParenthesisConstraint__ConstraintAssignment_110006);
            ruleConstraintExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisConstraintAccess().getConstraintConstraintExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ParenthesisConstraint__ConstraintAssignment_1"


    // $ANTLR start "rule__Constraint__TypeSelectionAssignment_0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4949:1: rule__Constraint__TypeSelectionAssignment_0 : ( ruleTypeSelection ) ;
    public final void rule__Constraint__TypeSelectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4953:1: ( ( ruleTypeSelection ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4954:1: ( ruleTypeSelection )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4954:1: ( ruleTypeSelection )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4955:1: ruleTypeSelection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getTypeSelectionTypeSelectionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleTypeSelection_in_rule__Constraint__TypeSelectionAssignment_010037);
            ruleTypeSelection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getTypeSelectionTypeSelectionParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Constraint__TypeSelectionAssignment_0"


    // $ANTLR start "rule__Constraint__PropertyConstraintAssignment_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4964:1: rule__Constraint__PropertyConstraintAssignment_1 : ( rulePropertyConstraint ) ;
    public final void rule__Constraint__PropertyConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4968:1: ( ( rulePropertyConstraint ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4969:1: ( rulePropertyConstraint )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4969:1: ( rulePropertyConstraint )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4970:1: rulePropertyConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getPropertyConstraintPropertyConstraintParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePropertyConstraint_in_rule__Constraint__PropertyConstraintAssignment_110068);
            rulePropertyConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintAccess().getPropertyConstraintPropertyConstraintParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Constraint__PropertyConstraintAssignment_1"


    // $ANTLR start "rule__PropertyConstraint__OperatorAssignment_1_0_0_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4979:1: rule__PropertyConstraint__OperatorAssignment_1_0_0_1 : ( ruleLogicOperator ) ;
    public final void rule__PropertyConstraint__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4983:1: ( ( ruleLogicOperator ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4984:1: ( ruleLogicOperator )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4984:1: ( ruleLogicOperator )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4985:1: ruleLogicOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getOperatorLogicOperatorEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleLogicOperator_in_rule__PropertyConstraint__OperatorAssignment_1_0_0_110099);
            ruleLogicOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintAccess().getOperatorLogicOperatorEnumRuleCall_1_0_0_1_0()); 
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
    // $ANTLR end "rule__PropertyConstraint__OperatorAssignment_1_0_0_1"


    // $ANTLR start "rule__PropertyConstraint__RightAssignment_1_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4994:1: rule__PropertyConstraint__RightAssignment_1_1 : ( rulePropertyConstraint ) ;
    public final void rule__PropertyConstraint__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4998:1: ( ( rulePropertyConstraint ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4999:1: ( rulePropertyConstraint )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4999:1: ( rulePropertyConstraint )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5000:1: rulePropertyConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getRightPropertyConstraintParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulePropertyConstraint_in_rule__PropertyConstraint__RightAssignment_1_110130);
            rulePropertyConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintAccess().getRightPropertyConstraintParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__PropertyConstraint__RightAssignment_1_1"


    // $ANTLR start "rule__PropertyParenthesisConstraint__ConstraintAssignment_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5009:1: rule__PropertyParenthesisConstraint__ConstraintAssignment_1 : ( rulePropertyConstraint ) ;
    public final void rule__PropertyParenthesisConstraint__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5013:1: ( ( rulePropertyConstraint ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5014:1: ( rulePropertyConstraint )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5014:1: ( rulePropertyConstraint )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5015:1: rulePropertyConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyParenthesisConstraintAccess().getConstraintPropertyConstraintParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePropertyConstraint_in_rule__PropertyParenthesisConstraint__ConstraintAssignment_110161);
            rulePropertyConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyParenthesisConstraintAccess().getConstraintPropertyConstraintParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__PropertyParenthesisConstraint__ConstraintAssignment_1"


    // $ANTLR start "rule__PropertyValueConstraint__PropertyAssignment_0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5024:1: rule__PropertyValueConstraint__PropertyAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyValueConstraint__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5028:1: ( ( ( RULE_ID ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5029:1: ( ( RULE_ID ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5029:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5030:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueConstraintAccess().getPropertyPropertyCrossReference_0_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5031:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5032:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueConstraintAccess().getPropertyPropertyIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PropertyValueConstraint__PropertyAssignment_010196); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueConstraintAccess().getPropertyPropertyIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueConstraintAccess().getPropertyPropertyCrossReference_0_0()); 
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
    // $ANTLR end "rule__PropertyValueConstraint__PropertyAssignment_0"


    // $ANTLR start "rule__PropertyValueConstraint__ComparatorAssignment_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5043:1: rule__PropertyValueConstraint__ComparatorAssignment_1 : ( ruleComparator ) ;
    public final void rule__PropertyValueConstraint__ComparatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5047:1: ( ( ruleComparator ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5048:1: ( ruleComparator )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5048:1: ( ruleComparator )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5049:1: ruleComparator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueConstraintAccess().getComparatorComparatorEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleComparator_in_rule__PropertyValueConstraint__ComparatorAssignment_110231);
            ruleComparator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueConstraintAccess().getComparatorComparatorEnumRuleCall_1_0()); 
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
    // $ANTLR end "rule__PropertyValueConstraint__ComparatorAssignment_1"


    // $ANTLR start "rule__PropertyValueConstraint__ValueAssignment_2"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5058:1: rule__PropertyValueConstraint__ValueAssignment_2 : ( ruleLiteral ) ;
    public final void rule__PropertyValueConstraint__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5062:1: ( ( ruleLiteral ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5063:1: ( ruleLiteral )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5063:1: ( ruleLiteral )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5064:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueConstraintAccess().getValueLiteralParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__PropertyValueConstraint__ValueAssignment_210262);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueConstraintAccess().getValueLiteralParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__PropertyValueConstraint__ValueAssignment_2"


    // $ANTLR start "rule__ConcreteType__TypeAssignment"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5073:1: rule__ConcreteType__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ConcreteType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5077:1: ( ( ( RULE_ID ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5078:1: ( ( RULE_ID ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5078:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5079:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteTypeAccess().getTypeTypeCrossReference_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5080:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5081:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteTypeAccess().getTypeTypeIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConcreteType__TypeAssignment10297); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcreteTypeAccess().getTypeTypeIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConcreteTypeAccess().getTypeTypeCrossReference_0()); 
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
    // $ANTLR end "rule__ConcreteType__TypeAssignment"


    // $ANTLR start "rule__TemplateTypeSelection__TypesAssignment_2"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5092:1: rule__TemplateTypeSelection__TypesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__TemplateTypeSelection__TypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5096:1: ( ( ( RULE_ID ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5097:1: ( ( RULE_ID ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5097:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5098:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeSelectionAccess().getTypesTemplateTypeCrossReference_2_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5099:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5100:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeSelectionAccess().getTypesTemplateTypeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TemplateTypeSelection__TypesAssignment_210336); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeSelectionAccess().getTypesTemplateTypeIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeSelectionAccess().getTypesTemplateTypeCrossReference_2_0()); 
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
    // $ANTLR end "rule__TemplateTypeSelection__TypesAssignment_2"


    // $ANTLR start "rule__TemplateTypeSelection__TypesAssignment_3_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5111:1: rule__TemplateTypeSelection__TypesAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TemplateTypeSelection__TypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5115:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5116:1: ( ( ruleQualifiedName ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5116:1: ( ( ruleQualifiedName ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5117:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeSelectionAccess().getTypesTemplateTypeCrossReference_3_1_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5118:1: ( ruleQualifiedName )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5119:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeSelectionAccess().getTypesTemplateTypeQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TemplateTypeSelection__TypesAssignment_3_110375);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeSelectionAccess().getTypesTemplateTypeQualifiedNameParserRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeSelectionAccess().getTypesTemplateTypeCrossReference_3_1_0()); 
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
    // $ANTLR end "rule__TemplateTypeSelection__TypesAssignment_3_1"


    // $ANTLR start "rule__RecordTypeSelection__ModifierAssignment_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5130:1: rule__RecordTypeSelection__ModifierAssignment_1 : ( ruleRecordTypeModifier ) ;
    public final void rule__RecordTypeSelection__ModifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5134:1: ( ( ruleRecordTypeModifier ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5135:1: ( ruleRecordTypeModifier )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5135:1: ( ruleRecordTypeModifier )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5136:1: ruleRecordTypeModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeSelectionAccess().getModifierRecordTypeModifierEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleRecordTypeModifier_in_rule__RecordTypeSelection__ModifierAssignment_110410);
            ruleRecordTypeModifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeSelectionAccess().getModifierRecordTypeModifierEnumRuleCall_1_0()); 
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
    // $ANTLR end "rule__RecordTypeSelection__ModifierAssignment_1"


    // $ANTLR start "rule__RecordTypeSelection__TypeAssignment_2"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5145:1: rule__RecordTypeSelection__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__RecordTypeSelection__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5149:1: ( ( ( RULE_ID ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5150:1: ( ( RULE_ID ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5150:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5151:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeSelectionAccess().getTypeRecordTypeCrossReference_2_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5152:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5153:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeSelectionAccess().getTypeRecordTypeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RecordTypeSelection__TypeAssignment_210445); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeSelectionAccess().getTypeRecordTypeIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeSelectionAccess().getTypeRecordTypeCrossReference_2_0()); 
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
    // $ANTLR end "rule__RecordTypeSelection__TypeAssignment_2"


    // $ANTLR start "rule__SourceReference__FilterAssignment_1_0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5164:1: rule__SourceReference__FilterAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__SourceReference__FilterAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5168:1: ( ( ( RULE_ID ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5169:1: ( ( RULE_ID ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5169:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5170:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceReferenceAccess().getFilterOperationCrossReference_1_0_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5171:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5172:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceReferenceAccess().getFilterOperationIDTerminalRuleCall_1_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SourceReference__FilterAssignment_1_010484); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceReferenceAccess().getFilterOperationIDTerminalRuleCall_1_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceReferenceAccess().getFilterOperationCrossReference_1_0_0()); 
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
    // $ANTLR end "rule__SourceReference__FilterAssignment_1_0"


    // $ANTLR start "rule__SourceReference__DefaultAssignment_1_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5183:1: rule__SourceReference__DefaultAssignment_1_1 : ( ( 'default' ) ) ;
    public final void rule__SourceReference__DefaultAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5187:1: ( ( ( 'default' ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5188:1: ( ( 'default' ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5188:1: ( ( 'default' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5189:1: ( 'default' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceReferenceAccess().getDefaultDefaultKeyword_1_1_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5190:1: ( 'default' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5191:1: 'default'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceReferenceAccess().getDefaultDefaultKeyword_1_1_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__SourceReference__DefaultAssignment_1_110524); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceReferenceAccess().getDefaultDefaultKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceReferenceAccess().getDefaultDefaultKeyword_1_1_0()); 
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
    // $ANTLR end "rule__SourceReference__DefaultAssignment_1_1"


    // $ANTLR start "rule__ArrayLiteral__LiteralsAssignment_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5206:1: rule__ArrayLiteral__LiteralsAssignment_1 : ( ruleLiteral ) ;
    public final void rule__ArrayLiteral__LiteralsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5210:1: ( ( ruleLiteral ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5211:1: ( ruleLiteral )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5211:1: ( ruleLiteral )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5212:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_110563);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ArrayLiteral__LiteralsAssignment_1"


    // $ANTLR start "rule__ArrayLiteral__LiteralsAssignment_2_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5221:1: rule__ArrayLiteral__LiteralsAssignment_2_1 : ( ruleLiteral ) ;
    public final void rule__ArrayLiteral__LiteralsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5225:1: ( ( ruleLiteral ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5226:1: ( ruleLiteral )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5226:1: ( ruleLiteral )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5227:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_2_110594);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__ArrayLiteral__LiteralsAssignment_2_1"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5236:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5240:1: ( ( RULE_STRING ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5241:1: ( RULE_STRING )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5241:1: ( RULE_STRING )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5242:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment10625); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__StringLiteral__ValueAssignment"


    // $ANTLR start "rule__IntLiteral__ValueAssignment"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5251:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5255:1: ( ( RULE_INT ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5256:1: ( RULE_INT )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5256:1: ( RULE_INT )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5257:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment10656); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__IntLiteral__ValueAssignment"


    // $ANTLR start "rule__FloatLiteral__ValueAssignment"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5266:1: rule__FloatLiteral__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5270:1: ( ( RULE_FLOAT ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5271:1: ( RULE_FLOAT )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5271:1: ( RULE_FLOAT )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5272:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FloatLiteral__ValueAssignment10687); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__FloatLiteral__ValueAssignment"


    // $ANTLR start "rule__BooleanLiteral__ValueAssignment"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5281:1: rule__BooleanLiteral__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5285:1: ( ( RULE_BOOLEAN ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5286:1: ( RULE_BOOLEAN )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5286:1: ( RULE_BOOLEAN )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5287:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__BooleanLiteral__ValueAssignment10718); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__BooleanLiteral__ValueAssignment"


    // $ANTLR start "rule__BuiltInValueLiteral__ValueAssignment_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5296:1: rule__BuiltInValueLiteral__ValueAssignment_1 : ( ( 'KIEKER_VERSION' ) ) ;
    public final void rule__BuiltInValueLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5300:1: ( ( ( 'KIEKER_VERSION' ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5301:1: ( ( 'KIEKER_VERSION' ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5301:1: ( ( 'KIEKER_VERSION' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5302:1: ( 'KIEKER_VERSION' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getValueKIEKER_VERSIONKeyword_1_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5303:1: ( 'KIEKER_VERSION' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5304:1: 'KIEKER_VERSION'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getValueKIEKER_VERSIONKeyword_1_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__BuiltInValueLiteral__ValueAssignment_110754); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltInValueLiteralAccess().getValueKIEKER_VERSIONKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltInValueLiteralAccess().getValueKIEKER_VERSIONKeyword_1_0()); 
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
    // $ANTLR end "rule__BuiltInValueLiteral__ValueAssignment_1"

    // $ANTLR start synpred31_InternalConstraintLang
    public final void synpred31_InternalConstraintLang_fragment() throws RecognitionException {   
        // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3306:2: ( rule__PropertyConstraint__Group_1__0 )
        // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3306:2: rule__PropertyConstraint__Group_1__0
        {
        pushFollow(FOLLOW_rule__PropertyConstraint__Group_1__0_in_synpred31_InternalConstraintLang6758);
        rule__PropertyConstraint__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalConstraintLang

    // Delegated rules

    public final boolean synpred31_InternalConstraintLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalConstraintLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Alternatives_in_ruleOperation220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_entryRuleSelection247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelection254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__0_in_ruleSelection280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectInput_in_entryRuleSelectInput307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectInput314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectInput__Group__0_in_ruleSelectInput340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstaintExpression_in_entryRuleSelectConstaintExpression367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectConstaintExpression374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group__0_in_ruleSelectConstaintExpression400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicSelectConstraint_in_entryRuleBasicSelectConstraint427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicSelectConstraint434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicSelectConstraint__Alternatives_in_ruleBasicSelectConstraint460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisSelectConstraint_in_entryRuleParenthesisSelectConstraint487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisSelectConstraint494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisSelectConstraint__Group__0_in_ruleParenthesisSelectConstraint520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstraint_in_entryRuleSelectConstraint547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectConstraint554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstraint__Group__0_in_ruleSelectConstraint580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperand_in_entryRuleCompareOperand607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperand614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperand__Alternatives_in_ruleCompareOperand640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_entryRuleParameterExpression667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterExpression674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterExpression__Group__0_in_ruleParameterExpression700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilter_in_entryRuleFilter727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilter734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Filter__Group__0_in_ruleFilter760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_entryRuleConstraintExpression787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintExpression794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__0_in_ruleConstraintExpression820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicConstraint_in_entryRuleBasicConstraint847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicConstraint854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicConstraint__Alternatives_in_ruleBasicConstraint880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisConstraint_in_entryRuleParenthesisConstraint907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisConstraint914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__0_in_ruleParenthesisConstraint940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyConstraint_in_entryRulePropertyConstraint1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyConstraint1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group__0_in_rulePropertyConstraint1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicPropertyConstraint_in_entryRuleBasicPropertyConstraint1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicPropertyConstraint1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicPropertyConstraint__Alternatives_in_ruleBasicPropertyConstraint1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyParenthesisConstraint_in_entryRulePropertyParenthesisConstraint1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyParenthesisConstraint1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyParenthesisConstraint__Group__0_in_rulePropertyParenthesisConstraint1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValueConstraint_in_entryRulePropertyValueConstraint1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValueConstraint1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyValueConstraint__Group__0_in_rulePropertyValueConstraint1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSelection_in_entryRuleTypeSelection1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeSelection1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeSelection__Alternatives_in_ruleTypeSelection1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteType_in_entryRuleConcreteType1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcreteType1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConcreteType__TypeAssignment_in_ruleConcreteType1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateTypeSelection_in_entryRuleTemplateTypeSelection1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateTypeSelection1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__Group__0_in_ruleTemplateTypeSelection1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTypeSelection_in_entryRuleRecordTypeSelection1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordTypeSelection1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTypeSelection__Group__0_in_ruleRecordTypeSelection1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceReference_in_entryRuleSourceReference1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSourceReference1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceReference__Group__0_in_ruleSourceReference1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral1627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteral1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__0_in_ruleArrayLiteral1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral1747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral1807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLiteral__ValueAssignment_in_ruleFloatLiteral1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInValueLiteral_in_entryRuleBuiltInValueLiteral1927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInValueLiteral1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInValueLiteral__Group__0_in_ruleBuiltInValueLiteral1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard2047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTypeModifier__Alternatives_in_ruleRecordTypeModifier2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicOperator__Alternatives_in_ruleLogicOperator2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparator__Alternatives_in_ruleComparator2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilter_in_rule__Operation__Alternatives2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_rule__Operation__Alternatives2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisSelectConstraint_in_rule__BasicSelectConstraint__Alternatives2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstraint_in_rule__BasicSelectConstraint__Alternatives2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_rule__CompareOperand__Alternatives2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__CompareOperand__Alternatives2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisConstraint_in_rule__BasicConstraint__Alternatives2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__BasicConstraint__Alternatives2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyParenthesisConstraint_in_rule__BasicPropertyConstraint__Alternatives2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValueConstraint_in_rule__BasicPropertyConstraint__Alternatives2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteType_in_rule__TypeSelection__Alternatives2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateTypeSelection_in_rule__TypeSelection__Alternatives2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTypeSelection_in_rule__TypeSelection__Alternatives2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceReference__FilterAssignment_1_0_in_rule__SourceReference__Alternatives_12535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceReference__DefaultAssignment_1_1_in_rule__SourceReference__Alternatives_12553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_rule__Literal__Alternatives2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_rule__Literal__Alternatives2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInValueLiteral_in_rule__Literal__Alternatives2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RecordTypeModifier__Alternatives2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RecordTypeModifier__Alternatives2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__LogicOperator__Alternatives2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__LogicOperator__Alternatives2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Comparator__Alternatives2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Comparator__Alternatives2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Comparator__Alternatives2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Comparator__Alternatives2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Comparator__Alternatives2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Comparator__Alternatives2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Comparator__Alternatives2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02977 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Model__Group__0__Impl3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13039 = new BitSet(new long[]{0x000000040C000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23099 = new BitSet(new long[]{0x000000040C000000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__23102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_2_in_rule__Model__Group__2__Impl3129 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__OperationsAssignment_3_in_rule__Model__Group__3__Impl3187 = new BitSet(new long[]{0x0000000408000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03226 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Import__Group__0__Impl3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__03349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__03352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Selection__Group__0__Impl3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__13411 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__13414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__NameAssignment_1_in_rule__Selection__Group__1__Impl3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__23471 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Selection__Group__3_in_rule__Selection__Group__23474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__SourceReferenceAssignment_2_in_rule__Selection__Group__2__Impl3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__3__Impl_in_rule__Selection__Group__33531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Selection__Group__4_in_rule__Selection__Group__33534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Selection__Group__3__Impl3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__4__Impl_in_rule__Selection__Group__43593 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_rule__Selection__Group__5_in_rule__Selection__Group__43596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__InputsAssignment_4_in_rule__Selection__Group__4__Impl3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__5__Impl_in_rule__Selection__Group__53653 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_rule__Selection__Group__6_in_rule__Selection__Group__53656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group_5__0_in_rule__Selection__Group__5__Impl3683 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__6__Impl_in_rule__Selection__Group__63714 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Selection__Group__7_in_rule__Selection__Group__63717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Selection__Group__6__Impl3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__7__Impl_in_rule__Selection__Group__73776 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Selection__Group__8_in_rule__Selection__Group__73779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__RecordTypeAssignment_7_in_rule__Selection__Group__7__Impl3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__8__Impl_in_rule__Selection__Group__83836 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Selection__Group__9_in_rule__Selection__Group__83839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Selection__Group__8__Impl3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__9__Impl_in_rule__Selection__Group__93898 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__Selection__Group__10_in_rule__Selection__Group__93901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__ParemterExpressionsAssignment_9_in_rule__Selection__Group__9__Impl3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__10__Impl_in_rule__Selection__Group__103958 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__Selection__Group__11_in_rule__Selection__Group__103961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group_10__0_in_rule__Selection__Group__10__Impl3988 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__11__Impl_in_rule__Selection__Group__114019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Selection__Group__11__Impl4047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group_5__0__Impl_in_rule__Selection__Group_5__04102 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Selection__Group_5__1_in_rule__Selection__Group_5__04105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Selection__Group_5__0__Impl4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group_5__1__Impl_in_rule__Selection__Group_5__14164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__InputsAssignment_5_1_in_rule__Selection__Group_5__1__Impl4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group_10__0__Impl_in_rule__Selection__Group_10__04225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Selection__Group_10__1_in_rule__Selection__Group_10__04228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Selection__Group_10__0__Impl4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group_10__1__Impl_in_rule__Selection__Group_10__14287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__ParemterExpressionsAssignment_10_1_in_rule__Selection__Group_10__1__Impl4314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectInput__Group__0__Impl_in_rule__SelectInput__Group__04348 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SelectInput__Group__1_in_rule__SelectInput__Group__04351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectInput__RecordTypeAssignment_0_in_rule__SelectInput__Group__0__Impl4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectInput__Group__1__Impl_in_rule__SelectInput__Group__14408 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__SelectInput__Group__2_in_rule__SelectInput__Group__14411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectInput__NameAssignment_1_in_rule__SelectInput__Group__1__Impl4438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectInput__Group__2__Impl_in_rule__SelectInput__Group__24468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectInput__Group_2__0_in_rule__SelectInput__Group__2__Impl4495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectInput__Group_2__0__Impl_in_rule__SelectInput__Group_2__04532 = new BitSet(new long[]{0x00000440400001F0L});
    public static final BitSet FOLLOW_rule__SelectInput__Group_2__1_in_rule__SelectInput__Group_2__04535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SelectInput__Group_2__0__Impl4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectInput__Group_2__1__Impl_in_rule__SelectInput__Group_2__14594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectInput__SelectConstraintAssignment_2_1_in_rule__SelectInput__Group_2__1__Impl4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group__0__Impl_in_rule__SelectConstaintExpression__Group__04655 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group__1_in_rule__SelectConstaintExpression__Group__04658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicSelectConstraint_in_rule__SelectConstaintExpression__Group__0__Impl4685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group__1__Impl_in_rule__SelectConstaintExpression__Group__14714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group_1__0_in_rule__SelectConstaintExpression__Group__1__Impl4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group_1__0__Impl_in_rule__SelectConstaintExpression__Group_1__04776 = new BitSet(new long[]{0x00000440400001F0L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group_1__1_in_rule__SelectConstaintExpression__Group_1__04779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group_1_0__0_in_rule__SelectConstaintExpression__Group_1__0__Impl4806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group_1__1__Impl_in_rule__SelectConstaintExpression__Group_1__14836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__RightAssignment_1_1_in_rule__SelectConstaintExpression__Group_1__1__Impl4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group_1_0__0__Impl_in_rule__SelectConstaintExpression__Group_1_0__04897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group_1_0_0__0_in_rule__SelectConstaintExpression__Group_1_0__0__Impl4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group_1_0_0__0__Impl_in_rule__SelectConstaintExpression__Group_1_0_0__04956 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group_1_0_0__1_in_rule__SelectConstaintExpression__Group_1_0_0__04959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group_1_0_0__1__Impl_in_rule__SelectConstaintExpression__Group_1_0_0__15017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1_in_rule__SelectConstaintExpression__Group_1_0_0__1__Impl5044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisSelectConstraint__Group__0__Impl_in_rule__ParenthesisSelectConstraint__Group__05078 = new BitSet(new long[]{0x00000440400001F0L});
    public static final BitSet FOLLOW_rule__ParenthesisSelectConstraint__Group__1_in_rule__ParenthesisSelectConstraint__Group__05081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ParenthesisSelectConstraint__Group__0__Impl5109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisSelectConstraint__Group__1__Impl_in_rule__ParenthesisSelectConstraint__Group__15140 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ParenthesisSelectConstraint__Group__2_in_rule__ParenthesisSelectConstraint__Group__15143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisSelectConstraint__ConstraintAssignment_1_in_rule__ParenthesisSelectConstraint__Group__1__Impl5170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisSelectConstraint__Group__2__Impl_in_rule__ParenthesisSelectConstraint__Group__25200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ParenthesisSelectConstraint__Group__2__Impl5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstraint__Group__0__Impl_in_rule__SelectConstraint__Group__05265 = new BitSet(new long[]{0x0000000001FC0000L});
    public static final BitSet FOLLOW_rule__SelectConstraint__Group__1_in_rule__SelectConstraint__Group__05268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstraint__LeftAssignment_0_in_rule__SelectConstraint__Group__0__Impl5295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstraint__Group__1__Impl_in_rule__SelectConstraint__Group__15325 = new BitSet(new long[]{0x00000440400001F0L});
    public static final BitSet FOLLOW_rule__SelectConstraint__Group__2_in_rule__SelectConstraint__Group__15328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstraint__ComperatorAssignment_1_in_rule__SelectConstraint__Group__1__Impl5355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstraint__Group__2__Impl_in_rule__SelectConstraint__Group__25385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstraint__RightAssignment_2_in_rule__SelectConstraint__Group__2__Impl5412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterExpression__Group__0__Impl_in_rule__ParameterExpression__Group__05448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParameterExpression__Group__1_in_rule__ParameterExpression__Group__05451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterExpression__Group_0__0_in_rule__ParameterExpression__Group__0__Impl5478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterExpression__Group__1__Impl_in_rule__ParameterExpression__Group__15509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterExpression__PropertyReferenceAssignment_1_in_rule__ParameterExpression__Group__1__Impl5536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterExpression__Group_0__0__Impl_in_rule__ParameterExpression__Group_0__05570 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ParameterExpression__Group_0__1_in_rule__ParameterExpression__Group_0__05573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterExpression__InputAssignment_0_0_in_rule__ParameterExpression__Group_0__0__Impl5600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterExpression__Group_0__1__Impl_in_rule__ParameterExpression__Group_0__15630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ParameterExpression__Group_0__1__Impl5658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Filter__Group__0__Impl_in_rule__Filter__Group__05693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Filter__Group__1_in_rule__Filter__Group__05696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Filter__Group__0__Impl5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Filter__Group__1__Impl_in_rule__Filter__Group__15755 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Filter__Group__2_in_rule__Filter__Group__15758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Filter__NameAssignment_1_in_rule__Filter__Group__1__Impl5785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Filter__Group__2__Impl_in_rule__Filter__Group__25815 = new BitSet(new long[]{0x0000000840000010L});
    public static final BitSet FOLLOW_rule__Filter__Group__3_in_rule__Filter__Group__25818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Filter__SourceReferenceAssignment_2_in_rule__Filter__Group__2__Impl5845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Filter__Group__3__Impl_in_rule__Filter__Group__35875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Filter__ConstraintAssignment_3_in_rule__Filter__Group__3__Impl5902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__0__Impl_in_rule__ConstraintExpression__Group__05940 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__1_in_rule__ConstraintExpression__Group__05943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicConstraint_in_rule__ConstraintExpression__Group__0__Impl5970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__1__Impl_in_rule__ConstraintExpression__Group__15999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__0_in_rule__ConstraintExpression__Group__1__Impl6026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__0__Impl_in_rule__ConstraintExpression__Group_1__06061 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__1_in_rule__ConstraintExpression__Group_1__06064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0__0_in_rule__ConstraintExpression__Group_1__0__Impl6091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__1__Impl_in_rule__ConstraintExpression__Group_1__16121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__RightAssignment_1_1_in_rule__ConstraintExpression__Group_1__1__Impl6148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0__0__Impl_in_rule__ConstraintExpression__Group_1_0__06182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__0_in_rule__ConstraintExpression__Group_1_0__0__Impl6209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__0__Impl_in_rule__ConstraintExpression__Group_1_0_0__06241 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__1_in_rule__ConstraintExpression__Group_1_0_0__06244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__1__Impl_in_rule__ConstraintExpression__Group_1_0_0__16302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__OperatorAssignment_1_0_0_1_in_rule__ConstraintExpression__Group_1_0_0__1__Impl6329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__0__Impl_in_rule__ParenthesisConstraint__Group__06363 = new BitSet(new long[]{0x0000000840000010L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__1_in_rule__ParenthesisConstraint__Group__06366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ParenthesisConstraint__Group__0__Impl6394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__1__Impl_in_rule__ParenthesisConstraint__Group__16425 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__2_in_rule__ParenthesisConstraint__Group__16428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__ConstraintAssignment_1_in_rule__ParenthesisConstraint__Group__1__Impl6455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__2__Impl_in_rule__ParenthesisConstraint__Group__26485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ParenthesisConstraint__Group__2__Impl6513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__06550 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__06553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__TypeSelectionAssignment_0_in_rule__Constraint__Group__0__Impl6580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__16610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__PropertyConstraintAssignment_1_in_rule__Constraint__Group__1__Impl6637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group__0__Impl_in_rule__PropertyConstraint__Group__06672 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group__1_in_rule__PropertyConstraint__Group__06675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicPropertyConstraint_in_rule__PropertyConstraint__Group__0__Impl6702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group__1__Impl_in_rule__PropertyConstraint__Group__16731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group_1__0_in_rule__PropertyConstraint__Group__1__Impl6758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group_1__0__Impl_in_rule__PropertyConstraint__Group_1__06793 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group_1__1_in_rule__PropertyConstraint__Group_1__06796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group_1_0__0_in_rule__PropertyConstraint__Group_1__0__Impl6823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group_1__1__Impl_in_rule__PropertyConstraint__Group_1__16853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__RightAssignment_1_1_in_rule__PropertyConstraint__Group_1__1__Impl6880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group_1_0__0__Impl_in_rule__PropertyConstraint__Group_1_0__06914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group_1_0_0__0_in_rule__PropertyConstraint__Group_1_0__0__Impl6941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group_1_0_0__0__Impl_in_rule__PropertyConstraint__Group_1_0_0__06973 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group_1_0_0__1_in_rule__PropertyConstraint__Group_1_0_0__06976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group_1_0_0__1__Impl_in_rule__PropertyConstraint__Group_1_0_0__17034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__OperatorAssignment_1_0_0_1_in_rule__PropertyConstraint__Group_1_0_0__1__Impl7061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyParenthesisConstraint__Group__0__Impl_in_rule__PropertyParenthesisConstraint__Group__07095 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__PropertyParenthesisConstraint__Group__1_in_rule__PropertyParenthesisConstraint__Group__07098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PropertyParenthesisConstraint__Group__0__Impl7126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyParenthesisConstraint__Group__1__Impl_in_rule__PropertyParenthesisConstraint__Group__17157 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__PropertyParenthesisConstraint__Group__2_in_rule__PropertyParenthesisConstraint__Group__17160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyParenthesisConstraint__ConstraintAssignment_1_in_rule__PropertyParenthesisConstraint__Group__1__Impl7187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyParenthesisConstraint__Group__2__Impl_in_rule__PropertyParenthesisConstraint__Group__27217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PropertyParenthesisConstraint__Group__2__Impl7245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyValueConstraint__Group__0__Impl_in_rule__PropertyValueConstraint__Group__07282 = new BitSet(new long[]{0x0000000001FC0000L});
    public static final BitSet FOLLOW_rule__PropertyValueConstraint__Group__1_in_rule__PropertyValueConstraint__Group__07285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyValueConstraint__PropertyAssignment_0_in_rule__PropertyValueConstraint__Group__0__Impl7312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyValueConstraint__Group__1__Impl_in_rule__PropertyValueConstraint__Group__17342 = new BitSet(new long[]{0x00000440400001F0L});
    public static final BitSet FOLLOW_rule__PropertyValueConstraint__Group__2_in_rule__PropertyValueConstraint__Group__17345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyValueConstraint__ComparatorAssignment_1_in_rule__PropertyValueConstraint__Group__1__Impl7372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyValueConstraint__Group__2__Impl_in_rule__PropertyValueConstraint__Group__27402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyValueConstraint__ValueAssignment_2_in_rule__PropertyValueConstraint__Group__2__Impl7429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__Group__0__Impl_in_rule__TemplateTypeSelection__Group__07465 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__Group__1_in_rule__TemplateTypeSelection__Group__07468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__TemplateTypeSelection__Group__0__Impl7496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__Group__1__Impl_in_rule__TemplateTypeSelection__Group__17527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__Group__2_in_rule__TemplateTypeSelection__Group__17530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__TemplateTypeSelection__Group__1__Impl7558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__Group__2__Impl_in_rule__TemplateTypeSelection__Group__27589 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__Group__3_in_rule__TemplateTypeSelection__Group__27592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__TypesAssignment_2_in_rule__TemplateTypeSelection__Group__2__Impl7619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__Group__3__Impl_in_rule__TemplateTypeSelection__Group__37649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__Group_3__0_in_rule__TemplateTypeSelection__Group__3__Impl7676 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__Group_3__0__Impl_in_rule__TemplateTypeSelection__Group_3__07715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__Group_3__1_in_rule__TemplateTypeSelection__Group_3__07718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TemplateTypeSelection__Group_3__0__Impl7746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__Group_3__1__Impl_in_rule__TemplateTypeSelection__Group_3__17777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__TypesAssignment_3_1_in_rule__TemplateTypeSelection__Group_3__1__Impl7804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTypeSelection__Group__0__Impl_in_rule__RecordTypeSelection__Group__07838 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__RecordTypeSelection__Group__1_in_rule__RecordTypeSelection__Group__07841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__RecordTypeSelection__Group__0__Impl7869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTypeSelection__Group__1__Impl_in_rule__RecordTypeSelection__Group__17900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordTypeSelection__Group__2_in_rule__RecordTypeSelection__Group__17903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTypeSelection__ModifierAssignment_1_in_rule__RecordTypeSelection__Group__1__Impl7930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTypeSelection__Group__2__Impl_in_rule__RecordTypeSelection__Group__27960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTypeSelection__TypeAssignment_2_in_rule__RecordTypeSelection__Group__2__Impl7987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceReference__Group__0__Impl_in_rule__SourceReference__Group__08023 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_rule__SourceReference__Group__1_in_rule__SourceReference__Group__08026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__SourceReference__Group__0__Impl8054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceReference__Group__1__Impl_in_rule__SourceReference__Group__18085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceReference__Alternatives_1_in_rule__SourceReference__Group__1__Impl8112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__08146 = new BitSet(new long[]{0x00000440400001F0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__08149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ArrayLiteral__Group__0__Impl8177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__18208 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__18211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__LiteralsAssignment_1_in_rule__ArrayLiteral__Group__1__Impl8238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__28268 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__28271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__0_in_rule__ArrayLiteral__Group__2__Impl8298 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__38329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ArrayLiteral__Group__3__Impl8357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__0__Impl_in_rule__ArrayLiteral__Group_2__08396 = new BitSet(new long[]{0x00000440400001F0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__1_in_rule__ArrayLiteral__Group_2__08399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ArrayLiteral__Group_2__0__Impl8427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__1__Impl_in_rule__ArrayLiteral__Group_2__18458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__LiteralsAssignment_2_1_in_rule__ArrayLiteral__Group_2__1__Impl8485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInValueLiteral__Group__0__Impl_in_rule__BuiltInValueLiteral__Group__08519 = new BitSet(new long[]{0x00000440400001F0L});
    public static final BitSet FOLLOW_rule__BuiltInValueLiteral__Group__1_in_rule__BuiltInValueLiteral__Group__08522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInValueLiteral__Group__1__Impl_in_rule__BuiltInValueLiteral__Group__18580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInValueLiteral__ValueAssignment_1_in_rule__BuiltInValueLiteral__Group__1__Impl8607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08641 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8727 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__QualifiedName__Group_1__0__Impl8794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl8853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__08886 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__08889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl8916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__18945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl8972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__09007 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__09010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl9038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__19069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl9097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_19137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_29168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Model__OperationsAssignment_39199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_19230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Selection__NameAssignment_19261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceReference_in_rule__Selection__SourceReferenceAssignment_29292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectInput_in_rule__Selection__InputsAssignment_49323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectInput_in_rule__Selection__InputsAssignment_5_19354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Selection__RecordTypeAssignment_79389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_rule__Selection__ParemterExpressionsAssignment_99424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_rule__Selection__ParemterExpressionsAssignment_10_19455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SelectInput__RecordTypeAssignment_09490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SelectInput__NameAssignment_19525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstaintExpression_in_rule__SelectInput__SelectConstraintAssignment_2_19556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_rule__SelectConstaintExpression__OperatorAssignment_1_0_0_19587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstaintExpression_in_rule__SelectConstaintExpression__RightAssignment_1_19618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstaintExpression_in_rule__ParenthesisSelectConstraint__ConstraintAssignment_19649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperand_in_rule__SelectConstraint__LeftAssignment_09680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparator_in_rule__SelectConstraint__ComperatorAssignment_19711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperand_in_rule__SelectConstraint__RightAssignment_29742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterExpression__InputAssignment_0_09777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterExpression__PropertyReferenceAssignment_19816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Filter__NameAssignment_19851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceReference_in_rule__Filter__SourceReferenceAssignment_29882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__Filter__ConstraintAssignment_39913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_rule__ConstraintExpression__OperatorAssignment_1_0_0_19944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyConstraint_in_rule__ConstraintExpression__RightAssignment_1_19975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__ParenthesisConstraint__ConstraintAssignment_110006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSelection_in_rule__Constraint__TypeSelectionAssignment_010037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyConstraint_in_rule__Constraint__PropertyConstraintAssignment_110068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_rule__PropertyConstraint__OperatorAssignment_1_0_0_110099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyConstraint_in_rule__PropertyConstraint__RightAssignment_1_110130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyConstraint_in_rule__PropertyParenthesisConstraint__ConstraintAssignment_110161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyValueConstraint__PropertyAssignment_010196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparator_in_rule__PropertyValueConstraint__ComparatorAssignment_110231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__PropertyValueConstraint__ValueAssignment_210262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConcreteType__TypeAssignment10297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TemplateTypeSelection__TypesAssignment_210336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TemplateTypeSelection__TypesAssignment_3_110375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTypeModifier_in_rule__RecordTypeSelection__ModifierAssignment_110410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RecordTypeSelection__TypeAssignment_210445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SourceReference__FilterAssignment_1_010484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__SourceReference__DefaultAssignment_1_110524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_110563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_2_110594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment10625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment10656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatLiteral__ValueAssignment10687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanLiteral__ValueAssignment10718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__BuiltInValueLiteral__ValueAssignment_110754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group_1__0_in_synpred31_InternalConstraintLang6758 = new BitSet(new long[]{0x0000000000000002L});

}