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



export class PopupWindowImpl_showAtLocation {
@decorate(Expose({ name: "x" }))
x!:string;
@decorate(Expose({ name: "y" }))
y!:string;
@decorate(Expose({ name: "gravity" }))
@decorate(Transform(({value, obj, type}) => TransformerFactory.getInstance().transform(value, obj, type, "gravity")))
gravity!:Gravity[];
}
export class PopupWindowImpl_showAsDropDown {
@decorate(Expose({ name: "anchor" }))
anchor!:string;
@decorate(Expose({ name: "xoff" }))
xoff!:string;
@decorate(Expose({ name: "yoff" }))
yoff!:string;
@decorate(Expose({ name: "gravity" }))
@decorate(Transform(({value, obj, type}) => TransformerFactory.getInstance().transform(value, obj, type, "gravity")))
gravity!:Gravity[];
}







// end - imports
import {ViewImpl} from './ViewImpl';
export abstract class PopupWindowImpl<T> extends ViewImpl<T>{
	//start - body
	static initialize() {
    }	
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "overlapAnchor" }))
	overlapAnchor!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "contentView" }))
	contentView!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "showAtLocation" }))
	showAtLocation_!:CommandAttr<PopupWindowImpl_showAtLocation>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "showAsDropDown" }))
	showAsDropDown_!:CommandAttr<PopupWindowImpl_showAsDropDown>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "dismiss" }))
	dismiss_!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onDismiss" }))
	onDismiss!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "height" }))
	height!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "width" }))
	width!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "outsideTouchable" }))
	outsideTouchable!:CommandAttr<boolean>| undefined;

	@decorate(Exclude())
	protected thisPointer: T;	
	protected abstract getThisPointer(): T;
	reset() : T {	
		super.reset();
		this.overlapAnchor = undefined;
		this.contentView = undefined;
		this.showAtLocation_ = undefined;
		this.showAsDropDown_ = undefined;
		this.dismiss_ = undefined;
		this.onDismiss = undefined;
		this.height = undefined;
		this.width = undefined;
		this.outsideTouchable = undefined;
		return this.thisPointer;
	}
	constructor(id: string, path: string[], event:  string) {
		super(id, path, event);
		this.thisPointer = this.getThisPointer();
	}
	

	public setOverlapAnchor(value : boolean) : T {
		this.resetIfRequired();
		if (this.overlapAnchor == null || this.overlapAnchor == undefined) {
			this.overlapAnchor = new CommandAttr<boolean>();
		}
		
		this.overlapAnchor.setSetter(true);
		this.overlapAnchor.setValue(value);
		this.orderSet++;
		this.overlapAnchor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setContentView(value : string) : T {
		this.resetIfRequired();
		if (this.contentView == null || this.contentView == undefined) {
			this.contentView = new CommandAttr<string>();
		}
		
		this.contentView.setSetter(true);
		this.contentView.setValue(value);
		this.orderSet++;
		this.contentView.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public showAtLocation(x : string,
y : string,
...gravity : Gravity[]) : T {
		this.resetIfRequired();
		if (this.showAtLocation_ == null || this.showAtLocation_ == undefined) {
			this.showAtLocation_ = new CommandAttr<PopupWindowImpl_showAtLocation>();
		}
		
		let wrapper:PopupWindowImpl_showAtLocation = new PopupWindowImpl_showAtLocation();
		wrapper.x = x;
		wrapper.y = y;
		wrapper.gravity = gravity;
		this.showAtLocation_.setSetter(true);
		this.showAtLocation_.setValue(wrapper);	
		this.orderSet++;
		this.showAtLocation_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public showAsDropDown(anchor : string,
xoff : string,
yoff : string,
...gravity : Gravity[]) : T {
		this.resetIfRequired();
		if (this.showAsDropDown_ == null || this.showAsDropDown_ == undefined) {
			this.showAsDropDown_ = new CommandAttr<PopupWindowImpl_showAsDropDown>();
		}
		
		let wrapper:PopupWindowImpl_showAsDropDown = new PopupWindowImpl_showAsDropDown();
		wrapper.anchor = anchor;
		wrapper.xoff = xoff;
		wrapper.yoff = yoff;
		wrapper.gravity = gravity;
		this.showAsDropDown_.setSetter(true);
		this.showAsDropDown_.setValue(wrapper);	
		this.orderSet++;
		this.showAsDropDown_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public dismiss(value : boolean) : T {
		this.resetIfRequired();
		if (this.dismiss_ == null || this.dismiss_ == undefined) {
			this.dismiss_ = new CommandAttr<boolean>();
		}
		
		this.dismiss_.setSetter(true);
		this.dismiss_.setValue(value);
		this.orderSet++;
		this.dismiss_.setOrderSet(this.orderSet);
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
		
	//end - body

}
	
//start - staticinit

export class PopupWindow extends PopupWindowImpl<PopupWindow> implements IWidget{
    getThisPointer(): PopupWindow {
        return this;
    }
    
   	public getClass() {
		return PopupWindow;
	}
	
   	constructor(id: string, path: string[], event: string) {
		super(id, path, event);	
	}
}

PopupWindowImpl.initialize();
export interface OnDismissEvent extends Event{
        //:;


}

//end - staticinit
