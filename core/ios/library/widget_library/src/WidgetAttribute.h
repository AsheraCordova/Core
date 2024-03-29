//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\widget\WidgetAttribute.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_WidgetAttribute")
#ifdef RESTRICT_WidgetAttribute
#define INCLUDE_ALL_WidgetAttribute 0
#else
#define INCLUDE_ALL_WidgetAttribute 1
#endif
#undef RESTRICT_WidgetAttribute

#if !defined (ASWidgetAttribute_) && (INCLUDE_ALL_WidgetAttribute || defined(INCLUDE_ASWidgetAttribute))
#define ASWidgetAttribute_

@class ASWidgetAttribute_Builder;
@class JavaLangInteger;

@interface ASWidgetAttribute : NSObject

#pragma mark Public

/*!
 @brief Creates builder to build <code>WidgetAttribute</code>.
 @return created builder
 */
+ (ASWidgetAttribute_Builder *)builder;

- (jboolean)isEqual:(id)obj;

- (NSString *)getArrayListToFinalType;

- (NSString *)getArrayType;

- (NSString *)getAttributeName;

- (NSString *)getAttributeType;

- (jint)getBufferStrategy;

- (NSString *)getDecorator;

- (jint)getOrder;

- (jint)getSimpleWrapableViewStrategy;

- (JavaLangInteger *)getStylePriority;

- (jint)getUpdateUiFlag;

- (NSUInteger)hash;

- (jboolean)isApplyBeforeChildAdd;

- (jboolean)isForChild;

- (void)setArrayListToFinalTypeWithNSString:(NSString *)arrayListToFinalType;

- (void)setArrayTypeWithNSString:(NSString *)arrayType;

- (void)setAttributeNameWithNSString:(NSString *)attributeName;

- (void)setAttributeTypeWithNSString:(NSString *)attributeType;

- (void)setBufferStrategyWithInt:(jint)bufferStrategy;

- (void)setDecoratorWithNSString:(NSString *)decorator;

- (void)setForChildWithBoolean:(jboolean)isForChild;

- (void)setOrderWithInt:(jint)order;

- (void)setSimpleWrapableViewStrategyWithInt:(jint)simpleWrapableViewStrategy;

- (void)setUpdateUiFlagWithInt:(jint)updateUiFlag;

- (NSString *)description;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASWidgetAttribute)

FOUNDATION_EXPORT ASWidgetAttribute_Builder *ASWidgetAttribute_builder(void);

J2OBJC_TYPE_LITERAL_HEADER(ASWidgetAttribute)

@compatibility_alias ComAsheraWidgetWidgetAttribute ASWidgetAttribute;

#endif

#if !defined (ASWidgetAttribute_Builder_) && (INCLUDE_ALL_WidgetAttribute || defined(INCLUDE_ASWidgetAttribute_Builder))
#define ASWidgetAttribute_Builder_

@class ASWidgetAttribute;
@class JavaLangInteger;

/*!
 @brief Builder to build <code>WidgetAttribute</code>.
 */
@interface ASWidgetAttribute_Builder : NSObject

#pragma mark Public

- (instancetype)init;

- (ASWidgetAttribute_Builder *)beforeChildAdd;

- (ASWidgetAttribute *)build;

- (ASWidgetAttribute_Builder *)forChild;

- (ASWidgetAttribute_Builder *)withArrayListToFinalTypeWithNSString:(NSString *)arrayListToFinalType;

- (ASWidgetAttribute_Builder *)withArrayTypeWithNSString:(NSString *)arrayType;

- (ASWidgetAttribute_Builder *)withBufferStrategyWithInt:(jint)bufferStrategy;

- (ASWidgetAttribute_Builder *)withDecoratorWithNSString:(NSString *)decorator;

- (ASWidgetAttribute_Builder *)withNameWithNSString:(NSString *)attributeName;

- (ASWidgetAttribute_Builder *)withOrderWithInt:(jint)order;

- (ASWidgetAttribute_Builder *)withSimpleWrapableViewStrategyWithInt:(jint)simpleWrapableViewStrategy;

- (ASWidgetAttribute_Builder *)withStylePriorityWithJavaLangInteger:(JavaLangInteger *)stylePriority;

- (ASWidgetAttribute_Builder *)withTypeWithNSString:(NSString *)attributeType;

- (ASWidgetAttribute_Builder *)withUiFlagWithInt:(jint)updateUiFlag;

@end

J2OBJC_EMPTY_STATIC_INIT(ASWidgetAttribute_Builder)

FOUNDATION_EXPORT void ASWidgetAttribute_Builder_init(ASWidgetAttribute_Builder *self);

FOUNDATION_EXPORT ASWidgetAttribute_Builder *new_ASWidgetAttribute_Builder_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASWidgetAttribute_Builder *create_ASWidgetAttribute_Builder_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASWidgetAttribute_Builder)

#endif

#pragma pop_macro("INCLUDE_ALL_WidgetAttribute")
