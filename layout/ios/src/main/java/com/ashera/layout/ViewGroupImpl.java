package com.ashera.layout;
//start - imports
import java.util.*;

import r.android.content.Context;
import r.android.os.Build;
import r.android.view.View;
import r.android.view.ViewGroup;

import r.android.annotation.SuppressLint;

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
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("addStatesFromChildren").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onChildViewAdded").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("clipChildren").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("clipToPadding").withType("boolean"));
		ConverterFactory.register("ViewGroup.layoutMode", new LayoutMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layoutMode").withType("ViewGroup.layoutMode"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onChildViewRemoved").withType("string"));
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
			case "addStatesFromChildren": {


		 viewGroup.setAddStatesFromChildren((boolean) objValue);



			}
			break;
			case "onChildViewAdded": {


		 setOnChildViewAdded(viewGroup, w, objValue);



			}
			break;
			case "clipChildren": {


		 ViewImpl.setClipsToBounds(nativeWidget, objValue);



			}
			break;
			case "clipToPadding": {


		 viewGroup.setClipToPadding((boolean) objValue);applyClipToPaddingCommand(w, (boolean) objValue);



			}
			break;
			case "layoutMode": {


		 viewGroup.setLayoutMode((int) objValue);



			}
			break;
			case "onChildViewRemoved": {


		 setOnChildViewRemoved(viewGroup, w,objValue);



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
			case "clipChildren": {				
return ViewImpl.getClipsToBounds(w.asNativeWidget());			}
			case "clipToPadding": {				
return viewGroup.getClipToPadding();			}
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
			case "addStatesFromChildren": {
				return true;
			}
			case "onChildViewAdded": {
				return true;
			}
			case "clipChildren": {
				return true;
			}
			case "clipToPadding": {
				return true;
			}
			case "layoutMode": {
				return true;
			}
			case "onChildViewRemoved": {
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
	public static class ClipPaddingMaskCommand extends BaseAttributeCommand{
		public ClipPaddingMaskCommand(String id) {
			super(id);
		}

		private void createMaskLayer(IWidget w) {
			ViewGroup view = (ViewGroup) w.asWidget();
			r.android.graphics.Rect rect = view.getPaddingMaskBounds();
			nativeCreateMaskLayer(w.asNativeWidget(), rect.left, rect.top, rect.width(), rect.height());
		}
		
		private native void nativeCreateMaskLayer(Object uiView, int left, int top, int width, int height)/*-[		
			// Create a mask layer and the frame to determine what will be visible in the view.
			CAShapeLayer *maskLayer = [[CAShapeLayer alloc] init];
			CGRect maskRect = CGRectMake(left, top, width, height);
		
			// Create a path with the rectangle in it.
			CGPathRef path = CGPathCreateWithRect(maskRect, NULL);
		
			// Set the path to the mask layer.
			maskLayer.path = path;
		
			// Release the path since it's not covered by ARC.
			CGPathRelease(path);
		
			// Set the mask of the view.
			((UIView*) uiView).layer.mask = maskLayer;
		]-*/;
	
		@Override
		public Object modifyValue(IWidget widget, Object nativeView, String phase, String attributeName, Object value) {
			createMaskLayer(widget);
			return value;
		}
	
		@Override
		public AttributeCommand newInstance(Object... args) {
			return new ClipPaddingMaskCommand(this.id);
		}
	
		@Override
		public void updateArgs(Object... args) {
		}
		
		@Override
		public boolean executeAfterPostMeasure() {
			return true;
		}
	}
	
	public static void registerCommandConveter(IWidget widget) {
		ViewImpl.registerCommandConveter(widget);
		widget.registerForAttributeCommandChainWithPhase("predraw", "clipToPadding");
	}

	private static void applyClipToPaddingCommand(IWidget w, boolean add) {
		w.applyAttributeCommand("clipToPadding", "clipToPadding", new String[] {}, add);
	}
	public static void nativeRemoveView(IWidget widget) {
		removeView(widget.asNativeWidget());
	}
	public native static void removeView(Object view) /*-[
		[(UIView*)view removeFromSuperview];
	]-*/;
	
	public native static void nativeAddView(Object uiView, Object w)/*-[		
		[((UIView*) uiView) addSubview:w];
	]-*/;
}
