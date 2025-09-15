package com.ashera.converter;

import java.io.File;

//start - imports
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ashera.core.IFragment;
import com.ashera.model.FontDescriptor;
import com.ashera.utils.FileUtils;
//end - imports

public class FontConverter implements IConverter<Map<String, FontDescriptor>, String> {
	private static final String MONOSPACE_FONT = "Droid Sans Mono";
	private static final String SERIF_FONT = "Noto Serif";
	private static final String NORMAL_FONT = "Roboto";
	private static final String SANS_FONT = "Roboto";
	private static final int ITALIC_FONT_TRAIT = org.eclipse.swt.SWT.ITALIC;
	private static final int BOLD_FONT_TRAIT = org.eclipse.swt.SWT.BOLD;
	private static final int NORMAL_FONT_TRAIT = org.eclipse.swt.SWT.NORMAL;

	// start - body
	@Override
	public Map<String, FontDescriptor> convertFrom(String value, Map<String, Object> dependentAttributesMap,
			IFragment fragment) {
		if (fragment.getFromTempCache(value) != null) {
			return (Map<String, FontDescriptor>) fragment.getFromTempCache(value);
		}
		Map<String, FontDescriptor> fontDescriptors = new HashMap<String, FontDescriptor>();

		switch (value) {
		case "normal": {
			fontDescriptors.put("normal_400", new FontDescriptor(NORMAL_FONT, NORMAL_FONT_TRAIT));
			fontDescriptors.put("normal_700", new FontDescriptor(NORMAL_FONT, BOLD_FONT_TRAIT));
			fontDescriptors.put("italic_400", new FontDescriptor(NORMAL_FONT, ITALIC_FONT_TRAIT));
			fontDescriptors.put("italic_700", new FontDescriptor(NORMAL_FONT, ITALIC_FONT_TRAIT | BOLD_FONT_TRAIT));
			break;
		}
		case "sans":
			fontDescriptors.put("normal_400", new FontDescriptor(SANS_FONT, NORMAL_FONT_TRAIT));
			fontDescriptors.put("normal_700", new FontDescriptor(SANS_FONT, BOLD_FONT_TRAIT));
			fontDescriptors.put("italic_400", new FontDescriptor(SANS_FONT, ITALIC_FONT_TRAIT));
			fontDescriptors.put("italic_700", new FontDescriptor(SANS_FONT, ITALIC_FONT_TRAIT | BOLD_FONT_TRAIT));
			break;
		case "serif":
			fontDescriptors.put("normal_400", new FontDescriptor(SERIF_FONT, NORMAL_FONT_TRAIT));
			fontDescriptors.put("normal_700", new FontDescriptor(SERIF_FONT, BOLD_FONT_TRAIT));
			fontDescriptors.put("italic_400", new FontDescriptor(SERIF_FONT, ITALIC_FONT_TRAIT));
			fontDescriptors.put("italic_700", new FontDescriptor(SERIF_FONT, ITALIC_FONT_TRAIT | BOLD_FONT_TRAIT));
			break;
		case "monospace":
			fontDescriptors.put("normal_400", new FontDescriptor(MONOSPACE_FONT, NORMAL_FONT_TRAIT));
			fontDescriptors.put("normal_700", new FontDescriptor(MONOSPACE_FONT, BOLD_FONT_TRAIT));
			fontDescriptors.put("italic_400", new FontDescriptor(MONOSPACE_FONT, ITALIC_FONT_TRAIT));
			fontDescriptors.put("italic_700", new FontDescriptor(MONOSPACE_FONT, ITALIC_FONT_TRAIT | BOLD_FONT_TRAIT));
			break;
		default:
			// handle custom font
			if (value.startsWith("@font")) {
				Pattern pattern = Pattern.compile("@([a-z0-9\\-]+)\\/([a-z0-9\\-]+)");
				Matcher matcher = pattern.matcher(value);
				boolean matches = matcher.matches();

				if (matches) {
					java.util.Properties bundle = readProps(matcher.group(2));
					Set<Object> fonts = bundle.keySet();
					for (Object font : fonts) {
						String fontKey = getFontKey(font.toString());
						if (fontKey != null) {
							fontDescriptors.put(fontKey,
									new FontDescriptor(bundle.getProperty(font.toString()), NORMAL_FONT_TRAIT));
						}
					}

				}
			} else if (value.startsWith("cordova.file.")) {
				String cordovaFileUri = com.ashera.widget.PluginInvoker.resolveCDVFileLocation(value, fragment);
				if (cordovaFileUri != null) {
					loadFont(cordovaFileUri, fontDescriptors);
				}
			}
		}
		fragment.storeInTempCache(value, fontDescriptors);
		return fontDescriptors;
	}

	@Override
	public String convertTo(Map<String, FontDescriptor> value, IFragment fragment) {
		return "";
	}

	@Override
	public java.util.List<String> getDependentAttributes() {
		return null;
	}
	// end - body

	private Properties readProps(String name) {
		return FileUtils.loadPropertiesFromClassPath("font/font_" + name + ".properties");
	}

	private String getFontKey(String font) {
		if (font.endsWith("400") || font.endsWith("700")) {
			return font;
		}
		return null;
	}

	private void loadFont(String cordovaFileUri, Map<String, FontDescriptor> fontDescriptors) {
		try {
			java.io.FileInputStream inputStream = new java.io.FileInputStream(cordovaFileUri);
			java.awt.Font awtFont = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, inputStream);
			String fontName = awtFont.getFontName();
			File src = new File(cordovaFileUri);
			File dest = new File(com.ashera.widget.PluginInvoker.getExternalFilesDir(null).getAbsolutePath() + "/fonts/"
					+ src.getName());
			dest.getParentFile().mkdirs();
			System.out.println(dest.getAbsolutePath());
			if (!dest.exists()) {
				java.nio.file.Files.copy(src.toPath(), dest.toPath());
			}
			org.eclipse.swt.widgets.Display.getDefault().loadFont(dest.getAbsolutePath());
			fontDescriptors.put("normal_400", new FontDescriptor(fontName, NORMAL_FONT_TRAIT));
			inputStream.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}


}