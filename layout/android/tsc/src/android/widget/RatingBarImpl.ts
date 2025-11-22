// start - imports

	
import CommandAttr from '../../widget/CommandAttr';
import IWidget from '../../widget/IWidget';
import ILayoutParam from '../../widget/ILayoutParam';
import {plainToClass, Type, Exclude, Expose, Transform} from "class-transformer";
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
export abstract class RatingBarImpl<T> extends ViewImpl<T>{
	//start - body
	static initialize() {
    }	
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "isIndicator" }))
	isIndicator!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "numStars" }))
	numStars!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "rating" }))
	rating!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "stepSize" }))
	stepSize!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "progressTint" }))
	progressTint!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "progressBackgroundTint" }))
	progressBackgroundTint!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "secondaryProgressTint" }))
	secondaryProgressTint!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onRatingChanged" }))
	onRatingChanged!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "max" }))
	max!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "progressDrawable" }))
	progressDrawable!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "progressBackgroundDrawable" }))
	progressBackgroundDrawable!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "secondaryProgressDrawable" }))
	secondaryProgressDrawable!:CommandAttr<string>| undefined;

	@decorate(Exclude())
	protected thisPointer: T;	
	protected abstract getThisPointer(): T;
	reset() : T {	
		super.reset();
		this.isIndicator = undefined;
		this.numStars = undefined;
		this.rating = undefined;
		this.stepSize = undefined;
		this.progressTint = undefined;
		this.progressBackgroundTint = undefined;
		this.secondaryProgressTint = undefined;
		this.onRatingChanged = undefined;
		this.max = undefined;
		this.progressDrawable = undefined;
		this.progressBackgroundDrawable = undefined;
		this.secondaryProgressDrawable = undefined;
		return this.thisPointer;
	}
	constructor(id: string, path: string[], event:  string) {
		super(id, path, event);
		this.thisPointer = this.getThisPointer();
	}
	

	public setIsIndicator(value : boolean) : T {
		this.resetIfRequired();
		if (this.isIndicator == null || this.isIndicator == undefined) {
			this.isIndicator = new CommandAttr<boolean>();
		}
		
		this.isIndicator.setSetter(true);
		this.isIndicator.setValue(value);
		this.orderSet++;
		this.isIndicator.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setNumStars(value : number) : T {
		this.resetIfRequired();
		if (this.numStars == null || this.numStars == undefined) {
			this.numStars = new CommandAttr<number>();
		}
		
		this.numStars.setSetter(true);
		this.numStars.setValue(value);
		this.orderSet++;
		this.numStars.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetRating() : T {
		this.resetIfRequired();
		if (this.rating == null || this.rating == undefined) {
			this.rating = new CommandAttr<number>()
		}
		
		this.rating.setGetter(true);
		this.orderGet++;
		this.rating.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getRating() : number {
		if (this.rating == null || this.rating == undefined) {
			this.rating = new CommandAttr<number>();
		}
		return this.rating.getCommandReturnValue();
	}
	public setRating(value : number) : T {
		this.resetIfRequired();
		if (this.rating == null || this.rating == undefined) {
			this.rating = new CommandAttr<number>();
		}
		
		this.rating.setSetter(true);
		this.rating.setValue(value);
		this.orderSet++;
		this.rating.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setStepSize(value : number) : T {
		this.resetIfRequired();
		if (this.stepSize == null || this.stepSize == undefined) {
			this.stepSize = new CommandAttr<number>();
		}
		
		this.stepSize.setSetter(true);
		this.stepSize.setValue(value);
		this.orderSet++;
		this.stepSize.setOrderSet(this.orderSet);
		return this.thisPointer;
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
		

	public setSecondaryProgressTint(value : string) : T {
		this.resetIfRequired();
		if (this.secondaryProgressTint == null || this.secondaryProgressTint == undefined) {
			this.secondaryProgressTint = new CommandAttr<string>();
		}
		
		this.secondaryProgressTint.setSetter(true);
		this.secondaryProgressTint.setValue(value);
		this.orderSet++;
		this.secondaryProgressTint.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnRatingChanged(value : string) : T {
		this.resetIfRequired();
		if (this.onRatingChanged == null || this.onRatingChanged == undefined) {
			this.onRatingChanged = new CommandAttr<string>();
		}
		
		this.onRatingChanged.setSetter(true);
		this.onRatingChanged.setValue(value);
		this.orderSet++;
		this.onRatingChanged.setOrderSet(this.orderSet);
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
		

	public setProgressDrawable(value : string) : T {
		this.resetIfRequired();
		if (this.progressDrawable == null || this.progressDrawable == undefined) {
			this.progressDrawable = new CommandAttr<string>();
		}
		
		this.progressDrawable.setSetter(true);
		this.progressDrawable.setValue(value);
		this.orderSet++;
		this.progressDrawable.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setProgressBackgroundDrawable(value : string) : T {
		this.resetIfRequired();
		if (this.progressBackgroundDrawable == null || this.progressBackgroundDrawable == undefined) {
			this.progressBackgroundDrawable = new CommandAttr<string>();
		}
		
		this.progressBackgroundDrawable.setSetter(true);
		this.progressBackgroundDrawable.setValue(value);
		this.orderSet++;
		this.progressBackgroundDrawable.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setSecondaryProgressDrawable(value : string) : T {
		this.resetIfRequired();
		if (this.secondaryProgressDrawable == null || this.secondaryProgressDrawable == undefined) {
			this.secondaryProgressDrawable = new CommandAttr<string>();
		}
		
		this.secondaryProgressDrawable.setSetter(true);
		this.secondaryProgressDrawable.setValue(value);
		this.orderSet++;
		this.secondaryProgressDrawable.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		
	//end - body

}
	
//start - staticinit

export class RatingBar extends RatingBarImpl<RatingBar> implements IWidget{
    getThisPointer(): RatingBar {
        return this;
    }
    
   	public getClass() {
		return RatingBar;
	}
	
   	constructor(id: string, path: string[], event: string) {
		super(id, path, event);	
	}
}

RatingBarImpl.initialize();
export interface OnRatingChangedEvent extends Event{
        //ratingBar:RatingBar;

	        rating:number;
        fromUser:boolean;

}

//end - staticinit
