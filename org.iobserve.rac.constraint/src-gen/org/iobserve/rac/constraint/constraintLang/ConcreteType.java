/**
 */
package org.iobserve.rac.constraint.constraintLang;

import de.cau.cs.se.instrumentation.rl.recordLang.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.ConcreteType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getConcreteType()
 * @model
 * @generated
 */
public interface ConcreteType extends TypeSelection
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getConcreteType_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.ConcreteType#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // ConcreteType
