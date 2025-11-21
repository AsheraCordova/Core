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
	private String image;
	@Override
	public java.lang.Object getDrawable() {
		Rect bounds = getBounds();
		if (bounds.isEmpty()) {
			return "data:image/svg+xml;base64," + org.teavm.jso.browser.Window.btoa("<svg xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink'></svg>");
		}

		if (image == null) {
			int width = bounds.width();
			int height = bounds.height();

			switch (getType()) {
			case "line":
				String stokeColor = (String) getStrokeColor();
				int stokeWidth = getStrokeWidth();
				if (stokeWidth < 0) {
					stokeWidth = 0;
				}
				int strokeDashWidth = getStrokeDashWidth();
				int strokeDashGap = getStrokeDashGap();
				
				image = "data:image/svg+xml;base64," + drawLine(0, height/2, width, height, stokeColor, stokeWidth, strokeDashWidth, strokeDashGap);
				    
				break;

			default:
				break;
			}
			
		}
		return image;
	}

	
	private String drawLine(int x, int y, int width, int height, String stokeColor, int stokeWidth, int strokeDashWidth, int strokeDashGap) {
		String svg = String.format("<svg xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink' width='%d' height='%d' >" +
		  "<line  x1='%d' y1='%d' x2='%d' y2='%d' style='stroke:%s;stroke-width:%d' />" +
		  "</svg>", width, height, x, y, x + width, y, stokeColor, stokeWidth);
		return org.teavm.jso.browser.Window.btoa(svg);
	}

	@Override
	protected void onBoundsChange(r.android.graphics.Rect bounds) {
		super.onBoundsChange(bounds);
		if (image != null) {
			image = null;
		}
	}
}
