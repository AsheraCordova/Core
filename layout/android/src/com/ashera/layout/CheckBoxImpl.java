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
@SuppressLint("NewApi")
public class CheckBoxImpl extends BaseWidget implements com.ashera.validations.FormElement{
	//start - body
	public final static String LOCAL_NAME = "CheckBox"; 
	public final static String GROUP_NAME = "CheckBox";

	protected androidx.appcompat.widget.AppCompatCheckBox appCompatCheckBox;
	
		@SuppressLint("NewApi")
		final static class AutoLink  extends AbstractBitFlagConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("all", 0xf);
				mapping.put("email", 0x2);
				mapping.put("map", 0x8);
				mapping.put("none", 0x0);
				mapping.put("phone", 0x4);
				mapping.put("web", 0x1);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
		@Override
		public java.lang.String getAllOption() {
			return "all";
		}
				}
		@SuppressLint("NewApi")
		final static class BreakStrategy extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("balanced",  0x2);
				mapping.put("high_quality",  0x1);
				mapping.put("simple",  0x0);
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
		final static class Ellipsize  extends AbstractStringToEnumConverter{
		private Map<String, Object> mapping = new HashMap<>();
				{
		
				mapping.put("end", android.text.TextUtils.TruncateAt.END);
		
		
				mapping.put("marquee", android.text.TextUtils.TruncateAt.MARQUEE);
		
		
				mapping.put("middle", android.text.TextUtils.TruncateAt.MIDDLE);
		
		
				mapping.put("none", "@null");
		
		
				mapping.put("start", android.text.TextUtils.TruncateAt.START);
		
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
		final static class HyphenationFrequency extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("full",  0x2);
				mapping.put("none",  0x0);
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
		@SuppressLint("NewApi")
		final static class JustificationMode extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("inter_word",  0x1);
				mapping.put("none",  0x0);
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
		final static class MarqueeRepeatLimit extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("marquee_forever",  0xffffffff);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
		@Override
		public boolean supportsIntAlso() {
			return true;
		}
				}
		@SuppressLint("NewApi")
		final static class ButtonTintMode  extends AbstractStringToEnumConverter{
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
		ViewImpl.register(attributeName);


		ConverterFactory.register("CheckBox.autoLink", new AutoLink());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("autoLink").withType("CheckBox.autoLink"));
		ConverterFactory.register("CheckBox.breakStrategy", new BreakStrategy());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("breakStrategy").withType("CheckBox.breakStrategy"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawablePadding").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("elegantTextHeight").withType("boolean"));
		ConverterFactory.register("CheckBox.ellipsize", new Ellipsize());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("ellipsize").withType("CheckBox.ellipsize"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("ems").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("fallbackLineSpacing").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("firstBaselineToTopHeight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("fontFeatureSettings").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("gravity").withType("gravity"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("height").withType("dimension"));
		ConverterFactory.register("CheckBox.hyphenationFrequency", new HyphenationFrequency());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hyphenationFrequency").withType("CheckBox.hyphenationFrequency"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("includeFontPadding").withType("boolean"));
		ConverterFactory.register("CheckBox.justificationMode", new JustificationMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("justificationMode").withType("CheckBox.justificationMode"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lastBaselineToBottomHeight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("letterSpacing").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lineHeight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lineSpacingExtra").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lineSpacingMultiplier").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lines").withType("int"));
		ConverterFactory.register("CheckBox.marqueeRepeatLimit", new MarqueeRepeatLimit());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("marqueeRepeatLimit").withType("CheckBox.marqueeRepeatLimit"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxEms").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxHeight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxLines").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxWidth").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minEms").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minHeight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minLines").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minWidth").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scrollHorizontally").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("shadowColor").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("shadowDx").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("shadowDy").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("shadowRadius").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("singleLine").withType("boolean").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textAllCaps").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textColorHighlight").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textColorLink").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textIsSelectable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textScaleX").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("width").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("button").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("buttonTint").withType("colorstate"));
		ConverterFactory.register("CheckBox.buttonTintMode", new ButtonTintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("buttonTintMode").withType("CheckBox.buttonTintMode"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onCheckedChange").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("checked").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("text").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textSize").withType("dimensionsp"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableStart").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableEnd").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTop").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableBottom").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxLength").withType("int"));
		ConverterFactory.register("CheckBox.font", new Font());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("typeface").withType("CheckBox.font"));
		ConverterFactory.register("CheckBox.textStyle", new TextStyle());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textStyle").withType("CheckBox.textStyle"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("fontFamily").withType("font"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("systemTextAppearance").withType("style"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textAppearance").withType("string").withStylePriority(1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("enabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("editable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTint").withType("colorstate"));
		ConverterFactory.register("CheckBox.drawableTintMode", new DrawableTintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTintMode").withType("CheckBox.drawableTintMode"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("padding").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingBottom").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingRight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingLeft").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingStart").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingEnd").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingTop").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingHorizontal").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingVertical").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textFormat").withType("resourcestring").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableIconSize").withType("dimension").withOrder(-1));
	WidgetFactory.registerConstructorAttribute(localName, new WidgetAttribute.Builder().withName("html").withType("boolean"));
	}
	
	public CheckBoxImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  CheckBoxImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  CheckBoxImpl(String groupName, String localname) {
		super(groupName, localname);
	}

		
	public class CheckBoxExt extends androidx.appcompat.widget.AppCompatCheckBox implements ILifeCycleDecorator{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		
		public IWidget getWidget() {
			return CheckBoxImpl.this;
		}

		public CheckBoxExt(Context context, android.util.AttributeSet attrs, int defStyleAttr) {
	        super(context, attrs, defStyleAttr);
	    }

		public CheckBoxExt(Context context) {
			super(context);
			
		}
		
		@Override
		public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {


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
				CheckBoxImpl.this.invalidate();
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
        		ViewImpl.drawableStateChanged(CheckBoxImpl.this);
        	}
        }
        
    	public void setState0(float value) {
    		ViewImpl.setState(CheckBoxImpl.this, 0, value);
    	}
    	public void setState0(int value) {
    		ViewImpl.setState(CheckBoxImpl.this, 0, value);
    	}
    	public void setState0(double value) {
    		ViewImpl.setState(CheckBoxImpl.this, 0, value);
    	}
    	
    	public void setState0(Float value) {
    		ViewImpl.setState(CheckBoxImpl.this, 0, value);
    	}
    	public void setState0(Integer value) {
    		ViewImpl.setState(CheckBoxImpl.this, 0, value);
    	}
    	public void setState0(Double value) {
    		ViewImpl.setState(CheckBoxImpl.this, 0, value);
    	}
    	public void setState0(Object value) {
    		ViewImpl.setState(CheckBoxImpl.this, 0, value);
    	}
    	public void setState1(float value) {
    		ViewImpl.setState(CheckBoxImpl.this, 1, value);
    	}
    	public void setState1(int value) {
    		ViewImpl.setState(CheckBoxImpl.this, 1, value);
    	}
    	public void setState1(double value) {
    		ViewImpl.setState(CheckBoxImpl.this, 1, value);
    	}
    	
    	public void setState1(Float value) {
    		ViewImpl.setState(CheckBoxImpl.this, 1, value);
    	}
    	public void setState1(Integer value) {
    		ViewImpl.setState(CheckBoxImpl.this, 1, value);
    	}
    	public void setState1(Double value) {
    		ViewImpl.setState(CheckBoxImpl.this, 1, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(CheckBoxImpl.this, 1, value);
    	}
    	public void setState2(float value) {
    		ViewImpl.setState(CheckBoxImpl.this, 2, value);
    	}
    	public void setState2(int value) {
    		ViewImpl.setState(CheckBoxImpl.this, 2, value);
    	}
    	public void setState2(double value) {
    		ViewImpl.setState(CheckBoxImpl.this, 2, value);
    	}
    	
    	public void setState2(Float value) {
    		ViewImpl.setState(CheckBoxImpl.this, 2, value);
    	}
    	public void setState2(Integer value) {
    		ViewImpl.setState(CheckBoxImpl.this, 2, value);
    	}
    	public void setState2(Double value) {
    		ViewImpl.setState(CheckBoxImpl.this, 2, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(CheckBoxImpl.this, 2, value);
    	}
    	public void setState3(float value) {
    		ViewImpl.setState(CheckBoxImpl.this, 3, value);
    	}
    	public void setState3(int value) {
    		ViewImpl.setState(CheckBoxImpl.this, 3, value);
    	}
    	public void setState3(double value) {
    		ViewImpl.setState(CheckBoxImpl.this, 3, value);
    	}
    	
    	public void setState3(Float value) {
    		ViewImpl.setState(CheckBoxImpl.this, 3, value);
    	}
    	public void setState3(Integer value) {
    		ViewImpl.setState(CheckBoxImpl.this, 3, value);
    	}
    	public void setState3(Double value) {
    		ViewImpl.setState(CheckBoxImpl.this, 3, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(CheckBoxImpl.this, 3, value);
    	}
    	public void setState4(float value) {
    		ViewImpl.setState(CheckBoxImpl.this, 4, value);
    	}
    	public void setState4(int value) {
    		ViewImpl.setState(CheckBoxImpl.this, 4, value);
    	}
    	public void setState4(double value) {
    		ViewImpl.setState(CheckBoxImpl.this, 4, value);
    	}
    	
    	public void setState4(Float value) {
    		ViewImpl.setState(CheckBoxImpl.this, 4, value);
    	}
    	public void setState4(Integer value) {
    		ViewImpl.setState(CheckBoxImpl.this, 4, value);
    	}
    	public void setState4(Double value) {
    		ViewImpl.setState(CheckBoxImpl.this, 4, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(CheckBoxImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(CheckBoxImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(CheckBoxImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(CheckBoxImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(CheckBoxImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(CheckBoxImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(CheckBoxImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(CheckBoxImpl.this);
        }
     
	
	}	@Override
	public Class getViewClass() {
		return CheckBoxExt.class;
	}

	@Override
	public IWidget newInstance() {
		return new CheckBoxImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
Context context = (Context) fragment.getRootActivity();
	Object systemStyle = params.get("systemStyle");
	Object systemAndroidAttrStyle = params.get("systemAndroidAttrStyle");
	
	if (systemStyle == null && systemAndroidAttrStyle == null) {
		appCompatCheckBox = new CheckBoxExt(context);
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
			appCompatCheckBox = new CheckBoxExt(context, null, defStyleAttr);	
		} else {
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
			case "autoLink": {
				


	appCompatCheckBox.setAutoLinkMask((int)objValue);
resetText();


			}
			break;
			case "breakStrategy": {
				
if (Build.VERSION.SDK_INT >= 23) {

	appCompatCheckBox.setBreakStrategy((int)objValue);

}

			}
			break;
			case "drawablePadding": {
				


	appCompatCheckBox.setCompoundDrawablePadding((int)objValue);



			}
			break;
			case "elegantTextHeight": {
				
if (Build.VERSION.SDK_INT >= 21) {

	appCompatCheckBox.setElegantTextHeight((boolean)objValue);

}

			}
			break;
			case "ellipsize": {
				

objValue = getFinalValueForEllipsize(objValue);
	appCompatCheckBox.setEllipsize((android.text.TextUtils.TruncateAt)objValue);



			}
			break;
			case "ems": {
				


	appCompatCheckBox.setEms((int)objValue);



			}
			break;
			case "fallbackLineSpacing": {
				
if (Build.VERSION.SDK_INT >= 28) {

	appCompatCheckBox.setFallbackLineSpacing((boolean)objValue);

}

			}
			break;
			case "firstBaselineToTopHeight": {
				
if (Build.VERSION.SDK_INT >= 28) {

	appCompatCheckBox.setFirstBaselineToTopHeight((int)objValue);

}

			}
			break;
			case "fontFeatureSettings": {
				
if (Build.VERSION.SDK_INT >= 21) {

	appCompatCheckBox.setFontFeatureSettings((String)objValue);

}

			}
			break;
			case "gravity": {
				


	appCompatCheckBox.setGravity((int)objValue);



			}
			break;
			case "height": {
				


	appCompatCheckBox.setHeight((int)objValue);



			}
			break;
			case "hyphenationFrequency": {
				
if (Build.VERSION.SDK_INT >= 23) {

	appCompatCheckBox.setHyphenationFrequency((int)objValue);

}

			}
			break;
			case "includeFontPadding": {
				


	appCompatCheckBox.setIncludeFontPadding((boolean)objValue);



			}
			break;
			case "justificationMode": {
				
if (Build.VERSION.SDK_INT >= 26) {

	appCompatCheckBox.setJustificationMode((int)objValue);

}

			}
			break;
			case "lastBaselineToBottomHeight": {
				
if (Build.VERSION.SDK_INT >= 28) {

	appCompatCheckBox.setLastBaselineToBottomHeight((int)objValue);

}

			}
			break;
			case "letterSpacing": {
				
if (Build.VERSION.SDK_INT >= 21) {

	appCompatCheckBox.setLetterSpacing((float)objValue);

}

			}
			break;
			case "lineHeight": {
				
if (Build.VERSION.SDK_INT >= 28) {

	appCompatCheckBox.setLineHeight((int)objValue);

}

			}
			break;
			case "lineSpacingExtra": {
				


		appCompatCheckBox.setLineSpacing((float) objValue,appCompatCheckBox.getLineSpacingMultiplier());



			}
			break;
			case "lineSpacingMultiplier": {
				


		appCompatCheckBox.setLineSpacing(appCompatCheckBox.getLineSpacingExtra(),(float) objValue);



			}
			break;
			case "lines": {
				


	appCompatCheckBox.setLines((int)objValue);



			}
			break;
			case "marqueeRepeatLimit": {
				


	appCompatCheckBox.setMarqueeRepeatLimit((int)objValue);



			}
			break;
			case "maxEms": {
				


	appCompatCheckBox.setMaxEms((int)objValue);



			}
			break;
			case "maxHeight": {
				


	appCompatCheckBox.setMaxHeight((int)objValue);



			}
			break;
			case "maxLines": {
				


	appCompatCheckBox.setMaxLines((int)objValue);



			}
			break;
			case "maxWidth": {
				


	appCompatCheckBox.setMaxWidth((int)objValue);



			}
			break;
			case "minEms": {
				


	appCompatCheckBox.setMinEms((int)objValue);



			}
			break;
			case "minHeight": {
				


	appCompatCheckBox.setMinHeight((int)objValue);



			}
			break;
			case "minLines": {
				


	appCompatCheckBox.setMinLines((int)objValue);



			}
			break;
			case "minWidth": {
				


	appCompatCheckBox.setMinWidth((int)objValue);



			}
			break;
			case "scrollHorizontally": {
				


	appCompatCheckBox.setHorizontallyScrolling((boolean)objValue);



			}
			break;
			case "shadowColor": {
				


		appCompatCheckBox.setShadowLayer(appCompatCheckBox.getShadowRadius(),appCompatCheckBox.getShadowDx(),appCompatCheckBox.getShadowDy(),(int) objValue);



			}
			break;
			case "shadowDx": {
				


		appCompatCheckBox.setShadowLayer(appCompatCheckBox.getShadowRadius(),(float) objValue,appCompatCheckBox.getShadowDy(),appCompatCheckBox.getShadowColor());



			}
			break;
			case "shadowDy": {
				


		appCompatCheckBox.setShadowLayer(appCompatCheckBox.getShadowRadius(),appCompatCheckBox.getShadowDx(),(float) objValue,appCompatCheckBox.getShadowColor());



			}
			break;
			case "shadowRadius": {
				


		appCompatCheckBox.setShadowLayer((float) objValue,appCompatCheckBox.getShadowDx(),appCompatCheckBox.getShadowDy(),appCompatCheckBox.getShadowColor());



			}
			break;
			case "singleLine": {
				


	appCompatCheckBox.setSingleLine((boolean)objValue);



			}
			break;
			case "textAllCaps": {
				
if (Build.VERSION.SDK_INT >= 14) {

	appCompatCheckBox.setAllCaps((boolean)objValue);

}

			}
			break;
			case "textColor": {
				


	appCompatCheckBox.setTextColor((android.content.res.ColorStateList)objValue);



			}
			break;
			case "textColorHighlight": {
				


	appCompatCheckBox.setHighlightColor((int)objValue);



			}
			break;
			case "textColorLink": {
				


	appCompatCheckBox.setLinkTextColor((android.content.res.ColorStateList)objValue);



			}
			break;
			case "textIsSelectable": {
				
if (Build.VERSION.SDK_INT >= 11) {

	appCompatCheckBox.setTextIsSelectable((boolean)objValue);

}

			}
			break;
			case "textScaleX": {
				


	appCompatCheckBox.setTextScaleX((float)objValue);



			}
			break;
			case "width": {
				


	appCompatCheckBox.setWidth((int)objValue);



			}
			break;
			case "button": {
				


	appCompatCheckBox.setButtonDrawable((android.graphics.drawable.Drawable)objValue);



			}
			break;
			case "buttonTint": {
				
if (Build.VERSION.SDK_INT >= 21) {

	appCompatCheckBox.setButtonTintList((android.content.res.ColorStateList)objValue);

}

			}
			break;
			case "buttonTintMode": {
				
if (Build.VERSION.SDK_INT >= 21) {

	appCompatCheckBox.setButtonTintMode((android.graphics.PorterDuff.Mode)objValue);

}

			}
			break;
			case "onCheckedChange": {
				


		if (objValue instanceof String) {appCompatCheckBox.setOnCheckedChangeListener(new OnCheckedChangeListener(this, strValue));} else {setOnCheckedChangeListener(appCompatCheckBox, objValue);}



			}
			break;
			case "checked": {
				


		setChecked(objValue);



			}
			break;
			case "text": {
				


		setMyText(objValue);



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
			case "maxLength": {
				


		setMaxLength(objValue);



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
			case "systemTextAppearance": {
				


		TextViewCompat.setTextAppearance(appCompatCheckBox, (int)objValue);



			}
			break;
			case "textAppearance": {
				


		ViewImpl.setStyle(this, objValue);



			}
			break;
			case "enabled": {
				


		 appCompatCheckBox.setEnabled((boolean) objValue);



			}
			break;
			case "editable": {
				


		 appCompatCheckBox.setEnabled((boolean) objValue);



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
			case "padding": {
				


		//



			}
			break;
			case "paddingBottom": {
				


		//



			}
			break;
			case "paddingRight": {
				


		//



			}
			break;
			case "paddingLeft": {
				


		//



			}
			break;
			case "paddingStart": {
				


		//



			}
			break;
			case "paddingEnd": {
				


		//



			}
			break;
			case "paddingTop": {
				


		//



			}
			break;
			case "paddingHorizontal": {
				


		//



			}
			break;
			case "paddingVertical": {
				


		//



			}
			break;
			case "textFormat": {
				


		setTextFormat(objValue);



			}
			break;
			case "drawableIconSize": {
				


		setDrawableIconSize(objValue);



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
			case "autoLink": {
return appCompatCheckBox.getAutoLinkMask();				}
			case "breakStrategy": {
if (Build.VERSION.SDK_INT >= 23) {
return appCompatCheckBox.getBreakStrategy();
}
break;				}
			case "drawablePadding": {
return appCompatCheckBox.getCompoundDrawablePadding();				}
			case "elegantTextHeight": {
if (Build.VERSION.SDK_INT >= 28) {
return appCompatCheckBox.isElegantTextHeight();
}
break;				}
			case "ellipsize": {
return appCompatCheckBox.getEllipsize();				}
			case "fallbackLineSpacing": {
if (Build.VERSION.SDK_INT >= 28) {
return appCompatCheckBox.isFallbackLineSpacing();
}
break;				}
			case "firstBaselineToTopHeight": {
if (Build.VERSION.SDK_INT >= 28) {
return appCompatCheckBox.getFirstBaselineToTopHeight();
}
break;				}
			case "fontFeatureSettings": {
if (Build.VERSION.SDK_INT >= 21) {
return appCompatCheckBox.getFontFeatureSettings();
}
break;				}
			case "gravity": {
return appCompatCheckBox.getGravity();				}
			case "height": {
return appCompatCheckBox.getHeight();				}
			case "hyphenationFrequency": {
if (Build.VERSION.SDK_INT >= 23) {
return appCompatCheckBox.getHyphenationFrequency();
}
break;				}
			case "includeFontPadding": {
return appCompatCheckBox.getIncludeFontPadding();				}
			case "justificationMode": {
if (Build.VERSION.SDK_INT >= 26) {
return appCompatCheckBox.getJustificationMode();
}
break;				}
			case "lastBaselineToBottomHeight": {
if (Build.VERSION.SDK_INT >= 28) {
return appCompatCheckBox.getLastBaselineToBottomHeight();
}
break;				}
			case "letterSpacing": {
if (Build.VERSION.SDK_INT >= 21) {
return appCompatCheckBox.getLetterSpacing();
}
break;				}
			case "lineHeight": {
return appCompatCheckBox.getLineHeight();				}
			case "lineSpacingExtra": {
return appCompatCheckBox.getLineSpacingExtra();				}
			case "lineSpacingMultiplier": {
return appCompatCheckBox.getLineSpacingMultiplier();				}
			case "marqueeRepeatLimit": {
return appCompatCheckBox.getMarqueeRepeatLimit();				}
			case "maxEms": {
return appCompatCheckBox.getMaxEms();				}
			case "maxHeight": {
return appCompatCheckBox.getMaxHeight();				}
			case "maxLines": {
return appCompatCheckBox.getMaxLines();				}
			case "maxWidth": {
return appCompatCheckBox.getMaxWidth();				}
			case "minEms": {
return appCompatCheckBox.getMinEms();				}
			case "minHeight": {
return appCompatCheckBox.getMinHeight();				}
			case "minLines": {
return appCompatCheckBox.getMinLines();				}
			case "minWidth": {
return appCompatCheckBox.getMinWidth();				}
			case "shadowColor": {
return appCompatCheckBox.getShadowColor();				}
			case "shadowDx": {
return appCompatCheckBox.getShadowDx();				}
			case "shadowDy": {
return appCompatCheckBox.getShadowDy();				}
			case "shadowRadius": {
return appCompatCheckBox.getShadowRadius();				}
			case "textAllCaps": {
if (Build.VERSION.SDK_INT >= 28) {
return appCompatCheckBox.isAllCaps();
}
break;				}
			case "textColor": {
return appCompatCheckBox.getTextColors();				}
			case "textColorHighlight": {
if (Build.VERSION.SDK_INT >= 16) {
return appCompatCheckBox.getHighlightColor();
}
break;				}
			case "textIsSelectable": {
return appCompatCheckBox.isTextSelectable();				}
			case "textScaleX": {
return appCompatCheckBox.getTextScaleX();				}
			case "width": {
return appCompatCheckBox.getWidth();				}
			case "button": {
if (Build.VERSION.SDK_INT >= 23) {
return appCompatCheckBox.getButtonDrawable();
}
break;				}
			case "buttonTint": {
if (Build.VERSION.SDK_INT >= 21) {
return appCompatCheckBox.getButtonTintList();
}
break;				}
			case "buttonTintMode": {
if (Build.VERSION.SDK_INT >= 21) {
return appCompatCheckBox.getButtonTintMode();
}
break;				}
			case "checked": {
return getChecked();				}
			case "text": {
return getMyText();				}
			case "textSize": {
return appCompatCheckBox.getTextSize();				}
			case "paddingBottom": {
return null;				}
			case "paddingRight": {
return null;				}
			case "paddingLeft": {
return null;				}
			case "paddingStart": {
return null;				}
			case "paddingEnd": {
return null;				}
			case "paddingTop": {
return null;				}
		}
		
		return null;
	}
	
	@Override
	public Object asWidget() {
		return appCompatCheckBox;
	}

	


	private String getMyText() {
	    if (appCompatCheckBox.getText() != null) {
	        return appCompatCheckBox.getText().toString();
	    }
	    return "";
    }

	private boolean html;
	private void nativeCreate(Map<String, Object> params) {
		registerForAttributeCommandChain("text");
		if (params.containsKey("html")) {
			html = params.get("html").equals("true");
		}
	}

	@Override
	public java.lang.Object asNativeWidget() {
		return appCompatCheckBox;
	}
	public void setMyText(Object text) {
		if (html) {
			appCompatCheckBox.setText((SpannableString) com.ashera.parser.html.Html.fromHtml((String) text, null, fragment).get());	
		} else {
			appCompatCheckBox.setText((String) text);	
		}
	}
	//start - textsize
	private void setMyTextSize(Object objValue) {
		appCompatCheckBox.setTextSize(android.util.TypedValue.COMPLEX_UNIT_PX, getFragment().getRootActivity().getScaleFactor() * (float)objValue);		
	}
	//end - textsize
	
	//start - drawable
	private int iconSize = -1;
	private void setDrawableLeft(Object objValue) {
		android.graphics.drawable.Drawable[] drawables = appCompatCheckBox.getCompoundDrawables();
		setBoundsOfDrawable(objValue);
		TextViewCompat.setCompoundDrawablesRelative(appCompatCheckBox, (android.graphics.drawable.Drawable) objValue, drawables[1], drawables[2], drawables[3]);		
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
			android.graphics.drawable.Drawable[] drawables = appCompatCheckBox.getCompoundDrawablesRelative();
			for (android.graphics.drawable.Drawable drawable : drawables) {
				if (drawable != null) {
					setBoundsOfDrawable(drawable);
				}
			}
			TextViewCompat.setCompoundDrawablesRelative(appCompatCheckBox, drawables[0], drawables[1], drawables[2], drawables[3]);
		}
	}
	
	private void setDrawableRight(Object objValue) {
		android.graphics.drawable.Drawable[] drawables = appCompatCheckBox.getCompoundDrawables();
		setBoundsOfDrawable(objValue);
		TextViewCompat.setCompoundDrawablesRelative(appCompatCheckBox, drawables[0], drawables[1], (android.graphics.drawable.Drawable) objValue, drawables[3]);
		
	}
	private void setDrawableTop(Object objValue) {
		setBoundsOfDrawable(objValue);
		android.graphics.drawable.Drawable[] drawables = appCompatCheckBox.getCompoundDrawables();
		TextViewCompat.setCompoundDrawablesRelative(appCompatCheckBox, drawables[0], (android.graphics.drawable.Drawable) objValue, drawables[2], drawables[3]);
		
	}
	
	private void setDrawableBottom(Object objValue) {
		setBoundsOfDrawable(objValue);
		android.graphics.drawable.Drawable[] drawables = appCompatCheckBox.getCompoundDrawables();
		TextViewCompat.setCompoundDrawablesRelative(appCompatCheckBox, drawables[0], drawables[1], drawables[2], (android.graphics.drawable.Drawable) objValue);
		
	}
	
	private android.graphics.drawable.Drawable tintDrawableCompat;
	private void setDrawableTintMode(Object objValue) {
		if (Build.VERSION.SDK_INT >= 23) {
			appCompatCheckBox.setCompoundDrawableTintMode((android.graphics.PorterDuff.Mode) objValue);
		} else {
			android.graphics.drawable.Drawable[] drawables = appCompatCheckBox.getCompoundDrawablesRelative();
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
						appCompatCheckBox.invalidate();
					}
				}
			}
		}
	}

	private void setDrawableTintList(Object objValue) {
		if (Build.VERSION.SDK_INT >= 23) {
			appCompatCheckBox.setCompoundDrawableTintList((android.content.res.ColorStateList) objValue);
		} else {
			android.graphics.drawable.Drawable[] drawables = appCompatCheckBox.getCompoundDrawablesRelative();
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
						appCompatCheckBox.invalidate();
					}					
				}
			}
		}
	}
	//end - drawable
	
	//start - font
	private void setFontFamily(Object objValue, String strValue) {
		setTypeFace(objValue, strValue);
	}

	private void setTextStyle(Object objValue) {
		android.graphics.Typeface typeface  = appCompatCheckBox.getTypeface();
		if (typeface == null) {
			typeface = android.graphics.Typeface.DEFAULT;
		} else {
			typeface = android.graphics.Typeface.create(typeface, (int) objValue);
        }
		
		appCompatCheckBox.setTypeface(typeface, (int) objValue);
	}

	private void setTypeFace(Object objValue, String strValue) {
		if (objValue instanceof Integer) {
			objValue = PluginInvoker.convertFrom(ConverterFactory.get(CommonConverters.font), null, strValue, fragment);
		}
		android.graphics.Typeface typeface = appCompatCheckBox.getTypeface();
		if (typeface != null) {
			appCompatCheckBox.setTypeface((android.graphics.Typeface) objValue, typeface.getStyle());
		} else {
			appCompatCheckBox.setTypeface((android.graphics.Typeface) objValue);
		}
	}
	//end - font
	
	private void setMaxLength(Object objValue) {
		int maxlength = (int) objValue;
		removeMaxLengthFilter();
		if (maxlength >= 0) {
			android.text.InputFilter[] filtersArr = appCompatCheckBox.getFilters();
			List<android.text.InputFilter> filters = new java.util.ArrayList<>(java.util.Arrays.asList(filtersArr));			
			filters.add(new android.text.InputFilter.LengthFilter(maxlength));
			appCompatCheckBox.setFilters(filters.toArray(new android.text.InputFilter[0]));
        }
		
	}
	
	private void removeMaxLengthFilter() {
		android.text.InputFilter[] filtersArr = appCompatCheckBox.getFilters();
		if (filtersArr == null) {
			filtersArr = new android.text.InputFilter[0];
		}
		List<android.text.InputFilter> filters = new java.util.ArrayList<>(java.util.Arrays.asList(filtersArr));
		for (java.util.Iterator<android.text.InputFilter> iterator = filters.iterator(); iterator.hasNext();) {
			android.text.InputFilter inputFilter = iterator.next();
			if (inputFilter instanceof android.text.InputFilter.LengthFilter) {
				iterator.remove();
			}
			
		}
		appCompatCheckBox.setFilters(filters.toArray(new android.text.InputFilter[0]));
	}


	
	private void setPasswordType(Object objValue) {
		if (objValue != null && (boolean) objValue) {
			appCompatCheckBox.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
			appCompatCheckBox.setTypeface(android.graphics.Typeface.MONOSPACE);
		} else {
			appCompatCheckBox.setTransformationMethod(null);
			appCompatCheckBox.setTypeface(null);
		}
	}


	private void setAutoCap(int autocap, boolean autotext) {
		android.text.method.TextKeyListener.Capitalize cap;
		int inputType = android.view.inputmethod.EditorInfo.TYPE_CLASS_TEXT;
        switch (autocap) {
        case 1:
            cap = android.text.method.TextKeyListener.Capitalize.SENTENCES;
            inputType |= android.view.inputmethod.EditorInfo.TYPE_TEXT_FLAG_CAP_SENTENCES;
            break;
        case 2:
            cap = android.text.method.TextKeyListener.Capitalize.WORDS;
            inputType |= android.view.inputmethod.EditorInfo.TYPE_TEXT_FLAG_CAP_WORDS;
            break;
        case 3:
            cap = android.text.method.TextKeyListener.Capitalize.CHARACTERS;
            inputType |= android.view.inputmethod.EditorInfo.TYPE_TEXT_FLAG_CAP_CHARACTERS;
            break;
        default:
            cap = android.text.method.TextKeyListener.Capitalize.NONE;
            break;
        }
        appCompatCheckBox.setKeyListener(android.text.method.TextKeyListener.getInstance(autotext, cap));
        appCompatCheckBox.setInputType(inputType);
	}

	private void setAutoText(Object objValue) {
		storeUserData("autotext", objValue);
		boolean autotext = (boolean) objValue;
		int autocap = getUserData("capitalize") != null ? (int) getUserData("capitalize") : 0;
		setAutoCap(autocap, autotext);
		
	}
	
	//start - autosize
    private int autoSizeMin = -1;
    private int autoSizeMax = -1;
    private int autoSizeGranular = -1;
    
	
	private void setAutoSizeStepGranularity(Object objValue) {
		autoSizeGranular = (int) objValue;
		
		if (isInitialised()) {
			setAutoSizeTextTypeInternal( getAutoSizeTextType(appCompatCheckBox));
		}
	}

	private void setAutoMinTextSize(Object objValue) {
		autoSizeMin = (int) objValue;
		
		if (isInitialised()) {
			setAutoSizeTextTypeInternal( getAutoSizeTextType(appCompatCheckBox));
		}
	}

	private void setAutoMaxTextSize(Object objValue) {
		autoSizeMax = (int) objValue;
		
		if (isInitialised()) {
			setAutoSizeTextTypeInternal( getAutoSizeTextType(appCompatCheckBox));
		}
	}
	
    
    private void setAutoSizeTextType(Object objValue) {
    	int autoTextType = (int)objValue;
    	setAutoSizeTextTypeInternal(autoTextType);
    }

	private Object getAutoSizeStepGranularity() {
		return autoSizeGranular;
	}

	private Object getAutoMinTextSize() {
		return autoSizeMin;
	}

	private Object getAutoMaxTextSize() {
		return autoSizeMax;
	}

	private Object getAutoSizeTextType() {
		return getAutoSizeTextType(appCompatCheckBox);
	}
	//end - autosize

	private int getAutoSizeTextType(TextView appCompatCheckBox) {
		return TextViewCompat.getAutoSizeTextType(appCompatCheckBox);
	}

	private void setAutoSizeTextTypeInternal(int autoTextType) {
		TextViewCompat.setAutoSizeTextTypeWithDefaults(appCompatCheckBox, autoTextType);
		
		if (autoTextType == 1) {
			int autoSizeMinTextSize = autoSizeMin == -1 ? TextViewCompat.getAutoSizeMinTextSize(appCompatCheckBox) : autoSizeMin;
			int autoSizeMaxTextSize = autoSizeMax == -1 ? TextViewCompat.getAutoSizeMaxTextSize(appCompatCheckBox) : autoSizeMax;
			int autoSizeStepGranularity = autoSizeGranular == -1 ? TextViewCompat.getAutoSizeStepGranularity(appCompatCheckBox) : autoSizeGranular;
			TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(appCompatCheckBox, 
					autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, 
					android.util.TypedValue.COMPLEX_UNIT_PX);
        }
	}
	
	   
    private void setLinksClickable(Object objValue) {
        if (objValue != null && (boolean) objValue) {
            appCompatCheckBox.setLinksClickable(true);
            
            if (isInitialised()) {
                appCompatCheckBox.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());    
            }
        } else {
            appCompatCheckBox.setLinksClickable(false);
            
            if (isInitialised()) {
                if (appCompatCheckBox.getMovementMethod() instanceof android.text.method.LinkMovementMethod) {
                    appCompatCheckBox.setMovementMethod(null);
                }    
            }
        }
    }

	
	private void startOrStopMarquee(Object objValue) {
		appCompatCheckBox.setSelected((boolean) objValue); 
		
	}

	
	private void setTextAligmentHack(Object objValue) {
		if (isInitialised()) {
			setFieldUsingReflection(appCompatCheckBox, "mLayout", null);
		}
	}
	

	private void resetText() {
		if (isInitialised()) {
			appCompatCheckBox.setText(appCompatCheckBox.getText());
		}
	}
	

	
	private Object getFinalValueForEllipsize(Object objValue) {
		if ("@null".equals(objValue)) {
			return null;
		}
		
		if (objValue == android.text.TextUtils.TruncateAt.MARQUEE) {
			appCompatCheckBox.setSelected(true); 
		}
		return objValue;
	}	

	private void setAutoSizePresetSizes(Object objValue) {
		TextViewCompat.setAutoSizeTextTypeUniformWithPresetSizes(appCompatCheckBox, (int[]) objValue, android.util.TypedValue.COMPLEX_UNIT_PX);
	}
	
	
	private void postSetAttribute(WidgetAttribute key, String strValue, Object objValue,
			ILifeCycleDecorator decorator) {
		switch (key.getAttributeName()) {
			case "textAlignment": {
				setTextAligmentHack(objValue);
			}
			break;
		}
	}

	
	private void removeaddTextChangedListenerIfNeeded(String action) {
		if (isInitialised()) {
			List listeners = (List) getFieldValueUsingReflection(appCompatCheckBox, "mListeners");
			if (listeners != null) {
				for (Object listener : listeners) {
					if (listener instanceof IListener && action.equals(((IListener)listener).getAction())) {
						appCompatCheckBox.removeTextChangedListener((TextWatcher) listener);
					}
				}
			}
		}
	}

	//start - textFormat
	private void setTextFormat(Object objValue) {
		applyAttributeCommand("text", CommonConverters.command_textformatter, new String[] {"textFormat"}, true, (String) objValue);
	}
	//end - textFormat
	


	@Override
	public boolean isViewVisible() {
		return appCompatCheckBox.getVisibility() == View.VISIBLE;
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
		appCompatCheckBox.requestFocus();
	}
	


	public void setError(String mesage) {
		appCompatCheckBox.setError(mesage);
	}
	

	@SuppressLint("NewApi")
private static class TextChangedListener implements TextWatcher, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public TextChangedListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public TextChangedListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void afterTextChanged (Editable s){
    
	if (action == null || action.equals("onafterTextChange")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onafterTextChange");
	    java.util.Map<String, Object> obj = getOnafterTextChangeEventObj(s);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, s);
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
public void beforeTextChanged (CharSequence s, 
                int start, 
                int count, 
                int after){
    
	if (action == null || action.equals("onbeforeTextChange")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onbeforeTextChange");
	    java.util.Map<String, Object> obj = getOnbeforeTextChangeEventObj(s,start,count,after);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, s,start,count,after);
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
public void onTextChanged (CharSequence s, 
                int start, 
                int before, 
                int count){
    
	if (action == null || action.equals("onTextChange")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onTextChange");
	    java.util.Map<String, Object> obj = getOnTextChangeEventObj(s,start,before,count);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, s,start,before,count);
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

public java.util.Map<String, Object> getOnTextChangeEventObj(CharSequence s,int start,int before,int count) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "textchange");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "s", String.valueOf(s));
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "start", start);
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "before", before);
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "count", count);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onTextChange", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}

public java.util.Map<String, Object> getOnbeforeTextChangeEventObj(CharSequence s,int start,int count,int after) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "beforetextchange");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "s", String.valueOf(s));
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "start", start);
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "count", count);
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "after", after);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onbeforeTextChange", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}

public java.util.Map<String, Object> getOnafterTextChangeEventObj(Editable s) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "aftertextchange");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onafterTextChange", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnCheckedChangeListener implements CompoundButton.OnCheckedChangeListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnCheckedChangeListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnCheckedChangeListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onCheckedChanged (CompoundButton buttonView, 
                boolean isChecked){
    
	if (action == null || action.equals("onCheckedChange")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onCheckedChange");
	    java.util.Map<String, Object> obj = getOnCheckedChangeEventObj(buttonView,isChecked);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, buttonView,isChecked);
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

public java.util.Map<String, Object> getOnCheckedChangeEventObj(CompoundButton buttonView,boolean isChecked) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "checkedchange");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "isChecked", isChecked);
    
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
			appCompatCheckBox.setId((int) quickConvert(id, "id"));
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
    private void setChecked(Object objValue) {
        appCompatCheckBox.setChecked(PluginInvoker.getBoolean(objValue));
    }
    private Object getChecked() {
        return appCompatCheckBox.isChecked();
    }

	@Override
	public String getTextEntered() {
		return appCompatCheckBox.isChecked() ? "checked" : "";
	}


	
	private void setOnCheckedChangeListener(androidx.appcompat.widget.AppCompatCheckBox appCompatCheckBox, Object objValue) {
		appCompatCheckBox.setOnCheckedChangeListener((androidx.appcompat.widget.AppCompatCheckBox.OnCheckedChangeListener) objValue);
	}
}
