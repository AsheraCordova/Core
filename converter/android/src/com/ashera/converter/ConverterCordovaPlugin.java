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

import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;

import com.ashera.converter.CommonConverters;
import com.ashera.converter.ConverterFactory;
import com.ashera.plugin.PluginManager;

public class ConverterCordovaPlugin extends CordovaPlugin {

	@Override
	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
		PluginManager.register(new ConverterPlugin());
		
		// register converters
		CommonConverters.init();
		ConverterFactory.register("color", new ColorConverter());
		ConverterFactory.register("colorstate", new ColorStateConverter());
		ConverterFactory.register("colorimage", new ColorImageConverter());
		ConverterFactory.register("drawable", new DrawableImageConverter());
		ConverterFactory.register("font", new FontConverter());
		ConverterFactory.register("style", new StyleConverter());
		ConverterFactory.register("xmlresource", new XmlResourceConverter());
		ConverterFactory.register("divider", new Divider());
		ConverterFactory.register("id", new AndroidIdConverter());
		
		ConverterFactory.registerCommandConverter(new ImageRepeatCommandConverter("imageRepeat"));
	}

}
