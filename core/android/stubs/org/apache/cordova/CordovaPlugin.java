package org.apache.cordova;

import org.json.JSONArray;
import org.json.JSONException;

public class CordovaPlugin {
	public CordovaInterface cordova;
	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		
	}
	
	public boolean execute(String action, final JSONArray data,
            final CallbackContext callbackContext) throws JSONException {
		return false;
	}
	
}
