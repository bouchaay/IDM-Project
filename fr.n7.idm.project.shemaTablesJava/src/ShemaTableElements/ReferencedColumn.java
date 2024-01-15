package ShemaTableElements;

public class ReferencedColumn extends Column {

    /** La table étrangère */
	private ShemaTable foreignTable;
    /** La colonne étrangère */
    private Column<?> foreignColumn;

    /**
     * Constructeur de la classe ReferencedColumn
     * @param name Le nom de la colonne
     * @param id L'identifiant de la colonne
     * @param dataType Le type de la colonne
     * @param constraintFile La contrainte de la colonne
     * @param foreignTable La table étrangère
     * @param foreignColumn La colonne étrangère
     */
    public ReferencedColumn(String name, int id, ColumnDataType dataType, Constraint constraintFile, ShemaTable foreignTable, Column<?> foreignColumn) {
        super(name, id, dataType, constraintFile);
        this.foreignTable = foreignTable;
        this.foreignColumn = foreignColumn;
    }

    /**
     * Retourne la table étrangère
     * @return La table étrangère
     */
    public ShemaTable getForeignTable() {
        return foreignTable;
    }

    /**
     * Retournela colonne étrangère
     * @return La colonne étrangère
     */
    public Column<?> getForeignColumn() {
        return foreignColumn;
    }
}
