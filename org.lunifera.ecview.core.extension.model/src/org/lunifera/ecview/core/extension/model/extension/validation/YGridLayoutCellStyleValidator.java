/**
 *
 * $Id$
 */
package org.lunifera.ecview.core.extension.model.extension.validation;

import org.lunifera.ecview.core.common.model.core.YAlignment;
import org.lunifera.ecview.core.common.model.core.YEmbeddable;

import org.lunifera.ecview.core.extension.model.extension.YSpanInfo;

/**
 * A sample validator interface for {@link org.lunifera.ecview.core.extension.model.extension.YGridLayoutCellStyle}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface YGridLayoutCellStyleValidator {
	boolean validate();

	boolean validateTarget(YEmbeddable value);
	boolean validateAlignment(YAlignment value);
	boolean validateSpanInfo(YSpanInfo value);
}
