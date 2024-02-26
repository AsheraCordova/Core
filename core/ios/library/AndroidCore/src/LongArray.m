//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\util\LongArray.java
//

#include "ArrayUtils.h"
#include "EmptyArray.h"
#include "IOSPrimitiveArray.h"
#include "J2ObjC_source.h"
#include "LongArray.h"
#include "Preconditions.h"
#include "java/lang/CloneNotSupportedException.h"
#include "java/lang/System.h"
#include "java/util/Arrays.h"


@interface ADLongArray () {
 @public
  IOSLongArray *mValues_;
  jint mSize_;
}

- (instancetype)initWithLongArray:(IOSLongArray *)array
                          withInt:(jint)size;

/*!
 @brief Ensures capacity to append at least <code>count</code> values.
 */
- (void)ensureCapacityWithInt:(jint)count;

@end

J2OBJC_FIELD_SETTER(ADLongArray, mValues_, IOSLongArray *)

inline jint ADLongArray_get_MIN_CAPACITY_INCREMENT(void);
#define ADLongArray_MIN_CAPACITY_INCREMENT 12
J2OBJC_STATIC_FIELD_CONSTANT(ADLongArray, MIN_CAPACITY_INCREMENT, jint)

__attribute__((unused)) static void ADLongArray_initWithLongArray_withInt_(ADLongArray *self, IOSLongArray *array, jint size);

__attribute__((unused)) static ADLongArray *new_ADLongArray_initWithLongArray_withInt_(IOSLongArray *array, jint size) NS_RETURNS_RETAINED;

__attribute__((unused)) static ADLongArray *create_ADLongArray_initWithLongArray_withInt_(IOSLongArray *array, jint size);

__attribute__((unused)) static void ADLongArray_ensureCapacityWithInt_(ADLongArray *self, jint count);

@implementation ADLongArray

- (instancetype)initWithLongArray:(IOSLongArray *)array
                          withInt:(jint)size {
  ADLongArray_initWithLongArray_withInt_(self, array, size);
  return self;
}

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADLongArray_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (instancetype)initWithInt:(jint)initialCapacity {
  ADLongArray_initWithInt_(self, initialCapacity);
  return self;
}

+ (ADLongArray *)wrapWithLongArray:(IOSLongArray *)array {
  return ADLongArray_wrapWithLongArray_(array);
}

+ (ADLongArray *)fromArrayWithLongArray:(IOSLongArray *)array
                                withInt:(jint)size {
  return ADLongArray_fromArrayWithLongArray_withInt_(array, size);
}

- (void)resizeWithInt:(jint)newSize {
  ADPreconditions_checkArgumentNonnegativeWithInt_(newSize);
  if (newSize <= ((IOSLongArray *) nil_chk(mValues_))->size_) {
    JavaUtilArrays_fillWithLongArray_withInt_withInt_withLong_(mValues_, newSize, mValues_->size_, 0);
  }
  else {
    ADLongArray_ensureCapacityWithInt_(self, newSize - mSize_);
  }
  mSize_ = newSize;
}

- (void)addWithLong:(jlong)value {
  [self addWithInt:mSize_ withLong:value];
}

- (void)addWithInt:(jint)index
          withLong:(jlong)value {
  ADLongArray_ensureCapacityWithInt_(self, 1);
  jint rightSegment = mSize_ - index;
  mSize_++;
  ADArrayUtils_checkBoundsWithInt_withInt_(mSize_, index);
  if (rightSegment != 0) {
    JavaLangSystem_arraycopyWithId_withInt_withId_withInt_withInt_(mValues_, index, mValues_, index + 1, rightSegment);
  }
  *IOSLongArray_GetRef(nil_chk(mValues_), index) = value;
}

- (void)addAllWithADLongArray:(ADLongArray *)values {
  jint count = ((ADLongArray *) nil_chk(values))->mSize_;
  ADLongArray_ensureCapacityWithInt_(self, count);
  JavaLangSystem_arraycopyWithId_withInt_withId_withInt_withInt_(values->mValues_, 0, mValues_, mSize_, count);
  mSize_ += count;
}

- (void)ensureCapacityWithInt:(jint)count {
  ADLongArray_ensureCapacityWithInt_(self, count);
}

- (void)clear {
  mSize_ = 0;
}

