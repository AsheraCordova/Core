// start - imports

export const enum Vtype {
email = "email",
time = "time",
date = "date",
url = "url",
tel = "tel",
}
export const enum ValidationErrorDisplay {
popup = "popup",
label = "label",
style = "style",
}
export const enum TintMode {
add = "add",
multiply = "multiply",
screen = "screen",
src_atop = "src_atop",
src_in = "src_in",
src_over = "src_over",
}
export const enum Visibility {
gone = "gone",
invisible = "invisible",
visible = "visible",
}
export const enum BackgroundRepeat {
no_repeat = "no-repeat",
repeat = "repeat",
}
export const enum LayoutDirection {
inherit = "inherit",
locale = "locale",
ltr = "ltr",
rtl = "rtl",
}
export const enum TextDirection {
anyRtl = "anyRtl",
firstStrong = "firstStrong",
firstStrongLtr = "firstStrongLtr",
firstStrongRtl = "firstStrongRtl",
inherit = "inherit",
locale = "locale",
ltr = "ltr",
rtl = "rtl",
}
export const enum TextAlignment {
center = "center",
gravity = "gravity",
inherit = "inherit",
textEnd = "textEnd",
textStart = "textStart",
viewEnd = "viewEnd",
viewStart = "viewStart",
}	
import CommandAttr from '../../widget/CommandAttr';
import IWidget from '../../widget/IWidget';
import ILayoutParam from '../../widget/ILayoutParam';
import {plainToClass, Type, Exclude, Expose, Transform} from "class-transformer";
import 'babel-polyfill';
import {Gravity} from '../../widget/TypeConstants';
import {ITranform, TransformerFactory} from '../../widget/TransformerFactory';
import {Event} from '../../app/Event';
import {MotionEvent} from '../../app/MotionEvent';
import {DragEvent} from '../../app/DragEvent';
import {KeyEvent} from '../../app/KeyEvent';
import { ScopedObject } from '../../app/ScopedObject';
import { Mixin, decorate } from 'ts-mixer';


























export class ValidationErrorDisplayTransformer implements ITranform {
    transform(value: any, obj: any, type: number) : any{
        if (type == 1) {
            return value.toString().replace(",", "|");
        } else {
            let strArray:Array<string> = value.toString().split("|");
            
            let valueArr:Array<ValidationErrorDisplay> = new Array<ValidationErrorDisplay>();
            for (let i =0; i < strArray.length; i++) {
                switch(strArray[i]) {
					case "popup":
						valueArr.push(ValidationErrorDisplay.popup);
                       	break;	
					case "label":
						valueArr.push(ValidationErrorDisplay.label);
                       	break;	
					case "style":
						valueArr.push(ValidationErrorDisplay.style);
                       	break;	
                }
                
            }
            return valueArr;
        }
    }
}




































































