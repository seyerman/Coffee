/*
 * generated by Xtext 2.12.0
 */
package com.coffee.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import com.coffee.pLEC.Model
import com.coffee.pLEC.PLECPackage

/**
 * Class to test the product lines grammar and its parsing
 * @author Angela Villota
 * @version CP-HLCL V2
 * July 2018
 */
@RunWith(XtextRunner)
@InjectWith(PLECInjectorProvider)
class TransformationTests {
	@Inject
	ParseHelper<Model> parseHelper
	@Inject extension ParseHelper
	@Inject extension ValidationTestHelper
	
/*********************************************************************************************************
 * Methods to test the FODA transformation rules using the GPL example
 * 
 */	
	/**
	 * Method to test the interpretation of an empty program
	 */
	@Test
	def void FODA() {
		// model is a program in PLEC
		val program = 
		'''
		 model GPL
		 variables:
		 boolean GType
		 boolean Weight
		 boolean Search
		 boolean Algorithms
		 boolean Directed
		 boolean Undirected
		 boolean Weighted
		 boolean Unweighted
		 boolean BFS
		 boolean DFS
		 boolean Kruskal
		 boolean CycleCheck
		 boolean StronglyCon
		 boolean VertexNum
		 boolean ConnComp
		 boolean SSP
		 boolean Prim
		 constraints:
		 //Hierarchical constraints
		 c1: structural: GPL variants: [GType, Weight, Search, Algorithms]
		 c2: GType is mandatory
		 c3: Algorithms is mandatory
		 c4: Weight is optional
		 c5: Search is optional
		 // Alternative
		 c6: structural: GType variants: [Directed, Undirected] card: [1,1]
		 c7: structural: Weight variants: [Weighted, Unweighted] card: [1,1]
		 c8: structural: Search variants: [BFS, DFS] card: [1,1]
		 // Or
		 c9: structural: Algorithms variants: [Kruskal, CycleCheck, StronglyCon, VertexNum, ConnComp, SSP, Prim] card: [0,7] 
		 // Traversal constraints
		 //requieres
		 c10: CycleCheck requires DFS
		 C11: StronglyCon requires Directed
		 C12: StronglyCon requires DFS
		 C13: VertexNum requires Search
		 C14: ConnComp requires Undirected
		 C15: Kruskal requires Undirected
		 C16: Kruskal requires Weighted
		 C17: Prim requires  Undirected
		 C18: Prim requires Weighted
		 C19: SSP requires Directed
		 C20: SSP requires Weighted 
		 //excludes
		 C21: StronglyCon excludes ConnComp
		 C22: StronglyCon excludes Kruskal
		 C23: StronglyCon excludes Prim
		 C24: SSP excludes ConnComp
		 C25: SSP excludes Kruskal
		 C26: SSP excludes Prim 
		'''
		//model is the model obtained after parsing
		val model = parseHelper.parse(program)
		Assert.assertNotNull(model)
		Assert.assertTrue(model.eResource.errors.isEmpty)
	}
	



	/**********************************************************************************************************
	 * Auxiliar methods for testing
	 */
	/**to print the parsing errors */
	def void printErrors(Model model){
		if (!model.eResource.errors.isEmpty){
			for (element : model.eResource.errors) {
				println( element.message)
			}
		}
		
	}
	
}
