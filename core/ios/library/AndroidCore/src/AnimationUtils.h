//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\stub\r\android\view\animation\AnimationUtils.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_AnimationUtils")
#ifdef RESTRICT_AnimationUtils
#define INCLUDE_ALL_AnimationUtils 0
#else
#define INCLUDE_ALL_AnimationUtils 1
#endif
#undef RESTRICT_AnimationUtils

#if !defined (ADAnimationUtils_) && (INCLUDE_ALL_AnimationUtils || defined(INCLUDE_ADAnimationUtils))
#define ADAnimationUtils_

@class ADContext;
@protocol ADInterpolator;

@interface ADAnimationUtils : NSObject

#pragma mark Public

- (instancetype)init;

+ (jlong)currentAnimationTimeMillis;

+ (id<ADInterpolator>)loadInterpolatorWithADContext:(ADContext *)context
                                            withInt:(jint)mDefaultInterpolatorID;

@end

J2OBJC_EMPTY_STATIC_INIT(ADAnimationUtils)

FOUNDATION_EXPORT void ADAnimationUtils_init(ADAnimationUtils *self);

FOUNDATION_EXPORT ADAnimationUtils *new_ADAnimationUtils_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADAnimationUtils *create_ADAnimationUtils_init(void);

FOUNDATION_EXPORT id<ADInterpolator> ADAnimationUtils_loadInterpolatorWithADContext_withInt_(ADContext *context, jint mDefaultInterpolatorID);

FOUNDATION_EXPORT jlong ADAnimationUtils_currentAnimationTimeMillis(void);

J2OBJC_TYPE_LITERAL_HEADER(ADAnimationUtils)

@compatibility_alias RAndroidViewAnimationAnimationUtils ADAnimationUtils;

#endif

#pragma pop_macro("INCLUDE_ALL_AnimationUtils")
