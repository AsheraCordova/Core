//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\IOSCorePlugin\src\main\java\com\ashera\core\GenericFragment.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_GenericFragment")
#ifdef RESTRICT_GenericFragment
#define INCLUDE_ALL_GenericFragment 0
#else
#define INCLUDE_ALL_GenericFragment 1
#endif
#undef RESTRICT_GenericFragment

#if !defined (ASGenericFragment_) && (INCLUDE_ALL_GenericFragment || defined(INCLUDE_ASGenericFragment))
#define ASGenericFragment_

#define RESTRICT_Fragment 1
#define INCLUDE_ADXFragment 1
#include "Fragment.h"

#define RESTRICT_IFragment 1
#define INCLUDE_ASIFragment 1
#include "IFragment.h"

@class ADBundle;
@class ADContext;
@class ADLayoutInflater;
@class ADView;
@class ADViewGroup;
@class ASError;
@class ASEventBus;
@class IOSClass;
@class JavaUtilProperties;
@protocol ASIActivity;
@protocol ASIWidget;
@protocol CSSStyleSheet;
@protocol JavaUtilList;
@protocol JavaUtilMap;

@interface ASGenericFragment : ADXFragment < ASIFragment >

#pragma mark Public

- (instancetype)init;

- (void)addDisposableWithId:(id)disposable;

- (void)addErrorWithASError:(ASError *)error;

- (void)addListenerWithASIWidget:(id<ASIWidget>)widget
                          withId:(id)listener;

- (void)clear;

- (void)createChildFragments;

- (void)disableRemeasure;

- (void)enableRemeasure;

- (NSString *)getActionUrl;

- (id)getArgumentsBundle;

- (id)getDevDataWithNSString:(NSString *)key;

- (id<JavaUtilList>)getDisposables;

- (ASEventBus *)getEventBus;

- (JavaUtilProperties *)getFileAsPropertiesWithNSString:(NSString *)property
                                        withJavaUtilMap:(id<JavaUtilMap>)resultMap;

- (NSString *)getFragmentId;

- (id)getFromTempCacheWithNSString:(NSString *)key;

+ (ADBundle *)getInitialBundleWithNSString:(NSString *)resId
                              withNSString:(NSString *)fileName
                          withJavaUtilList:(id<JavaUtilList>)scopedObjects;

- (NSString *)getInlineResourceWithNSString:(NSString *)key;

- (id<JavaUtilList>)getListenerWithIOSClass:(IOSClass *)type;

- (id<JavaUtilList>)getListenerWithASIWidget:(id<ASIWidget>)widget
                                withIOSClass:(IOSClass *)type;

- (id<ASIFragment>)getParent;

- (id)getParentForRootWidget;

- (id<ASIActivity>)getRootActivity;

- (id<ASIFragment>)getRootFragment;

- (id<ASIWidget>)getRootWidget;

- (id<CSSStyleSheet>)getStyleSheet;

- (NSString *)getUId;

- (id)getUserDataWithNSString:(NSString *)key;

- (jboolean)hasDevDataWithNSString:(NSString *)key;

- (jboolean)hasErrors;

- (jboolean)isMeasuring;

- (jboolean)isViewLoaded;

- (void)onActivityCreatedWithADBundle:(ADBundle *)savedInstanceState;

- (void)onAttachWithADContext:(ADContext *)context;

- (void)onAttachWithASIActivity:(id<ASIActivity>)activity;

- (void)onCloseDialog;

- (void)onCreate;

- (void)onCreateWithADBundle:(ADBundle *)savedInstanceState;

- (id)onCreateViewWithBoolean:(jboolean)measure;

- (ADView *)onCreateViewWithADLayoutInflater:(ADLayoutInflater *)inflater
                             withADViewGroup:(ADViewGroup *)parent
                                withADBundle:(ADBundle *)savedInstanceState;

- (void)onDestroy;

- (void)onDetach;

- (void)onPause;

- (void)onResume;

- (void)onViewCreatedWithADView:(ADView *)view
                   withADBundle:(ADBundle *)savedInstanceState;

- (void)remeasure;

- (void)removeListenerWithASIWidget:(id<ASIWidget>)widget
                             withId:(id)listener;

- (void)resizeWindowWithInt:(jint)width
                    withInt:(jint)height;

- (void)setFrameWithInt:(jint)x
                withInt:(jint)y
                withInt:(jint)width
                withInt:(jint)height;

- (void)setInlineResourceWithNSString:(NSString *)key
                         withNSString:(NSString *)value
                          withBoolean:(jboolean)append;

- (void)setRootWidgetWithASIWidget:(id<ASIWidget>)widget;

- (void)setStyleSheetWithCSSStyleSheet:(id<CSSStyleSheet>)styleSheet;

- (void)storeInTempCacheWithNSString:(NSString *)key
                              withId:(id)object;

- (void)storeUserDataWithNSString:(NSString *)key
                           withId:(id)object;

@end

J2OBJC_STATIC_INIT(ASGenericFragment)

FOUNDATION_EXPORT void ASGenericFragment_init(ASGenericFragment *self);

FOUNDATION_EXPORT ASGenericFragment *new_ASGenericFragment_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASGenericFragment *create_ASGenericFragment_init(void);

FOUNDATION_EXPORT ADBundle *ASGenericFragment_getInitialBundleWithNSString_withNSString_withJavaUtilList_(NSString *resId, NSString *fileName, id<JavaUtilList> scopedObjects);

J2OBJC_TYPE_LITERAL_HEADER(ASGenericFragment)

@compatibility_alias ComAsheraCoreGenericFragment ASGenericFragment;

#endif

#pragma pop_macro("INCLUDE_ALL_GenericFragment")
