/**
 */
package fr.n7.idm.project.shemaTableWithAlgorithme.impl;

import fr.n7.idm.project.shemaTableWithAlgorithme.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShemaTableWithAlgorithmeFactoryImpl extends EFactoryImpl implements ShemaTableWithAlgorithmeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShemaTableWithAlgorithmeFactory init() {
		try {
			ShemaTableWithAlgorithmeFactory theShemaTableWithAlgorithmeFactory = (ShemaTableWithAlgorithmeFactory) EPackage.Registry.INSTANCE
					.getEFactory(ShemaTableWithAlgorithmePackage.eNS_URI);
			if (theShemaTableWithAlgorithmeFactory != null) {
				return theShemaTableWithAlgorithmeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ShemaTableWithAlgorithmeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShemaTableWithAlgorithmeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ShemaTableWithAlgorithmePackage.SHEMA_TABLE:
			return createShemaTable();
		case ShemaTableWithAlgorithmePackage.CONSTRAINT:
			return createConstraint();
		case ShemaTableWithAlgorithmePackage.COLUMN:
			return createColumn();
		case ShemaTableWithAlgorithmePackage.REFERENCED_COLUMN:
			return createReferencedColumn();
		case ShemaTableWithAlgorithmePackage.DERIVED_COLUMN:
			return createDerivedColumn();
		case ShemaTableWithAlgorithmePackage.ALGORITHM:
			return createAlgorithm();
		case ShemaTableWithAlgorithmePackage.INPUT:
			return createInput();
		case ShemaTableWithAlgorithmePackage.OUTPUT:
			return createOutput();
		case ShemaTableWithAlgorithmePackage.CONSTANT:
			return createConstant();
		case ShemaTableWithAlgorithmePackage.CATALOGUE:
			return createCatalogue();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ShemaTableWithAlgorithmePackage.COLUMN_DATA_TYPE:
			return createColumnDataTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ShemaTableWithAlgorithmePackage.COLUMN_DATA_TYPE:
			return convertColumnDataTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShemaTable createShemaTable() {
		ShemaTableImpl shemaTable = new ShemaTableImpl();
		return shemaTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferencedColumn createReferencedColumn() {
		ReferencedColumnImpl referencedColumn = new ReferencedColumnImpl();
		return referencedColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivedColumn createDerivedColumn() {
		DerivedColumnImpl derivedColumn = new DerivedColumnImpl();
		return derivedColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Algorithm createAlgorithm() {
		AlgorithmImpl algorithm = new AlgorithmImpl();
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Catalogue createCatalogue() {
		CatalogueImpl catalogue = new CatalogueImpl();
		return catalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnDataType createColumnDataTypeFromString(EDataType eDataType, String initialValue) {
		ColumnDataType result = ColumnDataType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColumnDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShemaTableWithAlgorithmePackage getShemaTableWithAlgorithmePackage() {
		return (ShemaTableWithAlgorithmePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ShemaTableWithAlgorithmePackage getPackage() {
		return ShemaTableWithAlgorithmePackage.eINSTANCE;
	}

} //ShemaTableWithAlgorithmeFactoryImpl
