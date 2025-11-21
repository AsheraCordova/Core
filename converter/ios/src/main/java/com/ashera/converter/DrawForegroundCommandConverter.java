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
package com.ashera.converter;

import com.ashera.widget.AttributeCommand;
import com.ashera.widget.BaseAttributeCommand;
import com.ashera.widget.IWidget;

import r.android.graphics.drawable.Drawable;
import r.android.view.View;

/*-[
#include <UIKit/UIKit.h>
#include "CGRectWrapper.h"
#include "Rect.h"
]-*/
public class DrawForegroundCommandConverter extends BaseAttributeCommand{
	public DrawForegroundCommandConverter(String id) {
		super(id);
	}

	private Object rectObj;
	@Override
	public Object modifyValue(IWidget widget, Object nativeView, String phase, String attributeName, Object value) {
		if (value == null) {
			return value;
		}
		View view = (View) widget.asWidget();
		
		if (value instanceof Drawable) {
			value = ((Drawable) value).getDrawable();
		}
		drawImage(value, view);
		return value;
	}
	
	@Override
	public boolean executeAfterPostMeasure() {
		return true;
	}

	@Override
	public AttributeCommand newInstance(Object... args) {
		DrawForegroundCommandConverter drawImageCommandConverter = new DrawForegroundCommandConverter(this.id);
		drawImageCommandConverter.setPriority(1000);
		return drawImageCommandConverter;
	}

	@Override
	public void updateArgs(Object... args) {
		
	}

	private native void drawImage(Object image, View view)/*-[
		if ([image isKindOfClass:UIImage.class]) {
			UIImage* uiimage = ((UIImage*) image);
			ADRect* foregroundRect = [view getForegroundBoundsWithInt:uiimage.size.width withInt:uiimage.size.height];
			
			CGRect rect = CGRectMake(foregroundRect->left_, foregroundRect->top_, [foregroundRect width], [foregroundRect height]);
        	[image drawInRect:rect];
    	}
    	if ([image isKindOfClass:UIColor.class]) {
    		CGRect rect = ((CGRectWrapper*) self->rectObj_).rect;
    		[((UIColor*) image) setFill];
    		UIRectFillUsingBlendMode(rect, kCGBlendModeNormal);
    	}
	]-*/;
	
	@Override
	public void updatePhaseArgs(java.lang.Object... args) {
		for (int i = 0; i < args.length; i+=2) {
			Object attributeName = args[i];
			
			if (attributeName.equals("rect")) {
				rectObj = args[i + 1];		
			}
		}
	}
}
