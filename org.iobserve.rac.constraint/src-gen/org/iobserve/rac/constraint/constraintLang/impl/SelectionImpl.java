/**
 */
package org.iobserve.rac.constraint.constraintLang.impl;

import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage;
import org.iobserve.rac.constraint.constraintLang.Filter;
import org.iobserve.rac.constraint.constraintLang.ParameterExpression;
import org.iobserve.rac.constraint.constraintLang.SelectInput;
import org.iobserve.rac.constraint.constraintLang.Selection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.SelectionImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.SelectionImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.SelectionImpl#getRecordType <em>Record Type</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.SelectionImpl#getParemterExpressions <em>Paremter Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectionImpl extends OperationImpl implements Selection
{
  /**
   * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputs()
   * @generated
   * @ordered
   */
  protected EList<SelectInput> inputs;

  /**
   * The cached value of the '{@link #getFilter() <em>Filter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected Filter filter;

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
   * The cached value of the '{@link #getParemterExpressions() <em>Paremter Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParemterExpressions()
   * @generated
   * @ordered
   */
  protected EList<ParameterExpression> paremterExpressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectionImpl()
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
    return ConstraintLangPackage.Literals.SELECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SelectInput> getInputs()
  {
    if (inputs == null)
    {
      inputs = new EObjectContainmentEList<SelectInput>(SelectInput.class, this, ConstraintLangPackage.SELECTION__INPUTS);
    }
    return inputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Filter getFilter()
  {
    if (filter != null && filter.eIsProxy())
    {
      InternalEObject oldFilter = (InternalEObject)filter;
      filter = (Filter)eResolveProxy(oldFilter);
      if (filter != oldFilter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintLangPackage.SELECTION__FILTER, oldFilter, filter));
      }
    }
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Filter basicGetFilter()
  {
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilter(Filter newFilter)
  {
    Filter oldFilter = filter;
    filter = newFilter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.SELECTION__FILTER, oldFilter, filter));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintLangPackage.SELECTION__RECORD_TYPE, oldRecordType, recordType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.SELECTION__RECORD_TYPE, oldRecordType, recordType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterExpression> getParemterExpressions()
  {
    if (paremterExpressions == null)
    {
      paremterExpressions = new EObjectContainmentEList<ParameterExpression>(ParameterExpression.class, this, ConstraintLangPackage.SELECTION__PAREMTER_EXPRESSIONS);
    }
    return paremterExpressions;
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
      case ConstraintLangPackage.SELECTION__INPUTS:
        return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
      case ConstraintLangPackage.SELECTION__PAREMTER_EXPRESSIONS:
        return ((InternalEList<?>)getParemterExpressions()).basicRemove(otherEnd, msgs);
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
      case ConstraintLangPackage.SELECTION__INPUTS:
        return getInputs();
      case ConstraintLangPackage.SELECTION__FILTER:
        if (resolve) return getFilter();
        return basicGetFilter();
      case ConstraintLangPackage.SELECTION__RECORD_TYPE:
        if (resolve) return getRecordType();
        return basicGetRecordType();
      case ConstraintLangPackage.SELECTION__PAREMTER_EXPRESSIONS:
        return getParemterExpressions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ConstraintLangPackage.SELECTION__INPUTS:
        getInputs().clear();
        getInputs().addAll((Collection<? extends SelectInput>)newValue);
        return;
      case ConstraintLangPackage.SELECTION__FILTER:
        setFilter((Filter)newValue);
        return;
      case ConstraintLangPackage.SELECTION__RECORD_TYPE:
        setRecordType((RecordType)newValue);
        return;
      case ConstraintLangPackage.SELECTION__PAREMTER_EXPRESSIONS:
        getParemterExpressions().clear();
        getParemterExpressions().addAll((Collection<? extends ParameterExpression>)newValue);
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
      case ConstraintLangPackage.SELECTION__INPUTS:
        getInputs().clear();
        return;
      case ConstraintLangPackage.SELECTION__FILTER:
        setFilter((Filter)null);
        return;
      case ConstraintLangPackage.SELECTION__RECORD_TYPE:
        setRecordType((RecordType)null);
        return;
      case ConstraintLangPackage.SELECTION__PAREMTER_EXPRESSIONS:
        getParemterExpressions().clear();
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
      case ConstraintLangPackage.SELECTION__INPUTS:
        return inputs != null && !inputs.isEmpty();
      case ConstraintLangPackage.SELECTION__FILTER:
        return filter != null;
      case ConstraintLangPackage.SELECTION__RECORD_TYPE:
        return recordType != null;
      case ConstraintLangPackage.SELECTION__PAREMTER_EXPRESSIONS:
        return paremterExpressions != null && !paremterExpressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SelectionImpl
