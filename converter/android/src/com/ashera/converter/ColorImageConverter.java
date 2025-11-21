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

import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ashera.core.IFragment;
import com.ashera.utils.ColorUtil;
import com.ashera.utils.ResourceBundleUtils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.util.DisplayMetrics;

public class ColorImageConverter implements IConverter<Object, String> {
    private static final java.util.List<String> dependentAttributes = java.util.Arrays.asList(new String[]{"capInsetsTop",
            "capInsetsBottom", "capInsetsLeft", "capInsetsRight"});

    @Override
    public Object convertFrom(String value, Map<String, Object> dependentAttributesMap, IFragment fragment) {
        if (value == null || value.equals("@null")) {
            return "@null";
        }

        if (value.startsWith("#") || value.startsWith("@color/")) {
            String color = ResourceBundleUtils.getString("color/color", "color", value, fragment);
            return ColorUtil.colorToHex(color);
        } else if (value.startsWith("cordova.file.")) {
            String cordovaFileUri = com.ashera.widget.PluginInvoker.resolveCDVFileLocation(value, fragment);

            if (cordovaFileUri != null) {
                Bitmap bitmap = android.graphics.BitmapFactory.decodeFile(cordovaFileUri);
                return bitmap;
            }
        } else if (value.startsWith("@drawable/")) {
            Pattern pattern = Pattern.compile("@([a-z0-9_\\-]+)\\/([a-z0-9_\\-]+)");
            Matcher matcher = pattern.matcher(value);
            boolean matches = matcher.matches();

            if (matches) {
                String fileName = matcher.group(2);
                String directoryName = matcher.group(1);
                
                String inlineResource = fragment.getInlineResource(value);
                if (fragment.getRootDirectory() == null && inlineResource == null) {
                    Context context = (Context) fragment.getRootActivity();
                    int id = context.getResources().getIdentifier(fileName, directoryName, context.getPackageName());
                    return id;
                } else {
                    return getDrawableFromCdvFileUrl(fileName, inlineResource, dependentAttributesMap, fragment);
                }
            }
        } else if (value.startsWith("data:image/png;base64,")) {
            final String pureBase64Encoded = value.substring(value.indexOf(",") + 1);
            final byte[] decodedBytes = Base64.decode(pureBase64Encoded, Base64.DEFAULT);
            Bitmap bitmap = android.graphics.BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.length);
            return bitmap;

        }

        throw new RuntimeException("Unable to convert path to image : " + value);

    }

    private Object getDrawableFromCdvFileUrl(String fileName, String inlineResource, Map<String, Object> dependentAttributesMap, IFragment fragment) {
        String extKey = fileName + "_ext";
        String fileExtension = com.ashera.utils.ResourceBundleUtils.getString("drawable/drawable", extKey, fragment);

        if (fileExtension == null) {
            fileExtension = "png";
        }
        Context context = (Context) fragment.getRootActivity();
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        float densityDpi = metrics.densityDpi;
        String dpiFolder = getDpiFolder(fileExtension, densityDpi);

        if (fileExtension.equals("9.png")) {
            fileName = fileName + "_9";
            fileExtension = "png";
        }

        String cordovaFileUri = com.ashera.widget.PluginInvoker.resolveCDVFileLocation(fragment.getRootDirectory() + "/res/" + dpiFolder + "/" + fileName + "." + fileExtension, fragment);
        if (cordovaFileUri != null) {
            if (fileExtension.equals("xml")) {
            	String json;
            	
            	if (inlineResource == null) {
            		json = com.ashera.utils.ResourceBundleUtils.getString("drawable/drawable", fileName, fragment);
            	} else {
            		json = com.ashera.widget.PluginInvoker.xml2json(inlineResource, fragment);
            	}
                Map<String, Object> drawable = com.ashera.widget.PluginInvoker.unmarshal(json, Map.class);
                return DrawableFactory.getDrawable("drawable", drawable, dependentAttributesMap, fragment);
            } else {
            	if (inlineResource != null) {
            		return convertFrom(inlineResource, dependentAttributesMap, fragment);
            	}
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inDensity = DisplayMetrics.DENSITY_DEFAULT;
                options.inTargetDensity = metrics.densityDpi;
                options.inScaled = true;
                if (!dpiFolder.equals("drawable")) {
                    options = null;
                }

                Bitmap bitmap = android.graphics.BitmapFactory.decodeFile(cordovaFileUri, options);
                return bitmap;
            }
        }
        throw new RuntimeException("Unable to convert path to image : " + fileName);
    }

    private static String getDpiFolder(String fileExtension, float densityDpi) {
        String dpiFolder;
        if (fileExtension.equals("9.png") || fileExtension.equals("xml")) {
            dpiFolder = "drawable";
        } else if (densityDpi <= DisplayMetrics.DENSITY_MEDIUM) {
            dpiFolder = "drawable-mdpi";
        } else if (densityDpi <= DisplayMetrics.DENSITY_HIGH) {
            dpiFolder = "drawable-hdpi";
        } else if (densityDpi <= DisplayMetrics.DENSITY_XHIGH) {
            dpiFolder = "drawable-xhdpi";
        } else if (densityDpi <= DisplayMetrics.DENSITY_XXHIGH) {
            dpiFolder = "drawable-xxhdpi";
        } else {
            dpiFolder = "drawable-xxxhdpi";
        }
        return dpiFolder;
    }

    @Override
    public String convertTo(Object value, IFragment fragment) {
        if (value instanceof String) {
            return (String) value;
        }

        if (value instanceof android.graphics.drawable.Drawable) {
            if (value instanceof android.graphics.drawable.StateListDrawable) {
                value = ((android.graphics.drawable.StateListDrawable) value).getCurrent();
            }
            if (value instanceof android.graphics.drawable.ColorDrawable) {
                return ColorUtil.getColorString(((android.graphics.drawable.ColorDrawable) value).getColor());
            }
            return drawableToBitmap((android.graphics.drawable.Drawable) value);
        }
        return null;
    }

    public String drawableToBitmap(Drawable drawable) {
        Bitmap bitmap = null;

        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return convertToBase64(bitmapDrawable.getBitmap());
            }
        }

        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888); // Single color bitmap will be created of 1x1 pixel
        } else {
            bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        }

        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return convertToBase64(bitmap);
    }

    public String convertToBase64(Bitmap bitmap) {
        String base64;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
            base64 = "data:image/png;base64," + Base64.encodeToString(outputStream.toByteArray(), Base64.DEFAULT);
        } finally {
            try {
                outputStream.close();
            } catch (Exception e) {
            }
        }
        return base64;
    }

    @Override
    public java.util.List<String> getDependentAttributes() {
        return dependentAttributes;
    }
}
