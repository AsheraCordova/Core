//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroidX-core\src\main\java\androidx\annotation\VisibleForTesting.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_VisibleForTesting")
#ifdef RESTRICT_VisibleForTesting
#define INCLUDE_ALL_VisibleForTesting 0
#else
#define INCLUDE_ALL_VisibleForTesting 1
#endif
#undef RESTRICT_VisibleForTesting

#if !defined (ADXVisibleForTesting_) && (INCLUDE_ALL_VisibleForTesting || defined(INCLUDE_ADXVisibleForTesting))
#define ADXVisibleForTesting_

#define RESTRICT_JavaLangAnnotationAnnotation 1
#define INCLUDE_JavaLangAnnotationAnnotation 1
#include "java/lang/annotation/Annotation.h"

@class IOSClass;

@protocol ADXVisibleForTesting < JavaLangAnnotationAnnotation >

- (jboolean)isEqual:(id)obj;

- (NSUInteger)hash;

@end

@interface ADXVisibleForTesting : NSObject < ADXVisibleForTesting >

@end

J2OBJC_EMPTY_STATIC_INIT(ADXVisibleForTesting)

FOUNDATION_EXPORT id<ADXVisibleForTesting> create_ADXVisibleForTesting(void);

J2OBJC_TYPE_LITERAL_HEADER(ADXVisibleForTesting)

#define AndroidxAnnotationVisibleForTesting ADXVisibleForTesting

#endif

#pragma pop_macro("INCLUDE_ALL_VisibleForTesting")
