//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroidX-core\src\main\java\androidx\core\widget\NestedScrollView.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_NestedScrollView")
#ifdef RESTRICT_NestedScrollView
#define INCLUDE_ALL_NestedScrollView 0
#else
#define INCLUDE_ALL_NestedScrollView 1
#endif
#undef RESTRICT_NestedScrollView

#if !defined (ADXNestedScrollView_) && (INCLUDE_ALL_NestedScrollView || defined(INCLUDE_ADXNestedScrollView))
#define ADXNestedScrollView_

#define RESTRICT_FrameLayout 1
#define INCLUDE_ADFrameLayout 1
#include "FrameLayout.h"

#define RESTRICT_NestedScrollingParent3 1
#define INCLUDE_ADXNestedScrollingParent3 1
#include "NestedScrollingParent3.h"

#define RESTRICT_NestedScrollingChild3 1
#define INCLUDE_ADXNestedScrollingChild3 1
#include "NestedScrollingChild3.h"

#define RESTRICT_ScrollingView 1
#define INCLUDE_ADXScrollingView 1
#include "ScrollingView.h"

@class ADView;
@class ADViewGroup_LayoutParams;
@class IOSIntArray;
@protocol ADView_OnTouchListener;
@protocol ADXNestedScrollView_OnScrollChangeListener;

@interface ADXNestedScrollView : ADFrameLayout < ADXNestedScrollingParent3, ADXNestedScrollingChild3, ADXScrollingView >

#pragma mark Public

- (instancetype)init;

- (void)addViewWithADView:(ADView *)child;

- (void)addViewWithADView:(ADView *)child
                  withInt:(jint)index;

- (void)addViewWithADView:(ADView *)child
                  withInt:(jint)index
withADViewGroup_LayoutParams:(ADViewGroup_LayoutParams *)params;

- (void)addViewWithADView:(ADView *)child
withADViewGroup_LayoutParams:(ADViewGroup_LayoutParams *)params;

- (void)adjustPaddingIfScrollBarPresentWithInt:(jint)widthMeasureSpec
                                       withInt:(jint)heightMeasureSpec
                                       withInt:(jint)thumbWidth;

- (jint)computeHorizontalScrollExtent;

- (jint)computeHorizontalScrollOffset;

- (jint)computeHorizontalScrollRange;

- (jint)computeVerticalScrollExtent;

- (jint)computeVerticalScrollOffset;

- (jint)computeVerticalScrollRange;

- (jboolean)dispatchNestedFlingWithFloat:(jfloat)velocityX
                               withFloat:(jfloat)velocityY
                             withBoolean:(jboolean)consumed;

- (jboolean)dispatchNestedPreFlingWithFloat:(jfloat)velocityX
                                  withFloat:(jfloat)velocityY;

- (jboolean)dispatchNestedPreScrollWithInt:(jint)dx
                                   withInt:(jint)dy
                              withIntArray:(IOSIntArray *)consumed
                              withIntArray:(IOSIntArray *)offsetInWindow;

- (jboolean)dispatchNestedPreScrollWithInt:(jint)dx
                                   withInt:(jint)dy
                              withIntArray:(IOSIntArray *)consumed
                              withIntArray:(IOSIntArray *)offsetInWindow
                                   withInt:(jint)type;

- (jboolean)dispatchNestedScrollWithInt:(jint)dxConsumed
                                withInt:(jint)dyConsumed
                                withInt:(jint)dxUnconsumed
                                withInt:(jint)dyUnconsumed
                           withIntArray:(IOSIntArray *)offsetInWindow;

- (jboolean)dispatchNestedScrollWithInt:(jint)dxConsumed
                                withInt:(jint)dyConsumed
                                withInt:(jint)dxUnconsumed
                                withInt:(jint)dyUnconsumed
                           withIntArray:(IOSIntArray *)offsetInWindow
                                withInt:(jint)type;

- (void)dispatchNestedScrollWithInt:(jint)dxConsumed
                            withInt:(jint)dyConsumed
                            withInt:(jint)dxUnconsumed
                            withInt:(jint)dyUnconsumed
                       withIntArray:(IOSIntArray *)offsetInWindow
                            withInt:(jint)type
                       withIntArray:(IOSIntArray *)consumed;

- (jint)getNestedScrollAxes;

- (id<ADXNestedScrollView_OnScrollChangeListener>)getOnScrollChangeListener;

- (jboolean)hasNestedScrollingParent;

- (jboolean)hasNestedScrollingParentWithInt:(jint)type;

- (jboolean)isFillViewport;

- (jboolean)isNestedScrollingEnabled;

- (jboolean)onNestedFlingWithADView:(ADView *)target
                          withFloat:(jfloat)velocityX
                          withFloat:(jfloat)velocityY
                        withBoolean:(jboolean)consumed;

- (jboolean)onNestedPreFlingWithADView:(ADView *)target
                             withFloat:(jfloat)velocityX
                             withFloat:(jfloat)velocityY;

- (void)onNestedPreScrollWithADView:(ADView *)target
                            withInt:(jint)dx
                            withInt:(jint)dy
                       withIntArray:(IOSIntArray *)consumed;

