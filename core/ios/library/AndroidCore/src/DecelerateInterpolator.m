//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\view\animation\DecelerateInterpolator.java
//

#include "BaseInterpolator.h"
#include "DecelerateInterpolator.h"
#include "J2ObjC_source.h"
#include "java/lang/Math.h"


@interface ADDecelerateInterpolator () {
 @public
  jfloat mFactor_;
}

@end

@implementation ADDecelerateInterpolator

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADDecelerateInterpolator_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (instancetype)initWithFloat:(jfloat)factor {
  ADDecelerateInterpolator_initWithFloat_(self, factor);
  return self;
}

- (jfloat)getInterpolationWithFloat:(jfloat)input {
  jfloat result;
  if (mFactor_ == 1.0f) {
    result = (jfloat) (1.0f - (1.0f - input) * (1.0f - input));
  }
  else {
    result = (jfloat) (1.0f - JavaLangMath_powWithDouble_withDouble_((1.0f - input), 2 * mFactor_));
  }
  return result;
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
    { "mFactor_", "F", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "F", "getInterpolation" };
  static const J2ObjcClassInfo _ADDecelerateInterpolator = { "DecelerateInterpolator", "r.android.view.animation", ptrTable, methods, fields, 7, 0x1, 4, 1, -1, -1, -1, -1, -1 };
  return &_ADDecelerateInterpolator;
}

@end

void ADDecelerateInterpolator_init(ADDecelerateInterpolator *self) {
  ADBaseInterpolator_init(self);
  self->mFactor_ = 1.0f;
}

ADDecelerateInterpolator *new_ADDecelerateInterpolator_init() {
  J2OBJC_NEW_IMPL(ADDecelerateInterpolator, init)
}

ADDecelerateInterpolator *create_ADDecelerateInterpolator_init() {
  J2OBJC_CREATE_IMPL(ADDecelerateInterpolator, init)
}

void ADDecelerateInterpolator_initWithFloat_(ADDecelerateInterpolator *self, jfloat factor) {
  ADBaseInterpolator_init(self);
  self->mFactor_ = 1.0f;
  self->mFactor_ = factor;
}

ADDecelerateInterpolator *new_ADDecelerateInterpolator_initWithFloat_(jfloat factor) {
  J2OBJC_NEW_IMPL(ADDecelerateInterpolator, initWithFloat_, factor)
}

ADDecelerateInterpolator *create_ADDecelerateInterpolator_initWithFloat_(jfloat factor) {
  J2OBJC_CREATE_IMPL(ADDecelerateInterpolator, initWithFloat_, factor)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADDecelerateInterpolator)
