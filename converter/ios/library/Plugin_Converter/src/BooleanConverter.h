//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\Plugin_Converter\src\com\ashera\converter\BooleanConverter.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_BooleanConverter")
#ifdef RESTRICT_BooleanConverter
#define INCLUDE_ALL_BooleanConverter 0
#else
#define INCLUDE_ALL_BooleanConverter 1
#endif
#undef RESTRICT_BooleanConverter

#if !defined (ASBooleanConverter_) && (INCLUDE_ALL_BooleanConverter || defined(INCLUDE_ASBooleanConverter))
#define ASBooleanConverter_

#define RESTRICT_IConverter 1
#define INCLUDE_ASIConverter 1
#include "IConverter.h"

@class JavaLangBoolean;
@protocol ASIFragment;
@protocol JavaUtilList;
@protocol JavaUtilMap;

@interface ASBooleanConverter : NSObject < ASIConverter >

#pragma mark Public

- (instancetype)init;

- (JavaLangBoolean *)convertFromWithId:(id)value
                       withJavaUtilMap:(id<JavaUtilMap>)dependentAttributesMap
                       withASIFragment:(id<ASIFragment>)fragment;

- (JavaLangBoolean *)convertToWithId:(JavaLangBoolean *)value
                     withASIFragment:(id<ASIFragment>)fragment;

- (id<JavaUtilList>)getDependentAttributes;

@end

J2OBJC_EMPTY_STATIC_INIT(ASBooleanConverter)

FOUNDATION_EXPORT void ASBooleanConverter_init(ASBooleanConverter *self);

FOUNDATION_EXPORT ASBooleanConverter *new_ASBooleanConverter_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASBooleanConverter *create_ASBooleanConverter_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASBooleanConverter)

@compatibility_alias ComAsheraConverterBooleanConverter ASBooleanConverter;

#endif

#pragma pop_macro("INCLUDE_ALL_BooleanConverter")
