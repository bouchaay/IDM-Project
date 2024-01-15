package Main;
import ShemaTableElements.*;

public class UserTableModel {

	public static void main(String[] args) {
		
			// Catalogue de la table
			Catalogue catalogue_1 = new Catalogue("cat1");

			// L'input de l'algorithme actuel
			Input input_add_1 = new Input();

			// Les colonnes de l'input
			Constraint currentColConstr_add_1_1 = new Constraint("");
			Column<Integer> currentColumn_add_1_1 = new Column<Integer>("col11", 1, ColumnDataType.INTEGER, currentColConstr_add_1_1);
			input_add_1.addColumnToInput(currentColumn_add_1_1);
			Constraint currentColConstr_add_1_2 = new Constraint("");
			Column<Integer> currentColumn_add_1_2 = new Column<Integer>("col12", 2, ColumnDataType.INTEGER, currentColConstr_add_1_2);
			input_add_1.addColumnToInput(currentColumn_add_1_2);

			// L'output de l'algorithme
			Constraint outputConstr_add__1_0 = new Constraint("");
			Column<Integer> currentAlgoOutput_add_1_0 = new Column<Integer>("col1+col2", 0, ColumnDataType.INTEGER, outputConstr_add__1_0);

			// Créer l'algorithme
			Algorithm currentAlgo_add_1 = new Algorithm(input_add_1, (Output) currentAlgoOutput_add_1_0, "add", "c://add.py");
			catalogue_1.addAlgorithm(currentAlgo_add_1);
			
			// La table d'id 1
			ShemaTable table_1 = new ShemaTable("Tab1", 1, catalogue_1);

			// Fichier des contraintes de la colonne courante
			Constraint contraintes_1_1 =  new Constraint("");

			// Création de la colonne courante d'id 1
			Column<Integer> currentColumn_1_1 = new Column<Integer>("col11", 1, ColumnDataType.INTEGER, contraintes_1_1);

			// Ajouter la colonne d'id 1 à la table
			table_1.addColumn(currentColumn_1_1);

			// Fichier des contraintes de la colonne courante
			Constraint contraintes_1_2 =  new Constraint("");

			// Création de la colonne courante d'id 2
			Column<Integer> currentColumn_1_2 = new Column<Integer>("col12", 2, ColumnDataType.INTEGER, contraintes_1_2);

			// Ajouter la colonne d'id 2 à la table
			table_1.addColumn(currentColumn_1_2);

			// Fichier des contraintes de la colonne courante
			Constraint contraintes_1_3 =  new Constraint("");

			// Création de la colonne courante d'id 3
			Column<Integer> currentColumn_1_3 = new Column<Integer>("col13", 3, ColumnDataType.INTEGER, contraintes_1_3);

			// Ajouter la colonne d'id 3 à la table
			table_1.addColumn(currentColumn_1_3);

			// Fichier des contraintes de la colonne courante
			Constraint contraintes_1_4 =  new Constraint("");

			// Création de la colonne courante d'id 4
			Column<Integer> currentColumn_1_4 = new Column<Integer>("col14", 4, ColumnDataType.INTEGER, contraintes_1_4);

			// Ajouter la colonne d'id 4 à la table
			table_1.addColumn(currentColumn_1_4);
			// Catalogue de la table
			Catalogue catalogue_2 = new Catalogue("cat2");
			
			// La table d'id 2
			ShemaTable table_2 = new ShemaTable("Tab2", 2, catalogue_2);

			// Fichier des contraintes de la colonne courante
			Constraint contraintes_2_1 =  new Constraint("");

			// Création de la colonne courante d'id 1
			Column<Integer> currentColumn_2_1 = new Column<Integer>("col21", 1, ColumnDataType.INTEGER, contraintes_2_1);

			// Ajouter la colonne d'id 1 à la table
			table_2.addColumn(currentColumn_2_1);

			// Fichier des contraintes de la colonne courante
			Constraint contraintes_2_2 =  new Constraint("");

			// Création de la colonne courante d'id 2
			Column<Integer> currentColumn_2_2 = new Column<Integer>("col22", 2, ColumnDataType.INTEGER, contraintes_2_2);

			// Ajouter la colonne d'id 2 à la table
			table_2.addColumn(currentColumn_2_2);
	}
}

