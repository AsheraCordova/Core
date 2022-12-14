//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\Plugin_Converter\src\com\ashera\converter\IntConverter.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_IntConverter")
#ifdef RESTRICT_IntConverter
#define INCLUDE_ALL_IntConverter 0
#else
#define INCLUDE_ALL_IntConverter 1
#endif
#undef RESTRICT_IntConverter

#if !defined (ASIntConverter_) && (INCLUDE_ALL_IntConverter || defined(INCLUDE_ASIntConverter))
#define ASIntConverter_

#define RESTRICT_IConverter 1
#define INCLUDE_ASIConverter 1
#include "IConverter.h"

@class JavaLangInteger;
@protocol ASIFragment;
@protocol JavaUtilList;
@protocol JavaUtilMap;

@interface ASIntConverter : NSObject < ASIConverter >

#pragma mark Public

- (instancetype)init;

- (JavaLangInteger *)convertFromWithId:(id)value
                       withJavaUtilMap:(id<JavaUtilMap>)dependentAttributesMap
                       withASIFragment:(id<ASIFragment>)fragment;

- (JavaLangInteger *)convertToWithId:(JavaLangInteger *)value
                     withASIFragment:(id<ASIFragment>)fragment;

- (id<JavaUtilList>)getDependentAttributes;

@end

J2OBJC_EMPTY_STATIC_INIT(ASIntConverter)

FOUNDATION_EXPORT void ASIntConverter_init(ASIntConverter *self);

FOUNDATION_EXPORT ASIntConverter *new_ASIntConverter_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASIntConverter *create_ASIntConverter_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASIntConverter)

@compatibility_alias ComAsheraConverterIntConverter ASIntConverter;

#endif

#pragma pop_macro("INCLUDE_ALL_IntConverter")
