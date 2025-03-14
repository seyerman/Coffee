/*
 * generated by Xtext 2.12.0
 */
package com.coffee.parser.antlr;

import com.coffee.parser.antlr.internal.InternalTHLCLParser;
import com.coffee.services.THLCLGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class THLCLParser extends AbstractAntlrParser {

	@Inject
	private THLCLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTHLCLParser createParser(XtextTokenStream stream) {
		return new InternalTHLCLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public THLCLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(THLCLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
