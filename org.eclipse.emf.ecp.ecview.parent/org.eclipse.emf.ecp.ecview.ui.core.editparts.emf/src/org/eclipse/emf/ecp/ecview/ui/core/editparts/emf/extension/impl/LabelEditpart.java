/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.core.editparts.emf.extension.impl;

import org.eclipse.emf.ecp.ecview.ui.core.model.extension.ExtensionModelFactory;
import org.eclipse.emf.ecp.ecview.ui.core.model.extension.YLabel;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.emf.impl.FieldEditpart;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ILabelEditpart;

/**
 * The implementation of the IUiLabelEditpart.
 */
public class LabelEditpart extends FieldEditpart<YLabel> implements
		ILabelEditpart {

	@Override
	protected YLabel createModel() {
		return (YLabel) ExtensionModelFactory.eINSTANCE.createYLabel();
	}

}
