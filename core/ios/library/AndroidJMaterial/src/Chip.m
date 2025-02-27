//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\AndroidJMaterial\src\main\java\com\google\android\material\chip\Chip.java
//

#include "Chip.h"
#include "ColorStateList.h"
#include "CompoundButton.h"
#include "Drawable.h"
#include "FrameLayout.h"
#include "HasWidgets.h"
#include "IFragment.h"
#include "IWidget.h"
#include "J2ObjC_source.h"
#include "MaterialCheckable.h"
#include "PluginInvoker.h"
#include "View.h"
#include "java/lang/Float.h"
#include "java/lang/Integer.h"


@interface ADXChip () {
 @public
  ADDrawable *chipIcon_;
  ADDrawable *checkedIcon_;
  ADColorStateList *chipIconTint_;
  jfloat chipEndPadding_;
  jfloat chipStartPadding_;
  id<ASIWidget> textWidget_;
  id<ASIWidget> checkboxWidget_;
  id<ASIWidget> closeIconWidget_;
  id<ASIWidget> iconWidget_;
  ADColorStateList *checkedIconTint_;
  ADDrawable *closeIcon_;
  ADColorStateList *closeIconTint_;
  jfloat chipCornerRadius_;
  jfloat closeIconEndPadding_;
  jfloat closeIconStartPadding_;
  jfloat closeIconSize_;
  jfloat textEndPadding_;
  jfloat textStartPadding_;
  jfloat minHeight_;
  id<ASHasWidgets> parentLL_;
  id<ADCompoundButton_OnCheckedChangeListener> onCheckedChangeListener_;
  jboolean checkedIconVisible_;
  jboolean checkable_;
  jboolean checked_;
  jboolean shouldEnsureMinTouchTargetSize_;
  id<ADXMaterialCheckable_OnCheckedChangeListener> internalOnCheckedChangeListener_;
  ADColorStateList *chipBackgroundColor_;
  ADColorStateList *chipStrokeColor_;
  jfloat chipStrokeWidth_;
  jfloat iconEndPadding_;
  jfloat iconStartPadding_;
  id<ADView_OnClickListener> rippleInternalClickListener_;
  id<ADView_OnClickListener> chipClickListener_;
}

@end

J2OBJC_FIELD_SETTER(ADXChip, chipIcon_, ADDrawable *)
J2OBJC_FIELD_SETTER(ADXChip, checkedIcon_, ADDrawable *)
J2OBJC_FIELD_SETTER(ADXChip, chipIconTint_, ADColorStateList *)
J2OBJC_FIELD_SETTER(ADXChip, textWidget_, id<ASIWidget>)
J2OBJC_FIELD_SETTER(ADXChip, checkboxWidget_, id<ASIWidget>)
J2OBJC_FIELD_SETTER(ADXChip, closeIconWidget_, id<ASIWidget>)
J2OBJC_FIELD_SETTER(ADXChip, iconWidget_, id<ASIWidget>)
J2OBJC_FIELD_SETTER(ADXChip, checkedIconTint_, ADColorStateList *)
J2OBJC_FIELD_SETTER(ADXChip, closeIcon_, ADDrawable *)
J2OBJC_FIELD_SETTER(ADXChip, closeIconTint_, ADColorStateList *)
J2OBJC_FIELD_SETTER(ADXChip, parentLL_, id<ASHasWidgets>)
J2OBJC_FIELD_SETTER(ADXChip, onCheckedChangeListener_, id<ADCompoundButton_OnCheckedChangeListener>)
J2OBJC_FIELD_SETTER(ADXChip, internalOnCheckedChangeListener_, id<ADXMaterialCheckable_OnCheckedChangeListener>)
J2OBJC_FIELD_SETTER(ADXChip, chipBackgroundColor_, ADColorStateList *)
J2OBJC_FIELD_SETTER(ADXChip, chipStrokeColor_, ADColorStateList *)
J2OBJC_FIELD_SETTER(ADXChip, rippleInternalClickListener_, id<ADView_OnClickListener>)
J2OBJC_FIELD_SETTER(ADXChip, chipClickListener_, id<ADView_OnClickListener>)

@interface ADXChip_ChipClickListener : NSObject < ADView_OnClickListener > {
 @public
  __unsafe_unretained ADXChip *this$0_;
  id<ASIWidget> textWidget_;
}

- (instancetype)initWithADXChip:(ADXChip *)outer$
                  withASIWidget:(id<ASIWidget>)textWidget;

- (void)onClickWithADView:(ADView *)v;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXChip_ChipClickListener)

