package shemaTableElements;

/** Classe représentant une sortie d'un algorithme */
public class Output extends Column {
    
    Algorithm algorithm;

    /**
     * Constructeur de la classe Output
     * @param name Le nom de la colonne
     * @param dataType Le type de la colonne
     * @param algorithm L'algorithme
     */
    public Output(String name, int id, String constraintFilePath, Algorithm algorithm) {
        super(name, id, algorithm.getInput().getDataType(), new Constraint(constraintFilePath));
        this.algorithm = algorithm;
    }

    /**
     * Retourne l'algorithme
     * @return L'algorithme
     */
    public Algorithm getAlgorithm() {
        return algorithm;
    }

    /**
     * Modifie l'algorithme
     * @param algorithm Le nouvel algorithme
     */
    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }
}
