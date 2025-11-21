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

import java.util.HashMap;
import java.util.Map;

import com.ashera.converter.AbstractEnumToIntConverter;

public class Divider extends AbstractEnumToIntConverter {
	private Map<String, Integer> mapping = new HashMap<>();
	{
		mapping.put("beginning", 0x1);
		mapping.put("middle", 0x2);
		mapping.put("end", 0x4);
		mapping.put("none", 0x0);
	}

	@Override
	public Map<String, Integer> getMapping() {
		return mapping;
	}

	@Override
	public Integer getDefault() {
		return 0;
	}
}
