package ShemaTableElements;
import java.util.ArrayList;
import java.util.List;

public class ShemaTable {

    /** Nom de la table */
	private String name;
    /** Liste des colonnes de la table */
    private int id;
    /** Liste des colonnes de la table */
    private List<Column<?>> columns;
    /** Catalogue associé à la table */
    private Catalogue catalogue;
    
    /** Constructeur de la classe ShemaTable
     * @param name Le nom de la table
     * @param id L'identifiant de la table
     */
    public ShemaTable(String name, int id, Catalogue catalogue) {
        this.name = name;
        this.id = id;
        this.catalogue = catalogue;
        this.columns = new ArrayList<Column<?>>();
        this.columns.add(new Column<Integer>("Lines Id", 0, ColumnDataType.INTEGER, new Constraint("")));
    }

    /** Constructeur de la classe ShemaTable
     * @param name Le nom de la table
     * @param id L'identifiant de la table
     * @param columns La liste des colonnes de la table
     */
    public ShemaTable(String name, int id, List<Column<?>> columns) {
        this.name = name;
        this.id = id;
        this.columns = columns;
    }

    /**
     * Retourne le nom de la table
     * @return Le nom de la table
     */
    public String getName() {
        return name;
    }

    /**
     * Retourne l'identifiant de la table
     * @return L'identifiant de la table
     */
    public int getId() {
        return id;
    }

    /**
     * Retourne le catalogue associé à la table
     * @return Le catalogue associé à la table
     */
    public Catalogue getCatalogue() {
        return catalogue;
    }

    /**
     * Retourne la liste des colonnes de la table
     * @return La liste des colonnes de la table
     */
    public List<Column<?>> getColumns() {
        return columns;
    }

    /**
     * Ajoute une colonne à la table
     * @param column La colonne à ajouter
     */
    public void addColumn(Column<?> column) {
        this.columns.add(column);
    }

    /**
     * Supprime la colonne d'indice index
     * @param index L'indice de la colonne à supprimer
     */
    public void removeColumn(int index) {
        this.columns.remove(index);
    }

    /**
     * Retourne la colonne d'indice index
     * @param index L'indice de la colonne à retourner
     * @return La colonne d'indice index
     */
    public Column<?> getColumnByIndex(int index) {
        return this.columns.get(index);
    }

    /**
     * Retourner une colonne par son nom
     * @param name Le nom de la colonne à retourner
     * @return La colonne de nom name
     */
    public Column<?> getColumnByName(String name) {
        for (Column<?> column : this.columns) {
            if (column.getName().equals(name)) {
                return column;
            }
        }
        return null;
    }
}
