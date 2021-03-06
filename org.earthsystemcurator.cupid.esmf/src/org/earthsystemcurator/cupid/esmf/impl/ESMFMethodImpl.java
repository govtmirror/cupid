/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.esmf.ESMFAction;
import org.earthsystemcurator.cupid.esmf.ESMFClock;
import org.earthsystemcurator.cupid.esmf.ESMFComponent;
import org.earthsystemcurator.cupid.esmf.ESMFMethod;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFState;

import org.earthsystemcurator.cupid.sidl.Method;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFMethodImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFMethodImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFMethodImpl#getImportState <em>Import State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFMethodImpl#getExportState <em>Export State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFMethodImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFMethodImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFMethodImpl#getSIDLMethod <em>SIDL Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFMethodImpl extends ESMFNamedEntityImpl implements ESMFMethod {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected ESMFComponent component;

	/**
	 * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected static final int PHASE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected int phase = PHASE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImportState() <em>Import State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportState()
	 * @generated
	 * @ordered
	 */
	protected ESMFState importState;

	/**
	 * The cached value of the '{@link #getExportState() <em>Export State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportState()
	 * @generated
	 * @ordered
	 */
	protected ESMFState exportState;

	/**
	 * The cached value of the '{@link #getClock() <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected ESMFClock clock;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFAction> action;

	/**
	 * The cached value of the '{@link #getSIDLMethod() <em>SIDL Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIDLMethod()
	 * @generated
	 * @ordered
	 */
	protected Method sidlMethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFComponent getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (ESMFComponent)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_METHOD__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFComponent basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(ESMFComponent newComponent) {
		ESMFComponent oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_METHOD__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(int newPhase) {
		int oldPhase = phase;
		phase = newPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_METHOD__PHASE, oldPhase, phase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFState getImportState() {
		if (importState != null && importState.eIsProxy()) {
			InternalEObject oldImportState = (InternalEObject)importState;
			importState = (ESMFState)eResolveProxy(oldImportState);
			if (importState != oldImportState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_METHOD__IMPORT_STATE, oldImportState, importState));
			}
		}
		return importState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFState basicGetImportState() {
		return importState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportState(ESMFState newImportState) {
		ESMFState oldImportState = importState;
		importState = newImportState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_METHOD__IMPORT_STATE, oldImportState, importState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFState getExportState() {
		if (exportState != null && exportState.eIsProxy()) {
			InternalEObject oldExportState = (InternalEObject)exportState;
			exportState = (ESMFState)eResolveProxy(oldExportState);
			if (exportState != oldExportState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_METHOD__EXPORT_STATE, oldExportState, exportState));
			}
		}
		return exportState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFState basicGetExportState() {
		return exportState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExportState(ESMFState newExportState) {
		ESMFState oldExportState = exportState;
		exportState = newExportState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_METHOD__EXPORT_STATE, oldExportState, exportState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFClock getClock() {
		if (clock != null && clock.eIsProxy()) {
			InternalEObject oldClock = (InternalEObject)clock;
			clock = (ESMFClock)eResolveProxy(oldClock);
			if (clock != oldClock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_METHOD__CLOCK, oldClock, clock));
			}
		}
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFClock basicGetClock() {
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClock(ESMFClock newClock) {
		ESMFClock oldClock = clock;
		clock = newClock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_METHOD__CLOCK, oldClock, clock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFAction> getAction() {
		if (action == null) {
			action = new EObjectContainmentWithInverseEList<ESMFAction>(ESMFAction.class, this, ESMFPackage.ESMF_METHOD__ACTION, ESMFPackage.ESMF_ACTION__CONTEXT);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getSIDLMethod() {
		if (sidlMethod != null && sidlMethod.eIsProxy()) {
			InternalEObject oldSIDLMethod = (InternalEObject)sidlMethod;
			sidlMethod = (Method)eResolveProxy(oldSIDLMethod);
			if (sidlMethod != oldSIDLMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_METHOD__SIDL_METHOD, oldSIDLMethod, sidlMethod));
			}
		}
		return sidlMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetSIDLMethod() {
		return sidlMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSIDLMethod(Method newSIDLMethod) {
		Method oldSIDLMethod = sidlMethod;
		sidlMethod = newSIDLMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_METHOD__SIDL_METHOD, oldSIDLMethod, sidlMethod));
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
			case ESMFPackage.ESMF_METHOD__ACTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAction()).basicAdd(otherEnd, msgs);
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
			case ESMFPackage.ESMF_METHOD__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
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
			case ESMFPackage.ESMF_METHOD__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
			case ESMFPackage.ESMF_METHOD__PHASE:
				return getPhase();
			case ESMFPackage.ESMF_METHOD__IMPORT_STATE:
				if (resolve) return getImportState();
				return basicGetImportState();
			case ESMFPackage.ESMF_METHOD__EXPORT_STATE:
				if (resolve) return getExportState();
				return basicGetExportState();
			case ESMFPackage.ESMF_METHOD__CLOCK:
				if (resolve) return getClock();
				return basicGetClock();
			case ESMFPackage.ESMF_METHOD__ACTION:
				return getAction();
			case ESMFPackage.ESMF_METHOD__SIDL_METHOD:
				if (resolve) return getSIDLMethod();
				return basicGetSIDLMethod();
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
			case ESMFPackage.ESMF_METHOD__COMPONENT:
				setComponent((ESMFComponent)newValue);
				return;
			case ESMFPackage.ESMF_METHOD__PHASE:
				setPhase((Integer)newValue);
				return;
			case ESMFPackage.ESMF_METHOD__IMPORT_STATE:
				setImportState((ESMFState)newValue);
				return;
			case ESMFPackage.ESMF_METHOD__EXPORT_STATE:
				setExportState((ESMFState)newValue);
				return;
			case ESMFPackage.ESMF_METHOD__CLOCK:
				setClock((ESMFClock)newValue);
				return;
			case ESMFPackage.ESMF_METHOD__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends ESMFAction>)newValue);
				return;
			case ESMFPackage.ESMF_METHOD__SIDL_METHOD:
				setSIDLMethod((Method)newValue);
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
			case ESMFPackage.ESMF_METHOD__COMPONENT:
				setComponent((ESMFComponent)null);
				return;
			case ESMFPackage.ESMF_METHOD__PHASE:
				setPhase(PHASE_EDEFAULT);
				return;
			case ESMFPackage.ESMF_METHOD__IMPORT_STATE:
				setImportState((ESMFState)null);
				return;
			case ESMFPackage.ESMF_METHOD__EXPORT_STATE:
				setExportState((ESMFState)null);
				return;
			case ESMFPackage.ESMF_METHOD__CLOCK:
				setClock((ESMFClock)null);
				return;
			case ESMFPackage.ESMF_METHOD__ACTION:
				getAction().clear();
				return;
			case ESMFPackage.ESMF_METHOD__SIDL_METHOD:
				setSIDLMethod((Method)null);
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
			case ESMFPackage.ESMF_METHOD__COMPONENT:
				return component != null;
			case ESMFPackage.ESMF_METHOD__PHASE:
				return phase != PHASE_EDEFAULT;
			case ESMFPackage.ESMF_METHOD__IMPORT_STATE:
				return importState != null;
			case ESMFPackage.ESMF_METHOD__EXPORT_STATE:
				return exportState != null;
			case ESMFPackage.ESMF_METHOD__CLOCK:
				return clock != null;
			case ESMFPackage.ESMF_METHOD__ACTION:
				return action != null && !action.isEmpty();
			case ESMFPackage.ESMF_METHOD__SIDL_METHOD:
				return sidlMethod != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (phase: ");
		result.append(phase);
		result.append(')');
		return result.toString();
	}

} //ESMFMethodImpl
