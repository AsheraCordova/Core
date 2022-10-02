//start - imports
#import <UIKit/UIKit.h>
#include <J2ObjC_header.h>
#include "IWidget.h"
#include "ILifeCycleDecorator.h"
#include "java/util/List.h"
#include "CGRectWrapper.h"
#import "INativeWidget.h"
#include "View.h"
//end - imports


@interface ASUITextField : UITextField<INativeWidget>
//start - body
@property(nonatomic, weak) id<ASIWidget> widget;
@property(nonatomic, retain) NSString* commandRegex;
//end - body
@property(nonatomic, strong) UIColor* placeHolderColor;
@end



