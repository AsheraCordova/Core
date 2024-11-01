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

public class fragmentImpl extends BaseHasWidgets implements com.ashera.core.IFragmentContainer{
	//start - body
	private Object pane;
	public final static String LOCAL_NAME = "fragment"; 
	public final static String GROUP_NAME = "fragment";
	private r.android.widget.FrameLayout frameLayout;
	

	
	@Override
	public void loadAttributes(String localName) {
		ViewGroupImpl.register(localName);

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("name").withType("string").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout").withType("string").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("navGraph").withType("string").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tag").withType("string").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("replace").withType("string").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("navigate").withType("object").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("popBackStack").withType("nil").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("navigateWithPopBackStack").withType("object").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("navigateAsTop").withType("object").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("navigateWithPopBackStackTo").withType("object").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("popBackStackTo").withType("object").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
	
	}
	
	public fragmentImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  fragmentImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  fragmentImpl(String groupName, String localname) {
		super(groupName, localname);
	}

	@Override
	public IWidget newInstance() {
		return new fragmentImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
		frameLayout = new fragmentExt();
		
		nativeCreate(params);
		
		
		ViewGroupImpl.registerCommandConveter(this);
	}

	@Override
	public Object asWidget() {
		return frameLayout;
	}

	@Override
	public boolean remove(IWidget w) {
		boolean remove = super.remove(w);
		frameLayout.removeView((View) w.asWidget());
		 nativeRemoveView(w);            
		return remove;
	}
	
	@Override
    public boolean remove(int index) {
		IWidget widget = widgets.get(index);
        boolean remove = super.remove(index);

        if (index + 1 <= frameLayout.getChildCount()) {
            frameLayout.removeViewAt(index);
            nativeRemoveView(widget);
        }    
        return remove;
    }

	private void nativeRemoveView(IWidget widget) {
		r.android.animation.LayoutTransition layoutTransition = frameLayout.getLayoutTransition();
		if (layoutTransition != null && (
				layoutTransition.isTransitionTypeEnabled(r.android.animation.LayoutTransition.CHANGE_DISAPPEARING) ||
				layoutTransition.isTransitionTypeEnabled(r.android.animation.LayoutTransition.DISAPPEARING)
				)) {
			addToBufferedRunnables(() -> ViewGroupImpl.nativeRemoveView(widget));          
		} else {
			ViewGroupImpl.nativeRemoveView(widget);
		}
	}
	
	@Override
	public void add(IWidget w, int index) {
		if (index != -2) {
			View view = (View) w.asWidget();
			createLayoutParams(view);
			    if (index == -1) {
			        frameLayout.addView(view);
			    } else {
			        frameLayout.addView(view, index);
			    }
		}
		
		ViewGroupImpl.nativeAddView(asNativeWidget(), w.asNativeWidget());
		super.add(w, index);
	}
	
	private void createLayoutParams(View view) {
		r.android.widget.FrameLayout.LayoutParams layoutParams = (r.android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
		
		layoutParams = (r.android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
		if (layoutParams == null) {
			layoutParams = new r.android.widget.FrameLayout.LayoutParams(-2, -2);
			view.setLayoutParams(layoutParams);
		}  else {
			layoutParams.height = -2;
			layoutParams.width = -2;
		}
	}
	
	private r.android.widget.FrameLayout.LayoutParams getLayoutParams(View view) {
		return (r.android.widget.FrameLayout.LayoutParams) view.getLayoutParams();		
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setChildAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue) {
		View view = (View) w.asWidget();
		r.android.widget.FrameLayout.LayoutParams layoutParams = getLayoutParams(view);
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
		r.android.widget.FrameLayout.LayoutParams layoutParams = getLayoutParams(view);

		switch (key.getAttributeName()) {
		case "layout_width":
			return layoutParams.width;
		case "layout_height":
			return layoutParams.height;
		}
		
		return null;

	}
	
		
	public class fragmentExt extends r.android.widget.FrameLayout implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		private List<IWidget> overlays;
		public IWidget getWidget() {
			return fragmentImpl.this;
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

		public fragmentExt() {
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
			ViewImpl.setDrawableBounds(fragmentImpl.this, l, t, r, b);
			if (!isOverlay()) {
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			}
			replayBufferedEvents();
	        ViewImpl.redrawDrawables(fragmentImpl.this);
	        overlays = ViewImpl.drawOverlay(fragmentImpl.this, overlays);
			
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
				fragmentImpl.this.invalidate();
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
        		ViewImpl.drawableStateChanged(fragmentImpl.this);
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
    		
    		IWidget widget = template.loadLazyWidgets(fragmentImpl.this);
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
        	fragmentImpl.this.getParent().remove(fragmentImpl.this);
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
			fragmentImpl.this.setAttribute(name, value, !(value instanceof String));
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
    		ViewImpl.setState(fragmentImpl.this, 0, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(fragmentImpl.this, 1, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(fragmentImpl.this, 2, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(fragmentImpl.this, 3, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(fragmentImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(fragmentImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(fragmentImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(fragmentImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(fragmentImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(fragmentImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(fragmentImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(fragmentImpl.this);
        }
     
		@Override
		public void endViewTransition(r.android.view.View view) {
			super.endViewTransition(view);
			runBufferedRunnables();
		}
	
	}
	@Override
	public Class getViewClass() {
		return fragmentExt.class;
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
				ViewGroupImpl.setAttribute(this, key, strValue, objValue, decorator);
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "name": {


		setName(objValue);



			}
			break;
			case "layout": {


		setTemplate(objValue);



			}
			break;
			case "navGraph": {


		setNavGraph(objValue);



			}
			break;
			case "tag": {


		setTag(objValue);



			}
			break;
			case "replace": {


		replace(objValue);



			}
			break;
			case "navigate": {
		if (objValue instanceof Map) {
			Map<String, Object> data = ((Map<String, Object>) objValue);
		Object actionId = quickConvert(data.get("actionId"), "string");
		Object scopeObjects = quickConvert(data.get("scopeObjects"), "object");


		 navigate(actionId, scopeObjects);


}
if (objValue instanceof java.util.List) {
	java.util.List<Object> list = (java.util.List<Object>) objValue;
	for (Object object : list) {
		Map<String, Object> data = PluginInvoker.getMap(object);
		Object actionId = quickConvert(data.get("actionId"), "string");
		Object scopeObjects = quickConvert(data.get("scopeObjects"), "object");


		 navigate(actionId, scopeObjects);


	}
}
			}
			break;
			case "popBackStack": {


		 popBackStack();



			}
			break;
			case "navigateWithPopBackStack": {
		if (objValue instanceof Map) {
			Map<String, Object> data = ((Map<String, Object>) objValue);
		Object actionId = quickConvert(data.get("actionId"), "string");
		Object scopeObjects = quickConvert(data.get("scopeObjects"), "object");


		 navigateWithPopBackStack(actionId, scopeObjects);


}
if (objValue instanceof java.util.List) {
	java.util.List<Object> list = (java.util.List<Object>) objValue;
	for (Object object : list) {
		Map<String, Object> data = PluginInvoker.getMap(object);
		Object actionId = quickConvert(data.get("actionId"), "string");
		Object scopeObjects = quickConvert(data.get("scopeObjects"), "object");


		 navigateWithPopBackStack(actionId, scopeObjects);


	}
}
			}
			break;
			case "navigateAsTop": {
		if (objValue instanceof Map) {
			Map<String, Object> data = ((Map<String, Object>) objValue);
		Object actionId = quickConvert(data.get("actionId"), "string");
		Object scopeObjects = quickConvert(data.get("scopeObjects"), "object");


		 navigateAsTop(actionId, scopeObjects);


}
if (objValue instanceof java.util.List) {
	java.util.List<Object> list = (java.util.List<Object>) objValue;
	for (Object object : list) {
		Map<String, Object> data = PluginInvoker.getMap(object);
		Object actionId = quickConvert(data.get("actionId"), "string");
		Object scopeObjects = quickConvert(data.get("scopeObjects"), "object");


		 navigateAsTop(actionId, scopeObjects);


	}
}
			}
			break;
			case "navigateWithPopBackStackTo": {
		if (objValue instanceof Map) {
			Map<String, Object> data = ((Map<String, Object>) objValue);
		Object actionId = quickConvert(data.get("actionId"), "string");
		Object destinationId = quickConvert(data.get("destinationId"), "string");
		Object inclusive = quickConvert(data.get("inclusive"), "boolean");
		Object scopeObjects = quickConvert(data.get("scopeObjects"), "object");


		 navigateWithPopBackStackTo(actionId, destinationId, inclusive, scopeObjects);


}
if (objValue instanceof java.util.List) {
	java.util.List<Object> list = (java.util.List<Object>) objValue;
	for (Object object : list) {
		Map<String, Object> data = PluginInvoker.getMap(object);
		Object actionId = quickConvert(data.get("actionId"), "string");
		Object destinationId = quickConvert(data.get("destinationId"), "string");
		Object inclusive = quickConvert(data.get("inclusive"), "boolean");
		Object scopeObjects = quickConvert(data.get("scopeObjects"), "object");


		 navigateWithPopBackStackTo(actionId, destinationId, inclusive, scopeObjects);


	}
}
			}
			break;
			case "popBackStackTo": {
		if (objValue instanceof Map) {
			Map<String, Object> data = ((Map<String, Object>) objValue);
		Object destinationId = quickConvert(data.get("destinationId"), "string");
		Object inclusive = quickConvert(data.get("inclusive"), "boolean");


		 popBackStackTo(destinationId, inclusive);


}
if (objValue instanceof java.util.List) {
	java.util.List<Object> list = (java.util.List<Object>) objValue;
	for (Object object : list) {
		Map<String, Object> data = PluginInvoker.getMap(object);
		Object destinationId = quickConvert(data.get("destinationId"), "string");
		Object inclusive = quickConvert(data.get("inclusive"), "boolean");


		 popBackStackTo(destinationId, inclusive);


	}
}
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
		}
		return null;
	}


	@Override
    public Object asNativeWidget() {
        return pane;
    }
    public boolean isWidgetDisposed() {
		return ((org.eclipse.swt.widgets.Control) pane).isDisposed();
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
    
	

private String layout;
private String name;
private String navGraph;
private String tag;
private void setTemplate(Object objValue) {
	this.layout = (String) objValue;
	
}

private void setName(Object objValue) {
	this.name = (String) objValue;
}

private void setNavGraph(Object objValue) {
	this.navGraph = (String) objValue;
}

private void replace(Object objValue) {
	this.navGraph = (String) objValue;
	this.layout = (String) objValue;
	addOrReplaceFragment(false);
	executePendingTransactions();
}

private void setTag(Object objValue) {
	this.tag = (String) objValue;
}

@Override
public void initialized() {
	super.initialized();
	addOrReplaceFragment(true);
}


private void navigate(Object actionId, Object scopeObjects) {
	if (isValidFragment()) {
		checkIfDialog(actionId);
		com.ashera.core.UINavigatorImpl navigator = getNavigator();
		navigator.navigate((String) actionId, null, false, false, (List<Map<String, Object>>)scopeObjects, getFragment());
		makeCurrentFragmentActive();
	}
	
}

private void checkIfDialog(Object actionId) {
	if (((String)actionId).startsWith("dialog#")) {
		throw new RuntimeException("Dialog is not supported. Use navigator.navigate(...).");
	}
}

private void popBackStack() {
	if (isValidFragment()) {
		com.ashera.core.UINavigatorImpl navigator = getNavigator();
		navigator.popBackStack(getFragment());
		makeCurrentFragmentActive();
	}
}


private void popBackStackTo(Object destinationId, Object inclusive) {
	if (isValidFragment()) {
		com.ashera.core.UINavigatorImpl navigator = getNavigator();
		navigator.popBackStack(getFragment(), (String) destinationId, (boolean)inclusive);
		makeCurrentFragmentActive();
	}	
}

private void navigateWithPopBackStackTo(Object actionId, Object destinationId, Object inclusive,
		Object scopeObjects) {
	if (isValidFragment()) {
		checkIfDialog(actionId);
		com.ashera.core.UINavigatorImpl navigator = getNavigator();
		navigator.navigate((String) actionId, (String) destinationId, (boolean)inclusive, false, (List<Map<String, Object>>)scopeObjects, getFragment());
		makeCurrentFragmentActive();
	}
	
	
}

private void navigateAsTop(Object actionId, Object scopeObjects) {
	if (isValidFragment()) {
		checkIfDialog(actionId);
		com.ashera.core.UINavigatorImpl navigator = getNavigator();
		navigator.navigate((String) actionId, null, false, true, (List<Map<String, Object>>)scopeObjects, getFragment());
		makeCurrentFragmentActive();
	}
	
}

private void navigateWithPopBackStack(Object actionId, Object scopeObjects) {
	if (isValidFragment()) {
		checkIfDialog(actionId);
		com.ashera.core.UINavigatorImpl navigator = getNavigator();
		navigator.navigate((String) actionId, null, true, false, (List<Map<String, Object>>)scopeObjects, getFragment());
		makeCurrentFragmentActive();
	}
	
}



	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			frameLayout.setId((int) quickConvert(id, "id"));
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

	
private fragmentCommandBuilder builder;
private fragmentBean bean;
public Object getPlugin(String plugin) {
	return WidgetFactory.getAttributable(plugin).newInstance(this);
}
public fragmentBean getBean() {
	if (bean == null) {
		bean = new fragmentBean();
	}
	return bean;
}
public fragmentCommandBuilder getBuilder() {
	if (builder == null) {
		builder = new fragmentCommandBuilder();
	}
	return builder;
}


public  class fragmentCommandBuilder extends com.ashera.layout.ViewGroupImpl.ViewGroupCommandBuilder <fragmentCommandBuilder> {
    public fragmentCommandBuilder() {
	}
	
	public fragmentCommandBuilder execute(boolean setter) {
		if (setter) {
			executeCommand(command, null, IWidget.COMMAND_EXEC_SETTER_METHOD);
			getFragment().remeasure();
		}
		executeCommand(command, null, IWidget.COMMAND_EXEC_GETTER_METHOD);
return this;	}

public fragmentCommandBuilder setName(String value) {
	Map<String, Object> attrs = initCommand("name");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public fragmentCommandBuilder setLayout(String value) {
	Map<String, Object> attrs = initCommand("layout");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public fragmentCommandBuilder setNavGraph(String value) {
	Map<String, Object> attrs = initCommand("navGraph");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public fragmentCommandBuilder setTag(String value) {
	Map<String, Object> attrs = initCommand("tag");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public fragmentCommandBuilder replace(String value) {
	Map<String, Object> attrs = initCommand("replace");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public fragmentCommandBuilder navigate(String actionId,
Object scopeObjects) {
	Map<String, Object> attrs = initCommand("navigate");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	Map<String, Object> wrapper = new HashMap<>();
	wrapper.put("actionId", actionId);
	wrapper.put("scopeObjects", scopeObjects);
	attrs.put("value", wrapper);
return this;}
public fragmentCommandBuilder popBackStack() {
	Map<String, Object> attrs = initCommand("popBackStack");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	
return this;}
public fragmentCommandBuilder navigateWithPopBackStack(String actionId,
Object scopeObjects) {
	Map<String, Object> attrs = initCommand("navigateWithPopBackStack");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	Map<String, Object> wrapper = new HashMap<>();
	wrapper.put("actionId", actionId);
	wrapper.put("scopeObjects", scopeObjects);
	attrs.put("value", wrapper);
return this;}
public fragmentCommandBuilder navigateAsTop(String actionId,
Object scopeObjects) {
	Map<String, Object> attrs = initCommand("navigateAsTop");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	Map<String, Object> wrapper = new HashMap<>();
	wrapper.put("actionId", actionId);
	wrapper.put("scopeObjects", scopeObjects);
	attrs.put("value", wrapper);
return this;}
public fragmentCommandBuilder navigateWithPopBackStackTo(String actionId,
String destinationId,
boolean inclusive,
Object scopeObjects) {
	Map<String, Object> attrs = initCommand("navigateWithPopBackStackTo");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	Map<String, Object> wrapper = new HashMap<>();
	wrapper.put("actionId", actionId);
	wrapper.put("destinationId", destinationId);
	wrapper.put("inclusive", inclusive);
	wrapper.put("scopeObjects", scopeObjects);
	attrs.put("value", wrapper);
return this;}
public fragmentCommandBuilder popBackStackTo(String destinationId,
boolean inclusive) {
	Map<String, Object> attrs = initCommand("popBackStackTo");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	Map<String, Object> wrapper = new HashMap<>();
	wrapper.put("destinationId", destinationId);
	wrapper.put("inclusive", inclusive);
	attrs.put("value", wrapper);
return this;}
}
public class fragmentBean extends com.ashera.layout.ViewGroupImpl.ViewGroupBean{
		public fragmentBean() {
			super(fragmentImpl.this);
		}
public void setName(String value) {
	getBuilder().reset().setName(value).execute(true);
}

public void setLayout(String value) {
	getBuilder().reset().setLayout(value).execute(true);
}

public void setNavGraph(String value) {
	getBuilder().reset().setNavGraph(value).execute(true);
}

public void setTag(String value) {
	getBuilder().reset().setTag(value).execute(true);
}

public void replace(String value) {
	getBuilder().reset().replace(value).execute(true);
}

public void navigate(String actionId,
Object scopeObjects) {
	getBuilder().reset().navigate(actionId,
scopeObjects).execute(true);
}

public void popBackStack() {
	getBuilder().reset().popBackStack().execute(true);
}

public void navigateWithPopBackStack(String actionId,
Object scopeObjects) {
	getBuilder().reset().navigateWithPopBackStack(actionId,
scopeObjects).execute(true);
}

public void navigateAsTop(String actionId,
Object scopeObjects) {
	getBuilder().reset().navigateAsTop(actionId,
scopeObjects).execute(true);
}

public void navigateWithPopBackStackTo(String actionId,
String destinationId,
boolean inclusive,
Object scopeObjects) {
	getBuilder().reset().navigateWithPopBackStackTo(actionId,
destinationId,
inclusive,
scopeObjects).execute(true);
}

public void popBackStackTo(String destinationId,
boolean inclusive) {
	getBuilder().reset().popBackStackTo(destinationId,
inclusive).execute(true);
}

}


private fragmentCommandParamsBuilder paramsBuilder;
private fragmentParamsBean paramsBean;

public fragmentParamsBean getParamsBean() {
	if (paramsBean == null) {
		paramsBean = new fragmentParamsBean();
	}
	return paramsBean;
}
public fragmentCommandParamsBuilder getParamsBuilder() {
	if (paramsBuilder == null) {
		paramsBuilder = new fragmentCommandParamsBuilder();
	}
	return paramsBuilder;
}



public class fragmentParamsBean extends com.ashera.layout.ViewGroupImpl.ViewGroupParamsBean{
}





public class fragmentCommandParamsBuilder extends com.ashera.layout.ViewGroupImpl.ViewGroupCommandParamsBuilder<fragmentCommandParamsBuilder>{
}

	//end - body
	private void nativeCreate(Map<String, Object> params) {
	    pane = new org.eclipse.swt.widgets.Composite((org.eclipse.swt.widgets.Composite)ViewImpl.getParent(this), getStyle(params, fragment));
	    org.eclipse.swt.custom.StackLayout stackLayout = new org.eclipse.swt.custom.StackLayout();
		((org.eclipse.swt.widgets.Composite)pane).setLayout(stackLayout);
		com.ashera.core.FragmentManager fragmentManager = 
				new com.ashera.core.FragmentManager(stackLayout, ((org.eclipse.swt.widgets.Composite) pane), fragment.getRootActivity(), 
						new com.ashera.core.FragmentManager.FragmentFactory() {
					@Override
					public com.ashera.core.GenericFragment getFragment() {
						com.ashera.core.GenericFragment myfragment = new com.ashera.core.GenericFragment() {
							@Override
							public java.lang.Object getParentForRootWidget() {
								return fragmentImpl.this.asNativeWidget();
							}
							
							@Override
							public void createChildFragments() {
								executePendingTransactions();
							}
						};
						myfragment.setParentFragment(fragmentImpl.this.getFragment());
						return myfragment;
					}
					
					@Override
							public com.ashera.core.DialogFragment getDialogFragment(
									com.ashera.core.FragmentManager fragmentManager, java.lang.Object dialog, int width,
									int height, java.lang.Float marginPercent) {
								com.ashera.core.DialogFragment dialogFragment = super.getDialogFragment(fragmentManager, dialog, width, height, marginPercent);
								dialogFragment.setParentFragment(fragmentImpl.this.getFragment());
								return dialogFragment;
							}
				}, false);
		navigator = new com.ashera.core.UINavigatorImpl(fragmentManager);
	} 
	//start - fragment
	private com.ashera.core.UINavigatorImpl navigator;
	private void addOrReplaceFragment(boolean add) {
		androidx.fragment.app.FragmentManager manager = ((androidx.fragment.app.Fragment) getFragment()).getChildFragmentManager();
		androidx.fragment.app.FragmentTransaction transaction = manager.beginTransaction();
		if (add) {
			transaction.add(this, this.name, this.layout, this.navGraph, this.tag);
		} else {
			transaction.replace(this, this.name, this.layout, this.navGraph, this.tag);
		}
		transaction.commit();
	}

	private void executePendingTransactions() {
		if (isInitialised()) {
			((androidx.fragment.app.Fragment) fragment).executePendingTransactions();
		}
	}

	@Override
	public void addOrReplaceFragment(String name, boolean add, String layout, String navGraphId, String tag) {
		if (this.name != null) {
			switch (this.name) {
			case "com.ashera.core.GenericFragment":
				createOrReplaceFragment(getId(), add, layout);
				break;
				case "androidx.navigation.fragment.NavHostFragment":
					if (navGraphId != null) {
						navGraphId = navGraph.substring(1);
						Properties properties = com.ashera.utils.FileUtils.loadPropertiesFromClassPath(navGraphId + ".properties");
						String id = properties.getProperty("startDestination");
						id = id.replace("@id/", "@+id/");
						String mylayout = properties.getProperty(id);
						id = id.replace("@+id/", "").replace("@id/", "");
						createOrReplaceFragment(id, add, mylayout);
					}
					break;
			default:
				break;
			}

		}
	}

	private void createOrReplaceFragment(String id, boolean add, String layout) {
		if (layout != null) {
			String mylayout = layout;
			if (mylayout.startsWith("@layout")) {
				mylayout = mylayout.substring(1) + ".xml";
			}
			navigator.navigate("fragment#" + id + "#" + mylayout, null, false, !add, null, getFragment());
			makeCurrentFragmentActive();
		}
	}

	private void makeCurrentFragmentActive() {
		IWidget rootWidget = ((com.ashera.core.IFragment) navigator.getActiveFragment(fragment)).getRootWidget();
		if (rootWidget != null) {
			widgets.clear();
			frameLayout.removeAllViews();
			View view = (View) rootWidget.asWidget();
			createLayoutParams(view);
			frameLayout.addView(view);
			super.add(rootWidget, -1);
			rootWidget.setParent(this);
			remeasureIfRequired();
		}
	
	}

	private com.ashera.core.UINavigatorImpl getNavigator() {
		return navigator;
	}
	
	
	private boolean isValidFragment() {
		return "androidx.navigation.fragment.NavHostFragment".equals(this.name);
	}

	@Override
	public IWidget getActiveRootWidget() {
		return widgets.get(0);
	}
	
	private void closeDialog() {
		if (isValidFragment()) {
			navigator.closeDialog(fragment);
			makeCurrentFragmentActive();
		}
		
	}
	//end - fragment
	
	private void remeasureIfRequired() {
		
	}
}
