/**
 */
package IFML.Core.impl;

import IFML.Core.CorePackage;
import IFML.Core.IFMLNamedElement;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IFML Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IFMLNamedElementImpl extends NamedElementImpl implements IFMLNamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IFMLNamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IFML_NAMED_ELEMENT;
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
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CorePackage.IFML_NAMED_ELEMENT___GET_CLIENT_DEPENDENCY__STRING:
				return getClientDependency((String)arguments.get(0));
			case CorePackage.IFML_NAMED_ELEMENT___GET_CLIENT_DEPENDENCY__STRING_BOOLEAN_ECLASS:
				return getClientDependency((String)arguments.get(0), (Boolean)arguments.get(1), (EClass)arguments.get(2));
			case CorePackage.IFML_NAMED_ELEMENT___CREATE_NAME_EXPRESSION__STRING_TYPE:
				return createNameExpression((String)arguments.get(0), (Type)arguments.get(1));
			case CorePackage.IFML_NAMED_ELEMENT___CREATE_OWNED_COMMENT:
				return createOwnedComment();
			case CorePackage.IFML_NAMED_ELEMENT___CREATE__ECLASS:
				return create((EClass)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //IFMLNamedElementImpl
