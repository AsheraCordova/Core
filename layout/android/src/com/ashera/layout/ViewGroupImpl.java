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

import androidx.core.view.*;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

import android.annotation.SuppressLint;

import com.ashera.widget.*;
import com.ashera.converter.*;
import com.ashera.layout.ViewGroupModelImpl;

import static com.ashera.widget.IWidget.*;
//end - imports
public class ViewGroupImpl {
	// start - body
	private ViewGroupImpl() {
	}
		@SuppressLint("NewApi")
		final static class DescendantFocusability extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("afterDescendants",  0x40000);
				mapping.put("beforeDescendants",  0x20000);
				mapping.put("blocksDescendants",  0x60000);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class LayoutMode extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("clipBounds",  0x0);
				mapping.put("opticalBounds",  0x1);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class PersistentDrawingCache  extends AbstractBitFlagConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("all", 0x3);
				mapping.put("animation", 0x1);
				mapping.put("none", 0x0);
				mapping.put("scrolling", 0x2);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class LayoutTransition  extends AbstractBitFlagConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("change_appearing", 0x01);
				mapping.put("change_disappearing", 0x02);
				mapping.put("appearing", 0x04);
				mapping.put("disappearing", 0x08);
				mapping.put("changing", 0x10);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
	public static void register(String localName) {
		ViewGroupModelImpl.register(localName);

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("alwaysDrawnWithCache").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("animationCache").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("clipChildren").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("clipToPadding").withType("boolean"));
		ConverterFactory.register("ViewGroup.descendantFocusability", new DescendantFocusability());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("descendantFocusability").withType("ViewGroup.descendantFocusability"));
		ConverterFactory.register("ViewGroup.layoutMode", new LayoutMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layoutMode").withType("ViewGroup.layoutMode"));
		ConverterFactory.register("ViewGroup.persistentDrawingCache", new PersistentDrawingCache());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("persistentDrawingCache").withType("ViewGroup.persistentDrawingCache"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("splitMotionEvents").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onChildViewAdded").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onChildViewRemoved").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("animateLayoutChanges").withType("boolean"));
		ConverterFactory.register("ViewGroup.layoutTransition", new LayoutTransition());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layoutTransition").withType("ViewGroup.layoutTransition"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layoutTransitionDuration").withType("int").withOrder(3));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("animateParentHierarchy").withType("boolean").withOrder(3));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("listitem").withType("template"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("addStatesFromChildren").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("childXml").withType("resourcestring"));
		
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_marginBottom").withType("dimension").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_marginTop").withType("dimension").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_marginStart").withType("dimension").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_marginEnd").withType("dimension").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_marginLeft").withType("dimension").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_marginRight").withType("dimension").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_margin").withType("dimension").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_marginHorizontal").withType("dimension").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_marginVertical").withType("dimension").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_width").withType("dimension").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_height").withType("dimension").forChild());
	}
	
	public static void setAttribute(IWidget w, SimpleWrapableView wrapperView,
			WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		ViewGroupModelImpl.setAttribute(w, wrapperView, key, strValue, objValue, decorator);
		if (wrapperView.isViewWrapped() && key.getSimpleWrapableViewStrategy() != 0) {
			if ((key.getSimpleWrapableViewStrategy() & IWidget.APPLY_TO_VIEW_WRAPPER) != 0) {
				setMyAttribute(w, wrapperView.getWrappedView(), key, strValue, objValue, decorator);
			}
			
			if ((key.getSimpleWrapableViewStrategy() & IWidget.APPLY_TO_VIEW_HOLDER) != 0) {
				setMyAttribute(w, wrapperView.getWrapperViewHolder(), key, strValue, objValue, decorator);
			}
			
			if (((key.getSimpleWrapableViewStrategy() & IWidget.APPLY_TO_FOREGROUND) != 0) && wrapperView.getForeground() != null) {
				setMyAttribute(w, wrapperView.getForeground(), key, strValue, objValue, decorator);
			}
		} else {
			setMyAttribute(w, w.asNativeWidget(), key, strValue, objValue, decorator);
		}
	}
	
	@SuppressLint("NewApi")
	public static void setAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		ViewGroupModelImpl.setAttribute(w, key, strValue, objValue, decorator);
		setMyAttribute(w, key, strValue, objValue, decorator);
	}
	
	private static void setMyAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		setMyAttribute(w, w.asNativeWidget(), key, strValue, objValue, decorator);
	}
	private static void setMyAttribute(IWidget w, Object nativeWidget, WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		ViewGroup viewGroup = ((ViewGroup) w.asWidget());

		switch (key.getAttributeName()) {
			case "alwaysDrawnWithCache": {


	viewGroup.setAlwaysDrawnWithCacheEnabled((boolean)objValue);



			}
			break;
			case "animationCache": {


	viewGroup.setAnimationCacheEnabled((boolean)objValue);



			}
			break;
			case "clipChildren": {


	viewGroup.setClipChildren((boolean)objValue);



			}
			break;
			case "clipToPadding": {


	viewGroup.setClipToPadding((boolean)objValue);



			}
			break;
			case "descendantFocusability": {


	viewGroup.setDescendantFocusability((int)objValue);



			}
			break;
			case "layoutMode": {
if (Build.VERSION.SDK_INT >= 18) {

	viewGroup.setLayoutMode((int)objValue);

}

			}
			break;
			case "persistentDrawingCache": {


	viewGroup.setPersistentDrawingCache((int)objValue);



			}
			break;
			case "splitMotionEvents": {
if (Build.VERSION.SDK_INT >= 11) {

	viewGroup.setMotionEventSplittingEnabled((boolean)objValue);

}

			}
			break;
			case "onChildViewAdded": {


		if (objValue instanceof String) {viewGroup.setOnHierarchyChangeListener(new OnHierarchyChangeListener(w, strValue));} else {setOnHierarchyChangeListener(viewGroup, objValue);}



			}
			break;
			case "onChildViewRemoved": {


		if (objValue instanceof String) {viewGroup.setOnHierarchyChangeListener(new OnHierarchyChangeListener(w, strValue));} else {setOnHierarchyChangeListener(viewGroup, objValue);}



			}
			break;
			case "animateLayoutChanges": {


		animateLayoutChanges(objValue, viewGroup);



			}
			break;
			case "layoutTransition": {


		setLayoutTransition(objValue, viewGroup);



			}
			break;
			case "layoutTransitionDuration": {


		setLayoutTransitionDuration(objValue, viewGroup);



			}
			break;
			case "animateParentHierarchy": {


		setAnimateParentHierarchy(objValue, viewGroup);



			}
			break;
			case "listitem": {


		 addTemplate(w, objValue);



			}
			break;
			case "addStatesFromChildren": {


		 viewGroup.setAddStatesFromChildren((boolean) objValue);



			}
			break;
			case "childXml": {


		 setChild(w, objValue);



			}
			break;
		default:
			break;
		}
	}
	@SuppressLint("NewApi")
	public static void setChildAttribute(IWidget w, WidgetAttribute key, Object objValue, Object layoutParams) {
		switch (key.getAttributeName()) {
			case "layout_marginBottom": {
				
							setBottomMargin(objValue, layoutParams);
				
			}
			break;
			case "layout_marginTop": {
				
							setTopMargin(objValue, layoutParams);
				
			}
			break;
			case "layout_marginStart": {
				if (Build.VERSION.SDK_INT >= 17) {
							setStartMargin(objValue, layoutParams, w);
				}
			}
			break;
			case "layout_marginEnd": {
				if (Build.VERSION.SDK_INT >= 17) {
							setEndMargin(objValue, layoutParams, w);
				}
			}
			break;
			case "layout_marginLeft": {
				
							setLeftMargin(objValue, layoutParams, w);
				
			}
			break;
			case "layout_marginRight": {
				
							setRightMargin(objValue, layoutParams, w);
				
			}
			break;
			case "layout_margin": {
				
							setMargin(objValue, layoutParams, w);
				
			}
			break;
			case "layout_marginHorizontal": {
				
							setHorizontalMargin(objValue, layoutParams, w);
				
			}
			break;
			case "layout_marginVertical": {
				
							setVerticalMargin(objValue, layoutParams, w);
				
			}
			break;
		default:
			break;
		}
	}
	
	@SuppressLint("NewApi")
	public static Object getAttribute(IWidget w, WidgetAttribute key, ILifeCycleDecorator decorator) {
		ViewGroup viewGroup = ((ViewGroup) w.asWidget());
		Object attributeValue = ViewGroupModelImpl.getAttribute(w, key, decorator);
		if (attributeValue != null) {
			return attributeValue;
		}
		
		switch (key.getAttributeName()) {
			case "alwaysDrawnWithCache": {				
return viewGroup.isAlwaysDrawnWithCacheEnabled();			}
			case "animationCache": {				
return viewGroup.isAnimationCacheEnabled();			}
			case "clipChildren": {				
if (Build.VERSION.SDK_INT >= 18) {
return viewGroup.getClipChildren();
}
break;			}
			case "clipToPadding": {				
return viewGroup.getClipToPadding();			}
			case "descendantFocusability": {				
return viewGroup.getDescendantFocusability();			}
			case "layoutMode": {				
if (Build.VERSION.SDK_INT >= 18) {
return viewGroup.getLayoutMode();
}
break;			}
			case "persistentDrawingCache": {				
return viewGroup.getPersistentDrawingCache();			}
			case "splitMotionEvents": {				
if (Build.VERSION.SDK_INT >= 11) {
return viewGroup.isMotionEventSplittingEnabled();
}
break;			}
			case "addStatesFromChildren": {				
return viewGroup.addStatesFromChildren();			}
		}
		return null;
	}
	
	@SuppressLint("NewApi")
	public static Object getChildAttribute(IWidget w, WidgetAttribute key) {
		View viewGroup = ((View) w.asWidget());
		
		switch (key.getAttributeName()) {
			case "layout_marginBottom": {				
return getBottomMargin(viewGroup);			}
			case "layout_marginTop": {				
return getTopMargin(viewGroup);			}
			case "layout_marginStart": {				
return getLeftMargin(viewGroup);			}
			case "layout_marginEnd": {				
return getRightMargin(viewGroup);			}
			case "layout_marginLeft": {				
return getLeftMargin(viewGroup);			}
			case "layout_marginRight": {				
return getRightMargin(viewGroup);			}
		}
		return null;
	}
	
	
	@SuppressLint("NewApi")
