package shematables.manip;
import getXMI.*;
import shematables.*;
import ShemaTableElements.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class toXMI {

	private static List<ShemaTableElements.ShemaTable> listShemaTables = new ArrayList<>();
	
public static void main(String[] args) {
		
		// Charger le package ShemaTable
		ShematablesPackage shemaTablePackageInstance = ShematablesPackage.eINSTANCE;
		
		// Enregistrer l'extension ".xmi" comme devant Ãªtre ouverte Ã 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// CrÃ©er un objet resourceSetImpl qui contiendra une ressource EMF (le modÃ¨le)
		ResourceSet resSet = new ResourceSetImpl();

		URI modelURI2 = URI.createURI("Table.xmi");
		Resource shemaTablesResource = resSet.createResource(modelURI2);
		
		// La fabrique pour fabriquer les Ã©lÃ©ments de SimplePDL
	    ShematablesFactory myTablesFactory = ShematablesFactory.eINSTANCE;
	    
	    Tables tables = myTablesFactory.createTables();
	    
	    shemaTablesResource.getContents().add(tables);
	    
	    TablesF askedTables = new TablesF();
	    askedTables.tablesGUI();
	    listShemaTables = (ShemaTableElements.ShemaTable) askedTables.getShemaTables();


	    
	    
	    
	    
    }

}
