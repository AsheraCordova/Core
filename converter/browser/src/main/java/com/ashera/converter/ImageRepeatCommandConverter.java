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

public class ImageRepeatCommandConverter extends BaseAttributeCommand {
	private String backgroundRepeat;

	public ImageRepeatCommandConverter(String id) {
		super(id);
	}

	@Override
	public Object modifyValue(IWidget widget, Object nativeView, String phase, String attributeName, Object value) {
		org.teavm.jso.dom.html.HTMLElement htmlElement = ((org.teavm.jso.dom.html.HTMLElement) widget.asNativeWidget());
		if (backgroundRepeat == null || backgroundRepeat.equals("no-repeat") || backgroundRepeat.equals("no_repeat")) {
			htmlElement.getStyle().setProperty("background-repeat", "no-repeat");
			htmlElement.getStyle().setProperty("background-size", "100% 100%");
		} else {
			htmlElement.getStyle().setProperty("background-repeat", "repeat");
			htmlElement.getStyle().removeProperty("background-size");
		}
		return value;
	}

	@Override
	public AttributeCommand newInstance(Object... args) {
		ImageRepeatCommandConverter backgroundRepeatCommandConverter = new ImageRepeatCommandConverter(this.id);
		backgroundRepeatCommandConverter.updateArgs(args);
		return backgroundRepeatCommandConverter;
	}

	@Override
	public void updateArgs(Object... args) {
		this.backgroundRepeat = (String) args[0];
	}

	@Override
	public boolean executeAfterPostMeasure() {
		return false;
	}

}
