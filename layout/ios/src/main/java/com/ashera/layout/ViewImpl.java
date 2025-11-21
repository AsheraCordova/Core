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
//start - imports
import java.util.*;

import r.android.content.Context;
import r.android.os.Build;
import r.android.view.View;
import r.android.annotation.SuppressLint;

import com.ashera.widget.*;
import com.ashera.converter.*;

/*-[
#include <UIKit/UIKit.h>
#include "ASUIView.h"
]-*/
import com.google.j2objc.annotations.Property;
import androidx.core.view.*;

import static com.ashera.widget.IWidget.*;
//end - imports
/*-[
#include "ASUITapGestureRecognizer.h"
#include "ASUISwipeGestureRecognizer.h"
#include "ASUILongTapGestureRecognizer.h"
]-*/
import r.android.view.MotionEvent;
import r.android.view.View.DragEvent;
import r.android.view.KeyEvent;
import r.android.view.MenuItem;
import r.android.animation.Animator;

public class ViewImpl {
	// start - body
	private ViewImpl() {
	}
	
		@SuppressLint("NewApi")
		final static class IosAccessibilityTraits extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("uiaccessibilitytraitadjustable",  LayoutNativeVars.UIAccessibilityTraitAdjustable);
				mapping.put("uiaccessibilitytraitallowsdirectinteraction",  LayoutNativeVars.UIAccessibilityTraitAllowsDirectInteraction);
				mapping.put("uiaccessibilitytraitbutton",  LayoutNativeVars.UIAccessibilityTraitButton);
				mapping.put("uiaccessibilitytraitcausespageturn",  LayoutNativeVars.UIAccessibilityTraitCausesPageTurn);
				mapping.put("uiaccessibilitytraitheader",  LayoutNativeVars.UIAccessibilityTraitHeader);
				mapping.put("uiaccessibilitytraitimage",  LayoutNativeVars.UIAccessibilityTraitImage);
				mapping.put("uiaccessibilitytraitkeyboardkey",  LayoutNativeVars.UIAccessibilityTraitKeyboardKey);
				mapping.put("uiaccessibilitytraitlink",  LayoutNativeVars.UIAccessibilityTraitLink);
				mapping.put("uiaccessibilitytraitnone",  LayoutNativeVars.UIAccessibilityTraitNone);
				mapping.put("uiaccessibilitytraitnotenabled",  LayoutNativeVars.UIAccessibilityTraitNotEnabled);
				mapping.put("uiaccessibilitytraitplayssound",  LayoutNativeVars.UIAccessibilityTraitPlaysSound);
				mapping.put("uiaccessibilitytraitsearchfield",  LayoutNativeVars.UIAccessibilityTraitSearchField);
				mapping.put("uiaccessibilitytraitselected",  LayoutNativeVars.UIAccessibilityTraitSelected);
				mapping.put("uiaccessibilitytraitstartsmediasession",  LayoutNativeVars.UIAccessibilityTraitStartsMediaSession);
				mapping.put("uiaccessibilitytraitstatictext",  LayoutNativeVars.UIAccessibilityTraitStaticText);
				mapping.put("uiaccessibilitytraitsummaryelement",  LayoutNativeVars.UIAccessibilityTraitSummaryElement);
				mapping.put("uiaccessibilitytraittabbar",  LayoutNativeVars.UIAccessibilityTraitTabBar);
				mapping.put("uiaccessibilitytraitupdatesfrequently",  LayoutNativeVars.UIAccessibilityTraitUpdatesFrequently);
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
		final static class BackgroundTintMode extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("add",  LayoutNativeVars.kCGBlendModeOverlay);
				mapping.put("multiply",  LayoutNativeVars.kCGBlendModeMultiply);
				mapping.put("screen",  LayoutNativeVars.kCGBlendModeScreen);
				mapping.put("src_atop",  LayoutNativeVars.kCGBlendModeSourceAtop);
				mapping.put("src_in",  LayoutNativeVars.kCGBlendModeSourceIn);
				mapping.put("src_over",  LayoutNativeVars.kCGBlendModeNormal);
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
		final static class ForegroundTintMode extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("add",  LayoutNativeVars.kCGBlendModeOverlay);
				mapping.put("multiply",  LayoutNativeVars.kCGBlendModeMultiply);
				mapping.put("screen",  LayoutNativeVars.kCGBlendModeScreen);
				mapping.put("src_atop",  LayoutNativeVars.kCGBlendModeSourceAtop);
				mapping.put("src_in",  LayoutNativeVars.kCGBlendModeSourceIn);
				mapping.put("src_over",  LayoutNativeVars.kCGBlendModeNormal);
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
	public static void register(String localName) {

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosBackgroundColor").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosIsHidden").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosAlpha").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosIsOpaque").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosTintColor").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosClipsToBounds").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosClearsContextBeforeDrawing").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosIsUserInteractionEnabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosIsMultipleTouchEnabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosIsExclusiveTouch").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosPreservesSuperviewLayoutMargins").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosInsetsLayoutMarginsFromSafeArea").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosAutoresizesSubviews").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosTranslatesAutoresizingMaskIntoConstraints").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosContentScaleFactor").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosIsFocused").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosRestorationIdentifier").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosTag").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosAccessibilityIgnoresInvertColors").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosLargeContentImage").withType("image"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosLargeContentTitle").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosScalesLargeContentImage").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosShowsLargeContentViewer").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosIsAccessibilityElement").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("focusable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosAccessibilityLabel").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosAccessibilityHint").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("contentDescription").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosAccessibilityValue").withType("resourcestring"));
		ConverterFactory.register("View.iosAccessibilityTraits", new IosAccessibilityTraits());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosAccessibilityTraits").withType("View.iosAccessibilityTraits"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("selected").withType("boolean").withOrder(10));
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
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("outlineAmbientShadowColor").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("outlineSpotShadowColor").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("cornerRadius").withType("dimensionfloat"));
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
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("id").withType("id"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelSyncEvents").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelParam").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelPojoToUi").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelUiToPojo").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelPojoToUiParams").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("refreshUiFromModel").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelUiToPojoEventIds").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("updateModelData").withType("object"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("notifyDataSetChanged").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("background").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		ConverterFactory.register("View.backgroundRepeat", new BackgroundRepeat());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("backgroundRepeat").withType("View.backgroundRepeat").withOrder(-10).withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onClick").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onTouch").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minWidth").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minHeight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("attributeUnderTest").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("backgroundTint").withType("colorstate").withOrder(-10).withUiFlag(UPDATE_UI_INVALIDATE));
		ConverterFactory.register("View.backgroundTintMode", new BackgroundTintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("backgroundTintMode").withType("View.backgroundTintMode").withOrder(-10).withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("foreground").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		ConverterFactory.register("View.foregroundRepeat", new ForegroundRepeat());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("foregroundRepeat").withType("View.foregroundRepeat").withOrder(-10).withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("foregroundTint").withType("colorstate").withOrder(-10).withUiFlag(UPDATE_UI_INVALIDATE));
		ConverterFactory.register("View.foregroundTintMode", new ForegroundTintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("foregroundTintMode").withType("View.foregroundTintMode").withOrder(-10).withUiFlag(UPDATE_UI_INVALIDATE));
		ConverterFactory.register("View.visibility", new Visibility());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("visibility").withType("View.visibility").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("alpha").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onLongClick").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("longClickable").withType("boolean").withOrder(1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("clickable").withType("boolean").withOrder(1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("translationX").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("translationY").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("translationZ").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("rotation").withType("float").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("rotationX").withType("float").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("rotationY").withType("float").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scaleX").withType("float").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scaleY").withType("float").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("transformPivotX").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("transformPivotY").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("invalidate").withType("nil"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("requestLayout").withType("nil"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("keepScreenOn").withType("boolean"));
		ConverterFactory.register("View.layoutDirection", new LayoutDirection());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layoutDirection").withType("View.layoutDirection").beforeChildAdd());
		ConverterFactory.register("View.textDirection", new TextDirection());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textDirection").withType("View.textDirection").withOrder(100));
		ConverterFactory.register("View.textAlignment", new TextAlignment());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textAlignment").withType("View.textAlignment"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onDrag").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("asDragSource").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("enabled").withType("boolean").withOrder(-10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("duplicateParentState").withType("boolean").beforeChildAdd());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("foregroundGravity").withType("gravity").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onKey").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosLayerBorderWidth").withType("dimensionfloat").withSimpleWrapableViewStrategy(APPLY_TO_VIEW_HOLDER));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosLayerBorderColor").withType("color").withSimpleWrapableViewStrategy(APPLY_TO_VIEW_HOLDER));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosLayerCornerRadius").withType("dimensionfloat").withSimpleWrapableViewStrategy(APPLY_TO_VIEW_HOLDER));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("iosLayerMasksToBounds").withType("boolean").withSimpleWrapableViewStrategy(APPLY_TO_VIEW_HOLDER));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("zIndex").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("elevation").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxWidth").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxHeight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onSwiped").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("outsideTouchable").withType("boolean"));
	WidgetFactory.registerConstructorAttribute(localName, new WidgetAttribute.Builder().withName("formGroupId").withType("string"));
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
		case "iosBackgroundColor": {


		setBackgroundColor(nativeWidget, objValue);



			}
			break;
		case "iosIsHidden": {


		setIsHidden(nativeWidget, objValue);



			}
			break;
		case "iosAlpha": {


		setAlpha(nativeWidget, objValue);



			}
			break;
		case "iosIsOpaque": {


		setIsOpaque(nativeWidget, objValue);



			}
			break;
		case "iosTintColor": {


		setTintColor(nativeWidget, objValue);



			}
			break;
		case "iosClipsToBounds": {


		setClipsToBounds(nativeWidget, objValue);



			}
			break;
		case "iosClearsContextBeforeDrawing": {


		setClearsContextBeforeDrawing(nativeWidget, objValue);



			}
			break;
		case "iosIsUserInteractionEnabled": {


		setIsUserInteractionEnabled(nativeWidget, objValue);



			}
			break;
		case "iosIsMultipleTouchEnabled": {


		setIsMultipleTouchEnabled(nativeWidget, objValue);



			}
			break;
		case "iosIsExclusiveTouch": {


		setIsExclusiveTouch(nativeWidget, objValue);



			}
			break;
		case "iosPreservesSuperviewLayoutMargins": {


		setPreservesSuperviewLayoutMargins(nativeWidget, objValue);



			}
			break;
		case "iosInsetsLayoutMarginsFromSafeArea": {


		setInsetsLayoutMarginsFromSafeArea(nativeWidget, objValue);



			}
			break;
		case "iosAutoresizesSubviews": {


		setAutoresizesSubviews(nativeWidget, objValue);



			}
			break;
		case "iosTranslatesAutoresizingMaskIntoConstraints": {


		setTranslatesAutoresizingMaskIntoConstraints(nativeWidget, objValue);



			}
			break;
		case "iosContentScaleFactor": {


		setContentScaleFactor(nativeWidget, objValue);



			}
			break;
		
		case "iosRestorationIdentifier": {


		setRestorationIdentifier(nativeWidget, objValue);



			}
			break;
		case "iosTag": {


		setTag(nativeWidget, objValue);



			}
			break;
		case "iosAccessibilityIgnoresInvertColors": {


		setAccessibilityIgnoresInvertColors(nativeWidget, objValue);



			}
			break;
		case "iosLargeContentImage": {
if (checkIosVersion("13.0")) {

		setLargeContentImage(nativeWidget, objValue);

}

			}
			break;
		case "iosLargeContentTitle": {
if (checkIosVersion("13.0")) {

		setLargeContentTitle(nativeWidget, objValue);

}

			}
			break;
		case "iosScalesLargeContentImage": {
if (checkIosVersion("13.0")) {

		setScalesLargeContentImage(nativeWidget, objValue);

}

			}
			break;
		case "iosShowsLargeContentViewer": {
if (checkIosVersion("13.0")) {

		setShowsLargeContentViewer(nativeWidget, objValue);

}

			}
			break;
			case "focusable":
		case "iosIsAccessibilityElement": {


		setIsAccessibilityElement(nativeWidget, objValue);



			}
			break;
		case "iosAccessibilityLabel": {


		setAccessibilityLabel(nativeWidget, objValue);



			}
			break;
			case "contentDescription":
		case "iosAccessibilityHint": {


		setAccessibilityHint(nativeWidget, objValue);



			}
			break;
		case "iosAccessibilityValue": {


		setAccessibilityValue(nativeWidget, objValue);



			}
			break;
		case "iosAccessibilityTraits": {


		setAccessibilityTraits(nativeWidget, objValue);



			}
			break;
		case "selected": {


		setSelected(objValue, view);



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
		case "id": {


		setId(w, strValue, objValue, view);



			}
			break;
		case "modelSyncEvents": {


		setModelSyncEvents(w, strValue, objValue, view);



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
		case "background": {


		setBackground(w, nativeWidget, objValue);



			}
			break;
		case "backgroundRepeat": {


		setBackgroundRepeat(w, strValue, objValue, view);



			}
			break;
		case "onClick": {


		 setOnClick(w, nativeWidget, objValue);



			}
			break;
		case "onTouch": {


		 setOnTouch(w, nativeWidget, objValue);



			}
			break;
		case "minWidth": {


		 setMinWidth(w, objValue);



			}
			break;
		case "minHeight": {


		 setMinHeight(w, objValue);



			}
			break;
		case "attributeUnderTest": {


		 //



			}
			break;
		case "backgroundTint": {


		setBackgroundTint(w,objValue);



			}
			break;
		case "backgroundTintMode": {


		setBackgroundTintMode(w, objValue);



			}
			break;
		case "foreground": {


		setForeground(w, nativeWidget, objValue);



			}
			break;
		case "foregroundRepeat": {


		setForegroundRepeat(w, strValue, objValue, view);



			}
			break;
		case "foregroundTint": {


		setForegroundTint(w,objValue);



			}
			break;
		case "foregroundTintMode": {


		setForegroundTintMode(w, objValue);



			}
			break;
		case "visibility": {


		 setVisibility(w, nativeWidget, objValue);



			}
			break;
		case "alpha": {


		 setAlpha(nativeWidget, objValue);



			}
			break;
		case "onLongClick": {


		 setOnLongClick(w, nativeWidget, objValue);



			}
			break;
		case "longClickable": {


		 setLongClickable(w, objValue);



			}
			break;
		case "clickable": {


		 setClickable(w, nativeWidget, objValue);



			}
			break;
		case "translationX": {


		 setTranslationX(w, objValue);



			}
			break;
		case "translationY": {


		 setTranslationY(w, objValue);



			}
			break;
		case "translationZ": {


		 setTranslationZ(w, objValue);



			}
			break;
		case "rotation": {


		 setRotation(w, objValue);



			}
			break;
		case "rotationX": {


		 setRotationX(w, objValue);



			}
			break;
		case "rotationY": {


		 setRotationY(w, objValue);



			}
			break;
		case "scaleX": {


		 setScaleX(w, objValue);



			}
			break;
		case "scaleY": {


		 setScaleY(w, objValue);



			}
			break;
		case "transformPivotX": {


		 setTransformPivotX(w, objValue);



			}
			break;
		case "transformPivotY": {


		 setTransformPivotY(w, objValue);



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
		case "keepScreenOn": {


		 setKeepScreenOn(w, objValue);



			}
			break;
		case "layoutDirection": {


		 setLayoutDirection(w, objValue);



			}
			break;
		case "textDirection": {


		 setTextDirection(w, objValue);



			}
			break;
		case "textAlignment": {


		 setTextAlignment(w, objValue);



			}
			break;
		case "onDrag": {


		 setOnDrag(w, nativeWidget, objValue);



			}
			break;
		case "asDragSource": {


		 setAsDragSource(w, nativeWidget, objValue);



			}
			break;
		case "enabled": {


		view.setEnabled((boolean)objValue);



			}
			break;
		case "duplicateParentState": {


		 view.setDuplicateParentStateEnabled((boolean)objValue);



			}
			break;
		case "foregroundGravity": {


		view.setForegroundGravity((int) objValue);



			}
			break;
		case "onKey": {


		 setOnKey(w, objValue);



			}
			break;
		case "iosLayerBorderWidth": {


		 setLayerBorderWidth(nativeWidget, objValue);



			}
			break;
		case "iosLayerBorderColor": {


		 setLayerBorderColor(nativeWidget, objValue);



			}
			break;
		case "iosLayerCornerRadius": {


		 setLayerCornerRadius(nativeWidget, objValue);



			}
			break;
		case "iosLayerMasksToBounds": {


		 setLayerMasksToBounds(nativeWidget, objValue);



			}
			break;
		case "zIndex": {


		 setZIndex(w, objValue);



			}
			break;
		case "elevation": {


		 setElevation(w, objValue);



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
		case "onSwiped": {


		if (objValue instanceof String) {setOnSwipeListener(w, new SwipeListener(w, strValue, "onSwiped"));} else {setOnSwipeListener(w, (SwipeHelper.SwipeListener) objValue);}



			}
			break;
		case "outsideTouchable": {


		setOutsideTouchable(w, strValue, objValue, view);



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
			case "iosBackgroundColor": {
return getBackgroundColor(nativeWidget);			}
			case "iosIsHidden": {
return getIsHidden(nativeWidget);			}
			case "iosAlpha": {
return getAlpha(nativeWidget);			}
			case "iosIsOpaque": {
return getIsOpaque(nativeWidget);			}
			case "iosTintColor": {
return getTintColor(nativeWidget);			}
			case "iosClipsToBounds": {
return getClipsToBounds(nativeWidget);			}
			case "iosClearsContextBeforeDrawing": {
return getClearsContextBeforeDrawing(nativeWidget);			}
			case "iosIsUserInteractionEnabled": {
return getIsUserInteractionEnabled(nativeWidget);			}
			case "iosIsMultipleTouchEnabled": {
return getIsMultipleTouchEnabled(nativeWidget);			}
			case "iosIsExclusiveTouch": {
return getIsExclusiveTouch(nativeWidget);			}
			case "iosPreservesSuperviewLayoutMargins": {
return getPreservesSuperviewLayoutMargins(nativeWidget);			}
			case "iosInsetsLayoutMarginsFromSafeArea": {
return getInsetsLayoutMarginsFromSafeArea(nativeWidget);			}
			case "iosAutoresizesSubviews": {
return getAutoresizesSubviews(nativeWidget);			}
			case "iosTranslatesAutoresizingMaskIntoConstraints": {
return getTranslatesAutoresizingMaskIntoConstraints(nativeWidget);			}
			case "iosContentScaleFactor": {
return getContentScaleFactor(nativeWidget);			}
			case "iosIsFocused": {
return getIsFocused(nativeWidget);			}
			case "iosRestorationIdentifier": {
return getRestorationIdentifier(nativeWidget);			}
			case "iosTag": {
return getTag(nativeWidget);			}
			case "iosAccessibilityIgnoresInvertColors": {
return getAccessibilityIgnoresInvertColors(nativeWidget);			}
			case "iosLargeContentImage": {
if (checkIosVersion("13.0")) {
return getLargeContentImage(nativeWidget);
}
break;			}
			case "iosLargeContentTitle": {
if (checkIosVersion("13.0")) {
return getLargeContentTitle(nativeWidget);
}
break;			}
			case "iosScalesLargeContentImage": {
if (checkIosVersion("13.0")) {
return getScalesLargeContentImage(nativeWidget);
}
break;			}
			case "iosShowsLargeContentViewer": {
if (checkIosVersion("13.0")) {
return getShowsLargeContentViewer(nativeWidget);
}
break;			}
			case "focusable":
			case "iosIsAccessibilityElement": {
return getIsAccessibilityElement(nativeWidget);			}
			case "iosAccessibilityLabel": {
return getAccessibilityLabel(nativeWidget);			}
			case "contentDescription":
			case "iosAccessibilityHint": {
return getAccessibilityHint(nativeWidget);			}
			case "iosAccessibilityValue": {
return getAccessibilityValue(nativeWidget);			}
			case "iosAccessibilityTraits": {
return getAccessibilityTraits(nativeWidget);			}
			case "selected": {
return getSelected(w, view);			}
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
			case "id": {
return view.getId();			}
			case "modelSyncEvents": {
return getModelSyncEvents(w);			}
			case "modelParam": {
return getModelParam(w);			}
			case "modelPojoToUi": {
return getModelPojoToUi(w);			}
			case "modelUiToPojo": {
return getModelUiToPojo(w);			}
			case "background": {
return getBackground(w);			}
			case "minWidth": {
return getMinWidth(w);			}
			case "minHeight": {
return getMinHeight(w);			}
			case "backgroundTint": {
return getBackgroundTint(w);			}
			case "backgroundTintMode": {
return getBackgroundTintMode(w);			}
			case "foreground": {
return getForeground(w);			}
			case "foregroundTint": {
return getForegroundTint(w);			}
			case "foregroundTintMode": {
return getForegroundTintMode(w);			}
			case "visibility": {
return getVisibility(w);			}
			case "alpha": {
return getAlpha(nativeWidget);			}
			case "longClickable": {
return getLongClickable(w);			}
			case "clickable": {
return getClickable(nativeWidget);			}
			case "translationX": {
return getTranslationX(w);			}
			case "translationY": {
return getTranslationY(w);			}
			case "translationZ": {
return getTranslationZ(w);			}
			case "rotation": {
return getRotation(w);			}
			case "rotationX": {
return getRotationX(w);			}
			case "rotationY": {
return getRotationY(w);			}
			case "scaleX": {
return getScaleX(w);			}
			case "scaleY": {
return getScaleY(w);			}
			case "transformPivotX": {
return getTransformPivotX(w);			}
			case "transformPivotY": {
return getTransformPivotY(w);			}
			case "keepScreenOn": {
return getKeepScreenOn(w);			}
			case "layoutDirection": {
return getLayoutDirection(w);			}
			case "textDirection": {
return getTextDirection(w);			}
			case "textAlignment": {
return getTextAlignment(w);			}
			case "enabled": {
return view.isEnabled();			}
			case "duplicateParentState": {
return view.isDuplicateParentStateEnabled();			}
			case "foregroundGravity": {
return view.getForegroundGravity();			}
			case "maxWidth": {
return getMaxWidth(w);			}
			case "maxHeight": {
return getMaxHeight(w);			}
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
    public static native boolean checkIosVersion(String v) /*-[
		return ([[[UIDevice currentDevice] systemVersion] compare:v options:NSNumericSearch] == NSOrderedDescending);
	]-*/;
	


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

	

 
	private static void setBackgroundRepeat(IWidget w, String strValue, Object objValue, View view) {
		w.applyAttributeCommand("background", "imageRepeat", new String[] {"backgroundRepeat"}, true, strValue);
	}
	
	private static void setForegroundRepeat(IWidget w, String strValue, Object objValue, View view) {
		w.applyAttributeCommand("foreground", "imageRepeat", new String[] {"foregroundRepeat"}, true, strValue);
	}
	


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
	public static void addEventInfo(Map<String, Object> obj, r.android.widget.Chronometer chronometer, com.ashera.core.IFragment fragment) {
		obj.put("text", chronometer.getText());
	}
	public static void addEventInfo(Map<String, Object> obj, java.util.List<Integer> checkedIds, com.ashera.core.IFragment fragment) {
		java.util.List<Object> ids = new java.util.ArrayList<>();
		for (int id : checkedIds) {
			ids.add(fragment.getRootWidget().quickConvertBack(id, "id"));	
		}
		
		obj.put("checkedIds", PluginInvoker.getJSONSafeObj(ids));
	}
	


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
 	


	public static void setLayoutDirection(IWidget w, Object objValue) {
		View view = (View) w.asWidget();
		int value = (int) objValue;
		if (isMirrorSupported() && isRTLLayout()) {
			if (value == View.LAYOUT_DIRECTION_RTL) {
				value = View.LAYOUT_DIRECTION_LTR;
			} else {
				value = View.LAYOUT_DIRECTION_RTL;
			}
		}
		view.setLayoutDirection(value);
	}
	
	private static Object getLayoutDirection(IWidget w) {
		View view = (View) w.asWidget();
		return view.getLayoutDirection();
	}
	
	
	private static void setTextAlignment(IWidget w, Object objValue) {
		View view = (View) w.asWidget();
		view.setTextAlignment((int) objValue);
	}

	private static void setTextDirection(IWidget w, Object objValue) {
		View view = (View) w.asWidget();
		view.setTextDirection((int) objValue);
	}

	private static Object getTextAlignment(IWidget w) {
		View view = (View) w.asWidget();
		return view.getTextAlignment();
	}

	private static Object getTextDirection(IWidget w) {
		View view = (View) w.asWidget();
		return view.getTextDirection();
	}
	
	public static boolean isRTLLayoutDirection(IWidget widget) {
		View view = (View) widget.asWidget();
		return view.isLayoutRtl();
	}	
	


	public static void drawableStateChanged(IWidget w) {
		w.storeInTempCache("stateChange", true);
		w.drawableStateChanged();
		View view = (View) w.asWidget();
		
		r.android.graphics.drawable.Drawable background = view.getBackground();
		if (background != null && background.isStateful() && background.setState(view.getDrawableState())) {
			w.setAttribute("background", background, true);
		}
		
		r.android.graphics.drawable.Drawable foreground = view.getForeground();
		if (foreground != null && foreground.isStateful() && foreground.setState(view.getDrawableState())) {
			w.setAttribute("foreground", foreground, true);
		}
		
		if (view.getBackgroundTintList() != null && view.getBackgroundTintList().isStateful()) {
			setBackgroundTint(w, view.getBackgroundTintList());
			w.invalidate();
		}
		
		if (view.getForegroundTintList() != null && view.getForegroundTintList().isStateful()) {
			setForegroundTint(w, view.getForegroundTintList());
			w.invalidate();
		}
		
		w.storeInTempCache("stateChange", null);
	}

	public static Object getColor(Object objValue) {
		if (isColor(objValue)) {
			return objValue;
		}
		
		if (objValue instanceof Integer) {
			return PluginInvoker.getColor(r.android.graphics.Color.formatColor((int) objValue));
		}
		
		throw new RuntimeException("unknown color :" + objValue);
	}

	public static void setDrawableBounds(IWidget widget, int l, int t, int r, int b) {
		widget.setDrawableBounds(l, t, r, b);
		View view = (View) widget.asWidget();
		if (view.getBackground() != null) {
			view.getBackground().setBounds(l, t, r, b);
		}
		
		if (view.getForeground() != null) {
			view.getForeground().setBounds(l, t, r, b);
		}
	}
	
	public static void redrawDrawables(IWidget w) {
		View view = (View) w.asWidget();
		
		r.android.graphics.drawable.Drawable background = view.getBackground();
		if (background != null && background.isRedraw()) {
			setBackground(w, w.asNativeWidget(), background);
			background.setRedraw(false);
		}
		
		r.android.graphics.drawable.Drawable foreground = view.getForeground();
		if (foreground != null && foreground.isRedraw()) {
			setForeground(w, w.asNativeWidget(), background);
			foreground.setRedraw(false);
		}
	}
	


    private static void setMinHeight(IWidget w, Object objValue) {
        ((View) w.asWidget()).setMinimumHeight((int) objValue);
        
    }

    private static void setMinWidth(IWidget w, Object objValue) {
        ((View) w.asWidget()).setMinimumWidth((int) objValue);
    }

    private static Object getMinHeight(IWidget w) {
        View view = (View) w.asWidget();
        return view.getMinimumHeight();
    }

    private static Object getMinWidth(IWidget w) {
        View view = (View) w.asWidget();
        return view.getMinimumWidth();
    }

    private static Object getVisibility(IWidget w) {
        View view = (View) w.asWidget();
        return view.getVisibility();
    }
    
	
	private static void setLongClickable(IWidget w, Object objValue) {
        View view = (View) w.asWidget();
        view.setLongClickable((boolean) objValue); 
	}


	private static Object getLongClickable(IWidget w) {
		View view = (View) w.asWidget();
		return view.isLongClickable();
	}
	
	private static void setDuplicateParentState(IWidget w, Object objValue) {
		View view = (View)w.asWidget();
		view.setDuplicateParentStateEnabled((boolean)objValue);
	}
	
	private static Object getDuplicateParentState(IWidget w) {
		View view = (View)w.asWidget();
		return view.isDuplicateParentStateEnabled();
	}	

	private static Object getClickable(IWidget w) {
		View view = (View)w.asWidget();
		return view.isClickable();
	}
	
	public static void requestLayout(IWidget w) {
		if (w.isInitialised()) {
			w.requestLayout();
		}
	}
	
	
	private static void invalidate(IWidget w) {
		if (w.isInitialised()) {
			w.invalidate();
		}
	}

	private static Object getClipData(DragEvent event) {
		return event.getClipData();
	}
	
	interface AddRemoveCallBack {
		public void addListener(Object listener);
		public void removeListener(Object listener);
	}
	

	public static r.android.graphics.drawable.Drawable getDrawable(
			r.android.content.res.ColorStateList colorStateList) {
		int[][] states = colorStateList.getStates();
		int[] colors = colorStateList.getColors();
		r.android.graphics.drawable.StateListDrawable stateListDrawable = new r.android.graphics.drawable.StateListDrawable();
		for (int i = 0; i < states.length; i++) {
			int[] state = states[i];
			r.android.graphics.drawable.Drawable drawable = new r.android.graphics.drawable.ColorDrawable();
		   	drawable.setDrawable(ViewImpl.getColor(colors[i]));
			stateListDrawable.addState(state, drawable);
		}
		return stateListDrawable;
	}
	
	public static interface PanCallBack {
		void handlePanStart(IWidget widget, Object eventWidget, int x, int y);
		void handlePanDrag(IWidget widget, Object eventWidget, int x, int y);
		void handlePanEnd(IWidget widget, Object eventWidget, int x, int y);
	}

	public static interface AnimationCallBack {
		public void animating(int x, int y);
	}
	
	private static void setElevation(IWidget w, Object objValue) {
		setZIndex(w, ((Float) objValue).intValue());
		
	}

	public static String getValue(String key, org.xml.sax.Attributes attributes) {
		String os = PluginInvoker.getOS().toLowerCase();
		if (attributes.getValue(key + "-" + os) != null) {
			return attributes.getValue(key + "-" + os);
		}
		
		return attributes.getValue(key);
	}
	
	private static void setBottom(IWidget w, Object objValue) {
		Object uiView = w.asNativeWidget();
		View view = (View) w.asWidget();
		int value = (int) objValue;
		view.setBottom(value);

		int top = value - view.getMeasuredHeight();
		int x = getX(uiView);
		nativeMakeFrame(uiView, x, top, x + view.getMeasuredWidth(), value);
	}

	private static void setTop(IWidget w, Object objValue) {
		Object uiView = w.asNativeWidget();
		View view = (View) w.asWidget();
		int value = (int) objValue;
		view.setTop(value);
		int x = getX(uiView);
		nativeMakeFrame(uiView, x, value, x + view.getMeasuredWidth(), value + view.getMeasuredHeight());

		
	}

	private static void setRight(IWidget w, Object objValue) {
		Object uiView = w.asNativeWidget();
		View view = (View) w.asWidget();
		int value = (int) objValue;
		view.setRight(value);
		int y = getY(uiView);
		nativeMakeFrame(uiView, value - view.getMeasuredWidth(), y, value, y + view.getMeasuredHeight());
	}

	private static void setLeft(IWidget w, Object objValue) {
		Object uiView = w.asNativeWidget();
		View view = (View) w.asWidget();
		int value = (int) objValue;
		view.setLeft(value);
		
		int y = getY(uiView);
		nativeMakeFrame(uiView, value, y, value + view.getMeasuredWidth(), y + view.getMeasuredHeight());
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
	
	public static java.util.List<IWidget> drawOverlay(IWidget overlayWrapper, java.util.List<IWidget> overlays) {
		r.android.view.ViewOverlay overlay = ((View) overlayWrapper.asWidget()).getOverlay();
		java.util.List<r.android.graphics.drawable.Drawable> drawables = overlay.getDrawables();
		if (drawables != null) {
			overlayWrapper.setAttribute("swtRedraw", false, true);
			if (overlays == null) {
				overlays = new ArrayList<>();
			} else {
				for (int i = overlays.size() - 1; i >= 0; i--) {
					overlayWrapper.getParent().remove(overlays.get(i));
				}
				
				overlays.clear();
			}
			Map<String, java.util.List> attrs = new java.util.HashMap<>(); 

			for (r.android.graphics.drawable.Drawable drawable : drawables) {
				if (drawable.getSimulatedWidgetLocalName() != null && drawable.getSimulatedWidgetGroupName() != null) {
					IWidget w = WidgetFactory.createWidget(drawable.getSimulatedWidgetLocalName(), drawable.getSimulatedWidgetGroupName(), overlayWrapper.getParent(), false);
					
					
					String[] simulatedWidgetAttrs = drawable.getSimulatedWidgetAttrs();
					
					if (simulatedWidgetAttrs != null) {
						for (int i = 0; i < simulatedWidgetAttrs.length; i++) {
							String attrName = simulatedWidgetAttrs[i];
							Object value = drawable.getAttribute(attrName);
							w.setAttribute(attrName, value, !(value instanceof String));
						}
					}
					
					drawable.setMeasureTextHelper(new r.android.graphics.drawable.Drawable.MeasureTextHelper() {
						@Override
						public float getTextWidth() {
							View view = (View) w.asWidget();
							view.measure(0, 0);
							return view.getMeasuredWidth();
						}
	
						@Override
						public float getTextHeight() {
							View view = (View) w.asWidget();
							view.measure(0, 0);
							return view.getMeasuredHeight();
						}
						
					});
					r.android.graphics.Rect bounds = drawable.getBounds();
					View view = (View) w.asWidget();
					view.setLeft(bounds.left);
					view.setRight(bounds.right);
					view.setTop(bounds.top);
					view.setBottom(bounds.bottom);
					view.measure(0, 0);
					view.relayout();
					view.setOverlay(true);
					overlays.add(w);
				}
				
				String[] viewAttrs = drawable.getViewAttrs();
				if (viewAttrs != null) {
					for (int i = 0; i < viewAttrs.length; i++) {
						String attrName = viewAttrs[i];
						drawable.getBounds();
						Object value = drawable.getAttribute(attrName);
						if (value instanceof java.util.List) {
							java.util.List values = attrs.get(attrName);
							if (values == null) {
								attrs.put(attrName, new java.util.ArrayList<>());
							}
							attrs.get(attrName).addAll((java.util.List) value);
						} else {
							overlayWrapper.setAttribute(attrName, value, !(value instanceof String));
						}
					}
				}
				
				for (String key : attrs.keySet()) {
					overlayWrapper.setAttribute(key, attrs.get(key), true);	
				}
			}
			overlayWrapper.setAttribute("swtRedraw", true, true);
		}
		
		return overlays;
	}

	


	private static void setAnimatorXml(IWidget w, Object objValue) {
 		String value = (String) objValue;
 		if (value.startsWith("@animator/")) {
 			String html = w.getFragment().getInlineResource(value);
 			if (html == null) {
 				html = PluginInvoker.getFileAsset("" + (value).replace("@", "") + ".xml", w.getFragment());
 			}
 			AnimationContentHandler handler = new AnimationContentHandler(w);
			com.ashera.parser.html.HtmlParser.parse(handler, html);
 			r.android.animation.Animator animator = handler.getAnimatorSet();
 			animator.setTarget((View) w.asWidget());
			w.getFragment().addDisposable(animator); 				
 			w.setAnimator(animator); 		
 		}
	}
	
	public static r.android.view.animation.Interpolator getInterpolator(IWidget w, Object objValue) {
		String value = (String) objValue;
		String html = w.getFragment().getInlineResource(value);
		if (html == null) {
			html = PluginInvoker.getFileAsset("" + (value).replace("@", "") + ".xml", w.getFragment());
		}
		AnimationContentHandler handler = new AnimationContentHandler(w);
		com.ashera.parser.html.HtmlParser.parse(handler, html);
		return handler.timeInterpolator;
	}
	
	private static class AnimationContentHandler extends com.ashera.parser.html.ContentHandlerAdapter {
    private final class CustomTypeConverterX
			extends r.android.animation.TypeConverter<r.android.graphics.PointF, Float> {
		private CustomTypeConverterX(Class<r.android.graphics.PointF> fromClass, Class<Float> toClass) {
			super(fromClass, toClass);
		}

		@Override
		public Float convert(r.android.graphics.PointF value) {
		    return value.x;
		}
	}
    
    private final class CustomTypeConverterY
			extends r.android.animation.TypeConverter<r.android.graphics.PointF, Float> {
		private CustomTypeConverterY(Class<r.android.graphics.PointF> fromClass, Class<Float> toClass) {
			super(fromClass, toClass);
		}

		@Override
		public Float convert(r.android.graphics.PointF value) {
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
		private java.util.Stack<ArrayList<r.android.animation.Animator>> childAnimators = new java.util.Stack<>();
		private java.util.Stack<r.android.animation.AnimatorSet> animatorSets = new java.util.Stack<>();
		private r.android.animation.AnimatorSet animatorSet;
		private float arg0;
		private float arg1;
		private float extraTension;
		private float cycles;
		private r.android.view.animation.Interpolator timeInterpolator;
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

		public r.android.animation.AnimatorSet getAnimatorSet() {
			return animatorSet;
		}

		private AnimationContentHandler(IWidget w) {
			this.w = w;
		}

		@Override
		public void startElement(String uri, String localName, String qName, org.xml.sax.Attributes atts) throws org.xml.sax.SAXException {
			switch (localName) {
				case "set": {
					r.android.animation.AnimatorSet animatorSet = new r.android.animation.AnimatorSet();
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
					
					ArrayList<r.android.animation.Animator> childAnims = childAnimators.peek();
					r.android.animation.ObjectAnimator objectAnimator = new r.android.animation.ObjectAnimator();
					parseAnimator(w, objectAnimator, atts);

					if (valueType == VALUE_TYPE_UNDEFINED) {
			            valueType = inferValueTypeFromValues(w, valueFrom, valueTo);
			        }
			        r.android.animation.PropertyValuesHolder pvh = getPVH(w, valueType, valueFrom, valueTo, "");
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
					timeInterpolator = new r.android.view.animation.AccelerateInterpolator(arg0);
				}
				break;
				case "decelerateInterpolator": {
					parseDecelerateInterpolator(w, atts);
					timeInterpolator = new r.android.view.animation.DecelerateInterpolator(arg0);
				}
				break;
				case "cycleInterpolator": {
					parseCycleInterpolator(w, atts);
					timeInterpolator = new r.android.view.animation.CycleInterpolator(arg0);
				}
				break;
				case "anticipateInterpolator": {
					parseAnticipateInterpolator(w, atts);
					timeInterpolator = new r.android.view.animation.AnticipateInterpolator(arg0);
				}
				break;
				case "overshootInterpolator": {
					parseOvershootInterpolator(w, atts);
					timeInterpolator = new r.android.view.animation.OvershootInterpolator(arg0);
				}
				break;
				case "anticipateOvershootInterpolator": {
					parseAnticipateOvershootInterpolator(w, atts);
					if (arg1 != 0) {
						timeInterpolator = new r.android.view.animation.AnticipateOvershootInterpolator(arg0 * arg1);
					} else {
						timeInterpolator = new r.android.view.animation.AnticipateOvershootInterpolator(arg0);
					}
				}
				break;
			}
			
		}

		private void setUpPath(r.android.animation.ObjectAnimator objectAnimator) {
			if (valueType == VALUE_TYPE_PATH || valueType == VALUE_TYPE_UNDEFINED) {
			    // When pathData is defined, we are in case #2 mentioned above. ValueType can only
			    // be float type, or int type. Otherwise we fallback to default type.
			    valueType = VALUE_TYPE_FLOAT;
			}
			if (propertyXName == null && propertyYName == null) {
			    throw new RuntimeException(" propertyXName or propertyYName is needed for PathData");
			} else {
			    r.android.graphics.Path path = r.android.graphics.Path.createPathFromPathData(pathData);
				r.android.animation.PropertyValuesHolder x = null;
				r.android.animation.PropertyValuesHolder y = null;
				if (propertyXName != null) {
					x  = r.android.animation.PropertyValuesHolder.ofObject(new CustomProperty(w.asWidget().getClass(), propertyXName),  new CustomTypeConverterX(r.android.graphics.PointF.class, Float.class), path);
				}
				if (propertyYName != null) {
					y = r.android.animation.PropertyValuesHolder.ofObject(new CustomProperty(w.asWidget().getClass(), propertyYName),  new CustomTypeConverterY(r.android.graphics.PointF.class, Float.class), path);
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
					ArrayList<r.android.animation.Animator> childAnims = childAnimators.pop();
					r.android.animation.AnimatorSet animatorSet = animatorSets.pop();
					int sequenceOrdering = sequenceOrderings.pop();
					if (animatorSet != null && childAnims != null) {
				        r.android.animation.Animator[] animsArray = new r.android.animation.Animator[childAnims.size()];
				        int index = 0;
				        for (r.android.animation.Animator a : childAnims) {
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

		private void setStartOffset(IWidget w, r.android.animation.ValueAnimator animator, String value) {
			animator.setStartDelay((int) w.quickConvert(value, "int"));
		}

		private void setValueType(IWidget w, r.android.animation.ValueAnimator animator, String value) {
			this.valueType = getValueType(value);

		}

		private void setValueTo(IWidget w, r.android.animation.ValueAnimator animator, String value) {
			this.valueTo = value;

		}

		private void setValueFrom(IWidget w, r.android.animation.ValueAnimator animator, String value) {
			this.valueFrom = value;

		}

		private void setInterpolator(IWidget w, r.android.animation.ValueAnimator animator, String value) {
 			String html = w.getFragment().getInlineResource(value);
 			if (html == null) {
 				html = PluginInvoker.getFileAsset("" + (value).replace("@", "") + ".xml", w.getFragment());
 			}
 			timeInterpolator = null;
			com.ashera.parser.html.HtmlParser.parse(this, html);
			animator.setInterpolator(timeInterpolator);
		}

		private void setPathData(IWidget w, r.android.animation.ObjectAnimator animator, String value) {
			this.pathData = value;
		}

		private void setPropertyYName(IWidget w, r.android.animation.ObjectAnimator animator, String value) {
			this.propertyYName = value;
		}

		private void setPropertyXName(IWidget w, r.android.animation.ObjectAnimator animator, String value) {
			this.propertyXName = value;
		}

		private void setOrdering(IWidget w, r.android.animation.AnimatorSet animatorSet, String value) {
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

		private static r.android.animation.PropertyValuesHolder getPVH(IWidget w, int valueType, String valueFromId,
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

			r.android.animation.PropertyValuesHolder returnValue = null;

			if (valueType == VALUE_TYPE_PATH) {

			} else {
				r.android.animation.TypeEvaluator evaluator = null;
				// Integer and float value types are handled here.
				if (valueType == VALUE_TYPE_COLOR) {
					// special case for colors: ignore valueType and get ints
					evaluator = new r.android.animation.ArgbEvaluator();
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
							returnValue = r.android.animation.PropertyValuesHolder.ofFloat(propertyName, valueFrom,
									valueTo);
						} else {
							returnValue = r.android.animation.PropertyValuesHolder.ofFloat(propertyName, valueFrom);
						}
					} else {
						if (isDimen(valueToId)) {
							valueTo = (float) w.quickConvert(valueToId, "dimensionfloat");
						} else {
							valueTo = (float) w.quickConvert(valueToId, "float");
						}
						returnValue = r.android.animation.PropertyValuesHolder.ofFloat(propertyName, valueTo);
					}
				} else {
					int valueFrom;
					int valueTo;
					if (hasFrom) {
						if (isDimen(valueFromId)) {
							valueFrom = (int) w.quickConvert(valueFromId, "dimension");
						} else if (isColor(valueFromId)) {
							valueFrom = r.android.graphics.Color.parseColor(valueFromId);
						} else {
							valueFrom = (int) w.quickConvert(valueFromId, "int");
						}
						if (hasTo) {
							if (isDimen(valueToId)) {
								valueTo = (int) w.quickConvert(valueToId, "dimension");
							} else if (isColor(valueToId)) {
								valueTo = r.android.graphics.Color.parseColor(valueToId);
							} else {
								valueTo = (int) w.quickConvert(valueToId, "int");
							}
							returnValue = r.android.animation.PropertyValuesHolder.ofInt(propertyName, valueFrom,
									valueTo);
						} else {
							returnValue = r.android.animation.PropertyValuesHolder.ofInt(propertyName, valueFrom);
						}
					} else {
						if (hasTo) {
							if (isDimen(valueToId)) {
								valueTo = (int) w.quickConvert(valueToId, "dimension");
							} else if (isColor(valueToId)) {
								valueTo = r.android.graphics.Color.parseColor(valueToId);
							} else {
								valueTo = (int) w.quickConvert(valueToId, "int");
							}
							returnValue = r.android.animation.PropertyValuesHolder.ofInt(propertyName, valueTo);
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
private void parseAnimator(IWidget w,  r.android.animation.ValueAnimator animator,  org.xml.sax.Attributes atts) {
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

private void setDuration(IWidget w,  r.android.animation.ValueAnimator animator, String strValue) {
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

private void setRepeatCount(IWidget w,  r.android.animation.ValueAnimator animator, String strValue) {
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

private void setRepeatMode(IWidget w,  r.android.animation.ValueAnimator animator, String strValue) {
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
private void parsePropertyAnimator(IWidget w,  r.android.animation.ObjectAnimator animator,  org.xml.sax.Attributes atts) {
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

private void setPropertyName(IWidget w,  r.android.animation.ObjectAnimator animator, String strValue) {
animator.setPropertyName((String) w.quickConvert(strValue, "resourcestring"));
}

//end - PropertyAnimator


	//start - AnimatorSet
private void parseAnimatorSet(IWidget w,  r.android.animation.AnimatorSet animatorSet,  org.xml.sax.Attributes atts) {
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
	


	public static void addEventInfo(Map<String, Object> obj, MenuItem item) {
		obj.put("itemId", IdGenerator.getName(item.getItemId()));
		if (item.getActionView() != null && item.getActionView().getTag() != null) {
			obj.put("actionLayoutId", item.getActionView().getTag());
		}
	}
	


	private static class CustomProperty<T, V> extends r.android.util.Property<Object, Object> {
		private String name;
		public CustomProperty(Class<Object> type, String name) {
			super(type, name);
			this.name = name;
		}

		@Override
		public V get(Object object) {
			return null;
		}
		
		@Override
		public void set(Object object, Object value) {
			if (object instanceof r.android.view.View) {
				((r.android.view.View) object).setMyAttribute(name, value);
			}
		}
		
	}
	

	public static native void setBackgroundColor(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).backgroundColor = (UIColor*) value;
]-*/;
	public static native Object getBackgroundColor(Object uiView)/*-[
return ((UIView*) uiView).backgroundColor;
  ]-*/;
	public static native void setIsHidden(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).hidden = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public static native Object getIsHidden(Object uiView)/*-[
return [JavaLangBoolean valueOfWithBoolean :((UIView*) uiView).hidden];
  ]-*/;
	public static native void setAlpha(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).alpha = [(JavaLangFloat*) value floatValue];
]-*/;
	public static native Object getAlpha(Object uiView)/*-[
return [JavaLangFloat valueOfWithFloat :((UIView*) uiView).alpha];
  ]-*/;
	public static native void setIsOpaque(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).opaque = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public static native Object getIsOpaque(Object uiView)/*-[
return [JavaLangBoolean valueOfWithBoolean :((UIView*) uiView).opaque];
  ]-*/;
	public static native void setTintColor(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).tintColor = (UIColor*) value;
]-*/;
	public static native Object getTintColor(Object uiView)/*-[
return ((UIView*) uiView).tintColor;
  ]-*/;
	public static native void setClipsToBounds(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).clipsToBounds = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public static native Object getClipsToBounds(Object uiView)/*-[
return [JavaLangBoolean valueOfWithBoolean :((UIView*) uiView).clipsToBounds];
  ]-*/;
	public static native void setClearsContextBeforeDrawing(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).clearsContextBeforeDrawing = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public static native Object getClearsContextBeforeDrawing(Object uiView)/*-[
return [JavaLangBoolean valueOfWithBoolean :((UIView*) uiView).clearsContextBeforeDrawing];
  ]-*/;
	public static native void setIsUserInteractionEnabled(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).userInteractionEnabled = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public static native Object getIsUserInteractionEnabled(Object uiView)/*-[
return [JavaLangBoolean valueOfWithBoolean :((UIView*) uiView).userInteractionEnabled];
  ]-*/;
	public static native void setIsMultipleTouchEnabled(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).multipleTouchEnabled = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public static native Object getIsMultipleTouchEnabled(Object uiView)/*-[
return [JavaLangBoolean valueOfWithBoolean :((UIView*) uiView).multipleTouchEnabled];
  ]-*/;
	public static native void setIsExclusiveTouch(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).exclusiveTouch = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public static native Object getIsExclusiveTouch(Object uiView)/*-[
return [JavaLangBoolean valueOfWithBoolean :((UIView*) uiView).exclusiveTouch];
  ]-*/;
	public static native void setPreservesSuperviewLayoutMargins(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).preservesSuperviewLayoutMargins = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public static native Object getPreservesSuperviewLayoutMargins(Object uiView)/*-[
return [JavaLangBoolean valueOfWithBoolean :((UIView*) uiView).preservesSuperviewLayoutMargins];
  ]-*/;
	public static native void setInsetsLayoutMarginsFromSafeArea(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).insetsLayoutMarginsFromSafeArea = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public static native Object getInsetsLayoutMarginsFromSafeArea(Object uiView)/*-[
return [JavaLangBoolean valueOfWithBoolean :((UIView*) uiView).insetsLayoutMarginsFromSafeArea];
  ]-*/;
	public static native void setAutoresizesSubviews(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).autoresizesSubviews = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public static native Object getAutoresizesSubviews(Object uiView)/*-[
return [JavaLangBoolean valueOfWithBoolean :((UIView*) uiView).autoresizesSubviews];
  ]-*/;
	public static native void setTranslatesAutoresizingMaskIntoConstraints(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).translatesAutoresizingMaskIntoConstraints = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public static native Object getTranslatesAutoresizingMaskIntoConstraints(Object uiView)/*-[
return [JavaLangBoolean valueOfWithBoolean :((UIView*) uiView).translatesAutoresizingMaskIntoConstraints];
  ]-*/;
	public static native void setContentScaleFactor(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).contentScaleFactor = [(JavaLangFloat*) value floatValue];
]-*/;
	public static native Object getContentScaleFactor(Object uiView)/*-[
return [JavaLangFloat valueOfWithFloat :((UIView*) uiView).contentScaleFactor];
  ]-*/;
	public static native Object getIsFocused(Object uiView)/*-[
return [JavaLangBoolean valueOfWithBoolean :((UIView*) uiView).focused];
  ]-*/;
	public static native void setRestorationIdentifier(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).restorationIdentifier = (NSString*) value;
]-*/;
	public static native Object getRestorationIdentifier(Object uiView)/*-[
return ((UIView*) uiView).restorationIdentifier;
  ]-*/;
	public static native void setTag(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).tag = [(JavaLangInteger*) value intValue];
]-*/;
	public static native Object getTag(Object uiView)/*-[
return [JavaLangInteger valueOfWithInt :((UIView*) uiView).tag];
  ]-*/;
	public static native void setAccessibilityIgnoresInvertColors(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).accessibilityIgnoresInvertColors = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public static native Object getAccessibilityIgnoresInvertColors(Object uiView)/*-[
return [JavaLangBoolean valueOfWithBoolean :((UIView*) uiView).accessibilityIgnoresInvertColors];
  ]-*/;
	public static native void setLargeContentImage(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).largeContentImage = (UIImage*) value;
]-*/;
	public static native Object getLargeContentImage(Object uiView)/*-[
return ((UIView*) uiView).largeContentImage;
  ]-*/;
	public static native void setLargeContentTitle(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).largeContentTitle = (NSString*) value;
]-*/;
	public static native Object getLargeContentTitle(Object uiView)/*-[
return ((UIView*) uiView).largeContentTitle;
  ]-*/;
	public static native void setScalesLargeContentImage(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).scalesLargeContentImage = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public static native Object getScalesLargeContentImage(Object uiView)/*-[
return [JavaLangBoolean valueOfWithBoolean :((UIView*) uiView).scalesLargeContentImage];
  ]-*/;
	public static native void setShowsLargeContentViewer(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).showsLargeContentViewer = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public static native Object getShowsLargeContentViewer(Object uiView)/*-[
return [JavaLangBoolean valueOfWithBoolean :((UIView*) uiView).showsLargeContentViewer];
  ]-*/;
	public static native void setIsAccessibilityElement(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).isAccessibilityElement = [(JavaLangBoolean*) value booleanValue];
]-*/;
	public static native Object getIsAccessibilityElement(Object uiView)/*-[
return [JavaLangBoolean valueOfWithBoolean :((UIView*) uiView).isAccessibilityElement];
  ]-*/;
	public static native void setAccessibilityLabel(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).accessibilityLabel = (NSString*) value;
]-*/;
	public static native Object getAccessibilityLabel(Object uiView)/*-[
return ((UIView*) uiView).accessibilityLabel;
  ]-*/;
	public static native void setAccessibilityHint(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).accessibilityHint = (NSString*) value;
]-*/;
	public static native Object getAccessibilityHint(Object uiView)/*-[
return ((UIView*) uiView).accessibilityHint;
  ]-*/;
	public static native void setAccessibilityValue(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).accessibilityValue = (NSString*) value;
]-*/;
	public static native Object getAccessibilityValue(Object uiView)/*-[
return ((UIView*) uiView).accessibilityValue;
  ]-*/;
	public static native void setAccessibilityTraits(Object nativeWidget, Object value)/*-[
((UIView*) nativeWidget).accessibilityTraits = [(JavaLangInteger*) value intValue];
]-*/;
	public static native Object getAccessibilityTraits(Object uiView)/*-[
return [JavaLangInteger valueOfWithInt :((UIView*) uiView).accessibilityTraits];
  ]-*/;
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
public void onAnimationStart(r.android.animation.Animator animation){
    
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

public java.util.Map<String, Object> getOnAnimationStartEventObj(r.android.animation.Animator animation) {
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
}public void onAnimationEnd(r.android.animation.Animator animation){
    
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

public java.util.Map<String, Object> getOnAnimationEndEventObj(r.android.animation.Animator animation) {
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
}public void onAnimationCancel(r.android.animation.Animator animation){
    
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

public java.util.Map<String, Object> getOnAnimationCancelEventObj(r.android.animation.Animator animation) {
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
}public void onAnimationRepeat(r.android.animation.Animator animation){
    
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

public java.util.Map<String, Object> getOnAnimationRepeatEventObj(r.android.animation.Animator animation) {
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


	// end - body
	public native static void nativeMakeFrame(Object uiView, int l, int t, int r, int b, int height)/*-[
		[((UIView*) uiView) setFrame:CGRectMake(l, t, r-l, b-t)];
		((UIScrollView*) uiView).contentSize = CGSizeMake(r-l, height);
	]-*/;
	
	public native static void updateBounds(Object objview, int x, int y, int width, int height)/*-[
		UIView* uiview = ((UIView*) objview);
		uiview.frame = CGRectMake(x, y, width, height);
	]-*/;
	
	public native static Object getFirstChildOrSelf(Object objview)/*-[
		UIView* uiview = ((UIView*) objview);
		return uiview.subviews.count > 0 ? uiview.subviews[0] : uiview;
	]-*/;
	
	public native static void nativeMakeFrameForHorizontalScrollView(Object uiView, int l, int t, int r, int b, int width)/*-[
		[((UIView*) uiView) setFrame:CGRectMake(l, t, r-l, b-t)];
		((UIScrollView*) uiView).contentSize = CGSizeMake(width, b-t);
	]-*/;
	
	public native static void nativeMakeFrame(Object uiView, int l, int t, int r, int b)/*-[
			if ([uiView isKindOfClass:[UIViewController class]]) {
				[((UIViewController*) uiView).view setFrame:CGRectMake(l, t, r-l, b-t)];
			} else {
				[((UIView*) uiView) setFrame:CGRectMake(l, t, r-l, b-t)];
			}  	
	]-*/;

	public static boolean isRTLLayout(IWidget widget) {
		return isRTLLayout();
	}
	
	public native static boolean isRTLLayout()/*-[
		return [UIApplication sharedApplication].userInterfaceLayoutDirection == UIUserInterfaceLayoutDirectionRightToLeft;
	]-*/;

	private static void setBgOnControl(IWidget w, Object uiview, Object objValue) {
		if (objValue instanceof r.android.content.res.ColorStateList) {
			objValue = ((r.android.content.res.ColorStateList) objValue).getColorForState(((View) w.asWidget()).getDrawableState(), r.android.graphics.Color.TRANSPARENT);
		}
		if (isColor(objValue) || objValue instanceof Integer) {
			if (objValue instanceof Integer) {
				objValue = ViewImpl.getColor(objValue);
			}
			nativeSetBgColor(uiview, objValue);
		} else {
			clearBgColor(uiview, objValue);
		}
		
		if (isImage(objValue)) {
			w.applyAttributeCommand("background", "drawImage", new String[] {}, true);
		} else {
			w.applyAttributeCommand("background", "drawImage", new String[] {}, false);
		}
		
		// redraw image
		if (w.isInitialised()) {
			w.invalidate();
		}
	}
    
	private static void setBackground(IWidget w, Object nativeView, Object objValue) {
		if (objValue instanceof r.android.graphics.drawable.Drawable) {
			View view = (View) w.asWidget();
			r.android.graphics.drawable.Drawable drawable = (r.android.graphics.drawable.Drawable)objValue;
			view.setBackground(drawable);
			
			objValue = drawable.getDrawable();
		}
		if (isResizableImage(objValue)) {
			View view = (View) w.asWidget();
			r.android.graphics.drawable.Drawable drawable = view.getBackground();
			
			if (drawable == null) {
				drawable = new r.android.graphics.drawable.Drawable();
			}
			drawable.setMinimumWidth(getImageWidth(objValue));
			drawable.setMinimumHeight(getImageHeight(objValue));
			view.setBackground(drawable);
		}
		
		setBgOnControl(w, nativeView, objValue);

	}
	
	private static void updateWidthAndHeight(IWidget w, r.android.graphics.drawable.StateListDrawable background, Object value, String type, String conveterType) {
		if (isImage(value)) {
			background.setMinimumWidth(getImageWidth(value));
		    background.setMinimumHeight(getImageHeight(value));
		    w.applyAttributeCommand(type, conveterType, new String[] {}, true);
		}
	}
	
	public static void setBgDrawabeOnView(int width, int height, View view) {
		 r.android.graphics.drawable.Drawable background = view.getBackground();
         if (background == null) {
         	background = new r.android.graphics.drawable.Drawable();
         }
	    background.setMinimumWidth(width);
	    background.setMinimumHeight(height);
	    view.setBackground(background);
	}
	
	public static native boolean isColor(Object value)/*-[
		return[value isKindOfClass:[UIColor class]];
	]-*/;
	
	private static boolean isResizableImage(Object obj) {
		return (obj != null && obj.getClass().getName().equals("_UIResizableImage"));
	}

	public static native boolean isImage(Object value)/*-[
		return[value isKindOfClass:[UIImage class]];
	]-*/;
	
	public static native int getImageWidth(Object value)/*-[
		UIImage* image = ((UIImage*) value);
		return image.size.width;
	]-*/;
	
	public static native int getImageHeight(Object value)/*-[
		UIImage* image = ((UIImage*) value);
		return image.size.height;
	]-*/;

	private static native void clearBgColor(Object view, Object value)/*-[
		((UIView *) view).backgroundColor = [UIColor clearColor];
	]-*/;
	private static native void nativeSetBgColor(Object view, Object value)/*-[
		((UIView *) view).backgroundColor = value;
	]-*/;
	
	
	private static void setOnClick(IWidget w, Object nativeView, Object objValue) {
		View.OnClickListener onClickListener;
		
		if (objValue instanceof String) {
			onClickListener = new OnClickListener(w, (String) objValue);
		} else {
			onClickListener = (View.OnClickListener) objValue;
		}
		if (onClickListener != null) {
			setOnClick(w, "default", nativeView, onClickListener);
		}
	}

	public static void setOnClick(IWidget w, String id, Object nativeView, View.OnClickListener onClickListener) {
		UITapGestureRecognizerDelegate delegate = new UITapGestureRecognizerDelegate(w, onClickListener);
		delegate.nativeAddClickListener(id, nativeView);
	}
	
	static class UIControlEventTouchDelegate {
		@com.google.j2objc.annotations.Weak private IWidget  widget;
		private View.OnTouchListener listener;
		public UIControlEventTouchDelegate(IWidget widget, View.OnTouchListener listener) {
			// to avoid gc in objective c
			widget.getFragment().addListener(widget, this);
			this.widget = widget;
			this.listener = listener;
		}
		public void onTouchDown(int x, int y, int rawX, int rawY) {
			sendEvent(x, y, rawX, rawY, MotionEvent.ACTION_DOWN);
		}
		
		public void onTouchUp(int x, int y, int rawX, int rawY) {
			sendEvent(x, y, rawX, rawY, MotionEvent.ACTION_UP);
		}
		public void onTouchMove(int x, int y, int rawX, int rawY) {
			sendEvent(x, y, rawX, rawY, MotionEvent.ACTION_MOVE);
		}
		
		public void onTouchCancel(int x, int y, int rawX, int rawY) {
			sendEvent(x, y, rawX, rawY, MotionEvent.ACTION_CANCEL);
		}
		
		public void onTouchOutside(int x, int y, int rawX, int rawY) {
			sendEvent(x, y, rawX, rawY, MotionEvent.ACTION_OUTSIDE);
		}
		
		public void sendEvent(int x, int y, int rawX, int rawY, int action) {
			r.android.view.MotionEvent motionEvent = new r.android.view.MotionEvent();
			motionEvent.setAction(action);
			motionEvent.setX(x);
			motionEvent.setY(y);
			motionEvent.setRawX(rawX);
			motionEvent.setRawY(rawY);
			listener.onTouch((View) widget.asWidget(), motionEvent);
			System.out.println("action " + action);
		}
		
		public native void nativeAddOnTouchListener(Object nativeWidget)/*-[
			UIView* view = ((UIView*)nativeWidget);
			view.userInteractionEnabled = YES;
			if ([nativeWidget isKindOfClass:[UIControl class]]) {
				UIControl* control = ((UIControl*)nativeWidget);
				[control removeTarget:nil action:NULL forControlEvents:UIControlEventAllEvents];
				[control addTarget:self action:@selector(touchDown:withEvent:) forControlEvents:UIControlEventTouchDown];
				[control addTarget:self action:@selector(touchUpInside:withEvent:) forControlEvents:UIControlEventTouchUpInside];
				[control addTarget:self action:@selector(touchMove:withEvent:) forControlEvents:UIControlEventTouchDragInside];
				[control addTarget:self action:@selector(touchMove:withEvent:) forControlEvents:UIControlEventTouchDragOutside];
				[control addTarget:self action:@selector(touchUpOutside:withEvent:) forControlEvents:UIControlEventTouchUpOutside];
				[control addTarget:self action:@selector(touchCancel:withEvent:) forControlEvents:UIControlEventTouchCancel];

			}
		]-*/;
		
		/*-[
		- (void)touchDown:(id)sender withEvent:(UIEvent *) event{
		 	UITouch* touchEvent = [event.allTouches allObjects][0];
    		CGPoint pointInView = [touchEvent locationInView:sender];
    		CGPoint pointInWindow = [touchEvent locationInView:((UIControl*)sender).window];
			[self onTouchDownWithInt:pointInView.x withInt:pointInView.y withInt:pointInWindow.x withInt:pointInWindow.y];
		}
		- (void)touchUpInside:(id)sender withEvent:(UIEvent *) event{
			UITouch* touchEvent = [event.allTouches allObjects][0];
    		CGPoint pointInView = [touchEvent locationInView:sender];
    		CGPoint pointInWindow = [touchEvent locationInView:((UIControl*)sender).window];
			[self onTouchUpWithInt:pointInView.x withInt:pointInView.y withInt:pointInWindow.x withInt:pointInWindow.y];
		}
		- (void)touchMove:(id)sender withEvent:(UIEvent *) event{
			UITouch* touchEvent = [event.allTouches allObjects][0];
    		CGPoint pointInView = [touchEvent locationInView:sender];
    		CGPoint pointInWindow = [touchEvent locationInView:((UIControl*)sender).window];
			[self onTouchMoveWithInt:pointInView.x withInt:pointInView.y withInt:pointInWindow.x withInt:pointInWindow.y];
		}
		- (void)touchUpOutside:(id)sender withEvent:(UIEvent *) event{
			UITouch* touchEvent = [event.allTouches allObjects][0];
    		CGPoint pointInView = [touchEvent locationInView:sender];
    		CGPoint pointInWindow = [touchEvent locationInView:((UIControl*)sender).window];
			[self onTouchOutsideWithInt:pointInView.x withInt:pointInView.y withInt:pointInWindow.x withInt:pointInWindow.y];
		}
		- (void)touchCancel:(id)sender withEvent:(UIEvent *) event{
			UITouch* touchEvent = [event.allTouches allObjects][0];
    		CGPoint pointInView = [touchEvent locationInView:sender];
    		CGPoint pointInWindow = [touchEvent locationInView:((UIControl*)sender).window];
			[self onTouchCancelWithInt:pointInView.x withInt:pointInView.y withInt:pointInWindow.x withInt:pointInWindow.y];
		}
		
		]-*/;		
	}
	
	static class UILongTapGestureRecognizerDelegate {
		@com.google.j2objc.annotations.Weak private IWidget  widget;
		private View.OnLongClickListener listener;
		public UILongTapGestureRecognizerDelegate(IWidget widget, View.OnLongClickListener listener) {
			// to avoid gc in objective c
			widget.getFragment().addListener(widget, this);
			this.widget = widget;
			this.listener = listener;
		}
		public native void nativeAddLongClickListener(Object nativeWidget)/*-[
			UIView* view = ((UIView*)nativeWidget);
			ASUILongTapGestureRecognizer *gestureRecognizer = [[ASUILongTapGestureRecognizer alloc] initWithTarget:self action:@selector(longPressDetected:)];
	    	view.userInteractionEnabled = YES;		
			
			for (UIGestureRecognizer* interaction in view.gestureRecognizers) {
		        if ([interaction isKindOfClass:[ASUILongTapGestureRecognizer class]]) {
		            [view removeGestureRecognizer:interaction];
		        }
		    }
			[view addGestureRecognizer:gestureRecognizer];
		]-*/;
		
		
		public void onLongClick() {
			listener.onLongClick((View) widget.asWidget());
		}
		/*-[
	 	- (void)longPressDetected:(ASUILongTapGestureRecognizer *)tapRecognizer {
	 		ADView* adView = (ADView*)[widget_ asWidget];
	 		if ([adView isLongClickable]) {
	  			if (tapRecognizer.state == UIGestureRecognizerStateEnded) {
	        		[self onLongClick];
	    		}
    		}
		}
		]-*/
	}
	
	static class UITapGestureRecognizerDelegate {
		@com.google.j2objc.annotations.Weak private IWidget  widget;
		private View.OnClickListener listener;
		public UITapGestureRecognizerDelegate(IWidget widget, View.OnClickListener listener) {
			// to avoid gc in objective c
			widget.getFragment().addListener(widget, this);
			this.widget = widget;
			this.listener = listener;
		}
		public native void nativeAddClickListener(String id, Object nativeWidget)/*-[
			UIView* view = ((UIView*)nativeWidget);
			ASUITapGestureRecognizer *gestureRecognizer = [[ASUITapGestureRecognizer alloc] initWithTarget:self action:@selector(tapDetected:)];
	    	view.userInteractionEnabled = YES;		
			gestureRecognizer.numberOfTapsRequired = 1;
			gestureRecognizer.id = id_;
			
			for (UIGestureRecognizer* interaction in view.gestureRecognizers) {
		        if ([interaction isKindOfClass:[ASUITapGestureRecognizer class]] && [id_ isEqualToString:((ASUITapGestureRecognizer*)interaction).id]) {
		            [view removeGestureRecognizer:interaction];
		        }
		    }
			[view addGestureRecognizer:gestureRecognizer];
		]-*/;
		
		
		public void click() {
			listener.onClick((View) widget.asWidget());
		}
		/*-[
	 	- (void)tapDetected:(ASUITapGestureRecognizer *)tapRecognizer {
	 		if (tapRecognizer.state == UIGestureRecognizerStateEnded) {
  				[self click];
  			}
		}
		]-*/
	}
	
    public static void registerCommandConveter(IWidget widget) {
		widget.registerForAttributeCommandChainWithPhase("predraw", "background");
		widget.registerForAttributeCommandChainWithPhase("postdraw", "foreground");
		
		String[] tranformAttrs = new String[] { "translationX", "translationY", "translationZ", "scaleX", "scaleY",
				"rotation", "rotationX", "rotationY", "transformPivotX", "transformPivotY"
		};
		widget.registerForAttributeCommandChainWithPhase("preframe", tranformAttrs);
		widget.registerForAttributeCommandChainWithPhase("postframe", tranformAttrs);

	}
    
	private static boolean isNativeRtlSupported() {
		return false;
	}
	
    public static Object getParent(IWidget widget) {        
    	Object parent = widget.getParent().getCompositeLeaf(widget).asNativeWidget();
        return parent;
    }
    
	
	private static void setBackgroundTintMode(IWidget w, Object objValue) {
		w.applyAttributeCommand("background", "cgTintColor", new String[] {"backgroundTintMode"}, true, "drawableTintMode", objValue);
	}

	private static void setBackgroundTint(IWidget w,Object objValue) {
		r.android.content.res.ColorStateList colorStateList = (r.android.content.res.ColorStateList) objValue;
		View view = (View)w.asWidget();
		view.setBackgroundTintList(colorStateList);
		
		w.applyAttributeCommand("background", "cgTintColor", new String[] {"backgroundTint"}, true, "drawableTint", objValue);		
	}
	

	private static void setForegroundTintMode(IWidget w, Object objValue) {
		w.applyAttributeCommand("foreground", "cgTintColor", new String[] {"foregroundTintMode"}, true, "drawableTintMode", objValue);
	}

	private static void setForegroundTint(IWidget w, Object objValue) {
		r.android.content.res.ColorStateList colorStateList = (r.android.content.res.ColorStateList) objValue;
		View view = (View)w.asWidget();
		view.setForegroundTintList(colorStateList);
		w.applyAttributeCommand("foreground", "cgTintColor", new String[] {"foregroundTint"}, true, "drawableTint", objValue);		
	}

	private static void setForeground(IWidget w, Object nativeWidget, Object objValue) {
		w.addForegroundIfNeeded();

		if (objValue instanceof r.android.graphics.drawable.Drawable) {
			r.android.graphics.drawable.Drawable drawable = (r.android.graphics.drawable.Drawable)objValue;
			((View) w.asWidget()).setForeground(drawable);
			
			objValue = drawable.getDrawable();
		}
		
		setFgOnControl(w, nativeWidget, objValue);
	}
	
	private static void setFgOnControl(IWidget w, Object nativeWidget, Object objValue) {
		if (isImage(objValue) || isColor(objValue)) {
			w.applyAttributeCommand("foreground", "drawImageOrColor", new String[] {}, true);
		} else {
			w.applyAttributeCommand("foreground", "drawImageOrColor", new String[] {}, false);
		}
	}

	public static void setVisibility(IWidget w, Object nativeWidget, Object objValue) {
		 View view = (View) w.asWidget();
	     view.setVisibility((int) objValue);	
	}
	
	public static native void nativeSetVisibility(Object view, boolean hidden)/*-[
		[((UIView *) view) setHidden:  hidden];
	]-*/;


	private static Object getClickable(Object nativeWidget) {
		return nativeGetClickable(nativeWidget);
	}
	
	private native static boolean nativeGetClickable(Object view) /*-[
		return ((UIView *) view).userInteractionEnabled;
	]-*/;
	
	
	private static void setClickable(IWidget w, Object nativeWidget, Object objValue) {
		nativeSetClickable(nativeWidget, (boolean) objValue);
		View view = (View)w.asWidget();
		view.setClickable((boolean)objValue);
	}
	
	
	private static native void nativeSetClickable(Object view, boolean clickable)/*-[
		((UIView *) view).userInteractionEnabled = clickable;
	]-*/;


	private static void setOnLongClick(IWidget w, Object nativeView, Object objValue) {
		View.OnLongClickListener listener;
		if (objValue instanceof String) {
			listener = new OnLongClickListener(w, (String) objValue);
		} else {
			listener = (View.OnLongClickListener) objValue;
		}
		setOnLongClick(w, nativeView, listener);		
	}

	public static void setOnLongClick(IWidget w, Object nativeView, View.OnLongClickListener listener) {
		setLongClickable(w, true);
		UILongTapGestureRecognizerDelegate delegate = new UILongTapGestureRecognizerDelegate(w, listener);
		delegate.nativeAddLongClickListener(nativeView);
	}
	
	
	private static void setTranslationX(IWidget w, Object objValue) {
		w.applyAttributeCommand("translationX", "transform", new String[] {}, true, "translationX", objValue);
		relayout(w);
	}

	private static void relayout(IWidget w) {
		if (w.isInitialised()) {			
			((View) w.asWidget()).relayout();
		}
	}

	private static void setTranslationY(IWidget w, Object objValue) {
		w.applyAttributeCommand("translationY", "transform", new String[] {}, true, "translationY", objValue);
		relayout(w);
	}

	private static void setTranslationZ(IWidget w, Object objValue) {
		w.applyAttributeCommand("translationZ", "transform", new String[] {}, true, "translationZ", objValue);
		relayout(w);
	}

	private static void setTransformPivotY(IWidget w, Object objValue) {
		w.applyAttributeCommand("transformPivotY", "transform", new String[] {}, true, "transformPivotY", objValue);
		relayout(w);
	}

	private static void setTransformPivotX(IWidget w, Object objValue) {
		w.applyAttributeCommand("transformPivotX", "transform", new String[] {}, true, "transformPivotX", objValue);
		relayout(w);
	}

	private static void setScaleY(IWidget w, Object objValue) {
		w.applyAttributeCommand("scaleY", "transform", new String[] {}, true, "scaleY", objValue);
		relayout(w);
	}

	private static void setScaleX(IWidget w, Object objValue) {
		w.applyAttributeCommand("scaleX", "transform", new String[] {}, true, "scaleX", objValue);
		relayout(w);
	}

	private static void setRotationY(IWidget w, Object objValue) {
		w.applyAttributeCommand("rotationY", "transform", new String[] {}, true, "rotationY", objValue);	
		relayout(w);
	}

	private static void setRotationX(IWidget w, Object objValue) {
		w.applyAttributeCommand("rotationX", "transform", new String[] {}, true, "rotationX", objValue);	
		relayout(w);
	}

	private static void setRotation(IWidget w, Object objValue) {
		w.applyAttributeCommand("rotation", "transform", new String[] {}, true, "rotation", objValue);
		relayout(w);
	}
	
	
	private static Object getTranslationX(IWidget w) {
		return w.getAttributeCommandValue("translationX", "transform", "translationX");
	}


	private static Object getTransformPivotY(IWidget w) {
		return w.getAttributeCommandValue("transformPivotY", "transform", "transformPivotY");
	}

	private static Object getTransformPivotX(IWidget w) {
		return w.getAttributeCommandValue("transformPivotX", "transform", "transformPivotX");
	}

	private static Object getScaleY(IWidget w) {
		return w.getAttributeCommandValue("scaleY", "transform", "scaleY");
	}

	private static Object getScaleX(IWidget w) {
		return w.getAttributeCommandValue( "scaleX", "transform", "scaleX");
	}

	private static Object getRotationY(IWidget w) {
		return w.getAttributeCommandValue("rotationY", "transform", "rotationY");
	}

	private static Object getRotationX(IWidget w) {
		return w.getAttributeCommandValue("rotationX", "transform", "rotationX");
	}

	private static Object getRotation(IWidget w) {
		return w.getAttributeCommandValue("rotation", "transform", "rotation");
	}

	private static Object getTranslationZ(IWidget w) {
		return w.getAttributeCommandValue("translationZ", "transform", "translationZ");
	}

	private static Object getTranslationY(IWidget w) {
		return w.getAttributeCommandValue("translationY", "transform", "translationY");
	}

	private static Object getForegroundTint(IWidget w) {
		return ((View) w.asWidget()).getForegroundTintList();
	}

	private static Object getForegroundTintMode(IWidget w) {
		return w.getAttributeCommandValue("foreground", "cgTintColor", "drawableTintMode");
	}

	private static Object getBackgroundTintMode(IWidget w) {
		return w.getAttributeCommandValue("background", "cgTintColor", "drawableTintMode");
	}

	private static Object getBackgroundTint(IWidget w) {
		return ((View) w.asWidget()).getBackgroundTintList();
	}
	
	public static void requestLayout(IWidget w, Object nativeView) {
		View view = (View) w.asWidget();
		view.requestLayout();
		nativeRequestLayout(nativeView);
	}
	
	public static void invalidate(IWidget w, Object nativeView) {
		nativeInvalidate(nativeView);
	}
	
	public static native void nativeRequestLayout(Object view)/*-[
		[((UIView *) view) setNeedsLayout];
	]-*/;
	
	public static native void nativeInvalidate(Object view)/*-[
		[((UIView *) view) setNeedsDisplay];
	]-*/;
	
	public static native void setKeepScreenOn(Object nativeWidget, Object value)/*-[
		[UIApplication sharedApplication].idleTimerDisabled = [(JavaLangBoolean*) value booleanValue];
	]-*/;
	public static native Object getKeepScreenOn(Object uiView)/*-[
		return [JavaLangBoolean valueOfWithBoolean :[UIApplication sharedApplication].idleTimerDisabled];
  ]-*/;


	private static boolean isMirrorSupported() {
		return false;
	}
	private static void setOnTouch(IWidget w, Object nativeView, Object objValue) {
		w.storeUserData("touchEvent", objValue);
		
		View.OnTouchListener onTouchListener;
		
		if (objValue instanceof String) {
			onTouchListener = new OnTouchListener(w, (String) objValue);
		} else {
			onTouchListener = (View.OnTouchListener) objValue;
		}
		UIControlEventTouchDelegate delegate = new UIControlEventTouchDelegate(w, onTouchListener);
		delegate.nativeAddOnTouchListener(nativeView);
	}

	public static void startDrag(IWidget w, String eventData) {
		
	}    
	
	private static void setOnDrag(IWidget w, Object nativeView, Object objValue) {
		View.OnDragListener onDragListener;
		
		if (objValue instanceof String) {
			onDragListener = new OnDragListener(w, (String) objValue);
		} else {
			onDragListener = (View.OnDragListener) objValue;	
		}
		w.getFragment().addListener(w, onDragListener);
		UIDropInteractionDelegate dragDropInteractionDelegate = new UIDropInteractionDelegate(w, onDragListener);
		dragDropInteractionDelegate.nativeAddDropInteraction(nativeView);
	}
	
	static class UIDragInteractionDelegate{
		private IWidget widget;
		private String eventArgs;
		public UIDragInteractionDelegate(IWidget widget, String eventArgs) {
			// to avoid gc in objective c
			widget.getFragment().addListener(widget, this);
			this.widget = widget;
			this.eventArgs = eventArgs;
		}
		private Object getEventObj(IWidget w) {
			Map<String, Object> eventData = PluginInvoker.getJSONCompatMap();
			w.updateModelToEventMap(eventData, "", eventArgs);
			return PluginInvoker.marshal(eventData);
		}
		
		public void sendStartEvent(int x, int y) {
			sendEvent(x, y, View.DragEvent.ACTION_DRAG_STARTED, true);
		}
		public void sendEndEvent(int x, int y) {
			sendEvent(x, y, View.DragEvent.ACTION_DRAG_ENDED, false);
		}
		private void sendEvent(int x, int y, int action, boolean dragCanAccept) {
			java.util.List<OnDragListener> listeners = widget.getFragment().getListener(OnDragListener.class);
			if (listeners != null) {
				for (OnDragListener listener : listeners) {
					r.android.view.View.DragEvent dragEvent = new DragEvent();
					dragEvent.setX(x);
					dragEvent.setY(y);
					dragEvent.setAction(action);
					View view = (View) listener.w.asWidget();
					view.setDragCanAccept(dragCanAccept);
					listener.onDrag((View) widget.asWidget(), dragEvent);
				}
			}
		}

		public native void nativeAddDragInteraction(Object nativeWidget)/*-[
			UIDragInteraction* dragInteraction = [[UIDragInteraction alloc] initWithDelegate:self];
			dragInteraction.enabled = TRUE;
			UIView* view = ((UIView*)nativeWidget);
		    for (id<UIInteraction> interaction in view.interactions) {
		        if ([interaction isKindOfClass:[UIDragInteraction class]]) {
		            [view removeInteraction:interaction];
		        }
		    }
			[view addInteraction:dragInteraction];
		]-*/;
		/*-[
		
		- (nonnull NSArray<UIDragItem *> *)dragInteraction:(nonnull UIDragInteraction *)interaction itemsForBeginningSession:(nonnull id<UIDragSession>)session {
    		id<INativeWidget> view = (id<INativeWidget>)interaction.view;
    		UIDragItem* dragItem = [[UIDragItem alloc] initWithItemProvider:  [[NSItemProvider alloc] initWithObject: [self getEventObjWithASIWidget:[view getWidget]]]];
    		CGPoint point = [session locationInView:interaction.view];
    		[self sendStartEventWithInt: point.x withInt: point.y];
    		return [NSArray arrayWithObject:dragItem];
		}

		- (void)dragInteraction:(UIDragInteraction *)interaction session:(id<UIDragSession>)session didEndWithOperation:(UIDropOperation)operation {
		    CGPoint point = [session locationInView:interaction.view];
    		[self sendEndEventWithInt: point.x withInt: point.y];
		}
		]-*/
	}
	
	static class UIDropInteractionDelegate{
		@com.google.j2objc.annotations.Weak private IWidget  widget;
		private View.OnDragListener listener;
		public UIDropInteractionDelegate(IWidget widget, View.OnDragListener onDragListener) {
			// to avoid gc in objective c
			widget.getFragment().addListener(widget, this);
			this.widget = widget;
			this.listener = onDragListener;
		}

		public void dragEnter(int x, int y) {
			View view = (View) widget.asWidget();
			view.setDragHovered(true);
			sendEvent(x, y, null, DragEvent.ACTION_DRAG_ENTERED);
		}
		public void dragLeave(int x, int y) {
			View view = (View) widget.asWidget();
			view.setDragHovered(false);
			sendEvent(x, y, null, DragEvent.ACTION_DRAG_ENDED);
		}
		
		public void dragOver(int x, int y) {
			sendEvent(x, y, null, DragEvent.ACTION_DRAG_LOCATION);
		}

		public void drop(int x, int y, String data) {
			sendEvent(x, y, data, DragEvent.ACTION_DROP);
		}

		public void sendEvent(int x, int y, String data, int action) {
			r.android.view.View.DragEvent dragEvent = new r.android.view.View.DragEvent();
			dragEvent.setAction(action);
			dragEvent.setX(x);
			dragEvent.setY(y);
			dragEvent.setClipData(data);
			listener.onDrag((View) widget.asWidget(), dragEvent);
			System.out.println("action " + action);
		}
		public native void nativeAddDropInteraction(Object nativeWidget)/*-[
			UIDropInteraction* dropInteraction = [[UIDropInteraction alloc] initWithDelegate:self];
			UIView* view = ((UIView*)nativeWidget);
		    for (id<UIInteraction> interaction in view.interactions) {
		        if ([interaction isKindOfClass:[UIDropInteraction class]]) {
		            [view removeInteraction:interaction];
		        }
		    }
			[view addInteraction:dropInteraction];
		]-*/;
		
		/*-[
		
		- (void)dropInteraction:(UIDropInteraction *)interaction performDrop:(id<UIDropSession>)session {
		     CGPoint point = [session locationInView:interaction.view];
    		if ([session canLoadObjectsOfClass:[NSString class]]) {
		        [session loadObjectsOfClass:[NSString class] completion:^(NSArray<__kindof id<NSItemProviderReading>> * _Nonnull objects) {
		                [self dropWithInt: point.x withInt: point.y withNSString:objects.firstObject];
		        }];
		    }
		}
		
		- (void)dropInteraction:(UIDropInteraction *)interaction sessionDidEnter:(id<UIDropSession>)session {
		    CGPoint point = [session locationInView:interaction.view];
    		[self dragEnterWithInt: point.x withInt: point.y];
		}
		
		- (void)dropInteraction:(UIDropInteraction *)interaction sessionDidExit:(id<UIDropSession>)session {
		    CGPoint point = [session locationInView:interaction.view];
    		[self dragLeaveWithInt: point.x withInt: point.y];
		}
		
		- (BOOL)dropInteraction:(UIDropInteraction *)interaction canHandleSession:(id<UIDropSession>)session {
		    return TRUE;
		}
		
		- (UIDropProposal *)dropInteraction:(UIDropInteraction *)interaction sessionDidUpdate:(id<UIDropSession>)session {
			CGPoint point = [session locationInView:interaction.view];
    		[self dragOverWithInt: point.x withInt: point.y];
		    return [[UIDropProposal alloc] initWithDropOperation:UIDropOperationCopy];
		}
		]-*/
	}

	
	private static void setAsDragSource(IWidget w, Object nativeWidget, Object objValue) {
    	UIDragInteractionDelegate dragDropInteractionDelegate = new UIDragInteractionDelegate(w, (String)objValue);
    	dragDropInteractionDelegate.nativeAddDragInteraction(nativeWidget);
	}
	
    private static Object getForeground(IWidget w) {
		Object value = null;
		View view = (View)w.asWidget();
		
		if (view.getForeground() != null) {
			if (view.getForeground() instanceof r.android.graphics.drawable.StateListDrawable) {
				return view.getForeground();
			}
			if (view.getForeground() instanceof r.android.graphics.drawable.Drawable) {
				return view.getForeground().getDrawable();
			}
		}
		
		return value;
	}

	private static Object getBackground(IWidget w) {
		Object value = null;
		View view = (View)w.asWidget();
		
		if (view.getBackground() != null) {
			if (view.getBackground() instanceof r.android.graphics.drawable.StateListDrawable) {
				return view.getBackground();
			}
			if (view.getBackground() instanceof r.android.graphics.drawable.Drawable) {
				return view.getBackground().getDrawable();
			}
		}
		
		return value;
	}
	
	
	private static void setOnKey(IWidget w, Object objValue) {
		 View.OnKeyListener onKeyListener;
		 
		 if (objValue instanceof String) {
			 onKeyListener = new OnKeyListener(w, (String) objValue);
		 } else {
			 onKeyListener = (View.OnKeyListener) objValue;
		 }
		 View view = (View) w.asWidget();
		 view.setOnKeyListener(onKeyListener);
	}
	
	private static void setLayerCornerRadius(Object nativeWidget, Object objValue) {
		nativeSetLayerCornerRadius(nativeWidget, (float) objValue);
	}

	private static native void nativeSetLayerCornerRadius(Object nativeWidget, float value)/*-[
		UIView* view = ((UIView*)nativeWidget);
		view.layer.cornerRadius = value;
	]-*/;

	private static void setLayerBorderColor(Object nativeWidget, Object objValue) {
		nativeLayerBorderColor(nativeWidget, objValue);
	}

	private static native void nativeLayerBorderColor(Object nativeWidget, Object value)/*-[
		UIView* view = ((UIView*)nativeWidget);
		view.layer.borderColor = ((UIColor*) value).CGColor;
	]-*/;

	private static void setLayerBorderWidth(Object nativeWidget, Object objValue) {
		nativeLayerBorderWidth(nativeWidget, (float) objValue);
	}

	private static native void nativeLayerBorderWidth(Object nativeWidget, float value)/*-[
		UIView* view = ((UIView*)nativeWidget);
		view.layer.borderWidth = value;
	]-*/;
	
	
	private static void setLayerMasksToBounds(Object nativeWidget, Object objValue) {
		nativeLayerBMasksToBounds(nativeWidget, (boolean) objValue);
	}
	
	private static native void nativeLayerBMasksToBounds(Object nativeWidget, boolean value)/*-[
		UIView* view = ((UIView*)nativeWidget);
		view.layer.masksToBounds = value;
	]-*/;

	 
	private static void nativeBringToFront(List<IWidget> widgets) {
		for (IWidget w : widgets) {
			nativeBringToFront(w.asNativeWidget());
		}
	}

	public static native void nativeBringToFront(Object nativeWidget)/*-[
		UIView* view = ((UIView*)nativeWidget);
		[view.superview bringSubviewToFront:view];
	]-*/;

	private static void setNativeId(IWidget w, String strValue) {
	}

	public static native int getLocationXOnScreen(Object nativeWidget)/*-[
		UIView* view = ((UIView*)nativeWidget);
    	CGPoint point = [view.superview convertPoint:view.frame.origin toView:nil];
		return point.x;
	]-*/;
	
	public static native int getLocationYOnScreen(Object nativeWidget)/*-[
	UIView* view = ((UIView*)nativeWidget);
	CGPoint point = [view.superview convertPoint:view.frame.origin toView:nil];
	return point.y;
]-*/;

	
	private static void setOutsideTouchable(IWidget w, String strValue, Object objValue, View view) {
		if ((boolean) objValue) {
			 w.storeInTempCache("outsideTouchable", "true");
		} else {
			w.storeInTempCache("outsideTouchable", "false");
		}
	}
	
	public static native int nativeMeasureWidth(Object uiView)/*-[
		CGSize maximumLabelSize = CGSizeMake(CGFLOAT_MAX,CGFLOAT_MAX);
		CGSize requiredSize = [((UIView*)uiView) sizeThatFits:maximumLabelSize];
		return ceil(requiredSize.width);
	]-*/;
	
		public static native int nativeMeasureHeight(Object uiView, int width)/*-[
	    CGSize maximumLabelSize = CGSizeMake(width,CGFLOAT_MAX);
	    CGSize requiredSize = [((UIView*)uiView) sizeThatFits:maximumLabelSize];
	    return ceil(requiredSize.height);
	]-*/;

		
	private static void setOnSwipeListener(IWidget w, SwipeHelper.SwipeListener swipeListener) {
		UISwipeGestureRecognizerDelegate delegate = new UISwipeGestureRecognizerDelegate(w, swipeListener);
		delegate.nativeAddSwipeListener("default", w.asNativeWidget());
	}
	
	static class UISwipeGestureRecognizerDelegate {
		@com.google.j2objc.annotations.Weak private IWidget  widget;
		private SwipeHelper.SwipeListener listener;
		public UISwipeGestureRecognizerDelegate(IWidget widget, SwipeHelper.SwipeListener listener) {
			// to avoid gc in objective c
			widget.getFragment().addListener(widget, this);
			this.widget = widget;
			this.listener = listener;
		}
		public native void nativeAddSwipeListener(String id, Object nativeWidget)/*-[
			UIView* view = ((UIView*)nativeWidget);
			view.userInteractionEnabled = YES;		

			ASUISwipeGestureRecognizer *leftSwipeGestureRecognizer = [[ASUISwipeGestureRecognizer alloc] initWithTarget:self action:@selector(swipedLeft:)];
			leftSwipeGestureRecognizer.direction = UISwipeGestureRecognizerDirectionLeft;
			leftSwipeGestureRecognizer.id = id_;
			
			ASUISwipeGestureRecognizer *rightSwipeGestureRecognizer = [[ASUISwipeGestureRecognizer alloc] initWithTarget:self action:@selector(swipedRight:)];
			rightSwipeGestureRecognizer.direction = UISwipeGestureRecognizerDirectionRight;
			rightSwipeGestureRecognizer.id = id_;
			
			ASUISwipeGestureRecognizer *topSwipeGestureRecognizer = [[ASUISwipeGestureRecognizer alloc] initWithTarget:self action:@selector(swipedTop:)];
			topSwipeGestureRecognizer.direction = UISwipeGestureRecognizerDirectionUp;
			topSwipeGestureRecognizer.id = id_;
			
			ASUISwipeGestureRecognizer *bottomSwipeGestureRecognizer = [[ASUISwipeGestureRecognizer alloc] initWithTarget:self action:@selector(swipedLeft:)];
			bottomSwipeGestureRecognizer.direction = UISwipeGestureRecognizerDirectionDown;
			bottomSwipeGestureRecognizer.id = id_;
			
			for (UIGestureRecognizer* interaction in view.gestureRecognizers) {
		        if ([interaction isKindOfClass:[ASUISwipeGestureRecognizer class]] && [id_ isEqualToString:((ASUISwipeGestureRecognizer*)interaction).id]) {
		            [view removeGestureRecognizer:interaction];
		        }
		    }
			[view addGestureRecognizer:leftSwipeGestureRecognizer];
			[view addGestureRecognizer:rightSwipeGestureRecognizer];
			[view addGestureRecognizer:topSwipeGestureRecognizer];
			[view addGestureRecognizer:bottomSwipeGestureRecognizer];
		]-*/;
		
		
		public void swipe(String direction) {
			listener.onSwiped(direction);
		}
		/*-[
	 	- (void)swipedLeft:(ASUISwipeGestureRecognizer *)tapRecognizer {
  				[self swipeWithNSString: @"left"];
		}
		- (void)swipedRight:(ASUISwipeGestureRecognizer *)tapRecognizer {
  				[self swipeWithNSString: @"right"];
		}
		- (void)swipedTop:(ASUISwipeGestureRecognizer *)tapRecognizer {
  				[self swipeWithNSString: @"top"];
		}
		- (void)swipedBottom:(ASUISwipeGestureRecognizer *)tapRecognizer {
  				[self swipeWithNSString: @"bottom"];
		}
		]-*/
	}

	public static void addPanListener(IWidget widget, Object uiView, PanCallBack callback) {
		new PanGestureRecognizer(widget, uiView, uiView, callback).addUIPanGestureRecognizer();
	}
	
	public static void addPanListener(IWidget widget, Object uiView, Object uiLocationView, PanCallBack callback) {
		new PanGestureRecognizer(widget, uiView, uiLocationView, callback).addUIPanGestureRecognizer();
	}
	
	static class PanGestureRecognizer {
		@com.google.j2objc.annotations.Weak private IWidget widget; 
		private Object uiView;
		private Object uiLocationView;
		private PanCallBack callback;
		public PanGestureRecognizer(IWidget widget, Object uiView, Object uiLocationView, PanCallBack callback) {
			widget.getFragment().addListener(widget, this);
			this.widget = widget;
			this.uiView = uiView;
			this.uiLocationView = uiLocationView;
			this.callback = callback;
		}
		private native void addUIPanGestureRecognizer()/*-[
			UIView* uiview = ((UIView*) self->uiView_);
			uiview.userInteractionEnabled = YES;
			UIPanGestureRecognizer *panRecognizer = [[UIPanGestureRecognizer alloc] initWithTarget:self action:@selector(move:)];
			[panRecognizer setMinimumNumberOfTouches:1];
			[panRecognizer setMaximumNumberOfTouches:1];
			[uiview addGestureRecognizer:panRecognizer];
		]-*/;
		
		/*-[
			-(void)move:(UIPanGestureRecognizer*)tapRecognizer {
				int x = [tapRecognizer locationInView:self->uiLocationView_].x;
				int y = [tapRecognizer locationInView:self->uiLocationView_].y;
				if (tapRecognizer.state == UIGestureRecognizerStateBegan) {
		  			[self->callback_ handlePanStartWithASIWidget:self->widget_ withId: self->uiView_ withInt: x withInt: y];
				} else if (tapRecognizer.state == UIGestureRecognizerStateEnded || tapRecognizer.state == UIGestureRecognizerStateCancelled) {
		  			[self->callback_ handlePanEndWithASIWidget:self->widget_ withId: self->uiView_ withInt: x withInt: y];
				} else {
					[self->callback_ handlePanDragWithASIWidget:self->widget_ withId: self->uiView_ withInt: x withInt: y];
				}
		}
		]-*/
	}

	public native static int getX(Object objview)/*-[
		UIView* uiview = ((UIView*) objview);
		return uiview.frame.origin.x;
	]-*/;
	
	public native static int getY(Object objview)/*-[
		UIView* uiview = ((UIView*) objview);
		return uiview.frame.origin.y;
	]-*/;

	public native static void updateBoundsX(Object objview, int x)/*-[
		UIView* uiview = ((UIView*) objview);
	    CGRect frame = uiview.frame;
	    frame.origin.x = x;
	    uiview.frame = frame;
	]-*/;

	public static void translateWithAnimation(Object objview, int x, int y, int animationDurationInMs,
			AnimationCallBack callBack) {
		new AnimationUtils(objview, callBack).nativeAnimate(x, y, animationDurationInMs);
	}
	
	static class AnimationUtils {  
		private Object objview;
		private AnimationCallBack callBack;
		public AnimationUtils(Object objview,  AnimationCallBack callBack) {
			this.objview = objview;
			this.callBack = callBack;
		}
		private native void nativeAnimate(int x, int y, int animationDurationInMs)/*-[
			UIView* uiview = ((UIView*) self->objview_);
			CADisplayLink *displayLink = [CADisplayLink displayLinkWithTarget:self selector:@selector(animationDidUpdate)];
			displayLink.frameInterval = 1;
			[displayLink addToRunLoop:[NSRunLoop currentRunLoop] forMode:NSDefaultRunLoopMode];
		
			[UIView animateWithDuration:(animationDurationInMs/(float)1000) animations:^{
				CGRect frame = uiview.frame;
				frame.origin.x = x;
				frame.origin.y = y;
				uiview.frame = frame;
			}completion:^(BOOL finished) {
		    	[displayLink invalidate];
			}];
		]-*/;
		
		/*-[
		-(void)animationDidUpdate {
			UIView* uiview = (UIView*)self->objview_;
			CALayer* calayer =  ((CALayer*)uiview.layer.presentationLayer);
			[self->callBack_ animatingWithInt: calayer.frame.origin.x withInt: calayer.frame.origin.y];
		}
		]-*/

	}
	
	
	private static void setOutlineSpotShadowColor(IWidget w, Object objValue) {
		setShadowColor(w.asNativeWidget(), objValue);
		
	}

	private static void setOutlineAmbientShadowColor(IWidget w, Object objValue) {
		setShadowColor(w.asNativeWidget(), objValue);
	}

	private native static void setShadowColor(Object view, Object color) /*-[
		((UIView*)view).layer.shadowColor = ((UIColor*)color).CGColor;
	]-*/;
	
	
	private static void setCornerRadius(IWidget w, Object nativeWidget, Object objValue) {
		float radius = ((Number) objValue).floatValue();
		setCornerRadiusOnView(nativeWidget, radius);
		
	}
	
	private static native void setCornerRadiusOnView(Object view, float radius)/*-[
		((UIView*)view).layer.cornerRadius = radius;
		((UIView*)view).clipsToBounds = YES;
	]-*/;

	public static void nativeAddTouchEvent(IWidget widget) {
		View view = (View) widget.asWidget();
		view.setHasOnTouchEvent(true);
	}
}
