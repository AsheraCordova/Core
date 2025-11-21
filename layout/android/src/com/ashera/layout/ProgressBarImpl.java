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

import android.content.Context;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.*;
import androidx.core.view.*;
import android.view.*;
import android.graphics.drawable.*;


import android.os.Build;
import android.view.View;
import android.text.*;

import com.ashera.core.IFragment;
import com.ashera.converter.*;

import android.annotation.SuppressLint;

import com.ashera.layout.*;
import com.ashera.plugin.*;
import com.ashera.widget.bus.*;
import com.ashera.widget.*;
import com.ashera.widget.bus.Event.*;
import com.ashera.widget.IWidgetLifeCycleListener.EventId;
import com.ashera.widget.IWidgetLifeCycleListener.EventId.*;


import static com.ashera.widget.IWidget.*;
//end - imports

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

@SuppressLint("NewApi")
public class ProgressBarImpl extends BaseWidget {
	//start - body
	public final static String LOCAL_NAME = "ProgressBar"; 
	public final static String GROUP_NAME = "ProgressBar";

	protected android.widget.ProgressBar progressBar;
	
		@SuppressLint("NewApi")
		final static class IndeterminateTintMode  extends AbstractStringToEnumConverter{
		private Map<String, Object> mapping = new HashMap<>();
				{
		if (Build.VERSION.SDK_INT >= 11) {
				mapping.put("add", android.graphics.PorterDuff.Mode.ADD);
		}
		
				mapping.put("multiply", android.graphics.PorterDuff.Mode.MULTIPLY);
		
		
				mapping.put("screen", android.graphics.PorterDuff.Mode.SCREEN);
		
		
				mapping.put("src_atop", android.graphics.PorterDuff.Mode.SRC_ATOP);
		
		
				mapping.put("src_in", android.graphics.PorterDuff.Mode.SRC_IN);
		
		
				mapping.put("src_over", android.graphics.PorterDuff.Mode.SRC_OVER);
		
				}
		@Override
		public Map<String, Object> getMapping() {
				return mapping;
				}

		@Override
		public Object getDefault() {
				return null;
				}
				}
		@SuppressLint("NewApi")
		final static class BackgroundTintMode  extends AbstractStringToEnumConverter{
		private Map<String, Object> mapping = new HashMap<>();
				{
		if (Build.VERSION.SDK_INT >= 11) {
				mapping.put("add", android.graphics.PorterDuff.Mode.ADD);
		}
		
				mapping.put("multiply", android.graphics.PorterDuff.Mode.MULTIPLY);
		
		
				mapping.put("screen", android.graphics.PorterDuff.Mode.SCREEN);
		
		
				mapping.put("src_atop", android.graphics.PorterDuff.Mode.SRC_ATOP);
		
		
				mapping.put("src_in", android.graphics.PorterDuff.Mode.SRC_IN);
		
		
				mapping.put("src_over", android.graphics.PorterDuff.Mode.SRC_OVER);
		
				}
		@Override
		public Map<String, Object> getMapping() {
				return mapping;
				}

		@Override
		public Object getDefault() {
				return null;
				}
				}
		@SuppressLint("NewApi")
		final static class ProgressTintMode  extends AbstractStringToEnumConverter{
		private Map<String, Object> mapping = new HashMap<>();
				{
		if (Build.VERSION.SDK_INT >= 11) {
				mapping.put("add", android.graphics.PorterDuff.Mode.ADD);
		}
		
				mapping.put("multiply", android.graphics.PorterDuff.Mode.MULTIPLY);
		
		
				mapping.put("screen", android.graphics.PorterDuff.Mode.SCREEN);
		
		
				mapping.put("src_atop", android.graphics.PorterDuff.Mode.SRC_ATOP);
		
		
				mapping.put("src_in", android.graphics.PorterDuff.Mode.SRC_IN);
		
		
				mapping.put("src_over", android.graphics.PorterDuff.Mode.SRC_OVER);
		
				}
		@Override
		public Map<String, Object> getMapping() {
				return mapping;
				}

		@Override
		public Object getDefault() {
				return null;
				}
				}
		@SuppressLint("NewApi")
		final static class SecondaryProgressTintMode  extends AbstractStringToEnumConverter{
		private Map<String, Object> mapping = new HashMap<>();
				{
		if (Build.VERSION.SDK_INT >= 11) {
				mapping.put("add", android.graphics.PorterDuff.Mode.ADD);
		}
		
				mapping.put("multiply", android.graphics.PorterDuff.Mode.MULTIPLY);
		
		
				mapping.put("screen", android.graphics.PorterDuff.Mode.SCREEN);
		
		
				mapping.put("src_atop", android.graphics.PorterDuff.Mode.SRC_ATOP);
		
		
				mapping.put("src_in", android.graphics.PorterDuff.Mode.SRC_IN);
		
		
				mapping.put("src_over", android.graphics.PorterDuff.Mode.SRC_OVER);
		
				}
		@Override
		public Map<String, Object> getMapping() {
				return mapping;
				}

