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

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ashera.attributedtext.AttributedString;
import com.ashera.model.FontMetricsDescriptor;
import com.ashera.plugin.IPlugin;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;

public class CorePlugin implements IPlugin, ICore {
    private static final String PLUGIN_NAME_CORE = "core";
    @Override
    public String getName() {
        return PLUGIN_NAME_CORE;
    }

    
    @Override
    public Object invoke(String name, Object... args) {
        //start - core
		switch (name) {
		case "getAssetMode":
			return getAssetMode((IFragment) args[0]);
		case "getDevServerIp":
			return getDevServerIp((IFragment) args[0]);
		case "getOrientation":
			return getOrientation();
		case "getScreenWidth":
			return getScreenWidth();
		case "getScreenHeight":
			return getScreenHeight();
		case "getScreenWidthDp":
			return getScreenWidthDp();
		case "getScreenHeightDp":
			return getScreenHeightDp();
		case "getOS":
			return getOS();
		case "getFileAsset":
			return getFileAsset((String) args[0],(IFragment) args[1]);
		case "getDensityName":
			return getDensityName();
		case "getDensity":
			return getDensity();
		case "postDelayed":
			return postDelayed((Runnable) args[0],(int) args[1]);
		case "removeCallbacks":
			removeCallbacks((Object) args[0],(Runnable) args[1]);
			return null;
		case "putObjectToBundle":
			putObjectToBundle((Object) args[0],(String) args[1],(Object) args[2]);
			return null;
		case "releaseNativeResources":
			releaseNativeResources((List<Object>) args[0]);
			return null;
		case "getFontMetrics":
			return getFontMetrics((Object) args[0]);
		case "createDrawable":
			return createDrawable((String) args[0]);
		case "createAttributedString":
			return createAttributedString((IFragment) args[0],(String) args[1]);
		case "getDisplayMetricDensity":
			return getDisplayMetricDensity();
		case "getAttributedBulletHtml":
			return getAttributedBulletHtml();
		case "getExternalFilesDir":
			return getExternalFilesDir((Object) args[0]);
		case "getMaxMemory":
			return getMaxMemory((Object) args[0]);
		case "decodeBitmapStream":
			return decodeBitmapStream((InputStream) args[0],(Object) args[1]);
		case "runOnMainThread":
			runOnMainThread((Runnable) args[0]);
			return null;
		case "enqueueTaskForEventLoop":
			enqueueTaskForEventLoop((Runnable) args[0],(long) args[1]);
			return null;
		case "resolveCDVFileLocation":
			return resolveCDVFileLocation((String) args[0],(IFragment) args[1]);
		case "readCdvDataAsString":
			return readCdvDataAsString((String) args[0],(String) args[1],(IFragment) args[2]);
		default:
			break;
		}
		throw new RuntimeException("Unknown method " + name);
		//end - core
    }
    

    @Override
    public String getAssetMode(IFragment fragment) {
    	IActivity activity = fragment.getRootActivity();
        return activity == null ? "prod" : activity.getAssetMode();
    }

    @Override
    public String getDevServerIp(IFragment fragment) {
    	IActivity activity = fragment.getRootActivity();
        return activity == null ? "localhost" : activity.getDevServerIp();
    }

	@Override
	public String getOrientation() {
		Resources resources = Resources.getSystem();
		return resources.getConfiguration().orientation 
				== Configuration.ORIENTATION_LANDSCAPE ? "landscape": "portrait";
	}

	@Override
	@SuppressLint("NewApi")
	public int getScreenWidth() {
		Resources resources = Resources.getSystem();
		return resources.getDisplayMetrics().widthPixels;
	}

	@Override
	@SuppressLint("NewApi")
	public int getScreenHeight() {
		Resources resources = Resources.getSystem();
		return resources.getDisplayMetrics().heightPixels;
	}
	
	@Override
	public String getOS() {
		return "Android";
	}


