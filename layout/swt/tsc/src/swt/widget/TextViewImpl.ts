// start - imports

export const enum Font {
monospace = "monospace",
normal = "normal",
sans = "sans",
serif = "serif",
}
export const enum TextStyle {
bold = "bold",
italic = "italic",
normal = "normal",
}
export const enum TintMode {
add = "add",
multiply = "multiply",
screen = "screen",
src_atop = "src_atop",
src_in = "src_in",
src_over = "src_over",
}
export const enum AutoSizeTextType {
none = "none",
uniform = "uniform",
}
export const enum Ellipsize {
end = "end",
marquee = "marquee",
middle = "middle",
none = "none",
start = "start",
}
export const enum MarqueeRepeatLimit {
marquee_forever = "marquee_forever",
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






























export class TextStyleTransformer implements ITranform {
    transform(value: any, obj: any, type: number) : any{
        if (type == 1) {
            return value.toString().replace(",", "|");
        } else {
            let strArray:Array<string> = value.toString().split("|");
            
            let valueArr:Array<TextStyle> = new Array<TextStyle>();
            for (let i =0; i < strArray.length; i++) {
                switch(strArray[i]) {
					case "bold":
						valueArr.push(TextStyle.bold);
                       	break;	
					case "italic":
						valueArr.push(TextStyle.italic);
                       	break;	
					case "normal":
						valueArr.push(TextStyle.normal);
                       	break;	
                }
                
            }
            return valueArr;
        }
    }
}































// end - imports
import {ViewImpl} from './ViewImpl';
export abstract class TextViewImpl<T> extends ViewImpl<T>{
	//start - body
	static initialize() {
		TransformerFactory.getInstance().register("textStyle", new TextStyleTransformer());
    }	
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtImage" }))
	swtImage!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtText" }))
	swtText!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "text" }))
	text!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textColor" }))
	textColor!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "gravity" }))
	gravity!:CommandAttr<Gravity[]>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textSize" }))
	textSize!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "padding" }))
	padding!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingBottom" }))
	paddingBottom!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingRight" }))
	paddingRight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingLeft" }))
	paddingLeft!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingStart" }))
	paddingStart!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingEnd" }))
	paddingEnd!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingTop" }))
	paddingTop!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingHorizontal" }))
	paddingHorizontal!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingVertical" }))
	paddingVertical!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "minLines" }))
	minLines!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "lines" }))
	lines!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "maxLines" }))
	maxLines!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "minWidth" }))
	minWidth!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "minHeight" }))
	minHeight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "maxWidth" }))
	maxWidth!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "maxHeight" }))
	maxHeight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "height" }))
	height!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "width" }))
	width!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "maxEms" }))
	maxEms!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "minEms" }))
	minEms!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "ems" }))
	ems!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "typeface" }))
	typeface!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textStyle" }))
	textStyle!:CommandAttr<TextStyle[]>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "fontFamily" }))
	fontFamily!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "drawableStart" }))
	drawableStart!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "drawableEnd" }))
	drawableEnd!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "drawableTop" }))
	drawableTop!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "drawableBottom" }))
	drawableBottom!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "drawablePadding" }))
	drawablePadding!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "drawableTint" }))
	drawableTint!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "drawableTintMode" }))
	drawableTintMode!:CommandAttr<TintMode>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "autoSizeTextType" }))
	autoSizeTextType!:CommandAttr<AutoSizeTextType>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "autoSizeMaxTextSize" }))
	autoSizeMaxTextSize!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "autoSizeMinTextSize" }))
	autoSizeMinTextSize!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "autoSizeStepGranularity" }))
	autoSizeStepGranularity!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "maxLength" }))
	maxLength!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "enabled" }))
	enabled!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "editable" }))
	editable!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "singleLine" }))
	singleLine!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textAllCaps" }))
	textAllCaps!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "password" }))
	password!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "scrollHorizontally" }))
	scrollHorizontally!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "ellipsize" }))
	ellipsize!:CommandAttr<Ellipsize>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "startOrStopMarquee" }))
	startOrStopMarquee!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "marqueeRepeatLimit" }))
	marqueeRepeatLimit!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "firstBaselineToTopHeight" }))
	firstBaselineToTopHeight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "lastBaselineToBottomHeight" }))
	lastBaselineToBottomHeight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "autoSizePresetSizes" }))
	autoSizePresetSizes!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textFormat" }))
	textFormat!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textAppearance" }))
	textAppearance!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "drawableIconSize" }))
	drawableIconSize!:CommandAttr<string>| undefined;

	@decorate(Exclude())
	protected thisPointer: T;	
	protected abstract getThisPointer(): T;
	reset() : T {	
		super.reset();
		this.swtImage = undefined;
		this.swtText = undefined;
		this.text = undefined;
		this.textColor = undefined;
		this.gravity = undefined;
		this.textSize = undefined;
		this.padding = undefined;
		this.paddingBottom = undefined;
		this.paddingRight = undefined;
		this.paddingLeft = undefined;
		this.paddingStart = undefined;
		this.paddingEnd = undefined;
		this.paddingTop = undefined;
		this.paddingHorizontal = undefined;
		this.paddingVertical = undefined;
		this.minLines = undefined;
		this.lines = undefined;
		this.maxLines = undefined;
		this.minWidth = undefined;
		this.minHeight = undefined;
		this.maxWidth = undefined;
		this.maxHeight = undefined;
		this.height = undefined;
		this.width = undefined;
		this.maxEms = undefined;
		this.minEms = undefined;
		this.ems = undefined;
		this.typeface = undefined;
		this.textStyle = undefined;
		this.fontFamily = undefined;
		this.drawableStart = undefined;
		this.drawableEnd = undefined;
		this.drawableTop = undefined;
		this.drawableBottom = undefined;
		this.drawablePadding = undefined;
		this.drawableTint = undefined;
		this.drawableTintMode = undefined;
		this.autoSizeTextType = undefined;
		this.autoSizeMaxTextSize = undefined;
		this.autoSizeMinTextSize = undefined;
		this.autoSizeStepGranularity = undefined;
		this.maxLength = undefined;
		this.enabled = undefined;
		this.editable = undefined;
		this.singleLine = undefined;
		this.textAllCaps = undefined;
		this.password = undefined;
		this.scrollHorizontally = undefined;
		this.ellipsize = undefined;
		this.startOrStopMarquee = undefined;
		this.marqueeRepeatLimit = undefined;
		this.firstBaselineToTopHeight = undefined;
		this.lastBaselineToBottomHeight = undefined;
		this.autoSizePresetSizes = undefined;
		this.textFormat = undefined;
		this.textAppearance = undefined;
		this.drawableIconSize = undefined;
		return this.thisPointer;
	}
	constructor(id: string, path: string[], event:  string) {
		super(id, path, event);
		this.thisPointer = this.getThisPointer();
	}
	

	public tryGetSwtImage() : T {
		this.resetIfRequired();
		if (this.swtImage == null || this.swtImage == undefined) {
			this.swtImage = new CommandAttr<string>()
		}
		
		this.swtImage.setGetter(true);
		this.orderGet++;
		this.swtImage.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtImage() : string {
		if (this.swtImage == null || this.swtImage == undefined) {
			this.swtImage = new CommandAttr<string>();
		}
		return this.swtImage.getCommandReturnValue();
	}
	public setSwtImage(value : string) : T {
		this.resetIfRequired();
		if (this.swtImage == null || this.swtImage == undefined) {
			this.swtImage = new CommandAttr<string>();
		}
		
		this.swtImage.setSetter(true);
		this.swtImage.setValue(value);
		this.orderSet++;
		this.swtImage.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtText() : T {
		this.resetIfRequired();
		if (this.swtText == null || this.swtText == undefined) {
			this.swtText = new CommandAttr<string>()
		}
		
		this.swtText.setGetter(true);
		this.orderGet++;
		this.swtText.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtText() : string {
		if (this.swtText == null || this.swtText == undefined) {
			this.swtText = new CommandAttr<string>();
		}
		return this.swtText.getCommandReturnValue();
	}
	public setSwtText(value : string) : T {
		this.resetIfRequired();
		if (this.swtText == null || this.swtText == undefined) {
			this.swtText = new CommandAttr<string>();
		}
		
		this.swtText.setSetter(true);
		this.swtText.setValue(value);
		this.orderSet++;
		this.swtText.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetText() : T {
		this.resetIfRequired();
		if (this.text == null || this.text == undefined) {
			this.text = new CommandAttr<string>()
		}
		
		this.text.setGetter(true);
		this.orderGet++;
		this.text.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getText() : string {
		if (this.text == null || this.text == undefined) {
			this.text = new CommandAttr<string>();
		}
		return this.text.getCommandReturnValue();
	}
	public setText(value : string) : T {
		this.resetIfRequired();
		if (this.text == null || this.text == undefined) {
			this.text = new CommandAttr<string>();
		}
		
		this.text.setSetter(true);
		this.text.setValue(value);
		this.orderSet++;
		this.text.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetTextColor() : T {
		this.resetIfRequired();
		if (this.textColor == null || this.textColor == undefined) {
			this.textColor = new CommandAttr<string>()
		}
		
		this.textColor.setGetter(true);
		this.orderGet++;
		this.textColor.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getTextColor() : string {
		if (this.textColor == null || this.textColor == undefined) {
			this.textColor = new CommandAttr<string>();
		}
		return this.textColor.getCommandReturnValue();
	}
	public setTextColor(value : string) : T {
		this.resetIfRequired();
		if (this.textColor == null || this.textColor == undefined) {
			this.textColor = new CommandAttr<string>();
		}
		
		this.textColor.setSetter(true);
		this.textColor.setValue(value);
		this.orderSet++;
		this.textColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetGravity() : T {
		this.resetIfRequired();
		if (this.gravity == null || this.gravity == undefined) {
			this.gravity = new CommandAttr<Gravity[]>()
		}
		
		this.gravity.setGetter(true);
		this.orderGet++;
		this.gravity.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getGravity() : Gravity[] {
		if (this.gravity == null || this.gravity == undefined) {
			this.gravity = new CommandAttr<Gravity[]>();
		}
this.gravity.setTransformer('gravity');		return this.gravity.getCommandReturnValue();
	}
	public setGravity(...value : Gravity[]) : T {
		this.resetIfRequired();
		if (this.gravity == null || this.gravity == undefined) {
			this.gravity = new CommandAttr<Gravity[]>();
		}
		
		this.gravity.setSetter(true);
		this.gravity.setValue(value);
		this.orderSet++;
		this.gravity.setOrderSet(this.orderSet);
this.gravity.setTransformer('gravity');		return this.thisPointer;
	}
		

	public tryGetTextSize() : T {
		this.resetIfRequired();
		if (this.textSize == null || this.textSize == undefined) {
			this.textSize = new CommandAttr<string>()
		}
		
		this.textSize.setGetter(true);
		this.orderGet++;
		this.textSize.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getTextSize() : string {
		if (this.textSize == null || this.textSize == undefined) {
			this.textSize = new CommandAttr<string>();
		}
		return this.textSize.getCommandReturnValue();
	}
	public setTextSize(value : string) : T {
		this.resetIfRequired();
		if (this.textSize == null || this.textSize == undefined) {
			this.textSize = new CommandAttr<string>();
		}
		
		this.textSize.setSetter(true);
		this.textSize.setValue(value);
		this.orderSet++;
		this.textSize.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setPadding(value : string) : T {
		this.resetIfRequired();
		if (this.padding == null || this.padding == undefined) {
			this.padding = new CommandAttr<string>();
		}
		
		this.padding.setSetter(true);
		this.padding.setValue(value);
		this.orderSet++;
		this.padding.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetPaddingBottom() : T {
		this.resetIfRequired();
		if (this.paddingBottom == null || this.paddingBottom == undefined) {
			this.paddingBottom = new CommandAttr<string>()
		}
		
		this.paddingBottom.setGetter(true);
		this.orderGet++;
		this.paddingBottom.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getPaddingBottom() : string {
		if (this.paddingBottom == null || this.paddingBottom == undefined) {
			this.paddingBottom = new CommandAttr<string>();
		}
		return this.paddingBottom.getCommandReturnValue();
	}
	public setPaddingBottom(value : string) : T {
		this.resetIfRequired();
		if (this.paddingBottom == null || this.paddingBottom == undefined) {
			this.paddingBottom = new CommandAttr<string>();
		}
		
		this.paddingBottom.setSetter(true);
		this.paddingBottom.setValue(value);
		this.orderSet++;
		this.paddingBottom.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetPaddingRight() : T {
		this.resetIfRequired();
		if (this.paddingRight == null || this.paddingRight == undefined) {
			this.paddingRight = new CommandAttr<string>()
		}
		
		this.paddingRight.setGetter(true);
		this.orderGet++;
		this.paddingRight.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getPaddingRight() : string {
		if (this.paddingRight == null || this.paddingRight == undefined) {
			this.paddingRight = new CommandAttr<string>();
		}
		return this.paddingRight.getCommandReturnValue();
	}
	public setPaddingRight(value : string) : T {
		this.resetIfRequired();
		if (this.paddingRight == null || this.paddingRight == undefined) {
			this.paddingRight = new CommandAttr<string>();
		}
		
		this.paddingRight.setSetter(true);
		this.paddingRight.setValue(value);
		this.orderSet++;
		this.paddingRight.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetPaddingLeft() : T {
		this.resetIfRequired();
		if (this.paddingLeft == null || this.paddingLeft == undefined) {
			this.paddingLeft = new CommandAttr<string>()
		}
		
		this.paddingLeft.setGetter(true);
		this.orderGet++;
		this.paddingLeft.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getPaddingLeft() : string {
		if (this.paddingLeft == null || this.paddingLeft == undefined) {
			this.paddingLeft = new CommandAttr<string>();
		}
		return this.paddingLeft.getCommandReturnValue();
	}
	public setPaddingLeft(value : string) : T {
		this.resetIfRequired();
		if (this.paddingLeft == null || this.paddingLeft == undefined) {
			this.paddingLeft = new CommandAttr<string>();
		}
		
		this.paddingLeft.setSetter(true);
		this.paddingLeft.setValue(value);
		this.orderSet++;
		this.paddingLeft.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetPaddingStart() : T {
		this.resetIfRequired();
		if (this.paddingStart == null || this.paddingStart == undefined) {
			this.paddingStart = new CommandAttr<string>()
		}
		
		this.paddingStart.setGetter(true);
		this.orderGet++;
		this.paddingStart.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getPaddingStart() : string {
		if (this.paddingStart == null || this.paddingStart == undefined) {
			this.paddingStart = new CommandAttr<string>();
		}
		return this.paddingStart.getCommandReturnValue();
	}
	public setPaddingStart(value : string) : T {
		this.resetIfRequired();
		if (this.paddingStart == null || this.paddingStart == undefined) {
			this.paddingStart = new CommandAttr<string>();
		}
		
		this.paddingStart.setSetter(true);
		this.paddingStart.setValue(value);
		this.orderSet++;
		this.paddingStart.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetPaddingEnd() : T {
		this.resetIfRequired();
		if (this.paddingEnd == null || this.paddingEnd == undefined) {
			this.paddingEnd = new CommandAttr<string>()
		}
		
		this.paddingEnd.setGetter(true);
		this.orderGet++;
		this.paddingEnd.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getPaddingEnd() : string {
		if (this.paddingEnd == null || this.paddingEnd == undefined) {
			this.paddingEnd = new CommandAttr<string>();
		}
		return this.paddingEnd.getCommandReturnValue();
	}
	public setPaddingEnd(value : string) : T {
		this.resetIfRequired();
		if (this.paddingEnd == null || this.paddingEnd == undefined) {
			this.paddingEnd = new CommandAttr<string>();
		}
		
		this.paddingEnd.setSetter(true);
		this.paddingEnd.setValue(value);
		this.orderSet++;
		this.paddingEnd.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetPaddingTop() : T {
		this.resetIfRequired();
		if (this.paddingTop == null || this.paddingTop == undefined) {
			this.paddingTop = new CommandAttr<string>()
		}
		
		this.paddingTop.setGetter(true);
		this.orderGet++;
		this.paddingTop.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getPaddingTop() : string {
		if (this.paddingTop == null || this.paddingTop == undefined) {
			this.paddingTop = new CommandAttr<string>();
		}
		return this.paddingTop.getCommandReturnValue();
	}
	public setPaddingTop(value : string) : T {
		this.resetIfRequired();
		if (this.paddingTop == null || this.paddingTop == undefined) {
			this.paddingTop = new CommandAttr<string>();
		}
		
		this.paddingTop.setSetter(true);
		this.paddingTop.setValue(value);
		this.orderSet++;
		this.paddingTop.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setPaddingHorizontal(value : string) : T {
		this.resetIfRequired();
		if (this.paddingHorizontal == null || this.paddingHorizontal == undefined) {
			this.paddingHorizontal = new CommandAttr<string>();
		}
		
		this.paddingHorizontal.setSetter(true);
		this.paddingHorizontal.setValue(value);
		this.orderSet++;
		this.paddingHorizontal.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setPaddingVertical(value : string) : T {
		this.resetIfRequired();
		if (this.paddingVertical == null || this.paddingVertical == undefined) {
			this.paddingVertical = new CommandAttr<string>();
		}
		
		this.paddingVertical.setSetter(true);
		this.paddingVertical.setValue(value);
		this.orderSet++;
		this.paddingVertical.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetMinLines() : T {
		this.resetIfRequired();
		if (this.minLines == null || this.minLines == undefined) {
			this.minLines = new CommandAttr<number>()
		}
		
		this.minLines.setGetter(true);
		this.orderGet++;
		this.minLines.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getMinLines() : number {
		if (this.minLines == null || this.minLines == undefined) {
			this.minLines = new CommandAttr<number>();
		}
		return this.minLines.getCommandReturnValue();
	}
	public setMinLines(value : number) : T {
		this.resetIfRequired();
		if (this.minLines == null || this.minLines == undefined) {
			this.minLines = new CommandAttr<number>();
		}
		
		this.minLines.setSetter(true);
		this.minLines.setValue(value);
		this.orderSet++;
		this.minLines.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setLines(value : number) : T {
		this.resetIfRequired();
		if (this.lines == null || this.lines == undefined) {
			this.lines = new CommandAttr<number>();
		}
		
		this.lines.setSetter(true);
		this.lines.setValue(value);
		this.orderSet++;
		this.lines.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetMaxLines() : T {
		this.resetIfRequired();
		if (this.maxLines == null || this.maxLines == undefined) {
			this.maxLines = new CommandAttr<number>()
		}
		
		this.maxLines.setGetter(true);
		this.orderGet++;
		this.maxLines.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getMaxLines() : number {
		if (this.maxLines == null || this.maxLines == undefined) {
			this.maxLines = new CommandAttr<number>();
		}
		return this.maxLines.getCommandReturnValue();
	}
	public setMaxLines(value : number) : T {
		this.resetIfRequired();
		if (this.maxLines == null || this.maxLines == undefined) {
			this.maxLines = new CommandAttr<number>();
		}
		
		this.maxLines.setSetter(true);
		this.maxLines.setValue(value);
		this.orderSet++;
		this.maxLines.setOrderSet(this.orderSet);
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
		

	public tryGetHeight() : T {
		this.resetIfRequired();
		if (this.height == null || this.height == undefined) {
			this.height = new CommandAttr<string>()
		}
		
		this.height.setGetter(true);
		this.orderGet++;
		this.height.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getHeight() : string {
		if (this.height == null || this.height == undefined) {
			this.height = new CommandAttr<string>();
		}
		return this.height.getCommandReturnValue();
	}
	public setHeight(value : string) : T {
		this.resetIfRequired();
		if (this.height == null || this.height == undefined) {
			this.height = new CommandAttr<string>();
		}
		
		this.height.setSetter(true);
		this.height.setValue(value);
		this.orderSet++;
		this.height.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetWidth() : T {
		this.resetIfRequired();
		if (this.width == null || this.width == undefined) {
			this.width = new CommandAttr<string>()
		}
		
		this.width.setGetter(true);
		this.orderGet++;
		this.width.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getWidth() : string {
		if (this.width == null || this.width == undefined) {
			this.width = new CommandAttr<string>();
		}
		return this.width.getCommandReturnValue();
	}
	public setWidth(value : string) : T {
		this.resetIfRequired();
		if (this.width == null || this.width == undefined) {
			this.width = new CommandAttr<string>();
		}
		
		this.width.setSetter(true);
		this.width.setValue(value);
		this.orderSet++;
		this.width.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetMaxEms() : T {
		this.resetIfRequired();
		if (this.maxEms == null || this.maxEms == undefined) {
			this.maxEms = new CommandAttr<number>()
		}
		
		this.maxEms.setGetter(true);
		this.orderGet++;
		this.maxEms.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getMaxEms() : number {
		if (this.maxEms == null || this.maxEms == undefined) {
			this.maxEms = new CommandAttr<number>();
		}
		return this.maxEms.getCommandReturnValue();
	}
	public setMaxEms(value : number) : T {
		this.resetIfRequired();
		if (this.maxEms == null || this.maxEms == undefined) {
			this.maxEms = new CommandAttr<number>();
		}
		
		this.maxEms.setSetter(true);
		this.maxEms.setValue(value);
		this.orderSet++;
		this.maxEms.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetMinEms() : T {
		this.resetIfRequired();
		if (this.minEms == null || this.minEms == undefined) {
			this.minEms = new CommandAttr<number>()
		}
		
		this.minEms.setGetter(true);
		this.orderGet++;
		this.minEms.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getMinEms() : number {
		if (this.minEms == null || this.minEms == undefined) {
			this.minEms = new CommandAttr<number>();
		}
		return this.minEms.getCommandReturnValue();
	}
	public setMinEms(value : number) : T {
		this.resetIfRequired();
		if (this.minEms == null || this.minEms == undefined) {
			this.minEms = new CommandAttr<number>();
		}
		
		this.minEms.setSetter(true);
		this.minEms.setValue(value);
		this.orderSet++;
		this.minEms.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setEms(value : number) : T {
		this.resetIfRequired();
		if (this.ems == null || this.ems == undefined) {
			this.ems = new CommandAttr<number>();
		}
		
		this.ems.setSetter(true);
		this.ems.setValue(value);
		this.orderSet++;
		this.ems.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTypeface(value : string) : T {
		this.resetIfRequired();
		if (this.typeface == null || this.typeface == undefined) {
			this.typeface = new CommandAttr<string>();
		}
		
		this.typeface.setSetter(true);
		this.typeface.setValue(value);
		this.orderSet++;
		this.typeface.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTextStyle(...value : TextStyle[]) : T {
		this.resetIfRequired();
		if (this.textStyle == null || this.textStyle == undefined) {
			this.textStyle = new CommandAttr<TextStyle[]>();
		}
		
		this.textStyle.setSetter(true);
		this.textStyle.setValue(value);
		this.orderSet++;
		this.textStyle.setOrderSet(this.orderSet);
this.textStyle.setTransformer('textStyle');		return this.thisPointer;
	}
		

	public setFontFamily(value : string) : T {
		this.resetIfRequired();
		if (this.fontFamily == null || this.fontFamily == undefined) {
			this.fontFamily = new CommandAttr<string>();
		}
		
		this.fontFamily.setSetter(true);
		this.fontFamily.setValue(value);
		this.orderSet++;
		this.fontFamily.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setDrawableStart(value : string) : T {
		this.resetIfRequired();
		if (this.drawableStart == null || this.drawableStart == undefined) {
			this.drawableStart = new CommandAttr<string>();
		}
		
		this.drawableStart.setSetter(true);
		this.drawableStart.setValue(value);
		this.orderSet++;
		this.drawableStart.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setDrawableEnd(value : string) : T {
		this.resetIfRequired();
		if (this.drawableEnd == null || this.drawableEnd == undefined) {
			this.drawableEnd = new CommandAttr<string>();
		}
		
		this.drawableEnd.setSetter(true);
		this.drawableEnd.setValue(value);
		this.orderSet++;
		this.drawableEnd.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setDrawableTop(value : string) : T {
		this.resetIfRequired();
		if (this.drawableTop == null || this.drawableTop == undefined) {
			this.drawableTop = new CommandAttr<string>();
		}
		
		this.drawableTop.setSetter(true);
		this.drawableTop.setValue(value);
		this.orderSet++;
		this.drawableTop.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setDrawableBottom(value : string) : T {
		this.resetIfRequired();
		if (this.drawableBottom == null || this.drawableBottom == undefined) {
			this.drawableBottom = new CommandAttr<string>();
		}
		
		this.drawableBottom.setSetter(true);
		this.drawableBottom.setValue(value);
		this.orderSet++;
		this.drawableBottom.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetDrawablePadding() : T {
		this.resetIfRequired();
		if (this.drawablePadding == null || this.drawablePadding == undefined) {
			this.drawablePadding = new CommandAttr<string>()
		}
		
		this.drawablePadding.setGetter(true);
		this.orderGet++;
		this.drawablePadding.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getDrawablePadding() : string {
		if (this.drawablePadding == null || this.drawablePadding == undefined) {
			this.drawablePadding = new CommandAttr<string>();
		}
		return this.drawablePadding.getCommandReturnValue();
	}
	public setDrawablePadding(value : string) : T {
		this.resetIfRequired();
		if (this.drawablePadding == null || this.drawablePadding == undefined) {
			this.drawablePadding = new CommandAttr<string>();
		}
		
		this.drawablePadding.setSetter(true);
		this.drawablePadding.setValue(value);
		this.orderSet++;
		this.drawablePadding.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setDrawableTint(value : string) : T {
		this.resetIfRequired();
		if (this.drawableTint == null || this.drawableTint == undefined) {
			this.drawableTint = new CommandAttr<string>();
		}
		
		this.drawableTint.setSetter(true);
		this.drawableTint.setValue(value);
		this.orderSet++;
		this.drawableTint.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setDrawableTintMode(value : TintMode) : T {
		this.resetIfRequired();
		if (this.drawableTintMode == null || this.drawableTintMode == undefined) {
			this.drawableTintMode = new CommandAttr<TintMode>();
		}
		
		this.drawableTintMode.setSetter(true);
		this.drawableTintMode.setValue(value);
		this.orderSet++;
		this.drawableTintMode.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetAutoSizeTextType() : T {
		this.resetIfRequired();
		if (this.autoSizeTextType == null || this.autoSizeTextType == undefined) {
			this.autoSizeTextType = new CommandAttr<AutoSizeTextType>()
		}
		
		this.autoSizeTextType.setGetter(true);
		this.orderGet++;
		this.autoSizeTextType.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getAutoSizeTextType() : AutoSizeTextType {
		if (this.autoSizeTextType == null || this.autoSizeTextType == undefined) {
			this.autoSizeTextType = new CommandAttr<AutoSizeTextType>();
		}
		return this.autoSizeTextType.getCommandReturnValue();
	}
	public setAutoSizeTextType(value : AutoSizeTextType) : T {
		this.resetIfRequired();
		if (this.autoSizeTextType == null || this.autoSizeTextType == undefined) {
			this.autoSizeTextType = new CommandAttr<AutoSizeTextType>();
		}
		
		this.autoSizeTextType.setSetter(true);
		this.autoSizeTextType.setValue(value);
		this.orderSet++;
		this.autoSizeTextType.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetAutoSizeMaxTextSize() : T {
		this.resetIfRequired();
		if (this.autoSizeMaxTextSize == null || this.autoSizeMaxTextSize == undefined) {
			this.autoSizeMaxTextSize = new CommandAttr<string>()
		}
		
		this.autoSizeMaxTextSize.setGetter(true);
		this.orderGet++;
		this.autoSizeMaxTextSize.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getAutoSizeMaxTextSize() : string {
		if (this.autoSizeMaxTextSize == null || this.autoSizeMaxTextSize == undefined) {
			this.autoSizeMaxTextSize = new CommandAttr<string>();
		}
		return this.autoSizeMaxTextSize.getCommandReturnValue();
	}
	public setAutoSizeMaxTextSize(value : string) : T {
		this.resetIfRequired();
		if (this.autoSizeMaxTextSize == null || this.autoSizeMaxTextSize == undefined) {
			this.autoSizeMaxTextSize = new CommandAttr<string>();
		}
		
		this.autoSizeMaxTextSize.setSetter(true);
		this.autoSizeMaxTextSize.setValue(value);
		this.orderSet++;
		this.autoSizeMaxTextSize.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetAutoSizeMinTextSize() : T {
		this.resetIfRequired();
		if (this.autoSizeMinTextSize == null || this.autoSizeMinTextSize == undefined) {
			this.autoSizeMinTextSize = new CommandAttr<string>()
		}
		
		this.autoSizeMinTextSize.setGetter(true);
		this.orderGet++;
		this.autoSizeMinTextSize.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getAutoSizeMinTextSize() : string {
		if (this.autoSizeMinTextSize == null || this.autoSizeMinTextSize == undefined) {
			this.autoSizeMinTextSize = new CommandAttr<string>();
		}
		return this.autoSizeMinTextSize.getCommandReturnValue();
	}
	public setAutoSizeMinTextSize(value : string) : T {
		this.resetIfRequired();
		if (this.autoSizeMinTextSize == null || this.autoSizeMinTextSize == undefined) {
			this.autoSizeMinTextSize = new CommandAttr<string>();
		}
		
		this.autoSizeMinTextSize.setSetter(true);
		this.autoSizeMinTextSize.setValue(value);
		this.orderSet++;
		this.autoSizeMinTextSize.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetAutoSizeStepGranularity() : T {
		this.resetIfRequired();
		if (this.autoSizeStepGranularity == null || this.autoSizeStepGranularity == undefined) {
			this.autoSizeStepGranularity = new CommandAttr<string>()
		}
		
		this.autoSizeStepGranularity.setGetter(true);
		this.orderGet++;
		this.autoSizeStepGranularity.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getAutoSizeStepGranularity() : string {
		if (this.autoSizeStepGranularity == null || this.autoSizeStepGranularity == undefined) {
			this.autoSizeStepGranularity = new CommandAttr<string>();
		}
		return this.autoSizeStepGranularity.getCommandReturnValue();
	}
	public setAutoSizeStepGranularity(value : string) : T {
		this.resetIfRequired();
		if (this.autoSizeStepGranularity == null || this.autoSizeStepGranularity == undefined) {
			this.autoSizeStepGranularity = new CommandAttr<string>();
		}
		
		this.autoSizeStepGranularity.setSetter(true);
		this.autoSizeStepGranularity.setValue(value);
		this.orderSet++;
		this.autoSizeStepGranularity.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setMaxLength(value : number) : T {
		this.resetIfRequired();
		if (this.maxLength == null || this.maxLength == undefined) {
			this.maxLength = new CommandAttr<number>();
		}
		
		this.maxLength.setSetter(true);
		this.maxLength.setValue(value);
		this.orderSet++;
		this.maxLength.setOrderSet(this.orderSet);
		return this.thisPointer;
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
		

	public setEditable(value : boolean) : T {
		this.resetIfRequired();
		if (this.editable == null || this.editable == undefined) {
			this.editable = new CommandAttr<boolean>();
		}
		
		this.editable.setSetter(true);
		this.editable.setValue(value);
		this.orderSet++;
		this.editable.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setSingleLine(value : boolean) : T {
		this.resetIfRequired();
		if (this.singleLine == null || this.singleLine == undefined) {
			this.singleLine = new CommandAttr<boolean>();
		}
		
		this.singleLine.setSetter(true);
		this.singleLine.setValue(value);
		this.orderSet++;
		this.singleLine.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTextAllCaps(value : boolean) : T {
		this.resetIfRequired();
		if (this.textAllCaps == null || this.textAllCaps == undefined) {
			this.textAllCaps = new CommandAttr<boolean>();
		}
		
		this.textAllCaps.setSetter(true);
		this.textAllCaps.setValue(value);
		this.orderSet++;
		this.textAllCaps.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setPassword(value : boolean) : T {
		this.resetIfRequired();
		if (this.password == null || this.password == undefined) {
			this.password = new CommandAttr<boolean>();
		}
		
		this.password.setSetter(true);
		this.password.setValue(value);
		this.orderSet++;
		this.password.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setScrollHorizontally(value : boolean) : T {
		this.resetIfRequired();
		if (this.scrollHorizontally == null || this.scrollHorizontally == undefined) {
			this.scrollHorizontally = new CommandAttr<boolean>();
		}
		
		this.scrollHorizontally.setSetter(true);
		this.scrollHorizontally.setValue(value);
		this.orderSet++;
		this.scrollHorizontally.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetEllipsize() : T {
		this.resetIfRequired();
		if (this.ellipsize == null || this.ellipsize == undefined) {
			this.ellipsize = new CommandAttr<Ellipsize>()
		}
		
		this.ellipsize.setGetter(true);
		this.orderGet++;
		this.ellipsize.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getEllipsize() : Ellipsize {
		if (this.ellipsize == null || this.ellipsize == undefined) {
			this.ellipsize = new CommandAttr<Ellipsize>();
		}
		return this.ellipsize.getCommandReturnValue();
	}
	public setEllipsize(value : Ellipsize) : T {
		this.resetIfRequired();
		if (this.ellipsize == null || this.ellipsize == undefined) {
			this.ellipsize = new CommandAttr<Ellipsize>();
		}
		
		this.ellipsize.setSetter(true);
		this.ellipsize.setValue(value);
		this.orderSet++;
		this.ellipsize.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setStartOrStopMarquee(value : boolean) : T {
		this.resetIfRequired();
		if (this.startOrStopMarquee == null || this.startOrStopMarquee == undefined) {
			this.startOrStopMarquee = new CommandAttr<boolean>();
		}
		
		this.startOrStopMarquee.setSetter(true);
		this.startOrStopMarquee.setValue(value);
		this.orderSet++;
		this.startOrStopMarquee.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetMarqueeRepeatLimit() : T {
		this.resetIfRequired();
		if (this.marqueeRepeatLimit == null || this.marqueeRepeatLimit == undefined) {
			this.marqueeRepeatLimit = new CommandAttr<string>()
		}
		
		this.marqueeRepeatLimit.setGetter(true);
		this.orderGet++;
		this.marqueeRepeatLimit.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getMarqueeRepeatLimit() : string {
		if (this.marqueeRepeatLimit == null || this.marqueeRepeatLimit == undefined) {
			this.marqueeRepeatLimit = new CommandAttr<string>();
		}
		return this.marqueeRepeatLimit.getCommandReturnValue();
	}
	public setMarqueeRepeatLimit(value : string) : T {
		this.resetIfRequired();
		if (this.marqueeRepeatLimit == null || this.marqueeRepeatLimit == undefined) {
			this.marqueeRepeatLimit = new CommandAttr<string>();
		}
		
		this.marqueeRepeatLimit.setSetter(true);
		this.marqueeRepeatLimit.setValue(value);
		this.orderSet++;
		this.marqueeRepeatLimit.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetFirstBaselineToTopHeight() : T {
		this.resetIfRequired();
		if (this.firstBaselineToTopHeight == null || this.firstBaselineToTopHeight == undefined) {
			this.firstBaselineToTopHeight = new CommandAttr<string>()
		}
		
		this.firstBaselineToTopHeight.setGetter(true);
		this.orderGet++;
		this.firstBaselineToTopHeight.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getFirstBaselineToTopHeight() : string {
		if (this.firstBaselineToTopHeight == null || this.firstBaselineToTopHeight == undefined) {
			this.firstBaselineToTopHeight = new CommandAttr<string>();
		}
		return this.firstBaselineToTopHeight.getCommandReturnValue();
	}
	public setFirstBaselineToTopHeight(value : string) : T {
		this.resetIfRequired();
		if (this.firstBaselineToTopHeight == null || this.firstBaselineToTopHeight == undefined) {
			this.firstBaselineToTopHeight = new CommandAttr<string>();
		}
		
		this.firstBaselineToTopHeight.setSetter(true);
		this.firstBaselineToTopHeight.setValue(value);
		this.orderSet++;
		this.firstBaselineToTopHeight.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetLastBaselineToBottomHeight() : T {
		this.resetIfRequired();
		if (this.lastBaselineToBottomHeight == null || this.lastBaselineToBottomHeight == undefined) {
			this.lastBaselineToBottomHeight = new CommandAttr<string>()
		}
		
		this.lastBaselineToBottomHeight.setGetter(true);
		this.orderGet++;
		this.lastBaselineToBottomHeight.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getLastBaselineToBottomHeight() : string {
		if (this.lastBaselineToBottomHeight == null || this.lastBaselineToBottomHeight == undefined) {
			this.lastBaselineToBottomHeight = new CommandAttr<string>();
		}
		return this.lastBaselineToBottomHeight.getCommandReturnValue();
	}
	public setLastBaselineToBottomHeight(value : string) : T {
		this.resetIfRequired();
		if (this.lastBaselineToBottomHeight == null || this.lastBaselineToBottomHeight == undefined) {
			this.lastBaselineToBottomHeight = new CommandAttr<string>();
		}
		
		this.lastBaselineToBottomHeight.setSetter(true);
		this.lastBaselineToBottomHeight.setValue(value);
		this.orderSet++;
		this.lastBaselineToBottomHeight.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setAutoSizePresetSizes(value : string) : T {
		this.resetIfRequired();
		if (this.autoSizePresetSizes == null || this.autoSizePresetSizes == undefined) {
			this.autoSizePresetSizes = new CommandAttr<string>();
		}
		
		this.autoSizePresetSizes.setSetter(true);
		this.autoSizePresetSizes.setValue(value);
		this.orderSet++;
		this.autoSizePresetSizes.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTextFormat(value : string) : T {
		this.resetIfRequired();
		if (this.textFormat == null || this.textFormat == undefined) {
			this.textFormat = new CommandAttr<string>();
		}
		
		this.textFormat.setSetter(true);
		this.textFormat.setValue(value);
		this.orderSet++;
		this.textFormat.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTextAppearance(value : string) : T {
		this.resetIfRequired();
		if (this.textAppearance == null || this.textAppearance == undefined) {
			this.textAppearance = new CommandAttr<string>();
		}
		
		this.textAppearance.setSetter(true);
		this.textAppearance.setValue(value);
		this.orderSet++;
		this.textAppearance.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setDrawableIconSize(value : string) : T {
		this.resetIfRequired();
		if (this.drawableIconSize == null || this.drawableIconSize == undefined) {
			this.drawableIconSize = new CommandAttr<string>();
		}
		
		this.drawableIconSize.setSetter(true);
		this.drawableIconSize.setValue(value);
		this.orderSet++;
		this.drawableIconSize.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		
	//end - body

}
//start - staticinit

export class TextView extends TextViewImpl<TextView> implements IWidget{
    getThisPointer(): TextView {
        return this;
    }
    
   	public getClass() {
		return TextView;
	}
	
   	constructor(id: string, path: string[], event: string) {
		super(id, path, event);	
	}
}

TextViewImpl.initialize();

//end - staticinit
