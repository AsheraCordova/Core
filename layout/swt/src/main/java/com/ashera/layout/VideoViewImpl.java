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


import org.eclipse.swt.widgets.*;
import org.eclipse.swt.graphics.*;
import androidx.core.view.*;
import static com.ashera.common.DisposeUtil.*;

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

import uk.co.caprica.vlcj.factory.discovery.NativeDiscovery;
import uk.co.caprica.vlcj.media.Media;
import uk.co.caprica.vlcj.media.MediaParsedStatus;
import uk.co.caprica.vlcj.media.MediaRef;
import uk.co.caprica.vlcj.media.Meta;
import uk.co.caprica.vlcj.media.Picture;
import uk.co.caprica.vlcj.player.base.MediaPlayer;
import uk.co.caprica.vlcj.player.base.MediaPlayerEventAdapter;
import uk.co.caprica.vlcj.player.base.State;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.SWT;

@SuppressLint("NewApi")
public class VideoViewImpl extends BaseWidget {
	//start - body
	public final static String LOCAL_NAME = "VideoView"; 
	public final static String GROUP_NAME = "VideoView";

	protected org.eclipse.swt.widgets.Composite composite;
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
        	org.eclipse.swt.widgets.Control control = (org.eclipse.swt.widgets.Control) asNativeWidget();
			appScreenLocation[0] = control.toDisplay(0, 0).x;
        	appScreenLocation[1] = control.toDisplay(0, 0).y;
        }
        @Override
        public void getWindowVisibleDisplayFrame(r.android.graphics.Rect displayFrame){
        	org.eclipse.swt.widgets.Shell shell = ((org.eclipse.swt.widgets.Control)asNativeWidget()).getShell();
        	displayFrame.left = shell.toDisplay(0, 0).x ;
			displayFrame.top = shell.getShell().toDisplay(0, 0).y ;
        	displayFrame.bottom = displayFrame.top + shell.getClientArea().height;
        	displayFrame.right = displayFrame.left + shell.getBounds().width;
        	
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
            org.eclipse.swt.widgets.Control control = ((org.eclipse.swt.widgets.Control)asNativeWidget());
            if (!control.isDisposed()) {
            	control.setVisible(View.VISIBLE == visibility);
            }
            
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
	        return composite;
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
	public int getStyle(String key, int initStyle, Map<String, Object> params, IFragment fragment) {
		if (params == null) {
    		return initStyle;
    	}
    	Object style = params.get(key);
		if (style == null) {
			return initStyle;
		}
		int convertFrom = (int) ConverterFactory.get("swtbitflag").convertFrom(style.toString(), null, fragment);
		return convertFrom;
	}
	
	public int getStyle(Map<String, Object> params, IFragment fragment) {
		return getStyle("swtStyle", org.eclipse.swt.SWT.NONE, params, fragment);
	}
	
	public int getStyle(int initStyle, Map<String, Object> params, IFragment fragment) {
		return getStyle("swtStyle", initStyle, params, fragment);
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
	public boolean isWidgetDisposed() {
		return composite.isDisposed();
	}

	
		//end - body
	private static final String PLAY_BASE64_STR = "4pa2";
	private static final String PAUSE_BASE64_STR = "4p2a4p2a";
	private static final String CHEVRON_UP_BASE64_STR = "4o+2";
	private static final String CHEVRON_DOWN_BASE64_STR = "4o+3";
	private void setVideoPath(Object objValue) {
		String videoPath = (String) objValue;
		if (videoPath.startsWith("http:") || videoPath.startsWith("https:") || videoPath.startsWith("content:")) {
			mediaPlayer.media().play(videoPath);
		} else if (fragment.getRootDirectory() == null) {
			java.net.URL path = com.ashera.utils.FileUtils.getFilePathFromClassPath("res/raw/" + videoPath);
			try {
				String absolutePath = java.nio.file.Paths.get(path.toURI()).toAbsolutePath().toString();
				mediaPlayer.media().play(absolutePath);
			} catch (java.net.URISyntaxException e) {
				throw new RuntimeException(e);
			}
		} else {
			String cordovaFileUri = com.ashera.widget.PluginInvoker.resolveCDVFileLocation(fragment.getRootDirectory() + "/res/raw/" + videoPath, fragment);
			mediaPlayer.media().play(cordovaFileUri);
		}
				
	}
	private EmbeddedMediaPlayer mediaPlayer;
	private boolean onlyOnce;
	private boolean pauseonLoad;
	private Composite overlay;
	private Composite main;
	private Label handleIcon;
	private Button playPause;
	private Label time;
	private Scale seek;

	private void nativeCreate(Map<String, Object> params) {
		this.composite = new org.eclipse.swt.widgets.Composite(
				(org.eclipse.swt.widgets.Composite) ViewImpl.getParent(this), getStyle(params, fragment));
		this.composite.setLayout(new com.ashera.common.AbsoluteLayout());

		new NativeDiscovery().discover();

		com.ashera.layout.vlc.SwtMediaPlayerFactory factory = new com.ashera.layout.vlc.SwtMediaPlayerFactory();
		this.mediaPlayer = factory.mediaPlayers().newEmbeddedMediaPlayer();

		GridLayout gridLayout = new GridLayout(1, true);
		gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 0;

		GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);

		Display display = Display.getDefault();
		Color black = display.getSystemColor(SWT.COLOR_BLACK);
		this.main = new Composite(composite, SWT.NONE);
		main.setLayout(gridLayout);
		main.setLayoutData(gridData);
		main.setBackground(black);

		this.handleIcon = new Label(composite, SWT.NONE);
		this.handleIcon.setCursor(display.getSystemCursor(SWT.CURSOR_HAND));
		this.handleIcon.setText(decodeString(CHEVRON_UP_BASE64_STR));
		this.handleIcon.setFont(new Font(display, "Segoe UI Symbol", 8, SWT.BOLD));
		this.handleIcon.setForeground(display.getSystemColor(SWT.COLOR_WHITE));
		this.handleIcon.setBackground(black);
		Point hsize = this.handleIcon.computeSize(SWT.DEFAULT, SWT.DEFAULT);
		this.handleIcon.setBounds(0, 0, hsize.x, hsize.y);
		handleIcon.addListener(SWT.MouseUp, new org.eclipse.swt.widgets.Listener() {
			@Override
			public void handleEvent(org.eclipse.swt.widgets.Event event) {
				overlay.setVisible(!overlay.isVisible());
				handleIcon.setText(handleIcon.getText().equals(decodeString(CHEVRON_UP_BASE64_STR)) ? decodeString(CHEVRON_DOWN_BASE64_STR) : decodeString(CHEVRON_UP_BASE64_STR));
			}
		});

		Composite videoSurfaceComposite = new Composite(main, SWT.NONE | SWT.EMBEDDED);
		videoSurfaceComposite.setLayout(gridLayout);
		videoSurfaceComposite.setLayoutData(gridData);
		videoSurfaceComposite.setBackground(black);

		this.overlay = new Composite(composite, SWT.NONE);
		overlay.setLayout(new GridLayout(3, false));
		overlay.setBackgroundMode(SWT.INHERIT_FORCE);
		overlay.setBackground(black);

		this.playPause = new Button(overlay, SWT.PUSH);
		playPause.setText(decodeString(PLAY_BASE64_STR));

		this.seek = new Scale(overlay, SWT.HORIZONTAL);
		seek.setMinimum(0);
		seek.setMaximum(1000);
		seek.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		seek.addListener(SWT.Selection, e -> {
			mediaPlayer.controls().setPosition(seek.getSelection() / 1000f);
		});

		this.time = new Label(overlay, SWT.NONE);
		time.setText("00:00/00:00");
		time.setForeground(display.getSystemColor(SWT.COLOR_WHITE));

		com.ashera.layout.vlc.CompositeVideoSurface videoSurface = factory.swt().newCompositeVideoSurface(videoSurfaceComposite);
		mediaPlayer.videoSurface().set(videoSurface);
		playPause.addListener(SWT.MouseUp, new org.eclipse.swt.widgets.Listener() {
			@Override
			public void handleEvent(org.eclipse.swt.widgets.Event event) {
				if (mediaPlayer.status().isPlaying()) {
					mediaPlayer.controls().pause();
					playPause.setText(decodeString(PLAY_BASE64_STR));
				} else {
					mediaPlayer.controls().start();
					mediaPlayer.controls().play();
					playPause.setText(decodeString(PAUSE_BASE64_STR));
				}
			}

		});

		mediaPlayer.events().addMediaPlayerEventListener(new MediaPlayerEventAdapter() {
			@Override
			public void error(uk.co.caprica.vlcj.player.base.MediaPlayer mediaPlayer) {
				super.error(mediaPlayer);
				
				if (onErrorListener != null) {
					onErrorListener.onError(new MediaPlayer(), 1, 0);
				}
			}
			@Override
			public void playing(uk.co.caprica.vlcj.player.base.MediaPlayer mediaPlayer) {
				if (!pauseonLoad) {
					mediaPlayer.controls().pause();
					pauseonLoad = true;
				}
			}

			@Override
			public void videoOutput(uk.co.caprica.vlcj.player.base.MediaPlayer mediaPlayer, int newCount) {
				if (!onlyOnce) {
					java.awt.Dimension videoDimension = mediaPlayer.video().videoDimension();
					PluginInvoker.enqueueTaskForEventLoop(() -> {
						int width = videoDimension.width;
						int height = videoDimension.height;
						measurableView.setVideoWidth(width);
						measurableView.setVideoHeight(height);
						measurableView.requestLayout();
						fragment.remeasure();
						overlay.moveAbove(null);
						handleIcon.moveAbove(null);
						
						if (onPreparedListener != null) {
							onPreparedListener.onPrepared(new MediaPlayer());
						}
					}, 0);
					onlyOnce = true;
				}

			}

			@Override
			public void finished(uk.co.caprica.vlcj.player.base.MediaPlayer mediaPlayer) {
				super.finished(mediaPlayer);
				PluginInvoker.runOnMainThread(() -> {
					playPause.setText(decodeString(PLAY_BASE64_STR));
				});
				
				if (onCompletionListener != null) {
					onCompletionListener.onCompletion(new MediaPlayer());
				}
			}
		});

		display.timerExec(500, new Runnable() {
			@Override
			public void run() {
				if (composite.isDisposed())
					return;

				float pos = mediaPlayer.status().position();
				seek.setSelection((int) (pos * 1000));

				updateTime();
				display.timerExec(500, this);
			}
		});

		overlay.setVisible(false);

		fragment.addDisposable(new Runnable() {
			@Override
			public void run() {
				mediaPlayer.release();
				factory.release();
			}
		});

		fragment.addDisposable(videoSurfaceComposite);
		fragment.addDisposable(overlay);
		fragment.addDisposable(composite);
	}
	private static String formatTime(long ms) {
	    long totalSeconds = ms / 1000;
	    long seconds = totalSeconds % 60;
	    long minutes = (totalSeconds / 60) % 60;
	    long hours = totalSeconds / 3600;

	    if (hours > 0) {
	        return String.format("%d:%02d:%02d", hours, minutes, seconds);
	    }
	    return String.format("%02d:%02d", minutes, seconds);
	}
	
	private void nativeMakeFrameForChildWidget(int l, int t, int r, int b) {
		ViewImpl.nativeMakeFrame(main, 0, 0, r - l, b - t);
		ViewImpl.nativeMakeFrame(overlay, 0, b - t - 50, r - l, b - t);
		Rectangle hbounds = this.handleIcon.getBounds();
		int hwidth = hbounds.width;
		int hheight = hbounds.height;
		ViewImpl.nativeMakeFrame(handleIcon, ((r - l)/2) - (hwidth/2), b - t - hheight, ((r - l)/2) + hwidth/2, b - t);
	}
	
	private void pause() {
		if (mediaPlayer.status().isPlaying()) {
			mediaPlayer.controls().pause();
			playPause.setText(decodeString(PLAY_BASE64_STR));
		}
	}

	private void resume() {
		if (!mediaPlayer.status().isPlaying()) {
			mediaPlayer.controls().play();
			playPause.setText(decodeString(PAUSE_BASE64_STR));
		}
	}

	private void start() {
		pauseonLoad = true;
		if (!mediaPlayer.status().isPlaying()) {
			mediaPlayer.controls().play();
			playPause.setText(decodeString(PAUSE_BASE64_STR));
		}
	}

	private void seekTo(Object objValue) {
		int pos = (int) objValue;
		mediaPlayer.controls().setTime(pos);
		seek.setSelection(pos);
		updateTime();
	}
	
	
	private void showMediaControl(Object objValue) {
		handleIcon.setVisible((boolean) objValue);
	}

	private static String decodeString(String base64) {
	    try {
		    byte[] data = java.util.Base64.getDecoder().decode(base64);
			return new String(data, "UTF-8");
		} catch (java.io.UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
	
	//start - copycode
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
	//end - copycode

	private void updateTime() {
		if (mediaPlayer.media().info() != null) {
			long duration = mediaPlayer.media().info().duration();
			long current = mediaPlayer.status().time();
	
			if (duration > 0 && !time.isDisposed()) {
				time.setText(formatTime(current) + "/" + formatTime(duration));
			}
		}
	}
}
