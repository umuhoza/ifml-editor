/**
 */
package IFML.Extensions;

import IFML.Core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see IFML.Extensions.ExtensionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExtensionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Extensions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/20130218/ext";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ext";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtensionsPackage eINSTANCE = IFML.Extensions.impl.ExtensionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.OnSubmitEventImpl <em>On Submit Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.OnSubmitEventImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getOnSubmitEvent()
	 * @generated
	 */
	int ON_SUBMIT_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__ID = CorePackage.VIEW_ELEMENT_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__CONSTRAINTS = CorePackage.VIEW_ELEMENT_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__ANNOTATIONS = CorePackage.VIEW_ELEMENT_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__EANNOTATIONS = CorePackage.VIEW_ELEMENT_EVENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__OWNED_COMMENT = CorePackage.VIEW_ELEMENT_EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__OWNED_ELEMENT = CorePackage.VIEW_ELEMENT_EVENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__OWNER = CorePackage.VIEW_ELEMENT_EVENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__CLIENT_DEPENDENCY = CorePackage.VIEW_ELEMENT_EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__NAME = CorePackage.VIEW_ELEMENT_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__NAME_EXPRESSION = CorePackage.VIEW_ELEMENT_EVENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__NAMESPACE = CorePackage.VIEW_ELEMENT_EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__QUALIFIED_NAME = CorePackage.VIEW_ELEMENT_EVENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__VISIBILITY = CorePackage.VIEW_ELEMENT_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__PARAMETERS = CorePackage.VIEW_ELEMENT_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__OUT_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__IN_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__ACTIVATION_EXPRESSION = CorePackage.VIEW_ELEMENT_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__INTERACTION_FLOW_EXPRESSION = CorePackage.VIEW_ELEMENT_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT__VIEW_ELEMENT = CorePackage.VIEW_ELEMENT_EVENT__VIEW_ELEMENT;

	/**
	 * The number of structural features of the '<em>On Submit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT_FEATURE_COUNT = CorePackage.VIEW_ELEMENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_EANNOTATION__STRING = CorePackage.VIEW_ELEMENT_EVENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_ELEMENT_EVENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_ELEMENT_EVENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___ADD_KEYWORD__STRING = CorePackage.VIEW_ELEMENT_EVENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___APPLY_STEREOTYPE__STEREOTYPE = CorePackage.VIEW_ELEMENT_EVENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___CREATE_EANNOTATION__STRING = CorePackage.VIEW_ELEMENT_EVENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___DESTROY = CorePackage.VIEW_ELEMENT_EVENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_KEYWORDS = CorePackage.VIEW_ELEMENT_EVENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_APPLICABLE_STEREOTYPE__STRING = CorePackage.VIEW_ELEMENT_EVENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_APPLICABLE_STEREOTYPES = CorePackage.VIEW_ELEMENT_EVENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_APPLIED_STEREOTYPE__STRING = CorePackage.VIEW_ELEMENT_EVENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_APPLIED_STEREOTYPES = CorePackage.VIEW_ELEMENT_EVENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = CorePackage.VIEW_ELEMENT_EVENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = CorePackage.VIEW_ELEMENT_EVENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_MODEL = CorePackage.VIEW_ELEMENT_EVENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_NEAREST_PACKAGE = CorePackage.VIEW_ELEMENT_EVENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_RELATIONSHIPS = CorePackage.VIEW_ELEMENT_EVENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_RELATIONSHIPS__ECLASS = CorePackage.VIEW_ELEMENT_EVENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_REQUIRED_STEREOTYPE__STRING = CorePackage.VIEW_ELEMENT_EVENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_REQUIRED_STEREOTYPES = CorePackage.VIEW_ELEMENT_EVENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = CorePackage.VIEW_ELEMENT_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.VIEW_ELEMENT_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = CorePackage.VIEW_ELEMENT_EVENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_STEREOTYPE_APPLICATIONS = CorePackage.VIEW_ELEMENT_EVENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS = CorePackage.VIEW_ELEMENT_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.VIEW_ELEMENT_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_VALUE__STEREOTYPE_STRING = CorePackage.VIEW_ELEMENT_EVENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___HAS_KEYWORD__STRING = CorePackage.VIEW_ELEMENT_EVENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___HAS_VALUE__STEREOTYPE_STRING = CorePackage.VIEW_ELEMENT_EVENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = CorePackage.VIEW_ELEMENT_EVENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = CorePackage.VIEW_ELEMENT_EVENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = CorePackage.VIEW_ELEMENT_EVENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___REMOVE_KEYWORD__STRING = CorePackage.VIEW_ELEMENT_EVENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = CorePackage.VIEW_ELEMENT_EVENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___UNAPPLY_STEREOTYPE__STEREOTYPE = CorePackage.VIEW_ELEMENT_EVENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___ALL_OWNED_ELEMENTS = CorePackage.VIEW_ELEMENT_EVENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___MUST_BE_OWNED = CorePackage.VIEW_ELEMENT_EVENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_ELEMENT_EVENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_ELEMENT_EVENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_ELEMENT_EVENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___CREATE_DEPENDENCY__NAMEDELEMENT = CorePackage.VIEW_ELEMENT_EVENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___CREATE_USAGE__NAMEDELEMENT = CorePackage.VIEW_ELEMENT_EVENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_LABEL = CorePackage.VIEW_ELEMENT_EVENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_LABEL__BOOLEAN = CorePackage.VIEW_ELEMENT_EVENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___ALL_NAMESPACES = CorePackage.VIEW_ELEMENT_EVENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___ALL_OWNING_PACKAGES = CorePackage.VIEW_ELEMENT_EVENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CorePackage.VIEW_ELEMENT_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_NAMESPACE = CorePackage.VIEW_ELEMENT_EVENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_QUALIFIED_NAME = CorePackage.VIEW_ELEMENT_EVENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___SEPARATOR = CorePackage.VIEW_ELEMENT_EVENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_CLIENT_DEPENDENCY__STRING = CorePackage.VIEW_ELEMENT_EVENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = CorePackage.VIEW_ELEMENT_EVENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___CREATE_NAME_EXPRESSION__STRING_TYPE = CorePackage.VIEW_ELEMENT_EVENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___CREATE_OWNED_COMMENT = CorePackage.VIEW_ELEMENT_EVENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT___CREATE__ECLASS = CorePackage.VIEW_ELEMENT_EVENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>On Submit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SUBMIT_EVENT_OPERATION_COUNT = CorePackage.VIEW_ELEMENT_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.ValidationRuleImpl <em>Validation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.ValidationRuleImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getValidationRule()
	 * @generated
	 */
	int VALIDATION_RULE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__ID = CorePackage.CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__CONSTRAINTS = CorePackage.CONSTRAINT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__ANNOTATIONS = CorePackage.CONSTRAINT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__LANGUAGE = CorePackage.CONSTRAINT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE__BODY = CorePackage.CONSTRAINT__BODY;

	/**
	 * The number of structural features of the '<em>Validation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE_FEATURE_COUNT = CorePackage.CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Validation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_RULE_OPERATION_COUNT = CorePackage.CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.ListImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getList()
	 * @generated
	 */
	int LIST = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ID = CorePackage.VIEW_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CONSTRAINTS = CorePackage.VIEW_COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ANNOTATIONS = CorePackage.VIEW_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__EANNOTATIONS = CorePackage.VIEW_COMPONENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__OWNED_COMMENT = CorePackage.VIEW_COMPONENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__OWNED_ELEMENT = CorePackage.VIEW_COMPONENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__OWNER = CorePackage.VIEW_COMPONENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CLIENT_DEPENDENCY = CorePackage.VIEW_COMPONENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__NAME = CorePackage.VIEW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__NAME_EXPRESSION = CorePackage.VIEW_COMPONENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__NAMESPACE = CorePackage.VIEW_COMPONENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__QUALIFIED_NAME = CorePackage.VIEW_COMPONENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__VISIBILITY = CorePackage.VIEW_COMPONENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__PARAMETERS = CorePackage.VIEW_COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__OUT_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__IN_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_COMPONENT__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ACTIVATION_EXPRESSION = CorePackage.VIEW_COMPONENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__VIEW_CONTAINER = CorePackage.VIEW_COMPONENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__VIEW_COMPONENT_PARTS = CorePackage.VIEW_COMPONENT__VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Select Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__SELECT_EVENT = CorePackage.VIEW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = CorePackage.VIEW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_EANNOTATION__STRING = CorePackage.VIEW_COMPONENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___ADD_KEYWORD__STRING = CorePackage.VIEW_COMPONENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___APPLY_STEREOTYPE__STEREOTYPE = CorePackage.VIEW_COMPONENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___CREATE_EANNOTATION__STRING = CorePackage.VIEW_COMPONENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___DESTROY = CorePackage.VIEW_COMPONENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_KEYWORDS = CorePackage.VIEW_COMPONENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_APPLICABLE_STEREOTYPE__STRING = CorePackage.VIEW_COMPONENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_APPLICABLE_STEREOTYPES = CorePackage.VIEW_COMPONENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_APPLIED_STEREOTYPE__STRING = CorePackage.VIEW_COMPONENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_APPLIED_STEREOTYPES = CorePackage.VIEW_COMPONENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = CorePackage.VIEW_COMPONENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = CorePackage.VIEW_COMPONENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_MODEL = CorePackage.VIEW_COMPONENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_NEAREST_PACKAGE = CorePackage.VIEW_COMPONENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_RELATIONSHIPS = CorePackage.VIEW_COMPONENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_RELATIONSHIPS__ECLASS = CorePackage.VIEW_COMPONENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_REQUIRED_STEREOTYPE__STRING = CorePackage.VIEW_COMPONENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_REQUIRED_STEREOTYPES = CorePackage.VIEW_COMPONENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_SOURCE_DIRECTED_RELATIONSHIPS = CorePackage.VIEW_COMPONENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.VIEW_COMPONENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_STEREOTYPE_APPLICATION__STEREOTYPE = CorePackage.VIEW_COMPONENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_STEREOTYPE_APPLICATIONS = CorePackage.VIEW_COMPONENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_TARGET_DIRECTED_RELATIONSHIPS = CorePackage.VIEW_COMPONENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.VIEW_COMPONENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_VALUE__STEREOTYPE_STRING = CorePackage.VIEW_COMPONENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___HAS_KEYWORD__STRING = CorePackage.VIEW_COMPONENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___HAS_VALUE__STEREOTYPE_STRING = CorePackage.VIEW_COMPONENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = CorePackage.VIEW_COMPONENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___IS_STEREOTYPE_APPLIED__STEREOTYPE = CorePackage.VIEW_COMPONENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___IS_STEREOTYPE_REQUIRED__STEREOTYPE = CorePackage.VIEW_COMPONENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___REMOVE_KEYWORD__STRING = CorePackage.VIEW_COMPONENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___SET_VALUE__STEREOTYPE_STRING_OBJECT = CorePackage.VIEW_COMPONENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___UNAPPLY_STEREOTYPE__STEREOTYPE = CorePackage.VIEW_COMPONENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___ALL_OWNED_ELEMENTS = CorePackage.VIEW_COMPONENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___MUST_BE_OWNED = CorePackage.VIEW_COMPONENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___CREATE_DEPENDENCY__NAMEDELEMENT = CorePackage.VIEW_COMPONENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___CREATE_USAGE__NAMEDELEMENT = CorePackage.VIEW_COMPONENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_LABEL = CorePackage.VIEW_COMPONENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_LABEL__BOOLEAN = CorePackage.VIEW_COMPONENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___ALL_NAMESPACES = CorePackage.VIEW_COMPONENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___ALL_OWNING_PACKAGES = CorePackage.VIEW_COMPONENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CorePackage.VIEW_COMPONENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_NAMESPACE = CorePackage.VIEW_COMPONENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_QUALIFIED_NAME = CorePackage.VIEW_COMPONENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___SEPARATOR = CorePackage.VIEW_COMPONENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_CLIENT_DEPENDENCY__STRING = CorePackage.VIEW_COMPONENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = CorePackage.VIEW_COMPONENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___CREATE_NAME_EXPRESSION__STRING_TYPE = CorePackage.VIEW_COMPONENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___CREATE_OWNED_COMMENT = CorePackage.VIEW_COMPONENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST___CREATE__ECLASS = CorePackage.VIEW_COMPONENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = CorePackage.VIEW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.PositionImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__EANNOTATIONS = CorePackage.CONTEXT_DIMENSION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__OWNED_COMMENT = CorePackage.CONTEXT_DIMENSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__OWNED_ELEMENT = CorePackage.CONTEXT_DIMENSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__OWNER = CorePackage.CONTEXT_DIMENSION__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__CLIENT_DEPENDENCY = CorePackage.CONTEXT_DIMENSION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__NAME = CorePackage.CONTEXT_DIMENSION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__NAME_EXPRESSION = CorePackage.CONTEXT_DIMENSION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__NAMESPACE = CorePackage.CONTEXT_DIMENSION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__QUALIFIED_NAME = CorePackage.CONTEXT_DIMENSION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__VISIBILITY = CorePackage.CONTEXT_DIMENSION__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = CorePackage.CONTEXT_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_EANNOTATION__STRING = CorePackage.CONTEXT_DIMENSION___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = CorePackage.CONTEXT_DIMENSION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = CorePackage.CONTEXT_DIMENSION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___ADD_KEYWORD__STRING = CorePackage.CONTEXT_DIMENSION___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___APPLY_STEREOTYPE__STEREOTYPE = CorePackage.CONTEXT_DIMENSION___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___CREATE_EANNOTATION__STRING = CorePackage.CONTEXT_DIMENSION___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___DESTROY = CorePackage.CONTEXT_DIMENSION___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_KEYWORDS = CorePackage.CONTEXT_DIMENSION___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_APPLICABLE_STEREOTYPE__STRING = CorePackage.CONTEXT_DIMENSION___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_APPLICABLE_STEREOTYPES = CorePackage.CONTEXT_DIMENSION___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_APPLIED_STEREOTYPE__STRING = CorePackage.CONTEXT_DIMENSION___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_APPLIED_STEREOTYPES = CorePackage.CONTEXT_DIMENSION___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = CorePackage.CONTEXT_DIMENSION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = CorePackage.CONTEXT_DIMENSION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_MODEL = CorePackage.CONTEXT_DIMENSION___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_NEAREST_PACKAGE = CorePackage.CONTEXT_DIMENSION___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_RELATIONSHIPS = CorePackage.CONTEXT_DIMENSION___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_RELATIONSHIPS__ECLASS = CorePackage.CONTEXT_DIMENSION___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_REQUIRED_STEREOTYPE__STRING = CorePackage.CONTEXT_DIMENSION___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_REQUIRED_STEREOTYPES = CorePackage.CONTEXT_DIMENSION___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_SOURCE_DIRECTED_RELATIONSHIPS = CorePackage.CONTEXT_DIMENSION___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.CONTEXT_DIMENSION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_STEREOTYPE_APPLICATION__STEREOTYPE = CorePackage.CONTEXT_DIMENSION___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_STEREOTYPE_APPLICATIONS = CorePackage.CONTEXT_DIMENSION___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_TARGET_DIRECTED_RELATIONSHIPS = CorePackage.CONTEXT_DIMENSION___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.CONTEXT_DIMENSION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_VALUE__STEREOTYPE_STRING = CorePackage.CONTEXT_DIMENSION___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___HAS_KEYWORD__STRING = CorePackage.CONTEXT_DIMENSION___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___HAS_VALUE__STEREOTYPE_STRING = CorePackage.CONTEXT_DIMENSION___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = CorePackage.CONTEXT_DIMENSION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___IS_STEREOTYPE_APPLIED__STEREOTYPE = CorePackage.CONTEXT_DIMENSION___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___IS_STEREOTYPE_REQUIRED__STEREOTYPE = CorePackage.CONTEXT_DIMENSION___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___REMOVE_KEYWORD__STRING = CorePackage.CONTEXT_DIMENSION___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___SET_VALUE__STEREOTYPE_STRING_OBJECT = CorePackage.CONTEXT_DIMENSION___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___UNAPPLY_STEREOTYPE__STEREOTYPE = CorePackage.CONTEXT_DIMENSION___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___ALL_OWNED_ELEMENTS = CorePackage.CONTEXT_DIMENSION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___MUST_BE_OWNED = CorePackage.CONTEXT_DIMENSION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.CONTEXT_DIMENSION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.CONTEXT_DIMENSION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = CorePackage.CONTEXT_DIMENSION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___CREATE_DEPENDENCY__NAMEDELEMENT = CorePackage.CONTEXT_DIMENSION___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___CREATE_USAGE__NAMEDELEMENT = CorePackage.CONTEXT_DIMENSION___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_LABEL = CorePackage.CONTEXT_DIMENSION___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_LABEL__BOOLEAN = CorePackage.CONTEXT_DIMENSION___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___ALL_NAMESPACES = CorePackage.CONTEXT_DIMENSION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___ALL_OWNING_PACKAGES = CorePackage.CONTEXT_DIMENSION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CorePackage.CONTEXT_DIMENSION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_NAMESPACE = CorePackage.CONTEXT_DIMENSION___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_QUALIFIED_NAME = CorePackage.CONTEXT_DIMENSION___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___SEPARATOR = CorePackage.CONTEXT_DIMENSION___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_CLIENT_DEPENDENCY__STRING = CorePackage.CONTEXT_DIMENSION___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = CorePackage.CONTEXT_DIMENSION___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___CREATE_NAME_EXPRESSION__STRING_TYPE = CorePackage.CONTEXT_DIMENSION___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___CREATE_OWNED_COMMENT = CorePackage.CONTEXT_DIMENSION___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION___CREATE__ECLASS = CorePackage.CONTEXT_DIMENSION___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = CorePackage.CONTEXT_DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.UserRoleImpl <em>User Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.UserRoleImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getUserRole()
	 * @generated
	 */
	int USER_ROLE = 4;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__EANNOTATIONS = CorePackage.CONTEXT_DIMENSION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__OWNED_COMMENT = CorePackage.CONTEXT_DIMENSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__OWNED_ELEMENT = CorePackage.CONTEXT_DIMENSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__OWNER = CorePackage.CONTEXT_DIMENSION__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__CLIENT_DEPENDENCY = CorePackage.CONTEXT_DIMENSION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__NAME = CorePackage.CONTEXT_DIMENSION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__NAME_EXPRESSION = CorePackage.CONTEXT_DIMENSION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__NAMESPACE = CorePackage.CONTEXT_DIMENSION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__QUALIFIED_NAME = CorePackage.CONTEXT_DIMENSION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE__VISIBILITY = CorePackage.CONTEXT_DIMENSION__VISIBILITY;

	/**
	 * The number of structural features of the '<em>User Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE_FEATURE_COUNT = CorePackage.CONTEXT_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_EANNOTATION__STRING = CorePackage.CONTEXT_DIMENSION___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = CorePackage.CONTEXT_DIMENSION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = CorePackage.CONTEXT_DIMENSION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___ADD_KEYWORD__STRING = CorePackage.CONTEXT_DIMENSION___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___APPLY_STEREOTYPE__STEREOTYPE = CorePackage.CONTEXT_DIMENSION___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___CREATE_EANNOTATION__STRING = CorePackage.CONTEXT_DIMENSION___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___DESTROY = CorePackage.CONTEXT_DIMENSION___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_KEYWORDS = CorePackage.CONTEXT_DIMENSION___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_APPLICABLE_STEREOTYPE__STRING = CorePackage.CONTEXT_DIMENSION___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_APPLICABLE_STEREOTYPES = CorePackage.CONTEXT_DIMENSION___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_APPLIED_STEREOTYPE__STRING = CorePackage.CONTEXT_DIMENSION___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_APPLIED_STEREOTYPES = CorePackage.CONTEXT_DIMENSION___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = CorePackage.CONTEXT_DIMENSION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = CorePackage.CONTEXT_DIMENSION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_MODEL = CorePackage.CONTEXT_DIMENSION___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_NEAREST_PACKAGE = CorePackage.CONTEXT_DIMENSION___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_RELATIONSHIPS = CorePackage.CONTEXT_DIMENSION___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_RELATIONSHIPS__ECLASS = CorePackage.CONTEXT_DIMENSION___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_REQUIRED_STEREOTYPE__STRING = CorePackage.CONTEXT_DIMENSION___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_REQUIRED_STEREOTYPES = CorePackage.CONTEXT_DIMENSION___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_SOURCE_DIRECTED_RELATIONSHIPS = CorePackage.CONTEXT_DIMENSION___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.CONTEXT_DIMENSION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = CorePackage.CONTEXT_DIMENSION___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_STEREOTYPE_APPLICATIONS = CorePackage.CONTEXT_DIMENSION___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_TARGET_DIRECTED_RELATIONSHIPS = CorePackage.CONTEXT_DIMENSION___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.CONTEXT_DIMENSION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_VALUE__STEREOTYPE_STRING = CorePackage.CONTEXT_DIMENSION___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___HAS_KEYWORD__STRING = CorePackage.CONTEXT_DIMENSION___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___HAS_VALUE__STEREOTYPE_STRING = CorePackage.CONTEXT_DIMENSION___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = CorePackage.CONTEXT_DIMENSION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___IS_STEREOTYPE_APPLIED__STEREOTYPE = CorePackage.CONTEXT_DIMENSION___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = CorePackage.CONTEXT_DIMENSION___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___REMOVE_KEYWORD__STRING = CorePackage.CONTEXT_DIMENSION___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___SET_VALUE__STEREOTYPE_STRING_OBJECT = CorePackage.CONTEXT_DIMENSION___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___UNAPPLY_STEREOTYPE__STEREOTYPE = CorePackage.CONTEXT_DIMENSION___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___ALL_OWNED_ELEMENTS = CorePackage.CONTEXT_DIMENSION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___MUST_BE_OWNED = CorePackage.CONTEXT_DIMENSION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.CONTEXT_DIMENSION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.CONTEXT_DIMENSION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = CorePackage.CONTEXT_DIMENSION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___CREATE_DEPENDENCY__NAMEDELEMENT = CorePackage.CONTEXT_DIMENSION___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___CREATE_USAGE__NAMEDELEMENT = CorePackage.CONTEXT_DIMENSION___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_LABEL = CorePackage.CONTEXT_DIMENSION___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_LABEL__BOOLEAN = CorePackage.CONTEXT_DIMENSION___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___ALL_NAMESPACES = CorePackage.CONTEXT_DIMENSION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___ALL_OWNING_PACKAGES = CorePackage.CONTEXT_DIMENSION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CorePackage.CONTEXT_DIMENSION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_NAMESPACE = CorePackage.CONTEXT_DIMENSION___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_QUALIFIED_NAME = CorePackage.CONTEXT_DIMENSION___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___SEPARATOR = CorePackage.CONTEXT_DIMENSION___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_CLIENT_DEPENDENCY__STRING = CorePackage.CONTEXT_DIMENSION___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = CorePackage.CONTEXT_DIMENSION___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___CREATE_NAME_EXPRESSION__STRING_TYPE = CorePackage.CONTEXT_DIMENSION___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___CREATE_OWNED_COMMENT = CorePackage.CONTEXT_DIMENSION___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE___CREATE__ECLASS = CorePackage.CONTEXT_DIMENSION___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>User Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ROLE_OPERATION_COUNT = CorePackage.CONTEXT_DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.IFMLSlotImpl <em>IFML Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.IFMLSlotImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getIFMLSlot()
	 * @generated
	 */
	int IFML_SLOT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__ID = CorePackage.VIEW_COMPONENT_PART__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__CONSTRAINTS = CorePackage.VIEW_COMPONENT_PART__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__ANNOTATIONS = CorePackage.VIEW_COMPONENT_PART__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__EANNOTATIONS = CorePackage.VIEW_COMPONENT_PART__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__OWNED_COMMENT = CorePackage.VIEW_COMPONENT_PART__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__OWNED_ELEMENT = CorePackage.VIEW_COMPONENT_PART__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__OWNER = CorePackage.VIEW_COMPONENT_PART__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__CLIENT_DEPENDENCY = CorePackage.VIEW_COMPONENT_PART__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__NAME = CorePackage.VIEW_COMPONENT_PART__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__NAME_EXPRESSION = CorePackage.VIEW_COMPONENT_PART__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__NAMESPACE = CorePackage.VIEW_COMPONENT_PART__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__QUALIFIED_NAME = CorePackage.VIEW_COMPONENT_PART__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__VISIBILITY = CorePackage.VIEW_COMPONENT_PART__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__PARAMETERS = CorePackage.VIEW_COMPONENT_PART__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__OUT_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT_PART__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__IN_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT_PART__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__ACTIVATION_EXPRESSION = CorePackage.VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__PARENT_VIEW_COMPONENT_PART = CorePackage.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__SUB_VIEW_COMPONENT_PARTS = CorePackage.VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__TYPE = CorePackage.VIEW_COMPONENT_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__DIRECTION = CorePackage.VIEW_COMPONENT_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT__DEFAULT_VALUE = CorePackage.VIEW_COMPONENT_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>IFML Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT_FEATURE_COUNT = CorePackage.VIEW_COMPONENT_PART_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_EANNOTATION__STRING = CorePackage.VIEW_COMPONENT_PART___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT_PART___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT_PART___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___ADD_KEYWORD__STRING = CorePackage.VIEW_COMPONENT_PART___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___APPLY_STEREOTYPE__STEREOTYPE = CorePackage.VIEW_COMPONENT_PART___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___CREATE_EANNOTATION__STRING = CorePackage.VIEW_COMPONENT_PART___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___DESTROY = CorePackage.VIEW_COMPONENT_PART___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_KEYWORDS = CorePackage.VIEW_COMPONENT_PART___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_APPLICABLE_STEREOTYPE__STRING = CorePackage.VIEW_COMPONENT_PART___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_APPLICABLE_STEREOTYPES = CorePackage.VIEW_COMPONENT_PART___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_APPLIED_STEREOTYPE__STRING = CorePackage.VIEW_COMPONENT_PART___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_APPLIED_STEREOTYPES = CorePackage.VIEW_COMPONENT_PART___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = CorePackage.VIEW_COMPONENT_PART___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = CorePackage.VIEW_COMPONENT_PART___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_MODEL = CorePackage.VIEW_COMPONENT_PART___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_NEAREST_PACKAGE = CorePackage.VIEW_COMPONENT_PART___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_RELATIONSHIPS = CorePackage.VIEW_COMPONENT_PART___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_RELATIONSHIPS__ECLASS = CorePackage.VIEW_COMPONENT_PART___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_REQUIRED_STEREOTYPE__STRING = CorePackage.VIEW_COMPONENT_PART___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_REQUIRED_STEREOTYPES = CorePackage.VIEW_COMPONENT_PART___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_SOURCE_DIRECTED_RELATIONSHIPS = CorePackage.VIEW_COMPONENT_PART___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.VIEW_COMPONENT_PART___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = CorePackage.VIEW_COMPONENT_PART___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_STEREOTYPE_APPLICATIONS = CorePackage.VIEW_COMPONENT_PART___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_TARGET_DIRECTED_RELATIONSHIPS = CorePackage.VIEW_COMPONENT_PART___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.VIEW_COMPONENT_PART___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_VALUE__STEREOTYPE_STRING = CorePackage.VIEW_COMPONENT_PART___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___HAS_KEYWORD__STRING = CorePackage.VIEW_COMPONENT_PART___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___HAS_VALUE__STEREOTYPE_STRING = CorePackage.VIEW_COMPONENT_PART___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = CorePackage.VIEW_COMPONENT_PART___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___IS_STEREOTYPE_APPLIED__STEREOTYPE = CorePackage.VIEW_COMPONENT_PART___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = CorePackage.VIEW_COMPONENT_PART___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___REMOVE_KEYWORD__STRING = CorePackage.VIEW_COMPONENT_PART___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___SET_VALUE__STEREOTYPE_STRING_OBJECT = CorePackage.VIEW_COMPONENT_PART___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___UNAPPLY_STEREOTYPE__STEREOTYPE = CorePackage.VIEW_COMPONENT_PART___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___ALL_OWNED_ELEMENTS = CorePackage.VIEW_COMPONENT_PART___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___MUST_BE_OWNED = CorePackage.VIEW_COMPONENT_PART___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT_PART___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT_PART___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT_PART___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___CREATE_DEPENDENCY__NAMEDELEMENT = CorePackage.VIEW_COMPONENT_PART___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___CREATE_USAGE__NAMEDELEMENT = CorePackage.VIEW_COMPONENT_PART___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_LABEL = CorePackage.VIEW_COMPONENT_PART___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_LABEL__BOOLEAN = CorePackage.VIEW_COMPONENT_PART___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___ALL_NAMESPACES = CorePackage.VIEW_COMPONENT_PART___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___ALL_OWNING_PACKAGES = CorePackage.VIEW_COMPONENT_PART___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CorePackage.VIEW_COMPONENT_PART___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_NAMESPACE = CorePackage.VIEW_COMPONENT_PART___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_QUALIFIED_NAME = CorePackage.VIEW_COMPONENT_PART___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___SEPARATOR = CorePackage.VIEW_COMPONENT_PART___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_CLIENT_DEPENDENCY__STRING = CorePackage.VIEW_COMPONENT_PART___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = CorePackage.VIEW_COMPONENT_PART___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___CREATE_NAME_EXPRESSION__STRING_TYPE = CorePackage.VIEW_COMPONENT_PART___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___CREATE_OWNED_COMMENT = CorePackage.VIEW_COMPONENT_PART___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT___CREATE__ECLASS = CorePackage.VIEW_COMPONENT_PART___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>IFML Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_SLOT_OPERATION_COUNT = CorePackage.VIEW_COMPONENT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.OnSelectEventImpl <em>On Select Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.OnSelectEventImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getOnSelectEvent()
	 * @generated
	 */
	int ON_SELECT_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__ID = CorePackage.VIEW_ELEMENT_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__CONSTRAINTS = CorePackage.VIEW_ELEMENT_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__ANNOTATIONS = CorePackage.VIEW_ELEMENT_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__EANNOTATIONS = CorePackage.VIEW_ELEMENT_EVENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__OWNED_COMMENT = CorePackage.VIEW_ELEMENT_EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__OWNED_ELEMENT = CorePackage.VIEW_ELEMENT_EVENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__OWNER = CorePackage.VIEW_ELEMENT_EVENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__CLIENT_DEPENDENCY = CorePackage.VIEW_ELEMENT_EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__NAME = CorePackage.VIEW_ELEMENT_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__NAME_EXPRESSION = CorePackage.VIEW_ELEMENT_EVENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__NAMESPACE = CorePackage.VIEW_ELEMENT_EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__QUALIFIED_NAME = CorePackage.VIEW_ELEMENT_EVENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__VISIBILITY = CorePackage.VIEW_ELEMENT_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__PARAMETERS = CorePackage.VIEW_ELEMENT_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__OUT_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__IN_INTERACTION_FLOWS = CorePackage.VIEW_ELEMENT_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__ACTIVATION_EXPRESSION = CorePackage.VIEW_ELEMENT_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__INTERACTION_FLOW_EXPRESSION = CorePackage.VIEW_ELEMENT_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT__VIEW_ELEMENT = CorePackage.VIEW_ELEMENT_EVENT__VIEW_ELEMENT;

	/**
	 * The number of structural features of the '<em>On Select Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT_FEATURE_COUNT = CorePackage.VIEW_ELEMENT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_EANNOTATION__STRING = CorePackage.VIEW_ELEMENT_EVENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_ELEMENT_EVENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_ELEMENT_EVENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___ADD_KEYWORD__STRING = CorePackage.VIEW_ELEMENT_EVENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___APPLY_STEREOTYPE__STEREOTYPE = CorePackage.VIEW_ELEMENT_EVENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___CREATE_EANNOTATION__STRING = CorePackage.VIEW_ELEMENT_EVENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___DESTROY = CorePackage.VIEW_ELEMENT_EVENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_KEYWORDS = CorePackage.VIEW_ELEMENT_EVENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_APPLICABLE_STEREOTYPE__STRING = CorePackage.VIEW_ELEMENT_EVENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_APPLICABLE_STEREOTYPES = CorePackage.VIEW_ELEMENT_EVENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_APPLIED_STEREOTYPE__STRING = CorePackage.VIEW_ELEMENT_EVENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_APPLIED_STEREOTYPES = CorePackage.VIEW_ELEMENT_EVENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = CorePackage.VIEW_ELEMENT_EVENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = CorePackage.VIEW_ELEMENT_EVENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_MODEL = CorePackage.VIEW_ELEMENT_EVENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_NEAREST_PACKAGE = CorePackage.VIEW_ELEMENT_EVENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_RELATIONSHIPS = CorePackage.VIEW_ELEMENT_EVENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_RELATIONSHIPS__ECLASS = CorePackage.VIEW_ELEMENT_EVENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_REQUIRED_STEREOTYPE__STRING = CorePackage.VIEW_ELEMENT_EVENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_REQUIRED_STEREOTYPES = CorePackage.VIEW_ELEMENT_EVENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = CorePackage.VIEW_ELEMENT_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.VIEW_ELEMENT_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = CorePackage.VIEW_ELEMENT_EVENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_STEREOTYPE_APPLICATIONS = CorePackage.VIEW_ELEMENT_EVENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS = CorePackage.VIEW_ELEMENT_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.VIEW_ELEMENT_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_VALUE__STEREOTYPE_STRING = CorePackage.VIEW_ELEMENT_EVENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___HAS_KEYWORD__STRING = CorePackage.VIEW_ELEMENT_EVENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___HAS_VALUE__STEREOTYPE_STRING = CorePackage.VIEW_ELEMENT_EVENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = CorePackage.VIEW_ELEMENT_EVENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = CorePackage.VIEW_ELEMENT_EVENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = CorePackage.VIEW_ELEMENT_EVENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___REMOVE_KEYWORD__STRING = CorePackage.VIEW_ELEMENT_EVENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = CorePackage.VIEW_ELEMENT_EVENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___UNAPPLY_STEREOTYPE__STEREOTYPE = CorePackage.VIEW_ELEMENT_EVENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___ALL_OWNED_ELEMENTS = CorePackage.VIEW_ELEMENT_EVENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___MUST_BE_OWNED = CorePackage.VIEW_ELEMENT_EVENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_ELEMENT_EVENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_ELEMENT_EVENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_ELEMENT_EVENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___CREATE_DEPENDENCY__NAMEDELEMENT = CorePackage.VIEW_ELEMENT_EVENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___CREATE_USAGE__NAMEDELEMENT = CorePackage.VIEW_ELEMENT_EVENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_LABEL = CorePackage.VIEW_ELEMENT_EVENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_LABEL__BOOLEAN = CorePackage.VIEW_ELEMENT_EVENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___ALL_NAMESPACES = CorePackage.VIEW_ELEMENT_EVENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___ALL_OWNING_PACKAGES = CorePackage.VIEW_ELEMENT_EVENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CorePackage.VIEW_ELEMENT_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_NAMESPACE = CorePackage.VIEW_ELEMENT_EVENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_QUALIFIED_NAME = CorePackage.VIEW_ELEMENT_EVENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___SEPARATOR = CorePackage.VIEW_ELEMENT_EVENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_CLIENT_DEPENDENCY__STRING = CorePackage.VIEW_ELEMENT_EVENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = CorePackage.VIEW_ELEMENT_EVENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___CREATE_NAME_EXPRESSION__STRING_TYPE = CorePackage.VIEW_ELEMENT_EVENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___CREATE_OWNED_COMMENT = CorePackage.VIEW_ELEMENT_EVENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT___CREATE__ECLASS = CorePackage.VIEW_ELEMENT_EVENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>On Select Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SELECT_EVENT_OPERATION_COUNT = CorePackage.VIEW_ELEMENT_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.FieldImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ID = CorePackage.VIEW_COMPONENT_PART__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CONSTRAINTS = CorePackage.VIEW_COMPONENT_PART__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ANNOTATIONS = CorePackage.VIEW_COMPONENT_PART__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__EANNOTATIONS = CorePackage.VIEW_COMPONENT_PART__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__OWNED_COMMENT = CorePackage.VIEW_COMPONENT_PART__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__OWNED_ELEMENT = CorePackage.VIEW_COMPONENT_PART__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__OWNER = CorePackage.VIEW_COMPONENT_PART__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CLIENT_DEPENDENCY = CorePackage.VIEW_COMPONENT_PART__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = CorePackage.VIEW_COMPONENT_PART__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME_EXPRESSION = CorePackage.VIEW_COMPONENT_PART__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAMESPACE = CorePackage.VIEW_COMPONENT_PART__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__QUALIFIED_NAME = CorePackage.VIEW_COMPONENT_PART__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VISIBILITY = CorePackage.VIEW_COMPONENT_PART__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__PARAMETERS = CorePackage.VIEW_COMPONENT_PART__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__OUT_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT_PART__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IN_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT_PART__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ACTIVATION_EXPRESSION = CorePackage.VIEW_COMPONENT_PART__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__PARENT_VIEW_COMPONENT_PART = CorePackage.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SUB_VIEW_COMPONENT_PARTS = CorePackage.VIEW_COMPONENT_PART__SUB_VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = CorePackage.VIEW_COMPONENT_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DIRECTION = CorePackage.VIEW_COMPONENT_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DEFAULT_VALUE = CorePackage.VIEW_COMPONENT_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = CorePackage.VIEW_COMPONENT_PART_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_EANNOTATION__STRING = CorePackage.VIEW_COMPONENT_PART___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT_PART___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT_PART___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___ADD_KEYWORD__STRING = CorePackage.VIEW_COMPONENT_PART___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___APPLY_STEREOTYPE__STEREOTYPE = CorePackage.VIEW_COMPONENT_PART___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___CREATE_EANNOTATION__STRING = CorePackage.VIEW_COMPONENT_PART___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___DESTROY = CorePackage.VIEW_COMPONENT_PART___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_KEYWORDS = CorePackage.VIEW_COMPONENT_PART___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_APPLICABLE_STEREOTYPE__STRING = CorePackage.VIEW_COMPONENT_PART___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_APPLICABLE_STEREOTYPES = CorePackage.VIEW_COMPONENT_PART___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_APPLIED_STEREOTYPE__STRING = CorePackage.VIEW_COMPONENT_PART___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_APPLIED_STEREOTYPES = CorePackage.VIEW_COMPONENT_PART___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = CorePackage.VIEW_COMPONENT_PART___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = CorePackage.VIEW_COMPONENT_PART___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_MODEL = CorePackage.VIEW_COMPONENT_PART___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_NEAREST_PACKAGE = CorePackage.VIEW_COMPONENT_PART___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_RELATIONSHIPS = CorePackage.VIEW_COMPONENT_PART___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_RELATIONSHIPS__ECLASS = CorePackage.VIEW_COMPONENT_PART___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_REQUIRED_STEREOTYPE__STRING = CorePackage.VIEW_COMPONENT_PART___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_REQUIRED_STEREOTYPES = CorePackage.VIEW_COMPONENT_PART___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_SOURCE_DIRECTED_RELATIONSHIPS = CorePackage.VIEW_COMPONENT_PART___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.VIEW_COMPONENT_PART___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_STEREOTYPE_APPLICATION__STEREOTYPE = CorePackage.VIEW_COMPONENT_PART___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_STEREOTYPE_APPLICATIONS = CorePackage.VIEW_COMPONENT_PART___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_TARGET_DIRECTED_RELATIONSHIPS = CorePackage.VIEW_COMPONENT_PART___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.VIEW_COMPONENT_PART___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_VALUE__STEREOTYPE_STRING = CorePackage.VIEW_COMPONENT_PART___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___HAS_KEYWORD__STRING = CorePackage.VIEW_COMPONENT_PART___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___HAS_VALUE__STEREOTYPE_STRING = CorePackage.VIEW_COMPONENT_PART___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = CorePackage.VIEW_COMPONENT_PART___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___IS_STEREOTYPE_APPLIED__STEREOTYPE = CorePackage.VIEW_COMPONENT_PART___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___IS_STEREOTYPE_REQUIRED__STEREOTYPE = CorePackage.VIEW_COMPONENT_PART___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___REMOVE_KEYWORD__STRING = CorePackage.VIEW_COMPONENT_PART___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___SET_VALUE__STEREOTYPE_STRING_OBJECT = CorePackage.VIEW_COMPONENT_PART___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___UNAPPLY_STEREOTYPE__STEREOTYPE = CorePackage.VIEW_COMPONENT_PART___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___ALL_OWNED_ELEMENTS = CorePackage.VIEW_COMPONENT_PART___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___MUST_BE_OWNED = CorePackage.VIEW_COMPONENT_PART___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT_PART___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT_PART___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT_PART___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___CREATE_DEPENDENCY__NAMEDELEMENT = CorePackage.VIEW_COMPONENT_PART___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___CREATE_USAGE__NAMEDELEMENT = CorePackage.VIEW_COMPONENT_PART___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_LABEL = CorePackage.VIEW_COMPONENT_PART___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_LABEL__BOOLEAN = CorePackage.VIEW_COMPONENT_PART___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___ALL_NAMESPACES = CorePackage.VIEW_COMPONENT_PART___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___ALL_OWNING_PACKAGES = CorePackage.VIEW_COMPONENT_PART___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CorePackage.VIEW_COMPONENT_PART___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_NAMESPACE = CorePackage.VIEW_COMPONENT_PART___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_QUALIFIED_NAME = CorePackage.VIEW_COMPONENT_PART___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___SEPARATOR = CorePackage.VIEW_COMPONENT_PART___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_CLIENT_DEPENDENCY__STRING = CorePackage.VIEW_COMPONENT_PART___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = CorePackage.VIEW_COMPONENT_PART___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___CREATE_NAME_EXPRESSION__STRING_TYPE = CorePackage.VIEW_COMPONENT_PART___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___CREATE_OWNED_COMMENT = CorePackage.VIEW_COMPONENT_PART___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD___CREATE__ECLASS = CorePackage.VIEW_COMPONENT_PART___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = CorePackage.VIEW_COMPONENT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.FormImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ID = CorePackage.VIEW_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__CONSTRAINTS = CorePackage.VIEW_COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ANNOTATIONS = CorePackage.VIEW_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__EANNOTATIONS = CorePackage.VIEW_COMPONENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__OWNED_COMMENT = CorePackage.VIEW_COMPONENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__OWNED_ELEMENT = CorePackage.VIEW_COMPONENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__OWNER = CorePackage.VIEW_COMPONENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__CLIENT_DEPENDENCY = CorePackage.VIEW_COMPONENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAME = CorePackage.VIEW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAME_EXPRESSION = CorePackage.VIEW_COMPONENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAMESPACE = CorePackage.VIEW_COMPONENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__QUALIFIED_NAME = CorePackage.VIEW_COMPONENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__VISIBILITY = CorePackage.VIEW_COMPONENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__PARAMETERS = CorePackage.VIEW_COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__OUT_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__IN_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_COMPONENT__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ACTIVATION_EXPRESSION = CorePackage.VIEW_COMPONENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__VIEW_CONTAINER = CorePackage.VIEW_COMPONENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__VIEW_COMPONENT_PARTS = CorePackage.VIEW_COMPONENT__VIEW_COMPONENT_PARTS;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = CorePackage.VIEW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_EANNOTATION__STRING = CorePackage.VIEW_COMPONENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___ADD_KEYWORD__STRING = CorePackage.VIEW_COMPONENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___APPLY_STEREOTYPE__STEREOTYPE = CorePackage.VIEW_COMPONENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___CREATE_EANNOTATION__STRING = CorePackage.VIEW_COMPONENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___DESTROY = CorePackage.VIEW_COMPONENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_KEYWORDS = CorePackage.VIEW_COMPONENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_APPLICABLE_STEREOTYPE__STRING = CorePackage.VIEW_COMPONENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_APPLICABLE_STEREOTYPES = CorePackage.VIEW_COMPONENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_APPLIED_STEREOTYPE__STRING = CorePackage.VIEW_COMPONENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_APPLIED_STEREOTYPES = CorePackage.VIEW_COMPONENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = CorePackage.VIEW_COMPONENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = CorePackage.VIEW_COMPONENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_MODEL = CorePackage.VIEW_COMPONENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_NEAREST_PACKAGE = CorePackage.VIEW_COMPONENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_RELATIONSHIPS = CorePackage.VIEW_COMPONENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_RELATIONSHIPS__ECLASS = CorePackage.VIEW_COMPONENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_REQUIRED_STEREOTYPE__STRING = CorePackage.VIEW_COMPONENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_REQUIRED_STEREOTYPES = CorePackage.VIEW_COMPONENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_SOURCE_DIRECTED_RELATIONSHIPS = CorePackage.VIEW_COMPONENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.VIEW_COMPONENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_STEREOTYPE_APPLICATION__STEREOTYPE = CorePackage.VIEW_COMPONENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_STEREOTYPE_APPLICATIONS = CorePackage.VIEW_COMPONENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_TARGET_DIRECTED_RELATIONSHIPS = CorePackage.VIEW_COMPONENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.VIEW_COMPONENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_VALUE__STEREOTYPE_STRING = CorePackage.VIEW_COMPONENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___HAS_KEYWORD__STRING = CorePackage.VIEW_COMPONENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___HAS_VALUE__STEREOTYPE_STRING = CorePackage.VIEW_COMPONENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = CorePackage.VIEW_COMPONENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___IS_STEREOTYPE_APPLIED__STEREOTYPE = CorePackage.VIEW_COMPONENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___IS_STEREOTYPE_REQUIRED__STEREOTYPE = CorePackage.VIEW_COMPONENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___REMOVE_KEYWORD__STRING = CorePackage.VIEW_COMPONENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___SET_VALUE__STEREOTYPE_STRING_OBJECT = CorePackage.VIEW_COMPONENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___UNAPPLY_STEREOTYPE__STEREOTYPE = CorePackage.VIEW_COMPONENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___ALL_OWNED_ELEMENTS = CorePackage.VIEW_COMPONENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___MUST_BE_OWNED = CorePackage.VIEW_COMPONENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___CREATE_DEPENDENCY__NAMEDELEMENT = CorePackage.VIEW_COMPONENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___CREATE_USAGE__NAMEDELEMENT = CorePackage.VIEW_COMPONENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_LABEL = CorePackage.VIEW_COMPONENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_LABEL__BOOLEAN = CorePackage.VIEW_COMPONENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___ALL_NAMESPACES = CorePackage.VIEW_COMPONENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___ALL_OWNING_PACKAGES = CorePackage.VIEW_COMPONENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CorePackage.VIEW_COMPONENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_NAMESPACE = CorePackage.VIEW_COMPONENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_QUALIFIED_NAME = CorePackage.VIEW_COMPONENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___SEPARATOR = CorePackage.VIEW_COMPONENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_CLIENT_DEPENDENCY__STRING = CorePackage.VIEW_COMPONENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = CorePackage.VIEW_COMPONENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___CREATE_NAME_EXPRESSION__STRING_TYPE = CorePackage.VIEW_COMPONENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___CREATE_OWNED_COMMENT = CorePackage.VIEW_COMPONENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM___CREATE__ECLASS = CorePackage.VIEW_COMPONENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = CorePackage.VIEW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.DeviceImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 9;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__EANNOTATIONS = CorePackage.CONTEXT_DIMENSION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__OWNED_COMMENT = CorePackage.CONTEXT_DIMENSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__OWNED_ELEMENT = CorePackage.CONTEXT_DIMENSION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__OWNER = CorePackage.CONTEXT_DIMENSION__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__CLIENT_DEPENDENCY = CorePackage.CONTEXT_DIMENSION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = CorePackage.CONTEXT_DIMENSION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME_EXPRESSION = CorePackage.CONTEXT_DIMENSION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAMESPACE = CorePackage.CONTEXT_DIMENSION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__QUALIFIED_NAME = CorePackage.CONTEXT_DIMENSION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__VISIBILITY = CorePackage.CONTEXT_DIMENSION__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = CorePackage.CONTEXT_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_EANNOTATION__STRING = CorePackage.CONTEXT_DIMENSION___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = CorePackage.CONTEXT_DIMENSION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = CorePackage.CONTEXT_DIMENSION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___ADD_KEYWORD__STRING = CorePackage.CONTEXT_DIMENSION___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___APPLY_STEREOTYPE__STEREOTYPE = CorePackage.CONTEXT_DIMENSION___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___CREATE_EANNOTATION__STRING = CorePackage.CONTEXT_DIMENSION___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___DESTROY = CorePackage.CONTEXT_DIMENSION___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_KEYWORDS = CorePackage.CONTEXT_DIMENSION___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_APPLICABLE_STEREOTYPE__STRING = CorePackage.CONTEXT_DIMENSION___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_APPLICABLE_STEREOTYPES = CorePackage.CONTEXT_DIMENSION___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_APPLIED_STEREOTYPE__STRING = CorePackage.CONTEXT_DIMENSION___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_APPLIED_STEREOTYPES = CorePackage.CONTEXT_DIMENSION___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = CorePackage.CONTEXT_DIMENSION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = CorePackage.CONTEXT_DIMENSION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_MODEL = CorePackage.CONTEXT_DIMENSION___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_NEAREST_PACKAGE = CorePackage.CONTEXT_DIMENSION___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_RELATIONSHIPS = CorePackage.CONTEXT_DIMENSION___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_RELATIONSHIPS__ECLASS = CorePackage.CONTEXT_DIMENSION___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_REQUIRED_STEREOTYPE__STRING = CorePackage.CONTEXT_DIMENSION___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_REQUIRED_STEREOTYPES = CorePackage.CONTEXT_DIMENSION___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_SOURCE_DIRECTED_RELATIONSHIPS = CorePackage.CONTEXT_DIMENSION___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.CONTEXT_DIMENSION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = CorePackage.CONTEXT_DIMENSION___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_STEREOTYPE_APPLICATIONS = CorePackage.CONTEXT_DIMENSION___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_TARGET_DIRECTED_RELATIONSHIPS = CorePackage.CONTEXT_DIMENSION___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.CONTEXT_DIMENSION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_VALUE__STEREOTYPE_STRING = CorePackage.CONTEXT_DIMENSION___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___HAS_KEYWORD__STRING = CorePackage.CONTEXT_DIMENSION___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___HAS_VALUE__STEREOTYPE_STRING = CorePackage.CONTEXT_DIMENSION___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = CorePackage.CONTEXT_DIMENSION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___IS_STEREOTYPE_APPLIED__STEREOTYPE = CorePackage.CONTEXT_DIMENSION___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = CorePackage.CONTEXT_DIMENSION___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___REMOVE_KEYWORD__STRING = CorePackage.CONTEXT_DIMENSION___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___SET_VALUE__STEREOTYPE_STRING_OBJECT = CorePackage.CONTEXT_DIMENSION___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___UNAPPLY_STEREOTYPE__STEREOTYPE = CorePackage.CONTEXT_DIMENSION___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___ALL_OWNED_ELEMENTS = CorePackage.CONTEXT_DIMENSION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___MUST_BE_OWNED = CorePackage.CONTEXT_DIMENSION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.CONTEXT_DIMENSION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.CONTEXT_DIMENSION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = CorePackage.CONTEXT_DIMENSION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___CREATE_DEPENDENCY__NAMEDELEMENT = CorePackage.CONTEXT_DIMENSION___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___CREATE_USAGE__NAMEDELEMENT = CorePackage.CONTEXT_DIMENSION___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_LABEL = CorePackage.CONTEXT_DIMENSION___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_LABEL__BOOLEAN = CorePackage.CONTEXT_DIMENSION___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___ALL_NAMESPACES = CorePackage.CONTEXT_DIMENSION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___ALL_OWNING_PACKAGES = CorePackage.CONTEXT_DIMENSION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CorePackage.CONTEXT_DIMENSION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_NAMESPACE = CorePackage.CONTEXT_DIMENSION___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_QUALIFIED_NAME = CorePackage.CONTEXT_DIMENSION___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___SEPARATOR = CorePackage.CONTEXT_DIMENSION___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_CLIENT_DEPENDENCY__STRING = CorePackage.CONTEXT_DIMENSION___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = CorePackage.CONTEXT_DIMENSION___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___CREATE_NAME_EXPRESSION__STRING_TYPE = CorePackage.CONTEXT_DIMENSION___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___CREATE_OWNED_COMMENT = CorePackage.CONTEXT_DIMENSION___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___CREATE__ECLASS = CorePackage.CONTEXT_DIMENSION___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = CorePackage.CONTEXT_DIMENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.SelectionFieldImpl <em>Selection Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.SelectionFieldImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getSelectionField()
	 * @generated
	 */
	int SELECTION_FIELD = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__ID = FIELD__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__CONSTRAINTS = FIELD__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__ANNOTATIONS = FIELD__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__EANNOTATIONS = FIELD__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__OWNED_COMMENT = FIELD__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__OWNED_ELEMENT = FIELD__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__OWNER = FIELD__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__CLIENT_DEPENDENCY = FIELD__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__NAME_EXPRESSION = FIELD__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__NAMESPACE = FIELD__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__QUALIFIED_NAME = FIELD__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__VISIBILITY = FIELD__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__PARAMETERS = FIELD__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__OUT_INTERACTION_FLOWS = FIELD__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__IN_INTERACTION_FLOWS = FIELD__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__VIEW_ELEMENT_EVENTS = FIELD__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__ACTIVATION_EXPRESSION = FIELD__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__PARENT_VIEW_COMPONENT_PART = FIELD__PARENT_VIEW_COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__SUB_VIEW_COMPONENT_PARTS = FIELD__SUB_VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__TYPE = FIELD__TYPE;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__DIRECTION = FIELD__DIRECTION;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__DEFAULT_VALUE = FIELD__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Is Multi Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__IS_MULTI_SELECTION = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selection Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_EANNOTATION__STRING = FIELD___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = FIELD___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = FIELD___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___ADD_KEYWORD__STRING = FIELD___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___APPLY_STEREOTYPE__STEREOTYPE = FIELD___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___CREATE_EANNOTATION__STRING = FIELD___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___DESTROY = FIELD___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_KEYWORDS = FIELD___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_APPLICABLE_STEREOTYPE__STRING = FIELD___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_APPLICABLE_STEREOTYPES = FIELD___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_APPLIED_STEREOTYPE__STRING = FIELD___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_APPLIED_STEREOTYPES = FIELD___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = FIELD___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = FIELD___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_MODEL = FIELD___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_NEAREST_PACKAGE = FIELD___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_RELATIONSHIPS = FIELD___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_RELATIONSHIPS__ECLASS = FIELD___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_REQUIRED_STEREOTYPE__STRING = FIELD___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_REQUIRED_STEREOTYPES = FIELD___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_SOURCE_DIRECTED_RELATIONSHIPS = FIELD___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = FIELD___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_STEREOTYPE_APPLICATION__STEREOTYPE = FIELD___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_STEREOTYPE_APPLICATIONS = FIELD___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_TARGET_DIRECTED_RELATIONSHIPS = FIELD___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = FIELD___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_VALUE__STEREOTYPE_STRING = FIELD___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___HAS_KEYWORD__STRING = FIELD___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___HAS_VALUE__STEREOTYPE_STRING = FIELD___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = FIELD___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___IS_STEREOTYPE_APPLIED__STEREOTYPE = FIELD___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___IS_STEREOTYPE_REQUIRED__STEREOTYPE = FIELD___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___REMOVE_KEYWORD__STRING = FIELD___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___SET_VALUE__STEREOTYPE_STRING_OBJECT = FIELD___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___UNAPPLY_STEREOTYPE__STEREOTYPE = FIELD___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___ALL_OWNED_ELEMENTS = FIELD___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___MUST_BE_OWNED = FIELD___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = FIELD___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = FIELD___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = FIELD___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___CREATE_DEPENDENCY__NAMEDELEMENT = FIELD___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___CREATE_USAGE__NAMEDELEMENT = FIELD___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_LABEL = FIELD___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_LABEL__BOOLEAN = FIELD___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___ALL_NAMESPACES = FIELD___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___ALL_OWNING_PACKAGES = FIELD___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = FIELD___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_NAMESPACE = FIELD___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_QUALIFIED_NAME = FIELD___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___SEPARATOR = FIELD___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_CLIENT_DEPENDENCY__STRING = FIELD___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = FIELD___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___CREATE_NAME_EXPRESSION__STRING_TYPE = FIELD___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___CREATE_OWNED_COMMENT = FIELD___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___CREATE__ECLASS = FIELD___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Selection Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.SimpleFieldImpl <em>Simple Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.SimpleFieldImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getSimpleField()
	 * @generated
	 */
	int SIMPLE_FIELD = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__ID = FIELD__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__CONSTRAINTS = FIELD__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__ANNOTATIONS = FIELD__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__EANNOTATIONS = FIELD__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__OWNED_COMMENT = FIELD__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__OWNED_ELEMENT = FIELD__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__OWNER = FIELD__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__CLIENT_DEPENDENCY = FIELD__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__NAME_EXPRESSION = FIELD__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__NAMESPACE = FIELD__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__QUALIFIED_NAME = FIELD__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__VISIBILITY = FIELD__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__PARAMETERS = FIELD__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__OUT_INTERACTION_FLOWS = FIELD__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__IN_INTERACTION_FLOWS = FIELD__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__VIEW_ELEMENT_EVENTS = FIELD__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__ACTIVATION_EXPRESSION = FIELD__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__PARENT_VIEW_COMPONENT_PART = FIELD__PARENT_VIEW_COMPONENT_PART;

	/**
	 * The feature id for the '<em><b>Sub View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__SUB_VIEW_COMPONENT_PARTS = FIELD__SUB_VIEW_COMPONENT_PARTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__TYPE = FIELD__TYPE;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__DIRECTION = FIELD__DIRECTION;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__DEFAULT_VALUE = FIELD__DEFAULT_VALUE;

	/**
	 * The number of structural features of the '<em>Simple Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_EANNOTATION__STRING = FIELD___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = FIELD___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = FIELD___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___ADD_KEYWORD__STRING = FIELD___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___APPLY_STEREOTYPE__STEREOTYPE = FIELD___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___CREATE_EANNOTATION__STRING = FIELD___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___DESTROY = FIELD___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_KEYWORDS = FIELD___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_APPLICABLE_STEREOTYPE__STRING = FIELD___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_APPLICABLE_STEREOTYPES = FIELD___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_APPLIED_STEREOTYPE__STRING = FIELD___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_APPLIED_STEREOTYPES = FIELD___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = FIELD___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = FIELD___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_MODEL = FIELD___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_NEAREST_PACKAGE = FIELD___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_RELATIONSHIPS = FIELD___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_RELATIONSHIPS__ECLASS = FIELD___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_REQUIRED_STEREOTYPE__STRING = FIELD___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_REQUIRED_STEREOTYPES = FIELD___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_SOURCE_DIRECTED_RELATIONSHIPS = FIELD___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = FIELD___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_STEREOTYPE_APPLICATION__STEREOTYPE = FIELD___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_STEREOTYPE_APPLICATIONS = FIELD___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_TARGET_DIRECTED_RELATIONSHIPS = FIELD___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = FIELD___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_VALUE__STEREOTYPE_STRING = FIELD___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___HAS_KEYWORD__STRING = FIELD___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___HAS_VALUE__STEREOTYPE_STRING = FIELD___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = FIELD___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___IS_STEREOTYPE_APPLIED__STEREOTYPE = FIELD___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___IS_STEREOTYPE_REQUIRED__STEREOTYPE = FIELD___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___REMOVE_KEYWORD__STRING = FIELD___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___SET_VALUE__STEREOTYPE_STRING_OBJECT = FIELD___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___UNAPPLY_STEREOTYPE__STEREOTYPE = FIELD___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___ALL_OWNED_ELEMENTS = FIELD___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___MUST_BE_OWNED = FIELD___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = FIELD___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = FIELD___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = FIELD___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___CREATE_DEPENDENCY__NAMEDELEMENT = FIELD___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___CREATE_USAGE__NAMEDELEMENT = FIELD___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_LABEL = FIELD___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_LABEL__BOOLEAN = FIELD___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___ALL_NAMESPACES = FIELD___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___ALL_OWNING_PACKAGES = FIELD___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = FIELD___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_NAMESPACE = FIELD___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_QUALIFIED_NAME = FIELD___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___SEPARATOR = FIELD___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_CLIENT_DEPENDENCY__STRING = FIELD___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = FIELD___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___CREATE_NAME_EXPRESSION__STRING_TYPE = FIELD___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___CREATE_OWNED_COMMENT = FIELD___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD___CREATE__ECLASS = FIELD___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Simple Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.DetailsImpl <em>Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.DetailsImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getDetails()
	 * @generated
	 */
	int DETAILS = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__ID = CorePackage.VIEW_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__CONSTRAINTS = CorePackage.VIEW_COMPONENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__ANNOTATIONS = CorePackage.VIEW_COMPONENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__EANNOTATIONS = CorePackage.VIEW_COMPONENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__OWNED_COMMENT = CorePackage.VIEW_COMPONENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__OWNED_ELEMENT = CorePackage.VIEW_COMPONENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__OWNER = CorePackage.VIEW_COMPONENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__CLIENT_DEPENDENCY = CorePackage.VIEW_COMPONENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__NAME = CorePackage.VIEW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__NAME_EXPRESSION = CorePackage.VIEW_COMPONENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__NAMESPACE = CorePackage.VIEW_COMPONENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__QUALIFIED_NAME = CorePackage.VIEW_COMPONENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__VISIBILITY = CorePackage.VIEW_COMPONENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__PARAMETERS = CorePackage.VIEW_COMPONENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__OUT_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__IN_INTERACTION_FLOWS = CorePackage.VIEW_COMPONENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_COMPONENT__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__ACTIVATION_EXPRESSION = CorePackage.VIEW_COMPONENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__VIEW_CONTAINER = CorePackage.VIEW_COMPONENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>View Component Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS__VIEW_COMPONENT_PARTS = CorePackage.VIEW_COMPONENT__VIEW_COMPONENT_PARTS;

	/**
	 * The number of structural features of the '<em>Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_FEATURE_COUNT = CorePackage.VIEW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_EANNOTATION__STRING = CorePackage.VIEW_COMPONENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___ADD_KEYWORD__STRING = CorePackage.VIEW_COMPONENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___APPLY_STEREOTYPE__STEREOTYPE = CorePackage.VIEW_COMPONENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___CREATE_EANNOTATION__STRING = CorePackage.VIEW_COMPONENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___DESTROY = CorePackage.VIEW_COMPONENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_KEYWORDS = CorePackage.VIEW_COMPONENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_APPLICABLE_STEREOTYPE__STRING = CorePackage.VIEW_COMPONENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_APPLICABLE_STEREOTYPES = CorePackage.VIEW_COMPONENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_APPLIED_STEREOTYPE__STRING = CorePackage.VIEW_COMPONENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_APPLIED_STEREOTYPES = CorePackage.VIEW_COMPONENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = CorePackage.VIEW_COMPONENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = CorePackage.VIEW_COMPONENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_MODEL = CorePackage.VIEW_COMPONENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_NEAREST_PACKAGE = CorePackage.VIEW_COMPONENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_RELATIONSHIPS = CorePackage.VIEW_COMPONENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_RELATIONSHIPS__ECLASS = CorePackage.VIEW_COMPONENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_REQUIRED_STEREOTYPE__STRING = CorePackage.VIEW_COMPONENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_REQUIRED_STEREOTYPES = CorePackage.VIEW_COMPONENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_SOURCE_DIRECTED_RELATIONSHIPS = CorePackage.VIEW_COMPONENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.VIEW_COMPONENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_STEREOTYPE_APPLICATION__STEREOTYPE = CorePackage.VIEW_COMPONENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_STEREOTYPE_APPLICATIONS = CorePackage.VIEW_COMPONENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_TARGET_DIRECTED_RELATIONSHIPS = CorePackage.VIEW_COMPONENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.VIEW_COMPONENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_VALUE__STEREOTYPE_STRING = CorePackage.VIEW_COMPONENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___HAS_KEYWORD__STRING = CorePackage.VIEW_COMPONENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___HAS_VALUE__STEREOTYPE_STRING = CorePackage.VIEW_COMPONENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = CorePackage.VIEW_COMPONENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___IS_STEREOTYPE_APPLIED__STEREOTYPE = CorePackage.VIEW_COMPONENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___IS_STEREOTYPE_REQUIRED__STEREOTYPE = CorePackage.VIEW_COMPONENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___REMOVE_KEYWORD__STRING = CorePackage.VIEW_COMPONENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___SET_VALUE__STEREOTYPE_STRING_OBJECT = CorePackage.VIEW_COMPONENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___UNAPPLY_STEREOTYPE__STEREOTYPE = CorePackage.VIEW_COMPONENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___ALL_OWNED_ELEMENTS = CorePackage.VIEW_COMPONENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___MUST_BE_OWNED = CorePackage.VIEW_COMPONENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_COMPONENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___CREATE_DEPENDENCY__NAMEDELEMENT = CorePackage.VIEW_COMPONENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___CREATE_USAGE__NAMEDELEMENT = CorePackage.VIEW_COMPONENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_LABEL = CorePackage.VIEW_COMPONENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_LABEL__BOOLEAN = CorePackage.VIEW_COMPONENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___ALL_NAMESPACES = CorePackage.VIEW_COMPONENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___ALL_OWNING_PACKAGES = CorePackage.VIEW_COMPONENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CorePackage.VIEW_COMPONENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_NAMESPACE = CorePackage.VIEW_COMPONENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_QUALIFIED_NAME = CorePackage.VIEW_COMPONENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___SEPARATOR = CorePackage.VIEW_COMPONENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_CLIENT_DEPENDENCY__STRING = CorePackage.VIEW_COMPONENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = CorePackage.VIEW_COMPONENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___CREATE_NAME_EXPRESSION__STRING_TYPE = CorePackage.VIEW_COMPONENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___CREATE_OWNED_COMMENT = CorePackage.VIEW_COMPONENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS___CREATE__ECLASS = CorePackage.VIEW_COMPONENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_OPERATION_COUNT = CorePackage.VIEW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.IFMLWindowImpl <em>IFML Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.IFMLWindowImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getIFMLWindow()
	 * @generated
	 */
	int IFML_WINDOW = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__ID = CorePackage.VIEW_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__CONSTRAINTS = CorePackage.VIEW_CONTAINER__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__ANNOTATIONS = CorePackage.VIEW_CONTAINER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__EANNOTATIONS = CorePackage.VIEW_CONTAINER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__OWNED_COMMENT = CorePackage.VIEW_CONTAINER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__OWNED_ELEMENT = CorePackage.VIEW_CONTAINER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__OWNER = CorePackage.VIEW_CONTAINER__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__CLIENT_DEPENDENCY = CorePackage.VIEW_CONTAINER__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__NAME = CorePackage.VIEW_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__NAME_EXPRESSION = CorePackage.VIEW_CONTAINER__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__NAMESPACE = CorePackage.VIEW_CONTAINER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__QUALIFIED_NAME = CorePackage.VIEW_CONTAINER__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__VISIBILITY = CorePackage.VIEW_CONTAINER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__PARAMETERS = CorePackage.VIEW_CONTAINER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__OUT_INTERACTION_FLOWS = CorePackage.VIEW_CONTAINER__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__IN_INTERACTION_FLOWS = CorePackage.VIEW_CONTAINER__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_CONTAINER__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__ACTIVATION_EXPRESSION = CorePackage.VIEW_CONTAINER__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__VIEW_CONTAINER = CorePackage.VIEW_CONTAINER__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>Is Landmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__IS_LANDMARK = CorePackage.VIEW_CONTAINER__IS_LANDMARK;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__IS_DEFAULT = CorePackage.VIEW_CONTAINER__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Is XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__IS_XOR = CorePackage.VIEW_CONTAINER__IS_XOR;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__VIEW_ELEMENTS = CorePackage.VIEW_CONTAINER__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__ACTIONS = CorePackage.VIEW_CONTAINER__ACTIONS;

	/**
	 * The feature id for the '<em><b>Is Modal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__IS_MODAL = CorePackage.VIEW_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is New Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW__IS_NEW_WINDOW = CorePackage.VIEW_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IFML Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW_FEATURE_COUNT = CorePackage.VIEW_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_EANNOTATION__STRING = CorePackage.VIEW_CONTAINER___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_CONTAINER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_CONTAINER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___ADD_KEYWORD__STRING = CorePackage.VIEW_CONTAINER___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___APPLY_STEREOTYPE__STEREOTYPE = CorePackage.VIEW_CONTAINER___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___CREATE_EANNOTATION__STRING = CorePackage.VIEW_CONTAINER___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___DESTROY = CorePackage.VIEW_CONTAINER___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_KEYWORDS = CorePackage.VIEW_CONTAINER___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_APPLICABLE_STEREOTYPE__STRING = CorePackage.VIEW_CONTAINER___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_APPLICABLE_STEREOTYPES = CorePackage.VIEW_CONTAINER___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_APPLIED_STEREOTYPE__STRING = CorePackage.VIEW_CONTAINER___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_APPLIED_STEREOTYPES = CorePackage.VIEW_CONTAINER___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = CorePackage.VIEW_CONTAINER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = CorePackage.VIEW_CONTAINER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_MODEL = CorePackage.VIEW_CONTAINER___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_NEAREST_PACKAGE = CorePackage.VIEW_CONTAINER___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_RELATIONSHIPS = CorePackage.VIEW_CONTAINER___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_RELATIONSHIPS__ECLASS = CorePackage.VIEW_CONTAINER___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_REQUIRED_STEREOTYPE__STRING = CorePackage.VIEW_CONTAINER___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_REQUIRED_STEREOTYPES = CorePackage.VIEW_CONTAINER___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_SOURCE_DIRECTED_RELATIONSHIPS = CorePackage.VIEW_CONTAINER___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.VIEW_CONTAINER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_STEREOTYPE_APPLICATION__STEREOTYPE = CorePackage.VIEW_CONTAINER___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_STEREOTYPE_APPLICATIONS = CorePackage.VIEW_CONTAINER___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_TARGET_DIRECTED_RELATIONSHIPS = CorePackage.VIEW_CONTAINER___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.VIEW_CONTAINER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_VALUE__STEREOTYPE_STRING = CorePackage.VIEW_CONTAINER___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___HAS_KEYWORD__STRING = CorePackage.VIEW_CONTAINER___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___HAS_VALUE__STEREOTYPE_STRING = CorePackage.VIEW_CONTAINER___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = CorePackage.VIEW_CONTAINER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___IS_STEREOTYPE_APPLIED__STEREOTYPE = CorePackage.VIEW_CONTAINER___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___IS_STEREOTYPE_REQUIRED__STEREOTYPE = CorePackage.VIEW_CONTAINER___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___REMOVE_KEYWORD__STRING = CorePackage.VIEW_CONTAINER___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___SET_VALUE__STEREOTYPE_STRING_OBJECT = CorePackage.VIEW_CONTAINER___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___UNAPPLY_STEREOTYPE__STEREOTYPE = CorePackage.VIEW_CONTAINER___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___ALL_OWNED_ELEMENTS = CorePackage.VIEW_CONTAINER___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___MUST_BE_OWNED = CorePackage.VIEW_CONTAINER___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_CONTAINER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_CONTAINER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_CONTAINER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___CREATE_DEPENDENCY__NAMEDELEMENT = CorePackage.VIEW_CONTAINER___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___CREATE_USAGE__NAMEDELEMENT = CorePackage.VIEW_CONTAINER___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_LABEL = CorePackage.VIEW_CONTAINER___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_LABEL__BOOLEAN = CorePackage.VIEW_CONTAINER___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___ALL_NAMESPACES = CorePackage.VIEW_CONTAINER___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___ALL_OWNING_PACKAGES = CorePackage.VIEW_CONTAINER___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CorePackage.VIEW_CONTAINER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_NAMESPACE = CorePackage.VIEW_CONTAINER___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_QUALIFIED_NAME = CorePackage.VIEW_CONTAINER___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___SEPARATOR = CorePackage.VIEW_CONTAINER___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_CLIENT_DEPENDENCY__STRING = CorePackage.VIEW_CONTAINER___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = CorePackage.VIEW_CONTAINER___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___CREATE_NAME_EXPRESSION__STRING_TYPE = CorePackage.VIEW_CONTAINER___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___CREATE_OWNED_COMMENT = CorePackage.VIEW_CONTAINER___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW___CREATE__ECLASS = CorePackage.VIEW_CONTAINER___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>IFML Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_WINDOW_OPERATION_COUNT = CorePackage.VIEW_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.OnLoadEventImpl <em>On Load Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.OnLoadEventImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getOnLoadEvent()
	 * @generated
	 */
	int ON_LOAD_EVENT = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__ID = CorePackage.SYSTEM_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__CONSTRAINTS = CorePackage.SYSTEM_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__ANNOTATIONS = CorePackage.SYSTEM_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__EANNOTATIONS = CorePackage.SYSTEM_EVENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__OWNED_COMMENT = CorePackage.SYSTEM_EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__OWNED_ELEMENT = CorePackage.SYSTEM_EVENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__OWNER = CorePackage.SYSTEM_EVENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__CLIENT_DEPENDENCY = CorePackage.SYSTEM_EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__NAME = CorePackage.SYSTEM_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__NAME_EXPRESSION = CorePackage.SYSTEM_EVENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__NAMESPACE = CorePackage.SYSTEM_EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__QUALIFIED_NAME = CorePackage.SYSTEM_EVENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__VISIBILITY = CorePackage.SYSTEM_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__PARAMETERS = CorePackage.SYSTEM_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__OUT_INTERACTION_FLOWS = CorePackage.SYSTEM_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__IN_INTERACTION_FLOWS = CorePackage.SYSTEM_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__ACTIVATION_EXPRESSION = CorePackage.SYSTEM_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__INTERACTION_FLOW_EXPRESSION = CorePackage.SYSTEM_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Triggering Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__TRIGGERING_EXPRESSIONS = CorePackage.SYSTEM_EVENT__TRIGGERING_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT__TYPE = CorePackage.SYSTEM_EVENT__TYPE;

	/**
	 * The number of structural features of the '<em>On Load Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT_FEATURE_COUNT = CorePackage.SYSTEM_EVENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_EANNOTATION__STRING = CorePackage.SYSTEM_EVENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = CorePackage.SYSTEM_EVENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = CorePackage.SYSTEM_EVENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___ADD_KEYWORD__STRING = CorePackage.SYSTEM_EVENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___APPLY_STEREOTYPE__STEREOTYPE = CorePackage.SYSTEM_EVENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___CREATE_EANNOTATION__STRING = CorePackage.SYSTEM_EVENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___DESTROY = CorePackage.SYSTEM_EVENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_KEYWORDS = CorePackage.SYSTEM_EVENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_APPLICABLE_STEREOTYPE__STRING = CorePackage.SYSTEM_EVENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_APPLICABLE_STEREOTYPES = CorePackage.SYSTEM_EVENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_APPLIED_STEREOTYPE__STRING = CorePackage.SYSTEM_EVENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_APPLIED_STEREOTYPES = CorePackage.SYSTEM_EVENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = CorePackage.SYSTEM_EVENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = CorePackage.SYSTEM_EVENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_MODEL = CorePackage.SYSTEM_EVENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_NEAREST_PACKAGE = CorePackage.SYSTEM_EVENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_RELATIONSHIPS = CorePackage.SYSTEM_EVENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_RELATIONSHIPS__ECLASS = CorePackage.SYSTEM_EVENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_REQUIRED_STEREOTYPE__STRING = CorePackage.SYSTEM_EVENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_REQUIRED_STEREOTYPES = CorePackage.SYSTEM_EVENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = CorePackage.SYSTEM_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.SYSTEM_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = CorePackage.SYSTEM_EVENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_STEREOTYPE_APPLICATIONS = CorePackage.SYSTEM_EVENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS = CorePackage.SYSTEM_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.SYSTEM_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_VALUE__STEREOTYPE_STRING = CorePackage.SYSTEM_EVENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___HAS_KEYWORD__STRING = CorePackage.SYSTEM_EVENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___HAS_VALUE__STEREOTYPE_STRING = CorePackage.SYSTEM_EVENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = CorePackage.SYSTEM_EVENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = CorePackage.SYSTEM_EVENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = CorePackage.SYSTEM_EVENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___REMOVE_KEYWORD__STRING = CorePackage.SYSTEM_EVENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = CorePackage.SYSTEM_EVENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___UNAPPLY_STEREOTYPE__STEREOTYPE = CorePackage.SYSTEM_EVENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___ALL_OWNED_ELEMENTS = CorePackage.SYSTEM_EVENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___MUST_BE_OWNED = CorePackage.SYSTEM_EVENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.SYSTEM_EVENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.SYSTEM_EVENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = CorePackage.SYSTEM_EVENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___CREATE_DEPENDENCY__NAMEDELEMENT = CorePackage.SYSTEM_EVENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___CREATE_USAGE__NAMEDELEMENT = CorePackage.SYSTEM_EVENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_LABEL = CorePackage.SYSTEM_EVENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_LABEL__BOOLEAN = CorePackage.SYSTEM_EVENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___ALL_NAMESPACES = CorePackage.SYSTEM_EVENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___ALL_OWNING_PACKAGES = CorePackage.SYSTEM_EVENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CorePackage.SYSTEM_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_NAMESPACE = CorePackage.SYSTEM_EVENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_QUALIFIED_NAME = CorePackage.SYSTEM_EVENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___SEPARATOR = CorePackage.SYSTEM_EVENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_CLIENT_DEPENDENCY__STRING = CorePackage.SYSTEM_EVENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = CorePackage.SYSTEM_EVENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___CREATE_NAME_EXPRESSION__STRING_TYPE = CorePackage.SYSTEM_EVENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___CREATE_OWNED_COMMENT = CorePackage.SYSTEM_EVENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT___CREATE__ECLASS = CorePackage.SYSTEM_EVENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>On Load Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_LOAD_EVENT_OPERATION_COUNT = CorePackage.SYSTEM_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.IFMLMenuImpl <em>IFML Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.IFMLMenuImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getIFMLMenu()
	 * @generated
	 */
	int IFML_MENU = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__ID = CorePackage.VIEW_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__CONSTRAINTS = CorePackage.VIEW_CONTAINER__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__ANNOTATIONS = CorePackage.VIEW_CONTAINER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__EANNOTATIONS = CorePackage.VIEW_CONTAINER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__OWNED_COMMENT = CorePackage.VIEW_CONTAINER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__OWNED_ELEMENT = CorePackage.VIEW_CONTAINER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__OWNER = CorePackage.VIEW_CONTAINER__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__CLIENT_DEPENDENCY = CorePackage.VIEW_CONTAINER__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__NAME = CorePackage.VIEW_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__NAME_EXPRESSION = CorePackage.VIEW_CONTAINER__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__NAMESPACE = CorePackage.VIEW_CONTAINER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__QUALIFIED_NAME = CorePackage.VIEW_CONTAINER__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__VISIBILITY = CorePackage.VIEW_CONTAINER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__PARAMETERS = CorePackage.VIEW_CONTAINER__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__OUT_INTERACTION_FLOWS = CorePackage.VIEW_CONTAINER__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__IN_INTERACTION_FLOWS = CorePackage.VIEW_CONTAINER__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__VIEW_ELEMENT_EVENTS = CorePackage.VIEW_CONTAINER__VIEW_ELEMENT_EVENTS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__ACTIVATION_EXPRESSION = CorePackage.VIEW_CONTAINER__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__VIEW_CONTAINER = CorePackage.VIEW_CONTAINER__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>Is Landmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__IS_LANDMARK = CorePackage.VIEW_CONTAINER__IS_LANDMARK;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__IS_DEFAULT = CorePackage.VIEW_CONTAINER__IS_DEFAULT;

	/**
	 * The feature id for the '<em><b>Is XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__IS_XOR = CorePackage.VIEW_CONTAINER__IS_XOR;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__VIEW_ELEMENTS = CorePackage.VIEW_CONTAINER__VIEW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU__ACTIONS = CorePackage.VIEW_CONTAINER__ACTIONS;

	/**
	 * The number of structural features of the '<em>IFML Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU_FEATURE_COUNT = CorePackage.VIEW_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_EANNOTATION__STRING = CorePackage.VIEW_CONTAINER___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_CONTAINER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_CONTAINER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___ADD_KEYWORD__STRING = CorePackage.VIEW_CONTAINER___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___APPLY_STEREOTYPE__STEREOTYPE = CorePackage.VIEW_CONTAINER___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___CREATE_EANNOTATION__STRING = CorePackage.VIEW_CONTAINER___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___DESTROY = CorePackage.VIEW_CONTAINER___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_KEYWORDS = CorePackage.VIEW_CONTAINER___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_APPLICABLE_STEREOTYPE__STRING = CorePackage.VIEW_CONTAINER___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_APPLICABLE_STEREOTYPES = CorePackage.VIEW_CONTAINER___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_APPLIED_STEREOTYPE__STRING = CorePackage.VIEW_CONTAINER___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_APPLIED_STEREOTYPES = CorePackage.VIEW_CONTAINER___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = CorePackage.VIEW_CONTAINER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = CorePackage.VIEW_CONTAINER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_MODEL = CorePackage.VIEW_CONTAINER___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_NEAREST_PACKAGE = CorePackage.VIEW_CONTAINER___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_RELATIONSHIPS = CorePackage.VIEW_CONTAINER___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_RELATIONSHIPS__ECLASS = CorePackage.VIEW_CONTAINER___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_REQUIRED_STEREOTYPE__STRING = CorePackage.VIEW_CONTAINER___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_REQUIRED_STEREOTYPES = CorePackage.VIEW_CONTAINER___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_SOURCE_DIRECTED_RELATIONSHIPS = CorePackage.VIEW_CONTAINER___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.VIEW_CONTAINER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_STEREOTYPE_APPLICATION__STEREOTYPE = CorePackage.VIEW_CONTAINER___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_STEREOTYPE_APPLICATIONS = CorePackage.VIEW_CONTAINER___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_TARGET_DIRECTED_RELATIONSHIPS = CorePackage.VIEW_CONTAINER___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.VIEW_CONTAINER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_VALUE__STEREOTYPE_STRING = CorePackage.VIEW_CONTAINER___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___HAS_KEYWORD__STRING = CorePackage.VIEW_CONTAINER___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___HAS_VALUE__STEREOTYPE_STRING = CorePackage.VIEW_CONTAINER___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = CorePackage.VIEW_CONTAINER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___IS_STEREOTYPE_APPLIED__STEREOTYPE = CorePackage.VIEW_CONTAINER___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___IS_STEREOTYPE_REQUIRED__STEREOTYPE = CorePackage.VIEW_CONTAINER___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___REMOVE_KEYWORD__STRING = CorePackage.VIEW_CONTAINER___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___SET_VALUE__STEREOTYPE_STRING_OBJECT = CorePackage.VIEW_CONTAINER___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___UNAPPLY_STEREOTYPE__STEREOTYPE = CorePackage.VIEW_CONTAINER___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___ALL_OWNED_ELEMENTS = CorePackage.VIEW_CONTAINER___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___MUST_BE_OWNED = CorePackage.VIEW_CONTAINER___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_CONTAINER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_CONTAINER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = CorePackage.VIEW_CONTAINER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___CREATE_DEPENDENCY__NAMEDELEMENT = CorePackage.VIEW_CONTAINER___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___CREATE_USAGE__NAMEDELEMENT = CorePackage.VIEW_CONTAINER___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_LABEL = CorePackage.VIEW_CONTAINER___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_LABEL__BOOLEAN = CorePackage.VIEW_CONTAINER___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___ALL_NAMESPACES = CorePackage.VIEW_CONTAINER___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___ALL_OWNING_PACKAGES = CorePackage.VIEW_CONTAINER___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CorePackage.VIEW_CONTAINER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_NAMESPACE = CorePackage.VIEW_CONTAINER___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_QUALIFIED_NAME = CorePackage.VIEW_CONTAINER___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___SEPARATOR = CorePackage.VIEW_CONTAINER___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_CLIENT_DEPENDENCY__STRING = CorePackage.VIEW_CONTAINER___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = CorePackage.VIEW_CONTAINER___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___CREATE_NAME_EXPRESSION__STRING_TYPE = CorePackage.VIEW_CONTAINER___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___CREATE_OWNED_COMMENT = CorePackage.VIEW_CONTAINER___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU___CREATE__ECLASS = CorePackage.VIEW_CONTAINER___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>IFML Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFML_MENU_OPERATION_COUNT = CorePackage.VIEW_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.JumpEventImpl <em>Jump Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.JumpEventImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getJumpEvent()
	 * @generated
	 */
	int JUMP_EVENT = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__ID = CorePackage.THROWING_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__CONSTRAINTS = CorePackage.THROWING_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__ANNOTATIONS = CorePackage.THROWING_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__EANNOTATIONS = CorePackage.THROWING_EVENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__OWNED_COMMENT = CorePackage.THROWING_EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__OWNED_ELEMENT = CorePackage.THROWING_EVENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__OWNER = CorePackage.THROWING_EVENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__CLIENT_DEPENDENCY = CorePackage.THROWING_EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__NAME = CorePackage.THROWING_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__NAME_EXPRESSION = CorePackage.THROWING_EVENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__NAMESPACE = CorePackage.THROWING_EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__QUALIFIED_NAME = CorePackage.THROWING_EVENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__VISIBILITY = CorePackage.THROWING_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__PARAMETERS = CorePackage.THROWING_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__OUT_INTERACTION_FLOWS = CorePackage.THROWING_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__IN_INTERACTION_FLOWS = CorePackage.THROWING_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__ACTIVATION_EXPRESSION = CorePackage.THROWING_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__INTERACTION_FLOW_EXPRESSION = CorePackage.THROWING_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Landing Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT__LANDING_EVENT = CorePackage.THROWING_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jump Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT_FEATURE_COUNT = CorePackage.THROWING_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_EANNOTATION__STRING = CorePackage.THROWING_EVENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = CorePackage.THROWING_EVENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = CorePackage.THROWING_EVENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___ADD_KEYWORD__STRING = CorePackage.THROWING_EVENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___APPLY_STEREOTYPE__STEREOTYPE = CorePackage.THROWING_EVENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___CREATE_EANNOTATION__STRING = CorePackage.THROWING_EVENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___DESTROY = CorePackage.THROWING_EVENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_KEYWORDS = CorePackage.THROWING_EVENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_APPLICABLE_STEREOTYPE__STRING = CorePackage.THROWING_EVENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_APPLICABLE_STEREOTYPES = CorePackage.THROWING_EVENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_APPLIED_STEREOTYPE__STRING = CorePackage.THROWING_EVENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_APPLIED_STEREOTYPES = CorePackage.THROWING_EVENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = CorePackage.THROWING_EVENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = CorePackage.THROWING_EVENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_MODEL = CorePackage.THROWING_EVENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_NEAREST_PACKAGE = CorePackage.THROWING_EVENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_RELATIONSHIPS = CorePackage.THROWING_EVENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_RELATIONSHIPS__ECLASS = CorePackage.THROWING_EVENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_REQUIRED_STEREOTYPE__STRING = CorePackage.THROWING_EVENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_REQUIRED_STEREOTYPES = CorePackage.THROWING_EVENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = CorePackage.THROWING_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.THROWING_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = CorePackage.THROWING_EVENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_STEREOTYPE_APPLICATIONS = CorePackage.THROWING_EVENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS = CorePackage.THROWING_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.THROWING_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_VALUE__STEREOTYPE_STRING = CorePackage.THROWING_EVENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___HAS_KEYWORD__STRING = CorePackage.THROWING_EVENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___HAS_VALUE__STEREOTYPE_STRING = CorePackage.THROWING_EVENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = CorePackage.THROWING_EVENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = CorePackage.THROWING_EVENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = CorePackage.THROWING_EVENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___REMOVE_KEYWORD__STRING = CorePackage.THROWING_EVENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = CorePackage.THROWING_EVENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___UNAPPLY_STEREOTYPE__STEREOTYPE = CorePackage.THROWING_EVENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___ALL_OWNED_ELEMENTS = CorePackage.THROWING_EVENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___MUST_BE_OWNED = CorePackage.THROWING_EVENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.THROWING_EVENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.THROWING_EVENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = CorePackage.THROWING_EVENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___CREATE_DEPENDENCY__NAMEDELEMENT = CorePackage.THROWING_EVENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___CREATE_USAGE__NAMEDELEMENT = CorePackage.THROWING_EVENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_LABEL = CorePackage.THROWING_EVENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_LABEL__BOOLEAN = CorePackage.THROWING_EVENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___ALL_NAMESPACES = CorePackage.THROWING_EVENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___ALL_OWNING_PACKAGES = CorePackage.THROWING_EVENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CorePackage.THROWING_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_NAMESPACE = CorePackage.THROWING_EVENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_QUALIFIED_NAME = CorePackage.THROWING_EVENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___SEPARATOR = CorePackage.THROWING_EVENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_CLIENT_DEPENDENCY__STRING = CorePackage.THROWING_EVENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = CorePackage.THROWING_EVENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___CREATE_NAME_EXPRESSION__STRING_TYPE = CorePackage.THROWING_EVENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___CREATE_OWNED_COMMENT = CorePackage.THROWING_EVENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT___CREATE__ECLASS = CorePackage.THROWING_EVENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Jump Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_EVENT_OPERATION_COUNT = CorePackage.THROWING_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.LandingEventImpl <em>Landing Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.LandingEventImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getLandingEvent()
	 * @generated
	 */
	int LANDING_EVENT = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__ID = CorePackage.CATCHING_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__CONSTRAINTS = CorePackage.CATCHING_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__ANNOTATIONS = CorePackage.CATCHING_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__EANNOTATIONS = CorePackage.CATCHING_EVENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__OWNED_COMMENT = CorePackage.CATCHING_EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__OWNED_ELEMENT = CorePackage.CATCHING_EVENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__OWNER = CorePackage.CATCHING_EVENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__CLIENT_DEPENDENCY = CorePackage.CATCHING_EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__NAME = CorePackage.CATCHING_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__NAME_EXPRESSION = CorePackage.CATCHING_EVENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__NAMESPACE = CorePackage.CATCHING_EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__QUALIFIED_NAME = CorePackage.CATCHING_EVENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__VISIBILITY = CorePackage.CATCHING_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__PARAMETERS = CorePackage.CATCHING_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__OUT_INTERACTION_FLOWS = CorePackage.CATCHING_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__IN_INTERACTION_FLOWS = CorePackage.CATCHING_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__ACTIVATION_EXPRESSION = CorePackage.CATCHING_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__INTERACTION_FLOW_EXPRESSION = CorePackage.CATCHING_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Jumping Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT__JUMPING_EVENTS = CorePackage.CATCHING_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Landing Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT_FEATURE_COUNT = CorePackage.CATCHING_EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_EANNOTATION__STRING = CorePackage.CATCHING_EVENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = CorePackage.CATCHING_EVENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = CorePackage.CATCHING_EVENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___ADD_KEYWORD__STRING = CorePackage.CATCHING_EVENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___APPLY_STEREOTYPE__STEREOTYPE = CorePackage.CATCHING_EVENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___CREATE_EANNOTATION__STRING = CorePackage.CATCHING_EVENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___DESTROY = CorePackage.CATCHING_EVENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_KEYWORDS = CorePackage.CATCHING_EVENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_APPLICABLE_STEREOTYPE__STRING = CorePackage.CATCHING_EVENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_APPLICABLE_STEREOTYPES = CorePackage.CATCHING_EVENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_APPLIED_STEREOTYPE__STRING = CorePackage.CATCHING_EVENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_APPLIED_STEREOTYPES = CorePackage.CATCHING_EVENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = CorePackage.CATCHING_EVENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = CorePackage.CATCHING_EVENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_MODEL = CorePackage.CATCHING_EVENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_NEAREST_PACKAGE = CorePackage.CATCHING_EVENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_RELATIONSHIPS = CorePackage.CATCHING_EVENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_RELATIONSHIPS__ECLASS = CorePackage.CATCHING_EVENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_REQUIRED_STEREOTYPE__STRING = CorePackage.CATCHING_EVENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_REQUIRED_STEREOTYPES = CorePackage.CATCHING_EVENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = CorePackage.CATCHING_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.CATCHING_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = CorePackage.CATCHING_EVENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_STEREOTYPE_APPLICATIONS = CorePackage.CATCHING_EVENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS = CorePackage.CATCHING_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.CATCHING_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_VALUE__STEREOTYPE_STRING = CorePackage.CATCHING_EVENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___HAS_KEYWORD__STRING = CorePackage.CATCHING_EVENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___HAS_VALUE__STEREOTYPE_STRING = CorePackage.CATCHING_EVENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = CorePackage.CATCHING_EVENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = CorePackage.CATCHING_EVENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = CorePackage.CATCHING_EVENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___REMOVE_KEYWORD__STRING = CorePackage.CATCHING_EVENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = CorePackage.CATCHING_EVENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___UNAPPLY_STEREOTYPE__STEREOTYPE = CorePackage.CATCHING_EVENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___ALL_OWNED_ELEMENTS = CorePackage.CATCHING_EVENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___MUST_BE_OWNED = CorePackage.CATCHING_EVENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.CATCHING_EVENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.CATCHING_EVENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = CorePackage.CATCHING_EVENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___CREATE_DEPENDENCY__NAMEDELEMENT = CorePackage.CATCHING_EVENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___CREATE_USAGE__NAMEDELEMENT = CorePackage.CATCHING_EVENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_LABEL = CorePackage.CATCHING_EVENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_LABEL__BOOLEAN = CorePackage.CATCHING_EVENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___ALL_NAMESPACES = CorePackage.CATCHING_EVENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___ALL_OWNING_PACKAGES = CorePackage.CATCHING_EVENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CorePackage.CATCHING_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_NAMESPACE = CorePackage.CATCHING_EVENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_QUALIFIED_NAME = CorePackage.CATCHING_EVENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___SEPARATOR = CorePackage.CATCHING_EVENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_CLIENT_DEPENDENCY__STRING = CorePackage.CATCHING_EVENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = CorePackage.CATCHING_EVENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___CREATE_NAME_EXPRESSION__STRING_TYPE = CorePackage.CATCHING_EVENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___CREATE_OWNED_COMMENT = CorePackage.CATCHING_EVENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT___CREATE__ECLASS = CorePackage.CATCHING_EVENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Landing Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_EVENT_OPERATION_COUNT = CorePackage.CATCHING_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link IFML.Extensions.impl.SetContextEventImpl <em>Set Context Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see IFML.Extensions.impl.SetContextEventImpl
	 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getSetContextEvent()
	 * @generated
	 */
	int SET_CONTEXT_EVENT = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__ID = CorePackage.THROWING_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__CONSTRAINTS = CorePackage.THROWING_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__ANNOTATIONS = CorePackage.THROWING_EVENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__EANNOTATIONS = CorePackage.THROWING_EVENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__OWNED_COMMENT = CorePackage.THROWING_EVENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__OWNED_ELEMENT = CorePackage.THROWING_EVENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__OWNER = CorePackage.THROWING_EVENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__CLIENT_DEPENDENCY = CorePackage.THROWING_EVENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__NAME = CorePackage.THROWING_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__NAME_EXPRESSION = CorePackage.THROWING_EVENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__NAMESPACE = CorePackage.THROWING_EVENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__QUALIFIED_NAME = CorePackage.THROWING_EVENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__VISIBILITY = CorePackage.THROWING_EVENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__PARAMETERS = CorePackage.THROWING_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__OUT_INTERACTION_FLOWS = CorePackage.THROWING_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>In Interaction Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__IN_INTERACTION_FLOWS = CorePackage.THROWING_EVENT__IN_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Activation Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__ACTIVATION_EXPRESSION = CorePackage.THROWING_EVENT__ACTIVATION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT__INTERACTION_FLOW_EXPRESSION = CorePackage.THROWING_EVENT__INTERACTION_FLOW_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Set Context Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT_FEATURE_COUNT = CorePackage.THROWING_EVENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_EANNOTATION__STRING = CorePackage.THROWING_EVENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = CorePackage.THROWING_EVENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = CorePackage.THROWING_EVENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___ADD_KEYWORD__STRING = CorePackage.THROWING_EVENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___APPLY_STEREOTYPE__STEREOTYPE = CorePackage.THROWING_EVENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___CREATE_EANNOTATION__STRING = CorePackage.THROWING_EVENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___DESTROY = CorePackage.THROWING_EVENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_KEYWORDS = CorePackage.THROWING_EVENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_APPLICABLE_STEREOTYPE__STRING = CorePackage.THROWING_EVENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_APPLICABLE_STEREOTYPES = CorePackage.THROWING_EVENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_APPLIED_STEREOTYPE__STRING = CorePackage.THROWING_EVENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_APPLIED_STEREOTYPES = CorePackage.THROWING_EVENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = CorePackage.THROWING_EVENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = CorePackage.THROWING_EVENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_MODEL = CorePackage.THROWING_EVENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_NEAREST_PACKAGE = CorePackage.THROWING_EVENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_RELATIONSHIPS = CorePackage.THROWING_EVENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_RELATIONSHIPS__ECLASS = CorePackage.THROWING_EVENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_REQUIRED_STEREOTYPE__STRING = CorePackage.THROWING_EVENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_REQUIRED_STEREOTYPES = CorePackage.THROWING_EVENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = CorePackage.THROWING_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.THROWING_EVENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = CorePackage.THROWING_EVENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_STEREOTYPE_APPLICATIONS = CorePackage.THROWING_EVENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS = CorePackage.THROWING_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = CorePackage.THROWING_EVENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_VALUE__STEREOTYPE_STRING = CorePackage.THROWING_EVENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___HAS_KEYWORD__STRING = CorePackage.THROWING_EVENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___HAS_VALUE__STEREOTYPE_STRING = CorePackage.THROWING_EVENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = CorePackage.THROWING_EVENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = CorePackage.THROWING_EVENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = CorePackage.THROWING_EVENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___REMOVE_KEYWORD__STRING = CorePackage.THROWING_EVENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = CorePackage.THROWING_EVENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___UNAPPLY_STEREOTYPE__STEREOTYPE = CorePackage.THROWING_EVENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___ALL_OWNED_ELEMENTS = CorePackage.THROWING_EVENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___MUST_BE_OWNED = CorePackage.THROWING_EVENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.THROWING_EVENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = CorePackage.THROWING_EVENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = CorePackage.THROWING_EVENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___CREATE_DEPENDENCY__NAMEDELEMENT = CorePackage.THROWING_EVENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___CREATE_USAGE__NAMEDELEMENT = CorePackage.THROWING_EVENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_LABEL = CorePackage.THROWING_EVENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_LABEL__BOOLEAN = CorePackage.THROWING_EVENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___ALL_NAMESPACES = CorePackage.THROWING_EVENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___ALL_OWNING_PACKAGES = CorePackage.THROWING_EVENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = CorePackage.THROWING_EVENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_NAMESPACE = CorePackage.THROWING_EVENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_QUALIFIED_NAME = CorePackage.THROWING_EVENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___SEPARATOR = CorePackage.THROWING_EVENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_CLIENT_DEPENDENCY__STRING = CorePackage.THROWING_EVENT___GET_CLIENT_DEPENDENCY__STRING;

	/**
	 * The operation id for the '<em>Get Client Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS = CorePackage.THROWING_EVENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;

	/**
	 * The operation id for the '<em>Create Name Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___CREATE_NAME_EXPRESSION__STRING_TYPE = CorePackage.THROWING_EVENT___CREATE_NAME_EXPRESSION__STRING_TYPE;

	/**
	 * The operation id for the '<em>Create Owned Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___CREATE_OWNED_COMMENT = CorePackage.THROWING_EVENT___CREATE_OWNED_COMMENT;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT___CREATE__ECLASS = CorePackage.THROWING_EVENT___CREATE__ECLASS;

	/**
	 * The number of operations of the '<em>Set Context Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTEXT_EVENT_OPERATION_COUNT = CorePackage.THROWING_EVENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link IFML.Extensions.OnSubmitEvent <em>On Submit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Submit Event</em>'.
	 * @see IFML.Extensions.OnSubmitEvent
	 * @generated
	 */
	EClass getOnSubmitEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.ValidationRule <em>Validation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation Rule</em>'.
	 * @see IFML.Extensions.ValidationRule
	 * @generated
	 */
	EClass getValidationRule();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see IFML.Extensions.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the containment reference list '{@link IFML.Extensions.List#getSelectEvent <em>Select Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Select Event</em>'.
	 * @see IFML.Extensions.List#getSelectEvent()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_SelectEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see IFML.Extensions.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.UserRole <em>User Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Role</em>'.
	 * @see IFML.Extensions.UserRole
	 * @generated
	 */
	EClass getUserRole();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.IFMLSlot <em>IFML Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFML Slot</em>'.
	 * @see IFML.Extensions.IFMLSlot
	 * @generated
	 */
	EClass getIFMLSlot();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.OnSelectEvent <em>On Select Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Select Event</em>'.
	 * @see IFML.Extensions.OnSelectEvent
	 * @generated
	 */
	EClass getOnSelectEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see IFML.Extensions.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see IFML.Extensions.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see IFML.Extensions.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.SelectionField <em>Selection Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Field</em>'.
	 * @see IFML.Extensions.SelectionField
	 * @generated
	 */
	EClass getSelectionField();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Extensions.SelectionField#isIsMultiSelection <em>Is Multi Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multi Selection</em>'.
	 * @see IFML.Extensions.SelectionField#isIsMultiSelection()
	 * @see #getSelectionField()
	 * @generated
	 */
	EAttribute getSelectionField_IsMultiSelection();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.SimpleField <em>Simple Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Field</em>'.
	 * @see IFML.Extensions.SimpleField
	 * @generated
	 */
	EClass getSimpleField();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.Details <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Details</em>'.
	 * @see IFML.Extensions.Details
	 * @generated
	 */
	EClass getDetails();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.IFMLWindow <em>IFML Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFML Window</em>'.
	 * @see IFML.Extensions.IFMLWindow
	 * @generated
	 */
	EClass getIFMLWindow();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Extensions.IFMLWindow#isIsModal <em>Is Modal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Modal</em>'.
	 * @see IFML.Extensions.IFMLWindow#isIsModal()
	 * @see #getIFMLWindow()
	 * @generated
	 */
	EAttribute getIFMLWindow_IsModal();

	/**
	 * Returns the meta object for the attribute '{@link IFML.Extensions.IFMLWindow#isIsNewWindow <em>Is New Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is New Window</em>'.
	 * @see IFML.Extensions.IFMLWindow#isIsNewWindow()
	 * @see #getIFMLWindow()
	 * @generated
	 */
	EAttribute getIFMLWindow_IsNewWindow();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.OnLoadEvent <em>On Load Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Load Event</em>'.
	 * @see IFML.Extensions.OnLoadEvent
	 * @generated
	 */
	EClass getOnLoadEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.IFMLMenu <em>IFML Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFML Menu</em>'.
	 * @see IFML.Extensions.IFMLMenu
	 * @generated
	 */
	EClass getIFMLMenu();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.JumpEvent <em>Jump Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump Event</em>'.
	 * @see IFML.Extensions.JumpEvent
	 * @generated
	 */
	EClass getJumpEvent();

	/**
	 * Returns the meta object for the reference '{@link IFML.Extensions.JumpEvent#getLandingEvent <em>Landing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Landing Event</em>'.
	 * @see IFML.Extensions.JumpEvent#getLandingEvent()
	 * @see #getJumpEvent()
	 * @generated
	 */
	EReference getJumpEvent_LandingEvent();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.LandingEvent <em>Landing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Landing Event</em>'.
	 * @see IFML.Extensions.LandingEvent
	 * @generated
	 */
	EClass getLandingEvent();

	/**
	 * Returns the meta object for the reference list '{@link IFML.Extensions.LandingEvent#getJumpingEvents <em>Jumping Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Jumping Events</em>'.
	 * @see IFML.Extensions.LandingEvent#getJumpingEvents()
	 * @see #getLandingEvent()
	 * @generated
	 */
	EReference getLandingEvent_JumpingEvents();

	/**
	 * Returns the meta object for class '{@link IFML.Extensions.SetContextEvent <em>Set Context Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Context Event</em>'.
	 * @see IFML.Extensions.SetContextEvent
	 * @generated
	 */
	EClass getSetContextEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtensionsFactory getExtensionsFactory();

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
		 * The meta object literal for the '{@link IFML.Extensions.impl.OnSubmitEventImpl <em>On Submit Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.OnSubmitEventImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getOnSubmitEvent()
		 * @generated
		 */
		EClass ON_SUBMIT_EVENT = eINSTANCE.getOnSubmitEvent();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.ValidationRuleImpl <em>Validation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.ValidationRuleImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getValidationRule()
		 * @generated
		 */
		EClass VALIDATION_RULE = eINSTANCE.getValidationRule();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.ListImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Select Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__SELECT_EVENT = eINSTANCE.getList_SelectEvent();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.PositionImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.UserRoleImpl <em>User Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.UserRoleImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getUserRole()
		 * @generated
		 */
		EClass USER_ROLE = eINSTANCE.getUserRole();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.IFMLSlotImpl <em>IFML Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.IFMLSlotImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getIFMLSlot()
		 * @generated
		 */
		EClass IFML_SLOT = eINSTANCE.getIFMLSlot();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.OnSelectEventImpl <em>On Select Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.OnSelectEventImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getOnSelectEvent()
		 * @generated
		 */
		EClass ON_SELECT_EVENT = eINSTANCE.getOnSelectEvent();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.FieldImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.FormImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.DeviceImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.SelectionFieldImpl <em>Selection Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.SelectionFieldImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getSelectionField()
		 * @generated
		 */
		EClass SELECTION_FIELD = eINSTANCE.getSelectionField();

		/**
		 * The meta object literal for the '<em><b>Is Multi Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION_FIELD__IS_MULTI_SELECTION = eINSTANCE.getSelectionField_IsMultiSelection();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.SimpleFieldImpl <em>Simple Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.SimpleFieldImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getSimpleField()
		 * @generated
		 */
		EClass SIMPLE_FIELD = eINSTANCE.getSimpleField();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.DetailsImpl <em>Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.DetailsImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getDetails()
		 * @generated
		 */
		EClass DETAILS = eINSTANCE.getDetails();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.IFMLWindowImpl <em>IFML Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.IFMLWindowImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getIFMLWindow()
		 * @generated
		 */
		EClass IFML_WINDOW = eINSTANCE.getIFMLWindow();

		/**
		 * The meta object literal for the '<em><b>Is Modal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFML_WINDOW__IS_MODAL = eINSTANCE.getIFMLWindow_IsModal();

		/**
		 * The meta object literal for the '<em><b>Is New Window</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IFML_WINDOW__IS_NEW_WINDOW = eINSTANCE.getIFMLWindow_IsNewWindow();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.OnLoadEventImpl <em>On Load Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.OnLoadEventImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getOnLoadEvent()
		 * @generated
		 */
		EClass ON_LOAD_EVENT = eINSTANCE.getOnLoadEvent();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.IFMLMenuImpl <em>IFML Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.IFMLMenuImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getIFMLMenu()
		 * @generated
		 */
		EClass IFML_MENU = eINSTANCE.getIFMLMenu();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.JumpEventImpl <em>Jump Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.JumpEventImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getJumpEvent()
		 * @generated
		 */
		EClass JUMP_EVENT = eINSTANCE.getJumpEvent();

		/**
		 * The meta object literal for the '<em><b>Landing Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUMP_EVENT__LANDING_EVENT = eINSTANCE.getJumpEvent_LandingEvent();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.LandingEventImpl <em>Landing Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.LandingEventImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getLandingEvent()
		 * @generated
		 */
		EClass LANDING_EVENT = eINSTANCE.getLandingEvent();

		/**
		 * The meta object literal for the '<em><b>Jumping Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANDING_EVENT__JUMPING_EVENTS = eINSTANCE.getLandingEvent_JumpingEvents();

		/**
		 * The meta object literal for the '{@link IFML.Extensions.impl.SetContextEventImpl <em>Set Context Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see IFML.Extensions.impl.SetContextEventImpl
		 * @see IFML.Extensions.impl.ExtensionsPackageImpl#getSetContextEvent()
		 * @generated
		 */
		EClass SET_CONTEXT_EVENT = eINSTANCE.getSetContextEvent();

	}

} //ExtensionsPackage
