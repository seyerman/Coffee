/**
 * generated by Xtext 2.12.0
 */
package com.coffee.tHLCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.tHLCL.Interval#getStart <em>Start</em>}</li>
 *   <li>{@link com.coffee.tHLCL.Interval#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see com.coffee.tHLCL.THLCLPackage#getInterval()
 * @model
 * @generated
 */
public interface Interval extends DomainDeclaration
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' containment reference.
   * @see #setStart(com.coffee.tHLCL.Number)
   * @see com.coffee.tHLCL.THLCLPackage#getInterval_Start()
   * @model containment="true"
   * @generated
   */
  com.coffee.tHLCL.Number getStart();

  /**
   * Sets the value of the '{@link com.coffee.tHLCL.Interval#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(com.coffee.tHLCL.Number value);

  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(com.coffee.tHLCL.Number)
   * @see com.coffee.tHLCL.THLCLPackage#getInterval_End()
   * @model containment="true"
   * @generated
   */
  com.coffee.tHLCL.Number getEnd();

  /**
   * Sets the value of the '{@link com.coffee.tHLCL.Interval#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(com.coffee.tHLCL.Number value);

} // Interval