private static class OnHierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnHierarchyChangeListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnHierarchyChangeListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onChildViewAdded (View parent, 
                View child){
    
	if (action == null || action.equals("onChildViewAdded")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onChildViewAdded");
	    java.util.Map<String, Object> obj = getOnChildViewAddedEventObj(parent,child);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, parent,child);
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
}//
public void onChildViewRemoved (View parent, 
                View child){
    
	if (action == null || action.equals("onChildViewRemoved")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onChildViewRemoved");
	    java.util.Map<String, Object> obj = getOnChildViewRemovedEventObj(parent,child);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, parent,child);
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

public java.util.Map<String, Object> getOnChildViewRemovedEventObj(View parent,View child) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "childviewremoved");
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
    w.updateModelToEventMap(obj, "onChildViewRemoved", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}

public java.util.Map<String, Object> getOnChildViewAddedEventObj(View parent,View child) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "childviewadded");
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
    w.updateModelToEventMap(obj, "onChildViewAdded", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	
	@SuppressLint("NewApi")
	public static boolean isAttributeSupported(WidgetAttribute key) {
		switch (key.getAttributeName()) {
			case "alwaysDrawnWithCache": {
				return true;
			}
			case "animationCache": {
				return true;
			}
			case "clipChildren": {
				return true;
			}
			case "clipToPadding": {
				return true;
			}
			case "descendantFocusability": {
				return true;
			}
			case "layoutMode": {
				return true;
			}
			case "persistentDrawingCache": {
				return true;
			}
			case "splitMotionEvents": {
				return true;
			}
			case "onChildViewAdded": {
				return true;
			}
			case "onChildViewRemoved": {
				return true;
			}
			case "animateLayoutChanges": {
				return true;
			}
			case "layoutTransition": {
				return true;
			}
			case "layoutTransitionDuration": {
				return true;
			}
			case "animateParentHierarchy": {
				return true;
			}
			case "listitem": {
				return true;
			}
			case "addStatesFromChildren": {
				return true;
			}
			case "childXml": {
				return true;
			}
		default:
			break;
		}
		return false;
	}

	// end - body
	public static void nativeAddView(Object asNativeWidget, Object asNativeWidget2) {
	}
	
	//start - viewcode
	public static void setMargin(Object objValue, Object layoutParams, IWidget w) {
        setBottomMargin(objValue, layoutParams);
        setTopMargin(objValue, layoutParams);
        setStartMargin(objValue, layoutParams, w);
        setEndMargin(objValue, layoutParams, w);
    }
	public static void setBottomMargin(Object objValue,  Object layoutParams) {		
		int valueInt = (int)objValue;          
		if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {          
				((android.view.ViewGroup.MarginLayoutParams)layoutParams).bottomMargin = valueInt;         
		}		
	}
	public static void setTopMargin(Object objValue,  Object layoutParams) {		
		int valueInt = (int)objValue;          
		if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {          
				((android.view.ViewGroup.MarginLayoutParams)layoutParams).topMargin = valueInt;         
		}		
	}
	
	
	
	private static void setVerticalMargin(Object objValue, Object layoutParams, IWidget w) {		
		int valueInt = (int)objValue;          
		if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {          
				((android.view.ViewGroup.MarginLayoutParams)layoutParams).topMargin = valueInt;         
				((android.view.ViewGroup.MarginLayoutParams)layoutParams).bottomMargin = valueInt;         
		}		
	}
	
	public static void setLeftMargin(Object objValue,  Object layoutParams, IWidget w) {	
		if (Build.VERSION.SDK_INT >= 17) {
			setStartMargin(objValue, layoutParams, w);
		} else {
			int valueInt = (int)objValue;          
			if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {          
					((android.view.ViewGroup.MarginLayoutParams)layoutParams).leftMargin = valueInt;         
			}	
		}
	}
	
	public static void setRightMargin(Object objValue,  Object layoutParams, IWidget w) {	
		if (Build.VERSION.SDK_INT >= 17) {
			setEndMargin(objValue, layoutParams, w);
		} else {
			int valueInt = (int)objValue;          
			if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {          
					((android.view.ViewGroup.MarginLayoutParams)layoutParams).rightMargin = valueInt;         
			}
		}
	}


	private static void setHorizontalMargin(Object objValue, Object layoutParams, IWidget w) {	
		if (Build.VERSION.SDK_INT >= 17) {
			setEndMargin(objValue, layoutParams, w);
			setStartMargin(objValue, layoutParams, w);
		} else {
			int valueInt = (int)objValue;          
			if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {          
					((android.view.ViewGroup.MarginLayoutParams)layoutParams).rightMargin = valueInt;         
					((android.view.ViewGroup.MarginLayoutParams)layoutParams).leftMargin = valueInt;
			}
		}
	}
	
	@SuppressLint("NewApi")
	public static void setEndMargin(Object objValue,  Object layoutParams, IWidget w) {		
		int valueInt = (int)objValue;          
		if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {    
			 android.view.ViewGroup.MarginLayoutParams marginParams = (android.view.ViewGroup.MarginLayoutParams)layoutParams;
			 marginParams.setMarginEnd(valueInt);
			 ((View) w.asWidget()).setLayoutParams(marginParams);
		}		
	}
	
	@SuppressLint("NewApi")
	public static void setStartMargin(Object objValue,  Object layoutParams, IWidget w) {		
		int valueInt = (int)objValue;          
		if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {    
			 android.view.ViewGroup.MarginLayoutParams marginParams = (android.view.ViewGroup.MarginLayoutParams)layoutParams;
			 marginParams.setMarginStart(valueInt);
			 ((View) w.asWidget()).setLayoutParams(marginParams);
		}		
	}

	
	
	private static Object getRightMargin(View viewGroup) {
		return ((android.view.ViewGroup.MarginLayoutParams)viewGroup.getLayoutParams()).getMarginEnd();
	}

	private static Object getLeftMargin(View viewGroup) {
		return ((android.view.ViewGroup.MarginLayoutParams)viewGroup.getLayoutParams()).getMarginStart();
	}

	private static Object getTopMargin(View viewGroup) {
		return ((android.view.ViewGroup.MarginLayoutParams)viewGroup.getLayoutParams()).topMargin;
	}

	private static Object getBottomMargin(View viewGroup) {
		return ((android.view.ViewGroup.MarginLayoutParams)viewGroup.getLayoutParams()).bottomMargin;
	}
    
	private static void addTemplate(IWidget w, Object objValue) {
		((HasWidgets)w).addTemplate(objValue); 
		
	}

	private static void setChild(IWidget w, Object xml) {
		if (w instanceof HasWidgets) {
			HasWidgets hasWidgets = (HasWidgets) w;
			hasWidgets.clear();
			PluginInvoker.parseWithParent((String) xml, false, hasWidgets, w.getFragment());

			String javascript = w.getFragment().getInlineResource("javascript");
			if (javascript != null) {
				Map<String, Object> dataMap = com.ashera.widget.PluginInvoker.getJSONCompatMap();
				dataMap.put("action", "nativeevent");
				dataMap.put("fragmentId", w.getFragment().getFragmentId());
				dataMap.put("javascript", javascript);
				w.getFragment().getRootActivity().sendEventMessage(dataMap);
			}
		}
	}


	@SuppressLint("NewApi")
	private static void animateLayoutChanges(Object objValue, ViewGroup view) {
		if (Build.VERSION.SDK_INT >= 11) {
			if (objValue != null && (boolean) objValue) {
				android.animation.LayoutTransition lt = new android.animation.LayoutTransition();
				lt.setAnimateParentHierarchy(false);
				view.setLayoutTransition(lt);
			} else {
				view.setLayoutTransition(null);
			}
		}
		
	}
	
	private static void setAnimateParentHierarchy(Object objValue, ViewGroup viewGroup) {
		android.animation.LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
		if (layoutTransition != null) {
			layoutTransition.setAnimateParentHierarchy((boolean) objValue);
		}
	}

	private static void setLayoutTransitionDuration(Object objValue, ViewGroup viewGroup) {
		android.animation.LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
		if (layoutTransition != null) {
			layoutTransition.setDuration((int) objValue);
		}
		
	}

	private static void setLayoutTransition(Object objValue, ViewGroup viewGroup) {
		android.animation.LayoutTransition lt = new android.animation.LayoutTransition();
		lt.setAnimateParentHierarchy(false);
		lt.disableTransitionType(android.animation.LayoutTransition.CHANGE_APPEARING);
		lt.disableTransitionType(android.animation.LayoutTransition.CHANGE_DISAPPEARING);
		lt.disableTransitionType(android.animation.LayoutTransition.APPEARING);
		lt.disableTransitionType(android.animation.LayoutTransition.DISAPPEARING);
		lt.disableTransitionType(android.animation.LayoutTransition.CHANGING);
		
		int flag = (int) objValue;

		if ((flag & 0x1) != 0) {
			lt.enableTransitionType(android.animation.LayoutTransition.CHANGE_APPEARING);
		}
		if ((flag & 0x02) != 0) {
			lt.enableTransitionType(android.animation.LayoutTransition.CHANGE_DISAPPEARING);
		}
		if ((flag & 0x04) != 0) {
			lt.enableTransitionType(android.animation.LayoutTransition.APPEARING);
		}
		if ((flag & 0x08) != 0) {
			lt.enableTransitionType(android.animation.LayoutTransition.DISAPPEARING);
		}
		if ((flag & 0x10) != 0) {
			lt.enableTransitionType(android.animation.LayoutTransition.CHANGING);
		}
		viewGroup.setLayoutTransition(lt);		
	}
	//end - viewcode

	
	public static void registerCommandConveter(IWidget widget) {
		ViewImpl.registerCommandConveter(widget);
	}
	
	private static void setOnHierarchyChangeListener(ViewGroup viewGroup, Object objValue) {
		viewGroup.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) objValue);
	}

	public static void nativeRemoveView(IWidget w) {
		
	}

	

	
}
