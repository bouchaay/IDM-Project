package shemaTableElements;
import java.util.ArrayList;
import java.util.List;

/** Classe représentant un algorithme */
public class Algorithm {

    /** L'entrée de l'algorithme */
	Input input;
    /** La sortie de l'algorithme */
    Output output;
    /** Le nom de l'algorithme */
    String name;
    /** Le fichier de l'algorithme */
    String path;

    /**
     * Constructeur de la classe Algorithm
     * @param input L'entrée de l'algorithme
     * @param output La sortie de l'algorithme
     * @param name Le nom de l'algorithme
     * @param file Le fichier de l'algorithme
     */
    public Algorithm(Input input, Output output, String name, String path) {
        this.input = input;
        this.output = output;
        this.name = name;
        this.path = path;
    }

    /**
     * Retourne l'entrée de l'algorithme
     * @return L'entrée de l'algorithme
     */
    public Input getInput() {
        return input;
    }

    /**
     * Retourne la sortie de l'algorithme
     * @return La sortie de l'algorithme
     */
    public Output getOutput() {
        return output;
    }

    /**
     * Retourne le nom de l'algorithme
     * @return Le nom de l'algorithme
     */
    public String getName() {
        return name;
    }

    /**
     * Retourne le fichier de l'algorithme
     * @return Le fichier de l'algorithme
     */
    public String getPath() {
        return path;
    }
    

    /**
     * Modifie l'entrée de l'algorithme
     * @param input La nouvelle entrée de l'algorithme
     */
    public void setInput(Input input) {
        this.input = input;
    }

    /**
     * Modifie la sortie de l'algorithme
     * @param output La nouvelle sortie de l'algorithme
     */
    public void setOutput(Output output) {
        this.output = output;
    }

    /**
     * Modifie le nom de l'algorithme
     * @param name Le nouveau nom de l'algorithme
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Modifie le fichier de l'algorithme
     * @param file Le nouveau fichier de l'algorithme
     */
    public void setPath(String path) {
        this.path = path;
    }
}
