/**
 */
package org.iobserve.rac.constraint.constraintLang;

import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.SelectInput#getRecordType <em>Record Type</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.SelectInput#getName <em>Name</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.SelectInput#getSelectConstraint <em>Select Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getSelectInput()
 * @model
 * @generated
 */
public interface SelectInput extends EObject
{
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
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getSelectInput_RecordType()
   * @model
   * @generated
   */
  RecordType getRecordType();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.SelectInput#getRecordType <em>Record Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record Type</em>' reference.
   * @see #getRecordType()
   * @generated
   */
  void setRecordType(RecordType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getSelectInput_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.SelectInput#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Select Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select Constraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select Constraint</em>' containment reference.
   * @see #setSelectConstraint(SelectConstaintExpression)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getSelectInput_SelectConstraint()
   * @model containment="true"
   * @generated
   */
  SelectConstaintExpression getSelectConstraint();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.SelectInput#getSelectConstraint <em>Select Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select Constraint</em>' containment reference.
   * @see #getSelectConstraint()
   * @generated
   */
  void setSelectConstraint(SelectConstaintExpression value);

} // SelectInput
