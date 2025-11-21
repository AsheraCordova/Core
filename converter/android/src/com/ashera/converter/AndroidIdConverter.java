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

public class AndroidIdConverter extends IdConverter {
	@Override
	public Integer convertFrom(String value, Map<String, Object> dependentAttributesMap, IFragment fragment) {
		if (fragment.getRootDirectory() == null && value != null && (value.startsWith("@+id/n__") || value.startsWith("@id/n__"))) {
			com.ashera.core.IActivity activity = fragment.getRootActivity();
			androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) activity;
			int id = fragmentActivity.getResources().getIdentifier(value.replace("@+id/", "").replace("@id/", ""), "id", fragmentActivity.getPackageName());
			com.ashera.widget.IdGenerator.setId(value, id);
		}
		return super.convertFrom(value, dependentAttributesMap, fragment);
	}
}
