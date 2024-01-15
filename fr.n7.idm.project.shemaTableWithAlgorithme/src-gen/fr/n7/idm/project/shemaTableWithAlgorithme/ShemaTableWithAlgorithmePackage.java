/**
 */
package fr.n7.idm.project.shemaTableWithAlgorithme;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTableWithAlgorithmeFactory
 * @model kind="package"
 * @generated
 */
public interface ShemaTableWithAlgorithmePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "shemaTableWithAlgorithme";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/shemaTableWithAlgorithme";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "shemaTableWithAlgorithme";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShemaTableWithAlgorithmePackage eINSTANCE = fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableWithAlgorithmePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableImpl <em>Shema Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableImpl
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableWithAlgorithmePackageImpl#getShemaTable()
	 * @generated
	 */
	int SHEMA_TABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEMA_TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEMA_TABLE__ID = 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEMA_TABLE__COLUMNS = 2;

	/**
	 * The feature id for the '<em><b>Catalogue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEMA_TABLE__CATALOGUE = 3;

	/**
	 * The number of structural features of the '<em>Shema Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEMA_TABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Shema Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEMA_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ConstraintImpl
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableWithAlgorithmePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__FILE_PATH = 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ColumnImpl
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableWithAlgorithmePackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ID = 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CONSTRAINT = 3;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.ReferencedColumnImpl <em>Referenced Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ReferencedColumnImpl
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableWithAlgorithmePackageImpl#getReferencedColumn()
	 * @generated
	 */
	int REFERENCED_COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_COLUMN__NAME = COLUMN__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_COLUMN__ID = COLUMN__ID;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_COLUMN__DATA_TYPE = COLUMN__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_COLUMN__CONSTRAINT = COLUMN__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Foreign Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_COLUMN__FOREIGN_COLUMN = COLUMN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Foreign Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_COLUMN__FOREIGN_TABLE = COLUMN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Referenced Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_COLUMN_FEATURE_COUNT = COLUMN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Referenced Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_COLUMN_OPERATION_COUNT = COLUMN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.DerivedColumnImpl <em>Derived Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.DerivedColumnImpl
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableWithAlgorithmePackageImpl#getDerivedColumn()
	 * @generated
	 */
	int DERIVED_COLUMN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_COLUMN__NAME = COLUMN__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_COLUMN__ID = COLUMN__ID;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_COLUMN__DATA_TYPE = COLUMN__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_COLUMN__CONSTRAINT = COLUMN__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Output Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_COLUMN__OUTPUT_COLUMN = COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_COLUMN_FEATURE_COUNT = COLUMN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Derived Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_COLUMN_OPERATION_COUNT = COLUMN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.AlgorithmImpl <em>Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.AlgorithmImpl
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableWithAlgorithmePackageImpl#getAlgorithm()
	 * @generated
	 */
	int ALGORITHM = 5;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__NAME = 2;

	/**
	 * The number of structural features of the '<em>Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.InputImpl
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableWithAlgorithmePackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 6;

	/**
	 * The feature id for the '<em><b>Input Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INPUT_COLUMNS = 0;

	/**
	 * The feature id for the '<em><b>Constante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__CONSTANTE = 1;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.OutputImpl
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableWithAlgorithmePackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = COLUMN__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ID = COLUMN__ID;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__DATA_TYPE = COLUMN__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__CONSTRAINT = COLUMN__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Algo Of Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ALGO_OF_OUTPUT = COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = COLUMN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = COLUMN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ConstantImpl
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableWithAlgorithmePackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.CatalogueImpl <em>Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.CatalogueImpl
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableWithAlgorithmePackageImpl#getCatalogue()
	 * @generated
	 */
	int CATALOGUE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Algorithms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__ALGORITHMS = 1;

	/**
	 * The number of structural features of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.ColumnDataType <em>Column Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.ColumnDataType
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableWithAlgorithmePackageImpl#getColumnDataType()
	 * @generated
	 */
	int COLUMN_DATA_TYPE = 10;

	/**
	 * Returns the meta object for class '{@link fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTable <em>Shema Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shema Table</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTable
	 * @generated
	 */
	EClass getShemaTable();

	/**
	 * Returns the meta object for the attribute '{@link fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTable#getName()
	 * @see #getShemaTable()
	 * @generated
	 */
	EAttribute getShemaTable_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTable#getId()
	 * @see #getShemaTable()
	 * @generated
	 */
	EAttribute getShemaTable_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTable#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTable#getColumns()
	 * @see #getShemaTable()
	 * @generated
	 */
	EReference getShemaTable_Columns();

	/**
	 * Returns the meta object for the reference '{@link fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTable#getCatalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Catalogue</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.ShemaTable#getCatalogue()
	 * @see #getShemaTable()
	 * @generated
	 */
	EReference getShemaTable_Catalogue();

	/**
	 * Returns the meta object for class '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Constraint#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.Constraint#getFilePath()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_FilePath();

	/**
	 * Returns the meta object for class '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.Column#getName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Column#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.Column#getId()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Column#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.Column#getDataType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_DataType();

	/**
	 * Returns the meta object for the containment reference '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Column#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.Column#getConstraint()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Constraint();

	/**
	 * Returns the meta object for class '{@link fr.n7.idm.project.shemaTableWithAlgorithme.ReferencedColumn <em>Referenced Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referenced Column</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.ReferencedColumn
	 * @generated
	 */
	EClass getReferencedColumn();

	/**
	 * Returns the meta object for the reference '{@link fr.n7.idm.project.shemaTableWithAlgorithme.ReferencedColumn#getForeignColumn <em>Foreign Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Foreign Column</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.ReferencedColumn#getForeignColumn()
	 * @see #getReferencedColumn()
	 * @generated
	 */
	EReference getReferencedColumn_ForeignColumn();

	/**
	 * Returns the meta object for the reference '{@link fr.n7.idm.project.shemaTableWithAlgorithme.ReferencedColumn#getForeignTable <em>Foreign Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Foreign Table</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.ReferencedColumn#getForeignTable()
	 * @see #getReferencedColumn()
	 * @generated
	 */
	EReference getReferencedColumn_ForeignTable();

	/**
	 * Returns the meta object for class '{@link fr.n7.idm.project.shemaTableWithAlgorithme.DerivedColumn <em>Derived Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Column</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.DerivedColumn
	 * @generated
	 */
	EClass getDerivedColumn();

	/**
	 * Returns the meta object for the reference '{@link fr.n7.idm.project.shemaTableWithAlgorithme.DerivedColumn#getOutputColumn <em>Output Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Column</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.DerivedColumn#getOutputColumn()
	 * @see #getDerivedColumn()
	 * @generated
	 */
	EReference getDerivedColumn_OutputColumn();

	/**
	 * Returns the meta object for class '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Algorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithm</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.Algorithm
	 * @generated
	 */
	EClass getAlgorithm();

	/**
	 * Returns the meta object for the containment reference '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Algorithm#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.Algorithm#getInput()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EReference getAlgorithm_Input();

	/**
	 * Returns the meta object for the containment reference '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Algorithm#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.Algorithm#getOutput()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EReference getAlgorithm_Output();

	/**
	 * Returns the meta object for the attribute '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Algorithm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.Algorithm#getName()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EAttribute getAlgorithm_Name();

	/**
	 * Returns the meta object for class '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Input#getInputColumns <em>Input Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Columns</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.Input#getInputColumns()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_InputColumns();

	/**
	 * Returns the meta object for the containment reference '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Input#getConstante <em>Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constante</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.Input#getConstante()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Constante();

	/**
	 * Returns the meta object for class '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the reference '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Output#getAlgoOfOutput <em>Algo Of Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Algo Of Output</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.Output#getAlgoOfOutput()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_AlgoOfOutput();

	/**
	 * Returns the meta object for class '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the attribute '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Constant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.Constant#getValue()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Value();

	/**
	 * Returns the meta object for class '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Catalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalogue</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.Catalogue
	 * @generated
	 */
	EClass getCatalogue();

	/**
	 * Returns the meta object for the attribute '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Catalogue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.Catalogue#getName()
	 * @see #getCatalogue()
	 * @generated
	 */
	EAttribute getCatalogue_Name();

	/**
	 * Returns the meta object for the reference list '{@link fr.n7.idm.project.shemaTableWithAlgorithme.Catalogue#getAlgorithms <em>Algorithms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Algorithms</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.Catalogue#getAlgorithms()
	 * @see #getCatalogue()
	 * @generated
	 */
	EReference getCatalogue_Algorithms();

	/**
	 * Returns the meta object for enum '{@link fr.n7.idm.project.shemaTableWithAlgorithme.ColumnDataType <em>Column Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Column Data Type</em>'.
	 * @see fr.n7.idm.project.shemaTableWithAlgorithme.ColumnDataType
	 * @generated
	 */
	EEnum getColumnDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ShemaTableWithAlgorithmeFactory getShemaTableWithAlgorithmeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableImpl <em>Shema Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableImpl
		 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableWithAlgorithmePackageImpl#getShemaTable()
		 * @generated
		 */
		EClass SHEMA_TABLE = eINSTANCE.getShemaTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEMA_TABLE__NAME = eINSTANCE.getShemaTable_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEMA_TABLE__ID = eINSTANCE.getShemaTable_Id();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHEMA_TABLE__COLUMNS = eINSTANCE.getShemaTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Catalogue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHEMA_TABLE__CATALOGUE = eINSTANCE.getShemaTable_Catalogue();

		/**
		 * The meta object literal for the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ConstraintImpl
		 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableWithAlgorithmePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__FILE_PATH = eINSTANCE.getConstraint_FilePath();

		/**
		 * The meta object literal for the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ColumnImpl
		 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableWithAlgorithmePackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__ID = eINSTANCE.getColumn_Id();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__DATA_TYPE = eINSTANCE.getColumn_DataType();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__CONSTRAINT = eINSTANCE.getColumn_Constraint();

		/**
		 * The meta object literal for the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.ReferencedColumnImpl <em>Referenced Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ReferencedColumnImpl
		 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableWithAlgorithmePackageImpl#getReferencedColumn()
		 * @generated
		 */
		EClass REFERENCED_COLUMN = eINSTANCE.getReferencedColumn();

		/**
		 * The meta object literal for the '<em><b>Foreign Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCED_COLUMN__FOREIGN_COLUMN = eINSTANCE.getReferencedColumn_ForeignColumn();

		/**
		 * The meta object literal for the '<em><b>Foreign Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCED_COLUMN__FOREIGN_TABLE = eINSTANCE.getReferencedColumn_ForeignTable();

		/**
		 * The meta object literal for the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.DerivedColumnImpl <em>Derived Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.DerivedColumnImpl
		 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableWithAlgorithmePackageImpl#getDerivedColumn()
		 * @generated
		 */
		EClass DERIVED_COLUMN = eINSTANCE.getDerivedColumn();

		/**
		 * The meta object literal for the '<em><b>Output Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_COLUMN__OUTPUT_COLUMN = eINSTANCE.getDerivedColumn_OutputColumn();

		/**
		 * The meta object literal for the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.AlgorithmImpl <em>Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.AlgorithmImpl
		 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableWithAlgorithmePackageImpl#getAlgorithm()
		 * @generated
		 */
		EClass ALGORITHM = eINSTANCE.getAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM__INPUT = eINSTANCE.getAlgorithm_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM__OUTPUT = eINSTANCE.getAlgorithm_Output();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHM__NAME = eINSTANCE.getAlgorithm_Name();

		/**
		 * The meta object literal for the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.InputImpl
		 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableWithAlgorithmePackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Input Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__INPUT_COLUMNS = eINSTANCE.getInput_InputColumns();

		/**
		 * The meta object literal for the '<em><b>Constante</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__CONSTANTE = eINSTANCE.getInput_Constante();

		/**
		 * The meta object literal for the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.OutputImpl
		 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableWithAlgorithmePackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Algo Of Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__ALGO_OF_OUTPUT = eINSTANCE.getOutput_AlgoOfOutput();

		/**
		 * The meta object literal for the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ConstantImpl
		 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableWithAlgorithmePackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

		/**
		 * The meta object literal for the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.impl.CatalogueImpl <em>Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.CatalogueImpl
		 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableWithAlgorithmePackageImpl#getCatalogue()
		 * @generated
		 */
		EClass CATALOGUE = eINSTANCE.getCatalogue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOGUE__NAME = eINSTANCE.getCatalogue_Name();

		/**
		 * The meta object literal for the '<em><b>Algorithms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGUE__ALGORITHMS = eINSTANCE.getCatalogue_Algorithms();

		/**
		 * The meta object literal for the '{@link fr.n7.idm.project.shemaTableWithAlgorithme.ColumnDataType <em>Column Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.n7.idm.project.shemaTableWithAlgorithme.ColumnDataType
		 * @see fr.n7.idm.project.shemaTableWithAlgorithme.impl.ShemaTableWithAlgorithmePackageImpl#getColumnDataType()
		 * @generated
		 */
		EEnum COLUMN_DATA_TYPE = eINSTANCE.getColumnDataType();

	}

} //ShemaTableWithAlgorithmePackage
