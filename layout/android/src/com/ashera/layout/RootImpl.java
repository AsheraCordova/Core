package com.ashera.layout;

//start - imports
import java.util.*;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.*;
import android.widget.*;
import android.view.View.*;

import com.ashera.widget.BaseHasWidgets;

import android.annotation.SuppressLint;

import com.ashera.core.IFragment;
import com.ashera.widget.bus.*;
import com.ashera.converter.*;
import com.ashera.widget.bus.Event.*;
import com.ashera.widget.*;
import com.ashera.widget.IWidgetLifeCycleListener.*;
import com.ashera.layout.*;

import android.graphics.Canvas;
import android.widget.*;
import androidx.core.view.*;
import android.view.*;

import static com.ashera.widget.IWidget.*;
//end - imports

public class RootImpl extends BaseHasWidgets implements IRoot{
    //start - body
	public final static String LOCAL_NAME = "layout"; 
	public final static String GROUP_NAME = "layout";
	private android.widget.RelativeLayout relativeLayout;
	

	
		@SuppressLint("NewApi")
		final static class RemoveRule  extends AbstractBitFlagConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("layout_above", -0x1);
				mapping.put("layout_alignBaseline", -0x2);
				mapping.put("layout_alignBottom", -0x4);
				mapping.put("layout_alignEnd", -0x8);
				mapping.put("layout_alignLeft", -0x16);
				mapping.put("layout_alignParentBottom", -0x32);
				mapping.put("layout_alignParentEnd", -0x64);
				mapping.put("layout_alignParentLeft", -0x128);
				mapping.put("layout_alignParentRight", -0x256);
				mapping.put("layout_alignParentStart", -0x1024);
				mapping.put("layout_alignParentTop", 0x0);
				mapping.put("layout_alignRight", 0x1);
				mapping.put("layout_alignStart", 0x2);
				mapping.put("layout_alignTop", 0x4);
				mapping.put("layout_below", 0x8);
				mapping.put("layout_centerHorizontal", 0x16);
				mapping.put("layout_centerInParent", 0x32);
				mapping.put("layout_centerVertical", 0x64);
				mapping.put("layout_toEndOf", 0x128);
				mapping.put("layout_toLeftOf", 0x256);
				mapping.put("layout_toRightOf", 0x1024);
				mapping.put("layout_toStartOf", 0x2048);
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
	public void loadAttributes(String localName) {
		ViewGroupImpl.register(localName);

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("gravity").withType("gravity"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("ignoreGravity").withType("id"));
	
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_above").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignBaseline").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignBottom").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignEnd").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignLeft").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignParentBottom").withType("boolean").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignParentEnd").withType("boolean").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignParentLeft").withType("boolean").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignParentRight").withType("boolean").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignParentStart").withType("boolean").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignParentTop").withType("boolean").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignRight").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignStart").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignTop").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_below").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_centerHorizontal").withType("boolean").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_centerInParent").withType("boolean").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_centerVertical").withType("boolean").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_toEndOf").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_toLeftOf").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_toRightOf").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_toStartOf").withType("id").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_alignWithParentIfMissing").withType("boolean").forChild());
				ConverterFactory.register("layout.removeRule", new RemoveRule());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_removeRule").withType("layout.removeRule").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_removeAllRules").withType("boolean").forChild());
	}
	
	public RootImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  RootImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  RootImpl(String groupName, String localname) {
		super(groupName, localname);
	}

	@Override
	public IWidget newInstance() {
		return new RootImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
Context context = (Context) fragment.getRootActivity();
	Object systemStyle = params.get("systemStyle");
	Object systemAndroidAttrStyle = params.get("systemAndroidAttrStyle");
	
	if (systemStyle == null && systemAndroidAttrStyle == null) {
		relativeLayout = new RootExt(context);
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
			relativeLayout = new RootExt(context, null, defStyleAttr);	
		} else {
			relativeLayout = new RootExt(context, null, defStyleAttr, defStyleRes);
		}
		
	}

		
		nativeCreate(params);
		
		if (ViewImpl.isRTLLayout(this)) {
			ViewImpl.setLayoutDirection(this, View.LAYOUT_DIRECTION_RTL);
		} else {
			ViewImpl.setLayoutDirection(this, View.LAYOUT_DIRECTION_LTR);
		}
		
		ViewGroupImpl.registerCommandConveter(this);

	}

	@Override
	public Object asWidget() {
		return relativeLayout;
	}

	@Override
	public boolean remove(IWidget w) {
		boolean remove = super.remove(w);
		relativeLayout.removeView((View) w.asWidget());
		return remove;
	}
	
	@Override
    public boolean remove(int index) {
		IWidget widget = widgets.get(index);
        boolean remove = super.remove(index);

        if (index + 1 <= relativeLayout.getChildCount()) {
            relativeLayout.removeViewAt(index);
        }    
        return remove;
    }

	
	@Override
	public void add(IWidget w, int index) {
		if (index != -2) {
			View view = (View) w.asWidget();
			createLayoutParams(view);
			    if (index == -1) {
			        relativeLayout.addView(view);
			    } else {
			        relativeLayout.addView(view, index);
			    }
		}
		
		ViewGroupImpl.nativeAddView(asNativeWidget(), w.asNativeWidget());
		super.add(w, index);
	}
	
	private void createLayoutParams(View view) {
		android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
		
		layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
		if (layoutParams == null) {
			layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
			view.setLayoutParams(layoutParams);
		}  else {
			layoutParams.height = -2;
			layoutParams.width = -2;
		}
	}
	
	private android.widget.RelativeLayout.LayoutParams getLayoutParams(View view) {
		return (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();		
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setChildAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue) {
		View view = (View) w.asWidget();
		android.widget.RelativeLayout.LayoutParams layoutParams = getLayoutParams(view);
		ViewGroupImpl.setChildAttribute(w, key, objValue, layoutParams);		
		
		switch (key.getAttributeName()) {
		case "layout_width":
			layoutParams.width = (int) objValue;
			break;	
		case "layout_height":
			layoutParams.height = (int) objValue;
			break;
			case "layout_above": {
				
							addRule(layoutParams, android.widget.RelativeLayout.ABOVE, objValue);
				
			}
			break;
			case "layout_alignBaseline": {
				
							addRule(layoutParams, android.widget.RelativeLayout.ALIGN_BASELINE, objValue);
				
			}
			break;
			case "layout_alignBottom": {
				
							addRule(layoutParams, android.widget.RelativeLayout.ALIGN_BOTTOM, objValue);
				
			}
			break;
			case "layout_alignEnd": {
				
							addRule(layoutParams, android.widget.RelativeLayout.ALIGN_END, objValue);
				
			}
			break;
			case "layout_alignLeft": {
				
							addRule(layoutParams, android.widget.RelativeLayout.ALIGN_LEFT, objValue);
				
			}
			break;
			case "layout_alignParentBottom": {
				
							addRemoveRule(layoutParams, android.widget.RelativeLayout.ALIGN_PARENT_BOTTOM, objValue);
				
			}
			break;
			case "layout_alignParentEnd": {
				
							addRemoveRule(layoutParams, android.widget.RelativeLayout.ALIGN_PARENT_END, objValue);
				
			}
			break;
			case "layout_alignParentLeft": {
				
							addRemoveRule(layoutParams, android.widget.RelativeLayout.ALIGN_PARENT_LEFT, objValue);
				
			}
			break;
			case "layout_alignParentRight": {
				
							addRemoveRule(layoutParams, android.widget.RelativeLayout.ALIGN_PARENT_RIGHT, objValue);
				
			}
			break;
			case "layout_alignParentStart": {
				
							addRemoveRule(layoutParams, android.widget.RelativeLayout.ALIGN_PARENT_START, objValue);
				
			}
			break;
			case "layout_alignParentTop": {
				
							addRemoveRule(layoutParams, android.widget.RelativeLayout.ALIGN_PARENT_TOP, objValue);
				
			}
			break;
			case "layout_alignRight": {
				
							addRule(layoutParams, android.widget.RelativeLayout.ALIGN_RIGHT, objValue);
				
			}
			break;
			case "layout_alignStart": {
				
							addRule(layoutParams, android.widget.RelativeLayout.ALIGN_START, objValue);
				
			}
			break;
			case "layout_alignTop": {
				
							addRule(layoutParams, android.widget.RelativeLayout.ALIGN_TOP, objValue);
				
			}
			break;
			case "layout_below": {
				
							addRule(layoutParams, android.widget.RelativeLayout.BELOW, objValue);
				
			}
			break;
			case "layout_centerHorizontal": {
				
							addRemoveRule(layoutParams, android.widget.RelativeLayout.CENTER_HORIZONTAL, objValue);
				
			}
			break;
			case "layout_centerInParent": {
				
							addRemoveRule(layoutParams, android.widget.RelativeLayout.CENTER_IN_PARENT, objValue);
				
			}
			break;
			case "layout_centerVertical": {
				
							addRemoveRule(layoutParams, android.widget.RelativeLayout.CENTER_VERTICAL, objValue);
				
			}
			break;
			case "layout_toEndOf": {
				
							addRule(layoutParams, android.widget.RelativeLayout.END_OF, objValue);
				
			}
			break;
			case "layout_toLeftOf": {
				
							addRule(layoutParams, android.widget.RelativeLayout.LEFT_OF, objValue);
				
			}
			break;
			case "layout_toRightOf": {
				
							addRule(layoutParams, android.widget.RelativeLayout.RIGHT_OF, objValue);
				
			}
			break;
			case "layout_toStartOf": {
				
							addRule(layoutParams, android.widget.RelativeLayout.START_OF, objValue);
				
			}
			break;
			case "layout_alignWithParentIfMissing": {
				
							layoutParams.alignWithParent = ((boolean)objValue);
				
			}
			break;
			case "layout_removeRule": {
				
							 removeRule(layoutParams, objValue);
				
			}
			break;
			case "layout_removeAllRules": {
				
							 removeAllRules(layoutParams);
				
			}
			break;
		default:
			break;
		}
		
		
		view.setLayoutParams(layoutParams);		
	}
	
	@SuppressLint("NewApi")
	@Override
	public Object getChildAttribute(IWidget w, WidgetAttribute key) {
		Object attributeValue = ViewGroupImpl.getChildAttribute(w, key);		
		if (attributeValue != null) {
			return attributeValue;
		}
		View view = (View) w.asWidget();
		android.widget.RelativeLayout.LayoutParams layoutParams = getLayoutParams(view);

		switch (key.getAttributeName()) {
		case "layout_width":
			return layoutParams.width;
		case "layout_height":
			return layoutParams.height;
			case "layout_above": {
return getRule(layoutParams, android.widget.RelativeLayout.ABOVE);			}

			case "layout_alignBaseline": {
return getRule(layoutParams, android.widget.RelativeLayout.ALIGN_BASELINE);			}

			case "layout_alignBottom": {
return getRule(layoutParams, android.widget.RelativeLayout.ALIGN_BOTTOM);			}

			case "layout_alignEnd": {
return getRule(layoutParams, android.widget.RelativeLayout.ALIGN_END);			}

			case "layout_alignLeft": {
return getRule(layoutParams, android.widget.RelativeLayout.ALIGN_LEFT);			}

			case "layout_alignParentBottom": {
return getBoolRule(layoutParams, android.widget.RelativeLayout.ALIGN_PARENT_BOTTOM);			}

			case "layout_alignParentEnd": {
return getBoolRule(layoutParams, android.widget.RelativeLayout.ALIGN_PARENT_END);			}

			case "layout_alignParentLeft": {
return getBoolRule(layoutParams, android.widget.RelativeLayout.ALIGN_PARENT_LEFT);			}

			case "layout_alignParentRight": {
return getBoolRule(layoutParams, android.widget.RelativeLayout.ALIGN_PARENT_RIGHT);			}

			case "layout_alignParentStart": {
return getBoolRule(layoutParams, android.widget.RelativeLayout.ALIGN_PARENT_START);			}

			case "layout_alignParentTop": {
return getBoolRule(layoutParams, android.widget.RelativeLayout.ALIGN_PARENT_TOP);			}

			case "layout_alignRight": {
return getRule(layoutParams, android.widget.RelativeLayout.ALIGN_RIGHT);			}

			case "layout_alignStart": {
return getRule(layoutParams, android.widget.RelativeLayout.ALIGN_START);			}

			case "layout_alignTop": {
return getRule(layoutParams, android.widget.RelativeLayout.ALIGN_TOP);			}

			case "layout_below": {
return getRule(layoutParams, android.widget.RelativeLayout.BELOW);			}

			case "layout_centerHorizontal": {
return getBoolRule(layoutParams, android.widget.RelativeLayout.CENTER_HORIZONTAL);			}

			case "layout_centerInParent": {
return getBoolRule(layoutParams, android.widget.RelativeLayout.CENTER_IN_PARENT);			}

			case "layout_centerVertical": {
return getBoolRule(layoutParams, android.widget.RelativeLayout.CENTER_VERTICAL);			}

			case "layout_toEndOf": {
return getRule(layoutParams, android.widget.RelativeLayout.END_OF);			}

			case "layout_toLeftOf": {
return getRule(layoutParams, android.widget.RelativeLayout.LEFT_OF);			}

			case "layout_toRightOf": {
return getRule(layoutParams, android.widget.RelativeLayout.RIGHT_OF);			}

			case "layout_toStartOf": {
return getRule(layoutParams, android.widget.RelativeLayout.START_OF);			}

			case "layout_alignWithParentIfMissing": {
return layoutParams.alignWithParent;			}



		}
		
		return null;

	}
	
		
	public class RootExt extends android.widget.RelativeLayout implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		
		public IWidget getWidget() {
			return RootImpl.this;
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

		public RootExt(Context context, android.util.AttributeSet attrs, int defStyleAttr) {
	        super(context, attrs, defStyleAttr);
	    }

	    public RootExt(Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    	super(context, attrs, defStyleAttr, defStyleRes);
	    }
		public RootExt(Context context) {
			super(context);
			
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
				RootImpl.this.invalidate();
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
        		ViewImpl.drawableStateChanged(RootImpl.this);
        	}
        }
        
    	public void setState0(float value) {
    		ViewImpl.setState(RootImpl.this, 0, value);
    	}
    	public void setState0(int value) {
    		ViewImpl.setState(RootImpl.this, 0, value);
    	}
    	public void setState0(double value) {
    		ViewImpl.setState(RootImpl.this, 0, value);
    	}
    	
    	public void setState0(Float value) {
    		ViewImpl.setState(RootImpl.this, 0, value);
    	}
    	public void setState0(Integer value) {
    		ViewImpl.setState(RootImpl.this, 0, value);
    	}
    	public void setState0(Double value) {
    		ViewImpl.setState(RootImpl.this, 0, value);
    	}
    	public void setState0(Object value) {
    		ViewImpl.setState(RootImpl.this, 0, value);
    	}
    	public void setState1(float value) {
    		ViewImpl.setState(RootImpl.this, 1, value);
    	}
    	public void setState1(int value) {
    		ViewImpl.setState(RootImpl.this, 1, value);
    	}
    	public void setState1(double value) {
    		ViewImpl.setState(RootImpl.this, 1, value);
    	}
    	
    	public void setState1(Float value) {
    		ViewImpl.setState(RootImpl.this, 1, value);
    	}
    	public void setState1(Integer value) {
    		ViewImpl.setState(RootImpl.this, 1, value);
    	}
    	public void setState1(Double value) {
    		ViewImpl.setState(RootImpl.this, 1, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(RootImpl.this, 1, value);
    	}
    	public void setState2(float value) {
    		ViewImpl.setState(RootImpl.this, 2, value);
    	}
    	public void setState2(int value) {
    		ViewImpl.setState(RootImpl.this, 2, value);
    	}
    	public void setState2(double value) {
    		ViewImpl.setState(RootImpl.this, 2, value);
    	}
    	
    	public void setState2(Float value) {
    		ViewImpl.setState(RootImpl.this, 2, value);
    	}
    	public void setState2(Integer value) {
    		ViewImpl.setState(RootImpl.this, 2, value);
    	}
    	public void setState2(Double value) {
    		ViewImpl.setState(RootImpl.this, 2, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(RootImpl.this, 2, value);
    	}
    	public void setState3(float value) {
    		ViewImpl.setState(RootImpl.this, 3, value);
    	}
    	public void setState3(int value) {
    		ViewImpl.setState(RootImpl.this, 3, value);
    	}
    	public void setState3(double value) {
    		ViewImpl.setState(RootImpl.this, 3, value);
    	}
    	
    	public void setState3(Float value) {
    		ViewImpl.setState(RootImpl.this, 3, value);
    	}
    	public void setState3(Integer value) {
    		ViewImpl.setState(RootImpl.this, 3, value);
    	}
    	public void setState3(Double value) {
    		ViewImpl.setState(RootImpl.this, 3, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(RootImpl.this, 3, value);
    	}
    	public void setState4(float value) {
    		ViewImpl.setState(RootImpl.this, 4, value);
    	}
    	public void setState4(int value) {
    		ViewImpl.setState(RootImpl.this, 4, value);
    	}
    	public void setState4(double value) {
    		ViewImpl.setState(RootImpl.this, 4, value);
    	}
    	
    	public void setState4(Float value) {
    		ViewImpl.setState(RootImpl.this, 4, value);
    	}
    	public void setState4(Integer value) {
    		ViewImpl.setState(RootImpl.this, 4, value);
    	}
    	public void setState4(Double value) {
    		ViewImpl.setState(RootImpl.this, 4, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(RootImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(RootImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(RootImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(RootImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(RootImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(RootImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(RootImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(RootImpl.this);
        }
     
	
	}
	@Override
	public Class getViewClass() {
		return RootExt.class;
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
				ViewGroupImpl.setAttribute(this,  key, strValue, objValue, decorator);
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "gravity": {


	relativeLayout.setGravity((int)objValue);



			}
			break;
			case "ignoreGravity": {


	relativeLayout.setIgnoreGravity((int)objValue);



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
		Object attributeValue = ViewGroupImpl.getAttribute(this, key, decorator);
		if (attributeValue != null) {
			return attributeValue;
		}
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "gravity": {
return relativeLayout.getGravity();			}
		}
		return null;
	}


	@Override
    public Object asNativeWidget() {
        return relativeLayout;
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
    
	

	private void addRule(android.widget.RelativeLayout.LayoutParams layoutParams, int rule, Object objValue) {
		layoutParams.addRule(rule, (int) objValue);
	}


	private void addRemoveRule(android.widget.RelativeLayout.LayoutParams layoutParams, int rule, Object objValue) {
		if ((boolean) objValue) {
			layoutParams.addRule(rule);
		} else {
			removeRule(layoutParams, rule);
			rule = getInferredRule(rule);
			removeRule(layoutParams, rule);
		}
	}

	@SuppressLint("NewApi")
	private void removeRule(android.widget.RelativeLayout.LayoutParams layoutParams, int rule) {
		if (Build.VERSION.SDK_INT >= 17) {
			layoutParams.removeRule(rule);
		} else {
			layoutParams.addRule(rule, 0);	
		}
	}
	
	@SuppressLint("NewApi")
	private Object getRule(android.widget.RelativeLayout.LayoutParams layoutParams, int rule) {
		if (Build.VERSION.SDK_INT >= 23) {
			rule = getInferredRule(rule);
			return layoutParams.getRule(rule);
		} 
		return null;
	}
	
	@SuppressLint("NewApi")
	private Object getBoolRule(android.widget.RelativeLayout.LayoutParams layoutParams, int rule) {
		if (Build.VERSION.SDK_INT >= 23) {
			rule = getInferredRule(rule);
			return layoutParams.getRule(rule) != 0;
		} 
		return null;
	}

	private int getInferredRule(int rule) {
		if (rule == android.widget.RelativeLayout.ALIGN_PARENT_END) {
			rule = ViewImpl.isRTLLayoutDirection(this) ? android.widget.RelativeLayout.ALIGN_PARENT_LEFT :  android.widget.RelativeLayout.ALIGN_PARENT_RIGHT;
		}
		if (rule == android.widget.RelativeLayout.ALIGN_PARENT_START) {
			rule = ViewImpl.isRTLLayoutDirection(this) ? android.widget.RelativeLayout.ALIGN_PARENT_RIGHT :  android.widget.RelativeLayout.ALIGN_PARENT_LEFT;
		}
		if (rule == android.widget.RelativeLayout.END_OF) {
			rule = ViewImpl.isRTLLayoutDirection(this) ? android.widget.RelativeLayout.LEFT_OF :  android.widget.RelativeLayout.RIGHT_OF;
		}
		if (rule == android.widget.RelativeLayout.START_OF) {
			rule = ViewImpl.isRTLLayoutDirection(this) ? android.widget.RelativeLayout.RIGHT_OF :  android.widget.RelativeLayout.LEFT_OF;
		}
		if (rule == android.widget.RelativeLayout.ALIGN_END) {
			rule = ViewImpl.isRTLLayoutDirection(this) ? android.widget.RelativeLayout.ALIGN_LEFT :  android.widget.RelativeLayout.ALIGN_RIGHT;
		}
		if (rule == android.widget.RelativeLayout.ALIGN_START) {
			rule = ViewImpl.isRTLLayoutDirection(this) ? android.widget.RelativeLayout.ALIGN_RIGHT :  android.widget.RelativeLayout.ALIGN_LEFT;
		}
		return rule;
	}
	private HashMap<String, Integer> ruleMapper = new HashMap<>();
	{
		ruleMapper.put("layout_above", android.widget.RelativeLayout.ABOVE);
		ruleMapper.put("layout_alignBaseline", android.widget.RelativeLayout.ALIGN_BASELINE);
		ruleMapper.put("layout_alignBottom", android.widget.RelativeLayout.ALIGN_BOTTOM);
		ruleMapper.put("layout_alignEnd", android.widget.RelativeLayout.ALIGN_END);
		ruleMapper.put("layout_alignLeft", android.widget.RelativeLayout.ALIGN_LEFT);
		ruleMapper.put("layout_alignParentBottom", android.widget.RelativeLayout.ALIGN_PARENT_BOTTOM);
		ruleMapper.put("layout_alignParentEnd", android.widget.RelativeLayout.ALIGN_PARENT_END);
		ruleMapper.put("layout_alignParentLeft", android.widget.RelativeLayout.ALIGN_PARENT_LEFT);
		ruleMapper.put("layout_alignParentRight", android.widget.RelativeLayout.ALIGN_PARENT_RIGHT);
		ruleMapper.put("layout_alignParentStart", android.widget.RelativeLayout.ALIGN_PARENT_START);
		ruleMapper.put("layout_alignParentTop", android.widget.RelativeLayout.ALIGN_PARENT_TOP);
		ruleMapper.put("layout_alignRight", android.widget.RelativeLayout.ALIGN_RIGHT);
		ruleMapper.put("layout_alignStart", android.widget.RelativeLayout.ALIGN_START);
		ruleMapper.put("layout_alignTop", android.widget.RelativeLayout.ALIGN_TOP);
		ruleMapper.put("layout_below", android.widget.RelativeLayout.BELOW);
		ruleMapper.put("layout_centerHorizontal", android.widget.RelativeLayout.CENTER_HORIZONTAL);
		ruleMapper.put("layout_centerVertical", android.widget.RelativeLayout.CENTER_VERTICAL);
		ruleMapper.put("layout_centerInParent", android.widget.RelativeLayout.CENTER_IN_PARENT);
		ruleMapper.put("layout_toEndOf", android.widget.RelativeLayout.END_OF);
		ruleMapper.put("layout_toLeftOf", android.widget.RelativeLayout.LEFT_OF);
		ruleMapper.put("layout_toRightOf", android.widget.RelativeLayout.RIGHT_OF);
		ruleMapper.put("layout_toStartOf", android.widget.RelativeLayout.START_OF);
	}
	private void removeAllRules(android.widget.RelativeLayout.LayoutParams layoutParams) {
		RemoveRule removeRule = (RemoveRule) ConverterFactory.get("RelativeLayout.removeRule");
		Collection<String> keys = removeRule.mapping.keySet();
		for (String key : keys) {
			int rule = ruleMapper.get(key);
			removeRule(layoutParams, rule);
			rule = getInferredRule(rule);
			removeRule(layoutParams, rule);
		}
		
	}

	private <A, B> Map<B, A> invertMap(Map<A, B> map) {
	    Map<B, A> reverseMap = new HashMap<>();
	    for (Map.Entry<A, B> entry : map.entrySet()) {
	        reverseMap.put(entry.getValue(), entry.getKey());
	    }
	    return reverseMap;
	}
	private void removeRule(android.widget.RelativeLayout.LayoutParams layoutParams, Object objValue) {
		RemoveRule removeRule = (RemoveRule) ConverterFactory.get("RelativeLayout.removeRule");
		int rule = (int) objValue;
		
		Map<Integer, String> reverseMap = invertMap(removeRule.mapping);
		Collection<Integer> flags = removeRule.getReverseMappingFlags();
		for (int flag : flags) {
			if ((rule & flag) != 0) {
				int finalRule  = ruleMapper.get(reverseMap.get(flag));
				removeRule(layoutParams, finalRule);
				finalRule = getInferredRule(finalRule);
				removeRule(layoutParams, finalRule);
			}
		}
		
	}
	


	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			relativeLayout.setId((int) quickConvert(id, "id"));
		}
	}
	
    

		//end - body
    private void nativeCreate(Map<String, Object> params) {
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT));
        this.fragment.setRootWidget(this);
        applyStyleToWidgets();
    }

    @Override
    public void measure() {
        // nothing to measure
    }
    
    @Override
    public void measure(int x, int y, int width, int height) {
    	// nothing to measure
    }
    

	
	private void postSetAttribute(WidgetAttribute key, String strValue, Object objValue,
			ILifeCycleDecorator decorator) {
		switch (key.getAttributeName()) {
		case "fitsSystemWindows":
			setupForInsets();
			break;

		default:
			break;
		}

		setupForInsets();
	}
    //start - fitSystemWindows
    androidx.core.view.OnApplyWindowInsetsListener mApplyWindowInsetsListener; 
    private void setupForInsets() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }

        if (ViewCompat.getFitsSystemWindows(relativeLayout)) {
            if (mApplyWindowInsetsListener == null) {
                mApplyWindowInsetsListener =
                        new androidx.core.view.OnApplyWindowInsetsListener() {
                            @Override
                            public WindowInsetsCompat onApplyWindowInsets(View v,
                                    WindowInsetsCompat insets) {
                                return insets.consumeSystemWindowInsets();
                            }
                        };
            }
            // First apply the insets listener
            ViewCompat.setOnApplyWindowInsetsListener(relativeLayout, mApplyWindowInsetsListener);

            // Now set the sys ui flags to enable us to lay out in the window insets
            relativeLayout.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        } else {
            ViewCompat.setOnApplyWindowInsetsListener(relativeLayout, null);
        }
    }
    //end - fitSystemWindows
    //start - displayErrorIndicator
	@Override
	public void displayErrorIndicator() {
		IWidget widget = findWidgetById("@+id/errorBanner");
		if (widget != null) {
			widget.setVisible(true);
		} else {
			IWidget button = WidgetFactory.createWidget("TextView", "TextView", this, false);
			button.setId("@+id/errorBanner");
			button.setAttribute("style", "@style/error_banner", false);
			button.setAttribute("onClick", "onError(data = . from fatalErrors->view)", false);
		}}
	//end - displayErrorIndicator
}
