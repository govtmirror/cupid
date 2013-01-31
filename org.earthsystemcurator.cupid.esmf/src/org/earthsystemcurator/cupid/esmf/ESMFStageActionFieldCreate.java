/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage Action Field Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionFieldCreate#getField <em>Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFStageActionFieldCreate()
 * @model
 * @generated
 */
public interface ESMFStageActionFieldCreate extends ESMFStageAction {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFStageActionFieldCreate_Field()
	 * @model required="true"
	 * @generated
	 */
	EList<ESMFField> getField();

} // ESMFStageActionFieldCreate
