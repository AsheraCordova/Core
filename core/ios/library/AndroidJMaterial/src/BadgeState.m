//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\AndroidJMaterial\src\main\java\com\google\android\material\badge\BadgeState.java
//

#include "BadgeDrawable.h"
#include "BadgeState.h"
#include "Color.h"
#include "Context.h"
#include "J2ObjC_source.h"
#include "PluginInvoker.h"
#include "java/lang/Boolean.h"
#include "java/lang/Integer.h"
#include "java/util/Locale.h"

@class JavaLangBoolean;
@class JavaLangInteger;
@class JavaUtilLocale;


@interface ADXBadgeState () {
 @public
  ADXBadgeState_State *overridingState_;
  ADXBadgeState_State *currentState_;
}

@end

J2OBJC_FIELD_SETTER(ADXBadgeState, overridingState_, ADXBadgeState_State *)
J2OBJC_FIELD_SETTER(ADXBadgeState, currentState_, ADXBadgeState_State *)

@interface ADXBadgeState_State () {
 @public
  jint badgeResId_;
  JavaLangInteger *backgroundColor_;
  JavaLangInteger *badgeTextColor_;
  JavaLangInteger *badgeTextAppearanceResId_;
  JavaLangInteger *badgeShapeAppearanceResId_;
  JavaLangInteger *badgeShapeAppearanceOverlayResId_;
  JavaLangInteger *badgeWithTextShapeAppearanceResId_;
  JavaLangInteger *badgeWithTextShapeAppearanceOverlayResId_;
  jint alpha_;
  NSString *text_;
  jint number_;
  jint maxCharacterCount_;
  jint maxNumber_;
  JavaUtilLocale *numberLocale_;
  jint contentDescriptionQuantityStrings_;
  jint contentDescriptionExceedsMaxBadgeNumberRes_;
  JavaLangInteger *badgeGravity_;
  JavaLangBoolean *isVisible_;
  JavaLangInteger *badgeHorizontalPadding_;
  JavaLangInteger *badgeVerticalPadding_;
  JavaLangInteger *horizontalOffsetWithoutText_;
  JavaLangInteger *verticalOffsetWithoutText_;
  JavaLangInteger *horizontalOffsetWithText_;
  JavaLangInteger *verticalOffsetWithText_;
  JavaLangInteger *additionalHorizontalOffset_;
  JavaLangInteger *additionalVerticalOffset_;
  JavaLangInteger *largeFontVerticalOffsetAdjustment_;
  JavaLangBoolean *autoAdjustToWithinGrandparentBounds_;
  JavaLangInteger *badgeFixedEdge_;
}

@end

