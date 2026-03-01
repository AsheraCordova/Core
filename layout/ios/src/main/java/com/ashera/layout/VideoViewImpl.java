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

import r.android.content.Context;



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

/*-[
#include "java/lang/Integer.h"
#include "java/lang/Float.h"
#include "java/lang/Boolean.h"
#include <UIKit/UIKit.h>
#include "HasLifeCycleDecorators.h"
]-*/

import com.google.j2objc.annotations.Property;

import static com.ashera.widget.IWidget.*;
//end - imports

/*-[
#include "ASUIView.h"
#import <AVKit/AVKit.h>
#import <AVFoundation/AVFoundation.h>
]-*/
@SuppressLint("NewApi")
public class VideoViewImpl extends BaseWidget {
	//start - body
	public final static String LOCAL_NAME = "VideoView"; 
	public final static String GROUP_NAME = "VideoView";

	protected @Property Object uiView;
	protected r.android.widget.VideoView measurableView;		
	
	
	@Override
	public void loadAttributes(String attributeName) {
		ViewImpl.register(attributeName);


		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("videoPath").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onPrepared").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onCompletion").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onError").withType("string"));
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

@com.google.j2objc.annotations.WeakOuter		
	public class VideoViewExt extends r.android.widget.VideoView implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		private List<IWidget> overlays;
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

		public VideoViewExt() {
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
			ViewImpl.setDrawableBounds(VideoViewImpl.this, l, t, r, b);
			if (!isOverlay()) {
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			nativeMakeFrameForChildWidget(l, t, r, b);
			}
			replayBufferedEvents();
	        ViewImpl.redrawDrawables(VideoViewImpl.this);
	        overlays = ViewImpl.drawOverlay(VideoViewImpl.this, overlays);
			
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
        		ViewImpl.drawableStateChanged(VideoViewImpl.this);
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
    		
    		IWidget widget = template.loadLazyWidgets(VideoViewImpl.this.getParent());
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
        	VideoViewImpl.this.getParent().remove(VideoViewImpl.this);
		}
        @Override
        public void getLocationOnScreen(int[] appScreenLocation) {
        	appScreenLocation[0] = ViewImpl.getLocationXOnScreen(asNativeWidget());
        	appScreenLocation[1] = ViewImpl.getLocationYOnScreen(asNativeWidget());
        }
        @Override
        public void getWindowVisibleDisplayFrame(r.android.graphics.Rect displayFrame){
        	
        	displayFrame.left = ViewImpl.getLocationXOnScreen(asNativeWidget());
        	displayFrame.top = ViewImpl.getLocationYOnScreen(asNativeWidget());
        	displayFrame.right = displayFrame.left + getWidth();
        	displayFrame.bottom = displayFrame.top + getHeight();
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
			VideoViewImpl.this.setAttribute(name, value, !(value instanceof String));
		}
        @Override
        public void setVisibility(int visibility) {
            super.setVisibility(visibility);
            ViewImpl.nativeSetVisibility(asNativeWidget(), visibility != View.VISIBLE);
            
        }
        
