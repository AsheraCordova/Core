//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\stub\r\android\annotation\SuppressLint.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_SuppressLint")
#ifdef RESTRICT_SuppressLint
#define INCLUDE_ALL_SuppressLint 0
#else
#define INCLUDE_ALL_SuppressLint 1
#endif
#undef RESTRICT_SuppressLint

#if !defined (ADSuppressLint_) && (INCLUDE_ALL_SuppressLint || defined(INCLUDE_ADSuppressLint))
#define ADSuppressLint_

#define RESTRICT_JavaLangAnnotationAnnotation 1
#define INCLUDE_JavaLangAnnotationAnnotation 1
#include "java/lang/annotation/Annotation.h"

@class IOSClass;
@class IOSObjectArray;

@protocol ADSuppressLint < JavaLangAnnotationAnnotation >

@property (readonly) IOSObjectArray *value;

- (jboolean)isEqual:(id)obj;

- (NSUInteger)hash;

@end

@interface ADSuppressLint : NSObject < ADSuppressLint > {
 @public
  IOSObjectArray *value_;
}

@end

J2OBJC_EMPTY_STATIC_INIT(ADSuppressLint)

FOUNDATION_EXPORT id<ADSuppressLint> create_ADSuppressLint(IOSObjectArray *value);

J2OBJC_TYPE_LITERAL_HEADER(ADSuppressLint)

#define RAndroidAnnotationSuppressLint ADSuppressLint

#endif

#pragma pop_macro("INCLUDE_ALL_SuppressLint")
