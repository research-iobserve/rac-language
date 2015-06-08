/**
 */
package org.iobserve.rac.constraint.constraintLang.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.iobserve.rac.constraint.constraintLang.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintLangFactoryImpl extends EFactoryImpl implements ConstraintLangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConstraintLangFactory init()
  {
    try
    {
      ConstraintLangFactory theConstraintLangFactory = (ConstraintLangFactory)EPackage.Registry.INSTANCE.getEFactory(ConstraintLangPackage.eNS_URI);
      if (theConstraintLangFactory != null)
      {
        return theConstraintLangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ConstraintLangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintLangFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ConstraintLangPackage.MODEL: return createModel();
      case ConstraintLangPackage.IMPORT: return createImport();
      case ConstraintLangPackage.OPERATION: return createOperation();
      case ConstraintLangPackage.SELECTION: return createSelection();
      case ConstraintLangPackage.SELECT_INPUT: return createSelectInput();
      case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION: return createSelectConstaintExpression();
      case ConstraintLangPackage.COMPARE_OPERAND: return createCompareOperand();
      case ConstraintLangPackage.PARAMETER_EXPRESSION: return createParameterExpression();
      case ConstraintLangPackage.FILTER: return createFilter();
      case ConstraintLangPackage.CONSTRAINT_EXPRESSION: return createConstraintExpression();
      case ConstraintLangPackage.PROPERTY_CONSTRAINT: return createPropertyConstraint();
      case ConstraintLangPackage.TYPE_SELECTION: return createTypeSelection();
      case ConstraintLangPackage.CONCRETE_TYPE: return createConcreteType();
      case ConstraintLangPackage.TEMPLATE_TYPE_SELECTION: return createTemplateTypeSelection();
      case ConstraintLangPackage.RECORD_TYPE_SELECTION: return createRecordTypeSelection();
      case ConstraintLangPackage.LITERAL: return createLiteral();
      case ConstraintLangPackage.ARRAY_LITERAL: return createArrayLiteral();
      case ConstraintLangPackage.STRING_LITERAL: return createStringLiteral();
      case ConstraintLangPackage.INT_LITERAL: return createIntLiteral();
      case ConstraintLangPackage.FLOAT_LITERAL: return createFloatLiteral();
      case ConstraintLangPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case ConstraintLangPackage.BUILT_IN_VALUE_LITERAL: return createBuiltInValueLiteral();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ConstraintLangPackage.RECORD_TYPE_MODIFIER:
        return createRecordTypeModifierFromString(eDataType, initialValue);
      case ConstraintLangPackage.LOGIC_OPERATOR:
        return createLogicOperatorFromString(eDataType, initialValue);
      case ConstraintLangPackage.COMPARATOR:
        return createComparatorFromString(eDataType, initialValue);
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
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ConstraintLangPackage.RECORD_TYPE_MODIFIER:
        return convertRecordTypeModifierToString(eDataType, instanceValue);
      case ConstraintLangPackage.LOGIC_OPERATOR:
        return convertLogicOperatorToString(eDataType, instanceValue);
      case ConstraintLangPackage.COMPARATOR:
        return convertComparatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Selection createSelection()
  {
    SelectionImpl selection = new SelectionImpl();
    return selection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectInput createSelectInput()
  {
    SelectInputImpl selectInput = new SelectInputImpl();
    return selectInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectConstaintExpression createSelectConstaintExpression()
  {
    SelectConstaintExpressionImpl selectConstaintExpression = new SelectConstaintExpressionImpl();
    return selectConstaintExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompareOperand createCompareOperand()
  {
    CompareOperandImpl compareOperand = new CompareOperandImpl();
    return compareOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterExpression createParameterExpression()
  {
    ParameterExpressionImpl parameterExpression = new ParameterExpressionImpl();
    return parameterExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Filter createFilter()
  {
    FilterImpl filter = new FilterImpl();
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintExpression createConstraintExpression()
  {
    ConstraintExpressionImpl constraintExpression = new ConstraintExpressionImpl();
    return constraintExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyConstraint createPropertyConstraint()
  {
    PropertyConstraintImpl propertyConstraint = new PropertyConstraintImpl();
    return propertyConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSelection createTypeSelection()
  {
    TypeSelectionImpl typeSelection = new TypeSelectionImpl();
    return typeSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcreteType createConcreteType()
  {
    ConcreteTypeImpl concreteType = new ConcreteTypeImpl();
    return concreteType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateTypeSelection createTemplateTypeSelection()
  {
    TemplateTypeSelectionImpl templateTypeSelection = new TemplateTypeSelectionImpl();
    return templateTypeSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordTypeSelection createRecordTypeSelection()
  {
    RecordTypeSelectionImpl recordTypeSelection = new RecordTypeSelectionImpl();
    return recordTypeSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayLiteral createArrayLiteral()
  {
    ArrayLiteralImpl arrayLiteral = new ArrayLiteralImpl();
    return arrayLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteral createIntLiteral()
  {
    IntLiteralImpl intLiteral = new IntLiteralImpl();
    return intLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatLiteral createFloatLiteral()
  {
    FloatLiteralImpl floatLiteral = new FloatLiteralImpl();
    return floatLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltInValueLiteral createBuiltInValueLiteral()
  {
    BuiltInValueLiteralImpl builtInValueLiteral = new BuiltInValueLiteralImpl();
    return builtInValueLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordTypeModifier createRecordTypeModifierFromString(EDataType eDataType, String initialValue)
  {
    RecordTypeModifier result = RecordTypeModifier.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRecordTypeModifierToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicOperator createLogicOperatorFromString(EDataType eDataType, String initialValue)
  {
    LogicOperator result = LogicOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLogicOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comparator createComparatorFromString(EDataType eDataType, String initialValue)
  {
    Comparator result = Comparator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertComparatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintLangPackage getConstraintLangPackage()
  {
    return (ConstraintLangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ConstraintLangPackage getPackage()
  {
    return ConstraintLangPackage.eINSTANCE;
  }

} //ConstraintLangFactoryImpl
