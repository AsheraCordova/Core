//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroidX-core\src\main\java\androidx\core\view\WindowInsetsCompat.java
//

#include "J2ObjC_source.h"
#include "WindowInsetsCompat.h"


@implementation ADXWindowInsetsCompat

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADXWindowInsetsCompat_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (jint)getSystemWindowInsetTop {
  return 0;
}

- (jint)getSystemWindowInsetBottom {
  return 0;
}

- (jint)getSystemWindowInsetLeft {
  return 0;
}

- (jint)getSystemWindowInsetRight {
  return 0;
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x1, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(getSystemWindowInsetTop);
  methods[2].selector = @selector(getSystemWindowInsetBottom);
  methods[3].selector = @selector(getSystemWindowInsetLeft);
  methods[4].selector = @selector(getSystemWindowInsetRight);
  #pragma clang diagnostic pop
  static const J2ObjcClassInfo _ADXWindowInsetsCompat = { "WindowInsetsCompat", "androidx.core.view", NULL, methods, NULL, 7, 0x1, 5, 0, -1, -1, -1, -1, -1 };
  return &_ADXWindowInsetsCompat;
}

@end

void ADXWindowInsetsCompat_init(ADXWindowInsetsCompat *self) {
  NSObject_init(self);
}

ADXWindowInsetsCompat *new_ADXWindowInsetsCompat_init() {
  J2OBJC_NEW_IMPL(ADXWindowInsetsCompat, init)
}

ADXWindowInsetsCompat *create_ADXWindowInsetsCompat_init() {
  J2OBJC_CREATE_IMPL(ADXWindowInsetsCompat, init)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADXWindowInsetsCompat)
