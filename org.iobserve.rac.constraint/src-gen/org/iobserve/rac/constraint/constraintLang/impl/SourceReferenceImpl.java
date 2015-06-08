/**
 */
package org.iobserve.rac.constraint.constraintLang.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage;
import org.iobserve.rac.constraint.constraintLang.Operation;
import org.iobserve.rac.constraint.constraintLang.SourceReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.SourceReferenceImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.SourceReferenceImpl#isDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceReferenceImpl extends MinimalEObjectImpl.Container implements SourceReference
{
  /**
   * The cached value of the '{@link #getFilter() <em>Filter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected Operation filter;

  /**
   * The default value of the '{@link #isDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDefault()
   * @generated
   * @ordered
   */
  protected static final boolean DEFAULT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDefault()
   * @generated
   * @ordered
   */
  protected boolean default_ = DEFAULT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SourceReferenceImpl()
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
    return ConstraintLangPackage.Literals.SOURCE_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation getFilter()
  {
    if (filter != null && filter.eIsProxy())
    {
      InternalEObject oldFilter = (InternalEObject)filter;
      filter = (Operation)eResolveProxy(oldFilter);
      if (filter != oldFilter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintLangPackage.SOURCE_REFERENCE__FILTER, oldFilter, filter));
      }
    }
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation basicGetFilter()
  {
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilter(Operation newFilter)
  {
    Operation oldFilter = filter;
    filter = newFilter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.SOURCE_REFERENCE__FILTER, oldFilter, filter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDefault()
  {
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefault(boolean newDefault)
  {
    boolean oldDefault = default_;
    default_ = newDefault;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.SOURCE_REFERENCE__DEFAULT, oldDefault, default_));
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
      case ConstraintLangPackage.SOURCE_REFERENCE__FILTER:
        if (resolve) return getFilter();
        return basicGetFilter();
      case ConstraintLangPackage.SOURCE_REFERENCE__DEFAULT:
        return isDefault();
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
      case ConstraintLangPackage.SOURCE_REFERENCE__FILTER:
        setFilter((Operation)newValue);
        return;
      case ConstraintLangPackage.SOURCE_REFERENCE__DEFAULT:
        setDefault((Boolean)newValue);
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
      case ConstraintLangPackage.SOURCE_REFERENCE__FILTER:
        setFilter((Operation)null);
        return;
      case ConstraintLangPackage.SOURCE_REFERENCE__DEFAULT:
        setDefault(DEFAULT_EDEFAULT);
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
      case ConstraintLangPackage.SOURCE_REFERENCE__FILTER:
        return filter != null;
      case ConstraintLangPackage.SOURCE_REFERENCE__DEFAULT:
        return default_ != DEFAULT_EDEFAULT;
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
    result.append(" (default: ");
    result.append(default_);
    result.append(')');
    return result.toString();
  }

} //SourceReferenceImpl
