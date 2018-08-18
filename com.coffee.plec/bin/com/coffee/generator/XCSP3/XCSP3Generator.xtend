package com.coffee.generator.XCSP3

import com.coffee.pLEC.Model
import com.coffee.generator.Generator
import com.coffee.pLEC.Structural
import com.coffee.pLEC.ConsExpression
import com.coffee.pLEC.Rule
import com.coffee.pLEC.FodaBin
import com.coffee.pLEC.FodaUN
import com.coffee.pLEC.Attributes
import com.coffee.generator.TypeOfProblem
import com.coffee.pLEC.IDCons
import com.coffee.generator.CodeFactory

//data structure imports
import java.util.Map
import java.util.HashMap


/**
 * Code generator for parse from the PLEC language to the XML Constraint Satisfaction 
 * Problem specification (XCSP)
 * This class implements the Generator interface
 * @author Angela Villota
 * @version PLEC V3
 * August 2018
 */

class XCSP3Generator implements Generator{
	/**
	 * Name of the PL model 
	 */
	private String modelName
	
	/**
	 * type of problem can be 
	 * - SAT, for boolean variables and constraints 
	 * - CSP, for mixed boolean and integer variables and constraints
	 * - COP, for an optimization constraint problem
	 */
	private TypeOfProblem typeOfProblem
	/**
	 * object to obtain the constraints regarding the type of the problem
	 */
	private CodeFactory factory;
	
	/**
	 * Map with the parent of each variable, for structural relations
	 */
	private Map <String, String> parents;
	
		/**
	 * Constructor method 
	 * @param the name of the model
	 */
	new(String name, TypeOfProblem type) {
		modelName= name
		typeOfProblem= type
		switch typeOfProblem{
			 case SAT: factory= new SATFactory()
			 case CSP: factory= new CSPFactory()
			 case COP: factory= new SATFactory()
		}
		//initializing the data sctucture with the map of parents
		parents= new HashMap<String,String>();
	}

	


	override parseModel(Model model) {
		'''
		«factory.getHeader» «modelName»
		«factory.getVarLabel»
		«putAutogeneratedVars()»
		«parseVariables(model)»
		«factory.getConsLabel»
		«putAutogeneratedCons()»
		«parseConstraints(model)»
		«factory.getStrategy()»
		'''
	}
		
	override parseConstraints(Model model) {
		'''
		«FOR c : model.constraints»
			«IF c.exp instanceof Structural »
				«var exp= c.exp as Structural»
				«IF exp.min===null && exp.max===null »
					«parseStructuralNoCard( exp)»
				«ELSE»
					«c.name»: «parseExpression(c.exp)»
				«ENDIF»
			«ELSE»
				«c.name»: «parseExpression(c.exp)»
			«ENDIF»	
		«ENDFOR»
		'''
	}
	override parseVariables(Model model) {
		'''
		«FOR variable : model.vars»
			«factory.getVariable(variable)» 
		«ENDFOR»
		'''
	}
	
	override parseExpression(ConsExpression exp) {
		'''
		«IF exp instanceof IDCons»
					«exp.name»
				«ELSE»
					«IF exp instanceof FodaBin»
						«parseFodaBinary(exp)»
					«ELSE»
						«IF exp instanceof Rule»
							«parseRule(exp)»
						«ELSE»
							«IF exp instanceof Structural»
								«parseStructuralCard(exp)»
							«ELSE»
								«IF exp instanceof FodaUN»
									«parseFodaUnary(exp)»
								«ELSE»
									«IF exp instanceof Attributes»
										«parseAttributes(exp)»
									«ENDIF»
								«ENDIF»
							«ENDIF»
						«ENDIF»
					«ENDIF»
				«ENDIF»
		'''
	}
	
	override parseRule(Rule rule) {
		'''
		«val left= parseExpression(rule.condition as ConsExpression)»
		«val right= parseExpression (rule.consequence as ConsExpression)»
		(«left») => («right»)
		'''
	}
	
	override parseStructuralNoCard(Structural exp) {
		'''
		«setParents(exp)»
		'''
	}
	
	override parseStructuralCard(Structural exp) {
		factory.getGroupCardinality(exp, parents)
	}
	
	override parseFodaBinary(FodaBin exp) {
		'''
		'''
	}
	
	override parseFodaUnary(FodaUN exp) {
		'''
		'''
	}
	
	override parseAttributes(Attributes exp) {
		'''
		'''
	}
	
	override getClonConstraints() {
		'''
		'''
	}
	
	override setParents(Structural exp) {
		for (element : exp.group.ids) {
			parents.put(element.name, exp.parent)
		}
	}
	
	override getModelName() {
		return  modelName
	}
	
	override putAutogeneratedVars() {
		'''
		boolean «modelName»
		'''
	}
	
	override putAutogeneratedCons() {
		'''
		C_«modelName» : «modelName» = 1
		«getClonConstraints()»
		'''
	}
	
}