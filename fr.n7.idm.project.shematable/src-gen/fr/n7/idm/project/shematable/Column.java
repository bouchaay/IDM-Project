/**
 */
package fr.n7.idm.project.shematable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.idm.project.shematable.Column#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.idm.project.shematable.Column#getId <em>Id</em>}</li>
 *   <li>{@link fr.n7.idm.project.shematable.Column#getDataType <em>Data Type</em>}</li>
 *   <li>{@link fr.n7.idm.project.shematable.Column#getConstraintFile <em>Constraint File</em>}</li>
 * </ul>
 *
 * @see fr.n7.idm.project.shematable.ShematablePackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.n7.idm.project.shematable.ShematablePackage#getColumn_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.n7.idm.project.shematable.Column#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see fr.n7.idm.project.shematable.ShematablePackage#getColumn_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link fr.n7.idm.project.shematable.Column#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.n7.idm.project.shematable.ColumnDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see fr.n7.idm.project.shematable.ColumnDataType
	 * @see #setDataType(ColumnDataType)
	 * @see fr.n7.idm.project.shematable.ShematablePackage#getColumn_DataType()
	 * @model
	 * @generated
	 */
	ColumnDataType getDataType();

	/**
	 * Sets the value of the '{@link fr.n7.idm.project.shematable.Column#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see fr.n7.idm.project.shematable.ColumnDataType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(ColumnDataType value);

	/**
	 * Returns the value of the '<em><b>Constraint File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint File</em>' containment reference.
	 * @see #setConstraintFile(Constraint)
	 * @see fr.n7.idm.project.shematable.ShematablePackage#getColumn_ConstraintFile()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Constraint getConstraintFile();

	/**
	 * Sets the value of the '{@link fr.n7.idm.project.shematable.Column#getConstraintFile <em>Constraint File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint File</em>' containment reference.
	 * @see #getConstraintFile()
	 * @generated
	 */
	void setConstraintFile(Constraint value);

} // Column
