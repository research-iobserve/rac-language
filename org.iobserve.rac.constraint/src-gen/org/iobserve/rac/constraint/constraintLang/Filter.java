/**
 */
package org.iobserve.rac.constraint.constraintLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.Filter#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends Operation
{
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
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getFilter_Constraint()
   * @model containment="true"
   * @generated
   */
  ConstraintExpression getConstraint();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.Filter#getConstraint <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' containment reference.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(ConstraintExpression value);

} // Filter
