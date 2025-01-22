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
public class ViewGroupModelImpl {
	// start - body
	private ViewGroupModelImpl() {
	}
	public static void register(String localName) {
		ViewImpl.register(localName);

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("addModel").withType("object"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("addAllModel").withType("object"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("addModelByIndex").withType("object"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("removeModelAtIndex").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("removeModelById").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelFor").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelIdPath").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelDescPath").withType("string").withOrder(-1));
		
	}
	
	public static void setAttribute(IWidget w, SimpleWrapableView wrapperView,
			WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		ViewImpl.setAttribute(w, wrapperView, key, strValue, objValue, decorator);
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
		ViewImpl.setAttribute(w, key, strValue, objValue, decorator);
		setMyAttribute(w, key, strValue, objValue, decorator);
	}
	
	private static void setMyAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		setMyAttribute(w, w.asNativeWidget(), key, strValue, objValue, decorator);
	}
	private static void setMyAttribute(IWidget w, Object nativeWidget, WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		//ViewGroup viewGroup = ((ViewGroup) w.asWidget());

		switch (key.getAttributeName()) {
			case "addModel": {


		 addModel(w, objValue);



			}
			break;
			case "addAllModel": {


		 addAllModel(w, objValue);



			}
			break;
			case "addModelByIndex": {


		addModelByIndex(w, objValue);



			}
			break;
			case "removeModelAtIndex": {


		 removeModelAtIndex(w, objValue);



			}
			break;
			case "removeModelById": {


		 removeModelById(w, objValue);



			}
			break;
			case "modelFor": {


		 setModelFor(w, objValue);



			}
			break;
			case "modelIdPath": {


		setModelIdPath(w, strValue, objValue);



			}
			break;
			case "modelDescPath": {


		setModelDescPath(w, strValue, objValue);



			}
			break;
		default:
			break;
		}
	}
	@SuppressLint("NewApi")
	public static void setChildAttribute(IWidget w, WidgetAttribute key, Object objValue, Object layoutParams) {
	}
	
	@SuppressLint("NewApi")
	public static Object getAttribute(IWidget w, WidgetAttribute key, ILifeCycleDecorator decorator) {
		//ViewGroup viewGroup = ((ViewGroup) w.asWidget());
		Object attributeValue = ViewImpl.getAttribute(w, key, decorator);
		if (attributeValue != null) {
			return attributeValue;
		}
		
		switch (key.getAttributeName()) {
			case "modelIdPath": {				
return getModelIdPath(w);			}
			case "modelDescPath": {				
return getModelDescPath(w);			}
		}
		return null;
	}
	
	@SuppressLint("NewApi")
	public static Object getChildAttribute(IWidget w, WidgetAttribute key) {
		//View viewGroup = ((View) w.asWidget());
		
		return null;
	}
	
	
	
	@SuppressLint("NewApi")
	public static boolean isAttributeSupported(WidgetAttribute key) {
		switch (key.getAttributeName()) {
			case "addModel": {
				return true;
			}
			case "addAllModel": {
				return true;
			}
			case "addModelByIndex": {
				return true;
			}
			case "removeModelAtIndex": {
				return true;
			}
			case "removeModelById": {
				return true;
			}
			case "modelFor": {
				return true;
			}
			case "modelIdPath": {
				return true;
			}
			case "modelDescPath": {
				return true;
			}
		default:
			break;
		}
		return false;
	}

	// end - body
	//start - viewcode
	private static void removeModelAtIndex(IWidget w, Object objValue) {
	    ((HasWidgets)w).removeModelAtIndex((int) objValue);
	}
	
	private static void addModelByIndex(IWidget w, Object objValue) {
	    Map<String, Object> model = PluginInvoker.getMap(objValue);
	    int index = PluginInvoker.getInt(model.get("index"));
	    ((HasWidgets)w).addModel(model.get("data"), index);
	    
	}
	
	
	private static void addModel(IWidget w, Object objValue) {
		((HasWidgets)w).addModel(objValue);
	}
	
	
	
	private static void removeModelById(IWidget w, Object objValue) {
		((HasWidgets)w).removeModelById(PluginInvoker.getString(objValue)); 		
	}
	
	
	private static void setModelFor(IWidget w, Object objValue) {
		((HasWidgets)w).setModelFor((String) objValue); 
	}
	
	private static void setModelIdPath(IWidget w, String strValue, Object objValue) {
		w.setModelIdPath((String) objValue);				
	}
	
	private static Object getModelIdPath(IWidget w) {
		return w.getModelIdPath();
	}
	private static void addAllModel(IWidget w, Object objValue) {
		((HasWidgets)w).addAllModel(objValue);
	}
	
	private static void setModelDescPath(IWidget w, String strValue, Object objValue) {
		((HasWidgets)w).setModelDescPath((String) objValue);
	}
	
	private static Object getModelDescPath(IWidget w) {
		return ((HasWidgets)w).getModelDescPath();
	}
	//end - viewcode
}
