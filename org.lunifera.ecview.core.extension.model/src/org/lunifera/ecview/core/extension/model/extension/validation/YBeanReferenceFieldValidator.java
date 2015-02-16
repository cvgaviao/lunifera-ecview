/**
 *
 * $Id$
 */
package org.lunifera.ecview.core.extension.model.extension.validation;

import org.lunifera.ecview.core.common.model.datatypes.YDatadescription;

/**
 * A sample validator interface for {@link org.lunifera.ecview.core.extension.model.extension.YBeanReferenceField}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface YBeanReferenceFieldValidator {
	boolean validate();

	boolean validateDatadescription(YDatadescription value);
	boolean validateValue(Object value);
	boolean validateType(Class<?> value);
	boolean validateEmfNsURI(String value);
	boolean validateTypeQualifiedName(String value);

	boolean validateInMemoryBeanProvider(Class<?> value);

	boolean validateInMemoryBeanProviderQualifiedName(String value);

	boolean validateInMemoryService(Class<?> value);

	boolean validateInMemoryServiceQualifiedName(String value);

	boolean validateCaptionPropertyPath(String value);

	boolean validateImagePropertyPath(String value);

	boolean validateDescriptionProperty(String value);

	boolean validateDescription(String value);

	boolean validateReferenceSourceType(Class<?> value);

	boolean validateReferenceSourceTypeQualifiedName(String value);

	boolean validateReferenceSourceTypeProperty(String value);
}
