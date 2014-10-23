package org.lunifera.runtime.web.vaadin.components.fields.client;

import org.lunifera.runtime.web.vaadin.components.fields.EntityField;
import org.lunifera.runtime.web.vaadin.components.fields.shared.EntityFieldState;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.VTooltip;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.ui.AbstractFieldConnector;
import com.vaadin.client.ui.Icon;
import com.vaadin.client.ui.ShortcutActionHandler.ShortcutActionHandlerOwner;
import com.vaadin.shared.communication.FieldRpc.FocusAndBlurServerRpc;
import com.vaadin.shared.ui.Connect;

@Connect(EntityField.class)
public class EntityFieldConnector extends AbstractFieldConnector implements
		FocusHandler, BlurHandler, ClickHandler, ChangeHandler, KeyDownHandler,
		MouseUpHandler {

	private ShortcutActionHandlerOwner hasShortcutActionHandler;

	@Override
	public boolean delegateCaptionHandling() {
		return false;
	}

	@Override
	protected void init() {
		super.init();
		getWidget().init(this);
		getWidget().client = getConnection();
		getWidget().id = getConnectorId();
	}

	@Override
	public void onStateChanged(StateChangeEvent stateChangeEvent) {
		super.onStateChanged(stateChangeEvent);

		if (null != getState().errorMessage) {

			if (getWidget().errorIndicatorElement == null) {
				getWidget().errorIndicatorElement = DOM.createSpan();
				getWidget().errorIndicatorElement.setInnerHTML("&nbsp;");
				DOM.setElementProperty(getWidget().errorIndicatorElement,
						"className", "v-errorindicator");
				DOM.appendChild(getWidget().getElement(),
						getWidget().errorIndicatorElement);
				DOM.sinkEvents(getWidget().errorIndicatorElement,
						VTooltip.TOOLTIP_EVENTS | Event.ONCLICK);
			} else {
				DOM.setStyleAttribute(getWidget().errorIndicatorElement,
						"display", "");
			}
		} else if (getWidget().errorIndicatorElement != null) {
			DOM.setStyleAttribute(getWidget().errorIndicatorElement, "display",
					"none");

		}

		if (isReadOnly()) {
			getWidget().setEditable(false);
		}

		if (getIcon() != null) {
			if (getWidget().icon == null) {
				getWidget().icon = new Icon(getConnection());
				DOM.insertChild(getWidget().getElement(),
						getWidget().icon.getElement(), 1);
				getWidget().icon.sinkEvents(VTooltip.TOOLTIP_EVENTS);
				getWidget().icon.sinkEvents(Event.ONCLICK);
			}
			getWidget().icon.setUri(getIcon());
		} else if (getWidget().icon != null) {
			// detach icon
			DOM.removeChild(getWidget().getElement(),
					getWidget().icon.getElement());
			getWidget().icon = null;
		}

		// Set text
		getWidget().entityNumber = getState().entityNumber;
		getWidget().entityDescription = getState().entityDescription;
		getWidget().entityId = getState().entityId;
		getWidget().immediate = getState().immediate;
	}

	@Override
	public EntityFieldState getState() {
		return (EntityFieldState) super.getState();
	}

	@Override
	public VEntityField getWidget() {
		return (VEntityField) super.getWidget();
	}

	@Override
	public void onFocus(FocusEvent event) {
		// EventHelper.updateFocusHandler ensures that this is called only when
		// there is a listener on server side
		getRpcProxy(FocusAndBlurServerRpc.class).focus();
	}

	@Override
	public void onBlur(BlurEvent event) {
		// EventHelper.updateFocusHandler ensures that this is called only when
		// there is a listener on server side
		getRpcProxy(FocusAndBlurServerRpc.class).blur();
	}

	@Override
	public void onClick(ClickEvent event) {
		// if (!isEnabled()) {
		// return;
		// }
		//
		// getState().checked = getWidget().getValue();
		//
		// // Add mouse details
		// MouseEventDetails details = MouseEventDetailsBuilder
		// .buildMouseEventDetails(event.getNativeEvent(), getWidget()
		// .getElement());
		// getRpcProxy(CheckBoxServerRpc.class).setChecked(getState().checked,
		// details);

	}

	@Override
	public void onKeyDown(KeyDownEvent event) {

	}

	@Override
	public void onChange(ChangeEvent event) {

	}

	@Override
	public void onMouseUp(MouseUpEvent event) {

	}

	private ShortcutActionHandlerOwner getShortcutHandlerOwner() {
		if (hasShortcutActionHandler == null) {
			Widget parent = getWidget().getParent();
			while (parent != null) {
				if (parent instanceof ShortcutActionHandlerOwner) {
					break;
				}
				parent = parent.getParent();
			}
			hasShortcutActionHandler = (ShortcutActionHandlerOwner) parent;
		}
		return hasShortcutActionHandler;
	}
}
