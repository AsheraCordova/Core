package com.ashera.layout;

import com.ashera.widget.IWidget;

public class MeasurableSwitch extends r.android.widget.Switch{

	public MeasurableSwitch(IWidget widget) {
		super(widget);
	}

	@Override
	public int nativeMeasureWidth(Object uiView) {		
		return 0;
	}

	@Override
	public int nativeMeasureHeight(Object uiView, int width) {
		return 0;
	}
}
