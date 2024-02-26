//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroidX-core\src\main\java\androidx\interpolator\view\animation\LookupTableInterpolator.java
//

#include "IOSPrimitiveArray.h"
#include "J2ObjC_source.h"
#include "LookupTableInterpolator.h"
#include "java/lang/Math.h"


@interface ADXLookupTableInterpolator () {
 @public
  IOSFloatArray *mValues_;
  jfloat mStepSize_;
}

@end

J2OBJC_FIELD_SETTER(ADXLookupTableInterpolator, mValues_, IOSFloatArray *)

@implementation ADXLookupTableInterpolator

- (instancetype)initPackagePrivateWithFloatArray:(IOSFloatArray *)values {
  ADXLookupTableInterpolator_initPackagePrivateWithFloatArray_(self, values);
  return self;
}

- (jfloat)getInterpolationWithFloat:(jfloat)input {
  if (input >= 1.0f) {
    return 1.0f;
  }
  if (input <= 0.0f) {
    return 0.0f;
  }
  jint position = JavaLangMath_minWithInt_withInt_(JreFpToInt((input * (((IOSFloatArray *) nil_chk(mValues_))->size_ - 1))), mValues_->size_ - 2);
  jfloat quantized = position * mStepSize_;
  jfloat diff = input - quantized;
  jfloat weight = diff / mStepSize_;
  return IOSFloatArray_Get(mValues_, position) + weight * (IOSFloatArray_Get(mValues_, position + 1) - IOSFloatArray_Get(mValues_, position));
}

- (void)dealloc {
  RELEASE_(mValues_);
  [super dealloc];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x4, -1, 0, -1, -1, -1, -1 },
    { NULL, "F", 0x1, 1, 2, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(initPackagePrivateWithFloatArray:);
  methods[1].selector = @selector(getInterpolationWithFloat:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "mValues_", "[F", .constantValue.asLong = 0, 0x12, -1, -1, -1, -1 },
    { "mStepSize_", "F", .constantValue.asLong = 0, 0x12, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "[F", "getInterpolation", "F" };
  static const J2ObjcClassInfo _ADXLookupTableInterpolator = { "LookupTableInterpolator", "androidx.interpolator.view.animation", ptrTable, methods, fields, 7, 0x400, 2, 2, -1, -1, -1, -1, -1 };
  return &_ADXLookupTableInterpolator;
}

@end

void ADXLookupTableInterpolator_initPackagePrivateWithFloatArray_(ADXLookupTableInterpolator *self, IOSFloatArray *values) {
  NSObject_init(self);
  JreStrongAssign(&self->mValues_, values);
  self->mStepSize_ = 1.0f / (((IOSFloatArray *) nil_chk(self->mValues_))->size_ - 1);
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADXLookupTableInterpolator)