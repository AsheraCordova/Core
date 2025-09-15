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
public class AutoCompleteTextViewImpl extends BaseHasWidgets implements com.ashera.validations.FormElement{
	//start - body
	public final static String LOCAL_NAME = "AutoCompleteTextView"; 
	public final static String GROUP_NAME = "AutoCompleteTextView";

	protected androidx.appcompat.widget.AppCompatAutoCompleteTextView appCompatAutoCompleteTextView;
	
		@SuppressLint("NewApi")
		final static class ImeOptions  extends AbstractBitFlagConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("actionDone", 0x6);
				mapping.put("actionGo", 0x2);
				mapping.put("actionNext", 0x5);
				mapping.put("actionNone", 0x1);
				mapping.put("actionPrevious", 0x7);
				mapping.put("actionSearch", 0x3);
				mapping.put("actionSend", 0x4);
				mapping.put("actionUnspecified", 0x0);
				mapping.put("flagForceAscii", 0x80000000);
				mapping.put("flagNavigateNext", 0x8000000);
				mapping.put("flagNavigatePrevious", 0x4000000);
				mapping.put("flagNoAccessoryAction", 0x20000000);
				mapping.put("flagNoEnterAction", 0x40000000);
				mapping.put("flagNoExtractUi", 0x10000000);
				mapping.put("flagNoFullscreen", 0x2000000);
				mapping.put("flagNoPersonalizedLearning", 0x1000000);
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
		final static class InputType  extends AbstractBitFlagConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("date", 0x14);
				mapping.put("datetime", 0x4);
				mapping.put("none", 0x0);
				mapping.put("number", 0x2);
				mapping.put("numberDecimal", 0x2002);
				mapping.put("numberPassword", 0x12);
				mapping.put("numberSigned", 0x1002);
				mapping.put("phone", 0x3);
				mapping.put("text", 0x1);
				mapping.put("textAutoComplete", 0x10001);
				mapping.put("textAutoCorrect", 0x8001);
				mapping.put("textCapCharacters", 0x1001);
				mapping.put("textCapSentences", 0x4001);
				mapping.put("textCapWords", 0x2001);
				mapping.put("textEmailAddress", 0x21);
				mapping.put("textEmailSubject", 0x31);
				mapping.put("textFilter", 0xb1);
				mapping.put("textImeMultiLine", 0x40001);
				mapping.put("textLongMessage", 0x51);
				mapping.put("textMultiLine", 0x20001);
				mapping.put("textNoSuggestions", 0x80001);
				mapping.put("textPassword", 0x81);
				mapping.put("textPersonName", 0x61);
				mapping.put("textPhonetic", 0xc1);
				mapping.put("textPostalAddress", 0x71);
				mapping.put("textShortMessage", 0x41);
				mapping.put("textUri", 0x11);
				mapping.put("textVisiblePassword", 0x91);
				mapping.put("textWebEditText", 0xa1);
				mapping.put("textWebEmailAddress", 0xd1);
				mapping.put("textWebPassword", 0xe1);
				mapping.put("time", 0x24);
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
		final static class Capitalize extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("characters",  0x3);
				mapping.put("none",  0x0);
				mapping.put("sentences",  0x1);
				mapping.put("words",  0x2);
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
		final static class Numeric  extends AbstractBitFlagConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("decimal", 0x5);
				mapping.put("integer", 0x1);
				mapping.put("signed", 0x3);
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


		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("cursorVisible").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawablePadding").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("elegantTextHeight").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("ems").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("fallbackLineSpacing").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("firstBaselineToTopHeight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("freezesText").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("gravity").withType("gravity"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("height").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hint").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("imeActionId").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("imeActionLabel").withType("resourcestring"));
		ConverterFactory.register("AutoCompleteTextView.imeOptions", new ImeOptions());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("imeOptions").withType("AutoCompleteTextView.imeOptions"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("includeFontPadding").withType("boolean"));
		ConverterFactory.register("AutoCompleteTextView.inputType", new InputType());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("inputType").withType("AutoCompleteTextView.inputType"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lastBaselineToBottomHeight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("letterSpacing").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lineHeight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lineSpacingExtra").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lineSpacingMultiplier").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lines").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxEms").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxHeight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxLines").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxWidth").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minEms").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minHeight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minLines").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minWidth").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("privateImeOptions").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scrollHorizontally").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("selectAllOnFocus").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("shadowColor").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("shadowDx").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("shadowDy").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("shadowRadius").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("singleLine").withType("boolean").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textColorHighlight").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textColorHint").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textIsSelectable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textScaleX").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("width").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onafterTextChange").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onbeforeTextChange").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onTextChange").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onEditorAction").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("completionHint").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("completionHintView").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("completionThreshold").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("dropDownAnchor").withType("id"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("dropDownHeight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("dropDownHorizontalOffset").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("dropDownSelector").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("dropDownVerticalOffset").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("dropDownWidth").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("popupBackground").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onDismiss").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("listSelection").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("entries").withType("array").withArrayType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("listitem").withType("template"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("showDropDown").withType("boolean"));
		ConverterFactory.register("AutoCompleteTextView.capitalize", new Capitalize());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("capitalize").withType("AutoCompleteTextView.capitalize"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("phoneNumber").withType("boolean"));
		ConverterFactory.register("AutoCompleteTextView.numeric", new Numeric());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("numeric").withType("AutoCompleteTextView.numeric"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("digits").withType("string").withOrder(10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("editorExtras").withType("xmlresource"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("autoText").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textAllCaps").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("setFocus").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("selectAll").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hintTextFormat").withType("resourcestring").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("text").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textSize").withType("dimensionsp"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableStart").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableEnd").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTop").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableBottom").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxLength").withType("int"));
		ConverterFactory.register("AutoCompleteTextView.font", new Font());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("typeface").withType("AutoCompleteTextView.font"));
		ConverterFactory.register("AutoCompleteTextView.textStyle", new TextStyle());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textStyle").withType("AutoCompleteTextView.textStyle"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("fontFamily").withType("font"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("systemTextAppearance").withType("style"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textAppearance").withType("string").withStylePriority(1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("password").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("enabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("editable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTint").withType("colorstate"));
		ConverterFactory.register("AutoCompleteTextView.drawableTintMode", new DrawableTintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTintMode").withType("AutoCompleteTextView.drawableTintMode"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("padding").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingBottom").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingRight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingLeft").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingStart").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingEnd").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingTop").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingHorizontal").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingVertical").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableIconSize").withType("dimension").withOrder(-1));
	WidgetFactory.registerConstructorAttribute(localName, new WidgetAttribute.Builder().withName("html").withType("boolean"));
	}
	
	public AutoCompleteTextViewImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  AutoCompleteTextViewImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  AutoCompleteTextViewImpl(String groupName, String localname) {
		super(groupName, localname);
	}

		
	public class AutoCompleteTextViewExt extends androidx.appcompat.widget.AppCompatAutoCompleteTextView implements ILifeCycleDecorator{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		
		public IWidget getWidget() {
			return AutoCompleteTextViewImpl.this;
		}

		public AutoCompleteTextViewExt(Context context, android.util.AttributeSet attrs, int defStyleAttr) {
	        super(context, attrs, defStyleAttr);
	    }

		public AutoCompleteTextViewExt(Context context) {
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
				AutoCompleteTextViewImpl.this.invalidate();
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
        		ViewImpl.drawableStateChanged(AutoCompleteTextViewImpl.this);
        	}
        }
        
    	public void setState0(float value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 0, value);
    	}
    	public void setState0(int value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 0, value);
    	}
    	public void setState0(double value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 0, value);
    	}
    	
    	public void setState0(Float value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 0, value);
    	}
    	public void setState0(Integer value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 0, value);
    	}
    	public void setState0(Double value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 0, value);
    	}
    	public void setState0(Object value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 0, value);
    	}
    	public void setState1(float value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 1, value);
    	}
    	public void setState1(int value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 1, value);
    	}
    	public void setState1(double value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 1, value);
    	}
    	
    	public void setState1(Float value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 1, value);
    	}
    	public void setState1(Integer value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 1, value);
    	}
    	public void setState1(Double value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 1, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 1, value);
    	}
    	public void setState2(float value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 2, value);
    	}
    	public void setState2(int value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 2, value);
    	}
    	public void setState2(double value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 2, value);
    	}
    	
    	public void setState2(Float value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 2, value);
    	}
    	public void setState2(Integer value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 2, value);
    	}
    	public void setState2(Double value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 2, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 2, value);
    	}
    	public void setState3(float value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 3, value);
    	}
    	public void setState3(int value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 3, value);
    	}
    	public void setState3(double value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 3, value);
    	}
    	
    	public void setState3(Float value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 3, value);
    	}
    	public void setState3(Integer value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 3, value);
    	}
    	public void setState3(Double value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 3, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 3, value);
    	}
    	public void setState4(float value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 4, value);
    	}
    	public void setState4(int value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 4, value);
    	}
    	public void setState4(double value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 4, value);
    	}
    	
    	public void setState4(Float value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 4, value);
    	}
    	public void setState4(Integer value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 4, value);
    	}
    	public void setState4(Double value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 4, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(AutoCompleteTextViewImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(AutoCompleteTextViewImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(AutoCompleteTextViewImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(AutoCompleteTextViewImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(AutoCompleteTextViewImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(AutoCompleteTextViewImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(AutoCompleteTextViewImpl.this);
        }
     
	
	}	@Override
	public Class getViewClass() {
		return AutoCompleteTextViewExt.class;
	}

	@Override
	public IWidget newInstance() {
		return new AutoCompleteTextViewImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
Context context = (Context) fragment.getRootActivity();
	Object systemStyle = params.get("systemStyle");
	Object systemAndroidAttrStyle = params.get("systemAndroidAttrStyle");
	
	if (systemStyle == null && systemAndroidAttrStyle == null) {
		appCompatAutoCompleteTextView = new AutoCompleteTextViewExt(context);
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
			appCompatAutoCompleteTextView = new AutoCompleteTextViewExt(context, null, defStyleAttr);	
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
		ViewGroupModelImpl.setAttribute(this,  key, strValue, objValue, decorator);
		
		switch (key.getAttributeName()) {
			case "cursorVisible": {
				


	appCompatAutoCompleteTextView.setCursorVisible((boolean)objValue);



			}
			break;
			case "drawablePadding": {
				


	appCompatAutoCompleteTextView.setCompoundDrawablePadding((int)objValue);



			}
			break;
			case "elegantTextHeight": {
				
if (Build.VERSION.SDK_INT >= 21) {

	appCompatAutoCompleteTextView.setElegantTextHeight((boolean)objValue);

}

			}
			break;
			case "ems": {
				


	appCompatAutoCompleteTextView.setEms((int)objValue);



			}
			break;
			case "fallbackLineSpacing": {
				
if (Build.VERSION.SDK_INT >= 28) {

	appCompatAutoCompleteTextView.setFallbackLineSpacing((boolean)objValue);

}

			}
			break;
			case "firstBaselineToTopHeight": {
				
if (Build.VERSION.SDK_INT >= 28) {

	appCompatAutoCompleteTextView.setFirstBaselineToTopHeight((int)objValue);

}

			}
			break;
			case "freezesText": {
				


	appCompatAutoCompleteTextView.setFreezesText((boolean)objValue);



			}
			break;
			case "gravity": {
				


	appCompatAutoCompleteTextView.setGravity((int)objValue);



			}
			break;
			case "height": {
				


	appCompatAutoCompleteTextView.setHeight((int)objValue);



			}
			break;
			case "hint": {
				


	appCompatAutoCompleteTextView.setHint((String)objValue);



			}
			break;
			case "imeActionId": {
				


		appCompatAutoCompleteTextView.setImeActionLabel(appCompatAutoCompleteTextView.getImeActionLabel(),(int) objValue);



			}
			break;
			case "imeActionLabel": {
				


		appCompatAutoCompleteTextView.setImeActionLabel((CharSequence) objValue,appCompatAutoCompleteTextView.getImeActionId());



			}
			break;
			case "imeOptions": {
				


	appCompatAutoCompleteTextView.setImeOptions((int)objValue);



			}
			break;
			case "includeFontPadding": {
				


	appCompatAutoCompleteTextView.setIncludeFontPadding((boolean)objValue);



			}
			break;
			case "inputType": {
				


	appCompatAutoCompleteTextView.setRawInputType((int)objValue);



			}
			break;
			case "lastBaselineToBottomHeight": {
				
if (Build.VERSION.SDK_INT >= 28) {

	appCompatAutoCompleteTextView.setLastBaselineToBottomHeight((int)objValue);

}

			}
			break;
			case "letterSpacing": {
				
if (Build.VERSION.SDK_INT >= 21) {

	appCompatAutoCompleteTextView.setLetterSpacing((float)objValue);

}

			}
			break;
			case "lineHeight": {
				
if (Build.VERSION.SDK_INT >= 28) {

	appCompatAutoCompleteTextView.setLineHeight((int)objValue);

}

			}
			break;
			case "lineSpacingExtra": {
				


		appCompatAutoCompleteTextView.setLineSpacing((float) objValue,appCompatAutoCompleteTextView.getLineSpacingMultiplier());



			}
			break;
			case "lineSpacingMultiplier": {
				


		appCompatAutoCompleteTextView.setLineSpacing(appCompatAutoCompleteTextView.getLineSpacingExtra(),(float) objValue);



			}
			break;
			case "lines": {
				


	appCompatAutoCompleteTextView.setLines((int)objValue);



			}
			break;
			case "maxEms": {
				


	appCompatAutoCompleteTextView.setMaxEms((int)objValue);



			}
			break;
			case "maxHeight": {
				


	appCompatAutoCompleteTextView.setMaxHeight((int)objValue);



			}
			break;
			case "maxLines": {
				


	appCompatAutoCompleteTextView.setMaxLines((int)objValue);



			}
			break;
			case "maxWidth": {
				


	appCompatAutoCompleteTextView.setMaxWidth((int)objValue);



			}
			break;
			case "minEms": {
				


	appCompatAutoCompleteTextView.setMinEms((int)objValue);



			}
			break;
			case "minHeight": {
				


	appCompatAutoCompleteTextView.setMinHeight((int)objValue);



			}
			break;
			case "minLines": {
				


	appCompatAutoCompleteTextView.setMinLines((int)objValue);



			}
			break;
			case "minWidth": {
				


	appCompatAutoCompleteTextView.setMinWidth((int)objValue);



			}
			break;
			case "privateImeOptions": {
				


	appCompatAutoCompleteTextView.setPrivateImeOptions((String)objValue);



			}
			break;
			case "scrollHorizontally": {
				


	appCompatAutoCompleteTextView.setHorizontallyScrolling((boolean)objValue);



			}
			break;
			case "selectAllOnFocus": {
				


	appCompatAutoCompleteTextView.setSelectAllOnFocus((boolean)objValue);



			}
			break;
			case "shadowColor": {
				


		appCompatAutoCompleteTextView.setShadowLayer(appCompatAutoCompleteTextView.getShadowRadius(),appCompatAutoCompleteTextView.getShadowDx(),appCompatAutoCompleteTextView.getShadowDy(),(int) objValue);



			}
			break;
			case "shadowDx": {
				


		appCompatAutoCompleteTextView.setShadowLayer(appCompatAutoCompleteTextView.getShadowRadius(),(float) objValue,appCompatAutoCompleteTextView.getShadowDy(),appCompatAutoCompleteTextView.getShadowColor());



			}
			break;
			case "shadowDy": {
				


		appCompatAutoCompleteTextView.setShadowLayer(appCompatAutoCompleteTextView.getShadowRadius(),appCompatAutoCompleteTextView.getShadowDx(),(float) objValue,appCompatAutoCompleteTextView.getShadowColor());



			}
			break;
			case "shadowRadius": {
				


		appCompatAutoCompleteTextView.setShadowLayer((float) objValue,appCompatAutoCompleteTextView.getShadowDx(),appCompatAutoCompleteTextView.getShadowDy(),appCompatAutoCompleteTextView.getShadowColor());



			}
			break;
			case "singleLine": {
				


	appCompatAutoCompleteTextView.setSingleLine((boolean)objValue);



			}
			break;
			case "textColor": {
				


	appCompatAutoCompleteTextView.setTextColor((android.content.res.ColorStateList)objValue);



			}
			break;
			case "textColorHighlight": {
				


	appCompatAutoCompleteTextView.setHighlightColor((int)objValue);



			}
			break;
			case "textColorHint": {
				


	appCompatAutoCompleteTextView.setHintTextColor((android.content.res.ColorStateList)objValue);



			}
			break;
			case "textIsSelectable": {
				
if (Build.VERSION.SDK_INT >= 11) {

	appCompatAutoCompleteTextView.setTextIsSelectable((boolean)objValue);

}

			}
			break;
			case "textScaleX": {
				


	appCompatAutoCompleteTextView.setTextScaleX((float)objValue);



			}
			break;
			case "width": {
				


	appCompatAutoCompleteTextView.setWidth((int)objValue);



			}
			break;
			case "onafterTextChange": {
				


		removeaddTextChangedListenerIfNeeded("onafterTextChange");if (objValue instanceof String) {appCompatAutoCompleteTextView.addTextChangedListener(new TextChangedListener(this, strValue, "onafterTextChange"));} else {addTextChangedListener(appCompatAutoCompleteTextView, objValue);}



			}
			break;
			case "onbeforeTextChange": {
				


		removeaddTextChangedListenerIfNeeded("onbeforeTextChange");if (objValue instanceof String) {appCompatAutoCompleteTextView.addTextChangedListener(new TextChangedListener(this, strValue, "onbeforeTextChange"));} else {addTextChangedListener(appCompatAutoCompleteTextView, objValue);}



			}
			break;
			case "onTextChange": {
				


		removeaddTextChangedListenerIfNeeded("onTextChange");if (objValue instanceof String) {appCompatAutoCompleteTextView.addTextChangedListener(new TextChangedListener(this, strValue, "onTextChange"));} else {addTextChangedListener(appCompatAutoCompleteTextView, objValue);}



			}
			break;
			case "onEditorAction": {
				


		if (objValue instanceof String) {appCompatAutoCompleteTextView.setOnEditorActionListener(new OnEditorActionListener(this, strValue));} else {setOnEditorActionListener(appCompatAutoCompleteTextView, objValue);}



			}
			break;
			case "completionHint": {
				


	appCompatAutoCompleteTextView.setCompletionHint((CharSequence)objValue);



			}
			break;
			case "completionHintView": {
				


		setCompletionView(objValue);



			}
			break;
			case "completionThreshold": {
				


	appCompatAutoCompleteTextView.setThreshold((int)objValue);



			}
			break;
			case "dropDownAnchor": {
				


	appCompatAutoCompleteTextView.setDropDownAnchor((int)objValue);



			}
			break;
			case "dropDownHeight": {
				


	appCompatAutoCompleteTextView.setDropDownHeight((int)objValue);



			}
			break;
			case "dropDownHorizontalOffset": {
				


	appCompatAutoCompleteTextView.setDropDownHorizontalOffset((int)objValue);



			}
			break;
			case "dropDownSelector": {
				


		setDropDownlistSelector(objValue);



			}
			break;
			case "dropDownVerticalOffset": {
				


	appCompatAutoCompleteTextView.setDropDownVerticalOffset((int)objValue);



			}
			break;
			case "dropDownWidth": {
				


	appCompatAutoCompleteTextView.setDropDownWidth((int)objValue);



			}
			break;
			case "popupBackground": {
				


		appCompatAutoCompleteTextView.setDropDownBackgroundDrawable((Drawable)objValue);



			}
			break;
			case "onDismiss": {
				


		 if (objValue instanceof String) {appCompatAutoCompleteTextView.setOnDismissListener(new OnDismissListener(this, strValue, "onDismiss"));} else {appCompatAutoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener) objValue);}



			}
			break;
			case "listSelection": {
				


	appCompatAutoCompleteTextView.setListSelection((int)objValue);



			}
			break;
			case "entries": {
				


		setEntries(objValue);



			}
			break;
			case "listitem": {
				


		 addTemplate(objValue);



			}
			break;
			case "showDropDown": {
				


		showDropDown(objValue);



			}
			break;
			case "capitalize": {
				


		setCapitalize(objValue);



			}
			break;
			case "phoneNumber": {
				


		setPhoneNumber(objValue);



			}
			break;
			case "numeric": {
				


		setNumeric(objValue);



			}
			break;
			case "digits": {
				


		setDigits(objValue);



			}
			break;
			case "editorExtras": {
				


		setEditorExtras(objValue);



			}
			break;
			case "autoText": {
				


		setAutoText(objValue);



			}
			break;
			case "textAllCaps": {
				


		setTextAllCaps(objValue);



			}
			break;
			case "setFocus": {
				


		setFocus(objValue);



			}
			break;
			case "selectAll": {
				


		selectAll(objValue);



			}
			break;
			case "hintTextFormat": {
				


		setHintTextFormat(objValue);



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
				


		TextViewCompat.setTextAppearance(appCompatAutoCompleteTextView, (int)objValue);



			}
			break;
			case "textAppearance": {
				


		ViewImpl.setStyle(this, objValue);



			}
			break;
			case "password": {
				


		setPasswordType(objValue);



			}
			break;
			case "enabled": {
				


		 appCompatAutoCompleteTextView.setEnabled((boolean) objValue);



			}
			break;
			case "editable": {
				


		 appCompatAutoCompleteTextView.setEnabled((boolean) objValue);



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
			case "drawableIconSize": {
				


		setDrawableIconSize(objValue);



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
			case "cursorVisible": {
return appCompatAutoCompleteTextView.isCursorVisible();				}
			case "drawablePadding": {
return appCompatAutoCompleteTextView.getCompoundDrawablePadding();				}
			case "elegantTextHeight": {
if (Build.VERSION.SDK_INT >= 28) {
return appCompatAutoCompleteTextView.isElegantTextHeight();
}
break;				}
			case "fallbackLineSpacing": {
if (Build.VERSION.SDK_INT >= 28) {
return appCompatAutoCompleteTextView.isFallbackLineSpacing();
}
break;				}
			case "firstBaselineToTopHeight": {
if (Build.VERSION.SDK_INT >= 28) {
return appCompatAutoCompleteTextView.getFirstBaselineToTopHeight();
}
break;				}
			case "freezesText": {
return appCompatAutoCompleteTextView.getFreezesText();				}
			case "gravity": {
return appCompatAutoCompleteTextView.getGravity();				}
			case "height": {
return appCompatAutoCompleteTextView.getHeight();				}
			case "hint": {
return appCompatAutoCompleteTextView.getHint();				}
			case "imeOptions": {
return appCompatAutoCompleteTextView.getImeOptions();				}
			case "includeFontPadding": {
return appCompatAutoCompleteTextView.getIncludeFontPadding();				}
			case "lastBaselineToBottomHeight": {
if (Build.VERSION.SDK_INT >= 28) {
return appCompatAutoCompleteTextView.getLastBaselineToBottomHeight();
}
break;				}
			case "letterSpacing": {
if (Build.VERSION.SDK_INT >= 21) {
return appCompatAutoCompleteTextView.getLetterSpacing();
}
break;				}
			case "lineHeight": {
return appCompatAutoCompleteTextView.getLineHeight();				}
			case "lineSpacingExtra": {
return appCompatAutoCompleteTextView.getLineSpacingExtra();				}
			case "lineSpacingMultiplier": {
return appCompatAutoCompleteTextView.getLineSpacingMultiplier();				}
			case "maxEms": {
return appCompatAutoCompleteTextView.getMaxEms();				}
			case "maxHeight": {
return appCompatAutoCompleteTextView.getMaxHeight();				}
			case "maxLines": {
return appCompatAutoCompleteTextView.getMaxLines();				}
			case "maxWidth": {
return appCompatAutoCompleteTextView.getMaxWidth();				}
			case "minEms": {
return appCompatAutoCompleteTextView.getMinEms();				}
			case "minHeight": {
return appCompatAutoCompleteTextView.getMinHeight();				}
			case "minLines": {
return appCompatAutoCompleteTextView.getMinLines();				}
			case "minWidth": {
return appCompatAutoCompleteTextView.getMinWidth();				}
			case "privateImeOptions": {
return appCompatAutoCompleteTextView.getPrivateImeOptions();				}
			case "shadowColor": {
return appCompatAutoCompleteTextView.getShadowColor();				}
			case "shadowDx": {
return appCompatAutoCompleteTextView.getShadowDx();				}
			case "shadowDy": {
return appCompatAutoCompleteTextView.getShadowDy();				}
			case "shadowRadius": {
return appCompatAutoCompleteTextView.getShadowRadius();				}
			case "textColor": {
return appCompatAutoCompleteTextView.getTextColors();				}
			case "textColorHighlight": {
if (Build.VERSION.SDK_INT >= 16) {
return appCompatAutoCompleteTextView.getHighlightColor();
}
break;				}
			case "textIsSelectable": {
return appCompatAutoCompleteTextView.isTextSelectable();				}
			case "textScaleX": {
return appCompatAutoCompleteTextView.getTextScaleX();				}
			case "width": {
return appCompatAutoCompleteTextView.getWidth();				}
			case "completionHint": {
return appCompatAutoCompleteTextView.getCompletionHint();				}
			case "dropDownAnchor": {
return appCompatAutoCompleteTextView.getDropDownAnchor();				}
			case "dropDownHeight": {
return appCompatAutoCompleteTextView.getDropDownHeight();				}
			case "dropDownHorizontalOffset": {
return appCompatAutoCompleteTextView.getDropDownHorizontalOffset();				}
			case "dropDownVerticalOffset": {
return appCompatAutoCompleteTextView.getDropDownVerticalOffset();				}
			case "dropDownWidth": {
return appCompatAutoCompleteTextView.getDropDownWidth();				}
			case "text": {
return getMyText();				}
			case "textSize": {
return appCompatAutoCompleteTextView.getTextSize();				}
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
		return appCompatAutoCompleteTextView;
	}

	

	private static final int SIGNED = 2;
    private static final int DECIMAL = 4;
	private void setNumeric(Object objValue) {
		int numeric = (int) objValue;
		android.text.method.KeyListener keyListener = android.text.method.DigitsKeyListener.getInstance((numeric & SIGNED) != 0,
                (numeric & DECIMAL) != 0);
		appCompatAutoCompleteTextView.setKeyListener(keyListener);
		int inputType = android.view.inputmethod.EditorInfo.TYPE_CLASS_NUMBER;
		if ((numeric & SIGNED) != 0) {
		inputType |= android.view.inputmethod.EditorInfo.TYPE_NUMBER_FLAG_SIGNED;
		}
		if ((numeric & DECIMAL) != 0) {
			inputType |= android.view.inputmethod.EditorInfo.TYPE_NUMBER_FLAG_DECIMAL;
		}
		appCompatAutoCompleteTextView.setInputType(inputType);
		
	}
	
	
	private void setDigits(Object objValue) {
		String digits = (String) objValue;
		android.text.method.KeyListener keyListener = android.text.method.DigitsKeyListener.getInstance(digits.toString());
		appCompatAutoCompleteTextView.setKeyListener(keyListener);
		appCompatAutoCompleteTextView.setInputType(appCompatAutoCompleteTextView.getInputType() != android.view.inputmethod.EditorInfo.TYPE_NULL
                ? appCompatAutoCompleteTextView.getInputType() : android.view.inputmethod.EditorInfo.TYPE_CLASS_NUMBER);

	}
	

	
	private void setPhoneNumber(Object objValue) {
		if (objValue != null && (boolean) objValue) {
			appCompatAutoCompleteTextView.setKeyListener(android.text.method.DialerKeyListener.getInstance());
			appCompatAutoCompleteTextView.setInputType(android.view.inputmethod.EditorInfo.TYPE_CLASS_PHONE);
		} else {
			appCompatAutoCompleteTextView.setKeyListener(null);
			appCompatAutoCompleteTextView.setInputType(android.view.inputmethod.EditorInfo.TYPE_NULL);
		}
	}
		
	
	private void setCapitalize(Object objValue) {
		storeUserData("capitalize", objValue);
		int autocap = (int) objValue;
		boolean autotext = getUserData("autotext") != null && (boolean) getUserData("autotext");
		setAutoCap(autocap, autotext);
		
	}
	
	
	
	private void setEditorExtras(Object objValue) {
		try {
			Context context = (Context) fragment.getRootActivity();
			android.content.res.XmlResourceParser parser = context.getResources().getXml((int) objValue);
			parseBundleExtras(parser, appCompatAutoCompleteTextView.getInputExtras(true), context.getResources());
		} catch (Exception e) {
			throw new RuntimeException(e);		
		} 
		
	}

	public void parseBundleExtras(android.content.res.XmlResourceParser parser, android.os.Bundle outBundle, android.content.res.Resources resources)
			throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
		int outerDepth = parser.getDepth();
		String nodeName = parser.getName();
		int type;
		while ((type=parser.next()) != org.xmlpull.v1.XmlPullParser.END_DOCUMENT
				&& (type != org.xmlpull.v1.XmlPullParser.END_TAG || parser.getDepth() > outerDepth)) {
			if (type == org.xmlpull.v1.XmlPullParser.END_TAG || type == org.xmlpull.v1.XmlPullParser.TEXT || type == org.xmlpull.v1.XmlPullParser.START_DOCUMENT) {
				continue;
			}

			nodeName = parser.getName();
			if (nodeName.equals("input-extras")) {
				continue;
			}
			if (nodeName.equals("extra")) {
				resources.parseBundleExtra("extra", parser, outBundle);
				skipCurrentTag(parser);

			} else {
				skipCurrentTag(parser);
			}
		}
	}

	public static void skipCurrentTag(org.xmlpull.v1.XmlPullParser parser)
			throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
		int outerDepth = parser.getDepth();
		int type;
		while ((type=parser.next()) != org.xmlpull.v1.XmlPullParser.END_DOCUMENT
				&& (type != org.xmlpull.v1.XmlPullParser.END_TAG
				|| parser.getDepth() > outerDepth)) {
		}
	}
	
	
	private void setTextAllCaps(Object objValue) {
		removeAllCapsFilter();
		if (objValue != null && (boolean) objValue) {
			try {
				appCompatAutoCompleteTextView.setText(android.icu.lang.UCharacter.toUpperCase(appCompatAutoCompleteTextView.getText().toString()));
			} catch (Error e) {
				appCompatAutoCompleteTextView.setText(appCompatAutoCompleteTextView.getText().toString().toUpperCase(java.util.Locale.getDefault()));
			}
			android.text.InputFilter[] filtersArr = appCompatAutoCompleteTextView.getFilters();
			List<android.text.InputFilter> filters = new java.util.ArrayList<>(java.util.Arrays.asList(filtersArr));			
			filters.add(new android.text.InputFilter.AllCaps());
            appCompatAutoCompleteTextView.setFilters(filters.toArray(new android.text.InputFilter[0]));
        }
	}

	private void removeAllCapsFilter() {
		android.text.InputFilter[] filtersArr = appCompatAutoCompleteTextView.getFilters();
		if (filtersArr == null) {
			filtersArr = new android.text.InputFilter[0];
		}
		List<android.text.InputFilter> filters = new java.util.ArrayList<>(java.util.Arrays.asList(filtersArr));
		for (java.util.Iterator<android.text.InputFilter> iterator = filters.iterator(); iterator.hasNext();) {
			android.text.InputFilter inputFilter = iterator.next();
			if (inputFilter instanceof android.text.InputFilter.AllCaps) {
				iterator.remove();
			}
			
		}
		appCompatAutoCompleteTextView.setFilters(filters.toArray(new android.text.InputFilter[0]));
	}
	
	
	private void selectAll(Object objValue) {
		if ((boolean) objValue){
			appCompatAutoCompleteTextView.requestFocus();
			appCompatAutoCompleteTextView.selectAll();
		}
		
	}

	@Override
	public String getTextEntered() {
		return appCompatAutoCompleteTextView.getText().toString();
	}

	//start - isViewVisible
	@Override
	public boolean isViewVisible() {
		return appCompatAutoCompleteTextView.getVisibility() == View.VISIBLE;
	}
	//end - isViewVisible

	//start - focus
	@Override
	public void focus() {
		appCompatAutoCompleteTextView.requestFocus();
	}
	//end - focus

	//start - errordisplay
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
	//end - errordisplay
	
	//start - popuperror
	public void setError(String mesage) {
		appCompatAutoCompleteTextView.setError(mesage);
	}
	//end - popuperror

	private void addTextChangedListener(androidx.appcompat.widget.AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, Object objValue) {
		if (objValue instanceof android.text.TextWatcher) {
			appCompatAutoCompleteTextView.addTextChangedListener((android.text.TextWatcher) objValue);
		}
	}

	
	private void setOnEditorActionListener(androidx.appcompat.widget.AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, Object objValue) {
		appCompatAutoCompleteTextView.setOnEditorActionListener((androidx.appcompat.widget.AppCompatAutoCompleteTextView.OnEditorActionListener) objValue);
		
	}
	
	//start - hinttextformat
	private void setHintTextFormat(Object objValue) {
		applyAttributeCommand("hint", CommonConverters.command_textformatter, new String[] {"hintTextFormat"}, true, (String) objValue);
	}
	//end - hinttextformat
	
	private void setFocus(Object objValue) {
		if ((boolean)  objValue) {
			appCompatAutoCompleteTextView.requestFocus();
		} else {
			appCompatAutoCompleteTextView.clearFocus();
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
	



	private String getMyText() {
	    if (appCompatAutoCompleteTextView.getText() != null) {
	        return appCompatAutoCompleteTextView.getText().toString();
	    }
	    return "";
    }

	private boolean html;
	private void nativeCreate(Map<String, Object> params) {
		registerForAttributeCommandChain("text", "hint");
		if (params.containsKey("html")) {
			html = params.get("html").equals("true");
		}
	}

	@Override
	public java.lang.Object asNativeWidget() {
		return appCompatAutoCompleteTextView;
	}
	public void setMyText(Object text) {
		if (html) {
			appCompatAutoCompleteTextView.setText((SpannableString) com.ashera.parser.html.Html.fromHtml((String) text, null, fragment).get());	
		} else {
			appCompatAutoCompleteTextView.setText((String) text);	
		}
	}
	//start - textsize
	private void setMyTextSize(Object objValue) {
		appCompatAutoCompleteTextView.setTextSize(android.util.TypedValue.COMPLEX_UNIT_PX, getFragment().getRootActivity().getScaleFactor() * (float)objValue);		
	}
	//end - textsize
	
	//start - drawable
	private int iconSize = -1;
	private void setDrawableLeft(Object objValue) {
		android.graphics.drawable.Drawable[] drawables = appCompatAutoCompleteTextView.getCompoundDrawables();
		setBoundsOfDrawable(objValue);
		TextViewCompat.setCompoundDrawablesRelative(appCompatAutoCompleteTextView, (android.graphics.drawable.Drawable) objValue, drawables[1], drawables[2], drawables[3]);		
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
			android.graphics.drawable.Drawable[] drawables = appCompatAutoCompleteTextView.getCompoundDrawablesRelative();
			for (android.graphics.drawable.Drawable drawable : drawables) {
				if (drawable != null) {
					setBoundsOfDrawable(drawable);
				}
			}
			TextViewCompat.setCompoundDrawablesRelative(appCompatAutoCompleteTextView, drawables[0], drawables[1], drawables[2], drawables[3]);
		}
	}
	
	private void setDrawableRight(Object objValue) {
		android.graphics.drawable.Drawable[] drawables = appCompatAutoCompleteTextView.getCompoundDrawables();
		setBoundsOfDrawable(objValue);
		TextViewCompat.setCompoundDrawablesRelative(appCompatAutoCompleteTextView, drawables[0], drawables[1], (android.graphics.drawable.Drawable) objValue, drawables[3]);
		
	}
	private void setDrawableTop(Object objValue) {
		setBoundsOfDrawable(objValue);
		android.graphics.drawable.Drawable[] drawables = appCompatAutoCompleteTextView.getCompoundDrawables();
		TextViewCompat.setCompoundDrawablesRelative(appCompatAutoCompleteTextView, drawables[0], (android.graphics.drawable.Drawable) objValue, drawables[2], drawables[3]);
		
	}
	
	private void setDrawableBottom(Object objValue) {
		setBoundsOfDrawable(objValue);
		android.graphics.drawable.Drawable[] drawables = appCompatAutoCompleteTextView.getCompoundDrawables();
		TextViewCompat.setCompoundDrawablesRelative(appCompatAutoCompleteTextView, drawables[0], drawables[1], drawables[2], (android.graphics.drawable.Drawable) objValue);
		
	}
	
	private android.graphics.drawable.Drawable tintDrawableCompat;
	private void setDrawableTintMode(Object objValue) {
		if (Build.VERSION.SDK_INT >= 23) {
			appCompatAutoCompleteTextView.setCompoundDrawableTintMode((android.graphics.PorterDuff.Mode) objValue);
		} else {
			android.graphics.drawable.Drawable[] drawables = appCompatAutoCompleteTextView.getCompoundDrawablesRelative();
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
						appCompatAutoCompleteTextView.invalidate();
					}
				}
			}
		}
	}

	private void setDrawableTintList(Object objValue) {
		if (Build.VERSION.SDK_INT >= 23) {
			appCompatAutoCompleteTextView.setCompoundDrawableTintList((android.content.res.ColorStateList) objValue);
		} else {
			android.graphics.drawable.Drawable[] drawables = appCompatAutoCompleteTextView.getCompoundDrawablesRelative();
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
						appCompatAutoCompleteTextView.invalidate();
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
		android.graphics.Typeface typeface  = appCompatAutoCompleteTextView.getTypeface();
		if (typeface == null) {
			typeface = android.graphics.Typeface.DEFAULT;
		} else {
			typeface = android.graphics.Typeface.create(typeface, (int) objValue);
        }
		
		appCompatAutoCompleteTextView.setTypeface(typeface, (int) objValue);
	}

	private void setTypeFace(Object objValue, String strValue) {
		if (objValue instanceof Integer) {
			objValue = PluginInvoker.convertFrom(ConverterFactory.get(CommonConverters.font), null, strValue, fragment);
		}
		android.graphics.Typeface typeface = appCompatAutoCompleteTextView.getTypeface();
		if (typeface != null) {
			appCompatAutoCompleteTextView.setTypeface((android.graphics.Typeface) objValue, typeface.getStyle());
		} else {
			appCompatAutoCompleteTextView.setTypeface((android.graphics.Typeface) objValue);
		}
	}
	//end - font
	
	private void setMaxLength(Object objValue) {
		int maxlength = (int) objValue;
		removeMaxLengthFilter();
		if (maxlength >= 0) {
			android.text.InputFilter[] filtersArr = appCompatAutoCompleteTextView.getFilters();
			List<android.text.InputFilter> filters = new java.util.ArrayList<>(java.util.Arrays.asList(filtersArr));			
			filters.add(new android.text.InputFilter.LengthFilter(maxlength));
			appCompatAutoCompleteTextView.setFilters(filters.toArray(new android.text.InputFilter[0]));
        }
		
	}
	
	private void removeMaxLengthFilter() {
		android.text.InputFilter[] filtersArr = appCompatAutoCompleteTextView.getFilters();
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
		appCompatAutoCompleteTextView.setFilters(filters.toArray(new android.text.InputFilter[0]));
	}


	
	private void setPasswordType(Object objValue) {
		if (objValue != null && (boolean) objValue) {
			appCompatAutoCompleteTextView.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
			appCompatAutoCompleteTextView.setTypeface(android.graphics.Typeface.MONOSPACE);
		} else {
			appCompatAutoCompleteTextView.setTransformationMethod(null);
			appCompatAutoCompleteTextView.setTypeface(null);
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
        appCompatAutoCompleteTextView.setKeyListener(android.text.method.TextKeyListener.getInstance(autotext, cap));
        appCompatAutoCompleteTextView.setInputType(inputType);
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
			setAutoSizeTextTypeInternal( getAutoSizeTextType(appCompatAutoCompleteTextView));
		}
	}

	private void setAutoMinTextSize(Object objValue) {
		autoSizeMin = (int) objValue;
		
		if (isInitialised()) {
			setAutoSizeTextTypeInternal( getAutoSizeTextType(appCompatAutoCompleteTextView));
		}
	}

	private void setAutoMaxTextSize(Object objValue) {
		autoSizeMax = (int) objValue;
		
		if (isInitialised()) {
			setAutoSizeTextTypeInternal( getAutoSizeTextType(appCompatAutoCompleteTextView));
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
		return getAutoSizeTextType(appCompatAutoCompleteTextView);
	}
	//end - autosize

	private int getAutoSizeTextType(TextView appCompatAutoCompleteTextView) {
		return TextViewCompat.getAutoSizeTextType(appCompatAutoCompleteTextView);
	}

	private void setAutoSizeTextTypeInternal(int autoTextType) {
		TextViewCompat.setAutoSizeTextTypeWithDefaults(appCompatAutoCompleteTextView, autoTextType);
		
		if (autoTextType == 1) {
			int autoSizeMinTextSize = autoSizeMin == -1 ? TextViewCompat.getAutoSizeMinTextSize(appCompatAutoCompleteTextView) : autoSizeMin;
			int autoSizeMaxTextSize = autoSizeMax == -1 ? TextViewCompat.getAutoSizeMaxTextSize(appCompatAutoCompleteTextView) : autoSizeMax;
			int autoSizeStepGranularity = autoSizeGranular == -1 ? TextViewCompat.getAutoSizeStepGranularity(appCompatAutoCompleteTextView) : autoSizeGranular;
			TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(appCompatAutoCompleteTextView, 
					autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, 
					android.util.TypedValue.COMPLEX_UNIT_PX);
        }
	}
	
	   
    private void setLinksClickable(Object objValue) {
        if (objValue != null && (boolean) objValue) {
            appCompatAutoCompleteTextView.setLinksClickable(true);
            
            if (isInitialised()) {
                appCompatAutoCompleteTextView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());    
            }
        } else {
            appCompatAutoCompleteTextView.setLinksClickable(false);
            
            if (isInitialised()) {
                if (appCompatAutoCompleteTextView.getMovementMethod() instanceof android.text.method.LinkMovementMethod) {
                    appCompatAutoCompleteTextView.setMovementMethod(null);
                }    
            }
        }
    }

	
	private void startOrStopMarquee(Object objValue) {
		appCompatAutoCompleteTextView.setSelected((boolean) objValue); 
		
	}

	
	private void setTextAligmentHack(Object objValue) {
		if (isInitialised()) {
			setFieldUsingReflection(appCompatAutoCompleteTextView, "mLayout", null);
		}
	}
	

	private void resetText() {
		if (isInitialised()) {
			appCompatAutoCompleteTextView.setText(appCompatAutoCompleteTextView.getText());
		}
	}
	

	
	private Object getFinalValueForEllipsize(Object objValue) {
		if ("@null".equals(objValue)) {
			return null;
		}
		
		if (objValue == android.text.TextUtils.TruncateAt.MARQUEE) {
			appCompatAutoCompleteTextView.setSelected(true); 
		}
		return objValue;
	}	

	private void setAutoSizePresetSizes(Object objValue) {
		TextViewCompat.setAutoSizeTextTypeUniformWithPresetSizes(appCompatAutoCompleteTextView, (int[]) objValue, android.util.TypedValue.COMPLEX_UNIT_PX);
	}
	
	
	private void postSetAttributeEditText(WidgetAttribute key, String strValue, Object objValue,
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
			List listeners = (List) getFieldValueUsingReflection(appCompatAutoCompleteTextView, "mListeners");
			if (listeners != null) {
				for (Object listener : listeners) {
					if (listener instanceof IListener && action.equals(((IListener)listener).getAction())) {
						appCompatAutoCompleteTextView.removeTextChangedListener((TextWatcher) listener);
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
    obj.put("namespace", w.getFragment().getNamespace());
    
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
    obj.put("namespace", w.getFragment().getNamespace());
    
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
    obj.put("namespace", w.getFragment().getNamespace());
    
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
private static class OnEditorActionListener implements TextView.OnEditorActionListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnEditorActionListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnEditorActionListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public boolean onEditorAction (TextView v, 
                int actionId, 
                KeyEvent event){
    boolean result = true;
    
	if (action == null || action.equals("onEditorAction")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onEditorAction");
	    java.util.Map<String, Object> obj = getOnEditorActionEventObj(v,actionId,event);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 Object commandResult = EventCommandFactory.getCommand(commandName).executeCommand(w, obj, v,actionId,event);
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

public java.util.Map<String, Object> getOnEditorActionEventObj(TextView v,int actionId,KeyEvent event) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "editoraction");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "actionId", actionId);
        ViewImpl.addEventInfo(obj, event);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onEditorAction", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnDismissListener implements AutoCompleteTextView.OnDismissListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnDismissListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnDismissListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onDismiss(){
    
	if (action == null || action.equals("onDismiss")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onDismiss");
	    java.util.Map<String, Object> obj = getOnDismissEventObj();
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj);
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

public java.util.Map<String, Object> getOnDismissEventObj( ) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "dismiss");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onDismiss", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	
	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			appCompatAutoCompleteTextView.setId((int) quickConvert(id, "id"));
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
	private MyCustomAdapter myCustomAdapter;
	@Override
	public Object getChildAttribute(IWidget w, WidgetAttribute key) {
		return null;
	}
	
	@Override
	public void setChildAttribute(IWidget widget, WidgetAttribute key, String strValue, Object value) {
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
			return super.getItem(position);
		}
	
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			if (listItem == null) {
				View view = super.getView(position, convertView, parent);
				return view;
			}
			return getCustomView(position, convertView, parent);
		}
	
		public View getCustomView(int position, View convertView, ViewGroup parent) {
			com.ashera.model.LoopParam model = (com.ashera.model.LoopParam) super.getItem(position);
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
	private void setEntries(Object objValue) {
		myCustomAdapter = new MyCustomAdapter(
	            appCompatAutoCompleteTextView.getContext(), android.R.layout.simple_dropdown_item_1line);
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
		
		myCustomAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
		appCompatAutoCompleteTextView.setAdapter(myCustomAdapter);
	}
	
	private void postSetAttribute(WidgetAttribute key, String strValue, Object objValue,
			ILifeCycleDecorator decorator) {
		switch (key.getAttributeName()) {
		case "modelFor":
		case "listitem":
			if (isInitialised()) {
				initAdapter();
			}
			break;

		default:
			break;
		}
		
	}

	private void initAdapter() {
		Context context = (Context) fragment.getRootActivity();
		myCustomAdapter = new MyCustomAdapter(context, android.R.layout.simple_dropdown_item_1line);
		myCustomAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
		appCompatAutoCompleteTextView.setAdapter(myCustomAdapter);
	}
	
    private void reloadTable() {
		if (myCustomAdapter != null) {
			myCustomAdapter.notifyDataSetChanged();
		}
	}
    
	
	private void setDropDownlistSelector(Object objValue) {
		ListPopupWindow listPopupWindow = (ListPopupWindow) getFieldValueUsingReflection(appCompatAutoCompleteTextView, "mPopup");
		listPopupWindow.setListSelector((Drawable) objValue);
		
	}

	private void setCompletionView(Object objValue) {
		String layout = (String) objValue;
		layout = layout.replace("@layout/", "");
		setFieldUsingReflection(appCompatAutoCompleteTextView, "mHintResource", appCompatAutoCompleteTextView.getResources().getLayout(
				appCompatAutoCompleteTextView.getResources().getIdentifier(layout, "layout", appCompatAutoCompleteTextView.getContext().getPackageName())));
	}
	
	
	private void showDropDown(Object objValue) {
		if ((boolean) objValue) {
			appCompatAutoCompleteTextView.showDropDown();
		} else {
			appCompatAutoCompleteTextView.dismissDropDown();
		}
	}
	
	@Override
	public void initialized() {
		super.initialized();
		if (myCustomAdapter == null) {
			initAdapter();
		}
	}
	
	public AutoCompleteTextViewImpl(AutoCompleteTextView autoCompleteTextView, IFragment fragment) {
		super(LOCAL_NAME, GROUP_NAME);
		this.fragment = fragment;
		this.appCompatAutoCompleteTextView = (androidx.appcompat.widget.AppCompatAutoCompleteTextView) autoCompleteTextView;
		loadAttributes(LOCAL_NAME);
		initialized();
	}
}
