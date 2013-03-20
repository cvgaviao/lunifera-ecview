/**
 * Copyright (c) 2012 Florian Pirchner (Vienna, Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 */
package org.eclipse.emf.ecp.ecview.ui.presentation.swt.internal;

import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.emf.ecp.ecview.common.editpart.IElementEditpart;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableBindingEndpoint;
import org.eclipse.emf.ecp.ecview.common.model.core.YEmbeddableValueEndpoint;
import org.eclipse.emf.ecp.ecview.extension.model.extension.YLabel;
import org.eclipse.emf.ecp.ecview.ui.core.editparts.extension.ILabelEditpart;
import org.eclipse.riena.ui.ridgets.ILabelRidget;
import org.eclipse.riena.ui.ridgets.swt.SwtRidgetFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

/**
 * This presenter is responsible to render a text field on the given layout.
 */
public class LabelPresentation extends AbstractSWTWidgetPresenter {

	private final ModelAccess modelAccess;
	private Composite controlBase;
	private Label label;
	private ILabelRidget labelRidget;

	/**
	 * Constructor.
	 * 
	 * @param editpart
	 *            The editpart of that presenter
	 */
	public LabelPresentation(IElementEditpart editpart) {
		super((ILabelEditpart) editpart);
		this.modelAccess = new ModelAccess((YLabel) editpart.getModel());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Control createWidget(Object parent) {
		if (controlBase == null) {
			controlBase = new Composite((Composite) parent, SWT.NONE);
			controlBase.setLayout(new GridLayout(1, false));
			setCSSClass(controlBase, CSS_CLASS__CONTROL_BASE);
			if (modelAccess.isCssIdValid()) {
				setCSSId(controlBase, modelAccess.getCssID());
			} else {
				setCSSId(controlBase, getEditpart().getId());
			}

			label = new Label(controlBase, SWT.NONE);
			labelRidget = (ILabelRidget) SwtRidgetFactory.createRidget(label);
			label.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

			setCSSClass(label, CSS_CLASS__LABEL);

			if (modelAccess.isCssClassValid()) {
				setCSSClass(label, modelAccess.getCssClass());
			} else {
				setCSSClass(label, CSS_CLASS__CONTROL);
			}

			if (modelAccess.isLabelValid()) {
				label.setText(modelAccess.getLabel());
			}
		}
		return controlBase;
	}

	@Override
	public Control getWidget() {
		return controlBase;
	}

	/**
	 * Returns the label ridget.
	 * 
	 * @return
	 */
	public ILabelRidget getRidget() {
		return labelRidget;
	}

	@Override
	public boolean isRendered() {
		return controlBase != null;
	}

	@Override
	protected IObservable internalGetObservableValue(
			YEmbeddableBindingEndpoint bindableValue) {
		if (bindableValue == null) {
			throw new NullPointerException("BindableValue must not be null!");
		}

		if (bindableValue instanceof YEmbeddableValueEndpoint) {
			// return the observable value for text
			return BeansObservables.observeValue(labelRidget,
					ILabelRidget.PROPERTY_TEXT);
		}
		throw new IllegalArgumentException("Not a valid input: "
				+ bindableValue);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void unrender() {
		if (controlBase != null) {
			controlBase.dispose();
			controlBase = null;
			label = null;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalDispose() {
		// unrender the ui control
		unrender();
	}

	/**
	 * A helper class.
	 */
	private static class ModelAccess {
		private final YLabel yUiLabel;

		public ModelAccess(YLabel yUiLabel) {
			super();
			this.yUiLabel = yUiLabel;
		}

		/**
		 * @return
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YCssAble#getCssClass()
		 */
		public String getCssClass() {
			return yUiLabel.getCssClass();
		}

		/**
		 * Returns true, if the css class is not null and not empty.
		 * 
		 * @return
		 */
		public boolean isCssClassValid() {
			return getCssClass() != null && !getCssClass().equals("");
		}

		/**
		 * @return
		 * @see org.eclipse.emf.ecp.ui.model.core.uimodel.YCssAble#getCssID()
		 */
		public String getCssID() {
			return yUiLabel.getCssID();
		}

		/**
		 * Returns true, if the css id is not null and not empty.
		 * 
		 * @return
		 */
		public boolean isCssIdValid() {
			return getCssID() != null && !getCssID().equals("");
		}

		/**
		 * Returns true, if the label is valid.
		 * 
		 * @return
		 */
		public boolean isLabelValid() {
			return yUiLabel.getDatadescription() != null
					&& yUiLabel.getDatadescription().getLabel() != null;
		}

		/**
		 * Returns the label.
		 * 
		 * @return
		 */
		public String getLabel() {
			return yUiLabel.getDatadescription().getLabel();
		}
	}

}
