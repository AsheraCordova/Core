//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\AndroidJMaterial\src\main\java\com\google\android\material\badge\BadgeDrawable.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_BadgeDrawable")
#ifdef RESTRICT_BadgeDrawable
#define INCLUDE_ALL_BadgeDrawable 0
#else
#define INCLUDE_ALL_BadgeDrawable 1
#endif
#undef RESTRICT_BadgeDrawable

#if !defined (ADXBadgeDrawable_) && (INCLUDE_ALL_BadgeDrawable || defined(INCLUDE_ADXBadgeDrawable))
#define ADXBadgeDrawable_

#define RESTRICT_Drawable 1
#define INCLUDE_ADDrawable 1
#include "Drawable.h"

@class ADContext;
@class ADFrameLayout;
@class ADRect;
@class ADView;
@class ADViewGroup;
@class ADXBadgeState_State;
@class IOSObjectArray;

@interface ADXBadgeDrawable : ADDrawable

#pragma mark Public

- (instancetype)initWithADContext:(ADContext *)context
          withADXBadgeState_State:(ADXBadgeState_State *)savedState;

+ (ADXBadgeDrawable *)createWithADContext:(ADContext *)context;

- (jint)getAlpha;

- (id)getAttributeWithNSString:(NSString *)key;

- (ADRect *)getBounds;

- (ADFrameLayout *)getCustomBadgeParent;

- (jint)getHorizontalOffset;

- (jint)getMaxCharacterCount;

- (jint)getMaxNumber;

- (jint)getMinimumHeight;

- (jint)getMinimumWidth;

- (jint)getNumber;

- (IOSObjectArray *)getSimulatedWidgetAttrs;

- (NSString *)getSimulatedWidgetGroupName;

- (NSString *)getSimulatedWidgetLocalName;

- (NSString *)getText;

- (NSString *)getTextAppearanceResource;

- (jboolean)hasNumber;

- (jboolean)hasText;

- (void)setAdditionalHorizontalOffsetWithInt:(jint)px;

- (void)setAdditionalVerticalOffsetWithInt:(jint)px;

- (void)setAlphaWithInt:(jint)alpha;

- (void)setBackgroundColorWithInt:(jint)backgroundColor;

- (void)setBadgeGravityWithInt:(jint)gravity;

- (void)setBadgeTextColorWithInt:(jint)badgeTextColor;

- (void)setHorizontalOffsetWithInt:(jint)px;

- (void)setHorizontalOffsetWithoutTextWithInt:(jint)px;

- (void)setHorizontalOffsetWithTextWithInt:(jint)px;

- (void)setMaxCharacterCountWithInt:(jint)maxCharacterCount;

- (void)setNumberWithInt:(jint)number;

- (void)setTextAppearanceResourceWithNSString:(NSString *)textAppearanceResource;

- (void)setVerticalOffsetWithInt:(jint)px;

- (void)setVerticalOffsetWithoutTextWithInt:(jint)px;

- (void)setVerticalOffsetWithTextWithInt:(jint)px;

- (void)setVisibleWithBoolean:(jboolean)visible;

- (void)updateBadgeCoordinatesWithADView:(ADView *)anchorView;

- (void)updateBadgeCoordinatesWithADView:(ADView *)anchorView
                       withADFrameLayout:(ADFrameLayout *)customBadgeParent;

- (void)updateBadgeCoordinatesWithADView:(ADView *)anchorView
                         withADViewGroup:(ADViewGroup *)customBadgeParent;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXBadgeDrawable)

inline jint ADXBadgeDrawable_get_TOP_END(void);
#define ADXBadgeDrawable_TOP_END 8388661
J2OBJC_STATIC_FIELD_CONSTANT(ADXBadgeDrawable, TOP_END, jint)

inline jint ADXBadgeDrawable_get_TOP_START(void);
#define ADXBadgeDrawable_TOP_START 8388659
J2OBJC_STATIC_FIELD_CONSTANT(ADXBadgeDrawable, TOP_START, jint)

inline jint ADXBadgeDrawable_get_BOTTOM_END(void);
#define ADXBadgeDrawable_BOTTOM_END 8388693
J2OBJC_STATIC_FIELD_CONSTANT(ADXBadgeDrawable, BOTTOM_END, jint)