J2OBJC_FIELD_SETTER(ADXBadgeState_State, backgroundColor_, JavaLangInteger *)
J2OBJC_FIELD_SETTER(ADXBadgeState_State, badgeTextColor_, JavaLangInteger *)
J2OBJC_FIELD_SETTER(ADXBadgeState_State, badgeTextAppearanceResId_, JavaLangInteger *)
J2OBJC_FIELD_SETTER(ADXBadgeState_State, badgeShapeAppearanceResId_, JavaLangInteger *)
J2OBJC_FIELD_SETTER(ADXBadgeState_State, badgeShapeAppearanceOverlayResId_, JavaLangInteger *)
J2OBJC_FIELD_SETTER(ADXBadgeState_State, badgeWithTextShapeAppearanceResId_, JavaLangInteger *)
J2OBJC_FIELD_SETTER(ADXBadgeState_State, badgeWithTextShapeAppearanceOverlayResId_, JavaLangInteger *)
J2OBJC_FIELD_SETTER(ADXBadgeState_State, text_, NSString *)
J2OBJC_FIELD_SETTER(ADXBadgeState_State, numberLocale_, JavaUtilLocale *)
J2OBJC_FIELD_SETTER(ADXBadgeState_State, badgeGravity_, JavaLangInteger *)
J2OBJC_FIELD_SETTER(ADXBadgeState_State, isVisible_, JavaLangBoolean *)
J2OBJC_FIELD_SETTER(ADXBadgeState_State, badgeHorizontalPadding_, JavaLangInteger *)
J2OBJC_FIELD_SETTER(ADXBadgeState_State, badgeVerticalPadding_, JavaLangInteger *)
J2OBJC_FIELD_SETTER(ADXBadgeState_State, horizontalOffsetWithoutText_, JavaLangInteger *)
J2OBJC_FIELD_SETTER(ADXBadgeState_State, verticalOffsetWithoutText_, JavaLangInteger *)
J2OBJC_FIELD_SETTER(ADXBadgeState_State, horizontalOffsetWithText_, JavaLangInteger *)
J2OBJC_FIELD_SETTER(ADXBadgeState_State, verticalOffsetWithText_, JavaLangInteger *)
J2OBJC_FIELD_SETTER(ADXBadgeState_State, additionalHorizontalOffset_, JavaLangInteger *)
J2OBJC_FIELD_SETTER(ADXBadgeState_State, additionalVerticalOffset_, JavaLangInteger *)
J2OBJC_FIELD_SETTER(ADXBadgeState_State, largeFontVerticalOffsetAdjustment_, JavaLangInteger *)
J2OBJC_FIELD_SETTER(ADXBadgeState_State, autoAdjustToWithinGrandparentBounds_, JavaLangBoolean *)
J2OBJC_FIELD_SETTER(ADXBadgeState_State, badgeFixedEdge_, JavaLangInteger *)

inline jint ADXBadgeState_State_get_BADGE_NUMBER_NONE(void);
#define ADXBadgeState_State_BADGE_NUMBER_NONE -1
J2OBJC_STATIC_FIELD_CONSTANT(ADXBadgeState_State, BADGE_NUMBER_NONE, jint)

inline jint ADXBadgeState_State_get_NOT_SET(void);
#define ADXBadgeState_State_NOT_SET -2
J2OBJC_STATIC_FIELD_CONSTANT(ADXBadgeState_State, NOT_SET, jint)

@implementation ADXBadgeState

- (ADXBadgeState_State *)getOverridingState {
  return overridingState_;
}

- (jboolean)isVisible {
  return [((JavaLangBoolean *) nil_chk(((ADXBadgeState_State *) nil_chk(currentState_))->isVisible_)) booleanValue];
}

- (void)setVisibleWithBoolean:(jboolean)visible {
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(overridingState_))->isVisible_, JavaLangBoolean_valueOfWithBoolean_(visible));
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(currentState_))->isVisible_, JavaLangBoolean_valueOfWithBoolean_(visible));
}

- (jboolean)hasNumber {
  return ((ADXBadgeState_State *) nil_chk(currentState_))->number_ != ADXBadgeState_State_BADGE_NUMBER_NONE;
}

- (jint)getNumber {
  return ((ADXBadgeState_State *) nil_chk(currentState_))->number_;
}

- (void)setNumberWithInt:(jint)number {
  ((ADXBadgeState_State *) nil_chk(overridingState_))->number_ = number;
  ((ADXBadgeState_State *) nil_chk(currentState_))->number_ = number;
}

- (void)clearNumber {
  [self setNumberWithInt:ADXBadgeState_State_BADGE_NUMBER_NONE];
}

- (jboolean)hasText {
  return ((ADXBadgeState_State *) nil_chk(currentState_))->text_ != nil;
}

- (NSString *)getText {
  return ((ADXBadgeState_State *) nil_chk(currentState_))->text_;
}

- (void)setTextWithNSString:(NSString *)text {
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(overridingState_))->text_, text);
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(currentState_))->text_, text);
}

- (void)clearText {
  [self setTextWithNSString:nil];
}

- (jint)getAlpha {
  return ((ADXBadgeState_State *) nil_chk(currentState_))->alpha_;
}

- (void)setAlphaWithInt:(jint)alpha {
  ((ADXBadgeState_State *) nil_chk(overridingState_))->alpha_ = alpha;
  ((ADXBadgeState_State *) nil_chk(currentState_))->alpha_ = alpha;
}

