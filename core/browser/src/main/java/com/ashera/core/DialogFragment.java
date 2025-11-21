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
package com.ashera.core;

import com.ashera.widget.IRoot;

import r.android.view.View;

public class DialogFragment extends GenericFragment{
	private int layoutWidth;
	private int layoutHeight;
	private Object dialog;
	
	private int maxWidth = -1;
	private int maxHeight = -1;
	private boolean forceLayout;
	private float marginPercent = 0.75f;
	public void setMaxHeight(int maxHeight) {
		forceLayout = true;
		this.maxHeight = maxHeight;
	}

	public void setMaxWidth(int maxWidth) {
		forceLayout = true;
		this.maxWidth = maxWidth;
	}
	
	public DialogFragment(Object dialog, int layoutWidth, int layoutHeight, Float marginPercent) {
		super();
		this.dialog = dialog;
		this.layoutWidth = layoutWidth;
		this.layoutHeight = layoutHeight;
		if (marginPercent != null) {
			this.marginPercent = marginPercent; 
		}
	}
	
	public boolean isFullScreen() {
		return marginPercent >= 1;
	}
	
	@Override
	public java.lang.Object getParentForRootWidget() {
		if (dialog != null) {
			return dialog;
		}
		return super.getParentForRootWidget();
	}

	public void remeasure() {
		IRoot root = (IRoot) super.getRootWidget();
		if(root == null) {
			return;
		}
		if (maxWidth == -1) {
			maxWidth = (int) (marginPercent * com.ashera.widget.PluginInvoker.getScreenWidth());
		}
		if (maxHeight == -1) {
			maxHeight = (int) (marginPercent * com.ashera.widget.PluginInvoker.getScreenHeight());
		}
		
		int width = layoutWidth;
		if (layoutWidth == r.android.view.ViewGroup.LayoutParams.MATCH_PARENT) {
			width = maxWidth;
		} else if (layoutWidth == r.android.view.ViewGroup.LayoutParams.WRAP_CONTENT) {
			((com.ashera.widget.IMaxDimension) ((com.ashera.widget.IWidget) root).asWidget()).setMaxWidth(maxWidth);	
		}
		
		int height = layoutHeight;
		if (layoutHeight == r.android.view.ViewGroup.LayoutParams.MATCH_PARENT) {
			height = maxHeight;
		} else if (layoutHeight == r.android.view.ViewGroup.LayoutParams.WRAP_CONTENT) {
			((com.ashera.widget.IMaxDimension) ((com.ashera.widget.IWidget) root).asWidget()).setMaxHeight(maxHeight);
		}
		
		if (forceLayout) {
			View view = (View) getRootWidget().asWidget();
			view.forceLayout();
			forceLayout = false;
		}
		
		super.setFrame(0, 0, width, height);
		super.remeasure();
	}
	
	public java.util.Map<String, String> onCloseDialogEventData() {
		java.util.Map<String, String> eventData = new java.util.HashMap<>();
		eventData.put("dialogClosed", getActionUrl());
		return eventData;
	}
}
