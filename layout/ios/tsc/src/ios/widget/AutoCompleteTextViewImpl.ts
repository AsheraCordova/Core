// start - imports

export const enum DrawableTintMode {
add = "add",
multiply = "multiply",
screen = "screen",
src_atop = "src_atop",
src_in = "src_in",
src_over = "src_over",
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
export const enum Capitalize {
none = "none",
words = "words",
sentences = "sentences",
characters = "characters",
}
export const enum Numeric {
decimal = "decimal",
integer = "integer",
signed = "signed",
}
export const enum InputType {
date = "date",
datetime = "datetime",
none = "none",
number = "number",
numberDecimal = "numberDecimal",
numberPassword = "numberPassword",
numberSigned = "numberSigned",
phone = "phone",
text = "text",
textAutoComplete = "textAutoComplete",
textAutoCorrect = "textAutoCorrect",
textCapCharacters = "textCapCharacters",
textCapSentences = "textCapSentences",
textCapWords = "textCapWords",
textEmailAddress = "textEmailAddress",
textEmailSubject = "textEmailSubject",
textFilter = "textFilter",
textImeMultiLine = "textImeMultiLine",
textLongMessage = "textLongMessage",
textMultiLine = "textMultiLine",
textNoSuggestions = "textNoSuggestions",
textPassword = "textPassword",
textPersonName = "textPersonName",
textPhonetic = "textPhonetic",
textPostalAddress = "textPostalAddress",
textShortMessage = "textShortMessage",
textUri = "textUri",
textVisiblePassword = "textVisiblePassword",
textWebEditText = "textWebEditText",
textWebEmailAddress = "textWebEmailAddress",
textWebPassword = "textWebPassword",
time = "time",
}
export const enum ImeOptions {
actionDone = "actionDone",
actionGo = "actionGo",
actionNext = "actionNext",
actionNone = "actionNone",
actionPrevious = "actionPrevious",
actionSearch = "actionSearch",
actionSend = "actionSend",
actionUnspecified = "actionUnspecified",
flagForceAscii = "flagForceAscii",
flagNavigateNext = "flagNavigateNext",
flagNavigatePrevious = "flagNavigatePrevious",
flagNoAccessoryAction = "flagNoAccessoryAction",
flagNoEnterAction = "flagNoEnterAction",
flagNoExtractUi = "flagNoExtractUi",
flagNoFullscreen = "flagNoFullscreen",
flagNoPersonalizedLearning = "flagNoPersonalizedLearning",
normal = "normal",
}
export const enum IosBorderStyle {
none = "none",
line = "line",
bezel = "bezel",
roundedRect = "roundedRect",
}
export const enum InputView {
picker = "picker",
datepicker = "datepicker",
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

























export class NumericTransformer implements ITranform {
    transform(value: any, obj: any, type: number) : any{
        if (type == 1) {
            return value.toString().replace(",", "|");
        } else {
            let strArray:Array<string> = value.toString().split("|");
            
            let valueArr:Array<Numeric> = new Array<Numeric>();
            for (let i =0; i < strArray.length; i++) {
                switch(strArray[i]) {
					case "decimal":
						valueArr.push(Numeric.decimal);
                       	break;	
					case "integer":
						valueArr.push(Numeric.integer);
                       	break;	
					case "signed":
						valueArr.push(Numeric.signed);
                       	break;	
                }
                
            }
            return valueArr;
        }
    }
}
























// end - imports
import {ViewImpl} from './ViewImpl';
export abstract class AutoCompleteTextViewImpl<T> extends ViewImpl<T>{
	//start - body
	static initialize() {
		TransformerFactory.getInstance().register("textStyle", new TextStyleTransformer());
		TransformerFactory.getInstance().register("numeric", new NumericTransformer());
    }	
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "iosText" }))
	iosText!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "iosPlaceholder" }))
	iosPlaceholder!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "iosTextColor" }))
	iosTextColor!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "iosAdjustsFontSizeToFitWidth" }))
	iosAdjustsFontSizeToFitWidth!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "iosMinimumFontSize" }))
	iosMinimumFontSize!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "iosIsEditing" }))
	iosIsEditing!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "iosClearsOnBeginEditing" }))
	iosClearsOnBeginEditing!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "iosClearsOnInsertion" }))
	iosClearsOnInsertion!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "iosAllowsEditingTextAttributes" }))
	iosAllowsEditingTextAttributes!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "iosBackground" }))
	iosBackground!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "iosDisabledBackground" }))
	iosDisabledBackground!:CommandAttr<string>| undefined;
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
	drawableTintMode!:CommandAttr<DrawableTintMode>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "drawableIconSize" }))
	drawableIconSize!:CommandAttr<string>| undefined;
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
	@decorate(Expose({ name: "editable" }))
	editable!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "maxLength" }))
	maxLength!:CommandAttr<number>| undefined;
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
	@decorate(Expose({ name: "enabled" }))
	enabled!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textColorHighlight" }))
	textColorHighlight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "firstBaselineToTopHeight" }))
	firstBaselineToTopHeight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "lastBaselineToBottomHeight" }))
	lastBaselineToBottomHeight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "completionThreshold" }))
	completionThreshold!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "completionHintView" }))
	completionHintView!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "completionHint" }))
	completionHint!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "entries" }))
	entries!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "dropDownHeight" }))
	dropDownHeight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "dropDownHorizontalOffset" }))
	dropDownHorizontalOffset!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "dropDownVerticalOffset" }))
	dropDownVerticalOffset!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "dropDownWidth" }))
	dropDownWidth!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "dropDownSelector" }))
	dropDownSelector!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "dropDownAnchor" }))
	dropDownAnchor!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "listitem" }))
	listitem!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onDismiss" }))
	onDismiss!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "showDropDown" }))
	showDropDown_!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "text" }))
	text!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "gravity" }))
	gravity!:CommandAttr<Gravity[]>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "autoText" }))
	autoText!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "capitalize" }))
	capitalize!:CommandAttr<Capitalize>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "cursorVisible" }))
	cursorVisible!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textSize" }))
	textSize!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "numeric" }))
	numeric!:CommandAttr<Numeric[]>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "digits" }))
	digits!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "password" }))
	password!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "phoneNumber" }))
	phoneNumber!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "inputType" }))
	inputType!:CommandAttr<InputType>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "imeOptions" }))
	imeOptions!:CommandAttr<ImeOptions>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "selectAllOnFocus" }))
	selectAllOnFocus_!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "selectAll" }))
	selectAll_!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "scrollHorizontally" }))
	scrollHorizontally!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "singleLine" }))
	singleLine!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onEditorAction" }))
	onEditorAction!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textColorHint" }))
	textColorHint!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "iosInputAccessoryViewDoneButton" }))
	iosInputAccessoryViewDoneButton!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onFocusChange" }))
	onFocusChange!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textColor" }))
	textColor!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onTextChange" }))
	onTextChange!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onbeforeTextChange" }))
	onbeforeTextChange!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onafterTextChange" }))
	onafterTextChange!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "iosBorderStyle" }))
	iosBorderStyle!:CommandAttr<IosBorderStyle>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "hintTextFormat" }))
	hintTextFormat!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textAllCaps" }))
	textAllCaps!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "iosInputView" }))
	iosInputView!:CommandAttr<InputView>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "setFocus" }))
	setFocus!:CommandAttr<boolean>| undefined;

	@decorate(Exclude())
	protected thisPointer: T;	
	protected abstract getThisPointer(): T;
	reset() : T {	
		super.reset();
		this.iosText = undefined;
		this.iosPlaceholder = undefined;
		this.iosTextColor = undefined;
		this.iosAdjustsFontSizeToFitWidth = undefined;
		this.iosMinimumFontSize = undefined;
		this.iosIsEditing = undefined;
		this.iosClearsOnBeginEditing = undefined;
		this.iosClearsOnInsertion = undefined;
		this.iosAllowsEditingTextAttributes = undefined;
		this.iosBackground = undefined;
		this.iosDisabledBackground = undefined;
		this.padding = undefined;
		this.paddingBottom = undefined;
		this.paddingRight = undefined;
		this.paddingLeft = undefined;
		this.paddingStart = undefined;
		this.paddingEnd = undefined;
		this.paddingTop = undefined;
		this.paddingHorizontal = undefined;
		this.paddingVertical = undefined;
		this.drawableStart = undefined;
		this.drawableEnd = undefined;
		this.drawableTop = undefined;
		this.drawableBottom = undefined;
		this.drawablePadding = undefined;
		this.drawableTint = undefined;
		this.drawableTintMode = undefined;
		this.drawableIconSize = undefined;
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
		this.editable = undefined;
		this.maxLength = undefined;
		this.typeface = undefined;
		this.textStyle = undefined;
		this.fontFamily = undefined;
		this.enabled = undefined;
		this.textColorHighlight = undefined;
		this.firstBaselineToTopHeight = undefined;
		this.lastBaselineToBottomHeight = undefined;
		this.completionThreshold = undefined;
		this.completionHintView = undefined;
		this.completionHint = undefined;
		this.entries = undefined;
		this.dropDownHeight = undefined;
		this.dropDownHorizontalOffset = undefined;
		this.dropDownVerticalOffset = undefined;
		this.dropDownWidth = undefined;
		this.dropDownSelector = undefined;
		this.dropDownAnchor = undefined;
		this.listitem = undefined;
		this.onDismiss = undefined;
		this.showDropDown_ = undefined;
		this.text = undefined;
		this.gravity = undefined;
		this.autoText = undefined;
		this.capitalize = undefined;
		this.cursorVisible = undefined;
		this.textSize = undefined;
		this.numeric = undefined;
		this.digits = undefined;
		this.password = undefined;
		this.phoneNumber = undefined;
		this.inputType = undefined;
		this.imeOptions = undefined;
		this.selectAllOnFocus_ = undefined;
		this.selectAll_ = undefined;
		this.scrollHorizontally = undefined;
		this.singleLine = undefined;
		this.onEditorAction = undefined;
		this.textColorHint = undefined;
		this.iosInputAccessoryViewDoneButton = undefined;
		this.onFocusChange = undefined;
		this.textColor = undefined;
		this.onTextChange = undefined;
		this.onbeforeTextChange = undefined;
		this.onafterTextChange = undefined;
		this.iosBorderStyle = undefined;
		this.hintTextFormat = undefined;
		this.textAllCaps = undefined;
		this.iosInputView = undefined;
		this.setFocus = undefined;
		return this.thisPointer;
	}
	constructor(id: string, path: string[], event:  string) {
		super(id, path, event);
		this.thisPointer = this.getThisPointer();
	}
	

	public tryGetIosText() : T {
		this.resetIfRequired();
		if (this.iosText == null || this.iosText == undefined) {
			this.iosText = new CommandAttr<string>()
		}
		
		this.iosText.setGetter(true);
		this.orderGet++;
		this.iosText.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getIosText() : string {
		if (this.iosText == null || this.iosText == undefined) {
			this.iosText = new CommandAttr<string>();
		}
		return this.iosText.getCommandReturnValue();
	}
	public setIosText(value : string) : T {
		this.resetIfRequired();
		if (this.iosText == null || this.iosText == undefined) {
			this.iosText = new CommandAttr<string>();
		}
		
		this.iosText.setSetter(true);
		this.iosText.setValue(value);
		this.orderSet++;
		this.iosText.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetIosPlaceholder() : T {
		this.resetIfRequired();
		if (this.iosPlaceholder == null || this.iosPlaceholder == undefined) {
			this.iosPlaceholder = new CommandAttr<string>()
		}
		
		this.iosPlaceholder.setGetter(true);
		this.orderGet++;
		this.iosPlaceholder.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getIosPlaceholder() : string {
		if (this.iosPlaceholder == null || this.iosPlaceholder == undefined) {
			this.iosPlaceholder = new CommandAttr<string>();
		}
		return this.iosPlaceholder.getCommandReturnValue();
	}
	public setIosPlaceholder(value : string) : T {
		this.resetIfRequired();
		if (this.iosPlaceholder == null || this.iosPlaceholder == undefined) {
			this.iosPlaceholder = new CommandAttr<string>();
		}
		
		this.iosPlaceholder.setSetter(true);
		this.iosPlaceholder.setValue(value);
		this.orderSet++;
		this.iosPlaceholder.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetHint() : T {
		this.resetIfRequired();
		if (this.iosPlaceholder == null || this.iosPlaceholder == undefined) {
			this.iosPlaceholder = new CommandAttr<string>()
		}
		
		this.iosPlaceholder.setGetter(true);
		this.orderGet++;
		this.iosPlaceholder.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getHint() : string {
		if (this.iosPlaceholder == null || this.iosPlaceholder == undefined) {
			this.iosPlaceholder = new CommandAttr<string>();
		}
		return this.iosPlaceholder.getCommandReturnValue();
	}
	public setHint(value : string) : T {
		this.resetIfRequired();
		if (this.iosPlaceholder == null || this.iosPlaceholder == undefined) {
			this.iosPlaceholder = new CommandAttr<string>();
		}
		
		this.iosPlaceholder.setSetter(true);
		this.iosPlaceholder.setValue(value);
		this.orderSet++;
		this.iosPlaceholder.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetIosTextColor() : T {
		this.resetIfRequired();
		if (this.iosTextColor == null || this.iosTextColor == undefined) {
			this.iosTextColor = new CommandAttr<string>()
		}
		
		this.iosTextColor.setGetter(true);
		this.orderGet++;
		this.iosTextColor.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getIosTextColor() : string {
		if (this.iosTextColor == null || this.iosTextColor == undefined) {
			this.iosTextColor = new CommandAttr<string>();
		}
		return this.iosTextColor.getCommandReturnValue();
	}
	public setIosTextColor(value : string) : T {
		this.resetIfRequired();
		if (this.iosTextColor == null || this.iosTextColor == undefined) {
			this.iosTextColor = new CommandAttr<string>();
		}
		
		this.iosTextColor.setSetter(true);
		this.iosTextColor.setValue(value);
		this.orderSet++;
		this.iosTextColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetIosAdjustsFontSizeToFitWidth() : T {
		this.resetIfRequired();
		if (this.iosAdjustsFontSizeToFitWidth == null || this.iosAdjustsFontSizeToFitWidth == undefined) {
			this.iosAdjustsFontSizeToFitWidth = new CommandAttr<boolean>()
		}
		
		this.iosAdjustsFontSizeToFitWidth.setGetter(true);
		this.orderGet++;
		this.iosAdjustsFontSizeToFitWidth.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isIosAdjustsFontSizeToFitWidth() : boolean {
		if (this.iosAdjustsFontSizeToFitWidth == null || this.iosAdjustsFontSizeToFitWidth == undefined) {
			this.iosAdjustsFontSizeToFitWidth = new CommandAttr<boolean>();
		}
		return this.iosAdjustsFontSizeToFitWidth.getCommandReturnValue();
	}
	public setIosAdjustsFontSizeToFitWidth(value : boolean) : T {
		this.resetIfRequired();
		if (this.iosAdjustsFontSizeToFitWidth == null || this.iosAdjustsFontSizeToFitWidth == undefined) {
			this.iosAdjustsFontSizeToFitWidth = new CommandAttr<boolean>();
		}
		
		this.iosAdjustsFontSizeToFitWidth.setSetter(true);
		this.iosAdjustsFontSizeToFitWidth.setValue(value);
		this.orderSet++;
		this.iosAdjustsFontSizeToFitWidth.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetIosMinimumFontSize() : T {
		this.resetIfRequired();
		if (this.iosMinimumFontSize == null || this.iosMinimumFontSize == undefined) {
			this.iosMinimumFontSize = new CommandAttr<number>()
		}
		
		this.iosMinimumFontSize.setGetter(true);
		this.orderGet++;
		this.iosMinimumFontSize.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getIosMinimumFontSize() : number {
		if (this.iosMinimumFontSize == null || this.iosMinimumFontSize == undefined) {
			this.iosMinimumFontSize = new CommandAttr<number>();
		}
		return this.iosMinimumFontSize.getCommandReturnValue();
	}
	public setIosMinimumFontSize(value : number) : T {
		this.resetIfRequired();
		if (this.iosMinimumFontSize == null || this.iosMinimumFontSize == undefined) {
			this.iosMinimumFontSize = new CommandAttr<number>();
		}
		
		this.iosMinimumFontSize.setSetter(true);
		this.iosMinimumFontSize.setValue(value);
		this.orderSet++;
		this.iosMinimumFontSize.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetIosIsEditing() : T {
		this.resetIfRequired();
		if (this.iosIsEditing == null || this.iosIsEditing == undefined) {
			this.iosIsEditing = new CommandAttr<boolean>()
		}
		
		this.iosIsEditing.setGetter(true);
		this.orderGet++;
		this.iosIsEditing.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isIosIsEditing() : boolean {
		if (this.iosIsEditing == null || this.iosIsEditing == undefined) {
			this.iosIsEditing = new CommandAttr<boolean>();
		}
		return this.iosIsEditing.getCommandReturnValue();
	}
	
		

	public tryGetIosClearsOnBeginEditing() : T {
		this.resetIfRequired();
		if (this.iosClearsOnBeginEditing == null || this.iosClearsOnBeginEditing == undefined) {
			this.iosClearsOnBeginEditing = new CommandAttr<boolean>()
		}
		
		this.iosClearsOnBeginEditing.setGetter(true);
		this.orderGet++;
		this.iosClearsOnBeginEditing.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isIosClearsOnBeginEditing() : boolean {
		if (this.iosClearsOnBeginEditing == null || this.iosClearsOnBeginEditing == undefined) {
			this.iosClearsOnBeginEditing = new CommandAttr<boolean>();
		}
		return this.iosClearsOnBeginEditing.getCommandReturnValue();
	}
	public setIosClearsOnBeginEditing(value : boolean) : T {
		this.resetIfRequired();
		if (this.iosClearsOnBeginEditing == null || this.iosClearsOnBeginEditing == undefined) {
			this.iosClearsOnBeginEditing = new CommandAttr<boolean>();
		}
		
		this.iosClearsOnBeginEditing.setSetter(true);
		this.iosClearsOnBeginEditing.setValue(value);
		this.orderSet++;
		this.iosClearsOnBeginEditing.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetIosClearsOnInsertion() : T {
		this.resetIfRequired();
		if (this.iosClearsOnInsertion == null || this.iosClearsOnInsertion == undefined) {
			this.iosClearsOnInsertion = new CommandAttr<boolean>()
		}
		
		this.iosClearsOnInsertion.setGetter(true);
		this.orderGet++;
		this.iosClearsOnInsertion.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isIosClearsOnInsertion() : boolean {
		if (this.iosClearsOnInsertion == null || this.iosClearsOnInsertion == undefined) {
			this.iosClearsOnInsertion = new CommandAttr<boolean>();
		}
		return this.iosClearsOnInsertion.getCommandReturnValue();
	}
	public setIosClearsOnInsertion(value : boolean) : T {
		this.resetIfRequired();
		if (this.iosClearsOnInsertion == null || this.iosClearsOnInsertion == undefined) {
			this.iosClearsOnInsertion = new CommandAttr<boolean>();
		}
		
		this.iosClearsOnInsertion.setSetter(true);
		this.iosClearsOnInsertion.setValue(value);
		this.orderSet++;
		this.iosClearsOnInsertion.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetIosAllowsEditingTextAttributes() : T {
		this.resetIfRequired();
		if (this.iosAllowsEditingTextAttributes == null || this.iosAllowsEditingTextAttributes == undefined) {
			this.iosAllowsEditingTextAttributes = new CommandAttr<boolean>()
		}
		
		this.iosAllowsEditingTextAttributes.setGetter(true);
		this.orderGet++;
		this.iosAllowsEditingTextAttributes.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isIosAllowsEditingTextAttributes() : boolean {
		if (this.iosAllowsEditingTextAttributes == null || this.iosAllowsEditingTextAttributes == undefined) {
			this.iosAllowsEditingTextAttributes = new CommandAttr<boolean>();
		}
		return this.iosAllowsEditingTextAttributes.getCommandReturnValue();
	}
	public setIosAllowsEditingTextAttributes(value : boolean) : T {
		this.resetIfRequired();
		if (this.iosAllowsEditingTextAttributes == null || this.iosAllowsEditingTextAttributes == undefined) {
			this.iosAllowsEditingTextAttributes = new CommandAttr<boolean>();
		}
		
		this.iosAllowsEditingTextAttributes.setSetter(true);
		this.iosAllowsEditingTextAttributes.setValue(value);
		this.orderSet++;
		this.iosAllowsEditingTextAttributes.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetIosBackground() : T {
		this.resetIfRequired();
		if (this.iosBackground == null || this.iosBackground == undefined) {
			this.iosBackground = new CommandAttr<string>()
		}
		
		this.iosBackground.setGetter(true);
		this.orderGet++;
		this.iosBackground.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getIosBackground() : string {
		if (this.iosBackground == null || this.iosBackground == undefined) {
			this.iosBackground = new CommandAttr<string>();
		}
		return this.iosBackground.getCommandReturnValue();
	}
	public setIosBackground(value : string) : T {
		this.resetIfRequired();
		if (this.iosBackground == null || this.iosBackground == undefined) {
			this.iosBackground = new CommandAttr<string>();
		}
		
		this.iosBackground.setSetter(true);
		this.iosBackground.setValue(value);
		this.orderSet++;
		this.iosBackground.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetIosDisabledBackground() : T {
		this.resetIfRequired();
		if (this.iosDisabledBackground == null || this.iosDisabledBackground == undefined) {
			this.iosDisabledBackground = new CommandAttr<string>()
		}
		
		this.iosDisabledBackground.setGetter(true);
		this.orderGet++;
		this.iosDisabledBackground.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getIosDisabledBackground() : string {
		if (this.iosDisabledBackground == null || this.iosDisabledBackground == undefined) {
			this.iosDisabledBackground = new CommandAttr<string>();
		}
		return this.iosDisabledBackground.getCommandReturnValue();
	}
	public setIosDisabledBackground(value : string) : T {
		this.resetIfRequired();
		if (this.iosDisabledBackground == null || this.iosDisabledBackground == undefined) {
			this.iosDisabledBackground = new CommandAttr<string>();
		}
		
		this.iosDisabledBackground.setSetter(true);
		this.iosDisabledBackground.setValue(value);
		this.orderSet++;
		this.iosDisabledBackground.setOrderSet(this.orderSet);
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
		

	public setDrawableTintMode(value : DrawableTintMode) : T {
		this.resetIfRequired();
		if (this.drawableTintMode == null || this.drawableTintMode == undefined) {
			this.drawableTintMode = new CommandAttr<DrawableTintMode>();
		}
		
		this.drawableTintMode.setSetter(true);
		this.drawableTintMode.setValue(value);
		this.orderSet++;
		this.drawableTintMode.setOrderSet(this.orderSet);
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
		

	public tryGetTextColorHighlight() : T {
		this.resetIfRequired();
		if (this.textColorHighlight == null || this.textColorHighlight == undefined) {
			this.textColorHighlight = new CommandAttr<string>()
		}
		
		this.textColorHighlight.setGetter(true);
		this.orderGet++;
		this.textColorHighlight.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getTextColorHighlight() : string {
		if (this.textColorHighlight == null || this.textColorHighlight == undefined) {
			this.textColorHighlight = new CommandAttr<string>();
		}
		return this.textColorHighlight.getCommandReturnValue();
	}
	public setTextColorHighlight(value : string) : T {
		this.resetIfRequired();
		if (this.textColorHighlight == null || this.textColorHighlight == undefined) {
			this.textColorHighlight = new CommandAttr<string>();
		}
		
		this.textColorHighlight.setSetter(true);
		this.textColorHighlight.setValue(value);
		this.orderSet++;
		this.textColorHighlight.setOrderSet(this.orderSet);
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
		

	public setCompletionThreshold(value : number) : T {
		this.resetIfRequired();
		if (this.completionThreshold == null || this.completionThreshold == undefined) {
			this.completionThreshold = new CommandAttr<number>();
		}
		
		this.completionThreshold.setSetter(true);
		this.completionThreshold.setValue(value);
		this.orderSet++;
		this.completionThreshold.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setCompletionHintView(value : string) : T {
		this.resetIfRequired();
		if (this.completionHintView == null || this.completionHintView == undefined) {
			this.completionHintView = new CommandAttr<string>();
		}
		
		this.completionHintView.setSetter(true);
		this.completionHintView.setValue(value);
		this.orderSet++;
		this.completionHintView.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetCompletionHint() : T {
		this.resetIfRequired();
		if (this.completionHint == null || this.completionHint == undefined) {
			this.completionHint = new CommandAttr<string>()
		}
		
		this.completionHint.setGetter(true);
		this.orderGet++;
		this.completionHint.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getCompletionHint() : string {
		if (this.completionHint == null || this.completionHint == undefined) {
			this.completionHint = new CommandAttr<string>();
		}
		return this.completionHint.getCommandReturnValue();
	}
	public setCompletionHint(value : string) : T {
		this.resetIfRequired();
		if (this.completionHint == null || this.completionHint == undefined) {
			this.completionHint = new CommandAttr<string>();
		}
		
		this.completionHint.setSetter(true);
		this.completionHint.setValue(value);
		this.orderSet++;
		this.completionHint.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setEntries(value : string) : T {
		this.resetIfRequired();
		if (this.entries == null || this.entries == undefined) {
			this.entries = new CommandAttr<string>();
		}
		
		this.entries.setSetter(true);
		this.entries.setValue(value);
		this.orderSet++;
		this.entries.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetDropDownHeight() : T {
		this.resetIfRequired();
		if (this.dropDownHeight == null || this.dropDownHeight == undefined) {
			this.dropDownHeight = new CommandAttr<string>()
		}
		
		this.dropDownHeight.setGetter(true);
		this.orderGet++;
		this.dropDownHeight.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getDropDownHeight() : string {
		if (this.dropDownHeight == null || this.dropDownHeight == undefined) {
			this.dropDownHeight = new CommandAttr<string>();
		}
		return this.dropDownHeight.getCommandReturnValue();
	}
	public setDropDownHeight(value : string) : T {
		this.resetIfRequired();
		if (this.dropDownHeight == null || this.dropDownHeight == undefined) {
			this.dropDownHeight = new CommandAttr<string>();
		}
		
		this.dropDownHeight.setSetter(true);
		this.dropDownHeight.setValue(value);
		this.orderSet++;
		this.dropDownHeight.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetDropDownHorizontalOffset() : T {
		this.resetIfRequired();
		if (this.dropDownHorizontalOffset == null || this.dropDownHorizontalOffset == undefined) {
			this.dropDownHorizontalOffset = new CommandAttr<string>()
		}
		
		this.dropDownHorizontalOffset.setGetter(true);
		this.orderGet++;
		this.dropDownHorizontalOffset.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getDropDownHorizontalOffset() : string {
		if (this.dropDownHorizontalOffset == null || this.dropDownHorizontalOffset == undefined) {
			this.dropDownHorizontalOffset = new CommandAttr<string>();
		}
		return this.dropDownHorizontalOffset.getCommandReturnValue();
	}
	public setDropDownHorizontalOffset(value : string) : T {
		this.resetIfRequired();
		if (this.dropDownHorizontalOffset == null || this.dropDownHorizontalOffset == undefined) {
			this.dropDownHorizontalOffset = new CommandAttr<string>();
		}
		
		this.dropDownHorizontalOffset.setSetter(true);
		this.dropDownHorizontalOffset.setValue(value);
		this.orderSet++;
		this.dropDownHorizontalOffset.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetDropDownVerticalOffset() : T {
		this.resetIfRequired();
		if (this.dropDownVerticalOffset == null || this.dropDownVerticalOffset == undefined) {
			this.dropDownVerticalOffset = new CommandAttr<string>()
		}
		
		this.dropDownVerticalOffset.setGetter(true);
		this.orderGet++;
		this.dropDownVerticalOffset.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getDropDownVerticalOffset() : string {
		if (this.dropDownVerticalOffset == null || this.dropDownVerticalOffset == undefined) {
			this.dropDownVerticalOffset = new CommandAttr<string>();
		}
		return this.dropDownVerticalOffset.getCommandReturnValue();
	}
	public setDropDownVerticalOffset(value : string) : T {
		this.resetIfRequired();
		if (this.dropDownVerticalOffset == null || this.dropDownVerticalOffset == undefined) {
			this.dropDownVerticalOffset = new CommandAttr<string>();
		}
		
		this.dropDownVerticalOffset.setSetter(true);
		this.dropDownVerticalOffset.setValue(value);
		this.orderSet++;
		this.dropDownVerticalOffset.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetDropDownWidth() : T {
		this.resetIfRequired();
		if (this.dropDownWidth == null || this.dropDownWidth == undefined) {
			this.dropDownWidth = new CommandAttr<string>()
		}
		
		this.dropDownWidth.setGetter(true);
		this.orderGet++;
		this.dropDownWidth.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getDropDownWidth() : string {
		if (this.dropDownWidth == null || this.dropDownWidth == undefined) {
			this.dropDownWidth = new CommandAttr<string>();
		}
		return this.dropDownWidth.getCommandReturnValue();
	}
	public setDropDownWidth(value : string) : T {
		this.resetIfRequired();
		if (this.dropDownWidth == null || this.dropDownWidth == undefined) {
			this.dropDownWidth = new CommandAttr<string>();
		}
		
		this.dropDownWidth.setSetter(true);
		this.dropDownWidth.setValue(value);
		this.orderSet++;
		this.dropDownWidth.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setDropDownSelector(value : string) : T {
		this.resetIfRequired();
		if (this.dropDownSelector == null || this.dropDownSelector == undefined) {
			this.dropDownSelector = new CommandAttr<string>();
		}
		
		this.dropDownSelector.setSetter(true);
		this.dropDownSelector.setValue(value);
		this.orderSet++;
		this.dropDownSelector.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetDropDownAnchor() : T {
		this.resetIfRequired();
		if (this.dropDownAnchor == null || this.dropDownAnchor == undefined) {
			this.dropDownAnchor = new CommandAttr<string>()
		}
		
		this.dropDownAnchor.setGetter(true);
		this.orderGet++;
		this.dropDownAnchor.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getDropDownAnchor() : string {
		if (this.dropDownAnchor == null || this.dropDownAnchor == undefined) {
			this.dropDownAnchor = new CommandAttr<string>();
		}
		return this.dropDownAnchor.getCommandReturnValue();
	}
	public setDropDownAnchor(value : string) : T {
		this.resetIfRequired();
		if (this.dropDownAnchor == null || this.dropDownAnchor == undefined) {
			this.dropDownAnchor = new CommandAttr<string>();
		}
		
		this.dropDownAnchor.setSetter(true);
		this.dropDownAnchor.setValue(value);
		this.orderSet++;
		this.dropDownAnchor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setListitem(value : string) : T {
		this.resetIfRequired();
		if (this.listitem == null || this.listitem == undefined) {
			this.listitem = new CommandAttr<string>();
		}
		
		this.listitem.setSetter(true);
		this.listitem.setValue(value);
		this.orderSet++;
		this.listitem.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnDismiss(value : string) : T {
		this.resetIfRequired();
		if (this.onDismiss == null || this.onDismiss == undefined) {
			this.onDismiss = new CommandAttr<string>();
		}
		
		this.onDismiss.setSetter(true);
		this.onDismiss.setValue(value);
		this.orderSet++;
		this.onDismiss.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public showDropDown(value : boolean) : T {
		this.resetIfRequired();
		if (this.showDropDown_ == null || this.showDropDown_ == undefined) {
			this.showDropDown_ = new CommandAttr<boolean>();
		}
		
		this.showDropDown_.setSetter(true);
		this.showDropDown_.setValue(value);
		this.orderSet++;
		this.showDropDown_.setOrderSet(this.orderSet);
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
		

	public setAutoText(value : boolean) : T {
		this.resetIfRequired();
		if (this.autoText == null || this.autoText == undefined) {
			this.autoText = new CommandAttr<boolean>();
		}
		
		this.autoText.setSetter(true);
		this.autoText.setValue(value);
		this.orderSet++;
		this.autoText.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setCapitalize(value : Capitalize) : T {
		this.resetIfRequired();
		if (this.capitalize == null || this.capitalize == undefined) {
			this.capitalize = new CommandAttr<Capitalize>();
		}
		
		this.capitalize.setSetter(true);
		this.capitalize.setValue(value);
		this.orderSet++;
		this.capitalize.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetCursorVisible() : T {
		this.resetIfRequired();
		if (this.cursorVisible == null || this.cursorVisible == undefined) {
			this.cursorVisible = new CommandAttr<boolean>()
		}
		
		this.cursorVisible.setGetter(true);
		this.orderGet++;
		this.cursorVisible.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isCursorVisible() : boolean {
		if (this.cursorVisible == null || this.cursorVisible == undefined) {
			this.cursorVisible = new CommandAttr<boolean>();
		}
		return this.cursorVisible.getCommandReturnValue();
	}
	public setCursorVisible(value : boolean) : T {
		this.resetIfRequired();
		if (this.cursorVisible == null || this.cursorVisible == undefined) {
			this.cursorVisible = new CommandAttr<boolean>();
		}
		
		this.cursorVisible.setSetter(true);
		this.cursorVisible.setValue(value);
		this.orderSet++;
		this.cursorVisible.setOrderSet(this.orderSet);
		return this.thisPointer;
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
		

	public setNumeric(...value : Numeric[]) : T {
		this.resetIfRequired();
		if (this.numeric == null || this.numeric == undefined) {
			this.numeric = new CommandAttr<Numeric[]>();
		}
		
		this.numeric.setSetter(true);
		this.numeric.setValue(value);
		this.orderSet++;
		this.numeric.setOrderSet(this.orderSet);
this.numeric.setTransformer('numeric');		return this.thisPointer;
	}
		

	public setDigits(value : string) : T {
		this.resetIfRequired();
		if (this.digits == null || this.digits == undefined) {
			this.digits = new CommandAttr<string>();
		}
		
		this.digits.setSetter(true);
		this.digits.setValue(value);
		this.orderSet++;
		this.digits.setOrderSet(this.orderSet);
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
		

	public setPhoneNumber(value : boolean) : T {
		this.resetIfRequired();
		if (this.phoneNumber == null || this.phoneNumber == undefined) {
			this.phoneNumber = new CommandAttr<boolean>();
		}
		
		this.phoneNumber.setSetter(true);
		this.phoneNumber.setValue(value);
		this.orderSet++;
		this.phoneNumber.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetInputType() : T {
		this.resetIfRequired();
		if (this.inputType == null || this.inputType == undefined) {
			this.inputType = new CommandAttr<InputType>()
		}
		
		this.inputType.setGetter(true);
		this.orderGet++;
		this.inputType.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getInputType() : InputType {
		if (this.inputType == null || this.inputType == undefined) {
			this.inputType = new CommandAttr<InputType>();
		}
		return this.inputType.getCommandReturnValue();
	}
	public setInputType(value : InputType) : T {
		this.resetIfRequired();
		if (this.inputType == null || this.inputType == undefined) {
			this.inputType = new CommandAttr<InputType>();
		}
		
		this.inputType.setSetter(true);
		this.inputType.setValue(value);
		this.orderSet++;
		this.inputType.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetImeOptions() : T {
		this.resetIfRequired();
		if (this.imeOptions == null || this.imeOptions == undefined) {
			this.imeOptions = new CommandAttr<ImeOptions>()
		}
		
		this.imeOptions.setGetter(true);
		this.orderGet++;
		this.imeOptions.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getImeOptions() : ImeOptions {
		if (this.imeOptions == null || this.imeOptions == undefined) {
			this.imeOptions = new CommandAttr<ImeOptions>();
		}
		return this.imeOptions.getCommandReturnValue();
	}
	public setImeOptions(value : ImeOptions) : T {
		this.resetIfRequired();
		if (this.imeOptions == null || this.imeOptions == undefined) {
			this.imeOptions = new CommandAttr<ImeOptions>();
		}
		
		this.imeOptions.setSetter(true);
		this.imeOptions.setValue(value);
		this.orderSet++;
		this.imeOptions.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public selectAllOnFocus(value : boolean) : T {
		this.resetIfRequired();
		if (this.selectAllOnFocus_ == null || this.selectAllOnFocus_ == undefined) {
			this.selectAllOnFocus_ = new CommandAttr<boolean>();
		}
		
		this.selectAllOnFocus_.setSetter(true);
		this.selectAllOnFocus_.setValue(value);
		this.orderSet++;
		this.selectAllOnFocus_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public selectAll(value : boolean) : T {
		this.resetIfRequired();
		if (this.selectAll_ == null || this.selectAll_ == undefined) {
			this.selectAll_ = new CommandAttr<boolean>();
		}
		
		this.selectAll_.setSetter(true);
		this.selectAll_.setValue(value);
		this.orderSet++;
		this.selectAll_.setOrderSet(this.orderSet);
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
		

	public setOnEditorAction(value : string) : T {
		this.resetIfRequired();
		if (this.onEditorAction == null || this.onEditorAction == undefined) {
			this.onEditorAction = new CommandAttr<string>();
		}
		
		this.onEditorAction.setSetter(true);
		this.onEditorAction.setValue(value);
		this.orderSet++;
		this.onEditorAction.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTextColorHint(value : string) : T {
		this.resetIfRequired();
		if (this.textColorHint == null || this.textColorHint == undefined) {
			this.textColorHint = new CommandAttr<string>();
		}
		
		this.textColorHint.setSetter(true);
		this.textColorHint.setValue(value);
		this.orderSet++;
		this.textColorHint.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setIosInputAccessoryViewDoneButton(value : string) : T {
		this.resetIfRequired();
		if (this.iosInputAccessoryViewDoneButton == null || this.iosInputAccessoryViewDoneButton == undefined) {
			this.iosInputAccessoryViewDoneButton = new CommandAttr<string>();
		}
		
		this.iosInputAccessoryViewDoneButton.setSetter(true);
		this.iosInputAccessoryViewDoneButton.setValue(value);
		this.orderSet++;
		this.iosInputAccessoryViewDoneButton.setOrderSet(this.orderSet);
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
		

	public tryGetOnTextChange() : T {
		this.resetIfRequired();
		if (this.onTextChange == null || this.onTextChange == undefined) {
			this.onTextChange = new CommandAttr<string>()
		}
		
		this.onTextChange.setGetter(true);
		this.orderGet++;
		this.onTextChange.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getOnTextChange() : string {
		if (this.onTextChange == null || this.onTextChange == undefined) {
			this.onTextChange = new CommandAttr<string>();
		}
		return this.onTextChange.getCommandReturnValue();
	}
	public setOnTextChange(value : string) : T {
		this.resetIfRequired();
		if (this.onTextChange == null || this.onTextChange == undefined) {
			this.onTextChange = new CommandAttr<string>();
		}
		
		this.onTextChange.setSetter(true);
		this.onTextChange.setValue(value);
		this.orderSet++;
		this.onTextChange.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnbeforeTextChange(value : string) : T {
		this.resetIfRequired();
		if (this.onbeforeTextChange == null || this.onbeforeTextChange == undefined) {
			this.onbeforeTextChange = new CommandAttr<string>();
		}
		
		this.onbeforeTextChange.setSetter(true);
		this.onbeforeTextChange.setValue(value);
		this.orderSet++;
		this.onbeforeTextChange.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnafterTextChange(value : string) : T {
		this.resetIfRequired();
		if (this.onafterTextChange == null || this.onafterTextChange == undefined) {
			this.onafterTextChange = new CommandAttr<string>();
		}
		
		this.onafterTextChange.setSetter(true);
		this.onafterTextChange.setValue(value);
		this.orderSet++;
		this.onafterTextChange.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setIosBorderStyle(value : IosBorderStyle) : T {
		this.resetIfRequired();
		if (this.iosBorderStyle == null || this.iosBorderStyle == undefined) {
			this.iosBorderStyle = new CommandAttr<IosBorderStyle>();
		}
		
		this.iosBorderStyle.setSetter(true);
		this.iosBorderStyle.setValue(value);
		this.orderSet++;
		this.iosBorderStyle.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setHintTextFormat(value : string) : T {
		this.resetIfRequired();
		if (this.hintTextFormat == null || this.hintTextFormat == undefined) {
			this.hintTextFormat = new CommandAttr<string>();
		}
		
		this.hintTextFormat.setSetter(true);
		this.hintTextFormat.setValue(value);
		this.orderSet++;
		this.hintTextFormat.setOrderSet(this.orderSet);
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
		

	public setIosInputView(value : InputView) : T {
		this.resetIfRequired();
		if (this.iosInputView == null || this.iosInputView == undefined) {
			this.iosInputView = new CommandAttr<InputView>();
		}
		
		this.iosInputView.setSetter(true);
		this.iosInputView.setValue(value);
		this.orderSet++;
		this.iosInputView.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setSetFocus(value : boolean) : T {
		this.resetIfRequired();
		if (this.setFocus == null || this.setFocus == undefined) {
			this.setFocus = new CommandAttr<boolean>();
		}
		
		this.setFocus.setSetter(true);
		this.setFocus.setValue(value);
		this.orderSet++;
		this.setFocus.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		
	//end - body

}
	
//start - staticinit

export class AutoCompleteTextView extends AutoCompleteTextViewImpl<AutoCompleteTextView> implements IWidget{
    getThisPointer(): AutoCompleteTextView {
        return this;
    }
    
   	public getClass() {
		return AutoCompleteTextView;
	}
	
   	constructor(id: string, path: string[], event: string) {
		super(id, path, event);	
	}
}

AutoCompleteTextViewImpl.initialize();
export interface OnDismissEvent extends Event{
        //:;


}

//end - staticinit
