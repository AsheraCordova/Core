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

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ashera.core.IFragment;
import com.ashera.model.FontDescriptor;
import com.ashera.utils.ResourceBundleUtils;
import com.ashera.widget.PluginInvoker;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;

import androidx.core.content.res.ResourcesCompat;

public class FontConverter implements IConverter<Typeface, String> {

	@Override
	public Typeface convertFrom(String value, Map<String, Object> dependentAttributesMap, IFragment fragment) {
		if (value.startsWith("cordova.file.")) {
			String cordovaFileUri = PluginInvoker.resolveCDVFileLocation(value, fragment);
			if (cordovaFileUri != null) {
				return Typeface.createFromFile(cordovaFileUri);
			}
		}
		if (value.startsWith("@font/")) {
			if (fragment.getRootDirectory() == null) {
				String key1 = value.replaceFirst("@font/", "");
				Context context = (Context) fragment.getRootActivity();
				int identifier = context.getResources().getIdentifier(key1, "font", context.getPackageName());
				return ResourcesCompat.getFont(context, identifier);
			} else {
				Pattern pattern = Pattern.compile("@([a-z0-9\\-]+)\\/([a-z0-9\\-]+)");
				Matcher matcher = pattern.matcher(value);
				boolean matches = matcher.matches();

				if (matches) {
					String data = PluginInvoker.readCdvDataAsString(fragment.getRootDirectory(), "resources/font/font_" + matcher.group(2) + ".properties", fragment);
					Properties bundle = ResourceBundleUtils.readStringAsProperties(data);
					Set<Object> fonts = bundle.keySet();
					Map<String, Typeface> typefaces = new HashMap<>();
					for (Object font : fonts) {
						String key = font.toString();
						if (key.endsWith("_android")) {
							File file = new File(PluginInvoker.resolveCDVFileLocation(com.ashera.utils.FileUtils.getSlashAppendedDirectoryName(fragment.getRootDirectory()) + "res/font/" + bundle.get(font), fragment));
							Typeface typeface = Typeface.createFromFile(file);
							String[] styleWeightArr =  key.split("_");
							int weight = Integer.parseInt(styleWeightArr[1]);
							boolean italics = styleWeightArr[0].equals("italic");
							if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
								typeface = Typeface.create(typeface, weight, italics);
							} else {
								int style = getStyle(weight, italics);
								typeface = Typeface.create(typeface, style);
							}
							typefaces.put(font.toString(), typeface);
						}
					}
					return typefaces.get("normal_400_android");
				}
			}
		}

		switch (value) {
		case "normal":
			return Typeface.DEFAULT;
		case "sans":
			return Typeface.SERIF;
		case "serif":
			return Typeface.SANS_SERIF;
		case "mono":
			return Typeface.MONOSPACE;
		default:
			return null;
		}
	}

	private int getStyle(int weight, boolean italics) {
		int style =  Typeface.NORMAL;
		if (weight > 400) {
			if (italics) {
				style = Typeface.BOLD_ITALIC;
			} else {
				style = Typeface.BOLD;
			}
		} else {
			if (italics) {
				style = Typeface.ITALIC;
			}
		}
		return style;
	}

	

	@Override
	public String convertTo(Typeface value, IFragment fragment) {
		return "";
	}

	@Override
	public java.util.List<String> getDependentAttributes() {
		return null;
	}
}