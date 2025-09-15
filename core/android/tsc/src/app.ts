declare var coreManager :any;
declare var cordova :any;
import 'babel-polyfill';
import ErrorFragment from './ErrorFragment';
import FragmentFactory from './FragmentFactory';
import LocaleManager from './app/LocaleManager';

class App {
    private currentViewMap:Map<string, any> = new Map<string, any>();
    private errorFragment:ErrorFragment = new ErrorFragment();
    private fragmentFactory:FragmentFactory = new FragmentFactory(); 
	private localManager: LocaleManager = LocaleManager.getInstance();
    constructor() {
    }

    // Application Constructor
    initialize() {
        document.addEventListener('deviceready', this.onDeviceReady.bind(this), false);
    }

    // deviceready Event Handler
    //
    // Bind any cordova events here. Common events are:
    // 'pause', 'resume', etc.
    onDeviceReady() {
        document.addEventListener("action", this.onAction.bind(this), false);
        document.addEventListener("nativeevent", this.nativeEvent.bind(this), false);
		this.localManager.init(() => {
            coreManager.onDeviceReady();
        });
    }

     onAction(obj:any) {
        this.logEvent(obj);

        if (obj.event == 'onError') {
             this.errorFragment.display(obj.data);
        } else {
            var currentView = this.getCurrentView(obj);
            (currentView as any)[obj.event](obj);
        }
     }

	getCurrentView(obj:any) {
        var currentView = this.currentViewMap.get(obj.fragmentId);
        if (!currentView) {
            currentView = this.fragmentFactory.createNewInstance(obj.actionUrl,  obj.namespace);
            this.currentViewMap.set(obj.fragmentId, currentView);
        }

		return currentView;
	}

     nativeEvent(obj:any) {
        this.logEvent(obj);

        var currentView = this.getCurrentView(obj);
        
        if ((currentView as any)[obj.event]) {
            (currentView as any)[obj.event](obj);
        }

        if (obj.event == 'onDetach') {
            this.currentViewMap.delete(obj.fragmentId);
        }

        if (obj.javascript) {
            eval(obj.javascript);
        }
     }

    private logEvent(obj: any) {
        console.log(obj.event + " " + obj.actionUrl + " " + obj.fragmentId + " " + obj.namespace);
    }
}

var app = new App();

app.initialize();