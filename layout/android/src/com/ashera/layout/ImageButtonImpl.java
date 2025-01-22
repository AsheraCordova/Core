package com.ashera.layout;
//start - imports

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import android.content.Context;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.*;
import androidx.core.view.*;
import android.view.*;
import android.graphics.drawable.*;


import android.os.Build;
import android.view.View;
import android.text.*;

import com.ashera.core.IFragment;
import com.ashera.converter.*;

import android.annotation.SuppressLint;

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
public class ImageButtonImpl extends BaseWidget implements com.ashera.image.ITarget{
	//start - body
	public final static String LOCAL_NAME = "ImageButton"; 
	public final static String GROUP_NAME = "ImageButton";

	protected android.widget.ImageButton imageButton;
	
		@SuppressLint("NewApi")
		final static class ScaleType  extends AbstractStringToEnumConverter{
		private Map<String, Object> mapping = new HashMap<>();
				{
		
				mapping.put("center", android.widget.ImageView.ScaleType.CENTER);
		
		
				mapping.put("centerCrop", android.widget.ImageView.ScaleType.CENTER_CROP);
		
		
				mapping.put("centerInside", android.widget.ImageView.ScaleType.CENTER_INSIDE);
		
		
				mapping.put("fitCenter", android.widget.ImageView.ScaleType.FIT_CENTER);
		
		
				mapping.put("fitEnd", android.widget.ImageView.ScaleType.FIT_END);
		
		
				mapping.put("fitStart", android.widget.ImageView.ScaleType.FIT_START);
		
		
				mapping.put("fitXY", android.widget.ImageView.ScaleType.FIT_XY);
		
		
				mapping.put("matrix", android.widget.ImageView.ScaleType.MATRIX);
		
				}
		@Override
		public Map<String, Object> getMapping() {
				return mapping;
				}

		@Override
		public Object getDefault() {
				return null;
				}
				}
		@SuppressLint("NewApi")
		final static class TintMode  extends AbstractStringToEnumConverter{
		private Map<String, Object> mapping = new HashMap<>();
				{
		if (Build.VERSION.SDK_INT >= 11) {
				mapping.put("add", android.graphics.PorterDuff.Mode.ADD);
		}
		
				mapping.put("multiply", android.graphics.PorterDuff.Mode.MULTIPLY);
		
		
				mapping.put("screen", android.graphics.PorterDuff.Mode.SCREEN);
		
		
				mapping.put("src_atop", android.graphics.PorterDuff.Mode.SRC_ATOP);
		
		
				mapping.put("src_in", android.graphics.PorterDuff.Mode.SRC_IN);
		
		
				mapping.put("src_over", android.graphics.PorterDuff.Mode.SRC_OVER);
		
				}
		@Override
		public Map<String, Object> getMapping() {
				return mapping;
				}

		@Override
		public Object getDefault() {
				return null;
				}
				}
	
