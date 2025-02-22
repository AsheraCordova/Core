package com.ashera.layout;
//start - imports
import java.util.*;

import r.android.content.Context;
import r.android.os.Build;
import r.android.view.View;
import androidx.core.view.*;
import r.android.annotation.SuppressLint;

import com.ashera.widget.*;
import com.ashera.converter.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.graphics.*;
import static com.ashera.common.DisposeUtil.*;


import static com.ashera.widget.IWidget.*;
//end - imports

import r.android.view.KeyEvent;
import r.android.view.MenuItem;
import r.android.view.MotionEvent;
import r.android.widget.Chronometer;
import r.android.view.View.DragEvent;
import r.android.animation.Animator;
public class ViewImpl {
	// start - body
	private ViewImpl() {
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
		final static class TintMode extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("add",  0x1);
				mapping.put("multiply",  0x2);
				mapping.put("screen",  0x3);
				mapping.put("src_atop",  0x4);
				mapping.put("src_in",  0x5);
				mapping.put("src_over",  0x6);
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

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtBackground").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtBackgroundImage").withType("image"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtCapture").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtDragDetect").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtEnabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtForeground").withType("color"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtOrientation").withType("swtbitflag"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtRedraw").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtTextDirection").withType("swtbitflag"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtToolTipText").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tooltipText").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtTouchEnabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtVisible").withType("boolean"));
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
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("animatorXml").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("startAnimator").withType("nil"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("endAnimator").withType("nil"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onAnimationStart").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onAnimationEnd").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onAnimationCancel").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onAnimationRepeat").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("cornerRadius").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("id").withType("id"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelSyncEvents").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("outsideTouchable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelParam").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelPojoToUi").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelUiToPojo").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelPojoToUiParams").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("refreshUiFromModel").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelUiToPojoEventIds").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("elevation").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("backgroundTint").withType("colorstate").withOrder(-10));
		ConverterFactory.register("View.tintMode", new TintMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("backgroundTintMode").withType("View.tintMode").withOrder(-10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("updateModelData").withType("object"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("notifyDataSetChanged").withType("boolean"));
		ConverterFactory.register("View.visibility", new Visibility());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("visibility").withType("View.visibility").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("background").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		ConverterFactory.register("View.backgroundRepeat", new BackgroundRepeat());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("backgroundRepeat").withType("View.backgroundRepeat").withOrder(-10).withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minWidth").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minHeight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("attributeUnderTest").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onClick").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onFocusChange").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onLongClick").withType("string").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onKey").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onContextClick").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onHover").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onDrag").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onTouch").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("clickable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("duplicateParentState").withType("boolean").beforeChildAdd());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("longClickable").withType("boolean").withOrder(1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("invalidate").withType("nil"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("requestLayout").withType("nil"));
		ConverterFactory.register("View.layoutDirection", new LayoutDirection());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layoutDirection").withType("View.layoutDirection").beforeChildAdd());
		ConverterFactory.register("View.textDirection", new TextDirection());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textDirection").withType("View.textDirection").withOrder(100));
		ConverterFactory.register("View.textAlignment", new TextAlignment());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textAlignment").withType("View.textAlignment"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("asDragSource").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("enabled").withType("boolean").withOrder(-10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("nextFocusDown").withType("id").withOrder(100));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("nextFocusUp").withType("id").withOrder(100));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("zIndex").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtAttachEventBubbler").withType("array").withArrayType("swtbitflag").beforeChildAdd());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxWidth").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxHeight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtResizeOptions").withType("resourcestring").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onSwiped").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("translationX").withType("dimensionfloat").withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("translationY").withType("dimensionfloat").withUiFlag(UPDATE_UI_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("left").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("right").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("top").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("bottom").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("swtGCImage").withType("drawable"));
	WidgetFactory.registerConstructorAttribute(localName, new WidgetAttribute.Builder().withName("swtIgnoreEventBubblers").withType("boolean"));
	WidgetFactory.registerConstructorAttribute(localName, new WidgetAttribute.Builder().withName("formGroupId").withType("string"));
	WidgetFactory.registerConstructorAttribute(localName, new WidgetAttribute.Builder().withName("swtStyle").withType("string"));
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
		org.eclipse.swt.widgets.Control control = (org.eclipse.swt.widgets.Control) nativeWidget;
		switch (key.getAttributeName()) {
		case "swtBackground": {


		 control.setBackground((Color)objValue);



			}
			break;
		case "swtBackgroundImage": {


		disposeAll(control.getBackgroundImage());
		 control.setBackgroundImage((Image)objValue);



			}
			break;
		case "swtCapture": {


		 control.setCapture((boolean)objValue);



			}
			break;
		case "swtDragDetect": {


		 control.setDragDetect((boolean)objValue);



			}
			break;
		case "swtEnabled": {


		 control.setEnabled((boolean)objValue);



			}
			break;
		case "swtForeground": {


		 control.setForeground((Color)objValue);



			}
			break;
		case "swtOrientation": {


		 control.setOrientation((int)objValue);



			}
			break;
		case "swtRedraw": {


		 control.setRedraw((boolean)objValue);



			}
			break;
		case "swtTextDirection": {


		 control.setTextDirection((int)objValue);



			}
			break;
			case "tooltipText":
		case "swtToolTipText": {


		 control.setToolTipText((String)objValue);



			}
			break;
		case "swtTouchEnabled": {


		 control.setTouchEnabled((boolean)objValue);



			}
			break;
		case "swtVisible": {


		 control.setVisible((boolean)objValue);



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
		case "cornerRadius": {


		 setCornerRadius(w, nativeWidget, objValue);



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
		case "outsideTouchable": {


		setOutsideTouchable(w, strValue, objValue, view);



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
		case "elevation": {


		 setElevation(w, objValue);



			}
			break;
		case "backgroundTint": {


		setBackgroundTint(w, objValue);



			}
			break;
		case "backgroundTintMode": {


		setBackgroundTintMode(w, strValue);



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
		case "visibility": {


		 setVisibility(w, nativeWidget, objValue);



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
		case "minWidth": {


		 setMinWidth(w, objValue);



			}
			break;
		case "minHeight": {


		 setMinHeight(w, objValue);



			}
			break;
		case "attributeUnderTest": {


		 setAttributeUnderTest(w, objValue);



			}
			break;
		case "onClick": {


		 setOnClick(w, objValue);



			}
			break;
		case "onFocusChange": {


		 setOnFocus(w, objValue);



			}
			break;
		case "onLongClick": {


		 setOnLongClick(w, objValue);



			}
			break;
		case "onKey": {


		 setOnKey(w, objValue);



			}
			break;
		case "onContextClick": {


		 setOnContextClick(w, objValue);



			}
			break;
		case "onHover": {


		 setOnHover(w, objValue);



			}
			break;
		case "onDrag": {


		 setOnDrag(w, nativeWidget, objValue);



			}
			break;
		case "onTouch": {


		 setOnTouch(w, nativeWidget, objValue);



			}
			break;
		case "clickable": {


		 setClickable(w, nativeWidget, objValue);



			}
			break;
		case "duplicateParentState": {


		 setDuplicateParentState(w, objValue);



			}
			break;
		case "longClickable": {


		 setLongClickable(w, objValue);



			}
			break;
		case "invalidate": {


		 invalidate(w);



			}
			break;
		case "requestLayout": {


		 requestLayout(w, nativeWidget);



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
		case "asDragSource": {


		 setAsDragSource(w, nativeWidget, objValue);



			}
			break;
		case "enabled": {


		view.setEnabled((boolean)objValue);



			}
			break;
		case "nextFocusDown": {


		 setNextFocusDown(w, strValue, objValue);



			}
			break;
		case "nextFocusUp": {


		 setNextFocusUp(w, strValue, objValue);



			}
			break;
		case "zIndex": {


		 setZIndex(w, objValue);



			}
			break;
		case "swtAttachEventBubbler": {


		 attachEventBubbler(w, objValue);



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
		case "swtResizeOptions": {


		 setSwtResizeOptions(w, objValue);



			}
			break;
		case "onSwiped": {


		if (objValue instanceof String) {setOnSwipeListener(w, new SwipeListener(w, strValue, "onSwiped"));} else {setOnSwipeListener(w, (SwipeHelper.SwipeListener) objValue);}



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
		case "swtGCImage": {


		 drawImageUsingGC(w, objValue);



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
		org.eclipse.swt.widgets.Control control = (org.eclipse.swt.widgets.Control) nativeWidget;
		switch (key.getAttributeName()) {
			case "swtBackground": {
return control.getBackground();			}
			case "swtBackgroundImage": {
return control.getBackgroundImage();			}
			case "swtDragDetect": {
return control.getDragDetect();			}
			case "swtEnabled": {
return control.getEnabled();			}
			case "swtForeground": {
return control.getForeground();			}
			case "swtOrientation": {
return control.getOrientation();			}
			case "swtTextDirection": {
return control.getTextDirection();			}
			case "tooltipText":
			case "swtToolTipText": {
return control.getToolTipText();			}
			case "swtTouchEnabled": {
return control.getTouchEnabled();			}
			case "swtVisible": {
return control.getVisible();			}
			case "selected": {
return getSelected(w, view);			}
			case "validateForm": {
return getValidateFormResult(w);			}
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
			case "backgroundTint": {
return getBackgroundTint(w);			}
			case "visibility": {
return getVisibility(w);			}
			case "background": {
return getBackground(w);			}
			case "minWidth": {
return getMinWidth(w);			}
			case "minHeight": {
return getMinHeight(w);			}
			case "clickable": {
return getClickable(w);			}
			case "duplicateParentState": {
return getDuplicateParentState(w);			}
			case "longClickable": {
return getLongClickable(w);			}
			case "layoutDirection": {
return getLayoutDirection(w);			}
			case "textDirection": {
return getTextDirection(w);			}
			case "textAlignment": {
return getTextAlignment(w);			}
			case "enabled": {
return view.isEnabled();			}
			case "maxWidth": {
return getMaxWidth(w);			}
			case "maxHeight": {
return getMaxHeight(w);			}
			case "translationX": {
return getTranslationX(w);			}
			case "translationY": {
return getTranslationY(w);			}
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

	


	private static void setOnSwipeListener(IWidget w, com.ashera.layout.SwipeHelper.SwipeListener swipeListener) {
		SwipeHelper helper = new SwipeHelper((int) w.quickConvert("30dp", "dimension"));
		helper.setListener(swipeListener);
		addSwipeListener(w, helper);		
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

	public static void updateBounds(Object uiView, int x, int y, int width, int height) {
		nativeMakeFrame(uiView, x, y, x + width, y + height);		
	}
	public static int getX(Object uiView) {
		Control root = (Control)uiView;
		return root.getBounds().x;
	}
	public static int getY(Object uiView) {
		Control root = (Control) uiView;
		return root.getBounds().y;
	}
	public static void updateBoundsX(Object uiView, int x) {
		org.eclipse.swt.widgets.Composite root = (org.eclipse.swt.widgets.Composite)uiView;
		nativeMakeFrame(uiView, x, root.getBounds().y, x + root.getBounds().width, root.getBounds().height + root.getBounds().y);
	}
	public static void nativeMakeFrame(Object uiView, int l, int t, int r, int b) {
		Control control = (Control) uiView;
		if (control.isDisposed()) {
			return;
		}
		if (!(control.getParent() instanceof org.eclipse.swt.custom.ScrolledComposite)) {
		    control.setBounds(l, t, r-l, b-t);		
		} else {
			if (control.getBounds().x == 0 && control.getBounds().y == 0) {
				control.setBounds(l, t, r-l, b-t);
			} else {
				control.setBounds(control.getBounds().x, control.getBounds().y, r-l, b-t);
			}
		   
		}	
	}

		public static void nativeMakeFrameForHorizontalScrollView(Object uiView, int l, int t, int r, int b, int i) {
        ((Control) uiView).setBounds(l, t, r-l, b-t);        
        
        if (uiView instanceof org.eclipse.swt.custom.ScrolledComposite) {
	        org.eclipse.swt.custom.ScrolledComposite scrollComposite = (org.eclipse.swt.custom.ScrolledComposite) uiView;
	        scrollComposite.setMinWidth(i);        
        }
        
    }

	public static boolean isRTLLayout(IWidget widget) {
		return isShellInRTLMode();
	}
	
	public static boolean isRTLLayout() {
		return isShellInRTLMode();
	}

	public static void nativeMakeFrame(Object uiView, int l, int t, int r, int b, int i) {
		((Control) uiView).setBounds(l, t, r-l, b-t);		
		
		if (uiView instanceof org.eclipse.swt.custom.ScrolledComposite) {
			org.eclipse.swt.custom.ScrolledComposite scrollComposite = (org.eclipse.swt.custom.ScrolledComposite) uiView;
			scrollComposite.setMinHeight(i);
		}
	}

    public static Composite getParent(IWidget widget) {        
        org.eclipse.swt.widgets.Composite parent = (org.eclipse.swt.widgets.Composite)widget.getParent().getCompositeLeaf(widget).asNativeWidget();
        return parent;
    }

    public static void addClickListener(org.eclipse.swt.widgets.Control control, org.eclipse.swt.widgets.Listener listener) {
        int event = org.eclipse.swt.SWT.MouseUp;
    	addListener(control, event, listener);
    }

    public static void addListener(org.eclipse.swt.widgets.Control control, int event, org.eclipse.swt.widgets.Listener listener) {
		control.setEnabled(true);
        control.setTouchEnabled(true);
		control.addListener(event, listener);

        if (control instanceof org.eclipse.swt.widgets.Composite) {
            for (org.eclipse.swt.widgets.Control child : ((org.eclipse.swt.widgets.Composite) control).getChildren()) {
                addListener(child, event, listener);
            }
        }
	}
    
    private static void setVisibility(IWidget w, Object nativeWidget, Object objValue) {
        View view = (View) w.asWidget();
        view.setVisibility((int) objValue);
        org.eclipse.swt.widgets.Control control = (org.eclipse.swt.widgets.Control) nativeWidget;
        control.setVisible(view.getVisibility() == View.VISIBLE);
    }
    
	public static void setBackground(IWidget w, Object nativeWidget, Object objValue) {
		if (objValue instanceof r.android.graphics.drawable.Drawable) {
			View view = (View) w.asWidget();
			r.android.graphics.drawable.Drawable drawable = (r.android.graphics.drawable.Drawable)objValue;
			view.setBackground(drawable);

			Object colorOrImage = drawable.getDrawable();
			setBgOnControl(w, nativeWidget, colorOrImage);
			
			if (w.getFromTempCache("stateChange") != null) {
				w.applyAttributeCommand("background", CommonConverters.command_imagestate, new String[] {}, true, colorOrImage);	
			}
	
			AttributeCommandResizeListener listener = AttributeCommandResizeListener.addResizeListenerToControl(w, nativeWidget,
					"background", ViewImpl::setBgOnControl);
			if (w.isInitialised()) {
				listener.handleEvent(null);
			}
		} else {
			setBgOnControl(w, nativeWidget, objValue);
		}

	}


    //start - statelist
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
	//end - statelist

	private static void setForegroundTint(IWidget w, r.android.content.res.ColorStateList foregroundTintList) {
	}

	private static void setBackgroundTintMode(IWidget w, Object objValue) {
		w.applyAttributeCommand("background", "tintColor", new String[] {"backgroundTintMode"}, true, objValue);
	}

	private static void setBackgroundTint(IWidget w,Object objValue) {
		if (objValue instanceof r.android.content.res.ColorStateList) {
			r.android.content.res.ColorStateList colorStateList = (r.android.content.res.ColorStateList) objValue;
			View view = (View)w.asWidget();
			view.setBackgroundTintList(colorStateList);
			objValue = colorStateList.getColorForState(view.getDrawableState(), 0);
		}
		
		w.applyAttributeCommand("background", "tintColor", new String[] {"backgroundTint"}, true, ViewImpl.getColor(objValue));		
	}
	
	private static Object getBackgroundTint(IWidget w) {
		return ((View) w.asWidget()).getBackgroundTintList();
	}
	
	private static boolean isColor(Object objValue) {
		return objValue instanceof Color;
	}

	private static void setForeground(IWidget w, Object nativeWidget, r.android.graphics.drawable.Drawable foreground) {
	}

	private static void setBgOnControl(IWidget w, Object nativeWidget, Object colorOrImage) {
		org.eclipse.swt.widgets.Control control = (org.eclipse.swt.widgets.Control) nativeWidget;
		
		if (colorOrImage instanceof r.android.content.res.ColorStateList) {
			colorOrImage = ((r.android.content.res.ColorStateList) colorOrImage).getColorForState(((View) w.asWidget()).getDrawableState(), r.android.graphics.Color.TRANSPARENT);
		}

		
		if (isColor(colorOrImage) || colorOrImage instanceof Integer) {
			if (colorOrImage instanceof Integer) {
				colorOrImage = ViewImpl.getColor(colorOrImage);
			}
			control.setBackground((Color) colorOrImage);
		} else {
			control.setBackground(null);
		}
		
		if (colorOrImage instanceof Image) {
			control.setBackgroundImage((Image) colorOrImage);
		} else {
			control.setBackgroundImage(null);
		}
	}

	//start - viewcode
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

	//end - viewcode
    
    
    private static void setAttributeUnderTest(IWidget w, Object objValue) {
       Shell[] shells = Display.getDefault().getShells();
       for (Shell shell : shells) {
           if (shell.getData() instanceof com.ashera.plugin.IPlugin) {
               ((com.ashera.plugin.IPlugin) shell.getData()).invoke("setAttr", w, objValue);
           }
       }
    }

   
    private static void setOnClick(IWidget w, Object objValue) {
		View.OnClickListener onClickListener;
		if (objValue instanceof String) {
			onClickListener = new OnClickListener(w, (String) objValue);
		} else {
			onClickListener = (View.OnClickListener) objValue;
		}
		String id = org.eclipse.swt.SWT.MouseUp + "";
		if (onClickListener != null) {
			setOnClick(w, id, onClickListener);
		}
    }

	public static void setOnClick(IWidget w, String id, View.OnClickListener onClickListener) {
		View view = (View) w.asWidget();
		setOnListener(w, org.eclipse.swt.SWT.MouseUp, id, (event) -> {
			if (Boolean.TRUE.equals(w.getFromTempCache("longclick"))) {
				return;
			}
			onClickListener.onClick(view);
		});
	}

	private static void setOnFocus(IWidget w, Object objValue) {
		View.OnFocusChangeListener focusChangeListener;
		if (objValue instanceof String) {
			focusChangeListener = new OnFocusChangeListener(w, (String) objValue);
		} else {
			focusChangeListener = (View.OnFocusChangeListener) objValue;
		}
		View view = (View) w.asWidget();
		setOnListener(w, org.eclipse.swt.SWT.FocusIn, org.eclipse.swt.SWT.FocusIn + "", (event) -> {view.setFocused(true); focusChangeListener.onFocusChange(view, true);});
		setOnListener(w, org.eclipse.swt.SWT.FocusOut, org.eclipse.swt.SWT.FocusOut + "", (event) -> {view.setFocused(false);focusChangeListener.onFocusChange(view, false);});
    }


	public static void setOnListener(IWidget w, int eventType, String id, Listener listener) {
		if (w instanceof IHasMultiNativeWidgets) {
            java.util.List<Object> nativeWidgets = ((IHasMultiNativeWidgets) w).getNativeWidgets();
            
            for (Object object : nativeWidgets) {
            	setOnListener(object, eventType, id, listener);
            }
        } else {
        	setOnListener(w.asNativeWidget(), eventType, id, listener);
        }
    }

	public static void setOnListener(Object nativeWidget, int eventType, String key, Listener listener) {
		org.eclipse.swt.widgets.Widget control = (org.eclipse.swt.widgets.Widget) nativeWidget;
		Object data = control.getData(key);
		if (data != null) {
			control.removeListener(eventType, (Listener) data);
	    }
		control.addListener(eventType, listener);
		control.setData(key, listener);
	}

	private static void setOnListener(IWidget w, String id, Object listener, AddRemoveCallBack callBack) {
		if (w instanceof IHasMultiNativeWidgets) {
            java.util.List<Object> nativeWidgets = ((IHasMultiNativeWidgets) w).getNativeWidgets();
            
            for (Object object : nativeWidgets) {
            	setOnListener(object, id, listener, callBack);
            }
        } else {
        	setOnListener(w.asNativeWidget(), id, listener, callBack);
        }
    }

	private static void setOnListener(Object nativeWidget, String key, Object listener, AddRemoveCallBack callBack) {
		org.eclipse.swt.widgets.Widget control = (org.eclipse.swt.widgets.Widget) nativeWidget;
		Object data = control.getData(key);
		if (data != null) {
			callBack.removeListener(listener);
	    }
		
		callBack.addListener(listener);
		control.setData(key, listener);
	}
	
	   
    private static void setOnLongClick(IWidget w, Object objValue) {
        View.OnLongClickListener onLongClickListener;
        if (objValue instanceof String) {
        	onLongClickListener = new OnLongClickListener(w, (String) objValue);
        } else {
        	onLongClickListener = (View.OnLongClickListener) objValue;
        }
        View view = (View) w.asWidget();
        if (!view.isLongClickable()) {
        	view.setLongClickable(true);
        }
        LongClickHandler listener = new LongClickHandler(onLongClickListener, view);
        setOnListener(w, org.eclipse.swt.SWT.MouseDown, org.eclipse.swt.SWT.MouseDown + "LC", listener);
        setOnListener(w, org.eclipse.swt.SWT.MouseUp, org.eclipse.swt.SWT.MouseUp + "LC", listener);
    }
    
    
    private static final class LongClickHandler implements Listener {
        private long startTime;
        private  View.OnLongClickListener onLongClickListener;
        private View view;
        public LongClickHandler(View.OnLongClickListener onLongClickListener, View view) {
            this.onLongClickListener = onLongClickListener;
            this.view = view;
        }
        @Override
        public void handleEvent(Event event) {
			if (this.view.isLongClickable()) {
	            if (event.type == org.eclipse.swt.SWT.MouseDown) {
	                startTime = System.currentTimeMillis();
	            } else if (event.type == org.eclipse.swt.SWT.MouseUp) {
	                if (System.currentTimeMillis() - startTime > 500) {
	                	if (onLongClickListener instanceof OnLongClickListener) {
	                		((OnLongClickListener)onLongClickListener).w.storeInTempCache("longclick", true);
	                	}
	                    onLongClickListener.onLongClick(view);
	                } else {
	                	if (onLongClickListener instanceof OnLongClickListener) {
	                		((OnLongClickListener)onLongClickListener).w.storeInTempCache("longclick", false);
	                	}
	                }
	            }
			}
        }
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
        setOnListener(w, org.eclipse.swt.SWT.KeyUp, org.eclipse.swt.SWT.KeyUp + "LC",  (event) -> {
        	view.invokeKeyListenerUp(event.keyCode);
        });
        
        setOnListener(w, org.eclipse.swt.SWT.KeyUp, org.eclipse.swt.SWT.KeyDown + "LC",  (event) -> {
        	view.invokeKeyListenerDown(event.keyCode);
        });
    }
    
	
	private static void setOnContextClick(IWidget w, Object objValue) {
		View.OnContextClickListener onContextClickListener;
		
		if (objValue instanceof String) {
			onContextClickListener = new OnContextClickListener(w, (String) objValue);
		} else {
			onContextClickListener = (View.OnContextClickListener) objValue;
		}
        View view = (View) w.asWidget();

        setOnListener(w, org.eclipse.swt.SWT.MenuDetect, org.eclipse.swt.SWT.MenuDetect + "",  (event) -> {
        	onContextClickListener.onContextClick(view);
        });
    }
	
	
	private static void setOnHover(IWidget w, Object objValue) {
        View.OnHoverListener onHoverListener;
        if (objValue instanceof String) {
        	onHoverListener = new OnHoverListener(w, (String) objValue);
        } else {
        	onHoverListener = (View.OnHoverListener) objValue;
        }
        View view = (View) w.asWidget();
        
        setOnListener(w, org.eclipse.swt.SWT.MouseExit, org.eclipse.swt.SWT.MouseExit + "",  (event) -> {
        	view.setHovered(false);
        });
        setOnListener(w, org.eclipse.swt.SWT.MouseEnter, org.eclipse.swt.SWT.MouseEnter + "",  (event) -> {
        	view.setHovered(true);
        	onHoverListener.onHover(view, new MotionEvent());
        });
    }
	

	private static void setOnDrag(IWidget w, Object nativeWidget, Object objValue) {
        View.OnDragListener onDragListener;
        
        if (objValue instanceof String) {
        	onDragListener = new OnDragListener(w, (String) objValue);
        } else {
        	onDragListener = (View.OnDragListener) objValue;
        }
        View view = (View) w.asWidget();
    	Control control = (Control)nativeWidget;
    	int operations = org.eclipse.swt.dnd.DND.DROP_MOVE | org.eclipse.swt.dnd.DND.DROP_COPY;
    	org.eclipse.swt.dnd.DropTarget target = new org.eclipse.swt.dnd.DropTarget(control, operations);
    	// Provide data in Text format
    	org.eclipse.swt.dnd.Transfer[] types = new org.eclipse.swt.dnd.Transfer[] {org.eclipse.swt.dnd.TextTransfer.getInstance()};
    	target.setTransfer(types);
    	
    	DropWidget listener = new DropWidget(onDragListener, view);

    	setOnListener(w, "dropEvent", listener, new AddRemoveCallBack() {

			@Override
			public void addListener(Object listener) {
				w.getFragment().addListener(w, listener);
				target.addDropListener((DropWidget)listener);
			}

			@Override
			public void removeListener(Object listener) {
				w.getFragment().removeListener(w, listener);
				target.removeDropListener((DropWidget)listener);
			}
    		
    	});
    }

	
	private static void setOnTouch(IWidget w, Object nativeWidget, Object objValue) {
        View.OnTouchListener onTouchListener;
        
        if (objValue instanceof String) {
        	onTouchListener = new OnTouchListener(w, (String) objValue);
        } else {
        	onTouchListener = (View.OnTouchListener) objValue;
        }
        View view = (View) w.asWidget();
        ((Control) nativeWidget).setTouchEnabled(true);
        int touchFlag = org.eclipse.swt.SWT.Touch;
        setOnListener(w, touchFlag, touchFlag + "",  (event) -> {
        	onTouchListener.onTouch(view, new MotionEvent());
        });
    }

	public static void registerCommandConveter(IWidget widget) {
		widget.registerForAttributeCommandChain("background");
		widget.applyAttributeCommand("background", "imageRepeat", new String[] {"backgroundRepeat"}, true, "no-repeat");
		
		if (!widget.getParams().containsKey("swtIgnoreEventBubblers")) {
			HasWidgets parent = widget.getParent();
			if (parent != null) {
				Set<Integer> eventBubblers = parent.getEventBubblers();
				if (eventBubblers != null) {
					for (Integer flag : eventBubblers) {
						addBubbleUpListener(widget, flag);
					}
				}
			}
		}
	}

	
	private static void attachEventBubbler(IWidget w, Object objValue) {
		w.setEventBubblers((Collection<Integer>) objValue);
		((Control) w.asNativeWidget()).setData("attachEventBubbler", objValue);
	}
	private static void addBubbleUpListener(IWidget widget, int eventId) {
		if (widget instanceof IHasMultiNativeWidgets) {
            java.util.List<Object> nativeWidgets = ((IHasMultiNativeWidgets) widget).getNativeWidgets();
            
            for (Object object : nativeWidgets) {
            	addBubbleUpListener((Control) object, eventId);
            }

		} else {
			Control control = (Control) widget.asNativeWidget();
			addBubbleUpListener(control, eventId);
		}
	}

	private static final class EventBubblerListener implements org.eclipse.swt.widgets.Listener {
		private final int eventId;
		private final Control control;
	
		private EventBubblerListener(int eventId, Control control) {
			this.eventId = eventId;
			this.control = control;
		}
	
		@Override
		public void handleEvent(Event event) {
			Composite parent = control.getParent();
			
			if(parent != null) {
				org.eclipse.swt.widgets.Listener[] listeners = parent.getListeners(eventId);
				
				for (Listener listener2 : listeners) {
					if (listener2 instanceof EventBubblerListener || hasEventHandler(parent)) {
						listener2.handleEvent(event);
					}
				}
				
			}
		}

		private boolean hasEventHandler(Control control) {
			Object data = control.getData("attachEventBubbler");
			return data != null && ((Collection<Integer>) data).contains(eventId);
		}
	}
	private static void addBubbleUpListener(Control control, int eventId) {
		control.addListener(eventId, new EventBubblerListener(eventId, control));
	}

	public static boolean isMirrorSupported() {
		return com.ashera.common.OperatingSystem.isWindows();
	}
	
	public static boolean isShellInRTLMode() {
		Shell shell = Display.getDefault().getShells()[0];
		return (shell.getStyle() & org.eclipse.swt.SWT.RIGHT_TO_LEFT) != 0;
	}

	public static void requestLayout(IWidget w, Object nativeWidget) {
		View view = (View) w.asWidget();
		view.requestLayout();
		Control control = (Control) nativeWidget;
		control.requestLayout();
	}

	public static void invalidate(IWidget w, Object asNativeWidget) {
		nativeInvalidate(asNativeWidget);
	}

	public static void nativeInvalidate(Object w) {
		Control control = (Control) w;
		control.redraw();
		control.update();
	}

	//start - direction
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
	//end - direction

	public static void startDrag(final IWidget w, String eventData) {
		System.out.println(eventData);
	}
	
	
	   
	private static final class DropWidget extends org.eclipse.swt.dnd.DropTargetAdapter {
		private final View.OnDragListener onDragListener;
		private final View view;

		private DropWidget(View.OnDragListener onDragListener, View view) {
			this.onDragListener = onDragListener;
			this.view = view;
		}
		
		public void dragStart(org.eclipse.swt.dnd.DragSourceEvent event) {
			view.setDragCanAccept(true);
			sendEvent(onDragListener, view, event, r.android.view.View.DragEvent.ACTION_DRAG_STARTED);
		}
		
		public void dragEnd(org.eclipse.swt.dnd.DragSourceEvent event) {
			view.setDragCanAccept(false);
			sendEvent(onDragListener, view, event, r.android.view.View.DragEvent.ACTION_DRAG_ENDED);
		}

		@Override
		public void dragEnter(org.eclipse.swt.dnd.DropTargetEvent event) {
			view.setDragHovered(true);
			sendEvent(onDragListener, view, event, r.android.view.View.DragEvent.ACTION_DRAG_ENTERED);
		}

		private void sendEvent(View.OnDragListener onDragListener, View view, org.eclipse.swt.dnd.DragSourceEvent
				event, int action) {
			r.android.view.View.DragEvent dragEvent = new r.android.view.View.DragEvent();
			dragEvent.setAction(action);
			dragEvent.setX(event.x);
			dragEvent.setY(event.y);
			dragEvent.setClipData((String) event.data);
			onDragListener.onDrag(view, dragEvent);
			System.out.println("action " + action);
		}
		
		private void sendEvent(View.OnDragListener onDragListener, View view, org.eclipse.swt.dnd.DropTargetEvent event, int action) {
			r.android.view.View.DragEvent dragEvent = new r.android.view.View.DragEvent();
			dragEvent.setAction(action);
			dragEvent.setX(event.x);
			dragEvent.setY(event.y);
			dragEvent.setClipData((String) event.data);
			onDragListener.onDrag(view, dragEvent);
			System.out.println("action " + action);
		}

		@Override
		public void dragLeave(org.eclipse.swt.dnd.DropTargetEvent event) {
			view.setDragHovered(false);
			sendEvent(onDragListener, view, event, r.android.view.View.DragEvent.ACTION_DRAG_EXITED);
		}
		
		@Override
		public void dragOver(org.eclipse.swt.dnd.DropTargetEvent event) {
			sendEvent(onDragListener, view, event, r.android.view.View.DragEvent.ACTION_DRAG_LOCATION);
		}

		@Override
		public void drop(org.eclipse.swt.dnd.DropTargetEvent event) {
			sendEvent(onDragListener, view, event, r.android.view.View.DragEvent.ACTION_DROP);
		}
	}
	
	
	private static void setAsDragSource(IWidget w, Object nativeWidget, Object objValue) {
    	Control control = (Control)nativeWidget;
    	int operations = org.eclipse.swt.dnd.DND.DROP_MOVE | org.eclipse.swt.dnd.DND.DROP_COPY;
    	org.eclipse.swt.dnd.DragSource source = new org.eclipse.swt.dnd.DragSource(control, operations);
    	// Provide data in Text format
    	org.eclipse.swt.dnd.Transfer[] types = new org.eclipse.swt.dnd.Transfer[] {org.eclipse.swt.dnd.TextTransfer.getInstance()};
    	source.setTransfer(types);
    	org.eclipse.swt.dnd.DragSourceListener listener = new org.eclipse.swt.dnd.DragSourceListener() {

			@Override
			public void dragStart(org.eclipse.swt.dnd.DragSourceEvent event) {
				java.util.List<DropWidget> listeners = w.getFragment().getListener(DropWidget.class);
				if (listeners != null) {
					for (DropWidget dropWidget : listeners) {
						dropWidget.dragStart(event);
					}
				}

			}

			@Override
			public void dragSetData(org.eclipse.swt.dnd.DragSourceEvent event) {	
				Map<String, Object> eventData = new java.util.HashMap<>();
				w.updateModelToEventMap(eventData, "", (String) objValue);
				event.data = PluginInvoker.marshal(eventData);
				System.out.println(event.data);
			}

			@Override
			public void dragFinished(org.eclipse.swt.dnd.DragSourceEvent event) {
				java.util.List<DropWidget> listeners = w.getFragment().getListener(DropWidget.class);
				if (listeners != null) {
					for (DropWidget dropWidget : listeners) {
						dropWidget.dragEnd(event);
					}
				}
			}
    		
    	};
    	setOnListener(w, "dragEvent", listener, new AddRemoveCallBack() {

			@Override
			public void addListener(Object listener) {
				source.addDragListener((org.eclipse.swt.dnd.DragSourceListener)listener);
			}

			@Override
			public void removeListener(Object listener) {
				source.removeDragListener((org.eclipse.swt.dnd.DragSourceListener)listener);
			}
    		
    	});
    }

	private static void setClickable(IWidget w, Object nativeWidget, Object objValue) {
		Control control = (Control)nativeWidget;
		View view = (View)w.asWidget();
		control.setEnabled((boolean)objValue);
		view.setClickable((boolean)objValue);
		if (view.isClickable()) {
        	addPressListener(w, view);
		}
	}

	private static void addPressListener(IWidget w, View view) {
		setOnListener(w, org.eclipse.swt.SWT.MouseDown, org.eclipse.swt.SWT.MouseDown + "press", (event) -> view.setPressed(true));
		setOnListener(w, org.eclipse.swt.SWT.MouseUp, org.eclipse.swt.SWT.MouseUp + "press", (event) -> view.setPressed(false));
		if (w instanceof HasWidgets) {
			Iterator<IWidget> parent = ((HasWidgets) w).iterator();
			while (parent.hasNext()) {
				IWidget child = parent.next();
				addPressListener(child, view);
			}
		}
	}
	
	private static Object getBackground(IWidget w) {
		Control control = (Control)w.asNativeWidget();
		Image backgroundImage = control.getBackgroundImage();
		return backgroundImage != null ? backgroundImage : control.getBackground();
	}


	static class TabListener implements Listener {
		private IWidget widget;
		private String id;
		private int eventId;
		public TabListener(IWidget widget, String id, int eventId) {
			this.widget = widget;
			this.id = id;
			this.eventId = eventId;
		}

		@Override
		public void handleEvent(Event e) {
			if (e.detail == eventId) {
				String nextFocusDownId = id;
				if (nextFocusDownId != null) {
					IWidget nextDownWidget = widget.findNearestView(nextFocusDownId);
					Control nextDownControl = (Control)nextDownWidget.asNativeWidget();
					nextDownControl.forceFocus();
					e.doit = true;
					e.detail = org.eclipse.swt.SWT.TRAVERSE_NONE;
				}
			}
			
		}
		
	}
	private static void setNextFocusDown(IWidget w, String strValue, Object objValue) {
		setOnListener(w, org.eclipse.swt.SWT.Traverse, org.eclipse.swt.SWT.Traverse + "", new TabListener(w, strValue, org.eclipse.swt.SWT.TRAVERSE_TAB_NEXT));
	}

	private static void setNextFocusUp(IWidget w, String strValue, Object objValue) {
		setOnListener(w, org.eclipse.swt.SWT.Traverse, org.eclipse.swt.SWT.Traverse + "Rev", new TabListener(w, strValue, org.eclipse.swt.SWT.TRAVERSE_TAB_PREVIOUS));
	}

	public static void addLongClickListener(IWidget w, Control control,  View.OnLongClickListener onLongClickListener) {
        control.setEnabled(true);
        control.setTouchEnabled(true);

        View view = (View) w.asWidget();
        if (!view.isLongClickable()) {
        	view.setLongClickable(true);
        }
        LongClickHandler listener = new LongClickHandler(onLongClickListener, view);
        control.addListener(org.eclipse.swt.SWT.MouseDown, listener);
        control.addListener(org.eclipse.swt.SWT.MouseUp, listener);

        if (control instanceof org.eclipse.swt.widgets.Composite) {
            for (org.eclipse.swt.widgets.Control child : ((org.eclipse.swt.widgets.Composite) control).getChildren()) {
            	addLongClickListener(w, child, onLongClickListener);
            }
        }
    }

	private static void nativeBringToFront(java.util.List<IWidget> widgets) {
		for (IWidget child : widgets) {
			Control control = (Control) child.asNativeWidget();
//			if (control.isVisible()) {
				control.moveAbove(null);
//			}
		}
	}

	//start - eventInfo
	public static void addEventInfo(Map<String, Object> obj, MenuItem item) {
		obj.put("itemId", IdGenerator.getName(item.getItemId()));
		if (item.getActionView() != null && item.getActionView().getTag() != null) {
			obj.put("actionLayoutId", item.getActionView().getTag());
		}
	}
	//end - eventInfo
	
	private static void setSwtResizeOptions(IWidget w, Object objValue) {
		w.storeInTempCache("swtResizeOptions", com.ashera.common.ImageUtils.getResizeOptionsAsMap(w, objValue));
	}

	
	private static void setNativeId(IWidget w, String strValue) {
	}
	
	
	private static void setOutsideTouchable(IWidget w, String strValue, Object objValue, View view) {
		ViewImpl.setOnClick(w, "outsideTouchable", new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if ((boolean) objValue) {
					 w.getFragment().getEventBus().notifyObservers(com.ashera.widget.bus.Event.StandardEvents.outsideClicked.toString(), null);
				}
			}
		});
		
	}
	
    public static int nativeMeasureWidth(Object uiView) {		
    	Control control = (Control) uiView;
	    Point size = control.computeSize(org.eclipse.swt.SWT.DEFAULT, org.eclipse.swt.SWT.DEFAULT);
		return size.x;
	}
    
    public static int nativeMeasureHeight(Object uiView, int width) {
	    Control control = (Control) uiView;
		Point size = control.computeSize(width, org.eclipse.swt.SWT.DEFAULT);
		return size.y;
	}
    
	

    
	private static void addSwipeListener(IWidget w, SwipeHelper swipeHelper) {
		Control control = (Control) w.asNativeWidget();
		setOnListener(w, org.eclipse.swt.SWT.MouseDown, org.eclipse.swt.SWT.MouseDown + "swipe",  (event) -> {
			swipeHelper.onActionDown(event.x, event.y);
        });
		setOnListener(w, org.eclipse.swt.SWT.MouseUp, org.eclipse.swt.SWT.MouseUp + "swipe",  (event) -> {
			swipeHelper.onActionUp(event.x, event.y);
        });
	}
	
	public static void translateWithAnimation(Object pane, int x, int y, int animationDurationInMs, AnimationCallBack callBack) {
		org.eclipse.swt.widgets.Control root = (org.eclipse.swt.widgets.Control)pane;
		if (root.getListeners(com.ashera.common.AnimationUtils.Animating).length == 0) {
			root.addListener(com.ashera.common.AnimationUtils.Animating, (e) -> {
				int currentX = ViewImpl.getX(pane);
				int currentY = ViewImpl.getY(pane);
				callBack.animating(currentX, currentY);
			});
		}
		com.ashera.common.AnimationUtils animationUtils = new com.ashera.common.AnimationUtils();
		animationUtils.animate(root, x, y, animationDurationInMs);
	}
	
	
	public static void addPanListener(IWidget widget, Object uiView, PanCallBack callback) {
		PanListener listener = new PanListener(widget, callback);
		((org.eclipse.swt.widgets.Composite)uiView).addListener(org.eclipse.swt.SWT.MouseDown, listener);
        ((org.eclipse.swt.widgets.Composite)uiView).addListener(org.eclipse.swt.SWT.MouseMove, listener);
        ((org.eclipse.swt.widgets.Composite)uiView).addListener(org.eclipse.swt.SWT.MouseUp, listener);
	}
	private static class PanListener implements org.eclipse.swt.widgets.Listener {
		private PanCallBack callback;
		private IWidget widget;
		public PanListener(IWidget widget, PanCallBack callback) {
			this.callback = callback;
			this.widget = widget;
		}
	
		@Override
		public void handleEvent(org.eclipse.swt.widgets.Event event) {
			if (event.type == org.eclipse.swt.SWT.MouseDown) {
				this.callback.handlePanStart(widget, event.widget, event.x, event.y);
			}
	
			if (event.type == org.eclipse.swt.SWT.MouseMove) {
				this.callback.handlePanDrag(widget, event.widget, event.x, event.y);
			}
			if (event.type == org.eclipse.swt.SWT.MouseUp) {
				this.callback.handlePanEnd(widget, event.widget, event.x, event.y);
			}
		}
	}
	
	//start - animator
	private static void setAnimatorXml(IWidget w, Object objValue) {
 		String value = (String) objValue;
 		if (value.startsWith("@animator/")) {
 			String html = w.getFragment().getInlineResource(value);
 			if (html == null) {
 				html = PluginInvoker.getFileAsset("res/" + (value).substring(1) + ".xml", w.getFragment());
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
			html = PluginInvoker.getFileAsset("res/" + (value).substring(1) + ".xml", w.getFragment());
		}
		AnimationContentHandler handler = new AnimationContentHandler(w);
		com.ashera.parser.html.HtmlParser.parse(handler, html);
		return handler.timeInterpolator;
	}

	
	private static class AnimationContentHandler extends com.ashera.parser.html.ContentHandlerAdapter {
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
				int pixelSize = 1;
			    r.android.graphics.Path path = r.android.graphics.Path.createPathFromPathData(pathData);
			    float error = 0.5f * pixelSize; // max half a pixel error
			    r.android.animation.PathKeyframes keyframeSet = r.android.animation.KeyframeSet.ofPath(path, error);
			    r.android.animation.IKeyframes xKeyframes;
			    r.android.animation.IKeyframes yKeyframes;
			    if (valueType == VALUE_TYPE_FLOAT) {
			        xKeyframes = keyframeSet.createXFloatKeyframes();
			        yKeyframes = keyframeSet.createYFloatKeyframes();
			    } else {
			        xKeyframes = keyframeSet.createXIntKeyframes();
			        yKeyframes = keyframeSet.createYIntKeyframes();
			    }
			    r.android.animation.PropertyValuesHolder x = null;
			    r.android.animation.PropertyValuesHolder y = null;
			    if (propertyXName != null) {
			        x = r.android.animation.PropertyValuesHolder.ofKeyframes(propertyXName, xKeyframes);
			    }
			    if (propertyYName != null) {
			        y = r.android.animation.PropertyValuesHolder.ofKeyframes(propertyYName, yKeyframes);
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
 				html = PluginInvoker.getFileAsset("res/" + (value).substring(1) + ".xml", w.getFragment());
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
					evaluator = r.android.animation.ArgbEvaluator.getInstance();
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
	//end - animator

	private static void setTranslationX(IWidget w, Object objValue) {
		Control control = (Control) w.asNativeWidget();
		View view = (View) w.asWidget();
		int data = view.getLeft();
		updateBounds(control, data + ((Float) objValue).intValue(), control.getBounds().y, control.getBounds().width, control.getBounds().height);
	}
	
	private static Object getTranslationX(IWidget w) {
		Control control = (Control) w.asNativeWidget();
		View view = (View) w.asWidget();
		int data = view.getLeft();
		return control.getBounds().x - data;
	}
	
	private static void setTranslationY(IWidget w, Object objValue) {
		Control control = (Control) w.asNativeWidget();
		View view = (View) w.asWidget();
		int data = view.getTop();
		updateBounds(control, control.getBounds().x, data + ((Float) objValue).intValue(), control.getBounds().width, control.getBounds().height);
	}
	
	private static Object getTranslationY(IWidget w) {
		Control control = (Control) w.asNativeWidget();
		View view = (View) w.asWidget();
		int data = view.getTop();
		return control.getBounds().y - data;
	}
	
	
	private static void drawImageUsingGC(IWidget w, Object objValue) {
		Control control = (Control) w.asNativeWidget();
		if (control.getData("paintListener") != null) {
			control.removePaintListener((org.eclipse.swt.events.PaintListener) control.getData("paintListener"));
		}
		
		org.eclipse.swt.events.PaintListener listener = new org.eclipse.swt.events.PaintListener() {
			@Override
			public void paintControl(org.eclipse.swt.events.PaintEvent e) {
				GC gc = e.gc;
				if (objValue instanceof r.android.graphics.drawable.Drawable) {
					drawImage(gc, (r.android.graphics.drawable.Drawable) objValue);
				}
				
				if (objValue instanceof java.util.List) {
					for (Object obj : (java.util.List) objValue) {
						if (obj instanceof r.android.graphics.drawable.Drawable) {
							drawImage(gc, (r.android.graphics.drawable.Drawable) obj);	
						}
					}
				}
				
			}

			private void drawImage(GC gc, r.android.graphics.drawable.Drawable drawable) {
				Object imageOrColor = drawable.getDrawable();
				
				if (imageOrColor instanceof Image) {
					r.android.graphics.Rect bounds = drawable.getBounds();
					Image image = (Image) imageOrColor;
					if (bounds.width() != 0 && bounds.height() != 0) {
						gc.drawImage(image, 0, 0, image.getImageData().width, image.getImageData().height, bounds.left, bounds.top, bounds.width(), bounds.height());
					} else {
						gc.drawImage(image, drawable.getLeft(), drawable.getTop());
					}
				}
				if (imageOrColor instanceof Color) {
					gc.setBackground((Color) imageOrColor);
					r.android.graphics.Rect bounds = drawable.getBounds();
					gc.fillRectangle(bounds.left, bounds.top, bounds.width(), bounds.height());
				}
			}
			
		};
		control.setData("paintListener", listener);
		control.addPaintListener(listener);
		control.redraw();
	}
	
	
	private static void setCornerRadius(IWidget w, Object nativeWidget, Object objValue) {
		Control control = (Control) nativeWidget;
		float radius = ((Number) objValue).floatValue();
		if (control.getData("resizeListner") != null) {
			control.removeListener(org.eclipse.swt.SWT.Resize, (Listener) control.getData("resizeListner"));
		}


		Listener listener = new Listener() {
			@Override
			public void handleEvent(Event event) {
				setCornerRadius(control, radius);
			}
		};
		control.setData("resizeListner", listener);
		control.addListener(org.eclipse.swt.SWT.Resize, listener);
		if (w.isInitialised()) {
			listener.handleEvent(new Event());
		}
		
	}

	private static void setCornerRadius(Control control, float radius) {
		// corner radius based on region cannot be used on linux hence disabling it
		if (com.ashera.common.OperatingSystem.isLinux()) {
			return;
		}
		int width = control.getBounds().width;
		int height = control.getBounds().height;
		// Apply the region to the composite
		if (width > 0 && height > 0 && radius > 0) {
			Region region = createRoundedRectangle(0, 0, width, height, (int) radius);
			control.setRegion(region);
			region.dispose();
		}
	}
	
	private static Region createRoundedRectangle(int x, int y, int W, int H, int r) {
       Region region = new Region();
        int d = (2 * r); // diameter

        region.add(circle(r, (x + r), (y + r)));
        region.add(circle(r, abs(x + W - r), (y + r)));
        region.add(circle(r, abs(x + W - r), abs(y + H - r)));
        region.add(circle(r, (x + r), abs(y + H - r)));

        region.add((x + r), y, abs(W - d), H);
        region.add(x, (y + r), W, abs(H - d));

        return region;
    }
	
	private static int abs(int x) {
		if (x < 0) return 0;
        return x;
    }
    
	private static int[] circle(int r, int offsetX, int offsetY) {
        int[] polygon = new int[8 * r + 4];
        // x^2 + y^2 = r^2
        for (int i = 0; i < 2 * r + 1; i++) {
            int x = i - r;
            int y = (int) Math.sqrt(r * r - x * x);
            polygon[2 * i] = offsetX + x;
            polygon[2 * i + 1] = offsetY + y;
            polygon[8 * r - 2 * i - 2] = offsetX + x;
            polygon[8 * r - 2 * i - 1] = offsetY - y;
        }
        return polygon;
    }}
