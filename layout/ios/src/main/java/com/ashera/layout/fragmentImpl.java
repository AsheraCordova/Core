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

/*-[
#include <UIKit/UIKit.h>
#include "ASUIView.h"
#include "HasLifeCycleDecorators.h"
]-*/
import com.google.j2objc.annotations.Property;
import androidx.core.view.*;

import static com.ashera.widget.IWidget.*;
//end - imports

public class fragmentImpl extends BaseHasWidgets implements com.ashera.core.IFragmentContainer{
	//start - body
	private @Property Object uiView;
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
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("closeDialog").withType("string").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("rootDirectory").withType("string").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("namespace").withType("string").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
	
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
		setWidgetOnNativeClass();
		
	}
	private native void setWidgetOnNativeClass() /*-[
		((ASUIView*) [self asNativeWidget]).widget = self;
	]-*/;

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
	
@com.google.j2objc.annotations.WeakOuter		
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
			nativeMakeFrameForChildWidget(l, t, r, b);
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
        	appScreenLocation[0] = ViewImpl.getLocationXOnScreen(asNativeWidget());
        	appScreenLocation[1] = ViewImpl.getLocationYOnScreen(asNativeWidget());
        }
        @Override
        public void getWindowVisibleDisplayFrame(r.android.graphics.Rect displayFrame){
        	
        	displayFrame.left = ViewImpl.getLocationXOnScreen(asNativeWidget());
        	displayFrame.top = ViewImpl.getLocationYOnScreen(asNativeWidget());
        	displayFrame.right = displayFrame.left + getWidth();
        	displayFrame.bottom = displayFrame.top + getHeight();
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
            ViewImpl.nativeSetVisibility(asNativeWidget(), visibility != View.VISIBLE);
            
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
				ViewGroupImpl.setAttribute(this,  key, strValue, objValue, decorator);
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
			case "closeDialog": {


		 closeDialog(objValue);



			}
			break;
			case "rootDirectory": {


		setRootDirectory(objValue);



			}
			break;
			case "namespace": {


		setNamespace(objValue);



			}
			break;
		default:
			break;
		}
		postSetAttribute(key, strValue, objValue, decorator);
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
        return uiView;
    }
    public native boolean checkIosVersion(String v) /*-[
		return ([[[UIDevice currentDevice] systemVersion] compare:v options:NSNumericSearch] == NSOrderedDescending);
	]-*/;
    
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
private String rootDirectory;
private String namespace;

private void setNamespace(Object namespace) {
	this.namespace = (String) namespace;
}
private void setRootDirectory(Object rootDirectory) {
	this.rootDirectory = (String) rootDirectory;
}
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
		com.ashera.core.UINavigatorImpl navigator = getNavigator();
		navigator.navigate((String) actionId, null, false, false, (List<Map<String, Object>>)scopeObjects, getFragment());
		makeCurrentFragmentActive();
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
		com.ashera.core.UINavigatorImpl navigator = getNavigator();
		navigator.navigate((String) actionId, (String) destinationId, (boolean)inclusive, false, (List<Map<String, Object>>)scopeObjects, getFragment());
		makeCurrentFragmentActive();
	}
	
	
}

private void navigateAsTop(Object actionId, Object scopeObjects) {
	if (isValidFragment()) {
		com.ashera.core.UINavigatorImpl navigator = getNavigator();
		navigator.navigate((String) actionId, null, false, true, (List<Map<String, Object>>)scopeObjects, getFragment());
		makeCurrentFragmentActive();
	}
	
}

private void navigateWithPopBackStack(Object actionId, Object scopeObjects) {
	if (isValidFragment()) {
		com.ashera.core.UINavigatorImpl navigator = getNavigator();
		navigator.navigate((String) actionId, null, true, false, (List<Map<String, Object>>)scopeObjects, getFragment());
		makeCurrentFragmentActive();
	}
	
}



	private com.ashera.core.UINavigatorImpl navigator;
	
	private void postSetAttribute(WidgetAttribute key, String strValue, Object objValue,
			ILifeCycleDecorator decorator) {
		switch (key.getAttributeName()) {
			case "namespace":
				navigator.setNamespace(this.namespace);
				break;
			case "rootDirectory":
				navigator.setRootDirectory(this.rootDirectory);
				break;
		}
	}
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
					if (rootDirectory == null && fragment.getRootDirectory() != null) {
						rootDirectory = fragment.getRootDirectory();
						namespace = fragment.getNamespace();
					}
					if (navGraphId != null) {
						navGraphId = navGraph.replace("@", "");
						Properties properties;
						if (rootDirectory != null) {
							properties = com.ashera.utils.FileUtils.loadProperties(PluginInvoker.readCdvDataAsString(rootDirectory, "resources/" + navGraphId + ".properties", fragment));
						} else {
							properties = com.ashera.utils.FileUtils.loadPropertiesFromClassPath(navGraphId + ".properties");
						}
						
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
				mylayout = mylayout.replace("@", "") + ".xml";
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
	
	private void closeDialog(Object tag) {
		closeDialog();
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

		//end - body
private Object navController;
private void nativeCreate(Map<String, Object> params) {
	navController = createView();
	navigator = new com.ashera.core.UINavigatorImpl(new MyFragmentFactory(), navController, false);
	PluginInvoker.postDelayed(() -> {
		addChildViewController(navController, getFragment().getRootWidget().asNativeWidget());
	}, 0);
}



	public native Object createView()/*-[
		ASUIView* uiView = [ASUIView new];
		uiView.backgroundColor = [UIColor clearColor];
		uiView_ = uiView;
		
	    UINavigationController *navController = [[UINavigationController alloc] initWithNavigationBarClass:nil toolbarClass:nil];
	    navController.modalPresentationStyle = UIModalPresentationOverCurrentContext;
		[navController setNavigationBarHidden:YES];
	
	    [uiView addSubview:navController.view];
	    return navController;

	]-*/;
	
	

	public native void addChildViewController(Object navController, Object rootView)/*-[
	    UIViewController* currentController = (UIViewController*) [[((ASUIView*) rootView) nextResponder] nextResponder];
	    [(UIViewController*)navController willMoveToParentViewController:currentController];
	    [currentController addChildViewController:navController];
	    [(UIViewController*)navController didMoveToParentViewController:currentController];

	]-*/;
	
	
	private void nativeMakeFrameForChildWidget(int l, int t, int r, int b) {
		ViewImpl.updateBounds(getView(navController), 0, 0, r - l, b - t);
	}

	private native Object getView(Object navController)/*-[
		return ((UINavigationController*)navController).view;
	]-*/;

	@com.google.j2objc.annotations.WeakOuter
	private final class MyFragmentFactory extends com.ashera.core.UINavigatorImpl.FragmentFactory {
		@Override
		public com.ashera.core.GenericFragment getFragment() {
			MyGenericFragment myGenericFragment = new MyGenericFragment();
			myGenericFragment.setParentFragment(fragmentImpl.this.getFragment(), false);
			return myGenericFragment;
		}
	}
	@com.google.j2objc.annotations.WeakOuter
	private final class MyGenericFragment extends com.ashera.core.GenericFragment {
		@Override
		public void createChildFragments() {
			makeCurrentFragmentActive();
			super.executePendingTransactions();
		}
	}
	
	private void remeasureIfRequired() {
		requestLayout();
		PluginInvoker.postDelayed(() -> {
			getFragment().remeasure();
		}, 0);
	}
}
