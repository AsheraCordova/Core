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

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Control;

import com.ashera.common.ImageUtils.ResizeOptions;
import com.ashera.model.RectM;
import com.ashera.widget.AttributeCommand;
import com.ashera.widget.BaseAttributeCommand;
import com.ashera.widget.IWidget;

import r.android.graphics.drawable.Drawable;

public class ImageRepeatCommandConverter extends BaseAttributeCommand {
	private String backgroundRepeat;

	public ImageRepeatCommandConverter(String id) {
		super(id);
	}

	@Override
	public Object modifyValue(IWidget widget, Object nativeView, String phase, String attributeName, Object value) {
		Control control = (Control) widget.asNativeWidget();

		Rectangle rect = control.getBounds();
		Object tintColor = null;
		String tintMode = null;
		if (value instanceof r.android.graphics.drawable.Drawable) {
			Drawable drawable = (r.android.graphics.drawable.Drawable) value;
			tintColor = drawable.getTintColor();
			tintMode = drawable.getTintMode();
			//drawable.setBounds(rect.x, rect.y, rect.x + rect.width, rect.y + rect.height);
			value = drawable.getDrawable();
		}
		
		if (rect.height == 0 || rect.width == 0 || value == null || !(value instanceof Image)) {
			return value;
		}
		
		if (tintColor != null) {
			value = com.ashera.common.ImageUtils.tintImage((Image) value, (Color) tintColor, tintMode);
		}
		if (backgroundRepeat == null || backgroundRepeat.equals("no-repeat") || backgroundRepeat.equals("no_repeat")) {
			org.eclipse.swt.graphics.Rectangle bounds = control.getBounds();
			Image image = (Image) value;
			
			if (bounds.height != image.getBounds().height || bounds.width != image.getBounds().width) {
				com.ashera.common.ImageUtils.ResizeOptions.Builder builder = new com.ashera.common.ImageUtils.ResizeOptions.Builder();
				ResizeOptions options = builder.withUseBackgroundHint(true).withBackgroundHint(control.getParent().getBackground()).initFromAttr(widget, "background").
					build();
				Image resize = com.ashera.common.ImageUtils.resize(image, bounds.width, bounds.height, 
						new RectM(0, 0, bounds.width, bounds.height), null, options);
				widget.getFragment().addDisposable(resize);
				value  = resize;
			}
		}
		return value;
	}

	@Override
	public AttributeCommand newInstance(Object... args) {
		ImageRepeatCommandConverter backgroundRepeatCommandConverter = new ImageRepeatCommandConverter(this.id);
		backgroundRepeatCommandConverter.setPriority(20);
		backgroundRepeatCommandConverter.updateArgs(args);
		return backgroundRepeatCommandConverter;
	}

	@Override
	public void updateArgs(Object... args) {
		this.backgroundRepeat = (String) args[0];
	}

	@Override
	public boolean executeAfterPostMeasure() {
		return true;
	}

}
