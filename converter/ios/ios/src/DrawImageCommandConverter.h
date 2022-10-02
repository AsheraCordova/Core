//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\IOSConverter\src\main\java\com\ashera\converter\DrawImageCommandConverter.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_DrawImageCommandConverter")
#ifdef RESTRICT_DrawImageCommandConverter
#define INCLUDE_ALL_DrawImageCommandConverter 0
#else
#define INCLUDE_ALL_DrawImageCommandConverter 1
#endif
#undef RESTRICT_DrawImageCommandConverter

#if !defined (ASDrawImageCommandConverter_) && (INCLUDE_ALL_DrawImageCommandConverter || defined(INCLUDE_ASDrawImageCommandConverter))
#define ASDrawImageCommandConverter_

#define RESTRICT_BaseAttributeCommand 1
#define INCLUDE_ASBaseAttributeCommand 1
#include "BaseAttributeCommand.h"

@class IOSObjectArray;
@protocol ASAttributeCommand;
@protocol ASIWidget;

@interface ASDrawImageCommandConverter : ASBaseAttributeCommand

#pragma mark Public

- (instancetype)initWithNSString:(NSString *)id_;

- (jboolean)executeAfterPostMeasure;

- (id)modifyValueWithASIWidget:(id<ASIWidget>)widget
                        withId:(id)nativeView
                  withNSString:(NSString *)phase
                  withNSString:(NSString *)attributeName
                        withId:(id)value;

- (id<ASAttributeCommand>)newInstanceWithNSObjectArray:(IOSObjectArray *)args OBJC_METHOD_FAMILY_NONE;

- (void)updateArgsWithNSObjectArray:(IOSObjectArray *)args;

- (void)updatePhaseArgsWithNSObjectArray:(IOSObjectArray *)args;

@end

J2OBJC_EMPTY_STATIC_INIT(ASDrawImageCommandConverter)

FOUNDATION_EXPORT void ASDrawImageCommandConverter_initWithNSString_(ASDrawImageCommandConverter *self, NSString *id_);

FOUNDATION_EXPORT ASDrawImageCommandConverter *new_ASDrawImageCommandConverter_initWithNSString_(NSString *id_) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASDrawImageCommandConverter *create_ASDrawImageCommandConverter_initWithNSString_(NSString *id_);

J2OBJC_TYPE_LITERAL_HEADER(ASDrawImageCommandConverter)

@compatibility_alias ComAsheraConverterDrawImageCommandConverter ASDrawImageCommandConverter;

#endif

#pragma pop_macro("INCLUDE_ALL_DrawImageCommandConverter")
