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
import com.ashera.widget.IWidget;
import android.widget.TextView;
import android.view.KeyEvent;

public class CustomKeyboardEventCommand implements com.ashera.widget.EventCommand {
	@Override
	public Object executeCommand(IWidget widget, Map<String, Object> eventObject, Object... params) {
		String event = (String) eventObject.get(EventExpressionParser.KEY_SCRIPT_NAME);
		switch (event) {
			case "onKeyClick": {
				handleKeyClicked(widget);
				break;
			}
			
			case "onEditTextFocusChanged": {
				if (params[1].equals(Boolean.TRUE)) {
					widget.invokeMethod("openCustomKeyboard");
				} else {
					widget.invokeMethod("closeCustomKeyboard");
				}
				break;
			}
		}

		return null;
	}

	private void handleKeyClicked(IWidget widget) {
		IWidget editText = (IWidget) widget.getModelFromScope("activeEditText", com.ashera.model.ModelScope.view);
		editText.invokeMethod("preKeyboardClicked");
		String keyCodeStr = (String) widget.getUserData("keycode");
		
		if (keyCodeStr.startsWith("mode_") ) {
			com.ashera.widget.HasWidgets KeyBoardRoot = getParentWithUserData(widget, "keyboard_root");
			for (Iterator<IWidget> iterator = KeyBoardRoot.iterator(); iterator.hasNext();) {
				IWidget child = iterator.next();
				
				if (child.getUserData("mode").equals(keyCodeStr)) {
					child.setAttribute("visibility", android.view.View.VISIBLE, true);
				} else {
					child.setAttribute("visibility", android.view.View.GONE, true);
				}
			}
			
		}
		else {
			int keyCode = Integer.parseInt(keyCodeStr);
			TextView textview = (TextView) widget.asWidget();
	
			Object shiftEnabled = widget.getUserData("shiftkey");
			
			switch (keyCode) {
			case KeyEvent.KEYCODE_DEL:
				editText.setAttribute("deletePreviousCharacter", "", true);
				break;
	
			case KeyEvent.KEYCODE_ENTER:
				editText.setAttribute("performEditorActionDone", null, true);
				break;
	
			case KeyEvent.KEYCODE_SPACE:
				editText.setAttribute("commitText", " ", true);
				break;
	
			case KeyEvent.KEYCODE_SHIFT_LEFT:
				 toggleShift(getParentWithUserData(widget, "mode"), shiftEnabled);
					
				if (shiftEnabled == null) {
					widget.storeUserData("shiftkey", "true");
				} else {
					widget.storeUserData("shiftkey", null);
				}
				break;
	
			default:
				editText.setAttribute("commitText", (String) textview.getText(), true);
				break;
			}
		}
		
		editText.invokeMethod("postKeyboardClicked");
	}
	
	private com.ashera.widget.HasWidgets getParentWithUserData(IWidget widget, String key) {
		while ((widget = widget.getParent()) != null) {
			if (widget.getUserData(key) != null) {
				return (com.ashera.widget.HasWidgets) widget;
			}
		}
		
		return null;
	}
	
	private void toggleShift(IWidget widget, Object shiftEnabled) {
		com.ashera.widget.HasWidgets hasWidgets = ((com.ashera.widget.HasWidgets)widget);
		
		for (Iterator<IWidget> iterator = hasWidgets.iterator(); iterator.hasNext();) {
			IWidget child = iterator.next();
			if (child instanceof com.ashera.widget.HasWidgets) {
				toggleShift(child, shiftEnabled);
			} else {
				if (child.asWidget() instanceof TextView) {
					TextView key = (TextView) child.asWidget();
					String text = key.getText().toString();
					
					 if (text.length() == 1 && Character.isLetter(text.charAt(0))) {
						 key.setText(shiftEnabled != null ? text.toUpperCase() : text.toLowerCase());
					 }
				}
			}
		}
	}
}
