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
import android.widget.PopupWindow;
import android.graphics.drawable.Drawable;
@SuppressLint("NewApi")
public class PopupWindowImpl extends BaseWidget {
	//start - body
	private View viewStub;
	public final static String LOCAL_NAME = "com.ashera.layout.PopupWindow"; 
	public final static String GROUP_NAME = "PopupWindow";
	
	
	@Override
	public void loadAttributes(String attributeName) {

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("overlapAnchor").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("popupBackground").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("popupElevation").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("contentView").withType("template"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("outsideTouchable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("height").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("width").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("showAtLocation").withType("object"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("showAsDropDown").withType("object"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("dismiss").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onDismiss").withType("string"));

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
		
        viewStub = new ViewStub((Context) fragment.getRootActivity());
		nativeCreate(fragment, params);	
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
			case "popupBackground": {
				


	popupWindow.setBackgroundDrawable((Drawable)objValue);



			}
			break;
			case "popupElevation": {
				


	popupWindow.setElevation((float)objValue);



			}
			break;
			case "contentView": {
				


		setContentView(objValue);



			}
			break;
			case "outsideTouchable": {
				


	popupWindow.setOutsideTouchable((boolean)objValue);



			}
			break;
			case "height": {
				


	popupWindow.setHeight((int)objValue);



			}
			break;
			case "width": {
				


	popupWindow.setWidth((int)objValue);



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
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
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
    obj.put("namespace", w.getFragment().getNamespace());
    
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
	public Class getViewClass() {
		return View.class;
	}
	//end - body
    
	

    
	private PopupWindow popupWindow;
	private void nativeCreate(IFragment fragment, Map<String, Object> params) {
		Context context = (Context) fragment.getRootActivity();
		popupWindow= new PopupWindow(context);
	}

	@Override
	public Object asNativeWidget() {
		return viewStub;
	}
	
	private void showAtLocation(Object gravity, Object x, Object y) {	
		setContentView();
		popupWindow.showAtLocation((View) getFragment().getRootWidget().asWidget(), (int) gravity, (int) x, (int) y);
	}
	
	private IWidget contentView;
	private void setContentView(Object objValue) {
		this.contentView = (IWidget) objValue;
	}
	
	public void setContentView() {
		if (contentView != null) {
			IWidget wiget = this.contentView.loadLazyWidgets((com.ashera.model.LoopParam) null);
			popupWindow.setContentView((View) wiget.asNativeWidget());
		}
	}

	
	private void showAsDropDown(Object anchor, Object gravity, Object xoff, Object yoff) {
		setContentView();
		popupWindow.showAsDropDown((View) getFragment().getRootWidget().findWidgetById((String) anchor).asWidget(), (int) xoff, (int) yoff, (int) gravity);
	}

	private void dismiss() {
		popupWindow.dismiss();
	}

}
