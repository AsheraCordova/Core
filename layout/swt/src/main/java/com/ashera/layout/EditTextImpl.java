package com.ashera.layout;
//start - imports

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import r.android.content.Context;


import org.eclipse.swt.widgets.*;
import org.eclipse.swt.graphics.*;
import androidx.core.view.*;
import static com.ashera.common.DisposeUtil.*;

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
@SuppressLint("NewApi")
public class EditTextImpl extends BaseWidget implements IDrawable, IHasMultiNativeWidgets, ICustomMeasureHeight, ICustomMeasureWidth, com.ashera.validations.FormElement {
	//start - body
	public final static String LOCAL_NAME = "EditText"; 
	public final static String GROUP_NAME = "EditText";

	protected org.eclipse.swt.widgets.Text text;
	protected r.android.widget.EditText measurableView;	
	
		@SuppressLint("NewApi")
		final static class TintMode extends AbstractEnumToIntConverter{
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
	
	@Override
	public void loadAttributes(String attributeName) {
		ViewImpl.register(attributeName);


		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtDoubleClickEnabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtEditable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtMessage").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtOrientation").withType("swtbitflag"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtRedraw").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtTabs").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtText").withType("resourcestring").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("text").withType("resourcestring").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtTextLimit").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxLength").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtTopIndex").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTint").withType("colorstate").withOrder(-10));
		ConverterFactory.register("EditText.tintMode", new TintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTintMode").withType("EditText.tintMode").withOrder(-10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("firstBaselineToTopHeight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lastBaselineToBottomHeight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableIconSize").withType("dimension").withOrder(-1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("padding").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingBottom").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingRight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingLeft").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingStart").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingEnd").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingTop").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingHorizontal").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingVertical").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minLines").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("lines").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxLines").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minWidth").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minHeight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxWidth").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxHeight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("height").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("width").withType("dimension"));
		ConverterFactory.register("EditText.font", new Font());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("typeface").withType("EditText.font").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		ConverterFactory.register("EditText.textStyle", new TextStyle());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textStyle").withType("EditText.textStyle").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("fontFamily").withType("font").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textSize").withType("dimensionsp").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("password").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textAllCaps").withType("boolean").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("selectAllOnFocus").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("selectAll").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtSelection").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textColorHint").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("singleLine").withType("boolean").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		ConverterFactory.register("EditText.numeric", new Numeric());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("numeric").withType("EditText.numeric"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("digits").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hint").withType("resourcestring").withOrder(900).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hintTextFormat").withType("resourcestring").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("gravity").withType("gravity").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableStart").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableEnd").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTop").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableBottom").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawablePadding").withType("dimension").withOrder(1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxEms").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minEms").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("ems").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("enabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("editable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scrollHorizontally").withType("boolean").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onTextChange").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onbeforeTextChange").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onafterTextChange").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtUseTabForNavigation").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("setFocus").withType("boolean"));
	WidgetFactory.registerConstructorAttribute(localName, new WidgetAttribute.Builder().withName("swtTextStyle").withType("string"));
		loadCustomAttributes(attributeName);
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

		
	public class EditTextExt extends r.android.widget.EditText implements ILifeCycleDecorator{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		private List<IWidget> overlays;
		public IWidget getWidget() {
			return EditTextImpl.this;
		}

		public EditTextExt() {
			super(EditTextImpl.this);
			
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
			ViewImpl.setDrawableBounds(EditTextImpl.this, l, t, r, b);
			if (!isOverlay()) {
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			}
			replayBufferedEvents();
	        ViewImpl.redrawDrawables(EditTextImpl.this);
	        overlays = ViewImpl.drawOverlay(EditTextImpl.this, overlays);
			
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
        		ViewImpl.drawableStateChanged(EditTextImpl.this);
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
    		
    		IWidget widget = template.loadLazyWidgets(EditTextImpl.this.getParent());
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
        	EditTextImpl.this.getParent().remove(EditTextImpl.this);
		}
        @Override
        public void getLocationOnScreen(int[] appScreenLocation) {
        	org.eclipse.swt.widgets.Control control = (org.eclipse.swt.widgets.Control) asNativeWidget();
			appScreenLocation[0] = control.toDisplay(0, 0).x;
        	appScreenLocation[1] = control.toDisplay(0, 0).y;
        }
        @Override
        public void getWindowVisibleDisplayFrame(r.android.graphics.Rect displayFrame){
        	org.eclipse.swt.widgets.Shell shell = ((org.eclipse.swt.widgets.Control)asNativeWidget()).getShell();
        	displayFrame.left = shell.toDisplay(0, 0).x ;
			displayFrame.top = shell.getShell().toDisplay(0, 0).y ;
        	displayFrame.bottom = displayFrame.top + shell.getClientArea().height;
        	displayFrame.right = displayFrame.left + shell.getBounds().width;
        	
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
			EditTextImpl.this.setAttribute(name, value, !(value instanceof String));
		}
        @Override
        public void setVisibility(int visibility) {
            super.setVisibility(visibility);
            org.eclipse.swt.widgets.Control control = ((org.eclipse.swt.widgets.Control)asNativeWidget());
            if (!control.isDisposed()) {
            	control.setVisible(View.VISIBLE == visibility);
            }
            
        }
		  public int getBorderPadding(){
		    return EditTextImpl.this.getBorderPadding();
		  }

		  public int getLineHeight(){
		    return EditTextImpl.this.getLineHeight();
		  }

		  public int getBorderWidth(){
		    return EditTextImpl.this.getBorderWidth();
		  }
		  public int getLineHeightPadding(){
		    return EditTextImpl.this.getLineHeightPadding();
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
        	return nativeMeasureHeight(text, (int) width);
    	}
		@Override
		public java.lang.String getText() {
			return (String) getMyText();
		}

        
    	public void setState0(Object value) {
    		ViewImpl.setState(EditTextImpl.this, 0, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(EditTextImpl.this, 1, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(EditTextImpl.this, 2, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(EditTextImpl.this, 3, value);
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
		measurableView = new EditTextExt();
		nativeCreate(params);	
		ViewImpl.registerCommandConveter(this);
	}

	@Override
	@SuppressLint("NewApi")
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		Object nativeWidget = asNativeWidget();
		ViewImpl.setAttribute(this,  key, strValue, objValue, decorator);
		
		switch (key.getAttributeName()) {
			case "swtDoubleClickEnabled": {
				


		 text.setDoubleClickEnabled((boolean)objValue);



			}
			break;
			case "swtEditable": {
				


		 text.setEditable((boolean)objValue);



			}
			break;
			case "swtMessage": {
				


		 text.setMessage((String)objValue);



			}
			break;
			case "swtOrientation": {
				


		 text.setOrientation((int)objValue);



			}
			break;
			case "swtRedraw": {
				


		 text.setRedraw((boolean)objValue);



			}
			break;
			case "swtTabs": {
				


		 text.setTabs((int)objValue);



			}
			break;
			case "text":
			case "swtText": {
				


		 text.setText((String)objValue);



			}
			break;
			case "maxLength":
			case "swtTextLimit": {
				


		 text.setTextLimit((int)objValue);



			}
			break;
			case "swtTopIndex": {
				


		 text.setTopIndex((int)objValue);



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
			case "firstBaselineToTopHeight": {
				


		setFirstBaselineToTopHeight(objValue);



			}
			break;
			case "lastBaselineToBottomHeight": {
				


		setLastBaselineToBottomHeight(objValue);



			}
			break;
			case "drawableIconSize": {
				


		setDrawableIconSize(objValue);



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
			case "textSize": {
				


		setMyTextSize(objValue);



			}
			break;
			case "textColor": {
				


		setTextColor(objValue);



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
			case "swtSelection": {
				


	text.setSelection((int)objValue);



			}
			break;
			case "textColorHint": {
				


		 setHintColor(objValue);



			}
			break;
			case "singleLine": {
				


		 setSingleLine(objValue);



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
			case "hintTextFormat": {
				


		setHintTextFormat(objValue);



			}
			break;
			case "gravity": {
				


		 setGravity(objValue); 



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
			case "enabled": {
				


		 setEnabled(objValue);



			}
			break;
			case "editable": {
				


		 setEnabled(objValue);



			}
			break;
			case "scrollHorizontally": {
				


		 setScrollHorizontally(objValue);



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
			case "swtUseTabForNavigation": {
				


		 setUseTabForNavigation(objValue);



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
		Object nativeWidget = asNativeWidget();
		Object attributeValue = ViewImpl.getAttribute(this, nativeWidget, key, decorator);
		if (attributeValue != null) {
			return attributeValue;
		}
		switch (key.getAttributeName()) {
			case "swtDoubleClickEnabled": {
return text.getDoubleClickEnabled();				}
			case "swtEditable": {
return text.getEditable();				}
			case "swtMessage": {
return text.getMessage();				}
			case "swtOrientation": {
return text.getOrientation();				}
			case "swtTabs": {
return text.getTabs();				}
			case "text":
			case "swtText": {
return text.getText();				}
			case "maxLength":
			case "swtTextLimit": {
return text.getTextLimit();				}
			case "swtTopIndex": {
return text.getTopIndex();				}
			case "firstBaselineToTopHeight": {
return getFirstBaselineToTopHeight();				}
			case "lastBaselineToBottomHeight": {
return getLastBaselineToBottomHeight();				}
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
			case "textSize": {
return getTextSize();				}
			case "textColor": {
return getTextColor();				}
			case "swtSelection": {
return text.getSelection().y;				}
			case "hint": {
return getHint();				}
			case "gravity": {
return getGravity();				}
			case "drawablePadding": {
return this.getDrawablePadding();				}
			case "onTextChange": {
return this.textWatchers == null ? null:this.textWatchers.get(key.getAttributeName());				}
		}
		
		return null;
	}
	
	@Override
	public Object asWidget() {
		return measurableView;
	}

	

	private Object getPaddingBottom() {
		return measurableView.getPaddingBottom();
	}
	
	private Object getPaddingTop() {
		return measurableView.getPaddingTop();
	}

	private Object getPaddingRight() {
		return measurableView.getPaddingRight();
	}
	
	private Object getPaddingLeft() {
		return measurableView.getPaddingLeft();
	}
	
	private Object getPaddingEnd() {
		return getPaddingRight();
	}
	
	private Object getPaddingStart() {
		return getPaddingLeft();
	}
	
    private void setPaddingVertical(Object objValue) {
    	setPaddingBottom(objValue);
    	setPaddingTop(objValue);
    }

    private void setPaddingHorizontal(Object objValue) {
    	setPaddingRight(objValue);
    	setPaddingLeft(objValue);
    }

	private void setPaddingTop(Object objValue) {
		ViewImpl.setPaddingTop(objValue, measurableView);
	}

	private void setPaddingEnd(Object objValue) {
		ViewImpl.setPaddingRight(objValue, measurableView);
	}

	private void setPaddingStart(Object objValue) {
		ViewImpl.setPaddingLeft(objValue, measurableView);
	}

	private void setPaddingLeft(Object objValue) {
		ViewImpl.setPaddingLeft(objValue, measurableView);
	}

	private void setPaddingRight(Object objValue) {
		ViewImpl.setPaddingRight(objValue, measurableView);
	}

	private void setPaddingBottom(Object objValue) {
		ViewImpl.setPaddingBottom(objValue, measurableView);
	}

    private void setPadding(Object objValue) {
    	setPaddingBottom(objValue);
    	setPaddingTop(objValue);
    	setPaddingRight(objValue);
    	setPaddingLeft(objValue);
    }

    


    private Label drawableTop;
    private Label drawableBottom;
    private Label drawableRight;
	
    @Override
	public void drawableStateChanged() {
    	super.drawableStateChanged();
		drawableStateChange(drawableBottom, measurableView.getBottomDrawable(), "drawableBottom");
		drawableStateChange(drawableLeft, measurableView.getLeftDrawable(), "drawableStart");
		drawableStateChange(drawableRight, measurableView.getRightDrawable(), "drawableEnd");
		drawableStateChange(drawableTop, measurableView.getTopDrawable(), "drawableTop");
		
		if (measurableView.getTextColors() != null) {
			setTextColor(measurableView.getCurrentTextColor());
		}
		
		if (drawableTint != null && drawableTint.isStateful()) {
			setDrawableTint(drawableTint);
		}
		drawableStateChangedAdditional();
	}
    
	private void drawableStateChange(Label mydrawable, r.android.graphics.drawable.Drawable dr, String attribute) {
		if (mydrawable != null) {
			final int[] state = measurableView.getDrawableState();
			
			if (dr != null && dr.isStateful() && dr.setState(state)) {
				int width = mydrawable.getBounds().width;
				int height = mydrawable.getBounds().height;
				if (width != 0 && height != 0) { 
					Image image = (Image) dr.getDrawable();
					if (image.getImageData().width != width && image.getImageData().height != height) {
						Image resizedImage = com.ashera.common.ImageUtils.resize(image, width, height, 
								new com.ashera.common.ImageUtils.ResizeOptions.Builder().initFromAttr(this, attribute).build());
						image.dispose();
						image = resizedImage;
						dr.setDrawable(resizedImage);
						fragment.addDisposable(resizedImage);
					}
					mydrawable.setImage(image);
				}
			}
		}
	}
    //start - leftdrawable
	private void setDrawableTintMode(Object value) {
		applyAttributeCommand("drawableStart", "tintColor", "drawableTintMode", value);
		applyAttributeCommand("drawableEnd", "tintColor", "drawableTintMode", value);
		applyAttributeCommand("drawableTop", "tintColor", "drawableTintMode", value);
		applyAttributeCommand("drawableBottom", "tintColor", "drawableTintMode", value);
	}

	//start - iconsize
	private void setDrawableIconSize(Object objValue) {
		applyAttributeCommand("drawableStart", "drawableIconSize", new String[] {"drawableIconSize"}, true, objValue);
		applyAttributeCommand("drawableEnd", "drawableIconSize", new String[] {"drawableIconSize"}, true, objValue);
		applyAttributeCommand("drawableTop", "drawableIconSize", new String[] {"drawableIconSize"}, true, objValue);
		applyAttributeCommand("drawableBottom", "drawableIconSize", new String[] {"drawableIconSize"}, true, objValue);
	}
	//end - iconsize
	private r.android.content.res.ColorStateList drawableTint; 
	private void setDrawableTint(Object objValue) {
		if (objValue instanceof r.android.content.res.ColorStateList) {
			r.android.content.res.ColorStateList colorStateList = (r.android.content.res.ColorStateList) objValue;
			this.drawableTint = colorStateList;
			objValue = drawableTint.getColorForState(measurableView.getDrawableState(), r.android.graphics.Color.RED);
		}
		
		Object color = ViewImpl.getColor(objValue);

		applyAttributeCommand("drawableStart", "tintColor", "drawableTint", color);
		applyAttributeCommand("drawableEnd", "tintColor", "drawableTint", color);
		applyAttributeCommand("drawableTop", "tintColor", "drawableTint", color);
		applyAttributeCommand("drawableBottom", "tintColor", "drawableTint", color);
		
	}
	private void applyAttributeCommand(String sourceName, String commandName, String attribute, Object value) {
		applyAttributeCommand(sourceName, commandName, new String[] {attribute}, true, value);
	}
	
    private Label drawableLeft;

	private r.android.graphics.drawable.Drawable getDrawable(Object objValue) {
		r.android.graphics.drawable.Drawable drawable = new r.android.graphics.drawable.Drawable();
		drawable.setMinimumWidth(getImageWidth(objValue));
		drawable.setMinimumHeight(getImageHeight(objValue));
		return drawable;
	}
	
	private int getImageHeight(Object objValue) {
		return ((Image) objValue).getBounds().height;
	}
	
	private int getImageWidth(Object objValue) {
		return ((Image) objValue).getBounds().width;
	}

    //end - leftdrawable
    
	private void setDrawableLeft(Object objValue) {
		if (objValue instanceof r.android.graphics.drawable.Drawable) {
			r.android.graphics.drawable.Drawable drawable = (r.android.graphics.drawable.Drawable) objValue;
			
			if (drawable.hasDrawable()) {
				if (drawableLeft == null) {
					// create left
					this.drawableLeft = new Label(wrapperComposite, org.eclipse.swt.SWT.NONE);
					drawableLeft.addDisposeListener((e) -> disposeAll(drawableLeft.getImage()));
				}
				
				measurableView.setLeftDrawable(drawable);
				if (!drawable.isRecycleable()) {
					disposeAll(drawableLeft.getImage());
				}
				setImageOrColorOnDrawable(drawableLeft, drawable, drawable.getTintColor(), drawable.getTintMode(), "drawableStart");
			}
		} else {
			measurableView.setLeftDrawable(null);
			// null case
			if (drawableLeft != null) {
				drawableLeft.dispose();
				drawableLeft = null;
			}
		}
	}

	private void setDrawableRight(Object objValue) {		
		if (objValue instanceof r.android.graphics.drawable.Drawable) {
			r.android.graphics.drawable.Drawable drawable = (r.android.graphics.drawable.Drawable) objValue;

			if (drawable.hasDrawable()) {
				if (drawableRight == null) {
					// create right
					this.drawableRight = new Label(wrapperComposite, org.eclipse.swt.SWT.NONE);
					drawableRight.addDisposeListener((e) -> disposeAll(drawableRight.getImage()));
				}
	
				measurableView.setRightDrawable(drawable);
				if (!drawable.isRecycleable()) {
					disposeAll(drawableRight.getImage());
				}
				setImageOrColorOnDrawable(drawableRight,  drawable, drawable.getTintColor(), drawable.getTintMode(), "drawableEnd");
			}
		} else {
			measurableView.setRightDrawable(null);
			// null case
			if (drawableRight != null) {
				drawableRight.dispose();
				drawableRight = null;
			}
		}
	}
	
	private void setImageOrColorOnDrawable(Label control, r.android.graphics.drawable.Drawable drawable, Object tintColor, String tintMode, String attribute) {
		Object imageOrColor = drawable.getDrawable();
		if (imageOrColor instanceof Color) {
			control.setBackground((Color)imageOrColor);
		} else {
			control.setBackground(null);
		}
		if (imageOrColor instanceof Image) {
			if (tintColor != null) {
				if (tintColor instanceof r.android.content.res.ColorStateList) {
					tintColor = ((r.android.content.res.ColorStateList)tintColor).getColorForState(measurableView.getDrawableState(), r.android.graphics.Color.RED);
					tintColor = ViewImpl.getColor(tintColor);
				}
				imageOrColor = com.ashera.common.ImageUtils.tintImage((Image) imageOrColor, (Color) tintColor, tintMode);
				fragment.addDisposable(imageOrColor);
			}
			
			if (drawable.getMinimumWidth() != 0 && drawable.getMinimumHeight() != 0 
					&& ((Image) imageOrColor).getImageData().width != drawable.getMinimumWidth() && ((Image) imageOrColor).getImageData().height != drawable.getMinimumHeight()) {
				imageOrColor = com.ashera.common.ImageUtils.resize((Image) imageOrColor, drawable.getMinimumWidth(), drawable.getMinimumHeight(), 
						new com.ashera.common.ImageUtils.ResizeOptions.Builder().initFromAttr(this, attribute).build());
				fragment.addDisposable(imageOrColor);
			}
			control.setImage((Image) imageOrColor);
		} else {
			control.setImage(null);
		}
	}

	private void setDrawableBottom(Object objValue) {
				if (objValue instanceof r.android.graphics.drawable.Drawable) {
			r.android.graphics.drawable.Drawable drawable = (r.android.graphics.drawable.Drawable) objValue;
			if (drawable.hasDrawable()) {
				measurableView.setBottomDrawable(drawable);
			
				if (drawableBottom == null) {
					// create bottom
					this.drawableBottom = new Label(wrapperComposite, org.eclipse.swt.SWT.NONE);
					drawableBottom.addDisposeListener((e) -> disposeAll(drawableBottom.getImage()));
				}
				
				if (!drawable.isRecycleable()) {
					disposeAll(drawableBottom.getImage());
				}
				setImageOrColorOnDrawable(drawableBottom, drawable, drawable.getTintColor(), drawable.getTintMode(), "drawableStart");
			} else {
				measurableView.setBottomDrawable(null);
				// null case
				if (drawableBottom != null) {
					drawableBottom.dispose();
					drawableBottom = null;
				}
			}
		}
	}

	private void setDrawableTop(Object objValue) {
		if (objValue instanceof r.android.graphics.drawable.Drawable) {
			r.android.graphics.drawable.Drawable drawable = (r.android.graphics.drawable.Drawable) objValue;

			if (drawable.hasDrawable()) {
				if (drawableTop == null) {
					// create top
					this.drawableTop = new Label(wrapperComposite, org.eclipse.swt.SWT.NONE);
					drawableTop.addDisposeListener((e) -> disposeAll(drawableTop.getImage()));
				}
				
	
				measurableView.setTopDrawable(drawable);
				if (!drawable.isRecycleable()) {
					disposeAll(drawableTop.getImage());
				}
				setImageOrColorOnDrawable(drawableTop,  drawable, drawable.getTintColor(), drawable.getTintMode(), "drawableTop");
			} else {
				measurableView.setTopDrawable(null);
				// null case
				if (drawableTop != null) {
					drawableTop.dispose();
					drawableTop = null;
				}
			}
		}
	}

	private void setDrawablePadding(Object objValue) {
		measurableView.setDrawablePadding((int) objValue);
	}
	
	private Object getDrawablePadding() {
		return measurableView.getDrawablePadding();
	}
	
	@Override
	public Control getControl() {
		return text;
	}

	@Override
	public Control getDrawableTop() {
		return drawableTop;
	}

	@Override
	public Control getDrawableLeft() {
		return drawableLeft;
	}

	@Override
	public Control getDrawableRight() {
		return drawableRight;
	}

	@Override
	public Control getDrawableBottom() {
		return drawableBottom;
	}
    


    //start - variables
    private org.eclipse.swt.graphics.Font newFont;
	private static final int ITALIC_FONT_TRAIT = org.eclipse.swt.SWT.ITALIC;
	private static final int BOLD_FONT_TRAIT = org.eclipse.swt.SWT.BOLD;
	private static final int NORMAL_FONT_TRAIT = org.eclipse.swt.SWT.NORMAL;
	//end - variables
	//start - code3
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
	//end - code3
    //start - nativefont
    private FontData[] getFontData() {
    	FontData[] fontData = this.newFont == null ? text.getFont().getFontData() : this.newFont.getFontData();
    	return fontData;
    }
	private int nativeGetFontSize() {
		FontData[] fontData = getFontData();
        int height = fontData[0].getHeight();
		return height;
	}

	private int nativeGetFontStyle() {
		FontData[] fontData = getFontData();
        int style = fontData[0].getStyle();
		return style;
	}

	private void nativeSetCustomFont(int height, com.ashera.model.FontDescriptor fontDescriptor) {
		final org.eclipse.swt.graphics.Font newFont = new org.eclipse.swt.graphics.Font(Display.getDefault(), fontDescriptor.getName(), height, fontDescriptor.getStyle());
		setFont(newFont);
	}

	private void nativeSetFontStyle(int style) {
		FontData[] fontData = getFontData();
		for(int i = 0; i < fontData.length; ++i) {
		    fontData[i].setStyle(style);
		}

		final org.eclipse.swt.graphics.Font newFont = new org.eclipse.swt.graphics.Font(Display.getDefault(), fontData);
		setFont(newFont);
	}

    private void setFont(final org.eclipse.swt.graphics.Font newFont) {
        disposeAll(this.newFont);
        this.newFont = newFont;
        text.setFont(newFont);
    }

    private void setMyTextSize(Object objValue) {
        FontData[] fontData = getFontData();
        for(int i = 0; i < fontData.length; ++i) {
            float fontSize = ((float) objValue) * getFragment().getRootActivity().getScaleFactor();
			fontData[i].setHeight((int) fontSize);
        }

        final org.eclipse.swt.graphics.Font newFont = new org.eclipse.swt.graphics.Font(Display.getDefault(), fontData);
        setFont(newFont);
    }
    
	
	private Object getTextSize() {
		return getFontData()[0].getHeight();
	}
    //end - nativefont
    
	
	private void setTextColor(Object objValue) {
		if (objValue instanceof r.android.content.res.ColorStateList) {
			r.android.content.res.ColorStateList colorStateList = (r.android.content.res.ColorStateList) objValue;
			measurableView.setTextColor(colorStateList);
			objValue = measurableView.getCurrentTextColor();
		}
		
		text.setForeground((Color)ViewImpl.getColor(objValue));
	}

	private Object getTextColor() {
		return measurableView.getTextColors();
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

    
    


	private void setEnabled(Object objValue) {
		text.setEnabled((boolean) objValue);
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

	


	private static final int TEXT_ALIGN_CENTER = org.eclipse.swt.SWT.CENTER;
	private static final int TEXT_ALIGN_LEFT = org.eclipse.swt.SWT.LEFT;
	private static final int TEXT_ALIGN_RIGHT = org.eclipse.swt.SWT.RIGHT;
	


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
	public int getStyle(String key, int initStyle, Map<String, Object> params, IFragment fragment) {
		if (params == null) {
    		return initStyle;
    	}
    	Object style = params.get(key);
		if (style == null) {
			return initStyle;
		}
		int convertFrom = (int) ConverterFactory.get("swtbitflag").convertFrom(style.toString(), null, fragment);
		return convertFrom;
	}
	
	public int getStyle(Map<String, Object> params, IFragment fragment) {
		return getStyle("swtStyle", org.eclipse.swt.SWT.NONE, params, fragment);
	}
	
	public int getStyle(int initStyle, Map<String, Object> params, IFragment fragment) {
		return getStyle("swtStyle", initStyle, params, fragment);
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
	public boolean isWidgetDisposed() {
		return text.isDisposed();
	}

	
		//end - body
	//start - codecopy
	private Composite wrapperComposite;
	
    @Override
    public Object asNativeWidget() {
        return wrapperComposite;
    }

    private void nativeCreate(Map<String, Object> params) {
    	Composite parent = (Composite) ViewImpl.getParent(this);
		wrapperComposite = new DrawableComposite(parent, this, getStyle(params, fragment));
		wrapperComposite.setLayout(new org.eclipse.nebula.widgets.layout.AbsoluteLayout());
		
		// create text
		text = new Text(wrapperComposite,  getStyle("swtTextStyle",  org.eclipse.swt.SWT.MULTI | org.eclipse.swt.SWT.WRAP, params, fragment));
		wrapperComposite.addMouseListener(new org.eclipse.swt.events.MouseListener() {

			@Override
			public void mouseDoubleClick(org.eclipse.swt.events.MouseEvent e) {
				
			}

			@Override
			public void mouseDown(org.eclipse.swt.events.MouseEvent e) {
				
			}

			@Override
			public void mouseUp(org.eclipse.swt.events.MouseEvent e) {
				text.forceFocus();
			}
			
		});
		wrapperComposite.setBackground(text.getBackground());	
        text.addDisposeListener((e) -> disposeAll(newFont));
        registerCommandAttrs();
        registerForAttributeCommandChain("hint");
		registerForAttributeCommandChain("drawableStart");
		registerForAttributeCommandChain("drawableTop");
		registerForAttributeCommandChain("drawableBottom");
		registerForAttributeCommandChain("drawableEnd");
	}

	private void loadCustomAttributes(String attributeName) {
        
    }
	
	private final class TextAllCapsListener implements org.eclipse.swt.events.VerifyListener {
        public void verifyText(org.eclipse.swt.events.VerifyEvent e) {
            e.text = com.ibm.icu.lang.UCharacter.toUpperCase(e.text.toUpperCase());
        }
    }
    private TextAllCapsListener textAllCapsListener;
    
    private void setTextAllCaps(Object objValue) {
        if (objValue != null && (boolean) objValue) {
            text.setText(com.ibm.icu.lang.UCharacter.toUpperCase(text.getText()));
            if (textAllCapsListener == null) {
                this.textAllCapsListener = new TextAllCapsListener(); 
                text.addVerifyListener(this.textAllCapsListener);
            }
        } else {
            if (this.textAllCapsListener != null) {
                text.removeVerifyListener(this.textAllCapsListener);
                this.textAllCapsListener = null;
            }
        }
    }
    
    
    private void setSelectAll(Object objValue) {
        if (objValue != null && (boolean) objValue) {
            text.forceFocus();
            text.selectAll();
        }
    }
    private final class SelectOnFocusListener implements Listener {
        public void handleEvent(org.eclipse.swt.widgets.Event event) {
            text.selectAll();
        }
    }

    private SelectOnFocusListener selectOnFocusListener;

    private void setSelectAllOnFocus(Object objValue) {

        if (objValue != null && (boolean) objValue) {
            if (selectOnFocusListener == null) {
                this.selectOnFocusListener = new SelectOnFocusListener(); 
                text.addListener(org.eclipse.swt.SWT.FocusIn, this.selectOnFocusListener);
                text.addListener(org.eclipse.swt.SWT.MouseUp, this.selectOnFocusListener);
            }
        } else {
            if (this.selectOnFocusListener != null) {
                text.removeListener(org.eclipse.swt.SWT.FocusIn,this.selectOnFocusListener);
                text.removeListener(org.eclipse.swt.SWT.MouseUp,this.selectOnFocusListener);
                this.selectOnFocusListener = null;
            }
        }
    }

    private void setPasswordType(Object objValue) {
        if (objValue != null && (boolean) objValue) {
            text.setEchoChar('*');
        } else {
            text.setEchoChar((char) 0);
        }
    }
    
    // numeric / decimal / digit masks - start
    private final class NumericListener implements org.eclipse.swt.events.VerifyListener {
    	private java.util.regex.Pattern pattern;
    	public NumericListener(java.util.regex.Pattern pattern) {
			this.pattern = pattern;
		}
        public void verifyText(org.eclipse.swt.events.VerifyEvent e) {
        	final String oldS = text.getText();
            final String newS = oldS.substring(0, e.start) + e.text + oldS.substring(e.end);
            java.util.regex.Matcher matcher = pattern.matcher(newS);
        	e.doit = matcher.matches();
        }

    }
    private NumericListener numericListener;

	private void addNumericListener(java.util.regex.Pattern pattern) {
		this.numericListener = new NumericListener(pattern);
		text.addVerifyListener(this.numericListener);
	}

	private void removeNumericListener() {
		if (this.numericListener != null) {
			text.removeVerifyListener(this.numericListener);
		}
	}
	
	 private String stripBidiControls(String sign) {
        // For the sake of simplicity, we operate on code units, since all bidi controls are
        // in the BMP. We also expect the string to be very short (almost always 1 character), so we
        // don't need to use StringBuilder.
        String result = "";
        for (int i = 0; i < sign.length(); i++) {
            final char c = sign.charAt(i);
            if (!com.ibm.icu.lang.UCharacter.hasBinaryProperty(c, com.ibm.icu.lang.UProperty.BIDI_CONTROL)) {
                if (result.isEmpty()) {
                    result = String.valueOf(c);
                } else {
                    // This should happen very rarely, only if we have a multi-character sign,
                    // or a sign outside BMP.
                    result += c;
                }
            }
        }
        return result;
    }

	private String getPlusString() {
		com.ibm.icu.text.DecimalFormatSymbols symbols = com.ibm.icu.text.DecimalFormatSymbols.getInstance(locale);
        final String plusString = stripBidiControls(symbols.getPlusSignString());
		return plusString;
	}

	private String getMinusString() {
		com.ibm.icu.text.DecimalFormatSymbols symbols = com.ibm.icu.text.DecimalFormatSymbols.getInstance(locale);
		final String minusString = stripBidiControls(symbols.getMinusSignString());
		return minusString;
	}
	

	private String getDecimalCharacter() {
		com.ibm.icu.text.DecimalFormatSymbols symbols = com.ibm.icu.text.DecimalFormatSymbols.getInstance(locale);

		 final String separatorString = symbols.getDecimalSeparatorString();
		return separatorString;
	}


	private String[] getDigitStrings() {
		final String[] digits = com.ibm.icu.text.DecimalFormatSymbols.getInstance(locale).getDigitStrings();
		return digits;
	}
	
	//start - digits
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
    
    //end - digits
    // numeric / decimal / digit masks - end
    //start - minmax
    private MinMaxListener minMaxListener;
    private final class MinMaxListener implements Listener {
        @Override
        public void handleEvent(org.eclipse.swt.widgets.Event event) {
            if (fragment.isViewLoaded()) {
                wrapperComposite.requestLayout();
                measurableView.requestLayout();
                fragment.remeasure();

            }
        }
    };
	private void addMinMaxListener() {
		if (minMaxListener == null) {
			this.minMaxListener = new MinMaxListener();
			text.addListener(org.eclipse.swt.SWT.Resize, minMaxListener);
	        text.addListener(org.eclipse.swt.SWT.Modify, minMaxListener);
		}
	}
    //end - minmax
	public void nativeRequestLayout() {
		wrapperComposite.requestLayout();
	}
	
	//start - lineheight
	private int getBorderWidth() {
		return wrapperComposite.getBorderWidth();
	}
    
    private int getLineHeight() {
        return text.getLineHeight();
    }
    
    private int getLineHeightPadding() {
    	if (com.ashera.common.OperatingSystem.isOSX()) {
    		return 2;
    	}
        return 0;
    }
    
    private int getBorderPadding() {
    	if (com.ashera.common.OperatingSystem.isOSX()) {
    		return 2;
    	}
        return 0;
    }
    //end - lineheight
    
    //start - hint
    private String hint;
    private Text placeholder;
    private void createPlaceHolder(String hint) {
    	if (placeholder == null) {
	    	placeholder = new Text(wrapperComposite,  getStyle("swtTextStyle",  org.eclipse.swt.SWT.MULTI | org.eclipse.swt.SWT.WRAP, params, fragment));
	    	placeholder.moveAbove(text);
	    	placeholder.addFocusListener(new org.eclipse.swt.events.FocusAdapter() {
	    		@Override
	    		public void focusGained(org.eclipse.swt.events.FocusEvent e) {
	    			placeholder.setVisible(false);
	    			PluginInvoker.postDelayed(() -> {
	    				if (!text.isDisposed()) {
	    					text.forceFocus();
	    				}
	    			}, 0);
	    			
	    		}
	    	});
	    	
	    	text.addFocusListener(new org.eclipse.swt.events.FocusAdapter() {

	    		@Override
	    		public void focusLost(org.eclipse.swt.events.FocusEvent e) {
	    			if (text.getText().equals("")) {
	    				placeholder.setVisible(true);
	    			}
	    		}
	    	});
	    	((DrawableComposite) wrapperComposite).setPlaceHolder(placeholder);
    	}

    	syncPlaceholderLabel();
    }

	private void syncPlaceholderLabel() {
		if (placeholder != null) {
			if (hint != null) {
				placeholder.setText(hint);
			}
	    	clearMessage();

			placeholder.setEditable(false);
			syncListener(org.eclipse.swt.SWT.MouseEnter);
			syncListener(org.eclipse.swt.SWT.MouseExit);
			
			placeholder.setFont(this.text.getFont());
			placeholder.setBackground(placeholder.getBackground());
			if (placeholder.getBackgroundImage() != null) {
				placeholder.setBackgroundImage(placeholder.getBackgroundImage());
			}
			
	    	if (measurableView.getHintTextColors() != null) {
	    		setHintColorInternal(measurableView.getCurrentHintTextColor());
	    	} else {
	    		this.placeholder.setForeground(text.getDisplay().getSystemColor(org.eclipse.swt.SWT.COLOR_GRAY));
	    	}
	    	placeholder.setVisible(text.getText().equals(""));
	    	
	    	syncAdditionalAttrs();
		}
	}

	private void syncListener(int eventType) {
		Listener[] listeners = text.getListeners(eventType);
		for (Listener listener : listeners) {
			placeholder.removeListener(eventType, listener);
			placeholder.addListener(eventType, listener);	
		}
	}

	private void setHintColor(Object objValue) {
		createPlaceHolder(this.hint);
		setHintColorInternal(objValue);
    }

	private void setHintColorInternal(Object objValue) {
		if (objValue instanceof r.android.content.res.ColorStateList) {
			r.android.content.res.ColorStateList colorStateList = (r.android.content.res.ColorStateList) objValue;
			measurableView.setHintTextColor(colorStateList);
			objValue = measurableView.getCurrentHintTextColor();
		}

    	if (placeholder != null) {
    		placeholder.setForeground((Color) ViewImpl.getColor(objValue));
    	}
	}

	
	private void setHint(Object objValue) {
		this.hint = (String) objValue;
		if (isNativePlaceHolderSupported()) {
			setMessage();
		} else {
			createPlaceHolder(hint);
		}
	}
	
	private Object getHint() {
		return hint;
	}

    //end - hint
	
	@Override
    public List<Object> getNativeWidgets() {
        return java.util.Arrays.asList(wrapperComposite, text, drawableBottom, drawableLeft, drawableTop, drawableRight).
        		stream().filter((p) -> p != null).collect(java.util.stream.Collectors.toList());
    }
	
	@Override
	public int measureHeight(int width) {		
		int wrapperCompositeHeight = wrapperComposite.computeSize(width, org.eclipse.swt.SWT.DEFAULT).y;
		int height = text.computeSize(width, org.eclipse.swt.SWT.DEFAULT).y;
		height += wrapperCompositeHeight;
		
		if (placeholder != null) {
			int minimumHeight = placeholder.computeSize(width, org.eclipse.swt.SWT.DEFAULT).y + wrapperCompositeHeight;
			if (height < minimumHeight) {
				height = minimumHeight;
			}
		}
		return height;
	}

	@Override
	public int measureWidth() {
		int wrapperCompositeWidth = wrapperComposite.computeSize(org.eclipse.swt.SWT.DEFAULT, org.eclipse.swt.SWT.DEFAULT).y;
		int width = text.computeSize(org.eclipse.swt.SWT.DEFAULT, org.eclipse.swt.SWT.DEFAULT).x + wrapperCompositeWidth;
		
		if (placeholder != null) {
			int minimumWidth = placeholder.computeSize(org.eclipse.swt.SWT.DEFAULT, org.eclipse.swt.SWT.DEFAULT).x + wrapperCompositeWidth;
			if (width < minimumWidth) {
				width = minimumWidth;
			}
		}
		return width;
	}
	
    private org.eclipse.swt.graphics.Font getFont() {
		return text.getFont();
	}

	private void postSetAttribute(WidgetAttribute key, String strValue, Object objValue,
			ILifeCycleDecorator decorator) {
		switch (key.getAttributeName()) {
		case "setFocus":
			break;
		default:
			syncPlaceholderLabel();
			break;
		}
	}
	
	private void setVerticalAligmentCenter() {
		measurableView.setVerticalAligment(com.ashera.view.BaseMeasurableView.VerticalAligment.middle);
		addMinMaxListener();
	}

	private void setVerticalAligmentBottom() {
		measurableView.setVerticalAligment(com.ashera.view.BaseMeasurableView.VerticalAligment.bottom);
		addMinMaxListener();
	}

	private void setVerticalAligmentTop() {
		measurableView.setVerticalAligment(com.ashera.view.BaseMeasurableView.VerticalAligment.top);
		addMinMaxListener();
	}
	

	private void drawableStateChangedAdditional() {
		if (measurableView.getHintTextColors() != null) {
    		setHintColorInternal(measurableView.getCurrentHintTextColor());
    	}	
	}

	private void setOnAfterTextChange(Object objValue) {
		final TextWatcher textChangedListener = getTextChangedListener(objValue, "onafterTextChange");
		ViewImpl.setOnListener(this, org.eclipse.swt.SWT.Modify, "onAfterTextChange", new Listener() {
			@Override
			public void handleEvent(org.eclipse.swt.widgets.Event e) {
				textChangedListener.afterTextChanged(null);
			}
		});
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

	private void setBeforeOnTextChange(Object objValue) {
		final TextWatcher textChangedListener = getTextChangedListener(objValue, "onbeforeTextChange");
		ViewImpl.setOnListener(this, org.eclipse.swt.SWT.Verify, "beforeOnTextChange", new Listener() {
			@Override
			public void handleEvent(org.eclipse.swt.widgets.Event e) {
				textChangedListener.beforeTextChanged(text.getText(), e.start, e.count, e.text.length());
			}
			
		});
	}

	
	private final class TextChangeListener implements Listener {
		private final TextWatcher textChangedListener;
		private org.eclipse.swt.widgets.Event verifyEvent;
		private TextChangeListener(TextWatcher textChangedListener) {
			this.textChangedListener = textChangedListener;
		}
	
		@Override
		public void handleEvent(org.eclipse.swt.widgets.Event e) {
			if (e.type == org.eclipse.swt.SWT.Verify) {
				verifyEvent = e;
			} else {
				textChangedListener.onTextChanged(text.getText(), verifyEvent.start, verifyEvent.end - verifyEvent.start, verifyEvent.text
						.length());	
			}
			
		}
	}

	private void setOnTextChange(Object objValue) {
		final TextWatcher textChangedListener = getTextChangedListener(objValue, "onTextChange");
		TextChangeListener listener = new TextChangeListener(textChangedListener);
		ViewImpl.setOnListener(this, org.eclipse.swt.SWT.Verify, "onTextChangeVerify", listener);
		ViewImpl.setOnListener(this, org.eclipse.swt.SWT.Modify, "onTextChangeModify", listener);
	}
	
	private void setUseTabForNavigation(Object objValue) {
		ViewImpl.setOnListener(this, org.eclipse.swt.SWT.Traverse, org.eclipse.swt.SWT.Traverse + "", new Listener() {
			@Override
			public void handleEvent(org.eclipse.swt.widgets.Event e) {
		        if (e.detail == org.eclipse.swt.SWT.TRAVERSE_TAB_NEXT || e.detail == org.eclipse.swt.SWT.TRAVERSE_TAB_PREVIOUS) {
		            e.doit = (boolean) objValue;
		        }
		    }
		});
	}
    //end - codecopy
	//start - other
	private void setHorizontalAligmentCenter() {
	}

	private void setHorizontalAligmentRight() {
	}

	private void setHorizontalAligmentLeft() {
	}
	
	private void setMessage() {
		text.setMessage(this.hint);
	}
	
	private void clearMessage() {
		text.setMessage("");
	}

	private boolean isNativePlaceHolderSupported() {
		return (text.getStyle() & org.eclipse.swt.SWT.SINGLE) != 0;
	}
	
    private int getTextAlignment() {
    	if ((text.getStyle() & TEXT_ALIGN_CENTER) != 0) {
    		return TEXT_ALIGN_CENTER;
    	}
    	if ((text.getStyle() & TEXT_ALIGN_LEFT) != 0) {
    		return TEXT_ALIGN_LEFT;
    	}
    	if ((text.getStyle() & TEXT_ALIGN_RIGHT) != 0) {
    		return TEXT_ALIGN_RIGHT;
    	}
		return 0;
	}
    
    private void registerCommandAttrs() {
	}
    
	private void setScrollHorizontally(Object objValue) {
	}
	

    private void syncAdditionalAttrs() {
	}

	private void setSingleLine(Object objValue) {
		
	}
	
	private String getMyText() {
		return text.getText();
	}

	//end - other
	//start - formerror
	@Override
	public String getTextEntered() {
		return text.getText();
	}

	@Override
	public boolean isViewVisible() {
		return text.isVisible();
	}

	@Override
	public void focus() {
		text.forceFocus();
	}

	

	private void setError(String message) {
		
	}
	//end - formerror
	
	//start - focus
	private void setFocus(Object objValue) {
		if ((boolean)  objValue) {
			if (placeholder != null && placeholder.isVisible()) {
				placeholder.setFocus();
			} else {
				text.setFocus();
			}
		} else {
			((org.eclipse.swt.widgets.Control)getFragment().getRootWidget().asNativeWidget()).setFocus();	
		}
	}

	public Object invokeMethod(String methodName, Object... args) {
		if (methodName.equals("nativeWidgetFor") && args[0].equals("onFocusChange")) {
			return text;
		}
		return null;
	}
	//end - focus
}
