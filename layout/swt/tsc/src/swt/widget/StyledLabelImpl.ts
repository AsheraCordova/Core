// start - imports

export const enum JustificationMode {
inter_word = "inter_word",
none = "none",
}
export const enum AutoLink {
all = "all",
email = "email",
map = "map",
none = "none",
phone = "phone",
web = "web",
}
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
































export class AutoLinkTransformer implements ITranform {
    transform(value: any, obj: any, type: number) : any{
        if (type == 1) {
            return value.toString().replace(",", "|");
        } else {
            let strArray:Array<string> = value.toString().split("|");
            
            let valueArr:Array<AutoLink> = new Array<AutoLink>();
            for (let i =0; i < strArray.length; i++) {
                switch(strArray[i]) {
					case "all":
						valueArr.push(AutoLink.all);
                       	break;	
					case "email":
						valueArr.push(AutoLink.email);
                       	break;	
					case "map":
						valueArr.push(AutoLink.map);
                       	break;	
					case "none":
						valueArr.push(AutoLink.none);
                       	break;	
					case "phone":
						valueArr.push(AutoLink.phone);
                       	break;	
					case "web":
						valueArr.push(AutoLink.web);
                       	break;	
                }
                
            }
            return valueArr;
        }
    }
}





























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
export abstract class StyledLabelImpl<T> extends ViewImpl<T>{
	//start - body
	static initialize() {
		TransformerFactory.getInstance().register("autoLink", new AutoLinkTransformer());
		TransformerFactory.getInstance().register("textStyle", new TextStyleTransformer());
    }	
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtText" }))
	swtText!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtAlwaysShowScrollBars" }))
	swtAlwaysShowScrollBars!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtBackground" }))
	swtBackground!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtBidiColoring" }))
	swtBidiColoring!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtBottomMargin" }))
	swtBottomMargin!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtForeground" }))
	swtForeground!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtHorizontalIndex" }))
	swtHorizontalIndex!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtHorizontalPixel" }))
	swtHorizontalPixel!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtIndent" }))
	swtIndent!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtJustify" }))
	swtJustify!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtLeftMargin" }))
	swtLeftMargin!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtLineSpacing" }))
	swtLineSpacing!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtMarginColor" }))
	swtMarginColor!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtOrientation" }))
	swtOrientation!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtRightMargin" }))
	swtRightMargin!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtSelectionBackground" }))
	swtSelectionBackground!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtSelectionForeground" }))
	swtSelectionForeground!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtTabs" }))
	swtTabs!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtTextDirection" }))
	swtTextDirection!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtTextLimit" }))
	swtTextLimit!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtTopIndex" }))
	swtTopIndex!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtTopMargin" }))
	swtTopMargin!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtTopPixel" }))
	swtTopPixel!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtWordWrap" }))
	swtWordWrap!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "swtWrapIndent" }))
	swtWrapIndent!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "justificationMode" }))
	justificationMode!:CommandAttr<JustificationMode>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "lineSpacingExtra" }))
	lineSpacingExtra!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "lineSpacingMultiplier" }))
	lineSpacingMultiplier!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textIsSelectable" }))
	textIsSelectable!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "singleLine" }))
	singleLine!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "autoLink" }))
	autoLink!:CommandAttr<AutoLink[]>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "linksClickable" }))
	linksClickable!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textColorLink" }))
	textColorLink!:CommandAttr<string>| undefined;
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
	@decorate(Expose({ name: "drawableLeft" }))
	drawableLeft!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "drawableRight" }))
	drawableRight!:CommandAttr<string>| undefined;
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

	@decorate(Exclude())
	protected thisPointer: T;	
	protected abstract getThisPointer(): T;
	reset() : T {	
		super.reset();
		this.swtText = undefined;
		this.swtAlwaysShowScrollBars = undefined;
		this.swtBackground = undefined;
		this.swtBidiColoring = undefined;
		this.swtBottomMargin = undefined;
		this.swtForeground = undefined;
		this.swtHorizontalIndex = undefined;
		this.swtHorizontalPixel = undefined;
		this.swtIndent = undefined;
		this.swtJustify = undefined;
		this.swtLeftMargin = undefined;
		this.swtLineSpacing = undefined;
		this.swtMarginColor = undefined;
		this.swtOrientation = undefined;
		this.swtRightMargin = undefined;
		this.swtSelectionBackground = undefined;
		this.swtSelectionForeground = undefined;
		this.swtTabs = undefined;
		this.swtTextDirection = undefined;
		this.swtTextLimit = undefined;
		this.swtTopIndex = undefined;
		this.swtTopMargin = undefined;
		this.swtTopPixel = undefined;
		this.swtWordWrap = undefined;
		this.swtWrapIndent = undefined;
		this.justificationMode = undefined;
		this.lineSpacingExtra = undefined;
		this.lineSpacingMultiplier = undefined;
		this.textIsSelectable = undefined;
		this.singleLine = undefined;
		this.autoLink = undefined;
		this.linksClickable = undefined;
		this.textColorLink = undefined;
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
		this.drawableLeft = undefined;
		this.drawableRight = undefined;
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
		

	public tryGetSwtAlwaysShowScrollBars() : T {
		this.resetIfRequired();
		if (this.swtAlwaysShowScrollBars == null || this.swtAlwaysShowScrollBars == undefined) {
			this.swtAlwaysShowScrollBars = new CommandAttr<boolean>()
		}
		
		this.swtAlwaysShowScrollBars.setGetter(true);
		this.orderGet++;
		this.swtAlwaysShowScrollBars.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isSwtAlwaysShowScrollBars() : boolean {
		if (this.swtAlwaysShowScrollBars == null || this.swtAlwaysShowScrollBars == undefined) {
			this.swtAlwaysShowScrollBars = new CommandAttr<boolean>();
		}
		return this.swtAlwaysShowScrollBars.getCommandReturnValue();
	}
	public setSwtAlwaysShowScrollBars(value : boolean) : T {
		this.resetIfRequired();
		if (this.swtAlwaysShowScrollBars == null || this.swtAlwaysShowScrollBars == undefined) {
			this.swtAlwaysShowScrollBars = new CommandAttr<boolean>();
		}
		
		this.swtAlwaysShowScrollBars.setSetter(true);
		this.swtAlwaysShowScrollBars.setValue(value);
		this.orderSet++;
		this.swtAlwaysShowScrollBars.setOrderSet(this.orderSet);
		return this.thisPointer;
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
		

	public tryGetSwtBidiColoring() : T {
		this.resetIfRequired();
		if (this.swtBidiColoring == null || this.swtBidiColoring == undefined) {
			this.swtBidiColoring = new CommandAttr<boolean>()
		}
		
		this.swtBidiColoring.setGetter(true);
		this.orderGet++;
		this.swtBidiColoring.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isSwtBidiColoring() : boolean {
		if (this.swtBidiColoring == null || this.swtBidiColoring == undefined) {
			this.swtBidiColoring = new CommandAttr<boolean>();
		}
		return this.swtBidiColoring.getCommandReturnValue();
	}
	public setSwtBidiColoring(value : boolean) : T {
		this.resetIfRequired();
		if (this.swtBidiColoring == null || this.swtBidiColoring == undefined) {
			this.swtBidiColoring = new CommandAttr<boolean>();
		}
		
		this.swtBidiColoring.setSetter(true);
		this.swtBidiColoring.setValue(value);
		this.orderSet++;
		this.swtBidiColoring.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtBottomMargin() : T {
		this.resetIfRequired();
		if (this.swtBottomMargin == null || this.swtBottomMargin == undefined) {
			this.swtBottomMargin = new CommandAttr<string>()
		}
		
		this.swtBottomMargin.setGetter(true);
		this.orderGet++;
		this.swtBottomMargin.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtBottomMargin() : string {
		if (this.swtBottomMargin == null || this.swtBottomMargin == undefined) {
			this.swtBottomMargin = new CommandAttr<string>();
		}
		return this.swtBottomMargin.getCommandReturnValue();
	}
	public setSwtBottomMargin(value : string) : T {
		this.resetIfRequired();
		if (this.swtBottomMargin == null || this.swtBottomMargin == undefined) {
			this.swtBottomMargin = new CommandAttr<string>();
		}
		
		this.swtBottomMargin.setSetter(true);
		this.swtBottomMargin.setValue(value);
		this.orderSet++;
		this.swtBottomMargin.setOrderSet(this.orderSet);
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
		

	public tryGetSwtHorizontalIndex() : T {
		this.resetIfRequired();
		if (this.swtHorizontalIndex == null || this.swtHorizontalIndex == undefined) {
			this.swtHorizontalIndex = new CommandAttr<number>()
		}
		
		this.swtHorizontalIndex.setGetter(true);
		this.orderGet++;
		this.swtHorizontalIndex.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtHorizontalIndex() : number {
		if (this.swtHorizontalIndex == null || this.swtHorizontalIndex == undefined) {
			this.swtHorizontalIndex = new CommandAttr<number>();
		}
		return this.swtHorizontalIndex.getCommandReturnValue();
	}
	public setSwtHorizontalIndex(value : number) : T {
		this.resetIfRequired();
		if (this.swtHorizontalIndex == null || this.swtHorizontalIndex == undefined) {
			this.swtHorizontalIndex = new CommandAttr<number>();
		}
		
		this.swtHorizontalIndex.setSetter(true);
		this.swtHorizontalIndex.setValue(value);
		this.orderSet++;
		this.swtHorizontalIndex.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtHorizontalPixel() : T {
		this.resetIfRequired();
		if (this.swtHorizontalPixel == null || this.swtHorizontalPixel == undefined) {
			this.swtHorizontalPixel = new CommandAttr<number>()
		}
		
		this.swtHorizontalPixel.setGetter(true);
		this.orderGet++;
		this.swtHorizontalPixel.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtHorizontalPixel() : number {
		if (this.swtHorizontalPixel == null || this.swtHorizontalPixel == undefined) {
			this.swtHorizontalPixel = new CommandAttr<number>();
		}
		return this.swtHorizontalPixel.getCommandReturnValue();
	}
	public setSwtHorizontalPixel(value : number) : T {
		this.resetIfRequired();
		if (this.swtHorizontalPixel == null || this.swtHorizontalPixel == undefined) {
			this.swtHorizontalPixel = new CommandAttr<number>();
		}
		
		this.swtHorizontalPixel.setSetter(true);
		this.swtHorizontalPixel.setValue(value);
		this.orderSet++;
		this.swtHorizontalPixel.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtIndent() : T {
		this.resetIfRequired();
		if (this.swtIndent == null || this.swtIndent == undefined) {
			this.swtIndent = new CommandAttr<number>()
		}
		
		this.swtIndent.setGetter(true);
		this.orderGet++;
		this.swtIndent.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtIndent() : number {
		if (this.swtIndent == null || this.swtIndent == undefined) {
			this.swtIndent = new CommandAttr<number>();
		}
		return this.swtIndent.getCommandReturnValue();
	}
	public setSwtIndent(value : number) : T {
		this.resetIfRequired();
		if (this.swtIndent == null || this.swtIndent == undefined) {
			this.swtIndent = new CommandAttr<number>();
		}
		
		this.swtIndent.setSetter(true);
		this.swtIndent.setValue(value);
		this.orderSet++;
		this.swtIndent.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtJustify() : T {
		this.resetIfRequired();
		if (this.swtJustify == null || this.swtJustify == undefined) {
			this.swtJustify = new CommandAttr<boolean>()
		}
		
		this.swtJustify.setGetter(true);
		this.orderGet++;
		this.swtJustify.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isSwtJustify() : boolean {
		if (this.swtJustify == null || this.swtJustify == undefined) {
			this.swtJustify = new CommandAttr<boolean>();
		}
		return this.swtJustify.getCommandReturnValue();
	}
	public setSwtJustify(value : boolean) : T {
		this.resetIfRequired();
		if (this.swtJustify == null || this.swtJustify == undefined) {
			this.swtJustify = new CommandAttr<boolean>();
		}
		
		this.swtJustify.setSetter(true);
		this.swtJustify.setValue(value);
		this.orderSet++;
		this.swtJustify.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtLeftMargin() : T {
		this.resetIfRequired();
		if (this.swtLeftMargin == null || this.swtLeftMargin == undefined) {
			this.swtLeftMargin = new CommandAttr<string>()
		}
		
		this.swtLeftMargin.setGetter(true);
		this.orderGet++;
		this.swtLeftMargin.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtLeftMargin() : string {
		if (this.swtLeftMargin == null || this.swtLeftMargin == undefined) {
			this.swtLeftMargin = new CommandAttr<string>();
		}
		return this.swtLeftMargin.getCommandReturnValue();
	}
	public setSwtLeftMargin(value : string) : T {
		this.resetIfRequired();
		if (this.swtLeftMargin == null || this.swtLeftMargin == undefined) {
			this.swtLeftMargin = new CommandAttr<string>();
		}
		
		this.swtLeftMargin.setSetter(true);
		this.swtLeftMargin.setValue(value);
		this.orderSet++;
		this.swtLeftMargin.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtLineSpacing() : T {
		this.resetIfRequired();
		if (this.swtLineSpacing == null || this.swtLineSpacing == undefined) {
			this.swtLineSpacing = new CommandAttr<number>()
		}
		
		this.swtLineSpacing.setGetter(true);
		this.orderGet++;
		this.swtLineSpacing.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtLineSpacing() : number {
		if (this.swtLineSpacing == null || this.swtLineSpacing == undefined) {
			this.swtLineSpacing = new CommandAttr<number>();
		}
		return this.swtLineSpacing.getCommandReturnValue();
	}
	public setSwtLineSpacing(value : number) : T {
		this.resetIfRequired();
		if (this.swtLineSpacing == null || this.swtLineSpacing == undefined) {
			this.swtLineSpacing = new CommandAttr<number>();
		}
		
		this.swtLineSpacing.setSetter(true);
		this.swtLineSpacing.setValue(value);
		this.orderSet++;
		this.swtLineSpacing.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtMarginColor() : T {
		this.resetIfRequired();
		if (this.swtMarginColor == null || this.swtMarginColor == undefined) {
			this.swtMarginColor = new CommandAttr<string>()
		}
		
		this.swtMarginColor.setGetter(true);
		this.orderGet++;
		this.swtMarginColor.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtMarginColor() : string {
		if (this.swtMarginColor == null || this.swtMarginColor == undefined) {
			this.swtMarginColor = new CommandAttr<string>();
		}
		return this.swtMarginColor.getCommandReturnValue();
	}
	public setSwtMarginColor(value : string) : T {
		this.resetIfRequired();
		if (this.swtMarginColor == null || this.swtMarginColor == undefined) {
			this.swtMarginColor = new CommandAttr<string>();
		}
		
		this.swtMarginColor.setSetter(true);
		this.swtMarginColor.setValue(value);
		this.orderSet++;
		this.swtMarginColor.setOrderSet(this.orderSet);
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
		

	public tryGetSwtRightMargin() : T {
		this.resetIfRequired();
		if (this.swtRightMargin == null || this.swtRightMargin == undefined) {
			this.swtRightMargin = new CommandAttr<string>()
		}
		
		this.swtRightMargin.setGetter(true);
		this.orderGet++;
		this.swtRightMargin.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtRightMargin() : string {
		if (this.swtRightMargin == null || this.swtRightMargin == undefined) {
			this.swtRightMargin = new CommandAttr<string>();
		}
		return this.swtRightMargin.getCommandReturnValue();
	}
	public setSwtRightMargin(value : string) : T {
		this.resetIfRequired();
		if (this.swtRightMargin == null || this.swtRightMargin == undefined) {
			this.swtRightMargin = new CommandAttr<string>();
		}
		
		this.swtRightMargin.setSetter(true);
		this.swtRightMargin.setValue(value);
		this.orderSet++;
		this.swtRightMargin.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtSelectionBackground() : T {
		this.resetIfRequired();
		if (this.swtSelectionBackground == null || this.swtSelectionBackground == undefined) {
			this.swtSelectionBackground = new CommandAttr<string>()
		}
		
		this.swtSelectionBackground.setGetter(true);
		this.orderGet++;
		this.swtSelectionBackground.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtSelectionBackground() : string {
		if (this.swtSelectionBackground == null || this.swtSelectionBackground == undefined) {
			this.swtSelectionBackground = new CommandAttr<string>();
		}
		return this.swtSelectionBackground.getCommandReturnValue();
	}
	public setSwtSelectionBackground(value : string) : T {
		this.resetIfRequired();
		if (this.swtSelectionBackground == null || this.swtSelectionBackground == undefined) {
			this.swtSelectionBackground = new CommandAttr<string>();
		}
		
		this.swtSelectionBackground.setSetter(true);
		this.swtSelectionBackground.setValue(value);
		this.orderSet++;
		this.swtSelectionBackground.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtSelectionForeground() : T {
		this.resetIfRequired();
		if (this.swtSelectionForeground == null || this.swtSelectionForeground == undefined) {
			this.swtSelectionForeground = new CommandAttr<string>()
		}
		
		this.swtSelectionForeground.setGetter(true);
		this.orderGet++;
		this.swtSelectionForeground.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtSelectionForeground() : string {
		if (this.swtSelectionForeground == null || this.swtSelectionForeground == undefined) {
			this.swtSelectionForeground = new CommandAttr<string>();
		}
		return this.swtSelectionForeground.getCommandReturnValue();
	}
	public setSwtSelectionForeground(value : string) : T {
		this.resetIfRequired();
		if (this.swtSelectionForeground == null || this.swtSelectionForeground == undefined) {
			this.swtSelectionForeground = new CommandAttr<string>();
		}
		
		this.swtSelectionForeground.setSetter(true);
		this.swtSelectionForeground.setValue(value);
		this.orderSet++;
		this.swtSelectionForeground.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtTabs() : T {
		this.resetIfRequired();
		if (this.swtTabs == null || this.swtTabs == undefined) {
			this.swtTabs = new CommandAttr<number>()
		}
		
		this.swtTabs.setGetter(true);
		this.orderGet++;
		this.swtTabs.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtTabs() : number {
		if (this.swtTabs == null || this.swtTabs == undefined) {
			this.swtTabs = new CommandAttr<number>();
		}
		return this.swtTabs.getCommandReturnValue();
	}
	public setSwtTabs(value : number) : T {
		this.resetIfRequired();
		if (this.swtTabs == null || this.swtTabs == undefined) {
			this.swtTabs = new CommandAttr<number>();
		}
		
		this.swtTabs.setSetter(true);
		this.swtTabs.setValue(value);
		this.orderSet++;
		this.swtTabs.setOrderSet(this.orderSet);
		return this.thisPointer;
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
		

	public tryGetSwtTextLimit() : T {
		this.resetIfRequired();
		if (this.swtTextLimit == null || this.swtTextLimit == undefined) {
			this.swtTextLimit = new CommandAttr<number>()
		}
		
		this.swtTextLimit.setGetter(true);
		this.orderGet++;
		this.swtTextLimit.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtTextLimit() : number {
		if (this.swtTextLimit == null || this.swtTextLimit == undefined) {
			this.swtTextLimit = new CommandAttr<number>();
		}
		return this.swtTextLimit.getCommandReturnValue();
	}
	public setSwtTextLimit(value : number) : T {
		this.resetIfRequired();
		if (this.swtTextLimit == null || this.swtTextLimit == undefined) {
			this.swtTextLimit = new CommandAttr<number>();
		}
		
		this.swtTextLimit.setSetter(true);
		this.swtTextLimit.setValue(value);
		this.orderSet++;
		this.swtTextLimit.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtTopIndex() : T {
		this.resetIfRequired();
		if (this.swtTopIndex == null || this.swtTopIndex == undefined) {
			this.swtTopIndex = new CommandAttr<number>()
		}
		
		this.swtTopIndex.setGetter(true);
		this.orderGet++;
		this.swtTopIndex.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtTopIndex() : number {
		if (this.swtTopIndex == null || this.swtTopIndex == undefined) {
			this.swtTopIndex = new CommandAttr<number>();
		}
		return this.swtTopIndex.getCommandReturnValue();
	}
	public setSwtTopIndex(value : number) : T {
		this.resetIfRequired();
		if (this.swtTopIndex == null || this.swtTopIndex == undefined) {
			this.swtTopIndex = new CommandAttr<number>();
		}
		
		this.swtTopIndex.setSetter(true);
		this.swtTopIndex.setValue(value);
		this.orderSet++;
		this.swtTopIndex.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtTopMargin() : T {
		this.resetIfRequired();
		if (this.swtTopMargin == null || this.swtTopMargin == undefined) {
			this.swtTopMargin = new CommandAttr<string>()
		}
		
		this.swtTopMargin.setGetter(true);
		this.orderGet++;
		this.swtTopMargin.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtTopMargin() : string {
		if (this.swtTopMargin == null || this.swtTopMargin == undefined) {
			this.swtTopMargin = new CommandAttr<string>();
		}
		return this.swtTopMargin.getCommandReturnValue();
	}
	public setSwtTopMargin(value : string) : T {
		this.resetIfRequired();
		if (this.swtTopMargin == null || this.swtTopMargin == undefined) {
			this.swtTopMargin = new CommandAttr<string>();
		}
		
		this.swtTopMargin.setSetter(true);
		this.swtTopMargin.setValue(value);
		this.orderSet++;
		this.swtTopMargin.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtTopPixel() : T {
		this.resetIfRequired();
		if (this.swtTopPixel == null || this.swtTopPixel == undefined) {
			this.swtTopPixel = new CommandAttr<number>()
		}
		
		this.swtTopPixel.setGetter(true);
		this.orderGet++;
		this.swtTopPixel.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtTopPixel() : number {
		if (this.swtTopPixel == null || this.swtTopPixel == undefined) {
			this.swtTopPixel = new CommandAttr<number>();
		}
		return this.swtTopPixel.getCommandReturnValue();
	}
	public setSwtTopPixel(value : number) : T {
		this.resetIfRequired();
		if (this.swtTopPixel == null || this.swtTopPixel == undefined) {
			this.swtTopPixel = new CommandAttr<number>();
		}
		
		this.swtTopPixel.setSetter(true);
		this.swtTopPixel.setValue(value);
		this.orderSet++;
		this.swtTopPixel.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtWordWrap() : T {
		this.resetIfRequired();
		if (this.swtWordWrap == null || this.swtWordWrap == undefined) {
			this.swtWordWrap = new CommandAttr<boolean>()
		}
		
		this.swtWordWrap.setGetter(true);
		this.orderGet++;
		this.swtWordWrap.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isSwtWordWrap() : boolean {
		if (this.swtWordWrap == null || this.swtWordWrap == undefined) {
			this.swtWordWrap = new CommandAttr<boolean>();
		}
		return this.swtWordWrap.getCommandReturnValue();
	}
	public setSwtWordWrap(value : boolean) : T {
		this.resetIfRequired();
		if (this.swtWordWrap == null || this.swtWordWrap == undefined) {
			this.swtWordWrap = new CommandAttr<boolean>();
		}
		
		this.swtWordWrap.setSetter(true);
		this.swtWordWrap.setValue(value);
		this.orderSet++;
		this.swtWordWrap.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSwtWrapIndent() : T {
		this.resetIfRequired();
		if (this.swtWrapIndent == null || this.swtWrapIndent == undefined) {
			this.swtWrapIndent = new CommandAttr<number>()
		}
		
		this.swtWrapIndent.setGetter(true);
		this.orderGet++;
		this.swtWrapIndent.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSwtWrapIndent() : number {
		if (this.swtWrapIndent == null || this.swtWrapIndent == undefined) {
			this.swtWrapIndent = new CommandAttr<number>();
		}
		return this.swtWrapIndent.getCommandReturnValue();
	}
	public setSwtWrapIndent(value : number) : T {
		this.resetIfRequired();
		if (this.swtWrapIndent == null || this.swtWrapIndent == undefined) {
			this.swtWrapIndent = new CommandAttr<number>();
		}
		
		this.swtWrapIndent.setSetter(true);
		this.swtWrapIndent.setValue(value);
		this.orderSet++;
		this.swtWrapIndent.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetJustificationMode() : T {
		this.resetIfRequired();
		if (this.justificationMode == null || this.justificationMode == undefined) {
			this.justificationMode = new CommandAttr<JustificationMode>()
		}
		
		this.justificationMode.setGetter(true);
		this.orderGet++;
		this.justificationMode.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getJustificationMode() : JustificationMode {
		if (this.justificationMode == null || this.justificationMode == undefined) {
			this.justificationMode = new CommandAttr<JustificationMode>();
		}
		return this.justificationMode.getCommandReturnValue();
	}
	public setJustificationMode(value : JustificationMode) : T {
		this.resetIfRequired();
		if (this.justificationMode == null || this.justificationMode == undefined) {
			this.justificationMode = new CommandAttr<JustificationMode>();
		}
		
		this.justificationMode.setSetter(true);
		this.justificationMode.setValue(value);
		this.orderSet++;
		this.justificationMode.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetLineSpacingExtra() : T {
		this.resetIfRequired();
		if (this.lineSpacingExtra == null || this.lineSpacingExtra == undefined) {
			this.lineSpacingExtra = new CommandAttr<string>()
		}
		
		this.lineSpacingExtra.setGetter(true);
		this.orderGet++;
		this.lineSpacingExtra.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getLineSpacingExtra() : string {
		if (this.lineSpacingExtra == null || this.lineSpacingExtra == undefined) {
			this.lineSpacingExtra = new CommandAttr<string>();
		}
		return this.lineSpacingExtra.getCommandReturnValue();
	}
	public setLineSpacingExtra(value : string) : T {
		this.resetIfRequired();
		if (this.lineSpacingExtra == null || this.lineSpacingExtra == undefined) {
			this.lineSpacingExtra = new CommandAttr<string>();
		}
		
		this.lineSpacingExtra.setSetter(true);
		this.lineSpacingExtra.setValue(value);
		this.orderSet++;
		this.lineSpacingExtra.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetLineSpacingMultiplier() : T {
		this.resetIfRequired();
		if (this.lineSpacingMultiplier == null || this.lineSpacingMultiplier == undefined) {
			this.lineSpacingMultiplier = new CommandAttr<number>()
		}
		
		this.lineSpacingMultiplier.setGetter(true);
		this.orderGet++;
		this.lineSpacingMultiplier.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getLineSpacingMultiplier() : number {
		if (this.lineSpacingMultiplier == null || this.lineSpacingMultiplier == undefined) {
			this.lineSpacingMultiplier = new CommandAttr<number>();
		}
		return this.lineSpacingMultiplier.getCommandReturnValue();
	}
	public setLineSpacingMultiplier(value : number) : T {
		this.resetIfRequired();
		if (this.lineSpacingMultiplier == null || this.lineSpacingMultiplier == undefined) {
			this.lineSpacingMultiplier = new CommandAttr<number>();
		}
		
		this.lineSpacingMultiplier.setSetter(true);
		this.lineSpacingMultiplier.setValue(value);
		this.orderSet++;
		this.lineSpacingMultiplier.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetTextIsSelectable() : T {
		this.resetIfRequired();
		if (this.textIsSelectable == null || this.textIsSelectable == undefined) {
			this.textIsSelectable = new CommandAttr<boolean>()
		}
		
		this.textIsSelectable.setGetter(true);
		this.orderGet++;
		this.textIsSelectable.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isTextIsSelectable() : boolean {
		if (this.textIsSelectable == null || this.textIsSelectable == undefined) {
			this.textIsSelectable = new CommandAttr<boolean>();
		}
		return this.textIsSelectable.getCommandReturnValue();
	}
	public setTextIsSelectable(value : boolean) : T {
		this.resetIfRequired();
		if (this.textIsSelectable == null || this.textIsSelectable == undefined) {
			this.textIsSelectable = new CommandAttr<boolean>();
		}
		
		this.textIsSelectable.setSetter(true);
		this.textIsSelectable.setValue(value);
		this.orderSet++;
		this.textIsSelectable.setOrderSet(this.orderSet);
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
		

	public tryGetAutoLink() : T {
		this.resetIfRequired();
		if (this.autoLink == null || this.autoLink == undefined) {
			this.autoLink = new CommandAttr<AutoLink[]>()
		}
		
		this.autoLink.setGetter(true);
		this.orderGet++;
		this.autoLink.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getAutoLink() : AutoLink[] {
		if (this.autoLink == null || this.autoLink == undefined) {
			this.autoLink = new CommandAttr<AutoLink[]>();
		}
this.autoLink.setTransformer('autoLink');		return this.autoLink.getCommandReturnValue();
	}
	public setAutoLink(...value : AutoLink[]) : T {
		this.resetIfRequired();
		if (this.autoLink == null || this.autoLink == undefined) {
			this.autoLink = new CommandAttr<AutoLink[]>();
		}
		
		this.autoLink.setSetter(true);
		this.autoLink.setValue(value);
		this.orderSet++;
		this.autoLink.setOrderSet(this.orderSet);
this.autoLink.setTransformer('autoLink');		return this.thisPointer;
	}
		

	public tryGetLinksClickable() : T {
		this.resetIfRequired();
		if (this.linksClickable == null || this.linksClickable == undefined) {
			this.linksClickable = new CommandAttr<boolean>()
		}
		
		this.linksClickable.setGetter(true);
		this.orderGet++;
		this.linksClickable.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isLinksClickable() : boolean {
		if (this.linksClickable == null || this.linksClickable == undefined) {
			this.linksClickable = new CommandAttr<boolean>();
		}
		return this.linksClickable.getCommandReturnValue();
	}
	public setLinksClickable(value : boolean) : T {
		this.resetIfRequired();
		if (this.linksClickable == null || this.linksClickable == undefined) {
			this.linksClickable = new CommandAttr<boolean>();
		}
		
		this.linksClickable.setSetter(true);
		this.linksClickable.setValue(value);
		this.orderSet++;
		this.linksClickable.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTextColorLink(value : string) : T {
		this.resetIfRequired();
		if (this.textColorLink == null || this.textColorLink == undefined) {
			this.textColorLink = new CommandAttr<string>();
		}
		
		this.textColorLink.setSetter(true);
		this.textColorLink.setValue(value);
		this.orderSet++;
		this.textColorLink.setOrderSet(this.orderSet);
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
		

	public setDrawableLeft(value : string) : T {
		this.resetIfRequired();
		if (this.drawableLeft == null || this.drawableLeft == undefined) {
			this.drawableLeft = new CommandAttr<string>();
		}
		
		this.drawableLeft.setSetter(true);
		this.drawableLeft.setValue(value);
		this.orderSet++;
		this.drawableLeft.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setDrawableRight(value : string) : T {
		this.resetIfRequired();
		if (this.drawableRight == null || this.drawableRight == undefined) {
			this.drawableRight = new CommandAttr<string>();
		}
		
		this.drawableRight.setSetter(true);
		this.drawableRight.setValue(value);
		this.orderSet++;
		this.drawableRight.setOrderSet(this.orderSet);
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
		
	//end - body

}
	
//start - staticinit

export class StyledLabel extends StyledLabelImpl<StyledLabel> implements IWidget{
    getThisPointer(): StyledLabel {
        return this;
    }
    
   	public getClass() {
		return StyledLabel;
	}
	
   	constructor(id: string, path: string[], event: string) {
		super(id, path, event);	
	}
}

StyledLabelImpl.initialize();

//end - staticinit
