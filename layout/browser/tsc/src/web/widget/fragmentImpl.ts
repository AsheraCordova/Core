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






export class fragmentImpl_navigate {
@decorate(Expose({ name: "actionId" }))
actionId!:string;
@decorate(Expose({ name: "scopeObjects" }))
scopeObjects!:any;
}

export class fragmentImpl_navigateWithPopBackStack {
@decorate(Expose({ name: "actionId" }))
actionId!:string;
@decorate(Expose({ name: "scopeObjects" }))
scopeObjects!:any;
}
export class fragmentImpl_navigateAsTop {
@decorate(Expose({ name: "actionId" }))
actionId!:string;
@decorate(Expose({ name: "scopeObjects" }))
scopeObjects!:any;
}
export class fragmentImpl_navigateWithPopBackStackTo {
@decorate(Expose({ name: "actionId" }))
actionId!:string;
@decorate(Expose({ name: "destinationId" }))
destinationId!:string;
@decorate(Expose({ name: "inclusive" }))
inclusive!:boolean;
@decorate(Expose({ name: "scopeObjects" }))
scopeObjects!:any;
}
export class fragmentImpl_popBackStackTo {
@decorate(Expose({ name: "destinationId" }))
destinationId!:string;
@decorate(Expose({ name: "inclusive" }))
inclusive!:boolean;
}
import {ViewGroupImpl_LayoutParams} from './ViewGroupImpl';

