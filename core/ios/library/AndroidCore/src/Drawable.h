//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\graphics\drawable\Drawable.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_Drawable")
#ifdef RESTRICT_Drawable
#define INCLUDE_ALL_Drawable 0
#else
#define INCLUDE_ALL_Drawable 1
#endif
#undef RESTRICT_Drawable

#if !defined (ADDrawable_) && (INCLUDE_ALL_Drawable || defined(INCLUDE_ADDrawable))
#define ADDrawable_

@class ADInsets;
@class ADRect;
@class IOSIntArray;
@class IOSObjectArray;
@protocol ADCanvas;
@protocol ADDrawable_AttributeChangeListener;
@protocol ADDrawable_MeasureTextHelper;
@protocol ASIWidget;

@interface ADDrawable : NSObject

#pragma mark Public

- (instancetype)init;

- (void)drawWithADCanvas:(id<ADCanvas>)canvas;

- (id)getAttributeWithNSString:(NSString *)key;

- (jint)getBottom;

- (ADRect *)getBounds;

- (id)getDrawable;

- (jint)getIntrinsicHeight;

- (jint)getIntrinsicWidth;

- (jint)getLeft;

- (id<ADDrawable_MeasureTextHelper>)getMeasureTextHelper;

- (jint)getMinimumHeight;

- (jint)getMinimumWidth;

- (ADInsets *)getOpticalInsets;

- (jboolean)getPaddingWithADRect:(ADRect *)padding;

- (jint)getRight;

- (IOSObjectArray *)getSimulatedWidgetAttrs;

- (NSString *)getSimulatedWidgetGroupName;

- (NSString *)getSimulatedWidgetLocalName;

/*!
 @brief Describes the current state, as a union of primitve states, such as 
 <code>android.R.attr.state_focused</code>,
  <code>android.R.attr.state_selected</code>, etc.
 Some drawables may modify their imagery based on the selected state.
 @return An array of resource Ids describing the current state.
 */
- (IOSIntArray *)getState;

- (id)getTintColor;

- (NSString *)getTintMode;

- (jint)getTop;

- (IOSObjectArray *)getViewAttrs;

- (jboolean)hasDrawable;

- (void)invalidateSelf;

- (jboolean)isProjected;

- (jboolean)isRecycleable;

- (jboolean)isRedraw;

- (jboolean)isStateful;

- (void)jumpToCurrentState;

- (void)setAlphaWithInt:(jint)alpha;

- (void)setAttributeChangeListenerWithADDrawable_AttributeChangeListener:(id<ADDrawable_AttributeChangeListener>)attributeChangeListener;

/*!
 @brief Specify a bounding rectangle for the Drawable.This is where the drawable
  will draw when its draw() method is called.
 */
- (void)setBoundsWithInt:(jint)left
                 withInt:(jint)top
                 withInt:(jint)right
                 withInt:(jint)bottom;

/*!
 @brief Specify a bounding rectangle for the Drawable.This is where the drawable
  will draw when its draw() method is called.
 */
- (void)setBoundsWithADRect:(ADRect *)bounds;

- (void)setCallbackWithId:(id)object;

- (void)setDrawableWithId:(id)drawable;

- (void)setHotspotBoundsWithInt:(jint)left2
                        withInt:(jint)top2
                        withInt:(jint)right2
                        withInt:(jint)bottom2;

- (void)setLayoutDirectionWithInt:(jint)layoutDirection;

- (void)setMeasureTextHelperWithADDrawable_MeasureTextHelper:(id<ADDrawable_MeasureTextHelper>)helper;

- (void)setMinimumHeightWithInt:(jint)minimumHeight;

- (void)setMinimumWidthWithInt:(jint)minimumWidth;

- (void)setOverlayWithASIWidget:(id<ASIWidget>)overlay;

- (void)setRecycleableWithBoolean:(jboolean)recycleable;

- (void)setRedrawWithBoolean:(jboolean)redraw;

- (jboolean)setStateWithIntArray:(IOSIntArray *)stateSet;

- (void)setStateWithId:(id)drawableState;

- (void)setTintColorWithId:(id)tintColor;

- (void)setTintModeWithNSString:(NSString *)tintMode;

- (void)setUseGCWithBoolean:(jboolean)useGC;

- (void)setVisibleWithBoolean:(jboolean)b
                  withBoolean:(jboolean)c;

#pragma mark Protected

- (void)onBoundsChangeWithADRect:(ADRect *)bounds;

- (jboolean)onStateChangeWithIntArray:(IOSIntArray *)state;

@end

J2OBJC_STATIC_INIT(ADDrawable)

inline ADRect *ADDrawable_get_ZERO_BOUNDS_RECT(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT ADRect *ADDrawable_ZERO_BOUNDS_RECT;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ADDrawable, ZERO_BOUNDS_RECT, ADRect *)

inline IOSIntArray *ADDrawable_get_WILD_CARD(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT IOSIntArray *ADDrawable_WILD_CARD;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ADDrawable, WILD_CARD, IOSIntArray *)

FOUNDATION_EXPORT void ADDrawable_init(ADDrawable *self);

FOUNDATION_EXPORT ADDrawable *new_ADDrawable_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADDrawable *create_ADDrawable_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADDrawable)

@compatibility_alias RAndroidGraphicsDrawableDrawable ADDrawable;

#endif

#if !defined (ADDrawable_AttributeChangeListener_) && (INCLUDE_ALL_Drawable || defined(INCLUDE_ADDrawable_AttributeChangeListener))
#define ADDrawable_AttributeChangeListener_

@protocol ADDrawable_AttributeChangeListener < JavaObject >

- (void)onAttributeChangeWithNSString:(NSString *)name
                               withId:(id)attribute;

@end

J2OBJC_EMPTY_STATIC_INIT(ADDrawable_AttributeChangeListener)

J2OBJC_TYPE_LITERAL_HEADER(ADDrawable_AttributeChangeListener)

#endif

#if !defined (ADDrawable_MeasureTextHelper_) && (INCLUDE_ALL_Drawable || defined(INCLUDE_ADDrawable_MeasureTextHelper))
#define ADDrawable_MeasureTextHelper_

@protocol ADDrawable_MeasureTextHelper < JavaObject >

- (jfloat)getTextWidth;

- (jfloat)getTextHeight;

@end

J2OBJC_EMPTY_STATIC_INIT(ADDrawable_MeasureTextHelper)

J2OBJC_TYPE_LITERAL_HEADER(ADDrawable_MeasureTextHelper)

#endif

#pragma pop_macro("INCLUDE_ALL_Drawable")
