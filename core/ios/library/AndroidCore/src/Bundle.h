//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\os\Bundle.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_Bundle")
#ifdef RESTRICT_Bundle
#define INCLUDE_ALL_Bundle 0
#else
#define INCLUDE_ALL_Bundle 1
#endif
#undef RESTRICT_Bundle

#if !defined (ADBundle_) && (INCLUDE_ALL_Bundle || defined(INCLUDE_ADBundle))
#define ADBundle_

@interface ADBundle : NSObject

#pragma mark Public

- (instancetype)init;

- (instancetype)initWithADBundle:(ADBundle *)data;

- (id)java_clone;

- (id)getWithNSString:(NSString *)key;

- (ADBundle *)getBundleWithNSString:(NSString *)name;

- (jfloat)getFloatWithNSString:(NSString *)key;

- (jint)getIntWithNSString:(NSString *)key;

- (id)getSerializableWithNSString:(NSString *)key;

- (NSString *)getStringWithNSString:(NSString *)name;

- (void)putBundleWithNSString:(NSString *)name
                 withADBundle:(ADBundle *)onSaveInstanceState;

- (void)putBundleWithNSString:(NSString *)name
                 withNSString:(NSString *)value;

- (void)putFloatWithNSString:(NSString *)name
                   withFloat:(jfloat)value;

- (void)putIntWithNSString:(NSString *)name
                   withInt:(jint)value;

- (void)putObjectWithNSString:(NSString *)name
                       withId:(id)value;

- (void)putSerializableWithNSString:(NSString *)name
                             withId:(id)value;

- (void)putStringWithNSString:(NSString *)name
                 withNSString:(NSString *)value;

@end

J2OBJC_EMPTY_STATIC_INIT(ADBundle)

FOUNDATION_EXPORT void ADBundle_initWithADBundle_(ADBundle *self, ADBundle *data);

FOUNDATION_EXPORT ADBundle *new_ADBundle_initWithADBundle_(ADBundle *data) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADBundle *create_ADBundle_initWithADBundle_(ADBundle *data);

FOUNDATION_EXPORT void ADBundle_init(ADBundle *self);

FOUNDATION_EXPORT ADBundle *new_ADBundle_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADBundle *create_ADBundle_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADBundle)

@compatibility_alias RAndroidOsBundle ADBundle;

#endif

#pragma pop_macro("INCLUDE_ALL_Bundle")
