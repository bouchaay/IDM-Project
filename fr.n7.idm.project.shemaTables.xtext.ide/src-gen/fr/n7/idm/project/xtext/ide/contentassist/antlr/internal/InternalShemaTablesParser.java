package fr.n7.idm.project.xtext.ide.contentassist.antlr.internal;

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
import fr.n7.idm.project.xtext.services.ShemaTablesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalShemaTablesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'float'", "'string'", "'Tables'", "'{'", "'shematables'", "'}'", "'ShemaTable'", "'name'", "'id'", "'columns'", "'catalogue'", "'Column'", "'dataType'", "'constraint'", "'Constraint'", "'filePath'", "'Catalogue'", "'algorithms'", "'Algorithm'", "'path'", "'output'", "'input'", "'Input'", "'constante'", "'Output'", "'Constant'", "'value'"
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

    	public void setGrammarAccess(ShemaTablesGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTables"
    // InternalShemaTables.g:53:1: entryRuleTables : ruleTables EOF ;
    public final void entryRuleTables() throws RecognitionException {
        try {
            // InternalShemaTables.g:54:1: ( ruleTables EOF )
            // InternalShemaTables.g:55:1: ruleTables EOF
            {
             before(grammarAccess.getTablesRule()); 
            pushFollow(FOLLOW_1);
            ruleTables();

            state._fsp--;

             after(grammarAccess.getTablesRule()); 
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
    // $ANTLR end "entryRuleTables"


    // $ANTLR start "ruleTables"
    // InternalShemaTables.g:62:1: ruleTables : ( ( rule__Tables__Group__0 ) ) ;
    public final void ruleTables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:66:2: ( ( ( rule__Tables__Group__0 ) ) )
            // InternalShemaTables.g:67:2: ( ( rule__Tables__Group__0 ) )
            {
            // InternalShemaTables.g:67:2: ( ( rule__Tables__Group__0 ) )
            // InternalShemaTables.g:68:3: ( rule__Tables__Group__0 )
            {
             before(grammarAccess.getTablesAccess().getGroup()); 
            // InternalShemaTables.g:69:3: ( rule__Tables__Group__0 )
            // InternalShemaTables.g:69:4: rule__Tables__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tables__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTablesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTables"


    // $ANTLR start "entryRuleShemaTable"
    // InternalShemaTables.g:78:1: entryRuleShemaTable : ruleShemaTable EOF ;
    public final void entryRuleShemaTable() throws RecognitionException {
        try {
            // InternalShemaTables.g:79:1: ( ruleShemaTable EOF )
            // InternalShemaTables.g:80:1: ruleShemaTable EOF
            {
             before(grammarAccess.getShemaTableRule()); 
            pushFollow(FOLLOW_1);
            ruleShemaTable();

            state._fsp--;

             after(grammarAccess.getShemaTableRule()); 
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
    // $ANTLR end "entryRuleShemaTable"


    // $ANTLR start "ruleShemaTable"
    // InternalShemaTables.g:87:1: ruleShemaTable : ( ( rule__ShemaTable__Group__0 ) ) ;
    public final void ruleShemaTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:91:2: ( ( ( rule__ShemaTable__Group__0 ) ) )
            // InternalShemaTables.g:92:2: ( ( rule__ShemaTable__Group__0 ) )
            {
            // InternalShemaTables.g:92:2: ( ( rule__ShemaTable__Group__0 ) )
            // InternalShemaTables.g:93:3: ( rule__ShemaTable__Group__0 )
            {
             before(grammarAccess.getShemaTableAccess().getGroup()); 
            // InternalShemaTables.g:94:3: ( rule__ShemaTable__Group__0 )
            // InternalShemaTables.g:94:4: rule__ShemaTable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ShemaTable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShemaTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShemaTable"


    // $ANTLR start "entryRuleColumn"
    // InternalShemaTables.g:103:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalShemaTables.g:104:1: ( ruleColumn EOF )
            // InternalShemaTables.g:105:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalShemaTables.g:112:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:116:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalShemaTables.g:117:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalShemaTables.g:117:2: ( ( rule__Column__Group__0 ) )
            // InternalShemaTables.g:118:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalShemaTables.g:119:3: ( rule__Column__Group__0 )
            // InternalShemaTables.g:119:4: rule__Column__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleConstraint"
    // InternalShemaTables.g:128:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalShemaTables.g:129:1: ( ruleConstraint EOF )
            // InternalShemaTables.g:130:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalShemaTables.g:137:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:141:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalShemaTables.g:142:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalShemaTables.g:142:2: ( ( rule__Constraint__Group__0 ) )
            // InternalShemaTables.g:143:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalShemaTables.g:144:3: ( rule__Constraint__Group__0 )
            // InternalShemaTables.g:144:4: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleCatalogue"
    // InternalShemaTables.g:153:1: entryRuleCatalogue : ruleCatalogue EOF ;
    public final void entryRuleCatalogue() throws RecognitionException {
        try {
            // InternalShemaTables.g:154:1: ( ruleCatalogue EOF )
            // InternalShemaTables.g:155:1: ruleCatalogue EOF
            {
             before(grammarAccess.getCatalogueRule()); 
            pushFollow(FOLLOW_1);
            ruleCatalogue();

            state._fsp--;

             after(grammarAccess.getCatalogueRule()); 
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
    // $ANTLR end "entryRuleCatalogue"


    // $ANTLR start "ruleCatalogue"
    // InternalShemaTables.g:162:1: ruleCatalogue : ( ( rule__Catalogue__Group__0 ) ) ;
    public final void ruleCatalogue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:166:2: ( ( ( rule__Catalogue__Group__0 ) ) )
            // InternalShemaTables.g:167:2: ( ( rule__Catalogue__Group__0 ) )
            {
            // InternalShemaTables.g:167:2: ( ( rule__Catalogue__Group__0 ) )
            // InternalShemaTables.g:168:3: ( rule__Catalogue__Group__0 )
            {
             before(grammarAccess.getCatalogueAccess().getGroup()); 
            // InternalShemaTables.g:169:3: ( rule__Catalogue__Group__0 )
            // InternalShemaTables.g:169:4: rule__Catalogue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Catalogue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCatalogueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCatalogue"


    // $ANTLR start "entryRuleAlgorithm"
    // InternalShemaTables.g:178:1: entryRuleAlgorithm : ruleAlgorithm EOF ;
    public final void entryRuleAlgorithm() throws RecognitionException {
        try {
            // InternalShemaTables.g:179:1: ( ruleAlgorithm EOF )
            // InternalShemaTables.g:180:1: ruleAlgorithm EOF
            {
             before(grammarAccess.getAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            ruleAlgorithm();

            state._fsp--;

             after(grammarAccess.getAlgorithmRule()); 
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
    // $ANTLR end "entryRuleAlgorithm"


    // $ANTLR start "ruleAlgorithm"
    // InternalShemaTables.g:187:1: ruleAlgorithm : ( ( rule__Algorithm__Group__0 ) ) ;
    public final void ruleAlgorithm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:191:2: ( ( ( rule__Algorithm__Group__0 ) ) )
            // InternalShemaTables.g:192:2: ( ( rule__Algorithm__Group__0 ) )
            {
            // InternalShemaTables.g:192:2: ( ( rule__Algorithm__Group__0 ) )
            // InternalShemaTables.g:193:3: ( rule__Algorithm__Group__0 )
            {
             before(grammarAccess.getAlgorithmAccess().getGroup()); 
            // InternalShemaTables.g:194:3: ( rule__Algorithm__Group__0 )
            // InternalShemaTables.g:194:4: rule__Algorithm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlgorithm"


    // $ANTLR start "entryRuleInput"
    // InternalShemaTables.g:203:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalShemaTables.g:204:1: ( ruleInput EOF )
            // InternalShemaTables.g:205:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalShemaTables.g:212:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:216:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalShemaTables.g:217:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalShemaTables.g:217:2: ( ( rule__Input__Group__0 ) )
            // InternalShemaTables.g:218:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalShemaTables.g:219:3: ( rule__Input__Group__0 )
            // InternalShemaTables.g:219:4: rule__Input__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalShemaTables.g:228:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalShemaTables.g:229:1: ( ruleOutput EOF )
            // InternalShemaTables.g:230:1: ruleOutput EOF
            {
             before(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getOutputRule()); 
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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalShemaTables.g:237:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:241:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalShemaTables.g:242:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalShemaTables.g:242:2: ( ( rule__Output__Group__0 ) )
            // InternalShemaTables.g:243:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalShemaTables.g:244:3: ( rule__Output__Group__0 )
            // InternalShemaTables.g:244:4: rule__Output__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleConstant"
    // InternalShemaTables.g:253:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalShemaTables.g:254:1: ( ruleConstant EOF )
            // InternalShemaTables.g:255:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalShemaTables.g:262:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:266:2: ( ( ( rule__Constant__Group__0 ) ) )
            // InternalShemaTables.g:267:2: ( ( rule__Constant__Group__0 ) )
            {
            // InternalShemaTables.g:267:2: ( ( rule__Constant__Group__0 ) )
            // InternalShemaTables.g:268:3: ( rule__Constant__Group__0 )
            {
             before(grammarAccess.getConstantAccess().getGroup()); 
            // InternalShemaTables.g:269:3: ( rule__Constant__Group__0 )
            // InternalShemaTables.g:269:4: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "ruleColumnDataType"
    // InternalShemaTables.g:278:1: ruleColumnDataType : ( ( rule__ColumnDataType__Alternatives ) ) ;
    public final void ruleColumnDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:282:1: ( ( ( rule__ColumnDataType__Alternatives ) ) )
            // InternalShemaTables.g:283:2: ( ( rule__ColumnDataType__Alternatives ) )
            {
            // InternalShemaTables.g:283:2: ( ( rule__ColumnDataType__Alternatives ) )
            // InternalShemaTables.g:284:3: ( rule__ColumnDataType__Alternatives )
            {
             before(grammarAccess.getColumnDataTypeAccess().getAlternatives()); 
            // InternalShemaTables.g:285:3: ( rule__ColumnDataType__Alternatives )
            // InternalShemaTables.g:285:4: rule__ColumnDataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ColumnDataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColumnDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnDataType"


    // $ANTLR start "rule__ColumnDataType__Alternatives"
    // InternalShemaTables.g:293:1: rule__ColumnDataType__Alternatives : ( ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'string' ) ) );
    public final void rule__ColumnDataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:297:1: ( ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'string' ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalShemaTables.g:298:2: ( ( 'int' ) )
                    {
                    // InternalShemaTables.g:298:2: ( ( 'int' ) )
                    // InternalShemaTables.g:299:3: ( 'int' )
                    {
                     before(grammarAccess.getColumnDataTypeAccess().getIntEnumLiteralDeclaration_0()); 
                    // InternalShemaTables.g:300:3: ( 'int' )
                    // InternalShemaTables.g:300:4: 'int'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getColumnDataTypeAccess().getIntEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalShemaTables.g:304:2: ( ( 'float' ) )
                    {
                    // InternalShemaTables.g:304:2: ( ( 'float' ) )
                    // InternalShemaTables.g:305:3: ( 'float' )
                    {
                     before(grammarAccess.getColumnDataTypeAccess().getFloatEnumLiteralDeclaration_1()); 
                    // InternalShemaTables.g:306:3: ( 'float' )
                    // InternalShemaTables.g:306:4: 'float'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getColumnDataTypeAccess().getFloatEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalShemaTables.g:310:2: ( ( 'string' ) )
                    {
                    // InternalShemaTables.g:310:2: ( ( 'string' ) )
                    // InternalShemaTables.g:311:3: ( 'string' )
                    {
                     before(grammarAccess.getColumnDataTypeAccess().getStringEnumLiteralDeclaration_2()); 
                    // InternalShemaTables.g:312:3: ( 'string' )
                    // InternalShemaTables.g:312:4: 'string'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getColumnDataTypeAccess().getStringEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__ColumnDataType__Alternatives"


    // $ANTLR start "rule__Tables__Group__0"
    // InternalShemaTables.g:320:1: rule__Tables__Group__0 : rule__Tables__Group__0__Impl rule__Tables__Group__1 ;
    public final void rule__Tables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:324:1: ( rule__Tables__Group__0__Impl rule__Tables__Group__1 )
            // InternalShemaTables.g:325:2: rule__Tables__Group__0__Impl rule__Tables__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Tables__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tables__Group__1();

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
    // $ANTLR end "rule__Tables__Group__0"


    // $ANTLR start "rule__Tables__Group__0__Impl"
    // InternalShemaTables.g:332:1: rule__Tables__Group__0__Impl : ( 'Tables' ) ;
    public final void rule__Tables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:336:1: ( ( 'Tables' ) )
            // InternalShemaTables.g:337:1: ( 'Tables' )
            {
            // InternalShemaTables.g:337:1: ( 'Tables' )
            // InternalShemaTables.g:338:2: 'Tables'
            {
             before(grammarAccess.getTablesAccess().getTablesKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTablesAccess().getTablesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tables__Group__0__Impl"


    // $ANTLR start "rule__Tables__Group__1"
    // InternalShemaTables.g:347:1: rule__Tables__Group__1 : rule__Tables__Group__1__Impl rule__Tables__Group__2 ;
    public final void rule__Tables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:351:1: ( rule__Tables__Group__1__Impl rule__Tables__Group__2 )
            // InternalShemaTables.g:352:2: rule__Tables__Group__1__Impl rule__Tables__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Tables__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tables__Group__2();

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
    // $ANTLR end "rule__Tables__Group__1"


    // $ANTLR start "rule__Tables__Group__1__Impl"
    // InternalShemaTables.g:359:1: rule__Tables__Group__1__Impl : ( ( rule__Tables__NameAssignment_1 ) ) ;
    public final void rule__Tables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:363:1: ( ( ( rule__Tables__NameAssignment_1 ) ) )
            // InternalShemaTables.g:364:1: ( ( rule__Tables__NameAssignment_1 ) )
            {
            // InternalShemaTables.g:364:1: ( ( rule__Tables__NameAssignment_1 ) )
            // InternalShemaTables.g:365:2: ( rule__Tables__NameAssignment_1 )
            {
             before(grammarAccess.getTablesAccess().getNameAssignment_1()); 
            // InternalShemaTables.g:366:2: ( rule__Tables__NameAssignment_1 )
            // InternalShemaTables.g:366:3: rule__Tables__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tables__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTablesAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tables__Group__1__Impl"


    // $ANTLR start "rule__Tables__Group__2"
    // InternalShemaTables.g:374:1: rule__Tables__Group__2 : rule__Tables__Group__2__Impl rule__Tables__Group__3 ;
    public final void rule__Tables__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:378:1: ( rule__Tables__Group__2__Impl rule__Tables__Group__3 )
            // InternalShemaTables.g:379:2: rule__Tables__Group__2__Impl rule__Tables__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Tables__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tables__Group__3();

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
    // $ANTLR end "rule__Tables__Group__2"


    // $ANTLR start "rule__Tables__Group__2__Impl"
    // InternalShemaTables.g:386:1: rule__Tables__Group__2__Impl : ( '{' ) ;
    public final void rule__Tables__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:390:1: ( ( '{' ) )
            // InternalShemaTables.g:391:1: ( '{' )
            {
            // InternalShemaTables.g:391:1: ( '{' )
            // InternalShemaTables.g:392:2: '{'
            {
             before(grammarAccess.getTablesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTablesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tables__Group__2__Impl"


    // $ANTLR start "rule__Tables__Group__3"
    // InternalShemaTables.g:401:1: rule__Tables__Group__3 : rule__Tables__Group__3__Impl rule__Tables__Group__4 ;
    public final void rule__Tables__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:405:1: ( rule__Tables__Group__3__Impl rule__Tables__Group__4 )
            // InternalShemaTables.g:406:2: rule__Tables__Group__3__Impl rule__Tables__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Tables__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tables__Group__4();

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
    // $ANTLR end "rule__Tables__Group__3"


    // $ANTLR start "rule__Tables__Group__3__Impl"
    // InternalShemaTables.g:413:1: rule__Tables__Group__3__Impl : ( 'shematables' ) ;
    public final void rule__Tables__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:417:1: ( ( 'shematables' ) )
            // InternalShemaTables.g:418:1: ( 'shematables' )
            {
            // InternalShemaTables.g:418:1: ( 'shematables' )
            // InternalShemaTables.g:419:2: 'shematables'
            {
             before(grammarAccess.getTablesAccess().getShematablesKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTablesAccess().getShematablesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tables__Group__3__Impl"


    // $ANTLR start "rule__Tables__Group__4"
    // InternalShemaTables.g:428:1: rule__Tables__Group__4 : rule__Tables__Group__4__Impl rule__Tables__Group__5 ;
    public final void rule__Tables__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:432:1: ( rule__Tables__Group__4__Impl rule__Tables__Group__5 )
            // InternalShemaTables.g:433:2: rule__Tables__Group__4__Impl rule__Tables__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Tables__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tables__Group__5();

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
    // $ANTLR end "rule__Tables__Group__4"


    // $ANTLR start "rule__Tables__Group__4__Impl"
    // InternalShemaTables.g:440:1: rule__Tables__Group__4__Impl : ( ( rule__Tables__ShematablesAssignment_4 )* ) ;
    public final void rule__Tables__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:444:1: ( ( ( rule__Tables__ShematablesAssignment_4 )* ) )
            // InternalShemaTables.g:445:1: ( ( rule__Tables__ShematablesAssignment_4 )* )
            {
            // InternalShemaTables.g:445:1: ( ( rule__Tables__ShematablesAssignment_4 )* )
            // InternalShemaTables.g:446:2: ( rule__Tables__ShematablesAssignment_4 )*
            {
             before(grammarAccess.getTablesAccess().getShematablesAssignment_4()); 
            // InternalShemaTables.g:447:2: ( rule__Tables__ShematablesAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalShemaTables.g:447:3: rule__Tables__ShematablesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Tables__ShematablesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getTablesAccess().getShematablesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tables__Group__4__Impl"


    // $ANTLR start "rule__Tables__Group__5"
    // InternalShemaTables.g:455:1: rule__Tables__Group__5 : rule__Tables__Group__5__Impl ;
    public final void rule__Tables__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:459:1: ( rule__Tables__Group__5__Impl )
            // InternalShemaTables.g:460:2: rule__Tables__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tables__Group__5__Impl();

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
    // $ANTLR end "rule__Tables__Group__5"


    // $ANTLR start "rule__Tables__Group__5__Impl"
    // InternalShemaTables.g:466:1: rule__Tables__Group__5__Impl : ( '}' ) ;
    public final void rule__Tables__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:470:1: ( ( '}' ) )
            // InternalShemaTables.g:471:1: ( '}' )
            {
            // InternalShemaTables.g:471:1: ( '}' )
            // InternalShemaTables.g:472:2: '}'
            {
             before(grammarAccess.getTablesAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTablesAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tables__Group__5__Impl"


    // $ANTLR start "rule__ShemaTable__Group__0"
    // InternalShemaTables.g:482:1: rule__ShemaTable__Group__0 : rule__ShemaTable__Group__0__Impl rule__ShemaTable__Group__1 ;
    public final void rule__ShemaTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:486:1: ( rule__ShemaTable__Group__0__Impl rule__ShemaTable__Group__1 )
            // InternalShemaTables.g:487:2: rule__ShemaTable__Group__0__Impl rule__ShemaTable__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ShemaTable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShemaTable__Group__1();

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
    // $ANTLR end "rule__ShemaTable__Group__0"


    // $ANTLR start "rule__ShemaTable__Group__0__Impl"
    // InternalShemaTables.g:494:1: rule__ShemaTable__Group__0__Impl : ( 'ShemaTable' ) ;
    public final void rule__ShemaTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:498:1: ( ( 'ShemaTable' ) )
            // InternalShemaTables.g:499:1: ( 'ShemaTable' )
            {
            // InternalShemaTables.g:499:1: ( 'ShemaTable' )
            // InternalShemaTables.g:500:2: 'ShemaTable'
            {
             before(grammarAccess.getShemaTableAccess().getShemaTableKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getShemaTableAccess().getShemaTableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShemaTable__Group__0__Impl"


    // $ANTLR start "rule__ShemaTable__Group__1"
    // InternalShemaTables.g:509:1: rule__ShemaTable__Group__1 : rule__ShemaTable__Group__1__Impl rule__ShemaTable__Group__2 ;
    public final void rule__ShemaTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:513:1: ( rule__ShemaTable__Group__1__Impl rule__ShemaTable__Group__2 )
            // InternalShemaTables.g:514:2: rule__ShemaTable__Group__1__Impl rule__ShemaTable__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ShemaTable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShemaTable__Group__2();

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
    // $ANTLR end "rule__ShemaTable__Group__1"


    // $ANTLR start "rule__ShemaTable__Group__1__Impl"
    // InternalShemaTables.g:521:1: rule__ShemaTable__Group__1__Impl : ( '{' ) ;
    public final void rule__ShemaTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:525:1: ( ( '{' ) )
            // InternalShemaTables.g:526:1: ( '{' )
            {
            // InternalShemaTables.g:526:1: ( '{' )
            // InternalShemaTables.g:527:2: '{'
            {
             before(grammarAccess.getShemaTableAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getShemaTableAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShemaTable__Group__1__Impl"


    // $ANTLR start "rule__ShemaTable__Group__2"
    // InternalShemaTables.g:536:1: rule__ShemaTable__Group__2 : rule__ShemaTable__Group__2__Impl rule__ShemaTable__Group__3 ;
    public final void rule__ShemaTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:540:1: ( rule__ShemaTable__Group__2__Impl rule__ShemaTable__Group__3 )
            // InternalShemaTables.g:541:2: rule__ShemaTable__Group__2__Impl rule__ShemaTable__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ShemaTable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShemaTable__Group__3();

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
    // $ANTLR end "rule__ShemaTable__Group__2"


    // $ANTLR start "rule__ShemaTable__Group__2__Impl"
    // InternalShemaTables.g:548:1: rule__ShemaTable__Group__2__Impl : ( 'name' ) ;
    public final void rule__ShemaTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:552:1: ( ( 'name' ) )
            // InternalShemaTables.g:553:1: ( 'name' )
            {
            // InternalShemaTables.g:553:1: ( 'name' )
            // InternalShemaTables.g:554:2: 'name'
            {
             before(grammarAccess.getShemaTableAccess().getNameKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getShemaTableAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShemaTable__Group__2__Impl"


    // $ANTLR start "rule__ShemaTable__Group__3"
    // InternalShemaTables.g:563:1: rule__ShemaTable__Group__3 : rule__ShemaTable__Group__3__Impl rule__ShemaTable__Group__4 ;
    public final void rule__ShemaTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:567:1: ( rule__ShemaTable__Group__3__Impl rule__ShemaTable__Group__4 )
            // InternalShemaTables.g:568:2: rule__ShemaTable__Group__3__Impl rule__ShemaTable__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ShemaTable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShemaTable__Group__4();

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
    // $ANTLR end "rule__ShemaTable__Group__3"


    // $ANTLR start "rule__ShemaTable__Group__3__Impl"
    // InternalShemaTables.g:575:1: rule__ShemaTable__Group__3__Impl : ( ( rule__ShemaTable__NameAssignment_3 ) ) ;
    public final void rule__ShemaTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:579:1: ( ( ( rule__ShemaTable__NameAssignment_3 ) ) )
            // InternalShemaTables.g:580:1: ( ( rule__ShemaTable__NameAssignment_3 ) )
            {
            // InternalShemaTables.g:580:1: ( ( rule__ShemaTable__NameAssignment_3 ) )
            // InternalShemaTables.g:581:2: ( rule__ShemaTable__NameAssignment_3 )
            {
             before(grammarAccess.getShemaTableAccess().getNameAssignment_3()); 
            // InternalShemaTables.g:582:2: ( rule__ShemaTable__NameAssignment_3 )
            // InternalShemaTables.g:582:3: rule__ShemaTable__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ShemaTable__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getShemaTableAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShemaTable__Group__3__Impl"


    // $ANTLR start "rule__ShemaTable__Group__4"
    // InternalShemaTables.g:590:1: rule__ShemaTable__Group__4 : rule__ShemaTable__Group__4__Impl rule__ShemaTable__Group__5 ;
    public final void rule__ShemaTable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:594:1: ( rule__ShemaTable__Group__4__Impl rule__ShemaTable__Group__5 )
            // InternalShemaTables.g:595:2: rule__ShemaTable__Group__4__Impl rule__ShemaTable__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__ShemaTable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShemaTable__Group__5();

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
    // $ANTLR end "rule__ShemaTable__Group__4"


    // $ANTLR start "rule__ShemaTable__Group__4__Impl"
    // InternalShemaTables.g:602:1: rule__ShemaTable__Group__4__Impl : ( 'id' ) ;
    public final void rule__ShemaTable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:606:1: ( ( 'id' ) )
            // InternalShemaTables.g:607:1: ( 'id' )
            {
            // InternalShemaTables.g:607:1: ( 'id' )
            // InternalShemaTables.g:608:2: 'id'
            {
             before(grammarAccess.getShemaTableAccess().getIdKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getShemaTableAccess().getIdKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShemaTable__Group__4__Impl"


    // $ANTLR start "rule__ShemaTable__Group__5"
    // InternalShemaTables.g:617:1: rule__ShemaTable__Group__5 : rule__ShemaTable__Group__5__Impl rule__ShemaTable__Group__6 ;
    public final void rule__ShemaTable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:621:1: ( rule__ShemaTable__Group__5__Impl rule__ShemaTable__Group__6 )
            // InternalShemaTables.g:622:2: rule__ShemaTable__Group__5__Impl rule__ShemaTable__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__ShemaTable__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShemaTable__Group__6();

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
    // $ANTLR end "rule__ShemaTable__Group__5"


    // $ANTLR start "rule__ShemaTable__Group__5__Impl"
    // InternalShemaTables.g:629:1: rule__ShemaTable__Group__5__Impl : ( ( rule__ShemaTable__IdAssignment_5 ) ) ;
    public final void rule__ShemaTable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:633:1: ( ( ( rule__ShemaTable__IdAssignment_5 ) ) )
            // InternalShemaTables.g:634:1: ( ( rule__ShemaTable__IdAssignment_5 ) )
            {
            // InternalShemaTables.g:634:1: ( ( rule__ShemaTable__IdAssignment_5 ) )
            // InternalShemaTables.g:635:2: ( rule__ShemaTable__IdAssignment_5 )
            {
             before(grammarAccess.getShemaTableAccess().getIdAssignment_5()); 
            // InternalShemaTables.g:636:2: ( rule__ShemaTable__IdAssignment_5 )
            // InternalShemaTables.g:636:3: rule__ShemaTable__IdAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ShemaTable__IdAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getShemaTableAccess().getIdAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShemaTable__Group__5__Impl"


    // $ANTLR start "rule__ShemaTable__Group__6"
    // InternalShemaTables.g:644:1: rule__ShemaTable__Group__6 : rule__ShemaTable__Group__6__Impl rule__ShemaTable__Group__7 ;
    public final void rule__ShemaTable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:648:1: ( rule__ShemaTable__Group__6__Impl rule__ShemaTable__Group__7 )
            // InternalShemaTables.g:649:2: rule__ShemaTable__Group__6__Impl rule__ShemaTable__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__ShemaTable__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShemaTable__Group__7();

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
    // $ANTLR end "rule__ShemaTable__Group__6"


    // $ANTLR start "rule__ShemaTable__Group__6__Impl"
    // InternalShemaTables.g:656:1: rule__ShemaTable__Group__6__Impl : ( 'columns' ) ;
    public final void rule__ShemaTable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:660:1: ( ( 'columns' ) )
            // InternalShemaTables.g:661:1: ( 'columns' )
            {
            // InternalShemaTables.g:661:1: ( 'columns' )
            // InternalShemaTables.g:662:2: 'columns'
            {
             before(grammarAccess.getShemaTableAccess().getColumnsKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getShemaTableAccess().getColumnsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShemaTable__Group__6__Impl"


    // $ANTLR start "rule__ShemaTable__Group__7"
    // InternalShemaTables.g:671:1: rule__ShemaTable__Group__7 : rule__ShemaTable__Group__7__Impl rule__ShemaTable__Group__8 ;
    public final void rule__ShemaTable__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:675:1: ( rule__ShemaTable__Group__7__Impl rule__ShemaTable__Group__8 )
            // InternalShemaTables.g:676:2: rule__ShemaTable__Group__7__Impl rule__ShemaTable__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__ShemaTable__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShemaTable__Group__8();

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
    // $ANTLR end "rule__ShemaTable__Group__7"


    // $ANTLR start "rule__ShemaTable__Group__7__Impl"
    // InternalShemaTables.g:683:1: rule__ShemaTable__Group__7__Impl : ( ( rule__ShemaTable__ColumnsAssignment_7 )* ) ;
    public final void rule__ShemaTable__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:687:1: ( ( ( rule__ShemaTable__ColumnsAssignment_7 )* ) )
            // InternalShemaTables.g:688:1: ( ( rule__ShemaTable__ColumnsAssignment_7 )* )
            {
            // InternalShemaTables.g:688:1: ( ( rule__ShemaTable__ColumnsAssignment_7 )* )
            // InternalShemaTables.g:689:2: ( rule__ShemaTable__ColumnsAssignment_7 )*
            {
             before(grammarAccess.getShemaTableAccess().getColumnsAssignment_7()); 
            // InternalShemaTables.g:690:2: ( rule__ShemaTable__ColumnsAssignment_7 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalShemaTables.g:690:3: rule__ShemaTable__ColumnsAssignment_7
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__ShemaTable__ColumnsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getShemaTableAccess().getColumnsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShemaTable__Group__7__Impl"


    // $ANTLR start "rule__ShemaTable__Group__8"
    // InternalShemaTables.g:698:1: rule__ShemaTable__Group__8 : rule__ShemaTable__Group__8__Impl rule__ShemaTable__Group__9 ;
    public final void rule__ShemaTable__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:702:1: ( rule__ShemaTable__Group__8__Impl rule__ShemaTable__Group__9 )
            // InternalShemaTables.g:703:2: rule__ShemaTable__Group__8__Impl rule__ShemaTable__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__ShemaTable__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShemaTable__Group__9();

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
    // $ANTLR end "rule__ShemaTable__Group__8"


    // $ANTLR start "rule__ShemaTable__Group__8__Impl"
    // InternalShemaTables.g:710:1: rule__ShemaTable__Group__8__Impl : ( 'catalogue' ) ;
    public final void rule__ShemaTable__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:714:1: ( ( 'catalogue' ) )
            // InternalShemaTables.g:715:1: ( 'catalogue' )
            {
            // InternalShemaTables.g:715:1: ( 'catalogue' )
            // InternalShemaTables.g:716:2: 'catalogue'
            {
             before(grammarAccess.getShemaTableAccess().getCatalogueKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getShemaTableAccess().getCatalogueKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShemaTable__Group__8__Impl"


    // $ANTLR start "rule__ShemaTable__Group__9"
    // InternalShemaTables.g:725:1: rule__ShemaTable__Group__9 : rule__ShemaTable__Group__9__Impl rule__ShemaTable__Group__10 ;
    public final void rule__ShemaTable__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:729:1: ( rule__ShemaTable__Group__9__Impl rule__ShemaTable__Group__10 )
            // InternalShemaTables.g:730:2: rule__ShemaTable__Group__9__Impl rule__ShemaTable__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__ShemaTable__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ShemaTable__Group__10();

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
    // $ANTLR end "rule__ShemaTable__Group__9"


    // $ANTLR start "rule__ShemaTable__Group__9__Impl"
    // InternalShemaTables.g:737:1: rule__ShemaTable__Group__9__Impl : ( ( rule__ShemaTable__CatalogueAssignment_9 ) ) ;
    public final void rule__ShemaTable__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:741:1: ( ( ( rule__ShemaTable__CatalogueAssignment_9 ) ) )
            // InternalShemaTables.g:742:1: ( ( rule__ShemaTable__CatalogueAssignment_9 ) )
            {
            // InternalShemaTables.g:742:1: ( ( rule__ShemaTable__CatalogueAssignment_9 ) )
            // InternalShemaTables.g:743:2: ( rule__ShemaTable__CatalogueAssignment_9 )
            {
             before(grammarAccess.getShemaTableAccess().getCatalogueAssignment_9()); 
            // InternalShemaTables.g:744:2: ( rule__ShemaTable__CatalogueAssignment_9 )
            // InternalShemaTables.g:744:3: rule__ShemaTable__CatalogueAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ShemaTable__CatalogueAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getShemaTableAccess().getCatalogueAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShemaTable__Group__9__Impl"


    // $ANTLR start "rule__ShemaTable__Group__10"
    // InternalShemaTables.g:752:1: rule__ShemaTable__Group__10 : rule__ShemaTable__Group__10__Impl ;
    public final void rule__ShemaTable__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:756:1: ( rule__ShemaTable__Group__10__Impl )
            // InternalShemaTables.g:757:2: rule__ShemaTable__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShemaTable__Group__10__Impl();

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
    // $ANTLR end "rule__ShemaTable__Group__10"


    // $ANTLR start "rule__ShemaTable__Group__10__Impl"
    // InternalShemaTables.g:763:1: rule__ShemaTable__Group__10__Impl : ( '}' ) ;
    public final void rule__ShemaTable__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:767:1: ( ( '}' ) )
            // InternalShemaTables.g:768:1: ( '}' )
            {
            // InternalShemaTables.g:768:1: ( '}' )
            // InternalShemaTables.g:769:2: '}'
            {
             before(grammarAccess.getShemaTableAccess().getRightCurlyBracketKeyword_10()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getShemaTableAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShemaTable__Group__10__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalShemaTables.g:779:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:783:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalShemaTables.g:784:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__1();

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
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // InternalShemaTables.g:791:1: rule__Column__Group__0__Impl : ( 'Column' ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:795:1: ( ( 'Column' ) )
            // InternalShemaTables.g:796:1: ( 'Column' )
            {
            // InternalShemaTables.g:796:1: ( 'Column' )
            // InternalShemaTables.g:797:2: 'Column'
            {
             before(grammarAccess.getColumnAccess().getColumnKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getColumnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // InternalShemaTables.g:806:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:810:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalShemaTables.g:811:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Column__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__2();

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
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // InternalShemaTables.g:818:1: rule__Column__Group__1__Impl : ( '{' ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:822:1: ( ( '{' ) )
            // InternalShemaTables.g:823:1: ( '{' )
            {
            // InternalShemaTables.g:823:1: ( '{' )
            // InternalShemaTables.g:824:2: '{'
            {
             before(grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group__2"
    // InternalShemaTables.g:833:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:837:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // InternalShemaTables.g:838:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Column__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__3();

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
    // $ANTLR end "rule__Column__Group__2"


    // $ANTLR start "rule__Column__Group__2__Impl"
    // InternalShemaTables.g:845:1: rule__Column__Group__2__Impl : ( 'name' ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:849:1: ( ( 'name' ) )
            // InternalShemaTables.g:850:1: ( 'name' )
            {
            // InternalShemaTables.g:850:1: ( 'name' )
            // InternalShemaTables.g:851:2: 'name'
            {
             before(grammarAccess.getColumnAccess().getNameKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2__Impl"


    // $ANTLR start "rule__Column__Group__3"
    // InternalShemaTables.g:860:1: rule__Column__Group__3 : rule__Column__Group__3__Impl rule__Column__Group__4 ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:864:1: ( rule__Column__Group__3__Impl rule__Column__Group__4 )
            // InternalShemaTables.g:865:2: rule__Column__Group__3__Impl rule__Column__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Column__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__4();

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
    // $ANTLR end "rule__Column__Group__3"


    // $ANTLR start "rule__Column__Group__3__Impl"
    // InternalShemaTables.g:872:1: rule__Column__Group__3__Impl : ( ( rule__Column__NameAssignment_3 ) ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:876:1: ( ( ( rule__Column__NameAssignment_3 ) ) )
            // InternalShemaTables.g:877:1: ( ( rule__Column__NameAssignment_3 ) )
            {
            // InternalShemaTables.g:877:1: ( ( rule__Column__NameAssignment_3 ) )
            // InternalShemaTables.g:878:2: ( rule__Column__NameAssignment_3 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_3()); 
            // InternalShemaTables.g:879:2: ( rule__Column__NameAssignment_3 )
            // InternalShemaTables.g:879:3: rule__Column__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Column__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3__Impl"


    // $ANTLR start "rule__Column__Group__4"
    // InternalShemaTables.g:887:1: rule__Column__Group__4 : rule__Column__Group__4__Impl rule__Column__Group__5 ;
    public final void rule__Column__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:891:1: ( rule__Column__Group__4__Impl rule__Column__Group__5 )
            // InternalShemaTables.g:892:2: rule__Column__Group__4__Impl rule__Column__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Column__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__5();

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
    // $ANTLR end "rule__Column__Group__4"


    // $ANTLR start "rule__Column__Group__4__Impl"
    // InternalShemaTables.g:899:1: rule__Column__Group__4__Impl : ( 'id' ) ;
    public final void rule__Column__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:903:1: ( ( 'id' ) )
            // InternalShemaTables.g:904:1: ( 'id' )
            {
            // InternalShemaTables.g:904:1: ( 'id' )
            // InternalShemaTables.g:905:2: 'id'
            {
             before(grammarAccess.getColumnAccess().getIdKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getIdKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__4__Impl"


    // $ANTLR start "rule__Column__Group__5"
    // InternalShemaTables.g:914:1: rule__Column__Group__5 : rule__Column__Group__5__Impl rule__Column__Group__6 ;
    public final void rule__Column__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:918:1: ( rule__Column__Group__5__Impl rule__Column__Group__6 )
            // InternalShemaTables.g:919:2: rule__Column__Group__5__Impl rule__Column__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Column__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__6();

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
    // $ANTLR end "rule__Column__Group__5"


    // $ANTLR start "rule__Column__Group__5__Impl"
    // InternalShemaTables.g:926:1: rule__Column__Group__5__Impl : ( ( rule__Column__IdAssignment_5 ) ) ;
    public final void rule__Column__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:930:1: ( ( ( rule__Column__IdAssignment_5 ) ) )
            // InternalShemaTables.g:931:1: ( ( rule__Column__IdAssignment_5 ) )
            {
            // InternalShemaTables.g:931:1: ( ( rule__Column__IdAssignment_5 ) )
            // InternalShemaTables.g:932:2: ( rule__Column__IdAssignment_5 )
            {
             before(grammarAccess.getColumnAccess().getIdAssignment_5()); 
            // InternalShemaTables.g:933:2: ( rule__Column__IdAssignment_5 )
            // InternalShemaTables.g:933:3: rule__Column__IdAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Column__IdAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getIdAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__5__Impl"


    // $ANTLR start "rule__Column__Group__6"
    // InternalShemaTables.g:941:1: rule__Column__Group__6 : rule__Column__Group__6__Impl rule__Column__Group__7 ;
    public final void rule__Column__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:945:1: ( rule__Column__Group__6__Impl rule__Column__Group__7 )
            // InternalShemaTables.g:946:2: rule__Column__Group__6__Impl rule__Column__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Column__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__7();

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
    // $ANTLR end "rule__Column__Group__6"


    // $ANTLR start "rule__Column__Group__6__Impl"
    // InternalShemaTables.g:953:1: rule__Column__Group__6__Impl : ( 'dataType' ) ;
    public final void rule__Column__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:957:1: ( ( 'dataType' ) )
            // InternalShemaTables.g:958:1: ( 'dataType' )
            {
            // InternalShemaTables.g:958:1: ( 'dataType' )
            // InternalShemaTables.g:959:2: 'dataType'
            {
             before(grammarAccess.getColumnAccess().getDataTypeKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getDataTypeKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__6__Impl"


    // $ANTLR start "rule__Column__Group__7"
    // InternalShemaTables.g:968:1: rule__Column__Group__7 : rule__Column__Group__7__Impl rule__Column__Group__8 ;
    public final void rule__Column__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:972:1: ( rule__Column__Group__7__Impl rule__Column__Group__8 )
            // InternalShemaTables.g:973:2: rule__Column__Group__7__Impl rule__Column__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Column__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__8();

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
    // $ANTLR end "rule__Column__Group__7"


    // $ANTLR start "rule__Column__Group__7__Impl"
    // InternalShemaTables.g:980:1: rule__Column__Group__7__Impl : ( ( rule__Column__DataTypeAssignment_7 ) ) ;
    public final void rule__Column__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:984:1: ( ( ( rule__Column__DataTypeAssignment_7 ) ) )
            // InternalShemaTables.g:985:1: ( ( rule__Column__DataTypeAssignment_7 ) )
            {
            // InternalShemaTables.g:985:1: ( ( rule__Column__DataTypeAssignment_7 ) )
            // InternalShemaTables.g:986:2: ( rule__Column__DataTypeAssignment_7 )
            {
             before(grammarAccess.getColumnAccess().getDataTypeAssignment_7()); 
            // InternalShemaTables.g:987:2: ( rule__Column__DataTypeAssignment_7 )
            // InternalShemaTables.g:987:3: rule__Column__DataTypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Column__DataTypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getDataTypeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__7__Impl"


    // $ANTLR start "rule__Column__Group__8"
    // InternalShemaTables.g:995:1: rule__Column__Group__8 : rule__Column__Group__8__Impl rule__Column__Group__9 ;
    public final void rule__Column__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:999:1: ( rule__Column__Group__8__Impl rule__Column__Group__9 )
            // InternalShemaTables.g:1000:2: rule__Column__Group__8__Impl rule__Column__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__Column__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__9();

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
    // $ANTLR end "rule__Column__Group__8"


    // $ANTLR start "rule__Column__Group__8__Impl"
    // InternalShemaTables.g:1007:1: rule__Column__Group__8__Impl : ( 'constraint' ) ;
    public final void rule__Column__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1011:1: ( ( 'constraint' ) )
            // InternalShemaTables.g:1012:1: ( 'constraint' )
            {
            // InternalShemaTables.g:1012:1: ( 'constraint' )
            // InternalShemaTables.g:1013:2: 'constraint'
            {
             before(grammarAccess.getColumnAccess().getConstraintKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getConstraintKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__8__Impl"


    // $ANTLR start "rule__Column__Group__9"
    // InternalShemaTables.g:1022:1: rule__Column__Group__9 : rule__Column__Group__9__Impl rule__Column__Group__10 ;
    public final void rule__Column__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1026:1: ( rule__Column__Group__9__Impl rule__Column__Group__10 )
            // InternalShemaTables.g:1027:2: rule__Column__Group__9__Impl rule__Column__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__Column__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__10();

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
    // $ANTLR end "rule__Column__Group__9"


    // $ANTLR start "rule__Column__Group__9__Impl"
    // InternalShemaTables.g:1034:1: rule__Column__Group__9__Impl : ( ( rule__Column__ConstraintAssignment_9 ) ) ;
    public final void rule__Column__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1038:1: ( ( ( rule__Column__ConstraintAssignment_9 ) ) )
            // InternalShemaTables.g:1039:1: ( ( rule__Column__ConstraintAssignment_9 ) )
            {
            // InternalShemaTables.g:1039:1: ( ( rule__Column__ConstraintAssignment_9 ) )
            // InternalShemaTables.g:1040:2: ( rule__Column__ConstraintAssignment_9 )
            {
             before(grammarAccess.getColumnAccess().getConstraintAssignment_9()); 
            // InternalShemaTables.g:1041:2: ( rule__Column__ConstraintAssignment_9 )
            // InternalShemaTables.g:1041:3: rule__Column__ConstraintAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Column__ConstraintAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getConstraintAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__9__Impl"


    // $ANTLR start "rule__Column__Group__10"
    // InternalShemaTables.g:1049:1: rule__Column__Group__10 : rule__Column__Group__10__Impl ;
    public final void rule__Column__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1053:1: ( rule__Column__Group__10__Impl )
            // InternalShemaTables.g:1054:2: rule__Column__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__10__Impl();

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
    // $ANTLR end "rule__Column__Group__10"


    // $ANTLR start "rule__Column__Group__10__Impl"
    // InternalShemaTables.g:1060:1: rule__Column__Group__10__Impl : ( '}' ) ;
    public final void rule__Column__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1064:1: ( ( '}' ) )
            // InternalShemaTables.g:1065:1: ( '}' )
            {
            // InternalShemaTables.g:1065:1: ( '}' )
            // InternalShemaTables.g:1066:2: '}'
            {
             before(grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_10()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__10__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalShemaTables.g:1076:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1080:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalShemaTables.g:1081:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1();

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
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalShemaTables.g:1088:1: rule__Constraint__Group__0__Impl : ( 'Constraint' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1092:1: ( ( 'Constraint' ) )
            // InternalShemaTables.g:1093:1: ( 'Constraint' )
            {
            // InternalShemaTables.g:1093:1: ( 'Constraint' )
            // InternalShemaTables.g:1094:2: 'Constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getConstraintKeyword_0()); 

            }


            }

        }
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
    // InternalShemaTables.g:1103:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1107:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalShemaTables.g:1108:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2();

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
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalShemaTables.g:1115:1: rule__Constraint__Group__1__Impl : ( '{' ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1119:1: ( ( '{' ) )
            // InternalShemaTables.g:1120:1: ( '{' )
            {
            // InternalShemaTables.g:1120:1: ( '{' )
            // InternalShemaTables.g:1121:2: '{'
            {
             before(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Constraint__Group__2"
    // InternalShemaTables.g:1130:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1134:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalShemaTables.g:1135:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Constraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__3();

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
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // InternalShemaTables.g:1142:1: rule__Constraint__Group__2__Impl : ( 'filePath' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1146:1: ( ( 'filePath' ) )
            // InternalShemaTables.g:1147:1: ( 'filePath' )
            {
            // InternalShemaTables.g:1147:1: ( 'filePath' )
            // InternalShemaTables.g:1148:2: 'filePath'
            {
             before(grammarAccess.getConstraintAccess().getFilePathKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getFilePathKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__3"
    // InternalShemaTables.g:1157:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1161:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalShemaTables.g:1162:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Constraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__4();

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
    // $ANTLR end "rule__Constraint__Group__3"


    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // InternalShemaTables.g:1169:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__FilePathAssignment_3 ) ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1173:1: ( ( ( rule__Constraint__FilePathAssignment_3 ) ) )
            // InternalShemaTables.g:1174:1: ( ( rule__Constraint__FilePathAssignment_3 ) )
            {
            // InternalShemaTables.g:1174:1: ( ( rule__Constraint__FilePathAssignment_3 ) )
            // InternalShemaTables.g:1175:2: ( rule__Constraint__FilePathAssignment_3 )
            {
             before(grammarAccess.getConstraintAccess().getFilePathAssignment_3()); 
            // InternalShemaTables.g:1176:2: ( rule__Constraint__FilePathAssignment_3 )
            // InternalShemaTables.g:1176:3: rule__Constraint__FilePathAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__FilePathAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getFilePathAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3__Impl"


    // $ANTLR start "rule__Constraint__Group__4"
    // InternalShemaTables.g:1184:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1188:1: ( rule__Constraint__Group__4__Impl )
            // InternalShemaTables.g:1189:2: rule__Constraint__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__4__Impl();

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
    // $ANTLR end "rule__Constraint__Group__4"


    // $ANTLR start "rule__Constraint__Group__4__Impl"
    // InternalShemaTables.g:1195:1: rule__Constraint__Group__4__Impl : ( '}' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1199:1: ( ( '}' ) )
            // InternalShemaTables.g:1200:1: ( '}' )
            {
            // InternalShemaTables.g:1200:1: ( '}' )
            // InternalShemaTables.g:1201:2: '}'
            {
             before(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__4__Impl"


    // $ANTLR start "rule__Catalogue__Group__0"
    // InternalShemaTables.g:1211:1: rule__Catalogue__Group__0 : rule__Catalogue__Group__0__Impl rule__Catalogue__Group__1 ;
    public final void rule__Catalogue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1215:1: ( rule__Catalogue__Group__0__Impl rule__Catalogue__Group__1 )
            // InternalShemaTables.g:1216:2: rule__Catalogue__Group__0__Impl rule__Catalogue__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Catalogue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Catalogue__Group__1();

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
    // $ANTLR end "rule__Catalogue__Group__0"


    // $ANTLR start "rule__Catalogue__Group__0__Impl"
    // InternalShemaTables.g:1223:1: rule__Catalogue__Group__0__Impl : ( 'Catalogue' ) ;
    public final void rule__Catalogue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1227:1: ( ( 'Catalogue' ) )
            // InternalShemaTables.g:1228:1: ( 'Catalogue' )
            {
            // InternalShemaTables.g:1228:1: ( 'Catalogue' )
            // InternalShemaTables.g:1229:2: 'Catalogue'
            {
             before(grammarAccess.getCatalogueAccess().getCatalogueKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCatalogueAccess().getCatalogueKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogue__Group__0__Impl"


    // $ANTLR start "rule__Catalogue__Group__1"
    // InternalShemaTables.g:1238:1: rule__Catalogue__Group__1 : rule__Catalogue__Group__1__Impl rule__Catalogue__Group__2 ;
    public final void rule__Catalogue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1242:1: ( rule__Catalogue__Group__1__Impl rule__Catalogue__Group__2 )
            // InternalShemaTables.g:1243:2: rule__Catalogue__Group__1__Impl rule__Catalogue__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Catalogue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Catalogue__Group__2();

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
    // $ANTLR end "rule__Catalogue__Group__1"


    // $ANTLR start "rule__Catalogue__Group__1__Impl"
    // InternalShemaTables.g:1250:1: rule__Catalogue__Group__1__Impl : ( '{' ) ;
    public final void rule__Catalogue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1254:1: ( ( '{' ) )
            // InternalShemaTables.g:1255:1: ( '{' )
            {
            // InternalShemaTables.g:1255:1: ( '{' )
            // InternalShemaTables.g:1256:2: '{'
            {
             before(grammarAccess.getCatalogueAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCatalogueAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogue__Group__1__Impl"


    // $ANTLR start "rule__Catalogue__Group__2"
    // InternalShemaTables.g:1265:1: rule__Catalogue__Group__2 : rule__Catalogue__Group__2__Impl rule__Catalogue__Group__3 ;
    public final void rule__Catalogue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1269:1: ( rule__Catalogue__Group__2__Impl rule__Catalogue__Group__3 )
            // InternalShemaTables.g:1270:2: rule__Catalogue__Group__2__Impl rule__Catalogue__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Catalogue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Catalogue__Group__3();

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
    // $ANTLR end "rule__Catalogue__Group__2"


    // $ANTLR start "rule__Catalogue__Group__2__Impl"
    // InternalShemaTables.g:1277:1: rule__Catalogue__Group__2__Impl : ( 'name' ) ;
    public final void rule__Catalogue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1281:1: ( ( 'name' ) )
            // InternalShemaTables.g:1282:1: ( 'name' )
            {
            // InternalShemaTables.g:1282:1: ( 'name' )
            // InternalShemaTables.g:1283:2: 'name'
            {
             before(grammarAccess.getCatalogueAccess().getNameKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCatalogueAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogue__Group__2__Impl"


    // $ANTLR start "rule__Catalogue__Group__3"
    // InternalShemaTables.g:1292:1: rule__Catalogue__Group__3 : rule__Catalogue__Group__3__Impl rule__Catalogue__Group__4 ;
    public final void rule__Catalogue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1296:1: ( rule__Catalogue__Group__3__Impl rule__Catalogue__Group__4 )
            // InternalShemaTables.g:1297:2: rule__Catalogue__Group__3__Impl rule__Catalogue__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Catalogue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Catalogue__Group__4();

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
    // $ANTLR end "rule__Catalogue__Group__3"


    // $ANTLR start "rule__Catalogue__Group__3__Impl"
    // InternalShemaTables.g:1304:1: rule__Catalogue__Group__3__Impl : ( ( rule__Catalogue__NameAssignment_3 ) ) ;
    public final void rule__Catalogue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1308:1: ( ( ( rule__Catalogue__NameAssignment_3 ) ) )
            // InternalShemaTables.g:1309:1: ( ( rule__Catalogue__NameAssignment_3 ) )
            {
            // InternalShemaTables.g:1309:1: ( ( rule__Catalogue__NameAssignment_3 ) )
            // InternalShemaTables.g:1310:2: ( rule__Catalogue__NameAssignment_3 )
            {
             before(grammarAccess.getCatalogueAccess().getNameAssignment_3()); 
            // InternalShemaTables.g:1311:2: ( rule__Catalogue__NameAssignment_3 )
            // InternalShemaTables.g:1311:3: rule__Catalogue__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Catalogue__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCatalogueAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogue__Group__3__Impl"


    // $ANTLR start "rule__Catalogue__Group__4"
    // InternalShemaTables.g:1319:1: rule__Catalogue__Group__4 : rule__Catalogue__Group__4__Impl rule__Catalogue__Group__5 ;
    public final void rule__Catalogue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1323:1: ( rule__Catalogue__Group__4__Impl rule__Catalogue__Group__5 )
            // InternalShemaTables.g:1324:2: rule__Catalogue__Group__4__Impl rule__Catalogue__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Catalogue__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Catalogue__Group__5();

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
    // $ANTLR end "rule__Catalogue__Group__4"


    // $ANTLR start "rule__Catalogue__Group__4__Impl"
    // InternalShemaTables.g:1331:1: rule__Catalogue__Group__4__Impl : ( 'algorithms' ) ;
    public final void rule__Catalogue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1335:1: ( ( 'algorithms' ) )
            // InternalShemaTables.g:1336:1: ( 'algorithms' )
            {
            // InternalShemaTables.g:1336:1: ( 'algorithms' )
            // InternalShemaTables.g:1337:2: 'algorithms'
            {
             before(grammarAccess.getCatalogueAccess().getAlgorithmsKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCatalogueAccess().getAlgorithmsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogue__Group__4__Impl"


    // $ANTLR start "rule__Catalogue__Group__5"
    // InternalShemaTables.g:1346:1: rule__Catalogue__Group__5 : rule__Catalogue__Group__5__Impl rule__Catalogue__Group__6 ;
    public final void rule__Catalogue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1350:1: ( rule__Catalogue__Group__5__Impl rule__Catalogue__Group__6 )
            // InternalShemaTables.g:1351:2: rule__Catalogue__Group__5__Impl rule__Catalogue__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__Catalogue__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Catalogue__Group__6();

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
    // $ANTLR end "rule__Catalogue__Group__5"


    // $ANTLR start "rule__Catalogue__Group__5__Impl"
    // InternalShemaTables.g:1358:1: rule__Catalogue__Group__5__Impl : ( ( rule__Catalogue__AlgorithmsAssignment_5 )* ) ;
    public final void rule__Catalogue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1362:1: ( ( ( rule__Catalogue__AlgorithmsAssignment_5 )* ) )
            // InternalShemaTables.g:1363:1: ( ( rule__Catalogue__AlgorithmsAssignment_5 )* )
            {
            // InternalShemaTables.g:1363:1: ( ( rule__Catalogue__AlgorithmsAssignment_5 )* )
            // InternalShemaTables.g:1364:2: ( rule__Catalogue__AlgorithmsAssignment_5 )*
            {
             before(grammarAccess.getCatalogueAccess().getAlgorithmsAssignment_5()); 
            // InternalShemaTables.g:1365:2: ( rule__Catalogue__AlgorithmsAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==30) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalShemaTables.g:1365:3: rule__Catalogue__AlgorithmsAssignment_5
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Catalogue__AlgorithmsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCatalogueAccess().getAlgorithmsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogue__Group__5__Impl"


    // $ANTLR start "rule__Catalogue__Group__6"
    // InternalShemaTables.g:1373:1: rule__Catalogue__Group__6 : rule__Catalogue__Group__6__Impl ;
    public final void rule__Catalogue__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1377:1: ( rule__Catalogue__Group__6__Impl )
            // InternalShemaTables.g:1378:2: rule__Catalogue__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Catalogue__Group__6__Impl();

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
    // $ANTLR end "rule__Catalogue__Group__6"


    // $ANTLR start "rule__Catalogue__Group__6__Impl"
    // InternalShemaTables.g:1384:1: rule__Catalogue__Group__6__Impl : ( '}' ) ;
    public final void rule__Catalogue__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1388:1: ( ( '}' ) )
            // InternalShemaTables.g:1389:1: ( '}' )
            {
            // InternalShemaTables.g:1389:1: ( '}' )
            // InternalShemaTables.g:1390:2: '}'
            {
             before(grammarAccess.getCatalogueAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCatalogueAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogue__Group__6__Impl"


    // $ANTLR start "rule__Algorithm__Group__0"
    // InternalShemaTables.g:1400:1: rule__Algorithm__Group__0 : rule__Algorithm__Group__0__Impl rule__Algorithm__Group__1 ;
    public final void rule__Algorithm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1404:1: ( rule__Algorithm__Group__0__Impl rule__Algorithm__Group__1 )
            // InternalShemaTables.g:1405:2: rule__Algorithm__Group__0__Impl rule__Algorithm__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Algorithm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__1();

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
    // $ANTLR end "rule__Algorithm__Group__0"


    // $ANTLR start "rule__Algorithm__Group__0__Impl"
    // InternalShemaTables.g:1412:1: rule__Algorithm__Group__0__Impl : ( 'Algorithm' ) ;
    public final void rule__Algorithm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1416:1: ( ( 'Algorithm' ) )
            // InternalShemaTables.g:1417:1: ( 'Algorithm' )
            {
            // InternalShemaTables.g:1417:1: ( 'Algorithm' )
            // InternalShemaTables.g:1418:2: 'Algorithm'
            {
             before(grammarAccess.getAlgorithmAccess().getAlgorithmKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getAlgorithmKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__0__Impl"


    // $ANTLR start "rule__Algorithm__Group__1"
    // InternalShemaTables.g:1427:1: rule__Algorithm__Group__1 : rule__Algorithm__Group__1__Impl rule__Algorithm__Group__2 ;
    public final void rule__Algorithm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1431:1: ( rule__Algorithm__Group__1__Impl rule__Algorithm__Group__2 )
            // InternalShemaTables.g:1432:2: rule__Algorithm__Group__1__Impl rule__Algorithm__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Algorithm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__2();

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
    // $ANTLR end "rule__Algorithm__Group__1"


    // $ANTLR start "rule__Algorithm__Group__1__Impl"
    // InternalShemaTables.g:1439:1: rule__Algorithm__Group__1__Impl : ( '{' ) ;
    public final void rule__Algorithm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1443:1: ( ( '{' ) )
            // InternalShemaTables.g:1444:1: ( '{' )
            {
            // InternalShemaTables.g:1444:1: ( '{' )
            // InternalShemaTables.g:1445:2: '{'
            {
             before(grammarAccess.getAlgorithmAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__1__Impl"


    // $ANTLR start "rule__Algorithm__Group__2"
    // InternalShemaTables.g:1454:1: rule__Algorithm__Group__2 : rule__Algorithm__Group__2__Impl rule__Algorithm__Group__3 ;
    public final void rule__Algorithm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1458:1: ( rule__Algorithm__Group__2__Impl rule__Algorithm__Group__3 )
            // InternalShemaTables.g:1459:2: rule__Algorithm__Group__2__Impl rule__Algorithm__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Algorithm__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__3();

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
    // $ANTLR end "rule__Algorithm__Group__2"


    // $ANTLR start "rule__Algorithm__Group__2__Impl"
    // InternalShemaTables.g:1466:1: rule__Algorithm__Group__2__Impl : ( 'name' ) ;
    public final void rule__Algorithm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1470:1: ( ( 'name' ) )
            // InternalShemaTables.g:1471:1: ( 'name' )
            {
            // InternalShemaTables.g:1471:1: ( 'name' )
            // InternalShemaTables.g:1472:2: 'name'
            {
             before(grammarAccess.getAlgorithmAccess().getNameKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__2__Impl"


    // $ANTLR start "rule__Algorithm__Group__3"
    // InternalShemaTables.g:1481:1: rule__Algorithm__Group__3 : rule__Algorithm__Group__3__Impl rule__Algorithm__Group__4 ;
    public final void rule__Algorithm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1485:1: ( rule__Algorithm__Group__3__Impl rule__Algorithm__Group__4 )
            // InternalShemaTables.g:1486:2: rule__Algorithm__Group__3__Impl rule__Algorithm__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Algorithm__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__4();

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
    // $ANTLR end "rule__Algorithm__Group__3"


    // $ANTLR start "rule__Algorithm__Group__3__Impl"
    // InternalShemaTables.g:1493:1: rule__Algorithm__Group__3__Impl : ( ( rule__Algorithm__NameAssignment_3 ) ) ;
    public final void rule__Algorithm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1497:1: ( ( ( rule__Algorithm__NameAssignment_3 ) ) )
            // InternalShemaTables.g:1498:1: ( ( rule__Algorithm__NameAssignment_3 ) )
            {
            // InternalShemaTables.g:1498:1: ( ( rule__Algorithm__NameAssignment_3 ) )
            // InternalShemaTables.g:1499:2: ( rule__Algorithm__NameAssignment_3 )
            {
             before(grammarAccess.getAlgorithmAccess().getNameAssignment_3()); 
            // InternalShemaTables.g:1500:2: ( rule__Algorithm__NameAssignment_3 )
            // InternalShemaTables.g:1500:3: rule__Algorithm__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__3__Impl"


    // $ANTLR start "rule__Algorithm__Group__4"
    // InternalShemaTables.g:1508:1: rule__Algorithm__Group__4 : rule__Algorithm__Group__4__Impl rule__Algorithm__Group__5 ;
    public final void rule__Algorithm__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1512:1: ( rule__Algorithm__Group__4__Impl rule__Algorithm__Group__5 )
            // InternalShemaTables.g:1513:2: rule__Algorithm__Group__4__Impl rule__Algorithm__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Algorithm__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__5();

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
    // $ANTLR end "rule__Algorithm__Group__4"


    // $ANTLR start "rule__Algorithm__Group__4__Impl"
    // InternalShemaTables.g:1520:1: rule__Algorithm__Group__4__Impl : ( 'path' ) ;
    public final void rule__Algorithm__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1524:1: ( ( 'path' ) )
            // InternalShemaTables.g:1525:1: ( 'path' )
            {
            // InternalShemaTables.g:1525:1: ( 'path' )
            // InternalShemaTables.g:1526:2: 'path'
            {
             before(grammarAccess.getAlgorithmAccess().getPathKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getPathKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__4__Impl"


    // $ANTLR start "rule__Algorithm__Group__5"
    // InternalShemaTables.g:1535:1: rule__Algorithm__Group__5 : rule__Algorithm__Group__5__Impl rule__Algorithm__Group__6 ;
    public final void rule__Algorithm__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1539:1: ( rule__Algorithm__Group__5__Impl rule__Algorithm__Group__6 )
            // InternalShemaTables.g:1540:2: rule__Algorithm__Group__5__Impl rule__Algorithm__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__Algorithm__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__6();

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
    // $ANTLR end "rule__Algorithm__Group__5"


    // $ANTLR start "rule__Algorithm__Group__5__Impl"
    // InternalShemaTables.g:1547:1: rule__Algorithm__Group__5__Impl : ( ( rule__Algorithm__PathAssignment_5 ) ) ;
    public final void rule__Algorithm__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1551:1: ( ( ( rule__Algorithm__PathAssignment_5 ) ) )
            // InternalShemaTables.g:1552:1: ( ( rule__Algorithm__PathAssignment_5 ) )
            {
            // InternalShemaTables.g:1552:1: ( ( rule__Algorithm__PathAssignment_5 ) )
            // InternalShemaTables.g:1553:2: ( rule__Algorithm__PathAssignment_5 )
            {
             before(grammarAccess.getAlgorithmAccess().getPathAssignment_5()); 
            // InternalShemaTables.g:1554:2: ( rule__Algorithm__PathAssignment_5 )
            // InternalShemaTables.g:1554:3: rule__Algorithm__PathAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__PathAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmAccess().getPathAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__5__Impl"


    // $ANTLR start "rule__Algorithm__Group__6"
    // InternalShemaTables.g:1562:1: rule__Algorithm__Group__6 : rule__Algorithm__Group__6__Impl rule__Algorithm__Group__7 ;
    public final void rule__Algorithm__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1566:1: ( rule__Algorithm__Group__6__Impl rule__Algorithm__Group__7 )
            // InternalShemaTables.g:1567:2: rule__Algorithm__Group__6__Impl rule__Algorithm__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__Algorithm__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__7();

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
    // $ANTLR end "rule__Algorithm__Group__6"


    // $ANTLR start "rule__Algorithm__Group__6__Impl"
    // InternalShemaTables.g:1574:1: rule__Algorithm__Group__6__Impl : ( 'output' ) ;
    public final void rule__Algorithm__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1578:1: ( ( 'output' ) )
            // InternalShemaTables.g:1579:1: ( 'output' )
            {
            // InternalShemaTables.g:1579:1: ( 'output' )
            // InternalShemaTables.g:1580:2: 'output'
            {
             before(grammarAccess.getAlgorithmAccess().getOutputKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getOutputKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__6__Impl"


    // $ANTLR start "rule__Algorithm__Group__7"
    // InternalShemaTables.g:1589:1: rule__Algorithm__Group__7 : rule__Algorithm__Group__7__Impl rule__Algorithm__Group__8 ;
    public final void rule__Algorithm__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1593:1: ( rule__Algorithm__Group__7__Impl rule__Algorithm__Group__8 )
            // InternalShemaTables.g:1594:2: rule__Algorithm__Group__7__Impl rule__Algorithm__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__Algorithm__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__8();

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
    // $ANTLR end "rule__Algorithm__Group__7"


    // $ANTLR start "rule__Algorithm__Group__7__Impl"
    // InternalShemaTables.g:1601:1: rule__Algorithm__Group__7__Impl : ( ( rule__Algorithm__OutputAssignment_7 ) ) ;
    public final void rule__Algorithm__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1605:1: ( ( ( rule__Algorithm__OutputAssignment_7 ) ) )
            // InternalShemaTables.g:1606:1: ( ( rule__Algorithm__OutputAssignment_7 ) )
            {
            // InternalShemaTables.g:1606:1: ( ( rule__Algorithm__OutputAssignment_7 ) )
            // InternalShemaTables.g:1607:2: ( rule__Algorithm__OutputAssignment_7 )
            {
             before(grammarAccess.getAlgorithmAccess().getOutputAssignment_7()); 
            // InternalShemaTables.g:1608:2: ( rule__Algorithm__OutputAssignment_7 )
            // InternalShemaTables.g:1608:3: rule__Algorithm__OutputAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__OutputAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmAccess().getOutputAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__7__Impl"


    // $ANTLR start "rule__Algorithm__Group__8"
    // InternalShemaTables.g:1616:1: rule__Algorithm__Group__8 : rule__Algorithm__Group__8__Impl rule__Algorithm__Group__9 ;
    public final void rule__Algorithm__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1620:1: ( rule__Algorithm__Group__8__Impl rule__Algorithm__Group__9 )
            // InternalShemaTables.g:1621:2: rule__Algorithm__Group__8__Impl rule__Algorithm__Group__9
            {
            pushFollow(FOLLOW_30);
            rule__Algorithm__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__9();

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
    // $ANTLR end "rule__Algorithm__Group__8"


    // $ANTLR start "rule__Algorithm__Group__8__Impl"
    // InternalShemaTables.g:1628:1: rule__Algorithm__Group__8__Impl : ( 'input' ) ;
    public final void rule__Algorithm__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1632:1: ( ( 'input' ) )
            // InternalShemaTables.g:1633:1: ( 'input' )
            {
            // InternalShemaTables.g:1633:1: ( 'input' )
            // InternalShemaTables.g:1634:2: 'input'
            {
             before(grammarAccess.getAlgorithmAccess().getInputKeyword_8()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getInputKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__8__Impl"


    // $ANTLR start "rule__Algorithm__Group__9"
    // InternalShemaTables.g:1643:1: rule__Algorithm__Group__9 : rule__Algorithm__Group__9__Impl rule__Algorithm__Group__10 ;
    public final void rule__Algorithm__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1647:1: ( rule__Algorithm__Group__9__Impl rule__Algorithm__Group__10 )
            // InternalShemaTables.g:1648:2: rule__Algorithm__Group__9__Impl rule__Algorithm__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__Algorithm__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__10();

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
    // $ANTLR end "rule__Algorithm__Group__9"


    // $ANTLR start "rule__Algorithm__Group__9__Impl"
    // InternalShemaTables.g:1655:1: rule__Algorithm__Group__9__Impl : ( ( rule__Algorithm__InputAssignment_9 ) ) ;
    public final void rule__Algorithm__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1659:1: ( ( ( rule__Algorithm__InputAssignment_9 ) ) )
            // InternalShemaTables.g:1660:1: ( ( rule__Algorithm__InputAssignment_9 ) )
            {
            // InternalShemaTables.g:1660:1: ( ( rule__Algorithm__InputAssignment_9 ) )
            // InternalShemaTables.g:1661:2: ( rule__Algorithm__InputAssignment_9 )
            {
             before(grammarAccess.getAlgorithmAccess().getInputAssignment_9()); 
            // InternalShemaTables.g:1662:2: ( rule__Algorithm__InputAssignment_9 )
            // InternalShemaTables.g:1662:3: rule__Algorithm__InputAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__InputAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmAccess().getInputAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__9__Impl"


    // $ANTLR start "rule__Algorithm__Group__10"
    // InternalShemaTables.g:1670:1: rule__Algorithm__Group__10 : rule__Algorithm__Group__10__Impl ;
    public final void rule__Algorithm__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1674:1: ( rule__Algorithm__Group__10__Impl )
            // InternalShemaTables.g:1675:2: rule__Algorithm__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__Group__10__Impl();

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
    // $ANTLR end "rule__Algorithm__Group__10"


    // $ANTLR start "rule__Algorithm__Group__10__Impl"
    // InternalShemaTables.g:1681:1: rule__Algorithm__Group__10__Impl : ( '}' ) ;
    public final void rule__Algorithm__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1685:1: ( ( '}' ) )
            // InternalShemaTables.g:1686:1: ( '}' )
            {
            // InternalShemaTables.g:1686:1: ( '}' )
            // InternalShemaTables.g:1687:2: '}'
            {
             before(grammarAccess.getAlgorithmAccess().getRightCurlyBracketKeyword_10()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Group__10__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // InternalShemaTables.g:1697:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1701:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalShemaTables.g:1702:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__1();

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
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // InternalShemaTables.g:1709:1: rule__Input__Group__0__Impl : ( 'Input' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1713:1: ( ( 'Input' ) )
            // InternalShemaTables.g:1714:1: ( 'Input' )
            {
            // InternalShemaTables.g:1714:1: ( 'Input' )
            // InternalShemaTables.g:1715:2: 'Input'
            {
             before(grammarAccess.getInputAccess().getInputKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getInputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // InternalShemaTables.g:1724:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1728:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalShemaTables.g:1729:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__2();

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
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // InternalShemaTables.g:1736:1: rule__Input__Group__1__Impl : ( '{' ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1740:1: ( ( '{' ) )
            // InternalShemaTables.g:1741:1: ( '{' )
            {
            // InternalShemaTables.g:1741:1: ( '{' )
            // InternalShemaTables.g:1742:2: '{'
            {
             before(grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__2"
    // InternalShemaTables.g:1751:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1755:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalShemaTables.g:1756:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Input__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__3();

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
    // $ANTLR end "rule__Input__Group__2"


    // $ANTLR start "rule__Input__Group__2__Impl"
    // InternalShemaTables.g:1763:1: rule__Input__Group__2__Impl : ( 'constante' ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1767:1: ( ( 'constante' ) )
            // InternalShemaTables.g:1768:1: ( 'constante' )
            {
            // InternalShemaTables.g:1768:1: ( 'constante' )
            // InternalShemaTables.g:1769:2: 'constante'
            {
             before(grammarAccess.getInputAccess().getConstanteKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getConstanteKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2__Impl"


    // $ANTLR start "rule__Input__Group__3"
    // InternalShemaTables.g:1778:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1782:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // InternalShemaTables.g:1783:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Input__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__4();

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
    // $ANTLR end "rule__Input__Group__3"


    // $ANTLR start "rule__Input__Group__3__Impl"
    // InternalShemaTables.g:1790:1: rule__Input__Group__3__Impl : ( ( rule__Input__ConstanteAssignment_3 ) ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1794:1: ( ( ( rule__Input__ConstanteAssignment_3 ) ) )
            // InternalShemaTables.g:1795:1: ( ( rule__Input__ConstanteAssignment_3 ) )
            {
            // InternalShemaTables.g:1795:1: ( ( rule__Input__ConstanteAssignment_3 ) )
            // InternalShemaTables.g:1796:2: ( rule__Input__ConstanteAssignment_3 )
            {
             before(grammarAccess.getInputAccess().getConstanteAssignment_3()); 
            // InternalShemaTables.g:1797:2: ( rule__Input__ConstanteAssignment_3 )
            // InternalShemaTables.g:1797:3: rule__Input__ConstanteAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Input__ConstanteAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getConstanteAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3__Impl"


    // $ANTLR start "rule__Input__Group__4"
    // InternalShemaTables.g:1805:1: rule__Input__Group__4 : rule__Input__Group__4__Impl rule__Input__Group__5 ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1809:1: ( rule__Input__Group__4__Impl rule__Input__Group__5 )
            // InternalShemaTables.g:1810:2: rule__Input__Group__4__Impl rule__Input__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__Input__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__5();

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
    // $ANTLR end "rule__Input__Group__4"


    // $ANTLR start "rule__Input__Group__4__Impl"
    // InternalShemaTables.g:1817:1: rule__Input__Group__4__Impl : ( 'columns' ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1821:1: ( ( 'columns' ) )
            // InternalShemaTables.g:1822:1: ( 'columns' )
            {
            // InternalShemaTables.g:1822:1: ( 'columns' )
            // InternalShemaTables.g:1823:2: 'columns'
            {
             before(grammarAccess.getInputAccess().getColumnsKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getColumnsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__4__Impl"


    // $ANTLR start "rule__Input__Group__5"
    // InternalShemaTables.g:1832:1: rule__Input__Group__5 : rule__Input__Group__5__Impl rule__Input__Group__6 ;
    public final void rule__Input__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1836:1: ( rule__Input__Group__5__Impl rule__Input__Group__6 )
            // InternalShemaTables.g:1837:2: rule__Input__Group__5__Impl rule__Input__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__Input__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__6();

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
    // $ANTLR end "rule__Input__Group__5"


    // $ANTLR start "rule__Input__Group__5__Impl"
    // InternalShemaTables.g:1844:1: rule__Input__Group__5__Impl : ( ( rule__Input__ColumnsAssignment_5 )* ) ;
    public final void rule__Input__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1848:1: ( ( ( rule__Input__ColumnsAssignment_5 )* ) )
            // InternalShemaTables.g:1849:1: ( ( rule__Input__ColumnsAssignment_5 )* )
            {
            // InternalShemaTables.g:1849:1: ( ( rule__Input__ColumnsAssignment_5 )* )
            // InternalShemaTables.g:1850:2: ( rule__Input__ColumnsAssignment_5 )*
            {
             before(grammarAccess.getInputAccess().getColumnsAssignment_5()); 
            // InternalShemaTables.g:1851:2: ( rule__Input__ColumnsAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalShemaTables.g:1851:3: rule__Input__ColumnsAssignment_5
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Input__ColumnsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getInputAccess().getColumnsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__5__Impl"


    // $ANTLR start "rule__Input__Group__6"
    // InternalShemaTables.g:1859:1: rule__Input__Group__6 : rule__Input__Group__6__Impl ;
    public final void rule__Input__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1863:1: ( rule__Input__Group__6__Impl )
            // InternalShemaTables.g:1864:2: rule__Input__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__6__Impl();

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
    // $ANTLR end "rule__Input__Group__6"


    // $ANTLR start "rule__Input__Group__6__Impl"
    // InternalShemaTables.g:1870:1: rule__Input__Group__6__Impl : ( '}' ) ;
    public final void rule__Input__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1874:1: ( ( '}' ) )
            // InternalShemaTables.g:1875:1: ( '}' )
            {
            // InternalShemaTables.g:1875:1: ( '}' )
            // InternalShemaTables.g:1876:2: '}'
            {
             before(grammarAccess.getInputAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__6__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // InternalShemaTables.g:1886:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1890:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalShemaTables.g:1891:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Output__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__1();

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
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // InternalShemaTables.g:1898:1: rule__Output__Group__0__Impl : ( 'Output' ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1902:1: ( ( 'Output' ) )
            // InternalShemaTables.g:1903:1: ( 'Output' )
            {
            // InternalShemaTables.g:1903:1: ( 'Output' )
            // InternalShemaTables.g:1904:2: 'Output'
            {
             before(grammarAccess.getOutputAccess().getOutputKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getOutputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // InternalShemaTables.g:1913:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1917:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalShemaTables.g:1918:2: rule__Output__Group__1__Impl rule__Output__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Output__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__2();

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
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // InternalShemaTables.g:1925:1: rule__Output__Group__1__Impl : ( '{' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1929:1: ( ( '{' ) )
            // InternalShemaTables.g:1930:1: ( '{' )
            {
            // InternalShemaTables.g:1930:1: ( '{' )
            // InternalShemaTables.g:1931:2: '{'
            {
             before(grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__Output__Group__2"
    // InternalShemaTables.g:1940:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1944:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalShemaTables.g:1945:2: rule__Output__Group__2__Impl rule__Output__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Output__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__3();

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
    // $ANTLR end "rule__Output__Group__2"


    // $ANTLR start "rule__Output__Group__2__Impl"
    // InternalShemaTables.g:1952:1: rule__Output__Group__2__Impl : ( 'name' ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1956:1: ( ( 'name' ) )
            // InternalShemaTables.g:1957:1: ( 'name' )
            {
            // InternalShemaTables.g:1957:1: ( 'name' )
            // InternalShemaTables.g:1958:2: 'name'
            {
             before(grammarAccess.getOutputAccess().getNameKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2__Impl"


    // $ANTLR start "rule__Output__Group__3"
    // InternalShemaTables.g:1967:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1971:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // InternalShemaTables.g:1972:2: rule__Output__Group__3__Impl rule__Output__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Output__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__4();

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
    // $ANTLR end "rule__Output__Group__3"


    // $ANTLR start "rule__Output__Group__3__Impl"
    // InternalShemaTables.g:1979:1: rule__Output__Group__3__Impl : ( ( rule__Output__NameAssignment_3 ) ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1983:1: ( ( ( rule__Output__NameAssignment_3 ) ) )
            // InternalShemaTables.g:1984:1: ( ( rule__Output__NameAssignment_3 ) )
            {
            // InternalShemaTables.g:1984:1: ( ( rule__Output__NameAssignment_3 ) )
            // InternalShemaTables.g:1985:2: ( rule__Output__NameAssignment_3 )
            {
             before(grammarAccess.getOutputAccess().getNameAssignment_3()); 
            // InternalShemaTables.g:1986:2: ( rule__Output__NameAssignment_3 )
            // InternalShemaTables.g:1986:3: rule__Output__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Output__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3__Impl"


    // $ANTLR start "rule__Output__Group__4"
    // InternalShemaTables.g:1994:1: rule__Output__Group__4 : rule__Output__Group__4__Impl rule__Output__Group__5 ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:1998:1: ( rule__Output__Group__4__Impl rule__Output__Group__5 )
            // InternalShemaTables.g:1999:2: rule__Output__Group__4__Impl rule__Output__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Output__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__5();

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
    // $ANTLR end "rule__Output__Group__4"


    // $ANTLR start "rule__Output__Group__4__Impl"
    // InternalShemaTables.g:2006:1: rule__Output__Group__4__Impl : ( 'id' ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2010:1: ( ( 'id' ) )
            // InternalShemaTables.g:2011:1: ( 'id' )
            {
            // InternalShemaTables.g:2011:1: ( 'id' )
            // InternalShemaTables.g:2012:2: 'id'
            {
             before(grammarAccess.getOutputAccess().getIdKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getIdKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__4__Impl"


    // $ANTLR start "rule__Output__Group__5"
    // InternalShemaTables.g:2021:1: rule__Output__Group__5 : rule__Output__Group__5__Impl rule__Output__Group__6 ;
    public final void rule__Output__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2025:1: ( rule__Output__Group__5__Impl rule__Output__Group__6 )
            // InternalShemaTables.g:2026:2: rule__Output__Group__5__Impl rule__Output__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Output__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__6();

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
    // $ANTLR end "rule__Output__Group__5"


    // $ANTLR start "rule__Output__Group__5__Impl"
    // InternalShemaTables.g:2033:1: rule__Output__Group__5__Impl : ( ( rule__Output__IdAssignment_5 ) ) ;
    public final void rule__Output__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2037:1: ( ( ( rule__Output__IdAssignment_5 ) ) )
            // InternalShemaTables.g:2038:1: ( ( rule__Output__IdAssignment_5 ) )
            {
            // InternalShemaTables.g:2038:1: ( ( rule__Output__IdAssignment_5 ) )
            // InternalShemaTables.g:2039:2: ( rule__Output__IdAssignment_5 )
            {
             before(grammarAccess.getOutputAccess().getIdAssignment_5()); 
            // InternalShemaTables.g:2040:2: ( rule__Output__IdAssignment_5 )
            // InternalShemaTables.g:2040:3: rule__Output__IdAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Output__IdAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getIdAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__5__Impl"


    // $ANTLR start "rule__Output__Group__6"
    // InternalShemaTables.g:2048:1: rule__Output__Group__6 : rule__Output__Group__6__Impl rule__Output__Group__7 ;
    public final void rule__Output__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2052:1: ( rule__Output__Group__6__Impl rule__Output__Group__7 )
            // InternalShemaTables.g:2053:2: rule__Output__Group__6__Impl rule__Output__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Output__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__7();

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
    // $ANTLR end "rule__Output__Group__6"


    // $ANTLR start "rule__Output__Group__6__Impl"
    // InternalShemaTables.g:2060:1: rule__Output__Group__6__Impl : ( 'dataType' ) ;
    public final void rule__Output__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2064:1: ( ( 'dataType' ) )
            // InternalShemaTables.g:2065:1: ( 'dataType' )
            {
            // InternalShemaTables.g:2065:1: ( 'dataType' )
            // InternalShemaTables.g:2066:2: 'dataType'
            {
             before(grammarAccess.getOutputAccess().getDataTypeKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getDataTypeKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__6__Impl"


    // $ANTLR start "rule__Output__Group__7"
    // InternalShemaTables.g:2075:1: rule__Output__Group__7 : rule__Output__Group__7__Impl rule__Output__Group__8 ;
    public final void rule__Output__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2079:1: ( rule__Output__Group__7__Impl rule__Output__Group__8 )
            // InternalShemaTables.g:2080:2: rule__Output__Group__7__Impl rule__Output__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Output__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__8();

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
    // $ANTLR end "rule__Output__Group__7"


    // $ANTLR start "rule__Output__Group__7__Impl"
    // InternalShemaTables.g:2087:1: rule__Output__Group__7__Impl : ( ( rule__Output__DataTypeAssignment_7 ) ) ;
    public final void rule__Output__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2091:1: ( ( ( rule__Output__DataTypeAssignment_7 ) ) )
            // InternalShemaTables.g:2092:1: ( ( rule__Output__DataTypeAssignment_7 ) )
            {
            // InternalShemaTables.g:2092:1: ( ( rule__Output__DataTypeAssignment_7 ) )
            // InternalShemaTables.g:2093:2: ( rule__Output__DataTypeAssignment_7 )
            {
             before(grammarAccess.getOutputAccess().getDataTypeAssignment_7()); 
            // InternalShemaTables.g:2094:2: ( rule__Output__DataTypeAssignment_7 )
            // InternalShemaTables.g:2094:3: rule__Output__DataTypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Output__DataTypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getDataTypeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__7__Impl"


    // $ANTLR start "rule__Output__Group__8"
    // InternalShemaTables.g:2102:1: rule__Output__Group__8 : rule__Output__Group__8__Impl rule__Output__Group__9 ;
    public final void rule__Output__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2106:1: ( rule__Output__Group__8__Impl rule__Output__Group__9 )
            // InternalShemaTables.g:2107:2: rule__Output__Group__8__Impl rule__Output__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__Output__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__9();

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
    // $ANTLR end "rule__Output__Group__8"


    // $ANTLR start "rule__Output__Group__8__Impl"
    // InternalShemaTables.g:2114:1: rule__Output__Group__8__Impl : ( 'constraint' ) ;
    public final void rule__Output__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2118:1: ( ( 'constraint' ) )
            // InternalShemaTables.g:2119:1: ( 'constraint' )
            {
            // InternalShemaTables.g:2119:1: ( 'constraint' )
            // InternalShemaTables.g:2120:2: 'constraint'
            {
             before(grammarAccess.getOutputAccess().getConstraintKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getConstraintKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__8__Impl"


    // $ANTLR start "rule__Output__Group__9"
    // InternalShemaTables.g:2129:1: rule__Output__Group__9 : rule__Output__Group__9__Impl rule__Output__Group__10 ;
    public final void rule__Output__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2133:1: ( rule__Output__Group__9__Impl rule__Output__Group__10 )
            // InternalShemaTables.g:2134:2: rule__Output__Group__9__Impl rule__Output__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__Output__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__10();

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
    // $ANTLR end "rule__Output__Group__9"


    // $ANTLR start "rule__Output__Group__9__Impl"
    // InternalShemaTables.g:2141:1: rule__Output__Group__9__Impl : ( ( rule__Output__ConstraintAssignment_9 ) ) ;
    public final void rule__Output__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2145:1: ( ( ( rule__Output__ConstraintAssignment_9 ) ) )
            // InternalShemaTables.g:2146:1: ( ( rule__Output__ConstraintAssignment_9 ) )
            {
            // InternalShemaTables.g:2146:1: ( ( rule__Output__ConstraintAssignment_9 ) )
            // InternalShemaTables.g:2147:2: ( rule__Output__ConstraintAssignment_9 )
            {
             before(grammarAccess.getOutputAccess().getConstraintAssignment_9()); 
            // InternalShemaTables.g:2148:2: ( rule__Output__ConstraintAssignment_9 )
            // InternalShemaTables.g:2148:3: rule__Output__ConstraintAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Output__ConstraintAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getConstraintAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__9__Impl"


    // $ANTLR start "rule__Output__Group__10"
    // InternalShemaTables.g:2156:1: rule__Output__Group__10 : rule__Output__Group__10__Impl ;
    public final void rule__Output__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2160:1: ( rule__Output__Group__10__Impl )
            // InternalShemaTables.g:2161:2: rule__Output__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__10__Impl();

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
    // $ANTLR end "rule__Output__Group__10"


    // $ANTLR start "rule__Output__Group__10__Impl"
    // InternalShemaTables.g:2167:1: rule__Output__Group__10__Impl : ( '}' ) ;
    public final void rule__Output__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2171:1: ( ( '}' ) )
            // InternalShemaTables.g:2172:1: ( '}' )
            {
            // InternalShemaTables.g:2172:1: ( '}' )
            // InternalShemaTables.g:2173:2: '}'
            {
             before(grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_10()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__10__Impl"


    // $ANTLR start "rule__Constant__Group__0"
    // InternalShemaTables.g:2183:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2187:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // InternalShemaTables.g:2188:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Constant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group__1();

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
    // $ANTLR end "rule__Constant__Group__0"


    // $ANTLR start "rule__Constant__Group__0__Impl"
    // InternalShemaTables.g:2195:1: rule__Constant__Group__0__Impl : ( 'Constant' ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2199:1: ( ( 'Constant' ) )
            // InternalShemaTables.g:2200:1: ( 'Constant' )
            {
            // InternalShemaTables.g:2200:1: ( 'Constant' )
            // InternalShemaTables.g:2201:2: 'Constant'
            {
             before(grammarAccess.getConstantAccess().getConstantKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getConstantKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0__Impl"


    // $ANTLR start "rule__Constant__Group__1"
    // InternalShemaTables.g:2210:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2214:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // InternalShemaTables.g:2215:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Constant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group__2();

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
    // $ANTLR end "rule__Constant__Group__1"


    // $ANTLR start "rule__Constant__Group__1__Impl"
    // InternalShemaTables.g:2222:1: rule__Constant__Group__1__Impl : ( '{' ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2226:1: ( ( '{' ) )
            // InternalShemaTables.g:2227:1: ( '{' )
            {
            // InternalShemaTables.g:2227:1: ( '{' )
            // InternalShemaTables.g:2228:2: '{'
            {
             before(grammarAccess.getConstantAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1__Impl"


    // $ANTLR start "rule__Constant__Group__2"
    // InternalShemaTables.g:2237:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2241:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // InternalShemaTables.g:2242:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Constant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group__3();

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
    // $ANTLR end "rule__Constant__Group__2"


    // $ANTLR start "rule__Constant__Group__2__Impl"
    // InternalShemaTables.g:2249:1: rule__Constant__Group__2__Impl : ( 'value' ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2253:1: ( ( 'value' ) )
            // InternalShemaTables.g:2254:1: ( 'value' )
            {
            // InternalShemaTables.g:2254:1: ( 'value' )
            // InternalShemaTables.g:2255:2: 'value'
            {
             before(grammarAccess.getConstantAccess().getValueKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getValueKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2__Impl"


    // $ANTLR start "rule__Constant__Group__3"
    // InternalShemaTables.g:2264:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl rule__Constant__Group__4 ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2268:1: ( rule__Constant__Group__3__Impl rule__Constant__Group__4 )
            // InternalShemaTables.g:2269:2: rule__Constant__Group__3__Impl rule__Constant__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Constant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group__4();

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
    // $ANTLR end "rule__Constant__Group__3"


    // $ANTLR start "rule__Constant__Group__3__Impl"
    // InternalShemaTables.g:2276:1: rule__Constant__Group__3__Impl : ( ( rule__Constant__ValueAssignment_3 ) ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2280:1: ( ( ( rule__Constant__ValueAssignment_3 ) ) )
            // InternalShemaTables.g:2281:1: ( ( rule__Constant__ValueAssignment_3 ) )
            {
            // InternalShemaTables.g:2281:1: ( ( rule__Constant__ValueAssignment_3 ) )
            // InternalShemaTables.g:2282:2: ( rule__Constant__ValueAssignment_3 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_3()); 
            // InternalShemaTables.g:2283:2: ( rule__Constant__ValueAssignment_3 )
            // InternalShemaTables.g:2283:3: rule__Constant__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Constant__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3__Impl"


    // $ANTLR start "rule__Constant__Group__4"
    // InternalShemaTables.g:2291:1: rule__Constant__Group__4 : rule__Constant__Group__4__Impl ;
    public final void rule__Constant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2295:1: ( rule__Constant__Group__4__Impl )
            // InternalShemaTables.g:2296:2: rule__Constant__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group__4__Impl();

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
    // $ANTLR end "rule__Constant__Group__4"


    // $ANTLR start "rule__Constant__Group__4__Impl"
    // InternalShemaTables.g:2302:1: rule__Constant__Group__4__Impl : ( '}' ) ;
    public final void rule__Constant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2306:1: ( ( '}' ) )
            // InternalShemaTables.g:2307:1: ( '}' )
            {
            // InternalShemaTables.g:2307:1: ( '}' )
            // InternalShemaTables.g:2308:2: '}'
            {
             before(grammarAccess.getConstantAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__4__Impl"


    // $ANTLR start "rule__Tables__NameAssignment_1"
    // InternalShemaTables.g:2318:1: rule__Tables__NameAssignment_1 : ( ( 'Tables' ) ) ;
    public final void rule__Tables__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2322:1: ( ( ( 'Tables' ) ) )
            // InternalShemaTables.g:2323:2: ( ( 'Tables' ) )
            {
            // InternalShemaTables.g:2323:2: ( ( 'Tables' ) )
            // InternalShemaTables.g:2324:3: ( 'Tables' )
            {
             before(grammarAccess.getTablesAccess().getNameTablesKeyword_1_0()); 
            // InternalShemaTables.g:2325:3: ( 'Tables' )
            // InternalShemaTables.g:2326:4: 'Tables'
            {
             before(grammarAccess.getTablesAccess().getNameTablesKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTablesAccess().getNameTablesKeyword_1_0()); 

            }

             after(grammarAccess.getTablesAccess().getNameTablesKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tables__NameAssignment_1"


    // $ANTLR start "rule__Tables__ShematablesAssignment_4"
    // InternalShemaTables.g:2337:1: rule__Tables__ShematablesAssignment_4 : ( ruleShemaTable ) ;
    public final void rule__Tables__ShematablesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2341:1: ( ( ruleShemaTable ) )
            // InternalShemaTables.g:2342:2: ( ruleShemaTable )
            {
            // InternalShemaTables.g:2342:2: ( ruleShemaTable )
            // InternalShemaTables.g:2343:3: ruleShemaTable
            {
             before(grammarAccess.getTablesAccess().getShematablesShemaTableParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleShemaTable();

            state._fsp--;

             after(grammarAccess.getTablesAccess().getShematablesShemaTableParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tables__ShematablesAssignment_4"


    // $ANTLR start "rule__ShemaTable__NameAssignment_3"
    // InternalShemaTables.g:2352:1: rule__ShemaTable__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ShemaTable__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2356:1: ( ( RULE_ID ) )
            // InternalShemaTables.g:2357:2: ( RULE_ID )
            {
            // InternalShemaTables.g:2357:2: ( RULE_ID )
            // InternalShemaTables.g:2358:3: RULE_ID
            {
             before(grammarAccess.getShemaTableAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getShemaTableAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShemaTable__NameAssignment_3"


    // $ANTLR start "rule__ShemaTable__IdAssignment_5"
    // InternalShemaTables.g:2367:1: rule__ShemaTable__IdAssignment_5 : ( RULE_INT ) ;
    public final void rule__ShemaTable__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2371:1: ( ( RULE_INT ) )
            // InternalShemaTables.g:2372:2: ( RULE_INT )
            {
            // InternalShemaTables.g:2372:2: ( RULE_INT )
            // InternalShemaTables.g:2373:3: RULE_INT
            {
             before(grammarAccess.getShemaTableAccess().getIdINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getShemaTableAccess().getIdINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShemaTable__IdAssignment_5"


    // $ANTLR start "rule__ShemaTable__ColumnsAssignment_7"
    // InternalShemaTables.g:2382:1: rule__ShemaTable__ColumnsAssignment_7 : ( ruleColumn ) ;
    public final void rule__ShemaTable__ColumnsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2386:1: ( ( ruleColumn ) )
            // InternalShemaTables.g:2387:2: ( ruleColumn )
            {
            // InternalShemaTables.g:2387:2: ( ruleColumn )
            // InternalShemaTables.g:2388:3: ruleColumn
            {
             before(grammarAccess.getShemaTableAccess().getColumnsColumnParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getShemaTableAccess().getColumnsColumnParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShemaTable__ColumnsAssignment_7"


    // $ANTLR start "rule__ShemaTable__CatalogueAssignment_9"
    // InternalShemaTables.g:2397:1: rule__ShemaTable__CatalogueAssignment_9 : ( ruleCatalogue ) ;
    public final void rule__ShemaTable__CatalogueAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2401:1: ( ( ruleCatalogue ) )
            // InternalShemaTables.g:2402:2: ( ruleCatalogue )
            {
            // InternalShemaTables.g:2402:2: ( ruleCatalogue )
            // InternalShemaTables.g:2403:3: ruleCatalogue
            {
             before(grammarAccess.getShemaTableAccess().getCatalogueCatalogueParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleCatalogue();

            state._fsp--;

             after(grammarAccess.getShemaTableAccess().getCatalogueCatalogueParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShemaTable__CatalogueAssignment_9"


    // $ANTLR start "rule__Column__NameAssignment_3"
    // InternalShemaTables.g:2412:1: rule__Column__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Column__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2416:1: ( ( RULE_ID ) )
            // InternalShemaTables.g:2417:2: ( RULE_ID )
            {
            // InternalShemaTables.g:2417:2: ( RULE_ID )
            // InternalShemaTables.g:2418:3: RULE_ID
            {
             before(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__NameAssignment_3"


    // $ANTLR start "rule__Column__IdAssignment_5"
    // InternalShemaTables.g:2427:1: rule__Column__IdAssignment_5 : ( RULE_INT ) ;
    public final void rule__Column__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2431:1: ( ( RULE_INT ) )
            // InternalShemaTables.g:2432:2: ( RULE_INT )
            {
            // InternalShemaTables.g:2432:2: ( RULE_INT )
            // InternalShemaTables.g:2433:3: RULE_INT
            {
             before(grammarAccess.getColumnAccess().getIdINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getIdINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__IdAssignment_5"


    // $ANTLR start "rule__Column__DataTypeAssignment_7"
    // InternalShemaTables.g:2442:1: rule__Column__DataTypeAssignment_7 : ( ruleColumnDataType ) ;
    public final void rule__Column__DataTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2446:1: ( ( ruleColumnDataType ) )
            // InternalShemaTables.g:2447:2: ( ruleColumnDataType )
            {
            // InternalShemaTables.g:2447:2: ( ruleColumnDataType )
            // InternalShemaTables.g:2448:3: ruleColumnDataType
            {
             before(grammarAccess.getColumnAccess().getDataTypeColumnDataTypeEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnDataType();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getDataTypeColumnDataTypeEnumRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__DataTypeAssignment_7"


    // $ANTLR start "rule__Column__ConstraintAssignment_9"
    // InternalShemaTables.g:2457:1: rule__Column__ConstraintAssignment_9 : ( ruleConstraint ) ;
    public final void rule__Column__ConstraintAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2461:1: ( ( ruleConstraint ) )
            // InternalShemaTables.g:2462:2: ( ruleConstraint )
            {
            // InternalShemaTables.g:2462:2: ( ruleConstraint )
            // InternalShemaTables.g:2463:3: ruleConstraint
            {
             before(grammarAccess.getColumnAccess().getConstraintConstraintParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getConstraintConstraintParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__ConstraintAssignment_9"


    // $ANTLR start "rule__Constraint__FilePathAssignment_3"
    // InternalShemaTables.g:2472:1: rule__Constraint__FilePathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Constraint__FilePathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2476:1: ( ( RULE_STRING ) )
            // InternalShemaTables.g:2477:2: ( RULE_STRING )
            {
            // InternalShemaTables.g:2477:2: ( RULE_STRING )
            // InternalShemaTables.g:2478:3: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getFilePathSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getFilePathSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__FilePathAssignment_3"


    // $ANTLR start "rule__Catalogue__NameAssignment_3"
    // InternalShemaTables.g:2487:1: rule__Catalogue__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Catalogue__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2491:1: ( ( RULE_ID ) )
            // InternalShemaTables.g:2492:2: ( RULE_ID )
            {
            // InternalShemaTables.g:2492:2: ( RULE_ID )
            // InternalShemaTables.g:2493:3: RULE_ID
            {
             before(grammarAccess.getCatalogueAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCatalogueAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogue__NameAssignment_3"


    // $ANTLR start "rule__Catalogue__AlgorithmsAssignment_5"
    // InternalShemaTables.g:2502:1: rule__Catalogue__AlgorithmsAssignment_5 : ( ruleAlgorithm ) ;
    public final void rule__Catalogue__AlgorithmsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2506:1: ( ( ruleAlgorithm ) )
            // InternalShemaTables.g:2507:2: ( ruleAlgorithm )
            {
            // InternalShemaTables.g:2507:2: ( ruleAlgorithm )
            // InternalShemaTables.g:2508:3: ruleAlgorithm
            {
             before(grammarAccess.getCatalogueAccess().getAlgorithmsAlgorithmParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAlgorithm();

            state._fsp--;

             after(grammarAccess.getCatalogueAccess().getAlgorithmsAlgorithmParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogue__AlgorithmsAssignment_5"


    // $ANTLR start "rule__Algorithm__NameAssignment_3"
    // InternalShemaTables.g:2517:1: rule__Algorithm__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Algorithm__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2521:1: ( ( RULE_ID ) )
            // InternalShemaTables.g:2522:2: ( RULE_ID )
            {
            // InternalShemaTables.g:2522:2: ( RULE_ID )
            // InternalShemaTables.g:2523:3: RULE_ID
            {
             before(grammarAccess.getAlgorithmAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__NameAssignment_3"


    // $ANTLR start "rule__Algorithm__PathAssignment_5"
    // InternalShemaTables.g:2532:1: rule__Algorithm__PathAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Algorithm__PathAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2536:1: ( ( RULE_STRING ) )
            // InternalShemaTables.g:2537:2: ( RULE_STRING )
            {
            // InternalShemaTables.g:2537:2: ( RULE_STRING )
            // InternalShemaTables.g:2538:3: RULE_STRING
            {
             before(grammarAccess.getAlgorithmAccess().getPathSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAlgorithmAccess().getPathSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__PathAssignment_5"


    // $ANTLR start "rule__Algorithm__OutputAssignment_7"
    // InternalShemaTables.g:2547:1: rule__Algorithm__OutputAssignment_7 : ( ruleOutput ) ;
    public final void rule__Algorithm__OutputAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2551:1: ( ( ruleOutput ) )
            // InternalShemaTables.g:2552:2: ( ruleOutput )
            {
            // InternalShemaTables.g:2552:2: ( ruleOutput )
            // InternalShemaTables.g:2553:3: ruleOutput
            {
             before(grammarAccess.getAlgorithmAccess().getOutputOutputParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getAlgorithmAccess().getOutputOutputParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__OutputAssignment_7"


    // $ANTLR start "rule__Algorithm__InputAssignment_9"
    // InternalShemaTables.g:2562:1: rule__Algorithm__InputAssignment_9 : ( ruleInput ) ;
    public final void rule__Algorithm__InputAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2566:1: ( ( ruleInput ) )
            // InternalShemaTables.g:2567:2: ( ruleInput )
            {
            // InternalShemaTables.g:2567:2: ( ruleInput )
            // InternalShemaTables.g:2568:3: ruleInput
            {
             before(grammarAccess.getAlgorithmAccess().getInputInputParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getAlgorithmAccess().getInputInputParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__InputAssignment_9"


    // $ANTLR start "rule__Input__ConstanteAssignment_3"
    // InternalShemaTables.g:2577:1: rule__Input__ConstanteAssignment_3 : ( ruleConstant ) ;
    public final void rule__Input__ConstanteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2581:1: ( ( ruleConstant ) )
            // InternalShemaTables.g:2582:2: ( ruleConstant )
            {
            // InternalShemaTables.g:2582:2: ( ruleConstant )
            // InternalShemaTables.g:2583:3: ruleConstant
            {
             before(grammarAccess.getInputAccess().getConstanteConstantParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getInputAccess().getConstanteConstantParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__ConstanteAssignment_3"


    // $ANTLR start "rule__Input__ColumnsAssignment_5"
    // InternalShemaTables.g:2592:1: rule__Input__ColumnsAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Input__ColumnsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2596:1: ( ( ( RULE_ID ) ) )
            // InternalShemaTables.g:2597:2: ( ( RULE_ID ) )
            {
            // InternalShemaTables.g:2597:2: ( ( RULE_ID ) )
            // InternalShemaTables.g:2598:3: ( RULE_ID )
            {
             before(grammarAccess.getInputAccess().getColumnsColumnCrossReference_5_0()); 
            // InternalShemaTables.g:2599:3: ( RULE_ID )
            // InternalShemaTables.g:2600:4: RULE_ID
            {
             before(grammarAccess.getInputAccess().getColumnsColumnIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getColumnsColumnIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getInputAccess().getColumnsColumnCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__ColumnsAssignment_5"


    // $ANTLR start "rule__Output__NameAssignment_3"
    // InternalShemaTables.g:2611:1: rule__Output__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Output__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2615:1: ( ( RULE_ID ) )
            // InternalShemaTables.g:2616:2: ( RULE_ID )
            {
            // InternalShemaTables.g:2616:2: ( RULE_ID )
            // InternalShemaTables.g:2617:3: RULE_ID
            {
             before(grammarAccess.getOutputAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__NameAssignment_3"


    // $ANTLR start "rule__Output__IdAssignment_5"
    // InternalShemaTables.g:2626:1: rule__Output__IdAssignment_5 : ( RULE_INT ) ;
    public final void rule__Output__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2630:1: ( ( RULE_INT ) )
            // InternalShemaTables.g:2631:2: ( RULE_INT )
            {
            // InternalShemaTables.g:2631:2: ( RULE_INT )
            // InternalShemaTables.g:2632:3: RULE_INT
            {
             before(grammarAccess.getOutputAccess().getIdINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getIdINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__IdAssignment_5"


    // $ANTLR start "rule__Output__DataTypeAssignment_7"
    // InternalShemaTables.g:2641:1: rule__Output__DataTypeAssignment_7 : ( ruleColumnDataType ) ;
    public final void rule__Output__DataTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2645:1: ( ( ruleColumnDataType ) )
            // InternalShemaTables.g:2646:2: ( ruleColumnDataType )
            {
            // InternalShemaTables.g:2646:2: ( ruleColumnDataType )
            // InternalShemaTables.g:2647:3: ruleColumnDataType
            {
             before(grammarAccess.getOutputAccess().getDataTypeColumnDataTypeEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnDataType();

            state._fsp--;

             after(grammarAccess.getOutputAccess().getDataTypeColumnDataTypeEnumRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__DataTypeAssignment_7"


    // $ANTLR start "rule__Output__ConstraintAssignment_9"
    // InternalShemaTables.g:2656:1: rule__Output__ConstraintAssignment_9 : ( ruleConstraint ) ;
    public final void rule__Output__ConstraintAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2660:1: ( ( ruleConstraint ) )
            // InternalShemaTables.g:2661:2: ( ruleConstraint )
            {
            // InternalShemaTables.g:2661:2: ( ruleConstraint )
            // InternalShemaTables.g:2662:3: ruleConstraint
            {
             before(grammarAccess.getOutputAccess().getConstraintConstraintParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getOutputAccess().getConstraintConstraintParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__ConstraintAssignment_9"


    // $ANTLR start "rule__Constant__ValueAssignment_3"
    // InternalShemaTables.g:2671:1: rule__Constant__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__Constant__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalShemaTables.g:2675:1: ( ( RULE_INT ) )
            // InternalShemaTables.g:2676:2: ( RULE_INT )
            {
            // InternalShemaTables.g:2676:2: ( RULE_INT )
            // InternalShemaTables.g:2677:3: RULE_INT
            {
             before(grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__ValueAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});

}