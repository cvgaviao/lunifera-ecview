/**
 *
 * $Id$
 */
package org.lunifera.ecview.core.extension.model.extension.validation;

import org.lunifera.ecview.core.extension.model.extension.YFlatAlignment;


/**
 * A sample validator interface for {@link org.lunifera.ecview.core.extension.model.extension.YColumn}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface YColumnValidator {
	boolean validate();

	boolean validateIcon(String value);
	boolean validateVisible(boolean value);
	boolean validateOrderable(boolean value);

	boolean validateCollapsed(boolean value);

	boolean validateCollapsible(boolean value);

	boolean validateAlignment(YFlatAlignment value);

	boolean validateExpandRatio(float value);
}