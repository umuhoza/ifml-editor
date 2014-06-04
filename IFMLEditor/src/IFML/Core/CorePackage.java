/**
 */
package IFML.Core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.uml2.uml.UMLPackage;

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
 * @see IFML.Core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/20130218/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = IFML.Core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ElementImpl
	 * @see IFML.Core.impl.CorePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CONSTRAINTS = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ANNOTATIONS = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.InteractionFlowModelElementImpl <em>Interaction Flow Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.InteractionFlowModelElementImpl
	 * @see IFML.Core.impl.CorePackageImpl#getInteractionFlowModelElement()
	 * @generated
	 */
	int INTERACTION_FLOW_MODEL_ELEMENT = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL_ELEMENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL_ELEMENT__CONSTRAINTS = ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL_ELEMENT__ANNOTATIONS = ELEMENT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Interaction Flow Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interaction Flow Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.InteractionFlowImpl <em>Interaction Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.InteractionFlowImpl
	 * @see IFML.Core.impl.CorePackageImpl#getInteractionFlow()
	 * @generated
	 */
	int INTERACTION_FLOW = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW__ID = INTERACTION_FLOW_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW__CONSTRAINTS = INTERACTION_FLOW_MODEL_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW__ANNOTATIONS = INTERACTION_FLOW_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Parameter Binding Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW__PARAMETER_BINDING_GROUP = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Interaction Flow Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Interaction Flow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW__TARGET_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interaction Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Interaction Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ExpressionImpl
	 * @see IFML.Core.impl.CorePackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ID = INTERACTION_FLOW_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__CONSTRAINTS = INTERACTION_FLOW_MODEL_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ANNOTATIONS = INTERACTION_FLOW_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__LANGUAGE = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__BODY = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.InteractionFlowExpressionImpl <em>Interaction Flow Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.InteractionFlowExpressionImpl
	 * @see IFML.Core.impl.CorePackageImpl#getInteractionFlowExpression()
	 * @generated
	 */
	int INTERACTION_FLOW_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_EXPRESSION__CONSTRAINTS = EXPRESSION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_EXPRESSION__LANGUAGE = EXPRESSION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_EXPRESSION__BODY = EXPRESSION__BODY;

	/**
	 * The feature id for the '<em><b>Interaction Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_EXPRESSION__INTERACTION_FLOW = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interaction Flow Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interaction Flow Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.InteractionFlowElementImpl <em>Interaction Flow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.InteractionFlowElementImpl
	 * @see IFML.Core.impl.CorePackageImpl#getInteractionFlowElement()
	 * @generated
	 */
	int INTERACTION_FLOW_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__ID = INTERACTION_FLOW_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__CONSTRAINTS = INTERACTION_FLOW_MODEL_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__ANNOTATIONS = INTERACTION_FLOW_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__EANNOTATIONS = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__OWNED_COMMENT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__OWNED_ELEMENT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__OWNER = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__CLIENT_DEPENDENCY = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__NAME = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__NAME_EXPRESSION = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__NAMESPACE = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__QUALIFIED_NAME = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__VISIBILITY = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__PARAMETERS = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Interaction Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_EANNOTATION__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___ADD_KEYWORD__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___CREATE_EANNOTATION__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___DESTROY = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_KEYWORDS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_APPLICABLE_STEREOTYPES = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_APPLIED_STEREOTYPE__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_APPLIED_STEREOTYPES = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_MODEL = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_NEAREST_PACKAGE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_RELATIONSHIPS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_REQUIRED_STEREOTYPES = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_STEREOTYPE_APPLICATIONS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_VALUE__STEREOTYPE_STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___HAS_KEYWORD__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___HAS_VALUE__STEREOTYPE_STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___REMOVE_KEYWORD__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___ALL_OWNED_ELEMENTS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___MUST_BE_OWNED = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___CREATE_USAGE__NAMEDELEMENT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_LABEL = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_LABEL__BOOLEAN = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___ALL_NAMESPACES = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___ALL_OWNING_PACKAGES = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_NAMESPACE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_QUALIFIED_NAME = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___SEPARATOR = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 49;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_CLIENT_DEPENDENCY__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 50;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 51;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 52;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___CREATE_OWNED_COMMENT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 53;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT___CREATE__ECLASS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 54;

	/**
	 * The number of operations of the '<em>Interaction Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 55;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.EventImpl
	 * @see IFML.Core.impl.CorePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ID = INTERACTION_FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONSTRAINTS = INTERACTION_FLOW_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ANNOTATIONS = INTERACTION_FLOW_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EANNOTATIONS = INTERACTION_FLOW_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OWNED_COMMENT = INTERACTION_FLOW_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OWNED_ELEMENT = INTERACTION_FLOW_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OWNER = INTERACTION_FLOW_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CLIENT_DEPENDENCY = INTERACTION_FLOW_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = INTERACTION_FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME_EXPRESSION = INTERACTION_FLOW_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAMESPACE = INTERACTION_FLOW_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__QUALIFIED_NAME = INTERACTION_FLOW_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__VISIBILITY = INTERACTION_FLOW_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PARAMETERS = INTERACTION_FLOW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IN_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ACTIVATION_EXPRESSION = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__INTERACTION_FLOW_EXPRESSION = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_EANNOTATION__STRING = INTERACTION_FLOW_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___ADD_KEYWORD__STRING = INTERACTION_FLOW_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___APPLY_STEREOTYPE__STEREOTYPE = INTERACTION_FLOW_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___CREATE_EANNOTATION__STRING = INTERACTION_FLOW_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___DESTROY = INTERACTION_FLOW_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_KEYWORDS = INTERACTION_FLOW_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_APPLICABLE_STEREOTYPE__STRING = INTERACTION_FLOW_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_APPLICABLE_STEREOTYPES = INTERACTION_FLOW_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_APPLIED_STEREOTYPE__STRING = INTERACTION_FLOW_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_APPLIED_STEREOTYPES = INTERACTION_FLOW_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = INTERACTION_FLOW_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = INTERACTION_FLOW_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_MODEL = INTERACTION_FLOW_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_NEAREST_PACKAGE = INTERACTION_FLOW_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_RELATIONSHIPS = INTERACTION_FLOW_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_REQUIRED_STEREOTYPE__STRING = INTERACTION_FLOW_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_REQUIRED_STEREOTYPES = INTERACTION_FLOW_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = INTERACTION_FLOW_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = INTERACTION_FLOW_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_STEREOTYPE_APPLICATIONS = INTERACTION_FLOW_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS = INTERACTION_FLOW_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_VALUE__STEREOTYPE_STRING = INTERACTION_FLOW_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___HAS_KEYWORD__STRING = INTERACTION_FLOW_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___HAS_VALUE__STEREOTYPE_STRING = INTERACTION_FLOW_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___REMOVE_KEYWORD__STRING = INTERACTION_FLOW_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = INTERACTION_FLOW_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___UNAPPLY_STEREOTYPE__STEREOTYPE = INTERACTION_FLOW_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___ALL_OWNED_ELEMENTS = INTERACTION_FLOW_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___MUST_BE_OWNED = INTERACTION_FLOW_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___CREATE_DEPENDENCY__NAMEDELEMENT = INTERACTION_FLOW_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___CREATE_USAGE__NAMEDELEMENT = INTERACTION_FLOW_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_LABEL = INTERACTION_FLOW_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_LABEL__BOOLEAN = INTERACTION_FLOW_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___ALL_NAMESPACES = INTERACTION_FLOW_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___ALL_OWNING_PACKAGES = INTERACTION_FLOW_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INTERACTION_FLOW_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_NAMESPACE = INTERACTION_FLOW_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_QUALIFIED_NAME = INTERACTION_FLOW_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___SEPARATOR = INTERACTION_FLOW_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_CLIENT_DEPENDENCY__STRING = INTERACTION_FLOW_ELEMENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = INTERACTION_FLOW_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___CREATE_NAME_EXPRESSION__STRING_TYPE = INTERACTION_FLOW_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___CREATE_OWNED_COMMENT = INTERACTION_FLOW_ELEMENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___CREATE__ECLASS = INTERACTION_FLOW_ELEMENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.CatchingEventImpl <em>Catching Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.CatchingEventImpl
	 * @see IFML.Core.impl.CorePackageImpl#getCatchingEvent()
	 * @generated
	 */
	int CATCHING_EVENT = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__CONSTRAINTS = EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__ANNOTATIONS = EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__EANNOTATIONS = EVENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__OWNED_COMMENT = EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__OWNED_ELEMENT = EVENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__OWNER = EVENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__CLIENT_DEPENDENCY = EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__NAME_EXPRESSION = EVENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__NAMESPACE = EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__QUALIFIED_NAME = EVENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__VISIBILITY = EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__PARAMETERS = EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__OUT_INTERACTION_FLOWS = EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__IN_INTERACTION_FLOWS = EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__ACTIVATION_EXPRESSION = EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__INTERACTION_FLOW_EXPRESSION = EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Catching Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_EANNOTATION__STRING = EVENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = EVENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = EVENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___ADD_KEYWORD__STRING = EVENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___APPLY_STEREOTYPE__STEREOTYPE = EVENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___CREATE_EANNOTATION__STRING = EVENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___DESTROY = EVENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_KEYWORDS = EVENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_APPLICABLE_STEREOTYPE__STRING = EVENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_APPLICABLE_STEREOTYPES = EVENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_APPLIED_STEREOTYPE__STRING = EVENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_APPLIED_STEREOTYPES = EVENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = EVENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = EVENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_MODEL = EVENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_NEAREST_PACKAGE = EVENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_RELATIONSHIPS = EVENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_RELATIONSHIPS__ECLASS = EVENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_REQUIRED_STEREOTYPE__STRING = EVENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_REQUIRED_STEREOTYPES = EVENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = EVENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_STEREOTYPE_APPLICATIONS = EVENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS = EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_VALUE__STEREOTYPE_STRING = EVENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___HAS_KEYWORD__STRING = EVENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___HAS_VALUE__STEREOTYPE_STRING = EVENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = EVENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = EVENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = EVENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___REMOVE_KEYWORD__STRING = EVENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = EVENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___UNAPPLY_STEREOTYPE__STEREOTYPE = EVENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___ALL_OWNED_ELEMENTS = EVENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___MUST_BE_OWNED = EVENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = EVENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = EVENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = EVENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___CREATE_DEPENDENCY__NAMEDELEMENT = EVENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___CREATE_USAGE__NAMEDELEMENT = EVENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_LABEL = EVENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_LABEL__BOOLEAN = EVENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___ALL_NAMESPACES = EVENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___ALL_OWNING_PACKAGES = EVENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_NAMESPACE = EVENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_QUALIFIED_NAME = EVENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___SEPARATOR = EVENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_CLIENT_DEPENDENCY__STRING = EVENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = EVENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___CREATE_NAME_EXPRESSION__STRING_TYPE = EVENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___CREATE_OWNED_COMMENT = EVENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT___CREATE__ECLASS = EVENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Catching Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.SystemEventImpl <em>System Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.SystemEventImpl
	 * @see IFML.Core.impl.CorePackageImpl#getSystemEvent()
	 * @generated
	 */
	int SYSTEM_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__ID = CATCHING_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__CONSTRAINTS = CATCHING_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__ANNOTATIONS = CATCHING_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__EANNOTATIONS = CATCHING_EVENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__OWNED_COMMENT = CATCHING_EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__OWNED_ELEMENT = CATCHING_EVENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__OWNER = CATCHING_EVENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__CLIENT_DEPENDENCY = CATCHING_EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__NAME = CATCHING_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__NAME_EXPRESSION = CATCHING_EVENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__NAMESPACE = CATCHING_EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__QUALIFIED_NAME = CATCHING_EVENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__VISIBILITY = CATCHING_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__PARAMETERS = CATCHING_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__OUT_INTERACTION_FLOWS = CATCHING_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__IN_INTERACTION_FLOWS = CATCHING_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__ACTIVATION_EXPRESSION = CATCHING_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__INTERACTION_FLOW_EXPRESSION = CATCHING_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Triggering Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__TRIGGERING_EXPRESSIONS = CATCHING_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT__TYPE = CATCHING_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT_FEATURE_COUNT = CATCHING_EVENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_EANNOTATION__STRING = CATCHING_EVENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = CATCHING_EVENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = CATCHING_EVENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___ADD_KEYWORD__STRING = CATCHING_EVENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___APPLY_STEREOTYPE__STEREOTYPE = CATCHING_EVENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___CREATE_EANNOTATION__STRING = CATCHING_EVENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___DESTROY = CATCHING_EVENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_KEYWORDS = CATCHING_EVENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_APPLICABLE_STEREOTYPE__STRING = CATCHING_EVENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_APPLICABLE_STEREOTYPES = CATCHING_EVENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_APPLIED_STEREOTYPE__STRING = CATCHING_EVENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_APPLIED_STEREOTYPES = CATCHING_EVENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = CATCHING_EVENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = CATCHING_EVENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_MODEL = CATCHING_EVENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_NEAREST_PACKAGE = CATCHING_EVENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_RELATIONSHIPS = CATCHING_EVENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_RELATIONSHIPS__ECLASS = CATCHING_EVENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_REQUIRED_STEREOTYPE__STRING = CATCHING_EVENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_REQUIRED_STEREOTYPES = CATCHING_EVENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = CATCHING_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = CATCHING_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = CATCHING_EVENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_STEREOTYPE_APPLICATIONS = CATCHING_EVENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS = CATCHING_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = CATCHING_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_VALUE__STEREOTYPE_STRING = CATCHING_EVENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___HAS_KEYWORD__STRING = CATCHING_EVENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___HAS_VALUE__STEREOTYPE_STRING = CATCHING_EVENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = CATCHING_EVENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = CATCHING_EVENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = CATCHING_EVENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___REMOVE_KEYWORD__STRING = CATCHING_EVENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = CATCHING_EVENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___UNAPPLY_STEREOTYPE__STEREOTYPE = CATCHING_EVENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___ALL_OWNED_ELEMENTS = CATCHING_EVENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___MUST_BE_OWNED = CATCHING_EVENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CATCHING_EVENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CATCHING_EVENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = CATCHING_EVENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___CREATE_DEPENDENCY__NAMEDELEMENT = CATCHING_EVENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___CREATE_USAGE__NAMEDELEMENT = CATCHING_EVENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_LABEL = CATCHING_EVENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_LABEL__BOOLEAN = CATCHING_EVENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___ALL_NAMESPACES = CATCHING_EVENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___ALL_OWNING_PACKAGES = CATCHING_EVENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CATCHING_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_NAMESPACE = CATCHING_EVENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_QUALIFIED_NAME = CATCHING_EVENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___SEPARATOR = CATCHING_EVENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_CLIENT_DEPENDENCY__STRING = CATCHING_EVENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = CATCHING_EVENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___CREATE_NAME_EXPRESSION__STRING_TYPE = CATCHING_EVENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___CREATE_OWNED_COMMENT = CATCHING_EVENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT___CREATE__ECLASS = CATCHING_EVENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>System Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EVENT_OPERATION_COUNT = CATCHING_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ParameterBindingImpl <em>Parameter Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ParameterBindingImpl
	 * @see IFML.Core.impl.CorePackageImpl#getParameterBinding()
	 * @generated
	 */
	int PARAMETER_BINDING = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__ID = INTERACTION_FLOW_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__CONSTRAINTS = INTERACTION_FLOW_MODEL_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__ANNOTATIONS = INTERACTION_FLOW_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__SOURCE_PARAMETER = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__TARGET_PARAMETER = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ActionEventImpl <em>Action Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ActionEventImpl
	 * @see IFML.Core.impl.CorePackageImpl#getActionEvent()
	 * @generated
	 */
	int ACTION_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__ID = CATCHING_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__CONSTRAINTS = CATCHING_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__ANNOTATIONS = CATCHING_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__EANNOTATIONS = CATCHING_EVENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__OWNED_COMMENT = CATCHING_EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__OWNED_ELEMENT = CATCHING_EVENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__OWNER = CATCHING_EVENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__CLIENT_DEPENDENCY = CATCHING_EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__NAME = CATCHING_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__NAME_EXPRESSION = CATCHING_EVENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__NAMESPACE = CATCHING_EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__QUALIFIED_NAME = CATCHING_EVENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__VISIBILITY = CATCHING_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__PARAMETERS = CATCHING_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__OUT_INTERACTION_FLOWS = CATCHING_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__IN_INTERACTION_FLOWS = CATCHING_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__ACTIVATION_EXPRESSION = CATCHING_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__INTERACTION_FLOW_EXPRESSION = CATCHING_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Action Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT_FEATURE_COUNT = CATCHING_EVENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_EANNOTATION__STRING = CATCHING_EVENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = CATCHING_EVENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = CATCHING_EVENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___ADD_KEYWORD__STRING = CATCHING_EVENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___APPLY_STEREOTYPE__STEREOTYPE = CATCHING_EVENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___CREATE_EANNOTATION__STRING = CATCHING_EVENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___DESTROY = CATCHING_EVENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_KEYWORDS = CATCHING_EVENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_APPLICABLE_STEREOTYPE__STRING = CATCHING_EVENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_APPLICABLE_STEREOTYPES = CATCHING_EVENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_APPLIED_STEREOTYPE__STRING = CATCHING_EVENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_APPLIED_STEREOTYPES = CATCHING_EVENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = CATCHING_EVENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = CATCHING_EVENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_MODEL = CATCHING_EVENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_NEAREST_PACKAGE = CATCHING_EVENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_RELATIONSHIPS = CATCHING_EVENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_RELATIONSHIPS__ECLASS = CATCHING_EVENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_REQUIRED_STEREOTYPE__STRING = CATCHING_EVENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_REQUIRED_STEREOTYPES = CATCHING_EVENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = CATCHING_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = CATCHING_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = CATCHING_EVENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_STEREOTYPE_APPLICATIONS = CATCHING_EVENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS = CATCHING_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = CATCHING_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_VALUE__STEREOTYPE_STRING = CATCHING_EVENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___HAS_KEYWORD__STRING = CATCHING_EVENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___HAS_VALUE__STEREOTYPE_STRING = CATCHING_EVENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = CATCHING_EVENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = CATCHING_EVENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = CATCHING_EVENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___REMOVE_KEYWORD__STRING = CATCHING_EVENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = CATCHING_EVENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___UNAPPLY_STEREOTYPE__STEREOTYPE = CATCHING_EVENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___ALL_OWNED_ELEMENTS = CATCHING_EVENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___MUST_BE_OWNED = CATCHING_EVENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CATCHING_EVENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CATCHING_EVENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = CATCHING_EVENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___CREATE_DEPENDENCY__NAMEDELEMENT = CATCHING_EVENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___CREATE_USAGE__NAMEDELEMENT = CATCHING_EVENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_LABEL = CATCHING_EVENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_LABEL__BOOLEAN = CATCHING_EVENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___ALL_NAMESPACES = CATCHING_EVENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___ALL_OWNING_PACKAGES = CATCHING_EVENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CATCHING_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_NAMESPACE = CATCHING_EVENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_QUALIFIED_NAME = CATCHING_EVENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___SEPARATOR = CATCHING_EVENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_CLIENT_DEPENDENCY__STRING = CATCHING_EVENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = CATCHING_EVENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___CREATE_NAME_EXPRESSION__STRING_TYPE = CATCHING_EVENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___CREATE_OWNED_COMMENT = CATCHING_EVENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT___CREATE__ECLASS = CATCHING_EVENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Action Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT_OPERATION_COUNT = CATCHING_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.IFMLNamedElementImpl <em>IFML Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.IFMLNamedElementImpl
	 * @see IFML.Core.impl.CorePackageImpl#getIFMLNamedElement()
	 * @generated
	 */
	int IFML_NAMED_ELEMENT = 57;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT__EANNOTATIONS = UMLPackage.NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT__OWNED_COMMENT = UMLPackage.NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT__OWNED_ELEMENT = UMLPackage.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT__OWNER = UMLPackage.NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT__CLIENT_DEPENDENCY = UMLPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT__NAME = UMLPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT__NAME_EXPRESSION = UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT__NAMESPACE = UMLPackage.NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT__QUALIFIED_NAME = UMLPackage.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT__VISIBILITY = UMLPackage.NAMED_ELEMENT__VISIBILITY;

	/**
	 * The number of structural features of the '<em>IFML Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT_FEATURE_COUNT = UMLPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_EANNOTATION__STRING = UMLPackage.NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.NAMED_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.NAMED_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___ADD_KEYWORD__STRING = UMLPackage.NAMED_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.NAMED_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___CREATE_EANNOTATION__STRING = UMLPackage.NAMED_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___DESTROY = UMLPackage.NAMED_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_KEYWORDS = UMLPackage.NAMED_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPES = UMLPackage.NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.NAMED_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_APPLIED_STEREOTYPES = UMLPackage.NAMED_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_MODEL = UMLPackage.NAMED_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_NEAREST_PACKAGE = UMLPackage.NAMED_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_RELATIONSHIPS = UMLPackage.NAMED_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_RELATIONSHIPS__ECLASS = UMLPackage.NAMED_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.NAMED_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_REQUIRED_STEREOTYPES = UMLPackage.NAMED_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.NAMED_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_STEREOTYPE_APPLICATIONS = UMLPackage.NAMED_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_VALUE__STEREOTYPE_STRING = UMLPackage.NAMED_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___HAS_KEYWORD__STRING = UMLPackage.NAMED_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.NAMED_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.NAMED_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.NAMED_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.NAMED_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___REMOVE_KEYWORD__STRING = UMLPackage.NAMED_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.NAMED_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.NAMED_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___ALL_OWNED_ELEMENTS = UMLPackage.NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___MUST_BE_OWNED = UMLPackage.NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.NAMED_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.NAMED_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.NAMED_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.NAMED_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___CREATE_USAGE__NAMEDELEMENT = UMLPackage.NAMED_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_LABEL = UMLPackage.NAMED_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_LABEL__BOOLEAN = UMLPackage.NAMED_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___ALL_NAMESPACES = UMLPackage.NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___ALL_OWNING_PACKAGES = UMLPackage.NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_NAMESPACE = UMLPackage.NAMED_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_QUALIFIED_NAME = UMLPackage.NAMED_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___SEPARATOR = UMLPackage.NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_CLIENT_DEPENDENCY__STRING = UMLPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = UMLPackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE = UMLPackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___CREATE_OWNED_COMMENT = UMLPackage.NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT___CREATE__ECLASS = UMLPackage.NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>IFML Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_NAMED_ELEMENT_OPERATION_COUNT = UMLPackage.NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.DomainModelImpl <em>Domain Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.DomainModelImpl
	 * @see IFML.Core.impl.CorePackageImpl#getDomainModel()
	 * @generated
	 */
	int DOMAIN_MODEL = 5;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__EANNOTATIONS = IFML_NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__OWNED_COMMENT = IFML_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__OWNED_ELEMENT = IFML_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__OWNER = IFML_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__CLIENT_DEPENDENCY = IFML_NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__NAME = IFML_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__NAME_EXPRESSION = IFML_NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__NAMESPACE = IFML_NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__QUALIFIED_NAME = IFML_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__VISIBILITY = IFML_NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Domain Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__DOMAIN_ELEMENTS = IFML_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_FEATURE_COUNT = IFML_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_EANNOTATION__STRING = IFML_NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___ADD_KEYWORD__STRING = IFML_NAMED_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___APPLY_STEREOTYPE__STEREOTYPE = IFML_NAMED_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___CREATE_EANNOTATION__STRING = IFML_NAMED_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___DESTROY = IFML_NAMED_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_KEYWORDS = IFML_NAMED_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_APPLICABLE_STEREOTYPE__STRING = IFML_NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_APPLICABLE_STEREOTYPES = IFML_NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_APPLIED_STEREOTYPE__STRING = IFML_NAMED_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_APPLIED_STEREOTYPES = IFML_NAMED_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = IFML_NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = IFML_NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_MODEL = IFML_NAMED_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_NEAREST_PACKAGE = IFML_NAMED_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_RELATIONSHIPS = IFML_NAMED_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_RELATIONSHIPS__ECLASS = IFML_NAMED_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_REQUIRED_STEREOTYPE__STRING = IFML_NAMED_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_REQUIRED_STEREOTYPES = IFML_NAMED_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_SOURCE_DIRECTED_RELATIONSHIPS = IFML_NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = IFML_NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_STEREOTYPE_APPLICATION__STEREOTYPE = IFML_NAMED_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_STEREOTYPE_APPLICATIONS = IFML_NAMED_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_TARGET_DIRECTED_RELATIONSHIPS = IFML_NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = IFML_NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_VALUE__STEREOTYPE_STRING = IFML_NAMED_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___HAS_KEYWORD__STRING = IFML_NAMED_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___HAS_VALUE__STEREOTYPE_STRING = IFML_NAMED_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = IFML_NAMED_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___IS_STEREOTYPE_APPLIED__STEREOTYPE = IFML_NAMED_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___IS_STEREOTYPE_REQUIRED__STEREOTYPE = IFML_NAMED_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___REMOVE_KEYWORD__STRING = IFML_NAMED_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___SET_VALUE__STEREOTYPE_STRING_OBJECT = IFML_NAMED_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___UNAPPLY_STEREOTYPE__STEREOTYPE = IFML_NAMED_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___ALL_OWNED_ELEMENTS = IFML_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___MUST_BE_OWNED = IFML_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___CREATE_DEPENDENCY__NAMEDELEMENT = IFML_NAMED_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___CREATE_USAGE__NAMEDELEMENT = IFML_NAMED_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_LABEL = IFML_NAMED_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_LABEL__BOOLEAN = IFML_NAMED_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___ALL_NAMESPACES = IFML_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___ALL_OWNING_PACKAGES = IFML_NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = IFML_NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_NAMESPACE = IFML_NAMED_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_QUALIFIED_NAME = IFML_NAMED_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___SEPARATOR = IFML_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_CLIENT_DEPENDENCY__STRING = IFML_NAMED_ELEMENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = IFML_NAMED_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___CREATE_NAME_EXPRESSION__STRING_TYPE = IFML_NAMED_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___CREATE_OWNED_COMMENT = IFML_NAMED_ELEMENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL___CREATE__ECLASS = IFML_NAMED_ELEMENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_OPERATION_COUNT = IFML_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.PortDefinitionImpl <em>Port Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.PortDefinitionImpl
	 * @see IFML.Core.impl.CorePackageImpl#getPortDefinition()
	 * @generated
	 */
	int PORT_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__ID = INTERACTION_FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__CONSTRAINTS = INTERACTION_FLOW_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__ANNOTATIONS = INTERACTION_FLOW_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__EANNOTATIONS = INTERACTION_FLOW_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__OWNED_COMMENT = INTERACTION_FLOW_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__OWNED_ELEMENT = INTERACTION_FLOW_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__OWNER = INTERACTION_FLOW_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__CLIENT_DEPENDENCY = INTERACTION_FLOW_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__NAME = INTERACTION_FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__NAME_EXPRESSION = INTERACTION_FLOW_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__NAMESPACE = INTERACTION_FLOW_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__QUALIFIED_NAME = INTERACTION_FLOW_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__VISIBILITY = INTERACTION_FLOW_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__PARAMETERS = INTERACTION_FLOW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__IN_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__PORTS = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_EANNOTATION__STRING = INTERACTION_FLOW_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___ADD_KEYWORD__STRING = INTERACTION_FLOW_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___APPLY_STEREOTYPE__STEREOTYPE = INTERACTION_FLOW_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___CREATE_EANNOTATION__STRING = INTERACTION_FLOW_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___DESTROY = INTERACTION_FLOW_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_KEYWORDS = INTERACTION_FLOW_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_APPLICABLE_STEREOTYPE__STRING = INTERACTION_FLOW_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_APPLICABLE_STEREOTYPES = INTERACTION_FLOW_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_APPLIED_STEREOTYPE__STRING = INTERACTION_FLOW_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_APPLIED_STEREOTYPES = INTERACTION_FLOW_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = INTERACTION_FLOW_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = INTERACTION_FLOW_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_MODEL = INTERACTION_FLOW_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_NEAREST_PACKAGE = INTERACTION_FLOW_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_RELATIONSHIPS = INTERACTION_FLOW_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_REQUIRED_STEREOTYPE__STRING = INTERACTION_FLOW_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_REQUIRED_STEREOTYPES = INTERACTION_FLOW_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_SOURCE_DIRECTED_RELATIONSHIPS = INTERACTION_FLOW_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_STEREOTYPE_APPLICATION__STEREOTYPE = INTERACTION_FLOW_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_STEREOTYPE_APPLICATIONS = INTERACTION_FLOW_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_TARGET_DIRECTED_RELATIONSHIPS = INTERACTION_FLOW_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_VALUE__STEREOTYPE_STRING = INTERACTION_FLOW_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___HAS_KEYWORD__STRING = INTERACTION_FLOW_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___HAS_VALUE__STEREOTYPE_STRING = INTERACTION_FLOW_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___IS_STEREOTYPE_APPLIED__STEREOTYPE = INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___IS_STEREOTYPE_REQUIRED__STEREOTYPE = INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___REMOVE_KEYWORD__STRING = INTERACTION_FLOW_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___SET_VALUE__STEREOTYPE_STRING_OBJECT = INTERACTION_FLOW_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___UNAPPLY_STEREOTYPE__STEREOTYPE = INTERACTION_FLOW_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___ALL_OWNED_ELEMENTS = INTERACTION_FLOW_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___MUST_BE_OWNED = INTERACTION_FLOW_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___CREATE_DEPENDENCY__NAMEDELEMENT = INTERACTION_FLOW_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___CREATE_USAGE__NAMEDELEMENT = INTERACTION_FLOW_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_LABEL = INTERACTION_FLOW_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_LABEL__BOOLEAN = INTERACTION_FLOW_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___ALL_NAMESPACES = INTERACTION_FLOW_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___ALL_OWNING_PACKAGES = INTERACTION_FLOW_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INTERACTION_FLOW_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_NAMESPACE = INTERACTION_FLOW_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_QUALIFIED_NAME = INTERACTION_FLOW_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___SEPARATOR = INTERACTION_FLOW_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_CLIENT_DEPENDENCY__STRING = INTERACTION_FLOW_ELEMENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = INTERACTION_FLOW_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___CREATE_NAME_EXPRESSION__STRING_TYPE = INTERACTION_FLOW_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___CREATE_OWNED_COMMENT = INTERACTION_FLOW_ELEMENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION___CREATE__ECLASS = INTERACTION_FLOW_ELEMENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Port Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ViewComponentPartImpl <em>View Component Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ViewComponentPartImpl
	 * @see IFML.Core.impl.CorePackageImpl#getViewComponentPart()
	 * @generated
	 */
	int VIEW_COMPONENT_PART = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__ID = INTERACTION_FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__CONSTRAINTS = INTERACTION_FLOW_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__ANNOTATIONS = INTERACTION_FLOW_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__EANNOTATIONS = INTERACTION_FLOW_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__OWNED_COMMENT = INTERACTION_FLOW_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__OWNED_ELEMENT = INTERACTION_FLOW_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__OWNER = INTERACTION_FLOW_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__CLIENT_DEPENDENCY = INTERACTION_FLOW_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__NAME = INTERACTION_FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__NAME_EXPRESSION = INTERACTION_FLOW_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__NAMESPACE = INTERACTION_FLOW_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__QUALIFIED_NAME = INTERACTION_FLOW_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__VISIBILITY = INTERACTION_FLOW_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__PARAMETERS = INTERACTION_FLOW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__IN_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>View Component Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_EANNOTATION__STRING = INTERACTION_FLOW_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___ADD_KEYWORD__STRING = INTERACTION_FLOW_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___APPLY_STEREOTYPE__STEREOTYPE = INTERACTION_FLOW_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___CREATE_EANNOTATION__STRING = INTERACTION_FLOW_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___DESTROY = INTERACTION_FLOW_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_KEYWORDS = INTERACTION_FLOW_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_APPLICABLE_STEREOTYPE__STRING = INTERACTION_FLOW_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_APPLICABLE_STEREOTYPES = INTERACTION_FLOW_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_APPLIED_STEREOTYPE__STRING = INTERACTION_FLOW_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_APPLIED_STEREOTYPES = INTERACTION_FLOW_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = INTERACTION_FLOW_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = INTERACTION_FLOW_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_MODEL = INTERACTION_FLOW_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_NEAREST_PACKAGE = INTERACTION_FLOW_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_RELATIONSHIPS = INTERACTION_FLOW_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_REQUIRED_STEREOTYPE__STRING = INTERACTION_FLOW_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_REQUIRED_STEREOTYPES = INTERACTION_FLOW_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_SOURCE_DIRECTED_RELATIONSHIPS = INTERACTION_FLOW_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_STEREOTYPE_APPLICATION__STEREOTYPE = INTERACTION_FLOW_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_STEREOTYPE_APPLICATIONS = INTERACTION_FLOW_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_TARGET_DIRECTED_RELATIONSHIPS = INTERACTION_FLOW_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_VALUE__STEREOTYPE_STRING = INTERACTION_FLOW_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___HAS_KEYWORD__STRING = INTERACTION_FLOW_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___HAS_VALUE__STEREOTYPE_STRING = INTERACTION_FLOW_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___IS_STEREOTYPE_APPLIED__STEREOTYPE = INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___IS_STEREOTYPE_REQUIRED__STEREOTYPE = INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___REMOVE_KEYWORD__STRING = INTERACTION_FLOW_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___SET_VALUE__STEREOTYPE_STRING_OBJECT = INTERACTION_FLOW_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___UNAPPLY_STEREOTYPE__STEREOTYPE = INTERACTION_FLOW_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___ALL_OWNED_ELEMENTS = INTERACTION_FLOW_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___MUST_BE_OWNED = INTERACTION_FLOW_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___CREATE_DEPENDENCY__NAMEDELEMENT = INTERACTION_FLOW_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___CREATE_USAGE__NAMEDELEMENT = INTERACTION_FLOW_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_LABEL = INTERACTION_FLOW_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_LABEL__BOOLEAN = INTERACTION_FLOW_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___ALL_NAMESPACES = INTERACTION_FLOW_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___ALL_OWNING_PACKAGES = INTERACTION_FLOW_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INTERACTION_FLOW_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_NAMESPACE = INTERACTION_FLOW_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_QUALIFIED_NAME = INTERACTION_FLOW_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___SEPARATOR = INTERACTION_FLOW_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_CLIENT_DEPENDENCY__STRING = INTERACTION_FLOW_ELEMENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = INTERACTION_FLOW_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___CREATE_NAME_EXPRESSION__STRING_TYPE = INTERACTION_FLOW_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___CREATE_OWNED_COMMENT = INTERACTION_FLOW_ELEMENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART___CREATE__ECLASS = INTERACTION_FLOW_ELEMENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>View Component Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ContentBindingImpl <em>Content Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ContentBindingImpl
	 * @see IFML.Core.impl.CorePackageImpl#getContentBinding()
	 * @generated
	 */
	int CONTENT_BINDING = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__ID = VIEW_COMPONENT_PART__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__CONSTRAINTS = VIEW_COMPONENT_PART__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__ANNOTATIONS = VIEW_COMPONENT_PART__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__EANNOTATIONS = VIEW_COMPONENT_PART__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__OWNED_COMMENT = VIEW_COMPONENT_PART__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__OWNED_ELEMENT = VIEW_COMPONENT_PART__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__OWNER = VIEW_COMPONENT_PART__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__CLIENT_DEPENDENCY = VIEW_COMPONENT_PART__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__NAME = VIEW_COMPONENT_PART__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__NAME_EXPRESSION = VIEW_COMPONENT_PART__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__NAMESPACE = VIEW_COMPONENT_PART__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__QUALIFIED_NAME = VIEW_COMPONENT_PART__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__VISIBILITY = VIEW_COMPONENT_PART__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__PARAMETERS = VIEW_COMPONENT_PART__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__OUT_INTERACTION_FLOWS = VIEW_COMPONENT_PART__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__IN_INTERACTION_FLOWS = VIEW_COMPONENT_PART__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__VIEW_ELEMENT_EVENTS = VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__ACTIVATION_EXPRESSION = VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__PARENT_VIEW_COMPONENT_PART = VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__SUB_VIEW_COMPONENT_PARTS = VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Uniform Resource Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING__UNIFORM_RESOURCE_IDENTIFIER = VIEW_COMPONENT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Content Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING_FEATURE_COUNT = VIEW_COMPONENT_PART_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_EANNOTATION__STRING = VIEW_COMPONENT_PART___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = VIEW_COMPONENT_PART___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = VIEW_COMPONENT_PART___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___ADD_KEYWORD__STRING = VIEW_COMPONENT_PART___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___APPLY_STEREOTYPE__STEREOTYPE = VIEW_COMPONENT_PART___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___CREATE_EANNOTATION__STRING = VIEW_COMPONENT_PART___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___DESTROY = VIEW_COMPONENT_PART___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_KEYWORDS = VIEW_COMPONENT_PART___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_APPLICABLE_STEREOTYPE__STRING = VIEW_COMPONENT_PART___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_APPLICABLE_STEREOTYPES = VIEW_COMPONENT_PART___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_APPLIED_STEREOTYPE__STRING = VIEW_COMPONENT_PART___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_APPLIED_STEREOTYPES = VIEW_COMPONENT_PART___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = VIEW_COMPONENT_PART___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = VIEW_COMPONENT_PART___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_MODEL = VIEW_COMPONENT_PART___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_NEAREST_PACKAGE = VIEW_COMPONENT_PART___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_RELATIONSHIPS = VIEW_COMPONENT_PART___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_RELATIONSHIPS__ECLASS = VIEW_COMPONENT_PART___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_REQUIRED_STEREOTYPE__STRING = VIEW_COMPONENT_PART___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_REQUIRED_STEREOTYPES = VIEW_COMPONENT_PART___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_SOURCE_DIRECTED_RELATIONSHIPS = VIEW_COMPONENT_PART___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = VIEW_COMPONENT_PART___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_STEREOTYPE_APPLICATION__STEREOTYPE = VIEW_COMPONENT_PART___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_STEREOTYPE_APPLICATIONS = VIEW_COMPONENT_PART___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_TARGET_DIRECTED_RELATIONSHIPS = VIEW_COMPONENT_PART___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = VIEW_COMPONENT_PART___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_VALUE__STEREOTYPE_STRING = VIEW_COMPONENT_PART___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___HAS_KEYWORD__STRING = VIEW_COMPONENT_PART___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___HAS_VALUE__STEREOTYPE_STRING = VIEW_COMPONENT_PART___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = VIEW_COMPONENT_PART___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___IS_STEREOTYPE_APPLIED__STEREOTYPE = VIEW_COMPONENT_PART___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___IS_STEREOTYPE_REQUIRED__STEREOTYPE = VIEW_COMPONENT_PART___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___REMOVE_KEYWORD__STRING = VIEW_COMPONENT_PART___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___SET_VALUE__STEREOTYPE_STRING_OBJECT = VIEW_COMPONENT_PART___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___UNAPPLY_STEREOTYPE__STEREOTYPE = VIEW_COMPONENT_PART___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___ALL_OWNED_ELEMENTS = VIEW_COMPONENT_PART___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___MUST_BE_OWNED = VIEW_COMPONENT_PART___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = VIEW_COMPONENT_PART___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = VIEW_COMPONENT_PART___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = VIEW_COMPONENT_PART___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___CREATE_DEPENDENCY__NAMEDELEMENT = VIEW_COMPONENT_PART___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___CREATE_USAGE__NAMEDELEMENT = VIEW_COMPONENT_PART___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_LABEL = VIEW_COMPONENT_PART___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_LABEL__BOOLEAN = VIEW_COMPONENT_PART___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___ALL_NAMESPACES = VIEW_COMPONENT_PART___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___ALL_OWNING_PACKAGES = VIEW_COMPONENT_PART___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = VIEW_COMPONENT_PART___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_NAMESPACE = VIEW_COMPONENT_PART___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_QUALIFIED_NAME = VIEW_COMPONENT_PART___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___SEPARATOR = VIEW_COMPONENT_PART___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_CLIENT_DEPENDENCY__STRING = VIEW_COMPONENT_PART___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = VIEW_COMPONENT_PART___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___CREATE_NAME_EXPRESSION__STRING_TYPE = VIEW_COMPONENT_PART___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___CREATE_OWNED_COMMENT = VIEW_COMPONENT_PART___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING___CREATE__ECLASS = VIEW_COMPONENT_PART___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Content Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BINDING_OPERATION_COUNT = VIEW_COMPONENT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ViewElementImpl <em>View Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ViewElementImpl
	 * @see IFML.Core.impl.CorePackageImpl#getViewElement()
	 * @generated
	 */
	int VIEW_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__ID = INTERACTION_FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__CONSTRAINTS = INTERACTION_FLOW_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__ANNOTATIONS = INTERACTION_FLOW_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__EANNOTATIONS = INTERACTION_FLOW_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__OWNED_COMMENT = INTERACTION_FLOW_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__OWNED_ELEMENT = INTERACTION_FLOW_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__OWNER = INTERACTION_FLOW_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__CLIENT_DEPENDENCY = INTERACTION_FLOW_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__NAME = INTERACTION_FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__NAME_EXPRESSION = INTERACTION_FLOW_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__NAMESPACE = INTERACTION_FLOW_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__QUALIFIED_NAME = INTERACTION_FLOW_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__VISIBILITY = INTERACTION_FLOW_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__PARAMETERS = INTERACTION_FLOW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__IN_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__VIEW_ELEMENT_EVENTS = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__ACTIVATION_EXPRESSION = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__VIEW_CONTAINER = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_EANNOTATION__STRING = INTERACTION_FLOW_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___ADD_KEYWORD__STRING = INTERACTION_FLOW_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE = INTERACTION_FLOW_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___CREATE_EANNOTATION__STRING = INTERACTION_FLOW_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___DESTROY = INTERACTION_FLOW_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_KEYWORDS = INTERACTION_FLOW_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING = INTERACTION_FLOW_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_APPLICABLE_STEREOTYPES = INTERACTION_FLOW_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_APPLIED_STEREOTYPE__STRING = INTERACTION_FLOW_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_APPLIED_STEREOTYPES = INTERACTION_FLOW_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = INTERACTION_FLOW_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = INTERACTION_FLOW_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_MODEL = INTERACTION_FLOW_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_NEAREST_PACKAGE = INTERACTION_FLOW_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_RELATIONSHIPS = INTERACTION_FLOW_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING = INTERACTION_FLOW_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_REQUIRED_STEREOTYPES = INTERACTION_FLOW_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = INTERACTION_FLOW_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = INTERACTION_FLOW_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_STEREOTYPE_APPLICATIONS = INTERACTION_FLOW_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS = INTERACTION_FLOW_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_VALUE__STEREOTYPE_STRING = INTERACTION_FLOW_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___HAS_KEYWORD__STRING = INTERACTION_FLOW_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___HAS_VALUE__STEREOTYPE_STRING = INTERACTION_FLOW_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___REMOVE_KEYWORD__STRING = INTERACTION_FLOW_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = INTERACTION_FLOW_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE = INTERACTION_FLOW_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___ALL_OWNED_ELEMENTS = INTERACTION_FLOW_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___MUST_BE_OWNED = INTERACTION_FLOW_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT = INTERACTION_FLOW_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___CREATE_USAGE__NAMEDELEMENT = INTERACTION_FLOW_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_LABEL = INTERACTION_FLOW_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_LABEL__BOOLEAN = INTERACTION_FLOW_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___ALL_NAMESPACES = INTERACTION_FLOW_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___ALL_OWNING_PACKAGES = INTERACTION_FLOW_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INTERACTION_FLOW_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_NAMESPACE = INTERACTION_FLOW_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_QUALIFIED_NAME = INTERACTION_FLOW_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___SEPARATOR = INTERACTION_FLOW_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_CLIENT_DEPENDENCY__STRING = INTERACTION_FLOW_ELEMENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = INTERACTION_FLOW_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE = INTERACTION_FLOW_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___CREATE_OWNED_COMMENT = INTERACTION_FLOW_ELEMENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT___CREATE__ECLASS = INTERACTION_FLOW_ELEMENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.DynamicBehaviorImpl <em>Dynamic Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.DynamicBehaviorImpl
	 * @see IFML.Core.impl.CorePackageImpl#getDynamicBehavior()
	 * @generated
	 */
	int DYNAMIC_BEHAVIOR = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__ID = CONTENT_BINDING__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__CONSTRAINTS = CONTENT_BINDING__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__ANNOTATIONS = CONTENT_BINDING__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__EANNOTATIONS = CONTENT_BINDING__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__OWNED_COMMENT = CONTENT_BINDING__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__OWNED_ELEMENT = CONTENT_BINDING__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__OWNER = CONTENT_BINDING__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__CLIENT_DEPENDENCY = CONTENT_BINDING__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__NAME = CONTENT_BINDING__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__NAME_EXPRESSION = CONTENT_BINDING__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__NAMESPACE = CONTENT_BINDING__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__QUALIFIED_NAME = CONTENT_BINDING__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__VISIBILITY = CONTENT_BINDING__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__PARAMETERS = CONTENT_BINDING__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__OUT_INTERACTION_FLOWS = CONTENT_BINDING__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__IN_INTERACTION_FLOWS = CONTENT_BINDING__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__VIEW_ELEMENT_EVENTS = CONTENT_BINDING__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__ACTIVATION_EXPRESSION = CONTENT_BINDING__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__PARENT_VIEW_COMPONENT_PART = CONTENT_BINDING__PARENT_VIEW_COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__SUB_VIEW_COMPONENT_PARTS = CONTENT_BINDING__SUB_VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Uniform Resource Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__UNIFORM_RESOURCE_IDENTIFIER = CONTENT_BINDING__UNIFORM_RESOURCE_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Behavioral Feature Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE_CONCEPT = CONTENT_BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behavior Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR__BEHAVIOR_CONCEPT = CONTENT_BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dynamic Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR_FEATURE_COUNT = CONTENT_BINDING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_EANNOTATION__STRING = CONTENT_BINDING___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = CONTENT_BINDING___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = CONTENT_BINDING___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___ADD_KEYWORD__STRING = CONTENT_BINDING___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___APPLY_STEREOTYPE__STEREOTYPE = CONTENT_BINDING___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___CREATE_EANNOTATION__STRING = CONTENT_BINDING___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___DESTROY = CONTENT_BINDING___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_KEYWORDS = CONTENT_BINDING___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_APPLICABLE_STEREOTYPE__STRING = CONTENT_BINDING___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_APPLICABLE_STEREOTYPES = CONTENT_BINDING___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_APPLIED_STEREOTYPE__STRING = CONTENT_BINDING___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_APPLIED_STEREOTYPES = CONTENT_BINDING___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = CONTENT_BINDING___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = CONTENT_BINDING___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_MODEL = CONTENT_BINDING___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_NEAREST_PACKAGE = CONTENT_BINDING___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_RELATIONSHIPS = CONTENT_BINDING___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_RELATIONSHIPS__ECLASS = CONTENT_BINDING___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_REQUIRED_STEREOTYPE__STRING = CONTENT_BINDING___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_REQUIRED_STEREOTYPES = CONTENT_BINDING___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_SOURCE_DIRECTED_RELATIONSHIPS = CONTENT_BINDING___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = CONTENT_BINDING___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_STEREOTYPE_APPLICATION__STEREOTYPE = CONTENT_BINDING___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_STEREOTYPE_APPLICATIONS = CONTENT_BINDING___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_TARGET_DIRECTED_RELATIONSHIPS = CONTENT_BINDING___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = CONTENT_BINDING___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_VALUE__STEREOTYPE_STRING = CONTENT_BINDING___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___HAS_KEYWORD__STRING = CONTENT_BINDING___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___HAS_VALUE__STEREOTYPE_STRING = CONTENT_BINDING___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = CONTENT_BINDING___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___IS_STEREOTYPE_APPLIED__STEREOTYPE = CONTENT_BINDING___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___IS_STEREOTYPE_REQUIRED__STEREOTYPE = CONTENT_BINDING___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___REMOVE_KEYWORD__STRING = CONTENT_BINDING___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___SET_VALUE__STEREOTYPE_STRING_OBJECT = CONTENT_BINDING___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___UNAPPLY_STEREOTYPE__STEREOTYPE = CONTENT_BINDING___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___ALL_OWNED_ELEMENTS = CONTENT_BINDING___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___MUST_BE_OWNED = CONTENT_BINDING___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CONTENT_BINDING___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CONTENT_BINDING___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = CONTENT_BINDING___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___CREATE_DEPENDENCY__NAMEDELEMENT = CONTENT_BINDING___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___CREATE_USAGE__NAMEDELEMENT = CONTENT_BINDING___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_LABEL = CONTENT_BINDING___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_LABEL__BOOLEAN = CONTENT_BINDING___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___ALL_NAMESPACES = CONTENT_BINDING___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___ALL_OWNING_PACKAGES = CONTENT_BINDING___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CONTENT_BINDING___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_NAMESPACE = CONTENT_BINDING___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_QUALIFIED_NAME = CONTENT_BINDING___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___SEPARATOR = CONTENT_BINDING___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_CLIENT_DEPENDENCY__STRING = CONTENT_BINDING___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = CONTENT_BINDING___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___CREATE_NAME_EXPRESSION__STRING_TYPE = CONTENT_BINDING___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___CREATE_OWNED_COMMENT = CONTENT_BINDING___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR___CREATE__ECLASS = CONTENT_BINDING___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Dynamic Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOR_OPERATION_COUNT = CONTENT_BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ViewpointImpl <em>Viewpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ViewpointImpl
	 * @see IFML.Core.impl.CorePackageImpl#getViewpoint()
	 * @generated
	 */
	int VIEWPOINT = 11;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__EANNOTATIONS = IFML_NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__OWNED_COMMENT = IFML_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__OWNED_ELEMENT = IFML_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__OWNER = IFML_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__CLIENT_DEPENDENCY = IFML_NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__NAME = IFML_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__NAME_EXPRESSION = IFML_NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__NAMESPACE = IFML_NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__QUALIFIED_NAME = IFML_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__VISIBILITY = IFML_NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Interaction Flow Model Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__INTERACTION_FLOW_MODEL_ELEMENTS = IFML_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT__CONTEXT = IFML_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Viewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_FEATURE_COUNT = IFML_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_EANNOTATION__STRING = IFML_NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___ADD_KEYWORD__STRING = IFML_NAMED_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___APPLY_STEREOTYPE__STEREOTYPE = IFML_NAMED_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___CREATE_EANNOTATION__STRING = IFML_NAMED_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___DESTROY = IFML_NAMED_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_KEYWORDS = IFML_NAMED_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_APPLICABLE_STEREOTYPE__STRING = IFML_NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_APPLICABLE_STEREOTYPES = IFML_NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_APPLIED_STEREOTYPE__STRING = IFML_NAMED_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_APPLIED_STEREOTYPES = IFML_NAMED_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = IFML_NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = IFML_NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_MODEL = IFML_NAMED_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_NEAREST_PACKAGE = IFML_NAMED_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_RELATIONSHIPS = IFML_NAMED_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_RELATIONSHIPS__ECLASS = IFML_NAMED_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_REQUIRED_STEREOTYPE__STRING = IFML_NAMED_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_REQUIRED_STEREOTYPES = IFML_NAMED_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_SOURCE_DIRECTED_RELATIONSHIPS = IFML_NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = IFML_NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = IFML_NAMED_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_STEREOTYPE_APPLICATIONS = IFML_NAMED_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_TARGET_DIRECTED_RELATIONSHIPS = IFML_NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = IFML_NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_VALUE__STEREOTYPE_STRING = IFML_NAMED_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___HAS_KEYWORD__STRING = IFML_NAMED_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___HAS_VALUE__STEREOTYPE_STRING = IFML_NAMED_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = IFML_NAMED_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___IS_STEREOTYPE_APPLIED__STEREOTYPE = IFML_NAMED_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = IFML_NAMED_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___REMOVE_KEYWORD__STRING = IFML_NAMED_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___SET_VALUE__STEREOTYPE_STRING_OBJECT = IFML_NAMED_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___UNAPPLY_STEREOTYPE__STEREOTYPE = IFML_NAMED_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___ALL_OWNED_ELEMENTS = IFML_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___MUST_BE_OWNED = IFML_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___CREATE_DEPENDENCY__NAMEDELEMENT = IFML_NAMED_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___CREATE_USAGE__NAMEDELEMENT = IFML_NAMED_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_LABEL = IFML_NAMED_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_LABEL__BOOLEAN = IFML_NAMED_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___ALL_NAMESPACES = IFML_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___ALL_OWNING_PACKAGES = IFML_NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = IFML_NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_NAMESPACE = IFML_NAMED_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_QUALIFIED_NAME = IFML_NAMED_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___SEPARATOR = IFML_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_CLIENT_DEPENDENCY__STRING = IFML_NAMED_ELEMENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = IFML_NAMED_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___CREATE_NAME_EXPRESSION__STRING_TYPE = IFML_NAMED_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___CREATE_OWNED_COMMENT = IFML_NAMED_ELEMENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT___CREATE__ECLASS = IFML_NAMED_ELEMENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Viewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWPOINT_OPERATION_COUNT = IFML_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.DataFlowImpl
	 * @see IFML.Core.impl.CorePackageImpl#getDataFlow()
	 * @generated
	 */
	int DATA_FLOW = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__ID = INTERACTION_FLOW__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__CONSTRAINTS = INTERACTION_FLOW__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__ANNOTATIONS = INTERACTION_FLOW__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Parameter Binding Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__PARAMETER_BINDING_GROUP = INTERACTION_FLOW__PARAMETER_BINDING_GROUP;

	/**
	 * The feature id for the '<em><b>Source Interaction Flow Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Interaction Flow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__TARGET_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW__TARGET_INTERACTION_FLOW_ELEMENT;

	/**
	 * The number of structural features of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_FEATURE_COUNT = INTERACTION_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_OPERATION_COUNT = INTERACTION_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ViewContainerImpl <em>View Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ViewContainerImpl
	 * @see IFML.Core.impl.CorePackageImpl#getViewContainer()
	 * @generated
	 */
	int VIEW_CONTAINER = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__ID = VIEW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__CONSTRAINTS = VIEW_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__ANNOTATIONS = VIEW_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__EANNOTATIONS = VIEW_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__OWNED_COMMENT = VIEW_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__OWNED_ELEMENT = VIEW_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__OWNER = VIEW_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__CLIENT_DEPENDENCY = VIEW_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__NAME = VIEW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__NAME_EXPRESSION = VIEW_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__NAMESPACE = VIEW_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__QUALIFIED_NAME = VIEW_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__VISIBILITY = VIEW_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__PARAMETERS = VIEW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__OUT_INTERACTION_FLOWS = VIEW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__IN_INTERACTION_FLOWS = VIEW_ELEMENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__VIEW_ELEMENT_EVENTS = VIEW_ELEMENT__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__ACTIVATION_EXPRESSION = VIEW_ELEMENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__VIEW_CONTAINER = VIEW_ELEMENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>Is Landmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__IS_LANDMARK = VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__IS_DEFAULT = VIEW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__IS_XOR = VIEW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__VIEW_ELEMENTS = VIEW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__ACTIONS = VIEW_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>View Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_EANNOTATION__STRING = VIEW_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = VIEW_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = VIEW_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___ADD_KEYWORD__STRING = VIEW_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___APPLY_STEREOTYPE__STEREOTYPE = VIEW_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___CREATE_EANNOTATION__STRING = VIEW_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___DESTROY = VIEW_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_KEYWORDS = VIEW_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_APPLICABLE_STEREOTYPE__STRING = VIEW_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_APPLICABLE_STEREOTYPES = VIEW_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_APPLIED_STEREOTYPE__STRING = VIEW_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_APPLIED_STEREOTYPES = VIEW_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = VIEW_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = VIEW_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_MODEL = VIEW_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_NEAREST_PACKAGE = VIEW_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_RELATIONSHIPS = VIEW_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_RELATIONSHIPS__ECLASS = VIEW_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_REQUIRED_STEREOTYPE__STRING = VIEW_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_REQUIRED_STEREOTYPES = VIEW_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_SOURCE_DIRECTED_RELATIONSHIPS = VIEW_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = VIEW_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_STEREOTYPE_APPLICATION__STEREOTYPE = VIEW_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_STEREOTYPE_APPLICATIONS = VIEW_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_TARGET_DIRECTED_RELATIONSHIPS = VIEW_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = VIEW_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_VALUE__STEREOTYPE_STRING = VIEW_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___HAS_KEYWORD__STRING = VIEW_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___HAS_VALUE__STEREOTYPE_STRING = VIEW_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = VIEW_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___IS_STEREOTYPE_APPLIED__STEREOTYPE = VIEW_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___IS_STEREOTYPE_REQUIRED__STEREOTYPE = VIEW_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___REMOVE_KEYWORD__STRING = VIEW_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___SET_VALUE__STEREOTYPE_STRING_OBJECT = VIEW_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___UNAPPLY_STEREOTYPE__STEREOTYPE = VIEW_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___ALL_OWNED_ELEMENTS = VIEW_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___MUST_BE_OWNED = VIEW_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = VIEW_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = VIEW_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = VIEW_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___CREATE_DEPENDENCY__NAMEDELEMENT = VIEW_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___CREATE_USAGE__NAMEDELEMENT = VIEW_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_LABEL = VIEW_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_LABEL__BOOLEAN = VIEW_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___ALL_NAMESPACES = VIEW_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___ALL_OWNING_PACKAGES = VIEW_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = VIEW_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_NAMESPACE = VIEW_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_QUALIFIED_NAME = VIEW_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___SEPARATOR = VIEW_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_CLIENT_DEPENDENCY__STRING = VIEW_ELEMENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = VIEW_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___CREATE_NAME_EXPRESSION__STRING_TYPE = VIEW_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___CREATE_OWNED_COMMENT = VIEW_ELEMENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER___CREATE__ECLASS = VIEW_ELEMENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>View Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER_OPERATION_COUNT = VIEW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.BooleanExpressionImpl
	 * @see IFML.Core.impl.CorePackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__CONSTRAINTS = EXPRESSION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__LANGUAGE = EXPRESSION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__BODY = EXPRESSION__BODY;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ActivationExpressionImpl <em>Activation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ActivationExpressionImpl
	 * @see IFML.Core.impl.CorePackageImpl#getActivationExpression()
	 * @generated
	 */
	int ACTIVATION_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_EXPRESSION__ID = BOOLEAN_EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_EXPRESSION__CONSTRAINTS = BOOLEAN_EXPRESSION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_EXPRESSION__ANNOTATIONS = BOOLEAN_EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_EXPRESSION__LANGUAGE = BOOLEAN_EXPRESSION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_EXPRESSION__BODY = BOOLEAN_EXPRESSION__BODY;

	/**
	 * The number of structural features of the '<em>Activation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_EXPRESSION_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_EXPRESSION_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.InteractionFlowModelImpl <em>Interaction Flow Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.InteractionFlowModelImpl
	 * @see IFML.Core.impl.CorePackageImpl#getInteractionFlowModel()
	 * @generated
	 */
	int INTERACTION_FLOW_MODEL = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL__CONSTRAINTS = ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL__ANNOTATIONS = ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Interaction Flow Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interaction Flow Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interaction Flow Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ContextDimensionImpl <em>Context Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ContextDimensionImpl
	 * @see IFML.Core.impl.CorePackageImpl#getContextDimension()
	 * @generated
	 */
	int CONTEXT_DIMENSION = 17;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION__EANNOTATIONS = IFML_NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION__OWNED_COMMENT = IFML_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION__OWNED_ELEMENT = IFML_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION__OWNER = IFML_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION__CLIENT_DEPENDENCY = IFML_NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION__NAME = IFML_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION__NAME_EXPRESSION = IFML_NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION__NAMESPACE = IFML_NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION__QUALIFIED_NAME = IFML_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION__VISIBILITY = IFML_NAMED_ELEMENT__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Context Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION_FEATURE_COUNT = IFML_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_EANNOTATION__STRING = IFML_NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___ADD_KEYWORD__STRING = IFML_NAMED_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___APPLY_STEREOTYPE__STEREOTYPE = IFML_NAMED_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___CREATE_EANNOTATION__STRING = IFML_NAMED_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___DESTROY = IFML_NAMED_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_KEYWORDS = IFML_NAMED_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_APPLICABLE_STEREOTYPE__STRING = IFML_NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_APPLICABLE_STEREOTYPES = IFML_NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_APPLIED_STEREOTYPE__STRING = IFML_NAMED_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_APPLIED_STEREOTYPES = IFML_NAMED_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = IFML_NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = IFML_NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_MODEL = IFML_NAMED_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_NEAREST_PACKAGE = IFML_NAMED_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_RELATIONSHIPS = IFML_NAMED_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_RELATIONSHIPS__ECLASS = IFML_NAMED_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_REQUIRED_STEREOTYPE__STRING = IFML_NAMED_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_REQUIRED_STEREOTYPES = IFML_NAMED_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_SOURCE_DIRECTED_RELATIONSHIPS = IFML_NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = IFML_NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_STEREOTYPE_APPLICATION__STEREOTYPE = IFML_NAMED_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_STEREOTYPE_APPLICATIONS = IFML_NAMED_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_TARGET_DIRECTED_RELATIONSHIPS = IFML_NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = IFML_NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_VALUE__STEREOTYPE_STRING = IFML_NAMED_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___HAS_KEYWORD__STRING = IFML_NAMED_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___HAS_VALUE__STEREOTYPE_STRING = IFML_NAMED_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = IFML_NAMED_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___IS_STEREOTYPE_APPLIED__STEREOTYPE = IFML_NAMED_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___IS_STEREOTYPE_REQUIRED__STEREOTYPE = IFML_NAMED_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___REMOVE_KEYWORD__STRING = IFML_NAMED_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___SET_VALUE__STEREOTYPE_STRING_OBJECT = IFML_NAMED_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___UNAPPLY_STEREOTYPE__STEREOTYPE = IFML_NAMED_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___ALL_OWNED_ELEMENTS = IFML_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___MUST_BE_OWNED = IFML_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___CREATE_DEPENDENCY__NAMEDELEMENT = IFML_NAMED_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___CREATE_USAGE__NAMEDELEMENT = IFML_NAMED_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_LABEL = IFML_NAMED_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_LABEL__BOOLEAN = IFML_NAMED_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___ALL_NAMESPACES = IFML_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___ALL_OWNING_PACKAGES = IFML_NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = IFML_NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_NAMESPACE = IFML_NAMED_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_QUALIFIED_NAME = IFML_NAMED_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___SEPARATOR = IFML_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_CLIENT_DEPENDENCY__STRING = IFML_NAMED_ELEMENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = IFML_NAMED_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___CREATE_NAME_EXPRESSION__STRING_TYPE = IFML_NAMED_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___CREATE_OWNED_COMMENT = IFML_NAMED_ELEMENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION___CREATE__ECLASS = IFML_NAMED_ELEMENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Context Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DIMENSION_OPERATION_COUNT = IFML_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.IFMLModelImpl <em>IFML Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.IFMLModelImpl
	 * @see IFML.Core.impl.CorePackageImpl#getIFMLModel()
	 * @generated
	 */
	int IFML_MODEL = 18;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL__EANNOTATIONS = IFML_NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL__OWNED_COMMENT = IFML_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL__OWNED_ELEMENT = IFML_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL__OWNER = IFML_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL__CLIENT_DEPENDENCY = IFML_NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL__NAME = IFML_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL__NAME_EXPRESSION = IFML_NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL__NAMESPACE = IFML_NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL__QUALIFIED_NAME = IFML_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL__VISIBILITY = IFML_NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Interaction Flow Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL__INTERACTION_FLOW_MODEL = IFML_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL__DOMAIN_MODEL = IFML_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interaction Flow Model Viewpoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL__INTERACTION_FLOW_MODEL_VIEWPOINT = IFML_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>IFML Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL_FEATURE_COUNT = IFML_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_EANNOTATION__STRING = IFML_NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___ADD_KEYWORD__STRING = IFML_NAMED_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___APPLY_STEREOTYPE__STEREOTYPE = IFML_NAMED_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___CREATE_EANNOTATION__STRING = IFML_NAMED_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___DESTROY = IFML_NAMED_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_KEYWORDS = IFML_NAMED_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_APPLICABLE_STEREOTYPE__STRING = IFML_NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_APPLICABLE_STEREOTYPES = IFML_NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_APPLIED_STEREOTYPE__STRING = IFML_NAMED_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_APPLIED_STEREOTYPES = IFML_NAMED_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = IFML_NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = IFML_NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_MODEL = IFML_NAMED_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_NEAREST_PACKAGE = IFML_NAMED_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_RELATIONSHIPS = IFML_NAMED_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_RELATIONSHIPS__ECLASS = IFML_NAMED_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_REQUIRED_STEREOTYPE__STRING = IFML_NAMED_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_REQUIRED_STEREOTYPES = IFML_NAMED_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_SOURCE_DIRECTED_RELATIONSHIPS = IFML_NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = IFML_NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_STEREOTYPE_APPLICATION__STEREOTYPE = IFML_NAMED_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_STEREOTYPE_APPLICATIONS = IFML_NAMED_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_TARGET_DIRECTED_RELATIONSHIPS = IFML_NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = IFML_NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_VALUE__STEREOTYPE_STRING = IFML_NAMED_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___HAS_KEYWORD__STRING = IFML_NAMED_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___HAS_VALUE__STEREOTYPE_STRING = IFML_NAMED_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = IFML_NAMED_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___IS_STEREOTYPE_APPLIED__STEREOTYPE = IFML_NAMED_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___IS_STEREOTYPE_REQUIRED__STEREOTYPE = IFML_NAMED_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___REMOVE_KEYWORD__STRING = IFML_NAMED_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___SET_VALUE__STEREOTYPE_STRING_OBJECT = IFML_NAMED_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___UNAPPLY_STEREOTYPE__STEREOTYPE = IFML_NAMED_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___ALL_OWNED_ELEMENTS = IFML_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___MUST_BE_OWNED = IFML_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___CREATE_DEPENDENCY__NAMEDELEMENT = IFML_NAMED_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___CREATE_USAGE__NAMEDELEMENT = IFML_NAMED_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_LABEL = IFML_NAMED_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_LABEL__BOOLEAN = IFML_NAMED_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___ALL_NAMESPACES = IFML_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___ALL_OWNING_PACKAGES = IFML_NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = IFML_NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_NAMESPACE = IFML_NAMED_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_QUALIFIED_NAME = IFML_NAMED_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___SEPARATOR = IFML_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_CLIENT_DEPENDENCY__STRING = IFML_NAMED_ELEMENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = IFML_NAMED_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___CREATE_NAME_EXPRESSION__STRING_TYPE = IFML_NAMED_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___CREATE_OWNED_COMMENT = IFML_NAMED_ELEMENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL___CREATE__ECLASS = IFML_NAMED_ELEMENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>IFML Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODEL_OPERATION_COUNT = IFML_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ModularizationElementImpl <em>Modularization Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ModularizationElementImpl
	 * @see IFML.Core.impl.CorePackageImpl#getModularizationElement()
	 * @generated
	 */
	int MODULARIZATION_ELEMENT = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT__ID = INTERACTION_FLOW_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT__CONSTRAINTS = INTERACTION_FLOW_MODEL_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT__ANNOTATIONS = INTERACTION_FLOW_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT__EANNOTATIONS = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT__OWNED_COMMENT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT__OWNED_ELEMENT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT__OWNER = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT__CLIENT_DEPENDENCY = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT__NAME = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT__NAME_EXPRESSION = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT__NAMESPACE = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT__QUALIFIED_NAME = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT__VISIBILITY = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Module Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT__MODULE_PACKAGE = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Modularization Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_EANNOTATION__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___ADD_KEYWORD__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___CREATE_EANNOTATION__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___DESTROY = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_KEYWORDS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_APPLICABLE_STEREOTYPES = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_APPLIED_STEREOTYPE__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_APPLIED_STEREOTYPES = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_MODEL = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_NEAREST_PACKAGE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_RELATIONSHIPS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_REQUIRED_STEREOTYPES = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_STEREOTYPE_APPLICATIONS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_VALUE__STEREOTYPE_STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___HAS_KEYWORD__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___HAS_VALUE__STEREOTYPE_STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___REMOVE_KEYWORD__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___ALL_OWNED_ELEMENTS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___MUST_BE_OWNED = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___CREATE_USAGE__NAMEDELEMENT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_LABEL = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_LABEL__BOOLEAN = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___ALL_NAMESPACES = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___ALL_OWNING_PACKAGES = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_NAMESPACE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_QUALIFIED_NAME = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___SEPARATOR = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 49;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_CLIENT_DEPENDENCY__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 50;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 51;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 52;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___CREATE_OWNED_COMMENT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 53;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT___CREATE__ECLASS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 54;

	/**
	 * The number of operations of the '<em>Modularization Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZATION_ELEMENT_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 55;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ModuleDefinitionImpl <em>Module Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ModuleDefinitionImpl
	 * @see IFML.Core.impl.CorePackageImpl#getModuleDefinition()
	 * @generated
	 */
	int MODULE_DEFINITION = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__ID = MODULARIZATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__CONSTRAINTS = MODULARIZATION_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__ANNOTATIONS = MODULARIZATION_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__EANNOTATIONS = MODULARIZATION_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__OWNED_COMMENT = MODULARIZATION_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__OWNED_ELEMENT = MODULARIZATION_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__OWNER = MODULARIZATION_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__CLIENT_DEPENDENCY = MODULARIZATION_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__NAME = MODULARIZATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__NAME_EXPRESSION = MODULARIZATION_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__NAMESPACE = MODULARIZATION_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__QUALIFIED_NAME = MODULARIZATION_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__VISIBILITY = MODULARIZATION_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Module Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__MODULE_PACKAGE = MODULARIZATION_ELEMENT__MODULE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__INPUT_PORTS = MODULARIZATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__OUTPUT_PORTS = MODULARIZATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interaction Flow Model Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT = MODULARIZATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__MODULES = MODULARIZATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Activity Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__ACTIVITY_CONCEPT = MODULARIZATION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Module Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION_FEATURE_COUNT = MODULARIZATION_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_EANNOTATION__STRING = MODULARIZATION_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = MODULARIZATION_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = MODULARIZATION_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___ADD_KEYWORD__STRING = MODULARIZATION_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___APPLY_STEREOTYPE__STEREOTYPE = MODULARIZATION_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___CREATE_EANNOTATION__STRING = MODULARIZATION_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___DESTROY = MODULARIZATION_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_KEYWORDS = MODULARIZATION_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_APPLICABLE_STEREOTYPE__STRING = MODULARIZATION_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_APPLICABLE_STEREOTYPES = MODULARIZATION_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_APPLIED_STEREOTYPE__STRING = MODULARIZATION_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_APPLIED_STEREOTYPES = MODULARIZATION_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = MODULARIZATION_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = MODULARIZATION_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_MODEL = MODULARIZATION_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_NEAREST_PACKAGE = MODULARIZATION_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_RELATIONSHIPS = MODULARIZATION_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_RELATIONSHIPS__ECLASS = MODULARIZATION_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_REQUIRED_STEREOTYPE__STRING = MODULARIZATION_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_REQUIRED_STEREOTYPES = MODULARIZATION_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_SOURCE_DIRECTED_RELATIONSHIPS = MODULARIZATION_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = MODULARIZATION_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_STEREOTYPE_APPLICATION__STEREOTYPE = MODULARIZATION_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_STEREOTYPE_APPLICATIONS = MODULARIZATION_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_TARGET_DIRECTED_RELATIONSHIPS = MODULARIZATION_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = MODULARIZATION_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_VALUE__STEREOTYPE_STRING = MODULARIZATION_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___HAS_KEYWORD__STRING = MODULARIZATION_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___HAS_VALUE__STEREOTYPE_STRING = MODULARIZATION_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = MODULARIZATION_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___IS_STEREOTYPE_APPLIED__STEREOTYPE = MODULARIZATION_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___IS_STEREOTYPE_REQUIRED__STEREOTYPE = MODULARIZATION_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___REMOVE_KEYWORD__STRING = MODULARIZATION_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___SET_VALUE__STEREOTYPE_STRING_OBJECT = MODULARIZATION_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___UNAPPLY_STEREOTYPE__STEREOTYPE = MODULARIZATION_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___ALL_OWNED_ELEMENTS = MODULARIZATION_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___MUST_BE_OWNED = MODULARIZATION_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = MODULARIZATION_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = MODULARIZATION_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = MODULARIZATION_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___CREATE_DEPENDENCY__NAMEDELEMENT = MODULARIZATION_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___CREATE_USAGE__NAMEDELEMENT = MODULARIZATION_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_LABEL = MODULARIZATION_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_LABEL__BOOLEAN = MODULARIZATION_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___ALL_NAMESPACES = MODULARIZATION_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___ALL_OWNING_PACKAGES = MODULARIZATION_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = MODULARIZATION_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_NAMESPACE = MODULARIZATION_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_QUALIFIED_NAME = MODULARIZATION_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___SEPARATOR = MODULARIZATION_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_CLIENT_DEPENDENCY__STRING = MODULARIZATION_ELEMENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = MODULARIZATION_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___CREATE_NAME_EXPRESSION__STRING_TYPE = MODULARIZATION_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___CREATE_OWNED_COMMENT = MODULARIZATION_ELEMENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION___CREATE__ECLASS = MODULARIZATION_ELEMENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Module Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION_OPERATION_COUNT = MODULARIZATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.IFMLActionImpl <em>IFML Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.IFMLActionImpl
	 * @see IFML.Core.impl.CorePackageImpl#getIFMLAction()
	 * @generated
	 */
	int IFML_ACTION = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__ID = INTERACTION_FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__CONSTRAINTS = INTERACTION_FLOW_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__ANNOTATIONS = INTERACTION_FLOW_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__EANNOTATIONS = INTERACTION_FLOW_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__OWNED_COMMENT = INTERACTION_FLOW_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__OWNED_ELEMENT = INTERACTION_FLOW_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__OWNER = INTERACTION_FLOW_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__CLIENT_DEPENDENCY = INTERACTION_FLOW_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__NAME = INTERACTION_FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__NAME_EXPRESSION = INTERACTION_FLOW_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__NAMESPACE = INTERACTION_FLOW_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__QUALIFIED_NAME = INTERACTION_FLOW_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__VISIBILITY = INTERACTION_FLOW_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__PARAMETERS = INTERACTION_FLOW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__IN_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Action Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__ACTION_EVENTS = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dynamic Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__DYNAMIC_BEHAVIOR = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION__VIEW_CONTAINER = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>IFML Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_EANNOTATION__STRING = INTERACTION_FLOW_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___ADD_KEYWORD__STRING = INTERACTION_FLOW_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___APPLY_STEREOTYPE__STEREOTYPE = INTERACTION_FLOW_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___CREATE_EANNOTATION__STRING = INTERACTION_FLOW_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___DESTROY = INTERACTION_FLOW_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_KEYWORDS = INTERACTION_FLOW_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_APPLICABLE_STEREOTYPE__STRING = INTERACTION_FLOW_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_APPLICABLE_STEREOTYPES = INTERACTION_FLOW_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_APPLIED_STEREOTYPE__STRING = INTERACTION_FLOW_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_APPLIED_STEREOTYPES = INTERACTION_FLOW_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = INTERACTION_FLOW_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = INTERACTION_FLOW_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_MODEL = INTERACTION_FLOW_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_NEAREST_PACKAGE = INTERACTION_FLOW_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_RELATIONSHIPS = INTERACTION_FLOW_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_REQUIRED_STEREOTYPE__STRING = INTERACTION_FLOW_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_REQUIRED_STEREOTYPES = INTERACTION_FLOW_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS = INTERACTION_FLOW_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_STEREOTYPE_APPLICATION__STEREOTYPE = INTERACTION_FLOW_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_STEREOTYPE_APPLICATIONS = INTERACTION_FLOW_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_TARGET_DIRECTED_RELATIONSHIPS = INTERACTION_FLOW_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_VALUE__STEREOTYPE_STRING = INTERACTION_FLOW_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___HAS_KEYWORD__STRING = INTERACTION_FLOW_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___HAS_VALUE__STEREOTYPE_STRING = INTERACTION_FLOW_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___IS_STEREOTYPE_APPLIED__STEREOTYPE = INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___IS_STEREOTYPE_REQUIRED__STEREOTYPE = INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___REMOVE_KEYWORD__STRING = INTERACTION_FLOW_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___SET_VALUE__STEREOTYPE_STRING_OBJECT = INTERACTION_FLOW_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___UNAPPLY_STEREOTYPE__STEREOTYPE = INTERACTION_FLOW_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___ALL_OWNED_ELEMENTS = INTERACTION_FLOW_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___MUST_BE_OWNED = INTERACTION_FLOW_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___CREATE_DEPENDENCY__NAMEDELEMENT = INTERACTION_FLOW_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___CREATE_USAGE__NAMEDELEMENT = INTERACTION_FLOW_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_LABEL = INTERACTION_FLOW_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_LABEL__BOOLEAN = INTERACTION_FLOW_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___ALL_NAMESPACES = INTERACTION_FLOW_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___ALL_OWNING_PACKAGES = INTERACTION_FLOW_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INTERACTION_FLOW_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_NAMESPACE = INTERACTION_FLOW_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_QUALIFIED_NAME = INTERACTION_FLOW_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___SEPARATOR = INTERACTION_FLOW_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_CLIENT_DEPENDENCY__STRING = INTERACTION_FLOW_ELEMENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = INTERACTION_FLOW_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___CREATE_NAME_EXPRESSION__STRING_TYPE = INTERACTION_FLOW_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___CREATE_OWNED_COMMENT = INTERACTION_FLOW_ELEMENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION___CREATE__ECLASS = INTERACTION_FLOW_ELEMENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>IFML Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_ACTION_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.NavigationFlowImpl <em>Navigation Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.NavigationFlowImpl
	 * @see IFML.Core.impl.CorePackageImpl#getNavigationFlow()
	 * @generated
	 */
	int NAVIGATION_FLOW = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FLOW__ID = INTERACTION_FLOW__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FLOW__CONSTRAINTS = INTERACTION_FLOW__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FLOW__ANNOTATIONS = INTERACTION_FLOW__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Parameter Binding Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FLOW__PARAMETER_BINDING_GROUP = INTERACTION_FLOW__PARAMETER_BINDING_GROUP;

	/**
	 * The feature id for the '<em><b>Source Interaction Flow Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Interaction Flow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FLOW__TARGET_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW__TARGET_INTERACTION_FLOW_ELEMENT;

	/**
	 * The number of structural features of the '<em>Navigation Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FLOW_FEATURE_COUNT = INTERACTION_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Navigation Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FLOW_OPERATION_COUNT = INTERACTION_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ParameterBindingGroupImpl <em>Parameter Binding Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ParameterBindingGroupImpl
	 * @see IFML.Core.impl.CorePackageImpl#getParameterBindingGroup()
	 * @generated
	 */
	int PARAMETER_BINDING_GROUP = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_GROUP__ID = INTERACTION_FLOW_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_GROUP__CONSTRAINTS = INTERACTION_FLOW_MODEL_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_GROUP__ANNOTATIONS = INTERACTION_FLOW_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_GROUP__PARAMETER_BINDINGS = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Binding Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_GROUP_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Binding Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_GROUP_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ConstraintImpl
	 * @see IFML.Core.impl.CorePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ID = BOOLEAN_EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINTS = BOOLEAN_EXPRESSION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ANNOTATIONS = BOOLEAN_EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__LANGUAGE = BOOLEAN_EXPRESSION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__BODY = BOOLEAN_EXPRESSION__BODY;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = BOOLEAN_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ViewComponentImpl <em>View Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ViewComponentImpl
	 * @see IFML.Core.impl.CorePackageImpl#getViewComponent()
	 * @generated
	 */
	int VIEW_COMPONENT = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__ID = VIEW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__CONSTRAINTS = VIEW_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__ANNOTATIONS = VIEW_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__EANNOTATIONS = VIEW_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__OWNED_COMMENT = VIEW_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__OWNED_ELEMENT = VIEW_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__OWNER = VIEW_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__CLIENT_DEPENDENCY = VIEW_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__NAME = VIEW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__NAME_EXPRESSION = VIEW_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__NAMESPACE = VIEW_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__QUALIFIED_NAME = VIEW_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__VISIBILITY = VIEW_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__PARAMETERS = VIEW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__OUT_INTERACTION_FLOWS = VIEW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__IN_INTERACTION_FLOWS = VIEW_ELEMENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__VIEW_ELEMENT_EVENTS = VIEW_ELEMENT__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__ACTIVATION_EXPRESSION = VIEW_ELEMENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__VIEW_CONTAINER = VIEW_ELEMENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__VIEW_COMPONENT_PARTS = VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_EANNOTATION__STRING = VIEW_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = VIEW_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = VIEW_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___ADD_KEYWORD__STRING = VIEW_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___APPLY_STEREOTYPE__STEREOTYPE = VIEW_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___CREATE_EANNOTATION__STRING = VIEW_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___DESTROY = VIEW_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_KEYWORDS = VIEW_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_APPLICABLE_STEREOTYPE__STRING = VIEW_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_APPLICABLE_STEREOTYPES = VIEW_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_APPLIED_STEREOTYPE__STRING = VIEW_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_APPLIED_STEREOTYPES = VIEW_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = VIEW_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = VIEW_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_MODEL = VIEW_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_NEAREST_PACKAGE = VIEW_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_RELATIONSHIPS = VIEW_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_RELATIONSHIPS__ECLASS = VIEW_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_REQUIRED_STEREOTYPE__STRING = VIEW_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_REQUIRED_STEREOTYPES = VIEW_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = VIEW_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = VIEW_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = VIEW_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_STEREOTYPE_APPLICATIONS = VIEW_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_TARGET_DIRECTED_RELATIONSHIPS = VIEW_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = VIEW_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_VALUE__STEREOTYPE_STRING = VIEW_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___HAS_KEYWORD__STRING = VIEW_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___HAS_VALUE__STEREOTYPE_STRING = VIEW_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = VIEW_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = VIEW_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = VIEW_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___REMOVE_KEYWORD__STRING = VIEW_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = VIEW_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___UNAPPLY_STEREOTYPE__STEREOTYPE = VIEW_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___ALL_OWNED_ELEMENTS = VIEW_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___MUST_BE_OWNED = VIEW_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = VIEW_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = VIEW_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = VIEW_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___CREATE_DEPENDENCY__NAMEDELEMENT = VIEW_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___CREATE_USAGE__NAMEDELEMENT = VIEW_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_LABEL = VIEW_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_LABEL__BOOLEAN = VIEW_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___ALL_NAMESPACES = VIEW_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___ALL_OWNING_PACKAGES = VIEW_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = VIEW_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_NAMESPACE = VIEW_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_QUALIFIED_NAME = VIEW_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___SEPARATOR = VIEW_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_CLIENT_DEPENDENCY__STRING = VIEW_ELEMENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = VIEW_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___CREATE_NAME_EXPRESSION__STRING_TYPE = VIEW_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___CREATE_OWNED_COMMENT = VIEW_ELEMENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT___CREATE__ECLASS = VIEW_ELEMENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>View Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_OPERATION_COUNT = VIEW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.IFMLParameterImpl <em>IFML Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.IFMLParameterImpl
	 * @see IFML.Core.impl.CorePackageImpl#getIFMLParameter()
	 * @generated
	 */
	int IFML_PARAMETER = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER__ID = INTERACTION_FLOW_MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER__CONSTRAINTS = INTERACTION_FLOW_MODEL_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER__ANNOTATIONS = INTERACTION_FLOW_MODEL_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER__EANNOTATIONS = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER__OWNED_COMMENT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER__OWNED_ELEMENT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER__OWNER = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER__CLIENT_DEPENDENCY = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER__NAME = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER__NAME_EXPRESSION = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER__NAMESPACE = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER__QUALIFIED_NAME = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER__VISIBILITY = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER__TYPE = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER__DIRECTION = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER__DEFAULT_VALUE = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>IFML Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_EANNOTATION__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___ADD_KEYWORD__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___APPLY_STEREOTYPE__STEREOTYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___CREATE_EANNOTATION__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___DESTROY = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_KEYWORDS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_APPLICABLE_STEREOTYPE__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_APPLICABLE_STEREOTYPES = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_APPLIED_STEREOTYPE__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_APPLIED_STEREOTYPES = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_MODEL = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_NEAREST_PACKAGE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_RELATIONSHIPS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_REQUIRED_STEREOTYPE__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_REQUIRED_STEREOTYPES = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_STEREOTYPE_APPLICATION__STEREOTYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_STEREOTYPE_APPLICATIONS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_VALUE__STEREOTYPE_STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___HAS_KEYWORD__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___HAS_VALUE__STEREOTYPE_STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___IS_STEREOTYPE_APPLIED__STEREOTYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___IS_STEREOTYPE_REQUIRED__STEREOTYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___REMOVE_KEYWORD__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___SET_VALUE__STEREOTYPE_STRING_OBJECT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___UNAPPLY_STEREOTYPE__STEREOTYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___ALL_OWNED_ELEMENTS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___MUST_BE_OWNED = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___CREATE_DEPENDENCY__NAMEDELEMENT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___CREATE_USAGE__NAMEDELEMENT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_LABEL = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_LABEL__BOOLEAN = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___ALL_NAMESPACES = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___ALL_OWNING_PACKAGES = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_NAMESPACE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_QUALIFIED_NAME = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___SEPARATOR = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 49;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_CLIENT_DEPENDENCY__STRING = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 50;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 51;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___CREATE_NAME_EXPRESSION__STRING_TYPE = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 52;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___CREATE_OWNED_COMMENT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 53;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER___CREATE__ECLASS = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 54;

	/**
	 * The number of operations of the '<em>IFML Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PARAMETER_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 55;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.DataBindingImpl <em>Data Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.DataBindingImpl
	 * @see IFML.Core.impl.CorePackageImpl#getDataBinding()
	 * @generated
	 */
	int DATA_BINDING = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__ID = CONTENT_BINDING__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__CONSTRAINTS = CONTENT_BINDING__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__ANNOTATIONS = CONTENT_BINDING__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__EANNOTATIONS = CONTENT_BINDING__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__OWNED_COMMENT = CONTENT_BINDING__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__OWNED_ELEMENT = CONTENT_BINDING__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__OWNER = CONTENT_BINDING__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__CLIENT_DEPENDENCY = CONTENT_BINDING__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__NAME = CONTENT_BINDING__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__NAME_EXPRESSION = CONTENT_BINDING__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__NAMESPACE = CONTENT_BINDING__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__QUALIFIED_NAME = CONTENT_BINDING__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__VISIBILITY = CONTENT_BINDING__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__PARAMETERS = CONTENT_BINDING__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__OUT_INTERACTION_FLOWS = CONTENT_BINDING__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__IN_INTERACTION_FLOWS = CONTENT_BINDING__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__VIEW_ELEMENT_EVENTS = CONTENT_BINDING__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__ACTIVATION_EXPRESSION = CONTENT_BINDING__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__PARENT_VIEW_COMPONENT_PART = CONTENT_BINDING__PARENT_VIEW_COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__SUB_VIEW_COMPONENT_PARTS = CONTENT_BINDING__SUB_VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Uniform Resource Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__UNIFORM_RESOURCE_IDENTIFIER = CONTENT_BINDING__UNIFORM_RESOURCE_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Conditional Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__CONDITIONAL_EXPRESSION = CONTENT_BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visualization Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__VISUALIZATION_ATTRIBUTE = CONTENT_BINDING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Context Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__DATA_CONTEXT_VARIABLES = CONTENT_BINDING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Domain Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING__DOMAIN_CONCEPT = CONTENT_BINDING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING_FEATURE_COUNT = CONTENT_BINDING_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_EANNOTATION__STRING = CONTENT_BINDING___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = CONTENT_BINDING___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = CONTENT_BINDING___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___ADD_KEYWORD__STRING = CONTENT_BINDING___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___APPLY_STEREOTYPE__STEREOTYPE = CONTENT_BINDING___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___CREATE_EANNOTATION__STRING = CONTENT_BINDING___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___DESTROY = CONTENT_BINDING___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_KEYWORDS = CONTENT_BINDING___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_APPLICABLE_STEREOTYPE__STRING = CONTENT_BINDING___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_APPLICABLE_STEREOTYPES = CONTENT_BINDING___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_APPLIED_STEREOTYPE__STRING = CONTENT_BINDING___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_APPLIED_STEREOTYPES = CONTENT_BINDING___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = CONTENT_BINDING___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = CONTENT_BINDING___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_MODEL = CONTENT_BINDING___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_NEAREST_PACKAGE = CONTENT_BINDING___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_RELATIONSHIPS = CONTENT_BINDING___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_RELATIONSHIPS__ECLASS = CONTENT_BINDING___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_REQUIRED_STEREOTYPE__STRING = CONTENT_BINDING___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_REQUIRED_STEREOTYPES = CONTENT_BINDING___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_SOURCE_DIRECTED_RELATIONSHIPS = CONTENT_BINDING___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = CONTENT_BINDING___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_STEREOTYPE_APPLICATION__STEREOTYPE = CONTENT_BINDING___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_STEREOTYPE_APPLICATIONS = CONTENT_BINDING___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_TARGET_DIRECTED_RELATIONSHIPS = CONTENT_BINDING___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = CONTENT_BINDING___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_VALUE__STEREOTYPE_STRING = CONTENT_BINDING___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___HAS_KEYWORD__STRING = CONTENT_BINDING___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___HAS_VALUE__STEREOTYPE_STRING = CONTENT_BINDING___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = CONTENT_BINDING___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___IS_STEREOTYPE_APPLIED__STEREOTYPE = CONTENT_BINDING___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___IS_STEREOTYPE_REQUIRED__STEREOTYPE = CONTENT_BINDING___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___REMOVE_KEYWORD__STRING = CONTENT_BINDING___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___SET_VALUE__STEREOTYPE_STRING_OBJECT = CONTENT_BINDING___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___UNAPPLY_STEREOTYPE__STEREOTYPE = CONTENT_BINDING___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___ALL_OWNED_ELEMENTS = CONTENT_BINDING___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___MUST_BE_OWNED = CONTENT_BINDING___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CONTENT_BINDING___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CONTENT_BINDING___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = CONTENT_BINDING___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___CREATE_DEPENDENCY__NAMEDELEMENT = CONTENT_BINDING___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___CREATE_USAGE__NAMEDELEMENT = CONTENT_BINDING___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_LABEL = CONTENT_BINDING___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_LABEL__BOOLEAN = CONTENT_BINDING___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___ALL_NAMESPACES = CONTENT_BINDING___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___ALL_OWNING_PACKAGES = CONTENT_BINDING___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CONTENT_BINDING___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_NAMESPACE = CONTENT_BINDING___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_QUALIFIED_NAME = CONTENT_BINDING___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___SEPARATOR = CONTENT_BINDING___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_CLIENT_DEPENDENCY__STRING = CONTENT_BINDING___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = CONTENT_BINDING___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___CREATE_NAME_EXPRESSION__STRING_TYPE = CONTENT_BINDING___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___CREATE_OWNED_COMMENT = CONTENT_BINDING___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING___CREATE__ECLASS = CONTENT_BINDING___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Data Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BINDING_OPERATION_COUNT = CONTENT_BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ConditionalExpressionImpl
	 * @see IFML.Core.impl.CorePackageImpl#getConditionalExpression()
	 * @generated
	 */
	int CONDITIONAL_EXPRESSION = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__CONSTRAINTS = EXPRESSION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__ANNOTATIONS = EXPRESSION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__LANGUAGE = EXPRESSION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__BODY = EXPRESSION__BODY;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__EANNOTATIONS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__OWNED_COMMENT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__OWNED_ELEMENT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__OWNER = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__CLIENT_DEPENDENCY = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__NAME = EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__NAME_EXPRESSION = EXPRESSION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__NAMESPACE = EXPRESSION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__QUALIFIED_NAME = EXPRESSION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__VISIBILITY = EXPRESSION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__PARAMETERS = EXPRESSION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__OUT_INTERACTION_FLOWS = EXPRESSION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__IN_INTERACTION_FLOWS = EXPRESSION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__VIEW_ELEMENT_EVENTS = EXPRESSION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__ACTIVATION_EXPRESSION = EXPRESSION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__PARENT_VIEW_COMPONENT_PART = EXPRESSION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__SUB_VIEW_COMPONENT_PARTS = EXPRESSION_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 17;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_EANNOTATION__STRING = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = EXPRESSION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___ADD_KEYWORD__STRING = EXPRESSION_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___APPLY_STEREOTYPE__STEREOTYPE = EXPRESSION_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___CREATE_EANNOTATION__STRING = EXPRESSION_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___DESTROY = EXPRESSION_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_KEYWORDS = EXPRESSION_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_APPLICABLE_STEREOTYPE__STRING = EXPRESSION_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_APPLICABLE_STEREOTYPES = EXPRESSION_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_APPLIED_STEREOTYPE__STRING = EXPRESSION_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_APPLIED_STEREOTYPES = EXPRESSION_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = EXPRESSION_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = EXPRESSION_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_MODEL = EXPRESSION_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_NEAREST_PACKAGE = EXPRESSION_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_RELATIONSHIPS = EXPRESSION_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_RELATIONSHIPS__ECLASS = EXPRESSION_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_REQUIRED_STEREOTYPE__STRING = EXPRESSION_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_REQUIRED_STEREOTYPES = EXPRESSION_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_SOURCE_DIRECTED_RELATIONSHIPS = EXPRESSION_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = EXPRESSION_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_STEREOTYPE_APPLICATION__STEREOTYPE = EXPRESSION_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_STEREOTYPE_APPLICATIONS = EXPRESSION_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_TARGET_DIRECTED_RELATIONSHIPS = EXPRESSION_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = EXPRESSION_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_VALUE__STEREOTYPE_STRING = EXPRESSION_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___HAS_KEYWORD__STRING = EXPRESSION_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___HAS_VALUE__STEREOTYPE_STRING = EXPRESSION_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = EXPRESSION_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___IS_STEREOTYPE_APPLIED__STEREOTYPE = EXPRESSION_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___IS_STEREOTYPE_REQUIRED__STEREOTYPE = EXPRESSION_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___REMOVE_KEYWORD__STRING = EXPRESSION_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___SET_VALUE__STEREOTYPE_STRING_OBJECT = EXPRESSION_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___UNAPPLY_STEREOTYPE__STEREOTYPE = EXPRESSION_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___ALL_OWNED_ELEMENTS = EXPRESSION_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___MUST_BE_OWNED = EXPRESSION_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = EXPRESSION_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = EXPRESSION_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = EXPRESSION_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___CREATE_DEPENDENCY__NAMEDELEMENT = EXPRESSION_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___CREATE_USAGE__NAMEDELEMENT = EXPRESSION_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_LABEL = EXPRESSION_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_LABEL__BOOLEAN = EXPRESSION_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___ALL_NAMESPACES = EXPRESSION_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___ALL_OWNING_PACKAGES = EXPRESSION_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = EXPRESSION_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_NAMESPACE = EXPRESSION_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_QUALIFIED_NAME = EXPRESSION_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___SEPARATOR = EXPRESSION_OPERATION_COUNT + 49;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_CLIENT_DEPENDENCY__STRING = EXPRESSION_OPERATION_COUNT + 50;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = EXPRESSION_OPERATION_COUNT + 51;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___CREATE_NAME_EXPRESSION__STRING_TYPE = EXPRESSION_OPERATION_COUNT + 52;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___CREATE_OWNED_COMMENT = EXPRESSION_OPERATION_COUNT + 53;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION___CREATE__ECLASS = EXPRESSION_OPERATION_COUNT + 54;

	/**
	 * The number of operations of the '<em>Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 55;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ContextImpl
	 * @see IFML.Core.impl.CorePackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONSTRAINTS = ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ANNOTATIONS = ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Context Dimensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTEXT_DIMENSIONS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTEXT_VARIABLES = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.VisualizationAttributeImpl <em>Visualization Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.VisualizationAttributeImpl
	 * @see IFML.Core.impl.CorePackageImpl#getVisualizationAttribute()
	 * @generated
	 */
	int VISUALIZATION_ATTRIBUTE = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__ID = VIEW_COMPONENT_PART__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__CONSTRAINTS = VIEW_COMPONENT_PART__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__ANNOTATIONS = VIEW_COMPONENT_PART__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__EANNOTATIONS = VIEW_COMPONENT_PART__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__OWNED_COMMENT = VIEW_COMPONENT_PART__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__OWNED_ELEMENT = VIEW_COMPONENT_PART__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__OWNER = VIEW_COMPONENT_PART__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__CLIENT_DEPENDENCY = VIEW_COMPONENT_PART__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__NAME = VIEW_COMPONENT_PART__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__NAME_EXPRESSION = VIEW_COMPONENT_PART__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__NAMESPACE = VIEW_COMPONENT_PART__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__QUALIFIED_NAME = VIEW_COMPONENT_PART__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__VISIBILITY = VIEW_COMPONENT_PART__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__PARAMETERS = VIEW_COMPONENT_PART__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__OUT_INTERACTION_FLOWS = VIEW_COMPONENT_PART__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__IN_INTERACTION_FLOWS = VIEW_COMPONENT_PART__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__VIEW_ELEMENT_EVENTS = VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__ACTIVATION_EXPRESSION = VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__PARENT_VIEW_COMPONENT_PART = VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__SUB_VIEW_COMPONENT_PARTS = VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Feature Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE__FEATURE_CONCEPT = VIEW_COMPONENT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Visualization Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE_FEATURE_COUNT = VIEW_COMPONENT_PART_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_EANNOTATION__STRING = VIEW_COMPONENT_PART___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = VIEW_COMPONENT_PART___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = VIEW_COMPONENT_PART___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___ADD_KEYWORD__STRING = VIEW_COMPONENT_PART___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___APPLY_STEREOTYPE__STEREOTYPE = VIEW_COMPONENT_PART___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___CREATE_EANNOTATION__STRING = VIEW_COMPONENT_PART___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___DESTROY = VIEW_COMPONENT_PART___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_KEYWORDS = VIEW_COMPONENT_PART___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_APPLICABLE_STEREOTYPE__STRING = VIEW_COMPONENT_PART___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_APPLICABLE_STEREOTYPES = VIEW_COMPONENT_PART___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_APPLIED_STEREOTYPE__STRING = VIEW_COMPONENT_PART___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_APPLIED_STEREOTYPES = VIEW_COMPONENT_PART___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = VIEW_COMPONENT_PART___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = VIEW_COMPONENT_PART___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_MODEL = VIEW_COMPONENT_PART___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_NEAREST_PACKAGE = VIEW_COMPONENT_PART___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_RELATIONSHIPS = VIEW_COMPONENT_PART___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_RELATIONSHIPS__ECLASS = VIEW_COMPONENT_PART___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_REQUIRED_STEREOTYPE__STRING = VIEW_COMPONENT_PART___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_REQUIRED_STEREOTYPES = VIEW_COMPONENT_PART___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_SOURCE_DIRECTED_RELATIONSHIPS = VIEW_COMPONENT_PART___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = VIEW_COMPONENT_PART___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = VIEW_COMPONENT_PART___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_STEREOTYPE_APPLICATIONS = VIEW_COMPONENT_PART___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_TARGET_DIRECTED_RELATIONSHIPS = VIEW_COMPONENT_PART___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = VIEW_COMPONENT_PART___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_VALUE__STEREOTYPE_STRING = VIEW_COMPONENT_PART___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___HAS_KEYWORD__STRING = VIEW_COMPONENT_PART___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___HAS_VALUE__STEREOTYPE_STRING = VIEW_COMPONENT_PART___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = VIEW_COMPONENT_PART___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___IS_STEREOTYPE_APPLIED__STEREOTYPE = VIEW_COMPONENT_PART___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = VIEW_COMPONENT_PART___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___REMOVE_KEYWORD__STRING = VIEW_COMPONENT_PART___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___SET_VALUE__STEREOTYPE_STRING_OBJECT = VIEW_COMPONENT_PART___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___UNAPPLY_STEREOTYPE__STEREOTYPE = VIEW_COMPONENT_PART___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___ALL_OWNED_ELEMENTS = VIEW_COMPONENT_PART___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___MUST_BE_OWNED = VIEW_COMPONENT_PART___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = VIEW_COMPONENT_PART___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = VIEW_COMPONENT_PART___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = VIEW_COMPONENT_PART___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___CREATE_DEPENDENCY__NAMEDELEMENT = VIEW_COMPONENT_PART___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___CREATE_USAGE__NAMEDELEMENT = VIEW_COMPONENT_PART___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_LABEL = VIEW_COMPONENT_PART___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_LABEL__BOOLEAN = VIEW_COMPONENT_PART___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___ALL_NAMESPACES = VIEW_COMPONENT_PART___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___ALL_OWNING_PACKAGES = VIEW_COMPONENT_PART___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = VIEW_COMPONENT_PART___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_NAMESPACE = VIEW_COMPONENT_PART___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_QUALIFIED_NAME = VIEW_COMPONENT_PART___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___SEPARATOR = VIEW_COMPONENT_PART___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_CLIENT_DEPENDENCY__STRING = VIEW_COMPONENT_PART___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = VIEW_COMPONENT_PART___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___CREATE_NAME_EXPRESSION__STRING_TYPE = VIEW_COMPONENT_PART___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___CREATE_OWNED_COMMENT = VIEW_COMPONENT_PART___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE___CREATE__ECLASS = VIEW_COMPONENT_PART___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Visualization Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_ATTRIBUTE_OPERATION_COUNT = VIEW_COMPONENT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ViewElementEventImpl <em>View Element Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ViewElementEventImpl
	 * @see IFML.Core.impl.CorePackageImpl#getViewElementEvent()
	 * @generated
	 */
	int VIEW_ELEMENT_EVENT = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__ID = CATCHING_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__CONSTRAINTS = CATCHING_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__ANNOTATIONS = CATCHING_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__EANNOTATIONS = CATCHING_EVENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__OWNED_COMMENT = CATCHING_EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__OWNED_ELEMENT = CATCHING_EVENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__OWNER = CATCHING_EVENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__CLIENT_DEPENDENCY = CATCHING_EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__NAME = CATCHING_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__NAME_EXPRESSION = CATCHING_EVENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__NAMESPACE = CATCHING_EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__QUALIFIED_NAME = CATCHING_EVENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__VISIBILITY = CATCHING_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__PARAMETERS = CATCHING_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__OUT_INTERACTION_FLOWS = CATCHING_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__IN_INTERACTION_FLOWS = CATCHING_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__ACTIVATION_EXPRESSION = CATCHING_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__INTERACTION_FLOW_EXPRESSION = CATCHING_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__VIEW_ELEMENT = CATCHING_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Element Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT_FEATURE_COUNT = CATCHING_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_EANNOTATION__STRING = CATCHING_EVENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = CATCHING_EVENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = CATCHING_EVENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___ADD_KEYWORD__STRING = CATCHING_EVENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___APPLY_STEREOTYPE__STEREOTYPE = CATCHING_EVENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___CREATE_EANNOTATION__STRING = CATCHING_EVENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___DESTROY = CATCHING_EVENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_KEYWORDS = CATCHING_EVENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_APPLICABLE_STEREOTYPE__STRING = CATCHING_EVENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_APPLICABLE_STEREOTYPES = CATCHING_EVENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_APPLIED_STEREOTYPE__STRING = CATCHING_EVENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_APPLIED_STEREOTYPES = CATCHING_EVENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = CATCHING_EVENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = CATCHING_EVENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_MODEL = CATCHING_EVENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_NEAREST_PACKAGE = CATCHING_EVENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_RELATIONSHIPS = CATCHING_EVENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_RELATIONSHIPS__ECLASS = CATCHING_EVENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_REQUIRED_STEREOTYPE__STRING = CATCHING_EVENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_REQUIRED_STEREOTYPES = CATCHING_EVENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = CATCHING_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = CATCHING_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = CATCHING_EVENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_STEREOTYPE_APPLICATIONS = CATCHING_EVENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS = CATCHING_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = CATCHING_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_VALUE__STEREOTYPE_STRING = CATCHING_EVENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___HAS_KEYWORD__STRING = CATCHING_EVENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___HAS_VALUE__STEREOTYPE_STRING = CATCHING_EVENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = CATCHING_EVENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = CATCHING_EVENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = CATCHING_EVENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___REMOVE_KEYWORD__STRING = CATCHING_EVENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = CATCHING_EVENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___UNAPPLY_STEREOTYPE__STEREOTYPE = CATCHING_EVENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___ALL_OWNED_ELEMENTS = CATCHING_EVENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___MUST_BE_OWNED = CATCHING_EVENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CATCHING_EVENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CATCHING_EVENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = CATCHING_EVENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___CREATE_DEPENDENCY__NAMEDELEMENT = CATCHING_EVENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___CREATE_USAGE__NAMEDELEMENT = CATCHING_EVENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_LABEL = CATCHING_EVENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_LABEL__BOOLEAN = CATCHING_EVENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___ALL_NAMESPACES = CATCHING_EVENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___ALL_OWNING_PACKAGES = CATCHING_EVENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CATCHING_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_NAMESPACE = CATCHING_EVENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_QUALIFIED_NAME = CATCHING_EVENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___SEPARATOR = CATCHING_EVENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_CLIENT_DEPENDENCY__STRING = CATCHING_EVENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = CATCHING_EVENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___CREATE_NAME_EXPRESSION__STRING_TYPE = CATCHING_EVENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___CREATE_OWNED_COMMENT = CATCHING_EVENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT___CREATE__ECLASS = CATCHING_EVENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>View Element Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT_OPERATION_COUNT = CATCHING_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.AnnotationImpl
	 * @see IFML.Core.impl.CorePackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 36;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ModulePackageImpl <em>Module Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ModulePackageImpl
	 * @see IFML.Core.impl.CorePackageImpl#getModulePackage()
	 * @generated
	 */
	int MODULE_PACKAGE = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE__ID = MODULARIZATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE__CONSTRAINTS = MODULARIZATION_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE__ANNOTATIONS = MODULARIZATION_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE__EANNOTATIONS = MODULARIZATION_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE__OWNED_COMMENT = MODULARIZATION_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE__OWNED_ELEMENT = MODULARIZATION_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE__OWNER = MODULARIZATION_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE__CLIENT_DEPENDENCY = MODULARIZATION_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE__NAME = MODULARIZATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE__NAME_EXPRESSION = MODULARIZATION_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE__NAMESPACE = MODULARIZATION_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE__QUALIFIED_NAME = MODULARIZATION_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE__VISIBILITY = MODULARIZATION_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Module Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE__MODULE_PACKAGE = MODULARIZATION_ELEMENT__MODULE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Modularization Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE__MODULARIZATION_ELEMENTS = MODULARIZATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE_FEATURE_COUNT = MODULARIZATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_EANNOTATION__STRING = MODULARIZATION_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = MODULARIZATION_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = MODULARIZATION_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___ADD_KEYWORD__STRING = MODULARIZATION_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___APPLY_STEREOTYPE__STEREOTYPE = MODULARIZATION_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___CREATE_EANNOTATION__STRING = MODULARIZATION_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___DESTROY = MODULARIZATION_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_KEYWORDS = MODULARIZATION_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_APPLICABLE_STEREOTYPE__STRING = MODULARIZATION_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_APPLICABLE_STEREOTYPES = MODULARIZATION_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_APPLIED_STEREOTYPE__STRING = MODULARIZATION_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_APPLIED_STEREOTYPES = MODULARIZATION_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = MODULARIZATION_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = MODULARIZATION_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_MODEL = MODULARIZATION_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_NEAREST_PACKAGE = MODULARIZATION_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_RELATIONSHIPS = MODULARIZATION_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_RELATIONSHIPS__ECLASS = MODULARIZATION_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_REQUIRED_STEREOTYPE__STRING = MODULARIZATION_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_REQUIRED_STEREOTYPES = MODULARIZATION_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_SOURCE_DIRECTED_RELATIONSHIPS = MODULARIZATION_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = MODULARIZATION_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = MODULARIZATION_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_STEREOTYPE_APPLICATIONS = MODULARIZATION_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_TARGET_DIRECTED_RELATIONSHIPS = MODULARIZATION_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = MODULARIZATION_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_VALUE__STEREOTYPE_STRING = MODULARIZATION_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___HAS_KEYWORD__STRING = MODULARIZATION_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___HAS_VALUE__STEREOTYPE_STRING = MODULARIZATION_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = MODULARIZATION_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___IS_STEREOTYPE_APPLIED__STEREOTYPE = MODULARIZATION_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = MODULARIZATION_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___REMOVE_KEYWORD__STRING = MODULARIZATION_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___SET_VALUE__STEREOTYPE_STRING_OBJECT = MODULARIZATION_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___UNAPPLY_STEREOTYPE__STEREOTYPE = MODULARIZATION_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___ALL_OWNED_ELEMENTS = MODULARIZATION_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___MUST_BE_OWNED = MODULARIZATION_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = MODULARIZATION_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = MODULARIZATION_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = MODULARIZATION_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___CREATE_DEPENDENCY__NAMEDELEMENT = MODULARIZATION_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___CREATE_USAGE__NAMEDELEMENT = MODULARIZATION_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_LABEL = MODULARIZATION_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_LABEL__BOOLEAN = MODULARIZATION_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___ALL_NAMESPACES = MODULARIZATION_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___ALL_OWNING_PACKAGES = MODULARIZATION_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = MODULARIZATION_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_NAMESPACE = MODULARIZATION_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_QUALIFIED_NAME = MODULARIZATION_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___SEPARATOR = MODULARIZATION_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_CLIENT_DEPENDENCY__STRING = MODULARIZATION_ELEMENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = MODULARIZATION_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___CREATE_NAME_EXPRESSION__STRING_TYPE = MODULARIZATION_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___CREATE_OWNED_COMMENT = MODULARIZATION_ELEMENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE___CREATE__ECLASS = MODULARIZATION_ELEMENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Module Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PACKAGE_OPERATION_COUNT = MODULARIZATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.IFMLModuleImpl <em>IFML Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.IFMLModuleImpl
	 * @see IFML.Core.impl.CorePackageImpl#getIFMLModule()
	 * @generated
	 */
	int IFML_MODULE = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__ID = INTERACTION_FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__CONSTRAINTS = INTERACTION_FLOW_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__ANNOTATIONS = INTERACTION_FLOW_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__EANNOTATIONS = INTERACTION_FLOW_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__OWNED_COMMENT = INTERACTION_FLOW_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__OWNED_ELEMENT = INTERACTION_FLOW_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__OWNER = INTERACTION_FLOW_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__CLIENT_DEPENDENCY = INTERACTION_FLOW_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__NAME = INTERACTION_FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__NAME_EXPRESSION = INTERACTION_FLOW_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__NAMESPACE = INTERACTION_FLOW_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__QUALIFIED_NAME = INTERACTION_FLOW_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__VISIBILITY = INTERACTION_FLOW_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__PARAMETERS = INTERACTION_FLOW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__IN_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Module Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__MODULE_DEFINITION = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE__PORTS = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IFML Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_EANNOTATION__STRING = INTERACTION_FLOW_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___ADD_KEYWORD__STRING = INTERACTION_FLOW_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___APPLY_STEREOTYPE__STEREOTYPE = INTERACTION_FLOW_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___CREATE_EANNOTATION__STRING = INTERACTION_FLOW_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___DESTROY = INTERACTION_FLOW_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_KEYWORDS = INTERACTION_FLOW_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_APPLICABLE_STEREOTYPE__STRING = INTERACTION_FLOW_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_APPLICABLE_STEREOTYPES = INTERACTION_FLOW_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_APPLIED_STEREOTYPE__STRING = INTERACTION_FLOW_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_APPLIED_STEREOTYPES = INTERACTION_FLOW_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = INTERACTION_FLOW_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = INTERACTION_FLOW_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_MODEL = INTERACTION_FLOW_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_NEAREST_PACKAGE = INTERACTION_FLOW_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_RELATIONSHIPS = INTERACTION_FLOW_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_REQUIRED_STEREOTYPE__STRING = INTERACTION_FLOW_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_REQUIRED_STEREOTYPES = INTERACTION_FLOW_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_SOURCE_DIRECTED_RELATIONSHIPS = INTERACTION_FLOW_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = INTERACTION_FLOW_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_STEREOTYPE_APPLICATIONS = INTERACTION_FLOW_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_TARGET_DIRECTED_RELATIONSHIPS = INTERACTION_FLOW_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_VALUE__STEREOTYPE_STRING = INTERACTION_FLOW_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___HAS_KEYWORD__STRING = INTERACTION_FLOW_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___HAS_VALUE__STEREOTYPE_STRING = INTERACTION_FLOW_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___IS_STEREOTYPE_APPLIED__STEREOTYPE = INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___REMOVE_KEYWORD__STRING = INTERACTION_FLOW_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___SET_VALUE__STEREOTYPE_STRING_OBJECT = INTERACTION_FLOW_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___UNAPPLY_STEREOTYPE__STEREOTYPE = INTERACTION_FLOW_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___ALL_OWNED_ELEMENTS = INTERACTION_FLOW_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___MUST_BE_OWNED = INTERACTION_FLOW_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___CREATE_DEPENDENCY__NAMEDELEMENT = INTERACTION_FLOW_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___CREATE_USAGE__NAMEDELEMENT = INTERACTION_FLOW_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_LABEL = INTERACTION_FLOW_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_LABEL__BOOLEAN = INTERACTION_FLOW_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___ALL_NAMESPACES = INTERACTION_FLOW_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___ALL_OWNING_PACKAGES = INTERACTION_FLOW_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INTERACTION_FLOW_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_NAMESPACE = INTERACTION_FLOW_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_QUALIFIED_NAME = INTERACTION_FLOW_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___SEPARATOR = INTERACTION_FLOW_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_CLIENT_DEPENDENCY__STRING = INTERACTION_FLOW_ELEMENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = INTERACTION_FLOW_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___CREATE_NAME_EXPRESSION__STRING_TYPE = INTERACTION_FLOW_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___CREATE_OWNED_COMMENT = INTERACTION_FLOW_ELEMENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE___CREATE__ECLASS = INTERACTION_FLOW_ELEMENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>IFML Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MODULE_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.IFMLPortImpl <em>IFML Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.IFMLPortImpl
	 * @see IFML.Core.impl.CorePackageImpl#getIFMLPort()
	 * @generated
	 */
	int IFML_PORT = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__ID = INTERACTION_FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__CONSTRAINTS = INTERACTION_FLOW_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__ANNOTATIONS = INTERACTION_FLOW_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__EANNOTATIONS = INTERACTION_FLOW_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__OWNED_COMMENT = INTERACTION_FLOW_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__OWNED_ELEMENT = INTERACTION_FLOW_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__OWNER = INTERACTION_FLOW_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__CLIENT_DEPENDENCY = INTERACTION_FLOW_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__NAME = INTERACTION_FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__NAME_EXPRESSION = INTERACTION_FLOW_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__NAMESPACE = INTERACTION_FLOW_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__QUALIFIED_NAME = INTERACTION_FLOW_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__VISIBILITY = INTERACTION_FLOW_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__PARAMETERS = INTERACTION_FLOW_ELEMENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__IN_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Port Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__PORT_DEFINITION = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT__MODULE = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IFML Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_EANNOTATION__STRING = INTERACTION_FLOW_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___ADD_KEYWORD__STRING = INTERACTION_FLOW_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___APPLY_STEREOTYPE__STEREOTYPE = INTERACTION_FLOW_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___CREATE_EANNOTATION__STRING = INTERACTION_FLOW_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___DESTROY = INTERACTION_FLOW_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_KEYWORDS = INTERACTION_FLOW_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_APPLICABLE_STEREOTYPE__STRING = INTERACTION_FLOW_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_APPLICABLE_STEREOTYPES = INTERACTION_FLOW_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_APPLIED_STEREOTYPE__STRING = INTERACTION_FLOW_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_APPLIED_STEREOTYPES = INTERACTION_FLOW_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = INTERACTION_FLOW_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = INTERACTION_FLOW_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_MODEL = INTERACTION_FLOW_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_NEAREST_PACKAGE = INTERACTION_FLOW_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_RELATIONSHIPS = INTERACTION_FLOW_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_REQUIRED_STEREOTYPE__STRING = INTERACTION_FLOW_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_REQUIRED_STEREOTYPES = INTERACTION_FLOW_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_SOURCE_DIRECTED_RELATIONSHIPS = INTERACTION_FLOW_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = INTERACTION_FLOW_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_STEREOTYPE_APPLICATIONS = INTERACTION_FLOW_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_TARGET_DIRECTED_RELATIONSHIPS = INTERACTION_FLOW_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = INTERACTION_FLOW_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_VALUE__STEREOTYPE_STRING = INTERACTION_FLOW_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___HAS_KEYWORD__STRING = INTERACTION_FLOW_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___HAS_VALUE__STEREOTYPE_STRING = INTERACTION_FLOW_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___IS_STEREOTYPE_APPLIED__STEREOTYPE = INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = INTERACTION_FLOW_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___REMOVE_KEYWORD__STRING = INTERACTION_FLOW_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___SET_VALUE__STEREOTYPE_STRING_OBJECT = INTERACTION_FLOW_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___UNAPPLY_STEREOTYPE__STEREOTYPE = INTERACTION_FLOW_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___ALL_OWNED_ELEMENTS = INTERACTION_FLOW_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___MUST_BE_OWNED = INTERACTION_FLOW_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = INTERACTION_FLOW_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___CREATE_DEPENDENCY__NAMEDELEMENT = INTERACTION_FLOW_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___CREATE_USAGE__NAMEDELEMENT = INTERACTION_FLOW_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_LABEL = INTERACTION_FLOW_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_LABEL__BOOLEAN = INTERACTION_FLOW_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___ALL_NAMESPACES = INTERACTION_FLOW_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___ALL_OWNING_PACKAGES = INTERACTION_FLOW_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = INTERACTION_FLOW_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_NAMESPACE = INTERACTION_FLOW_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_QUALIFIED_NAME = INTERACTION_FLOW_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___SEPARATOR = INTERACTION_FLOW_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_CLIENT_DEPENDENCY__STRING = INTERACTION_FLOW_ELEMENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = INTERACTION_FLOW_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___CREATE_NAME_EXPRESSION__STRING_TYPE = INTERACTION_FLOW_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___CREATE_OWNED_COMMENT = INTERACTION_FLOW_ELEMENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT___CREATE__ECLASS = INTERACTION_FLOW_ELEMENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>IFML Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_PORT_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ThrowingEventImpl <em>Throwing Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ThrowingEventImpl
	 * @see IFML.Core.impl.CorePackageImpl#getThrowingEvent()
	 * @generated
	 */
	int THROWING_EVENT = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__CONSTRAINTS = EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__ANNOTATIONS = EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__EANNOTATIONS = EVENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__OWNED_COMMENT = EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__OWNED_ELEMENT = EVENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__OWNER = EVENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__CLIENT_DEPENDENCY = EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__NAME_EXPRESSION = EVENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__NAMESPACE = EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__QUALIFIED_NAME = EVENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__VISIBILITY = EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__PARAMETERS = EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__OUT_INTERACTION_FLOWS = EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__IN_INTERACTION_FLOWS = EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__ACTIVATION_EXPRESSION = EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__INTERACTION_FLOW_EXPRESSION = EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Throwing Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_EANNOTATION__STRING = EVENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = EVENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = EVENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___ADD_KEYWORD__STRING = EVENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___APPLY_STEREOTYPE__STEREOTYPE = EVENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___CREATE_EANNOTATION__STRING = EVENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___DESTROY = EVENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_KEYWORDS = EVENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_APPLICABLE_STEREOTYPE__STRING = EVENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_APPLICABLE_STEREOTYPES = EVENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_APPLIED_STEREOTYPE__STRING = EVENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_APPLIED_STEREOTYPES = EVENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = EVENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = EVENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_MODEL = EVENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_NEAREST_PACKAGE = EVENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_RELATIONSHIPS = EVENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_RELATIONSHIPS__ECLASS = EVENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_REQUIRED_STEREOTYPE__STRING = EVENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_REQUIRED_STEREOTYPES = EVENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = EVENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_STEREOTYPE_APPLICATIONS = EVENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS = EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_VALUE__STEREOTYPE_STRING = EVENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___HAS_KEYWORD__STRING = EVENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___HAS_VALUE__STEREOTYPE_STRING = EVENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = EVENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = EVENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = EVENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___REMOVE_KEYWORD__STRING = EVENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = EVENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___UNAPPLY_STEREOTYPE__STEREOTYPE = EVENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___ALL_OWNED_ELEMENTS = EVENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___MUST_BE_OWNED = EVENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = EVENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = EVENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = EVENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___CREATE_DEPENDENCY__NAMEDELEMENT = EVENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___CREATE_USAGE__NAMEDELEMENT = EVENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_LABEL = EVENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_LABEL__BOOLEAN = EVENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___ALL_NAMESPACES = EVENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___ALL_OWNING_PACKAGES = EVENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_NAMESPACE = EVENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_QUALIFIED_NAME = EVENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___SEPARATOR = EVENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_CLIENT_DEPENDENCY__STRING = EVENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = EVENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___CREATE_NAME_EXPRESSION__STRING_TYPE = EVENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___CREATE_OWNED_COMMENT = EVENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT___CREATE__ECLASS = EVENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Throwing Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ActivityConceptImpl <em>Activity Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ActivityConceptImpl
	 * @see IFML.Core.impl.CorePackageImpl#getActivityConcept()
	 * @generated
	 */
	int ACTIVITY_CONCEPT = 55;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT__EANNOTATIONS = IFML_NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT__OWNED_COMMENT = IFML_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT__OWNED_ELEMENT = IFML_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT__OWNER = IFML_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT__CLIENT_DEPENDENCY = IFML_NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT__NAME = IFML_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT__NAME_EXPRESSION = IFML_NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT__NAMESPACE = IFML_NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT__QUALIFIED_NAME = IFML_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT__VISIBILITY = IFML_NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Module Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT__MODULE_DEFINITION = IFML_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT_FEATURE_COUNT = IFML_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_EANNOTATION__STRING = IFML_NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___ADD_KEYWORD__STRING = IFML_NAMED_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___APPLY_STEREOTYPE__STEREOTYPE = IFML_NAMED_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___CREATE_EANNOTATION__STRING = IFML_NAMED_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___DESTROY = IFML_NAMED_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_KEYWORDS = IFML_NAMED_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_APPLICABLE_STEREOTYPE__STRING = IFML_NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_APPLICABLE_STEREOTYPES = IFML_NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_APPLIED_STEREOTYPE__STRING = IFML_NAMED_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_APPLIED_STEREOTYPES = IFML_NAMED_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = IFML_NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = IFML_NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_MODEL = IFML_NAMED_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_NEAREST_PACKAGE = IFML_NAMED_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_RELATIONSHIPS = IFML_NAMED_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_RELATIONSHIPS__ECLASS = IFML_NAMED_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_REQUIRED_STEREOTYPE__STRING = IFML_NAMED_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_REQUIRED_STEREOTYPES = IFML_NAMED_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS = IFML_NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = IFML_NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = IFML_NAMED_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_STEREOTYPE_APPLICATIONS = IFML_NAMED_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS = IFML_NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = IFML_NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_VALUE__STEREOTYPE_STRING = IFML_NAMED_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___HAS_KEYWORD__STRING = IFML_NAMED_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___HAS_VALUE__STEREOTYPE_STRING = IFML_NAMED_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = IFML_NAMED_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___IS_STEREOTYPE_APPLIED__STEREOTYPE = IFML_NAMED_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = IFML_NAMED_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___REMOVE_KEYWORD__STRING = IFML_NAMED_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___SET_VALUE__STEREOTYPE_STRING_OBJECT = IFML_NAMED_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___UNAPPLY_STEREOTYPE__STEREOTYPE = IFML_NAMED_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___ALL_OWNED_ELEMENTS = IFML_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___MUST_BE_OWNED = IFML_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___CREATE_DEPENDENCY__NAMEDELEMENT = IFML_NAMED_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___CREATE_USAGE__NAMEDELEMENT = IFML_NAMED_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_LABEL = IFML_NAMED_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_LABEL__BOOLEAN = IFML_NAMED_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___ALL_NAMESPACES = IFML_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___ALL_OWNING_PACKAGES = IFML_NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = IFML_NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_NAMESPACE = IFML_NAMED_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_QUALIFIED_NAME = IFML_NAMED_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___SEPARATOR = IFML_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_CLIENT_DEPENDENCY__STRING = IFML_NAMED_ELEMENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = IFML_NAMED_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___CREATE_NAME_EXPRESSION__STRING_TYPE = IFML_NAMED_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___CREATE_OWNED_COMMENT = IFML_NAMED_ELEMENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT___CREATE__ECLASS = IFML_NAMED_ELEMENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Activity Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONCEPT_OPERATION_COUNT = IFML_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.BPMNActivityConceptImpl <em>BPMN Activity Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.BPMNActivityConceptImpl
	 * @see IFML.Core.impl.CorePackageImpl#getBPMNActivityConcept()
	 * @generated
	 */
	int BPMN_ACTIVITY_CONCEPT = 43;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT__EANNOTATIONS = ACTIVITY_CONCEPT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT__OWNED_COMMENT = ACTIVITY_CONCEPT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT__OWNED_ELEMENT = ACTIVITY_CONCEPT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT__OWNER = ACTIVITY_CONCEPT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT__CLIENT_DEPENDENCY = ACTIVITY_CONCEPT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT__NAME = ACTIVITY_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT__NAME_EXPRESSION = ACTIVITY_CONCEPT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT__NAMESPACE = ACTIVITY_CONCEPT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT__QUALIFIED_NAME = ACTIVITY_CONCEPT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT__VISIBILITY = ACTIVITY_CONCEPT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Module Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT__MODULE_DEFINITION = ACTIVITY_CONCEPT__MODULE_DEFINITION;

	/**
	 * The number of structural features of the '<em>BPMN Activity Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT_FEATURE_COUNT = ACTIVITY_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_EANNOTATION__STRING = ACTIVITY_CONCEPT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = ACTIVITY_CONCEPT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = ACTIVITY_CONCEPT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___ADD_KEYWORD__STRING = ACTIVITY_CONCEPT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___APPLY_STEREOTYPE__STEREOTYPE = ACTIVITY_CONCEPT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___CREATE_EANNOTATION__STRING = ACTIVITY_CONCEPT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___DESTROY = ACTIVITY_CONCEPT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_KEYWORDS = ACTIVITY_CONCEPT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_APPLICABLE_STEREOTYPE__STRING = ACTIVITY_CONCEPT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_APPLICABLE_STEREOTYPES = ACTIVITY_CONCEPT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_APPLIED_STEREOTYPE__STRING = ACTIVITY_CONCEPT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_APPLIED_STEREOTYPES = ACTIVITY_CONCEPT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = ACTIVITY_CONCEPT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = ACTIVITY_CONCEPT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_MODEL = ACTIVITY_CONCEPT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_NEAREST_PACKAGE = ACTIVITY_CONCEPT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_RELATIONSHIPS = ACTIVITY_CONCEPT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_RELATIONSHIPS__ECLASS = ACTIVITY_CONCEPT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_REQUIRED_STEREOTYPE__STRING = ACTIVITY_CONCEPT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_REQUIRED_STEREOTYPES = ACTIVITY_CONCEPT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS = ACTIVITY_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = ACTIVITY_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = ACTIVITY_CONCEPT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_STEREOTYPE_APPLICATIONS = ACTIVITY_CONCEPT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS = ACTIVITY_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = ACTIVITY_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_VALUE__STEREOTYPE_STRING = ACTIVITY_CONCEPT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___HAS_KEYWORD__STRING = ACTIVITY_CONCEPT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___HAS_VALUE__STEREOTYPE_STRING = ACTIVITY_CONCEPT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = ACTIVITY_CONCEPT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___IS_STEREOTYPE_APPLIED__STEREOTYPE = ACTIVITY_CONCEPT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = ACTIVITY_CONCEPT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___REMOVE_KEYWORD__STRING = ACTIVITY_CONCEPT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___SET_VALUE__STEREOTYPE_STRING_OBJECT = ACTIVITY_CONCEPT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___UNAPPLY_STEREOTYPE__STEREOTYPE = ACTIVITY_CONCEPT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___ALL_OWNED_ELEMENTS = ACTIVITY_CONCEPT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___MUST_BE_OWNED = ACTIVITY_CONCEPT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = ACTIVITY_CONCEPT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = ACTIVITY_CONCEPT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = ACTIVITY_CONCEPT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___CREATE_DEPENDENCY__NAMEDELEMENT = ACTIVITY_CONCEPT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___CREATE_USAGE__NAMEDELEMENT = ACTIVITY_CONCEPT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_LABEL = ACTIVITY_CONCEPT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_LABEL__BOOLEAN = ACTIVITY_CONCEPT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___ALL_NAMESPACES = ACTIVITY_CONCEPT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___ALL_OWNING_PACKAGES = ACTIVITY_CONCEPT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = ACTIVITY_CONCEPT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_NAMESPACE = ACTIVITY_CONCEPT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_QUALIFIED_NAME = ACTIVITY_CONCEPT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___SEPARATOR = ACTIVITY_CONCEPT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_CLIENT_DEPENDENCY__STRING = ACTIVITY_CONCEPT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = ACTIVITY_CONCEPT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___CREATE_NAME_EXPRESSION__STRING_TYPE = ACTIVITY_CONCEPT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___CREATE_OWNED_COMMENT = ACTIVITY_CONCEPT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT___CREATE__ECLASS = ACTIVITY_CONCEPT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>BPMN Activity Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ACTIVITY_CONCEPT_OPERATION_COUNT = ACTIVITY_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.ContextVariableImpl <em>Context Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.ContextVariableImpl
	 * @see IFML.Core.impl.CorePackageImpl#getContextVariable()
	 * @generated
	 */
	int CONTEXT_VARIABLE = 44;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE__EANNOTATIONS = IFML_NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE__OWNED_COMMENT = IFML_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE__OWNED_ELEMENT = IFML_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE__OWNER = IFML_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE__CLIENT_DEPENDENCY = IFML_NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE__NAME = IFML_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE__NAME_EXPRESSION = IFML_NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE__NAMESPACE = IFML_NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE__QUALIFIED_NAME = IFML_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE__VISIBILITY = IFML_NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE__CONTEXT = IFML_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE__SCOPE = IFML_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Context Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE_FEATURE_COUNT = IFML_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_EANNOTATION__STRING = IFML_NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___ADD_KEYWORD__STRING = IFML_NAMED_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___APPLY_STEREOTYPE__STEREOTYPE = IFML_NAMED_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___CREATE_EANNOTATION__STRING = IFML_NAMED_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___DESTROY = IFML_NAMED_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_KEYWORDS = IFML_NAMED_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_APPLICABLE_STEREOTYPE__STRING = IFML_NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_APPLICABLE_STEREOTYPES = IFML_NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_APPLIED_STEREOTYPE__STRING = IFML_NAMED_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_APPLIED_STEREOTYPES = IFML_NAMED_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = IFML_NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = IFML_NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_MODEL = IFML_NAMED_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_NEAREST_PACKAGE = IFML_NAMED_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_RELATIONSHIPS = IFML_NAMED_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_RELATIONSHIPS__ECLASS = IFML_NAMED_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_REQUIRED_STEREOTYPE__STRING = IFML_NAMED_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_REQUIRED_STEREOTYPES = IFML_NAMED_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_SOURCE_DIRECTED_RELATIONSHIPS = IFML_NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = IFML_NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = IFML_NAMED_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_STEREOTYPE_APPLICATIONS = IFML_NAMED_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_TARGET_DIRECTED_RELATIONSHIPS = IFML_NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = IFML_NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_VALUE__STEREOTYPE_STRING = IFML_NAMED_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___HAS_KEYWORD__STRING = IFML_NAMED_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___HAS_VALUE__STEREOTYPE_STRING = IFML_NAMED_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = IFML_NAMED_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___IS_STEREOTYPE_APPLIED__STEREOTYPE = IFML_NAMED_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = IFML_NAMED_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___REMOVE_KEYWORD__STRING = IFML_NAMED_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___SET_VALUE__STEREOTYPE_STRING_OBJECT = IFML_NAMED_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___UNAPPLY_STEREOTYPE__STEREOTYPE = IFML_NAMED_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___ALL_OWNED_ELEMENTS = IFML_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___MUST_BE_OWNED = IFML_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___CREATE_DEPENDENCY__NAMEDELEMENT = IFML_NAMED_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___CREATE_USAGE__NAMEDELEMENT = IFML_NAMED_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_LABEL = IFML_NAMED_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_LABEL__BOOLEAN = IFML_NAMED_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___ALL_NAMESPACES = IFML_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___ALL_OWNING_PACKAGES = IFML_NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = IFML_NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_NAMESPACE = IFML_NAMED_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_QUALIFIED_NAME = IFML_NAMED_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___SEPARATOR = IFML_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_CLIENT_DEPENDENCY__STRING = IFML_NAMED_ELEMENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = IFML_NAMED_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___CREATE_NAME_EXPRESSION__STRING_TYPE = IFML_NAMED_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___CREATE_OWNED_COMMENT = IFML_NAMED_ELEMENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE___CREATE__ECLASS = IFML_NAMED_ELEMENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Context Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_VARIABLE_OPERATION_COUNT = IFML_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.SimpleContextVariableImpl <em>Simple Context Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.SimpleContextVariableImpl
	 * @see IFML.Core.impl.CorePackageImpl#getSimpleContextVariable()
	 * @generated
	 */
	int SIMPLE_CONTEXT_VARIABLE = 45;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE__EANNOTATIONS = CONTEXT_VARIABLE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE__OWNED_COMMENT = CONTEXT_VARIABLE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE__OWNED_ELEMENT = CONTEXT_VARIABLE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE__OWNER = CONTEXT_VARIABLE__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE__CLIENT_DEPENDENCY = CONTEXT_VARIABLE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE__NAME = CONTEXT_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE__NAME_EXPRESSION = CONTEXT_VARIABLE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE__NAMESPACE = CONTEXT_VARIABLE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE__QUALIFIED_NAME = CONTEXT_VARIABLE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE__VISIBILITY = CONTEXT_VARIABLE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE__CONTEXT = CONTEXT_VARIABLE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE__SCOPE = CONTEXT_VARIABLE__SCOPE;

	/**
	 * The number of structural features of the '<em>Simple Context Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE_FEATURE_COUNT = CONTEXT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_EANNOTATION__STRING = CONTEXT_VARIABLE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = CONTEXT_VARIABLE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = CONTEXT_VARIABLE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___ADD_KEYWORD__STRING = CONTEXT_VARIABLE___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___APPLY_STEREOTYPE__STEREOTYPE = CONTEXT_VARIABLE___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___CREATE_EANNOTATION__STRING = CONTEXT_VARIABLE___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___DESTROY = CONTEXT_VARIABLE___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_KEYWORDS = CONTEXT_VARIABLE___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_APPLICABLE_STEREOTYPE__STRING = CONTEXT_VARIABLE___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_APPLICABLE_STEREOTYPES = CONTEXT_VARIABLE___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_APPLIED_STEREOTYPE__STRING = CONTEXT_VARIABLE___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_APPLIED_STEREOTYPES = CONTEXT_VARIABLE___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = CONTEXT_VARIABLE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = CONTEXT_VARIABLE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_MODEL = CONTEXT_VARIABLE___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_NEAREST_PACKAGE = CONTEXT_VARIABLE___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_RELATIONSHIPS = CONTEXT_VARIABLE___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_RELATIONSHIPS__ECLASS = CONTEXT_VARIABLE___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_REQUIRED_STEREOTYPE__STRING = CONTEXT_VARIABLE___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_REQUIRED_STEREOTYPES = CONTEXT_VARIABLE___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_SOURCE_DIRECTED_RELATIONSHIPS = CONTEXT_VARIABLE___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = CONTEXT_VARIABLE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = CONTEXT_VARIABLE___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_STEREOTYPE_APPLICATIONS = CONTEXT_VARIABLE___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_TARGET_DIRECTED_RELATIONSHIPS = CONTEXT_VARIABLE___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = CONTEXT_VARIABLE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_VALUE__STEREOTYPE_STRING = CONTEXT_VARIABLE___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___HAS_KEYWORD__STRING = CONTEXT_VARIABLE___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___HAS_VALUE__STEREOTYPE_STRING = CONTEXT_VARIABLE___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = CONTEXT_VARIABLE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___IS_STEREOTYPE_APPLIED__STEREOTYPE = CONTEXT_VARIABLE___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = CONTEXT_VARIABLE___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___REMOVE_KEYWORD__STRING = CONTEXT_VARIABLE___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___SET_VALUE__STEREOTYPE_STRING_OBJECT = CONTEXT_VARIABLE___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___UNAPPLY_STEREOTYPE__STEREOTYPE = CONTEXT_VARIABLE___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___ALL_OWNED_ELEMENTS = CONTEXT_VARIABLE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___MUST_BE_OWNED = CONTEXT_VARIABLE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CONTEXT_VARIABLE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CONTEXT_VARIABLE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = CONTEXT_VARIABLE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___CREATE_DEPENDENCY__NAMEDELEMENT = CONTEXT_VARIABLE___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___CREATE_USAGE__NAMEDELEMENT = CONTEXT_VARIABLE___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_LABEL = CONTEXT_VARIABLE___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_LABEL__BOOLEAN = CONTEXT_VARIABLE___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___ALL_NAMESPACES = CONTEXT_VARIABLE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___ALL_OWNING_PACKAGES = CONTEXT_VARIABLE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CONTEXT_VARIABLE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_NAMESPACE = CONTEXT_VARIABLE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_QUALIFIED_NAME = CONTEXT_VARIABLE___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___SEPARATOR = CONTEXT_VARIABLE___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_CLIENT_DEPENDENCY__STRING = CONTEXT_VARIABLE___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = CONTEXT_VARIABLE___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___CREATE_NAME_EXPRESSION__STRING_TYPE = CONTEXT_VARIABLE___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___CREATE_OWNED_COMMENT = CONTEXT_VARIABLE___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE___CREATE__ECLASS = CONTEXT_VARIABLE___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Simple Context Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONTEXT_VARIABLE_OPERATION_COUNT = CONTEXT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.DataContextVariableImpl <em>Data Context Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.DataContextVariableImpl
	 * @see IFML.Core.impl.CorePackageImpl#getDataContextVariable()
	 * @generated
	 */
	int DATA_CONTEXT_VARIABLE = 46;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE__EANNOTATIONS = CONTEXT_VARIABLE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE__OWNED_COMMENT = CONTEXT_VARIABLE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE__OWNED_ELEMENT = CONTEXT_VARIABLE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE__OWNER = CONTEXT_VARIABLE__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE__CLIENT_DEPENDENCY = CONTEXT_VARIABLE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE__NAME = CONTEXT_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE__NAME_EXPRESSION = CONTEXT_VARIABLE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE__NAMESPACE = CONTEXT_VARIABLE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE__QUALIFIED_NAME = CONTEXT_VARIABLE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE__VISIBILITY = CONTEXT_VARIABLE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE__CONTEXT = CONTEXT_VARIABLE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE__SCOPE = CONTEXT_VARIABLE__SCOPE;

	/**
	 * The feature id for the '<em><b>Data Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE__DATA_BINDING = CONTEXT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Context Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE_FEATURE_COUNT = CONTEXT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_EANNOTATION__STRING = CONTEXT_VARIABLE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = CONTEXT_VARIABLE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = CONTEXT_VARIABLE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___ADD_KEYWORD__STRING = CONTEXT_VARIABLE___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___APPLY_STEREOTYPE__STEREOTYPE = CONTEXT_VARIABLE___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___CREATE_EANNOTATION__STRING = CONTEXT_VARIABLE___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___DESTROY = CONTEXT_VARIABLE___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_KEYWORDS = CONTEXT_VARIABLE___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_APPLICABLE_STEREOTYPE__STRING = CONTEXT_VARIABLE___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_APPLICABLE_STEREOTYPES = CONTEXT_VARIABLE___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_APPLIED_STEREOTYPE__STRING = CONTEXT_VARIABLE___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_APPLIED_STEREOTYPES = CONTEXT_VARIABLE___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = CONTEXT_VARIABLE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = CONTEXT_VARIABLE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_MODEL = CONTEXT_VARIABLE___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_NEAREST_PACKAGE = CONTEXT_VARIABLE___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_RELATIONSHIPS = CONTEXT_VARIABLE___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_RELATIONSHIPS__ECLASS = CONTEXT_VARIABLE___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_REQUIRED_STEREOTYPE__STRING = CONTEXT_VARIABLE___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_REQUIRED_STEREOTYPES = CONTEXT_VARIABLE___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_SOURCE_DIRECTED_RELATIONSHIPS = CONTEXT_VARIABLE___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = CONTEXT_VARIABLE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = CONTEXT_VARIABLE___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_STEREOTYPE_APPLICATIONS = CONTEXT_VARIABLE___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_TARGET_DIRECTED_RELATIONSHIPS = CONTEXT_VARIABLE___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = CONTEXT_VARIABLE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_VALUE__STEREOTYPE_STRING = CONTEXT_VARIABLE___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___HAS_KEYWORD__STRING = CONTEXT_VARIABLE___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___HAS_VALUE__STEREOTYPE_STRING = CONTEXT_VARIABLE___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = CONTEXT_VARIABLE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___IS_STEREOTYPE_APPLIED__STEREOTYPE = CONTEXT_VARIABLE___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = CONTEXT_VARIABLE___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___REMOVE_KEYWORD__STRING = CONTEXT_VARIABLE___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___SET_VALUE__STEREOTYPE_STRING_OBJECT = CONTEXT_VARIABLE___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___UNAPPLY_STEREOTYPE__STEREOTYPE = CONTEXT_VARIABLE___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___ALL_OWNED_ELEMENTS = CONTEXT_VARIABLE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___MUST_BE_OWNED = CONTEXT_VARIABLE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CONTEXT_VARIABLE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CONTEXT_VARIABLE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = CONTEXT_VARIABLE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___CREATE_DEPENDENCY__NAMEDELEMENT = CONTEXT_VARIABLE___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___CREATE_USAGE__NAMEDELEMENT = CONTEXT_VARIABLE___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_LABEL = CONTEXT_VARIABLE___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_LABEL__BOOLEAN = CONTEXT_VARIABLE___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___ALL_NAMESPACES = CONTEXT_VARIABLE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___ALL_OWNING_PACKAGES = CONTEXT_VARIABLE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CONTEXT_VARIABLE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_NAMESPACE = CONTEXT_VARIABLE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_QUALIFIED_NAME = CONTEXT_VARIABLE___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___SEPARATOR = CONTEXT_VARIABLE___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_CLIENT_DEPENDENCY__STRING = CONTEXT_VARIABLE___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = CONTEXT_VARIABLE___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___CREATE_NAME_EXPRESSION__STRING_TYPE = CONTEXT_VARIABLE___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___CREATE_OWNED_COMMENT = CONTEXT_VARIABLE___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE___CREATE__ECLASS = CONTEXT_VARIABLE___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Data Context Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTEXT_VARIABLE_OPERATION_COUNT = CONTEXT_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.DomainElementImpl <em>Domain Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.DomainElementImpl
	 * @see IFML.Core.impl.CorePackageImpl#getDomainElement()
	 * @generated
	 */
	int DOMAIN_ELEMENT = 56;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__EANNOTATIONS = IFML_NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__OWNED_COMMENT = IFML_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__OWNED_ELEMENT = IFML_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__OWNER = IFML_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__CLIENT_DEPENDENCY = IFML_NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__NAME = IFML_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__NAME_EXPRESSION = IFML_NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__NAMESPACE = IFML_NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__QUALIFIED_NAME = IFML_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__VISIBILITY = IFML_NAMED_ELEMENT__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Domain Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT_FEATURE_COUNT = IFML_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_EANNOTATION__STRING = IFML_NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___ADD_KEYWORD__STRING = IFML_NAMED_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE = IFML_NAMED_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___CREATE_EANNOTATION__STRING = IFML_NAMED_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___DESTROY = IFML_NAMED_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_KEYWORDS = IFML_NAMED_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING = IFML_NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_APPLICABLE_STEREOTYPES = IFML_NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_APPLIED_STEREOTYPE__STRING = IFML_NAMED_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_APPLIED_STEREOTYPES = IFML_NAMED_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = IFML_NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = IFML_NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_MODEL = IFML_NAMED_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_NEAREST_PACKAGE = IFML_NAMED_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_RELATIONSHIPS = IFML_NAMED_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_RELATIONSHIPS__ECLASS = IFML_NAMED_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING = IFML_NAMED_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_REQUIRED_STEREOTYPES = IFML_NAMED_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = IFML_NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = IFML_NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = IFML_NAMED_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_STEREOTYPE_APPLICATIONS = IFML_NAMED_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS = IFML_NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = IFML_NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_VALUE__STEREOTYPE_STRING = IFML_NAMED_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___HAS_KEYWORD__STRING = IFML_NAMED_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___HAS_VALUE__STEREOTYPE_STRING = IFML_NAMED_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = IFML_NAMED_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = IFML_NAMED_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = IFML_NAMED_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___REMOVE_KEYWORD__STRING = IFML_NAMED_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = IFML_NAMED_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE = IFML_NAMED_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___ALL_OWNED_ELEMENTS = IFML_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___MUST_BE_OWNED = IFML_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = IFML_NAMED_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT = IFML_NAMED_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___CREATE_USAGE__NAMEDELEMENT = IFML_NAMED_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_LABEL = IFML_NAMED_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_LABEL__BOOLEAN = IFML_NAMED_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___ALL_NAMESPACES = IFML_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___ALL_OWNING_PACKAGES = IFML_NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = IFML_NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_NAMESPACE = IFML_NAMED_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_QUALIFIED_NAME = IFML_NAMED_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___SEPARATOR = IFML_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_CLIENT_DEPENDENCY__STRING = IFML_NAMED_ELEMENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = IFML_NAMED_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE = IFML_NAMED_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___CREATE_OWNED_COMMENT = IFML_NAMED_ELEMENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___CREATE__ECLASS = IFML_NAMED_ELEMENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Domain Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT_OPERATION_COUNT = IFML_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.DomainConceptImpl <em>Domain Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.DomainConceptImpl
	 * @see IFML.Core.impl.CorePackageImpl#getDomainConcept()
	 * @generated
	 */
	int DOMAIN_CONCEPT = 47;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT__EANNOTATIONS = DOMAIN_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT__OWNED_COMMENT = DOMAIN_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT__OWNED_ELEMENT = DOMAIN_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT__OWNER = DOMAIN_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT__CLIENT_DEPENDENCY = DOMAIN_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT__NAME = DOMAIN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT__NAME_EXPRESSION = DOMAIN_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT__NAMESPACE = DOMAIN_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT__QUALIFIED_NAME = DOMAIN_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT__VISIBILITY = DOMAIN_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Data Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT__DATA_BINDING = DOMAIN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT_FEATURE_COUNT = DOMAIN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_EANNOTATION__STRING = DOMAIN_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = DOMAIN_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = DOMAIN_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___ADD_KEYWORD__STRING = DOMAIN_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___APPLY_STEREOTYPE__STEREOTYPE = DOMAIN_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___CREATE_EANNOTATION__STRING = DOMAIN_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___DESTROY = DOMAIN_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_KEYWORDS = DOMAIN_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_APPLICABLE_STEREOTYPE__STRING = DOMAIN_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_APPLICABLE_STEREOTYPES = DOMAIN_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_APPLIED_STEREOTYPE__STRING = DOMAIN_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_APPLIED_STEREOTYPES = DOMAIN_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = DOMAIN_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = DOMAIN_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_MODEL = DOMAIN_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_NEAREST_PACKAGE = DOMAIN_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_RELATIONSHIPS = DOMAIN_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_RELATIONSHIPS__ECLASS = DOMAIN_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_REQUIRED_STEREOTYPE__STRING = DOMAIN_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_REQUIRED_STEREOTYPES = DOMAIN_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS = DOMAIN_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = DOMAIN_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = DOMAIN_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_STEREOTYPE_APPLICATIONS = DOMAIN_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS = DOMAIN_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = DOMAIN_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_VALUE__STEREOTYPE_STRING = DOMAIN_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___HAS_KEYWORD__STRING = DOMAIN_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___HAS_VALUE__STEREOTYPE_STRING = DOMAIN_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = DOMAIN_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___IS_STEREOTYPE_APPLIED__STEREOTYPE = DOMAIN_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = DOMAIN_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___REMOVE_KEYWORD__STRING = DOMAIN_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___SET_VALUE__STEREOTYPE_STRING_OBJECT = DOMAIN_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___UNAPPLY_STEREOTYPE__STEREOTYPE = DOMAIN_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___ALL_OWNED_ELEMENTS = DOMAIN_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___MUST_BE_OWNED = DOMAIN_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = DOMAIN_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = DOMAIN_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = DOMAIN_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___CREATE_DEPENDENCY__NAMEDELEMENT = DOMAIN_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___CREATE_USAGE__NAMEDELEMENT = DOMAIN_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_LABEL = DOMAIN_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_LABEL__BOOLEAN = DOMAIN_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___ALL_NAMESPACES = DOMAIN_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___ALL_OWNING_PACKAGES = DOMAIN_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = DOMAIN_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_NAMESPACE = DOMAIN_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_QUALIFIED_NAME = DOMAIN_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___SEPARATOR = DOMAIN_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_CLIENT_DEPENDENCY__STRING = DOMAIN_ELEMENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = DOMAIN_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___CREATE_NAME_EXPRESSION__STRING_TYPE = DOMAIN_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___CREATE_OWNED_COMMENT = DOMAIN_ELEMENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT___CREATE__ECLASS = DOMAIN_ELEMENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Domain Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CONCEPT_OPERATION_COUNT = DOMAIN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.FeatureConceptImpl <em>Feature Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.FeatureConceptImpl
	 * @see IFML.Core.impl.CorePackageImpl#getFeatureConcept()
	 * @generated
	 */
	int FEATURE_CONCEPT = 48;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT__EANNOTATIONS = DOMAIN_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT__OWNED_COMMENT = DOMAIN_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT__OWNED_ELEMENT = DOMAIN_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT__OWNER = DOMAIN_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT__CLIENT_DEPENDENCY = DOMAIN_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT__NAME = DOMAIN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT__NAME_EXPRESSION = DOMAIN_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT__NAMESPACE = DOMAIN_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT__QUALIFIED_NAME = DOMAIN_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT__VISIBILITY = DOMAIN_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Visualization Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT__VISUALIZATION_ATTRIBUTE = DOMAIN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT_FEATURE_COUNT = DOMAIN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_EANNOTATION__STRING = DOMAIN_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = DOMAIN_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = DOMAIN_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___ADD_KEYWORD__STRING = DOMAIN_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___APPLY_STEREOTYPE__STEREOTYPE = DOMAIN_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___CREATE_EANNOTATION__STRING = DOMAIN_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___DESTROY = DOMAIN_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_KEYWORDS = DOMAIN_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_APPLICABLE_STEREOTYPE__STRING = DOMAIN_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_APPLICABLE_STEREOTYPES = DOMAIN_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_APPLIED_STEREOTYPE__STRING = DOMAIN_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_APPLIED_STEREOTYPES = DOMAIN_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = DOMAIN_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = DOMAIN_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_MODEL = DOMAIN_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_NEAREST_PACKAGE = DOMAIN_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_RELATIONSHIPS = DOMAIN_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_RELATIONSHIPS__ECLASS = DOMAIN_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_REQUIRED_STEREOTYPE__STRING = DOMAIN_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_REQUIRED_STEREOTYPES = DOMAIN_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS = DOMAIN_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = DOMAIN_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = DOMAIN_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_STEREOTYPE_APPLICATIONS = DOMAIN_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS = DOMAIN_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = DOMAIN_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_VALUE__STEREOTYPE_STRING = DOMAIN_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___HAS_KEYWORD__STRING = DOMAIN_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___HAS_VALUE__STEREOTYPE_STRING = DOMAIN_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = DOMAIN_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___IS_STEREOTYPE_APPLIED__STEREOTYPE = DOMAIN_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = DOMAIN_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___REMOVE_KEYWORD__STRING = DOMAIN_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___SET_VALUE__STEREOTYPE_STRING_OBJECT = DOMAIN_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___UNAPPLY_STEREOTYPE__STEREOTYPE = DOMAIN_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___ALL_OWNED_ELEMENTS = DOMAIN_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___MUST_BE_OWNED = DOMAIN_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = DOMAIN_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = DOMAIN_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = DOMAIN_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___CREATE_DEPENDENCY__NAMEDELEMENT = DOMAIN_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___CREATE_USAGE__NAMEDELEMENT = DOMAIN_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_LABEL = DOMAIN_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_LABEL__BOOLEAN = DOMAIN_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___ALL_NAMESPACES = DOMAIN_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___ALL_OWNING_PACKAGES = DOMAIN_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = DOMAIN_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_NAMESPACE = DOMAIN_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_QUALIFIED_NAME = DOMAIN_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___SEPARATOR = DOMAIN_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_CLIENT_DEPENDENCY__STRING = DOMAIN_ELEMENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = DOMAIN_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___CREATE_NAME_EXPRESSION__STRING_TYPE = DOMAIN_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___CREATE_OWNED_COMMENT = DOMAIN_ELEMENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT___CREATE__ECLASS = DOMAIN_ELEMENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Feature Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONCEPT_OPERATION_COUNT = DOMAIN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.BehaviorConceptImpl <em>Behavior Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.BehaviorConceptImpl
	 * @see IFML.Core.impl.CorePackageImpl#getBehaviorConcept()
	 * @generated
	 */
	int BEHAVIOR_CONCEPT = 49;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT__EANNOTATIONS = DOMAIN_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT__OWNED_COMMENT = DOMAIN_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT__OWNED_ELEMENT = DOMAIN_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT__OWNER = DOMAIN_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT__CLIENT_DEPENDENCY = DOMAIN_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT__NAME = DOMAIN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT__NAME_EXPRESSION = DOMAIN_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT__NAMESPACE = DOMAIN_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT__QUALIFIED_NAME = DOMAIN_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT__VISIBILITY = DOMAIN_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Dynamic Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT__DYNAMIC_BEHAVIOR = DOMAIN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Behavior Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT_FEATURE_COUNT = DOMAIN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_EANNOTATION__STRING = DOMAIN_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = DOMAIN_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = DOMAIN_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___ADD_KEYWORD__STRING = DOMAIN_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___APPLY_STEREOTYPE__STEREOTYPE = DOMAIN_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___CREATE_EANNOTATION__STRING = DOMAIN_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___DESTROY = DOMAIN_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_KEYWORDS = DOMAIN_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_APPLICABLE_STEREOTYPE__STRING = DOMAIN_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_APPLICABLE_STEREOTYPES = DOMAIN_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_APPLIED_STEREOTYPE__STRING = DOMAIN_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_APPLIED_STEREOTYPES = DOMAIN_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = DOMAIN_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = DOMAIN_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_MODEL = DOMAIN_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_NEAREST_PACKAGE = DOMAIN_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_RELATIONSHIPS = DOMAIN_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_RELATIONSHIPS__ECLASS = DOMAIN_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_REQUIRED_STEREOTYPE__STRING = DOMAIN_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_REQUIRED_STEREOTYPES = DOMAIN_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS = DOMAIN_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = DOMAIN_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = DOMAIN_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_STEREOTYPE_APPLICATIONS = DOMAIN_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS = DOMAIN_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = DOMAIN_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_VALUE__STEREOTYPE_STRING = DOMAIN_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___HAS_KEYWORD__STRING = DOMAIN_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___HAS_VALUE__STEREOTYPE_STRING = DOMAIN_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = DOMAIN_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___IS_STEREOTYPE_APPLIED__STEREOTYPE = DOMAIN_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = DOMAIN_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___REMOVE_KEYWORD__STRING = DOMAIN_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___SET_VALUE__STEREOTYPE_STRING_OBJECT = DOMAIN_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___UNAPPLY_STEREOTYPE__STEREOTYPE = DOMAIN_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___ALL_OWNED_ELEMENTS = DOMAIN_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___MUST_BE_OWNED = DOMAIN_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = DOMAIN_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = DOMAIN_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = DOMAIN_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___CREATE_DEPENDENCY__NAMEDELEMENT = DOMAIN_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___CREATE_USAGE__NAMEDELEMENT = DOMAIN_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_LABEL = DOMAIN_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_LABEL__BOOLEAN = DOMAIN_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___ALL_NAMESPACES = DOMAIN_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___ALL_OWNING_PACKAGES = DOMAIN_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = DOMAIN_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_NAMESPACE = DOMAIN_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_QUALIFIED_NAME = DOMAIN_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___SEPARATOR = DOMAIN_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_CLIENT_DEPENDENCY__STRING = DOMAIN_ELEMENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = DOMAIN_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___CREATE_NAME_EXPRESSION__STRING_TYPE = DOMAIN_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___CREATE_OWNED_COMMENT = DOMAIN_ELEMENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT___CREATE__ECLASS = DOMAIN_ELEMENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Behavior Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CONCEPT_OPERATION_COUNT = DOMAIN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.BehavioralFeatureConceptImpl <em>Behavioral Feature Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.BehavioralFeatureConceptImpl
	 * @see IFML.Core.impl.CorePackageImpl#getBehavioralFeatureConcept()
	 * @generated
	 */
	int BEHAVIORAL_FEATURE_CONCEPT = 50;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT__EANNOTATIONS = DOMAIN_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT__OWNED_COMMENT = DOMAIN_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT__OWNED_ELEMENT = DOMAIN_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT__OWNER = DOMAIN_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT__CLIENT_DEPENDENCY = DOMAIN_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT__NAME = DOMAIN_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT__NAME_EXPRESSION = DOMAIN_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT__NAMESPACE = DOMAIN_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT__QUALIFIED_NAME = DOMAIN_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT__VISIBILITY = DOMAIN_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Dynamic Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT__DYNAMIC_BEHAVIOR = DOMAIN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Behavioral Feature Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT_FEATURE_COUNT = DOMAIN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_EANNOTATION__STRING = DOMAIN_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = DOMAIN_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = DOMAIN_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___ADD_KEYWORD__STRING = DOMAIN_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___APPLY_STEREOTYPE__STEREOTYPE = DOMAIN_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___CREATE_EANNOTATION__STRING = DOMAIN_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___DESTROY = DOMAIN_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_KEYWORDS = DOMAIN_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_APPLICABLE_STEREOTYPE__STRING = DOMAIN_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_APPLICABLE_STEREOTYPES = DOMAIN_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_APPLIED_STEREOTYPE__STRING = DOMAIN_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_APPLIED_STEREOTYPES = DOMAIN_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = DOMAIN_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = DOMAIN_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_MODEL = DOMAIN_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_NEAREST_PACKAGE = DOMAIN_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_RELATIONSHIPS = DOMAIN_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_RELATIONSHIPS__ECLASS = DOMAIN_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_REQUIRED_STEREOTYPE__STRING = DOMAIN_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_REQUIRED_STEREOTYPES = DOMAIN_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS = DOMAIN_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = DOMAIN_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = DOMAIN_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_STEREOTYPE_APPLICATIONS = DOMAIN_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS = DOMAIN_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = DOMAIN_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_VALUE__STEREOTYPE_STRING = DOMAIN_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___HAS_KEYWORD__STRING = DOMAIN_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___HAS_VALUE__STEREOTYPE_STRING = DOMAIN_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = DOMAIN_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___IS_STEREOTYPE_APPLIED__STEREOTYPE = DOMAIN_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = DOMAIN_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___REMOVE_KEYWORD__STRING = DOMAIN_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___SET_VALUE__STEREOTYPE_STRING_OBJECT = DOMAIN_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___UNAPPLY_STEREOTYPE__STEREOTYPE = DOMAIN_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___ALL_OWNED_ELEMENTS = DOMAIN_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___MUST_BE_OWNED = DOMAIN_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = DOMAIN_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = DOMAIN_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = DOMAIN_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___CREATE_DEPENDENCY__NAMEDELEMENT = DOMAIN_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___CREATE_USAGE__NAMEDELEMENT = DOMAIN_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_LABEL = DOMAIN_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_LABEL__BOOLEAN = DOMAIN_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___ALL_NAMESPACES = DOMAIN_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___ALL_OWNING_PACKAGES = DOMAIN_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = DOMAIN_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_NAMESPACE = DOMAIN_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_QUALIFIED_NAME = DOMAIN_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___SEPARATOR = DOMAIN_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_CLIENT_DEPENDENCY__STRING = DOMAIN_ELEMENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = DOMAIN_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___CREATE_NAME_EXPRESSION__STRING_TYPE = DOMAIN_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___CREATE_OWNED_COMMENT = DOMAIN_ELEMENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT___CREATE__ECLASS = DOMAIN_ELEMENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Behavioral Feature Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_CONCEPT_OPERATION_COUNT = DOMAIN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.UMLBehaviorImpl <em>UML Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.UMLBehaviorImpl
	 * @see IFML.Core.impl.CorePackageImpl#getUMLBehavior()
	 * @generated
	 */
	int UML_BEHAVIOR = 51;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR__EANNOTATIONS = BEHAVIOR_CONCEPT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR__OWNED_COMMENT = BEHAVIOR_CONCEPT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR__OWNED_ELEMENT = BEHAVIOR_CONCEPT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR__OWNER = BEHAVIOR_CONCEPT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR__CLIENT_DEPENDENCY = BEHAVIOR_CONCEPT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR__NAME = BEHAVIOR_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR__NAME_EXPRESSION = BEHAVIOR_CONCEPT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR__NAMESPACE = BEHAVIOR_CONCEPT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR__QUALIFIED_NAME = BEHAVIOR_CONCEPT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR__VISIBILITY = BEHAVIOR_CONCEPT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Dynamic Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR__DYNAMIC_BEHAVIOR = BEHAVIOR_CONCEPT__DYNAMIC_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR__BEHAVIOR = BEHAVIOR_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_EANNOTATION__STRING = BEHAVIOR_CONCEPT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = BEHAVIOR_CONCEPT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = BEHAVIOR_CONCEPT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___ADD_KEYWORD__STRING = BEHAVIOR_CONCEPT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___APPLY_STEREOTYPE__STEREOTYPE = BEHAVIOR_CONCEPT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___CREATE_EANNOTATION__STRING = BEHAVIOR_CONCEPT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___DESTROY = BEHAVIOR_CONCEPT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_KEYWORDS = BEHAVIOR_CONCEPT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_APPLICABLE_STEREOTYPE__STRING = BEHAVIOR_CONCEPT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_APPLICABLE_STEREOTYPES = BEHAVIOR_CONCEPT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_APPLIED_STEREOTYPE__STRING = BEHAVIOR_CONCEPT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_APPLIED_STEREOTYPES = BEHAVIOR_CONCEPT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = BEHAVIOR_CONCEPT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = BEHAVIOR_CONCEPT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_MODEL = BEHAVIOR_CONCEPT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_NEAREST_PACKAGE = BEHAVIOR_CONCEPT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_RELATIONSHIPS = BEHAVIOR_CONCEPT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_RELATIONSHIPS__ECLASS = BEHAVIOR_CONCEPT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_REQUIRED_STEREOTYPE__STRING = BEHAVIOR_CONCEPT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_REQUIRED_STEREOTYPES = BEHAVIOR_CONCEPT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_SOURCE_DIRECTED_RELATIONSHIPS = BEHAVIOR_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = BEHAVIOR_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_STEREOTYPE_APPLICATION__STEREOTYPE = BEHAVIOR_CONCEPT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_STEREOTYPE_APPLICATIONS = BEHAVIOR_CONCEPT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_TARGET_DIRECTED_RELATIONSHIPS = BEHAVIOR_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = BEHAVIOR_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_VALUE__STEREOTYPE_STRING = BEHAVIOR_CONCEPT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___HAS_KEYWORD__STRING = BEHAVIOR_CONCEPT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___HAS_VALUE__STEREOTYPE_STRING = BEHAVIOR_CONCEPT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = BEHAVIOR_CONCEPT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___IS_STEREOTYPE_APPLIED__STEREOTYPE = BEHAVIOR_CONCEPT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___IS_STEREOTYPE_REQUIRED__STEREOTYPE = BEHAVIOR_CONCEPT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___REMOVE_KEYWORD__STRING = BEHAVIOR_CONCEPT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___SET_VALUE__STEREOTYPE_STRING_OBJECT = BEHAVIOR_CONCEPT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___UNAPPLY_STEREOTYPE__STEREOTYPE = BEHAVIOR_CONCEPT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___ALL_OWNED_ELEMENTS = BEHAVIOR_CONCEPT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___MUST_BE_OWNED = BEHAVIOR_CONCEPT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = BEHAVIOR_CONCEPT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = BEHAVIOR_CONCEPT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = BEHAVIOR_CONCEPT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___CREATE_DEPENDENCY__NAMEDELEMENT = BEHAVIOR_CONCEPT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___CREATE_USAGE__NAMEDELEMENT = BEHAVIOR_CONCEPT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_LABEL = BEHAVIOR_CONCEPT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_LABEL__BOOLEAN = BEHAVIOR_CONCEPT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___ALL_NAMESPACES = BEHAVIOR_CONCEPT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___ALL_OWNING_PACKAGES = BEHAVIOR_CONCEPT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = BEHAVIOR_CONCEPT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_NAMESPACE = BEHAVIOR_CONCEPT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_QUALIFIED_NAME = BEHAVIOR_CONCEPT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___SEPARATOR = BEHAVIOR_CONCEPT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_CLIENT_DEPENDENCY__STRING = BEHAVIOR_CONCEPT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = BEHAVIOR_CONCEPT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___CREATE_NAME_EXPRESSION__STRING_TYPE = BEHAVIOR_CONCEPT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___CREATE_OWNED_COMMENT = BEHAVIOR_CONCEPT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR___CREATE__ECLASS = BEHAVIOR_CONCEPT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>UML Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIOR_OPERATION_COUNT = BEHAVIOR_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.UMLBehavioralFeatureImpl <em>UML Behavioral Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.UMLBehavioralFeatureImpl
	 * @see IFML.Core.impl.CorePackageImpl#getUMLBehavioralFeature()
	 * @generated
	 */
	int UML_BEHAVIORAL_FEATURE = 52;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE__EANNOTATIONS = BEHAVIORAL_FEATURE_CONCEPT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE__OWNED_COMMENT = BEHAVIORAL_FEATURE_CONCEPT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE__OWNED_ELEMENT = BEHAVIORAL_FEATURE_CONCEPT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE__OWNER = BEHAVIORAL_FEATURE_CONCEPT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE__CLIENT_DEPENDENCY = BEHAVIORAL_FEATURE_CONCEPT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE__NAME = BEHAVIORAL_FEATURE_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE__NAME_EXPRESSION = BEHAVIORAL_FEATURE_CONCEPT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE__NAMESPACE = BEHAVIORAL_FEATURE_CONCEPT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE__QUALIFIED_NAME = BEHAVIORAL_FEATURE_CONCEPT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE__VISIBILITY = BEHAVIORAL_FEATURE_CONCEPT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Dynamic Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE__DYNAMIC_BEHAVIOR = BEHAVIORAL_FEATURE_CONCEPT__DYNAMIC_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Behavioral Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE__BEHAVIORAL_FEATURE = BEHAVIORAL_FEATURE_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Behavioral Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE_FEATURE_COUNT = BEHAVIORAL_FEATURE_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_EANNOTATION__STRING = BEHAVIORAL_FEATURE_CONCEPT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = BEHAVIORAL_FEATURE_CONCEPT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = BEHAVIORAL_FEATURE_CONCEPT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___ADD_KEYWORD__STRING = BEHAVIORAL_FEATURE_CONCEPT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___APPLY_STEREOTYPE__STEREOTYPE = BEHAVIORAL_FEATURE_CONCEPT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___CREATE_EANNOTATION__STRING = BEHAVIORAL_FEATURE_CONCEPT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___DESTROY = BEHAVIORAL_FEATURE_CONCEPT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_KEYWORDS = BEHAVIORAL_FEATURE_CONCEPT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_APPLICABLE_STEREOTYPE__STRING = BEHAVIORAL_FEATURE_CONCEPT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_APPLICABLE_STEREOTYPES = BEHAVIORAL_FEATURE_CONCEPT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_APPLIED_STEREOTYPE__STRING = BEHAVIORAL_FEATURE_CONCEPT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_APPLIED_STEREOTYPES = BEHAVIORAL_FEATURE_CONCEPT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = BEHAVIORAL_FEATURE_CONCEPT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = BEHAVIORAL_FEATURE_CONCEPT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_MODEL = BEHAVIORAL_FEATURE_CONCEPT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_NEAREST_PACKAGE = BEHAVIORAL_FEATURE_CONCEPT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_RELATIONSHIPS = BEHAVIORAL_FEATURE_CONCEPT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_RELATIONSHIPS__ECLASS = BEHAVIORAL_FEATURE_CONCEPT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_REQUIRED_STEREOTYPE__STRING = BEHAVIORAL_FEATURE_CONCEPT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_REQUIRED_STEREOTYPES = BEHAVIORAL_FEATURE_CONCEPT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_SOURCE_DIRECTED_RELATIONSHIPS = BEHAVIORAL_FEATURE_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = BEHAVIORAL_FEATURE_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = BEHAVIORAL_FEATURE_CONCEPT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_STEREOTYPE_APPLICATIONS = BEHAVIORAL_FEATURE_CONCEPT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_TARGET_DIRECTED_RELATIONSHIPS = BEHAVIORAL_FEATURE_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = BEHAVIORAL_FEATURE_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_VALUE__STEREOTYPE_STRING = BEHAVIORAL_FEATURE_CONCEPT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___HAS_KEYWORD__STRING = BEHAVIORAL_FEATURE_CONCEPT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___HAS_VALUE__STEREOTYPE_STRING = BEHAVIORAL_FEATURE_CONCEPT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = BEHAVIORAL_FEATURE_CONCEPT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___IS_STEREOTYPE_APPLIED__STEREOTYPE = BEHAVIORAL_FEATURE_CONCEPT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = BEHAVIORAL_FEATURE_CONCEPT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___REMOVE_KEYWORD__STRING = BEHAVIORAL_FEATURE_CONCEPT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___SET_VALUE__STEREOTYPE_STRING_OBJECT = BEHAVIORAL_FEATURE_CONCEPT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___UNAPPLY_STEREOTYPE__STEREOTYPE = BEHAVIORAL_FEATURE_CONCEPT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___ALL_OWNED_ELEMENTS = BEHAVIORAL_FEATURE_CONCEPT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___MUST_BE_OWNED = BEHAVIORAL_FEATURE_CONCEPT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = BEHAVIORAL_FEATURE_CONCEPT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = BEHAVIORAL_FEATURE_CONCEPT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = BEHAVIORAL_FEATURE_CONCEPT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___CREATE_DEPENDENCY__NAMEDELEMENT = BEHAVIORAL_FEATURE_CONCEPT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___CREATE_USAGE__NAMEDELEMENT = BEHAVIORAL_FEATURE_CONCEPT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_LABEL = BEHAVIORAL_FEATURE_CONCEPT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_LABEL__BOOLEAN = BEHAVIORAL_FEATURE_CONCEPT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___ALL_NAMESPACES = BEHAVIORAL_FEATURE_CONCEPT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___ALL_OWNING_PACKAGES = BEHAVIORAL_FEATURE_CONCEPT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = BEHAVIORAL_FEATURE_CONCEPT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_NAMESPACE = BEHAVIORAL_FEATURE_CONCEPT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_QUALIFIED_NAME = BEHAVIORAL_FEATURE_CONCEPT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___SEPARATOR = BEHAVIORAL_FEATURE_CONCEPT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_CLIENT_DEPENDENCY__STRING = BEHAVIORAL_FEATURE_CONCEPT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = BEHAVIORAL_FEATURE_CONCEPT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___CREATE_NAME_EXPRESSION__STRING_TYPE = BEHAVIORAL_FEATURE_CONCEPT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___CREATE_OWNED_COMMENT = BEHAVIORAL_FEATURE_CONCEPT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE___CREATE__ECLASS = BEHAVIORAL_FEATURE_CONCEPT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>UML Behavioral Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_BEHAVIORAL_FEATURE_OPERATION_COUNT = BEHAVIORAL_FEATURE_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.UMLDomainConceptImpl <em>UML Domain Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.UMLDomainConceptImpl
	 * @see IFML.Core.impl.CorePackageImpl#getUMLDomainConcept()
	 * @generated
	 */
	int UML_DOMAIN_CONCEPT = 53;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT__EANNOTATIONS = DOMAIN_CONCEPT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT__OWNED_COMMENT = DOMAIN_CONCEPT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT__OWNED_ELEMENT = DOMAIN_CONCEPT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT__OWNER = DOMAIN_CONCEPT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT__CLIENT_DEPENDENCY = DOMAIN_CONCEPT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT__NAME = DOMAIN_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT__NAME_EXPRESSION = DOMAIN_CONCEPT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT__NAMESPACE = DOMAIN_CONCEPT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT__QUALIFIED_NAME = DOMAIN_CONCEPT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT__VISIBILITY = DOMAIN_CONCEPT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Data Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT__DATA_BINDING = DOMAIN_CONCEPT__DATA_BINDING;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT__CLASSIFIER = DOMAIN_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Domain Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT_FEATURE_COUNT = DOMAIN_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_EANNOTATION__STRING = DOMAIN_CONCEPT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = DOMAIN_CONCEPT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = DOMAIN_CONCEPT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___ADD_KEYWORD__STRING = DOMAIN_CONCEPT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___APPLY_STEREOTYPE__STEREOTYPE = DOMAIN_CONCEPT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___CREATE_EANNOTATION__STRING = DOMAIN_CONCEPT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___DESTROY = DOMAIN_CONCEPT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_KEYWORDS = DOMAIN_CONCEPT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_APPLICABLE_STEREOTYPE__STRING = DOMAIN_CONCEPT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_APPLICABLE_STEREOTYPES = DOMAIN_CONCEPT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_APPLIED_STEREOTYPE__STRING = DOMAIN_CONCEPT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_APPLIED_STEREOTYPES = DOMAIN_CONCEPT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = DOMAIN_CONCEPT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = DOMAIN_CONCEPT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_MODEL = DOMAIN_CONCEPT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_NEAREST_PACKAGE = DOMAIN_CONCEPT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_RELATIONSHIPS = DOMAIN_CONCEPT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_RELATIONSHIPS__ECLASS = DOMAIN_CONCEPT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_REQUIRED_STEREOTYPE__STRING = DOMAIN_CONCEPT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_REQUIRED_STEREOTYPES = DOMAIN_CONCEPT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS = DOMAIN_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = DOMAIN_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = DOMAIN_CONCEPT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_STEREOTYPE_APPLICATIONS = DOMAIN_CONCEPT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS = DOMAIN_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = DOMAIN_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_VALUE__STEREOTYPE_STRING = DOMAIN_CONCEPT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___HAS_KEYWORD__STRING = DOMAIN_CONCEPT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___HAS_VALUE__STEREOTYPE_STRING = DOMAIN_CONCEPT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = DOMAIN_CONCEPT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___IS_STEREOTYPE_APPLIED__STEREOTYPE = DOMAIN_CONCEPT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = DOMAIN_CONCEPT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___REMOVE_KEYWORD__STRING = DOMAIN_CONCEPT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___SET_VALUE__STEREOTYPE_STRING_OBJECT = DOMAIN_CONCEPT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___UNAPPLY_STEREOTYPE__STEREOTYPE = DOMAIN_CONCEPT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___ALL_OWNED_ELEMENTS = DOMAIN_CONCEPT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___MUST_BE_OWNED = DOMAIN_CONCEPT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = DOMAIN_CONCEPT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = DOMAIN_CONCEPT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = DOMAIN_CONCEPT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___CREATE_DEPENDENCY__NAMEDELEMENT = DOMAIN_CONCEPT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___CREATE_USAGE__NAMEDELEMENT = DOMAIN_CONCEPT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_LABEL = DOMAIN_CONCEPT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_LABEL__BOOLEAN = DOMAIN_CONCEPT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___ALL_NAMESPACES = DOMAIN_CONCEPT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___ALL_OWNING_PACKAGES = DOMAIN_CONCEPT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = DOMAIN_CONCEPT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_NAMESPACE = DOMAIN_CONCEPT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_QUALIFIED_NAME = DOMAIN_CONCEPT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___SEPARATOR = DOMAIN_CONCEPT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_CLIENT_DEPENDENCY__STRING = DOMAIN_CONCEPT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = DOMAIN_CONCEPT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___CREATE_NAME_EXPRESSION__STRING_TYPE = DOMAIN_CONCEPT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___CREATE_OWNED_COMMENT = DOMAIN_CONCEPT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT___CREATE__ECLASS = DOMAIN_CONCEPT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>UML Domain Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DOMAIN_CONCEPT_OPERATION_COUNT = DOMAIN_CONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Core.impl.UMLStructuralFeatureImpl <em>UML Structural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Core.impl.UMLStructuralFeatureImpl
	 * @see IFML.Core.impl.CorePackageImpl#getUMLStructuralFeature()
	 * @generated
	 */
	int UML_STRUCTURAL_FEATURE = 54;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE__EANNOTATIONS = FEATURE_CONCEPT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE__OWNED_COMMENT = FEATURE_CONCEPT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE__OWNED_ELEMENT = FEATURE_CONCEPT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE__OWNER = FEATURE_CONCEPT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE__CLIENT_DEPENDENCY = FEATURE_CONCEPT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE__NAME = FEATURE_CONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE__NAME_EXPRESSION = FEATURE_CONCEPT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE__NAMESPACE = FEATURE_CONCEPT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE__QUALIFIED_NAME = FEATURE_CONCEPT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE__VISIBILITY = FEATURE_CONCEPT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Visualization Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE__VISUALIZATION_ATTRIBUTE = FEATURE_CONCEPT__VISUALIZATION_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE__STRUCTURAL_FEATURE = FEATURE_CONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE_FEATURE_COUNT = FEATURE_CONCEPT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_EANNOTATION__STRING = FEATURE_CONCEPT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = FEATURE_CONCEPT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = FEATURE_CONCEPT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___ADD_KEYWORD__STRING = FEATURE_CONCEPT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___APPLY_STEREOTYPE__STEREOTYPE = FEATURE_CONCEPT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___CREATE_EANNOTATION__STRING = FEATURE_CONCEPT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___DESTROY = FEATURE_CONCEPT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_KEYWORDS = FEATURE_CONCEPT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_APPLICABLE_STEREOTYPE__STRING = FEATURE_CONCEPT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_APPLICABLE_STEREOTYPES = FEATURE_CONCEPT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_APPLIED_STEREOTYPE__STRING = FEATURE_CONCEPT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_APPLIED_STEREOTYPES = FEATURE_CONCEPT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = FEATURE_CONCEPT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = FEATURE_CONCEPT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_MODEL = FEATURE_CONCEPT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_NEAREST_PACKAGE = FEATURE_CONCEPT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_RELATIONSHIPS = FEATURE_CONCEPT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_RELATIONSHIPS__ECLASS = FEATURE_CONCEPT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_REQUIRED_STEREOTYPE__STRING = FEATURE_CONCEPT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_REQUIRED_STEREOTYPES = FEATURE_CONCEPT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_SOURCE_DIRECTED_RELATIONSHIPS = FEATURE_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = FEATURE_CONCEPT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = FEATURE_CONCEPT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_STEREOTYPE_APPLICATIONS = FEATURE_CONCEPT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_TARGET_DIRECTED_RELATIONSHIPS = FEATURE_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = FEATURE_CONCEPT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_VALUE__STEREOTYPE_STRING = FEATURE_CONCEPT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___HAS_KEYWORD__STRING = FEATURE_CONCEPT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___HAS_VALUE__STEREOTYPE_STRING = FEATURE_CONCEPT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = FEATURE_CONCEPT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___IS_STEREOTYPE_APPLIED__STEREOTYPE = FEATURE_CONCEPT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = FEATURE_CONCEPT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___REMOVE_KEYWORD__STRING = FEATURE_CONCEPT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___SET_VALUE__STEREOTYPE_STRING_OBJECT = FEATURE_CONCEPT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___UNAPPLY_STEREOTYPE__STEREOTYPE = FEATURE_CONCEPT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___ALL_OWNED_ELEMENTS = FEATURE_CONCEPT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___MUST_BE_OWNED = FEATURE_CONCEPT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = FEATURE_CONCEPT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = FEATURE_CONCEPT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = FEATURE_CONCEPT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___CREATE_DEPENDENCY__NAMEDELEMENT = FEATURE_CONCEPT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___CREATE_USAGE__NAMEDELEMENT = FEATURE_CONCEPT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_LABEL = FEATURE_CONCEPT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_LABEL__BOOLEAN = FEATURE_CONCEPT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___ALL_NAMESPACES = FEATURE_CONCEPT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___ALL_OWNING_PACKAGES = FEATURE_CONCEPT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = FEATURE_CONCEPT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_NAMESPACE = FEATURE_CONCEPT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_QUALIFIED_NAME = FEATURE_CONCEPT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___SEPARATOR = FEATURE_CONCEPT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_CLIENT_DEPENDENCY__STRING = FEATURE_CONCEPT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = FEATURE_CONCEPT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___CREATE_NAME_EXPRESSION__STRING_TYPE = FEATURE_CONCEPT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___CREATE_OWNED_COMMENT = FEATURE_CONCEPT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE___CREATE__ECLASS = FEATURE_CONCEPT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>UML Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STRUCTURAL_FEATURE_OPERATION_COUNT = FEATURE_CONCEPT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link IFML.Core.InteractionFlow <em>Interaction Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Flow</em>'.
	 * @see IFML.Core.InteractionFlow
	 * @generated
	 */
	EClass getInteractionFlow();

	/**
	 * Returns the meta object for the containment reference '{@link IFML.Core.InteractionFlow#getParameterBindingGroup <em>Parameter Binding Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Binding Group</em>'.
	 * @see IFML.Core.InteractionFlow#getParameterBindingGroup()
	 * @see #getInteractionFlow()
	 * @generated
	 */
	EReference getInteractionFlow_ParameterBindingGroup();

	/**
	 * Returns the meta object for the container reference '{@link IFML.Core.InteractionFlow#getSourceInteractionFlowElement <em>Source Interaction Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source Interaction Flow Element</em>'.
	 * @see IFML.Core.InteractionFlow#getSourceInteractionFlowElement()
	 * @see #getInteractionFlow()
	 * @generated
	 */
	EReference getInteractionFlow_SourceInteractionFlowElement();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.InteractionFlow#getTargetInteractionFlowElement <em>Target Interaction Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Interaction Flow Element</em>'.
	 * @see IFML.Core.InteractionFlow#getTargetInteractionFlowElement()
	 * @see #getInteractionFlow()
	 * @generated
	 */
	EReference getInteractionFlow_TargetInteractionFlowElement();

	/**
	 * Returns the meta object for class '{@link IFML.Core.InteractionFlowExpression <em>Interaction Flow Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Flow Expression</em>'.
	 * @see IFML.Core.InteractionFlowExpression
	 * @generated
	 */
	EClass getInteractionFlowExpression();

	/**
	 * Returns the meta object for the reference list '{@link IFML.Core.InteractionFlowExpression#getInteractionFlow <em>Interaction Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interaction Flow</em>'.
	 * @see IFML.Core.InteractionFlowExpression#getInteractionFlow()
	 * @see #getInteractionFlowExpression()
	 * @generated
	 */
	EReference getInteractionFlowExpression_InteractionFlow();

	/**
	 * Returns the meta object for class '{@link IFML.Core.SystemEvent <em>System Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Event</em>'.
	 * @see IFML.Core.SystemEvent
	 * @generated
	 */
	EClass getSystemEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.SystemEvent#getTriggeringExpressions <em>Triggering Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggering Expressions</em>'.
	 * @see IFML.Core.SystemEvent#getTriggeringExpressions()
	 * @see #getSystemEvent()
	 * @generated
	 */
	EReference getSystemEvent_TriggeringExpressions();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Core.SystemEvent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see IFML.Core.SystemEvent#getType()
	 * @see #getSystemEvent()
	 * @generated
	 */
	EAttribute getSystemEvent_Type();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ParameterBinding <em>Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Binding</em>'.
	 * @see IFML.Core.ParameterBinding
	 * @generated
	 */
	EClass getParameterBinding();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.ParameterBinding#getSourceParameter <em>Source Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Parameter</em>'.
	 * @see IFML.Core.ParameterBinding#getSourceParameter()
	 * @see #getParameterBinding()
	 * @generated
	 */
	EReference getParameterBinding_SourceParameter();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.ParameterBinding#getTargetParameter <em>Target Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Parameter</em>'.
	 * @see IFML.Core.ParameterBinding#getTargetParameter()
	 * @see #getParameterBinding()
	 * @generated
	 */
	EReference getParameterBinding_TargetParameter();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ActionEvent <em>Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Event</em>'.
	 * @see IFML.Core.ActionEvent
	 * @generated
	 */
	EClass getActionEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Core.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Model</em>'.
	 * @see IFML.Core.DomainModel
	 * @generated
	 */
	EClass getDomainModel();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.DomainModel#getDomainElements <em>Domain Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Elements</em>'.
	 * @see IFML.Core.DomainModel#getDomainElements()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_DomainElements();

	/**
	 * Returns the meta object for class '{@link IFML.Core.PortDefinition <em>Port Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Definition</em>'.
	 * @see IFML.Core.PortDefinition
	 * @generated
	 */
	EClass getPortDefinition();

	/**
	 * Returns the meta object for the reference list '{@link IFML.Core.PortDefinition#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ports</em>'.
	 * @see IFML.Core.PortDefinition#getPorts()
	 * @see #getPortDefinition()
	 * @generated
	 */
	EReference getPortDefinition_Ports();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ContentBinding <em>Content Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Binding</em>'.
	 * @see IFML.Core.ContentBinding
	 * @generated
	 */
	EClass getContentBinding();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Core.ContentBinding#getUniformResourceIdentifier <em>Uniform Resource Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uniform Resource Identifier</em>'.
	 * @see IFML.Core.ContentBinding#getUniformResourceIdentifier()
	 * @see #getContentBinding()
	 * @generated
	 */
	EAttribute getContentBinding_UniformResourceIdentifier();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ViewElement <em>View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Element</em>'.
	 * @see IFML.Core.ViewElement
	 * @generated
	 */
	EClass getViewElement();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.ViewElement#getViewElementEvents <em>View Element Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Element Events</em>'.
	 * @see IFML.Core.ViewElement#getViewElementEvents()
	 * @see #getViewElement()
	 * @generated
	 */
	EReference getViewElement_ViewElementEvents();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.ViewElement#getActivationExpression <em>Activation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activation Expression</em>'.
	 * @see IFML.Core.ViewElement#getActivationExpression()
	 * @see #getViewElement()
	 * @generated
	 */
	EReference getViewElement_ActivationExpression();

	/**
	 * Returns the meta object for the container reference '{@link IFML.Core.ViewElement#getViewContainer <em>View Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>View Container</em>'.
	 * @see IFML.Core.ViewElement#getViewContainer()
	 * @see #getViewElement()
	 * @generated
	 */
	EReference getViewElement_ViewContainer();

	/**
	 * Returns the meta object for class '{@link IFML.Core.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see IFML.Core.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Core.Expression#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see IFML.Core.Expression#getLanguage()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Language();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Core.Expression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see IFML.Core.Expression#getBody()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Body();

	/**
	 * Returns the meta object for class '{@link IFML.Core.DynamicBehavior <em>Dynamic Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Behavior</em>'.
	 * @see IFML.Core.DynamicBehavior
	 * @generated
	 */
	EClass getDynamicBehavior();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.DynamicBehavior#getBehavioralFeatureConcept <em>Behavioral Feature Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavioral Feature Concept</em>'.
	 * @see IFML.Core.DynamicBehavior#getBehavioralFeatureConcept()
	 * @see #getDynamicBehavior()
	 * @generated
	 */
	EReference getDynamicBehavior_BehavioralFeatureConcept();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.DynamicBehavior#getBehaviorConcept <em>Behavior Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior Concept</em>'.
	 * @see IFML.Core.DynamicBehavior#getBehaviorConcept()
	 * @see #getDynamicBehavior()
	 * @generated
	 */
	EReference getDynamicBehavior_BehaviorConcept();

	/**
	 * Returns the meta object for class '{@link IFML.Core.Viewpoint <em>Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viewpoint</em>'.
	 * @see IFML.Core.Viewpoint
	 * @generated
	 */
	EClass getViewpoint();

	/**
	 * Returns the meta object for the reference list '{@link IFML.Core.Viewpoint#getInteractionFlowModelElements <em>Interaction Flow Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interaction Flow Model Elements</em>'.
	 * @see IFML.Core.Viewpoint#getInteractionFlowModelElements()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_InteractionFlowModelElements();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.Viewpoint#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see IFML.Core.Viewpoint#getContext()
	 * @see #getViewpoint()
	 * @generated
	 */
	EReference getViewpoint_Context();

	/**
	 * Returns the meta object for class '{@link IFML.Core.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow</em>'.
	 * @see IFML.Core.DataFlow
	 * @generated
	 */
	EClass getDataFlow();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ViewComponentPart <em>View Component Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Component Part</em>'.
	 * @see IFML.Core.ViewComponentPart
	 * @generated
	 */
	EClass getViewComponentPart();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.ViewComponentPart#getViewElementEvents <em>View Element Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Element Events</em>'.
	 * @see IFML.Core.ViewComponentPart#getViewElementEvents()
	 * @see #getViewComponentPart()
	 * @generated
	 */
	EReference getViewComponentPart_ViewElementEvents();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.ViewComponentPart#getActivationExpression <em>Activation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activation Expression</em>'.
	 * @see IFML.Core.ViewComponentPart#getActivationExpression()
	 * @see #getViewComponentPart()
	 * @generated
	 */
	EReference getViewComponentPart_ActivationExpression();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.ViewComponentPart#getParentViewComponentPart <em>Parent View Component Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent View Component Part</em>'.
	 * @see IFML.Core.ViewComponentPart#getParentViewComponentPart()
	 * @see #getViewComponentPart()
	 * @generated
	 */
	EReference getViewComponentPart_ParentViewComponentPart();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.ViewComponentPart#getSubViewComponentParts <em>Sub View Component Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub View Component Parts</em>'.
	 * @see IFML.Core.ViewComponentPart#getSubViewComponentParts()
	 * @see #getViewComponentPart()
	 * @generated
	 */
	EReference getViewComponentPart_SubViewComponentParts();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ViewContainer <em>View Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Container</em>'.
	 * @see IFML.Core.ViewContainer
	 * @generated
	 */
	EClass getViewContainer();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Core.ViewContainer#isIsLandmark <em>Is Landmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Landmark</em>'.
	 * @see IFML.Core.ViewContainer#isIsLandmark()
	 * @see #getViewContainer()
	 * @generated
	 */
	EAttribute getViewContainer_IsLandmark();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Core.ViewContainer#isIsDefault <em>Is Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default</em>'.
	 * @see IFML.Core.ViewContainer#isIsDefault()
	 * @see #getViewContainer()
	 * @generated
	 */
	EAttribute getViewContainer_IsDefault();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Core.ViewContainer#isIsXOR <em>Is XOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is XOR</em>'.
	 * @see IFML.Core.ViewContainer#isIsXOR()
	 * @see #getViewContainer()
	 * @generated
	 */
	EAttribute getViewContainer_IsXOR();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.ViewContainer#getViewElements <em>View Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Elements</em>'.
	 * @see IFML.Core.ViewContainer#getViewElements()
	 * @see #getViewContainer()
	 * @generated
	 */
	EReference getViewContainer_ViewElements();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.ViewContainer#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see IFML.Core.ViewContainer#getActions()
	 * @see #getViewContainer()
	 * @generated
	 */
	EReference getViewContainer_Actions();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ActivationExpression <em>Activation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Expression</em>'.
	 * @see IFML.Core.ActivationExpression
	 * @generated
	 */
	EClass getActivationExpression();

	/**
	 * Returns the meta object for class '{@link IFML.Core.InteractionFlowModel <em>Interaction Flow Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Flow Model</em>'.
	 * @see IFML.Core.InteractionFlowModel
	 * @generated
	 */
	EClass getInteractionFlowModel();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.InteractionFlowModel#getInteractionFlowModelElements <em>Interaction Flow Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction Flow Model Elements</em>'.
	 * @see IFML.Core.InteractionFlowModel#getInteractionFlowModelElements()
	 * @see #getInteractionFlowModel()
	 * @generated
	 */
	EReference getInteractionFlowModel_InteractionFlowModelElements();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ContextDimension <em>Context Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Dimension</em>'.
	 * @see IFML.Core.ContextDimension
	 * @generated
	 */
	EClass getContextDimension();

	/**
	 * Returns the meta object for class '{@link IFML.Core.IFMLModel <em>IFML Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFML Model</em>'.
	 * @see IFML.Core.IFMLModel
	 * @generated
	 */
	EClass getIFMLModel();

	/**
	 * Returns the meta object for the containment reference '{@link IFML.Core.IFMLModel#getInteractionFlowModel <em>Interaction Flow Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interaction Flow Model</em>'.
	 * @see IFML.Core.IFMLModel#getInteractionFlowModel()
	 * @see #getIFMLModel()
	 * @generated
	 */
	EReference getIFMLModel_InteractionFlowModel();

	/**
	 * Returns the meta object for the containment reference '{@link IFML.Core.IFMLModel#getDomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Model</em>'.
	 * @see IFML.Core.IFMLModel#getDomainModel()
	 * @see #getIFMLModel()
	 * @generated
	 */
	EReference getIFMLModel_DomainModel();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.IFMLModel#getInteractionFlowModelViewpoint <em>Interaction Flow Model Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction Flow Model Viewpoint</em>'.
	 * @see IFML.Core.IFMLModel#getInteractionFlowModelViewpoint()
	 * @see #getIFMLModel()
	 * @generated
	 */
	EReference getIFMLModel_InteractionFlowModelViewpoint();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ModuleDefinition <em>Module Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Definition</em>'.
	 * @see IFML.Core.ModuleDefinition
	 * @generated
	 */
	EClass getModuleDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.ModuleDefinition#getInputPorts <em>Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Ports</em>'.
	 * @see IFML.Core.ModuleDefinition#getInputPorts()
	 * @see #getModuleDefinition()
	 * @generated
	 */
	EReference getModuleDefinition_InputPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.ModuleDefinition#getOutputPorts <em>Output Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Ports</em>'.
	 * @see IFML.Core.ModuleDefinition#getOutputPorts()
	 * @see #getModuleDefinition()
	 * @generated
	 */
	EReference getModuleDefinition_OutputPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.ModuleDefinition#getInteractionFlowModelElement <em>Interaction Flow Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction Flow Model Element</em>'.
	 * @see IFML.Core.ModuleDefinition#getInteractionFlowModelElement()
	 * @see #getModuleDefinition()
	 * @generated
	 */
	EReference getModuleDefinition_InteractionFlowModelElement();

	/**
	 * Returns the meta object for the reference list '{@link IFML.Core.ModuleDefinition#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see IFML.Core.ModuleDefinition#getModules()
	 * @see #getModuleDefinition()
	 * @generated
	 */
	EReference getModuleDefinition_Modules();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.ModuleDefinition#getActivityConcept <em>Activity Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity Concept</em>'.
	 * @see IFML.Core.ModuleDefinition#getActivityConcept()
	 * @see #getModuleDefinition()
	 * @generated
	 */
	EReference getModuleDefinition_ActivityConcept();

	/**
	 * Returns the meta object for class '{@link IFML.Core.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see IFML.Core.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for class '{@link IFML.Core.InteractionFlowElement <em>Interaction Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Flow Element</em>'.
	 * @see IFML.Core.InteractionFlowElement
	 * @generated
	 */
	EClass getInteractionFlowElement();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.InteractionFlowElement#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see IFML.Core.InteractionFlowElement#getParameters()
	 * @see #getInteractionFlowElement()
	 * @generated
	 */
	EReference getInteractionFlowElement_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.InteractionFlowElement#getOutInteractionFlows <em>Out Interaction Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Interaction Flows</em>'.
	 * @see IFML.Core.InteractionFlowElement#getOutInteractionFlows()
	 * @see #getInteractionFlowElement()
	 * @generated
	 */
	EReference getInteractionFlowElement_OutInteractionFlows();

	/**
	 * Returns the meta object for the reference list '{@link IFML.Core.InteractionFlowElement#getInInteractionFlows <em>In Interaction Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Interaction Flows</em>'.
	 * @see IFML.Core.InteractionFlowElement#getInInteractionFlows()
	 * @see #getInteractionFlowElement()
	 * @generated
	 */
	EReference getInteractionFlowElement_InInteractionFlows();

	/**
	 * Returns the meta object for class '{@link IFML.Core.IFMLAction <em>IFML Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFML Action</em>'.
	 * @see IFML.Core.IFMLAction
	 * @generated
	 */
	EClass getIFMLAction();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.IFMLAction#getActionEvents <em>Action Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Events</em>'.
	 * @see IFML.Core.IFMLAction#getActionEvents()
	 * @see #getIFMLAction()
	 * @generated
	 */
	EReference getIFMLAction_ActionEvents();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.IFMLAction#getDynamicBehavior <em>Dynamic Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dynamic Behavior</em>'.
	 * @see IFML.Core.IFMLAction#getDynamicBehavior()
	 * @see #getIFMLAction()
	 * @generated
	 */
	EReference getIFMLAction_DynamicBehavior();

	/**
	 * Returns the meta object for the container reference '{@link IFML.Core.IFMLAction#getViewContainer <em>View Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>View Container</em>'.
	 * @see IFML.Core.IFMLAction#getViewContainer()
	 * @see #getIFMLAction()
	 * @generated
	 */
	EReference getIFMLAction_ViewContainer();

	/**
	 * Returns the meta object for class '{@link IFML.Core.NavigationFlow <em>Navigation Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Flow</em>'.
	 * @see IFML.Core.NavigationFlow
	 * @generated
	 */
	EClass getNavigationFlow();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ParameterBindingGroup <em>Parameter Binding Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Binding Group</em>'.
	 * @see IFML.Core.ParameterBindingGroup
	 * @generated
	 */
	EClass getParameterBindingGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.ParameterBindingGroup#getParameterBindings <em>Parameter Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Bindings</em>'.
	 * @see IFML.Core.ParameterBindingGroup#getParameterBindings()
	 * @see #getParameterBindingGroup()
	 * @generated
	 */
	EReference getParameterBindingGroup_ParameterBindings();

	/**
	 * Returns the meta object for class '{@link IFML.Core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see IFML.Core.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Core.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see IFML.Core.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.Element#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see IFML.Core.Element#getConstraints()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.Element#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see IFML.Core.Element#getAnnotations()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Annotations();

	/**
	 * Returns the meta object for class '{@link IFML.Core.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see IFML.Core.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ViewComponent <em>View Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Component</em>'.
	 * @see IFML.Core.ViewComponent
	 * @generated
	 */
	EClass getViewComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.ViewComponent#getViewComponentParts <em>View Component Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Component Parts</em>'.
	 * @see IFML.Core.ViewComponent#getViewComponentParts()
	 * @see #getViewComponent()
	 * @generated
	 */
	EReference getViewComponent_ViewComponentParts();

	/**
	 * Returns the meta object for class '{@link IFML.Core.IFMLParameter <em>IFML Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFML Parameter</em>'.
	 * @see IFML.Core.IFMLParameter
	 * @generated
	 */
	EClass getIFMLParameter();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Core.IFMLParameter#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see IFML.Core.IFMLParameter#getDirection()
	 * @see #getIFMLParameter()
	 * @generated
	 */
	EAttribute getIFMLParameter_Direction();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.IFMLParameter#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Value</em>'.
	 * @see IFML.Core.IFMLParameter#getDefaultValue()
	 * @see #getIFMLParameter()
	 * @generated
	 */
	EReference getIFMLParameter_DefaultValue();

	/**
	 * Returns the meta object for class '{@link IFML.Core.DataBinding <em>Data Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Binding</em>'.
	 * @see IFML.Core.DataBinding
	 * @generated
	 */
	EClass getDataBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.DataBinding#getConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditional Expression</em>'.
	 * @see IFML.Core.DataBinding#getConditionalExpression()
	 * @see #getDataBinding()
	 * @generated
	 */
	EReference getDataBinding_ConditionalExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.DataBinding#getVisualizationAttribute <em>Visualization Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visualization Attribute</em>'.
	 * @see IFML.Core.DataBinding#getVisualizationAttribute()
	 * @see #getDataBinding()
	 * @generated
	 */
	EReference getDataBinding_VisualizationAttribute();

	/**
	 * Returns the meta object for the reference list '{@link IFML.Core.DataBinding#getDataContextVariables <em>Data Context Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Context Variables</em>'.
	 * @see IFML.Core.DataBinding#getDataContextVariables()
	 * @see #getDataBinding()
	 * @generated
	 */
	EReference getDataBinding_DataContextVariables();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.DataBinding#getDomainConcept <em>Domain Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Concept</em>'.
	 * @see IFML.Core.DataBinding#getDomainConcept()
	 * @see #getDataBinding()
	 * @generated
	 */
	EReference getDataBinding_DomainConcept();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Expression</em>'.
	 * @see IFML.Core.ConditionalExpression
	 * @generated
	 */
	EClass getConditionalExpression();

	/**
	 * Returns the meta object for class '{@link IFML.Core.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see IFML.Core.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.Context#getContextDimensions <em>Context Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Dimensions</em>'.
	 * @see IFML.Core.Context#getContextDimensions()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_ContextDimensions();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.Context#getContextVariables <em>Context Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Variables</em>'.
	 * @see IFML.Core.Context#getContextVariables()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_ContextVariables();

	/**
	 * Returns the meta object for class '{@link IFML.Core.VisualizationAttribute <em>Visualization Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualization Attribute</em>'.
	 * @see IFML.Core.VisualizationAttribute
	 * @generated
	 */
	EClass getVisualizationAttribute();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.VisualizationAttribute#getFeatureConcept <em>Feature Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Concept</em>'.
	 * @see IFML.Core.VisualizationAttribute#getFeatureConcept()
	 * @see #getVisualizationAttribute()
	 * @generated
	 */
	EReference getVisualizationAttribute_FeatureConcept();

	/**
	 * Returns the meta object for class '{@link IFML.Core.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see IFML.Core.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.Event#getActivationExpression <em>Activation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activation Expression</em>'.
	 * @see IFML.Core.Event#getActivationExpression()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_ActivationExpression();

	/**
	 * Returns the meta object for the containment reference '{@link IFML.Core.Event#getInteractionFlowExpression <em>Interaction Flow Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interaction Flow Expression</em>'.
	 * @see IFML.Core.Event#getInteractionFlowExpression()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_InteractionFlowExpression();

	/**
	 * Returns the meta object for class '{@link IFML.Core.InteractionFlowModelElement <em>Interaction Flow Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Flow Model Element</em>'.
	 * @see IFML.Core.InteractionFlowModelElement
	 * @generated
	 */
	EClass getInteractionFlowModelElement();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ViewElementEvent <em>View Element Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Element Event</em>'.
	 * @see IFML.Core.ViewElementEvent
	 * @generated
	 */
	EClass getViewElementEvent();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.ViewElementEvent#getViewElement <em>View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View Element</em>'.
	 * @see IFML.Core.ViewElementEvent#getViewElement()
	 * @see #getViewElementEvent()
	 * @generated
	 */
	EReference getViewElementEvent_ViewElement();

	/**
	 * Returns the meta object for class '{@link IFML.Core.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see IFML.Core.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Core.Annotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see IFML.Core.Annotation#getText()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Text();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ModulePackage <em>Module Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Package</em>'.
	 * @see IFML.Core.ModulePackage
	 * @generated
	 */
	EClass getModulePackage();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Core.ModulePackage#getModularizationElements <em>Modularization Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modularization Elements</em>'.
	 * @see IFML.Core.ModulePackage#getModularizationElements()
	 * @see #getModulePackage()
	 * @generated
	 */
	EReference getModulePackage_ModularizationElements();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ModularizationElement <em>Modularization Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modularization Element</em>'.
	 * @see IFML.Core.ModularizationElement
	 * @generated
	 */
	EClass getModularizationElement();

	/**
	 * Returns the meta object for the container reference '{@link IFML.Core.ModularizationElement#getModulePackage <em>Module Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module Package</em>'.
	 * @see IFML.Core.ModularizationElement#getModulePackage()
	 * @see #getModularizationElement()
	 * @generated
	 */
	EReference getModularizationElement_ModulePackage();

	/**
	 * Returns the meta object for class '{@link IFML.Core.IFMLModule <em>IFML Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFML Module</em>'.
	 * @see IFML.Core.IFMLModule
	 * @generated
	 */
	EClass getIFMLModule();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.IFMLModule#getModuleDefinition <em>Module Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module Definition</em>'.
	 * @see IFML.Core.IFMLModule#getModuleDefinition()
	 * @see #getIFMLModule()
	 * @generated
	 */
	EReference getIFMLModule_ModuleDefinition();

	/**
	 * Returns the meta object for the reference list '{@link IFML.Core.IFMLModule#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ports</em>'.
	 * @see IFML.Core.IFMLModule#getPorts()
	 * @see #getIFMLModule()
	 * @generated
	 */
	EReference getIFMLModule_Ports();

	/**
	 * Returns the meta object for class '{@link IFML.Core.IFMLPort <em>IFML Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFML Port</em>'.
	 * @see IFML.Core.IFMLPort
	 * @generated
	 */
	EClass getIFMLPort();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.IFMLPort#getPortDefinition <em>Port Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Definition</em>'.
	 * @see IFML.Core.IFMLPort#getPortDefinition()
	 * @see #getIFMLPort()
	 * @generated
	 */
	EReference getIFMLPort_PortDefinition();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.IFMLPort#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see IFML.Core.IFMLPort#getModule()
	 * @see #getIFMLPort()
	 * @generated
	 */
	EReference getIFMLPort_Module();

	/**
	 * Returns the meta object for class '{@link IFML.Core.CatchingEvent <em>Catching Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catching Event</em>'.
	 * @see IFML.Core.CatchingEvent
	 * @generated
	 */
	EClass getCatchingEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ThrowingEvent <em>Throwing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throwing Event</em>'.
	 * @see IFML.Core.ThrowingEvent
	 * @generated
	 */
	EClass getThrowingEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Core.BPMNActivityConcept <em>BPMN Activity Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BPMN Activity Concept</em>'.
	 * @see IFML.Core.BPMNActivityConcept
	 * @generated
	 */
	EClass getBPMNActivityConcept();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ContextVariable <em>Context Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Variable</em>'.
	 * @see IFML.Core.ContextVariable
	 * @generated
	 */
	EClass getContextVariable();

	/**
	 * Returns the meta object for the container reference '{@link IFML.Core.ContextVariable#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Context</em>'.
	 * @see IFML.Core.ContextVariable#getContext()
	 * @see #getContextVariable()
	 * @generated
	 */
	EReference getContextVariable_Context();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Core.ContextVariable#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see IFML.Core.ContextVariable#getScope()
	 * @see #getContextVariable()
	 * @generated
	 */
	EAttribute getContextVariable_Scope();

	/**
	 * Returns the meta object for class '{@link IFML.Core.SimpleContextVariable <em>Simple Context Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Context Variable</em>'.
	 * @see IFML.Core.SimpleContextVariable
	 * @generated
	 */
	EClass getSimpleContextVariable();

	/**
	 * Returns the meta object for class '{@link IFML.Core.DataContextVariable <em>Data Context Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Context Variable</em>'.
	 * @see IFML.Core.DataContextVariable
	 * @generated
	 */
	EClass getDataContextVariable();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.DataContextVariable#getDataBinding <em>Data Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Binding</em>'.
	 * @see IFML.Core.DataContextVariable#getDataBinding()
	 * @see #getDataContextVariable()
	 * @generated
	 */
	EReference getDataContextVariable_DataBinding();

	/**
	 * Returns the meta object for class '{@link IFML.Core.DomainConcept <em>Domain Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Concept</em>'.
	 * @see IFML.Core.DomainConcept
	 * @generated
	 */
	EClass getDomainConcept();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.DomainConcept#getDataBinding <em>Data Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Binding</em>'.
	 * @see IFML.Core.DomainConcept#getDataBinding()
	 * @see #getDomainConcept()
	 * @generated
	 */
	EReference getDomainConcept_DataBinding();

	/**
	 * Returns the meta object for class '{@link IFML.Core.FeatureConcept <em>Feature Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Concept</em>'.
	 * @see IFML.Core.FeatureConcept
	 * @generated
	 */
	EClass getFeatureConcept();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.FeatureConcept#getVisualizationAttribute <em>Visualization Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visualization Attribute</em>'.
	 * @see IFML.Core.FeatureConcept#getVisualizationAttribute()
	 * @see #getFeatureConcept()
	 * @generated
	 */
	EReference getFeatureConcept_VisualizationAttribute();

	/**
	 * Returns the meta object for class '{@link IFML.Core.BehaviorConcept <em>Behavior Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Concept</em>'.
	 * @see IFML.Core.BehaviorConcept
	 * @generated
	 */
	EClass getBehaviorConcept();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.BehaviorConcept#getDynamicBehavior <em>Dynamic Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dynamic Behavior</em>'.
	 * @see IFML.Core.BehaviorConcept#getDynamicBehavior()
	 * @see #getBehaviorConcept()
	 * @generated
	 */
	EReference getBehaviorConcept_DynamicBehavior();

	/**
	 * Returns the meta object for class '{@link IFML.Core.BehavioralFeatureConcept <em>Behavioral Feature Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioral Feature Concept</em>'.
	 * @see IFML.Core.BehavioralFeatureConcept
	 * @generated
	 */
	EClass getBehavioralFeatureConcept();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.BehavioralFeatureConcept#getDynamicBehavior <em>Dynamic Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dynamic Behavior</em>'.
	 * @see IFML.Core.BehavioralFeatureConcept#getDynamicBehavior()
	 * @see #getBehavioralFeatureConcept()
	 * @generated
	 */
	EReference getBehavioralFeatureConcept_DynamicBehavior();

	/**
	 * Returns the meta object for class '{@link IFML.Core.UMLBehavior <em>UML Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Behavior</em>'.
	 * @see IFML.Core.UMLBehavior
	 * @generated
	 */
	EClass getUMLBehavior();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.UMLBehavior#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior</em>'.
	 * @see IFML.Core.UMLBehavior#getBehavior()
	 * @see #getUMLBehavior()
	 * @generated
	 */
	EReference getUMLBehavior_Behavior();

	/**
	 * Returns the meta object for class '{@link IFML.Core.UMLBehavioralFeature <em>UML Behavioral Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Behavioral Feature</em>'.
	 * @see IFML.Core.UMLBehavioralFeature
	 * @generated
	 */
	EClass getUMLBehavioralFeature();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.UMLBehavioralFeature#getBehavioralFeature <em>Behavioral Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavioral Feature</em>'.
	 * @see IFML.Core.UMLBehavioralFeature#getBehavioralFeature()
	 * @see #getUMLBehavioralFeature()
	 * @generated
	 */
	EReference getUMLBehavioralFeature_BehavioralFeature();

	/**
	 * Returns the meta object for class '{@link IFML.Core.UMLDomainConcept <em>UML Domain Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Domain Concept</em>'.
	 * @see IFML.Core.UMLDomainConcept
	 * @generated
	 */
	EClass getUMLDomainConcept();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.UMLDomainConcept#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see IFML.Core.UMLDomainConcept#getClassifier()
	 * @see #getUMLDomainConcept()
	 * @generated
	 */
	EReference getUMLDomainConcept_Classifier();

	/**
	 * Returns the meta object for class '{@link IFML.Core.UMLStructuralFeature <em>UML Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Structural Feature</em>'.
	 * @see IFML.Core.UMLStructuralFeature
	 * @generated
	 */
	EClass getUMLStructuralFeature();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.UMLStructuralFeature#getStructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structural Feature</em>'.
	 * @see IFML.Core.UMLStructuralFeature#getStructuralFeature()
	 * @see #getUMLStructuralFeature()
	 * @generated
	 */
	EReference getUMLStructuralFeature_StructuralFeature();

	/**
	 * Returns the meta object for class '{@link IFML.Core.ActivityConcept <em>Activity Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Concept</em>'.
	 * @see IFML.Core.ActivityConcept
	 * @generated
	 */
	EClass getActivityConcept();

	/**
	 * Returns the meta object for the reference '{@link IFML.Core.ActivityConcept#getModuleDefinition <em>Module Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module Definition</em>'.
	 * @see IFML.Core.ActivityConcept#getModuleDefinition()
	 * @see #getActivityConcept()
	 * @generated
	 */
	EReference getActivityConcept_ModuleDefinition();

	/**
	 * Returns the meta object for class '{@link IFML.Core.DomainElement <em>Domain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Element</em>'.
	 * @see IFML.Core.DomainElement
	 * @generated
	 */
	EClass getDomainElement();

	/**
	 * Returns the meta object for class '{@link IFML.Core.IFMLNamedElement <em>IFML Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFML Named Element</em>'.
	 * @see IFML.Core.IFMLNamedElement
	 * @generated
	 */
	EClass getIFMLNamedElement();

	/**
	 * Returns the meta object for the '{@link IFML.Core.IFMLNamedElement#getClientDependency(java.lang.String) <em>Get Client Dependency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Client Dependency</em>' operation.
	 * @see IFML.Core.IFMLNamedElement#getClientDependency(java.lang.String)
	 * @generated
	 */
	EOperation getIFMLNamedElement__GetClientDependency__String();

	/**
	 * Returns the meta object for the '{@link IFML.Core.IFMLNamedElement#getClientDependency(java.lang.String, boolean, org.eclipse.emf.ecore.EClass) <em>Get Client Dependency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Client Dependency</em>' operation.
	 * @see IFML.Core.IFMLNamedElement#getClientDependency(java.lang.String, boolean, org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getIFMLNamedElement__GetClientDependency__String_boolean_EClass();

	/**
	 * Returns the meta object for the '{@link IFML.Core.IFMLNamedElement#createNameExpression(java.lang.String, org.eclipse.uml2.uml.Type) <em>Create Name Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Name Expression</em>' operation.
	 * @see IFML.Core.IFMLNamedElement#createNameExpression(java.lang.String, org.eclipse.uml2.uml.Type)
	 * @generated
	 */
	EOperation getIFMLNamedElement__CreateNameExpression__String_Type();

	/**
	 * Returns the meta object for the '{@link IFML.Core.IFMLNamedElement#createOwnedComment() <em>Create Owned Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Owned Comment</em>' operation.
	 * @see IFML.Core.IFMLNamedElement#createOwnedComment()
	 * @generated
	 */
	EOperation getIFMLNamedElement__CreateOwnedComment();

	/**
	 * Returns the meta object for the '{@link IFML.Core.IFMLNamedElement#create(org.eclipse.emf.ecore.EClass) <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see IFML.Core.IFMLNamedElement#create(org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getIFMLNamedElement__Create__EClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link IFML.Core.impl.InteractionFlowImpl <em>Interaction Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.InteractionFlowImpl
		 * @see IFML.Core.impl.CorePackageImpl#getInteractionFlow()
		 * @generated
		 */
		EClass INTERACTION_FLOW = eINSTANCE.getInteractionFlow();

		/**
		 * The meta object literal for the '<em><b>Parameter Binding Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FLOW__PARAMETER_BINDING_GROUP = eINSTANCE.getInteractionFlow_ParameterBindingGroup();

		/**
		 * The meta object literal for the '<em><b>Source Interaction Flow Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT = eINSTANCE.getInteractionFlow_SourceInteractionFlowElement();

		/**
		 * The meta object literal for the '<em><b>Target Interaction Flow Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FLOW__TARGET_INTERACTION_FLOW_ELEMENT = eINSTANCE.getInteractionFlow_TargetInteractionFlowElement();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.InteractionFlowExpressionImpl <em>Interaction Flow Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.InteractionFlowExpressionImpl
		 * @see IFML.Core.impl.CorePackageImpl#getInteractionFlowExpression()
		 * @generated
		 */
		EClass INTERACTION_FLOW_EXPRESSION = eINSTANCE.getInteractionFlowExpression();

		/**
		 * The meta object literal for the '<em><b>Interaction Flow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FLOW_EXPRESSION__INTERACTION_FLOW = eINSTANCE.getInteractionFlowExpression_InteractionFlow();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.SystemEventImpl <em>System Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.SystemEventImpl
		 * @see IFML.Core.impl.CorePackageImpl#getSystemEvent()
		 * @generated
		 */
		EClass SYSTEM_EVENT = eINSTANCE.getSystemEvent();

		/**
		 * The meta object literal for the '<em><b>Triggering Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_EVENT__TRIGGERING_EXPRESSIONS = eINSTANCE.getSystemEvent_TriggeringExpressions();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_EVENT__TYPE = eINSTANCE.getSystemEvent_Type();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ParameterBindingImpl <em>Parameter Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ParameterBindingImpl
		 * @see IFML.Core.impl.CorePackageImpl#getParameterBinding()
		 * @generated
		 */
		EClass PARAMETER_BINDING = eINSTANCE.getParameterBinding();

		/**
		 * The meta object literal for the '<em><b>Source Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BINDING__SOURCE_PARAMETER = eINSTANCE.getParameterBinding_SourceParameter();

		/**
		 * The meta object literal for the '<em><b>Target Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BINDING__TARGET_PARAMETER = eINSTANCE.getParameterBinding_TargetParameter();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ActionEventImpl <em>Action Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ActionEventImpl
		 * @see IFML.Core.impl.CorePackageImpl#getActionEvent()
		 * @generated
		 */
		EClass ACTION_EVENT = eINSTANCE.getActionEvent();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.DomainModelImpl <em>Domain Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.DomainModelImpl
		 * @see IFML.Core.impl.CorePackageImpl#getDomainModel()
		 * @generated
		 */
		EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

		/**
		 * The meta object literal for the '<em><b>Domain Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__DOMAIN_ELEMENTS = eINSTANCE.getDomainModel_DomainElements();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.PortDefinitionImpl <em>Port Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.PortDefinitionImpl
		 * @see IFML.Core.impl.CorePackageImpl#getPortDefinition()
		 * @generated
		 */
		EClass PORT_DEFINITION = eINSTANCE.getPortDefinition();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_DEFINITION__PORTS = eINSTANCE.getPortDefinition_Ports();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ContentBindingImpl <em>Content Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ContentBindingImpl
		 * @see IFML.Core.impl.CorePackageImpl#getContentBinding()
		 * @generated
		 */
		EClass CONTENT_BINDING = eINSTANCE.getContentBinding();

		/**
		 * The meta object literal for the '<em><b>Uniform Resource Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_BINDING__UNIFORM_RESOURCE_IDENTIFIER = eINSTANCE.getContentBinding_UniformResourceIdentifier();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ViewElementImpl <em>View Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ViewElementImpl
		 * @see IFML.Core.impl.CorePackageImpl#getViewElement()
		 * @generated
		 */
		EClass VIEW_ELEMENT = eINSTANCE.getViewElement();

		/**
		 * The meta object literal for the '<em><b>View Element Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ELEMENT__VIEW_ELEMENT_EVENTS = eINSTANCE.getViewElement_ViewElementEvents();

		/**
		 * The meta object literal for the '<em><b>Activation Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ELEMENT__ACTIVATION_EXPRESSION = eINSTANCE.getViewElement_ActivationExpression();

		/**
		 * The meta object literal for the '<em><b>View Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ELEMENT__VIEW_CONTAINER = eINSTANCE.getViewElement_ViewContainer();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ExpressionImpl
		 * @see IFML.Core.impl.CorePackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__LANGUAGE = eINSTANCE.getExpression_Language();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__BODY = eINSTANCE.getExpression_Body();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.DynamicBehaviorImpl <em>Dynamic Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.DynamicBehaviorImpl
		 * @see IFML.Core.impl.CorePackageImpl#getDynamicBehavior()
		 * @generated
		 */
		EClass DYNAMIC_BEHAVIOR = eINSTANCE.getDynamicBehavior();

		/**
		 * The meta object literal for the '<em><b>Behavioral Feature Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_BEHAVIOR__BEHAVIORAL_FEATURE_CONCEPT = eINSTANCE.getDynamicBehavior_BehavioralFeatureConcept();

		/**
		 * The meta object literal for the '<em><b>Behavior Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_BEHAVIOR__BEHAVIOR_CONCEPT = eINSTANCE.getDynamicBehavior_BehaviorConcept();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ViewpointImpl <em>Viewpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ViewpointImpl
		 * @see IFML.Core.impl.CorePackageImpl#getViewpoint()
		 * @generated
		 */
		EClass VIEWPOINT = eINSTANCE.getViewpoint();

		/**
		 * The meta object literal for the '<em><b>Interaction Flow Model Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__INTERACTION_FLOW_MODEL_ELEMENTS = eINSTANCE.getViewpoint_InteractionFlowModelElements();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWPOINT__CONTEXT = eINSTANCE.getViewpoint_Context();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.DataFlowImpl <em>Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.DataFlowImpl
		 * @see IFML.Core.impl.CorePackageImpl#getDataFlow()
		 * @generated
		 */
		EClass DATA_FLOW = eINSTANCE.getDataFlow();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ViewComponentPartImpl <em>View Component Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ViewComponentPartImpl
		 * @see IFML.Core.impl.CorePackageImpl#getViewComponentPart()
		 * @generated
		 */
		EClass VIEW_COMPONENT_PART = eINSTANCE.getViewComponentPart();

		/**
		 * The meta object literal for the '<em><b>View Element Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS = eINSTANCE.getViewComponentPart_ViewElementEvents();

		/**
		 * The meta object literal for the '<em><b>Activation Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION = eINSTANCE.getViewComponentPart_ActivationExpression();

		/**
		 * The meta object literal for the '<em><b>Parent View Component Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART = eINSTANCE.getViewComponentPart_ParentViewComponentPart();

		/**
		 * The meta object literal for the '<em><b>Sub View Component Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS = eINSTANCE.getViewComponentPart_SubViewComponentParts();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ViewContainerImpl <em>View Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ViewContainerImpl
		 * @see IFML.Core.impl.CorePackageImpl#getViewContainer()
		 * @generated
		 */
		EClass VIEW_CONTAINER = eINSTANCE.getViewContainer();

		/**
		 * The meta object literal for the '<em><b>Is Landmark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_CONTAINER__IS_LANDMARK = eINSTANCE.getViewContainer_IsLandmark();

		/**
		 * The meta object literal for the '<em><b>Is Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_CONTAINER__IS_DEFAULT = eINSTANCE.getViewContainer_IsDefault();

		/**
		 * The meta object literal for the '<em><b>Is XOR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_CONTAINER__IS_XOR = eINSTANCE.getViewContainer_IsXOR();

		/**
		 * The meta object literal for the '<em><b>View Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_CONTAINER__VIEW_ELEMENTS = eINSTANCE.getViewContainer_ViewElements();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_CONTAINER__ACTIONS = eINSTANCE.getViewContainer_Actions();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ActivationExpressionImpl <em>Activation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ActivationExpressionImpl
		 * @see IFML.Core.impl.CorePackageImpl#getActivationExpression()
		 * @generated
		 */
		EClass ACTIVATION_EXPRESSION = eINSTANCE.getActivationExpression();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.InteractionFlowModelImpl <em>Interaction Flow Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.InteractionFlowModelImpl
		 * @see IFML.Core.impl.CorePackageImpl#getInteractionFlowModel()
		 * @generated
		 */
		EClass INTERACTION_FLOW_MODEL = eINSTANCE.getInteractionFlowModel();

		/**
		 * The meta object literal for the '<em><b>Interaction Flow Model Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS = eINSTANCE.getInteractionFlowModel_InteractionFlowModelElements();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ContextDimensionImpl <em>Context Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ContextDimensionImpl
		 * @see IFML.Core.impl.CorePackageImpl#getContextDimension()
		 * @generated
		 */
		EClass CONTEXT_DIMENSION = eINSTANCE.getContextDimension();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.IFMLModelImpl <em>IFML Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.IFMLModelImpl
		 * @see IFML.Core.impl.CorePackageImpl#getIFMLModel()
		 * @generated
		 */
		EClass IFML_MODEL = eINSTANCE.getIFMLModel();

		/**
		 * The meta object literal for the '<em><b>Interaction Flow Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFML_MODEL__INTERACTION_FLOW_MODEL = eINSTANCE.getIFMLModel_InteractionFlowModel();

		/**
		 * The meta object literal for the '<em><b>Domain Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFML_MODEL__DOMAIN_MODEL = eINSTANCE.getIFMLModel_DomainModel();

		/**
		 * The meta object literal for the '<em><b>Interaction Flow Model Viewpoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFML_MODEL__INTERACTION_FLOW_MODEL_VIEWPOINT = eINSTANCE.getIFMLModel_InteractionFlowModelViewpoint();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ModuleDefinitionImpl <em>Module Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ModuleDefinitionImpl
		 * @see IFML.Core.impl.CorePackageImpl#getModuleDefinition()
		 * @generated
		 */
		EClass MODULE_DEFINITION = eINSTANCE.getModuleDefinition();

		/**
		 * The meta object literal for the '<em><b>Input Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DEFINITION__INPUT_PORTS = eINSTANCE.getModuleDefinition_InputPorts();

		/**
		 * The meta object literal for the '<em><b>Output Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DEFINITION__OUTPUT_PORTS = eINSTANCE.getModuleDefinition_OutputPorts();

		/**
		 * The meta object literal for the '<em><b>Interaction Flow Model Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT = eINSTANCE.getModuleDefinition_InteractionFlowModelElement();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DEFINITION__MODULES = eINSTANCE.getModuleDefinition_Modules();

		/**
		 * The meta object literal for the '<em><b>Activity Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DEFINITION__ACTIVITY_CONCEPT = eINSTANCE.getModuleDefinition_ActivityConcept();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.BooleanExpressionImpl
		 * @see IFML.Core.impl.CorePackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.InteractionFlowElementImpl <em>Interaction Flow Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.InteractionFlowElementImpl
		 * @see IFML.Core.impl.CorePackageImpl#getInteractionFlowElement()
		 * @generated
		 */
		EClass INTERACTION_FLOW_ELEMENT = eINSTANCE.getInteractionFlowElement();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FLOW_ELEMENT__PARAMETERS = eINSTANCE.getInteractionFlowElement_Parameters();

		/**
		 * The meta object literal for the '<em><b>Out Interaction Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS = eINSTANCE.getInteractionFlowElement_OutInteractionFlows();

		/**
		 * The meta object literal for the '<em><b>In Interaction Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS = eINSTANCE.getInteractionFlowElement_InInteractionFlows();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.IFMLActionImpl <em>IFML Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.IFMLActionImpl
		 * @see IFML.Core.impl.CorePackageImpl#getIFMLAction()
		 * @generated
		 */
		EClass IFML_ACTION = eINSTANCE.getIFMLAction();

		/**
		 * The meta object literal for the '<em><b>Action Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFML_ACTION__ACTION_EVENTS = eINSTANCE.getIFMLAction_ActionEvents();

		/**
		 * The meta object literal for the '<em><b>Dynamic Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFML_ACTION__DYNAMIC_BEHAVIOR = eINSTANCE.getIFMLAction_DynamicBehavior();

		/**
		 * The meta object literal for the '<em><b>View Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFML_ACTION__VIEW_CONTAINER = eINSTANCE.getIFMLAction_ViewContainer();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.NavigationFlowImpl <em>Navigation Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.NavigationFlowImpl
		 * @see IFML.Core.impl.CorePackageImpl#getNavigationFlow()
		 * @generated
		 */
		EClass NAVIGATION_FLOW = eINSTANCE.getNavigationFlow();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ParameterBindingGroupImpl <em>Parameter Binding Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ParameterBindingGroupImpl
		 * @see IFML.Core.impl.CorePackageImpl#getParameterBindingGroup()
		 * @generated
		 */
		EClass PARAMETER_BINDING_GROUP = eINSTANCE.getParameterBindingGroup();

		/**
		 * The meta object literal for the '<em><b>Parameter Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BINDING_GROUP__PARAMETER_BINDINGS = eINSTANCE.getParameterBindingGroup_ParameterBindings();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ElementImpl
		 * @see IFML.Core.impl.CorePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CONSTRAINTS = eINSTANCE.getElement_Constraints();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ANNOTATIONS = eINSTANCE.getElement_Annotations();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ConstraintImpl
		 * @see IFML.Core.impl.CorePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ViewComponentImpl <em>View Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ViewComponentImpl
		 * @see IFML.Core.impl.CorePackageImpl#getViewComponent()
		 * @generated
		 */
		EClass VIEW_COMPONENT = eINSTANCE.getViewComponent();

		/**
		 * The meta object literal for the '<em><b>View Component Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_COMPONENT__VIEW_COMPONENT_PARTS = eINSTANCE.getViewComponent_ViewComponentParts();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.IFMLParameterImpl <em>IFML Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.IFMLParameterImpl
		 * @see IFML.Core.impl.CorePackageImpl#getIFMLParameter()
		 * @generated
		 */
		EClass IFML_PARAMETER = eINSTANCE.getIFMLParameter();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFML_PARAMETER__DIRECTION = eINSTANCE.getIFMLParameter_Direction();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFML_PARAMETER__DEFAULT_VALUE = eINSTANCE.getIFMLParameter_DefaultValue();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.DataBindingImpl <em>Data Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.DataBindingImpl
		 * @see IFML.Core.impl.CorePackageImpl#getDataBinding()
		 * @generated
		 */
		EClass DATA_BINDING = eINSTANCE.getDataBinding();

		/**
		 * The meta object literal for the '<em><b>Conditional Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BINDING__CONDITIONAL_EXPRESSION = eINSTANCE.getDataBinding_ConditionalExpression();

		/**
		 * The meta object literal for the '<em><b>Visualization Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BINDING__VISUALIZATION_ATTRIBUTE = eINSTANCE.getDataBinding_VisualizationAttribute();

		/**
		 * The meta object literal for the '<em><b>Data Context Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BINDING__DATA_CONTEXT_VARIABLES = eINSTANCE.getDataBinding_DataContextVariables();

		/**
		 * The meta object literal for the '<em><b>Domain Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_BINDING__DOMAIN_CONCEPT = eINSTANCE.getDataBinding_DomainConcept();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ConditionalExpressionImpl
		 * @see IFML.Core.impl.CorePackageImpl#getConditionalExpression()
		 * @generated
		 */
		EClass CONDITIONAL_EXPRESSION = eINSTANCE.getConditionalExpression();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ContextImpl
		 * @see IFML.Core.impl.CorePackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Context Dimensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__CONTEXT_DIMENSIONS = eINSTANCE.getContext_ContextDimensions();

		/**
		 * The meta object literal for the '<em><b>Context Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__CONTEXT_VARIABLES = eINSTANCE.getContext_ContextVariables();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.VisualizationAttributeImpl <em>Visualization Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.VisualizationAttributeImpl
		 * @see IFML.Core.impl.CorePackageImpl#getVisualizationAttribute()
		 * @generated
		 */
		EClass VISUALIZATION_ATTRIBUTE = eINSTANCE.getVisualizationAttribute();

		/**
		 * The meta object literal for the '<em><b>Feature Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALIZATION_ATTRIBUTE__FEATURE_CONCEPT = eINSTANCE.getVisualizationAttribute_FeatureConcept();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.EventImpl
		 * @see IFML.Core.impl.CorePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Activation Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__ACTIVATION_EXPRESSION = eINSTANCE.getEvent_ActivationExpression();

		/**
		 * The meta object literal for the '<em><b>Interaction Flow Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__INTERACTION_FLOW_EXPRESSION = eINSTANCE.getEvent_InteractionFlowExpression();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.InteractionFlowModelElementImpl <em>Interaction Flow Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.InteractionFlowModelElementImpl
		 * @see IFML.Core.impl.CorePackageImpl#getInteractionFlowModelElement()
		 * @generated
		 */
		EClass INTERACTION_FLOW_MODEL_ELEMENT = eINSTANCE.getInteractionFlowModelElement();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ViewElementEventImpl <em>View Element Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ViewElementEventImpl
		 * @see IFML.Core.impl.CorePackageImpl#getViewElementEvent()
		 * @generated
		 */
		EClass VIEW_ELEMENT_EVENT = eINSTANCE.getViewElementEvent();

		/**
		 * The meta object literal for the '<em><b>View Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ELEMENT_EVENT__VIEW_ELEMENT = eINSTANCE.getViewElementEvent_ViewElement();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.AnnotationImpl
		 * @see IFML.Core.impl.CorePackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ModulePackageImpl <em>Module Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ModulePackageImpl
		 * @see IFML.Core.impl.CorePackageImpl#getModulePackage()
		 * @generated
		 */
		EClass MODULE_PACKAGE = eINSTANCE.getModulePackage();

		/**
		 * The meta object literal for the '<em><b>Modularization Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_PACKAGE__MODULARIZATION_ELEMENTS = eINSTANCE.getModulePackage_ModularizationElements();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ModularizationElementImpl <em>Modularization Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ModularizationElementImpl
		 * @see IFML.Core.impl.CorePackageImpl#getModularizationElement()
		 * @generated
		 */
		EClass MODULARIZATION_ELEMENT = eINSTANCE.getModularizationElement();

		/**
		 * The meta object literal for the '<em><b>Module Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULARIZATION_ELEMENT__MODULE_PACKAGE = eINSTANCE.getModularizationElement_ModulePackage();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.IFMLModuleImpl <em>IFML Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.IFMLModuleImpl
		 * @see IFML.Core.impl.CorePackageImpl#getIFMLModule()
		 * @generated
		 */
		EClass IFML_MODULE = eINSTANCE.getIFMLModule();

		/**
		 * The meta object literal for the '<em><b>Module Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFML_MODULE__MODULE_DEFINITION = eINSTANCE.getIFMLModule_ModuleDefinition();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFML_MODULE__PORTS = eINSTANCE.getIFMLModule_Ports();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.IFMLPortImpl <em>IFML Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.IFMLPortImpl
		 * @see IFML.Core.impl.CorePackageImpl#getIFMLPort()
		 * @generated
		 */
		EClass IFML_PORT = eINSTANCE.getIFMLPort();

		/**
		 * The meta object literal for the '<em><b>Port Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFML_PORT__PORT_DEFINITION = eINSTANCE.getIFMLPort_PortDefinition();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFML_PORT__MODULE = eINSTANCE.getIFMLPort_Module();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.CatchingEventImpl <em>Catching Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.CatchingEventImpl
		 * @see IFML.Core.impl.CorePackageImpl#getCatchingEvent()
		 * @generated
		 */
		EClass CATCHING_EVENT = eINSTANCE.getCatchingEvent();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ThrowingEventImpl <em>Throwing Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ThrowingEventImpl
		 * @see IFML.Core.impl.CorePackageImpl#getThrowingEvent()
		 * @generated
		 */
		EClass THROWING_EVENT = eINSTANCE.getThrowingEvent();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.BPMNActivityConceptImpl <em>BPMN Activity Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.BPMNActivityConceptImpl
		 * @see IFML.Core.impl.CorePackageImpl#getBPMNActivityConcept()
		 * @generated
		 */
		EClass BPMN_ACTIVITY_CONCEPT = eINSTANCE.getBPMNActivityConcept();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ContextVariableImpl <em>Context Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ContextVariableImpl
		 * @see IFML.Core.impl.CorePackageImpl#getContextVariable()
		 * @generated
		 */
		EClass CONTEXT_VARIABLE = eINSTANCE.getContextVariable();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_VARIABLE__CONTEXT = eINSTANCE.getContextVariable_Context();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_VARIABLE__SCOPE = eINSTANCE.getContextVariable_Scope();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.SimpleContextVariableImpl <em>Simple Context Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.SimpleContextVariableImpl
		 * @see IFML.Core.impl.CorePackageImpl#getSimpleContextVariable()
		 * @generated
		 */
		EClass SIMPLE_CONTEXT_VARIABLE = eINSTANCE.getSimpleContextVariable();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.DataContextVariableImpl <em>Data Context Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.DataContextVariableImpl
		 * @see IFML.Core.impl.CorePackageImpl#getDataContextVariable()
		 * @generated
		 */
		EClass DATA_CONTEXT_VARIABLE = eINSTANCE.getDataContextVariable();

		/**
		 * The meta object literal for the '<em><b>Data Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTEXT_VARIABLE__DATA_BINDING = eINSTANCE.getDataContextVariable_DataBinding();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.DomainConceptImpl <em>Domain Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.DomainConceptImpl
		 * @see IFML.Core.impl.CorePackageImpl#getDomainConcept()
		 * @generated
		 */
		EClass DOMAIN_CONCEPT = eINSTANCE.getDomainConcept();

		/**
		 * The meta object literal for the '<em><b>Data Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_CONCEPT__DATA_BINDING = eINSTANCE.getDomainConcept_DataBinding();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.FeatureConceptImpl <em>Feature Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.FeatureConceptImpl
		 * @see IFML.Core.impl.CorePackageImpl#getFeatureConcept()
		 * @generated
		 */
		EClass FEATURE_CONCEPT = eINSTANCE.getFeatureConcept();

		/**
		 * The meta object literal for the '<em><b>Visualization Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CONCEPT__VISUALIZATION_ATTRIBUTE = eINSTANCE.getFeatureConcept_VisualizationAttribute();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.BehaviorConceptImpl <em>Behavior Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.BehaviorConceptImpl
		 * @see IFML.Core.impl.CorePackageImpl#getBehaviorConcept()
		 * @generated
		 */
		EClass BEHAVIOR_CONCEPT = eINSTANCE.getBehaviorConcept();

		/**
		 * The meta object literal for the '<em><b>Dynamic Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CONCEPT__DYNAMIC_BEHAVIOR = eINSTANCE.getBehaviorConcept_DynamicBehavior();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.BehavioralFeatureConceptImpl <em>Behavioral Feature Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.BehavioralFeatureConceptImpl
		 * @see IFML.Core.impl.CorePackageImpl#getBehavioralFeatureConcept()
		 * @generated
		 */
		EClass BEHAVIORAL_FEATURE_CONCEPT = eINSTANCE.getBehavioralFeatureConcept();

		/**
		 * The meta object literal for the '<em><b>Dynamic Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORAL_FEATURE_CONCEPT__DYNAMIC_BEHAVIOR = eINSTANCE.getBehavioralFeatureConcept_DynamicBehavior();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.UMLBehaviorImpl <em>UML Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.UMLBehaviorImpl
		 * @see IFML.Core.impl.CorePackageImpl#getUMLBehavior()
		 * @generated
		 */
		EClass UML_BEHAVIOR = eINSTANCE.getUMLBehavior();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_BEHAVIOR__BEHAVIOR = eINSTANCE.getUMLBehavior_Behavior();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.UMLBehavioralFeatureImpl <em>UML Behavioral Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.UMLBehavioralFeatureImpl
		 * @see IFML.Core.impl.CorePackageImpl#getUMLBehavioralFeature()
		 * @generated
		 */
		EClass UML_BEHAVIORAL_FEATURE = eINSTANCE.getUMLBehavioralFeature();

		/**
		 * The meta object literal for the '<em><b>Behavioral Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_BEHAVIORAL_FEATURE__BEHAVIORAL_FEATURE = eINSTANCE.getUMLBehavioralFeature_BehavioralFeature();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.UMLDomainConceptImpl <em>UML Domain Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.UMLDomainConceptImpl
		 * @see IFML.Core.impl.CorePackageImpl#getUMLDomainConcept()
		 * @generated
		 */
		EClass UML_DOMAIN_CONCEPT = eINSTANCE.getUMLDomainConcept();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_DOMAIN_CONCEPT__CLASSIFIER = eINSTANCE.getUMLDomainConcept_Classifier();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.UMLStructuralFeatureImpl <em>UML Structural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.UMLStructuralFeatureImpl
		 * @see IFML.Core.impl.CorePackageImpl#getUMLStructuralFeature()
		 * @generated
		 */
		EClass UML_STRUCTURAL_FEATURE = eINSTANCE.getUMLStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Structural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_STRUCTURAL_FEATURE__STRUCTURAL_FEATURE = eINSTANCE.getUMLStructuralFeature_StructuralFeature();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.ActivityConceptImpl <em>Activity Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.ActivityConceptImpl
		 * @see IFML.Core.impl.CorePackageImpl#getActivityConcept()
		 * @generated
		 */
		EClass ACTIVITY_CONCEPT = eINSTANCE.getActivityConcept();

		/**
		 * The meta object literal for the '<em><b>Module Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONCEPT__MODULE_DEFINITION = eINSTANCE.getActivityConcept_ModuleDefinition();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.DomainElementImpl <em>Domain Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.DomainElementImpl
		 * @see IFML.Core.impl.CorePackageImpl#getDomainElement()
		 * @generated
		 */
		EClass DOMAIN_ELEMENT = eINSTANCE.getDomainElement();

		/**
		 * The meta object literal for the '{@link IFML.Core.impl.IFMLNamedElementImpl <em>IFML Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Core.impl.IFMLNamedElementImpl
		 * @see IFML.Core.impl.CorePackageImpl#getIFMLNamedElement()
		 * @generated
		 */
		EClass IFML_NAMED_ELEMENT = eINSTANCE.getIFMLNamedElement();

		/**
		 * The meta object literal for the '<em><b>Get Client Dependency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFML_NAMED_ELEMENT___GET_CLIENT_DEPENDENCY__STRING = eINSTANCE.getIFMLNamedElement__GetClientDependency__String();

		/**
		 * The meta object literal for the '<em><b>Get Client Dependency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFML_NAMED_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = eINSTANCE.getIFMLNamedElement__GetClientDependency__String_boolean_EClass();

		/**
		 * The meta object literal for the '<em><b>Create Name Expression</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFML_NAMED_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE = eINSTANCE.getIFMLNamedElement__CreateNameExpression__String_Type();

		/**
		 * The meta object literal for the '<em><b>Create Owned Comment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFML_NAMED_ELEMENT___CREATE_OWNED_COMMENT = eINSTANCE.getIFMLNamedElement__CreateOwnedComment();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFML_NAMED_ELEMENT___CREATE__ECLASS = eINSTANCE.getIFMLNamedElement__Create__EClass();

	}

} //CorePackage
