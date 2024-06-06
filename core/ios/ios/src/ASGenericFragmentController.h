#import <UIKit/UIKit.h>
#import "IActivity.h"
#import "GenericFragment.h"
#include "CordovaActivity.h"

@interface ASGenericFragmentController : UIViewController
    @property ASGenericFragment* rootFragment;
	@property (assign, nonatomic) BOOL remeasure_;
    @property ASCordovaActivity* cordovaActivity;
    - (void)remeasure;
    - (void)dismiss;
@end

