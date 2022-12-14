//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\text\Editable.java
//

#include "Editable.h"
#include "J2ObjC_source.h"
#include "SpannableStringBuilder.h"
#include "java/lang/CharSequence.h"


@interface ADEditable : NSObject

@end

inline ADEditable_Factory *ADEditable_Factory_get_sInstance(void);
inline ADEditable_Factory *ADEditable_Factory_set_sInstance(ADEditable_Factory *value);
static ADEditable_Factory *ADEditable_Factory_sInstance;
J2OBJC_STATIC_FIELD_OBJ(ADEditable_Factory, sInstance, ADEditable_Factory *)

@implementation ADEditable

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "LADEditable;", 0x401, 0, 1, -1, -1, -1, -1 },
    { NULL, "LADEditable;", 0x401, 0, 2, -1, -1, -1, -1 },
    { NULL, "LADEditable;", 0x401, 3, 4, -1, -1, -1, -1 },
    { NULL, "LADEditable;", 0x401, 3, 5, -1, -1, -1, -1 },
    { NULL, "LADEditable;", 0x401, 6, 7, -1, -1, -1, -1 },
    { NULL, "LADEditable;", 0x401, 8, 9, -1, -1, -1, -1 },
    { NULL, "LADEditable;", 0x401, 8, 10, -1, -1, -1, -1 },
    { NULL, "LADEditable;", 0x401, 8, 11, -1, -1, -1, -1 },
    { NULL, "V", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 12, 13, -1, -1, -1, -1 },
    { NULL, "[LADInputFilter;", 0x401, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(replaceWithInt:withInt:withJavaLangCharSequence:withInt:withInt:);
  methods[1].selector = @selector(replaceWithInt:withInt:withJavaLangCharSequence:);
  methods[2].selector = @selector(insertWithInt:withJavaLangCharSequence:withInt:withInt:);
  methods[3].selector = @selector(insertWithInt:withJavaLangCharSequence:);
  methods[4].selector = @selector(delete__WithInt:withInt:);
  methods[5].selector = @selector(appendWithJavaLangCharSequence:);
  methods[6].selector = @selector(appendWithJavaLangCharSequence:withInt:withInt:);
  methods[7].selector = @selector(appendWithChar:);
  methods[8].selector = @selector(clear);
  methods[9].selector = @selector(clearSpans);
  methods[10].selector = @selector(setFiltersWithADInputFilterArray:);
  methods[11].selector = @selector(getFilters);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "replace", "IILJavaLangCharSequence;II", "IILJavaLangCharSequence;", "insert", "ILJavaLangCharSequence;II", "ILJavaLangCharSequence;", "delete", "II", "append", "LJavaLangCharSequence;", "LJavaLangCharSequence;II", "C", "setFilters", "[LADInputFilter;", "LADEditable_Factory;" };
  static const J2ObjcClassInfo _ADEditable = { "Editable", "r.android.text", ptrTable, methods, NULL, 7, 0x609, 12, 0, -1, 14, -1, -1, -1 };
  return &_ADEditable;
}

@end

J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ADEditable)

J2OBJC_INITIALIZED_DEFN(ADEditable_Factory)

@implementation ADEditable_Factory

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADEditable_Factory_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

+ (ADEditable_Factory *)getInstance {
  return ADEditable_Factory_getInstance();
}

- (id<ADEditable>)newEditableWithJavaLangCharSequence:(id<JavaLangCharSequence>)source {
  return create_ADSpannableStringBuilder_initWithJavaLangCharSequence_(source);
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LADEditable_Factory;", 0x9, -1, -1, -1, -1, -1, -1 },
    { NULL, "LADEditable;", 0x1, 0, 1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(getInstance);
  methods[2].selector = @selector(newEditableWithJavaLangCharSequence:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "sInstance", "LADEditable_Factory;", .constantValue.asLong = 0, 0xa, -1, 2, -1, -1 },
  };
  static const void *ptrTable[] = { "newEditable", "LJavaLangCharSequence;", &ADEditable_Factory_sInstance, "LADEditable;" };
  static const J2ObjcClassInfo _ADEditable_Factory = { "Factory", "r.android.text", ptrTable, methods, fields, 7, 0x9, 3, 1, 3, -1, -1, -1, -1 };
  return &_ADEditable_Factory;
}

+ (void)initialize {
  if (self == [ADEditable_Factory class]) {
    JreStrongAssignAndConsume(&ADEditable_Factory_sInstance, new_ADEditable_Factory_init());
    J2OBJC_SET_INITIALIZED(ADEditable_Factory)
  }
}

@end

void ADEditable_Factory_init(ADEditable_Factory *self) {
  NSObject_init(self);
}

ADEditable_Factory *new_ADEditable_Factory_init() {
  J2OBJC_NEW_IMPL(ADEditable_Factory, init)
}

ADEditable_Factory *create_ADEditable_Factory_init() {
  J2OBJC_CREATE_IMPL(ADEditable_Factory, init)
}

ADEditable_Factory *ADEditable_Factory_getInstance() {
  ADEditable_Factory_initialize();
  return ADEditable_Factory_sInstance;
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADEditable_Factory)
