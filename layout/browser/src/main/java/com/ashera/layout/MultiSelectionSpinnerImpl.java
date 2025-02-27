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
@SuppressLint("NewApi")
public class MultiSelectionSpinnerImpl extends BaseHasWidgets implements com.ashera.validations.FormElement {
	//start - body
	public final static String LOCAL_NAME = "com.ashera.layout.MultiSelectionSpinner"; 
	public final static String GROUP_NAME = "com.ashera.layout.MultiSelectionSpinner";

	protected org.teavm.jso.dom.html.HTMLElement hTMLElement;
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
	
	@Override
	public void loadAttributes(String attributeName) {
		ViewGroupModelImpl.register(attributeName);


		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("gravity").withType("gravity").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textSize").withType("dimensionsp").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
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
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("enabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("editable").withType("boolean"));
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
		ConverterFactory.register("com.ashera.layout.MultiSelectionSpinner.drawableTintMode", new DrawableTintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableTintMode").withType("com.ashera.layout.MultiSelectionSpinner.drawableTintMode"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableIconSize").withType("dimension").withOrder(-1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("entries").withType("array").withArrayType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("selection").withType("array").withArrayType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelOptionTextPath").withType("string").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onItemSelected").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelOptionValuePath").withType("string").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("selectedValues").withType("object"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("values").withType("array").withArrayType("resourcestring").withOrder(-1));
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
			nativeMakeFrameForChildWidget(l, t, r, b);
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
			MultiSelectionSpinnerImpl.this.setAttribute(name, value, !(value instanceof String));
		}
        @Override
        public void setVisibility(int visibility) {
            super.setVisibility(visibility);
            ((HTMLElement)asNativeWidget()).getStyle().setProperty("display", visibility != View.VISIBLE ? "none" : "block");
            
        }
        @Override
        public int nativeMeasureWidth(java.lang.Object uiView) {
        	return MultiSelectionSpinnerImpl.this.nativeMeasureWidth(uiView);
        }
        
        @Override
        public int nativeMeasureHeight(java.lang.Object uiView, int width) {
        	return MultiSelectionSpinnerImpl.this.nativeMeasureHeight(uiView, width);
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
			case "enabled": {
				


		 setEnabled(objValue);



			}
			break;
			case "editable": {
				


		 setEnabled(objValue);



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
			case "drawableIconSize": {
				


		setDrawableIconSize(objValue);



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
			case "modelOptionTextPath": {
				


		setModelOptionTextPath(objValue);



			}
			break;
			case "onItemSelected": {
				


		if (objValue instanceof String) {setOnMultiItemSelectedListener(new OnMultiItemSelectedListener(this, strValue, "onItemSelected"));} else {setOnMultiItemSelectedListener((MultiSelectionSpinner.OnMultiItemSelectedListener) objValue);}



			}
			break;
			case "modelOptionValuePath": {
				


		setModelOptionValuePath(objValue);



			}
			break;
			case "selectedValues": {
				


		setSelectedValues(objValue);



			}
			break;
			case "values": {
				


		setValues(objValue);



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
			case "drawablePadding": {
return this.getDrawablePadding();				}
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
			case "selectedValues": {
return getSelectedValues();				}
		}
		
		return null;
	}
	
	@Override
	public Object asWidget() {
		return measurableView;
	}

	

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

	
	


	private void nativeMakeFrameForChildWidget(int l, int t, int r, int b) {
		ViewImpl.updateBounds(select, 0, 0, r - l, b - t);
		select.getStyle().setProperty("padding-left", measurableView.getCompoundPaddingLeft()  + "px");
		select.getStyle().setProperty("padding-right", measurableView.getCompoundPaddingRight()  + "px");
		select.getStyle().setProperty("padding-top", measurableView.getCompoundPaddingTop()  + "px");
		select.getStyle().setProperty("padding-bottom", measurableView.getCompoundPaddingBottom()  + "px");
		updateDrawableBounds(l, t, r, b);
	}
	
    
	private void drawableStateChangedAdditional() {
	}
	
	private Object getTextSize() {
		String fontSize = select.getStyle().getPropertyValue("font-size");
		if (fontSize != null && !fontSize.isEmpty()) {
			return ViewImpl.getPropertyValueAsInt(select, "font-size");
		}
		return null;
	}
	
    
	
	private String getMyText() {
		return "";
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
	


	private void setEnabled(Object objValue) {
		if ((boolean) objValue) {
			hTMLElement.getStyle().removeProperty("disabled");
			select.removeAttribute("disabled");			
		} else {
			hTMLElement.getStyle().setProperty("disabled", "true");
			select.setAttribute("disabled", "true");
		}
	}
	


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
        select.getStyle().setProperty("font-style", fontStyle);
        select.getStyle().setProperty("font-weight", fontWeight);
	}
	


	private Object getFont() {
		return select.getStyle().getPropertyValue("font-family");
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
        select.getStyle().setProperty("font-family", fontDescriptor.getName());
    }

	private void setTypeFace(Object objValue, String strValue) {
		setFontFamily(objValue, strValue);
	}
	


	public void setMyTextSize(Object objValue) {
		select.getStyle().setProperty("font-size", ((float)objValue * getFragment().getRootActivity().getScaleFactor()) + "px" );
	}
	


	private void setHorizontalAligmentRight() {
		hTMLElement.getStyle().setProperty("text-align", "right");
	}

	private void setHorizontalAligmentCenter() {
		hTMLElement.getStyle().setProperty("text-align", "center");
	}

	private void setHorizontalAligmentLeft() {
		hTMLElement.getStyle().setProperty("text-align", "left");
	}
	


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
	


    @org.teavm.jso.JSBody(params = { "element" }, script = "return window.nativeMeasureWidth(element, true);")
    private static native int windowNativeMeasureWidth(org.teavm.jso.dom.html.HTMLElement element);
    
    @org.teavm.jso.JSBody(params = { "element", "width" }, script = "return window.nativeMeasureHeight(element, width, true);")
    private static native int windowNativeMeasureHeight(org.teavm.jso.dom.html.HTMLElement element, int width);
    
	public int nativeMeasureHeight(Object uiView, int width) {
		return windowNativeMeasureHeight(select, width);
	}

	public int nativeMeasureWidth(Object uiView) {
		return windowNativeMeasureWidth(select);
	}
	
	


	static class AdapterView<T> {
		public interface OnItemSelectedListener {
			void onItemSelected(AdapterView<?> parent, View view, int position, long id);
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
	    public Object asNativeWidget() {
	        return hTMLElement;
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
    		
    	}
    }
    
    @Override
    public void invalidate() {
    	if (isInitialised()) {
			ViewImpl.invalidate(this, asNativeWidget());

    	}
    }

	
		//end - body
private HTMLElement select;
	private void nativeCreate(Map<String, Object> params) {
		hTMLElement = org.teavm.jso.dom.html.HTMLDocument.current().createElement("div");
		hTMLElement.getStyle().setProperty("box-sizing", "border-box");
		
		select = org.teavm.jso.dom.html.HTMLDocument.current().createElement("select");
		select.getStyle().setProperty("color", "inherit");
		select.getStyle().setProperty("text-align", "inherit");
		select.getStyle().setProperty("box-sizing", "border-box");
		select.setAttribute("multiple", "true");
		hTMLElement.appendChild(select);
		registerForAttributeCommandChain("hint");
    	registerForAttributeCommandChain("text");
    	registerForAttributeCommandChain("drawableStart");
		registerForAttributeCommandChain("drawableTop");
		registerForAttributeCommandChain("drawableBottom");
		registerForAttributeCommandChain("drawableEnd");
	}
	private void setEntries(Object objValue) {
		select.clear();
		
		for (String entry : ((List<String>) objValue)) {
			HTMLElement option = org.teavm.jso.dom.html.HTMLDocument.current().createElement("option");
			option.getStyle().setProperty("font-weight", "inherit");
			option.setInnerHTML(entry);
			select.appendChild(option);
		}
	}
	
	private void setSelection(Object objValue) {
		List<Integer> selections = (List<Integer>) objValue;
		int childNodes = select.getChildNodes().getLength();

		for (int i = 0; i < childNodes; i++) {
			HTMLElement node = (HTMLElement) select.getChildNodes().item(i);
			setSelected(node, false);
			
			if (selections.contains(i)) {
				setSelected(node, true);
			}
		}
		
	}
	
	 @org.teavm.jso.JSBody(params = { "element", "selected"}, script = "element.selected=selected;")
	private static native void setSelected(org.teavm.jso.dom.html.HTMLElement element, boolean selected);
	
    @org.teavm.jso.JSBody(params = { "element"}, script = "var result = [];var options = element && element.options;"
    		+ "  for (var i=0, iLen=options.length; i<iLen; i++) {"
    		+ "    var opt = options[i];"
    		+ "    if (opt.selected) {"
    		+ "      result.push(i);"
    		+ "    }"
    		+ "  }"
    		+ "  return result;")
    private static native int[] getSelectedIndexes(org.teavm.jso.dom.html.HTMLElement element);
	private void setOnMultiItemSelectedListener(MultiSelectionSpinner.OnMultiItemSelectedListener onMultiItemSelectedListener) {
		org.teavm.jso.dom.events.EventListener<org.teavm.jso.dom.events.KeyboardEvent> listener = (event) -> {
			
			List<Integer> positions = new ArrayList<>();
			for (int position : getSelectedIndexes(select)) {
				positions.add(position);
			}
			onMultiItemSelectedListener.onItemSelected(measurableView, positions);
		};
		ViewImpl.setOnListener(this, select, listener, "change", "change");
	}
	@Override
	protected void addItemToParent(int index, java.lang.String id, com.ashera.model.LoopParam loopParam) {
		if (modelOptionTextPath != null) {
			Object val = getOptionValueFromLoopParam(loopParam, modelOptionTextPath);
			HTMLElement option = org.teavm.jso.dom.html.HTMLDocument.current().createElement("option");
			option.getStyle().setProperty("font-weight", "inherit");
			option.setInnerHTML((String) val);
			select.appendChild(option);
		}
	}

    private List<Integer> getSelectedItemPositions() {
    	List<Integer> positions = new ArrayList<>();
		for (int position : getSelectedIndexes(select)) {
			positions.add(position);
		}		
		
		return positions;
	}
    
	@Override
	public boolean isViewVisible() {
		return measurableView.getVisibility() == View.VISIBLE;
	}

	@Override
	public void focus() {
		hTMLElement.focus();
	}
	
	private void setError(Object object) {
		
	}
}
