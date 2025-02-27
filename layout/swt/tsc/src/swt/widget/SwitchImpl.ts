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
export abstract class SwitchImpl<T> extends ViewImpl<T>{
	//start - body
	static initialize() {
		TransformerFactory.getInstance().register("textStyle", new TextStyleTransformer());
    }	
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtText" }))
	swtText!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtSelection" }))
	swtSelection!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtTextForSelect" }))
	swtTextForSelect!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtTextForUnselect" }))
	swtTextForUnselect!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtRound" }))
	swtRound!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtBorderColor" }))
	swtBorderColor!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtFocusColor" }))
	swtFocusColor!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtSelectedForegroundColor" }))
	swtSelectedForegroundColor!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtSelectedBackgroundColor" }))
	swtSelectedBackgroundColor!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtUnselectedForegroundColor" }))
	swtUnselectedForegroundColor!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtUnselectedBackgroundColor" }))
	swtUnselectedBackgroundColor!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtButtonBorderColor" }))
	swtButtonBorderColor!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtButtonBackgroundColor1" }))
	swtButtonBackgroundColor1!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtButtonBackgroundColor2" }))
	swtButtonBackgroundColor2!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtGap" }))
	swtGap!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtArc" }))
	swtArc!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onCheckedChange" }))
	onCheckedChange!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "checked" }))
	checked!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textOn" }))
	textOn!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textOff" }))
	textOff!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "switchPadding" }))
	switchPadding!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "switchMinWidth" }))
	switchMinWidth!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "trackTint" }))
	trackTint!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "thumbTint" }))
	thumbTint!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtInsideMarginX" }))
	swtInsideMarginX!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtInsideMarginY" }))
	swtInsideMarginY!:CommandAttr<string>| undefined;
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
		this.swtText = undefined;
		this.swtSelection = undefined;
		this.swtTextForSelect = undefined;
		this.swtTextForUnselect = undefined;
		this.swtRound = undefined;
		this.swtBorderColor = undefined;
		this.swtFocusColor = undefined;
		this.swtSelectedForegroundColor = undefined;
		this.swtSelectedBackgroundColor = undefined;
		this.swtUnselectedForegroundColor = undefined;
		this.swtUnselectedBackgroundColor = undefined;
		this.swtButtonBorderColor = undefined;
		this.swtButtonBackgroundColor1 = undefined;
		this.swtButtonBackgroundColor2 = undefined;
		this.swtGap = undefined;
		this.swtArc = undefined;
		this.onCheckedChange = undefined;
		this.checked = undefined;
		this.textOn = undefined;
		this.textOff = undefined;
		this.switchPadding = undefined;
		this.switchMinWidth = undefined;
		this.trackTint = undefined;
		this.thumbTint = undefined;
		this.swtInsideMarginX = undefined;
		this.swtInsideMarginY = undefined;
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
		this.maxLength = undefined;
		this.enabled = undefined;
		this.editable = undefined;
		this.singleLine = undefined;
		this.textAllCaps = undefined;
		this.scrollHorizontally = undefined;
		this.ellipsize = undefined;
		this.startOrStopMarquee = undefined;
		this.marqueeRepeatLimit = undefined;
		this.firstBaselineToTopHeight = undefined;
		this.lastBaselineToBottomHeight = undefined;
		this.textFormat = undefined;
		this.textAppearance = undefined;
		this.drawableIconSize = undefined;
		return this.thisPointer;
	}
	constructor(id: string, path: string[], event:  string) {
		super(id, path, event);
		this.thisPointer = this.getThisPointer();
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
		

	public tryGetSwtSelection() : T {
		this.resetIfRequired();
		if (this.swtSelection == null || this.swtSelection == undefined) {
			this.swtSelection = new CommandAttr<boolean>()
		}
		
		this.swtSelection.setGetter(true);
		this.orderGet++;
		this.swtSelection.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isSwtSelection() : boolean {
		if (this.swtSelection == null || this.swtSelection == undefined) {
			this.swtSelection = new CommandAttr<boolean>();
		}
		return this.swtSelection.getCommandReturnValue();
	}
	public setSwtSelection(value : boolean) : T {
		this.resetIfRequired();
		if (this.swtSelection == null || this.swtSelection == undefined) {
			this.swtSelection = new CommandAttr<boolean>();
		}
		
		this.swtSelection.setSetter(true);
		this.swtSelection.setValue(value);
		this.orderSet++;
		this.swtSelection.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtTextForSelect() : T {
		this.resetIfRequired();
		if (this.swtTextForSelect == null || this.swtTextForSelect == undefined) {
			this.swtTextForSelect = new CommandAttr<string>()
		}
		
		this.swtTextForSelect.setGetter(true);
		this.orderGet++;
		this.swtTextForSelect.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtTextForSelect() : string {
		if (this.swtTextForSelect == null || this.swtTextForSelect == undefined) {
			this.swtTextForSelect = new CommandAttr<string>();
		}
		return this.swtTextForSelect.getCommandReturnValue();
	}
	public setSwtTextForSelect(value : string) : T {
		this.resetIfRequired();
		if (this.swtTextForSelect == null || this.swtTextForSelect == undefined) {
			this.swtTextForSelect = new CommandAttr<string>();
		}
		
		this.swtTextForSelect.setSetter(true);
		this.swtTextForSelect.setValue(value);
		this.orderSet++;
		this.swtTextForSelect.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtTextForUnselect() : T {
		this.resetIfRequired();
		if (this.swtTextForUnselect == null || this.swtTextForUnselect == undefined) {
			this.swtTextForUnselect = new CommandAttr<string>()
		}
		
		this.swtTextForUnselect.setGetter(true);
		this.orderGet++;
		this.swtTextForUnselect.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtTextForUnselect() : string {
		if (this.swtTextForUnselect == null || this.swtTextForUnselect == undefined) {
			this.swtTextForUnselect = new CommandAttr<string>();
		}
		return this.swtTextForUnselect.getCommandReturnValue();
	}
	public setSwtTextForUnselect(value : string) : T {
		this.resetIfRequired();
		if (this.swtTextForUnselect == null || this.swtTextForUnselect == undefined) {
			this.swtTextForUnselect = new CommandAttr<string>();
		}
		
		this.swtTextForUnselect.setSetter(true);
		this.swtTextForUnselect.setValue(value);
		this.orderSet++;
		this.swtTextForUnselect.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtRound() : T {
		this.resetIfRequired();
		if (this.swtRound == null || this.swtRound == undefined) {
			this.swtRound = new CommandAttr<boolean>()
		}
		
		this.swtRound.setGetter(true);
		this.orderGet++;
		this.swtRound.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isSwtRound() : boolean {
		if (this.swtRound == null || this.swtRound == undefined) {
			this.swtRound = new CommandAttr<boolean>();
		}
		return this.swtRound.getCommandReturnValue();
	}
	public setSwtRound(value : boolean) : T {
		this.resetIfRequired();
		if (this.swtRound == null || this.swtRound == undefined) {
			this.swtRound = new CommandAttr<boolean>();
		}
		
		this.swtRound.setSetter(true);
		this.swtRound.setValue(value);
		this.orderSet++;
		this.swtRound.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtBorderColor() : T {
		this.resetIfRequired();
		if (this.swtBorderColor == null || this.swtBorderColor == undefined) {
			this.swtBorderColor = new CommandAttr<string>()
		}
		
		this.swtBorderColor.setGetter(true);
		this.orderGet++;
		this.swtBorderColor.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtBorderColor() : string {
		if (this.swtBorderColor == null || this.swtBorderColor == undefined) {
			this.swtBorderColor = new CommandAttr<string>();
		}
		return this.swtBorderColor.getCommandReturnValue();
	}
	public setSwtBorderColor(value : string) : T {
		this.resetIfRequired();
		if (this.swtBorderColor == null || this.swtBorderColor == undefined) {
			this.swtBorderColor = new CommandAttr<string>();
		}
		
		this.swtBorderColor.setSetter(true);
		this.swtBorderColor.setValue(value);
		this.orderSet++;
		this.swtBorderColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtFocusColor() : T {
		this.resetIfRequired();
		if (this.swtFocusColor == null || this.swtFocusColor == undefined) {
			this.swtFocusColor = new CommandAttr<string>()
		}
		
		this.swtFocusColor.setGetter(true);
		this.orderGet++;
		this.swtFocusColor.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtFocusColor() : string {
		if (this.swtFocusColor == null || this.swtFocusColor == undefined) {
			this.swtFocusColor = new CommandAttr<string>();
		}
		return this.swtFocusColor.getCommandReturnValue();
	}
	public setSwtFocusColor(value : string) : T {
		this.resetIfRequired();
		if (this.swtFocusColor == null || this.swtFocusColor == undefined) {
			this.swtFocusColor = new CommandAttr<string>();
		}
		
		this.swtFocusColor.setSetter(true);
		this.swtFocusColor.setValue(value);
		this.orderSet++;
		this.swtFocusColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtSelectedForegroundColor() : T {
		this.resetIfRequired();
		if (this.swtSelectedForegroundColor == null || this.swtSelectedForegroundColor == undefined) {
			this.swtSelectedForegroundColor = new CommandAttr<string>()
		}
		
		this.swtSelectedForegroundColor.setGetter(true);
		this.orderGet++;
		this.swtSelectedForegroundColor.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtSelectedForegroundColor() : string {
		if (this.swtSelectedForegroundColor == null || this.swtSelectedForegroundColor == undefined) {
			this.swtSelectedForegroundColor = new CommandAttr<string>();
		}
		return this.swtSelectedForegroundColor.getCommandReturnValue();
	}
	public setSwtSelectedForegroundColor(value : string) : T {
		this.resetIfRequired();
		if (this.swtSelectedForegroundColor == null || this.swtSelectedForegroundColor == undefined) {
			this.swtSelectedForegroundColor = new CommandAttr<string>();
		}
		
		this.swtSelectedForegroundColor.setSetter(true);
		this.swtSelectedForegroundColor.setValue(value);
		this.orderSet++;
		this.swtSelectedForegroundColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtSelectedBackgroundColor() : T {
		this.resetIfRequired();
		if (this.swtSelectedBackgroundColor == null || this.swtSelectedBackgroundColor == undefined) {
			this.swtSelectedBackgroundColor = new CommandAttr<string>()
		}
		
		this.swtSelectedBackgroundColor.setGetter(true);
		this.orderGet++;
		this.swtSelectedBackgroundColor.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtSelectedBackgroundColor() : string {
		if (this.swtSelectedBackgroundColor == null || this.swtSelectedBackgroundColor == undefined) {
			this.swtSelectedBackgroundColor = new CommandAttr<string>();
		}
		return this.swtSelectedBackgroundColor.getCommandReturnValue();
	}
	public setSwtSelectedBackgroundColor(value : string) : T {
		this.resetIfRequired();
		if (this.swtSelectedBackgroundColor == null || this.swtSelectedBackgroundColor == undefined) {
			this.swtSelectedBackgroundColor = new CommandAttr<string>();
		}
		
		this.swtSelectedBackgroundColor.setSetter(true);
		this.swtSelectedBackgroundColor.setValue(value);
		this.orderSet++;
		this.swtSelectedBackgroundColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtUnselectedForegroundColor() : T {
		this.resetIfRequired();
		if (this.swtUnselectedForegroundColor == null || this.swtUnselectedForegroundColor == undefined) {
			this.swtUnselectedForegroundColor = new CommandAttr<string>()
		}
		
		this.swtUnselectedForegroundColor.setGetter(true);
		this.orderGet++;
		this.swtUnselectedForegroundColor.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtUnselectedForegroundColor() : string {
		if (this.swtUnselectedForegroundColor == null || this.swtUnselectedForegroundColor == undefined) {
			this.swtUnselectedForegroundColor = new CommandAttr<string>();
		}
		return this.swtUnselectedForegroundColor.getCommandReturnValue();
	}
	public setSwtUnselectedForegroundColor(value : string) : T {
		this.resetIfRequired();
		if (this.swtUnselectedForegroundColor == null || this.swtUnselectedForegroundColor == undefined) {
			this.swtUnselectedForegroundColor = new CommandAttr<string>();
		}
		
		this.swtUnselectedForegroundColor.setSetter(true);
		this.swtUnselectedForegroundColor.setValue(value);
		this.orderSet++;
		this.swtUnselectedForegroundColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtUnselectedBackgroundColor() : T {
		this.resetIfRequired();
		if (this.swtUnselectedBackgroundColor == null || this.swtUnselectedBackgroundColor == undefined) {
			this.swtUnselectedBackgroundColor = new CommandAttr<string>()
		}
		
		this.swtUnselectedBackgroundColor.setGetter(true);
		this.orderGet++;
		this.swtUnselectedBackgroundColor.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtUnselectedBackgroundColor() : string {
		if (this.swtUnselectedBackgroundColor == null || this.swtUnselectedBackgroundColor == undefined) {
			this.swtUnselectedBackgroundColor = new CommandAttr<string>();
		}
		return this.swtUnselectedBackgroundColor.getCommandReturnValue();
	}
	public setSwtUnselectedBackgroundColor(value : string) : T {
		this.resetIfRequired();
		if (this.swtUnselectedBackgroundColor == null || this.swtUnselectedBackgroundColor == undefined) {
			this.swtUnselectedBackgroundColor = new CommandAttr<string>();
		}
		
		this.swtUnselectedBackgroundColor.setSetter(true);
		this.swtUnselectedBackgroundColor.setValue(value);
		this.orderSet++;
		this.swtUnselectedBackgroundColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtButtonBorderColor() : T {
		this.resetIfRequired();
		if (this.swtButtonBorderColor == null || this.swtButtonBorderColor == undefined) {
			this.swtButtonBorderColor = new CommandAttr<string>()
		}
		
		this.swtButtonBorderColor.setGetter(true);
		this.orderGet++;
		this.swtButtonBorderColor.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtButtonBorderColor() : string {
		if (this.swtButtonBorderColor == null || this.swtButtonBorderColor == undefined) {
			this.swtButtonBorderColor = new CommandAttr<string>();
		}
		return this.swtButtonBorderColor.getCommandReturnValue();
	}
	public setSwtButtonBorderColor(value : string) : T {
		this.resetIfRequired();
		if (this.swtButtonBorderColor == null || this.swtButtonBorderColor == undefined) {
			this.swtButtonBorderColor = new CommandAttr<string>();
		}
		
		this.swtButtonBorderColor.setSetter(true);
		this.swtButtonBorderColor.setValue(value);
		this.orderSet++;
		this.swtButtonBorderColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtButtonBackgroundColor1() : T {
		this.resetIfRequired();
		if (this.swtButtonBackgroundColor1 == null || this.swtButtonBackgroundColor1 == undefined) {
			this.swtButtonBackgroundColor1 = new CommandAttr<string>()
		}
		
		this.swtButtonBackgroundColor1.setGetter(true);
		this.orderGet++;
		this.swtButtonBackgroundColor1.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtButtonBackgroundColor1() : string {
		if (this.swtButtonBackgroundColor1 == null || this.swtButtonBackgroundColor1 == undefined) {
			this.swtButtonBackgroundColor1 = new CommandAttr<string>();
		}
		return this.swtButtonBackgroundColor1.getCommandReturnValue();
	}
	public setSwtButtonBackgroundColor1(value : string) : T {
		this.resetIfRequired();
		if (this.swtButtonBackgroundColor1 == null || this.swtButtonBackgroundColor1 == undefined) {
			this.swtButtonBackgroundColor1 = new CommandAttr<string>();
		}
		
		this.swtButtonBackgroundColor1.setSetter(true);
		this.swtButtonBackgroundColor1.setValue(value);
		this.orderSet++;
		this.swtButtonBackgroundColor1.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtButtonBackgroundColor2() : T {
		this.resetIfRequired();
		if (this.swtButtonBackgroundColor2 == null || this.swtButtonBackgroundColor2 == undefined) {
			this.swtButtonBackgroundColor2 = new CommandAttr<string>()
		}
		
		this.swtButtonBackgroundColor2.setGetter(true);
		this.orderGet++;
		this.swtButtonBackgroundColor2.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtButtonBackgroundColor2() : string {
		if (this.swtButtonBackgroundColor2 == null || this.swtButtonBackgroundColor2 == undefined) {
			this.swtButtonBackgroundColor2 = new CommandAttr<string>();
		}
		return this.swtButtonBackgroundColor2.getCommandReturnValue();
	}
	public setSwtButtonBackgroundColor2(value : string) : T {
		this.resetIfRequired();
		if (this.swtButtonBackgroundColor2 == null || this.swtButtonBackgroundColor2 == undefined) {
			this.swtButtonBackgroundColor2 = new CommandAttr<string>();
		}
		
		this.swtButtonBackgroundColor2.setSetter(true);
		this.swtButtonBackgroundColor2.setValue(value);
		this.orderSet++;
		this.swtButtonBackgroundColor2.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtGap() : T {
		this.resetIfRequired();
		if (this.swtGap == null || this.swtGap == undefined) {
			this.swtGap = new CommandAttr<number>()
		}
		
		this.swtGap.setGetter(true);
		this.orderGet++;
		this.swtGap.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtGap() : number {
		if (this.swtGap == null || this.swtGap == undefined) {
			this.swtGap = new CommandAttr<number>();
		}
		return this.swtGap.getCommandReturnValue();
	}
	public setSwtGap(value : number) : T {
		this.resetIfRequired();
		if (this.swtGap == null || this.swtGap == undefined) {
			this.swtGap = new CommandAttr<number>();
		}
		
		this.swtGap.setSetter(true);
		this.swtGap.setValue(value);
		this.orderSet++;
		this.swtGap.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtArc() : T {
		this.resetIfRequired();
		if (this.swtArc == null || this.swtArc == undefined) {
			this.swtArc = new CommandAttr<number>()
		}
		
		this.swtArc.setGetter(true);
		this.orderGet++;
		this.swtArc.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtArc() : number {
		if (this.swtArc == null || this.swtArc == undefined) {
			this.swtArc = new CommandAttr<number>();
		}
		return this.swtArc.getCommandReturnValue();
	}
	public setSwtArc(value : number) : T {
		this.resetIfRequired();
		if (this.swtArc == null || this.swtArc == undefined) {
			this.swtArc = new CommandAttr<number>();
		}
		
		this.swtArc.setSetter(true);
		this.swtArc.setValue(value);
		this.orderSet++;
		this.swtArc.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnCheckedChange(value : string) : T {
		this.resetIfRequired();
		if (this.onCheckedChange == null || this.onCheckedChange == undefined) {
			this.onCheckedChange = new CommandAttr<string>();
		}
		
		this.onCheckedChange.setSetter(true);
		this.onCheckedChange.setValue(value);
		this.orderSet++;
		this.onCheckedChange.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetChecked() : T {
		this.resetIfRequired();
		if (this.checked == null || this.checked == undefined) {
			this.checked = new CommandAttr<boolean>()
		}
		
		this.checked.setGetter(true);
		this.orderGet++;
		this.checked.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isChecked() : boolean {
		if (this.checked == null || this.checked == undefined) {
			this.checked = new CommandAttr<boolean>();
		}
		return this.checked.getCommandReturnValue();
	}
	public setChecked(value : boolean) : T {
		this.resetIfRequired();
		if (this.checked == null || this.checked == undefined) {
			this.checked = new CommandAttr<boolean>();
		}
		
		this.checked.setSetter(true);
		this.checked.setValue(value);
		this.orderSet++;
		this.checked.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetTextOn() : T {
		this.resetIfRequired();
		if (this.textOn == null || this.textOn == undefined) {
			this.textOn = new CommandAttr<string>()
		}
		
		this.textOn.setGetter(true);
		this.orderGet++;
		this.textOn.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getTextOn() : string {
		if (this.textOn == null || this.textOn == undefined) {
			this.textOn = new CommandAttr<string>();
		}
		return this.textOn.getCommandReturnValue();
	}
	public setTextOn(value : string) : T {
		this.resetIfRequired();
		if (this.textOn == null || this.textOn == undefined) {
			this.textOn = new CommandAttr<string>();
		}
		
		this.textOn.setSetter(true);
		this.textOn.setValue(value);
		this.orderSet++;
		this.textOn.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetTextOff() : T {
		this.resetIfRequired();
		if (this.textOff == null || this.textOff == undefined) {
			this.textOff = new CommandAttr<string>()
		}
		
		this.textOff.setGetter(true);
		this.orderGet++;
		this.textOff.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getTextOff() : string {
		if (this.textOff == null || this.textOff == undefined) {
			this.textOff = new CommandAttr<string>();
		}
		return this.textOff.getCommandReturnValue();
	}
	public setTextOff(value : string) : T {
		this.resetIfRequired();
		if (this.textOff == null || this.textOff == undefined) {
			this.textOff = new CommandAttr<string>();
		}
		
		this.textOff.setSetter(true);
		this.textOff.setValue(value);
		this.orderSet++;
		this.textOff.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwitchPadding() : T {
		this.resetIfRequired();
		if (this.switchPadding == null || this.switchPadding == undefined) {
			this.switchPadding = new CommandAttr<string>()
		}
		
		this.switchPadding.setGetter(true);
		this.orderGet++;
		this.switchPadding.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwitchPadding() : string {
		if (this.switchPadding == null || this.switchPadding == undefined) {
			this.switchPadding = new CommandAttr<string>();
		}
		return this.switchPadding.getCommandReturnValue();
	}
	public setSwitchPadding(value : string) : T {
		this.resetIfRequired();
		if (this.switchPadding == null || this.switchPadding == undefined) {
			this.switchPadding = new CommandAttr<string>();
		}
		
		this.switchPadding.setSetter(true);
		this.switchPadding.setValue(value);
		this.orderSet++;
		this.switchPadding.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwitchMinWidth() : T {
		this.resetIfRequired();
		if (this.switchMinWidth == null || this.switchMinWidth == undefined) {
			this.switchMinWidth = new CommandAttr<string>()
		}
		
		this.switchMinWidth.setGetter(true);
		this.orderGet++;
		this.switchMinWidth.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwitchMinWidth() : string {
		if (this.switchMinWidth == null || this.switchMinWidth == undefined) {
			this.switchMinWidth = new CommandAttr<string>();
		}
		return this.switchMinWidth.getCommandReturnValue();
	}
	public setSwitchMinWidth(value : string) : T {
		this.resetIfRequired();
		if (this.switchMinWidth == null || this.switchMinWidth == undefined) {
			this.switchMinWidth = new CommandAttr<string>();
		}
		
		this.switchMinWidth.setSetter(true);
		this.switchMinWidth.setValue(value);
		this.orderSet++;
		this.switchMinWidth.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetTrackTint() : T {
		this.resetIfRequired();
		if (this.trackTint == null || this.trackTint == undefined) {
			this.trackTint = new CommandAttr<string>()
		}
		
		this.trackTint.setGetter(true);
		this.orderGet++;
		this.trackTint.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getTrackTint() : string {
		if (this.trackTint == null || this.trackTint == undefined) {
			this.trackTint = new CommandAttr<string>();
		}
		return this.trackTint.getCommandReturnValue();
	}
	public setTrackTint(value : string) : T {
		this.resetIfRequired();
		if (this.trackTint == null || this.trackTint == undefined) {
			this.trackTint = new CommandAttr<string>();
		}
		
		this.trackTint.setSetter(true);
		this.trackTint.setValue(value);
		this.orderSet++;
		this.trackTint.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetThumbTint() : T {
		this.resetIfRequired();
		if (this.thumbTint == null || this.thumbTint == undefined) {
			this.thumbTint = new CommandAttr<string>()
		}
		
		this.thumbTint.setGetter(true);
		this.orderGet++;
		this.thumbTint.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getThumbTint() : string {
		if (this.thumbTint == null || this.thumbTint == undefined) {
			this.thumbTint = new CommandAttr<string>();
		}
		return this.thumbTint.getCommandReturnValue();
	}
	public setThumbTint(value : string) : T {
		this.resetIfRequired();
		if (this.thumbTint == null || this.thumbTint == undefined) {
			this.thumbTint = new CommandAttr<string>();
		}
		
		this.thumbTint.setSetter(true);
		this.thumbTint.setValue(value);
		this.orderSet++;
		this.thumbTint.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtInsideMarginX() : T {
		this.resetIfRequired();
		if (this.swtInsideMarginX == null || this.swtInsideMarginX == undefined) {
			this.swtInsideMarginX = new CommandAttr<string>()
		}
		
		this.swtInsideMarginX.setGetter(true);
		this.orderGet++;
		this.swtInsideMarginX.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtInsideMarginX() : string {
		if (this.swtInsideMarginX == null || this.swtInsideMarginX == undefined) {
			this.swtInsideMarginX = new CommandAttr<string>();
		}
		return this.swtInsideMarginX.getCommandReturnValue();
	}
	public setSwtInsideMarginX(value : string) : T {
		this.resetIfRequired();
		if (this.swtInsideMarginX == null || this.swtInsideMarginX == undefined) {
			this.swtInsideMarginX = new CommandAttr<string>();
		}
		
		this.swtInsideMarginX.setSetter(true);
		this.swtInsideMarginX.setValue(value);
		this.orderSet++;
		this.swtInsideMarginX.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtInsideMarginY() : T {
		this.resetIfRequired();
		if (this.swtInsideMarginY == null || this.swtInsideMarginY == undefined) {
			this.swtInsideMarginY = new CommandAttr<string>()
		}
		
		this.swtInsideMarginY.setGetter(true);
		this.orderGet++;
		this.swtInsideMarginY.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtInsideMarginY() : string {
		if (this.swtInsideMarginY == null || this.swtInsideMarginY == undefined) {
			this.swtInsideMarginY = new CommandAttr<string>();
		}
		return this.swtInsideMarginY.getCommandReturnValue();
	}
	public setSwtInsideMarginY(value : string) : T {
		this.resetIfRequired();
		if (this.swtInsideMarginY == null || this.swtInsideMarginY == undefined) {
			this.swtInsideMarginY = new CommandAttr<string>();
		}
		
		this.swtInsideMarginY.setSetter(true);
		this.swtInsideMarginY.setValue(value);
		this.orderSet++;
		this.swtInsideMarginY.setOrderSet(this.orderSet);
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

export class Switch extends SwitchImpl<Switch> implements IWidget{
    getThisPointer(): Switch {
        return this;
    }
    
   	public getClass() {
		return Switch;
	}
	
   	constructor(id: string, path: string[], event: string) {
		super(id, path, event);	
	}
}

SwitchImpl.initialize();

//end - staticinit
