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
package com.ashera.jsonadapter;

import java.util.List;
import java.util.Map;

public interface JSONAdapter {
	public Map<String, Object> getMap(Object payLoad);
	public Object getNativeMap(Map<String, Object> payLoad);
	public void putJSONSafeObjectIntoMap(Map<String, Object> map, String key, Object value);
	public Object[] getArray(Object payLoad);
	public List<Object> getList(Object payLoad);
	public boolean isBoolean(Object obj);
	public Boolean getBoolean(Object payLoad);
	public String getString(Object object);
	public Integer getInt(Object object);
	public Float getFloat(Object object);
	public Double getDouble(Object object);
	public String marshal(Object object);
	public Object toJsonTree(Object object);
	public <T> T unmarshal(String json, Class<T> clazz);
	public Map<String, Object> getJSONCompatMap();
	Object getJSONSafeObj(Object obj);
	boolean isNull(Object obj);
}
