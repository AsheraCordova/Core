//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\stub\r\android\view\WindowManager.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_WindowManager")
#ifdef RESTRICT_WindowManager
#define INCLUDE_ALL_WindowManager 0
#else
#define INCLUDE_ALL_WindowManager 1
#endif
#undef RESTRICT_WindowManager

#if !defined (ADWindowManager_) && (INCLUDE_ALL_WindowManager || defined(INCLUDE_ADWindowManager))
#define ADWindowManager_

@interface ADWindowManager : NSObject

#pragma mark Public

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ADWindowManager)

FOUNDATION_EXPORT void ADWindowManager_init(ADWindowManager *self);

FOUNDATION_EXPORT ADWindowManager *new_ADWindowManager_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADWindowManager *create_ADWindowManager_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADWindowManager)

@compatibility_alias RAndroidViewWindowManager ADWindowManager;

#endif

#if !defined (ADWindowManager_LayoutParams_) && (INCLUDE_ALL_WindowManager || defined(INCLUDE_ADWindowManager_LayoutParams))
#define ADWindowManager_LayoutParams_

@interface ADWindowManager_LayoutParams : NSObject

#pragma mark Public

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ADWindowManager_LayoutParams)

inline jint ADWindowManager_LayoutParams_get_FLAG_FULLSCREEN(void);
#define ADWindowManager_LayoutParams_FLAG_FULLSCREEN 0
J2OBJC_STATIC_FIELD_CONSTANT(ADWindowManager_LayoutParams, FLAG_FULLSCREEN, jint)

inline jint ADWindowManager_LayoutParams_get_FLAG_FORCE_NOT_FULLSCREEN(void);
#define ADWindowManager_LayoutParams_FLAG_FORCE_NOT_FULLSCREEN 0
J2OBJC_STATIC_FIELD_CONSTANT(ADWindowManager_LayoutParams, FLAG_FORCE_NOT_FULLSCREEN, jint)

FOUNDATION_EXPORT void ADWindowManager_LayoutParams_init(ADWindowManager_LayoutParams *self);

FOUNDATION_EXPORT ADWindowManager_LayoutParams *new_ADWindowManager_LayoutParams_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADWindowManager_LayoutParams *create_ADWindowManager_LayoutParams_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADWindowManager_LayoutParams)

#endif

#pragma pop_macro("INCLUDE_ALL_WindowManager")
