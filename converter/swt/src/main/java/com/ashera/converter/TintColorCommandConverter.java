package com.ashera.converter;


import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

import com.ashera.widget.AttributeCommand;
import com.ashera.widget.BaseAttributeCommand;
import com.ashera.widget.IWidget;

public class TintColorCommandConverter extends BaseAttributeCommand {
	private Color tintColor;
	private String tintMode;
	public TintColorCommandConverter(String id) {
		super(id);
	}

	@Override
	public Object modifyValue(IWidget widget, Object nativeView, String phase, String attributeName, Object value) {
		if (value != null && tintColor != null) {
			if (value instanceof r.android.graphics.drawable.Drawable) {
				((r.android.graphics.drawable.Drawable) value).setTintColor(tintColor);
				((r.android.graphics.drawable.Drawable) value).setTintMode(tintMode);
			}
		}
		return value;

	}


	@Override
	public AttributeCommand newInstance(Object... args) {
		TintColorCommandConverter capInsetsCommandConverter = new TintColorCommandConverter(this.id);
		capInsetsCommandConverter.updateArgs(args);
		return capInsetsCommandConverter;
	}

	@Override
	public void updateArgs(Object... args) {
		if (args[0] instanceof Color) {
			this.tintColor = (Color)args[0];
		}
		
		if (args[0] instanceof String) {
			this.tintMode = (String)args[0];
		}
	}

}
