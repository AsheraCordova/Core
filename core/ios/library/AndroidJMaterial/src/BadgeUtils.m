//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\AndroidJMaterial\src\main\java\com\google\android\material\badge\BadgeUtils.java
//

#include "BadgeDrawable.h"
#include "BadgeUtils.h"
#include "FrameLayout.h"
#include "J2ObjC_source.h"
#include "Rect.h"
#include "View.h"
#include "ViewOverlay.h"


inline NSString *ADXBadgeUtils_get_LOG_TAG(void);
static NSString *ADXBadgeUtils_LOG_TAG = @"BadgeUtils";
J2OBJC_STATIC_FIELD_OBJ_FINAL(ADXBadgeUtils, LOG_TAG, NSString *)

@implementation ADXBadgeUtils

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADXBadgeUtils_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

+ (void)updateBadgeBoundsWithADRect:(ADRect *)rect
                          withFloat:(jfloat)centerX
                          withFloat:(jfloat)centerY
                          withFloat:(jfloat)halfWidth
                          withFloat:(jfloat)halfHeight {
  ADXBadgeUtils_updateBadgeBoundsWithADRect_withFloat_withFloat_withFloat_withFloat_(rect, centerX, centerY, halfWidth, halfHeight);
}

+ (void)attachBadgeDrawableWithADXBadgeDrawable:(ADXBadgeDrawable *)badgeDrawable
                                     withADView:(ADView *)anchor
                              withADFrameLayout:(ADFrameLayout *)customBadgeParent {
  ADXBadgeUtils_attachBadgeDrawableWithADXBadgeDrawable_withADView_withADFrameLayout_(badgeDrawable, anchor, customBadgeParent);
}

+ (void)detachBadgeDrawableWithADXBadgeDrawable:(ADXBadgeDrawable *)badgeDrawable
                                     withADView:(ADView *)anchor {
  ADXBadgeUtils_detachBadgeDrawableWithADXBadgeDrawable_withADView_(badgeDrawable, anchor);
}

+ (void)setBadgeDrawableBoundsWithADXBadgeDrawable:(ADXBadgeDrawable *)badgeDrawable
                                        withADView:(ADView *)anchor
                                 withADFrameLayout:(ADFrameLayout *)compatBadgeParent {
  ADXBadgeUtils_setBadgeDrawableBoundsWithADXBadgeDrawable_withADView_withADFrameLayout_(badgeDrawable, anchor, compatBadgeParent);
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 0, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 2, 3, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 4, 5, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 6, 3, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(updateBadgeBoundsWithADRect:withFloat:withFloat:withFloat:withFloat:);
  methods[2].selector = @selector(attachBadgeDrawableWithADXBadgeDrawable:withADView:withADFrameLayout:);
  methods[3].selector = @selector(detachBadgeDrawableWithADXBadgeDrawable:withADView:);
  methods[4].selector = @selector(setBadgeDrawableBoundsWithADXBadgeDrawable:withADView:withADFrameLayout:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "LOG_TAG", "LNSString;", .constantValue.asLong = 0, 0x1a, -1, 7, -1, -1 },
    { "USE_COMPAT_PARENT", "Z", .constantValue.asBOOL = ADXBadgeUtils_USE_COMPAT_PARENT, 0x19, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "updateBadgeBounds", "LADRect;FFFF", "attachBadgeDrawable", "LADXBadgeDrawable;LADView;LADFrameLayout;", "detachBadgeDrawable", "LADXBadgeDrawable;LADView;", "setBadgeDrawableBounds", &ADXBadgeUtils_LOG_TAG };
  static const J2ObjcClassInfo _ADXBadgeUtils = { "BadgeUtils", "com.google.android.material.badge", ptrTable, methods, fields, 7, 0x1, 5, 2, -1, -1, -1, -1, -1 };
  return &_ADXBadgeUtils;
}

@end

void ADXBadgeUtils_init(ADXBadgeUtils *self) {
  NSObject_init(self);
}

ADXBadgeUtils *new_ADXBadgeUtils_init() {
  J2OBJC_NEW_IMPL(ADXBadgeUtils, init)
}

ADXBadgeUtils *create_ADXBadgeUtils_init() {
  J2OBJC_CREATE_IMPL(ADXBadgeUtils, init)
}

void ADXBadgeUtils_updateBadgeBoundsWithADRect_withFloat_withFloat_withFloat_withFloat_(ADRect *rect, jfloat centerX, jfloat centerY, jfloat halfWidth, jfloat halfHeight) {
  ADXBadgeUtils_initialize();
  [((ADRect *) nil_chk(rect)) setWithInt:JreFpToInt((centerX - halfWidth)) withInt:JreFpToInt((centerY - halfHeight)) withInt:JreFpToInt((centerX + halfWidth)) withInt:JreFpToInt((centerY + halfHeight))];
}

void ADXBadgeUtils_attachBadgeDrawableWithADXBadgeDrawable_withADView_withADFrameLayout_(ADXBadgeDrawable *badgeDrawable, ADView *anchor, ADFrameLayout *customBadgeParent) {
  ADXBadgeUtils_initialize();
  ADXBadgeUtils_setBadgeDrawableBoundsWithADXBadgeDrawable_withADView_withADFrameLayout_(badgeDrawable, anchor, customBadgeParent);
  if ([((ADXBadgeDrawable *) nil_chk(badgeDrawable)) getCustomBadgeParent] != nil) {
    [((ADFrameLayout *) nil_chk([badgeDrawable getCustomBadgeParent])) setForegroundWithADDrawable:badgeDrawable];
  }
  else {
    [((ADViewOverlay *) nil_chk([((ADView *) nil_chk(anchor)) getOverlay])) addWithADDrawable:badgeDrawable];
  }
}

void ADXBadgeUtils_detachBadgeDrawableWithADXBadgeDrawable_withADView_(ADXBadgeDrawable *badgeDrawable, ADView *anchor) {
  ADXBadgeUtils_initialize();
  if (badgeDrawable == nil) {
    return;
  }
  if ([badgeDrawable getCustomBadgeParent] != nil) {
    [((ADFrameLayout *) nil_chk([badgeDrawable getCustomBadgeParent])) setForegroundWithADDrawable:nil];
  }
  else {
    [((ADViewOverlay *) nil_chk([((ADView *) nil_chk(anchor)) getOverlay])) removeWithADDrawable:badgeDrawable];
  }
}

void ADXBadgeUtils_setBadgeDrawableBoundsWithADXBadgeDrawable_withADView_withADFrameLayout_(ADXBadgeDrawable *badgeDrawable, ADView *anchor, ADFrameLayout *compatBadgeParent) {
  ADXBadgeUtils_initialize();
  ADRect *badgeBounds = create_ADRect_init();
  [((ADView *) nil_chk(anchor)) getDrawingRectWithADRect:badgeBounds];
  [((ADXBadgeDrawable *) nil_chk(badgeDrawable)) setBoundsWithADRect:badgeBounds];
  [badgeDrawable updateBadgeCoordinatesWithADView:anchor withADFrameLayout:compatBadgeParent];
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADXBadgeUtils)
