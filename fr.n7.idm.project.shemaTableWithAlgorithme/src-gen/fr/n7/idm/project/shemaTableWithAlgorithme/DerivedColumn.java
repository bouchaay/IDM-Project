/**
 */
package fr.n7.idm.project.shemaTableWithAlgorithme;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.idm.project.shemaTableWithAlgorithme.DerivedColumn#getOutputColumn <em>Output Column</em>}</li>
 * </ul>
 *
 * @see fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTableWithAlgorithmePackage#getDerivedColumn()
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
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTableWithAlgorithmePackage#getDerivedColumn_OutputColumn()
	 * @model required="true"
	 * @generated
	 */
	Output getOutputColumn();

	/**
	 * Sets the value of the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.DerivedColumn#getOutputColumn <em>Output Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Column</em>' reference.
	 * @see #getOutputColumn()
	 * @generated
	 */
	void setOutputColumn(Output value);

} // DerivedColumn
