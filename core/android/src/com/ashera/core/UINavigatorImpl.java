package com.ashera.core;

import java.util.Deque;
import java.util.List;
import java.util.Map;

import com.ashera.converter.CommonConverters;
import com.ashera.converter.ConverterFactory;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.fragment.NavHostFragment;

import org.apache.cordova.CordovaActivity;

public class UINavigatorImpl {
	private NavHostFragment navHostFragment;
	private String rootDirectory;
	private String namespace;
	private boolean childNavHost;
	public UINavigatorImpl(NavHostFragment navHostFragment, String rootDirectory, String namespace, boolean childNavHost) {
		this.navHostFragment = navHostFragment;
		this.rootDirectory = rootDirectory;
		this.namespace = namespace;
		this.childNavHost = childNavHost;
	}
	public UINavigatorImpl(NavHostFragment navHostFragment) {
		this.navHostFragment = navHostFragment;
		this.rootDirectory = null;
		this.namespace = null;
	}
	public UINavigatorImpl() {
	}
	public void navigate(String actionId, String destinationId, boolean inclusive, boolean finish, List<Map<String, Object>> scopedObjects, IFragment fragment) {
		IActivity activity = fragment.getRootActivity();

		String[] destinationProps = actionId.split("#", -1);
		
		String type = destinationProps[0];
		String resId = destinationProps[1];
		String fileName = getFileName(destinationProps, type.equals("dialog") ? 3 : 0);
		
		if (fileName != null && !fileName.equals("")) {
			Bundle bundle = GenericFragment.getInitialBundle(resId, fileName, scopedObjects);
			
			if (type.equals("dialog")) {
				int width = (int) ConverterFactory.get(CommonConverters.dimension).convertFrom(destinationProps[destinationProps.length - 3], null, fragment);
				int height = (int) ConverterFactory.get(CommonConverters.dimension).convertFrom(destinationProps[destinationProps.length - 2], null, fragment);
				String style = destinationProps[destinationProps.length - 1];
				if (style != null) {
					style = style.replace("@style/", "");
				}
				String attrStr = com.ashera.utils.ResourceBundleUtils.getString("values/theme", style.replace("@style/", ""), fragment);
				Integer backdropColor = null;
				String windowCloseOnTouchOutside = null;
				if (attrStr != null && !attrStr.isEmpty()) {
			        String[] attrs = attrStr.split(";");
			        for (String attr : attrs) {
			        	String[] nameAndValue = attr.split("\\:");
			        	String key = nameAndValue[0];
			        	String value = nameAndValue.length <= 1 ? "" : nameAndValue[1];
			        	
			        	if (key.equals("backdropColor")) {
			        		backdropColor = (int) ConverterFactory.get("color").convertFrom(value, null, fragment);
			        	}
			        	if (key.equals("windowCloseOnTouchOutside")) {
			        		windowCloseOnTouchOutside = value;
			        	}
			        }
				}

				MyDialog.updatedBundle(bundle, width, height, backdropColor, windowCloseOnTouchOutside, style);

				if (childNavHost) {
					MyDialog myDialog = new MyDialog();
					bundle.putString("rootDirectory", rootDirectory);
					myDialog.setArguments(bundle);
					bundle.putInt("navHostFragmentId", navHostFragment.getId());
					bundle.putString("namespace", namespace);
					myDialog.show(((CordovaActivity) fragment.getRootActivity()).getSupportFragmentManager(), resId);
					return;
				}
			}
	
			FragmentActivity fragmentActivity = (FragmentActivity) activity;
			int navigationId = getNavigationId(resId, fragment, fragmentActivity);
			NavController navController = NavHostFragment.findNavController(getNavhostFragment(fragment));			
			NavOptions.Builder navOptions = new NavOptions.Builder();
			
			if (finish) {
				@SuppressLint("RestrictedApi")  Deque<NavBackStackEntry> backStack = navController.getBackStack();
				if (!backStack.isEmpty()) {
					int destinationResId = backStack.getFirst().getDestination().getId();
					navOptions.setPopUpTo(destinationResId, true);
				}
			} else if (destinationId != null) {
				int destinationResId = getNavigationId(destinationId, fragment, fragmentActivity);
				navOptions.setPopUpTo(destinationResId, inclusive);
			} else if (inclusive) {
				int destinationResId = navController.getCurrentDestination().getId();
				navOptions.setPopUpTo(destinationResId, inclusive);
			}
			
			navController.navigate(navigationId, bundle, navOptions.build());
		}
	}
	private int getNavigationId(String resId, IFragment fragment, FragmentActivity fragmentActivity) {		
		int navigationId = 0;
		if (rootDirectory == null) {
			navigationId = fragmentActivity.getResources().getIdentifier(resId, "id",fragmentActivity.getPackageName());
		} else {
			navigationId = (Integer) fragment.getRootWidget().quickConvert("@+id/" + resId, "id");
		}
		return navigationId;
	}
	private Fragment getNavhostFragment(IFragment fragment) {
		return this.navHostFragment != null ? this.navHostFragment : (Fragment) fragment;
	}

	public void closeDialog(IFragment fragment) {
		NavHostFragment.findNavController(getNavhostFragment(fragment)).navigateUp();
	}

	public void popBackStack(IFragment fragment) {
		NavHostFragment.findNavController(getNavhostFragment(fragment)).popBackStack();
	}

	public void popBackStack(IFragment fragment, String destinationId, boolean inclusive) {
		IActivity activity = fragment.getRootActivity();
		FragmentActivity fragmentActivity = (FragmentActivity) activity;
		
		int navigationId = getNavigationId(destinationId, fragment, fragmentActivity);
		NavHostFragment.findNavController(getNavhostFragment(fragment)).popBackStack(navigationId, inclusive);
	}

	public void popBackStack(IFragment activeRootFragment, IAsyncCallBack callBack) {
		popBackStack(activeRootFragment);
		callBack.done();
	}

	public void popBackStack(IFragment activeRootFragment, String destinationId, boolean inclusive,
			IAsyncCallBack callBack) {
		popBackStack(activeRootFragment, destinationId, inclusive);
		callBack.done();
	}

	private String getFileName(String[] destinationProps, int noofProps) {
		String fileName = "";
		String separator = "";

		for (int i = 2; i < destinationProps.length - noofProps; i++) {
			String destinationProp = destinationProps[i];
			fileName += separator +destinationProp;
			separator = "#";
		}
		return fileName;
	}
	public void closeDialog(String tag, IFragment fragment) {
		tag = tag.replace("@id/", "").replace("@+id/", "");
		((MyDialog) ((CordovaActivity) fragment.getRootActivity()).getSupportFragmentManager().findFragmentByTag(tag)).dismiss();
	}
}