inline jint ADXBadgeDrawable_get_BOTTOM_START(void);
#define ADXBadgeDrawable_BOTTOM_START 8388691
J2OBJC_STATIC_FIELD_CONSTANT(ADXBadgeDrawable, BOTTOM_START, jint)

inline NSString *ADXBadgeDrawable_get_DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ADXBadgeDrawable_DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ADXBadgeDrawable, DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, NSString *)

inline NSString *ADXBadgeDrawable_get_DEFAULT_EXCEED_MAX_BADGE_TEXT_SUFFIX(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ADXBadgeDrawable_DEFAULT_EXCEED_MAX_BADGE_TEXT_SUFFIX;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ADXBadgeDrawable, DEFAULT_EXCEED_MAX_BADGE_TEXT_SUFFIX, NSString *)

inline jint ADXBadgeDrawable_get_OFFSET_ALIGNMENT_MODE_EDGE(void);
#define ADXBadgeDrawable_OFFSET_ALIGNMENT_MODE_EDGE 0
J2OBJC_STATIC_FIELD_CONSTANT(ADXBadgeDrawable, OFFSET_ALIGNMENT_MODE_EDGE, jint)

inline jint ADXBadgeDrawable_get_OFFSET_ALIGNMENT_MODE_LEGACY(void);
#define ADXBadgeDrawable_OFFSET_ALIGNMENT_MODE_LEGACY 1
J2OBJC_STATIC_FIELD_CONSTANT(ADXBadgeDrawable, OFFSET_ALIGNMENT_MODE_LEGACY, jint)

inline jint ADXBadgeDrawable_get_BADGE_FIXED_EDGE_START(void);
#define ADXBadgeDrawable_BADGE_FIXED_EDGE_START 0
J2OBJC_STATIC_FIELD_CONSTANT(ADXBadgeDrawable, BADGE_FIXED_EDGE_START, jint)

inline jint ADXBadgeDrawable_get_BADGE_FIXED_EDGE_END(void);
#define ADXBadgeDrawable_BADGE_FIXED_EDGE_END 1
J2OBJC_STATIC_FIELD_CONSTANT(ADXBadgeDrawable, BADGE_FIXED_EDGE_END, jint)

inline jint ADXBadgeDrawable_get_BADGE_RADIUS_NOT_SPECIFIED(void);
#define ADXBadgeDrawable_BADGE_RADIUS_NOT_SPECIFIED -1
J2OBJC_STATIC_FIELD_CONSTANT(ADXBadgeDrawable, BADGE_RADIUS_NOT_SPECIFIED, jint)

inline jint ADXBadgeDrawable_get_BADGE_CONTENT_NOT_TRUNCATED(void);
#define ADXBadgeDrawable_BADGE_CONTENT_NOT_TRUNCATED -2
J2OBJC_STATIC_FIELD_CONSTANT(ADXBadgeDrawable, BADGE_CONTENT_NOT_TRUNCATED, jint)

FOUNDATION_EXPORT ADXBadgeDrawable *ADXBadgeDrawable_createWithADContext_(ADContext *context);

FOUNDATION_EXPORT void ADXBadgeDrawable_initWithADContext_withADXBadgeState_State_(ADXBadgeDrawable *self, ADContext *context, ADXBadgeState_State *savedState);

FOUNDATION_EXPORT ADXBadgeDrawable *new_ADXBadgeDrawable_initWithADContext_withADXBadgeState_State_(ADContext *context, ADXBadgeState_State *savedState) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADXBadgeDrawable *create_ADXBadgeDrawable_initWithADContext_withADXBadgeState_State_(ADContext *context, ADXBadgeState_State *savedState);

J2OBJC_TYPE_LITERAL_HEADER(ADXBadgeDrawable)

@compatibility_alias ComGoogleAndroidMaterialBadgeBadgeDrawable ADXBadgeDrawable;

#endif

#if !defined (ADXBadgeDrawable_MaterialShapeDrawable_) && (INCLUDE_ALL_BadgeDrawable || defined(INCLUDE_ADXBadgeDrawable_MaterialShapeDrawable))
#define ADXBadgeDrawable_MaterialShapeDrawable_

#define RESTRICT_Drawable 1
#define INCLUDE_ADDrawable 1
#include "Drawable.h"

@class ADColorStateList;
@class ADXBadgeDrawable;