J2OBJC_FIELD_SETTER(ADXChip_ChipClickListener, textWidget_, id<ASIWidget>)

__attribute__((unused)) static void ADXChip_ChipClickListener_initWithADXChip_withASIWidget_(ADXChip_ChipClickListener *self, ADXChip *outer$, id<ASIWidget> textWidget);

__attribute__((unused)) static ADXChip_ChipClickListener *new_ADXChip_ChipClickListener_initWithADXChip_withASIWidget_(ADXChip *outer$, id<ASIWidget> textWidget) NS_RETURNS_RETAINED;

__attribute__((unused)) static ADXChip_ChipClickListener *create_ADXChip_ChipClickListener_initWithADXChip_withASIWidget_(ADXChip *outer$, id<ASIWidget> textWidget);

J2OBJC_TYPE_LITERAL_HEADER(ADXChip_ChipClickListener)

@implementation ADXChip

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADXChip_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (void)setInternalOnCheckedChangeListenerWithADXMaterialCheckable_OnCheckedChangeListener:(id<ADXMaterialCheckable_OnCheckedChangeListener>)listener {
  JreStrongAssign(&self->internalOnCheckedChangeListener_, listener);
}

- (void)setCheckedWithBoolean:(jboolean)checked {
  if (checkable_) {
    self->checked_ = checked;
    [((id<ASIWidget>) nil_chk(checkboxWidget_)) setVisibleWithBoolean:checked];
  }
  [self requestLayout];
}

- (jboolean)isChecked {
  return checked_;
}

- (void)toggle {
  if (checkable_ && checkedIconVisible_) {
    [self setCheckedWithBoolean:![self isChecked]];
  }
}

- (void)initViewWithASHasWidgets:(id<ASHasWidgets>)parentLL
                   withASIWidget:(id<ASIWidget>)textWidget
                   withASIWidget:(id<ASIWidget>)iconWidget
                   withASIWidget:(id<ASIWidget>)checkboxWidget
                   withASIWidget:(id<ASIWidget>)closeIconWidget {
  JreStrongAssign(&self->textWidget_, textWidget);
  JreStrongAssign(&self->checkboxWidget_, checkboxWidget);
  JreStrongAssign(&self->closeIconWidget_, closeIconWidget);
  JreStrongAssign(&self->iconWidget_, iconWidget);
  JreStrongAssign(&self->parentLL_, parentLL);
  id<ADView_OnClickListener> clickListener = create_ADXChip_ChipClickListener_initWithADXChip_withASIWidget_(self, textWidget);
  if ([((NSString *) nil_chk(ASPluginInvoker_getOS())) java_equalsIgnoreCase:@"swt"]) {
    [((id<ASIWidget>) nil_chk(self->textWidget_)) setAttributeWithNSString:@"onClick" withId:clickListener withBoolean:true];
    [((id<ASIWidget>) nil_chk(self->checkboxWidget_)) setAttributeWithNSString:@"onClick" withId:clickListener withBoolean:true];
    [((id<ASIWidget>) nil_chk(self->iconWidget_)) setAttributeWithNSString:@"onClick" withId:clickListener withBoolean:true];
  }
  [((id<ASHasWidgets>) nil_chk(self->parentLL_)) setAttributeWithNSString:@"onClick" withId:clickListener withBoolean:true];
}

- (void)setTextWithNSString:(NSString *)text {
  [((id<ASIWidget>) nil_chk(textWidget_)) setAttributeWithNSString:@"text" withId:text withBoolean:true];
}

- (void)setCheckableWithBoolean:(jboolean)checkable {
  self->checkable_ = checkable;
  [((id<ASIWidget>) nil_chk(checkboxWidget_)) setVisibleWithBoolean:false];
}

- (void)setChipEndPaddingWithFloat:(jfloat)padding {
  self->chipEndPadding_ = padding;
  [((id<ASHasWidgets>) nil_chk(parentLL_)) setAttributeWithNSString:@"paddingEnd" withId:JavaLangInteger_valueOfWithInt_(JreFpToInt(padding)) withBoolean:true];
}

- (void)setChipIconSizeWithFloat:(jfloat)iconSize {
  [((id<ASIWidget>) nil_chk(iconWidget_)) setAttributeWithNSString:@"layout_width" withId:JavaLangInteger_valueOfWithInt_(JreFpToInt(iconSize)) withBoolean:true];
  [((id<ASIWidget>) nil_chk(iconWidget_)) setAttributeWithNSString:@"layout_height" withId:JavaLangInteger_valueOfWithInt_(JreFpToInt(iconSize)) withBoolean:true];
}

