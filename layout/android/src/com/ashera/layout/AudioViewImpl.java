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


import java.io.IOException;
//start - imports
import java.util.*;

import android.content.*;
import android.graphics.*;
import android.os.Build;
import android.view.*;

import com.ashera.core.IFragment;
import com.ashera.converter.*;
import android.annotation.SuppressLint;

import com.ashera.widget.bus.*;
import com.ashera.widget.*;


import static com.ashera.widget.IWidget.*;
//end - imports
import android.media.MediaPlayer;
@SuppressLint("NewApi")
public class AudioViewImpl extends BaseWidget {
	//start - body
	private View viewStub;
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
		
        viewStub = new ViewStub((Context) fragment.getRootActivity());
		nativeCreate(fragment, params);	
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

	
	

    @Override
    public Object asNativeWidget() {
        return viewStub;
        
    }
    @Override
	public Class getViewClass() {
		return View.class;
	}
	//end - body
    
    enum State {
        IDLE,
        PREPARING,
        PREPARED,
        STARTED,
        PAUSED,
        STOPPED,
        ERROR
    }
    private State currentState = State.IDLE;
	private MediaPlayer mediaPlayer;
	private void pause() {
        if (currentState == State.STARTED) {
            mediaPlayer.pause();
            currentState = State.PAUSED;
        }
	}

	private void start() {
        try {
            if (currentState == State.IDLE || currentState == State.STOPPED) {
                currentState = State.PREPARING;
                mediaPlayer.prepare();
            } else if (currentState == State.PAUSED || currentState == State.PREPARED) {
                mediaPlayer.start();
                currentState = State.STARTED;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

	private void seekTo(Object objValue) {
        try {
            if (currentState == State.STOPPED) {
                currentState = State.PAUSED;
                mediaPlayer.prepare();
            }

            mediaPlayer.seekTo((int) objValue);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
	}
	
	private void setDataSource(Object objValue) {
		try {
			String datasource = (String)objValue;
			if (datasource.startsWith("http:") || datasource.startsWith("https:") || datasource.startsWith("content:")) {
				mediaPlayer.setDataSource(datasource);
			} else if (fragment.getRootDirectory() != null) {
                String cordovaFileUri = com.ashera.widget.PluginInvoker.resolveCDVFileLocation(fragment.getRootDirectory() + "/res/raw/" + datasource, fragment);
                mediaPlayer.setDataSource(cordovaFileUri);
            } else if (datasource.startsWith("cordova.file")) {
                String cordovaFileUri = com.ashera.widget.PluginInvoker.resolveCDVFileLocation(datasource, fragment);
                mediaPlayer.setDataSource(cordovaFileUri);
            } else {
				Context context = viewStub.getContext();
				int id = context.getResources().getIdentifier(datasource.substring(0, datasource.indexOf(".")), "raw", context.getPackageName());
				mediaPlayer.setDataSource(context, android.net.Uri.parse("android.resource://" + context.getPackageName() + "/" + id));
			}
		} catch (IllegalArgumentException e) {
			throw new RuntimeException(e);
		} catch (IllegalStateException e) {
			throw new RuntimeException(e);
		} catch (SecurityException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}	
	}

    
	private void nativeCreate(IFragment fragment, Map<String, Object> params) {
		mediaPlayer = new MediaPlayer();
		mediaPlayer.setAudioStreamType(android.media.AudioManager.STREAM_MUSIC);
        mediaPlayer.setVolume(0.5f, 0.5f);
        currentState = State.IDLE;
		mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
			@Override
			public void onPrepared(MediaPlayer mp) {
                if (currentState == State.PREPARING) {
                    currentState = State.PREPARED;
                    if (onPreparedListener != null) {
                        onPreparedListener.onPrepared(mp);
                    }
                    start();
                }
			}
		});

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer mp) {
                if (onCompletionListener != null) {
                    onCompletionListener.onCompletion(mp);
                }
                mediaPlayer.stop();
                currentState = State.STOPPED;
            }
        });

        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() {

            @Override
            public boolean onError(MediaPlayer mp, int what, int extra) {
                if (onErrorListener != null) {
                    onErrorListener.onError(mp, what, extra);
                }
                currentState = State.ERROR;
                return false;
            }
        });
		fragment.addDisposable(new Runnable() {
			@Override
			public void run() {
				mediaPlayer.release();
			} 
		});
	}

    private MediaPlayer.OnErrorListener onErrorListener;
    private MediaPlayer.OnPreparedListener onPreparedListener;
    private MediaPlayer.OnCompletionListener onCompletionListener;
	private void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
		this.onErrorListener = onErrorListener;
	}
	
	private void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.onPreparedListener = onPreparedListener;
	}
	
	private void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
	    this.onCompletionListener = onCompletionListener;

	}

}
