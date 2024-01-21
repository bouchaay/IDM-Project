/**
 * generated by Xtext 2.32.0
 */
package fr.n7.idm.project.xtext.shemaTables;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.idm.project.xtext.shemaTables.Tables#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.idm.project.xtext.shemaTables.Tables#getShematables <em>Shematables</em>}</li>
 * </ul>
 *
 * @see fr.n7.idm.project.xtext.shemaTables.ShemaTablesPackage#getTables()
 * @model
 * @generated
 */
public interface Tables extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.n7.idm.project.xtext.shemaTables.ShemaTablesPackage#getTables_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.n7.idm.project.xtext.shemaTables.Tables#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Shematables</b></em>' containment reference list.
   * The list contents are of type {@link fr.n7.idm.project.xtext.shemaTables.ShemaTable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shematables</em>' containment reference list.
   * @see fr.n7.idm.project.xtext.shemaTables.ShemaTablesPackage#getTables_Shematables()
   * @model containment="true"
   * @generated
   */
  EList<ShemaTable> getShematables();

} // Tables
