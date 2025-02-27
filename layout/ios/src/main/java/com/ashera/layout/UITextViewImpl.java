package com.ashera.layout;
//start - imports

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import r.android.content.Context;



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

/*-[
#include "java/lang/Integer.h"
#include "java/lang/Float.h"
#include "java/lang/Boolean.h"
#include <UIKit/UIKit.h>
#include "HasLifeCycleDecorators.h"
#include "ASUIScrollView.h"
#include "ASUIView.h"
]-*/

import com.google.j2objc.annotations.Property;

import static com.ashera.widget.IWidget.*;
//end - imports

/*-[
#include "ASUITextView.h"
]-*/
import r.android.widget.TextView;
import r.android.view.KeyEvent;

@SuppressLint("NewApi")
public class UITextViewImpl extends BaseWidget implements ICustomMeasureHeight, ICustomMeasureWidth, com.ashera.validations.FormElement{
	private final static String FOREGROUND_REGEX = "none";
	private final static String VIEW_HOLDER_REGEX = "none";
	private final static String WIDGET_REGEX = null;
	//start - body
	public final static String LOCAL_NAME = "UITextView"; 
	public final static String GROUP_NAME = "EditText";

	protected @Property Object uiView;
	protected r.android.widget.TextView measurableView;		
	
		@SuppressLint("NewApi")
		final static class DrawableTintMode extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("add",  LayoutNativeVars.kCGBlendModeOverlay);
				mapping.put("multiply",  LayoutNativeVars.kCGBlendModeMultiply);
				mapping.put("screen",  LayoutNativeVars.kCGBlendModeScreen);
				mapping.put("src_atop",  LayoutNativeVars.kCGBlendModeSourceAtop);
				mapping.put("src_in",  LayoutNativeVars.kCGBlendModeSourceIn);
				mapping.put("src_over",  LayoutNativeVars.kCGBlendModeNormal);
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
		final static class Capitalize extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("none",  LayoutNativeVars.UITextAutocapitalizationTypeNone);
				mapping.put("words",  LayoutNativeVars.UITextAutocapitalizationTypeWords);
				mapping.put("sentences",  LayoutNativeVars.UITextAutocapitalizationTypeSentences);
				mapping.put("characters",  LayoutNativeVars.UITextAutocapitalizationTypeAllCharacters);
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
		final static class InputType extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("date",  LayoutNativeVars.UIKeyboardTypeDate);
				mapping.put("datetime",  LayoutNativeVars.UIKeyboardTypeDatetime);
				mapping.put("none",  LayoutNativeVars.UIKeyboardTypeNone);
				mapping.put("number",  LayoutNativeVars.UIKeyboardTypeNumber);
				mapping.put("numberDecimal",  LayoutNativeVars.UIKeyboardTypeNumberDecimal);
				mapping.put("numberPassword",  LayoutNativeVars.UIKeyboardTypeNumberPassword);
				mapping.put("numberSigned",  LayoutNativeVars.UIKeyboardTypeNumberSigned);
				mapping.put("phone",  LayoutNativeVars.UIKeyboardTypePhone);
				mapping.put("text",  LayoutNativeVars.UIKeyboardTypeText);
				mapping.put("textAutoComplete",  LayoutNativeVars.UIKeyboardTypeTextAutoComplete);
				mapping.put("textAutoCorrect",  LayoutNativeVars.UIKeyboardTypeTextAutoCorrect);
				mapping.put("textCapCharacters",  LayoutNativeVars.UIKeyboardTypeTextCapCharacters);
				mapping.put("textCapSentences",  LayoutNativeVars.UIKeyboardTypeTextCapSentences);
				mapping.put("textCapWords",  LayoutNativeVars.UIKeyboardTypeTextCapWords);
				mapping.put("textEmailAddress",  LayoutNativeVars.UIKeyboardTypeTextEmailAddress);
				mapping.put("textEmailSubject",  LayoutNativeVars.UIKeyboardTypeTextEmailSubject);
				mapping.put("textFilter",  LayoutNativeVars.UIKeyboardTypeTextFilter);
				mapping.put("textImeMultiLine",  LayoutNativeVars.UIKeyboardTypeTextImeMultiLine);
				mapping.put("textLongMessage",  LayoutNativeVars.UIKeyboardTypeTextLongMessage);
				mapping.put("textMultiLine",  LayoutNativeVars.UIKeyboardTypeTextMultiLine);
				mapping.put("textNoSuggestions",  LayoutNativeVars.UIKeyboardTypeTextNoSuggestions);
				mapping.put("textPassword",  LayoutNativeVars.UIKeyboardTypeTextPassword);
				mapping.put("textPersonName",  LayoutNativeVars.UIKeyboardTypeTextPersonName);
				mapping.put("textPhonetic",  LayoutNativeVars.UIKeyboardTypeTextPhonetic);
				mapping.put("textPostalAddress",  LayoutNativeVars.UIKeyboardTypeTextPostalAddress);
				mapping.put("textShortMessage",  LayoutNativeVars.UIKeyboardTypeTextShortMessage);
				mapping.put("textUri",  LayoutNativeVars.UIKeyboardTypeTextUri);
				mapping.put("textVisiblePassword",  LayoutNativeVars.UIKeyboardTypeTextVisiblePassword);
				mapping.put("textWebEditText",  LayoutNativeVars.UIKeyboardTypeTextWebEditText);
				mapping.put("textWebEmailAddress",  LayoutNativeVars.UIKeyboardTypeTextWebEmailAddress);
				mapping.put("textWebPassword",  LayoutNativeVars.UIKeyboardTypeTextWebPassword);
				mapping.put("time",  LayoutNativeVars.UIKeyboardTypeTime);
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
		final static class ImeOptions extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("actionDone",  LayoutNativeVars.UIReturnKeyTypeActionDone);
				mapping.put("actionGo",  LayoutNativeVars.UIReturnKeyTypeActionGo);
				mapping.put("actionNext",  LayoutNativeVars.UIReturnKeyTypeActionNext);
				mapping.put("actionNone",  LayoutNativeVars.UIReturnKeyTypeActionNone);
				mapping.put("actionPrevious",  LayoutNativeVars.UIReturnKeyTypeActionPrevious);
				mapping.put("actionSearch",  LayoutNativeVars.UIReturnKeyTypeActionSearch);
				mapping.put("actionSend",  LayoutNativeVars.UIReturnKeyTypeActionSend);
				mapping.put("actionUnspecified",  LayoutNativeVars.UIReturnKeyTypeActionUnspecified);
				mapping.put("flagForceAscii",  LayoutNativeVars.UIReturnKeyTypeFlagForceAscii);
				mapping.put("flagNavigateNext",  LayoutNativeVars.UIReturnKeyTypeFlagNavigateNext);
				mapping.put("flagNavigatePrevious",  LayoutNativeVars.UIReturnKeyTypeFlagNavigatePrevious);
				mapping.put("flagNoAccessoryAction",  LayoutNativeVars.UIReturnKeyTypeFlagNoAccessoryAction);
				mapping.put("flagNoEnterAction",  LayoutNativeVars.UIReturnKeyTypeFlagNoEnterAction);
				mapping.put("flagNoExtractUi",  LayoutNativeVars.UIReturnKeyTypeFlagNoExtractUi);
				mapping.put("flagNoFullscreen",  LayoutNativeVars.UIReturnKeyTypeFlagNoFullscreen);
				mapping.put("flagNoPersonalizedLearning",  LayoutNativeVars.UIReturnKeyTypeFlagNoPersonalizedLearning);
				mapping.put("normal",  LayoutNativeVars.UIReturnKeyTypeNormal);
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
		final static class InputView extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("picker",  0x1);
				mapping.put("datepicker",  0x2);
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
	public void loadAttributes(String attributeName) {
		ViewImpl.register(attributeName);


		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosText").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosTextColor").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosUsesStandardTextScaling").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosIsEditable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosAllowsEditingTextAttributes").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosClearsOnInsertion").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosIsSelectable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textIsSelectable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("padding").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingBottom").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingRight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingLeft").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingStart").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingEnd").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingTop").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingHorizontal").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingVertical").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableStart").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableEnd").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTop").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableBottom").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawablePadding").withType("dimension").withOrder(1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTint").withType("colorstate").withUiFlag(UPDATE_UI_INVALIDATE));
		ConverterFactory.register("UITextView.drawableTintMode", new DrawableTintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTintMode").withType("UITextView.drawableTintMode").withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("enabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textColorHighlight").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableIconSize").withType("dimension").withOrder(-1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minLines").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lines").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxLines").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minWidth").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minHeight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxWidth").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxHeight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("height").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("width").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxEms").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minEms").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("ems").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("editable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxLength").withType("int").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		ConverterFactory.register("UITextView.font", new Font());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("typeface").withType("UITextView.font").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		ConverterFactory.register("UITextView.textStyle", new TextStyle());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textStyle").withType("UITextView.textStyle").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("fontFamily").withType("font").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("firstBaselineToTopHeight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lastBaselineToBottomHeight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("autoText").withType("boolean"));
		ConverterFactory.register("UITextView.capitalize", new Capitalize());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("capitalize").withType("UITextView.capitalize"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("cursorVisible").withType("boolean"));
		ConverterFactory.register("UITextView.numeric", new Numeric());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("numeric").withType("UITextView.numeric"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("digits").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("phoneNumber").withType("boolean"));
		ConverterFactory.register("UITextView.inputType", new InputType());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("inputType").withType("UITextView.inputType"));
		ConverterFactory.register("UITextView.imeOptions", new ImeOptions());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("imeOptions").withType("UITextView.imeOptions"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("selectAllOnFocus").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("selectAll").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scrollHorizontally").withType("boolean").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("singleLine").withType("boolean").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosInputAccessoryViewDoneButton").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textAllCaps").withType("boolean").withOrder(-1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("text").withType("resourcestring").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("gravity").withType("gravity").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textSize").withType("dimensionsp").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lineSpacingExtra").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lineSpacingMultiplier").withType("float").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textColorHint").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hint").withType("resourcestring").withOrder(900).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onEditorAction").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onFocusChange").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onTextChange").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onbeforeTextChange").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onafterTextChange").withType("string"));
		ConverterFactory.register("UITextView.inputView", new InputView());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosInputView").withType("UITextView.inputView"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hintTextFormat").withType("resourcestring").withOrder(-1));
	}
	
	public UITextViewImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  UITextViewImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  UITextViewImpl(String groupName, String localname) {
		super(groupName, localname);
	}

