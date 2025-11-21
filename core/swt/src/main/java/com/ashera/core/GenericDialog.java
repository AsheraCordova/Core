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

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Shell;

class GenericDialog extends Dialog {
	private Shell dialog;

	GenericDialog(Shell parent, Shell dialog) {
		super(parent);
		this.dialog = dialog;
	}

	public String open() {
		Rectangle bounds = getParent().getBounds();
		//dialog.setBounds(bounds.x, bounds.y, bounds.width * 0.9f, bounds.height);
//		dialog.setText("Java Source and Support");
		dialog.open();

		return "After Dialog";
	}

	public static Shell createDialogShell(Shell parent) {
		Shell dialog = com.ashera.common.ShellManager.getInstance().createDialogShell(parent, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL| SWT.MIN | SWT.RESIZE);
		dialog.setData("dialog");
		dialog.setBackgroundMode(SWT.INHERIT_FORCE);
		return dialog;
	}
}