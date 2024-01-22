/**
 * generated by Xtext 2.32.0
 */
package fr.n7.idm.project.xtext.shemaTables;

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
 *   <li>{@link fr.n7.idm.project.xtext.shemaTables.Catalogue#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.idm.project.xtext.shemaTables.Catalogue#getAlgorithms <em>Algorithms</em>}</li>
 * </ul>
 *
 * @see fr.n7.idm.project.xtext.shemaTables.ShemaTablesPackage#getCatalogue()
 * @model
 * @generated
 */
public interface Catalogue extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.n7.idm.project.xtext.shemaTables.ShemaTablesPackage#getCatalogue_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.n7.idm.project.xtext.shemaTables.Catalogue#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Algorithms</b></em>' containment reference list.
   * The list contents are of type {@link fr.n7.idm.project.xtext.shemaTables.Algorithm}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Algorithms</em>' containment reference list.
   * @see fr.n7.idm.project.xtext.shemaTables.ShemaTablesPackage#getCatalogue_Algorithms()
   * @model containment="true"
   * @generated
   */
  EList<Algorithm> getAlgorithms();

} // Catalogue