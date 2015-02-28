/**
 *
 * $Id$
 */
package org.lunifera.ecview.core.extension.model.extension.validation;

import org.lunifera.ecview.core.common.model.binding.YValueBindingEndpoint;

/**
 * A sample validator interface for {@link org.lunifera.ecview.core.extension.model.extension.YSetNewInstanceToBeanslotCommand}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface YSetNewInstanceToBeanslotCommandValidator {
	boolean validate();

	boolean validateTarget(YValueBindingEndpoint value);
	boolean validateTrigger(Object value);
	boolean validateType(Class<?> value);
	boolean validateEmfNsURI(String value);
	boolean validateTypeQualifiedName(String value);
}
