//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\stub\r\android\annotation\MainThread.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_MainThread")
#ifdef RESTRICT_MainThread
#define INCLUDE_ALL_MainThread 0
#else
#define INCLUDE_ALL_MainThread 1
#endif
#undef RESTRICT_MainThread

#if !defined (ADMainThread_) && (INCLUDE_ALL_MainThread || defined(INCLUDE_ADMainThread))
#define ADMainThread_

#define RESTRICT_JavaLangAnnotationAnnotation 1
#define INCLUDE_JavaLangAnnotationAnnotation 1
#include "java/lang/annotation/Annotation.h"

@class IOSClass;

@protocol ADMainThread < JavaLangAnnotationAnnotation >

- (jboolean)isEqual:(id)obj;

- (NSUInteger)hash;

@end

@interface ADMainThread : NSObject < ADMainThread >

@end

J2OBJC_EMPTY_STATIC_INIT(ADMainThread)

FOUNDATION_EXPORT id<ADMainThread> create_ADMainThread(void);

J2OBJC_TYPE_LITERAL_HEADER(ADMainThread)

#define RAndroidAnnotationMainThread ADMainThread

#endif

#pragma pop_macro("INCLUDE_ALL_MainThread")
