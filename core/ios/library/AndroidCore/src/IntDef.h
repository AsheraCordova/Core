//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\stub\r\android\annotation\IntDef.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_IntDef")
#ifdef RESTRICT_IntDef
#define INCLUDE_ALL_IntDef 0
#else
#define INCLUDE_ALL_IntDef 1
#endif
#undef RESTRICT_IntDef

#if !defined (ADIntDef_) && (INCLUDE_ALL_IntDef || defined(INCLUDE_ADIntDef))
#define ADIntDef_

#define RESTRICT_JavaLangAnnotationAnnotation 1
#define INCLUDE_JavaLangAnnotationAnnotation 1
#include "java/lang/annotation/Annotation.h"

@class IOSClass;
@class IOSIntArray;

@protocol ADIntDef < JavaLangAnnotationAnnotation >

@property (readonly) IOSIntArray *value;
@property (readonly) jboolean flag;

- (jboolean)isEqual:(id)obj;

- (NSUInteger)hash;

@end

@interface ADIntDef : NSObject < ADIntDef > {
 @public
  IOSIntArray *value_;
  jboolean flag_;
}

@end

J2OBJC_EMPTY_STATIC_INIT(ADIntDef)

FOUNDATION_EXPORT id<ADIntDef> create_ADIntDef(jboolean flag, IOSIntArray *value);

J2OBJC_TYPE_LITERAL_HEADER(ADIntDef)

#define RAndroidAnnotationIntDef ADIntDef

#endif

#pragma pop_macro("INCLUDE_ALL_IntDef")
