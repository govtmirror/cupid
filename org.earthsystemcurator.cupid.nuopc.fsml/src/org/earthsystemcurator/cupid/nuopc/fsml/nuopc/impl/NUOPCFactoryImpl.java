/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NUOPCFactoryImpl extends EFactoryImpl implements NUOPCFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NUOPCFactory init() {
		try {
			NUOPCFactory theNUOPCFactory = (NUOPCFactory)EPackage.Registry.INSTANCE.getEFactory(NUOPCPackage.eNS_URI);
			if (theNUOPCFactory != null) {
				return theNUOPCFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NUOPCFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NUOPCPackage.NUOPC_MODEL: return createNUOPCModel();
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES: return createModelImplementsSetServices();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P1: return createModelImplementsInitP1();
			case NUOPCPackage.MODEL_IMPLEMENTS_INIT_P2: return createModelImplementsInitP2();
			case NUOPCPackage.ADVERTISES_IMPORT_FIELD: return createAdvertisesImportField();
			case NUOPCPackage.ADVERTISES_EXPORT_FIELD: return createAdvertisesExportField();
			case NUOPCPackage.REALIZES_IMPORT_FIELD: return createRealizesImportField();
			case NUOPCPackage.REALIZES_EXPORT_FIELD: return createRealizesExportField();
			case NUOPCPackage.ATTACHES_MODEL_ADVANCE: return createAttachesModelAdvance();
			case NUOPCPackage.MODEL_ADVANCE: return createModelAdvance();
			case NUOPCPackage.NUOPC_DRIVER: return createNUOPCDriver();
			case NUOPCPackage.NUOPC_APPLICATION: return createNUOPCApplication();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel createNUOPCModel() {
		NUOPCModelImpl nuopcModel = new NUOPCModelImpl();
		return nuopcModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelImplementsSetServices createModelImplementsSetServices() {
		ModelImplementsSetServicesImpl modelImplementsSetServices = new ModelImplementsSetServicesImpl();
		return modelImplementsSetServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelImplementsInitP1 createModelImplementsInitP1() {
		ModelImplementsInitP1Impl modelImplementsInitP1 = new ModelImplementsInitP1Impl();
		return modelImplementsInitP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelImplementsInitP2 createModelImplementsInitP2() {
		ModelImplementsInitP2Impl modelImplementsInitP2 = new ModelImplementsInitP2Impl();
		return modelImplementsInitP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvertisesImportField createAdvertisesImportField() {
		AdvertisesImportFieldImpl advertisesImportField = new AdvertisesImportFieldImpl();
		return advertisesImportField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvertisesExportField createAdvertisesExportField() {
		AdvertisesExportFieldImpl advertisesExportField = new AdvertisesExportFieldImpl();
		return advertisesExportField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealizesImportField createRealizesImportField() {
		RealizesImportFieldImpl realizesImportField = new RealizesImportFieldImpl();
		return realizesImportField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealizesExportField createRealizesExportField() {
		RealizesExportFieldImpl realizesExportField = new RealizesExportFieldImpl();
		return realizesExportField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachesModelAdvance createAttachesModelAdvance() {
		AttachesModelAdvanceImpl attachesModelAdvance = new AttachesModelAdvanceImpl();
		return attachesModelAdvance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdvance createModelAdvance() {
		ModelAdvanceImpl modelAdvance = new ModelAdvanceImpl();
		return modelAdvance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriver createNUOPCDriver() {
		NUOPCDriverImpl nuopcDriver = new NUOPCDriverImpl();
		return nuopcDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCApplication createNUOPCApplication() {
		NUOPCApplicationImpl nuopcApplication = new NUOPCApplicationImpl();
		return nuopcApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCPackage getNUOPCPackage() {
		return (NUOPCPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NUOPCPackage getPackage() {
		return NUOPCPackage.eINSTANCE;
	}

} //NUOPCFactoryImpl
