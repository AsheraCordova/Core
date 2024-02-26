//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\view\ViewTreeObserver.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ViewTreeObserver")
#ifdef RESTRICT_ViewTreeObserver
#define INCLUDE_ALL_ViewTreeObserver 0
#else
#define INCLUDE_ALL_ViewTreeObserver 1
#endif
#undef RESTRICT_ViewTreeObserver

#if !defined (ADViewTreeObserver_) && (INCLUDE_ALL_ViewTreeObserver || defined(INCLUDE_ADViewTreeObserver))
#define ADViewTreeObserver_

@class ADContext;
@protocol ADViewTreeObserver_OnPreDrawListener;
@protocol ADViewTreeObserver_OnScrollChangedListener;

@interface ADViewTreeObserver : NSObject

#pragma mark Public

- (instancetype)initWithADContext:(ADContext *)mContext;

- (void)addOnPreDrawListenerWithADViewTreeObserver_OnPreDrawListener:(id<ADViewTreeObserver_OnPreDrawListener>)listener;

- (void)addOnScrollChangedListenerWithADViewTreeObserver_OnScrollChangedListener:(id<ADViewTreeObserver_OnScrollChangedListener>)listener;

- (void)dispatchOnScrollChanged;

- (jboolean)isAlive;

- (void)removeOnPreDrawListenerWithADViewTreeObserver_OnPreDrawListener:(id<ADViewTreeObserver_OnPreDrawListener>)victim;

- (void)removeOnScrollChangedListenerWithADViewTreeObserver_OnScrollChangedListener:(id<ADViewTreeObserver_OnScrollChangedListener>)victim;

#pragma mark Package-Private

- (void)mergeWithADViewTreeObserver:(ADViewTreeObserver *)observer;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADViewTreeObserver)

FOUNDATION_EXPORT void ADViewTreeObserver_initWithADContext_(ADViewTreeObserver *self, ADContext *mContext);

FOUNDATION_EXPORT ADViewTreeObserver *new_ADViewTreeObserver_initWithADContext_(ADContext *mContext) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADViewTreeObserver *create_ADViewTreeObserver_initWithADContext_(ADContext *mContext);

J2OBJC_TYPE_LITERAL_HEADER(ADViewTreeObserver)

@compatibility_alias RAndroidViewViewTreeObserver ADViewTreeObserver;

#endif

#if !defined (ADViewTreeObserver_OnPreDrawListener_) && (INCLUDE_ALL_ViewTreeObserver || defined(INCLUDE_ADViewTreeObserver_OnPreDrawListener))
#define ADViewTreeObserver_OnPreDrawListener_

@protocol ADViewTreeObserver_OnPreDrawListener < JavaObject >

- (jboolean)onPreDraw;

@end

J2OBJC_EMPTY_STATIC_INIT(ADViewTreeObserver_OnPreDrawListener)

J2OBJC_TYPE_LITERAL_HEADER(ADViewTreeObserver_OnPreDrawListener)

#endif

#if !defined (ADViewTreeObserver_OnScrollChangedListener_) && (INCLUDE_ALL_ViewTreeObserver || defined(INCLUDE_ADViewTreeObserver_OnScrollChangedListener))
#define ADViewTreeObserver_OnScrollChangedListener_

@protocol ADViewTreeObserver_OnScrollChangedListener < JavaObject >

- (void)onScrollChanged;

@end

J2OBJC_EMPTY_STATIC_INIT(ADViewTreeObserver_OnScrollChangedListener)

J2OBJC_TYPE_LITERAL_HEADER(ADViewTreeObserver_OnScrollChangedListener)

#endif

#if !defined (ADViewTreeObserver_CopyOnWriteArray_) && (INCLUDE_ALL_ViewTreeObserver || defined(INCLUDE_ADViewTreeObserver_CopyOnWriteArray))
#define ADViewTreeObserver_CopyOnWriteArray_

@class ADViewTreeObserver_Access;

@interface ADViewTreeObserver_CopyOnWriteArray : NSObject

#pragma mark Package-Private

- (instancetype)init;

- (void)addWithId:(id)item;

- (void)addAllWithADViewTreeObserver_CopyOnWriteArray:(ADViewTreeObserver_CopyOnWriteArray *)array;

- (void)clear;

- (void)end;

- (void)removeWithId:(id)item;

- (jint)size;

- (ADViewTreeObserver_Access *)start;

@end

J2OBJC_EMPTY_STATIC_INIT(ADViewTreeObserver_CopyOnWriteArray)

FOUNDATION_EXPORT void ADViewTreeObserver_CopyOnWriteArray_init(ADViewTreeObserver_CopyOnWriteArray *self);

FOUNDATION_EXPORT ADViewTreeObserver_CopyOnWriteArray *new_ADViewTreeObserver_CopyOnWriteArray_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADViewTreeObserver_CopyOnWriteArray *create_ADViewTreeObserver_CopyOnWriteArray_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADViewTreeObserver_CopyOnWriteArray)

#endif

#if !defined (ADViewTreeObserver_Access_) && (INCLUDE_ALL_ViewTreeObserver || defined(INCLUDE_ADViewTreeObserver_Access))
#define ADViewTreeObserver_Access_

@interface ADViewTreeObserver_Access : NSObject

#pragma mark Package-Private

- (instancetype)init;

- (id)getWithInt:(jint)index;

- (jint)size;

@end

J2OBJC_EMPTY_STATIC_INIT(ADViewTreeObserver_Access)

FOUNDATION_EXPORT void ADViewTreeObserver_Access_init(ADViewTreeObserver_Access *self);

FOUNDATION_EXPORT ADViewTreeObserver_Access *new_ADViewTreeObserver_Access_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADViewTreeObserver_Access *create_ADViewTreeObserver_Access_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADViewTreeObserver_Access)

#endif

#pragma pop_macro("INCLUDE_ALL_ViewTreeObserver")