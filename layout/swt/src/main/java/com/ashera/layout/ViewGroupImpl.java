package com.ashera.layout;
//start - imports
import java.util.*;

import androidx.core.view.*;
import r.android.content.Context;
import r.android.os.Build;
import r.android.view.View;
import r.android.view.ViewGroup;

import r.android.annotation.SuppressLint;

import com.ashera.widget.*;
import com.ashera.converter.*;

import static com.ashera.widget.IWidget.*;
//end - imports
public class ViewGroupImpl {
	// start - body
	private ViewGroupImpl() {
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
	public static void register(String localName) {
		ViewGroupModelImpl.register(localName);

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtBackgroundMode").withType("swtbitflag"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtLayoutDeferred").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("animateLayoutChanges").withType("boolean"));
		ConverterFactory.register("ViewGroup.layoutTransition", new LayoutTransition());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layoutTransition").withType("ViewGroup.layoutTransition"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layoutTransitionDuration").withType("int").withOrder(3));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("animateParentHierarchy").withType("boolean").withOrder(3));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("listitem").withType("template"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("padding").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingBottom").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingRight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingLeft").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingStart").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingEnd").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingTop").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingHorizontal").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingVertical").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onChildViewAdded").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onChildViewRemoved").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("addStatesFromChildren").withType("boolean"));
		ConverterFactory.register("ViewGroup.layoutMode", new LayoutMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layoutMode").withType("ViewGroup.layoutMode"));
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
	
	@SuppressLint("NewApi")
	public static void setAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		ViewGroup viewGroup = ((ViewGroup) w.asWidget());
		org.eclipse.swt.widgets.Composite composite = (org.eclipse.swt.widgets.Composite) w.asNativeWidget();
		ViewGroupModelImpl.setAttribute(w, key, strValue, objValue, decorator);
		setMyAttribute(w, key, strValue, objValue, decorator);
	}
	
	private static void setMyAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		ViewGroup viewGroup = ((ViewGroup) w.asWidget());
		org.eclipse.swt.widgets.Composite composite = (org.eclipse.swt.widgets.Composite) w.asNativeWidget();

		switch (key.getAttributeName()) {
			case "swtBackgroundMode": {


		 composite.setBackgroundMode((int)objValue);



			}
			break;
			case "swtLayoutDeferred": {


		 composite.setLayoutDeferred((boolean)objValue);



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
			case "padding": {


		setPadding(w, objValue);



			}
			break;
			case "paddingBottom": {


		setPaddingBottom(w, objValue);



			}
			break;
			case "paddingRight": {


		setPaddingRight(w, objValue);



			}
			break;
			case "paddingLeft": {


		setPaddingLeft(w, objValue);



			}
			break;
			case "paddingStart": {


		setPaddingStart(w, objValue);



			}
			break;
			case "paddingEnd": {


		setPaddingEnd(w, objValue);



			}
			break;
			case "paddingTop": {


		setPaddingTop(w, objValue);



			}
			break;
			case "paddingHorizontal": {


		setPaddingHorizontal(w, objValue);



			}
			break;
			case "paddingVertical": {


		setPaddingVertical(w, objValue);



			}
			break;
			case "onChildViewAdded": {


		 setOnChildViewAdded(viewGroup, w, objValue);



			}
			break;
			case "onChildViewRemoved": {


		 setOnChildViewRemoved(viewGroup, w, objValue);



			}
			break;
			case "addStatesFromChildren": {


		 viewGroup.setAddStatesFromChildren((boolean) objValue);



			}
			break;
			case "layoutMode": {


		 viewGroup.setLayoutMode((int) objValue);



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
		org.eclipse.swt.widgets.Composite composite = (org.eclipse.swt.widgets.Composite) w.asNativeWidget();
		Object attributeValue = ViewGroupModelImpl.getAttribute(w, key, decorator);
		if (attributeValue != null) {
			return attributeValue;
		}
		
		switch (key.getAttributeName()) {
			case "swtBackgroundMode": {				
return composite.getBackgroundMode();			}
			case "swtLayoutDeferred": {				
return composite.getLayoutDeferred();			}
			case "paddingBottom": {				
return getPaddingBottom(w);			}
			case "paddingRight": {				
return getPaddingRight(w);			}
			case "paddingLeft": {				
return getPaddingLeft(w);			}
			case "paddingStart": {				
return getPaddingLeft(w);			}
			case "paddingEnd": {				
return getPaddingRight(w);			}
			case "paddingTop": {				
return getPaddingTop(w);			}
			case "addStatesFromChildren": {				
return viewGroup.addStatesFromChildren();			}
			case "layoutMode": {				
return viewGroup.getLayoutMode();			}
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
	
	

	public static void setMargin(Object objValue, Object layoutParams, IWidget w) {
        setBottomMargin(objValue, layoutParams);
        setTopMargin(objValue, layoutParams);
        setStartMargin(objValue, layoutParams, w);
        setEndMargin(objValue, layoutParams, w);
    }
	public static void setBottomMargin(Object objValue,  Object layoutParams) {		
		int valueInt = (int)objValue;          
		if (layoutParams instanceof r.android.view.ViewGroup.MarginLayoutParams) {          
				((r.android.view.ViewGroup.MarginLayoutParams)layoutParams).bottomMargin = valueInt;         
		}		
	}
	public static void setTopMargin(Object objValue,  Object layoutParams) {		
		int valueInt = (int)objValue;          
		if (layoutParams instanceof r.android.view.ViewGroup.MarginLayoutParams) {          
				((r.android.view.ViewGroup.MarginLayoutParams)layoutParams).topMargin = valueInt;         
		}		
	}
	
	
	
	private static void setVerticalMargin(Object objValue, Object layoutParams, IWidget w) {		
		int valueInt = (int)objValue;          
		if (layoutParams instanceof r.android.view.ViewGroup.MarginLayoutParams) {          
				((r.android.view.ViewGroup.MarginLayoutParams)layoutParams).topMargin = valueInt;         
				((r.android.view.ViewGroup.MarginLayoutParams)layoutParams).bottomMargin = valueInt;         
		}		
	}
	
	public static void setLeftMargin(Object objValue,  Object layoutParams, IWidget w) {	
		if (Build.VERSION.SDK_INT >= 17) {
			setStartMargin(objValue, layoutParams, w);
		} else {
			int valueInt = (int)objValue;          
			if (layoutParams instanceof r.android.view.ViewGroup.MarginLayoutParams) {          
					((r.android.view.ViewGroup.MarginLayoutParams)layoutParams).leftMargin = valueInt;         
			}	
		}
	}
	
	public static void setRightMargin(Object objValue,  Object layoutParams, IWidget w) {	
		if (Build.VERSION.SDK_INT >= 17) {
			setEndMargin(objValue, layoutParams, w);
		} else {
			int valueInt = (int)objValue;          
			if (layoutParams instanceof r.android.view.ViewGroup.MarginLayoutParams) {          
					((r.android.view.ViewGroup.MarginLayoutParams)layoutParams).rightMargin = valueInt;         
			}
		}
	}


	private static void setHorizontalMargin(Object objValue, Object layoutParams, IWidget w) {	
		if (Build.VERSION.SDK_INT >= 17) {
			setEndMargin(objValue, layoutParams, w);
			setStartMargin(objValue, layoutParams, w);
		} else {
			int valueInt = (int)objValue;          
			if (layoutParams instanceof r.android.view.ViewGroup.MarginLayoutParams) {          
					((r.android.view.ViewGroup.MarginLayoutParams)layoutParams).rightMargin = valueInt;         
					((r.android.view.ViewGroup.MarginLayoutParams)layoutParams).leftMargin = valueInt;
			}
		}
	}
	
	@SuppressLint("NewApi")
	public static void setEndMargin(Object objValue,  Object layoutParams, IWidget w) {		
		int valueInt = (int)objValue;          
		if (layoutParams instanceof r.android.view.ViewGroup.MarginLayoutParams) {    
			 r.android.view.ViewGroup.MarginLayoutParams marginParams = (r.android.view.ViewGroup.MarginLayoutParams)layoutParams;
			 marginParams.setMarginEnd(valueInt);
			 ((View) w.asWidget()).setLayoutParams(marginParams);
		}		
	}
	
	@SuppressLint("NewApi")
	public static void setStartMargin(Object objValue,  Object layoutParams, IWidget w) {		
		int valueInt = (int)objValue;          
		if (layoutParams instanceof r.android.view.ViewGroup.MarginLayoutParams) {    
			 r.android.view.ViewGroup.MarginLayoutParams marginParams = (r.android.view.ViewGroup.MarginLayoutParams)layoutParams;
			 marginParams.setMarginStart(valueInt);
			 ((View) w.asWidget()).setLayoutParams(marginParams);
		}		
	}

	
	
	private static Object getRightMargin(View viewGroup) {
		return ((r.android.view.ViewGroup.MarginLayoutParams)viewGroup.getLayoutParams()).getMarginEnd();
	}

	private static Object getLeftMargin(View viewGroup) {
		return ((r.android.view.ViewGroup.MarginLayoutParams)viewGroup.getLayoutParams()).getMarginStart();
	}

	private static Object getTopMargin(View viewGroup) {
		return ((r.android.view.ViewGroup.MarginLayoutParams)viewGroup.getLayoutParams()).topMargin;
	}

	private static Object getBottomMargin(View viewGroup) {
		return ((r.android.view.ViewGroup.MarginLayoutParams)viewGroup.getLayoutParams()).bottomMargin;
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
				r.android.animation.LayoutTransition lt = new r.android.animation.LayoutTransition();
				lt.setAnimateParentHierarchy(false);
				view.setLayoutTransition(lt);
			} else {
				view.setLayoutTransition(null);
			}
		}
		
	}
	
	private static void setAnimateParentHierarchy(Object objValue, ViewGroup viewGroup) {
		r.android.animation.LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
		if (layoutTransition != null) {
			layoutTransition.setAnimateParentHierarchy((boolean) objValue);
		}
	}

	private static void setLayoutTransitionDuration(Object objValue, ViewGroup viewGroup) {
		r.android.animation.LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
		if (layoutTransition != null) {
			layoutTransition.setDuration((int) objValue);
		}
		
	}

	private static void setLayoutTransition(Object objValue, ViewGroup viewGroup) {
		r.android.animation.LayoutTransition lt = new r.android.animation.LayoutTransition();
		lt.setAnimateParentHierarchy(false);
		lt.disableTransitionType(r.android.animation.LayoutTransition.CHANGE_APPEARING);
		lt.disableTransitionType(r.android.animation.LayoutTransition.CHANGE_DISAPPEARING);
		lt.disableTransitionType(r.android.animation.LayoutTransition.APPEARING);
		lt.disableTransitionType(r.android.animation.LayoutTransition.DISAPPEARING);
		lt.disableTransitionType(r.android.animation.LayoutTransition.CHANGING);
		
		int flag = (int) objValue;

		if ((flag & 0x1) != 0) {
			lt.enableTransitionType(r.android.animation.LayoutTransition.CHANGE_APPEARING);
		}
		if ((flag & 0x02) != 0) {
			lt.enableTransitionType(r.android.animation.LayoutTransition.CHANGE_DISAPPEARING);
		}
		if ((flag & 0x04) != 0) {
			lt.enableTransitionType(r.android.animation.LayoutTransition.APPEARING);
		}
		if ((flag & 0x08) != 0) {
			lt.enableTransitionType(r.android.animation.LayoutTransition.DISAPPEARING);
		}
		if ((flag & 0x10) != 0) {
			lt.enableTransitionType(r.android.animation.LayoutTransition.CHANGING);
		}
		viewGroup.setLayoutTransition(lt);		
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
			case "swtBackgroundMode": {
				return true;
			}
			case "swtLayoutDeferred": {
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
			case "padding": {
				return true;
			}
			case "paddingBottom": {
				return true;
			}
			case "paddingRight": {
				return true;
			}
			case "paddingLeft": {
				return true;
			}
			case "paddingStart": {
				return true;
			}
			case "paddingEnd": {
				return true;
			}
			case "paddingTop": {
				return true;
			}
			case "paddingHorizontal": {
				return true;
			}
			case "paddingVertical": {
				return true;
			}
			case "onChildViewAdded": {
				return true;
			}
			case "onChildViewRemoved": {
				return true;
			}
			case "addStatesFromChildren": {
				return true;
			}
			case "layoutMode": {
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

	


public static abstract class ViewGroupCommandBuilder<T> extends com.ashera.layout.ViewGroupModelImpl.ViewGroupModelCommandBuilder<T> {
    public ViewGroupCommandBuilder() {
	}
	

public T tryGetSwtBackgroundMode() {
	Map<String, Object> attrs = initCommand("swtBackgroundMode");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getSwtBackgroundMode() {
	Map<String, Object> attrs = initCommand("swtBackgroundMode");
	return attrs.get("commandReturnValue");
}
public T setSwtBackgroundMode(String value) {
	Map<String, Object> attrs = initCommand("swtBackgroundMode");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetSwtLayoutDeferred() {
	Map<String, Object> attrs = initCommand("swtLayoutDeferred");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object isSwtLayoutDeferred() {
	Map<String, Object> attrs = initCommand("swtLayoutDeferred");
	return attrs.get("commandReturnValue");
}
public T setSwtLayoutDeferred(boolean value) {
	Map<String, Object> attrs = initCommand("swtLayoutDeferred");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setAnimateLayoutChanges(boolean value) {
	Map<String, Object> attrs = initCommand("animateLayoutChanges");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setLayoutTransition(String value) {
	Map<String, Object> attrs = initCommand("layoutTransition");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setLayoutTransitionDuration(int value) {
	Map<String, Object> attrs = initCommand("layoutTransitionDuration");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setAnimateParentHierarchy(boolean value) {
	Map<String, Object> attrs = initCommand("animateParentHierarchy");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setListitem(String value) {
	Map<String, Object> attrs = initCommand("listitem");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setPadding(String value) {
	Map<String, Object> attrs = initCommand("padding");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetPaddingBottom() {
	Map<String, Object> attrs = initCommand("paddingBottom");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getPaddingBottom() {
	Map<String, Object> attrs = initCommand("paddingBottom");
	return attrs.get("commandReturnValue");
}
public T setPaddingBottom(String value) {
	Map<String, Object> attrs = initCommand("paddingBottom");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetPaddingRight() {
	Map<String, Object> attrs = initCommand("paddingRight");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getPaddingRight() {
	Map<String, Object> attrs = initCommand("paddingRight");
	return attrs.get("commandReturnValue");
}
public T setPaddingRight(String value) {
	Map<String, Object> attrs = initCommand("paddingRight");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetPaddingLeft() {
	Map<String, Object> attrs = initCommand("paddingLeft");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getPaddingLeft() {
	Map<String, Object> attrs = initCommand("paddingLeft");
	return attrs.get("commandReturnValue");
}
public T setPaddingLeft(String value) {
	Map<String, Object> attrs = initCommand("paddingLeft");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetPaddingStart() {
	Map<String, Object> attrs = initCommand("paddingStart");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getPaddingStart() {
	Map<String, Object> attrs = initCommand("paddingStart");
	return attrs.get("commandReturnValue");
}
public T setPaddingStart(String value) {
	Map<String, Object> attrs = initCommand("paddingStart");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetPaddingEnd() {
	Map<String, Object> attrs = initCommand("paddingEnd");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getPaddingEnd() {
	Map<String, Object> attrs = initCommand("paddingEnd");
	return attrs.get("commandReturnValue");
}
public T setPaddingEnd(String value) {
	Map<String, Object> attrs = initCommand("paddingEnd");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetPaddingTop() {
	Map<String, Object> attrs = initCommand("paddingTop");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getPaddingTop() {
	Map<String, Object> attrs = initCommand("paddingTop");
	return attrs.get("commandReturnValue");
}
public T setPaddingTop(String value) {
	Map<String, Object> attrs = initCommand("paddingTop");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setPaddingHorizontal(String value) {
	Map<String, Object> attrs = initCommand("paddingHorizontal");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setPaddingVertical(String value) {
	Map<String, Object> attrs = initCommand("paddingVertical");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setOnChildViewAdded(String value) {
	Map<String, Object> attrs = initCommand("onChildViewAdded");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setOnChildViewRemoved(String value) {
	Map<String, Object> attrs = initCommand("onChildViewRemoved");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetAddStatesFromChildren() {
	Map<String, Object> attrs = initCommand("addStatesFromChildren");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object isAddStatesFromChildren() {
	Map<String, Object> attrs = initCommand("addStatesFromChildren");
	return attrs.get("commandReturnValue");
}
public T setAddStatesFromChildren(boolean value) {
	Map<String, Object> attrs = initCommand("addStatesFromChildren");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetLayoutMode() {
	Map<String, Object> attrs = initCommand("layoutMode");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getLayoutMode() {
	Map<String, Object> attrs = initCommand("layoutMode");
	return attrs.get("commandReturnValue");
}
public T setLayoutMode(String value) {
	Map<String, Object> attrs = initCommand("layoutMode");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setChildXml(String value) {
	Map<String, Object> attrs = initCommand("childXml");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
}
static class ViewGroupCommandBuilderInternal extends ViewGroupCommandBuilder<ViewGroupCommandBuilderInternal> {
	private IWidget widget;
	public ViewGroupCommandBuilderInternal(IWidget widget) {
		this.widget = widget;
	}
	@Override
	protected ViewGroupCommandBuilderInternal execute(boolean setter) {
		if (setter) {
			widget.executeCommand(command, null, IWidget.COMMAND_EXEC_SETTER_METHOD);
			widget.getFragment().remeasure();
		}
		widget.executeCommand(command, null, IWidget.COMMAND_EXEC_GETTER_METHOD);

		return this;
	}
}
public static class ViewGroupBean extends com.ashera.layout.ViewGroupModelImpl.ViewGroupModelBean{
	private ViewGroupCommandBuilderInternal commandBuilder;
	public ViewGroupBean(IWidget widget) {
		super(widget);
		commandBuilder = new ViewGroupCommandBuilderInternal(widget);
	}
	private ViewGroupCommandBuilderInternal getBuilder() {
		return commandBuilder;
	}
public Object getSwtBackgroundMode() {
	return getBuilder().reset().tryGetSwtBackgroundMode().execute(false).getSwtBackgroundMode(); 
}
public void setSwtBackgroundMode(String value) {
	getBuilder().reset().setSwtBackgroundMode(value).execute(true);
}

public Object isSwtLayoutDeferred() {
	return getBuilder().reset().tryGetSwtLayoutDeferred().execute(false).isSwtLayoutDeferred(); 
}
public void setSwtLayoutDeferred(boolean value) {
	getBuilder().reset().setSwtLayoutDeferred(value).execute(true);
}

public void setAnimateLayoutChanges(boolean value) {
	getBuilder().reset().setAnimateLayoutChanges(value).execute(true);
}

public void setLayoutTransition(String value) {
	getBuilder().reset().setLayoutTransition(value).execute(true);
}

public void setLayoutTransitionDuration(int value) {
	getBuilder().reset().setLayoutTransitionDuration(value).execute(true);
}

public void setAnimateParentHierarchy(boolean value) {
	getBuilder().reset().setAnimateParentHierarchy(value).execute(true);
}

public void setListitem(String value) {
	getBuilder().reset().setListitem(value).execute(true);
}

public void setPadding(String value) {
	getBuilder().reset().setPadding(value).execute(true);
}

public Object getPaddingBottom() {
	return getBuilder().reset().tryGetPaddingBottom().execute(false).getPaddingBottom(); 
}
public void setPaddingBottom(String value) {
	getBuilder().reset().setPaddingBottom(value).execute(true);
}

public Object getPaddingRight() {
	return getBuilder().reset().tryGetPaddingRight().execute(false).getPaddingRight(); 
}
public void setPaddingRight(String value) {
	getBuilder().reset().setPaddingRight(value).execute(true);
}

public Object getPaddingLeft() {
	return getBuilder().reset().tryGetPaddingLeft().execute(false).getPaddingLeft(); 
}
public void setPaddingLeft(String value) {
	getBuilder().reset().setPaddingLeft(value).execute(true);
}

public Object getPaddingStart() {
	return getBuilder().reset().tryGetPaddingStart().execute(false).getPaddingStart(); 
}
public void setPaddingStart(String value) {
	getBuilder().reset().setPaddingStart(value).execute(true);
}

public Object getPaddingEnd() {
	return getBuilder().reset().tryGetPaddingEnd().execute(false).getPaddingEnd(); 
}
public void setPaddingEnd(String value) {
	getBuilder().reset().setPaddingEnd(value).execute(true);
}

public Object getPaddingTop() {
	return getBuilder().reset().tryGetPaddingTop().execute(false).getPaddingTop(); 
}
public void setPaddingTop(String value) {
	getBuilder().reset().setPaddingTop(value).execute(true);
}

public void setPaddingHorizontal(String value) {
	getBuilder().reset().setPaddingHorizontal(value).execute(true);
}

public void setPaddingVertical(String value) {
	getBuilder().reset().setPaddingVertical(value).execute(true);
}

public void setOnChildViewAdded(String value) {
	getBuilder().reset().setOnChildViewAdded(value).execute(true);
}

public void setOnChildViewRemoved(String value) {
	getBuilder().reset().setOnChildViewRemoved(value).execute(true);
}

public Object isAddStatesFromChildren() {
	return getBuilder().reset().tryGetAddStatesFromChildren().execute(false).isAddStatesFromChildren(); 
}
public void setAddStatesFromChildren(boolean value) {
	getBuilder().reset().setAddStatesFromChildren(value).execute(true);
}

public Object getLayoutMode() {
	return getBuilder().reset().tryGetLayoutMode().execute(false).getLayoutMode(); 
}
public void setLayoutMode(String value) {
	getBuilder().reset().setLayoutMode(value).execute(true);
}

public void setChildXml(String value) {
	getBuilder().reset().setChildXml(value).execute(true);
}

}





public static class ViewGroupParamsBean {
	private ViewGroupCommandParamsBuilderInternal commandBuilder;  
	public ViewGroupParamsBean() {
		commandBuilder = new ViewGroupCommandParamsBuilderInternal();
	}
	
	private ViewGroupCommandParamsBuilderInternal getParamsBuilder() {
		return commandBuilder;
	}
public Object getLayoutMarginBottom(IWidget w) {
	java.util.Map<String, Object> layoutParams = new java.util.HashMap<String, Object>();
	java.util.Map<String, Object> command = getParamsBuilder().reset().tryGetLayoutMarginBottom().getCommand();
	
	layoutParams.put("layoutParams", command);
	w.executeCommand(layoutParams, null, COMMAND_EXEC_GETTER_METHOD); 
	return getParamsBuilder().getLayoutMarginBottom();
}
public void setLayoutMarginBottom(IWidget w, String value) {
	java.util.Map<String, Object> layoutParams = new java.util.HashMap<String, Object>();
	layoutParams.put("layoutParams", getParamsBuilder().reset().setLayoutMarginBottom(value).getCommand());
	w.executeCommand(layoutParams, null, COMMAND_EXEC_SETTER_METHOD);
	w.getFragment().remeasure();
}

public Object getLayoutMarginTop(IWidget w) {
	java.util.Map<String, Object> layoutParams = new java.util.HashMap<String, Object>();
	java.util.Map<String, Object> command = getParamsBuilder().reset().tryGetLayoutMarginTop().getCommand();
	
	layoutParams.put("layoutParams", command);
	w.executeCommand(layoutParams, null, COMMAND_EXEC_GETTER_METHOD); 
	return getParamsBuilder().getLayoutMarginTop();
}
public void setLayoutMarginTop(IWidget w, String value) {
	java.util.Map<String, Object> layoutParams = new java.util.HashMap<String, Object>();
	layoutParams.put("layoutParams", getParamsBuilder().reset().setLayoutMarginTop(value).getCommand());
	w.executeCommand(layoutParams, null, COMMAND_EXEC_SETTER_METHOD);
	w.getFragment().remeasure();
}

public Object getLayoutMarginStart(IWidget w) {
	java.util.Map<String, Object> layoutParams = new java.util.HashMap<String, Object>();
	java.util.Map<String, Object> command = getParamsBuilder().reset().tryGetLayoutMarginStart().getCommand();
	
	layoutParams.put("layoutParams", command);
	w.executeCommand(layoutParams, null, COMMAND_EXEC_GETTER_METHOD); 
	return getParamsBuilder().getLayoutMarginStart();
}
public void setLayoutMarginStart(IWidget w, String value) {
	java.util.Map<String, Object> layoutParams = new java.util.HashMap<String, Object>();
	layoutParams.put("layoutParams", getParamsBuilder().reset().setLayoutMarginStart(value).getCommand());
	w.executeCommand(layoutParams, null, COMMAND_EXEC_SETTER_METHOD);
	w.getFragment().remeasure();
}

public Object getLayoutMarginEnd(IWidget w) {
	java.util.Map<String, Object> layoutParams = new java.util.HashMap<String, Object>();
	java.util.Map<String, Object> command = getParamsBuilder().reset().tryGetLayoutMarginEnd().getCommand();
	
	layoutParams.put("layoutParams", command);
	w.executeCommand(layoutParams, null, COMMAND_EXEC_GETTER_METHOD); 
	return getParamsBuilder().getLayoutMarginEnd();
}
public void setLayoutMarginEnd(IWidget w, String value) {
	java.util.Map<String, Object> layoutParams = new java.util.HashMap<String, Object>();
	layoutParams.put("layoutParams", getParamsBuilder().reset().setLayoutMarginEnd(value).getCommand());
	w.executeCommand(layoutParams, null, COMMAND_EXEC_SETTER_METHOD);
	w.getFragment().remeasure();
}

public Object getLayoutMarginLeft(IWidget w) {
	java.util.Map<String, Object> layoutParams = new java.util.HashMap<String, Object>();
	java.util.Map<String, Object> command = getParamsBuilder().reset().tryGetLayoutMarginLeft().getCommand();
	
	layoutParams.put("layoutParams", command);
	w.executeCommand(layoutParams, null, COMMAND_EXEC_GETTER_METHOD); 
	return getParamsBuilder().getLayoutMarginLeft();
}
public void setLayoutMarginLeft(IWidget w, String value) {
	java.util.Map<String, Object> layoutParams = new java.util.HashMap<String, Object>();
	layoutParams.put("layoutParams", getParamsBuilder().reset().setLayoutMarginLeft(value).getCommand());
	w.executeCommand(layoutParams, null, COMMAND_EXEC_SETTER_METHOD);
	w.getFragment().remeasure();
}

public Object getLayoutMarginRight(IWidget w) {
	java.util.Map<String, Object> layoutParams = new java.util.HashMap<String, Object>();
	java.util.Map<String, Object> command = getParamsBuilder().reset().tryGetLayoutMarginRight().getCommand();
	
	layoutParams.put("layoutParams", command);
	w.executeCommand(layoutParams, null, COMMAND_EXEC_GETTER_METHOD); 
	return getParamsBuilder().getLayoutMarginRight();
}
public void setLayoutMarginRight(IWidget w, String value) {
	java.util.Map<String, Object> layoutParams = new java.util.HashMap<String, Object>();
	layoutParams.put("layoutParams", getParamsBuilder().reset().setLayoutMarginRight(value).getCommand());
	w.executeCommand(layoutParams, null, COMMAND_EXEC_SETTER_METHOD);
	w.getFragment().remeasure();
}

public void setLayoutMargin(IWidget w, String value) {
	java.util.Map<String, Object> layoutParams = new java.util.HashMap<String, Object>();
	layoutParams.put("layoutParams", getParamsBuilder().reset().setLayoutMargin(value).getCommand());
	w.executeCommand(layoutParams, null, COMMAND_EXEC_SETTER_METHOD);
	w.getFragment().remeasure();
}

public void setLayoutMarginHorizontal(IWidget w, String value) {
	java.util.Map<String, Object> layoutParams = new java.util.HashMap<String, Object>();
	layoutParams.put("layoutParams", getParamsBuilder().reset().setLayoutMarginHorizontal(value).getCommand());
	w.executeCommand(layoutParams, null, COMMAND_EXEC_SETTER_METHOD);
	w.getFragment().remeasure();
}

public void setLayoutMarginVertical(IWidget w, String value) {
	java.util.Map<String, Object> layoutParams = new java.util.HashMap<String, Object>();
	layoutParams.put("layoutParams", getParamsBuilder().reset().setLayoutMarginVertical(value).getCommand());
	w.executeCommand(layoutParams, null, COMMAND_EXEC_SETTER_METHOD);
	w.getFragment().remeasure();
}

}



static class ViewGroupCommandParamsBuilderInternal extends ViewGroupCommandParamsBuilder<ViewGroupCommandParamsBuilderInternal> {
}


public static class ViewGroupCommandParamsBuilder <T>{
	protected Map<String, Object> command = new HashMap<>();
	protected int orderGet;
	protected int orderSet;


	public Map<String, Object> getCommand() {
		return command;
	}

	public T reset() {
		orderGet = 0;
		orderSet = 0;
		command = new HashMap<>();
return (T) this;	}

	public Map<String, Object> initCommand(String attributeName) {
		Map<String, Object> attrs = (Map<String, Object>) command.get(attributeName);
		if (attrs == null) {
			attrs = new HashMap<>();
			command.put(attributeName, attrs);
		}
		return attrs;
	}
public T tryGetLayoutMarginBottom() {
	Map<String, Object> attrs = initCommand("layout_marginBottom");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getLayoutMarginBottom() {
	Map<String, Object> attrs = initCommand("layout_marginBottom");
	return attrs.get("commandReturnValue");
}
public T setLayoutMarginBottom(String value) {
	Map<String, Object> attrs = initCommand("layout_marginBottom");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetLayoutMarginTop() {
	Map<String, Object> attrs = initCommand("layout_marginTop");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getLayoutMarginTop() {
	Map<String, Object> attrs = initCommand("layout_marginTop");
	return attrs.get("commandReturnValue");
}
public T setLayoutMarginTop(String value) {
	Map<String, Object> attrs = initCommand("layout_marginTop");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetLayoutMarginStart() {
	Map<String, Object> attrs = initCommand("layout_marginStart");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getLayoutMarginStart() {
	Map<String, Object> attrs = initCommand("layout_marginStart");
	return attrs.get("commandReturnValue");
}
public T setLayoutMarginStart(String value) {
	Map<String, Object> attrs = initCommand("layout_marginStart");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetLayoutMarginEnd() {
	Map<String, Object> attrs = initCommand("layout_marginEnd");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getLayoutMarginEnd() {
	Map<String, Object> attrs = initCommand("layout_marginEnd");
	return attrs.get("commandReturnValue");
}
public T setLayoutMarginEnd(String value) {
	Map<String, Object> attrs = initCommand("layout_marginEnd");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetLayoutMarginLeft() {
	Map<String, Object> attrs = initCommand("layout_marginLeft");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getLayoutMarginLeft() {
	Map<String, Object> attrs = initCommand("layout_marginLeft");
	return attrs.get("commandReturnValue");
}
public T setLayoutMarginLeft(String value) {
	Map<String, Object> attrs = initCommand("layout_marginLeft");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetLayoutMarginRight() {
	Map<String, Object> attrs = initCommand("layout_marginRight");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getLayoutMarginRight() {
	Map<String, Object> attrs = initCommand("layout_marginRight");
	return attrs.get("commandReturnValue");
}
public T setLayoutMarginRight(String value) {
	Map<String, Object> attrs = initCommand("layout_marginRight");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setLayoutMargin(String value) {
	Map<String, Object> attrs = initCommand("layout_margin");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setLayoutMarginHorizontal(String value) {
	Map<String, Object> attrs = initCommand("layout_marginHorizontal");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setLayoutMarginVertical(String value) {
	Map<String, Object> attrs = initCommand("layout_marginVertical");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
}
	// end - body
	

	public static void nativeAddView(Object parent, Object child) {
		if (parent instanceof org.eclipse.swt.custom.ScrolledComposite) {
			((org.eclipse.swt.custom.ScrolledComposite) parent).setContent((org.eclipse.swt.widgets.Control)child);
		}
	}
	
	//start - padding
    private static void setPaddingVertical(IWidget w, Object objValue) {
        ViewImpl.setPaddingVertical(objValue, (View)w.asWidget());
    }

    private static void setPaddingHorizontal(IWidget w, Object objValue) {
        ViewImpl.setPaddingHorizontal(objValue, (View)w.asWidget());
    }

    private static void setPaddingTop(IWidget w, Object objValue) {
        ViewImpl.setPaddingTop(objValue, (View)w.asWidget());
    }

    private static void setPaddingEnd(IWidget w, Object objValue) {
        ViewImpl.setPaddingRight(objValue, (View)w.asWidget());
    }

    private static void setPaddingStart(IWidget w, Object objValue) {
        ViewImpl.setPaddingLeft(objValue, (View)w.asWidget());
    }

    private static void setPaddingLeft(IWidget w, Object objValue) {
        ViewImpl.setPaddingLeft(objValue, (View)w.asWidget());
    }

    private static void setPaddingRight(IWidget w, Object objValue) {
        ViewImpl.setPaddingRight(objValue, (View)w.asWidget());
    }

    private static void setPaddingBottom(IWidget w, Object objValue) {
        ViewImpl.setPaddingBottom(objValue, (View)w.asWidget());
    }

    private static void setPadding(IWidget w, Object objValue) {
        ViewImpl.setPadding(objValue, (View)w.asWidget());
    }
    private static Object getPaddingTop(IWidget w) {
		return ViewImpl.getPaddingTop(w, (View)w.asWidget());
	}
	private static Object getPaddingLeft(IWidget w) {
		return ViewImpl.getPaddingLeft(w, (View)w.asWidget());
	}
	private static Object getPaddingRight(IWidget w) {
		return ViewImpl.getPaddingRight(w, (View)w.asWidget());
	}
	private static Object getPaddingBottom(IWidget w) {
		return ViewImpl.getPaddingBottom(w, (View)w.asWidget());
	}
    //end - padding
	
	public static void nativeRemoveView(IWidget widget) {
		((org.eclipse.swt.widgets.Control)widget.asNativeWidget()).dispose();
	}
	//start - setOnChildView
	private static void setOnChildViewRemoved(ViewGroup viewGroup, IWidget w, Object objValue) {
		ViewGroup.OnHierarchyChangeListener listener;
		if (objValue instanceof String) {
			listener = new OnHierarchyChangeListener(w, (String) objValue);
		} else {
			listener = (ViewGroup.OnHierarchyChangeListener) objValue;
		}
		viewGroup.setOnHierarchyChangeListener(listener);
	}
	private static void setOnChildViewAdded(ViewGroup viewGroup, IWidget w, Object objValue) {
		ViewGroup.OnHierarchyChangeListener listener;
		if (objValue instanceof String) {
			listener = new OnHierarchyChangeListener(w, (String) objValue);
		} else {
			listener = (ViewGroup.OnHierarchyChangeListener) objValue;
		}
		viewGroup.setOnHierarchyChangeListener(listener);
	}
	//end - setOnChildView
	
	public static void registerCommandConveter(IWidget widget) {
		ViewImpl.registerCommandConveter(widget);
	}
}
