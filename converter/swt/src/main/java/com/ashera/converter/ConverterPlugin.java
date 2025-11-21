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

import org.eclipse.swt.widgets.Display;

import com.ashera.common.ColorManager;
import com.ashera.utils.StringUtils;

public class ConverterPlugin extends BaseConverterPlugin  {
	private static final String CONVERTER_PLUGIN_NAME = "converter";
	

	@Override
	public String getName() {
		return CONVERTER_PLUGIN_NAME;
	}



	public Object getColor(String color) {
		return ColorManager.getColor(color);
	}


	@Override
	public float convertDpToPixel(String dimen) {
		float dp = Float.parseFloat(dimen.replace("dp", ""));
        int dpi = Display.getDefault().getDPI().x;
        float px = (dp * dpi) / 160f;

        return px;
		
	}


	@Override
	public float convertSpToPixel(String dimen) {
		int sp = Integer.parseInt(dimen.replace("sp", ""));
        int dpi = Display.getDefault().getDPI().x;
        float px = (sp * dpi) / 160f;
        return px;
		
	}


	@Override
	public String convertPixelToDp(Object objpx, boolean isInt) {
		Number px = (Number) objpx;
		int dpi = Display.getDefault().getDPI().x;
		float dp = (px.floatValue() * 160f) / (dpi);
		if (isInt) {
	    	return StringUtils.floatToString((int) dp) + "dp";
	    }
        return StringUtils.floatToString(dp) + "dp";
	}


	@Override
	public String convertPixelToSp(Object objpx, boolean isInt) {
        Number px = (Number) objpx;
        int dpi = Display.getDefault().getDPI().x;
        float sp = (px.floatValue() * 160f) / (dpi);
        if (isInt) {
	    	return StringUtils.floatToString((int) sp) + "sp";
	    }
        return StringUtils.floatToString(sp) + "sp";
	}


}
