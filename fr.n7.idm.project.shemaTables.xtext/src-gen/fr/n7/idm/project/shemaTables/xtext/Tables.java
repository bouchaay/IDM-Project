/**
 * generated by Xtext 2.32.0
 */
package fr.n7.idm.project.shemaTables.xtext;

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
 *   <li>{@link fr.n7.idm.project.shemaTables.xtext.Tables#getShematables <em>Shematables</em>}</li>
 * </ul>
 *
 * @see fr.n7.idm.project.shemaTables.xtext.XtextPackage#getTables()
 * @model
 * @generated
 */
public interface Tables extends EObject
{
  /**
   * Returns the value of the '<em><b>Shematables</b></em>' containment reference list.
   * The list contents are of type {@link fr.n7.idm.project.shemaTables.xtext.ShemaTable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shematables</em>' containment reference list.
   * @see fr.n7.idm.project.shemaTables.xtext.XtextPackage#getTables_Shematables()
   * @model containment="true"
   * @generated
   */
  EList<ShemaTable> getShematables();

} // Tables