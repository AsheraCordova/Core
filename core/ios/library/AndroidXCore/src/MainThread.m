//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroidX-core\src\main\java\androidx\annotation\MainThread.java
//

#include "IOSClass.h"
#include "J2ObjC_source.h"
#include "MainThread.h"


@implementation ADXMainThread

- (IOSClass *)annotationType {
  return ADXMainThread_class_();
}

- (NSString *)description {
  return @"@androidx.annotation.MainThread()";
}

- (jboolean)isEqual:(id)obj {
  return JreAnnotationEquals(self, obj);
}

- (NSUInteger)hash {
  return JreAnnotationHashCode(self);
}

+ (const J2ObjcClassInfo *)__metadata {
  static const J2ObjcClassInfo _ADXMainThread = { "MainThread", "androidx.annotation", NULL, NULL, NULL, 7, 0x2609, 0, 0, -1, -1, -1, -1, -1 };
  return &_ADXMainThread;
}

@end

id<ADXMainThread> create_ADXMainThread() {
  ADXMainThread *self = AUTORELEASE([[ADXMainThread alloc] init]);
  return self;
}

J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ADXMainThread)
