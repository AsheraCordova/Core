//start - imports
#import <UIKit/UIKit.h>
#include <J2ObjC_header.h>
#include "IWidget.h"
#include "ILifeCycleDecorator.h"
#include "java/util/List.h"
#include "CGRectWrapper.h"
#import "INativeWidget.h"
#include "View.h"
#include "IFragment.h"
#include "EventBus.h"
//end - imports

@interface ASUIScrollView : UIScrollView<INativeWidget, UIGestureRecognizerDelegate>

//start - body
@property(nonatomic, weak) id<ASIWidget> widget;
@property(nonatomic, retain) NSString* commandRegex;
//end - body

@property (assign, nonatomic) BOOL preventAutoScroll;
@property (assign, nonatomic) BOOL infiniteScroll;
@property (assign, nonatomic) BOOL shouldRecognizeSimultaneouslyWithGestureRecognizer;
@end



