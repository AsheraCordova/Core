package com.ashera.layout;
// start - imports
import java.util.*;

import r.android.annotation.SuppressLint;
import r.android.content.Context;
import r.android.os.Build;
import r.android.view.*;
import r.android.widget.*;
import r.android.view.View.*;

import com.ashera.widget.BaseHasWidgets;

import r.android.annotation.SuppressLint;

import com.ashera.core.IFragment;
import com.ashera.widget.bus.*;
import com.ashera.converter.*;
import com.ashera.widget.bus.Event.*;
import com.ashera.widget.*;
import com.ashera.widget.IWidgetLifeCycleListener.*;
import com.ashera.layout.*;

import androidx.core.view.*;

import static com.ashera.widget.IWidget.*;
//end - imports

public class ScrollViewImpl extends BaseHasWidgets {
	//start - body
	private Object pane;
	public final static String LOCAL_NAME = "ScrollView"; 
	public final static String GROUP_NAME = "ScrollView";
	private r.android.widget.ScrollView scrollView;
	

	
	@Override
	public void loadAttributes(String localName) {
		ViewGroupImpl.register(localName);

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("foregroundGravity").withType("gravity"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("measureAllChildren").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("fillViewport").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scrollY").withType("dimension").withBufferStrategy(BUFFER_STRATEGY_DURING_INIT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onScrollChange").withType("string"));
	
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_gravity").withType("gravity").forChild());
	}
	
	public ScrollViewImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  ScrollViewImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  ScrollViewImpl(String groupName, String localname) {
		super(groupName, localname);
	}

	@Override
	public IWidget newInstance() {
		return new ScrollViewImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
		scrollView = new ScrollViewExt();
		
		nativeCreate(params);
		
		
		ViewGroupImpl.registerCommandConveter(this);
	}

	@Override
	public Object asWidget() {
		return scrollView;
	}

	@Override
	public boolean remove(IWidget w) {		
		boolean remove = super.remove(w);
		scrollView.removeView((View) w.asWidget());
         ViewGroupImpl.nativeRemoveView(w);            
		return remove;
	}
	
	@Override
    public boolean remove(int index) {
		IWidget widget = widgets.get(index);
        boolean remove = super.remove(index);

        if (index + 1 <= scrollView.getChildCount()) {
            scrollView.removeViewAt(index);
            ViewGroupImpl.nativeRemoveView(widget);            
        }    
        return remove;
    }
	
	@Override
	public void add(IWidget w, int index) {
		if (index != -2) {
			View view = (View) w.asWidget();
			createLayoutParams(view);
			    if (index == -1) {
			        scrollView.addView(view);
			    } else {
			        scrollView.addView(view, index);
			    }
		}
		
		ViewGroupImpl.nativeAddView(asNativeWidget(), w.asNativeWidget());
		super.add(w, index);
	}
	
	private void createLayoutParams(View view) {
		r.android.widget.ScrollView.LayoutParams layoutParams = (r.android.widget.ScrollView.LayoutParams) view.getLayoutParams();
		
		layoutParams = (r.android.widget.ScrollView.LayoutParams) view.getLayoutParams();
		if (layoutParams == null) {
			layoutParams = new r.android.widget.ScrollView.LayoutParams(-2, -2);
			view.setLayoutParams(layoutParams);
		}  else {
			layoutParams.height = -2;
			layoutParams.width = -2;
		}
	}
	
	private r.android.widget.ScrollView.LayoutParams getLayoutParams(View view) {
		return (r.android.widget.ScrollView.LayoutParams) view.getLayoutParams();		
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setChildAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue) {
		View view = (View) w.asWidget();
		r.android.widget.ScrollView.LayoutParams layoutParams = getLayoutParams(view);
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
		r.android.widget.ScrollView.LayoutParams layoutParams = getLayoutParams(view);

		switch (key.getAttributeName()) {
		case "layout_width":
			return layoutParams.width;
		case "layout_height":
			return layoutParams.height;
			case "layout_gravity": {
return layoutParams.gravity;			}

		}
		
		return null;

	}
	
		
	public class ScrollViewExt extends r.android.widget.ScrollView implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
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

		public ScrollViewExt() {
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
			postOnMeasure(widthMeasureSpec, heightMeasureSpec);
		}
		
		@Override
		protected void onLayout(boolean changed, int l, int t, int r, int b) {
			super.onLayout(changed, l, t, r, b);
			ViewImpl.setDrawableBounds(ScrollViewImpl.this, l, t, r, b);
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b, (int) (computeVerticalScrollRange()));
			replayBufferedEvents();
	        ViewImpl.redrawDrawables(ScrollViewImpl.this);
			
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
				ScrollViewImpl.this.invalidate();
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
        	ViewImpl.drawableStateChanged(ScrollViewImpl.this);
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
    		IWidget widget = template.loadLazyWidgets(ScrollViewImpl.this.getParent());
    		return (View) widget.asWidget();
    	}        
        
    	@Override
		public void remeasure() {
			getFragment().remeasure();
		}
    	
        @Override
		public void removeFromParent() {
        	ScrollViewImpl.this.getParent().remove(ScrollViewImpl.this);
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
			ScrollViewImpl.this.setAttribute(name, value, true);
		}
        @Override
        public void setVisibility(int visibility) {
            super.setVisibility(visibility);
            ((org.eclipse.swt.widgets.Control)asNativeWidget()).setVisible(View.VISIBLE == visibility);
            
        }
        
        	public void state0() {
        		ViewImpl.state(ScrollViewImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(ScrollViewImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(ScrollViewImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(ScrollViewImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(ScrollViewImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(ScrollViewImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(ScrollViewImpl.this);
        }
	}
	@Override
	public Class getViewClass() {
		return ScrollViewExt.class;
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		ViewGroupImpl.setAttribute(this, key, strValue, objValue, decorator);
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "foregroundGravity": {


	scrollView.setForegroundGravity((int)objValue);



			}
			break;
			case "measureAllChildren": {


	scrollView.setMeasureAllChildren((boolean)objValue);



			}
			break;
			case "fillViewport": {


	scrollView.setFillViewport((boolean)objValue);



			}
			break;
			case "scrollY": {


		setScrollY(objValue);



			}
			break;
			case "onScrollChange": {


		 setOnScroll(objValue);



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
			case "measureAllChildren": {
if (Build.VERSION.SDK_INT >= 14) {
return scrollView.getMeasureAllChildren();
}
break;			}
			case "fillViewport": {
return scrollView.isFillViewport();			}
			case "scrollY": {
return getScrollY();			}
		}
		return null;
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
private static class OnScrollChangeListener implements View.OnScrollChangeListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnScrollChangeListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnScrollChangeListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onScrollChange (View v, 
                int scrollX, 
                int scrollY, 
                int oldScrollX, 
                int oldScrollY){
    
	if (action == null || action.equals("onScrollChange")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onScrollChange");
	    java.util.Map<String, Object> obj = getOnScrollChangeEventObj(v,scrollX,scrollY,oldScrollX,oldScrollY);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, v,scrollX,scrollY,oldScrollX,oldScrollY);
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
		    activity.sendEventMessage(obj);
		}
	}
    return;
}//#####

public java.util.Map<String, Object> getOnScrollChangeEventObj(View v,int scrollX,int scrollY,int oldScrollX,int oldScrollY) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "scrollchange");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "scrollX", scrollX);
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "scrollY", scrollY);
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "oldScrollX", oldScrollX);
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "oldScrollY", oldScrollY);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onScrollChange", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}


	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			scrollView.setId((int) quickConvert(id, "id"));
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

	
private ScrollViewCommandBuilder builder;
private ScrollViewBean bean;
public Object getPlugin(String plugin) {
	return WidgetFactory.getAttributable(plugin).newInstance(this);
}
public ScrollViewBean getBean() {
	if (bean == null) {
		bean = new ScrollViewBean();
	}
	return bean;
}
public ScrollViewCommandBuilder getBuilder() {
	if (builder == null) {
		builder = new ScrollViewCommandBuilder();
	}
	return builder;
}


