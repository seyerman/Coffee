/*
 * generated by Xtext 2.12.0
 */
package org.xtext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class HLCLSpecificationLanguageStandaloneSetup extends HLCLSpecificationLanguageStandaloneSetupGenerated {

	def static void doSetup() {
		new HLCLSpecificationLanguageStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