- (void)setChipIconWithADDrawable:(ADDrawable *)drawable {
  JreStrongAssign(&self->chipIcon_, drawable);
  [((id<ASIWidget>) nil_chk(iconWidget_)) setAttributeWithNSString:@"src" withId:drawable withBoolean:true];
  [((id<ASIWidget>) nil_chk(iconWidget_)) setVisibleWithBoolean:drawable != nil];
}

- (void)setChipIconTintWithADColorStateList:(ADColorStateList *)tint {
  JreStrongAssign(&self->chipIconTint_, tint);
  [((id<ASIWidget>) nil_chk(iconWidget_)) setAttributeWithNSString:@"tint" withId:tint withBoolean:true];
}

- (void)setChipIconVisibleWithBoolean:(jboolean)visible {
  [((id<ASIWidget>) nil_chk(iconWidget_)) setVisibleWithBoolean:visible];
}

- (void)setChipStartPaddingWithFloat:(jfloat)padding {
  self->chipStartPadding_ = padding;
  [((id<ASHasWidgets>) nil_chk(parentLL_)) setAttributeWithNSString:@"paddingStart" withId:JavaLangInteger_valueOfWithInt_(JreFpToInt(padding)) withBoolean:true];
}

- (jfloat)getChipEndPadding {
  return chipEndPadding_;
}

- (ADDrawable *)getChipIcon {
  return chipIcon_;
}

- (ADColorStateList *)getChipIconTint {
  return chipIconTint_;
}

- (jfloat)getChipStartPadding {
  return chipStartPadding_;
}

- (void)setCheckedIconWithADDrawable:(ADDrawable *)drawable {
  JreStrongAssign(&self->checkedIcon_, drawable);
  [((id<ASIWidget>) nil_chk(checkboxWidget_)) setAttributeWithNSString:@"src" withId:drawable withBoolean:true];
  [((id<ASIWidget>) nil_chk(checkboxWidget_)) setVisibleWithBoolean:drawable != nil];
}

- (void)setCheckedIconTintWithADColorStateList:(ADColorStateList *)tint {
  JreStrongAssign(&self->checkedIconTint_, tint);
  [((id<ASIWidget>) nil_chk(checkboxWidget_)) setAttributeWithNSString:@"tint" withId:tint withBoolean:true];
}

- (void)setCheckedIconVisibleWithBoolean:(jboolean)isVisible {
  self->checkedIconVisible_ = isVisible;
  if (!isVisible) {
    [((id<ASIWidget>) nil_chk(checkboxWidget_)) setVisibleWithBoolean:false];
  }
  else {
    [((id<ASIWidget>) nil_chk(checkboxWidget_)) setVisibleWithBoolean:checked_];
  }
}

- (void)setChipCornerRadiusWithFloat:(jfloat)radius {
  self->chipCornerRadius_ = radius;
  [((id<ASHasWidgets>) nil_chk(parentLL_)) setAttributeWithNSString:@"cornerRadius" withId:JavaLangInteger_valueOfWithInt_(JreFpToInt(radius)) withBoolean:true];
}

- (void)setChipMinHeightWithFloat:(jfloat)minHeight {
  self->minHeight_ = minHeight;
  [self setMyAttributeWithNSString:@"minHeight" withId:JavaLangInteger_valueOfWithInt_(JreFpToInt(minHeight))];
}

- (void)setCloseIconWithADDrawable:(ADDrawable *)drawable {
  JreStrongAssign(&self->closeIcon_, drawable);
  [((id<ASIWidget>) nil_chk(closeIconWidget_)) setAttributeWithNSString:@"src" withId:drawable withBoolean:true];
  [((id<ASIWidget>) nil_chk(closeIconWidget_)) setVisibleWithBoolean:drawable != nil];
}

- (void)setCloseIconEndPaddingWithFloat:(jfloat)padding {
  self->closeIconEndPadding_ = padding;
  [((id<ASIWidget>) nil_chk(closeIconWidget_)) setAttributeWithNSString:@"layout_marginEnd" withId:JavaLangInteger_valueOfWithInt_(JreFpToInt(padding)) withBoolean:true];
}

