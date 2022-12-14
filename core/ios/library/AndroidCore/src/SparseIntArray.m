//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\util\SparseIntArray.java
//

#include "ContainerHelpers.h"
#include "GrowingArrayUtils.h"
#include "IOSPrimitiveArray.h"
#include "J2ObjC_source.h"
#include "SparseIntArray.h"
#include "java/lang/CloneNotSupportedException.h"
#include "java/lang/StringBuilder.h"
#include "java/lang/System.h"


@interface ADSparseIntArray () {
 @public
  IOSIntArray *mKeys_;
  IOSIntArray *mValues_;
  jint mSize_;
}

@end

J2OBJC_FIELD_SETTER(ADSparseIntArray, mKeys_, IOSIntArray *)
J2OBJC_FIELD_SETTER(ADSparseIntArray, mValues_, IOSIntArray *)

@implementation ADSparseIntArray

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADSparseIntArray_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (instancetype)initWithInt:(jint)initialCapacity {
  ADSparseIntArray_initWithInt_(self, initialCapacity);
  return self;
}

- (ADSparseIntArray *)java_clone {
  ADSparseIntArray *clone = nil;
  @try {
    clone = (ADSparseIntArray *) cast_chk([super java_clone], [ADSparseIntArray class]);
    JreStrongAssign(&((ADSparseIntArray *) nil_chk(clone))->mKeys_, [((IOSIntArray *) nil_chk(mKeys_)) java_clone]);
    JreStrongAssign(&clone->mValues_, [((IOSIntArray *) nil_chk(mValues_)) java_clone]);
  }
  @catch (JavaLangCloneNotSupportedException *cnse) {
  }
  return clone;
}

- (jint)getWithInt:(jint)key {
  return [self getWithInt:key withInt:0];
}

- (jint)getWithInt:(jint)key
           withInt:(jint)valueIfKeyNotFound {
  jint i = ADContainerHelpers_binarySearchWithIntArray_withInt_withInt_(mKeys_, mSize_, key);
  if (i < 0) {
    return valueIfKeyNotFound;
  }
  else {
    return IOSIntArray_Get(nil_chk(mValues_), i);
  }
}

- (void)delete__WithInt:(jint)key {
  jint i = ADContainerHelpers_binarySearchWithIntArray_withInt_withInt_(mKeys_, mSize_, key);
  if (i >= 0) {
    [self removeAtWithInt:i];
  }
}

- (void)removeAtWithInt:(jint)index {
  JavaLangSystem_arraycopyWithId_withInt_withId_withInt_withInt_(mKeys_, index + 1, mKeys_, index, mSize_ - (index + 1));
  JavaLangSystem_arraycopyWithId_withInt_withId_withInt_withInt_(mValues_, index + 1, mValues_, index, mSize_ - (index + 1));
  mSize_--;
}

- (void)putWithInt:(jint)key
           withInt:(jint)value {
  jint i = ADContainerHelpers_binarySearchWithIntArray_withInt_withInt_(mKeys_, mSize_, key);
  if (i >= 0) {
    *IOSIntArray_GetRef(nil_chk(mValues_), i) = value;
  }
  else {
    i = ~i;
    JreStrongAssign(&mKeys_, ADGrowingArrayUtils_insertWithIntArray_withInt_withInt_withInt_(mKeys_, mSize_, i, key));
    JreStrongAssign(&mValues_, ADGrowingArrayUtils_insertWithIntArray_withInt_withInt_withInt_(mValues_, mSize_, i, value));
    mSize_++;
  }
}

- (jint)size {
  return mSize_;
}

- (jint)keyAtWithInt:(jint)index {
  return IOSIntArray_Get(nil_chk(mKeys_), index);
}

- (jint)valueAtWithInt:(jint)index {
  return IOSIntArray_Get(nil_chk(mValues_), index);
}

- (void)setValueAtWithInt:(jint)index
                  withInt:(jint)value {
  *IOSIntArray_GetRef(nil_chk(mValues_), index) = value;
}

- (jint)indexOfKeyWithInt:(jint)key {
  return ADContainerHelpers_binarySearchWithIntArray_withInt_withInt_(mKeys_, mSize_, key);
}

- (jint)indexOfValueWithInt:(jint)value {
  for (jint i = 0; i < mSize_; i++) if (IOSIntArray_Get(nil_chk(mValues_), i) == value) return i;
  return -1;
}

- (void)clear {
  mSize_ = 0;
}

- (void)appendWithInt:(jint)key
              withInt:(jint)value {
  if (mSize_ != 0 && key <= IOSIntArray_Get(nil_chk(mKeys_), mSize_ - 1)) {
    [self putWithInt:key withInt:value];
    return;
  }
  JreStrongAssign(&mKeys_, ADGrowingArrayUtils_appendWithIntArray_withInt_withInt_(mKeys_, mSize_, key));
  JreStrongAssign(&mValues_, ADGrowingArrayUtils_appendWithIntArray_withInt_withInt_(mValues_, mSize_, value));
  mSize_++;
}

