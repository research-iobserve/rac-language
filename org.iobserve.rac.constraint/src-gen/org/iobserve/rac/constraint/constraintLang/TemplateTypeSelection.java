/**
 */
package org.iobserve.rac.constraint.constraintLang;

import de.cau.cs.se.instrumentation.rl.recordLang.TemplateType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Type Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.iobserve.rac.constraint.constraintLang.TemplateTypeSelection#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getTemplateTypeSelection()
 * @model
 * @generated
 */
public interface TemplateTypeSelection extends TypeSelection
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' reference list.
   * The list contents are of type {@link de.cau.cs.se.instrumentation.rl.recordLang.TemplateType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' reference list.
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage#getTemplateTypeSelection_Types()
   * @model
   * @generated
   */
  EList<TemplateType> getTypes();

} // TemplateTypeSelection
