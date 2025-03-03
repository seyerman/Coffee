/**
 * generated by Xtext 2.12.0
 */
package com.coffee.hlvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.VariableRef#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see com.coffee.hlvl.HlvlPackage#getVariableRef()
 * @model
 * @generated
 */
public interface VariableRef extends Relational
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(ElmDeclaration)
   * @see com.coffee.hlvl.HlvlPackage#getVariableRef_Variable()
   * @model
   * @generated
   */
  ElmDeclaration getVariable();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.VariableRef#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(ElmDeclaration value);

} // VariableRef
