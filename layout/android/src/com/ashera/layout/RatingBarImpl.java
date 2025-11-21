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
@SuppressLint("NewApi")
public class RatingBarImpl extends BaseWidget {
	//start - body
	public final static String LOCAL_NAME = "RatingBar"; 
	public final static String GROUP_NAME = "RatingBar";

	protected android.widget.RatingBar ratingBar;
	
	
	@Override
	public void loadAttributes(String attributeName) {
		ViewImpl.register(attributeName);


		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("isIndicator").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("numStars").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("rating").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("stepSize").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("progressTint").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("progressBackgroundTint").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("secondaryProgressTint").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onRatingBarChange").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("max").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("progressDrawable").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("progressBackgroundDrawable").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("secondaryProgressDrawable").withType("drawable"));
	}
	
	public RatingBarImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  RatingBarImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  RatingBarImpl(String groupName, String localname) {
		super(groupName, localname);
	}

		
	public class RatingBarExt extends android.widget.RatingBar implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		
		public IWidget getWidget() {
			return RatingBarImpl.this;
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

		public RatingBarExt(Context context, android.util.AttributeSet attrs, int defStyleAttr) {
	        super(context, attrs, defStyleAttr);
	    }

	    public RatingBarExt(Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    	super(context, attrs, defStyleAttr, defStyleRes);
	    }
		public RatingBarExt(Context context) {
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
				RatingBarImpl.this.invalidate();
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
        		ViewImpl.drawableStateChanged(RatingBarImpl.this);
        	}
        }
        
    	public void setState0(float value) {
    		ViewImpl.setState(RatingBarImpl.this, 0, value);
    	}
    	public void setState0(int value) {
    		ViewImpl.setState(RatingBarImpl.this, 0, value);
    	}
    	public void setState0(double value) {
    		ViewImpl.setState(RatingBarImpl.this, 0, value);
    	}
    	
    	public void setState0(Float value) {
    		ViewImpl.setState(RatingBarImpl.this, 0, value);
    	}
    	public void setState0(Integer value) {
    		ViewImpl.setState(RatingBarImpl.this, 0, value);
    	}
    	public void setState0(Double value) {
    		ViewImpl.setState(RatingBarImpl.this, 0, value);
    	}
    	public void setState0(Object value) {
    		ViewImpl.setState(RatingBarImpl.this, 0, value);
    	}
    	public void setState1(float value) {
    		ViewImpl.setState(RatingBarImpl.this, 1, value);
    	}
    	public void setState1(int value) {
    		ViewImpl.setState(RatingBarImpl.this, 1, value);
    	}
    	public void setState1(double value) {
    		ViewImpl.setState(RatingBarImpl.this, 1, value);
    	}
    	
