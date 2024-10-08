//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroidX-core\src\main\java\androidx\appcompat\widget\LinearLayoutCompat.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_LinearLayoutCompat")
#ifdef RESTRICT_LinearLayoutCompat
#define INCLUDE_ALL_LinearLayoutCompat 0
#else
#define INCLUDE_ALL_LinearLayoutCompat 1
#endif
#undef RESTRICT_LinearLayoutCompat

#if !defined (ADXLinearLayoutCompat_) && (INCLUDE_ALL_LinearLayoutCompat || defined(INCLUDE_ADXLinearLayoutCompat))
#define ADXLinearLayoutCompat_

#define RESTRICT_ViewGroup 1
#define INCLUDE_ADViewGroup 1
#include "ViewGroup.h"

@class ADDrawable;
@class ADView;
@class ADViewGroup_LayoutParams;
@class ADXLinearLayoutCompat_LayoutParams;
@protocol ADCanvas;

@interface ADXLinearLayoutCompat : ADViewGroup

#pragma mark Public

- (instancetype)init;

- (jint)getBaseline;

- (jint)getBaselineAlignedChildIndex;

- (ADDrawable *)getDividerDrawable;

- (jint)getDividerPadding;

- (jint)getGravity;

- (jint)getOrientation;

- (jint)getShowDividers;

- (jfloat)getWeightSum;

- (jboolean)isBaselineAligned;

- (jboolean)isMeasureWithLargestChildEnabled;

- (void)setBaselineAlignedWithBoolean:(jboolean)baselineAligned;

- (void)setBaselineAlignedChildIndexWithInt:(jint)i;

- (void)setDividerDrawableWithADDrawable:(ADDrawable *)divider;

- (void)setDividerPaddingWithInt:(jint)padding;

- (void)setGravityWithInt:(jint)gravity;

- (void)setMeasureWithLargestChildEnabledWithBoolean:(jboolean)enabled;

- (void)setOrientationWithInt:(jint)orientation;

- (void)setShowDividersWithInt:(jint)showDividers;

- (void)setWeightSumWithFloat:(jfloat)weightSum;

#pragma mark Protected

- (jboolean)checkLayoutParamsWithADViewGroup_LayoutParams:(ADViewGroup_LayoutParams *)p;

- (ADXLinearLayoutCompat_LayoutParams *)generateDefaultLayoutParams;

- (ADXLinearLayoutCompat_LayoutParams *)generateLayoutParamsWithADViewGroup_LayoutParams:(ADViewGroup_LayoutParams *)p;

- (jboolean)hasDividerBeforeChildAtWithInt:(jint)childIndex;

- (void)onDrawWithADCanvas:(id<ADCanvas>)canvas;

- (void)onLayoutWithBoolean:(jboolean)changed
                    withInt:(jint)l
                    withInt:(jint)t
                    withInt:(jint)r
                    withInt:(jint)b;

- (void)onMeasureWithInt:(jint)widthMeasureSpec
                 withInt:(jint)heightMeasureSpec;

#pragma mark Package-Private

- (void)drawDividersHorizontalWithADCanvas:(id<ADCanvas>)canvas;

- (void)drawDividersVerticalWithADCanvas:(id<ADCanvas>)canvas;

- (void)drawHorizontalDividerWithADCanvas:(id<ADCanvas>)canvas
                                  withInt:(jint)top;

- (void)drawVerticalDividerWithADCanvas:(id<ADCanvas>)canvas
                                withInt:(jint)left;

- (jint)getChildrenSkipCountWithADView:(ADView *)child
                               withInt:(jint)index;

- (jint)getLocationOffsetWithADView:(ADView *)child;

- (jint)getNextLocationOffsetWithADView:(ADView *)child;

- (ADView *)getVirtualChildAtWithInt:(jint)index;

- (jint)getVirtualChildCount;

- (void)layoutHorizontalWithInt:(jint)left
                        withInt:(jint)top
                        withInt:(jint)right
                        withInt:(jint)bottom;

- (void)layoutVerticalWithInt:(jint)left
                      withInt:(jint)top
                      withInt:(jint)right
                      withInt:(jint)bottom;

- (void)measureChildBeforeLayoutWithADView:(ADView *)child
                                   withInt:(jint)childIndex
                                   withInt:(jint)widthMeasureSpec
                                   withInt:(jint)totalWidth
                                   withInt:(jint)heightMeasureSpec
                                   withInt:(jint)totalHeight;

- (void)measureHorizontalWithInt:(jint)widthMeasureSpec
                         withInt:(jint)heightMeasureSpec;

- (jint)measureNullChildWithInt:(jint)childIndex;

- (void)measureVerticalWithInt:(jint)widthMeasureSpec
                       withInt:(jint)heightMeasureSpec;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXLinearLayoutCompat)

