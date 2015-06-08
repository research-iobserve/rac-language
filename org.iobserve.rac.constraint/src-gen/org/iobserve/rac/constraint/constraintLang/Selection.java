/**
 */
package org.iobserve.rac.constraint.constraintLang;

import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.Selection#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.Selection#getRecordType <em>Record Type</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.Selection#getParemterExpressions <em>Paremter Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getSelection()
 * @model
 * @generated
 */
public interface Selection extends Operation
{
  /**
   * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
   * The list contents are of type {@link org.iobserve.rac.constraint.constraintLang.SelectInput}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' containment reference list.
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getSelection_Inputs()
   * @model containment="true"
   * @generated
   */
  EList<SelectInput> getInputs();

  /**
   * Returns the value of the '<em><b>Record Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record Type</em>' reference.
   * @see #setRecordType(RecordType)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getSelection_RecordType()
   * @model
   * @generated
   */
  RecordType getRecordType();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.Selection#getRecordType <em>Record Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record Type</em>' reference.
   * @see #getRecordType()
   * @generated
   */
  void setRecordType(RecordType value);

  /**
   * Returns the value of the '<em><b>Paremter Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.iobserve.rac.constraint.constraintLang.ParameterExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paremter Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paremter Expressions</em>' containment reference list.
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getSelection_ParemterExpressions()
   * @model containment="true"
   * @generated
   */
  EList<ParameterExpression> getParemterExpressions();

} // Selection
