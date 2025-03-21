/**
 * generated by Xtext 2.12.0
 */
package com.coffee.hlvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.Enumeration#getList <em>List</em>}</li>
 * </ul>
 *
 * @see com.coffee.hlvl.HlvlPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends OptionsDeclaration
{
  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference.
   * @see #setList(ListOfValues)
   * @see com.coffee.hlvl.HlvlPackage#getEnumeration_List()
   * @model containment="true"
   * @generated
   */
  ListOfValues getList();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.Enumeration#getList <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' containment reference.
   * @see #getList()
   * @generated
   */
  void setList(ListOfValues value);

} // Enumeration
