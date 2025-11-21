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
package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DialogFragment extends Fragment {

	public static final int STYLE_NORMAL = 0;
	public static final int STYLE_NO_TITLE = 1;
	private int mTheme = 0;
    public int getTheme() {
        return mTheme ;
    }
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return null;
	}
	

	public void setArguments(Bundle args) {
		// TODO Auto-generated method stub
		
	}
	

	public android.app.Dialog getDialog() {
		// TODO Auto-generated method stub
		return null;
	}

	public void show(FragmentManager supportFragmentManager, String tag) {
		// TODO Auto-generated method stub
		
	}
	
	public void setStyle(int style, int theme) {
		
	}
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		return null;
	}

	public void dismiss() {
		// TODO Auto-generated method stub
		
	}
}
