package getXMI;

import javax.swing.*;

import ShemaTableElements.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColumnEditor extends JFrame {

    /** Nom de la colonne à ajouter */
    private JTextField columnNameField;
    /** Id de la colonne à ajouter */
    private JTextField columnIdField;
    /** Type de la colonne à ajouter */
    private JComboBox<String> dataTypeComboBox;
    /** Chemin du fichier de contraintes de la colonne à ajouter */
    private JTextField constraintsPathField;
    /** Liste des colonnes de la table */
    private ShemaTable table;
    /** Le path du dossier de ressource */
    private String folderPath;
    

    public ColumnEditor(ShemaTable table, String path) {
        this.table = table;
        this.folderPath = path;
        setTitle("Columns Editor");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Créer des composants Swing
        columnNameField = new JTextField(20);
        columnIdField = new JTextField(20);
        dataTypeComboBox = new JComboBox<>(new String[]{"int", "float", "string"});
        constraintsPathField = new JTextField(20);

        JButton addButton = new JButton("Add Column");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addColumn();
            }
        });

        JButton derivedColumnButton = new JButton("Add Derived Column");
        derivedColumnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new DerivedColumnEditor(table, folderPath);
            }
        });

        // Ajouter des composants à un conteneur (JPanel ici)
        JPanel panel = new JPanel(new GridLayout(5, 2));
        panel.add(new JLabel("Column Name:"));
        panel.add(columnNameField);
        panel.add(new JLabel("Column Id:"));
        panel.add(columnIdField);
        panel.add(new JLabel("Column DataType:"));
        panel.add(dataTypeComboBox);
        panel.add(new JLabel("Constraint File Path:"));
        panel.add(constraintsPathField);
        panel.add(addButton);
        panel.add(derivedColumnButton);

        // Ajouter le JPanel à la JFrame
        add(panel);

        // Afficher la JFrame
        setVisible(true);
    }

    private void addColumn() {
        // Le nom de la colonne
        String columnName = columnNameField.getText();
        // L'id de la colonne
        int columnId = Integer.parseInt(columnIdField.getText());
        // Le type de la colonne
        ColumnDataType columnDataType;
        String dataType = (String) dataTypeComboBox.getSelectedItem();
        if (dataType.equals("int")) {
            columnDataType = ColumnDataType.INTEGER;
        } else if (dataType.equals("float")) {
            columnDataType = ColumnDataType.FLOAT;
        } else if (dataType.equals("string")) {
            columnDataType = ColumnDataType.STRING;
        } else {
            columnDataType = ColumnDataType.STRING;
        }
        // Le chemin du fichier de contraintes de la colonne
        String constraintsPath = constraintsPathField.getText();

        switch (columnDataType) {
            case INTEGER:
                table.addColumn(new Column<Integer>(columnName, columnId, columnDataType, new Constraint(constraintsPath)));
                break;
            case FLOAT:
                table.addColumn(new Column<Float>(columnName, columnId, columnDataType, new Constraint(constraintsPath)));
                break;
            case STRING:
                table.addColumn(new Column<String>(columnName, columnId, columnDataType, new Constraint(constraintsPath)));
                break;
            default:
                table.addColumn(new Column<String>(columnName, columnId, columnDataType, new Constraint(constraintsPath)));
                break;
        }

        // Effacer les champs après l'ajout
        clearFields();
    }

    private void clearFields() {
        columnNameField.setText("");
        columnIdField.setText("");
        dataTypeComboBox.setSelectedIndex(0);
        constraintsPathField.setText("");
    }
}