- (void)setCloseIconSizeWithFloat:(jfloat)iconSize {
  self->closeIconSize_ = iconSize;
  [((id<ASIWidget>) nil_chk(closeIconWidget_)) setAttributeWithNSString:@"layout_width" withId:JavaLangInteger_valueOfWithInt_(JreFpToInt(iconSize)) withBoolean:true];
  [((id<ASIWidget>) nil_chk(closeIconWidget_)) setAttributeWithNSString:@"layout_height" withId:JavaLangInteger_valueOfWithInt_(JreFpToInt(iconSize)) withBoolean:true];
}

- (void)setCloseIconStartPaddingWithFloat:(jfloat)padding {
  self->closeIconStartPadding_ = padding;
  [((id<ASIWidget>) nil_chk(closeIconWidget_)) setAttributeWithNSString:@"layout_marginStart" withId:JavaLangInteger_valueOfWithInt_(JreFpToInt(padding)) withBoolean:true];
}

- (void)setCloseIconTintWithADColorStateList:(ADColorStateList *)tint {
  JreStrongAssign(&self->closeIconTint_, tint);
  [((id<ASIWidget>) nil_chk(closeIconWidget_)) setAttributeWithNSString:@"tint" withId:tint withBoolean:true];
}

- (void)setCloseIconVisibleWithBoolean:(jboolean)isVisible {
  [((id<ASIWidget>) nil_chk(closeIconWidget_)) setVisibleWithBoolean:isVisible];
}

- (void)setTextEndPaddingWithFloat:(jfloat)padding {
  self->textEndPadding_ = padding;
  [((id<ASIWidget>) nil_chk(textWidget_)) setAttributeWithNSString:@"paddingEnd" withId:JavaLangInteger_valueOfWithInt_(JreFpToInt(padding)) withBoolean:true];
}

- (void)setTextStartPaddingWithFloat:(jfloat)padding {
  self->textStartPadding_ = padding;
  [((id<ASIWidget>) nil_chk(textWidget_)) setAttributeWithNSString:@"paddingStart" withId:JavaLangInteger_valueOfWithInt_(JreFpToInt(padding)) withBoolean:true];
}

- (void)setMaxWidthWithInt:(jint)width {
  [self setMyAttributeWithNSString:@"maxWidth" withId:JavaLangInteger_valueOfWithInt_(width)];
}

- (ADDrawable *)getCheckedIcon {
  return checkedIcon_;
}

- (ADColorStateList *)getCheckedIconTint {
  return checkedIconTint_;
}

- (jfloat)getChipCornerRadius {
  return chipCornerRadius_;
}

- (ADDrawable *)getCloseIcon {
  return closeIcon_;
}

- (jfloat)getCloseIconEndPadding {
  return closeIconEndPadding_;
}

- (jfloat)getCloseIconSize {
  return closeIconSize_;
}

- (jfloat)getCloseIconStartPadding {
  return closeIconStartPadding_;
}

- (ADColorStateList *)getCloseIconTint {
  return closeIconTint_;
}

- (jfloat)getTextEndPadding {
  return self->textEndPadding_;
}

- (jfloat)getTextStartPadding {
  return self->textStartPadding_;
}

- (jfloat)getChipMinHeight {
  return self->minHeight_;
}

- (void)setOnCloseIconClickListenerWithADView_OnClickListener:(id<ADView_OnClickListener>)clickListener {
  [((id<ASIWidget>) nil_chk(self->closeIconWidget_)) setAttributeWithNSString:@"onClick" withId:clickListener withBoolean:true];
}

- (void)setOnCheckedChangeListenerWithADCompoundButton_OnCheckedChangeListener:(id<ADCompoundButton_OnCheckedChangeListener>)onCheckedChangeListener {
  JreStrongAssign(&self->onCheckedChangeListener_, onCheckedChangeListener);
}

- (void)setEllipsizeWithNSString:(NSString *)strValue {
  [((id<ASIWidget>) nil_chk(textWidget_)) setAttributeWithNSString:@"ellipsize" withId:strValue withBoolean:false];
}

- (void)requestLayout {
  [super requestLayout];
  if (parentLL_ != nil) {
    [parentLL_ requestLayout];
  }
}

- (void)setEnsureMinTouchTargetSizeWithBoolean:(jboolean)shouldEnsureMinTouchTargetSize {
  self->shouldEnsureMinTouchTargetSize_ = shouldEnsureMinTouchTargetSize;
  if (shouldEnsureMinTouchTargetSize) {
    [((id<ASHasWidgets>) nil_chk(parentLL_)) setAttributeWithNSString:@"layout_marginVertical" withId:@"16dp" withBoolean:false];
  }
  else {
    [((id<ASHasWidgets>) nil_chk(parentLL_)) setAttributeWithNSString:@"layout_marginVertical" withId:@"0dp" withBoolean:false];
  }
}

