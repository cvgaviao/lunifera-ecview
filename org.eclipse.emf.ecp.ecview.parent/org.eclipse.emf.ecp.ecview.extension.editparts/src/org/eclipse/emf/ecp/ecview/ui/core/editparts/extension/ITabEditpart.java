/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.core.editparts.extension;

import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.ILayoutEditpart;
import org.eclipse.emf.ecp.ecview.common.editpart.IViewEditpart;
import org.eclipse.emf.ecp.ecview.common.presentation.IWidgetPresentation;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.presentation.ITabPresentation;

/**
 * The abstraction for a tab.
 */
public interface ITabEditpart extends IElementEditpart {

	/**
	 * Name for "parent" property.
	 */
	String PROP_PARENT = "parent";
	/**
	 * Name for "cssClass" property.
	 */
	String PROP_CSSCLASS = "cssClass";
	/**
	 * Name for "cssID" property.
	 */
	String PROP_CSSID = "cssID";

	/**
	 * Returns the parent of this tab.<br>
	 * Will be <code>null</code> for the layout that is attached to the view as content.
	 * 
	 * @return editpart The parent editpart
	 */
	ITabSheetEditpart getParent();

	/**
	 * Returns the view edit part of this tab edit part.<br>
	 * May be <code>null</code> as far as this element and no of its parents are attached to a view.
	 * 
	 * @return editpart The view editpart
	 */
	IViewEditpart getView();

	/**
	 * Returns the widget presentation for the tab.
	 * 
	 * @param <A> An instance of {@link IWidgetPresentation}
	 * @return presentation The presentation of that tab used to render the UI.
	 */
	<A extends ITabPresentation<?>> A getPresentation();

}
