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

public class TintColorCommandConverter extends BaseAttributeCommand {
	private Object tintColor;
	private String tintMode;
	public TintColorCommandConverter(String id) {
		super(id);
	}

	@Override
	public Object modifyValue(IWidget widget, Object nativeView, String phase, String attributeName, Object value) {
		if (value != null && tintColor != null) {
			if (value instanceof r.android.graphics.drawable.Drawable) {
				((r.android.graphics.drawable.Drawable) value).setTintColor(tintColor);
				((r.android.graphics.drawable.Drawable) value).setTintMode(tintMode);
			}
		}
		return value;

	}


	@Override
	public AttributeCommand newInstance(Object... args) {
		TintColorCommandConverter capInsetsCommandConverter = new TintColorCommandConverter(this.id);
		capInsetsCommandConverter.updateArgs(args);
		return capInsetsCommandConverter;
	}

	@Override
	public void updateArgs(Object... args) {
		if (args[0] instanceof String) {
			this.tintMode = (String)args[0];
		} else {
			this.tintColor = args[0];
		}
	}

}
