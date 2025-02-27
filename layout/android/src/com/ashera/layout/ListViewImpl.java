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

public class ListViewImpl extends BaseHasWidgets {
	//start - body
	public final static String LOCAL_NAME = "ListView"; 
	public final static String GROUP_NAME = "ListView";
	private android.widget.ListView listView;
	

	
		@SuppressLint("NewApi")
		final static class ChoiceMode extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("multipleChoice",  0x2);
				mapping.put("multipleChoiceModal",  0x3);
				mapping.put("none",  0x0);
				mapping.put("singleChoice",  0x1);
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
		final static class TranscriptMode extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("alwaysScroll",  0x2);
				mapping.put("disabled",  0x0);
				mapping.put("normal",  0x1);
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

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("divider").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("dividerHeight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("footerDividersEnabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("headerDividersEnabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("cacheColorHint").withType("color"));
		ConverterFactory.register("ListView.choiceMode", new ChoiceMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("choiceMode").withType("ListView.choiceMode"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawSelectorOnTop").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("fastScrollEnabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scrollingCache").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("smoothScrollbar").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("stackFromBottom").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textFilterEnabled").withType("boolean"));
		ConverterFactory.register("ListView.transcriptMode", new TranscriptMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("transcriptMode").withType("ListView.transcriptMode"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onScrollChange").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onScrollStateChange").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onItemClick").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onItemLongClick").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("listSelector").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("listheader").withType("template"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("listfooter").withType("template"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("filter").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("filterDelay").withType("int").withOrder(-10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("filterId").withType("string").withOrder(-10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("filterItemPath").withType("array").withOrder(-10));
	
	}
	
	public ListViewImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  ListViewImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  ListViewImpl(String groupName, String localname) {
		super(groupName, localname);
	}

	@Override
	public IWidget newInstance() {
		return new ListViewImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
Context context = (Context) fragment.getRootActivity();
	Object systemStyle = params.get("systemStyle");
	Object systemAndroidAttrStyle = params.get("systemAndroidAttrStyle");
	
	if (systemStyle == null && systemAndroidAttrStyle == null) {
		listView = new ListViewExt(context);
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
			listView = new ListViewExt(context, null, defStyleAttr);	
		} else {
			listView = new ListViewExt(context, null, defStyleAttr, defStyleRes);
		}
		
	}

		
		nativeCreate(params);
		
		
		ViewGroupImpl.registerCommandConveter(this);

	}

	@Override
	public Object asWidget() {
		return listView;
	}


	
	@Override
	public void add(IWidget w, int index) {
		if (index != -2) {
			View view = (View) w.asWidget();
			createLayoutParams(view);
			    if (index == -1) {
			        listView.addView(view);
			    } else {
			        listView.addView(view, index);
			    }
		}
		
		ViewGroupImpl.nativeAddView(asNativeWidget(), w.asNativeWidget());
		super.add(w, index);
	}
	
	private void createLayoutParams(View view) {
		android.widget.ListView.LayoutParams layoutParams = (android.widget.ListView.LayoutParams) view.getLayoutParams();
		
		layoutParams = (android.widget.ListView.LayoutParams) view.getLayoutParams();
		if (layoutParams == null) {
			layoutParams = new android.widget.ListView.LayoutParams(-2, -2);
			view.setLayoutParams(layoutParams);
		}  else {
			layoutParams.height = -2;
			layoutParams.width = -2;
		}
	}
	
	private android.widget.ListView.LayoutParams getLayoutParams(View view) {
		return (android.widget.ListView.LayoutParams) view.getLayoutParams();		
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setChildAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue) {
		View view = (View) w.asWidget();
		android.widget.ListView.LayoutParams layoutParams = getLayoutParams(view);
		ViewGroupImpl.setChildAttribute(w, key, objValue, layoutParams);		
		
		switch (key.getAttributeName()) {
		case "layout_width":
			layoutParams.width = (int) objValue;
			break;	
		case "layout_height":
			layoutParams.height = (int) objValue;
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
		android.widget.ListView.LayoutParams layoutParams = getLayoutParams(view);

		switch (key.getAttributeName()) {
		case "layout_width":
			return layoutParams.width;
		case "layout_height":
			return layoutParams.height;
		}
		
		return null;

	}
	
		
	public class ListViewExt extends android.widget.ListView implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		
		public IWidget getWidget() {
			return ListViewImpl.this;
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

		public ListViewExt(Context context, android.util.AttributeSet attrs, int defStyleAttr) {
	        super(context, attrs, defStyleAttr);
	    }

	    public ListViewExt(Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    	super(context, attrs, defStyleAttr, defStyleRes);
	    }
		public ListViewExt(Context context) {
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
				ListViewImpl.this.invalidate();
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
        		ViewImpl.drawableStateChanged(ListViewImpl.this);
        	}
        }
        
    	public void setState0(float value) {
    		ViewImpl.setState(ListViewImpl.this, 0, value);
    	}
    	public void setState0(int value) {
    		ViewImpl.setState(ListViewImpl.this, 0, value);
    	}
    	public void setState0(double value) {
    		ViewImpl.setState(ListViewImpl.this, 0, value);
    	}
    	
    	public void setState0(Float value) {
    		ViewImpl.setState(ListViewImpl.this, 0, value);
    	}
    	public void setState0(Integer value) {
    		ViewImpl.setState(ListViewImpl.this, 0, value);
    	}
    	public void setState0(Double value) {
    		ViewImpl.setState(ListViewImpl.this, 0, value);
    	}
    	public void setState0(Object value) {
    		ViewImpl.setState(ListViewImpl.this, 0, value);
    	}
    	public void setState1(float value) {
    		ViewImpl.setState(ListViewImpl.this, 1, value);
    	}
    	public void setState1(int value) {
    		ViewImpl.setState(ListViewImpl.this, 1, value);
    	}
    	public void setState1(double value) {
    		ViewImpl.setState(ListViewImpl.this, 1, value);
    	}
    	
    	public void setState1(Float value) {
    		ViewImpl.setState(ListViewImpl.this, 1, value);
    	}
    	public void setState1(Integer value) {
    		ViewImpl.setState(ListViewImpl.this, 1, value);
    	}
    	public void setState1(Double value) {
    		ViewImpl.setState(ListViewImpl.this, 1, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(ListViewImpl.this, 1, value);
    	}
    	public void setState2(float value) {
    		ViewImpl.setState(ListViewImpl.this, 2, value);
    	}
    	public void setState2(int value) {
    		ViewImpl.setState(ListViewImpl.this, 2, value);
    	}
    	public void setState2(double value) {
    		ViewImpl.setState(ListViewImpl.this, 2, value);
    	}
    	
    	public void setState2(Float value) {
    		ViewImpl.setState(ListViewImpl.this, 2, value);
    	}
    	public void setState2(Integer value) {
    		ViewImpl.setState(ListViewImpl.this, 2, value);
    	}
    	public void setState2(Double value) {
    		ViewImpl.setState(ListViewImpl.this, 2, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(ListViewImpl.this, 2, value);
    	}
    	public void setState3(float value) {
    		ViewImpl.setState(ListViewImpl.this, 3, value);
    	}
    	public void setState3(int value) {
    		ViewImpl.setState(ListViewImpl.this, 3, value);
    	}
    	public void setState3(double value) {
    		ViewImpl.setState(ListViewImpl.this, 3, value);
    	}
    	
    	public void setState3(Float value) {
    		ViewImpl.setState(ListViewImpl.this, 3, value);
    	}
    	public void setState3(Integer value) {
    		ViewImpl.setState(ListViewImpl.this, 3, value);
    	}
    	public void setState3(Double value) {
    		ViewImpl.setState(ListViewImpl.this, 3, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(ListViewImpl.this, 3, value);
    	}
    	public void setState4(float value) {
    		ViewImpl.setState(ListViewImpl.this, 4, value);
    	}
    	public void setState4(int value) {
    		ViewImpl.setState(ListViewImpl.this, 4, value);
    	}
    	public void setState4(double value) {
    		ViewImpl.setState(ListViewImpl.this, 4, value);
    	}
    	
    	public void setState4(Float value) {
    		ViewImpl.setState(ListViewImpl.this, 4, value);
    	}
    	public void setState4(Integer value) {
    		ViewImpl.setState(ListViewImpl.this, 4, value);
    	}
    	public void setState4(Double value) {
    		ViewImpl.setState(ListViewImpl.this, 4, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(ListViewImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(ListViewImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(ListViewImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(ListViewImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(ListViewImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(ListViewImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(ListViewImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(ListViewImpl.this);
        }
     
	
	}
	@Override
	public Class getViewClass() {
		return ListViewExt.class;
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
				ViewGroupImpl.setAttribute(this,  key, strValue, objValue, decorator);
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "divider": {


	listView.setDivider((android.graphics.drawable.Drawable)objValue);



			}
			break;
			case "dividerHeight": {


	listView.setDividerHeight((int)objValue);



			}
			break;
			case "footerDividersEnabled": {


	listView.setFooterDividersEnabled((boolean)objValue);



			}
			break;
			case "headerDividersEnabled": {


	listView.setHeaderDividersEnabled((boolean)objValue);



			}
			break;
			case "cacheColorHint": {


	listView.setCacheColorHint((int)objValue);



			}
			break;
			case "choiceMode": {


	listView.setChoiceMode((int)objValue);



			}
			break;
			case "drawSelectorOnTop": {


	listView.setDrawSelectorOnTop((boolean)objValue);



			}
			break;
			case "fastScrollEnabled": {


	listView.setFastScrollEnabled((boolean)objValue);



			}
			break;
			case "scrollingCache": {


	listView.setScrollingCacheEnabled((boolean)objValue);



			}
			break;
			case "smoothScrollbar": {


	listView.setSmoothScrollbarEnabled((boolean)objValue);



			}
			break;
			case "stackFromBottom": {


	listView.setStackFromBottom((boolean)objValue);



			}
			break;
			case "textFilterEnabled": {


	listView.setTextFilterEnabled((boolean)objValue);



			}
			break;
			case "transcriptMode": {


	listView.setTranscriptMode((int)objValue);



			}
			break;
			case "onScrollChange": {


		if (objValue instanceof String) {listView.setOnScrollListener(new OnScrollListener(this, strValue));} else {setOnScrollListener(listView, objValue);}



			}
			break;
			case "onScrollStateChange": {


		if (objValue instanceof String) {listView.setOnScrollListener(new OnScrollListener(this, strValue));} else {setOnScrollListener(listView, objValue);}



			}
			break;
			case "onItemClick": {


		if (objValue instanceof String) {listView.setOnItemClickListener(new OnItemClickListener(this, strValue));} else {setOnItemClickListener(listView, objValue);}



			}
			break;
			case "onItemLongClick": {


		if (objValue instanceof String) {listView.setOnItemLongClickListener(new OnItemLongClickListener(this, strValue));} else {setOnItemLongClickListener(listView, objValue);}



			}
			break;
			case "listSelector": {


		 setListSelector(objValue);



			}
			break;
			case "listheader": {


		 addHeaderTemplate(objValue);



			}
			break;
			case "listfooter": {


		 addFooterTemplate(objValue);



			}
			break;
			case "filter": {


		 filter(objValue);



			}
			break;
			case "filterDelay": {


		 setFilterDelay(objValue);



			}
			break;
			case "filterId": {


		 setFilterId(objValue);



			}
			break;
			case "filterItemPath": {


		 setFilterItemPath(objValue);



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
			case "divider": {
return listView.getDivider();			}
			case "dividerHeight": {
return listView.getDividerHeight();			}
			case "cacheColorHint": {
return listView.getCacheColorHint();			}
			case "choiceMode": {
return listView.getChoiceMode();			}
			case "fastScrollEnabled": {
return listView.isFastScrollEnabled();			}
			case "scrollingCache": {
return listView.isScrollingCacheEnabled();			}
			case "smoothScrollbar": {
return listView.isSmoothScrollbarEnabled();			}
			case "stackFromBottom": {
return listView.isStackFromBottom();			}
			case "textFilterEnabled": {
return listView.isTextFilterEnabled();			}
			case "transcriptMode": {
return listView.getTranscriptMode();			}
			case "listSelector": {
return getListSelector();			}
		}
		return null;
	}


	@Override
    public Object asNativeWidget() {
        return listView;
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
    
	
	@SuppressLint("NewApi")
private static class OnScrollListener implements AbsListView.OnScrollListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnScrollListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnScrollListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onScroll (AbsListView view, 
                int firstVisibleItem, 
                int visibleItemCount, 
                int totalItemCount){
    
	if (action == null || action.equals("onScrollChange")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onScrollChange");
	    java.util.Map<String, Object> obj = getOnScrollChangeEventObj(view,firstVisibleItem,visibleItemCount,totalItemCount);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, view,firstVisibleItem,visibleItemCount,totalItemCount);
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
public void onScrollStateChanged (AbsListView view, 
                int scrollState){
    
	if (action == null || action.equals("onScrollStateChange")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onScrollStateChange");
	    java.util.Map<String, Object> obj = getOnScrollStateChangeEventObj(view,scrollState);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, view,scrollState);
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

public java.util.Map<String, Object> getOnScrollStateChangeEventObj(AbsListView view,int scrollState) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "scrollstatechange");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "scrollState", scrollState);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onScrollStateChange", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}

public java.util.Map<String, Object> getOnScrollChangeEventObj(AbsListView view,int firstVisibleItem,int visibleItemCount,int totalItemCount) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "scrollchange");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "firstVisibleItem", firstVisibleItem);
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "visibleItemCount", visibleItemCount);
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "totalItemCount", totalItemCount);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onScrollChange", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnItemClickListener implements AdapterView.OnItemClickListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnItemClickListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnItemClickListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onItemClick (AdapterView<?> parent, 
                View view, 
                int position, 
                long id){
    
	if (action == null || action.equals("onItemClick")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onItemClick");
	    java.util.Map<String, Object> obj = getOnItemClickEventObj(parent,view,position,id);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, parent,view,position,id);
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

public java.util.Map<String, Object> getOnItemClickEventObj(AdapterView<?> parent,View view,int position,long id) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "itemclick");ListViewImpl.addCheckItemInfo(obj, parent);
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "position", position);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onItemClick", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnItemLongClickListener implements AdapterView.OnItemLongClickListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnItemLongClickListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnItemLongClickListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public boolean onItemLongClick (AdapterView<?> parent, 
                View view, 
                int position, 
                long id){
    boolean result = true;
    
	if (action == null || action.equals("onItemLongClick")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onItemLongClick");
	    java.util.Map<String, Object> obj = getOnItemLongClickEventObj(parent,view,position,id);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 Object commandResult = EventCommandFactory.getCommand(commandName).executeCommand(w, obj, parent,view,position,id);
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

public java.util.Map<String, Object> getOnItemLongClickEventObj(AdapterView<?> parent,View view,int position,long id) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "itemlongclick");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "position", position);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onItemLongClick", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}


	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			listView.setId((int) quickConvert(id, "id"));
		}
	}
	
    

		//end - body
	
    private IWidget headerTemplate;
    private IWidget footerTemplate;
    //start - listAdapter
    private ListAdapter listAdapter;
    public ListAdapter getListAdapter() {
		return listAdapter;
	}

	class ListAdapter extends BaseAdapter  implements Filterable{
    	private final Object mLock = new Object();
    	private ArrayFilter mFilter;
    	private List<com.ashera.model.LoopParam> mObjects;
        @Override
        public boolean isEnabled(int position) {
            return true;
        }
        public ListAdapter() {
        	mObjects = dataList;
        }
        
        @Override
        public int getCount() {
            return mObjects.size();
        }

        @Override
        public Object getItem(int position) {
            return mObjects.get(position);
        }
        
        @Override
        public long getItemId(int position) {
            String id = ids.get(position);
            if(id == null) {
            	return 0;
            }
			return (int) quickConvert(id, "id");
        }
        
        @Override
        public boolean hasStableIds() {
        	return true;
        }
        
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            com.ashera.model.LoopParam model = mObjects.get(position);
            IWidget myWidget;
            if (convertView == null) {
                myWidget = (IWidget) getListItem().loadLazyWidgets(model);
                ((View) myWidget.asNativeWidget()).setTag(myWidget);
            } else {    
                myWidget = (IWidget) convertView.getTag();
            }

            updateModelRecurse(myWidget, model);

            return (View) myWidget.asNativeWidget();
        }
        
        public Filter getFilter() {
            if (mFilter == null) {
                mFilter = new ArrayFilter();
            }
            return mFilter;
        }
        
        public void dofilterSync(String text) {
        	getFilter();
        	mFilter.publishResults(text, mFilter.performFiltering(text));
        }
        
        private class ArrayFilter extends Filter {
            @Override
            protected FilterResults performFiltering(CharSequence prefix) {
                final FilterResults results = new FilterResults();

                if (prefix == null || prefix.length() == 0) {
                	prefix = "";
                }
                
                final String prefixString = prefix.toString();

                final ArrayList<com.ashera.model.LoopParam> values;
                synchronized (mLock) {
                    values = new ArrayList<>(dataList);
                }

                final int count = values.size();
                final ArrayList<com.ashera.model.LoopParam> newValues = new ArrayList<>();
    			IFilter filter = FilterFactory.get(filterId);
    	        if (filter == null) {
    	        	filter = FilterFactory.get(FilterFactory.DEFAULT_FILTER);
    	        }

                for (int i = 0; i < count; i++) {
                    final com.ashera.model.LoopParam value = values.get(i);
                    
                    if (filterItemPaths != null) {
                    	for (String path : filterItemPaths) {
                    		com.ashera.model.ModelExpressionParser.ModelLoopHolder modelLoopHolder = com.ashera.model.ModelExpressionParser.parseModelLoopExpression(getModelFor());
            	            
            	            String varName = modelLoopHolder.varName;
                        	Object modelVal = getModelByPath(varName, value);
                        	modelVal = getModelByPath(path, modelVal);
                        	
                			if (filter.filter(PluginInvoker.getString(modelVal), prefixString)) {
                				newValues.add(value);
                				break;
                			}
                		}	
                    } else {
            			if (value != null && filter.filter(value.toString(), prefixString)) {
            				newValues.add(value);
            			}
                    }

                    results.values = newValues;
                    results.count = newValues.size();
                }
                
                if (results.values == null) {
                	results.values = new java.util.ArrayList<>(0);
                }

                return results;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                //noinspection unchecked
                mObjects = (List<com.ashera.model.LoopParam>) results.values;
                if (results.count > 0) {
                    notifyDataSetChanged();
                } else {
                    notifyDataSetInvalidated();
                }
            }
        }
    }

    //end - listAdapter
    
    @Override
    public void initialized() {
    	super.initialized();        
        
        if (headerTemplate != null) {
            listView.addHeaderView((View) headerTemplate.loadLazyWidgets((com.ashera.model.LoopParam) null).asWidget());
        }
        
        if (footerTemplate != null) {
            View footerView = (View) footerTemplate.loadLazyWidgets((com.ashera.model.LoopParam)null).asWidget();
            listView.addFooterView(footerView);
        }
    }
    
    
    private void addFooterTemplate(Object objValue) {
        this.footerTemplate = (IWidget) objValue;
    }

    private void addHeaderTemplate(Object objValue) {
        this.headerTemplate = (IWidget) objValue;
    }
    
	private void nativeCreate(Map<String, Object> params) {
        this.listAdapter = new ListAdapter();
        this.listView.setAdapter(listAdapter);
	}

    //start - model
    private boolean disableUpdate = false;
    @Override
    protected void addObject(com.ashera.model.LoopParam childModel, String modelIdPath, int index, String currentLoopVar) {
        String id = null;
        if (modelIdPath != null) {
            id = PluginInvoker.getString(getModelByPath(modelIdPath, childModel.get(currentLoopVar)));
        } else {
            id = UUID.randomUUID().toString();
        }
        
        if (!ids.contains(id)) {
            if (index == -1) {
                ids.add(id);
                dataList.add(childModel);
            } else {
                ids.add(index, id);
                dataList.add(index, childModel);
            }
            
        } else {
            // update the objects on the widget
            dataList.set(ids.indexOf(id), childModel);
        }

        reloadTable();
    }
    
    @Override
    public void addAllModel(Object objValue) {
    	disableUpdate = true;
    	super.addAllModel(objValue);
    	disableUpdate = false;
    	reloadTable();
    }

    @Override
    public boolean remove(int index) {
        if (index + 1 <= ids.size()) {
            ids.remove(index);
        }
        if (index + 1 <= dataList.size()) {
            dataList.remove(index);
        }
        reloadTable();
        return true;
    }

    
    @Override
    public boolean areWidgetItemsRecycled() {
    	return true;
    }

	
	@Override
	public void clear() {
		ids.clear();
		dataList.clear();
		reloadTable();
	}
	
	@Override
	protected void clearModel() {
		ids.clear();
		dataList.clear();
	}
	
	@Override
	public void notifyDataSetChanged() {
		disableUpdate = true;
		super.notifyDataSetChanged();
		disableUpdate = false;
		reloadTable();
	}
	//end - model
	
	//start - event
	@Override
	public void updateModelToEventMap(Map<String, Object> eventMap, String eventType, String eventParams) {
	    if (eventMap.containsKey("position") && eventType.startsWith("onItem")) {
	    	int position = PluginInvoker.getInt(eventMap.get("position"));
	        position = updatePosition(eventMap, position);
	        if (position >= 0 && position < dataList.size()) {  
	            com.ashera.model.LoopParam loopParam = dataList.get(position);
	            updateModelToEventMap(eventMap, eventParams, loopParam);
	        }
	    } else {
	        super.updateModelToEventMap(eventMap, eventType, eventParams);
	    }
	}
	//end - event
	

    private int updatePosition(java.util.Map<java.lang.String, java.lang.Object> eventMap, int position) {
        if (headerTemplate != null) {
            position--;
            eventMap.put("position", position);
        }
        return position;
    }
    

	private void reloadTable() {
		if (!disableUpdate && listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
	}

	
	private void setListSelector(Object objValue) {
		listView.setSelector((android.graphics.drawable.Drawable) objValue);
	}
	


	private Object getListSelector() {
		return listView.getSelector();
	}

	//start - addCheckItemInfo
	private static void addCheckItemInfo(java.util.Map<String, Object> obj, AdapterView<?> parent) {
		if (parent instanceof AbsListView) {
	    	PluginInvoker.putJSONSafeObjectIntoMap(obj, "checkedItemCount", ((AbsListView) parent).getCheckedItemCount());
	    	PluginInvoker.putJSONSafeObjectIntoMap(obj, "checkedItemPosition", ((AbsListView) parent).getCheckedItemPosition());
	    	long[] checkedItemIds = ((AbsListView) parent).getCheckedItemIds();
	    	List<String> ids = new java.util.ArrayList<>();
	    	for (long checkedItemId: checkedItemIds) {
	    		ids.add(IdGenerator.getName((int) checkedItemId));
			}
			PluginInvoker.putJSONSafeObjectIntoMap(obj, "checkedItemIds", ids);
	    }
	}
	//end - addCheckItemInfo
	
	
	private void setOnScrollListener(ListView listView, Object objValue) {
		listView.setOnScrollListener((ListView.OnScrollListener) objValue);
	}
	

	private void setOnItemLongClickListener(ListView listView, Object objValue) {
		listView.setOnItemLongClickListener((ListView.OnItemLongClickListener) objValue);
		
	}

	private void setOnItemClickListener(ListView listView, Object objValue) {
		listView.setOnItemClickListener((ListView.OnItemClickListener) objValue);
		
	}
	
	//start - filter	
	private enum FilterStatus { None, Restore, Filtering, Done }
	private FilterStatus filter = FilterStatus.None;
	private String query;
	private int filterDelay = 100;
	private android.os.Handler handler;
	private void filter(Object query) {
		this.query = (String) query;

		if (handler == null) {
			handler = new android.os.Handler(); 
		} else {
			handler.removeCallbacks(null);
		}
		handler.postDelayed(() -> {
			preFilter();
			this.listAdapter.dofilterSync(this.query);
			postFilter();	
		}, filterDelay);
	}
	
	
	
	private void setFilterDelay(Object objValue) {
		this.filterDelay = (int) objValue;
		
	}
	
	private String filterId = FilterFactory.DEFAULT_FILTER;
	private void setFilterId(Object objValue) {
		filterId = (String) objValue;
	}
	
	
	private String[] filterItemPaths; 
	private void setFilterItemPath(Object objValue) {
		filterItemPaths = (String[]) objValue;		
	}

	//end - filter
	private void preFilter() {
		
	}
	
	private void postFilter() {
		
	}


}
