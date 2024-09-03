//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\AndroidJMaterial\src\main\java\com\google\android\material\badge\BadgeState.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_BadgeState")
#ifdef RESTRICT_BadgeState
#define INCLUDE_ALL_BadgeState 0
#else
#define INCLUDE_ALL_BadgeState 1
#endif
#undef RESTRICT_BadgeState

#if !defined (ADXBadgeState_) && (INCLUDE_ALL_BadgeState || defined(INCLUDE_ADXBadgeState))
#define ADXBadgeState_

@class ADContext;
@class ADXBadgeState_State;
@class JavaUtilLocale;

@interface ADXBadgeState : NSObject {
 @public
  jfloat badgeRadius_;
  jfloat badgeWithTextRadius_;
  jfloat badgeWidth_;
  jfloat badgeHeight_;
  jfloat badgeWithTextWidth_;
  jfloat badgeWithTextHeight_;
  jint horizontalInset_;
  jint horizontalInsetWithText_;
  jint offsetAlignmentMode_;
  jint badgeFixedEdge_;
}

#pragma mark Public

- (instancetype)initWithADContext:(ADContext *)context
          withADXBadgeState_State:(ADXBadgeState_State *)storedState;

#pragma mark Package-Private

- (void)clearNumber;

- (void)clearText;

- (jint)getAdditionalHorizontalOffset;

- (jint)getAdditionalVerticalOffset;

- (jint)getAlpha;

- (jint)getBackgroundColor;

- (jint)getBadgeGravity;

- (jint)getBadgeHorizontalPadding;

- (jint)getBadgeTextColor;

- (jint)getBadgeVerticalPadding;

- (jint)getHorizontalOffsetWithoutText;

- (jint)getHorizontalOffsetWithText;

- (jint)getLargeFontVerticalOffsetAdjustment;

- (jint)getMaxCharacterCount;

- (jint)getMaxNumber;

- (jint)getNumber;

- (JavaUtilLocale *)getNumberLocale;

- (ADXBadgeState_State *)getOverridingState;

- (NSString *)getText;

- (jint)getVerticalOffsetWithoutText;

- (jint)getVerticalOffsetWithText;

- (jboolean)hasNumber;

- (jboolean)hasText;

- (jboolean)isAutoAdjustedToGrandparentBounds;

- (jboolean)isVisible;

- (void)setAdditionalHorizontalOffsetWithInt:(jint)offset;

- (void)setAdditionalVerticalOffsetWithInt:(jint)offset;

- (void)setAlphaWithInt:(jint)alpha;

- (void)setAutoAdjustToGrandparentBoundsWithBoolean:(jboolean)autoAdjustToGrandparentBounds;

- (void)setBackgroundColorWithInt:(jint)backgroundColor;

- (void)setBadgeGravityWithInt:(jint)badgeGravity;

- (void)setBadgeHorizontalPaddingWithInt:(jint)horizontalPadding;

- (void)setBadgeTextColorWithInt:(jint)badgeTextColor;

- (void)setBadgeVerticalPaddingWithInt:(jint)verticalPadding;

- (void)setHorizontalOffsetWithoutTextWithInt:(jint)offset;

- (void)setHorizontalOffsetWithTextWithInt:(jint)offset;

- (void)setLargeFontVerticalOffsetAdjustmentWithInt:(jint)offsetAdjustment;

- (void)setMaxCharacterCountWithInt:(jint)maxCharacterCount;

- (void)setMaxNumberWithInt:(jint)maxNumber;

- (void)setNumberWithInt:(jint)number;

- (void)setNumberLocaleWithJavaUtilLocale:(JavaUtilLocale *)locale;

- (void)setTextWithNSString:(NSString *)text;

- (void)setVerticalOffsetWithoutTextWithInt:(jint)offset;

- (void)setVerticalOffsetWithTextWithInt:(jint)offset;

- (void)setVisibleWithBoolean:(jboolean)visible;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXBadgeState)

FOUNDATION_EXPORT void ADXBadgeState_initWithADContext_withADXBadgeState_State_(ADXBadgeState *self, ADContext *context, ADXBadgeState_State *storedState);

FOUNDATION_EXPORT ADXBadgeState *new_ADXBadgeState_initWithADContext_withADXBadgeState_State_(ADContext *context, ADXBadgeState_State *storedState) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADXBadgeState *create_ADXBadgeState_initWithADContext_withADXBadgeState_State_(ADContext *context, ADXBadgeState_State *storedState);

J2OBJC_TYPE_LITERAL_HEADER(ADXBadgeState)

@compatibility_alias ComGoogleAndroidMaterialBadgeBadgeState ADXBadgeState;

#endif

#if !defined (ADXBadgeState_State_) && (INCLUDE_ALL_BadgeState || defined(INCLUDE_ADXBadgeState_State))
#define ADXBadgeState_State_

@interface ADXBadgeState_State : NSObject

#pragma mark Public

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXBadgeState_State)

FOUNDATION_EXPORT void ADXBadgeState_State_init(ADXBadgeState_State *self);

FOUNDATION_EXPORT ADXBadgeState_State *new_ADXBadgeState_State_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADXBadgeState_State *create_ADXBadgeState_State_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADXBadgeState_State)

#endif

#pragma pop_macro("INCLUDE_ALL_BadgeState")
