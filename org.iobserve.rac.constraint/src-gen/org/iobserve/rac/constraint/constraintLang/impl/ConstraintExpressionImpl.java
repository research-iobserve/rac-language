/**
 */
package org.iobserve.rac.constraint.constraintLang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.iobserve.rac.constraint.constraintLang.ConstraintExpression;
import org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage;
import org.iobserve.rac.constraint.constraintLang.LogicOperator;
import org.iobserve.rac.constraint.constraintLang.PropertyConstraint;
import org.iobserve.rac.constraint.constraintLang.TypeSelection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.ConstraintExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.ConstraintExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.ConstraintExpressionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.ConstraintExpressionImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.ConstraintExpressionImpl#getTypeSelection <em>Type Selection</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.ConstraintExpressionImpl#getPropertyConstraint <em>Property Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintExpressionImpl extends MinimalEObjectImpl.Container implements ConstraintExpression
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected ConstraintExpression left;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final LogicOperator OPERATOR_EDEFAULT = LogicOperator.AND;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected LogicOperator operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected PropertyConstraint right;

  /**
   * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected ConstraintExpression constraint;

  /**
   * The cached value of the '{@link #getTypeSelection() <em>Type Selection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeSelection()
   * @generated
   * @ordered
   */
  protected TypeSelection typeSelection;

  /**
   * The cached value of the '{@link #getPropertyConstraint() <em>Property Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyConstraint()
   * @generated
   * @ordered
   */
  protected PropertyConstraint propertyConstraint;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstraintExpressionImpl()
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
    return ConstraintLangPackage.Literals.CONSTRAINT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintExpression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(ConstraintExpression newLeft, NotificationChain msgs)
  {
    ConstraintExpression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.CONSTRAINT_EXPRESSION__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(ConstraintExpression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.CONSTRAINT_EXPRESSION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.CONSTRAINT_EXPRESSION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.CONSTRAINT_EXPRESSION__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicOperator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(LogicOperator newOperator)
  {
    LogicOperator oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.CONSTRAINT_EXPRESSION__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyConstraint getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(PropertyConstraint newRight, NotificationChain msgs)
  {
    PropertyConstraint oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.CONSTRAINT_EXPRESSION__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(PropertyConstraint newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.CONSTRAINT_EXPRESSION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.CONSTRAINT_EXPRESSION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.CONSTRAINT_EXPRESSION__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintExpression getConstraint()
  {
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstraint(ConstraintExpression newConstraint, NotificationChain msgs)
  {
    ConstraintExpression oldConstraint = constraint;
    constraint = newConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.CONSTRAINT_EXPRESSION__CONSTRAINT, oldConstraint, newConstraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraint(ConstraintExpression newConstraint)
  {
    if (newConstraint != constraint)
    {
      NotificationChain msgs = null;
      if (constraint != null)
        msgs = ((InternalEObject)constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.CONSTRAINT_EXPRESSION__CONSTRAINT, null, msgs);
      if (newConstraint != null)
        msgs = ((InternalEObject)newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.CONSTRAINT_EXPRESSION__CONSTRAINT, null, msgs);
      msgs = basicSetConstraint(newConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.CONSTRAINT_EXPRESSION__CONSTRAINT, newConstraint, newConstraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSelection getTypeSelection()
  {
    return typeSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeSelection(TypeSelection newTypeSelection, NotificationChain msgs)
  {
    TypeSelection oldTypeSelection = typeSelection;
    typeSelection = newTypeSelection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.CONSTRAINT_EXPRESSION__TYPE_SELECTION, oldTypeSelection, newTypeSelection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeSelection(TypeSelection newTypeSelection)
  {
    if (newTypeSelection != typeSelection)
    {
      NotificationChain msgs = null;
      if (typeSelection != null)
        msgs = ((InternalEObject)typeSelection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.CONSTRAINT_EXPRESSION__TYPE_SELECTION, null, msgs);
      if (newTypeSelection != null)
        msgs = ((InternalEObject)newTypeSelection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.CONSTRAINT_EXPRESSION__TYPE_SELECTION, null, msgs);
      msgs = basicSetTypeSelection(newTypeSelection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.CONSTRAINT_EXPRESSION__TYPE_SELECTION, newTypeSelection, newTypeSelection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyConstraint getPropertyConstraint()
  {
    return propertyConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPropertyConstraint(PropertyConstraint newPropertyConstraint, NotificationChain msgs)
  {
    PropertyConstraint oldPropertyConstraint = propertyConstraint;
    propertyConstraint = newPropertyConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.CONSTRAINT_EXPRESSION__PROPERTY_CONSTRAINT, oldPropertyConstraint, newPropertyConstraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyConstraint(PropertyConstraint newPropertyConstraint)
  {
    if (newPropertyConstraint != propertyConstraint)
    {
      NotificationChain msgs = null;
      if (propertyConstraint != null)
        msgs = ((InternalEObject)propertyConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.CONSTRAINT_EXPRESSION__PROPERTY_CONSTRAINT, null, msgs);
      if (newPropertyConstraint != null)
        msgs = ((InternalEObject)newPropertyConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.CONSTRAINT_EXPRESSION__PROPERTY_CONSTRAINT, null, msgs);
      msgs = basicSetPropertyConstraint(newPropertyConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.CONSTRAINT_EXPRESSION__PROPERTY_CONSTRAINT, newPropertyConstraint, newPropertyConstraint));
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
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__LEFT:
        return basicSetLeft(null, msgs);
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__RIGHT:
        return basicSetRight(null, msgs);
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__CONSTRAINT:
        return basicSetConstraint(null, msgs);
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__TYPE_SELECTION:
        return basicSetTypeSelection(null, msgs);
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__PROPERTY_CONSTRAINT:
        return basicSetPropertyConstraint(null, msgs);
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
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__LEFT:
        return getLeft();
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__OPERATOR:
        return getOperator();
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__RIGHT:
        return getRight();
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__CONSTRAINT:
        return getConstraint();
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__TYPE_SELECTION:
        return getTypeSelection();
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__PROPERTY_CONSTRAINT:
        return getPropertyConstraint();
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
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__LEFT:
        setLeft((ConstraintExpression)newValue);
        return;
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__OPERATOR:
        setOperator((LogicOperator)newValue);
        return;
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__RIGHT:
        setRight((PropertyConstraint)newValue);
        return;
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__CONSTRAINT:
        setConstraint((ConstraintExpression)newValue);
        return;
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__TYPE_SELECTION:
        setTypeSelection((TypeSelection)newValue);
        return;
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__PROPERTY_CONSTRAINT:
        setPropertyConstraint((PropertyConstraint)newValue);
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
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__LEFT:
        setLeft((ConstraintExpression)null);
        return;
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__RIGHT:
        setRight((PropertyConstraint)null);
        return;
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__CONSTRAINT:
        setConstraint((ConstraintExpression)null);
        return;
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__TYPE_SELECTION:
        setTypeSelection((TypeSelection)null);
        return;
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__PROPERTY_CONSTRAINT:
        setPropertyConstraint((PropertyConstraint)null);
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
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__LEFT:
        return left != null;
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__RIGHT:
        return right != null;
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__CONSTRAINT:
        return constraint != null;
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__TYPE_SELECTION:
        return typeSelection != null;
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION__PROPERTY_CONSTRAINT:
        return propertyConstraint != null;
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

} //ConstraintExpressionImpl
