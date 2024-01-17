/**
 */
package shematableseul;

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
 *   <li>{@link shematableseul.Input#getConstante <em>Constante</em>}</li>
 *   <li>{@link shematableseul.Input#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see shematableseul.ShematableseulPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject {
	/**
	 * Returns the value of the '<em><b>Constante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constante</em>' containment reference.
	 * @see #setConstante(Constant)
	 * @see shematableseul.ShematableseulPackage#getInput_Constante()
	 * @model containment="true"
	 * @generated
	 */
	Constant getConstante();

	/**
	 * Sets the value of the '{@link shematableseul.Input#getConstante <em>Constante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constante</em>' containment reference.
	 * @see #getConstante()
	 * @generated
	 */
	void setConstante(Constant value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link shematableseul.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see shematableseul.ShematableseulPackage#getInput_Columns()
	 * @model required="true"
	 * @generated
	 */
	EList<Column> getColumns();

} // Input
