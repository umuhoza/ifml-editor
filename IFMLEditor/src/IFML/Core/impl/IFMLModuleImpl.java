/**
 */
package IFML.Core.impl;

import IFML.Core.CorePackage;
import IFML.Core.IFMLModule;
import IFML.Core.IFMLPort;
import IFML.Core.ModuleDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IFML Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFML.Core.impl.IFMLModuleImpl#getModuleDefinition <em>Module Definition</em>}</li>
 *   <li>{@link IFML.Core.impl.IFMLModuleImpl#getPorts <em>Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IFMLModuleImpl extends InteractionFlowElementImpl implements IFMLModule {
	/**
	 * The cached value of the '{@link #getModuleDefinition() <em>Module Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleDefinition()
	 * @generated
	 * @ordered
	 */
	protected ModuleDefinition moduleDefinition;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<IFMLPort> ports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IFMLModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IFML_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDefinition getModuleDefinition() {
		if (moduleDefinition != null && moduleDefinition.eIsProxy()) {
			InternalEObject oldModuleDefinition = (InternalEObject)moduleDefinition;
			moduleDefinition = (ModuleDefinition)eResolveProxy(oldModuleDefinition);
			if (moduleDefinition != oldModuleDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.IFML_MODULE__MODULE_DEFINITION, oldModuleDefinition, moduleDefinition));
			}
		}
		return moduleDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDefinition basicGetModuleDefinition() {
		return moduleDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleDefinition(ModuleDefinition newModuleDefinition, NotificationChain msgs) {
		ModuleDefinition oldModuleDefinition = moduleDefinition;
		moduleDefinition = newModuleDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.IFML_MODULE__MODULE_DEFINITION, oldModuleDefinition, newModuleDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleDefinition(ModuleDefinition newModuleDefinition) {
		if (newModuleDefinition != moduleDefinition) {
			NotificationChain msgs = null;
			if (moduleDefinition != null)
				msgs = ((InternalEObject)moduleDefinition).eInverseRemove(this, CorePackage.MODULE_DEFINITION__MODULES, ModuleDefinition.class, msgs);
			if (newModuleDefinition != null)
				msgs = ((InternalEObject)newModuleDefinition).eInverseAdd(this, CorePackage.MODULE_DEFINITION__MODULES, ModuleDefinition.class, msgs);
			msgs = basicSetModuleDefinition(newModuleDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IFML_MODULE__MODULE_DEFINITION, newModuleDefinition, newModuleDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IFMLPort> getPorts() {
		if (ports == null) {
			ports = new EObjectWithInverseResolvingEList<IFMLPort>(IFMLPort.class, this, CorePackage.IFML_MODULE__PORTS, CorePackage.IFML_PORT__MODULE);
		}
		return ports;
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
			case CorePackage.IFML_MODULE__MODULE_DEFINITION:
				if (moduleDefinition != null)
					msgs = ((InternalEObject)moduleDefinition).eInverseRemove(this, CorePackage.MODULE_DEFINITION__MODULES, ModuleDefinition.class, msgs);
				return basicSetModuleDefinition((ModuleDefinition)otherEnd, msgs);
			case CorePackage.IFML_MODULE__PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPorts()).basicAdd(otherEnd, msgs);
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
			case CorePackage.IFML_MODULE__MODULE_DEFINITION:
				return basicSetModuleDefinition(null, msgs);
			case CorePackage.IFML_MODULE__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
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
			case CorePackage.IFML_MODULE__MODULE_DEFINITION:
				if (resolve) return getModuleDefinition();
				return basicGetModuleDefinition();
			case CorePackage.IFML_MODULE__PORTS:
				return getPorts();
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
			case CorePackage.IFML_MODULE__MODULE_DEFINITION:
				setModuleDefinition((ModuleDefinition)newValue);
				return;
			case CorePackage.IFML_MODULE__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends IFMLPort>)newValue);
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
			case CorePackage.IFML_MODULE__MODULE_DEFINITION:
				setModuleDefinition((ModuleDefinition)null);
				return;
			case CorePackage.IFML_MODULE__PORTS:
				getPorts().clear();
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
			case CorePackage.IFML_MODULE__MODULE_DEFINITION:
				return moduleDefinition != null;
			case CorePackage.IFML_MODULE__PORTS:
				return ports != null && !ports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IFMLModuleImpl
