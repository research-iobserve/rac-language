/**
 */
package org.iobserve.rac.constraint.constraintLang;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.iobserve.rac.constraint.constraintLang.ConstraintLangFactory
 * @model kind="package"
 * @generated
 */
public interface ConstraintLangPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "constraintLang";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.iobserve.org/rac/constraint/ConstraintLang";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "constraintLang";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ConstraintLangPackage eINSTANCE = org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl.init();

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.impl.ModelImpl
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__OPERATIONS = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.impl.ImportImpl
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.impl.OperationImpl
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Source Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__SOURCE_REFERENCE = 1;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.impl.SelectionImpl <em>Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.impl.SelectionImpl
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getSelection()
   * @generated
   */
  int SELECTION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__NAME = OPERATION__NAME;

  /**
   * The feature id for the '<em><b>Source Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__SOURCE_REFERENCE = OPERATION__SOURCE_REFERENCE;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__INPUTS = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Record Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__RECORD_TYPE = OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Paremter Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION__PAREMTER_EXPRESSIONS = OPERATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.impl.SelectInputImpl <em>Select Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.impl.SelectInputImpl
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getSelectInput()
   * @generated
   */
  int SELECT_INPUT = 4;

  /**
   * The feature id for the '<em><b>Record Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_INPUT__RECORD_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_INPUT__NAME = 1;

  /**
   * The feature id for the '<em><b>Select Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_INPUT__SELECT_CONSTRAINT = 2;

  /**
   * The number of structural features of the '<em>Select Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_INPUT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.impl.SelectConstaintExpressionImpl <em>Select Constaint Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.impl.SelectConstaintExpressionImpl
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getSelectConstaintExpression()
   * @generated
   */
  int SELECT_CONSTAINT_EXPRESSION = 5;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CONSTAINT_EXPRESSION__LEFT = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CONSTAINT_EXPRESSION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CONSTAINT_EXPRESSION__RIGHT = 2;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CONSTAINT_EXPRESSION__CONSTRAINT = 3;

  /**
   * The feature id for the '<em><b>Comperator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CONSTAINT_EXPRESSION__COMPERATOR = 4;

  /**
   * The number of structural features of the '<em>Select Constaint Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_CONSTAINT_EXPRESSION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.impl.CompareOperandImpl <em>Compare Operand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.impl.CompareOperandImpl
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getCompareOperand()
   * @generated
   */
  int COMPARE_OPERAND = 6;

  /**
   * The number of structural features of the '<em>Compare Operand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_OPERAND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.impl.ParameterExpressionImpl <em>Parameter Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.impl.ParameterExpressionImpl
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getParameterExpression()
   * @generated
   */
  int PARAMETER_EXPRESSION = 7;

  /**
   * The feature id for the '<em><b>Input</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_EXPRESSION__INPUT = COMPARE_OPERAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Property Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_EXPRESSION__PROPERTY_REFERENCE = COMPARE_OPERAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parameter Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_EXPRESSION_FEATURE_COUNT = COMPARE_OPERAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.impl.FilterImpl <em>Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.impl.FilterImpl
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getFilter()
   * @generated
   */
  int FILTER = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER__NAME = OPERATION__NAME;

  /**
   * The feature id for the '<em><b>Source Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER__SOURCE_REFERENCE = OPERATION__SOURCE_REFERENCE;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER__CONSTRAINT = OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.impl.ConstraintExpressionImpl <em>Constraint Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintExpressionImpl
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getConstraintExpression()
   * @generated
   */
  int CONSTRAINT_EXPRESSION = 9;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_EXPRESSION__LEFT = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_EXPRESSION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_EXPRESSION__RIGHT = 2;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_EXPRESSION__CONSTRAINT = 3;

  /**
   * The feature id for the '<em><b>Type Selection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_EXPRESSION__TYPE_SELECTION = 4;

  /**
   * The feature id for the '<em><b>Property Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_EXPRESSION__PROPERTY_CONSTRAINT = 5;

  /**
   * The number of structural features of the '<em>Constraint Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_EXPRESSION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.impl.PropertyConstraintImpl <em>Property Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.impl.PropertyConstraintImpl
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getPropertyConstraint()
   * @generated
   */
  int PROPERTY_CONSTRAINT = 10;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONSTRAINT__LEFT = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONSTRAINT__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONSTRAINT__RIGHT = 2;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONSTRAINT__CONSTRAINT = 3;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONSTRAINT__PROPERTY = 4;

  /**
   * The feature id for the '<em><b>Comparator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONSTRAINT__COMPARATOR = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONSTRAINT__VALUE = 6;

  /**
   * The number of structural features of the '<em>Property Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CONSTRAINT_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.impl.TypeSelectionImpl <em>Type Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.impl.TypeSelectionImpl
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getTypeSelection()
   * @generated
   */
  int TYPE_SELECTION = 11;

  /**
   * The number of structural features of the '<em>Type Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SELECTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.impl.ConcreteTypeImpl <em>Concrete Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConcreteTypeImpl
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getConcreteType()
   * @generated
   */
  int CONCRETE_TYPE = 12;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_TYPE__TYPE = TYPE_SELECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Concrete Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_TYPE_FEATURE_COUNT = TYPE_SELECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.impl.TemplateTypeSelectionImpl <em>Template Type Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.impl.TemplateTypeSelectionImpl
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getTemplateTypeSelection()
   * @generated
   */
  int TEMPLATE_TYPE_SELECTION = 13;

  /**
   * The feature id for the '<em><b>Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_TYPE_SELECTION__TYPES = TYPE_SELECTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Template Type Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_TYPE_SELECTION_FEATURE_COUNT = TYPE_SELECTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.impl.RecordTypeSelectionImpl <em>Record Type Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.impl.RecordTypeSelectionImpl
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getRecordTypeSelection()
   * @generated
   */
  int RECORD_TYPE_SELECTION = 14;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE_SELECTION__MODIFIER = TYPE_SELECTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE_SELECTION__TYPE = TYPE_SELECTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Record Type Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TYPE_SELECTION_FEATURE_COUNT = TYPE_SELECTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.impl.SourceReferenceImpl <em>Source Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.impl.SourceReferenceImpl
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getSourceReference()
   * @generated
   */
  int SOURCE_REFERENCE = 15;

  /**
   * The feature id for the '<em><b>Filter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_REFERENCE__FILTER = 0;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_REFERENCE__DEFAULT = 1;

  /**
   * The number of structural features of the '<em>Source Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_REFERENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.impl.LiteralImpl
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 16;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = COMPARE_OPERAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.impl.ArrayLiteralImpl <em>Array Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.impl.ArrayLiteralImpl
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getArrayLiteral()
   * @generated
   */
  int ARRAY_LITERAL = 17;

  /**
   * The feature id for the '<em><b>Literals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__LITERALS = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.impl.StringLiteralImpl
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 18;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.impl.IntLiteralImpl <em>Int Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.impl.IntLiteralImpl
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getIntLiteral()
   * @generated
   */
  int INT_LITERAL = 19;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.impl.FloatLiteralImpl
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getFloatLiteral()
   * @generated
   */
  int FLOAT_LITERAL = 20;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Float Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.impl.BooleanLiteralImpl
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 21;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.impl.BuiltInValueLiteralImpl <em>Built In Value Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.impl.BuiltInValueLiteralImpl
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getBuiltInValueLiteral()
   * @generated
   */
  int BUILT_IN_VALUE_LITERAL = 22;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_VALUE_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Built In Value Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_VALUE_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.RecordTypeModifier <em>Record Type Modifier</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.RecordTypeModifier
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getRecordTypeModifier()
   * @generated
   */
  int RECORD_TYPE_MODIFIER = 23;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.LogicOperator <em>Logic Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.LogicOperator
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getLogicOperator()
   * @generated
   */
  int LOGIC_OPERATOR = 24;

  /**
   * The meta object id for the '{@link org.iobserve.rac.constraint.constraintLang.Comparator <em>Comparator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.iobserve.rac.constraint.constraintLang.Comparator
   * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getComparator()
   * @generated
   */
  int COMPARATOR = 25;


  /**
   * Returns the meta object for class '{@link org.iobserve.rac.constraint.constraintLang.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link org.iobserve.rac.constraint.constraintLang.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.iobserve.rac.constraint.constraintLang.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.iobserve.rac.constraint.constraintLang.Model#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.Model#getOperations()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Operations();

  /**
   * Returns the meta object for class '{@link org.iobserve.rac.constraint.constraintLang.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.iobserve.rac.constraint.constraintLang.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.iobserve.rac.constraint.constraintLang.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the attribute '{@link org.iobserve.rac.constraint.constraintLang.Operation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.Operation#getName()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.iobserve.rac.constraint.constraintLang.Operation#getSourceReference <em>Source Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Reference</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.Operation#getSourceReference()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_SourceReference();

  /**
   * Returns the meta object for class '{@link org.iobserve.rac.constraint.constraintLang.Selection <em>Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selection</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.Selection
   * @generated
   */
  EClass getSelection();

  /**
   * Returns the meta object for the containment reference list '{@link org.iobserve.rac.constraint.constraintLang.Selection#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputs</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.Selection#getInputs()
   * @see #getSelection()
   * @generated
   */
  EReference getSelection_Inputs();

  /**
   * Returns the meta object for the reference '{@link org.iobserve.rac.constraint.constraintLang.Selection#getRecordType <em>Record Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Record Type</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.Selection#getRecordType()
   * @see #getSelection()
   * @generated
   */
  EReference getSelection_RecordType();

  /**
   * Returns the meta object for the containment reference list '{@link org.iobserve.rac.constraint.constraintLang.Selection#getParemterExpressions <em>Paremter Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Paremter Expressions</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.Selection#getParemterExpressions()
   * @see #getSelection()
   * @generated
   */
  EReference getSelection_ParemterExpressions();

  /**
   * Returns the meta object for class '{@link org.iobserve.rac.constraint.constraintLang.SelectInput <em>Select Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Input</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.SelectInput
   * @generated
   */
  EClass getSelectInput();

  /**
   * Returns the meta object for the reference '{@link org.iobserve.rac.constraint.constraintLang.SelectInput#getRecordType <em>Record Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Record Type</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.SelectInput#getRecordType()
   * @see #getSelectInput()
   * @generated
   */
  EReference getSelectInput_RecordType();

  /**
   * Returns the meta object for the attribute '{@link org.iobserve.rac.constraint.constraintLang.SelectInput#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.SelectInput#getName()
   * @see #getSelectInput()
   * @generated
   */
  EAttribute getSelectInput_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.iobserve.rac.constraint.constraintLang.SelectInput#getSelectConstraint <em>Select Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Select Constraint</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.SelectInput#getSelectConstraint()
   * @see #getSelectInput()
   * @generated
   */
  EReference getSelectInput_SelectConstraint();

  /**
   * Returns the meta object for class '{@link org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression <em>Select Constaint Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Constaint Expression</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression
   * @generated
   */
  EClass getSelectConstaintExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression#getLeft()
   * @see #getSelectConstaintExpression()
   * @generated
   */
  EReference getSelectConstaintExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression#getOperator()
   * @see #getSelectConstaintExpression()
   * @generated
   */
  EAttribute getSelectConstaintExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression#getRight()
   * @see #getSelectConstaintExpression()
   * @generated
   */
  EReference getSelectConstaintExpression_Right();

  /**
   * Returns the meta object for the containment reference '{@link org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression#getConstraint()
   * @see #getSelectConstaintExpression()
   * @generated
   */
  EReference getSelectConstaintExpression_Constraint();

  /**
   * Returns the meta object for the attribute '{@link org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression#getComperator <em>Comperator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comperator</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression#getComperator()
   * @see #getSelectConstaintExpression()
   * @generated
   */
  EAttribute getSelectConstaintExpression_Comperator();

  /**
   * Returns the meta object for class '{@link org.iobserve.rac.constraint.constraintLang.CompareOperand <em>Compare Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compare Operand</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.CompareOperand
   * @generated
   */
  EClass getCompareOperand();

  /**
   * Returns the meta object for class '{@link org.iobserve.rac.constraint.constraintLang.ParameterExpression <em>Parameter Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Expression</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.ParameterExpression
   * @generated
   */
  EClass getParameterExpression();

  /**
   * Returns the meta object for the reference '{@link org.iobserve.rac.constraint.constraintLang.ParameterExpression#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Input</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.ParameterExpression#getInput()
   * @see #getParameterExpression()
   * @generated
   */
  EReference getParameterExpression_Input();

  /**
   * Returns the meta object for the reference '{@link org.iobserve.rac.constraint.constraintLang.ParameterExpression#getPropertyReference <em>Property Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property Reference</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.ParameterExpression#getPropertyReference()
   * @see #getParameterExpression()
   * @generated
   */
  EReference getParameterExpression_PropertyReference();

  /**
   * Returns the meta object for class '{@link org.iobserve.rac.constraint.constraintLang.Filter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.Filter
   * @generated
   */
  EClass getFilter();

  /**
   * Returns the meta object for the containment reference '{@link org.iobserve.rac.constraint.constraintLang.Filter#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.Filter#getConstraint()
   * @see #getFilter()
   * @generated
   */
  EReference getFilter_Constraint();

  /**
   * Returns the meta object for class '{@link org.iobserve.rac.constraint.constraintLang.ConstraintExpression <em>Constraint Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint Expression</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintExpression
   * @generated
   */
  EClass getConstraintExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getLeft()
   * @see #getConstraintExpression()
   * @generated
   */
  EReference getConstraintExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getOperator()
   * @see #getConstraintExpression()
   * @generated
   */
  EAttribute getConstraintExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getRight()
   * @see #getConstraintExpression()
   * @generated
   */
  EReference getConstraintExpression_Right();

  /**
   * Returns the meta object for the containment reference '{@link org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getConstraint()
   * @see #getConstraintExpression()
   * @generated
   */
  EReference getConstraintExpression_Constraint();

  /**
   * Returns the meta object for the containment reference '{@link org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getTypeSelection <em>Type Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Selection</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getTypeSelection()
   * @see #getConstraintExpression()
   * @generated
   */
  EReference getConstraintExpression_TypeSelection();

  /**
   * Returns the meta object for the containment reference '{@link org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getPropertyConstraint <em>Property Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property Constraint</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.ConstraintExpression#getPropertyConstraint()
   * @see #getConstraintExpression()
   * @generated
   */
  EReference getConstraintExpression_PropertyConstraint();

  /**
   * Returns the meta object for class '{@link org.iobserve.rac.constraint.constraintLang.PropertyConstraint <em>Property Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Constraint</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.PropertyConstraint
   * @generated
   */
  EClass getPropertyConstraint();

  /**
   * Returns the meta object for the containment reference '{@link org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getLeft()
   * @see #getPropertyConstraint()
   * @generated
   */
  EReference getPropertyConstraint_Left();

  /**
   * Returns the meta object for the attribute '{@link org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getOperator()
   * @see #getPropertyConstraint()
   * @generated
   */
  EAttribute getPropertyConstraint_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getRight()
   * @see #getPropertyConstraint()
   * @generated
   */
  EReference getPropertyConstraint_Right();

  /**
   * Returns the meta object for the containment reference '{@link org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getConstraint()
   * @see #getPropertyConstraint()
   * @generated
   */
  EReference getPropertyConstraint_Constraint();

  /**
   * Returns the meta object for the reference '{@link org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getProperty()
   * @see #getPropertyConstraint()
   * @generated
   */
  EReference getPropertyConstraint_Property();

  /**
   * Returns the meta object for the attribute '{@link org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getComparator <em>Comparator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comparator</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getComparator()
   * @see #getPropertyConstraint()
   * @generated
   */
  EAttribute getPropertyConstraint_Comparator();

  /**
   * Returns the meta object for the containment reference '{@link org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.PropertyConstraint#getValue()
   * @see #getPropertyConstraint()
   * @generated
   */
  EReference getPropertyConstraint_Value();

  /**
   * Returns the meta object for class '{@link org.iobserve.rac.constraint.constraintLang.TypeSelection <em>Type Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Selection</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.TypeSelection
   * @generated
   */
  EClass getTypeSelection();

  /**
   * Returns the meta object for class '{@link org.iobserve.rac.constraint.constraintLang.ConcreteType <em>Concrete Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concrete Type</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.ConcreteType
   * @generated
   */
  EClass getConcreteType();

  /**
   * Returns the meta object for the reference '{@link org.iobserve.rac.constraint.constraintLang.ConcreteType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.ConcreteType#getType()
   * @see #getConcreteType()
   * @generated
   */
  EReference getConcreteType_Type();

  /**
   * Returns the meta object for class '{@link org.iobserve.rac.constraint.constraintLang.TemplateTypeSelection <em>Template Type Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Type Selection</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.TemplateTypeSelection
   * @generated
   */
  EClass getTemplateTypeSelection();

  /**
   * Returns the meta object for the reference list '{@link org.iobserve.rac.constraint.constraintLang.TemplateTypeSelection#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Types</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.TemplateTypeSelection#getTypes()
   * @see #getTemplateTypeSelection()
   * @generated
   */
  EReference getTemplateTypeSelection_Types();

  /**
   * Returns the meta object for class '{@link org.iobserve.rac.constraint.constraintLang.RecordTypeSelection <em>Record Type Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Type Selection</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.RecordTypeSelection
   * @generated
   */
  EClass getRecordTypeSelection();

  /**
   * Returns the meta object for the attribute '{@link org.iobserve.rac.constraint.constraintLang.RecordTypeSelection#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.RecordTypeSelection#getModifier()
   * @see #getRecordTypeSelection()
   * @generated
   */
  EAttribute getRecordTypeSelection_Modifier();

  /**
   * Returns the meta object for the reference '{@link org.iobserve.rac.constraint.constraintLang.RecordTypeSelection#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.RecordTypeSelection#getType()
   * @see #getRecordTypeSelection()
   * @generated
   */
  EReference getRecordTypeSelection_Type();

  /**
   * Returns the meta object for class '{@link org.iobserve.rac.constraint.constraintLang.SourceReference <em>Source Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Source Reference</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.SourceReference
   * @generated
   */
  EClass getSourceReference();

  /**
   * Returns the meta object for the reference '{@link org.iobserve.rac.constraint.constraintLang.SourceReference#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Filter</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.SourceReference#getFilter()
   * @see #getSourceReference()
   * @generated
   */
  EReference getSourceReference_Filter();

  /**
   * Returns the meta object for the attribute '{@link org.iobserve.rac.constraint.constraintLang.SourceReference#isDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.SourceReference#isDefault()
   * @see #getSourceReference()
   * @generated
   */
  EAttribute getSourceReference_Default();

  /**
   * Returns the meta object for class '{@link org.iobserve.rac.constraint.constraintLang.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link org.iobserve.rac.constraint.constraintLang.ArrayLiteral <em>Array Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Literal</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.ArrayLiteral
   * @generated
   */
  EClass getArrayLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link org.iobserve.rac.constraint.constraintLang.ArrayLiteral#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literals</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.ArrayLiteral#getLiterals()
   * @see #getArrayLiteral()
   * @generated
   */
  EReference getArrayLiteral_Literals();

  /**
   * Returns the meta object for class '{@link org.iobserve.rac.constraint.constraintLang.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.iobserve.rac.constraint.constraintLang.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.iobserve.rac.constraint.constraintLang.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Literal</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.IntLiteral
   * @generated
   */
  EClass getIntLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.iobserve.rac.constraint.constraintLang.IntLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.IntLiteral#getValue()
   * @see #getIntLiteral()
   * @generated
   */
  EAttribute getIntLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.iobserve.rac.constraint.constraintLang.FloatLiteral <em>Float Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Literal</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.FloatLiteral
   * @generated
   */
  EClass getFloatLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.iobserve.rac.constraint.constraintLang.FloatLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.FloatLiteral#getValue()
   * @see #getFloatLiteral()
   * @generated
   */
  EAttribute getFloatLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.iobserve.rac.constraint.constraintLang.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.iobserve.rac.constraint.constraintLang.BooleanLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.BooleanLiteral#getValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.iobserve.rac.constraint.constraintLang.BuiltInValueLiteral <em>Built In Value Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Built In Value Literal</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.BuiltInValueLiteral
   * @generated
   */
  EClass getBuiltInValueLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.iobserve.rac.constraint.constraintLang.BuiltInValueLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.BuiltInValueLiteral#getValue()
   * @see #getBuiltInValueLiteral()
   * @generated
   */
  EAttribute getBuiltInValueLiteral_Value();

  /**
   * Returns the meta object for enum '{@link org.iobserve.rac.constraint.constraintLang.RecordTypeModifier <em>Record Type Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Record Type Modifier</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.RecordTypeModifier
   * @generated
   */
  EEnum getRecordTypeModifier();

  /**
   * Returns the meta object for enum '{@link org.iobserve.rac.constraint.constraintLang.LogicOperator <em>Logic Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Logic Operator</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.LogicOperator
   * @generated
   */
  EEnum getLogicOperator();

  /**
   * Returns the meta object for enum '{@link org.iobserve.rac.constraint.constraintLang.Comparator <em>Comparator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Comparator</em>'.
   * @see org.iobserve.rac.constraint.constraintLang.Comparator
   * @generated
   */
  EEnum getComparator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ConstraintLangFactory getConstraintLangFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.impl.ModelImpl
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__OPERATIONS = eINSTANCE.getModel_Operations();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.impl.ImportImpl
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.impl.OperationImpl
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

    /**
     * The meta object literal for the '<em><b>Source Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__SOURCE_REFERENCE = eINSTANCE.getOperation_SourceReference();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.impl.SelectionImpl <em>Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.impl.SelectionImpl
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getSelection()
     * @generated
     */
    EClass SELECTION = eINSTANCE.getSelection();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION__INPUTS = eINSTANCE.getSelection_Inputs();

    /**
     * The meta object literal for the '<em><b>Record Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION__RECORD_TYPE = eINSTANCE.getSelection_RecordType();

    /**
     * The meta object literal for the '<em><b>Paremter Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTION__PAREMTER_EXPRESSIONS = eINSTANCE.getSelection_ParemterExpressions();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.impl.SelectInputImpl <em>Select Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.impl.SelectInputImpl
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getSelectInput()
     * @generated
     */
    EClass SELECT_INPUT = eINSTANCE.getSelectInput();

    /**
     * The meta object literal for the '<em><b>Record Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_INPUT__RECORD_TYPE = eINSTANCE.getSelectInput_RecordType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_INPUT__NAME = eINSTANCE.getSelectInput_Name();

    /**
     * The meta object literal for the '<em><b>Select Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_INPUT__SELECT_CONSTRAINT = eINSTANCE.getSelectInput_SelectConstraint();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.impl.SelectConstaintExpressionImpl <em>Select Constaint Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.impl.SelectConstaintExpressionImpl
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getSelectConstaintExpression()
     * @generated
     */
    EClass SELECT_CONSTAINT_EXPRESSION = eINSTANCE.getSelectConstaintExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_CONSTAINT_EXPRESSION__LEFT = eINSTANCE.getSelectConstaintExpression_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_CONSTAINT_EXPRESSION__OPERATOR = eINSTANCE.getSelectConstaintExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_CONSTAINT_EXPRESSION__RIGHT = eINSTANCE.getSelectConstaintExpression_Right();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_CONSTAINT_EXPRESSION__CONSTRAINT = eINSTANCE.getSelectConstaintExpression_Constraint();

    /**
     * The meta object literal for the '<em><b>Comperator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT_CONSTAINT_EXPRESSION__COMPERATOR = eINSTANCE.getSelectConstaintExpression_Comperator();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.impl.CompareOperandImpl <em>Compare Operand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.impl.CompareOperandImpl
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getCompareOperand()
     * @generated
     */
    EClass COMPARE_OPERAND = eINSTANCE.getCompareOperand();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.impl.ParameterExpressionImpl <em>Parameter Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.impl.ParameterExpressionImpl
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getParameterExpression()
     * @generated
     */
    EClass PARAMETER_EXPRESSION = eINSTANCE.getParameterExpression();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_EXPRESSION__INPUT = eINSTANCE.getParameterExpression_Input();

    /**
     * The meta object literal for the '<em><b>Property Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_EXPRESSION__PROPERTY_REFERENCE = eINSTANCE.getParameterExpression_PropertyReference();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.impl.FilterImpl <em>Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.impl.FilterImpl
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getFilter()
     * @generated
     */
    EClass FILTER = eINSTANCE.getFilter();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER__CONSTRAINT = eINSTANCE.getFilter_Constraint();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.impl.ConstraintExpressionImpl <em>Constraint Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintExpressionImpl
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getConstraintExpression()
     * @generated
     */
    EClass CONSTRAINT_EXPRESSION = eINSTANCE.getConstraintExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT_EXPRESSION__LEFT = eINSTANCE.getConstraintExpression_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT_EXPRESSION__OPERATOR = eINSTANCE.getConstraintExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT_EXPRESSION__RIGHT = eINSTANCE.getConstraintExpression_Right();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT_EXPRESSION__CONSTRAINT = eINSTANCE.getConstraintExpression_Constraint();

    /**
     * The meta object literal for the '<em><b>Type Selection</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT_EXPRESSION__TYPE_SELECTION = eINSTANCE.getConstraintExpression_TypeSelection();

    /**
     * The meta object literal for the '<em><b>Property Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT_EXPRESSION__PROPERTY_CONSTRAINT = eINSTANCE.getConstraintExpression_PropertyConstraint();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.impl.PropertyConstraintImpl <em>Property Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.impl.PropertyConstraintImpl
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getPropertyConstraint()
     * @generated
     */
    EClass PROPERTY_CONSTRAINT = eINSTANCE.getPropertyConstraint();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_CONSTRAINT__LEFT = eINSTANCE.getPropertyConstraint_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_CONSTRAINT__OPERATOR = eINSTANCE.getPropertyConstraint_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_CONSTRAINT__RIGHT = eINSTANCE.getPropertyConstraint_Right();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_CONSTRAINT__CONSTRAINT = eINSTANCE.getPropertyConstraint_Constraint();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_CONSTRAINT__PROPERTY = eINSTANCE.getPropertyConstraint_Property();

    /**
     * The meta object literal for the '<em><b>Comparator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_CONSTRAINT__COMPARATOR = eINSTANCE.getPropertyConstraint_Comparator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_CONSTRAINT__VALUE = eINSTANCE.getPropertyConstraint_Value();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.impl.TypeSelectionImpl <em>Type Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.impl.TypeSelectionImpl
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getTypeSelection()
     * @generated
     */
    EClass TYPE_SELECTION = eINSTANCE.getTypeSelection();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.impl.ConcreteTypeImpl <em>Concrete Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConcreteTypeImpl
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getConcreteType()
     * @generated
     */
    EClass CONCRETE_TYPE = eINSTANCE.getConcreteType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCRETE_TYPE__TYPE = eINSTANCE.getConcreteType_Type();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.impl.TemplateTypeSelectionImpl <em>Template Type Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.impl.TemplateTypeSelectionImpl
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getTemplateTypeSelection()
     * @generated
     */
    EClass TEMPLATE_TYPE_SELECTION = eINSTANCE.getTemplateTypeSelection();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_TYPE_SELECTION__TYPES = eINSTANCE.getTemplateTypeSelection_Types();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.impl.RecordTypeSelectionImpl <em>Record Type Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.impl.RecordTypeSelectionImpl
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getRecordTypeSelection()
     * @generated
     */
    EClass RECORD_TYPE_SELECTION = eINSTANCE.getRecordTypeSelection();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD_TYPE_SELECTION__MODIFIER = eINSTANCE.getRecordTypeSelection_Modifier();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_TYPE_SELECTION__TYPE = eINSTANCE.getRecordTypeSelection_Type();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.impl.SourceReferenceImpl <em>Source Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.impl.SourceReferenceImpl
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getSourceReference()
     * @generated
     */
    EClass SOURCE_REFERENCE = eINSTANCE.getSourceReference();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCE_REFERENCE__FILTER = eINSTANCE.getSourceReference_Filter();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SOURCE_REFERENCE__DEFAULT = eINSTANCE.getSourceReference_Default();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.impl.LiteralImpl
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.impl.ArrayLiteralImpl <em>Array Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.impl.ArrayLiteralImpl
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getArrayLiteral()
     * @generated
     */
    EClass ARRAY_LITERAL = eINSTANCE.getArrayLiteral();

    /**
     * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_LITERAL__LITERALS = eINSTANCE.getArrayLiteral_Literals();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.impl.StringLiteralImpl
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.impl.IntLiteralImpl <em>Int Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.impl.IntLiteralImpl
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getIntLiteral()
     * @generated
     */
    EClass INT_LITERAL = eINSTANCE.getIntLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_LITERAL__VALUE = eINSTANCE.getIntLiteral_Value();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.impl.FloatLiteralImpl
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getFloatLiteral()
     * @generated
     */
    EClass FLOAT_LITERAL = eINSTANCE.getFloatLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT_LITERAL__VALUE = eINSTANCE.getFloatLiteral_Value();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.impl.BooleanLiteralImpl
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.impl.BuiltInValueLiteralImpl <em>Built In Value Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.impl.BuiltInValueLiteralImpl
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getBuiltInValueLiteral()
     * @generated
     */
    EClass BUILT_IN_VALUE_LITERAL = eINSTANCE.getBuiltInValueLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILT_IN_VALUE_LITERAL__VALUE = eINSTANCE.getBuiltInValueLiteral_Value();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.RecordTypeModifier <em>Record Type Modifier</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.RecordTypeModifier
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getRecordTypeModifier()
     * @generated
     */
    EEnum RECORD_TYPE_MODIFIER = eINSTANCE.getRecordTypeModifier();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.LogicOperator <em>Logic Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.LogicOperator
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getLogicOperator()
     * @generated
     */
    EEnum LOGIC_OPERATOR = eINSTANCE.getLogicOperator();

    /**
     * The meta object literal for the '{@link org.iobserve.rac.constraint.constraintLang.Comparator <em>Comparator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.iobserve.rac.constraint.constraintLang.Comparator
     * @see org.iobserve.rac.constraint.constraintLang.impl.ConstraintLangPackageImpl#getComparator()
     * @generated
     */
    EEnum COMPARATOR = eINSTANCE.getComparator();

  }

} //ConstraintLangPackage
