#import <Cordova/CDVViewController.h>
#import "IActivity.h"
#import "GenericFragment.h"
#import "CordovaActivity.h"

@interface ASMainViewController : CDVViewController<ASIActivity>
    @property UINavigationController* navController;
    @property ASCordovaActivity* cordovaActivity;
@end
