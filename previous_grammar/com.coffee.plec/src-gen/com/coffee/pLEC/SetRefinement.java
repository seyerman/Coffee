/**
 * generated by Xtext 2.12.0
 */
package com.coffee.pLEC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.pLEC.SetRefinement#getVars <em>Vars</em>}</li>
 *   <li>{@link com.coffee.pLEC.SetRefinement#getList <em>List</em>}</li>
 * </ul>
 *
 * @see com.coffee.pLEC.PLECPackage#getSetRefinement()
 * @model
 * @generated
 */
public interface SetRefinement extends Refinement
{
  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference.
   * @see #setVars(ListOfIDs)
   * @see com.coffee.pLEC.PLECPackage#getSetRefinement_Vars()
   * @model containment="true"
   * @generated
   */
  ListOfIDs getVars();

  /**
   * Sets the value of the '{@link com.coffee.pLEC.SetRefinement#getVars <em>Vars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vars</em>' containment reference.
   * @see #getVars()
   * @generated
   */
  void setVars(ListOfIDs value);

  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference.
   * @see #setList(ListOfListsOfValues)
   * @see com.coffee.pLEC.PLECPackage#getSetRefinement_List()
   * @model containment="true"
   * @generated
   */
  ListOfListsOfValues getList();

  /**
   * Sets the value of the '{@link com.coffee.pLEC.SetRefinement#getList <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' containment reference.
   * @see #getList()
   * @generated
   */
  void setList(ListOfListsOfValues value);

} // SetRefinement