- (jboolean)shouldEnsureMinTouchTargetSize {
  return shouldEnsureMinTouchTargetSize_;
}

- (void)setTextAppearanceWithNSString:(NSString *)strValue {
  [((id<ASIWidget>) nil_chk(textWidget_)) setAttributeWithNSString:@"textAppearance" withId:strValue withBoolean:false];
}

- (void)setChipBackgroundColorWithADColorStateList:(ADColorStateList *)chipBackgroundColor {
  JreStrongAssign(&self->chipBackgroundColor_, chipBackgroundColor);
  [((id<ASHasWidgets>) nil_chk(parentLL_)) setAttributeWithNSString:@"background" withId:chipBackgroundColor withBoolean:true];
}

- (void)setChipStrokeColorWithADColorStateList:(ADColorStateList *)chipStrokeColor {
  JreStrongAssign(&self->chipStrokeColor_, chipStrokeColor);
  [((id<ASHasWidgets>) nil_chk(parentLL_)) setAttributeWithNSString:@"cornerRadius" withId:JavaLangInteger_valueOfWithInt_(0) withBoolean:true];
  [((id<ASHasWidgets>) nil_chk(parentLL_)) setAttributeWithNSString:@"borderRadius" withId:JavaLangFloat_valueOfWithFloat_(chipCornerRadius_) withBoolean:true];
  [((id<ASHasWidgets>) nil_chk(parentLL_)) setAttributeWithNSString:@"borderColor" withId:chipStrokeColor withBoolean:true];
  [((id<ASHasWidgets>) nil_chk(parentLL_)) setAttributeWithNSString:@"borderWidth" withId:@"1dp" withBoolean:false];
}

- (void)setChipStrokeWidthWithFloat:(jfloat)chipStrokeWidth {
  self->chipStrokeWidth_ = chipStrokeWidth;
  [((id<ASHasWidgets>) nil_chk(parentLL_)) setAttributeWithNSString:@"cornerRadius" withId:JavaLangInteger_valueOfWithInt_(0) withBoolean:true];
  [((id<ASHasWidgets>) nil_chk(parentLL_)) setAttributeWithNSString:@"borderRadius" withId:JavaLangFloat_valueOfWithFloat_(chipCornerRadius_) withBoolean:true];
  [((id<ASHasWidgets>) nil_chk(parentLL_)) setAttributeWithNSString:@"borderWidth" withId:JavaLangInteger_valueOfWithInt_(JreFpToInt(chipStrokeWidth)) withBoolean:true];
}

- (void)setIconEndPaddingWithFloat:(jfloat)padding {
  self->iconEndPadding_ = padding;
  [((id<ASIWidget>) nil_chk(iconWidget_)) setAttributeWithNSString:@"layout_marginEnd" withId:JavaLangInteger_valueOfWithInt_(JreFpToInt(padding)) withBoolean:true];
}

- (void)setIconStartPaddingWithFloat:(jfloat)padding {
  self->iconStartPadding_ = padding;
  [((id<ASIWidget>) nil_chk(iconWidget_)) setAttributeWithNSString:@"layout_marginStart" withId:JavaLangInteger_valueOfWithInt_(JreFpToInt(padding)) withBoolean:true];
}

- (ADColorStateList *)getChipBackgroundColor {
  return chipBackgroundColor_;
}

- (ADColorStateList *)getChipStrokeColor {
  return chipStrokeColor_;
}

- (jfloat)getChipStrokeWidth {
  return chipStrokeWidth_;
}

- (jfloat)getIconEndPadding {
  return iconEndPadding_;
}

- (jfloat)getIconStartPadding {
  return iconStartPadding_;
}

- (id<ADView_OnClickListener>)getRippleInternalClickListener {
  return rippleInternalClickListener_;
}

- (void)setRippleInternalClickListenerWithADView_OnClickListener:(id<ADView_OnClickListener>)rippleInternalClickListener {
  JreStrongAssign(&self->rippleInternalClickListener_, rippleInternalClickListener);
}

- (void)setChipClickListenerWithADView_OnClickListener:(id<ADView_OnClickListener>)chipClickListener {
  JreStrongAssign(&self->chipClickListener_, chipClickListener);
}

