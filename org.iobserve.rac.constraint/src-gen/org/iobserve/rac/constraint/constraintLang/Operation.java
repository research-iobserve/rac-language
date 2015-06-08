/**
 */
package org.iobserve.rac.constraint.constraintLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.Operation#getName <em>Name</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.Operation#getSourceReference <em>Source Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject
{
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
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getOperation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.Operation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Source Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Reference</em>' containment reference.
   * @see #setSourceReference(SourceReference)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getOperation_SourceReference()
   * @model containment="true"
   * @generated
   */
  SourceReference getSourceReference();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.Operation#getSourceReference <em>Source Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Reference</em>' containment reference.
   * @see #getSourceReference()
   * @generated
   */
  void setSourceReference(SourceReference value);

} // Operation
