//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\stub\r\android\app\ActivityManager.java
//

#include "ActivityManager.h"
#include "Context.h"
#include "J2ObjC_source.h"
#include "PluginInvoker.h"


@interface ADActivityManager () {
 @public
  ADContext *context_;
}

@end

J2OBJC_FIELD_SETTER(ADActivityManager, context_, ADContext *)

@implementation ADActivityManager

- (instancetype)initWithADContext:(ADContext *)context {
  ADActivityManager_initWithADContext_(self, context);
  return self;
}

- (jint)getMemoryClass {
  return ASPluginInvoker_getMaxMemoryWithId_(context_);
}

- (void)dealloc {
  RELEASE_(context_);
  [super dealloc];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, 0, -1, -1, -1, -1 },
    { NULL, "I", 0x1, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(initWithADContext:);
  methods[1].selector = @selector(getMemoryClass);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "context_", "LADContext;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "LADContext;" };
  static const J2ObjcClassInfo _ADActivityManager = { "ActivityManager", "r.android.app", ptrTable, methods, fields, 7, 0x1, 2, 1, -1, -1, -1, -1, -1 };
  return &_ADActivityManager;
}

@end

void ADActivityManager_initWithADContext_(ADActivityManager *self, ADContext *context) {
  NSObject_init(self);
  JreStrongAssign(&self->context_, context);
}

ADActivityManager *new_ADActivityManager_initWithADContext_(ADContext *context) {
  J2OBJC_NEW_IMPL(ADActivityManager, initWithADContext_, context)
}

ADActivityManager *create_ADActivityManager_initWithADContext_(ADContext *context) {
  J2OBJC_CREATE_IMPL(ADActivityManager, initWithADContext_, context)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADActivityManager)
