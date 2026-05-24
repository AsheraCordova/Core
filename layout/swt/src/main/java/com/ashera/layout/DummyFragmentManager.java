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

import java.util.Map;

import com.ashera.core.IFragment;
import com.ashera.core.IFragmentManager;

public class DummyFragmentManager implements com.ashera.core.IFragmentManager{

	@Override
	public void onCreate(IFragment fragment, Object... args) {
		System.out.println("onCreate");
	}

	@Override
	public void onPause(IFragment fragment) {
		System.out.println("onPause");		
	}

	@Override
	public void onResume(IFragment fragment) {
		System.out.println("onResume");		
	}

	@Override
	public void onAttach(IFragment fragment) {
		System.out.println("onAttach");		
	}

	@Override
	public void onDetach(IFragment fragment) {
		System.out.println("onDetach");
	}

	@Override
	public void onDestroy(IFragment fragment) {
		System.out.println("onDestroy");
	}

	@Override
	public IFragmentManager newInstance() {
		return new DummyFragmentManager();
	}

	@Override
	public void onRequestPermissionsResult(IFragment fragment, int requestCode, String[] permissions,
			int[] grantResults) {
		System.out.println("onRequestPermissionsResult");
	}

	@Override
	public void sendEvent(String action, Map<String, String> extraData) {
		System.out.println("sendEvent");		
	}


	@Override
	public void onSaveInstanceState(IFragment fragment, Object... args) {
		System.out.println("onSaveInstanceState");		
	}

	@Override
	public void onStart(IFragment fragment) {
		System.out.println("onStart");		
	}

	@Override
	public void onStop(IFragment fragment) {
		System.out.println("onStop");		
	}

}
