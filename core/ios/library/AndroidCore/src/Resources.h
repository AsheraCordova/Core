//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\stub\r\android\content\res\Resources.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_Resources")
#ifdef RESTRICT_Resources
#define INCLUDE_ALL_Resources 0
#else
#define INCLUDE_ALL_Resources 1
#endif
#undef RESTRICT_Resources

#if !defined (ADResources_) && (INCLUDE_ALL_Resources || defined(INCLUDE_ADResources))
#define ADResources_

@class ADConfiguration;
@class ADDisplayMetrics;
@protocol JavaLangCharSequence;

@interface ADResources : NSObject

#pragma mark Public

- (instancetype)init;

- (ADConfiguration *)getConfiguration;

- (ADDisplayMetrics *)getDisplayMetrics;

- (jint)getIdentifierWithNSString:(NSString *)string
                     withNSString:(NSString *)string2
                     withNSString:(NSString *)name;

- (NSString *)getResourceEntryNameWithInt:(jint)id_;

- (NSString *)getResourceNameWithInt:(jint)id_;

- (id<JavaLangCharSequence>)getStringWithInt:(jint)titleRes;

- (NSString *)getStringWithInt:(jint)resource
                  withNSString:(NSString *)text;

@end

J2OBJC_STATIC_INIT(ADResources)

inline ADDisplayMetrics *ADResources_get_displayMetric(void);
inline ADDisplayMetrics *ADResources_set_displayMetric(ADDisplayMetrics *value);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT ADDisplayMetrics *ADResources_displayMetric;
J2OBJC_STATIC_FIELD_OBJ(ADResources, displayMetric, ADDisplayMetrics *)

FOUNDATION_EXPORT void ADResources_init(ADResources *self);

FOUNDATION_EXPORT ADResources *new_ADResources_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADResources *create_ADResources_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADResources)

@compatibility_alias RAndroidContentResResources ADResources;

#endif

#if !defined (ADResources_Theme_) && (INCLUDE_ALL_Resources || defined(INCLUDE_ADResources_Theme))
#define ADResources_Theme_

@interface ADResources_Theme : NSObject

#pragma mark Public

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ADResources_Theme)

FOUNDATION_EXPORT void ADResources_Theme_init(ADResources_Theme *self);

FOUNDATION_EXPORT ADResources_Theme *new_ADResources_Theme_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADResources_Theme *create_ADResources_Theme_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADResources_Theme)

#endif

#if !defined (ADResources_NotFoundException_) && (INCLUDE_ALL_Resources || defined(INCLUDE_ADResources_NotFoundException))
#define ADResources_NotFoundException_

#define RESTRICT_JavaLangRuntimeException 1
#define INCLUDE_JavaLangRuntimeException 1
#include "java/lang/RuntimeException.h"

@class ADResources;
@class JavaLangThrowable;

@interface ADResources_NotFoundException : JavaLangRuntimeException

#pragma mark Public

- (instancetype)initWithADResources:(ADResources *)outer$;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

- (instancetype)initWithJavaLangThrowable:(JavaLangThrowable *)arg0 NS_UNAVAILABLE;

- (instancetype)initWithNSString:(NSString *)arg0 NS_UNAVAILABLE;

- (instancetype)initWithNSString:(NSString *)arg0
           withJavaLangThrowable:(JavaLangThrowable *)arg1 NS_UNAVAILABLE;

- (instancetype)initWithNSString:(NSString *)arg0
           withJavaLangThrowable:(JavaLangThrowable *)arg1
                     withBoolean:(jboolean)arg2
                     withBoolean:(jboolean)arg3 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADResources_NotFoundException)

FOUNDATION_EXPORT void ADResources_NotFoundException_initWithADResources_(ADResources_NotFoundException *self, ADResources *outer$);

FOUNDATION_EXPORT ADResources_NotFoundException *new_ADResources_NotFoundException_initWithADResources_(ADResources *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADResources_NotFoundException *create_ADResources_NotFoundException_initWithADResources_(ADResources *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ADResources_NotFoundException)

#endif

#pragma pop_macro("INCLUDE_ALL_Resources")