- (void)dealloc {
  RELEASE_(chipIcon_);
  RELEASE_(checkedIcon_);
  RELEASE_(chipIconTint_);
  RELEASE_(textWidget_);
  RELEASE_(checkboxWidget_);
  RELEASE_(closeIconWidget_);
  RELEASE_(iconWidget_);
  RELEASE_(checkedIconTint_);
  RELEASE_(closeIcon_);
  RELEASE_(closeIconTint_);
  RELEASE_(parentLL_);
  RELEASE_(onCheckedChangeListener_);
  RELEASE_(internalOnCheckedChangeListener_);
  RELEASE_(chipBackgroundColor_);
  RELEASE_(chipStrokeColor_);
  RELEASE_(rippleInternalClickListener_);
  RELEASE_(chipClickListener_);
  [super dealloc];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 0, 1, -1, 2, -1, -1 },
    { NULL, "V", 0x1, 3, 4, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 5, 6, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 7, 8, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 9, 4, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 10, 11, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 12, 11, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 13, 14, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 15, 16, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 17, 4, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 18, 11, -1, -1, -1, -1 },
    { NULL, "F", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LADDrawable;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LADColorStateList;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "F", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 19, 14, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 20, 16, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 21, 4, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 22, 11, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 23, 11, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 24, 14, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 25, 11, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 26, 11, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 27, 11, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 28, 16, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 29, 4, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 30, 11, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 31, 11, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 32, 33, -1, -1, -1, -1 },
    { NULL, "LADDrawable;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LADColorStateList;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "F", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LADDrawable;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "F", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "F", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "F", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LADColorStateList;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "F", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "F", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "F", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 34, 35, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 36, 37, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 38, 8, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 39, 4, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 40, 8, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 41, 16, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 42, 16, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 43, 11, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 44, 11, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 45, 11, -1, -1, -1, -1 },
    { NULL, "LADColorStateList;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LADColorStateList;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "F", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "F", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "F", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LADView_OnClickListener;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 46, 35, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 47, 35, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(setInternalOnCheckedChangeListenerWithADXMaterialCheckable_OnCheckedChangeListener:);
  methods[2].selector = @selector(setCheckedWithBoolean:);
  methods[3].selector = @selector(isChecked);
  methods[4].selector = @selector(toggle);
  methods[5].selector = @selector(initViewWithASHasWidgets:withASIWidget:withASIWidget:withASIWidget:withASIWidget:);
  methods[6].selector = @selector(setTextWithNSString:);
  methods[7].selector = @selector(setCheckableWithBoolean:);
  methods[8].selector = @selector(setChipEndPaddingWithFloat:);
  methods[9].selector = @selector(setChipIconSizeWithFloat:);
  methods[10].selector = @selector(setChipIconWithADDrawable:);
  methods[11].selector = @selector(setChipIconTintWithADColorStateList:);
  methods[12].selector = @selector(setChipIconVisibleWithBoolean:);
  methods[13].selector = @selector(setChipStartPaddingWithFloat:);
  methods[14].selector = @selector(getChipEndPadding);
  methods[15].selector = @selector(getChipIcon);
  methods[16].selector = @selector(getChipIconTint);
  methods[17].selector = @selector(getChipStartPadding);
  methods[18].selector = @selector(setCheckedIconWithADDrawable:);
  methods[19].selector = @selector(setCheckedIconTintWithADColorStateList:);
  methods[20].selector = @selector(setCheckedIconVisibleWithBoolean:);
  methods[21].selector = @selector(setChipCornerRadiusWithFloat:);
  methods[22].selector = @selector(setChipMinHeightWithFloat:);
  methods[23].selector = @selector(setCloseIconWithADDrawable:);
  methods[24].selector = @selector(setCloseIconEndPaddingWithFloat:);
  methods[25].selector = @selector(setCloseIconSizeWithFloat:);
  methods[26].selector = @selector(setCloseIconStartPaddingWithFloat:);
  methods[27].selector = @selector(setCloseIconTintWithADColorStateList:);
  methods[28].selector = @selector(setCloseIconVisibleWithBoolean:);
  methods[29].selector = @selector(setTextEndPaddingWithFloat:);
  methods[30].selector = @selector(setTextStartPaddingWithFloat:);
  methods[31].selector = @selector(setMaxWidthWithInt:);
  methods[32].selector = @selector(getCheckedIcon);
  methods[33].selector = @selector(getCheckedIconTint);
  methods[34].selector = @selector(getChipCornerRadius);
  methods[35].selector = @selector(getCloseIcon);
  methods[36].selector = @selector(getCloseIconEndPadding);
  methods[37].selector = @selector(getCloseIconSize);
  methods[38].selector = @selector(getCloseIconStartPadding);
  methods[39].selector = @selector(getCloseIconTint);
  methods[40].selector = @selector(getTextEndPadding);
  methods[41].selector = @selector(getTextStartPadding);
  methods[42].selector = @selector(getChipMinHeight);
  methods[43].selector = @selector(setOnCloseIconClickListenerWithADView_OnClickListener:);
  methods[44].selector = @selector(setOnCheckedChangeListenerWithADCompoundButton_OnCheckedChangeListener:);
  methods[45].selector = @selector(setEllipsizeWithNSString:);
  methods[46].selector = @selector(requestLayout);
  methods[47].selector = @selector(setEnsureMinTouchTargetSizeWithBoolean:);
  methods[48].selector = @selector(shouldEnsureMinTouchTargetSize);
  methods[49].selector = @selector(setTextAppearanceWithNSString:);
  methods[50].selector = @selector(setChipBackgroundColorWithADColorStateList:);
  methods[51].selector = @selector(setChipStrokeColorWithADColorStateList:);
  methods[52].selector = @selector(setChipStrokeWidthWithFloat:);
  methods[53].selector = @selector(setIconEndPaddingWithFloat:);
  methods[54].selector = @selector(setIconStartPaddingWithFloat:);
  methods[55].selector = @selector(getChipBackgroundColor);
  methods[56].selector = @selector(getChipStrokeColor);
  methods[57].selector = @selector(getChipStrokeWidth);
  methods[58].selector = @selector(getIconEndPadding);
  methods[59].selector = @selector(getIconStartPadding);
  methods[60].selector = @selector(getRippleInternalClickListener);
  methods[61].selector = @selector(setRippleInternalClickListenerWithADView_OnClickListener:);
  methods[62].selector = @selector(setChipClickListenerWithADView_OnClickListener:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "chipIcon_", "LADDrawable;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "checkedIcon_", "LADDrawable;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "chipIconTint_", "LADColorStateList;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "chipEndPadding_", "F", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "chipStartPadding_", "F", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "textWidget_", "LASIWidget;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "checkboxWidget_", "LASIWidget;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "closeIconWidget_", "LASIWidget;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "iconWidget_", "LASIWidget;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "checkedIconTint_", "LADColorStateList;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "closeIcon_", "LADDrawable;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "closeIconTint_", "LADColorStateList;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "chipCornerRadius_", "F", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "closeIconEndPadding_", "F", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "closeIconStartPadding_", "F", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "closeIconSize_", "F", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "textEndPadding_", "F", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "textStartPadding_", "F", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "minHeight_", "F", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "parentLL_", "LASHasWidgets;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "onCheckedChangeListener_", "LADCompoundButton_OnCheckedChangeListener;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "checkedIconVisible_", "Z", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "checkable_", "Z", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "checked_", "Z", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "shouldEnsureMinTouchTargetSize_", "Z", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "internalOnCheckedChangeListener_", "LADXMaterialCheckable_OnCheckedChangeListener;", .constantValue.asLong = 0, 0x2, -1, -1, 48, -1 },
    { "chipBackgroundColor_", "LADColorStateList;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "chipStrokeColor_", "LADColorStateList;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "chipStrokeWidth_", "F", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "iconEndPadding_", "F", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "iconStartPadding_", "F", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "rippleInternalClickListener_", "LADView_OnClickListener;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "chipClickListener_", "LADView_OnClickListener;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "setInternalOnCheckedChangeListener", "LADXMaterialCheckable_OnCheckedChangeListener;", "(Lcom/google/android/material/internal/MaterialCheckable$OnCheckedChangeListener<Lcom/google/android/material/chip/Chip;>;)V", "setChecked", "Z", "initView", "LASHasWidgets;LASIWidget;LASIWidget;LASIWidget;LASIWidget;", "setText", "LNSString;", "setCheckable", "setChipEndPadding", "F", "setChipIconSize", "setChipIcon", "LADDrawable;", "setChipIconTint", "LADColorStateList;", "setChipIconVisible", "setChipStartPadding", "setCheckedIcon", "setCheckedIconTint", "setCheckedIconVisible", "setChipCornerRadius", "setChipMinHeight", "setCloseIcon", "setCloseIconEndPadding", "setCloseIconSize", "setCloseIconStartPadding", "setCloseIconTint", "setCloseIconVisible", "setTextEndPadding", "setTextStartPadding", "setMaxWidth", "I", "setOnCloseIconClickListener", "LADView_OnClickListener;", "setOnCheckedChangeListener", "LADCompoundButton_OnCheckedChangeListener;", "setEllipsize", "setEnsureMinTouchTargetSize", "setTextAppearance", "setChipBackgroundColor", "setChipStrokeColor", "setChipStrokeWidth", "setIconEndPadding", "setIconStartPadding", "setRippleInternalClickListener", "setChipClickListener", "Lcom/google/android/material/internal/MaterialCheckable$OnCheckedChangeListener<Lcom/google/android/material/chip/Chip;>;", "LADXChip_ChipClickListener;", "Lr/android/widget/FrameLayout;Lcom/google/android/material/internal/MaterialCheckable<Lcom/google/android/material/chip/Chip;>;" };
  static const J2ObjcClassInfo _ADXChip = { "Chip", "com.google.android.material.chip", ptrTable, methods, fields, 7, 0x1, 63, 33, -1, 49, -1, 50, -1 };
  return &_ADXChip;
}

@end

void ADXChip_init(ADXChip *self) {
  ADFrameLayout_init(self);
  self->checkedIconVisible_ = true;
}

ADXChip *new_ADXChip_init() {
  J2OBJC_NEW_IMPL(ADXChip, init)
}

ADXChip *create_ADXChip_init() {
  J2OBJC_CREATE_IMPL(ADXChip, init)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADXChip)

@implementation ADXChip_ChipClickListener

- (instancetype)initWithADXChip:(ADXChip *)outer$
                  withASIWidget:(id<ASIWidget>)textWidget {
  ADXChip_ChipClickListener_initWithADXChip_withASIWidget_(self, outer$, textWidget);
  return self;
}

- (void)onClickWithADView:(ADView *)v {
  [this$0_ toggle];
  if (this$0_->rippleInternalClickListener_ != nil) {
    [this$0_->rippleInternalClickListener_ onClickWithADView:v];
  }
  if (this$0_->chipClickListener_ != nil) {
    [this$0_->chipClickListener_ onClickWithADView:v];
  }
  if (this$0_->internalOnCheckedChangeListener_ != nil) {
    [this$0_->internalOnCheckedChangeListener_ onCheckedChangedWithId:this$0_ withBoolean:[this$0_ isChecked]];
  }
  if (this$0_->internalOnCheckedChangeListener_ != nil) {
    [this$0_->internalOnCheckedChangeListener_ onCheckedChangedWithId:this$0_ withBoolean:[this$0_ isChecked]];
  }
  [this$0_ requestLayout];
  [((id<ASIFragment>) nil_chk([((id<ASIWidget>) nil_chk(textWidget_)) getFragment])) remeasure];
}

- (void)__javaClone:(ADXChip_ChipClickListener *)original {
  [super __javaClone:original];
  [this$0_ release];
}

- (void)dealloc {
  RELEASE_(textWidget_);
  [super dealloc];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x2, -1, 0, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 1, 2, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(initWithADXChip:withASIWidget:);
  methods[1].selector = @selector(onClickWithADView:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "this$0_", "LADXChip;", .constantValue.asLong = 0, 0x1012, -1, -1, -1, -1 },
    { "textWidget_", "LASIWidget;", .constantValue.asLong = 0, 0x12, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "LADXChip;LASIWidget;", "onClick", "LADView;", "LADXChip;" };
  static const J2ObjcClassInfo _ADXChip_ChipClickListener = { "ChipClickListener", "com.google.android.material.chip", ptrTable, methods, fields, 7, 0x12, 2, 2, 3, -1, -1, -1, -1 };
  return &_ADXChip_ChipClickListener;
}

@end

void ADXChip_ChipClickListener_initWithADXChip_withASIWidget_(ADXChip_ChipClickListener *self, ADXChip *outer$, id<ASIWidget> textWidget) {
  self->this$0_ = outer$;
  NSObject_init(self);
  JreStrongAssign(&self->textWidget_, textWidget);
}

ADXChip_ChipClickListener *new_ADXChip_ChipClickListener_initWithADXChip_withASIWidget_(ADXChip *outer$, id<ASIWidget> textWidget) {
  J2OBJC_NEW_IMPL(ADXChip_ChipClickListener, initWithADXChip_withASIWidget_, outer$, textWidget)
}

ADXChip_ChipClickListener *create_ADXChip_ChipClickListener_initWithADXChip_withASIWidget_(ADXChip *outer$, id<ASIWidget> textWidget) {
  J2OBJC_CREATE_IMPL(ADXChip_ChipClickListener, initWithADXChip_withASIWidget_, outer$, textWidget)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADXChip_ChipClickListener)