- (jint)getMaxCharacterCount {
  return ((ADXBadgeState_State *) nil_chk(currentState_))->maxCharacterCount_;
}

- (void)setMaxCharacterCountWithInt:(jint)maxCharacterCount {
  ((ADXBadgeState_State *) nil_chk(overridingState_))->maxCharacterCount_ = maxCharacterCount;
  ((ADXBadgeState_State *) nil_chk(currentState_))->maxCharacterCount_ = maxCharacterCount;
}

- (jint)getMaxNumber {
  return ((ADXBadgeState_State *) nil_chk(currentState_))->maxNumber_;
}

- (void)setMaxNumberWithInt:(jint)maxNumber {
  ((ADXBadgeState_State *) nil_chk(overridingState_))->maxNumber_ = maxNumber;
  ((ADXBadgeState_State *) nil_chk(currentState_))->maxNumber_ = maxNumber;
}

- (jint)getBackgroundColor {
  return [((JavaLangInteger *) nil_chk(((ADXBadgeState_State *) nil_chk(currentState_))->backgroundColor_)) intValue];
}

- (void)setBackgroundColorWithInt:(jint)backgroundColor {
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(overridingState_))->backgroundColor_, JavaLangInteger_valueOfWithInt_(backgroundColor));
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(currentState_))->backgroundColor_, JavaLangInteger_valueOfWithInt_(backgroundColor));
}

- (jint)getBadgeTextColor {
  return [((JavaLangInteger *) nil_chk(((ADXBadgeState_State *) nil_chk(currentState_))->badgeTextColor_)) intValue];
}

- (void)setBadgeTextColorWithInt:(jint)badgeTextColor {
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(overridingState_))->badgeTextColor_, JavaLangInteger_valueOfWithInt_(badgeTextColor));
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(currentState_))->badgeTextColor_, JavaLangInteger_valueOfWithInt_(badgeTextColor));
}

- (jint)getBadgeGravity {
  return [((JavaLangInteger *) nil_chk(((ADXBadgeState_State *) nil_chk(currentState_))->badgeGravity_)) intValue];
}

- (void)setBadgeGravityWithInt:(jint)badgeGravity {
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(overridingState_))->badgeGravity_, JavaLangInteger_valueOfWithInt_(badgeGravity));
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(currentState_))->badgeGravity_, JavaLangInteger_valueOfWithInt_(badgeGravity));
}

- (jint)getBadgeHorizontalPadding {
  return [((JavaLangInteger *) nil_chk(((ADXBadgeState_State *) nil_chk(currentState_))->badgeHorizontalPadding_)) intValue];
}

- (void)setBadgeHorizontalPaddingWithInt:(jint)horizontalPadding {
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(overridingState_))->badgeHorizontalPadding_, JavaLangInteger_valueOfWithInt_(horizontalPadding));
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(currentState_))->badgeHorizontalPadding_, JavaLangInteger_valueOfWithInt_(horizontalPadding));
}

- (jint)getBadgeVerticalPadding {
  return [((JavaLangInteger *) nil_chk(((ADXBadgeState_State *) nil_chk(currentState_))->badgeVerticalPadding_)) intValue];
}

- (void)setBadgeVerticalPaddingWithInt:(jint)verticalPadding {
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(overridingState_))->badgeVerticalPadding_, JavaLangInteger_valueOfWithInt_(verticalPadding));
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(currentState_))->badgeVerticalPadding_, JavaLangInteger_valueOfWithInt_(verticalPadding));
}

- (jint)getHorizontalOffsetWithoutText {
  return [((JavaLangInteger *) nil_chk(((ADXBadgeState_State *) nil_chk(currentState_))->horizontalOffsetWithoutText_)) intValue];
}

- (void)setHorizontalOffsetWithoutTextWithInt:(jint)offset {
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(overridingState_))->horizontalOffsetWithoutText_, JavaLangInteger_valueOfWithInt_(offset));
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(currentState_))->horizontalOffsetWithoutText_, JavaLangInteger_valueOfWithInt_(offset));
}

