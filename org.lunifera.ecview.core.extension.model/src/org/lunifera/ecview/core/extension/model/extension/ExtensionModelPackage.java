/**
 */
package org.lunifera.ecview.core.extension.model.extension;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.lunifera.ecview.core.common.model.core.CoreModelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.lunifera.ecview.core.extension.model.extension.ExtensionModelFactory
 * @model kind="package"
 * @generated
 */
public interface ExtensionModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipse.org/emf/ecp/ecview/extension/view";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "extension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtensionModelPackage eINSTANCE = org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YInputImpl <em>YInput</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YInputImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYInput()
	 * @generated
	 */
	int YINPUT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__ID = CoreModelPackage.YFIELD__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__NAME = CoreModelPackage.YFIELD__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__CSS_CLASS = CoreModelPackage.YFIELD__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__CSS_ID = CoreModelPackage.YFIELD__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__INITIAL_VISIBLE = CoreModelPackage.YFIELD__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__VISIBLE = CoreModelPackage.YFIELD__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__VISIBILITY_PROCESSOR = CoreModelPackage.YFIELD__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__ORPHAN_DATATYPES = CoreModelPackage.YFIELD__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__ORPHAN_DATADESCRIPTIONS = CoreModelPackage.YFIELD__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__INITIAL_EDITABLE = CoreModelPackage.YFIELD__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__EDITABLE = CoreModelPackage.YFIELD__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__INITIAL_ENABLED = CoreModelPackage.YFIELD__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__ENABLED = CoreModelPackage.YFIELD__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__VALIDATORS = CoreModelPackage.YFIELD__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT__INTERNAL_VALIDATORS = CoreModelPackage.YFIELD__INTERNAL_VALIDATORS;

	/**
	 * The number of structural features of the '<em>YInput</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YINPUT_FEATURE_COUNT = CoreModelPackage.YFIELD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YTextFieldImpl <em>YText Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YTextFieldImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYTextField()
	 * @generated
	 */
	int YTEXT_FIELD = 15;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YGridLayoutImpl <em>YGrid Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YGridLayoutImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYGridLayout()
	 * @generated
	 */
	int YGRID_LAYOUT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__ID = CoreModelPackage.YLAYOUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__NAME = CoreModelPackage.YLAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__CSS_CLASS = CoreModelPackage.YLAYOUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__CSS_ID = CoreModelPackage.YLAYOUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__INITIAL_VISIBLE = CoreModelPackage.YLAYOUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__VISIBLE = CoreModelPackage.YLAYOUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__VISIBILITY_PROCESSOR = CoreModelPackage.YLAYOUT__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__ORPHAN_DATATYPES = CoreModelPackage.YLAYOUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__ORPHAN_DATADESCRIPTIONS = CoreModelPackage.YLAYOUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__ELEMENTS = CoreModelPackage.YLAYOUT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__SPACING = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__MARGIN = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cell Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__CELL_STYLES = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__COLUMNS = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fill Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__FILL_HORIZONTAL = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fill Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT__FILL_VERTICAL = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>YGrid Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT_FEATURE_COUNT = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YGridLayoutCellStyleImpl <em>YGrid Layout Cell Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YGridLayoutCellStyleImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYGridLayoutCellStyle()
	 * @generated
	 */
	int YGRID_LAYOUT_CELL_STYLE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT_CELL_STYLE__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT_CELL_STYLE__ALIGNMENT = 1;

	/**
	 * The feature id for the '<em><b>Span Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT_CELL_STYLE__SPAN_INFO = 2;

	/**
	 * The number of structural features of the '<em>YGrid Layout Cell Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGRID_LAYOUT_CELL_STYLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YHorizontalLayoutImpl <em>YHorizontal Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YHorizontalLayoutImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYHorizontalLayout()
	 * @generated
	 */
	int YHORIZONTAL_LAYOUT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__ID = CoreModelPackage.YLAYOUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__NAME = CoreModelPackage.YLAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__CSS_CLASS = CoreModelPackage.YLAYOUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__CSS_ID = CoreModelPackage.YLAYOUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__INITIAL_VISIBLE = CoreModelPackage.YLAYOUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__VISIBLE = CoreModelPackage.YLAYOUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__VISIBILITY_PROCESSOR = CoreModelPackage.YLAYOUT__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__ORPHAN_DATATYPES = CoreModelPackage.YLAYOUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__ORPHAN_DATADESCRIPTIONS = CoreModelPackage.YLAYOUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__ELEMENTS = CoreModelPackage.YLAYOUT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__SPACING = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__MARGIN = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cell Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__CELL_STYLES = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fill Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT__FILL_HORIZONTAL = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YHorizontal Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT_FEATURE_COUNT = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YHorizontalLayoutCellStyleImpl <em>YHorizontal Layout Cell Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YHorizontalLayoutCellStyleImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYHorizontalLayoutCellStyle()
	 * @generated
	 */
	int YHORIZONTAL_LAYOUT_CELL_STYLE = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT_CELL_STYLE__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT_CELL_STYLE__ALIGNMENT = 1;

	/**
	 * The number of structural features of the '<em>YHorizontal Layout Cell Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YHORIZONTAL_LAYOUT_CELL_STYLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YVerticalLayoutImpl <em>YVertical Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YVerticalLayoutImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYVerticalLayout()
	 * @generated
	 */
	int YVERTICAL_LAYOUT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__ID = CoreModelPackage.YLAYOUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__NAME = CoreModelPackage.YLAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__CSS_CLASS = CoreModelPackage.YLAYOUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__CSS_ID = CoreModelPackage.YLAYOUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__INITIAL_VISIBLE = CoreModelPackage.YLAYOUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__VISIBLE = CoreModelPackage.YLAYOUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__VISIBILITY_PROCESSOR = CoreModelPackage.YLAYOUT__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__ORPHAN_DATATYPES = CoreModelPackage.YLAYOUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__ORPHAN_DATADESCRIPTIONS = CoreModelPackage.YLAYOUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__ELEMENTS = CoreModelPackage.YLAYOUT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__SPACING = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__MARGIN = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cell Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__CELL_STYLES = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fill Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT__FILL_VERTICAL = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YVertical Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT_FEATURE_COUNT = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YVerticalLayoutCellStyleImpl <em>YVertical Layout Cell Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YVerticalLayoutCellStyleImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYVerticalLayoutCellStyle()
	 * @generated
	 */
	int YVERTICAL_LAYOUT_CELL_STYLE = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT_CELL_STYLE__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT_CELL_STYLE__ALIGNMENT = 1;

	/**
	 * The number of structural features of the '<em>YVertical Layout Cell Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YVERTICAL_LAYOUT_CELL_STYLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YSpanInfoImpl <em>YSpan Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YSpanInfoImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYSpanInfo()
	 * @generated
	 */
	int YSPAN_INFO = 7;

	/**
	 * The feature id for the '<em><b>Column From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSPAN_INFO__COLUMN_FROM = 0;

	/**
	 * The feature id for the '<em><b>Row From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSPAN_INFO__ROW_FROM = 1;

	/**
	 * The feature id for the '<em><b>Column To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSPAN_INFO__COLUMN_TO = 2;

	/**
	 * The feature id for the '<em><b>Row To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSPAN_INFO__ROW_TO = 3;

	/**
	 * The number of structural features of the '<em>YSpan Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YSPAN_INFO_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YTableImpl <em>YTable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YTableImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYTable()
	 * @generated
	 */
	int YTABLE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__NAME = YINPUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__VISIBILITY_PROCESSOR = YINPUT__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__ORPHAN_DATATYPES = YINPUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__ORPHAN_DATADESCRIPTIONS = YINPUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__VALIDATORS = YINPUT__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__INTERNAL_VALIDATORS = YINPUT__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Collection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__COLLECTION_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__SELECTION_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multi Selection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__MULTI_SELECTION_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__DATATYPE = YINPUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Selection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__SELECTION_TYPE = YINPUT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__SELECTION = YINPUT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Multi Selection</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__MULTI_SELECTION = YINPUT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__COLLECTION = YINPUT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__TYPE = YINPUT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Emf Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__EMF_NS_URI = YINPUT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Type Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__TYPE_QUALIFIED_NAME = YINPUT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__COLUMNS = YINPUT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Item Image Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE__ITEM_IMAGE_PROPERTY = YINPUT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>YTable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTABLE_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YColumnImpl <em>YColumn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YColumnImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYColumn()
	 * @generated
	 */
	int YCOLUMN = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOLUMN__ID = CoreModelPackage.YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOLUMN__NAME = CoreModelPackage.YELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOLUMN__ICON = CoreModelPackage.YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOLUMN__VISIBLE = CoreModelPackage.YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Orderable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOLUMN__ORDERABLE = CoreModelPackage.YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Collapsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOLUMN__COLLAPSED = CoreModelPackage.YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Collapsible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOLUMN__COLLAPSIBLE = CoreModelPackage.YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOLUMN__ALIGNMENT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Expand Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOLUMN__EXPAND_RATIO = CoreModelPackage.YELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>YColumn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOLUMN_FEATURE_COUNT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YLabelImpl <em>YLabel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YLabelImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYLabel()
	 * @generated
	 */
	int YLABEL = 13;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YTextAreaImpl <em>YText Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YTextAreaImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYTextArea()
	 * @generated
	 */
	int YTEXT_AREA = 16;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YCheckBoxImpl <em>YCheck Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YCheckBoxImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYCheckBox()
	 * @generated
	 */
	int YCHECK_BOX = 17;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YBrowserImpl <em>YBrowser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YBrowserImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYBrowser()
	 * @generated
	 */
	int YBROWSER = 18;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YDateTimeImpl <em>YDate Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YDateTimeImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYDateTime()
	 * @generated
	 */
	int YDATE_TIME = 19;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YDecimalFieldImpl <em>YDecimal Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YDecimalFieldImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYDecimalField()
	 * @generated
	 */
	int YDECIMAL_FIELD = 20;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YNumericFieldImpl <em>YNumeric Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YNumericFieldImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYNumericField()
	 * @generated
	 */
	int YNUMERIC_FIELD = 21;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YComboBoxImpl <em>YCombo Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YComboBoxImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYComboBox()
	 * @generated
	 */
	int YCOMBO_BOX = 22;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YListImpl <em>YList</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YListImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYList()
	 * @generated
	 */
	int YLIST = 12;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YButtonImpl <em>YButton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YButtonImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYButton()
	 * @generated
	 */
	int YBUTTON = 23;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YToggleButtonImpl <em>YToggle Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YToggleButtonImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYToggleButton()
	 * @generated
	 */
	int YTOGGLE_BUTTON = 24;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YTreeImpl <em>YTree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YTreeImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYTree()
	 * @generated
	 */
	int YTREE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__NAME = YINPUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__VISIBILITY_PROCESSOR = YINPUT__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__ORPHAN_DATATYPES = YINPUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__ORPHAN_DATADESCRIPTIONS = YINPUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__VALIDATORS = YINPUT__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__INTERNAL_VALIDATORS = YINPUT__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Collection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__COLLECTION_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__SELECTION_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multi Selection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__MULTI_SELECTION_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__DATATYPE = YINPUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Selection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__SELECTION_TYPE = YINPUT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__SELECTION = YINPUT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Multi Selection</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__MULTI_SELECTION = YINPUT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__COLLECTION = YINPUT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__TYPE = YINPUT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Emf Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__EMF_NS_URI = YINPUT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Type Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE__TYPE_QUALIFIED_NAME = YINPUT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>YTree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTREE_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YOptionsGroupImpl <em>YOptions Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YOptionsGroupImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYOptionsGroup()
	 * @generated
	 */
	int YOPTIONS_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__NAME = YINPUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__VISIBILITY_PROCESSOR = YINPUT__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__ORPHAN_DATATYPES = YINPUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__ORPHAN_DATADESCRIPTIONS = YINPUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__VALIDATORS = YINPUT__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__INTERNAL_VALIDATORS = YINPUT__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Collection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__COLLECTION_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__SELECTION_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multi Selection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__MULTI_SELECTION_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__DATATYPE = YINPUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Selection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__SELECTION_TYPE = YINPUT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__SELECTION = YINPUT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Multi Selection</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__MULTI_SELECTION = YINPUT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__COLLECTION = YINPUT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__TYPE = YINPUT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Emf Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__EMF_NS_URI = YINPUT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Type Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__TYPE_QUALIFIED_NAME = YINPUT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Item Caption Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__ITEM_CAPTION_PROPERTY = YINPUT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Item Image Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP__ITEM_IMAGE_PROPERTY = YINPUT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>YOptions Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOPTIONS_GROUP_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__NAME = YINPUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__VISIBILITY_PROCESSOR = YINPUT__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__ORPHAN_DATATYPES = YINPUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__ORPHAN_DATADESCRIPTIONS = YINPUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__VALIDATORS = YINPUT__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__INTERNAL_VALIDATORS = YINPUT__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Collection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__COLLECTION_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__SELECTION_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multi Selection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__MULTI_SELECTION_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__DATATYPE = YINPUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Selection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__SELECTION_TYPE = YINPUT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__SELECTION = YINPUT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Multi Selection</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__MULTI_SELECTION = YINPUT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__COLLECTION = YINPUT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__TYPE = YINPUT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Emf Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__EMF_NS_URI = YINPUT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Type Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST__TYPE_QUALIFIED_NAME = YINPUT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>YList</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLIST_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__ID = CoreModelPackage.YFIELD__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__NAME = CoreModelPackage.YFIELD__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__CSS_CLASS = CoreModelPackage.YFIELD__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__CSS_ID = CoreModelPackage.YFIELD__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__INITIAL_VISIBLE = CoreModelPackage.YFIELD__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__VISIBLE = CoreModelPackage.YFIELD__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__VISIBILITY_PROCESSOR = CoreModelPackage.YFIELD__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__ORPHAN_DATATYPES = CoreModelPackage.YFIELD__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__ORPHAN_DATADESCRIPTIONS = CoreModelPackage.YFIELD__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__INITIAL_EDITABLE = CoreModelPackage.YFIELD__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__EDITABLE = CoreModelPackage.YFIELD__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__INITIAL_ENABLED = CoreModelPackage.YFIELD__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__ENABLED = CoreModelPackage.YFIELD__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__VALIDATORS = CoreModelPackage.YFIELD__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__INTERNAL_VALIDATORS = CoreModelPackage.YFIELD__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Value Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__VALUE_BINDING_ENDPOINT = CoreModelPackage.YFIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__DATADESCRIPTION = CoreModelPackage.YFIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL__VALUE = CoreModelPackage.YFIELD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>YLabel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YLABEL_FEATURE_COUNT = CoreModelPackage.YFIELD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YImageImpl <em>YImage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YImageImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYImage()
	 * @generated
	 */
	int YIMAGE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIMAGE__ID = CoreModelPackage.YFIELD__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIMAGE__NAME = CoreModelPackage.YFIELD__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIMAGE__CSS_CLASS = CoreModelPackage.YFIELD__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIMAGE__CSS_ID = CoreModelPackage.YFIELD__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIMAGE__INITIAL_VISIBLE = CoreModelPackage.YFIELD__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIMAGE__VISIBLE = CoreModelPackage.YFIELD__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIMAGE__VISIBILITY_PROCESSOR = CoreModelPackage.YFIELD__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIMAGE__ORPHAN_DATATYPES = CoreModelPackage.YFIELD__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIMAGE__ORPHAN_DATADESCRIPTIONS = CoreModelPackage.YFIELD__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIMAGE__INITIAL_EDITABLE = CoreModelPackage.YFIELD__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIMAGE__EDITABLE = CoreModelPackage.YFIELD__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIMAGE__INITIAL_ENABLED = CoreModelPackage.YFIELD__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIMAGE__ENABLED = CoreModelPackage.YFIELD__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIMAGE__VALIDATORS = CoreModelPackage.YFIELD__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIMAGE__INTERNAL_VALIDATORS = CoreModelPackage.YFIELD__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Value Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIMAGE__VALUE_BINDING_ENDPOINT = CoreModelPackage.YFIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIMAGE__DATADESCRIPTION = CoreModelPackage.YFIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIMAGE__VALUE = CoreModelPackage.YFIELD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>YImage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIMAGE_FEATURE_COUNT = CoreModelPackage.YFIELD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__NAME = YINPUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__VISIBILITY_PROCESSOR = YINPUT__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__ORPHAN_DATATYPES = YINPUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__ORPHAN_DATADESCRIPTIONS = YINPUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__VALIDATORS = YINPUT__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__INTERNAL_VALIDATORS = YINPUT__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Value Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__VALUE_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__DATATYPE = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD__VALUE = YINPUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YText Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_FIELD_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__NAME = YINPUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__VISIBILITY_PROCESSOR = YINPUT__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__ORPHAN_DATATYPES = YINPUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__ORPHAN_DATADESCRIPTIONS = YINPUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__VALIDATORS = YINPUT__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__INTERNAL_VALIDATORS = YINPUT__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Value Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__VALUE_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__DATATYPE = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA__VALUE = YINPUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YText Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_AREA_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__NAME = YINPUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__VISIBILITY_PROCESSOR = YINPUT__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__ORPHAN_DATATYPES = YINPUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__ORPHAN_DATADESCRIPTIONS = YINPUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__VALIDATORS = YINPUT__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__INTERNAL_VALIDATORS = YINPUT__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Value Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__VALUE_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__DATATYPE = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX__VALUE = YINPUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YCheck Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCHECK_BOX_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER__NAME = YINPUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER__VISIBILITY_PROCESSOR = YINPUT__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER__ORPHAN_DATATYPES = YINPUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER__ORPHAN_DATADESCRIPTIONS = YINPUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER__VALIDATORS = YINPUT__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER__INTERNAL_VALIDATORS = YINPUT__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Value Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER__VALUE_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER__DATATYPE = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER__VALUE = YINPUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YBrowser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBROWSER_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME__NAME = YINPUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME__VISIBILITY_PROCESSOR = YINPUT__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME__ORPHAN_DATATYPES = YINPUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME__ORPHAN_DATADESCRIPTIONS = YINPUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME__VALIDATORS = YINPUT__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME__INTERNAL_VALIDATORS = YINPUT__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Value Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME__VALUE_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME__DATATYPE = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME__VALUE = YINPUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YDate Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDATE_TIME_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__NAME = YINPUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__VISIBILITY_PROCESSOR = YINPUT__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__ORPHAN_DATATYPES = YINPUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__ORPHAN_DATADESCRIPTIONS = YINPUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__VALIDATORS = YINPUT__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__INTERNAL_VALIDATORS = YINPUT__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Value Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__VALUE_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__DATATYPE = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD__VALUE = YINPUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YDecimal Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YDECIMAL_FIELD_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__NAME = YINPUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__VISIBILITY_PROCESSOR = YINPUT__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__ORPHAN_DATATYPES = YINPUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__ORPHAN_DATADESCRIPTIONS = YINPUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__VALIDATORS = YINPUT__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__INTERNAL_VALIDATORS = YINPUT__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Value Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__VALUE_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__DATATYPE = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD__VALUE = YINPUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YNumeric Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_FIELD_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__NAME = YINPUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__VISIBILITY_PROCESSOR = YINPUT__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__ORPHAN_DATATYPES = YINPUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__ORPHAN_DATADESCRIPTIONS = YINPUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__VALIDATORS = YINPUT__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__INTERNAL_VALIDATORS = YINPUT__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Collection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__COLLECTION_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__SELECTION_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__DATATYPE = YINPUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__SELECTION = YINPUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__COLLECTION = YINPUT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__TYPE = YINPUT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Emf Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__EMF_NS_URI = YINPUT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Type Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__TYPE_QUALIFIED_NAME = YINPUT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Item Caption Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__ITEM_CAPTION_PROPERTY = YINPUT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Item Image Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX__ITEM_IMAGE_PROPERTY = YINPUT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>YCombo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCOMBO_BOX_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__ID = CoreModelPackage.YACTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__NAME = CoreModelPackage.YACTION__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__CSS_CLASS = CoreModelPackage.YACTION__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__CSS_ID = CoreModelPackage.YACTION__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__INITIAL_VISIBLE = CoreModelPackage.YACTION__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__VISIBLE = CoreModelPackage.YACTION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__VISIBILITY_PROCESSOR = CoreModelPackage.YACTION__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__ORPHAN_DATATYPES = CoreModelPackage.YACTION__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__ORPHAN_DATADESCRIPTIONS = CoreModelPackage.YACTION__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__INITIAL_ENABLED = CoreModelPackage.YACTION__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__ENABLED = CoreModelPackage.YACTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__INITIAL_EDITABLE = CoreModelPackage.YACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__EDITABLE = CoreModelPackage.YACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__DATADESCRIPTION = CoreModelPackage.YACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Click Listeners</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON__CLICK_LISTENERS = CoreModelPackage.YACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YButton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBUTTON_FEATURE_COUNT = CoreModelPackage.YACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTOGGLE_BUTTON__ID = CoreModelPackage.YACTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTOGGLE_BUTTON__NAME = CoreModelPackage.YACTION__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTOGGLE_BUTTON__CSS_CLASS = CoreModelPackage.YACTION__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTOGGLE_BUTTON__CSS_ID = CoreModelPackage.YACTION__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTOGGLE_BUTTON__INITIAL_VISIBLE = CoreModelPackage.YACTION__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTOGGLE_BUTTON__VISIBLE = CoreModelPackage.YACTION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTOGGLE_BUTTON__VISIBILITY_PROCESSOR = CoreModelPackage.YACTION__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTOGGLE_BUTTON__ORPHAN_DATATYPES = CoreModelPackage.YACTION__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTOGGLE_BUTTON__ORPHAN_DATADESCRIPTIONS = CoreModelPackage.YACTION__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTOGGLE_BUTTON__INITIAL_ENABLED = CoreModelPackage.YACTION__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTOGGLE_BUTTON__ENABLED = CoreModelPackage.YACTION__ENABLED;

	/**
	 * The feature id for the '<em><b>Initial Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTOGGLE_BUTTON__INITIAL_ACTIVATED = CoreModelPackage.YACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTOGGLE_BUTTON__ACTIVATED = CoreModelPackage.YACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTOGGLE_BUTTON__DATADESCRIPTION = CoreModelPackage.YACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>YToggle Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTOGGLE_BUTTON_FEATURE_COUNT = CoreModelPackage.YACTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YProgressBarImpl <em>YProgress Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YProgressBarImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYProgressBar()
	 * @generated
	 */
	int YPROGRESS_BAR = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR__NAME = YINPUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR__VISIBILITY_PROCESSOR = YINPUT__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR__ORPHAN_DATATYPES = YINPUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR__ORPHAN_DATADESCRIPTIONS = YINPUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR__VALIDATORS = YINPUT__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR__INTERNAL_VALIDATORS = YINPUT__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Value Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR__VALUE_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR__DATATYPE = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR__VALUE = YINPUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YProgress Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YPROGRESS_BAR_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YTabSheetImpl <em>YTab Sheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YTabSheetImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYTabSheet()
	 * @generated
	 */
	int YTAB_SHEET = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB_SHEET__ID = CoreModelPackage.YEMBEDDABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB_SHEET__NAME = CoreModelPackage.YEMBEDDABLE__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB_SHEET__CSS_CLASS = CoreModelPackage.YEMBEDDABLE__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB_SHEET__CSS_ID = CoreModelPackage.YEMBEDDABLE__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB_SHEET__INITIAL_VISIBLE = CoreModelPackage.YEMBEDDABLE__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB_SHEET__VISIBLE = CoreModelPackage.YEMBEDDABLE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB_SHEET__VISIBILITY_PROCESSOR = CoreModelPackage.YEMBEDDABLE__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB_SHEET__ORPHAN_DATATYPES = CoreModelPackage.YEMBEDDABLE__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB_SHEET__ORPHAN_DATADESCRIPTIONS = CoreModelPackage.YEMBEDDABLE__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Tabs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB_SHEET__TABS = CoreModelPackage.YEMBEDDABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>YTab Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB_SHEET_FEATURE_COUNT = CoreModelPackage.YEMBEDDABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YTabImpl <em>YTab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YTabImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYTab()
	 * @generated
	 */
	int YTAB = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB__ID = CoreModelPackage.YELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB__NAME = CoreModelPackage.YELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB__CSS_CLASS = CoreModelPackage.YELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB__CSS_ID = CoreModelPackage.YELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB__PARENT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Embeddable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB__EMBEDDABLE = CoreModelPackage.YELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB__DATADESCRIPTION = CoreModelPackage.YELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>YTab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTAB_FEATURE_COUNT = CoreModelPackage.YELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YMasterDetailImpl <em>YMaster Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YMasterDetailImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYMasterDetail()
	 * @generated
	 */
	int YMASTER_DETAIL = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__NAME = YINPUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__VISIBILITY_PROCESSOR = YINPUT__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__ORPHAN_DATATYPES = YINPUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__ORPHAN_DATADESCRIPTIONS = YINPUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__VALIDATORS = YINPUT__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__INTERNAL_VALIDATORS = YINPUT__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Collection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__COLLECTION_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selection Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__SELECTION_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__DATATYPE = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__SELECTION = YINPUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__COLLECTION = YINPUT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__TYPE = YINPUT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Emf Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__EMF_NS_URI = YINPUT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Master Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__MASTER_ELEMENT = YINPUT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Detail Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__DETAIL_ELEMENT = YINPUT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Type Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL__TYPE_QUALIFIED_NAME = YINPUT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>YMaster Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YMASTER_DETAIL_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YFormLayoutImpl <em>YForm Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YFormLayoutImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYFormLayout()
	 * @generated
	 */
	int YFORM_LAYOUT = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFORM_LAYOUT__ID = CoreModelPackage.YLAYOUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFORM_LAYOUT__NAME = CoreModelPackage.YLAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFORM_LAYOUT__CSS_CLASS = CoreModelPackage.YLAYOUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFORM_LAYOUT__CSS_ID = CoreModelPackage.YLAYOUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFORM_LAYOUT__INITIAL_VISIBLE = CoreModelPackage.YLAYOUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFORM_LAYOUT__VISIBLE = CoreModelPackage.YLAYOUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFORM_LAYOUT__VISIBILITY_PROCESSOR = CoreModelPackage.YLAYOUT__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFORM_LAYOUT__ORPHAN_DATATYPES = CoreModelPackage.YLAYOUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFORM_LAYOUT__ORPHAN_DATADESCRIPTIONS = CoreModelPackage.YLAYOUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFORM_LAYOUT__ELEMENTS = CoreModelPackage.YLAYOUT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFORM_LAYOUT__SPACING = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFORM_LAYOUT__MARGIN = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cell Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFORM_LAYOUT__CELL_STYLES = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fill Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFORM_LAYOUT__FILL_VERTICAL = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YForm Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFORM_LAYOUT_FEATURE_COUNT = CoreModelPackage.YLAYOUT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YFormLayoutCellStyleImpl <em>YForm Layout Cell Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YFormLayoutCellStyleImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYFormLayoutCellStyle()
	 * @generated
	 */
	int YFORM_LAYOUT_CELL_STYLE = 30;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFORM_LAYOUT_CELL_STYLE__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFORM_LAYOUT_CELL_STYLE__ALIGNMENT = 1;

	/**
	 * The number of structural features of the '<em>YForm Layout Cell Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YFORM_LAYOUT_CELL_STYLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YTextSearchFieldImpl <em>YText Search Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YTextSearchFieldImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYTextSearchField()
	 * @generated
	 */
	int YTEXT_SEARCH_FIELD = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_SEARCH_FIELD__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_SEARCH_FIELD__NAME = YINPUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_SEARCH_FIELD__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_SEARCH_FIELD__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_SEARCH_FIELD__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_SEARCH_FIELD__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_SEARCH_FIELD__VISIBILITY_PROCESSOR = YINPUT__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_SEARCH_FIELD__ORPHAN_DATATYPES = YINPUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_SEARCH_FIELD__ORPHAN_DATADESCRIPTIONS = YINPUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_SEARCH_FIELD__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_SEARCH_FIELD__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_SEARCH_FIELD__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_SEARCH_FIELD__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_SEARCH_FIELD__VALIDATORS = YINPUT__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_SEARCH_FIELD__INTERNAL_VALIDATORS = YINPUT__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Value Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_SEARCH_FIELD__VALUE_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_SEARCH_FIELD__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_SEARCH_FIELD__VALUE = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Wildcard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_SEARCH_FIELD__WILDCARD = YINPUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YText Search Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YTEXT_SEARCH_FIELD_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YBooleanSearchFieldImpl <em>YBoolean Search Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YBooleanSearchFieldImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYBooleanSearchField()
	 * @generated
	 */
	int YBOOLEAN_SEARCH_FIELD = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBOOLEAN_SEARCH_FIELD__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBOOLEAN_SEARCH_FIELD__NAME = YINPUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBOOLEAN_SEARCH_FIELD__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBOOLEAN_SEARCH_FIELD__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBOOLEAN_SEARCH_FIELD__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBOOLEAN_SEARCH_FIELD__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBOOLEAN_SEARCH_FIELD__VISIBILITY_PROCESSOR = YINPUT__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBOOLEAN_SEARCH_FIELD__ORPHAN_DATATYPES = YINPUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBOOLEAN_SEARCH_FIELD__ORPHAN_DATADESCRIPTIONS = YINPUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBOOLEAN_SEARCH_FIELD__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBOOLEAN_SEARCH_FIELD__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBOOLEAN_SEARCH_FIELD__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBOOLEAN_SEARCH_FIELD__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBOOLEAN_SEARCH_FIELD__VALIDATORS = YINPUT__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBOOLEAN_SEARCH_FIELD__INTERNAL_VALIDATORS = YINPUT__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Value Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBOOLEAN_SEARCH_FIELD__VALUE_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBOOLEAN_SEARCH_FIELD__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBOOLEAN_SEARCH_FIELD__VALUE = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>YBoolean Search Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YBOOLEAN_SEARCH_FIELD_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YNumericSearchFieldImpl <em>YNumeric Search Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.YNumericSearchFieldImpl
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYNumericSearchField()
	 * @generated
	 */
	int YNUMERIC_SEARCH_FIELD = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_SEARCH_FIELD__ID = YINPUT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_SEARCH_FIELD__NAME = YINPUT__NAME;

	/**
	 * The feature id for the '<em><b>Css Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_SEARCH_FIELD__CSS_CLASS = YINPUT__CSS_CLASS;

	/**
	 * The feature id for the '<em><b>Css ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_SEARCH_FIELD__CSS_ID = YINPUT__CSS_ID;

	/**
	 * The feature id for the '<em><b>Initial Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_SEARCH_FIELD__INITIAL_VISIBLE = YINPUT__INITIAL_VISIBLE;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_SEARCH_FIELD__VISIBLE = YINPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Visibility Processor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_SEARCH_FIELD__VISIBILITY_PROCESSOR = YINPUT__VISIBILITY_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Orphan Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_SEARCH_FIELD__ORPHAN_DATATYPES = YINPUT__ORPHAN_DATATYPES;

	/**
	 * The feature id for the '<em><b>Orphan Datadescriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_SEARCH_FIELD__ORPHAN_DATADESCRIPTIONS = YINPUT__ORPHAN_DATADESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Initial Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_SEARCH_FIELD__INITIAL_EDITABLE = YINPUT__INITIAL_EDITABLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_SEARCH_FIELD__EDITABLE = YINPUT__EDITABLE;

	/**
	 * The feature id for the '<em><b>Initial Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_SEARCH_FIELD__INITIAL_ENABLED = YINPUT__INITIAL_ENABLED;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_SEARCH_FIELD__ENABLED = YINPUT__ENABLED;

	/**
	 * The feature id for the '<em><b>Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_SEARCH_FIELD__VALIDATORS = YINPUT__VALIDATORS;

	/**
	 * The feature id for the '<em><b>Internal Validators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_SEARCH_FIELD__INTERNAL_VALIDATORS = YINPUT__INTERNAL_VALIDATORS;

	/**
	 * The feature id for the '<em><b>Value Binding Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_SEARCH_FIELD__VALUE_BINDING_ENDPOINT = YINPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datadescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_SEARCH_FIELD__DATADESCRIPTION = YINPUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_SEARCH_FIELD__VALUE = YINPUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Wildcard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_SEARCH_FIELD__WILDCARD = YINPUT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>YNumeric Search Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YNUMERIC_SEARCH_FIELD_FEATURE_COUNT = YINPUT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '<em>YButton Click Listener</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.listener.YButtonClickListener
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYButtonClickListener()
	 * @generated
	 */
	int YBUTTON_CLICK_LISTENER = 39;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.YAlignment <em>YAlignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.YAlignment
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYAlignment()
	 * @generated
	 */
	int YALIGNMENT = 34;


	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.YFlatAlignment <em>YFlat Alignment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.YFlatAlignment
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYFlatAlignment()
	 * @generated
	 */
	int YFLAT_ALIGNMENT = 35;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.YSelectionType <em>YSelection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.YSelectionType
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYSelectionType()
	 * @generated
	 */
	int YSELECTION_TYPE = 36;


	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.YBooleanSearchOption <em>YBoolean Search Option</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.YBooleanSearchOption
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYBooleanSearchOption()
	 * @generated
	 */
	int YBOOLEAN_SEARCH_OPTION = 37;

	/**
	 * The meta object id for the '{@link org.lunifera.ecview.core.extension.model.extension.YSearchWildcards <em>YSearch Wildcards</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.ecview.core.extension.model.extension.YSearchWildcards
	 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYSearchWildcards()
	 * @generated
	 */
	int YSEARCH_WILDCARDS = 38;


	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YTextField <em>YText Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YText Field</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTextField
	 * @generated
	 */
	EClass getYTextField();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YTextField#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTextField#getDatatype()
	 * @see #getYTextField()
	 * @generated
	 */
	EReference getYTextField_Datatype();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YTextField#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTextField#getDatadescription()
	 * @see #getYTextField()
	 * @generated
	 */
	EReference getYTextField_Datadescription();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YTextField#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTextField#getValue()
	 * @see #getYTextField()
	 * @generated
	 */
	EAttribute getYTextField_Value();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YGridLayout <em>YGrid Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YGrid Layout</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YGridLayout
	 * @generated
	 */
	EClass getYGridLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.core.extension.model.extension.YGridLayout#getCellStyles <em>Cell Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell Styles</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YGridLayout#getCellStyles()
	 * @see #getYGridLayout()
	 * @generated
	 */
	EReference getYGridLayout_CellStyles();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YGridLayout#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YGridLayout#getColumns()
	 * @see #getYGridLayout()
	 * @generated
	 */
	EAttribute getYGridLayout_Columns();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YGridLayout#isFillHorizontal <em>Fill Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Horizontal</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YGridLayout#isFillHorizontal()
	 * @see #getYGridLayout()
	 * @generated
	 */
	EAttribute getYGridLayout_FillHorizontal();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YGridLayout#isFillVertical <em>Fill Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Vertical</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YGridLayout#isFillVertical()
	 * @see #getYGridLayout()
	 * @generated
	 */
	EAttribute getYGridLayout_FillVertical();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YGridLayoutCellStyle <em>YGrid Layout Cell Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YGrid Layout Cell Style</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YGridLayoutCellStyle
	 * @generated
	 */
	EClass getYGridLayoutCellStyle();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YGridLayoutCellStyle#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YGridLayoutCellStyle#getTarget()
	 * @see #getYGridLayoutCellStyle()
	 * @generated
	 */
	EReference getYGridLayoutCellStyle_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YGridLayoutCellStyle#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YGridLayoutCellStyle#getAlignment()
	 * @see #getYGridLayoutCellStyle()
	 * @generated
	 */
	EAttribute getYGridLayoutCellStyle_Alignment();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.core.extension.model.extension.YGridLayoutCellStyle#getSpanInfo <em>Span Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Span Info</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YGridLayoutCellStyle#getSpanInfo()
	 * @see #getYGridLayoutCellStyle()
	 * @generated
	 */
	EReference getYGridLayoutCellStyle_SpanInfo();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YHorizontalLayout <em>YHorizontal Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YHorizontal Layout</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YHorizontalLayout
	 * @generated
	 */
	EClass getYHorizontalLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.core.extension.model.extension.YHorizontalLayout#getCellStyles <em>Cell Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell Styles</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YHorizontalLayout#getCellStyles()
	 * @see #getYHorizontalLayout()
	 * @generated
	 */
	EReference getYHorizontalLayout_CellStyles();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YHorizontalLayout#isFillHorizontal <em>Fill Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Horizontal</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YHorizontalLayout#isFillHorizontal()
	 * @see #getYHorizontalLayout()
	 * @generated
	 */
	EAttribute getYHorizontalLayout_FillHorizontal();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YHorizontalLayoutCellStyle <em>YHorizontal Layout Cell Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YHorizontal Layout Cell Style</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YHorizontalLayoutCellStyle
	 * @generated
	 */
	EClass getYHorizontalLayoutCellStyle();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YHorizontalLayoutCellStyle#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YHorizontalLayoutCellStyle#getTarget()
	 * @see #getYHorizontalLayoutCellStyle()
	 * @generated
	 */
	EReference getYHorizontalLayoutCellStyle_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YHorizontalLayoutCellStyle#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YHorizontalLayoutCellStyle#getAlignment()
	 * @see #getYHorizontalLayoutCellStyle()
	 * @generated
	 */
	EAttribute getYHorizontalLayoutCellStyle_Alignment();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YVerticalLayout <em>YVertical Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YVertical Layout</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YVerticalLayout
	 * @generated
	 */
	EClass getYVerticalLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.core.extension.model.extension.YVerticalLayout#getCellStyles <em>Cell Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell Styles</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YVerticalLayout#getCellStyles()
	 * @see #getYVerticalLayout()
	 * @generated
	 */
	EReference getYVerticalLayout_CellStyles();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YVerticalLayout#isFillVertical <em>Fill Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Vertical</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YVerticalLayout#isFillVertical()
	 * @see #getYVerticalLayout()
	 * @generated
	 */
	EAttribute getYVerticalLayout_FillVertical();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YVerticalLayoutCellStyle <em>YVertical Layout Cell Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YVertical Layout Cell Style</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YVerticalLayoutCellStyle
	 * @generated
	 */
	EClass getYVerticalLayoutCellStyle();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YVerticalLayoutCellStyle#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YVerticalLayoutCellStyle#getTarget()
	 * @see #getYVerticalLayoutCellStyle()
	 * @generated
	 */
	EReference getYVerticalLayoutCellStyle_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YVerticalLayoutCellStyle#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YVerticalLayoutCellStyle#getAlignment()
	 * @see #getYVerticalLayoutCellStyle()
	 * @generated
	 */
	EAttribute getYVerticalLayoutCellStyle_Alignment();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YSpanInfo <em>YSpan Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YSpan Info</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YSpanInfo
	 * @generated
	 */
	EClass getYSpanInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YSpanInfo#getColumnFrom <em>Column From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column From</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YSpanInfo#getColumnFrom()
	 * @see #getYSpanInfo()
	 * @generated
	 */
	EAttribute getYSpanInfo_ColumnFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YSpanInfo#getRowFrom <em>Row From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row From</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YSpanInfo#getRowFrom()
	 * @see #getYSpanInfo()
	 * @generated
	 */
	EAttribute getYSpanInfo_RowFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YSpanInfo#getColumnTo <em>Column To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column To</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YSpanInfo#getColumnTo()
	 * @see #getYSpanInfo()
	 * @generated
	 */
	EAttribute getYSpanInfo_ColumnTo();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YSpanInfo#getRowTo <em>Row To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row To</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YSpanInfo#getRowTo()
	 * @see #getYSpanInfo()
	 * @generated
	 */
	EAttribute getYSpanInfo_RowTo();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YTable <em>YTable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YTable</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTable
	 * @generated
	 */
	EClass getYTable();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YTable#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTable#getDatatype()
	 * @see #getYTable()
	 * @generated
	 */
	EReference getYTable_Datatype();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YTable#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTable#getDatadescription()
	 * @see #getYTable()
	 * @generated
	 */
	EReference getYTable_Datadescription();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YTable#getSelectionType <em>Selection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection Type</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTable#getSelectionType()
	 * @see #getYTable()
	 * @generated
	 */
	EAttribute getYTable_SelectionType();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YTable#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTable#getSelection()
	 * @see #getYTable()
	 * @generated
	 */
	EAttribute getYTable_Selection();

	/**
	 * Returns the meta object for the attribute list '{@link org.lunifera.ecview.core.extension.model.extension.YTable#getMultiSelection <em>Multi Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Multi Selection</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTable#getMultiSelection()
	 * @see #getYTable()
	 * @generated
	 */
	EAttribute getYTable_MultiSelection();

	/**
	 * Returns the meta object for the attribute list '{@link org.lunifera.ecview.core.extension.model.extension.YTable#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Collection</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTable#getCollection()
	 * @see #getYTable()
	 * @generated
	 */
	EAttribute getYTable_Collection();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YTable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTable#getType()
	 * @see #getYTable()
	 * @generated
	 */
	EAttribute getYTable_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YTable#getEmfNsURI <em>Emf Ns URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emf Ns URI</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTable#getEmfNsURI()
	 * @see #getYTable()
	 * @generated
	 */
	EAttribute getYTable_EmfNsURI();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YTable#getTypeQualifiedName <em>Type Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Qualified Name</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTable#getTypeQualifiedName()
	 * @see #getYTable()
	 * @generated
	 */
	EAttribute getYTable_TypeQualifiedName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.core.extension.model.extension.YTable#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTable#getColumns()
	 * @see #getYTable()
	 * @generated
	 */
	EReference getYTable_Columns();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YTable#getItemImageProperty <em>Item Image Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Image Property</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTable#getItemImageProperty()
	 * @see #getYTable()
	 * @generated
	 */
	EAttribute getYTable_ItemImageProperty();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YColumn <em>YColumn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YColumn</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YColumn
	 * @generated
	 */
	EClass getYColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YColumn#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YColumn#getIcon()
	 * @see #getYColumn()
	 * @generated
	 */
	EAttribute getYColumn_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YColumn#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YColumn#isVisible()
	 * @see #getYColumn()
	 * @generated
	 */
	EAttribute getYColumn_Visible();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YColumn#isOrderable <em>Orderable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orderable</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YColumn#isOrderable()
	 * @see #getYColumn()
	 * @generated
	 */
	EAttribute getYColumn_Orderable();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YColumn#isCollapsed <em>Collapsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collapsed</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YColumn#isCollapsed()
	 * @see #getYColumn()
	 * @generated
	 */
	EAttribute getYColumn_Collapsed();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YColumn#isCollapsible <em>Collapsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collapsible</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YColumn#isCollapsible()
	 * @see #getYColumn()
	 * @generated
	 */
	EAttribute getYColumn_Collapsible();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YColumn#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YColumn#getAlignment()
	 * @see #getYColumn()
	 * @generated
	 */
	EAttribute getYColumn_Alignment();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YColumn#getExpandRatio <em>Expand Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expand Ratio</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YColumn#getExpandRatio()
	 * @see #getYColumn()
	 * @generated
	 */
	EAttribute getYColumn_ExpandRatio();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YLabel <em>YLabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YLabel</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YLabel
	 * @generated
	 */
	EClass getYLabel();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YLabel#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YLabel#getDatadescription()
	 * @see #getYLabel()
	 * @generated
	 */
	EReference getYLabel_Datadescription();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YLabel#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YLabel#getValue()
	 * @see #getYLabel()
	 * @generated
	 */
	EAttribute getYLabel_Value();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YImage <em>YImage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YImage</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YImage
	 * @generated
	 */
	EClass getYImage();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YImage#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YImage#getDatadescription()
	 * @see #getYImage()
	 * @generated
	 */
	EReference getYImage_Datadescription();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YImage#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YImage#getValue()
	 * @see #getYImage()
	 * @generated
	 */
	EAttribute getYImage_Value();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YTextArea <em>YText Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YText Area</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTextArea
	 * @generated
	 */
	EClass getYTextArea();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YTextArea#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTextArea#getDatadescription()
	 * @see #getYTextArea()
	 * @generated
	 */
	EReference getYTextArea_Datadescription();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YTextArea#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTextArea#getDatatype()
	 * @see #getYTextArea()
	 * @generated
	 */
	EReference getYTextArea_Datatype();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YTextArea#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTextArea#getValue()
	 * @see #getYTextArea()
	 * @generated
	 */
	EAttribute getYTextArea_Value();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YCheckBox <em>YCheck Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCheck Box</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YCheckBox
	 * @generated
	 */
	EClass getYCheckBox();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YCheckBox#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YCheckBox#getDatadescription()
	 * @see #getYCheckBox()
	 * @generated
	 */
	EReference getYCheckBox_Datadescription();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YCheckBox#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YCheckBox#getDatatype()
	 * @see #getYCheckBox()
	 * @generated
	 */
	EReference getYCheckBox_Datatype();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YCheckBox#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YCheckBox#isValue()
	 * @see #getYCheckBox()
	 * @generated
	 */
	EAttribute getYCheckBox_Value();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YBrowser <em>YBrowser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YBrowser</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YBrowser
	 * @generated
	 */
	EClass getYBrowser();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YBrowser#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YBrowser#getDatatype()
	 * @see #getYBrowser()
	 * @generated
	 */
	EReference getYBrowser_Datatype();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YBrowser#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YBrowser#getDatadescription()
	 * @see #getYBrowser()
	 * @generated
	 */
	EReference getYBrowser_Datadescription();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YBrowser#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YBrowser#getValue()
	 * @see #getYBrowser()
	 * @generated
	 */
	EAttribute getYBrowser_Value();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YDateTime <em>YDate Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YDate Time</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YDateTime
	 * @generated
	 */
	EClass getYDateTime();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YDateTime#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YDateTime#getDatatype()
	 * @see #getYDateTime()
	 * @generated
	 */
	EReference getYDateTime_Datatype();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YDateTime#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YDateTime#getDatadescription()
	 * @see #getYDateTime()
	 * @generated
	 */
	EReference getYDateTime_Datadescription();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YDateTime#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YDateTime#getValue()
	 * @see #getYDateTime()
	 * @generated
	 */
	EAttribute getYDateTime_Value();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YInput <em>YInput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YInput</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YInput
	 * @generated
	 */
	EClass getYInput();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YDecimalField <em>YDecimal Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YDecimal Field</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YDecimalField
	 * @generated
	 */
	EClass getYDecimalField();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YDecimalField#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YDecimalField#getDatatype()
	 * @see #getYDecimalField()
	 * @generated
	 */
	EReference getYDecimalField_Datatype();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YDecimalField#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YDecimalField#getDatadescription()
	 * @see #getYDecimalField()
	 * @generated
	 */
	EReference getYDecimalField_Datadescription();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YDecimalField#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YDecimalField#getValue()
	 * @see #getYDecimalField()
	 * @generated
	 */
	EAttribute getYDecimalField_Value();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YNumericField <em>YNumeric Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YNumeric Field</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YNumericField
	 * @generated
	 */
	EClass getYNumericField();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YNumericField#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YNumericField#getDatatype()
	 * @see #getYNumericField()
	 * @generated
	 */
	EReference getYNumericField_Datatype();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YNumericField#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YNumericField#getDatadescription()
	 * @see #getYNumericField()
	 * @generated
	 */
	EReference getYNumericField_Datadescription();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YNumericField#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YNumericField#getValue()
	 * @see #getYNumericField()
	 * @generated
	 */
	EAttribute getYNumericField_Value();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YComboBox <em>YCombo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCombo Box</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YComboBox
	 * @generated
	 */
	EClass getYComboBox();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YComboBox#getDatadescription()
	 * @see #getYComboBox()
	 * @generated
	 */
	EReference getYComboBox_Datadescription();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YComboBox#getDatatype()
	 * @see #getYComboBox()
	 * @generated
	 */
	EReference getYComboBox_Datatype();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YComboBox#getSelection()
	 * @see #getYComboBox()
	 * @generated
	 */
	EAttribute getYComboBox_Selection();

	/**
	 * Returns the meta object for the attribute list '{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Collection</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YComboBox#getCollection()
	 * @see #getYComboBox()
	 * @generated
	 */
	EAttribute getYComboBox_Collection();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YComboBox#getType()
	 * @see #getYComboBox()
	 * @generated
	 */
	EAttribute getYComboBox_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getEmfNsURI <em>Emf Ns URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emf Ns URI</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YComboBox#getEmfNsURI()
	 * @see #getYComboBox()
	 * @generated
	 */
	EAttribute getYComboBox_EmfNsURI();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getTypeQualifiedName <em>Type Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Qualified Name</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YComboBox#getTypeQualifiedName()
	 * @see #getYComboBox()
	 * @generated
	 */
	EAttribute getYComboBox_TypeQualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getItemCaptionProperty <em>Item Caption Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Caption Property</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YComboBox#getItemCaptionProperty()
	 * @see #getYComboBox()
	 * @generated
	 */
	EAttribute getYComboBox_ItemCaptionProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YComboBox#getItemImageProperty <em>Item Image Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Image Property</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YComboBox#getItemImageProperty()
	 * @see #getYComboBox()
	 * @generated
	 */
	EAttribute getYComboBox_ItemImageProperty();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YList <em>YList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YList</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YList
	 * @generated
	 */
	EClass getYList();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YList#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YList#getDatadescription()
	 * @see #getYList()
	 * @generated
	 */
	EReference getYList_Datadescription();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YList#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YList#getDatatype()
	 * @see #getYList()
	 * @generated
	 */
	EReference getYList_Datatype();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YList#getSelectionType <em>Selection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection Type</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YList#getSelectionType()
	 * @see #getYList()
	 * @generated
	 */
	EAttribute getYList_SelectionType();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YList#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YList#getSelection()
	 * @see #getYList()
	 * @generated
	 */
	EAttribute getYList_Selection();

	/**
	 * Returns the meta object for the attribute list '{@link org.lunifera.ecview.core.extension.model.extension.YList#getMultiSelection <em>Multi Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Multi Selection</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YList#getMultiSelection()
	 * @see #getYList()
	 * @generated
	 */
	EAttribute getYList_MultiSelection();

	/**
	 * Returns the meta object for the attribute list '{@link org.lunifera.ecview.core.extension.model.extension.YList#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Collection</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YList#getCollection()
	 * @see #getYList()
	 * @generated
	 */
	EAttribute getYList_Collection();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YList#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YList#getType()
	 * @see #getYList()
	 * @generated
	 */
	EAttribute getYList_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YList#getEmfNsURI <em>Emf Ns URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emf Ns URI</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YList#getEmfNsURI()
	 * @see #getYList()
	 * @generated
	 */
	EAttribute getYList_EmfNsURI();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YList#getTypeQualifiedName <em>Type Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Qualified Name</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YList#getTypeQualifiedName()
	 * @see #getYList()
	 * @generated
	 */
	EAttribute getYList_TypeQualifiedName();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YButton <em>YButton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YButton</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YButton
	 * @generated
	 */
	EClass getYButton();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YButton#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YButton#getDatadescription()
	 * @see #getYButton()
	 * @generated
	 */
	EReference getYButton_Datadescription();

	/**
	 * Returns the meta object for the attribute list '{@link org.lunifera.ecview.core.extension.model.extension.YButton#getClickListeners <em>Click Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Click Listeners</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YButton#getClickListeners()
	 * @see #getYButton()
	 * @generated
	 */
	EAttribute getYButton_ClickListeners();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YToggleButton <em>YToggle Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YToggle Button</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YToggleButton
	 * @generated
	 */
	EClass getYToggleButton();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YToggleButton#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YToggleButton#getDatadescription()
	 * @see #getYToggleButton()
	 * @generated
	 */
	EReference getYToggleButton_Datadescription();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YProgressBar <em>YProgress Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YProgress Bar</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YProgressBar
	 * @generated
	 */
	EClass getYProgressBar();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YProgressBar#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YProgressBar#getDatatype()
	 * @see #getYProgressBar()
	 * @generated
	 */
	EReference getYProgressBar_Datatype();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YProgressBar#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YProgressBar#getDatadescription()
	 * @see #getYProgressBar()
	 * @generated
	 */
	EReference getYProgressBar_Datadescription();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YProgressBar#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YProgressBar#getValue()
	 * @see #getYProgressBar()
	 * @generated
	 */
	EAttribute getYProgressBar_Value();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YTabSheet <em>YTab Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YTab Sheet</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTabSheet
	 * @generated
	 */
	EClass getYTabSheet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.core.extension.model.extension.YTabSheet#getTabs <em>Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tabs</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTabSheet#getTabs()
	 * @see #getYTabSheet()
	 * @generated
	 */
	EReference getYTabSheet_Tabs();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YTab <em>YTab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YTab</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTab
	 * @generated
	 */
	EClass getYTab();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.ecview.core.extension.model.extension.YTab#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTab#getParent()
	 * @see #getYTab()
	 * @generated
	 */
	EReference getYTab_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.core.extension.model.extension.YTab#getEmbeddable <em>Embeddable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Embeddable</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTab#getEmbeddable()
	 * @see #getYTab()
	 * @generated
	 */
	EReference getYTab_Embeddable();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YTab#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTab#getDatadescription()
	 * @see #getYTab()
	 * @generated
	 */
	EReference getYTab_Datadescription();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YMasterDetail <em>YMaster Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YMaster Detail</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YMasterDetail
	 * @generated
	 */
	EClass getYMasterDetail();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YMasterDetail#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YMasterDetail#getDatatype()
	 * @see #getYMasterDetail()
	 * @generated
	 */
	EReference getYMasterDetail_Datatype();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YMasterDetail#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YMasterDetail#getDatadescription()
	 * @see #getYMasterDetail()
	 * @generated
	 */
	EReference getYMasterDetail_Datadescription();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YMasterDetail#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YMasterDetail#getSelection()
	 * @see #getYMasterDetail()
	 * @generated
	 */
	EAttribute getYMasterDetail_Selection();

	/**
	 * Returns the meta object for the attribute list '{@link org.lunifera.ecview.core.extension.model.extension.YMasterDetail#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Collection</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YMasterDetail#getCollection()
	 * @see #getYMasterDetail()
	 * @generated
	 */
	EAttribute getYMasterDetail_Collection();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YMasterDetail#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YMasterDetail#getType()
	 * @see #getYMasterDetail()
	 * @generated
	 */
	EAttribute getYMasterDetail_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YMasterDetail#getEmfNsURI <em>Emf Ns URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emf Ns URI</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YMasterDetail#getEmfNsURI()
	 * @see #getYMasterDetail()
	 * @generated
	 */
	EAttribute getYMasterDetail_EmfNsURI();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.core.extension.model.extension.YMasterDetail#getMasterElement <em>Master Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Master Element</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YMasterDetail#getMasterElement()
	 * @see #getYMasterDetail()
	 * @generated
	 */
	EReference getYMasterDetail_MasterElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.ecview.core.extension.model.extension.YMasterDetail#getDetailElement <em>Detail Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Detail Element</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YMasterDetail#getDetailElement()
	 * @see #getYMasterDetail()
	 * @generated
	 */
	EReference getYMasterDetail_DetailElement();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YMasterDetail#getTypeQualifiedName <em>Type Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Qualified Name</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YMasterDetail#getTypeQualifiedName()
	 * @see #getYMasterDetail()
	 * @generated
	 */
	EAttribute getYMasterDetail_TypeQualifiedName();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YFormLayout <em>YForm Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YForm Layout</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YFormLayout
	 * @generated
	 */
	EClass getYFormLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.ecview.core.extension.model.extension.YFormLayout#getCellStyles <em>Cell Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell Styles</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YFormLayout#getCellStyles()
	 * @see #getYFormLayout()
	 * @generated
	 */
	EReference getYFormLayout_CellStyles();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YFormLayout#isFillVertical <em>Fill Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Vertical</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YFormLayout#isFillVertical()
	 * @see #getYFormLayout()
	 * @generated
	 */
	EAttribute getYFormLayout_FillVertical();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YFormLayoutCellStyle <em>YForm Layout Cell Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YForm Layout Cell Style</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YFormLayoutCellStyle
	 * @generated
	 */
	EClass getYFormLayoutCellStyle();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YFormLayoutCellStyle#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YFormLayoutCellStyle#getTarget()
	 * @see #getYFormLayoutCellStyle()
	 * @generated
	 */
	EReference getYFormLayoutCellStyle_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YFormLayoutCellStyle#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YFormLayoutCellStyle#getAlignment()
	 * @see #getYFormLayoutCellStyle()
	 * @generated
	 */
	EAttribute getYFormLayoutCellStyle_Alignment();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YTextSearchField <em>YText Search Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YText Search Field</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTextSearchField
	 * @generated
	 */
	EClass getYTextSearchField();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YTextSearchField#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTextSearchField#getDatadescription()
	 * @see #getYTextSearchField()
	 * @generated
	 */
	EReference getYTextSearchField_Datadescription();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YTextSearchField#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTextSearchField#getValue()
	 * @see #getYTextSearchField()
	 * @generated
	 */
	EAttribute getYTextSearchField_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YTextSearchField#getWildcard <em>Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wildcard</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTextSearchField#getWildcard()
	 * @see #getYTextSearchField()
	 * @generated
	 */
	EAttribute getYTextSearchField_Wildcard();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YBooleanSearchField <em>YBoolean Search Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YBoolean Search Field</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YBooleanSearchField
	 * @generated
	 */
	EClass getYBooleanSearchField();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YBooleanSearchField#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YBooleanSearchField#getDatadescription()
	 * @see #getYBooleanSearchField()
	 * @generated
	 */
	EReference getYBooleanSearchField_Datadescription();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YBooleanSearchField#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YBooleanSearchField#getValue()
	 * @see #getYBooleanSearchField()
	 * @generated
	 */
	EAttribute getYBooleanSearchField_Value();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YNumericSearchField <em>YNumeric Search Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YNumeric Search Field</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YNumericSearchField
	 * @generated
	 */
	EClass getYNumericSearchField();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YNumericSearchField#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YNumericSearchField#getDatadescription()
	 * @see #getYNumericSearchField()
	 * @generated
	 */
	EReference getYNumericSearchField_Datadescription();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YNumericSearchField#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YNumericSearchField#getValue()
	 * @see #getYNumericSearchField()
	 * @generated
	 */
	EAttribute getYNumericSearchField_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YNumericSearchField#getWildcard <em>Wildcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wildcard</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YNumericSearchField#getWildcard()
	 * @see #getYNumericSearchField()
	 * @generated
	 */
	EAttribute getYNumericSearchField_Wildcard();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YTree <em>YTree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YTree</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTree
	 * @generated
	 */
	EClass getYTree();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YTree#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTree#getDatatype()
	 * @see #getYTree()
	 * @generated
	 */
	EReference getYTree_Datatype();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YTree#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTree#getDatadescription()
	 * @see #getYTree()
	 * @generated
	 */
	EReference getYTree_Datadescription();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YTree#getSelectionType <em>Selection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection Type</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTree#getSelectionType()
	 * @see #getYTree()
	 * @generated
	 */
	EAttribute getYTree_SelectionType();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YTree#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTree#getSelection()
	 * @see #getYTree()
	 * @generated
	 */
	EAttribute getYTree_Selection();

	/**
	 * Returns the meta object for the attribute list '{@link org.lunifera.ecview.core.extension.model.extension.YTree#getMultiSelection <em>Multi Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Multi Selection</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTree#getMultiSelection()
	 * @see #getYTree()
	 * @generated
	 */
	EAttribute getYTree_MultiSelection();

	/**
	 * Returns the meta object for the attribute list '{@link org.lunifera.ecview.core.extension.model.extension.YTree#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Collection</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTree#getCollection()
	 * @see #getYTree()
	 * @generated
	 */
	EAttribute getYTree_Collection();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YTree#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTree#getType()
	 * @see #getYTree()
	 * @generated
	 */
	EAttribute getYTree_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YTree#getEmfNsURI <em>Emf Ns URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emf Ns URI</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTree#getEmfNsURI()
	 * @see #getYTree()
	 * @generated
	 */
	EAttribute getYTree_EmfNsURI();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YTree#getTypeQualifiedName <em>Type Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Qualified Name</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YTree#getTypeQualifiedName()
	 * @see #getYTree()
	 * @generated
	 */
	EAttribute getYTree_TypeQualifiedName();

	/**
	 * Returns the meta object for class '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup <em>YOptions Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YOptions Group</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YOptionsGroup
	 * @generated
	 */
	EClass getYOptionsGroup();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getDatadescription <em>Datadescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datadescription</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getDatadescription()
	 * @see #getYOptionsGroup()
	 * @generated
	 */
	EReference getYOptionsGroup_Datadescription();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getDatatype()
	 * @see #getYOptionsGroup()
	 * @generated
	 */
	EReference getYOptionsGroup_Datatype();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getSelectionType <em>Selection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection Type</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getSelectionType()
	 * @see #getYOptionsGroup()
	 * @generated
	 */
	EAttribute getYOptionsGroup_SelectionType();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getSelection()
	 * @see #getYOptionsGroup()
	 * @generated
	 */
	EAttribute getYOptionsGroup_Selection();

	/**
	 * Returns the meta object for the attribute list '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getMultiSelection <em>Multi Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Multi Selection</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getMultiSelection()
	 * @see #getYOptionsGroup()
	 * @generated
	 */
	EAttribute getYOptionsGroup_MultiSelection();

	/**
	 * Returns the meta object for the attribute list '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Collection</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getCollection()
	 * @see #getYOptionsGroup()
	 * @generated
	 */
	EAttribute getYOptionsGroup_Collection();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getType()
	 * @see #getYOptionsGroup()
	 * @generated
	 */
	EAttribute getYOptionsGroup_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getEmfNsURI <em>Emf Ns URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emf Ns URI</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getEmfNsURI()
	 * @see #getYOptionsGroup()
	 * @generated
	 */
	EAttribute getYOptionsGroup_EmfNsURI();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getTypeQualifiedName <em>Type Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Qualified Name</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getTypeQualifiedName()
	 * @see #getYOptionsGroup()
	 * @generated
	 */
	EAttribute getYOptionsGroup_TypeQualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getItemCaptionProperty <em>Item Caption Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Caption Property</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getItemCaptionProperty()
	 * @see #getYOptionsGroup()
	 * @generated
	 */
	EAttribute getYOptionsGroup_ItemCaptionProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getItemImageProperty <em>Item Image Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Image Property</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YOptionsGroup#getItemImageProperty()
	 * @see #getYOptionsGroup()
	 * @generated
	 */
	EAttribute getYOptionsGroup_ItemImageProperty();

	/**
	 * Returns the meta object for data type '{@link org.lunifera.ecview.core.extension.model.extension.listener.YButtonClickListener <em>YButton Click Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>YButton Click Listener</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.listener.YButtonClickListener
	 * @model instanceClass="org.lunifera.ecview.core.extension.model.extension.listener.YButtonClickListener"
	 * @generated
	 */
	EDataType getYButtonClickListener();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.ecview.core.extension.model.extension.YAlignment <em>YAlignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YAlignment</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YAlignment
	 * @generated
	 */
	EEnum getYAlignment();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.ecview.core.extension.model.extension.YFlatAlignment <em>YFlat Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YFlat Alignment</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YFlatAlignment
	 * @generated
	 */
	EEnum getYFlatAlignment();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.ecview.core.extension.model.extension.YSelectionType <em>YSelection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YSelection Type</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YSelectionType
	 * @generated
	 */
	EEnum getYSelectionType();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.ecview.core.extension.model.extension.YBooleanSearchOption <em>YBoolean Search Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YBoolean Search Option</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YBooleanSearchOption
	 * @generated
	 */
	EEnum getYBooleanSearchOption();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.ecview.core.extension.model.extension.YSearchWildcards <em>YSearch Wildcards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YSearch Wildcards</em>'.
	 * @see org.lunifera.ecview.core.extension.model.extension.YSearchWildcards
	 * @generated
	 */
	EEnum getYSearchWildcards();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtensionModelFactory getExtensionModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YTextFieldImpl <em>YText Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YTextFieldImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYTextField()
		 * @generated
		 */
		EClass YTEXT_FIELD = eINSTANCE.getYTextField();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTEXT_FIELD__DATATYPE = eINSTANCE.getYTextField_Datatype();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTEXT_FIELD__DATADESCRIPTION = eINSTANCE.getYTextField_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTEXT_FIELD__VALUE = eINSTANCE.getYTextField_Value();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YGridLayoutImpl <em>YGrid Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YGridLayoutImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYGridLayout()
		 * @generated
		 */
		EClass YGRID_LAYOUT = eINSTANCE.getYGridLayout();

		/**
		 * The meta object literal for the '<em><b>Cell Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YGRID_LAYOUT__CELL_STYLES = eINSTANCE.getYGridLayout_CellStyles();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YGRID_LAYOUT__COLUMNS = eINSTANCE.getYGridLayout_Columns();

		/**
		 * The meta object literal for the '<em><b>Fill Horizontal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YGRID_LAYOUT__FILL_HORIZONTAL = eINSTANCE.getYGridLayout_FillHorizontal();

		/**
		 * The meta object literal for the '<em><b>Fill Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YGRID_LAYOUT__FILL_VERTICAL = eINSTANCE.getYGridLayout_FillVertical();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YGridLayoutCellStyleImpl <em>YGrid Layout Cell Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YGridLayoutCellStyleImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYGridLayoutCellStyle()
		 * @generated
		 */
		EClass YGRID_LAYOUT_CELL_STYLE = eINSTANCE.getYGridLayoutCellStyle();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YGRID_LAYOUT_CELL_STYLE__TARGET = eINSTANCE.getYGridLayoutCellStyle_Target();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YGRID_LAYOUT_CELL_STYLE__ALIGNMENT = eINSTANCE.getYGridLayoutCellStyle_Alignment();

		/**
		 * The meta object literal for the '<em><b>Span Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YGRID_LAYOUT_CELL_STYLE__SPAN_INFO = eINSTANCE.getYGridLayoutCellStyle_SpanInfo();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YHorizontalLayoutImpl <em>YHorizontal Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YHorizontalLayoutImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYHorizontalLayout()
		 * @generated
		 */
		EClass YHORIZONTAL_LAYOUT = eINSTANCE.getYHorizontalLayout();

		/**
		 * The meta object literal for the '<em><b>Cell Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YHORIZONTAL_LAYOUT__CELL_STYLES = eINSTANCE.getYHorizontalLayout_CellStyles();

		/**
		 * The meta object literal for the '<em><b>Fill Horizontal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YHORIZONTAL_LAYOUT__FILL_HORIZONTAL = eINSTANCE.getYHorizontalLayout_FillHorizontal();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YHorizontalLayoutCellStyleImpl <em>YHorizontal Layout Cell Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YHorizontalLayoutCellStyleImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYHorizontalLayoutCellStyle()
		 * @generated
		 */
		EClass YHORIZONTAL_LAYOUT_CELL_STYLE = eINSTANCE.getYHorizontalLayoutCellStyle();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YHORIZONTAL_LAYOUT_CELL_STYLE__TARGET = eINSTANCE.getYHorizontalLayoutCellStyle_Target();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YHORIZONTAL_LAYOUT_CELL_STYLE__ALIGNMENT = eINSTANCE.getYHorizontalLayoutCellStyle_Alignment();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YVerticalLayoutImpl <em>YVertical Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YVerticalLayoutImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYVerticalLayout()
		 * @generated
		 */
		EClass YVERTICAL_LAYOUT = eINSTANCE.getYVerticalLayout();

		/**
		 * The meta object literal for the '<em><b>Cell Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVERTICAL_LAYOUT__CELL_STYLES = eINSTANCE.getYVerticalLayout_CellStyles();

		/**
		 * The meta object literal for the '<em><b>Fill Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVERTICAL_LAYOUT__FILL_VERTICAL = eINSTANCE.getYVerticalLayout_FillVertical();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YVerticalLayoutCellStyleImpl <em>YVertical Layout Cell Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YVerticalLayoutCellStyleImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYVerticalLayoutCellStyle()
		 * @generated
		 */
		EClass YVERTICAL_LAYOUT_CELL_STYLE = eINSTANCE.getYVerticalLayoutCellStyle();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YVERTICAL_LAYOUT_CELL_STYLE__TARGET = eINSTANCE.getYVerticalLayoutCellStyle_Target();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YVERTICAL_LAYOUT_CELL_STYLE__ALIGNMENT = eINSTANCE.getYVerticalLayoutCellStyle_Alignment();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YSpanInfoImpl <em>YSpan Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YSpanInfoImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYSpanInfo()
		 * @generated
		 */
		EClass YSPAN_INFO = eINSTANCE.getYSpanInfo();

		/**
		 * The meta object literal for the '<em><b>Column From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSPAN_INFO__COLUMN_FROM = eINSTANCE.getYSpanInfo_ColumnFrom();

		/**
		 * The meta object literal for the '<em><b>Row From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSPAN_INFO__ROW_FROM = eINSTANCE.getYSpanInfo_RowFrom();

		/**
		 * The meta object literal for the '<em><b>Column To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSPAN_INFO__COLUMN_TO = eINSTANCE.getYSpanInfo_ColumnTo();

		/**
		 * The meta object literal for the '<em><b>Row To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YSPAN_INFO__ROW_TO = eINSTANCE.getYSpanInfo_RowTo();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YTableImpl <em>YTable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YTableImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYTable()
		 * @generated
		 */
		EClass YTABLE = eINSTANCE.getYTable();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTABLE__DATATYPE = eINSTANCE.getYTable_Datatype();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTABLE__DATADESCRIPTION = eINSTANCE.getYTable_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Selection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTABLE__SELECTION_TYPE = eINSTANCE.getYTable_SelectionType();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTABLE__SELECTION = eINSTANCE.getYTable_Selection();

		/**
		 * The meta object literal for the '<em><b>Multi Selection</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTABLE__MULTI_SELECTION = eINSTANCE.getYTable_MultiSelection();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTABLE__COLLECTION = eINSTANCE.getYTable_Collection();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTABLE__TYPE = eINSTANCE.getYTable_Type();

		/**
		 * The meta object literal for the '<em><b>Emf Ns URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTABLE__EMF_NS_URI = eINSTANCE.getYTable_EmfNsURI();

		/**
		 * The meta object literal for the '<em><b>Type Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTABLE__TYPE_QUALIFIED_NAME = eINSTANCE.getYTable_TypeQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTABLE__COLUMNS = eINSTANCE.getYTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Item Image Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTABLE__ITEM_IMAGE_PROPERTY = eINSTANCE.getYTable_ItemImageProperty();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YColumnImpl <em>YColumn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YColumnImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYColumn()
		 * @generated
		 */
		EClass YCOLUMN = eINSTANCE.getYColumn();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCOLUMN__ICON = eINSTANCE.getYColumn_Icon();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCOLUMN__VISIBLE = eINSTANCE.getYColumn_Visible();

		/**
		 * The meta object literal for the '<em><b>Orderable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCOLUMN__ORDERABLE = eINSTANCE.getYColumn_Orderable();

		/**
		 * The meta object literal for the '<em><b>Collapsed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCOLUMN__COLLAPSED = eINSTANCE.getYColumn_Collapsed();

		/**
		 * The meta object literal for the '<em><b>Collapsible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCOLUMN__COLLAPSIBLE = eINSTANCE.getYColumn_Collapsible();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCOLUMN__ALIGNMENT = eINSTANCE.getYColumn_Alignment();

		/**
		 * The meta object literal for the '<em><b>Expand Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCOLUMN__EXPAND_RATIO = eINSTANCE.getYColumn_ExpandRatio();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YLabelImpl <em>YLabel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YLabelImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYLabel()
		 * @generated
		 */
		EClass YLABEL = eINSTANCE.getYLabel();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YLABEL__DATADESCRIPTION = eINSTANCE.getYLabel_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YLABEL__VALUE = eINSTANCE.getYLabel_Value();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YImageImpl <em>YImage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YImageImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYImage()
		 * @generated
		 */
		EClass YIMAGE = eINSTANCE.getYImage();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YIMAGE__DATADESCRIPTION = eINSTANCE.getYImage_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YIMAGE__VALUE = eINSTANCE.getYImage_Value();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YTextAreaImpl <em>YText Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YTextAreaImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYTextArea()
		 * @generated
		 */
		EClass YTEXT_AREA = eINSTANCE.getYTextArea();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTEXT_AREA__DATADESCRIPTION = eINSTANCE.getYTextArea_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTEXT_AREA__DATATYPE = eINSTANCE.getYTextArea_Datatype();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTEXT_AREA__VALUE = eINSTANCE.getYTextArea_Value();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YCheckBoxImpl <em>YCheck Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YCheckBoxImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYCheckBox()
		 * @generated
		 */
		EClass YCHECK_BOX = eINSTANCE.getYCheckBox();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCHECK_BOX__DATADESCRIPTION = eINSTANCE.getYCheckBox_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCHECK_BOX__DATATYPE = eINSTANCE.getYCheckBox_Datatype();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCHECK_BOX__VALUE = eINSTANCE.getYCheckBox_Value();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YBrowserImpl <em>YBrowser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YBrowserImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYBrowser()
		 * @generated
		 */
		EClass YBROWSER = eINSTANCE.getYBrowser();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YBROWSER__DATATYPE = eINSTANCE.getYBrowser_Datatype();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YBROWSER__DATADESCRIPTION = eINSTANCE.getYBrowser_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YBROWSER__VALUE = eINSTANCE.getYBrowser_Value();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YDateTimeImpl <em>YDate Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YDateTimeImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYDateTime()
		 * @generated
		 */
		EClass YDATE_TIME = eINSTANCE.getYDateTime();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YDATE_TIME__DATATYPE = eINSTANCE.getYDateTime_Datatype();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YDATE_TIME__DATADESCRIPTION = eINSTANCE.getYDateTime_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDATE_TIME__VALUE = eINSTANCE.getYDateTime_Value();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YInputImpl <em>YInput</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YInputImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYInput()
		 * @generated
		 */
		EClass YINPUT = eINSTANCE.getYInput();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YDecimalFieldImpl <em>YDecimal Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YDecimalFieldImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYDecimalField()
		 * @generated
		 */
		EClass YDECIMAL_FIELD = eINSTANCE.getYDecimalField();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YDECIMAL_FIELD__DATATYPE = eINSTANCE.getYDecimalField_Datatype();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YDECIMAL_FIELD__DATADESCRIPTION = eINSTANCE.getYDecimalField_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YDECIMAL_FIELD__VALUE = eINSTANCE.getYDecimalField_Value();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YNumericFieldImpl <em>YNumeric Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YNumericFieldImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYNumericField()
		 * @generated
		 */
		EClass YNUMERIC_FIELD = eINSTANCE.getYNumericField();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YNUMERIC_FIELD__DATATYPE = eINSTANCE.getYNumericField_Datatype();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YNUMERIC_FIELD__DATADESCRIPTION = eINSTANCE.getYNumericField_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YNUMERIC_FIELD__VALUE = eINSTANCE.getYNumericField_Value();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YComboBoxImpl <em>YCombo Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YComboBoxImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYComboBox()
		 * @generated
		 */
		EClass YCOMBO_BOX = eINSTANCE.getYComboBox();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCOMBO_BOX__DATADESCRIPTION = eINSTANCE.getYComboBox_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YCOMBO_BOX__DATATYPE = eINSTANCE.getYComboBox_Datatype();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCOMBO_BOX__SELECTION = eINSTANCE.getYComboBox_Selection();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCOMBO_BOX__COLLECTION = eINSTANCE.getYComboBox_Collection();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCOMBO_BOX__TYPE = eINSTANCE.getYComboBox_Type();

		/**
		 * The meta object literal for the '<em><b>Emf Ns URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCOMBO_BOX__EMF_NS_URI = eINSTANCE.getYComboBox_EmfNsURI();

		/**
		 * The meta object literal for the '<em><b>Type Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCOMBO_BOX__TYPE_QUALIFIED_NAME = eINSTANCE.getYComboBox_TypeQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Item Caption Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCOMBO_BOX__ITEM_CAPTION_PROPERTY = eINSTANCE.getYComboBox_ItemCaptionProperty();

		/**
		 * The meta object literal for the '<em><b>Item Image Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YCOMBO_BOX__ITEM_IMAGE_PROPERTY = eINSTANCE.getYComboBox_ItemImageProperty();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YListImpl <em>YList</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YListImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYList()
		 * @generated
		 */
		EClass YLIST = eINSTANCE.getYList();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YLIST__DATADESCRIPTION = eINSTANCE.getYList_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YLIST__DATATYPE = eINSTANCE.getYList_Datatype();

		/**
		 * The meta object literal for the '<em><b>Selection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YLIST__SELECTION_TYPE = eINSTANCE.getYList_SelectionType();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YLIST__SELECTION = eINSTANCE.getYList_Selection();

		/**
		 * The meta object literal for the '<em><b>Multi Selection</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YLIST__MULTI_SELECTION = eINSTANCE.getYList_MultiSelection();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YLIST__COLLECTION = eINSTANCE.getYList_Collection();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YLIST__TYPE = eINSTANCE.getYList_Type();

		/**
		 * The meta object literal for the '<em><b>Emf Ns URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YLIST__EMF_NS_URI = eINSTANCE.getYList_EmfNsURI();

		/**
		 * The meta object literal for the '<em><b>Type Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YLIST__TYPE_QUALIFIED_NAME = eINSTANCE.getYList_TypeQualifiedName();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YButtonImpl <em>YButton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YButtonImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYButton()
		 * @generated
		 */
		EClass YBUTTON = eINSTANCE.getYButton();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YBUTTON__DATADESCRIPTION = eINSTANCE.getYButton_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Click Listeners</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YBUTTON__CLICK_LISTENERS = eINSTANCE.getYButton_ClickListeners();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YToggleButtonImpl <em>YToggle Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YToggleButtonImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYToggleButton()
		 * @generated
		 */
		EClass YTOGGLE_BUTTON = eINSTANCE.getYToggleButton();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTOGGLE_BUTTON__DATADESCRIPTION = eINSTANCE.getYToggleButton_Datadescription();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YProgressBarImpl <em>YProgress Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YProgressBarImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYProgressBar()
		 * @generated
		 */
		EClass YPROGRESS_BAR = eINSTANCE.getYProgressBar();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROGRESS_BAR__DATATYPE = eINSTANCE.getYProgressBar_Datatype();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YPROGRESS_BAR__DATADESCRIPTION = eINSTANCE.getYProgressBar_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YPROGRESS_BAR__VALUE = eINSTANCE.getYProgressBar_Value();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YTabSheetImpl <em>YTab Sheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YTabSheetImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYTabSheet()
		 * @generated
		 */
		EClass YTAB_SHEET = eINSTANCE.getYTabSheet();

		/**
		 * The meta object literal for the '<em><b>Tabs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTAB_SHEET__TABS = eINSTANCE.getYTabSheet_Tabs();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YTabImpl <em>YTab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YTabImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYTab()
		 * @generated
		 */
		EClass YTAB = eINSTANCE.getYTab();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTAB__PARENT = eINSTANCE.getYTab_Parent();

		/**
		 * The meta object literal for the '<em><b>Embeddable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTAB__EMBEDDABLE = eINSTANCE.getYTab_Embeddable();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTAB__DATADESCRIPTION = eINSTANCE.getYTab_Datadescription();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YMasterDetailImpl <em>YMaster Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YMasterDetailImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYMasterDetail()
		 * @generated
		 */
		EClass YMASTER_DETAIL = eINSTANCE.getYMasterDetail();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YMASTER_DETAIL__DATATYPE = eINSTANCE.getYMasterDetail_Datatype();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YMASTER_DETAIL__DATADESCRIPTION = eINSTANCE.getYMasterDetail_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YMASTER_DETAIL__SELECTION = eINSTANCE.getYMasterDetail_Selection();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YMASTER_DETAIL__COLLECTION = eINSTANCE.getYMasterDetail_Collection();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YMASTER_DETAIL__TYPE = eINSTANCE.getYMasterDetail_Type();

		/**
		 * The meta object literal for the '<em><b>Emf Ns URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YMASTER_DETAIL__EMF_NS_URI = eINSTANCE.getYMasterDetail_EmfNsURI();

		/**
		 * The meta object literal for the '<em><b>Master Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YMASTER_DETAIL__MASTER_ELEMENT = eINSTANCE.getYMasterDetail_MasterElement();

		/**
		 * The meta object literal for the '<em><b>Detail Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YMASTER_DETAIL__DETAIL_ELEMENT = eINSTANCE.getYMasterDetail_DetailElement();

		/**
		 * The meta object literal for the '<em><b>Type Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YMASTER_DETAIL__TYPE_QUALIFIED_NAME = eINSTANCE.getYMasterDetail_TypeQualifiedName();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YFormLayoutImpl <em>YForm Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YFormLayoutImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYFormLayout()
		 * @generated
		 */
		EClass YFORM_LAYOUT = eINSTANCE.getYFormLayout();

		/**
		 * The meta object literal for the '<em><b>Cell Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YFORM_LAYOUT__CELL_STYLES = eINSTANCE.getYFormLayout_CellStyles();

		/**
		 * The meta object literal for the '<em><b>Fill Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YFORM_LAYOUT__FILL_VERTICAL = eINSTANCE.getYFormLayout_FillVertical();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YFormLayoutCellStyleImpl <em>YForm Layout Cell Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YFormLayoutCellStyleImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYFormLayoutCellStyle()
		 * @generated
		 */
		EClass YFORM_LAYOUT_CELL_STYLE = eINSTANCE.getYFormLayoutCellStyle();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YFORM_LAYOUT_CELL_STYLE__TARGET = eINSTANCE.getYFormLayoutCellStyle_Target();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YFORM_LAYOUT_CELL_STYLE__ALIGNMENT = eINSTANCE.getYFormLayoutCellStyle_Alignment();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YTextSearchFieldImpl <em>YText Search Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YTextSearchFieldImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYTextSearchField()
		 * @generated
		 */
		EClass YTEXT_SEARCH_FIELD = eINSTANCE.getYTextSearchField();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTEXT_SEARCH_FIELD__DATADESCRIPTION = eINSTANCE.getYTextSearchField_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTEXT_SEARCH_FIELD__VALUE = eINSTANCE.getYTextSearchField_Value();

		/**
		 * The meta object literal for the '<em><b>Wildcard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTEXT_SEARCH_FIELD__WILDCARD = eINSTANCE.getYTextSearchField_Wildcard();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YBooleanSearchFieldImpl <em>YBoolean Search Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YBooleanSearchFieldImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYBooleanSearchField()
		 * @generated
		 */
		EClass YBOOLEAN_SEARCH_FIELD = eINSTANCE.getYBooleanSearchField();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YBOOLEAN_SEARCH_FIELD__DATADESCRIPTION = eINSTANCE.getYBooleanSearchField_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YBOOLEAN_SEARCH_FIELD__VALUE = eINSTANCE.getYBooleanSearchField_Value();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YNumericSearchFieldImpl <em>YNumeric Search Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YNumericSearchFieldImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYNumericSearchField()
		 * @generated
		 */
		EClass YNUMERIC_SEARCH_FIELD = eINSTANCE.getYNumericSearchField();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YNUMERIC_SEARCH_FIELD__DATADESCRIPTION = eINSTANCE.getYNumericSearchField_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YNUMERIC_SEARCH_FIELD__VALUE = eINSTANCE.getYNumericSearchField_Value();

		/**
		 * The meta object literal for the '<em><b>Wildcard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YNUMERIC_SEARCH_FIELD__WILDCARD = eINSTANCE.getYNumericSearchField_Wildcard();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YTreeImpl <em>YTree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YTreeImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYTree()
		 * @generated
		 */
		EClass YTREE = eINSTANCE.getYTree();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTREE__DATATYPE = eINSTANCE.getYTree_Datatype();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YTREE__DATADESCRIPTION = eINSTANCE.getYTree_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Selection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTREE__SELECTION_TYPE = eINSTANCE.getYTree_SelectionType();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTREE__SELECTION = eINSTANCE.getYTree_Selection();

		/**
		 * The meta object literal for the '<em><b>Multi Selection</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTREE__MULTI_SELECTION = eINSTANCE.getYTree_MultiSelection();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTREE__COLLECTION = eINSTANCE.getYTree_Collection();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTREE__TYPE = eINSTANCE.getYTree_Type();

		/**
		 * The meta object literal for the '<em><b>Emf Ns URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTREE__EMF_NS_URI = eINSTANCE.getYTree_EmfNsURI();

		/**
		 * The meta object literal for the '<em><b>Type Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YTREE__TYPE_QUALIFIED_NAME = eINSTANCE.getYTree_TypeQualifiedName();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.impl.YOptionsGroupImpl <em>YOptions Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.YOptionsGroupImpl
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYOptionsGroup()
		 * @generated
		 */
		EClass YOPTIONS_GROUP = eINSTANCE.getYOptionsGroup();

		/**
		 * The meta object literal for the '<em><b>Datadescription</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YOPTIONS_GROUP__DATADESCRIPTION = eINSTANCE.getYOptionsGroup_Datadescription();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YOPTIONS_GROUP__DATATYPE = eINSTANCE.getYOptionsGroup_Datatype();

		/**
		 * The meta object literal for the '<em><b>Selection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YOPTIONS_GROUP__SELECTION_TYPE = eINSTANCE.getYOptionsGroup_SelectionType();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YOPTIONS_GROUP__SELECTION = eINSTANCE.getYOptionsGroup_Selection();

		/**
		 * The meta object literal for the '<em><b>Multi Selection</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YOPTIONS_GROUP__MULTI_SELECTION = eINSTANCE.getYOptionsGroup_MultiSelection();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YOPTIONS_GROUP__COLLECTION = eINSTANCE.getYOptionsGroup_Collection();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YOPTIONS_GROUP__TYPE = eINSTANCE.getYOptionsGroup_Type();

		/**
		 * The meta object literal for the '<em><b>Emf Ns URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YOPTIONS_GROUP__EMF_NS_URI = eINSTANCE.getYOptionsGroup_EmfNsURI();

		/**
		 * The meta object literal for the '<em><b>Type Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YOPTIONS_GROUP__TYPE_QUALIFIED_NAME = eINSTANCE.getYOptionsGroup_TypeQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Item Caption Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YOPTIONS_GROUP__ITEM_CAPTION_PROPERTY = eINSTANCE.getYOptionsGroup_ItemCaptionProperty();

		/**
		 * The meta object literal for the '<em><b>Item Image Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YOPTIONS_GROUP__ITEM_IMAGE_PROPERTY = eINSTANCE.getYOptionsGroup_ItemImageProperty();

		/**
		 * The meta object literal for the '<em>YButton Click Listener</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.listener.YButtonClickListener
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYButtonClickListener()
		 * @generated
		 */
		EDataType YBUTTON_CLICK_LISTENER = eINSTANCE.getYButtonClickListener();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.YAlignment <em>YAlignment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.YAlignment
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYAlignment()
		 * @generated
		 */
		EEnum YALIGNMENT = eINSTANCE.getYAlignment();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.YFlatAlignment <em>YFlat Alignment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.YFlatAlignment
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYFlatAlignment()
		 * @generated
		 */
		EEnum YFLAT_ALIGNMENT = eINSTANCE.getYFlatAlignment();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.YSelectionType <em>YSelection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.YSelectionType
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYSelectionType()
		 * @generated
		 */
		EEnum YSELECTION_TYPE = eINSTANCE.getYSelectionType();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.YBooleanSearchOption <em>YBoolean Search Option</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.YBooleanSearchOption
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYBooleanSearchOption()
		 * @generated
		 */
		EEnum YBOOLEAN_SEARCH_OPTION = eINSTANCE.getYBooleanSearchOption();

		/**
		 * The meta object literal for the '{@link org.lunifera.ecview.core.extension.model.extension.YSearchWildcards <em>YSearch Wildcards</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.ecview.core.extension.model.extension.YSearchWildcards
		 * @see org.lunifera.ecview.core.extension.model.extension.impl.ExtensionModelPackageImpl#getYSearchWildcards()
		 * @generated
		 */
		EEnum YSEARCH_WILDCARDS = eINSTANCE.getYSearchWildcards();

	}

} //ExtensionModelPackage