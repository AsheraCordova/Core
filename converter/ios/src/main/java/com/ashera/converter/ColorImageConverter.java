package com.ashera.converter;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ashera.core.IFragment;

import r.android.graphics.drawable.Drawable;

public class ColorImageConverter extends ColorConverter {
	@Override
	public Object convertFrom(String value,  Map<String, Object> dependentAttributesMap, IFragment fragment) {
		if (value == null) {
			return null;
		}
    	if (value.equals("@null")) {
    		return "@null";
    	}
    	
        if (value.startsWith("@")) {
        	String inlineResource = fragment.getInlineResource(value);
        	
        	if (inlineResource != null) {
        		value = inlineResource; 
        	}
        }
    	
		if (value.startsWith("#") || value.startsWith("@color/")) {
            return super.convertFrom(value, dependentAttributesMap, fragment);
		}  else if (value.startsWith("cordova.file.")) {
        	String cordovaFileUri = com.ashera.widget.PluginInvoker.resolveCDVFileLocation(value, fragment);
        	
            if (cordovaFileUri != null) {
				return nativeLoadImageFromPath(cordovaFileUri);
            }
        }else if (value.startsWith("@drawable/")) {
            Pattern pattern = Pattern.compile("@([a-z0-9_\\-]+)\\/([a-z0-9_\\-]+)");  
            Matcher matcher = pattern.matcher(value);  
            boolean matches = matcher.matches();
            
            if (matches) {
            	String fileName = matcher.group(2);
	            String key1 = value.replaceFirst("@drawable/", "");
	            
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
	        			key1 = key1 + "_9";
            			fileExtension = "png";
                	}
	        		
	        		if (fragment.getRootDirectory() != null) {
	        			String cordovaFileUri = com.ashera.widget.PluginInvoker.resolveCDVFileLocation(com.ashera.utils.FileUtils.getSlashAppendedDirectoryName(
	        					fragment.getRootDirectory()) + "res-ios/drawable-ios/" + fileName + "." + fileExtension, fragment);
	                	
	                    if (cordovaFileUri != null) {
	        				return nativeLoadImageFromPath(cordovaFileUri);
	                    }
	        		} else {
		        		String path = key1 + "." + fileExtension;
		        		return nativeLoadImageBundle("drawable-ios/" + path);
	        		}
	        	}
            }
        } else if (value.startsWith("data:image/png;base64,")) {
        	final String pureBase64Encoded = value.substring(value.indexOf(",")  + 1);
			return getImageFromBase64(pureBase64Encoded);
		}
		
		throw new RuntimeException("Unable to convert path to image : " + value);
	}
	
    
	public static native Object nativeLoadImageFromPath(String imagePath) /*-[
		return [UIImage imageWithContentsOfFile:imagePath];
;
	]-*/;

	public static native Object getImageFromBase64(Object strEncoded) /*-[
		NSData *dataEncoded = [[NSData alloc] initWithBase64EncodedString:strEncoded  options:0]; 
		UIImage *image = [UIImage imageWithData:dataEncoded];
		return image;
	]-*/;
    
	
	private native Object nativeLoadImageBundle(String path)/*-[
		return [UIImage imageNamed:path];
	]-*/;

	@Override
	public String convertTo(Object value, IFragment fragment) {
    	if (isImage(value) || value instanceof Drawable) {
    		if (value instanceof Drawable) {
    			value = ((Drawable) value).getDrawable();
    		}
    		
    		return imageAsBase64(value);
    	} else {
    		return colorToString(value);
    	}
        
    }
	private native boolean isImage(Object objImage) /*-[
		return [objImage isKindOfClass:[UIImage class]];
	]-*/;
	
	private native String imageAsBase64(Object objImage) /*-[
		NSData *imageData = UIImagePNGRepresentation(objImage);
		NSString * base64String = [imageData base64EncodedStringWithOptions:0];
		return [NSString stringWithFormat:@"data:image/png;base64,%@", base64String];
	]-*/;

	public native String colorToString(Object color)  /*-[	    
	    CGFloat red, green, blue, alpha;
	    [((UIColor*) color) getRed:&red green:&green blue:&blue alpha:&alpha];
  		return [[NSString stringWithFormat:@"#%02x%02x%02x", (int)(red * 255), (int)(green * 255) , (int)(blue * 255)] uppercaseString];
	]-*/;

	@Override
	public java.util.List<String> getDependentAttributes() {
		return null;
	}
}
