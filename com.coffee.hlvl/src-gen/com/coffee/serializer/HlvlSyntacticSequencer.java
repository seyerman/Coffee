/*
 * generated by Xtext 2.12.0
 */
package com.coffee.serializer;

import com.coffee.services.HlvlGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class HlvlSyntacticSequencer extends AbstractSyntacticSequencer {

	protected HlvlGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ListOfIDs_CommaKeyword_1_0_p;
	protected AbstractElementAlias match_ListOfListValues_CommaKeyword_3_0_p;
	protected AbstractElementAlias match_ListOfRelRefs_CommaKeyword_1_0_p;
	protected AbstractElementAlias match_ListOfValuation_CommaKeyword_1_0_p;
	protected AbstractElementAlias match_ListOfValues_CommaKeyword_1_0_p;
	protected AbstractElementAlias match_Names_CommaKeyword_1_0_p;
	protected AbstractElementAlias match_Operations_CommaKeyword_1_0_p;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_0_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (HlvlGrammarAccess) access;
		match_ListOfIDs_CommaKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getListOfIDsAccess().getCommaKeyword_1_0());
		match_ListOfListValues_CommaKeyword_3_0_p = new TokenAlias(true, false, grammarAccess.getListOfListValuesAccess().getCommaKeyword_3_0());
		match_ListOfRelRefs_CommaKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getListOfRelRefsAccess().getCommaKeyword_1_0());
		match_ListOfValuation_CommaKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getListOfValuationAccess().getCommaKeyword_1_0());
		match_ListOfValues_CommaKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getListOfValuesAccess().getCommaKeyword_1_0());
		match_Names_CommaKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getNamesAccess().getCommaKeyword_1_0());
		match_Operations_CommaKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getOperationsAccess().getCommaKeyword_1_0());
		match_Primary_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
		match_Primary_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ListOfIDs_CommaKeyword_1_0_p.equals(syntax))
				emit_ListOfIDs_CommaKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ListOfListValues_CommaKeyword_3_0_p.equals(syntax))
				emit_ListOfListValues_CommaKeyword_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ListOfRelRefs_CommaKeyword_1_0_p.equals(syntax))
				emit_ListOfRelRefs_CommaKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ListOfValuation_CommaKeyword_1_0_p.equals(syntax))
				emit_ListOfValuation_CommaKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ListOfValues_CommaKeyword_1_0_p.equals(syntax))
				emit_ListOfValues_CommaKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Names_CommaKeyword_1_0_p.equals(syntax))
				emit_Names_CommaKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Operations_CommaKeyword_1_0_p.equals(syntax))
				emit_Operations_CommaKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ','+
	 *
	 * This ambiguous syntax occurs at:
	 *     values+=[ElmDeclaration|ID] (ambiguity) values+=[ElmDeclaration|ID]
	 */
	protected void emit_ListOfIDs_CommaKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','+
	 *
	 * This ambiguous syntax occurs at:
	 *     list+=ListOfValues ']' (ambiguity) '[' list+=ListOfValues
	 */
	protected void emit_ListOfListValues_CommaKeyword_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','+
	 *
	 * This ambiguous syntax occurs at:
	 *     ids+=[RelDeclaration|ID] (ambiguity) ids+=[RelDeclaration|ID]
	 */
	protected void emit_ListOfRelRefs_CommaKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','+
	 *
	 * This ambiguous syntax occurs at:
	 *     pairs+=Valuation (ambiguity) pairs+=Valuation
	 */
	protected void emit_ListOfValuation_CommaKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','+
	 *
	 * This ambiguous syntax occurs at:
	 *     values+=Value (ambiguity) values+=Value
	 */
	protected void emit_ListOfValues_CommaKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','+
	 *
	 * This ambiguous syntax occurs at:
	 *     ids+=ID (ambiguity) ids+=ID
	 */
	protected void emit_Names_CommaKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','+
	 *
	 * This ambiguous syntax occurs at:
	 *     op+=Operation (ambiguity) op+=Operation
	 */
	protected void emit_Operations_CommaKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '~' expression=Primary
	 *     (rule start) (ambiguity) attribute=QualifiedName
	 *     (rule start) (ambiguity) op=FunctionOp
	 *     (rule start) (ambiguity) op=UnaryOp
	 *     (rule start) (ambiguity) value='false'
	 *     (rule start) (ambiguity) value='true'
	 *     (rule start) (ambiguity) value=INT
	 *     (rule start) (ambiguity) variable=[ElmDeclaration|ID]
	 *     (rule start) (ambiguity) {And.left=}
	 *     (rule start) (ambiguity) {Comparison.left=}
	 *     (rule start) (ambiguity) {Equality.left=}
	 *     (rule start) (ambiguity) {Iff.left=}
	 *     (rule start) (ambiguity) {Implies.left=}
	 *     (rule start) (ambiguity) {Minus.left=}
	 *     (rule start) (ambiguity) {MulOrDiv.left=}
	 *     (rule start) (ambiguity) {Or.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 */
	protected void emit_Primary_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {And.left=}
	 *     (rule start) (ambiguity) {Comparison.left=}
	 *     (rule start) (ambiguity) {Equality.left=}
	 *     (rule start) (ambiguity) {Iff.left=}
	 *     (rule start) (ambiguity) {Implies.left=}
	 *     (rule start) (ambiguity) {Minus.left=}
	 *     (rule start) (ambiguity) {MulOrDiv.left=}
	 *     (rule start) (ambiguity) {Or.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 */
	protected void emit_Primary_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