inline jint ADXLinearLayoutCompat_get_HORIZONTAL(void);
#define ADXLinearLayoutCompat_HORIZONTAL 0
J2OBJC_STATIC_FIELD_CONSTANT(ADXLinearLayoutCompat, HORIZONTAL, jint)

inline jint ADXLinearLayoutCompat_get_VERTICAL(void);
#define ADXLinearLayoutCompat_VERTICAL 1
J2OBJC_STATIC_FIELD_CONSTANT(ADXLinearLayoutCompat, VERTICAL, jint)

inline jint ADXLinearLayoutCompat_get_SHOW_DIVIDER_NONE(void);
#define ADXLinearLayoutCompat_SHOW_DIVIDER_NONE 0
J2OBJC_STATIC_FIELD_CONSTANT(ADXLinearLayoutCompat, SHOW_DIVIDER_NONE, jint)

inline jint ADXLinearLayoutCompat_get_SHOW_DIVIDER_BEGINNING(void);
#define ADXLinearLayoutCompat_SHOW_DIVIDER_BEGINNING 1
J2OBJC_STATIC_FIELD_CONSTANT(ADXLinearLayoutCompat, SHOW_DIVIDER_BEGINNING, jint)

inline jint ADXLinearLayoutCompat_get_SHOW_DIVIDER_MIDDLE(void);
#define ADXLinearLayoutCompat_SHOW_DIVIDER_MIDDLE 2
J2OBJC_STATIC_FIELD_CONSTANT(ADXLinearLayoutCompat, SHOW_DIVIDER_MIDDLE, jint)

inline jint ADXLinearLayoutCompat_get_SHOW_DIVIDER_END(void);
#define ADXLinearLayoutCompat_SHOW_DIVIDER_END 4
J2OBJC_STATIC_FIELD_CONSTANT(ADXLinearLayoutCompat, SHOW_DIVIDER_END, jint)

FOUNDATION_EXPORT void ADXLinearLayoutCompat_init(ADXLinearLayoutCompat *self);

FOUNDATION_EXPORT ADXLinearLayoutCompat *new_ADXLinearLayoutCompat_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADXLinearLayoutCompat *create_ADXLinearLayoutCompat_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADXLinearLayoutCompat)

@compatibility_alias AndroidxAppcompatWidgetLinearLayoutCompat ADXLinearLayoutCompat;

#endif

#if !defined (ADXLinearLayoutCompat_LayoutParams_) && (INCLUDE_ALL_LinearLayoutCompat || defined(INCLUDE_ADXLinearLayoutCompat_LayoutParams))
#define ADXLinearLayoutCompat_LayoutParams_

#define RESTRICT_LinearLayout 1
#define INCLUDE_ADLinearLayout_LayoutParams 1
#include "LinearLayout.h"

@class ADViewGroup_LayoutParams;

@interface ADXLinearLayoutCompat_LayoutParams : ADLinearLayout_LayoutParams

#pragma mark Public

- (instancetype)initWithInt:(jint)width
                    withInt:(jint)height;

- (instancetype)initWithADViewGroup_LayoutParams:(ADViewGroup_LayoutParams *)p;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithADLinearLayout_LayoutParams:(ADLinearLayout_LayoutParams *)arg0 NS_UNAVAILABLE;

- (instancetype)initWithInt:(jint)arg0
                    withInt:(jint)arg1
                  withFloat:(jfloat)arg2 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXLinearLayoutCompat_LayoutParams)

FOUNDATION_EXPORT void ADXLinearLayoutCompat_LayoutParams_initWithInt_withInt_(ADXLinearLayoutCompat_LayoutParams *self, jint width, jint height);

FOUNDATION_EXPORT ADXLinearLayoutCompat_LayoutParams *new_ADXLinearLayoutCompat_LayoutParams_initWithInt_withInt_(jint width, jint height) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADXLinearLayoutCompat_LayoutParams *create_ADXLinearLayoutCompat_LayoutParams_initWithInt_withInt_(jint width, jint height);

FOUNDATION_EXPORT void ADXLinearLayoutCompat_LayoutParams_initWithADViewGroup_LayoutParams_(ADXLinearLayoutCompat_LayoutParams *self, ADViewGroup_LayoutParams *p);

FOUNDATION_EXPORT ADXLinearLayoutCompat_LayoutParams *new_ADXLinearLayoutCompat_LayoutParams_initWithADViewGroup_LayoutParams_(ADViewGroup_LayoutParams *p) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADXLinearLayoutCompat_LayoutParams *create_ADXLinearLayoutCompat_LayoutParams_initWithADViewGroup_LayoutParams_(ADViewGroup_LayoutParams *p);

J2OBJC_TYPE_LITERAL_HEADER(ADXLinearLayoutCompat_LayoutParams)

#endif

#pragma pop_macro("INCLUDE_ALL_LinearLayoutCompat")
