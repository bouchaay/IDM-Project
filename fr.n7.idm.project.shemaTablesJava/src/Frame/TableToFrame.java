package Frame;
import ShemaTableElements.*;
import User.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;



import java.awt.*;
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
    int nbLigneTab =columns.size();
    //nombre de colonne du notre table la table
    int nbLigne = columnst.size();

    if(nbLigne >= nbLigneTab){
         // Ajouter les nouvelles colonnes
        for (int i = 0; i < nbLigneTab; i++) {
            tableModel.addColumn(String.valueOf(columnst.get(i).getName()),columns.get(i).getValues().toArray());    
        }
    }else{
        // tableau importer a plus de colonne que notre table donc non adapter à notre table
        initialiserTableau();
        JOptionPane.showMessageDialog(this, "Le tableau importer n'est pas adapter à notre table");
    }
        
    

}
	
    private void visualiser(int typeGraphique) {
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
                        List<String> xs = getColumn(choixX);
                        List<String> ys = getColumn(choixY);

                       /*  for (String str : x) {
                            System.out.println(Integer.parseInt(str));
                        }*/
                        
                        // to int
                        List<Integer> x = strToInt(xs);
                        List<Integer> y = strToInt(ys);


                        System.out.println(x);
                        System.out.println(y);
                        Graphe graph = new Graphe(x, y, typeGraphique);
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


    public List<String> getColumn(String columnName) {
        List<String> column = new ArrayList<>();
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            column.add((String) tableModel.getValueAt(i, tableModel.findColumn(columnName)));
        }
        return column;
    }
}
