/**
 */
package shemaTables;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenced Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shemaTables.ReferencedColumn#getForeignTable <em>Foreign Table</em>}</li>
 * </ul>
 *
 * @see shemaTables.ShemaTablesPackage#getReferencedColumn()
 * @model
 * @generated
 */
public interface ReferencedColumn extends Column {
	/**
	 * Returns the value of the '<em><b>Foreign Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Table</em>' reference.
	 * @see #setForeignTable(Tables)
	 * @see shemaTables.ShemaTablesPackage#getReferencedColumn_ForeignTable()
	 * @model required="true"
	 * @generated
	 */
	Tables getForeignTable();

	/**
	 * Sets the value of the '{@link shemaTables.ReferencedColumn#getForeignTable <em>Foreign Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Table</em>' reference.
	 * @see #getForeignTable()
	 * @generated
	 */
	void setForeignTable(Tables value);

} // ReferencedColumn
