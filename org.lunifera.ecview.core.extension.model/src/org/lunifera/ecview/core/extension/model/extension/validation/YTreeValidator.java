/**
 *
 * $Id$
 */
package org.lunifera.ecview.core.extension.model.extension.validation;

import org.eclipse.emf.common.util.EList;

import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;

import org.lunifera.ecview.core.extension.model.datatypes.YTreeDatatype;

import org.lunifera.ecview.core.extension.model.extension.YSelectionType;

/**
 * A sample validator interface for {@link org.lunifera.ecview.core.extension.model.extension.YTree}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface YTreeValidator {
	boolean validate();

	boolean validateDatatype(YTreeDatatype value);
	boolean validateDatadescription(YDatadescription value);
	boolean validateSelectionType(YSelectionType value);
	boolean validateSelection(Object value);
	boolean validateMultiSelection(EList<Object> value);
	boolean validateCollection(EList<Object> value);
	boolean validateType(Class<?> value);
	boolean validateEmfNsURI(String value);
	boolean validateTypeQualifiedName(String value);
}
