/**
 */
package org.iobserve.rac.constraint.constraintLang.impl;

import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage;
import org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression;
import org.iobserve.rac.constraint.constraintLang.SelectInput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.SelectInputImpl#getRecordType <em>Record Type</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.SelectInputImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.SelectInputImpl#getSelectConstraint <em>Select Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectInputImpl extends MinimalEObjectImpl.Container implements SelectInput
{
  /**
   * The cached value of the '{@link #getRecordType() <em>Record Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecordType()
   * @generated
   * @ordered
   */
  protected RecordType recordType;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSelectConstraint() <em>Select Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectConstraint()
   * @generated
   * @ordered
   */
  protected SelectConstaintExpression selectConstraint;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectInputImpl()
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
    return ConstraintLangPackage.Literals.SELECT_INPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordType getRecordType()
  {
    if (recordType != null && recordType.eIsProxy())
    {
      InternalEObject oldRecordType = (InternalEObject)recordType;
      recordType = (RecordType)eResolveProxy(oldRecordType);
      if (recordType != oldRecordType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintLangPackage.SELECT_INPUT__RECORD_TYPE, oldRecordType, recordType));
      }
    }
    return recordType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordType basicGetRecordType()
  {
    return recordType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecordType(RecordType newRecordType)
  {
    RecordType oldRecordType = recordType;
    recordType = newRecordType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.SELECT_INPUT__RECORD_TYPE, oldRecordType, recordType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.SELECT_INPUT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectConstaintExpression getSelectConstraint()
  {
    return selectConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelectConstraint(SelectConstaintExpression newSelectConstraint, NotificationChain msgs)
  {
    SelectConstaintExpression oldSelectConstraint = selectConstraint;
    selectConstraint = newSelectConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.SELECT_INPUT__SELECT_CONSTRAINT, oldSelectConstraint, newSelectConstraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelectConstraint(SelectConstaintExpression newSelectConstraint)
  {
    if (newSelectConstraint != selectConstraint)
    {
      NotificationChain msgs = null;
      if (selectConstraint != null)
        msgs = ((InternalEObject)selectConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.SELECT_INPUT__SELECT_CONSTRAINT, null, msgs);
      if (newSelectConstraint != null)
        msgs = ((InternalEObject)newSelectConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.SELECT_INPUT__SELECT_CONSTRAINT, null, msgs);
      msgs = basicSetSelectConstraint(newSelectConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.SELECT_INPUT__SELECT_CONSTRAINT, newSelectConstraint, newSelectConstraint));
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
      case ConstraintLangPackage.SELECT_INPUT__SELECT_CONSTRAINT:
        return basicSetSelectConstraint(null, msgs);
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
      case ConstraintLangPackage.SELECT_INPUT__RECORD_TYPE:
        if (resolve) return getRecordType();
        return basicGetRecordType();
      case ConstraintLangPackage.SELECT_INPUT__NAME:
        return getName();
      case ConstraintLangPackage.SELECT_INPUT__SELECT_CONSTRAINT:
        return getSelectConstraint();
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
      case ConstraintLangPackage.SELECT_INPUT__RECORD_TYPE:
        setRecordType((RecordType)newValue);
        return;
      case ConstraintLangPackage.SELECT_INPUT__NAME:
        setName((String)newValue);
        return;
      case ConstraintLangPackage.SELECT_INPUT__SELECT_CONSTRAINT:
        setSelectConstraint((SelectConstaintExpression)newValue);
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
      case ConstraintLangPackage.SELECT_INPUT__RECORD_TYPE:
        setRecordType((RecordType)null);
        return;
      case ConstraintLangPackage.SELECT_INPUT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ConstraintLangPackage.SELECT_INPUT__SELECT_CONSTRAINT:
        setSelectConstraint((SelectConstaintExpression)null);
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
      case ConstraintLangPackage.SELECT_INPUT__RECORD_TYPE:
        return recordType != null;
      case ConstraintLangPackage.SELECT_INPUT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ConstraintLangPackage.SELECT_INPUT__SELECT_CONSTRAINT:
        return selectConstraint != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SelectInputImpl