    	public void setState1(Float value) {
    		ViewImpl.setState(RatingBarImpl.this, 1, value);
    	}
    	public void setState1(Integer value) {
    		ViewImpl.setState(RatingBarImpl.this, 1, value);
    	}
    	public void setState1(Double value) {
    		ViewImpl.setState(RatingBarImpl.this, 1, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(RatingBarImpl.this, 1, value);
    	}
    	public void setState2(float value) {
    		ViewImpl.setState(RatingBarImpl.this, 2, value);
    	}
    	public void setState2(int value) {
    		ViewImpl.setState(RatingBarImpl.this, 2, value);
    	}
    	public void setState2(double value) {
    		ViewImpl.setState(RatingBarImpl.this, 2, value);
    	}
    	
    	public void setState2(Float value) {
    		ViewImpl.setState(RatingBarImpl.this, 2, value);
    	}
    	public void setState2(Integer value) {
    		ViewImpl.setState(RatingBarImpl.this, 2, value);
    	}
    	public void setState2(Double value) {
    		ViewImpl.setState(RatingBarImpl.this, 2, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(RatingBarImpl.this, 2, value);
    	}
    	public void setState3(float value) {
    		ViewImpl.setState(RatingBarImpl.this, 3, value);
    	}
    	public void setState3(int value) {
    		ViewImpl.setState(RatingBarImpl.this, 3, value);
    	}
    	public void setState3(double value) {
    		ViewImpl.setState(RatingBarImpl.this, 3, value);
    	}
    	
    	public void setState3(Float value) {
    		ViewImpl.setState(RatingBarImpl.this, 3, value);
    	}
    	public void setState3(Integer value) {
    		ViewImpl.setState(RatingBarImpl.this, 3, value);
    	}
    	public void setState3(Double value) {
    		ViewImpl.setState(RatingBarImpl.this, 3, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(RatingBarImpl.this, 3, value);
    	}
    	public void setState4(float value) {
    		ViewImpl.setState(RatingBarImpl.this, 4, value);
    	}
    	public void setState4(int value) {
    		ViewImpl.setState(RatingBarImpl.this, 4, value);
    	}
    	public void setState4(double value) {
    		ViewImpl.setState(RatingBarImpl.this, 4, value);
    	}
    	
    	public void setState4(Float value) {
    		ViewImpl.setState(RatingBarImpl.this, 4, value);
    	}
    	public void setState4(Integer value) {
    		ViewImpl.setState(RatingBarImpl.this, 4, value);
    	}
    	public void setState4(Double value) {
    		ViewImpl.setState(RatingBarImpl.this, 4, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(RatingBarImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(RatingBarImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(RatingBarImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(RatingBarImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(RatingBarImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(RatingBarImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(RatingBarImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(RatingBarImpl.this);
        }
     
	
	}	@Override
	public Class getViewClass() {
		return RatingBarExt.class;
	}

	@Override
	public IWidget newInstance() {
		return new RatingBarImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
Context context = (Context) fragment.getRootActivity();
	Object systemStyle = params.get("systemStyle");
	Object systemAndroidAttrStyle = params.get("systemAndroidAttrStyle");
	
	if (systemStyle == null && systemAndroidAttrStyle == null) {
		ratingBar = new RatingBarExt(context);
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
			ratingBar = new RatingBarExt(context, null, defStyleAttr);	
		} else {
			ratingBar = new RatingBarExt(context, null, defStyleAttr, defStyleRes);
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
			case "isIndicator": {
				


	ratingBar.setIsIndicator((boolean)objValue);



			}
			break;
			case "numStars": {
				


	ratingBar.setNumStars((int)objValue);



			}
			break;
			case "rating": {
				


	ratingBar.setRating((float)objValue);



			}
			break;
			case "stepSize": {
				


	ratingBar.setStepSize((float)objValue);



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
			case "secondaryProgressTint": {
				


		setSecondaryProgressTint(objValue);



			}
			break;
			case "onRatingBarChange": {
				


		ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener(this, strValue, "onRatingChanged"));



			}
			break;
			case "max": {
				


	ratingBar.setMax((int)objValue);



			}
			break;
			case "progressDrawable": {
				


		setProgressDrawable(objValue);



			}
			break;
			case "progressBackgroundDrawable": {
				


		setProgressBackgroundDrawable(objValue);



			}
			break;
			case "secondaryProgressDrawable": {
				


		setSecondaryProgressDrawable(objValue);



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
			case "rating": {
return ratingBar.getRating();				}
		}
		
		return null;
	}
	
	@Override
	public Object asWidget() {
		return ratingBar;
	}

	
	@SuppressLint("NewApi")
private static class OnRatingBarChangeListener implements RatingBar.OnRatingBarChangeListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnRatingBarChangeListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnRatingBarChangeListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onRatingChanged(RatingBar ratingBar,float rating,boolean fromUser){
    
	if (action == null || action.equals("onRatingChanged")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onRatingChanged");
	    java.util.Map<String, Object> obj = getOnRatingChangedEventObj(ratingBar,rating,fromUser);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, ratingBar,rating,fromUser);
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

public java.util.Map<String, Object> getOnRatingChangedEventObj(RatingBar ratingBar,float rating,boolean fromUser) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "ratingchanged");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "rating", rating);
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "fromUser", fromUser);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onRatingChanged", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	
	    @Override
	    public Object asNativeWidget() {
	        return ratingBar;
	    }

	    private void nativeCreate(Map<String, Object> params) {
	    }
	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			ratingBar.setId((int) quickConvert(id, "id"));
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

	
    private void setProgressTint(Object objValue) {
		ratingBar.setProgressTintList((android.content.res.ColorStateList) objValue);		
	}
	
	
	private void setProgressBackgroundTint(Object objValue) {
		ratingBar.setProgressBackgroundTintList((android.content.res.ColorStateList) objValue);		
	}
	
	
	private void setSecondaryProgressTint(Object objValue) {
		ratingBar.setSecondaryProgressTintList((android.content.res.ColorStateList) objValue);
	}
	

	private void setSecondaryProgressDrawable(Object objValue) {
		LayerDrawable layerDrawable = (LayerDrawable) ratingBar.getProgressDrawable();
		layerDrawable.setDrawableByLayerId(android.R.id.secondaryProgress, createBackgroundDrawableShape(layerDrawable, (Drawable) objValue));
	}

	private void setProgressBackgroundDrawable(Object objValue) {
		LayerDrawable layerDrawable = (LayerDrawable) ratingBar.getProgressDrawable();
		layerDrawable.setDrawableByLayerId(android.R.id.background, createBackgroundDrawableShape(layerDrawable, (Drawable) objValue));
	}

	protected Drawable createBackgroundDrawableShape(LayerDrawable layerDrawable, Drawable drawable) {
		final android.graphics.Bitmap tileBitmap = drawableToBitmap(layerDrawable, drawable);
		final ShapeDrawable shapeDrawable = new ShapeDrawable(getDrawableShape());
		final android.graphics.BitmapShader bitmapShader = new android.graphics.BitmapShader(tileBitmap, android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP);
		shapeDrawable.getPaint().setShader(bitmapShader);
		return shapeDrawable;
	}

	private void setProgressDrawable(Object objValue) {
		LayerDrawable layerDrawable = (LayerDrawable) ratingBar.getProgressDrawable();
		layerDrawable.setDrawableByLayerId(android.R.id.progress, createProgressDrawableShape(layerDrawable, (Drawable) objValue));

	}

	protected Drawable createProgressDrawableShape(LayerDrawable layerDrawable, Drawable progressDrawable) {
		final android.graphics.Bitmap tileBitmap = drawableToBitmap(layerDrawable, progressDrawable);
		final ShapeDrawable shapeDrawable = new ShapeDrawable(getDrawableShape());
		final android.graphics.BitmapShader bitmapShader = new android.graphics.BitmapShader(tileBitmap, android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP);
		shapeDrawable.getPaint().setShader(bitmapShader);
		return new ClipDrawable(shapeDrawable, Gravity.LEFT, ClipDrawable.HORIZONTAL);
	}

	android.graphics.drawable.shapes.Shape getDrawableShape() {
		final float[] roundedCorners = new float[]{5, 5, 5, 5, 5, 5, 5, 5};
		return new android.graphics.drawable.shapes.RoundRectShape(roundedCorners, null, null);
	}

	public android.graphics.Bitmap drawableToBitmap(LayerDrawable layerDrawable, Drawable drawable) {
		int width = layerDrawable.getIntrinsicWidth();
		width = width > 0 ? width : 1;
		int height = layerDrawable.getIntrinsicHeight();
		height = height > 0 ? height : 1;

		final android.graphics.Bitmap bitmap = android.graphics.Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
		final Canvas canvas = new Canvas(bitmap);
		drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
		drawable.draw(canvas);

		return bitmap;
	}

}
