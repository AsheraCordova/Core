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
]-*/
public class DrawImageCommandConverter extends BaseAttributeCommand{
	private Object rectObj;

	public DrawImageCommandConverter(String id) {
		super(id);
	}

	@Override
	public Object modifyValue(IWidget widget, Object nativeView, String phase, String attributeName, Object value) {
		if (value == null) {
			return value;
		}
		
		if (value instanceof Drawable) {
			Drawable drawable = (Drawable) value;
			value = drawable.getDrawable();
		}
		drawImage(value);
		return value;
	}

	@Override
	public boolean executeAfterPostMeasure() {
		return true;
	}

	@Override
	public AttributeCommand newInstance(Object... args) {
		DrawImageCommandConverter drawImageCommandConverter = new DrawImageCommandConverter(this.id);
		drawImageCommandConverter.setPriority(1000);
		return drawImageCommandConverter;
	}

	@Override
	public void updateArgs(Object... args) {
		
	}

	private native void drawImage(Object image)/*-[
		if ([image isKindOfClass:UIImage.class]) {
			CGRect rect = ((CGRectWrapper*) self->rectObj_).rect;
        	[((UIImage*) image) drawInRect:rect];
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
