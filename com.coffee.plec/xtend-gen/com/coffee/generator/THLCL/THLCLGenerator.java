package com.coffee.generator.THLCL;

import com.coffee.generator.CodeFactory;
import com.coffee.generator.Generator;
import com.coffee.generator.THLCL.BooleanFactory;
import com.coffee.generator.THLCL.IntegerFactory;
import com.coffee.generator.THLCL.OptimizationFactory;
import com.coffee.generator.TypeOfProblem;
import com.coffee.pLEC.Attributes;
import com.coffee.pLEC.ConsExpression;
import com.coffee.pLEC.Constraint;
import com.coffee.pLEC.Expression;
import com.coffee.pLEC.FodaBin;
import com.coffee.pLEC.FodaUN;
import com.coffee.pLEC.IDCons;
import com.coffee.pLEC.Model;
import com.coffee.pLEC.Rule;
import com.coffee.pLEC.Structural;
import com.coffee.pLEC.VarDeclaration;
import com.google.common.base.Objects;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * Code generator for parse from the PLEC language to the Textual High Level Constraint
 * Language (THLCL)
 * This class implements the Generator interface
 * @author Angela Villota
 * @version PLEC V3
 * August 2018
 */
@SuppressWarnings("all")
public class THLCLGenerator implements Generator {
  /**
   * Name of the PL model
   */
  private String modelName;
  
  /**
   * type of problem can be
   * - SAT, for boolean variables and constraints
   * - CSP, for mixed boolean and integer variables and constraints
   * - COP, for an optimization constraint problem
   */
  private TypeOfProblem typeOfProblem;
  
  /**
   * object to obtain the constraints regarding the type of the problem
   */
  private CodeFactory factory;
  
  /**
   * Map with the parent of each variable, for structural relations
   */
  private Map<String, VarDeclaration> parents;
  
  /**
   * Constructor method
   * @param the name of the model
   */
  public THLCLGenerator(final String name, final TypeOfProblem type) {
    this.modelName = name;
    this.typeOfProblem = type;
    final TypeOfProblem typeOfProblem = this.typeOfProblem;
    if (typeOfProblem != null) {
      switch (typeOfProblem) {
        case SAT:
          BooleanFactory _booleanFactory = new BooleanFactory();
          this.factory = _booleanFactory;
          break;
        case CSP:
          IntegerFactory _integerFactory = new IntegerFactory();
          this.factory = _integerFactory;
          break;
        case COP:
          OptimizationFactory _optimizationFactory = new OptimizationFactory();
          this.factory = _optimizationFactory;
          break;
        default:
          break;
      }
    }
    HashMap<String, VarDeclaration> _hashMap = new HashMap<String, VarDeclaration>();
    this.parents = _hashMap;
  }
  
