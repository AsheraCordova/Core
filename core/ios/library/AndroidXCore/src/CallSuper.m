//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroidX-core\src\main\java\androidx\annotation\CallSuper.java
//

#include "CallSuper.h"
#include "IOSClass.h"
#include "J2ObjC_source.h"


@implementation ADXCallSuper

- (IOSClass *)annotationType {
  return ADXCallSuper_class_();
}

- (NSString *)description {
  return @"@androidx.annotation.CallSuper()";
}

- (jboolean)isEqual:(id)obj {
  return JreAnnotationEquals(self, obj);
}

- (NSUInteger)hash {
  return JreAnnotationHashCode(self);
}

+ (const J2ObjcClassInfo *)__metadata {
  static const J2ObjcClassInfo _ADXCallSuper = { "CallSuper", "androidx.annotation", NULL, NULL, NULL, 7, 0x2609, 0, 0, -1, -1, -1, -1, -1 };
  return &_ADXCallSuper;
}

@end

id<ADXCallSuper> create_ADXCallSuper() {
  ADXCallSuper *self = AUTORELEASE([[ADXCallSuper alloc] init]);
  return self;
}

J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ADXCallSuper)
