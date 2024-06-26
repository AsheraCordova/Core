//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\core\IFragment.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_IFragment")
#ifdef RESTRICT_IFragment
#define INCLUDE_ALL_IFragment 0
#else
#define INCLUDE_ALL_IFragment 1
#endif
#undef RESTRICT_IFragment

#if !defined (ASIFragment_) && (INCLUDE_ALL_IFragment || defined(INCLUDE_ASIFragment))
#define ASIFragment_

@class ASError;
@class ASEventBus;
@class IOSClass;
@protocol ASIActivity;
@protocol ASIWidget;
@protocol CSSStyleSheet;
@protocol JavaUtilList;

@protocol ASIFragment < JavaObject >

- (NSString *)getFragmentId;

- (NSString *)getActionUrl;

- (void)onAttachWithASIActivity:(id<ASIActivity>)activity;

- (void)onDetach;

- (void)onCreate;

- (void)onDestroy;

- (void)onResume;

- (void)onPause;

- (void)onCloseDialog;

- (id)onCreateViewWithBoolean:(jboolean)measure;

- (id<ASIFragment>)getRootFragment;

- (ASEventBus *)getEventBus;

- (id<ASIWidget>)getRootWidget;

- (jboolean)hasDevDataWithNSString:(NSString *)key;

- (id)getDevDataWithNSString:(NSString *)key;

- (id<ASIActivity>)getRootActivity;

- (id)getArgumentsBundle;

- (void)setRootWidgetWithASIWidget:(id<ASIWidget>)widget;

- (void)storeUserDataWithNSString:(NSString *)varName
                           withId:(id)objValue;

- (id)getUserDataWithNSString:(NSString *)varName;

- (void)storeInTempCacheWithNSString:(NSString *)varName
                              withId:(id)objValue;

- (id)getFromTempCacheWithNSString:(NSString *)varName;

- (id)getParentForRootWidget;

- (id<CSSStyleSheet>)getStyleSheet;

- (void)setStyleSheetWithCSSStyleSheet:(id<CSSStyleSheet>)styleSheet;

- (jboolean)isViewLoaded;

- (void)setFrameWithInt:(jint)x
                withInt:(jint)y
                withInt:(jint)width
                withInt:(jint)height;

- (void)remeasure;

- (void)disableRemeasure;

- (void)enableRemeasure;

- (id<JavaUtilList>)getDisposables;

- (void)addDisposableWithId:(id)disposable;

- (void)addListenerWithASIWidget:(id<ASIWidget>)widget
                          withId:(id)listener;

- (id<JavaUtilList>)getListenerWithIOSClass:(IOSClass *)type;

- (id<JavaUtilList>)getListenerWithASIWidget:(id<ASIWidget>)widget
                                withIOSClass:(IOSClass *)type;

- (void)removeListenerWithASIWidget:(id<ASIWidget>)widget
                             withId:(id)listener;

- (void)addErrorWithASError:(ASError *)error;

- (jboolean)hasErrors;

- (void)resizeWindowWithInt:(jint)width
                    withInt:(jint)height;

- (NSString *)getInlineResourceWithNSString:(NSString *)key;

- (void)setInlineResourceWithNSString:(NSString *)key
                         withNSString:(NSString *)value
                          withBoolean:(jboolean)append;

- (id<ASIFragment>)getParent;

- (NSString *)getUId;

@end

J2OBJC_EMPTY_STATIC_INIT(ASIFragment)

J2OBJC_TYPE_LITERAL_HEADER(ASIFragment)

#define ComAsheraCoreIFragment ASIFragment

#endif

#pragma pop_macro("INCLUDE_ALL_IFragment")
