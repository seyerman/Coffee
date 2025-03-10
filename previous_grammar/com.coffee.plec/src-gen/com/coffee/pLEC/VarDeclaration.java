/**
 * generated by Xtext 2.12.0
 */
package com.coffee.pLEC;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.pLEC.VarDeclaration#getInstantiable <em>Instantiable</em>}</li>
 *   <li>{@link com.coffee.pLEC.VarDeclaration#getMin <em>Min</em>}</li>
 *   <li>{@link com.coffee.pLEC.VarDeclaration#getMax <em>Max</em>}</li>
 *   <li>{@link com.coffee.pLEC.VarDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link com.coffee.pLEC.VarDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link com.coffee.pLEC.VarDeclaration#getVariants <em>Variants</em>}</li>
 * </ul>
 *
 * @see com.coffee.pLEC.PLECPackage#getVarDeclaration()
 * @model
 * @generated
 */
public interface VarDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Instantiable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instantiable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instantiable</em>' attribute.
   * @see #setInstantiable(String)
   * @see com.coffee.pLEC.PLECPackage#getVarDeclaration_Instantiable()
   * @model
   * @generated
   */
  String getInstantiable();

  /**
   * Sets the value of the '{@link com.coffee.pLEC.VarDeclaration#getInstantiable <em>Instantiable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instantiable</em>' attribute.
   * @see #getInstantiable()
   * @generated
   */
  void setInstantiable(String value);

  /**
   * Returns the value of the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' containment reference.
   * @see #setMin(com.coffee.pLEC.Number)
   * @see com.coffee.pLEC.PLECPackage#getVarDeclaration_Min()
   * @model containment="true"
   * @generated
   */
  com.coffee.pLEC.Number getMin();

  /**
   * Sets the value of the '{@link com.coffee.pLEC.VarDeclaration#getMin <em>Min</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' containment reference.
   * @see #getMin()
   * @generated
   */
  void setMin(com.coffee.pLEC.Number value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' containment reference.
   * @see #setMax(com.coffee.pLEC.Number)
   * @see com.coffee.pLEC.PLECPackage#getVarDeclaration_Max()
   * @model containment="true"
   * @generated
   */
  com.coffee.pLEC.Number getMax();

  /**
   * Sets the value of the '{@link com.coffee.pLEC.VarDeclaration#getMax <em>Max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' containment reference.
   * @see #getMax()
   * @generated
   */
  void setMax(com.coffee.pLEC.Number value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see com.coffee.pLEC.PLECPackage#getVarDeclaration_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link com.coffee.pLEC.VarDeclaration#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.coffee.pLEC.PLECPackage#getVarDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.coffee.pLEC.VarDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Variants</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variants</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variants</em>' containment reference.
   * @see #setVariants(VariantDeclaration)
   * @see com.coffee.pLEC.PLECPackage#getVarDeclaration_Variants()
   * @model containment="true"
   * @generated
   */
  VariantDeclaration getVariants();

  /**
   * Sets the value of the '{@link com.coffee.pLEC.VarDeclaration#getVariants <em>Variants</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variants</em>' containment reference.
   * @see #getVariants()
   * @generated
   */
  void setVariants(VariantDeclaration value);

} // VarDeclaration
