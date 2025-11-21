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

import com.ashera.utils.StringUtils;

import android.content.res.Resources;
import android.graphics.Color;
import android.util.DisplayMetrics;

public class ConverterPlugin extends BaseConverterPlugin  {
	private static final String CONVERTER_PLUGIN_NAME = "converter";

	@Override
	public Object getColor(String color) {
		return Color.parseColor(color);
	}

	@Override
	public float convertDpToPixel(String dimen) {
		Resources resources = Resources.getSystem();
		DisplayMetrics metrics = resources.getDisplayMetrics();
		float px = Float.parseFloat(dimen.replace("dp", "")) * ((float)metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
		return px;
	}
	
	@Override
	public float convertSpToPixel(String dimen) {
		Resources resources = Resources.getSystem();
		DisplayMetrics metrics = resources.getDisplayMetrics();
		float px = Float.parseFloat(dimen.replace("sp", "")) * metrics.scaledDensity;
		return px;
	}

	@Override
	public String getName() {
		return CONVERTER_PLUGIN_NAME;
	}

	@Override
	public String convertPixelToDp(Object px, boolean isInt) {
		Resources resources = Resources.getSystem();
	    float f = ((Number) px).floatValue() / ((float) resources.getDisplayMetrics().densityDpi / DisplayMetrics.DENSITY_DEFAULT);
	    if (isInt) {
	    	return StringUtils.floatToString((int) f) + "dp";
	    }
		return StringUtils.floatToString(f) + "dp";
	}

	@Override
	public String convertPixelToSp(Object px, boolean isInt) {
		Resources resources = Resources.getSystem();
		DisplayMetrics metrics = resources.getDisplayMetrics();
	    float f = ((Number) px).floatValue() / (metrics.scaledDensity);
	    if (isInt) {
	    	return StringUtils.floatToString((int) f) + "sp";
	    }
	    return StringUtils.floatToString(f) + "sp";
	}
}
