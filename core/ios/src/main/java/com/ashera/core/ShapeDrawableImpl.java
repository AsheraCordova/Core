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
package com.ashera.core;

import r.android.graphics.Rect;

public class ShapeDrawableImpl extends r.android.graphics.drawable.ShapeDrawable{
	private Object image;
	@Override
	public java.lang.Object getDrawable() {
		Rect bounds = getBounds();
		if (bounds.isEmpty()) {
			return emptyImage();
		}

		if (image == null) {
			int width = bounds.width();
			int height = bounds.height();

			switch (getType()) {
			case "line":
				Object stokeColor = getStrokeColor();
				int stokeWidth = getStrokeWidth();
				if (stokeWidth < 0) {
					stokeWidth = 0;
				}
				int strokeDashWidth = getStrokeDashWidth();
				int strokeDashGap = getStrokeDashGap();
				
				image = drawLine(0, height/2, width, height, stokeColor, stokeWidth, strokeDashWidth, strokeDashGap);
				    
				break;

			default:
				break;
			}
			
		}
		return image;
	}
	private native Object emptyImage()/*-[
		return [UIImage new];
	]-*/;
	
	private native Object drawLine(int x, int y, int width, int height, Object stokeColor, int stokeWidth, int strokeDashWidth, int strokeDashGap)/*-[
		UIGraphicsBeginImageContext(CGSizeMake(width, height));
		
		CGContextRef context = UIGraphicsGetCurrentContext();
		CGContextSetLineWidth(context, stokeWidth);
		CGContextMoveToPoint(context, 0, height/2.0);
		CGContextAddLineToPoint(context, width, height/2.0);
		CGContextSetStrokeColorWithColor(context, [(UIColor*)stokeColor CGColor]);
		CGContextStrokePath(context);
		if (strokeDashWidth > 0 && strokeDashGap > 0) {
			CGFloat dashLengths[] = {stokeWidth, strokeDashWidth};
			CGContextSetLineDash(context, 0, dashLengths, 2);
		}
		// Create new image
		UIImage *newImage = UIGraphicsGetImageFromCurrentImageContext();
		
		// Tidy up
		UIGraphicsEndImageContext();
		return newImage;
	]-*/;

	@Override
	protected void onBoundsChange(r.android.graphics.Rect bounds) {
		super.onBoundsChange(bounds);
		if (image != null) {
			image = null;
		}
	}
}
