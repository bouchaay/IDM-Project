/**
 * generated by Xtext 2.32.0
 */
package fr.n7.idm.project.xtext.shemaTables.impl;

import fr.n7.idm.project.xtext.shemaTables.Algorithm;
import fr.n7.idm.project.xtext.shemaTables.ColumnDataType;
import fr.n7.idm.project.xtext.shemaTables.Constraint;
import fr.n7.idm.project.xtext.shemaTables.DerivedColumn;
import fr.n7.idm.project.xtext.shemaTables.Output;
import fr.n7.idm.project.xtext.shemaTables.ShemaTablesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.idm.project.xtext.shemaTables.impl.DerivedColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.idm.project.xtext.shemaTables.impl.DerivedColumnImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.n7.idm.project.xtext.shemaTables.impl.DerivedColumnImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link fr.n7.idm.project.xtext.shemaTables.impl.DerivedColumnImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link fr.n7.idm.project.xtext.shemaTables.impl.DerivedColumnImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link fr.n7.idm.project.xtext.shemaTables.impl.DerivedColumnImpl#getOutputColumn <em>Output Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivedColumnImpl extends MinimalEObjectImpl.Container implements DerivedColumn
{
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
   * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlgorithm()
   * @generated
   * @ordered
   */
  protected Algorithm algorithm;

  /**
   * The cached value of the '{@link #getOutputColumn() <em>Output Column</em>}' containment reference.
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
  protected DerivedColumnImpl()
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
    return ShemaTablesPackage.Literals.DERIVED_COLUMN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShemaTablesPackage.DERIVED_COLUMN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setId(int newId)
  {
    int oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShemaTablesPackage.DERIVED_COLUMN__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ColumnDataType getDataType()
  {
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDataType(ColumnDataType newDataType)
  {
    ColumnDataType oldDataType = dataType;
    dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShemaTablesPackage.DERIVED_COLUMN__DATA_TYPE, oldDataType, dataType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Constraint getConstraint()
  {
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstraint(Constraint newConstraint, NotificationChain msgs)
  {
    Constraint oldConstraint = constraint;
    constraint = newConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShemaTablesPackage.DERIVED_COLUMN__CONSTRAINT, oldConstraint, newConstraint);
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
  public void setConstraint(Constraint newConstraint)
  {
    if (newConstraint != constraint)
    {
      NotificationChain msgs = null;
      if (constraint != null)
        msgs = ((InternalEObject)constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShemaTablesPackage.DERIVED_COLUMN__CONSTRAINT, null, msgs);
      if (newConstraint != null)
        msgs = ((InternalEObject)newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShemaTablesPackage.DERIVED_COLUMN__CONSTRAINT, null, msgs);
      msgs = basicSetConstraint(newConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShemaTablesPackage.DERIVED_COLUMN__CONSTRAINT, newConstraint, newConstraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Algorithm getAlgorithm()
  {
    return algorithm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlgorithm(Algorithm newAlgorithm, NotificationChain msgs)
  {
    Algorithm oldAlgorithm = algorithm;
    algorithm = newAlgorithm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShemaTablesPackage.DERIVED_COLUMN__ALGORITHM, oldAlgorithm, newAlgorithm);
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
  public void setAlgorithm(Algorithm newAlgorithm)
  {
    if (newAlgorithm != algorithm)
    {
      NotificationChain msgs = null;
      if (algorithm != null)
        msgs = ((InternalEObject)algorithm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShemaTablesPackage.DERIVED_COLUMN__ALGORITHM, null, msgs);
      if (newAlgorithm != null)
        msgs = ((InternalEObject)newAlgorithm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShemaTablesPackage.DERIVED_COLUMN__ALGORITHM, null, msgs);
      msgs = basicSetAlgorithm(newAlgorithm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShemaTablesPackage.DERIVED_COLUMN__ALGORITHM, newAlgorithm, newAlgorithm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Output getOutputColumn()
  {
    return outputColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutputColumn(Output newOutputColumn, NotificationChain msgs)
  {
    Output oldOutputColumn = outputColumn;
    outputColumn = newOutputColumn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShemaTablesPackage.DERIVED_COLUMN__OUTPUT_COLUMN, oldOutputColumn, newOutputColumn);
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
  public void setOutputColumn(Output newOutputColumn)
  {
    if (newOutputColumn != outputColumn)
    {
      NotificationChain msgs = null;
      if (outputColumn != null)
        msgs = ((InternalEObject)outputColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShemaTablesPackage.DERIVED_COLUMN__OUTPUT_COLUMN, null, msgs);
      if (newOutputColumn != null)
        msgs = ((InternalEObject)newOutputColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShemaTablesPackage.DERIVED_COLUMN__OUTPUT_COLUMN, null, msgs);
      msgs = basicSetOutputColumn(newOutputColumn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShemaTablesPackage.DERIVED_COLUMN__OUTPUT_COLUMN, newOutputColumn, newOutputColumn));
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
      case ShemaTablesPackage.DERIVED_COLUMN__CONSTRAINT:
        return basicSetConstraint(null, msgs);
      case ShemaTablesPackage.DERIVED_COLUMN__ALGORITHM:
        return basicSetAlgorithm(null, msgs);
      case ShemaTablesPackage.DERIVED_COLUMN__OUTPUT_COLUMN:
        return basicSetOutputColumn(null, msgs);
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
      case ShemaTablesPackage.DERIVED_COLUMN__NAME:
        return getName();
      case ShemaTablesPackage.DERIVED_COLUMN__ID:
        return getId();
      case ShemaTablesPackage.DERIVED_COLUMN__DATA_TYPE:
        return getDataType();
      case ShemaTablesPackage.DERIVED_COLUMN__CONSTRAINT:
        return getConstraint();
      case ShemaTablesPackage.DERIVED_COLUMN__ALGORITHM:
        return getAlgorithm();
      case ShemaTablesPackage.DERIVED_COLUMN__OUTPUT_COLUMN:
        return getOutputColumn();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ShemaTablesPackage.DERIVED_COLUMN__NAME:
        setName((String)newValue);
        return;
      case ShemaTablesPackage.DERIVED_COLUMN__ID:
        setId((Integer)newValue);
        return;
      case ShemaTablesPackage.DERIVED_COLUMN__DATA_TYPE:
        setDataType((ColumnDataType)newValue);
        return;
      case ShemaTablesPackage.DERIVED_COLUMN__CONSTRAINT:
        setConstraint((Constraint)newValue);
        return;
      case ShemaTablesPackage.DERIVED_COLUMN__ALGORITHM:
        setAlgorithm((Algorithm)newValue);
        return;
      case ShemaTablesPackage.DERIVED_COLUMN__OUTPUT_COLUMN:
        setOutputColumn((Output)newValue);
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
      case ShemaTablesPackage.DERIVED_COLUMN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ShemaTablesPackage.DERIVED_COLUMN__ID:
        setId(ID_EDEFAULT);
        return;
      case ShemaTablesPackage.DERIVED_COLUMN__DATA_TYPE:
        setDataType(DATA_TYPE_EDEFAULT);
        return;
      case ShemaTablesPackage.DERIVED_COLUMN__CONSTRAINT:
        setConstraint((Constraint)null);
        return;
      case ShemaTablesPackage.DERIVED_COLUMN__ALGORITHM:
        setAlgorithm((Algorithm)null);
        return;
      case ShemaTablesPackage.DERIVED_COLUMN__OUTPUT_COLUMN:
        setOutputColumn((Output)null);
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
      case ShemaTablesPackage.DERIVED_COLUMN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ShemaTablesPackage.DERIVED_COLUMN__ID:
        return id != ID_EDEFAULT;
      case ShemaTablesPackage.DERIVED_COLUMN__DATA_TYPE:
        return dataType != DATA_TYPE_EDEFAULT;
      case ShemaTablesPackage.DERIVED_COLUMN__CONSTRAINT:
        return constraint != null;
      case ShemaTablesPackage.DERIVED_COLUMN__ALGORITHM:
        return algorithm != null;
      case ShemaTablesPackage.DERIVED_COLUMN__OUTPUT_COLUMN:
        return outputColumn != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

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

} //DerivedColumnImpl