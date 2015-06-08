package org.iobserve.rac.constraint.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.iobserve.rac.constraint.constraintLang.ArrayLiteral;
import org.iobserve.rac.constraint.constraintLang.BooleanLiteral;
import org.iobserve.rac.constraint.constraintLang.BuiltInValueLiteral;
import org.iobserve.rac.constraint.constraintLang.ConcreteType;
import org.iobserve.rac.constraint.constraintLang.ConstraintExpression;
import org.iobserve.rac.constraint.constraintLang.ConstraintLangPackage;
import org.iobserve.rac.constraint.constraintLang.Filter;
import org.iobserve.rac.constraint.constraintLang.FloatLiteral;
import org.iobserve.rac.constraint.constraintLang.Import;
import org.iobserve.rac.constraint.constraintLang.IntLiteral;
import org.iobserve.rac.constraint.constraintLang.Model;
import org.iobserve.rac.constraint.constraintLang.ParameterExpression;
import org.iobserve.rac.constraint.constraintLang.PropertyConstraint;
import org.iobserve.rac.constraint.constraintLang.RecordTypeSelection;
import org.iobserve.rac.constraint.constraintLang.SelectConstaintExpression;
import org.iobserve.rac.constraint.constraintLang.SelectInput;
import org.iobserve.rac.constraint.constraintLang.Selection;
import org.iobserve.rac.constraint.constraintLang.StringLiteral;
import org.iobserve.rac.constraint.constraintLang.TemplateTypeSelection;
import org.iobserve.rac.constraint.services.ConstraintLangGrammarAccess;

