package Main;
import ShemaTableElements.*;

public class UserTableModel {

	public static void main(String[] args) {
		
			// Catalogue de la table
			CatalogueA catalogue_1 = new CatalogueA("cat1");

			// L'input de l'algorithme actuel
			InputA input_add_1 = new InputA();

			// Les colonnes de l'input
			ConstraintA currentColConstr_add_1_1 = new ConstraintA("");
			ColumnA<Integer> currentColumn_add_1_1 = new ColumnA<Integer>("col11", 1, ColumnDataTypeA.INTEGER, currentColConstr_add_1_1);
			input_add_1.addColumnToInput(currentColumn_add_1_1);
			ConstraintA currentColConstr_add_1_2 = new ConstraintA("");
			ColumnA<Integer> currentColumn_add_1_2 = new ColumnA<Integer>("col12", 2, ColumnDataTypeA.INTEGER, currentColConstr_add_1_2);
			input_add_1.addColumnToInput(currentColumn_add_1_2);

			// L'output de l'algorithme
			ConstraintA outputConstr_add__1_0 = new ConstraintA("");
			ColumnA<Integer> currentAlgoOutput_add_1_0 = new ColumnA<Integer>("col1+col2", 0, ColumnDataTypeA.INTEGER, outputConstr_add__1_0);

			// Créer l'algorithme
			AlgorithmA currentAlgo_add_1 = new AlgorithmA(input_add_1, (OutputA) currentAlgoOutput_add_1_0, "add", "c://add.py");
			catalogue_1.addAlgorithm(currentAlgo_add_1);
			
			// La table d'id 1
			ShemaTableA table_1 = new ShemaTableA("Tab1", 1, catalogue_1);

			// Fichier des contraintes de la colonne courante
			ConstraintA contraintes_1_1 =  new ConstraintA("");

			// Création de la colonne courante d'id 1
			ColumnA<Integer> currentColumn_1_1 = new ColumnA<Integer>("col11", 1, ColumnDataTypeA.INTEGER, contraintes_1_1);

			// Ajouter la colonne d'id 1 à la table
			table_1.addColumn(currentColumn_1_1);

			// Fichier des contraintes de la colonne courante
			ConstraintA contraintes_1_2 =  new ConstraintA("");

			// Création de la colonne courante d'id 2
			ColumnA<Integer> currentColumn_1_2 = new ColumnA<Integer>("col12", 2, ColumnDataTypeA.INTEGER, contraintes_1_2);

			// Ajouter la colonne d'id 2 à la table
			table_1.addColumn(currentColumn_1_2);

			// Fichier des contraintes de la colonne courante
			ConstraintA contraintes_1_3 =  new ConstraintA("");

			// Création de la colonne courante d'id 3
			ColumnA<Integer> currentColumn_1_3 = new ColumnA<Integer>("col13", 3, ColumnDataTypeA.INTEGER, contraintes_1_3);

			// Ajouter la colonne d'id 3 à la table
			table_1.addColumn(currentColumn_1_3);

			// Fichier des contraintes de la colonne courante
			ConstraintA contraintes_1_4 =  new ConstraintA("");

			// Création de la colonne courante d'id 4
			ColumnA<Integer> currentColumn_1_4 = new ColumnA<Integer>("col14", 4, ColumnDataTypeA.INTEGER, contraintes_1_4);

			// Ajouter la colonne d'id 4 à la table
			table_1.addColumn(currentColumn_1_4);
			// Catalogue de la table
			CatalogueA catalogue_2 = new CatalogueA("cat2");
			
			// La table d'id 2
			ShemaTableA table_2 = new ShemaTableA("Tab2", 2, catalogue_2);

			// Fichier des contraintes de la colonne courante
			ConstraintA contraintes_2_1 =  new ConstraintA("");

			// Création de la colonne courante d'id 1
			ColumnA<Integer> currentColumn_2_1 = new ColumnA<Integer>("col21", 1, ColumnDataTypeA.INTEGER, contraintes_2_1);

			// Ajouter la colonne d'id 1 à la table
			table_2.addColumn(currentColumn_2_1);

			// Fichier des contraintes de la colonne courante
			ConstraintA contraintes_2_2 =  new ConstraintA("");

			// Création de la colonne courante d'id 2
			ColumnA<Integer> currentColumn_2_2 = new ColumnA<Integer>("col22", 2, ColumnDataTypeA.INTEGER, contraintes_2_2);

			// Ajouter la colonne d'id 2 à la table
			table_2.addColumn(currentColumn_2_2);
	}
}

