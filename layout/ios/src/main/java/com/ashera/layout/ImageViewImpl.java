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
#include "ASUIImageView.h"
]-*/
@SuppressLint("NewApi")
public class ImageViewImpl extends BaseWidget implements IsImage, com.ashera.image.ITarget {
	private final static String FOREGROUND_REGEX = "drawForeground";
	private final static String VIEW_HOLDER_REGEX = "(?!(?:drawForeground)$).*";
	private final static String WIDGET_REGEX = "none";
	//start - body
	public final static String LOCAL_NAME = "ImageView"; 
	public final static String GROUP_NAME = "ImageView";

	protected @Property Object uiView;
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
	
	@Override
	public void loadAttributes(String attributeName) {
		ViewImpl.register(attributeName);


		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("src").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		ConverterFactory.register("ImageView.scaleType", new ScaleType());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scaleType").withType("ImageView.scaleType").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("adjustViewBounds").withType("boolean").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxHeight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxWidth").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("imageFromUrl").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("imageFromUrlPlaceHolder").withType("drawable").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("imageFromUrlError").withType("drawable").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("padding").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingBottom").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingRight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingLeft").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingStart").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingEnd").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingTop").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingHorizontal").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingVertical").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("baseline").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("baselineAlignBottom").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tint").withType("colorstate").withOrder(-10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("cropToPadding").withType("boolean").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
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

@com.google.j2objc.annotations.WeakOuter		
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
			ImageViewImpl.this.setAttribute(name, value, !(value instanceof String));
		}
        @Override
        public void setVisibility(int visibility) {
            super.setVisibility(visibility);
            ViewImpl.nativeSetVisibility(asNativeWidget(), visibility != View.VISIBLE);
            
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
		setWidgetOnNativeClass();
	}
	private native void setWidgetOnNativeClass() /*-[
		((ASUIImageView*) self.uiView).widget = self;
	]-*/;

	@Override
	@SuppressLint("NewApi")
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		Object nativeWidget = simpleWrapableView.getWrappedView();
		ViewImpl.setAttribute(this, simpleWrapableView, key, strValue, objValue, decorator);
		
		switch (key.getAttributeName()) {
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
			case "tint": {
				


		setTintColor(objValue);



			}
			break;
			case "cropToPadding": {
				


		setCropToPadding(objValue);



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
			case "tint": {
return getTintColor();				}
			case "cropToPadding": {
return getCropToPadding();				}
		}
		
		return null;
	}
	
	@Override
	public Object asWidget() {
		return measurableView;
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
		uiView.commandRegex  = ASImageViewImpl_FOREGROUND_REGEX; 
		uiView.backgroundColor = [UIColor clearColor];
		return uiView;
	]-*/;
	 public native Object createWrapperViewHolderNative(int viewType)/*-[
	 	if (viewType == 1) {
			ASUIView* uiView = [ASUIView new];
			uiView.widget = self;
			uiView.commandRegex  = ASImageViewImpl_VIEW_HOLDER_REGEX; 
			uiView.backgroundColor = [UIColor clearColor];
			
			return uiView;
		}
		
		if (viewType == 2 || viewType == 3) {
			ASUIView* uiView = [ASUIView new];
			uiView.widget = self;
			uiView.backgroundColor = [UIColor clearColor];
			uiView.commandRegex  = ASImageViewImpl_VIEW_HOLDER_REGEX; 

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

	

	//start - image
	private static Map<String, Integer> scaleTypeToContentModeMapping = new HashMap<>();
	static 
	{
		scaleTypeToContentModeMapping.put("center",  LayoutNativeVars.UIViewContentModeCenter);
		scaleTypeToContentModeMapping.put("centerCrop",  LayoutNativeVars.UIViewContentModeScaleAspectFill);
		scaleTypeToContentModeMapping.put("centerInside",  LayoutNativeVars.UIViewContentModeScaleAspectFit);
		scaleTypeToContentModeMapping.put("fitXY",  LayoutNativeVars.UIViewContentModeScaleToFill);
		scaleTypeToContentModeMapping.put("fitCenter",  -1);
		scaleTypeToContentModeMapping.put("fitStart",  -2);
		scaleTypeToContentModeMapping.put("fitEnd",  -3);
	}
	
	@Override
	public Object getImage() {
		return getImageNative();
	}

	@Override
	public int[] getImageDimension() {
		Object image = getImage();
		if (image != null) {
			return new int[] {getImageWidth(image), getImageHeight(image)};
		} 
		return new int[] {0,0};
	}
	
	private Object getScaleType() {
		return measurableView.getScaleTypeInt();
	}
	
	private void setScaleType(String strValue, Object objValue) {
		measurableView.setScaleType(strValue, (int) objValue);
		
		if (isViewWrapped()) {
			if ("fitXY".equals(strValue)) {
				nativeSetContentMode(scaleTypeToContentModeMapping.get(strValue));
			} else {
				nativeSetContentMode(scaleTypeToContentModeMapping.get("centerInside"));
			}
		} else {
			Integer contentMode = scaleTypeToContentModeMapping.get(strValue);
			if (contentMode != null) {
				nativeSetContentMode(contentMode);
			}
		}
	}	

	public void setImage(Object value) {
		r.android.graphics.drawable.Drawable drawable = (r.android.graphics.drawable.Drawable) value;
		measurableView.setImageDrawable(drawable);
		
		setImageNative(drawable.getDrawable(), drawable.getTintColor());
	}
	
	
	private Object getSrc() {
		return measurableView.getImageDrawable();
	}
	
	private native int getImageHeight(Object image) /*-[
		return ((UIImage*) image).size.height;
	]-*/;
	
	private native int getImageWidth(Object image) /*-[
		return ((UIImage*) image).size.width;
	]-*/;
	
	private r.android.graphics.drawable.Drawable  imageFromUrlPlaceHolder;
	private boolean measureCalled = false;
	private r.android.graphics.drawable.Drawable  imageFromUrlError;
	
	private void setImageFromUrlError(Object objValue) {
		imageFromUrlError = (r.android.graphics.drawable.Drawable) objValue;		
	}
	private void setImageFromUrlPlaceHolder(Object objValue) {
		imageFromUrlPlaceHolder = (r.android.graphics.drawable.Drawable) objValue;
	} 

	private void setImageFromUrl(Object objValue) {
		measureCalled = false;
		com.ashera.image.ImageDownloaderFactory.get().download(new Context(), (String) objValue, imageFromUrlPlaceHolder, imageFromUrlError,  this);
	}

	@Override
	public void onBitmapFailed(Object errorDrawable) {
		if (imageFromUrlError != null) {
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
			setImage(new r.android.graphics.drawable.Drawable());
		} else {
			setImage(placeHolderDrawable);
		}
	}

	@Override
	public void onBitmapLoaded(Object bitmap) {
		Object image = ((r.android.graphics.Bitmap) bitmap).getImage();
		r.android.graphics.drawable.Drawable drawable = new r.android.graphics.drawable.Drawable();
		drawable.setDrawable(image);
		drawable.setMinimumHeight(getImageHeight(image));
		drawable.setMinimumWidth(getImageWidth(image));
		setImage(drawable);
		
		if (measureCalled) {
			requestLayout();
			fragment.remeasure();
		}
	}

	private void postOnMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		measureCalled = true;
	}
	//end - image

	public native Object getImageNative() /*-[
		return ((ASUIImageView*) self->uiView_).image;
	]-*/;

	public native void setImageNative(Object value, Object tintColor) /*-[
		if ([value isKindOfClass:[UIImage class]]) {
			if (tintColor != nil) {
				value = [(UIImage*) value imageWithRenderingMode:UIImageRenderingModeAlwaysTemplate];
				[((ASUIImageView*)self->uiView_) setTintColor:(UIColor*)tintColor];
			}
			((ASUIImageView*) self->uiView_).image = (UIImage*) value;
			[((ASUIImageView*) self->uiView_) setBackgroundColor:[UIColor clearColor]];
		} else if ([value isKindOfClass:[UIColor class]]) {
			[((ASUIImageView*) self->uiView_) setBackgroundColor:((UIColor*) value)];
			((ASUIImageView*) self->uiView_).image = nil;
		} else {
			[((ASUIImageView*) self->uiView_) setBackgroundColor:[UIColor clearColor]];
			((ASUIImageView*) self->uiView_).image = nil;
		}
	]-*/;
	
	private native Integer nativeGetContentMode() /*-[
		return [JavaLangInteger valueOfWithInt:(jint) ((ASUIImageView*)self->uiView_).contentMode];
	]-*/;
	private native void nativeSetContentMode(int contentMode) /*-[
		[((ASUIImageView*)self->uiView_) setContentMode:contentMode];
	]-*/;
	
	private Object tintColor;
	
	private void setTintColor(Object objValue) {
		tintColor = objValue;
		if (objValue instanceof r.android.content.res.ColorStateList) {
			r.android.content.res.ColorStateList colorStateList = (r.android.content.res.ColorStateList) objValue;
			objValue = colorStateList.getColorForState(measurableView.getDrawableState(), r.android.graphics.Color.BLACK);
		}
		applyAttributeCommand("src", "tintColor", new String[] {"tint"}, true, ViewImpl.getColor(objValue));
	}
	
	private native Object getTintColor() /*-[
		return ((ASUIImageView*)self->uiView_).tintColor;
	]-*/;
	

	private void registerCommandAttributes() {
		registerForAttributeCommandChain("src");
	}
	
	private void nativeCreate(Map<String, Object> params) {
	   measurableView.setUsePaddingForBounds(true);
	   registerCommandAttributes();
	}

    private void nativeRequestLayout() {
    	
	}
    

	public native void createMask(Object viewToMask, int x, int y, int width, int height) /*-[
		// Create a mask layer and the frame to determine what will be visible in the view.
		CAShapeLayer *maskLayer = [[CAShapeLayer alloc] init];
		CGRect maskRect = CGRectMake(x, y, width, height);
	
		// Create a path with the rectangle in it.
		CGPathRef path = CGPathCreateWithRect(maskRect, NULL);
	
		// Set the path to the mask layer.
		maskLayer.path = path;
	
		// Release the path since it's not covered by ARC.
		CGPathRelease(path);
	
		// Set the mask of the view.
		((UIView*)viewToMask).layer.mask = maskLayer;
	]-*/;
	
	public native void removeMask(Object viewToMask) /*-[
		((UIView*)viewToMask).layer.mask = nil;
	]-*/;
	
	private void nativeInvalidate() {
		invalidateWrapViewHolder();
	}
	
    
	public native Object nativeCreateView(int viewType)/*-[
		ASUIImageView* imageView = [ASUIImageView new];
		imageView.commandRegex = ASImageViewImpl_WIDGET_REGEX;
		[imageView setContentMode:UIViewContentModeScaleAspectFit];
		return imageView;
	]-*/;
    
	private void nativeMakeFrameForChildWidget(int l, int t, int r, int b) {
		if (isViewWrapped()) {
			com.ashera.model.RectM bounds = measurableView.getImageBounds(r -l, b - t);
			Object imageView = simpleWrapableView.getWrappedView();
			ViewImpl.nativeMakeFrame(imageView, bounds.x, bounds.y, bounds.width + bounds.x, bounds.y + bounds.height);
			
			if (measurableView.getCropToPadding()) {
				createMask(simpleWrapableView.getWrapperViewHolder(), measurableView.getPaddingLeft(), measurableView.getPaddingTop(), 
						r -l - measurableView.getPaddingRight() -  measurableView.getPaddingLeft(), b - t - measurableView.getPaddingBottom() - measurableView.getPaddingTop());
			} else {
				removeMask(simpleWrapableView.getWrapperViewHolder());
			}
		}
		
		setForegroundFrame(l, t, r, b);
	}
}