	@Override
	public String getFileAsset(String path, IFragment fragment) {
		if (fragment.getRootDirectory() != null) {
			return readCdvDataAsString(fragment.getRootDirectory(), path, fragment);
		} else {
			Context context = (Context) fragment.getRootActivity();
			return loadAssetTextAsString(context, path, fragment);
		}
	}
	

	private String loadAssetTextAsString(Context context, final String fileResource, final IFragment fragment) {
	    if (fragment.hasDevData(fileResource)) {	        
	        return fragment.getDevData(fileResource).toString();
	    } else {
    		InputStream is = null;
    		byte[] b = null;
            try {
            	is = context.getAssets().open(fileResource);
    			b = new byte[is.available()];
    			is.read(b);
    		} catch (IOException e) {
    			throw new RuntimeException(e);
    		} finally {
    			try {
    				if (is != null) {
    					is.close();
    				}
    			} catch (IOException e) {
    			}
    		}
            
            return new String(b);
	    }
		
	}

    @Override
    public String getDensityName() {
    	Resources resources = Resources.getSystem();
        float density = resources.getDisplayMetrics().density;
        if (density >= 4.0) {
            return "xxxhdpi";
        }
        if (density >= 3.0) {
            return "xxhdpi";
        }
        if (density >= 2.0) {
            return "xhdpi";
        }
        if (density >= 1.5) {
            return "hdpi";
        }
        if (density >= 1.0) {
            return "mdpi";
        }
        return "ldpi";    
    }

	@Override
	public int getDensity() {
		int density = 0;
		switch (getDensityName()) {
		case "ldpi":			
			density = 120;
			break;
		case "mdpi":			
			density = 160;
			break;
		case "hdpi":			
			density = 240;
			break;
		case "xhdpi":			
			density = 320;
			break;
		case "xxhdpi":			
			density = 480;
			break;
		case "xxxhdpi":			
			density = 640;
			break;
		default:
			break;
		}
		return density;
	}


	@Override
	public Object postDelayed(Runnable mTickRunnable, int delay) {
		Handler handler = new Handler();
		handler.postDelayed(mTickRunnable, delay);
		return handler;
	}


	@Override
	public void removeCallbacks(Object handler, Runnable mTickRunnable) {
		((Handler) handler).removeCallbacks(mTickRunnable);
	}


	@Override
	public void putObjectToBundle(Object bundle, String key, Object value) {
		((android.os.Bundle) bundle).putSerializable(key, (Serializable) value);
	}


	@Override
	public void releaseNativeResources(List<Object> object) {
		
	}


	@Override
	public FontMetricsDescriptor getFontMetrics(Object mTextPaint) {
		android.graphics.Paint.FontMetricsInt fontMetricsInt = ((android.graphics.Paint) mTextPaint).getFontMetricsInt();
		FontMetricsDescriptor fontMetricsDescriptor = new FontMetricsDescriptor();
		fontMetricsDescriptor.ascent = fontMetricsInt.ascent;
		fontMetricsDescriptor.descent = fontMetricsInt.descent;
		fontMetricsDescriptor.bottom = fontMetricsInt.bottom;
		fontMetricsDescriptor.leading = fontMetricsInt.leading;
		fontMetricsDescriptor.top = fontMetricsInt.top;
		
		return fontMetricsDescriptor;
	}


	@Override
	public Object createDrawable(String type) {
		return new android.graphics.drawable.ShapeDrawable();
	}


	@Override
	public AttributedString createAttributedString(IFragment fragment, String text) {
		Context context = (Context) fragment.getRootActivity();
		return new com.ashera.core.attributedtext.AttributedStringImpl(text, context);
	}


	@Override
	public float getDisplayMetricDensity() {
		Resources resources = Resources.getSystem();
		return resources.getDisplayMetrics().density;
	}


	@Override
	public String getAttributedBulletHtml() {
		return null;
	}


	@Override
	public int getScreenWidthDp() {
		return Resources.getSystem().getConfiguration().screenWidthDp;
	}


