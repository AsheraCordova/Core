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

import java.util.Map;

import com.ashera.core.IFragment;
import com.ashera.utils.ColorUtil;
import com.ashera.utils.ResourceBundleUtils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;

public class ColorStateConverter implements IConverter<ColorStateList, String>{
	java.util.ResourceBundle resourceBundle;

	@Override
	public ColorStateList convertFrom(String value,  Map<String, Object> dependentAttributesMap, IFragment fragment) {
		if (value == null) {
			return null;
		}
		String color = ResourceBundleUtils.getString("color/color", "color", value, fragment);
		if (color.startsWith("{")) {
			if (fragment.getRootDirectory() != null) {
				Map<String, Object> colorMap = com.ashera.widget.PluginInvoker.unmarshal(color, Map.class);
	        	return ColorStateListFactory.getColor(colorMap, fragment);
			}
			Context context = (Context) fragment.getRootActivity();
			return androidx.core.content.ContextCompat.getColorStateList(context, context.getResources().getIdentifier(value, "color", context.getPackageName()));
		}
		return ColorStateList.valueOf(Color.parseColor(ColorUtil.colorToHex(color)));		
	}

	@Override
	public String convertTo(ColorStateList value, IFragment fragment) {
		return ColorUtil.getColorString(value.getColorForState(new int[]{}, value.getDefaultColor()));
	}

	@Override
	public java.util.List<String> getDependentAttributes() {
		return null;
	}
}