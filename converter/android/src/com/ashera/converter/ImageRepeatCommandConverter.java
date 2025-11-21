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


import com.ashera.core.IFragment;
import com.ashera.widget.AttributeCommand;
import com.ashera.widget.BaseAttributeCommand;
import com.ashera.widget.IWidget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;

public class ImageRepeatCommandConverter extends BaseAttributeCommand {
	private String backgroundRepeat;
	public ImageRepeatCommandConverter(String id) {
		super(id);
	}

	@Override
	public Object modifyValue(IWidget widget, Object nativeView, String phase, String attributeName, Object value) {
		IFragment fragment = widget.getFragment();
    	Context context = (Context) fragment.getRootActivity();

		if (value instanceof Integer && backgroundRepeat != null && backgroundRepeat.equals("repeat")) {
            int id = (int) value;
			Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), id);
			BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
			bitmapDrawable.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
			return bitmapDrawable;
		}
		
		if (value instanceof BitmapDrawable && backgroundRepeat != null && backgroundRepeat.equals("repeat")) {
			BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), ((BitmapDrawable) value).getBitmap());
			bitmapDrawable.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
			return bitmapDrawable;
		}
		return value;
	}

	@Override
	public AttributeCommand newInstance(Object... args) {
		ImageRepeatCommandConverter backgroundRepeatCommandConverter = new ImageRepeatCommandConverter(this.id);
		backgroundRepeatCommandConverter.setPriority(10);
		backgroundRepeatCommandConverter.updateArgs(args);
		return backgroundRepeatCommandConverter;
	}

	@Override
	public void updateArgs(Object... args) {
		this.backgroundRepeat = (String) args[0];
	}

	@Override
	public int getPriority() {
		return 10;
	}

	@Override
	public boolean executeAfterPostMeasure() {
		return false;
	}

}
