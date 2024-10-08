//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\IOSConverter\src\main\java\com\ashera\converter\ColorIntConverter.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ColorIntConverter")
#ifdef RESTRICT_ColorIntConverter
#define INCLUDE_ALL_ColorIntConverter 0
#else
#define INCLUDE_ALL_ColorIntConverter 1
#endif
#undef RESTRICT_ColorIntConverter

#if !defined (ASColorIntConverter_) && (INCLUDE_ALL_ColorIntConverter || defined(INCLUDE_ASColorIntConverter))
#define ASColorIntConverter_

#define RESTRICT_IConverter 1
#define INCLUDE_ASIConverter 1
#include "IConverter.h"

@class JavaLangInteger;
@class JavaUtilResourceBundle;
@protocol ASIFragment;
@protocol JavaUtilList;
@protocol JavaUtilMap;

@interface ASColorIntConverter : NSObject < ASIConverter > {
 @public
  JavaUtilResourceBundle *resourceBundle_;
}

#pragma mark Public

- (instancetype)init;

- (JavaLangInteger *)convertFromWithId:(NSString *)value
                       withJavaUtilMap:(id<JavaUtilMap>)dependentAttributesMap
                       withASIFragment:(id<ASIFragment>)fragment;

- (NSString *)convertToWithId:(JavaLangInteger *)value
              withASIFragment:(id<ASIFragment>)fragment;

- (id<JavaUtilList>)getDependentAttributes;

@end

J2OBJC_EMPTY_STATIC_INIT(ASColorIntConverter)

J2OBJC_FIELD_SETTER(ASColorIntConverter, resourceBundle_, JavaUtilResourceBundle *)

FOUNDATION_EXPORT void ASColorIntConverter_init(ASColorIntConverter *self);

FOUNDATION_EXPORT ASColorIntConverter *new_ASColorIntConverter_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASColorIntConverter *create_ASColorIntConverter_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASColorIntConverter)

@compatibility_alias ComAsheraConverterColorIntConverter ASColorIntConverter;

#endif

#pragma pop_macro("INCLUDE_ALL_ColorIntConverter")
