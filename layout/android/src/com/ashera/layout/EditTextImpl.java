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
import androidx.core.widget.TextViewCompat;
@SuppressLint("NewApi")
public class EditTextImpl extends BaseWidget implements com.ashera.validations.FormElement{
	//start - body
	public final static String LOCAL_NAME = "EditText"; 
	public final static String GROUP_NAME = "EditText";

	protected androidx.appcompat.widget.AppCompatEditText appCompatEditText;
	
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
		ViewImpl.register(attributeName);


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
		ConverterFactory.register("EditText.imeOptions", new ImeOptions());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("imeOptions").withType("EditText.imeOptions"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("includeFontPadding").withType("boolean"));
		ConverterFactory.register("EditText.inputType", new InputType());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("inputType").withType("EditText.inputType"));
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
		ConverterFactory.register("EditText.capitalize", new Capitalize());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("capitalize").withType("EditText.capitalize"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("phoneNumber").withType("boolean"));
		ConverterFactory.register("EditText.numeric", new Numeric());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("numeric").withType("EditText.numeric"));
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
		ConverterFactory.register("EditText.font", new Font());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("typeface").withType("EditText.font"));
		ConverterFactory.register("EditText.textStyle", new TextStyle());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textStyle").withType("EditText.textStyle"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("fontFamily").withType("font"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("systemTextAppearance").withType("style"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textAppearance").withType("string").withStylePriority(1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("password").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("enabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("editable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTint").withType("colorstate"));
		ConverterFactory.register("EditText.drawableTintMode", new DrawableTintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTintMode").withType("EditText.drawableTintMode"));
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
	
	public EditTextImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  EditTextImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  EditTextImpl(String groupName, String localname) {
		super(groupName, localname);
	}

		
	public class EditTextExt extends androidx.appcompat.widget.AppCompatEditText implements ILifeCycleDecorator{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		
		public IWidget getWidget() {
			return EditTextImpl.this;
		}

		public EditTextExt(Context context, android.util.AttributeSet attrs, int defStyleAttr) {
	        super(context, attrs, defStyleAttr);
	    }

		public EditTextExt(Context context) {
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
				EditTextImpl.this.invalidate();
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
        		ViewImpl.drawableStateChanged(EditTextImpl.this);
        	}
        }
        
    	public void setState0(float value) {
    		ViewImpl.setState(EditTextImpl.this, 0, value);
    	}
    	public void setState0(int value) {
    		ViewImpl.setState(EditTextImpl.this, 0, value);
    	}
    	public void setState0(double value) {
    		ViewImpl.setState(EditTextImpl.this, 0, value);
    	}
    	
    	public void setState0(Float value) {
    		ViewImpl.setState(EditTextImpl.this, 0, value);
    	}
    	public void setState0(Integer value) {
    		ViewImpl.setState(EditTextImpl.this, 0, value);
    	}
    	public void setState0(Double value) {
    		ViewImpl.setState(EditTextImpl.this, 0, value);
    	}
    	public void setState0(Object value) {
    		ViewImpl.setState(EditTextImpl.this, 0, value);
    	}
    	public void setState1(float value) {
    		ViewImpl.setState(EditTextImpl.this, 1, value);
    	}
    	public void setState1(int value) {
    		ViewImpl.setState(EditTextImpl.this, 1, value);
    	}
    	public void setState1(double value) {
    		ViewImpl.setState(EditTextImpl.this, 1, value);
    	}
    	
    	public void setState1(Float value) {
    		ViewImpl.setState(EditTextImpl.this, 1, value);
    	}
    	public void setState1(Integer value) {
    		ViewImpl.setState(EditTextImpl.this, 1, value);
    	}
    	public void setState1(Double value) {
    		ViewImpl.setState(EditTextImpl.this, 1, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(EditTextImpl.this, 1, value);
    	}
    	public void setState2(float value) {
    		ViewImpl.setState(EditTextImpl.this, 2, value);
    	}
    	public void setState2(int value) {
    		ViewImpl.setState(EditTextImpl.this, 2, value);
    	}
    	public void setState2(double value) {
    		ViewImpl.setState(EditTextImpl.this, 2, value);
    	}
    	
    	public void setState2(Float value) {
    		ViewImpl.setState(EditTextImpl.this, 2, value);
    	}
    	public void setState2(Integer value) {
    		ViewImpl.setState(EditTextImpl.this, 2, value);
    	}
    	public void setState2(Double value) {
    		ViewImpl.setState(EditTextImpl.this, 2, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(EditTextImpl.this, 2, value);
    	}
    	public void setState3(float value) {
    		ViewImpl.setState(EditTextImpl.this, 3, value);
    	}
    	public void setState3(int value) {
    		ViewImpl.setState(EditTextImpl.this, 3, value);
    	}
    	public void setState3(double value) {
    		ViewImpl.setState(EditTextImpl.this, 3, value);
    	}
    	
    	public void setState3(Float value) {
    		ViewImpl.setState(EditTextImpl.this, 3, value);
    	}
    	public void setState3(Integer value) {
    		ViewImpl.setState(EditTextImpl.this, 3, value);
    	}
    	public void setState3(Double value) {
    		ViewImpl.setState(EditTextImpl.this, 3, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(EditTextImpl.this, 3, value);
    	}
    	public void setState4(float value) {
    		ViewImpl.setState(EditTextImpl.this, 4, value);
    	}
    	public void setState4(int value) {
    		ViewImpl.setState(EditTextImpl.this, 4, value);
    	}
    	public void setState4(double value) {
    		ViewImpl.setState(EditTextImpl.this, 4, value);
    	}
    	
    	public void setState4(Float value) {
    		ViewImpl.setState(EditTextImpl.this, 4, value);
    	}
    	public void setState4(Integer value) {
    		ViewImpl.setState(EditTextImpl.this, 4, value);
    	}
    	public void setState4(Double value) {
    		ViewImpl.setState(EditTextImpl.this, 4, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(EditTextImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(EditTextImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(EditTextImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(EditTextImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(EditTextImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(EditTextImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(EditTextImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(EditTextImpl.this);
        }
     
	
	}	@Override
	public Class getViewClass() {
		return EditTextExt.class;
	}

	@Override
	public IWidget newInstance() {
		return new EditTextImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
Context context = (Context) fragment.getRootActivity();
	Object systemStyle = params.get("systemStyle");
	Object systemAndroidAttrStyle = params.get("systemAndroidAttrStyle");
	
	if (systemStyle == null && systemAndroidAttrStyle == null) {
		appCompatEditText = new EditTextExt(context);
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
			appCompatEditText = new EditTextExt(context, null, defStyleAttr);	
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
			case "cursorVisible": {
				


	appCompatEditText.setCursorVisible((boolean)objValue);



			}
			break;
			case "drawablePadding": {
				


	appCompatEditText.setCompoundDrawablePadding((int)objValue);



			}
			break;
			case "elegantTextHeight": {
				
if (Build.VERSION.SDK_INT >= 21) {

	appCompatEditText.setElegantTextHeight((boolean)objValue);

}

			}
			break;
			case "ems": {
				


	appCompatEditText.setEms((int)objValue);



			}
			break;
			case "fallbackLineSpacing": {
				
if (Build.VERSION.SDK_INT >= 28) {

	appCompatEditText.setFallbackLineSpacing((boolean)objValue);

}

			}
			break;
			case "firstBaselineToTopHeight": {
				
if (Build.VERSION.SDK_INT >= 28) {

	appCompatEditText.setFirstBaselineToTopHeight((int)objValue);

}

			}
			break;
			case "freezesText": {
				


	appCompatEditText.setFreezesText((boolean)objValue);



			}
			break;
			case "gravity": {
				


	appCompatEditText.setGravity((int)objValue);



			}
			break;
			case "height": {
				


	appCompatEditText.setHeight((int)objValue);



			}
			break;
			case "hint": {
				


	appCompatEditText.setHint((String)objValue);



			}
			break;
			case "imeActionId": {
				


		appCompatEditText.setImeActionLabel(appCompatEditText.getImeActionLabel(),(int) objValue);



			}
			break;
			case "imeActionLabel": {
				


		appCompatEditText.setImeActionLabel((CharSequence) objValue,appCompatEditText.getImeActionId());



			}
			break;
			case "imeOptions": {
				


	appCompatEditText.setImeOptions((int)objValue);



			}
			break;
			case "includeFontPadding": {
				


	appCompatEditText.setIncludeFontPadding((boolean)objValue);



			}
			break;
			case "inputType": {
				


	appCompatEditText.setRawInputType((int)objValue);



			}
			break;
			case "lastBaselineToBottomHeight": {
				
if (Build.VERSION.SDK_INT >= 28) {

	appCompatEditText.setLastBaselineToBottomHeight((int)objValue);

}

			}
			break;
			case "letterSpacing": {
				
if (Build.VERSION.SDK_INT >= 21) {

	appCompatEditText.setLetterSpacing((float)objValue);

}

			}
			break;
			case "lineHeight": {
				
if (Build.VERSION.SDK_INT >= 28) {

	appCompatEditText.setLineHeight((int)objValue);

}

			}
			break;
			case "lineSpacingExtra": {
				


		appCompatEditText.setLineSpacing((float) objValue,appCompatEditText.getLineSpacingMultiplier());



			}
			break;
			case "lineSpacingMultiplier": {
				


		appCompatEditText.setLineSpacing(appCompatEditText.getLineSpacingExtra(),(float) objValue);



			}
			break;
			case "lines": {
				


	appCompatEditText.setLines((int)objValue);



			}
			break;
			case "maxEms": {
				


	appCompatEditText.setMaxEms((int)objValue);



			}
			break;
			case "maxHeight": {
				


	appCompatEditText.setMaxHeight((int)objValue);



			}
			break;
			case "maxLines": {
				


	appCompatEditText.setMaxLines((int)objValue);



			}
			break;
			case "maxWidth": {
				


	appCompatEditText.setMaxWidth((int)objValue);



			}
			break;
			case "minEms": {
				


	appCompatEditText.setMinEms((int)objValue);



			}
			break;
			case "minHeight": {
				


	appCompatEditText.setMinHeight((int)objValue);



			}
			break;
			case "minLines": {
				


	appCompatEditText.setMinLines((int)objValue);



			}
			break;
			case "minWidth": {
				


	appCompatEditText.setMinWidth((int)objValue);



			}
			break;
			case "privateImeOptions": {
				


	appCompatEditText.setPrivateImeOptions((String)objValue);



			}
			break;
			case "scrollHorizontally": {
				


	appCompatEditText.setHorizontallyScrolling((boolean)objValue);



			}
			break;
			case "selectAllOnFocus": {
				


	appCompatEditText.setSelectAllOnFocus((boolean)objValue);



			}
			break;
			case "shadowColor": {
				


		appCompatEditText.setShadowLayer(appCompatEditText.getShadowRadius(),appCompatEditText.getShadowDx(),appCompatEditText.getShadowDy(),(int) objValue);



			}
			break;
			case "shadowDx": {
				


		appCompatEditText.setShadowLayer(appCompatEditText.getShadowRadius(),(float) objValue,appCompatEditText.getShadowDy(),appCompatEditText.getShadowColor());



			}
			break;
			case "shadowDy": {
				


		appCompatEditText.setShadowLayer(appCompatEditText.getShadowRadius(),appCompatEditText.getShadowDx(),(float) objValue,appCompatEditText.getShadowColor());



			}
			break;
			case "shadowRadius": {
				


		appCompatEditText.setShadowLayer((float) objValue,appCompatEditText.getShadowDx(),appCompatEditText.getShadowDy(),appCompatEditText.getShadowColor());



			}
			break;
			case "singleLine": {
				


	appCompatEditText.setSingleLine((boolean)objValue);



			}
			break;
			case "textColor": {
				


	appCompatEditText.setTextColor((android.content.res.ColorStateList)objValue);



			}
			break;
			case "textColorHighlight": {
				


	appCompatEditText.setHighlightColor((int)objValue);



			}
			break;
			case "textColorHint": {
				


	appCompatEditText.setHintTextColor((android.content.res.ColorStateList)objValue);



			}
			break;
			case "textIsSelectable": {
				
if (Build.VERSION.SDK_INT >= 11) {

	appCompatEditText.setTextIsSelectable((boolean)objValue);

}

			}
			break;
			case "textScaleX": {
				


	appCompatEditText.setTextScaleX((float)objValue);



			}
			break;
			case "width": {
				


	appCompatEditText.setWidth((int)objValue);



			}
			break;
			case "onafterTextChange": {
				


		removeaddTextChangedListenerIfNeeded("onafterTextChange");if (objValue instanceof String) {appCompatEditText.addTextChangedListener(new TextChangedListener(this, strValue, "onafterTextChange"));} else {addTextChangedListener(appCompatEditText, objValue);}



			}
			break;
			case "onbeforeTextChange": {
				


		removeaddTextChangedListenerIfNeeded("onbeforeTextChange");if (objValue instanceof String) {appCompatEditText.addTextChangedListener(new TextChangedListener(this, strValue, "onbeforeTextChange"));} else {addTextChangedListener(appCompatEditText, objValue);}



			}
			break;
			case "onTextChange": {
				


		removeaddTextChangedListenerIfNeeded("onTextChange");if (objValue instanceof String) {appCompatEditText.addTextChangedListener(new TextChangedListener(this, strValue, "onTextChange"));} else {addTextChangedListener(appCompatEditText, objValue);}



			}
			break;
			case "onEditorAction": {
				


		if (objValue instanceof String) {appCompatEditText.setOnEditorActionListener(new OnEditorActionListener(this, strValue));} else {setOnEditorActionListener(appCompatEditText, objValue);}



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
				


		TextViewCompat.setTextAppearance(appCompatEditText, (int)objValue);



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
				


		 appCompatEditText.setEnabled((boolean) objValue);



			}
			break;
			case "editable": {
				


		 appCompatEditText.setEnabled((boolean) objValue);



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
return appCompatEditText.isCursorVisible();				}
			case "drawablePadding": {
return appCompatEditText.getCompoundDrawablePadding();				}
			case "elegantTextHeight": {
if (Build.VERSION.SDK_INT >= 28) {
return appCompatEditText.isElegantTextHeight();
}
break;				}
			case "fallbackLineSpacing": {
if (Build.VERSION.SDK_INT >= 28) {
return appCompatEditText.isFallbackLineSpacing();
}
break;				}
			case "firstBaselineToTopHeight": {
if (Build.VERSION.SDK_INT >= 28) {
return appCompatEditText.getFirstBaselineToTopHeight();
}
break;				}
			case "freezesText": {
return appCompatEditText.getFreezesText();				}
			case "gravity": {
return appCompatEditText.getGravity();				}
			case "height": {
return appCompatEditText.getHeight();				}
			case "hint": {
return appCompatEditText.getHint();				}
			case "imeOptions": {
return appCompatEditText.getImeOptions();				}
			case "includeFontPadding": {
return appCompatEditText.getIncludeFontPadding();				}
			case "lastBaselineToBottomHeight": {
if (Build.VERSION.SDK_INT >= 28) {
return appCompatEditText.getLastBaselineToBottomHeight();
}
break;				}
			case "letterSpacing": {
if (Build.VERSION.SDK_INT >= 21) {
return appCompatEditText.getLetterSpacing();
}
break;				}
			case "lineHeight": {
return appCompatEditText.getLineHeight();				}
			case "lineSpacingExtra": {
return appCompatEditText.getLineSpacingExtra();				}
			case "lineSpacingMultiplier": {
return appCompatEditText.getLineSpacingMultiplier();				}
			case "maxEms": {
return appCompatEditText.getMaxEms();				}
			case "maxHeight": {
return appCompatEditText.getMaxHeight();				}
			case "maxLines": {
return appCompatEditText.getMaxLines();				}
			case "maxWidth": {
return appCompatEditText.getMaxWidth();				}
			case "minEms": {
return appCompatEditText.getMinEms();				}
			case "minHeight": {
return appCompatEditText.getMinHeight();				}
			case "minLines": {
return appCompatEditText.getMinLines();				}
			case "minWidth": {
return appCompatEditText.getMinWidth();				}
			case "privateImeOptions": {
return appCompatEditText.getPrivateImeOptions();				}
			case "shadowColor": {
return appCompatEditText.getShadowColor();				}
			case "shadowDx": {
return appCompatEditText.getShadowDx();				}
			case "shadowDy": {
return appCompatEditText.getShadowDy();				}
			case "shadowRadius": {
return appCompatEditText.getShadowRadius();				}
			case "textColor": {
return appCompatEditText.getTextColors();				}
			case "textColorHighlight": {
if (Build.VERSION.SDK_INT >= 16) {
return appCompatEditText.getHighlightColor();
}
break;				}
			case "textIsSelectable": {
return appCompatEditText.isTextSelectable();				}
			case "textScaleX": {
return appCompatEditText.getTextScaleX();				}
			case "width": {
return appCompatEditText.getWidth();				}
			case "text": {
return getMyText();				}
			case "textSize": {
return appCompatEditText.getTextSize();				}
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
		return appCompatEditText;
	}

	


	private String getMyText() {
	    if (appCompatEditText.getText() != null) {
	        return appCompatEditText.getText().toString();
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
		return appCompatEditText;
	}
	public void setMyText(Object text) {
		if (html) {
			appCompatEditText.setText((SpannableString) com.ashera.parser.html.Html.fromHtml((String) text, null, fragment).get());	
		} else {
			appCompatEditText.setText((String) text);	
		}
	}
	//start - textsize
	private void setMyTextSize(Object objValue) {
		appCompatEditText.setTextSize(android.util.TypedValue.COMPLEX_UNIT_PX, getFragment().getRootActivity().getScaleFactor() * (float)objValue);		
	}
	//end - textsize
	
	//start - drawable
	private int iconSize = -1;
	private void setDrawableLeft(Object objValue) {
		android.graphics.drawable.Drawable[] drawables = appCompatEditText.getCompoundDrawables();
		setBoundsOfDrawable(objValue);
		TextViewCompat.setCompoundDrawablesRelative(appCompatEditText, (android.graphics.drawable.Drawable) objValue, drawables[1], drawables[2], drawables[3]);		
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
			android.graphics.drawable.Drawable[] drawables = appCompatEditText.getCompoundDrawablesRelative();
			for (android.graphics.drawable.Drawable drawable : drawables) {
				if (drawable != null) {
					setBoundsOfDrawable(drawable);
				}
			}
			TextViewCompat.setCompoundDrawablesRelative(appCompatEditText, drawables[0], drawables[1], drawables[2], drawables[3]);
		}
	}
	
	private void setDrawableRight(Object objValue) {
		android.graphics.drawable.Drawable[] drawables = appCompatEditText.getCompoundDrawables();
		setBoundsOfDrawable(objValue);
		TextViewCompat.setCompoundDrawablesRelative(appCompatEditText, drawables[0], drawables[1], (android.graphics.drawable.Drawable) objValue, drawables[3]);
		
	}
	private void setDrawableTop(Object objValue) {
		setBoundsOfDrawable(objValue);
		android.graphics.drawable.Drawable[] drawables = appCompatEditText.getCompoundDrawables();
		TextViewCompat.setCompoundDrawablesRelative(appCompatEditText, drawables[0], (android.graphics.drawable.Drawable) objValue, drawables[2], drawables[3]);
		
	}
	
	private void setDrawableBottom(Object objValue) {
		setBoundsOfDrawable(objValue);
		android.graphics.drawable.Drawable[] drawables = appCompatEditText.getCompoundDrawables();
		TextViewCompat.setCompoundDrawablesRelative(appCompatEditText, drawables[0], drawables[1], drawables[2], (android.graphics.drawable.Drawable) objValue);
		
	}
	
	private android.graphics.drawable.Drawable tintDrawableCompat;
	private void setDrawableTintMode(Object objValue) {
		if (Build.VERSION.SDK_INT >= 23) {
			appCompatEditText.setCompoundDrawableTintMode((android.graphics.PorterDuff.Mode) objValue);
		} else {
			android.graphics.drawable.Drawable[] drawables = appCompatEditText.getCompoundDrawablesRelative();
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
						appCompatEditText.invalidate();
					}
				}
			}
		}
	}

	private void setDrawableTintList(Object objValue) {
		if (Build.VERSION.SDK_INT >= 23) {
			appCompatEditText.setCompoundDrawableTintList((android.content.res.ColorStateList) objValue);
		} else {
			android.graphics.drawable.Drawable[] drawables = appCompatEditText.getCompoundDrawablesRelative();
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
						appCompatEditText.invalidate();
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
		android.graphics.Typeface typeface  = appCompatEditText.getTypeface();
		if (typeface == null) {
			typeface = android.graphics.Typeface.DEFAULT;
		} else {
			typeface = android.graphics.Typeface.create(typeface, (int) objValue);
        }
		
		appCompatEditText.setTypeface(typeface, (int) objValue);
	}

	private void setTypeFace(Object objValue, String strValue) {
		if (objValue instanceof Integer) {
			objValue = PluginInvoker.convertFrom(ConverterFactory.get(CommonConverters.font), null, strValue, fragment);
		}
		android.graphics.Typeface typeface = appCompatEditText.getTypeface();
		if (typeface != null) {
			appCompatEditText.setTypeface((android.graphics.Typeface) objValue, typeface.getStyle());
		} else {
			appCompatEditText.setTypeface((android.graphics.Typeface) objValue);
		}
	}
	//end - font
	
	private void setMaxLength(Object objValue) {
		int maxlength = (int) objValue;
		removeMaxLengthFilter();
		if (maxlength >= 0) {
			android.text.InputFilter[] filtersArr = appCompatEditText.getFilters();
			List<android.text.InputFilter> filters = new java.util.ArrayList<>(java.util.Arrays.asList(filtersArr));			
			filters.add(new android.text.InputFilter.LengthFilter(maxlength));
			appCompatEditText.setFilters(filters.toArray(new android.text.InputFilter[0]));
        }
		
	}
	
	private void removeMaxLengthFilter() {
		android.text.InputFilter[] filtersArr = appCompatEditText.getFilters();
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
		appCompatEditText.setFilters(filters.toArray(new android.text.InputFilter[0]));
	}


	
	private void setPasswordType(Object objValue) {
		if (objValue != null && (boolean) objValue) {
			appCompatEditText.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
			appCompatEditText.setTypeface(android.graphics.Typeface.MONOSPACE);
		} else {
			appCompatEditText.setTransformationMethod(null);
			appCompatEditText.setTypeface(null);
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
        appCompatEditText.setKeyListener(android.text.method.TextKeyListener.getInstance(autotext, cap));
        appCompatEditText.setInputType(inputType);
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
			setAutoSizeTextTypeInternal( getAutoSizeTextType(appCompatEditText));
		}
	}

	private void setAutoMinTextSize(Object objValue) {
		autoSizeMin = (int) objValue;
		
		if (isInitialised()) {
			setAutoSizeTextTypeInternal( getAutoSizeTextType(appCompatEditText));
		}
	}

	private void setAutoMaxTextSize(Object objValue) {
		autoSizeMax = (int) objValue;
		
		if (isInitialised()) {
			setAutoSizeTextTypeInternal( getAutoSizeTextType(appCompatEditText));
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
		return getAutoSizeTextType(appCompatEditText);
	}
	//end - autosize

	private int getAutoSizeTextType(TextView appCompatEditText) {
		return TextViewCompat.getAutoSizeTextType(appCompatEditText);
	}

	private void setAutoSizeTextTypeInternal(int autoTextType) {
		TextViewCompat.setAutoSizeTextTypeWithDefaults(appCompatEditText, autoTextType);
		
		if (autoTextType == 1) {
			int autoSizeMinTextSize = autoSizeMin == -1 ? TextViewCompat.getAutoSizeMinTextSize(appCompatEditText) : autoSizeMin;
			int autoSizeMaxTextSize = autoSizeMax == -1 ? TextViewCompat.getAutoSizeMaxTextSize(appCompatEditText) : autoSizeMax;
			int autoSizeStepGranularity = autoSizeGranular == -1 ? TextViewCompat.getAutoSizeStepGranularity(appCompatEditText) : autoSizeGranular;
			TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(appCompatEditText, 
					autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, 
					android.util.TypedValue.COMPLEX_UNIT_PX);
        }
	}
	
	   
    private void setLinksClickable(Object objValue) {
        if (objValue != null && (boolean) objValue) {
            appCompatEditText.setLinksClickable(true);
            
            if (isInitialised()) {
                appCompatEditText.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());    
            }
        } else {
            appCompatEditText.setLinksClickable(false);
            
            if (isInitialised()) {
                if (appCompatEditText.getMovementMethod() instanceof android.text.method.LinkMovementMethod) {
                    appCompatEditText.setMovementMethod(null);
                }    
            }
        }
    }

	
	private void startOrStopMarquee(Object objValue) {
		appCompatEditText.setSelected((boolean) objValue); 
		
	}

	
	private void setTextAligmentHack(Object objValue) {
		if (isInitialised()) {
			setFieldUsingReflection(appCompatEditText, "mLayout", null);
		}
	}
	

	private void resetText() {
		if (isInitialised()) {
			appCompatEditText.setText(appCompatEditText.getText());
		}
	}
	

	
	private Object getFinalValueForEllipsize(Object objValue) {
		if ("@null".equals(objValue)) {
			return null;
		}
		
		if (objValue == android.text.TextUtils.TruncateAt.MARQUEE) {
			appCompatEditText.setSelected(true); 
		}
		return objValue;
	}	

	private void setAutoSizePresetSizes(Object objValue) {
		TextViewCompat.setAutoSizeTextTypeUniformWithPresetSizes(appCompatEditText, (int[]) objValue, android.util.TypedValue.COMPLEX_UNIT_PX);
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
			List listeners = (List) getFieldValueUsingReflection(appCompatEditText, "mListeners");
			if (listeners != null) {
				for (Object listener : listeners) {
					if (listener instanceof IListener && action.equals(((IListener)listener).getAction())) {
						appCompatEditText.removeTextChangedListener((TextWatcher) listener);
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

	
	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			appCompatEditText.setId((int) quickConvert(id, "id"));
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
	//start - edittext
	private static final int SIGNED = 2;
    private static final int DECIMAL = 4;
	private void setNumeric(Object objValue) {
		int numeric = (int) objValue;
		android.text.method.KeyListener keyListener = android.text.method.DigitsKeyListener.getInstance((numeric & SIGNED) != 0,
                (numeric & DECIMAL) != 0);
		appCompatEditText.setKeyListener(keyListener);
		int inputType = android.view.inputmethod.EditorInfo.TYPE_CLASS_NUMBER;
		if ((numeric & SIGNED) != 0) {
		inputType |= android.view.inputmethod.EditorInfo.TYPE_NUMBER_FLAG_SIGNED;
		}
		if ((numeric & DECIMAL) != 0) {
			inputType |= android.view.inputmethod.EditorInfo.TYPE_NUMBER_FLAG_DECIMAL;
		}
		appCompatEditText.setInputType(inputType);
		
	}
	
	
	private void setDigits(Object objValue) {
		String digits = (String) objValue;
		android.text.method.KeyListener keyListener = android.text.method.DigitsKeyListener.getInstance(digits.toString());
		appCompatEditText.setKeyListener(keyListener);
		appCompatEditText.setInputType(appCompatEditText.getInputType() != android.view.inputmethod.EditorInfo.TYPE_NULL
                ? appCompatEditText.getInputType() : android.view.inputmethod.EditorInfo.TYPE_CLASS_NUMBER);

	}
	

	
	private void setPhoneNumber(Object objValue) {
		if (objValue != null && (boolean) objValue) {
			appCompatEditText.setKeyListener(android.text.method.DialerKeyListener.getInstance());
			appCompatEditText.setInputType(android.view.inputmethod.EditorInfo.TYPE_CLASS_PHONE);
		} else {
			appCompatEditText.setKeyListener(null);
			appCompatEditText.setInputType(android.view.inputmethod.EditorInfo.TYPE_NULL);
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
			parseBundleExtras(parser, appCompatEditText.getInputExtras(true), context.getResources());
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
				appCompatEditText.setText(android.icu.lang.UCharacter.toUpperCase(appCompatEditText.getText().toString()));
			} catch (Error e) {
				appCompatEditText.setText(appCompatEditText.getText().toString().toUpperCase(java.util.Locale.getDefault()));
			}
			android.text.InputFilter[] filtersArr = appCompatEditText.getFilters();
			List<android.text.InputFilter> filters = new java.util.ArrayList<>(java.util.Arrays.asList(filtersArr));			
			filters.add(new android.text.InputFilter.AllCaps());
            appCompatEditText.setFilters(filters.toArray(new android.text.InputFilter[0]));
        }
	}

	private void removeAllCapsFilter() {
		android.text.InputFilter[] filtersArr = appCompatEditText.getFilters();
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
		appCompatEditText.setFilters(filters.toArray(new android.text.InputFilter[0]));
	}
	
	
	private void selectAll(Object objValue) {
		if ((boolean) objValue){
			appCompatEditText.requestFocus();
			appCompatEditText.selectAll();
		}
		
	}

	@Override
	public String getTextEntered() {
		return appCompatEditText.getText().toString();
	}

	//start - isViewVisible
	@Override
	public boolean isViewVisible() {
		return appCompatEditText.getVisibility() == View.VISIBLE;
	}
	//end - isViewVisible

	//start - focus
	@Override
	public void focus() {
		appCompatEditText.requestFocus();
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
		appCompatEditText.setError(mesage);
	}
	//end - popuperror

	private void addTextChangedListener(androidx.appcompat.widget.AppCompatEditText appCompatEditText, Object objValue) {
		if (objValue instanceof android.text.TextWatcher) {
			appCompatEditText.addTextChangedListener((android.text.TextWatcher) objValue);
		}
	}

	
	private void setOnEditorActionListener(androidx.appcompat.widget.AppCompatEditText appCompatEditText, Object objValue) {
		appCompatEditText.setOnEditorActionListener((androidx.appcompat.widget.AppCompatEditText.OnEditorActionListener) objValue);
		
	}
	
	//start - hinttextformat
	private void setHintTextFormat(Object objValue) {
		applyAttributeCommand("hint", CommonConverters.command_textformatter, new String[] {"hintTextFormat"}, true, (String) objValue);
	}
	//end - hinttextformat
	
	private void setFocus(Object objValue) {
		if ((boolean)  objValue) {
			appCompatEditText.requestFocus();
		} else {
			appCompatEditText.clearFocus();
		}
	}

	//end - edittext	
}
