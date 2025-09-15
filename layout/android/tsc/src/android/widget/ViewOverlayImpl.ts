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
export abstract class ViewOverlayImpl<T> extends ViewImpl<T>{
	//start - body
	static initialize() {
    }	
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "anchorRef" }))
	anchorRef!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "boundsType" }))
	boundsType!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "drawable" }))
	drawable!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "offsetVertical" }))
	offsetVertical!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "offsetHorizontal" }))
	offsetHorizontal!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "drawableWidth" }))
	drawableWidth!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "drawableHeight" }))
	drawableHeight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "boundsConverter" }))
	boundsConverter!:CommandAttr<string>| undefined;

	@decorate(Exclude())
	protected thisPointer: T;	
	protected abstract getThisPointer(): T;
	reset() : T {	
		super.reset();
		this.anchorRef = undefined;
		this.boundsType = undefined;
		this.drawable = undefined;
		this.offsetVertical = undefined;
		this.offsetHorizontal = undefined;
		this.drawableWidth = undefined;
		this.drawableHeight = undefined;
		this.boundsConverter = undefined;
		return this.thisPointer;
	}
	constructor(id: string, path: string[], event:  string) {
		super(id, path, event);
		this.thisPointer = this.getThisPointer();
	}
	

	public setAnchorRef(value : string) : T {
		this.resetIfRequired();
		if (this.anchorRef == null || this.anchorRef == undefined) {
			this.anchorRef = new CommandAttr<string>();
		}
		
		this.anchorRef.setSetter(true);
		this.anchorRef.setValue(value);
		this.orderSet++;
		this.anchorRef.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setBoundsType(value : string) : T {
		this.resetIfRequired();
		if (this.boundsType == null || this.boundsType == undefined) {
			this.boundsType = new CommandAttr<string>();
		}
		
		this.boundsType.setSetter(true);
		this.boundsType.setValue(value);
		this.orderSet++;
		this.boundsType.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setDrawable(value : string) : T {
		this.resetIfRequired();
		if (this.drawable == null || this.drawable == undefined) {
			this.drawable = new CommandAttr<string>();
		}
		
		this.drawable.setSetter(true);
		this.drawable.setValue(value);
		this.orderSet++;
		this.drawable.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOffsetVertical(value : string) : T {
		this.resetIfRequired();
		if (this.offsetVertical == null || this.offsetVertical == undefined) {
			this.offsetVertical = new CommandAttr<string>();
		}
		
		this.offsetVertical.setSetter(true);
		this.offsetVertical.setValue(value);
		this.orderSet++;
		this.offsetVertical.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOffsetHorizontal(value : string) : T {
		this.resetIfRequired();
		if (this.offsetHorizontal == null || this.offsetHorizontal == undefined) {
			this.offsetHorizontal = new CommandAttr<string>();
		}
		
		this.offsetHorizontal.setSetter(true);
		this.offsetHorizontal.setValue(value);
		this.orderSet++;
		this.offsetHorizontal.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setDrawableWidth(value : string) : T {
		this.resetIfRequired();
		if (this.drawableWidth == null || this.drawableWidth == undefined) {
			this.drawableWidth = new CommandAttr<string>();
		}
		
		this.drawableWidth.setSetter(true);
		this.drawableWidth.setValue(value);
		this.orderSet++;
		this.drawableWidth.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setDrawableHeight(value : string) : T {
		this.resetIfRequired();
		if (this.drawableHeight == null || this.drawableHeight == undefined) {
			this.drawableHeight = new CommandAttr<string>();
		}
		
		this.drawableHeight.setSetter(true);
		this.drawableHeight.setValue(value);
		this.orderSet++;
		this.drawableHeight.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setBoundsConverter(value : string) : T {
		this.resetIfRequired();
		if (this.boundsConverter == null || this.boundsConverter == undefined) {
			this.boundsConverter = new CommandAttr<string>();
		}
		
		this.boundsConverter.setSetter(true);
		this.boundsConverter.setValue(value);
		this.orderSet++;
		this.boundsConverter.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		
	//end - body

}
	
//start - staticinit

export class ViewOverlay extends ViewOverlayImpl<ViewOverlay> implements IWidget{
    getThisPointer(): ViewOverlay {
        return this;
    }
    
   	public getClass() {
		return ViewOverlay;
	}
	
   	constructor(id: string, path: string[], event: string) {
		super(id, path, event);	
	}
}

ViewOverlayImpl.initialize();

//end - staticinit
