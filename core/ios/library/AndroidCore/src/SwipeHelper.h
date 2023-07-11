//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\com\ashera\layout\SwipeHelper.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_SwipeHelper")
#ifdef RESTRICT_SwipeHelper
#define INCLUDE_ALL_SwipeHelper 0
#else
#define INCLUDE_ALL_SwipeHelper 1
#endif
#undef RESTRICT_SwipeHelper

#if !defined (ASSwipeHelper_) && (INCLUDE_ALL_SwipeHelper || defined(INCLUDE_ASSwipeHelper))
#define ASSwipeHelper_

@protocol ASSwipeHelper_SwipeListener;

@interface ASSwipeHelper : NSObject

#pragma mark Public

- (instancetype)initWithInt:(jint)swipedThreshold;

- (jint)getSwipedThreshold;

- (void)onActionDownWithFloat:(jfloat)x
                    withFloat:(jfloat)y;

- (jboolean)onActionUpWithFloat:(jfloat)x
                      withFloat:(jfloat)y;

- (void)setListenerWithASSwipeHelper_SwipeListener:(id<ASSwipeHelper_SwipeListener>)swipeListener;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASSwipeHelper)

FOUNDATION_EXPORT void ASSwipeHelper_initWithInt_(ASSwipeHelper *self, jint swipedThreshold);

FOUNDATION_EXPORT ASSwipeHelper *new_ASSwipeHelper_initWithInt_(jint swipedThreshold) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASSwipeHelper *create_ASSwipeHelper_initWithInt_(jint swipedThreshold);

J2OBJC_TYPE_LITERAL_HEADER(ASSwipeHelper)

@compatibility_alias ComAsheraLayoutSwipeHelper ASSwipeHelper;

#endif

#if !defined (ASSwipeHelper_SwipeListener_) && (INCLUDE_ALL_SwipeHelper || defined(INCLUDE_ASSwipeHelper_SwipeListener))
#define ASSwipeHelper_SwipeListener_

@protocol ASSwipeHelper_SwipeListener < JavaObject >

- (jboolean)onSwipedWithNSString:(NSString *)direction;

@end

J2OBJC_EMPTY_STATIC_INIT(ASSwipeHelper_SwipeListener)

J2OBJC_TYPE_LITERAL_HEADER(ASSwipeHelper_SwipeListener)

#endif

#pragma pop_macro("INCLUDE_ALL_SwipeHelper")