	@Override
	public void loadAttributes(String attributeName) {
		ViewImpl.register(attributeName);


		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("adjustViewBounds").withType("boolean").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("baseline").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("baselineAlignBottom").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("cropToPadding").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxHeight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxWidth").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		ConverterFactory.register("ImageButton.scaleType", new ScaleType());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scaleType").withType("ImageButton.scaleType"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tint").withType("colorstate"));
		ConverterFactory.register("ImageButton.tintMode", new TintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tintMode").withType("ImageButton.tintMode"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("src").withType("drawable"));
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

		
	public class ImageButtonExt extends android.widget.ImageButton implements ILifeCycleDecorator{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		
		public IWidget getWidget() {
			return ImageButtonImpl.this;
		}

		public ImageButtonExt(Context context, android.util.AttributeSet attrs, int defStyleAttr) {
	        super(context, attrs, defStyleAttr);
	    }

	    public ImageButtonExt(Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    	super(context, attrs, defStyleAttr, defStyleRes);
	    }
		public ImageButtonExt(Context context) {
			super(context);
			
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
			
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			
			replayBufferedEvents();
			
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
		public void onDraw(Canvas canvas) {
			Runnable runnable = () -> super.onDraw(canvas);
			executeMethodListeners("onDraw", runnable, canvas);
		}

		@Override
		public void draw(Canvas canvas) {
			Runnable runnable = () -> super.draw(canvas);
			executeMethodListeners("draw", runnable, canvas);
		}

		@SuppressLint("WrongCall")
		@Override
		public void execute(String method, Object... args) {
			switch (method) {
				case "onDraw":
					setOnMethodCalled(true);
					super.onDraw((Canvas) args[0]);
					break;

				case "draw":
					setOnMethodCalled(true);
					super.draw((Canvas) args[0]);
					break;

				default:
					break;
			}
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
        
    	public void setState0(float value) {
    		ViewImpl.setState(ImageButtonImpl.this, 0, value);
    	}
    	public void setState0(int value) {
    		ViewImpl.setState(ImageButtonImpl.this, 0, value);
    	}
    	public void setState0(double value) {
    		ViewImpl.setState(ImageButtonImpl.this, 0, value);
    	}
    	
    	public void setState0(Float value) {
    		ViewImpl.setState(ImageButtonImpl.this, 0, value);
    	}
    	public void setState0(Integer value) {
    		ViewImpl.setState(ImageButtonImpl.this, 0, value);
    	}
    	public void setState0(Double value) {
    		ViewImpl.setState(ImageButtonImpl.this, 0, value);
    	}
    	public void setState0(Object value) {
    		ViewImpl.setState(ImageButtonImpl.this, 0, value);
    	}
    	public void setState1(float value) {
    		ViewImpl.setState(ImageButtonImpl.this, 1, value);
    	}
    	public void setState1(int value) {
    		ViewImpl.setState(ImageButtonImpl.this, 1, value);
    	}
    	public void setState1(double value) {
    		ViewImpl.setState(ImageButtonImpl.this, 1, value);
    	}
    	
    	public void setState1(Float value) {
    		ViewImpl.setState(ImageButtonImpl.this, 1, value);
    	}
    	public void setState1(Integer value) {
    		ViewImpl.setState(ImageButtonImpl.this, 1, value);
    	}
    	public void setState1(Double value) {
    		ViewImpl.setState(ImageButtonImpl.this, 1, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(ImageButtonImpl.this, 1, value);
    	}
    	public void setState2(float value) {
    		ViewImpl.setState(ImageButtonImpl.this, 2, value);
    	}
    	public void setState2(int value) {
    		ViewImpl.setState(ImageButtonImpl.this, 2, value);
    	}
    	public void setState2(double value) {
    		ViewImpl.setState(ImageButtonImpl.this, 2, value);
    	}
    	
    	public void setState2(Float value) {
    		ViewImpl.setState(ImageButtonImpl.this, 2, value);
    	}
    	public void setState2(Integer value) {
    		ViewImpl.setState(ImageButtonImpl.this, 2, value);
    	}
    	public void setState2(Double value) {
    		ViewImpl.setState(ImageButtonImpl.this, 2, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(ImageButtonImpl.this, 2, value);
    	}
    	public void setState3(float value) {
    		ViewImpl.setState(ImageButtonImpl.this, 3, value);
    	}
    	public void setState3(int value) {
    		ViewImpl.setState(ImageButtonImpl.this, 3, value);
    	}
    	public void setState3(double value) {
    		ViewImpl.setState(ImageButtonImpl.this, 3, value);
    	}
    	
    	public void setState3(Float value) {
    		ViewImpl.setState(ImageButtonImpl.this, 3, value);
    	}
    	public void setState3(Integer value) {
    		ViewImpl.setState(ImageButtonImpl.this, 3, value);
    	}
    	public void setState3(Double value) {
    		ViewImpl.setState(ImageButtonImpl.this, 3, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(ImageButtonImpl.this, 3, value);
    	}
    	public void setState4(float value) {
    		ViewImpl.setState(ImageButtonImpl.this, 4, value);
    	}
    	public void setState4(int value) {
    		ViewImpl.setState(ImageButtonImpl.this, 4, value);
    	}
    	public void setState4(double value) {
    		ViewImpl.setState(ImageButtonImpl.this, 4, value);
    	}
    	
    	public void setState4(Float value) {
    		ViewImpl.setState(ImageButtonImpl.this, 4, value);
    	}
    	public void setState4(Integer value) {
    		ViewImpl.setState(ImageButtonImpl.this, 4, value);
    	}
    	public void setState4(Double value) {
    		ViewImpl.setState(ImageButtonImpl.this, 4, value);
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
Context context = (Context) fragment.getRootActivity();
	Object systemStyle = params.get("systemStyle");
	Object systemAndroidAttrStyle = params.get("systemAndroidAttrStyle");
	
	if (systemStyle == null && systemAndroidAttrStyle == null) {
		imageButton = new ImageButtonExt(context);
	} else {
		int defStyleAttr = 0;
		int defStyleRes = 0;
		
		if (systemStyle != null) {
			defStyleRes = context.getResources().getIdentifier((String) systemStyle, "style", context.getPackageName());	
		}
		
		if (systemAndroidAttrStyle != null) {
			defStyleAttr = context.getResources().getIdentifier((String) systemAndroidAttrStyle, "attr", "android");	
		}
		
		if (defStyleRes == 0) {
			imageButton = new ImageButtonExt(context, null, defStyleAttr);	
		} else {
			imageButton = new ImageButtonExt(context, null, defStyleAttr, defStyleRes);
		}
		
	}

		nativeCreate(params);	
		ViewImpl.registerCommandConveter(this);
	}

	@Override
	@SuppressLint("NewApi")
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		Object nativeWidget = asNativeWidget();
		ViewImpl.setAttribute(this,  key, strValue, objValue, decorator);
		
		switch (key.getAttributeName()) {
			case "adjustViewBounds": {
				


	imageButton.setAdjustViewBounds((boolean)objValue);



			}
			break;
			case "baseline": {
				
if (Build.VERSION.SDK_INT >= 11) {

	imageButton.setBaseline((int)objValue);

}

			}
			break;
			case "baselineAlignBottom": {
				
if (Build.VERSION.SDK_INT >= 11) {

	imageButton.setBaselineAlignBottom((boolean)objValue);

}

			}
			break;
			case "cropToPadding": {
				
if (Build.VERSION.SDK_INT >= 16) {

	imageButton.setCropToPadding((boolean)objValue);

}

			}
			break;
			case "maxHeight": {
				


	imageButton.setMaxHeight((int)objValue);



			}
			break;
			case "maxWidth": {
				


	imageButton.setMaxWidth((int)objValue);



			}
			break;
			case "scaleType": {
				


	imageButton.setScaleType((android.widget.ImageView.ScaleType)objValue);



			}
			break;
			case "tint": {
				
if (Build.VERSION.SDK_INT >= 21) {

	imageButton.setImageTintList((android.content.res.ColorStateList)objValue);

}

			}
			break;
			case "tintMode": {
				
if (Build.VERSION.SDK_INT >= 21) {

	imageButton.setImageTintMode((android.graphics.PorterDuff.Mode)objValue);

}

			}
			break;
			case "src": {
				


		setSrc(objValue);



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
				


		//



			}
			break;
			case "paddingBottom": {
				


		//



			}
			break;
			case "paddingRight": {
				


		//



			}
			break;
			case "paddingLeft": {
				


		//



			}
			break;
			case "paddingStart": {
				


		//



			}
			break;
			case "paddingEnd": {
				


		//



			}
			break;
			case "paddingTop": {
				


		//



			}
			break;
			case "paddingHorizontal": {
				


		//



			}
			break;
			case "paddingVertical": {
				


		//



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
			case "adjustViewBounds": {
return imageButton.getAdjustViewBounds();				}
			case "baseline": {
return imageButton.getBaseline();				}
			case "baselineAlignBottom": {
if (Build.VERSION.SDK_INT >= 11) {
return imageButton.getBaselineAlignBottom();
}
break;				}
			case "cropToPadding": {
if (Build.VERSION.SDK_INT >= 16) {
return imageButton.getCropToPadding();
}
break;				}
			case "maxHeight": {
return imageButton.getMaxHeight();				}
			case "maxWidth": {
return imageButton.getMaxWidth();				}
			case "scaleType": {
return imageButton.getScaleType();				}
			case "tint": {
if (Build.VERSION.SDK_INT >= 21) {
return imageButton.getImageTintList();
}
break;				}
			case "tintMode": {
if (Build.VERSION.SDK_INT >= 21) {
return imageButton.getImageTintMode();
}
break;				}
			case "src": {
return getSrc();				}
			case "paddingBottom": {
return null;				}
			case "paddingRight": {
return null;				}
			case "paddingLeft": {
return null;				}
			case "paddingStart": {
return null;				}
			case "paddingEnd": {
return null;				}
			case "paddingTop": {
return null;				}
		}
		
		return null;
	}
	
	@Override
	public Object asWidget() {
		return imageButton;
	}

	

	private Drawable  imageFromUrlPlaceHolder;
	private Drawable  imageFromUrlError;
	
	private void setImageFromUrlError(Object objValue) {
		imageFromUrlError = (android.graphics.drawable.Drawable) objValue;		
	}
    private void setSrc(Object objValue) {
    	imageButton.setImageDrawable((android.graphics.drawable.Drawable) objValue);
    }
	
	private void setImageFromUrlPlaceHolder(Object objValue) {
		imageFromUrlPlaceHolder = (android.graphics.drawable.Drawable) objValue;
	}    
	
	private Object getSrc() {
		return imageButton.getDrawable();
	}
	private void setImageFromUrl(Object objValue) {
		com.ashera.image.ImageDownloaderFactory.get().download(imageButton.getContext(), (String) objValue, imageFromUrlPlaceHolder, imageFromUrlError,  this);
	}


	@Override
	public void onBitmapLoaded(Object bitmap) {
		imageButton.setImageBitmap((android.graphics.Bitmap) bitmap);
	}

	@Override
	public void onBitmapFailed(Object errorDrawable) {
		if (errorDrawable != null) {
			imageButton.setImageDrawable((Drawable) errorDrawable);
		}
		
	}

	@Override
	public void onPrepareLoad(Object placeHolderDrawable) {
		if (placeHolderDrawable == null) {
			imageButton.setImageDrawable(new android.graphics.drawable.ColorDrawable(imageButton.getContext().getColor(android.R.color.transparent)));
		} else {
			imageButton.setImageDrawable((Drawable) placeHolderDrawable);
		}
		
	}

    

	
	    @Override
	    public Object asNativeWidget() {
	        return imageButton;
	    }

	    private void nativeCreate(Map<String, Object> params) {
	    }
	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			imageButton.setId((int) quickConvert(id, "id"));
		}
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

}