	@Override
	public int getScreenHeightDp() {
		return Resources.getSystem().getConfiguration().screenHeightDp;
	}


	@Override
	public File getExternalFilesDir(Object objContext) {
		Context context = (Context) objContext;
		return context.getExternalFilesDir(null);
	}


	@Override
	public int getMaxMemory(Object objContext) {
		Context context = (Context) objContext;
		final int memClass = ((ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE)).getMemoryClass();
		return memClass;
	}


	@Override
	public Object decodeBitmapStream(InputStream stream, Object options) {
		return BitmapFactory.decodeStream(stream, null, (BitmapFactory.Options) options);
	}


	@Override
	public void runOnMainThread(Runnable runnable) {
		Handler mainHandler = new Handler(Looper.getMainLooper());
		mainHandler.post(runnable);
	}


	@Override
	public void enqueueTaskForEventLoop(Runnable runnable, long delay) {
		Handler mainHandler = new Handler(Looper.getMainLooper());
		mainHandler.postDelayed(runnable, delay);
	}


	@Override
	public String resolveCDVFileLocation(String cdvUrl, IFragment fragment) {
		Context context = (Context) fragment.getRootActivity();
		return resolveCDVFileLocation(cdvUrl, context);
	
	}


	private static String resolveCDVFileLocation(String cdvUrl, Context context) {
		Pattern pattern = Pattern.compile("cordova\\.file\\.([a-zA-Z_\\-]+)\\/(.*)");
		Matcher matcher = pattern.matcher(cdvUrl);
		boolean matches = matcher.matches();

		if (matches) {
			String fileName = matcher.group(2);
			String directoryName = matcher.group(1);
			
			switch (directoryName) {
			case "persistent":
				directoryName = toDirUrl(context.getFilesDir()) + "files/";
				break;
			case "temporary":
				directoryName = toDirUrl(context.getCacheDir()) + "files/";
				break;
			case "cacheDirectory":
				directoryName = toDirUrl(context.getCacheDir());
				break;				
			case "dataDirectory":
				directoryName = toDirUrl(context.getFilesDir());
				break;
			case "applicationDirectory":
				directoryName = "file:///android_asset/";
				break;
			case "applicationStorageDirectory":
				directoryName = toDirUrl(context.getFilesDir().getParentFile());
				break;
			case "externalApplicationStorageDirectory":
				directoryName = toDirUrl(context.getExternalFilesDir(null).getParentFile());
				break;				
			case "externalDataDirectory":
				directoryName = toDirUrl(context.getExternalFilesDir(null));
				break;	
			case "externalCacheDirectory":
				directoryName = toDirUrl(context.getExternalCacheDir());
				break;
			case "externalRootDirectory":
				directoryName = toDirUrl(android.os.Environment.getExternalStorageDirectory());
				break;	
			default:
				break;
			}
			Uri uri = Uri.parse(com.ashera.utils.FileUtils.getSlashAppendedDirectoryName(directoryName) + fileName);
			return uri.getPath();
		}
		
		return null;
	}
	
	private static String toDirUrl(File f) {
		return Uri.fromFile(f).toString() + '/';
	}


	@Override
	public String readCdvDataAsString(String directoryName, String fileName, IFragment fragment) {
		String rootDirectory = directoryName;
		
		if (directoryName == null) {
			rootDirectory = fragment.getRootDirectory();
		}
		Context context = (Context) fragment.getRootActivity();
		String cdvUrl = com.ashera.utils.FileUtils.getSlashAppendedDirectoryName(rootDirectory) + fileName;
		return readCdvDataAsString(cdvUrl, context);
	}


	public static String readCdvDataAsString(String cdvUrl, Context context) {
		String location = resolveCDVFileLocation(cdvUrl, context);
		File file = new File(location);
		if (file.exists()) {
			try {
				return com.ashera.utils.FileUtils.readFileToString(file);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return null;
	}
}