public  class ScrollViewCommandBuilder extends com.ashera.layout.ViewGroupImpl.ViewGroupCommandBuilder <ScrollViewCommandBuilder> {
    public ScrollViewCommandBuilder() {
	}
	
	public ScrollViewCommandBuilder execute(boolean setter) {
		if (setter) {
			executeCommand(command, null, IWidget.COMMAND_EXEC_SETTER_METHOD);
			getFragment().remeasure();
		}
		executeCommand(command, null, IWidget.COMMAND_EXEC_GETTER_METHOD);
return this;	}

public ScrollViewCommandBuilder setForegroundGravity(String value) {
	Map<String, Object> attrs = initCommand("foregroundGravity");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public ScrollViewCommandBuilder tryGetMeasureAllChildren() {
	Map<String, Object> attrs = initCommand("measureAllChildren");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object isMeasureAllChildren() {
	Map<String, Object> attrs = initCommand("measureAllChildren");
	return attrs.get("commandReturnValue");
}
public ScrollViewCommandBuilder setMeasureAllChildren(boolean value) {
	Map<String, Object> attrs = initCommand("measureAllChildren");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public ScrollViewCommandBuilder tryGetFillViewport() {
	Map<String, Object> attrs = initCommand("fillViewport");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object isFillViewport() {
	Map<String, Object> attrs = initCommand("fillViewport");
	return attrs.get("commandReturnValue");
}
public ScrollViewCommandBuilder setFillViewport(boolean value) {
	Map<String, Object> attrs = initCommand("fillViewport");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public ScrollViewCommandBuilder tryGetScrollY() {
	Map<String, Object> attrs = initCommand("scrollY");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getScrollY() {
	Map<String, Object> attrs = initCommand("scrollY");
	return attrs.get("commandReturnValue");
}
public ScrollViewCommandBuilder setScrollY(String value) {
	Map<String, Object> attrs = initCommand("scrollY");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public ScrollViewCommandBuilder setOnScrollChange(String value) {
	Map<String, Object> attrs = initCommand("onScrollChange");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
}
public class ScrollViewBean extends com.ashera.layout.ViewGroupImpl.ViewGroupBean{
		public ScrollViewBean() {
			super(ScrollViewImpl.this);
		}
public void setForegroundGravity(String value) {
	getBuilder().reset().setForegroundGravity(value).execute(true);
}

public Object isMeasureAllChildren() {
	return getBuilder().reset().tryGetMeasureAllChildren().execute(false).isMeasureAllChildren(); 
}
public void setMeasureAllChildren(boolean value) {
	getBuilder().reset().setMeasureAllChildren(value).execute(true);
}

public Object isFillViewport() {
	return getBuilder().reset().tryGetFillViewport().execute(false).isFillViewport(); 
}
public void setFillViewport(boolean value) {
	getBuilder().reset().setFillViewport(value).execute(true);
}

public Object getScrollY() {
	return getBuilder().reset().tryGetScrollY().execute(false).getScrollY(); 
}
public void setScrollY(String value) {
	getBuilder().reset().setScrollY(value).execute(true);
}

public void setOnScrollChange(String value) {
	getBuilder().reset().setOnScrollChange(value).execute(true);
}

}


private ScrollViewCommandParamsBuilder paramsBuilder;
private ScrollViewParamsBean paramsBean;

public ScrollViewParamsBean getParamsBean() {
	if (paramsBean == null) {
		paramsBean = new ScrollViewParamsBean();
	}
	return paramsBean;
}
public ScrollViewCommandParamsBuilder getParamsBuilder() {
	if (paramsBuilder == null) {
		paramsBuilder = new ScrollViewCommandParamsBuilder();
	}
	return paramsBuilder;
}



public class ScrollViewParamsBean extends com.ashera.layout.ViewGroupImpl.ViewGroupParamsBean{
public Object getLayoutGravity(IWidget w) {
	java.util.Map<String, Object> layoutParams = new java.util.HashMap<String, Object>();
	java.util.Map<String, Object> command = getParamsBuilder().reset().tryGetLayoutGravity().getCommand();
	
	layoutParams.put("layoutParams", command);
	w.executeCommand(layoutParams, null, COMMAND_EXEC_GETTER_METHOD); 
	return getParamsBuilder().getLayoutGravity();
}
public void setLayoutGravity(IWidget w, String value) {
	java.util.Map<String, Object> layoutParams = new java.util.HashMap<String, Object>();
	layoutParams.put("layoutParams", getParamsBuilder().reset().setLayoutGravity(value).getCommand());
	w.executeCommand(layoutParams, null, COMMAND_EXEC_SETTER_METHOD);
	w.getFragment().remeasure();
}

}





public class ScrollViewCommandParamsBuilder extends com.ashera.layout.ViewGroupImpl.ViewGroupCommandParamsBuilder<ScrollViewCommandParamsBuilder>{
public ScrollViewCommandParamsBuilder tryGetLayoutGravity() {
	Map<String, Object> attrs = initCommand("layout_gravity");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getLayoutGravity() {
	Map<String, Object> attrs = initCommand("layout_gravity");
	return attrs.get("commandReturnValue");
}
public ScrollViewCommandParamsBuilder setLayoutGravity(String value) {
	Map<String, Object> attrs = initCommand("layout_gravity");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
}

	//end - body
	
	@Override
	public void initialized() {
		super.initialized();
    	this.thumbWidth = ((org.eclipse.swt.custom.ScrolledComposite) pane).computeSize(org.eclipse.swt.SWT.DEFAULT, 1000).x;
	}
	//start - adjustPaddingIfScrollBarPresent
	private int thumbWidth = 0; 
	private void postOnMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		scrollView.adjustPaddingIfScrollBarPresent(widthMeasureSpec, heightMeasureSpec, thumbWidth);
	}
	//end - adjustPaddingIfScrollBarPresent 

	private void nativeCreate(Map<String, Object> params) {
		org.eclipse.swt.custom.ScrolledComposite scrolledComposite = new org.eclipse.swt.custom.ScrolledComposite(ViewImpl.getParent(this), 
		        getStyle(params, fragment) | org.eclipse.swt.SWT.V_SCROLL | org.eclipse.swt.SWT.DOUBLE_BUFFERED);		
    	pane = scrolledComposite;
    	scrolledComposite.setExpandVertical(false);
	}

	
	
	@Override
	public Object asNativeWidget() {
		return pane;
	}
	
	private void setScrollY(Object objValue) {
        Object nativeWidget = asNativeWidget();
        org.eclipse.swt.custom.ScrolledComposite scrollable = (org.eclipse.swt.custom.ScrolledComposite) nativeWidget;
        scrollable.setOrigin(scrollable.getOrigin().x, (int) objValue);
    }

	private Object getScrollY() {
		Object nativeWidget = asNativeWidget();
		org.eclipse.swt.widgets.Scrollable scrollable = (org.eclipse.swt.widgets.Scrollable) nativeWidget;
		org.eclipse.swt.widgets.ScrollBar vBar = scrollable.getVerticalBar();
		if (vBar != null) {
			return vBar.getSelection();
		}

		return null;
	}

	
	private void setOnScroll(Object objValue) {
		Object nativeWidget = asNativeWidget();
		View view = (View) asWidget();
		View.OnScrollChangeListener onScrollChangeListener; 
		
		if (objValue instanceof String) {
			onScrollChangeListener = new OnScrollChangeListener(this, (String) objValue);
		} else {
			onScrollChangeListener = (View.OnScrollChangeListener) objValue;
		}
		
		org.eclipse.swt.widgets.Scrollable scrollable = (org.eclipse.swt.widgets.Scrollable) nativeWidget;
	    org.eclipse.swt.widgets.ScrollBar vBar = scrollable.getVerticalBar();
	    if (vBar != null) {
	    	ViewImpl.setOnListener(vBar, org.eclipse.swt.SWT.Selection, org.eclipse.swt.SWT.Selection + "", new org.eclipse.swt.widgets.Listener() {
	    	    int oldScrollY = 0;
                @Override
                public void handleEvent(org.eclipse.swt.widgets.Event event) {
                    int selection = vBar.getSelection();
                    onScrollChangeListener.onScrollChange(view, 0, selection, 0, oldScrollY);
                    oldScrollY = selection;
                    view.getViewTreeObserver().dispatchOnScrollChanged();
	    	    
                }
	    	});
	    }
	}	
}
