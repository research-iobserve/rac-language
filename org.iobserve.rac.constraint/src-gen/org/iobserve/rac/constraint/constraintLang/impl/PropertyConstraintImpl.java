/**
 */
package org.iobserve.rac.constraint.constraintLang.impl;

import de.cau.cs.se.instrumentation.rl.recordLang.Property;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.iobserve.rac.constraint.constraintLang.Comparator;
import org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage;
import org.iobserve.rac.constraint.constraintLang.Literal;
import org.iobserve.rac.constraint.constraintLang.LogicOperator;
import org.iobserve.rac.constraint.constraintLang.PropertyConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.PropertyConstraintImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.PropertyConstraintImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.PropertyConstraintImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.PropertyConstraintImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.PropertyConstraintImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.PropertyConstraintImpl#getComparator <em>Comparator</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.impl.PropertyConstraintImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyConstraintImpl extends MinimalEObjectImpl.Container implements PropertyConstraint
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected PropertyConstraint left;

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
  protected PropertyConstraint constraint;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected Property property;

  /**
   * The default value of the '{@link #getComparator() <em>Comparator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComparator()
   * @generated
   * @ordered
   */
  protected static final Comparator COMPARATOR_EDEFAULT = Comparator.EQ;

  /**
   * The cached value of the '{@link #getComparator() <em>Comparator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComparator()
   * @generated
   * @ordered
   */
  protected Comparator comparator = COMPARATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Literal value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyConstraintImpl()
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
    return ConstraintLangPackage.Literals.PROPERTY_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyConstraint getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(PropertyConstraint newLeft, NotificationChain msgs)
  {
    PropertyConstraint oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.PROPERTY_CONSTRAINT__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(PropertyConstraint newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.PROPERTY_CONSTRAINT__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.PROPERTY_CONSTRAINT__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.PROPERTY_CONSTRAINT__LEFT, newLeft, newLeft));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.PROPERTY_CONSTRAINT__OPERATOR, oldOperator, operator));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.PROPERTY_CONSTRAINT__RIGHT, oldRight, newRight);
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
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.PROPERTY_CONSTRAINT__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.PROPERTY_CONSTRAINT__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.PROPERTY_CONSTRAINT__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyConstraint getConstraint()
  {
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstraint(PropertyConstraint newConstraint, NotificationChain msgs)
  {
    PropertyConstraint oldConstraint = constraint;
    constraint = newConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.PROPERTY_CONSTRAINT__CONSTRAINT, oldConstraint, newConstraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraint(PropertyConstraint newConstraint)
  {
    if (newConstraint != constraint)
    {
      NotificationChain msgs = null;
      if (constraint != null)
        msgs = ((InternalEObject)constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.PROPERTY_CONSTRAINT__CONSTRAINT, null, msgs);
      if (newConstraint != null)
        msgs = ((InternalEObject)newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.PROPERTY_CONSTRAINT__CONSTRAINT, null, msgs);
      msgs = basicSetConstraint(newConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.PROPERTY_CONSTRAINT__CONSTRAINT, newConstraint, newConstraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property getProperty()
  {
    if (property != null && property.eIsProxy())
    {
      InternalEObject oldProperty = (InternalEObject)property;
      property = (Property)eResolveProxy(oldProperty);
      if (property != oldProperty)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintLangPackage.PROPERTY_CONSTRAINT__PROPERTY, oldProperty, property));
      }
    }
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property basicGetProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(Property newProperty)
  {
    Property oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.PROPERTY_CONSTRAINT__PROPERTY, oldProperty, property));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comparator getComparator()
  {
    return comparator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComparator(Comparator newComparator)
  {
    Comparator oldComparator = comparator;
    comparator = newComparator == null ? COMPARATOR_EDEFAULT : newComparator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.PROPERTY_CONSTRAINT__COMPARATOR, oldComparator, comparator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Literal newValue, NotificationChain msgs)
  {
    Literal oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.PROPERTY_CONSTRAINT__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Literal newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.PROPERTY_CONSTRAINT__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConstraintLangPackage.PROPERTY_CONSTRAINT__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstraintLangPackage.PROPERTY_CONSTRAINT__VALUE, newValue, newValue));
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
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__LEFT:
        return basicSetLeft(null, msgs);
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__RIGHT:
        return basicSetRight(null, msgs);
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__CONSTRAINT:
        return basicSetConstraint(null, msgs);
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__VALUE:
        return basicSetValue(null, msgs);
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
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__LEFT:
        return getLeft();
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__OPERATOR:
        return getOperator();
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__RIGHT:
        return getRight();
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__CONSTRAINT:
        return getConstraint();
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__PROPERTY:
        if (resolve) return getProperty();
        return basicGetProperty();
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__COMPARATOR:
        return getComparator();
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__VALUE:
        return getValue();
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
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__LEFT:
        setLeft((PropertyConstraint)newValue);
        return;
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__OPERATOR:
        setOperator((LogicOperator)newValue);
        return;
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__RIGHT:
        setRight((PropertyConstraint)newValue);
        return;
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__CONSTRAINT:
        setConstraint((PropertyConstraint)newValue);
        return;
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__PROPERTY:
        setProperty((Property)newValue);
        return;
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__COMPARATOR:
        setComparator((Comparator)newValue);
        return;
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__VALUE:
        setValue((Literal)newValue);
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
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__LEFT:
        setLeft((PropertyConstraint)null);
        return;
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__RIGHT:
        setRight((PropertyConstraint)null);
        return;
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__CONSTRAINT:
        setConstraint((PropertyConstraint)null);
        return;
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__PROPERTY:
        setProperty((Property)null);
        return;
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__COMPARATOR:
        setComparator(COMPARATOR_EDEFAULT);
        return;
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__VALUE:
        setValue((Literal)null);
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
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__LEFT:
        return left != null;
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__RIGHT:
        return right != null;
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__CONSTRAINT:
        return constraint != null;
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__PROPERTY:
        return property != null;
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__COMPARATOR:
        return comparator != COMPARATOR_EDEFAULT;
      case ConstraintLangPackage.PROPERTY_CONSTRAINT__VALUE:
        return value != null;
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
    result.append(", comparator: ");
    result.append(comparator);
    result.append(')');
    return result.toString();
  }

} //PropertyConstraintImpl
