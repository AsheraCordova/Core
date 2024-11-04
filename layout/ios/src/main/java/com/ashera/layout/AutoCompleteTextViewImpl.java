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
#include "ASUITextField.h"
]-*/
import r.android.widget.TextView;
import r.android.view.KeyEvent;
import r.android.widget.AutoCompleteTextView;

@SuppressLint("NewApi")
public class AutoCompleteTextViewImpl extends BaseHasWidgets implements ICustomMeasureHeight, ICustomMeasureWidth, com.ashera.validations.FormElement{
	private final static String FOREGROUND_REGEX = "none";
	private final static String VIEW_HOLDER_REGEX = "(?!(?:drawForeground)$).*";
	private final static String WIDGET_REGEX = "drawForeground";

	//start - body
	public final static String LOCAL_NAME = "AutoCompleteTextView"; 
	public final static String GROUP_NAME = "AutoCompleteTextView";

	protected @Property Object uiView;
	protected r.android.widget.AutoCompleteTextView measurableView;		
	
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
		final static class IosBorderStyle extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("none",  LayoutNativeVars.UITextBorderStyleNone);
				mapping.put("line",  LayoutNativeVars.UITextBorderStyleLine);
				mapping.put("bezel",  LayoutNativeVars.UITextBorderStyleBezel);
				mapping.put("roundedRect",  LayoutNativeVars.UITextBorderStyleRoundedRect);
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
		ViewGroupModelImpl.register(attributeName);


		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosText").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosPlaceholder").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hint").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosTextColor").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosAdjustsFontSizeToFitWidth").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosMinimumFontSize").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosIsEditing").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosClearsOnBeginEditing").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosClearsOnInsertion").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosAllowsEditingTextAttributes").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosBackground").withType("image"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosDisabledBackground").withType("image"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("padding").withType("dimension").withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingBottom").withType("dimension").withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingRight").withType("dimension").withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingLeft").withType("dimension").withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingStart").withType("dimension").withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingEnd").withType("dimension").withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingTop").withType("dimension").withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingHorizontal").withType("dimension").withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingVertical").withType("dimension").withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableStart").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableEnd").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTop").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableBottom").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawablePadding").withType("dimension").withOrder(1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTint").withType("colorstate").withUiFlag(UPDATE_UI_INVALIDATE));
		ConverterFactory.register("AutoCompleteTextView.drawableTintMode", new DrawableTintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTintMode").withType("AutoCompleteTextView.drawableTintMode").withUiFlag(UPDATE_UI_INVALIDATE));
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
		ConverterFactory.register("AutoCompleteTextView.font", new Font());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("typeface").withType("AutoCompleteTextView.font").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		ConverterFactory.register("AutoCompleteTextView.textStyle", new TextStyle());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textStyle").withType("AutoCompleteTextView.textStyle").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("fontFamily").withType("font").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("enabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textColorHighlight").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("firstBaselineToTopHeight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lastBaselineToBottomHeight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("completionThreshold").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("completionHintView").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("completionHint").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("entries").withType("array").withArrayType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("dropDownHeight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("dropDownHorizontalOffset").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("dropDownVerticalOffset").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("dropDownWidth").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("dropDownSelector").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("dropDownAnchor").withType("id"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("listitem").withType("template"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onDismiss").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("showDropDown").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("text").withType("resourcestring").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("gravity").withType("gravity").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("autoText").withType("boolean"));
		ConverterFactory.register("AutoCompleteTextView.capitalize", new Capitalize());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("capitalize").withType("AutoCompleteTextView.capitalize"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("cursorVisible").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textSize").withType("dimensionsp").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		ConverterFactory.register("AutoCompleteTextView.numeric", new Numeric());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("numeric").withType("AutoCompleteTextView.numeric"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("digits").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("password").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("phoneNumber").withType("boolean"));
		ConverterFactory.register("AutoCompleteTextView.inputType", new InputType());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("inputType").withType("AutoCompleteTextView.inputType"));
		ConverterFactory.register("AutoCompleteTextView.imeOptions", new ImeOptions());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("imeOptions").withType("AutoCompleteTextView.imeOptions"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("selectAllOnFocus").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("selectAll").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scrollHorizontally").withType("boolean").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("singleLine").withType("boolean").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onEditorAction").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textColorHint").withType("colorstate").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosInputAccessoryViewDoneButton").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onFocusChange").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onTextChange").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onbeforeTextChange").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onafterTextChange").withType("string"));
		ConverterFactory.register("AutoCompleteTextView.iosBorderStyle", new IosBorderStyle());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosBorderStyle").withType("AutoCompleteTextView.iosBorderStyle"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hintTextFormat").withType("resourcestring").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textAllCaps").withType("boolean").withOrder(-1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		ConverterFactory.register("AutoCompleteTextView.inputView", new InputView());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosInputView").withType("AutoCompleteTextView.inputView"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("setFocus").withType("boolean"));
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

