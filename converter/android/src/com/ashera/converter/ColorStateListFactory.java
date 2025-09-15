package com.ashera.converter;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ashera.core.IFragment;
import com.ashera.widget.PluginInvoker;

import android.content.res.ColorStateList;
import android.graphics.Color;
import com.ashera.converter.GrowingArrayUtils;
import android.util.StateSet;

public class ColorStateListFactory {
	private final static String[] COLOR_STATE_LIST = { "@android:state_window_focused", "@android:state_selected",
			"@android:state_focused", "@android:state_pressed", "@android:state_hovered", "@android:state_activated",
			"@android:state_accelerated", "@android:state_enabled", "@android:state_drag_can_accept",
			"@android:state_drag_hovered" };

	private final static int[] COLOR_STATE_LIST_ATTR = { android.R.attr.state_window_focused,
			android.R.attr.state_selected, android.R.attr.state_focused, android.R.attr.state_pressed,
			android.R.attr.state_hovered, android.R.attr.state_activated, android.R.attr.state_accelerated,
			android.R.attr.state_enabled, android.R.attr.state_drag_can_accept,
			android.R.attr.state_drag_hovered };
	private static Map<String, Integer> STATELIST_MAPPER = new java.util.HashMap<String, Integer>();
	static {
		for (int i = 0; i < COLOR_STATE_LIST.length; i++) {
			STATELIST_MAPPER.put(COLOR_STATE_LIST[i], COLOR_STATE_LIST_ATTR[i]);

		}
	}

	private static int modulateColorAlpha(int baseColor, float alphaMod) {
		if (alphaMod == 1.0f) {
			return baseColor;
		}
		final int baseAlpha = Color.alpha(baseColor);
		final int alpha = com.ashera.converter.MathUtils.constrain((int) (baseAlpha * alphaMod + 0.5f), 0, 255);
		return (baseColor & 0xFFFFFF) | (alpha << 24);
	}

	public static ColorStateList getColor(Map<String, Object> colorMap, IFragment fragment) {
		if (colorMap.containsKey("selector")) {
			int defaultColor = Color.RED;
			int[][] stateSpecList = new int[20][20];
			int[] colorList = new int[stateSpecList.length];
			int listSize = 0;

			Map<String, Object> selector = PluginInvoker.getMap(colorMap.get("selector"));
			List<Object> items = PluginInvoker.getList(selector.get("item"));

			for (Object item : items) {
				Map<String, Object> itemMap = PluginInvoker.getMap(item);

				String colorStr = (String) itemMap.get("@android:color");
				if (colorStr.startsWith("@color/")) {
					colorStr = com.ashera.utils.ResourceBundleUtils.getString("color/color", "color", (String) colorStr, fragment);
				}
				final int baseColor = colorStr == null ? Color.RED
						: Color.parseColor(com.ashera.utils.ColorUtil.colorToHex(colorStr));
				String aplhaStr = (String) itemMap.get("@android:alpha");
				final float alphaMod = aplhaStr == null ? 1.0f : PluginInvoker.getFloat(aplhaStr);
				// Parse all unrecognized attributes as state specifiers.
				int j = 0;
				Set<String> itemMapKeySet = itemMap.keySet();
				java.util.Iterator<String> itemMapIter = itemMapKeySet.iterator();
				final int numAttrs = itemMapKeySet.size();
				int[] stateSpec = new int[numAttrs];

				while (itemMapIter.hasNext()) {
					final String stateResStrId = itemMapIter.next();
					if (!(stateResStrId.startsWith("@android:alpha") || stateResStrId.startsWith("@android:color"))) {
						int stateResId = STATELIST_MAPPER.get(stateResStrId);
						stateSpec[j++] = PluginInvoker.getBoolean(itemMap.get(stateResStrId)) ? stateResId : -stateResId;
					}
				}
				stateSpec = StateSet.trimStateSet(stateSpec, j);
				// Apply alpha modulation. If we couldn't resolve the color or
				// alpha yet, the default values leave us enough information to
				// modulate again during applyTheme().
				final int color = modulateColorAlpha(baseColor, alphaMod);
				if (listSize == 0 || stateSpec.length == 0) {
					defaultColor = color;
				}

				colorList = GrowingArrayUtils.append(colorList, listSize, color);
				stateSpecList = GrowingArrayUtils.append(stateSpecList, listSize, stateSpec);
				listSize++;
			}

			ColorStateList colorStateList = new ColorStateList(stateSpecList, colorList);
			//colorStateList.setDefaultColor(defaultColor);
			//colorStateList.onColorsChanged();

			return colorStateList;
		}

		throw new RuntimeException("unknown color");
	}
}
