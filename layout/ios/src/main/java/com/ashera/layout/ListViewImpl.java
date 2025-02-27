package com.ashera.layout;
// start - imports
import java.util.*;

import r.android.annotation.SuppressLint;
import r.android.content.Context;
import r.android.os.Build;
import r.android.view.*;
import r.android.widget.*;
import r.android.view.View.*;

import com.ashera.widget.BaseHasWidgets;

import r.android.annotation.SuppressLint;

import com.ashera.core.IFragment;
import com.ashera.widget.bus.*;
import com.ashera.converter.*;
import com.ashera.widget.bus.Event.*;
import com.ashera.widget.*;
import com.ashera.widget.IWidgetLifeCycleListener.*;
import com.ashera.layout.*;

/*-[
#include <UIKit/UIKit.h>
#include "ASUIView.h"
#include "HasLifeCycleDecorators.h"
]-*/
import com.google.j2objc.annotations.Property;
import androidx.core.view.*;

import static com.ashera.widget.IWidget.*;
//end - imports
/*-[
#include "CustomUITableViewCell.h"
#include "ASUITableView.h"
#include "ASUILongTapGestureRecognizer.h"
#include "java/lang/Float.h"
]-*/
public class ListViewImpl extends BaseHasWidgets {
	//start - body
	private @Property Object uiView;
	public final static String LOCAL_NAME = "ListView"; 
	public final static String GROUP_NAME = "ListView";
	private r.android.widget.ListView listView;
	

	
		@SuppressLint("NewApi")
		final static class ChoiceMode extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("multipleChoice",  0x2);
				mapping.put("multipleChoiceModal",  0x3);
				mapping.put("none",  0x0);
				mapping.put("singleChoice",  0x1);
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
		final static class IosSeparatorStyle extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("none",  LayoutNativeVars.UITableViewCellSeparatorStyleNone);
				mapping.put("singleLine",  LayoutNativeVars.UITableViewCellSeparatorStyleSingleLine);
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
		final static class IosCellSelectionStyle extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("none",  LayoutNativeVars.UITableViewCellSelectionStyleNone);
				mapping.put("gray",  LayoutNativeVars.UITableViewCellSelectionStyleGray);
				mapping.put("blue",  LayoutNativeVars.UITableViewCellSelectionStyleBlue);
				mapping.put("default",  LayoutNativeVars.UITableViewCellSelectionStyleDefault);
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

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosRowHeight").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosEstimatedRowHeight").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosCellLayoutMarginsFollowReadableWidth").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosInsetsContentViewsToSafeArea").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosSectionHeaderHeight").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosSectionFooterHeight").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosEstimatedSectionHeaderHeight").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosEstimatedSectionFooterHeight").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosSectionHeaderTopPadding").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosSeparatorColor").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosNumberOfSections").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosAllowsSelection").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosAllowsMultipleSelection").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosAllowsSelectionDuringEditing").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosAllowsMultipleSelectionDuringEditing").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosSelectionFollowsFocus").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosSectionIndexMinimumDisplayRowCount").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosSectionIndexColor").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosSectionIndexBackgroundColor").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosSectionIndexTrackingBackgroundColor").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosHasUncommittedUpdates").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosHasActiveDrag").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosDragInteractionEnabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosHasActiveDrop").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosIsEditing").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosRemembersLastFocusedIndexPath").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosAllowsFocus").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosAllowsFocusDuringEditing").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosFillerRowHeight").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosIsPrefetchingEnabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onItemClick").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onItemLongClick").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onScrollChange").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("listheader").withType("template").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("listfooter").withType("template").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scrollX").withType("dimension").withBufferStrategy(BUFFER_STRATEGY_DURING_INIT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scrollY").withType("dimension").withBufferStrategy(BUFFER_STRATEGY_DURING_INIT));
		ConverterFactory.register("ListView.choiceMode", new ChoiceMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("choiceMode").withType("ListView.choiceMode"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("stackFromBottom").withType("boolean").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("listSelector").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		ConverterFactory.register("ListView.iosSeparatorStyle", new IosSeparatorStyle());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosSeparatorStyle").withType("ListView.iosSeparatorStyle").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		ConverterFactory.register("ListView.iosCellSelectionStyle", new IosCellSelectionStyle());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosCellSelectionStyle").withType("ListView.iosCellSelectionStyle"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosSeparatorInsetTop").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosSeparatorInsetBottom").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosSeparatorInsetLeft").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosSeparatorInsetRight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("divider").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("dividerHeight").withType("dimension").withOrder(-1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("footerDividersEnabled").withType("boolean").withOrder(-1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("headerDividersEnabled").withType("boolean").withOrder(-1).withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("filter").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("filterDelay").withType("int").withOrder(-10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("filterId").withType("string").withOrder(-10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("filterItemPath").withType("array").withOrder(-10));
	
	}
	
	public ListViewImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  ListViewImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  ListViewImpl(String groupName, String localname) {
		super(groupName, localname);
	}

	@Override
	public IWidget newInstance() {
		return new ListViewImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
		listView = new ListViewExt();
		
		nativeCreate(params);
		
		
		ViewGroupImpl.registerCommandConveter(this);
		setWidgetOnNativeClass();
		
	}
	private native void setWidgetOnNativeClass() /*-[
		((ASUITableView*) [self asNativeWidget]).widget = self;
	]-*/;

	@Override
	public Object asWidget() {
		return listView;
	}


	private void nativeRemoveView(IWidget widget) {
		r.android.animation.LayoutTransition layoutTransition = listView.getLayoutTransition();
		if (layoutTransition != null && (
				layoutTransition.isTransitionTypeEnabled(r.android.animation.LayoutTransition.CHANGE_DISAPPEARING) ||
				layoutTransition.isTransitionTypeEnabled(r.android.animation.LayoutTransition.DISAPPEARING)
				)) {
			addToBufferedRunnables(() -> ViewGroupImpl.nativeRemoveView(widget));          
		} else {
			ViewGroupImpl.nativeRemoveView(widget);
		}
	}
	
	@Override
	public void add(IWidget w, int index) {
		if (index != -2) {
			View view = (View) w.asWidget();
			createLayoutParams(view);
			    if (index == -1) {
			        listView.addView(view);
			    } else {
			        listView.addView(view, index);
			    }
		}
		
		ViewGroupImpl.nativeAddView(asNativeWidget(), w.asNativeWidget());
		super.add(w, index);
	}
	
	private void createLayoutParams(View view) {
		r.android.widget.ListView.LayoutParams layoutParams = (r.android.widget.ListView.LayoutParams) view.getLayoutParams();
		
		layoutParams = (r.android.widget.ListView.LayoutParams) view.getLayoutParams();
		if (layoutParams == null) {
			layoutParams = new r.android.widget.ListView.LayoutParams(-2, -2);
			view.setLayoutParams(layoutParams);
		}  else {
			layoutParams.height = -2;
			layoutParams.width = -2;
		}
	}
	
	private r.android.widget.ListView.LayoutParams getLayoutParams(View view) {
		return (r.android.widget.ListView.LayoutParams) view.getLayoutParams();		
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setChildAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue) {
		View view = (View) w.asWidget();
		r.android.widget.ListView.LayoutParams layoutParams = getLayoutParams(view);
		ViewGroupImpl.setChildAttribute(w, key, objValue, layoutParams);		
		
		switch (key.getAttributeName()) {
		case "layout_width":
			layoutParams.width = (int) objValue;
			break;	
		case "layout_height":
			layoutParams.height = (int) objValue;
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
		r.android.widget.ListView.LayoutParams layoutParams = getLayoutParams(view);

		switch (key.getAttributeName()) {
		case "layout_width":
			return layoutParams.width;
		case "layout_height":
			return layoutParams.height;
		}
		
		return null;

	}
	
@com.google.j2objc.annotations.WeakOuter		
	public class ListViewExt extends r.android.widget.ListView implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		private List<IWidget> overlays;
		public IWidget getWidget() {
			return ListViewImpl.this;
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

		public ListViewExt() {
			super();
			
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
			ViewImpl.setDrawableBounds(ListViewImpl.this, l, t, r, b);
			if (!isOverlay()) {
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			}
			replayBufferedEvents();
	        ViewImpl.redrawDrawables(ListViewImpl.this);
	        overlays = ViewImpl.drawOverlay(ListViewImpl.this, overlays);
			
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
				ListViewImpl.this.invalidate();
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
        		ViewImpl.drawableStateChanged(ListViewImpl.this);
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
    		
    		IWidget widget = template.loadLazyWidgets(ListViewImpl.this);
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
        	ListViewImpl.this.getParent().remove(ListViewImpl.this);
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
			ListViewImpl.this.setAttribute(name, value, !(value instanceof String));
		}
        @Override
        public void setVisibility(int visibility) {
            super.setVisibility(visibility);
            ViewImpl.nativeSetVisibility(asNativeWidget(), visibility != View.VISIBLE);
            
        }
        @Override
        public int measureHeightOfChildren(int widthMeasureSpec, int startPosition, int endPosition, int maxHeight,
        	int disallowPartialChildPosition) {
        	int height = 0;
        	
        	for (int i = 0; i < dataList.size(); i++) {
        		height += calculateHeightOfRow(i);
			}
        	return height;
        }
        
    	public void setState0(Object value) {
    		ViewImpl.setState(ListViewImpl.this, 0, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(ListViewImpl.this, 1, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(ListViewImpl.this, 2, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(ListViewImpl.this, 3, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(ListViewImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(ListViewImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(ListViewImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(ListViewImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(ListViewImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(ListViewImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(ListViewImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(ListViewImpl.this);
        }
     
		@Override
		public void endViewTransition(r.android.view.View view) {
			super.endViewTransition(view);
			runBufferedRunnables();
		}
	
	}
	@Override
	public Class getViewClass() {
		return ListViewExt.class;
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
				ViewGroupImpl.setAttribute(this,  key, strValue, objValue, decorator);
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "iosRowHeight": {


		setRowHeight(nativeWidget, objValue);



			}
			break;
			case "iosEstimatedRowHeight": {


		setEstimatedRowHeight(nativeWidget, objValue);



			}
			break;
			case "iosCellLayoutMarginsFollowReadableWidth": {


		setCellLayoutMarginsFollowReadableWidth(nativeWidget, objValue);



			}
			break;
			case "iosInsetsContentViewsToSafeArea": {


		setInsetsContentViewsToSafeArea(nativeWidget, objValue);



			}
			break;
			case "iosSectionHeaderHeight": {


		setSectionHeaderHeight(nativeWidget, objValue);



			}
			break;
			case "iosSectionFooterHeight": {


		setSectionFooterHeight(nativeWidget, objValue);



			}
			break;
			case "iosEstimatedSectionHeaderHeight": {


		setEstimatedSectionHeaderHeight(nativeWidget, objValue);



			}
			break;
			case "iosEstimatedSectionFooterHeight": {


		setEstimatedSectionFooterHeight(nativeWidget, objValue);



			}
			break;
			case "iosSectionHeaderTopPadding": {
if (checkIosVersion("15.0")) {

		setSectionHeaderTopPadding(nativeWidget, objValue);

}

			}
			break;
			case "iosSeparatorColor": {


		setSeparatorColor(nativeWidget, objValue);



			}
			break;
			case "iosAllowsSelection": {


		setAllowsSelection(nativeWidget, objValue);



			}
			break;
			case "iosAllowsMultipleSelection": {


		setAllowsMultipleSelection(nativeWidget, objValue);



			}
			break;
			case "iosAllowsSelectionDuringEditing": {


		setAllowsSelectionDuringEditing(nativeWidget, objValue);



			}
			break;
			case "iosAllowsMultipleSelectionDuringEditing": {


		setAllowsMultipleSelectionDuringEditing(nativeWidget, objValue);



			}
			break;
			case "iosSelectionFollowsFocus": {
if (checkIosVersion("14.0")) {

		setSelectionFollowsFocus(nativeWidget, objValue);

}

			}
			break;
			case "iosSectionIndexMinimumDisplayRowCount": {


		setSectionIndexMinimumDisplayRowCount(nativeWidget, objValue);



			}
			break;
			case "iosSectionIndexColor": {


		setSectionIndexColor(nativeWidget, objValue);



			}
			break;
			case "iosSectionIndexBackgroundColor": {


		setSectionIndexBackgroundColor(nativeWidget, objValue);



			}
			break;
			case "iosSectionIndexTrackingBackgroundColor": {


		setSectionIndexTrackingBackgroundColor(nativeWidget, objValue);



			}
			break;
			case "iosDragInteractionEnabled": {


		setDragInteractionEnabled(nativeWidget, objValue);



			}
			break;
			case "iosIsEditing": {


		setIsEditing(nativeWidget, objValue);



			}
			break;
			case "iosRemembersLastFocusedIndexPath": {


		setRemembersLastFocusedIndexPath(nativeWidget, objValue);



			}
			break;
			case "iosAllowsFocus": {
if (checkIosVersion("15.0")) {

		setAllowsFocus(nativeWidget, objValue);

}

			}
			break;
			case "iosAllowsFocusDuringEditing": {
if (checkIosVersion("15.0")) {

		setAllowsFocusDuringEditing(nativeWidget, objValue);

}

			}
			break;
			case "iosFillerRowHeight": {
if (checkIosVersion("15.0")) {

		setFillerRowHeight(nativeWidget, objValue);

}

			}
			break;
			case "iosIsPrefetchingEnabled": {
if (checkIosVersion("15.0")) {

		setIsPrefetchingEnabled(nativeWidget, objValue);

}

			}
			break;
			case "onItemClick": {


		setOnItemClick(objValue);



			}
			break;
			case "onItemLongClick": {


		 setOnItemLongClick(objValue);



			}
			break;
			case "onScrollChange": {


		 setOnScroll(key, strValue, objValue, decorator);



			}
			break;
			case "listheader": {


		 addHeaderTemplate(objValue);



			}
			break;
			case "listfooter": {


		 addFooterTemplate(objValue);



			}
			break;
			case "scrollX": {


		setScrollX(objValue);



			}
			break;
			case "scrollY": {


		setScrollY(objValue);



			}
			break;
			case "choiceMode": {


		 setChoiceMode(objValue);



			}
			break;
			case "stackFromBottom": {


		 setStackFromBottom(objValue);



			}
			break;
			case "listSelector": {


		 setListSelector(strValue, objValue);



			}
			break;
			case "iosSeparatorStyle": {


		setSeparatorStyle(objValue);



			}
			break;
			case "iosCellSelectionStyle": {


		setSelectionStyle(objValue);



			}
			break;
			case "iosSeparatorInsetTop": {


		setSeparatorInsetTop(objValue);



			}
			break;
			case "iosSeparatorInsetBottom": {


		setSeparatorInsetBottom(objValue);



			}
			break;
			case "iosSeparatorInsetLeft": {


		setSeparatorInsetLeft(objValue);



			}
			break;
			case "iosSeparatorInsetRight": {


		setSeparatorInsetRight(objValue);



			}
			break;
			case "divider": {


		 setDivider(key, strValue, objValue, decorator);



			}
			break;
			case "dividerHeight": {


		 setDividerHeight(objValue);



			}
			break;
			case "footerDividersEnabled": {


		 setFooterDividersEnabled(objValue);



			}
			break;
			case "headerDividersEnabled": {


		 setHeaderDividersEnabled (objValue);



			}
			break;
			case "filter": {


		 filter(objValue);



			}
			break;
			case "filterDelay": {


		 setFilterDelay(objValue);



			}
			break;
			case "filterId": {


		 setFilterId(objValue);



			}
			break;
			case "filterItemPath": {


		 setFilterItemPath(objValue);



			}
			break;
		default:
			break;
		}
		
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
			case "iosRowHeight": {
return getRowHeight();			}
			case "iosEstimatedRowHeight": {
return getEstimatedRowHeight();			}
			case "iosCellLayoutMarginsFollowReadableWidth": {
return getCellLayoutMarginsFollowReadableWidth();			}
			case "iosInsetsContentViewsToSafeArea": {
return getInsetsContentViewsToSafeArea();			}
			case "iosSectionHeaderHeight": {
return getSectionHeaderHeight();			}
			case "iosSectionFooterHeight": {
return getSectionFooterHeight();			}
			case "iosEstimatedSectionHeaderHeight": {
return getEstimatedSectionHeaderHeight();			}
			case "iosEstimatedSectionFooterHeight": {
return getEstimatedSectionFooterHeight();			}
			case "iosSectionHeaderTopPadding": {
if (checkIosVersion("15.0")) {
return getSectionHeaderTopPadding();
}
break;			}
			case "iosSeparatorColor": {
return getSeparatorColor();			}
			case "iosNumberOfSections": {
return getNumberOfSections();			}
			case "iosAllowsSelection": {
return getAllowsSelection();			}
			case "iosAllowsMultipleSelection": {
return getAllowsMultipleSelection();			}
			case "iosAllowsSelectionDuringEditing": {
return getAllowsSelectionDuringEditing();			}
			case "iosAllowsMultipleSelectionDuringEditing": {
return getAllowsMultipleSelectionDuringEditing();			}
			case "iosSelectionFollowsFocus": {
if (checkIosVersion("14.0")) {
return getSelectionFollowsFocus();
}
break;			}
			case "iosSectionIndexMinimumDisplayRowCount": {
return getSectionIndexMinimumDisplayRowCount();			}
			case "iosSectionIndexColor": {
return getSectionIndexColor();			}
			case "iosSectionIndexBackgroundColor": {
return getSectionIndexBackgroundColor();			}
			case "iosSectionIndexTrackingBackgroundColor": {
return getSectionIndexTrackingBackgroundColor();			}
			case "iosHasUncommittedUpdates": {
return getHasUncommittedUpdates();			}
			case "iosHasActiveDrag": {
return getHasActiveDrag();			}
			case "iosDragInteractionEnabled": {
return getDragInteractionEnabled();			}
			case "iosHasActiveDrop": {
return getHasActiveDrop();			}
			case "iosIsEditing": {
return getIsEditing();			}
			case "iosRemembersLastFocusedIndexPath": {
return getRemembersLastFocusedIndexPath();			}
			case "iosAllowsFocus": {
if (checkIosVersion("15.0")) {
return getAllowsFocus();
}
break;			}
			case "iosAllowsFocusDuringEditing": {
if (checkIosVersion("15.0")) {
return getAllowsFocusDuringEditing();
}
break;			}
			case "iosFillerRowHeight": {
if (checkIosVersion("15.0")) {
return getFillerRowHeight();
}
break;			}
			case "iosIsPrefetchingEnabled": {
if (checkIosVersion("15.0")) {
return getIsPrefetchingEnabled();
}
break;			}
			case "scrollX": {
return getScrollX();			}
			case "scrollY": {
return getScrollY();			}
			case "choiceMode": {
return getChoiceMode();			}
			case "stackFromBottom": {
return getStackFromBottom();			}
			case "listSelector": {
return getListSelector();			}
			case "divider": {
return getDivider(key, decorator);			}
			case "dividerHeight": {
return getDividerHeight();			}
		}
		return null;
	}


	@Override
    public Object asNativeWidget() {
        return uiView;
    }
    public native boolean checkIosVersion(String v) /*-[
		return ([[[UIDevice currentDevice] systemVersion] compare:v options:NSNumericSearch] == NSOrderedDescending);
	]-*/;
    
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
    
	

	@Override
	public void updateModelToEventMap(Map<String, Object> eventMap, String eventType, String eventParams) {
	    if (eventMap.containsKey("position") && eventType.startsWith("onItem")) {
	    	int position = PluginInvoker.getInt(eventMap.get("position"));
	        position = updatePosition(eventMap, position);
	        if (position >= 0 && position < dataList.size()) {  
	            com.ashera.model.LoopParam loopParam = dataList.get(position);
	            updateModelToEventMap(eventMap, eventParams, loopParam);
	        }
	    } else {
	        super.updateModelToEventMap(eventMap, eventType, eventParams);
	    }
	}
	


    private boolean disableUpdate = false;
    @Override
    protected void addObject(com.ashera.model.LoopParam childModel, String modelIdPath, int index, String currentLoopVar) {
        String id = null;
        if (modelIdPath != null) {
            id = PluginInvoker.getString(getModelByPath(modelIdPath, childModel.get(currentLoopVar)));
        } else {
            id = UUID.randomUUID().toString();
        }
        
        if (!ids.contains(id)) {
            if (index == -1) {
                ids.add(id);
                dataList.add(childModel);
            } else {
                ids.add(index, id);
                dataList.add(index, childModel);
            }
            
        } else {
            // update the objects on the widget
            dataList.set(ids.indexOf(id), childModel);
        }

        reloadTable();
    }
    
    @Override
    public void addAllModel(Object objValue) {
    	disableUpdate = true;
    	super.addAllModel(objValue);
    	disableUpdate = false;
    	reloadTable();
    }

    @Override
    public boolean remove(int index) {
        if (index + 1 <= ids.size()) {
            ids.remove(index);
        }
        if (index + 1 <= dataList.size()) {
            dataList.remove(index);
        }
        reloadTable();
        return true;
    }

    
    @Override
    public boolean areWidgetItemsRecycled() {
    	return true;
    }

	
	@Override
	public void clear() {
		ids.clear();
		dataList.clear();
		reloadTable();
	}
	
	@Override
	protected void clearModel() {
		ids.clear();
		dataList.clear();
	}
	
	@Override
	public void notifyDataSetChanged() {
		disableUpdate = true;
		super.notifyDataSetChanged();
		disableUpdate = false;
		reloadTable();
	}
	


    private ListAdapter listAdapter;
    public ListAdapter getListAdapter() {
		return listAdapter;
	}

	class ListAdapter extends BaseAdapter  implements Filterable{
    	private final Object mLock = new Object();
    	private ArrayFilter mFilter;
    	private List<com.ashera.model.LoopParam> mObjects;
        @Override
        public boolean isEnabled(int position) {
            return true;
        }
        public ListAdapter() {
        	mObjects = dataList;
        }
        
        @Override
        public int getCount() {
            return mObjects.size();
        }

        @Override
        public Object getItem(int position) {
            return mObjects.get(position);
        }
        
        @Override
        public long getItemId(int position) {
            String id = ids.get(position);
            if(id == null) {
            	return 0;
            }
			return (int) quickConvert(id, "id");
        }
        
        @Override
        public boolean hasStableIds() {
        	return true;
        }
        
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            com.ashera.model.LoopParam model = mObjects.get(position);
            IWidget myWidget;
            if (convertView == null) {
                myWidget = (IWidget) getListItem().loadLazyWidgets(model);
                ((View) myWidget.asNativeWidget()).setTag(myWidget);
            } else {    
                myWidget = (IWidget) convertView.getTag();
            }

            updateModelRecurse(myWidget, model);

            return (View) myWidget.asNativeWidget();
        }
        
        public Filter getFilter() {
            if (mFilter == null) {
                mFilter = new ArrayFilter();
            }
            return mFilter;
        }
        
        public void dofilterSync(String text) {
        	getFilter();
        	mFilter.publishResults(text, mFilter.performFiltering(text));
        }
        
        private class ArrayFilter extends Filter {
            @Override
            protected FilterResults performFiltering(CharSequence prefix) {
                final FilterResults results = new FilterResults();

                if (prefix == null || prefix.length() == 0) {
                	prefix = "";
                }
                
                final String prefixString = prefix.toString();

                final ArrayList<com.ashera.model.LoopParam> values;
                synchronized (mLock) {
                    values = new ArrayList<>(dataList);
                }

                final int count = values.size();
                final ArrayList<com.ashera.model.LoopParam> newValues = new ArrayList<>();
    			IFilter filter = FilterFactory.get(filterId);
    	        if (filter == null) {
    	        	filter = FilterFactory.get(FilterFactory.DEFAULT_FILTER);
    	        }

                for (int i = 0; i < count; i++) {
                    final com.ashera.model.LoopParam value = values.get(i);
                    
                    if (filterItemPaths != null) {
                    	for (String path : filterItemPaths) {
                    		com.ashera.model.ModelExpressionParser.ModelLoopHolder modelLoopHolder = com.ashera.model.ModelExpressionParser.parseModelLoopExpression(getModelFor());
            	            
            	            String varName = modelLoopHolder.varName;
                        	Object modelVal = getModelByPath(varName, value);
                        	modelVal = getModelByPath(path, modelVal);
                        	
                			if (filter.filter(PluginInvoker.getString(modelVal), prefixString)) {
                				newValues.add(value);
                				break;
                			}
                		}	
                    } else {
            			if (value != null && filter.filter(value.toString(), prefixString)) {
            				newValues.add(value);
            			}
                    }

                    results.values = newValues;
                    results.count = newValues.size();
                }
                
                if (results.values == null) {
                	results.values = new java.util.ArrayList<>(0);
                }

                return results;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                //noinspection unchecked
                mObjects = (List<com.ashera.model.LoopParam>) results.values;
                if (results.count > 0) {
                    notifyDataSetChanged();
                } else {
                    notifyDataSetInvalidated();
                }
            }
        }
    }

    


	private static void addCheckItemInfo(java.util.Map<String, Object> obj, AdapterView<?> parent) {
		if (parent instanceof AbsListView) {
	    	PluginInvoker.putJSONSafeObjectIntoMap(obj, "checkedItemCount", ((AbsListView) parent).getCheckedItemCount());
	    	PluginInvoker.putJSONSafeObjectIntoMap(obj, "checkedItemPosition", ((AbsListView) parent).getCheckedItemPosition());
	    	long[] checkedItemIds = ((AbsListView) parent).getCheckedItemIds();
	    	List<String> ids = new java.util.ArrayList<>();
	    	for (long checkedItemId: checkedItemIds) {
	    		ids.add(IdGenerator.getName((int) checkedItemId));
			}
			PluginInvoker.putJSONSafeObjectIntoMap(obj, "checkedItemIds", ids);
	    }
	}
	

	
	private enum FilterStatus { None, Restore, Filtering, Done }
	private FilterStatus filter = FilterStatus.None;
	private String query;
	private int filterDelay = 100;
	private r.android.os.Handler handler;
	private void filter(Object query) {
		this.query = (String) query;

		if (handler == null) {
			handler = new r.android.os.Handler(); 
		} else {
			handler.removeCallbacks(null);
		}
		handler.postDelayed(() -> {
			preFilter();
			this.listAdapter.dofilterSync(this.query);
			postFilter();	
		}, filterDelay);
	}
	
	
	
	private void setFilterDelay(Object objValue) {
		this.filterDelay = (int) objValue;
		
	}
	
	private String filterId = FilterFactory.DEFAULT_FILTER;
	private void setFilterId(Object objValue) {
		filterId = (String) objValue;
	}
	
	
	private String[] filterItemPaths; 
	private void setFilterItemPath(Object objValue) {
		filterItemPaths = (String[]) objValue;		
	}

	


	private void setScrollX(Object objValue) {
		nativeSetScrollX(asNativeWidget(), (int) objValue);
	}
	
	public native void nativeSetScrollX(Object view, int value) /*-[
  		[((ASUITableView*)view) setContentOffset:CGPointMake(value ,((ASUITableView*)view).contentOffset.y)];
	]-*/;
	
	private void setScrollY(Object objValue) {
		nativeSetScrollY(asNativeWidget(), (int) objValue);
	}
	
	public native void nativeSetScrollY(Object view, int value) /*-[
    	[((ASUITableView*)view) setContentOffset:CGPointMake(((ASUITableView*)view).contentOffset.x, value)];	
    ]-*/;

	
	public Object getScrollX() {
		return nativeGetScrollX(asNativeWidget());
	}
	
	public native double nativeGetScrollX(Object view) /*-[
		return ((ASUITableView*)view).contentOffset.x;
	]-*/;
	
	public Object getScrollY() {
		return nativeGetScrollY(asNativeWidget());
	}
	
	public native double nativeGetScrollY(Object view) /*-[
		return ((ASUITableView*)view).contentOffset.y;
	]-*/;


	


	private void setChoiceMode(Object objValue) {
		listView.setChoiceMode((int) objValue);
	}

    private Object getChoiceMode() {
		return listView.getChoiceMode();
	}

	private void initListAdapter() {
		listAdapter = new ListAdapter();
		listView.setAdapter(listAdapter);
	}  
    private int updatePosition(java.util.Map<java.lang.String, java.lang.Object> eventMap, int position) {
        return position;
    }
    

	public native void setRowHeight(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).rowHeight = [(JavaLangFloat*) value floatValue];
]-*/;
	public native Object getRowHeight() /*-[
return [JavaLangFloat valueOfWithFloat :((ASUITableView*) uiView_).rowHeight];
  ]-*/;
	public native void setEstimatedRowHeight(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).estimatedRowHeight = [(JavaLangFloat*) value floatValue];
]-*/;
	public native Object getEstimatedRowHeight() /*-[
return [JavaLangFloat valueOfWithFloat :((ASUITableView*) uiView_).estimatedRowHeight];
  ]-*/;
	public native void setCellLayoutMarginsFollowReadableWidth(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).cellLayoutMarginsFollowReadableWidth = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public native Object getCellLayoutMarginsFollowReadableWidth() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITableView*) uiView_).cellLayoutMarginsFollowReadableWidth];
  ]-*/;
	public native void setInsetsContentViewsToSafeArea(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).insetsContentViewsToSafeArea = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public native Object getInsetsContentViewsToSafeArea() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITableView*) uiView_).insetsContentViewsToSafeArea];
  ]-*/;
	public native void setSectionHeaderHeight(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).sectionHeaderHeight = [(JavaLangFloat*) value floatValue];
]-*/;
	public native Object getSectionHeaderHeight() /*-[
return [JavaLangFloat valueOfWithFloat :((ASUITableView*) uiView_).sectionHeaderHeight];
  ]-*/;
	public native void setSectionFooterHeight(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).sectionFooterHeight = [(JavaLangFloat*) value floatValue];
]-*/;
	public native Object getSectionFooterHeight() /*-[
return [JavaLangFloat valueOfWithFloat :((ASUITableView*) uiView_).sectionFooterHeight];
  ]-*/;
	public native void setEstimatedSectionHeaderHeight(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).estimatedSectionHeaderHeight = [(JavaLangFloat*) value floatValue];
]-*/;
	public native Object getEstimatedSectionHeaderHeight() /*-[
return [JavaLangFloat valueOfWithFloat :((ASUITableView*) uiView_).estimatedSectionHeaderHeight];
  ]-*/;
	public native void setEstimatedSectionFooterHeight(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).estimatedSectionFooterHeight = [(JavaLangFloat*) value floatValue];
]-*/;
	public native Object getEstimatedSectionFooterHeight() /*-[
return [JavaLangFloat valueOfWithFloat :((ASUITableView*) uiView_).estimatedSectionFooterHeight];
  ]-*/;
	public native void setSectionHeaderTopPadding(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).sectionHeaderTopPadding = [(JavaLangFloat*) value floatValue];
]-*/;
	public native Object getSectionHeaderTopPadding() /*-[
return [JavaLangFloat valueOfWithFloat :((ASUITableView*) uiView_).sectionHeaderTopPadding];
  ]-*/;
	public native void setSeparatorColor(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).separatorColor = (UIColor*) value;
]-*/;
	public native Object getSeparatorColor() /*-[
return ((ASUITableView*) uiView_).separatorColor;
  ]-*/;
	public native Object getNumberOfSections() /*-[
return [JavaLangInteger valueOfWithInt :((ASUITableView*) uiView_).numberOfSections];
  ]-*/;
	public native void setAllowsSelection(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).allowsSelection = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public native Object getAllowsSelection() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITableView*) uiView_).allowsSelection];
  ]-*/;
	public native void setAllowsMultipleSelection(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).allowsMultipleSelection = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public native Object getAllowsMultipleSelection() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITableView*) uiView_).allowsMultipleSelection];
  ]-*/;
	public native void setAllowsSelectionDuringEditing(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).allowsSelectionDuringEditing = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public native Object getAllowsSelectionDuringEditing() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITableView*) uiView_).allowsSelectionDuringEditing];
  ]-*/;
	public native void setAllowsMultipleSelectionDuringEditing(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).allowsMultipleSelectionDuringEditing = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public native Object getAllowsMultipleSelectionDuringEditing() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITableView*) uiView_).allowsMultipleSelectionDuringEditing];
  ]-*/;
	public native void setSelectionFollowsFocus(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).selectionFollowsFocus = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public native Object getSelectionFollowsFocus() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITableView*) uiView_).selectionFollowsFocus];
  ]-*/;
	public native void setSectionIndexMinimumDisplayRowCount(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).sectionIndexMinimumDisplayRowCount = [(JavaLangInteger*) value intValue];
]-*/;
	public native Object getSectionIndexMinimumDisplayRowCount() /*-[
return [JavaLangInteger valueOfWithInt :((ASUITableView*) uiView_).sectionIndexMinimumDisplayRowCount];
  ]-*/;
	public native void setSectionIndexColor(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).sectionIndexColor = (UIColor*) value;
]-*/;
	public native Object getSectionIndexColor() /*-[
return ((ASUITableView*) uiView_).sectionIndexColor;
  ]-*/;
	public native void setSectionIndexBackgroundColor(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).sectionIndexBackgroundColor = (UIColor*) value;
]-*/;
	public native Object getSectionIndexBackgroundColor() /*-[
return ((ASUITableView*) uiView_).sectionIndexBackgroundColor;
  ]-*/;
	public native void setSectionIndexTrackingBackgroundColor(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).sectionIndexTrackingBackgroundColor = (UIColor*) value;
]-*/;
	public native Object getSectionIndexTrackingBackgroundColor() /*-[
return ((ASUITableView*) uiView_).sectionIndexTrackingBackgroundColor;
  ]-*/;
	public native Object getHasUncommittedUpdates() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITableView*) uiView_).hasUncommittedUpdates];
  ]-*/;
	public native Object getHasActiveDrag() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITableView*) uiView_).hasActiveDrag];
  ]-*/;
	public native void setDragInteractionEnabled(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).dragInteractionEnabled = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public native Object getDragInteractionEnabled() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITableView*) uiView_).dragInteractionEnabled];
  ]-*/;
	public native Object getHasActiveDrop() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITableView*) uiView_).hasActiveDrop];
  ]-*/;
	public native void setIsEditing(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).editing = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public native Object getIsEditing() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITableView*) uiView_).editing];
  ]-*/;
	public native void setRemembersLastFocusedIndexPath(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).remembersLastFocusedIndexPath = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public native Object getRemembersLastFocusedIndexPath() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITableView*) uiView_).remembersLastFocusedIndexPath];
  ]-*/;
	public native void setAllowsFocus(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).allowsFocus = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public native Object getAllowsFocus() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITableView*) uiView_).allowsFocus];
  ]-*/;
	public native void setAllowsFocusDuringEditing(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).allowsFocusDuringEditing = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public native Object getAllowsFocusDuringEditing() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITableView*) uiView_).allowsFocusDuringEditing];
  ]-*/;
	public native void setFillerRowHeight(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).fillerRowHeight = [(JavaLangFloat*) value floatValue];
]-*/;
	public native Object getFillerRowHeight() /*-[
return [JavaLangFloat valueOfWithFloat :((ASUITableView*) uiView_).fillerRowHeight];
  ]-*/;
	public native void setIsPrefetchingEnabled(Object nativeWidget, Object value) /*-[
((ASUITableView*) nativeWidget).prefetchingEnabled = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public native Object getIsPrefetchingEnabled() /*-[
return [JavaLangBoolean valueOfWithBoolean :((ASUITableView*) uiView_).prefetchingEnabled];
  ]-*/;
	@SuppressLint("NewApi")
