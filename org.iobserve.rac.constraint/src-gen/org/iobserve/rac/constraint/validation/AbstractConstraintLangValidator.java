/*
 * generated by Xtext
 */
package org.iobserve.rac.constraint.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractConstraintLangValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage.eINSTANCE);
		return result;
	}
}
