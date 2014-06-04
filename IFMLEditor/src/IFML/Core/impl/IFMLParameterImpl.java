/**
 */
package IFML.Core.impl;

import IFML.Core.CorePackage;
import IFML.Core.Expression;
import IFML.Core.IFMLNamedElement;
import IFML.Core.IFMLParameter;
import IFML.DataTypes.Direction;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.VisibilityKind;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IFML Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.IFMLParameterImpl#getEAnnotations <em>EAnnotations</em>}</li>
 *   <li>{@link IFML.Core.impl.IFMLParameterImpl#getOwnedComments <em>Owned Comment</em>}</li>
 *   <li>{@link IFML.Core.impl.IFMLParameterImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link IFML.Core.impl.IFMLParameterImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link IFML.Core.impl.IFMLParameterImpl#getClientDependencies <em>Client Dependency</em>}</li>
 *   <li>{@link IFML.Core.impl.IFMLParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link IFML.Core.impl.IFMLParameterImpl#getNameExpression <em>Name Expression</em>}</li>
 *   <li>{@link IFML.Core.impl.IFMLParameterImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link IFML.Core.impl.IFMLParameterImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link IFML.Core.impl.IFMLParameterImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link IFML.Core.impl.IFMLParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link IFML.Core.impl.IFMLParameterImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link IFML.Core.impl.IFMLParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IFMLParameterImpl extends InteractionFlowModelElementImpl implements IFMLParameter {
	/**
	 * The cached value of the '{@link #getEAnnotations() <em>EAnnotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<EAnnotation> eAnnotations;

	/**
	 * The cached value of the '{@link #getOwnedComments() <em>Owned Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> ownedComments;

	/**
	 * The cached value of the '{@link #getClientDependencies() <em>Client Dependency</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> clientDependencies;

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
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

	/**
	 * The cached value of the '{@link #getNameExpression() <em>Name Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameExpression()
	 * @generated
	 * @ordered
	 */
	protected StringExpression nameExpression;

	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC_LITERAL;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * This is true if the Visibility attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibilityESet;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Direction DIRECTION_EDEFAULT = Direction.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Direction direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected Expression defaultValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IFMLParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IFML_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EAnnotation> getEAnnotations() {
		if (eAnnotations == null) {
			eAnnotations = new EObjectContainmentWithInverseEList<EAnnotation>(EAnnotation.class, this, CorePackage.IFML_PARAMETER__EANNOTATIONS, EcorePackage.EANNOTATION__EMODEL_ELEMENT);
		}
		return eAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getOwnedComments() {
		if (ownedComments == null) {
			ownedComments = new EObjectContainmentEList.Resolving<Comment>(Comment.class, this, CorePackage.IFML_PARAMETER__OWNED_COMMENT);
		}
		return ownedComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getOwnedElements() {
		// TODO: implement this method to return the 'Owned Element' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy() ? (Element)eResolveProxy((InternalEObject)owner) : owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		// TODO: implement this method to return the 'Owner' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getClientDependencies() {
		if (clientDependencies == null) {
			clientDependencies = new EObjectWithInverseResolvingEList.ManyInverse<Dependency>(Dependency.class, this, CorePackage.IFML_PARAMETER__CLIENT_DEPENDENCY, UMLPackage.DEPENDENCY__CLIENT);
		}
		return clientDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IFML_PARAMETER__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.IFML_PARAMETER__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression getNameExpression() {
		if (nameExpression != null && nameExpression.eIsProxy()) {
			InternalEObject oldNameExpression = (InternalEObject)nameExpression;
			nameExpression = (StringExpression)eResolveProxy(oldNameExpression);
			if (nameExpression != oldNameExpression) {
				InternalEObject newNameExpression = (InternalEObject)nameExpression;
				NotificationChain msgs = oldNameExpression.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.IFML_PARAMETER__NAME_EXPRESSION, null, null);
				if (newNameExpression.eInternalContainer() == null) {
					msgs = newNameExpression.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.IFML_PARAMETER__NAME_EXPRESSION, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.IFML_PARAMETER__NAME_EXPRESSION, oldNameExpression, nameExpression));
			}
		}
		return nameExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression basicGetNameExpression() {
		return nameExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameExpression(StringExpression newNameExpression, NotificationChain msgs) {
		StringExpression oldNameExpression = nameExpression;
		nameExpression = newNameExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.IFML_PARAMETER__NAME_EXPRESSION, oldNameExpression, newNameExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameExpression(StringExpression newNameExpression) {
		if (newNameExpression != nameExpression) {
			NotificationChain msgs = null;
			if (nameExpression != null)
				msgs = ((InternalEObject)nameExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.IFML_PARAMETER__NAME_EXPRESSION, null, msgs);
			if (newNameExpression != null)
				msgs = ((InternalEObject)newNameExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.IFML_PARAMETER__NAME_EXPRESSION, null, msgs);
			msgs = basicSetNameExpression(newNameExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IFML_PARAMETER__NAME_EXPRESSION, newNameExpression, newNameExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		Namespace namespace = basicGetNamespace();
		return namespace != null && namespace.eIsProxy() ? (Namespace)eResolveProxy((InternalEObject)namespace) : namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		// TODO: implement this method to return the 'Namespace' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName() {
		// TODO: implement this method to return the 'Qualified Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		boolean oldVisibilityESet = visibilityESet;
		visibilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IFML_PARAMETER__VISIBILITY, oldVisibility, visibility, !oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibility() {
		VisibilityKind oldVisibility = visibility;
		boolean oldVisibilityESet = visibilityESet;
		visibility = VISIBILITY_EDEFAULT;
		visibilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.IFML_PARAMETER__VISIBILITY, oldVisibility, VISIBILITY_EDEFAULT, oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibility() {
		return visibilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.IFML_PARAMETER__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IFML_PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(Direction newDirection) {
		Direction oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IFML_PARAMETER__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getDefaultValue() {
		if (defaultValue != null && defaultValue.eIsProxy()) {
			InternalEObject oldDefaultValue = (InternalEObject)defaultValue;
			defaultValue = (Expression)eResolveProxy(oldDefaultValue);
			if (defaultValue != oldDefaultValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.IFML_PARAMETER__DEFAULT_VALUE, oldDefaultValue, defaultValue));
			}
		}
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(Expression newDefaultValue) {
		Expression oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IFML_PARAMETER__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getClientDependency(final String name) {
		return getClientDependency(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getClientDependency(final String name, final boolean ignoreCase, final EClass eClass) {
		clientDependencyLoop : for (Dependency clientDependency : getClientDependencies()) {
			if (eClass != null && !eClass.isInstance(clientDependency))
				continue clientDependencyLoop;
			if (name != null && !(ignoreCase
				? name.equalsIgnoreCase(clientDependency.getName())
				: name.equals(clientDependency.getName())))
				continue clientDependencyLoop;
			return clientDependency;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression createNameExpression(final String name, final Type type) {
		StringExpression newNameExpression = (StringExpression) create(UMLPackage.Literals.STRING_EXPRESSION);
		setNameExpression(newNameExpression);
		if (name != null)
			newNameExpression.setName(name);
		if (type != null)
			newNameExpression.setType(type);
		return newNameExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createOwnedComment() {
		Comment newOwnedComment = (Comment) create(UMLPackage.Literals.COMMENT);
			getOwnedComments().add(newOwnedComment);
		return newOwnedComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(final EClass eClass) {
		return EcoreUtil.create(eClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasQualifiedName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UMLValidator.DIAGNOSTIC_SOURCE,
						 UMLValidator.NAMED_ELEMENT__HAS_QUALIFIED_NAME,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateHasQualifiedName", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasNoQualifiedName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UMLValidator.DIAGNOSTIC_SOURCE,
						 UMLValidator.NAMED_ELEMENT__HAS_NO_QUALIFIED_NAME,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateHasNoQualifiedName", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibilityNeedsOwnership(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UMLValidator.DIAGNOSTIC_SOURCE,
						 UMLValidator.NAMED_ELEMENT__VISIBILITY_NEEDS_OWNERSHIP,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateVisibilityNeedsOwnership", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency(NamedElement supplier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usage createUsage(NamedElement supplier) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel(boolean localize) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Namespace> allNamespaces() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.uml2.uml.Package> allOwningPackages() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDistinguishableFrom(NamedElement n, Namespace ns) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String separator() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasOwner(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UMLValidator.DIAGNOSTIC_SOURCE,
						 UMLValidator.ELEMENT__HAS_OWNER,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateHasOwner", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotOwnSelf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UMLValidator.DIAGNOSTIC_SOURCE,
						 UMLValidator.ELEMENT__NOT_OWN_SELF,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateNotOwnSelf", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addKeyword(String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject applyStereotype(Stereotype stereotype) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation createEAnnotation(String source) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void destroy() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getKeywords() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype getApplicableStereotype(String qualifiedName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getApplicableStereotypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype getAppliedStereotype(String qualifiedName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getAppliedStereotypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype getAppliedSubstereotype(Stereotype stereotype, String qualifiedName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getAppliedSubstereotypes(Stereotype stereotype) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getNearestPackage() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRelationships() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRelationships(EClass eClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype getRequiredStereotype(String qualifiedName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getRequiredStereotypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DirectedRelationship> getSourceDirectedRelationships() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DirectedRelationship> getSourceDirectedRelationships(EClass eClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getStereotypeApplication(Stereotype stereotype) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getStereotypeApplications() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DirectedRelationship> getTargetDirectedRelationships() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DirectedRelationship> getTargetDirectedRelationships(EClass eClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue(Stereotype stereotype, String propertyName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasKeyword(String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasValue(Stereotype stereotype, String propertyName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStereotypeApplicable(Stereotype stereotype) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStereotypeApplied(Stereotype stereotype) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStereotypeRequired(Stereotype stereotype) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeKeyword(String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Stereotype stereotype, String propertyName, Object newValue) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject unapplyStereotype(Stereotype stereotype) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> allOwnedElements() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean mustBeOwned() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation getEAnnotation(String source) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.IFML_PARAMETER__EANNOTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEAnnotations()).basicAdd(otherEnd, msgs);
			case CorePackage.IFML_PARAMETER__CLIENT_DEPENDENCY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClientDependencies()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.IFML_PARAMETER__EANNOTATIONS:
				return ((InternalEList<?>)getEAnnotations()).basicRemove(otherEnd, msgs);
			case CorePackage.IFML_PARAMETER__OWNED_COMMENT:
				return ((InternalEList<?>)getOwnedComments()).basicRemove(otherEnd, msgs);
			case CorePackage.IFML_PARAMETER__CLIENT_DEPENDENCY:
				return ((InternalEList<?>)getClientDependencies()).basicRemove(otherEnd, msgs);
			case CorePackage.IFML_PARAMETER__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
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
			case CorePackage.IFML_PARAMETER__EANNOTATIONS:
				return getEAnnotations();
			case CorePackage.IFML_PARAMETER__OWNED_COMMENT:
				return getOwnedComments();
			case CorePackage.IFML_PARAMETER__OWNED_ELEMENT:
				return getOwnedElements();
			case CorePackage.IFML_PARAMETER__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case CorePackage.IFML_PARAMETER__CLIENT_DEPENDENCY:
				return getClientDependencies();
			case CorePackage.IFML_PARAMETER__NAME:
				return getName();
			case CorePackage.IFML_PARAMETER__NAME_EXPRESSION:
				if (resolve) return getNameExpression();
				return basicGetNameExpression();
			case CorePackage.IFML_PARAMETER__NAMESPACE:
				if (resolve) return getNamespace();
				return basicGetNamespace();
			case CorePackage.IFML_PARAMETER__QUALIFIED_NAME:
				return getQualifiedName();
			case CorePackage.IFML_PARAMETER__VISIBILITY:
				return getVisibility();
			case CorePackage.IFML_PARAMETER__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case CorePackage.IFML_PARAMETER__DIRECTION:
				return getDirection();
			case CorePackage.IFML_PARAMETER__DEFAULT_VALUE:
				if (resolve) return getDefaultValue();
				return basicGetDefaultValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.IFML_PARAMETER__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection<? extends EAnnotation>)newValue);
				return;
			case CorePackage.IFML_PARAMETER__OWNED_COMMENT:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection<? extends Comment>)newValue);
				return;
			case CorePackage.IFML_PARAMETER__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				getClientDependencies().addAll((Collection<? extends Dependency>)newValue);
				return;
			case CorePackage.IFML_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case CorePackage.IFML_PARAMETER__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case CorePackage.IFML_PARAMETER__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case CorePackage.IFML_PARAMETER__TYPE:
				setType((Type)newValue);
				return;
			case CorePackage.IFML_PARAMETER__DIRECTION:
				setDirection((Direction)newValue);
				return;
			case CorePackage.IFML_PARAMETER__DEFAULT_VALUE:
				setDefaultValue((Expression)newValue);
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
			case CorePackage.IFML_PARAMETER__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case CorePackage.IFML_PARAMETER__OWNED_COMMENT:
				getOwnedComments().clear();
				return;
			case CorePackage.IFML_PARAMETER__CLIENT_DEPENDENCY:
				getClientDependencies().clear();
				return;
			case CorePackage.IFML_PARAMETER__NAME:
				unsetName();
				return;
			case CorePackage.IFML_PARAMETER__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case CorePackage.IFML_PARAMETER__VISIBILITY:
				unsetVisibility();
				return;
			case CorePackage.IFML_PARAMETER__TYPE:
				setType((Type)null);
				return;
			case CorePackage.IFML_PARAMETER__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case CorePackage.IFML_PARAMETER__DEFAULT_VALUE:
				setDefaultValue((Expression)null);
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
			case CorePackage.IFML_PARAMETER__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case CorePackage.IFML_PARAMETER__OWNED_COMMENT:
				return ownedComments != null && !ownedComments.isEmpty();
			case CorePackage.IFML_PARAMETER__OWNED_ELEMENT:
				return !getOwnedElements().isEmpty();
			case CorePackage.IFML_PARAMETER__OWNER:
				return basicGetOwner() != null;
			case CorePackage.IFML_PARAMETER__CLIENT_DEPENDENCY:
				return clientDependencies != null && !clientDependencies.isEmpty();
			case CorePackage.IFML_PARAMETER__NAME:
				return isSetName();
			case CorePackage.IFML_PARAMETER__NAME_EXPRESSION:
				return nameExpression != null;
			case CorePackage.IFML_PARAMETER__NAMESPACE:
				return basicGetNamespace() != null;
			case CorePackage.IFML_PARAMETER__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case CorePackage.IFML_PARAMETER__VISIBILITY:
				return isSetVisibility();
			case CorePackage.IFML_PARAMETER__TYPE:
				return type != null;
			case CorePackage.IFML_PARAMETER__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case CorePackage.IFML_PARAMETER__DEFAULT_VALUE:
				return defaultValue != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EModelElement.class) {
			switch (derivedFeatureID) {
				case CorePackage.IFML_PARAMETER__EANNOTATIONS: return EcorePackage.EMODEL_ELEMENT__EANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == Element.class) {
			switch (derivedFeatureID) {
				case CorePackage.IFML_PARAMETER__OWNED_COMMENT: return UMLPackage.ELEMENT__OWNED_COMMENT;
				case CorePackage.IFML_PARAMETER__OWNED_ELEMENT: return UMLPackage.ELEMENT__OWNED_ELEMENT;
				case CorePackage.IFML_PARAMETER__OWNER: return UMLPackage.ELEMENT__OWNER;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case CorePackage.IFML_PARAMETER__CLIENT_DEPENDENCY: return UMLPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY;
				case CorePackage.IFML_PARAMETER__NAME: return UMLPackage.NAMED_ELEMENT__NAME;
				case CorePackage.IFML_PARAMETER__NAME_EXPRESSION: return UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION;
				case CorePackage.IFML_PARAMETER__NAMESPACE: return UMLPackage.NAMED_ELEMENT__NAMESPACE;
				case CorePackage.IFML_PARAMETER__QUALIFIED_NAME: return UMLPackage.NAMED_ELEMENT__QUALIFIED_NAME;
				case CorePackage.IFML_PARAMETER__VISIBILITY: return UMLPackage.NAMED_ELEMENT__VISIBILITY;
				default: return -1;
			}
		}
		if (baseClass == IFMLNamedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case CorePackage.IFML_PARAMETER__TYPE: return UMLPackage.TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EModelElement.class) {
			switch (baseFeatureID) {
				case EcorePackage.EMODEL_ELEMENT__EANNOTATIONS: return CorePackage.IFML_PARAMETER__EANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == Element.class) {
			switch (baseFeatureID) {
				case UMLPackage.ELEMENT__OWNED_COMMENT: return CorePackage.IFML_PARAMETER__OWNED_COMMENT;
				case UMLPackage.ELEMENT__OWNED_ELEMENT: return CorePackage.IFML_PARAMETER__OWNED_ELEMENT;
				case UMLPackage.ELEMENT__OWNER: return CorePackage.IFML_PARAMETER__OWNER;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY: return CorePackage.IFML_PARAMETER__CLIENT_DEPENDENCY;
				case UMLPackage.NAMED_ELEMENT__NAME: return CorePackage.IFML_PARAMETER__NAME;
				case UMLPackage.NAMED_ELEMENT__NAME_EXPRESSION: return CorePackage.IFML_PARAMETER__NAME_EXPRESSION;
				case UMLPackage.NAMED_ELEMENT__NAMESPACE: return CorePackage.IFML_PARAMETER__NAMESPACE;
				case UMLPackage.NAMED_ELEMENT__QUALIFIED_NAME: return CorePackage.IFML_PARAMETER__QUALIFIED_NAME;
				case UMLPackage.NAMED_ELEMENT__VISIBILITY: return CorePackage.IFML_PARAMETER__VISIBILITY;
				default: return -1;
			}
		}
		if (baseClass == IFMLNamedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.TYPED_ELEMENT__TYPE: return CorePackage.IFML_PARAMETER__TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == EModelElement.class) {
			switch (baseOperationID) {
				case EcorePackage.EMODEL_ELEMENT___GET_EANNOTATION__STRING: return CorePackage.IFML_PARAMETER___GET_EANNOTATION__STRING;
				default: return -1;
			}
		}
		if (baseClass == Element.class) {
			switch (baseOperationID) {
				case UMLPackage.ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP: return CorePackage.IFML_PARAMETER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP: return CorePackage.IFML_PARAMETER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.ELEMENT___ADD_KEYWORD__STRING: return CorePackage.IFML_PARAMETER___ADD_KEYWORD__STRING;
				case UMLPackage.ELEMENT___APPLY_STEREOTYPE__STEREOTYPE: return CorePackage.IFML_PARAMETER___APPLY_STEREOTYPE__STEREOTYPE;
				case UMLPackage.ELEMENT___CREATE_EANNOTATION__STRING: return CorePackage.IFML_PARAMETER___CREATE_EANNOTATION__STRING;
				case UMLPackage.ELEMENT___DESTROY: return CorePackage.IFML_PARAMETER___DESTROY;
				case UMLPackage.ELEMENT___GET_KEYWORDS: return CorePackage.IFML_PARAMETER___GET_KEYWORDS;
				case UMLPackage.ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING: return CorePackage.IFML_PARAMETER___GET_APPLICABLE_STEREOTYPE__STRING;
				case UMLPackage.ELEMENT___GET_APPLICABLE_STEREOTYPES: return CorePackage.IFML_PARAMETER___GET_APPLICABLE_STEREOTYPES;
				case UMLPackage.ELEMENT___GET_APPLIED_STEREOTYPE__STRING: return CorePackage.IFML_PARAMETER___GET_APPLIED_STEREOTYPE__STRING;
				case UMLPackage.ELEMENT___GET_APPLIED_STEREOTYPES: return CorePackage.IFML_PARAMETER___GET_APPLIED_STEREOTYPES;
				case UMLPackage.ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING: return CorePackage.IFML_PARAMETER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;
				case UMLPackage.ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE: return CorePackage.IFML_PARAMETER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;
				case UMLPackage.ELEMENT___GET_MODEL: return CorePackage.IFML_PARAMETER___GET_MODEL;
				case UMLPackage.ELEMENT___GET_NEAREST_PACKAGE: return CorePackage.IFML_PARAMETER___GET_NEAREST_PACKAGE;
				case UMLPackage.ELEMENT___GET_RELATIONSHIPS: return CorePackage.IFML_PARAMETER___GET_RELATIONSHIPS;
				case UMLPackage.ELEMENT___GET_RELATIONSHIPS__ECLASS: return CorePackage.IFML_PARAMETER___GET_RELATIONSHIPS__ECLASS;
				case UMLPackage.ELEMENT___GET_REQUIRED_STEREOTYPE__STRING: return CorePackage.IFML_PARAMETER___GET_REQUIRED_STEREOTYPE__STRING;
				case UMLPackage.ELEMENT___GET_REQUIRED_STEREOTYPES: return CorePackage.IFML_PARAMETER___GET_REQUIRED_STEREOTYPES;
				case UMLPackage.ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS: return CorePackage.IFML_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS;
				case UMLPackage.ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS: return CorePackage.IFML_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;
				case UMLPackage.ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE: return CorePackage.IFML_PARAMETER___GET_STEREOTYPE_APPLICATION__STEREOTYPE;
				case UMLPackage.ELEMENT___GET_STEREOTYPE_APPLICATIONS: return CorePackage.IFML_PARAMETER___GET_STEREOTYPE_APPLICATIONS;
				case UMLPackage.ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS: return CorePackage.IFML_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS;
				case UMLPackage.ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS: return CorePackage.IFML_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;
				case UMLPackage.ELEMENT___GET_VALUE__STEREOTYPE_STRING: return CorePackage.IFML_PARAMETER___GET_VALUE__STEREOTYPE_STRING;
				case UMLPackage.ELEMENT___HAS_KEYWORD__STRING: return CorePackage.IFML_PARAMETER___HAS_KEYWORD__STRING;
				case UMLPackage.ELEMENT___HAS_VALUE__STEREOTYPE_STRING: return CorePackage.IFML_PARAMETER___HAS_VALUE__STEREOTYPE_STRING;
				case UMLPackage.ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE: return CorePackage.IFML_PARAMETER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;
				case UMLPackage.ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE: return CorePackage.IFML_PARAMETER___IS_STEREOTYPE_APPLIED__STEREOTYPE;
				case UMLPackage.ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE: return CorePackage.IFML_PARAMETER___IS_STEREOTYPE_REQUIRED__STEREOTYPE;
				case UMLPackage.ELEMENT___REMOVE_KEYWORD__STRING: return CorePackage.IFML_PARAMETER___REMOVE_KEYWORD__STRING;
				case UMLPackage.ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT: return CorePackage.IFML_PARAMETER___SET_VALUE__STEREOTYPE_STRING_OBJECT;
				case UMLPackage.ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE: return CorePackage.IFML_PARAMETER___UNAPPLY_STEREOTYPE__STEREOTYPE;
				case UMLPackage.ELEMENT___ALL_OWNED_ELEMENTS: return CorePackage.IFML_PARAMETER___ALL_OWNED_ELEMENTS;
				case UMLPackage.ELEMENT___MUST_BE_OWNED: return CorePackage.IFML_PARAMETER___MUST_BE_OWNED;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseOperationID) {
				case UMLPackage.NAMED_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP: return CorePackage.IFML_PARAMETER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.NAMED_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP: return CorePackage.IFML_PARAMETER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.NAMED_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP: return CorePackage.IFML_PARAMETER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.NAMED_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT: return CorePackage.IFML_PARAMETER___CREATE_DEPENDENCY__NAMEDELEMENT;
				case UMLPackage.NAMED_ELEMENT___CREATE_USAGE__NAMEDELEMENT: return CorePackage.IFML_PARAMETER___CREATE_USAGE__NAMEDELEMENT;
				case UMLPackage.NAMED_ELEMENT___GET_LABEL: return CorePackage.IFML_PARAMETER___GET_LABEL;
				case UMLPackage.NAMED_ELEMENT___GET_LABEL__BOOLEAN: return CorePackage.IFML_PARAMETER___GET_LABEL__BOOLEAN;
				case UMLPackage.NAMED_ELEMENT___ALL_NAMESPACES: return CorePackage.IFML_PARAMETER___ALL_NAMESPACES;
				case UMLPackage.NAMED_ELEMENT___ALL_OWNING_PACKAGES: return CorePackage.IFML_PARAMETER___ALL_OWNING_PACKAGES;
				case UMLPackage.NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE: return CorePackage.IFML_PARAMETER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;
				case UMLPackage.NAMED_ELEMENT___GET_NAMESPACE: return CorePackage.IFML_PARAMETER___GET_NAMESPACE;
				case UMLPackage.NAMED_ELEMENT___GET_QUALIFIED_NAME: return CorePackage.IFML_PARAMETER___GET_QUALIFIED_NAME;
				case UMLPackage.NAMED_ELEMENT___SEPARATOR: return CorePackage.IFML_PARAMETER___SEPARATOR;
				default: return -1;
			}
		}
		if (baseClass == IFMLNamedElement.class) {
			switch (baseOperationID) {
				case CorePackage.IFML_NAMED_ELEMENT___GET_CLIENT_DEPENDENCY__STRING: return CorePackage.IFML_PARAMETER___GET_CLIENT_DEPENDENCY__STRING;
				case CorePackage.IFML_NAMED_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS: return CorePackage.IFML_PARAMETER___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS;
				case CorePackage.IFML_NAMED_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE: return CorePackage.IFML_PARAMETER___CREATE_NAME_EXPRESSION__STRING_TYPE;
				case CorePackage.IFML_NAMED_ELEMENT___CREATE_OWNED_COMMENT: return CorePackage.IFML_PARAMETER___CREATE_OWNED_COMMENT;
				case CorePackage.IFML_NAMED_ELEMENT___CREATE__ECLASS: return CorePackage.IFML_PARAMETER___CREATE__ECLASS;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CorePackage.IFML_PARAMETER___GET_CLIENT_DEPENDENCY__STRING:
				return getClientDependency((String)arguments.get(0));
			case CorePackage.IFML_PARAMETER___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS:
				return getClientDependency((String)arguments.get(0), (Boolean)arguments.get(1), (EClass)arguments.get(2));
			case CorePackage.IFML_PARAMETER___CREATE_NAME_EXPRESSION__STRING_TYPE:
				return createNameExpression((String)arguments.get(0), (Type)arguments.get(1));
			case CorePackage.IFML_PARAMETER___CREATE_OWNED_COMMENT:
				return createOwnedComment();
			case CorePackage.IFML_PARAMETER___CREATE__ECLASS:
				return create((EClass)arguments.get(0));
			case CorePackage.IFML_PARAMETER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
				return validateHasQualifiedName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case CorePackage.IFML_PARAMETER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
				return validateHasNoQualifiedName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case CorePackage.IFML_PARAMETER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP:
				return validateVisibilityNeedsOwnership((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case CorePackage.IFML_PARAMETER___CREATE_DEPENDENCY__NAMEDELEMENT:
				return createDependency((NamedElement)arguments.get(0));
			case CorePackage.IFML_PARAMETER___CREATE_USAGE__NAMEDELEMENT:
				return createUsage((NamedElement)arguments.get(0));
			case CorePackage.IFML_PARAMETER___GET_LABEL:
				return getLabel();
			case CorePackage.IFML_PARAMETER___GET_LABEL__BOOLEAN:
				return getLabel((Boolean)arguments.get(0));
			case CorePackage.IFML_PARAMETER___ALL_NAMESPACES:
				return allNamespaces();
			case CorePackage.IFML_PARAMETER___ALL_OWNING_PACKAGES:
				return allOwningPackages();
			case CorePackage.IFML_PARAMETER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE:
				return isDistinguishableFrom((NamedElement)arguments.get(0), (Namespace)arguments.get(1));
			case CorePackage.IFML_PARAMETER___SEPARATOR:
				return separator();
			case CorePackage.IFML_PARAMETER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP:
				return validateHasOwner((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case CorePackage.IFML_PARAMETER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP:
				return validateNotOwnSelf((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case CorePackage.IFML_PARAMETER___ADD_KEYWORD__STRING:
				return addKeyword((String)arguments.get(0));
			case CorePackage.IFML_PARAMETER___APPLY_STEREOTYPE__STEREOTYPE:
				return applyStereotype((Stereotype)arguments.get(0));
			case CorePackage.IFML_PARAMETER___CREATE_EANNOTATION__STRING:
				return createEAnnotation((String)arguments.get(0));
			case CorePackage.IFML_PARAMETER___DESTROY:
				destroy();
				return null;
			case CorePackage.IFML_PARAMETER___GET_KEYWORDS:
				return getKeywords();
			case CorePackage.IFML_PARAMETER___GET_APPLICABLE_STEREOTYPE__STRING:
				return getApplicableStereotype((String)arguments.get(0));
			case CorePackage.IFML_PARAMETER___GET_APPLICABLE_STEREOTYPES:
				return getApplicableStereotypes();
			case CorePackage.IFML_PARAMETER___GET_APPLIED_STEREOTYPE__STRING:
				return getAppliedStereotype((String)arguments.get(0));
			case CorePackage.IFML_PARAMETER___GET_APPLIED_STEREOTYPES:
				return getAppliedStereotypes();
			case CorePackage.IFML_PARAMETER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING:
				return getAppliedSubstereotype((Stereotype)arguments.get(0), (String)arguments.get(1));
			case CorePackage.IFML_PARAMETER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE:
				return getAppliedSubstereotypes((Stereotype)arguments.get(0));
			case CorePackage.IFML_PARAMETER___GET_MODEL:
				return getModel();
			case CorePackage.IFML_PARAMETER___GET_NEAREST_PACKAGE:
				return getNearestPackage();
			case CorePackage.IFML_PARAMETER___GET_RELATIONSHIPS:
				return getRelationships();
			case CorePackage.IFML_PARAMETER___GET_RELATIONSHIPS__ECLASS:
				return getRelationships((EClass)arguments.get(0));
			case CorePackage.IFML_PARAMETER___GET_REQUIRED_STEREOTYPE__STRING:
				return getRequiredStereotype((String)arguments.get(0));
			case CorePackage.IFML_PARAMETER___GET_REQUIRED_STEREOTYPES:
				return getRequiredStereotypes();
			case CorePackage.IFML_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS:
				return getSourceDirectedRelationships();
			case CorePackage.IFML_PARAMETER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS:
				return getSourceDirectedRelationships((EClass)arguments.get(0));
			case CorePackage.IFML_PARAMETER___GET_STEREOTYPE_APPLICATION__STEREOTYPE:
				return getStereotypeApplication((Stereotype)arguments.get(0));
			case CorePackage.IFML_PARAMETER___GET_STEREOTYPE_APPLICATIONS:
				return getStereotypeApplications();
			case CorePackage.IFML_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS:
				return getTargetDirectedRelationships();
			case CorePackage.IFML_PARAMETER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS:
				return getTargetDirectedRelationships((EClass)arguments.get(0));
			case CorePackage.IFML_PARAMETER___GET_VALUE__STEREOTYPE_STRING:
				return getValue((Stereotype)arguments.get(0), (String)arguments.get(1));
			case CorePackage.IFML_PARAMETER___HAS_KEYWORD__STRING:
				return hasKeyword((String)arguments.get(0));
			case CorePackage.IFML_PARAMETER___HAS_VALUE__STEREOTYPE_STRING:
				return hasValue((Stereotype)arguments.get(0), (String)arguments.get(1));
			case CorePackage.IFML_PARAMETER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE:
				return isStereotypeApplicable((Stereotype)arguments.get(0));
			case CorePackage.IFML_PARAMETER___IS_STEREOTYPE_APPLIED__STEREOTYPE:
				return isStereotypeApplied((Stereotype)arguments.get(0));
			case CorePackage.IFML_PARAMETER___IS_STEREOTYPE_REQUIRED__STEREOTYPE:
				return isStereotypeRequired((Stereotype)arguments.get(0));
			case CorePackage.IFML_PARAMETER___REMOVE_KEYWORD__STRING:
				return removeKeyword((String)arguments.get(0));
			case CorePackage.IFML_PARAMETER___SET_VALUE__STEREOTYPE_STRING_OBJECT:
				setValue((Stereotype)arguments.get(0), (String)arguments.get(1), arguments.get(2));
				return null;
			case CorePackage.IFML_PARAMETER___UNAPPLY_STEREOTYPE__STEREOTYPE:
				return unapplyStereotype((Stereotype)arguments.get(0));
			case CorePackage.IFML_PARAMETER___ALL_OWNED_ELEMENTS:
				return allOwnedElements();
			case CorePackage.IFML_PARAMETER___MUST_BE_OWNED:
				return mustBeOwned();
			case CorePackage.IFML_PARAMETER___GET_EANNOTATION__STRING:
				return getEAnnotation((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", visibility: ");
		if (visibilityESet) result.append(visibility); else result.append("<unset>");
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //IFMLParameterImpl
