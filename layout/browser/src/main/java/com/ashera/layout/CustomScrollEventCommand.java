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
package com.ashera.layout;

import java.util.Iterator;
import java.util.Map;

import com.ashera.widget.EventExpressionParser;
import com.ashera.widget.HasWidgets;
import com.ashera.widget.IWidget;

public class CustomScrollEventCommand implements com.ashera.widget.EventCommand {
	@Override
	public Object executeCommand(IWidget widget, Map<String, Object> eventObject, Object... params) {
		String event = (String) eventObject.get(EventExpressionParser.KEY_SCRIPT_NAME);
		switch (event) {
			case "onScrollChange": {
				widget.invokeMethod("onScrollChange", params);
				break;
			}
			
			case "onCustomScrollTouch": {
				Iterator<IWidget> iterator = ((com.ashera.widget.HasWidgets) getParent(widget)).iterator();
				while (iterator.hasNext()) {
					IWidget childIWidget = iterator.next();
					
					if (widget != childIWidget) {
						childIWidget.invokeMethod("onCustomScrollTouch", params);
						break;
					}
					
				}
				break;
			}
		}

		return null;
	}

	private HasWidgets getParent(IWidget widget) {
		if ("@+id/customScrollbar".equals(widget.getId())) {
			return widget.getParent();
		}
		return getParent(widget.getParent());
	}
}
