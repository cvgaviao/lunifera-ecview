/**
 */
package org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiEmbeddable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiMarginable;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiSpacingable;

import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.UimodelExtensionPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiGridLayoutCellStyle;
import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiHorizontalLayout;

import org.eclipse.emf.ecp.ui.model.core.uimodel.extension.YUiHorizontalLayoutCellStyle;
import org.eclipse.emf.ecp.ui.model.core.uimodel.impl.YUiLayoutImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>YUi Horizontal Layout</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiHorizontalLayoutImpl#isSpacing <em>Spacing</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiHorizontalLayoutImpl#isMargin <em>Margin</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiHorizontalLayoutImpl#getCellStyles <em>Cell Styles</em>}</li>
 *   <li>{@link org.eclipse.emf.ecp.ui.model.core.uimodel.extension.impl.YUiHorizontalLayoutImpl#isFillHorizontal <em>Fill Horizontal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YUiHorizontalLayoutImpl extends YUiLayoutImpl implements
		YUiHorizontalLayout {
	/**
	 * The default value of the '{@link #isSpacing() <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SPACING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSpacing() <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSpacing()
	 * @generated
	 * @ordered
	 */
	protected boolean spacing = SPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #isMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMargin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MARGIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMargin()
	 * @generated
	 * @ordered
	 */
	protected boolean margin = MARGIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCellStyles() <em>Cell Styles</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCellStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<YUiHorizontalLayoutCellStyle> cellStyles;

	/**
	 * The default value of the '{@link #isFillHorizontal() <em>Fill Horizontal</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isFillHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILL_HORIZONTAL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFillHorizontal() <em>Fill Horizontal</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isFillHorizontal()
	 * @generated
	 * @ordered
	 */
	protected boolean fillHorizontal = FILL_HORIZONTAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected YUiHorizontalLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UimodelExtensionPackage.Literals.YUI_HORIZONTAL_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSpacing() {
		return spacing;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpacing(boolean newSpacing) {
		boolean oldSpacing = spacing;
		spacing = newSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__SPACING, oldSpacing, spacing));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMargin() {
		return margin;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMargin(boolean newMargin) {
		boolean oldMargin = margin;
		margin = newMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__MARGIN, oldMargin, margin));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YUiHorizontalLayoutCellStyle> getCellStyles() {
		if (cellStyles == null) {
			cellStyles = new EObjectContainmentEList<YUiHorizontalLayoutCellStyle>(YUiHorizontalLayoutCellStyle.class, this, UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__CELL_STYLES);
		}
		return cellStyles;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFillHorizontal() {
		return fillHorizontal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillHorizontal(boolean newFillHorizontal) {
		boolean oldFillHorizontal = fillHorizontal;
		fillHorizontal = newFillHorizontal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__FILL_HORIZONTAL, oldFillHorizontal, fillHorizontal));
	}


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public YUiHorizontalLayoutCellStyle getCellStyle(YUiEmbeddable element) {
		for (YUiHorizontalLayoutCellStyle style : getCellStyles()) {
			if (element == style.getTarget()) {
				return style;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__CELL_STYLES:
				return ((InternalEList<?>)getCellStyles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__SPACING:
				return isSpacing();
			case UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__MARGIN:
				return isMargin();
			case UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__CELL_STYLES:
				return getCellStyles();
			case UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__FILL_HORIZONTAL:
				return isFillHorizontal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__SPACING:
				setSpacing((Boolean)newValue);
				return;
			case UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__MARGIN:
				setMargin((Boolean)newValue);
				return;
			case UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__CELL_STYLES:
				getCellStyles().clear();
				getCellStyles().addAll((Collection<? extends YUiHorizontalLayoutCellStyle>)newValue);
				return;
			case UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__FILL_HORIZONTAL:
				setFillHorizontal((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__SPACING:
				setSpacing(SPACING_EDEFAULT);
				return;
			case UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__MARGIN:
				setMargin(MARGIN_EDEFAULT);
				return;
			case UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__CELL_STYLES:
				getCellStyles().clear();
				return;
			case UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__FILL_HORIZONTAL:
				setFillHorizontal(FILL_HORIZONTAL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__SPACING:
				return spacing != SPACING_EDEFAULT;
			case UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__MARGIN:
				return margin != MARGIN_EDEFAULT;
			case UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__CELL_STYLES:
				return cellStyles != null && !cellStyles.isEmpty();
			case UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__FILL_HORIZONTAL:
				return fillHorizontal != FILL_HORIZONTAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == YUiSpacingable.class) {
			switch (derivedFeatureID) {
				case UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__SPACING: return UiModelPackage.YUI_SPACINGABLE__SPACING;
				default: return -1;
			}
		}
		if (baseClass == YUiMarginable.class) {
			switch (derivedFeatureID) {
				case UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__MARGIN: return UiModelPackage.YUI_MARGINABLE__MARGIN;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == YUiSpacingable.class) {
			switch (baseFeatureID) {
				case UiModelPackage.YUI_SPACINGABLE__SPACING: return UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__SPACING;
				default: return -1;
			}
		}
		if (baseClass == YUiMarginable.class) {
			switch (baseFeatureID) {
				case UiModelPackage.YUI_MARGINABLE__MARGIN: return UimodelExtensionPackage.YUI_HORIZONTAL_LAYOUT__MARGIN;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (spacing: ");
		result.append(spacing);
		result.append(", margin: ");
		result.append(margin);
		result.append(", fillHorizontal: ");
		result.append(fillHorizontal);
		result.append(')');
		return result.toString();
	}

} // YUiHorizontalLayoutImpl