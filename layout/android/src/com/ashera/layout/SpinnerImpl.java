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
import androidx.core.widget.TextViewCompat;
import java.util.UUID;
@SuppressLint("NewApi")
public class SpinnerImpl extends BaseHasWidgets implements com.ashera.validations.FormElement {
	//start - body
	public final static String LOCAL_NAME = "Spinner"; 
	public final static String GROUP_NAME = "Spinner";

	protected androidx.appcompat.widget.AppCompatSpinner appCompatSpinner;
	
		@SuppressLint("NewApi")
		final static class Font extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("monospace",  0x3);
				mapping.put("normal",  0x0);
				mapping.put("sans",  0x1);
				mapping.put("serif",  0x2);
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
		final static class TextStyle  extends AbstractBitFlagConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("bold", 0x1);
				mapping.put("italic", 0x2);
				mapping.put("normal", 0x0);
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
		final static class DrawableTintMode  extends AbstractStringToEnumConverter{
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
		ViewGroupModelImpl.register(attributeName);


		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawablePadding").withType("dimension").withBufferStrategy(BUFFER_STRATEGY_ALWAYS));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("gravity").withType("gravity").withBufferStrategy(BUFFER_STRATEGY_ALWAYS));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textColor").withType("colorstate").withBufferStrategy(BUFFER_STRATEGY_ALWAYS));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textSize").withType("dimensionsp").withBufferStrategy(BUFFER_STRATEGY_ALWAYS));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableStart").withType("drawable").withBufferStrategy(BUFFER_STRATEGY_ALWAYS));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableEnd").withType("drawable").withBufferStrategy(BUFFER_STRATEGY_ALWAYS));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTop").withType("drawable").withBufferStrategy(BUFFER_STRATEGY_ALWAYS));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableBottom").withType("drawable").withBufferStrategy(BUFFER_STRATEGY_ALWAYS));
		ConverterFactory.register("Spinner.font", new Font());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("typeface").withType("Spinner.font").withBufferStrategy(BUFFER_STRATEGY_ALWAYS));
		ConverterFactory.register("Spinner.textStyle", new TextStyle());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textStyle").withType("Spinner.textStyle").withBufferStrategy(BUFFER_STRATEGY_ALWAYS));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("fontFamily").withType("font").withBufferStrategy(BUFFER_STRATEGY_ALWAYS));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("enabled").withType("boolean").withBufferStrategy(BUFFER_STRATEGY_ALWAYS));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("editable").withType("boolean").withBufferStrategy(BUFFER_STRATEGY_ALWAYS));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTint").withType("colorstate").withBufferStrategy(BUFFER_STRATEGY_ALWAYS));
		ConverterFactory.register("Spinner.drawableTintMode", new DrawableTintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTintMode").withType("Spinner.drawableTintMode").withBufferStrategy(BUFFER_STRATEGY_ALWAYS));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableIconSize").withType("dimension").withOrder(-1).withBufferStrategy(BUFFER_STRATEGY_ALWAYS));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hint").withType("resourcestring").withBufferStrategy(BUFFER_STRATEGY_ALWAYS));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textColorHint").withType("colorstate").withBufferStrategy(BUFFER_STRATEGY_ALWAYS));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("dropDownHorizontalOffset").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("dropDownVerticalOffset").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("dropDownWidth").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("prompt").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("selection").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("entries").withType("array").withArrayType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onItemSelected").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelOptionTextPath").withType("string").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelOptionValuePath").withType("string").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("listitem").withType("template"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("values").withType("array").withArrayType("resourcestring").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("selectedValue").withType("object"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hintTextFormat").withType("resourcestring").withOrder(-1));
	WidgetFactory.registerConstructorAttribute(localName, new WidgetAttribute.Builder().withName("spinnerMode").withType("spinnerMode"));
	}
	
	public SpinnerImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  SpinnerImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  SpinnerImpl(String groupName, String localname) {
		super(groupName, localname);
	}

		
	public class SpinnerExt extends androidx.appcompat.widget.AppCompatSpinner implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		
		public IWidget getWidget() {
			return SpinnerImpl.this;
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

		public SpinnerExt(Context context, android.util.AttributeSet attrs, int defStyleAttr) {
	        super(context, attrs, defStyleAttr);
	    }

	    public SpinnerExt(Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    	super(context, attrs, defStyleAttr, defStyleRes);
	    }
		public SpinnerExt(Context context) {
			super(context);
			
		}
			public SpinnerExt(Context context, int mode) {
				super(context, mode);
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
				SpinnerImpl.this.invalidate();
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
        		ViewImpl.drawableStateChanged(SpinnerImpl.this);
        	}
        }
        
    	public void setState0(float value) {
    		ViewImpl.setState(SpinnerImpl.this, 0, value);
    	}
    	public void setState0(int value) {
    		ViewImpl.setState(SpinnerImpl.this, 0, value);
    	}
    	public void setState0(double value) {
    		ViewImpl.setState(SpinnerImpl.this, 0, value);
    	}
    	
    	public void setState0(Float value) {
    		ViewImpl.setState(SpinnerImpl.this, 0, value);
    	}
    	public void setState0(Integer value) {
    		ViewImpl.setState(SpinnerImpl.this, 0, value);
    	}
    	public void setState0(Double value) {
    		ViewImpl.setState(SpinnerImpl.this, 0, value);
    	}
    	public void setState0(Object value) {
    		ViewImpl.setState(SpinnerImpl.this, 0, value);
    	}
    	public void setState1(float value) {
    		ViewImpl.setState(SpinnerImpl.this, 1, value);
    	}
    	public void setState1(int value) {
    		ViewImpl.setState(SpinnerImpl.this, 1, value);
    	}
    	public void setState1(double value) {
    		ViewImpl.setState(SpinnerImpl.this, 1, value);
    	}
    	
    	public void setState1(Float value) {
    		ViewImpl.setState(SpinnerImpl.this, 1, value);
    	}
    	public void setState1(Integer value) {
    		ViewImpl.setState(SpinnerImpl.this, 1, value);
    	}
    	public void setState1(Double value) {
    		ViewImpl.setState(SpinnerImpl.this, 1, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(SpinnerImpl.this, 1, value);
    	}
    	public void setState2(float value) {
    		ViewImpl.setState(SpinnerImpl.this, 2, value);
    	}
    	public void setState2(int value) {
    		ViewImpl.setState(SpinnerImpl.this, 2, value);
    	}
    	public void setState2(double value) {
    		ViewImpl.setState(SpinnerImpl.this, 2, value);
    	}
    	
    	public void setState2(Float value) {
    		ViewImpl.setState(SpinnerImpl.this, 2, value);
    	}
    	public void setState2(Integer value) {
    		ViewImpl.setState(SpinnerImpl.this, 2, value);
    	}
    	public void setState2(Double value) {
    		ViewImpl.setState(SpinnerImpl.this, 2, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(SpinnerImpl.this, 2, value);
    	}
    	public void setState3(float value) {
    		ViewImpl.setState(SpinnerImpl.this, 3, value);
    	}
    	public void setState3(int value) {
    		ViewImpl.setState(SpinnerImpl.this, 3, value);
    	}
    	public void setState3(double value) {
    		ViewImpl.setState(SpinnerImpl.this, 3, value);
    	}
    	
    	public void setState3(Float value) {
    		ViewImpl.setState(SpinnerImpl.this, 3, value);
    	}
    	public void setState3(Integer value) {
    		ViewImpl.setState(SpinnerImpl.this, 3, value);
    	}
    	public void setState3(Double value) {
    		ViewImpl.setState(SpinnerImpl.this, 3, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(SpinnerImpl.this, 3, value);
    	}
    	public void setState4(float value) {
    		ViewImpl.setState(SpinnerImpl.this, 4, value);
    	}
    	public void setState4(int value) {
    		ViewImpl.setState(SpinnerImpl.this, 4, value);
    	}
    	public void setState4(double value) {
    		ViewImpl.setState(SpinnerImpl.this, 4, value);
    	}
    	
    	public void setState4(Float value) {
    		ViewImpl.setState(SpinnerImpl.this, 4, value);
    	}
    	public void setState4(Integer value) {
    		ViewImpl.setState(SpinnerImpl.this, 4, value);
    	}
    	public void setState4(Double value) {
    		ViewImpl.setState(SpinnerImpl.this, 4, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(SpinnerImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(SpinnerImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(SpinnerImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(SpinnerImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(SpinnerImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(SpinnerImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(SpinnerImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(SpinnerImpl.this);
        }
     
	
	}	@Override
	public Class getViewClass() {
		return SpinnerExt.class;
	}

	@Override
	public IWidget newInstance() {
		return new SpinnerImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
Context context = (Context) fragment.getRootActivity();
	Object systemStyle = params.get("systemStyle");
	Object systemAndroidAttrStyle = params.get("systemAndroidAttrStyle");
	
	if (systemStyle == null && systemAndroidAttrStyle == null) {
		appCompatSpinner = new SpinnerExt(context);
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
			appCompatSpinner = new SpinnerExt(context, null, defStyleAttr);	
		} else {
			appCompatSpinner = new SpinnerExt(context, null, defStyleAttr, defStyleRes);
		}
		
	}

		nativeCreate(params);	
		ViewImpl.registerCommandConveter(this);
	}

	@Override
	@SuppressLint("NewApi")
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		Object nativeWidget = asNativeWidget();
		ViewGroupModelImpl.setAttribute(this,  key, strValue, objValue, decorator);
		
		switch (key.getAttributeName()) {
			case "drawablePadding": {
				


	appCompatTextView.setCompoundDrawablePadding((int)objValue);



			}
			break;
			case "gravity": {
				


	appCompatTextView.setGravity((int)objValue);



			}
			break;
			case "textColor": {
				


	appCompatTextView.setTextColor((android.content.res.ColorStateList)objValue);



			}
			break;
			case "textSize": {
				


		setMyTextSize(objValue);



			}
			break;
			case "drawableStart": {
				


		setDrawableLeft(objValue);



			}
			break;
			case "drawableEnd": {
				


		setDrawableRight(objValue);



			}
			break;
			case "drawableTop": {
				


		setDrawableTop(objValue);



			}
			break;
			case "drawableBottom": {
				


		setDrawableBottom(objValue);



			}
			break;
			case "typeface": {
				


		setTypeFace(objValue, strValue);



			}
			break;
			case "textStyle": {
				


		setTextStyle(objValue);



			}
			break;
			case "fontFamily": {
				


		setFontFamily(objValue, strValue);



			}
			break;
			case "enabled": {
				


		 appCompatSpinner.setEnabled((boolean) objValue);



			}
			break;
			case "editable": {
				


		 appCompatSpinner.setEnabled((boolean) objValue);



			}
			break;
			case "drawableTint": {
				


		setDrawableTintList(objValue);



			}
			break;
			case "drawableTintMode": {
				


		setDrawableTintMode(objValue);



			}
			break;
			case "drawableIconSize": {
				


		setDrawableIconSize(objValue);



			}
			break;
			case "hint": {
				


	appCompatTextView.setHint((String)objValue);



			}
			break;
			case "textColorHint": {
				


	appCompatTextView.setHintTextColor((android.content.res.ColorStateList)objValue);



			}
			break;
			case "dropDownHorizontalOffset": {
				


	appCompatSpinner.setDropDownHorizontalOffset((int)objValue);



			}
			break;
			case "dropDownVerticalOffset": {
				


	appCompatSpinner.setDropDownVerticalOffset((int)objValue);



			}
			break;
			case "dropDownWidth": {
				


	appCompatSpinner.setDropDownWidth((int)objValue);



			}
			break;
			case "prompt": {
				


	appCompatSpinner.setPrompt((CharSequence)objValue);



			}
			break;
			case "selection": {
				


	appCompatSpinner.setSelection((int)objValue);



			}
			break;
			case "entries": {
				


		setEntries(objValue);



			}
			break;
			case "onItemSelected": {
				


		if (objValue instanceof String) {appCompatSpinner.setOnItemSelectedListener(new OnItemSelectedListener(this, strValue, "onItemSelected"));} else {appCompatSpinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) objValue);}



			}
			break;
			case "modelOptionTextPath": {
				


		setModelOptionTextPath(objValue);



			}
			break;
			case "modelOptionValuePath": {
				


		setModelOptionValuePath(objValue);



			}
			break;
			case "listitem": {
				


		 addTemplate(objValue);



			}
			break;
			case "values": {
				


		setValues(objValue);



			}
			break;
			case "selectedValue": {
				


		setSelectedValue(objValue);



			}
			break;
			case "hintTextFormat": {
				


		setHintTextFormat(objValue);



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
		Object nativeWidget = asNativeWidget();
		Object attributeValue = ViewImpl.getAttribute(this, nativeWidget, key, decorator);
		if (attributeValue != null) {
			return attributeValue;
		}
		switch (key.getAttributeName()) {
			case "drawablePadding": {
if (appCompatTextView == null) return null; return appCompatTextView.getCompoundDrawablePadding();				}
			case "gravity": {
return appCompatSpinner.getGravity();				}
			case "textColor": {
if (appCompatTextView == null) return null; return appCompatTextView.getTextColors();				}
			case "textSize": {
if (appCompatTextView == null) return null; return appCompatTextView.getTextSize();				}
			case "hint": {
if (appCompatTextView == null) return null; return appCompatTextView.getHint();				}
			case "dropDownHorizontalOffset": {
return appCompatSpinner.getDropDownHorizontalOffset();				}
			case "dropDownVerticalOffset": {
return appCompatSpinner.getDropDownVerticalOffset();				}
			case "dropDownWidth": {
return appCompatSpinner.getDropDownWidth();				}
			case "selectedValue": {
return getSelectedValue();				}
		}
		
		return null;
	}
	
	@Override
	public Object asWidget() {
		return appCompatSpinner;
	}

	

	private int iconSize = -1;
	private void setDrawableLeft(Object objValue) {
		android.graphics.drawable.Drawable[] drawables = appCompatTextView.getCompoundDrawables();
		setBoundsOfDrawable(objValue);
		TextViewCompat.setCompoundDrawablesRelative(appCompatTextView, (android.graphics.drawable.Drawable) objValue, drawables[1], drawables[2], drawables[3]);		
	}

	private void setBoundsOfDrawable(Object objValue) {
		android.graphics.drawable.Drawable image = (android.graphics.drawable.Drawable) objValue;
		
		if (iconSize != -1) {
			image.setBounds( 0, 0, iconSize, iconSize);
		} else {
			int h = image.getIntrinsicHeight();
			int w = image.getIntrinsicWidth();
			image.setBounds( 0, 0, w, h);
		}
	}
	
	private void setDrawableIconSize(Object objValue) {
		iconSize = (int) objValue;
		
		if (isInitialised()) {
			android.graphics.drawable.Drawable[] drawables = appCompatTextView.getCompoundDrawablesRelative();
			for (android.graphics.drawable.Drawable drawable : drawables) {
				if (drawable != null) {
					setBoundsOfDrawable(drawable);
				}
			}
			TextViewCompat.setCompoundDrawablesRelative(appCompatTextView, drawables[0], drawables[1], drawables[2], drawables[3]);
		}
	}
	
	private void setDrawableRight(Object objValue) {
		android.graphics.drawable.Drawable[] drawables = appCompatTextView.getCompoundDrawables();
		setBoundsOfDrawable(objValue);
		TextViewCompat.setCompoundDrawablesRelative(appCompatTextView, drawables[0], drawables[1], (android.graphics.drawable.Drawable) objValue, drawables[3]);
		
	}
	private void setDrawableTop(Object objValue) {
		setBoundsOfDrawable(objValue);
		android.graphics.drawable.Drawable[] drawables = appCompatTextView.getCompoundDrawables();
		TextViewCompat.setCompoundDrawablesRelative(appCompatTextView, drawables[0], (android.graphics.drawable.Drawable) objValue, drawables[2], drawables[3]);
		
	}
	
	private void setDrawableBottom(Object objValue) {
		setBoundsOfDrawable(objValue);
		android.graphics.drawable.Drawable[] drawables = appCompatTextView.getCompoundDrawables();
		TextViewCompat.setCompoundDrawablesRelative(appCompatTextView, drawables[0], drawables[1], drawables[2], (android.graphics.drawable.Drawable) objValue);
		
	}
	
	private android.graphics.drawable.Drawable tintDrawableCompat;
	private void setDrawableTintMode(Object objValue) {
		if (Build.VERSION.SDK_INT >= 23) {
			appCompatTextView.setCompoundDrawableTintMode((android.graphics.PorterDuff.Mode) objValue);
		} else {
			android.graphics.drawable.Drawable[] drawables = appCompatTextView.getCompoundDrawablesRelative();
			for (android.graphics.drawable.Drawable drawable : drawables) {
				if (drawable != null) {
					if (tintDrawableCompat == null) {
						tintDrawableCompat = drawable;
						if (Build.VERSION.SDK_INT < 21) {
							tintDrawableCompat = androidx.core.graphics.drawable.DrawableCompat.wrap(tintDrawableCompat);
						}
					}
					androidx.core.graphics.drawable.DrawableCompat.setTintMode(tintDrawableCompat.mutate(),
							(android.graphics.PorterDuff.Mode) objValue);
					if (isInitialised()) {
						appCompatTextView.invalidate();
					}
				}
			}
		}
	}

	private void setDrawableTintList(Object objValue) {
		if (Build.VERSION.SDK_INT >= 23) {
			appCompatTextView.setCompoundDrawableTintList((android.content.res.ColorStateList) objValue);
		} else {
			android.graphics.drawable.Drawable[] drawables = appCompatTextView.getCompoundDrawablesRelative();
			for (android.graphics.drawable.Drawable drawable : drawables) {
				if (drawable != null) {
					if (tintDrawableCompat == null) {
						tintDrawableCompat = drawable;
						if (Build.VERSION.SDK_INT < 21) {
							tintDrawableCompat = androidx.core.graphics.drawable.DrawableCompat.wrap(tintDrawableCompat);
						}
					}
					androidx.core.graphics.drawable.DrawableCompat.setTintList(tintDrawableCompat.mutate(),
							(android.content.res.ColorStateList) objValue);
					if (isInitialised()) {
						appCompatTextView.invalidate();
					}					
				}
			}
		}
	}
	


	private void setMyTextSize(Object objValue) {
		appCompatTextView.setTextSize(android.util.TypedValue.COMPLEX_UNIT_PX, getFragment().getRootActivity().getScaleFactor() * (float)objValue);		
	}
	


	private void setFontFamily(Object objValue, String strValue) {
		setTypeFace(objValue, strValue);
	}

	private void setTextStyle(Object objValue) {
		android.graphics.Typeface typeface  = appCompatTextView.getTypeface();
		if (typeface == null) {
			typeface = android.graphics.Typeface.DEFAULT;
		} else {
			typeface = android.graphics.Typeface.create(typeface, (int) objValue);
        }
		
		appCompatTextView.setTypeface(typeface, (int) objValue);
	}

	private void setTypeFace(Object objValue, String strValue) {
		if (objValue instanceof Integer) {
			objValue = PluginInvoker.convertFrom(ConverterFactory.get(CommonConverters.font), null, strValue, fragment);
		}
		android.graphics.Typeface typeface = appCompatTextView.getTypeface();
		if (typeface != null) {
			appCompatTextView.setTypeface((android.graphics.Typeface) objValue, typeface.getStyle());
		} else {
			appCompatTextView.setTypeface((android.graphics.Typeface) objValue);
		}
	}
	


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
	


	@Override
	public boolean isViewVisible() {
		return appCompatSpinner.getVisibility() == View.VISIBLE;
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
		appCompatSpinner.requestFocus();
	}
	


	private void setHintTextFormat(Object objValue) {
		applyAttributeCommand("hint", CommonConverters.command_textformatter, new String[] {"hintTextFormat"}, true, (String) objValue);
	}
	

	@SuppressLint("NewApi")
private static class OnItemSelectedListener implements AdapterView.OnItemSelectedListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnItemSelectedListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnItemSelectedListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
    
	if (action == null || action.equals("onItemSelected")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onItemSelected");
	    java.util.Map<String, Object> obj = getOnItemSelectedEventObj(parent,view,position,id);
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

public java.util.Map<String, Object> getOnItemSelectedEventObj(AdapterView<?> parent,View view,int position,long id) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "itemselected");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "position", position);Object selectedValue = ((SpinnerImpl)w).getSelectedValue(); if (selectedValue != null) { PluginInvoker.putJSONSafeObjectIntoMap(obj, "selectedValue", selectedValue);}
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onItemSelected", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}public void onNothingSelected(AdapterView<?> parent){
    
	if (action == null || action.equals("onNothingSelected")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onNothingSelected");
	    java.util.Map<String, Object> obj = getOnNothingSelectedEventObj(parent);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, parent);
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

public java.util.Map<String, Object> getOnNothingSelectedEventObj(AdapterView<?> parent) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "nothingselected");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onNothingSelected", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	
	    @Override
	    public Object asNativeWidget() {
	        return appCompatSpinner;
	    }
	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			appCompatSpinner.setId((int) quickConvert(id, "id"));
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

	private void setEntries(Object objValue) {
		myCustomAdapter = new MyCustomAdapter(
	            appCompatSpinner.getContext(), android.R.layout.simple_spinner_item);
		List<String> entries = (List<String>)objValue;
		dataList.clear();
		for (String entry : entries) {
			com.ashera.model.LoopParam loopParam = new com.ashera.model.LoopParam() {
				@Override
				public java.lang.String toString() {
					return entry;
				}
			};
			loopParam.put("item", entry);
			dataList.add(loopParam);
		}
		
		myCustomAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	    appCompatSpinner.setAdapter(myCustomAdapter);
	}
	
	private TextView appCompatTextView;
	private void nativeCreate(Map<String, Object> params) {
		Object spinnerMode = params.get("spinnerMode");
		
		if (spinnerMode != null && "dialog".equals(spinnerMode)) {
			appCompatSpinner = new SpinnerExt((Context) fragment.getRootActivity(), Spinner.MODE_DIALOG);
		}
		
		registerForAttributeCommandChain("hint");
	}
	
	public class MyCustomAdapter extends ArrayAdapter {
		public MyCustomAdapter(Context context, int resource) {
			super(context, resource, dataList);
		}

		@Override
		public View getDropDownView(int position, View convertView, ViewGroup parent) {
			if (listItem == null) {
				return super.getDropDownView(position, convertView, parent);
			}
			return getCustomView(position, convertView, parent);
		}
		
		@Override
		public java.lang.Object getItem(int position) {
			if (listItem == null) {
				if (modelOptionTextPath != null) {
					return getOptionValueFromLoopParam(dataList.get(position), modelOptionTextPath);
				}
			}
			return super.getItem(position);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			if (listItem == null) {
				View view = super.getView(position, convertView, parent);
				if (view instanceof TextView) {
					appCompatTextView = (TextView) view;
					replayBufferedEventsInternal();
				}
				return view;
			}
			return getCustomView(position, convertView, parent);
		}

		public View getCustomView(int position, View convertView, ViewGroup parent) {
			com.ashera.model.LoopParam model = dataList.get(position);
			IWidget myWidget;
			if (convertView == null) {
				myWidget = getListItem().loadLazyWidgets(model);
				((View) myWidget.asNativeWidget()).setTag(myWidget);
			} else {
				myWidget = (IWidget) convertView.getTag();
			}

			updateModelRecurse(myWidget, model);

			return (View) myWidget.asNativeWidget();

		}
	}

	private MyCustomAdapter myCustomAdapter;
	private void postSetAttribute(WidgetAttribute key, String strValue, Object objValue,
			ILifeCycleDecorator decorator) {
		switch (key.getAttributeName()) {
		case "modelFor":
		case "listitem":
			Context context = (Context) fragment.getRootActivity();
			myCustomAdapter = new MyCustomAdapter(context, android.R.layout.simple_spinner_item);
			myCustomAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			appCompatSpinner.setAdapter(myCustomAdapter);
			break;

		default:
			break;
		}
		
	}
	
    private void reloadTable() {
		if (myCustomAdapter != null) {
			myCustomAdapter.notifyDataSetChanged();
		}
	}
    

	
    //start - viewcode
    @Override
	public Object getChildAttribute(IWidget w, WidgetAttribute key) {
		return null;
	}

	@Override
	public void setChildAttribute(IWidget widget, WidgetAttribute key, String strValue, Object value) {
	}
	
	
	private String modelOptionTextPath;
	private String modelOptionValuePath;
	private void setModelOptionTextPath(Object objValue) {
		this.modelOptionTextPath = (String) objValue;
	}
	
	
	private void setModelOptionValuePath(Object objValue) {
		this.modelOptionValuePath = (String) objValue;
	}
	
	private Object getOptionValueFromLoopParam(com.ashera.model.LoopParam loopParam, String path) {
		com.ashera.model.ModelExpressionParser.ModelFromScopeHolder modelFromScopeHolder = com.ashera.model.ModelExpressionParser.parseModelFromScope(path);
		setLoopParam(loopParam);
		Object obj = getModelFromScope(modelFromScopeHolder.varName, modelFromScopeHolder.varScope);
		Object val = getModelByPath(modelFromScopeHolder.varPath, obj);
		if (val == null) {
			val = "";
		}
		return val;
	}

	
	//end - viewcode
	//start - bufferevents
	@Override
	public void replayBufferedEvents() {
	}
	
	@Override
	protected void attributeBuffered() {
		if (isInitialised()) {
			reloadTable();
		}
	}
	//end - bufferevents 
	
	//start - values
	private List<String> values;
	private Object tmpSelectedValue;
	private void setValues(Object objValue) {
		this.values = (List<String>) objValue;
	}
	
	private void setSelectedValue(Object objValue) {
		if (objValue instanceof String) {
			// try resource string
			objValue = quickConvert(objValue, CommonConverters.resourcestring);
		}
		if (this.values != null) {
			int index = values.indexOf(objValue);
			setSelection(index);
		} else if (dataList != null && dataList.size() > 0) {
			for (int i = 0; i < dataList.size(); i++) {
				com.ashera.model.LoopParam loopParam = dataList.get(i);

				if (modelOptionValuePath != null) {
					Object data = getOptionValueFromLoopParam(loopParam, modelOptionValuePath);
					if (data.equals(objValue)) {
						setSelection(i);
						break;
					}
				} else if (modelOptionTextPath != null) {
					Object data = getOptionValueFromLoopParam(loopParam, modelOptionTextPath);
					if (data.equals(objValue)) {
						setSelection(i);
						break;
					}
				}
			}
		} else {
			tmpSelectedValue = objValue;
		}
	}

	private Object getSelectedValue() {
		int selectedItemPosition = getSelectedItemPosition();
		
		if (this.values != null && this.values.size() > selectedItemPosition) {
			return this.values.get(selectedItemPosition);
		}
		
		if (dataList != null && dataList.size() > 0) {
			if (modelOptionValuePath != null) {
				return getOptionValueFromLoopParam(dataList.get(selectedItemPosition), modelOptionValuePath);
			}
			
			if (modelOptionTextPath != null) {
				return getOptionValueFromLoopParam(dataList.get(selectedItemPosition), modelOptionTextPath);
			}
		}
		return null;
	}
	
	
	@Override
	public String getTextEntered() {
		Object selectedValue = getSelectedValue();
		if (!(selectedValue instanceof String) && getModelIdPath() != null) {
			selectedValue = PluginInvoker.getString(getModelByPath(getModelIdPath(), selectedValue));			
		}
		return (String) selectedValue;
	}
	
	@Override
	public void initialized() {
		super.initialized();
		if (tmpSelectedValue != null) {
			setSelectedValue(tmpSelectedValue);
		}
		selectSpinnerIfRequired();
	}
	//end - values

	private void selectSpinnerIfRequired() {
		
	}

	private int getSelectedItemPosition() {
		return appCompatSpinner.getSelectedItemPosition();
	}


	
	private void setSelection(int position) {
		appCompatSpinner.setSelection(position);
	}

	private void setError(String message) {
		
	}
}