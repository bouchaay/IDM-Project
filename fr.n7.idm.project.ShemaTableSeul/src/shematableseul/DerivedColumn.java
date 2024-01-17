/**
 */
package shematableseul;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shematableseul.DerivedColumn#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link shematableseul.DerivedColumn#getOutputColumn <em>Output Column</em>}</li>
 * </ul>
 *
 * @see shematableseul.ShematableseulPackage#getDerivedColumn()
 * @model
 * @generated
 */
public interface DerivedColumn extends Column {
	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' reference.
	 * @see #setAlgorithm(Algorithm)
	 * @see shematableseul.ShematableseulPackage#getDerivedColumn_Algorithm()
	 * @model required="true"
	 * @generated
	 */
	Algorithm getAlgorithm();

	/**
	 * Sets the value of the '{@link shematableseul.DerivedColumn#getAlgorithm <em>Algorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' reference.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(Algorithm value);

	/**
	 * Returns the value of the '<em><b>Output Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Column</em>' reference.
	 * @see #setOutputColumn(Output)
	 * @see shematableseul.ShematableseulPackage#getDerivedColumn_OutputColumn()
	 * @model required="true"
	 * @generated
	 */
	Output getOutputColumn();

	/**
	 * Sets the value of the '{@link shematableseul.DerivedColumn#getOutputColumn <em>Output Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Column</em>' reference.
	 * @see #getOutputColumn()
	 * @generated
	 */
	void setOutputColumn(Output value);

} // DerivedColumn
