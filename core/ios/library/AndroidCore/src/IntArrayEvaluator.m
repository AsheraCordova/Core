//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\animation\IntArrayEvaluator.java
//

#include "IOSPrimitiveArray.h"
#include "IntArrayEvaluator.h"
#include "J2ObjC_source.h"


@interface ADIntArrayEvaluator () {
 @public
  IOSIntArray *mArray_;
}

@end

J2OBJC_FIELD_SETTER(ADIntArrayEvaluator, mArray_, IOSIntArray *)

@implementation ADIntArrayEvaluator

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADIntArrayEvaluator_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (instancetype)initWithIntArray:(IOSIntArray *)reuseArray {
  ADIntArrayEvaluator_initWithIntArray_(self, reuseArray);
  return self;
}

- (IOSIntArray *)evaluateWithFloat:(jfloat)fraction
                            withId:(IOSIntArray *)startValue
                            withId:(IOSIntArray *)endValue {
  IOSIntArray *array = mArray_;
  if (array == nil) {
    array = [IOSIntArray arrayWithLength:((IOSIntArray *) nil_chk(startValue))->size_];
  }
  for (jint i = 0; i < array->size_; i++) {
    jint start = IOSIntArray_Get(nil_chk(startValue), i);
    jint end = IOSIntArray_Get(nil_chk(endValue), i);
    *IOSIntArray_GetRef(array, i) = JreFpToInt((start + (fraction * (end - start))));
  }
  return array;
}

- (void)dealloc {
  RELEASE_(mArray_);
  [super dealloc];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, NULL, 0x1, -1, 0, -1, -1, -1, -1 },
    { NULL, "[I", 0x1, 1, 2, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(initWithIntArray:);
  methods[2].selector = @selector(evaluateWithFloat:withId:withId:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "mArray_", "[I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "[I", "evaluate", "F[I[I", "Ljava/lang/Object;Lr/android/animation/TypeEvaluator<[I>;" };
  static const J2ObjcClassInfo _ADIntArrayEvaluator = { "IntArrayEvaluator", "r.android.animation", ptrTable, methods, fields, 7, 0x1, 3, 1, -1, -1, -1, 3, -1 };
  return &_ADIntArrayEvaluator;
}

@end

void ADIntArrayEvaluator_init(ADIntArrayEvaluator *self) {
  NSObject_init(self);
}

ADIntArrayEvaluator *new_ADIntArrayEvaluator_init() {
  J2OBJC_NEW_IMPL(ADIntArrayEvaluator, init)
}

ADIntArrayEvaluator *create_ADIntArrayEvaluator_init() {
  J2OBJC_CREATE_IMPL(ADIntArrayEvaluator, init)
}

void ADIntArrayEvaluator_initWithIntArray_(ADIntArrayEvaluator *self, IOSIntArray *reuseArray) {
  NSObject_init(self);
  JreStrongAssign(&self->mArray_, reuseArray);
}

ADIntArrayEvaluator *new_ADIntArrayEvaluator_initWithIntArray_(IOSIntArray *reuseArray) {
  J2OBJC_NEW_IMPL(ADIntArrayEvaluator, initWithIntArray_, reuseArray)
}

ADIntArrayEvaluator *create_ADIntArrayEvaluator_initWithIntArray_(IOSIntArray *reuseArray) {
  J2OBJC_CREATE_IMPL(ADIntArrayEvaluator, initWithIntArray_, reuseArray)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADIntArrayEvaluator)
