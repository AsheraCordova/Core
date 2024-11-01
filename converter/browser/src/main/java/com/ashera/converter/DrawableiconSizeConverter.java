package com.ashera.converter;


import com.ashera.widget.AttributeCommand;
import com.ashera.widget.BaseAttributeCommand;
import com.ashera.widget.IWidget;

public class DrawableiconSizeConverter extends BaseAttributeCommand {
	private Integer iconSize;
	public DrawableiconSizeConverter(String id) {
		super(id);
	}

	@Override
	public Object modifyValue(IWidget widget, Object nativeView, String phase, String attributeName, Object value) {
		if (value != null && iconSize != null) {
			if (value instanceof r.android.graphics.drawable.Drawable) {
				((r.android.graphics.drawable.Drawable) value).setMinimumHeight(iconSize);
				((r.android.graphics.drawable.Drawable) value).setMinimumWidth(iconSize);
			}
		}
		return value;

	}


	@Override
	public AttributeCommand newInstance(Object... args) {
		DrawableiconSizeConverter capInsetsCommandConverter = new DrawableiconSizeConverter(this.id);
		capInsetsCommandConverter.updateArgs(args);
		return capInsetsCommandConverter;
	}

	@Override
	public void updateArgs(Object... args) {
		if (args[0] instanceof Integer) {
			this.iconSize = (Integer)args[0];
		}
	}

}
