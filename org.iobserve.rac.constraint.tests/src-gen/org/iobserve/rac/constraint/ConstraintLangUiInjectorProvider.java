/*
* generated by Xtext
*/
package org.iobserve.rac.constraint;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class ConstraintLangUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.iobserve.rac.constraint.ui.internal.ConstraintLangActivator.getInstance().getInjector("org.iobserve.rac.constraint.ConstraintLang");
	}
	
}