- (jint)getVerticalOffsetWithoutText {
  return [((JavaLangInteger *) nil_chk(((ADXBadgeState_State *) nil_chk(currentState_))->verticalOffsetWithoutText_)) intValue];
}

- (void)setVerticalOffsetWithoutTextWithInt:(jint)offset {
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(overridingState_))->verticalOffsetWithoutText_, JavaLangInteger_valueOfWithInt_(offset));
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(currentState_))->verticalOffsetWithoutText_, JavaLangInteger_valueOfWithInt_(offset));
}

- (jint)getHorizontalOffsetWithText {
  return [((JavaLangInteger *) nil_chk(((ADXBadgeState_State *) nil_chk(currentState_))->horizontalOffsetWithText_)) intValue];
}

- (void)setHorizontalOffsetWithTextWithInt:(jint)offset {
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(overridingState_))->horizontalOffsetWithText_, JavaLangInteger_valueOfWithInt_(offset));
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(currentState_))->horizontalOffsetWithText_, JavaLangInteger_valueOfWithInt_(offset));
}

- (jint)getVerticalOffsetWithText {
  return [((JavaLangInteger *) nil_chk(((ADXBadgeState_State *) nil_chk(currentState_))->verticalOffsetWithText_)) intValue];
}

- (void)setVerticalOffsetWithTextWithInt:(jint)offset {
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(overridingState_))->verticalOffsetWithText_, JavaLangInteger_valueOfWithInt_(offset));
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(currentState_))->verticalOffsetWithText_, JavaLangInteger_valueOfWithInt_(offset));
}

- (jint)getLargeFontVerticalOffsetAdjustment {
  return [((JavaLangInteger *) nil_chk(((ADXBadgeState_State *) nil_chk(currentState_))->largeFontVerticalOffsetAdjustment_)) intValue];
}

- (void)setLargeFontVerticalOffsetAdjustmentWithInt:(jint)offsetAdjustment {
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(overridingState_))->largeFontVerticalOffsetAdjustment_, JavaLangInteger_valueOfWithInt_(offsetAdjustment));
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(currentState_))->largeFontVerticalOffsetAdjustment_, JavaLangInteger_valueOfWithInt_(offsetAdjustment));
}

- (jint)getAdditionalHorizontalOffset {
  return [((JavaLangInteger *) nil_chk(((ADXBadgeState_State *) nil_chk(currentState_))->additionalHorizontalOffset_)) intValue];
}

- (void)setAdditionalHorizontalOffsetWithInt:(jint)offset {
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(overridingState_))->additionalHorizontalOffset_, JavaLangInteger_valueOfWithInt_(offset));
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(currentState_))->additionalHorizontalOffset_, JavaLangInteger_valueOfWithInt_(offset));
}

- (jint)getAdditionalVerticalOffset {
  return [((JavaLangInteger *) nil_chk(((ADXBadgeState_State *) nil_chk(currentState_))->additionalVerticalOffset_)) intValue];
}

- (void)setAdditionalVerticalOffsetWithInt:(jint)offset {
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(overridingState_))->additionalVerticalOffset_, JavaLangInteger_valueOfWithInt_(offset));
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(currentState_))->additionalVerticalOffset_, JavaLangInteger_valueOfWithInt_(offset));
}

- (JavaUtilLocale *)getNumberLocale {
  return ((ADXBadgeState_State *) nil_chk(currentState_))->numberLocale_;
}

- (void)setNumberLocaleWithJavaUtilLocale:(JavaUtilLocale *)locale {
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(overridingState_))->numberLocale_, locale);
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(currentState_))->numberLocale_, locale);
}

- (jboolean)isAutoAdjustedToGrandparentBounds {
  return [((JavaLangBoolean *) nil_chk(((ADXBadgeState_State *) nil_chk(currentState_))->autoAdjustToWithinGrandparentBounds_)) booleanValue];
}

