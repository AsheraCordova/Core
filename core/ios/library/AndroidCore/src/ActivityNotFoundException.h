//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\stub\r\android\content\ActivityNotFoundException.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ActivityNotFoundException")
#ifdef RESTRICT_ActivityNotFoundException
#define INCLUDE_ALL_ActivityNotFoundException 0
#else
#define INCLUDE_ALL_ActivityNotFoundException 1
#endif
#undef RESTRICT_ActivityNotFoundException

#if !defined (ADActivityNotFoundException_) && (INCLUDE_ALL_ActivityNotFoundException || defined(INCLUDE_ADActivityNotFoundException))
#define ADActivityNotFoundException_

#define RESTRICT_JavaLangRuntimeException 1
#define INCLUDE_JavaLangRuntimeException 1
#include "java/lang/RuntimeException.h"

@class JavaLangThrowable;

@interface ADActivityNotFoundException : JavaLangRuntimeException

#pragma mark Public

- (instancetype)init;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithJavaLangThrowable:(JavaLangThrowable *)arg0 NS_UNAVAILABLE;

- (instancetype)initWithNSString:(NSString *)arg0 NS_UNAVAILABLE;

- (instancetype)initWithNSString:(NSString *)arg0
           withJavaLangThrowable:(JavaLangThrowable *)arg1 NS_UNAVAILABLE;

- (instancetype)initWithNSString:(NSString *)arg0
           withJavaLangThrowable:(JavaLangThrowable *)arg1
                     withBoolean:(jboolean)arg2
                     withBoolean:(jboolean)arg3 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADActivityNotFoundException)

FOUNDATION_EXPORT void ADActivityNotFoundException_init(ADActivityNotFoundException *self);

FOUNDATION_EXPORT ADActivityNotFoundException *new_ADActivityNotFoundException_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADActivityNotFoundException *create_ADActivityNotFoundException_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADActivityNotFoundException)

@compatibility_alias RAndroidContentActivityNotFoundException ADActivityNotFoundException;

#endif

#pragma pop_macro("INCLUDE_ALL_ActivityNotFoundException")
