/*
 * generated by Xtext 2.32.0
 */
package fr.n7.idm.project.shemaTables.ui.tests;

import com.google.inject.Injector;
import fr.n7.idm.project.shemaTables.xtext.ui.internal.XtextActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class XtextUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XtextActivator.getInstance().getInjector("fr.n7.idm.project.shemaTables.Xtext");
	}

}