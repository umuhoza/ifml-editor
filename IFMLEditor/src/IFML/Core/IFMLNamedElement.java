/**
 */
package IFML.Core;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFML Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see IFML.Core.CorePackage#getIFMLNamedElement()
 * @model
 * @generated
 */
public interface IFMLNamedElement extends NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return getClientDependency(name, false, null);'"
	 * @generated
	 */
	Dependency getClientDependency(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='clientDependencyLoop : for (Dependency clientDependency : getClientDependencies()) {\r\n\tif (eClass != null && !eClass.isInstance(clientDependency))\r\n\t\tcontinue clientDependencyLoop;\r\n\tif (name != null && !(ignoreCase\r\n\t\t? name.equalsIgnoreCase(clientDependency.getName())\r\n\t\t: name.equals(clientDependency.getName())))\r\n\t\tcontinue clientDependencyLoop;\r\n\treturn clientDependency;\r\n}\r\nreturn null;'"
	 * @generated
	 */
	Dependency getClientDependency(String name, boolean ignoreCase, EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='StringExpression newNameExpression = (StringExpression) create(UMLPackage.Literals.STRING_EXPRESSION);\r\nsetNameExpression(newNameExpression);\r\nif (name != null)\r\n\tnewNameExpression.setName(name);\r\nif (type != null)\r\n\tnewNameExpression.setType(type);\r\nreturn newNameExpression;'"
	 * @generated
	 */
	StringExpression createNameExpression(String name, Type type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='Comment newOwnedComment = (Comment) create(UMLPackage.Literals.COMMENT);\r\n\tgetOwnedComments().add(newOwnedComment);\r\nreturn newOwnedComment;'"
	 * @generated
	 */
	Comment createOwnedComment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return EcoreUtil.create(eClass);'"
	 * @generated
	 */
	EObject create(EClass eClass);

} // IFMLNamedElement