// end - imports
import {ViewGroupImpl} from './ViewGroupImpl';
export abstract class fragmentImpl<T> extends ViewGroupImpl<T>{
	//start - body
	static initialize() {
    }	
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "name" }))
	name!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "layout" }))
	layout!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "navGraph" }))
	navGraph!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "tag" }))
	tag!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "replace" }))
	replace_!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "navigate" }))
	navigate_!:CommandAttr<fragmentImpl_navigate>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "popBackStack" }))
	popBackStack_!:CommandAttr<void>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "navigateWithPopBackStack" }))
	navigateWithPopBackStack_!:CommandAttr<fragmentImpl_navigateWithPopBackStack>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "navigateAsTop" }))
	navigateAsTop_!:CommandAttr<fragmentImpl_navigateAsTop>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "navigateWithPopBackStackTo" }))
	navigateWithPopBackStackTo_!:CommandAttr<fragmentImpl_navigateWithPopBackStackTo>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "popBackStackTo" }))
	popBackStackTo_!:CommandAttr<fragmentImpl_popBackStackTo>| undefined;

	@decorate(Exclude())
	protected thisPointer: T;	
	protected abstract getThisPointer(): T;
	reset() : T {	
		super.reset();
		this.name = undefined;
		this.layout = undefined;
		this.navGraph = undefined;
		this.tag = undefined;
		this.replace_ = undefined;
		this.navigate_ = undefined;
		this.popBackStack_ = undefined;
		this.navigateWithPopBackStack_ = undefined;
		this.navigateAsTop_ = undefined;
		this.navigateWithPopBackStackTo_ = undefined;
		this.popBackStackTo_ = undefined;
		return this.thisPointer;
	}
	constructor(id: string, path: string[], event:  string) {
		super(id, path, event);
		this.thisPointer = this.getThisPointer();
	}
	

	public setName(value : string) : T {
		this.resetIfRequired();
		if (this.name == null || this.name == undefined) {
			this.name = new CommandAttr<string>();
		}
		
		this.name.setSetter(true);
		this.name.setValue(value);
		this.orderSet++;
		this.name.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setLayout(value : string) : T {
		this.resetIfRequired();
		if (this.layout == null || this.layout == undefined) {
			this.layout = new CommandAttr<string>();
		}
		
		this.layout.setSetter(true);
		this.layout.setValue(value);
		this.orderSet++;
		this.layout.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setNavGraph(value : string) : T {
		this.resetIfRequired();
		if (this.navGraph == null || this.navGraph == undefined) {
			this.navGraph = new CommandAttr<string>();
		}
		
		this.navGraph.setSetter(true);
		this.navGraph.setValue(value);
		this.orderSet++;
		this.navGraph.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTag(value : string) : T {
		this.resetIfRequired();
		if (this.tag == null || this.tag == undefined) {
			this.tag = new CommandAttr<string>();
		}
		
		this.tag.setSetter(true);
		this.tag.setValue(value);
		this.orderSet++;
		this.tag.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public replace(value : string) : T {
		this.resetIfRequired();
		if (this.replace_ == null || this.replace_ == undefined) {
			this.replace_ = new CommandAttr<string>();
		}
		
		this.replace_.setSetter(true);
		this.replace_.setValue(value);
		this.orderSet++;
		this.replace_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public navigate(actionId : string,
scopeObjects : any) : T {
		this.resetIfRequired();
		if (this.navigate_ == null || this.navigate_ == undefined) {
			this.navigate_ = new CommandAttr<fragmentImpl_navigate>();
		}
		
		let wrapper:fragmentImpl_navigate = new fragmentImpl_navigate();
		wrapper.actionId = actionId;
		wrapper.scopeObjects = scopeObjects;
		this.navigate_.setSetter(true);
		this.navigate_.setValue(wrapper);	
		this.orderSet++;
		this.navigate_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public popBackStack() : T {
		this.resetIfRequired();
		if (this.popBackStack_ == null || this.popBackStack_ == undefined) {
			this.popBackStack_ = new CommandAttr<void>();
		}
		
		this.popBackStack_.setSetter(true);
		
		this.orderSet++;
		this.popBackStack_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public navigateWithPopBackStack(actionId : string,
scopeObjects : any) : T {
		this.resetIfRequired();
		if (this.navigateWithPopBackStack_ == null || this.navigateWithPopBackStack_ == undefined) {
			this.navigateWithPopBackStack_ = new CommandAttr<fragmentImpl_navigateWithPopBackStack>();
		}
		
		let wrapper:fragmentImpl_navigateWithPopBackStack = new fragmentImpl_navigateWithPopBackStack();
		wrapper.actionId = actionId;
		wrapper.scopeObjects = scopeObjects;
		this.navigateWithPopBackStack_.setSetter(true);
		this.navigateWithPopBackStack_.setValue(wrapper);	
		this.orderSet++;
		this.navigateWithPopBackStack_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public navigateAsTop(actionId : string,
scopeObjects : any) : T {
		this.resetIfRequired();
		if (this.navigateAsTop_ == null || this.navigateAsTop_ == undefined) {
			this.navigateAsTop_ = new CommandAttr<fragmentImpl_navigateAsTop>();
		}
		
		let wrapper:fragmentImpl_navigateAsTop = new fragmentImpl_navigateAsTop();
		wrapper.actionId = actionId;
		wrapper.scopeObjects = scopeObjects;
		this.navigateAsTop_.setSetter(true);
		this.navigateAsTop_.setValue(wrapper);	
		this.orderSet++;
		this.navigateAsTop_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public navigateWithPopBackStackTo(actionId : string,
destinationId : string,
inclusive : boolean,
scopeObjects : any) : T {
		this.resetIfRequired();
		if (this.navigateWithPopBackStackTo_ == null || this.navigateWithPopBackStackTo_ == undefined) {
			this.navigateWithPopBackStackTo_ = new CommandAttr<fragmentImpl_navigateWithPopBackStackTo>();
		}
		
		let wrapper:fragmentImpl_navigateWithPopBackStackTo = new fragmentImpl_navigateWithPopBackStackTo();
		wrapper.actionId = actionId;
		wrapper.destinationId = destinationId;
		wrapper.inclusive = inclusive;
		wrapper.scopeObjects = scopeObjects;
		this.navigateWithPopBackStackTo_.setSetter(true);
		this.navigateWithPopBackStackTo_.setValue(wrapper);	
		this.orderSet++;
		this.navigateWithPopBackStackTo_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public popBackStackTo(destinationId : string,
inclusive : boolean) : T {
		this.resetIfRequired();
		if (this.popBackStackTo_ == null || this.popBackStackTo_ == undefined) {
			this.popBackStackTo_ = new CommandAttr<fragmentImpl_popBackStackTo>();
		}
		
		let wrapper:fragmentImpl_popBackStackTo = new fragmentImpl_popBackStackTo();
		wrapper.destinationId = destinationId;
		wrapper.inclusive = inclusive;
		this.popBackStackTo_.setSetter(true);
		this.popBackStackTo_.setValue(wrapper);	
		this.orderSet++;
		this.popBackStackTo_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		
	//end - body

}
	
//start - staticinit

export class fragment extends fragmentImpl<fragment> implements IWidget{
    getThisPointer(): fragment {
        return this;
    }
    
   	public getClass() {
		return fragment;
	}
	
   	constructor(id: string, path: string[], event: string) {
		super(id, path, event);	
	}
}

fragmentImpl.initialize();

//end - staticinit