@interface ADXBadgeDrawable_MaterialShapeDrawable : ADDrawable

#pragma mark Public

- (jfloat)getCornerSize;

- (ADColorStateList *)getFillColor;

- (void)setCornerSizeWithFloat:(jfloat)cornerSize;

- (void)setFillColorWithADColorStateList:(ADColorStateList *)backgroundColorStateList;

#pragma mark Package-Private

- (instancetype)initWithADXBadgeDrawable:(ADXBadgeDrawable *)outer$;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXBadgeDrawable_MaterialShapeDrawable)

FOUNDATION_EXPORT void ADXBadgeDrawable_MaterialShapeDrawable_initWithADXBadgeDrawable_(ADXBadgeDrawable_MaterialShapeDrawable *self, ADXBadgeDrawable *outer$);

FOUNDATION_EXPORT ADXBadgeDrawable_MaterialShapeDrawable *new_ADXBadgeDrawable_MaterialShapeDrawable_initWithADXBadgeDrawable_(ADXBadgeDrawable *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADXBadgeDrawable_MaterialShapeDrawable *create_ADXBadgeDrawable_MaterialShapeDrawable_initWithADXBadgeDrawable_(ADXBadgeDrawable *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ADXBadgeDrawable_MaterialShapeDrawable)

#endif

#if !defined (ADXBadgeDrawable_TextPaint_) && (INCLUDE_ALL_BadgeDrawable || defined(INCLUDE_ADXBadgeDrawable_TextPaint))
#define ADXBadgeDrawable_TextPaint_

@class ADXBadgeDrawable;

@interface ADXBadgeDrawable_TextPaint : NSObject

#pragma mark Public

- (jint)getColor;

- (void)setAlphaWithInt:(jint)alpha;

- (void)setColorWithInt:(jint)badgeTextColor;

#pragma mark Package-Private

- (instancetype)initWithADXBadgeDrawable:(ADXBadgeDrawable *)outer$;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXBadgeDrawable_TextPaint)

FOUNDATION_EXPORT void ADXBadgeDrawable_TextPaint_initWithADXBadgeDrawable_(ADXBadgeDrawable_TextPaint *self, ADXBadgeDrawable *outer$);

FOUNDATION_EXPORT ADXBadgeDrawable_TextPaint *new_ADXBadgeDrawable_TextPaint_initWithADXBadgeDrawable_(ADXBadgeDrawable *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADXBadgeDrawable_TextPaint *create_ADXBadgeDrawable_TextPaint_initWithADXBadgeDrawable_(ADXBadgeDrawable *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ADXBadgeDrawable_TextPaint)

#endif

#if !defined (ADXBadgeDrawable_TextDrawableHelper_) && (INCLUDE_ALL_BadgeDrawable || defined(INCLUDE_ADXBadgeDrawable_TextDrawableHelper))
#define ADXBadgeDrawable_TextDrawableHelper_

@class ADXBadgeDrawable;
@class ADXBadgeDrawable_TextPaint;

@interface ADXBadgeDrawable_TextDrawableHelper : NSObject

#pragma mark Public

- (jfloat)getTextHeightWithNSString:(NSString *)badgeContent;

- (ADXBadgeDrawable_TextPaint *)getTextPaint;

- (jfloat)getTextWidthWithNSString:(NSString *)badgeContent;

- (void)setTextSizeDirtyWithBoolean:(jboolean)b;

#pragma mark Package-Private

- (instancetype)initWithADXBadgeDrawable:(ADXBadgeDrawable *)outer$;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXBadgeDrawable_TextDrawableHelper)

FOUNDATION_EXPORT void ADXBadgeDrawable_TextDrawableHelper_initWithADXBadgeDrawable_(ADXBadgeDrawable_TextDrawableHelper *self, ADXBadgeDrawable *outer$);

FOUNDATION_EXPORT ADXBadgeDrawable_TextDrawableHelper *new_ADXBadgeDrawable_TextDrawableHelper_initWithADXBadgeDrawable_(ADXBadgeDrawable *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADXBadgeDrawable_TextDrawableHelper *create_ADXBadgeDrawable_TextDrawableHelper_initWithADXBadgeDrawable_(ADXBadgeDrawable *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ADXBadgeDrawable_TextDrawableHelper)

#endif

#pragma pop_macro("INCLUDE_ALL_BadgeDrawable")