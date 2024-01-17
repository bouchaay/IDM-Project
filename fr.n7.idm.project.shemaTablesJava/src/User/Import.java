package User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import ShemaTableElements.*;
import Main.*;
import java.util.ArrayList;
import java.util.List;


public class Import {

    private List<ColumnA<String>> columns;

    public Import() {
        
        this.columns = new ArrayList<>();
    }

    


    public List<ColumnA<String>> getColumns() {
        return this.columns;
    }

    public void updateData() {
                JOptionPane.showMessageDialog(null, "Importer");
        		JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Sélectionner le fichier CSV");
                fileChooser.setFileFilter(new FileNameExtensionFilter("Fichiers CSV (*.csv)", "csv"));

                // Affichage de la boîte de dialogue
                int userSelection = fileChooser.showOpenDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION){
            String path = fileChooser.getSelectedFile().getAbsolutePath();
            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                String line;
                Boolean firstLine = true;
                // ...

                                while (((line = reader.readLine()) != null)) {
                                    String[] parts = line.split(",");
                                    if (firstLine) {
                                        firstLine = false;
                                        for (int i = 0; i < parts.length; i++) {
                                            ColumnA<String> column = new ColumnA<String>(parts[i], i, ColumnDataTypeA.STRING, null, new ArrayList<>());
                                            this.columns.add(column);
                                        }
                                    }else{for (int i = 0; i < parts.length; i++) {
                                        List<String> values = this.columns.get(i).getValues();
                                        values.add(parts[i]);
                                        ColumnA<String> column = this.columns.get(i);
                                        column.setValues(values);
                                        this.columns.set(i, column);    
                                    }}
                                    
                                    
                                }

            } catch (IOException e) {
                e.printStackTrace();
            }
             

        //Maintenant, vous avez chaque colonne dans une liste distincte
        for (ColumnA<String> column : this.columns) {
            System.out.println(column.getName() + " : " + column.getValues());
        
         }




} 
    }
}