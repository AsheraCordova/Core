package com.ashera.layout;

// start - imports
import java.util.*;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.*;
import android.widget.*;
import android.view.View.*;

import com.ashera.widget.BaseHasWidgets;

import android.annotation.SuppressLint;

import com.ashera.core.IFragment;
import com.ashera.widget.bus.*;
import com.ashera.converter.*;
import com.ashera.widget.bus.Event.*;
import com.ashera.widget.*;
import com.ashera.widget.IWidgetLifeCycleListener.*;
import com.ashera.layout.*;

import android.graphics.Canvas;
import android.widget.*;
import androidx.core.view.*;
import android.view.*;

import static com.ashera.widget.IWidget.*;
//end - imports

public class RadioGroupImpl extends BaseHasWidgets implements com.ashera.validations.FormElement {
	//start - body
	public final static String LOCAL_NAME = "RadioGroup"; 
	public final static String GROUP_NAME = "RadioGroup";
	private android.widget.RadioGroup radioGroup;
	

	
		@SuppressLint("NewApi")
		final static class Orientation extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("horizontal",  0x0);
				mapping.put("vertical",  0x1);
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
		final static class Divider  extends AbstractBitFlagConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("none", 0x0);
				mapping.put("beginning", 0x1);
				mapping.put("end", 0x4);
				mapping.put("middle", 0x2);
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
	@Override
	public void loadAttributes(String localName) {
		ViewGroupImpl.register(localName);

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("baselineAligned").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("baselineAlignedChildIndex").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("divider").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("gravity").withType("gravity"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("measureWithLargestChild").withType("boolean"));
		ConverterFactory.register("RadioGroup.orientation", new Orientation());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("orientation").withType("RadioGroup.orientation"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("weightSum").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onChildViewAdded").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onChildViewRemoved").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("checkedButton").withType("id"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onCheckedChange").withType("string"));
		ConverterFactory.register("RadioGroup.divider", new Divider());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("showDividers").withType("RadioGroup.divider"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("dividerPadding").withType("dimension"));
	
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_gravity").withType("gravity").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_weight").withType("float").forChild());
	}
	
	public RadioGroupImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  RadioGroupImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  RadioGroupImpl(String groupName, String localname) {
		super(groupName, localname);
	}

	@Override
	public IWidget newInstance() {
		return new RadioGroupImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
Context context = (Context) fragment.getRootActivity();
	radioGroup = new RadioGroupExt(context);

		
		nativeCreate(params);
		
		
		ViewGroupImpl.registerCommandConveter(this);

	}

	@Override
	public Object asWidget() {
		return radioGroup;
	}

	@Override
	public boolean remove(IWidget w) {
		boolean remove = super.remove(w);
		radioGroup.removeView((View) w.asWidget());
		return remove;
	}
	
	@Override
    public boolean remove(int index) {
		IWidget widget = widgets.get(index);
        boolean remove = super.remove(index);

        if (index + 1 <= radioGroup.getChildCount()) {
            radioGroup.removeViewAt(index);
        }    
        return remove;
    }

	
	@Override
	public void add(IWidget w, int index) {
		if (index != -2) {
			View view = (View) w.asWidget();
			createLayoutParams(view);
			    if (index == -1) {
			        radioGroup.addView(view);
			    } else {
			        radioGroup.addView(view, index);
			    }
		}
		
		ViewGroupImpl.nativeAddView(asNativeWidget(), w.asNativeWidget());
		super.add(w, index);
	}
	
	private void createLayoutParams(View view) {
		android.widget.RadioGroup.LayoutParams layoutParams = (android.widget.RadioGroup.LayoutParams) view.getLayoutParams();
		
		layoutParams = (android.widget.RadioGroup.LayoutParams) view.getLayoutParams();
		if (layoutParams == null) {
			layoutParams = new android.widget.RadioGroup.LayoutParams(-2, -2);
			view.setLayoutParams(layoutParams);
		}  else {
			layoutParams.height = -2;
			layoutParams.width = -2;
		}
	}
	
	private android.widget.RadioGroup.LayoutParams getLayoutParams(View view) {
		return (android.widget.RadioGroup.LayoutParams) view.getLayoutParams();		
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setChildAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue) {
		View view = (View) w.asWidget();
		android.widget.RadioGroup.LayoutParams layoutParams = getLayoutParams(view);
		ViewGroupImpl.setChildAttribute(w, key, objValue, layoutParams);		
		
		switch (key.getAttributeName()) {
		case "layout_width":
			layoutParams.width = (int) objValue;
			break;	
		case "layout_height":
			layoutParams.height = (int) objValue;
			break;
			case "layout_gravity": {
				
							layoutParams.gravity = ((int)objValue);
				
			}
			break;
			case "layout_weight": {
				
							layoutParams.weight = ((float)objValue);
				
			}
			break;
		default:
			break;
		}
		
		
		view.setLayoutParams(layoutParams);		
	}
	
	@SuppressLint("NewApi")
	@Override
	public Object getChildAttribute(IWidget w, WidgetAttribute key) {
		Object attributeValue = ViewGroupImpl.getChildAttribute(w, key);		
		if (attributeValue != null) {
			return attributeValue;
		}
		View view = (View) w.asWidget();
		android.widget.RadioGroup.LayoutParams layoutParams = getLayoutParams(view);

		switch (key.getAttributeName()) {
		case "layout_width":
			return layoutParams.width;
		case "layout_height":
			return layoutParams.height;
			case "layout_gravity": {
return layoutParams.gravity;			}

			case "layout_weight": {
return layoutParams.weight;			}

		}
		
		return null;

	}
	
		
	public class RadioGroupExt extends android.widget.RadioGroup implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		
		public IWidget getWidget() {
			return RadioGroupImpl.this;
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

		public RadioGroupExt(Context context) {
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
				RadioGroupImpl.this.invalidate();
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
        		ViewImpl.drawableStateChanged(RadioGroupImpl.this);
        	}
        }
        
    	public void setState0(float value) {
    		ViewImpl.setState(RadioGroupImpl.this, 0, value);
    	}
    	public void setState0(int value) {
    		ViewImpl.setState(RadioGroupImpl.this, 0, value);
    	}
    	public void setState0(double value) {
    		ViewImpl.setState(RadioGroupImpl.this, 0, value);
    	}
    	
    	public void setState0(Float value) {
    		ViewImpl.setState(RadioGroupImpl.this, 0, value);
    	}
    	public void setState0(Integer value) {
    		ViewImpl.setState(RadioGroupImpl.this, 0, value);
    	}
    	public void setState0(Double value) {
    		ViewImpl.setState(RadioGroupImpl.this, 0, value);
    	}
    	public void setState0(Object value) {
    		ViewImpl.setState(RadioGroupImpl.this, 0, value);
    	}
    	public void setState1(float value) {
    		ViewImpl.setState(RadioGroupImpl.this, 1, value);
    	}
    	public void setState1(int value) {
    		ViewImpl.setState(RadioGroupImpl.this, 1, value);
    	}
    	public void setState1(double value) {
    		ViewImpl.setState(RadioGroupImpl.this, 1, value);
    	}
    	
    	public void setState1(Float value) {
    		ViewImpl.setState(RadioGroupImpl.this, 1, value);
    	}
    	public void setState1(Integer value) {
    		ViewImpl.setState(RadioGroupImpl.this, 1, value);
    	}
    	public void setState1(Double value) {
    		ViewImpl.setState(RadioGroupImpl.this, 1, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(RadioGroupImpl.this, 1, value);
    	}
    	public void setState2(float value) {
    		ViewImpl.setState(RadioGroupImpl.this, 2, value);
    	}
    	public void setState2(int value) {
    		ViewImpl.setState(RadioGroupImpl.this, 2, value);
    	}
    	public void setState2(double value) {
    		ViewImpl.setState(RadioGroupImpl.this, 2, value);
    	}
    	
    	public void setState2(Float value) {
    		ViewImpl.setState(RadioGroupImpl.this, 2, value);
    	}
    	public void setState2(Integer value) {
    		ViewImpl.setState(RadioGroupImpl.this, 2, value);
    	}
    	public void setState2(Double value) {
    		ViewImpl.setState(RadioGroupImpl.this, 2, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(RadioGroupImpl.this, 2, value);
    	}
    	public void setState3(float value) {
    		ViewImpl.setState(RadioGroupImpl.this, 3, value);
    	}
    	public void setState3(int value) {
    		ViewImpl.setState(RadioGroupImpl.this, 3, value);
    	}
    	public void setState3(double value) {
    		ViewImpl.setState(RadioGroupImpl.this, 3, value);
    	}
    	
    	public void setState3(Float value) {
    		ViewImpl.setState(RadioGroupImpl.this, 3, value);
    	}
    	public void setState3(Integer value) {
    		ViewImpl.setState(RadioGroupImpl.this, 3, value);
    	}
    	public void setState3(Double value) {
    		ViewImpl.setState(RadioGroupImpl.this, 3, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(RadioGroupImpl.this, 3, value);
    	}
    	public void setState4(float value) {
    		ViewImpl.setState(RadioGroupImpl.this, 4, value);
    	}
    	public void setState4(int value) {
    		ViewImpl.setState(RadioGroupImpl.this, 4, value);
    	}
    	public void setState4(double value) {
    		ViewImpl.setState(RadioGroupImpl.this, 4, value);
    	}
    	
    	public void setState4(Float value) {
    		ViewImpl.setState(RadioGroupImpl.this, 4, value);
    	}
    	public void setState4(Integer value) {
    		ViewImpl.setState(RadioGroupImpl.this, 4, value);
    	}
    	public void setState4(Double value) {
    		ViewImpl.setState(RadioGroupImpl.this, 4, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(RadioGroupImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(RadioGroupImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(RadioGroupImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(RadioGroupImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(RadioGroupImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(RadioGroupImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(RadioGroupImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(RadioGroupImpl.this);
        }
     
	
	}
	@Override
	public Class getViewClass() {
		return RadioGroupExt.class;
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
				ViewGroupImpl.setAttribute(this,  key, strValue, objValue, decorator);
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "baselineAligned": {


	radioGroup.setBaselineAligned((boolean)objValue);



			}
			break;
			case "baselineAlignedChildIndex": {


	radioGroup.setBaselineAlignedChildIndex((int)objValue);



			}
			break;
			case "divider": {
if (Build.VERSION.SDK_INT >= 11) {

	radioGroup.setDividerDrawable((android.graphics.drawable.Drawable)objValue);

}

			}
			break;
			case "gravity": {


	radioGroup.setGravity((int)objValue);



			}
			break;
			case "measureWithLargestChild": {
if (Build.VERSION.SDK_INT >= 11) {

	radioGroup.setMeasureWithLargestChildEnabled((boolean)objValue);

}

			}
			break;
			case "orientation": {


	radioGroup.setOrientation((int)objValue);



			}
			break;
			case "weightSum": {


	radioGroup.setWeightSum((float)objValue);



			}
			break;
			case "onChildViewAdded": {


		if (objValue instanceof String) {radioGroup.setOnHierarchyChangeListener(new OnHierarchyChangeListener(this, strValue));} else {setOnHierarchyChangeListener(radioGroup, objValue);}



			}
			break;
			case "onChildViewRemoved": {


		if (objValue instanceof String) {radioGroup.setOnHierarchyChangeListener(new OnHierarchyChangeListener(this, strValue));} else {setOnHierarchyChangeListener(radioGroup, objValue);}



			}
			break;
			case "checkedButton": {


		setChecked(objValue);



			}
			break;
			case "onCheckedChange": {


		setOnCheckedChange(objValue);



			}
			break;
			case "showDividers": {


		setShowDividers(objValue);



			}
			break;
			case "dividerPadding": {


		setDividerPadding(objValue);



			}
			break;
		default:
			break;
		}
		
	}
	
	@Override
	@SuppressLint("NewApi")
	public Object getAttribute(WidgetAttribute key, ILifeCycleDecorator decorator) {
		Object attributeValue = ViewGroupImpl.getAttribute(this, key, decorator);
		if (attributeValue != null) {
			return attributeValue;
		}
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "baselineAligned": {
return radioGroup.isBaselineAligned();			}
			case "baselineAlignedChildIndex": {
return radioGroup.getBaselineAlignedChildIndex();			}
			case "divider": {
if (Build.VERSION.SDK_INT >= 11) {
return radioGroup.getDividerDrawable();
}
break;			}
			case "gravity": {
if (Build.VERSION.SDK_INT >= 24) {
return radioGroup.getGravity();
}
break;			}
			case "measureWithLargestChild": {
if (Build.VERSION.SDK_INT >= 11) {
return radioGroup.isMeasureWithLargestChildEnabled();
}
break;			}
			case "orientation": {
return radioGroup.getOrientation();			}
			case "weightSum": {
return radioGroup.getWeightSum();			}
			case "checkedButton": {
return getChecked();			}
			case "showDividers": {
return getShowDividers();			}
			case "dividerPadding": {
return getDividerPadding();			}
		}
		return null;
	}


	@Override
    public Object asNativeWidget() {
        return radioGroup;
    }
    private void nativeCreate(Map<String, Object> params) {
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
    
	

	@Override
	public boolean isViewVisible() {
		return radioGroup.getVisibility() == View.VISIBLE;
	}
	


	@Override
	public void resetError() {
		int validationErrorDisplayType = getValidationErrorDisplayType();
		if ((validationErrorDisplayType & com.ashera.validations.FormElement.ERROR_DISPLAY_TYPE_POPUP) != 0) {
			setError(null);	
		}
		
		if ((validationErrorDisplayType & com.ashera.validations.FormElement.ERROR_DISPLAY_TYPE_LABEL) != 0) {
			ViewImpl.setMessageOnLabel(this, "");	
		}
		
		if ((validationErrorDisplayType & com.ashera.validations.FormElement.ERROR_DISPLAY_TYPE_STYLE) != 0) {
			ViewImpl.setStyle(this, getNormalStyle());
		}
	}

	@Override
	public void showError(String message) {
		int validationErrorDisplayType = getValidationErrorDisplayType();
		if ((validationErrorDisplayType & com.ashera.validations.FormElement.ERROR_DISPLAY_TYPE_POPUP) != 0) {
			setError(message);
		}
		
		if ((validationErrorDisplayType & com.ashera.validations.FormElement.ERROR_DISPLAY_TYPE_LABEL) != 0) {
			ViewImpl.setMessageOnLabel(this, message);
		}
		
		if ((validationErrorDisplayType & com.ashera.validations.FormElement.ERROR_DISPLAY_TYPE_STYLE) != 0) {
			ViewImpl.setStyle(this, getErrorStyle());
		}
	}
	


	@Override
	public void focus() {
		radioGroup.requestFocus();
	}
	


	@SuppressLint("NewApi")
	private void setDividerPadding(Object objValue) {
		if (Build.VERSION.SDK_INT >= 11) {
			radioGroup.setDividerPadding((int) objValue);
		}
	}

	@SuppressLint("NewApi")
	private void setShowDividers(Object objValue) {
		if (Build.VERSION.SDK_INT >= 11) {
			radioGroup.setShowDividers((int) objValue);
		}
	}

	@SuppressLint("NewApi")
	private Object getDividerPadding() {
		if (Build.VERSION.SDK_INT >= 11) {
			return radioGroup.getDividerPadding();
		}
		
		return null;
	}

	@SuppressLint("NewApi")
	private Object getShowDividers() {
		if (Build.VERSION.SDK_INT >= 11) {
			return radioGroup.getShowDividers();
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
private static class OnCheckedChangeListener implements RadioGroup.OnCheckedChangeListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnCheckedChangeListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnCheckedChangeListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onCheckedChanged (RadioGroup group, 
                int checkedId){
    
	if (action == null || action.equals("onCheckedChange")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onCheckedChange");
	    java.util.Map<String, Object> obj = getOnCheckedChangeEventObj(group,checkedId);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, group,checkedId);
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

public java.util.Map<String, Object> getOnCheckedChangeEventObj(RadioGroup group,int checkedId) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "checkedchange");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "checkedId", checkedId);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onCheckedChange", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}


	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			radioGroup.setId((int) quickConvert(id, "id"));
		}
	}
	
    

		//end - body
    private void setChecked(Object objValue) {
        radioGroup.check(PluginInvoker.getInt(objValue));        
    }
    
    private Object getChecked() {
        return radioGroup.getCheckedRadioButtonId();
    }

	
	private void setOnCheckedChange(Object objValue) {
		RadioGroup.OnCheckedChangeListener onCheckedChangeListener;
		
		if (objValue instanceof String) {
			onCheckedChangeListener= new OnCheckedChangeListener(this, (String) objValue);
		} else {
			onCheckedChangeListener= (RadioGroup.OnCheckedChangeListener) objValue;
		}
		radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
		
	}
	
	@Override
	public String getTextEntered() {
		return radioGroup.getCheckedRadioButtonId() != -1 ? "checked" : "";
	}
	
	private void setError(String message) {
		
	}

	
	private void setOnHierarchyChangeListener(RadioGroup radioGroup, Object objValue) {
		radioGroup.setOnHierarchyChangeListener((RadioGroup.OnHierarchyChangeListener) objValue);
		
	}
}
