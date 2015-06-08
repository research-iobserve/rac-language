/**
 */
package org.iobserve.rac.constraint.constraintLang;

import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Type Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.RecordTypeSelection#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.RecordTypeSelection#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getRecordTypeSelection()
 * @model
 * @generated
 */
public interface RecordTypeSelection extends TypeSelection
{
  /**
   * Returns the value of the '<em><b>Modifier</b></em>' attribute.
   * The literals are from the enumeration {@link org.iobserve.rac.constraint.constraintLang.RecordTypeModifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifier</em>' attribute.
   * @see org.iobserve.rac.constraint.constraintLang.RecordTypeModifier
   * @see #setModifier(RecordTypeModifier)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getRecordTypeSelection_Modifier()
   * @model
   * @generated
   */
  RecordTypeModifier getModifier();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.RecordTypeSelection#getModifier <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' attribute.
   * @see org.iobserve.rac.constraint.constraintLang.RecordTypeModifier
   * @see #getModifier()
   * @generated
   */
  void setModifier(RecordTypeModifier value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(RecordType)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getRecordTypeSelection_Type()
   * @model
   * @generated
   */
  RecordType getType();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.RecordTypeSelection#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(RecordType value);

} // RecordTypeSelection
