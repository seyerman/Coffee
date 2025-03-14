package com.coffee.generator;

import com.coffee.generator.CodeFactory;
import com.coffee.generator.TypeOfProblem;
import com.coffee.pLEC.Attributes;
import com.coffee.pLEC.ConsExpression;
import com.coffee.pLEC.FodaBin;
import com.coffee.pLEC.FodaUN;
import com.coffee.pLEC.Model;
import com.coffee.pLEC.Quantifiable;
import com.coffee.pLEC.Refinement;
import com.coffee.pLEC.Rule;
import com.coffee.pLEC.Structural;
import com.coffee.pLEC.VarDeclaration;
import java.util.Map;

/**
 * Interface to define the methods a code generator for the PLEC language
 * should implement, all generators implementation implement this interface
 * implemented by (THLCLGenerator, XCSP3Generator)
 * @author Angela Villota
 * @version PLEC V3
 * August 2018
 */
@SuppressWarnings("all")
public interface Generator {
  public abstract CharSequence parseModel(final Model model);
  
  public abstract CharSequence parseRule(final Rule rule);
  
  public abstract CharSequence parseAttributes(final Attributes exp);
  
  public abstract CharSequence parseConstraint(final String id, final ConsExpression exp);
  
  public abstract CharSequence parseRefinement(final Refinement exp);
  
  public abstract CharSequence parseQuantifiable(final Quantifiable exp);
  
  public abstract CharSequence parseVariables(final Model model);
  
  public abstract CharSequence parseConstraints(final Model model);
  
  public abstract CharSequence parseExpression(final ConsExpression exp);
  
  public abstract CharSequence parseStructuralNoCard(final Structural exp);
  
  public abstract CharSequence parseStructuralCard(final Structural exp);
  
  public abstract CharSequence parseFodaBinary(final FodaBin exp);
  
  public abstract CharSequence parseFodaUnary(final FodaUN exp);
  
  public abstract String getModelName();
  
  public abstract TypeOfProblem getTypeOfProblem();
  
  public abstract void addParents(final Structural exp);
  
  public abstract Map<String, VarDeclaration> getParents();
  
  public abstract void setFactory(final CodeFactory factory);
}
