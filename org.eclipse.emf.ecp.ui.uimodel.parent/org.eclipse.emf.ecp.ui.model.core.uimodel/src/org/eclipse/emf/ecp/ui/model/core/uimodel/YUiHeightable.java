/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ui.model.core.uimodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YUi Heightable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiHeightable#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiHeightable#getHeightUnit <em>Height Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage#getYUiHeightable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface YUiHeightable extends EObject {
	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage#getYUiHeightable_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiHeightable#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Height Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height Unit</em>' attribute.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiUnit
	 * @see #setHeightUnit(YUiUnit)
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage#getYUiHeightable_HeightUnit()
	 * @model
	 * @generated
	 */
	YUiUnit getHeightUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.ecp.ui.model.core.uimodel.YUiHeightable#getHeightUnit <em>Height Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height Unit</em>' attribute.
	 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YUiUnit
	 * @see #getHeightUnit()
	 * @generated
	 */
	void setHeightUnit(YUiUnit value);

} // YUiHeightable