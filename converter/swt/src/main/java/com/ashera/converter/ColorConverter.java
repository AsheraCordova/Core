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

import org.eclipse.swt.graphics.Color;

import com.ashera.core.IFragment;
import com.ashera.utils.ColorUtil;
import com.ashera.utils.ResourceBundleUtils;

public class ColorConverter implements IConverter<Object, String> {
    java.util.ResourceBundle resourceBundle;


    @Override
    public Object convertFrom(String value,  Map<String, Object> dependentAttributesMap, IFragment fragment) {
    	if (value == null) {
			return null;
		}
        if (value.startsWith("#") || value.startsWith("@color/") || !value.startsWith("@")) {
            String color = ResourceBundleUtils.getString("color/color", "color", value, fragment);
            if (color.startsWith("{")) {
            	//TODO - Handle color state
            	return null;
            }
            return com.ashera.widget.PluginInvoker.getColor(ColorUtil.colorToHex(color));
        }        
        return null;
    }

    @Override
    public String convertTo(Object value, IFragment fragment) {
        if (value instanceof String) {
            return (String) value;
        }
        if (value instanceof Color) {
            Color color = ((Color)value);
            return ColorUtil.getColorString(color.getRed(), color.getBlue(), color.getGreen());
        }
        return null;
    }

    @Override
    public java.util.List<String> getDependentAttributes() {
        return null;
    }
}
