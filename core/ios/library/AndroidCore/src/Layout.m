//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\text\Layout.java
//

#include "IOSObjectArray.h"
#include "J2ObjC_source.h"
#include "Layout.h"
#include "java/lang/Enum.h"
#include "java/lang/IllegalArgumentException.h"


__attribute__((unused)) static void ADLayout_Alignment_initWithNSString_withInt_(ADLayout_Alignment *self, NSString *__name, jint __ordinal);

@implementation ADLayout

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADLayout_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (jint)getWidth {
  return 0;
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x1, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(getWidth);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "LADLayout_Alignment;" };
  static const J2ObjcClassInfo _ADLayout = { "Layout", "r.android.text", ptrTable, methods, NULL, 7, 0x1, 2, 0, -1, 0, -1, -1, -1 };
  return &_ADLayout;
}

@end

void ADLayout_init(ADLayout *self) {
  NSObject_init(self);
}

ADLayout *new_ADLayout_init() {
  J2OBJC_NEW_IMPL(ADLayout, init)
}

ADLayout *create_ADLayout_init() {
  J2OBJC_CREATE_IMPL(ADLayout, init)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADLayout)

J2OBJC_INITIALIZED_DEFN(ADLayout_Alignment)

ADLayout_Alignment *ADLayout_Alignment_values_[5];

@implementation ADLayout_Alignment

+ (IOSObjectArray *)values {
  return ADLayout_Alignment_values();
}

+ (ADLayout_Alignment *)valueOfWithNSString:(NSString *)name {
  return ADLayout_Alignment_valueOfWithNSString_(name);
}

- (ADLayout_Alignment_Enum)toNSEnum {
  return (ADLayout_Alignment_Enum)[self ordinal];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "[LADLayout_Alignment;", 0x9, -1, -1, -1, -1, -1, -1 },
    { NULL, "LADLayout_Alignment;", 0x9, 0, 1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(values);
  methods[1].selector = @selector(valueOfWithNSString:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "ALIGN_NORMAL", "LADLayout_Alignment;", .constantValue.asLong = 0, 0x4019, -1, 2, -1, -1 },
    { "ALIGN_OPPOSITE", "LADLayout_Alignment;", .constantValue.asLong = 0, 0x4019, -1, 3, -1, -1 },
    { "ALIGN_CENTER", "LADLayout_Alignment;", .constantValue.asLong = 0, 0x4019, -1, 4, -1, -1 },
    { "ALIGN_LEFT", "LADLayout_Alignment;", .constantValue.asLong = 0, 0x4019, -1, 5, -1, -1 },
    { "ALIGN_RIGHT", "LADLayout_Alignment;", .constantValue.asLong = 0, 0x4019, -1, 6, -1, -1 },
  };
  static const void *ptrTable[] = { "valueOf", "LNSString;", &JreEnum(ADLayout_Alignment, ALIGN_NORMAL), &JreEnum(ADLayout_Alignment, ALIGN_OPPOSITE), &JreEnum(ADLayout_Alignment, ALIGN_CENTER), &JreEnum(ADLayout_Alignment, ALIGN_LEFT), &JreEnum(ADLayout_Alignment, ALIGN_RIGHT), "LADLayout;", "Ljava/lang/Enum<Lr/android/text/Layout$Alignment;>;" };
  static const J2ObjcClassInfo _ADLayout_Alignment = { "Alignment", "r.android.text", ptrTable, methods, fields, 7, 0x4019, 2, 5, 7, -1, -1, 8, -1 };
  return &_ADLayout_Alignment;
}

+ (void)initialize {
  if (self == [ADLayout_Alignment class]) {
    size_t objSize = class_getInstanceSize(self);
    size_t allocSize = 5 * objSize;
    uintptr_t ptr = (uintptr_t)calloc(allocSize, 1);
    id e;
    for (jint i = 0; i < 5; i++) {
      ((void)(ADLayout_Alignment_values_[i] = e = objc_constructInstance(self, (void *)ptr)), ptr += objSize);
      ADLayout_Alignment_initWithNSString_withInt_(e, JreEnumConstantName(ADLayout_Alignment_class_(), i), i);
    }
    J2OBJC_SET_INITIALIZED(ADLayout_Alignment)
  }
}

@end

void ADLayout_Alignment_initWithNSString_withInt_(ADLayout_Alignment *self, NSString *__name, jint __ordinal) {
  JavaLangEnum_initWithNSString_withInt_(self, __name, __ordinal);
}

IOSObjectArray *ADLayout_Alignment_values() {
  ADLayout_Alignment_initialize();
  return [IOSObjectArray arrayWithObjects:ADLayout_Alignment_values_ count:5 type:ADLayout_Alignment_class_()];
}

ADLayout_Alignment *ADLayout_Alignment_valueOfWithNSString_(NSString *name) {
  ADLayout_Alignment_initialize();
  for (int i = 0; i < 5; i++) {
    ADLayout_Alignment *e = ADLayout_Alignment_values_[i];
    if ([name isEqual:[e name]]) {
      return e;
    }
  }
  @throw create_JavaLangIllegalArgumentException_initWithNSString_(name);
  return nil;
}

ADLayout_Alignment *ADLayout_Alignment_fromOrdinal(NSUInteger ordinal) {
  ADLayout_Alignment_initialize();
  if (ordinal >= 5) {
    return nil;
  }
  return ADLayout_Alignment_values_[ordinal];
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADLayout_Alignment)
