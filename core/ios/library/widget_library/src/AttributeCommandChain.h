//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\widget\AttributeCommandChain.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_AttributeCommandChain")
#ifdef RESTRICT_AttributeCommandChain
#define INCLUDE_ALL_AttributeCommandChain 0
#else
#define INCLUDE_ALL_AttributeCommandChain 1
#endif
#undef RESTRICT_AttributeCommandChain

#if !defined (ASAttributeCommandChain_) && (INCLUDE_ALL_AttributeCommandChain || defined(INCLUDE_ASAttributeCommandChain))
#define ASAttributeCommandChain_

@class IOSObjectArray;
@protocol ASAttributeCommand;
@protocol ASIWidget;

@interface ASAttributeCommandChain : NSObject

#pragma mark Public

- (instancetype)init;

- (void)addCommandWithASAttributeCommand:(id<ASAttributeCommand>)command;

- (NSString *)getAttributeName;

- (NSString *)getOriginalStringValue;

- (id)getOriginalValue;

- (id)getValueWithASIWidget:(id<ASIWidget>)widget;

- (id)getValueWithASIWidget:(id<ASIWidget>)widget
                     withId:(id)nativeWidget
               withNSString:(NSString *)phase
          withNSObjectArray:(IOSObjectArray *)args;

- (id)getValueWithASIWidget:(id<ASIWidget>)widget
                     withId:(id)nativeWidget
               withNSString:(NSString *)phase
               withNSString:(NSString *)commandFilterRegex
          withNSObjectArray:(IOSObjectArray *)args;

- (void)removeCommandWithASAttributeCommand:(id<ASAttributeCommand>)executor;

- (void)setAttributeNameWithNSString:(NSString *)attributeName;

- (void)setOriginalStringValueWithNSString:(NSString *)originalStringValue;

- (void)setOriginalValueWithId:(id)originalValue;

@end

J2OBJC_EMPTY_STATIC_INIT(ASAttributeCommandChain)

FOUNDATION_EXPORT void ASAttributeCommandChain_init(ASAttributeCommandChain *self);

FOUNDATION_EXPORT ASAttributeCommandChain *new_ASAttributeCommandChain_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASAttributeCommandChain *create_ASAttributeCommandChain_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASAttributeCommandChain)

@compatibility_alias ComAsheraWidgetAttributeCommandChain ASAttributeCommandChain;

#endif

#pragma pop_macro("INCLUDE_ALL_AttributeCommandChain")
