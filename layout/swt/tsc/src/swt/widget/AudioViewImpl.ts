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
export abstract class AudioViewImpl<T> extends ViewImpl<T>{
	//start - body
	static initialize() {
    }	
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onPrepared" }))
	onPrepared!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onCompletion" }))
	onCompletion!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onError" }))
	onError!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "seekTo" }))
	seekTo_!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "start" }))
	start_!:CommandAttr<void>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "pause" }))
	pause_!:CommandAttr<void>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "dataSource" }))
	dataSource!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "attributeUnderTest" }))
	attributeUnderTest!:CommandAttr<string>| undefined;

	@decorate(Exclude())
	protected thisPointer: T;	
	protected abstract getThisPointer(): T;
	reset() : T {	
		super.reset();
		this.onPrepared = undefined;
		this.onCompletion = undefined;
		this.onError = undefined;
		this.seekTo_ = undefined;
		this.start_ = undefined;
		this.pause_ = undefined;
		this.dataSource = undefined;
		this.attributeUnderTest = undefined;
		return this.thisPointer;
	}
	constructor(id: string, path: string[], event:  string) {
		super(id, path, event);
		this.thisPointer = this.getThisPointer();
	}
	

	public setOnPrepared(value : string) : T {
		this.resetIfRequired();
		if (this.onPrepared == null || this.onPrepared == undefined) {
			this.onPrepared = new CommandAttr<string>();
		}
		
		this.onPrepared.setSetter(true);
		this.onPrepared.setValue(value);
		this.orderSet++;
		this.onPrepared.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnCompletion(value : string) : T {
		this.resetIfRequired();
		if (this.onCompletion == null || this.onCompletion == undefined) {
			this.onCompletion = new CommandAttr<string>();
		}
		
		this.onCompletion.setSetter(true);
		this.onCompletion.setValue(value);
		this.orderSet++;
		this.onCompletion.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnError(value : string) : T {
		this.resetIfRequired();
		if (this.onError == null || this.onError == undefined) {
			this.onError = new CommandAttr<string>();
		}
		
		this.onError.setSetter(true);
		this.onError.setValue(value);
		this.orderSet++;
		this.onError.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public seekTo(value : number) : T {
		this.resetIfRequired();
		if (this.seekTo_ == null || this.seekTo_ == undefined) {
			this.seekTo_ = new CommandAttr<number>();
		}
		
		this.seekTo_.setSetter(true);
		this.seekTo_.setValue(value);
		this.orderSet++;
		this.seekTo_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public start() : T {
		this.resetIfRequired();
		if (this.start_ == null || this.start_ == undefined) {
			this.start_ = new CommandAttr<void>();
		}
		
		this.start_.setSetter(true);
		
		this.orderSet++;
		this.start_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public pause() : T {
		this.resetIfRequired();
		if (this.pause_ == null || this.pause_ == undefined) {
			this.pause_ = new CommandAttr<void>();
		}
		
		this.pause_.setSetter(true);
		
		this.orderSet++;
		this.pause_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setDataSource(value : string) : T {
		this.resetIfRequired();
		if (this.dataSource == null || this.dataSource == undefined) {
			this.dataSource = new CommandAttr<string>();
		}
		
		this.dataSource.setSetter(true);
		this.dataSource.setValue(value);
		this.orderSet++;
		this.dataSource.setOrderSet(this.orderSet);
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
		
	//end - body

}
	
//start - staticinit

export class AudioView extends AudioViewImpl<AudioView> implements IWidget{
    getThisPointer(): AudioView {
        return this;
    }
    
   	public getClass() {
		return AudioView;
	}
	
   	constructor(id: string, path: string[], event: string) {
		super(id, path, event);	
	}
}

AudioViewImpl.initialize();
export interface OnPreparedEvent extends Event{
        //mp:MediaPlayer;


}
export interface OnCompletionEvent extends Event{
        //mp:MediaPlayer;


}
export interface OnErrorEvent extends Event{
        //mp:MediaPlayer;

	        what:number;
	        extra:number;

}

//end - staticinit
