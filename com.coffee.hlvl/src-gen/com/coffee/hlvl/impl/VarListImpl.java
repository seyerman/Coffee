/**
 * generated by Xtext 2.12.0
 */
package com.coffee.hlvl.impl;

import com.coffee.hlvl.ElmDeclaration;
import com.coffee.hlvl.HlvlPackage;
import com.coffee.hlvl.ListOfIDs;
import com.coffee.hlvl.VarList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.impl.VarListImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.coffee.hlvl.impl.VarListImpl#getVar1 <em>Var1</em>}</li>
 *   <li>{@link com.coffee.hlvl.impl.VarListImpl#getList <em>List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarListImpl extends RelationImpl implements VarList
{
  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getVar1() <em>Var1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar1()
   * @generated
   * @ordered
   */
  protected ElmDeclaration var1;

  /**
   * The cached value of the '{@link #getList() <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getList()
   * @generated
   * @ordered
   */
  protected ListOfIDs list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarListImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return HlvlPackage.Literals.VAR_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.VAR_LIST__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElmDeclaration getVar1()
  {
    if (var1 != null && var1.eIsProxy())
    {
      InternalEObject oldVar1 = (InternalEObject)var1;
      var1 = (ElmDeclaration)eResolveProxy(oldVar1);
      if (var1 != oldVar1)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HlvlPackage.VAR_LIST__VAR1, oldVar1, var1));
      }
    }
    return var1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElmDeclaration basicGetVar1()
  {
    return var1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar1(ElmDeclaration newVar1)
  {
    ElmDeclaration oldVar1 = var1;
    var1 = newVar1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.VAR_LIST__VAR1, oldVar1, var1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListOfIDs getList()
  {
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetList(ListOfIDs newList, NotificationChain msgs)
  {
    ListOfIDs oldList = list;
    list = newList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HlvlPackage.VAR_LIST__LIST, oldList, newList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setList(ListOfIDs newList)
  {
    if (newList != list)
    {
      NotificationChain msgs = null;
      if (list != null)
        msgs = ((InternalEObject)list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HlvlPackage.VAR_LIST__LIST, null, msgs);
      if (newList != null)
        msgs = ((InternalEObject)newList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HlvlPackage.VAR_LIST__LIST, null, msgs);
      msgs = basicSetList(newList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.VAR_LIST__LIST, newList, newList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case HlvlPackage.VAR_LIST__LIST:
        return basicSetList(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case HlvlPackage.VAR_LIST__OPERATOR:
        return getOperator();
      case HlvlPackage.VAR_LIST__VAR1:
        if (resolve) return getVar1();
        return basicGetVar1();
      case HlvlPackage.VAR_LIST__LIST:
        return getList();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HlvlPackage.VAR_LIST__OPERATOR:
        setOperator((String)newValue);
        return;
      case HlvlPackage.VAR_LIST__VAR1:
        setVar1((ElmDeclaration)newValue);
        return;
      case HlvlPackage.VAR_LIST__LIST:
        setList((ListOfIDs)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case HlvlPackage.VAR_LIST__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case HlvlPackage.VAR_LIST__VAR1:
        setVar1((ElmDeclaration)null);
        return;
      case HlvlPackage.VAR_LIST__LIST:
        setList((ListOfIDs)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case HlvlPackage.VAR_LIST__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case HlvlPackage.VAR_LIST__VAR1:
        return var1 != null;
      case HlvlPackage.VAR_LIST__LIST:
        return list != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //VarListImpl
