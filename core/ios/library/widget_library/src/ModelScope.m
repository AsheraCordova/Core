//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\model\ModelScope.java
//

#include "IOSObjectArray.h"
#include "J2ObjC_source.h"
#include "ModelScope.h"
#include "java/lang/Enum.h"
#include "java/lang/IllegalArgumentException.h"


__attribute__((unused)) static void ASModelScope_initWithNSString_withInt_(ASModelScope *self, NSString *__name, jint __ordinal);

J2OBJC_INITIALIZED_DEFN(ASModelScope)

ASModelScope *ASModelScope_values_[11];

@implementation ASModelScope

+ (IOSObjectArray *)values {
  return ASModelScope_values();
}

+ (ASModelScope *)valueOfWithNSString:(NSString *)name {
  return ASModelScope_valueOfWithNSString_(name);
}

- (ASModelScope_Enum)toNSEnum {
  return (ASModelScope_Enum)[self ordinal];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "[LASModelScope;", 0x9, -1, -1, -1, -1, -1, -1 },
    { NULL, "LASModelScope;", 0x9, 0, 1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(values);
  methods[1].selector = @selector(valueOfWithNSString:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "viewmodel", "LASModelScope;", .constantValue.asLong = 0, 0x4019, -1, 2, -1, -1 },
    { "view", "LASModelScope;", .constantValue.asLong = 0, 0x4019, -1, 3, -1, -1 },
    { "parentview", "LASModelScope;", .constantValue.asLong = 0, 0x4019, -1, 4, -1, -1 },
    { "session", "LASModelScope;", .constantValue.asLong = 0, 0x4019, -1, 5, -1, -1 },
    { "local", "LASModelScope;", .constantValue.asLong = 0, 0x4019, -1, 6, -1, -1 },
    { "loopvar", "LASModelScope;", .constantValue.asLong = 0, 0x4019, -1, 7, -1, -1 },
    { "sharedpreference", "LASModelScope;", .constantValue.asLong = 0, 0x4019, -1, 8, -1, -1 },
    { "sqlllite", "LASModelScope;", .constantValue.asLong = 0, 0x4019, -1, 9, -1, -1 },
    { "strings", "LASModelScope;", .constantValue.asLong = 0, 0x4019, -1, 10, -1, -1 },
    { "component", "LASModelScope;", .constantValue.asLong = 0, 0x4019, -1, 11, -1, -1 },
    { "constants", "LASModelScope;", .constantValue.asLong = 0, 0x4019, -1, 12, -1, -1 },
  };
  static const void *ptrTable[] = { "valueOf", "LNSString;", &JreEnum(ASModelScope, viewmodel), &JreEnum(ASModelScope, view), &JreEnum(ASModelScope, parentview), &JreEnum(ASModelScope, session), &JreEnum(ASModelScope, local), &JreEnum(ASModelScope, loopvar), &JreEnum(ASModelScope, sharedpreference), &JreEnum(ASModelScope, sqlllite), &JreEnum(ASModelScope, strings), &JreEnum(ASModelScope, component), &JreEnum(ASModelScope, constants), "Ljava/lang/Enum<Lcom/ashera/model/ModelScope;>;" };
  static const J2ObjcClassInfo _ASModelScope = { "ModelScope", "com.ashera.model", ptrTable, methods, fields, 7, 0x4011, 2, 11, -1, -1, -1, 13, -1 };
  return &_ASModelScope;
}

+ (void)initialize {
  if (self == [ASModelScope class]) {
    size_t objSize = class_getInstanceSize(self);
    size_t allocSize = 11 * objSize;
    uintptr_t ptr = (uintptr_t)calloc(allocSize, 1);
    id e;
    for (jint i = 0; i < 11; i++) {
      ((void)(ASModelScope_values_[i] = e = objc_constructInstance(self, (void *)ptr)), ptr += objSize);
      ASModelScope_initWithNSString_withInt_(e, JreEnumConstantName(ASModelScope_class_(), i), i);
    }
    J2OBJC_SET_INITIALIZED(ASModelScope)
  }
}

@end

void ASModelScope_initWithNSString_withInt_(ASModelScope *self, NSString *__name, jint __ordinal) {
  JavaLangEnum_initWithNSString_withInt_(self, __name, __ordinal);
}

IOSObjectArray *ASModelScope_values() {
  ASModelScope_initialize();
  return [IOSObjectArray arrayWithObjects:ASModelScope_values_ count:11 type:ASModelScope_class_()];
}

ASModelScope *ASModelScope_valueOfWithNSString_(NSString *name) {
  ASModelScope_initialize();
  for (int i = 0; i < 11; i++) {
    ASModelScope *e = ASModelScope_values_[i];
    if ([name isEqual:[e name]]) {
      return e;
    }
  }
  @throw create_JavaLangIllegalArgumentException_initWithNSString_(name);
  return nil;
}

ASModelScope *ASModelScope_fromOrdinal(NSUInteger ordinal) {
  ASModelScope_initialize();
  if (ordinal >= 11) {
    return nil;
  }
  return ASModelScope_values_[ordinal];
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASModelScope)
