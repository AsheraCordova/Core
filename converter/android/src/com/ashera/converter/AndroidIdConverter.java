package com.ashera.converter;

import java.util.Map;

import com.ashera.core.IFragment;

public class AndroidIdConverter extends IdConverter {
	@Override
	public Integer convertFrom(String value, Map<String, Object> dependentAttributesMap, IFragment fragment) {
		if (value != null && (value.startsWith("@+id/n__") || value.startsWith("@id/n__"))) {
			com.ashera.core.IActivity activity = fragment.getRootActivity();
			androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) activity;
			int id = fragmentActivity.getResources().getIdentifier(value.replace("@+id/", "").replace("@id/", ""), "id", fragmentActivity.getPackageName());
			com.ashera.widget.IdGenerator.setId(value, id);
		}
		return super.convertFrom(value, dependentAttributesMap, fragment);
	}
}