- (NSString *)description {
  if ([self size] <= 0) {
    return @"{}";
  }
  JavaLangStringBuilder *buffer = create_JavaLangStringBuilder_initWithInt_(mSize_ * 28);
  [buffer appendWithChar:'{'];
  for (jint i = 0; i < mSize_; i++) {
    if (i > 0) {
      [buffer appendWithNSString:@", "];
    }
    jint key = [self keyAtWithInt:i];
    [buffer appendWithInt:key];
    [buffer appendWithChar:'='];
    jint value = [self valueAtWithInt:i];
    [buffer appendWithInt:value];
  }
  [buffer appendWithChar:'}'];
  return [buffer description];
}

- (void)dealloc {
  RELEASE_(mKeys_);
  RELEASE_(mValues_);
  [super dealloc];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, NULL, 0x1, -1, 0, -1, -1, -1, -1 },
    { NULL, "LADSparseIntArray;", 0x1, 1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x1, 2, 0, -1, -1, -1, -1 },
    { NULL, "I", 0x1, 2, 3, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 4, 0, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 5, 0, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 6, 3, -1, -1, -1, -1 },
    { NULL, "I", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x1, 7, 0, -1, -1, -1, -1 },
    { NULL, "I", 0x1, 8, 0, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 9, 3, -1, -1, -1, -1 },
    { NULL, "I", 0x1, 10, 0, -1, -1, -1, -1 },
    { NULL, "I", 0x1, 11, 0, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 12, 3, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, 13, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(initWithInt:);
  methods[2].selector = @selector(java_clone);
  methods[3].selector = @selector(getWithInt:);
  methods[4].selector = @selector(getWithInt:withInt:);
  methods[5].selector = @selector(delete__WithInt:);
  methods[6].selector = @selector(removeAtWithInt:);
  methods[7].selector = @selector(putWithInt:withInt:);
  methods[8].selector = @selector(size);
  methods[9].selector = @selector(keyAtWithInt:);
  methods[10].selector = @selector(valueAtWithInt:);
  methods[11].selector = @selector(setValueAtWithInt:withInt:);
  methods[12].selector = @selector(indexOfKeyWithInt:);
  methods[13].selector = @selector(indexOfValueWithInt:);
  methods[14].selector = @selector(clear);
  methods[15].selector = @selector(appendWithInt:withInt:);
  methods[16].selector = @selector(description);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "mKeys_", "[I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mValues_", "[I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mSize_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "I", "clone", "get", "II", "delete", "removeAt", "put", "keyAt", "valueAt", "setValueAt", "indexOfKey", "indexOfValue", "append", "toString" };
  static const J2ObjcClassInfo _ADSparseIntArray = { "SparseIntArray", "r.android.util", ptrTable, methods, fields, 7, 0x1, 17, 3, -1, -1, -1, -1, -1 };
  return &_ADSparseIntArray;
}

@end

void ADSparseIntArray_init(ADSparseIntArray *self) {
  ADSparseIntArray_initWithInt_(self, 10);
}

ADSparseIntArray *new_ADSparseIntArray_init() {
  J2OBJC_NEW_IMPL(ADSparseIntArray, init)
}

ADSparseIntArray *create_ADSparseIntArray_init() {
  J2OBJC_CREATE_IMPL(ADSparseIntArray, init)
}

void ADSparseIntArray_initWithInt_(ADSparseIntArray *self, jint initialCapacity) {
  NSObject_init(self);
  if (initialCapacity == 0) {
    JreStrongAssignAndConsume(&self->mKeys_, [IOSIntArray newArrayWithLength:0]);
    JreStrongAssignAndConsume(&self->mValues_, [IOSIntArray newArrayWithLength:0]);
  }
  else {
    JreStrongAssignAndConsume(&self->mKeys_, [IOSIntArray newArrayWithLength:initialCapacity]);
    JreStrongAssignAndConsume(&self->mValues_, [IOSIntArray newArrayWithLength:self->mKeys_->size_]);
  }
  self->mSize_ = 0;
}

ADSparseIntArray *new_ADSparseIntArray_initWithInt_(jint initialCapacity) {
  J2OBJC_NEW_IMPL(ADSparseIntArray, initWithInt_, initialCapacity)
}

ADSparseIntArray *create_ADSparseIntArray_initWithInt_(jint initialCapacity) {
  J2OBJC_CREATE_IMPL(ADSparseIntArray, initWithInt_, initialCapacity)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADSparseIntArray)
