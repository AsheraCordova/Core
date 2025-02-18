package com.ashera.layout;
//start - imports

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import android.content.Context;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.*;
import androidx.core.view.*;
import android.view.*;
import android.graphics.drawable.*;


import android.os.Build;
import android.view.View;
import android.text.*;

import com.ashera.core.IFragment;
import com.ashera.converter.*;

import android.annotation.SuppressLint;

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

	protected android.webkit.WebView webView;
	
	
	@Override
	public void loadAttributes(String attributeName) {
		ViewImpl.register(attributeName);


		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("loadUrl").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("initialScale").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("clearCache").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onPageStarted").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onPageFinished").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onReceivedError").withType("string"));
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

		
	public class WebViewExt extends android.webkit.WebView implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		
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

		public WebViewExt(Context context, android.util.AttributeSet attrs, int defStyleAttr) {
	        super(context, attrs, defStyleAttr);
	    }

	    public WebViewExt(Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    	super(context, attrs, defStyleAttr, defStyleRes);
	    }
		public WebViewExt(Context context) {
			super(context);
			
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
			
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			
			replayBufferedEvents();
			
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
		public void onDraw(Canvas canvas) {
			Runnable runnable = () -> super.onDraw(canvas);
			executeMethodListeners("onDraw", runnable, canvas);
		}

		@Override
		public void draw(Canvas canvas) {
			Runnable runnable = () -> super.draw(canvas);
			executeMethodListeners("draw", runnable, canvas);
		}

		@SuppressLint("WrongCall")
		@Override
		public void execute(String method, Object... args) {
			switch (method) {
				case "onDraw":
					setOnMethodCalled(true);
					super.onDraw((Canvas) args[0]);
					break;

				case "draw":
					setOnMethodCalled(true);
					super.draw((Canvas) args[0]);
					break;

				default:
					break;
			}
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
        
    	public void setState0(float value) {
    		ViewImpl.setState(WebViewImpl.this, 0, value);
    	}
    	public void setState0(int value) {
    		ViewImpl.setState(WebViewImpl.this, 0, value);
    	}
    	public void setState0(double value) {
    		ViewImpl.setState(WebViewImpl.this, 0, value);
    	}
    	
    	public void setState0(Float value) {
    		ViewImpl.setState(WebViewImpl.this, 0, value);
    	}
    	public void setState0(Integer value) {
    		ViewImpl.setState(WebViewImpl.this, 0, value);
    	}
    	public void setState0(Double value) {
    		ViewImpl.setState(WebViewImpl.this, 0, value);
    	}
    	public void setState0(Object value) {
    		ViewImpl.setState(WebViewImpl.this, 0, value);
    	}
    	public void setState1(float value) {
    		ViewImpl.setState(WebViewImpl.this, 1, value);
    	}
    	public void setState1(int value) {
    		ViewImpl.setState(WebViewImpl.this, 1, value);
    	}
    	public void setState1(double value) {
    		ViewImpl.setState(WebViewImpl.this, 1, value);
    	}
    	
    	public void setState1(Float value) {
    		ViewImpl.setState(WebViewImpl.this, 1, value);
    	}
    	public void setState1(Integer value) {
    		ViewImpl.setState(WebViewImpl.this, 1, value);
    	}
    	public void setState1(Double value) {
    		ViewImpl.setState(WebViewImpl.this, 1, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(WebViewImpl.this, 1, value);
    	}
    	public void setState2(float value) {
    		ViewImpl.setState(WebViewImpl.this, 2, value);
    	}
    	public void setState2(int value) {
    		ViewImpl.setState(WebViewImpl.this, 2, value);
    	}
    	public void setState2(double value) {
    		ViewImpl.setState(WebViewImpl.this, 2, value);
    	}
    	
    	public void setState2(Float value) {
    		ViewImpl.setState(WebViewImpl.this, 2, value);
    	}
    	public void setState2(Integer value) {
    		ViewImpl.setState(WebViewImpl.this, 2, value);
    	}
    	public void setState2(Double value) {
    		ViewImpl.setState(WebViewImpl.this, 2, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(WebViewImpl.this, 2, value);
    	}
    	public void setState3(float value) {
    		ViewImpl.setState(WebViewImpl.this, 3, value);
    	}
    	public void setState3(int value) {
    		ViewImpl.setState(WebViewImpl.this, 3, value);
    	}
    	public void setState3(double value) {
    		ViewImpl.setState(WebViewImpl.this, 3, value);
    	}
    	
    	public void setState3(Float value) {
    		ViewImpl.setState(WebViewImpl.this, 3, value);
    	}
    	public void setState3(Integer value) {
    		ViewImpl.setState(WebViewImpl.this, 3, value);
    	}
    	public void setState3(Double value) {
    		ViewImpl.setState(WebViewImpl.this, 3, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(WebViewImpl.this, 3, value);
    	}
    	public void setState4(float value) {
    		ViewImpl.setState(WebViewImpl.this, 4, value);
    	}
    	public void setState4(int value) {
    		ViewImpl.setState(WebViewImpl.this, 4, value);
    	}
    	public void setState4(double value) {
    		ViewImpl.setState(WebViewImpl.this, 4, value);
    	}
    	
    	public void setState4(Float value) {
    		ViewImpl.setState(WebViewImpl.this, 4, value);
    	}
    	public void setState4(Integer value) {
    		ViewImpl.setState(WebViewImpl.this, 4, value);
    	}
    	public void setState4(Double value) {
    		ViewImpl.setState(WebViewImpl.this, 4, value);
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
Context context = (Context) fragment.getRootActivity();
	Object systemStyle = params.get("systemStyle");
	Object systemAndroidAttrStyle = params.get("systemAndroidAttrStyle");
	
	if (systemStyle == null && systemAndroidAttrStyle == null) {
		webView = new WebViewExt(context);
	} else {
		int defStyleAttr = 0;
		int defStyleRes = 0;
		
		if (systemStyle != null) {
			defStyleRes = context.getResources().getIdentifier((String) systemStyle, "style", context.getPackageName());	
		}
		
		if (systemAndroidAttrStyle != null) {
			defStyleAttr = context.getResources().getIdentifier((String) systemAndroidAttrStyle, "attr", "android");	
		}
		
		if (defStyleRes == 0) {
			webView = new WebViewExt(context, null, defStyleAttr);	
		} else {
			webView = new WebViewExt(context, null, defStyleAttr, defStyleRes);
		}
		
	}

		nativeCreate(params);	
		ViewImpl.registerCommandConveter(this);
	}

	@Override
	@SuppressLint("NewApi")
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		Object nativeWidget = asNativeWidget();
		ViewImpl.setAttribute(this,  key, strValue, objValue, decorator);
		
		switch (key.getAttributeName()) {
			case "loadUrl": {
				


	webView.loadUrl((String)objValue);



			}
			break;
			case "initialScale": {
				


	webView.setInitialScale((int)objValue);



			}
			break;
			case "clearCache": {
				


	webView.clearCache((boolean)objValue);



			}
			break;
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
		return webView;
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
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
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
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
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
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
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
	        return webView;
	    }
	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			webView.setId((int) quickConvert(id, "id"));
		}
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

	
		//end - body

	private void nativeCreate(Map<String, Object> params) {
		Context context = (Context) fragment.getRootActivity();
		webView = new android.webkit.WebView(context);
		webView.getSettings().setJavaScriptEnabled(true);
		
		webView.setWebViewClient(new android.webkit.WebViewClient() {
            @SuppressWarnings("deprecation")
            @Override
            public void onReceivedError(android.webkit.WebView view, int errorCode, String description, String failingUrl) {
                WebViewImpl.this.onReceivedError(view, description);
            }
            @android.annotation.TargetApi(android.os.Build.VERSION_CODES.M)
            @Override
            public void onReceivedError(android.webkit.WebView view, android.webkit.WebResourceRequest req, android.webkit.WebResourceError rerr) {
            	super.onReceivedError(view, req, rerr);
                WebViewImpl.this.onReceivedError(view, rerr.getDescription().toString());
            }
            
            @Override
            public void onPageStarted(android.webkit.WebView view, String url, android.graphics.Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                WebViewImpl.this.onPageStarted(view);
            }

            @Override
            public void onPageFinished(android.webkit.WebView view, String url) {
                super.onPageFinished(view, url);
                WebViewImpl.this.onPageFinished(view);
            }
        });
	}
	
	//start - loader
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
	
	//end - loader
}
