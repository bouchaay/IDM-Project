/**
 */
package fr.n7.idm.project.shemaTableWithAlgorithme.impl;

import fr.n7.idm.project.shemaTableWithAlgorithme.Catalogue;
import fr.n7.idm.project.shemaTableWithAlgorithme.Column;
import fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTable;
import fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTableWithAlgorithmePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shema Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableImpl#getCatalogue <em>Catalogue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShemaTableImpl extends MinimalEObjectImpl.Container implements ShemaTable {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columns;

	/**
	 * The cached value of the '{@link #getCatalogue() <em>Catalogue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogue()
	 * @generated
	 * @ordered
	 */
	protected Catalogue catalogue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShemaTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShemaTableWithAlgorithmePackage.Literals.SHEMA_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShemaTableWithAlgorithmePackage.SHEMA_TABLE__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShemaTableWithAlgorithmePackage.SHEMA_TABLE__ID,
					oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Column> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<Column>(Column.class, this,
					ShemaTableWithAlgorithmePackage.SHEMA_TABLE__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Catalogue getCatalogue() {
		if (catalogue != null && catalogue.eIsProxy()) {
			InternalEObject oldCatalogue = (InternalEObject) catalogue;
			catalogue = (Catalogue) eResolveProxy(oldCatalogue);
			if (catalogue != oldCatalogue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ShemaTableWithAlgorithmePackage.SHEMA_TABLE__CATALOGUE, oldCatalogue, catalogue));
			}
		}
		return catalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalogue basicGetCatalogue() {
		return catalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCatalogue(Catalogue newCatalogue) {
		Catalogue oldCatalogue = catalogue;
		catalogue = newCatalogue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ShemaTableWithAlgorithmePackage.SHEMA_TABLE__CATALOGUE, oldCatalogue, catalogue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ShemaTableWithAlgorithmePackage.SHEMA_TABLE__COLUMNS:
			return ((InternalEList<?>) getColumns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ShemaTableWithAlgorithmePackage.SHEMA_TABLE__NAME:
			return getName();
		case ShemaTableWithAlgorithmePackage.SHEMA_TABLE__ID:
			return getId();
		case ShemaTableWithAlgorithmePackage.SHEMA_TABLE__COLUMNS:
			return getColumns();
		case ShemaTableWithAlgorithmePackage.SHEMA_TABLE__CATALOGUE:
			if (resolve)
				return getCatalogue();
			return basicGetCatalogue();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ShemaTableWithAlgorithmePackage.SHEMA_TABLE__NAME:
			setName((String) newValue);
			return;
		case ShemaTableWithAlgorithmePackage.SHEMA_TABLE__ID:
			setId((Integer) newValue);
			return;
		case ShemaTableWithAlgorithmePackage.SHEMA_TABLE__COLUMNS:
			getColumns().clear();
			getColumns().addAll((Collection<? extends Column>) newValue);
			return;
		case ShemaTableWithAlgorithmePackage.SHEMA_TABLE__CATALOGUE:
			setCatalogue((Catalogue) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case ShemaTableWithAlgorithmePackage.SHEMA_TABLE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ShemaTableWithAlgorithmePackage.SHEMA_TABLE__ID:
			setId(ID_EDEFAULT);
			return;
		case ShemaTableWithAlgorithmePackage.SHEMA_TABLE__COLUMNS:
			getColumns().clear();
			return;
		case ShemaTableWithAlgorithmePackage.SHEMA_TABLE__CATALOGUE:
			setCatalogue((Catalogue) null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ShemaTableWithAlgorithmePackage.SHEMA_TABLE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ShemaTableWithAlgorithmePackage.SHEMA_TABLE__ID:
			return id != ID_EDEFAULT;
		case ShemaTableWithAlgorithmePackage.SHEMA_TABLE__COLUMNS:
			return columns != null && !columns.isEmpty();
		case ShemaTableWithAlgorithmePackage.SHEMA_TABLE__CATALOGUE:
			return catalogue != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ShemaTableImpl
