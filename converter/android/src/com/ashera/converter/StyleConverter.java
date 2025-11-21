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

public class StyleConverter extends ColorImageConverter{
	@Override
	public java.lang.Object convertFrom(java.lang.String value, Map<String, Object> dependentAttributesMap, IFragment fragment) {
        String key1 = value.replaceFirst("@style/", "");
        Context context = (Context) fragment.getRootActivity();
        int id = context.getResources().getIdentifier(key1, "style", context.getPackageName());
		return id;
	}

}