- (void)setAutoAdjustToGrandparentBoundsWithBoolean:(jboolean)autoAdjustToGrandparentBounds {
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(overridingState_))->autoAdjustToWithinGrandparentBounds_, JavaLangBoolean_valueOfWithBoolean_(autoAdjustToGrandparentBounds));
  JreStrongAssign(&((ADXBadgeState_State *) nil_chk(currentState_))->autoAdjustToWithinGrandparentBounds_, JavaLangBoolean_valueOfWithBoolean_(autoAdjustToGrandparentBounds));
}

- (instancetype)initWithADContext:(ADContext *)context
          withADXBadgeState_State:(ADXBadgeState_State *)storedState {
  ADXBadgeState_initWithADContext_withADXBadgeState_State_(self, context, storedState);
  return self;
}

- (void)dealloc {
  RELEASE_(overridingState_);
  RELEASE_(currentState_);
  [super dealloc];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "LADXBadgeState_State;", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 0, 1, -1, -1, -1, -1 },
    { NULL, "Z", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 2, 3, -1, -1, -1, -1 },
    { NULL, "V", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 4, 5, -1, -1, -1, -1 },
    { NULL, "V", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 6, 3, -1, -1, -1, -1 },
    { NULL, "I", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 7, 3, -1, -1, -1, -1 },
    { NULL, "I", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 8, 3, -1, -1, -1, -1 },
    { NULL, "I", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 9, 3, -1, -1, -1, -1 },
    { NULL, "I", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 10, 3, -1, -1, -1, -1 },
    { NULL, "I", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 11, 3, -1, -1, -1, -1 },
    { NULL, "I", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 12, 3, -1, -1, -1, -1 },
    { NULL, "I", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 13, 3, -1, -1, -1, -1 },
    { NULL, "I", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 14, 3, -1, -1, -1, -1 },
    { NULL, "I", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 15, 3, -1, -1, -1, -1 },
    { NULL, "I", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 16, 3, -1, -1, -1, -1 },
    { NULL, "I", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 17, 3, -1, -1, -1, -1 },
    { NULL, "I", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 18, 3, -1, -1, -1, -1 },
    { NULL, "I", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 19, 3, -1, -1, -1, -1 },
    { NULL, "I", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 20, 3, -1, -1, -1, -1 },
    { NULL, "LJavaUtilLocale;", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 21, 22, -1, -1, -1, -1 },
    { NULL, "Z", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 23, 1, -1, -1, -1, -1 },
    { NULL, NULL, 0x1, -1, 24, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(getOverridingState);
  methods[1].selector = @selector(isVisible);
  methods[2].selector = @selector(setVisibleWithBoolean:);
  methods[3].selector = @selector(hasNumber);
  methods[4].selector = @selector(getNumber);
  methods[5].selector = @selector(setNumberWithInt:);
  methods[6].selector = @selector(clearNumber);
  methods[7].selector = @selector(hasText);
  methods[8].selector = @selector(getText);
  methods[9].selector = @selector(setTextWithNSString:);
  methods[10].selector = @selector(clearText);
  methods[11].selector = @selector(getAlpha);
  methods[12].selector = @selector(setAlphaWithInt:);
  methods[13].selector = @selector(getMaxCharacterCount);
  methods[14].selector = @selector(setMaxCharacterCountWithInt:);
  methods[15].selector = @selector(getMaxNumber);
  methods[16].selector = @selector(setMaxNumberWithInt:);
  methods[17].selector = @selector(getBackgroundColor);
  methods[18].selector = @selector(setBackgroundColorWithInt:);
  methods[19].selector = @selector(getBadgeTextColor);
  methods[20].selector = @selector(setBadgeTextColorWithInt:);
  methods[21].selector = @selector(getBadgeGravity);
  methods[22].selector = @selector(setBadgeGravityWithInt:);
  methods[23].selector = @selector(getBadgeHorizontalPadding);
  methods[24].selector = @selector(setBadgeHorizontalPaddingWithInt:);
  methods[25].selector = @selector(getBadgeVerticalPadding);
  methods[26].selector = @selector(setBadgeVerticalPaddingWithInt:);
  methods[27].selector = @selector(getHorizontalOffsetWithoutText);
  methods[28].selector = @selector(setHorizontalOffsetWithoutTextWithInt:);
  methods[29].selector = @selector(getVerticalOffsetWithoutText);
  methods[30].selector = @selector(setVerticalOffsetWithoutTextWithInt:);
  methods[31].selector = @selector(getHorizontalOffsetWithText);
  methods[32].selector = @selector(setHorizontalOffsetWithTextWithInt:);
  methods[33].selector = @selector(getVerticalOffsetWithText);
  methods[34].selector = @selector(setVerticalOffsetWithTextWithInt:);
  methods[35].selector = @selector(getLargeFontVerticalOffsetAdjustment);
  methods[36].selector = @selector(setLargeFontVerticalOffsetAdjustmentWithInt:);
  methods[37].selector = @selector(getAdditionalHorizontalOffset);
  methods[38].selector = @selector(setAdditionalHorizontalOffsetWithInt:);
  methods[39].selector = @selector(getAdditionalVerticalOffset);
  methods[40].selector = @selector(setAdditionalVerticalOffsetWithInt:);
  methods[41].selector = @selector(getNumberLocale);
  methods[42].selector = @selector(setNumberLocaleWithJavaUtilLocale:);
  methods[43].selector = @selector(isAutoAdjustedToGrandparentBounds);
  methods[44].selector = @selector(setAutoAdjustToGrandparentBoundsWithBoolean:);
  methods[45].selector = @selector(initWithADContext:withADXBadgeState_State:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "overridingState_", "LADXBadgeState_State;", .constantValue.asLong = 0, 0x12, -1, -1, -1, -1 },
    { "currentState_", "LADXBadgeState_State;", .constantValue.asLong = 0, 0x12, -1, -1, -1, -1 },
    { "badgeRadius_", "F", .constantValue.asLong = 0, 0x10, -1, -1, -1, -1 },
    { "badgeWithTextRadius_", "F", .constantValue.asLong = 0, 0x10, -1, -1, -1, -1 },
    { "badgeWidth_", "F", .constantValue.asLong = 0, 0x10, -1, -1, -1, -1 },
    { "badgeHeight_", "F", .constantValue.asLong = 0, 0x10, -1, -1, -1, -1 },
    { "badgeWithTextWidth_", "F", .constantValue.asLong = 0, 0x10, -1, -1, -1, -1 },
    { "badgeWithTextHeight_", "F", .constantValue.asLong = 0, 0x10, -1, -1, -1, -1 },
    { "horizontalInset_", "I", .constantValue.asLong = 0, 0x10, -1, -1, -1, -1 },
    { "horizontalInsetWithText_", "I", .constantValue.asLong = 0, 0x10, -1, -1, -1, -1 },
    { "offsetAlignmentMode_", "I", .constantValue.asLong = 0, 0x0, -1, -1, -1, -1 },
    { "badgeFixedEdge_", "I", .constantValue.asLong = 0, 0x0, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "setVisible", "Z", "setNumber", "I", "setText", "LNSString;", "setAlpha", "setMaxCharacterCount", "setMaxNumber", "setBackgroundColor", "setBadgeTextColor", "setBadgeGravity", "setBadgeHorizontalPadding", "setBadgeVerticalPadding", "setHorizontalOffsetWithoutText", "setVerticalOffsetWithoutText", "setHorizontalOffsetWithText", "setVerticalOffsetWithText", "setLargeFontVerticalOffsetAdjustment", "setAdditionalHorizontalOffset", "setAdditionalVerticalOffset", "setNumberLocale", "LJavaUtilLocale;", "setAutoAdjustToGrandparentBounds", "LADContext;LADXBadgeState_State;", "LADXBadgeState_State;" };
  static const J2ObjcClassInfo _ADXBadgeState = { "BadgeState", "com.google.android.material.badge", ptrTable, methods, fields, 7, 0x11, 46, 12, -1, 25, -1, -1, -1 };
  return &_ADXBadgeState;
}

