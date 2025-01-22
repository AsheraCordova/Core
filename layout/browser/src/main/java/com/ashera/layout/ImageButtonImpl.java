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
public class ImageButtonImpl extends BaseWidget implements IsImage{
	//start - body
	public final static String LOCAL_NAME = "ImageButton"; 
	public final static String GROUP_NAME = "ImageButton";

	protected org.teavm.jso.dom.html.HTMLElement hTMLElement;
	protected r.android.widget.ImageView measurableView;	
	
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
		final static class ScaleType extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("center",  0x5);
				mapping.put("centerCrop",  0x6);
				mapping.put("centerInside",  0x7);
				mapping.put("fitCenter",  0x3);
				mapping.put("fitEnd",  0x4);
				mapping.put("fitStart",  0x2);
				mapping.put("fitXY",  0x1);
				mapping.put("matrix",  0x0);
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


		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("src").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("adjustViewBounds").withType("boolean").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxHeight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxWidth").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("imageFromUrl").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("imageFromUrlPlaceHolder").withType("drawable").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("imageFromUrlError").withType("drawable").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("baseline").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("baselineAlignBottom").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tint").withType("colorstate").withOrder(-10));
		ConverterFactory.register("ImageButton.tintMode", new TintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tintMode").withType("ImageButton.tintMode").withOrder(-10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("padding").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingTop").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingBottom").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingLeft").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingRight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingStart").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingEnd").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingHorizontal").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingVertical").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		ConverterFactory.register("ImageButton.scaleType", new ScaleType());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scaleType").withType("ImageButton.scaleType").withUiFlag(UPDATE_UI_INVALIDATE));
	}
	
	public ImageButtonImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  ImageButtonImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  ImageButtonImpl(String groupName, String localname) {
		super(groupName, localname);
	}

		
	public class ImageButtonExt extends r.android.widget.ImageView implements ILifeCycleDecorator{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		private List<IWidget> overlays;
		public IWidget getWidget() {
			return ImageButtonImpl.this;
		}

		public ImageButtonExt() {
			super(ImageButtonImpl.this);
			
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
			postOnMeasure(widthMeasureSpec, heightMeasureSpec);
		}
		
		@Override
		protected void onLayout(boolean changed, int l, int t, int r, int b) {
			super.onLayout(changed, l, t, r, b);
			ViewImpl.setDrawableBounds(ImageButtonImpl.this, l, t, r, b);
			if (!isOverlay()) {
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			nativeMakeFrameForChildWidget(l, t, r, b);
			}
			replayBufferedEvents();
	        ViewImpl.redrawDrawables(ImageButtonImpl.this);
	        overlays = ViewImpl.drawOverlay(ImageButtonImpl.this, overlays);
			
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
				ImageButtonImpl.this.invalidate();
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
        		ViewImpl.drawableStateChanged(ImageButtonImpl.this);
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
    		
    		IWidget widget = template.loadLazyWidgets(ImageButtonImpl.this.getParent());
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
        	ImageButtonImpl.this.getParent().remove(ImageButtonImpl.this);
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
			ImageButtonImpl.this.setAttribute(name, value, !(value instanceof String));
		}
        @Override
        public void setVisibility(int visibility) {
            super.setVisibility(visibility);
            ((HTMLElement)asNativeWidget()).getStyle().setProperty("display", visibility != View.VISIBLE ? "none" : "block");
            
        }
        
    	public void setState0(Object value) {
    		ViewImpl.setState(ImageButtonImpl.this, 0, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(ImageButtonImpl.this, 1, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(ImageButtonImpl.this, 2, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(ImageButtonImpl.this, 3, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(ImageButtonImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(ImageButtonImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(ImageButtonImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(ImageButtonImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(ImageButtonImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(ImageButtonImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(ImageButtonImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(ImageButtonImpl.this);
        }
     
	
	}	@Override
	public Class getViewClass() {
		return ImageButtonExt.class;
	}

	@Override
	public IWidget newInstance() {
		return new ImageButtonImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
		measurableView = new ImageButtonExt();
		nativeCreate(params);	
		ViewImpl.registerCommandConveter(this);
	}

	@Override
	@SuppressLint("NewApi")
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		Object nativeWidget = asNativeWidget();
		ViewImpl.setAttribute(this,  key, strValue, objValue, decorator);
		
		switch (key.getAttributeName()) {
			case "src": {
				


		setImage(objValue);



			}
			break;
			case "adjustViewBounds": {
				


		setAdjustViewBounds(objValue);



			}
			break;
			case "maxHeight": {
				


		setMaxHeight(objValue);



			}
			break;
			case "maxWidth": {
				


		setMaxWidth(objValue);



			}
			break;
			case "imageFromUrl": {
				


		setImageFromUrl(objValue);



			}
			break;
			case "imageFromUrlPlaceHolder": {
				


		setImageFromUrlPlaceHolder(objValue);



			}
			break;
			case "imageFromUrlError": {
				


		setImageFromUrlError(objValue);



			}
			break;
			case "baseline": {
				


		setBaseLine(objValue);



			}
			break;
			case "baselineAlignBottom": {
				


		setBaselineAlignBottom(objValue);



			}
			break;
			case "tint": {
				


		setTintColor(objValue);



			}
			break;
			case "tintMode": {
				


		setTintMode(strValue);



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
			case "scaleType": {
				


		setScaleType(strValue, objValue);



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
			case "src": {
return getSrc();				}
			case "adjustViewBounds": {
return getAdjustViewBounds();				}
			case "maxHeight": {
return getMaxHeight();				}
			case "maxWidth": {
return getMaxWidth();				}
			case "baseline": {
return getBaseLine();				}
			case "baselineAlignBottom": {
return getBaselineAlignBottom();				}
			case "tint": {
return getTintColor();				}
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
			case "scaleType": {
return getScaleType();				}
		}
		
		return null;
	}
	
	@Override
	public Object asWidget() {
		return measurableView;
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
	


	private Object getBaselineAlignBottom() {
		return measurableView.getBaselineAlignBottom();
	}

	@Override
	public int getBaseLine() {
		return measurableView.getBaseline();
	}

	private void setBaseLine(Object objValue) {
		measurableView.setBaseline((int) objValue);
	}
	
	private void setBaselineAlignBottom(Object objValue) {
		measurableView.setBaselineAlignBottom((boolean) objValue);
	}
	
	
	private void setCropToPadding(Object objValue) {
		measurableView.setCropToPadding((boolean) objValue); 
	}

	private Object getCropToPadding() {
		return measurableView.getCropToPadding();
	}
	
	private Object getMaxWidth() {
		return measurableView.getMaxWidth();
	}

	private Object getMaxHeight() {
		return measurableView.getMaxHeight();
	}
    
    private void setMaxWidth(Object objValue) {
        measurableView.setMaxWidth(((int) objValue));
    }

    private void setMaxHeight(Object objValue) {
        measurableView.setMaxHeight(((int) objValue));
    }


	private Object getAdjustViewBounds() {
		return measurableView.getAdjustViewBounds();
	}
	

    private void setAdjustViewBounds(Object objValue) {
        measurableView.setAdjustViewBounds((boolean) objValue);
    }
    
	@Override
	public void drawableStateChanged() {
		super.drawableStateChanged();
		r.android.graphics.drawable.Drawable imageDrawable = measurableView.getImageDrawable();
		if (imageDrawable != null && imageDrawable.isStateful() && imageDrawable.setState(measurableView.getDrawableState())) {
			setImage(imageDrawable);
		}
		
		if (tintColor != null && tintColor instanceof r.android.content.res.ColorStateList && ((r.android.content.res.ColorStateList)tintColor).isStateful()) {
			setTintColor(tintColor);
		}
	}
    


	private void setImage(Object objValue) {
		measurableView.setImageDrawable((r.android.graphics.drawable.Drawable) objValue);
		Object drawable = measurableView.getImageDrawable().getDrawable();
		
		// this is case when image has not been loaded
		if (measurableView.getImageDrawable().getMinimumHeight() == 0 && measurableView.getImageDrawable().getMinimumWidth() == 0) {
			addRemeasureListeners();
		}
		
		if (drawable instanceof String) {
			if (((String) drawable).startsWith("#")) {
				image.removeAttribute("src");
				image.getStyle().setProperty("background-color", (String) drawable);				
			} else {
				image.setAttribute("src", (String) drawable);
			}
			
		}
	}
	
	
	private Object getSrc() {
		Object drawable = measurableView.getImageDrawable().getDrawable();
		if (drawable instanceof String) {
			if (((String) drawable).startsWith("res-swt/")) {
				drawable = getImageAsBase64(image);
			}
		}
		return drawable;
	}

	@org.teavm.jso.JSBody(params = {"element"}, script = "return window.getImageAsBase64(element)")
    private static native String getImageAsBase64(HTMLElement element);

	@Override
	public Object getImage() {
		return image.getAttribute("src");
	}

	@Override
	public int[] getImageDimension() {
		r.android.graphics.drawable.Drawable imageDrawable = measurableView.getImageDrawable();
		if (imageDrawable == null) {
			return new int[] {-1, -1};
		}
		return new int[] { imageDrawable.getMinimumWidth(), measurableView.getImageDrawable().getMinimumHeight() };
	}
	

	private void setScaleType(String strValue) {
		switch (strValue) {
		case "fitXY":
		    image.getStyle().setProperty("object-fit","fill");
		    break;
		case "fitStart":
		    image.getStyle().setProperty("object-fit","contain");
		    break;
		case "fitCenter":
		    image.getStyle().setProperty("object-fit","contain");
		    break;
		case "fitEnd":
		    image.getStyle().setProperty("object-fit","contain");
		    break;
		case "center":
		    image.getStyle().setProperty("object-fit","scale-down");
		    break;            
		case "centerCrop":
		    image.getStyle().setProperty("object-fit","cover");
		    break;
		case "centerInside":
		    image.getStyle().setProperty("object-fit","scale-down");
		    break;            
		default:
		    break;
		}
	}

    private Object getScaleType() {
		return measurableView.getScaleTypeInt();
	}
    

    private boolean measureCalled = false;
	private r.android.graphics.drawable.Drawable imageFromUrlError;
	
	private void setImageFromUrlError(Object objValue) {
		imageFromUrlError = (r.android.graphics.drawable.Drawable) objValue;		
	}
	private void postOnMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		measureCalled = true;
	}
	
	private void setImageFromUrlPlaceHolder(Object objValue) {
		setImage(objValue);
	}

	private boolean listenersAdded = false;
	
	private void setImageFromUrl(Object objValue) {
		measureCalled = false;
		
		addRemeasureListeners();
		image.setAttribute("src", (String) objValue);
	}

	private void addRemeasureListeners() {
		image.addEventListener("load", new ImageLoadListener());
		image.addEventListener("error", new ImageErrorListener());
	}
	
	private final class ImageErrorListener implements org.teavm.jso.dom.events.EventListener<org.teavm.jso.dom.events.Event> {
		@Override
		public void handleEvent(org.teavm.jso.dom.events.Event evt) {
			if (imageFromUrlError != null) {
	 			setImage(imageFromUrlError);
	 			remeasureIfRequired();
			}
			image.removeEventListener("error", this);
		}
	}
	
	private final class ImageLoadListener implements org.teavm.jso.dom.events.EventListener<org.teavm.jso.dom.events.Event> {
		@Override
		public void handleEvent(org.teavm.jso.dom.events.Event evt) {
			org.teavm.jso.dom.html.HTMLImageElement imageElement = (org.teavm.jso.dom.html.HTMLImageElement) image;
			r.android.graphics.drawable.Drawable drawable = new r.android.graphics.drawable.Drawable();
			drawable.setMinimumHeight(imageElement.getNaturalHeight());
			drawable.setMinimumWidth(imageElement.getNaturalWidth());
			measurableView.setImageDrawable(drawable);
			remeasureIfRequired();
			image.removeEventListener("load", this);
		}
	}

	private void remeasureIfRequired() {
		if (measureCalled) {
			requestLayout();
			fragment.remeasure();
		}
	}
    


	private Object tintColor;
	private String tintColorStr;
	private String tintMode = "src_atop";
	private void setTintColor(Object objValue) {
		tintColor = objValue;
		if (objValue instanceof r.android.content.res.ColorStateList) {
			r.android.content.res.ColorStateList colorStateList = (r.android.content.res.ColorStateList) objValue;
			objValue = colorStateList.getColorForState(measurableView.getDrawableState(), 0);
		}

		Object color = ViewImpl.getColor(objValue);
		tintColorStr = (String) color;
		ViewImpl.updateTintColor(this, getNativeWidgetForTint(), tintColorStr, tintMode);
		
	}

	private void setTintMode(String strValue) {
		this.tintMode = strValue;
		ViewImpl.updateTintColor(this, getNativeWidgetForTint(), tintColorStr, tintMode);
	}
	

	private Object getTintColor() {
		return tintColor;
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
	private HTMLElement image;
	
	private void setScaleType(String strValue, Object objValue) {
		this.measurableView.setScaleType(strValue, (int) objValue);
		setScaleType(strValue);
	}


	private void nativeCreate(Map<String, Object> params) {
		hTMLElement = org.teavm.jso.dom.html.HTMLDocument.current().createElement("button");
    	hTMLElement.getStyle().setProperty("box-sizing", "border-box");
    	hTMLElement.getStyle().setProperty("padding", "0px");
		
		image = org.teavm.jso.dom.html.HTMLDocument.current().createElement("img");
		image.getStyle().setProperty("object-fit", "contain");
		image.getStyle().setProperty("width", "100%");
		image.getStyle().setProperty("height", "100%");
		image.getStyle().setProperty("box-sizing", "border-box");
    	ViewGroupImpl.nativeAddView(hTMLElement, image);
		
	}
	
	
	private void nativeMakeFrameForChildWidget(int l, int t, int r, int b) {
	}


	private Object getNativeWidgetForTint() {
		return image;
	}
	
}
