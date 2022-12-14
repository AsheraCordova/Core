//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\attributedtext\AugmentedIntervalTree.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_AugmentedIntervalTree")
#ifdef RESTRICT_AugmentedIntervalTree
#define INCLUDE_ALL_AugmentedIntervalTree 0
#else
#define INCLUDE_ALL_AugmentedIntervalTree 1
#endif
#undef RESTRICT_AugmentedIntervalTree

#if !defined (ASAugmentedIntervalTree_) && (INCLUDE_ALL_AugmentedIntervalTree || defined(INCLUDE_ASAugmentedIntervalTree))
#define ASAugmentedIntervalTree_

@class ASInterval;
@class ASWidgetAttributeMap;
@protocol ASAttributedString;
@protocol ASIFragment;
@protocol JavaUtilList;
@protocol JavaUtilMap;

@interface ASAugmentedIntervalTree : NSObject

#pragma mark Public

- (instancetype)initWithJavaUtilMap:(id<JavaUtilMap>)htmlConfig
                    withASIFragment:(id<ASIFragment>)fragment;

- (void)applyWithASAttributedString:(id<ASAttributedString>)spannableString;

- (void)applyWithASInterval:(ASInterval *)tmp
     withASAttributedString:(id<ASAttributedString>)spannableString;

- (id<JavaUtilMap>)getStyleWithASWidgetAttributeMap:(ASWidgetAttributeMap *)inlineStyle;

- (NSString *)getText;

- (void)insertNodeWithASInterval:(ASInterval *)newNode;

- (ASInterval *)insertNodeWithASInterval:(ASInterval *)tmp
                          withASInterval:(ASInterval *)newNode;

- (void)intersectIntervalWithASInterval:(ASInterval *)tmp
                         withASInterval:(ASInterval *)i
                       withJavaUtilList:(id<JavaUtilList>)res;

- (void)printTree;

- (void)printTreeWithASInterval:(ASInterval *)tmp;

- (void)setTextWithNSString:(NSString *)text;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASAugmentedIntervalTree)

FOUNDATION_EXPORT void ASAugmentedIntervalTree_initWithJavaUtilMap_withASIFragment_(ASAugmentedIntervalTree *self, id<JavaUtilMap> htmlConfig, id<ASIFragment> fragment);

FOUNDATION_EXPORT ASAugmentedIntervalTree *new_ASAugmentedIntervalTree_initWithJavaUtilMap_withASIFragment_(id<JavaUtilMap> htmlConfig, id<ASIFragment> fragment) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASAugmentedIntervalTree *create_ASAugmentedIntervalTree_initWithJavaUtilMap_withASIFragment_(id<JavaUtilMap> htmlConfig, id<ASIFragment> fragment);

J2OBJC_TYPE_LITERAL_HEADER(ASAugmentedIntervalTree)

@compatibility_alias ComAsheraAttributedtextAugmentedIntervalTree ASAugmentedIntervalTree;

#endif

#pragma pop_macro("INCLUDE_ALL_AugmentedIntervalTree")
