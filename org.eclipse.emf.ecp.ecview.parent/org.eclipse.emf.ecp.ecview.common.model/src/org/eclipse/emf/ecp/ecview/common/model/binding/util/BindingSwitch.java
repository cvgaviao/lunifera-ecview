/**
 */
package org.eclipse.emf.ecp.ecview.common.model.binding.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindableValue;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBinding;
import org.eclipse.emf.ecp.ecview.common.model.binding.YBindingSet;
import org.eclipse.emf.ecp.ecview.common.model.binding.YContextBindableValue;
import org.eclipse.emf.ecp.ecview.common.model.binding.YEmbeddableBindableValue;
import org.eclipse.emf.ecp.ecview.common.model.core.YElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecp.ecview.common.model.binding.BindingPackage
 * @generated
 */
public class BindingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BindingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingSwitch() {
		if (modelPackage == null) {
			modelPackage = BindingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BindingPackage.YBINDING_SET: {
				YBindingSet yBindingSet = (YBindingSet)theEObject;
				T result = caseYBindingSet(yBindingSet);
				if (result == null) result = caseYElement(yBindingSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BindingPackage.YBINDABLE_VALUE: {
				YBindableValue yBindableValue = (YBindableValue)theEObject;
				T result = caseYBindableValue(yBindableValue);
				if (result == null) result = caseYElement(yBindableValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BindingPackage.YBINDING: {
				YBinding yBinding = (YBinding)theEObject;
				T result = caseYBinding(yBinding);
				if (result == null) result = caseYElement(yBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BindingPackage.YCONTEXT_BINDABLE_VALUE: {
				YContextBindableValue yContextBindableValue = (YContextBindableValue)theEObject;
				T result = caseYContextBindableValue(yContextBindableValue);
				if (result == null) result = caseYBindableValue(yContextBindableValue);
				if (result == null) result = caseYElement(yContextBindableValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BindingPackage.YEMBEDDABLE_BINDABLE_VALUE: {
				YEmbeddableBindableValue yEmbeddableBindableValue = (YEmbeddableBindableValue)theEObject;
				T result = caseYEmbeddableBindableValue(yEmbeddableBindableValue);
				if (result == null) result = caseYBindableValue(yEmbeddableBindableValue);
				if (result == null) result = caseYElement(yEmbeddableBindableValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YBinding Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YBinding Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYBindingSet(YBindingSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YBindable Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YBindable Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYBindableValue(YBindableValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YBinding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YBinding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYBinding(YBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YContext Bindable Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YContext Bindable Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYContextBindableValue(YContextBindableValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YEmbeddable Bindable Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YEmbeddable Bindable Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYEmbeddableBindableValue(YEmbeddableBindableValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YElement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYElement(YElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BindingSwitch