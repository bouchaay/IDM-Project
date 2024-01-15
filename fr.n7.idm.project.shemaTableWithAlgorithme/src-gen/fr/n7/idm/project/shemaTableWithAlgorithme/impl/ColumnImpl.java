/**
 */
package fr.n7.idm.project.shemaTableWithAlgorithme.impl;

import fr.n7.idm.project.shemaTableWithAlgorithme.Column;
import fr.n7.idm.project.shemaTableWithAlgorithme.ColumnDataType;
import fr.n7.idm.project.shemaTableWithAlgorithme.Constraint;
import fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTableWithAlgorithmePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.ColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.ColumnImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.ColumnImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.ColumnImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnImpl extends MinimalEObjectImpl.Container implements Column {
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
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final ColumnDataType DATA_TYPE_EDEFAULT = ColumnDataType.INT;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected ColumnDataType dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected Constraint constraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShemaTableWithAlgorithmePackage.Literals.COLUMN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShemaTableWithAlgorithmePackage.COLUMN__NAME, oldName,
					name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShemaTableWithAlgorithmePackage.COLUMN__ID, oldId,
					id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColumnDataType getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(ColumnDataType newDataType) {
		ColumnDataType oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShemaTableWithAlgorithmePackage.COLUMN__DATA_TYPE,
					oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constraint getConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraint(Constraint newConstraint, NotificationChain msgs) {
		Constraint oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShemaTableWithAlgorithmePackage.COLUMN__CONSTRAINT, oldConstraint, newConstraint);
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
	public void setConstraint(Constraint newConstraint) {
		if (newConstraint != constraint) {
			NotificationChain msgs = null;
			if (constraint != null)
				msgs = ((InternalEObject) constraint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShemaTableWithAlgorithmePackage.COLUMN__CONSTRAINT, null, msgs);
			if (newConstraint != null)
				msgs = ((InternalEObject) newConstraint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShemaTableWithAlgorithmePackage.COLUMN__CONSTRAINT, null, msgs);
			msgs = basicSetConstraint(newConstraint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShemaTableWithAlgorithmePackage.COLUMN__CONSTRAINT,
					newConstraint, newConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ShemaTableWithAlgorithmePackage.COLUMN__CONSTRAINT:
			return basicSetConstraint(null, msgs);
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
		case ShemaTableWithAlgorithmePackage.COLUMN__NAME:
			return getName();
		case ShemaTableWithAlgorithmePackage.COLUMN__ID:
			return getId();
		case ShemaTableWithAlgorithmePackage.COLUMN__DATA_TYPE:
			return getDataType();
		case ShemaTableWithAlgorithmePackage.COLUMN__CONSTRAINT:
			return getConstraint();
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
		case ShemaTableWithAlgorithmePackage.COLUMN__NAME:
			setName((String) newValue);
			return;
		case ShemaTableWithAlgorithmePackage.COLUMN__ID:
			setId((Integer) newValue);
			return;
		case ShemaTableWithAlgorithmePackage.COLUMN__DATA_TYPE:
			setDataType((ColumnDataType) newValue);
			return;
		case ShemaTableWithAlgorithmePackage.COLUMN__CONSTRAINT:
			setConstraint((Constraint) newValue);
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
		case ShemaTableWithAlgorithmePackage.COLUMN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ShemaTableWithAlgorithmePackage.COLUMN__ID:
			setId(ID_EDEFAULT);
			return;
		case ShemaTableWithAlgorithmePackage.COLUMN__DATA_TYPE:
			setDataType(DATA_TYPE_EDEFAULT);
			return;
		case ShemaTableWithAlgorithmePackage.COLUMN__CONSTRAINT:
			setConstraint((Constraint) null);
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
		case ShemaTableWithAlgorithmePackage.COLUMN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ShemaTableWithAlgorithmePackage.COLUMN__ID:
			return id != ID_EDEFAULT;
		case ShemaTableWithAlgorithmePackage.COLUMN__DATA_TYPE:
			return dataType != DATA_TYPE_EDEFAULT;
		case ShemaTableWithAlgorithmePackage.COLUMN__CONSTRAINT:
			return constraint != null;
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
		result.append(", dataType: ");
		result.append(dataType);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
