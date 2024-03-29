//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\view\animation\CycleInterpolator.java
//

#include "BaseInterpolator.h"
#include "CycleInterpolator.h"
#include "J2ObjC_source.h"
#include "java/lang/Math.h"


@interface ADCycleInterpolator () {
 @public
  jfloat mCycles_;
}

@end

@implementation ADCycleInterpolator

- (instancetype)initWithFloat:(jfloat)cycles {
  ADCycleInterpolator_initWithFloat_(self, cycles);
  return self;
}

- (jfloat)getInterpolationWithFloat:(jfloat)input {
  return (jfloat) (JavaLangMath_sinWithDouble_(2 * mCycles_ * JavaLangMath_PI * input));
}

- (jlong)createNativeInterpolator {
  return 0;
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, 0, -1, -1, -1, -1 },
    { NULL, "F", 0x1, 1, 0, -1, -1, -1, -1 },
    { NULL, "J", 0x1, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(initWithFloat:);
  methods[1].selector = @selector(getInterpolationWithFloat:);
  methods[2].selector = @selector(createNativeInterpolator);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "mCycles_", "F", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "F", "getInterpolation" };
  static const J2ObjcClassInfo _ADCycleInterpolator = { "CycleInterpolator", "r.android.view.animation", ptrTable, methods, fields, 7, 0x1, 3, 1, -1, -1, -1, -1, -1 };
  return &_ADCycleInterpolator;
}

@end

void ADCycleInterpolator_initWithFloat_(ADCycleInterpolator *self, jfloat cycles) {
  ADBaseInterpolator_init(self);
  self->mCycles_ = cycles;
}

ADCycleInterpolator *new_ADCycleInterpolator_initWithFloat_(jfloat cycles) {
  J2OBJC_NEW_IMPL(ADCycleInterpolator, initWithFloat_, cycles)
}

ADCycleInterpolator *create_ADCycleInterpolator_initWithFloat_(jfloat cycles) {
  J2OBJC_CREATE_IMPL(ADCycleInterpolator, initWithFloat_, cycles)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADCycleInterpolator)
