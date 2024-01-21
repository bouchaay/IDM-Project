package Frame;
import ShemaTableElements.*;
import User.*;
import Ressource.Operation;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;



import java.awt.*;
import java.io.IOException;
import java.util.Vector;
import java.util.ArrayList;
import java.util.List;


public class TableToFrame extends JFrame {

    private JTable jTable;
    private DefaultTableModel tableModel;
	private ShemaTableA table;

    public TableToFrame(ShemaTableA table) {
		this.table = table;
        tableModel = new DefaultTableModel();

            // Créer la JTable et l'attacher au modèle de tableau
          
        jTable = new JTable(tableModel);

    // Ajouter la JTable à un JScrollPane pour permettre le défilement si nécessaire
        JScrollPane scrollPane = new JScrollPane(jTable);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Ajouter des boutons pour les opérations d'ajout et de suppression
        JPanel buttonPanel = new JPanel();
        JButton addRowButton = new JButton("Ajouter Ligne");
        JButton removeRowButton = new JButton("Supprimer Ligne");
        /*JButton addColButton = new JButton("Ajouter Colonne");
        JButton removeColButton = new JButton("Supprimer Colonne");*/

        addRowButton.addActionListener(e -> ajouterLigne());
        removeRowButton.addActionListener(e -> supprimerLigne());
        /*addColButton.addActionListener(e -> ajouterColonne());
        removeColButton.addActionListener(e -> supprimerColonne());*/

        buttonPanel.add(addRowButton);
        buttonPanel.add(removeRowButton);
        /*buttonPanel.add(addColButton);
        buttonPanel.add(removeColButton);*/
		// Créer la barre de menu
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Créer le menu "Fichier"
        JMenu fichierMenu = new JMenu("Fichier");
        menuBar.add(fichierMenu);

        // Créer le menu "visaualiser"
        JMenu visualiseMenu = new JMenu("visualiser");
        menuBar.add(visualiseMenu);
        JMenuItem graphMenuItem = new JMenuItem("Graphe");
        graphMenuItem.addActionListener(e -> visualiser(0)); 
        visualiseMenu.add(graphMenuItem );
        
        JMenuItem histogrammeMenuItem = new JMenuItem("Histogramme");
        histogrammeMenuItem.addActionListener(e -> visualiser(1));
        visualiseMenu.add(histogrammeMenuItem);

        // Ajouter l'option "Importer"
        JMenuItem importerMenuItem = new JMenuItem("Importer");
        importerMenuItem.addActionListener(e -> impoorterf()); 
        fichierMenu.add(importerMenuItem);

        // Ajouter l'option "Exporter"
        JMenuItem exporterMenuItem = new JMenuItem("Exporter");
        exporterMenuItem.addActionListener(e -> exporterf()); 
        fichierMenu.add(exporterMenuItem);

        // Ajouter l'option Enregistrer
        JMenuItem enregistrerMenuItem = new JMenuItem("Enregistrer");
        enregistrerMenuItem.addActionListener(e -> Enregistrer());
        fichierMenu.add(enregistrerMenuItem);
            
        
    

        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

		// Initialiser le modèle de tableau par défaut
		initialiserTableau();
		
		this.setSize(600, 400);
        this.setVisible(true);

        
    }

    private void initialiserTableau() {
        // Ajouter les colonnes

        List<ColumnA<?>> columns = table.getColumns();
		
		for (ColumnA<?> c : columns) {
			tableModel.addColumn(String.valueOf(c.getName()));
			/*List<?> values = c.getValues();
			int nbLigne = values.size();
			System.out.println(nbLigne);
			Vector<Object> row = new Vector<>();
			Object[] value = new Object[nbLigne];
			/*for (int j = 0; j < nbLigne; j++) {
				row.add(values.get(j));
				value[j] = values.get(j);
			}
			System.out.println("ajout de la ligne");
			System.out.println( value);
			tableModel.addRow(row);*/
		}
	
		
    }

