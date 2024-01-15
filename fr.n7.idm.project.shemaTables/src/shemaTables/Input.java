/**
 */
package shemaTables;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link shemaTables.Input#getInputColumns <em>Input Columns</em>}</li>
 *   <li>{@link shemaTables.Input#getConstante <em>Constante</em>}</li>
 * </ul>
 *
 * @see shemaTables.ShemaTablesPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Columns</b></em>' containment reference list.
	 * The list contents are of type {@link shemaTables.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Columns</em>' containment reference list.
	 * @see shemaTables.ShemaTablesPackage#getInput_InputColumns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Column> getInputColumns();

	/**
	 * Returns the value of the '<em><b>Constante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constante</em>' containment reference.
	 * @see #setConstante(Constant)
	 * @see shemaTables.ShemaTablesPackage#getInput_Constante()
	 * @model containment="true"
	 * @generated
	 */
	Constant getConstante();

	/**
	 * Sets the value of the '{@link shemaTables.Input#getConstante <em>Constante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constante</em>' containment reference.
	 * @see #getConstante()
	 * @generated
	 */
	void setConstante(Constant value);

} // Input
