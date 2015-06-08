/**
 */
package org.iobserve.rac.constraint.constraintLang;

import de.cau.cs.se.instrumentation.rl.recordLang.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.ParameterExpression#getInput <em>Input</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.ParameterExpression#getPropertyReference <em>Property Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getParameterExpression()
 * @model
 * @generated
 */
public interface ParameterExpression extends CompareOperand
{
  /**
   * Returns the value of the '<em><b>Input</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' reference.
   * @see #setInput(SelectInput)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getParameterExpression_Input()
   * @model
   * @generated
   */
  SelectInput getInput();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.ParameterExpression#getInput <em>Input</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' reference.
   * @see #getInput()
   * @generated
   */
  void setInput(SelectInput value);

  /**
   * Returns the value of the '<em><b>Property Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Reference</em>' reference.
   * @see #setPropertyReference(Property)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getParameterExpression_PropertyReference()
   * @model
   * @generated
   */
  Property getPropertyReference();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.ParameterExpression#getPropertyReference <em>Property Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Reference</em>' reference.
   * @see #getPropertyReference()
   * @generated
   */
  void setPropertyReference(Property value);

} // ParameterExpression
