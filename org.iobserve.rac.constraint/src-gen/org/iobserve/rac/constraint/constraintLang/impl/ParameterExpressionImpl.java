/**
 */
package org.iobserve.rac.constraint.constraintLang.impl;

import de.cau.cs.se.instrumentation.rl.recordLang.Property;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage;
import org.iobserve.rac.constraint.constraintLang.ParameterExpression;
import org.iobserve.rac.constraint.constraintLang.SelectInput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.ParameterExpressionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.ParameterExpressionImpl#getPropertyReference <em>Property Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterExpressionImpl extends CompareOperandImpl implements ParameterExpression
{
  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected SelectInput input;

  /**
   * The cached value of the '{@link #getPropertyReference() <em>Property Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyReference()
   * @generated
   * @ordered
   */
  protected Property propertyReference;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterExpressionImpl()
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
    return ConstraintLangPackage.Literals.PARAMETER_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectInput getInput()
  {
    if (input != null && input.eIsProxy())
    {
      InternalEObject oldInput = (InternalEObject)input;
      input = (SelectInput)eResolveProxy(oldInput);
      if (input != oldInput)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintLangPackage.PARAMETER_EXPRESSION__INPUT, oldInput, input));
      }
    }
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectInput basicGetInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInput(SelectInput newInput)
  {
    SelectInput oldInput = input;
    input = newInput;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.PARAMETER_EXPRESSION__INPUT, oldInput, input));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property getPropertyReference()
  {
    if (propertyReference != null && propertyReference.eIsProxy())
    {
      InternalEObject oldPropertyReference = (InternalEObject)propertyReference;
      propertyReference = (Property)eResolveProxy(oldPropertyReference);
      if (propertyReference != oldPropertyReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintLangPackage.PARAMETER_EXPRESSION__PROPERTY_REFERENCE, oldPropertyReference, propertyReference));
      }
    }
    return propertyReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property basicGetPropertyReference()
  {
    return propertyReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyReference(Property newPropertyReference)
  {
    Property oldPropertyReference = propertyReference;
    propertyReference = newPropertyReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.PARAMETER_EXPRESSION__PROPERTY_REFERENCE, oldPropertyReference, propertyReference));
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
      case ConstraintLangPackage.PARAMETER_EXPRESSION__INPUT:
        if (resolve) return getInput();
        return basicGetInput();
      case ConstraintLangPackage.PARAMETER_EXPRESSION__PROPERTY_REFERENCE:
        if (resolve) return getPropertyReference();
        return basicGetPropertyReference();
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
      case ConstraintLangPackage.PARAMETER_EXPRESSION__INPUT:
        setInput((SelectInput)newValue);
        return;
      case ConstraintLangPackage.PARAMETER_EXPRESSION__PROPERTY_REFERENCE:
        setPropertyReference((Property)newValue);
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
      case ConstraintLangPackage.PARAMETER_EXPRESSION__INPUT:
        setInput((SelectInput)null);
        return;
      case ConstraintLangPackage.PARAMETER_EXPRESSION__PROPERTY_REFERENCE:
        setPropertyReference((Property)null);
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
      case ConstraintLangPackage.PARAMETER_EXPRESSION__INPUT:
        return input != null;
      case ConstraintLangPackage.PARAMETER_EXPRESSION__PROPERTY_REFERENCE:
        return propertyReference != null;
    }
    return super.eIsSet(featureID);
  }

} //ParameterExpressionImpl
