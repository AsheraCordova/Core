//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\util\ContainerHelpers.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ContainerHelpers")
#ifdef RESTRICT_ContainerHelpers
#define INCLUDE_ALL_ContainerHelpers 0
#else
#define INCLUDE_ALL_ContainerHelpers 1
#endif
#undef RESTRICT_ContainerHelpers

#if !defined (ADContainerHelpers_) && (INCLUDE_ALL_ContainerHelpers || defined(INCLUDE_ADContainerHelpers))
#define ADContainerHelpers_

@class IOSIntArray;
@class IOSLongArray;

@interface ADContainerHelpers : NSObject

#pragma mark Package-Private

- (instancetype)initPackagePrivate;

+ (jint)binarySearchWithIntArray:(IOSIntArray *)array
                         withInt:(jint)size
                         withInt:(jint)value;

+ (jint)binarySearchWithLongArray:(IOSLongArray *)array
                          withInt:(jint)size
                         withLong:(jlong)value;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADContainerHelpers)

FOUNDATION_EXPORT void ADContainerHelpers_initPackagePrivate(ADContainerHelpers *self);

FOUNDATION_EXPORT ADContainerHelpers *new_ADContainerHelpers_initPackagePrivate(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADContainerHelpers *create_ADContainerHelpers_initPackagePrivate(void);

FOUNDATION_EXPORT jint ADContainerHelpers_binarySearchWithIntArray_withInt_withInt_(IOSIntArray *array, jint size, jint value);

FOUNDATION_EXPORT jint ADContainerHelpers_binarySearchWithLongArray_withInt_withLong_(IOSLongArray *array, jint size, jlong value);

J2OBJC_TYPE_LITERAL_HEADER(ADContainerHelpers)

@compatibility_alias RAndroidUtilContainerHelpers ADContainerHelpers;

#endif

#pragma pop_macro("INCLUDE_ALL_ContainerHelpers")
