package com.coffee.generator.XCSP3;

import com.coffee.generator.AbstractGenerator;
import com.coffee.generator.TypeOfProblem;
import com.coffee.generator.XCSP3.COPFactory;
import com.coffee.generator.XCSP3.CSPFactory;
import com.coffee.generator.XCSP3.XCSP3Factory;
import com.coffee.pLEC.Attributes;
import com.coffee.pLEC.ConsExpression;
import com.coffee.pLEC.Expression;
import com.coffee.pLEC.Model;
import com.coffee.pLEC.Quantifiable;
import com.coffee.pLEC.Rule;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * Code generator for parse from the PLEC language to the XML Constraint Satisfaction
 * Problem specification (XCSP)
 * This class implements the Generator interface
 * @author Angela Villota
 * @version PLEC V3
 * August 2018
 */
@SuppressWarnings("all")
public class XCSP3Generator extends AbstractGenerator {
  /**
   * object to obtain the constraints regarding the type of the problem
   */
  private XCSP3Factory factory;
  
  /**
   * Constructor method
   * @param name the name of the model
   * @param type is the TypeOfProblem (CSP, COP)
   */
  public XCSP3Generator(final String name, final TypeOfProblem type) {
    super(name, type);
    TypeOfProblem _typeOfProblem = this.getTypeOfProblem();
    if (_typeOfProblem != null) {
      switch (_typeOfProblem) {
        case COP:
          COPFactory _cOPFactory = new COPFactory(type);
          this.factory = _cOPFactory;
          break;
        default:
          CSPFactory _cSPFactory = new CSPFactory(type);
          this.factory = _cSPFactory;
          break;
      }
    } else {
      CSPFactory _cSPFactory = new CSPFactory(type);
      this.factory = _cSPFactory;
    }
    this.setFactory(this.factory);
  }
  
  /**
   * Method to produce a sequence of characters with the
   * model represented as a Constraint Satisfaction Problem (CSP)
   * using  the using  the XCSP notation (model.xml)
   * @param model is an ECORE syntax tree with the program
   * this syntax tree should be traversed.
   */
  @Override
  public CharSequence parseModel(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    String _header = this.factory.getHeader();
    _builder.append(_header);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    String _varLabel = this.factory.getVarLabel();
    _builder.append(_varLabel);
    _builder.newLineIfNotEmpty();
    CharSequence _parseVariables = this.parseVariables(model);
    _builder.append(_parseVariables);
    _builder.newLineIfNotEmpty();
    String _varLabelClose = this.factory.getVarLabelClose();
    _builder.append(_varLabelClose);
    _builder.newLineIfNotEmpty();
    String _consLabel = this.factory.getConsLabel();
    _builder.append(_consLabel);
    _builder.newLineIfNotEmpty();
    CharSequence _parseConstraints = this.parseConstraints(model);
    _builder.append(_parseConstraints);
    _builder.newLineIfNotEmpty();
    String _consLabelClose = this.factory.getConsLabelClose();
    _builder.append(_consLabelClose);
    _builder.newLineIfNotEmpty();
    CharSequence _strategy = this.factory.getStrategy();
    _builder.append(_strategy);
    _builder.newLineIfNotEmpty();
    String _footer = this.factory.getFooter();
    _builder.append(_footer);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence parseRule(final Rule rule) {
    CharSequence _xblockexpression = null;
    {
      Expression _condition = rule.getCondition();
      final CharSequence left = this.parseExpression(((ConsExpression) _condition));
      Expression _consequence = rule.getConsequence();
      final CharSequence right = this.parseExpression(((ConsExpression) _consequence));
      _xblockexpression = this.factory.getRule(left, right);
    }
    return _xblockexpression;
  }
  
  /**
   * For each attribute in the expression exp a constraint of the
   * type element <=> («attribute» > 0) is generated
   * @param exp is an expression of Type Attributes
   */
  @Override
  public CharSequence parseAttributes(final Attributes exp) {
    return this.factory.getAttributes(exp);
  }
  
  /**
   * Returns the generated code for a particular constraint in the XCSP format
   * @param id is a String containing the identifier of the constraint
   * @param exp is a ConsExpression (to be parsed)
   */
  @Override
  public CharSequence parseConstraint(final String id, final ConsExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<intension id= \"");
    _builder.append(id);
    _builder.append("\" >");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _parseExpression = this.parseExpression(exp);
    _builder.append(_parseExpression, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("</intension>");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public CharSequence parseQuantifiable(final Quantifiable exp) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
