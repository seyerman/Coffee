package com.coffee.generator.DIMACS

import com.coffee.generator.AbstractGenerator
import com.coffee.pLEC.Model
import com.coffee.pLEC.Rule
import com.coffee.pLEC.Attributes
import com.coffee.pLEC.ConsExpression
import com.coffee.generator.TypeOfProblem
import com.coffee.pLEC.Quantifiable

/**
 * Code generator for parsing from the PLEC language to the DIMACS format
 * This class implements the Generator interface
 * @author Angela Villota
 * @version PLEC V3
 * September 2018
 */

class DIMACSGenerator extends AbstractGenerator {
	
	/**
	 * object to obtain the constraints regarding the type of the problem
	 */
	private  DIMACSFactory factory;
	
	/**
	 * number of clauses in the problem
	 */
	protected int numClauses
	

	
	/**
	 * Constructor method 
	 * @param name the name of the model
	 * @param type is the TypeOfProblem (SAT, CSP)
	 */
	new(String name, TypeOfProblem type) {
		super(name, type)
		factory = new DIMACSFactory()
		setFactory(factory)
	}
	
	/**
	 * Method to produce a sequence of characters with the 
	 * model represented as a Satisbiability Problem (SAT) using  the 
	 * textual DIMACS notation (model.CNF)
	 * @param model is an ECORE syntax tree with the program
	 * this syntax tree should be traversed. 
	 */
	override parseModel(Model model) {
		
		var program= factory.getHeader
		parseVariables(model)
		var clauses= parseConstraints(model)
		program+= 
		'''
		p cnf «factory.getNumClauses» «factory.getNumVars»
		«clauses» 
		'''
		program
	}
	

		
	/**
	 * Returns the generated code for a particular constraint in the DIMACS format
	 * @param id is a String containing the identifier of the constraint
	 * @param exp is a ConsExpression (to be parsed)
	 */	
	override parseConstraint(String id, ConsExpression exp) {
		parseExpression(exp)
	}
	
	/*
	 * Unsupported methods in this notation
	 */
	
	/**
	 * @throws an UnsupportedOperationException
	 */
//	override putAutogeneratedCons() {
//		throw new UnsupportedOperationException("Error: The model cannot have instanciable variables")
//	}
	
		/**
	 * Returns the code associated to a constraint of type Rule
	 * @param rule is an expression of Type Rule
	 */
	override parseRule(Rule rule) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	/**
	 * @param exp is an expression of Type Attributes
	 * @throws an UnsupportedOperationException
	 */
	override parseAttributes(Attributes exp) {
		throw new UnsupportedOperationException("Error: The model cannot have attributes")
	}
	
	override parseQuantifiable(Quantifiable exp) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	

	
}