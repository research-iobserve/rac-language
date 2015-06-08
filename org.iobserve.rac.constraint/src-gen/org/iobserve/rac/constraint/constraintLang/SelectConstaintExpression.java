/**
 */
package org.iobserve.rac.constraint.constraintLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Constaint Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression#getRight <em>Right</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression#getComperator <em>Comperator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getSelectConstaintExpression()
 * @model
 * @generated
 */
public interface SelectConstaintExpression extends EObject
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
   * @see #setLeft(EObject)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getSelectConstaintExpression_Left()
   * @model containment="true"
   * @generated
   */
  EObject getLeft();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(EObject value);

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
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getSelectConstaintExpression_Operator()
   * @model
   * @generated
   */
  LogicOperator getOperator();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression#getOperator <em>Operator</em>}' attribute.
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
   * @see #setRight(EObject)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getSelectConstaintExpression_Right()
   * @model containment="true"
   * @generated
   */
  EObject getRight();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(EObject value);

  /**
   * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' containment reference.
   * @see #setConstraint(SelectConstaintExpression)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getSelectConstaintExpression_Constraint()
   * @model containment="true"
   * @generated
   */
  SelectConstaintExpression getConstraint();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression#getConstraint <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' containment reference.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(SelectConstaintExpression value);

  /**
   * Returns the value of the '<em><b>Comperator</b></em>' attribute.
   * The literals are from the enumeration {@link org.iobserve.rac.constraint.constraintLang.Comparator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comperator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comperator</em>' attribute.
   * @see org.iobserve.rac.constraint.constraintLang.Comparator
   * @see #setComperator(Comparator)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getSelectConstaintExpression_Comperator()
   * @model
   * @generated
   */
  Comparator getComperator();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression#getComperator <em>Comperator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comperator</em>' attribute.
   * @see org.iobserve.rac.constraint.constraintLang.Comparator
   * @see #getComperator()
   * @generated
   */
  void setComperator(Comparator value);

} // SelectConstaintExpression
