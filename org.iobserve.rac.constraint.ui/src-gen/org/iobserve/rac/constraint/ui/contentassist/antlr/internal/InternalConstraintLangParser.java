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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'super'", "'extends'", "'&'", "'|'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'~'", "'package'", "'import'", "'select'", "'from'", "'store'", "'('", "')'", "','", "':'", "'.'", "'filter'", "'?'", "'uses'", "'{'", "'}'", "'*'", "'KIEKER_VERSION'"
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


    // $ANTLR start "entryRuleLiteral"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:733:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:734:1: ( ruleLiteral EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:735:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1507);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1514); if (state.failed) return ;

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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:742:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:746:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:747:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:747:1: ( ( rule__Literal__Alternatives ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:748:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:749:1: ( rule__Literal__Alternatives )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:749:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1540);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:761:1: entryRuleArrayLiteral : ruleArrayLiteral EOF ;
    public final void entryRuleArrayLiteral() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:762:1: ( ruleArrayLiteral EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:763:1: ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral1567);
            ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLiteral1574); if (state.failed) return ;

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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:770:1: ruleArrayLiteral : ( ( rule__ArrayLiteral__Group__0 ) ) ;
    public final void ruleArrayLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:774:2: ( ( ( rule__ArrayLiteral__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:775:1: ( ( rule__ArrayLiteral__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:775:1: ( ( rule__ArrayLiteral__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:776:1: ( rule__ArrayLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:777:1: ( rule__ArrayLiteral__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:777:2: rule__ArrayLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__0_in_ruleArrayLiteral1600);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:789:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:790:1: ( ruleStringLiteral EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:791:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1627);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1634); if (state.failed) return ;

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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:798:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:802:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:803:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:803:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:804:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:805:1: ( rule__StringLiteral__ValueAssignment )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:805:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1660);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:817:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:818:1: ( ruleIntLiteral EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:819:1: ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral1687);
            ruleIntLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral1694); if (state.failed) return ;

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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:826:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:830:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:831:1: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:831:1: ( ( rule__IntLiteral__ValueAssignment ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:832:1: ( rule__IntLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:833:1: ( rule__IntLiteral__ValueAssignment )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:833:2: rule__IntLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral1720);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:845:1: entryRuleFloatLiteral : ruleFloatLiteral EOF ;
    public final void entryRuleFloatLiteral() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:846:1: ( ruleFloatLiteral EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:847:1: ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral1747);
            ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatLiteral1754); if (state.failed) return ;

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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:854:1: ruleFloatLiteral : ( ( rule__FloatLiteral__ValueAssignment ) ) ;
    public final void ruleFloatLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:858:2: ( ( ( rule__FloatLiteral__ValueAssignment ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:859:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:859:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:860:1: ( rule__FloatLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueAssignment()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:861:1: ( rule__FloatLiteral__ValueAssignment )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:861:2: rule__FloatLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatLiteral__ValueAssignment_in_ruleFloatLiteral1780);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:873:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:874:1: ( ruleBooleanLiteral EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:875:1: ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1807);
            ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral1814); if (state.failed) return ;

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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:882:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:886:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:887:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:887:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:888:1: ( rule__BooleanLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:889:1: ( rule__BooleanLiteral__ValueAssignment )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:889:2: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral1840);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:901:1: entryRuleBuiltInValueLiteral : ruleBuiltInValueLiteral EOF ;
    public final void entryRuleBuiltInValueLiteral() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:902:1: ( ruleBuiltInValueLiteral EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:903:1: ruleBuiltInValueLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltInValueLiteral_in_entryRuleBuiltInValueLiteral1867);
            ruleBuiltInValueLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltInValueLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInValueLiteral1874); if (state.failed) return ;

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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:910:1: ruleBuiltInValueLiteral : ( ( rule__BuiltInValueLiteral__Group__0 ) ) ;
    public final void ruleBuiltInValueLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:914:2: ( ( ( rule__BuiltInValueLiteral__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:915:1: ( ( rule__BuiltInValueLiteral__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:915:1: ( ( rule__BuiltInValueLiteral__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:916:1: ( rule__BuiltInValueLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:917:1: ( rule__BuiltInValueLiteral__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:917:2: rule__BuiltInValueLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__BuiltInValueLiteral__Group__0_in_ruleBuiltInValueLiteral1900);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:929:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:930:1: ( ruleQualifiedName EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:931:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1927);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1934); if (state.failed) return ;

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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:938:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:942:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:943:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:943:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:944:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:945:1: ( rule__QualifiedName__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:945:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1960);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:957:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:958:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:959:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1987);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1994); if (state.failed) return ;

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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:966:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:970:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:971:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:971:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:972:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:973:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:973:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard2020);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:986:1: ruleRecordTypeModifier : ( ( rule__RecordTypeModifier__Alternatives ) ) ;
    public final void ruleRecordTypeModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:990:1: ( ( ( rule__RecordTypeModifier__Alternatives ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:991:1: ( ( rule__RecordTypeModifier__Alternatives ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:991:1: ( ( rule__RecordTypeModifier__Alternatives ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:992:1: ( rule__RecordTypeModifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeModifierAccess().getAlternatives()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:993:1: ( rule__RecordTypeModifier__Alternatives )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:993:2: rule__RecordTypeModifier__Alternatives
            {
            pushFollow(FOLLOW_rule__RecordTypeModifier__Alternatives_in_ruleRecordTypeModifier2057);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1005:1: ruleLogicOperator : ( ( rule__LogicOperator__Alternatives ) ) ;
    public final void ruleLogicOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1009:1: ( ( ( rule__LogicOperator__Alternatives ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1010:1: ( ( rule__LogicOperator__Alternatives ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1010:1: ( ( rule__LogicOperator__Alternatives ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1011:1: ( rule__LogicOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getAlternatives()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1012:1: ( rule__LogicOperator__Alternatives )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1012:2: rule__LogicOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__LogicOperator__Alternatives_in_ruleLogicOperator2093);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1024:1: ruleComparator : ( ( rule__Comparator__Alternatives ) ) ;
    public final void ruleComparator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1028:1: ( ( ( rule__Comparator__Alternatives ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1029:1: ( ( rule__Comparator__Alternatives ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1029:1: ( ( rule__Comparator__Alternatives ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1030:1: ( rule__Comparator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getAlternatives()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1031:1: ( rule__Comparator__Alternatives )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1031:2: rule__Comparator__Alternatives
            {
            pushFollow(FOLLOW_rule__Comparator__Alternatives_in_ruleComparator2129);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1042:1: rule__Operation__Alternatives : ( ( ruleFilter ) | ( ruleSelection ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1046:1: ( ( ruleFilter ) | ( ruleSelection ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==35) ) {
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
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1047:1: ( ruleFilter )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1047:1: ( ruleFilter )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1048:1: ruleFilter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationAccess().getFilterParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleFilter_in_rule__Operation__Alternatives2164);
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
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1053:6: ( ruleSelection )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1053:6: ( ruleSelection )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1054:1: ruleSelection
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationAccess().getSelectionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSelection_in_rule__Operation__Alternatives2181);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1064:1: rule__BasicSelectConstraint__Alternatives : ( ( ruleParenthesisSelectConstraint ) | ( ruleSelectConstraint ) );
    public final void rule__BasicSelectConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1068:1: ( ( ruleParenthesisSelectConstraint ) | ( ruleSelectConstraint ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_BOOLEAN)||LA2_0==38||LA2_0==41) ) {
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
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1069:1: ( ruleParenthesisSelectConstraint )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1069:1: ( ruleParenthesisSelectConstraint )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1070:1: ruleParenthesisSelectConstraint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicSelectConstraintAccess().getParenthesisSelectConstraintParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleParenthesisSelectConstraint_in_rule__BasicSelectConstraint__Alternatives2213);
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
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1075:6: ( ruleSelectConstraint )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1075:6: ( ruleSelectConstraint )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1076:1: ruleSelectConstraint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicSelectConstraintAccess().getSelectConstraintParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSelectConstraint_in_rule__BasicSelectConstraint__Alternatives2230);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1086:1: rule__CompareOperand__Alternatives : ( ( ruleParameterExpression ) | ( ruleLiteral ) );
    public final void rule__CompareOperand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1090:1: ( ( ruleParameterExpression ) | ( ruleLiteral ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_BOOLEAN)||LA3_0==38||LA3_0==41) ) {
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
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1091:1: ( ruleParameterExpression )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1091:1: ( ruleParameterExpression )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1092:1: ruleParameterExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperandAccess().getParameterExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleParameterExpression_in_rule__CompareOperand__Alternatives2262);
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
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1097:6: ( ruleLiteral )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1097:6: ( ruleLiteral )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1098:1: ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperandAccess().getLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_rule__CompareOperand__Alternatives2279);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1108:1: rule__BasicConstraint__Alternatives : ( ( ruleParenthesisConstraint ) | ( ruleConstraint ) );
    public final void rule__BasicConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1112:1: ( ( ruleParenthesisConstraint ) | ( ruleConstraint ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID||LA4_0==36) ) {
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
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1113:1: ( ruleParenthesisConstraint )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1113:1: ( ruleParenthesisConstraint )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1114:1: ruleParenthesisConstraint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicConstraintAccess().getParenthesisConstraintParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleParenthesisConstraint_in_rule__BasicConstraint__Alternatives2311);
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
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1119:6: ( ruleConstraint )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1119:6: ( ruleConstraint )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1120:1: ruleConstraint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicConstraintAccess().getConstraintParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleConstraint_in_rule__BasicConstraint__Alternatives2328);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1130:1: rule__BasicPropertyConstraint__Alternatives : ( ( rulePropertyParenthesisConstraint ) | ( rulePropertyValueConstraint ) );
    public final void rule__BasicPropertyConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1134:1: ( ( rulePropertyParenthesisConstraint ) | ( rulePropertyValueConstraint ) )
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
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1135:1: ( rulePropertyParenthesisConstraint )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1135:1: ( rulePropertyParenthesisConstraint )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1136:1: rulePropertyParenthesisConstraint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicPropertyConstraintAccess().getPropertyParenthesisConstraintParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePropertyParenthesisConstraint_in_rule__BasicPropertyConstraint__Alternatives2360);
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
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1141:6: ( rulePropertyValueConstraint )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1141:6: ( rulePropertyValueConstraint )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1142:1: rulePropertyValueConstraint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicPropertyConstraintAccess().getPropertyValueConstraintParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_rulePropertyValueConstraint_in_rule__BasicPropertyConstraint__Alternatives2377);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1152:1: rule__TypeSelection__Alternatives : ( ( ruleConcreteType ) | ( ruleTemplateTypeSelection ) | ( ruleRecordTypeSelection ) );
    public final void rule__TypeSelection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1156:1: ( ( ruleConcreteType ) | ( ruleTemplateTypeSelection ) | ( ruleRecordTypeSelection ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==36) ) {
                int LA6_2 = input.LA(2);

                if ( ((LA6_2>=14 && LA6_2<=15)) ) {
                    alt6=3;
                }
                else if ( (LA6_2==37) ) {
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
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1157:1: ( ruleConcreteType )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1157:1: ( ruleConcreteType )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1158:1: ruleConcreteType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeSelectionAccess().getConcreteTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleConcreteType_in_rule__TypeSelection__Alternatives2409);
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
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1163:6: ( ruleTemplateTypeSelection )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1163:6: ( ruleTemplateTypeSelection )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1164:1: ruleTemplateTypeSelection
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeSelectionAccess().getTemplateTypeSelectionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleTemplateTypeSelection_in_rule__TypeSelection__Alternatives2426);
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
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1169:6: ( ruleRecordTypeSelection )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1169:6: ( ruleRecordTypeSelection )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1170:1: ruleRecordTypeSelection
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeSelectionAccess().getRecordTypeSelectionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleRecordTypeSelection_in_rule__TypeSelection__Alternatives2443);
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


    // $ANTLR start "rule__Literal__Alternatives"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1180:1: rule__Literal__Alternatives : ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleArrayLiteral ) | ( ruleBuiltInValueLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1184:1: ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleArrayLiteral ) | ( ruleBuiltInValueLiteral ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                alt7=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt7=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt7=4;
                }
                break;
            case 38:
                {
                alt7=5;
                }
                break;
            case 41:
                {
                alt7=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1185:1: ( ruleStringLiteral )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1185:1: ( ruleStringLiteral )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1186:1: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives2475);
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
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1191:6: ( ruleIntLiteral )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1191:6: ( ruleIntLiteral )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1192:1: ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_rule__Literal__Alternatives2492);
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
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1197:6: ( ruleFloatLiteral )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1197:6: ( ruleFloatLiteral )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1198:1: ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives2509);
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
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1203:6: ( ruleBooleanLiteral )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1203:6: ( ruleBooleanLiteral )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1204:1: ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives2526);
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
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1209:6: ( ruleArrayLiteral )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1209:6: ( ruleArrayLiteral )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1210:1: ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getArrayLiteralParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleArrayLiteral_in_rule__Literal__Alternatives2543);
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
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1215:6: ( ruleBuiltInValueLiteral )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1215:6: ( ruleBuiltInValueLiteral )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1216:1: ruleBuiltInValueLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBuiltInValueLiteralParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleBuiltInValueLiteral_in_rule__Literal__Alternatives2560);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1226:1: rule__RecordTypeModifier__Alternatives : ( ( ( 'super' ) ) | ( ( 'extends' ) ) );
    public final void rule__RecordTypeModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1230:1: ( ( ( 'super' ) ) | ( ( 'extends' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1231:1: ( ( 'super' ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1231:1: ( ( 'super' ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1232:1: ( 'super' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecordTypeModifierAccess().getSUPEREnumLiteralDeclaration_0()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1233:1: ( 'super' )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1233:3: 'super'
                    {
                    match(input,14,FOLLOW_14_in_rule__RecordTypeModifier__Alternatives2593); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRecordTypeModifierAccess().getSUPEREnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1238:6: ( ( 'extends' ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1238:6: ( ( 'extends' ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1239:1: ( 'extends' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecordTypeModifierAccess().getEXTENDSEnumLiteralDeclaration_1()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1240:1: ( 'extends' )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1240:3: 'extends'
                    {
                    match(input,15,FOLLOW_15_in_rule__RecordTypeModifier__Alternatives2614); if (state.failed) return ;

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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1250:1: rule__LogicOperator__Alternatives : ( ( ( '&' ) ) | ( ( '|' ) ) );
    public final void rule__LogicOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1254:1: ( ( ( '&' ) ) | ( ( '|' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( (LA9_0==17) ) {
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
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1255:1: ( ( '&' ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1255:1: ( ( '&' ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1256:1: ( '&' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1257:1: ( '&' )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1257:3: '&'
                    {
                    match(input,16,FOLLOW_16_in_rule__LogicOperator__Alternatives2650); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1262:6: ( ( '|' ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1262:6: ( ( '|' ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1263:1: ( '|' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1264:1: ( '|' )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1264:3: '|'
                    {
                    match(input,17,FOLLOW_17_in_rule__LogicOperator__Alternatives2671); if (state.failed) return ;

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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1274:1: rule__Comparator__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '~' ) ) );
    public final void rule__Comparator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1278:1: ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '~' ) ) )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt10=1;
                }
                break;
            case 19:
                {
                alt10=2;
                }
                break;
            case 20:
                {
                alt10=3;
                }
                break;
            case 21:
                {
                alt10=4;
                }
                break;
            case 22:
                {
                alt10=5;
                }
                break;
            case 23:
                {
                alt10=6;
                }
                break;
            case 24:
                {
                alt10=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1279:1: ( ( '==' ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1279:1: ( ( '==' ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1280:1: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1281:1: ( '==' )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1281:3: '=='
                    {
                    match(input,18,FOLLOW_18_in_rule__Comparator__Alternatives2707); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1286:6: ( ( '!=' ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1286:6: ( ( '!=' ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1287:1: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getNEEnumLiteralDeclaration_1()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1288:1: ( '!=' )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1288:3: '!='
                    {
                    match(input,19,FOLLOW_19_in_rule__Comparator__Alternatives2728); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getNEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1293:6: ( ( '>' ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1293:6: ( ( '>' ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1294:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getGREnumLiteralDeclaration_2()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1295:1: ( '>' )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1295:3: '>'
                    {
                    match(input,20,FOLLOW_20_in_rule__Comparator__Alternatives2749); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getGREnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1300:6: ( ( '<' ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1300:6: ( ( '<' ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1301:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getLWEnumLiteralDeclaration_3()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1302:1: ( '<' )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1302:3: '<'
                    {
                    match(input,21,FOLLOW_21_in_rule__Comparator__Alternatives2770); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getLWEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1307:6: ( ( '>=' ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1307:6: ( ( '>=' ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1308:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getGEEnumLiteralDeclaration_4()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1309:1: ( '>=' )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1309:3: '>='
                    {
                    match(input,22,FOLLOW_22_in_rule__Comparator__Alternatives2791); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getGEEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1314:6: ( ( '<=' ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1314:6: ( ( '<=' ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1315:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getLEEnumLiteralDeclaration_5()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1316:1: ( '<=' )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1316:3: '<='
                    {
                    match(input,23,FOLLOW_23_in_rule__Comparator__Alternatives2812); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getLEEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1321:6: ( ( '~' ) )
                    {
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1321:6: ( ( '~' ) )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1322:1: ( '~' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getLIKEEnumLiteralDeclaration_6()); 
                    }
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1323:1: ( '~' )
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1323:3: '~'
                    {
                    match(input,24,FOLLOW_24_in_rule__Comparator__Alternatives2833); if (state.failed) return ;

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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1335:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1339:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1340:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02866);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02869);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1347:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1351:1: ( ( 'package' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1352:1: ( 'package' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1352:1: ( 'package' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1353:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Model__Group__0__Impl2897); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1366:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1370:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1371:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12928);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12931);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1378:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1382:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1383:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1383:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1384:1: ( rule__Model__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1385:1: ( rule__Model__NameAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1385:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl2958);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1395:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1399:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1400:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22988);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22991);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1407:1: rule__Model__Group__2__Impl : ( ( rule__Model__ImportsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1411:1: ( ( ( rule__Model__ImportsAssignment_2 )* ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1412:1: ( ( rule__Model__ImportsAssignment_2 )* )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1412:1: ( ( rule__Model__ImportsAssignment_2 )* )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1413:1: ( rule__Model__ImportsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_2()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1414:1: ( rule__Model__ImportsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1414:2: rule__Model__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_2_in_rule__Model__Group__2__Impl3018);
            	    rule__Model__ImportsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1424:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1428:1: ( rule__Model__Group__3__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1429:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33049);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1435:1: rule__Model__Group__3__Impl : ( ( rule__Model__OperationsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1439:1: ( ( ( rule__Model__OperationsAssignment_3 )* ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1440:1: ( ( rule__Model__OperationsAssignment_3 )* )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1440:1: ( ( rule__Model__OperationsAssignment_3 )* )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1441:1: ( rule__Model__OperationsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getOperationsAssignment_3()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1442:1: ( rule__Model__OperationsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27||LA12_0==35) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1442:2: rule__Model__OperationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__OperationsAssignment_3_in_rule__Model__Group__3__Impl3076);
            	    rule__Model__OperationsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1460:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1464:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1465:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03115);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03118);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1472:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1476:1: ( ( 'import' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1477:1: ( 'import' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1477:1: ( 'import' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1478:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Import__Group__0__Impl3146); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1491:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1495:1: ( rule__Import__Group__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1496:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13177);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1502:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1506:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1507:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1507:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1508:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1509:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1509:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3204);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1523:1: rule__Selection__Group__0 : rule__Selection__Group__0__Impl rule__Selection__Group__1 ;
    public final void rule__Selection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1527:1: ( rule__Selection__Group__0__Impl rule__Selection__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1528:2: rule__Selection__Group__0__Impl rule__Selection__Group__1
            {
            pushFollow(FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__03238);
            rule__Selection__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__03241);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1535:1: rule__Selection__Group__0__Impl : ( 'select' ) ;
    public final void rule__Selection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1539:1: ( ( 'select' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1540:1: ( 'select' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1540:1: ( 'select' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1541:1: 'select'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getSelectKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Selection__Group__0__Impl3269); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1554:1: rule__Selection__Group__1 : rule__Selection__Group__1__Impl rule__Selection__Group__2 ;
    public final void rule__Selection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1558:1: ( rule__Selection__Group__1__Impl rule__Selection__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1559:2: rule__Selection__Group__1__Impl rule__Selection__Group__2
            {
            pushFollow(FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__13300);
            rule__Selection__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__13303);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1566:1: rule__Selection__Group__1__Impl : ( ( rule__Selection__InputsAssignment_1 ) ) ;
    public final void rule__Selection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1570:1: ( ( ( rule__Selection__InputsAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1571:1: ( ( rule__Selection__InputsAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1571:1: ( ( rule__Selection__InputsAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1572:1: ( rule__Selection__InputsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getInputsAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1573:1: ( rule__Selection__InputsAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1573:2: rule__Selection__InputsAssignment_1
            {
            pushFollow(FOLLOW_rule__Selection__InputsAssignment_1_in_rule__Selection__Group__1__Impl3330);
            rule__Selection__InputsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getInputsAssignment_1()); 
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1583:1: rule__Selection__Group__2 : rule__Selection__Group__2__Impl rule__Selection__Group__3 ;
    public final void rule__Selection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1587:1: ( rule__Selection__Group__2__Impl rule__Selection__Group__3 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1588:2: rule__Selection__Group__2__Impl rule__Selection__Group__3
            {
            pushFollow(FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__23360);
            rule__Selection__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group__3_in_rule__Selection__Group__23363);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1595:1: rule__Selection__Group__2__Impl : ( ( rule__Selection__Group_2__0 )* ) ;
    public final void rule__Selection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1599:1: ( ( ( rule__Selection__Group_2__0 )* ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1600:1: ( ( rule__Selection__Group_2__0 )* )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1600:1: ( ( rule__Selection__Group_2__0 )* )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1601:1: ( rule__Selection__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getGroup_2()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1602:1: ( rule__Selection__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1602:2: rule__Selection__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Selection__Group_2__0_in_rule__Selection__Group__2__Impl3390);
            	    rule__Selection__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getGroup_2()); 
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1612:1: rule__Selection__Group__3 : rule__Selection__Group__3__Impl rule__Selection__Group__4 ;
    public final void rule__Selection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1616:1: ( rule__Selection__Group__3__Impl rule__Selection__Group__4 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1617:2: rule__Selection__Group__3__Impl rule__Selection__Group__4
            {
            pushFollow(FOLLOW_rule__Selection__Group__3__Impl_in_rule__Selection__Group__33421);
            rule__Selection__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group__4_in_rule__Selection__Group__33424);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1624:1: rule__Selection__Group__3__Impl : ( 'from' ) ;
    public final void rule__Selection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1628:1: ( ( 'from' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1629:1: ( 'from' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1629:1: ( 'from' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1630:1: 'from'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getFromKeyword_3()); 
            }
            match(input,28,FOLLOW_28_in_rule__Selection__Group__3__Impl3452); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getFromKeyword_3()); 
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1643:1: rule__Selection__Group__4 : rule__Selection__Group__4__Impl rule__Selection__Group__5 ;
    public final void rule__Selection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1647:1: ( rule__Selection__Group__4__Impl rule__Selection__Group__5 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1648:2: rule__Selection__Group__4__Impl rule__Selection__Group__5
            {
            pushFollow(FOLLOW_rule__Selection__Group__4__Impl_in_rule__Selection__Group__43483);
            rule__Selection__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group__5_in_rule__Selection__Group__43486);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1655:1: rule__Selection__Group__4__Impl : ( ( rule__Selection__FilterAssignment_4 ) ) ;
    public final void rule__Selection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1659:1: ( ( ( rule__Selection__FilterAssignment_4 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1660:1: ( ( rule__Selection__FilterAssignment_4 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1660:1: ( ( rule__Selection__FilterAssignment_4 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1661:1: ( rule__Selection__FilterAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getFilterAssignment_4()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1662:1: ( rule__Selection__FilterAssignment_4 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1662:2: rule__Selection__FilterAssignment_4
            {
            pushFollow(FOLLOW_rule__Selection__FilterAssignment_4_in_rule__Selection__Group__4__Impl3513);
            rule__Selection__FilterAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getFilterAssignment_4()); 
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1672:1: rule__Selection__Group__5 : rule__Selection__Group__5__Impl rule__Selection__Group__6 ;
    public final void rule__Selection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1676:1: ( rule__Selection__Group__5__Impl rule__Selection__Group__6 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1677:2: rule__Selection__Group__5__Impl rule__Selection__Group__6
            {
            pushFollow(FOLLOW_rule__Selection__Group__5__Impl_in_rule__Selection__Group__53543);
            rule__Selection__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group__6_in_rule__Selection__Group__53546);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1684:1: rule__Selection__Group__5__Impl : ( 'store' ) ;
    public final void rule__Selection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1688:1: ( ( 'store' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1689:1: ( 'store' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1689:1: ( 'store' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1690:1: 'store'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getStoreKeyword_5()); 
            }
            match(input,29,FOLLOW_29_in_rule__Selection__Group__5__Impl3574); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getStoreKeyword_5()); 
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1703:1: rule__Selection__Group__6 : rule__Selection__Group__6__Impl rule__Selection__Group__7 ;
    public final void rule__Selection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1707:1: ( rule__Selection__Group__6__Impl rule__Selection__Group__7 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1708:2: rule__Selection__Group__6__Impl rule__Selection__Group__7
            {
            pushFollow(FOLLOW_rule__Selection__Group__6__Impl_in_rule__Selection__Group__63605);
            rule__Selection__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group__7_in_rule__Selection__Group__63608);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1715:1: rule__Selection__Group__6__Impl : ( ( rule__Selection__RecordTypeAssignment_6 ) ) ;
    public final void rule__Selection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1719:1: ( ( ( rule__Selection__RecordTypeAssignment_6 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1720:1: ( ( rule__Selection__RecordTypeAssignment_6 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1720:1: ( ( rule__Selection__RecordTypeAssignment_6 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1721:1: ( rule__Selection__RecordTypeAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getRecordTypeAssignment_6()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1722:1: ( rule__Selection__RecordTypeAssignment_6 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1722:2: rule__Selection__RecordTypeAssignment_6
            {
            pushFollow(FOLLOW_rule__Selection__RecordTypeAssignment_6_in_rule__Selection__Group__6__Impl3635);
            rule__Selection__RecordTypeAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getRecordTypeAssignment_6()); 
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1732:1: rule__Selection__Group__7 : rule__Selection__Group__7__Impl rule__Selection__Group__8 ;
    public final void rule__Selection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1736:1: ( rule__Selection__Group__7__Impl rule__Selection__Group__8 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1737:2: rule__Selection__Group__7__Impl rule__Selection__Group__8
            {
            pushFollow(FOLLOW_rule__Selection__Group__7__Impl_in_rule__Selection__Group__73665);
            rule__Selection__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group__8_in_rule__Selection__Group__73668);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1744:1: rule__Selection__Group__7__Impl : ( '(' ) ;
    public final void rule__Selection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1748:1: ( ( '(' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1749:1: ( '(' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1749:1: ( '(' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1750:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getLeftParenthesisKeyword_7()); 
            }
            match(input,30,FOLLOW_30_in_rule__Selection__Group__7__Impl3696); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getLeftParenthesisKeyword_7()); 
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1763:1: rule__Selection__Group__8 : rule__Selection__Group__8__Impl rule__Selection__Group__9 ;
    public final void rule__Selection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1767:1: ( rule__Selection__Group__8__Impl rule__Selection__Group__9 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1768:2: rule__Selection__Group__8__Impl rule__Selection__Group__9
            {
            pushFollow(FOLLOW_rule__Selection__Group__8__Impl_in_rule__Selection__Group__83727);
            rule__Selection__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group__9_in_rule__Selection__Group__83730);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1775:1: rule__Selection__Group__8__Impl : ( ( rule__Selection__ParemterExpressionsAssignment_8 ) ) ;
    public final void rule__Selection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1779:1: ( ( ( rule__Selection__ParemterExpressionsAssignment_8 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1780:1: ( ( rule__Selection__ParemterExpressionsAssignment_8 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1780:1: ( ( rule__Selection__ParemterExpressionsAssignment_8 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1781:1: ( rule__Selection__ParemterExpressionsAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getParemterExpressionsAssignment_8()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1782:1: ( rule__Selection__ParemterExpressionsAssignment_8 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1782:2: rule__Selection__ParemterExpressionsAssignment_8
            {
            pushFollow(FOLLOW_rule__Selection__ParemterExpressionsAssignment_8_in_rule__Selection__Group__8__Impl3757);
            rule__Selection__ParemterExpressionsAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getParemterExpressionsAssignment_8()); 
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1792:1: rule__Selection__Group__9 : rule__Selection__Group__9__Impl rule__Selection__Group__10 ;
    public final void rule__Selection__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1796:1: ( rule__Selection__Group__9__Impl rule__Selection__Group__10 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1797:2: rule__Selection__Group__9__Impl rule__Selection__Group__10
            {
            pushFollow(FOLLOW_rule__Selection__Group__9__Impl_in_rule__Selection__Group__93787);
            rule__Selection__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group__10_in_rule__Selection__Group__93790);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1804:1: rule__Selection__Group__9__Impl : ( ( rule__Selection__Group_9__0 )* ) ;
    public final void rule__Selection__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1808:1: ( ( ( rule__Selection__Group_9__0 )* ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1809:1: ( ( rule__Selection__Group_9__0 )* )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1809:1: ( ( rule__Selection__Group_9__0 )* )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1810:1: ( rule__Selection__Group_9__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getGroup_9()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1811:1: ( rule__Selection__Group_9__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1811:2: rule__Selection__Group_9__0
            	    {
            	    pushFollow(FOLLOW_rule__Selection__Group_9__0_in_rule__Selection__Group__9__Impl3817);
            	    rule__Selection__Group_9__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getGroup_9()); 
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1821:1: rule__Selection__Group__10 : rule__Selection__Group__10__Impl ;
    public final void rule__Selection__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1825:1: ( rule__Selection__Group__10__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1826:2: rule__Selection__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Selection__Group__10__Impl_in_rule__Selection__Group__103848);
            rule__Selection__Group__10__Impl();

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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1832:1: rule__Selection__Group__10__Impl : ( ')' ) ;
    public final void rule__Selection__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1836:1: ( ( ')' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1837:1: ( ')' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1837:1: ( ')' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1838:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getRightParenthesisKeyword_10()); 
            }
            match(input,31,FOLLOW_31_in_rule__Selection__Group__10__Impl3876); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getRightParenthesisKeyword_10()); 
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


    // $ANTLR start "rule__Selection__Group_2__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1873:1: rule__Selection__Group_2__0 : rule__Selection__Group_2__0__Impl rule__Selection__Group_2__1 ;
    public final void rule__Selection__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1877:1: ( rule__Selection__Group_2__0__Impl rule__Selection__Group_2__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1878:2: rule__Selection__Group_2__0__Impl rule__Selection__Group_2__1
            {
            pushFollow(FOLLOW_rule__Selection__Group_2__0__Impl_in_rule__Selection__Group_2__03929);
            rule__Selection__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group_2__1_in_rule__Selection__Group_2__03932);
            rule__Selection__Group_2__1();

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
    // $ANTLR end "rule__Selection__Group_2__0"


    // $ANTLR start "rule__Selection__Group_2__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1885:1: rule__Selection__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Selection__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1889:1: ( ( ',' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1890:1: ( ',' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1890:1: ( ',' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1891:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getCommaKeyword_2_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Selection__Group_2__0__Impl3960); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getCommaKeyword_2_0()); 
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
    // $ANTLR end "rule__Selection__Group_2__0__Impl"


    // $ANTLR start "rule__Selection__Group_2__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1904:1: rule__Selection__Group_2__1 : rule__Selection__Group_2__1__Impl ;
    public final void rule__Selection__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1908:1: ( rule__Selection__Group_2__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1909:2: rule__Selection__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Selection__Group_2__1__Impl_in_rule__Selection__Group_2__13991);
            rule__Selection__Group_2__1__Impl();

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
    // $ANTLR end "rule__Selection__Group_2__1"


    // $ANTLR start "rule__Selection__Group_2__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1915:1: rule__Selection__Group_2__1__Impl : ( ( rule__Selection__InputsAssignment_2_1 ) ) ;
    public final void rule__Selection__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1919:1: ( ( ( rule__Selection__InputsAssignment_2_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1920:1: ( ( rule__Selection__InputsAssignment_2_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1920:1: ( ( rule__Selection__InputsAssignment_2_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1921:1: ( rule__Selection__InputsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getInputsAssignment_2_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1922:1: ( rule__Selection__InputsAssignment_2_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1922:2: rule__Selection__InputsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Selection__InputsAssignment_2_1_in_rule__Selection__Group_2__1__Impl4018);
            rule__Selection__InputsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getInputsAssignment_2_1()); 
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
    // $ANTLR end "rule__Selection__Group_2__1__Impl"


    // $ANTLR start "rule__Selection__Group_9__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1936:1: rule__Selection__Group_9__0 : rule__Selection__Group_9__0__Impl rule__Selection__Group_9__1 ;
    public final void rule__Selection__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1940:1: ( rule__Selection__Group_9__0__Impl rule__Selection__Group_9__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1941:2: rule__Selection__Group_9__0__Impl rule__Selection__Group_9__1
            {
            pushFollow(FOLLOW_rule__Selection__Group_9__0__Impl_in_rule__Selection__Group_9__04052);
            rule__Selection__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Selection__Group_9__1_in_rule__Selection__Group_9__04055);
            rule__Selection__Group_9__1();

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
    // $ANTLR end "rule__Selection__Group_9__0"


    // $ANTLR start "rule__Selection__Group_9__0__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1948:1: rule__Selection__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Selection__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1952:1: ( ( ',' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1953:1: ( ',' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1953:1: ( ',' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1954:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getCommaKeyword_9_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Selection__Group_9__0__Impl4083); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getCommaKeyword_9_0()); 
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
    // $ANTLR end "rule__Selection__Group_9__0__Impl"


    // $ANTLR start "rule__Selection__Group_9__1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1967:1: rule__Selection__Group_9__1 : rule__Selection__Group_9__1__Impl ;
    public final void rule__Selection__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1971:1: ( rule__Selection__Group_9__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1972:2: rule__Selection__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Selection__Group_9__1__Impl_in_rule__Selection__Group_9__14114);
            rule__Selection__Group_9__1__Impl();

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
    // $ANTLR end "rule__Selection__Group_9__1"


    // $ANTLR start "rule__Selection__Group_9__1__Impl"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1978:1: rule__Selection__Group_9__1__Impl : ( ( rule__Selection__ParemterExpressionsAssignment_9_1 ) ) ;
    public final void rule__Selection__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1982:1: ( ( ( rule__Selection__ParemterExpressionsAssignment_9_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1983:1: ( ( rule__Selection__ParemterExpressionsAssignment_9_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1983:1: ( ( rule__Selection__ParemterExpressionsAssignment_9_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1984:1: ( rule__Selection__ParemterExpressionsAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getParemterExpressionsAssignment_9_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1985:1: ( rule__Selection__ParemterExpressionsAssignment_9_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1985:2: rule__Selection__ParemterExpressionsAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Selection__ParemterExpressionsAssignment_9_1_in_rule__Selection__Group_9__1__Impl4141);
            rule__Selection__ParemterExpressionsAssignment_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getParemterExpressionsAssignment_9_1()); 
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
    // $ANTLR end "rule__Selection__Group_9__1__Impl"


    // $ANTLR start "rule__SelectInput__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:1999:1: rule__SelectInput__Group__0 : rule__SelectInput__Group__0__Impl rule__SelectInput__Group__1 ;
    public final void rule__SelectInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2003:1: ( rule__SelectInput__Group__0__Impl rule__SelectInput__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2004:2: rule__SelectInput__Group__0__Impl rule__SelectInput__Group__1
            {
            pushFollow(FOLLOW_rule__SelectInput__Group__0__Impl_in_rule__SelectInput__Group__04175);
            rule__SelectInput__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SelectInput__Group__1_in_rule__SelectInput__Group__04178);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2011:1: rule__SelectInput__Group__0__Impl : ( ( rule__SelectInput__RecordTypeAssignment_0 ) ) ;
    public final void rule__SelectInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2015:1: ( ( ( rule__SelectInput__RecordTypeAssignment_0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2016:1: ( ( rule__SelectInput__RecordTypeAssignment_0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2016:1: ( ( rule__SelectInput__RecordTypeAssignment_0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2017:1: ( rule__SelectInput__RecordTypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectInputAccess().getRecordTypeAssignment_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2018:1: ( rule__SelectInput__RecordTypeAssignment_0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2018:2: rule__SelectInput__RecordTypeAssignment_0
            {
            pushFollow(FOLLOW_rule__SelectInput__RecordTypeAssignment_0_in_rule__SelectInput__Group__0__Impl4205);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2028:1: rule__SelectInput__Group__1 : rule__SelectInput__Group__1__Impl rule__SelectInput__Group__2 ;
    public final void rule__SelectInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2032:1: ( rule__SelectInput__Group__1__Impl rule__SelectInput__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2033:2: rule__SelectInput__Group__1__Impl rule__SelectInput__Group__2
            {
            pushFollow(FOLLOW_rule__SelectInput__Group__1__Impl_in_rule__SelectInput__Group__14235);
            rule__SelectInput__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SelectInput__Group__2_in_rule__SelectInput__Group__14238);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2040:1: rule__SelectInput__Group__1__Impl : ( ( rule__SelectInput__NameAssignment_1 ) ) ;
    public final void rule__SelectInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2044:1: ( ( ( rule__SelectInput__NameAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2045:1: ( ( rule__SelectInput__NameAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2045:1: ( ( rule__SelectInput__NameAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2046:1: ( rule__SelectInput__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectInputAccess().getNameAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2047:1: ( rule__SelectInput__NameAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2047:2: rule__SelectInput__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SelectInput__NameAssignment_1_in_rule__SelectInput__Group__1__Impl4265);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2057:1: rule__SelectInput__Group__2 : rule__SelectInput__Group__2__Impl ;
    public final void rule__SelectInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2061:1: ( rule__SelectInput__Group__2__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2062:2: rule__SelectInput__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SelectInput__Group__2__Impl_in_rule__SelectInput__Group__24295);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2068:1: rule__SelectInput__Group__2__Impl : ( ( rule__SelectInput__Group_2__0 )? ) ;
    public final void rule__SelectInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2072:1: ( ( ( rule__SelectInput__Group_2__0 )? ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2073:1: ( ( rule__SelectInput__Group_2__0 )? )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2073:1: ( ( rule__SelectInput__Group_2__0 )? )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2074:1: ( rule__SelectInput__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectInputAccess().getGroup_2()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2075:1: ( rule__SelectInput__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2075:2: rule__SelectInput__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SelectInput__Group_2__0_in_rule__SelectInput__Group__2__Impl4322);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2091:1: rule__SelectInput__Group_2__0 : rule__SelectInput__Group_2__0__Impl rule__SelectInput__Group_2__1 ;
    public final void rule__SelectInput__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2095:1: ( rule__SelectInput__Group_2__0__Impl rule__SelectInput__Group_2__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2096:2: rule__SelectInput__Group_2__0__Impl rule__SelectInput__Group_2__1
            {
            pushFollow(FOLLOW_rule__SelectInput__Group_2__0__Impl_in_rule__SelectInput__Group_2__04359);
            rule__SelectInput__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SelectInput__Group_2__1_in_rule__SelectInput__Group_2__04362);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2103:1: rule__SelectInput__Group_2__0__Impl : ( ':' ) ;
    public final void rule__SelectInput__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2107:1: ( ( ':' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2108:1: ( ':' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2108:1: ( ':' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2109:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectInputAccess().getColonKeyword_2_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__SelectInput__Group_2__0__Impl4390); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2122:1: rule__SelectInput__Group_2__1 : rule__SelectInput__Group_2__1__Impl ;
    public final void rule__SelectInput__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2126:1: ( rule__SelectInput__Group_2__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2127:2: rule__SelectInput__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SelectInput__Group_2__1__Impl_in_rule__SelectInput__Group_2__14421);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2133:1: rule__SelectInput__Group_2__1__Impl : ( ( rule__SelectInput__SelectConstraintAssignment_2_1 ) ) ;
    public final void rule__SelectInput__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2137:1: ( ( ( rule__SelectInput__SelectConstraintAssignment_2_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2138:1: ( ( rule__SelectInput__SelectConstraintAssignment_2_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2138:1: ( ( rule__SelectInput__SelectConstraintAssignment_2_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2139:1: ( rule__SelectInput__SelectConstraintAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectInputAccess().getSelectConstraintAssignment_2_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2140:1: ( rule__SelectInput__SelectConstraintAssignment_2_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2140:2: rule__SelectInput__SelectConstraintAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SelectInput__SelectConstraintAssignment_2_1_in_rule__SelectInput__Group_2__1__Impl4448);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2154:1: rule__SelectConstaintExpression__Group__0 : rule__SelectConstaintExpression__Group__0__Impl rule__SelectConstaintExpression__Group__1 ;
    public final void rule__SelectConstaintExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2158:1: ( rule__SelectConstaintExpression__Group__0__Impl rule__SelectConstaintExpression__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2159:2: rule__SelectConstaintExpression__Group__0__Impl rule__SelectConstaintExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group__0__Impl_in_rule__SelectConstaintExpression__Group__04482);
            rule__SelectConstaintExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group__1_in_rule__SelectConstaintExpression__Group__04485);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2166:1: rule__SelectConstaintExpression__Group__0__Impl : ( ruleBasicSelectConstraint ) ;
    public final void rule__SelectConstaintExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2170:1: ( ( ruleBasicSelectConstraint ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2171:1: ( ruleBasicSelectConstraint )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2171:1: ( ruleBasicSelectConstraint )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2172:1: ruleBasicSelectConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstaintExpressionAccess().getBasicSelectConstraintParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBasicSelectConstraint_in_rule__SelectConstaintExpression__Group__0__Impl4512);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2183:1: rule__SelectConstaintExpression__Group__1 : rule__SelectConstaintExpression__Group__1__Impl ;
    public final void rule__SelectConstaintExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2187:1: ( rule__SelectConstaintExpression__Group__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2188:2: rule__SelectConstaintExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group__1__Impl_in_rule__SelectConstaintExpression__Group__14541);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2194:1: rule__SelectConstaintExpression__Group__1__Impl : ( ( rule__SelectConstaintExpression__Group_1__0 )? ) ;
    public final void rule__SelectConstaintExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2198:1: ( ( ( rule__SelectConstaintExpression__Group_1__0 )? ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2199:1: ( ( rule__SelectConstaintExpression__Group_1__0 )? )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2199:1: ( ( rule__SelectConstaintExpression__Group_1__0 )? )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2200:1: ( rule__SelectConstaintExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstaintExpressionAccess().getGroup_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2201:1: ( rule__SelectConstaintExpression__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=16 && LA16_0<=17)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2201:2: rule__SelectConstaintExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SelectConstaintExpression__Group_1__0_in_rule__SelectConstaintExpression__Group__1__Impl4568);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2215:1: rule__SelectConstaintExpression__Group_1__0 : rule__SelectConstaintExpression__Group_1__0__Impl rule__SelectConstaintExpression__Group_1__1 ;
    public final void rule__SelectConstaintExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2219:1: ( rule__SelectConstaintExpression__Group_1__0__Impl rule__SelectConstaintExpression__Group_1__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2220:2: rule__SelectConstaintExpression__Group_1__0__Impl rule__SelectConstaintExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group_1__0__Impl_in_rule__SelectConstaintExpression__Group_1__04603);
            rule__SelectConstaintExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group_1__1_in_rule__SelectConstaintExpression__Group_1__04606);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2227:1: rule__SelectConstaintExpression__Group_1__0__Impl : ( ( rule__SelectConstaintExpression__Group_1_0__0 ) ) ;
    public final void rule__SelectConstaintExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2231:1: ( ( ( rule__SelectConstaintExpression__Group_1_0__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2232:1: ( ( rule__SelectConstaintExpression__Group_1_0__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2232:1: ( ( rule__SelectConstaintExpression__Group_1_0__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2233:1: ( rule__SelectConstaintExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstaintExpressionAccess().getGroup_1_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2234:1: ( rule__SelectConstaintExpression__Group_1_0__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2234:2: rule__SelectConstaintExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group_1_0__0_in_rule__SelectConstaintExpression__Group_1__0__Impl4633);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2244:1: rule__SelectConstaintExpression__Group_1__1 : rule__SelectConstaintExpression__Group_1__1__Impl ;
    public final void rule__SelectConstaintExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2248:1: ( rule__SelectConstaintExpression__Group_1__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2249:2: rule__SelectConstaintExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group_1__1__Impl_in_rule__SelectConstaintExpression__Group_1__14663);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2255:1: rule__SelectConstaintExpression__Group_1__1__Impl : ( ( rule__SelectConstaintExpression__RightAssignment_1_1 ) ) ;
    public final void rule__SelectConstaintExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2259:1: ( ( ( rule__SelectConstaintExpression__RightAssignment_1_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2260:1: ( ( rule__SelectConstaintExpression__RightAssignment_1_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2260:1: ( ( rule__SelectConstaintExpression__RightAssignment_1_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2261:1: ( rule__SelectConstaintExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstaintExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2262:1: ( rule__SelectConstaintExpression__RightAssignment_1_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2262:2: rule__SelectConstaintExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SelectConstaintExpression__RightAssignment_1_1_in_rule__SelectConstaintExpression__Group_1__1__Impl4690);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2276:1: rule__SelectConstaintExpression__Group_1_0__0 : rule__SelectConstaintExpression__Group_1_0__0__Impl ;
    public final void rule__SelectConstaintExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2280:1: ( rule__SelectConstaintExpression__Group_1_0__0__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2281:2: rule__SelectConstaintExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group_1_0__0__Impl_in_rule__SelectConstaintExpression__Group_1_0__04724);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2287:1: rule__SelectConstaintExpression__Group_1_0__0__Impl : ( ( rule__SelectConstaintExpression__Group_1_0_0__0 ) ) ;
    public final void rule__SelectConstaintExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2291:1: ( ( ( rule__SelectConstaintExpression__Group_1_0_0__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2292:1: ( ( rule__SelectConstaintExpression__Group_1_0_0__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2292:1: ( ( rule__SelectConstaintExpression__Group_1_0_0__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2293:1: ( rule__SelectConstaintExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstaintExpressionAccess().getGroup_1_0_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2294:1: ( rule__SelectConstaintExpression__Group_1_0_0__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2294:2: rule__SelectConstaintExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group_1_0_0__0_in_rule__SelectConstaintExpression__Group_1_0__0__Impl4751);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2306:1: rule__SelectConstaintExpression__Group_1_0_0__0 : rule__SelectConstaintExpression__Group_1_0_0__0__Impl rule__SelectConstaintExpression__Group_1_0_0__1 ;
    public final void rule__SelectConstaintExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2310:1: ( rule__SelectConstaintExpression__Group_1_0_0__0__Impl rule__SelectConstaintExpression__Group_1_0_0__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2311:2: rule__SelectConstaintExpression__Group_1_0_0__0__Impl rule__SelectConstaintExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group_1_0_0__0__Impl_in_rule__SelectConstaintExpression__Group_1_0_0__04783);
            rule__SelectConstaintExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group_1_0_0__1_in_rule__SelectConstaintExpression__Group_1_0_0__04786);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2318:1: rule__SelectConstaintExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__SelectConstaintExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2322:1: ( ( () ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2323:1: ( () )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2323:1: ( () )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2324:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstaintExpressionAccess().getSelectConstaintExpressionLeftAction_1_0_0_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2325:1: ()
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2327:1: 
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2337:1: rule__SelectConstaintExpression__Group_1_0_0__1 : rule__SelectConstaintExpression__Group_1_0_0__1__Impl ;
    public final void rule__SelectConstaintExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2341:1: ( rule__SelectConstaintExpression__Group_1_0_0__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2342:2: rule__SelectConstaintExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__SelectConstaintExpression__Group_1_0_0__1__Impl_in_rule__SelectConstaintExpression__Group_1_0_0__14844);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2348:1: rule__SelectConstaintExpression__Group_1_0_0__1__Impl : ( ( rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__SelectConstaintExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2352:1: ( ( ( rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2353:1: ( ( rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2353:1: ( ( rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2354:1: ( rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstaintExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2355:1: ( rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2355:2: rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1_in_rule__SelectConstaintExpression__Group_1_0_0__1__Impl4871);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2369:1: rule__ParenthesisSelectConstraint__Group__0 : rule__ParenthesisSelectConstraint__Group__0__Impl rule__ParenthesisSelectConstraint__Group__1 ;
    public final void rule__ParenthesisSelectConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2373:1: ( rule__ParenthesisSelectConstraint__Group__0__Impl rule__ParenthesisSelectConstraint__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2374:2: rule__ParenthesisSelectConstraint__Group__0__Impl rule__ParenthesisSelectConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__ParenthesisSelectConstraint__Group__0__Impl_in_rule__ParenthesisSelectConstraint__Group__04905);
            rule__ParenthesisSelectConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisSelectConstraint__Group__1_in_rule__ParenthesisSelectConstraint__Group__04908);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2381:1: rule__ParenthesisSelectConstraint__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesisSelectConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2385:1: ( ( '(' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2386:1: ( '(' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2386:1: ( '(' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2387:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisSelectConstraintAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__ParenthesisSelectConstraint__Group__0__Impl4936); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2400:1: rule__ParenthesisSelectConstraint__Group__1 : rule__ParenthesisSelectConstraint__Group__1__Impl rule__ParenthesisSelectConstraint__Group__2 ;
    public final void rule__ParenthesisSelectConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2404:1: ( rule__ParenthesisSelectConstraint__Group__1__Impl rule__ParenthesisSelectConstraint__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2405:2: rule__ParenthesisSelectConstraint__Group__1__Impl rule__ParenthesisSelectConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__ParenthesisSelectConstraint__Group__1__Impl_in_rule__ParenthesisSelectConstraint__Group__14967);
            rule__ParenthesisSelectConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisSelectConstraint__Group__2_in_rule__ParenthesisSelectConstraint__Group__14970);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2412:1: rule__ParenthesisSelectConstraint__Group__1__Impl : ( ( rule__ParenthesisSelectConstraint__ConstraintAssignment_1 ) ) ;
    public final void rule__ParenthesisSelectConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2416:1: ( ( ( rule__ParenthesisSelectConstraint__ConstraintAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2417:1: ( ( rule__ParenthesisSelectConstraint__ConstraintAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2417:1: ( ( rule__ParenthesisSelectConstraint__ConstraintAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2418:1: ( rule__ParenthesisSelectConstraint__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisSelectConstraintAccess().getConstraintAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2419:1: ( rule__ParenthesisSelectConstraint__ConstraintAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2419:2: rule__ParenthesisSelectConstraint__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__ParenthesisSelectConstraint__ConstraintAssignment_1_in_rule__ParenthesisSelectConstraint__Group__1__Impl4997);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2429:1: rule__ParenthesisSelectConstraint__Group__2 : rule__ParenthesisSelectConstraint__Group__2__Impl ;
    public final void rule__ParenthesisSelectConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2433:1: ( rule__ParenthesisSelectConstraint__Group__2__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2434:2: rule__ParenthesisSelectConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParenthesisSelectConstraint__Group__2__Impl_in_rule__ParenthesisSelectConstraint__Group__25027);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2440:1: rule__ParenthesisSelectConstraint__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesisSelectConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2444:1: ( ( ')' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2445:1: ( ')' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2445:1: ( ')' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2446:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisSelectConstraintAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__ParenthesisSelectConstraint__Group__2__Impl5055); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2465:1: rule__SelectConstraint__Group__0 : rule__SelectConstraint__Group__0__Impl rule__SelectConstraint__Group__1 ;
    public final void rule__SelectConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2469:1: ( rule__SelectConstraint__Group__0__Impl rule__SelectConstraint__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2470:2: rule__SelectConstraint__Group__0__Impl rule__SelectConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__SelectConstraint__Group__0__Impl_in_rule__SelectConstraint__Group__05092);
            rule__SelectConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SelectConstraint__Group__1_in_rule__SelectConstraint__Group__05095);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2477:1: rule__SelectConstraint__Group__0__Impl : ( ( rule__SelectConstraint__LeftAssignment_0 ) ) ;
    public final void rule__SelectConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2481:1: ( ( ( rule__SelectConstraint__LeftAssignment_0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2482:1: ( ( rule__SelectConstraint__LeftAssignment_0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2482:1: ( ( rule__SelectConstraint__LeftAssignment_0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2483:1: ( rule__SelectConstraint__LeftAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstraintAccess().getLeftAssignment_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2484:1: ( rule__SelectConstraint__LeftAssignment_0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2484:2: rule__SelectConstraint__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__SelectConstraint__LeftAssignment_0_in_rule__SelectConstraint__Group__0__Impl5122);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2494:1: rule__SelectConstraint__Group__1 : rule__SelectConstraint__Group__1__Impl rule__SelectConstraint__Group__2 ;
    public final void rule__SelectConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2498:1: ( rule__SelectConstraint__Group__1__Impl rule__SelectConstraint__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2499:2: rule__SelectConstraint__Group__1__Impl rule__SelectConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__SelectConstraint__Group__1__Impl_in_rule__SelectConstraint__Group__15152);
            rule__SelectConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SelectConstraint__Group__2_in_rule__SelectConstraint__Group__15155);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2506:1: rule__SelectConstraint__Group__1__Impl : ( ( rule__SelectConstraint__ComperatorAssignment_1 ) ) ;
    public final void rule__SelectConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2510:1: ( ( ( rule__SelectConstraint__ComperatorAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2511:1: ( ( rule__SelectConstraint__ComperatorAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2511:1: ( ( rule__SelectConstraint__ComperatorAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2512:1: ( rule__SelectConstraint__ComperatorAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstraintAccess().getComperatorAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2513:1: ( rule__SelectConstraint__ComperatorAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2513:2: rule__SelectConstraint__ComperatorAssignment_1
            {
            pushFollow(FOLLOW_rule__SelectConstraint__ComperatorAssignment_1_in_rule__SelectConstraint__Group__1__Impl5182);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2523:1: rule__SelectConstraint__Group__2 : rule__SelectConstraint__Group__2__Impl ;
    public final void rule__SelectConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2527:1: ( rule__SelectConstraint__Group__2__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2528:2: rule__SelectConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SelectConstraint__Group__2__Impl_in_rule__SelectConstraint__Group__25212);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2534:1: rule__SelectConstraint__Group__2__Impl : ( ( rule__SelectConstraint__RightAssignment_2 ) ) ;
    public final void rule__SelectConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2538:1: ( ( ( rule__SelectConstraint__RightAssignment_2 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2539:1: ( ( rule__SelectConstraint__RightAssignment_2 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2539:1: ( ( rule__SelectConstraint__RightAssignment_2 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2540:1: ( rule__SelectConstraint__RightAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstraintAccess().getRightAssignment_2()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2541:1: ( rule__SelectConstraint__RightAssignment_2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2541:2: rule__SelectConstraint__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__SelectConstraint__RightAssignment_2_in_rule__SelectConstraint__Group__2__Impl5239);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2557:1: rule__ParameterExpression__Group__0 : rule__ParameterExpression__Group__0__Impl rule__ParameterExpression__Group__1 ;
    public final void rule__ParameterExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2561:1: ( rule__ParameterExpression__Group__0__Impl rule__ParameterExpression__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2562:2: rule__ParameterExpression__Group__0__Impl rule__ParameterExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterExpression__Group__0__Impl_in_rule__ParameterExpression__Group__05275);
            rule__ParameterExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterExpression__Group__1_in_rule__ParameterExpression__Group__05278);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2569:1: rule__ParameterExpression__Group__0__Impl : ( ( rule__ParameterExpression__Group_0__0 )? ) ;
    public final void rule__ParameterExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2573:1: ( ( ( rule__ParameterExpression__Group_0__0 )? ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2574:1: ( ( rule__ParameterExpression__Group_0__0 )? )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2574:1: ( ( rule__ParameterExpression__Group_0__0 )? )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2575:1: ( rule__ParameterExpression__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterExpressionAccess().getGroup_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2576:1: ( rule__ParameterExpression__Group_0__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==34) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2576:2: rule__ParameterExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ParameterExpression__Group_0__0_in_rule__ParameterExpression__Group__0__Impl5305);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2586:1: rule__ParameterExpression__Group__1 : rule__ParameterExpression__Group__1__Impl ;
    public final void rule__ParameterExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2590:1: ( rule__ParameterExpression__Group__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2591:2: rule__ParameterExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterExpression__Group__1__Impl_in_rule__ParameterExpression__Group__15336);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2597:1: rule__ParameterExpression__Group__1__Impl : ( ( rule__ParameterExpression__PropertyReferenceAssignment_1 ) ) ;
    public final void rule__ParameterExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2601:1: ( ( ( rule__ParameterExpression__PropertyReferenceAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2602:1: ( ( rule__ParameterExpression__PropertyReferenceAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2602:1: ( ( rule__ParameterExpression__PropertyReferenceAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2603:1: ( rule__ParameterExpression__PropertyReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterExpressionAccess().getPropertyReferenceAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2604:1: ( rule__ParameterExpression__PropertyReferenceAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2604:2: rule__ParameterExpression__PropertyReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__ParameterExpression__PropertyReferenceAssignment_1_in_rule__ParameterExpression__Group__1__Impl5363);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2618:1: rule__ParameterExpression__Group_0__0 : rule__ParameterExpression__Group_0__0__Impl rule__ParameterExpression__Group_0__1 ;
    public final void rule__ParameterExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2622:1: ( rule__ParameterExpression__Group_0__0__Impl rule__ParameterExpression__Group_0__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2623:2: rule__ParameterExpression__Group_0__0__Impl rule__ParameterExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__ParameterExpression__Group_0__0__Impl_in_rule__ParameterExpression__Group_0__05397);
            rule__ParameterExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterExpression__Group_0__1_in_rule__ParameterExpression__Group_0__05400);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2630:1: rule__ParameterExpression__Group_0__0__Impl : ( ( rule__ParameterExpression__InputAssignment_0_0 ) ) ;
    public final void rule__ParameterExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2634:1: ( ( ( rule__ParameterExpression__InputAssignment_0_0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2635:1: ( ( rule__ParameterExpression__InputAssignment_0_0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2635:1: ( ( rule__ParameterExpression__InputAssignment_0_0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2636:1: ( rule__ParameterExpression__InputAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterExpressionAccess().getInputAssignment_0_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2637:1: ( rule__ParameterExpression__InputAssignment_0_0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2637:2: rule__ParameterExpression__InputAssignment_0_0
            {
            pushFollow(FOLLOW_rule__ParameterExpression__InputAssignment_0_0_in_rule__ParameterExpression__Group_0__0__Impl5427);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2647:1: rule__ParameterExpression__Group_0__1 : rule__ParameterExpression__Group_0__1__Impl ;
    public final void rule__ParameterExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2651:1: ( rule__ParameterExpression__Group_0__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2652:2: rule__ParameterExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterExpression__Group_0__1__Impl_in_rule__ParameterExpression__Group_0__15457);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2658:1: rule__ParameterExpression__Group_0__1__Impl : ( '.' ) ;
    public final void rule__ParameterExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2662:1: ( ( '.' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2663:1: ( '.' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2663:1: ( '.' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2664:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterExpressionAccess().getFullStopKeyword_0_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__ParameterExpression__Group_0__1__Impl5485); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2681:1: rule__Filter__Group__0 : rule__Filter__Group__0__Impl rule__Filter__Group__1 ;
    public final void rule__Filter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2685:1: ( rule__Filter__Group__0__Impl rule__Filter__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2686:2: rule__Filter__Group__0__Impl rule__Filter__Group__1
            {
            pushFollow(FOLLOW_rule__Filter__Group__0__Impl_in_rule__Filter__Group__05520);
            rule__Filter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Filter__Group__1_in_rule__Filter__Group__05523);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2693:1: rule__Filter__Group__0__Impl : ( 'filter' ) ;
    public final void rule__Filter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2697:1: ( ( 'filter' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2698:1: ( 'filter' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2698:1: ( 'filter' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2699:1: 'filter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFilterAccess().getFilterKeyword_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__Filter__Group__0__Impl5551); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2712:1: rule__Filter__Group__1 : rule__Filter__Group__1__Impl rule__Filter__Group__2 ;
    public final void rule__Filter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2716:1: ( rule__Filter__Group__1__Impl rule__Filter__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2717:2: rule__Filter__Group__1__Impl rule__Filter__Group__2
            {
            pushFollow(FOLLOW_rule__Filter__Group__1__Impl_in_rule__Filter__Group__15582);
            rule__Filter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Filter__Group__2_in_rule__Filter__Group__15585);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2724:1: rule__Filter__Group__1__Impl : ( ( rule__Filter__NameAssignment_1 ) ) ;
    public final void rule__Filter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2728:1: ( ( ( rule__Filter__NameAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2729:1: ( ( rule__Filter__NameAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2729:1: ( ( rule__Filter__NameAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2730:1: ( rule__Filter__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFilterAccess().getNameAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2731:1: ( rule__Filter__NameAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2731:2: rule__Filter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Filter__NameAssignment_1_in_rule__Filter__Group__1__Impl5612);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2741:1: rule__Filter__Group__2 : rule__Filter__Group__2__Impl ;
    public final void rule__Filter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2745:1: ( rule__Filter__Group__2__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2746:2: rule__Filter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Filter__Group__2__Impl_in_rule__Filter__Group__25642);
            rule__Filter__Group__2__Impl();

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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2752:1: rule__Filter__Group__2__Impl : ( ( rule__Filter__ConstraintAssignment_2 ) ) ;
    public final void rule__Filter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2756:1: ( ( ( rule__Filter__ConstraintAssignment_2 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2757:1: ( ( rule__Filter__ConstraintAssignment_2 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2757:1: ( ( rule__Filter__ConstraintAssignment_2 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2758:1: ( rule__Filter__ConstraintAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFilterAccess().getConstraintAssignment_2()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2759:1: ( rule__Filter__ConstraintAssignment_2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2759:2: rule__Filter__ConstraintAssignment_2
            {
            pushFollow(FOLLOW_rule__Filter__ConstraintAssignment_2_in_rule__Filter__Group__2__Impl5669);
            rule__Filter__ConstraintAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFilterAccess().getConstraintAssignment_2()); 
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


    // $ANTLR start "rule__ConstraintExpression__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2775:1: rule__ConstraintExpression__Group__0 : rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1 ;
    public final void rule__ConstraintExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2779:1: ( rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2780:2: rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__0__Impl_in_rule__ConstraintExpression__Group__05705);
            rule__ConstraintExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__1_in_rule__ConstraintExpression__Group__05708);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2787:1: rule__ConstraintExpression__Group__0__Impl : ( ruleBasicConstraint ) ;
    public final void rule__ConstraintExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2791:1: ( ( ruleBasicConstraint ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2792:1: ( ruleBasicConstraint )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2792:1: ( ruleBasicConstraint )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2793:1: ruleBasicConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getBasicConstraintParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBasicConstraint_in_rule__ConstraintExpression__Group__0__Impl5735);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2804:1: rule__ConstraintExpression__Group__1 : rule__ConstraintExpression__Group__1__Impl ;
    public final void rule__ConstraintExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2808:1: ( rule__ConstraintExpression__Group__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2809:2: rule__ConstraintExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__1__Impl_in_rule__ConstraintExpression__Group__15764);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2815:1: rule__ConstraintExpression__Group__1__Impl : ( ( rule__ConstraintExpression__Group_1__0 )? ) ;
    public final void rule__ConstraintExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2819:1: ( ( ( rule__ConstraintExpression__Group_1__0 )? ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2820:1: ( ( rule__ConstraintExpression__Group_1__0 )? )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2820:1: ( ( rule__ConstraintExpression__Group_1__0 )? )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2821:1: ( rule__ConstraintExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2822:1: ( rule__ConstraintExpression__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=16 && LA18_0<=17)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2822:2: rule__ConstraintExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__0_in_rule__ConstraintExpression__Group__1__Impl5791);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2836:1: rule__ConstraintExpression__Group_1__0 : rule__ConstraintExpression__Group_1__0__Impl rule__ConstraintExpression__Group_1__1 ;
    public final void rule__ConstraintExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2840:1: ( rule__ConstraintExpression__Group_1__0__Impl rule__ConstraintExpression__Group_1__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2841:2: rule__ConstraintExpression__Group_1__0__Impl rule__ConstraintExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__0__Impl_in_rule__ConstraintExpression__Group_1__05826);
            rule__ConstraintExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__1_in_rule__ConstraintExpression__Group_1__05829);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2848:1: rule__ConstraintExpression__Group_1__0__Impl : ( ( rule__ConstraintExpression__Group_1_0__0 ) ) ;
    public final void rule__ConstraintExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2852:1: ( ( ( rule__ConstraintExpression__Group_1_0__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2853:1: ( ( rule__ConstraintExpression__Group_1_0__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2853:1: ( ( rule__ConstraintExpression__Group_1_0__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2854:1: ( rule__ConstraintExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup_1_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2855:1: ( rule__ConstraintExpression__Group_1_0__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2855:2: rule__ConstraintExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0__0_in_rule__ConstraintExpression__Group_1__0__Impl5856);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2865:1: rule__ConstraintExpression__Group_1__1 : rule__ConstraintExpression__Group_1__1__Impl ;
    public final void rule__ConstraintExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2869:1: ( rule__ConstraintExpression__Group_1__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2870:2: rule__ConstraintExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__1__Impl_in_rule__ConstraintExpression__Group_1__15886);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2876:1: rule__ConstraintExpression__Group_1__1__Impl : ( ( rule__ConstraintExpression__RightAssignment_1_1 ) ) ;
    public final void rule__ConstraintExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2880:1: ( ( ( rule__ConstraintExpression__RightAssignment_1_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2881:1: ( ( rule__ConstraintExpression__RightAssignment_1_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2881:1: ( ( rule__ConstraintExpression__RightAssignment_1_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2882:1: ( rule__ConstraintExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2883:1: ( rule__ConstraintExpression__RightAssignment_1_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2883:2: rule__ConstraintExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__RightAssignment_1_1_in_rule__ConstraintExpression__Group_1__1__Impl5913);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2897:1: rule__ConstraintExpression__Group_1_0__0 : rule__ConstraintExpression__Group_1_0__0__Impl ;
    public final void rule__ConstraintExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2901:1: ( rule__ConstraintExpression__Group_1_0__0__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2902:2: rule__ConstraintExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0__0__Impl_in_rule__ConstraintExpression__Group_1_0__05947);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2908:1: rule__ConstraintExpression__Group_1_0__0__Impl : ( ( rule__ConstraintExpression__Group_1_0_0__0 ) ) ;
    public final void rule__ConstraintExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2912:1: ( ( ( rule__ConstraintExpression__Group_1_0_0__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2913:1: ( ( rule__ConstraintExpression__Group_1_0_0__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2913:1: ( ( rule__ConstraintExpression__Group_1_0_0__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2914:1: ( rule__ConstraintExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup_1_0_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2915:1: ( rule__ConstraintExpression__Group_1_0_0__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2915:2: rule__ConstraintExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__0_in_rule__ConstraintExpression__Group_1_0__0__Impl5974);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2927:1: rule__ConstraintExpression__Group_1_0_0__0 : rule__ConstraintExpression__Group_1_0_0__0__Impl rule__ConstraintExpression__Group_1_0_0__1 ;
    public final void rule__ConstraintExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2931:1: ( rule__ConstraintExpression__Group_1_0_0__0__Impl rule__ConstraintExpression__Group_1_0_0__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2932:2: rule__ConstraintExpression__Group_1_0_0__0__Impl rule__ConstraintExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__0__Impl_in_rule__ConstraintExpression__Group_1_0_0__06006);
            rule__ConstraintExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__1_in_rule__ConstraintExpression__Group_1_0_0__06009);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2939:1: rule__ConstraintExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ConstraintExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2943:1: ( ( () ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2944:1: ( () )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2944:1: ( () )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2945:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2946:1: ()
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2948:1: 
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2958:1: rule__ConstraintExpression__Group_1_0_0__1 : rule__ConstraintExpression__Group_1_0_0__1__Impl ;
    public final void rule__ConstraintExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2962:1: ( rule__ConstraintExpression__Group_1_0_0__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2963:2: rule__ConstraintExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__1__Impl_in_rule__ConstraintExpression__Group_1_0_0__16067);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2969:1: rule__ConstraintExpression__Group_1_0_0__1__Impl : ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__ConstraintExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2973:1: ( ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2974:1: ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2974:1: ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2975:1: ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2976:1: ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2976:2: rule__ConstraintExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__OperatorAssignment_1_0_0_1_in_rule__ConstraintExpression__Group_1_0_0__1__Impl6094);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2990:1: rule__ParenthesisConstraint__Group__0 : rule__ParenthesisConstraint__Group__0__Impl rule__ParenthesisConstraint__Group__1 ;
    public final void rule__ParenthesisConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2994:1: ( rule__ParenthesisConstraint__Group__0__Impl rule__ParenthesisConstraint__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:2995:2: rule__ParenthesisConstraint__Group__0__Impl rule__ParenthesisConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__0__Impl_in_rule__ParenthesisConstraint__Group__06128);
            rule__ParenthesisConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__1_in_rule__ParenthesisConstraint__Group__06131);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3002:1: rule__ParenthesisConstraint__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesisConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3006:1: ( ( '(' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3007:1: ( '(' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3007:1: ( '(' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3008:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__ParenthesisConstraint__Group__0__Impl6159); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3021:1: rule__ParenthesisConstraint__Group__1 : rule__ParenthesisConstraint__Group__1__Impl rule__ParenthesisConstraint__Group__2 ;
    public final void rule__ParenthesisConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3025:1: ( rule__ParenthesisConstraint__Group__1__Impl rule__ParenthesisConstraint__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3026:2: rule__ParenthesisConstraint__Group__1__Impl rule__ParenthesisConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__1__Impl_in_rule__ParenthesisConstraint__Group__16190);
            rule__ParenthesisConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__2_in_rule__ParenthesisConstraint__Group__16193);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3033:1: rule__ParenthesisConstraint__Group__1__Impl : ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) ) ;
    public final void rule__ParenthesisConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3037:1: ( ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3038:1: ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3038:1: ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3039:1: ( rule__ParenthesisConstraint__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getConstraintAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3040:1: ( rule__ParenthesisConstraint__ConstraintAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3040:2: rule__ParenthesisConstraint__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__ConstraintAssignment_1_in_rule__ParenthesisConstraint__Group__1__Impl6220);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3050:1: rule__ParenthesisConstraint__Group__2 : rule__ParenthesisConstraint__Group__2__Impl ;
    public final void rule__ParenthesisConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3054:1: ( rule__ParenthesisConstraint__Group__2__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3055:2: rule__ParenthesisConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__2__Impl_in_rule__ParenthesisConstraint__Group__26250);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3061:1: rule__ParenthesisConstraint__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesisConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3065:1: ( ( ')' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3066:1: ( ')' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3066:1: ( ')' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3067:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__ParenthesisConstraint__Group__2__Impl6278); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3086:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3090:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3091:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__06315);
            rule__Constraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__06318);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3098:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__TypeSelectionAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3102:1: ( ( ( rule__Constraint__TypeSelectionAssignment_0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3103:1: ( ( rule__Constraint__TypeSelectionAssignment_0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3103:1: ( ( rule__Constraint__TypeSelectionAssignment_0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3104:1: ( rule__Constraint__TypeSelectionAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getTypeSelectionAssignment_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3105:1: ( rule__Constraint__TypeSelectionAssignment_0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3105:2: rule__Constraint__TypeSelectionAssignment_0
            {
            pushFollow(FOLLOW_rule__Constraint__TypeSelectionAssignment_0_in_rule__Constraint__Group__0__Impl6345);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3115:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3119:1: ( rule__Constraint__Group__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3120:2: rule__Constraint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__16375);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3126:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__PropertyConstraintAssignment_1 )? ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3130:1: ( ( ( rule__Constraint__PropertyConstraintAssignment_1 )? ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3131:1: ( ( rule__Constraint__PropertyConstraintAssignment_1 )? )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3131:1: ( ( rule__Constraint__PropertyConstraintAssignment_1 )? )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3132:1: ( rule__Constraint__PropertyConstraintAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getPropertyConstraintAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3133:1: ( rule__Constraint__PropertyConstraintAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3133:2: rule__Constraint__PropertyConstraintAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Constraint__PropertyConstraintAssignment_1_in_rule__Constraint__Group__1__Impl6402);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3147:1: rule__PropertyConstraint__Group__0 : rule__PropertyConstraint__Group__0__Impl rule__PropertyConstraint__Group__1 ;
    public final void rule__PropertyConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3151:1: ( rule__PropertyConstraint__Group__0__Impl rule__PropertyConstraint__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3152:2: rule__PropertyConstraint__Group__0__Impl rule__PropertyConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyConstraint__Group__0__Impl_in_rule__PropertyConstraint__Group__06437);
            rule__PropertyConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyConstraint__Group__1_in_rule__PropertyConstraint__Group__06440);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3159:1: rule__PropertyConstraint__Group__0__Impl : ( ruleBasicPropertyConstraint ) ;
    public final void rule__PropertyConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3163:1: ( ( ruleBasicPropertyConstraint ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3164:1: ( ruleBasicPropertyConstraint )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3164:1: ( ruleBasicPropertyConstraint )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3165:1: ruleBasicPropertyConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getBasicPropertyConstraintParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBasicPropertyConstraint_in_rule__PropertyConstraint__Group__0__Impl6467);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3176:1: rule__PropertyConstraint__Group__1 : rule__PropertyConstraint__Group__1__Impl ;
    public final void rule__PropertyConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3180:1: ( rule__PropertyConstraint__Group__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3181:2: rule__PropertyConstraint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyConstraint__Group__1__Impl_in_rule__PropertyConstraint__Group__16496);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3187:1: rule__PropertyConstraint__Group__1__Impl : ( ( rule__PropertyConstraint__Group_1__0 )? ) ;
    public final void rule__PropertyConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3191:1: ( ( ( rule__PropertyConstraint__Group_1__0 )? ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3192:1: ( ( rule__PropertyConstraint__Group_1__0 )? )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3192:1: ( ( rule__PropertyConstraint__Group_1__0 )? )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3193:1: ( rule__PropertyConstraint__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getGroup_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3194:1: ( rule__PropertyConstraint__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                int LA20_1 = input.LA(2);

                if ( (synpred30_InternalConstraintLang()) ) {
                    alt20=1;
                }
            }
            else if ( (LA20_0==17) ) {
                int LA20_2 = input.LA(2);

                if ( (synpred30_InternalConstraintLang()) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3194:2: rule__PropertyConstraint__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PropertyConstraint__Group_1__0_in_rule__PropertyConstraint__Group__1__Impl6523);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3208:1: rule__PropertyConstraint__Group_1__0 : rule__PropertyConstraint__Group_1__0__Impl rule__PropertyConstraint__Group_1__1 ;
    public final void rule__PropertyConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3212:1: ( rule__PropertyConstraint__Group_1__0__Impl rule__PropertyConstraint__Group_1__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3213:2: rule__PropertyConstraint__Group_1__0__Impl rule__PropertyConstraint__Group_1__1
            {
            pushFollow(FOLLOW_rule__PropertyConstraint__Group_1__0__Impl_in_rule__PropertyConstraint__Group_1__06558);
            rule__PropertyConstraint__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyConstraint__Group_1__1_in_rule__PropertyConstraint__Group_1__06561);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3220:1: rule__PropertyConstraint__Group_1__0__Impl : ( ( rule__PropertyConstraint__Group_1_0__0 ) ) ;
    public final void rule__PropertyConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3224:1: ( ( ( rule__PropertyConstraint__Group_1_0__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3225:1: ( ( rule__PropertyConstraint__Group_1_0__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3225:1: ( ( rule__PropertyConstraint__Group_1_0__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3226:1: ( rule__PropertyConstraint__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getGroup_1_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3227:1: ( rule__PropertyConstraint__Group_1_0__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3227:2: rule__PropertyConstraint__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__PropertyConstraint__Group_1_0__0_in_rule__PropertyConstraint__Group_1__0__Impl6588);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3237:1: rule__PropertyConstraint__Group_1__1 : rule__PropertyConstraint__Group_1__1__Impl ;
    public final void rule__PropertyConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3241:1: ( rule__PropertyConstraint__Group_1__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3242:2: rule__PropertyConstraint__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyConstraint__Group_1__1__Impl_in_rule__PropertyConstraint__Group_1__16618);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3248:1: rule__PropertyConstraint__Group_1__1__Impl : ( ( rule__PropertyConstraint__RightAssignment_1_1 ) ) ;
    public final void rule__PropertyConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3252:1: ( ( ( rule__PropertyConstraint__RightAssignment_1_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3253:1: ( ( rule__PropertyConstraint__RightAssignment_1_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3253:1: ( ( rule__PropertyConstraint__RightAssignment_1_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3254:1: ( rule__PropertyConstraint__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getRightAssignment_1_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3255:1: ( rule__PropertyConstraint__RightAssignment_1_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3255:2: rule__PropertyConstraint__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PropertyConstraint__RightAssignment_1_1_in_rule__PropertyConstraint__Group_1__1__Impl6645);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3269:1: rule__PropertyConstraint__Group_1_0__0 : rule__PropertyConstraint__Group_1_0__0__Impl ;
    public final void rule__PropertyConstraint__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3273:1: ( rule__PropertyConstraint__Group_1_0__0__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3274:2: rule__PropertyConstraint__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__PropertyConstraint__Group_1_0__0__Impl_in_rule__PropertyConstraint__Group_1_0__06679);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3280:1: rule__PropertyConstraint__Group_1_0__0__Impl : ( ( rule__PropertyConstraint__Group_1_0_0__0 ) ) ;
    public final void rule__PropertyConstraint__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3284:1: ( ( ( rule__PropertyConstraint__Group_1_0_0__0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3285:1: ( ( rule__PropertyConstraint__Group_1_0_0__0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3285:1: ( ( rule__PropertyConstraint__Group_1_0_0__0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3286:1: ( rule__PropertyConstraint__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getGroup_1_0_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3287:1: ( rule__PropertyConstraint__Group_1_0_0__0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3287:2: rule__PropertyConstraint__Group_1_0_0__0
            {
            pushFollow(FOLLOW_rule__PropertyConstraint__Group_1_0_0__0_in_rule__PropertyConstraint__Group_1_0__0__Impl6706);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3299:1: rule__PropertyConstraint__Group_1_0_0__0 : rule__PropertyConstraint__Group_1_0_0__0__Impl rule__PropertyConstraint__Group_1_0_0__1 ;
    public final void rule__PropertyConstraint__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3303:1: ( rule__PropertyConstraint__Group_1_0_0__0__Impl rule__PropertyConstraint__Group_1_0_0__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3304:2: rule__PropertyConstraint__Group_1_0_0__0__Impl rule__PropertyConstraint__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__PropertyConstraint__Group_1_0_0__0__Impl_in_rule__PropertyConstraint__Group_1_0_0__06738);
            rule__PropertyConstraint__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyConstraint__Group_1_0_0__1_in_rule__PropertyConstraint__Group_1_0_0__06741);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3311:1: rule__PropertyConstraint__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PropertyConstraint__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3315:1: ( ( () ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3316:1: ( () )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3316:1: ( () )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3317:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getPropertyConstraintLeftAction_1_0_0_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3318:1: ()
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3320:1: 
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3330:1: rule__PropertyConstraint__Group_1_0_0__1 : rule__PropertyConstraint__Group_1_0_0__1__Impl ;
    public final void rule__PropertyConstraint__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3334:1: ( rule__PropertyConstraint__Group_1_0_0__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3335:2: rule__PropertyConstraint__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyConstraint__Group_1_0_0__1__Impl_in_rule__PropertyConstraint__Group_1_0_0__16799);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3341:1: rule__PropertyConstraint__Group_1_0_0__1__Impl : ( ( rule__PropertyConstraint__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__PropertyConstraint__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3345:1: ( ( ( rule__PropertyConstraint__OperatorAssignment_1_0_0_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3346:1: ( ( rule__PropertyConstraint__OperatorAssignment_1_0_0_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3346:1: ( ( rule__PropertyConstraint__OperatorAssignment_1_0_0_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3347:1: ( rule__PropertyConstraint__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3348:1: ( rule__PropertyConstraint__OperatorAssignment_1_0_0_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3348:2: rule__PropertyConstraint__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__PropertyConstraint__OperatorAssignment_1_0_0_1_in_rule__PropertyConstraint__Group_1_0_0__1__Impl6826);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3362:1: rule__PropertyParenthesisConstraint__Group__0 : rule__PropertyParenthesisConstraint__Group__0__Impl rule__PropertyParenthesisConstraint__Group__1 ;
    public final void rule__PropertyParenthesisConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3366:1: ( rule__PropertyParenthesisConstraint__Group__0__Impl rule__PropertyParenthesisConstraint__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3367:2: rule__PropertyParenthesisConstraint__Group__0__Impl rule__PropertyParenthesisConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyParenthesisConstraint__Group__0__Impl_in_rule__PropertyParenthesisConstraint__Group__06860);
            rule__PropertyParenthesisConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyParenthesisConstraint__Group__1_in_rule__PropertyParenthesisConstraint__Group__06863);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3374:1: rule__PropertyParenthesisConstraint__Group__0__Impl : ( '(' ) ;
    public final void rule__PropertyParenthesisConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3378:1: ( ( '(' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3379:1: ( '(' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3379:1: ( '(' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3380:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyParenthesisConstraintAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__PropertyParenthesisConstraint__Group__0__Impl6891); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3393:1: rule__PropertyParenthesisConstraint__Group__1 : rule__PropertyParenthesisConstraint__Group__1__Impl rule__PropertyParenthesisConstraint__Group__2 ;
    public final void rule__PropertyParenthesisConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3397:1: ( rule__PropertyParenthesisConstraint__Group__1__Impl rule__PropertyParenthesisConstraint__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3398:2: rule__PropertyParenthesisConstraint__Group__1__Impl rule__PropertyParenthesisConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyParenthesisConstraint__Group__1__Impl_in_rule__PropertyParenthesisConstraint__Group__16922);
            rule__PropertyParenthesisConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyParenthesisConstraint__Group__2_in_rule__PropertyParenthesisConstraint__Group__16925);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3405:1: rule__PropertyParenthesisConstraint__Group__1__Impl : ( ( rule__PropertyParenthesisConstraint__ConstraintAssignment_1 ) ) ;
    public final void rule__PropertyParenthesisConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3409:1: ( ( ( rule__PropertyParenthesisConstraint__ConstraintAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3410:1: ( ( rule__PropertyParenthesisConstraint__ConstraintAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3410:1: ( ( rule__PropertyParenthesisConstraint__ConstraintAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3411:1: ( rule__PropertyParenthesisConstraint__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyParenthesisConstraintAccess().getConstraintAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3412:1: ( rule__PropertyParenthesisConstraint__ConstraintAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3412:2: rule__PropertyParenthesisConstraint__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__PropertyParenthesisConstraint__ConstraintAssignment_1_in_rule__PropertyParenthesisConstraint__Group__1__Impl6952);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3422:1: rule__PropertyParenthesisConstraint__Group__2 : rule__PropertyParenthesisConstraint__Group__2__Impl ;
    public final void rule__PropertyParenthesisConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3426:1: ( rule__PropertyParenthesisConstraint__Group__2__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3427:2: rule__PropertyParenthesisConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyParenthesisConstraint__Group__2__Impl_in_rule__PropertyParenthesisConstraint__Group__26982);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3433:1: rule__PropertyParenthesisConstraint__Group__2__Impl : ( ')' ) ;
    public final void rule__PropertyParenthesisConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3437:1: ( ( ')' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3438:1: ( ')' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3438:1: ( ')' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3439:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyParenthesisConstraintAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__PropertyParenthesisConstraint__Group__2__Impl7010); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3458:1: rule__PropertyValueConstraint__Group__0 : rule__PropertyValueConstraint__Group__0__Impl rule__PropertyValueConstraint__Group__1 ;
    public final void rule__PropertyValueConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3462:1: ( rule__PropertyValueConstraint__Group__0__Impl rule__PropertyValueConstraint__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3463:2: rule__PropertyValueConstraint__Group__0__Impl rule__PropertyValueConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyValueConstraint__Group__0__Impl_in_rule__PropertyValueConstraint__Group__07047);
            rule__PropertyValueConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyValueConstraint__Group__1_in_rule__PropertyValueConstraint__Group__07050);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3470:1: rule__PropertyValueConstraint__Group__0__Impl : ( ( rule__PropertyValueConstraint__PropertyAssignment_0 ) ) ;
    public final void rule__PropertyValueConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3474:1: ( ( ( rule__PropertyValueConstraint__PropertyAssignment_0 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3475:1: ( ( rule__PropertyValueConstraint__PropertyAssignment_0 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3475:1: ( ( rule__PropertyValueConstraint__PropertyAssignment_0 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3476:1: ( rule__PropertyValueConstraint__PropertyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueConstraintAccess().getPropertyAssignment_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3477:1: ( rule__PropertyValueConstraint__PropertyAssignment_0 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3477:2: rule__PropertyValueConstraint__PropertyAssignment_0
            {
            pushFollow(FOLLOW_rule__PropertyValueConstraint__PropertyAssignment_0_in_rule__PropertyValueConstraint__Group__0__Impl7077);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3487:1: rule__PropertyValueConstraint__Group__1 : rule__PropertyValueConstraint__Group__1__Impl rule__PropertyValueConstraint__Group__2 ;
    public final void rule__PropertyValueConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3491:1: ( rule__PropertyValueConstraint__Group__1__Impl rule__PropertyValueConstraint__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3492:2: rule__PropertyValueConstraint__Group__1__Impl rule__PropertyValueConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyValueConstraint__Group__1__Impl_in_rule__PropertyValueConstraint__Group__17107);
            rule__PropertyValueConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PropertyValueConstraint__Group__2_in_rule__PropertyValueConstraint__Group__17110);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3499:1: rule__PropertyValueConstraint__Group__1__Impl : ( ( rule__PropertyValueConstraint__ComparatorAssignment_1 ) ) ;
    public final void rule__PropertyValueConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3503:1: ( ( ( rule__PropertyValueConstraint__ComparatorAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3504:1: ( ( rule__PropertyValueConstraint__ComparatorAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3504:1: ( ( rule__PropertyValueConstraint__ComparatorAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3505:1: ( rule__PropertyValueConstraint__ComparatorAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueConstraintAccess().getComparatorAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3506:1: ( rule__PropertyValueConstraint__ComparatorAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3506:2: rule__PropertyValueConstraint__ComparatorAssignment_1
            {
            pushFollow(FOLLOW_rule__PropertyValueConstraint__ComparatorAssignment_1_in_rule__PropertyValueConstraint__Group__1__Impl7137);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3516:1: rule__PropertyValueConstraint__Group__2 : rule__PropertyValueConstraint__Group__2__Impl ;
    public final void rule__PropertyValueConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3520:1: ( rule__PropertyValueConstraint__Group__2__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3521:2: rule__PropertyValueConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyValueConstraint__Group__2__Impl_in_rule__PropertyValueConstraint__Group__27167);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3527:1: rule__PropertyValueConstraint__Group__2__Impl : ( ( rule__PropertyValueConstraint__ValueAssignment_2 ) ) ;
    public final void rule__PropertyValueConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3531:1: ( ( ( rule__PropertyValueConstraint__ValueAssignment_2 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3532:1: ( ( rule__PropertyValueConstraint__ValueAssignment_2 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3532:1: ( ( rule__PropertyValueConstraint__ValueAssignment_2 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3533:1: ( rule__PropertyValueConstraint__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueConstraintAccess().getValueAssignment_2()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3534:1: ( rule__PropertyValueConstraint__ValueAssignment_2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3534:2: rule__PropertyValueConstraint__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyValueConstraint__ValueAssignment_2_in_rule__PropertyValueConstraint__Group__2__Impl7194);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3550:1: rule__TemplateTypeSelection__Group__0 : rule__TemplateTypeSelection__Group__0__Impl rule__TemplateTypeSelection__Group__1 ;
    public final void rule__TemplateTypeSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3554:1: ( rule__TemplateTypeSelection__Group__0__Impl rule__TemplateTypeSelection__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3555:2: rule__TemplateTypeSelection__Group__0__Impl rule__TemplateTypeSelection__Group__1
            {
            pushFollow(FOLLOW_rule__TemplateTypeSelection__Group__0__Impl_in_rule__TemplateTypeSelection__Group__07230);
            rule__TemplateTypeSelection__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemplateTypeSelection__Group__1_in_rule__TemplateTypeSelection__Group__07233);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3562:1: rule__TemplateTypeSelection__Group__0__Impl : ( '?' ) ;
    public final void rule__TemplateTypeSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3566:1: ( ( '?' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3567:1: ( '?' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3567:1: ( '?' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3568:1: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeSelectionAccess().getQuestionMarkKeyword_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__TemplateTypeSelection__Group__0__Impl7261); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3581:1: rule__TemplateTypeSelection__Group__1 : rule__TemplateTypeSelection__Group__1__Impl rule__TemplateTypeSelection__Group__2 ;
    public final void rule__TemplateTypeSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3585:1: ( rule__TemplateTypeSelection__Group__1__Impl rule__TemplateTypeSelection__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3586:2: rule__TemplateTypeSelection__Group__1__Impl rule__TemplateTypeSelection__Group__2
            {
            pushFollow(FOLLOW_rule__TemplateTypeSelection__Group__1__Impl_in_rule__TemplateTypeSelection__Group__17292);
            rule__TemplateTypeSelection__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemplateTypeSelection__Group__2_in_rule__TemplateTypeSelection__Group__17295);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3593:1: rule__TemplateTypeSelection__Group__1__Impl : ( 'uses' ) ;
    public final void rule__TemplateTypeSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3597:1: ( ( 'uses' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3598:1: ( 'uses' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3598:1: ( 'uses' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3599:1: 'uses'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeSelectionAccess().getUsesKeyword_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__TemplateTypeSelection__Group__1__Impl7323); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3612:1: rule__TemplateTypeSelection__Group__2 : rule__TemplateTypeSelection__Group__2__Impl rule__TemplateTypeSelection__Group__3 ;
    public final void rule__TemplateTypeSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3616:1: ( rule__TemplateTypeSelection__Group__2__Impl rule__TemplateTypeSelection__Group__3 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3617:2: rule__TemplateTypeSelection__Group__2__Impl rule__TemplateTypeSelection__Group__3
            {
            pushFollow(FOLLOW_rule__TemplateTypeSelection__Group__2__Impl_in_rule__TemplateTypeSelection__Group__27354);
            rule__TemplateTypeSelection__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemplateTypeSelection__Group__3_in_rule__TemplateTypeSelection__Group__27357);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3624:1: rule__TemplateTypeSelection__Group__2__Impl : ( ( rule__TemplateTypeSelection__TypesAssignment_2 ) ) ;
    public final void rule__TemplateTypeSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3628:1: ( ( ( rule__TemplateTypeSelection__TypesAssignment_2 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3629:1: ( ( rule__TemplateTypeSelection__TypesAssignment_2 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3629:1: ( ( rule__TemplateTypeSelection__TypesAssignment_2 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3630:1: ( rule__TemplateTypeSelection__TypesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeSelectionAccess().getTypesAssignment_2()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3631:1: ( rule__TemplateTypeSelection__TypesAssignment_2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3631:2: rule__TemplateTypeSelection__TypesAssignment_2
            {
            pushFollow(FOLLOW_rule__TemplateTypeSelection__TypesAssignment_2_in_rule__TemplateTypeSelection__Group__2__Impl7384);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3641:1: rule__TemplateTypeSelection__Group__3 : rule__TemplateTypeSelection__Group__3__Impl ;
    public final void rule__TemplateTypeSelection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3645:1: ( rule__TemplateTypeSelection__Group__3__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3646:2: rule__TemplateTypeSelection__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TemplateTypeSelection__Group__3__Impl_in_rule__TemplateTypeSelection__Group__37414);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3652:1: rule__TemplateTypeSelection__Group__3__Impl : ( ( rule__TemplateTypeSelection__Group_3__0 )* ) ;
    public final void rule__TemplateTypeSelection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3656:1: ( ( ( rule__TemplateTypeSelection__Group_3__0 )* ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3657:1: ( ( rule__TemplateTypeSelection__Group_3__0 )* )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3657:1: ( ( rule__TemplateTypeSelection__Group_3__0 )* )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3658:1: ( rule__TemplateTypeSelection__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeSelectionAccess().getGroup_3()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3659:1: ( rule__TemplateTypeSelection__Group_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==32) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3659:2: rule__TemplateTypeSelection__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__TemplateTypeSelection__Group_3__0_in_rule__TemplateTypeSelection__Group__3__Impl7441);
            	    rule__TemplateTypeSelection__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3677:1: rule__TemplateTypeSelection__Group_3__0 : rule__TemplateTypeSelection__Group_3__0__Impl rule__TemplateTypeSelection__Group_3__1 ;
    public final void rule__TemplateTypeSelection__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3681:1: ( rule__TemplateTypeSelection__Group_3__0__Impl rule__TemplateTypeSelection__Group_3__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3682:2: rule__TemplateTypeSelection__Group_3__0__Impl rule__TemplateTypeSelection__Group_3__1
            {
            pushFollow(FOLLOW_rule__TemplateTypeSelection__Group_3__0__Impl_in_rule__TemplateTypeSelection__Group_3__07480);
            rule__TemplateTypeSelection__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemplateTypeSelection__Group_3__1_in_rule__TemplateTypeSelection__Group_3__07483);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3689:1: rule__TemplateTypeSelection__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TemplateTypeSelection__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3693:1: ( ( ',' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3694:1: ( ',' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3694:1: ( ',' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3695:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeSelectionAccess().getCommaKeyword_3_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__TemplateTypeSelection__Group_3__0__Impl7511); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3708:1: rule__TemplateTypeSelection__Group_3__1 : rule__TemplateTypeSelection__Group_3__1__Impl ;
    public final void rule__TemplateTypeSelection__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3712:1: ( rule__TemplateTypeSelection__Group_3__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3713:2: rule__TemplateTypeSelection__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TemplateTypeSelection__Group_3__1__Impl_in_rule__TemplateTypeSelection__Group_3__17542);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3719:1: rule__TemplateTypeSelection__Group_3__1__Impl : ( ( rule__TemplateTypeSelection__TypesAssignment_3_1 ) ) ;
    public final void rule__TemplateTypeSelection__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3723:1: ( ( ( rule__TemplateTypeSelection__TypesAssignment_3_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3724:1: ( ( rule__TemplateTypeSelection__TypesAssignment_3_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3724:1: ( ( rule__TemplateTypeSelection__TypesAssignment_3_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3725:1: ( rule__TemplateTypeSelection__TypesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeSelectionAccess().getTypesAssignment_3_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3726:1: ( rule__TemplateTypeSelection__TypesAssignment_3_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3726:2: rule__TemplateTypeSelection__TypesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TemplateTypeSelection__TypesAssignment_3_1_in_rule__TemplateTypeSelection__Group_3__1__Impl7569);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3740:1: rule__RecordTypeSelection__Group__0 : rule__RecordTypeSelection__Group__0__Impl rule__RecordTypeSelection__Group__1 ;
    public final void rule__RecordTypeSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3744:1: ( rule__RecordTypeSelection__Group__0__Impl rule__RecordTypeSelection__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3745:2: rule__RecordTypeSelection__Group__0__Impl rule__RecordTypeSelection__Group__1
            {
            pushFollow(FOLLOW_rule__RecordTypeSelection__Group__0__Impl_in_rule__RecordTypeSelection__Group__07603);
            rule__RecordTypeSelection__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordTypeSelection__Group__1_in_rule__RecordTypeSelection__Group__07606);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3752:1: rule__RecordTypeSelection__Group__0__Impl : ( '?' ) ;
    public final void rule__RecordTypeSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3756:1: ( ( '?' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3757:1: ( '?' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3757:1: ( '?' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3758:1: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeSelectionAccess().getQuestionMarkKeyword_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__RecordTypeSelection__Group__0__Impl7634); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3771:1: rule__RecordTypeSelection__Group__1 : rule__RecordTypeSelection__Group__1__Impl rule__RecordTypeSelection__Group__2 ;
    public final void rule__RecordTypeSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3775:1: ( rule__RecordTypeSelection__Group__1__Impl rule__RecordTypeSelection__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3776:2: rule__RecordTypeSelection__Group__1__Impl rule__RecordTypeSelection__Group__2
            {
            pushFollow(FOLLOW_rule__RecordTypeSelection__Group__1__Impl_in_rule__RecordTypeSelection__Group__17665);
            rule__RecordTypeSelection__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordTypeSelection__Group__2_in_rule__RecordTypeSelection__Group__17668);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3783:1: rule__RecordTypeSelection__Group__1__Impl : ( ( rule__RecordTypeSelection__ModifierAssignment_1 ) ) ;
    public final void rule__RecordTypeSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3787:1: ( ( ( rule__RecordTypeSelection__ModifierAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3788:1: ( ( rule__RecordTypeSelection__ModifierAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3788:1: ( ( rule__RecordTypeSelection__ModifierAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3789:1: ( rule__RecordTypeSelection__ModifierAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeSelectionAccess().getModifierAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3790:1: ( rule__RecordTypeSelection__ModifierAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3790:2: rule__RecordTypeSelection__ModifierAssignment_1
            {
            pushFollow(FOLLOW_rule__RecordTypeSelection__ModifierAssignment_1_in_rule__RecordTypeSelection__Group__1__Impl7695);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3800:1: rule__RecordTypeSelection__Group__2 : rule__RecordTypeSelection__Group__2__Impl ;
    public final void rule__RecordTypeSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3804:1: ( rule__RecordTypeSelection__Group__2__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3805:2: rule__RecordTypeSelection__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RecordTypeSelection__Group__2__Impl_in_rule__RecordTypeSelection__Group__27725);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3811:1: rule__RecordTypeSelection__Group__2__Impl : ( ( rule__RecordTypeSelection__TypeAssignment_2 ) ) ;
    public final void rule__RecordTypeSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3815:1: ( ( ( rule__RecordTypeSelection__TypeAssignment_2 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3816:1: ( ( rule__RecordTypeSelection__TypeAssignment_2 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3816:1: ( ( rule__RecordTypeSelection__TypeAssignment_2 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3817:1: ( rule__RecordTypeSelection__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeSelectionAccess().getTypeAssignment_2()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3818:1: ( rule__RecordTypeSelection__TypeAssignment_2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3818:2: rule__RecordTypeSelection__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__RecordTypeSelection__TypeAssignment_2_in_rule__RecordTypeSelection__Group__2__Impl7752);
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


    // $ANTLR start "rule__ArrayLiteral__Group__0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3834:1: rule__ArrayLiteral__Group__0 : rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 ;
    public final void rule__ArrayLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3838:1: ( rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3839:2: rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__07788);
            rule__ArrayLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__07791);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3846:1: rule__ArrayLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__ArrayLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3850:1: ( ( '{' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3851:1: ( '{' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3851:1: ( '{' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3852:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__ArrayLiteral__Group__0__Impl7819); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3865:1: rule__ArrayLiteral__Group__1 : rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 ;
    public final void rule__ArrayLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3869:1: ( rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3870:2: rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__17850);
            rule__ArrayLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__17853);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3877:1: rule__ArrayLiteral__Group__1__Impl : ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) ) ;
    public final void rule__ArrayLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3881:1: ( ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3882:1: ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3882:1: ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3883:1: ( rule__ArrayLiteral__LiteralsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3884:1: ( rule__ArrayLiteral__LiteralsAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3884:2: rule__ArrayLiteral__LiteralsAssignment_1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__LiteralsAssignment_1_in_rule__ArrayLiteral__Group__1__Impl7880);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3894:1: rule__ArrayLiteral__Group__2 : rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 ;
    public final void rule__ArrayLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3898:1: ( rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3899:2: rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__27910);
            rule__ArrayLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__27913);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3906:1: rule__ArrayLiteral__Group__2__Impl : ( ( rule__ArrayLiteral__Group_2__0 )* ) ;
    public final void rule__ArrayLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3910:1: ( ( ( rule__ArrayLiteral__Group_2__0 )* ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3911:1: ( ( rule__ArrayLiteral__Group_2__0 )* )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3911:1: ( ( rule__ArrayLiteral__Group_2__0 )* )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3912:1: ( rule__ArrayLiteral__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup_2()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3913:1: ( rule__ArrayLiteral__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3913:2: rule__ArrayLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__0_in_rule__ArrayLiteral__Group__2__Impl7940);
            	    rule__ArrayLiteral__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3923:1: rule__ArrayLiteral__Group__3 : rule__ArrayLiteral__Group__3__Impl ;
    public final void rule__ArrayLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3927:1: ( rule__ArrayLiteral__Group__3__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3928:2: rule__ArrayLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__37971);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3934:1: rule__ArrayLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__ArrayLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3938:1: ( ( '}' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3939:1: ( '}' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3939:1: ( '}' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3940:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,39,FOLLOW_39_in_rule__ArrayLiteral__Group__3__Impl7999); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3961:1: rule__ArrayLiteral__Group_2__0 : rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 ;
    public final void rule__ArrayLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3965:1: ( rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3966:2: rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__0__Impl_in_rule__ArrayLiteral__Group_2__08038);
            rule__ArrayLiteral__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__1_in_rule__ArrayLiteral__Group_2__08041);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3973:1: rule__ArrayLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3977:1: ( ( ',' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3978:1: ( ',' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3978:1: ( ',' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3979:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__ArrayLiteral__Group_2__0__Impl8069); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3992:1: rule__ArrayLiteral__Group_2__1 : rule__ArrayLiteral__Group_2__1__Impl ;
    public final void rule__ArrayLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3996:1: ( rule__ArrayLiteral__Group_2__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3997:2: rule__ArrayLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__1__Impl_in_rule__ArrayLiteral__Group_2__18100);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4003:1: rule__ArrayLiteral__Group_2__1__Impl : ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) ) ;
    public final void rule__ArrayLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4007:1: ( ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4008:1: ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4008:1: ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4009:1: ( rule__ArrayLiteral__LiteralsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_2_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4010:1: ( rule__ArrayLiteral__LiteralsAssignment_2_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4010:2: rule__ArrayLiteral__LiteralsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__LiteralsAssignment_2_1_in_rule__ArrayLiteral__Group_2__1__Impl8127);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4024:1: rule__BuiltInValueLiteral__Group__0 : rule__BuiltInValueLiteral__Group__0__Impl rule__BuiltInValueLiteral__Group__1 ;
    public final void rule__BuiltInValueLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4028:1: ( rule__BuiltInValueLiteral__Group__0__Impl rule__BuiltInValueLiteral__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4029:2: rule__BuiltInValueLiteral__Group__0__Impl rule__BuiltInValueLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__BuiltInValueLiteral__Group__0__Impl_in_rule__BuiltInValueLiteral__Group__08161);
            rule__BuiltInValueLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BuiltInValueLiteral__Group__1_in_rule__BuiltInValueLiteral__Group__08164);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4036:1: rule__BuiltInValueLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BuiltInValueLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4040:1: ( ( () ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4041:1: ( () )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4041:1: ( () )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4042:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getBuiltInValueLiteralAction_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4043:1: ()
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4045:1: 
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4055:1: rule__BuiltInValueLiteral__Group__1 : rule__BuiltInValueLiteral__Group__1__Impl ;
    public final void rule__BuiltInValueLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4059:1: ( rule__BuiltInValueLiteral__Group__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4060:2: rule__BuiltInValueLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BuiltInValueLiteral__Group__1__Impl_in_rule__BuiltInValueLiteral__Group__18222);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4066:1: rule__BuiltInValueLiteral__Group__1__Impl : ( ( rule__BuiltInValueLiteral__ValueAssignment_1 ) ) ;
    public final void rule__BuiltInValueLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4070:1: ( ( ( rule__BuiltInValueLiteral__ValueAssignment_1 ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4071:1: ( ( rule__BuiltInValueLiteral__ValueAssignment_1 ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4071:1: ( ( rule__BuiltInValueLiteral__ValueAssignment_1 ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4072:1: ( rule__BuiltInValueLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getValueAssignment_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4073:1: ( rule__BuiltInValueLiteral__ValueAssignment_1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4073:2: rule__BuiltInValueLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__BuiltInValueLiteral__ValueAssignment_1_in_rule__BuiltInValueLiteral__Group__1__Impl8249);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4087:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4091:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4092:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08283);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08286);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4099:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4103:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4104:1: ( RULE_ID )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4104:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4105:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8313); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4116:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4120:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4121:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18342);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4127:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4131:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4132:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4132:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4133:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4134:1: ( rule__QualifiedName__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==34) ) {
                    int LA23_2 = input.LA(2);

                    if ( (LA23_2==RULE_ID) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4134:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8369);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4148:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4152:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4153:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08404);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08407);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4160:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4164:1: ( ( ( '.' ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4165:1: ( ( '.' ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4165:1: ( ( '.' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4166:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4167:1: ( '.' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4168:2: '.'
            {
            match(input,34,FOLLOW_34_in_rule__QualifiedName__Group_1__0__Impl8436); if (state.failed) return ;

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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4179:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4183:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4184:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18468);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4190:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4194:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4195:1: ( RULE_ID )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4195:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4196:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl8495); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4211:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4215:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4216:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__08528);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__08531);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4223:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4227:1: ( ( ruleQualifiedName ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4228:1: ( ruleQualifiedName )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4228:1: ( ruleQualifiedName )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4229:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl8558);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4240:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4244:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4245:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__18587);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4251:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4255:1: ( ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4256:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4256:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4257:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4258:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4258:2: rule__QualifiedNameWithWildcard__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl8614);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4272:1: rule__QualifiedNameWithWildcard__Group_1__0 : rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4276:1: ( rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4277:2: rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__08649);
            rule__QualifiedNameWithWildcard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__08652);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4284:1: rule__QualifiedNameWithWildcard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4288:1: ( ( '.' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4289:1: ( '.' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4289:1: ( '.' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4290:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl8680); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4303:1: rule__QualifiedNameWithWildcard__Group_1__1 : rule__QualifiedNameWithWildcard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4307:1: ( rule__QualifiedNameWithWildcard__Group_1__1__Impl )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4308:2: rule__QualifiedNameWithWildcard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__18711);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4314:1: rule__QualifiedNameWithWildcard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4318:1: ( ( '*' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4319:1: ( '*' )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4319:1: ( '*' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4320:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,40,FOLLOW_40_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl8739); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4338:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4342:1: ( ( ruleQualifiedName ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4343:1: ( ruleQualifiedName )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4343:1: ( ruleQualifiedName )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4344:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_18779);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4353:1: rule__Model__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4357:1: ( ( ruleImport ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4358:1: ( ruleImport )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4358:1: ( ruleImport )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4359:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_28810);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4368:1: rule__Model__OperationsAssignment_3 : ( ruleOperation ) ;
    public final void rule__Model__OperationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4372:1: ( ( ruleOperation ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4373:1: ( ruleOperation )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4373:1: ( ruleOperation )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4374:1: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getOperationsOperationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_rule__Model__OperationsAssignment_38841);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4383:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4387:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4388:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4388:1: ( ruleQualifiedNameWithWildcard )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4389:1: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_18872);
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


    // $ANTLR start "rule__Selection__InputsAssignment_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4398:1: rule__Selection__InputsAssignment_1 : ( ruleSelectInput ) ;
    public final void rule__Selection__InputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4402:1: ( ( ruleSelectInput ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4403:1: ( ruleSelectInput )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4403:1: ( ruleSelectInput )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4404:1: ruleSelectInput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getInputsSelectInputParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSelectInput_in_rule__Selection__InputsAssignment_18903);
            ruleSelectInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getInputsSelectInputParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Selection__InputsAssignment_1"


    // $ANTLR start "rule__Selection__InputsAssignment_2_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4413:1: rule__Selection__InputsAssignment_2_1 : ( ruleSelectInput ) ;
    public final void rule__Selection__InputsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4417:1: ( ( ruleSelectInput ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4418:1: ( ruleSelectInput )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4418:1: ( ruleSelectInput )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4419:1: ruleSelectInput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getInputsSelectInputParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleSelectInput_in_rule__Selection__InputsAssignment_2_18934);
            ruleSelectInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getInputsSelectInputParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Selection__InputsAssignment_2_1"


    // $ANTLR start "rule__Selection__FilterAssignment_4"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4428:1: rule__Selection__FilterAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Selection__FilterAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4432:1: ( ( ( RULE_ID ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4433:1: ( ( RULE_ID ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4433:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4434:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getFilterFilterCrossReference_4_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4435:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4436:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getFilterFilterIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Selection__FilterAssignment_48969); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getFilterFilterIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getFilterFilterCrossReference_4_0()); 
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
    // $ANTLR end "rule__Selection__FilterAssignment_4"


    // $ANTLR start "rule__Selection__RecordTypeAssignment_6"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4447:1: rule__Selection__RecordTypeAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Selection__RecordTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4451:1: ( ( ( RULE_ID ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4452:1: ( ( RULE_ID ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4452:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4453:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getRecordTypeRecordTypeCrossReference_6_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4454:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4455:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getRecordTypeRecordTypeIDTerminalRuleCall_6_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Selection__RecordTypeAssignment_69008); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getRecordTypeRecordTypeIDTerminalRuleCall_6_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getRecordTypeRecordTypeCrossReference_6_0()); 
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
    // $ANTLR end "rule__Selection__RecordTypeAssignment_6"


    // $ANTLR start "rule__Selection__ParemterExpressionsAssignment_8"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4466:1: rule__Selection__ParemterExpressionsAssignment_8 : ( ruleParameterExpression ) ;
    public final void rule__Selection__ParemterExpressionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4470:1: ( ( ruleParameterExpression ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4471:1: ( ruleParameterExpression )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4471:1: ( ruleParameterExpression )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4472:1: ruleParameterExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getParemterExpressionsParameterExpressionParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_ruleParameterExpression_in_rule__Selection__ParemterExpressionsAssignment_89043);
            ruleParameterExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getParemterExpressionsParameterExpressionParserRuleCall_8_0()); 
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
    // $ANTLR end "rule__Selection__ParemterExpressionsAssignment_8"


    // $ANTLR start "rule__Selection__ParemterExpressionsAssignment_9_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4481:1: rule__Selection__ParemterExpressionsAssignment_9_1 : ( ruleParameterExpression ) ;
    public final void rule__Selection__ParemterExpressionsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4485:1: ( ( ruleParameterExpression ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4486:1: ( ruleParameterExpression )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4486:1: ( ruleParameterExpression )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4487:1: ruleParameterExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionAccess().getParemterExpressionsParameterExpressionParserRuleCall_9_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameterExpression_in_rule__Selection__ParemterExpressionsAssignment_9_19074);
            ruleParameterExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionAccess().getParemterExpressionsParameterExpressionParserRuleCall_9_1_0()); 
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
    // $ANTLR end "rule__Selection__ParemterExpressionsAssignment_9_1"


    // $ANTLR start "rule__SelectInput__RecordTypeAssignment_0"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4496:1: rule__SelectInput__RecordTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SelectInput__RecordTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4500:1: ( ( ( RULE_ID ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4501:1: ( ( RULE_ID ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4501:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4502:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectInputAccess().getRecordTypeRecordTypeCrossReference_0_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4503:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4504:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectInputAccess().getRecordTypeRecordTypeIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SelectInput__RecordTypeAssignment_09109); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4515:1: rule__SelectInput__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SelectInput__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4519:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4520:1: ( RULE_ID )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4520:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4521:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectInputAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SelectInput__NameAssignment_19144); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4530:1: rule__SelectInput__SelectConstraintAssignment_2_1 : ( ruleSelectConstaintExpression ) ;
    public final void rule__SelectInput__SelectConstraintAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4534:1: ( ( ruleSelectConstaintExpression ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4535:1: ( ruleSelectConstaintExpression )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4535:1: ( ruleSelectConstaintExpression )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4536:1: ruleSelectConstaintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectInputAccess().getSelectConstraintSelectConstaintExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleSelectConstaintExpression_in_rule__SelectInput__SelectConstraintAssignment_2_19175);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4545:1: rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1 : ( ruleLogicOperator ) ;
    public final void rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4549:1: ( ( ruleLogicOperator ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4550:1: ( ruleLogicOperator )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4550:1: ( ruleLogicOperator )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4551:1: ruleLogicOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstaintExpressionAccess().getOperatorLogicOperatorEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleLogicOperator_in_rule__SelectConstaintExpression__OperatorAssignment_1_0_0_19206);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4560:1: rule__SelectConstaintExpression__RightAssignment_1_1 : ( ruleSelectConstaintExpression ) ;
    public final void rule__SelectConstaintExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4564:1: ( ( ruleSelectConstaintExpression ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4565:1: ( ruleSelectConstaintExpression )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4565:1: ( ruleSelectConstaintExpression )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4566:1: ruleSelectConstaintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstaintExpressionAccess().getRightSelectConstaintExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleSelectConstaintExpression_in_rule__SelectConstaintExpression__RightAssignment_1_19237);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4575:1: rule__ParenthesisSelectConstraint__ConstraintAssignment_1 : ( ruleSelectConstaintExpression ) ;
    public final void rule__ParenthesisSelectConstraint__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4579:1: ( ( ruleSelectConstaintExpression ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4580:1: ( ruleSelectConstaintExpression )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4580:1: ( ruleSelectConstaintExpression )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4581:1: ruleSelectConstaintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisSelectConstraintAccess().getConstraintSelectConstaintExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSelectConstaintExpression_in_rule__ParenthesisSelectConstraint__ConstraintAssignment_19268);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4590:1: rule__SelectConstraint__LeftAssignment_0 : ( ruleCompareOperand ) ;
    public final void rule__SelectConstraint__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4594:1: ( ( ruleCompareOperand ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4595:1: ( ruleCompareOperand )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4595:1: ( ruleCompareOperand )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4596:1: ruleCompareOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstraintAccess().getLeftCompareOperandParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleCompareOperand_in_rule__SelectConstraint__LeftAssignment_09299);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4605:1: rule__SelectConstraint__ComperatorAssignment_1 : ( ruleComparator ) ;
    public final void rule__SelectConstraint__ComperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4609:1: ( ( ruleComparator ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4610:1: ( ruleComparator )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4610:1: ( ruleComparator )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4611:1: ruleComparator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstraintAccess().getComperatorComparatorEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleComparator_in_rule__SelectConstraint__ComperatorAssignment_19330);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4620:1: rule__SelectConstraint__RightAssignment_2 : ( ruleCompareOperand ) ;
    public final void rule__SelectConstraint__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4624:1: ( ( ruleCompareOperand ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4625:1: ( ruleCompareOperand )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4625:1: ( ruleCompareOperand )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4626:1: ruleCompareOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectConstraintAccess().getRightCompareOperandParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleCompareOperand_in_rule__SelectConstraint__RightAssignment_29361);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4635:1: rule__ParameterExpression__InputAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterExpression__InputAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4639:1: ( ( ( RULE_ID ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4640:1: ( ( RULE_ID ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4640:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4641:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterExpressionAccess().getInputSelectInputCrossReference_0_0_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4642:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4643:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterExpressionAccess().getInputSelectInputIDTerminalRuleCall_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterExpression__InputAssignment_0_09396); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4654:1: rule__ParameterExpression__PropertyReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterExpression__PropertyReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4658:1: ( ( ( RULE_ID ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4659:1: ( ( RULE_ID ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4659:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4660:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterExpressionAccess().getPropertyReferencePropertyCrossReference_1_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4661:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4662:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterExpressionAccess().getPropertyReferencePropertyIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterExpression__PropertyReferenceAssignment_19435); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4673:1: rule__Filter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Filter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4677:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4678:1: ( RULE_ID )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4678:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4679:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFilterAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Filter__NameAssignment_19470); if (state.failed) return ;
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


    // $ANTLR start "rule__Filter__ConstraintAssignment_2"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4688:1: rule__Filter__ConstraintAssignment_2 : ( ruleConstraintExpression ) ;
    public final void rule__Filter__ConstraintAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4692:1: ( ( ruleConstraintExpression ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4693:1: ( ruleConstraintExpression )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4693:1: ( ruleConstraintExpression )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4694:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFilterAccess().getConstraintConstraintExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__Filter__ConstraintAssignment_29501);
            ruleConstraintExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFilterAccess().getConstraintConstraintExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Filter__ConstraintAssignment_2"


    // $ANTLR start "rule__ConstraintExpression__OperatorAssignment_1_0_0_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4703:1: rule__ConstraintExpression__OperatorAssignment_1_0_0_1 : ( ruleLogicOperator ) ;
    public final void rule__ConstraintExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4707:1: ( ( ruleLogicOperator ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4708:1: ( ruleLogicOperator )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4708:1: ( ruleLogicOperator )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4709:1: ruleLogicOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getOperatorLogicOperatorEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleLogicOperator_in_rule__ConstraintExpression__OperatorAssignment_1_0_0_19532);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4718:1: rule__ConstraintExpression__RightAssignment_1_1 : ( rulePropertyConstraint ) ;
    public final void rule__ConstraintExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4722:1: ( ( rulePropertyConstraint ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4723:1: ( rulePropertyConstraint )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4723:1: ( rulePropertyConstraint )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4724:1: rulePropertyConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getRightPropertyConstraintParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulePropertyConstraint_in_rule__ConstraintExpression__RightAssignment_1_19563);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4733:1: rule__ParenthesisConstraint__ConstraintAssignment_1 : ( ruleConstraintExpression ) ;
    public final void rule__ParenthesisConstraint__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4737:1: ( ( ruleConstraintExpression ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4738:1: ( ruleConstraintExpression )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4738:1: ( ruleConstraintExpression )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4739:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getConstraintConstraintExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__ParenthesisConstraint__ConstraintAssignment_19594);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4748:1: rule__Constraint__TypeSelectionAssignment_0 : ( ruleTypeSelection ) ;
    public final void rule__Constraint__TypeSelectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4752:1: ( ( ruleTypeSelection ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4753:1: ( ruleTypeSelection )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4753:1: ( ruleTypeSelection )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4754:1: ruleTypeSelection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getTypeSelectionTypeSelectionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleTypeSelection_in_rule__Constraint__TypeSelectionAssignment_09625);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4763:1: rule__Constraint__PropertyConstraintAssignment_1 : ( rulePropertyConstraint ) ;
    public final void rule__Constraint__PropertyConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4767:1: ( ( rulePropertyConstraint ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4768:1: ( rulePropertyConstraint )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4768:1: ( rulePropertyConstraint )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4769:1: rulePropertyConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintAccess().getPropertyConstraintPropertyConstraintParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePropertyConstraint_in_rule__Constraint__PropertyConstraintAssignment_19656);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4778:1: rule__PropertyConstraint__OperatorAssignment_1_0_0_1 : ( ruleLogicOperator ) ;
    public final void rule__PropertyConstraint__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4782:1: ( ( ruleLogicOperator ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4783:1: ( ruleLogicOperator )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4783:1: ( ruleLogicOperator )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4784:1: ruleLogicOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getOperatorLogicOperatorEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleLogicOperator_in_rule__PropertyConstraint__OperatorAssignment_1_0_0_19687);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4793:1: rule__PropertyConstraint__RightAssignment_1_1 : ( rulePropertyConstraint ) ;
    public final void rule__PropertyConstraint__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4797:1: ( ( rulePropertyConstraint ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4798:1: ( rulePropertyConstraint )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4798:1: ( rulePropertyConstraint )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4799:1: rulePropertyConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getRightPropertyConstraintParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulePropertyConstraint_in_rule__PropertyConstraint__RightAssignment_1_19718);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4808:1: rule__PropertyParenthesisConstraint__ConstraintAssignment_1 : ( rulePropertyConstraint ) ;
    public final void rule__PropertyParenthesisConstraint__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4812:1: ( ( rulePropertyConstraint ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4813:1: ( rulePropertyConstraint )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4813:1: ( rulePropertyConstraint )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4814:1: rulePropertyConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyParenthesisConstraintAccess().getConstraintPropertyConstraintParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulePropertyConstraint_in_rule__PropertyParenthesisConstraint__ConstraintAssignment_19749);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4823:1: rule__PropertyValueConstraint__PropertyAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyValueConstraint__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4827:1: ( ( ( RULE_ID ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4828:1: ( ( RULE_ID ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4828:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4829:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueConstraintAccess().getPropertyPropertyCrossReference_0_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4830:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4831:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueConstraintAccess().getPropertyPropertyIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PropertyValueConstraint__PropertyAssignment_09784); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4842:1: rule__PropertyValueConstraint__ComparatorAssignment_1 : ( ruleComparator ) ;
    public final void rule__PropertyValueConstraint__ComparatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4846:1: ( ( ruleComparator ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4847:1: ( ruleComparator )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4847:1: ( ruleComparator )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4848:1: ruleComparator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueConstraintAccess().getComparatorComparatorEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleComparator_in_rule__PropertyValueConstraint__ComparatorAssignment_19819);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4857:1: rule__PropertyValueConstraint__ValueAssignment_2 : ( ruleLiteral ) ;
    public final void rule__PropertyValueConstraint__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4861:1: ( ( ruleLiteral ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4862:1: ( ruleLiteral )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4862:1: ( ruleLiteral )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4863:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueConstraintAccess().getValueLiteralParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__PropertyValueConstraint__ValueAssignment_29850);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4872:1: rule__ConcreteType__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ConcreteType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4876:1: ( ( ( RULE_ID ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4877:1: ( ( RULE_ID ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4877:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4878:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteTypeAccess().getTypeTypeCrossReference_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4879:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4880:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConcreteTypeAccess().getTypeTypeIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConcreteType__TypeAssignment9885); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4891:1: rule__TemplateTypeSelection__TypesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__TemplateTypeSelection__TypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4895:1: ( ( ( RULE_ID ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4896:1: ( ( RULE_ID ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4896:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4897:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeSelectionAccess().getTypesTemplateTypeCrossReference_2_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4898:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4899:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeSelectionAccess().getTypesTemplateTypeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TemplateTypeSelection__TypesAssignment_29924); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4910:1: rule__TemplateTypeSelection__TypesAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TemplateTypeSelection__TypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4914:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4915:1: ( ( ruleQualifiedName ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4915:1: ( ( ruleQualifiedName ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4916:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeSelectionAccess().getTypesTemplateTypeCrossReference_3_1_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4917:1: ( ruleQualifiedName )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4918:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeSelectionAccess().getTypesTemplateTypeQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TemplateTypeSelection__TypesAssignment_3_19963);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4929:1: rule__RecordTypeSelection__ModifierAssignment_1 : ( ruleRecordTypeModifier ) ;
    public final void rule__RecordTypeSelection__ModifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4933:1: ( ( ruleRecordTypeModifier ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4934:1: ( ruleRecordTypeModifier )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4934:1: ( ruleRecordTypeModifier )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4935:1: ruleRecordTypeModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeSelectionAccess().getModifierRecordTypeModifierEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleRecordTypeModifier_in_rule__RecordTypeSelection__ModifierAssignment_19998);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4944:1: rule__RecordTypeSelection__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__RecordTypeSelection__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4948:1: ( ( ( RULE_ID ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4949:1: ( ( RULE_ID ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4949:1: ( ( RULE_ID ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4950:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeSelectionAccess().getTypeRecordTypeCrossReference_2_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4951:1: ( RULE_ID )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4952:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeSelectionAccess().getTypeRecordTypeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RecordTypeSelection__TypeAssignment_210033); if (state.failed) return ;
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


    // $ANTLR start "rule__ArrayLiteral__LiteralsAssignment_1"
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4963:1: rule__ArrayLiteral__LiteralsAssignment_1 : ( ruleLiteral ) ;
    public final void rule__ArrayLiteral__LiteralsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4967:1: ( ( ruleLiteral ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4968:1: ( ruleLiteral )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4968:1: ( ruleLiteral )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4969:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_110068);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4978:1: rule__ArrayLiteral__LiteralsAssignment_2_1 : ( ruleLiteral ) ;
    public final void rule__ArrayLiteral__LiteralsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4982:1: ( ( ruleLiteral ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4983:1: ( ruleLiteral )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4983:1: ( ruleLiteral )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4984:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_2_110099);
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4993:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4997:1: ( ( RULE_STRING ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4998:1: ( RULE_STRING )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4998:1: ( RULE_STRING )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:4999:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment10130); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5008:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5012:1: ( ( RULE_INT ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5013:1: ( RULE_INT )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5013:1: ( RULE_INT )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5014:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment10161); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5023:1: rule__FloatLiteral__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5027:1: ( ( RULE_FLOAT ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5028:1: ( RULE_FLOAT )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5028:1: ( RULE_FLOAT )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5029:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FloatLiteral__ValueAssignment10192); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5038:1: rule__BooleanLiteral__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5042:1: ( ( RULE_BOOLEAN ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5043:1: ( RULE_BOOLEAN )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5043:1: ( RULE_BOOLEAN )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5044:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__BooleanLiteral__ValueAssignment10223); if (state.failed) return ;
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
    // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5053:1: rule__BuiltInValueLiteral__ValueAssignment_1 : ( ( 'KIEKER_VERSION' ) ) ;
    public final void rule__BuiltInValueLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5057:1: ( ( ( 'KIEKER_VERSION' ) ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5058:1: ( ( 'KIEKER_VERSION' ) )
            {
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5058:1: ( ( 'KIEKER_VERSION' ) )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5059:1: ( 'KIEKER_VERSION' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getValueKIEKER_VERSIONKeyword_1_0()); 
            }
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5060:1: ( 'KIEKER_VERSION' )
            // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:5061:1: 'KIEKER_VERSION'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getValueKIEKER_VERSIONKeyword_1_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__BuiltInValueLiteral__ValueAssignment_110259); if (state.failed) return ;
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

    // $ANTLR start synpred30_InternalConstraintLang
    public final void synpred30_InternalConstraintLang_fragment() throws RecognitionException {   
        // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3194:2: ( rule__PropertyConstraint__Group_1__0 )
        // ../org.iobserve.rac.constraint.ui/src-gen/org/iobserve/rac/constraint/ui/contentassist/antlr/internal/InternalConstraintLang.g:3194:2: rule__PropertyConstraint__Group_1__0
        {
        pushFollow(FOLLOW_rule__PropertyConstraint__Group_1__0_in_synpred30_InternalConstraintLang6523);
        rule__PropertyConstraint__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalConstraintLang

    // Delegated rules

    public final boolean synpred30_InternalConstraintLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalConstraintLang_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral1567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteral1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__0_in_ruleArrayLiteral1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral1687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral1747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLiteral__ValueAssignment_in_ruleFloatLiteral1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInValueLiteral_in_entryRuleBuiltInValueLiteral1867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInValueLiteral1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInValueLiteral__Group__0_in_ruleBuiltInValueLiteral1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTypeModifier__Alternatives_in_ruleRecordTypeModifier2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicOperator__Alternatives_in_ruleLogicOperator2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparator__Alternatives_in_ruleComparator2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilter_in_rule__Operation__Alternatives2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelection_in_rule__Operation__Alternatives2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisSelectConstraint_in_rule__BasicSelectConstraint__Alternatives2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstraint_in_rule__BasicSelectConstraint__Alternatives2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_rule__CompareOperand__Alternatives2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__CompareOperand__Alternatives2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisConstraint_in_rule__BasicConstraint__Alternatives2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__BasicConstraint__Alternatives2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyParenthesisConstraint_in_rule__BasicPropertyConstraint__Alternatives2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValueConstraint_in_rule__BasicPropertyConstraint__Alternatives2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcreteType_in_rule__TypeSelection__Alternatives2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateTypeSelection_in_rule__TypeSelection__Alternatives2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTypeSelection_in_rule__TypeSelection__Alternatives2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_rule__Literal__Alternatives2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_rule__Literal__Alternatives2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInValueLiteral_in_rule__Literal__Alternatives2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RecordTypeModifier__Alternatives2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RecordTypeModifier__Alternatives2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__LogicOperator__Alternatives2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__LogicOperator__Alternatives2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Comparator__Alternatives2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Comparator__Alternatives2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Comparator__Alternatives2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Comparator__Alternatives2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Comparator__Alternatives2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Comparator__Alternatives2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Comparator__Alternatives2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Model__Group__0__Impl2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12928 = new BitSet(new long[]{0x000000080C000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22988 = new BitSet(new long[]{0x000000080C000000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_2_in_rule__Model__Group__2__Impl3018 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__OperationsAssignment_3_in_rule__Model__Group__3__Impl3076 = new BitSet(new long[]{0x0000000808000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Import__Group__0__Impl3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__0__Impl_in_rule__Selection__Group__03238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Selection__Group__1_in_rule__Selection__Group__03241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Selection__Group__0__Impl3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__1__Impl_in_rule__Selection__Group__13300 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_rule__Selection__Group__2_in_rule__Selection__Group__13303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__InputsAssignment_1_in_rule__Selection__Group__1__Impl3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__2__Impl_in_rule__Selection__Group__23360 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_rule__Selection__Group__3_in_rule__Selection__Group__23363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group_2__0_in_rule__Selection__Group__2__Impl3390 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__3__Impl_in_rule__Selection__Group__33421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Selection__Group__4_in_rule__Selection__Group__33424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Selection__Group__3__Impl3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__4__Impl_in_rule__Selection__Group__43483 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Selection__Group__5_in_rule__Selection__Group__43486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__FilterAssignment_4_in_rule__Selection__Group__4__Impl3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__5__Impl_in_rule__Selection__Group__53543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Selection__Group__6_in_rule__Selection__Group__53546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Selection__Group__5__Impl3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__6__Impl_in_rule__Selection__Group__63605 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Selection__Group__7_in_rule__Selection__Group__63608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__RecordTypeAssignment_6_in_rule__Selection__Group__6__Impl3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__7__Impl_in_rule__Selection__Group__73665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Selection__Group__8_in_rule__Selection__Group__73668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Selection__Group__7__Impl3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__8__Impl_in_rule__Selection__Group__83727 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__Selection__Group__9_in_rule__Selection__Group__83730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__ParemterExpressionsAssignment_8_in_rule__Selection__Group__8__Impl3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__9__Impl_in_rule__Selection__Group__93787 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__Selection__Group__10_in_rule__Selection__Group__93790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group_9__0_in_rule__Selection__Group__9__Impl3817 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Selection__Group__10__Impl_in_rule__Selection__Group__103848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Selection__Group__10__Impl3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group_2__0__Impl_in_rule__Selection__Group_2__03929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Selection__Group_2__1_in_rule__Selection__Group_2__03932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Selection__Group_2__0__Impl3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group_2__1__Impl_in_rule__Selection__Group_2__13991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__InputsAssignment_2_1_in_rule__Selection__Group_2__1__Impl4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group_9__0__Impl_in_rule__Selection__Group_9__04052 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Selection__Group_9__1_in_rule__Selection__Group_9__04055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Selection__Group_9__0__Impl4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__Group_9__1__Impl_in_rule__Selection__Group_9__14114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Selection__ParemterExpressionsAssignment_9_1_in_rule__Selection__Group_9__1__Impl4141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectInput__Group__0__Impl_in_rule__SelectInput__Group__04175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SelectInput__Group__1_in_rule__SelectInput__Group__04178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectInput__RecordTypeAssignment_0_in_rule__SelectInput__Group__0__Impl4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectInput__Group__1__Impl_in_rule__SelectInput__Group__14235 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__SelectInput__Group__2_in_rule__SelectInput__Group__14238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectInput__NameAssignment_1_in_rule__SelectInput__Group__1__Impl4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectInput__Group__2__Impl_in_rule__SelectInput__Group__24295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectInput__Group_2__0_in_rule__SelectInput__Group__2__Impl4322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectInput__Group_2__0__Impl_in_rule__SelectInput__Group_2__04359 = new BitSet(new long[]{0x00000240400001F0L});
    public static final BitSet FOLLOW_rule__SelectInput__Group_2__1_in_rule__SelectInput__Group_2__04362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SelectInput__Group_2__0__Impl4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectInput__Group_2__1__Impl_in_rule__SelectInput__Group_2__14421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectInput__SelectConstraintAssignment_2_1_in_rule__SelectInput__Group_2__1__Impl4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group__0__Impl_in_rule__SelectConstaintExpression__Group__04482 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group__1_in_rule__SelectConstaintExpression__Group__04485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicSelectConstraint_in_rule__SelectConstaintExpression__Group__0__Impl4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group__1__Impl_in_rule__SelectConstaintExpression__Group__14541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group_1__0_in_rule__SelectConstaintExpression__Group__1__Impl4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group_1__0__Impl_in_rule__SelectConstaintExpression__Group_1__04603 = new BitSet(new long[]{0x00000240400001F0L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group_1__1_in_rule__SelectConstaintExpression__Group_1__04606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group_1_0__0_in_rule__SelectConstaintExpression__Group_1__0__Impl4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group_1__1__Impl_in_rule__SelectConstaintExpression__Group_1__14663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__RightAssignment_1_1_in_rule__SelectConstaintExpression__Group_1__1__Impl4690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group_1_0__0__Impl_in_rule__SelectConstaintExpression__Group_1_0__04724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group_1_0_0__0_in_rule__SelectConstaintExpression__Group_1_0__0__Impl4751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group_1_0_0__0__Impl_in_rule__SelectConstaintExpression__Group_1_0_0__04783 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group_1_0_0__1_in_rule__SelectConstaintExpression__Group_1_0_0__04786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__Group_1_0_0__1__Impl_in_rule__SelectConstaintExpression__Group_1_0_0__14844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstaintExpression__OperatorAssignment_1_0_0_1_in_rule__SelectConstaintExpression__Group_1_0_0__1__Impl4871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisSelectConstraint__Group__0__Impl_in_rule__ParenthesisSelectConstraint__Group__04905 = new BitSet(new long[]{0x00000240400001F0L});
    public static final BitSet FOLLOW_rule__ParenthesisSelectConstraint__Group__1_in_rule__ParenthesisSelectConstraint__Group__04908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ParenthesisSelectConstraint__Group__0__Impl4936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisSelectConstraint__Group__1__Impl_in_rule__ParenthesisSelectConstraint__Group__14967 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ParenthesisSelectConstraint__Group__2_in_rule__ParenthesisSelectConstraint__Group__14970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisSelectConstraint__ConstraintAssignment_1_in_rule__ParenthesisSelectConstraint__Group__1__Impl4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisSelectConstraint__Group__2__Impl_in_rule__ParenthesisSelectConstraint__Group__25027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ParenthesisSelectConstraint__Group__2__Impl5055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstraint__Group__0__Impl_in_rule__SelectConstraint__Group__05092 = new BitSet(new long[]{0x0000000001FC0000L});
    public static final BitSet FOLLOW_rule__SelectConstraint__Group__1_in_rule__SelectConstraint__Group__05095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstraint__LeftAssignment_0_in_rule__SelectConstraint__Group__0__Impl5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstraint__Group__1__Impl_in_rule__SelectConstraint__Group__15152 = new BitSet(new long[]{0x00000240400001F0L});
    public static final BitSet FOLLOW_rule__SelectConstraint__Group__2_in_rule__SelectConstraint__Group__15155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstraint__ComperatorAssignment_1_in_rule__SelectConstraint__Group__1__Impl5182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstraint__Group__2__Impl_in_rule__SelectConstraint__Group__25212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectConstraint__RightAssignment_2_in_rule__SelectConstraint__Group__2__Impl5239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterExpression__Group__0__Impl_in_rule__ParameterExpression__Group__05275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParameterExpression__Group__1_in_rule__ParameterExpression__Group__05278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterExpression__Group_0__0_in_rule__ParameterExpression__Group__0__Impl5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterExpression__Group__1__Impl_in_rule__ParameterExpression__Group__15336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterExpression__PropertyReferenceAssignment_1_in_rule__ParameterExpression__Group__1__Impl5363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterExpression__Group_0__0__Impl_in_rule__ParameterExpression__Group_0__05397 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ParameterExpression__Group_0__1_in_rule__ParameterExpression__Group_0__05400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterExpression__InputAssignment_0_0_in_rule__ParameterExpression__Group_0__0__Impl5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterExpression__Group_0__1__Impl_in_rule__ParameterExpression__Group_0__15457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ParameterExpression__Group_0__1__Impl5485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Filter__Group__0__Impl_in_rule__Filter__Group__05520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Filter__Group__1_in_rule__Filter__Group__05523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Filter__Group__0__Impl5551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Filter__Group__1__Impl_in_rule__Filter__Group__15582 = new BitSet(new long[]{0x0000001040000010L});
    public static final BitSet FOLLOW_rule__Filter__Group__2_in_rule__Filter__Group__15585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Filter__NameAssignment_1_in_rule__Filter__Group__1__Impl5612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Filter__Group__2__Impl_in_rule__Filter__Group__25642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Filter__ConstraintAssignment_2_in_rule__Filter__Group__2__Impl5669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__0__Impl_in_rule__ConstraintExpression__Group__05705 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__1_in_rule__ConstraintExpression__Group__05708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicConstraint_in_rule__ConstraintExpression__Group__0__Impl5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__1__Impl_in_rule__ConstraintExpression__Group__15764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__0_in_rule__ConstraintExpression__Group__1__Impl5791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__0__Impl_in_rule__ConstraintExpression__Group_1__05826 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__1_in_rule__ConstraintExpression__Group_1__05829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0__0_in_rule__ConstraintExpression__Group_1__0__Impl5856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__1__Impl_in_rule__ConstraintExpression__Group_1__15886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__RightAssignment_1_1_in_rule__ConstraintExpression__Group_1__1__Impl5913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0__0__Impl_in_rule__ConstraintExpression__Group_1_0__05947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__0_in_rule__ConstraintExpression__Group_1_0__0__Impl5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__0__Impl_in_rule__ConstraintExpression__Group_1_0_0__06006 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__1_in_rule__ConstraintExpression__Group_1_0_0__06009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__1__Impl_in_rule__ConstraintExpression__Group_1_0_0__16067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__OperatorAssignment_1_0_0_1_in_rule__ConstraintExpression__Group_1_0_0__1__Impl6094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__0__Impl_in_rule__ParenthesisConstraint__Group__06128 = new BitSet(new long[]{0x0000001040000010L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__1_in_rule__ParenthesisConstraint__Group__06131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ParenthesisConstraint__Group__0__Impl6159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__1__Impl_in_rule__ParenthesisConstraint__Group__16190 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__2_in_rule__ParenthesisConstraint__Group__16193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__ConstraintAssignment_1_in_rule__ParenthesisConstraint__Group__1__Impl6220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__2__Impl_in_rule__ParenthesisConstraint__Group__26250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ParenthesisConstraint__Group__2__Impl6278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__06315 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__06318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__TypeSelectionAssignment_0_in_rule__Constraint__Group__0__Impl6345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__16375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__PropertyConstraintAssignment_1_in_rule__Constraint__Group__1__Impl6402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group__0__Impl_in_rule__PropertyConstraint__Group__06437 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group__1_in_rule__PropertyConstraint__Group__06440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicPropertyConstraint_in_rule__PropertyConstraint__Group__0__Impl6467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group__1__Impl_in_rule__PropertyConstraint__Group__16496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group_1__0_in_rule__PropertyConstraint__Group__1__Impl6523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group_1__0__Impl_in_rule__PropertyConstraint__Group_1__06558 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group_1__1_in_rule__PropertyConstraint__Group_1__06561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group_1_0__0_in_rule__PropertyConstraint__Group_1__0__Impl6588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group_1__1__Impl_in_rule__PropertyConstraint__Group_1__16618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__RightAssignment_1_1_in_rule__PropertyConstraint__Group_1__1__Impl6645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group_1_0__0__Impl_in_rule__PropertyConstraint__Group_1_0__06679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group_1_0_0__0_in_rule__PropertyConstraint__Group_1_0__0__Impl6706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group_1_0_0__0__Impl_in_rule__PropertyConstraint__Group_1_0_0__06738 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group_1_0_0__1_in_rule__PropertyConstraint__Group_1_0_0__06741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group_1_0_0__1__Impl_in_rule__PropertyConstraint__Group_1_0_0__16799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__OperatorAssignment_1_0_0_1_in_rule__PropertyConstraint__Group_1_0_0__1__Impl6826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyParenthesisConstraint__Group__0__Impl_in_rule__PropertyParenthesisConstraint__Group__06860 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__PropertyParenthesisConstraint__Group__1_in_rule__PropertyParenthesisConstraint__Group__06863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PropertyParenthesisConstraint__Group__0__Impl6891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyParenthesisConstraint__Group__1__Impl_in_rule__PropertyParenthesisConstraint__Group__16922 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__PropertyParenthesisConstraint__Group__2_in_rule__PropertyParenthesisConstraint__Group__16925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyParenthesisConstraint__ConstraintAssignment_1_in_rule__PropertyParenthesisConstraint__Group__1__Impl6952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyParenthesisConstraint__Group__2__Impl_in_rule__PropertyParenthesisConstraint__Group__26982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PropertyParenthesisConstraint__Group__2__Impl7010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyValueConstraint__Group__0__Impl_in_rule__PropertyValueConstraint__Group__07047 = new BitSet(new long[]{0x0000000001FC0000L});
    public static final BitSet FOLLOW_rule__PropertyValueConstraint__Group__1_in_rule__PropertyValueConstraint__Group__07050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyValueConstraint__PropertyAssignment_0_in_rule__PropertyValueConstraint__Group__0__Impl7077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyValueConstraint__Group__1__Impl_in_rule__PropertyValueConstraint__Group__17107 = new BitSet(new long[]{0x00000240400001F0L});
    public static final BitSet FOLLOW_rule__PropertyValueConstraint__Group__2_in_rule__PropertyValueConstraint__Group__17110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyValueConstraint__ComparatorAssignment_1_in_rule__PropertyValueConstraint__Group__1__Impl7137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyValueConstraint__Group__2__Impl_in_rule__PropertyValueConstraint__Group__27167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyValueConstraint__ValueAssignment_2_in_rule__PropertyValueConstraint__Group__2__Impl7194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__Group__0__Impl_in_rule__TemplateTypeSelection__Group__07230 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__Group__1_in_rule__TemplateTypeSelection__Group__07233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__TemplateTypeSelection__Group__0__Impl7261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__Group__1__Impl_in_rule__TemplateTypeSelection__Group__17292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__Group__2_in_rule__TemplateTypeSelection__Group__17295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__TemplateTypeSelection__Group__1__Impl7323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__Group__2__Impl_in_rule__TemplateTypeSelection__Group__27354 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__Group__3_in_rule__TemplateTypeSelection__Group__27357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__TypesAssignment_2_in_rule__TemplateTypeSelection__Group__2__Impl7384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__Group__3__Impl_in_rule__TemplateTypeSelection__Group__37414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__Group_3__0_in_rule__TemplateTypeSelection__Group__3__Impl7441 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__Group_3__0__Impl_in_rule__TemplateTypeSelection__Group_3__07480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__Group_3__1_in_rule__TemplateTypeSelection__Group_3__07483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TemplateTypeSelection__Group_3__0__Impl7511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__Group_3__1__Impl_in_rule__TemplateTypeSelection__Group_3__17542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateTypeSelection__TypesAssignment_3_1_in_rule__TemplateTypeSelection__Group_3__1__Impl7569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTypeSelection__Group__0__Impl_in_rule__RecordTypeSelection__Group__07603 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__RecordTypeSelection__Group__1_in_rule__RecordTypeSelection__Group__07606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__RecordTypeSelection__Group__0__Impl7634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTypeSelection__Group__1__Impl_in_rule__RecordTypeSelection__Group__17665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordTypeSelection__Group__2_in_rule__RecordTypeSelection__Group__17668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTypeSelection__ModifierAssignment_1_in_rule__RecordTypeSelection__Group__1__Impl7695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTypeSelection__Group__2__Impl_in_rule__RecordTypeSelection__Group__27725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTypeSelection__TypeAssignment_2_in_rule__RecordTypeSelection__Group__2__Impl7752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__07788 = new BitSet(new long[]{0x00000240400001F0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__07791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ArrayLiteral__Group__0__Impl7819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__17850 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__17853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__LiteralsAssignment_1_in_rule__ArrayLiteral__Group__1__Impl7880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__27910 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__27913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__0_in_rule__ArrayLiteral__Group__2__Impl7940 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__37971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ArrayLiteral__Group__3__Impl7999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__0__Impl_in_rule__ArrayLiteral__Group_2__08038 = new BitSet(new long[]{0x00000240400001F0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__1_in_rule__ArrayLiteral__Group_2__08041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ArrayLiteral__Group_2__0__Impl8069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__1__Impl_in_rule__ArrayLiteral__Group_2__18100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__LiteralsAssignment_2_1_in_rule__ArrayLiteral__Group_2__1__Impl8127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInValueLiteral__Group__0__Impl_in_rule__BuiltInValueLiteral__Group__08161 = new BitSet(new long[]{0x00000240400001F0L});
    public static final BitSet FOLLOW_rule__BuiltInValueLiteral__Group__1_in_rule__BuiltInValueLiteral__Group__08164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInValueLiteral__Group__1__Impl_in_rule__BuiltInValueLiteral__Group__18222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInValueLiteral__ValueAssignment_1_in_rule__BuiltInValueLiteral__Group__1__Impl8249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08283 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl8313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8369 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08404 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__QualifiedName__Group_1__0__Impl8436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl8495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__08528 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__08531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl8558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__18587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl8614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__08649 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__08652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl8680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__18711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl8739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_18779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_28810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Model__OperationsAssignment_38841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_18872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectInput_in_rule__Selection__InputsAssignment_18903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectInput_in_rule__Selection__InputsAssignment_2_18934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Selection__FilterAssignment_48969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Selection__RecordTypeAssignment_69008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_rule__Selection__ParemterExpressionsAssignment_89043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterExpression_in_rule__Selection__ParemterExpressionsAssignment_9_19074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SelectInput__RecordTypeAssignment_09109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SelectInput__NameAssignment_19144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstaintExpression_in_rule__SelectInput__SelectConstraintAssignment_2_19175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_rule__SelectConstaintExpression__OperatorAssignment_1_0_0_19206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstaintExpression_in_rule__SelectConstaintExpression__RightAssignment_1_19237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectConstaintExpression_in_rule__ParenthesisSelectConstraint__ConstraintAssignment_19268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperand_in_rule__SelectConstraint__LeftAssignment_09299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparator_in_rule__SelectConstraint__ComperatorAssignment_19330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperand_in_rule__SelectConstraint__RightAssignment_29361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterExpression__InputAssignment_0_09396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterExpression__PropertyReferenceAssignment_19435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Filter__NameAssignment_19470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__Filter__ConstraintAssignment_29501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_rule__ConstraintExpression__OperatorAssignment_1_0_0_19532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyConstraint_in_rule__ConstraintExpression__RightAssignment_1_19563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__ParenthesisConstraint__ConstraintAssignment_19594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSelection_in_rule__Constraint__TypeSelectionAssignment_09625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyConstraint_in_rule__Constraint__PropertyConstraintAssignment_19656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_rule__PropertyConstraint__OperatorAssignment_1_0_0_19687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyConstraint_in_rule__PropertyConstraint__RightAssignment_1_19718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyConstraint_in_rule__PropertyParenthesisConstraint__ConstraintAssignment_19749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyValueConstraint__PropertyAssignment_09784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparator_in_rule__PropertyValueConstraint__ComparatorAssignment_19819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__PropertyValueConstraint__ValueAssignment_29850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConcreteType__TypeAssignment9885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TemplateTypeSelection__TypesAssignment_29924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TemplateTypeSelection__TypesAssignment_3_19963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTypeModifier_in_rule__RecordTypeSelection__ModifierAssignment_19998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RecordTypeSelection__TypeAssignment_210033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_110068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_2_110099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment10130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment10161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatLiteral__ValueAssignment10192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanLiteral__ValueAssignment10223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__BuiltInValueLiteral__ValueAssignment_110259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyConstraint__Group_1__0_in_synpred30_InternalConstraintLang6523 = new BitSet(new long[]{0x0000000000000002L});

}