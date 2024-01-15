/**
 */
package fr.n7.idm.project.shemaTableWithAlgorithme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.idm.project.shemaTableWithAlgorithme.Catalogue#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.idm.project.shemaTableWithAlgorithme.Catalogue#getAlgorithms <em>Algorithms</em>}</li>
 * </ul>
 *
 * @see fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTableWithAlgorithmePackage#getCatalogue()
 * @model
 * @generated
 */
public interface Catalogue extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTableWithAlgorithmePackage#getCatalogue_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Catalogue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Algorithms</b></em>' reference list.
	 * The list contents are of type {@link fr.n7.idm.project.shemaTableWithAlgorithme.Algorithm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithms</em>' reference list.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTableWithAlgorithmePackage#getCatalogue_Algorithms()
	 * @model
	 * @generated
	 */
	EList<Algorithm> getAlgorithms();

} // Catalogue
