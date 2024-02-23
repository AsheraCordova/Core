//start - import
import {Fragment} from './app/Fragment';

//end - import
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