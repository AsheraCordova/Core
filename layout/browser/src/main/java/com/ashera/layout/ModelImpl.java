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


//start - imports
import java.util.*;

import r.android.content.*;
import r.android.graphics.*;
import r.android.os.Build;
import r.android.view.*;

import com.ashera.core.IFragment;
import com.ashera.converter.*;
import r.android.annotation.SuppressLint;

import com.ashera.widget.bus.*;
import com.ashera.widget.*;


import static com.ashera.widget.IWidget.*;
import org.teavm.jso.dom.html.HTMLElement;
//end - imports
@SuppressLint("NewApi")
public class ModelImpl extends BaseWidget {
	//start - body
	private View viewStub;
	private HTMLElement htmlElement;
	public final static String LOCAL_NAME = "com.ashera.layout.Model"; 
	public final static String GROUP_NAME = "Model";
	
	
	@Override
	public void loadAttributes(String attributeName) {

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("param").withType("string"));

	}
	
	public ModelImpl() {
		super(LOCAL_NAME, LOCAL_NAME);
	}	

	@Override
	public IWidget newInstance() {
		return new ModelImpl();
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
		
        viewStub = new ViewExt();
        createView();
        ViewImpl.nativeMakeFrame(htmlElement, 0, 0, 0, 0);
		nativeCreate(fragment, params);	
	}
	
	public class ViewExt extends View implements com.ashera.model.IViewStub{
		@Override
		public void remeasure() {
			if (getFragment() != null) {
				getFragment().remeasure();
			}
		}
        private Map<String, IWidget> templates;
    	@Override
    	public r.android.view.View inflateView(java.lang.String layout) {
    		if (templates == null) {
    			templates = new java.util.HashMap<String, IWidget>();
    		}
    		IWidget template = templates.get(layout);
    		if (template == null) {
    			template = (IWidget) quickConvert(layout, "template");
    			templates.put(layout, template);
    		}
    		IWidget widget = template.loadLazyWidgets(ModelImpl.this.getParent());
    		return (View) widget.asWidget();
    	}
	}

    
    private void createView() {
    	htmlElement = org.teavm.jso.dom.html.HTMLDocument.current().createElement("div");
    	htmlElement.getStyle().setProperty("overflow", "hidden");
    	htmlElement.getStyle().setProperty("box-sizing", "border-box");
    }

	@Override
	@SuppressLint("NewApi")
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {		
		Object nativeWidget = asNativeWidget();

		switch (key.getAttributeName()) {
			case "param": {
				


		this.setModelParam((String)objValue);



			}
			break;
		default:
			break;
		}
	}
	@Override
	public Object asWidget() {
		return viewStub;
	}
	
	@Override
	@SuppressLint("NewApi")
	public Object getAttribute(WidgetAttribute key, ILifeCycleDecorator decorator) {
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "param": {
return this.getModelParam();				}
		}
		
		return null;
	}
	
	

	@Override
	protected boolean applyModelAttributes() {
		return false;
	}
	


    @Override
    public Object asNativeWidget() {
        return htmlElement;
        
    }
    private void nativeCreate(IFragment fragment, Map<String, Object> params) {
    }
    
    @Override
	public Class getViewClass() {
		return View.class;
	}
	//end - body
}
