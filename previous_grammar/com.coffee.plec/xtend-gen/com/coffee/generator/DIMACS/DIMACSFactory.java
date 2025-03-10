package com.coffee.generator.DIMACS;

import com.coffee.generator.CodeFactory;
import com.coffee.generator.FODAFactory;
import com.coffee.pLEC.Assignment;
import com.coffee.pLEC.BoolVal;
import com.coffee.pLEC.RootRefinement;
import com.coffee.pLEC.Structural;
import com.coffee.pLEC.Value;
import com.coffee.pLEC.VarDeclaration;
import com.coffee.pLEC.VariantDeclaration;
import com.google.common.base.Objects;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class DIMACSFactory extends CodeFactory implements FODAFactory {
  /**
   * Strings in the Textual DIMACS format
   */
  private final static String HEADER = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("c");
      _builder.newLine();
      _builder.append("c DIMACS code generated using the Coffee framework");
      _builder.newLine();
      _builder.append("c");
      _builder.newLine();
      return _builder.toString();
    }
  }.apply();
  
  /**
   * number of clauses in the problem
   */
  protected int numClauses;
  
  /**
   * Map of variables to obtain the numeric Id using the name of
   * the variable as key
   */
  protected Map<String, Integer> variables;
  
  /**
   * Constructor
   */
  public DIMACSFactory() {
    this.numClauses = 0;
    HashMap<String, Integer> _hashMap = new HashMap<String, Integer>();
    this.variables = _hashMap;
  }
  
  /**
   * @returns returns the code generated for the
   * header of a CNF file in the DIMACS format
   */
  public String getHeader() {
    return DIMACSFactory.HEADER;
  }
  
  /**
   * This method includes the variable name in a variables map to obtain an
   * integer for the DIMACS transformation
   * @param variable is a VarDeclaration
   * @return the empty String, variables are not translated in the DIMCAS code
   */
  @Override
  public CharSequence getVariable(final VarDeclaration variable) {
    CharSequence _xblockexpression = null;
    {
      int _size = this.variables.keySet().size();
      final int id = (_size + 1);
      this.variables.put(variable.getName(), Integer.valueOf(id));
      StringConcatenation _builder = new StringConcatenation();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  /**
   * @param
   * @param
   * @returns the CNF representation of an optional relation
   */
  @Override
  public CharSequence getOptional(final VarDeclaration parent, final VarDeclaration child) {
    CharSequence _xblockexpression = null;
    {
      this.addNumClauses(1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("-");
      Integer _get = this.variables.get(child.getName());
      _builder.append(_get);
      _builder.append(" ");
      Integer _get_1 = this.variables.get(parent.getName());
      _builder.append(_get_1);
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence getMandatory(final VarDeclaration parent, final VarDeclaration child) {
    CharSequence _xblockexpression = null;
    {
      this.addNumClauses(2);
      StringConcatenation _builder = new StringConcatenation();
      Integer _get = this.variables.get(parent.getName());
      _builder.append(_get);
      _builder.append(" -");
      Integer _get_1 = this.variables.get(child.getName());
      _builder.append(_get_1);
      _builder.newLineIfNotEmpty();
      _builder.append("-");
      Integer _get_2 = this.variables.get(parent.getName());
      _builder.append(_get_2);
      _builder.append(" ");
      Integer _get_3 = this.variables.get(child.getName());
      _builder.append(_get_3);
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence getExcludes(final VarDeclaration left, final VarDeclaration right) {
    CharSequence _xblockexpression = null;
    {
      this.addNumClauses(1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("-");
      Integer _get = this.variables.get(left.getName());
      _builder.append(_get);
      _builder.append(" -");
      Integer _get_1 = this.variables.get(right.getName());
      _builder.append(_get_1);
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence getRequires(final VarDeclaration left, final VarDeclaration right) {
    CharSequence _xblockexpression = null;
    {
      this.addNumClauses(1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("-");
      Integer _get = this.variables.get(left.getName());
      _builder.append(_get);
      _builder.append(" ");
      Integer _get_1 = this.variables.get(right.getName());
      _builder.append(_get_1);
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence getGroupCardinality(final Structural exp, final Map<String, VarDeclaration> parents) {
    String _xblockexpression = null;
    {
      String output = "";
      if (((exp.getMin().getValue() == 1) && (exp.getMax().getValue() == 1))) {
        EList<VarDeclaration> _ids = exp.getGroup().getIds();
        for (final VarDeclaration child : _ids) {
          {
            int _size = exp.getGroup().getIds().size();
            int _plus = (_size + 1);
            this.addNumClauses(_plus);
            parents.put(child.getName(), exp.getParent());
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("-");
            Integer _get = this.variables.get(exp.getParent().getName());
            _builder.append(_get);
            _builder.append(" ");
            Integer _get_1 = this.variables.get(child.getName());
            _builder.append(_get_1);
            String singleClause = _builder.toString();
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("-");
            Integer _get_2 = this.variables.get(child.getName());
            _builder_1.append(_get_2);
            _builder_1.append(" ");
            Integer _get_3 = this.variables.get(exp.getParent().getName());
            _builder_1.append(_get_3);
            _builder_1.newLineIfNotEmpty();
            String clauses = _builder_1.toString();
            EList<VarDeclaration> _ids_1 = exp.getGroup().getIds();
            for (final VarDeclaration inChild : _ids_1) {
              String _name = child.getName();
              String _name_1 = inChild.getName();
              boolean _equals = Objects.equal(_name, _name_1);
              boolean _not = (!_equals);
              if (_not) {
                String _singleClause = singleClause;
                StringConcatenation _builder_2 = new StringConcatenation();
                _builder_2.append(" ");
                Integer _get_4 = this.variables.get(inChild.getName());
                _builder_2.append(_get_4, " ");
                singleClause = (_singleClause + _builder_2);
                String _clauses = clauses;
                StringConcatenation _builder_3 = new StringConcatenation();
                _builder_3.append("-");
                Integer _get_5 = this.variables.get(child.getName());
                _builder_3.append(_get_5);
                _builder_3.append(" -");
                Integer _get_6 = this.variables.get(inChild.getName());
                _builder_3.append(_get_6);
                _builder_3.newLineIfNotEmpty();
                clauses = (_clauses + _builder_3);
              }
            }
            String _output = output;
            StringConcatenation _builder_4 = new StringConcatenation();
            _builder_4.append(singleClause);
            _builder_4.newLineIfNotEmpty();
            _builder_4.append(clauses);
            _builder_4.newLineIfNotEmpty();
            output = (_output + _builder_4);
          }
        }
      } else {
        if (((exp.getMin().getValue() == 0) && (exp.getMax().getValue() > 1))) {
          int _size = exp.getGroup().getIds().size();
          int _plus = (_size + 1);
          this.addNumClauses(_plus);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("-");
          Integer _get = this.variables.get(exp.getParent().getName());
          _builder.append(_get);
          String singleClause = _builder.toString();
          String clauses = "";
          EList<VarDeclaration> _ids_1 = exp.getGroup().getIds();
          for (final VarDeclaration child_1 : _ids_1) {
            {
              String _singleClause = singleClause;
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append(" ");
              Integer _get_1 = this.variables.get(child_1.getName());
              _builder_1.append(_get_1, " ");
              singleClause = (_singleClause + _builder_1);
              String _clauses = clauses;
              StringConcatenation _builder_2 = new StringConcatenation();
              Integer _get_2 = this.variables.get(exp.getParent().getName());
              _builder_2.append(_get_2);
              _builder_2.append(" -");
              Integer _get_3 = this.variables.get(child_1.getName());
              _builder_2.append(_get_3);
              _builder_2.newLineIfNotEmpty();
              clauses = (_clauses + _builder_2);
              parents.put(child_1.getName(), exp.getParent());
            }
          }
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(singleClause);
          _builder_1.newLineIfNotEmpty();
          _builder_1.append(clauses);
          _builder_1.newLineIfNotEmpty();
          output = _builder_1.toString();
        }
      }
      _xblockexpression = output;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence getRootConstraint(final RootRefinement exp) {
    CharSequence _xblockexpression = null;
    {
      this.addNumClauses(1);
      StringConcatenation _builder = new StringConcatenation();
      Integer _get = this.variables.get(exp.getVar().getName());
      _builder.append(_get);
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence getAssignement(final Assignment exp) {
    String _xblockexpression = null;
    {
      String output = "";
      this.addNumClauses(1);
      String _xifexpression = null;
      Value _valu = exp.getValu();
      String _value = ((BoolVal) _valu).getValue();
      boolean _equals = Objects.equal(_value, "selected");
      if (_equals) {
        StringConcatenation _builder = new StringConcatenation();
        Integer _get = this.variables.get(exp.getVariable().getName());
        _builder.append(_get);
        _xifexpression = output = _builder.toString();
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("~");
        Integer _get_1 = this.variables.get(exp.getVariable().getName());
        _builder_1.append(_get_1);
        _xifexpression = output = _builder_1.toString();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  /**
   * Increased the count of clauses by the number in amount
   * @param number of clauses to add
   */
  public void addNumClauses(final int amount) {
    int _numClauses = this.numClauses;
    this.numClauses = (_numClauses + amount);
  }
  
  /**
   * @return returns the number of variables in the problem
   */
  public int getNumVars() {
    return this.variables.keySet().size();
  }
  
  /**
   * @return returns the number of generated clauses
   */
  public int getNumClauses() {
    return this.numClauses;
  }
  
  /**
   * ===================================================================
   * ===================================================================
   * Unsupported methods for this notation
   */
  @Override
  public CharSequence getValuesDeclaration(final VarDeclaration variable, final VariantDeclaration variant) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
