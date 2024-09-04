//start - import
//end - import

import { Fragment, Inject } from './app/Fragment';
import { NavController, InjectController } from './navigation/NavController';
import { ScopedObject } from './app/ScopedObject';
export default class Index extends Fragment{
	//start - body
	//end - body
    constructor() {
        super();
    }
    
    public onCreate(obj:any) {
    	alert("If you receive this  alert, you are good to write your first program");
    }
}