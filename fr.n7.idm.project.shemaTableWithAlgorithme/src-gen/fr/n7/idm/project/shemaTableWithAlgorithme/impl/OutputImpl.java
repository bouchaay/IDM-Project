/**
 */
package fr.n7.idm.project.shemaTableWithAlgorithme.impl;

import fr.n7.idm.project.shemaTableWithAlgorithme.Algorithm;
import fr.n7.idm.project.shemaTableWithAlgorithme.Output;
import fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTableWithAlgorithmePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.OutputImpl#getAlgoOfOutput <em>Algo Of Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputImpl extends ColumnImpl implements Output {
	/**
	 * The cached value of the '{@link #getAlgoOfOutput() <em>Algo Of Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgoOfOutput()
	 * @generated
	 * @ordered
	 */
	protected Algorithm algoOfOutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShemaTableWithAlgorithmePackage.Literals.OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Algorithm getAlgoOfOutput() {
		if (algoOfOutput != null && algoOfOutput.eIsProxy()) {
			InternalEObject oldAlgoOfOutput = (InternalEObject) algoOfOutput;
			algoOfOutput = (Algorithm) eResolveProxy(oldAlgoOfOutput);
			if (algoOfOutput != oldAlgoOfOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ShemaTableWithAlgorithmePackage.OUTPUT__ALGO_OF_OUTPUT, oldAlgoOfOutput, algoOfOutput));
			}
		}
		return algoOfOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Algorithm basicGetAlgoOfOutput() {
		return algoOfOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgoOfOutput(Algorithm newAlgoOfOutput) {
		Algorithm oldAlgoOfOutput = algoOfOutput;
		algoOfOutput = newAlgoOfOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ShemaTableWithAlgorithmePackage.OUTPUT__ALGO_OF_OUTPUT, oldAlgoOfOutput, algoOfOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ShemaTableWithAlgorithmePackage.OUTPUT__ALGO_OF_OUTPUT:
			if (resolve)
				return getAlgoOfOutput();
			return basicGetAlgoOfOutput();
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
		case ShemaTableWithAlgorithmePackage.OUTPUT__ALGO_OF_OUTPUT:
			setAlgoOfOutput((Algorithm) newValue);
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
		case ShemaTableWithAlgorithmePackage.OUTPUT__ALGO_OF_OUTPUT:
			setAlgoOfOutput((Algorithm) null);
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
		case ShemaTableWithAlgorithmePackage.OUTPUT__ALGO_OF_OUTPUT:
			return algoOfOutput != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputImpl
