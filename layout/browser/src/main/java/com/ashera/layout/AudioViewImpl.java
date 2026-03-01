//start - license
/*
 * Copyright (c) 2025 Ashera Cordova
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
//end - license
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


import static com.ashera.widget.IWidget.*;
import org.teavm.jso.dom.html.HTMLElement;
//end - imports
@SuppressLint("NewApi")
public class AudioViewImpl extends BaseWidget {
	//start - body
	private View viewStub;
	private HTMLElement htmlElement;
	public final static String LOCAL_NAME = "com.ashera.layout.AudioView"; 
	public final static String GROUP_NAME = "com.ashera.layout.AudioView";
	
	
	@Override
	public void loadAttributes(String attributeName) {

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onPrepared").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onCompletion").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onError").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("seekTo").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("start").withType("nil").withOrder(1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("pause").withType("nil").withOrder(1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("dataSource").withType("string"));

	}
	
	public AudioViewImpl() {
		super(LOCAL_NAME, LOCAL_NAME);
	}	

	@Override
	public IWidget newInstance() {
		return new AudioViewImpl();
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
		
        viewStub = new ViewExt();
        createView();
        ViewImpl.nativeMakeFrame(htmlElement, 0, 0, 0, 0);
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
    		IWidget widget = template.loadLazyWidgets(AudioViewImpl.this.getParent());
    		return (View) widget.asWidget();
    	}
	}

    
    private void createView() {
    	htmlElement = org.teavm.jso.dom.html.HTMLDocument.current().createElement("div");
    	htmlElement.getStyle().setProperty("overflow", "hidden");
    	htmlElement.getStyle().setProperty("box-sizing", "border-box");
    }

	@Override
	@SuppressLint("NewApi")
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {		
		Object nativeWidget = asNativeWidget();

		switch (key.getAttributeName()) {
			case "onPrepared": {
				


		if (objValue instanceof String) {setOnPreparedListener(new OnPreparedListener(this, strValue, "onPrepared"));} else {setOnPreparedListener((MediaPlayer.OnPreparedListener) objValue);}



			}
			break;
			case "onCompletion": {
				


		if (objValue instanceof String) {setOnCompletionListener(new OnCompletionListener(this, strValue, "onCompletion"));} else {setOnCompletionListener((MediaPlayer.OnCompletionListener) objValue);}



			}
			break;
			case "onError": {
				


		if (objValue instanceof String) {setOnErrorListener(new OnErrorListener(this, strValue, "onError"));} else {setOnErrorListener((MediaPlayer.OnErrorListener) objValue);}



			}
			break;
			case "seekTo": {
				


		seekTo(objValue);



			}
			break;
			case "start": {
				


		start();



			}
			break;
			case "pause": {
				


		pause();



			}
			break;
			case "dataSource": {
				


		setDataSource(objValue);



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
private static class OnPreparedListener implements MediaPlayer.OnPreparedListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnPreparedListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnPreparedListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onPrepared (MediaPlayer mp){
    
	if (action == null || action.equals("onPrepared")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onPrepared");
	    java.util.Map<String, Object> obj = getOnPreparedEventObj(mp);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, mp);
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

public java.util.Map<String, Object> getOnPreparedEventObj(MediaPlayer mp) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "prepared");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onPrepared", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnCompletionListener implements MediaPlayer.OnCompletionListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnCompletionListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnCompletionListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onCompletion (MediaPlayer mp){
    
	if (action == null || action.equals("onCompletion")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onCompletion");
	    java.util.Map<String, Object> obj = getOnCompletionEventObj(mp);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, mp);
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

public java.util.Map<String, Object> getOnCompletionEventObj(MediaPlayer mp) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "completion");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onCompletion", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnErrorListener implements MediaPlayer.OnErrorListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnErrorListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnErrorListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public boolean onError (MediaPlayer mp, int what, int extra){
    boolean result = true;
    
	if (action == null || action.equals("onError")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onError");
	    java.util.Map<String, Object> obj = getOnErrorEventObj(mp,what,extra);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 Object commandResult = EventCommandFactory.getCommand(commandName).executeCommand(w, obj, mp,what,extra);
		    	 if (commandResult != null) {
		    		 result = (boolean) commandResult;
		    	 }
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
    return result;
}//#####

public java.util.Map<String, Object> getOnErrorEventObj(MediaPlayer mp,int what,int extra) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "error");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "what", what);
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "extra", extra);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onError", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	
	

	static class MediaPlayer {

		public static interface OnErrorListener {
			boolean onError (MediaPlayer mp, int what, int extra);
		}
		
		public static interface OnCompletionListener {
			void onCompletion (MediaPlayer mp);			
		}
		
		public static interface OnPreparedListener {
			void onPrepared (MediaPlayer mp);
		}
		
	}
	
	private com.ashera.layout.AudioViewImpl.MediaPlayer.OnErrorListener onErrorListener;
	private com.ashera.layout.AudioViewImpl.MediaPlayer.OnCompletionListener onCompletionListener;
	private com.ashera.layout.AudioViewImpl.MediaPlayer.OnPreparedListener onPreparedListener;

	private void setOnErrorListener(com.ashera.layout.AudioViewImpl.MediaPlayer.OnErrorListener onErrorListener) {
		this.onErrorListener = onErrorListener;
	}

	private void setOnCompletionListener(com.ashera.layout.AudioViewImpl.MediaPlayer.OnCompletionListener onCompletionListener) {
		this.onCompletionListener = onCompletionListener;
	}

	private void setOnPreparedListener(com.ashera.layout.AudioViewImpl.MediaPlayer.OnPreparedListener onPreparedListener) {
		this.onPreparedListener = onPreparedListener;
	}
	


    @Override
    public Object asNativeWidget() {
        return htmlElement;
        
    }
    @Override
	public Class getViewClass() {
		return View.class;
	}
	//end - body
    
    private  AudioElement audio;
    protected org.teavm.jso.dom.html.HTMLElement hTMLElement;
	private void nativeCreate(IFragment fragment, Map<String, Object> params) {
    	hTMLElement = org.teavm.jso.dom.html.HTMLDocument.current().createElement("audio");
    	hTMLElement.setAttribute("controls", "true");
    	hTMLElement.addEventListener("loadedmetadata", new org.teavm.jso.dom.events.EventListener<org.teavm.jso.dom.events.Event>() {
			@Override
			public void handleEvent(org.teavm.jso.dom.events.Event evt) {
				if (onPreparedListener != null) {
					onPreparedListener.onPrepared(new MediaPlayer());
				}
			}
    	});
    	
    	hTMLElement.addEventListener("ended", new org.teavm.jso.dom.events.EventListener<org.teavm.jso.dom.events.Event>() {
			@Override
			public void handleEvent(org.teavm.jso.dom.events.Event evt) {
				if (onCompletionListener != null) {
					onCompletionListener.onCompletion(new MediaPlayer());
				}
			}
    	});
    	
    	hTMLElement.addEventListener("error", new org.teavm.jso.dom.events.EventListener<org.teavm.jso.dom.events.Event>() {
			@Override
			public void handleEvent(org.teavm.jso.dom.events.Event evt) {
				if (onErrorListener != null) {
					onErrorListener.onError(new MediaPlayer(), 1, 0);
				}
			}
    	});
    	audio = (AudioElement) hTMLElement;
    	htmlElement.appendChild(hTMLElement);
	}
	
	@org.teavm.jso.JSBody(params = { "key" }, script = "return localStorage.getItem(key);")
    private static native String getLocalStorage(String key);
	private void setDataSource(Object objValue) {
		HTMLElement source = org.teavm.jso.dom.html.HTMLDocument.current().createElement("source");
		audio.clear();
		String audioPath = (String) objValue;
		if (audioPath.startsWith("http:") || audioPath.startsWith("https:") || audioPath.startsWith("content:")) {
			source.setAttribute("src", audioPath);
		} else if (fragment.getRootDirectory() != null) {
			String cordovaFileUri = com.ashera.widget.PluginInvoker.resolveCDVFileLocation(fragment.getRootDirectory() + "/res/raw/" + audioPath, fragment);
			source.setAttribute("src", getLocalStorage(cordovaFileUri));
		} else if (audioPath.startsWith("cordova.file")) {
			String cordovaFileUri = com.ashera.widget.PluginInvoker.resolveCDVFileLocation(audioPath, fragment);
			source.setAttribute("src", getLocalStorage(cordovaFileUri));
		} else {
			source.setAttribute("src", "res/raw/" + audioPath);
		}
		
		source.setAttribute("type", "audio/mpeg");
		audio.appendChild(source);
	}

	private void pause() {
		if (!audio.isPaused()) {
			audio.pause();
	    }
	}

	private void resume() {
		if (audio.isPaused()) {
			audio.play();
	    }
	}

	private void start() {
		if (audio.isPaused()) {
			audio.play();
		}
	}

	private void seekTo(Object objValue) {
		audio.setCurrentTime(((int) objValue) / 1000); 
	}

	public interface AudioElement extends HTMLElement {
	    @org.teavm.jso.JSBody(script = "this.play();")
	    void play();

	    @org.teavm.jso.JSBody(script = "this.pause();")
	    void pause();

	    @org.teavm.jso.JSProperty
	    double getCurrentTime();

	    @org.teavm.jso.JSProperty
	    void setCurrentTime(double time);

	    @org.teavm.jso.JSProperty
	    boolean isPaused();
	    
	    @org.teavm.jso.JSProperty
	    int getVideoWidth();

	    @org.teavm.jso.JSProperty
	    int getVideoHeight();
	}
}
