/**
 * generated by Xtext 2.12.0
 */
package com.coffee.hlvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decomposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.Decomposition#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @see com.coffee.hlvl.HlvlPackage#getDecomposition()
 * @model
 * @generated
 */
public interface Decomposition extends Hierarchy
{
  /**
   * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinality</em>' attribute.
   * @see #setCardinality(int)
   * @see com.coffee.hlvl.HlvlPackage#getDecomposition_Cardinality()
   * @model
   * @generated
   */
  int getCardinality();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.Decomposition#getCardinality <em>Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality</em>' attribute.
   * @see #getCardinality()
   * @generated
   */
  void setCardinality(int value);

} // Decomposition
