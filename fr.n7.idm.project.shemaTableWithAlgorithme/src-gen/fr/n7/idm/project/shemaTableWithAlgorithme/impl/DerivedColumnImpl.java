/**
 */
package fr.n7.idm.project.shemaTableWithAlgorithme.impl;

import fr.n7.idm.project.shemaTableWithAlgorithme.DerivedColumn;
import fr.n7.idm.project.shemaTableWithAlgorithme.Output;
import fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTableWithAlgorithmePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.DerivedColumnImpl#getOutputColumn <em>Output Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivedColumnImpl extends ColumnImpl implements DerivedColumn {
	/**
	 * The cached value of the '{@link #getOutputColumn() <em>Output Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputColumn()
	 * @generated
	 * @ordered
	 */
	protected Output outputColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShemaTableWithAlgorithmePackage.Literals.DERIVED_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output getOutputColumn() {
		if (outputColumn != null && outputColumn.eIsProxy()) {
			InternalEObject oldOutputColumn = (InternalEObject) outputColumn;
			outputColumn = (Output) eResolveProxy(oldOutputColumn);
			if (outputColumn != oldOutputColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ShemaTableWithAlgorithmePackage.DERIVED_COLUMN__OUTPUT_COLUMN, oldOutputColumn,
							outputColumn));
			}
		}
		return outputColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output basicGetOutputColumn() {
		return outputColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputColumn(Output newOutputColumn) {
		Output oldOutputColumn = outputColumn;
		outputColumn = newOutputColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ShemaTableWithAlgorithmePackage.DERIVED_COLUMN__OUTPUT_COLUMN, oldOutputColumn, outputColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ShemaTableWithAlgorithmePackage.DERIVED_COLUMN__OUTPUT_COLUMN:
			if (resolve)
				return getOutputColumn();
			return basicGetOutputColumn();
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
		case ShemaTableWithAlgorithmePackage.DERIVED_COLUMN__OUTPUT_COLUMN:
			setOutputColumn((Output) newValue);
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
		case ShemaTableWithAlgorithmePackage.DERIVED_COLUMN__OUTPUT_COLUMN:
			setOutputColumn((Output) null);
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
		case ShemaTableWithAlgorithmePackage.DERIVED_COLUMN__OUTPUT_COLUMN:
			return outputColumn != null;
		}
		return super.eIsSet(featureID);
	}

} //DerivedColumnImpl
