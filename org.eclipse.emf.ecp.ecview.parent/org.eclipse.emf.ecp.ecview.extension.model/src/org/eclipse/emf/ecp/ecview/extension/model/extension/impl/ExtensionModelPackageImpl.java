/**
 */
package org.eclipse.emf.ecp.ecview.extension.model.extension.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage;
import org.eclipse.emf.ecp.ecview.common.model.core.CoreModelPackage;
import org.eclipse.emf.ecp.ecview.common.model.datatypes.DatatypesPackage;
import org.eclipse.emf.ecp.ecview.common.model.validation.ValidationPackage;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.ExtDatatypesPackage;
import org.eclipse.emf.ecp.ecview.extension.model.datatypes.impl.ExtDatatypesPackageImpl;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YAlignment;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YBrowser;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YButton;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YCheckBox;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YComboBox;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YDateTime;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YDecimalField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YGridLayoutCellStyle;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YHorizontalLayoutCellStyle;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YInput;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YLabel;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YList;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YNumericField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YOptionsGroup;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YProgressBar;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YSelectionType;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YSpanInfo;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTab;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTabSheet;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTable;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextArea;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTextField;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YToggleButton;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YTree;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayout;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YVerticalLayoutCellStyle;
import org.eclipse.emf.ecp.ecview.extension.model.extension.listener.YButtonClickListener;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtensionModelPackageImpl extends EPackageImpl implements ExtensionModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yTextFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yGridLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yGridLayoutCellStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yHorizontalLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yHorizontalLayoutCellStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yVerticalLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yVerticalLayoutCellStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ySpanInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yTextAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yCheckBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yBrowserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yDateTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yDecimalFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yNumericFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yComboBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yToggleButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yProgressBarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yTabSheetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yTabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yTreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yOptionsGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yAlignmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ySelectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType yButtonClickListenerEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.ecp.ecview.extension.model.extension.ExtensionModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExtensionModelPackageImpl() {
		super(eNS_URI, ExtensionModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ExtensionModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExtensionModelPackage init() {
		if (isInited) return (ExtensionModelPackage)EPackage.Registry.INSTANCE.getEPackage(ExtensionModelPackage.eNS_URI);

		// Obtain or create and register package
		ExtensionModelPackageImpl theExtensionModelPackage = (ExtensionModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExtensionModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExtensionModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CoreModelPackage.eINSTANCE.eClass();
		ValidationPackage.eINSTANCE.eClass();
		BindingPackage.eINSTANCE.eClass();
		DatatypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ExtDatatypesPackageImpl theExtDatatypesPackage = (ExtDatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtDatatypesPackage.eNS_URI) instanceof ExtDatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtDatatypesPackage.eNS_URI) : ExtDatatypesPackage.eINSTANCE);

		// Create package meta-data objects
		theExtensionModelPackage.createPackageContents();
		theExtDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theExtensionModelPackage.initializePackageContents();
		theExtDatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExtensionModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExtensionModelPackage.eNS_URI, theExtensionModelPackage);
		return theExtensionModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYTextField() {
		return yTextFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTextField_Datatype() {
		return (EReference)yTextFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTextField_Datadescription() {
		return (EReference)yTextFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTextField_Value() {
		return (EAttribute)yTextFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYGridLayout() {
		return yGridLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYGridLayout_CellStyles() {
		return (EReference)yGridLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYGridLayout_Columns() {
		return (EAttribute)yGridLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYGridLayout_FillHorizontal() {
		return (EAttribute)yGridLayoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYGridLayout_FillVertical() {
		return (EAttribute)yGridLayoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYGridLayoutCellStyle() {
		return yGridLayoutCellStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYGridLayoutCellStyle_Target() {
		return (EReference)yGridLayoutCellStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYGridLayoutCellStyle_Alignment() {
		return (EAttribute)yGridLayoutCellStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYGridLayoutCellStyle_SpanInfo() {
		return (EReference)yGridLayoutCellStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYHorizontalLayout() {
		return yHorizontalLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYHorizontalLayout_CellStyles() {
		return (EReference)yHorizontalLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYHorizontalLayout_FillHorizontal() {
		return (EAttribute)yHorizontalLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYHorizontalLayoutCellStyle() {
		return yHorizontalLayoutCellStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYHorizontalLayoutCellStyle_Target() {
		return (EReference)yHorizontalLayoutCellStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYHorizontalLayoutCellStyle_Alignment() {
		return (EAttribute)yHorizontalLayoutCellStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYVerticalLayout() {
		return yVerticalLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYVerticalLayout_CellStyles() {
		return (EReference)yVerticalLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVerticalLayout_FillVertical() {
		return (EAttribute)yVerticalLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYVerticalLayoutCellStyle() {
		return yVerticalLayoutCellStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYVerticalLayoutCellStyle_Target() {
		return (EReference)yVerticalLayoutCellStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYVerticalLayoutCellStyle_Alignment() {
		return (EAttribute)yVerticalLayoutCellStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYSpanInfo() {
		return ySpanInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYSpanInfo_ColumnFrom() {
		return (EAttribute)ySpanInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYSpanInfo_RowFrom() {
		return (EAttribute)ySpanInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYSpanInfo_ColumnTo() {
		return (EAttribute)ySpanInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYSpanInfo_RowTo() {
		return (EAttribute)ySpanInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYTable() {
		return yTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTable_Datatype() {
		return (EReference)yTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTable_Datadescription() {
		return (EReference)yTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTable_SelectionType() {
		return (EAttribute)yTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTable_Selection() {
		return (EAttribute)yTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTable_MultiSelection() {
		return (EAttribute)yTableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTable_Collection() {
		return (EAttribute)yTableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTable_Type() {
		return (EAttribute)yTableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYLabel() {
		return yLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYLabel_Datadescription() {
		return (EReference)yLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYLabel_Value() {
		return (EAttribute)yLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYTextArea() {
		return yTextAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTextArea_Datadescription() {
		return (EReference)yTextAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTextArea_Datatype() {
		return (EReference)yTextAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTextArea_Value() {
		return (EAttribute)yTextAreaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYCheckBox() {
		return yCheckBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYCheckBox_Datadescription() {
		return (EReference)yCheckBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYCheckBox_Datatype() {
		return (EReference)yCheckBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYCheckBox_Value() {
		return (EAttribute)yCheckBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYBrowser() {
		return yBrowserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYBrowser_Datatype() {
		return (EReference)yBrowserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYBrowser_Datadescription() {
		return (EReference)yBrowserEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYBrowser_Value() {
		return (EAttribute)yBrowserEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYDateTime() {
		return yDateTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYDateTime_Datatype() {
		return (EReference)yDateTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYDateTime_Datadescription() {
		return (EReference)yDateTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYDateTime_Value() {
		return (EAttribute)yDateTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYInput() {
		return yInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYDecimalField() {
		return yDecimalFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYDecimalField_Datatype() {
		return (EReference)yDecimalFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYDecimalField_Datadescription() {
		return (EReference)yDecimalFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYDecimalField_Value() {
		return (EAttribute)yDecimalFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYNumericField() {
		return yNumericFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYNumericField_Datatype() {
		return (EReference)yNumericFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYNumericField_Datadescription() {
		return (EReference)yNumericFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYNumericField_Value() {
		return (EAttribute)yNumericFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYComboBox() {
		return yComboBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYComboBox_Datadescription() {
		return (EReference)yComboBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYComboBox_Datatype() {
		return (EReference)yComboBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYComboBox_Selection() {
		return (EAttribute)yComboBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYComboBox_Collection() {
		return (EAttribute)yComboBoxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYComboBox_Type() {
		return (EAttribute)yComboBoxEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYList() {
		return yListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYList_Datadescription() {
		return (EReference)yListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYList_Datatype() {
		return (EReference)yListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYList_SelectionType() {
		return (EAttribute)yListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYList_Selection() {
		return (EAttribute)yListEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYList_MultiSelection() {
		return (EAttribute)yListEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYList_Collection() {
		return (EAttribute)yListEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYList_Type() {
		return (EAttribute)yListEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYButton() {
		return yButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYButton_Datadescription() {
		return (EReference)yButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYButton_ClickListeners() {
		return (EAttribute)yButtonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYToggleButton() {
		return yToggleButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYToggleButton_Datadescription() {
		return (EReference)yToggleButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYProgressBar() {
		return yProgressBarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProgressBar_Datatype() {
		return (EReference)yProgressBarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYProgressBar_Datadescription() {
		return (EReference)yProgressBarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYProgressBar_Value() {
		return (EAttribute)yProgressBarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYTabSheet() {
		return yTabSheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTabSheet_Tabs() {
		return (EReference)yTabSheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYTab() {
		return yTabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTab_Parent() {
		return (EReference)yTabEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTab_Embeddable() {
		return (EReference)yTabEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYTree() {
		return yTreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTree_Datatype() {
		return (EReference)yTreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYTree_Datadescription() {
		return (EReference)yTreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTree_SelectionType() {
		return (EAttribute)yTreeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTree_Selection() {
		return (EAttribute)yTreeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTree_MultiSelection() {
		return (EAttribute)yTreeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTree_Collection() {
		return (EAttribute)yTreeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYTree_Type() {
		return (EAttribute)yTreeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYOptionsGroup() {
		return yOptionsGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYOptionsGroup_Datadescription() {
		return (EReference)yOptionsGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYOptionsGroup_Datatype() {
		return (EReference)yOptionsGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOptionsGroup_SelectionType() {
		return (EAttribute)yOptionsGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOptionsGroup_Selection() {
		return (EAttribute)yOptionsGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOptionsGroup_MultiSelection() {
		return (EAttribute)yOptionsGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOptionsGroup_Collection() {
		return (EAttribute)yOptionsGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYOptionsGroup_Type() {
		return (EAttribute)yOptionsGroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getYButtonClickListener() {
		return yButtonClickListenerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYAlignment() {
		return yAlignmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYSelectionType() {
		return ySelectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionModelFactory getExtensionModelFactory() {
		return (ExtensionModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		yInputEClass = createEClass(YINPUT);

		yTextFieldEClass = createEClass(YTEXT_FIELD);
		createEReference(yTextFieldEClass, YTEXT_FIELD__DATATYPE);
		createEReference(yTextFieldEClass, YTEXT_FIELD__DATADESCRIPTION);
		createEAttribute(yTextFieldEClass, YTEXT_FIELD__VALUE);

		yGridLayoutEClass = createEClass(YGRID_LAYOUT);
		createEReference(yGridLayoutEClass, YGRID_LAYOUT__CELL_STYLES);
		createEAttribute(yGridLayoutEClass, YGRID_LAYOUT__COLUMNS);
		createEAttribute(yGridLayoutEClass, YGRID_LAYOUT__FILL_HORIZONTAL);
		createEAttribute(yGridLayoutEClass, YGRID_LAYOUT__FILL_VERTICAL);

		yGridLayoutCellStyleEClass = createEClass(YGRID_LAYOUT_CELL_STYLE);
		createEReference(yGridLayoutCellStyleEClass, YGRID_LAYOUT_CELL_STYLE__TARGET);
		createEAttribute(yGridLayoutCellStyleEClass, YGRID_LAYOUT_CELL_STYLE__ALIGNMENT);
		createEReference(yGridLayoutCellStyleEClass, YGRID_LAYOUT_CELL_STYLE__SPAN_INFO);

		yHorizontalLayoutEClass = createEClass(YHORIZONTAL_LAYOUT);
		createEReference(yHorizontalLayoutEClass, YHORIZONTAL_LAYOUT__CELL_STYLES);
		createEAttribute(yHorizontalLayoutEClass, YHORIZONTAL_LAYOUT__FILL_HORIZONTAL);

		yHorizontalLayoutCellStyleEClass = createEClass(YHORIZONTAL_LAYOUT_CELL_STYLE);
		createEReference(yHorizontalLayoutCellStyleEClass, YHORIZONTAL_LAYOUT_CELL_STYLE__TARGET);
		createEAttribute(yHorizontalLayoutCellStyleEClass, YHORIZONTAL_LAYOUT_CELL_STYLE__ALIGNMENT);

		yVerticalLayoutEClass = createEClass(YVERTICAL_LAYOUT);
		createEReference(yVerticalLayoutEClass, YVERTICAL_LAYOUT__CELL_STYLES);
		createEAttribute(yVerticalLayoutEClass, YVERTICAL_LAYOUT__FILL_VERTICAL);

		yVerticalLayoutCellStyleEClass = createEClass(YVERTICAL_LAYOUT_CELL_STYLE);
		createEReference(yVerticalLayoutCellStyleEClass, YVERTICAL_LAYOUT_CELL_STYLE__TARGET);
		createEAttribute(yVerticalLayoutCellStyleEClass, YVERTICAL_LAYOUT_CELL_STYLE__ALIGNMENT);

		ySpanInfoEClass = createEClass(YSPAN_INFO);
		createEAttribute(ySpanInfoEClass, YSPAN_INFO__COLUMN_FROM);
		createEAttribute(ySpanInfoEClass, YSPAN_INFO__ROW_FROM);
		createEAttribute(ySpanInfoEClass, YSPAN_INFO__COLUMN_TO);
		createEAttribute(ySpanInfoEClass, YSPAN_INFO__ROW_TO);

		yTableEClass = createEClass(YTABLE);
		createEReference(yTableEClass, YTABLE__DATATYPE);
		createEReference(yTableEClass, YTABLE__DATADESCRIPTION);
		createEAttribute(yTableEClass, YTABLE__SELECTION_TYPE);
		createEAttribute(yTableEClass, YTABLE__SELECTION);
		createEAttribute(yTableEClass, YTABLE__MULTI_SELECTION);
		createEAttribute(yTableEClass, YTABLE__COLLECTION);
		createEAttribute(yTableEClass, YTABLE__TYPE);

		yTreeEClass = createEClass(YTREE);
		createEReference(yTreeEClass, YTREE__DATATYPE);
		createEReference(yTreeEClass, YTREE__DATADESCRIPTION);
		createEAttribute(yTreeEClass, YTREE__SELECTION_TYPE);
		createEAttribute(yTreeEClass, YTREE__SELECTION);
		createEAttribute(yTreeEClass, YTREE__MULTI_SELECTION);
		createEAttribute(yTreeEClass, YTREE__COLLECTION);
		createEAttribute(yTreeEClass, YTREE__TYPE);

		yOptionsGroupEClass = createEClass(YOPTIONS_GROUP);
		createEReference(yOptionsGroupEClass, YOPTIONS_GROUP__DATADESCRIPTION);
		createEReference(yOptionsGroupEClass, YOPTIONS_GROUP__DATATYPE);
		createEAttribute(yOptionsGroupEClass, YOPTIONS_GROUP__SELECTION_TYPE);
		createEAttribute(yOptionsGroupEClass, YOPTIONS_GROUP__SELECTION);
		createEAttribute(yOptionsGroupEClass, YOPTIONS_GROUP__MULTI_SELECTION);
		createEAttribute(yOptionsGroupEClass, YOPTIONS_GROUP__COLLECTION);
		createEAttribute(yOptionsGroupEClass, YOPTIONS_GROUP__TYPE);

		yListEClass = createEClass(YLIST);
		createEReference(yListEClass, YLIST__DATADESCRIPTION);
		createEReference(yListEClass, YLIST__DATATYPE);
		createEAttribute(yListEClass, YLIST__SELECTION_TYPE);
		createEAttribute(yListEClass, YLIST__SELECTION);
		createEAttribute(yListEClass, YLIST__MULTI_SELECTION);
		createEAttribute(yListEClass, YLIST__COLLECTION);
		createEAttribute(yListEClass, YLIST__TYPE);

		yLabelEClass = createEClass(YLABEL);
		createEReference(yLabelEClass, YLABEL__DATADESCRIPTION);
		createEAttribute(yLabelEClass, YLABEL__VALUE);

		yTextAreaEClass = createEClass(YTEXT_AREA);
		createEReference(yTextAreaEClass, YTEXT_AREA__DATADESCRIPTION);
		createEReference(yTextAreaEClass, YTEXT_AREA__DATATYPE);
		createEAttribute(yTextAreaEClass, YTEXT_AREA__VALUE);

		yCheckBoxEClass = createEClass(YCHECK_BOX);
		createEReference(yCheckBoxEClass, YCHECK_BOX__DATADESCRIPTION);
		createEReference(yCheckBoxEClass, YCHECK_BOX__DATATYPE);
		createEAttribute(yCheckBoxEClass, YCHECK_BOX__VALUE);

		yBrowserEClass = createEClass(YBROWSER);
		createEReference(yBrowserEClass, YBROWSER__DATATYPE);
		createEReference(yBrowserEClass, YBROWSER__DATADESCRIPTION);
		createEAttribute(yBrowserEClass, YBROWSER__VALUE);

		yDateTimeEClass = createEClass(YDATE_TIME);
		createEReference(yDateTimeEClass, YDATE_TIME__DATATYPE);
		createEReference(yDateTimeEClass, YDATE_TIME__DATADESCRIPTION);
		createEAttribute(yDateTimeEClass, YDATE_TIME__VALUE);

		yDecimalFieldEClass = createEClass(YDECIMAL_FIELD);
		createEReference(yDecimalFieldEClass, YDECIMAL_FIELD__DATATYPE);
		createEReference(yDecimalFieldEClass, YDECIMAL_FIELD__DATADESCRIPTION);
		createEAttribute(yDecimalFieldEClass, YDECIMAL_FIELD__VALUE);

		yNumericFieldEClass = createEClass(YNUMERIC_FIELD);
		createEReference(yNumericFieldEClass, YNUMERIC_FIELD__DATATYPE);
		createEReference(yNumericFieldEClass, YNUMERIC_FIELD__DATADESCRIPTION);
		createEAttribute(yNumericFieldEClass, YNUMERIC_FIELD__VALUE);

		yComboBoxEClass = createEClass(YCOMBO_BOX);
		createEReference(yComboBoxEClass, YCOMBO_BOX__DATADESCRIPTION);
		createEReference(yComboBoxEClass, YCOMBO_BOX__DATATYPE);
		createEAttribute(yComboBoxEClass, YCOMBO_BOX__SELECTION);
		createEAttribute(yComboBoxEClass, YCOMBO_BOX__COLLECTION);
		createEAttribute(yComboBoxEClass, YCOMBO_BOX__TYPE);

		yButtonEClass = createEClass(YBUTTON);
		createEReference(yButtonEClass, YBUTTON__DATADESCRIPTION);
		createEAttribute(yButtonEClass, YBUTTON__CLICK_LISTENERS);

		yToggleButtonEClass = createEClass(YTOGGLE_BUTTON);
		createEReference(yToggleButtonEClass, YTOGGLE_BUTTON__DATADESCRIPTION);

		yProgressBarEClass = createEClass(YPROGRESS_BAR);
		createEReference(yProgressBarEClass, YPROGRESS_BAR__DATATYPE);
		createEReference(yProgressBarEClass, YPROGRESS_BAR__DATADESCRIPTION);
		createEAttribute(yProgressBarEClass, YPROGRESS_BAR__VALUE);

		yTabSheetEClass = createEClass(YTAB_SHEET);
		createEReference(yTabSheetEClass, YTAB_SHEET__TABS);

		yTabEClass = createEClass(YTAB);
		createEReference(yTabEClass, YTAB__PARENT);
		createEReference(yTabEClass, YTAB__EMBEDDABLE);

		// Create enums
		yAlignmentEEnum = createEEnum(YALIGNMENT);
		ySelectionTypeEEnum = createEEnum(YSELECTION_TYPE);

		// Create data types
		yButtonClickListenerEDataType = createEDataType(YBUTTON_CLICK_LISTENER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CoreModelPackage theCoreModelPackage = (CoreModelPackage)EPackage.Registry.INSTANCE.getEPackage(CoreModelPackage.eNS_URI);
		ExtDatatypesPackage theExtDatatypesPackage = (ExtDatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(ExtDatatypesPackage.eNS_URI);
		DatatypesPackage theDatatypesPackage = (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		yInputEClass.getESuperTypes().add(theCoreModelPackage.getYField());
		yTextFieldEClass.getESuperTypes().add(this.getYInput());
		yTextFieldEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yGridLayoutEClass.getESuperTypes().add(theCoreModelPackage.getYLayout());
		yGridLayoutEClass.getESuperTypes().add(theCoreModelPackage.getYSpacingable());
		yGridLayoutEClass.getESuperTypes().add(theCoreModelPackage.getYMarginable());
		yHorizontalLayoutEClass.getESuperTypes().add(theCoreModelPackage.getYLayout());
		yHorizontalLayoutEClass.getESuperTypes().add(theCoreModelPackage.getYSpacingable());
		yHorizontalLayoutEClass.getESuperTypes().add(theCoreModelPackage.getYMarginable());
		yVerticalLayoutEClass.getESuperTypes().add(theCoreModelPackage.getYLayout());
		yVerticalLayoutEClass.getESuperTypes().add(theCoreModelPackage.getYSpacingable());
		yVerticalLayoutEClass.getESuperTypes().add(theCoreModelPackage.getYMarginable());
		yTableEClass.getESuperTypes().add(this.getYInput());
		yTableEClass.getESuperTypes().add(theCoreModelPackage.getYCollectionBindable());
		yTableEClass.getESuperTypes().add(theCoreModelPackage.getYSelectionBindable());
		yTableEClass.getESuperTypes().add(theCoreModelPackage.getYMultiSelectionBindable());
		yTreeEClass.getESuperTypes().add(this.getYInput());
		yTreeEClass.getESuperTypes().add(theCoreModelPackage.getYCollectionBindable());
		yTreeEClass.getESuperTypes().add(theCoreModelPackage.getYSelectionBindable());
		yTreeEClass.getESuperTypes().add(theCoreModelPackage.getYMultiSelectionBindable());
		yOptionsGroupEClass.getESuperTypes().add(this.getYInput());
		yOptionsGroupEClass.getESuperTypes().add(theCoreModelPackage.getYCollectionBindable());
		yOptionsGroupEClass.getESuperTypes().add(theCoreModelPackage.getYSelectionBindable());
		yOptionsGroupEClass.getESuperTypes().add(theCoreModelPackage.getYMultiSelectionBindable());
		yListEClass.getESuperTypes().add(this.getYInput());
		yListEClass.getESuperTypes().add(theCoreModelPackage.getYCollectionBindable());
		yListEClass.getESuperTypes().add(theCoreModelPackage.getYSelectionBindable());
		yListEClass.getESuperTypes().add(theCoreModelPackage.getYMultiSelectionBindable());
		yLabelEClass.getESuperTypes().add(theCoreModelPackage.getYField());
		yLabelEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yTextAreaEClass.getESuperTypes().add(this.getYInput());
		yTextAreaEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yCheckBoxEClass.getESuperTypes().add(this.getYInput());
		yCheckBoxEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yBrowserEClass.getESuperTypes().add(this.getYInput());
		yBrowserEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yDateTimeEClass.getESuperTypes().add(this.getYInput());
		yDateTimeEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yDecimalFieldEClass.getESuperTypes().add(this.getYInput());
		yDecimalFieldEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yNumericFieldEClass.getESuperTypes().add(this.getYInput());
		yNumericFieldEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yComboBoxEClass.getESuperTypes().add(this.getYInput());
		yComboBoxEClass.getESuperTypes().add(theCoreModelPackage.getYCollectionBindable());
		yComboBoxEClass.getESuperTypes().add(theCoreModelPackage.getYSelectionBindable());
		yButtonEClass.getESuperTypes().add(theCoreModelPackage.getYAction());
		yToggleButtonEClass.getESuperTypes().add(theCoreModelPackage.getYAction());
		yToggleButtonEClass.getESuperTypes().add(theCoreModelPackage.getYActivateable());
		yProgressBarEClass.getESuperTypes().add(this.getYInput());
		yProgressBarEClass.getESuperTypes().add(theCoreModelPackage.getYValueBindable());
		yTabSheetEClass.getESuperTypes().add(theCoreModelPackage.getYEmbeddable());
		yTabEClass.getESuperTypes().add(theCoreModelPackage.getYElement());
		yTabEClass.getESuperTypes().add(theCoreModelPackage.getYCssAble());

		// Initialize classes and features; add operations and parameters
		initEClass(yInputEClass, YInput.class, "YInput", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yTextFieldEClass, YTextField.class, "YTextField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYTextField_Datatype(), theExtDatatypesPackage.getYTextDatatype(), null, "datatype", null, 0, 1, YTextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTextField_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YTextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTextField_Value(), ecorePackage.getEString(), "value", null, 0, 1, YTextField.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yGridLayoutEClass, YGridLayout.class, "YGridLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYGridLayout_CellStyles(), this.getYGridLayoutCellStyle(), null, "cellStyles", null, 0, -1, YGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYGridLayout_Columns(), ecorePackage.getEInt(), "columns", null, 0, 1, YGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYGridLayout_FillHorizontal(), ecorePackage.getEBoolean(), "fillHorizontal", "true", 0, 1, YGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYGridLayout_FillVertical(), ecorePackage.getEBoolean(), "fillVertical", "true", 0, 1, YGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(yGridLayoutEClass, this.getYGridLayoutCellStyle(), "addGridLayoutCellStyle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCoreModelPackage.getYEmbeddable(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yGridLayoutCellStyleEClass, YGridLayoutCellStyle.class, "YGridLayoutCellStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYGridLayoutCellStyle_Target(), theCoreModelPackage.getYEmbeddable(), null, "target", null, 1, 1, YGridLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYGridLayoutCellStyle_Alignment(), this.getYAlignment(), "alignment", "UNDEFINED", 0, 1, YGridLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYGridLayoutCellStyle_SpanInfo(), this.getYSpanInfo(), null, "spanInfo", null, 0, 1, YGridLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(yGridLayoutCellStyleEClass, this.getYSpanInfo(), "addSpanInfo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "col1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "row1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "col2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "row2", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yHorizontalLayoutEClass, YHorizontalLayout.class, "YHorizontalLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYHorizontalLayout_CellStyles(), this.getYHorizontalLayoutCellStyle(), null, "cellStyles", null, 0, -1, YHorizontalLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYHorizontalLayout_FillHorizontal(), ecorePackage.getEBoolean(), "fillHorizontal", "true", 0, 1, YHorizontalLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(yHorizontalLayoutEClass, this.getYHorizontalLayoutCellStyle(), "getCellStyle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCoreModelPackage.getYEmbeddable(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yHorizontalLayoutCellStyleEClass, YHorizontalLayoutCellStyle.class, "YHorizontalLayoutCellStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYHorizontalLayoutCellStyle_Target(), theCoreModelPackage.getYEmbeddable(), null, "target", null, 1, 1, YHorizontalLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYHorizontalLayoutCellStyle_Alignment(), this.getYAlignment(), "alignment", "UNDEFINED", 0, 1, YHorizontalLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yVerticalLayoutEClass, YVerticalLayout.class, "YVerticalLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYVerticalLayout_CellStyles(), this.getYVerticalLayoutCellStyle(), null, "cellStyles", null, 0, -1, YVerticalLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVerticalLayout_FillVertical(), ecorePackage.getEBoolean(), "fillVertical", "true", 0, 1, YVerticalLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yVerticalLayoutCellStyleEClass, YVerticalLayoutCellStyle.class, "YVerticalLayoutCellStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYVerticalLayoutCellStyle_Target(), theCoreModelPackage.getYEmbeddable(), null, "target", null, 1, 1, YVerticalLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYVerticalLayoutCellStyle_Alignment(), this.getYAlignment(), "alignment", "UNDEFINED", 0, 1, YVerticalLayoutCellStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ySpanInfoEClass, YSpanInfo.class, "YSpanInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYSpanInfo_ColumnFrom(), ecorePackage.getEInt(), "columnFrom", null, 0, 1, YSpanInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYSpanInfo_RowFrom(), ecorePackage.getEInt(), "rowFrom", null, 0, 1, YSpanInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYSpanInfo_ColumnTo(), ecorePackage.getEInt(), "columnTo", null, 0, 1, YSpanInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYSpanInfo_RowTo(), ecorePackage.getEInt(), "rowTo", null, 0, 1, YSpanInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yTableEClass, YTable.class, "YTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYTable_Datatype(), theExtDatatypesPackage.getYTableDatatype(), null, "datatype", null, 0, 1, YTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTable_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTable_SelectionType(), this.getYSelectionType(), "selectionType", null, 0, 1, YTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTable_Selection(), ecorePackage.getEJavaObject(), "selection", null, 0, 1, YTable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTable_MultiSelection(), ecorePackage.getEJavaObject(), "multiSelection", null, 0, -1, YTable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTable_Collection(), ecorePackage.getEJavaObject(), "collection", null, 0, -1, YTable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYTable_Type(), g1, "type", null, 0, 1, YTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yTreeEClass, YTree.class, "YTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYTree_Datatype(), theExtDatatypesPackage.getYTreeDatatype(), null, "datatype", null, 0, 1, YTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTree_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTree_SelectionType(), this.getYSelectionType(), "selectionType", null, 0, 1, YTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTree_Selection(), ecorePackage.getEJavaObject(), "selection", null, 0, 1, YTree.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTree_MultiSelection(), ecorePackage.getEJavaObject(), "multiSelection", null, 0, -1, YTree.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTree_Collection(), ecorePackage.getEJavaObject(), "collection", null, 0, -1, YTree.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYTree_Type(), g1, "type", null, 0, 1, YTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yOptionsGroupEClass, YOptionsGroup.class, "YOptionsGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYOptionsGroup_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYOptionsGroup_Datatype(), theExtDatatypesPackage.getYOptionsGroupDataType(), null, "datatype", null, 0, 1, YOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYOptionsGroup_SelectionType(), this.getYSelectionType(), "selectionType", null, 0, 1, YOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYOptionsGroup_Selection(), ecorePackage.getEJavaObject(), "selection", null, 0, 1, YOptionsGroup.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYOptionsGroup_MultiSelection(), ecorePackage.getEJavaObject(), "multiSelection", null, 0, -1, YOptionsGroup.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYOptionsGroup_Collection(), ecorePackage.getEJavaObject(), "collection", null, 0, -1, YOptionsGroup.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYOptionsGroup_Type(), g1, "type", null, 0, 1, YOptionsGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yListEClass, YList.class, "YList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYList_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYList_Datatype(), theExtDatatypesPackage.getYListDataType(), null, "datatype", null, 0, 1, YList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYList_SelectionType(), this.getYSelectionType(), "selectionType", null, 0, 1, YList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYList_Selection(), ecorePackage.getEJavaObject(), "selection", null, 0, 1, YList.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYList_MultiSelection(), ecorePackage.getEJavaObject(), "multiSelection", null, 0, -1, YList.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYList_Collection(), ecorePackage.getEJavaObject(), "collection", null, 0, -1, YList.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYList_Type(), g1, "type", null, 0, 1, YList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yLabelEClass, YLabel.class, "YLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYLabel_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYLabel_Value(), ecorePackage.getEString(), "value", null, 0, 1, YLabel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yTextAreaEClass, YTextArea.class, "YTextArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYTextArea_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YTextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTextArea_Datatype(), theExtDatatypesPackage.getYTextAreaDatatype(), null, "datatype", null, 0, 1, YTextArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYTextArea_Value(), ecorePackage.getEString(), "value", null, 0, 1, YTextArea.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yCheckBoxEClass, YCheckBox.class, "YCheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYCheckBox_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YCheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYCheckBox_Datatype(), theExtDatatypesPackage.getYCheckBoxDatatype(), null, "datatype", null, 0, 1, YCheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYCheckBox_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, YCheckBox.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yBrowserEClass, YBrowser.class, "YBrowser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYBrowser_Datatype(), theExtDatatypesPackage.getYBrowserDatatype(), null, "datatype", null, 0, 1, YBrowser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYBrowser_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YBrowser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYBrowser_Value(), ecorePackage.getEString(), "value", null, 0, 1, YBrowser.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yDateTimeEClass, YDateTime.class, "YDateTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYDateTime_Datatype(), theExtDatatypesPackage.getYDateTimeDatatype(), null, "datatype", null, 0, 1, YDateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYDateTime_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YDateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYDateTime_Value(), ecorePackage.getEDate(), "value", null, 0, 1, YDateTime.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yDecimalFieldEClass, YDecimalField.class, "YDecimalField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYDecimalField_Datatype(), theExtDatatypesPackage.getYDecimalDatatype(), null, "datatype", null, 0, 1, YDecimalField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYDecimalField_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YDecimalField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYDecimalField_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, YDecimalField.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yNumericFieldEClass, YNumericField.class, "YNumericField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYNumericField_Datatype(), theExtDatatypesPackage.getYNumericDatatype(), null, "datatype", null, 0, 1, YNumericField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYNumericField_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YNumericField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYNumericField_Value(), ecorePackage.getELong(), "value", null, 0, 1, YNumericField.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yComboBoxEClass, YComboBox.class, "YComboBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYComboBox_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYComboBox_Datatype(), theExtDatatypesPackage.getYComboBoxDatatype(), null, "datatype", null, 0, 1, YComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYComboBox_Selection(), ecorePackage.getEJavaObject(), "selection", null, 0, 1, YComboBox.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYComboBox_Collection(), ecorePackage.getEJavaObject(), "collection", null, 0, -1, YComboBox.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getYComboBox_Type(), g1, "type", null, 0, 1, YComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yButtonEClass, YButton.class, "YButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYButton_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYButton_ClickListeners(), this.getYButtonClickListener(), "clickListeners", null, 0, -1, YButton.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(yButtonEClass, null, "addClickListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYButtonClickListener(), "listener", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(yButtonEClass, null, "removeClickListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getYButtonClickListener(), "listener", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(yToggleButtonEClass, YToggleButton.class, "YToggleButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYToggleButton_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YToggleButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yProgressBarEClass, YProgressBar.class, "YProgressBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYProgressBar_Datatype(), theExtDatatypesPackage.getYProgressBarDatatype(), null, "datatype", null, 0, 1, YProgressBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYProgressBar_Datadescription(), theDatatypesPackage.getYDatadescription(), null, "datadescription", null, 0, 1, YProgressBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getYProgressBar_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, YProgressBar.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yTabSheetEClass, YTabSheet.class, "YTabSheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYTabSheet_Tabs(), this.getYTab(), this.getYTab_Parent(), "tabs", null, 0, -1, YTabSheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yTabEClass, YTab.class, "YTab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getYTab_Parent(), this.getYTabSheet(), this.getYTabSheet_Tabs(), "parent", null, 1, 1, YTab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYTab_Embeddable(), theCoreModelPackage.getYEmbeddable(), null, "embeddable", null, 1, 1, YTab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(yTabEClass, theCoreModelPackage.getYView(), "getView", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(yAlignmentEEnum, YAlignment.class, "YAlignment");
		addEEnumLiteral(yAlignmentEEnum, YAlignment.BOTTOM_LEFT);
		addEEnumLiteral(yAlignmentEEnum, YAlignment.BOTTOM_CENTER);
		addEEnumLiteral(yAlignmentEEnum, YAlignment.BOTTOM_RIGHT);
		addEEnumLiteral(yAlignmentEEnum, YAlignment.BOTTOM_FILL);
		addEEnumLiteral(yAlignmentEEnum, YAlignment.MIDDLE_LEFT);
		addEEnumLiteral(yAlignmentEEnum, YAlignment.MIDDLE_CENTER);
		addEEnumLiteral(yAlignmentEEnum, YAlignment.MIDDLE_RIGHT);
		addEEnumLiteral(yAlignmentEEnum, YAlignment.MIDDLE_FILL);
		addEEnumLiteral(yAlignmentEEnum, YAlignment.TOP_LEFT);
		addEEnumLiteral(yAlignmentEEnum, YAlignment.TOP_CENTER);
		addEEnumLiteral(yAlignmentEEnum, YAlignment.TOP_RIGHT);
		addEEnumLiteral(yAlignmentEEnum, YAlignment.TOP_FILL);
		addEEnumLiteral(yAlignmentEEnum, YAlignment.FILL_FILL);
		addEEnumLiteral(yAlignmentEEnum, YAlignment.FILL_LEFT);
		addEEnumLiteral(yAlignmentEEnum, YAlignment.FILL_CENTER);
		addEEnumLiteral(yAlignmentEEnum, YAlignment.FILL_RIGHT);
		addEEnumLiteral(yAlignmentEEnum, YAlignment.UNDEFINED);

		initEEnum(ySelectionTypeEEnum, YSelectionType.class, "YSelectionType");
		addEEnumLiteral(ySelectionTypeEEnum, YSelectionType.SINGLE);
		addEEnumLiteral(ySelectionTypeEEnum, YSelectionType.MULTI);

		// Initialize data types
		initEDataType(yButtonClickListenerEDataType, YButtonClickListener.class, "YButtonClickListener", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ExtensionModelPackageImpl
