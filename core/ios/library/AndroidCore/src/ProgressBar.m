//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\widget\ProgressBar.java
//

#include "BaseMeasurableView.h"
#include "Context.h"
#include "IWidget.h"
#include "J2ObjC_source.h"
#include "LinearLayout.h"
#include "ProgressBar.h"


@implementation ADProgressBar

- (instancetype)initWithASIWidget:(id<ASIWidget>)widget {
  ADProgressBar_initWithASIWidget_(self, widget);
  return self;
}

- (instancetype)initWithADContext:(ADContext *)context {
  ADProgressBar_initWithADContext_(self, context);
  return self;
}

- (void)setLayoutParamsWithADLinearLayout_LayoutParams:(ADLinearLayout_LayoutParams *)barLayoutParams {
}

- (jint)nativeMeasureWidthWithId:(id)uiView {
  return 0;
}

- (jint)nativeMeasureHeightWithId:(id)uiView
                          withInt:(jint)width {
  return 0;
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, 0, -1, -1, -1, -1 },
    { NULL, NULL, 0x1, -1, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 2, 3, -1, -1, -1, -1 },
    { NULL, "I", 0x1, 4, 5, -1, -1, -1, -1 },
    { NULL, "I", 0x1, 6, 7, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(initWithASIWidget:);
  methods[1].selector = @selector(initWithADContext:);
  methods[2].selector = @selector(setLayoutParamsWithADLinearLayout_LayoutParams:);
  methods[3].selector = @selector(nativeMeasureWidthWithId:);
  methods[4].selector = @selector(nativeMeasureHeightWithId:withInt:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "LASIWidget;", "LADContext;", "setLayoutParams", "LADLinearLayout_LayoutParams;", "nativeMeasureWidth", "LNSObject;", "nativeMeasureHeight", "LNSObject;I" };
  static const J2ObjcClassInfo _ADProgressBar = { "ProgressBar", "r.android.widget", ptrTable, methods, NULL, 7, 0x1, 5, 0, -1, -1, -1, -1, -1 };
  return &_ADProgressBar;
}

@end

void ADProgressBar_initWithASIWidget_(ADProgressBar *self, id<ASIWidget> widget) {
  ASBaseMeasurableView_initWithASIWidget_(self, widget);
}

ADProgressBar *new_ADProgressBar_initWithASIWidget_(id<ASIWidget> widget) {
  J2OBJC_NEW_IMPL(ADProgressBar, initWithASIWidget_, widget)
}

ADProgressBar *create_ADProgressBar_initWithASIWidget_(id<ASIWidget> widget) {
  J2OBJC_CREATE_IMPL(ADProgressBar, initWithASIWidget_, widget)
}

void ADProgressBar_initWithADContext_(ADProgressBar *self, ADContext *context) {
  ASBaseMeasurableView_initWithASIWidget_(self, nil);
}

ADProgressBar *new_ADProgressBar_initWithADContext_(ADContext *context) {
  J2OBJC_NEW_IMPL(ADProgressBar, initWithADContext_, context)
}

ADProgressBar *create_ADProgressBar_initWithADContext_(ADContext *context) {
  J2OBJC_CREATE_IMPL(ADProgressBar, initWithADContext_, context)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADProgressBar)
