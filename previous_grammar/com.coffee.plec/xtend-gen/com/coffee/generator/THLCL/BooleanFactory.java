package com.coffee.generator.THLCL;

import com.coffee.generator.FODAFactory;
import com.coffee.generator.THLCL.THLCLFactory;
import com.coffee.pLEC.Assignment;
import com.coffee.pLEC.BoolVal;
import com.coffee.pLEC.Structural;
import com.coffee.pLEC.Value;
import com.coffee.pLEC.VarDeclaration;
import com.coffee.pLEC.VariantDeclaration;
import com.google.common.base.Objects;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class BooleanFactory extends THLCLFactory implements FODAFactory {
  /**
   * All variables are boolean variables, there is no need to declare the domains
   */
  @Override
  public CharSequence getVariable(final VarDeclaration variable) {
    StringConcatenation _builder = new StringConcatenation();
    String _type = variable.getType();
    _builder.append(_type);
    _builder.append(" ");
    String _name = variable.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence getOptional(final VarDeclaration parent, final VarDeclaration child) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = child.getName();
    _builder.append(_name);
    _builder.append(" => ");
    String _name_1 = parent.getName();
    _builder.append(_name_1);
    return _builder;
  }
  
  @Override
  public CharSequence getMandatory(final VarDeclaration parent, final VarDeclaration child) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = parent.getName();
    _builder.append(_name);
    _builder.append(" <=> ");
    String _name_1 = child.getName();
    _builder.append(_name_1);
    return _builder;
  }
  
  @Override
  public CharSequence getExcludes(final VarDeclaration left, final VarDeclaration right) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("~(");
    String _name = left.getName();
    _builder.append(_name);
    _builder.append(" AND ");
    String _name_1 = right.getName();
    _builder.append(_name_1);
    _builder.append(")");
    return _builder;
  }
  
  @Override
  public CharSequence getRequires(final VarDeclaration left, final VarDeclaration right) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = left.getName();
    _builder.append(_name);
    _builder.append(" => ");
    String _name_1 = right.getName();
    _builder.append(_name_1);
    return _builder;
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
            parents.put(child.getName(), exp.getParent());
            String childrenIds = "";
            EList<VarDeclaration> _ids_1 = exp.getGroup().getIds();
            for (final VarDeclaration inChild : _ids_1) {
              String _name = child.getName();
              String _name_1 = inChild.getName();
              boolean _equals = Objects.equal(_name, _name_1);
              boolean _not = (!_equals);
              if (_not) {
                String _childrenIds = childrenIds;
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("~");
                String _name_2 = inChild.getName();
                _builder.append(_name_2);
                _builder.append(" AND ");
                childrenIds = (_childrenIds + _builder);
              }
            }
            String _output = output;
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("(");
            String _name_3 = child.getName();
            _builder_1.append(_name_3);
            _builder_1.append(" <=> (");
            _builder_1.append(childrenIds);
            _builder_1.append(" ");
            String _name_4 = exp.getParent().getName();
            _builder_1.append(_name_4);
            _builder_1.append(")) AND");
            _builder_1.newLineIfNotEmpty();
            output = (_output + _builder_1);
          }
        }
        int _length = output.length();
        int _minus = (_length - 4);
        output = output.substring(0, _minus);
      } else {
        if (((exp.getMin().getValue() == 0) && (exp.getMax().getValue() == 1))) {
          String childrenIds = "";
          EList<VarDeclaration> _ids_1 = exp.getGroup().getIds();
          for (final VarDeclaration child_1 : _ids_1) {
            {
              String _childrenIds = childrenIds;
              String _name = child_1.getName();
              String _plus = (_name + " AND ");
              childrenIds = (_childrenIds + _plus);
              parents.put(child_1.getName(), exp.getParent());
            }
          }
          StringConcatenation _builder = new StringConcatenation();
          String _name = exp.getParent().getName();
          _builder.append(_name);
          _builder.append(" <=> (");
          int _length_1 = childrenIds.length();
          int _minus_1 = (_length_1 - 4);
          String _substring = childrenIds.substring(0, _minus_1);
          _builder.append(_substring);
          _builder.append(" )");
          output = _builder.toString();
        } else {
          if (((exp.getMin().getValue() == 0) && (exp.getMax().getValue() > 1))) {
            String childrenIds_1 = "";
            EList<VarDeclaration> _ids_2 = exp.getGroup().getIds();
            for (final VarDeclaration child_2 : _ids_2) {
              {
                String _childrenIds = childrenIds_1;
                String _name_1 = child_2.getName();
                String _plus = (_name_1 + " OR ");
                childrenIds_1 = (_childrenIds + _plus);
                parents.put(child_2.getName(), exp.getParent());
              }
            }
            StringConcatenation _builder_1 = new StringConcatenation();
            String _name_1 = exp.getParent().getName();
            _builder_1.append(_name_1);
            _builder_1.append(" <=> (");
            int _length_2 = childrenIds_1.length();
            int _minus_2 = (_length_2 - 3);
            String _substring_1 = childrenIds_1.substring(0, _minus_2);
            _builder_1.append(_substring_1);
            _builder_1.append(")");
            output = _builder_1.toString();
          }
        }
      }
      _xblockexpression = output;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence getAssignement(final Assignment exp) {
    String _xblockexpression = null;
    {
      String output = "";
      String _xifexpression = null;
      Value _valu = exp.getValu();
      String _value = ((BoolVal) _valu).getValue();
      boolean _equals = Objects.equal(_value, "selected");
      if (_equals) {
        StringConcatenation _builder = new StringConcatenation();
        String _name = exp.getVariable().getName();
        _builder.append(_name);
        _builder.append(" = 1");
        _xifexpression = output = _builder.toString();
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        String _name_1 = exp.getVariable().getName();
        _builder_1.append(_name_1);
        _builder_1.append(" = 0");
        _xifexpression = output = _builder_1.toString();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
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
