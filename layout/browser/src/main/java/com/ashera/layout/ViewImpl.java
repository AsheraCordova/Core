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
import org.teavm.jso.dom.html.HTMLElement;


import static com.ashera.widget.IWidget.*;
//end - imports
import r.android.view.KeyEvent;
import r.android.view.MenuItem;
import r.android.view.MotionEvent;
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
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("left").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("right").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("top").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("bottom").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("id").withType("id"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("alpha").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelSyncEvents").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelParam").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelPojoToUi").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelUiToPojo").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelPojoToUiParams").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("refreshUiFromModel").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("modelUiToPojoEventIds").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("updateModelData").withType("object"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("notifyDataSetChanged").withType("boolean"));
		ConverterFactory.register("View.visibility", new Visibility());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("visibility").withType("View.visibility").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("background").withType("drawable").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		ConverterFactory.register("View.backgroundRepeat", new BackgroundRepeat());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("backgroundRepeat").withType("View.backgroundRepeat").withOrder(-10).withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minWidth").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("minHeight").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("invalidate").withType("nil"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("requestLayout").withType("nil"));
		ConverterFactory.register("View.layoutDirection", new LayoutDirection());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layoutDirection").withType("View.layoutDirection").beforeChildAdd());
		ConverterFactory.register("View.textDirection", new TextDirection());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textDirection").withType("View.textDirection").withOrder(100));
		ConverterFactory.register("View.textAlignment", new TextAlignment());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("textAlignment").withType("View.textAlignment"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onClick").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onLongClick").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onTouch").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onKey").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onHover").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onDrag").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("clickable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("duplicateParentState").withType("boolean").beforeChildAdd());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("longClickable").withType("boolean").withOrder(1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("asDragSource").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("tooltipText").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("enabled").withType("boolean").withOrder(-10));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("attributeUnderTest").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("zIndex").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxWidth").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("maxHeight").withType("dimension").withUiFlag(UPDATE_UI_REQUEST_LAYOUT));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("webTabIndex").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("webOverflow").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("webGlobalAttributes").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("translationX").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("translationY").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("translationZ").withType("dimensionfloat").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("rotation").withType("float").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("rotationX").withType("float").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("rotationY").withType("float").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scaleX").withType("float").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("scaleY").withType("float").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("outsideTouchable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("elevation").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("onSwiped").withType("string"));
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
		org.teavm.jso.dom.html.HTMLElement hTMLElement = (org.teavm.jso.dom.html.HTMLElement) nativeWidget;
		switch (key.getAttributeName()) {
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
		case "alpha": {


		 setAlpha(nativeWidget, objValue);



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
		case "visibility": {


		 setVisibility(w, nativeWidget, objValue);



			}
			break;
		case "background": {


		setBackground(w, nativeWidget, objValue);



			}
			break;
		case "backgroundRepeat": {


		setBackgroundRepeat(w, nativeWidget, strValue);



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
		case "invalidate": {


		 invalidate(w);



			}
			break;
		case "requestLayout": {


		 requestLayout(w);



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
		case "onClick": {


		 setOnClick(w, nativeWidget, objValue);



			}
			break;
		case "onLongClick": {


		 setOnLongClick(w, nativeWidget, objValue);



			}
			break;
		case "onTouch": {


		 setOnTouch(w, nativeWidget, objValue);



			}
			break;
		case "onKey": {


		 setOnKey(w, nativeWidget, objValue);



			}
			break;
		case "onHover": {


		 setOnHover(w, nativeWidget, objValue);



			}
			break;
		case "onDrag": {


		 setOnDrag(w, nativeWidget, objValue);



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
		case "asDragSource": {


		 setAsDragSource(w, nativeWidget, objValue);



			}
			break;
		case "tooltipText": {


		 setTooltipText(w, nativeWidget, objValue);



			}
			break;
		case "enabled": {


		view.setEnabled((boolean)objValue);



			}
			break;
		case "attributeUnderTest": {


		 //



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
		case "webTabIndex": {


		 setTabIndex(w, nativeWidget, objValue);



			}
			break;
		case "webOverflow": {


		 setWebOverflow(w, nativeWidget, objValue);



			}
			break;
		case "webGlobalAttributes": {


		 setWebGlobalAttributes(w, nativeWidget, objValue);



			}
			break;
		case "translationX": {


		 setTranslationX(w, nativeWidget, objValue);



			}
			break;
		case "translationY": {


		 setTranslationY(w, nativeWidget, objValue);



			}
			break;
		case "translationZ": {


		 setTranslationZ(w, nativeWidget, objValue);



			}
			break;
		case "rotation": {


		 setRotation(w, nativeWidget, objValue);



			}
			break;
		case "rotationX": {


		 setRotationX(w, nativeWidget, objValue);



			}
			break;
		case "rotationY": {


		 setRotationY(w, nativeWidget, objValue);



			}
			break;
		case "scaleX": {


		 setScaleX(w, nativeWidget, objValue);



			}
			break;
		case "scaleY": {


		 setScaleY(w, nativeWidget, objValue);



			}
			break;
		case "outsideTouchable": {


		setOutsideTouchable(w, strValue, objValue, view);



			}
			break;
		case "elevation": {


		 setElevation(w, objValue);



			}
			break;
		case "onSwiped": {


		if (objValue instanceof String) {setOnSwipeListener(w, new SwipeListener(w, strValue, "onSwiped"));} else {setOnSwipeListener(w, (SwipeHelper.SwipeListener) objValue);}



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
		org.teavm.jso.dom.html.HTMLElement hTMLElement = (org.teavm.jso.dom.html.HTMLElement) nativeWidget;
		switch (key.getAttributeName()) {
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
			case "alpha": {
return getAlpha(nativeWidget);			}
			case "modelSyncEvents": {
return getModelSyncEvents(w);			}
			case "modelParam": {
return getModelParam(w);			}
			case "modelPojoToUi": {
return getModelPojoToUi(w);			}
			case "modelUiToPojo": {
return getModelUiToPojo(w);			}
			case "visibility": {
return getVisibility(w);			}
			case "background": {
return view.getBackground();			}
			case "minWidth": {
return getMinWidth(w);			}
			case "minHeight": {
return getMinHeight(w);			}
			case "layoutDirection": {
return getLayoutDirection(w);			}
			case "textDirection": {
return getTextDirection(w);			}
			case "textAlignment": {
return getTextAlignment(w);			}
			case "clickable": {
return getClickable(w);			}
			case "duplicateParentState": {
return getDuplicateParentState(w);			}
			case "longClickable": {
return getLongClickable(w);			}
			case "enabled": {
return view.isEnabled();			}
			case "maxWidth": {
return getMaxWidth(w);			}
			case "maxHeight": {
return getMaxHeight(w);			}
			case "translationX": {
return getTranslationX(w, nativeWidget);			}
			case "translationY": {
return getTranslationY(w, nativeWidget);			}
			case "translationZ": {
return getTranslationZ(w, nativeWidget);			}
			case "rotation": {
return getRotation(w, nativeWidget);			}
			case "rotationX": {
return getRotationX(w, nativeWidget);			}
			case "rotationY": {
return getRotationY(w, nativeWidget);			}
			case "scaleX": {
return getScaleX(w, nativeWidget);			}
			case "scaleY": {
return getScaleY(w, nativeWidget);			}
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
		w.drawableStateChanged();
		View view = (View) w.asWidget();
		
		r.android.graphics.drawable.Drawable background = view.getBackground();
		if (background != null && background.isStateful() && background.setState(view.getDrawableState())) {
			setBackground(w, w.asNativeWidget(), background, true);
		}
		
		r.android.graphics.drawable.Drawable foreground = view.getForeground();
		if (foreground != null && foreground.isStateful() && foreground.setState(view.getDrawableState())) {
			setForeground(w, w.asNativeWidget(), foreground);
		}
		
		if (view.getBackgroundTintList() != null && view.getBackgroundTintList().isStateful()) {
			setBackgroundTint(w, view.getBackgroundTintList());
			w.invalidate();
		}
		
		if (view.getForegroundTintList() != null && view.getForegroundTintList().isStateful()) {
			setForegroundTint(w, view.getForegroundTintList());
			w.invalidate();
		}
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
			    r.android.animation.Keyframes xKeyframes;
			    r.android.animation.Keyframes yKeyframes;
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
		    activity.sendEventMessage(obj);
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
		    activity.sendEventMessage(obj);
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
		    activity.sendEventMessage(obj);
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
		    activity.sendEventMessage(obj);
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
		    activity.sendEventMessage(obj);
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
		    activity.sendEventMessage(obj);
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
		    activity.sendEventMessage(obj);
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
		    activity.sendEventMessage(obj);
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
		    activity.sendEventMessage(obj);
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
		    activity.sendEventMessage(obj);
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
		    activity.sendEventMessage(obj);
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


	


public static abstract class ViewCommandBuilder<T> {
	protected Map<String, Object> command = new HashMap<>();
	protected int orderGet;
    protected int orderSet;
    
    
    protected abstract T execute(boolean set);

    public T reset() {
    	orderGet = 0;
    	orderSet = 0;
    	command = new HashMap<>();
return (T) this;    }
    
    public Map<String, Object> initCommand(String attributeName) {
		Map<String, Object> attrs = (Map<String, Object>) command.get(attributeName);
		if (attrs == null) {
			attrs = new HashMap<>();
			command.put(attributeName, attrs);
		}
		return attrs;
	}
    public ViewCommandBuilder() {
	}
	

public T tryGetSelected() {
	Map<String, Object> attrs = initCommand("selected");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object isSelected() {
	Map<String, Object> attrs = initCommand("selected");
	return attrs.get("commandReturnValue");
}
public T setSelected(boolean value) {
	Map<String, Object> attrs = initCommand("selected");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setStyle(String value) {
	Map<String, Object> attrs = initCommand("style");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setErrorStyle(String value) {
	Map<String, Object> attrs = initCommand("errorStyle");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetValidateForm() {
	Map<String, Object> attrs = initCommand("validateForm_");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getValidateForm() {
	Map<String, Object> attrs = initCommand("validateForm_");
	return attrs.get("commandReturnValue");
}
public T validateForm(String value) {
	Map<String, Object> attrs = initCommand("validateForm");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setValidation(String value) {
	Map<String, Object> attrs = initCommand("validation");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setV_required(String value) {
	Map<String, Object> attrs = initCommand("v_required");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setV_minlength(String value) {
	Map<String, Object> attrs = initCommand("v_minlength");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setV_maxlength(String value) {
	Map<String, Object> attrs = initCommand("v_maxlength");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setV_min(String value) {
	Map<String, Object> attrs = initCommand("v_min");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setV_max(String value) {
	Map<String, Object> attrs = initCommand("v_max");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setV_pattern(String value) {
	Map<String, Object> attrs = initCommand("v_pattern");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setV_type(String value) {
	Map<String, Object> attrs = initCommand("v_type");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setValidationErrorDisplayType(String value) {
	Map<String, Object> attrs = initCommand("validationErrorDisplayType");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setCustomErrorMessageValues(String value) {
	Map<String, Object> attrs = initCommand("customErrorMessageValues");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setCustomErrorMessageKeys(String value) {
	Map<String, Object> attrs = initCommand("customErrorMessageKeys");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setInvalidateOnFrameChange(boolean value) {
	Map<String, Object> attrs = initCommand("invalidateOnFrameChange");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T animatorXml(String value) {
	Map<String, Object> attrs = initCommand("animatorXml");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T startAnimator() {
	Map<String, Object> attrs = initCommand("startAnimator");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	
return (T) this;}
public T endAnimator() {
	Map<String, Object> attrs = initCommand("endAnimator");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	
return (T) this;}
public T setOnAnimationStart(String value) {
	Map<String, Object> attrs = initCommand("onAnimationStart");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setOnAnimationEnd(String value) {
	Map<String, Object> attrs = initCommand("onAnimationEnd");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setOnAnimationCancel(String value) {
	Map<String, Object> attrs = initCommand("onAnimationCancel");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setOnAnimationRepeat(String value) {
	Map<String, Object> attrs = initCommand("onAnimationRepeat");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetLeft() {
	Map<String, Object> attrs = initCommand("left");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getLeft() {
	Map<String, Object> attrs = initCommand("left");
	return attrs.get("commandReturnValue");
}
public T setLeft(String value) {
	Map<String, Object> attrs = initCommand("left");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetRight() {
	Map<String, Object> attrs = initCommand("right");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getRight() {
	Map<String, Object> attrs = initCommand("right");
	return attrs.get("commandReturnValue");
}
public T setRight(String value) {
	Map<String, Object> attrs = initCommand("right");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetTop() {
	Map<String, Object> attrs = initCommand("top");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getTop() {
	Map<String, Object> attrs = initCommand("top");
	return attrs.get("commandReturnValue");
}
public T setTop(String value) {
	Map<String, Object> attrs = initCommand("top");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetBottom() {
	Map<String, Object> attrs = initCommand("bottom");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getBottom() {
	Map<String, Object> attrs = initCommand("bottom");
	return attrs.get("commandReturnValue");
}
public T setBottom(String value) {
	Map<String, Object> attrs = initCommand("bottom");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetId() {
	Map<String, Object> attrs = initCommand("id");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getId() {
	Map<String, Object> attrs = initCommand("id");
	return attrs.get("commandReturnValue");
}
public T setId(String value) {
	Map<String, Object> attrs = initCommand("id");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetAlpha() {
	Map<String, Object> attrs = initCommand("alpha");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getAlpha() {
	Map<String, Object> attrs = initCommand("alpha");
	return attrs.get("commandReturnValue");
}
public T setAlpha(float value) {
	Map<String, Object> attrs = initCommand("alpha");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetModelSyncEvents() {
	Map<String, Object> attrs = initCommand("modelSyncEvents");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getModelSyncEvents() {
	Map<String, Object> attrs = initCommand("modelSyncEvents");
	return attrs.get("commandReturnValue");
}
public T setModelSyncEvents(String value) {
	Map<String, Object> attrs = initCommand("modelSyncEvents");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetModelParam() {
	Map<String, Object> attrs = initCommand("modelParam");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getModelParam() {
	Map<String, Object> attrs = initCommand("modelParam");
	return attrs.get("commandReturnValue");
}
public T setModelParam(String value) {
	Map<String, Object> attrs = initCommand("modelParam");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetModelPojoToUi() {
	Map<String, Object> attrs = initCommand("modelPojoToUi");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getModelPojoToUi() {
	Map<String, Object> attrs = initCommand("modelPojoToUi");
	return attrs.get("commandReturnValue");
}
public T setModelPojoToUi(String value) {
	Map<String, Object> attrs = initCommand("modelPojoToUi");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetModelUiToPojo() {
	Map<String, Object> attrs = initCommand("modelUiToPojo");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getModelUiToPojo() {
	Map<String, Object> attrs = initCommand("modelUiToPojo");
	return attrs.get("commandReturnValue");
}
public T setModelUiToPojo(String value) {
	Map<String, Object> attrs = initCommand("modelUiToPojo");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setModelPojoToUiParams(String value) {
	Map<String, Object> attrs = initCommand("modelPojoToUiParams");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T refreshUiFromModel(String value) {
	Map<String, Object> attrs = initCommand("refreshUiFromModel");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setModelUiToPojoEventIds(String value) {
	Map<String, Object> attrs = initCommand("modelUiToPojoEventIds");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T updateModelData(String expression,
Object payload) {
	Map<String, Object> attrs = initCommand("updateModelData");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	Map<String, Object> wrapper = new HashMap<>();
	wrapper.put("expression", expression);
	wrapper.put("payload", payload);
	attrs.put("value", wrapper);
return (T) this;}
public T notifyDataSetChanged(boolean value) {
	Map<String, Object> attrs = initCommand("notifyDataSetChanged");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetVisibility() {
	Map<String, Object> attrs = initCommand("visibility");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getVisibility() {
	Map<String, Object> attrs = initCommand("visibility");
	return attrs.get("commandReturnValue");
}
public T setVisibility(String value) {
	Map<String, Object> attrs = initCommand("visibility");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetBackground() {
	Map<String, Object> attrs = initCommand("background");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getBackground() {
	Map<String, Object> attrs = initCommand("background");
	return attrs.get("commandReturnValue");
}
public T setBackground(String value) {
	Map<String, Object> attrs = initCommand("background");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setBackgroundRepeat(String value) {
	Map<String, Object> attrs = initCommand("backgroundRepeat");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetMinWidth() {
	Map<String, Object> attrs = initCommand("minWidth");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getMinWidth() {
	Map<String, Object> attrs = initCommand("minWidth");
	return attrs.get("commandReturnValue");
}
public T setMinWidth(String value) {
	Map<String, Object> attrs = initCommand("minWidth");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetMinHeight() {
	Map<String, Object> attrs = initCommand("minHeight");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getMinHeight() {
	Map<String, Object> attrs = initCommand("minHeight");
	return attrs.get("commandReturnValue");
}
public T setMinHeight(String value) {
	Map<String, Object> attrs = initCommand("minHeight");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T invalidate() {
	Map<String, Object> attrs = initCommand("invalidate");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	
return (T) this;}
public T requestLayout() {
	Map<String, Object> attrs = initCommand("requestLayout");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	
return (T) this;}
public T tryGetLayoutDirection() {
	Map<String, Object> attrs = initCommand("layoutDirection");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getLayoutDirection() {
	Map<String, Object> attrs = initCommand("layoutDirection");
	return attrs.get("commandReturnValue");
}
public T setLayoutDirection(String value) {
	Map<String, Object> attrs = initCommand("layoutDirection");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetTextDirection() {
	Map<String, Object> attrs = initCommand("textDirection");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getTextDirection() {
	Map<String, Object> attrs = initCommand("textDirection");
	return attrs.get("commandReturnValue");
}
public T setTextDirection(String value) {
	Map<String, Object> attrs = initCommand("textDirection");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetTextAlignment() {
	Map<String, Object> attrs = initCommand("textAlignment");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getTextAlignment() {
	Map<String, Object> attrs = initCommand("textAlignment");
	return attrs.get("commandReturnValue");
}
public T setTextAlignment(String value) {
	Map<String, Object> attrs = initCommand("textAlignment");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setOnClick(String value) {
	Map<String, Object> attrs = initCommand("onClick");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setOnLongClick(String value) {
	Map<String, Object> attrs = initCommand("onLongClick");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setOnTouch(String value) {
	Map<String, Object> attrs = initCommand("onTouch");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setOnKey(String value) {
	Map<String, Object> attrs = initCommand("onKey");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setOnHover(String value) {
	Map<String, Object> attrs = initCommand("onHover");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setOnDrag(String value) {
	Map<String, Object> attrs = initCommand("onDrag");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetClickable() {
	Map<String, Object> attrs = initCommand("clickable");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object isClickable() {
	Map<String, Object> attrs = initCommand("clickable");
	return attrs.get("commandReturnValue");
}
public T setClickable(boolean value) {
	Map<String, Object> attrs = initCommand("clickable");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetDuplicateParentState() {
	Map<String, Object> attrs = initCommand("duplicateParentState");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object isDuplicateParentState() {
	Map<String, Object> attrs = initCommand("duplicateParentState");
	return attrs.get("commandReturnValue");
}
public T setDuplicateParentState(boolean value) {
	Map<String, Object> attrs = initCommand("duplicateParentState");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetLongClickable() {
	Map<String, Object> attrs = initCommand("longClickable");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object isLongClickable() {
	Map<String, Object> attrs = initCommand("longClickable");
	return attrs.get("commandReturnValue");
}
public T setLongClickable(boolean value) {
	Map<String, Object> attrs = initCommand("longClickable");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setAsDragSource(String value) {
	Map<String, Object> attrs = initCommand("asDragSource");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setTooltipText(String value) {
	Map<String, Object> attrs = initCommand("tooltipText");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetEnabled() {
	Map<String, Object> attrs = initCommand("enabled");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object isEnabled() {
	Map<String, Object> attrs = initCommand("enabled");
	return attrs.get("commandReturnValue");
}
public T setEnabled(boolean value) {
	Map<String, Object> attrs = initCommand("enabled");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setAttributeUnderTest(String value) {
	Map<String, Object> attrs = initCommand("attributeUnderTest");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setZIndex(int value) {
	Map<String, Object> attrs = initCommand("zIndex");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetMaxWidth() {
	Map<String, Object> attrs = initCommand("maxWidth");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getMaxWidth() {
	Map<String, Object> attrs = initCommand("maxWidth");
	return attrs.get("commandReturnValue");
}
public T setMaxWidth(String value) {
	Map<String, Object> attrs = initCommand("maxWidth");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetMaxHeight() {
	Map<String, Object> attrs = initCommand("maxHeight");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getMaxHeight() {
	Map<String, Object> attrs = initCommand("maxHeight");
	return attrs.get("commandReturnValue");
}
public T setMaxHeight(String value) {
	Map<String, Object> attrs = initCommand("maxHeight");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setWebTabIndex(String value) {
	Map<String, Object> attrs = initCommand("webTabIndex");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setWebOverflow(String value) {
	Map<String, Object> attrs = initCommand("webOverflow");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setWebGlobalAttributes(String value) {
	Map<String, Object> attrs = initCommand("webGlobalAttributes");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetTranslationX() {
	Map<String, Object> attrs = initCommand("translationX");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getTranslationX() {
	Map<String, Object> attrs = initCommand("translationX");
	return attrs.get("commandReturnValue");
}
public T setTranslationX(String value) {
	Map<String, Object> attrs = initCommand("translationX");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetTranslationY() {
	Map<String, Object> attrs = initCommand("translationY");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getTranslationY() {
	Map<String, Object> attrs = initCommand("translationY");
	return attrs.get("commandReturnValue");
}
public T setTranslationY(String value) {
	Map<String, Object> attrs = initCommand("translationY");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetTranslationZ() {
	Map<String, Object> attrs = initCommand("translationZ");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getTranslationZ() {
	Map<String, Object> attrs = initCommand("translationZ");
	return attrs.get("commandReturnValue");
}
public T setTranslationZ(String value) {
	Map<String, Object> attrs = initCommand("translationZ");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetRotation() {
	Map<String, Object> attrs = initCommand("rotation");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getRotation() {
	Map<String, Object> attrs = initCommand("rotation");
	return attrs.get("commandReturnValue");
}
public T setRotation(float value) {
	Map<String, Object> attrs = initCommand("rotation");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetRotationX() {
	Map<String, Object> attrs = initCommand("rotationX");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getRotationX() {
	Map<String, Object> attrs = initCommand("rotationX");
	return attrs.get("commandReturnValue");
}
public T setRotationX(float value) {
	Map<String, Object> attrs = initCommand("rotationX");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetRotationY() {
	Map<String, Object> attrs = initCommand("rotationY");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getRotationY() {
	Map<String, Object> attrs = initCommand("rotationY");
	return attrs.get("commandReturnValue");
}
public T setRotationY(float value) {
	Map<String, Object> attrs = initCommand("rotationY");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetScaleX() {
	Map<String, Object> attrs = initCommand("scaleX");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getScaleX() {
	Map<String, Object> attrs = initCommand("scaleX");
	return attrs.get("commandReturnValue");
}
public T setScaleX(float value) {
	Map<String, Object> attrs = initCommand("scaleX");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T tryGetScaleY() {
	Map<String, Object> attrs = initCommand("scaleY");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return (T) this;}

public Object getScaleY() {
	Map<String, Object> attrs = initCommand("scaleY");
	return attrs.get("commandReturnValue");
}
public T setScaleY(float value) {
	Map<String, Object> attrs = initCommand("scaleY");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setOutsideTouchable(boolean value) {
	Map<String, Object> attrs = initCommand("outsideTouchable");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setElevation(String value) {
	Map<String, Object> attrs = initCommand("elevation");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
public T setOnSwiped(String value) {
	Map<String, Object> attrs = initCommand("onSwiped");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return (T) this;}
}
static class ViewCommandBuilderInternal extends ViewCommandBuilder<ViewCommandBuilderInternal> {
	private IWidget widget;
	public ViewCommandBuilderInternal(IWidget widget) {
		this.widget = widget;
	}
	@Override
	protected ViewCommandBuilderInternal execute(boolean setter) {
		if (setter) {
			widget.executeCommand(command, null, IWidget.COMMAND_EXEC_SETTER_METHOD);
			widget.getFragment().remeasure();
		}
		widget.executeCommand(command, null, IWidget.COMMAND_EXEC_GETTER_METHOD);

		return this;
	}
}
public static class ViewBean {
	private ViewCommandBuilderInternal commandBuilder;
	public ViewBean(IWidget widget) {
		commandBuilder = new ViewCommandBuilderInternal(widget);
	}
	private ViewCommandBuilderInternal getBuilder() {
		return commandBuilder;
	}
public Object isSelected() {
	return getBuilder().reset().tryGetSelected().execute(false).isSelected(); 
}
public void setSelected(boolean value) {
	getBuilder().reset().setSelected(value).execute(true);
}

public void setStyle(String value) {
	getBuilder().reset().setStyle(value).execute(true);
}

public void setErrorStyle(String value) {
	getBuilder().reset().setErrorStyle(value).execute(true);
}

public Object getValidateForm() {
	return getBuilder().reset().tryGetValidateForm().execute(false).getValidateForm(); 
}
public void validateForm(String value) {
	getBuilder().reset().validateForm(value).execute(true);
}

public void setValidation(String value) {
	getBuilder().reset().setValidation(value).execute(true);
}

public void setV_required(String value) {
	getBuilder().reset().setV_required(value).execute(true);
}

public void setV_minlength(String value) {
	getBuilder().reset().setV_minlength(value).execute(true);
}

public void setV_maxlength(String value) {
	getBuilder().reset().setV_maxlength(value).execute(true);
}

public void setV_min(String value) {
	getBuilder().reset().setV_min(value).execute(true);
}

public void setV_max(String value) {
	getBuilder().reset().setV_max(value).execute(true);
}

public void setV_pattern(String value) {
	getBuilder().reset().setV_pattern(value).execute(true);
}

public void setV_type(String value) {
	getBuilder().reset().setV_type(value).execute(true);
}

public void setValidationErrorDisplayType(String value) {
	getBuilder().reset().setValidationErrorDisplayType(value).execute(true);
}

public void setCustomErrorMessageValues(String value) {
	getBuilder().reset().setCustomErrorMessageValues(value).execute(true);
}

public void setCustomErrorMessageKeys(String value) {
	getBuilder().reset().setCustomErrorMessageKeys(value).execute(true);
}

public void setInvalidateOnFrameChange(boolean value) {
	getBuilder().reset().setInvalidateOnFrameChange(value).execute(true);
}

public void animatorXml(String value) {
	getBuilder().reset().animatorXml(value).execute(true);
}

public void startAnimator() {
	getBuilder().reset().startAnimator().execute(true);
}

public void endAnimator() {
	getBuilder().reset().endAnimator().execute(true);
}

public void setOnAnimationStart(String value) {
	getBuilder().reset().setOnAnimationStart(value).execute(true);
}

public void setOnAnimationEnd(String value) {
	getBuilder().reset().setOnAnimationEnd(value).execute(true);
}

public void setOnAnimationCancel(String value) {
	getBuilder().reset().setOnAnimationCancel(value).execute(true);
}

public void setOnAnimationRepeat(String value) {
	getBuilder().reset().setOnAnimationRepeat(value).execute(true);
}

public Object getLeft() {
	return getBuilder().reset().tryGetLeft().execute(false).getLeft(); 
}
public void setLeft(String value) {
	getBuilder().reset().setLeft(value).execute(true);
}

public Object getRight() {
	return getBuilder().reset().tryGetRight().execute(false).getRight(); 
}
public void setRight(String value) {
	getBuilder().reset().setRight(value).execute(true);
}

public Object getTop() {
	return getBuilder().reset().tryGetTop().execute(false).getTop(); 
}
public void setTop(String value) {
	getBuilder().reset().setTop(value).execute(true);
}

public Object getBottom() {
	return getBuilder().reset().tryGetBottom().execute(false).getBottom(); 
}
public void setBottom(String value) {
	getBuilder().reset().setBottom(value).execute(true);
}

public Object getAlpha() {
	return getBuilder().reset().tryGetAlpha().execute(false).getAlpha(); 
}
public void setAlpha(float value) {
	getBuilder().reset().setAlpha(value).execute(true);
}

public Object getModelSyncEvents() {
	return getBuilder().reset().tryGetModelSyncEvents().execute(false).getModelSyncEvents(); 
}
public void setModelSyncEvents(String value) {
	getBuilder().reset().setModelSyncEvents(value).execute(true);
}

public Object getModelParam() {
	return getBuilder().reset().tryGetModelParam().execute(false).getModelParam(); 
}
public void setModelParam(String value) {
	getBuilder().reset().setModelParam(value).execute(true);
}

public Object getModelPojoToUi() {
	return getBuilder().reset().tryGetModelPojoToUi().execute(false).getModelPojoToUi(); 
}
public void setModelPojoToUi(String value) {
	getBuilder().reset().setModelPojoToUi(value).execute(true);
}

public Object getModelUiToPojo() {
	return getBuilder().reset().tryGetModelUiToPojo().execute(false).getModelUiToPojo(); 
}
public void setModelUiToPojo(String value) {
	getBuilder().reset().setModelUiToPojo(value).execute(true);
}

public void setModelPojoToUiParams(String value) {
	getBuilder().reset().setModelPojoToUiParams(value).execute(true);
}

public void refreshUiFromModel(String value) {
	getBuilder().reset().refreshUiFromModel(value).execute(true);
}

public void setModelUiToPojoEventIds(String value) {
	getBuilder().reset().setModelUiToPojoEventIds(value).execute(true);
}

public void updateModelData(String expression,
Object payload) {
	getBuilder().reset().updateModelData(expression,
payload).execute(true);
}

public void notifyDataSetChanged(boolean value) {
	getBuilder().reset().notifyDataSetChanged(value).execute(true);
}

public Object getVisibility() {
	return getBuilder().reset().tryGetVisibility().execute(false).getVisibility(); 
}
public void setVisibility(String value) {
	getBuilder().reset().setVisibility(value).execute(true);
}

public Object getBackground() {
	return getBuilder().reset().tryGetBackground().execute(false).getBackground(); 
}
public void setBackground(String value) {
	getBuilder().reset().setBackground(value).execute(true);
}

public void setBackgroundRepeat(String value) {
	getBuilder().reset().setBackgroundRepeat(value).execute(true);
}

public Object getMinWidth() {
	return getBuilder().reset().tryGetMinWidth().execute(false).getMinWidth(); 
}
public void setMinWidth(String value) {
	getBuilder().reset().setMinWidth(value).execute(true);
}

public Object getMinHeight() {
	return getBuilder().reset().tryGetMinHeight().execute(false).getMinHeight(); 
}
public void setMinHeight(String value) {
	getBuilder().reset().setMinHeight(value).execute(true);
}

public void invalidate() {
	getBuilder().reset().invalidate().execute(true);
}

public void requestLayout() {
	getBuilder().reset().requestLayout().execute(true);
}

public Object getLayoutDirection() {
	return getBuilder().reset().tryGetLayoutDirection().execute(false).getLayoutDirection(); 
}
public void setLayoutDirection(String value) {
	getBuilder().reset().setLayoutDirection(value).execute(true);
}

public Object getTextDirection() {
	return getBuilder().reset().tryGetTextDirection().execute(false).getTextDirection(); 
}
public void setTextDirection(String value) {
	getBuilder().reset().setTextDirection(value).execute(true);
}

public Object getTextAlignment() {
	return getBuilder().reset().tryGetTextAlignment().execute(false).getTextAlignment(); 
}
public void setTextAlignment(String value) {
	getBuilder().reset().setTextAlignment(value).execute(true);
}

public void setOnClick(String value) {
	getBuilder().reset().setOnClick(value).execute(true);
}

public void setOnLongClick(String value) {
	getBuilder().reset().setOnLongClick(value).execute(true);
}

public void setOnTouch(String value) {
	getBuilder().reset().setOnTouch(value).execute(true);
}

public void setOnKey(String value) {
	getBuilder().reset().setOnKey(value).execute(true);
}

public void setOnHover(String value) {
	getBuilder().reset().setOnHover(value).execute(true);
}

public void setOnDrag(String value) {
	getBuilder().reset().setOnDrag(value).execute(true);
}

public Object isClickable() {
	return getBuilder().reset().tryGetClickable().execute(false).isClickable(); 
}
public void setClickable(boolean value) {
	getBuilder().reset().setClickable(value).execute(true);
}

public Object isDuplicateParentState() {
	return getBuilder().reset().tryGetDuplicateParentState().execute(false).isDuplicateParentState(); 
}
public void setDuplicateParentState(boolean value) {
	getBuilder().reset().setDuplicateParentState(value).execute(true);
}

public Object isLongClickable() {
	return getBuilder().reset().tryGetLongClickable().execute(false).isLongClickable(); 
}
public void setLongClickable(boolean value) {
	getBuilder().reset().setLongClickable(value).execute(true);
}

public void setAsDragSource(String value) {
	getBuilder().reset().setAsDragSource(value).execute(true);
}

public void setTooltipText(String value) {
	getBuilder().reset().setTooltipText(value).execute(true);
}

public Object isEnabled() {
	return getBuilder().reset().tryGetEnabled().execute(false).isEnabled(); 
}
public void setEnabled(boolean value) {
	getBuilder().reset().setEnabled(value).execute(true);
}

public void setAttributeUnderTest(String value) {
	getBuilder().reset().setAttributeUnderTest(value).execute(true);
}

public void setZIndex(int value) {
	getBuilder().reset().setZIndex(value).execute(true);
}

public Object getMaxWidth() {
	return getBuilder().reset().tryGetMaxWidth().execute(false).getMaxWidth(); 
}
public void setMaxWidth(String value) {
	getBuilder().reset().setMaxWidth(value).execute(true);
}

public Object getMaxHeight() {
	return getBuilder().reset().tryGetMaxHeight().execute(false).getMaxHeight(); 
}
public void setMaxHeight(String value) {
	getBuilder().reset().setMaxHeight(value).execute(true);
}

public void setWebTabIndex(String value) {
	getBuilder().reset().setWebTabIndex(value).execute(true);
}

public void setWebOverflow(String value) {
	getBuilder().reset().setWebOverflow(value).execute(true);
}

public void setWebGlobalAttributes(String value) {
	getBuilder().reset().setWebGlobalAttributes(value).execute(true);
}

public Object getTranslationX() {
	return getBuilder().reset().tryGetTranslationX().execute(false).getTranslationX(); 
}
public void setTranslationX(String value) {
	getBuilder().reset().setTranslationX(value).execute(true);
}

public Object getTranslationY() {
	return getBuilder().reset().tryGetTranslationY().execute(false).getTranslationY(); 
}
public void setTranslationY(String value) {
	getBuilder().reset().setTranslationY(value).execute(true);
}

public Object getTranslationZ() {
	return getBuilder().reset().tryGetTranslationZ().execute(false).getTranslationZ(); 
}
public void setTranslationZ(String value) {
	getBuilder().reset().setTranslationZ(value).execute(true);
}

public Object getRotation() {
	return getBuilder().reset().tryGetRotation().execute(false).getRotation(); 
}
public void setRotation(float value) {
	getBuilder().reset().setRotation(value).execute(true);
}

public Object getRotationX() {
	return getBuilder().reset().tryGetRotationX().execute(false).getRotationX(); 
}
public void setRotationX(float value) {
	getBuilder().reset().setRotationX(value).execute(true);
}

public Object getRotationY() {
	return getBuilder().reset().tryGetRotationY().execute(false).getRotationY(); 
}
public void setRotationY(float value) {
	getBuilder().reset().setRotationY(value).execute(true);
}

public Object getScaleX() {
	return getBuilder().reset().tryGetScaleX().execute(false).getScaleX(); 
}
public void setScaleX(float value) {
	getBuilder().reset().setScaleX(value).execute(true);
}

public Object getScaleY() {
	return getBuilder().reset().tryGetScaleY().execute(false).getScaleY(); 
}
public void setScaleY(float value) {
	getBuilder().reset().setScaleY(value).execute(true);
}

public void setOutsideTouchable(boolean value) {
	getBuilder().reset().setOutsideTouchable(value).execute(true);
}

public void setElevation(String value) {
	getBuilder().reset().setElevation(value).execute(true);
}

public void setOnSwiped(String value) {
	getBuilder().reset().setOnSwiped(value).execute(true);
}

}


	// end - body

	public static int getX(Object nativeWidget) {
		HTMLElement htmlElement = (org.teavm.jso.dom.html.HTMLElement) nativeWidget;
		return getPropertyValueAsInt(htmlElement, "left");
	}
	
	public static int getY(Object nativeWidget) {
		HTMLElement htmlElement = (org.teavm.jso.dom.html.HTMLElement) nativeWidget;
		return getPropertyValueAsInt(htmlElement, "top");
	}

	public static void updateBounds(Object uiView, int x, int y, int width, int height) {
		nativeMakeFrame(uiView, x, y, x + width, y + height);		
	}
	public static void nativeMakeFrame(Object nativeWidget, int l, int t, int r, int b) {
		HTMLElement htmlElement = (org.teavm.jso.dom.html.HTMLElement) nativeWidget;
		htmlElement.getStyle().setProperty("position", "absolute");
		htmlElement.getStyle().setProperty("width", r - l + "px");
		htmlElement.getStyle().setProperty("height", b - t + "px");
		htmlElement.getStyle().setProperty("left", l + "px");
		htmlElement.getStyle().setProperty("top", t +"px");
	}
	
	public static void updateBoundsX(Object nativeWidget, int currentX) {
		HTMLElement htmlElement = (org.teavm.jso.dom.html.HTMLElement) nativeWidget;
		htmlElement.getStyle().setProperty("left", currentX + "px");
	}


	public static int getPropertyValueAsInt(HTMLElement htmlElement, String property) {
		String propertyValue = htmlElement.getStyle().getPropertyValue(property);
		if (propertyValue == null || propertyValue.equals("") || propertyValue.equals("inherit")) {
			return 0;
		}
		propertyValue = propertyValue.replace("px", "");
		int intVal = Integer.parseInt(propertyValue);
		return intVal;
	}
	
	public static float getPropertyValueAsFloat(HTMLElement htmlElement, String property) {
		String propertyValue = htmlElement.getStyle().getPropertyValue(property);
		if (propertyValue == null || propertyValue.equals("") || propertyValue.equals("inherit")) {
			return 0;
		}
		propertyValue = propertyValue.replace("px", "");
		float intVal = Float.parseFloat(propertyValue);
		return intVal;
	}

	public static void nativeMakeFrame(Object nativeWidget, int l, int t, int r, int b, int i) {
		nativeMakeFrame(nativeWidget, l, t, r, b);
	}

	public static void nativeMakeFrameForHorizontalScrollView(Object nativeWidget, int l, int t, int r, int b,
			int i) {
		nativeMakeFrame(nativeWidget, l, t, r, b);
	}
	public static void requestLayout(com.ashera.widget.IWidget widget, Object asNativeWidget) {
		View view = (View) widget.asWidget();
		view.requestLayout();
	}
	



	public static boolean isRTLLayout(IWidget w) {
		return isRTLLayout();
	}

	public static void setVisibility(IWidget w, Object nativeWidget, Object objValue) {
		View view = (View) w.asWidget();
		view.setVisibility((int) objValue);		
	}
	public static void setBackground(IWidget w, Object nativeWidget, Object objValue) {
    	setBackground(w, w.asNativeWidget(), objValue, false);
    }
	
	public static void setBackground(IWidget w, Object nativeWidget, Object objValue, boolean stateChange) {
		if (objValue instanceof r.android.graphics.drawable.Drawable) {
			View view = (View) w.asWidget();
			r.android.graphics.drawable.Drawable drawable = (r.android.graphics.drawable.Drawable)objValue;
			view.setBackground(drawable);

			Object colorOrImage = drawable.getDrawable();
			setBgOnControl(nativeWidget, colorOrImage);
			
			if (stateChange) {
				w.applyAttributeCommand("background", CommonConverters.command_imagestate, new String[] {}, true, colorOrImage);	
			}
		} else {
			setBgOnControl(nativeWidget, objValue);
		}

		BackgroundResizeListener listener = (BackgroundResizeListener) w.getFromTempCache("ResizeObserver");
		if (listener == null || !w.isInitialised()) {
			listener = new BackgroundResizeListener(nativeWidget, w);
			addResizeObserver((HTMLElement) nativeWidget, listener);
			w.storeInTempCache("ResizeObserver", listener);
		} else {
			listener.init();
			listener.handleEvent(null);
		}
	}

	private static final class BackgroundResizeListener implements org.teavm.jso.dom.events.EventListener<org.teavm.jso.dom.events.Event> {
		private final Object nativeWidget;
		private final IWidget w;
		private int viewWidth = -1;
		private int viewHeight = -1;
		public void init() {
			viewWidth = -1;
			viewHeight = -1;
		}
		private BackgroundResizeListener(Object nativeWidget, IWidget w) {
			this.nativeWidget = nativeWidget;
			this.w = w;
		}
		
		@Override
		public void handleEvent(org.teavm.jso.dom.events.Event evt) {
			HTMLElement element = (HTMLElement) nativeWidget;
			if (viewWidth == -1 || viewWidth != element.getClientWidth() || viewHeight != element.getClientHeight()) {
				AttributeCommandChain attributeCommandChain = w.getAttributeCommandChain("background");
				
				if (attributeCommandChain != null) {
					Object value = attributeCommandChain.getValue(w, w.asNativeWidget(), "predraw");
					if (!(value instanceof r.android.graphics.drawable.Drawable)) {
						setBgOnControl(nativeWidget, value);
					}
				}
				viewWidth = element.getClientWidth();
				viewHeight = element.getClientHeight();
			}
		}
	}
	
	
	@org.teavm.jso.JSBody(params = {"element", "listener"}, script = "new ResizeObserver(listener).observe(element)")
    public static native void addResizeObserver(HTMLElement element, org.teavm.jso.dom.events.EventListener<?> listener);
	
	private static void setBackgroundRepeat(IWidget w, Object nativeWidget, String strValue) {
		w.applyAttributeCommand("background", "imageRepeat", new String[] {"backgroundRepeat"}, true, strValue);
	}
	
	private static void setBgOnControl(Object nativeWidget, Object colorOrImage) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		if ((colorOrImage instanceof String && ((String) colorOrImage).startsWith("#")) || (colorOrImage instanceof Integer)) {
			if (colorOrImage instanceof Integer) {
				colorOrImage = ViewImpl.getColor(colorOrImage);
			}
			htmlElement.getStyle().setProperty("background-color", (String) colorOrImage);
		} else {
			htmlElement.getStyle().removeProperty("background-color");
		}
		
		if (colorOrImage instanceof String && ((String) colorOrImage).startsWith("data")) {
			htmlElement.getStyle().setProperty("background-image", "url('" + colorOrImage + "')");
		} else if (colorOrImage instanceof String && ((String) colorOrImage).startsWith("res")) {
			htmlElement.getStyle().setProperty("background-image", "url(" + colorOrImage + ")");
			
		} else {
			htmlElement.getStyle().removeProperty("background-image");
		}
	}
	
	@org.teavm.jso.JSBody(params = {}, script = "return window.isRTLLayout();")
    private static native boolean window_isRTLLayout();
	private static boolean isRTLLayout() {
		return window_isRTLLayout();
	}

	private static boolean isMirrorSupported() {
		return false;
	}
	
	
	private static void setClickable(IWidget w, Object nativeWidget, Object objValue) {
		View view = (View)w.asWidget();
		view.setClickable((boolean)objValue);
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		htmlElement.getStyle().setProperty("pointer-events", (boolean)objValue ? "all" : "none");
		if (view.isClickable()) {
        	addPressListener(w, nativeWidget, view);
		}
	}

	private static void addPressListener(IWidget w, Object nativeWidget, View view) {
		setOnListener(w, nativeWidget, (event) -> view.setPressed(true), "mousedownpress", "mousedown");
		setOnListener(w, nativeWidget, (event) -> view.setPressed(false), "mouseuppress", "mouseup");
	}
	private static void setForegroundTint(IWidget w, r.android.content.res.ColorStateList foregroundTintList) {
	}

	private static void setBackgroundTint(IWidget w, r.android.content.res.ColorStateList backgroundTintList) {
		
	}

	private static void setForeground(IWidget w, Object asNativeWidget, r.android.graphics.drawable.Drawable foreground) {
	}
	

	private static boolean isColor(Object objValue) {
		return objValue instanceof String;
	}
	
	
	private static void setOnClick(IWidget w, Object nativeWidget, Object objValue) {
		View.OnClickListener onClickListener;
		
		if (objValue instanceof String) {
			onClickListener = new OnClickListener(w, (String) objValue);
		} else {
			onClickListener = (View.OnClickListener) objValue;
		}
		setOnClick(w, nativeWidget, onClickListener);		
	}

	public static void setOnClick(IWidget w, Object nativeWidget, View.OnClickListener onClickListener) {
		View view = (View) w.asWidget();
		org.teavm.jso.dom.events.EventListener<?> listener = (event) -> onClickListener.onClick(view);
		setOnListener(w, nativeWidget, listener, "click", "click");
	}
	

	private static void setOnHover(IWidget w, Object nativeWidget, Object objValue) {
		View.OnHoverListener onHoverListener;
		if (objValue instanceof String) {
			onHoverListener = new OnHoverListener(w, (String) objValue);
		} else {
			onHoverListener = (View.OnHoverListener) objValue;
		}
		View view = (View) w.asWidget();
		org.teavm.jso.dom.events.EventListener<?> enterlistener = (event) -> {view.setHovered(true);onHoverListener.onHover(view, new MotionEvent());};
		setOnListener(w, nativeWidget, enterlistener, "mouseover", "mouseover");
		
		org.teavm.jso.dom.events.EventListener<?> flistener = (event) -> view.setHovered(false);
		setOnListener(w, nativeWidget, flistener, "mouseleave", "mouseleave");
	}
	
	private static void setOnListener(IWidget w, Object nativeWidget, String id, Object listener, AddRemoveCallBack callBack) {
		Object data = w.getFromTempCache(id);
		if (data != null) {
			callBack.removeListener(listener);
	    }
		
		callBack.addListener(listener);
		w.storeInTempCache(id, listener);
	}
	public static void setOnListener(IWidget w, Object nativeWidget, org.teavm.jso.dom.events.EventListener<?> listener, String id,
			String type) {
		HTMLElement htmlElement = (HTMLElement)nativeWidget;
		Object data = w.getFromTempCache(id);
		if (data != null) {
			htmlElement.removeEventListener(type, (org.teavm.jso.dom.events.EventListener) data);
		}
		
    	w.storeInTempCache(id, listener);
		htmlElement.addEventListener(type, listener);
	}
	
	public static void removeListener(IWidget w, Object nativeWidget, String id, String type) {
		HTMLElement htmlElement = (HTMLElement)nativeWidget;
		Object data = w.getFromTempCache(id);
		if (data != null) {
			htmlElement.removeEventListener(type, (org.teavm.jso.dom.events.EventListener) data);
		}
		w.storeInTempCache(id, null);
	}
	
	private static void setOnKey(IWidget w, Object nativeWidget, Object objValue) {
		View.OnKeyListener onKeyListener;
		
		if (objValue instanceof String) {
			onKeyListener = new OnKeyListener(w, (String) objValue);
		} else {
			onKeyListener = (View.OnKeyListener) objValue;
		}
		View view = (View) w.asWidget();
		view.setOnKeyListener(onKeyListener);
		org.teavm.jso.dom.events.EventListener<org.teavm.jso.dom.events.KeyboardEvent> listener = (event) -> {
			if (w.getFromTempCache("onKeypreventDefault" + event.getKeyCode()) != null) {
				event.preventDefault();
			}
			view.invokeKeyListenerUp(event.getKeyCode());
		};
		setOnListener(w, nativeWidget, listener, "keyup", "keyup");
		
		org.teavm.jso.dom.events.EventListener<org.teavm.jso.dom.events.KeyboardEvent> downlistener = (event) -> {
			if (w.getFromTempCache("onKeypreventDefault" + event.getKeyCode()) != null) {
				event.preventDefault();
			}
			view.invokeKeyListenerDown(event.getKeyCode());
		};
		setOnListener(w, nativeWidget, downlistener, "keydown", "keydown");
	}

	public interface HtmlDragEvent extends org.teavm.jso.dom.events.Event {
	    @org.teavm.jso.JSProperty
	    int getClientX();
	    
	    @org.teavm.jso.JSProperty
	    int getClientY();
	    
	    @org.teavm.jso.JSProperty
	    DataTransfer getDataTransfer();
	}
	
	public interface DataTransfer extends  org.teavm.jso.JSObject {
		@org.teavm.jso.JSBody(params = { "key" }, script = "return this.getData(key);")
		String getData(String key);
		
		@org.teavm.jso.JSBody(params = { "key", "data" }, script = "this.setData(key, data);")
		void setData(String key, String  data);
	}
	
	
	private static void setAsDragSource(IWidget w, Object nativeWidget, Object objValue) {
		((HTMLElement) nativeWidget).setAttribute("draggable", "true");
		View view = (View) w.asWidget();
		org.teavm.jso.dom.events.EventListener<HtmlDragEvent> dragStartListener = (event) -> {
			
			java.util.List<DropWidget> listeners = w.getFragment().getListener(DropWidget.class);
			if (listeners != null) {
				for (DropWidget dropWidget : listeners) {
					dropWidget.dragStart(event);
				}
			}
			Map<String, Object> eventData = new java.util.HashMap<>();
			w.updateModelToEventMap(eventData, "", (String) objValue);
			event.getDataTransfer().setData("text", PluginInvoker.marshal(eventData));
		};
		
		setOnListener(w, nativeWidget, dragStartListener, "dragstart", "dragstart");

	
			org.teavm.jso.dom.events.EventListener<HtmlDragEvent> dragEndListener = (event) -> {
			
			java.util.List<DropWidget> listeners = w.getFragment().getListener(DropWidget.class);
			if (listeners != null) {
				for (DropWidget dropWidget : listeners) {
					dropWidget.dragEnd(event);
				}
			}
		};
		
		setOnListener(w, nativeWidget, dragEndListener, "dragend", "dragend");
	}
	
	static class DropWidget {
		private final View.OnDragListener onDragListener;
		private final View view;

		private DropWidget(View.OnDragListener onDragListener, View view) {
			this.onDragListener = onDragListener;
			this.view = view;
		}
		
		public void dragStart(HtmlDragEvent event) {
			view.setDragCanAccept(true);
			sendEvent(onDragListener, view, event, r.android.view.View.DragEvent.ACTION_DRAG_STARTED);
		}
		
		public void dragEnd(HtmlDragEvent event) {
			view.setDragCanAccept(false);
			sendEvent(onDragListener, view, event, r.android.view.View.DragEvent.ACTION_DRAG_ENDED);
		}
	}
	private static void setOnDrag(IWidget w, Object nativeWidget, Object objValue) {
		View.OnDragListener onDragListener;
		
		if (objValue instanceof String) {
			onDragListener = new OnDragListener(w, (String) objValue);
		} else {
			onDragListener = (View.OnDragListener) objValue;
		}
		View view = (View) w.asWidget();
		
		org.teavm.jso.dom.events.EventListener<HtmlDragEvent> dragEnterListener = (event) -> {
			view.setDragHovered(true);
			sendEvent(onDragListener, view, event, r.android.view.View.DragEvent.ACTION_DRAG_ENTERED);
		};
		
		setOnListener(w, nativeWidget, dragEnterListener, "dragenter", "dragenter");
		
		org.teavm.jso.dom.events.EventListener<HtmlDragEvent> dragLeaveListener = (event) -> {
			view.setDragHovered(false);
			sendEvent(onDragListener, view, event, r.android.view.View.DragEvent.ACTION_DRAG_EXITED);
		};
		
		setOnListener(w, nativeWidget, dragLeaveListener, "dragleave", "dragleave");
		
		org.teavm.jso.dom.events.EventListener<HtmlDragEvent> dragOverListener = (event) -> {
			sendEvent(onDragListener, view, event, r.android.view.View.DragEvent.ACTION_DRAG_LOCATION);
		};
		
		setOnListener(w, nativeWidget, dragOverListener, "dragover", "dragover");
		
		org.teavm.jso.dom.events.EventListener<HtmlDragEvent> dropListener = (event) -> {
			sendEvent(onDragListener, view, event, r.android.view.View.DragEvent.ACTION_DROP);
		};
		setOnListener(w, nativeWidget, dropListener, "drop", "drop");
		
		DropWidget listener = new DropWidget(onDragListener, view);
		
		setOnListener(w, nativeWidget, "dropwidget", listener, new AddRemoveCallBack() {
			@Override
			public void addListener(Object listener) {
				w.getFragment().addListener(w, listener);
			}

			@Override
			public void removeListener(Object listener) {
				w.getFragment().removeListener(w, listener);
			}
		});

	}
	
	private static void sendEvent(View.OnDragListener onDragListener, View view, HtmlDragEvent
			event, int action) {
		r.android.view.View.DragEvent dragEvent = new r.android.view.View.DragEvent();
		dragEvent.setAction(action);
		dragEvent.setX(event.getClientX());
		dragEvent.setY(event.getClientY());
		dragEvent.setClipData((String) event.getDataTransfer().getData("text"));
		onDragListener.onDrag(view, dragEvent);
		System.out.println("action " + action);
	}
	public static void invalidate(IWidget w, Object nativeWidget) {
		// nothing to do here
	}
	

	
	private static void setOnLongClick(IWidget w, Object nativeWidget, Object objValue) {
        View.OnLongClickListener onLongClickListener;
        
        if (objValue instanceof String) {
        	onLongClickListener = new OnLongClickListener(w, (String) objValue);
        } else {
        	onLongClickListener = (View.OnLongClickListener) objValue;
        }
        addLongClickListener(w, nativeWidget, onLongClickListener);
    }

	public static void addLongClickListener(IWidget w, Object nativeWidget, View.OnLongClickListener onLongClickListener) {
		View view = (View) w.asWidget();
        if (!view.isLongClickable()) {
        	view.setLongClickable(true);
        }
        LongClickHandler listener = new LongClickHandler(onLongClickListener, view);
        setOnListener(w, nativeWidget, listener, "mousedownLC", "mousedown");
        setOnListener(w, nativeWidget, listener, "mouseupLC", "mouseup");
	}
    private static final class LongClickHandler implements org.teavm.jso.dom.events.EventListener<org.teavm.jso.dom.events.Event> {
        private long startTime;
        private  View.OnLongClickListener onLongClickListener;
        private View view;
        public LongClickHandler(View.OnLongClickListener onLongClickListener, View view) {
            this.onLongClickListener = onLongClickListener;
            this.view = view;
        }
        @Override
        public void handleEvent(org.teavm.jso.dom.events.Event event) {
			if (this.view.isLongClickable()) {
	            if (event.getType().equals("mousedown")) {
	                startTime = System.currentTimeMillis();
	            } else if (event.getType().equals("mouseup")) {
	                if (System.currentTimeMillis() - startTime > 500) {
	                    onLongClickListener.onLongClick(view);
	                }
	            }
			}
        }
    }

    public interface Touch extends org.teavm.jso.JSObject {
    	@org.teavm.jso.JSProperty
 	    int getClientX();
 	    
 	    @org.teavm.jso.JSProperty
 	    int getClientY();
    }
    public interface TouchEvent extends org.teavm.jso.dom.events.Event {
    	 @org.teavm.jso.JSProperty
    	Touch[] getTouches();
    }
	
	private static void setOnTouch(IWidget w, Object nativeWidget, Object objValue) {
		View.OnTouchListener onTouchListener; 
		
		if (objValue instanceof String) {
			onTouchListener = new OnTouchListener(w, (String) objValue);
		} else {
			onTouchListener = (View.OnTouchListener) objValue;
		}
		
		View view = (View) w.asWidget();
		org.teavm.jso.dom.events.EventListener<TouchEvent> touchstartEventListener = (event) -> {
			r.android.view.MotionEvent motionEvent = createMotionEvent(event, MotionEvent.ACTION_DOWN);
			onTouchListener.onTouch(view, motionEvent);
		};
		
		setOnListener(w, nativeWidget, touchstartEventListener, "touchstart", "touchstart");

		org.teavm.jso.dom.events.EventListener<TouchEvent> touchendEventListener = (event) -> {
			r.android.view.MotionEvent motionEvent = createMotionEvent(event, MotionEvent.ACTION_UP);
			onTouchListener.onTouch(view, motionEvent);
		};
		
		setOnListener(w, nativeWidget, touchendEventListener, "touchend", "touchend");

		
		org.teavm.jso.dom.events.EventListener<TouchEvent> touchcancelEventListener = (event) -> {
			r.android.view.MotionEvent motionEvent = createMotionEvent(event, MotionEvent.ACTION_CANCEL);
			onTouchListener.onTouch(view, motionEvent);
		};
		
		setOnListener(w, nativeWidget, touchcancelEventListener, "touchcancel", "touchcancel");

		org.teavm.jso.dom.events.EventListener<TouchEvent> touchmoveEventListener = (event) -> {
			r.android.view.MotionEvent motionEvent = createMotionEvent(event, MotionEvent.ACTION_MOVE);
			onTouchListener.onTouch(view, motionEvent);
		};
		
		setOnListener(w, nativeWidget, touchmoveEventListener, "touchmove", "touchmove");

	}

	private static r.android.view.MotionEvent createMotionEvent(TouchEvent event, int action) {
		// TODO - set x, y
		r.android.view.MotionEvent motionEvent = new MotionEvent();
		motionEvent.setRawX(event.getTouches()[0].getClientX());
		motionEvent.setRawY(event.getTouches()[0].getClientY());

		motionEvent.setAction(action);
		return motionEvent;
	}

	public static void registerCommandConveter(IWidget widget) {
		widget.registerForAttributeCommandChain("background");
		widget.applyAttributeCommand("background", "imageRepeat", new String[] {"backgroundRepeat"}, true, "no-repeat");
	}
	
	private static Object getAlpha(Object nativeWidget) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		return Float.valueOf(htmlElement.getStyle().getPropertyValue("opacity"));
	}
	
	
	private static void setAlpha(Object nativeWidget, Object objValue) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		htmlElement.getStyle().setProperty("opacity", objValue + "");		
	}
	

	private static void nativeBringToFront(List<IWidget> widgets) {
		for (IWidget w : widgets) {
			HTMLElement htmlElement = (HTMLElement) w.asNativeWidget();
			if (w.getZIndex() != 0) {
				htmlElement.getStyle().setProperty("z-index", w.getZIndex() + "");
			}
		}
		
	}
	
	
	private static void setTooltipText(IWidget w, Object nativeWidget, Object objValue) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		htmlElement.setAttribute("title", (String) objValue);
	}

	public static void addEventInfo(Map<String, Object> obj, MenuItem item) {
		obj.put("itemId", IdGenerator.getName(item.getItemId()));
	}
	
	
	private static void setWebOverflow(IWidget w, Object nativeWidget, Object objValue) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		htmlElement.getStyle().setProperty("overflow", (String) objValue);
	}

	private static void setTabIndex(IWidget w, Object nativeWidget, Object objValue) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		htmlElement.setAttribute("tabindex", (String) objValue);
	}
	
	private static void setScaleY(IWidget w, Object nativeWidget, Object objValue) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		htmlElement.setAttribute("scaleY", objValue + "");
		updateTranform(htmlElement);
	}

	private static void updateTranform(HTMLElement htmlElement) {
		String transform = "";

		String translateX = htmlElement.getAttribute("translateX");
		if (translateX != null) {
			transform += " translateX(" + translateX  +"px) ";
		}
		
		String translateY = htmlElement.getAttribute("translateY");
		if (translateY != null) {
			transform += " translateY(" + translateY  +"px) ";
		}
		
		String translateZ = htmlElement.getAttribute("translateZ");
		if (translateZ != null) {
			transform += " translateZ(" + translateZ  +"px) ";
		}
		
		String rotate = htmlElement.getAttribute("rotate");
		if (rotate != null) {
			transform += " rotate(" + rotate  +"deg) ";
		}
		
		String scaleY = htmlElement.getAttribute("scaleY");
		if (scaleY != null) {
			transform += " scaleY(" + scaleY  +") ";
		}
		String scaleX = htmlElement.getAttribute("scaleX");
		if (scaleX != null) {
			transform += " scaleX(" + scaleX  +") ";
		}
		
		String rotateX = htmlElement.getAttribute("rotateX");
		if (rotateX != null) {
			transform += " rotateX(" + rotateX  +"deg) ";
		}
		
		String rotateY = htmlElement.getAttribute("rotateY");
		if (rotateY != null) {
			transform += " rotateY(" + rotateY  +"deg) ";
		}
		
		htmlElement.getStyle().setProperty("transform", transform);
	}

	private static void setScaleX(IWidget w, Object nativeWidget, Object objValue) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		htmlElement.setAttribute("scaleX", objValue + "");
		updateTranform(htmlElement);
	}

	private static void setRotationY(IWidget w, Object nativeWidget, Object objValue) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		htmlElement.setAttribute("rotateY", objValue + "");
		updateTranform(htmlElement);
	}

	private static void setRotationX(IWidget w, Object nativeWidget, Object objValue) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		htmlElement.setAttribute("rotateX", objValue + "");
		updateTranform(htmlElement);
	}

	private static void setRotation(IWidget w, Object nativeWidget, Object objValue) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		htmlElement.setAttribute("rotate", objValue + "");
		updateTranform(htmlElement);
	}

	private static void setTranslationZ(IWidget w, Object nativeWidget, Object objValue) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		htmlElement.setAttribute("translateZ", objValue + "");
		updateTranform(htmlElement);
	}

	private static void setTranslationY(IWidget w, Object nativeWidget, Object objValue) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		htmlElement.setAttribute("translateY", objValue + "");
		updateTranform(htmlElement);
	}

	private static void setTranslationX(IWidget w, Object nativeWidget, Object objValue) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		htmlElement.setAttribute("translateX", objValue + "");
		updateTranform(htmlElement);
	}

	private static Object getScaleY(IWidget w, Object nativeWidget) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		String value = htmlElement.getAttribute("scaleY");
		if (value != null) {
			return Float.parseFloat(value);
		}
		return value;
	}

	private static Object getScaleX(IWidget w, Object nativeWidget) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		String value = htmlElement.getAttribute("scaleX");
		if (value != null) {
			return Float.parseFloat(value);
		}
		return value;
	}

	private static Object getRotationY(IWidget w, Object nativeWidget) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		String value = htmlElement.getAttribute("rotateY");
		if (value != null) {
			return Float.parseFloat(value);
		}
		return value;
	}

	private static Object getRotationX(IWidget w, Object nativeWidget) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		String value = htmlElement.getAttribute("rotateX");
		if (value != null) {
			return Float.parseFloat(value);
		}
		return value;
	}

	private static Object getRotation(IWidget w, Object nativeWidget) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		String value = htmlElement.getAttribute("rotate");
		if (value != null) {
			return Float.parseFloat(value);
		}
		return value;
	}

	private static Object getTranslationZ(IWidget w, Object nativeWidget) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		String value = htmlElement.getAttribute("translateZ");
		if (value != null) {
			return Float.parseFloat(value);
		}
		return value;
	}

	private static Object getTranslationY(IWidget w, Object nativeWidget) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		String value = htmlElement.getAttribute("translateY");
		if (value != null) {
			return Float.parseFloat(value);
		}
		return value;
	}

	private static Object getTranslationX(IWidget w, Object nativeWidget) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		String value = htmlElement.getAttribute("translateX");
		if (value != null) {
			return Float.parseFloat(value);
		}
		return value;
	}

	public static void setClipsToBounds(Object nativeWidget, Object objValue) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		htmlElement.getStyle().setProperty("overflow", (boolean) objValue ? "hidden" : "visible");		
	}

	public static Object getClipsToBounds(Object nativeWidget) {
		HTMLElement htmlElement = (HTMLElement) nativeWidget;
		return "hidden".equals(htmlElement.getStyle().getPropertyValue("overflow"));
	}

	private static void rerenderClipToPaddingMask(IWidget w) {
		Object view = w.asWidget();
		Object nativeWidget = w.asNativeWidget();
		if (view instanceof r.android.view.ViewGroup) {
			boolean clipToPadding = ((r.android.view.ViewGroup)view).getClipToPadding();
			if (clipToPadding) {
				r.android.view.ViewGroup viewgroup = (r.android.view.ViewGroup)view;
				r.android.graphics.Rect rect = viewgroup.getPaddingMaskBounds();
				createMask(nativeWidget, viewgroup.getPaddingLeft(), viewgroup.getPaddingTop(), 
						viewgroup.getPaddingRight(), viewgroup.getPaddingBottom());
			} else {
				removeMask(nativeWidget);
			}
		}
	}

	public static void removeMask(Object nativeWidget) {
    	((HTMLElement) nativeWidget).getStyle().removeProperty("clip-path");
	}

	public static void createMask(Object nativeWidget, int left, int top, int right, int bottom) {
		((HTMLElement) nativeWidget).getStyle().setProperty("clip-path", String.format("inset(%dpx %dpx %dpx %dpx)", top, right, bottom, left));
	}
	
	
	private static void setNativeId(IWidget w, String strValue) {
		((HTMLElement) w.asNativeWidget()).setAttribute("id", strValue.replace("@+id/", ""));
	}
	private static void setOutsideTouchable(IWidget w, String strValue, Object objValue, View view) {
		ViewImpl.setOnClick(w, w.asNativeWidget(), new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if ((boolean) objValue) {
					 w.getFragment().getEventBus().notifyObservers(com.ashera.widget.bus.Event.StandardEvents.outsideClicked.toString(), null);
				}
			}
		});
	}
	
	
	private static void addSwipeListener(IWidget w, SwipeHelper swipeHelper) {
        setOnListener(w, w.asNativeWidget(), (event) -> swipeHelper.onActionDown(((org.teavm.jso.dom.events.MouseEvent) event).getClientX(), ((org.teavm.jso.dom.events.MouseEvent) event).getClientY()), "mousedownSwipe", "mousedown");
        setOnListener(w, w.asNativeWidget(), (event) -> swipeHelper.onActionUp(((org.teavm.jso.dom.events.MouseEvent) event).getClientX(), ((org.teavm.jso.dom.events.MouseEvent) event).getClientY()), "mouseupSwipe", "mouseup");
	}

	public static void addPanListener(IWidget widget, Object uiView, PanCallBack callback) {
		PanListener listener = new PanListener(widget, callback);
		
		((HTMLElement) uiView).addEventListener("dragend", listener, false);
		((HTMLElement) uiView).addEventListener("mousedown", listener, false);
		
		((HTMLElement) uiView).addEventListener("mousemove", listener, false);
		
	}
	
	
	public interface HtmlMouseEvent extends org.teavm.jso.dom.events.Event {
	    @org.teavm.jso.JSProperty
	    int getClientX();
	    
	    @org.teavm.jso.JSProperty
	    int getClientY();
	}

	private static class PanListener implements org.teavm.jso.dom.events.EventListener<HtmlMouseEvent> {
		private IWidget widget;
		private PanCallBack callback;
		public PanListener(IWidget widget, PanCallBack callback) {
			this.callback = callback;
			this.widget = widget;
		}

		@Override
		public void handleEvent(HtmlMouseEvent event) {

			int eventX = event.getClientX();
			int eventY = event.getClientY();
			switch (event.getType()) {
			case "mousedown":
				org.teavm.jso.browser.Window.current().addEventListener("mouseup", this, false);
				callback.handlePanStart(widget, event.getTarget(),  eventX, eventY);
				break;
			case "mousemove":
				callback.handlePanDrag(widget, event.getTarget(),  eventX, eventY);
				break;
			case "dragend":
			case "mouseup":				
				org.teavm.jso.browser.Window.current().removeEventListener("mouseup", this, false);
				callback.handlePanEnd(widget, event.getTarget(),  eventX, eventY);
				break;

			default:
				break;
			}

		}
	}


	public static void translateWithAnimation(Object pane, int x, int y, int animationDurationInMs, AnimationCallBack callBack) {
		new AnimationUtils(pane, x, y, animationDurationInMs, callBack).start();
	}

	private static class AnimationUtils {
		private int y;
		private int x;
		private int xAtStartOfAnim;
		private Object animatingWidget;
		private double start = -1;
		private double speed;
		private int animationDurationInMs;
		private int direction = -1;
		private AnimationCallBack callBack;
		public AnimationUtils(Object animatingWidget, int x, int y, int animationDurationInMs, AnimationCallBack callBack) {
			this.animatingWidget = animatingWidget;
			int currentX = ViewImpl.getX(animatingWidget);
			xAtStartOfAnim = currentX;
			this.speed = Math.abs(Math.abs(currentX) - Math.abs(x)) / (animationDurationInMs * 1f);
			this.y = y;
			this.x = x;
			this.animationDurationInMs = animationDurationInMs;
			start = -1;
			this.callBack = callBack;
			direction = x > xAtStartOfAnim ? 1 : -1;
		}
		
		public void start() {
			org.teavm.jso.browser.Window.requestAnimationFrame(this::onAnimationFrame);
		}
		
		private void onAnimationFrame(double timestamp) {
			if (start == -1) {
				start = timestamp;
			}
			double progress = timestamp - start;
			
			HTMLElement drawer = (HTMLElement) animatingWidget;
			int newX = (int)Math.floor(xAtStartOfAnim + (progress * speed * direction));
			
			 if (progress <= animationDurationInMs) {
				 org.teavm.jso.browser.Window.requestAnimationFrame(this::onAnimationFrame);
			 } else {
				 newX = x;
			 }
			 drawer.getStyle().setProperty("left", newX + "px");
			 drawer.getStyle().setProperty("top", y + "px");
			 callBack.animating(newX, y);
		}

	}

	
	private static void setWebGlobalAttributes(IWidget w, Object nativeWidget, Object objValue) {
		Map<String, Object> params = com.ashera.model.ModelExpressionParser.parseSimpleCssExpression((String) objValue);
		for (String key : params.keySet()) {
			((HTMLElement) nativeWidget).setAttribute(key, (String) params.get(key));
		}
	}
}
