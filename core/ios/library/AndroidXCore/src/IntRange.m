//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroidX-core\src\main\java\androidx\annotation\IntRange.java
//

#include "IOSClass.h"
#include "IntRange.h"
#include "J2ObjC_source.h"


@implementation ADXIntRange

@synthesize from = from_;

- (IOSClass *)annotationType {
  return ADXIntRange_class_();
}

- (NSString *)description {
  return [NSString stringWithFormat:@"@androidx.annotation.IntRange(from=%d)", from_];
}

- (jboolean)isEqual:(id)obj {
  return JreAnnotationEquals(self, obj);
}

- (NSUInteger)hash {
  return JreAnnotationHashCode(self);
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "I", 0x401, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(from);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "from_", "I", .constantValue.asLong = 0, 0x1000, -1, -1, -1, -1 },
  };
  static const J2ObjcClassInfo _ADXIntRange = { "IntRange", "androidx.annotation", NULL, methods, fields, 7, 0x2609, 1, 1, -1, -1, -1, -1, -1 };
  return &_ADXIntRange;
}

@end

id<ADXIntRange> create_ADXIntRange(jint from) {
  ADXIntRange *self = AUTORELEASE([[ADXIntRange alloc] init]);
  self->from_ = from;
  return self;
}

J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ADXIntRange)
