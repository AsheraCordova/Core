package com.ashera.converter;

import java.util.Map;

import com.ashera.core.IFragment;

import r.android.graphics.drawable.Drawable;
import r.android.graphics.drawable.StateListDrawable;

public class DrawableConverter extends ColorImageConverter {
    @Override
    public Object convertFrom(String value,  Map<String, Object> dependentAttributesMap, IFragment fragment) {
       if (value == null || value.equals("@null") || value.startsWith("@drawable") || value.startsWith("#") || value.startsWith("@color/") || value.startsWith("data:image/png;base64,")
    		   || value.startsWith("cordova.file.")) {
    	   Object objValue = super.convertFrom(value, dependentAttributesMap, fragment);
    	   
    	   if ("@null".equals(value)) {
    		   Drawable drawable = new Drawable();
    		   objValue = drawable;
    	   } else if (objValue instanceof String && ((String) objValue).startsWith("#")) {
    		   Drawable drawable = new r.android.graphics.drawable.ColorDrawable();
    		   drawable.setDrawable(objValue);
    		   objValue = drawable;
    	   } else if (objValue instanceof String  && ((String) objValue).startsWith("blob:")) {
    		   // handle blob
    		   org.teavm.jso.dom.html.HTMLImageElement image = (org.teavm.jso.dom.html.HTMLImageElement) org.teavm.jso.dom.html.HTMLDocument.current().getElementById((String) objValue);
    		   Drawable drawable = new Drawable();

    		   if (image != null) {
	    		   drawable.setMinimumWidth(image.getWidth());
	    		   drawable.setMinimumHeight(image.getHeight());
    		   } else if (value.startsWith("@drawable")) {
    			   updateWidthAndHeight(drawable, value.replaceAll("@", "res/"), fragment);
    		   }
    		   drawable.setDrawable(objValue);
    		   objValue = drawable;
    	   } else if (objValue instanceof String) {
    		   // image here
    		   Drawable drawable = new Drawable();
    		   updateWidthAndHeight(drawable, objValue, fragment);
    		   drawable.setDrawable(objValue);
    		   objValue = drawable;
    	   }  else if (objValue instanceof StateListDrawable) {
       			StateListDrawable stateListDrawable = (StateListDrawable)objValue;
       			Object image = stateListDrawable.getDrawable();
    			if (image != null) {
    				updateWidthAndHeight(stateListDrawable, image, fragment);
    				stateListDrawable.setDrawable(image);
    			}
    		}
    	   return objValue;
       }

        throw new RuntimeException("Unable to convert path to image : " + value);
    }

	private static void updateWidthAndHeight(Drawable drawable, Object value, IFragment fragment) {
		if (value instanceof String && ((String) value).startsWith("res")) {
			String strValue = (String)value;
			String fileName = strValue.substring(strValue.lastIndexOf("/") + 1);
			int index = fileName.lastIndexOf(".");
			if (index != -1) {
				fileName = fileName.substring(0, index);
			}
			String widthStr = com.ashera.utils.ResourceBundleUtils.getString("drawable/drawable", fileName + ".width", fragment);
			if (widthStr != null) {
				drawable.setMinimumWidth(Integer.parseInt(widthStr));
			}
			String heightStr = com.ashera.utils.ResourceBundleUtils.getString("drawable/drawable", fileName + ".height", fragment);
			if (heightStr != null) {
				drawable.setMinimumHeight(Integer.parseInt(heightStr));
			}
		}
	}

    @Override
    public String convertTo(Object value, IFragment fragment) {
    	if (value instanceof Drawable) {
    		return super.convertTo(((Drawable) value).getDrawable(), fragment);
    	}
        return super.convertTo(value, fragment);
    }

    @Override
    public java.util.List<String> getDependentAttributes() {
        return super.getDependentAttributes();
    }
}
