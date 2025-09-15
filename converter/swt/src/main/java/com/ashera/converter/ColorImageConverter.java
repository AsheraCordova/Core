package com.ashera.converter;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.widgets.Display;

import com.ashera.core.IFragment;
import com.ashera.utils.FileUtils;

public class ColorImageConverter extends ColorConverter {
    @Override
    public Object convertFrom(String value,  Map<String, Object> dependentAttributesMap, IFragment fragment) {
    	if (value == null || value.equals("@null")) {
    		return "@null";
    	}
    	
    	if (value.startsWith("data:image/png;base64,")) {
    		final String pureBase64Encoded = value.substring(value.indexOf(",")  + 1);
        	byte[] decode = Base64.getDecoder().decode(pureBase64Encoded);
        	Image image = new Image(Display.getCurrent(), new java.io.ByteArrayInputStream(decode));
        	return image;
        }  else if (value.startsWith("cordova.file.")) {
        	String cordovaFileUri = com.ashera.widget.PluginInvoker.resolveCDVFileLocation(value, fragment);
        	
            if (cordovaFileUri != null) {
            	try {
					Image image = new Image(Display.getCurrent(), new java.io.FileInputStream(cordovaFileUri));
					return image;
				} catch (FileNotFoundException e) {
					throw new RuntimeException(e);
				}
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
            		// try density specific file
	                InputStream f = getFileInputStream("/res-swt/" + directoryName + "-" + density + "dpi" + "/" + fileName + "." + fileExtension, fragment);
	                
	                if (f == null) {
	                	f = getFileInputStream("/res-swt/" + directoryName + "/" + fileName + "." + fileExtension, fragment);
	                }

	
	                // try
	                try (java.io.InputStream fis = f) {
	                	Image image = new Image(Display.getDefault(), fis);
	                	((Display)image.getDevice()).setData(image.hashCode() + "", fileExtension);
	                	fragment.addDisposable(image);
	                    return image;
	                } catch (IOException e) {
	                    throw new RuntimeException(e);
	                }
            	}
            }
        }

        throw new RuntimeException("Unable to convert path to image : " + value);
    }

	private InputStream getFileInputStream(String path, IFragment fragment) {
		if (fragment.getRootDirectory() != null) {
			String cordovaFileUri = com.ashera.widget.PluginInvoker.resolveCDVFileLocation(fragment.getRootDirectory() + path, fragment);
        	try {
				return new java.io.FileInputStream(cordovaFileUri);
			} catch (FileNotFoundException e) {
				return null;
			}
		}
		
		InputStream f = FileUtils.getInputStreamFromClassPath("www" + path);
		
		return f;
	}

    @Override
    public String convertTo(Object value, IFragment fragment) {
        if (value instanceof Image || value instanceof r.android.graphics.drawable.Drawable) {
        	if (value instanceof r.android.graphics.drawable.Drawable) {
        		value = ((r.android.graphics.drawable.Drawable) value).getDrawable();
        	}
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			String base64;
			try {
				ImageLoader loader = new ImageLoader();
				loader.data = new ImageData[] { ((Image)value).getImageData() };
				loader.save(out, SWT.IMAGE_PNG);
				base64 = "data:image/png;base64," + Base64.getEncoder().encodeToString(out.toByteArray());
			} finally {
				try {
					out.close();
				} catch (IOException e) {
					
				}
			}
			return base64;
		} else {
			return super.convertTo(value, fragment);
		}
    }

    @Override
    public java.util.List<String> getDependentAttributes() {
        return null;
    }

}