    	public void setState0(Object value) {
    		ViewImpl.setState(VideoViewImpl.this, 0, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(VideoViewImpl.this, 1, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(VideoViewImpl.this, 2, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(VideoViewImpl.this, 3, value);
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
		measurableView = new VideoViewExt();
		nativeCreate(params);	
		ViewImpl.registerCommandConveter(this);
		setWidgetOnNativeClass();
	}
	private native void setWidgetOnNativeClass() /*-[
		((ASUIView*) self.uiView).widget = self;
	]-*/;

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
		return measurableView;
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
	
	private com.ashera.layout.VideoViewImpl.MediaPlayer.OnErrorListener onErrorListener;
	private com.ashera.layout.VideoViewImpl.MediaPlayer.OnCompletionListener onCompletionListener;
	private com.ashera.layout.VideoViewImpl.MediaPlayer.OnPreparedListener onPreparedListener;

	private void setOnErrorListener(com.ashera.layout.VideoViewImpl.MediaPlayer.OnErrorListener onErrorListener) {
		this.onErrorListener = onErrorListener;
	}

	private void setOnCompletionListener(com.ashera.layout.VideoViewImpl.MediaPlayer.OnCompletionListener onCompletionListener) {
		this.onCompletionListener = onCompletionListener;
	}

	private void setOnPreparedListener(com.ashera.layout.VideoViewImpl.MediaPlayer.OnPreparedListener onPreparedListener) {
		this.onPreparedListener = onPreparedListener;
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

	
		@Override
	    public Object asNativeWidget() {
	        return uiView;
	    }
	    public native boolean checkIosVersion(String v) /*-[
			return ([[[UIDevice currentDevice] systemVersion] compare:v options:NSNumericSearch] == NSOrderedDescending);
		]-*/;
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

	
		//end - body

    protected @Property Object avplayer;
    protected @Property Object avplayerVC;
	private void nativeMakeFrameForChildWidget(int l, int t, int r, int b) {
		ViewImpl.nativeMakeFrame(getPlayerVCView(), 0, 0, r - l, b - t);
	}
	
	private native Object getPlayerVCView() /*-[
		return ((AVPlayerViewController*) self->avplayerVC_).view;
	]-*/;

	@com.google.j2objc.annotations.WeakOuter
	private final class DeallocHandler implements Runnable {
		@Override
		public void run() {
			nativeRelease();
		}
	}
	private void nativeCreate(Map<String, Object> params) {
		createView();
		
		PluginInvoker.postDelayed(() -> {
			addChildViewController(avplayerVC, getFragment().getRootWidget().asNativeWidget());
		}, 0);
		fragment.addDisposable(new DeallocHandler());
	}
	
	private native void createView()/*-[
		ASUIView* uiView = [ASUIView new];
		uiView.backgroundColor = [UIColor clearColor];
		self->uiView_ = uiView;

		AVPlayer *player = [[AVPlayer alloc] init];
		self->avplayer_ = player;

		AVPlayerViewController *playerVC = [[AVPlayerViewController alloc] init];
		playerVC.player = player;
		playerVC.showsPlaybackControls = YES;
		self->avplayerVC_ = playerVC;
		
    	[uiView addSubview:playerVC.view];
	]-*/;
	

	private native void addChildViewController(Object navController, Object rootView)/*-[
	    UIViewController* currentController = (UIViewController*) [[((ASUIView*) rootView) nextResponder] nextResponder];
	    [(UIViewController*)navController willMoveToParentViewController:currentController];
	    [currentController addChildViewController:navController];
	    [(UIViewController*)navController didMoveToParentViewController:currentController];
	]-*/;
	
	private void setVideoPath(Object objValue) {
		String videoPath = (String) objValue;
		if (videoPath.startsWith("http:") || videoPath.startsWith("https:") || videoPath.startsWith("content:")) {
			nativeSetVideoPathRemote(videoPath);
		} else if (fragment.getRootDirectory() != null) {
			String cordovaFileUri = com.ashera.widget.PluginInvoker.resolveCDVFileLocation(fragment.getRootDirectory() + "/res/raw/" + videoPath, fragment);
			nativeSetVideoPathLocal(cordovaFileUri);
		} else if (videoPath.startsWith("cordova.file")) {
			String cordovaFileUri = com.ashera.widget.PluginInvoker.resolveCDVFileLocation(videoPath, fragment);
			nativeSetVideoPathLocal(cordovaFileUri);
		} else {
			nativeSetVideoPathReource("raw/" + videoPath);
		}
	}
	
	private native void nativeSetVideoPathReource(String path)/*-[
		NSString *absPath = [[NSBundle mainBundle] pathForResource:path ofType:nil];
		if (absPath) {
	    	NSURL *newURL = [NSURL fileURLWithPath:absPath];
	    	[self replaceItemWithURL: newURL player:((AVPlayer*) self->avplayer_)];
		}
	]-*/;
	
	private native void nativeSetVideoPathLocal(String path)/*-[
		NSURL *newURL = [NSURL fileURLWithPath:path];
    	[self replaceItemWithURL: newURL player:((AVPlayer*) self->avplayer_)];
	]-*/;

	private native void nativeSetVideoPathRemote(String path)/*-[
		NSURL *newURL = [NSURL URLWithString:path];
	    [self replaceItemWithURL: newURL player:((AVPlayer*) self->avplayer_)];
    ]-*/;

	private void showMediaControl(Object obj) {
		nativeShowMediaControl((boolean) obj);
	}
	private native void nativeShowMediaControl(boolean show) /*-[
		AVPlayerViewController *playerVC = (AVPlayerViewController*) self->avplayerVC_;
		playerVC.showsPlaybackControls = show;
	]-*/;

	private void pause() {
		nativePause();
	}
	
	private native void nativePlay() /*-[
		[(AVPlayer*) self->avplayer_ play];
	]-*/;
	
	private native void nativePause() /*-[
		[(AVPlayer*) self->avplayer_ pause];
	]-*/;
	private void resume() {
		nativePlay();
	}

	private void start() {
		nativePlay();
	}

	private void seekTo(Object objValue) {
		nativeSeekTo((int) objValue);
	}

	private native void nativeRelease() /*-[
		[self replaceItemWithURL: nil player: ((AVPlayer*) self->avplayer_)];
	]-*/;
	private native void nativeSeekTo(int milliseconds) /*-[
		Float64 seconds = milliseconds / 1000.0;
		CMTime targetTime = CMTimeMakeWithSeconds(seconds, NSEC_PER_SEC);
		[(AVPlayer*) self->avplayer_ seekToTime:targetTime];
	]-*/;

	/*-[
		- (void)replaceItemWithURL:(NSURL *)url player:(AVPlayer *)player {
		    AVPlayerItem *oldItem = player.currentItem;
		    if (oldItem) {
		        @try {
		            [oldItem removeObserver:self forKeyPath:@"status"];
		        } @catch (NSException *exception) {
		        }
		        
		         @try {
		            [[NSNotificationCenter defaultCenter] removeObserver:self];
		        } @catch (NSException *exception) {
		        }
		    }
		
			if (url) {
			    AVPlayerItem *newItem = [AVPlayerItem playerItemWithURL:url];
			
			    [newItem addObserver:self
			              forKeyPath:@"status"
			                 options:NSKeyValueObservingOptionNew
			                 context:nil];
				[[NSNotificationCenter defaultCenter]
				     addObserver:self
				     selector:@selector(onPlaybackCompleted:)
				     name:AVPlayerItemDidPlayToEndTimeNotification
				     object: newItem];
			    [player replaceCurrentItemWithPlayerItem:newItem];
		    }
		}
		
		- (void)observeValueForKeyPath:(NSString *)keyPath 
					ofObject:(id)object 
					change:(NSDictionary *)change
				    context:(void *)context {
				
				if (![keyPath isEqualToString:@"status"]) {
					return;
				}
				
				AVPlayerItem *item = (AVPlayerItem *)object;
				
				if (item.status == AVPlayerItemStatusReadyToPlay) {
					CGSize size = item.presentationSize;
            		CGFloat width = size.width;
            		CGFloat height = size.height;
					[self onPrepareWithInt: (int)width withInt: (int) height];
				}
				else if (item.status == AVPlayerItemStatusFailed) {
					[self onError];
				}
				else {
					// nothing to do
				}
		}
		
		- (void)onPlaybackCompleted:(NSNotification *)notification {
			[self onComplete];
		}
	]-*/
	
	private void onComplete() {
		if (onCompletionListener != null) {
			onCompletionListener.onCompletion(new MediaPlayer());
		}
	}
	
	private void onPrepare(int width, int height) {
		measurableView.setVideoWidth(width);
		measurableView.setVideoHeight(height);
		measurableView.requestLayout();

		PluginInvoker.enqueueTaskForEventLoop(() -> {
			fragment.remeasure();
			
			if (onPreparedListener != null) {
				onPreparedListener.onPrepared(new MediaPlayer());
			}
		}, 0);		
	}
	
	private void onError() {
		if (onErrorListener != null) {
			onErrorListener.onError(new MediaPlayer(), 1, 0);
		}
	}
	
	static {
		initAudioSession();
	}

	private native static void initAudioSession() /*-[
		NSError *error = nil;
		[[AVAudioSession sharedInstance] setCategory:AVAudioSessionCategoryPlayback error:&error];
		[[AVAudioSession sharedInstance] setActive:YES error:&error];
	]-*/;
}
