package ShemaTableElements;

/** Classe représentant une sortie d'un algorithme */
public class Output extends Column {

    /**
     * Constructeur de la classe Output
     * @param name Le nom de la colonne
     * @param dataType Le type de la colonne
     */
    public Output(String name, ColumnDataType dataType) {
        super(name, 0, dataType, null);
    }
}
