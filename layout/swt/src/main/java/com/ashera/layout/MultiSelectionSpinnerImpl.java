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
public class MultiSelectionSpinnerImpl extends BaseHasWidgets implements IDrawable, IHasMultiNativeWidgets, ICustomMeasureHeight, ICustomMeasureWidth, com.ashera.validations.FormElement{
	//start - body
	public final static String LOCAL_NAME = "com.ashera.layout.MultiSelectionSpinner"; 
	public final static String GROUP_NAME = "com.ashera.layout.MultiSelectionSpinner";

	protected org.eclipse.swt.widgets.List list;
	protected r.android.widget.Spinner measurableView;	
	
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
	
	@Override
	public void loadAttributes(String attributeName) {
		ViewGroupModelImpl.register(attributeName);


		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("gravity").withType("gravity").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textSize").withType("dimensionsp").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("padding").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingBottom").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingRight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingLeft").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingStart").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingEnd").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingTop").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingHorizontal").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingVertical").withType("dimension"));
		ConverterFactory.register("com.ashera.layout.MultiSelectionSpinner.font", new Font());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("typeface").withType("com.ashera.layout.MultiSelectionSpinner.font").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		ConverterFactory.register("com.ashera.layout.MultiSelectionSpinner.textStyle", new TextStyle());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textStyle").withType("com.ashera.layout.MultiSelectionSpinner.textStyle").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("fontFamily").withType("font").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableStart").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableEnd").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTop").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableBottom").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawablePadding").withType("dimension").withOrder(1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTint").withType("colorstate").withOrder(-10));
		ConverterFactory.register("com.ashera.layout.MultiSelectionSpinner.tintMode", new TintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTintMode").withType("com.ashera.layout.MultiSelectionSpinner.tintMode").withOrder(-10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("enabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("editable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableIconSize").withType("dimension").withOrder(-1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("values").withType("array").withArrayType("resourcestring").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("selectedValues").withType("object"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("entries").withType("array").withArrayType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("selection").withType("array").withArrayType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onItemSelected").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelOptionTextPath").withType("string").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelOptionValuePath").withType("string").withOrder(-1));
	WidgetFactory.registerConstructorAttribute(localName, new WidgetAttribute.Builder().withName("swtTextStyle").withType("string"));
	}
	
	public MultiSelectionSpinnerImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  MultiSelectionSpinnerImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  MultiSelectionSpinnerImpl(String groupName, String localname) {
		super(groupName, localname);
	}

		
	public class MultiSelectionSpinnerExt extends r.android.widget.Spinner implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		private List<IWidget> overlays;
		public IWidget getWidget() {
			return MultiSelectionSpinnerImpl.this;
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

		public MultiSelectionSpinnerExt() {
			super(MultiSelectionSpinnerImpl.this);
			
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
			ViewImpl.setDrawableBounds(MultiSelectionSpinnerImpl.this, l, t, r, b);
			if (!isOverlay()) {
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			}
			replayBufferedEvents();
	        ViewImpl.redrawDrawables(MultiSelectionSpinnerImpl.this);
	        overlays = ViewImpl.drawOverlay(MultiSelectionSpinnerImpl.this, overlays);
			
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
				MultiSelectionSpinnerImpl.this.invalidate();
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
        		ViewImpl.drawableStateChanged(MultiSelectionSpinnerImpl.this);
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
    		
    		IWidget widget = template.loadLazyWidgets(MultiSelectionSpinnerImpl.this.getParent());
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
        	MultiSelectionSpinnerImpl.this.getParent().remove(MultiSelectionSpinnerImpl.this);
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
			MultiSelectionSpinnerImpl.this.setAttribute(name, value, !(value instanceof String));
		}
        @Override
        public void setVisibility(int visibility) {
            super.setVisibility(visibility);
            org.eclipse.swt.widgets.Control control = ((org.eclipse.swt.widgets.Control)asNativeWidget());
            if (!control.isDisposed()) {
            	control.setVisible(View.VISIBLE == visibility);
            }
            
        }
        @Override
        public int nativeMeasureWidth(java.lang.Object uiView) {
        	return ViewImpl.nativeMeasureWidth(uiView);
        }
        
        @Override
        public int nativeMeasureHeight(java.lang.Object uiView, int width) {
        	return ViewImpl.nativeMeasureHeight(uiView, width);
        }
        
    	public void setState0(Object value) {
    		ViewImpl.setState(MultiSelectionSpinnerImpl.this, 0, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(MultiSelectionSpinnerImpl.this, 1, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(MultiSelectionSpinnerImpl.this, 2, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(MultiSelectionSpinnerImpl.this, 3, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(MultiSelectionSpinnerImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(MultiSelectionSpinnerImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(MultiSelectionSpinnerImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(MultiSelectionSpinnerImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(MultiSelectionSpinnerImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(MultiSelectionSpinnerImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(MultiSelectionSpinnerImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(MultiSelectionSpinnerImpl.this);
        }
     
	
	}	@Override
	public Class getViewClass() {
		return MultiSelectionSpinnerExt.class;
	}

	@Override
	public IWidget newInstance() {
		return new MultiSelectionSpinnerImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
		measurableView = new MultiSelectionSpinnerExt();
		nativeCreate(params);	
		ViewImpl.registerCommandConveter(this);
	}

	@Override
	@SuppressLint("NewApi")
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		Object nativeWidget = asNativeWidget();
		ViewGroupModelImpl.setAttribute(this,  key, strValue, objValue, decorator);
		
		switch (key.getAttributeName()) {
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
			case "drawableTint": {
				


		setDrawableTint(objValue);



			}
			break;
			case "drawableTintMode": {
				


		setDrawableTintMode(strValue);



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
			case "drawableIconSize": {
				


		setDrawableIconSize(objValue);



			}
			break;
			case "values": {
				


		setValues(objValue);



			}
			break;
			case "selectedValues": {
				


		setSelectedValues(objValue);



			}
			break;
			case "entries": {
				


		setEntries(objValue);



			}
			break;
			case "selection": {
				


		setSelection(objValue);



			}
			break;
			case "onItemSelected": {
				


		if (objValue instanceof String) {setOnMultiItemSelectedListener(new OnMultiItemSelectedListener(this, strValue, "onItemSelected"));} else {setOnMultiItemSelectedListener((MultiSelectionSpinner.OnMultiItemSelectedListener) objValue);}



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
			case "textColor": {
return getTextColor();				}
			case "gravity": {
return getGravity();				}
			case "textSize": {
return getTextSize();				}
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
			case "selectedValues": {
return getSelectedValues();				}
		}
		
		return null;
	}
	
	@Override
	public Object asWidget() {
		return measurableView;
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
	


	private List<String> values;
	private Object tmpSelectedValues;
	private void setValues(Object objValue) {
		this.values = (List<String>) objValue;
	}
	
	
	private void setSelectedValues(Object objValue) {
		if (objValue instanceof String) {
			// try resource string
			objValue = quickConvert(objValue, CommonConverters.resourcestring);
		}
		
		if (objValue instanceof String) {
			objValue = java.util.Arrays.asList(((String) objValue).split(","));
		}

		if (this.values != null) {
			List<Object> selectedValues = PluginInvoker.getList(objValue);
			List<Integer> selectedItemPositions = new ArrayList<>();
			for (Object selectedValue : selectedValues) {
				int index = values.indexOf(selectedValue);
				if (index != -1) {
					selectedItemPositions.add(index);
				}
			}
			
			setSelection(selectedItemPositions);
		} else if (dataList != null && dataList.size() > 0) {
			List<Integer> selectedItemPositions = new ArrayList<>();
			List<Object> selectedValues = PluginInvoker.getList(objValue);
			for (int i = 0; i < dataList.size(); i++) {
				com.ashera.model.LoopParam loopParam = dataList.get(i);

				if (modelOptionValuePath != null) {
					Object data = getOptionValueFromLoopParam(loopParam, modelOptionValuePath);
					for (Object selectedValue : selectedValues) {
						if (data.equals(selectedValue)) {
							selectedItemPositions.add(i);
						}
					}
					selectedItemPositions.add(i);
				} else if (modelOptionTextPath != null) {
					Object data = getOptionValueFromLoopParam(loopParam, modelOptionTextPath);
					for (Object selectedValue : selectedValues) {
						if (data.equals(selectedValue)) {
							selectedItemPositions.add(i);
						}
					}
				}
			}
			setSelection(selectedItemPositions);
		} else {
			tmpSelectedValues = objValue;
		}
	}
	
	private Object getSelectedValues() {
		List<Integer> selectedItemPositions = getSelectedItemPositions();
		
		if (this.values != null && selectedItemPositions != null && selectedItemPositions.size() > 0) {
			List<String> selectedValues = new ArrayList<>();
			for (Integer selectedItemPosition : selectedItemPositions) {
				selectedValues.add(this.values.get(selectedItemPosition));
			}
			return selectedValues;
		}
		
		if (dataList != null && dataList.size() > 0) {
			if (modelOptionValuePath != null) {
				List<String> selectedValues = new ArrayList<>();
				for (Integer selectedItemPosition : selectedItemPositions) {
					selectedValues.add(PluginInvoker.getString(getOptionValueFromLoopParam(dataList.get(selectedItemPosition), modelOptionValuePath)));
				}	
				return selectedValues;
			}
			
			if (modelOptionTextPath != null) {
				List<String> selectedValues = new ArrayList<>();
				for (Integer selectedItemPosition : selectedItemPositions) {
					selectedValues.add(PluginInvoker.getString(getOptionValueFromLoopParam(dataList.get(selectedItemPosition), modelOptionTextPath)));
				}	
				return selectedValues;
			}
		}
		
		return null;
	}
	
	@Override
	public String getTextEntered() {
		List<String> selectedValues = (List<String>) getSelectedValues();
		return selectedValues == null || selectedValues.isEmpty() ? "" : selectedValues.toString();
	}

	
	@Override
	public void initialized() {
		super.initialized();
		setSelection(getSelectedItemPositions());
		if (tmpSelectedValues != null) {
			setSelectedValues(tmpSelectedValues);
		}
	}
	


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
		return list;
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
	private int nativeGetFontSize() {
		FontData[] fontData = list.getFont().getFontData();
        int height = fontData[0].getHeight();
		return height;
	}

	private int nativeGetFontStyle() {
		FontData[] fontData = list.getFont().getFontData();
        int style = fontData[0].getStyle();
		return style;
	}

	private void nativeSetCustomFont(int height, com.ashera.model.FontDescriptor fontDescriptor) {
		final org.eclipse.swt.graphics.Font newFont = new org.eclipse.swt.graphics.Font(Display.getDefault(), fontDescriptor.getName(), height, fontDescriptor.getStyle());
		setFont(newFont);
	}

	private void nativeSetFontStyle(int style) {
		FontData[] fontData = list.getFont().getFontData();
		for(int i = 0; i < fontData.length; ++i) {
		    fontData[i].setStyle(style);
		}

		final org.eclipse.swt.graphics.Font newFont = new org.eclipse.swt.graphics.Font(Display.getDefault(), fontData);
		setFont(newFont);
	}

    private void setFont(final org.eclipse.swt.graphics.Font newFont) {
        disposeAll(this.newFont);
        this.newFont = newFont;
        list.setFont(newFont);
    }

    private void setMyTextSize(Object objValue) {
        FontData[] fontData = list.getFont().getFontData();
        for(int i = 0; i < fontData.length; ++i) {
            float fontSize = ((float) objValue) * getFragment().getRootActivity().getScaleFactor();
			fontData[i].setHeight((int) fontSize);
        }

        final org.eclipse.swt.graphics.Font newFont = new org.eclipse.swt.graphics.Font(Display.getDefault(), fontData);
        setFont(newFont);
    }
    
	
	private Object getTextSize() {
		return list.getFont().getFontData()[0].getHeight();
	}
    //end - nativefont
    
	
	private void setTextColor(Object objValue) {
		if (objValue instanceof r.android.content.res.ColorStateList) {
			r.android.content.res.ColorStateList colorStateList = (r.android.content.res.ColorStateList) objValue;
			measurableView.setTextColor(colorStateList);
			objValue = measurableView.getCurrentTextColor();
		}
		
		list.setForeground((Color)ViewImpl.getColor(objValue));
	}

	private Object getTextColor() {
		return measurableView.getTextColors();
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

    


	private void setEnabled(Object objValue) {
		list.setEnabled((boolean) objValue);
	}
	


	private void setVerticalAligmentCenter() {
		measurableView.setVerticalAligment(com.ashera.view.BaseMeasurableView.VerticalAligment.middle);
	}

	private void setVerticalAligmentBottom() {
		measurableView.setVerticalAligment(com.ashera.view.BaseMeasurableView.VerticalAligment.bottom);
	}

	private void setVerticalAligmentTop() {
		measurableView.setVerticalAligment(com.ashera.view.BaseMeasurableView.VerticalAligment.top);
	}
	


	@Override
	public int measureHeight(int width) {
		int wrapperCompositeHeight = wrapperComposite.computeSize(width, org.eclipse.swt.SWT.DEFAULT).y;
		return list.computeSize(width, org.eclipse.swt.SWT.DEFAULT).y + wrapperCompositeHeight;
	}

	@Override
	public int measureWidth() {
		int wrapperCompositeWidth = wrapperComposite.computeSize(org.eclipse.swt.SWT.DEFAULT, org.eclipse.swt.SWT.DEFAULT).y;
		return list.computeSize(org.eclipse.swt.SWT.DEFAULT, org.eclipse.swt.SWT.DEFAULT).x + wrapperCompositeWidth;
	}
	


	@Override
    public List<Object> getNativeWidgets() {
		return java.util.Arrays.asList(wrapperComposite, list, drawableBottom, drawableLeft, drawableTop, drawableRight).
        		stream().filter((p) -> p != null).collect(java.util.stream.Collectors.toList());
    }
	

	@SuppressLint("NewApi")
private static class OnMultiItemSelectedListener implements MultiSelectionSpinner.OnMultiItemSelectedListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnMultiItemSelectedListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnMultiItemSelectedListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onItemSelected(View view, List<Integer> positions){
    
	if (action == null || action.equals("onItemSelected")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onItemSelected");
	    java.util.Map<String, Object> obj = getOnItemSelectedEventObj(view,positions);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, view,positions);
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

public java.util.Map<String, Object> getOnItemSelectedEventObj(View view,List<Integer> positions) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "itemselected");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "positions", positions);Object selectedValues = ((MultiSelectionSpinnerImpl)w).getSelectedValues(); if (selectedValues != null) { PluginInvoker.putJSONSafeObjectIntoMap(obj, "selectedValues", selectedValues);}
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onItemSelected", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}public void onNothingSelected(View view, List<Integer> positions){
    
	if (action == null || action.equals("onNothingSelected")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onNothingSelected");
	    java.util.Map<String, Object> obj = getOnNothingSelectedEventObj(view,positions);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, view,positions);
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

public java.util.Map<String, Object> getOnNothingSelectedEventObj(View view,List<Integer> positions) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "nothingselected");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "positions", positions);Object selectedValues = ((MultiSelectionSpinnerImpl)w).getSelectedValues(); if (selectedValues != null) { PluginInvoker.putJSONSafeObjectIntoMap(obj, "selectedValues", selectedValues);}
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onNothingSelected", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
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
    		
    	}
    }
    
    @Override
    public void invalidate() {
    	if (isInitialised()) {
			ViewImpl.invalidate(this, asNativeWidget());

    	}
    }
	public boolean isWidgetDisposed() {
		return list.isDisposed();
	}

	
		//end - body

	private Composite wrapperComposite;
	private void nativeCreate(Map<String, Object> params) {
		wrapperComposite = new DrawableComposite((Composite) ViewImpl.getParent(this), this, getStyle(params, fragment) | org.eclipse.swt.SWT.BORDER);
		wrapperComposite.setLayout(new org.eclipse.nebula.widgets.layout.AbsoluteLayout());
		
		int textStyle = getStyle("swtTextStyle", org.eclipse.swt.SWT.MULTI | org.eclipse.swt.SWT.V_SCROLL, params, fragment);
		list = new org.eclipse.swt.widgets.List(wrapperComposite, textStyle);
		wrapperComposite.setBackground(list.getBackground());
		registerForAttributeCommandChain("hint");
    	registerForAttributeCommandChain("drawableStart");
		registerForAttributeCommandChain("drawableTop");
		registerForAttributeCommandChain("drawableBottom");
		registerForAttributeCommandChain("drawableEnd");

	}
	private void setOnMultiItemSelectedListener(MultiSelectionSpinner.OnMultiItemSelectedListener onMultiItemSelectedListener) {
		ViewImpl.setOnListener(list, org.eclipse.swt.SWT.Selection, "OnMultiItemSelected", (e) -> {
			onMultiItemSelectedListener.onItemSelected(measurableView, java.util.Arrays.stream(list.getSelectionIndices()).boxed().collect(java.util.stream.Collectors.toList()));
		});
	}
	
	private void setSelection(Object objValue) {
		list.setSelection(((List<Integer>)objValue).stream().mapToInt(i -> i).toArray());
	}
	
	private void setEntries(Object objValue) {
		list.setItems(((List<String>) objValue).toArray(new String[0]));
	}
	
	@Override
	protected void addItemToParent(int index, java.lang.String id, com.ashera.model.LoopParam loopParam) {
		if (modelOptionTextPath != null) {
			Object val = getOptionValueFromLoopParam(loopParam, modelOptionTextPath);
			list.add((String) val);
		}
	}
	//start - viewcode
	public static class MultiSelectionSpinner {
	    /**
	     * Interface definition for a callback to be invoked when
	     * an item in this view has been selected.
	     */
	    public interface OnMultiItemSelectedListener {
	        /**
	         * <p>Callback method to be invoked when an item in this view has been
	         * selected. This callback is invoked only when the newly selected
	         * position is different from the previously selected position or if
	         * there was no selected item.</p>
	         *
	         * Impelmenters can call getItemAtPosition(position) if they need to access the
	         * data associated with the selected item.
	         *
	         * @param view The view within the AdapterView that was clicked
	         * @param positions The position of the view in the adapter
	         */
	        void onItemSelected(View view, List<Integer> positions);

	        /**
	         * Callback method to be invoked when the selection disappears from this
	         * view. The selection can disappear for instance when touch is activated
	         * or when the adapter becomes empty.
	         *
	         * @param view The view within the AdapterView that was clicked
	         * @param positions The position of the view in the adapter
	         */
	        void onNothingSelected(View view, List<Integer> positions);
	    }
	}
	//end - viewcode	
	@Override
	public Object asNativeWidget() {
		return wrapperComposite;
	}
	

	private void drawableStateChangedAdditional() {
		
	}
	
    
	
	private String getMyText() {
		return "";
	}

	private void setHorizontalAligmentCenter() {
	}

	private void setHorizontalAligmentRight() {
	}

	private void setHorizontalAligmentLeft() {
	}
	
	
	private int getTextAlignment() {
		return 0;
	}

    private List<Integer> getSelectedItemPositions() {
    	List<Integer> selectedItemPositions = new ArrayList<>();
    	for (int selectedItemPosition : list.getSelectionIndices()) {
    		selectedItemPositions.add(selectedItemPosition);
    	}
		return selectedItemPositions;
	}

	@Override
	public boolean isViewVisible() {
		return list.isVisible();
	}

	@Override
	public void focus() {
		list.forceFocus();
	}
	
	private void setError(Object object) {
		
	}
}