@end

void ADXBadgeState_initWithADContext_withADXBadgeState_State_(ADXBadgeState *self, ADContext *context, ADXBadgeState_State *storedState) {
  NSObject_init(self);
  JreStrongAssignAndConsume(&self->currentState_, new_ADXBadgeState_State_init());
  if (storedState == nil) {
    storedState = create_ADXBadgeState_State_init();
  }
  self->badgeRadius_ = ASPluginInvoker_convertDpToPixelWithNSString_(@"4dp");
  self->horizontalInset_ = 0;
  self->badgeWithTextRadius_ = ASPluginInvoker_convertDpToPixelWithNSString_(@"8dp");
  self->badgeWidth_ = 0;
  self->badgeHeight_ = 0;
  self->badgeWithTextWidth_ = 0;
  self->badgeWithTextHeight_ = 0;
  self->horizontalInsetWithText_ = 0;
  JreStrongAssign(&self->overridingState_, storedState);
  JreStrongAssign(&self->currentState_->numberLocale_, JavaUtilLocale_getDefault());
  JreStrongAssign(&self->currentState_->badgeHorizontalPadding_, JavaLangInteger_valueOfWithInt_(0));
  JreStrongAssign(&self->currentState_->badgeVerticalPadding_, JavaLangInteger_valueOfWithInt_(0));
  JreStrongAssign(&self->currentState_->horizontalOffsetWithoutText_, JavaLangInteger_valueOfWithInt_(0));
  JreStrongAssign(&self->currentState_->verticalOffsetWithoutText_, JavaLangInteger_valueOfWithInt_(0));
  JreStrongAssign(&self->currentState_->horizontalOffsetWithText_, JavaLangInteger_valueOfWithInt_(0));
  JreStrongAssign(&self->currentState_->verticalOffsetWithText_, JavaLangInteger_valueOfWithInt_(0));
  JreStrongAssign(&self->currentState_->additionalHorizontalOffset_, JavaLangInteger_valueOfWithInt_(0));
  JreStrongAssign(&self->currentState_->additionalVerticalOffset_, JavaLangInteger_valueOfWithInt_(0));
  JreStrongAssign(&self->currentState_->largeFontVerticalOffsetAdjustment_, JavaLangInteger_valueOfWithInt_(0));
  JreStrongAssign(&self->currentState_->autoAdjustToWithinGrandparentBounds_, JavaLangBoolean_valueOfWithBoolean_(false));
  JreStrongAssign(&self->currentState_->badgeGravity_, JavaLangInteger_valueOfWithInt_(ADXBadgeDrawable_TOP_END));
  JreStrongAssign(&self->currentState_->badgeTextColor_, JavaLangInteger_valueOfWithInt_(ADColor_WHITE));
  JreStrongAssign(&self->currentState_->backgroundColor_, JavaLangInteger_valueOfWithInt_(ADColor_RED));
  self->currentState_->maxCharacterCount_ = 4;
  self->offsetAlignmentMode_ = 1;
}

