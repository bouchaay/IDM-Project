/**
 */
package fr.n7.idm.project.shemaTableWithAlgorithme.impl;

import fr.n7.idm.project.shemaTableWithAlgorithme.Column;
import fr.n7.idm.project.shemaTableWithAlgorithme.Constant;
import fr.n7.idm.project.shemaTableWithAlgorithme.Input;
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
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.InputImpl#getInputColumns <em>Input Columns</em>}</li>
 *   <li>{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.InputImpl#getConstante <em>Constante</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends MinimalEObjectImpl.Container implements Input {
	/**
	 * The cached value of the '{@link #getInputColumns() <em>Input Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> inputColumns;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShemaTableWithAlgorithmePackage.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Column> getInputColumns() {
		if (inputColumns == null) {
			inputColumns = new EObjectContainmentEList<Column>(Column.class, this,
					ShemaTableWithAlgorithmePackage.INPUT__INPUT_COLUMNS);
		}
		return inputColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constant getConstante() {
		return constante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstante(Constant newConstante, NotificationChain msgs) {
		Constant oldConstante = constante;
		constante = newConstante;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShemaTableWithAlgorithmePackage.INPUT__CONSTANTE, oldConstante, newConstante);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstante(Constant newConstante) {
		if (newConstante != constante) {
			NotificationChain msgs = null;
			if (constante != null)
				msgs = ((InternalEObject) constante).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShemaTableWithAlgorithmePackage.INPUT__CONSTANTE, null, msgs);
			if (newConstante != null)
				msgs = ((InternalEObject) newConstante).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShemaTableWithAlgorithmePackage.INPUT__CONSTANTE, null, msgs);
			msgs = basicSetConstante(newConstante, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShemaTableWithAlgorithmePackage.INPUT__CONSTANTE,
					newConstante, newConstante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ShemaTableWithAlgorithmePackage.INPUT__INPUT_COLUMNS:
			return ((InternalEList<?>) getInputColumns()).basicRemove(otherEnd, msgs);
		case ShemaTableWithAlgorithmePackage.INPUT__CONSTANTE:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ShemaTableWithAlgorithmePackage.INPUT__INPUT_COLUMNS:
			return getInputColumns();
		case ShemaTableWithAlgorithmePackage.INPUT__CONSTANTE:
			return getConstante();
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
		case ShemaTableWithAlgorithmePackage.INPUT__INPUT_COLUMNS:
			getInputColumns().clear();
			getInputColumns().addAll((Collection<? extends Column>) newValue);
			return;
		case ShemaTableWithAlgorithmePackage.INPUT__CONSTANTE:
			setConstante((Constant) newValue);
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
		case ShemaTableWithAlgorithmePackage.INPUT__INPUT_COLUMNS:
			getInputColumns().clear();
			return;
		case ShemaTableWithAlgorithmePackage.INPUT__CONSTANTE:
			setConstante((Constant) null);
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
		case ShemaTableWithAlgorithmePackage.INPUT__INPUT_COLUMNS:
			return inputColumns != null && !inputColumns.isEmpty();
		case ShemaTableWithAlgorithmePackage.INPUT__CONSTANTE:
			return constante != null;
		}
		return super.eIsSet(featureID);
	}

} //InputImpl
