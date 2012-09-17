package org.eclipse.emf.ecp.ui.uimodel.core.editparts.tests.emf;

import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelFactory;
import org.eclipse.emf.ecp.ui.model.core.uimodel.UiModelPackage;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiLayout;
import org.eclipse.emf.ecp.ui.model.core.uimodel.YUiView;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.DelegatingEditPartManager;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiLayoutEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.IUiViewEditpart;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.context.ViewContext;
import org.eclipse.emf.ecp.ui.uimodel.core.editparts.disposal.IDisposable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("restriction")
public class UiViewEditpartTest {

	private DelegatingEditPartManager editpartManager = DelegatingEditPartManager.getInstance();
	private UiModelFactory modelFactory = UiModelFactory.eINSTANCE;

	@Before
	public void setup() {
		DefaultRealm.setup();

		editpartManager.clear();
		editpartManager.addFactory(new org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.impl.EditpartManager());
		editpartManager
			.addFactory(new org.eclipse.emf.ecp.ui.uimodel.core.editparts.emf.extension.impl.EditpartManager());
	}

	@Test
	public void test_context() {
		IUiViewEditpart viewEditpart = (IUiViewEditpart) editpartManager.createEditpart(UiModelPackage.eNS_URI,
			IUiViewEditpart.class);
		Assert.assertNull(viewEditpart.getContext());

		ViewContext context = new ViewContext(viewEditpart);
		Assert.assertSame(context, viewEditpart.getContext());
		Assert.assertSame(viewEditpart, context.getViewEditpart());
	}

	@Test
	public void test_setContent_byModel() {
		// ...> view1
		// ......> layout1
		YUiView view1 = modelFactory.createYUiView();
		YUiLayout layout1 = modelFactory.createYUiLayout();
		view1.setContent(layout1);
		IUiViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		IUiLayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);

		Assert.assertSame(layout1Editpart, view1Editpart.getContent());
		// parent is null if it is the view
		Assert.assertNull(layout1Editpart.getParent());
		Assert.assertSame(view1Editpart, layout1Editpart.getView());

		// unset the layout
		//
		view1.setContent(null);
		Assert.assertNull(view1Editpart.getContent());
		Assert.assertNull(layout1Editpart.getParent());
		Assert.assertNull(layout1Editpart.getView());

	}

	@Test
	public void test_setContent_byEditPart() {
		// ...> view1
		// ......> layout1
		YUiView view1 = modelFactory.createYUiView();
		YUiLayout layout1 = modelFactory.createYUiLayout();
		IUiViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		IUiLayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		view1Editpart.setContent(layout1Editpart);

		Assert.assertSame(layout1Editpart, view1Editpart.getContent());
		// parent is null if it is the view
		Assert.assertNull(layout1Editpart.getParent());
		Assert.assertSame(view1Editpart, layout1Editpart.getView());

		// unset the layout
		//
		view1.setContent(null);
		Assert.assertNull(view1Editpart.getContent());
		Assert.assertNull(layout1Editpart.getParent());
		Assert.assertNull(layout1Editpart.getView());

	}

	@Test
	public void test_moveContent_byModel() {
		// ...> view1
		// ......> layout1
		YUiView view1 = modelFactory.createYUiView();
		YUiLayout layout1 = modelFactory.createYUiLayout();
		view1.setContent(layout1);
		IUiViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		IUiLayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);

		Assert.assertSame(layout1Editpart, view1Editpart.getContent());
		// parent is null if it is the view
		Assert.assertNull(layout1Editpart.getParent());
		Assert.assertSame(view1Editpart, layout1Editpart.getView());

		// ...> view2
		// ......> layout1
		YUiView view2 = modelFactory.createYUiView();
		view2.setContent(layout1);
		IUiViewEditpart view2Editpart = editpartManager.getEditpart(view2);

		Assert.assertSame(layout1Editpart, view2Editpart.getContent());
		// parent is null if it is the view
		Assert.assertNull(layout1Editpart.getParent());
		Assert.assertSame(view2Editpart, layout1Editpart.getView());
	}

	@Test
	public void test_moveContent_byEditPart() {
		// ...> view1
		// ......> layout1
		YUiView view1 = modelFactory.createYUiView();
		YUiLayout layout1 = modelFactory.createYUiLayout();
		IUiViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		IUiLayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);
		view1Editpart.setContent(layout1Editpart);

		Assert.assertSame(layout1Editpart, view1Editpart.getContent());
		// parent is null if it is the view
		Assert.assertNull(layout1Editpart.getParent());
		Assert.assertSame(view1Editpart, layout1Editpart.getView());

		// ...> view2
		// ......> layout1
		YUiView view2 = modelFactory.createYUiView();
		IUiViewEditpart view2Editpart = editpartManager.getEditpart(view2);
		view2Editpart.setContent(layout1Editpart);

		Assert.assertSame(layout1Editpart, view2Editpart.getContent());
		// parent is null if it is the view
		Assert.assertNull(layout1Editpart.getParent());
		Assert.assertSame(view2Editpart, layout1Editpart.getView());
	}

	@Test
	public void test_disposeContent() {
		// ...> view1
		// ......> layout1
		YUiView view1 = modelFactory.createYUiView();
		YUiLayout layout1 = modelFactory.createYUiLayout();
		view1.setContent(layout1);
		IUiViewEditpart view1Editpart = editpartManager.getEditpart(view1);
		IUiLayoutEditpart layout1Editpart = editpartManager.getEditpart(layout1);

		Assert.assertSame(layout1Editpart, view1Editpart.getContent());
		Assert.assertSame(view1Editpart, layout1Editpart.getView());
		Assert.assertSame(view1, layout1.getView());

		// dispose the layout
		//
		layout1Editpart.dispose();
		Assert.assertFalse(view1Editpart.isDisposed());
		Assert.assertTrue(layout1Editpart.isDisposed());

		Assert.assertNull(view1Editpart.getContent());
		Assert.assertNull(layout1.getParent());
	}

	@Test
	public void test_dispose() {
		YUiView view1 = modelFactory.createYUiView();
		IUiViewEditpart view1Editpart = editpartManager.getEditpart(view1);

		Assert.assertFalse(view1Editpart.isDisposed());
		view1Editpart.dispose();
		Assert.assertTrue(view1Editpart.isDisposed());

		view1Editpart.isDisposed();
		view1Editpart.dispose();

		try {
			view1Editpart.addDisposeListener(new IDisposable.Listener() {
				@Override
				public void notifyDisposed(IDisposable notifier) {
				}
			});
			Assert.fail();
		} catch (Exception e) {
			// expected
		}

		try {
			view1Editpart.setContent(null);
			Assert.fail();
		} catch (Exception e) {
			// expected
		}
		try {
			view1Editpart.getContent();
			Assert.fail();
		} catch (Exception e) {
			// expected
		}

		try {
			view1Editpart.getId();
			Assert.fail();
		} catch (Exception e) {
			// expected
		}

		try {
			view1Editpart.getModel();
			Assert.fail();
		} catch (Exception e) {
			// expected
		}

		try {
			view1Editpart.removeDisposeListener(new IDisposable.Listener() {
				@Override
				public void notifyDisposed(IDisposable notifier) {
				}
			});
			Assert.fail();
		} catch (Exception e) {
			// expected
		}
	}
}
