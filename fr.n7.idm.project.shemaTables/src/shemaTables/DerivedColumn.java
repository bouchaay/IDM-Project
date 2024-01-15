/**
 */
package shemaTables;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shemaTables.DerivedColumn#getOutputColumn <em>Output Column</em>}</li>
 *   <li>{@link shemaTables.DerivedColumn#getAlgorithm <em>Algorithm</em>}</li>
 * </ul>
 *
 * @see shemaTables.ShemaTablesPackage#getDerivedColumn()
 * @model
 * @generated
 */
public interface DerivedColumn extends Column {
	/**
	 * Returns the value of the '<em><b>Output Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Column</em>' reference.
	 * @see #setOutputColumn(Output)
	 * @see shemaTables.ShemaTablesPackage#getDerivedColumn_OutputColumn()
	 * @model required="true"
	 * @generated
	 */
	Output getOutputColumn();

	/**
	 * Sets the value of the '{@link shemaTables.DerivedColumn#getOutputColumn <em>Output Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Column</em>' reference.
	 * @see #getOutputColumn()
	 * @generated
	 */
	void setOutputColumn(Output value);

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' reference.
	 * @see #setAlgorithm(Algorithm)
	 * @see shemaTables.ShemaTablesPackage#getDerivedColumn_Algorithm()
	 * @model required="true"
	 * @generated
	 */
	Algorithm getAlgorithm();

	/**
	 * Sets the value of the '{@link shemaTables.DerivedColumn#getAlgorithm <em>Algorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' reference.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(Algorithm value);

} // DerivedColumn
