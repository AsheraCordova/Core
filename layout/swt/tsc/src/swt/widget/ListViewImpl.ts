// start - imports

export const enum ChoiceMode {
multipleChoice = "multipleChoice",
multipleChoiceModal = "multipleChoiceModal",
none = "none",
singleChoice = "singleChoice",
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



















// end - imports
import {ViewGroupImpl} from './ViewGroupImpl'
export abstract class ListViewImpl<T> extends ViewGroupImpl<T> {
	//start - body
	static initialize() {
    }	
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onItemClick" }))
	onItemClick!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "listheader" }))
	listheader!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "listfooter" }))
	listfooter!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "divider" }))
	divider!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "dividerHeight" }))
	dividerHeight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "footerDividersEnabled" }))
	footerDividersEnabled!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "headerDividersEnabled" }))
	headerDividersEnabled!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onItemLongClick" }))
	onItemLongClick!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onScrollChange" }))
	onScrollChange!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "stackFromBottom" }))
	stackFromBottom!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "choiceMode" }))
	choiceMode!:CommandAttr<ChoiceMode>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "listSelector" }))
	listSelector!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "filter" }))
	filter_!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "filterDelay" }))
	filterDelay!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "filterId" }))
	filterId!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "filterItemPath" }))
	filterItemPath!:CommandAttr<string>| undefined;

	@decorate(Exclude())
	protected thisPointer: T;	
	protected abstract getThisPointer(): T;
	reset() : T {	
		super.reset();
		this.onItemClick = undefined;
		this.listheader = undefined;
		this.listfooter = undefined;
		this.divider = undefined;
		this.dividerHeight = undefined;
		this.footerDividersEnabled = undefined;
		this.headerDividersEnabled = undefined;
		this.onItemLongClick = undefined;
		this.onScrollChange = undefined;
		this.stackFromBottom = undefined;
		this.choiceMode = undefined;
		this.listSelector = undefined;
		this.filter_ = undefined;
		this.filterDelay = undefined;
		this.filterId = undefined;
		this.filterItemPath = undefined;
		return this.thisPointer;
	}
	constructor(id: string, path: string[], event:  string) {
		super(id, path, event);
		this.thisPointer = this.getThisPointer();
	}
	

	public setOnItemClick(value : string) : T {
		this.resetIfRequired();
		if (this.onItemClick == null || this.onItemClick == undefined) {
			this.onItemClick = new CommandAttr<string>();
		}
		
		this.onItemClick.setSetter(true);
		this.onItemClick.setValue(value);
		this.orderSet++;
		this.onItemClick.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setListheader(value : string) : T {
		this.resetIfRequired();
		if (this.listheader == null || this.listheader == undefined) {
			this.listheader = new CommandAttr<string>();
		}
		
		this.listheader.setSetter(true);
		this.listheader.setValue(value);
		this.orderSet++;
		this.listheader.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setListfooter(value : string) : T {
		this.resetIfRequired();
		if (this.listfooter == null || this.listfooter == undefined) {
			this.listfooter = new CommandAttr<string>();
		}
		
		this.listfooter.setSetter(true);
		this.listfooter.setValue(value);
		this.orderSet++;
		this.listfooter.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetDivider() : T {
		this.resetIfRequired();
		if (this.divider == null || this.divider == undefined) {
			this.divider = new CommandAttr<string>()
		}
		
		this.divider.setGetter(true);
		this.orderGet++;
		this.divider.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getDivider() : string {
		if (this.divider == null || this.divider == undefined) {
			this.divider = new CommandAttr<string>();
		}
		return this.divider.getCommandReturnValue();
	}
	public setDivider(value : string) : T {
		this.resetIfRequired();
		if (this.divider == null || this.divider == undefined) {
			this.divider = new CommandAttr<string>();
		}
		
		this.divider.setSetter(true);
		this.divider.setValue(value);
		this.orderSet++;
		this.divider.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetDividerHeight() : T {
		this.resetIfRequired();
		if (this.dividerHeight == null || this.dividerHeight == undefined) {
			this.dividerHeight = new CommandAttr<string>()
		}
		
		this.dividerHeight.setGetter(true);
		this.orderGet++;
		this.dividerHeight.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getDividerHeight() : string {
		if (this.dividerHeight == null || this.dividerHeight == undefined) {
			this.dividerHeight = new CommandAttr<string>();
		}
		return this.dividerHeight.getCommandReturnValue();
	}
	public setDividerHeight(value : string) : T {
		this.resetIfRequired();
		if (this.dividerHeight == null || this.dividerHeight == undefined) {
			this.dividerHeight = new CommandAttr<string>();
		}
		
		this.dividerHeight.setSetter(true);
		this.dividerHeight.setValue(value);
		this.orderSet++;
		this.dividerHeight.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setFooterDividersEnabled(value : boolean) : T {
		this.resetIfRequired();
		if (this.footerDividersEnabled == null || this.footerDividersEnabled == undefined) {
			this.footerDividersEnabled = new CommandAttr<boolean>();
		}
		
		this.footerDividersEnabled.setSetter(true);
		this.footerDividersEnabled.setValue(value);
		this.orderSet++;
		this.footerDividersEnabled.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setHeaderDividersEnabled(value : boolean) : T {
		this.resetIfRequired();
		if (this.headerDividersEnabled == null || this.headerDividersEnabled == undefined) {
			this.headerDividersEnabled = new CommandAttr<boolean>();
		}
		
		this.headerDividersEnabled.setSetter(true);
		this.headerDividersEnabled.setValue(value);
		this.orderSet++;
		this.headerDividersEnabled.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnItemLongClick(value : string) : T {
		this.resetIfRequired();
		if (this.onItemLongClick == null || this.onItemLongClick == undefined) {
			this.onItemLongClick = new CommandAttr<string>();
		}
		
		this.onItemLongClick.setSetter(true);
		this.onItemLongClick.setValue(value);
		this.orderSet++;
		this.onItemLongClick.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnScrollChange(value : string) : T {
		this.resetIfRequired();
		if (this.onScrollChange == null || this.onScrollChange == undefined) {
			this.onScrollChange = new CommandAttr<string>();
		}
		
		this.onScrollChange.setSetter(true);
		this.onScrollChange.setValue(value);
		this.orderSet++;
		this.onScrollChange.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetStackFromBottom() : T {
		this.resetIfRequired();
		if (this.stackFromBottom == null || this.stackFromBottom == undefined) {
			this.stackFromBottom = new CommandAttr<boolean>()
		}
		
		this.stackFromBottom.setGetter(true);
		this.orderGet++;
		this.stackFromBottom.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isStackFromBottom() : boolean {
		if (this.stackFromBottom == null || this.stackFromBottom == undefined) {
			this.stackFromBottom = new CommandAttr<boolean>();
		}
		return this.stackFromBottom.getCommandReturnValue();
	}
	public setStackFromBottom(value : boolean) : T {
		this.resetIfRequired();
		if (this.stackFromBottom == null || this.stackFromBottom == undefined) {
			this.stackFromBottom = new CommandAttr<boolean>();
		}
		
		this.stackFromBottom.setSetter(true);
		this.stackFromBottom.setValue(value);
		this.orderSet++;
		this.stackFromBottom.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetChoiceMode() : T {
		this.resetIfRequired();
		if (this.choiceMode == null || this.choiceMode == undefined) {
			this.choiceMode = new CommandAttr<ChoiceMode>()
		}
		
		this.choiceMode.setGetter(true);
		this.orderGet++;
		this.choiceMode.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getChoiceMode() : ChoiceMode {
		if (this.choiceMode == null || this.choiceMode == undefined) {
			this.choiceMode = new CommandAttr<ChoiceMode>();
		}
		return this.choiceMode.getCommandReturnValue();
	}
	public setChoiceMode(value : ChoiceMode) : T {
		this.resetIfRequired();
		if (this.choiceMode == null || this.choiceMode == undefined) {
			this.choiceMode = new CommandAttr<ChoiceMode>();
		}
		
		this.choiceMode.setSetter(true);
		this.choiceMode.setValue(value);
		this.orderSet++;
		this.choiceMode.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetListSelector() : T {
		this.resetIfRequired();
		if (this.listSelector == null || this.listSelector == undefined) {
			this.listSelector = new CommandAttr<string>()
		}
		
		this.listSelector.setGetter(true);
		this.orderGet++;
		this.listSelector.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getListSelector() : string {
		if (this.listSelector == null || this.listSelector == undefined) {
			this.listSelector = new CommandAttr<string>();
		}
		return this.listSelector.getCommandReturnValue();
	}
	public setListSelector(value : string) : T {
		this.resetIfRequired();
		if (this.listSelector == null || this.listSelector == undefined) {
			this.listSelector = new CommandAttr<string>();
		}
		
		this.listSelector.setSetter(true);
		this.listSelector.setValue(value);
		this.orderSet++;
		this.listSelector.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public filter(value : string) : T {
		this.resetIfRequired();
		if (this.filter_ == null || this.filter_ == undefined) {
			this.filter_ = new CommandAttr<string>();
		}
		
		this.filter_.setSetter(true);
		this.filter_.setValue(value);
		this.orderSet++;
		this.filter_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setFilterDelay(value : number) : T {
		this.resetIfRequired();
		if (this.filterDelay == null || this.filterDelay == undefined) {
			this.filterDelay = new CommandAttr<number>();
		}
		
		this.filterDelay.setSetter(true);
		this.filterDelay.setValue(value);
		this.orderSet++;
		this.filterDelay.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setFilterId(value : string) : T {
		this.resetIfRequired();
		if (this.filterId == null || this.filterId == undefined) {
			this.filterId = new CommandAttr<string>();
		}
		
		this.filterId.setSetter(true);
		this.filterId.setValue(value);
		this.orderSet++;
		this.filterId.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setFilterItemPath(value : string) : T {
		this.resetIfRequired();
		if (this.filterItemPath == null || this.filterItemPath == undefined) {
			this.filterItemPath = new CommandAttr<string>();
		}
		
		this.filterItemPath.setSetter(true);
		this.filterItemPath.setValue(value);
		this.orderSet++;
		this.filterItemPath.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		
	//end - body

}
//start - staticinit

export class ListView extends ListViewImpl<ListView> implements IWidget{
    getThisPointer(): ListView {
        return this;
    }
    
   	public getClass() {
		return ListView;
	}
	
   	constructor(id: string, path: string[], event: string) {
		super(id, path, event);	
	}
}

ListViewImpl.initialize();

//end - staticinit
