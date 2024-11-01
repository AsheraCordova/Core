package com.ashera.layout;


//start - imports
import java.util.*;

import r.android.content.*;
import r.android.graphics.*;
import r.android.os.Build;
import r.android.view.*;

import com.ashera.core.IFragment;
import com.ashera.converter.*;
import r.android.annotation.SuppressLint;

import com.ashera.widget.bus.*;
import com.ashera.widget.*;

import org.eclipse.swt.widgets.*;
import org.eclipse.swt.graphics.*;
import org.eclipse.swt.*;

import static com.ashera.widget.IWidget.*;
//end - imports
import r.android.widget.PopupWindow;
@SuppressLint("NewApi")
public class PopupWindowImpl extends BaseWidget {
	//start - body
	private View viewStub;
	private Object pane;
	public final static String LOCAL_NAME = "com.ashera.layout.PopupWindow"; 
	public final static String GROUP_NAME = "PopupWindow";
	
	
	@Override
	public void loadAttributes(String attributeName) {

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("overlapAnchor").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("contentView").withType("template"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("showAtLocation").withType("object"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("showAsDropDown").withType("object"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("dismiss").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onDismiss").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("attributeUnderTest").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("height").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("width").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("outsideTouchable").withType("boolean"));

	}
	
	public PopupWindowImpl() {
		super(LOCAL_NAME, LOCAL_NAME);
	}	

	@Override
	public IWidget newInstance() {
		return new PopupWindowImpl();
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
		
        viewStub = new ViewExt();
        pane = new Composite(ViewImpl.getParent(this), SWT.NONE);
        ViewImpl.nativeMakeFrame(pane, 0, 0, 0, 0);
		nativeCreate(fragment, params);	
	}
	
	public class ViewExt extends View implements com.ashera.model.IViewStub{
		@Override
		public void remeasure() {
			if (getFragment() != null) {
				getFragment().remeasure();
			}
		}
        private Map<String, IWidget> templates;
    	@Override
    	public r.android.view.View inflateView(java.lang.String layout) {
    		if (templates == null) {
    			templates = new java.util.HashMap<String, IWidget>();
    		}
    		IWidget template = templates.get(layout);
    		if (template == null) {
    			template = (IWidget) quickConvert(layout, "template");
    			templates.put(layout, template);
    		}
    		IWidget widget = template.loadLazyWidgets(PopupWindowImpl.this.getParent());
    		return (View) widget.asWidget();
    	}
	}

    

	@Override
	@SuppressLint("NewApi")
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {		
		Object nativeWidget = asNativeWidget();

		switch (key.getAttributeName()) {
			case "overlapAnchor": {
				


	popupWindow.setOverlapAnchor((boolean)objValue);



			}
			break;
			case "contentView": {
				


		setContentView(objValue);



			}
			break;
			case "showAtLocation": {
				
		if (objValue instanceof Map) {
			Map<String, Object> data = ((Map<String, Object>) objValue);
		Object x = quickConvert(data.get("x"), "dimension");
		Object y = quickConvert(data.get("y"), "dimension");
		Object gravity = quickConvert(data.get("gravity"), "gravity");


		 showAtLocation(gravity, x, y);


}
if (objValue instanceof java.util.List) {
	java.util.List<Object> list = (java.util.List<Object>) objValue;
	for (Object object : list) {
		Map<String, Object> data = PluginInvoker.getMap(object);
		Object x = quickConvert(data.get("x"), "dimension");
		Object y = quickConvert(data.get("y"), "dimension");
		Object gravity = quickConvert(data.get("gravity"), "gravity");


		 showAtLocation(gravity, x, y);


	}
}
			}
			break;
			case "showAsDropDown": {
				
		if (objValue instanceof Map) {
			Map<String, Object> data = ((Map<String, Object>) objValue);
		Object anchor = quickConvert(data.get("anchor"), "string");
		Object xoff = quickConvert(data.get("xoff"), "dimension");
		Object yoff = quickConvert(data.get("yoff"), "dimension");
		Object gravity = quickConvert(data.get("gravity"), "gravity");


		 showAsDropDown(anchor, gravity, xoff, yoff);


}
if (objValue instanceof java.util.List) {
	java.util.List<Object> list = (java.util.List<Object>) objValue;
	for (Object object : list) {
		Map<String, Object> data = PluginInvoker.getMap(object);
		Object anchor = quickConvert(data.get("anchor"), "string");
		Object xoff = quickConvert(data.get("xoff"), "dimension");
		Object yoff = quickConvert(data.get("yoff"), "dimension");
		Object gravity = quickConvert(data.get("gravity"), "gravity");


		 showAsDropDown(anchor, gravity, xoff, yoff);


	}
}
			}
			break;
			case "dismiss": {
				


		dismiss();



			}
			break;
			case "onDismiss": {
				


		popupWindow.setOnDismissListener(new OnDismissListener(this, strValue, "onDismiss"));



			}
			break;
			case "attributeUnderTest": {
				


		 ViewImpl.setAttribute(this,  key, strValue, objValue, decorator);



			}
			break;
			case "height": {
				


		setHeight(objValue);



			}
			break;
			case "width": {
				


		setWidth(objValue);



			}
			break;
			case "outsideTouchable": {
				


		setOutsideTouchable(objValue);



			}
			break;
		default:
			break;
		}
	}
	@Override
	public Object asWidget() {
		return viewStub;
	}
	
	@Override
	@SuppressLint("NewApi")
	public Object getAttribute(WidgetAttribute key, ILifeCycleDecorator decorator) {
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
		}
		
		return null;
	}
	@SuppressLint("NewApi")
private static class OnDismissListener implements PopupWindow.OnDismissListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnDismissListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnDismissListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onDismiss(){
    
	if (action == null || action.equals("onDismiss")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onDismiss");
	    java.util.Map<String, Object> obj = getOnDismissEventObj();
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj);
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    activity.sendEventMessage(obj);
		}
	}
    return;
}//#####

public java.util.Map<String, Object> getOnDismissEventObj( ) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "dismiss");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onDismiss", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	
	

    @Override
    public void setVisible(boolean b) {
        ((View)asWidget()).setVisibility(b ? View.VISIBLE : View.GONE);
    }
    @Override
	public Class getViewClass() {
		return View.class;
	}
	//end - body
    
    //start - popup
    private int width = r.android.widget.RelativeLayout.LayoutParams.WRAP_CONTENT;
    private int height = r.android.widget.RelativeLayout.LayoutParams.WRAP_CONTENT;
	private void showAtLocation(Object gravity, Object x, Object y) {
		if (popupWindow.isShowing()) {
			return;
		}
		IWidget parent = WidgetFactory.createWidget(FrameLayoutImpl.LOCAL_NAME, FrameLayoutImpl.GROUP_NAME, (HasWidgets) fragment.getRootWidget(), false);
		View parentView = (View)parent.asWidget();
		
		IWidget widget = this.contentView.loadLazyWidgets((HasWidgets) parent);
		
		r.android.widget.RelativeLayout.LayoutParams layoutParams = (r.android.widget.RelativeLayout.LayoutParams) parentView.getLayoutParams();
		layoutParams.width = width;
		layoutParams.height = height;
		popupWindow.setContentView((View) widget.asWidget());
		popupWindow.showAtLocation(parentView, layoutParams, (int) gravity, (int)x, (int)y);
		moveTopTop(parent);
		
		applyGravity(gravity, layoutParams);
		addOutsideTouchListener(outsideTouchable);
	}

	private void applyGravity(Object gravity, r.android.widget.RelativeLayout.LayoutParams layoutParams) {
		if (gravity != null) {
			int major = ((int) gravity) & GravityConverter.VERTICAL_GRAVITY_MASK;
	
	        switch (major) {
	        case GravityConverter.TOP:
	        	layoutParams.addRule(r.android.widget.RelativeLayout.ALIGN_TOP, r.android.widget.RelativeLayout.TRUE);
	            break;
	        case GravityConverter.BOTTOM:
	        	layoutParams.addRule(r.android.widget.RelativeLayout.ALIGN_BOTTOM, r.android.widget.RelativeLayout.TRUE);
	            break;
	        case GravityConverter.CENTER_VERTICAL:
	        	layoutParams.addRule(r.android.widget.RelativeLayout.CENTER_VERTICAL, r.android.widget.RelativeLayout.TRUE);
	            break;
	        default:
	        	layoutParams.addRule(r.android.widget.RelativeLayout.ALIGN_TOP, r.android.widget.RelativeLayout.TRUE);
	            break;
	        }
	        
	        int minor = ((int) gravity) & GravityConverter.HORIZONTAL_GRAVITY_MASK;
	
	        switch (minor) {
	        case GravityConverter.LEFT:
	        	layoutParams.addRule(r.android.widget.RelativeLayout.ALIGN_LEFT, r.android.widget.RelativeLayout.TRUE);
	            break;
	        case GravityConverter.RIGHT:
	        	layoutParams.addRule(r.android.widget.RelativeLayout.ALIGN_RIGHT, r.android.widget.RelativeLayout.TRUE);
	            break;
	        case GravityConverter.CENTER_HORIZONTAL:
	        	layoutParams.addRule(r.android.widget.RelativeLayout.CENTER_HORIZONTAL, r.android.widget.RelativeLayout.TRUE);
	            break;
	        default:
	        	layoutParams.addRule(r.android.widget.RelativeLayout.ALIGN_LEFT, r.android.widget.RelativeLayout.TRUE);
	            break;
	        }
		}
	}

	private IWidget contentView;
	private void setContentView(Object objValue) {
		this.contentView = (IWidget) objValue;
	}

	private void nativeCreate(IFragment fragment, Map<String, Object> params) {
		popupWindow = new r.android.widget.PopupWindow();
	}

	private r.android.widget.PopupWindow popupWindow;

	private void showAsDropDown(Object anchor, Object gravity, Object xoff, Object yoff) {
		if (popupWindow.isShowing()) {
			return;
		}
		IWidget parent = WidgetFactory.createWidget(FrameLayoutImpl.LOCAL_NAME, FrameLayoutImpl.GROUP_NAME, (HasWidgets) fragment.getRootWidget(), false);
		View parentView = (View)parent.asWidget();
		IWidget widget = this.contentView.loadLazyWidgets((HasWidgets) parent);
		IWidget anchorWidget = getFragment().getRootWidget().findWidgetById((String) anchor);
		r.android.widget.RelativeLayout.LayoutParams layoutParams = (r.android.widget.RelativeLayout.LayoutParams) parentView.getLayoutParams();
		layoutParams.width = width;
		layoutParams.height = height;
		popupWindow.setContentView((View) widget.asWidget());
		popupWindow.showAsDropDown(parentView, (View) anchorWidget.asWidget(), layoutParams, (int) xoff, (int) yoff, (int) gravity);
		moveTopTop(parent);
		addOutsideTouchListener(outsideTouchable);
	}

	
	private void setWidth(Object objValue) {
		this.width = (int) objValue;
	}

	private void setHeight(Object objValue) {
		this.height = (int) objValue;
	}
	
	private void dismiss() {
		popupWindow.dismiss();
		addOutsideTouchListener(false);
	}

	private boolean outsideTouchable;
	private void setOutsideTouchable(Object objValue) {
		this.outsideTouchable = (boolean) objValue;
	}

	//start - addOutsideTouchListener
	private OutsideEventListener outsideEventListener;
	public void addOutsideTouchListener(boolean add) {
		com.ashera.widget.bus.Event.StandardEvents type = com.ashera.widget.bus.Event.StandardEvents.outsideClicked;
		
		if (outsideEventListener != null) {
			fragment.getEventBus().off(outsideEventListener);
			outsideEventListener = null;
		}

		if (add) {
			outsideEventListener = new OutsideEventListener(this, type.toString());
			fragment.getEventBus().on(type.toString(), outsideEventListener);
		}
	}

	//end - addOutsideTouchListener
	private final static class OutsideEventListener extends com.ashera.widget.bus.EventBusHandler {
		private PopupWindowImpl window;
		private OutsideEventListener(PopupWindowImpl window, String type) {
			super(type);
			this.window = window;
		}

		@Override
		protected void doPerform(java.lang.Object payload) {
			window.dismiss();
		}
	}
	//end - popup
	
	public void moveTopTop(IWidget parent) {
		((Control) parent.asNativeWidget()).moveAbove(null);
	}
	
	@Override
	public Object asNativeWidget() {
		return pane;
	}
}
