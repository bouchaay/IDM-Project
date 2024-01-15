/**
 */
package fr.n7.idm.project.shemaTableWithAlgorithme;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.idm.project.shemaTableWithAlgorithme.Output#getAlgoOfOutput <em>Algo Of Output</em>}</li>
 * </ul>
 *
 * @see fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTableWithAlgorithmePackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends Column {
	/**
	 * Returns the value of the '<em><b>Algo Of Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algo Of Output</em>' reference.
	 * @see #setAlgoOfOutput(Algorithm)
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTableWithAlgorithmePackage#getOutput_AlgoOfOutput()
	 * @model required="true"
	 * @generated
	 */
	Algorithm getAlgoOfOutput();

	/**
	 * Sets the value of the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Output#getAlgoOfOutput <em>Algo Of Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algo Of Output</em>' reference.
	 * @see #getAlgoOfOutput()
	 * @generated
	 */
	void setAlgoOfOutput(Algorithm value);

} // Output