@com.google.j2objc.annotations.WeakOuter		
	public class UITextViewExt extends r.android.widget.TextView implements ILifeCycleDecorator{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		private List<IWidget> overlays;
		public IWidget getWidget() {
			return UITextViewImpl.this;
		}

		public UITextViewExt() {
			super(UITextViewImpl.this);
			
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
			ViewImpl.setDrawableBounds(UITextViewImpl.this, l, t, r, b);
			if (!isOverlay()) {
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			nativeMakeFrameForChildWidget(l, t, r, b);
			}
			replayBufferedEvents();
	        ViewImpl.redrawDrawables(UITextViewImpl.this);
	        overlays = ViewImpl.drawOverlay(UITextViewImpl.this, overlays);
			
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
				UITextViewImpl.this.invalidate();
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
        		ViewImpl.drawableStateChanged(UITextViewImpl.this);
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
    		
    		IWidget widget = template.loadLazyWidgets(UITextViewImpl.this.getParent());
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
        	UITextViewImpl.this.getParent().remove(UITextViewImpl.this);
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
			UITextViewImpl.this.setAttribute(name, value, !(value instanceof String));
		}
        @Override
        public void setVisibility(int visibility) {
            super.setVisibility(visibility);
            ViewImpl.nativeSetVisibility(asNativeWidget(), visibility != View.VISIBLE);
            
        }
		  public int getBorderPadding(){
		    return UITextViewImpl.this.getBorderPadding();
		  }

		  public int getLineHeight(){
		    return UITextViewImpl.this.getLineHeight();
		  }

		  public int getBorderWidth(){
		    return UITextViewImpl.this.getBorderWidth();
		  }
		  public int getLineHeightPadding(){
		    return UITextViewImpl.this.getLineHeightPadding();
		  }
        @Override
        public int nativeMeasureWidth(java.lang.Object uiView) {
        	return ViewImpl.nativeMeasureWidth(uiView);
        }
        
        @Override
        public int nativeMeasureHeight(java.lang.Object uiView, int width) {
        	return ViewImpl.nativeMeasureHeight(uiView, width);
        }
        @Override
        public int computeSize(float width) {
        	return nativeMeasureHeight(uiView, (int) width);
    	}
		@Override
		public java.lang.String getText() {
			return (String) getMyText();
		}

        
    	public void setState0(Object value) {
    		ViewImpl.setState(UITextViewImpl.this, 0, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(UITextViewImpl.this, 1, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(UITextViewImpl.this, 2, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(UITextViewImpl.this, 3, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(UITextViewImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(UITextViewImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(UITextViewImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(UITextViewImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(UITextViewImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(UITextViewImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(UITextViewImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(UITextViewImpl.this);
        }
     
	
	}	@Override
	public Class getViewClass() {
		return UITextViewExt.class;
	}

	@Override
	public IWidget newInstance() {
		return new UITextViewImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
		measurableView = new UITextViewExt();
		createSimpleWrapableView();
		nativeCreate(params);	
		ViewImpl.registerCommandConveter(this);
		setWidgetOnNativeClass();
	}
	private native void setWidgetOnNativeClass() /*-[
		((ASUITextView*) self.uiView).widget = self;
	]-*/;

	@Override
	@SuppressLint("NewApi")
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		Object nativeWidget = simpleWrapableView.getWrappedView();
		ViewImpl.setAttribute(this, simpleWrapableView, key, strValue, objValue, decorator);
		
		switch (key.getAttributeName()) {
			case "iosText": {
				


		setText(nativeWidget, objValue);



			}
			break;
			case "iosTextColor": {
				


		setTextColor(nativeWidget, objValue);



			}
			break;
			case "iosUsesStandardTextScaling": {
				
if (checkIosVersion("13.0")) {

		setUsesStandardTextScaling(nativeWidget, objValue);

}

			}
			break;
			case "iosIsEditable": {
				


		setIsEditable(nativeWidget, objValue);



			}
			break;
			case "iosAllowsEditingTextAttributes": {
				


		setAllowsEditingTextAttributes(nativeWidget, objValue);



			}
			break;
			case "iosClearsOnInsertion": {
				


		setClearsOnInsertion(nativeWidget, objValue);



			}
			break;
			case "textIsSelectable":
			case "iosIsSelectable": {
				


		setIsSelectable(nativeWidget, objValue);



			}
			break;
			case "padding": {
				


		setPadding(objValue);



			}
			break;
			case "paddingBottom": {
				


		setPaddingBottom(objValue);



			}
			break;
			case "paddingRight": {
				


		setPaddingRight(objValue);



			}
			break;
			case "paddingLeft": {
				


		setPaddingLeft(objValue);



			}
			break;
			case "paddingStart": {
				


		setPaddingStart(objValue);



			}
			break;
			case "paddingEnd": {
				


		setPaddingEnd(objValue);



			}
			break;
			case "paddingTop": {
				


		setPaddingTop(objValue);



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
			case "drawableStart": {
				


		setDrawableLeft("drawableStart", objValue);



			}
			break;
			case "drawableEnd": {
				


		setDrawableRight("drawableEnd", objValue);



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
			case "drawablePadding": {
				


		 setDrawablePadding(objValue); 



			}
			break;
			case "drawableTint": {
				


		setDrawableTint(objValue);



			}
			break;
			case "drawableTintMode": {
				


		setDrawableTintMode(objValue);



			}
			break;
			case "enabled": {
				


		 setEnabled(objValue);



			}
			break;
			case "textColorHighlight": {
				


		setTextColorHighlight(objValue);



			}
			break;
			case "drawableIconSize": {
				


		setDrawableIconSize(objValue);



			}
			break;
			case "minLines": {
				


		 setMinLines(objValue); 



			}
			break;
			case "lines": {
				


		 setLines(objValue); 



			}
			break;
			case "maxLines": {
				


		 setMaxLines(objValue); 



			}
			break;
			case "minWidth": {
				


		 setMinWidth(objValue); 



			}
			break;
			case "minHeight": {
				


		 setMinHeight(objValue); 



			}
			break;
			case "maxWidth": {
				


		 setMaxWidth(objValue); 



			}
			break;
			case "maxHeight": {
				


		 setMaxHeight(objValue); 



			}
			break;
			case "height": {
				


		 setHeight(objValue); 



			}
			break;
			case "width": {
				


		 setWidth(objValue); 



			}
			break;
			case "maxEms": {
				


		 setMaxEms(objValue); 



			}
			break;
			case "minEms": {
				


		 setMinEms(objValue); 



			}
			break;
			case "ems": {
				


		 setEms(objValue); 



			}
			break;
			case "editable": {
				


		 setEnabled(objValue);



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
			case "firstBaselineToTopHeight": {
				


		setFirstBaselineToTopHeight(objValue);



			}
			break;
			case "lastBaselineToBottomHeight": {
				


		setLastBaselineToBottomHeight(objValue);



			}
			break;
			case "autoText": {
				


		setAutoText(objValue);



			}
			break;
			case "capitalize": {
				


		setCapitalize(objValue);



			}
			break;
			case "cursorVisible": {
				


		setCursorVisible(objValue);



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
			case "phoneNumber": {
				


		setPhoneNumber(objValue);



			}
			break;
			case "inputType": {
				


		setInputType(objValue);



			}
			break;
			case "imeOptions": {
				


		 setImeOptions(objValue, strValue);



			}
			break;
			case "selectAllOnFocus": {
				


		setSelectAllOnFocus(objValue);



			}
			break;
			case "selectAll": {
				


		setSelectAll(objValue);



			}
			break;
			case "scrollHorizontally": {
				


		 setScrollHorizontally(objValue);



			}
			break;
			case "singleLine": {
				


		 setSingleLine(objValue);



			}
			break;
			case "iosInputAccessoryViewDoneButton": {
				


		setInputAccessoryViewDoneButton(objValue);



			}
			break;
			case "textColor": {
				


		setTextColor(objValue);



			}
			break;
			case "textAllCaps": {
				


		 setTextAllCaps(objValue);



			}
			break;
			case "text": {
				


		setMyText(objValue);



			}
			break;
			case "gravity": {
				


		setGravity(objValue);



			}
			break;
			case "textSize": {
				


		setMyTextSize(objValue);



			}
			break;
			case "lineSpacingExtra": {
				


		 setLineSpacingExtra(objValue);



			}
			break;
			case "lineSpacingMultiplier": {
				


		 setLineSpacingMultiplier(objValue);



			}
			break;
			case "textColorHint": {
				


		 setHintColor(objValue);



			}
			break;
			case "hint": {
				


		 setHint(objValue);



			}
			break;
			case "onEditorAction": {
				


		 setOnEditorAction(objValue);



			}
			break;
			case "onFocusChange": {
				


		 setOnFocus(objValue);



			}
			break;
			case "onTextChange": {
				


		 setOnTextChange(objValue);



			}
			break;
			case "onbeforeTextChange": {
				


		 setBeforeOnTextChange(objValue);



			}
			break;
			case "onafterTextChange": {
				


		 setOnAfterTextChange(objValue);



			}
			break;
			case "iosInputView": {
				


		 setInputView(objValue);



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
		Object nativeWidget = simpleWrapableView.getWrappedView();
		Object attributeValue = ViewImpl.getAttribute(this, nativeWidget, key, decorator);
		if (attributeValue != null) {
			return attributeValue;
		}
		switch (key.getAttributeName()) {
			case "iosText": {
return getText();				}
			case "iosTextColor": {
return getTextColor();				}
			case "iosUsesStandardTextScaling": {
if (checkIosVersion("13.0")) {
return getUsesStandardTextScaling();
}
break;				}
			case "iosIsEditable": {
return getIsEditable();				}
			case "iosAllowsEditingTextAttributes": {
return getAllowsEditingTextAttributes();				}
			case "iosClearsOnInsertion": {
return getClearsOnInsertion();				}
			case "textIsSelectable":
			case "iosIsSelectable": {
return getIsSelectable();				}
			case "paddingBottom": {
return getPaddingBottom();				}
			case "paddingRight": {
return getPaddingRight();				}
			case "paddingLeft": {
return getPaddingLeft();				}
			case "paddingStart": {
return getPaddingStart();				}
			case "paddingEnd": {
return getPaddingEnd();				}
			case "paddingTop": {
return getPaddingTop();				}
			case "drawablePadding": {
return this.getDrawablePadding();				}
			case "textColorHighlight": {
return getTextColorHighlight();				}
			case "minLines": {
return getMinLines();				}
			case "maxLines": {
return getMaxLines();				}
			case "minWidth": {
return getMinWidth();				}
			case "minHeight": {
return getMinHeight();				}
			case "maxWidth": {
return getMaxWidth();				}
			case "maxHeight": {
return getMaxHeight();				}
			case "height": {
return getHeight();				}
			case "width": {
return getWidth();				}
			case "maxEms": {
return getMaxEms();				}
			case "minEms": {
return getMinEms();				}
			case "firstBaselineToTopHeight": {
return getFirstBaselineToTopHeight();				}
			case "lastBaselineToBottomHeight": {
return getLastBaselineToBottomHeight();				}
			case "cursorVisible": {
return getCursorVisible();				}
			case "inputType": {
return getInputType();				}
			case "imeOptions": {
return getImeOptions();				}
			case "textColor": {
return getTextColorState();				}
			case "text": {
return getMyText();				}
			case "gravity": {
return getGravity();				}
			case "textSize": {
return getTextSize();				}
			case "lineSpacingExtra": {
return getLineSpacingExtra();				}
			case "lineSpacingMultiplier": {
return getLineSpacingMultiplier();				}
			case "hint": {
return getHint();				}
			case "onTextChange": {
return this.textWatchers == null ? null:this.textWatchers.get(key.getAttributeName());				}
		}
		
		return null;
	}
	
	@Override
	public Object asWidget() {
		return measurableView;
	}

	

    private void setGravity(Object objValue) {
        int value = (int) objValue;
        measurableView.setGravity(value);
        int major = value & GravityConverter.VERTICAL_GRAVITY_MASK;
        updateTextAlignment();

        switch (major) {
        case GravityConverter.TOP:
            setVerticalAligmentTop();
            break;
        case GravityConverter.BOTTOM:
            setVerticalAligmentBottom();
            break;
        case GravityConverter.CENTER_VERTICAL:
            setVerticalAligmentCenter();
            break;
        default:
        	// default is vertical top
        	setVerticalAligmentTop();
            break;
        }

    }

	private void updateTextAlignment() {
		r.android.text.Layout.Alignment minor = measurableView.getAlignmentOfLayout();
		boolean isRtl = false;
		boolean hasTextDirection = measurableView.getRawTextDirection() != 0;
		if (hasTextDirection ) {
			r.android.text.TextDirectionHeuristic heuristic =  measurableView.getTextDirectionHeuristic();
			String text = (String) getMyText();
			isRtl = heuristic.isRtl(text, 0, text.length());
		}

        switch (minor) {
        case ALIGN_LEFT:
        	setHorizontalAligmentLeft();
        	break;
        case ALIGN_NORMAL:
        	if (hasTextDirection) {
        		if (isRtl) {
        			setHorizontalAligmentRight();
        		} else {
        			setHorizontalAligmentLeft();
        		}
        	}  else {
        		setHorizontalAligmentLeft();
        	}
            break;
        case ALIGN_RIGHT:
        	setHorizontalAligmentRight();
        	break;
        case ALIGN_OPPOSITE:
        	if (hasTextDirection) {
        		if (isRtl) {
        			setHorizontalAligmentLeft();
        		} else {
        			setHorizontalAligmentRight();
        		}
        	} else {
        		setHorizontalAligmentRight();
        	}
            break;
        case ALIGN_CENTER:
            setHorizontalAligmentCenter();
            break;
        default:
        	// default is horizontal left
        	setHorizontalAligmentLeft();
            break;
        }
	}
    
	
	private Object getGravity() {
		com.ashera.view.BaseMeasurableView.VerticalAligment verticalAligment = measurableView.getVerticalAligment();
		if (verticalAligment == null) {
			verticalAligment = com.ashera.view.BaseMeasurableView.VerticalAligment.top;
		}
		int gravityVertical = 0;
		switch (verticalAligment) {
        case top:
        	gravityVertical = GravityConverter.TOP;
            break;
        case middle:
        	gravityVertical = GravityConverter.CENTER_VERTICAL;
            break;
        case bottom:
        	gravityVertical = GravityConverter.BOTTOM;
            break;
        default:
            //
            break;
        }
		int aligment = getTextAlignment();
		int gravitHorizontal = 0;
		switch (aligment) {
        case TEXT_ALIGN_CENTER:
        	gravitHorizontal = GravityConverter.CENTER_HORIZONTAL;
            break;
        case TEXT_ALIGN_LEFT:
        	gravitHorizontal = GravityConverter.LEFT;
            break;
        case TEXT_ALIGN_RIGHT:
        	gravitHorizontal = GravityConverter.RIGHT;
            break;
        default:
            break;
		}
		int gravity = gravitHorizontal | gravityVertical;
		return gravity;
	}
	
	public void onRtlPropertiesChanged(int layoutDirection) {
		if (measurableView.getRawTextAlignment() != 0 || measurableView.getRawLayoutDirection() != 0) {
			updateTextAlignment();
		}
	}

	


	private void setDrawableIconSize(Object objValue) {
		applyAttributeCommand("drawableStart", "drawableIconSize", new String[] {"drawableIconSize"}, true, objValue);
		applyAttributeCommand("drawableEnd", "drawableIconSize", new String[] {"drawableIconSize"}, true, objValue);
		applyAttributeCommand("drawableTop", "drawableIconSize", new String[] {"drawableIconSize"}, true, objValue);
		applyAttributeCommand("drawableBottom", "drawableIconSize", new String[] {"drawableIconSize"}, true, objValue);
	}
	


    private Object getMinHeight() {
        return measurableView.getMinHeight();
    }

    private Object getMinWidth() {
        return measurableView.getMinWidth();
    }
    
    private void setEms(Object objValue) {
        setMinEms(objValue);
        setMaxEms(objValue);
    }
    
    
    public int getMaxEms() {
        return measurableView.getMaxEms();
    }
    public int getMinEms() {
        return measurableView.getMinEms();
    }

    private void setMinEms(Object objValue) {
    	measurableView.setMinEms((int) objValue);
        addMinMaxListener();
    }
    
    public int getMinLines() {
        return measurableView.getMinLines();
    }
    
    public int getMaxLines() {
        return measurableView.getMaxLines();
    }

    private void setMaxEms(Object objValue) {
    	measurableView.setMaxEms((int) objValue);
        addMinMaxListener();
    }

    private void setWidth(Object objValue) {
        setMinWidth(objValue);
        setMaxWidth(objValue);
    }

    private void setHeight(Object objValue) {
        setMinHeight(objValue);
        setMaxHeight(objValue);
    }

    private void setMaxLines(Object objValue) {
    	measurableView.setMaxLines((int) objValue);
        addMinMaxListener();
    }

    private void setLines(Object objValue) {
        setMinLines(objValue);
        setMaxLines(objValue);
    }

    private void setMinLines(Object objValue) {
    	measurableView.setMinLines((int) objValue);
        addMinMaxListener();
    
    }
    
    private void setMaxHeight(Object objValue) {
    	measurableView.setMaxHeight((int) objValue);
        addMinMaxListener();
    }

    private void setMaxWidth(Object objValue) {
    	measurableView.setMaxWidth((int) objValue);
        addMinMaxListener();
    }

    public int getMaxWidth() {
        return measurableView.getMaxWidth();
    }

    public int getMaxHeight() {
        return measurableView.getMaxHeight();
    }
    
    
    private void setMinHeight(Object objValue) {
    	measurableView.setMinHeight((int) objValue);
        addMinMaxListener();
    }

    private void setMinWidth(Object objValue) {
    	measurableView.setMinWidth((int) objValue);
        addMinMaxListener();
    }

    
    private Object getWidth() {
        return measurableView.getWidth();
    }

    private int getHeight() {
        return measurableView.getHeight();
    }

    
    


    private Map<String, com.ashera.model.FontDescriptor> fontDescriptors ;

    private void setTypeFace(Object objValue, String strValue) {
        setFontFamily(objValue, strValue);
    }
    
    private void setFontFamily(Object objValue, String strValue) {
        if (objValue instanceof Integer) {
            objValue = PluginInvoker.convertFrom(ConverterFactory.get(CommonConverters.font), null, strValue, fragment);
        }
        this.fontDescriptors = (Map<String, com.ashera.model.FontDescriptor>) objValue;
		int style = nativeGetFontStyle();
		int height = nativeGetFontSize();
        
        String weight = "400";
        if ((style & BOLD_FONT_TRAIT) != 0) {
            weight = "700";
        }
        String fontStyle = "normal";
        if ((style & ITALIC_FONT_TRAIT) != 0) {
            fontStyle = "italic";
        }
        com.ashera.model.FontDescriptor fontDescriptor = fontDescriptors.get(fontStyle + "_" + weight);
        nativeSetCustomFont(height, fontDescriptor);
    }

    
    private void setTextStyle(Object objValue) {
        int value = (int)objValue;

        if (fontDescriptors != null) {
            int height = nativeGetFontSize();
            
            String weight = "400";
            if ((value & 0x1) != 0) {
                weight = "700";
            }
            String fontStyle = "normal";
            if ((value & 0x2) != 0) {
                fontStyle = "italic";
            }
            com.ashera.model.FontDescriptor fontDescriptor = fontDescriptors.get(fontStyle + "_" + weight);
            nativeSetCustomFont(height, fontDescriptor);
        } else {
            int style = NORMAL_FONT_TRAIT; 
            if ((value & 0x1) != 0) {
                style = style | BOLD_FONT_TRAIT;
            }
            if ((value & 0x2) != 0) {
                style = style | ITALIC_FONT_TRAIT;
            }       
            nativeSetFontStyle(style);
        }

    }
	


	private void setFirstBaselineToTopHeight(Object objValue) {
		com.ashera.model.FontMetricsDescriptor fontMetrics = PluginInvoker.getFontMetrics(getFont());
		int firstBaselineToTopHeight = (int) objValue;

		final int fontMetricsTop;
        if (getIncludeFontPadding()) {
            fontMetricsTop = fontMetrics.top;
        } else {
            fontMetricsTop = fontMetrics.ascent;
        }

        // TODO: Decide if we want to ignore density ratio (i.e. when the user changes font size
        // in settings). At the moment, we don't.
        if (firstBaselineToTopHeight > Math.abs(fontMetricsTop)) {
            final int paddingTop = firstBaselineToTopHeight - (-fontMetricsTop);
            measurableView.setPadding((int) getPaddingLeft(), paddingTop, (int) getPaddingRight(), (int) getPaddingBottom());
        }
	}
	
	
	private boolean getIncludeFontPadding() {
		return false;
	}

	private Object getFirstBaselineToTopHeight() {
		com.ashera.model.FontMetricsDescriptor fontMetrics = PluginInvoker.getFontMetrics(getFont());
		return (int) getPaddingTop() - fontMetrics.top;
	}
	
	
	private void setLastBaselineToBottomHeight(Object objValue) {
		com.ashera.model.FontMetricsDescriptor fontMetrics = PluginInvoker.getFontMetrics(getFont());
		int lastBaselineToBottomHeight = (int) objValue;

        final int fontMetricsBottom;
        if (getIncludeFontPadding()) {
            fontMetricsBottom = fontMetrics.bottom;
        } else {
            fontMetricsBottom = fontMetrics.descent;
        }

        // TODO: Decide if we want to ignore density ratio (i.e. when the user changes font size
        // in settings). At the moment, we don't.

        if (lastBaselineToBottomHeight > Math.abs(fontMetricsBottom)) {
            final int paddingBottom = lastBaselineToBottomHeight - fontMetricsBottom;
            measurableView.setPadding((int) getPaddingLeft(), (int) getPaddingTop(), (int) getPaddingRight(), paddingBottom);
        }		
	}
	
	private Object getLastBaselineToBottomHeight() {
		com.ashera.model.FontMetricsDescriptor fontMetrics = PluginInvoker.getFontMetrics(getFont());
		return (int) getPaddingBottom() + fontMetrics.bottom;
	}
	


	private boolean html;
	private boolean escapeHtml;
	private Map<String, Object> htmlConfig;
	private void initHtml(Map<String, Object> params) {
		if (params.containsKey("html")) {
			html = params.get("html").equals("true");
			if (html) {
				htmlConfig = new HashMap<>();
			} else {
				if (escapeHtml) {
					applyAttributeCommand("text", CommonConverters.command_escapehtml, new String[] {}, true);
				}
			}
		}
	}
	


	private float mSpacingAdd;
	private float mSpacingMult;
	private void setLineSpacingMultiplier(Object objValue) {
		mSpacingMult = (float) objValue;
		setLineSpacing();
	}

	private void setLineSpacingExtra(Object objValue) {
		mSpacingAdd = (float) objValue;
		setLineSpacing();
	}
	
	private Object getLineSpacingMultiplier() {
		return mSpacingMult;
	}

	private Object getLineSpacingExtra() {
		return mSpacingAdd;
	}
	


    private java.util.Locale locale = java.util.Locale.getDefault();


	private String getDigitString() {
		String defaultDigits = "0123456789";
		final String[] digits = getDigitStrings();
		StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            if (digits[i].length() > 1) { // multi-codeunit digits. Not supported.
                return defaultDigits;
            }
            stringBuilder.append(Character.valueOf(digits[i].charAt(0)));
        }
        
        return stringBuilder.toString();
	}
	private String getSignedChars() {
		String defaultSignedChars = "\\+\\-";
		final String minusString = getMinusString();
		final String plusString = getPlusString();
        if (minusString.length() > 1 || plusString.length() > 1) {
            // non-BMP and multi-character signs are not supported.
            return defaultSignedChars;
        }
        String minus = minusString;
        String plus = plusString;
        if (regexSpecialCharacters.contains(minus)) {
        	minus = "\\" + minus;
        }
        
        if (regexSpecialCharacters.contains(plus)) {
        	plus = "\\" + plus;
        }
        
        return plus + minus;
	}

	
	private String getDecimalChars() {
		String defaultDecimalChars = "\\.";

		final String separatorString = getDecimalCharacter();
         if (separatorString.length() > 1) {
             // non-BMP and multi-character decimal separators are not supported.
             return defaultDecimalChars;
         }
         String decimal = separatorString;
         if (regexSpecialCharacters.contains(decimal)) {
        	 decimal = "\\" + decimal;
         }
         
         return decimal;
	}

	
	private static List<String> regexSpecialCharacters = java.util.Arrays.asList("\\", ".", "+", "*", "?", "[", "^", "]", "$", "(", ")", "{", "}", "=", "!", "<", ">", "|", ":", "-");

	private void setNumeric(Object objValue) {
		int value = (int) objValue;
		removeNumericListener();
		StringBuilder regex = new StringBuilder();
    	String digits = getDigitString();

    	if ((value & 0x3) != 1) {
    		final String signedChars = getSignedChars();
    		regex.append(String.format("[%s]?", signedChars)); 
    	}

    	if ((value & 0x5) != 1) {
    		String decimalChars = getDecimalChars();
    		regex.append(String.format("[%s]*[%s]?[%s]*", digits, decimalChars, digits)); 
    	} else {
    		regex.append(String.format("[%s]*", digits)); 
    	}
		if (regex.length() > 0) {
        	java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex.toString());
			addNumericListener(pattern);
		}

	}
   

    private void setDigits(Object objValue) {
        removeNumericListener();
        StringBuilder regex = new StringBuilder();
        String digits = (String) objValue;
        regex.append(String.format("[%s]*", digits));
        if (regex.length() > 0) {
            java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex.toString());
            addNumericListener(pattern);
        }

    }
    
    


	@Override
	public void drawableStateChanged() {
		super.drawableStateChanged();
		drawableStateChange("bottom", measurableView.getBottomDrawable());
		drawableStateChange("left", measurableView.getLeftDrawable());
		drawableStateChange("right", measurableView.getRightDrawable());
		drawableStateChange("top", measurableView.getTopDrawable());
		
		if (measurableView.getTextColors() != null && measurableView.getTextColors().isStateful()) {
			setTextColor(measurableView.getCurrentTextColor());
		}
		
		if (measurableView.getHintTextColors() != null && measurableView.getHintTextColors().isStateful()) {
			setHintColor(measurableView.getCurrentHintTextColor());
			syncPlaceholderLabel();
		}
		
		if (drawableTint != null && drawableTint.isStateful()) {
			setDrawableTint(drawableTint);
			invalidate();
		}
		
		if (measurableView.getLinkTextColors() != null && measurableView.getLinkTextColors().isStateful()) {
			setTextColorLink(measurableView.getLinkTextColors());
		}
	}

	private void drawableStateChange(String type, r.android.graphics.drawable.Drawable dr) {
		final int[] state = measurableView.getDrawableState();

		if (dr != null && dr.isStateful() && dr.setState(state)) {
			switch (type) {
			case "bottom":
				setDrawableBottom(dr);
				break;
			case "top":
				setDrawableTop(dr);
				break;
			case "left":
				setDrawableLeft("drawableLeft", dr);
				break;
			case "right":
				setDrawableRight("drawableRight", dr);
				break;
			default:
				break;
			}

		}
		invalidate();
	}
	


	

	private void handleHtmlText(String text) {
		nativeSetHtmlText(com.ashera.parser.html.Html.fromHtml(text, htmlConfig, fragment).get());
	}
	private native void nativeSetText(String text)/*-[
		[((ASUITextView*)self->uiView_) setText:text];
	]-*/;
	
	private native void nativeSetHtmlText(Object text)/*-[
		[((ASUITextView*)self->uiView_) setAttributedText : (NSMutableAttributedString*)text];
	]-*/;
	
	private native Object getMyText() /*-[
		return ((ASUITextView*)self.uiView).text;
	]-*/;
	


	private native Object getTextSize() /*-[
		  return [JavaLangFloat valueOfWithFloat:((ASUITextView*)self.uiView).font.pointSize];
	]-*/;
	private void setMyTextSize(Object objValue) {
		float fontSize = ((float) objValue) * getFragment().getRootActivity().getScaleFactor();
		nativeSetTextSize((int) fontSize);
	}
	
	private native void nativeSetTextSize(int value)/*-[
		[((ASUITextView*)self.uiView) setFont: [((ASUITextView*)self.uiView).font fontWithSize: value]];
	]-*/;
	


	//start - aligmentgravity
	private void setVerticalAligmentCenter() {
		measurableView.setVerticalAligment(com.ashera.view.BaseMeasurableView.VerticalAligment.middle);
		nativeSetVerticalAligmentCenter();
	}


	private void setVerticalAligmentBottom() {
		measurableView.setVerticalAligment(com.ashera.view.BaseMeasurableView.VerticalAligment.bottom);
		nativeSetVerticalAligmentBottom();
	}

	private void setVerticalAligmentTop() {
		measurableView.setVerticalAligment(com.ashera.view.BaseMeasurableView.VerticalAligment.top);
		nativeSetVerticalAligmentTop();
	}


	private native void setHorizontalAligmentCenter() /*-[
		((ASUITextView*)self.uiView).textAlignment = NSTextAlignmentCenter;
	]-*/;
	
	private void setHorizontalAligmentRight()  {
		setHorizontalAligmentRightInternal();
	}

	private native void setHorizontalAligmentRightInternal() /*-[
		((ASUITextView*)self.uiView).textAlignment = NSTextAlignmentRight;
	]-*/;

	private void setHorizontalAligmentLeft() {
		setHorizontalAligmentLeftInternal();
	}
	
	private native void setHorizontalAligmentLeftInternal() /*-[
		((ASUITextView*)self.uiView).textAlignment = NSTextAlignmentLeft;
	]-*/;

	private static final int TEXT_ALIGN_CENTER = 2; 
	private static final int TEXT_ALIGN_LEFT = 0; 
	private static final int TEXT_ALIGN_RIGHT = 1; 

    private native int getTextAlignment() /*-[
    	int alignment = (int) ((ASUITextView*)self.uiView).textAlignment;
    	
    	if (alignment == NSTextAlignmentCenter) {
    		return 2;
    	}
    	
    	if (alignment == NSTextAlignmentLeft) {
    		return 0;
    	}
    	
    	if (alignment == NSTextAlignmentRight) {
    		return 1;
    	}

		return 0;
	]-*/;
    //end - aligmentgravity

	private void nativeSetVerticalAligmentBottom() {
	}

	private void nativeSetVerticalAligmentTop() {
	}
	

	private void nativeSetVerticalAligmentCenter() {
	}
	


	private void setDrawablePadding(Object objValue) {
		measurableView.setDrawablePadding((int) objValue);
		updatePadding();
	}

	private void setDrawableBottom(Object objValue) {
		if ("@null".equals(objValue)) {
			measurableView.setBottomDrawable(null);
			applyAttributeCommand("drawableBottom", "drawDrawableIcon", new String[] {}, false, "bottom");
		} else if (objValue != null && objValue instanceof r.android.graphics.drawable.Drawable) {
			measurableView.setBottomDrawable((r.android.graphics.drawable.Drawable) objValue);
			applyAttributeCommand("drawableBottom", "drawDrawableIcon", new String[] {}, true, "bottom");
			updatePadding();
		}
	}

	private void setDrawableTop(Object objValue) {
		if ("@null".equals(objValue)) {
			measurableView.setTopDrawable(null);
			applyAttributeCommand("drawableTop", "drawDrawableIcon", new String[] {}, false, "top");
		} else if (objValue != null && objValue instanceof r.android.graphics.drawable.Drawable) {
			measurableView.setTopDrawable((r.android.graphics.drawable.Drawable) objValue);
			applyAttributeCommand("drawableTop", "drawDrawableIcon", new String[] {}, true, "top");
			updatePadding();
		}
	}

	private void setDrawableRight(String originalAttr, Object objValue) {
		if (ViewImpl.isRTLLayout(this)) {
			setDrawableLeftInternal(originalAttr, objValue);
		} else {
			setDrawableRightInternal(originalAttr, objValue);
		}
	}

	private void setDrawableRightInternal(String originalAttr, Object objValue) {
		if ("@null".equals(objValue)) {
			measurableView.setRightDrawable(null);
			applyAttributeCommand(originalAttr, "drawDrawableIcon", new String[] {}, false, "right");
		} else if (objValue != null && objValue instanceof r.android.graphics.drawable.Drawable) {
			measurableView.setRightDrawable((r.android.graphics.drawable.Drawable) objValue);
			applyAttributeCommand(originalAttr, "drawDrawableIcon", new String[] {}, true, "right");
			updatePadding();
		}		
	}

	private void setDrawableLeft(String originalAttr, Object objValue) {
		if (objValue != null) {
			if (ViewImpl.isRTLLayout(this)) {
				setDrawableRightInternal(originalAttr, objValue);
			} else {
				setDrawableLeftInternal(originalAttr, objValue);
			}
		}
	}

	private void setDrawableLeftInternal(String originalAttr, Object objValue) {
		if ("@null".equals(objValue)) {
			measurableView.setLeftDrawable(null);
			applyAttributeCommand(originalAttr, "drawDrawableIcon", new String[] {}, false, "left");
		} else if (objValue != null && objValue instanceof r.android.graphics.drawable.Drawable) {
			measurableView.setLeftDrawable((r.android.graphics.drawable.Drawable) objValue);
			applyAttributeCommand(originalAttr, "drawDrawableIcon", new String[] {}, true, "left");
			updatePadding();
		}
	}

	private native int getImageHeight(Object objValue) /*-[
		if ([objValue isKindOfClass:[UIImage class]]) {
	    	UIImage* image = ((UIImage*) objValue);
	    	return image.size.height;
	   	}
	   	
	   	return 0;
	]-*/;	
	
	private native int getImageWidth(Object objValue) /*-[
    	if ([objValue isKindOfClass:[UIImage class]]) {
        	UIImage* image = ((UIImage*) objValue);
        	return image.size.width;
       	}
       	
       	return 0;
	]-*/;

	private Object getDrawablePadding() {
		return measurableView.getDrawablePadding();
	}

	private void setDrawableTintMode(Object value) {
		if (measurableView.getLeftDrawable() != null) {
			applyAttributeCommand("drawableStart", "cgTintColor", new String[] {"drawableTintMode"}, true, "drawableTintMode", value);
			applyAttributeCommand("drawableLeft", "cgTintColor", new String[] {"drawableTintMode"}, true, "drawableTintMode", value);
		}
		if (measurableView.getRightDrawable() != null) {
			applyAttributeCommand("drawableRight", "cgTintColor", new String[] {"drawableTintMode"}, true, "drawableTintMode", value);
			applyAttributeCommand("drawableEnd", "cgTintColor", new String[] {"drawableTintMode"}, true, "drawableTintMode", value);
		}
		
		if (measurableView.getTopDrawable() != null) {
			applyAttributeCommand("drawableTop", "cgTintColor", new String[] {"drawableTintMode"}, true, "drawableTintMode", value);
		}
		if (measurableView.getBottomDrawable() != null) {
			applyAttributeCommand("drawableBottom", "cgTintColor", new String[] {"drawableTintMode"}, true, "drawableTintMode", value);
		}
	}
	private r.android.content.res.ColorStateList drawableTint; 
	private void setDrawableTint(Object objValue) {
		if (objValue instanceof r.android.content.res.ColorStateList) {
			r.android.content.res.ColorStateList colorStateList = (r.android.content.res.ColorStateList) objValue;
			this.drawableTint = colorStateList;
			objValue = drawableTint.getColorForState(measurableView.getDrawableState(), r.android.graphics.Color.RED);
		}
		
		if (measurableView.getLeftDrawable() != null) {
			applyAttributeCommand("drawableLeft", "cgTintColor", new String[] {"drawableTint"}, true, "drawableTint", ViewImpl.getColor(objValue));
			applyAttributeCommand("drawableStart", "cgTintColor", new String[] {"drawableTint"}, true, "drawableTint", ViewImpl.getColor(objValue));
		}
		if (measurableView.getRightDrawable() != null) {
			applyAttributeCommand("drawableRight", "cgTintColor", new String[] {"drawableTint"}, true, "drawableTint", ViewImpl.getColor(objValue));			
			applyAttributeCommand("drawableEnd", "cgTintColor", new String[] {"drawableTint"}, true, "drawableTint", ViewImpl.getColor(objValue));
		}
		if (measurableView.getTopDrawable() != null) {
			applyAttributeCommand("drawableTop", "cgTintColor", new String[] {"drawableTint"}, true, "drawableTint", ViewImpl.getColor(objValue));
		}
		if (measurableView.getBottomDrawable() != null) {
			applyAttributeCommand("drawableBottom", "cgTintColor", new String[] {"drawableTint"}, true, "drawableTint", ViewImpl.getColor(objValue));
		}
	}
	
	


	private static int ITALIC_FONT_TRAIT = LayoutNativeVars.UIFontDescriptorTraitItalic;
	private static int BOLD_FONT_TRAIT = LayoutNativeVars.UIFontDescriptorTraitBold;
	private static final int NORMAL_FONT_TRAIT = 0;
	
    private int nativeGetFontSize() {
    	return (int) Math.ceil((float)getTextSize());
    }
    
    private native int nativeGetFontStyle() /*-[	 
    	ASUITextView* label = ((ASUITextView*)self->uiView_);
    	return label.font.fontDescriptor.symbolicTraits;
   	]-*/;
    private native void nativeSetCustomFont(int height, com.ashera.model.FontDescriptor fontDescriptor) /*-[	
    	ASUITextView* label = ((ASUITextView*)self->uiView_);
     	UIFont* font = [UIFont fontWithName:[fontDescriptor getName] size:height];
     	if (font == nil) {
        	[NSException raise:@"InitNotImplemented" format:@"%@", [NSString stringWithFormat:@"Failed to load the %@ font. Make sure the font file is included in the project and the font name is spelled correctly.", [fontDescriptor getName]]];
    	}
     	if ([fontDescriptor getStyle] != 0) {
	      UIFontDescriptor* fontD = [font.fontDescriptor fontDescriptorWithSymbolicTraits:[fontDescriptor getStyle]];
	      ((ASUITextView*)label).font = [UIFont fontWithDescriptor:fontD size:0];
	    } else {
	        ((ASUITextView*)label).font = font;
	    }
    ]-*/;
    
    private native void nativeSetFontStyle(int style) /*-[
		ASUITextView* label = ((ASUITextView*)self->uiView_);
  		UIFontDescriptor* fontD = [label.font.fontDescriptor fontDescriptorWithSymbolicTraits:style];
  		((ASUITextView*)label).font = [UIFont fontWithDescriptor:fontD size:0];
	]-*/;
    


	private void setTextColor(Object objValue) {
		if (objValue instanceof r.android.content.res.ColorStateList) {
			r.android.content.res.ColorStateList colorStateList = (r.android.content.res.ColorStateList) objValue;
			measurableView.setTextColor(colorStateList);
			objValue = measurableView.getCurrentTextColor();
		}
		
		setTextColor(uiView, ViewImpl.getColor(objValue));
	}
	
	private Object getTextColorState() {
		return measurableView.getTextColors();
	}
	


	public int getBorderPadding() {return paddingTop + paddingBottom;}
	
	public int getLineHeightPadding() {
		return 0;
	}
	
	private native int getLineHeight() /*-[
  		return ceil(((ASUITextView*)self.uiView).font.lineHeight);
	]-*/;
	private int getBorderWidth() {
		return 0;
	}
	


	//start - templatepadding
    private int paddingLeft;
    private int paddingRight;
    private int paddingTop;
    private int paddingBottom;
	public Object getPaddingLeft() {
		return paddingLeft;
	}

	public void setPaddingLeft(Object paddingLeft) {
		this.paddingLeft = (int) paddingLeft;
		nativeSetPaddingLeft((int) paddingLeft + measurableView.getCompoundPaddingLeft());
	}

	public Object getPaddingRight() {
		return paddingRight;
	}

	public void setPaddingRight(Object paddingRight) {
		this.paddingRight = (int) paddingRight;
		nativeSetPaddingRight((int) paddingRight + measurableView.getCompoundPaddingRight());
	}

	public Object getPaddingTop() {
		if (hasFeature("enableFeatures", "cropToPadding")) {
			return measurableView.getPaddingTop();
		}
		return paddingTop;
	}

	public void setPaddingTop(Object paddingTop) {
		if (hasFeature("enableFeatures", "cropToPadding")) {
			ViewImpl.setPaddingTop((int) paddingTop, measurableView);
		} else {
			this.paddingTop = (int) paddingTop;
			nativeSetPaddingTop((int) paddingTop + measurableView.getCompoundPaddingTop());
		}
	}

	public Object getPaddingBottom() {
		if (hasFeature("enableFeatures", "cropToPadding")) {
			return measurableView.getPaddingBottom();
		}
		return paddingBottom;
	}
	
	private Object getPaddingEnd() {
		return getPaddingRight();
	}

	private Object getPaddingStart() {
		return getPaddingLeft();
	}	

	public void setPaddingBottom(Object paddingBottom) {
		if (hasFeature("enableFeatures", "cropToPadding")) {
			ViewImpl.setPaddingBottom((int)paddingBottom, measurableView);
		} else {
			this.paddingBottom = (int) paddingBottom;
			nativeSetPaddingBottom((int) paddingBottom + measurableView.getCompoundPaddingBottom());
		}
	}

	private void setPaddingVertical(Object objValue) {
		setPaddingTop(objValue);
		setPaddingBottom(objValue);
	}

	private void setPaddingHorizontal(Object objValue) {
		setPaddingLeft(objValue);
		setPaddingRight(objValue);
	}

	private void setPaddingEnd(Object objValue) {
		setPaddingRight(objValue);
	}

	private void setPaddingStart(Object objValue) {
		setPaddingLeft(objValue);
	}

	private void setPadding(Object objValue) {
		setPaddingVertical(objValue);
		setPaddingHorizontal(objValue);
	}
	

    public void updatePadding() {
    	setPaddingLeft(paddingLeft);
    	setPaddingRight(paddingRight);
    	setPaddingTop(paddingTop);
    	setPaddingBottom(paddingBottom);
    }
	//end - templatepadding
	private native void nativeSetPaddingBottom(int value) /*-[
		ASUITextView* label = ((ASUITextView*) self.uiView);
		UIEdgeInsets edgeInsets = label.textContainerInset;
		[label setTextContainerInset:UIEdgeInsetsMake(edgeInsets.top, edgeInsets.left, value, edgeInsets.right)];		
	]-*/;

	private native void nativeSetPaddingLeft(int value) /*-[
		ASUITextView* label = ((ASUITextView*) self.uiView);
		UIEdgeInsets edgeInsets = label.textContainerInset;
		[label setTextContainerInset:UIEdgeInsetsMake(edgeInsets.top, value, edgeInsets.bottom, edgeInsets.right)];		
	]-*/;

	private native void nativeSetPaddingRight(int value) /*-[
		ASUITextView* label = ((ASUITextView*) self.uiView);
		UIEdgeInsets edgeInsets = label.textContainerInset;
		[label setTextContainerInset:UIEdgeInsetsMake(edgeInsets.top, edgeInsets.left, edgeInsets.bottom, value)];		
	]-*/;


	private native void nativeSetPaddingTop(int value) /*-[
		ASUITextView* label = ((ASUITextView*) self.uiView);
		UIEdgeInsets edgeInsets = label.textContainerInset;
		[label setTextContainerInset:UIEdgeInsetsMake(value, edgeInsets.left, edgeInsets.bottom, edgeInsets.right)];		
	]-*/;

    


	private com.ashera.view.BaseMeasurableView.VerticalAligment preVerticalAligment;
	private void adjustContentSize(int width, int height) {
		if (measurableView.getVerticalAligment() == null && preVerticalAligment == null) {
			return;
		}
		if (!measurableView.isVerticalAlignTop()) {
			if (isContentOffsetCorrectionNeeded(uiView)) {
				com.ashera.model.RectM bounds = measurableView.getWidgetBounds(width, height, uiView);
				setContentOffset(bounds.y, uiView);
			}
		} else {
			if (preVerticalAligment == null || measurableView.getVerticalAligment() != preVerticalAligment) {
				setContentOffset(0, uiView);
			}
		}
		preVerticalAligment = measurableView.getVerticalAligment();
	}
	
	private native boolean isContentOffsetCorrectionNeeded(Object view)/*-[
		ASUITextView* tv = ((ASUITextView*)view);
		return  [tv contentSize].height <= [tv bounds].size.height;
	]-*/;
	
	private native void setContentOffset(int topCorrect, Object view)/*-[
		((ASUITextView*) view).topCorrect = -topCorrect;
		[((ASUITextView*) view) setContentOffset :(CGPoint){.x = 0, .y = -topCorrect}];
	]-*/;
	


	private void setTextColorHighlight(Object objValue) {
		ViewImpl.setTintColor(uiView, objValue);
	}
	
	
	private Object getTextColorHighlight() {
		return ViewImpl.getTintColor(uiView);
	}
	


	public void setMyText(Object text) {
		String mytext = (String) text;

		if (maxLength != -1 && mytext.length() > maxLength) {
			mytext = mytext.substring(0, maxLength);
		}
		
		if (textAllCaps) {
			mytext = mytext.toUpperCase();
		}
		nativeTriggerBeforeChangeHandlers((String) getText());
		nativeSetText(mytext);
		nativeTriggerChangeHandlers((String) getText());


	}
	
	private native void nativeTriggerChangeHandlers(String text)/*-[
		[self handleOnTextChange];
		[self handleOnAfterTextChange];	
	]-*/;
	

	private native void nativeTriggerBeforeChangeHandlers(String text)/*-[
		[self handleOnBeforeTextChangeWithNSString: text withInt:0 withInt: 0 withInt:text.length];
	]-*/;
	
	private void setCursorVisible(Object objValue) {
		ViewImpl.setTintColor(uiView, nativeGetTintColor(!(boolean)objValue));
	}
	private Object originalTintColor;
	private native Object nativeGetTintColor(boolean clearColor) /*-[
		ASUITextView* tv = ((ASUITextView*)self.uiView);
		
		if (self->originalTintColor_ == nil) {
			self->originalTintColor_ = tv.tintColor;
		}

		if (clearColor) {
			if (CGColorEqualToColor(tv.tintColor.CGColor, [UIColor clearColor].CGColor)) {
				self->originalTintColor_ = tv.tintColor;
			}

			return [UIColor clearColor];
		}
		return self->originalTintColor_;
	]-*/;

	private void setCapitalize(Object objValue) {
		nativeSetCapitalize((int) objValue);
	}
	
	private native void nativeSetCapitalize(int capitalizeType) /*-[
		ASUITextView* tv = ((ASUITextView*)self.uiView);
		tv.autocapitalizationType = capitalizeType;
	]-*/;
	

	private void setAutoText(Object objValue) {
		if ((boolean)objValue) {
			nativeSetCorrectionType(LayoutNativeVars.UITextAutocorrectionTypeYes);
		} else {
			nativeSetCorrectionType(LayoutNativeVars.UITextAutocorrectionTypeNo);
		}
	}
	
	private native void nativeSetCorrectionType(int capitalizeType) /*-[
		ASUITextView* tv = ((ASUITextView*)self.uiView);
		tv.autocorrectionType = capitalizeType;
	]-*/;
	
	
	private native boolean getCursorVisible() /*-[
		ASUITextView* tv = ((ASUITextView*)self.uiView);
		return CGColorEqualToColor(tv.tintColor.CGColor, [UIColor clearColor].CGColor);
	]-*/;
	
	private int maxLength = -1;
	private void setMaxLength(Object objValue) {
		maxLength = (int) objValue;
	}

	//start - enabled
	public void setEnabled(Object objValue) {
		boolean isEnabled = objValue != null && (boolean) objValue;
		nativeSetEnabled(isEnabled);
	}
	//end - enabled
	
	//start - digits
    private java.util.regex.Pattern numericPattern;

	private String[] getDigitStrings() {
		String symbol = getLocaleValueFromRS("0,1,2,3,4,5,6,7,8,9", "locale_digits_string");
		return symbol.split(",");
	}

	private String getLocaleValueFromRS(String defaultSymbol, String key) {
		String symbol = com.ashera.utils.ResourceBundleUtils.getString("values/strings", key, fragment);
		if (symbol == null) {
			symbol = defaultSymbol;
		}
		return symbol;
	}
	
	private String getPlusString() {
		String symbol = getLocaleValueFromRS("+", "locale_plus_sign");
		return symbol;
	}

	private String getMinusString() {
		java.text.DecimalFormatSymbols symbols = new java.text.DecimalFormatSymbols(locale);
		return symbols.getMinusSign() + "";
	}
	
	private String getDecimalCharacter() {
		java.text.DecimalFormatSymbols symbols = new java.text.DecimalFormatSymbols(locale);
		return symbols.getDecimalSeparator() + "";
	}

	private boolean numericPatternMatches(String str) {
		return numericPattern.matcher(str).matches();
	}
	//end - digits
	   

	private void removeNumericListener() {
		numericPattern = null;
	}
	private void addNumericListener(java.util.regex.Pattern pattern) {
		this.numericPattern = pattern;
	}
	/*-[
	-(BOOL) checkIfInputIsValid:(NSString *)string :(NSRange) range{
		if (maxLength_ > 0) {
			return ((ASUITextView*) uiView_).text.length + (string.length - range.length) <= maxLength_;
		}
    	if (numericPattern_ != nil) {
    		return [self numericPatternMatchesWithNSString: string];
    	}
    	return YES;
	}
	]-*/

	
	private void setPhoneNumber(Object objValue) {
		nativeSetPhoneNumber((boolean) objValue);
	}
	
	private native void nativeSetPhoneNumber(boolean value) /*-[
		if (value) {
			[((ASUITextView*)self.uiView) setKeyboardType: UIKeyboardTypePhonePad];
		} else {
			[((ASUITextView*)self.uiView) setKeyboardType: UIKeyboardTypeDefault];
		}
	]-*/;
	

	private native Object getFont() /*-[
		return ((ASUITextView*)self.uiView).font;
	]-*/;
	
	private void setInputType(Object objValue) {
		nativeSetKeyboardType((int) objValue);
	}

	private native void nativeSetKeyboardType(int value) /*-[
		[((ASUITextView*)self.uiView) setKeyboardType: value];
	]-*/;
	
	
	private Object getInputType() {
		return nativeGetKeyboardType();
	}
	
	private native int nativeGetKeyboardType() /*-[
		return ((ASUITextView*)self.uiView).keyboardType;
	]-*/;
	
	
	
	private void setImeOptions(Object objValue, String strValue) {
		nativeSetImeOptions((int) objValue);
	}
	
	private native void nativeSetImeOptions(int imeOptions) /*-[
		[((ASUITextView*)self->uiView_) setReturnKeyType:imeOptions];
	]-*/;
	private native int nativeGetImeOptions() /*-[
		return ((ASUITextView*)self->uiView_).returnKeyType;
	]-*/;
	
	private Object getImeOptions() {
		return nativeGetImeOptions();
	}
	private Object editorAction;
	private void setOnEditorAction(Object objValue) {
		this.editorAction = objValue;
	}
	private void setOnEditorActionListener() {
		TextView.OnEditorActionListener onEditorActionListener;
		if (editorAction instanceof String) {
			onEditorActionListener = new OnEditorActionListener(this, (String) editorAction);
		} else {
			onEditorActionListener = (TextView.OnEditorActionListener) editorAction;
		}
		onEditorActionListener.onEditorAction(measurableView, 0, new r.android.view.KeyEvent());
	}

	/*-[
	-(BOOL)textField:(UITextView*)textField shouldChangeCharactersInRange:(NSRange)range replacementString:(NSString *)string{
		BOOL result = YES;
		if (textAllCaps_) {
			NSRange lowercaseCharRange = [string rangeOfCharacterFromSet:[NSCharacterSet lowercaseLetterCharacterSet]];
   			if (lowercaseCharRange.location != NSNotFound) {
           		if (textField.text.length == 0) {
               		textField.text = [textField.text stringByReplacingCharactersInRange:range withString:[string uppercaseString]];
           		} else {
	               UITextPosition *beginning = textField.beginningOfDocument;
	               UITextPosition *start = [textField positionFromPosition:beginning offset:range.location];
	               UITextPosition *end = [textField positionFromPosition:start offset:range.length];
	               UITextRange *textRange = [textField textRangeFromPosition:start toPosition:end];
	
	               [textField replaceRange:textRange withText:[string uppercaseString]];
           		}
           		result = NO;
           	}
		}
		[self handleOnBeforeTextChangeWithNSString: string withInt:range.location withInt: range.length withInt:string.length];
    	return [self checkIfInputIsValid: string :range] && result;
	}
	- (BOOL)textFieldShouldReturn:(UITextView*)textField {
    	// Execute any additional code
		if (self->editorAction_ != nil) {
			[self setOnEditorActionListener];
		}
    	return YES;
	}
	]-*/;
	
	//https://stackoverflow.com/questions/34260592/how-to-add-done-button-on-keyboard-on-top-of-keyboard-in-ios
	private void setInputAccessoryViewDoneButton(Object objValue) {
		nativeSetInputAccessoryViewDoneButton((String) objValue);
	}

	private native void nativeSetInputAccessoryViewDoneButton(String title) /*-[
		UIToolbar* keyboardToolbar = [[UIToolbar alloc] init];
		[keyboardToolbar sizeToFit];
		UIBarButtonItem *flexBarButton = [[UIBarButtonItem alloc]
		                                  initWithBarButtonSystemItem:UIBarButtonSystemItemFlexibleSpace
		                                  target:nil action:nil];
   		UIBarButtonItem* doneBarButton = [[UIBarButtonItem alloc] initWithTitle:title style:UIBarButtonItemStylePlain
                                                              target:self 
                                                              action:@selector(doneButtonPressed:withEvent:)];
    	doneBarButton.style = UIBarButtonItemStylePlain;		                                  
		keyboardToolbar.items = @[flexBarButton, doneBarButton];
		((ASUITextView*)self.uiView).inputAccessoryView = keyboardToolbar;
		

	]-*/;
	 /*-[
	-(void)doneButtonPressed:(id)sender withEvent:(UIEvent *) event{
		[self textFieldShouldReturn: ((ASUITextView*)self.uiView)];
	}
	- (void)textViewDidBeginEditing:(UITextView*)textField{
		if (self->selectAllOnFocus_) {
			[self nativeSetSelectAllWithFloat: 0];
		}
		
		if (self->selectOnceOnFocus_) {
			self->selectOnceOnFocus_ = FALSE;
			[self nativeSetSelectAllWithFloat: 0.5];
		}
		
		[self sendPressStartEvent];
	}
	
	- (void)textViewDidEndEditing:(UITextView*)textField{
		[self sendPressEndEvent];
	}
	
	- (void) nativeSetSelectAllActual:(UITextView *)tv  {
		[tv setSelectedTextRange:[tv textRangeFromPosition:tv.beginningOfDocument toPosition:tv.endOfDocument]];
	}
	]-*/;
	
	
	private Object onFocusChange; 
	private void setOnFocus(Object objValue) {
		onFocusChange = objValue;
	}

	
	private void sendPressStartEvent() {
		if (onFocusChange != null) {
			View.OnFocusChangeListener focusChangeListener; 
			
			if (onFocusChange instanceof String) {
				focusChangeListener = new OnFocusChangeListener(this, (String) onFocusChange);
			} else {
				focusChangeListener = (View.OnFocusChangeListener) onFocusChange;
			}
			measurableView.setFocused(true); 
			focusChangeListener.onFocusChange(measurableView, true);
		}
	}
	
	private void sendPressEndEvent() {
		if (onFocusChange != null) {
			View.OnFocusChangeListener focusChangeListener; 
			
			if (onFocusChange instanceof String) {
				focusChangeListener = new OnFocusChangeListener(this, (String) onFocusChange);
			} else {
				focusChangeListener = (View.OnFocusChangeListener) onFocusChange;
			}
			measurableView.setFocused(false); 
			focusChangeListener.onFocusChange(measurableView, false);
		}
	}
	
	private boolean selectAllOnFocus;
	private boolean selectOnceOnFocus;
	private void setSelectAllOnFocus(Object objValue) {
		selectAllOnFocus = (boolean) objValue;
	}

	private void setSelectAll(Object objValue) {
		if (isInitialised() && (boolean) objValue) {
			if (isFirstResponder()) {
				nativeSetSelectAll(0);
			} else {
				selectOnceOnFocus = true;
				becomeFirstResponder();
			}
		}
	}
	
	private native boolean isFirstResponder() /*-[
		ASUITextView* tv = ((ASUITextView*)self.uiView);
		return [tv isFirstResponder];
	]-*/;
	//start - becomeFirstResponder
	private native void becomeFirstResponder() /*-[
		ASUITextView* tv = ((ASUITextView*)self.uiView);
		[tv becomeFirstResponder];
	]-*/;
	//end - becomeFirstResponder
	
	private native void nativeSetSelectAll(float delay) /*-[
		ASUITextView* tv = ((ASUITextView*)self.uiView);
		[self performSelector:@selector(nativeSetSelectAllActual:) withObject:tv afterDelay:delay]; 
	]-*/;

	
	private void setSingleLine(Object objValue) {
		if ((boolean) objValue) {
			measurableView.setLines(1);
		} else {
			measurableView.setMaxLines(Integer.MAX_VALUE);
			measurableView.setMinLines(-1);
		}
	}
	
	
	private Object getSingleLine() {
		return measurableView.getMaxLines() == 1 && measurableView.getMinLines() == 1;
	}

	private boolean scrollHorizontally;
	private void setScrollHorizontally(Object objValue) {
		if (hasScrollView()) {
			this.scrollHorizontally = (boolean) objValue;
			nativeSetScrollEnabled(getScrollView(), scrollHorizontally);
			nativeAddTapGesture();
			addMinMaxListener();
			measurableView.setCompoundHorizontalPaddingConsumed(scrollHorizontally);
		} else {
			measurableView.setHorizontallyScrolling((boolean) objValue);
		}
	}
	
	private native void nativeAddTapGesture()/*-[
	    UITapGestureRecognizer* tapGesture = [[UITapGestureRecognizer alloc] initWithTarget:self action:@selector(handleTap:)];
	    tapGesture.delegate = self;
	    [((ASUITextView*)self.uiView) addGestureRecognizer:tapGesture];	    
	]-*/;
	
	/*-[

	- (void)handleTap:(UITapGestureRecognizer *)gesture {
		ASUITextView* textView = ((ASUITextView*)self.uiView);
	    if (![textView isFirstResponder]) {
        	[textView becomeFirstResponder];
    	}
		
	    CGPoint point = [gesture locationInView:textView];
	    UITextPosition *closestPosition = [textView closestPositionToPoint:point];
	    if (closestPosition) {
	        textView.selectedTextRange = [textView textRangeFromPosition:closestPosition toPosition:closestPosition];
	    }
	}

	]-*/;
	
	private native void nativeSetScrollEnabled(Object scrollView, boolean scrollEnabled)/*-[
		((ASUIScrollView*)scrollView).scrollEnabled = scrollEnabled;
	]-*/;

	private void setTextColorLink(r.android.content.res.ColorStateList linkTextColors) {
	}
	
	private Object onAfterTextChange;
	private Object onBeforeTextChange;
	private Object onTextChange;
	private int start;
	private int end;
	private int count;
	private int after;
	private String str;
	private void handleOnBeforeTextChange(String s, int start, int count, int after) {
		this.start = start;
		this.count = count;
		this.after = after;
		this.str = s;
		if (onBeforeTextChange != null) {
			final TextWatcher textChangedListener = getTextChangedListener(onBeforeTextChange, "onbeforeTextChange");
			textChangedListener.beforeTextChanged((String) getText(), start, count, after);
		}
	}
	
	private Map<String, Object> textWatchers;

	private TextWatcher getTextChangedListener(Object objValue, String name) {
		TextWatcher textWatcher = null;
		if (objValue instanceof String) {
			textWatcher = new TextChangedListener(this, (String) objValue);
		} else {
			textWatcher = (TextWatcher) objValue;
		}
		
		if (textWatchers == null) {
			textWatchers = new HashMap<>();
		}
		this.textWatchers.put(name, textWatcher);

		return textWatcher;
	}
	
	private void handleOnAfterTextChange() {
		if (onAfterTextChange != null) {
			final TextWatcher textChangedListener = getTextChangedListener(onAfterTextChange, "onafterTextChange");
			textChangedListener.afterTextChanged(null);
		}
	}
	
	private void handleOnTextChange() {
		if (onTextChange != null) {
			this.textChangedListener.onTextChanged((String) getText(), this.start, this.after - str.length(), str.length());
		}
	}
	private void setOnAfterTextChange(Object objValue) {
		this.onAfterTextChange = objValue;
		if (this.onAfterTextChange != null) {
			nativeAddTextFieldDidChange();
		}
	}

	private void setBeforeOnTextChange(Object objValue) {
		this.onBeforeTextChange = objValue;
	}
	private TextWatcher textChangedListener;
	private void setOnTextChange(Object objValue) {
		this.onTextChange = objValue;
		textChangedListener = getTextChangedListener(onTextChange, "onTextChange");
		if (this.onTextChange != null) {
			nativeAddTextFieldDidChange();
		}
	}

	private boolean textAllCaps = false;
	private void setTextAllCaps(Object objValue) {
		textAllCaps = (boolean) objValue;
	}
	
	private native void forceRedraw() /*-[
    	NSString * text = ((ASUITextView*) self->uiView_).text;
    	[((ASUITextView*) self->uiView_) setText:@""];
    	[((ASUITextView*) self->uiView_) setText:text];
	]-*/;
	private native void nativeSetContentSize(Object uiView, int contentWidth, int height)/*-[
		((UIScrollView*) uiView).contentSize = CGSizeMake(contentWidth, height);
	]-*/;
	
	
	private void remeasure() {
		if (hasScrollView()) {
			updateScrollViewContentOffset();
		}
		if (fragment.isViewLoaded()) {
            ViewImpl.requestLayout(this);
            fragment.remeasure();
        }
	}

	private native void updateScrollViewContentOffset() /*-[
	    ASUIScrollView* scrollView = ((ASUIScrollView*) [self getScrollView]);
	 	int x =   [((ASUITextView*)self.uiView) caretRectForPosition:((ASUITextView*)self.uiView).selectedTextRange.start].origin.x;
	    int y = scrollView.contentOffset.x;
	    
	    if (x > y + scrollView.frame.size.width) {
	    	[scrollView setContentOffset:CGPointMake(x, scrollView.contentOffset.y) animated:NO];
	    }
	 ]-*/;	
	


	private void setInputView(Object objValue) {
		if (objValue instanceof Integer) {
			int inputView = (int) objValue;
			
			switch (inputView) {
			case 1:
				setPickerView();
				break;

			default:
				break;
			}
			
		} else {
			if (objValue != null) {
				setNativeInputView(objValue);
			}
		}
	}

	private native void setNativeInputView(Object objValue)/*-[
		[((ASUITextView*)self.uiView) setInputView:(UIView*) objValue];
	]-*/;
	private native void setPickerView()/*-[
		UIPickerView * picker = [UIPickerView new];
		picker.showsSelectionIndicator = YES;
		[((ASUITextView*)self.uiView) setInputView:picker];
	]-*/;
	
	private native void setDatePicker()/*-[
		UIDatePicker *datepicker = [UIDatePicker new];
    	[datepicker setDatePickerMode:UIDatePickerModeDate];
		[((ASUITextView*)self.uiView) setInputView:datepicker];
	]-*/;
	


	@Override
	public String getTextEntered() {
		return (String) getMyText();
	}

	@Override
	public boolean isViewVisible() {
		return measurableView.getVisibility() == r.android.view.View.VISIBLE;
	}

	@Override
	public void focus() {
		becomeFirstResponder();
	}

	

	private void setError(String message) {
		
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
	


	private void setHintTextFormat(Object objValue) {
		applyAttributeCommand("hint", CommonConverters.command_textformatter, new String[] {"hintTextFormat"}, true, (String) objValue);
	}
	

	public native void setText(Object nativeWidget, Object value) /*-[
((ASUITextView*) nativeWidget).text = (NSString*) value;
]-*/;
	public native Object getText() /*-[
return ((ASUITextView*) uiView_).text;
  ]-*/;
	public native void setTextColor(Object nativeWidget, Object value) /*-[
((ASUITextView*) nativeWidget).textColor = (UIColor*) value;
]-*/;
	public native Object getTextColor() /*-[
return ((ASUITextView*) uiView_).textColor;
  ]-*/;
	public native void setUsesStandardTextScaling(Object nativeWidget, Object value) /*-[
((ASUITextView*) nativeWidget).usesStandardTextScaling = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public native Object getUsesStandardTextScaling() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITextView*) uiView_).usesStandardTextScaling];
  ]-*/;
	public native void setIsEditable(Object nativeWidget, Object value) /*-[
((ASUITextView*) nativeWidget).editable = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public native Object getIsEditable() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITextView*) uiView_).editable];
  ]-*/;
	public native void setAllowsEditingTextAttributes(Object nativeWidget, Object value) /*-[
((ASUITextView*) nativeWidget).allowsEditingTextAttributes = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public native Object getAllowsEditingTextAttributes() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITextView*) uiView_).allowsEditingTextAttributes];
  ]-*/;
	public native void setClearsOnInsertion(Object nativeWidget, Object value) /*-[
((ASUITextView*) nativeWidget).clearsOnInsertion = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public native Object getClearsOnInsertion() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITextView*) uiView_).clearsOnInsertion];
  ]-*/;
	public native void setIsSelectable(Object nativeWidget, Object value) /*-[
((ASUITextView*) nativeWidget).selectable = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public native Object getIsSelectable() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITextView*) uiView_).selectable];
  ]-*/;
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
private static class OnFocusChangeListener implements View.OnFocusChangeListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnFocusChangeListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnFocusChangeListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onFocusChange (View v, 
                boolean hasFocus){
    
	if (action == null || action.equals("onFocusChange")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onFocusChange");
	    java.util.Map<String, Object> obj = getOnFocusChangeEventObj(v,hasFocus);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, v,hasFocus);
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

public java.util.Map<String, Object> getOnFocusChangeEventObj(View v,boolean hasFocus) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "focuschange");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "hasFocus", hasFocus);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onFocusChange", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
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

	
	    public native boolean checkIosVersion(String v) /*-[
			return ([[[UIDevice currentDevice] systemVersion] compare:v options:NSNumericSearch] == NSOrderedDescending);
		]-*/;
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
			if (isViewWrapped()) {
				ViewImpl.invalidate(this, simpleWrapableView.getWrappedView());
				if (simpleWrapableView.getForeground() != null) {
					ViewImpl.invalidate(this, simpleWrapableView.getForeground());
				}
			}			
    	}
    }

	
	
    private SimpleWrapableView simpleWrapableView;
    
    private void createSimpleWrapableView() {
		boolean wrapViewFeature = hasFeature("enableFeatures", "decorator");
		int viewType = -1;
	
		if (wrapViewFeature) {
			boolean hscroll = hasFeature("enableFeatures", "hscroll");
			boolean vscroll = hasFeature("enableFeatures", "vscroll");
			
			viewType = 1;
			if (hscroll) viewType = 2;
			if (vscroll) viewType = 3;
		}
		
		simpleWrapableView = new SimpleWrapableView(this, viewType);
    }
    
	private boolean hasScrollView() {
		return isViewWrapped() && (simpleWrapableView.getViewtype() == 2 || simpleWrapableView.getViewtype() == 3);
	}

	private boolean isViewWrapped() {
		return simpleWrapableView.isViewWrapped();
	}
	
	@Override
	public void addForegroundIfNeeded() {
		if (isViewWrapped() && !simpleWrapableView.isDisableForeground()) {
			if (simpleWrapableView.getForeground() == null) {
				Object foreground = nativeAddForeGround(this);
				ViewGroupImpl.nativeAddView(simpleWrapableView.asNativeWidget(), foreground);
				simpleWrapableView.setForeground(foreground);
			}
		}
	}

	@Override
	public Object getForeground() {
		return simpleWrapableView.getForeground();
	}

	private void setForegroundFrame(int l, int t, int r, int b) {
		Object foreground = simpleWrapableView.getForeground();
		if (foreground != null) {
			ViewImpl.nativeMakeFrame(foreground, 0, 0, r - l, b - t);
		}
	}

	

	@Override
	public Object asNativeWidget() {
       return simpleWrapableView.asNativeWidget();
	}

	
    private void invalidateWrapViewHolder() {
    	if (isViewWrapped()) {
    		ViewImpl.nativeInvalidate(simpleWrapableView.getWrapperViewHolder());
    	}
	}
    
	@Override
	public Object createWrapperView(Object wrapperParent, int viewtype) {
		uiView = nativeCreateView(viewtype);
		ViewGroupImpl.nativeAddView(ViewImpl.getFirstChildOrSelf(wrapperParent), uiView);
		return uiView;
	}


	@Override
	public Object createWrapperViewHolder(int viewType) {
		return createWrapperViewHolderNative(viewType);
	}
	public native Object nativeAddForeGround(IWidget w) /*-[
		ASUIView* uiView = [ASUIView new];
		uiView.widget = w;
		uiView.commandRegex  = ASUITextViewImpl_FOREGROUND_REGEX; 
		uiView.backgroundColor = [UIColor clearColor];
		return uiView;
	]-*/;
	 public native Object createWrapperViewHolderNative(int viewType)/*-[
	 	if (viewType == 1) {
			ASUIView* uiView = [ASUIView new];
			uiView.widget = self;
			uiView.commandRegex  = ASUITextViewImpl_VIEW_HOLDER_REGEX; 
			uiView.backgroundColor = [UIColor clearColor];
			
			return uiView;
		}
		
		if (viewType == 2 || viewType == 3) {
			ASUIView* uiView = [ASUIView new];
			uiView.widget = self;
			uiView.backgroundColor = [UIColor clearColor];
			uiView.commandRegex  = ASUITextViewImpl_VIEW_HOLDER_REGEX; 

			ASUIScrollView* scrollview = [ASUIScrollView new];
			scrollview.scrollEnabled=YES;
			scrollview.bounces=NO;
			scrollview.preventAutoScroll=YES;
	    	scrollview.delaysContentTouches=YES;
	    	scrollview.userInteractionEnabled=YES;
			scrollview.widget = self;
			scrollview.backgroundColor = [UIColor clearColor];
			scrollview.commandRegex  = @"none";
			[uiView addSubview:scrollview];
			return uiView;
		}
		
		return nil;
	]-*/;
	 
	private native Object getScrollView() /*-[
		UIView* uiview = (UIView*)[self->simpleWrapableView_ getWrapperViewHolder];
		return uiview.subviews[0];
	]-*/;
	//end - body
	private Object placeholderLabel; 
	private void nativeCreate(Map<String, Object> params) {
		simpleWrapableView.setDisableForeground(true);
		measurableView.setIgnoreDrawableHeight(true);
		registerForAttributeCommandChain("hint");
		registerForAttributeCommandChainWithPhase("predraw", "drawableStart",  "drawableEnd", "drawableLeft", "drawableTop", "drawableRight", "drawableBottom",
    			"drawablePadding", "drawableTint", "drawableTintMode");
	}


	private native Object nativeCreateView(int viewType)/*-[
		ASUITextView* textview  = [ASUITextView new];
		textview.delegate = self;
		textview.textContainerInset = UIEdgeInsetsZero;
		textview.textContainer.lineBreakMode = NSLineBreakByClipping;
		[textview setFont:[UIFont systemFontOfSize:[UIFont labelFontSize]]];
		
		return textview;		
	]-*/;
	
	private native void createPlaceHolder(String text)/*-[
  		ASUITextView* textview = ((ASUITextView*) self.uiView);
		UITextView* placeholderLabel = (UITextView*)self->placeholderLabel_;
  		if (placeholderLabel == nil) {
			placeholderLabel = [ASUITextView new];
			placeholderLabel.scrollEnabled=NO;
		    placeholderLabel.editable=NO;
		    placeholderLabel.selectable=NO;
		    placeholderLabel.userInteractionEnabled=NO;
			placeholderLabel.backgroundColor = [UIColor clearColor];
			[((ASUITextView*) self.uiView).superview addSubview:placeholderLabel];
			self->placeholderLabel_ = placeholderLabel;
		} 
		
		placeholderLabel.text = text;
		[self syncPlaceholderLabel];

	]-*/;
	
	private native void updatePlaceHolderVisibility() /*-[
	  	ASUITextView* textview = ((ASUITextView*) self.uiView);
		UITextView* placeholderLabel = (UITextView*)self->placeholderLabel_;
  		if (placeholderLabel != nil) {
			placeholderLabel.hidden = ![textview.text java_isEmpty];
		}
	]-*/;


	private native void syncPlaceholderLabel() /*-[
  		ASUITextView* textview = ((ASUITextView*) self.uiView);
  		UITextView* placeholderLabel = (UITextView*)self->placeholderLabel_;
  		if (placeholderLabel != nil) {
		    placeholderLabel.textAlignment = textview.textAlignment;
			placeholderLabel.textContainerInset= textview.textContainerInset;
		    placeholderLabel.textColor = self->hintColor_ == nil ? [UIColor lightGrayColor] : (UIColor*) self->hintColor_;
		    placeholderLabel.font = ((ASUITextView*) self.uiView).font;
		    placeholderLabel.hidden = ![textview.text java_isEmpty];
		}
	]-*/;

	
	private void setHint(Object objValue) {
		if (isViewWrapped()) {
			createPlaceHolder((String) objValue);
		}
	}

	Object hintColor;
	private void setHintColor(Object objValue) {
		if (objValue instanceof r.android.content.res.ColorStateList) {
			r.android.content.res.ColorStateList colorStateList = (r.android.content.res.ColorStateList) objValue;
			measurableView.setHintTextColor(colorStateList);
			objValue = measurableView.getCurrentHintTextColor();
		}
		hintColor = ViewImpl.getColor(objValue);
		nativeSetHintColor(hintColor);
	}
	
	private Object getHint() {
		return nativeGetHint();
	}
	
	private native String nativeGetHint() /*-[
		ASUITextView* textview = ((ASUITextView*) self.uiView);
		UITextView* placeholderLabel = (UITextView*)self->placeholderLabel_;
		if (placeholderLabel != nil) {
			return placeholderLabel.text;
		}
		return nil;
	]-*/;	
	
	private native void nativeSetHintColor(Object objValue) /*-[
		ASUITextView* textview = ((ASUITextView*) self.uiView);
		UITextView* placeholderLabel = (UITextView*)self->placeholderLabel_;
  		if (placeholderLabel != nil) {
			placeholderLabel.textColor = (UIColor*) objValue;
		}
	]-*/;	
	
	/*-[
	-(void)textViewDidChange:(UITextView *)textView{
		[self handleOnTextChange];
		[self handleOnAfterTextChange];
		[self updatePlaceHolderVisibility];
	    [self adjustContentSizeWithInt:textView.frame.size.width withInt:textView.frame.size.height];
	   	if (callMeasureOnChange_) {
			[self remeasure];
		}
	}
	- (BOOL)textView:(UITextView *)textView shouldChangeTextInRange:(NSRange)range replacementText:(NSString *)text {
		return [self textField:textView shouldChangeCharactersInRange:range replacementString:text];
	}
	
	- (CGFloat)layoutManager:(NSLayoutManager *)layoutManager lineSpacingAfterGlyphAtIndex:(NSUInteger)glyphIndex withProposedLineFragmentRect:(CGRect)rect {
    	return lineSpacing_; // For really wide spacing; pick your own value
	}
	]-*/;	
	private native void updateBounds(int topPadding, int bottomPadding, Object parent, Object child) /*-[
		UIView* pview = ((UIView*) parent);
		UIView* childview = ((UIView*) child);
		if (childview != nil) {
			childview.frame = CGRectMake(0, topPadding, pview.frame.size.width, pview.frame.size.height - topPadding - bottomPadding);
		}
	]-*/;

	private void nativeMakeFrameForChildWidget(int l, int t, int r, int b) {
		if (isViewWrapped()) {
			if (hasScrollView()) {
				int textWidth = measurableView.nativeMeasureWidth(uiView);
				int horizontalPadding = measurableView.getCompoundPaddingLeft() + measurableView.getCompoundPaddingRight();
				
				if (textWidth < (r - l - horizontalPadding)) {
		            textWidth = r - l - horizontalPadding;
		        }
				ViewImpl.updateBounds(uiView, 0, 0, textWidth, b-t);
				ViewImpl.updateBounds(getScrollView(), measurableView.getCompoundPaddingLeft(), 0,
						r-l-measurableView.getCompoundPaddingRight() - measurableView.getCompoundPaddingLeft(),
						b-t);
				nativeSetContentSize(getScrollView(), textWidth+10, b-t);
			} else {
				updateBounds(measurableView.getPaddingTop(), measurableView.getPaddingBottom(), simpleWrapableView.getWrapperViewHolder(), uiView);
			}
		}
		
		if (placeholderLabel != null) {
			com.ashera.model.RectM bounds = measurableView.getWidgetBounds(r - l, b - t, placeholderLabel);
			updateBounds(measurableView.getPaddingTop(), measurableView.getPaddingBottom(), simpleWrapableView.getWrapperViewHolder(), placeholderLabel);
			setContentOffset(bounds.y, placeholderLabel);
		}

		adjustContentSize(r - l, b - t);
	}
	
	private boolean callMeasureOnChange;
	private void addMinMaxListener() {
		callMeasureOnChange = true;
		
		int maxLines = measurableView.getMaxLines();
		if (measurableView.getMaxLines() != -1 && maxLines != Integer.MAX_VALUE && isEllipsized()) {
			nativeSetMaxLines(maxLines);
		}
	}
	
	private boolean isEllipsized() {
		return nativeGetLineBreakMode() != LayoutNativeVars.NSLineBreakByClipping;
	}

	private void nativeSetEnabled(boolean isEnabled) {
		setIsEditable(simpleWrapableView.getWrappedView(), isEnabled);
	}	

	private Object getEllipsize() {
		return nativeGetLineBreakMode();
	}

	private native void nativeSetMaxLines(int lines) /*-[
		((UITextView*)self->uiView_).textContainer.maximumNumberOfLines = lines;
	]-*/;
	
	private void setEllipsize(Object objValue, String strValue) {
		nativeSetLineBreakMode((int) objValue);
		
		int maxLines = measurableView.getMaxLines();
		if (measurableView.getMaxLines() != -1 && maxLines != Integer.MAX_VALUE && isEllipsized()) {
			nativeSetMaxLines(maxLines);
		}
	}
	
	private native void nativeSetLineBreakMode(int lineBreakMode) /*-[
		((UITextView*)self->uiView_).textContainer.lineBreakMode = lineBreakMode;
	]-*/;
	private native int nativeGetLineBreakMode() /*-[
		return (jint) ((UITextView*)self->uiView_).textContainer.lineBreakMode;
	]-*/;
	
	private int lineSpacing;
	private void setLineSpacing() {
		nativeSetLayoutManagerDelegate();
		lineSpacing =  Math.round((mSpacingAdd + (mSpacingMult * getLineHeight())));
	}
	
	private native void nativeSetLayoutManagerDelegate() /*-[
		((UITextView*)self->uiView_).layoutManager.delegate = self;
	]-*/;

	
	private void postSetAttribute(WidgetAttribute key, String strValue, Object objValue,
			ILifeCycleDecorator decorator) {
		
		switch (key.getAttributeName()) {
		case "lineSpacingExtra":
		case "lineSpacingMultiplier":
			if (isInitialised()) {
				forceRedraw();
			}
			break;
		case "textAllCaps":
		case "maxLength":
			if (isInitialised()) {
				setMyText(getText());
			}
		default:
			break;
		}
		
		if (isInitialised()) {
			syncPlaceholderLabel();
		}
	}

	@Override
	public int measureWidth() {
		int width = measurableView.nativeMeasureWidth(uiView);
		
		if (placeholderLabel != null) {
			int miniumumWidth = measurableView.nativeMeasureWidth(placeholderLabel);
			if (width < miniumumWidth) {
				width = miniumumWidth; 
			}
		}
		return width;
	}

	@Override
	public int measureHeight(int width) {
		int height = measurableView.nativeMeasureHeight(uiView, width);
		
		if (placeholderLabel != null) {
			int miniumumHeight = measurableView.nativeMeasureHeight(placeholderLabel, width);
			if (height < miniumumHeight) {
				height = miniumumHeight; 
			}
		}
		
		return height;
	}
	

	private void nativeAddTextFieldDidChange() {
		
	}
}
