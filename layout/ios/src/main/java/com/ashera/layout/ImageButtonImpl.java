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
]-*/

import com.google.j2objc.annotations.Property;

import static com.ashera.widget.IWidget.*;
//end - imports

/*-[
#include "ASUIButton.h"
]-*/

@SuppressLint("NewApi")
public class ImageButtonImpl extends BaseWidget implements IsImage, com.ashera.image.ITarget {
	//start - body
	public final static String LOCAL_NAME = "ImageButton"; 
	public final static String GROUP_NAME = "ImageButton";

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
		ConverterFactory.register("ImageButton.scaleType", new ScaleType());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scaleType").withType("ImageButton.scaleType").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
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

@com.google.j2objc.annotations.WeakOuter		
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
			ImageButtonImpl.this.setAttribute(name, value, !(value instanceof String));
		}
        @Override
        public void setVisibility(int visibility) {
            super.setVisibility(visibility);
            ViewImpl.nativeSetVisibility(asNativeWidget(), visibility != View.VISIBLE);
            
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
		setWidgetOnNativeClass();
	}
	private native void setWidgetOnNativeClass() /*-[
		((ASUIButton*) self.uiView).widget = self;
	]-*/;

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
		}
		
		return null;
	}
	
	@Override
	public Object asWidget() {
		return measurableView;
	}

	

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
    


	public Object getPaddingLeft() {
		return ViewImpl.getPaddingLeft(this, measurableView);
	}

	public void setPaddingLeft(Object paddingLeft) {
		ViewImpl.setPaddingLeft(paddingLeft, measurableView);
		nativeSetPaddingLeft((int) paddingLeft);
	}

	public Object getPaddingRight() {
		return ViewImpl.getPaddingRight(this, measurableView);
	}

	public void setPaddingRight(Object paddingRight) {
		ViewImpl.setPaddingRight(paddingRight, measurableView);
		nativeSetPaddingRight((int) paddingRight);
	}

	public Object getPaddingTop() {
		return ViewImpl.getPaddingTop(this, measurableView);
	}

	public void setPaddingTop(Object paddingTop) {
		ViewImpl.setPaddingTop(paddingTop, measurableView);
		nativeSetPaddingTop((int) paddingTop);
	}

	public Object getPaddingBottom() {
		return ViewImpl.getPaddingBottom(this, measurableView);
	}
	
	private Object getPaddingEnd() {
		return getPaddingRight();
	}

	private Object getPaddingStart() {
		return getPaddingLeft();
	}	

	public void setPaddingBottom(Object paddingBottom) {
		ViewImpl.setPaddingBottom(paddingBottom, measurableView);
		nativeSetPaddingBottom((int) paddingBottom);
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
    	setPaddingLeft(measurableView.getPaddingLeft());
    	setPaddingRight(measurableView.getPaddingRight());
    	setPaddingTop(measurableView.getPaddingTop());
    	setPaddingBottom(measurableView.getPaddingBottom());
    }
	private native void nativeSetPaddingBottom(int value) /*-[
		ASUIButton* label = ((ASUIButton*) self.uiView);
		UIEdgeInsets edgeInsets = label.imageEdgeInsets;
		[label setImageEdgeInsets:UIEdgeInsetsMake(edgeInsets.top, edgeInsets.left, value, edgeInsets.right)];		
	]-*/;

	private native void nativeSetPaddingLeft(int value) /*-[
		ASUIButton* label = ((ASUIButton*) self.uiView);
		UIEdgeInsets edgeInsets = label.imageEdgeInsets;
		[label setImageEdgeInsets:UIEdgeInsetsMake(edgeInsets.top, value, edgeInsets.bottom, edgeInsets.right)];		
	]-*/;
	
	private native void nativeSetPaddingRight(int value) /*-[
		ASUIButton* label = ((ASUIButton*) self.uiView);
		UIEdgeInsets edgeInsets = label.imageEdgeInsets;
		[label setImageEdgeInsets:UIEdgeInsetsMake(edgeInsets.top, edgeInsets.left, edgeInsets.bottom, value)];		
	]-*/;
	
	
	private native void nativeSetPaddingTop(int value) /*-[
		ASUIButton* label = ((ASUIButton*) self.uiView);
		UIEdgeInsets edgeInsets = label.imageEdgeInsets;
		[label setImageEdgeInsets:UIEdgeInsetsMake(value, edgeInsets.left, edgeInsets.bottom, edgeInsets.right)];		
	]-*/;
	

	
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

    	}
    }

	
		//end - body
	private void nativeCreate(Map<String, Object> params) {
		createButton();
		registerForAttributeCommandChain("src");
	}
	
	private native void createButton()/*-[
		self.uiView = [ASUIButton buttonWithType:UIButtonTypeCustom];
		((ASUIButton*)self.uiView).contentEdgeInsets = UIEdgeInsetsMake(0, 0, 0, 0);
    	((ASUIButton*)self.uiView).titleEdgeInsets = UIEdgeInsetsMake(0, 0, 0, 0);
		((ASUIButton*)self.uiView).clipsToBounds = YES;
		[((ASUIButton*)self.uiView) setTitleColor:[UIColor blackColor] forState:UIControlStateNormal];
		((ASUIButton*)self.uiView).contentHorizontalAlignment = UIControlContentHorizontalAlignmentFill;
		((ASUIButton*)self.uiView).contentVerticalAlignment = UIControlContentVerticalAlignmentFill;
		((ASUIButton*)self.uiView).imageView.contentMode = UIViewContentModeScaleAspectFit;
	]-*/;
	
	
	@Override
	public Object asNativeWidget() {
		return uiView;
	}
	
	private boolean isViewWrapped() {
		return false;
	}
	
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
		return ((ASUIButton*)self->uiView_).imageView.tintColor;
	]-*/;
	

	private native Object getImageNative() /*-[
		return [((ASUIButton*)self->uiView_) imageForState:UIControlStateNormal];
	]-*/;
	
	
	private void setImageNative(Object value, Object tintColor) {
		if (hasFeature("enableFeatures", "UIImageRenderingModeAlwaysTemplate")) {
			setImageNativeWithTemplate(value, tintColor);
		} else {
			setImageNativeSimple(value);
		}
	}
	
	private native void setImageNativeSimple(Object value) /*-[
		if ([value isKindOfClass:[UIImage class]]) {
			[((ASUIButton*) self->uiView_) setImage:(UIImage*) value forState:UIControlStateNormal];
			[((ASUIButton*) self->uiView_) setBackgroundColor:[UIColor clearColor]];
		} else if ([value isKindOfClass:[UIColor class]]) {
			[((ASUIButton*) self->uiView_) setBackgroundColor:((UIColor*) value)];
			[((ASUIButton*) self->uiView_) setImage:nil forState:UIControlStateNormal];
		} else {
			[((ASUIButton*) self->uiView_) setBackgroundColor:[UIColor clearColor]];
			[((ASUIButton*) self->uiView_) setImage:nil forState:UIControlStateNormal];
		}
	]-*/;
	
	private native void setImageNativeWithTemplate(Object value, Object tintColor) /*-[
		if (tintColor != nil) {
			[((ASUIButton*)self->uiView_).imageView setTintColor:(UIColor*)tintColor];
		}
		[((ASUIButton*) self->uiView_) setImage:[(UIImage*) value imageWithRenderingMode:UIImageRenderingModeAlwaysTemplate] forState:UIControlStateNormal];
	]-*/;
	
	private native void nativeSetContentMode(int contentMode)  /*-[
		[((ASUIButton*)self->uiView_).imageView setContentMode:contentMode];
	]-*/;
}
