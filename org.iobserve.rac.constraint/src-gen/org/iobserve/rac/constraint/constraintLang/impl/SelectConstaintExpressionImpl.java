/**
 */
package org.iobserve.rac.constraint.constraintLang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.iobserve.rac.constraint.constraintLang.Comparator;
import org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage;
import org.iobserve.rac.constraint.constraintLang.LogicOperator;
import org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Constaint Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.SelectConstaintExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.SelectConstaintExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.SelectConstaintExpressionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.SelectConstaintExpressionImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.SelectConstaintExpressionImpl#getComperator <em>Comperator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectConstaintExpressionImpl extends MinimalEObjectImpl.Container implements SelectConstaintExpression
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected EObject left;

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
  protected EObject right;

  /**
   * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected SelectConstaintExpression constraint;

  /**
   * The default value of the '{@link #getComperator() <em>Comperator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComperator()
   * @generated
   * @ordered
   */
  protected static final Comparator COMPERATOR_EDEFAULT = Comparator.EQ;

  /**
   * The cached value of the '{@link #getComperator() <em>Comperator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComperator()
   * @generated
   * @ordered
   */
  protected Comparator comperator = COMPERATOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectConstaintExpressionImpl()
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
    return ConstraintLangPackage.Literals.SELECT_CONSTAINT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(EObject newLeft, NotificationChain msgs)
  {
    EObject oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(EObject newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__LEFT, newLeft, newLeft));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(EObject newRight, NotificationChain msgs)
  {
    EObject oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(EObject newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectConstaintExpression getConstraint()
  {
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstraint(SelectConstaintExpression newConstraint, NotificationChain msgs)
  {
    SelectConstaintExpression oldConstraint = constraint;
    constraint = newConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__CONSTRAINT, oldConstraint, newConstraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraint(SelectConstaintExpression newConstraint)
  {
    if (newConstraint != constraint)
    {
      NotificationChain msgs = null;
      if (constraint != null)
        msgs = ((InternalEObject)constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__CONSTRAINT, null, msgs);
      if (newConstraint != null)
        msgs = ((InternalEObject)newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__CONSTRAINT, null, msgs);
      msgs = basicSetConstraint(newConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__CONSTRAINT, newConstraint, newConstraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comparator getComperator()
  {
    return comperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComperator(Comparator newComperator)
  {
    Comparator oldComperator = comperator;
    comperator = newComperator == null ? COMPERATOR_EDEFAULT : newComperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__COMPERATOR, oldComperator, comperator));
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
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__LEFT:
        return basicSetLeft(null, msgs);
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__RIGHT:
        return basicSetRight(null, msgs);
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__CONSTRAINT:
        return basicSetConstraint(null, msgs);
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
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__LEFT:
        return getLeft();
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__OPERATOR:
        return getOperator();
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__RIGHT:
        return getRight();
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__CONSTRAINT:
        return getConstraint();
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__COMPERATOR:
        return getComperator();
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
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__LEFT:
        setLeft((EObject)newValue);
        return;
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__OPERATOR:
        setOperator((LogicOperator)newValue);
        return;
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__RIGHT:
        setRight((EObject)newValue);
        return;
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__CONSTRAINT:
        setConstraint((SelectConstaintExpression)newValue);
        return;
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__COMPERATOR:
        setComperator((Comparator)newValue);
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
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__LEFT:
        setLeft((EObject)null);
        return;
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__RIGHT:
        setRight((EObject)null);
        return;
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__CONSTRAINT:
        setConstraint((SelectConstaintExpression)null);
        return;
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__COMPERATOR:
        setComperator(COMPERATOR_EDEFAULT);
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
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__LEFT:
        return left != null;
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__RIGHT:
        return right != null;
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__CONSTRAINT:
        return constraint != null;
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION__COMPERATOR:
        return comperator != COMPERATOR_EDEFAULT;
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
    result.append(", comperator: ");
    result.append(comperator);
    result.append(')');
    return result.toString();
  }

} //SelectConstaintExpressionImpl