- (ADLongArray *)java_clone {
  ADLongArray *clone = nil;
  @try {
    clone = (ADLongArray *) cast_chk([super java_clone], [ADLongArray class]);
    JreStrongAssign(&((ADLongArray *) nil_chk(clone))->mValues_, [((IOSLongArray *) nil_chk(mValues_)) java_clone]);
  }
  @catch (JavaLangCloneNotSupportedException *cnse) {
  }
  return clone;
}

- (jlong)getWithInt:(jint)index {
  ADArrayUtils_checkBoundsWithInt_withInt_(mSize_, index);
  return IOSLongArray_Get(nil_chk(mValues_), index);
}

- (void)setWithInt:(jint)index
          withLong:(jlong)value {
  ADArrayUtils_checkBoundsWithInt_withInt_(mSize_, index);
  *IOSLongArray_GetRef(nil_chk(mValues_), index) = value;
}

- (jint)indexOfWithLong:(jlong)value {
  jint n = mSize_;
  for (jint i = 0; i < n; i++) {
    if (IOSLongArray_Get(nil_chk(mValues_), i) == value) {
      return i;
    }
  }
  return -1;
}

- (void)removeWithInt:(jint)index {
  ADArrayUtils_checkBoundsWithInt_withInt_(mSize_, index);
  JavaLangSystem_arraycopyWithId_withInt_withId_withInt_withInt_(mValues_, index + 1, mValues_, index, mSize_ - index - 1);
  mSize_--;
}

- (jint)size {
  return mSize_;
}

- (IOSLongArray *)toArray {
  return JavaUtilArrays_copyOfWithLongArray_withInt_(mValues_, mSize_);
}

+ (jboolean)elementsEqualWithADLongArray:(ADLongArray *)a
                         withADLongArray:(ADLongArray *)b {
  return ADLongArray_elementsEqualWithADLongArray_withADLongArray_(a, b);
}

