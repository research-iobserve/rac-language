/**
 */
package org.iobserve.rac.constraint.constraintLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.SourceReference#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.SourceReference#isDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getSourceReference()
 * @model
 * @generated
 */
public interface SourceReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Filter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' reference.
   * @see #setFilter(Operation)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getSourceReference_Filter()
   * @model
   * @generated
   */
  Operation getFilter();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.SourceReference#getFilter <em>Filter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(Operation value);

  /**
   * Returns the value of the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' attribute.
   * @see #setDefault(boolean)
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getSourceReference_Default()
   * @model
   * @generated
   */
  boolean isDefault();

  /**
   * Sets the value of the '{@link org.iobserve.rac.constraint.constraintLang.SourceReference#isDefault <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' attribute.
   * @see #isDefault()
   * @generated
   */
  void setDefault(boolean value);

} // SourceReference
