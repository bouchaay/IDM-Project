package shemaTableElements;

public class DerivedColumn extends Column {

    /** L'output dont la vient */
    Output output;
    /**
     * Constructeur de la classe DerivedColumn (LA colonne est dérivé d'autres colonnes à partir d'un algortihme, donc c'est un Output d'algorithme)
     */
    public DerivedColumn(Output output) {
        super(output.getName(), output.getId(), output.getDataType(), output.getConstraintFile());
        this.output = output;
    }

    /**
     * Récupère l'algorithme dont la colonne est dérivé
     * @return L'algorithme dont la colonne est dérivé
     */
    public Algorithm getAlgorithm() {
        return output.getAlgorithm();
    }

    /**
     * Récupère les colonnes qui étaient en entrée de l'algorithme
     * @return Les colonnes qui étaient en entrée de l'algorithme
     */
    public Input getInput() {
        return output.getAlgorithm().getInput();
    }
}
