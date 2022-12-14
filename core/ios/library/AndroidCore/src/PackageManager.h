//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\stub\r\android\content\pm\PackageManager.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_PackageManager")
#ifdef RESTRICT_PackageManager
#define INCLUDE_ALL_PackageManager 0
#else
#define INCLUDE_ALL_PackageManager 1
#endif
#undef RESTRICT_PackageManager

#if !defined (ADPackageManager_) && (INCLUDE_ALL_PackageManager || defined(INCLUDE_ADPackageManager))
#define ADPackageManager_

@class ADApplicationInfo;
@class ADPackageManager_PackageInfo;

@interface ADPackageManager : NSObject

#pragma mark Public

- (instancetype)init;

- (ADApplicationInfo *)getApplicationInfoWithNSString:(NSString *)packageName
                                         withNSString:(NSString *)getMetaData;

- (ADPackageManager_PackageInfo *)getPackageInfoWithNSString:(NSString *)packageName
                                                     withInt:(jint)i;

@end

J2OBJC_EMPTY_STATIC_INIT(ADPackageManager)

inline jint ADPackageManager_get_PERMISSION_GRANTED(void);
#define ADPackageManager_PERMISSION_GRANTED 0
J2OBJC_STATIC_FIELD_CONSTANT(ADPackageManager, PERMISSION_GRANTED, jint)

inline NSString *ADPackageManager_get_GET_META_DATA(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ADPackageManager_GET_META_DATA;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ADPackageManager, GET_META_DATA, NSString *)

FOUNDATION_EXPORT void ADPackageManager_init(ADPackageManager *self);

FOUNDATION_EXPORT ADPackageManager *new_ADPackageManager_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADPackageManager *create_ADPackageManager_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADPackageManager)

@compatibility_alias RAndroidContentPmPackageManager ADPackageManager;

#endif

#if !defined (ADPackageManager_NameNotFoundException_) && (INCLUDE_ALL_PackageManager || defined(INCLUDE_ADPackageManager_NameNotFoundException))
#define ADPackageManager_NameNotFoundException_

#define RESTRICT_JavaLangRuntimeException 1
#define INCLUDE_JavaLangRuntimeException 1
#include "java/lang/RuntimeException.h"

@class JavaLangThrowable;

@interface ADPackageManager_NameNotFoundException : JavaLangRuntimeException

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

J2OBJC_EMPTY_STATIC_INIT(ADPackageManager_NameNotFoundException)

FOUNDATION_EXPORT void ADPackageManager_NameNotFoundException_init(ADPackageManager_NameNotFoundException *self);

FOUNDATION_EXPORT ADPackageManager_NameNotFoundException *new_ADPackageManager_NameNotFoundException_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADPackageManager_NameNotFoundException *create_ADPackageManager_NameNotFoundException_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADPackageManager_NameNotFoundException)

#endif

#if !defined (ADPackageManager_PackageInfo_) && (INCLUDE_ALL_PackageManager || defined(INCLUDE_ADPackageManager_PackageInfo))
#define ADPackageManager_PackageInfo_

@class ADPackageManager;

@interface ADPackageManager_PackageInfo : NSObject {
 @public
  jint versionCode_;
}

#pragma mark Public

- (instancetype)initWithADPackageManager:(ADPackageManager *)outer$;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADPackageManager_PackageInfo)

FOUNDATION_EXPORT void ADPackageManager_PackageInfo_initWithADPackageManager_(ADPackageManager_PackageInfo *self, ADPackageManager *outer$);

FOUNDATION_EXPORT ADPackageManager_PackageInfo *new_ADPackageManager_PackageInfo_initWithADPackageManager_(ADPackageManager *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADPackageManager_PackageInfo *create_ADPackageManager_PackageInfo_initWithADPackageManager_(ADPackageManager *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ADPackageManager_PackageInfo)

#endif

#pragma pop_macro("INCLUDE_ALL_PackageManager")
