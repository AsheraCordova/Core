package com.ashera.layout;
//start - imports

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import r.android.content.Context;


import org.teavm.jso.dom.html.HTMLElement;

import r.android.os.Build;
import r.android.view.View;
import r.android.text.*;

import com.ashera.core.IFragment;
import com.ashera.converter.*;

import r.android.annotation.SuppressLint;

import com.ashera.layout.*;
import com.ashera.plugin.*;
import com.ashera.widget.bus.*;
import com.ashera.widget.*;
import com.ashera.widget.bus.Event.*;
import com.ashera.widget.IWidgetLifeCycleListener.EventId;
import com.ashera.widget.IWidgetLifeCycleListener.EventId.*;


import static com.ashera.widget.IWidget.*;
//end - imports
@SuppressLint("NewApi")
public class WebViewImpl extends BaseWidget {
	//start - body
	public final static String LOCAL_NAME = "WebView"; 
	public final static String GROUP_NAME = "WebView";

	protected org.teavm.jso.dom.html.HTMLElement hTMLElement;
	protected r.android.webkit.WebView measurableView;	
	
	
	@Override
	public void loadAttributes(String attributeName) {
		ViewImpl.register(attributeName);


		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onPageStarted").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onPageFinished").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onReceivedError").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("loadUrl").withType("resourcestring").withOrder(10));
	}
	
	public WebViewImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  WebViewImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  WebViewImpl(String groupName, String localname) {
		super(groupName, localname);
	}

		
	public class WebViewExt extends r.android.webkit.WebView implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		private List<IWidget> overlays;
		public IWidget getWidget() {
			return WebViewImpl.this;
		}
		private int mMaxWidth = -1;
		private int mMaxHeight = -1;
		@Override
		public void setMaxWidth(int width) {
			mMaxWidth = width;
		}
		@Override
		public void setMaxHeight(int height) {
			mMaxHeight = height;
		}
		@Override
		public int getMaxWidth() {
			return mMaxWidth;
		}
		@Override
		public int getMaxHeight() {
			return mMaxHeight;
		}

		public WebViewExt() {
			super();
			
		}
		
		@Override
		public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

			if(mMaxWidth > 0) {
	        	widthMeasureSpec = MeasureSpec.makeMeasureSpec(mMaxWidth, MeasureSpec.AT_MOST);
	        }
	        if(mMaxHeight > 0) {
	            heightMeasureSpec = MeasureSpec.makeMeasureSpec(mMaxHeight, MeasureSpec.AT_MOST);

	        }

	        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
			IWidgetLifeCycleListener listener = (IWidgetLifeCycleListener) getListener();
			if (listener != null) {
			    measureFinished.setWidth(getMeasuredWidth());
			    measureFinished.setHeight(getMeasuredHeight());
				listener.eventOccurred(EventId.measureFinished, measureFinished);
			}
		}
		
		@Override
		protected void onLayout(boolean changed, int l, int t, int r, int b) {
			super.onLayout(changed, l, t, r, b);
			ViewImpl.setDrawableBounds(WebViewImpl.this, l, t, r, b);
			if (!isOverlay()) {
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			}
			replayBufferedEvents();
	        ViewImpl.redrawDrawables(WebViewImpl.this);
	        overlays = ViewImpl.drawOverlay(WebViewImpl.this, overlays);
			
			IWidgetLifeCycleListener listener = (IWidgetLifeCycleListener) getListener();
			if (listener != null) {
				onLayoutEvent.setB(b);
				onLayoutEvent.setL(l);
				onLayoutEvent.setR(r);
				onLayoutEvent.setT(t);
				onLayoutEvent.setChanged(changed);
				listener.eventOccurred(EventId.onLayout, onLayoutEvent);
			}
			
			if (isInvalidateOnFrameChange() && isInitialised()) {
				WebViewImpl.this.invalidate();
			}
		}	
		
		@Override
		public void execute(String method, Object... canvas) {
			
		}

		public void updateMeasuredDimension(int width, int height) {
			setMeasuredDimension(width, height);
		}


		@Override
		public ILifeCycleDecorator newInstance(IWidget widget) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void setAttribute(WidgetAttribute widgetAttribute,
				String strValue, Object objValue) {
			throw new UnsupportedOperationException();
		}		
		

		@Override
		public List<String> getMethods() {
			throw new UnsupportedOperationException();
		}
		
		@Override
		public void initialized() {
			throw new UnsupportedOperationException();
		}
		
        @Override
        public Object getAttribute(WidgetAttribute widgetAttribute) {
            throw new UnsupportedOperationException();
        }
        @Override
        public void drawableStateChanged() {
        	super.drawableStateChanged();
        	if (!isWidgetDisposed()) {
        		ViewImpl.drawableStateChanged(WebViewImpl.this);
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
    		
    		IWidget widget = template.loadLazyWidgets(WebViewImpl.this.getParent());
			return (View) widget.asWidget();
    	}   
        
    	@Override
		public void remeasure() {
    		if (getFragment() != null) {
    			getFragment().remeasure();
    		}
		}
    	
        @Override
		public void removeFromParent() {
        	WebViewImpl.this.getParent().remove(WebViewImpl.this);
		}
        @Override
        public void getLocationOnScreen(int[] appScreenLocation) {
        	appScreenLocation[0] = hTMLElement.getBoundingClientRect().getLeft();
        	appScreenLocation[1] = hTMLElement.getBoundingClientRect().getTop();
        }
        @Override
        public void getWindowVisibleDisplayFrame(r.android.graphics.Rect displayFrame){
        	
        	org.teavm.jso.dom.html.TextRectangle boundingClientRect = hTMLElement.getBoundingClientRect();
			displayFrame.top = boundingClientRect.getTop();
        	displayFrame.left = boundingClientRect.getLeft();
        	displayFrame.bottom = boundingClientRect.getBottom();
        	displayFrame.right = boundingClientRect.getRight();
        }
        @Override
		public void offsetTopAndBottom(int offset) {
			super.offsetTopAndBottom(offset);
			ViewImpl.nativeMakeFrame(asNativeWidget(), getLeft(), getTop(), getRight(), getBottom());
		}
		@Override
		public void offsetLeftAndRight(int offset) {
			super.offsetLeftAndRight(offset);
			ViewImpl.nativeMakeFrame(asNativeWidget(), getLeft(), getTop(), getRight(), getBottom());
		}
		@Override
		public void setMyAttribute(String name, Object value) {
			if (name.equals("state0")) {
				setState0(value);
				return;
			}
			if (name.equals("state1")) {
				setState1(value);
				return;
			}
			if (name.equals("state2")) {
				setState2(value);
				return;
			}
			if (name.equals("state3")) {
				setState3(value);
				return;
			}
			if (name.equals("state4")) {
				setState4(value);
				return;
			}
			WebViewImpl.this.setAttribute(name, value, !(value instanceof String));
		}
        @Override
        public void setVisibility(int visibility) {
            super.setVisibility(visibility);
            ((HTMLElement)asNativeWidget()).getStyle().setProperty("display", visibility != View.VISIBLE ? "none" : "block");
            
        }
        
    	public void setState0(Object value) {
    		ViewImpl.setState(WebViewImpl.this, 0, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(WebViewImpl.this, 1, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(WebViewImpl.this, 2, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(WebViewImpl.this, 3, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(WebViewImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(WebViewImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(WebViewImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(WebViewImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(WebViewImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(WebViewImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(WebViewImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(WebViewImpl.this);
        }
     
	
	}	@Override
	public Class getViewClass() {
		return WebViewExt.class;
	}

	@Override
	public IWidget newInstance() {
		return new WebViewImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
		measurableView = new WebViewExt();
		nativeCreate(params);	
		ViewImpl.registerCommandConveter(this);
	}

	@Override
	@SuppressLint("NewApi")
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		Object nativeWidget = asNativeWidget();
		ViewImpl.setAttribute(this,  key, strValue, objValue, decorator);
		
		switch (key.getAttributeName()) {
			case "onPageStarted": {
				


		setWebViewLoadingListener(new WebViewLoadingListener(this, strValue, "onPageStarted"));



			}
			break;
			case "onPageFinished": {
				


		setWebViewLoadedListener(new WebViewLoadedListener(this, strValue, "onPageFinished"));



			}
			break;
			case "onReceivedError": {
				


		setWebViewErrorListener(new WebViewErrorListener(this, strValue, "onReceivedError"));



			}
			break;
			case "loadUrl": {
				


		loadUrl(objValue);



			}
			break;
		default:
			break;
		}
		
	}
	
	@Override
	@SuppressLint("NewApi")
	public Object getAttribute(WidgetAttribute key, ILifeCycleDecorator decorator) {
		Object nativeWidget = asNativeWidget();
		Object attributeValue = ViewImpl.getAttribute(this, nativeWidget, key, decorator);
		if (attributeValue != null) {
			return attributeValue;
		}
		switch (key.getAttributeName()) {
		}
		
		return null;
	}
	
	@Override
	public Object asWidget() {
		return measurableView;
	}

	

	static class Loader {
		interface WebViewLoadingListener {
			public void onPageStarted(View view);
		}
		
		interface WebViewLoadedListener {
			public void onPageFinished(View view);			
		}
		
		interface WebViewErrorListener {
			public void onReceivedError(View view, String error);			
		}
	}
	
	private Loader.WebViewLoadingListener webviewLoadingListener;
	private Loader.WebViewLoadedListener webviewLoadedListener;
	private Loader.WebViewErrorListener webviewErrorListener;
	private void setWebViewLoadedListener(WebViewLoadedListener webviewLoadedListener) {
		this.webviewLoadedListener = webviewLoadedListener;
	}
	
	private void setWebViewErrorListener(WebViewErrorListener webviewErrorListener) {
		this.webviewErrorListener = webviewErrorListener;
	}

	private void setWebViewLoadingListener(WebViewLoadingListener webviewLoadingListener) {
		this.webviewLoadingListener = webviewLoadingListener;
		
	}
	private boolean pageFinished = false;
	private void onPageFinished(View view) {
		if (!pageFinished && webviewLoadedListener != null) {
			pageFinished = true;
        	try {
				webviewLoadedListener.onPageFinished(view);
			} catch (Exception e) {
				// ignore any exception
			}
        }
	}
	private void onPageStarted(View view) {
		if (webviewLoadingListener != null) {
			webviewLoadingListener.onPageStarted(view);
		}
	}
	
	private void onReceivedError(View view, String error) {
		if (webviewErrorListener != null) {
			webviewErrorListener.onReceivedError(view, error);
		}
	}
	
	

	@SuppressLint("NewApi")
private static class WebViewLoadingListener implements Loader.WebViewLoadingListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public WebViewLoadingListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public WebViewLoadingListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onPageStarted(View view){
    
	if (action == null || action.equals("onPageStarted")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onPageStarted");
	    java.util.Map<String, Object> obj = getOnPageStartedEventObj(view);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, view);
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

public java.util.Map<String, Object> getOnPageStartedEventObj(View view) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "pagestarted");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onPageStarted", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class WebViewLoadedListener implements Loader.WebViewLoadedListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public WebViewLoadedListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public WebViewLoadedListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onPageFinished(View view){
    
	if (action == null || action.equals("onPageFinished")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onPageFinished");
	    java.util.Map<String, Object> obj = getOnPageFinishedEventObj(view);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, view);
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

public java.util.Map<String, Object> getOnPageFinishedEventObj(View view) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "pagefinished");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onPageFinished", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class WebViewErrorListener implements Loader.WebViewErrorListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public WebViewErrorListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public WebViewErrorListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onReceivedError(View view, String error){
    
	if (action == null || action.equals("onReceivedError")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onReceivedError");
	    java.util.Map<String, Object> obj = getOnReceivedErrorEventObj(view,error);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, view,error);
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

public java.util.Map<String, Object> getOnReceivedErrorEventObj(View view,String error) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "receivederror");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "error", error);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onReceivedError", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	
	    @Override
	    public Object asNativeWidget() {
	        return hTMLElement;
	    }
	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			measurableView.setId((int) quickConvert(id, "id"));
		}
	}
	
    @Override
    public void setVisible(boolean b) {
        ((View)asWidget()).setVisibility(b ? View.VISIBLE : View.GONE);
    }
 
    @Override
    public void requestLayout() {
    	if (isInitialised()) {
    		ViewImpl.requestLayout(this, asNativeWidget());
    		
    	}
    }
    
    @Override
    public void invalidate() {
    	if (isInitialised()) {
			ViewImpl.invalidate(this, asNativeWidget());

    	}
    }
	
private WebViewCommandBuilder builder;
private WebViewBean bean;
public Object getPlugin(String plugin) {
	return WidgetFactory.getAttributable(plugin).newInstance(this);
}
public WebViewBean getBean() {
	if (bean == null) {
		bean = new WebViewBean();
	}
	return bean;
}
public WebViewCommandBuilder getBuilder() {
	if (builder == null) {
		builder = new WebViewCommandBuilder();
	}
	return builder;
}


public  class WebViewCommandBuilder extends com.ashera.layout.ViewImpl.ViewCommandBuilder <WebViewCommandBuilder> {
    public WebViewCommandBuilder() {
	}
	
	public WebViewCommandBuilder execute(boolean setter) {
		if (setter) {
			executeCommand(command, null, IWidget.COMMAND_EXEC_SETTER_METHOD);
			getFragment().remeasure();
		}
		executeCommand(command, null, IWidget.COMMAND_EXEC_GETTER_METHOD);
return this;	}

public WebViewCommandBuilder setOnPageStarted(String value) {
	Map<String, Object> attrs = initCommand("onPageStarted");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public WebViewCommandBuilder setOnPageFinished(String value) {
	Map<String, Object> attrs = initCommand("onPageFinished");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public WebViewCommandBuilder setOnReceivedError(String value) {
	Map<String, Object> attrs = initCommand("onReceivedError");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public WebViewCommandBuilder loadUrl(String value) {
	Map<String, Object> attrs = initCommand("loadUrl");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
}
public class WebViewBean extends com.ashera.layout.ViewImpl.ViewBean{
		public WebViewBean() {
			super(WebViewImpl.this);
		}
public void setOnPageStarted(String value) {
	getBuilder().reset().setOnPageStarted(value).execute(true);
}

public void setOnPageFinished(String value) {
	getBuilder().reset().setOnPageFinished(value).execute(true);
}

public void setOnReceivedError(String value) {
	getBuilder().reset().setOnReceivedError(value).execute(true);
}

public void loadUrl(String value) {
	getBuilder().reset().loadUrl(value).execute(true);
}

}


	
	//end - body

	private void nativeCreate(Map<String, Object> params) {
		hTMLElement = org.teavm.jso.dom.html.HTMLDocument.current().createElement("object");
		hTMLElement.getStyle().setProperty("box-sizing", "border-box");
		hTMLElement.setAttribute("type", "text/html");
		hTMLElement.addEventListener("load", (e) -> {
			WebViewImpl.this.onPageFinished(measurableView);	
		});
		
		hTMLElement.addEventListener("error", (e) -> {
			WebViewImpl.this.onReceivedError(measurableView, hTMLElement.getInnerHTML());
			WebViewImpl.this.onPageFinished(measurableView);
		});
	}
	
	
	private void loadUrl(Object objValue) {
		WebViewImpl.this.onPageStarted(measurableView);
		hTMLElement.setAttribute("data", (String) objValue);
	}
	
	private int nativeMeasureHeight(Object uiView, int width) {
		return 0;
	}

	private int nativeMeasureWidth(Object uiView) {
		return 0;
	}

}
