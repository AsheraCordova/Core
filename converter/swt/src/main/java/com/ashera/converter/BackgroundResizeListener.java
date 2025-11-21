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

import java.util.List;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

import com.ashera.widget.IWidget;
import com.ashera.widget.AttributeCommand;

public class BackgroundResizeListener implements Listener{
    private org.eclipse.swt.graphics.Rectangle rect;
    private Control control;
    private IWidget widget;
    private Image originalValue;

	private List<AttributeCommand> commands = new java.util.ArrayList<>();
    public BackgroundResizeListener(IWidget widget) {
    	this.widget = widget;
    	this.control = (Control) widget.asNativeWidget();
	}

    public void setOriginalValue(Image originalValue) {
		this.originalValue = originalValue;
	}
    
	@Override
	public void handleEvent(Event event) {
        org.eclipse.swt.graphics.Rectangle bounds = control.getBounds();
        if (rect == null || !bounds.equals(rect)) {
            rect = control.getBounds();
            Image iamge = null;
            for (AttributeCommand valueModificationCommand : commands) {
            	iamge = (Image) valueModificationCommand.modifyValue(widget, widget.asNativeWidget(), null, "background", originalValue);
			}
            control.setBackgroundImage(iamge);
        }
	}

}
