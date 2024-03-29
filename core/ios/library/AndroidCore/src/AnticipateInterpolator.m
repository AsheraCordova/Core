//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\view\animation\AnticipateInterpolator.java
//

#include "AnticipateInterpolator.h"
#include "BaseInterpolator.h"
#include "J2ObjC_source.h"


@interface ADAnticipateInterpolator () {
 @public
  jfloat mTension_;
}

@end

@implementation ADAnticipateInterpolator

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADAnticipateInterpolator_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (instancetype)initWithFloat:(jfloat)tension {
  ADAnticipateInterpolator_initWithFloat_(self, tension);
  return self;
}

- (jfloat)getInterpolationWithFloat:(jfloat)t {
  return t * t * ((mTension_ + 1) * t - mTension_);
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
  static const J2ObjcClassInfo _ADAnticipateInterpolator = { "AnticipateInterpolator", "r.android.view.animation", ptrTable, methods, fields, 7, 0x1, 4, 1, -1, -1, -1, -1, -1 };
  return &_ADAnticipateInterpolator;
}

@end

void ADAnticipateInterpolator_init(ADAnticipateInterpolator *self) {
  ADBaseInterpolator_init(self);
  self->mTension_ = 2.0f;
}

ADAnticipateInterpolator *new_ADAnticipateInterpolator_init() {
  J2OBJC_NEW_IMPL(ADAnticipateInterpolator, init)
}

ADAnticipateInterpolator *create_ADAnticipateInterpolator_init() {
  J2OBJC_CREATE_IMPL(ADAnticipateInterpolator, init)
}

void ADAnticipateInterpolator_initWithFloat_(ADAnticipateInterpolator *self, jfloat tension) {
  ADBaseInterpolator_init(self);
  self->mTension_ = tension;
}

ADAnticipateInterpolator *new_ADAnticipateInterpolator_initWithFloat_(jfloat tension) {
  J2OBJC_NEW_IMPL(ADAnticipateInterpolator, initWithFloat_, tension)
}

ADAnticipateInterpolator *create_ADAnticipateInterpolator_initWithFloat_(jfloat tension) {
  J2OBJC_CREATE_IMPL(ADAnticipateInterpolator, initWithFloat_, tension)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADAnticipateInterpolator)
