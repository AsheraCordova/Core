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

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;

public class Link extends android.widget.TextView {
	public Link(Context context) {
		super(context);
		initView();
	}

	public Link(Context context, AttributeSet attrs) {
		super(context, attrs);
		initView();
	}

	public Link(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		initView();
	}

	public Link(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
		super(context, attrs, defStyleAttr, defStyleRes);
		initView();
	}
	
	private void initView() {
		setPaintFlags(getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);
	}
}