- (void)onNestedPreScrollWithADView:(ADView *)target
                            withInt:(jint)dx
                            withInt:(jint)dy
                       withIntArray:(IOSIntArray *)consumed
                            withInt:(jint)type;

- (void)onNestedScrollWithADView:(ADView *)target
                         withInt:(jint)dxConsumed
                         withInt:(jint)dyConsumed
                         withInt:(jint)dxUnconsumed
                         withInt:(jint)dyUnconsumed;

- (void)onNestedScrollWithADView:(ADView *)target
                         withInt:(jint)dxConsumed
                         withInt:(jint)dyConsumed
                         withInt:(jint)dxUnconsumed
                         withInt:(jint)dyUnconsumed
                         withInt:(jint)type;

- (void)onNestedScrollWithADView:(ADView *)target
                         withInt:(jint)dxConsumed
                         withInt:(jint)dyConsumed
                         withInt:(jint)dxUnconsumed
                         withInt:(jint)dyUnconsumed
                         withInt:(jint)type
                    withIntArray:(IOSIntArray *)consumed;

- (void)onNestedScrollAcceptedWithADView:(ADView *)child
                              withADView:(ADView *)target
                                 withInt:(jint)axes;

- (void)onNestedScrollAcceptedWithADView:(ADView *)child
                              withADView:(ADView *)target
                                 withInt:(jint)axes
                                 withInt:(jint)type;

- (jboolean)onStartNestedScrollWithADView:(ADView *)child
                               withADView:(ADView *)target
                                  withInt:(jint)axes;

- (jboolean)onStartNestedScrollWithADView:(ADView *)child
                               withADView:(ADView *)target
                                  withInt:(jint)axes
                                  withInt:(jint)type;

- (void)onStopNestedScrollWithADView:(ADView *)target;

- (void)onStopNestedScrollWithADView:(ADView *)target
                             withInt:(jint)type;

- (void)requestLayout;

- (void)setFillViewportWithBoolean:(jboolean)fillViewport;

- (void)setNestedScrollingEnabledWithBoolean:(jboolean)enabled;

- (void)setOnScrollChangeListenerWithADXNestedScrollView_OnScrollChangeListener:(id<ADXNestedScrollView_OnScrollChangeListener>)l;

- (void)setOnTouchListenerWithADView_OnTouchListener:(id<ADView_OnTouchListener>)onTouchListener;

- (void)setSmoothScrollingEnabledWithBoolean:(jboolean)objValue;

- (jboolean)startNestedScrollWithInt:(jint)axes;

- (jboolean)startNestedScrollWithInt:(jint)axes
                             withInt:(jint)type;

- (void)stopNestedScroll;

- (void)stopNestedScrollWithInt:(jint)type;

#pragma mark Protected

- (void)measureChildWithADView:(ADView *)child
                       withInt:(jint)parentWidthMeasureSpec
                       withInt:(jint)parentHeightMeasureSpec;

- (void)measureChildWithMarginsWithADView:(ADView *)child
                                  withInt:(jint)parentWidthMeasureSpec
                                  withInt:(jint)widthUsed
                                  withInt:(jint)parentHeightMeasureSpec
                                  withInt:(jint)heightUsed;

- (void)onMeasureWithInt:(jint)widthMeasureSpec
                 withInt:(jint)heightMeasureSpec;

#pragma mark Package-Private

- (jint)getScrollRange;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXNestedScrollView)

inline jint ADXNestedScrollView_get_ANIMATED_SCROLL_GAP(void);
#define ADXNestedScrollView_ANIMATED_SCROLL_GAP 250
J2OBJC_STATIC_FIELD_CONSTANT(ADXNestedScrollView, ANIMATED_SCROLL_GAP, jint)

FOUNDATION_EXPORT void ADXNestedScrollView_init(ADXNestedScrollView *self);

FOUNDATION_EXPORT ADXNestedScrollView *new_ADXNestedScrollView_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADXNestedScrollView *create_ADXNestedScrollView_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADXNestedScrollView)

@compatibility_alias AndroidxCoreWidgetNestedScrollView ADXNestedScrollView;

#endif

#if !defined (ADXNestedScrollView_OnScrollChangeListener_) && (INCLUDE_ALL_NestedScrollView || defined(INCLUDE_ADXNestedScrollView_OnScrollChangeListener))
#define ADXNestedScrollView_OnScrollChangeListener_

@class ADXNestedScrollView;

@protocol ADXNestedScrollView_OnScrollChangeListener < JavaObject >

- (void)onScrollChangeWithADXNestedScrollView:(ADXNestedScrollView *)v
                                      withInt:(jint)scrollX
                                      withInt:(jint)scrollY
                                      withInt:(jint)oldScrollX
                                      withInt:(jint)oldScrollY;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXNestedScrollView_OnScrollChangeListener)

J2OBJC_TYPE_LITERAL_HEADER(ADXNestedScrollView_OnScrollChangeListener)

#endif

#pragma pop_macro("INCLUDE_ALL_NestedScrollView")
