/**
 * generated by Xtext 2.32.0
 */
package fr.n7.idm.project.shemaTables.xtext.impl;

import fr.n7.idm.project.shemaTables.xtext.Column;
import fr.n7.idm.project.shemaTables.xtext.Constant;
import fr.n7.idm.project.shemaTables.xtext.Input;
import fr.n7.idm.project.shemaTables.xtext.XtextPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.idm.project.shemaTables.xtext.impl.InputImpl#getConstante <em>Constante</em>}</li>
 *   <li>{@link fr.n7.idm.project.shemaTables.xtext.impl.InputImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends MinimalEObjectImpl.Container implements Input
{
  /**
   * The cached value of the '{@link #getConstante() <em>Constante</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstante()
   * @generated
   * @ordered
   */
  protected Constant constante;

  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected EList<Column> columns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InputImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return XtextPackage.Literals.INPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Constant getConstante()
  {
    return constante;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstante(Constant newConstante, NotificationChain msgs)
  {
    Constant oldConstante = constante;
    constante = newConstante;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XtextPackage.INPUT__CONSTANTE, oldConstante, newConstante);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConstante(Constant newConstante)
  {
    if (newConstante != constante)
    {
      NotificationChain msgs = null;
      if (constante != null)
        msgs = ((InternalEObject)constante).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XtextPackage.INPUT__CONSTANTE, null, msgs);
      if (newConstante != null)
        msgs = ((InternalEObject)newConstante).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XtextPackage.INPUT__CONSTANTE, null, msgs);
      msgs = basicSetConstante(newConstante, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XtextPackage.INPUT__CONSTANTE, newConstante, newConstante));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Column> getColumns()
  {
    if (columns == null)
    {
      columns = new EObjectResolvingEList<Column>(Column.class, this, XtextPackage.INPUT__COLUMNS);
    }
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case XtextPackage.INPUT__CONSTANTE:
        return basicSetConstante(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case XtextPackage.INPUT__CONSTANTE:
        return getConstante();
      case XtextPackage.INPUT__COLUMNS:
        return getColumns();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XtextPackage.INPUT__CONSTANTE:
        setConstante((Constant)newValue);
        return;
      case XtextPackage.INPUT__COLUMNS:
        getColumns().clear();
        getColumns().addAll((Collection<? extends Column>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case XtextPackage.INPUT__CONSTANTE:
        setConstante((Constant)null);
        return;
      case XtextPackage.INPUT__COLUMNS:
        getColumns().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case XtextPackage.INPUT__CONSTANTE:
        return constante != null;
      case XtextPackage.INPUT__COLUMNS:
        return columns != null && !columns.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InputImpl