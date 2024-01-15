package shemaTableElements;

/** Classe représentant une sortie d'un algorithme */
public class Output extends Column {

    /**
     * Constructeur de la classe Output
     * @param name Le nom de la colonne
     * @param dataType Le type de la colonne
     * @param id L'identifiant de la colonne
     * @param constraintFile La contrainte de la colonne
     */
    public Output(String name, int id, ColumnDataType dataType, Constraint constraintFile) {
        super(name, id, dataType, constraintFile);
    }
}