	/*private void ajouterNomsLignes() {
        Vector<String> nomsLignes = new Vector<>();
        for (int i = 1; i <= tableModel.getRowCount(); i++) {
            nomsLignes.add("Ligne " + i);
        }
        tableModel.setRowIdentifiers(nomsLignes);
    }*/
	private void impoorterf() {
		Import imp = new Import();
		imp.updateData();
        List<ColumnA<String>> columns = imp.getColumns();
		
		// Mettre à jour le modèle de tableau avec de nouvelles données
		mettreAJourTableau(columns);
	}


  private void mettreAJourTableau(List<ColumnA<String>> columns) {
    // Effacer toutes les colonnes existantes
    tableModel.setColumnCount(0);

    List<ColumnA<?>> columnst = table.getColumns();
    //nombre de colonne du tableau importer
    int nbcolTab =columns.size();
    //nombre de colonne du notre table la table
    int nbcol = columnst.size();

    if(nbcol >= nbcolTab){
         // Ajouter les nouvelles colonnes
        for (int i = 0; i < nbcolTab; i++) {
            tableModel.addColumn(String.valueOf(columnst.get(i).getName()),columns.get(i).getValues().toArray());    
        }
    }else{
        // tableau importer a plus de colonne que notre table donc non adapter à notre table
        initialiserTableau();
        JOptionPane.showMessageDialog(this, "Le tableau importer n'est pas adapter à notre table");
    }
        
}

    private void Enregistrer() {
        
        for (ColumnA c : table.getColumns()) {
            List<?> values = getColumn(c.getName());
            ColumnA column = new ColumnA(c.getName(), c.getId(), c.getDataType(), c.getConstraintFile(), values);
            this.table.setColumnName(c.getName(), column);
        }
        
        CatalogueA catalogue = table.getCatalogue();
        List<AlgorithmA> algorithms = catalogue.getAlgorithms();
        for (int i = 0; i < algorithms.size(); i++) {
            Operation op = new Operation(table);
            System.out.println("algo " + i);
            String list = op.excOperation(i);
            System.out.println("algo2 " + list);
            List<?> columnCalcu = getValueInt(list);
            
            System.out.println("columnCalcu " + columnCalcu);
            String nameAlg = "Output" + algorithms.get(i).getName() ;
            System.out.println("nameAlg " + nameAlg);
            this.table.setColumnWithName(nameAlg, columnCalcu);
        }

        List<ColumnA<String>> columnstr = toColumnsStr(table.getColumns());
        mettreAJourTableau(columnstr); 
           
        JOptionPane.showMessageDialog(this, "Enregistrer");
    }



   




    // transforme string : la liste en  liste de string
    private List<String> getValueInt (String colum){
        List<String> columnc = new ArrayList<>();

        // Supprimer les crochets d'ouverture et de fermeture
        colum = colum.substring(1, colum.length() - 1);

        // Diviser la chaîne en un tableau de chaînes en utilisant la virgule comme délimiteur
        String[] elements = colum.split(",");
        for (String element : elements) {
            try {
                double valeur = Double.parseDouble(element.trim());
                columnc.add(String.valueOf(valeur));
            } catch (NumberFormatException e) {
                e.printStackTrace();
                // Handle the case where conversion fails (invalid string)
            }
        }

        // Display the list of floating-point numbers
        System.out.println(columnc);
        return columnc;
    }
    


