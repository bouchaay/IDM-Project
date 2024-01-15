/**
 */
package shemaTables;

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
 *   <li>{@link shemaTables.Catalogue#getName <em>Name</em>}</li>
 *   <li>{@link shemaTables.Catalogue#getAlgorithms <em>Algorithms</em>}</li>
 * </ul>
 *
 * @see shemaTables.ShemaTablesPackage#getCatalogue()
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
	 * @see shemaTables.ShemaTablesPackage#getCatalogue_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link shemaTables.Catalogue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Algorithms</b></em>' reference list.
	 * The list contents are of type {@link shemaTables.Algorithm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithms</em>' reference list.
	 * @see shemaTables.ShemaTablesPackage#getCatalogue_Algorithms()
	 * @model
	 * @generated
	 */
	EList<Algorithm> getAlgorithms();

} // Catalogue
