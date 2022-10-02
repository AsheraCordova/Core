//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\widget\FrameLayout.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_FrameLayout")
#ifdef RESTRICT_FrameLayout
#define INCLUDE_ALL_FrameLayout 0
#else
#define INCLUDE_ALL_FrameLayout 1
#endif
#undef RESTRICT_FrameLayout

#if !defined (ADFrameLayout_) && (INCLUDE_ALL_FrameLayout || defined(INCLUDE_ADFrameLayout))
#define ADFrameLayout_

#define RESTRICT_ViewGroup 1
#define INCLUDE_ADViewGroup 1
#include "ViewGroup.h"

@class ADFrameLayout_LayoutParams;
@class ADViewGroup_LayoutParams;

@interface ADFrameLayout : ADViewGroup {
 @public
  jboolean mMeasureAllChildren_;
}

#pragma mark Public

- (instancetype)init;

- (jboolean)getMeasureAllChildren;

- (void)setForegroundGravityWithInt:(jint)foregroundGravity;

- (void)setMeasureAllChildrenWithBoolean:(jboolean)measureAll;

#pragma mark Protected

- (jboolean)checkLayoutParamsWithADViewGroup_LayoutParams:(ADViewGroup_LayoutParams *)p;

- (ADFrameLayout_LayoutParams *)generateDefaultLayoutParams;

- (ADViewGroup_LayoutParams *)generateLayoutParamsWithADViewGroup_LayoutParams:(ADViewGroup_LayoutParams *)lp;

- (void)onLayoutWithBoolean:(jboolean)changed
                    withInt:(jint)left
                    withInt:(jint)top
                    withInt:(jint)right
                    withInt:(jint)bottom;

- (void)onMeasureWithInt:(jint)widthMeasureSpec
                 withInt:(jint)heightMeasureSpec;

#pragma mark Package-Private

- (jint)getPaddingLeftWithForeground;

- (jint)getPaddingRightWithForeground;

- (void)layoutChildrenWithInt:(jint)left
                      withInt:(jint)top
                      withInt:(jint)right
                      withInt:(jint)bottom
                  withBoolean:(jboolean)forceLeftGravity;

@end

J2OBJC_EMPTY_STATIC_INIT(ADFrameLayout)

FOUNDATION_EXPORT void ADFrameLayout_init(ADFrameLayout *self);

FOUNDATION_EXPORT ADFrameLayout *new_ADFrameLayout_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADFrameLayout *create_ADFrameLayout_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADFrameLayout)

@compatibility_alias RAndroidWidgetFrameLayout ADFrameLayout;

#endif

#if !defined (ADFrameLayout_LayoutParams_) && (INCLUDE_ALL_FrameLayout || defined(INCLUDE_ADFrameLayout_LayoutParams))
#define ADFrameLayout_LayoutParams_

#define RESTRICT_ViewGroup 1
#define INCLUDE_ADViewGroup_MarginLayoutParams 1
#include "ViewGroup.h"

@class ADViewGroup_LayoutParams;

@interface ADFrameLayout_LayoutParams : ADViewGroup_MarginLayoutParams {
 @public
  jint gravity_;
}

#pragma mark Public

- (instancetype)initWithInt:(jint)width
                    withInt:(jint)height;

- (instancetype)initWithInt:(jint)width
                    withInt:(jint)height
                    withInt:(jint)gravity;

- (instancetype)initWithADViewGroup_LayoutParams:(ADViewGroup_LayoutParams *)source;

- (instancetype)initWithADFrameLayout_LayoutParams:(ADFrameLayout_LayoutParams *)source;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithADViewGroup_MarginLayoutParams:(ADViewGroup_MarginLayoutParams *)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADFrameLayout_LayoutParams)

inline jint ADFrameLayout_LayoutParams_get_UNSPECIFIED_GRAVITY(void);
#define ADFrameLayout_LayoutParams_UNSPECIFIED_GRAVITY -1
J2OBJC_STATIC_FIELD_CONSTANT(ADFrameLayout_LayoutParams, UNSPECIFIED_GRAVITY, jint)

FOUNDATION_EXPORT void ADFrameLayout_LayoutParams_initWithInt_withInt_(ADFrameLayout_LayoutParams *self, jint width, jint height);

FOUNDATION_EXPORT ADFrameLayout_LayoutParams *new_ADFrameLayout_LayoutParams_initWithInt_withInt_(jint width, jint height) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADFrameLayout_LayoutParams *create_ADFrameLayout_LayoutParams_initWithInt_withInt_(jint width, jint height);

FOUNDATION_EXPORT void ADFrameLayout_LayoutParams_initWithInt_withInt_withInt_(ADFrameLayout_LayoutParams *self, jint width, jint height, jint gravity);

FOUNDATION_EXPORT ADFrameLayout_LayoutParams *new_ADFrameLayout_LayoutParams_initWithInt_withInt_withInt_(jint width, jint height, jint gravity) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADFrameLayout_LayoutParams *create_ADFrameLayout_LayoutParams_initWithInt_withInt_withInt_(jint width, jint height, jint gravity);

FOUNDATION_EXPORT void ADFrameLayout_LayoutParams_initWithADViewGroup_LayoutParams_(ADFrameLayout_LayoutParams *self, ADViewGroup_LayoutParams *source);

FOUNDATION_EXPORT ADFrameLayout_LayoutParams *new_ADFrameLayout_LayoutParams_initWithADViewGroup_LayoutParams_(ADViewGroup_LayoutParams *source) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADFrameLayout_LayoutParams *create_ADFrameLayout_LayoutParams_initWithADViewGroup_LayoutParams_(ADViewGroup_LayoutParams *source);

FOUNDATION_EXPORT void ADFrameLayout_LayoutParams_initWithADFrameLayout_LayoutParams_(ADFrameLayout_LayoutParams *self, ADFrameLayout_LayoutParams *source);

FOUNDATION_EXPORT ADFrameLayout_LayoutParams *new_ADFrameLayout_LayoutParams_initWithADFrameLayout_LayoutParams_(ADFrameLayout_LayoutParams *source) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADFrameLayout_LayoutParams *create_ADFrameLayout_LayoutParams_initWithADFrameLayout_LayoutParams_(ADFrameLayout_LayoutParams *source);

J2OBJC_TYPE_LITERAL_HEADER(ADFrameLayout_LayoutParams)

#endif

#pragma pop_macro("INCLUDE_ALL_FrameLayout")