   /*  private List<List<?>> getValuesIn (AlgorithmA algo){
        List<String> colInNames = algo.getColInNames();
        List<List<?>> colInValues = new ArrayList<>();
        for (String colName : colInNames) {
            ColumnA<?> col = table.getColumnByName(colName);
            if (col != null) {
                colInValues.add(col.getValues());
            }
        }
        return colInValues;
    }*/

	
    private void visualiser(int typeGraphique) {

        try {
            Runtime.getRuntime().exec("python tracer_graphique.py");
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<ColumnA<?>> columns = table.getColumns();
        String[] choixSelectionnes = new String[columns.size()];
        //String choixX;
        //String choixY;
        for (int i = 0; i < columns.size(); i++) {
            choixSelectionnes[i] = columns.get(i).getName();
        }
        /*SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Visualiser2 vis = new Visualiser2();

                // Attendre jusqu'à ce que la fenêtre soit fermée
                vis.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                        // Utiliser les phrases dans un autre code
                        String x = interfacePhrases.getPhraseA();
                        String y = interfacePhrases.getPhraseB();

                        // Faire quelque chose avec les phrases (afficher dans la console dans cet exemple)
                        System.out.println("X " + x);
                        System.out.println("Y " + y);
                    }
                });
            }
        });*/

        
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run()  {

            
                Visualiser vis = new Visualiser(choixSelectionnes);

                // Attendre jusqu'à ce que la fenêtre soit fermée
                vis.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                        // Utiliser les phrases dans un autre code
                        String choixX = vis.getXEx();
                        String choixY = vis.getYEx();
                        List<?> xs = getColumn(choixX);
                        List<?> ys = getColumn(choixY);

                       /*  for (String str : x) {
                            System.out.println(Integer.parseInt(str));
                        }*/
                        
                        // to int
                        //List<Integer> x = strToInt(xs);
                        //List<Integer> y = strToInt(ys);


                        System.out.println(xs);
                        System.out.println(ys);
                        Graphe graph = new Graphe(xs, ys, typeGraphique);
                        graph.creerGraphe();

                        // Faire quelque chose avec les phrases (afficher dans la console dans cet exemple)
                        System.out.println("Choix X " + choixX);
                        System.out.println("Choix Y " + choixY);
                    }

            
                
            
            });
        }

 
        });
    }
        
        /*while (!vis.getChoixFait()) {
            try {
                Thread.sleep(100); // Attendre un court instant pour éviter de bloquer le thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/

        public List<Integer> strToInt (List<String> list){
            List<Integer> listInt = new ArrayList<Integer>();
            for (String str : list) {
                listInt.add(Integer.parseInt(str));
            }
            return listInt;
        }

       
        
    
		
	
	private void exporterf() {
		JOptionPane.showMessageDialog(this, "Exporter");
	}
    // Méthode pour ajouter une ligne au tableau
    private void ajouterLigne() {
        Vector<Object> emptyRow = new Vector<>();
        int rowCount = tableModel.getRowCount();
        emptyRow.add(rowCount + 1);
        for (int i = 0; i < tableModel.getColumnCount(); i++) {
            emptyRow.add("");
        }
        tableModel.addRow(emptyRow);
    }

    // Méthode pour supprimer une ligne du tableau
    private void supprimerLigne() {
        int selectedRow = jTable.getSelectedRow();
        if (selectedRow != -1) {
            tableModel.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Veuillez sélectionner une ligne à supprimer.");
        }
    }

    // Méthode pour ajouter une colonne au tableau
   /*  private void ajouterColonne() {
        String columnName = JOptionPane.showInputDialog(this, "Nom de la colonne :");
        if (columnName != null && !columnName.isEmpty()) {
            tableModel.addColumn(columnName);
        }
    }

    // Méthode pour supprimer une colonne du tableau
        private void supprimerColonne() {
            int selectedColumn = jTable.getSelectedColumn();
            if (selectedColumn != -1) {
                tableModel.setColumnCount(tableModel.getColumnCount() - 1);
            } else {
                JOptionPane.showMessageDialog(this, "Veuillez sélectionner une colonne à supprimer.");
            }
        }*/
    
     // Add this closing brace


    public List<?> getColumn(String columnName) {
        List<Object> column = new ArrayList<>(); // Specify the type of List as Object
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            column.add((Object) tableModel.getValueAt(i, tableModel.findColumn(columnName))); // Explicitly cast the value to Object
        }
        return column;
    }

    public List<String> toStr (List<?> list){
        List<String> listStr = new ArrayList<String>();
        for (Object str : list) {
            listStr.add(String.valueOf(str));
        }
        return listStr;
    }

    public ColumnA<String> toColumnStr (ColumnA<?> column){
        List<String> listStr = toStr(column.getValues());
        ColumnA<String> columnStr = new ColumnA<String>(column.getName(), column.getId(), ColumnDataTypeA.STRING, null, listStr);
        return columnStr;
    }

    public List<ColumnA<String>> toColumnsStr (List<ColumnA<?>> columns){
        List<ColumnA<String>> columnsStr = new ArrayList<ColumnA<String>>();
        for (ColumnA<?> column : columns) {
            columnsStr.add(toColumnStr(column));
        }
        return columnsStr;
    }
}
