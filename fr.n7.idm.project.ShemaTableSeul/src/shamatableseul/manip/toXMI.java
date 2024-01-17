package shamatableseul.manip;
import ShemaTableElements.*;
import getXMI.*;
import shematableseul.*;

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
	
	private static List<ShemaTableElements.ShemaTableA> tables = new ArrayList<>();
	private static Map<ShemaTableA, ShemaTable> tableMapping = new HashMap<>();
	private static Map<ColumnA<?>, Column> columnMapping = new HashMap<>();
	public static void main(String[] args) {
		// Charger le package ShemaTable
		ShematableseulPackage shemaTablePackageInstance = ShematableseulPackage.eINSTANCE;
				
		// Enregistrer l'extension ".xmi" comme devant Ãªtre ouverte Ã 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
				
		// CrÃ©er un objet resourceSetImpl qui contiendra une ressource EMF (le modÃ¨le)
		ResourceSet resSet = new ResourceSetImpl();

		URI modelURI = URI.createURI("Table.xmi");
		Resource shemaTablesResource = resSet.createResource(modelURI);
				
		// La fabrique pour fabriquer les Ã©lÃ©ments de SimplePDL
		ShematableseulFactory myTablesFactory = ShematableseulFactory.eINSTANCE;
			    
		TablesF a = new TablesF(tables);
		System.out.print("Entrer");
		
		// Comment attendre que le choix de la table finissent avant de continuer
		a.tablesGUI();
		
		// Attendre que la GUI soit fermée
        synchronized (tables) {
            try {
                tables.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.print("Sortie");
        for (ShemaTableA tableCourante : tables) {
			
			// Supprimer la colonne "Lines Id"
			tableCourante.getColumns().remove(0);

			// Créer la table
			ShemaTable tableSeul = myTablesFactory.createShemaTable();
			// Ajouter la table au modèle
			shemaTablesResource.getContents().add(tableSeul);
			tableSeul.setName(tableCourante.getName());
			tableSeul.setId(tableCourante.getId());
				
			// Créer le catalogue
			Catalogue catalogue = myTablesFactory.createCatalogue();
			// Ajouter le catalogue au modèle
			catalogue.setName(tableCourante.getCatalogue().getName());
			tableSeul.setCatalogue(catalogue);

			// Créer les colonnes
			for (ColumnA<?> column : tableCourante.getColumns()) {

				// ------------------------------------------------------------------
				// Créer une colonne dérivée
				// ------------------------------------------------------------------
				if (column instanceof DerivedColumnA) {
					DerivedColumnA derivedColumn = (DerivedColumnA) column;
					// Créer une colonne dérivée
					DerivedColumn derivedColumnSeul = myTablesFactory.createDerivedColumn();
					derivedColumnSeul.setName(derivedColumn.getName());
					derivedColumnSeul.setId(derivedColumn.getId());
				
					// Récupérer l'algorithme
					AlgorithmA algorithm = derivedColumn.getAlgorithm();
					Algorithm algorithmSeul = myTablesFactory.createAlgorithm();
					algorithmSeul.setName(algorithm.getName());
					algorithmSeul.setPath(algorithm.getPath());

					// Créer les paramètres de l'algorithme
					// L'input
					Input inputDerived = myTablesFactory.createInput();

					// Chercher les colonnes de l'input dans le mapping
					for (ColumnA<?> columnInput : algorithm.getInput().getColumns()) {
						Column columnInputSeul = columnMapping.get(columnInput);
						inputDerived.getColumns().add(columnInputSeul);
					}

					// Les paramètres de l'input
					// Créer la constante si elle existe
					if (algorithm.getInput().getConstant() != null) {
						Constant constant = myTablesFactory.createConstant();
						constant.setValue(algorithm.getInput().getConstant().getValue());
						inputDerived.setConstante(constant);
					}

					// Ajouter l'input à l'algorithme
					algorithmSeul.setInput(inputDerived);

					// L'output
					Output outputDerived = myTablesFactory.createOutput();
					// Créer la colonne de l'output
					Column columnOutput = myTablesFactory.createColumn();
					columnOutput.setName(algorithm.getOutput().getName());
					columnOutput.setId(algorithm.getOutput().getId());
					if (algorithm.getOutput().getDataType() == ColumnDataTypeA.INTEGER) {
						columnOutput.setDataType(ColumnDataType.INT);
					} else if (algorithm.getOutput().getDataType() == ColumnDataTypeA.STRING) {
						columnOutput.setDataType(ColumnDataType.STRING);
					} else if (algorithm.getOutput().getDataType() == ColumnDataTypeA.FLOAT) {
						columnOutput.setDataType(ColumnDataType.FLOAT);
					}
					// créer la contrainte de l'output si elle existe
					Constraint constraintOutput = myTablesFactory.createConstraint();
					if (algorithm.getOutput().getConstraintFile() != null) {
						constraintOutput.setFilePath(algorithm.getOutput().getConstraintFile().getPath());
					} else {
						constraintOutput.setFilePath("");
					}
					outputDerived.setConstraint(constraintOutput);

					// Ajouter les éléments à l'algorithme
					algorithmSeul.setOutput(outputDerived);

					// Ajouter l'algorithme à la colonne dérivée
					derivedColumnSeul.setAlgorithm(algorithmSeul);
					derivedColumnSeul.setOutputColumn(outputDerived);

					// Ajouter l'algorithme au catalogue
					catalogue.getAlgorithms().add(algorithmSeul);

					// Créer une contrainte
					Constraint constraint = myTablesFactory.createConstraint();
					if (derivedColumn.getConstraintFile() != null) {
						constraint.setFilePath(derivedColumn.getConstraintFile().getPath());
					} else {
						constraint.setFilePath("");
					}
					derivedColumnSeul.setConstraint(constraint);

					// Ajouter la colonne au tableau
					tableSeul.getColumns().add(derivedColumnSeul);
				
					// Ajouter la colonne au mapping
					columnMapping.put(column, derivedColumnSeul);

				} else if (column instanceof ReferencedColumnA) {
					// ------------------------------------------------------------------
					// Créer une colonne référencée
					// ------------------------------------------------------------------
					// Récupérer la colonne référencée
					ReferencedColumnA referencedColumn = (ReferencedColumnA) column;

					// Créer une colonne référencée
					ReferencedColumn referencedColumnSeul = myTablesFactory.createReferencedColumn();
					referencedColumnSeul.setName(referencedColumn.getName());
					referencedColumnSeul.setId(referencedColumn.getId());
					if (referencedColumn.getDataType() == ColumnDataTypeA.INTEGER) {
						referencedColumnSeul.setDataType(ColumnDataType.INT);
					} else if (referencedColumn.getDataType() == ColumnDataTypeA.STRING) {
						referencedColumnSeul.setDataType(ColumnDataType.STRING);
					} else if (referencedColumn.getDataType() == ColumnDataTypeA.FLOAT) {
						referencedColumnSeul.setDataType(ColumnDataType.FLOAT);
					}

					// Chercher la table référencée dans le mapping
					ShemaTable referencedTableSeul = tableMapping.get(referencedColumn.getForeignTable());
					referencedColumnSeul.setForeignTable(referencedTableSeul);

					// Chercher la colonne référencée dans le mapping
					Column referencedColumnFromOther = columnMapping.get(referencedColumn.getForeignColumn());
					referencedColumnSeul.setForeignColumn(referencedColumnFromOther);

					// Ajouter la nouvelle colonne au tableau
					tableSeul.getColumns().add(referencedColumnSeul);

					// Ajouter la colonne au mapping des colonnes
					columnMapping.put(column, referencedColumnSeul);

					// Ajouter la nouvelle colonne au mapping
				} else {
					// ------------------------------------------------------------------
					// Créer une colonne simple
					// ------------------------------------------------------------------
					Column columnSeul = myTablesFactory.createColumn();
					columnSeul.setName(column.getName());
					columnSeul.setId(column.getId());
					if (column.getDataType() == ColumnDataTypeA.INTEGER) {
						columnSeul.setDataType(ColumnDataType.INT);
					} else if (column.getDataType() == ColumnDataTypeA.STRING) {
						columnSeul.setDataType(ColumnDataType.STRING);
					} else if (column.getDataType() == ColumnDataTypeA.FLOAT) {
						columnSeul.setDataType(ColumnDataType.FLOAT);
					}
					// Créer une contrainte
					Constraint constraint = myTablesFactory.createConstraint();
					if (column.getConstraintFile() != null) {
						constraint.setFilePath(column.getConstraintFile().getPath());
					} else {
						constraint.setFilePath("");
					}
					tableSeul.getColumns().add(columnSeul);

					// Ajouter la colonne au mapping
					columnMapping.put(column, columnSeul);
				}
			}
			
			// Ajouter la table au mapping
			tableMapping.put(tableCourante, tableSeul);
        }

		// Sauvegarder le modèle
		try {
			shemaTablesResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
