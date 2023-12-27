//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\com\android\internal\util\ArrayUtils.java
//

#include "ArrayUtils.h"
#include "IOSPrimitiveArray.h"
#include "J2ObjC_source.h"
#include "java/lang/ArrayIndexOutOfBoundsException.h"


@implementation ADArrayUtils

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADArrayUtils_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

+ (void)checkBoundsWithInt:(jint)len
                   withInt:(jint)index {
  ADArrayUtils_checkBoundsWithInt_withInt_(len, index);
}

+ (IOSIntArray *)newUnpaddedIntArrayWithInt:(jint)initialCapacity {
  return ADArrayUtils_newUnpaddedIntArrayWithInt_(initialCapacity);
}

+ (IOSLongArray *)newUnpaddedLongArrayWithInt:(jint)initialCapacity {
  return ADArrayUtils_newUnpaddedLongArrayWithInt_(initialCapacity);
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 0, 1, -1, -1, -1, -1 },
    { NULL, "[I", 0x9, 2, 3, -1, -1, -1, -1 },
    { NULL, "[J", 0x9, 4, 3, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(checkBoundsWithInt:withInt:);
  methods[2].selector = @selector(newUnpaddedIntArrayWithInt:);
  methods[3].selector = @selector(newUnpaddedLongArrayWithInt:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "checkBounds", "II", "newUnpaddedIntArray", "I", "newUnpaddedLongArray" };
  static const J2ObjcClassInfo _ADArrayUtils = { "ArrayUtils", "r.com.android.internal.util", ptrTable, methods, NULL, 7, 0x1, 4, 0, -1, -1, -1, -1, -1 };
  return &_ADArrayUtils;
}

@end

void ADArrayUtils_init(ADArrayUtils *self) {
  NSObject_init(self);
}

ADArrayUtils *new_ADArrayUtils_init() {
  J2OBJC_NEW_IMPL(ADArrayUtils, init)
}

ADArrayUtils *create_ADArrayUtils_init() {
  J2OBJC_CREATE_IMPL(ADArrayUtils, init)
}

void ADArrayUtils_checkBoundsWithInt_withInt_(jint len, jint index) {
  ADArrayUtils_initialize();
  if (index < 0 || len <= index) {
    @throw create_JavaLangArrayIndexOutOfBoundsException_initWithNSString_(JreStrcat("$I$I", @"length=", len, @"; index=", index));
  }
}

IOSIntArray *ADArrayUtils_newUnpaddedIntArrayWithInt_(jint initialCapacity) {
  ADArrayUtils_initialize();
  return [IOSIntArray arrayWithLength:initialCapacity];
}

IOSLongArray *ADArrayUtils_newUnpaddedLongArrayWithInt_(jint initialCapacity) {
  ADArrayUtils_initialize();
  return [IOSLongArray arrayWithLength:initialCapacity];
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADArrayUtils)
