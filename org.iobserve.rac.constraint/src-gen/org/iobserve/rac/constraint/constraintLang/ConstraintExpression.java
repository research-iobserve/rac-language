/**
 */
package org.iobserve.rac.constraint.constraintLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getRight <em>Right</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getTypeSelection <em>Type Selection</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getPropertyConstraint <em>Property Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getConstraintExpression()
 * @model
 * @generated
 */
public interface ConstraintExpression extends EObject
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
   * @see #setLeft(ConstraintExpression)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getConstraintExpression_Left()
   * @model containment="true"
   * @generated
   */
  ConstraintExpression getLeft();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ConstraintExpression value);

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
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getConstraintExpression_Operator()
   * @model
   * @generated
   */
  LogicOperator getOperator();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getOperator <em>Operator</em>}' attribute.
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
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getConstraintExpression_Right()
   * @model containment="true"
   * @generated
   */
  PropertyConstraint getRight();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getRight <em>Right</em>}' containment reference.
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
   * @see #setConstraint(ConstraintExpression)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getConstraintExpression_Constraint()
   * @model containment="true"
   * @generated
   */
  ConstraintExpression getConstraint();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getConstraint <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' containment reference.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(ConstraintExpression value);

  /**
   * Returns the value of the '<em><b>Type Selection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Selection</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Selection</em>' containment reference.
   * @see #setTypeSelection(TypeSelection)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getConstraintExpression_TypeSelection()
   * @model containment="true"
   * @generated
   */
  TypeSelection getTypeSelection();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getTypeSelection <em>Type Selection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Selection</em>' containment reference.
   * @see #getTypeSelection()
   * @generated
   */
  void setTypeSelection(TypeSelection value);

  /**
   * Returns the value of the '<em><b>Property Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Constraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Constraint</em>' containment reference.
   * @see #setPropertyConstraint(PropertyConstraint)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getConstraintExpression_PropertyConstraint()
   * @model containment="true"
   * @generated
   */
  PropertyConstraint getPropertyConstraint();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getPropertyConstraint <em>Property Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Constraint</em>' containment reference.
   * @see #getPropertyConstraint()
   * @generated
   */
  void setPropertyConstraint(PropertyConstraint value);

} // ConstraintExpression
