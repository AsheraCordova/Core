//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\util\IntProperty.java
//

#include "IOSClass.h"
#include "IntProperty.h"
#include "J2ObjC_source.h"
#include "Property.h"
#include "java/lang/Integer.h"


#pragma clang diagnostic ignored "-Wincomplete-implementation"

@implementation ADIntProperty

- (instancetype)initWithNSString:(NSString *)name {
  ADIntProperty_initWithNSString_(self, name);
  return self;
}

- (void)setValueWithId:(id)object
               withInt:(jint)value {
  // can't call an abstract method
  [self doesNotRecognizeSelector:_cmd];
}

- (void)setWithId:(id)object
           withId:(JavaLangInteger *)value {
  [self setValueWithId:object withInt:[((JavaLangInteger *) nil_chk(value)) intValue]];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, 0, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 1, 2, -1, 3, -1, -1 },
    { NULL, "V", 0x11, 4, 5, -1, 6, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(initWithNSString:);
  methods[1].selector = @selector(setValueWithId:withInt:);
  methods[2].selector = @selector(setWithId:withId:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "LNSString;", "setValue", "LNSObject;I", "(TT;I)V", "set", "LNSObject;LJavaLangInteger;", "(TT;Ljava/lang/Integer;)V", "<T:Ljava/lang/Object;>Lr/android/util/Property<TT;Ljava/lang/Integer;>;" };
  static const J2ObjcClassInfo _ADIntProperty = { "IntProperty", "r.android.util", ptrTable, methods, NULL, 7, 0x401, 3, 0, -1, -1, -1, 7, -1 };
  return &_ADIntProperty;
}

@end

void ADIntProperty_initWithNSString_(ADIntProperty *self, NSString *name) {
  ADProperty_initWithIOSClass_withNSString_(self, JavaLangInteger_class_(), name);
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADIntProperty)
