/**
 * generated by Xtext 2.32.0
 */
package fr.n7.idm.project.xtext.shemaTables.impl;

import fr.n7.idm.project.xtext.shemaTables.Column;
import fr.n7.idm.project.xtext.shemaTables.ColumnDataType;
import fr.n7.idm.project.xtext.shemaTables.Constraint;
import fr.n7.idm.project.xtext.shemaTables.ReferencedColumn;
import fr.n7.idm.project.xtext.shemaTables.ShemaTable;
import fr.n7.idm.project.xtext.shemaTables.ShemaTablesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referenced Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.idm.project.xtext.shemaTables.impl.ReferencedColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.idm.project.xtext.shemaTables.impl.ReferencedColumnImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.n7.idm.project.xtext.shemaTables.impl.ReferencedColumnImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link fr.n7.idm.project.xtext.shemaTables.impl.ReferencedColumnImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link fr.n7.idm.project.xtext.shemaTables.impl.ReferencedColumnImpl#getForeignTable <em>Foreign Table</em>}</li>
 *   <li>{@link fr.n7.idm.project.xtext.shemaTables.impl.ReferencedColumnImpl#getForeignColumn <em>Foreign Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferencedColumnImpl extends MinimalEObjectImpl.Container implements ReferencedColumn
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
   * The cached value of the '{@link #getForeignTable() <em>Foreign Table</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForeignTable()
   * @generated
   * @ordered
   */
  protected ShemaTable foreignTable;

  /**
   * The cached value of the '{@link #getForeignColumn() <em>Foreign Column</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForeignColumn()
   * @generated
   * @ordered
   */
  protected Column foreignColumn;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferencedColumnImpl()
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
    return ShemaTablesPackage.Literals.REFERENCED_COLUMN;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ShemaTablesPackage.REFERENCED_COLUMN__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ShemaTablesPackage.REFERENCED_COLUMN__ID, oldId, id));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ShemaTablesPackage.REFERENCED_COLUMN__DATA_TYPE, oldDataType, dataType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShemaTablesPackage.REFERENCED_COLUMN__CONSTRAINT, oldConstraint, newConstraint);
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
        msgs = ((InternalEObject)constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShemaTablesPackage.REFERENCED_COLUMN__CONSTRAINT, null, msgs);
      if (newConstraint != null)
        msgs = ((InternalEObject)newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShemaTablesPackage.REFERENCED_COLUMN__CONSTRAINT, null, msgs);
      msgs = basicSetConstraint(newConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShemaTablesPackage.REFERENCED_COLUMN__CONSTRAINT, newConstraint, newConstraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ShemaTable getForeignTable()
  {
    if (foreignTable != null && foreignTable.eIsProxy())
    {
      InternalEObject oldForeignTable = (InternalEObject)foreignTable;
      foreignTable = (ShemaTable)eResolveProxy(oldForeignTable);
      if (foreignTable != oldForeignTable)
      {
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
  public ShemaTable basicGetForeignTable()
  {
    return foreignTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setForeignTable(ShemaTable newForeignTable)
  {
    ShemaTable oldForeignTable = foreignTable;
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
  public Column getForeignColumn()
  {
    if (foreignColumn != null && foreignColumn.eIsProxy())
    {
      InternalEObject oldForeignColumn = (InternalEObject)foreignColumn;
      foreignColumn = (Column)eResolveProxy(oldForeignColumn);
      if (foreignColumn != oldForeignColumn)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShemaTablesPackage.REFERENCED_COLUMN__FOREIGN_COLUMN, oldForeignColumn, foreignColumn));
      }
    }
    return foreignColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Column basicGetForeignColumn()
  {
    return foreignColumn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setForeignColumn(Column newForeignColumn)
  {
    Column oldForeignColumn = foreignColumn;
    foreignColumn = newForeignColumn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ShemaTablesPackage.REFERENCED_COLUMN__FOREIGN_COLUMN, oldForeignColumn, foreignColumn));
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
      case ShemaTablesPackage.REFERENCED_COLUMN__CONSTRAINT:
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
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ShemaTablesPackage.REFERENCED_COLUMN__NAME:
        return getName();
      case ShemaTablesPackage.REFERENCED_COLUMN__ID:
        return getId();
      case ShemaTablesPackage.REFERENCED_COLUMN__DATA_TYPE:
        return getDataType();
      case ShemaTablesPackage.REFERENCED_COLUMN__CONSTRAINT:
        return getConstraint();
      case ShemaTablesPackage.REFERENCED_COLUMN__FOREIGN_TABLE:
        if (resolve) return getForeignTable();
        return basicGetForeignTable();
      case ShemaTablesPackage.REFERENCED_COLUMN__FOREIGN_COLUMN:
        if (resolve) return getForeignColumn();
        return basicGetForeignColumn();
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
      case ShemaTablesPackage.REFERENCED_COLUMN__NAME:
        setName((String)newValue);
        return;
      case ShemaTablesPackage.REFERENCED_COLUMN__ID:
        setId((Integer)newValue);
        return;
      case ShemaTablesPackage.REFERENCED_COLUMN__DATA_TYPE:
        setDataType((ColumnDataType)newValue);
        return;
      case ShemaTablesPackage.REFERENCED_COLUMN__CONSTRAINT:
        setConstraint((Constraint)newValue);
        return;
      case ShemaTablesPackage.REFERENCED_COLUMN__FOREIGN_TABLE:
        setForeignTable((ShemaTable)newValue);
        return;
      case ShemaTablesPackage.REFERENCED_COLUMN__FOREIGN_COLUMN:
        setForeignColumn((Column)newValue);
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
      case ShemaTablesPackage.REFERENCED_COLUMN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ShemaTablesPackage.REFERENCED_COLUMN__ID:
        setId(ID_EDEFAULT);
        return;
      case ShemaTablesPackage.REFERENCED_COLUMN__DATA_TYPE:
        setDataType(DATA_TYPE_EDEFAULT);
        return;
      case ShemaTablesPackage.REFERENCED_COLUMN__CONSTRAINT:
        setConstraint((Constraint)null);
        return;
      case ShemaTablesPackage.REFERENCED_COLUMN__FOREIGN_TABLE:
        setForeignTable((ShemaTable)null);
        return;
      case ShemaTablesPackage.REFERENCED_COLUMN__FOREIGN_COLUMN:
        setForeignColumn((Column)null);
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
      case ShemaTablesPackage.REFERENCED_COLUMN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ShemaTablesPackage.REFERENCED_COLUMN__ID:
        return id != ID_EDEFAULT;
      case ShemaTablesPackage.REFERENCED_COLUMN__DATA_TYPE:
        return dataType != DATA_TYPE_EDEFAULT;
      case ShemaTablesPackage.REFERENCED_COLUMN__CONSTRAINT:
        return constraint != null;
      case ShemaTablesPackage.REFERENCED_COLUMN__FOREIGN_TABLE:
        return foreignTable != null;
      case ShemaTablesPackage.REFERENCED_COLUMN__FOREIGN_COLUMN:
        return foreignColumn != null;
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

} //ReferencedColumnImpl