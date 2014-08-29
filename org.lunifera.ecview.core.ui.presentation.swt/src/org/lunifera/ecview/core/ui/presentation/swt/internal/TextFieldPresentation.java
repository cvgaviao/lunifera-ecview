/**
 * Copyright (c) 2012 Lunifera GmbH (Austria) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Florian Pirchner - initial API and implementation
 */
package org.lunifera.ecview.core.ui.presentation.swt.internal;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.lunifera.ecview.core.common.editpart.IElementEditpart;
import org.lunifera.ecview.core.common.model.core.YEmbeddableBindingEndpoint;
import org.lunifera.ecview.core.common.model.core.YEmbeddableValueEndpoint;
import org.lunifera.ecview.core.extension.model.extension.ExtensionModelPackage;
import org.lunifera.ecview.core.extension.model.extension.YTextField;
import org.lunifera.ecview.core.ui.core.editparts.extension.ITextFieldEditpart;
import org.eclipse.riena.ui.ridgets.IMarkableRidget;
import org.eclipse.riena.ui.ridgets.ITextRidget;
import org.eclipse.riena.ui.ridgets.swt.SwtRidgetFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This presenter is responsible to render a text field on the given layout.
 */
public class TextFieldPresentation extends FieldPresentation {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory
			.getLogger(TextFieldPresentation.class);
	private final YTextField yTextField;
	private Composite controlBase;
	private Text text;
	private Label label;
	private ITextRidget textRidget;

	/**
	 * Constructor.
	 * 
	 * @param editpart
	 *            The editpart of that presenter
	 */
	public TextFieldPresentation(IElementEditpart editpart) {
		super((ITextFieldEditpart) editpart);
		this.yTextField = (YTextField) editpart.getModel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Control createWidget(Object parent) {
		if (controlBase == null) {
			controlBase = new Composite((Composite) parent, SWT.NONE);
			controlBase.setLayout(new GridLayout(2, false));
			setCSSClass(controlBase, CSS_CLASS_CONTROL_BASE);
			if (Util.isCssIdValid(yTextField)) {
				setCSSId(controlBase, Util.getCssID(yTextField));
			} else {
				setCSSId(controlBase, getEditpart().getId());
			}

			label = new Label(controlBase, SWT.NONE);
			GridData labelGd = new GridData(SWT.BEGINNING, SWT.TOP, false, true);
			label.setLayoutData(labelGd);
			setCSSClass(label, CSS_CLASS__LABEL);

			text = new Text(controlBase, SWT.BORDER);
			textRidget = (ITextRidget) SwtRidgetFactory.createRidget(text);
			text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

			// update style attributes
			//
			updateStyle();
		}
		return controlBase;
	}

	/**
	 * Updates the control style attributes.
	 */
	private void updateStyle() {
		if (isLabelValid()) {
			label.setText(getLabel());
		}

		if (Util.isCssClassValid(yTextField)) {
			setCSSClass(text, Util.getCssClass(yTextField));
		} else {
			setCSSClass(text, CSS_CLASS_CONTROL);
		}

		// creates the binding for the field
		createBindings(yTextField, textRidget);
	}

	/**
	 * Creates the bindings for the given elements.
	 * 
	 * @param yField
	 * @param ridget
	 */
	protected void createBindings(YTextField yField, IMarkableRidget ridget) {
		// create the model binding from ridget to ECView-model
		createModelBinding(castEObject(getModel()),
				ExtensionModelPackage.Literals.YTEXT_FIELD__VALUE, ridget,
				ITextRidget.PROPERTY_TEXT);

		// do further bindings
		super.createBindings(yField, ridget);
	}

	@Override
	public Control getWidget() {
		return controlBase;
	}

	@Override
	public boolean isRendered() {
		return controlBase != null;
	}

	/**
	 * Returns true, if the label is valid.
	 * 
	 * @return
	 */
	public boolean isLabelValid() {
		return yTextField.getDatadescription() != null
				&& yTextField.getDatadescription().getLabel() != null;
	}

	/**
	 * Returns the label.
	 * 
	 * @return
	 */
	public String getLabel() {
		return yTextField.getDatadescription().getLabel();
	}

	@Override
	protected IObservable internalGetObservableEndpoint(
			YEmbeddableBindingEndpoint bindableValue) {
		if (bindableValue == null) {
			throw new NullPointerException("BindableValue must not be null!");
		}

		if (bindableValue instanceof YEmbeddableValueEndpoint) {
			return internalGetValueEndpoint();
		}
		throw new IllegalArgumentException("Not a valid input: "
				+ bindableValue);
	}

	/**
	 * Returns the observable to observe value.
	 * 
	 * @return
	 */
	protected IObservableValue internalGetValueEndpoint() {
		// return the observable value for text
		return EMFObservables.observeValue(castEObject(getModel()),
				ExtensionModelPackage.Literals.YTEXT_FIELD__VALUE);
	}

	/**
	 * @return the textRidget
	 */
	public ITextRidget getTextRidget() {
		return textRidget;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void unrender() {
		if (controlBase != null) {
			controlBase.dispose();
			controlBase = null;
			text = null;
			textRidget = null;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void internalDispose() {
		super.internalDispose();

		// unrender the ui control
		unrender();
	}
}