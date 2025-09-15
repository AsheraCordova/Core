package com.ashera.converter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ashera.core.IFragment;
import com.ashera.utils.FileUtils;

public class ColorImageConverter extends ColorConverter {
    @org.teavm.jso.JSBody(params = { "key" }, script = "return localStorage.getItem(key);")
    private static native String getLocalStorage(String key);

    @Override
    public Object convertFrom(String value,  Map<String, Object> dependentAttributesMap, IFragment fragment) {
    	if (value == null || value.equals("@null")) {
    		return "@null";
    	}
    	
    	if (value.startsWith("data:image/png;base64,")) {
        	return value;
        } else if (value.startsWith("cordova.file.")) {
        	String cordovaFileUri = com.ashera.widget.PluginInvoker.resolveCDVFileLocation(value, fragment);
        	
            if (cordovaFileUri != null) {
				return getLocalStorage(cordovaFileUri);
            }
        } else if (value.startsWith("#") || value.startsWith("@color/") || !value.startsWith("@")) {
            return super.convertFrom(value, dependentAttributesMap, fragment);
        } else if (value.startsWith("@drawable")) {
            Pattern pattern = Pattern.compile("@([a-z0-9_\\-]+)\\/([a-z0-9_\\-]+)");  
            Matcher matcher = pattern.matcher(value);  
            boolean matches = matcher.matches();   

            if (matches) {
                String fileName = matcher.group(2);
                String directoryName = matcher.group(1);
                int density = com.ashera.widget.PluginInvoker.getDensity();

                String extKey = fileName + "_ext";
                String fileExtension = (String) com.ashera.utils.ResourceBundleUtils.getString("drawable/drawable", extKey,fragment);

                if (fileExtension == null) {
                	fileExtension = "png";
                }
                
            	
                String inlineResource = fragment.getInlineResource(value);
                
                if (fileExtension != null && fileExtension.equals("xml")) {
                	//create drawable based on json read
                	String json;
                	if (inlineResource == null) {
                		json = com.ashera.utils.ResourceBundleUtils.getString("drawable/drawable", fileName, fragment);
                	} else {
                		json = com.ashera.widget.PluginInvoker.xml2json(inlineResource, fragment);
                	}
                	Map<String, Object> drawable = com.ashera.widget.PluginInvoker.unmarshal(json, Map.class);
                	return com.ashera.drawable.DrawableFactory.getDrawable("colorimage", drawable, dependentAttributesMap, fragment);
            	} else {
            		if (inlineResource != null) {
            			return convertFrom(inlineResource, dependentAttributesMap, fragment);
            		}
            		if (fileExtension.equals("9.png")) {
            			fileName = fileName + "_9";
            			fileExtension = "png";
                	}

            		String webfileName = getWebFileLocation("res-swt/" + directoryName + "-" + density + "dpi" + "/" + fileName + "." + fileExtension, fragment);
	                
	                if (webfileName == null) {
	                	webfileName = getWebFileLocation("res-swt/" + directoryName + "/" + fileName + "." + fileExtension, fragment);
	                }
	
	                return webfileName;
            	}
            }
        } 

        throw new RuntimeException("Unable to convert path to image : " + value);
    }
    
	private String getWebFileLocation(String path, IFragment fragment) {
		if (fragment.getRootDirectory() != null) {
			String cordovaFileUri = com.ashera.widget.PluginInvoker.resolveCDVFileLocation(FileUtils.getSlashAppendedDirectoryName(fragment.getRootDirectory()) + path, fragment);
			return getLocalStorage(cordovaFileUri);			
		}
		
		InputStream f = FileUtils.getInputStreamFromClassPath(path);
		return f == null ? null : path;
	}

    @Override
    public String convertTo(Object value, IFragment fragment) {
        if (value instanceof String && ((String)value).startsWith("data:image/png;base64,")) {        	
			return (String) value;
		} else {
			return super.convertTo(value, fragment);
		}
    }

    @Override
    public java.util.List<String> getDependentAttributes() {
        return null;
    }
}
