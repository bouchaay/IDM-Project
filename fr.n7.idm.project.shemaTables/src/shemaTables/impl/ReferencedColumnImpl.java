/**
 */
package shemaTables.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import shemaTables.ReferencedColumn;
import shemaTables.ShemaTablesPackage;
import shemaTables.Tables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referenced Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link shemaTables.impl.ReferencedColumnImpl#getForeignTable <em>Foreign Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferencedColumnImpl extends ColumnImpl implements ReferencedColumn {
	/**
	 * The cached value of the '{@link #getForeignTable() <em>Foreign Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignTable()
	 * @generated
	 * @ordered
	 */
	protected Tables foreignTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencedColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShemaTablesPackage.Literals.REFERENCED_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tables getForeignTable() {
		if (foreignTable != null && foreignTable.eIsProxy()) {
			InternalEObject oldForeignTable = (InternalEObject)foreignTable;
			foreignTable = (Tables)eResolveProxy(oldForeignTable);
			if (foreignTable != oldForeignTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShemaTablesPackage.REFERENCED_COLUMN__FOREIGN_TABLE, oldForeignTable, foreignTable));
			}
		}
		return foreignTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tables basicGetForeignTable() {
		return foreignTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForeignTable(Tables newForeignTable) {
		Tables oldForeignTable = foreignTable;
		foreignTable = newForeignTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShemaTablesPackage.REFERENCED_COLUMN__FOREIGN_TABLE, oldForeignTable, foreignTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShemaTablesPackage.REFERENCED_COLUMN__FOREIGN_TABLE:
				if (resolve) return getForeignTable();
				return basicGetForeignTable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ShemaTablesPackage.REFERENCED_COLUMN__FOREIGN_TABLE:
				setForeignTable((Tables)newValue);
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
			case ShemaTablesPackage.REFERENCED_COLUMN__FOREIGN_TABLE:
				setForeignTable((Tables)null);
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
			case ShemaTablesPackage.REFERENCED_COLUMN__FOREIGN_TABLE:
				return foreignTable != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferencedColumnImpl
