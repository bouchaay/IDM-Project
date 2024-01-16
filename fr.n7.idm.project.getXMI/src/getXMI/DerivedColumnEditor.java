package getXMI;

import javax.swing.*;
import ShemaTableElements.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DerivedColumnEditor extends JFrame {

    /** Nom de la colonne d'entrée */
    private JTextField inputColumnIdField;
    /** Nom de la colonne constante */
    private JTextField constantColumnIdField;
    /** Nom de l'algorithme */
    private JTextField algorithmNameField;
    /** Le path des resources */
    private String resourcePath;
    /** ShemaTable de l'entrée */
    ShemaTableA table;
    /** L'input de l'algorithme */
    public static InputA input = new InputA();
    /** l'output de l'algorithme */
    public static OutputA output;


    public DerivedColumnEditor(ShemaTableA table, String resourcePath) {
        this.table = table;
        this.resourcePath = resourcePath;
        setTitle("Input de l'Algorithme");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Créer des composants Swing
        inputColumnIdField = new JTextField(10);
        constantColumnIdField = new JTextField(10);
        algorithmNameField = new JTextField(10);

        JButton addInputButton = new JButton("Add Input");
        addInputButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInput();
            }
        });

        JButton addConstantButton = new JButton("Add Constant");
        addConstantButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addConstant();
            }
        });

        JButton finishButton = new JButton("Finish");
        finishButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                finish();
            }
        });

        // Ajouter des composants à un conteneur (JPanel ici)
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // JLabel pour "Input Column Id"
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Input Column Id"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(inputColumnIdField, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        panel.add(addInputButton, gbc);

        // JLabel pour "Constant Column Id"
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Constant"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(constantColumnIdField, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        panel.add(addConstantButton, gbc);

        // JLabel pour "Algorithm name"
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Algorithm name"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(algorithmNameField, gbc);

        // Bouton "Finish"
        gbc.gridx = 2;
        gbc.gridy = 2;
        panel.add(finishButton, gbc);

        // Ajouter le JPanel à la JFrame
        add(panel);

        // Afficher la JFrame
        setVisible(true);
    }

    private void addInput() {
        // Récupérer l'ID de la colonne d'entrée
        String inputColumnId = inputColumnIdField.getText();

        try {
            // Récupérer la colonne d'entrée à partir de l'ID
            ColumnA inputColumn = table.getColumnByIndex(Integer.parseInt(inputColumnId));
            // Ajouter la colonne d'entrée à l'input
            input.addColumnToInput(inputColumn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La colonne d'entrée n'existe pas", "Erreur", JOptionPane.ERROR_MESSAGE);
        }

        // Effacer le champ après l'ajout
        inputColumnIdField.setText("");
    }

    private void addConstant() {
        // Récupérer l'ID de la colonne constante
        String constant = constantColumnIdField.getText();

        // Créer l'instance de la colonne constante
        input.setConstant(new ConstantA(Integer.parseInt(constant)));
        // Effacer le champ après l'ajout
        constantColumnIdField.setText("");
    }

    private void finish() {
        // Récupérer le nom de l'algorithme
        String algorithmName = algorithmNameField.getText();
        String outputName = algorithmName + "Output";
        ColumnDataTypeA outputType = input.getDataType();
        // Créer l'instance de l'output
        output = new OutputA(outputName, outputType);
        // Créer l'instance de l'algorithme
        AlgorithmA algorithm = new AlgorithmA(input, output, algorithmName, resourcePath + "/" + algorithmName + ".py");
        // Ajouter l'algorithme au catalogue de la table
        table.getCatalogue().addAlgorithm(algorithm);
        // Disposer la fenêtre
        dispose();
        // Ouvrir la fenêtre de l'éditeur de colonnes
        new ColumnEditor(table, resourcePath);
    }
}
