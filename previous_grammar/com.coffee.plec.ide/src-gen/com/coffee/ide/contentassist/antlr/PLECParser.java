/*
 * generated by Xtext 2.12.0
 */
package com.coffee.ide.contentassist.antlr;

import com.coffee.ide.contentassist.antlr.internal.InternalPLECParser;
import com.coffee.services.PLECGrammarAccess;
import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class PLECParser extends AbstractContentAssistParser {

	@Inject
	private PLECGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalPLECParser createParser() {
		InternalPLECParser result = new InternalPLECParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getVariantDeclarationAccess().getAlternatives(), "rule__VariantDeclaration__Alternatives");
					put(grammarAccess.getConsExpressionAccess().getAlternatives(), "rule__ConsExpression__Alternatives");
					put(grammarAccess.getTerminalExpAccess().getAlternatives(), "rule__TerminalExp__Alternatives");
					put(grammarAccess.getRefinementAccess().getAlternatives(), "rule__Refinement__Alternatives");
					put(grammarAccess.getBoolValAccess().getValueAlternatives_0(), "rule__BoolVal__ValueAlternatives_0");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getNonEnumerableValueAccess().getAlternatives(), "rule__NonEnumerableValue__Alternatives");
					put(grammarAccess.getVarTypeAccess().getAlternatives(), "rule__VarType__Alternatives");
					put(grammarAccess.getBinOpAccess().getAlternatives(), "rule__BinOp__Alternatives");
					put(grammarAccess.getUnaryOpAccess().getAlternatives(), "rule__UnaryOp__Alternatives");
					put(grammarAccess.getTempOPAccess().getAlternatives(), "rule__TempOP__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getVarDeclarationAccess().getGroup(), "rule__VarDeclaration__Group__0");
					put(grammarAccess.getVarDeclarationAccess().getGroup_0(), "rule__VarDeclaration__Group_0__0");
					put(grammarAccess.getVarDeclarationAccess().getGroup_3(), "rule__VarDeclaration__Group_3__0");
					put(grammarAccess.getVariantsIntervalAccess().getGroup(), "rule__VariantsInterval__Group__0");
					put(grammarAccess.getVariantsEnumerationAccess().getGroup(), "rule__VariantsEnumeration__Group__0");
					put(grammarAccess.getConstraintAccess().getGroup(), "rule__Constraint__Group__0");
					put(grammarAccess.getTerminalExpAccess().getGroup_0(), "rule__TerminalExp__Group_0__0");
					put(grammarAccess.getStructuralAccess().getGroup(), "rule__Structural__Group__0");
					put(grammarAccess.getStructuralAccess().getGroup_6(), "rule__Structural__Group_6__0");
					put(grammarAccess.getAttributesAccess().getGroup(), "rule__Attributes__Group__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getVarRefinementAccess().getGroup(), "rule__VarRefinement__Group__0");
					put(grammarAccess.getSetRefinementAccess().getGroup(), "rule__SetRefinement__Group__0");
					put(grammarAccess.getRootRefinementAccess().getGroup(), "rule__RootRefinement__Group__0");
					put(grammarAccess.getTemporalAccess().getGroup(), "rule__Temporal__Group__0");
					put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
					put(grammarAccess.getFodaUNAccess().getGroup(), "rule__FodaUN__Group__0");
					put(grammarAccess.getFodaBinAccess().getGroup(), "rule__FodaBin__Group__0");
					put(grammarAccess.getQuantifiableAccess().getGroup(), "rule__Quantifiable__Group__0");
					put(grammarAccess.getListOfValuesAccess().getGroup(), "rule__ListOfValues__Group__0");
					put(grammarAccess.getListOfValuesAccess().getGroup_1(), "rule__ListOfValues__Group_1__0");
					put(grammarAccess.getListOfIDsAccess().getGroup(), "rule__ListOfIDs__Group__0");
					put(grammarAccess.getListOfIDsAccess().getGroup_1(), "rule__ListOfIDs__Group_1__0");
					put(grammarAccess.getListOfListsOfValuesAccess().getGroup(), "rule__ListOfListsOfValues__Group__0");
					put(grammarAccess.getListOfListsOfValuesAccess().getGroup_3(), "rule__ListOfListsOfValues__Group_3__0");
					put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
					put(grammarAccess.getModelAccess().getVarsAssignment_3(), "rule__Model__VarsAssignment_3");
					put(grammarAccess.getModelAccess().getConstraintsAssignment_5(), "rule__Model__ConstraintsAssignment_5");
					put(grammarAccess.getVarDeclarationAccess().getInstantiableAssignment_0_0(), "rule__VarDeclaration__InstantiableAssignment_0_0");
					put(grammarAccess.getVarDeclarationAccess().getMinAssignment_0_2(), "rule__VarDeclaration__MinAssignment_0_2");
					put(grammarAccess.getVarDeclarationAccess().getMaxAssignment_0_4(), "rule__VarDeclaration__MaxAssignment_0_4");
					put(grammarAccess.getVarDeclarationAccess().getTypeAssignment_1(), "rule__VarDeclaration__TypeAssignment_1");
					put(grammarAccess.getVarDeclarationAccess().getNameAssignment_2(), "rule__VarDeclaration__NameAssignment_2");
					put(grammarAccess.getVarDeclarationAccess().getVariantsAssignment_3_1(), "rule__VarDeclaration__VariantsAssignment_3_1");
					put(grammarAccess.getVariantsIntervalAccess().getStartAssignment_0(), "rule__VariantsInterval__StartAssignment_0");
					put(grammarAccess.getVariantsIntervalAccess().getEndAssignment_2(), "rule__VariantsInterval__EndAssignment_2");
					put(grammarAccess.getVariantsEnumerationAccess().getListAssignment_1(), "rule__VariantsEnumeration__ListAssignment_1");
					put(grammarAccess.getConstraintAccess().getNameAssignment_0(), "rule__Constraint__NameAssignment_0");
					put(grammarAccess.getConstraintAccess().getExpAssignment_2(), "rule__Constraint__ExpAssignment_2");
					put(grammarAccess.getIDConsAccess().getNameAssignment(), "rule__IDCons__NameAssignment");
					put(grammarAccess.getStructuralAccess().getParentAssignment_1(), "rule__Structural__ParentAssignment_1");
					put(grammarAccess.getStructuralAccess().getGroupAssignment_4(), "rule__Structural__GroupAssignment_4");
					put(grammarAccess.getStructuralAccess().getMinAssignment_6_2(), "rule__Structural__MinAssignment_6_2");
					put(grammarAccess.getStructuralAccess().getMaxAssignment_6_4(), "rule__Structural__MaxAssignment_6_4");
					put(grammarAccess.getAttributesAccess().getAttAssignment_2(), "rule__Attributes__AttAssignment_2");
					put(grammarAccess.getAttributesAccess().getVar1Assignment_5(), "rule__Attributes__Var1Assignment_5");
					put(grammarAccess.getAssignmentAccess().getVariableAssignment_0(), "rule__Assignment__VariableAssignment_0");
					put(grammarAccess.getAssignmentAccess().getValuAssignment_2(), "rule__Assignment__ValuAssignment_2");
					put(grammarAccess.getVarRefinementAccess().getVarAssignment_0(), "rule__VarRefinement__VarAssignment_0");
					put(grammarAccess.getVarRefinementAccess().getValuesAssignment_2(), "rule__VarRefinement__ValuesAssignment_2");
					put(grammarAccess.getSetRefinementAccess().getVarsAssignment_2(), "rule__SetRefinement__VarsAssignment_2");
					put(grammarAccess.getSetRefinementAccess().getListAssignment_6(), "rule__SetRefinement__ListAssignment_6");
					put(grammarAccess.getRootRefinementAccess().getVarAssignment_0(), "rule__RootRefinement__VarAssignment_0");
					put(grammarAccess.getTemporalAccess().getOperatorAssignment_0(), "rule__Temporal__OperatorAssignment_0");
					put(grammarAccess.getTemporalAccess().getConsAssignment_1(), "rule__Temporal__ConsAssignment_1");
					put(grammarAccess.getRuleAccess().getConditionAssignment_0(), "rule__Rule__ConditionAssignment_0");
					put(grammarAccess.getRuleAccess().getConsequenceAssignment_2(), "rule__Rule__ConsequenceAssignment_2");
					put(grammarAccess.getFodaUNAccess().getVar1Assignment_0(), "rule__FodaUN__Var1Assignment_0");
					put(grammarAccess.getFodaUNAccess().getOpAssignment_2(), "rule__FodaUN__OpAssignment_2");
					put(grammarAccess.getFodaBinAccess().getVar1Assignment_0(), "rule__FodaBin__Var1Assignment_0");
					put(grammarAccess.getFodaBinAccess().getOpAssignment_1(), "rule__FodaBin__OpAssignment_1");
					put(grammarAccess.getFodaBinAccess().getVar2Assignment_2(), "rule__FodaBin__Var2Assignment_2");
					put(grammarAccess.getQuantifiableAccess().getMinV1Assignment_1(), "rule__Quantifiable__MinV1Assignment_1");
					put(grammarAccess.getQuantifiableAccess().getMaxV1Assignment_3(), "rule__Quantifiable__MaxV1Assignment_3");
					put(grammarAccess.getQuantifiableAccess().getVar1Assignment_5(), "rule__Quantifiable__Var1Assignment_5");
					put(grammarAccess.getQuantifiableAccess().getMinV2Assignment_8(), "rule__Quantifiable__MinV2Assignment_8");
					put(grammarAccess.getQuantifiableAccess().getMaxV2Assignment_10(), "rule__Quantifiable__MaxV2Assignment_10");
					put(grammarAccess.getQuantifiableAccess().getVar2Assignment_12(), "rule__Quantifiable__Var2Assignment_12");
					put(grammarAccess.getBoolValAccess().getValueAssignment(), "rule__BoolVal__ValueAssignment");
					put(grammarAccess.getNumberAccess().getValueAssignment(), "rule__Number__ValueAssignment");
					put(grammarAccess.getSymbolAccess().getValueAssignment(), "rule__Symbol__ValueAssignment");
					put(grammarAccess.getListOfValuesAccess().getValuesAssignment_0(), "rule__ListOfValues__ValuesAssignment_0");
					put(grammarAccess.getListOfValuesAccess().getValuesAssignment_1_1(), "rule__ListOfValues__ValuesAssignment_1_1");
					put(grammarAccess.getListOfIDsAccess().getIdsAssignment_0(), "rule__ListOfIDs__IdsAssignment_0");
					put(grammarAccess.getListOfIDsAccess().getIdsAssignment_1_1(), "rule__ListOfIDs__IdsAssignment_1_1");
					put(grammarAccess.getListOfListsOfValuesAccess().getValuesAssignment_1(), "rule__ListOfListsOfValues__ValuesAssignment_1");
					put(grammarAccess.getListOfListsOfValuesAccess().getValuesAssignment_3_2(), "rule__ListOfListsOfValues__ValuesAssignment_3_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PLECGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PLECGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