@com.google.j2objc.annotations.WeakOuter		
	public class AutoCompleteTextViewExt extends r.android.widget.AutoCompleteTextView implements ILifeCycleDecorator{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		private List<IWidget> overlays;
		public IWidget getWidget() {
			return AutoCompleteTextViewImpl.this;
		}

		public AutoCompleteTextViewExt() {
			super(AutoCompleteTextViewImpl.this);
			
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
			ViewImpl.setDrawableBounds(AutoCompleteTextViewImpl.this, l, t, r, b);
			if (!isOverlay()) {
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			nativeMakeFrameForChildWidget(l, t, r, b);
			}
			replayBufferedEvents();
	        ViewImpl.redrawDrawables(AutoCompleteTextViewImpl.this);
	        overlays = ViewImpl.drawOverlay(AutoCompleteTextViewImpl.this, overlays);
			
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
        		ViewImpl.drawableStateChanged(AutoCompleteTextViewImpl.this);
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
    		
    		IWidget widget = template.loadLazyWidgets(AutoCompleteTextViewImpl.this.getParent());
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
        	AutoCompleteTextViewImpl.this.getParent().remove(AutoCompleteTextViewImpl.this);
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
			AutoCompleteTextViewImpl.this.setAttribute(name, value, !(value instanceof String));
		}
        @Override
        public void setVisibility(int visibility) {
            super.setVisibility(visibility);
            ViewImpl.nativeSetVisibility(asNativeWidget(), visibility != View.VISIBLE);
            
        }
		  public int getBorderPadding(){
		    return AutoCompleteTextViewImpl.this.getBorderPadding();
		  }

		  public int getLineHeight(){
		    return AutoCompleteTextViewImpl.this.getLineHeight();
		  }

		  public int getBorderWidth(){
		    return AutoCompleteTextViewImpl.this.getBorderWidth();
		  }
		  public int getLineHeightPadding(){
		    return AutoCompleteTextViewImpl.this.getLineHeightPadding();
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

		@Override
		public void dismissDropDown() {
			measurableView.post(() -> {
				super.dismissDropDown();
				removePopUpContainer();
			});
		}
        
    	public void setState0(Object value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 0, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 1, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 2, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(AutoCompleteTextViewImpl.this, 3, value);
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
		measurableView = new AutoCompleteTextViewExt();
		createSimpleWrapableView();
		nativeCreate(params);	
		ViewImpl.registerCommandConveter(this);
		setWidgetOnNativeClass();
	}
	private native void setWidgetOnNativeClass() /*-[
		((ASUITextField*) self.uiView).widget = self;
	]-*/;

	@Override
	@SuppressLint("NewApi")
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		Object nativeWidget = simpleWrapableView.getWrappedView();
		ViewGroupModelImpl.setAttribute(this, simpleWrapableView, key, strValue, objValue, decorator);
		
		switch (key.getAttributeName()) {
			case "iosText": {
				


		setText(nativeWidget, objValue);



			}
			break;
			case "hint":
			case "iosPlaceholder": {
				


		setPlaceholder(nativeWidget, objValue);



			}
			break;
			case "iosTextColor": {
				


		setTextColor(nativeWidget, objValue);



			}
			break;
			case "iosAdjustsFontSizeToFitWidth": {
				


		setAdjustsFontSizeToFitWidth(nativeWidget, objValue);



			}
			break;
			case "iosMinimumFontSize": {
				


		setMinimumFontSize(nativeWidget, objValue);



			}
			break;
			case "iosIsEditing": {
				
			}
			break;
			case "iosClearsOnBeginEditing": {
				


		setClearsOnBeginEditing(nativeWidget, objValue);



			}
			break;
			case "iosClearsOnInsertion": {
				


		setClearsOnInsertion(nativeWidget, objValue);



			}
			break;
			case "iosAllowsEditingTextAttributes": {
				


		setAllowsEditingTextAttributes(nativeWidget, objValue);



			}
			break;
			case "iosBackground": {
				


		setBackground(nativeWidget, objValue);



			}
			break;
			case "iosDisabledBackground": {
				


		setDisabledBackground(nativeWidget, objValue);



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
			case "enabled": {
				


		 setEnabled(objValue);



			}
			break;
			case "textColorHighlight": {
				


		setTextColorHighlight(objValue);



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
			case "completionThreshold": {
				


		setThreshold(objValue);



			}
			break;
			case "completionHintView": {
				


		setCompletionView(objValue);



			}
			break;
			case "completionHint": {
				


		setCompletionHint(objValue);



			}
			break;
			case "entries": {
				


		setEntries(objValue);



			}
			break;
			case "dropDownHeight": {
				


		setDropDownHeight(objValue);



			}
			break;
			case "dropDownHorizontalOffset": {
				


		setDropDownHorizontalOffset(objValue);



			}
			break;
			case "dropDownVerticalOffset": {
				


		setDropDownVerticalOffset(objValue);



			}
			break;
			case "dropDownWidth": {
				


		setDropDownWidth(objValue);



			}
			break;
			case "dropDownSelector": {
				


		setDropDownlistSelector(objValue);



			}
			break;
			case "dropDownAnchor": {
				


		setDropDownAnchor(objValue);



			}
			break;
			case "listitem": {
				


		 addTemplate(objValue);



			}
			break;
			case "onDismiss": {
				


		if (objValue instanceof String) {setOnDismissListener(new OnDismissListener(this, strValue, "onDismiss"));} else {setOnDismissListener((AutoCompleteTextView.OnDismissListener) objValue);}



			}
			break;
			case "showDropDown": {
				


		showDropDown(objValue);



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
			case "textSize": {
				


		setMyTextSize(objValue);



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
			case "password": {
				


		setPasswordType(objValue);



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
			case "onEditorAction": {
				


		 setOnEditorAction(objValue);



			}
			break;
			case "textColorHint": {
				


		 setHintColor(objValue);



			}
			break;
			case "iosInputAccessoryViewDoneButton": {
				


		setInputAccessoryViewDoneButton(objValue);



			}
			break;
			case "onFocusChange": {
				


		 setOnFocus(objValue);



			}
			break;
			case "textColor": {
				


		setTextColor(objValue);



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
			case "iosBorderStyle": {
				


		 setBorderStyle(objValue);



			}
			break;
			case "hintTextFormat": {
				


		setHintTextFormat(objValue);



			}
			break;
			case "textAllCaps": {
				


		 setTextAllCaps(objValue);



			}
			break;
			case "iosInputView": {
				


		 setInputView(objValue);



			}
			break;
			case "setFocus": {
				


		setFocus(objValue);



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
			case "hint":
			case "iosPlaceholder": {
return getPlaceholder();				}
			case "iosTextColor": {
return getTextColor();				}
			case "iosAdjustsFontSizeToFitWidth": {
return getAdjustsFontSizeToFitWidth();				}
			case "iosMinimumFontSize": {
return getMinimumFontSize();				}
			case "iosIsEditing": {
return getIsEditing();				}
			case "iosClearsOnBeginEditing": {
return getClearsOnBeginEditing();				}
			case "iosClearsOnInsertion": {
return getClearsOnInsertion();				}
			case "iosAllowsEditingTextAttributes": {
return getAllowsEditingTextAttributes();				}
			case "iosBackground": {
return getBackground();				}
			case "iosDisabledBackground": {
return getDisabledBackground();				}
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
			case "textColorHighlight": {
return getTextColorHighlight();				}
			case "firstBaselineToTopHeight": {
return getFirstBaselineToTopHeight();				}
			case "lastBaselineToBottomHeight": {
return getLastBaselineToBottomHeight();				}
			case "completionHint": {
return getCompletionHint();				}
			case "dropDownHeight": {
return getDropDownHeight();				}
			case "dropDownHorizontalOffset": {
return getDropDownHorizontalOffset();				}
			case "dropDownVerticalOffset": {
return getDropDownVerticalOffset();				}
			case "dropDownWidth": {
return getDropDownWidth();				}
			case "dropDownAnchor": {
return getDropDownAnchor();				}
			case "text": {
return getMyText();				}
			case "gravity": {
return getGravity();				}
			case "cursorVisible": {
return getCursorVisible();				}
			case "textSize": {
return getTextSize();				}
			case "inputType": {
return getInputType();				}
			case "imeOptions": {
return getImeOptions();				}
			case "textColor": {
return getTextColorState();				}
			case "onTextChange": {
return this.textWatchers == null ? null:this.textWatchers.get(key.getAttributeName());				}
		}
		
		return null;
	}
	
	@Override
	public Object asWidget() {
		return measurableView;
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
		ASUITextField* tv = ((ASUITextField*)self.uiView);
		
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
		ASUITextField* tv = ((ASUITextField*)self.uiView);
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
		ASUITextField* tv = ((ASUITextField*)self.uiView);
		tv.autocorrectionType = capitalizeType;
	]-*/;
	
	
	private native boolean getCursorVisible() /*-[
		ASUITextField* tv = ((ASUITextField*)self.uiView);
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
			return ((ASUITextField*) uiView_).text.length + (string.length - range.length) <= maxLength_;
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
			[((ASUITextField*)self.uiView) setKeyboardType: UIKeyboardTypePhonePad];
		} else {
			[((ASUITextField*)self.uiView) setKeyboardType: UIKeyboardTypeDefault];
		}
	]-*/;
	

	private native Object getFont() /*-[
		return ((ASUITextField*)self.uiView).font;
	]-*/;
	
	private void setInputType(Object objValue) {
		nativeSetKeyboardType((int) objValue);
	}

	private native void nativeSetKeyboardType(int value) /*-[
		[((ASUITextField*)self.uiView) setKeyboardType: value];
	]-*/;
	
	
	private Object getInputType() {
		return nativeGetKeyboardType();
	}
	
	private native int nativeGetKeyboardType() /*-[
		return ((ASUITextField*)self.uiView).keyboardType;
	]-*/;
	
	
	
	private void setImeOptions(Object objValue, String strValue) {
		nativeSetImeOptions((int) objValue);
	}
	
	private native void nativeSetImeOptions(int imeOptions) /*-[
		[((ASUITextField*)self->uiView_) setReturnKeyType:imeOptions];
	]-*/;
	private native int nativeGetImeOptions() /*-[
		return ((ASUITextField*)self->uiView_).returnKeyType;
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
	-(BOOL)textField:(UITextField*)textField shouldChangeCharactersInRange:(NSRange)range replacementString:(NSString *)string{
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
	- (BOOL)textFieldShouldReturn:(UITextField*)textField {
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
		((ASUITextField*)self.uiView).inputAccessoryView = keyboardToolbar;
		

	]-*/;
	 /*-[
	-(void)doneButtonPressed:(id)sender withEvent:(UIEvent *) event{
		[self textFieldShouldReturn: ((ASUITextField*)self.uiView)];
	}
	- (void)textFieldDidBeginEditing:(UITextField*)textField{
		if (self->selectAllOnFocus_) {
			[self nativeSetSelectAllWithFloat: 0];
		}
		
		if (self->selectOnceOnFocus_) {
			self->selectOnceOnFocus_ = FALSE;
			[self nativeSetSelectAllWithFloat: 0.5];
		}
		
		[self sendPressStartEvent];
	}
	
	- (void)textFieldDidEndEditing:(UITextField*)textField{
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
		ASUITextField* tv = ((ASUITextField*)self.uiView);
		return [tv isFirstResponder];
	]-*/;
	//start - becomeFirstResponder
	private native void becomeFirstResponder() /*-[
		ASUITextField* tv = ((ASUITextField*)self.uiView);
		[tv becomeFirstResponder];
	]-*/;
	//end - becomeFirstResponder
	
	private native void nativeSetSelectAll(float delay) /*-[
		ASUITextField* tv = ((ASUITextField*)self.uiView);
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
	    [((ASUITextField*)self.uiView) addGestureRecognizer:tapGesture];	    
	]-*/;
	
	/*-[

	- (void)handleTap:(UITapGestureRecognizer *)gesture {
		ASUITextField* textView = ((ASUITextField*)self.uiView);
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
    	NSString * text = ((ASUITextField*) self->uiView_).text;
    	[((ASUITextField*) self->uiView_) setText:@""];
    	[((ASUITextField*) self->uiView_) setText:text];
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
	 	int x =   [((ASUITextField*)self.uiView) caretRectForPosition:((ASUITextField*)self.uiView).selectedTextRange.start].origin.x;
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
		[((ASUITextField*)self.uiView) setInputView:(UIView*) objValue];
	]-*/;
	private native void setPickerView()/*-[
		UIPickerView * picker = [UIPickerView new];
		picker.showsSelectionIndicator = YES;
		[((ASUITextField*)self.uiView) setInputView:picker];
	]-*/;
	
	private native void setDatePicker()/*-[
		UIDatePicker *datepicker = [UIDatePicker new];
    	[datepicker setDatePickerMode:UIDatePickerModeDate];
		[((ASUITextField*)self.uiView) setInputView:datepicker];
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
	


	private void nativeCreate(Map<String, Object> params) {
		simpleWrapableView.setDisableForeground(true);
		registerForAttributeCommandChain("hint");initPopUp();
		registerForAttributeCommandChainWithPhase("predraw", "drawableStart",  "drawableEnd", "drawableLeft", "drawableTop", "drawableRight", "drawableBottom",
    			"drawablePadding", "drawableTint", "drawableTintMode");
	}
	
	private native Object nativeCreateView(int viewType)/*-[
		ASUITextField* uiView = [ASUITextField new];
		uiView.delegate = self;
		if (viewType != -1) {
			uiView.commandRegex = ASAutoCompleteTextViewImpl_WIDGET_REGEX;
		}
		uiView.backgroundColor = [UIColor clearColor];
		return uiView;
	]-*/;

	private boolean callMeasureOnChange;
	private void addMinMaxListener() {
		if (!callMeasureOnChange) {
			nativeAddTextFieldDidChange();
		}
		callMeasureOnChange = true;
	}
	


	private native void nativeAddTextFieldDidChange() /*-[
		[((ASUITextField*)self.uiView) addTarget:self action:@selector(textFieldDidChange:) forControlEvents:UIControlEventEditingChanged];
	]-*/;

	/*-[

	-(void)textFieldDidChange:(UITextField *)textView{
		[self handleOnTextChange];
		[self handleOnAfterTextChange];
	   	if (callMeasureOnChange_) {
			[self remeasure];
		}
	}
	]-*/;
	
	private void setPasswordType(Object objValue) {
		nativeSetSecureTextEntry((boolean) objValue);
	}

	private native void nativeSetSecureTextEntry(boolean value) /*-[
		((ASUITextField*)self.uiView).secureTextEntry = value;
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
			}
		}
	}

	private void postSetAttributeEditText(WidgetAttribute key, String strValue, Object objValue,
			ILifeCycleDecorator decorator) {
		
		switch (key.getAttributeName()) {
			case "textAllCaps":
			case "maxLength":
			if (isInitialised()) {
				setMyText(getText());
			}
			break;

		default:
			break;
		}
	}
	private void setBorderStyle(Object value) {
		nativeSetBorderStyle((int) value);
	}
	private native void nativeSetBorderStyle(int value) /*-[
		[((ASUITextField*)self.uiView) setBorderStyle:value];
	]-*/;	
	


	@Override
	public int measureWidth() {
		int width = measurableView.nativeMeasureWidth(uiView);
		return width;
	}
	
	@Override
	public int measureHeight(int width) {
		int height = measurableView.nativeMeasureHeight(uiView, width);
		return height;
	}
	
	private void updatePadding() {
	}

	private native void nativeSetVerticalAligmentCenter() /*-[
	    ((ASUITextField*)self.uiView).contentVerticalAlignment = UIControlContentVerticalAlignmentCenter;
	]-*/;

	private native void nativeSetVerticalAligmentBottom() /*-[
		((ASUITextField*)self.uiView).contentVerticalAlignment = UIControlContentVerticalAlignmentBottom;
		
	]-*/;

	private native void nativeSetVerticalAligmentTop() /*-[
		((ASUITextField*)self.uiView).contentVerticalAlignment = UIControlContentVerticalAlignmentTop;
		
	]-*/;
	
	private void setHintColor(Object objValue) {
		if (objValue instanceof r.android.content.res.ColorStateList) {
			r.android.content.res.ColorStateList colorStateList = (r.android.content.res.ColorStateList) objValue;
			measurableView.setHintTextColor(colorStateList);
			objValue = measurableView.getCurrentHintTextColor();
		}

		nativeSetHintColor(ViewImpl.getColor(objValue));
	}
	
	private native void nativeSetHintColor(Object value) /*-[
		((ASUITextField*)self.uiView).placeHolderColor = (UIColor*) value;
	]-*/;

	private void syncPlaceholderLabel() {
		this.invalidate();
	}

	public native void nativeSetEnabled(boolean value) /*-[
		((ASUITextField*)self.uiView).enabled = value;
	]-*/;
	


	private void setFocus(Object objValue) {
		if ((boolean) objValue) {
			becomeFirstResponder();
		} else {
			setEnabled(false);
			setEnabled(true);
		}
		
	}
	
	public Object invokeMethodEditText(String methodName, Object... args) {
		if (methodName.equals("nativeWidgetFor") && args[0].equals("onFocusChange")) {
			return uiView;
		}
		return null;
	}
	


	private List<String> entries;
	private ListViewImpl listViewWidget;
	private IWidget popupContainer;
	private PopupDataObserver observer = new PopupDataObserver();
	private static final String DEFAULT_MODEL_FOR = "let item in . from entries->local into loopvar as map";

	private void setEntries(Object objValue) {
		this.entries = (List<String>)objValue;
	}

	private static boolean prepare;
	private IWidget createPopup() {
		r.android.widget.TextView promptView = null;
		// create frame layout wrapper
		IWidget parentWidget = WidgetFactory.createWidget(FrameLayoutImpl.LOCAL_NAME, FrameLayoutImpl.GROUP_NAME, (HasWidgets) getRootFragment().getRootWidget(), false);
		View parentView = (View) parentWidget.asWidget();
		
		// update params
		r.android.widget.RelativeLayout.LayoutParams playoutParams = (r.android.widget.RelativeLayout.LayoutParams) parentView.getLayoutParams();
		playoutParams.width = r.android.widget.RelativeLayout.LayoutParams.MATCH_PARENT;
		playoutParams.height = r.android.widget.RelativeLayout.LayoutParams.WRAP_CONTENT;
		HasWidgets listViewParent = (HasWidgets) parentWidget;
		
		//create hint view
		if (hintText != null) {
			IWidget hintContainerWidget = WidgetFactory.createWidget(LinearLayoutImpl.LOCAL_NAME,
					LinearLayoutImpl.GROUP_NAME, (HasWidgets) parentWidget, false);
			r.android.widget.LinearLayout hintContainer = (r.android.widget.LinearLayout) hintContainerWidget.asWidget();
			hintContainer.getLayoutParams().width = r.android.widget.RelativeLayout.LayoutParams.MATCH_PARENT;
			hintContainer.getLayoutParams().height = r.android.widget.RelativeLayout.LayoutParams.WRAP_CONTENT;
			hintContainer.setOrientation(r.android.widget.LinearLayout.VERTICAL);
			
			listViewParent = (HasWidgets) hintContainerWidget;

			if (mPromptPosition == 0) {
				promptView = createHintView(hintContainerWidget);
			}
		}
		
		// create list view
		listViewWidget = (ListViewImpl) WidgetFactory.createWidget(ListViewImpl.LOCAL_NAME, ListViewImpl.GROUP_NAME, listViewParent, false);
		View listView = (View) listViewWidget.asWidget();
		
		if (hintText != null) {
			if (mPromptPosition == 1) {
				promptView = createHintView(listViewParent);
			}
		}
		
		// update params
		listView.getLayoutParams().width = r.android.widget.RelativeLayout.LayoutParams.MATCH_PARENT;
		if (islinearlayout()) {
			(((r.android.view.ViewGroup)listView).getChildAt(0)).getLayoutParams().width = r.android.widget.RelativeLayout.LayoutParams.MATCH_PARENT;
			((r.android.view.ViewGroup)((r.android.view.ViewGroup)listView).getChildAt(0)).getChildAt(0).getLayoutParams().width = r.android.widget.RelativeLayout.LayoutParams.MATCH_PARENT;
		} else {
			listView.getLayoutParams().height = r.android.widget.RelativeLayout.LayoutParams.MATCH_PARENT;
		}
		setAttrsOnListView();
		
		measurableView.setAdapter(listViewWidget.getListAdapter());
		measurableView.init(parentView, listView, promptView, playoutParams);
		
		if (dropDownAnchor != -1) {
			measurableView.setAnchorView((View) fragment.getRootWidget().findWidgetById(IdGenerator.getName(dropDownAnchor)).asWidget());
		}
		measurableView.setOnDismissListener(this.onDismissListener);
		setAttrsOnTextView();
		addOutsideTouchListener(true);
		
		return parentWidget;
	}

	public void setAttrsOnListView() {
		if (dropDownlistSelector != null) {
			listViewWidget.setAttribute("listSelector", dropDownlistSelector, true);	
		}

		// create observer
		listViewWidget.getListAdapter().registerDataSetObserver(observer);
		listViewWidget.setModelFor(DEFAULT_MODEL_FOR);

		if (listItem == null) {
			listViewWidget.addTemplate(quickConvert("@layout/autocomplete_entries", "template"));
		} else {
			listViewWidget.addTemplate(listItem);
		}
		
		listViewWidget.setModelDescPath(getModelDescPath());
		listViewWidget.setModelIdPath(getModelIdPath());

		listViewWidget.setOnItemClick(new r.android.widget.AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(r.android.widget.AdapterView<?> parent, View view, int position, long id) {
				String desc = listViewWidget.getListAdapter().getItem(position).toString();
				setMyText(desc);
				measurableView.dismissDropDown();
			}
		});
	}

	public r.android.widget.TextView createHintView(IWidget hintContainerWidget) {
		r.android.widget.LinearLayout.LayoutParams hintParams = new r.android.widget.LinearLayout.LayoutParams(r.android.view.ViewGroup.LayoutParams.MATCH_PARENT, 0, 1.0f);
		r.android.widget.TextView promptView;
		IWidget promptWidget = (IWidget) quickConvert(hintViewPath, "template");
		promptWidget = promptWidget.loadLazyWidgets((HasWidgets) hintContainerWidget);
		promptView = (r.android.widget.TextView) promptWidget.asWidget();
		promptWidget.setAttribute("text", hintText, true);
		promptView.setLayoutParams(hintParams);
		return promptView;
	}


	private void unregisterDataSetObserver() {
		try {
			listViewWidget.getListAdapter().unregisterDataSetObserver(observer);
		} catch (IllegalStateException e) {
		}
	}

	private final class PopupDataObserver extends r.android.database.DataSetObserver {
		@Override
		public void onChanged() {
			ArrayList<com.ashera.model.LoopParam> items = new ArrayList<>();
			for (int i = 0; i < listViewWidget.getListAdapter().getCount(); i++) {
				items.add((com.ashera.model.LoopParam) listViewWidget.getListAdapter().getItem(i));
			}
			listViewWidget.storeUserData("entries", items);
			listViewWidget.notifyDataSetChanged();
			
			if (myobserver != null) {
				myobserver.onChanged();
			}
		}
	}


	private void createEntries() {
		listViewWidget.getData().clear();

		if (entries != null) {
			for (String entry : entries) {
				com.ashera.model.LoopParam loopParam = new com.ashera.model.LoopParam() {
					@Override
					public java.lang.String toString() {
						return entry;
					}
				};
				loopParam.put("item", entry);
				listViewWidget.getData().add(loopParam);
			}
		} else {
			listViewWidget.getData().addAll(dataList);
		}
	}

	private void beforetextChange(String s, int start, int count) {
		if(isInitialised()) {
			createPopUpIfRequired();
//			measurableView.onKeyDown(e.keyCode, new r.android.view.KeyEvent());
			measurableView.getTextWatcher().beforeTextChanged(s, start, count, s.length());
			
		}
	}

	private void createPopUpIfRequired() {
		if (popupContainer == null) {
			popupContainer = createPopup();
			movePopUpContainerToTop();
		}
		
		createEntries();
	}

	private void afterTextChanged() {
		if (isInitialised()) {
			measurableView.getTextWatcher().afterTextChanged(null);
		}
	}

	private void removePopUpContainer() {
		
		if (popupContainer != null) {
			popupContainer.getParent().remove(popupContainer);
			popupContainer = null;
		}
		unregisterDataSetObserver();
		addOutsideTouchListener(false);
	}
	
	private void setThreshold(Object objValue) {
		measurableView.setThreshold((int) objValue);
	}
	
	private String hintText;
	private int mPromptPosition = 1;
	private void setCompletionHint(Object objValue) {
		hintText = (String) objValue;
	}

	
	private String getCompletionHint() {
		return hintText;
	}
	
	private String hintViewPath = "@layout/autocomplete_completion";	
	private void setCompletionView(Object objValue) {
		hintViewPath = (String) objValue;
	}
	
	private Object dropDownlistSelector;
	private void setDropDownlistSelector(Object objValue) {
		this.dropDownlistSelector = objValue;
		
	}
	private int dropDownWidth = -1;
	private void setDropDownWidth(Object objValue) {
		dropDownWidth = (int) objValue;
	}

	private int dropDownVerticalOffset = -1;
	private void setDropDownVerticalOffset(Object objValue) {
		dropDownVerticalOffset = (int) objValue;
	}

	private int dropDownHorizontalOffset = -1;
	private void setDropDownHorizontalOffset(Object objValue) {
		dropDownHorizontalOffset = (int) objValue;		
	}

	private int dropDownHeight = -1;
	private void setDropDownHeight(Object objValue) {
		dropDownHeight = (int) objValue;		
	}
	
	
	private Object getDropDownWidth() {
		return dropDownWidth;
	}

	private Object getDropDownVerticalOffset() {
		return dropDownVerticalOffset;
	}

	private Object getDropDownHorizontalOffset() {
		return dropDownHorizontalOffset;
	}

	private Object getDropDownHeight() {
		return dropDownHeight;
	}
	
	private void setAttrsOnTextView() {
		if (dropDownWidth != -1) {
			measurableView.setDropDownWidth(dropDownWidth);
		}
		
		if (dropDownHeight != -1) {
			measurableView.setDropDownHeight(dropDownHeight);
		}
		
		if (dropDownVerticalOffset != -1) {
			measurableView.setDropDownVerticalOffset(dropDownVerticalOffset);
		}
		
		if (dropDownHorizontalOffset != -1) {
			measurableView.setDropDownHorizontalOffset(dropDownHorizontalOffset);
		}
	}

	private int dropDownAnchor = -1;
	private void setDropDownAnchor(Object objValue) {
		dropDownAnchor = (int) objValue;
	}
	
	private Object getDropDownAnchor() {
		return dropDownAnchor;
	}

	@Override
	public Object getChildAttribute(IWidget w, WidgetAttribute key) {
		return null;
	}

	@Override
	public void setChildAttribute(IWidget widget, WidgetAttribute key, String strValue, Object value) {
	}
	
	private AutoCompleteTextView.OnDismissListener onDismissListener;
	private void setOnDismissListener(AutoCompleteTextView.OnDismissListener onDismissListener) {
		this.onDismissListener = onDismissListener;
	}
	
	private final static class OutsideEventListener extends com.ashera.widget.bus.EventBusHandler {
		private AutoCompleteTextViewImpl window;
		private OutsideEventListener(AutoCompleteTextViewImpl window, String type) {
			super(type);
			this.window = window;
		}

		@Override
		protected void doPerform(java.lang.Object payload) {
			if (!window.isFocused()) {
				window.measurableView.dismissDropDown();
			}
		}
	}


	public void showDropDown(Object objValue) {
		if ((boolean) objValue) {
			if (isInitialised()) {
				createPopUpIfRequired();
				r.android.database.DataSetObserver tmpObserver = measurableView.getObserver();
				
				String myText = (String) getMyText();
	
				listViewWidget.getListAdapter().unregisterDataSetObserver(tmpObserver);
				listViewWidget.getListAdapter().dofilterSync(myText);
				measurableView.showDropDown();
				listViewWidget.getListAdapter().registerDataSetObserver(tmpObserver);
				getFragment().remeasure();
			}
		} else {
			if (listViewWidget != null) {
				measurableView.dismissDropDown();
			}
		}
	}
	
	
	@Override
	public Object invokeMethod(String methodName, java.lang.Object... args) {
		switch (methodName) {
		case "setDataObserver":
			setDataObserver(args[0]);
			break;

		default:
			
			break;
		}
		return invokeMethodEditText(methodName, args);
	}
	r.android.database.DataSetObserver myobserver;
	private void setDataObserver(Object observer) {
		myobserver = (r.android.database.DataSetObserver) observer;
	}
	
	
	private void postSetAttribute(WidgetAttribute key, String strValue, Object objValue,
			ILifeCycleDecorator decorator) {
		switch (key.getAttributeName()) {
		case "showDropDown":
			break;
		default:
			postSetAttributeEditText(key, strValue, objValue, decorator);
			break;
		}
	}
	


	private OutsideEventListener outsideEventListener;
	public void addOutsideTouchListener(boolean add) {
		com.ashera.widget.bus.Event.StandardEvents type = com.ashera.widget.bus.Event.StandardEvents.outsideClicked;
		
		if (outsideEventListener != null) {
			fragment.getEventBus().off(outsideEventListener);
			outsideEventListener = null;
		}

		if (add) {
			outsideEventListener = new OutsideEventListener(this, type.toString());
			fragment.getEventBus().on(type.toString(), outsideEventListener);
		}
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
    
    


	private static int ITALIC_FONT_TRAIT = LayoutNativeVars.UIFontDescriptorTraitItalic;
	private static int BOLD_FONT_TRAIT = LayoutNativeVars.UIFontDescriptorTraitBold;
	private static final int NORMAL_FONT_TRAIT = 0;
	
    private int nativeGetFontSize() {
    	return (int) Math.ceil((float)getTextSize());
    }
    
    private native int nativeGetFontStyle() /*-[	 
    	ASUITextField* label = ((ASUITextField*)self->uiView_);
    	return label.font.fontDescriptor.symbolicTraits;
   	]-*/;
    private native void nativeSetCustomFont(int height, com.ashera.model.FontDescriptor fontDescriptor) /*-[	
    	ASUITextField* label = ((ASUITextField*)self->uiView_);
     	UIFont* font = [UIFont fontWithName:[fontDescriptor getName] size:height];
     	if (font == nil) {
        	[NSException raise:@"InitNotImplemented" format:@"%@", [NSString stringWithFormat:@"Failed to load the %@ font. Make sure the font file is included in the project and the font name is spelled correctly.", [fontDescriptor getName]]];
    	}
     	if ([fontDescriptor getStyle] != 0) {
	      UIFontDescriptor* fontD = [font.fontDescriptor fontDescriptorWithSymbolicTraits:[fontDescriptor getStyle]];
	      ((ASUITextField*)label).font = [UIFont fontWithDescriptor:fontD size:0];
	    } else {
	        ((ASUITextField*)label).font = font;
	    }
    ]-*/;
    
    private native void nativeSetFontStyle(int style) /*-[
		ASUITextField* label = ((ASUITextField*)self->uiView_);
  		UIFontDescriptor* fontD = [label.font.fontDescriptor fontDescriptorWithSymbolicTraits:style];
  		((ASUITextField*)label).font = [UIFont fontWithDescriptor:fontD size:0];
	]-*/;
    


	public void setPadding(Object objValue) {
		int value = (int) objValue;
		View view = (View) asWidget();
		ViewImpl.setPadding(value, view);
	}

	public void setPaddingBottom(Object objValue) {
		int value = (int) objValue;
		View view = (View) asWidget();
		ViewImpl.setPaddingBottom(value, view);
	}
	public void setPaddingTop(Object objValue) {
		int value = (int) objValue;
		View view = (View) asWidget();
		ViewImpl.setPaddingTop(value, view);
	}
	public void setPaddingLeft(Object objValue) {
		int value = (int) objValue;
		View view = (View) asWidget();
		ViewImpl.setPaddingLeft(value, view);
	}
	public void setPaddingRight(Object objValue) {
		int value = (int) objValue;
		View view = (View) asWidget();
		ViewImpl.setPaddingRight(value, view);	
	}
	
	private Object getPaddingTop() {
		return ((View) asWidget()).getPaddingTop();
	}

	private Object getPaddingEnd() {
		return ((View) asWidget()).getPaddingEnd();
	}

	private Object getPaddingStart() {
		return ((View) asWidget()).getPaddingStart();
	}

	private Object getPaddingLeft() {
		return ((View) asWidget()).getPaddingLeft();
	}

	private Object getPaddingRight() {
		return ((View) asWidget()).getPaddingRight();
	}

	private Object getPaddingBottom() {
		return ((View) asWidget()).getPaddingBottom();
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
	


	

	private void handleHtmlText(String text) {
		nativeSetHtmlText(com.ashera.parser.html.Html.fromHtml(text, htmlConfig, fragment).get());
	}
	private native void nativeSetText(String text)/*-[
		[((ASUITextField*)self->uiView_) setText:text];
	]-*/;
	
	private native void nativeSetHtmlText(Object text)/*-[
		[((ASUITextField*)self->uiView_) setAttributedText : (NSMutableAttributedString*)text];
	]-*/;
	
	private native Object getMyText() /*-[
		return ((ASUITextField*)self.uiView).text;
	]-*/;
	


	private native Object getTextSize() /*-[
		  return [JavaLangFloat valueOfWithFloat:((ASUITextField*)self.uiView).font.pointSize];
	]-*/;
	private void setMyTextSize(Object objValue) {
		float fontSize = ((float) objValue) * getFragment().getRootActivity().getScaleFactor();
		nativeSetTextSize((int) fontSize);
	}
	
	private native void nativeSetTextSize(int value)/*-[
		[((ASUITextField*)self.uiView) setFont: [((ASUITextField*)self.uiView).font fontWithSize: value]];
	]-*/;
	


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
		((ASUITextField*)self.uiView).textAlignment = NSTextAlignmentCenter;
	]-*/;
	
	private void setHorizontalAligmentRight()  {
		setHorizontalAligmentRightInternal();
	}

	private native void setHorizontalAligmentRightInternal() /*-[
		((ASUITextField*)self.uiView).textAlignment = NSTextAlignmentRight;
	]-*/;

	private void setHorizontalAligmentLeft() {
		setHorizontalAligmentLeftInternal();
	}
	
	private native void setHorizontalAligmentLeftInternal() /*-[
		((ASUITextField*)self.uiView).textAlignment = NSTextAlignmentLeft;
	]-*/;

	private static final int TEXT_ALIGN_CENTER = 2; 
	private static final int TEXT_ALIGN_LEFT = 0; 
	private static final int TEXT_ALIGN_RIGHT = 1; 

    private native int getTextAlignment() /*-[
    	int alignment = (int) ((ASUITextField*)self.uiView).textAlignment;
    	
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
	


	public int getBorderPadding() {return 0;}
	
	public int getLineHeightPadding() {
		return 0;
	}
	
	private native int getLineHeight() /*-[
  		return ceil(((ASUITextField*)self.uiView).font.lineHeight);
	]-*/;
	private int getBorderWidth() {
		return 0;
	}
	


	private void setTextColorHighlight(Object objValue) {
		ViewImpl.setTintColor(uiView, objValue);
	}
	
	
	private Object getTextColorHighlight() {
		return ViewImpl.getTintColor(uiView);
	}
	

	public native void setText(Object nativeWidget, Object value) /*-[
((ASUITextField*) nativeWidget).text = (NSString*) value;
]-*/;
	public native Object getText() /*-[
return ((ASUITextField*) uiView_).text;
  ]-*/;
	public native void setPlaceholder(Object nativeWidget, Object value) /*-[
((ASUITextField*) nativeWidget).placeholder = (NSString*) value;
]-*/;
	public native Object getPlaceholder() /*-[
return ((ASUITextField*) uiView_).placeholder;
  ]-*/;
	public native void setTextColor(Object nativeWidget, Object value) /*-[
((ASUITextField*) nativeWidget).textColor = (UIColor*) value;
]-*/;
	public native Object getTextColor() /*-[
return ((ASUITextField*) uiView_).textColor;
  ]-*/;
	public native void setAdjustsFontSizeToFitWidth(Object nativeWidget, Object value) /*-[
((ASUITextField*) nativeWidget).adjustsFontSizeToFitWidth = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public native Object getAdjustsFontSizeToFitWidth() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITextField*) uiView_).adjustsFontSizeToFitWidth];
  ]-*/;
	public native void setMinimumFontSize(Object nativeWidget, Object value) /*-[
((ASUITextField*) nativeWidget).minimumFontSize = [(JavaLangFloat*) value floatValue];
]-*/;
	public native Object getMinimumFontSize() /*-[
return [JavaLangFloat valueOfWithFloat :((ASUITextField*) uiView_).minimumFontSize];
  ]-*/;
	public native Object getIsEditing() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITextField*) uiView_).editing];
  ]-*/;
	public native void setClearsOnBeginEditing(Object nativeWidget, Object value) /*-[
((ASUITextField*) nativeWidget).clearsOnBeginEditing = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public native Object getClearsOnBeginEditing() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITextField*) uiView_).clearsOnBeginEditing];
  ]-*/;
	public native void setClearsOnInsertion(Object nativeWidget, Object value) /*-[
((ASUITextField*) nativeWidget).clearsOnInsertion = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public native Object getClearsOnInsertion() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITextField*) uiView_).clearsOnInsertion];
  ]-*/;
	public native void setAllowsEditingTextAttributes(Object nativeWidget, Object value) /*-[
((ASUITextField*) nativeWidget).allowsEditingTextAttributes = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public native Object getAllowsEditingTextAttributes() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITextField*) uiView_).allowsEditingTextAttributes];
  ]-*/;
	public native void setBackground(Object nativeWidget, Object value) /*-[
((ASUITextField*) nativeWidget).background = (UIImage*) value;
]-*/;
	public native Object getBackground() /*-[
return ((ASUITextField*) uiView_).background;
  ]-*/;
	public native void setDisabledBackground(Object nativeWidget, Object value) /*-[
((ASUITextField*) nativeWidget).disabledBackground = (UIImage*) value;
]-*/;
	public native Object getDisabledBackground() /*-[
return ((ASUITextField*) uiView_).disabledBackground;
  ]-*/;
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
	
private AutoCompleteTextViewCommandBuilder builder;
private AutoCompleteTextViewBean bean;
public Object getPlugin(String plugin) {
	return WidgetFactory.getAttributable(plugin).newInstance(this);
}
public AutoCompleteTextViewBean getBean() {
	if (bean == null) {
		bean = new AutoCompleteTextViewBean();
	}
	return bean;
}
public AutoCompleteTextViewCommandBuilder getBuilder() {
	if (builder == null) {
		builder = new AutoCompleteTextViewCommandBuilder();
	}
	return builder;
}


public  class AutoCompleteTextViewCommandBuilder extends com.ashera.layout.ViewImpl.ViewCommandBuilder <AutoCompleteTextViewCommandBuilder> {
    public AutoCompleteTextViewCommandBuilder() {
	}
	
	public AutoCompleteTextViewCommandBuilder execute(boolean setter) {
		if (setter) {
			executeCommand(command, null, IWidget.COMMAND_EXEC_SETTER_METHOD);
			getFragment().remeasure();
		}
		executeCommand(command, null, IWidget.COMMAND_EXEC_GETTER_METHOD);
return this;	}

public AutoCompleteTextViewCommandBuilder tryGetIosText() {
	Map<String, Object> attrs = initCommand("iosText");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getIosText() {
	Map<String, Object> attrs = initCommand("iosText");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setIosText(String value) {
	Map<String, Object> attrs = initCommand("iosText");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetIosPlaceholder() {
	Map<String, Object> attrs = initCommand("iosPlaceholder");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getIosPlaceholder() {
	Map<String, Object> attrs = initCommand("iosPlaceholder");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setIosPlaceholder(String value) {
	Map<String, Object> attrs = initCommand("iosPlaceholder");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetHint() {
	Map<String, Object> attrs = initCommand("iosPlaceholder");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getHint() {
	Map<String, Object> attrs = initCommand("iosPlaceholder");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setHint(String value) {
	Map<String, Object> attrs = initCommand("hint");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetIosTextColor() {
	Map<String, Object> attrs = initCommand("iosTextColor");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getIosTextColor() {
	Map<String, Object> attrs = initCommand("iosTextColor");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setIosTextColor(String value) {
	Map<String, Object> attrs = initCommand("iosTextColor");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetIosAdjustsFontSizeToFitWidth() {
	Map<String, Object> attrs = initCommand("iosAdjustsFontSizeToFitWidth");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object isIosAdjustsFontSizeToFitWidth() {
	Map<String, Object> attrs = initCommand("iosAdjustsFontSizeToFitWidth");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setIosAdjustsFontSizeToFitWidth(boolean value) {
	Map<String, Object> attrs = initCommand("iosAdjustsFontSizeToFitWidth");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetIosMinimumFontSize() {
	Map<String, Object> attrs = initCommand("iosMinimumFontSize");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getIosMinimumFontSize() {
	Map<String, Object> attrs = initCommand("iosMinimumFontSize");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setIosMinimumFontSize(float value) {
	Map<String, Object> attrs = initCommand("iosMinimumFontSize");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetIosIsEditing() {
	Map<String, Object> attrs = initCommand("iosIsEditing");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object isIosIsEditing() {
	Map<String, Object> attrs = initCommand("iosIsEditing");
	return attrs.get("commandReturnValue");
}

public AutoCompleteTextViewCommandBuilder tryGetIosClearsOnBeginEditing() {
	Map<String, Object> attrs = initCommand("iosClearsOnBeginEditing");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object isIosClearsOnBeginEditing() {
	Map<String, Object> attrs = initCommand("iosClearsOnBeginEditing");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setIosClearsOnBeginEditing(boolean value) {
	Map<String, Object> attrs = initCommand("iosClearsOnBeginEditing");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetIosClearsOnInsertion() {
	Map<String, Object> attrs = initCommand("iosClearsOnInsertion");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object isIosClearsOnInsertion() {
	Map<String, Object> attrs = initCommand("iosClearsOnInsertion");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setIosClearsOnInsertion(boolean value) {
	Map<String, Object> attrs = initCommand("iosClearsOnInsertion");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetIosAllowsEditingTextAttributes() {
	Map<String, Object> attrs = initCommand("iosAllowsEditingTextAttributes");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object isIosAllowsEditingTextAttributes() {
	Map<String, Object> attrs = initCommand("iosAllowsEditingTextAttributes");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setIosAllowsEditingTextAttributes(boolean value) {
	Map<String, Object> attrs = initCommand("iosAllowsEditingTextAttributes");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetIosBackground() {
	Map<String, Object> attrs = initCommand("iosBackground");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getIosBackground() {
	Map<String, Object> attrs = initCommand("iosBackground");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setIosBackground(String value) {
	Map<String, Object> attrs = initCommand("iosBackground");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetIosDisabledBackground() {
	Map<String, Object> attrs = initCommand("iosDisabledBackground");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getIosDisabledBackground() {
	Map<String, Object> attrs = initCommand("iosDisabledBackground");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setIosDisabledBackground(String value) {
	Map<String, Object> attrs = initCommand("iosDisabledBackground");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setPadding(String value) {
	Map<String, Object> attrs = initCommand("padding");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetPaddingBottom() {
	Map<String, Object> attrs = initCommand("paddingBottom");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getPaddingBottom() {
	Map<String, Object> attrs = initCommand("paddingBottom");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setPaddingBottom(String value) {
	Map<String, Object> attrs = initCommand("paddingBottom");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetPaddingRight() {
	Map<String, Object> attrs = initCommand("paddingRight");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getPaddingRight() {
	Map<String, Object> attrs = initCommand("paddingRight");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setPaddingRight(String value) {
	Map<String, Object> attrs = initCommand("paddingRight");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetPaddingLeft() {
	Map<String, Object> attrs = initCommand("paddingLeft");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getPaddingLeft() {
	Map<String, Object> attrs = initCommand("paddingLeft");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setPaddingLeft(String value) {
	Map<String, Object> attrs = initCommand("paddingLeft");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetPaddingStart() {
	Map<String, Object> attrs = initCommand("paddingStart");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getPaddingStart() {
	Map<String, Object> attrs = initCommand("paddingStart");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setPaddingStart(String value) {
	Map<String, Object> attrs = initCommand("paddingStart");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetPaddingEnd() {
	Map<String, Object> attrs = initCommand("paddingEnd");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getPaddingEnd() {
	Map<String, Object> attrs = initCommand("paddingEnd");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setPaddingEnd(String value) {
	Map<String, Object> attrs = initCommand("paddingEnd");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetPaddingTop() {
	Map<String, Object> attrs = initCommand("paddingTop");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getPaddingTop() {
	Map<String, Object> attrs = initCommand("paddingTop");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setPaddingTop(String value) {
	Map<String, Object> attrs = initCommand("paddingTop");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setPaddingHorizontal(String value) {
	Map<String, Object> attrs = initCommand("paddingHorizontal");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setPaddingVertical(String value) {
	Map<String, Object> attrs = initCommand("paddingVertical");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setDrawableStart(String value) {
	Map<String, Object> attrs = initCommand("drawableStart");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setDrawableEnd(String value) {
	Map<String, Object> attrs = initCommand("drawableEnd");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setDrawableTop(String value) {
	Map<String, Object> attrs = initCommand("drawableTop");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setDrawableBottom(String value) {
	Map<String, Object> attrs = initCommand("drawableBottom");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetDrawablePadding() {
	Map<String, Object> attrs = initCommand("drawablePadding");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getDrawablePadding() {
	Map<String, Object> attrs = initCommand("drawablePadding");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setDrawablePadding(String value) {
	Map<String, Object> attrs = initCommand("drawablePadding");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setDrawableTint(String value) {
	Map<String, Object> attrs = initCommand("drawableTint");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setDrawableTintMode(String value) {
	Map<String, Object> attrs = initCommand("drawableTintMode");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setDrawableIconSize(String value) {
	Map<String, Object> attrs = initCommand("drawableIconSize");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetMinLines() {
	Map<String, Object> attrs = initCommand("minLines");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getMinLines() {
	Map<String, Object> attrs = initCommand("minLines");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setMinLines(int value) {
	Map<String, Object> attrs = initCommand("minLines");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setLines(int value) {
	Map<String, Object> attrs = initCommand("lines");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetMaxLines() {
	Map<String, Object> attrs = initCommand("maxLines");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getMaxLines() {
	Map<String, Object> attrs = initCommand("maxLines");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setMaxLines(int value) {
	Map<String, Object> attrs = initCommand("maxLines");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetMinWidth() {
	Map<String, Object> attrs = initCommand("minWidth");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getMinWidth() {
	Map<String, Object> attrs = initCommand("minWidth");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setMinWidth(String value) {
	Map<String, Object> attrs = initCommand("minWidth");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetMinHeight() {
	Map<String, Object> attrs = initCommand("minHeight");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getMinHeight() {
	Map<String, Object> attrs = initCommand("minHeight");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setMinHeight(String value) {
	Map<String, Object> attrs = initCommand("minHeight");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetMaxWidth() {
	Map<String, Object> attrs = initCommand("maxWidth");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getMaxWidth() {
	Map<String, Object> attrs = initCommand("maxWidth");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setMaxWidth(String value) {
	Map<String, Object> attrs = initCommand("maxWidth");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetMaxHeight() {
	Map<String, Object> attrs = initCommand("maxHeight");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getMaxHeight() {
	Map<String, Object> attrs = initCommand("maxHeight");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setMaxHeight(String value) {
	Map<String, Object> attrs = initCommand("maxHeight");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetHeight() {
	Map<String, Object> attrs = initCommand("height");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getHeight() {
	Map<String, Object> attrs = initCommand("height");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setHeight(String value) {
	Map<String, Object> attrs = initCommand("height");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetWidth() {
	Map<String, Object> attrs = initCommand("width");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getWidth() {
	Map<String, Object> attrs = initCommand("width");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setWidth(String value) {
	Map<String, Object> attrs = initCommand("width");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetMaxEms() {
	Map<String, Object> attrs = initCommand("maxEms");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getMaxEms() {
	Map<String, Object> attrs = initCommand("maxEms");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setMaxEms(int value) {
	Map<String, Object> attrs = initCommand("maxEms");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetMinEms() {
	Map<String, Object> attrs = initCommand("minEms");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getMinEms() {
	Map<String, Object> attrs = initCommand("minEms");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setMinEms(int value) {
	Map<String, Object> attrs = initCommand("minEms");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setEms(int value) {
	Map<String, Object> attrs = initCommand("ems");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setEditable(boolean value) {
	Map<String, Object> attrs = initCommand("editable");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setMaxLength(int value) {
	Map<String, Object> attrs = initCommand("maxLength");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setTypeface(String value) {
	Map<String, Object> attrs = initCommand("typeface");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setTextStyle(String value) {
	Map<String, Object> attrs = initCommand("textStyle");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setFontFamily(String value) {
	Map<String, Object> attrs = initCommand("fontFamily");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setEnabled(boolean value) {
	Map<String, Object> attrs = initCommand("enabled");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetTextColorHighlight() {
	Map<String, Object> attrs = initCommand("textColorHighlight");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getTextColorHighlight() {
	Map<String, Object> attrs = initCommand("textColorHighlight");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setTextColorHighlight(String value) {
	Map<String, Object> attrs = initCommand("textColorHighlight");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetFirstBaselineToTopHeight() {
	Map<String, Object> attrs = initCommand("firstBaselineToTopHeight");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getFirstBaselineToTopHeight() {
	Map<String, Object> attrs = initCommand("firstBaselineToTopHeight");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setFirstBaselineToTopHeight(String value) {
	Map<String, Object> attrs = initCommand("firstBaselineToTopHeight");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetLastBaselineToBottomHeight() {
	Map<String, Object> attrs = initCommand("lastBaselineToBottomHeight");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getLastBaselineToBottomHeight() {
	Map<String, Object> attrs = initCommand("lastBaselineToBottomHeight");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setLastBaselineToBottomHeight(String value) {
	Map<String, Object> attrs = initCommand("lastBaselineToBottomHeight");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setCompletionThreshold(int value) {
	Map<String, Object> attrs = initCommand("completionThreshold");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setCompletionHintView(String value) {
	Map<String, Object> attrs = initCommand("completionHintView");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetCompletionHint() {
	Map<String, Object> attrs = initCommand("completionHint");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getCompletionHint() {
	Map<String, Object> attrs = initCommand("completionHint");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setCompletionHint(String value) {
	Map<String, Object> attrs = initCommand("completionHint");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setEntries(String value) {
	Map<String, Object> attrs = initCommand("entries");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetDropDownHeight() {
	Map<String, Object> attrs = initCommand("dropDownHeight");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getDropDownHeight() {
	Map<String, Object> attrs = initCommand("dropDownHeight");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setDropDownHeight(String value) {
	Map<String, Object> attrs = initCommand("dropDownHeight");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetDropDownHorizontalOffset() {
	Map<String, Object> attrs = initCommand("dropDownHorizontalOffset");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getDropDownHorizontalOffset() {
	Map<String, Object> attrs = initCommand("dropDownHorizontalOffset");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setDropDownHorizontalOffset(String value) {
	Map<String, Object> attrs = initCommand("dropDownHorizontalOffset");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetDropDownVerticalOffset() {
	Map<String, Object> attrs = initCommand("dropDownVerticalOffset");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getDropDownVerticalOffset() {
	Map<String, Object> attrs = initCommand("dropDownVerticalOffset");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setDropDownVerticalOffset(String value) {
	Map<String, Object> attrs = initCommand("dropDownVerticalOffset");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetDropDownWidth() {
	Map<String, Object> attrs = initCommand("dropDownWidth");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getDropDownWidth() {
	Map<String, Object> attrs = initCommand("dropDownWidth");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setDropDownWidth(String value) {
	Map<String, Object> attrs = initCommand("dropDownWidth");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setDropDownSelector(String value) {
	Map<String, Object> attrs = initCommand("dropDownSelector");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetDropDownAnchor() {
	Map<String, Object> attrs = initCommand("dropDownAnchor");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getDropDownAnchor() {
	Map<String, Object> attrs = initCommand("dropDownAnchor");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setDropDownAnchor(String value) {
	Map<String, Object> attrs = initCommand("dropDownAnchor");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setListitem(String value) {
	Map<String, Object> attrs = initCommand("listitem");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setOnDismiss(String value) {
	Map<String, Object> attrs = initCommand("onDismiss");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder showDropDown(boolean value) {
	Map<String, Object> attrs = initCommand("showDropDown");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetText() {
	Map<String, Object> attrs = initCommand("text");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getText() {
	Map<String, Object> attrs = initCommand("text");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setText(String value) {
	Map<String, Object> attrs = initCommand("text");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetGravity() {
	Map<String, Object> attrs = initCommand("gravity");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getGravity() {
	Map<String, Object> attrs = initCommand("gravity");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setGravity(String value) {
	Map<String, Object> attrs = initCommand("gravity");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setAutoText(boolean value) {
	Map<String, Object> attrs = initCommand("autoText");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setCapitalize(String value) {
	Map<String, Object> attrs = initCommand("capitalize");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetCursorVisible() {
	Map<String, Object> attrs = initCommand("cursorVisible");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object isCursorVisible() {
	Map<String, Object> attrs = initCommand("cursorVisible");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setCursorVisible(boolean value) {
	Map<String, Object> attrs = initCommand("cursorVisible");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetTextSize() {
	Map<String, Object> attrs = initCommand("textSize");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getTextSize() {
	Map<String, Object> attrs = initCommand("textSize");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setTextSize(String value) {
	Map<String, Object> attrs = initCommand("textSize");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setNumeric(String value) {
	Map<String, Object> attrs = initCommand("numeric");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setDigits(String value) {
	Map<String, Object> attrs = initCommand("digits");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setPassword(boolean value) {
	Map<String, Object> attrs = initCommand("password");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setPhoneNumber(boolean value) {
	Map<String, Object> attrs = initCommand("phoneNumber");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetInputType() {
	Map<String, Object> attrs = initCommand("inputType");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getInputType() {
	Map<String, Object> attrs = initCommand("inputType");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setInputType(String value) {
	Map<String, Object> attrs = initCommand("inputType");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetImeOptions() {
	Map<String, Object> attrs = initCommand("imeOptions");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getImeOptions() {
	Map<String, Object> attrs = initCommand("imeOptions");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setImeOptions(String value) {
	Map<String, Object> attrs = initCommand("imeOptions");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder selectAllOnFocus(boolean value) {
	Map<String, Object> attrs = initCommand("selectAllOnFocus");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder selectAll(boolean value) {
	Map<String, Object> attrs = initCommand("selectAll");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setScrollHorizontally(boolean value) {
	Map<String, Object> attrs = initCommand("scrollHorizontally");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setSingleLine(boolean value) {
	Map<String, Object> attrs = initCommand("singleLine");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setOnEditorAction(String value) {
	Map<String, Object> attrs = initCommand("onEditorAction");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setTextColorHint(String value) {
	Map<String, Object> attrs = initCommand("textColorHint");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setIosInputAccessoryViewDoneButton(String value) {
	Map<String, Object> attrs = initCommand("iosInputAccessoryViewDoneButton");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setOnFocusChange(String value) {
	Map<String, Object> attrs = initCommand("onFocusChange");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetTextColor() {
	Map<String, Object> attrs = initCommand("textColor");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getTextColor() {
	Map<String, Object> attrs = initCommand("textColor");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setTextColor(String value) {
	Map<String, Object> attrs = initCommand("textColor");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetOnTextChange() {
	Map<String, Object> attrs = initCommand("onTextChange");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getOnTextChange() {
	Map<String, Object> attrs = initCommand("onTextChange");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setOnTextChange(String value) {
	Map<String, Object> attrs = initCommand("onTextChange");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setOnbeforeTextChange(String value) {
	Map<String, Object> attrs = initCommand("onbeforeTextChange");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setOnafterTextChange(String value) {
	Map<String, Object> attrs = initCommand("onafterTextChange");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setIosBorderStyle(String value) {
	Map<String, Object> attrs = initCommand("iosBorderStyle");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setHintTextFormat(String value) {
	Map<String, Object> attrs = initCommand("hintTextFormat");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setTextAllCaps(boolean value) {
	Map<String, Object> attrs = initCommand("textAllCaps");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setIosInputView(String value) {
	Map<String, Object> attrs = initCommand("iosInputView");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setSetFocus(boolean value) {
	Map<String, Object> attrs = initCommand("setFocus");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
}
public class AutoCompleteTextViewBean extends com.ashera.layout.ViewImpl.ViewBean{
		public AutoCompleteTextViewBean() {
			super(AutoCompleteTextViewImpl.this);
		}
public Object getIosText() {
	return getBuilder().reset().tryGetIosText().execute(false).getIosText(); 
}
public void setIosText(String value) {
	getBuilder().reset().setIosText(value).execute(true);
}

public Object getIosPlaceholder() {
	return getBuilder().reset().tryGetIosPlaceholder().execute(false).getIosPlaceholder(); 
}
public void setIosPlaceholder(String value) {
	getBuilder().reset().setIosPlaceholder(value).execute(true);
}

public Object getHint() {
	return getBuilder().reset().tryGetHint().execute(false).getHint();
}
public void setHint(String value) {
	getBuilder().reset().setHint(value).execute(true); 
}

public Object getIosTextColor() {
	return getBuilder().reset().tryGetIosTextColor().execute(false).getIosTextColor(); 
}
public void setIosTextColor(String value) {
	getBuilder().reset().setIosTextColor(value).execute(true);
}

public Object isIosAdjustsFontSizeToFitWidth() {
	return getBuilder().reset().tryGetIosAdjustsFontSizeToFitWidth().execute(false).isIosAdjustsFontSizeToFitWidth(); 
}
public void setIosAdjustsFontSizeToFitWidth(boolean value) {
	getBuilder().reset().setIosAdjustsFontSizeToFitWidth(value).execute(true);
}

public Object getIosMinimumFontSize() {
	return getBuilder().reset().tryGetIosMinimumFontSize().execute(false).getIosMinimumFontSize(); 
}
public void setIosMinimumFontSize(float value) {
	getBuilder().reset().setIosMinimumFontSize(value).execute(true);
}

public Object isIosIsEditing() {
	return getBuilder().reset().tryGetIosIsEditing().execute(false).isIosIsEditing(); 
}
public Object isIosClearsOnBeginEditing() {
	return getBuilder().reset().tryGetIosClearsOnBeginEditing().execute(false).isIosClearsOnBeginEditing(); 
}
public void setIosClearsOnBeginEditing(boolean value) {
	getBuilder().reset().setIosClearsOnBeginEditing(value).execute(true);
}

public Object isIosClearsOnInsertion() {
	return getBuilder().reset().tryGetIosClearsOnInsertion().execute(false).isIosClearsOnInsertion(); 
}
public void setIosClearsOnInsertion(boolean value) {
	getBuilder().reset().setIosClearsOnInsertion(value).execute(true);
}

public Object isIosAllowsEditingTextAttributes() {
	return getBuilder().reset().tryGetIosAllowsEditingTextAttributes().execute(false).isIosAllowsEditingTextAttributes(); 
}
public void setIosAllowsEditingTextAttributes(boolean value) {
	getBuilder().reset().setIosAllowsEditingTextAttributes(value).execute(true);
}

public Object getIosBackground() {
	return getBuilder().reset().tryGetIosBackground().execute(false).getIosBackground(); 
}
public void setIosBackground(String value) {
	getBuilder().reset().setIosBackground(value).execute(true);
}

public Object getIosDisabledBackground() {
	return getBuilder().reset().tryGetIosDisabledBackground().execute(false).getIosDisabledBackground(); 
}
public void setIosDisabledBackground(String value) {
	getBuilder().reset().setIosDisabledBackground(value).execute(true);
}

public void setPadding(String value) {
	getBuilder().reset().setPadding(value).execute(true);
}

public Object getPaddingBottom() {
	return getBuilder().reset().tryGetPaddingBottom().execute(false).getPaddingBottom(); 
}
public void setPaddingBottom(String value) {
	getBuilder().reset().setPaddingBottom(value).execute(true);
}

public Object getPaddingRight() {
	return getBuilder().reset().tryGetPaddingRight().execute(false).getPaddingRight(); 
}
public void setPaddingRight(String value) {
	getBuilder().reset().setPaddingRight(value).execute(true);
}

public Object getPaddingLeft() {
	return getBuilder().reset().tryGetPaddingLeft().execute(false).getPaddingLeft(); 
}
public void setPaddingLeft(String value) {
	getBuilder().reset().setPaddingLeft(value).execute(true);
}

public Object getPaddingStart() {
	return getBuilder().reset().tryGetPaddingStart().execute(false).getPaddingStart(); 
}
public void setPaddingStart(String value) {
	getBuilder().reset().setPaddingStart(value).execute(true);
}

public Object getPaddingEnd() {
	return getBuilder().reset().tryGetPaddingEnd().execute(false).getPaddingEnd(); 
}
public void setPaddingEnd(String value) {
	getBuilder().reset().setPaddingEnd(value).execute(true);
}

public Object getPaddingTop() {
	return getBuilder().reset().tryGetPaddingTop().execute(false).getPaddingTop(); 
}
public void setPaddingTop(String value) {
	getBuilder().reset().setPaddingTop(value).execute(true);
}

public void setPaddingHorizontal(String value) {
	getBuilder().reset().setPaddingHorizontal(value).execute(true);
}

public void setPaddingVertical(String value) {
	getBuilder().reset().setPaddingVertical(value).execute(true);
}

public void setDrawableStart(String value) {
	getBuilder().reset().setDrawableStart(value).execute(true);
}

public void setDrawableEnd(String value) {
	getBuilder().reset().setDrawableEnd(value).execute(true);
}

public void setDrawableTop(String value) {
	getBuilder().reset().setDrawableTop(value).execute(true);
}

public void setDrawableBottom(String value) {
	getBuilder().reset().setDrawableBottom(value).execute(true);
}

public Object getDrawablePadding() {
	return getBuilder().reset().tryGetDrawablePadding().execute(false).getDrawablePadding(); 
}
public void setDrawablePadding(String value) {
	getBuilder().reset().setDrawablePadding(value).execute(true);
}

public void setDrawableTint(String value) {
	getBuilder().reset().setDrawableTint(value).execute(true);
}

public void setDrawableTintMode(String value) {
	getBuilder().reset().setDrawableTintMode(value).execute(true);
}

public void setDrawableIconSize(String value) {
	getBuilder().reset().setDrawableIconSize(value).execute(true);
}

public Object getMinLines() {
	return getBuilder().reset().tryGetMinLines().execute(false).getMinLines(); 
}
public void setMinLines(int value) {
	getBuilder().reset().setMinLines(value).execute(true);
}

public void setLines(int value) {
	getBuilder().reset().setLines(value).execute(true);
}

public Object getMaxLines() {
	return getBuilder().reset().tryGetMaxLines().execute(false).getMaxLines(); 
}
public void setMaxLines(int value) {
	getBuilder().reset().setMaxLines(value).execute(true);
}

public Object getMinWidth() {
	return getBuilder().reset().tryGetMinWidth().execute(false).getMinWidth(); 
}
public void setMinWidth(String value) {
	getBuilder().reset().setMinWidth(value).execute(true);
}

public Object getMinHeight() {
	return getBuilder().reset().tryGetMinHeight().execute(false).getMinHeight(); 
}
public void setMinHeight(String value) {
	getBuilder().reset().setMinHeight(value).execute(true);
}

public Object getMaxWidth() {
	return getBuilder().reset().tryGetMaxWidth().execute(false).getMaxWidth(); 
}
public void setMaxWidth(String value) {
	getBuilder().reset().setMaxWidth(value).execute(true);
}

public Object getMaxHeight() {
	return getBuilder().reset().tryGetMaxHeight().execute(false).getMaxHeight(); 
}
public void setMaxHeight(String value) {
	getBuilder().reset().setMaxHeight(value).execute(true);
}

public Object getHeight() {
	return getBuilder().reset().tryGetHeight().execute(false).getHeight(); 
}
public void setHeight(String value) {
	getBuilder().reset().setHeight(value).execute(true);
}

public Object getWidth() {
	return getBuilder().reset().tryGetWidth().execute(false).getWidth(); 
}
public void setWidth(String value) {
	getBuilder().reset().setWidth(value).execute(true);
}

public Object getMaxEms() {
	return getBuilder().reset().tryGetMaxEms().execute(false).getMaxEms(); 
}
public void setMaxEms(int value) {
	getBuilder().reset().setMaxEms(value).execute(true);
}

public Object getMinEms() {
	return getBuilder().reset().tryGetMinEms().execute(false).getMinEms(); 
}
public void setMinEms(int value) {
	getBuilder().reset().setMinEms(value).execute(true);
}

public void setEms(int value) {
	getBuilder().reset().setEms(value).execute(true);
}

public void setEditable(boolean value) {
	getBuilder().reset().setEditable(value).execute(true);
}

public void setMaxLength(int value) {
	getBuilder().reset().setMaxLength(value).execute(true);
}

public void setTypeface(String value) {
	getBuilder().reset().setTypeface(value).execute(true);
}

public void setTextStyle(String value) {
	getBuilder().reset().setTextStyle(value).execute(true);
}

public void setFontFamily(String value) {
	getBuilder().reset().setFontFamily(value).execute(true);
}

public void setEnabled(boolean value) {
	getBuilder().reset().setEnabled(value).execute(true);
}

public Object getTextColorHighlight() {
	return getBuilder().reset().tryGetTextColorHighlight().execute(false).getTextColorHighlight(); 
}
public void setTextColorHighlight(String value) {
	getBuilder().reset().setTextColorHighlight(value).execute(true);
}

public Object getFirstBaselineToTopHeight() {
	return getBuilder().reset().tryGetFirstBaselineToTopHeight().execute(false).getFirstBaselineToTopHeight(); 
}
public void setFirstBaselineToTopHeight(String value) {
	getBuilder().reset().setFirstBaselineToTopHeight(value).execute(true);
}

public Object getLastBaselineToBottomHeight() {
	return getBuilder().reset().tryGetLastBaselineToBottomHeight().execute(false).getLastBaselineToBottomHeight(); 
}
public void setLastBaselineToBottomHeight(String value) {
	getBuilder().reset().setLastBaselineToBottomHeight(value).execute(true);
}

public void setCompletionThreshold(int value) {
	getBuilder().reset().setCompletionThreshold(value).execute(true);
}

public void setCompletionHintView(String value) {
	getBuilder().reset().setCompletionHintView(value).execute(true);
}

public Object getCompletionHint() {
	return getBuilder().reset().tryGetCompletionHint().execute(false).getCompletionHint(); 
}
public void setCompletionHint(String value) {
	getBuilder().reset().setCompletionHint(value).execute(true);
}

public void setEntries(String value) {
	getBuilder().reset().setEntries(value).execute(true);
}

public Object getDropDownHeight() {
	return getBuilder().reset().tryGetDropDownHeight().execute(false).getDropDownHeight(); 
}
public void setDropDownHeight(String value) {
	getBuilder().reset().setDropDownHeight(value).execute(true);
}

public Object getDropDownHorizontalOffset() {
	return getBuilder().reset().tryGetDropDownHorizontalOffset().execute(false).getDropDownHorizontalOffset(); 
}
public void setDropDownHorizontalOffset(String value) {
	getBuilder().reset().setDropDownHorizontalOffset(value).execute(true);
}

public Object getDropDownVerticalOffset() {
	return getBuilder().reset().tryGetDropDownVerticalOffset().execute(false).getDropDownVerticalOffset(); 
}
public void setDropDownVerticalOffset(String value) {
	getBuilder().reset().setDropDownVerticalOffset(value).execute(true);
}

public Object getDropDownWidth() {
	return getBuilder().reset().tryGetDropDownWidth().execute(false).getDropDownWidth(); 
}
public void setDropDownWidth(String value) {
	getBuilder().reset().setDropDownWidth(value).execute(true);
}

public void setDropDownSelector(String value) {
	getBuilder().reset().setDropDownSelector(value).execute(true);
}

public Object getDropDownAnchor() {
	return getBuilder().reset().tryGetDropDownAnchor().execute(false).getDropDownAnchor(); 
}
public void setDropDownAnchor(String value) {
	getBuilder().reset().setDropDownAnchor(value).execute(true);
}

public void setListitem(String value) {
	getBuilder().reset().setListitem(value).execute(true);
}

public void setOnDismiss(String value) {
	getBuilder().reset().setOnDismiss(value).execute(true);
}

public void showDropDown(boolean value) {
	getBuilder().reset().showDropDown(value).execute(true);
}

public Object getText() {
	return getBuilder().reset().tryGetText().execute(false).getText(); 
}
public void setText(String value) {
	getBuilder().reset().setText(value).execute(true);
}

public Object getGravity() {
	return getBuilder().reset().tryGetGravity().execute(false).getGravity(); 
}
public void setGravity(String value) {
	getBuilder().reset().setGravity(value).execute(true);
}

public void setAutoText(boolean value) {
	getBuilder().reset().setAutoText(value).execute(true);
}

public void setCapitalize(String value) {
	getBuilder().reset().setCapitalize(value).execute(true);
}

public Object isCursorVisible() {
	return getBuilder().reset().tryGetCursorVisible().execute(false).isCursorVisible(); 
}
public void setCursorVisible(boolean value) {
	getBuilder().reset().setCursorVisible(value).execute(true);
}

public Object getTextSize() {
	return getBuilder().reset().tryGetTextSize().execute(false).getTextSize(); 
}
public void setTextSize(String value) {
	getBuilder().reset().setTextSize(value).execute(true);
}

public void setNumeric(String value) {
	getBuilder().reset().setNumeric(value).execute(true);
}

public void setDigits(String value) {
	getBuilder().reset().setDigits(value).execute(true);
}

public void setPassword(boolean value) {
	getBuilder().reset().setPassword(value).execute(true);
}

public void setPhoneNumber(boolean value) {
	getBuilder().reset().setPhoneNumber(value).execute(true);
}

public Object getInputType() {
	return getBuilder().reset().tryGetInputType().execute(false).getInputType(); 
}
public void setInputType(String value) {
	getBuilder().reset().setInputType(value).execute(true);
}

public Object getImeOptions() {
	return getBuilder().reset().tryGetImeOptions().execute(false).getImeOptions(); 
}
public void setImeOptions(String value) {
	getBuilder().reset().setImeOptions(value).execute(true);
}

public void selectAllOnFocus(boolean value) {
	getBuilder().reset().selectAllOnFocus(value).execute(true);
}

public void selectAll(boolean value) {
	getBuilder().reset().selectAll(value).execute(true);
}

public void setScrollHorizontally(boolean value) {
	getBuilder().reset().setScrollHorizontally(value).execute(true);
}

public void setSingleLine(boolean value) {
	getBuilder().reset().setSingleLine(value).execute(true);
}

public void setOnEditorAction(String value) {
	getBuilder().reset().setOnEditorAction(value).execute(true);
}

public void setTextColorHint(String value) {
	getBuilder().reset().setTextColorHint(value).execute(true);
}

public void setIosInputAccessoryViewDoneButton(String value) {
	getBuilder().reset().setIosInputAccessoryViewDoneButton(value).execute(true);
}

public void setOnFocusChange(String value) {
	getBuilder().reset().setOnFocusChange(value).execute(true);
}

public Object getTextColor() {
	return getBuilder().reset().tryGetTextColor().execute(false).getTextColor(); 
}
public void setTextColor(String value) {
	getBuilder().reset().setTextColor(value).execute(true);
}

public Object getOnTextChange() {
	return getBuilder().reset().tryGetOnTextChange().execute(false).getOnTextChange(); 
}
public void setOnTextChange(String value) {
	getBuilder().reset().setOnTextChange(value).execute(true);
}

public void setOnbeforeTextChange(String value) {
	getBuilder().reset().setOnbeforeTextChange(value).execute(true);
}

public void setOnafterTextChange(String value) {
	getBuilder().reset().setOnafterTextChange(value).execute(true);
}

public void setIosBorderStyle(String value) {
	getBuilder().reset().setIosBorderStyle(value).execute(true);
}

public void setHintTextFormat(String value) {
	getBuilder().reset().setHintTextFormat(value).execute(true);
}

public void setTextAllCaps(boolean value) {
	getBuilder().reset().setTextAllCaps(value).execute(true);
}

public void setIosInputView(String value) {
	getBuilder().reset().setIosInputView(value).execute(true);
}

public void setSetFocus(boolean value) {
	getBuilder().reset().setSetFocus(value).execute(true);
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
		uiView.commandRegex  = ASAutoCompleteTextViewImpl_FOREGROUND_REGEX; 
		uiView.backgroundColor = [UIColor clearColor];
		return uiView;
	]-*/;
	 public native Object createWrapperViewHolderNative(int viewType)/*-[
	 	if (viewType == 1) {
			ASUIView* uiView = [ASUIView new];
			uiView.widget = self;
			uiView.commandRegex  = ASAutoCompleteTextViewImpl_VIEW_HOLDER_REGEX; 
			uiView.backgroundColor = [UIColor clearColor];
			
			return uiView;
		}
		
		if (viewType == 2 || viewType == 3) {
			ASUIView* uiView = [ASUIView new];
			uiView.widget = self;
			uiView.backgroundColor = [UIColor clearColor];
			uiView.commandRegex  = ASAutoCompleteTextViewImpl_VIEW_HOLDER_REGEX; 

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

	
	private void initPopUp() {
		nativeAddTextFieldDidChangeForPopup();
	}

	private native void nativeAddTextFieldDidChangeForPopup() /*-[
		[((ASUITextField*)self.uiView) addTarget:self action:@selector(textFieldDidChangeForPopup:) forControlEvents:UIControlEventEditingChanged];
	]-*/;

	/*-[
	
	-(void)textFieldDidChangeForPopup:(UITextField *)textView{
		[self showHidePopup];
	}
	]-*/;


	private void movePopUpContainerToTop() {
		
	}
	private void showHidePopup() {
		beforetextChange("", 0, 0);
		afterTextChanged();
	}

	public native int nativeMeasureWidth(Object uiView)/*-[
		CGSize maximumLabelSize = CGSizeMake(CGFLOAT_MAX,CGFLOAT_MAX);
		CGSize requiredSize = [((UIView*)uiView) sizeThatFits:maximumLabelSize];
		return ceil(requiredSize.width);
	]-*/;
	
	public native int nativeMeasureHeight(Object uiView, int width)/*-[
	    CGSize maximumLabelSize = CGSizeMake(width,CGFLOAT_MAX);
	    CGSize requiredSize = [((UIView*)uiView) sizeThatFits:maximumLabelSize];
	    return ceil(requiredSize.height);
	]-*/;
	
	private boolean islinearlayout() {
		return false;
	}


	public boolean isFocused() {
		return isFirstResponder();
	}
	
	
}
