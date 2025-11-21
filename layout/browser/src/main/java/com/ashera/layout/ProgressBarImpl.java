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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import r.android.content.Context;


import org.teavm.jso.dom.html.HTMLElement;

import r.android.os.Build;
import r.android.view.View;
import r.android.text.*;

import com.ashera.core.IFragment;
import com.ashera.converter.*;

import r.android.annotation.SuppressLint;

import com.ashera.layout.*;
import com.ashera.plugin.*;
import com.ashera.widget.bus.*;
import com.ashera.widget.*;
import com.ashera.widget.bus.Event.*;
import com.ashera.widget.IWidgetLifeCycleListener.EventId;
import com.ashera.widget.IWidgetLifeCycleListener.EventId.*;


import static com.ashera.widget.IWidget.*;
//end - imports
@SuppressLint("NewApi")
public class ProgressBarImpl extends BaseWidget {
	//start - body
	public final static String LOCAL_NAME = "ProgressBar"; 
	public final static String GROUP_NAME = "ProgressBar";

	protected org.teavm.jso.dom.html.HTMLElement hTMLElement;
	protected r.android.widget.ProgressBar measurableView;	
	
	
	@Override
	public void loadAttributes(String attributeName) {
		ViewImpl.register(attributeName);


		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("padding").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingTop").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingBottom").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingLeft").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingRight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingStart").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingEnd").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingHorizontal").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingVertical").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("min").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("max").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("progress").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("incrementProgressBy").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("progressTint").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("progressBackgroundTint").withType("colorstate"));
	WidgetFactory.registerConstructorAttribute(localName, new WidgetAttribute.Builder().withName("indeterminate").withType("boolean"));
	}
	
	public ProgressBarImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  ProgressBarImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  ProgressBarImpl(String groupName, String localname) {
		super(groupName, localname);
	}

		
	public class ProgressBarExt extends r.android.widget.ProgressBar implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		private List<IWidget> overlays;
		public IWidget getWidget() {
			return ProgressBarImpl.this;
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

		public ProgressBarExt() {
			super(ProgressBarImpl.this);
			
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
			ViewImpl.setDrawableBounds(ProgressBarImpl.this, l, t, r, b);
			if (!isOverlay()) {
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			}
			replayBufferedEvents();
	        ViewImpl.redrawDrawables(ProgressBarImpl.this);
	        overlays = ViewImpl.drawOverlay(ProgressBarImpl.this, overlays);
			
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
				ProgressBarImpl.this.invalidate();
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
        		ViewImpl.drawableStateChanged(ProgressBarImpl.this);
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
    		
    		IWidget widget = template.loadLazyWidgets(ProgressBarImpl.this.getParent());
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
        	ProgressBarImpl.this.getParent().remove(ProgressBarImpl.this);
		}
        @Override
        public void getLocationOnScreen(int[] appScreenLocation) {
        	appScreenLocation[0] = hTMLElement.getBoundingClientRect().getLeft();
        	appScreenLocation[1] = hTMLElement.getBoundingClientRect().getTop();
        }
        @Override
        public void getWindowVisibleDisplayFrame(r.android.graphics.Rect displayFrame){
        	
        	org.teavm.jso.dom.html.TextRectangle boundingClientRect = hTMLElement.getBoundingClientRect();
			displayFrame.top = boundingClientRect.getTop();
        	displayFrame.left = boundingClientRect.getLeft();
        	displayFrame.bottom = boundingClientRect.getBottom();
        	displayFrame.right = boundingClientRect.getRight();
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
			ProgressBarImpl.this.setAttribute(name, value, !(value instanceof String));
		}
        @Override
        public void setVisibility(int visibility) {
            super.setVisibility(visibility);
            ((HTMLElement)asNativeWidget()).getStyle().setProperty("display", visibility != View.VISIBLE ? "none" : "block");
            
        }
        @Override
        public int nativeMeasureWidth(java.lang.Object uiView) {
        	return ProgressBarImpl.this.nativeMeasureWidth(uiView);
        }
        
        @Override
        public int nativeMeasureHeight(java.lang.Object uiView, int width) {
        	return ProgressBarImpl.this.nativeMeasureHeight(uiView, width);
        }
        
    	public void setState0(Object value) {
    		ViewImpl.setState(ProgressBarImpl.this, 0, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(ProgressBarImpl.this, 1, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(ProgressBarImpl.this, 2, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(ProgressBarImpl.this, 3, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(ProgressBarImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(ProgressBarImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(ProgressBarImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(ProgressBarImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(ProgressBarImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(ProgressBarImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(ProgressBarImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(ProgressBarImpl.this);
        }
     
	
	}	@Override
	public Class getViewClass() {
		return ProgressBarExt.class;
	}

	@Override
	public IWidget newInstance() {
		return new ProgressBarImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
		measurableView = new ProgressBarExt();
		nativeCreate(params);	
		ViewImpl.registerCommandConveter(this);
	}

	@Override
	@SuppressLint("NewApi")
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		Object nativeWidget = asNativeWidget();
		ViewImpl.setAttribute(this,  key, strValue, objValue, decorator);
		
		switch (key.getAttributeName()) {
			case "padding": {
				


		setPadding(objValue);



			}
			break;
			case "paddingTop": {
				


		setPaddingTop(objValue);



			}
			break;
			case "paddingBottom": {
				


		setPaddingBottom(objValue);



			}
			break;
			case "paddingLeft": {
				


		setPaddingLeft(objValue);



			}
			break;
			case "paddingRight": {
				


		setPaddingRight(objValue);



			}
			break;
			case "paddingStart": {
				


		setPaddingLeft(objValue);



			}
			break;
			case "paddingEnd": {
				


		setPaddingRight(objValue);



			}
			break;
			case "paddingHorizontal": {
				


		setPaddingHorizontal(objValue);



			}
			break;
			case "paddingVertical": {
				


		setPaddingVertical(objValue);



			}
			break;
			case "min": {
				


		setMin(objValue);



			}
			break;
			case "max": {
				


		setMax(objValue);



			}
			break;
			case "progress": {
				


		setProgress(objValue);



			}
			break;
			case "incrementProgressBy": {
				


		incrementProgressBy(objValue);



			}
			break;
			case "progressTint": {
				


		setProgressTint(objValue);



			}
			break;
			case "progressBackgroundTint": {
				


		setProgressBackgroundTint(objValue);



			}
			break;
		default:
			break;
		}
		
	}
	
	@Override
	@SuppressLint("NewApi")
	public Object getAttribute(WidgetAttribute key, ILifeCycleDecorator decorator) {
		Object nativeWidget = asNativeWidget();
		Object attributeValue = ViewImpl.getAttribute(this, nativeWidget, key, decorator);
		if (attributeValue != null) {
			return attributeValue;
		}
		switch (key.getAttributeName()) {
			case "paddingTop": {
return getPaddingTop();				}
			case "paddingBottom": {
return getPaddingBottom();				}
			case "paddingLeft": {
return getPaddingLeft();				}
			case "paddingRight": {
return getPaddingRight();				}
			case "paddingStart": {
return getPaddingLeft();				}
			case "paddingEnd": {
return getPaddingRight();				}
			case "progressTint": {
return getProgressTint();				}
			case "progressBackgroundTint": {
return getProgressBackgroundTint();				}
		}
		
		return null;
	}
	
	@Override
	public Object asWidget() {
		return measurableView;
	}

	

    @org.teavm.jso.JSBody(params = { "element" }, script = "return window.nativeMeasureWidth(element, true);")
    private static native int windowNativeMeasureWidth(org.teavm.jso.dom.html.HTMLElement element);
    
    @org.teavm.jso.JSBody(params = { "element", "width" }, script = "return window.nativeMeasureHeight(element, width, true);")
    private static native int windowNativeMeasureHeight(org.teavm.jso.dom.html.HTMLElement element, int width);
    
	public int nativeMeasureHeight(Object uiView, int width) {
		return windowNativeMeasureHeight(hTMLElement, width);
	}

	public int nativeMeasureWidth(Object uiView) {
		return windowNativeMeasureWidth(hTMLElement);
	}
	
	


    private void setPadding(Object objValue) {
    	setPaddingBottom(objValue);
    	setPaddingTop(objValue);
    	setPaddingLeft(objValue);
    	setPaddingRight(objValue);
	}
	
	private void setPaddingLeft(Object objValue) {
		int value = (int) objValue;
		hTMLElement.getStyle().setProperty("padding-left", value  + "px");
		ViewImpl.setPaddingLeft(objValue, measurableView);
	}
	
	private void setPaddingRight(Object objValue) {
		int value = (int) objValue;
		hTMLElement.getStyle().setProperty("padding-right", value + "px");
		ViewImpl.setPaddingRight(objValue, measurableView);
	}

	private void setPaddingTop(Object objValue) {
		int value = (int) objValue;
		hTMLElement.getStyle().setProperty("padding-top", value + "px");
		ViewImpl.setPaddingTop(objValue, measurableView);
	}

	private void setPaddingBottom(Object objValue) {
		int value = (int) objValue;
		hTMLElement.getStyle().setProperty("padding-bottom", value + "px");
		ViewImpl.setPaddingBottom(objValue, measurableView);
	}

	private Object getPaddingTop() {
		return measurableView.getPaddingTop();
	}

	private Object getPaddingBottom() {
		return measurableView.getPaddingBottom();
	}

	private Object getPaddingLeft() {
		return measurableView.getPaddingStart();
	}

	private Object getPaddingRight() {
		return measurableView.getPaddingEnd();
	}

	private void setPaddingHorizontal(Object objValue) {
		setPaddingLeft(objValue);
		setPaddingRight(objValue);
	}

	private void setPaddingVertical(Object objValue) {
		setPaddingTop(objValue);
		setPaddingBottom(objValue);
	}
	

	
	    @Override
	    public Object asNativeWidget() {
	        return hTMLElement;
	    }
	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			measurableView.setId((int) quickConvert(id, "id"));
		}
	}
	
    @Override
    public void setVisible(boolean b) {
        ((View)asWidget()).setVisibility(b ? View.VISIBLE : View.GONE);
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

	
		//end - body
	private HTMLElement progressBar;
	private int min;
	private boolean indeterminate;
	private void nativeCreate(Map<String, Object> params) {
		Object indeterminateParam = params.get("indeterminate");
		this.indeterminate = indeterminateParam == null || "true".equals(indeterminateParam);
		hTMLElement = org.teavm.jso.dom.html.HTMLDocument.current().createElement("div");
		if (indeterminate) {
			this.progressBar = org.teavm.jso.dom.html.HTMLDocument.current().createElement("div");		
			progressBar.getStyle().setProperty("width", "30px");
			progressBar.getStyle().setProperty("height", "30px");
			progressBar.getStyle().setProperty("border-radius", "50%");
			progressBar.getStyle().setProperty("border", "5px solid #f3f3f3");
			progressBar.getStyle().setProperty("animation", "spin 2s linear infinite");
			progressBar.getStyle().setProperty("border-top", "5px solid #3498db");
			progressBar.getStyle().setProperty("margin", "auto");
			hTMLElement.appendChild(progressBar);
		} else {
			this.progressBar = org.teavm.jso.dom.html.HTMLDocument.current().createElement("progress");
			progressBar.getStyle().setProperty("width", "100%");
			progressBar.getStyle().setProperty("border-width", "revert");
			progressBar.setAttribute("max", "100");
			progressBar.setAttribute("value", "0");
			hTMLElement.appendChild(progressBar);
		}
	}
	
	private void incrementProgressBy(Object objValue) {
		String value = progressBar.getAttribute("value");
		if (value == null || value.isEmpty()) {
			value = "0";
		}
		this.progressBar.setAttribute("value", ((int) objValue + Integer.parseInt(value)) + "");		
	}
	
	private void setProgress(Object objValue) {
		int progress = (int) objValue;
		if (progress <  min) {
			progress = min;
		}
		this.progressBar.setAttribute("value", progress + "");
	}
	
	private void setMin(Object objValue) {
		min = (int) objValue;
		
		if (isInitialised()) {
			incrementProgressBy(0);
		}
	}
	
	private void setMax(Object objValue) {
		this.progressBar.setAttribute("max", objValue + "");
	}
	
	private Object progressBackgroundTint;
	private Object progressTint;
	private void setProgressBackgroundTint(Object objValue) {
		progressBackgroundTint = objValue;
		if (objValue instanceof r.android.content.res.ColorStateList) {
			r.android.content.res.ColorStateList colorStateList = (r.android.content.res.ColorStateList) objValue;
			objValue = colorStateList.getColorForState(measurableView.getDrawableState(), r.android.graphics.Color.RED);
		}
		Object color = ViewImpl.getColor(objValue);
		if (indeterminate) {
			progressBar.getStyle().setProperty("border-left", "5px solid " + color);
			progressBar.getStyle().setProperty("border-bottom", "5px solid " + color);
			progressBar.getStyle().setProperty("border-right", "5px solid " + color);
		}
		
	}

	private void setProgressTint(Object objValue) {
		progressTint = objValue;
		if (objValue instanceof r.android.content.res.ColorStateList) {
			r.android.content.res.ColorStateList colorStateList = (r.android.content.res.ColorStateList) objValue;
			objValue = colorStateList.getColorForState(measurableView.getDrawableState(), r.android.graphics.Color.RED);
		}
		Object color = ViewImpl.getColor(objValue);
		
		if (indeterminate) {
			progressBar.getStyle().setProperty("border-top", "5px solid " + color);
		} else {
			progressBar.getStyle().setProperty("accent-color", "" + color);
		}
	}
	
	
	private Object getProgressBackgroundTint() {
		return progressBackgroundTint;
	}

	private Object getProgressTint() {
		return progressTint;
	}
}
