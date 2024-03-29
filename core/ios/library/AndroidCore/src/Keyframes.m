//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\animation\Keyframes.java
//

#include "J2ObjC_source.h"
#include "Keyframes.h"


@interface ADKeyframes : NSObject

@end

@interface ADKeyframes_IntKeyframes : NSObject

@end

@interface ADKeyframes_FloatKeyframes : NSObject

@end

@implementation ADKeyframes

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "V", 0x401, 0, 1, -1, -1, -1, -1 },
    { NULL, "LIOSClass;", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x401, 2, 3, -1, -1, -1, -1 },
    { NULL, "LJavaUtilList;", 0x401, -1, -1, -1, 4, -1, -1 },
    { NULL, "LADKeyframes;", 0x401, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(setEvaluatorWithADTypeEvaluator:);
  methods[1].selector = @selector(getType);
  methods[2].selector = @selector(getValueWithFloat:);
  methods[3].selector = @selector(getKeyframes);
  methods[4].selector = @selector(clone);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "setEvaluator", "LADTypeEvaluator;", "getValue", "F", "()Ljava/util/List<Lr/android/animation/Keyframe;>;", "LADKeyframes_IntKeyframes;LADKeyframes_FloatKeyframes;" };
  static const J2ObjcClassInfo _ADKeyframes = { "Keyframes", "r.android.animation", ptrTable, methods, NULL, 7, 0x609, 5, 0, -1, 5, -1, -1, -1 };
  return &_ADKeyframes;
}

- (id)copyWithZone:(NSZone *)zone {
  return [[self java_clone] retain];
}

@end

J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ADKeyframes)

@implementation ADKeyframes_IntKeyframes

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "I", 0x401, 0, 1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(getIntValueWithFloat:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "getIntValue", "F", "LADKeyframes;" };
  static const J2ObjcClassInfo _ADKeyframes_IntKeyframes = { "IntKeyframes", "r.android.animation", ptrTable, methods, NULL, 7, 0x609, 1, 0, 2, -1, -1, -1, -1 };
  return &_ADKeyframes_IntKeyframes;
}

- (id)copyWithZone:(NSZone *)zone {
  return [[self java_clone] retain];
}

@end

J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ADKeyframes_IntKeyframes)

@implementation ADKeyframes_FloatKeyframes

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "F", 0x401, 0, 1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(getFloatValueWithFloat:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "getFloatValue", "F", "LADKeyframes;" };
  static const J2ObjcClassInfo _ADKeyframes_FloatKeyframes = { "FloatKeyframes", "r.android.animation", ptrTable, methods, NULL, 7, 0x609, 1, 0, 2, -1, -1, -1, -1 };
  return &_ADKeyframes_FloatKeyframes;
}

- (id)copyWithZone:(NSZone *)zone {
  return [[self java_clone] retain];
}

@end

J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ADKeyframes_FloatKeyframes)
