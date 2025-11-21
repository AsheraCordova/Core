//start - license
/*
 * Copyright (c) 2025 Ashera Cordova
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
//end - license
package com.ashera.layout;


//start - imports
import java.util.*;

import android.content.*;
import android.graphics.*;
import android.os.Build;
import android.view.*;

import com.ashera.core.IFragment;
import com.ashera.converter.*;
import android.annotation.SuppressLint;

import com.ashera.widget.bus.*;
import com.ashera.widget.*;


import static com.ashera.widget.IWidget.*;
//end - imports
@SuppressLint("NewApi")
public class ViewOverlayImpl extends BaseWidget {
	//start - body
	private View viewStub;
	public final static String LOCAL_NAME = "com.ashera.layout.ViewOverlay"; 
	public final static String GROUP_NAME = "ViewOverlay";
	
	
	@Override
	public void loadAttributes(String attributeName) {

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("anchorRef").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("boundsType").withType("string").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawable").withType("drawable").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("offsetVertical").withType("string").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("offsetHorizontal").withType("string").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableWidth").withType("string").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("drawableHeight").withType("string").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("boundsConverter").withType("string").withOrder(-1));

	}
	
	public ViewOverlayImpl() {
		super(LOCAL_NAME, LOCAL_NAME);
	}	

	@Override
	public IWidget newInstance() {
		return new ViewOverlayImpl();
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
		
        viewStub = new ViewStub((Context) fragment.getRootActivity());
		nativeCreate(fragment, params);	
	}
	

    

	@Override
	@SuppressLint("NewApi")
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {		
		Object nativeWidget = asNativeWidget();

		switch (key.getAttributeName()) {
			case "anchorRef": {
				


		this.setAnchorRef((String)objValue);



			}
			break;
			case "boundsType": {
				


		setType(strValue);



			}
			break;
			case "drawable": {
				


		this.setDrawable(objValue);



			}
			break;
			case "offsetVertical": {
				


		this.setOffsetVertical((String)objValue);



			}
			break;
			case "offsetHorizontal": {
				


		this.setOffsetHorizontal((String)objValue);



			}
			break;
			case "drawableWidth": {
				


		this.setDrawableWidth((String)objValue);



			}
			break;
			case "drawableHeight": {
				


		this.setDrawableHeight((String)objValue);



			}
			break;
			case "boundsConverter": {
				


		this.setBoundsConverter((String)objValue);



			}
			break;
		default:
			break;
		}
	}
	@Override
	public Object asWidget() {
		return viewStub;
	}
	
	@Override
	@SuppressLint("NewApi")
	public Object getAttribute(WidgetAttribute key, ILifeCycleDecorator decorator) {
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
		}
		
		return null;
	}
	
	

    @Override
    public Object asNativeWidget() {
        return viewStub;
        
    }
    private void nativeCreate(IFragment fragment, Map<String, Object> params) {
    }
    
    @Override
	public Class getViewClass() {
		return View.class;
	}
	//end - body
    //start - codecopy
    private IWidget anchor;
    private String drawableWidth;
    private String drawableHeight;
    private String offsetHorizontal;
    private String offsetVertical;
    private android.graphics.drawable.Drawable drawable;
    private String boundsType = "center";
    private String boundsConverter = "overlay_bounds";

    private void setDrawableHeight(String drawableHeight) {
		this.drawableHeight = drawableHeight;
	}

	private void setDrawableWidth(String drawableWidth) {
		this.drawableWidth = drawableWidth;
	}

	private void setOffsetHorizontal(String offsetHorizontal) {
		this.offsetHorizontal = offsetHorizontal;
	}

	private void setOffsetVertical(String offsetVertical) {
		this.offsetVertical = offsetVertical;
	}

	private void setDrawable(Object drawable) {
		if (drawable instanceof android.graphics.drawable.Drawable) {
			this.drawable = (android.graphics.drawable.Drawable) drawable;
		} else {
			this.drawable = null;
		}
		
		updateDrawableAttributes();		
	}

	private void setType(String boundsType) {
		this.boundsType = boundsType;
	}
	private android.graphics.drawable.Drawable currentDrawable = null;
	private void setAnchorRef(String id) {
		anchor = this.getParent().findWidgetById(id);
		addOverlay();
	}

	private void addOverlay() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
			if (anchor != null) {
				View view = (View) anchor.asWidget();
				
				if (currentDrawable != null) {
					view.getOverlay().remove(currentDrawable);
				}
				addOverlayInternal(view);
			}
		}
	}

	private int[] getBounds(View view) {
		int width = view.getWidth();
		int height = view.getHeight();

		int left = getLeft(view);;
		int top = getTop(view);
		int intrinsicWidth = drawable.getIntrinsicWidth();
		int mydrawableWidth = getDrawableDimen(drawableWidth, intrinsicWidth, width, height);
		int intrinsicHeight = drawable.getIntrinsicHeight();
		int mydrawableHeight = getDrawableDimen(drawableHeight, intrinsicHeight, width, height);
		
		int myoffsetHorizontal = percentDimensionConvert(offsetHorizontal, width, height);
		int myoffsetVertical = percentDimensionConvert(offsetVertical, width, height);
		
		if (offsetHorizontal == null) {
			myoffsetHorizontal = 0;
		}
		
		if (offsetVertical == null) {
			myoffsetVertical = 0;
		}
		
		Object[] value = new Object[] {this.boundsType, mydrawableWidth,mydrawableHeight, 
				left, top, width, height};
		int[] bounds = (int[]) ConverterFactory.get(boundsConverter).convertFrom(value, null, getFragment());
		int[] finalBounds = new int[] {bounds[0] + myoffsetHorizontal, 
				bounds[1] + myoffsetVertical, 
				bounds[2] + bounds[0]+ myoffsetHorizontal, 
				bounds[3] + bounds[1]+ myoffsetVertical};
		return finalBounds;
	}

	private int getDrawableDimen(String dimen, int intrinsicDimen, int width, int height) {
		int finalWidth = percentDimensionConvert(dimen, width, height);
		
		if (finalWidth == -1) {
			finalWidth = intrinsicDimen;
		}
		return finalWidth;
	}

	private int percentDimensionConvert(String dimen, int width, int height) {
		int finalWidth = -1;
		if (dimen != null) {
			if (dimen.endsWith("%w")) {
				finalWidth = (int)((Integer.parseInt(dimen.replace("%w", ""))/100f) * width);
			} else if (dimen.endsWith("%h")) {
				finalWidth = (int)((Integer.parseInt(dimen.replace("%h", ""))/100f) * height);
			} else {
				finalWidth = (int) quickConvert(dimen, CommonConverters.dimension);
			}
		}
		return finalWidth;
	}
	
	private void setBoundsConverter(String boundsConverter) {
		this.boundsConverter = boundsConverter;
		
	}
	
	//end - codecopy
	private void addOverlayInternal(View view) {
		view.post(() -> {
			if (drawable != null) {
				int[] finalBounds = getBounds(view);
				drawable.setBounds(finalBounds[0], finalBounds[1], finalBounds[2], finalBounds[3]);
				view.getOverlay().add(drawable);
			}
			
			currentDrawable = drawable;
		});
	}
	

	private int getTop(View view) {
		return 0;
	}

	private int getLeft(View view) {
		return 0;
	}


	private void updateDrawableAttributes() {
	}
	
	@Override
	public void requestLayout() {
		super.requestLayout();
		
		if (anchor != null) {
			anchor.requestLayout();
		}
	}
	
	@Override
	public void invalidate() {
		super.invalidate();
		
		if (anchor != null) {
			anchor.invalidate();
		}
	}
}