import {ViewGroup_LayoutParams} from './ViewGroupImpl';
// end - imports
export abstract class ViewImpl<T> {
	//start - body
	static initialize() {
		TransformerFactory.getInstance().register("validationErrorDisplay", new ValidationErrorDisplayTransformer());
    }	
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtBackground" }))
	swtBackground!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtBackgroundImage" }))
	swtBackgroundImage!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtCapture" }))
	swtCapture!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtDragDetect" }))
	swtDragDetect!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtEnabled" }))
	swtEnabled!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtForeground" }))
	swtForeground!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtOrientation" }))
	swtOrientation!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtRedraw" }))
	swtRedraw!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtTextDirection" }))
	swtTextDirection!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtToolTipText" }))
	swtToolTipText!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtTouchEnabled" }))
	swtTouchEnabled!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtVisible" }))
	swtVisible!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "selected" }))
	selected!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "style" }))
	style!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "errorStyle" }))
	errorStyle!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "validateForm" }))
	validateForm_!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "validation" }))
	validation!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "v_required" }))
	v_required!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "v_minlength" }))
	v_minlength!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "v_maxlength" }))
	v_maxlength!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "v_min" }))
	v_min!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "v_max" }))
	v_max!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "v_pattern" }))
	v_pattern!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "v_type" }))
	v_type!:CommandAttr<Vtype>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "validationErrorDisplayType" }))
	validationErrorDisplayType!:CommandAttr<ValidationErrorDisplay[]>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "customErrorMessageValues" }))
	customErrorMessageValues!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "customErrorMessageKeys" }))
	customErrorMessageKeys!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "invalidateOnFrameChange" }))
	invalidateOnFrameChange!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "animatorXml" }))
	animatorXml_!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "startAnimator" }))
	startAnimator_!:CommandAttr<void>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "endAnimator" }))
	endAnimator_!:CommandAttr<void>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onAnimationStart" }))
	onAnimationStart!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onAnimationEnd" }))
	onAnimationEnd!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onAnimationCancel" }))
	onAnimationCancel!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onAnimationRepeat" }))
	onAnimationRepeat!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "modelSyncEvents" }))
	modelSyncEvents!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "outsideTouchable" }))
	outsideTouchable!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "modelParam" }))
	modelParam!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "modelPojoToUi" }))
	modelPojoToUi!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "modelUiToPojo" }))
	modelUiToPojo!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "modelPojoToUiParams" }))
	modelPojoToUiParams!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "refreshUiFromModel" }))
	refreshUiFromModel_!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "modelUiToPojoEventIds" }))
	modelUiToPojoEventIds!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "elevation" }))
	elevation!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "backgroundTint" }))
	backgroundTint!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "backgroundTintMode" }))
	backgroundTintMode!:CommandAttr<TintMode>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "updateModelData" }))
	updateModelData_!:CommandAttr<ScopedObject|ScopedObject[]>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "notifyDataSetChanged" }))
	notifyDataSetChanged_!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "visibility" }))
	visibility!:CommandAttr<Visibility>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "background" }))
	background!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "backgroundRepeat" }))
	backgroundRepeat!:CommandAttr<BackgroundRepeat>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "minWidth" }))
	minWidth!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "minHeight" }))
	minHeight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "attributeUnderTest" }))
	attributeUnderTest!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onClick" }))
	onClick!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onFocusChange" }))
	onFocusChange!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onLongClick" }))
	onLongClick!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onKey" }))
	onKey!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onContextClick" }))
	onContextClick!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onHover" }))
	onHover!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onDrag" }))
	onDrag!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onTouch" }))
	onTouch!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "clickable" }))
	clickable!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "duplicateParentState" }))
	duplicateParentState!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "longClickable" }))
	longClickable!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "invalidate" }))
	invalidate_!:CommandAttr<void>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "requestLayout" }))
	requestLayout_!:CommandAttr<void>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "layoutDirection" }))
	layoutDirection!:CommandAttr<LayoutDirection>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textDirection" }))
	textDirection!:CommandAttr<TextDirection>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textAlignment" }))
	textAlignment!:CommandAttr<TextAlignment>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "asDragSource" }))
	asDragSource!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "enabled" }))
	enabled!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "nextFocusDown" }))
	nextFocusDown!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "nextFocusUp" }))
	nextFocusUp!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "zIndex" }))
	zIndex!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtAttachEventBubbler" }))
	swtAttachEventBubbler_!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "maxWidth" }))
	maxWidth!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "maxHeight" }))
	maxHeight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtResizeOptions" }))
	swtResizeOptions!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onSwiped" }))
	onSwiped!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "translationX" }))
	translationX!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "translationY" }))
	translationY!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "left" }))
	left!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "right" }))
	right!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "top" }))
	top!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "bottom" }))
	bottom!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtGCImage" }))
	swtGCImage!:CommandAttr<string>| undefined;

	@decorate(Exclude())
	protected thisPointer: T;	
	protected abstract getThisPointer(): T;
	@decorate(Exclude())
	protected orderGet: number = 0;
	@decorate(Exclude())
    protected orderSet: number = 0;
    protected flush = false;
	public markForReset() {
		this.flush = true;
	}
	public resetIfRequired() {
		if (this.flush) {
			this.reset()
		}
	}
	reset() : T {	
		this.swtBackground = undefined;
		this.swtBackgroundImage = undefined;
		this.swtCapture = undefined;
		this.swtDragDetect = undefined;
		this.swtEnabled = undefined;
		this.swtForeground = undefined;
		this.swtOrientation = undefined;
		this.swtRedraw = undefined;
		this.swtTextDirection = undefined;
		this.swtToolTipText = undefined;
		this.swtTouchEnabled = undefined;
		this.swtVisible = undefined;
		this.selected = undefined;
		this.style = undefined;
		this.errorStyle = undefined;
		this.validateForm_ = undefined;
		this.validation = undefined;
		this.v_required = undefined;
		this.v_minlength = undefined;
		this.v_maxlength = undefined;
		this.v_min = undefined;
		this.v_max = undefined;
		this.v_pattern = undefined;
		this.v_type = undefined;
		this.validationErrorDisplayType = undefined;
		this.customErrorMessageValues = undefined;
		this.customErrorMessageKeys = undefined;
		this.invalidateOnFrameChange = undefined;
		this.animatorXml_ = undefined;
		this.startAnimator_ = undefined;
		this.endAnimator_ = undefined;
		this.onAnimationStart = undefined;
		this.onAnimationEnd = undefined;
		this.onAnimationCancel = undefined;
		this.onAnimationRepeat = undefined;
		this.modelSyncEvents = undefined;
		this.outsideTouchable = undefined;
		this.modelParam = undefined;
		this.modelPojoToUi = undefined;
		this.modelUiToPojo = undefined;
		this.modelPojoToUiParams = undefined;
		this.refreshUiFromModel_ = undefined;
		this.modelUiToPojoEventIds = undefined;
		this.elevation = undefined;
		this.backgroundTint = undefined;
		this.backgroundTintMode = undefined;
		this.updateModelData_ = undefined;
		this.notifyDataSetChanged_ = undefined;
		this.visibility = undefined;
		this.background = undefined;
		this.backgroundRepeat = undefined;
		this.minWidth = undefined;
		this.minHeight = undefined;
		this.attributeUnderTest = undefined;
		this.onClick = undefined;
		this.onFocusChange = undefined;
		this.onLongClick = undefined;
		this.onKey = undefined;
		this.onContextClick = undefined;
		this.onHover = undefined;
		this.onDrag = undefined;
		this.onTouch = undefined;
		this.clickable = undefined;
		this.duplicateParentState = undefined;
		this.longClickable = undefined;
		this.invalidate_ = undefined;
		this.requestLayout_ = undefined;
		this.layoutDirection = undefined;
		this.textDirection = undefined;
		this.textAlignment = undefined;
		this.asDragSource = undefined;
		this.enabled = undefined;
		this.nextFocusDown = undefined;
		this.nextFocusUp = undefined;
		this.zIndex = undefined;
		this.swtAttachEventBubbler_ = undefined;
		this.maxWidth = undefined;
		this.maxHeight = undefined;
		this.swtResizeOptions = undefined;
		this.onSwiped = undefined;
		this.translationX = undefined;
		this.translationY = undefined;
		this.left = undefined;
		this.right = undefined;
		this.top = undefined;
		this.bottom = undefined;
		this.swtGCImage = undefined;
		this.orderGet = 0;
		this.orderSet = 0;
		this.flush = false;
		return this.thisPointer;
	}
	id: string;
	paths: string[];
	event: string;
	@decorate(Expose({ name: "layoutParams" }))
	layoutParams: any;
	constructor(id: string, paths: string[], event: string) {		
		this.id = id;
		this.paths = paths;
		this.event = event;
		this.thisPointer = this.getThisPointer();
		this.layoutParams = undefined;
	}
	
	setLayoutParams<M extends ILayoutParam>(layoutParams: M) {
		this.resetIfRequired();
		this.layoutParams = layoutParams;
	}
	
	getLayoutParams<M extends ILayoutParam>() : M{
		return this.layoutParams;
	}
	

	public tryGetSwtBackground() : T {
		this.resetIfRequired();
		if (this.swtBackground == null || this.swtBackground == undefined) {
			this.swtBackground = new CommandAttr<string>()
		}
		
		this.swtBackground.setGetter(true);
		this.orderGet++;
		this.swtBackground.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtBackground() : string {
		if (this.swtBackground == null || this.swtBackground == undefined) {
			this.swtBackground = new CommandAttr<string>();
		}
		return this.swtBackground.getCommandReturnValue();
	}
	public setSwtBackground(value : string) : T {
		this.resetIfRequired();
		if (this.swtBackground == null || this.swtBackground == undefined) {
			this.swtBackground = new CommandAttr<string>();
		}
		
		this.swtBackground.setSetter(true);
		this.swtBackground.setValue(value);
		this.orderSet++;
		this.swtBackground.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtBackgroundImage() : T {
		this.resetIfRequired();
		if (this.swtBackgroundImage == null || this.swtBackgroundImage == undefined) {
			this.swtBackgroundImage = new CommandAttr<string>()
		}
		
		this.swtBackgroundImage.setGetter(true);
		this.orderGet++;
		this.swtBackgroundImage.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtBackgroundImage() : string {
		if (this.swtBackgroundImage == null || this.swtBackgroundImage == undefined) {
			this.swtBackgroundImage = new CommandAttr<string>();
		}
		return this.swtBackgroundImage.getCommandReturnValue();
	}
	public setSwtBackgroundImage(value : string) : T {
		this.resetIfRequired();
		if (this.swtBackgroundImage == null || this.swtBackgroundImage == undefined) {
			this.swtBackgroundImage = new CommandAttr<string>();
		}
		
		this.swtBackgroundImage.setSetter(true);
		this.swtBackgroundImage.setValue(value);
		this.orderSet++;
		this.swtBackgroundImage.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setSwtCapture(value : boolean) : T {
		this.resetIfRequired();
		if (this.swtCapture == null || this.swtCapture == undefined) {
			this.swtCapture = new CommandAttr<boolean>();
		}
		
		this.swtCapture.setSetter(true);
		this.swtCapture.setValue(value);
		this.orderSet++;
		this.swtCapture.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtDragDetect() : T {
		this.resetIfRequired();
		if (this.swtDragDetect == null || this.swtDragDetect == undefined) {
			this.swtDragDetect = new CommandAttr<boolean>()
		}
		
		this.swtDragDetect.setGetter(true);
		this.orderGet++;
		this.swtDragDetect.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isSwtDragDetect() : boolean {
		if (this.swtDragDetect == null || this.swtDragDetect == undefined) {
			this.swtDragDetect = new CommandAttr<boolean>();
		}
		return this.swtDragDetect.getCommandReturnValue();
	}
	public setSwtDragDetect(value : boolean) : T {
		this.resetIfRequired();
		if (this.swtDragDetect == null || this.swtDragDetect == undefined) {
			this.swtDragDetect = new CommandAttr<boolean>();
		}
		
		this.swtDragDetect.setSetter(true);
		this.swtDragDetect.setValue(value);
		this.orderSet++;
		this.swtDragDetect.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtEnabled() : T {
		this.resetIfRequired();
		if (this.swtEnabled == null || this.swtEnabled == undefined) {
			this.swtEnabled = new CommandAttr<boolean>()
		}
		
		this.swtEnabled.setGetter(true);
		this.orderGet++;
		this.swtEnabled.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isSwtEnabled() : boolean {
		if (this.swtEnabled == null || this.swtEnabled == undefined) {
			this.swtEnabled = new CommandAttr<boolean>();
		}
		return this.swtEnabled.getCommandReturnValue();
	}
	public setSwtEnabled(value : boolean) : T {
		this.resetIfRequired();
		if (this.swtEnabled == null || this.swtEnabled == undefined) {
			this.swtEnabled = new CommandAttr<boolean>();
		}
		
		this.swtEnabled.setSetter(true);
		this.swtEnabled.setValue(value);
		this.orderSet++;
		this.swtEnabled.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtForeground() : T {
		this.resetIfRequired();
		if (this.swtForeground == null || this.swtForeground == undefined) {
			this.swtForeground = new CommandAttr<string>()
		}
		
		this.swtForeground.setGetter(true);
		this.orderGet++;
		this.swtForeground.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtForeground() : string {
		if (this.swtForeground == null || this.swtForeground == undefined) {
			this.swtForeground = new CommandAttr<string>();
		}
		return this.swtForeground.getCommandReturnValue();
	}
	public setSwtForeground(value : string) : T {
		this.resetIfRequired();
		if (this.swtForeground == null || this.swtForeground == undefined) {
			this.swtForeground = new CommandAttr<string>();
		}
		
		this.swtForeground.setSetter(true);
		this.swtForeground.setValue(value);
		this.orderSet++;
		this.swtForeground.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtOrientation() : T {
		this.resetIfRequired();
		if (this.swtOrientation == null || this.swtOrientation == undefined) {
			this.swtOrientation = new CommandAttr<string>()
		}
		
		this.swtOrientation.setGetter(true);
		this.orderGet++;
		this.swtOrientation.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtOrientation() : string {
		if (this.swtOrientation == null || this.swtOrientation == undefined) {
			this.swtOrientation = new CommandAttr<string>();
		}
		return this.swtOrientation.getCommandReturnValue();
	}
	public setSwtOrientation(value : string) : T {
		this.resetIfRequired();
		if (this.swtOrientation == null || this.swtOrientation == undefined) {
			this.swtOrientation = new CommandAttr<string>();
		}
		
		this.swtOrientation.setSetter(true);
		this.swtOrientation.setValue(value);
		this.orderSet++;
		this.swtOrientation.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setSwtRedraw(value : boolean) : T {
		this.resetIfRequired();
		if (this.swtRedraw == null || this.swtRedraw == undefined) {
			this.swtRedraw = new CommandAttr<boolean>();
		}
		
		this.swtRedraw.setSetter(true);
		this.swtRedraw.setValue(value);
		this.orderSet++;
		this.swtRedraw.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtTextDirection() : T {
		this.resetIfRequired();
		if (this.swtTextDirection == null || this.swtTextDirection == undefined) {
			this.swtTextDirection = new CommandAttr<string>()
		}
		
		this.swtTextDirection.setGetter(true);
		this.orderGet++;
		this.swtTextDirection.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtTextDirection() : string {
		if (this.swtTextDirection == null || this.swtTextDirection == undefined) {
			this.swtTextDirection = new CommandAttr<string>();
		}
		return this.swtTextDirection.getCommandReturnValue();
	}
	public setSwtTextDirection(value : string) : T {
		this.resetIfRequired();
		if (this.swtTextDirection == null || this.swtTextDirection == undefined) {
			this.swtTextDirection = new CommandAttr<string>();
		}
		
		this.swtTextDirection.setSetter(true);
		this.swtTextDirection.setValue(value);
		this.orderSet++;
		this.swtTextDirection.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtToolTipText() : T {
		this.resetIfRequired();
		if (this.swtToolTipText == null || this.swtToolTipText == undefined) {
			this.swtToolTipText = new CommandAttr<string>()
		}
		
		this.swtToolTipText.setGetter(true);
		this.orderGet++;
		this.swtToolTipText.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtToolTipText() : string {
		if (this.swtToolTipText == null || this.swtToolTipText == undefined) {
			this.swtToolTipText = new CommandAttr<string>();
		}
		return this.swtToolTipText.getCommandReturnValue();
	}
	public setSwtToolTipText(value : string) : T {
		this.resetIfRequired();
		if (this.swtToolTipText == null || this.swtToolTipText == undefined) {
			this.swtToolTipText = new CommandAttr<string>();
		}
		
		this.swtToolTipText.setSetter(true);
		this.swtToolTipText.setValue(value);
		this.orderSet++;
		this.swtToolTipText.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetTooltipText() : T {
		this.resetIfRequired();
		if (this.swtToolTipText == null || this.swtToolTipText == undefined) {
			this.swtToolTipText = new CommandAttr<string>()
		}
		
		this.swtToolTipText.setGetter(true);
		this.orderGet++;
		this.swtToolTipText.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getTooltipText() : string {
		if (this.swtToolTipText == null || this.swtToolTipText == undefined) {
			this.swtToolTipText = new CommandAttr<string>();
		}
		return this.swtToolTipText.getCommandReturnValue();
	}
	public setTooltipText(value : string) : T {
		this.resetIfRequired();
		if (this.swtToolTipText == null || this.swtToolTipText == undefined) {
			this.swtToolTipText = new CommandAttr<string>();
		}
		
		this.swtToolTipText.setSetter(true);
		this.swtToolTipText.setValue(value);
		this.orderSet++;
		this.swtToolTipText.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtTouchEnabled() : T {
		this.resetIfRequired();
		if (this.swtTouchEnabled == null || this.swtTouchEnabled == undefined) {
			this.swtTouchEnabled = new CommandAttr<boolean>()
		}
		
		this.swtTouchEnabled.setGetter(true);
		this.orderGet++;
		this.swtTouchEnabled.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isSwtTouchEnabled() : boolean {
		if (this.swtTouchEnabled == null || this.swtTouchEnabled == undefined) {
			this.swtTouchEnabled = new CommandAttr<boolean>();
		}
		return this.swtTouchEnabled.getCommandReturnValue();
	}
	public setSwtTouchEnabled(value : boolean) : T {
		this.resetIfRequired();
		if (this.swtTouchEnabled == null || this.swtTouchEnabled == undefined) {
			this.swtTouchEnabled = new CommandAttr<boolean>();
		}
		
		this.swtTouchEnabled.setSetter(true);
		this.swtTouchEnabled.setValue(value);
		this.orderSet++;
		this.swtTouchEnabled.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtVisible() : T {
		this.resetIfRequired();
		if (this.swtVisible == null || this.swtVisible == undefined) {
			this.swtVisible = new CommandAttr<boolean>()
		}
		
		this.swtVisible.setGetter(true);
		this.orderGet++;
		this.swtVisible.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isSwtVisible() : boolean {
		if (this.swtVisible == null || this.swtVisible == undefined) {
			this.swtVisible = new CommandAttr<boolean>();
		}
		return this.swtVisible.getCommandReturnValue();
	}
	public setSwtVisible(value : boolean) : T {
		this.resetIfRequired();
		if (this.swtVisible == null || this.swtVisible == undefined) {
			this.swtVisible = new CommandAttr<boolean>();
		}
		
		this.swtVisible.setSetter(true);
		this.swtVisible.setValue(value);
		this.orderSet++;
		this.swtVisible.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSelected() : T {
		this.resetIfRequired();
		if (this.selected == null || this.selected == undefined) {
			this.selected = new CommandAttr<boolean>()
		}
		
		this.selected.setGetter(true);
		this.orderGet++;
		this.selected.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isSelected() : boolean {
		if (this.selected == null || this.selected == undefined) {
			this.selected = new CommandAttr<boolean>();
		}
		return this.selected.getCommandReturnValue();
	}
	public setSelected(value : boolean) : T {
		this.resetIfRequired();
		if (this.selected == null || this.selected == undefined) {
			this.selected = new CommandAttr<boolean>();
		}
		
		this.selected.setSetter(true);
		this.selected.setValue(value);
		this.orderSet++;
		this.selected.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setStyle(value : string) : T {
		this.resetIfRequired();
		if (this.style == null || this.style == undefined) {
			this.style = new CommandAttr<string>();
		}
		
		this.style.setSetter(true);
		this.style.setValue(value);
		this.orderSet++;
		this.style.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setErrorStyle(value : string) : T {
		this.resetIfRequired();
		if (this.errorStyle == null || this.errorStyle == undefined) {
			this.errorStyle = new CommandAttr<string>();
		}
		
		this.errorStyle.setSetter(true);
		this.errorStyle.setValue(value);
		this.orderSet++;
		this.errorStyle.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetValidateForm() : T {
		this.resetIfRequired();
		if (this.validateForm_ == null || this.validateForm_ == undefined) {
			this.validateForm_ = new CommandAttr<string>()
		}
		
		this.validateForm_.setGetter(true);
		this.orderGet++;
		this.validateForm_.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getValidateForm() : string {
		if (this.validateForm_ == null || this.validateForm_ == undefined) {
			this.validateForm_ = new CommandAttr<string>();
		}
		return this.validateForm_.getCommandReturnValue();
	}
	public validateForm(value : string) : T {
		this.resetIfRequired();
		if (this.validateForm_ == null || this.validateForm_ == undefined) {
			this.validateForm_ = new CommandAttr<string>();
		}
		
		this.validateForm_.setSetter(true);
		this.validateForm_.setValue(value);
		this.orderSet++;
		this.validateForm_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setValidation(value : string) : T {
		this.resetIfRequired();
		if (this.validation == null || this.validation == undefined) {
			this.validation = new CommandAttr<string>();
		}
		
		this.validation.setSetter(true);
		this.validation.setValue(value);
		this.orderSet++;
		this.validation.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setV_required(value : string) : T {
		this.resetIfRequired();
		if (this.v_required == null || this.v_required == undefined) {
			this.v_required = new CommandAttr<string>();
		}
		
		this.v_required.setSetter(true);
		this.v_required.setValue(value);
		this.orderSet++;
		this.v_required.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setV_minlength(value : string) : T {
		this.resetIfRequired();
		if (this.v_minlength == null || this.v_minlength == undefined) {
			this.v_minlength = new CommandAttr<string>();
		}
		
		this.v_minlength.setSetter(true);
		this.v_minlength.setValue(value);
		this.orderSet++;
		this.v_minlength.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setV_maxlength(value : string) : T {
		this.resetIfRequired();
		if (this.v_maxlength == null || this.v_maxlength == undefined) {
			this.v_maxlength = new CommandAttr<string>();
		}
		
		this.v_maxlength.setSetter(true);
		this.v_maxlength.setValue(value);
		this.orderSet++;
		this.v_maxlength.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setV_min(value : string) : T {
		this.resetIfRequired();
		if (this.v_min == null || this.v_min == undefined) {
			this.v_min = new CommandAttr<string>();
		}
		
		this.v_min.setSetter(true);
		this.v_min.setValue(value);
		this.orderSet++;
		this.v_min.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setV_max(value : string) : T {
		this.resetIfRequired();
		if (this.v_max == null || this.v_max == undefined) {
			this.v_max = new CommandAttr<string>();
		}
		
		this.v_max.setSetter(true);
		this.v_max.setValue(value);
		this.orderSet++;
		this.v_max.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setV_pattern(value : string) : T {
		this.resetIfRequired();
		if (this.v_pattern == null || this.v_pattern == undefined) {
			this.v_pattern = new CommandAttr<string>();
		}
		
		this.v_pattern.setSetter(true);
		this.v_pattern.setValue(value);
		this.orderSet++;
		this.v_pattern.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setV_type(value : Vtype) : T {
		this.resetIfRequired();
		if (this.v_type == null || this.v_type == undefined) {
			this.v_type = new CommandAttr<Vtype>();
		}
		
		this.v_type.setSetter(true);
		this.v_type.setValue(value);
		this.orderSet++;
		this.v_type.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setValidationErrorDisplayType(...value : ValidationErrorDisplay[]) : T {
		this.resetIfRequired();
		if (this.validationErrorDisplayType == null || this.validationErrorDisplayType == undefined) {
			this.validationErrorDisplayType = new CommandAttr<ValidationErrorDisplay[]>();
		}
		
		this.validationErrorDisplayType.setSetter(true);
		this.validationErrorDisplayType.setValue(value);
		this.orderSet++;
		this.validationErrorDisplayType.setOrderSet(this.orderSet);
this.validationErrorDisplayType.setTransformer('validationErrorDisplay');		return this.thisPointer;
	}
		

	public setCustomErrorMessageValues(value : string) : T {
		this.resetIfRequired();
		if (this.customErrorMessageValues == null || this.customErrorMessageValues == undefined) {
			this.customErrorMessageValues = new CommandAttr<string>();
		}
		
		this.customErrorMessageValues.setSetter(true);
		this.customErrorMessageValues.setValue(value);
		this.orderSet++;
		this.customErrorMessageValues.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setCustomErrorMessageKeys(value : string) : T {
		this.resetIfRequired();
		if (this.customErrorMessageKeys == null || this.customErrorMessageKeys == undefined) {
			this.customErrorMessageKeys = new CommandAttr<string>();
		}
		
		this.customErrorMessageKeys.setSetter(true);
		this.customErrorMessageKeys.setValue(value);
		this.orderSet++;
		this.customErrorMessageKeys.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setInvalidateOnFrameChange(value : boolean) : T {
		this.resetIfRequired();
		if (this.invalidateOnFrameChange == null || this.invalidateOnFrameChange == undefined) {
			this.invalidateOnFrameChange = new CommandAttr<boolean>();
		}
		
		this.invalidateOnFrameChange.setSetter(true);
		this.invalidateOnFrameChange.setValue(value);
		this.orderSet++;
		this.invalidateOnFrameChange.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public animatorXml(value : string) : T {
		this.resetIfRequired();
		if (this.animatorXml_ == null || this.animatorXml_ == undefined) {
			this.animatorXml_ = new CommandAttr<string>();
		}
		
		this.animatorXml_.setSetter(true);
		this.animatorXml_.setValue(value);
		this.orderSet++;
		this.animatorXml_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public startAnimator() : T {
		this.resetIfRequired();
		if (this.startAnimator_ == null || this.startAnimator_ == undefined) {
			this.startAnimator_ = new CommandAttr<void>();
		}
		
		this.startAnimator_.setSetter(true);
		
		this.orderSet++;
		this.startAnimator_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public endAnimator() : T {
		this.resetIfRequired();
		if (this.endAnimator_ == null || this.endAnimator_ == undefined) {
			this.endAnimator_ = new CommandAttr<void>();
		}
		
		this.endAnimator_.setSetter(true);
		
		this.orderSet++;
		this.endAnimator_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnAnimationStart(value : string) : T {
		this.resetIfRequired();
		if (this.onAnimationStart == null || this.onAnimationStart == undefined) {
			this.onAnimationStart = new CommandAttr<string>();
		}
		
		this.onAnimationStart.setSetter(true);
		this.onAnimationStart.setValue(value);
		this.orderSet++;
		this.onAnimationStart.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnAnimationEnd(value : string) : T {
		this.resetIfRequired();
		if (this.onAnimationEnd == null || this.onAnimationEnd == undefined) {
			this.onAnimationEnd = new CommandAttr<string>();
		}
		
		this.onAnimationEnd.setSetter(true);
		this.onAnimationEnd.setValue(value);
		this.orderSet++;
		this.onAnimationEnd.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnAnimationCancel(value : string) : T {
		this.resetIfRequired();
		if (this.onAnimationCancel == null || this.onAnimationCancel == undefined) {
			this.onAnimationCancel = new CommandAttr<string>();
		}
		
		this.onAnimationCancel.setSetter(true);
		this.onAnimationCancel.setValue(value);
		this.orderSet++;
		this.onAnimationCancel.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnAnimationRepeat(value : string) : T {
		this.resetIfRequired();
		if (this.onAnimationRepeat == null || this.onAnimationRepeat == undefined) {
			this.onAnimationRepeat = new CommandAttr<string>();
		}
		
		this.onAnimationRepeat.setSetter(true);
		this.onAnimationRepeat.setValue(value);
		this.orderSet++;
		this.onAnimationRepeat.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetModelSyncEvents() : T {
		this.resetIfRequired();
		if (this.modelSyncEvents == null || this.modelSyncEvents == undefined) {
			this.modelSyncEvents = new CommandAttr<string>()
		}
		
		this.modelSyncEvents.setGetter(true);
		this.orderGet++;
		this.modelSyncEvents.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getModelSyncEvents() : string {
		if (this.modelSyncEvents == null || this.modelSyncEvents == undefined) {
			this.modelSyncEvents = new CommandAttr<string>();
		}
		return this.modelSyncEvents.getCommandReturnValue();
	}
	public setModelSyncEvents(value : string) : T {
		this.resetIfRequired();
		if (this.modelSyncEvents == null || this.modelSyncEvents == undefined) {
			this.modelSyncEvents = new CommandAttr<string>();
		}
		
		this.modelSyncEvents.setSetter(true);
		this.modelSyncEvents.setValue(value);
		this.orderSet++;
		this.modelSyncEvents.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOutsideTouchable(value : boolean) : T {
		this.resetIfRequired();
		if (this.outsideTouchable == null || this.outsideTouchable == undefined) {
			this.outsideTouchable = new CommandAttr<boolean>();
		}
		
		this.outsideTouchable.setSetter(true);
		this.outsideTouchable.setValue(value);
		this.orderSet++;
		this.outsideTouchable.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetModelParam() : T {
		this.resetIfRequired();
		if (this.modelParam == null || this.modelParam == undefined) {
			this.modelParam = new CommandAttr<string>()
		}
		
		this.modelParam.setGetter(true);
		this.orderGet++;
		this.modelParam.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getModelParam() : string {
		if (this.modelParam == null || this.modelParam == undefined) {
			this.modelParam = new CommandAttr<string>();
		}
		return this.modelParam.getCommandReturnValue();
	}
	public setModelParam(value : string) : T {
		this.resetIfRequired();
		if (this.modelParam == null || this.modelParam == undefined) {
			this.modelParam = new CommandAttr<string>();
		}
		
		this.modelParam.setSetter(true);
		this.modelParam.setValue(value);
		this.orderSet++;
		this.modelParam.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetModelPojoToUi() : T {
		this.resetIfRequired();
		if (this.modelPojoToUi == null || this.modelPojoToUi == undefined) {
			this.modelPojoToUi = new CommandAttr<string>()
		}
		
		this.modelPojoToUi.setGetter(true);
		this.orderGet++;
		this.modelPojoToUi.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getModelPojoToUi() : string {
		if (this.modelPojoToUi == null || this.modelPojoToUi == undefined) {
			this.modelPojoToUi = new CommandAttr<string>();
		}
		return this.modelPojoToUi.getCommandReturnValue();
	}
	public setModelPojoToUi(value : string) : T {
		this.resetIfRequired();
		if (this.modelPojoToUi == null || this.modelPojoToUi == undefined) {
			this.modelPojoToUi = new CommandAttr<string>();
		}
		
		this.modelPojoToUi.setSetter(true);
		this.modelPojoToUi.setValue(value);
		this.orderSet++;
		this.modelPojoToUi.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetModelUiToPojo() : T {
		this.resetIfRequired();
		if (this.modelUiToPojo == null || this.modelUiToPojo == undefined) {
			this.modelUiToPojo = new CommandAttr<string>()
		}
		
		this.modelUiToPojo.setGetter(true);
		this.orderGet++;
		this.modelUiToPojo.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getModelUiToPojo() : string {
		if (this.modelUiToPojo == null || this.modelUiToPojo == undefined) {
			this.modelUiToPojo = new CommandAttr<string>();
		}
		return this.modelUiToPojo.getCommandReturnValue();
	}
	public setModelUiToPojo(value : string) : T {
		this.resetIfRequired();
		if (this.modelUiToPojo == null || this.modelUiToPojo == undefined) {
			this.modelUiToPojo = new CommandAttr<string>();
		}
		
		this.modelUiToPojo.setSetter(true);
		this.modelUiToPojo.setValue(value);
		this.orderSet++;
		this.modelUiToPojo.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setModelPojoToUiParams(value : string) : T {
		this.resetIfRequired();
		if (this.modelPojoToUiParams == null || this.modelPojoToUiParams == undefined) {
			this.modelPojoToUiParams = new CommandAttr<string>();
		}
		
		this.modelPojoToUiParams.setSetter(true);
		this.modelPojoToUiParams.setValue(value);
		this.orderSet++;
		this.modelPojoToUiParams.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public refreshUiFromModel(value : string) : T {
		this.resetIfRequired();
		if (this.refreshUiFromModel_ == null || this.refreshUiFromModel_ == undefined) {
			this.refreshUiFromModel_ = new CommandAttr<string>();
		}
		
		this.refreshUiFromModel_.setSetter(true);
		this.refreshUiFromModel_.setValue(value);
		this.orderSet++;
		this.refreshUiFromModel_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setModelUiToPojoEventIds(value : string) : T {
		this.resetIfRequired();
		if (this.modelUiToPojoEventIds == null || this.modelUiToPojoEventIds == undefined) {
			this.modelUiToPojoEventIds = new CommandAttr<string>();
		}
		
		this.modelUiToPojoEventIds.setSetter(true);
		this.modelUiToPojoEventIds.setValue(value);
		this.orderSet++;
		this.modelUiToPojoEventIds.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setElevation(value : string) : T {
		this.resetIfRequired();
		if (this.elevation == null || this.elevation == undefined) {
			this.elevation = new CommandAttr<string>();
		}
		
		this.elevation.setSetter(true);
		this.elevation.setValue(value);
		this.orderSet++;
		this.elevation.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetBackgroundTint() : T {
		this.resetIfRequired();
		if (this.backgroundTint == null || this.backgroundTint == undefined) {
			this.backgroundTint = new CommandAttr<string>()
		}
		
		this.backgroundTint.setGetter(true);
		this.orderGet++;
		this.backgroundTint.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getBackgroundTint() : string {
		if (this.backgroundTint == null || this.backgroundTint == undefined) {
			this.backgroundTint = new CommandAttr<string>();
		}
		return this.backgroundTint.getCommandReturnValue();
	}
	public setBackgroundTint(value : string) : T {
		this.resetIfRequired();
		if (this.backgroundTint == null || this.backgroundTint == undefined) {
			this.backgroundTint = new CommandAttr<string>();
		}
		
		this.backgroundTint.setSetter(true);
		this.backgroundTint.setValue(value);
		this.orderSet++;
		this.backgroundTint.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setBackgroundTintMode(value : TintMode) : T {
		this.resetIfRequired();
		if (this.backgroundTintMode == null || this.backgroundTintMode == undefined) {
			this.backgroundTintMode = new CommandAttr<TintMode>();
		}
		
		this.backgroundTintMode.setSetter(true);
		this.backgroundTintMode.setValue(value);
		this.orderSet++;
		this.backgroundTintMode.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public updateModelData(expression : string,
payload : any) : T {
		this.resetIfRequired();
		if (this.updateModelData_ == null || this.updateModelData_ == undefined) {
			this.updateModelData_ = new CommandAttr<ScopedObject>();
		}
		
		let wrapper:ScopedObject = new ScopedObject();
		wrapper.expression = expression;
		wrapper.payload = payload;
		this.updateModelData_.setSetter(true);
		this.updateModelData_.setValue(wrapper);	
		this.orderSet++;
		this.updateModelData_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		
	public updateModelDataWithScopedObject(...arr: ScopedObject[]) : T {
		this.resetIfRequired();
		if (this.updateModelData_ == null || this.updateModelData_ == undefined) {
			this.updateModelData_ = new CommandAttr<ScopedObject[]>();
		}
		
		this.updateModelData_.setSetter(true);
		this.updateModelData_.setValue(arr);	
		this.orderSet++;
		this.updateModelData_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}

	public notifyDataSetChanged(value : boolean) : T {
		this.resetIfRequired();
		if (this.notifyDataSetChanged_ == null || this.notifyDataSetChanged_ == undefined) {
			this.notifyDataSetChanged_ = new CommandAttr<boolean>();
		}
		
		this.notifyDataSetChanged_.setSetter(true);
		this.notifyDataSetChanged_.setValue(value);
		this.orderSet++;
		this.notifyDataSetChanged_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetVisibility() : T {
		this.resetIfRequired();
		if (this.visibility == null || this.visibility == undefined) {
			this.visibility = new CommandAttr<Visibility>()
		}
		
		this.visibility.setGetter(true);
		this.orderGet++;
		this.visibility.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getVisibility() : Visibility {
		if (this.visibility == null || this.visibility == undefined) {
			this.visibility = new CommandAttr<Visibility>();
		}
		return this.visibility.getCommandReturnValue();
	}
	public setVisibility(value : Visibility) : T {
		this.resetIfRequired();
		if (this.visibility == null || this.visibility == undefined) {
			this.visibility = new CommandAttr<Visibility>();
		}
		
		this.visibility.setSetter(true);
		this.visibility.setValue(value);
		this.orderSet++;
		this.visibility.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetBackground() : T {
		this.resetIfRequired();
		if (this.background == null || this.background == undefined) {
			this.background = new CommandAttr<string>()
		}
		
		this.background.setGetter(true);
		this.orderGet++;
		this.background.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getBackground() : string {
		if (this.background == null || this.background == undefined) {
			this.background = new CommandAttr<string>();
		}
		return this.background.getCommandReturnValue();
	}
	public setBackground(value : string) : T {
		this.resetIfRequired();
		if (this.background == null || this.background == undefined) {
			this.background = new CommandAttr<string>();
		}
		
		this.background.setSetter(true);
		this.background.setValue(value);
		this.orderSet++;
		this.background.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setBackgroundRepeat(value : BackgroundRepeat) : T {
		this.resetIfRequired();
		if (this.backgroundRepeat == null || this.backgroundRepeat == undefined) {
			this.backgroundRepeat = new CommandAttr<BackgroundRepeat>();
		}
		
		this.backgroundRepeat.setSetter(true);
		this.backgroundRepeat.setValue(value);
		this.orderSet++;
		this.backgroundRepeat.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetMinWidth() : T {
		this.resetIfRequired();
		if (this.minWidth == null || this.minWidth == undefined) {
			this.minWidth = new CommandAttr<string>()
		}
		
		this.minWidth.setGetter(true);
		this.orderGet++;
		this.minWidth.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getMinWidth() : string {
		if (this.minWidth == null || this.minWidth == undefined) {
			this.minWidth = new CommandAttr<string>();
		}
		return this.minWidth.getCommandReturnValue();
	}
	public setMinWidth(value : string) : T {
		this.resetIfRequired();
		if (this.minWidth == null || this.minWidth == undefined) {
			this.minWidth = new CommandAttr<string>();
		}
		
		this.minWidth.setSetter(true);
		this.minWidth.setValue(value);
		this.orderSet++;
		this.minWidth.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetMinHeight() : T {
		this.resetIfRequired();
		if (this.minHeight == null || this.minHeight == undefined) {
			this.minHeight = new CommandAttr<string>()
		}
		
		this.minHeight.setGetter(true);
		this.orderGet++;
		this.minHeight.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getMinHeight() : string {
		if (this.minHeight == null || this.minHeight == undefined) {
			this.minHeight = new CommandAttr<string>();
		}
		return this.minHeight.getCommandReturnValue();
	}
	public setMinHeight(value : string) : T {
		this.resetIfRequired();
		if (this.minHeight == null || this.minHeight == undefined) {
			this.minHeight = new CommandAttr<string>();
		}
		
		this.minHeight.setSetter(true);
		this.minHeight.setValue(value);
		this.orderSet++;
		this.minHeight.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setAttributeUnderTest(value : string) : T {
		this.resetIfRequired();
		if (this.attributeUnderTest == null || this.attributeUnderTest == undefined) {
			this.attributeUnderTest = new CommandAttr<string>();
		}
		
		this.attributeUnderTest.setSetter(true);
		this.attributeUnderTest.setValue(value);
		this.orderSet++;
		this.attributeUnderTest.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnClick(value : string) : T {
		this.resetIfRequired();
		if (this.onClick == null || this.onClick == undefined) {
			this.onClick = new CommandAttr<string>();
		}
		
		this.onClick.setSetter(true);
		this.onClick.setValue(value);
		this.orderSet++;
		this.onClick.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnFocusChange(value : string) : T {
		this.resetIfRequired();
		if (this.onFocusChange == null || this.onFocusChange == undefined) {
			this.onFocusChange = new CommandAttr<string>();
		}
		
		this.onFocusChange.setSetter(true);
		this.onFocusChange.setValue(value);
		this.orderSet++;
		this.onFocusChange.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnLongClick(value : string) : T {
		this.resetIfRequired();
		if (this.onLongClick == null || this.onLongClick == undefined) {
			this.onLongClick = new CommandAttr<string>();
		}
		
		this.onLongClick.setSetter(true);
		this.onLongClick.setValue(value);
		this.orderSet++;
		this.onLongClick.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnKey(value : string) : T {
		this.resetIfRequired();
		if (this.onKey == null || this.onKey == undefined) {
			this.onKey = new CommandAttr<string>();
		}
		
		this.onKey.setSetter(true);
		this.onKey.setValue(value);
		this.orderSet++;
		this.onKey.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnContextClick(value : string) : T {
		this.resetIfRequired();
		if (this.onContextClick == null || this.onContextClick == undefined) {
			this.onContextClick = new CommandAttr<string>();
		}
		
		this.onContextClick.setSetter(true);
		this.onContextClick.setValue(value);
		this.orderSet++;
		this.onContextClick.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnHover(value : string) : T {
		this.resetIfRequired();
		if (this.onHover == null || this.onHover == undefined) {
			this.onHover = new CommandAttr<string>();
		}
		
		this.onHover.setSetter(true);
		this.onHover.setValue(value);
		this.orderSet++;
		this.onHover.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnDrag(value : string) : T {
		this.resetIfRequired();
		if (this.onDrag == null || this.onDrag == undefined) {
			this.onDrag = new CommandAttr<string>();
		}
		
		this.onDrag.setSetter(true);
		this.onDrag.setValue(value);
		this.orderSet++;
		this.onDrag.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnTouch(value : string) : T {
		this.resetIfRequired();
		if (this.onTouch == null || this.onTouch == undefined) {
			this.onTouch = new CommandAttr<string>();
		}
		
		this.onTouch.setSetter(true);
		this.onTouch.setValue(value);
		this.orderSet++;
		this.onTouch.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetClickable() : T {
		this.resetIfRequired();
		if (this.clickable == null || this.clickable == undefined) {
			this.clickable = new CommandAttr<boolean>()
		}
		
		this.clickable.setGetter(true);
		this.orderGet++;
		this.clickable.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isClickable() : boolean {
		if (this.clickable == null || this.clickable == undefined) {
			this.clickable = new CommandAttr<boolean>();
		}
		return this.clickable.getCommandReturnValue();
	}
	public setClickable(value : boolean) : T {
		this.resetIfRequired();
		if (this.clickable == null || this.clickable == undefined) {
			this.clickable = new CommandAttr<boolean>();
		}
		
		this.clickable.setSetter(true);
		this.clickable.setValue(value);
		this.orderSet++;
		this.clickable.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetDuplicateParentState() : T {
		this.resetIfRequired();
		if (this.duplicateParentState == null || this.duplicateParentState == undefined) {
			this.duplicateParentState = new CommandAttr<boolean>()
		}
		
		this.duplicateParentState.setGetter(true);
		this.orderGet++;
		this.duplicateParentState.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isDuplicateParentState() : boolean {
		if (this.duplicateParentState == null || this.duplicateParentState == undefined) {
			this.duplicateParentState = new CommandAttr<boolean>();
		}
		return this.duplicateParentState.getCommandReturnValue();
	}
	public setDuplicateParentState(value : boolean) : T {
		this.resetIfRequired();
		if (this.duplicateParentState == null || this.duplicateParentState == undefined) {
			this.duplicateParentState = new CommandAttr<boolean>();
		}
		
		this.duplicateParentState.setSetter(true);
		this.duplicateParentState.setValue(value);
		this.orderSet++;
		this.duplicateParentState.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetLongClickable() : T {
		this.resetIfRequired();
		if (this.longClickable == null || this.longClickable == undefined) {
			this.longClickable = new CommandAttr<boolean>()
		}
		
		this.longClickable.setGetter(true);
		this.orderGet++;
		this.longClickable.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isLongClickable() : boolean {
		if (this.longClickable == null || this.longClickable == undefined) {
			this.longClickable = new CommandAttr<boolean>();
		}
		return this.longClickable.getCommandReturnValue();
	}
	public setLongClickable(value : boolean) : T {
		this.resetIfRequired();
		if (this.longClickable == null || this.longClickable == undefined) {
			this.longClickable = new CommandAttr<boolean>();
		}
		
		this.longClickable.setSetter(true);
		this.longClickable.setValue(value);
		this.orderSet++;
		this.longClickable.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public invalidate() : T {
		this.resetIfRequired();
		if (this.invalidate_ == null || this.invalidate_ == undefined) {
			this.invalidate_ = new CommandAttr<void>();
		}
		
		this.invalidate_.setSetter(true);
		
		this.orderSet++;
		this.invalidate_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public requestLayout() : T {
		this.resetIfRequired();
		if (this.requestLayout_ == null || this.requestLayout_ == undefined) {
			this.requestLayout_ = new CommandAttr<void>();
		}
		
		this.requestLayout_.setSetter(true);
		
		this.orderSet++;
		this.requestLayout_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetLayoutDirection() : T {
		this.resetIfRequired();
		if (this.layoutDirection == null || this.layoutDirection == undefined) {
			this.layoutDirection = new CommandAttr<LayoutDirection>()
		}
		
		this.layoutDirection.setGetter(true);
		this.orderGet++;
		this.layoutDirection.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getLayoutDirection() : LayoutDirection {
		if (this.layoutDirection == null || this.layoutDirection == undefined) {
			this.layoutDirection = new CommandAttr<LayoutDirection>();
		}
		return this.layoutDirection.getCommandReturnValue();
	}
	public setLayoutDirection(value : LayoutDirection) : T {
		this.resetIfRequired();
		if (this.layoutDirection == null || this.layoutDirection == undefined) {
			this.layoutDirection = new CommandAttr<LayoutDirection>();
		}
		
		this.layoutDirection.setSetter(true);
		this.layoutDirection.setValue(value);
		this.orderSet++;
		this.layoutDirection.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetTextDirection() : T {
		this.resetIfRequired();
		if (this.textDirection == null || this.textDirection == undefined) {
			this.textDirection = new CommandAttr<TextDirection>()
		}
		
		this.textDirection.setGetter(true);
		this.orderGet++;
		this.textDirection.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getTextDirection() : TextDirection {
		if (this.textDirection == null || this.textDirection == undefined) {
			this.textDirection = new CommandAttr<TextDirection>();
		}
		return this.textDirection.getCommandReturnValue();
	}
	public setTextDirection(value : TextDirection) : T {
		this.resetIfRequired();
		if (this.textDirection == null || this.textDirection == undefined) {
			this.textDirection = new CommandAttr<TextDirection>();
		}
		
		this.textDirection.setSetter(true);
		this.textDirection.setValue(value);
		this.orderSet++;
		this.textDirection.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetTextAlignment() : T {
		this.resetIfRequired();
		if (this.textAlignment == null || this.textAlignment == undefined) {
			this.textAlignment = new CommandAttr<TextAlignment>()
		}
		
		this.textAlignment.setGetter(true);
		this.orderGet++;
		this.textAlignment.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getTextAlignment() : TextAlignment {
		if (this.textAlignment == null || this.textAlignment == undefined) {
			this.textAlignment = new CommandAttr<TextAlignment>();
		}
		return this.textAlignment.getCommandReturnValue();
	}
	public setTextAlignment(value : TextAlignment) : T {
		this.resetIfRequired();
		if (this.textAlignment == null || this.textAlignment == undefined) {
			this.textAlignment = new CommandAttr<TextAlignment>();
		}
		
		this.textAlignment.setSetter(true);
		this.textAlignment.setValue(value);
		this.orderSet++;
		this.textAlignment.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setAsDragSource(value : string) : T {
		this.resetIfRequired();
		if (this.asDragSource == null || this.asDragSource == undefined) {
			this.asDragSource = new CommandAttr<string>();
		}
		
		this.asDragSource.setSetter(true);
		this.asDragSource.setValue(value);
		this.orderSet++;
		this.asDragSource.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetEnabled() : T {
		this.resetIfRequired();
		if (this.enabled == null || this.enabled == undefined) {
			this.enabled = new CommandAttr<boolean>()
		}
		
		this.enabled.setGetter(true);
		this.orderGet++;
		this.enabled.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isEnabled() : boolean {
		if (this.enabled == null || this.enabled == undefined) {
			this.enabled = new CommandAttr<boolean>();
		}
		return this.enabled.getCommandReturnValue();
	}
	public setEnabled(value : boolean) : T {
		this.resetIfRequired();
		if (this.enabled == null || this.enabled == undefined) {
			this.enabled = new CommandAttr<boolean>();
		}
		
		this.enabled.setSetter(true);
		this.enabled.setValue(value);
		this.orderSet++;
		this.enabled.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setNextFocusDown(value : string) : T {
		this.resetIfRequired();
		if (this.nextFocusDown == null || this.nextFocusDown == undefined) {
			this.nextFocusDown = new CommandAttr<string>();
		}
		
		this.nextFocusDown.setSetter(true);
		this.nextFocusDown.setValue(value);
		this.orderSet++;
		this.nextFocusDown.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setNextFocusUp(value : string) : T {
		this.resetIfRequired();
		if (this.nextFocusUp == null || this.nextFocusUp == undefined) {
			this.nextFocusUp = new CommandAttr<string>();
		}
		
		this.nextFocusUp.setSetter(true);
		this.nextFocusUp.setValue(value);
		this.orderSet++;
		this.nextFocusUp.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setZIndex(value : number) : T {
		this.resetIfRequired();
		if (this.zIndex == null || this.zIndex == undefined) {
			this.zIndex = new CommandAttr<number>();
		}
		
		this.zIndex.setSetter(true);
		this.zIndex.setValue(value);
		this.orderSet++;
		this.zIndex.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public swtAttachEventBubbler(value : string) : T {
		this.resetIfRequired();
		if (this.swtAttachEventBubbler_ == null || this.swtAttachEventBubbler_ == undefined) {
			this.swtAttachEventBubbler_ = new CommandAttr<string>();
		}
		
		this.swtAttachEventBubbler_.setSetter(true);
		this.swtAttachEventBubbler_.setValue(value);
		this.orderSet++;
		this.swtAttachEventBubbler_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetMaxWidth() : T {
		this.resetIfRequired();
		if (this.maxWidth == null || this.maxWidth == undefined) {
			this.maxWidth = new CommandAttr<string>()
		}
		
		this.maxWidth.setGetter(true);
		this.orderGet++;
		this.maxWidth.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getMaxWidth() : string {
		if (this.maxWidth == null || this.maxWidth == undefined) {
			this.maxWidth = new CommandAttr<string>();
		}
		return this.maxWidth.getCommandReturnValue();
	}
	public setMaxWidth(value : string) : T {
		this.resetIfRequired();
		if (this.maxWidth == null || this.maxWidth == undefined) {
			this.maxWidth = new CommandAttr<string>();
		}
		
		this.maxWidth.setSetter(true);
		this.maxWidth.setValue(value);
		this.orderSet++;
		this.maxWidth.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetMaxHeight() : T {
		this.resetIfRequired();
		if (this.maxHeight == null || this.maxHeight == undefined) {
			this.maxHeight = new CommandAttr<string>()
		}
		
		this.maxHeight.setGetter(true);
		this.orderGet++;
		this.maxHeight.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getMaxHeight() : string {
		if (this.maxHeight == null || this.maxHeight == undefined) {
			this.maxHeight = new CommandAttr<string>();
		}
		return this.maxHeight.getCommandReturnValue();
	}
	public setMaxHeight(value : string) : T {
		this.resetIfRequired();
		if (this.maxHeight == null || this.maxHeight == undefined) {
			this.maxHeight = new CommandAttr<string>();
		}
		
		this.maxHeight.setSetter(true);
		this.maxHeight.setValue(value);
		this.orderSet++;
		this.maxHeight.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setSwtResizeOptions(value : string) : T {
		this.resetIfRequired();
		if (this.swtResizeOptions == null || this.swtResizeOptions == undefined) {
			this.swtResizeOptions = new CommandAttr<string>();
		}
		
		this.swtResizeOptions.setSetter(true);
		this.swtResizeOptions.setValue(value);
		this.orderSet++;
		this.swtResizeOptions.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnSwiped(value : string) : T {
		this.resetIfRequired();
		if (this.onSwiped == null || this.onSwiped == undefined) {
			this.onSwiped = new CommandAttr<string>();
		}
		
		this.onSwiped.setSetter(true);
		this.onSwiped.setValue(value);
		this.orderSet++;
		this.onSwiped.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetTranslationX() : T {
		this.resetIfRequired();
		if (this.translationX == null || this.translationX == undefined) {
			this.translationX = new CommandAttr<string>()
		}
		
		this.translationX.setGetter(true);
		this.orderGet++;
		this.translationX.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getTranslationX() : string {
		if (this.translationX == null || this.translationX == undefined) {
			this.translationX = new CommandAttr<string>();
		}
		return this.translationX.getCommandReturnValue();
	}
	public setTranslationX(value : string) : T {
		this.resetIfRequired();
		if (this.translationX == null || this.translationX == undefined) {
			this.translationX = new CommandAttr<string>();
		}
		
		this.translationX.setSetter(true);
		this.translationX.setValue(value);
		this.orderSet++;
		this.translationX.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetTranslationY() : T {
		this.resetIfRequired();
		if (this.translationY == null || this.translationY == undefined) {
			this.translationY = new CommandAttr<string>()
		}
		
		this.translationY.setGetter(true);
		this.orderGet++;
		this.translationY.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getTranslationY() : string {
		if (this.translationY == null || this.translationY == undefined) {
			this.translationY = new CommandAttr<string>();
		}
		return this.translationY.getCommandReturnValue();
	}
	public setTranslationY(value : string) : T {
		this.resetIfRequired();
		if (this.translationY == null || this.translationY == undefined) {
			this.translationY = new CommandAttr<string>();
		}
		
		this.translationY.setSetter(true);
		this.translationY.setValue(value);
		this.orderSet++;
		this.translationY.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetLeft() : T {
		this.resetIfRequired();
		if (this.left == null || this.left == undefined) {
			this.left = new CommandAttr<string>()
		}
		
		this.left.setGetter(true);
		this.orderGet++;
		this.left.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getLeft() : string {
		if (this.left == null || this.left == undefined) {
			this.left = new CommandAttr<string>();
		}
		return this.left.getCommandReturnValue();
	}
	public setLeft(value : string) : T {
		this.resetIfRequired();
		if (this.left == null || this.left == undefined) {
			this.left = new CommandAttr<string>();
		}
		
		this.left.setSetter(true);
		this.left.setValue(value);
		this.orderSet++;
		this.left.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetRight() : T {
		this.resetIfRequired();
		if (this.right == null || this.right == undefined) {
			this.right = new CommandAttr<string>()
		}
		
		this.right.setGetter(true);
		this.orderGet++;
		this.right.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getRight() : string {
		if (this.right == null || this.right == undefined) {
			this.right = new CommandAttr<string>();
		}
		return this.right.getCommandReturnValue();
	}
	public setRight(value : string) : T {
		this.resetIfRequired();
		if (this.right == null || this.right == undefined) {
			this.right = new CommandAttr<string>();
		}
		
		this.right.setSetter(true);
		this.right.setValue(value);
		this.orderSet++;
		this.right.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetTop() : T {
		this.resetIfRequired();
		if (this.top == null || this.top == undefined) {
			this.top = new CommandAttr<string>()
		}
		
		this.top.setGetter(true);
		this.orderGet++;
		this.top.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getTop() : string {
		if (this.top == null || this.top == undefined) {
			this.top = new CommandAttr<string>();
		}
		return this.top.getCommandReturnValue();
	}
	public setTop(value : string) : T {
		this.resetIfRequired();
		if (this.top == null || this.top == undefined) {
			this.top = new CommandAttr<string>();
		}
		
		this.top.setSetter(true);
		this.top.setValue(value);
		this.orderSet++;
		this.top.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetBottom() : T {
		this.resetIfRequired();
		if (this.bottom == null || this.bottom == undefined) {
			this.bottom = new CommandAttr<string>()
		}
		
		this.bottom.setGetter(true);
		this.orderGet++;
		this.bottom.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getBottom() : string {
		if (this.bottom == null || this.bottom == undefined) {
			this.bottom = new CommandAttr<string>();
		}
		return this.bottom.getCommandReturnValue();
	}
	public setBottom(value : string) : T {
		this.resetIfRequired();
		if (this.bottom == null || this.bottom == undefined) {
			this.bottom = new CommandAttr<string>();
		}
		
		this.bottom.setSetter(true);
		this.bottom.setValue(value);
		this.orderSet++;
		this.bottom.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setSwtGCImage(value : string) : T {
		this.resetIfRequired();
		if (this.swtGCImage == null || this.swtGCImage == undefined) {
			this.swtGCImage = new CommandAttr<string>();
		}
		
		this.swtGCImage.setSetter(true);
		this.swtGCImage.setValue(value);
		this.orderSet++;
		this.swtGCImage.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		
	//end - body

}
//start - staticinit

export class View extends ViewImpl<View> implements IWidget{
    getThisPointer(): View {
        return this;
    }
    
   	public getClass() {
		return View;
	}
	
   	constructor(id: string, path: string[], event: string) {
		super(id, path, event);	
	}
}

ViewImpl.initialize();
export interface OnAnimationStartEvent extends Event{
        //animation:android.animation.Animator;


}
export interface OnAnimationEndEvent extends Event{
        //animation:android.animation.Animator;


}
export interface OnAnimationCancelEvent extends Event{
        //animation:android.animation.Animator;


}
export interface OnAnimationRepeatEvent extends Event{
        //animation:android.animation.Animator;


}
export interface OnAnimationStartEvent extends Event{
        //animation:android.animation.Animator;


}
export interface OnAnimationEndEvent extends Event{
        //animation:android.animation.Animator;


}
export interface OnAnimationCancelEvent extends Event{
        //animation:android.animation.Animator;


}
export interface OnAnimationRepeatEvent extends Event{
        //animation:android.animation.Animator;


}
export interface OnAnimationStartEvent extends Event{
        //animation:android.animation.Animator;


}
export interface OnAnimationEndEvent extends Event{
        //animation:android.animation.Animator;


}
export interface OnAnimationCancelEvent extends Event{
        //animation:android.animation.Animator;


}
export interface OnAnimationRepeatEvent extends Event{
        //animation:android.animation.Animator;


}
export interface OnAnimationStartEvent extends Event{
        //animation:android.animation.Animator;


}
export interface OnAnimationEndEvent extends Event{
        //animation:android.animation.Animator;


}
export interface OnAnimationCancelEvent extends Event{
        //animation:android.animation.Animator;


}
export interface OnAnimationRepeatEvent extends Event{
        //animation:android.animation.Animator;


}
export interface OnSwipedEvent extends Event{
        //direction:String;


}

//end - staticinit