@SuppressWarnings("all")
public class ConstraintLangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ConstraintLangGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ConstraintLangPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ConstraintLangPackage.ARRAY_LITERAL:
				if(context == grammarAccess.getArrayLiteralRule() ||
				   context == grammarAccess.getCompareOperandRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_ArrayLiteral(context, (ArrayLiteral) semanticObject); 
					return; 
				}
				else break;
			case ConstraintLangPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getBooleanLiteralRule() ||
				   context == grammarAccess.getCompareOperandRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case ConstraintLangPackage.BUILT_IN_VALUE_LITERAL:
				if(context == grammarAccess.getBuiltInValueLiteralRule() ||
				   context == grammarAccess.getCompareOperandRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_BuiltInValueLiteral(context, (BuiltInValueLiteral) semanticObject); 
					return; 
				}
				else break;
			case ConstraintLangPackage.CONCRETE_TYPE:
				if(context == grammarAccess.getConcreteTypeRule() ||
				   context == grammarAccess.getTypeSelectionRule()) {
					sequence_ConcreteType(context, (ConcreteType) semanticObject); 
					return; 
				}
				else break;
			case ConstraintLangPackage.CONSTRAINT_EXPRESSION:
				if(context == grammarAccess.getConstraintExpressionRule()) {
					sequence_BasicConstraint_Constraint_ConstraintExpression_ParenthesisConstraint(context, (ConstraintExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBasicConstraintRule() ||
				   context == grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0()) {
					sequence_BasicConstraint_Constraint_ParenthesisConstraint(context, (ConstraintExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConstraintRule()) {
					sequence_Constraint(context, (ConstraintExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getParenthesisConstraintRule()) {
					sequence_ParenthesisConstraint(context, (ConstraintExpression) semanticObject); 
					return; 
				}
				else break;
			case ConstraintLangPackage.FILTER:
				if(context == grammarAccess.getFilterRule() ||
				   context == grammarAccess.getOperationRule()) {
					sequence_Filter(context, (Filter) semanticObject); 
					return; 
				}
				else break;
			case ConstraintLangPackage.FLOAT_LITERAL:
				if(context == grammarAccess.getCompareOperandRule() ||
				   context == grammarAccess.getFloatLiteralRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_FloatLiteral(context, (FloatLiteral) semanticObject); 
					return; 
				}
				else break;
			case ConstraintLangPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case ConstraintLangPackage.INT_LITERAL:
				if(context == grammarAccess.getCompareOperandRule() ||
				   context == grammarAccess.getIntLiteralRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_IntLiteral(context, (IntLiteral) semanticObject); 
					return; 
				}
				else break;
			case ConstraintLangPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ConstraintLangPackage.PARAMETER_EXPRESSION:
				if(context == grammarAccess.getCompareOperandRule() ||
				   context == grammarAccess.getParameterExpressionRule()) {
					sequence_ParameterExpression(context, (ParameterExpression) semanticObject); 
					return; 
				}
				else break;
			case ConstraintLangPackage.PROPERTY_CONSTRAINT:
				if(context == grammarAccess.getPropertyConstraintRule()) {
					sequence_BasicPropertyConstraint_PropertyConstraint_PropertyParenthesisConstraint_PropertyValueConstraint(context, (PropertyConstraint) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBasicPropertyConstraintRule() ||
				   context == grammarAccess.getPropertyConstraintAccess().getPropertyConstraintLeftAction_1_0_0_0()) {
					sequence_BasicPropertyConstraint_PropertyParenthesisConstraint_PropertyValueConstraint(context, (PropertyConstraint) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPropertyParenthesisConstraintRule()) {
					sequence_PropertyParenthesisConstraint(context, (PropertyConstraint) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPropertyValueConstraintRule()) {
					sequence_PropertyValueConstraint(context, (PropertyConstraint) semanticObject); 
					return; 
				}
				else break;
			case ConstraintLangPackage.RECORD_TYPE_SELECTION:
				if(context == grammarAccess.getRecordTypeSelectionRule() ||
				   context == grammarAccess.getTypeSelectionRule()) {
					sequence_RecordTypeSelection(context, (RecordTypeSelection) semanticObject); 
					return; 
				}
				else break;
			case ConstraintLangPackage.SELECT_CONSTAINT_EXPRESSION:
				if(context == grammarAccess.getSelectConstaintExpressionRule()) {
					sequence_BasicSelectConstraint_ParenthesisSelectConstraint_SelectConstaintExpression_SelectConstraint(context, (SelectConstaintExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBasicSelectConstraintRule() ||
				   context == grammarAccess.getSelectConstaintExpressionAccess().getSelectConstaintExpressionLeftAction_1_0_0_0()) {
					sequence_BasicSelectConstraint_ParenthesisSelectConstraint_SelectConstraint(context, (SelectConstaintExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getParenthesisSelectConstraintRule()) {
					sequence_ParenthesisSelectConstraint(context, (SelectConstaintExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSelectConstraintRule()) {
					sequence_SelectConstraint(context, (SelectConstaintExpression) semanticObject); 
					return; 
				}
				else break;
			case ConstraintLangPackage.SELECT_INPUT:
				if(context == grammarAccess.getSelectInputRule()) {
					sequence_SelectInput(context, (SelectInput) semanticObject); 
					return; 
				}
				else break;
			case ConstraintLangPackage.SELECTION:
				if(context == grammarAccess.getOperationRule() ||
				   context == grammarAccess.getSelectionRule()) {
					sequence_Selection(context, (Selection) semanticObject); 
					return; 
				}
				else break;
			case ConstraintLangPackage.STRING_LITERAL:
				if(context == grammarAccess.getCompareOperandRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getStringLiteralRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case ConstraintLangPackage.TEMPLATE_TYPE_SELECTION:
				if(context == grammarAccess.getTemplateTypeSelectionRule() ||
				   context == grammarAccess.getTypeSelectionRule()) {
					sequence_TemplateTypeSelection(context, (TemplateTypeSelection) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (literals+=Literal literals+=Literal*)
	 */
	protected void sequence_ArrayLiteral(EObject context, ArrayLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         constraint=ConstraintExpression | 
	 *         (typeSelection=TypeSelection propertyConstraint=PropertyConstraint?) | 
	 *         (left=ConstraintExpression_ConstraintExpression_1_0_0_0 operator=LogicOperator right=PropertyConstraint)
	 *     )
	 */
	protected void sequence_BasicConstraint_Constraint_ConstraintExpression_ParenthesisConstraint(EObject context, ConstraintExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constraint=ConstraintExpression | (typeSelection=TypeSelection propertyConstraint=PropertyConstraint?))
	 */
	protected void sequence_BasicConstraint_Constraint_ParenthesisConstraint(EObject context, ConstraintExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         constraint=PropertyConstraint | 
	 *         (property=[Property|ID] comparator=Comparator value=Literal) | 
	 *         (left=PropertyConstraint_PropertyConstraint_1_0_0_0 operator=LogicOperator right=PropertyConstraint)
	 *     )
	 */
	protected void sequence_BasicPropertyConstraint_PropertyConstraint_PropertyParenthesisConstraint_PropertyValueConstraint(EObject context, PropertyConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constraint=PropertyConstraint | (property=[Property|ID] comparator=Comparator value=Literal))
	 */
	protected void sequence_BasicPropertyConstraint_PropertyParenthesisConstraint_PropertyValueConstraint(EObject context, PropertyConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         constraint=SelectConstaintExpression | 
	 *         (left=CompareOperand comperator=Comparator right=CompareOperand) | 
	 *         (left=SelectConstaintExpression_SelectConstaintExpression_1_0_0_0 operator=LogicOperator right=SelectConstaintExpression)
	 *     )
	 */
	protected void sequence_BasicSelectConstraint_ParenthesisSelectConstraint_SelectConstaintExpression_SelectConstraint(EObject context, SelectConstaintExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constraint=SelectConstaintExpression | (left=CompareOperand comperator=Comparator right=CompareOperand))
	 */
	protected void sequence_BasicSelectConstraint_ParenthesisSelectConstraint_SelectConstraint(EObject context, SelectConstaintExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=BOOLEAN
	 */
	protected void sequence_BooleanLiteral(EObject context, BooleanLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConstraintLangPackage.Literals.BOOLEAN_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConstraintLangPackage.Literals.BOOLEAN_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value='KIEKER_VERSION'
	 */
	protected void sequence_BuiltInValueLiteral(EObject context, BuiltInValueLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConstraintLangPackage.Literals.BUILT_IN_VALUE_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConstraintLangPackage.Literals.BUILT_IN_VALUE_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBuiltInValueLiteralAccess().getValueKIEKER_VERSIONKeyword_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=[Type|ID]
	 */
	protected void sequence_ConcreteType(EObject context, ConcreteType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConstraintLangPackage.Literals.CONCRETE_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConstraintLangPackage.Literals.CONCRETE_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConcreteTypeAccess().getTypeTypeIDTerminalRuleCall_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (typeSelection=TypeSelection propertyConstraint=PropertyConstraint?)
	 */
	protected void sequence_Constraint(EObject context, ConstraintExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID constraint=ConstraintExpression)
	 */
	protected void sequence_Filter(EObject context, Filter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConstraintLangPackage.Literals.FILTER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConstraintLangPackage.Literals.FILTER__NAME));
			if(transientValues.isValueTransient(semanticObject, ConstraintLangPackage.Literals.FILTER__CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConstraintLangPackage.Literals.FILTER__CONSTRAINT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFilterAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFilterAccess().getConstraintConstraintExpressionParserRuleCall_2_0(), semanticObject.getConstraint());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=FLOAT
	 */
	protected void sequence_FloatLiteral(EObject context, FloatLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConstraintLangPackage.Literals.FLOAT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConstraintLangPackage.Literals.FLOAT_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConstraintLangPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConstraintLangPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntLiteral(EObject context, IntLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConstraintLangPackage.Literals.INT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConstraintLangPackage.Literals.INT_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName imports+=Import* operations+=Operation*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (input=[SelectInput|ID]? propertyReference=[Property|ID])
	 */
	protected void sequence_ParameterExpression(EObject context, ParameterExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     constraint=ConstraintExpression
	 */
	protected void sequence_ParenthesisConstraint(EObject context, ConstraintExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     constraint=SelectConstaintExpression
	 */
	protected void sequence_ParenthesisSelectConstraint(EObject context, SelectConstaintExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     constraint=PropertyConstraint
	 */
	protected void sequence_PropertyParenthesisConstraint(EObject context, PropertyConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property=[Property|ID] comparator=Comparator value=Literal)
	 */
	protected void sequence_PropertyValueConstraint(EObject context, PropertyConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifier=RecordTypeModifier type=[RecordType|ID])
	 */
	protected void sequence_RecordTypeSelection(EObject context, RecordTypeSelection semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConstraintLangPackage.Literals.RECORD_TYPE_SELECTION__MODIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConstraintLangPackage.Literals.RECORD_TYPE_SELECTION__MODIFIER));
			if(transientValues.isValueTransient(semanticObject, ConstraintLangPackage.Literals.RECORD_TYPE_SELECTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConstraintLangPackage.Literals.RECORD_TYPE_SELECTION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRecordTypeSelectionAccess().getModifierRecordTypeModifierEnumRuleCall_1_0(), semanticObject.getModifier());
		feeder.accept(grammarAccess.getRecordTypeSelectionAccess().getTypeRecordTypeIDTerminalRuleCall_2_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=CompareOperand comperator=Comparator right=CompareOperand)
	 */
	protected void sequence_SelectConstraint(EObject context, SelectConstaintExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (recordType=[RecordType|ID] name=ID selectConstraint=SelectConstaintExpression?)
	 */
	protected void sequence_SelectInput(EObject context, SelectInput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         inputs+=SelectInput 
	 *         inputs+=SelectInput* 
	 *         filter=[Filter|ID] 
	 *         recordType=[RecordType|ID] 
	 *         paremterExpressions+=ParameterExpression 
	 *         paremterExpressions+=ParameterExpression*
	 *     )
	 */
	protected void sequence_Selection(EObject context, Selection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConstraintLangPackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConstraintLangPackage.Literals.STRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (types+=[TemplateType|ID] types+=[TemplateType|QualifiedName]*)
	 */
	protected void sequence_TemplateTypeSelection(EObject context, TemplateTypeSelection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
