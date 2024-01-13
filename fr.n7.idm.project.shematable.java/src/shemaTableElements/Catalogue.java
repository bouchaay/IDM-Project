package shemaTableElements;
import java.util.ArrayList;
import java.util.List;

public class Catalogue {

    /** Le nom du catalogue */
    private String name;
    /** Les noms des algorithmes du catalogue */
    private List<String> algorithms;

    /**
     * Constructeur de la classe Catalogue
     * @param name Le nom du catalogue
     * @param algorithms Les noms des algorithmes du catalogue
     */
    public Catalogue(String name, List<String> algorithms) {
        this.name = name;
        this.algorithms = algorithms;
    }

    /**
     * Constructeur de la classe Catalogue (nouveau catalogue vide)
     * @param name Le nom du catalogue
     */
    public Catalogue(String name) {
        this.name = name;
        this.algorithms = new ArrayList<String>();
    }

    /**
     * Retourne le nom du catalogue
     * @return Le nom du catalogue
     */
    public String getName() {
        return name;
    }

    /**
     * Retourne les noms des algorithmes du catalogue
     * @return Les noms des algorithmes du catalogue
     */
    public List<String> getAlgorithms() {
        return algorithms;
    }

    /**
     * Modifie le nom du catalogue
     * @param name Le nouveau nom du catalogue
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Modifie les noms des algorithmes du catalogue
     * @param algorithms Les nouveaux noms des algorithmes du catalogue
     */
    public void setAlgorithms(List<String> algorithms) {
        this.algorithms = algorithms;
    }

    /**
     * Ajoute un algorithme au catalogue
     * @param algorithm Le nom de l'algorithme à ajouter
     */
    public void addAlgorithm(String algorithm) {
        this.algorithms.add(algorithm);
    }

    /**
     * Retire un algorithme du catalogue
     * @param algorithm Le nom de l'algorithme à retirer
     */
    public void removeAlgorithm(String algorithm) {
        this.algorithms.remove(algorithm);
    }
}
