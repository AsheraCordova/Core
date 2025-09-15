package com.ashera.core;

import java.util.List;
import java.util.Map;

public class UINavigatorImpl {
	private com.ashera.core.FragmentManager manager;
	public UINavigatorImpl() {
	}
	
	public UINavigatorImpl(com.ashera.core.FragmentManager manager) {
		this.manager = manager;
	}
	public com.ashera.core.FragmentManager getManager() {
		return manager;
	}

	public void navigate(String actionId, List<Map<String, Object>> scopedObjects,  IFragment fragment) {
		com.ashera.core.FragmentManager manager = getManager(fragment);
		manager.navigate(actionId, scopedObjects, fragment);
	}

	private com.ashera.core.FragmentManager getManager(IFragment fragment) {
		if (this.manager != null) {
			return manager;
		}
		com.ashera.core.FragmentManager manager = ((com.ashera.core.BaseCordovaActivity) fragment.getRootActivity()).getFragmentManager();
		return manager;
	}

	public void closeDialog(IFragment fragment) {
		com.ashera.core.FragmentManager manager = getManager(fragment);
		manager.closeDialog();
		
	}

	public void popBackStack(IFragment fragment, IAsyncCallBack callBack) {
		com.ashera.core.FragmentManager manager = getManager(fragment);
		manager.popBackStack(callBack);
	}

	public void popBackStack(IFragment fragment, String destinationId, boolean inclusive, IAsyncCallBack callBack) {
		com.ashera.core.FragmentManager manager = getManager(fragment);
		manager.popBackStack(destinationId, inclusive, callBack);
	}


	public void navigate(String actionId, String destinationId, boolean inclusive,
			boolean finish, List<Map<String, Object>> scopedObjects, IFragment fragment) {
		com.ashera.core.FragmentManager manager = getManager(fragment);
		manager.navigate(actionId, destinationId, inclusive, finish, scopedObjects, fragment);
		
	}
	
	public IFragment getActiveFragment(IFragment fragment) {
		com.ashera.core.FragmentManager manager = getManager(fragment);
		return manager.getActiveFragment();
	}

	public void popBackStack(IFragment fragment) {
		com.ashera.core.FragmentManager manager = getManager(fragment);
		manager.popBackStack(new IAsyncCallBack() {
			@Override
			public void done() {
			}
		});
	}

	public void popBackStack(IFragment fragment, String destinationId, boolean inclusive) {
		com.ashera.core.FragmentManager manager = getManager(fragment);
		manager.popBackStack(destinationId, inclusive, new IAsyncCallBack() {
			@Override
			public void done() {
			}
		});
	}

}
