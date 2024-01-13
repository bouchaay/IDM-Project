package shemaTableElements;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Les contraintes sont éccrites dans un fichiers texte sous la forme de :
 * > a -> tous les éléments de la colonne a doivent être supérieur à a
 * < a -> tous les éléments de la colonne a doivent être inférieur à a
 * >= a -> tous les éléments de la colonne a doivent être égaux à a
 * <= a -> tous les éléments de la colonne a doivent être inférieur ou égaux à a
 * != a -> tous les éléments de la colonne a doivent être différents de a
 * Les règle pour un string seront exprimées par des regex expressions.
 */
public class Constraint {

    /** Le path du fichier descontraintes */
    private String path;

    /**
     * Constructeur de la classe Constraint
     * @param path Le path du fichier des contraintes
     */
    public Constraint(String path) {
        this.path = path;
    }

    /**
     * Constructeur qui crée un fichier de contraintes vide
     * @param folderPath Le path du dossier où créer le fichier
     * @param name Le nom de la colonne
     */
    public Constraint(String folderPath, String name) {
        this.path = folderPath + "/" + name + ".txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(this.path));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Retourne le path du fichier des contraintes
     * @return Le path du fichier des contraintes
     */
    public String getPath() {
        return path;
    }

    /**
     * Modifie le path du fichier des contraintes
     * @param path Le nouveau path du fichier des contraintes
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Ajoute une contrainte au fichier
     * @param constraint La contrainte à ajouter
     */
    public void addConstraint(String constraint) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(this.path, true));
            writer.write(constraint);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Vérifie une contrainte sur une data de type int
     * @param column La colonne à vérifier
     * @return true si la colonne respecte les contraintes, false sinon
     */
    public boolean checkIntConstraint(String constraint, int data) {
        String[] parts = constraint.split(" ");
        if (parts[0].equals(">")) {
            return data > Integer.parseInt(parts[1]);
        } else if (parts[0].equals("<")) {
            return data < Integer.parseInt(parts[1]);
        } else if (parts[0].equals(">=")) {
            return data >= Integer.parseInt(parts[1]);
        } else if (parts[0].equals("<=")) {
            return data <= Integer.parseInt(parts[1]);
        } else if (parts[0].equals("!=")) {
            return data != Integer.parseInt(parts[1]);
        }
        return false;
    }

    /**
     * Vérifie une contrainte sur une data de type float
     * @param column La colonne à vérifier
     * @return true si la colonne respecte les contraintes, false sinon
     */
    public boolean checkFloatConstraint(String constraint, float data) {
        String[] parts = constraint.split(" ");
        if (parts[0].equals(">")) {
            return data > Float.parseFloat(parts[1]);
        } else if (parts[0].equals("<")) {
            return data < Float.parseFloat(parts[1]);
        } else if (parts[0].equals(">=")) {
            return data >= Float.parseFloat(parts[1]);
        } else if (parts[0].equals("<=")) {
            return data <= Float.parseFloat(parts[1]);
        } else if (parts[0].equals("!=")) {
            return data != Float.parseFloat(parts[1]);
        }
        return false;
    }

    /**
     * Matcher la contrainte regex sur la data de type string
     * @param column La colonne à vérifier
     * @return true si la colonne respecte les contraintes, false sinon
     */
    public boolean checkStringConstraint(String constraint, String data) {
        return data.matches(constraint);
    }

    /** Vérifier la contrainte sur un type de donnée
     * @param constraint La contrainte à vérifier
     * @param data La donnée à vérifier
     * @return true si la donnée respecte la contrainte, false sinon
     */
    public boolean checkConstraint(ColumnDataType type, String constraint, Object data) {
        if (type == ColumnDataType.INTEGER) {
            return checkIntConstraint(constraint, (int) data);
        } else if (type == ColumnDataType.FLOAT) {
            return checkFloatConstraint(constraint, (float) data);
        } else if (type == ColumnDataType.STRING) {
            return checkStringConstraint(constraint, (String) data);
        } else {
            return false;
        }
    }

    /**
     * Retourner la liste des contraintes contenues dans un fichiers
     * @return La liste des contraintes
    */
    public List<String> getConstraints() {
        List<String> constraints = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(this.path));
            String line = reader.readLine();
            while (line != null) {
                constraints.add(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return constraints;
    }
}
