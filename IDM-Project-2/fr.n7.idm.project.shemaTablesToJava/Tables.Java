
package mainPackage;
import shemaTableElements.*;

public class TableApplication {

	public static void main(String[] args) {
		

		// Catalogue de la table
		Catalogue catalogue = new Catalogue("");



			// L'input de l'algorithme actuel

			// La constante de l'input s'il en a
				Input input = new Input();

			// Les colonnes de l'input
					Constraint currentColConstr = new Constraint("invalid");
						currentColumn = new Column<Integer>("col11", 1, ColumnDataType.INTEGER, currentColConstr);
					input.addColumnToInput(currentColumn);
					Constraint currentColConstr = new Constraint("invalid");
						currentColumn = new Column<Integer>("col12", 2, ColumnDataType.INTEGER, currentColConstr);
					input.addColumnToInput(currentColumn);

			// L'output de l'algorithme
				Constraint outputConstr = new Constraint("invalid");
					currentAlgoOutput = new Column<Integer>("col1+col2", 0, ColumnDataType.INTEGER, outputConstr);

			// Créer l'algorithme
			Algorithm currentAlgo = new Algorithm(input, currentAlgoOutput, "add", "c://add.py");
			catalogue.addAlgorithm(currentAlgo);
			
		// La table d'id 1
		ShemaTable table = new ShemaTable("Tab1", 1, catalogue);



			// Fichier des contraintes de la colonne courante
			Constraint contraintes =  new Constraint("invalid");
			
			// Création de la colonne courante d'id 1
			currentColumn = new Column<Integer>("col11", 1, ColumnDataType.INTEGER, contraintes);

			// Ajouter la colonne d'id 1 à la table
			table.addColumn(currentColumn);

			// Fichier des contraintes de la colonne courante
			Constraint contraintes =  new Constraint("invalid");
			
			// Création de la colonne courante d'id 2
			currentColumn = new Column<Integer>("col12", 2, ColumnDataType.INTEGER, contraintes);

			// Ajouter la colonne d'id 2 à la table
			table.addColumn(currentColumn);

			// Fichier des contraintes de la colonne courante
			Constraint contraintes =  new Constraint("invalid");
			
			// Création de la colonne courante d'id 3
			currentColumn = new Column<Integer>("col13", 3, ColumnDataType.INTEGER, contraintes);

			// Ajouter la colonne d'id 3 à la table
			table.addColumn(currentColumn);

			// Fichier des contraintes de la colonne courante
			Constraint contraintes =  new Constraint("invalid");
			
			// Création de la colonne courante d'id 4
			currentColumn = new Column<Integer>("col14", 4, ColumnDataType.INTEGER, contraintes);

			// Ajouter la colonne d'id 4 à la table
			table.addColumn(currentColumn);

		// Catalogue de la table
		Catalogue catalogue = new Catalogue("");


			
		// La table d'id 2
		ShemaTable table = new ShemaTable("Tab2", 2, catalogue);



			// Fichier des contraintes de la colonne courante
			Constraint contraintes =  new Constraint("invalid");
			
			// Création de la colonne courante d'id 1
			currentColumn = new Column<Integer>("col21", 1, ColumnDataType.INTEGER, contraintes);

			// Ajouter la colonne d'id 1 à la table
			table.addColumn(currentColumn);

			// Fichier des contraintes de la colonne courante
			Constraint contraintes =  new Constraint("invalid");
			
			// Création de la colonne courante d'id 2
			currentColumn = new Column<Integer>("col22", 2, ColumnDataType.INTEGER, contraintes);

			// Ajouter la colonne d'id 2 à la table
			table.addColumn(currentColumn);
	}
}

