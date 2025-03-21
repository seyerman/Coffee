/*
 * generated by Xtext 2.12.0
 */
package com.coffee.ide.contentassist.antlr;

import com.coffee.ide.contentassist.antlr.internal.InternalTHLCLParser;
import com.coffee.services.THLCLGrammarAccess;
import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class THLCLParser extends AbstractContentAssistParser {

	@Inject
	private THLCLGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalTHLCLParser createParser() {
		InternalTHLCLParser result = new InternalTHLCLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDomainDeclarationAccess().getAlternatives(), "rule__DomainDeclaration__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0(), "rule__Equality__OpAlternatives_1_1_0");
					put(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0(), "rule__Comparison__OpAlternatives_1_1_0");
					put(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0(), "rule__PlusOrMinus__Alternatives_1_0");
					put(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0(), "rule__MulOrDiv__OpAlternatives_1_1_0");
					put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
					put(grammarAccess.getAtomicAccess().getAlternatives(), "rule__Atomic__Alternatives");
					put(grammarAccess.getAtomicAccess().getValueAlternatives_0_1_0(), "rule__Atomic__ValueAlternatives_0_1_0");
					put(grammarAccess.getStrategyAccess().getAlternatives(), "rule__Strategy__Alternatives");
					put(grammarAccess.getBoolValAccess().getValueAlternatives_0(), "rule__BoolVal__ValueAlternatives_0");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getNonEnumerableValueAccess().getAlternatives(), "rule__NonEnumerableValue__Alternatives");
					put(grammarAccess.getVarTypeAccess().getAlternatives(), "rule__VarType__Alternatives");
					put(grammarAccess.getGlobalOpAccess().getAlternatives(), "rule__GlobalOp__Alternatives");
					put(grammarAccess.getFunctionOpAccess().getAlternatives(), "rule__FunctionOp__Alternatives");
					put(grammarAccess.getUnaryOpAccess().getAlternatives(), "rule__UnaryOp__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getModelAccess().getGroup_6(), "rule__Model__Group_6__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getVariableAccess().getGroup_2(), "rule__Variable__Group_2__0");
					put(grammarAccess.getIntervalAccess().getGroup(), "rule__Interval__Group__0");
					put(grammarAccess.getEnumerationAccess().getGroup(), "rule__Enumeration__Group__0");
					put(grammarAccess.getConstraintAccess().getGroup(), "rule__Constraint__Group__0");
					put(grammarAccess.getIffAccess().getGroup(), "rule__Iff__Group__0");
					put(grammarAccess.getIffAccess().getGroup_1(), "rule__Iff__Group_1__0");
					put(grammarAccess.getImpliesAccess().getGroup(), "rule__Implies__Group__0");
					put(grammarAccess.getImpliesAccess().getGroup_1(), "rule__Implies__Group_1__0");
					put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
					put(grammarAccess.getOrAccess().getGroup_1(), "rule__Or__Group_1__0");
					put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
					put(grammarAccess.getAndAccess().getGroup_1(), "rule__And__Group_1__0");
					put(grammarAccess.getEqualityAccess().getGroup(), "rule__Equality__Group__0");
					put(grammarAccess.getEqualityAccess().getGroup_1(), "rule__Equality__Group_1__0");
					put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
					put(grammarAccess.getComparisonAccess().getGroup_1(), "rule__Comparison__Group_1__0");
					put(grammarAccess.getPlusOrMinusAccess().getGroup(), "rule__PlusOrMinus__Group__0");
					put(grammarAccess.getPlusOrMinusAccess().getGroup_1(), "rule__PlusOrMinus__Group_1__0");
					put(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0(), "rule__PlusOrMinus__Group_1_0_0__0");
					put(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1(), "rule__PlusOrMinus__Group_1_0_1__0");
					put(grammarAccess.getMulOrDivAccess().getGroup(), "rule__MulOrDiv__Group__0");
					put(grammarAccess.getMulOrDivAccess().getGroup_1(), "rule__MulOrDiv__Group_1__0");
					put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
					put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
					put(grammarAccess.getPrimaryAccess().getGroup_2(), "rule__Primary__Group_2__0");
					put(grammarAccess.getPrimaryAccess().getGroup_3(), "rule__Primary__Group_3__0");
					put(grammarAccess.getAtomicAccess().getGroup_0(), "rule__Atomic__Group_0__0");
					put(grammarAccess.getAtomicAccess().getGroup_1(), "rule__Atomic__Group_1__0");
					put(grammarAccess.getAtomicAccess().getGroup_2(), "rule__Atomic__Group_2__0");
					put(grammarAccess.getGlobalAccess().getGroup(), "rule__Global__Group__0");
					put(grammarAccess.getGlobalAccess().getGroup_4(), "rule__Global__Group_4__0");
					put(grammarAccess.getListOfValuesAccess().getGroup(), "rule__ListOfValues__Group__0");
					put(grammarAccess.getListOfValuesAccess().getGroup_1(), "rule__ListOfValues__Group_1__0");
					put(grammarAccess.getListOfListValuesAccess().getGroup(), "rule__ListOfListValues__Group__0");
					put(grammarAccess.getListOfListValuesAccess().getGroup_3(), "rule__ListOfListValues__Group_3__0");
					put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
					put(grammarAccess.getModelAccess().getVariablesAssignment_3(), "rule__Model__VariablesAssignment_3");
					put(grammarAccess.getModelAccess().getConstraintsAssignment_5(), "rule__Model__ConstraintsAssignment_5");
					put(grammarAccess.getModelAccess().getStrategyAssignment_6_1(), "rule__Model__StrategyAssignment_6_1");
					put(grammarAccess.getVariableAccess().getTypeAssignment_0(), "rule__Variable__TypeAssignment_0");
					put(grammarAccess.getVariableAccess().getNameAssignment_1(), "rule__Variable__NameAssignment_1");
					put(grammarAccess.getVariableAccess().getDomainAssignment_2_1(), "rule__Variable__DomainAssignment_2_1");
					put(grammarAccess.getIntervalAccess().getStartAssignment_0(), "rule__Interval__StartAssignment_0");
					put(grammarAccess.getIntervalAccess().getEndAssignment_2(), "rule__Interval__EndAssignment_2");
					put(grammarAccess.getEnumerationAccess().getListAssignment_1(), "rule__Enumeration__ListAssignment_1");
					put(grammarAccess.getConstraintAccess().getNameAssignment_0(), "rule__Constraint__NameAssignment_0");
					put(grammarAccess.getConstraintAccess().getExpAssignment_2(), "rule__Constraint__ExpAssignment_2");
					put(grammarAccess.getIffAccess().getRightAssignment_1_2(), "rule__Iff__RightAssignment_1_2");
					put(grammarAccess.getImpliesAccess().getRightAssignment_1_2(), "rule__Implies__RightAssignment_1_2");
					put(grammarAccess.getOrAccess().getRightAssignment_1_2(), "rule__Or__RightAssignment_1_2");
					put(grammarAccess.getAndAccess().getRightAssignment_1_2(), "rule__And__RightAssignment_1_2");
					put(grammarAccess.getEqualityAccess().getOpAssignment_1_1(), "rule__Equality__OpAssignment_1_1");
					put(grammarAccess.getEqualityAccess().getRightAssignment_1_2(), "rule__Equality__RightAssignment_1_2");
					put(grammarAccess.getComparisonAccess().getOpAssignment_1_1(), "rule__Comparison__OpAssignment_1_1");
					put(grammarAccess.getComparisonAccess().getRightAssignment_1_2(), "rule__Comparison__RightAssignment_1_2");
					put(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1(), "rule__PlusOrMinus__RightAssignment_1_1");
					put(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1(), "rule__MulOrDiv__OpAssignment_1_1");
					put(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2(), "rule__MulOrDiv__RightAssignment_1_2");
					put(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2(), "rule__Primary__ExpressionAssignment_1_2");
					put(grammarAccess.getPrimaryAccess().getOpAssignment_2_1(), "rule__Primary__OpAssignment_2_1");
					put(grammarAccess.getPrimaryAccess().getExpressionAssignment_2_2(), "rule__Primary__ExpressionAssignment_2_2");
					put(grammarAccess.getPrimaryAccess().getOpAssignment_3_1(), "rule__Primary__OpAssignment_3_1");
					put(grammarAccess.getPrimaryAccess().getLeftAssignment_3_3(), "rule__Primary__LeftAssignment_3_3");
					put(grammarAccess.getPrimaryAccess().getRightAssignment_3_5(), "rule__Primary__RightAssignment_3_5");
					put(grammarAccess.getAtomicAccess().getValueAssignment_0_1(), "rule__Atomic__ValueAssignment_0_1");
					put(grammarAccess.getAtomicAccess().getVariableAssignment_1_1(), "rule__Atomic__VariableAssignment_1_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_2_1(), "rule__Atomic__ValueAssignment_2_1");
					put(grammarAccess.getGlobalAccess().getOpAssignment_0(), "rule__Global__OpAssignment_0");
					put(grammarAccess.getGlobalAccess().getVarsAssignment_2(), "rule__Global__VarsAssignment_2");
					put(grammarAccess.getGlobalAccess().getValuesAssignment_4_1(), "rule__Global__ValuesAssignment_4_1");
					put(grammarAccess.getBoolValAccess().getValueAssignment(), "rule__BoolVal__ValueAssignment");
					put(grammarAccess.getNumberAccess().getValueAssignment(), "rule__Number__ValueAssignment");
					put(grammarAccess.getSymbolAccess().getValueAssignment(), "rule__Symbol__ValueAssignment");
					put(grammarAccess.getListOfValuesAccess().getValuesAssignment_0(), "rule__ListOfValues__ValuesAssignment_0");
					put(grammarAccess.getListOfValuesAccess().getValuesAssignment_1_1(), "rule__ListOfValues__ValuesAssignment_1_1");
					put(grammarAccess.getListOfListValuesAccess().getListAssignment_1(), "rule__ListOfListValues__ListAssignment_1");
					put(grammarAccess.getListOfListValuesAccess().getListAssignment_3_2(), "rule__ListOfListValues__ListAssignment_3_2");
					put(grammarAccess.getListOfIDsAccess().getIdsAssignment(), "rule__ListOfIDs__IdsAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public THLCLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(THLCLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
