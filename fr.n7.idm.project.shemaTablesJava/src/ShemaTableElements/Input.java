package ShemaTableElements;
import java.util.ArrayList;
import java.util.List;

/** Classe représentant une entrée d'un algorithme */
public class Input {

    /** La liste des colonnes pour l'entrée de l'algorithme */
    private List<Column<?>> columns;
    /** la constante pour l'entrée de l'algorithme */
    private Constant constante;

    /**
     * Constructeur de la classe Input (nouvelle entrée vide)
     */
    public Input() {
        this.columns = new ArrayList<Column<?>>();
    }

    /**
     * Constructeur de la classe Input (nouvelle entrée vide)
     * @param constante La constante pour l'entrée de l'algorithme
     */
    public Input(Constant constante) {
        this.columns = new ArrayList<Column<?>>();
        this.constante = constante;
    }

    /**
     * Constructeur de la classe Input
     * @param columns La liste des colonnes pour l'entrée de l'algorithme
     * @param constante La constante pour l'entrée de l'algorithme
     */
    public Input(List<Column<?>> columns, Constant constante) {
        this.columns = columns;
        this.constante = constante;
    }

    /**
     * Retourne la liste des colonnes pour l'entrée de l'algorithme
     * @return La liste des colonnes pour l'entrée de l'algorithme
     */
    public List<Column<?>> getColumns() {
        return columns;
    }

    /**
     * Retourne la constante pour l'entrée de l'algorithme
     * @return La constante pour l'entrée de l'algorithme
     */
    public Constant getConstant() {
        return constante;
    }

    /**
     * Modifie la liste des colonnes pour l'entrée de l'algorithme
     * @param columns La nouvelle liste des colonnes pour l'entrée de l'algorithme
     */
    public void setColumns(List<Column<?>> columns) {
        this.columns = columns;
    }

    /**
     * Modifie la constante pour l'entrée de l'algorithme
     * @param constante La nouvelle constante pour l'entrée de l'algorithme
     */
    public void setConstant(Constant constante) {
        this.constante = constante;
    }

    /**
     * Ajoute une colonne à la liste des colonnes pour l'entrée de l'algorithme
     * @param column La colonne à ajouter
     */
    public void addColumnToInput(Column<?> column) {
        this.columns.add(column);
    }

    /**
     * Retourne le type de donnée des colonnes de l'entrée de l'algorithme (colonne 2)
     * @return Le type de donnée des colonnes de l'entrée de l'algorithme
     */
    public ColumnDataType getDataType() {
        return this.columns.get(1).getDataType();
    }
}
