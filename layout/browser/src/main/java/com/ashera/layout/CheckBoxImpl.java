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

import r.android.widget.CompoundButton;
@SuppressLint("NewApi")
public class CheckBoxImpl extends BaseWidget implements com.ashera.validations.FormElement, ICustomMeasureWidth {
	//start - body
	public final static String LOCAL_NAME = "CheckBox"; 
	public final static String GROUP_NAME = "CheckBox";

	protected org.teavm.jso.dom.html.HTMLElement hTMLElement;
	protected r.android.widget.CheckBox measurableView;	
	private r.android.graphics.Canvas canvas;
	
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
		final static class Ellipsize extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("end",  0x3);
				mapping.put("marquee",  0x4);
				mapping.put("middle",  0x2);
				mapping.put("none",  0x0);
				mapping.put("start",  0x1);
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
	
	@Override
	public void loadAttributes(String attributeName) {
		ViewImpl.register(attributeName);


		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("checked").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onCheckedChange").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("buttonSize").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("buttonPadding").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
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
		ConverterFactory.register("CheckBox.font", new Font());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("typeface").withType("CheckBox.font").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		ConverterFactory.register("CheckBox.textStyle", new TextStyle());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textStyle").withType("CheckBox.textStyle").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("fontFamily").withType("font").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableStart").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableEnd").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTop").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableBottom").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawablePadding").withType("dimension").withOrder(1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxLength").withType("int").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("enabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("editable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("singleLine").withType("boolean").withOrder(-1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textAllCaps").withType("boolean").withOrder(-1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scrollHorizontally").withType("boolean").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		ConverterFactory.register("CheckBox.ellipsize", new Ellipsize());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("ellipsize").withType("CheckBox.ellipsize"));
		ConverterFactory.register("CheckBox.marqueeRepeatLimit", new MarqueeRepeatLimit());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("marqueeRepeatLimit").withType("CheckBox.marqueeRepeatLimit"));
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
		ConverterFactory.register("CheckBox.drawableTintMode", new DrawableTintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTintMode").withType("CheckBox.drawableTintMode"));
		ConverterFactory.register("CheckBox.justificationMode", new JustificationMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("justificationMode").withType("CheckBox.justificationMode"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("letterSpacing").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("shadowDx").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("shadowDy").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("shadowColor").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("shadowRadius").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textIsSelectable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lineHeight").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lineSpacingExtra").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lineSpacingMultiplier").withType("float").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textColorHighlight").withType("color"));
		ConverterFactory.register("CheckBox.autoLink", new AutoLink());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("autoLink").withType("CheckBox.autoLink").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textColorLink").withType("colorstate").withOrder(-100));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textFormat").withType("resourcestring").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textAppearance").withType("string").withUiFlag(UPDATE_UI_REQUEST_LAYOUT).withStylePriority(1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableIconSize").withType("dimension").withOrder(-1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
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

		
	public class CheckBoxExt extends r.android.widget.CheckBox implements ILifeCycleDecorator{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		private List<IWidget> overlays;
		public IWidget getWidget() {
			return CheckBoxImpl.this;
		}

		public CheckBoxExt() {
			super(CheckBoxImpl.this);
			
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
			ViewImpl.setDrawableBounds(CheckBoxImpl.this, l, t, r, b);
			if (!isOverlay()) {
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			nativeMakeFrameForChildWidget(l, t, r, b);
			}
			replayBufferedEvents();
			canvas.reset();
			onDraw(canvas);
	        ViewImpl.redrawDrawables(CheckBoxImpl.this);
	        overlays = ViewImpl.drawOverlay(CheckBoxImpl.this, overlays);
			
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
        		ViewImpl.drawableStateChanged(CheckBoxImpl.this);
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
    		
    		IWidget widget = template.loadLazyWidgets(CheckBoxImpl.this.getParent());
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
        	CheckBoxImpl.this.getParent().remove(CheckBoxImpl.this);
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
			CheckBoxImpl.this.setAttribute(name, value, !(value instanceof String));
		}
        @Override
        public void setVisibility(int visibility) {
            super.setVisibility(visibility);
            ((HTMLElement)asNativeWidget()).getStyle().setProperty("display", visibility != View.VISIBLE ? "none" : "block");
            
        }
		  public int getBorderPadding(){
		    return CheckBoxImpl.this.getBorderPadding();
		  }

		  public int getLineHeight(){
		    return CheckBoxImpl.this.getLineHeight();
		  }

		  public int getBorderWidth(){
		    return CheckBoxImpl.this.getBorderWidth();
		  }
		  public int getLineHeightPadding(){
		    return CheckBoxImpl.this.getLineHeightPadding();
		  }
		 @Override
		 public void onRtlPropertiesChanged(int layoutDirection) {
			 CheckBoxImpl.this.onRtlPropertiesChanged(layoutDirection);
		 }
        @Override
        public int nativeMeasureWidth(java.lang.Object uiView) {
        	return CheckBoxImpl.this.nativeMeasureWidth(uiView);
        }
        
        @Override
        public int nativeMeasureHeight(java.lang.Object uiView, int width) {
        	return CheckBoxImpl.this.nativeMeasureHeight(uiView, width);
        }
        @Override
        public int computeSize(float width) {
        	return nativeMeasureHeight(hTMLElement, (int) width);
    	}
		@Override
		public java.lang.String getText() {
			return (String) getMyText();
		}

        
    	public void setState0(Object value) {
    		ViewImpl.setState(CheckBoxImpl.this, 0, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(CheckBoxImpl.this, 1, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(CheckBoxImpl.this, 2, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(CheckBoxImpl.this, 3, value);
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
		measurableView = new CheckBoxExt();
		nativeCreate(params);	
		ViewImpl.registerCommandConveter(this);
	}

	@Override
	@SuppressLint("NewApi")
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		Object nativeWidget = asNativeWidget();
		ViewImpl.setAttribute(this,  key, strValue, objValue, decorator);
		
		switch (key.getAttributeName()) {
			case "checked": {
				


		setChecked(objValue);



			}
			break;
			case "onCheckedChange": {
				


		setOnChecked(objValue);



			}
			break;
			case "buttonSize": {
				


		setButtonSize(objValue);



			}
			break;
			case "buttonPadding": {
				


		setButtonPadding(objValue);



			}
			break;
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
			case "singleLine": {
				


		 setSingleLine(objValue);



			}
			break;
			case "textAllCaps": {
				


		 setTextAllCaps(objValue);



			}
			break;
			case "scrollHorizontally": {
				


		 setScrollHorizontally(objValue);



			}
			break;
			case "ellipsize": {
				


		 setEllipsize(objValue, strValue);



			}
			break;
			case "marqueeRepeatLimit": {
				


		 setMarqueeRepeatLimit(objValue);



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
			case "justificationMode": {
				


		 setJustificationMode(objValue, strValue);



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
			case "textIsSelectable": {
				


		 setTextIsSelectable(objValue, strValue);



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
			case "autoLink": {
				


		 setAutoLink(objValue);



			}
			break;
			case "textColorLink": {
				


		 setTextColorLink(objValue);



			}
			break;
			case "textFormat": {
				


		setTextFormat(objValue);



			}
			break;
			case "textAppearance": {
				


		ViewImpl.setStyle(this, objValue);



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
			case "checked": {
return getChecked();				}
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
			case "ellipsize": {
return getEllipsize();				}
			case "marqueeRepeatLimit": {
return getMarqueeRepeatLimit();				}
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
			case "justificationMode": {
return getJustificationMode();				}
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
			case "textIsSelectable": {
return getTextIsSelectable();				}
			case "lineHeight": {
return getMyLineHeight();				}
			case "lineSpacingExtra": {
return getLineSpacingExtra();				}
			case "lineSpacingMultiplier": {
return getLineSpacingMultiplier();				}
			case "textColorHighlight": {
return getTextColorHighlight();				}
			case "autoLink": {
return getAutoLink();				}
		}
		
		return null;
	}
	
	@Override
	public Object asWidget() {
		return measurableView;
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
		return windowNativeMeasureHeight(label, width);
	}

	public int nativeMeasureWidth(Object uiView) {
		return windowNativeMeasureWidth(label);
	}
	
	//end - nativeMeasure
	//start - drawable
	private HTMLElement drawableLeft;
	private HTMLElement drawableLeftWrapper;
	private HTMLElement drawableTop;
	private HTMLElement drawableTopWrapper;
    private HTMLElement drawableBottom;
    private HTMLElement drawableBottomWrapper;
    private HTMLElement drawableRight;
    private HTMLElement drawableRightWrapper;
	private void setDrawableBottom(Object objValue) {
		if (objValue instanceof r.android.graphics.drawable.Drawable) {
			r.android.graphics.drawable.Drawable drawable = (r.android.graphics.drawable.Drawable) objValue;
			if (drawable.hasDrawable()) {
				if (drawableBottom == null) {
					this.drawableBottomWrapper = org.teavm.jso.dom.html.HTMLDocument.current().createElement("div");
					this.drawableBottom = org.teavm.jso.dom.html.HTMLDocument.current().createElement("img");
					this.drawableBottom.getStyle().setProperty("width", "inherit");
					this.drawableBottom.getStyle().setProperty("height", "inherit");
					drawableBottomWrapper.appendChild(drawableBottom);
					hTMLElement.appendChild(drawableBottomWrapper);
				}
				measurableView.setBottomDrawable(drawable);
				updateImageSrc(drawable, drawableBottom);
			} else {
				measurableView.setBottomDrawable(null);
				if (this.drawableBottomWrapper != null) {
					hTMLElement.removeChild(this.drawableBottomWrapper);
					this.drawableBottomWrapper = null;
					this.drawableBottom = null;
				}
			}
		}
	}

	private void setDrawableTop(Object objValue) {
		if (objValue instanceof r.android.graphics.drawable.Drawable) {
			r.android.graphics.drawable.Drawable drawable = (r.android.graphics.drawable.Drawable) objValue;
			if (drawable.hasDrawable()) {
				if (drawableTop == null) {
					this.drawableTopWrapper = org.teavm.jso.dom.html.HTMLDocument.current().createElement("div");
					this.drawableTop = org.teavm.jso.dom.html.HTMLDocument.current().createElement("img");
					this.drawableTop.getStyle().setProperty("width", "inherit");
					this.drawableTop.getStyle().setProperty("height", "inherit");
					drawableTopWrapper.appendChild(drawableTop);
					hTMLElement.appendChild(drawableTopWrapper);
				}
	
	
				measurableView.setTopDrawable(drawable);
				updateImageSrc(drawable, drawableTop);
			} else {
				measurableView.setTopDrawable(null);
				if (this.drawableTopWrapper != null) {
					hTMLElement.removeChild(this.drawableTopWrapper);
					this.drawableTopWrapper = null;
					this.drawableTop = null;
				}
			}
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
		if (objValue instanceof r.android.graphics.drawable.Drawable) {
			r.android.graphics.drawable.Drawable drawable = (r.android.graphics.drawable.Drawable) objValue;
			if (drawable.hasDrawable()) {
				if (drawableRight == null) {
					// create bottom
					this.drawableRightWrapper = org.teavm.jso.dom.html.HTMLDocument.current().createElement("div");
					this.drawableRight = org.teavm.jso.dom.html.HTMLDocument.current().createElement("img");
					this.drawableRight.getStyle().setProperty("width", "inherit");
					this.drawableRight.getStyle().setProperty("height", "inherit");
					drawableRightWrapper.appendChild(drawableRight);
					hTMLElement.appendChild(drawableRightWrapper);
				}
	
				measurableView.setRightDrawable(drawable);
				updateImageSrc(drawable, drawableRight);
			} else {
				measurableView.setRightDrawable(null);
				if (this.drawableRightWrapper != null) {
					hTMLElement.removeChild(this.drawableRightWrapper);
					this.drawableRightWrapper = null;
					this.drawableRight = null;
				}
			}
		}
	}

	private void setDrawableLeftInternal(Object objValue) {
		if (objValue instanceof r.android.graphics.drawable.Drawable) {
			r.android.graphics.drawable.Drawable drawable = (r.android.graphics.drawable.Drawable) objValue;
			
			if (drawable.hasDrawable()) {
				if (drawableLeft == null) {
					// create bottom
					this.drawableLeftWrapper = org.teavm.jso.dom.html.HTMLDocument.current().createElement("div");
					this.drawableLeft = org.teavm.jso.dom.html.HTMLDocument.current().createElement("img");
					this.drawableLeft.getStyle().setProperty("width", "inherit");
					this.drawableLeft.getStyle().setProperty("height", "inherit");
					drawableLeftWrapper.appendChild(drawableLeft);
					hTMLElement.appendChild(drawableLeftWrapper);
				}
				measurableView.setLeftDrawable(drawable);
				updateImageSrc(drawable, drawableLeft);
			} else {
				measurableView.setLeftDrawable(null);
				if (this.drawableLeftWrapper != null) {
					hTMLElement.removeChild(this.drawableLeftWrapper);
					this.drawableLeftWrapper = null;
					this.drawableLeft = null;
				}
			}
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
		setDrawableTintMode(strValue, drawableBottom,  drawableTop, drawableLeft, drawableRight);
	}
	
	private void setDrawableTintMode(String tintColorMode, HTMLElement... htmlElements) {
		for (HTMLElement htmlElement : htmlElements) {
			if (htmlElement != null) {
				this.tintColorMode= tintColorMode;
				ViewImpl.updateTintColor(this, htmlElement, tintColor, tintColorMode);
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
		
		setDrawableTint(objValue, drawableBottom, drawableTop, drawableLeft, drawableRight);
	}
	
	private String tintColor;
	private String tintColorMode = "src_atop";
	private void setDrawableTint(Object objValue, HTMLElement... htmlElements) {
		String hexColor = (String) ViewImpl.getColor(objValue);
		this.tintColor= hexColor;
		for (HTMLElement htmlElement : htmlElements) {
			if (htmlElement != null) {
				ViewImpl.updateTintColor(this, htmlElement, tintColor, tintColorMode);
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
		int lineHeight = getLineHeight(label);
		return lineHeight;
	}
	
	private void setLetterSpacing(Float objValue, String strValue) {
		label.getStyle().setProperty("letter-spacing", String.valueOf(objValue) + "px");	
	}
	

	private Object getLetterSpacing() {
		return ViewImpl.getPropertyValueAsInt(label, "letter-spacing");
	}
	
	private void setLineSpacing() {
		int lineHeight = getLineHeight();
		int lineSpacing = (int )Math.round((mSpacingAdd + (mSpacingMult * lineHeight)));
		label.getStyle().setProperty("line-height", (lineHeight + lineSpacing) + "px");
		
	}
	
	//start - textsize
	public void setMyTextSize(Object objValue) {
		label.getStyle().setProperty("font-size", ((float)objValue * getFragment().getRootActivity().getScaleFactor()) + "px" );
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
        label.getStyle().setProperty("font-style", fontStyle);
        label.getStyle().setProperty("font-weight", fontWeight);
	}
	//end - textstyle
	
	private void setMyLineHeight(Object objValue) {
		label.getStyle().setProperty("line-height", (objValue) + "px");		
	}
	
	private Object getMyLineHeight() {
		return ViewImpl.getPropertyValueAsFloat(label, "line-height");
	}
    
	//start - font
	private Object getFont() {
		return label.getStyle().getPropertyValue("font-family");
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
        label.getStyle().setProperty("font-family", fontDescriptor.getName());
    }

	private void setTypeFace(Object objValue, String strValue) {
		setFontFamily(objValue, strValue);
	}
	//end - font

	private Object getTextSize() {
		String fontSize = label.getStyle().getPropertyValue("font-size");
		if (fontSize != null && !fontSize.isEmpty()) {
			return ViewImpl.getPropertyValueAsInt(label, "font-size");
		}
		return getLineHeight(label);
	}

	private Object textColorHighlight;
	private void setTextColorHighlight(Object objValue) {
		textColorHighlight = objValue;
		if (label.getClassName() == null) {
			label.setClassName("");
		}
		
		String colorCss = "textcolorhighlight_" + ((String) ViewImpl.getColor(objValue)).replaceAll("#", "");
		if (label.getClassName().indexOf("textcolorhighlight_") != -1) {
			label.setClassName(label.getClassName().replaceAll("textcolorhighlight_([0-9|A-Z])*\\s?", ""));
		}
		if (label.getClassName().indexOf(colorCss) == -1) {
			label.setClassName(colorCss + " " + (label.getClassName() == null ? "" : label.getClassName()));
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
		label.getStyle().setProperty("text-shadow", String.format("%spx %spx %spx %s", String.valueOf(shadowDx), String.valueOf(shadowDy), String.valueOf(shadowRadius), shadowColor));
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
	
	


	private HTMLElement label;
	private HTMLElement labelWrapper;
	
    private void nativeCreateLabel(Map<String, Object> params) {
    	escapeHtml = true;
    	registerForAttributeCommandChain("text");
    	registerForAttributeCommandChain("drawableStart");
		registerForAttributeCommandChain("drawableTop");
		registerForAttributeCommandChain("drawableBottom");
		registerForAttributeCommandChain("drawableEnd");
    	initHtml(params);
		nativeCreateLabel("div");
    }

	private void nativeCreateLabel(String rootTagName) {
		hTMLElement = org.teavm.jso.dom.html.HTMLDocument.current().createElement(rootTagName);
		hTMLElement.getStyle().setProperty("box-sizing", "border-box");
		hTMLElement.getStyle().setProperty("overflow", "hidden");
		
		labelWrapper = org.teavm.jso.dom.html.HTMLDocument.current().createElement("div");
    	label = org.teavm.jso.dom.html.HTMLDocument.current().createElement("label");
    	label.getStyle().setProperty("display", "table-cell");
    	label.getStyle().setProperty("vertical-align", "inherit");
    	label.getStyle().setProperty("word-break", "break-word");
    	label.getStyle().setProperty("user-select", "text");
    	label.getStyle().setProperty("overflow", "hidden");
    	

    	labelWrapper.getStyle().setProperty("vertical-align", "inherit");
    	labelWrapper.appendChild(label);
    	hTMLElement.appendChild(labelWrapper);
	}

	private void setEnabled(Object objValue) {
		if ((boolean) objValue) {
			hTMLElement.removeAttribute("disabled");
		} else {
			hTMLElement.setAttribute("disabled", "true");
		}
	}



	public void nativeMakeFrameForChildWidget(int l, int t, int r, int b) {
		com.ashera.model.RectM widgetBounds = measurableView.getWidgetBounds(r - l, b - t, label);
		ViewImpl.updateBounds(labelWrapper, widgetBounds.x, widgetBounds.y, widgetBounds.width, widgetBounds.height);
		label.getStyle().setProperty("max-width", widgetBounds.width + "px");
		label.getStyle().setProperty("width", widgetBounds.width + "px");
		label.getStyle().setProperty("height", widgetBounds.height + "px");

		updateDrawableBounds(l, t, r, b);
	}
	private void nativeSetText(Object objValue) {
		String str = (String) objValue;
		setInnerText(label, str);
	}

    @org.teavm.jso.JSBody(params = { "element", "text" }, script = "element.innerText = text;")
    private static native void setInnerText(org.teavm.jso.dom.html.HTMLElement element, String text);


	public int getLineHeightPadding() {
		return 0;
	}

	public int getBorderWidth() {
		return 0;
	}

	public int getBorderPadding() {
		return 0;
	}
	

	private Object ellipsize;
	private void setEllipsize(Object objValue, String strValue) {
		this.ellipsize = objValue;
		cancelTimer();
		if (strValue.equals("marquee")) {
			startTimer();	
		}
		
		String textOverFlow = "initial";
		String direction = "ltr";
		switch (strValue) {
		case "end":
			textOverFlow = "ellipsis";
			break;
		case "start":
			textOverFlow = "ellipsis";
			direction =  "rtl";
			break;			
		default:
			break;
		}
		
		label.getStyle().setProperty("direction", direction);
		label.getStyle().setProperty("text-overflow", textOverFlow);
		
	}

	private void setScrollHorizontally(Object objValue) {
		//measurableView.setHorizontallyScrolling(objValue != null && (Boolean) objValue);
		setSingleLine(objValue);
		if ((boolean) objValue) {
			label.getStyle().setProperty("overflow-x", "visible");
		} else {
			label.getStyle().setProperty("overflow-x", "hidden");
		}
	}
	
	
	private Object getEllipsize() {
		return ellipsize;
	}

	private Object getMyText() {
		String innerHTML = label.getInnerHTML();
		if (innerHTML == null) {
			innerHTML = "";
		}
		return innerHTML;
	}
    
    private void addMinMaxListener() {
		
	}
	
	private void cancelNativeTimer() {
		org.teavm.jso.browser.Window.clearInterval(timeoutId);
	}

	private int timeoutId; 
	private boolean isDisposed;
	private DellocHandler dellocHandler;	
	private void schedule() {
		timeoutId = org.teavm.jso.browser.Window.setTimeout(new org.teavm.jso.browser.TimerHandler() {
			@Override
			public void onTimer() {
				marqueeTask.run();
			}
		}, 100);
	}

	private void addDeallocHandler() {
  		if (dellocHandler == null) {
			String type = StandardEvents.dealloc.toString();
			dellocHandler = new DellocHandler(type);
			fragment.getEventBus().on(type, dellocHandler);
  		}
  	
	}
	
	private final class DellocHandler extends com.ashera.widget.bus.EventBusHandler {
		private DellocHandler(String type) {
			super(type);
		}

		@Override
		protected void doPerform(Object payload) {
			cancelTimer();
			isDisposed = true;
		}
	}

	private boolean canMarquee() {
		return "nowrap".equals(label.getStyle().getPropertyValue("white-space"));
	}
	
	
	public void executeOnMainThread(Runnable runnable) {
		runnable.run();
	}

  	private boolean isDisposed() {
		return isDisposed;
	}

    private void nativeRequestLayout() {
	}
	
	private void setSingleLine(Object objValue) {
		if ((boolean) objValue) {
			label.getStyle().setProperty("white-space", "nowrap");
		} else {
			label.getStyle().setProperty("white-space", "normal");
		}
	}
	
	private void setTextIsSelectable(Object objValue, String strValue) {
		if ((boolean) objValue) {
			label.getStyle().setProperty("user-select", "text");
		} else {
			label.getStyle().setProperty("user-select", "none");	
		}
	}
	
	
	private Object getTextIsSelectable() {
		return !"none".equals(label.getStyle().getPropertyValue("user-select"));
	}
	
	private void setJustificationMode(Object objValue, String strValue) {
		if ((int) objValue == 1) {
			label.getStyle().setProperty("text-align", "justify");	
		} else {
			label.getStyle().setProperty("text-align", "initial");
		}
		
	}

	private Object getJustificationMode() {
		return "justify".equals(label.getStyle().getPropertyValue("text-align")) ? 0x1 : 0x0;
	}
	

	private void drawableStateChangedAdditional() {
		drawableStateChangedForTextLinkColor();
	}
	
	private void handleHtmlText(String text) {
		HtmlToHtmlConverterHandler contentHandler = new HtmlToHtmlConverterHandler(htmlConfig, fragment);
		com.ashera.parser.html.Html.parseHtml(text, contentHandler);
		label.clear();
		for (HTMLElement htmlElement : contentHandler.getRoots()) {
			label.appendChild(htmlElement);
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
	


    private int autoSizeMin = -1;
    private int autoSizeMax = -1;
    private int autoSizeGranular = -1;
    
	
	private void setAutoSizeStepGranularity(Object objValue) {
		autoSizeGranular = (int) objValue;
		
		if (isInitialised()) {
			setAutoSizeTextTypeInternal( getAutoSizeTextType(measurableView));
		}
	}

	private void setAutoMinTextSize(Object objValue) {
		autoSizeMin = (int) objValue;
		
		if (isInitialised()) {
			setAutoSizeTextTypeInternal( getAutoSizeTextType(measurableView));
		}
	}

	private void setAutoMaxTextSize(Object objValue) {
		autoSizeMax = (int) objValue;
		
		if (isInitialised()) {
			setAutoSizeTextTypeInternal( getAutoSizeTextType(measurableView));
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
		return getAutoSizeTextType(measurableView);
	}
	


	public void setErrorMessage(String message) {
		setAttribute("text", message, false);
		setAttribute("visibility", message == null || message.isEmpty() ? "gone" : "visible", false);
	}
	


	private void setTextFormat(Object objValue) {
		applyAttributeCommand("text", CommonConverters.command_textformatter, new String[] {"textFormat"}, true, (String) objValue);
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
	


	private int autoLink;
	private Object getAutoLink() {
		return autoLink;
	}
	
	
	private void setAutoLink(Object objValue) {
		this.autoLink = (int) objValue;
		applyAttributeCommand("text", "autoLink", new String[] {"autoLink"}, true, "mask", autoLink);		
	}
	
	private boolean linksClickable;
	private void setLinksClickable(Object objValue) {
		this.linksClickable = (boolean) objValue;
		applyAttributeCommand("text", "autoLink", new String[] {"autoLink"}, true, "linksClickable", linksClickable);	
	}
	
	
	private Object getLinksClickable() {
		return linksClickable;
	}
	

 
	private void setTextColorLink(Object objValue) {
		if (objValue instanceof r.android.content.res.ColorStateList) {
			r.android.content.res.ColorStateList colorStateList = (r.android.content.res.ColorStateList) objValue;
			measurableView.setLinkTextColor(colorStateList);
			objValue = measurableView.getPaint().linkColor;
		}
		if (html) {
			htmlConfig.put("textColorLink", ViewImpl.getColor(objValue));
		}
		
		if (isInitialised()) {
			rerunCommandOnSource("text", "statechange");
		}
	}
	
	private void drawableStateChangedForTextLinkColor() {
		if (measurableView.getLinkTextColors() != null && measurableView.getLinkTextColors().isStateful()) {
			setTextColorLink(measurableView.getLinkTextColors());
		}
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
		com.ashera.view.BaseMeasurableView.VerticalAligment verticalAligment = getVerticalAligment();
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

    
    


	private int getAutoSizeTextType(r.android.widget.TextView measurableView) {
		return measurableView.getAutoSizeTextType();
	}

	private void setAutoSizeTextTypeInternal(int autoTextType) {
		removeResizeListener();
        
		if (measurableView.isAutoSizeTextTypeUniform(autoTextType)) {
			measurableView.setUpAutoSizeTextTypeUniform(autoSizeMin, autoSizeMax, autoSizeGranular);
            addAutoResizeListener();
        } else {
        	measurableView.clearAutoSizeTypeConfiguration();
        }
	}
	
	private void setAutoSizePresetSizes(Object objValue) {
		measurableView.setAutoSizeTextTypeUniformWithPresetSizes((int[]) objValue, 0);
		
	}

	@com.google.j2objc.annotations.WeakOuter
	class PostMeasureHandler extends com.ashera.widget.bus.EventBusHandler {
		private boolean onlyOnce;
		public PostMeasureHandler(String type) {
			super(type);
		}

		@Override
		protected void doPerform(Object payload) {
			if (!onlyOnce || measurableView.isLayoutRequested()) {
				measurableView.autoResizeText();
				onlyOnce = true;
			}
		}
	}
	
	private PostMeasureHandler postMeasureHandler;
	private final String POST_MEASURE_EVENT = StandardEvents.postMeasure.toString();
    private void addAutoResizeListener() {
    	if (postMeasureHandler == null) {
    		postMeasureHandler = new PostMeasureHandler(POST_MEASURE_EVENT);
			fragment.getEventBus().on(POST_MEASURE_EVENT, postMeasureHandler);
    	}
	}

	private void removeResizeListener() {
		if (postMeasureHandler != null) {
			fragment.getEventBus().off(postMeasureHandler);
			postMeasureHandler = null;
		}
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
	


	private void setMaxLength(Object objValue) {
		if (!html) {
			applyAttributeCommand("text", CommonConverters.command_maxlength, new String[] {"maxLength"}, true, objValue);
		} else {
			htmlConfig.put("maxLength", objValue);
		}
	}
    


	private void setMyText(Object objValue) {
		String text = (String) objValue;
		if (text == null) {
			text = "";
		}
		
		if (html) {
			handleHtmlText(text);
		} else {
			nativeSetText(text);
		}
	}

    



	private void setTextAllCaps(Object objValue) {
		if (!html) {
			applyAttributeCommand("text", CommonConverters.command_uppercase, new String[] {"textAllCaps"}, (boolean) objValue);
		} else {
			htmlConfig.put("textAllCaps", objValue);
		}
	}
	


    private MarqueeTask marqueeTask;
	private int marqueeRepeatLimit;
    private MarqueeCommandConverter marqueeCommandConverter;
	
    private int calcNumberOfWhiteSpaces() {
		if (!isLabelMeasured()) {
			return 0;
		}

		float blankSpaceWidth = ((Number) getTextSize()).floatValue();
		int width = getLabelWidth()/3;
		int numberOfBlankSpaces = (int) Math.ceil(width / (blankSpaceWidth * 1f));
		return numberOfBlankSpaces;
	}
	
	private void cancelTimer() {
		cancelNativeTimer();
		if (marqueeTask != null) {
			marqueeTask.cancel();
		}
		if (marqueeCommandConverter != null) {
			marqueeCommandConverter.updateArgs(0, 0);
		}
	}
	private void startTimer() {
		if (canMarquee()) {
			addDeallocHandler();
			if (marqueeTask != null) {
				marqueeTask.restart();
			} else {
				String direction = ViewImpl.isRTLLayoutDirection(this) ? "reverse" : "forward";
				marqueeTask = new MarqueeTask(direction);
			}
			
			schedule();
		}
	}

	@com.google.j2objc.annotations.WeakOuter
	private final class MarqueeTask implements Runnable {
		private int slideLength = 0;
		private int cycles = 0;
		private boolean cancel = false;
		private String direction;
		
		
		private MarqueeTask(String direction) {
			this.direction = direction;
		}

		public void cancel() {
			cancel = true;
		}

		public void restart() {
			cancel = false;
			slideLength = 0;
			cycles = 0;
		}

		@Override
		public void run() {
			int numberOfBlankSpaces = calcNumberOfWhiteSpaces();
			if (marqueeCommandConverter == null) {
				marqueeCommandConverter = (MarqueeCommandConverter) getAttributeCommand("text", CommonConverters.command_marquee, numberOfBlankSpaces, 0, direction);
			}
			slideLength = marqueeCommandConverter.getOffset();
			if (numberOfBlankSpaces > 0) {
				String str = (String) getMyText();
				if (slideLength == str.length()) {
					slideLength = 0;
					cycles++;
				}
				if ((marqueeRepeatLimit > 0 && cycles >= marqueeRepeatLimit)) {
					cancelTimer();
					return;
				}
				slideLength++;

				executeOnMainThread(() -> {
						if (!cancel) {
							applyAttributeCommand("text", CommonConverters.command_marquee, new String[] {"ellipsize"}, true, numberOfBlankSpaces, slideLength, direction);
							schedule();
						}
					
				});
			} else {
				schedule();
			}
		}
	}
	
	private Object getMarqueeRepeatLimit() {
		return marqueeRepeatLimit;
	}
	
	private void setMarqueeRepeatLimit(Object objValue) {
		this.marqueeRepeatLimit = (int) objValue;
	}
	

	private void startOrStopMarquee(Object objValue) {
		cancelTimer();
		if (objValue != null && (boolean) objValue) {
			startTimer();
		}
	}
	
	private int getLabelWidth() {
		if (measurableView.isIgnoreDrawableHeight()) {
			return measurableView.getMeasuredWidth() - measurableView.getPaddingLeft() - measurableView.getPaddingRight(); 
		}
		return measurableView.getMeasuredWidth() - measurableView.getCompoundPaddingRight() - measurableView.getCompoundPaddingLeft();
	}

	private boolean isLabelMeasured() {
		return !isDisposed() && getLabelWidth() > 0;
	}
	


  	private void setPassword(Object objValue) {
  		if (!html) {
  			applyAttributeCommand("text", CommonConverters.command_password, new String[] {"password"}, (boolean) objValue);
  		} else {
  			htmlConfig.put("password", objValue);
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
    		
    		nativeRequestLayout();
    	}
    }
    
    @Override
    public void invalidate() {
    	if (isInitialised()) {
			ViewImpl.invalidate(this, asNativeWidget());

    	}
    }

	
		//end - body
	//start - button
	private HTMLElement button;
	
	private void nativeCreate(Map<String, Object> params) {
		nativeCreateLabel(params);
		createCanvas();
		measurableView.setVerticalAligment(com.ashera.view.BaseMeasurableView.VerticalAligment.top);
		button = org.teavm.jso.dom.html.HTMLDocument.current().createElement("input");
		button.setAttribute("type", getType());
		button.getStyle().setProperty("margin", "0px");
		hTMLElement.appendChild(button);
		measureButtonDrawable();
	}

	private int defaultPadding = 0;
	private int buttonSize = 20;
	private void measureButtonDrawable() {
		r.android.graphics.drawable.Drawable buttonDrawable = measurableView.getButtonDrawable();
		if (buttonDrawable == null) {
			buttonDrawable = new r.android.graphics.drawable.Drawable();
		}
		buttonDrawable.setMinimumWidth(buttonSize + defaultPadding);
		buttonDrawable.setMinimumHeight(buttonSize);
		measurableView.setButtonDrawable(buttonDrawable);
	}
	
	//start - postSetAttribute
	private void postSetAttribute(WidgetAttribute key, String strValue, Object objValue,
			ILifeCycleDecorator decorator) {
		switch (key.getAttributeName()) {
		case "editable":
			measurableView.setEnabled((boolean) objValue);
		case "enabled":
			if ((boolean) objValue) {
				button.removeAttribute("disabled");
			} else {
				button.setAttribute("disabled", "disabled");
			}
			break;
		case "drawableTop":
		case "drawableBottom":
		case "drawableLeft":
		case "drawableRight":
		case "drawableStart":
		case "drawableEnd":
			if (isInitialised()) {
				addClickListenerToSyncCheckbox();
			}
			break;
			
		default:
			break;
		}
	}
	//end - postSetAttribute
	
	//start - checked
	@org.teavm.jso.JSBody(params = { "input", "val" }, script = "input.checked = val;")
    private static native void setButtonChecked(org.teavm.jso.dom.html.HTMLElement input, boolean val);
	@org.teavm.jso.JSBody(params = { "input" }, script = "return input.checked;")
    private static native boolean isButtonChecked(org.teavm.jso.dom.html.HTMLElement input);
	
	private void setChecked(Object objValue) {
		setButtonChecked(button, (boolean) objValue);
		measurableView.setChecked((boolean)objValue);
	}
	
	private void setOnChecked(Object objValue) {
		ViewImpl.setOnListener(this, button, (e) -> {
			if (measurableView.isEnabled()) {
				measurableView.toggle();
			}
		}, "change", "change");
		CompoundButton.OnCheckedChangeListener onCheckedChangeListener; 
		
		if (objValue instanceof String) {
			onCheckedChangeListener = new OnCheckedChangeListener(this, (String) objValue);
		} else {
			onCheckedChangeListener = (CompoundButton.OnCheckedChangeListener) objValue;
		}
		measurableView.setOnCheckedChangeListener(onCheckedChangeListener);
	}
	
	private Object getChecked() {
		return isButtonChecked(button);
	}
	//end - checked

	//start - sync
	@org.teavm.jso.JSBody(params = { "input" }, script = "input.dispatchEvent(new Event('change'));")
    private static native boolean triggerChangeEvent(org.teavm.jso.dom.html.HTMLElement input);

	private void addClickListenerToSyncCheckbox() {
		HTMLElement[] elements = {label, drawableBottom, drawableLeft, drawableRight, drawableTop};
		int i = 0;
		for (HTMLElement htmlElement : elements) {
			if (htmlElement != null) {
				ViewImpl.setOnListener(this, htmlElement, (event) -> {
					if (measurableView.isEnabled()) {
						boolean isChecked = (boolean)getChecked();
						if (!isChecked || (isChecked && allowUnCheck())) {
							setButtonChecked(button, !isChecked);
							triggerChangeEvent(button);
						}
					}
				}, "click" + i, "click");
			}
			i++;
		}
		
	}
	

	@Override
	public void initialized() {
		super.initialized();
		
		addClickListenerToSyncCheckbox();
	}
	//end - sync

	private void createCanvas() {
		canvas = new r.android.graphics.Canvas() {
			@Override
			public void draw(r.android.graphics.drawable.Drawable drawable) {
				ViewImpl.updateBounds(button, drawable.getLeft() + (defaultPadding/2), drawable.getTop(), drawable.getRight() - drawable.getLeft(), drawable.getBottom() - drawable.getTop());
			}
	
			@Override
			public void reset() {
				
			}
		};
	}

	private void setButtonPadding(Object objValue) {
		button.getStyle().setProperty("padding", objValue + "px");
		button.getStyle().setProperty("margin-left", objValue + "px");		
	}

	private void setButtonSize(Object objValue) {
		this.buttonSize = (int) objValue;
		measureButtonDrawable();
	}

	//end - button	

	private boolean allowUnCheck() {
		return true;
	}


	private String getType() {
		return "checkbox";
	}

	private void setError(Object object) {
		
	}

	@Override
	public String getTextEntered() {
		return isButtonChecked(button) ? "checked" : "";
	}

	@Override
	public boolean isViewVisible() {
		return measurableView.getVisibility() == View.VISIBLE;
	}

	@Override
	public void focus() {
		hTMLElement.focus();
	}
	
	@Override
	public int measureWidth() {
		return windowNativeMeasureWidth(label) + measurableView.getButtonDrawable().getMinimumWidth();
	}
}
