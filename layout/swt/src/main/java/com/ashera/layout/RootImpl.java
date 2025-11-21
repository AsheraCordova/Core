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

public class RootImpl extends BaseHasWidgets implements com.ashera.widget.IRoot {
	//start - body
	private Object pane;
	public final static String LOCAL_NAME = "layout"; 
	public final static String GROUP_NAME = "layout";
	private r.android.widget.RelativeLayout relativeLayout;
	

	
		@SuppressLint("NewApi")
		final static class RemoveRule  extends AbstractBitFlagConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("layout_above", -0x1);
				mapping.put("layout_alignBaseline", -0x2);
				mapping.put("layout_alignBottom", -0x4);
				mapping.put("layout_alignEnd", -0x8);
				mapping.put("layout_alignLeft", -0x16);
				mapping.put("layout_alignParentBottom", -0x32);
				mapping.put("layout_alignParentEnd", -0x64);
				mapping.put("layout_alignParentLeft", -0x128);
				mapping.put("layout_alignParentRight", -0x256);
				mapping.put("layout_alignParentStart", -0x1024);
				mapping.put("layout_alignParentTop", 0x0);
				mapping.put("layout_alignRight", 0x1);
				mapping.put("layout_alignStart", 0x2);
				mapping.put("layout_alignTop", 0x4);
				mapping.put("layout_below", 0x8);
				mapping.put("layout_centerHorizontal", 0x16);
				mapping.put("layout_centerInParent", 0x32);
				mapping.put("layout_centerVertical", 0x64);
				mapping.put("layout_toEndOf", 0x128);
				mapping.put("layout_toLeftOf", 0x256);
				mapping.put("layout_toRightOf", 0x1024);
				mapping.put("layout_toStartOf", 0x2048);
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

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("gravity").withType("gravity"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("ignoreGravity").withType("id"));
	
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_above").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignBaseline").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignBottom").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignEnd").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignLeft").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignParentBottom").withType("boolean").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignParentEnd").withType("boolean").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignParentLeft").withType("boolean").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignParentRight").withType("boolean").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignParentStart").withType("boolean").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignParentTop").withType("boolean").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignRight").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignStart").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignTop").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_below").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_centerHorizontal").withType("boolean").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_centerInParent").withType("boolean").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_centerVertical").withType("boolean").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_toEndOf").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_toLeftOf").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_toRightOf").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_toStartOf").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignWithParentIfMissing").withType("boolean").forChild());
				ConverterFactory.register("layout.removeRule", new RemoveRule());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_removeRule").withType("layout.removeRule").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_removeAllRules").withType("boolean").forChild());
	}
	
	public RootImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  RootImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  RootImpl(String groupName, String localname) {
		super(groupName, localname);
	}

	@Override
	public IWidget newInstance() {
		return new RootImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
		relativeLayout = new RootExt();
		
		nativeCreate(params);
		
		if (ViewImpl.isRTLLayout(this)) {
			ViewImpl.setLayoutDirection(this, View.LAYOUT_DIRECTION_RTL);
		} else {
			ViewImpl.setLayoutDirection(this, View.LAYOUT_DIRECTION_LTR);
		}
		
		ViewGroupImpl.registerCommandConveter(this);

	}

	@Override
	public Object asWidget() {
		return relativeLayout;
	}

	@Override
	public boolean remove(IWidget w) {
		boolean remove = super.remove(w);
		relativeLayout.removeView((View) w.asWidget());
		 nativeRemoveView(w);            
		return remove;
	}
	
	@Override
    public boolean remove(int index) {
		IWidget widget = widgets.get(index);
        boolean remove = super.remove(index);

        if (index + 1 <= relativeLayout.getChildCount()) {
            relativeLayout.removeViewAt(index);
            nativeRemoveView(widget);
        }    
        return remove;
    }

	private void nativeRemoveView(IWidget widget) {
		r.android.animation.LayoutTransition layoutTransition = relativeLayout.getLayoutTransition();
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
			        relativeLayout.addView(view);
			    } else {
			        relativeLayout.addView(view, index);
			    }
		}
		
		ViewGroupImpl.nativeAddView(asNativeWidget(), w.asNativeWidget());
		super.add(w, index);
	}
	
	private void createLayoutParams(View view) {
		r.android.widget.RelativeLayout.LayoutParams layoutParams = (r.android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
		
		layoutParams = (r.android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
		if (layoutParams == null) {
			layoutParams = new r.android.widget.RelativeLayout.LayoutParams(-2, -2);
			view.setLayoutParams(layoutParams);
		}  else {
			layoutParams.height = -2;
			layoutParams.width = -2;
		}
	}
	
	private r.android.widget.RelativeLayout.LayoutParams getLayoutParams(View view) {
		return (r.android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();		
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setChildAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue) {
		View view = (View) w.asWidget();
		r.android.widget.RelativeLayout.LayoutParams layoutParams = getLayoutParams(view);
		ViewGroupImpl.setChildAttribute(w, key, objValue, layoutParams);		
		
		switch (key.getAttributeName()) {
		case "layout_width":
			layoutParams.width = (int) objValue;
			break;	
		case "layout_height":
			layoutParams.height = (int) objValue;
			break;
			case "layout_above": {
				
							addRule(layoutParams, r.android.widget.RelativeLayout.ABOVE, objValue);
				
			}
			break;
			case "layout_alignBaseline": {
				
							addRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_BASELINE, objValue);
				
			}
			break;
			case "layout_alignBottom": {
				
							addRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_BOTTOM, objValue);
				
			}
			break;
			case "layout_alignEnd": {
				
							addRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_END, objValue);
				
			}
			break;
			case "layout_alignLeft": {
				
							addRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_LEFT, objValue);
				
			}
			break;
			case "layout_alignParentBottom": {
				
							addRemoveRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_PARENT_BOTTOM, objValue);
				
			}
			break;
			case "layout_alignParentEnd": {
				
							addRemoveRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_PARENT_END, objValue);
				
			}
			break;
			case "layout_alignParentLeft": {
				
							addRemoveRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_PARENT_LEFT, objValue);
				
			}
			break;
			case "layout_alignParentRight": {
				
							addRemoveRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_PARENT_RIGHT, objValue);
				
			}
			break;
			case "layout_alignParentStart": {
				
							addRemoveRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_PARENT_START, objValue);
				
			}
			break;
			case "layout_alignParentTop": {
				
							addRemoveRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_PARENT_TOP, objValue);
				
			}
			break;
			case "layout_alignRight": {
				
							addRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_RIGHT, objValue);
				
			}
			break;
			case "layout_alignStart": {
				
							addRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_START, objValue);
				
			}
			break;
			case "layout_alignTop": {
				
							addRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_TOP, objValue);
				
			}
			break;
			case "layout_below": {
				
							addRule(layoutParams, r.android.widget.RelativeLayout.BELOW, objValue);
				
			}
			break;
			case "layout_centerHorizontal": {
				
							addRemoveRule(layoutParams, r.android.widget.RelativeLayout.CENTER_HORIZONTAL, objValue);
				
			}
			break;
			case "layout_centerInParent": {
				
							addRemoveRule(layoutParams, r.android.widget.RelativeLayout.CENTER_IN_PARENT, objValue);
				
			}
			break;
			case "layout_centerVertical": {
				
							addRemoveRule(layoutParams, r.android.widget.RelativeLayout.CENTER_VERTICAL, objValue);
				
			}
			break;
			case "layout_toEndOf": {
				
							addRule(layoutParams, r.android.widget.RelativeLayout.END_OF, objValue);
				
			}
			break;
			case "layout_toLeftOf": {
				
							addRule(layoutParams, r.android.widget.RelativeLayout.LEFT_OF, objValue);
				
			}
			break;
			case "layout_toRightOf": {
				
							addRule(layoutParams, r.android.widget.RelativeLayout.RIGHT_OF, objValue);
				
			}
			break;
			case "layout_toStartOf": {
				
							addRule(layoutParams, r.android.widget.RelativeLayout.START_OF, objValue);
				
			}
			break;
			case "layout_alignWithParentIfMissing": {
				
							layoutParams.alignWithParent = ((boolean)objValue);
				
			}
			break;
			case "layout_removeRule": {
				
							 removeRule(layoutParams, objValue);
				
			}
			break;
			case "layout_removeAllRules": {
				
							 removeAllRules(layoutParams);
				
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
		r.android.widget.RelativeLayout.LayoutParams layoutParams = getLayoutParams(view);

		switch (key.getAttributeName()) {
		case "layout_width":
			return layoutParams.width;
		case "layout_height":
			return layoutParams.height;
			case "layout_above": {
return getRule(layoutParams, r.android.widget.RelativeLayout.ABOVE);			}

			case "layout_alignBaseline": {
return getRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_BASELINE);			}

			case "layout_alignBottom": {
return getRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_BOTTOM);			}

			case "layout_alignEnd": {
return getRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_END);			}

			case "layout_alignLeft": {
return getRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_LEFT);			}

			case "layout_alignParentBottom": {
return getBoolRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_PARENT_BOTTOM);			}

			case "layout_alignParentEnd": {
return getBoolRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_PARENT_END);			}

			case "layout_alignParentLeft": {
return getBoolRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_PARENT_LEFT);			}

			case "layout_alignParentRight": {
return getBoolRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_PARENT_RIGHT);			}

			case "layout_alignParentStart": {
return getBoolRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_PARENT_START);			}

			case "layout_alignParentTop": {
return getBoolRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_PARENT_TOP);			}

			case "layout_alignRight": {
return getRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_RIGHT);			}

			case "layout_alignStart": {
return getRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_START);			}

			case "layout_alignTop": {
return getRule(layoutParams, r.android.widget.RelativeLayout.ALIGN_TOP);			}

			case "layout_below": {
return getRule(layoutParams, r.android.widget.RelativeLayout.BELOW);			}

			case "layout_centerHorizontal": {
return getBoolRule(layoutParams, r.android.widget.RelativeLayout.CENTER_HORIZONTAL);			}

			case "layout_centerInParent": {
return getBoolRule(layoutParams, r.android.widget.RelativeLayout.CENTER_IN_PARENT);			}

			case "layout_centerVertical": {
return getBoolRule(layoutParams, r.android.widget.RelativeLayout.CENTER_VERTICAL);			}

			case "layout_toEndOf": {
return getRule(layoutParams, r.android.widget.RelativeLayout.END_OF);			}

			case "layout_toLeftOf": {
return getRule(layoutParams, r.android.widget.RelativeLayout.LEFT_OF);			}

			case "layout_toRightOf": {
return getRule(layoutParams, r.android.widget.RelativeLayout.RIGHT_OF);			}

			case "layout_toStartOf": {
return getRule(layoutParams, r.android.widget.RelativeLayout.START_OF);			}

			case "layout_alignWithParentIfMissing": {
return layoutParams.alignWithParent;			}



		}
		
		return null;

	}
	
		
	public class RootExt extends r.android.widget.RelativeLayout implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		private List<IWidget> overlays;
		public IWidget getWidget() {
			return RootImpl.this;
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

		public RootExt() {
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
			ViewImpl.setDrawableBounds(RootImpl.this, l, t, r, b);
			if (!isOverlay()) {
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			}
			replayBufferedEvents();
	        ViewImpl.redrawDrawables(RootImpl.this);
	        overlays = ViewImpl.drawOverlay(RootImpl.this, overlays);
			
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
				RootImpl.this.invalidate();
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
        		ViewImpl.drawableStateChanged(RootImpl.this);
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
    		
    		IWidget widget = template.loadLazyWidgets(RootImpl.this);
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
        	RootImpl.this.getParent().remove(RootImpl.this);
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
			RootImpl.this.setAttribute(name, value, !(value instanceof String));
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
    		ViewImpl.setState(RootImpl.this, 0, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(RootImpl.this, 1, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(RootImpl.this, 2, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(RootImpl.this, 3, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(RootImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(RootImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(RootImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(RootImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(RootImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(RootImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(RootImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(RootImpl.this);
        }
     
		@Override
		public void endViewTransition(r.android.view.View view) {
			super.endViewTransition(view);
			runBufferedRunnables();
		}
	
	}
	@Override
	public Class getViewClass() {
		return RootExt.class;
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
				ViewGroupImpl.setAttribute(this,  key, strValue, objValue, decorator);
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "gravity": {


	relativeLayout.setGravity((int)objValue);



			}
			break;
			case "ignoreGravity": {


	relativeLayout.setIgnoreGravity((int)objValue);



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
			case "gravity": {
return relativeLayout.getGravity();			}
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
    
	

	private void addRule(r.android.widget.RelativeLayout.LayoutParams layoutParams, int rule, Object objValue) {
		layoutParams.addRule(rule, (int) objValue);
	}


	private void addRemoveRule(r.android.widget.RelativeLayout.LayoutParams layoutParams, int rule, Object objValue) {
		if ((boolean) objValue) {
			layoutParams.addRule(rule);
		} else {
			removeRule(layoutParams, rule);
			rule = getInferredRule(rule);
			removeRule(layoutParams, rule);
		}
	}

	@SuppressLint("NewApi")
	private void removeRule(r.android.widget.RelativeLayout.LayoutParams layoutParams, int rule) {
		if (Build.VERSION.SDK_INT >= 17) {
			layoutParams.removeRule(rule);
		} else {
			layoutParams.addRule(rule, 0);	
		}
	}
	
	@SuppressLint("NewApi")
	private Object getRule(r.android.widget.RelativeLayout.LayoutParams layoutParams, int rule) {
		if (Build.VERSION.SDK_INT >= 23) {
			rule = getInferredRule(rule);
			return layoutParams.getRule(rule);
		} 
		return null;
	}
	
	@SuppressLint("NewApi")
	private Object getBoolRule(r.android.widget.RelativeLayout.LayoutParams layoutParams, int rule) {
		if (Build.VERSION.SDK_INT >= 23) {
			rule = getInferredRule(rule);
			return layoutParams.getRule(rule) != 0;
		} 
		return null;
	}

	private int getInferredRule(int rule) {
		if (rule == r.android.widget.RelativeLayout.ALIGN_PARENT_END) {
			rule = ViewImpl.isRTLLayoutDirection(this) ? r.android.widget.RelativeLayout.ALIGN_PARENT_LEFT :  r.android.widget.RelativeLayout.ALIGN_PARENT_RIGHT;
		}
		if (rule == r.android.widget.RelativeLayout.ALIGN_PARENT_START) {
			rule = ViewImpl.isRTLLayoutDirection(this) ? r.android.widget.RelativeLayout.ALIGN_PARENT_RIGHT :  r.android.widget.RelativeLayout.ALIGN_PARENT_LEFT;
		}
		if (rule == r.android.widget.RelativeLayout.END_OF) {
			rule = ViewImpl.isRTLLayoutDirection(this) ? r.android.widget.RelativeLayout.LEFT_OF :  r.android.widget.RelativeLayout.RIGHT_OF;
		}
		if (rule == r.android.widget.RelativeLayout.START_OF) {
			rule = ViewImpl.isRTLLayoutDirection(this) ? r.android.widget.RelativeLayout.RIGHT_OF :  r.android.widget.RelativeLayout.LEFT_OF;
		}
		if (rule == r.android.widget.RelativeLayout.ALIGN_END) {
			rule = ViewImpl.isRTLLayoutDirection(this) ? r.android.widget.RelativeLayout.ALIGN_LEFT :  r.android.widget.RelativeLayout.ALIGN_RIGHT;
		}
		if (rule == r.android.widget.RelativeLayout.ALIGN_START) {
			rule = ViewImpl.isRTLLayoutDirection(this) ? r.android.widget.RelativeLayout.ALIGN_RIGHT :  r.android.widget.RelativeLayout.ALIGN_LEFT;
		}
		return rule;
	}
	private HashMap<String, Integer> ruleMapper = new HashMap<>();
	{
		ruleMapper.put("layout_above", r.android.widget.RelativeLayout.ABOVE);
		ruleMapper.put("layout_alignBaseline", r.android.widget.RelativeLayout.ALIGN_BASELINE);
		ruleMapper.put("layout_alignBottom", r.android.widget.RelativeLayout.ALIGN_BOTTOM);
		ruleMapper.put("layout_alignEnd", r.android.widget.RelativeLayout.ALIGN_END);
		ruleMapper.put("layout_alignLeft", r.android.widget.RelativeLayout.ALIGN_LEFT);
		ruleMapper.put("layout_alignParentBottom", r.android.widget.RelativeLayout.ALIGN_PARENT_BOTTOM);
		ruleMapper.put("layout_alignParentEnd", r.android.widget.RelativeLayout.ALIGN_PARENT_END);
		ruleMapper.put("layout_alignParentLeft", r.android.widget.RelativeLayout.ALIGN_PARENT_LEFT);
		ruleMapper.put("layout_alignParentRight", r.android.widget.RelativeLayout.ALIGN_PARENT_RIGHT);
		ruleMapper.put("layout_alignParentStart", r.android.widget.RelativeLayout.ALIGN_PARENT_START);
		ruleMapper.put("layout_alignParentTop", r.android.widget.RelativeLayout.ALIGN_PARENT_TOP);
		ruleMapper.put("layout_alignRight", r.android.widget.RelativeLayout.ALIGN_RIGHT);
		ruleMapper.put("layout_alignStart", r.android.widget.RelativeLayout.ALIGN_START);
		ruleMapper.put("layout_alignTop", r.android.widget.RelativeLayout.ALIGN_TOP);
		ruleMapper.put("layout_below", r.android.widget.RelativeLayout.BELOW);
		ruleMapper.put("layout_centerHorizontal", r.android.widget.RelativeLayout.CENTER_HORIZONTAL);
		ruleMapper.put("layout_centerVertical", r.android.widget.RelativeLayout.CENTER_VERTICAL);
		ruleMapper.put("layout_centerInParent", r.android.widget.RelativeLayout.CENTER_IN_PARENT);
		ruleMapper.put("layout_toEndOf", r.android.widget.RelativeLayout.END_OF);
		ruleMapper.put("layout_toLeftOf", r.android.widget.RelativeLayout.LEFT_OF);
		ruleMapper.put("layout_toRightOf", r.android.widget.RelativeLayout.RIGHT_OF);
		ruleMapper.put("layout_toStartOf", r.android.widget.RelativeLayout.START_OF);
	}
	private void removeAllRules(r.android.widget.RelativeLayout.LayoutParams layoutParams) {
		RemoveRule removeRule = (RemoveRule) ConverterFactory.get("RelativeLayout.removeRule");
		Collection<String> keys = removeRule.mapping.keySet();
		for (String key : keys) {
			int rule = ruleMapper.get(key);
			removeRule(layoutParams, rule);
			rule = getInferredRule(rule);
			removeRule(layoutParams, rule);
		}
		
	}

	private <A, B> Map<B, A> invertMap(Map<A, B> map) {
	    Map<B, A> reverseMap = new HashMap<>();
	    for (Map.Entry<A, B> entry : map.entrySet()) {
	        reverseMap.put(entry.getValue(), entry.getKey());
	    }
	    return reverseMap;
	}
	private void removeRule(r.android.widget.RelativeLayout.LayoutParams layoutParams, Object objValue) {
		RemoveRule removeRule = (RemoveRule) ConverterFactory.get("RelativeLayout.removeRule");
		int rule = (int) objValue;
		
		Map<Integer, String> reverseMap = invertMap(removeRule.mapping);
		Collection<Integer> flags = removeRule.getReverseMappingFlags();
		for (int flag : flags) {
			if ((rule & flag) != 0) {
				int finalRule  = ruleMapper.get(reverseMap.get(flag));
				removeRule(layoutParams, finalRule);
				finalRule = getInferredRule(finalRule);
				removeRule(layoutParams, finalRule);
			}
		}
		
	}
	


	@Override
	public void displayErrorIndicator() {
		IWidget widget = findWidgetById("@+id/errorBanner");
		if (widget != null) {
			widget.setVisible(true);
		} else {
			IWidget button = WidgetFactory.createWidget("TextView", "TextView", this, false);
			button.setId("@+id/errorBanner");
			button.setAttribute("style", "@style/error_banner", false);
			button.setAttribute("onClick", "onError(data = . from fatalErrors->view)", false);
		}}
	


	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			relativeLayout.setId((int) quickConvert(id, "id"));
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

		//end - body
	//start - measure
	@Override
	public void measure() {
		int width = PluginInvoker.getScreenWidth();
		int height = PluginInvoker.getScreenHeight();
		measure(0, 0, width, height);
	}

	@Override
	public void measure(int x, int y, int width, int height) {
		int wmeasureSpec = MeasureSpec.EXACTLY;
		int hmeasureSpec = MeasureSpec.EXACTLY;
		if (height == -2) {
			hmeasureSpec = MeasureSpec.UNSPECIFIED;
		}
		if (width == -2) {
			wmeasureSpec = MeasureSpec.UNSPECIFIED;
		}
		relativeLayout.measure(View.MeasureSpec.makeMeasureSpec(width, wmeasureSpec ),
			View.MeasureSpec.makeMeasureSpec(height, hmeasureSpec  ));
		
		if (height == -2) {
			height = relativeLayout.getMeasuredHeight();
		}
		if (width == -2) {
			width = relativeLayout.getMeasuredWidth();
		}
		relativeLayout.layout(x, y, x + width, y + height);
	}
	//end - measure
    
    private void nativeCreate(Map<String, Object> params) {
		org.eclipse.swt.widgets.Composite parent = (org.eclipse.swt.widgets.Composite) fragment.getParentForRootWidget();
		pane = new org.eclipse.swt.widgets.Composite(parent, getStyle(params, fragment));
		relativeLayout.initAttachInfo();
        ((org.eclipse.swt.widgets.Composite)pane).setLayout(new com.ashera.common.AbsoluteLayout());
        fragment.setRootWidget(this);
    }
    
    @Override
    public void initialized() {
    	IWidget widget = findWidgetById("@+id/errorBanner");
		if (widget != null) {
			((org.eclipse.swt.widgets.Control) widget.asNativeWidget()).moveAbove(null);
		}
    }
}
