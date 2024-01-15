/**
 */
package fr.n7.idm.project.shemaTableWithAlgorithme;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.idm.project.shemaTableWithAlgorithme.Constraint#getFilePath <em>File Path</em>}</li>
 * </ul>
 *
 * @see fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTableWithAlgorithmePackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Path</em>' attribute.
	 * @see #setFilePath(String)
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTableWithAlgorithmePackage#getConstraint_FilePath()
	 * @model
	 * @generated
	 */
	String getFilePath();

	/**
	 * Sets the value of the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Constraint#getFilePath <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Path</em>' attribute.
	 * @see #getFilePath()
	 * @generated
	 */
	void setFilePath(String value);

} // Constraint