//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\com\ashera\drawable\ColorStateListFactory.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ColorStateListFactory")
#ifdef RESTRICT_ColorStateListFactory
#define INCLUDE_ALL_ColorStateListFactory 0
#else
#define INCLUDE_ALL_ColorStateListFactory 1
#endif
#undef RESTRICT_ColorStateListFactory

#if !defined (ASColorStateListFactory_) && (INCLUDE_ALL_ColorStateListFactory || defined(INCLUDE_ASColorStateListFactory))
#define ASColorStateListFactory_

@class ADColorStateList;
@protocol ASIFragment;
@protocol JavaUtilMap;

@interface ASColorStateListFactory : NSObject

#pragma mark Public

- (instancetype)init;

+ (ADColorStateList *)getColorWithJavaUtilMap:(id<JavaUtilMap>)colorMap
                              withASIFragment:(id<ASIFragment>)fragment;

@end

J2OBJC_STATIC_INIT(ASColorStateListFactory)

FOUNDATION_EXPORT void ASColorStateListFactory_init(ASColorStateListFactory *self);

FOUNDATION_EXPORT ASColorStateListFactory *new_ASColorStateListFactory_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASColorStateListFactory *create_ASColorStateListFactory_init(void);

FOUNDATION_EXPORT ADColorStateList *ASColorStateListFactory_getColorWithJavaUtilMap_withASIFragment_(id<JavaUtilMap> colorMap, id<ASIFragment> fragment);

J2OBJC_TYPE_LITERAL_HEADER(ASColorStateListFactory)

@compatibility_alias ComAsheraDrawableColorStateListFactory ASColorStateListFactory;

#endif

#pragma pop_macro("INCLUDE_ALL_ColorStateListFactory")