private static class OnItemClickListener implements AdapterView.OnItemClickListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnItemClickListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnItemClickListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onItemClick (AdapterView<?> parent, 
                View view, 
                int position, 
                long id){
    
	if (action == null || action.equals("onItemClick")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onItemClick");
	    java.util.Map<String, Object> obj = getOnItemClickEventObj(parent,view,position,id);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, parent,view,position,id);
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

public java.util.Map<String, Object> getOnItemClickEventObj(AdapterView<?> parent,View view,int position,long id) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "itemclick");ListViewImpl.addCheckItemInfo(obj, parent);
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "position", position);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onItemClick", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnItemLongClickListener implements AdapterView.OnItemLongClickListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnItemLongClickListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnItemLongClickListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public boolean onItemLongClick (AdapterView<?> parent, 
                View view, 
                int position, 
                long id){
    boolean result = true;
    
	if (action == null || action.equals("onItemLongClick")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onItemLongClick");
	    java.util.Map<String, Object> obj = getOnItemLongClickEventObj(parent,view,position,id);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 Object commandResult = EventCommandFactory.getCommand(commandName).executeCommand(w, obj, parent,view,position,id);
		    	 if (commandResult != null) {
		    		 result = (boolean) commandResult;
		    	 }
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
    return result;
}//#####

public java.util.Map<String, Object> getOnItemLongClickEventObj(AdapterView<?> parent,View view,int position,long id) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "itemlongclick");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "position", position);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onItemLongClick", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnScrollListener implements AbsListView.OnScrollListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnScrollListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnScrollListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onScroll (AbsListView view, 
                int firstVisibleItem, 
                int visibleItemCount, 
                int totalItemCount){
    
	if (action == null || action.equals("onScrollChange")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onScrollChange");
	    java.util.Map<String, Object> obj = getOnScrollChangeEventObj(view,firstVisibleItem,visibleItemCount,totalItemCount);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, view,firstVisibleItem,visibleItemCount,totalItemCount);
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
public void onScrollStateChanged (AbsListView view, 
                int scrollState){
    
	if (action == null || action.equals("onScrollStateChange")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onScrollStateChange");
	    java.util.Map<String, Object> obj = getOnScrollStateChangeEventObj(view,scrollState);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, view,scrollState);
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

public java.util.Map<String, Object> getOnScrollStateChangeEventObj(AbsListView view,int scrollState) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "scrollstatechange");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "scrollState", scrollState);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onScrollStateChange", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}

