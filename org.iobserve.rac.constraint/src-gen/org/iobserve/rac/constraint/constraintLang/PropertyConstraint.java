/**
 */
package org.iobserve.rac.constraint.constraintLang;

import de.cau.cs.se.instrumentation.rl.recordLang.Property;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getLeft <em>Left</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getRight <em>Right</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getProperty <em>Property</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getComparator <em>Comparator</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getPropertyConstraint()
 * @model
 * @generated
 */
public interface PropertyConstraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(PropertyConstraint)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getPropertyConstraint_Left()
   * @model containment="true"
   * @generated
   */
  PropertyConstraint getLeft();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(PropertyConstraint value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.iobserve.rac.constraint.constraintLang.LogicOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.iobserve.rac.constraint.constraintLang.LogicOperator
   * @see #setOperator(LogicOperator)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getPropertyConstraint_Operator()
   * @model
   * @generated
   */
  LogicOperator getOperator();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.iobserve.rac.constraint.constraintLang.LogicOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(LogicOperator value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(PropertyConstraint)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getPropertyConstraint_Right()
   * @model containment="true"
   * @generated
   */
  PropertyConstraint getRight();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(PropertyConstraint value);

  /**
   * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' containment reference.
   * @see #setConstraint(PropertyConstraint)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getPropertyConstraint_Constraint()
   * @model containment="true"
   * @generated
   */
  PropertyConstraint getConstraint();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getConstraint <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' containment reference.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(PropertyConstraint value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' reference.
   * @see #setProperty(Property)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getPropertyConstraint_Property()
   * @model
   * @generated
   */
  Property getProperty();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getProperty <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(Property value);

  /**
   * Returns the value of the '<em><b>Comparator</b></em>' attribute.
   * The literals are from the enumeration {@link org.iobserve.rac.constraint.constraintLang.Comparator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comparator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comparator</em>' attribute.
   * @see org.iobserve.rac.constraint.constraintLang.Comparator
   * @see #setComparator(Comparator)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getPropertyConstraint_Comparator()
   * @model
   * @generated
   */
  Comparator getComparator();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getComparator <em>Comparator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comparator</em>' attribute.
   * @see org.iobserve.rac.constraint.constraintLang.Comparator
   * @see #getComparator()
   * @generated
   */
  void setComparator(Comparator value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Literal)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getPropertyConstraint_Value()
   * @model containment="true"
   * @generated
   */
  Literal getValue();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Literal value);

} // PropertyConstraint