  @Override
  public CharSequence parseModel(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _header = this.factory.getHeader();
    _builder.append(_header);
    _builder.append(" ");
    _builder.append(this.modelName);
    _builder.newLineIfNotEmpty();
    CharSequence _varLabel = this.factory.getVarLabel();
    _builder.append(_varLabel);
    _builder.newLineIfNotEmpty();
    CharSequence _putAutogeneratedVars = this.putAutogeneratedVars();
    _builder.append(_putAutogeneratedVars);
    _builder.newLineIfNotEmpty();
    CharSequence _parseVariables = this.parseVariables(model);
    _builder.append(_parseVariables);
    _builder.newLineIfNotEmpty();
    CharSequence _consLabel = this.factory.getConsLabel();
    _builder.append(_consLabel);
    _builder.newLineIfNotEmpty();
    CharSequence _putAutogeneratedCons = this.putAutogeneratedCons();
    _builder.append(_putAutogeneratedCons);
    _builder.newLineIfNotEmpty();
    CharSequence _parseConstraints = this.parseConstraints(model);
    _builder.append(_parseConstraints);
    _builder.newLineIfNotEmpty();
    CharSequence _strategy = this.factory.getStrategy();
    _builder.append(_strategy);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence parseConstraints(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Constraint> _constraints = model.getConstraints();
      for(final Constraint c : _constraints) {
        {
          ConsExpression _exp = c.getExp();
          if ((_exp instanceof Structural)) {
            ConsExpression _exp_1 = c.getExp();
            Structural exp = ((Structural) _exp_1);
            _builder.newLineIfNotEmpty();
            {
              if (((exp.getMin() == null) && (exp.getMax() == null))) {
                CharSequence _parseStructuralNoCard = this.parseStructuralNoCard(exp);
                _builder.append(_parseStructuralNoCard);
                _builder.newLineIfNotEmpty();
              } else {
                String _name = c.getName();
                _builder.append(_name);
                _builder.append(": ");
                CharSequence _parseExpression = this.parseExpression(c.getExp());
                _builder.append(_parseExpression);
                _builder.newLineIfNotEmpty();
              }
            }
          } else {
            String _name_1 = c.getName();
            _builder.append(_name_1);
            _builder.append(": ");
            CharSequence _parseExpression_1 = this.parseExpression(c.getExp());
            _builder.append(_parseExpression_1);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  @Override
  public CharSequence parseVariables(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<VarDeclaration> _vars = model.getVars();
      for(final VarDeclaration variable : _vars) {
        CharSequence _variable = this.factory.getVariable(variable);
        _builder.append(_variable);
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  @Override
  public CharSequence parseExpression(final ConsExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((exp instanceof IDCons)) {
        String _name = ((IDCons)exp).getName();
        _builder.append(_name);
        _builder.newLineIfNotEmpty();
      } else {
        {
          if ((exp instanceof FodaBin)) {
            CharSequence _parseFodaBinary = this.parseFodaBinary(((FodaBin)exp));
            _builder.append(_parseFodaBinary);
            _builder.newLineIfNotEmpty();
          } else {
            {
              if ((exp instanceof Rule)) {
                CharSequence _parseRule = this.parseRule(((Rule)exp));
                _builder.append(_parseRule);
                _builder.newLineIfNotEmpty();
              } else {
                {
                  if ((exp instanceof Structural)) {
                    CharSequence _parseStructuralCard = this.parseStructuralCard(((Structural)exp));
                    _builder.append(_parseStructuralCard);
                    _builder.newLineIfNotEmpty();
                  } else {
                    {
                      if ((exp instanceof FodaUN)) {
                        CharSequence _parseFodaUnary = this.parseFodaUnary(((FodaUN)exp));
                        _builder.append(_parseFodaUnary);
                        _builder.newLineIfNotEmpty();
                      } else {
                        {
                          if ((exp instanceof Attributes)) {
                            CharSequence _parseAttributes = this.parseAttributes(((Attributes)exp));
                            _builder.append(_parseAttributes);
                            _builder.newLineIfNotEmpty();
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  @Override
  public CharSequence parseRule(final Rule rule) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _condition = rule.getCondition();
    final CharSequence left = this.parseExpression(((ConsExpression) _condition));
    _builder.newLineIfNotEmpty();
    Expression _consequence = rule.getConsequence();
    final CharSequence right = this.parseExpression(((ConsExpression) _consequence));
    _builder.newLineIfNotEmpty();
    _builder.append("(");
    _builder.append(left);
    _builder.append(") => (");
    _builder.append(right);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence parseStructuralNoCard(final Structural exp) {
    StringConcatenation _builder = new StringConcatenation();
    this.setParents(exp);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence parseStructuralCard(final Structural exp) {
    return this.factory.getGroupCardinality(exp, this.parents);
  }
  
  @Override
  public CharSequence parseFodaBinary(final FodaBin exp) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _op = exp.getOp();
      boolean _equals = Objects.equal(_op, "requires");
      if (_equals) {
        CharSequence _requires = this.factory.getRequires(exp.getVar1(), exp.getVar2());
        _builder.append(_requires);
        _builder.newLineIfNotEmpty();
      } else {
        {
          String _op_1 = exp.getOp();
          boolean _equals_1 = Objects.equal(_op_1, "excludes");
          if (_equals_1) {
            CharSequence _requires_1 = this.factory.getRequires(exp.getVar1(), exp.getVar2());
            _builder.append(_requires_1);
            _builder.newLineIfNotEmpty();
          } else {
            {
              String _op_2 = exp.getOp();
              boolean _equals_2 = Objects.equal(_op_2, "mandatory");
              if (_equals_2) {
                CharSequence _mandatory = this.factory.getMandatory(exp.getVar1(), exp.getVar2());
                _builder.append(_mandatory);
                _builder.newLineIfNotEmpty();
              } else {
                CharSequence _optional = this.factory.getOptional(exp.getVar1(), exp.getVar2());
                _builder.append(_optional);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  @Override
  public CharSequence parseFodaUnary(final FodaUN exp) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _op = exp.getOp();
      boolean _equals = Objects.equal(_op, "optional");
      if (_equals) {
        CharSequence _optional = this.factory.getOptional(this.parents.get(exp.getVar1().getName()), exp.getVar1());
        _builder.append(_optional);
        _builder.newLineIfNotEmpty();
      } else {
        {
          String _op_1 = exp.getOp();
          boolean _equals_1 = Objects.equal(_op_1, "mandatory");
          if (_equals_1) {
            CharSequence _optional_1 = this.factory.getOptional(this.parents.get(exp.getVar1().getName()), exp.getVar1());
            _builder.append(_optional_1);
            _builder.newLineIfNotEmpty();
          } else {
          }
        }
      }
    }
    return _builder;
  }
  
  /**
   * Falta considerar el caso cuando hay más de un atributo,
   * es decir cuando la lista tiene más de un elemento
   */
  @Override
  public CharSequence parseAttributes(final Attributes exp) {
    StringConcatenation _builder = new StringConcatenation();
    final String left = exp.getVar1().getName();
    _builder.newLineIfNotEmpty();
    {
      EList<VarDeclaration> _ids = exp.getAtt().getIds();
      for(final VarDeclaration att : _ids) {
        _builder.append(left);
        _builder.append(" <=> (");
        String _name = att.getName();
        _builder.append(_name);
        _builder.append(" > 0)");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  @Override
  public void setParents(final Structural exp) {
    EList<VarDeclaration> _ids = exp.getGroup().getIds();
    for (final VarDeclaration element : _ids) {
      this.parents.put(element.getName(), exp.getParent());
    }
  }
  
  @Override
  public String getModelName() {
    return this.modelName;
  }
  
  @Override
  public CharSequence putAutogeneratedVars() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("boolean ");
    _builder.append(this.modelName);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence putAutogeneratedCons() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("C_");
    _builder.append(this.modelName);
    _builder.append(" : ");
    _builder.append(this.modelName);
    _builder.append(" = 1");
    _builder.newLineIfNotEmpty();
    String _clonConstraints = this.factory.getClonConstraints();
    _builder.append(_clonConstraints);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
