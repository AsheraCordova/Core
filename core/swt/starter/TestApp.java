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
package com.ashera.swt.starter;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.DeviceData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.ashera.common.ColorManager;
import com.ashera.core.BaseApplication;

public class TestApp extends BaseApplication{
	private static boolean SLEAK_ENABLED = false;
	private static boolean CONTROL_PANEL_ENABLED = false;
	private static boolean TEST_PANEL_ENABLED = false;
	public static void main(String[] args) {
	    TestApp testApp = new TestApp();
		DeviceData data = new DeviceData();
		data.tracking = SLEAK_ENABLED;
		Display display = new Display(data);
		Shell shell = testApp.start(display, SWT.DIALOG_TRIM| SWT.MIN | SWT.RESIZE);
	    
		if (data.tracking) {
    		Sleak sleak = new Sleak();
    	    sleak.open();
		}


        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        ColorManager.dispose();
	    display.dispose();
	}

	@Override
	public boolean isControlPanelEnabled() {
		return CONTROL_PANEL_ENABLED;
	}
	
	@Override
	public boolean isTestPanelEnabled() {
		return TEST_PANEL_ENABLED;
	}
}
