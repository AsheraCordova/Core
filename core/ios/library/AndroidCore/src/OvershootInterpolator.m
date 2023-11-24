//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\view\animation\OvershootInterpolator.java
//

#include "BaseInterpolator.h"
#include "J2ObjC_source.h"
#include "OvershootInterpolator.h"


@interface ADOvershootInterpolator () {
 @public
  jfloat mTension_;
}

@end

@implementation ADOvershootInterpolator

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADOvershootInterpolator_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (instancetype)initWithFloat:(jfloat)tension {
  ADOvershootInterpolator_initWithFloat_(self, tension);
  return self;
}

- (jfloat)getInterpolationWithFloat:(jfloat)t {
  JreMinusAssignFloatF(&t, 1.0f);
  return t * t * ((mTension_ + 1) * t + mTension_) + 1.0f;
}

- (jlong)createNativeInterpolator {
  return 0;
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, NULL, 0x1, -1, 0, -1, -1, -1, -1 },
    { NULL, "F", 0x1, 1, 0, -1, -1, -1, -1 },
    { NULL, "J", 0x1, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(initWithFloat:);
  methods[2].selector = @selector(getInterpolationWithFloat:);
  methods[3].selector = @selector(createNativeInterpolator);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "mTension_", "F", .constantValue.asLong = 0, 0x12, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "F", "getInterpolation" };
  static const J2ObjcClassInfo _ADOvershootInterpolator = { "OvershootInterpolator", "r.android.view.animation", ptrTable, methods, fields, 7, 0x1, 4, 1, -1, -1, -1, -1, -1 };
  return &_ADOvershootInterpolator;
}

@end

void ADOvershootInterpolator_init(ADOvershootInterpolator *self) {
  ADBaseInterpolator_init(self);
  self->mTension_ = 2.0f;
}

ADOvershootInterpolator *new_ADOvershootInterpolator_init() {
  J2OBJC_NEW_IMPL(ADOvershootInterpolator, init)
}

ADOvershootInterpolator *create_ADOvershootInterpolator_init() {
  J2OBJC_CREATE_IMPL(ADOvershootInterpolator, init)
}

void ADOvershootInterpolator_initWithFloat_(ADOvershootInterpolator *self, jfloat tension) {
  ADBaseInterpolator_init(self);
  self->mTension_ = tension;
}

ADOvershootInterpolator *new_ADOvershootInterpolator_initWithFloat_(jfloat tension) {
  J2OBJC_NEW_IMPL(ADOvershootInterpolator, initWithFloat_, tension)
}

ADOvershootInterpolator *create_ADOvershootInterpolator_initWithFloat_(jfloat tension) {
  J2OBJC_CREATE_IMPL(ADOvershootInterpolator, initWithFloat_, tension)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADOvershootInterpolator)