		@Override
		public Object getDefault() {
				return null;
				}
				}
	
	@Override
	public void loadAttributes(String attributeName) {
		ViewImpl.register(attributeName);


		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("indeterminate").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("indeterminateDrawable").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("indeterminateTint").withType("colorstate"));
		ConverterFactory.register("ProgressBar.indeterminateTintMode", new IndeterminateTintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("indeterminateTintMode").withType("ProgressBar.indeterminateTintMode"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("max").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("min").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("progress").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("progressBackgroundTint").withType("colorstate"));
		ConverterFactory.register("ProgressBar.backgroundTintMode", new BackgroundTintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("progressBackgroundTintMode").withType("ProgressBar.backgroundTintMode"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("progressDrawable").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("progressTint").withType("colorstate"));
		ConverterFactory.register("ProgressBar.progressTintMode", new ProgressTintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("progressTintMode").withType("ProgressBar.progressTintMode"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("secondaryProgress").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("secondaryProgressTint").withType("colorstate"));
		ConverterFactory.register("ProgressBar.secondaryProgressTintMode", new SecondaryProgressTintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("secondaryProgressTintMode").withType("ProgressBar.secondaryProgressTintMode"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("incrementProgressBy").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("incrementSecondaryProgressBy").withType("int"));
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

		
	public class ProgressBarExt extends android.widget.ProgressBar implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		
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

		public ProgressBarExt(Context context, android.util.AttributeSet attrs, int defStyleAttr) {
	        super(context, attrs, defStyleAttr);
	    }

	    public ProgressBarExt(Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    	super(context, attrs, defStyleAttr, defStyleRes);
	    }
		public ProgressBarExt(Context context) {
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
				ProgressBarImpl.this.invalidate();
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
        		ViewImpl.drawableStateChanged(ProgressBarImpl.this);
        	}
        }
        
    	public void setState0(float value) {
    		ViewImpl.setState(ProgressBarImpl.this, 0, value);
    	}
    	public void setState0(int value) {
    		ViewImpl.setState(ProgressBarImpl.this, 0, value);
    	}
    	public void setState0(double value) {
    		ViewImpl.setState(ProgressBarImpl.this, 0, value);
    	}
    	
    	public void setState0(Float value) {
    		ViewImpl.setState(ProgressBarImpl.this, 0, value);
    	}
    	public void setState0(Integer value) {
    		ViewImpl.setState(ProgressBarImpl.this, 0, value);
    	}
    	public void setState0(Double value) {
    		ViewImpl.setState(ProgressBarImpl.this, 0, value);
    	}
    	public void setState0(Object value) {
    		ViewImpl.setState(ProgressBarImpl.this, 0, value);
    	}
    	public void setState1(float value) {
    		ViewImpl.setState(ProgressBarImpl.this, 1, value);
    	}
    	public void setState1(int value) {
    		ViewImpl.setState(ProgressBarImpl.this, 1, value);
    	}
    	public void setState1(double value) {
    		ViewImpl.setState(ProgressBarImpl.this, 1, value);
    	}
    	
    	public void setState1(Float value) {
    		ViewImpl.setState(ProgressBarImpl.this, 1, value);
    	}
    	public void setState1(Integer value) {
    		ViewImpl.setState(ProgressBarImpl.this, 1, value);
    	}
    	public void setState1(Double value) {
    		ViewImpl.setState(ProgressBarImpl.this, 1, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(ProgressBarImpl.this, 1, value);
    	}
    	public void setState2(float value) {
    		ViewImpl.setState(ProgressBarImpl.this, 2, value);
    	}
    	public void setState2(int value) {
    		ViewImpl.setState(ProgressBarImpl.this, 2, value);
    	}
    	public void setState2(double value) {
    		ViewImpl.setState(ProgressBarImpl.this, 2, value);
    	}
    	
    	public void setState2(Float value) {
    		ViewImpl.setState(ProgressBarImpl.this, 2, value);
    	}
    	public void setState2(Integer value) {
    		ViewImpl.setState(ProgressBarImpl.this, 2, value);
    	}
    	public void setState2(Double value) {
    		ViewImpl.setState(ProgressBarImpl.this, 2, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(ProgressBarImpl.this, 2, value);
    	}
    	public void setState3(float value) {
    		ViewImpl.setState(ProgressBarImpl.this, 3, value);
    	}
    	public void setState3(int value) {
    		ViewImpl.setState(ProgressBarImpl.this, 3, value);
    	}
    	public void setState3(double value) {
    		ViewImpl.setState(ProgressBarImpl.this, 3, value);
    	}
    	
    	public void setState3(Float value) {
    		ViewImpl.setState(ProgressBarImpl.this, 3, value);
    	}
    	public void setState3(Integer value) {
    		ViewImpl.setState(ProgressBarImpl.this, 3, value);
    	}
    	public void setState3(Double value) {
    		ViewImpl.setState(ProgressBarImpl.this, 3, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(ProgressBarImpl.this, 3, value);
    	}
    	public void setState4(float value) {
    		ViewImpl.setState(ProgressBarImpl.this, 4, value);
    	}
    	public void setState4(int value) {
    		ViewImpl.setState(ProgressBarImpl.this, 4, value);
    	}
    	public void setState4(double value) {
    		ViewImpl.setState(ProgressBarImpl.this, 4, value);
    	}
    	
    	public void setState4(Float value) {
    		ViewImpl.setState(ProgressBarImpl.this, 4, value);
    	}
    	public void setState4(Integer value) {
    		ViewImpl.setState(ProgressBarImpl.this, 4, value);
    	}
    	public void setState4(Double value) {
    		ViewImpl.setState(ProgressBarImpl.this, 4, value);
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
Context context = (Context) fragment.getRootActivity();
	Object systemStyle = params.get("systemStyle");
	Object systemAndroidAttrStyle = params.get("systemAndroidAttrStyle");
	
	if (systemStyle == null && systemAndroidAttrStyle == null) {
		progressBar = new ProgressBarExt(context);
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
			progressBar = new ProgressBarExt(context, null, defStyleAttr);	
		} else {
			progressBar = new ProgressBarExt(context, null, defStyleAttr, defStyleRes);
		}
		
	}

		nativeCreate(params);	
		ViewImpl.registerCommandConveter(this);
	}

	@Override
	@SuppressLint("NewApi")
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		Object nativeWidget = asNativeWidget();
		ViewImpl.setAttribute(this,  key, strValue, objValue, decorator);
		
		switch (key.getAttributeName()) {
			case "indeterminate": {
				


	progressBar.setIndeterminate((boolean)objValue);



			}
			break;
			case "indeterminateDrawable": {
				


	progressBar.setIndeterminateDrawable((Drawable)objValue);



			}
			break;
			case "indeterminateTint": {
				


	progressBar.setIndeterminateTintList((ColorStateList)objValue);



			}
			break;
			case "indeterminateTintMode": {
				


	progressBar.setIndeterminateTintMode((android.graphics.PorterDuff.Mode)objValue);



			}
			break;
			case "max": {
				


	progressBar.setMax((int)objValue);



			}
			break;
			case "min": {
				


	progressBar.setMin((int)objValue);



			}
			break;
			case "progress": {
				


	progressBar.setProgress((int)objValue);



			}
			break;
			case "progressBackgroundTint": {
				


	progressBar.setProgressBackgroundTintList((ColorStateList)objValue);



			}
			break;
			case "progressBackgroundTintMode": {
				


	progressBar.setProgressBackgroundTintMode((android.graphics.PorterDuff.Mode)objValue);



			}
			break;
			case "progressDrawable": {
				


	progressBar.setProgressDrawable((Drawable)objValue);



			}
			break;
			case "progressTint": {
				


	progressBar.setProgressTintList((ColorStateList)objValue);



			}
			break;
			case "progressTintMode": {
				


	progressBar.setProgressTintMode((android.graphics.PorterDuff.Mode)objValue);



			}
			break;
			case "secondaryProgress": {
				


	progressBar.setSecondaryProgress((int)objValue);



			}
			break;
			case "secondaryProgressTint": {
				


	progressBar.setSecondaryProgressTintList((ColorStateList)objValue);



			}
			break;
			case "secondaryProgressTintMode": {
				


	progressBar.setSecondaryProgressTintMode((android.graphics.PorterDuff.Mode)objValue);



			}
			break;
			case "incrementProgressBy": {
				


	progressBar.incrementProgressBy((int)objValue);



			}
			break;
			case "incrementSecondaryProgressBy": {
				


	progressBar.incrementSecondaryProgressBy((int)objValue);



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
			case "indeterminateTint": {
return progressBar.getIndeterminateTintList();				}
			case "indeterminateTintMode": {
return progressBar.getIndeterminateTintMode();				}
			case "progressBackgroundTint": {
return progressBar.getProgressBackgroundTintList();				}
			case "progressBackgroundTintMode": {
return progressBar.getProgressBackgroundTintMode();				}
			case "progressTint": {
return progressBar.getProgressTintList();				}
			case "progressTintMode": {
return progressBar.getProgressTintMode();				}
			case "secondaryProgressTint": {
return progressBar.getSecondaryProgressTintList();				}
			case "secondaryProgressTintMode": {
return progressBar.getSecondaryProgressTintMode();				}
		}
		
		return null;
	}
	
	@Override
	public Object asWidget() {
		return progressBar;
	}

	
	
	    @Override
	    public Object asNativeWidget() {
	        return progressBar;
	    }

	    private void nativeCreate(Map<String, Object> params) {
	    }
	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			progressBar.setId((int) quickConvert(id, "id"));
		}
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
}
