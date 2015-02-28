/**
 * Copyright (c) 2013 COMPEX Systemhaus GmbH Heidelberg. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jose C. Dominguez - initial API and implementation
 */
package org.lunifera.ecview.core.common.context;

import java.util.Locale;

import org.lunifera.ecview.core.common.IAccessible;
import org.lunifera.runtime.common.dispose.IDisposable;

/**
 * Marker interface for context.
 * 
 * @author dominguez
 * 
 */
public interface IContext extends IDisposable, IAccessible {

	/**
	 * Sets the current locale of the view or viewset.
	 * 
	 * @param locale
	 */
	void setLocale(Locale locale);

	/**
	 * Returns the current locale of the view or viewset.
	 * 
	 * @return
	 */
	Locale getLocale();

}