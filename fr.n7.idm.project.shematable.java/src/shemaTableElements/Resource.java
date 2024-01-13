package shemaTableElements;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

/** Représente le dossier source des algorithmes */
public class Resource {

    /** Path du dossier source des algorithmes */
    private String folderPath;
    /** Dictionnaire d'algorithme et son AlgorithmFile */
    private Map<Algorithm, AlgorithmFile> algorithms;

    /**
     * Constructeur de la classe Resource
     * @param folderPath Le path du dossier source des algorithmes
     */
    public Resource(String folderPath) {
        this.folderPath = folderPath;
        this.algorithms = new HashMap<Algorithm, AlgorithmFile>();
    }

    /**
     * Retourne le path du dossier source des algorithmes
     * @return Le path du dossier source des algorithmes
     */
    public String getFolderPath() {
        return folderPath;
    }

    /**
     * Retourne le dictionnaire d'algorithme et son AlgorithmFile
     * @return Le dictionnaire d'algorithme et son AlgorithmFile
     */
    public Map<Algorithm, AlgorithmFile> getAlgorithms() {
        return algorithms;
    }

    /**
     * Ajouter un algorithme et son AlgorithmFile au dictionnaire
     * @param algorithm L'algorithme à ajouter
     * @param algorithmFile L'AlgorithmFile à ajouter
     */
    public void addAlgorithm(Algorithm algorithm, AlgorithmFile algorithmFile) {
        this.algorithms.put(algorithm, algorithmFile);
    }

    /**
     * Retourne la liste des noms des algorithmes disponibles dans le dossier source
     * @return La liste des noms des algorithmes disponibles dans le dossier source
     */
    public List<String> getAlgorithmsNames() {
        List<String> algorithmsNames = new ArrayList<String>();
        for (AlgorithmFile algorithmFile : this.algorithms.values()) {
            algorithmsNames.add(algorithmFile.getName());
        }
        return algorithmsNames;
    }
}
