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
import r.android.widget.AutoCompleteTextView;
@SuppressLint("NewApi")
public class AutoCompleteTextViewImpl extends BaseHasWidgets implements com.ashera.validations.FormElement{
	//start - body
	public final static String LOCAL_NAME = "AutoCompleteTextView"; 
	public final static String GROUP_NAME = "AutoCompleteTextView";

	protected org.teavm.jso.dom.html.HTMLElement hTMLElement;
	protected r.android.widget.AutoCompleteTextView measurableView;	
	
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
		final static class DrawableTintMode extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("add",  0x1);
				mapping.put("multiply",  0x2);
				mapping.put("screen",  0x3);
				mapping.put("src_atop",  0x4);
				mapping.put("src_in",  0x5);
				mapping.put("src_over",  0x6);
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
		final static class InputType extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("date",  0x1);
				mapping.put("datetime",  0x2);
				mapping.put("none",  0x3);
				mapping.put("number",  0x4);
				mapping.put("numberDecimal",  0x5);
				mapping.put("numberPassword",  0x6);
				mapping.put("numberSigned",  0x7);
				mapping.put("phone",  0x8);
				mapping.put("text",  0x9);
				mapping.put("textAutoComplete",  0x10);
				mapping.put("textAutoCorrect",  0x11);
				mapping.put("textCapCharacters",  0x12);
				mapping.put("textCapSentences",  0x13);
				mapping.put("textCapWords",  0x14);
				mapping.put("textEmailAddress",  0x15);
				mapping.put("textEmailSubject",  0x16);
				mapping.put("textFilter",  0x17);
				mapping.put("textImeMultiLine",  0x18);
				mapping.put("textLongMessage",  0x19);
				mapping.put("textMultiLine",  0x20);
				mapping.put("textNoSuggestions",  0x21);
				mapping.put("textPassword",  0x22);
				mapping.put("textPersonName",  0x23);
				mapping.put("textPhonetic",  0x24);
				mapping.put("textPostalAddress",  0x25);
				mapping.put("textShortMessage",  0x26);
				mapping.put("textUri",  0x27);
				mapping.put("textVisiblePassword",  0x28);
				mapping.put("textWebEditText",  0x29);
				mapping.put("textWebEmailAddress",  0x30);
				mapping.put("textWebPassword",  0x31);
				mapping.put("time",  0x32);
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


		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("text").withType("resourcestring").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("gravity").withType("gravity").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textSize").withType("dimensionsp").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
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
		ConverterFactory.register("AutoCompleteTextView.font", new Font());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("typeface").withType("AutoCompleteTextView.font").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		ConverterFactory.register("AutoCompleteTextView.textStyle", new TextStyle());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textStyle").withType("AutoCompleteTextView.textStyle").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("fontFamily").withType("font").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableLeft").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableRight").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableStart").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableEnd").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTop").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableBottom").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawablePadding").withType("dimension").withOrder(1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxLength").withType("int").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("enabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("editable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("firstBaselineToTopHeight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lastBaselineToBottomHeight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("padding").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingTop").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingBottom").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingLeft").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingRight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingStart").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingEnd").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingHorizontal").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingVertical").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTint").withType("colorstate"));
		ConverterFactory.register("AutoCompleteTextView.drawableTintMode", new DrawableTintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTintMode").withType("AutoCompleteTextView.drawableTintMode"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("letterSpacing").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("shadowDx").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("shadowDy").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("shadowColor").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("shadowRadius").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lineHeight").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lineSpacingExtra").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lineSpacingMultiplier").withType("float").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textColorHighlight").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("password").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textAllCaps").withType("boolean").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("selectAllOnFocus").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("selectAll").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textColorHint").withType("colorstate"));
		ConverterFactory.register("AutoCompleteTextView.numeric", new Numeric());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("numeric").withType("AutoCompleteTextView.numeric"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("digits").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hint").withType("resourcestring").withOrder(900).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("cursorVisible").withType("boolean"));
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
		ConverterFactory.register("AutoCompleteTextView.capitalize", new Capitalize());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("capitalize").withType("AutoCompleteTextView.capitalize"));
		ConverterFactory.register("AutoCompleteTextView.inputType", new InputType());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("inputType").withType("AutoCompleteTextView.inputType"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onFocusChange").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onTextChange").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onbeforeTextChange").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onafterTextChange").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hintTextFormat").withType("resourcestring").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("setFocus").withType("boolean"));
	WidgetFactory.registerConstructorAttribute(localName, new WidgetAttribute.Builder().withName("webEnableTintFilter").withType("boolean"));
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

		
	public class AutoCompleteTextViewExt extends r.android.widget.AutoCompleteTextView implements ILifeCycleDecorator{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();

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
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			nativeMakeFrameForChildWidget(l, t, r, b);
			replayBufferedEvents();
	        ViewImpl.redrawDrawables(AutoCompleteTextViewImpl.this);
			
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
        	ViewImpl.drawableStateChanged(AutoCompleteTextViewImpl.this);
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
			getFragment().remeasure();
		}
    	
        @Override
		public void removeFromParent() {
        	AutoCompleteTextViewImpl.this.getParent().remove(AutoCompleteTextViewImpl.this);
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
			AutoCompleteTextViewImpl.this.setAttribute(name, value, true);
		}
        @Override
        public void setVisibility(int visibility) {
            super.setVisibility(visibility);
            ((HTMLElement)asNativeWidget()).getStyle().setProperty("display", visibility != View.VISIBLE ? "none" : "block");
            
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
        	return AutoCompleteTextViewImpl.this.nativeMeasureWidth(uiView);
        }
        
        @Override
        public int nativeMeasureHeight(java.lang.Object uiView, int width) {
        	return AutoCompleteTextViewImpl.this.nativeMeasureHeight(uiView, width);
        }
        @Override
        public int computeSize(float width) {
        	return nativeMeasureHeight(hTMLElement, (int) width);
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
		nativeCreate(params);	
		ViewImpl.registerCommandConveter(this);
	}

	@Override
	@SuppressLint("NewApi")
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		Object nativeWidget = asNativeWidget();
		ViewGroupModelImpl.setAttribute(this,  key, strValue, objValue, decorator);
		
		switch (key.getAttributeName()) {
			case "text": {
				


		setMyText(objValue);



			}
			break;
			case "textColor": {
				


		setTextColor(objValue);



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
			case "drawableLeft": {
				


		 setDrawableLeft(objValue); 



			}
			break;
			case "drawableRight": {
				


		 setDrawableRight(objValue); 



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
			case "drawablePadding": {
				


		 setDrawablePadding(objValue); 



			}
			break;
			case "maxLength": {
				


		 setMaxLength(objValue); 



			}
			break;
			case "enabled": {
				


		 setEnabled(objValue);



			}
			break;
			case "editable": {
				


		 setEnabled(objValue);



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
			case "drawableTint": {
				


		setDrawableTint(objValue);



			}
			break;
			case "drawableTintMode": {
				


		setDrawableTintMode(strValue);



			}
			break;
			case "letterSpacing": {
				


		 setLetterSpacing((Float) objValue, strValue);



			}
			break;
			case "shadowDx": {
				


		 setShadowDx((Float) objValue, strValue);



			}
			break;
			case "shadowDy": {
				


		 setShadowDy((Float) objValue, strValue);



			}
			break;
			case "shadowColor": {
				


		 setShadowColor(objValue, strValue);



			}
			break;
			case "shadowRadius": {
				


		 setShadowRadius((Float) objValue, strValue);



			}
			break;
			case "lineHeight": {
				


		 setMyLineHeight(objValue);



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
			case "textColorHighlight": {
				


		 setTextColorHighlight(objValue);



			}
			break;
			case "password": {
				


		setPasswordType(objValue);



			}
			break;
			case "textAllCaps": {
				


		setTextAllCaps(objValue);



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
			case "textColorHint": {
				


		 setHintColor(objValue);



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
			case "hint": {
				


		 setHint(objValue); 



			}
			break;
			case "cursorVisible": {
				


		setCursorVisible(objValue);



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
			case "capitalize": {
				


		setCapitalize(strValue, objValue);



			}
			break;
			case "inputType": {
				


		setInputType(strValue, objValue);



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
			case "hintTextFormat": {
				


		setHintTextFormat(objValue);



			}
			break;
			case "setFocus": {
				


		setFocus(objValue);



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
			case "text": {
return getMyText();				}
			case "textColor": {
return getTextColor();				}
			case "gravity": {
return getGravity();				}
			case "textSize": {
return getTextSize();				}
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
			case "drawablePadding": {
return this.getDrawablePadding();				}
			case "firstBaselineToTopHeight": {
return getFirstBaselineToTopHeight();				}
			case "lastBaselineToBottomHeight": {
return getLastBaselineToBottomHeight();				}
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
			case "letterSpacing": {
return getLetterSpacing();				}
			case "shadowDx": {
return getShadowDx();				}
			case "shadowDy": {
return getShadowDy();				}
			case "shadowColor": {
return getShadowColor();				}
			case "shadowRadius": {
return getShadowRadius();				}
			case "lineHeight": {
return getMyLineHeight();				}
			case "lineSpacingExtra": {
return getLineSpacingExtra();				}
			case "lineSpacingMultiplier": {
return getLineSpacingMultiplier();				}
			case "textColorHighlight": {
return getTextColorHighlight();				}
			case "hint": {
return getHint();				}
			case "cursorVisible": {
return getCursorVisible();				}
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
			case "inputType": {
return getInputType();				}
		}
		
		return null;
	}
	
	@Override
	public Object asWidget() {
		return measurableView;
	}

	

	private void nativeCreate(Map<String, Object> params) {
		hTMLElement = org.teavm.jso.dom.html.HTMLDocument.current().createElement("div");
		hTMLElement.getStyle().setProperty("box-sizing", "border-box");
//		hTMLElement.getStyle().setProperty("background-color", "white");
//		hTMLElement.getStyle().setProperty("border", "1px solid black");
		
		input = org.teavm.jso.dom.html.HTMLDocument.current().createElement("input");
		input.setAttribute("type", "text");
		input.getStyle().setProperty("color", "inherit");
		input.getStyle().setProperty("text-align", "inherit");
		input.getStyle().setProperty("border", "none");
		input.getStyle().setProperty("outline", "none");
		input.getStyle().setProperty("resize", "none");
		input.getStyle().setProperty("background-color", "transparent");
		hTMLElement.appendChild(input);
		
		registerForAttributeCommandChain("hint");initPopUp();
		
		if ("true".equals(params.get("webEnableTintFilter"))) {
    		enableTintFilter = true;
    	}
	}
	


	private void setError(Object object) {
		
	}

	@Override
	public String getTextEntered() {
		return getInputValue(input);
	}

	@Override
	public boolean isViewVisible() {
		return measurableView.getVisibility() == View.VISIBLE;
	}

	@Override
	public void focus() {
		hTMLElement.focus();
	}
	


	public int getLineHeightPadding() {
		return 0;
	}

	public int getBorderWidth() {
		return 0;
	}

	public int getBorderPadding() {
		return 0;
	}    
	private HTMLElement input;
	
	
	
	@org.teavm.jso.JSBody(params = { "input" }, script = "return input.value;")
    private static native String getInputValue(org.teavm.jso.dom.html.HTMLElement input);

	@org.teavm.jso.JSBody(params = { "input", "val" }, script = "input.value = val;")
    private static native void setInputValue(org.teavm.jso.dom.html.HTMLElement input, String val);

	private void nativeMakeFrameForChildWidget(int l, int t, int r, int b) {
		com.ashera.model.RectM widgetBounds = measurableView.getWidgetBounds(r - l, b - t, input);
		ViewImpl.updateBounds(input, widgetBounds.x, widgetBounds.y, widgetBounds.width, widgetBounds.height);

		updateDrawableBounds(l, t, r, b);
	}
	
	
	private void setMyText(Object objValue) {
		String str = (String) objValue;
		
		triggerBeforeChange((String) getMyText());
		setInputValue(input, str);
		triggetOnTextChange(str);
		triggerOnAfterChange();
		
	}

	private void triggerBeforeChange(String str) {
		if (this.onbeforeTextChange != null) {
			final TextWatcher textChangedListener = getTextChangeListener(this.onbeforeTextChange);
			textChangedListener.beforeTextChanged(str, 0, 0, str.length());
		}
	}

	private void triggetOnTextChange(String str) {
		if (this.onTextChange != null) {
			final TextWatcher textChangedListener = getTextChangeListener(this.onTextChange);
			textChangedListener.onTextChanged(str, 0, 0, str.length());
		}
	}
	
	
	private Object getMyText() {
		return getInputValue(input);
	}


	@org.teavm.jso.JSBody(params = { "element" }, script = "element.select();")
    private static native int select(org.teavm.jso.dom.html.HTMLElement element);
	private void setSelectAll(Object objValue) {
		select(input);
	}
	
	
	private void setCursorVisible(Object objValue) {
		if ((boolean) objValue) {
			input.getStyle().setProperty("caret-color", "transparent");
		} else {
			input.getStyle().removeProperty("caret-color");
		}
	}
	
	
	private Object getCursorVisible() {
		return "transparent".equals(input.getStyle().getPropertyValue("caret-color"));
	}
	

	private void setMaxLength(Object objValue) {
		input.setAttribute("maxlength", objValue + "");
		
	}
	
	private void setPasswordType(Object objValue) {
		if ((boolean) objValue) {
			input.setAttribute("type", "password");
		} else {
			input.setAttribute("type", "text");
		}
	}
	

	private void drawableStateChangedAdditional() {
	}
	
	//start - enabled
	private void setEnabled(Object objValue) {
		if ((boolean) objValue) {
			hTMLElement.getStyle().removeProperty("disabled");
			input.removeAttribute("disabled");			
		} else {
			hTMLElement.getStyle().setProperty("disabled", "true");
			input.setAttribute("disabled", "true");
		}
	}
	//end - enabled
	
	
	private void setHint(Object objValue) {
		input.setAttribute("placeholder", (String) objValue);		
	}
	
	
	private Object getHint() {
		return input.getAttribute("placeholder");
	}
	
	private Object textColorHint;
	private void setHintColor(Object objValue) {
		textColorHint = objValue;
		if (input.getClassName() == null) {
			input.setClassName("");
		}
		
		if (objValue instanceof r.android.content.res.ColorStateList) {
			r.android.content.res.ColorStateList colorStateList = (r.android.content.res.ColorStateList) objValue;
			measurableView.setHintTextColor(colorStateList);
			objValue = measurableView.getCurrentHintTextColor();
		}
		String colorCss = "placeholdercolor_" + ((String) ViewImpl.getColor(objValue)).replaceAll("#", "");
		if (input.getClassName().indexOf("placeholdercolor_") != -1) {
			input.setClassName(input.getClassName().replaceAll("placeholdercolor_([0-9|A-Z])*\\s?", ""));
		}
		if (input.getClassName().indexOf(colorCss) == -1) {
			input.setClassName(colorCss + " " + (input.getClassName() == null ? "" : input.getClassName()));
		}
	}	

	
	private void setTextAllCaps(Object objValue) {
		if ((boolean) objValue) {
			input.getStyle().setProperty("text-transform", "uppercase");
		} else {
			input.getStyle().setProperty("text-transform", "none");
		}
		
	}
	

	
	private void setCapitalize(String strValue, Object objValue) {
		switch (strValue) {
		case "sentences":
		case "words":
			input.getStyle().setProperty("text-transform", "capitalize");
			break;
		case "characters":
			input.getStyle().setProperty("text-transform", "uppercase");
			break;
		case "none":
			input.getStyle().setProperty("text-transform", "none");
			
			break;
		default:
			break;
		}
	}
	
	private Object inputType;
	private void setInputType(String strValue, Object objValue) {
		this.inputType = objValue;
		String inputType= "text";
		String step = null;
		String textTranform = null;
		switch (strValue) {
		case "date":
			inputType = "date";
			break;
		case "datetime":
			inputType = "datetime-local";
			break;
		case "number":
			inputType = "number";
			break;
		case "numberDecimal":
			step = "0.1";
			inputType = "number";
			break;
		case "numberPassword":
		case "textPassword":
		case "textVisiblePassword":
		case "textWebPassword":
			inputType = "password";
			break;
		case "phone":
			inputType = "tel";
			break;
		case "textCapCharacters":
			textTranform = "uppercase";
			break;
		case "textCapSentences":
		case "textCapWords":
			textTranform = "capitalize";
			break;
		case "textEmailAddress":
		case "textEmailSubject":
		case "textWebEmailAddress":
			inputType = "email";
			break;
		case "textUri":	
			inputType = "url";
			break;
		case "time":
			inputType = "time";
			break;
		default:
			break;
		}
		
		if (textTranform != null) {
			input.getStyle().setProperty("text-transform", textTranform);
		}
		
		if (step != null) {
			input.setAttribute("step", step);
		}
		
		input.setAttribute("type", inputType);
	}
	
	
	private Object getInputType() {
		return inputType;
	}
	
	
	private void setSelectAllOnFocus(Object objValue) {
		if (objValue != null && (boolean) objValue) {
			ViewImpl.setOnListener(this, input, (e) -> {
				select(input);
			}, "focusin", "focusin");
		} else {
			ViewImpl.removeListener(this, input, "focusin", "focusin");
		}
	}
	
	private Object onAfterTextChange;
	private void setOnAfterTextChange(Object objValue) {
		this.onAfterTextChange = objValue;
		
		ViewImpl.setOnListener(this, input, (e) -> {
			triggerOnAfterChange();
		}, "input", "input");
	}

	private void triggerOnAfterChange() {
		if (this.onAfterTextChange != null) {
			final TextWatcher textChangedListener = getTextChangeListener(this.onAfterTextChange);
			textChangedListener.afterTextChanged(null);
		}
	}
	private Object onbeforeTextChange;
	private void setBeforeOnTextChange(Object objValue) {
		this.onbeforeTextChange =  objValue;
		
		ViewImpl.setOnListener(this, input, (e) -> {
			String key = getKey(e);
			if (isCtrlKeyPressed(e)) {
				return;
			}
			String value = getNewInputValueOnKeyDown(e);
			int selectionStart = getSelectionStart(e);
			int selectionEnd = getSelectionEnd(e);
			int selectionLength = selectionEnd - selectionStart;
			String oldValue = getEventValue(e);
			
			if (value.equals(oldValue)) {
				return;
			}
			final TextWatcher textChangedListener = getTextChangeListener(objValue);
			int after = 0;
			if (key.equals("Backspace")) {
				if (selectionLength == 0 && selectionStart > 0) {
					selectionStart = selectionStart - 1;
					selectionLength = selectionLength + 1;
				}
			} else if (key.equals("Delete")) {
				if (selectionLength == 0) {
					selectionLength = selectionLength + 1;
				}
			} else {
				after = 1;
			}

			textChangedListener.beforeTextChanged(oldValue, selectionStart, selectionLength, after);
		}, "keydownBeforeTextChange", "keydown");
		
		ViewImpl.setOnListener(this, input, (e) -> {
			String value = getNewInputValueOnPaste(e);
			String oldValue = getEventValue(e);
			int selectionStart = getSelectionStart(e);
			int selectionEnd = getSelectionEnd(e);
			int selectionLength = selectionEnd - selectionStart;
			if (value.equals(oldValue)) {
				return;
			}
			final TextWatcher textChangedListener = getTextChangeListener(objValue);
			textChangedListener.beforeTextChanged(oldValue, selectionStart, selectionLength, getClipboardData(e).length());
		}, "pasteBeforeTextChange", "paste");
		
		ViewImpl.setOnListener(this, input, (e) -> {
			String value = getNewInputValueOnCut(e);
			String oldValue = getEventValue(e);
			int selectionStart = getSelectionStart(e);
			int selectionEnd = getSelectionEnd(e);
			int selectionLength = selectionEnd - selectionStart;
			if (value.equals(oldValue)) {
				return;
			}
			final TextWatcher textChangedListener = getTextChangeListener(objValue);
			textChangedListener.beforeTextChanged(oldValue, selectionStart, selectionLength, getClipboardData(e).length());
		}, "cutBeforeTextChange", "cut");
	}

	@org.teavm.jso.JSBody(params = { "event" }, script = "return event.target.selectionStart;")
    private static native int getSelectionStart(org.teavm.jso.dom.events.Event event);
	@org.teavm.jso.JSBody(params = { "event" }, script = "return event.target.selectionEnd;")
    private static native int getSelectionEnd(org.teavm.jso.dom.events.Event event);
	@org.teavm.jso.JSBody(params = { "event" }, script = "return event.key;")
    private static native String getKey(org.teavm.jso.dom.events.Event event);
	@org.teavm.jso.JSBody(params = { "event" }, script = "return event.target.value;")
    private static native String getEventValue(org.teavm.jso.dom.events.Event event);
	@org.teavm.jso.JSBody(params = { "event" }, script = "return window.getNewInputValueOnKeyDown(event);")
    private static native String getNewInputValueOnKeyDown(org.teavm.jso.dom.events.Event event);
	@org.teavm.jso.JSBody(params = { "event" }, script = "return window.getNewInputValueOnPaste(event);")
    private static native String getNewInputValueOnPaste(org.teavm.jso.dom.events.Event event);
	@org.teavm.jso.JSBody(params = { "event" }, script = "return window.getNewInputValueOnCut(event);")
    private static native String getNewInputValueOnCut(org.teavm.jso.dom.events.Event event);
	@org.teavm.jso.JSBody(params = { "event" }, script = "return (event.clipboardData || window.clipboardData).getData('Text');")
    private static native String getClipboardData(org.teavm.jso.dom.events.Event event);
	@org.teavm.jso.JSBody(params = { "event" }, script = "return event.ctrlKey;")
    private static native boolean isCtrlKeyPressed(org.teavm.jso.dom.events.Event event);
	 
	private Object onTextChange;
	private int start;
	private int before;
	private int count;
	private void setOnTextChange(Object objValue) {
		this.onTextChange = objValue;
		
		ViewImpl.setOnListener(this, input, (e) -> {
			String key = getKey(e);
			if (isCtrlKeyPressed(e)) {
				return;
			}
			int selectionStart = getSelectionStart(e);
			int selectionEnd = getSelectionEnd(e);
			int selectionLength = selectionEnd - selectionStart;
			
			int count = 0;
			if (key.equals("Backspace")) {
				if (selectionLength == 0 && selectionStart > 0) {
					selectionStart = selectionStart - 1;
					selectionLength = selectionLength + 1;
				}
			} else if (key.equals("Delete")) {
				if (selectionLength == 0) {
					selectionLength = selectionLength + 1;
				}
			} else {
				count = 1;
			}
			this.start = selectionStart;
			this.before = selectionLength;
			this.count = count;
		}, "keydown", "keydown");
		
		ViewImpl.setOnListener(this, input, (e) -> {
			int selectionStart = getSelectionStart(e);
			int selectionEnd = getSelectionEnd(e);
			int selectionLength = selectionEnd - selectionStart;
			this.start = selectionStart;
			this.before = selectionLength;
			this.count = getClipboardData(e).length();
		}, "paste", "paste");
		
		ViewImpl.setOnListener(this, input, (e) -> {
			int selectionStart = getSelectionStart(e);
			int selectionEnd = getSelectionEnd(e);
			int selectionLength = selectionEnd - selectionStart;
			
			this.start = selectionStart;
			this.before = selectionLength;
			this.count = getClipboardData(e).length();
		}, "cut", "cut");
		ViewImpl.setOnListener(this, input, (e) -> {
			final TextWatcher textChangedListener = getTextChangeListener(objValue);

			textChangedListener.onTextChanged(getEventValue(e), this.start, this.before, this.count);
		}, "inputTextChange", "input");
	}

	public TextWatcher getTextChangeListener(Object objValue) {
		final TextWatcher textChangedListener; 
		
		if (objValue instanceof String) {
			textChangedListener = new TextChangedListener(this, (String) objValue);
		} else {
			textChangedListener = (TextWatcher) objValue;
		}
		return textChangedListener;
	}

	
	
	private void setOnFocus(Object objValue) {
		View.OnFocusChangeListener onFocusChangeListener;
		
		if (objValue instanceof String) {
			onFocusChangeListener = new OnFocusChangeListener(this, (String) objValue);
		} else {
			onFocusChangeListener = (View.OnFocusChangeListener) objValue; 
		}
		View view = (View) asWidget();
		org.teavm.jso.dom.events.EventListener<?> flistener = (event) -> {view.setFocused(true);onFocusChangeListener.onFocusChange(view, true);};
		ViewImpl.setOnListener(this, input, flistener, "focus", "focus");
		
		org.teavm.jso.dom.events.EventListener<?> blistener = (event) -> {view.setFocused(false);onFocusChangeListener.onFocusChange(view, false);};
		ViewImpl.setOnListener(this, input, blistener, "blur", "blur");
	}
	private void addNumericListener(java.util.regex.Pattern pattern) {
		this.numericPattern = pattern;
		ViewImpl.setOnListener(this, input, (e) -> {
			String str =  getNewInputValueOnKeyDown(e);
			if (!numericPatternMatches(str)) {
				e.preventDefault();
				e.stopPropagation();
			}
		}, "digits", "keypress");
		
		ViewImpl.setOnListener(this, input, (e) -> {
			String str =  getNewInputValueOnPaste(e);
			if (!numericPatternMatches(str)) {
				e.preventDefault();
				e.stopPropagation();
			}
		}, "digits", "paste");
	}
	
	private void removeNumericListener() {
		numericPattern = null;
		ViewImpl.removeListener(this, input, "digits", "keypress");
		ViewImpl.removeListener(this, input, "digits", "paste");
	}
	
    private void addMinMaxListener() {
    	ViewImpl.setOnListener(this, input, (e) -> {
    		if (fragment.isViewLoaded()) {
    			measurableView.requestLayout();
                fragment.remeasure();
                
            }	
    	}, "minmax", "input");
	}
	


	private void setFocus(Object objValue) {
		if ((boolean) objValue) {
			input.focus();
		} else {
			input.blur();
		}
	}
	
	public Object invokeMethodEditText(String methodName, Object... args) {
		if (methodName.equals("nativeWidgetFor") && args[0].equals("onFocusChange")) {
			return input;
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
		IWidget parentWidget = WidgetFactory.createWidget(FrameLayoutImpl.LOCAL_NAME, FrameLayoutImpl.GROUP_NAME, (HasWidgets) fragment.getRootWidget(), false);
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
	public java.lang.Object asNativeWidget() {
		return hTMLElement;
	}
    
    //start - nativeMeasure
    @org.teavm.jso.JSBody(params = { "element" }, script = "return window.nativeMeasureWidth(element);")
    private static native int windowNativeMeasureWidth(org.teavm.jso.dom.html.HTMLElement element);
    
    @org.teavm.jso.JSBody(params = { "element", "width" }, script = "return window.nativeMeasureHeight(element, width);")
    private static native int windowNativeMeasureHeight(org.teavm.jso.dom.html.HTMLElement element, int width);
    
	public int nativeMeasureHeight(Object uiView, int width) {
		return windowNativeMeasureHeight(input, width);
	}

	public int nativeMeasureWidth(Object uiView) {
		return windowNativeMeasureWidth(input);
	}
	
	//end - nativeMeasure
	//start - drawable
	private boolean enableTintFilter;
	private HTMLElement drawableLeft;
	private HTMLElement drawableLeftWrapper;
	private HTMLElement drawableTop;
	private HTMLElement drawableTopWrapper;
    private HTMLElement drawableBottom;
    private HTMLElement drawableBottomWrapper;
    private HTMLElement drawableRight;
    private HTMLElement drawableRightWrapper;
	private void setDrawableBottom(Object objValue) {
		if (drawableBottom == null) {
			this.drawableBottomWrapper = org.teavm.jso.dom.html.HTMLDocument.current().createElement("div");
			this.drawableBottom = org.teavm.jso.dom.html.HTMLDocument.current().createElement("img");
			this.drawableBottom.getStyle().setProperty("width", "inherit");
			this.drawableBottom.getStyle().setProperty("height", "inherit");
			drawableBottomWrapper.appendChild(drawableBottom);
			hTMLElement.appendChild(drawableBottomWrapper);
		}

		if (objValue instanceof r.android.graphics.drawable.Drawable) {
			r.android.graphics.drawable.Drawable drawable = (r.android.graphics.drawable.Drawable) objValue;
			measurableView.setBottomDrawable(drawable);
			updateImageSrc(drawable, drawableBottom);
		}
	}

	private void setDrawableTop(Object objValue) {
		if (drawableTop == null) {
			this.drawableTopWrapper = org.teavm.jso.dom.html.HTMLDocument.current().createElement("div");
			this.drawableTop = org.teavm.jso.dom.html.HTMLDocument.current().createElement("img");
			this.drawableTop.getStyle().setProperty("width", "inherit");
			this.drawableTop.getStyle().setProperty("height", "inherit");
			drawableTopWrapper.appendChild(drawableTop);
			hTMLElement.appendChild(drawableTopWrapper);
		}

		if (objValue instanceof r.android.graphics.drawable.Drawable) {
			r.android.graphics.drawable.Drawable drawable = (r.android.graphics.drawable.Drawable) objValue;
			measurableView.setTopDrawable(drawable);
			updateImageSrc(drawable, drawableTop);
		}
	}

	private void updateImageSrc(r.android.graphics.drawable.Drawable drawable, HTMLElement element) {
		String imageColorOrImage = (String) drawable.getDrawable();
		
		if (imageColorOrImage != null && imageColorOrImage.startsWith("#")) {
			element.getStyle().setProperty("background-color", imageColorOrImage);
			element.removeAttribute("src");
		} else if (imageColorOrImage == null) {
			element.removeAttribute("src");
			element.getStyle().setProperty("background-color", null);
		} else {
			element.setAttribute("src", imageColorOrImage);
			element.getStyle().setProperty("background-color", null);
		}
	}

	private void setDrawableRight(Object objValue) {
		if (ViewImpl.isRTLLayoutDirection(this)) {
			setDrawableLeftInternal(objValue);
		} else {
			setDrawableRightInternal(objValue);
		}
	}

	private void setDrawableRightInternal(Object objValue) {
		if (drawableRight == null) {
			// create bottom
			this.drawableRightWrapper = org.teavm.jso.dom.html.HTMLDocument.current().createElement("div");
			this.drawableRight = org.teavm.jso.dom.html.HTMLDocument.current().createElement("img");
			this.drawableRight.getStyle().setProperty("width", "inherit");
			this.drawableRight.getStyle().setProperty("height", "inherit");
			drawableRightWrapper.appendChild(drawableRight);
			hTMLElement.appendChild(drawableRightWrapper);
		}

		if (objValue instanceof r.android.graphics.drawable.Drawable) {
			r.android.graphics.drawable.Drawable drawable = (r.android.graphics.drawable.Drawable) objValue;
			measurableView.setRightDrawable(drawable);
			updateImageSrc(drawable, drawableRight);
		}
	}

	private void setDrawableLeftInternal(Object objValue) {
		if (drawableLeft == null) {
			// create bottom
			this.drawableLeftWrapper = org.teavm.jso.dom.html.HTMLDocument.current().createElement("div");
			this.drawableLeft = org.teavm.jso.dom.html.HTMLDocument.current().createElement("img");
			this.drawableLeft.getStyle().setProperty("width", "inherit");
			this.drawableLeft.getStyle().setProperty("height", "inherit");
			drawableLeftWrapper.appendChild(drawableLeft);
			hTMLElement.appendChild(drawableLeftWrapper);
		}

		if (objValue instanceof r.android.graphics.drawable.Drawable) {
			r.android.graphics.drawable.Drawable drawable = (r.android.graphics.drawable.Drawable) objValue;
			measurableView.setLeftDrawable(drawable);
			updateImageSrc(drawable, drawableLeft);
		}
	}

	private void setDrawableLeft(Object objValue) {
		if (ViewImpl.isRTLLayoutDirection(this)) {
			setDrawableRightInternal(objValue);
		} else {
			setDrawableLeftInternal(objValue);
		}
	}

	
	private void setDrawablePadding(Object objValue) {
		measurableView.setDrawablePadding((int) objValue);
	}
	
	private Object getDrawablePadding() {
		return measurableView.getDrawablePadding();
	}
	
	private void updateDrawableBounds(int l, int t, int r, int b) {
		if (drawableBottom != null) {
			com.ashera.model.RectM bounds = measurableView.getBottomDrawableBounds(l, t, r - l, b - t);
			ViewImpl.updateBounds(drawableBottomWrapper, bounds.x, bounds.y, bounds.width, bounds.height);
		}	
		
		if (drawableTop != null) {
			com.ashera.model.RectM bounds = measurableView.getTopDrawableBounds(l, t, r - l, b - t);
			ViewImpl.updateBounds(drawableTopWrapper, bounds.x, bounds.y, bounds.width, bounds.height);
		}
		
		if (drawableLeft != null) {
			com.ashera.model.RectM bounds = measurableView.getLeftDrawableBounds(l, t, r - l, b - t);
			ViewImpl.updateBounds(drawableLeftWrapper, bounds.x, bounds.y, bounds.width, bounds.height);
		}
		
		if (drawableRight != null) {
			com.ashera.model.RectM bounds = measurableView.getRightDrawableBounds(l, t, r - l, b - t);
			ViewImpl.updateBounds(drawableRightWrapper, bounds.x, bounds.y, bounds.width, bounds.height);
		}
	}
	
	private void setDrawableTintMode(String strValue) {
		//add,multiply,screen,src_atop,src_in,src_over
		String mixBlendMode = "initial";
		String maskComposite = "none";
		switch (strValue) {
		case "add":
			break;
		case "screen":
			mixBlendMode = "screen";
			break;
		case "multiply":
			mixBlendMode = "multiply";
			break;
		case "src_atop":
			maskComposite = "source-atop";
			break;
		case "src_in":
			maskComposite = "source-in";
			break;
		case "src_over":
			maskComposite = "source-over";
			mixBlendMode = "overlay";
			break;
		default:
			break;
		}
		
		setDrawableTintMode(mixBlendMode, maskComposite, drawableBottom,  drawableTop, drawableLeft, drawableRight);
	}
	
	private void setDrawableTintMode(String blendMode, String maskComposite, HTMLElement... htmlElements) {
		for (HTMLElement htmlElement : htmlElements) {
			if (htmlElement != null) {
				htmlElement.getStyle().setProperty("mix-blend-mode", blendMode);
				htmlElement.getStyle().setProperty("-webkit-mask-composite", maskComposite);
			}
		}
	}
	private r.android.content.res.ColorStateList drawableTint;
	private void setDrawableTint(Object objValue) {
		if (objValue instanceof r.android.content.res.ColorStateList) {
			r.android.content.res.ColorStateList colorStateList = (r.android.content.res.ColorStateList) objValue;
			objValue = colorStateList.getColorForState(measurableView.getDrawableState(), r.android.graphics.Color.RED);
			this.drawableTint = colorStateList;
		}
		
		setDrawableTint(objValue, drawableBottomWrapper, drawableTopWrapper, drawableLeftWrapper, drawableRightWrapper);
	}
	
	private void setDrawableTint(Object objValue, HTMLElement... htmlElements) {
		String filter = null;
		String hexColor = (String) ViewImpl.getColor(objValue);
		if (enableTintFilter) {
			filter = new com.ashera.layout.filter.FilterSolver(hexColor).solve();
		}
		for (HTMLElement htmlElement : htmlElements) {
			if (htmlElement != null) {
				if (filter != null) {
					htmlElement.getStyle().setProperty("filter", filter);
				} else {
					htmlElement.getStyle().setProperty("background-color", hexColor);
				}
			}
		}
	}	
	
	
	
    @Override
	public void drawableStateChanged() {
    	super.drawableStateChanged();
		drawableStateChange(drawableBottom, measurableView.getBottomDrawable(), () -> {
			setDrawableBottom(measurableView.getBottomDrawable());
		});
		drawableStateChange(drawableLeft, measurableView.getLeftDrawable(), () -> {
			setDrawableLeft(measurableView.getLeftDrawable());
		});
		drawableStateChange(drawableRight, measurableView.getRightDrawable(), () -> {
			setDrawableRight(measurableView.getRightDrawable());
		});
		drawableStateChange(drawableTop, measurableView.getTopDrawable(), () -> {
			setDrawableTop(measurableView.getTopDrawable());
		});
		
		if (measurableView.getTextColors() != null) {
			setTextColor(measurableView.getCurrentTextColor());
		}
		
		if (drawableTint != null && drawableTint.isStateful()) {
			setDrawableTint(drawableTint);
		}
		drawableStateChangedAdditional();
	}
    
	private void drawableStateChange(HTMLElement mydrawable, r.android.graphics.drawable.Drawable dr, Runnable run) {
		if (mydrawable != null) {
			final int[] state = measurableView.getDrawableState();
			
			if (dr != null && dr.isStateful() && dr.setState(state)) {
				run.run();
			}
		}
	}
	//end - drawable
	
	//start - paddingcopy
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
	//end - paddingcopy
	//start - textcolor
	private Object getTextColor() {
		return measurableView.getTextColors();
	}
	private void setTextColor(Object objValue) {
		if (objValue instanceof r.android.content.res.ColorStateList) {
			r.android.content.res.ColorStateList colorStateList = (r.android.content.res.ColorStateList) objValue;
			measurableView.setTextColor(colorStateList);
			objValue = measurableView.getCurrentTextColor();
		}
		hTMLElement.getStyle().setProperty("color", (String) ViewImpl.getColor(objValue));
	}
	//end - textcolor

	//start - gravity
	private void setHorizontalAligmentRight() {
		hTMLElement.getStyle().setProperty("text-align", "right");
	}

	private void setHorizontalAligmentCenter() {
		hTMLElement.getStyle().setProperty("text-align", "center");
	}

	private void setHorizontalAligmentLeft() {
		hTMLElement.getStyle().setProperty("text-align", "left");
	}
	//end - gravity

	
	@org.teavm.jso.JSBody(params = { "element"}, script = "return window.getLineHeight(element);")
    private static native int getLineHeight(org.teavm.jso.dom.html.HTMLElement element);
	public int getLineHeight() {
		int lineHeight = getLineHeight(input);
		return lineHeight;
	}
	
	private void setLetterSpacing(Float objValue, String strValue) {
		input.getStyle().setProperty("letter-spacing", String.valueOf(objValue) + "px");	
	}
	

	private Object getLetterSpacing() {
		return ViewImpl.getPropertyValueAsInt(input, "letter-spacing");
	}
	
	private void setLineSpacing() {
		int lineHeight = getLineHeight();
		int lineSpacing = (int )Math.round((mSpacingAdd + (mSpacingMult * lineHeight)));
		input.getStyle().setProperty("line-height", (lineHeight + lineSpacing) + "px");
		
	}
	
	//start - textsize
	public void setMyTextSize(Object objValue) {
		input.getStyle().setProperty("font-size", ((float)objValue * getFragment().getRootActivity().getScaleFactor()) + "px" );
	}
	//end - textsize

	//start - textstyle
	private void setTextStyle(Object objValue) {
		int value = (int)objValue;
		
		String fontStyle = "normal";
		String fontWeight = "normal";
		if ((value & 0x1) != 0) {
			fontWeight = "bold";
        }
        
        if ((value & 0x2) != 0) {
            fontStyle = "italic";
        }
        input.getStyle().setProperty("font-style", fontStyle);
        input.getStyle().setProperty("font-weight", fontWeight);
	}
	//end - textstyle
	
	private void setMyLineHeight(Object objValue) {
		input.getStyle().setProperty("line-height", (objValue) + "px");		
	}
	
	private Object getMyLineHeight() {
		return ViewImpl.getPropertyValueAsFloat(input, "line-height");
	}
    
	//start - font
	private Object getFont() {
		return input.getStyle().getPropertyValue("font-family");
	}
	
	private void setFontFamily(Object objValue, String strValue) {
        if (objValue instanceof Integer) {
            objValue = PluginInvoker.convertFrom(ConverterFactory.get(CommonConverters.font), null, strValue, fragment);
        }
        Map<String, com.ashera.model.FontDescriptor> fontDescriptors = (Map<String, com.ashera.model.FontDescriptor>) objValue;
        
        // hardcoded to normal fontStyle and non bold font as broswer is capabale of fake bold/italics the font
        String weight = "400";
        String fontStyle = "normal";
        com.ashera.model.FontDescriptor fontDescriptor = fontDescriptors.get(fontStyle + "_" + weight);
        input.getStyle().setProperty("font-family", fontDescriptor.getName());
    }

	private void setTypeFace(Object objValue, String strValue) {
		setFontFamily(objValue, strValue);
	}
	//end - font

	private Object getTextSize() {
		String fontSize = input.getStyle().getPropertyValue("font-size");
		if (fontSize != null && !fontSize.isEmpty()) {
			return ViewImpl.getPropertyValueAsInt(input, "font-size");
		}
		return getLineHeight(input);
	}

	private Object textColorHighlight;
	private void setTextColorHighlight(Object objValue) {
		textColorHighlight = objValue;
		if (input.getClassName() == null) {
			input.setClassName("");
		}
		
		String colorCss = "textcolorhighlight_" + ((String) ViewImpl.getColor(objValue)).replaceAll("#", "");
		if (input.getClassName().indexOf("textcolorhighlight_") != -1) {
			input.setClassName(input.getClassName().replaceAll("textcolorhighlight_([0-9|A-Z])*\\s?", ""));
		}
		if (input.getClassName().indexOf(colorCss) == -1) {
			input.setClassName(colorCss + " " + (input.getClassName() == null ? "" : input.getClassName()));
		}
	}
	
	
	private Object getTextColorHighlight() {
		return textColorHighlight;
	}
	
	
	//start - valign
	private void setVerticalAligmentCenter() {
		hTMLElement.getStyle().setProperty("vertical-align", "middle");
		measurableView.setVerticalAligment(com.ashera.view.BaseMeasurableView.VerticalAligment.middle);
	}

	private void setVerticalAligmentBottom() {
		hTMLElement.getStyle().setProperty("vertical-align", "bottom");		
		measurableView.setVerticalAligment(com.ashera.view.BaseMeasurableView.VerticalAligment.bottom);
	}

	private void setVerticalAligmentTop() {
		hTMLElement.getStyle().setProperty("vertical-align", "top");		
		measurableView.setVerticalAligment(com.ashera.view.BaseMeasurableView.VerticalAligment.top);
	}
	
	private static final int TEXT_ALIGN_CENTER = 0;
	private static final int TEXT_ALIGN_LEFT = 1;
	private static final int TEXT_ALIGN_RIGHT = 2;
	
	
	
	private com.ashera.view.BaseMeasurableView.VerticalAligment getVerticalAligment() {
		String vAlign = hTMLElement.getStyle().getPropertyValue("vertical-align");
		switch (vAlign) {
		case "middle":
			return com.ashera.view.BaseMeasurableView.VerticalAligment.middle;
		case "top":
			return com.ashera.view.BaseMeasurableView.VerticalAligment.top;
		case "bottom":
			return com.ashera.view.BaseMeasurableView.VerticalAligment.bottom;
		default:
			break;
		}
		return null;
	}
	private int getTextAlignment() {
		String textAlign = hTMLElement.getStyle().getPropertyValue("text-align");
		switch (textAlign) {
		case "center":
			return TEXT_ALIGN_CENTER;
		case "left":
			return TEXT_ALIGN_LEFT;
		case "right":
			return TEXT_ALIGN_RIGHT;
		default:
			break;
		}
		return TEXT_ALIGN_LEFT;
	}
	//end - valign
	
	private float shadowRadius;
	private String shadowColor = "";
	private float shadowDx;
	private float shadowDy;
	

	private Object getShadowRadius() {
		return shadowRadius;
	}

	private Object getShadowColor() {
		return shadowColor;
	}

	private Object getShadowDy() {
		return shadowDy;
	}

	private Object getShadowDx() {
		return shadowDx;
	}
	private void setShadowRadius(Float objValue, String strValue) {
		this.shadowRadius = objValue;
		updateTextShadow();	
	}

	private void updateTextShadow() {
		input.getStyle().setProperty("text-shadow", String.format("%spx %spx %spx %s", String.valueOf(shadowDx), String.valueOf(shadowDy), String.valueOf(shadowRadius), shadowColor));
	}

	private void setShadowColor(Object objValue, String strValue) {
		this.shadowColor = (String) objValue;
		updateTextShadow();
	}

	private void setShadowDy(Float objValue, String strValue) {
		this.shadowDy = objValue;
		updateTextShadow();
	}

	private void setShadowDx(Float objValue, String strValue) {
		this.shadowDx = objValue;
		updateTextShadow();
		
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
		case ":":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj);
		    }
		    if (commandType.equals(":")) {
		    	return;
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
		if (strValue != null && !strValue.isEmpty()) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    activity.sendEventMessage(obj);
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
		case ":":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, v,hasFocus);
		    }
		    if (commandType.equals(":")) {
		    	return;
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
		if (strValue != null && !strValue.isEmpty()) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    activity.sendEventMessage(obj);
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
		case ":":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, s);
		    }
		    if (commandType.equals(":")) {
		    	return;
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
		if (strValue != null && !strValue.isEmpty()) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    activity.sendEventMessage(obj);
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
		case ":":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, s,start,count,after);
		    }
		    if (commandType.equals(":")) {
		    	return;
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
		if (strValue != null && !strValue.isEmpty()) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    activity.sendEventMessage(obj);
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
		case ":":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, s,start,before,count);
		    }
		    if (commandType.equals(":")) {
		    	return;
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
		if (strValue != null && !strValue.isEmpty()) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    activity.sendEventMessage(obj);
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

	
	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			measurableView.setId(IdGenerator.getId(id));
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
public AutoCompleteTextViewCommandBuilder setDrawableLeft(String value) {
	Map<String, Object> attrs = initCommand("drawableLeft");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder setDrawableRight(String value) {
	Map<String, Object> attrs = initCommand("drawableRight");
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
public AutoCompleteTextViewCommandBuilder setMaxLength(int value) {
	Map<String, Object> attrs = initCommand("maxLength");
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
public AutoCompleteTextViewCommandBuilder setEditable(boolean value) {
	Map<String, Object> attrs = initCommand("editable");
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
public AutoCompleteTextViewCommandBuilder setPadding(String value) {
	Map<String, Object> attrs = initCommand("padding");
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
public AutoCompleteTextViewCommandBuilder tryGetLetterSpacing() {
	Map<String, Object> attrs = initCommand("letterSpacing");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getLetterSpacing() {
	Map<String, Object> attrs = initCommand("letterSpacing");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setLetterSpacing(float value) {
	Map<String, Object> attrs = initCommand("letterSpacing");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetShadowDx() {
	Map<String, Object> attrs = initCommand("shadowDx");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getShadowDx() {
	Map<String, Object> attrs = initCommand("shadowDx");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setShadowDx(float value) {
	Map<String, Object> attrs = initCommand("shadowDx");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetShadowDy() {
	Map<String, Object> attrs = initCommand("shadowDy");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getShadowDy() {
	Map<String, Object> attrs = initCommand("shadowDy");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setShadowDy(float value) {
	Map<String, Object> attrs = initCommand("shadowDy");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetShadowColor() {
	Map<String, Object> attrs = initCommand("shadowColor");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getShadowColor() {
	Map<String, Object> attrs = initCommand("shadowColor");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setShadowColor(String value) {
	Map<String, Object> attrs = initCommand("shadowColor");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetShadowRadius() {
	Map<String, Object> attrs = initCommand("shadowRadius");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getShadowRadius() {
	Map<String, Object> attrs = initCommand("shadowRadius");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setShadowRadius(float value) {
	Map<String, Object> attrs = initCommand("shadowRadius");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetLineHeight() {
	Map<String, Object> attrs = initCommand("lineHeight");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getLineHeight() {
	Map<String, Object> attrs = initCommand("lineHeight");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setLineHeight(String value) {
	Map<String, Object> attrs = initCommand("lineHeight");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetLineSpacingExtra() {
	Map<String, Object> attrs = initCommand("lineSpacingExtra");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getLineSpacingExtra() {
	Map<String, Object> attrs = initCommand("lineSpacingExtra");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setLineSpacingExtra(String value) {
	Map<String, Object> attrs = initCommand("lineSpacingExtra");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public AutoCompleteTextViewCommandBuilder tryGetLineSpacingMultiplier() {
	Map<String, Object> attrs = initCommand("lineSpacingMultiplier");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getLineSpacingMultiplier() {
	Map<String, Object> attrs = initCommand("lineSpacingMultiplier");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setLineSpacingMultiplier(float value) {
	Map<String, Object> attrs = initCommand("lineSpacingMultiplier");
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
public AutoCompleteTextViewCommandBuilder setPassword(boolean value) {
	Map<String, Object> attrs = initCommand("password");
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
public AutoCompleteTextViewCommandBuilder setTextColorHint(String value) {
	Map<String, Object> attrs = initCommand("textColorHint");
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
public AutoCompleteTextViewCommandBuilder tryGetHint() {
	Map<String, Object> attrs = initCommand("hint");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getHint() {
	Map<String, Object> attrs = initCommand("hint");
	return attrs.get("commandReturnValue");
}
public AutoCompleteTextViewCommandBuilder setHint(String value) {
	Map<String, Object> attrs = initCommand("hint");
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
public AutoCompleteTextViewCommandBuilder setCapitalize(String value) {
	Map<String, Object> attrs = initCommand("capitalize");
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
public AutoCompleteTextViewCommandBuilder setOnFocusChange(String value) {
	Map<String, Object> attrs = initCommand("onFocusChange");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
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
public AutoCompleteTextViewCommandBuilder setHintTextFormat(String value) {
	Map<String, Object> attrs = initCommand("hintTextFormat");
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
public Object getText() {
	return getBuilder().reset().tryGetText().execute(false).getText(); 
}
public void setText(String value) {
	getBuilder().reset().setText(value).execute(true);
}

public Object getTextColor() {
	return getBuilder().reset().tryGetTextColor().execute(false).getTextColor(); 
}
public void setTextColor(String value) {
	getBuilder().reset().setTextColor(value).execute(true);
}

public Object getGravity() {
	return getBuilder().reset().tryGetGravity().execute(false).getGravity(); 
}
public void setGravity(String value) {
	getBuilder().reset().setGravity(value).execute(true);
}

public Object getTextSize() {
	return getBuilder().reset().tryGetTextSize().execute(false).getTextSize(); 
}
public void setTextSize(String value) {
	getBuilder().reset().setTextSize(value).execute(true);
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

public void setTypeface(String value) {
	getBuilder().reset().setTypeface(value).execute(true);
}

public void setTextStyle(String value) {
	getBuilder().reset().setTextStyle(value).execute(true);
}

public void setFontFamily(String value) {
	getBuilder().reset().setFontFamily(value).execute(true);
}

public void setDrawableLeft(String value) {
	getBuilder().reset().setDrawableLeft(value).execute(true);
}

public void setDrawableRight(String value) {
	getBuilder().reset().setDrawableRight(value).execute(true);
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

public void setMaxLength(int value) {
	getBuilder().reset().setMaxLength(value).execute(true);
}

public void setEnabled(boolean value) {
	getBuilder().reset().setEnabled(value).execute(true);
}

public void setEditable(boolean value) {
	getBuilder().reset().setEditable(value).execute(true);
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

public void setPadding(String value) {
	getBuilder().reset().setPadding(value).execute(true);
}

public Object getPaddingTop() {
	return getBuilder().reset().tryGetPaddingTop().execute(false).getPaddingTop(); 
}
public void setPaddingTop(String value) {
	getBuilder().reset().setPaddingTop(value).execute(true);
}

public Object getPaddingBottom() {
	return getBuilder().reset().tryGetPaddingBottom().execute(false).getPaddingBottom(); 
}
public void setPaddingBottom(String value) {
	getBuilder().reset().setPaddingBottom(value).execute(true);
}

public Object getPaddingLeft() {
	return getBuilder().reset().tryGetPaddingLeft().execute(false).getPaddingLeft(); 
}
public void setPaddingLeft(String value) {
	getBuilder().reset().setPaddingLeft(value).execute(true);
}

public Object getPaddingRight() {
	return getBuilder().reset().tryGetPaddingRight().execute(false).getPaddingRight(); 
}
public void setPaddingRight(String value) {
	getBuilder().reset().setPaddingRight(value).execute(true);
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

public void setPaddingHorizontal(String value) {
	getBuilder().reset().setPaddingHorizontal(value).execute(true);
}

public void setPaddingVertical(String value) {
	getBuilder().reset().setPaddingVertical(value).execute(true);
}

public void setDrawableTint(String value) {
	getBuilder().reset().setDrawableTint(value).execute(true);
}

public void setDrawableTintMode(String value) {
	getBuilder().reset().setDrawableTintMode(value).execute(true);
}

public Object getLetterSpacing() {
	return getBuilder().reset().tryGetLetterSpacing().execute(false).getLetterSpacing(); 
}
public void setLetterSpacing(float value) {
	getBuilder().reset().setLetterSpacing(value).execute(true);
}

public Object getShadowDx() {
	return getBuilder().reset().tryGetShadowDx().execute(false).getShadowDx(); 
}
public void setShadowDx(float value) {
	getBuilder().reset().setShadowDx(value).execute(true);
}

public Object getShadowDy() {
	return getBuilder().reset().tryGetShadowDy().execute(false).getShadowDy(); 
}
public void setShadowDy(float value) {
	getBuilder().reset().setShadowDy(value).execute(true);
}

public Object getShadowColor() {
	return getBuilder().reset().tryGetShadowColor().execute(false).getShadowColor(); 
}
public void setShadowColor(String value) {
	getBuilder().reset().setShadowColor(value).execute(true);
}

public Object getShadowRadius() {
	return getBuilder().reset().tryGetShadowRadius().execute(false).getShadowRadius(); 
}
public void setShadowRadius(float value) {
	getBuilder().reset().setShadowRadius(value).execute(true);
}

public Object getLineHeight() {
	return getBuilder().reset().tryGetLineHeight().execute(false).getLineHeight(); 
}
public void setLineHeight(String value) {
	getBuilder().reset().setLineHeight(value).execute(true);
}

public Object getLineSpacingExtra() {
	return getBuilder().reset().tryGetLineSpacingExtra().execute(false).getLineSpacingExtra(); 
}
public void setLineSpacingExtra(String value) {
	getBuilder().reset().setLineSpacingExtra(value).execute(true);
}

public Object getLineSpacingMultiplier() {
	return getBuilder().reset().tryGetLineSpacingMultiplier().execute(false).getLineSpacingMultiplier(); 
}
public void setLineSpacingMultiplier(float value) {
	getBuilder().reset().setLineSpacingMultiplier(value).execute(true);
}

public Object getTextColorHighlight() {
	return getBuilder().reset().tryGetTextColorHighlight().execute(false).getTextColorHighlight(); 
}
public void setTextColorHighlight(String value) {
	getBuilder().reset().setTextColorHighlight(value).execute(true);
}

public void setPassword(boolean value) {
	getBuilder().reset().setPassword(value).execute(true);
}

public void setTextAllCaps(boolean value) {
	getBuilder().reset().setTextAllCaps(value).execute(true);
}

public void selectAllOnFocus(boolean value) {
	getBuilder().reset().selectAllOnFocus(value).execute(true);
}

public void selectAll(boolean value) {
	getBuilder().reset().selectAll(value).execute(true);
}

public void setTextColorHint(String value) {
	getBuilder().reset().setTextColorHint(value).execute(true);
}

public void setNumeric(String value) {
	getBuilder().reset().setNumeric(value).execute(true);
}

public void setDigits(String value) {
	getBuilder().reset().setDigits(value).execute(true);
}

public Object getHint() {
	return getBuilder().reset().tryGetHint().execute(false).getHint(); 
}
public void setHint(String value) {
	getBuilder().reset().setHint(value).execute(true);
}

public Object isCursorVisible() {
	return getBuilder().reset().tryGetCursorVisible().execute(false).isCursorVisible(); 
}
public void setCursorVisible(boolean value) {
	getBuilder().reset().setCursorVisible(value).execute(true);
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

public void setCapitalize(String value) {
	getBuilder().reset().setCapitalize(value).execute(true);
}

public Object getInputType() {
	return getBuilder().reset().tryGetInputType().execute(false).getInputType(); 
}
public void setInputType(String value) {
	getBuilder().reset().setInputType(value).execute(true);
}

public void setOnFocusChange(String value) {
	getBuilder().reset().setOnFocusChange(value).execute(true);
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

public void setHintTextFormat(String value) {
	getBuilder().reset().setHintTextFormat(value).execute(true);
}

public void setSetFocus(boolean value) {
	getBuilder().reset().setSetFocus(value).execute(true);
}

}


    
	//end - body
	private void initPopUp() {
		ViewImpl.setOnListener(this, input, (e) -> {
			beforetextChange("", 0, 0);
			afterTextChanged();
		}, "input", "input");
	}
	
	
	private void movePopUpContainerToTop() {
	}
	
	private boolean islinearlayout() {
		return true;
	}
	
	


	private void postSetAttributeEditText(WidgetAttribute key, String strValue, Object objValue,
			ILifeCycleDecorator decorator) {
	}
	
	
	@org.teavm.jso.JSBody(params = {"element"}, script = "return window.shadowRoot.activeElement === element;")
    private static native boolean isFocused(HTMLElement element);

	private boolean isFocused() {
		return isFocused(input);
	}

}
