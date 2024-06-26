// start - imports

	
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



















// end - imports
import {ViewImpl} from './ViewImpl';
export abstract class ProgressBarImpl<T> extends ViewImpl<T>{
	//start - body
	static initialize() {
    }	
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "padding" }))
	padding!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingTop" }))
	paddingTop!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingBottom" }))
	paddingBottom!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingLeft" }))
	paddingLeft!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingRight" }))
	paddingRight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingStart" }))
	paddingStart!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingEnd" }))
	paddingEnd!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingHorizontal" }))
	paddingHorizontal!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingVertical" }))
	paddingVertical!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "min" }))
	min!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "max" }))
	max!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "progress" }))
	progress!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "incrementProgressBy" }))
	incrementProgressBy_!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "progressTint" }))
	progressTint!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "progressBackgroundTint" }))
	progressBackgroundTint!:CommandAttr<string>| undefined;

	@decorate(Exclude())
	protected thisPointer: T;	
	protected abstract getThisPointer(): T;
	reset() : T {	
		super.reset();
		this.padding = undefined;
		this.paddingTop = undefined;
		this.paddingBottom = undefined;
		this.paddingLeft = undefined;
		this.paddingRight = undefined;
		this.paddingStart = undefined;
		this.paddingEnd = undefined;
		this.paddingHorizontal = undefined;
		this.paddingVertical = undefined;
		this.min = undefined;
		this.max = undefined;
		this.progress = undefined;
		this.incrementProgressBy_ = undefined;
		this.progressTint = undefined;
		this.progressBackgroundTint = undefined;
		return this.thisPointer;
	}
	constructor(id: string, path: string[], event:  string) {
		super(id, path, event);
		this.thisPointer = this.getThisPointer();
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
		

	public setMin(value : number) : T {
		this.resetIfRequired();
		if (this.min == null || this.min == undefined) {
			this.min = new CommandAttr<number>();
		}
		
		this.min.setSetter(true);
		this.min.setValue(value);
		this.orderSet++;
		this.min.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setMax(value : number) : T {
		this.resetIfRequired();
		if (this.max == null || this.max == undefined) {
			this.max = new CommandAttr<number>();
		}
		
		this.max.setSetter(true);
		this.max.setValue(value);
		this.orderSet++;
		this.max.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setProgress(value : number) : T {
		this.resetIfRequired();
		if (this.progress == null || this.progress == undefined) {
			this.progress = new CommandAttr<number>();
		}
		
		this.progress.setSetter(true);
		this.progress.setValue(value);
		this.orderSet++;
		this.progress.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public incrementProgressBy(value : number) : T {
		this.resetIfRequired();
		if (this.incrementProgressBy_ == null || this.incrementProgressBy_ == undefined) {
			this.incrementProgressBy_ = new CommandAttr<number>();
		}
		
		this.incrementProgressBy_.setSetter(true);
		this.incrementProgressBy_.setValue(value);
		this.orderSet++;
		this.incrementProgressBy_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetProgressTint() : T {
		this.resetIfRequired();
		if (this.progressTint == null || this.progressTint == undefined) {
			this.progressTint = new CommandAttr<string>()
		}
		
		this.progressTint.setGetter(true);
		this.orderGet++;
		this.progressTint.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getProgressTint() : string {
		if (this.progressTint == null || this.progressTint == undefined) {
			this.progressTint = new CommandAttr<string>();
		}
		return this.progressTint.getCommandReturnValue();
	}
	public setProgressTint(value : string) : T {
		this.resetIfRequired();
		if (this.progressTint == null || this.progressTint == undefined) {
			this.progressTint = new CommandAttr<string>();
		}
		
		this.progressTint.setSetter(true);
		this.progressTint.setValue(value);
		this.orderSet++;
		this.progressTint.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetProgressBackgroundTint() : T {
		this.resetIfRequired();
		if (this.progressBackgroundTint == null || this.progressBackgroundTint == undefined) {
			this.progressBackgroundTint = new CommandAttr<string>()
		}
		
		this.progressBackgroundTint.setGetter(true);
		this.orderGet++;
		this.progressBackgroundTint.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getProgressBackgroundTint() : string {
		if (this.progressBackgroundTint == null || this.progressBackgroundTint == undefined) {
			this.progressBackgroundTint = new CommandAttr<string>();
		}
		return this.progressBackgroundTint.getCommandReturnValue();
	}
	public setProgressBackgroundTint(value : string) : T {
		this.resetIfRequired();
		if (this.progressBackgroundTint == null || this.progressBackgroundTint == undefined) {
			this.progressBackgroundTint = new CommandAttr<string>();
		}
		
		this.progressBackgroundTint.setSetter(true);
		this.progressBackgroundTint.setValue(value);
		this.orderSet++;
		this.progressBackgroundTint.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		
	//end - body

}
	
//start - staticinit

export class ProgressBar extends ProgressBarImpl<ProgressBar> implements IWidget{
    getThisPointer(): ProgressBar {
        return this;
    }
    
   	public getClass() {
		return ProgressBar;
	}
	
   	constructor(id: string, path: string[], event: string) {
		super(id, path, event);	
	}
}

ProgressBarImpl.initialize();

//end - staticinit
