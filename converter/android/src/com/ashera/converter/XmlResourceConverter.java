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

import android.content.Context;

public class XmlResourceConverter implements IConverter<Integer, String> {
	java.util.ResourceBundle resourceBundle;

	@Override
	public Integer convertFrom(String value, Map<String, Object> dependentAttributesMap, IFragment fragment) {
		if (value.startsWith("@xml/")) {
			String key1 = value.replaceFirst("@xml/", "");
			Context context = (Context) fragment.getRootActivity();
			int identifier = context.getResources().getIdentifier(key1, "xml", context.getPackageName());
			return identifier;
		}
		throw new RuntimeException("Unsupported attribute xml resource : " + value);
	}

	@Override
	public String convertTo(Integer value, IFragment fragment) {
		return null;
	}

	@Override
	public java.util.List<String> getDependentAttributes() {
		return null;
	}
}
