//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\stub\r\android\app\ActivityThread.java
//

#include "ActivityThread.h"
#include "Application.h"
#include "J2ObjC_source.h"


@implementation ADActivityThread

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADActivityThread_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

+ (ADApplication *)currentApplication {
  return ADActivityThread_currentApplication();
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LADApplication;", 0x9, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(currentApplication);
  #pragma clang diagnostic pop
  static const J2ObjcClassInfo _ADActivityThread = { "ActivityThread", "r.android.app", NULL, methods, NULL, 7, 0x1, 2, 0, -1, -1, -1, -1, -1 };
  return &_ADActivityThread;
}

@end

void ADActivityThread_init(ADActivityThread *self) {
  NSObject_init(self);
}

ADActivityThread *new_ADActivityThread_init() {
  J2OBJC_NEW_IMPL(ADActivityThread, init)
}

ADActivityThread *create_ADActivityThread_init() {
  J2OBJC_CREATE_IMPL(ADActivityThread, init)
}

ADApplication *ADActivityThread_currentApplication() {
  ADActivityThread_initialize();
  return nil;
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADActivityThread)
