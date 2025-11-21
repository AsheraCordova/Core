//start - license
/*
 * Copyright (c) 2025 Ashera Cordova
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
//end - license
package com.ashera.layout;
import java.lang.reflect.Method;
//start - imports
import java.util.*;

import android.content.Context;
import android.os.Build;
import android.view.View;
import androidx.core.view.*;
import android.annotation.SuppressLint;

import com.ashera.widget.*;
import com.ashera.converter.*;
import android.widget.*;
import android.view.*;
import android.graphics.*;
import android.content.res.*;


import static com.ashera.widget.IWidget.*;
//end - imports
import android.animation.Animator;
public class ViewImpl {
	// start - body
	private ViewImpl() {
	}
	
		@SuppressLint("NewApi")
		final static class AccessibilityLiveRegion extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("assertive",  0x2);
				mapping.put("none",  0x0);
				mapping.put("polite",  0x1);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class BackgroundTintMode  extends AbstractStringToEnumConverter{
		private Map<String, Object> mapping = new HashMap<>();
				{
		if (Build.VERSION.SDK_INT >= 11) {
				mapping.put("add", android.graphics.PorterDuff.Mode.ADD);
		}
		
				mapping.put("multiply", android.graphics.PorterDuff.Mode.MULTIPLY);
		
		
				mapping.put("screen", android.graphics.PorterDuff.Mode.SCREEN);
		
		
				mapping.put("src_atop", android.graphics.PorterDuff.Mode.SRC_ATOP);
		
		
				mapping.put("src_in", android.graphics.PorterDuff.Mode.SRC_IN);
		
		
				mapping.put("src_over", android.graphics.PorterDuff.Mode.SRC_OVER);
		
				}
		@Override
		public Map<String, Object> getMapping() {
				return mapping;
				}

		@Override
		public Object getDefault() {
				return null;
				}
				}
		@SuppressLint("NewApi")
		final static class ForegroundTintMode  extends AbstractStringToEnumConverter{
		private Map<String, Object> mapping = new HashMap<>();
				{
		if (Build.VERSION.SDK_INT >= 11) {
				mapping.put("add", android.graphics.PorterDuff.Mode.ADD);
		}
		
				mapping.put("multiply", android.graphics.PorterDuff.Mode.MULTIPLY);
		
		
				mapping.put("screen", android.graphics.PorterDuff.Mode.SCREEN);
		
		
				mapping.put("src_atop", android.graphics.PorterDuff.Mode.SRC_ATOP);
		
		
				mapping.put("src_in", android.graphics.PorterDuff.Mode.SRC_IN);
		
		
				mapping.put("src_over", android.graphics.PorterDuff.Mode.SRC_OVER);
		
				}
		@Override
		public Map<String, Object> getMapping() {
				return mapping;
				}

		@Override
		public Object getDefault() {
				return null;
				}
				}
		@SuppressLint("NewApi")
		final static class ImportantForAccessibility extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("auto",  0x0);
				mapping.put("no",  0x2);
				mapping.put("noHideDescendants",  0x4);
				mapping.put("yes",  0x1);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class ImportantForAutofill  extends AbstractBitFlagConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("auto", 0x0);
				mapping.put("no", 0x2);
				mapping.put("noExcludeDescendants", 0x8);
				mapping.put("yes", 0x1);
				mapping.put("yesExcludeDescendants", 0x4);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class LayoutDirection extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("inherit",  0x2);
				mapping.put("locale",  0x3);
				mapping.put("ltr",  0x0);
				mapping.put("rtl",  0x1);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class ScrollIndicators  extends AbstractBitFlagConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("bottom", 0x2);
				mapping.put("end", 0x20);
				mapping.put("left", 0x4);
				mapping.put("none", 0x0);
				mapping.put("right", 0x8);
				mapping.put("start", 0x10);
				mapping.put("top", 0x1);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class ScrollbarStyle extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("insideInset",  0x1000000);
				mapping.put("insideOverlay",  0x0);
				mapping.put("outsideInset",  0x3000000);
				mapping.put("outsideOverlay",  0x2000000);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class TextAlignment extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("center",  0x4);
				mapping.put("gravity",  0x1);
				mapping.put("inherit",  0x0);
				mapping.put("textEnd",  0x3);
				mapping.put("textStart",  0x2);
				mapping.put("viewEnd",  0x6);
				mapping.put("viewStart",  0x5);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class TextDirection extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("anyRtl",  0x2);
				mapping.put("firstStrong",  0x1);
				mapping.put("firstStrongLtr",  0x6);
				mapping.put("firstStrongRtl",  0x7);
				mapping.put("inherit",  0x0);
				mapping.put("locale",  0x5);
				mapping.put("ltr",  0x3);
				mapping.put("rtl",  0x4);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class Visibility extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("gone",  0x8);
				mapping.put("invisible",  0x4);
				mapping.put("visible",  0x0);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class LayerType extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("hardware",  0x2);
				mapping.put("none",  0x0);
				mapping.put("software",  0x1);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class RequiresFadingEdge  extends AbstractBitFlagConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("horizontal", 0x1000);
				mapping.put("none", 0x0);
				mapping.put("vertical", 0x2000);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class BackgroundRepeat extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("no-repeat",  0x0);
				mapping.put("repeat",  0x1);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class ForegroundRepeat extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("no-repeat",  0x0);
				mapping.put("repeat",  0x1);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class HapticFeedbackConstants extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("LONG_PRESS",  android.view.HapticFeedbackConstants.LONG_PRESS);
				mapping.put("VIRTUAL_KEY",  android.view.HapticFeedbackConstants.VIRTUAL_KEY);
				mapping.put("KEYBOARD_TAP",  android.view.HapticFeedbackConstants.KEYBOARD_TAP);
				mapping.put("CLOCK_TICK",  android.view.HapticFeedbackConstants.CLOCK_TICK);
				mapping.put("CONTEXT_CLICK",  android.view.HapticFeedbackConstants.CONTEXT_CLICK);
				mapping.put("KEYBOARD_PRESS",  android.view.HapticFeedbackConstants.KEYBOARD_PRESS);
				mapping.put("KEYBOARD_RELEASE",  android.view.HapticFeedbackConstants.KEYBOARD_RELEASE);
				mapping.put("VIRTUAL_KEY_RELEASE",  android.view.HapticFeedbackConstants.VIRTUAL_KEY_RELEASE);
				mapping.put("TEXT_HANDLE_MOVE",  android.view.HapticFeedbackConstants.TEXT_HANDLE_MOVE);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class HapticFeedbackConstantsFlag  extends AbstractBitFlagConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("FLAG_IGNORE_VIEW_SETTING", android.view.HapticFeedbackConstants.FLAG_IGNORE_VIEW_SETTING);
				mapping.put("FLAG_IGNORE_GLOBAL_SETTING", android.view.HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class Vtype extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("email",  0x1);
				mapping.put("time",  0x2);
				mapping.put("date",  0x3);
				mapping.put("url",  0x4);
				mapping.put("tel",  0x5);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class ValidationErrorDisplay  extends AbstractBitFlagConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("popup", 0x1);
				mapping.put("label", 0x2);
				mapping.put("style", 0x4);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
	
	@SuppressLint("NewApi")
	public static void register(String localName) {

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("accessibilityHeading").withType("boolean"));
		ConverterFactory.register("View.accessibilityLiveRegion", new AccessibilityLiveRegion());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("accessibilityLiveRegion").withType("View.accessibilityLiveRegion"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("accessibilityPaneTitle").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("accessibilityTraversalAfter").withType("id"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("accessibilityTraversalBefore").withType("id"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("alpha").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("autofillHints").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("backgroundTint").withType("colorstate"));
		ConverterFactory.register("View.backgroundTintMode", new BackgroundTintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("backgroundTintMode").withType("View.backgroundTintMode"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("clickable").withType("boolean").withOrder(10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("contentDescription").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("contextClickable").withType("boolean").withOrder(10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("defaultFocusHighlightEnabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("duplicateParentState").withType("boolean").beforeChildAdd());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("elevation").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("fadeScrollbars").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("fadingEdgeLength").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("filterTouchesWhenObscured").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("fitsSystemWindows").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("focusableInTouchMode").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("focusedByDefault").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("forceHasOverlappingRendering").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("foregroundTint").withType("colorstate"));
		ConverterFactory.register("View.foregroundTintMode", new ForegroundTintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("foregroundTintMode").withType("View.foregroundTintMode"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hapticFeedbackEnabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("id").withType("id"));
		ConverterFactory.register("View.importantForAccessibility", new ImportantForAccessibility());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("importantForAccessibility").withType("View.importantForAccessibility"));
		ConverterFactory.register("View.importantForAutofill", new ImportantForAutofill());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("importantForAutofill").withType("View.importantForAutofill"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("isScrollContainer").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("keepScreenOn").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("keyboardNavigationCluster").withType("boolean"));
		ConverterFactory.register("View.layoutDirection", new LayoutDirection());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layoutDirection").withType("View.layoutDirection").beforeChildAdd());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("longClickable").withType("boolean").withOrder(10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minHeight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minWidth").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("nextClusterForward").withType("id"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("nextFocusDown").withType("id"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("nextFocusForward").withType("id"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("nextFocusLeft").withType("id"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("nextFocusRight").withType("id"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("nextFocusUp").withType("id"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("rotation").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("rotationX").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("rotationY").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("saveEnabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scaleX").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scaleY").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("screenReaderFocusable").withType("boolean"));
		ConverterFactory.register("View.scrollIndicators", new ScrollIndicators());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scrollIndicators").withType("View.scrollIndicators"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scrollbarDefaultDelayBeforeFade").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scrollbarFadeDuration").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scrollbarSize").withType("dimension"));
		ConverterFactory.register("View.scrollbarStyle", new ScrollbarStyle());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scrollbarStyle").withType("View.scrollbarStyle"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("soundEffectsEnabled").withType("boolean"));
		ConverterFactory.register("View.textAlignment", new TextAlignment());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textAlignment").withType("View.textAlignment"));
		ConverterFactory.register("View.textDirection", new TextDirection());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textDirection").withType("View.textDirection"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tooltipText").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("transformPivotX").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("transformPivotY").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("transitionName").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("translationX").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("translationY").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("translationZ").withType("dimensionfloat"));
		ConverterFactory.register("View.visibility", new Visibility());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("visibility").withType("View.visibility"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onApplyWindowInsets").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onCapturedPointer").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onClick").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onContextClick").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onCreateContextMenu").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onDrag").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onFocusChange").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onGenericMotion").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onHover").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onKey").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onLongClick").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onScrollChange").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onSystemUiVisibilityChange").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onTouch").withType("String"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("padding").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingTop").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingBottom").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingLeft").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingRight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingStart").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingEnd").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingHorizontal").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("paddingVertical").withType("dimension"));
		ConverterFactory.register("View.layerType", new LayerType());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layerType").withType("View.layerType"));
		ConverterFactory.register("View.requiresFadingEdge", new RequiresFadingEdge());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("requiresFadingEdge").withType("View.requiresFadingEdge"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("background").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("foreground").withType("drawable"));
		ConverterFactory.register("View.backgroundRepeat", new BackgroundRepeat());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("backgroundRepeat").withType("View.backgroundRepeat").withOrder(-10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelSyncEvents").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("updateModelData").withType("object"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("notifyDataSetChanged").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelParam").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelPojoToUi").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelUiToPojo").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelPojoToUiParams").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("refreshUiFromModel").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelUiToPojoEventIds").withType("string"));
		ConverterFactory.register("View.foregroundRepeat", new ForegroundRepeat());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("foregroundRepeat").withType("View.foregroundRepeat").withOrder(-10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("foregroundGravity").withType("gravity"));
		ConverterFactory.register("View.HapticFeedbackConstants", new HapticFeedbackConstants());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("performHapticFeedback").withType("View.HapticFeedbackConstants"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("performHapticFeedbackWithFlags").withType("object"));
		ConverterFactory.register("View.HapticFeedbackConstants", new HapticFeedbackConstants());
		ConverterFactory.register("View.HapticFeedbackConstantsFlag", new HapticFeedbackConstantsFlag());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("attributeUnderTest").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("selected").withType("boolean").withOrder(10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("enabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("focusable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scrollX").withType("dimension").withBufferStrategy(BUFFER_STRATEGY_DURING_INIT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scrollY").withType("dimension").withBufferStrategy(BUFFER_STRATEGY_DURING_INIT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("invalidate").withType("nil"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("requestLayout").withType("nil"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("asDragSource").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("zIndex").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxWidth").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxHeight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("style").withType("string").withStylePriority(0));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("errorStyle").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("validateForm").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("validation").withType("array").withArrayType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("v_required").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("v_minlength").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("v_maxlength").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("v_min").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("v_max").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("v_pattern").withType("resourcestring"));
		ConverterFactory.register("View.vtype", new Vtype());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("v_type").withType("View.vtype"));
		ConverterFactory.register("View.validationErrorDisplay", new ValidationErrorDisplay());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("validationErrorDisplayType").withType("View.validationErrorDisplay"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("customErrorMessageValues").withType("array").withArrayType("resourcestring").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("customErrorMessageKeys").withType("array").withArrayType("resourcestring").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("invalidateOnFrameChange").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onSwiped").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("animatorXml").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("startAnimator").withType("nil"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("endAnimator").withType("nil"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onAnimationStart").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onAnimationEnd").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onAnimationCancel").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onAnimationRepeat").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("left").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("right").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("top").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("bottom").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("outlineAmbientShadowColor").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("outlineSpotShadowColor").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("cornerRadius").withType("dimensionfloat"));
	WidgetFactory.registerConstructorAttribute(localName, new WidgetAttribute.Builder().withName("formGroupId").withType("string"));
	WidgetFactory.registerConstructorAttribute(localName, new WidgetAttribute.Builder().withName("systemStyle").withType("string"));
	WidgetFactory.registerConstructorAttribute(localName, new WidgetAttribute.Builder().withName("systemAndroidAttrStyle").withType("string"));
	WidgetFactory.registerConstructorAttribute(localName, new WidgetAttribute.Builder().withName("enableFeatures").withType("string"));
		
		java.util.List<IAttributable> attributables = WidgetFactory.getAttributables("View", localName);
		if (attributables != null) {
			for (IAttributable attributable : attributables) {
				attributable.loadAttributes(localName);
			}
		}
	}

	@SuppressLint("NewApi")
	public static void setAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		Object nativeWidget = w.invokeMethod("nativeWidgetFor", key.getAttributeName());
		if (nativeWidget == null) {
			nativeWidget = w.asNativeWidget();
		}
		setAttribute(w, nativeWidget, key, strValue, objValue, decorator);
	}
	@SuppressLint("NewApi")
	public static void setAttribute(IWidget w, SimpleWrapableView wrapperView, WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		if (wrapperView.isViewWrapped() && key.getSimpleWrapableViewStrategy() != 0) {
			if ((key.getSimpleWrapableViewStrategy() & IWidget.APPLY_TO_VIEW_WRAPPER) != 0) {
				setAttribute(w, wrapperView.getWrappedView(), key, strValue, objValue, decorator);
			}
			
			if ((key.getSimpleWrapableViewStrategy() & IWidget.APPLY_TO_VIEW_HOLDER) != 0) {
				setAttribute(w, wrapperView.getWrapperViewHolder(), key, strValue, objValue, decorator);
			}
			
			if (((key.getSimpleWrapableViewStrategy() & IWidget.APPLY_TO_FOREGROUND) != 0) && wrapperView.getForeground() != null) {
				setAttribute(w, wrapperView.getForeground(), key, strValue, objValue, decorator);
			}
		} else {
			setAttribute(w, w.asNativeWidget(), key, strValue, objValue, decorator);
		}
	}
	@SuppressLint("NewApi")
	private static void setAttribute(IWidget w, Object nativeWidget, WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		View view = (View) w.asWidget();
		switch (key.getAttributeName()) {
		case "accessibilityHeading": {


		ViewCompat.setAccessibilityHeading(view, (boolean) objValue);



			}
			break;
		case "accessibilityLiveRegion": {


		ViewCompat.setAccessibilityLiveRegion(view, (int) objValue);



			}
			break;
		case "accessibilityPaneTitle": {


		ViewCompat.setAccessibilityPaneTitle(view, (CharSequence) objValue);



			}
			break;
		case "accessibilityTraversalAfter": {
if (Build.VERSION.SDK_INT >= 22) {

	view.setAccessibilityTraversalAfter((int)objValue);

}

			}
			break;
		case "accessibilityTraversalBefore": {
if (Build.VERSION.SDK_INT >= 22) {

	view.setAccessibilityTraversalBefore((int)objValue);

}

			}
			break;
		case "alpha": {


		ViewCompat.setAlpha(view, (float) objValue);



			}
			break;
		case "autofillHints": {


		ViewCompat.setAutofillHints(view, (String) objValue);



			}
			break;
		case "backgroundTint": {


		ViewCompat.setBackgroundTintList(view, (ColorStateList) objValue);



			}
			break;
		case "backgroundTintMode": {


		ViewCompat.setBackgroundTintMode(view, (PorterDuff.Mode) objValue);



			}
			break;
		case "clickable": {


	view.setClickable((boolean)objValue);



			}
			break;
		case "contentDescription": {


	view.setContentDescription((String)objValue);



			}
			break;
		case "contextClickable": {
if (Build.VERSION.SDK_INT >= 23) {

	view.setContextClickable((boolean)objValue);

}

			}
			break;
		case "defaultFocusHighlightEnabled": {
if (Build.VERSION.SDK_INT >= 26) {

	view.setDefaultFocusHighlightEnabled((boolean)objValue);

}

			}
			break;
		case "duplicateParentState": {


	view.setDuplicateParentStateEnabled((boolean)objValue);



			}
			break;
		case "elevation": {


		ViewCompat.setElevation(view, (float) objValue);



			}
			break;
		case "fadeScrollbars": {


	view.setScrollbarFadingEnabled((boolean)objValue);



			}
			break;
		case "fadingEdgeLength": {


	view.setFadingEdgeLength((int)objValue);



			}
			break;
		case "filterTouchesWhenObscured": {
if (Build.VERSION.SDK_INT >= 9) {

	view.setFilterTouchesWhenObscured((boolean)objValue);

}

			}
			break;
		case "fitsSystemWindows": {


		ViewCompat.setFitsSystemWindows(view, (boolean) objValue);



			}
			break;
		case "focusableInTouchMode": {


	view.setFocusableInTouchMode((boolean)objValue);



			}
			break;
		case "focusedByDefault": {


		ViewCompat.setFocusedByDefault(view, (boolean) objValue);



			}
			break;
		case "forceHasOverlappingRendering": {
if (Build.VERSION.SDK_INT >= 24) {

	view.forceHasOverlappingRendering((boolean)objValue);

}

			}
			break;
		case "foregroundTint": {
if (Build.VERSION.SDK_INT >= 23) {

	view.setForegroundTintList((android.content.res.ColorStateList)objValue);

}

			}
			break;
		case "foregroundTintMode": {
if (Build.VERSION.SDK_INT >= 23) {

	view.setForegroundTintMode((android.graphics.PorterDuff.Mode)objValue);

}

			}
			break;
		case "hapticFeedbackEnabled": {


	view.setHapticFeedbackEnabled((boolean)objValue);



			}
			break;
		case "id": {


	view.setId((int)objValue);



			}
			break;
		case "importantForAccessibility": {


		ViewCompat.setImportantForAccessibility(view, (int) objValue);



			}
			break;
		case "importantForAutofill": {


		ViewCompat.setImportantForAutofill(view, (int) objValue);



			}
			break;
		case "isScrollContainer": {


	view.setScrollContainer((boolean)objValue);



			}
			break;
		case "keepScreenOn": {


	view.setKeepScreenOn((boolean)objValue);



			}
			break;
		case "keyboardNavigationCluster": {


		ViewCompat.setKeyboardNavigationCluster(view, (boolean) objValue);



			}
			break;
		case "layoutDirection": {


		ViewCompat.setLayoutDirection(view, (int) objValue);



			}
			break;
		case "longClickable": {


	view.setLongClickable((boolean)objValue);



			}
			break;
		case "minHeight": {


	view.setMinimumHeight((int)objValue);



			}
			break;
		case "minWidth": {


	view.setMinimumWidth((int)objValue);



			}
			break;
		case "nextClusterForward": {


		ViewCompat.setNextClusterForwardId(view, (int) objValue);



			}
			break;
		case "nextFocusDown": {


	view.setNextFocusDownId((int)objValue);



			}
			break;
		case "nextFocusForward": {
if (Build.VERSION.SDK_INT >= 11) {

	view.setNextFocusForwardId((int)objValue);

}

			}
			break;
		case "nextFocusLeft": {


	view.setNextFocusLeftId((int)objValue);



			}
			break;
		case "nextFocusRight": {


	view.setNextFocusRightId((int)objValue);



			}
			break;
		case "nextFocusUp": {


	view.setNextFocusUpId((int)objValue);



			}
			break;
		case "rotation": {


		ViewCompat.setRotation(view, (float) objValue);



			}
			break;
		case "rotationX": {


		ViewCompat.setRotationX(view, (float) objValue);



			}
			break;
		case "rotationY": {


		ViewCompat.setRotationY(view, (float) objValue);



			}
			break;
		case "saveEnabled": {


	view.setSaveEnabled((boolean)objValue);



			}
			break;
		case "scaleX": {


		ViewCompat.setScaleX(view, (float) objValue);



			}
			break;
		case "scaleY": {


		ViewCompat.setScaleY(view, (float) objValue);



			}
			break;
		case "screenReaderFocusable": {


		ViewCompat.setScreenReaderFocusable(view, (boolean) objValue);



			}
			break;
		case "scrollIndicators": {


		ViewCompat.setScrollIndicators(view, (int) objValue);



			}
			break;
		case "scrollbarDefaultDelayBeforeFade": {
if (Build.VERSION.SDK_INT >= 16) {

	view.setScrollBarDefaultDelayBeforeFade((int)objValue);

}

			}
			break;
		case "scrollbarFadeDuration": {
if (Build.VERSION.SDK_INT >= 16) {

	view.setScrollBarFadeDuration((int)objValue);

}

			}
			break;
		case "scrollbarSize": {
if (Build.VERSION.SDK_INT >= 16) {

	view.setScrollBarSize((int)objValue);

}

			}
			break;
		case "scrollbarStyle": {


	view.setScrollBarStyle((int)objValue);



			}
			break;
		case "soundEffectsEnabled": {


	view.setSoundEffectsEnabled((boolean)objValue);



			}
			break;
		case "textAlignment": {
if (Build.VERSION.SDK_INT >= 17) {

	view.setTextAlignment((int)objValue);

}

			}
			break;
		case "textDirection": {
if (Build.VERSION.SDK_INT >= 17) {

	view.setTextDirection((int)objValue);

}

			}
			break;
		case "tooltipText": {


		ViewCompat.setTooltipText(view, (CharSequence) objValue);



			}
			break;
		case "transformPivotX": {


		ViewCompat.setPivotX(view, (float) objValue);



			}
			break;
		case "transformPivotY": {


		ViewCompat.setPivotY(view, (float) objValue);



			}
			break;
		case "transitionName": {
if (Build.VERSION.SDK_INT >= 21) {

	view.setTransitionName((String)objValue);

}

			}
			break;
		case "translationX": {


		ViewCompat.setTranslationX(view, (float) objValue);



			}
			break;
		case "translationY": {


		ViewCompat.setTranslationY(view, (float) objValue);



			}
			break;
		case "translationZ": {


		ViewCompat.setTranslationZ(view, (float) objValue);



			}
			break;
		case "visibility": {


	view.setVisibility((int)objValue);



			}
			break;
		case "onApplyWindowInsets": {
if (Build.VERSION.SDK_INT >= 20) {

		if (objValue instanceof String) {view.setOnApplyWindowInsetsListener(new OnApplyWindowInsetsListener(w, strValue));} else {setOnApplyWindowInsetsListener(view, objValue);}

}

			}
			break;
		case "onCapturedPointer": {
if (Build.VERSION.SDK_INT >= 26) {

		if (objValue instanceof String) {view.setOnCapturedPointerListener(new OnCapturedPointerListener(w, strValue));} else {setOnCapturedPointerListener(view, objValue);}

}

			}
			break;
		case "onClick": {


		if (objValue instanceof String) {view.setOnClickListener(new OnClickListener(w, strValue));} else {setOnClickListener(view, objValue);}



			}
			break;
		case "onContextClick": {
if (Build.VERSION.SDK_INT >= 23) {

		if (objValue instanceof String) {view.setOnContextClickListener(new OnContextClickListener(w, strValue));} else {setOnContextClickListener(view, objValue);}

}

			}
			break;
		case "onCreateContextMenu": {


		if (objValue instanceof String) {view.setOnCreateContextMenuListener(new OnCreateContextMenuListener(w, strValue));} else {setOnCreateContextMenuListener(view, objValue);}



			}
			break;
		case "onDrag": {
if (Build.VERSION.SDK_INT >= 11) {

		if (objValue instanceof String) {view.setOnDragListener(new OnDragListener(w, strValue));} else {setOnDragListener(view, objValue);}

}

			}
			break;
		case "onFocusChange": {


		if (objValue instanceof String) {view.setOnFocusChangeListener(new OnFocusChangeListener(w, strValue));} else {setOnFocusChangeListener(view, objValue);}



			}
			break;
		case "onGenericMotion": {
if (Build.VERSION.SDK_INT >= 12) {

		if (objValue instanceof String) {view.setOnGenericMotionListener(new OnGenericMotionListener(w, strValue));} else {setOnGenericMotionListener(view, objValue);}

}

			}
			break;
		case "onHover": {
if (Build.VERSION.SDK_INT >= 14) {

		if (objValue instanceof String) {view.setOnHoverListener(new OnHoverListener(w, strValue));} else {setOnHoverListener(view, objValue);}

}

			}
			break;
		case "onKey": {


		if (objValue instanceof String) {view.setOnKeyListener(new OnKeyListener(w, strValue));} else {setOnKeyListener(view, objValue);}



			}
			break;
		case "onLongClick": {


		if (objValue instanceof String) {view.setOnLongClickListener(new OnLongClickListener(w, strValue));} else {setOnLongClickListener(view, objValue);}



			}
			break;
		case "onScrollChange": {
if (Build.VERSION.SDK_INT >= 23) {

		if (objValue instanceof String) {view.setOnScrollChangeListener(new OnScrollChangeListener(w, strValue));} else {setOnScrollChangeListener(view, objValue);}

}

			}
			break;
		case "onSystemUiVisibilityChange": {
if (Build.VERSION.SDK_INT >= 11) {

		if (objValue instanceof String) {view.setOnSystemUiVisibilityChangeListener(new OnSystemUiVisibilityChangeListener(w, strValue));} else {setOnSystemUiVisibilityChangeListener(view, objValue);}

}

			}
			break;
		case "onTouch": {


		if (objValue instanceof String) {view.setOnTouchListener(new OnTouchListener(w, strValue));} else {setOnTouchListener(view, objValue);}



			}
			break;
		case "padding": {


		setPadding(objValue, view);



			}
			break;
		case "paddingTop": {


		setPaddingTop(objValue, view);



			}
			break;
		case "paddingBottom": {


		setPaddingBottom(objValue, view);



			}
			break;
		case "paddingLeft": {


		setPaddingLeft(objValue, view);



			}
			break;
		case "paddingRight": {


		setPaddingRight(objValue, view);



			}
			break;
		case "paddingStart": {


		setPaddingLeft(objValue, view);



			}
			break;
		case "paddingEnd": {


		setPaddingRight(objValue, view);



			}
			break;
		case "paddingHorizontal": {


		setPaddingHorizontal(objValue, view);



			}
			break;
		case "paddingVertical": {


		setPaddingVertical(objValue, view);



			}
			break;
		case "layerType": {


		setLayerType(objValue, view);



			}
			break;
		case "requiresFadingEdge": {


		setRequiresFadingEdge(objValue, view);



			}
			break;
		case "background": {


		setBackground(w, strValue, objValue, view);



			}
			break;
		case "foreground": {


		setForeground(w, strValue, objValue, view);



			}
			break;
		case "backgroundRepeat": {


		setBackgroundRepeat(w, strValue, objValue, view);



			}
			break;
		case "modelSyncEvents": {


		setModelSyncEvents(w, strValue, objValue, view);



			}
			break;
		case "updateModelData": {
		if (objValue instanceof Map) {
			Map<String, Object> data = ((Map<String, Object>) objValue);
		Object expression = w.quickConvert(data.get("expression"), "string");
		Object payload = w.quickConvert(data.get("payload"), "object");


		 updateModelData(w, expression, payload);


}
if (objValue instanceof java.util.List) {
	java.util.List<Object> list = (java.util.List<Object>) objValue;
	for (Object object : list) {
		Map<String, Object> data = PluginInvoker.getMap(object);
		Object expression = w.quickConvert(data.get("expression"), "string");
		Object payload = w.quickConvert(data.get("payload"), "object");


		 updateModelData(w, expression, payload);


	}
}
			}
			break;
		case "notifyDataSetChanged": {


		 notifyDataSetChanged(w, objValue);



			}
			break;
		case "modelParam": {


		setModelParam(w, strValue, objValue, view);



			}
			break;
		case "modelPojoToUi": {


		setModelPojoToUi(w, strValue, objValue, view);



			}
			break;
		case "modelUiToPojo": {


		setModelUiToPojo(w, strValue, objValue, view);



			}
			break;
		case "modelPojoToUiParams": {


		setModelPojoToUiParams(w, objValue);



			}
			break;
		case "refreshUiFromModel": {


		refreshUiFromModel(w, objValue);



			}
			break;
		case "modelUiToPojoEventIds": {


		setModelUiToPojoEventIds(w, objValue);



			}
			break;
		case "foregroundRepeat": {


		setForegroundRepeat(w, strValue, objValue, view);



			}
			break;
		case "foregroundGravity": {


		setForegroundGravity(w, objValue);



			}
			break;
		case "performHapticFeedback": {


		view.performHapticFeedback((int)objValue);



			}
			break;
		case "performHapticFeedbackWithFlags": {
		if (objValue instanceof Map) {
			Map<String, Object> data = ((Map<String, Object>) objValue);
		Object value = w.quickConvert(data.get("value"), "View.HapticFeedbackConstants");
		Object flags = w.quickConvert(data.get("flags"), "View.HapticFeedbackConstantsFlag");


		 view.performHapticFeedback((int)value, (int)flags);


}
if (objValue instanceof java.util.List) {
	java.util.List<Object> list = (java.util.List<Object>) objValue;
	for (Object object : list) {
		Map<String, Object> data = PluginInvoker.getMap(object);
		Object value = w.quickConvert(data.get("value"), "View.HapticFeedbackConstants");
		Object flags = w.quickConvert(data.get("flags"), "View.HapticFeedbackConstantsFlag");


		 view.performHapticFeedback((int)value, (int)flags);


	}
}
			}
			break;
		case "attributeUnderTest": {


		 //



			}
			break;
		case "selected": {


		setSelected(objValue, view);



			}
			break;
		case "enabled": {


		view.setEnabled((boolean)objValue);



			}
			break;
		case "focusable": {


	view.setFocusable((boolean)objValue);



			}
			break;
		case "scrollX": {


		setScrollX(w, view, objValue);



			}
			break;
		case "scrollY": {


		setScrollY(w, view, objValue);



			}
			break;
		case "invalidate": {


		 invalidate(w);



			}
			break;
		case "requestLayout": {


		 requestLayout(w);



			}
			break;
		case "asDragSource": {


		 setAsDragSource(w, objValue);



			}
			break;
		case "zIndex": {


		 setZIndex(w, objValue);



			}
			break;
		case "maxWidth": {


		 setMaxWidth(w, objValue); 



			}
			break;
		case "maxHeight": {


		 setMaxHeight(w, objValue); 



			}
			break;
		case "style": {


		setStyle(w, view, objValue);



			}
			break;
		case "errorStyle": {


		setErrorStyle(w, view, objValue);



			}
			break;
		case "validateForm": {


		validateForm(w, objValue);



			}
			break;
		case "validation": {


		setValidation(w, objValue);



			}
			break;
		case "v_required": {


		setRequired(w, objValue);



			}
			break;
		case "v_minlength": {


		setMinlength(w, objValue);



			}
			break;
		case "v_maxlength": {


		setMaxlength(w, objValue);



			}
			break;
		case "v_min": {


		setMin(w, objValue);



			}
			break;
		case "v_max": {


		setMax(w, objValue);



			}
			break;
		case "v_pattern": {


		setPattern(w, objValue);



			}
			break;
		case "v_type": {


		setType(w, strValue, objValue);



			}
			break;
		case "validationErrorDisplayType": {


		setValidationErrorDisplay(w, strValue, objValue);



			}
			break;
		case "customErrorMessageValues": {


		setCustomErrorMessageValues(w, objValue);



			}
			break;
		case "customErrorMessageKeys": {


		setCustomErrorMessageKeys(w, objValue);



			}
			break;
		case "invalidateOnFrameChange": {


		setInvalidateOnFrameChange(w, objValue);



			}
			break;
		case "onSwiped": {


		if (objValue instanceof String) {setOnSwipeListener(w, new SwipeListener(w, strValue, "onSwiped"));} else {setOnSwipeListener(w, (SwipeHelper.SwipeListener) objValue);}



			}
			break;
		case "animatorXml": {


		setAnimatorXml(w, objValue);



			}
			break;
		case "startAnimator": {


		startAnimator(w, objValue);



			}
			break;
		case "endAnimator": {


		endAnimator(w, objValue);



			}
			break;
		case "onAnimationStart": {


		if (objValue instanceof String) {setAnimatorListener(w, new AnimatorListener(w, strValue, "onAnimationStart"));} else {setAnimatorListener(w, (Animator.AnimatorListener) objValue);}



			}
			break;
		case "onAnimationEnd": {


		if (objValue instanceof String) {setAnimatorListener(w, new AnimatorListener(w, strValue, "onAnimationEnd"));} else {setAnimatorListener(w, (Animator.AnimatorListener) objValue);}



			}
			break;
		case "onAnimationCancel": {


		if (objValue instanceof String) {setAnimatorListener(w, new AnimatorListener(w, strValue, "onAnimationCancel"));} else {setAnimatorListener(w, (Animator.AnimatorListener) objValue);}



			}
			break;
		case "onAnimationRepeat": {


		if (objValue instanceof String) {setAnimatorListener(w, new AnimatorListener(w, strValue, "onAnimationRepeat"));} else {setAnimatorListener(w, (Animator.AnimatorListener) objValue);}



			}
			break;
		case "left": {


		 setLeft(w, objValue);



			}
			break;
		case "right": {


		 setRight(w, objValue);



			}
			break;
		case "top": {


		 setTop(w, objValue);



			}
			break;
		case "bottom": {


		 setBottom(w, objValue);



			}
			break;
		case "outlineAmbientShadowColor": {


		setOutlineAmbientShadowColor(w,objValue);



			}
			break;
		case "outlineSpotShadowColor": {


		setOutlineSpotShadowColor(w,objValue);



			}
			break;
		case "cornerRadius": {


		 setCornerRadius(w, nativeWidget, objValue);



			}
			break;
		default:
			java.util.List<IAttributable> attributables = WidgetFactory.getAttributables("View", w.getLocalName());
			if (attributables != null) {
				for (IAttributable attributable : attributables) {
					attributable.newInstance(w).setAttribute(key, strValue, objValue, decorator);
				}
			}
			break;
		}
	}
	
	@SuppressLint("NewApi")
	public static Object getAttribute(IWidget w, WidgetAttribute key, ILifeCycleDecorator decorator) {
		return getAttribute(w, w.asNativeWidget(), key, decorator);
	}
	
	@SuppressLint("NewApi")
	public static Object getAttribute(IWidget w, Object nativeWidget, WidgetAttribute key, ILifeCycleDecorator decorator) {
		View view = (View) w.asWidget();
		switch (key.getAttributeName()) {
			case "accessibilityHeading": {
if (Build.VERSION.SDK_INT >= 28) {
return view.isAccessibilityHeading();
}
break;			}
			case "accessibilityLiveRegion": {
return ViewCompat.getAccessibilityLiveRegion(view);			}
			case "accessibilityPaneTitle": {
return ViewCompat.getAccessibilityPaneTitle(view);			}
			case "accessibilityTraversalAfter": {
if (Build.VERSION.SDK_INT >= 22) {
return view.getAccessibilityTraversalAfter();
}
break;			}
			case "accessibilityTraversalBefore": {
if (Build.VERSION.SDK_INT >= 22) {
return view.getAccessibilityTraversalBefore();
}
break;			}
			case "alpha": {
if (Build.VERSION.SDK_INT >= 11) {
return view.getAlpha();
}
break;			}
			case "autofillHints": {
if (Build.VERSION.SDK_INT >= 26) {
return view.getAutofillHints();
}
break;			}
			case "backgroundTint": {
return ViewCompat.getBackgroundTintList(view);			}
			case "backgroundTintMode": {
return ViewCompat.getBackgroundTintMode(view);			}
			case "clickable": {
return view.isClickable();			}
			case "contentDescription": {
return view.getContentDescription();			}
			case "contextClickable": {
if (Build.VERSION.SDK_INT >= 23) {
return view.isContextClickable();
}
break;			}
			case "defaultFocusHighlightEnabled": {
if (Build.VERSION.SDK_INT >= 26) {
return view.getDefaultFocusHighlightEnabled();
}
break;			}
			case "duplicateParentState": {
return view.isDuplicateParentStateEnabled();			}
			case "elevation": {
if (Build.VERSION.SDK_INT >= 21) {
return view.getElevation();
}
break;			}
			case "fadeScrollbars": {
return view.isScrollbarFadingEnabled();			}
			case "filterTouchesWhenObscured": {
if (Build.VERSION.SDK_INT >= 9) {
return view.getFilterTouchesWhenObscured();
}
break;			}
			case "fitsSystemWindows": {
return ViewCompat.getFitsSystemWindows(view);			}
			case "focusableInTouchMode": {
return view.isFocusableInTouchMode();			}
			case "focusedByDefault": {
if (Build.VERSION.SDK_INT >= 26) {
return view.isFocusedByDefault();
}
break;			}
			case "foregroundTint": {
if (Build.VERSION.SDK_INT >= 23) {
return view.getForegroundTintList();
}
break;			}
			case "foregroundTintMode": {
if (Build.VERSION.SDK_INT >= 23) {
return view.getForegroundTintMode();
}
break;			}
			case "hapticFeedbackEnabled": {
return view.isHapticFeedbackEnabled();			}
			case "id": {
return view.getId();			}
			case "importantForAccessibility": {
return ViewCompat.getImportantForAccessibility(view);			}
			case "importantForAutofill": {
return ViewCompat.getImportantForAutofill(view);			}
			case "isScrollContainer": {
return view.isScrollContainer();			}
			case "keepScreenOn": {
return view.getKeepScreenOn();			}
			case "keyboardNavigationCluster": {
if (Build.VERSION.SDK_INT >= 26) {
return view.isKeyboardNavigationCluster();
}
break;			}
			case "layoutDirection": {
return ViewCompat.getLayoutDirection(view);			}
			case "longClickable": {
return view.isLongClickable();			}
			case "minHeight": {
if (Build.VERSION.SDK_INT >= 16) {
return view.getMinimumHeight();
}
break;			}
			case "minWidth": {
if (Build.VERSION.SDK_INT >= 16) {
return view.getMinimumWidth();
}
break;			}
			case "nextClusterForward": {
return ViewCompat.getNextClusterForwardId(view);			}
			case "nextFocusDown": {
return view.getNextFocusDownId();			}
			case "nextFocusForward": {
if (Build.VERSION.SDK_INT >= 11) {
return view.getNextFocusForwardId();
}
break;			}
			case "nextFocusLeft": {
return view.getNextFocusLeftId();			}
			case "nextFocusRight": {
return view.getNextFocusRightId();			}
			case "nextFocusUp": {
return view.getNextFocusUpId();			}
			case "rotation": {
if (Build.VERSION.SDK_INT >= 11) {
return view.getRotation();
}
break;			}
			case "rotationX": {
if (Build.VERSION.SDK_INT >= 11) {
return view.getRotationX();
}
break;			}
			case "rotationY": {
if (Build.VERSION.SDK_INT >= 11) {
return view.getRotationY();
}
break;			}
			case "saveEnabled": {
return view.isSaveEnabled();			}
			case "scaleX": {
if (Build.VERSION.SDK_INT >= 11) {
return view.getScaleX();
}
break;			}
			case "scaleY": {
if (Build.VERSION.SDK_INT >= 11) {
return view.getScaleY();
}
break;			}
			case "screenReaderFocusable": {
if (Build.VERSION.SDK_INT >= 28) {
return view.isScreenReaderFocusable();
}
break;			}
			case "scrollIndicators": {
if (Build.VERSION.SDK_INT >= 23) {
return view.getScrollIndicators();
}
break;			}
			case "scrollbarDefaultDelayBeforeFade": {
if (Build.VERSION.SDK_INT >= 16) {
return view.getScrollBarDefaultDelayBeforeFade();
}
break;			}
			case "scrollbarFadeDuration": {
if (Build.VERSION.SDK_INT >= 16) {
return view.getScrollBarFadeDuration();
}
break;			}
			case "scrollbarSize": {
if (Build.VERSION.SDK_INT >= 16) {
return view.getScrollBarSize();
}
break;			}
			case "scrollbarStyle": {
return view.getScrollBarStyle();			}
			case "soundEffectsEnabled": {
return view.isSoundEffectsEnabled();			}
			case "textAlignment": {
if (Build.VERSION.SDK_INT >= 17) {
return view.getTextAlignment();
}
break;			}
			case "textDirection": {
if (Build.VERSION.SDK_INT >= 17) {
return view.getTextDirection();
}
break;			}
			case "tooltipText": {
if (Build.VERSION.SDK_INT >= 26) {
return view.getTooltipText();
}
break;			}
			case "transformPivotX": {
if (Build.VERSION.SDK_INT >= 11) {
return view.getPivotX();
}
break;			}
			case "transformPivotY": {
if (Build.VERSION.SDK_INT >= 11) {
return view.getPivotY();
}
break;			}
			case "transitionName": {
if (Build.VERSION.SDK_INT >= 21) {
return view.getTransitionName();
}
break;			}
			case "translationX": {
if (Build.VERSION.SDK_INT >= 11) {
return view.getTranslationX();
}
break;			}
			case "translationY": {
if (Build.VERSION.SDK_INT >= 11) {
return view.getTranslationY();
}
break;			}
			case "translationZ": {
if (Build.VERSION.SDK_INT >= 21) {
return view.getTranslationZ();
}
break;			}
			case "visibility": {
return view.getVisibility();			}
			case "paddingTop": {
return getPaddingTop(w, view);			}
			case "paddingBottom": {
return getPaddingBottom(w, view);			}
			case "paddingLeft": {
return getPaddingLeft(w, view);			}
			case "paddingRight": {
return getPaddingRight(w, view);			}
			case "paddingStart": {
return getPaddingLeft(w, view);			}
			case "paddingEnd": {
return getPaddingRight(w, view);			}
			case "requiresFadingEdge": {
return getRequiresFadingEdge(w, view);			}
			case "background": {
return view.getBackground();			}
			case "foreground": {
return getForeground(view);			}
			case "modelSyncEvents": {
return getModelSyncEvents(w);			}
			case "modelParam": {
return getModelParam(w);			}
			case "modelPojoToUi": {
return getModelPojoToUi(w);			}
			case "modelUiToPojo": {
return getModelUiToPojo(w);			}
			case "foregroundGravity": {
return getForegroundGravity(w);			}
			case "selected": {
return getSelected(w, view);			}
			case "enabled": {
return view.isEnabled();			}
			case "focusable": {
return view.isFocusable();			}
			case "scrollX": {
return view.getScrollX();			}
			case "scrollY": {
return view.getScrollY();			}
			case "maxWidth": {
return getMaxWidth(w);			}
			case "maxHeight": {
return getMaxHeight(w);			}
			case "validateForm": {
return getValidateFormResult(w);			}
			case "left": {
return getLeft(w);			}
			case "right": {
return getRight(w);			}
			case "top": {
return getTop(w);			}
			case "bottom": {
return getBottom(w);			}
		}
		
		java.util.List<IAttributable> attributables = WidgetFactory.getAttributables("View", w.getLocalName());
		if (attributables != null) {
			for (IAttributable attributable : attributables) {
				Object value = attributable.newInstance(w).getAttribute(key, decorator);
				
				if (value != null) {
					return value;
				}
			}
		}
		return null;
	}
	

	private static void setAnimatorXmlExternal(IWidget w, Object objValue) {
 		String value = (String) objValue;
 		if (value.startsWith("@animator/")) {
 			String html = w.getFragment().getInlineResource(value);
 			if (html == null) {
 				html = PluginInvoker.getFileAsset("res/" + (value).replace("@", "") + ".xml", w.getFragment());
 			}
 			AnimationContentHandler handler = new AnimationContentHandler(w);
			com.ashera.parser.html.HtmlParser.parse(handler, html);
 			android.animation.Animator animator = handler.getAnimatorSet();
 			animator.setTarget((View) w.asWidget());
			w.getFragment().addDisposable(animator); 				
 			w.setAnimator(animator); 		
 		}
	}
	
	public static android.view.animation.Interpolator getInterpolator(IWidget w, Object objValue) {
		String value = (String) objValue;
		String html = w.getFragment().getInlineResource(value);
		if (html == null) {
			html = PluginInvoker.getFileAsset("res/" + (value).replace("@", "") + ".xml", w.getFragment());
		}
		AnimationContentHandler handler = new AnimationContentHandler(w);
		com.ashera.parser.html.HtmlParser.parse(handler, html);
		return handler.timeInterpolator;
	}
	
	private static class AnimationContentHandler extends com.ashera.parser.html.ContentHandlerAdapter {
    private final class CustomTypeConverterX
			extends android.animation.TypeConverter<android.graphics.PointF, Float> {
		private CustomTypeConverterX(Class<android.graphics.PointF> fromClass, Class<Float> toClass) {
			super(fromClass, toClass);
		}

		@Override
		public Float convert(android.graphics.PointF value) {
		    return value.x;
		}
	}
    
    private final class CustomTypeConverterY
			extends android.animation.TypeConverter<android.graphics.PointF, Float> {
		private CustomTypeConverterY(Class<android.graphics.PointF> fromClass, Class<Float> toClass) {
			super(fromClass, toClass);
		}

		@Override
		public Float convert(android.graphics.PointF value) {
		    return value.y;
		}
	}

		private static final int VALUE_TYPE_FLOAT       = 0;
	    private static final int VALUE_TYPE_INT         = 1;
	    private static final int VALUE_TYPE_PATH        = 2;
	    private static final int VALUE_TYPE_COLOR       = 3;
	    private static final int VALUE_TYPE_UNDEFINED   = 4;
		private int valueType = VALUE_TYPE_UNDEFINED;
		
		private static final int TOGETHER = 0;
	    private static final int SEQUENTIALLY = 1;
	    private String valueTo;
	    private String valueFrom;
	    private java.util.Stack<Integer> sequenceOrderings = new java.util.Stack<>();
	    private int sequenceOrdering;
		private final IWidget w;
		private java.util.Stack<ArrayList<android.animation.Animator>> childAnimators = new java.util.Stack<>();
		private java.util.Stack<android.animation.AnimatorSet> animatorSets = new java.util.Stack<>();
		private android.animation.AnimatorSet animatorSet;
		private float arg0;
		private float arg1;
		private float extraTension;
		private float cycles;
		private android.view.animation.Interpolator timeInterpolator;
		private String pathData;
		private String propertyYName;
		private String propertyXName;


		private void setFactor(IWidget w, String value) {
			this.arg0 = (float) w.quickConvert(value, "float");
		}

		private void setTension(IWidget w, String value) {
			this.arg0 = (float) w.quickConvert(value, "float");
		}

		private void setExtraTension(IWidget w, String value) {
			this.arg1 = (float) w.quickConvert(value, "float");
		}

		private void setCycles(IWidget w, String value) {
			this.arg0 = (float) w.quickConvert(value, "float");
		}

		public android.animation.AnimatorSet getAnimatorSet() {
			return animatorSet;
		}

		private AnimationContentHandler(IWidget w) {
			this.w = w;
		}

		@Override
		public void startElement(String uri, String localName, String qName, org.xml.sax.Attributes atts) throws org.xml.sax.SAXException {
			switch (localName) {
				case "set": {
					android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
					if (this.animatorSet == null) {
						this.animatorSet = animatorSet;
					}
					parseAnimatorSet(w, animatorSet, atts);
					animatorSets.push(animatorSet);
					childAnimators.push(new ArrayList<>());
					sequenceOrderings.push(this.sequenceOrdering);
				}
				break;
				
				case "objectAnimator": {
					
					ArrayList<android.animation.Animator> childAnims = childAnimators.peek();
					android.animation.ObjectAnimator objectAnimator = new android.animation.ObjectAnimator();
					parseAnimator(w, objectAnimator, atts);

					if (valueType == VALUE_TYPE_UNDEFINED) {
			            valueType = inferValueTypeFromValues(w, valueFrom, valueTo);
			        }
			        android.animation.PropertyValuesHolder pvh = getPVH(w, valueType, valueFrom, valueTo, "");
			        if (pvh != null) {
			        	objectAnimator.setValues(pvh);
			        }
			        
					parsePropertyAnimator(w, objectAnimator, atts);
					

			        // Path can be involved in an ObjectAnimator in the following 3 ways:
			        // 1) Path morphing: the property to be animated is pathData, and valueFrom and valueTo
			        //    are both of pathType. valueType = pathType needs to be explicitly defined.
			        // 2) A property in X or Y dimension can be animated along a path: the property needs to be
			        //    defined in propertyXName or propertyYName attribute, the path will be defined in the
			        //    pathData attribute. valueFrom and valueTo will not be necessary for this animation.
			        // 3) PathInterpolator can also define a path (in pathData) for its interpolation curve.
			        // Here we are dealing with case 2:
			        if (pathData != null) {
			            setUpPath(objectAnimator);
			        }
			        
					childAnims.add(objectAnimator);
				}
				break;
				
				case "accelerateInterpolator": {
					parseAccelerateInterpolator(w, atts);
					timeInterpolator = new android.view.animation.AccelerateInterpolator(arg0);
				}
				break;
				case "decelerateInterpolator": {
					parseDecelerateInterpolator(w, atts);
					timeInterpolator = new android.view.animation.DecelerateInterpolator(arg0);
				}
				break;
				case "cycleInterpolator": {
					parseCycleInterpolator(w, atts);
					timeInterpolator = new android.view.animation.CycleInterpolator(arg0);
				}
				break;
				case "anticipateInterpolator": {
					parseAnticipateInterpolator(w, atts);
					timeInterpolator = new android.view.animation.AnticipateInterpolator(arg0);
				}
				break;
				case "overshootInterpolator": {
					parseOvershootInterpolator(w, atts);
					timeInterpolator = new android.view.animation.OvershootInterpolator(arg0);
				}
				break;
				case "anticipateOvershootInterpolator": {
					parseAnticipateOvershootInterpolator(w, atts);
					if (arg1 != 0) {
						timeInterpolator = new android.view.animation.AnticipateOvershootInterpolator(arg0 * arg1);
					} else {
						timeInterpolator = new android.view.animation.AnticipateOvershootInterpolator(arg0);
					}
				}
				break;
			}
			
		}

		private void setUpPath(android.animation.ObjectAnimator objectAnimator) {
			if (valueType == VALUE_TYPE_PATH || valueType == VALUE_TYPE_UNDEFINED) {
			    // When pathData is defined, we are in case #2 mentioned above. ValueType can only
			    // be float type, or int type. Otherwise we fallback to default type.
			    valueType = VALUE_TYPE_FLOAT;
			}
			if (propertyXName == null && propertyYName == null) {
			    throw new RuntimeException(" propertyXName or propertyYName is needed for PathData");
			} else {
			    android.graphics.Path path = androidx.core.graphics.PathParser.createPathFromPathData(pathData);
				android.animation.PropertyValuesHolder x = null;
				android.animation.PropertyValuesHolder y = null;
				if (propertyXName != null) {
					x  = android.animation.PropertyValuesHolder.ofObject(new CustomProperty(w.asWidget().getClass(), propertyXName),  new CustomTypeConverterX(android.graphics.PointF.class, Float.class), path);
				}
				if (propertyYName != null) {
					y = android.animation.PropertyValuesHolder.ofObject(new CustomProperty(w.asWidget().getClass(), propertyYName),  new CustomTypeConverterY(android.graphics.PointF.class, Float.class), path);
				}
			    
			    if (x == null) {
			    	objectAnimator.setValues(y);
			    } else if (y == null) {
			    	objectAnimator.setValues(x);
			    } else {
			    	objectAnimator.setValues(x, y);
			    }
			}
		}

		@Override
		public void endElement(String uri, String localName, String qName) throws org.xml.sax.SAXException {
			switch (localName) {
				case "set": {
					ArrayList<android.animation.Animator> childAnims = childAnimators.pop();
					android.animation.AnimatorSet animatorSet = animatorSets.pop();
					int sequenceOrdering = sequenceOrderings.pop();
					if (animatorSet != null && childAnims != null) {
				        android.animation.Animator[] animsArray = new android.animation.Animator[childAnims.size()];
				        int index = 0;
				        for (android.animation.Animator a : childAnims) {
				            animsArray[index++] = a;
				        }
				        if (sequenceOrdering == TOGETHER) {
				        	animatorSet.playTogether(animsArray);
				        } else {
				        	animatorSet.playSequentially(animsArray);
				        }
				    }
				}
				break;
				case "anticipateOvershootInterpolator":
				case "overshootInterpolator":
				case "anticipateInterpolator":
				case "cycleInterpolator":
				case "decelerateInterpolator":
				case "accelerateInterpolator": {
					arg0 = 0;
					arg1 = 0;
				}
				break;
			}
		}

		@Override
		public void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException {
		}

		private void setStartOffset(IWidget w, android.animation.ValueAnimator animator, String value) {
			animator.setStartDelay((int) w.quickConvert(value, "int"));
		}

		private void setValueType(IWidget w, android.animation.ValueAnimator animator, String value) {
			this.valueType = getValueType(value);

		}

		private void setValueTo(IWidget w, android.animation.ValueAnimator animator, String value) {
			this.valueTo = value;

		}

		private void setValueFrom(IWidget w, android.animation.ValueAnimator animator, String value) {
			this.valueFrom = value;

		}

		private void setInterpolator(IWidget w, android.animation.ValueAnimator animator, String value) {
 			String html = w.getFragment().getInlineResource(value);
 			if (html == null) {
 				html = PluginInvoker.getFileAsset("res/" + (value).replace("@", "") + ".xml", w.getFragment());
 			}
 			timeInterpolator = null;
			com.ashera.parser.html.HtmlParser.parse(this, html);
			animator.setInterpolator(timeInterpolator);
		}

		private void setPathData(IWidget w, android.animation.ObjectAnimator animator, String value) {
			this.pathData = value;
		}

		private void setPropertyYName(IWidget w, android.animation.ObjectAnimator animator, String value) {
			this.propertyYName = value;
		}

		private void setPropertyXName(IWidget w, android.animation.ObjectAnimator animator, String value) {
			this.propertyXName = value;
		}

		private void setOrdering(IWidget w, android.animation.AnimatorSet animatorSet, String value) {
			sequenceOrdering = getOrdering(value);
		}

		private static int inferValueTypeFromValues(IWidget w, String valueFromId, String valueToId) {
			boolean hasFrom = (valueFromId != null);
			boolean hasTo = (valueToId != null);

			int valueType;
			// Check whether it's color type. If not, fall back to default type (i.e. float
			// type)
			if ((hasFrom && isColor(valueFromId)) || (hasTo && isColor(valueToId))) {
				valueType = VALUE_TYPE_COLOR;
			} else {
				valueType = VALUE_TYPE_FLOAT;
			}
			return valueType;
		}

		private static android.animation.PropertyValuesHolder getPVH(IWidget w, int valueType, String valueFromId,
				String valueToId, String propertyName) {

			boolean hasFrom = (valueFromId != null);
			boolean hasTo = (valueToId != null);

			if (valueType == VALUE_TYPE_UNDEFINED) {
				// Check whether it's color type. If not, fall back to default type (i.e. float
				// type)
				if ((hasFrom && isColor(valueFromId)) || (hasTo && isColor(valueToId))) {
					valueType = VALUE_TYPE_COLOR;
				} else {
					valueType = VALUE_TYPE_FLOAT;
				}
			}

			boolean getFloats = (valueType == VALUE_TYPE_FLOAT);

			android.animation.PropertyValuesHolder returnValue = null;

			if (valueType == VALUE_TYPE_PATH) {

			} else {
				android.animation.TypeEvaluator evaluator = null;
				// Integer and float value types are handled here.
				if (valueType == VALUE_TYPE_COLOR) {
					// special case for colors: ignore valueType and get ints
					evaluator = new android.animation.ArgbEvaluator();
				}
				if (getFloats) {
					float valueFrom;
					float valueTo;
					if (hasFrom) {
						if (isDimen(valueFromId)) {
							valueFrom = (float) w.quickConvert(valueFromId, "dimensionfloat");
						} else {
							valueFrom = (float) w.quickConvert(valueFromId, "float");
						}
						if (hasTo) {
							if (isDimen(valueToId)) {
								valueTo = (float) w.quickConvert(valueToId, "dimensionfloat");
							} else {
								valueTo = (float) w.quickConvert(valueToId, "float");
							}
							returnValue = android.animation.PropertyValuesHolder.ofFloat(propertyName, valueFrom,
									valueTo);
						} else {
							returnValue = android.animation.PropertyValuesHolder.ofFloat(propertyName, valueFrom);
						}
					} else {
						if (isDimen(valueToId)) {
							valueTo = (float) w.quickConvert(valueToId, "dimensionfloat");
						} else {
							valueTo = (float) w.quickConvert(valueToId, "float");
						}
						returnValue = android.animation.PropertyValuesHolder.ofFloat(propertyName, valueTo);
					}
				} else {
					int valueFrom;
					int valueTo;
					if (hasFrom) {
						if (isDimen(valueFromId)) {
							valueFrom = (int) w.quickConvert(valueFromId, "dimension");
						} else if (isColor(valueFromId)) {
							valueFrom = android.graphics.Color.parseColor(valueFromId);
						} else {
							valueFrom = (int) w.quickConvert(valueFromId, "int");
						}
						if (hasTo) {
							if (isDimen(valueToId)) {
								valueTo = (int) w.quickConvert(valueToId, "dimension");
							} else if (isColor(valueToId)) {
								valueTo = android.graphics.Color.parseColor(valueToId);
							} else {
								valueTo = (int) w.quickConvert(valueToId, "int");
							}
							returnValue = android.animation.PropertyValuesHolder.ofInt(propertyName, valueFrom,
									valueTo);
						} else {
							returnValue = android.animation.PropertyValuesHolder.ofInt(propertyName, valueFrom);
						}
					} else {
						if (hasTo) {
							if (isDimen(valueToId)) {
								valueTo = (int) w.quickConvert(valueToId, "dimension");
							} else if (isColor(valueToId)) {
								valueTo = android.graphics.Color.parseColor(valueToId);
							} else {
								valueTo = (int) w.quickConvert(valueToId, "int");
							}
							returnValue = android.animation.PropertyValuesHolder.ofInt(propertyName, valueTo);
						}
					}
				}
				if (returnValue != null && evaluator != null) {
					returnValue.setEvaluator(evaluator);
				}
			}

			return returnValue;
		}

		private static boolean isColor(String val) {
			return val.startsWith("#") || val.startsWith("@color/");
		}

		private static boolean isDimen(String val) {
			return val.endsWith("dp") || val.endsWith("sp");
		}

//start - Animator
private void parseAnimator(IWidget w,  android.animation.ValueAnimator animator,  org.xml.sax.Attributes atts) {
for (int i = 0; i < atts.getLength(); i++) {
					String name = atts.getLocalName(i);
					String value = ViewImpl.getValue(name, atts);
					switch (atts.getLocalName(i)) {
case "interpolator":
setInterpolator(w, animator, value);
break;
case "duration":
setDuration(w, animator, value);
break;
case "startOffset":
setStartOffset(w, animator, value);
break;
case "repeatCount":
setRepeatCount(w, animator, value);
break;
case "repeatMode":
setRepeatMode(w, animator, value);
break;
case "valueFrom":
setValueFrom(w, animator, value);
break;
case "valueTo":
setValueTo(w, animator, value);
break;
case "valueType":
setValueType(w, animator, value);
break;}
}
}

private void setDuration(IWidget w,  android.animation.ValueAnimator animator, String strValue) {
animator.setDuration((int) w.quickConvert(strValue, "int"));
}

private int getRepeatCount(String value, IWidget w) {
	switch (value) {
case "infinite":
		return -1;
default:
		break;
}
	return (int) w.quickConvert(value, "int");
}

private void setRepeatCount(IWidget w,  android.animation.ValueAnimator animator, String strValue) {
animator.setRepeatCount(getRepeatCount(strValue, w));
}

private int getRepeatMode(String value) {
	switch (value) {
case "restart":
		return 1;
case "reverse":
		return 2;
default:
		break;
}
	return 0;
}

private void setRepeatMode(IWidget w,  android.animation.ValueAnimator animator, String strValue) {
animator.setRepeatMode(getRepeatMode(strValue));
}

private int getValueType(String value) {
	switch (value) {
case "floatType":
		return 0;
case "intType":
		return 1;
case "pathType":
		return 2;
case "colorType":
		return 3;
default:
		break;
}
	return 0;
}

//end - Animator	
	
//start - PropertyAnimator
private void parsePropertyAnimator(IWidget w,  android.animation.ObjectAnimator animator,  org.xml.sax.Attributes atts) {
for (int i = 0; i < atts.getLength(); i++) {
					String name = atts.getLocalName(i);
					String value = ViewImpl.getValue(name, atts);
					switch (atts.getLocalName(i)) {
case "propertyName":
setPropertyName(w, animator, value);
break;
case "propertyXName":
setPropertyXName(w, animator, value);
break;
case "propertyYName":
setPropertyYName(w, animator, value);
break;
case "pathData":
setPathData(w, animator, value);
break;}
}
}

private void setPropertyName(IWidget w,  android.animation.ObjectAnimator animator, String strValue) {
animator.setPropertyName((String) w.quickConvert(strValue, "resourcestring"));
}

//end - PropertyAnimator


	//start - AnimatorSet
private void parseAnimatorSet(IWidget w,  android.animation.AnimatorSet animatorSet,  org.xml.sax.Attributes atts) {
for (int i = 0; i < atts.getLength(); i++) {
					String name = atts.getLocalName(i);
					String value = ViewImpl.getValue(name, atts);
					switch (atts.getLocalName(i)) {
case "ordering":
setOrdering(w, animatorSet, value);
break;}
}
}

private int getOrdering(String value) {
	switch (value) {
case "together":
		return 0;
case "sequentially":
		return 1;
default:
		break;
}
	return 0;
}

//end - AnimatorSet
//start - AccelerateInterpolator
private void parseAccelerateInterpolator(IWidget w,  org.xml.sax.Attributes atts) {
for (int i = 0; i < atts.getLength(); i++) {
					String name = atts.getLocalName(i);
					String value = ViewImpl.getValue(name, atts);
					switch (atts.getLocalName(i)) {
case "factor":
setFactor(w, value);
break;}
}
}

//end - AccelerateInterpolator
//start - DecelerateInterpolator
private void parseDecelerateInterpolator(IWidget w,  org.xml.sax.Attributes atts) {
for (int i = 0; i < atts.getLength(); i++) {
					String name = atts.getLocalName(i);
					String value = ViewImpl.getValue(name, atts);
					switch (atts.getLocalName(i)) {
case "factor":
setFactor(w, value);
break;}
}
}

//end - DecelerateInterpolator

//start - CycleInterpolator
private void parseCycleInterpolator(IWidget w,  org.xml.sax.Attributes atts) {
for (int i = 0; i < atts.getLength(); i++) {
					String name = atts.getLocalName(i);
					String value = ViewImpl.getValue(name, atts);
					switch (atts.getLocalName(i)) {
case "cycles":
setCycles(w, value);
break;}
}
}

//end - CycleInterpolator

//start - AnticipateInterpolator
private void parseAnticipateInterpolator(IWidget w,  org.xml.sax.Attributes atts) {
for (int i = 0; i < atts.getLength(); i++) {
					String name = atts.getLocalName(i);
					String value = ViewImpl.getValue(name, atts);
					switch (atts.getLocalName(i)) {
case "tension":
setTension(w, value);
break;}
}
}

//end - AnticipateInterpolator

//start - OvershootInterpolator
private void parseOvershootInterpolator(IWidget w,  org.xml.sax.Attributes atts) {
for (int i = 0; i < atts.getLength(); i++) {
					String name = atts.getLocalName(i);
					String value = ViewImpl.getValue(name, atts);
					switch (atts.getLocalName(i)) {
case "tension":
setTension(w, value);
break;}
}
}

//end - OvershootInterpolator


//start - AnticipateOvershootInterpolator
private void parseAnticipateOvershootInterpolator(IWidget w,  org.xml.sax.Attributes atts) {
for (int i = 0; i < atts.getLength(); i++) {
					String name = atts.getLocalName(i);
					String value = ViewImpl.getValue(name, atts);
					switch (atts.getLocalName(i)) {
case "tension":
setTension(w, value);
break;
case "extraTension":
setExtraTension(w, value);
break;}
}
}

//end - AnticipateOvershootInterpolator

	}
	

	@SuppressLint("NewApi")
private static class OnApplyWindowInsetsListener implements View.OnApplyWindowInsetsListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnApplyWindowInsetsListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnApplyWindowInsetsListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public WindowInsets onApplyWindowInsets (View v, 
                WindowInsets insets){
    WindowInsets result = insets;
    
	if (action == null || action.equals("onApplyWindowInsets")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onApplyWindowInsets");
	    java.util.Map<String, Object> obj = getOnApplyWindowInsetsEventObj(v,insets);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 Object commandResult = EventCommandFactory.getCommand(commandName).executeCommand(w, obj, v,insets);
		    	 if (commandResult != null) {
		    		 result = (WindowInsets) commandResult;
		    	 }
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return result;
}//#####

public java.util.Map<String, Object> getOnApplyWindowInsetsEventObj(View v,WindowInsets insets) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "applywindowinsets");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onApplyWindowInsets", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnCapturedPointerListener implements View.OnCapturedPointerListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnCapturedPointerListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnCapturedPointerListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public boolean onCapturedPointer (View view, 
                MotionEvent event){
    boolean result = true;
    
	if (action == null || action.equals("onCapturedPointer")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onCapturedPointer");
	    java.util.Map<String, Object> obj = getOnCapturedPointerEventObj(view,event);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 Object commandResult = EventCommandFactory.getCommand(commandName).executeCommand(w, obj, view,event);
		    	 if (commandResult != null) {
		    		 result = (boolean) commandResult;
		    	 }
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return result;
}//#####

public java.util.Map<String, Object> getOnCapturedPointerEventObj(View view,MotionEvent event) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "capturedpointer");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        ViewImpl.addEventInfo(obj, event);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onCapturedPointer", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnClickListener implements View.OnClickListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnClickListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnClickListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onClick (View v){
    
	if (action == null || action.equals("onClick")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onClick");
	    java.util.Map<String, Object> obj = getOnClickEventObj(v);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, v);
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return;
}//#####

public java.util.Map<String, Object> getOnClickEventObj(View v) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "click");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onClick", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnContextClickListener implements View.OnContextClickListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnContextClickListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnContextClickListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public boolean onContextClick (View v){
    boolean result = true;
    
	if (action == null || action.equals("onContextClick")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onContextClick");
	    java.util.Map<String, Object> obj = getOnContextClickEventObj(v);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 Object commandResult = EventCommandFactory.getCommand(commandName).executeCommand(w, obj, v);
		    	 if (commandResult != null) {
		    		 result = (boolean) commandResult;
		    	 }
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return result;
}//#####

public java.util.Map<String, Object> getOnContextClickEventObj(View v) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "contextclick");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onContextClick", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnCreateContextMenuListener implements View.OnCreateContextMenuListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnCreateContextMenuListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnCreateContextMenuListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onCreateContextMenu (ContextMenu menu, 
                View v, 
                ContextMenu.ContextMenuInfo menuInfo){
    
	if (action == null || action.equals("onCreateContextMenu")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onCreateContextMenu");
	    java.util.Map<String, Object> obj = getOnCreateContextMenuEventObj(menu,v,menuInfo);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, menu,v,menuInfo);
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return;
}//#####

public java.util.Map<String, Object> getOnCreateContextMenuEventObj(ContextMenu menu,View v,ContextMenu.ContextMenuInfo menuInfo) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "createcontextmenu");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onCreateContextMenu", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnDragListener implements View.OnDragListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnDragListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnDragListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public boolean onDrag (View v, 
                DragEvent event){
    boolean result = true;
    
	if (action == null || action.equals("onDrag")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onDrag");
	    java.util.Map<String, Object> obj = getOnDragEventObj(v,event);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 Object commandResult = EventCommandFactory.getCommand(commandName).executeCommand(w, obj, v,event);
		    	 if (commandResult != null) {
		    		 result = (boolean) commandResult;
		    	 }
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return result;
}//#####

public java.util.Map<String, Object> getOnDragEventObj(View v,DragEvent event) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "drag");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        ViewImpl.addEventInfo(obj, event);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onDrag", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnFocusChangeListener implements View.OnFocusChangeListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnFocusChangeListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnFocusChangeListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onFocusChange (View v, 
                boolean hasFocus){
    
	if (action == null || action.equals("onFocusChange")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onFocusChange");
	    java.util.Map<String, Object> obj = getOnFocusChangeEventObj(v,hasFocus);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, v,hasFocus);
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return;
}//#####

public java.util.Map<String, Object> getOnFocusChangeEventObj(View v,boolean hasFocus) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "focuschange");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "hasFocus", hasFocus);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onFocusChange", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnGenericMotionListener implements View.OnGenericMotionListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnGenericMotionListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnGenericMotionListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public boolean onGenericMotion (View v, 
                MotionEvent event){
    boolean result = true;
    
	if (action == null || action.equals("onGenericMotion")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onGenericMotion");
	    java.util.Map<String, Object> obj = getOnGenericMotionEventObj(v,event);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 Object commandResult = EventCommandFactory.getCommand(commandName).executeCommand(w, obj, v,event);
		    	 if (commandResult != null) {
		    		 result = (boolean) commandResult;
		    	 }
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return result;
}//#####

public java.util.Map<String, Object> getOnGenericMotionEventObj(View v,MotionEvent event) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "genericmotion");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        ViewImpl.addEventInfo(obj, event);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onGenericMotion", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnHoverListener implements View.OnHoverListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnHoverListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnHoverListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public boolean onHover (View v, 
                MotionEvent event){
    boolean result = true;
    
	if (action == null || action.equals("onHover")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onHover");
	    java.util.Map<String, Object> obj = getOnHoverEventObj(v,event);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 Object commandResult = EventCommandFactory.getCommand(commandName).executeCommand(w, obj, v,event);
		    	 if (commandResult != null) {
		    		 result = (boolean) commandResult;
		    	 }
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return result;
}//#####

public java.util.Map<String, Object> getOnHoverEventObj(View v,MotionEvent event) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "hover");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        ViewImpl.addEventInfo(obj, event);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onHover", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnKeyListener implements View.OnKeyListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnKeyListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnKeyListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public boolean onKey (View v, 
                int keyCode, 
                KeyEvent event){
    boolean result = true;
    
	if (action == null || action.equals("onKey")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onKey");
	    java.util.Map<String, Object> obj = getOnKeyEventObj(v,keyCode,event);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 Object commandResult = EventCommandFactory.getCommand(commandName).executeCommand(w, obj, v,keyCode,event);
		    	 if (commandResult != null) {
		    		 result = (boolean) commandResult;
		    	 }
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return result;
}//#####

public java.util.Map<String, Object> getOnKeyEventObj(View v,int keyCode,KeyEvent event) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "key");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "keyCode", keyCode);
        ViewImpl.addEventInfo(obj, event);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onKey", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnLongClickListener implements View.OnLongClickListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnLongClickListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnLongClickListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public boolean onLongClick (View v){
    boolean result = true;
    
	if (action == null || action.equals("onLongClick")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onLongClick");
	    java.util.Map<String, Object> obj = getOnLongClickEventObj(v);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 Object commandResult = EventCommandFactory.getCommand(commandName).executeCommand(w, obj, v);
		    	 if (commandResult != null) {
		    		 result = (boolean) commandResult;
		    	 }
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return result;
}//#####

public java.util.Map<String, Object> getOnLongClickEventObj(View v) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "longclick");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onLongClick", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnScrollChangeListener implements View.OnScrollChangeListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnScrollChangeListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnScrollChangeListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onScrollChange (View v, 
                int scrollX, 
                int scrollY, 
                int oldScrollX, 
                int oldScrollY){
    
	if (action == null || action.equals("onScrollChange")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onScrollChange");
	    java.util.Map<String, Object> obj = getOnScrollChangeEventObj(v,scrollX,scrollY,oldScrollX,oldScrollY);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, v,scrollX,scrollY,oldScrollX,oldScrollY);
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return;
}//#####

public java.util.Map<String, Object> getOnScrollChangeEventObj(View v,int scrollX,int scrollY,int oldScrollX,int oldScrollY) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "scrollchange");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "scrollX", scrollX);
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "scrollY", scrollY);
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "oldScrollX", oldScrollX);
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "oldScrollY", oldScrollY);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onScrollChange", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnSystemUiVisibilityChangeListener implements View.OnSystemUiVisibilityChangeListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnSystemUiVisibilityChangeListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnSystemUiVisibilityChangeListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onSystemUiVisibilityChange (int visibility){
    
	if (action == null || action.equals("onSystemUiVisibilityChange")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onSystemUiVisibilityChange");
	    java.util.Map<String, Object> obj = getOnSystemUiVisibilityChangeEventObj(visibility);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, visibility);
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return;
}//#####

public java.util.Map<String, Object> getOnSystemUiVisibilityChangeEventObj(int visibility) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "systemuivisibilitychange");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "visibility", visibility);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onSystemUiVisibilityChange", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnTouchListener implements View.OnTouchListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnTouchListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnTouchListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public boolean onTouch (View v, 
                MotionEvent event){
    boolean result = true;
    
	if (action == null || action.equals("onTouch")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onTouch");
	    java.util.Map<String, Object> obj = getOnTouchEventObj(v,event);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 Object commandResult = EventCommandFactory.getCommand(commandName).executeCommand(w, obj, v,event);
		    	 if (commandResult != null) {
		    		 result = (boolean) commandResult;
		    	 }
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return result;
}//#####

public java.util.Map<String, Object> getOnTouchEventObj(View v,MotionEvent event) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "touch");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        ViewImpl.addEventInfo(obj, event);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onTouch", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class SwipeListener implements SwipeHelper.SwipeListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public SwipeListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public SwipeListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public boolean onSwiped(String direction){
    boolean result = true;
    
	if (action == null || action.equals("onSwiped")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onSwiped");
	    java.util.Map<String, Object> obj = getOnSwipedEventObj(direction);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 Object commandResult = EventCommandFactory.getCommand(commandName).executeCommand(w, obj, direction);
		    	 if (commandResult != null) {
		    		 result = (boolean) commandResult;
		    	 }
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return result;
}//#####

public java.util.Map<String, Object> getOnSwipedEventObj(String direction) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "swiped");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
        PluginInvoker.putJSONSafeObjectIntoMap(obj, "direction", direction);
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onSwiped", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class AnimatorListener implements Animator.AnimatorListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public AnimatorListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public AnimatorListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onAnimationStart(android.animation.Animator animation){
    
	if (action == null || action.equals("onAnimationStart")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onAnimationStart");
	    java.util.Map<String, Object> obj = getOnAnimationStartEventObj(animation);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, animation);
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return;
}//#####

public java.util.Map<String, Object> getOnAnimationStartEventObj(android.animation.Animator animation) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "animationstart");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onAnimationStart", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}public void onAnimationEnd(android.animation.Animator animation){
    
	if (action == null || action.equals("onAnimationEnd")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onAnimationEnd");
	    java.util.Map<String, Object> obj = getOnAnimationEndEventObj(animation);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, animation);
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return;
}//#####

public java.util.Map<String, Object> getOnAnimationEndEventObj(android.animation.Animator animation) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "animationend");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onAnimationEnd", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}public void onAnimationCancel(android.animation.Animator animation){
    
	if (action == null || action.equals("onAnimationCancel")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onAnimationCancel");
	    java.util.Map<String, Object> obj = getOnAnimationCancelEventObj(animation);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, animation);
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return;
}//#####

public java.util.Map<String, Object> getOnAnimationCancelEventObj(android.animation.Animator animation) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "animationcancel");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onAnimationCancel", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}public void onAnimationRepeat(android.animation.Animator animation){
    
	if (action == null || action.equals("onAnimationRepeat")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onAnimationRepeat");
	    java.util.Map<String, Object> obj = getOnAnimationRepeatEventObj(animation);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, animation);
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return;
}//#####

public java.util.Map<String, Object> getOnAnimationRepeatEventObj(android.animation.Animator animation) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "animationrepeat");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onAnimationRepeat", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}


	// end - body
	@SuppressLint("NewApi")
	public static boolean isRTLLayout(IWidget widget) {
		View view = (View) widget.asWidget();
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
			return view.getResources().getConfiguration().getLayoutDirection() == View.LAYOUT_DIRECTION_RTL;
		} else {
			return false;
		}
	}

	public static void nativeMakeFrame(Object asNativeWidget, int l, int t,
			int r, int b) {
		
	}

	private static void setBackground(IWidget widget, String strValue, Object objValue, View view) {
		view.setBackground((android.graphics.drawable.Drawable) objValue);
	}
	
	private static void setForeground(IWidget widget, String strValue, Object objValue, View view) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
			view.setForeground((android.graphics.drawable.Drawable) objValue);
		}
	}
	
	@SuppressLint("NewApi")
	private static void setLayerType(Object objValue, View view) {
		if (Build.VERSION.SDK_INT >= 11) {
			view.setLayerType((int) objValue, null);
		}
		
	}
	
	
	private static void setRequiresFadingEdge(Object objValue, View view) {
		int value = (int) objValue;
		view.setHorizontalFadingEdgeEnabled((value & 0x1000) == 0x1000);
		view.setVerticalFadingEdgeEnabled((value & 0x2000) == 0x2000);
	}

	private static Object getRequiresFadingEdge(IWidget w, View view) {
		int requiresFadingEdge = 0;
		if (view.isHorizontalFadingEdgeEnabled()) {
			requiresFadingEdge |= 0x1000;
		}
		if (view.isVerticalFadingEdgeEnabled()) {
			requiresFadingEdge |= 0x2000;
		}
		return requiresFadingEdge;
	}
	
	//start - viewcode

	public static void setPadding(Object objValue, View view) {
		int value = (int) objValue;
		ViewCompat.setPaddingRelative(view, value,value,value,value);
	}
	
	public static void setPaddingLeft(Object objValue, View view) {
		int value = (int) objValue;
		ViewCompat.setPaddingRelative(view, value,view.getPaddingTop(), ViewCompat.getPaddingEnd(view),view.getPaddingBottom());
	}
	
	public static void setPaddingRight(Object objValue, View view) {
		int value = (int) objValue;
		ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view),view.getPaddingTop(), value,view.getPaddingBottom());
	}
	
	public static void setPaddingTop(Object objValue, View view) {
		int value = (int) objValue;
		ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view),value, ViewCompat.getPaddingEnd(view),view.getPaddingBottom());
	}
	
	public static void setPaddingBottom(Object objValue, View view) {
		int value = (int) objValue;
		ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view),view.getPaddingTop(), ViewCompat.getPaddingEnd(view), value);
	}
	
	public static Object getPaddingTop(IWidget w, View view) {
		return view.getPaddingTop();
	}
	
	public static Object getPaddingBottom(IWidget w, View view) {
		return view.getPaddingBottom();
	}
	
	public static Object getPaddingLeft(IWidget w, View view) {
		return ViewCompat.getPaddingStart(view);
	}
	
	public static Object getPaddingRight(IWidget w, View view) {
		return ViewCompat.getPaddingEnd(view);
	}

	
	public static void setPaddingHorizontal(Object objValue, View view) {
		int value = (int) objValue;
		ViewCompat.setPaddingRelative(view, value,view.getPaddingTop(), value,view.getPaddingBottom());
	}
	
	public static void setPaddingVertical(Object objValue, View view) {
		int value = (int) objValue;
		ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view),value, ViewCompat.getPaddingEnd(view), value);
	}

	//start - nopadding
	public static void setId(IWidget w, String strValue, Object objValue, View view) {
        view.setId((int)objValue);
        w.setId(strValue);
        setNativeId(w, strValue);
	}
	
	private static Object getModelSyncEvents(IWidget w) {
		return w.getModelSyncEvents();
	}
	
	private static void setModelSyncEvents(IWidget w, String strValue, Object objValue, View view) {
		w.setModelSyncEvents((String) objValue);
	}

	private static void setModelParam(IWidget w, String strValue, Object objValue, View view) {
		w.setModelParam((String) objValue);
	}
	
	
	private static void setModelPojoToUi(IWidget w, String strValue, Object objValue, View view) {
		w.setModelPojoToUi((String) objValue);
	}
	
	
	private static void setModelUiToPojo(IWidget w, String strValue, Object objValue, View view) {
		w.setModelUiToPojo((String) objValue);
	}

	   
    private static void notifyDataSetChanged(IWidget w, Object objValue) {
        if (PluginInvoker.getBoolean(objValue)) {
            w.notifyDataSetChanged();
        }
    }

    private static void updateModelData(IWidget w, Object expression, Object payload) {
    	w.updateModelData((String) expression, payload);
    }
    
    
    
    private static Object getModelUiToPojo(IWidget w) {
        return w.getModelUiToPojo();
    }

    private static Object getModelPojoToUi(IWidget w) {
        return w.getModelPojoToUi();
    }

    private static Object getModelParam(IWidget w) {
        return w.getModelParam();
    }
    
	
	private static void setModelPojoToUiParams(IWidget w, Object objValue) {
		w.setModelPojoToUiParams((String) objValue);
	}
	
	public static void refreshUiFromModel(IWidget w, Object objValue) {
		refreshUiFromModel(w, objValue, false);
	}
	public static void refreshUiFromModel(IWidget w, Object objValue, boolean remeasure) {
		if (w.isInitialised() && objValue != null) {
			String[] ids = ((String) objValue).split(",");
			
			for (String id : ids) {
				if (id.contains("#")) {
					String componentId = id.substring(0, id.lastIndexOf("#"));
					String myId = id.substring(id.lastIndexOf("#") + 1);
					id = componentId + "#@+id/" + myId;
				} else {
					id = "@+id/" + id;
				}
				IWidget widget = w.findNearestView(id);
				if (widget != null) {
					widget.applyModelToWidget();
				}
			}
			
			if (remeasure) {
				w.getFragment().remeasure();
			}
		}
	}
	
	private static void setModelUiToPojoEventIds(IWidget w, Object objValue) {
		w.setModelUiToPojoEventIds((String) objValue);
	}
	
    //end - nopadding
    
	private static void setZIndex(IWidget w, Object objValue) {
		w.setZIndex((int) objValue);
		
		HasWidgets parent = w.getParent();
		if (parent != null) {
			java.util.List<IWidget> widgets = parent.getWidgets();
			Collections.sort(widgets,  new Comparator<IWidget>() {
				@Override
				public int compare(IWidget arg0, IWidget arg1) {
					return arg0.getZIndex() - arg1.getZIndex();
				}
			});
		
			nativeBringToFront(widgets);
		}
	}


	
	public static void setMaxHeight(IWidget w, Object objValue) {
		Object view = w.asWidget();
		
		if (view instanceof IMaxDimension) {
			((IMaxDimension) view).setMaxHeight((int) objValue);
		}
	}

	public static void setMaxWidth(IWidget w, Object objValue) {
		Object view = w.asWidget();
		
		if (view instanceof IMaxDimension) {
			((IMaxDimension) view).setMaxWidth((int) objValue);
		}
	}
	
	
	public static Object getMaxWidth(IWidget w) {
		Object view = w.asWidget();
		
		if (view instanceof IMaxDimension) {
			return ((IMaxDimension) view).getMaxWidth();
		}
		return null;
	}

	public static Object getMaxHeight(IWidget w) {
		Object view = w.asWidget();
		
		if (view instanceof IMaxDimension) {
			return ((IMaxDimension) view).getMaxHeight();
		}
		return null;
	}
	
	private static void setSelected(Object objValue, View view) {
		view.setSelected((boolean) (objValue));
	}
	
	
	
	private static Object getSelected(IWidget w, View view) {
		return view.isSelected();
	}
	
	
	private static void setInvalidateOnFrameChange(IWidget w, Object objValue) {
		w.setInvalidateOnFrameChange((boolean) objValue);
	}

	//end - viewcode

    public static void nativeMakeFrame(Object asNativeWidget, int l, int t, int r, int b, int i) {
    }

	public static void nativeMakeFrameForHorizontalScrollView(Object asNativeWidget, int l, int t, int r, int b,
			int i) {
	}
	
	@SuppressLint("NewApi")
	private static void setScrollY(IWidget w, final View view, final Object objValue) {
		view.setScrollY((int) objValue); 
	}

	@SuppressLint("NewApi")
	private static void setScrollX(IWidget w, final View view, final Object objValue) {
		view.setScrollX((int) objValue); 
	}

	public static void registerCommandConveter(IWidget widget) {
		widget.registerForAttributeCommandChain("background", "foreground");
	}
	
	//start - capinsets 
	private static void setBackgroundRepeat(IWidget w, String strValue, Object objValue, View view) {
		w.applyAttributeCommand("background", "imageRepeat", new String[] {"backgroundRepeat"}, true, strValue);
	}
	
	private static void setForegroundRepeat(IWidget w, String strValue, Object objValue, View view) {
		w.applyAttributeCommand("foreground", "imageRepeat", new String[] {"foregroundRepeat"}, true, strValue);
	}
	//end - capinsets 


	private static boolean isRTLayoutCapInsets(IWidget w) {
		return isRTLLayout(w);
	}
	
	private static void invalidate(IWidget w) {
		w.invalidate();
	}
	
	public static void invalidate(IWidget w, Object view) {
		((View) view).invalidate();
	}
	
	private static void requestLayout(IWidget w) {
		if (w.isInitialised() ) {
			w.requestLayout();
		}
	}
	
	public static void requestLayout(IWidget w, Object nativeWidget) {
		((View) w.asWidget()).requestLayout();
	}

	public static void setLayoutDirection(IWidget w, int layoutDirection) {
		ViewCompat.setLayoutDirection(((View) w.asNativeWidget()), layoutDirection);
	}
	
	public static void startDrag(IWidget w, String text) {
		android.content.ClipData.Item item = new android.content.ClipData.Item(text);

		// Create a new ClipData using the tag as a label, the plain text MIME type, and
		// the already-created item. This will create a new ClipDescription object within the
		// ClipData, and set its MIME type entry to "text/plain"
		android.content.ClipData dragData = new android.content.ClipData(
			text,
		    new String[] { android.content.ClipDescription.MIMETYPE_TEXT_PLAIN },
		    item);

		// Instantiates the drag shadow builder.
		View v = (View) w.asWidget();
		View.DragShadowBuilder myShadow = new View.DragShadowBuilder(v);

		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
			v.startDragAndDrop(dragData,  // the data to be dragged
						myShadow,  // the drag shadow builder
						null,      // no need to use local data
						0          // flags (not currently used, set to 0)
			);
		} else {
			v.startDrag(dragData,  // the data to be dragged
					myShadow,  // the drag shadow builder
					null,      // no need to use local data
					0          // flags (not currently used, set to 0)
			);
		}
	}
	
	//start - eventInfo
	public static void addEventInfo(Map<String, Object> obj, MotionEvent event) {
		Map<String, Object> eventInfo = PluginInvoker.getJSONCompatMap();
		eventInfo.put("action", event.getAction());
		eventInfo.put("rawX", event.getRawX());
		eventInfo.put("rawY", event.getRawY());
		eventInfo.put("x", event.getX());
		eventInfo.put("y", event.getY());
		obj.put("eventInfo", PluginInvoker.getNativeMap(eventInfo));
	}
	
	public static void addEventInfo(Map<String, Object> obj, KeyEvent event) {
		Map<String, Object> eventInfo = PluginInvoker.getJSONCompatMap();
		if (event != null) {
			eventInfo.put("action", event.getAction());
			eventInfo.put("keyCode", event.getKeyCode());
		}
		obj.put("eventInfo", PluginInvoker.getNativeMap(eventInfo));
	}
	
	public static void addEventInfo(Map<String, Object> obj, DragEvent event) {
		Map<String, Object> eventInfo = PluginInvoker.getJSONCompatMap();
		eventInfo.put("action", event.getAction());
		eventInfo.put("x", event.getX());
		eventInfo.put("y", event.getY());
		
		PluginInvoker.putJSONSafeObjectIntoMap(eventInfo, "clipData", getClipData(event));
		obj.put("eventInfo", PluginInvoker.getNativeMap(eventInfo));
	}
	public static void addEventInfo(Map<String, Object> obj, android.widget.Chronometer chronometer, com.ashera.core.IFragment fragment) {
		obj.put("text", chronometer.getText());
	}
	public static void addEventInfo(Map<String, Object> obj, java.util.List<Integer> checkedIds, com.ashera.core.IFragment fragment) {
		java.util.List<Object> ids = new java.util.ArrayList<>();
		for (int id : checkedIds) {
			ids.add(fragment.getRootWidget().quickConvertBack(id, "id"));	
		}
		
		obj.put("checkedIds", PluginInvoker.getJSONSafeObj(ids));
	}
	//end - eventInfo

	
	private static String getClipData(DragEvent event) {
		if (event.getClipData() != null && event.getClipData().getDescription() != null) {
			return event.getClipData().getDescription().getLabel().toString();
		}
		return null;
	}

	private static void setAsDragSource(IWidget w, Object objValue) {
		((View) w.asWidget()).setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View v) {
				Map<String, Object> eventData = new java.util.HashMap<>();
				w.updateModelToEventMap(eventData, "", (String) objValue);
				String text = PluginInvoker.marshal(eventData);
				ViewImpl.startDrag(w, text);
				return true;
			}
			
		});
	}
	
	private static void setForegroundGravity(IWidget w, Object objValue) {
		View view = ((View) w.asWidget());
		if (Build.VERSION.SDK_INT >= 23) {
			((View) w.asWidget()).setForegroundGravity((int)objValue);
			
			if (w.isInitialised() && view.getForeground() != null) {
				// hack to make foregroundGravity change dynamically
				view.setForeground(view.getForeground().getConstantState().newDrawable().mutate());
			}
		}
	}
	
	private static Object getForegroundGravity(IWidget w) {
		if (Build.VERSION.SDK_INT >= 23) {
			View view = ((View) w.asWidget());
			return view.getForegroundGravity();
		}
		
		return null;
	}

	private static Object getForeground(View view) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
			return view.getForeground();
		}
		
		return null;
	}

	public static void drawableStateChanged(IWidget widget) {
		widget.drawableStateChanged();
	}

	private static void nativeBringToFront(List<IWidget> widgets) {
		for (IWidget child : widgets) {
			View view = (View) child.asWidget();
			view.bringToFront();
		}
	}

	public static void addEventInfo(Map<String, Object> obj, MenuItem item, com.ashera.core.IFragment fragment) {
		Context context = (Context) fragment.getRootActivity();
		if (item.getItemId() != View.NO_ID) {
			if (fragment.getRootDirectory() == null) {
				obj.put("itemId", "@+id/" + context.getResources().getResourceEntryName(item.getItemId()));
			} else {
				obj.put("itemId", fragment.getRootWidget().quickConvertBack(item.getItemId(), "id"));
			}
		}
		
		if (item.getActionView() != null && item.getActionView().getTag() != null) {
			obj.put("actionLayoutId", item.getActionView().getTag());
		}
	}
	//start - validations
	private static void validateForm(IWidget w, Object objValue) {
		String formGroupId = (String) objValue;
		com.ashera.validations.Form form = (com.ashera.validations.Form) w.getFragment().getFromTempCache(formGroupId);
		
		if (form != null) {
			w.getFragment().disableRemeasure();
			w.getFragment().storeInTempCache("formvalidationResult", form.isValid());
			w.getFragment().enableRemeasure();
		}
	}
	
	private static Object getValidateFormResult(IWidget w) {
		Object result = w.getFragment().getFromTempCache("formvalidationResult");
		return result;
	}
	
	private static void setValidation(IWidget w, Object objValue) {
		java.util.List<com.ashera.validations.Form> forms = getForms(w);
		
		if (forms != null) {
			for (com.ashera.validations.Form form : forms) {
				java.util.List<String> validations = (java.util.List<String>) objValue;

				for (String validation : validations) {
					if (w instanceof com.ashera.validations.FormElement) {
						com.ashera.validations.FormElement formElement = (com.ashera.validations.FormElement) w;
						com.ashera.validations.Field field = com.ashera.validations.Field.using(formElement,
								com.ashera.validations.Field.DEFAULT_ORDER);
						String[] params = null;
						int startIndex = validation.indexOf("(");
						int endIndex = validation.indexOf(")");
						if (startIndex != -1 && endIndex != -1) {
							params = validation.substring(startIndex + 1, endIndex).split("\\-");
							validation = validation.substring(0, startIndex);
						}
						com.ashera.validations.Validation validator = com.ashera.validations.ValidatorFactory
								.get(validation);
						com.ashera.validations.Validation newInstance = validator.newInstance(params);
						String customMessage = formElement.getCustomMessage(validation);
						if (customMessage != null) {
							newInstance.setErrorMessage(customMessage);
						}
						field.addValidator(newInstance);
						form.addField(field);
					}

				}
			}
		}
	}

	public static java.util.List<com.ashera.validations.Form> getForms(IWidget w) {
		if (w instanceof com.ashera.validations.FormElement) {
			java.util.List<com.ashera.validations.Form> forms = new java.util.ArrayList<>();
			String formGroupIdStr = ((com.ashera.validations.FormElement)w).getFormGroupId();
			if (formGroupIdStr == null) {
				throw new RuntimeException("Specify a formGroupId for the widget");
			}
			String[] formGroupIds = com.ashera.utils.StringUtils.split(formGroupIdStr, ",");
			
			for (String formGroupId : formGroupIds) {
				com.ashera.validations.Form form = (com.ashera.validations.Form) w.getFragment().getFromTempCache(formGroupId);
				if (form == null) {
					form = new com.ashera.validations.Form();
					w.getFragment().storeInTempCache(formGroupId, form);
				}
				forms.add(form);
			}
			return forms;
		}
		
		return null;
	}
	
	
	private static void setType(IWidget w, String value, Object objValue) {
		switch (value) {
		case "email":
			addValidator(w, "email", new String[] {});
			break;
		case "tel":
			addValidator(w, "mobilenumber", new String[] {});
			break;
		case "url":
			addValidator(w, "url", new String[] {});
			break;
		case "date":
			addValidator(w, "date", new String[] {"dd/MM/yyyy"});
			break;
		case "time":
			addValidator(w, "time", new String[] {});
			break;
		default:
			break;
		}
		
	}

	private static void setPattern(IWidget w, Object objValue) {
		addValidator(w, "pattern", new String[] {(String)objValue});
	}

	private static void setMax(IWidget w, Object objValue) {
		addValidator(w, "maxvalue", new String[] {(String)objValue});
	}

	private static void setMin(IWidget w, Object objValue) {
		addValidator(w, "minvalue", new String[] {(String)objValue});
	}

	private static void setMaxlength(IWidget w, Object objValue) {
		addValidator(w, "maxlength", new String[] {(String)objValue});
	}

	private static void setMinlength(IWidget w, Object objValue) {
		addValidator(w, "minlength", new String[] {(String)objValue});
	}

	private static void setRequired(IWidget w, Object objValue) {
		addValidator(w, "required", null);
	}

	public static void addValidator(IWidget w, String validationName, String[] params) {
		if (w instanceof com.ashera.validations.FormElement) {
			java.util.List<com.ashera.validations.Form> forms = getForms(w);

			if (forms != null) {
				for (com.ashera.validations.Form form : forms) {
					com.ashera.validations.FormElement formElement = (com.ashera.validations.FormElement) w;
					com.ashera.validations.Field field = com.ashera.validations.Field.using(formElement,
							com.ashera.validations.Field.DEFAULT_ORDER);
					com.ashera.validations.Validation validator = com.ashera.validations.ValidatorFactory
							.get(validationName);
					String customMessage = formElement.getCustomMessage(validationName);
					com.ashera.validations.Validation newInstance = validator.newInstance(params);
					if (customMessage != null) {
						newInstance.setErrorMessage(customMessage);
					}
					field.addValidator(newInstance);
					form.addField(field);
				}
			}
		}
	}
	
	
	private static void setCustomErrorMessageKeys(IWidget w, Object objValue) {
		if (w instanceof com.ashera.validations.FormElement) {
			com.ashera.validations.FormElement formElement = (com.ashera.validations.FormElement) w;
			formElement.setCustomErrorMessageKeys((java.util.List<String>) objValue);
		}
		
	}

	private static void setCustomErrorMessageValues(IWidget w, Object objValue) {
		if (w instanceof com.ashera.validations.FormElement) {
			com.ashera.validations.FormElement formElement = (com.ashera.validations.FormElement) w;
			formElement.setCustomErrorMessageValues((java.util.List<String>) objValue);
		}
	}
	
	private static void setValidationErrorDisplay(IWidget w, String strValue, Object objValue) {
		if (w instanceof com.ashera.validations.FormElement) {
			com.ashera.validations.FormElement formElement = (com.ashera.validations.FormElement) w;
			formElement.setValidationErrorDisplayType((int) objValue);
		}
	}
	
	
	private static void setErrorStyle(IWidget w, View view, Object objValue) {
		if (w instanceof com.ashera.validations.FormElement) {
			com.ashera.validations.FormElement formElement = (com.ashera.validations.FormElement) w;
			formElement.setErrorStyle((String) objValue);
		}
	}

	private static void setStyle(IWidget w, View view, Object objValue) {
		if (w instanceof com.ashera.validations.FormElement) {
			com.ashera.validations.FormElement formElement = (com.ashera.validations.FormElement) w;
			formElement.setNormalStyle((String) objValue);
		}
		setStyle(w, objValue);
	}

	public static void setStyle(IWidget w, Object objValue) {
		if (w.isInitialised()) {
			com.ashera.parser.css.CssDataHolder pageData = (com.ashera.parser.css.CssDataHolder) w.getFragment().getStyleSheet();
			String style = (String) objValue;
			
			if (style != null) {
				style = style.replaceFirst("@style/", "");
				
				java.util.List<com.ashera.css.CssTree.Attribute> attributes = pageData.getStyle("." + style);
				
				if (attributes != null) {
					HashMap<String, java.util.List<WidgetAttributeValue>> attributeMap = new HashMap<>();
					for (com.ashera.css.CssTree.Attribute attribute : attributes) {
						String key = attribute.key;
						if (!attributeMap.containsKey(key)) {
							attributeMap.put(key, new java.util.ArrayList<>());
						}
						
						WidgetAttributeValue widgetAttributeValue = new WidgetAttributeValue(attribute.value, 
								attribute.orientation, attribute.minWidth, attribute.minHeight, attribute.maxWidth, attribute.maxHeight);
						attributeMap.get(key).add(widgetAttributeValue);
					}
					
					for (String key : attributeMap.keySet()) {
						WidgetAttribute attribute = w.getAttribute(w.getParent(), w.getLocalName(), key);
						if (attribute != null) {
							((BaseWidget)w).updateWidgetMap(attribute, attributeMap.get(key));
							if (!attribute.isForChild()) {
								String attributeValue = w.getAttributeValue(key);
								((BaseWidget)w).applyStyleToWidget(attribute, attributeValue);
							} else {
								((BaseHasWidgets) w.getParent()).setChildAttribute(w, attribute);
							}	
						}
					}
				}
			}
		}
	}
	

	public static void setMessageOnLabel(IWidget w, String message) {
		String id = w.getId();
		if (id != null) {
			IWidget errorLabel = w.findNearestView(id + "Error");
			
			if (errorLabel instanceof com.ashera.validations.ValidationErrorLabel) {
				((com.ashera.validations.ValidationErrorLabel) errorLabel).setErrorMessage(message);
			}
		}
	}
	//end - validations
	
	public static boolean isRTLLayoutDirection(IWidget widget) {
		View view = (View) widget.asWidget();
		return view.getLayoutDirection() == View.LAYOUT_DIRECTION_RTL;
	}
	
	private static void setOnCapturedPointerListener(View view, Object objValue) {
		view.setOnCapturedPointerListener((View.OnCapturedPointerListener) objValue);
	}

	private static void setOnApplyWindowInsetsListener(View view, Object objValue) {
		view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) objValue);
	}
	


	private static void setOnTouchListener(View view, Object objValue) {
		view.setOnTouchListener((View.OnTouchListener) objValue);
	}

	private static void setOnSystemUiVisibilityChangeListener(View view, Object objValue) {
		view.setOnSystemUiVisibilityChangeListener((View.OnSystemUiVisibilityChangeListener) objValue);
	}

	private static void setOnScrollChangeListener(View view, Object objValue) {
		view.setOnScrollChangeListener((View.OnScrollChangeListener) objValue);
	}

	private static void setOnLongClickListener(View view, Object objValue) {
		view.setOnLongClickListener((View.OnLongClickListener) objValue);		
	}

	private static void setOnKeyListener(View view, Object objValue) {
		view.setOnKeyListener((View.OnKeyListener) objValue);		
	}

	private static void setOnHoverListener(View view, Object objValue) {
		view.setOnHoverListener((View.OnHoverListener) objValue);		
	}

	private static void setOnContextClickListener(View view, Object objValue) {
		view.setOnContextClickListener((View.OnContextClickListener) objValue);		
	}

	private static void setOnClickListener(View view, Object objValue) {
		view.setOnClickListener((View.OnClickListener) objValue);		
	}

	private static void setOnGenericMotionListener(View view, Object objValue) {
		view.setOnGenericMotionListener((View.OnGenericMotionListener) objValue);		
	}

	private static void setOnFocusChangeListener(View view, Object objValue) {
		view.setOnFocusChangeListener((View.OnFocusChangeListener) objValue);		
	}

	private static void setOnDragListener(View view, Object objValue) {
		view.setOnDragListener((View.OnDragListener) objValue);		
	}

	private static void setOnCreateContextMenuListener(View view, Object objValue) {
		view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) objValue);		
	}
	
	private static void setNativeId(IWidget w, String strValue) {
	}

	//start - swipe
	private static void setOnSwipeListener(IWidget w, com.ashera.layout.SwipeHelper.SwipeListener swipeListener) {
		SwipeHelper helper = new SwipeHelper((int) w.quickConvert("30dp", "dimension"));
		helper.setListener(swipeListener);
		addSwipeListener(w, helper);		
	}
	//end - swipe

	public static void addSwipeListener(IWidget w, SwipeHelper helper) {
		((View) w.asWidget()).setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View view, MotionEvent event) {
				boolean isEventConsumed = true;
				 switch (event.getAction()) {
			      case MotionEvent.ACTION_DOWN: // user started touching the screen
			    	  helper.onActionDown(event.getX(), event.getY());
			        break;
			      case MotionEvent.ACTION_UP:   // user stopped touching the screen
			        isEventConsumed = helper.onActionUp(event.getX(), event.getY());
			        break;
			      default:
			        break;
			    }
				return isEventConsumed;
			}
			
		});
	}

	//start - state
	public static void state(IWidget w, int i) {
     	String attributeName = (String) w.getUserData("state" + i);
     	Object val = w.getUserData("val" + i);
     	w.setAttribute(attributeName, val, false);
     }
	

	public static void setState(IWidget w, int i, Object value) {
		String attributeName = (String) w.getUserData("state" + i);
     	String attributeConverter = (String) w.getUserData("stateConverter" + i);
		String stringFormatter = (String) w.getUserData("stateStringFormat" + i);

     	if (attributeConverter != null && stringFormatter != null) {
     		value = String.format(stringFormatter, value.toString());
     		value = w.quickConvert(value, attributeConverter);
     	}

     	w.setAttribute(attributeName, value, true);
	}
             
     public static void stateYes(IWidget w) {
     	String attributeName = (String) w.getUserData("stateYes");
     	
     	switch (attributeName) {
			case "show":
				w.setAttribute("visibility", "visible", false);
				break;

			default:
				w.setAttribute(attributeName, true, true);
				break;
			}
     	
     }
     
     public static void stateNo(IWidget w) {
     	String attributeName = (String) w.getUserData("stateNo");
     	switch (attributeName) {
			case "hide":
				w.setAttribute("visibility", "gone", false);
				break;

			default:
				w.setAttribute(attributeName, false, true);
				break;
			}
     }
	//end - state
     
    //start - animator
 	private static void setAnimatorListener(IWidget w, Animator.AnimatorListener animatorListener) {
 		Animator animator = (Animator) w.getAnimator();
		if (animator != null) {
			animator.addListener(animatorListener);
		}
 	}

 	private static void endAnimator(IWidget w, Object objValue) {
 		Animator animator = (Animator) w.getAnimator();
		if (animator != null) {
			animator.end();
		}
 	
 		
 	}
 	
 	private static void startAnimator(IWidget w, Object objValue) {
 		Animator animator = (Animator) w.getAnimator();
		if (animator != null) {
			if (animator.isRunning()) {
				endAnimator(w, objValue);
			}
			View view = (View) w.asWidget();
			view.post(() -> animator.start());
		}
 	}
 	//end - animator

 	private static void setAnimatorXml(IWidget w, Object objValue) {
 		String value = (String) objValue;
 		com.ashera.core.IFragment fragment = w.getFragment();
 		String inlineResource = fragment.getInlineResource(value);

 		if (fragment.getRootDirectory() == null && inlineResource == null) {
	 		if (value.startsWith("@animator/")) {
		 		String key1 = value.replaceFirst("@animator/", "");
				Context context = (Context) fragment.getRootActivity();
				int identifier = context.getResources().getIdentifier(key1, "animator", context.getPackageName());
				android.animation.Animator animator = android.animation.AnimatorInflater.loadAnimator(context, identifier);
				animator.setTarget((View) w.asWidget());
				w.setAnimator(animator);
	 		}
	 		
	 		if (value.startsWith("@anim/")) {
		 		String key1 = value.replaceFirst("@anim/", "");
				Context context = (Context) fragment.getRootActivity();
				int identifier = context.getResources().getIdentifier(key1, "anim", context.getPackageName());
				android.view.animation.Animation animation = android.view.animation.AnimationUtils.loadAnimation(context, identifier);
				((View) w.asWidget()).startAnimation(animation);
	 		}
 		} else {
 			setAnimatorXmlExternal(w, objValue);
 		}
 	}
 	
	
	private static void setBottom(IWidget w, Object objValue) {
		View view = (View) w.asWidget();
		view.setLeft((int) objValue);
	}

	private static void setTop(IWidget w, Object objValue) {
		View view = (View) w.asWidget();
		view.setTop((int) objValue);
	}

	private static void setRight(IWidget w, Object objValue) {
		View view = (View) w.asWidget();
		view.setRight((int) objValue);
	}

	private static void setLeft(IWidget w, Object objValue) {
		View view = (View) w.asWidget();
		view.setLeft((int) objValue);
	}
	
	
	private static Object getBottom(IWidget w) {
		View view = (View) w.asWidget();
		return view.getBottom();
	}

	private static Object getTop(IWidget w) {
		View view = (View) w.asWidget();
		return view.getTop();
	}

	private static Object getRight(IWidget w) {
		View view = (View) w.asWidget();
		return view.getRight();
	}

	private static Object getLeft(IWidget w) {
		View view = (View) w.asWidget();
		return view.getLeft();
	}
	
	
	private static void setOutlineSpotShadowColor(IWidget w, Object objValue) {
		if (Build.VERSION.SDK_INT >= 28) {
			View view = (View) w.asWidget();
			view.setOutlineSpotShadowColor((int) objValue);
		}
	}

	private static void setOutlineAmbientShadowColor(IWidget w, Object objValue) {
		if (Build.VERSION.SDK_INT >= 28) {
			View view = (View) w.asWidget();
			view.setOutlineAmbientShadowColor((int) objValue);
		}
	}
	
	
	private static void setCornerRadius(IWidget w, Object nativeWidget, Object objValue) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
			View view = (View) w.asWidget();
			float radius = ((Number) objValue).floatValue();
			setClipToRoundedOutline(view, radius, 0, 0, 0, 0);
		}
	}
	
	private static void setClipToRoundedOutline(View view,float roundedCornerRadius, float offsetTop, float offsetLeft, float offsetRight, float offsetBottom) {
		RoundedRectOutlineProvider provider = new RoundedRectOutlineProvider(roundedCornerRadius, offsetTop, offsetLeft, offsetRight, offsetBottom);
		view.setOutlineProvider(provider);
		view.setClipToOutline(true);
	}
	
	@android.annotation.TargetApi(Build.VERSION_CODES.LOLLIPOP)
	static final class RoundedRectOutlineProvider extends ViewOutlineProvider {
		private float mRadius;
		private float moffsetTop;
		private float moffsetLeft;
		private float moffsetRight;
		private float moffsetBottom;
		public RoundedRectOutlineProvider(float radius, float offsetTop, float offsetLeft, float offsetRight, float offsetBottom) {
			mRadius = radius;
			moffsetTop = offsetTop;
			moffsetLeft = offsetLeft;
			moffsetRight = offsetRight;
			moffsetBottom = offsetBottom;
		}

		@Override
		public void getOutline(View view, Outline outline) {
			outline.setRoundRect((int) (0 - moffsetLeft), (int) (0 - moffsetTop), (int) (view.getMeasuredWidth() + moffsetRight), (int) (view.getMeasuredHeight() + moffsetBottom), mRadius);
			outline.setAlpha(1f);
		}
	}

	public static String getValue(String key, org.xml.sax.Attributes attributes) {
		String os = PluginInvoker.getOS().toLowerCase();
		if (attributes.getValue(key + "-" + os) != null) {
			return attributes.getValue(key + "-" + os);
		}
		
		return attributes.getValue(key);
	}
	
	private static class CustomProperty<T, V> extends android.util.Property<Object, Object> {

	    private static final String PREFIX_GET = "get";
	    private static final String PREFIX_IS = "is";
	    private static final String PREFIX_SET = "set";
	    private Method mSetter;
	    private java.lang.reflect.Field mField;

	   /**
	     * For given property name 'name', look for getName/isName method or 'name' field.
	     * Also look for setName method (optional - could be readonly). Failing method getters and
	     * field results in throwing NoSuchPropertyException.
	     *
	     * @param propertyHolder The class on which the methods or field are found
	     * @param name The name of the property, where this name is capitalized and appended to
	     * "get" and "is to search for the appropriate methods. If the get/is methods are not found,
	     * the constructor will search for a field with that exact name.
	     */
	    public CustomProperty(Class<Object> valueType, String name) {
	         // TODO: cache reflection info for each new class/name pair
	        super(valueType, name);
	        char firstLetter = Character.toUpperCase(name.charAt(0));
	        String theRest = name.substring(1);
	        String capitalizedName = firstLetter + theRest;

	        String setterName = PREFIX_SET + capitalizedName;
	        try {
	            mSetter = valueType.getMethod(setterName, float.class);
	        } catch (NoSuchMethodException ignored) {
	            // Okay to not have a setter - just a readonly property
	        }
	    }

	    @Override
	    public void set(Object object, Object value) {
	        if (mSetter != null) {
	            try {
	                mSetter.invoke(object, value);
	            } catch (Exception e) {
	            	 throw new RuntimeException(e.getCause());
	            } 
	        } else if (mField != null) {
	            try {
	                mField.set(object, value);
	            } catch (IllegalAccessException e) {
	                throw new AssertionError();
	            }
	        } else {
	            throw new UnsupportedOperationException("Property " + getName() +" is read-only");
	        }
	    }

	    @Override
	    public V get(Object object) {
	        return null;
	    }

	   /**
	     * Returns false if there is no setter or public field underlying this Property.
	     */
	    @Override
	    public boolean isReadOnly() {
	        return (mSetter == null && mField == null);
	    }
	}

}
