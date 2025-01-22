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
public class ImageViewImpl extends BaseWidget implements IsImage, IHasMultiNativeWidgets, com.ashera.image.ITarget{
	//start - body
	public final static String LOCAL_NAME = "ImageView"; 
	public final static String GROUP_NAME = "ImageView";

	protected org.eclipse.swt.widgets.Label label;
	protected r.android.widget.ImageView measurableView;	
	
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
		ViewImpl.register(attributeName);


		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtImage").withType("image"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("src").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		ConverterFactory.register("ImageView.scaleType", new ScaleType());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scaleType").withType("ImageView.scaleType").withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("adjustViewBounds").withType("boolean").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxHeight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxWidth").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("imageFromUrl").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("imageFromUrlPlaceHolder").withType("drawable").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("imageFromUrlError").withType("drawable").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("padding").withType("dimension").withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingBottom").withType("dimension").withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingRight").withType("dimension").withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingLeft").withType("dimension").withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingStart").withType("dimension").withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingEnd").withType("dimension").withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingTop").withType("dimension").withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingHorizontal").withType("dimension").withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingVertical").withType("dimension").withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("baseline").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("baselineAlignBottom").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("cropToPadding").withType("boolean").withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tint").withType("colorstate").withOrder(-10));
		ConverterFactory.register("ImageView.tintMode", new TintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tintMode").withType("ImageView.tintMode").withOrder(-10));
	}
	
	public ImageViewImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  ImageViewImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  ImageViewImpl(String groupName, String localname) {
		super(groupName, localname);
	}

		
	public class ImageViewExt extends r.android.widget.ImageView implements ILifeCycleDecorator{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		private List<IWidget> overlays;
		public IWidget getWidget() {
			return ImageViewImpl.this;
		}

		public ImageViewExt() {
			super(ImageViewImpl.this);
			
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
			ViewImpl.setDrawableBounds(ImageViewImpl.this, l, t, r, b);
			if (!isOverlay()) {
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			nativeMakeFrameForChildWidget(l, t, r, b);
			}
			replayBufferedEvents();
	        ViewImpl.redrawDrawables(ImageViewImpl.this);
	        overlays = ViewImpl.drawOverlay(ImageViewImpl.this, overlays);
			
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
				ImageViewImpl.this.invalidate();
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
        		ViewImpl.drawableStateChanged(ImageViewImpl.this);
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
    		
    		IWidget widget = template.loadLazyWidgets(ImageViewImpl.this.getParent());
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
        	ImageViewImpl.this.getParent().remove(ImageViewImpl.this);
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
			ImageViewImpl.this.setAttribute(name, value, !(value instanceof String));
		}
        @Override
        public void setVisibility(int visibility) {
            super.setVisibility(visibility);
            org.eclipse.swt.widgets.Control control = ((org.eclipse.swt.widgets.Control)asNativeWidget());
            if (!control.isDisposed()) {
            	control.setVisible(View.VISIBLE == visibility);
            }
            
        }
        
    	public void setState0(Object value) {
    		ViewImpl.setState(ImageViewImpl.this, 0, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(ImageViewImpl.this, 1, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(ImageViewImpl.this, 2, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(ImageViewImpl.this, 3, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(ImageViewImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(ImageViewImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(ImageViewImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(ImageViewImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(ImageViewImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(ImageViewImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(ImageViewImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(ImageViewImpl.this);
        }
     
	
	}	@Override
	public Class getViewClass() {
		return ImageViewExt.class;
	}

	@Override
	public IWidget newInstance() {
		return new ImageViewImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
		measurableView = new ImageViewExt();
		createSimpleWrapableView();
		nativeCreate(params);	
		ViewImpl.registerCommandConveter(this);
	}

	@Override
	@SuppressLint("NewApi")
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		Object nativeWidget = simpleWrapableView.getWrappedView();
		ViewImpl.setAttribute(this, simpleWrapableView, key, strValue, objValue, decorator);
		
		switch (key.getAttributeName()) {
			case "swtImage": {
				


		disposeAll(label.getImage());
		 label.setImage((Image)objValue);



			}
			break;
			case "src": {
				


		setImage(objValue);



			}
			break;
			case "scaleType": {
				


		setScaleType(strValue, objValue);



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
			case "baseline": {
				


		setBaseLine(objValue);



			}
			break;
			case "baselineAlignBottom": {
				


		setBaselineAlignBottom(objValue);



			}
			break;
			case "cropToPadding": {
				


		setCropToPadding(objValue);



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
		default:
			break;
		}
		
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
			case "swtImage": {
return label.getImage();				}
			case "src": {
return getSrc();				}
			case "scaleType": {
return getScaleType();				}
			case "adjustViewBounds": {
return getAdjustViewBounds();				}
			case "maxHeight": {
return getMaxHeight();				}
			case "maxWidth": {
return getMaxWidth();				}
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
			case "baseline": {
return getBaseLine();				}
			case "baselineAlignBottom": {
return getBaselineAlignBottom();				}
			case "cropToPadding": {
return getCropToPadding();				}
			case "tint": {
return getTintColor();				}
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
			if (isViewWrapped()) {
				ViewImpl.invalidate(this, simpleWrapableView.getWrappedView());
				if (simpleWrapableView.getForeground() != null) {
					ViewImpl.invalidate(this, simpleWrapableView.getForeground());
				}
			}			
			nativeInvalidate();
    	}
    }
	public boolean isWidgetDisposed() {
		return label.isDisposed();
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
	public Object createWrapperViewHolder(int viewType) {
		Composite parent = (Composite) ViewImpl.getParent(this);
		Composite wrapperComposite = new Composite(parent, getStyle(params, fragment));
        wrapperComposite.setLayout(new org.eclipse.nebula.widgets.layout.AbsoluteLayout());

        return wrapperComposite;	
	}
	//end - body
	//start - allcode
	
	private void nativeCreate(Map<String, Object> params) {
	   measurableView.setUsePaddingForBounds(true);
	   registerCommandAttributes();
	}
	private int innerMargin = 0;
	private void nativeMakeFrameForChildWidget(int l, int t, int r, int b) {
		if (simpleWrapableView.isViewWrapped()) {
			ViewImpl.nativeMakeFrame(simpleWrapableView.getWrappedView(), innerMargin, innerMargin, 
					r -l - innerMargin, b -t - innerMargin);
		}
	}


	private void registerCommandAttributes() {
		registerForAttributeCommandChain("src");
	}
   
   public void nativeRequestLayout() {
       for (Object object : getNativeWidgets()) {
    	   ((Control) object).requestLayout();
       }
   }
   
   
   @Override
   public List<Object> getNativeWidgets() {
       return simpleWrapableView.getNativeWidgets();
   } 

	//start - codecopywrapperComposite

   private Rectangle rect;
   
   @Override
   public Object getImage() {
       if (this.imageResizeListener == null) {
    	   if (label.getImage() != null) {
    		   return label.getImage();
    	   }
           return null;
       }
	   return this.imageResizeListener.getImage();
   }

	
	private final class ImageResizeListener implements Listener {
		private final Image image;

		public Image getImage() {
			return image;
		}

		private ImageResizeListener(Image image) {
			this.image = image;
		}

		@Override
		public void handleEvent(org.eclipse.swt.widgets.Event event) {
		    Rectangle bounds = label.getBounds();
		    if (rect == null || !bounds.equals(rect) || (event.data != null && (boolean)event.data)) {
		        rect = label.getBounds();
				Image oldImg = label.getImage();
				
				if (oldImg != this.image && oldImg != null && !oldImg.isDisposed()) {
					internalDisposeImage(oldImg);
				}
			
		        Image scaledimage = (Image)applyScaleType(image, rect.width, 
		                rect.height, measurableView.getCropToPadding());
				label.setImage(scaledimage);
		    }
		
		}

	}
	private ImageResizeListener imageResizeListener;

   private void setImage(Object objValue) {	  
	   if ("@null".equals(objValue)) {
		   measurableView.setImageDrawable(null);
		   setImageNative(null, null, null);
	   } else {
		   r.android.graphics.drawable.Drawable drawable = (r.android.graphics.drawable.Drawable) objValue;
		   measurableView.setImageDrawable(drawable);
		   setImageNative(drawable.getDrawable(), drawable.getTintColor(), drawable.getTintMode());
	   }
   }
   
	private Object getSrc() {
		return measurableView.getImageDrawable();
	}

	private void setImageNative(Object objValue, Object tintColor, String tintMode) {
		disposeImage();
		   if (this.imageResizeListener != null) {
			   this.label.removeListener(org.eclipse.swt.SWT.Resize, this.imageResizeListener);
		   }
	
	       if (objValue instanceof Image) {
	           Image image = (Image) objValue;
	           
	           if (tintColor != null) {
	        	   image = com.ashera.common.ImageUtils.tintImage(image, (Color) tintColor, tintMode);
	           }
	           this.imageResizeListener = new ImageResizeListener(image);
	           label.addListener(org.eclipse.swt.SWT.Resize, this.imageResizeListener);
	           if (isInitialised()) {
	        	   rect = null;
	        	   org.eclipse.swt.widgets.Event event = new org.eclipse.swt.widgets.Event();
	        	   this.imageResizeListener.handleEvent(event);
	           }
	           label.setBackground(null);
	       } else if (objValue instanceof Color) {
	    	   this.imageResizeListener = null;
	    	   label.setImage(null);
	    	   label.setBackground((Color) objValue);
	       } else {
	    	   this.imageResizeListener = null;
	    	   label.setImage(null);
	    	   label.setBackground(null);
	       }
	}

	private void disposeImage() {
		if (this.imageResizeListener != null) {
			// clean up images before setting new image
			internalDisposeImage(this.imageResizeListener.getImage());
		}
		
		if (!this.label.isDisposed()) {
			internalDisposeImage(this.label.getImage());
		}
	}
	
	private void internalDisposeImage(Image image) {
		fragment.addDisposable(image);
	}

    // 
    private int extaWidth = 0;
    
	private Object getScaleType() {
		return measurableView.getScaleTypeInt();
	}

    private void setScaleType(String strValue, Object objValue) {
    	measurableView.setScaleType(strValue, (int) objValue);
    }
    
    private Object applyScaleType(Object image, int width, int height, boolean cropToPadding) {
        com.ashera.model.RectM bounds = measurableView.getImageBounds(width, height);
		if (bounds == null || bounds.height == -1 || bounds.width == -1 || width == 0 || height == 0) {
			return image;
		}
		
		com.ashera.model.RectM clip = null;
		if (cropToPadding) {
			clip = measurableView.getCropPaddingClipBounds();
		}
		
        com.ashera.common.ImageUtils.ResizeOptions.Builder builder = new com.ashera.common.ImageUtils.ResizeOptions.Builder();
        builder.withBackgroundHint(label.getParent().getBackground()).withUseBackgroundHint(true).initFromAttr(this, "src");
		return com.ashera.common.ImageUtils.resize((Image) image, width, height, bounds, clip, builder.build());
	}

    private void forceRedraw() {
        if (isInitialised()) {
            if (this.imageResizeListener != null) {
                org.eclipse.swt.widgets.Event event = new org.eclipse.swt.widgets.Event();
                event.data = true;
                this.imageResizeListener.handleEvent(event);
            }
        }
    }

    @Override
    public int[] getImageDimension() {        
        Image image = (Image) getImage();
        if (image != null) {
            return new int[] { getImageWidth(image) + extaWidth, 
            		getImageHeight(image) + extaWidth};
        }
        return new int[] {-1, -1};
    }

	private int getImageHeight(Object image) {
		ImageData imageData = ((Image) image).getImageData();
		if (imageData == null) {
			return 0;
		}

		return imageData.height;
	}

	private int getImageWidth(Object image) {
		ImageData imageData = ((Image) image).getImageData();
		if (imageData == null) {
			return 0;
		}
		return imageData.width;
	}

    //start - measurableimageview
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
    //end - measurableimageview
	
	//end - codecopywrapperComposite
	//end - allcode

	//start - tint
	private Object tintColor;
	
	private void setTintColor(Object objValue) {
		tintColor = objValue;
		if (objValue instanceof r.android.content.res.ColorStateList) {
			r.android.content.res.ColorStateList colorStateList = (r.android.content.res.ColorStateList) objValue;
			objValue = colorStateList.getColorForState(measurableView.getDrawableState(), r.android.graphics.Color.BLACK);
		}

		applyAttributeCommand("src", "tintColor", new String[] {"tint"}, true, ViewImpl.getColor(objValue));
	}
	
	
	private void setTintMode(String strValue) {
		applyAttributeCommand("src", "tintColor", new String[] {"tintMode"}, true, strValue);
	}
	
	private Object getTintColor() {
		return tintColor;
	}
	//end - tint
	
    private void nativeInvalidate() {
    	forceRedraw();
	}

	private Object nativeAddForeGround(ImageViewImpl imageViewImpl) {
		return null;
	}
	
	@Override
	public Object createWrapperView(Object wrapperParent, int viewType) {
		label = new Label((Composite) wrapperParent, org.eclipse.swt.SWT.NONE);
		label.addDisposeListener((e) -> disposeImage());
		return label;
	}
	//start - imageFromUrl
	private r.android.graphics.drawable.Drawable  imageFromUrlPlaceHolder;

	private void setImageFromUrlPlaceHolder(Object objValue) {
		imageFromUrlPlaceHolder = (r.android.graphics.drawable.Drawable) objValue;
	}  
	
	private r.android.graphics.drawable.Drawable  imageFromUrlError;
	
	private void setImageFromUrlError(Object objValue) {
		imageFromUrlError = (r.android.graphics.drawable.Drawable) objValue;		
	}
	private void setImageFromUrl(Object objValue) {
		measureCalled = false;
		com.ashera.image.ImageDownloaderFactory.get().download(new Context(), (String) objValue, imageFromUrlPlaceHolder, imageFromUrlError,  this);
	}


	@Override
	public void onBitmapLoaded(Object bitmap) {
		r.android.graphics.drawable.Drawable drawable = new r.android.graphics.drawable.Drawable();
		ImageData imageData = (ImageData) ((r.android.graphics.Bitmap) bitmap).getImage();
		drawable.setDrawable(new Image(null, imageData));
		drawable.setMinimumHeight(imageData.height);
		drawable.setMinimumWidth(imageData.width);
		setImage(drawable);
		label.setVisible(true);
		
		if (measureCalled) {
			requestLayout();
			fragment.remeasure();
		}
	}

	@Override
	public void onBitmapFailed(Object errorDrawable) {
		if (imageFromUrlError != null) {
			label.setVisible(true);
			setImage(imageFromUrlError);
			
			if (measureCalled) {
				requestLayout();
				fragment.remeasure();
			}
		}
	
	}

	@Override
	public void onPrepareLoad(Object placeHolderDrawable) {
		if (placeHolderDrawable == null) {
			label.setVisible(false);
		} else {
			setImage(placeHolderDrawable);
		}
	}
	boolean measureCalled = false;

	private void postOnMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		measureCalled = true;
	}

	//end - imageFromUrl
	
}