ADXBadgeState *new_ADXBadgeState_initWithADContext_withADXBadgeState_State_(ADContext *context, ADXBadgeState_State *storedState) {
  J2OBJC_NEW_IMPL(ADXBadgeState, initWithADContext_withADXBadgeState_State_, context, storedState)
}

ADXBadgeState *create_ADXBadgeState_initWithADContext_withADXBadgeState_State_(ADContext *context, ADXBadgeState_State *storedState) {
  J2OBJC_CREATE_IMPL(ADXBadgeState, initWithADContext_withADXBadgeState_State_, context, storedState)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADXBadgeState)

@implementation ADXBadgeState_State

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADXBadgeState_State_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (void)dealloc {
  RELEASE_(backgroundColor_);
  RELEASE_(badgeTextColor_);
  RELEASE_(badgeTextAppearanceResId_);
  RELEASE_(badgeShapeAppearanceResId_);
  RELEASE_(badgeShapeAppearanceOverlayResId_);
  RELEASE_(badgeWithTextShapeAppearanceResId_);
  RELEASE_(badgeWithTextShapeAppearanceOverlayResId_);
  RELEASE_(text_);
  RELEASE_(numberLocale_);
  RELEASE_(badgeGravity_);
  RELEASE_(isVisible_);
  RELEASE_(badgeHorizontalPadding_);
  RELEASE_(badgeVerticalPadding_);
  RELEASE_(horizontalOffsetWithoutText_);
  RELEASE_(verticalOffsetWithoutText_);
  RELEASE_(horizontalOffsetWithText_);
  RELEASE_(verticalOffsetWithText_);
  RELEASE_(additionalHorizontalOffset_);
  RELEASE_(additionalVerticalOffset_);
  RELEASE_(largeFontVerticalOffsetAdjustment_);
  RELEASE_(autoAdjustToWithinGrandparentBounds_);
  RELEASE_(badgeFixedEdge_);
  [super dealloc];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "BADGE_NUMBER_NONE", "I", .constantValue.asInt = ADXBadgeState_State_BADGE_NUMBER_NONE, 0x1a, -1, -1, -1, -1 },
    { "NOT_SET", "I", .constantValue.asInt = ADXBadgeState_State_NOT_SET, 0x1a, -1, -1, -1, -1 },
    { "badgeResId_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "backgroundColor_", "LJavaLangInteger;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "badgeTextColor_", "LJavaLangInteger;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "badgeTextAppearanceResId_", "LJavaLangInteger;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "badgeShapeAppearanceResId_", "LJavaLangInteger;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "badgeShapeAppearanceOverlayResId_", "LJavaLangInteger;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "badgeWithTextShapeAppearanceResId_", "LJavaLangInteger;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "badgeWithTextShapeAppearanceOverlayResId_", "LJavaLangInteger;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "alpha_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "text_", "LNSString;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "number_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "maxCharacterCount_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "maxNumber_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "numberLocale_", "LJavaUtilLocale;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "contentDescriptionQuantityStrings_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "contentDescriptionExceedsMaxBadgeNumberRes_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "badgeGravity_", "LJavaLangInteger;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "isVisible_", "LJavaLangBoolean;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "badgeHorizontalPadding_", "LJavaLangInteger;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "badgeVerticalPadding_", "LJavaLangInteger;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "horizontalOffsetWithoutText_", "LJavaLangInteger;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "verticalOffsetWithoutText_", "LJavaLangInteger;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "horizontalOffsetWithText_", "LJavaLangInteger;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "verticalOffsetWithText_", "LJavaLangInteger;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "additionalHorizontalOffset_", "LJavaLangInteger;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "additionalVerticalOffset_", "LJavaLangInteger;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "largeFontVerticalOffsetAdjustment_", "LJavaLangInteger;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "autoAdjustToWithinGrandparentBounds_", "LJavaLangBoolean;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "badgeFixedEdge_", "LJavaLangInteger;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "LADXBadgeState;" };
  static const J2ObjcClassInfo _ADXBadgeState_State = { "State", "com.google.android.material.badge", ptrTable, methods, fields, 7, 0x19, 1, 31, 0, -1, -1, -1, -1 };
  return &_ADXBadgeState_State;
}

@end

void ADXBadgeState_State_init(ADXBadgeState_State *self) {
  NSObject_init(self);
  self->alpha_ = 255;
  self->number_ = ADXBadgeState_State_NOT_SET;
  self->maxCharacterCount_ = ADXBadgeState_State_NOT_SET;
  self->maxNumber_ = ADXBadgeState_State_NOT_SET;
  JreStrongAssign(&self->isVisible_, JavaLangBoolean_valueOfWithBoolean_(true));
}

ADXBadgeState_State *new_ADXBadgeState_State_init() {
  J2OBJC_NEW_IMPL(ADXBadgeState_State, init)
}

ADXBadgeState_State *create_ADXBadgeState_State_init() {
  J2OBJC_CREATE_IMPL(ADXBadgeState_State, init)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADXBadgeState_State)