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

import android.media.MediaPlayer;
@SuppressLint("NewApi")
public class VideoViewImpl extends BaseWidget {
	//start - body
	public final static String LOCAL_NAME = "VideoView"; 
	public final static String GROUP_NAME = "VideoView";

	protected android.widget.VideoView videoView;
	
	
	@Override
	public void loadAttributes(String attributeName) {
		ViewImpl.register(attributeName);


		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("videoPath").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onPrepared").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onCompletion").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onError").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onInfo").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("seekTo").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("start").withType("nil").withOrder(1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("resume").withType("nil").withOrder(1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("pause").withType("nil").withOrder(1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("showMediaControl").withType("boolean"));
	}
	
	public VideoViewImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  VideoViewImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  VideoViewImpl(String groupName, String localname) {
		super(groupName, localname);
	}

		
	public class VideoViewExt extends android.widget.VideoView implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		
		public IWidget getWidget() {
			return VideoViewImpl.this;
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

		public VideoViewExt(Context context, android.util.AttributeSet attrs, int defStyleAttr) {
	        super(context, attrs, defStyleAttr);
	    }

	    public VideoViewExt(Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    	super(context, attrs, defStyleAttr, defStyleRes);
	    }
		public VideoViewExt(Context context) {
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
				VideoViewImpl.this.invalidate();
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
        		ViewImpl.drawableStateChanged(VideoViewImpl.this);
        	}
        }
        
    	public void setState0(float value) {
    		ViewImpl.setState(VideoViewImpl.this, 0, value);
    	}
    	public void setState0(int value) {
    		ViewImpl.setState(VideoViewImpl.this, 0, value);
    	}
    	public void setState0(double value) {
    		ViewImpl.setState(VideoViewImpl.this, 0, value);
    	}
    	
    	public void setState0(Float value) {
    		ViewImpl.setState(VideoViewImpl.this, 0, value);
    	}
    	public void setState0(Integer value) {
    		ViewImpl.setState(VideoViewImpl.this, 0, value);
    	}
    	public void setState0(Double value) {
    		ViewImpl.setState(VideoViewImpl.this, 0, value);
    	}
    	public void setState0(Object value) {
    		ViewImpl.setState(VideoViewImpl.this, 0, value);
    	}
    	public void setState1(float value) {
    		ViewImpl.setState(VideoViewImpl.this, 1, value);
    	}
    	public void setState1(int value) {
    		ViewImpl.setState(VideoViewImpl.this, 1, value);
    	}
    	public void setState1(double value) {
    		ViewImpl.setState(VideoViewImpl.this, 1, value);
    	}
    	
    	public void setState1(Float value) {
    		ViewImpl.setState(VideoViewImpl.this, 1, value);
    	}
    	public void setState1(Integer value) {
    		ViewImpl.setState(VideoViewImpl.this, 1, value);
    	}
    	public void setState1(Double value) {
    		ViewImpl.setState(VideoViewImpl.this, 1, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(VideoViewImpl.this, 1, value);
    	}
    	public void setState2(float value) {
    		ViewImpl.setState(VideoViewImpl.this, 2, value);
    	}
    	public void setState2(int value) {
    		ViewImpl.setState(VideoViewImpl.this, 2, value);
    	}
    	public void setState2(double value) {
    		ViewImpl.setState(VideoViewImpl.this, 2, value);
    	}
    	
    	public void setState2(Float value) {
    		ViewImpl.setState(VideoViewImpl.this, 2, value);
    	}
    	public void setState2(Integer value) {
    		ViewImpl.setState(VideoViewImpl.this, 2, value);
    	}
    	public void setState2(Double value) {
    		ViewImpl.setState(VideoViewImpl.this, 2, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(VideoViewImpl.this, 2, value);
    	}
    	public void setState3(float value) {
    		ViewImpl.setState(VideoViewImpl.this, 3, value);
    	}
    	public void setState3(int value) {
    		ViewImpl.setState(VideoViewImpl.this, 3, value);
    	}
    	public void setState3(double value) {
    		ViewImpl.setState(VideoViewImpl.this, 3, value);
    	}
    	
    	public void setState3(Float value) {
    		ViewImpl.setState(VideoViewImpl.this, 3, value);
    	}
    	public void setState3(Integer value) {
    		ViewImpl.setState(VideoViewImpl.this, 3, value);
    	}
    	public void setState3(Double value) {
    		ViewImpl.setState(VideoViewImpl.this, 3, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(VideoViewImpl.this, 3, value);
    	}
    	public void setState4(float value) {
    		ViewImpl.setState(VideoViewImpl.this, 4, value);
    	}
    	public void setState4(int value) {
    		ViewImpl.setState(VideoViewImpl.this, 4, value);
    	}
    	public void setState4(double value) {
    		ViewImpl.setState(VideoViewImpl.this, 4, value);
    	}
    	
    	public void setState4(Float value) {
    		ViewImpl.setState(VideoViewImpl.this, 4, value);
    	}
    	public void setState4(Integer value) {
    		ViewImpl.setState(VideoViewImpl.this, 4, value);
    	}
    	public void setState4(Double value) {
    		ViewImpl.setState(VideoViewImpl.this, 4, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(VideoViewImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(VideoViewImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(VideoViewImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(VideoViewImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(VideoViewImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(VideoViewImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(VideoViewImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(VideoViewImpl.this);
        }
     
	
	}	@Override
	public Class getViewClass() {
		return VideoViewExt.class;
	}

	@Override
	public IWidget newInstance() {
		return new VideoViewImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
Context context = (Context) fragment.getRootActivity();
	Object systemStyle = params.get("systemStyle");
	Object systemAndroidAttrStyle = params.get("systemAndroidAttrStyle");
	
	if (systemStyle == null && systemAndroidAttrStyle == null) {
		videoView = new VideoViewExt(context);
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
			videoView = new VideoViewExt(context, null, defStyleAttr);	
		} else {
			videoView = new VideoViewExt(context, null, defStyleAttr, defStyleRes);
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
			case "videoPath": {
				


		setVideoPath(objValue);



			}
			break;
			case "onPrepared": {
				


		if (objValue instanceof String) {videoView.setOnPreparedListener(new OnPreparedListener(this, strValue, "onPrepared"));} else {videoView.setOnPreparedListener((MediaPlayer.OnPreparedListener) objValue);}



			}
			break;
			case "onCompletion": {
				


		if (objValue instanceof String) {videoView.setOnCompletionListener(new OnCompletionListener(this, strValue, "onCompletion"));} else {videoView.setOnCompletionListener((MediaPlayer.OnCompletionListener) objValue);}



			}
			break;
			case "onError": {
				


		if (objValue instanceof String) {videoView.setOnErrorListener(new OnErrorListener(this, strValue, "onError"));} else {videoView.setOnErrorListener((MediaPlayer.OnErrorListener) objValue);}



			}
			break;
			case "onInfo": {
				


		if (objValue instanceof String) {videoView.setOnInfoListener(new OnInfoListener(this, strValue, "onInfo"));} else {videoView.setOnInfoListener((MediaPlayer.OnInfoListener) objValue);}



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
			case "resume": {
				


		resume();



			}
			break;
			case "pause": {
				


		pause();



			}
			break;
			case "showMediaControl": {
				


		showMediaControl(objValue);



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
		return videoView;
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

	@SuppressLint("NewApi")
private static class OnInfoListener implements MediaPlayer.OnInfoListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnInfoListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnInfoListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public boolean onInfo (MediaPlayer mp, int what, int extra){
    boolean result = true;
    
	if (action == null || action.equals("onInfo")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onInfo");
	    java.util.Map<String, Object> obj = getOnInfoEventObj(mp,what,extra);
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

public java.util.Map<String, Object> getOnInfoEventObj(MediaPlayer mp,int what,int extra) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "info");
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
    w.updateModelToEventMap(obj, "onInfo", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	
	    @Override
	    public Object asNativeWidget() {
	        return videoView;
	    }

	    private void nativeCreate(Map<String, Object> params) {
	    }
	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			videoView.setId((int) quickConvert(id, "id"));
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

	private boolean showMediaControl = true;
	private MediaController mediaController;
	private void showMediaControl(Object objValue) {
		this.showMediaControl = (boolean) objValue;
		if (this.showMediaControl) {
			 // 2. Add Playback Controls
	        this.mediaController = new MediaController(videoView.getContext());
	        mediaController.setAnchorView(videoView);
	        videoView.setMediaController(mediaController);
		} else {
			this.mediaController = null;
			videoView.setMediaController(null);
		}
		
	}

	private void pause() {
		videoView.pause();
	}

	private void resume() {
		videoView.resume();
	}

	private void start() {
		videoView.start();
	}

	private void seekTo(Object objValue) {
		videoView.seekTo((int) objValue);
	}
	
	private void setVideoPath(Object objValue) {
		String videoPath = (String)objValue;
		if (videoPath.startsWith("http:") || videoPath.startsWith("https:") || videoPath.startsWith("content:")) {
			videoView.setVideoPath(videoPath);
		} else if (fragment.getRootDirectory() == null) {
			Context context = videoView.getContext();
			int id = context.getResources().getIdentifier(videoPath.substring(0, videoPath.indexOf(".")), "raw", context.getPackageName());
			videoView.setVideoPath("android.resource://" + context.getPackageName() + "/" + id);
		} else {
			String cordovaFileUri = com.ashera.widget.PluginInvoker.resolveCDVFileLocation(fragment.getRootDirectory() + "/res/raw/" + videoPath, fragment);
			videoView.setVideoPath(cordovaFileUri);
		}	
	}

	@Override
	public void initialized() {
		super.initialized();
		if (this.showMediaControl && mediaController == null) {
			showMediaControl(true);	
		}
		
	}
}