- (void)dealloc {
  RELEASE_(mValues_);
  [super dealloc];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x2, -1, 0, -1, -1, -1, -1 },
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, NULL, 0x1, -1, 1, -1, -1, -1, -1 },
    { NULL, "LADLongArray;", 0x9, 2, 3, -1, -1, -1, -1 },
    { NULL, "LADLongArray;", 0x9, 4, 0, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 5, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 6, 7, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 6, 8, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 9, 10, -1, -1, -1, -1 },
    { NULL, "V", 0x2, 11, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LADLongArray;", 0x1, 12, -1, -1, -1, -1, -1 },
    { NULL, "J", 0x1, 13, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 14, 8, -1, -1, -1, -1 },
    { NULL, "I", 0x1, 15, 7, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 16, 1, -1, -1, -1, -1 },
    { NULL, "I", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "[J", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x9, 17, 18, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(initWithLongArray:withInt:);
  methods[1].selector = @selector(init);
  methods[2].selector = @selector(initWithInt:);
  methods[3].selector = @selector(wrapWithLongArray:);
  methods[4].selector = @selector(fromArrayWithLongArray:withInt:);
  methods[5].selector = @selector(resizeWithInt:);
  methods[6].selector = @selector(addWithLong:);
  methods[7].selector = @selector(addWithInt:withLong:);
  methods[8].selector = @selector(addAllWithADLongArray:);
  methods[9].selector = @selector(ensureCapacityWithInt:);
  methods[10].selector = @selector(clear);
  methods[11].selector = @selector(java_clone);
  methods[12].selector = @selector(getWithInt:);
  methods[13].selector = @selector(setWithInt:withLong:);
  methods[14].selector = @selector(indexOfWithLong:);
  methods[15].selector = @selector(removeWithInt:);
  methods[16].selector = @selector(size);
  methods[17].selector = @selector(toArray);
  methods[18].selector = @selector(elementsEqualWithADLongArray:withADLongArray:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "MIN_CAPACITY_INCREMENT", "I", .constantValue.asInt = ADLongArray_MIN_CAPACITY_INCREMENT, 0x1a, -1, -1, -1, -1 },
    { "mValues_", "[J", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mSize_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "[JI", "I", "wrap", "[J", "fromArray", "resize", "add", "J", "IJ", "addAll", "LADLongArray;", "ensureCapacity", "clone", "get", "set", "indexOf", "remove", "elementsEqual", "LADLongArray;LADLongArray;" };
  static const J2ObjcClassInfo _ADLongArray = { "LongArray", "r.android.util", ptrTable, methods, fields, 7, 0x1, 19, 3, -1, -1, -1, -1, -1 };
  return &_ADLongArray;
}

- (id)copyWithZone:(NSZone *)zone {
  return [[self java_clone] retain];
}

@end

void ADLongArray_initWithLongArray_withInt_(ADLongArray *self, IOSLongArray *array, jint size) {
  NSObject_init(self);
  JreStrongAssign(&self->mValues_, array);
  self->mSize_ = ADPreconditions_checkArgumentInRangeWithInt_withInt_withInt_withNSString_(size, 0, ((IOSLongArray *) nil_chk(array))->size_, @"size");
}

ADLongArray *new_ADLongArray_initWithLongArray_withInt_(IOSLongArray *array, jint size) {
  J2OBJC_NEW_IMPL(ADLongArray, initWithLongArray_withInt_, array, size)
}

ADLongArray *create_ADLongArray_initWithLongArray_withInt_(IOSLongArray *array, jint size) {
  J2OBJC_CREATE_IMPL(ADLongArray, initWithLongArray_withInt_, array, size)
}

void ADLongArray_init(ADLongArray *self) {
  ADLongArray_initWithInt_(self, 0);
}

ADLongArray *new_ADLongArray_init() {
  J2OBJC_NEW_IMPL(ADLongArray, init)
}

ADLongArray *create_ADLongArray_init() {
  J2OBJC_CREATE_IMPL(ADLongArray, init)
}

void ADLongArray_initWithInt_(ADLongArray *self, jint initialCapacity) {
  NSObject_init(self);
  if (initialCapacity == 0) {
    JreStrongAssign(&self->mValues_, JreLoadStatic(ADEmptyArray, LONG));
  }
  else {
    JreStrongAssign(&self->mValues_, ADArrayUtils_newUnpaddedLongArrayWithInt_(initialCapacity));
  }
  self->mSize_ = 0;
}

ADLongArray *new_ADLongArray_initWithInt_(jint initialCapacity) {
  J2OBJC_NEW_IMPL(ADLongArray, initWithInt_, initialCapacity)
}

ADLongArray *create_ADLongArray_initWithInt_(jint initialCapacity) {
  J2OBJC_CREATE_IMPL(ADLongArray, initWithInt_, initialCapacity)
}

ADLongArray *ADLongArray_wrapWithLongArray_(IOSLongArray *array) {
  ADLongArray_initialize();
  return create_ADLongArray_initWithLongArray_withInt_(array, ((IOSLongArray *) nil_chk(array))->size_);
}

ADLongArray *ADLongArray_fromArrayWithLongArray_withInt_(IOSLongArray *array, jint size) {
  ADLongArray_initialize();
  return ADLongArray_wrapWithLongArray_(JavaUtilArrays_copyOfWithLongArray_withInt_(array, size));
}

void ADLongArray_ensureCapacityWithInt_(ADLongArray *self, jint count) {
  jint currentSize = self->mSize_;
  jint minCapacity = currentSize + count;
  if (minCapacity >= ((IOSLongArray *) nil_chk(self->mValues_))->size_) {
    jint targetCap = currentSize + (currentSize < (JreIntDiv(ADLongArray_MIN_CAPACITY_INCREMENT, 2)) ? ADLongArray_MIN_CAPACITY_INCREMENT : JreRShift32(currentSize, 1));
    jint newCapacity = targetCap > minCapacity ? targetCap : minCapacity;
    IOSLongArray *newValues = ADArrayUtils_newUnpaddedLongArrayWithInt_(newCapacity);
    JavaLangSystem_arraycopyWithId_withInt_withId_withInt_withInt_(self->mValues_, 0, newValues, 0, currentSize);
    JreStrongAssign(&self->mValues_, newValues);
  }
}

jboolean ADLongArray_elementsEqualWithADLongArray_withADLongArray_(ADLongArray *a, ADLongArray *b) {
  ADLongArray_initialize();
  if (a == nil || b == nil) return a == b;
  if (a->mSize_ != b->mSize_) return false;
  for (jint i = 0; i < a->mSize_; i++) {
    if ([a getWithInt:i] != [b getWithInt:i]) {
      return false;
    }
  }
  return true;
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADLongArray)