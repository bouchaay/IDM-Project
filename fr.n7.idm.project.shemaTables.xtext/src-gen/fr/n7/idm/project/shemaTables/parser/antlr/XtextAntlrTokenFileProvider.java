/*
 * generated by Xtext 2.32.0
 */
package fr.n7.idm.project.shemaTables.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class XtextAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("fr/n7/idm/project/shemaTables/parser/antlr/internal/InternalXtext.tokens");
	}
}
