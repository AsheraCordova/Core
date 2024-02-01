//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\view\ViewParent.java
//

#include "J2ObjC_source.h"
#include "ViewParent.h"


@interface ADViewParent : NSObject

@end

@implementation ADViewParent

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "V", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 0, 1, -1, -1, -1, -1 },
    { NULL, "LADViewParent;", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 2, 3, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 4, 3, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 5, 3, -1, -1, -1, -1 },
    { NULL, "Z", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x401, 6, 7, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 8, 7, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 9, 3, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 10, 11, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 12, 13, -1, -1, -1, -1 },
    { NULL, "Z", 0x401, 14, 15, -1, -1, -1, -1 },
    { NULL, "Z", 0x401, 16, 17, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(requestLayout);
  methods[1].selector = @selector(isLayoutRequested);
  methods[2].selector = @selector(invalidateChildWithADView:withADRect:);
  methods[3].selector = @selector(getParent);
  methods[4].selector = @selector(recomputeViewAttributesWithADView:);
  methods[5].selector = @selector(focusableViewAvailableWithADView:);
  methods[6].selector = @selector(childDrawableStateChangedWithADView:);
  methods[7].selector = @selector(canResolveLayoutDirection);
  methods[8].selector = @selector(isLayoutDirectionResolved);
  methods[9].selector = @selector(getLayoutDirection);
  methods[10].selector = @selector(canResolveTextDirection);
  methods[11].selector = @selector(isTextDirectionResolved);
  methods[12].selector = @selector(getTextDirection);
  methods[13].selector = @selector(canResolveTextAlignment);
  methods[14].selector = @selector(isTextAlignmentResolved);
  methods[15].selector = @selector(getTextAlignment);
  methods[16].selector = @selector(onStartNestedScrollWithADView:withADView:withInt:);
  methods[17].selector = @selector(onNestedScrollAcceptedWithADView:withADView:withInt:);
  methods[18].selector = @selector(onStopNestedScrollWithADView:);
  methods[19].selector = @selector(onNestedScrollWithADView:withInt:withInt:withInt:withInt:);
  methods[20].selector = @selector(onNestedPreScrollWithADView:withInt:withInt:withIntArray:);
  methods[21].selector = @selector(onNestedFlingWithADView:withFloat:withFloat:withBoolean:);
  methods[22].selector = @selector(onNestedPreFlingWithADView:withFloat:withFloat:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "invalidateChild", "LADView;LADRect;", "recomputeViewAttributes", "LADView;", "focusableViewAvailable", "childDrawableStateChanged", "onStartNestedScroll", "LADView;LADView;I", "onNestedScrollAccepted", "onStopNestedScroll", "onNestedScroll", "LADView;IIII", "onNestedPreScroll", "LADView;II[I", "onNestedFling", "LADView;FFZ", "onNestedPreFling", "LADView;FF" };
  static const J2ObjcClassInfo _ADViewParent = { "ViewParent", "r.android.view", ptrTable, methods, NULL, 7, 0x609, 23, 0, -1, -1, -1, -1, -1 };
  return &_ADViewParent;
}

@end

J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ADViewParent)
