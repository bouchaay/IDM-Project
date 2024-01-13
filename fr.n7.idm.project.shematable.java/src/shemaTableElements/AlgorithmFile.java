package shemaTableElements;

/** Classe représentant un fichier d'algorithme */
public class AlgorithmFile {

    /** le nom du fichier */
    private String name;
    /** Dossier des ressources */
    private Resource resource;

    /**
     * Constructeur de la classe AlgorithmFile
     * @param path Le path du fichier
     * @param resource Le dossier des ressources
     */
    public AlgorithmFile(String name, Resource resource) {
        this.name = name;
        this.resource = resource;
    }

    /**
     * Retourne le path du fichier
     * @return Le path du fichier
     */
    public String getName() {
        return name;
    }

    /**
     * Retourne le dossier des ressources
     * @return Le dossier des ressources
     */
    public Resource getResource() {
        return resource;
    }

    /**
     * Modifie le path du fichier
     * @param path Le nouveau path du fichier
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Modifie le dossier des ressources
     * @param resource Le nouveau dossier des ressources
     */
    public void setResource(Resource resource) {
        this.resource = resource;
    }
}
