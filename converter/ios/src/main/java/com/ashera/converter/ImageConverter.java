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

public class ImageConverter extends ColorImageConverter {
    @Override
    public Object convertFrom(String value,  Map<String, Object> dependentAttributesMap, IFragment fragment) {
       if (value == null || value.equals("@null") || value.startsWith("@drawable")) {
			Object image = super.convertFrom(value, dependentAttributesMap, fragment);
			if (isImage(image)) {
				return image;
			}
       }

        throw new RuntimeException("Unable to convert path to image : " + value);
    }
       
   	private native boolean isImage(Object objImage)/*-[
		return [objImage isKindOfClass:[UIImage class]];
	]-*/;


    @Override
    public String convertTo(Object value, IFragment fragment) {
    	return super.convertTo(value, fragment);
    }
    
    @Override
    public java.util.List<String> getDependentAttributes() {
        return super.getDependentAttributes();
    }
}
