package ShemaTableElements;
import java.util.ArrayList;
import java.util.List;

/** Liste des shema de tables */
public class Tables {

    /** Listes des shema de tables */
    private List<ShemaTable> shemaTables;

    /**
     * Constructeur de la classe Tables
     * @param shemaTables Les shema de tables
     */
    public Tables(List<ShemaTable> shemaTables) {
        this.shemaTables = shemaTables;
    }

    /**
     * Constructeur de la classe Tables (nouvelle liste de shema de tables vide)
     */
    public Tables() {
        this.shemaTables = new ArrayList<ShemaTable>();
    }

    /**
     * Retourne les shema de tables
     * @return Les shema de tables
     */
    public List<ShemaTable> getShemaTables() {
        return shemaTables;
    }

    /**
     * Modifie les shema de tables
     * @param shemaTables Les nouveaux shema de tables
     */
    public void setShemaTables(List<ShemaTable> shemaTables) {
        this.shemaTables = shemaTables;
    }

    /**
     * Ajoute un shema de table
     * @param shemaTable Le shema de table a ajouter
     */
    public void addShemaTable(ShemaTable shemaTable) {
        this.shemaTables.add(shemaTable);
    }

    /**
     * Supprime un shema de table
     * @param shemaTable Le shema de table a supprimer
     */
    public void removeShemaTable(ShemaTable shemaTable) {
        this.shemaTables.remove(shemaTable);
    }

    /**
     * Retourne le shema de table a l'indice i
     * @param i L'indice du shema de table
     * @return Le shema de table a l'indice i
     */
    public ShemaTable getShemaTable(int i) {
        return this.shemaTables.get(i);
    }

    /**
     * Retourne le nombre de shema de tables
     * @return Le nombre de shema de tables
     */
    public int size() {
        return this.shemaTables.size();
    }

    /**
     * Retourne le shema de table dont le nom est name
     * @param name Le nom du shema de table
     * @return Le shema de table dont le nom est name
     */
    public ShemaTable getShemaTable(String name) {
        for (ShemaTable shemaTable : this.shemaTables) {
            if (shemaTable.getName().equals(name)) {
                return shemaTable;
            }
        }
        return null;
    }
}
