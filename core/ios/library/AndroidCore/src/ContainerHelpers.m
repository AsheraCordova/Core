//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\util\ContainerHelpers.java
//

#include "ContainerHelpers.h"
#include "IOSClass.h"
#include "IOSObjectArray.h"
#include "IOSPrimitiveArray.h"
#include "J2ObjC_source.h"


J2OBJC_INITIALIZED_DEFN(ADContainerHelpers)

IOSIntArray *ADContainerHelpers_EMPTY_INTS;
IOSLongArray *ADContainerHelpers_EMPTY_LONGS;
IOSObjectArray *ADContainerHelpers_EMPTY_OBJECTS;

@implementation ADContainerHelpers

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADContainerHelpers_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

+ (jint)idealIntArraySizeWithInt:(jint)need {
  return ADContainerHelpers_idealIntArraySizeWithInt_(need);
}

+ (jint)idealLongArraySizeWithInt:(jint)need {
  return ADContainerHelpers_idealLongArraySizeWithInt_(need);
}

+ (jint)idealByteArraySizeWithInt:(jint)need {
  return ADContainerHelpers_idealByteArraySizeWithInt_(need);
}

+ (jboolean)equalWithId:(id)a
                 withId:(id)b {
  return ADContainerHelpers_equalWithId_withId_(a, b);
}

+ (jint)binarySearchWithIntArray:(IOSIntArray *)array
                         withInt:(jint)size
                         withInt:(jint)value {
  return ADContainerHelpers_binarySearchWithIntArray_withInt_withInt_(array, size, value);
}

+ (jint)binarySearchWithLongArray:(IOSLongArray *)array
                          withInt:(jint)size
                         withLong:(jlong)value {
  return ADContainerHelpers_binarySearchWithLongArray_withInt_withLong_(array, size, value);
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x9, 0, 1, -1, -1, -1, -1 },
    { NULL, "I", 0x9, 2, 1, -1, -1, -1, -1 },
    { NULL, "I", 0x9, 3, 1, -1, -1, -1, -1 },
    { NULL, "Z", 0x9, 4, 5, -1, -1, -1, -1 },
    { NULL, "I", 0x9, 6, 7, -1, -1, -1, -1 },
    { NULL, "I", 0x9, 6, 8, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(idealIntArraySizeWithInt:);
  methods[2].selector = @selector(idealLongArraySizeWithInt:);
  methods[3].selector = @selector(idealByteArraySizeWithInt:);
  methods[4].selector = @selector(equalWithId:withId:);
  methods[5].selector = @selector(binarySearchWithIntArray:withInt:withInt:);
  methods[6].selector = @selector(binarySearchWithLongArray:withInt:withLong:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "EMPTY_INTS", "[I", .constantValue.asLong = 0, 0x19, -1, 9, -1, -1 },
    { "EMPTY_LONGS", "[J", .constantValue.asLong = 0, 0x19, -1, 10, -1, -1 },
    { "EMPTY_OBJECTS", "[LNSObject;", .constantValue.asLong = 0, 0x19, -1, 11, -1, -1 },
  };
  static const void *ptrTable[] = { "idealIntArraySize", "I", "idealLongArraySize", "idealByteArraySize", "equal", "LNSObject;LNSObject;", "binarySearch", "[III", "[JIJ", &ADContainerHelpers_EMPTY_INTS, &ADContainerHelpers_EMPTY_LONGS, &ADContainerHelpers_EMPTY_OBJECTS };
  static const J2ObjcClassInfo _ADContainerHelpers = { "ContainerHelpers", "r.android.util", ptrTable, methods, fields, 7, 0x1, 7, 3, -1, -1, -1, -1, -1 };
  return &_ADContainerHelpers;
}

+ (void)initialize {
  if (self == [ADContainerHelpers class]) {
    JreStrongAssignAndConsume(&ADContainerHelpers_EMPTY_INTS, [IOSIntArray newArrayWithLength:0]);
    JreStrongAssignAndConsume(&ADContainerHelpers_EMPTY_LONGS, [IOSLongArray newArrayWithLength:0]);
    JreStrongAssignAndConsume(&ADContainerHelpers_EMPTY_OBJECTS, [IOSObjectArray newArrayWithLength:0 type:NSObject_class_()]);
    J2OBJC_SET_INITIALIZED(ADContainerHelpers)
  }
}

@end

void ADContainerHelpers_init(ADContainerHelpers *self) {
  NSObject_init(self);
}

ADContainerHelpers *new_ADContainerHelpers_init() {
  J2OBJC_NEW_IMPL(ADContainerHelpers, init)
}

ADContainerHelpers *create_ADContainerHelpers_init() {
  J2OBJC_CREATE_IMPL(ADContainerHelpers, init)
}

jint ADContainerHelpers_idealIntArraySizeWithInt_(jint need) {
  ADContainerHelpers_initialize();
  return JreIntDiv(ADContainerHelpers_idealByteArraySizeWithInt_(need * 4), 4);
}

jint ADContainerHelpers_idealLongArraySizeWithInt_(jint need) {
  ADContainerHelpers_initialize();
  return JreIntDiv(ADContainerHelpers_idealByteArraySizeWithInt_(need * 8), 8);
}

jint ADContainerHelpers_idealByteArraySizeWithInt_(jint need) {
  ADContainerHelpers_initialize();
  for (jint i = 4; i < 32; i++) if (need <= (JreLShift32(1, i)) - 12) return (JreLShift32(1, i)) - 12;
  return need;
}

jboolean ADContainerHelpers_equalWithId_withId_(id a, id b) {
  ADContainerHelpers_initialize();
  return a == b || (a != nil && [a isEqual:b]);
}

jint ADContainerHelpers_binarySearchWithIntArray_withInt_withInt_(IOSIntArray *array, jint size, jint value) {
  ADContainerHelpers_initialize();
  jint lo = 0;
  jint hi = size - 1;
  while (lo <= hi) {
    jint mid = JreURShift32((lo + hi), 1);
    jint midVal = IOSIntArray_Get(nil_chk(array), mid);
    if (midVal < value) {
      lo = mid + 1;
    }
    else if (midVal > value) {
      hi = mid - 1;
    }
    else {
      return mid;
    }
  }
  return ~lo;
}

jint ADContainerHelpers_binarySearchWithLongArray_withInt_withLong_(IOSLongArray *array, jint size, jlong value) {
  ADContainerHelpers_initialize();
  jint lo = 0;
  jint hi = size - 1;
  while (lo <= hi) {
    jint mid = JreURShift32((lo + hi), 1);
    jlong midVal = IOSLongArray_Get(nil_chk(array), mid);
    if (midVal < value) {
      lo = mid + 1;
    }
    else if (midVal > value) {
      hi = mid - 1;
    }
    else {
      return mid;
    }
  }
  return ~lo;
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADContainerHelpers)
