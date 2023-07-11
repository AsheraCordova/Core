package com.ashera.layout;

import android.content.Context;
import android.util.AttributeSet;

public class PopupWindow extends android.widget.FrameLayout{
	public PopupWindow(Context context) {
		super(context);
		initView();
	}

	public PopupWindow(Context context, AttributeSet attrs) {
		super(context, attrs);
		initView();
	}

	public PopupWindow(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		initView();
	}

	public PopupWindow(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
		super(context, attrs, defStyleAttr, defStyleRes);
		initView();
	}
	
	private void initView() {
		
	}
}