public java.util.Map<String, Object> getOnScrollChangeEventObj(AbsListView view,int firstVisibleItem,int visibleItemCount,int totalItemCount) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "scrollchange");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "firstVisibleItem", firstVisibleItem);
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "visibleItemCount", visibleItemCount);
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "totalItemCount", totalItemCount);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onScrollChange", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}


	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			listView.setId((int) quickConvert(id, "id"));
		}
	}
	
    
    @Override
    public void setVisible(boolean b) {
        ((View)asWidget()).setVisibility(b ? View.VISIBLE : View.GONE);
    }

		//end - body
	private HasWidgets headerTemplate;
	private HasWidgets footerTemplate;
	private boolean autoLayout = false;
	private Object onItemClick;
	private Map<Integer, Integer> heightCache = new HashMap<Integer, Integer>();
	private IWidget header;
	private IWidget footer;
	private void addFooterTemplate(Object objValue) {
		this.footerTemplate = (HasWidgets) objValue;
		

        if (footerTemplate != null) {
        	this.footer = ((HasWidgets)footerTemplate.loadLazyWidgets(this));
			addFooterWidget(footer.asNativeWidget());
			setCustomDividerAttributes(footer, footerDividersEnabled);
        }
	}

	private void addHeaderTemplate(Object objValue) {
		this.headerTemplate = (HasWidgets) objValue;		
		
        if (headerTemplate != null) {
        	this.header = ((HasWidgets) headerTemplate.loadLazyWidgets(this));
			addHeaderWidget(header.asNativeWidget());
			setCustomDividerAttributes(header, headerDividersEnabled);
        }
	}
	
	public void setOnItemClick(Object objValue) {
		this.onItemClick = objValue;
		updateTableSelection();
	}

	private void handleItemClick(int position) {
		AdapterView.OnItemClickListener onItemClickListener;
		
		if (onItemClick instanceof String) {
			onItemClickListener = new OnItemClickListener(this, (String) this.onItemClick);
		} else {
			onItemClickListener =  (AdapterView.OnItemClickListener) this.onItemClick;
		}
		
		listView.performItemClick((View) asWidget(), position, -1l);
		onItemClickListener.onItemClick(listView, (View) asWidget(), position, -1l);
	}
	

	final static String simpleTableIdentifier = "SimpleTableItem";
	private Object getCell(int index) {
		Object cell = getReusableCell(simpleTableIdentifier);
			
		if (cell == null) {
			cell = createCell(index);
		}

		IWidget widget = getData(cell);
		updateLayout(widget, index);
		
		// update footer visibility for cell
		setSelectionStyleOnCell(cell);
		setCellDividerInsets(index, cell);
		setSelectedBackgroundView(cell);
		return cell;
	}

	private void setCellDividerInsets(int index, Object cell) {
		if (footerTemplate != null && index == listAdapter.getCount() - 1 && !footerDividersEnabled) {
			nativeSetSeparatorCellInsetRight(cell, 100000);
		} else {
			nativeSetSeparatorCellInsetRight(cell, separatorInsetRight);
		}
	}
	
	private native void nativeSetSeparatorCellInsetRight(Object cell, int val) /*-[
		CustomUITableViewCell* mycell = (UITableView*) self.uiView;
		mycell.separatorInset = UIEdgeInsetsMake(mycell.separatorInset.top, mycell.separatorInset.left, mycell.separatorInset.bottom, val);		
	]-*/;

	private Object createCell(int index) {
		com.ashera.model.LoopParam model = (com.ashera.model.LoopParam) listAdapter.getItem(index);
		
		IWidget widget = null;
		
		if (autoLayout) {
			// TODO: need to verify this
			//widget = loadLazyWidgets(listItem);
		} else {
			widget = listItem.loadLazyWidgets(this, -1, "", model);
		}

		Object cell = newCell(simpleTableIdentifier, widget);
		Object asNativeWidget = widget.asNativeWidget();
		addSubView(cell, asNativeWidget);
		return cell;
	}
	
	public int calculateHeightOfRow(int index) {
		if (heightCache.containsKey(index)) {
			return heightCache.get(index);
		}
		getCell(index);
	    return heightCache.get(index);
	}
	

	private View updateLayout(final IWidget myWidget, int index) {
		com.ashera.model.LoopParam model = (com.ashera.model.LoopParam) listAdapter.getItem(index);
		updateModelRecurse(myWidget, model);
		if (footerTemplate != null && index == listAdapter.getCount() - 1) {
			setCustomDividerAttributes(myWidget, footerDividersEnabled);
		} else {
			setCustomDividerAttributes(myWidget, true);
		}
		if (!autoLayout) {
			View view = (View) myWidget.asWidget();
			listView.measureChild(view);
			view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
			heightCache.put(index, view.getMeasuredHeight());
		    return view;
		}
	    return null;
	}
	

	private void setCustomDividerAttributes(IWidget cellwidget, boolean visible) {
		if (divider != null && cellwidget instanceof HasWidgets) {
			List<IWidget> childwidgets = ((HasWidgets)cellwidget).getWidgets();
			IWidget widget = childwidgets.get(childwidgets.size() - 1);
			if (widget.getId().equals("@+id/divider")) {
				View view = (View)(widget.asWidget());
				int visibility = visible ? View.VISIBLE : View.GONE;
				if (view.getVisibility() != visibility) {
					ViewImpl.setVisibility(widget, widget.asNativeWidget(), visibility );
					view.requestLayout();
				}
				
				if (dividerHeight != -1 && view.getLayoutParams().height != dividerHeight) {
					view.getLayoutParams().height = dividerHeight;
					view.requestLayout();
				}
			}
		}
	}

	private void nativeCreate(Map<String, Object> params) {
		createTableView();
		initListAdapter();
		String postMeasureEvent = StandardEvents.postMeasure.toString();
		fragment.getEventBus().on(postMeasureEvent, new PostMeasureEventHandler(postMeasureEvent));
	}
	private native void createTableView()/*-[
		ASUITableView* tableView = [ASUITableView new];
		tableView.allowsSelection = NO;
		tableView.dataSource = self;
		tableView.delegate = self;
		tableView.separatorInset = UIEdgeInsetsMake(0, 0, 0, 0);
		tableView.estimatedRowHeight = 44.0f;
		if (self->autoLayout_) {
			tableView.rowHeight = UITableViewAutomaticDimension;
		}	
		[tableView  setTableFooterView:[[UIView alloc] initWithFrame:CGRectMake(0,0,0,0)]];
		self.uiView = tableView;
	]-*/;
	
	 
	private native void addHeaderWidget(Object headerView)/*-[
		UITableView* tableView = (UITableView*) self.uiView;
	    [tableView setTableHeaderView:headerView];
	]-*/;
	
	private native void addFooterWidget(Object view)/*-[
		UITableView* tableView = (UITableView*) self.uiView;
	    [tableView setTableFooterView:view];
	]-*/;

	
	private native void updateTableSelection()/*-[
		ASUITableView* tableView = self.uiView;
		tableView.allowsSelection = YES;	
	]-*/;


	private native int nativeGetWidth()/*-[
		UITableView* tableView = (UITableView*) self.uiView;
		return tableView.frame.size.width;
	]-*/;

	
	private native Object getCellContentView(Object cell)/*-[
		return ((UITableViewCell*)cell).contentView;
	]-*/;

	private native void setData(Object cell, Object data)/*-[
 		((CustomUITableViewCell*)cell).data = data;
	]-*/;
	private native IWidget getData(Object cell)/*-[
		return ((CustomUITableViewCell*)cell).data;
	]-*/;
	
	private native Object getReusableCell(String simpleTableIdentifier)/*-[
		UITableView* tableView = (UITableView*) self.uiView;
    	return [tableView dequeueReusableCellWithIdentifier:simpleTableIdentifier];
	]-*/;
	
	private native Object newCell(String simpleTableIdentifier, Object data)/*-[
		CustomUITableViewCell* cell = [[CustomUITableViewCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:simpleTableIdentifier data:data];
		return cell;
	]-*/;
	
	private native void setSelectionStyleOnCell(Object cell)/*-[
		((CustomUITableViewCell*) cell).selectionStyle = self->cellSelectionStyle_;
	]-*/;
	
	private native void addSubView(Object cell, Object layout)/*-[
		[((UITableViewCell*)cell).contentView addSubview:layout];
	]-*/;
	
	/*-[	
	- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView {
	    return 1;
	}

	- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section
	{
  		return [listAdapter_ getCount];
	}
	- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath
	{
	    return (UITableViewCell *)[self getCellWithInt:indexPath.row];
	}

	- (CGFloat)tableView:(UITableView *)tableView heightForRowAtIndexPath:(NSIndexPath *)indexPath
	{
		if (!autoLayout_) {	
	    	return (CGFloat)[self calculateHeightOfRowWithInt:indexPath.row];
		} else {	
			return UITableViewAutomaticDimension;
		}	
	}
	- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath
	{
		if (onItemClick_ != nil) {
            NSNumber *index = [NSNumber numberWithLong:(indexPath.row)];
      		[self handleItemClickWithInt: [index intValue]];
		}	    
	}
	
	- (void)scrollViewDidScroll:(UIScrollView *)scrollView 
	{
    	if (onScrollChangeListener_ != nil) {
    		UITableView* tableView = (UITableView*) self.uiView;
    		NSArray* indexPathsForVisibleRows = [tableView indexPathsForVisibleRows];
    	    NSIndexPath *firstVisibleItem = [indexPathsForVisibleRows objectAtIndex:0];
    	    int visibleItemCount = [indexPathsForVisibleRows count];
    	    int totalItemCount = [listAdapter_ getCount];

    		[onScrollChangeListener_ onScrollWithADAbsListView: listView_ 
    			withInt: firstVisibleItem.row
                withInt: visibleItemCount
                withInt: totalItemCount];
    	}
	}
	]-*/

	
	private native void updateTable()/*-[
		UITableView* tableView = (UITableView*) self.uiView;
		[tableView reloadRowsAtIndexPaths:[tableView indexPathsForVisibleRows] withRowAnimation:UITableViewRowAnimationNone];
	]-*/;


	private native void reloadTable()/*-[
		if (!self->disableUpdate_) {
	   		UITableView* tableView = (UITableView*) self.uiView;
	   		[tableView reloadData];
	   }
	]-*/;
	
	
	private void setSeparatorStyle(Object objValue) {
		nativeSetSeparatorStyle((int) objValue);
	}

	private native void nativeSetSeparatorStyle(int separatorStyle) /*-[
		[((UITableView*)self->uiView_) setSeparatorStyle:separatorStyle];
	]-*/;



	private Object getStackFromBottom() {
		return isStackFromBottom();
	}
	
	private boolean isStackFromBottom() {
		return nativeGetStackFromBottom();
	}
	private void setStackFromBottom(Object objValue) {
		boolean stackFromBottom = (boolean) objValue;
		nativeSetStackFromBottom(stackFromBottom);
		if (stackFromBottom) {
			nativesetStackFromBottom();
		} else {
			nativesetStackFromTop();
		}
	}
	
	private native boolean nativeGetStackFromBottom() /*-[
		return ((ASUITableView*)self->uiView_).stackFromBottom;
	]-*/;
	
	private native void nativeSetStackFromBottom(boolean stackFromBottom) /*-[
		((ASUITableView*)self->uiView_).stackFromBottom = stackFromBottom;
	]-*/;
	
	private native void nativesetStackFromBottom() /*-[
		// fixed in layoutsubviews
	]-*/;
	
	private native void nativesetStackFromTop() /*-[
		((UITableView*)self->uiView_).contentInset = UIEdgeInsetsMake(0, 0, 0, 0);
	]-*/;
	private AdapterView.OnItemLongClickListener onItemLongClickListener;
	private void setOnItemLongClick(Object objValue) {
		if (objValue instanceof String) {
			onItemLongClickListener = new OnItemLongClickListener(this, (String) objValue);
		} else {
			onItemLongClickListener = (AdapterView.OnItemLongClickListener) objValue;
		}
		nativeAddLongClickListener(uiView);
		updateTableSelection();
	}
	
	private void longPress(int position) {
		onItemLongClickListener.onItemLongClick(listView, (View) asWidget(), position, -1);
	}
	private native void nativeAddLongClickListener(Object nativeWidget)/*-[
		UIView* view = ((UIView*)nativeWidget);
		ASUILongTapGestureRecognizer *gestureRecognizer = [[ASUILongTapGestureRecognizer alloc] initWithTarget:self action:@selector(longPressDetected:)];
		gestureRecognizer.minimumPressDuration = 1;
		view.userInteractionEnabled = YES;		
	
		for (UIGestureRecognizer* interaction in view.gestureRecognizers) {
	        if ([interaction isKindOfClass:[ASUILongTapGestureRecognizer class]]) {
	            [view removeGestureRecognizer:interaction];
	        }
	    }
		[view addGestureRecognizer:gestureRecognizer];
	]-*/;
	/*-[
 	- (void)longPressDetected:(ASUILongTapGestureRecognizer *)tapRecognizer {
 		if (tapRecognizer.state == UIGestureRecognizerStateBegan) {
      		CGPoint p = [tapRecognizer locationInView:(UITableView*) self.uiView];
      		NSIndexPath *indexPath = [(UITableView*) self.uiView indexPathForRowAtPoint:p];
      
      		if (indexPath == nil) {
        		NSLog(@"long press on table view but not on a row");
      		} else {
          		[self longPressWithInt: indexPath.row];
        		[(UITableView*) self.uiView selectRowAtIndexPath:indexPath
        			animated:NO scrollPosition:UITableViewScrollPositionNone];
      		}
  		}
	}
	]-*/
	private void setSelectedBackgroundView(Object cell) {
		if (this.listSelector != null) {
			setDrawableBounds(cell, listSelector);
			Object imageOrColor = this.listSelector.getDrawable();
			nativeSelectedBackgroundView(cell, imageOrColor);
		}
	}
	
	private native void setDrawableBounds(Object cell, r.android.graphics.drawable.Drawable listSelector)/*-[
		[listSelector setBoundsWithInt:0 withInt:0 withInt:((CustomUITableViewCell*) cell).frame.size.width withInt:((CustomUITableViewCell*) cell).frame.size.height];
	]-*/;
	private native void nativeSelectedBackgroundView(Object cell, Object imageOrColor)/*-[
		UIImageView* selectedBackgroundView = ((CustomUITableViewCell*) cell).selectedBackgroundView;
		if (selectedBackgroundView == nil) {
			selectedBackgroundView = [UIImageView new];
			((CustomUITableViewCell*) cell).selectedBackgroundView = selectedBackgroundView;
		}
		
		selectedBackgroundView.backgroundColor = [UIColor clearColor];

    	if ([selectedBackgroundView  respondsToSelector:@selector(setImage:)]) {
    		[selectedBackgroundView setImage: nil];
			if ([imageOrColor isKindOfClass:[UIImage class]]) {
				[selectedBackgroundView setImage: (UIImage*)imageOrColor];
			}
		}
		
		if ([imageOrColor isKindOfClass:[UIColor class]]) {
			selectedBackgroundView.backgroundColor = (UIColor*)imageOrColor;
		}
	]-*/;
	private r.android.graphics.drawable.Drawable listSelector;
	private void setListSelector(String strValue, Object objValue) {
		this.listSelector = (r.android.graphics.drawable.Drawable) objValue;
		nativesetTrackSelectedCell(listSelector != null && listSelector.isStateful());
	}

	private native void nativesetTrackSelectedCell(boolean trackSelectedCell) /*-[
		((ASUITableView*)self->uiView_).trackSelectedCell = trackSelectedCell;
	]-*/;
	public Object getListSelector() {
		return listSelector;
	}

	
	private int cellSelectionStyle = LayoutNativeVars.UITableViewCellSelectionStyleDefault;
	private void setSelectionStyle(Object objValue) {
		cellSelectionStyle = (int) objValue;
	}
	
	@Override
	public void drawableStateChanged() {
		super.drawableStateChanged();
		if (listSelector != null && listSelector.isStateful() && listSelector.setState(listView.getDrawableState())) {
			setSelectedBackgroundView(getCurrentSelectedCell());
		}
	}

	private native Object getCurrentSelectedCell() /*-[
		ASUITableView* tableView = (ASUITableView*) self.uiView;
		return tableView.currentSelectedCell;
	]-*/;

	private AbsListView.OnScrollListener onScrollChangeListener;
	private void setOnScroll(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		if (objValue instanceof String) {
			onScrollChangeListener = new OnScrollListener(this, (String) objValue);
		} else {
			onScrollChangeListener = (AbsListView.OnScrollListener) objValue;
		}
	}

	private boolean headerDividersEnabled = true;
	private boolean footerDividersEnabled = true;
	private void setHeaderDividersEnabled(Object objValue) {
		this.headerDividersEnabled = (boolean) objValue;
		
		if (isInitialised() && header != null) {
			setCustomDividerAttributes(header, headerDividersEnabled);
		}
	}

	private void setFooterDividersEnabled(Object objValue) {
		this.footerDividersEnabled = (boolean) objValue;
		
		if (isInitialised() && footer != null) {
			setCustomDividerAttributes(footer, footerDividersEnabled);
		}
	}

	private r.android.graphics.drawable.Drawable divider;
	private void setDivider(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		this.divider = (r.android.graphics.drawable.Drawable) objValue;
	}
	private Object getDivider(WidgetAttribute key, ILifeCycleDecorator decorator) {
		return this.divider;
	}

	// only works for custom divider
	private int dividerHeight = -1;
	private int separatorInsetRight;
	private void setDividerHeight(Object objValue) {
		this.dividerHeight = (int) objValue;
	}

	private Object getDividerHeight() {
		return dividerHeight;
	}
	private void setSeparatorInsetRight(Object objValue) {
		separatorInsetRight = (int) objValue;
		nativeSetSeparatorInsetRight(separatorInsetRight);
	}
	
	private native void nativeSetSeparatorInsetRight(int val) /*-[
		ASUITableView* tableView = (ASUITableView*) self.uiView;
		tableView.separatorInset = UIEdgeInsetsMake(tableView.separatorInset.top, tableView.separatorInset.left, tableView.separatorInset.bottom, val);		
	]-*/;

	private void setSeparatorInsetLeft(Object objValue) {
		nativeSetSeparatorInsetLeft((int) objValue);
	}
	
	private native void nativeSetSeparatorInsetLeft(int val) /*-[
		ASUITableView* tableView = (ASUITableView*) self.uiView;
		tableView.separatorInset = UIEdgeInsetsMake(tableView.separatorInset.top, val, tableView.separatorInset.bottom, tableView.separatorInset.right);		
	]-*/;

	private void setSeparatorInsetBottom(Object objValue) {
		nativeSetSeparatorInsetBottom((int) objValue);
	}
	
	private native void nativeSetSeparatorInsetBottom(int val) /*-[
		ASUITableView* tableView = (ASUITableView*) self.uiView;
		tableView.separatorInset = UIEdgeInsetsMake(tableView.separatorInset.top, tableView.separatorInset.left, val, tableView.separatorInset.right);		
	]-*/;

	private void setSeparatorInsetTop(Object objValue) {
		nativeSetSeparatorInsetTop((int) objValue);
	}
	
	private native void nativeSetSeparatorInsetTop(int val) /*-[
		ASUITableView* tableView = (ASUITableView*) self.uiView;
		tableView.separatorInset = UIEdgeInsetsMake(val, tableView.separatorInset.left, tableView.separatorInset.bottom, tableView.separatorInset.right);		
	]-*/;
	

	private boolean reloadTableAfterPostMeasure;

    
    private void nativeRequestLayout() {
    	reloadTableAfterPostMeasure = true;
	}
    
    @com.google.j2objc.annotations.WeakOuter
	class PostMeasureEventHandler extends com.ashera.widget.bus.EventBusHandler {

		public PostMeasureEventHandler(String type) {
			super(type);
		}

		@Override
		protected void doPerform(Object payload) {
			if (reloadTableAfterPostMeasure) {
				notifyDataSetChanged();
				
				reloadTableAfterPostMeasure = false;
			}
		}
		
	}
	public List<com.ashera.model.LoopParam> getData() {
		return dataList;
	}

	
	
	private void postFilter() {
		reloadTable();
	}

	private void preFilter() {
		
	}
}
