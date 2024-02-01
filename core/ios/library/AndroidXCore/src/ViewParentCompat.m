//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroidX-core\src\main\java\androidx\core\view\ViewParentCompat.java
//

#include "AccessibilityEvent.h"
#include "IOSClass.h"
#include "IOSObjectArray.h"
#include "IOSPrimitiveArray.h"
#include "J2ObjC_source.h"
#include "Log.h"
#include "NestedScrollingParent2.h"
#include "NestedScrollingParent3.h"
#include "View.h"
#include "ViewCompat.h"
#include "ViewParent.h"
#include "ViewParentCompat.h"
#include "java/lang/AbstractMethodError.h"
#include "java/lang/Deprecated.h"
#include "java/lang/annotation/Annotation.h"


@interface ADXViewParentCompat ()

- (instancetype)init;

+ (IOSIntArray *)getTempNestedScrollConsumed;

@end

inline NSString *ADXViewParentCompat_get_TAG(void);
static NSString *ADXViewParentCompat_TAG = @"ViewParentCompat";
J2OBJC_STATIC_FIELD_OBJ_FINAL(ADXViewParentCompat, TAG, NSString *)

inline IOSIntArray *ADXViewParentCompat_get_sTempNestedScrollConsumed(void);
inline IOSIntArray *ADXViewParentCompat_set_sTempNestedScrollConsumed(IOSIntArray *value);
static IOSIntArray *ADXViewParentCompat_sTempNestedScrollConsumed;
J2OBJC_STATIC_FIELD_OBJ(ADXViewParentCompat, sTempNestedScrollConsumed, IOSIntArray *)

__attribute__((unused)) static void ADXViewParentCompat_init(ADXViewParentCompat *self);

__attribute__((unused)) static ADXViewParentCompat *new_ADXViewParentCompat_init(void) NS_RETURNS_RETAINED;

__attribute__((unused)) static ADXViewParentCompat *create_ADXViewParentCompat_init(void);

__attribute__((unused)) static IOSIntArray *ADXViewParentCompat_getTempNestedScrollConsumed(void);

__attribute__((unused)) static IOSObjectArray *ADXViewParentCompat__Annotations$0(void);

@interface ADXViewParentCompat_Api21Impl ()

- (instancetype)init;

@end

__attribute__((unused)) static void ADXViewParentCompat_Api21Impl_init(ADXViewParentCompat_Api21Impl *self);

__attribute__((unused)) static ADXViewParentCompat_Api21Impl *new_ADXViewParentCompat_Api21Impl_init(void) NS_RETURNS_RETAINED;

__attribute__((unused)) static ADXViewParentCompat_Api21Impl *create_ADXViewParentCompat_Api21Impl_init(void);

@implementation ADXViewParentCompat

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADXViewParentCompat_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

+ (jboolean)requestSendAccessibilityEventWithADViewParent:(id<ADViewParent>)parent
                                               withADView:(ADView *)child
                                 withADAccessibilityEvent:(ADAccessibilityEvent *)event {
  return ADXViewParentCompat_requestSendAccessibilityEventWithADViewParent_withADView_withADAccessibilityEvent_(parent, child, event);
}

+ (jboolean)onStartNestedScrollWithADViewParent:(id<ADViewParent>)parent
                                     withADView:(ADView *)child
                                     withADView:(ADView *)target
                                        withInt:(jint)nestedScrollAxes {
  return ADXViewParentCompat_onStartNestedScrollWithADViewParent_withADView_withADView_withInt_(parent, child, target, nestedScrollAxes);
}

+ (void)onNestedScrollAcceptedWithADViewParent:(id<ADViewParent>)parent
                                    withADView:(ADView *)child
                                    withADView:(ADView *)target
                                       withInt:(jint)nestedScrollAxes {
  ADXViewParentCompat_onNestedScrollAcceptedWithADViewParent_withADView_withADView_withInt_(parent, child, target, nestedScrollAxes);
}

+ (void)onStopNestedScrollWithADViewParent:(id<ADViewParent>)parent
                                withADView:(ADView *)target {
  ADXViewParentCompat_onStopNestedScrollWithADViewParent_withADView_(parent, target);
}

+ (void)onNestedScrollWithADViewParent:(id<ADViewParent>)parent
                            withADView:(ADView *)target
                               withInt:(jint)dxConsumed
                               withInt:(jint)dyConsumed
                               withInt:(jint)dxUnconsumed
                               withInt:(jint)dyUnconsumed {
  ADXViewParentCompat_onNestedScrollWithADViewParent_withADView_withInt_withInt_withInt_withInt_(parent, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
}

+ (void)onNestedScrollWithADViewParent:(id<ADViewParent>)parent
                            withADView:(ADView *)target
                               withInt:(jint)dxConsumed
                               withInt:(jint)dyConsumed
                               withInt:(jint)dxUnconsumed
                               withInt:(jint)dyUnconsumed
                               withInt:(jint)type {
  ADXViewParentCompat_onNestedScrollWithADViewParent_withADView_withInt_withInt_withInt_withInt_withInt_(parent, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
}

+ (void)onNestedPreScrollWithADViewParent:(id<ADViewParent>)parent
                               withADView:(ADView *)target
                                  withInt:(jint)dx
                                  withInt:(jint)dy
                             withIntArray:(IOSIntArray *)consumed {
  ADXViewParentCompat_onNestedPreScrollWithADViewParent_withADView_withInt_withInt_withIntArray_(parent, target, dx, dy, consumed);
}

+ (jboolean)onStartNestedScrollWithADViewParent:(id<ADViewParent>)parent
                                     withADView:(ADView *)child
                                     withADView:(ADView *)target
                                        withInt:(jint)nestedScrollAxes
                                        withInt:(jint)type {
  return ADXViewParentCompat_onStartNestedScrollWithADViewParent_withADView_withADView_withInt_withInt_(parent, child, target, nestedScrollAxes, type);
}

+ (void)onNestedScrollAcceptedWithADViewParent:(id<ADViewParent>)parent
                                    withADView:(ADView *)child
                                    withADView:(ADView *)target
                                       withInt:(jint)nestedScrollAxes
                                       withInt:(jint)type {
  ADXViewParentCompat_onNestedScrollAcceptedWithADViewParent_withADView_withADView_withInt_withInt_(parent, child, target, nestedScrollAxes, type);
}

+ (void)onStopNestedScrollWithADViewParent:(id<ADViewParent>)parent
                                withADView:(ADView *)target
                                   withInt:(jint)type {
  ADXViewParentCompat_onStopNestedScrollWithADViewParent_withADView_withInt_(parent, target, type);
}

+ (void)onNestedScrollWithADViewParent:(id<ADViewParent>)parent
                            withADView:(ADView *)target
                               withInt:(jint)dxConsumed
                               withInt:(jint)dyConsumed
                               withInt:(jint)dxUnconsumed
                               withInt:(jint)dyUnconsumed
                               withInt:(jint)type
                          withIntArray:(IOSIntArray *)consumed {
  ADXViewParentCompat_onNestedScrollWithADViewParent_withADView_withInt_withInt_withInt_withInt_withInt_withIntArray_(parent, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type, consumed);
}

+ (void)onNestedPreScrollWithADViewParent:(id<ADViewParent>)parent
                               withADView:(ADView *)target
                                  withInt:(jint)dx
                                  withInt:(jint)dy
                             withIntArray:(IOSIntArray *)consumed
                                  withInt:(jint)type {
  ADXViewParentCompat_onNestedPreScrollWithADViewParent_withADView_withInt_withInt_withIntArray_withInt_(parent, target, dx, dy, consumed, type);
}

+ (jboolean)onNestedFlingWithADViewParent:(id<ADViewParent>)parent
                               withADView:(ADView *)target
                                withFloat:(jfloat)velocityX
                                withFloat:(jfloat)velocityY
                              withBoolean:(jboolean)consumed {
  return ADXViewParentCompat_onNestedFlingWithADViewParent_withADView_withFloat_withFloat_withBoolean_(parent, target, velocityX, velocityY, consumed);
}

+ (jboolean)onNestedPreFlingWithADViewParent:(id<ADViewParent>)parent
                                  withADView:(ADView *)target
                                   withFloat:(jfloat)velocityX
                                   withFloat:(jfloat)velocityY {
  return ADXViewParentCompat_onNestedPreFlingWithADViewParent_withADView_withFloat_withFloat_(parent, target, velocityX, velocityY);
}

+ (void)notifySubtreeAccessibilityStateChangedWithADViewParent:(id<ADViewParent>)parent
                                                    withADView:(ADView *)child
                                                    withADView:(ADView *)source
                                                       withInt:(jint)changeType {
  ADXViewParentCompat_notifySubtreeAccessibilityStateChangedWithADViewParent_withADView_withADView_withInt_(parent, child, source, changeType);
}

+ (IOSIntArray *)getTempNestedScrollConsumed {
  return ADXViewParentCompat_getTempNestedScrollConsumed();
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x2, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x9, 0, 1, -1, -1, 2, -1 },
    { NULL, "Z", 0x9, 3, 4, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 5, 4, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 6, 7, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 8, 9, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 8, 10, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 11, 12, -1, -1, -1, -1 },
    { NULL, "Z", 0x9, 3, 13, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 5, 13, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 6, 14, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 8, 15, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 11, 16, -1, -1, -1, -1 },
    { NULL, "Z", 0x9, 17, 18, -1, -1, -1, -1 },
    { NULL, "Z", 0x9, 19, 20, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 21, 4, -1, -1, -1, -1 },
    { NULL, "[I", 0xa, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(requestSendAccessibilityEventWithADViewParent:withADView:withADAccessibilityEvent:);
  methods[2].selector = @selector(onStartNestedScrollWithADViewParent:withADView:withADView:withInt:);
  methods[3].selector = @selector(onNestedScrollAcceptedWithADViewParent:withADView:withADView:withInt:);
  methods[4].selector = @selector(onStopNestedScrollWithADViewParent:withADView:);
  methods[5].selector = @selector(onNestedScrollWithADViewParent:withADView:withInt:withInt:withInt:withInt:);
  methods[6].selector = @selector(onNestedScrollWithADViewParent:withADView:withInt:withInt:withInt:withInt:withInt:);
  methods[7].selector = @selector(onNestedPreScrollWithADViewParent:withADView:withInt:withInt:withIntArray:);
  methods[8].selector = @selector(onStartNestedScrollWithADViewParent:withADView:withADView:withInt:withInt:);
  methods[9].selector = @selector(onNestedScrollAcceptedWithADViewParent:withADView:withADView:withInt:withInt:);
  methods[10].selector = @selector(onStopNestedScrollWithADViewParent:withADView:withInt:);
  methods[11].selector = @selector(onNestedScrollWithADViewParent:withADView:withInt:withInt:withInt:withInt:withInt:withIntArray:);
  methods[12].selector = @selector(onNestedPreScrollWithADViewParent:withADView:withInt:withInt:withIntArray:withInt:);
  methods[13].selector = @selector(onNestedFlingWithADViewParent:withADView:withFloat:withFloat:withBoolean:);
  methods[14].selector = @selector(onNestedPreFlingWithADViewParent:withADView:withFloat:withFloat:);
  methods[15].selector = @selector(notifySubtreeAccessibilityStateChangedWithADViewParent:withADView:withADView:withInt:);
  methods[16].selector = @selector(getTempNestedScrollConsumed);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "TAG", "LNSString;", .constantValue.asLong = 0, 0x1a, -1, 22, -1, -1 },
    { "sTempNestedScrollConsumed", "[I", .constantValue.asLong = 0, 0xa, -1, 23, -1, -1 },
  };
  static const void *ptrTable[] = { "requestSendAccessibilityEvent", "LADViewParent;LADView;LADAccessibilityEvent;", (void *)&ADXViewParentCompat__Annotations$0, "onStartNestedScroll", "LADViewParent;LADView;LADView;I", "onNestedScrollAccepted", "onStopNestedScroll", "LADViewParent;LADView;", "onNestedScroll", "LADViewParent;LADView;IIII", "LADViewParent;LADView;IIIII", "onNestedPreScroll", "LADViewParent;LADView;II[I", "LADViewParent;LADView;LADView;II", "LADViewParent;LADView;I", "LADViewParent;LADView;IIIII[I", "LADViewParent;LADView;II[II", "onNestedFling", "LADViewParent;LADView;FFZ", "onNestedPreFling", "LADViewParent;LADView;FF", "notifySubtreeAccessibilityStateChanged", &ADXViewParentCompat_TAG, &ADXViewParentCompat_sTempNestedScrollConsumed, "LADXViewParentCompat_Api21Impl;" };
  static const J2ObjcClassInfo _ADXViewParentCompat = { "ViewParentCompat", "androidx.core.view", ptrTable, methods, fields, 7, 0x11, 17, 2, -1, 24, -1, -1, -1 };
  return &_ADXViewParentCompat;
}

@end

void ADXViewParentCompat_init(ADXViewParentCompat *self) {
  NSObject_init(self);
}

ADXViewParentCompat *new_ADXViewParentCompat_init() {
  J2OBJC_NEW_IMPL(ADXViewParentCompat, init)
}

ADXViewParentCompat *create_ADXViewParentCompat_init() {
  J2OBJC_CREATE_IMPL(ADXViewParentCompat, init)
}

jboolean ADXViewParentCompat_requestSendAccessibilityEventWithADViewParent_withADView_withADAccessibilityEvent_(id<ADViewParent> parent, ADView *child, ADAccessibilityEvent *event) {
  ADXViewParentCompat_initialize();
  return false;
}

jboolean ADXViewParentCompat_onStartNestedScrollWithADViewParent_withADView_withADView_withInt_(id<ADViewParent> parent, ADView *child, ADView *target, jint nestedScrollAxes) {
  ADXViewParentCompat_initialize();
  return ADXViewParentCompat_onStartNestedScrollWithADViewParent_withADView_withADView_withInt_withInt_(parent, child, target, nestedScrollAxes, ADXViewCompat_TYPE_TOUCH);
}

void ADXViewParentCompat_onNestedScrollAcceptedWithADViewParent_withADView_withADView_withInt_(id<ADViewParent> parent, ADView *child, ADView *target, jint nestedScrollAxes) {
  ADXViewParentCompat_initialize();
  ADXViewParentCompat_onNestedScrollAcceptedWithADViewParent_withADView_withADView_withInt_withInt_(parent, child, target, nestedScrollAxes, ADXViewCompat_TYPE_TOUCH);
}

void ADXViewParentCompat_onStopNestedScrollWithADViewParent_withADView_(id<ADViewParent> parent, ADView *target) {
  ADXViewParentCompat_initialize();
  ADXViewParentCompat_onStopNestedScrollWithADViewParent_withADView_withInt_(parent, target, ADXViewCompat_TYPE_TOUCH);
}

void ADXViewParentCompat_onNestedScrollWithADViewParent_withADView_withInt_withInt_withInt_withInt_(id<ADViewParent> parent, ADView *target, jint dxConsumed, jint dyConsumed, jint dxUnconsumed, jint dyUnconsumed) {
  ADXViewParentCompat_initialize();
  ADXViewParentCompat_onNestedScrollWithADViewParent_withADView_withInt_withInt_withInt_withInt_withInt_withIntArray_(parent, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, ADXViewCompat_TYPE_TOUCH, ADXViewParentCompat_getTempNestedScrollConsumed());
}

void ADXViewParentCompat_onNestedScrollWithADViewParent_withADView_withInt_withInt_withInt_withInt_withInt_(id<ADViewParent> parent, ADView *target, jint dxConsumed, jint dyConsumed, jint dxUnconsumed, jint dyUnconsumed, jint type) {
  ADXViewParentCompat_initialize();
  ADXViewParentCompat_onNestedScrollWithADViewParent_withADView_withInt_withInt_withInt_withInt_withInt_withIntArray_(parent, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type, ADXViewParentCompat_getTempNestedScrollConsumed());
}

void ADXViewParentCompat_onNestedPreScrollWithADViewParent_withADView_withInt_withInt_withIntArray_(id<ADViewParent> parent, ADView *target, jint dx, jint dy, IOSIntArray *consumed) {
  ADXViewParentCompat_initialize();
  ADXViewParentCompat_onNestedPreScrollWithADViewParent_withADView_withInt_withInt_withIntArray_withInt_(parent, target, dx, dy, consumed, ADXViewCompat_TYPE_TOUCH);
}

jboolean ADXViewParentCompat_onStartNestedScrollWithADViewParent_withADView_withADView_withInt_withInt_(id<ADViewParent> parent, ADView *child, ADView *target, jint nestedScrollAxes, jint type) {
  ADXViewParentCompat_initialize();
  if ([ADXNestedScrollingParent2_class_() isInstance:parent]) {
    return [((id<ADXNestedScrollingParent2>) nil_chk(((id<ADXNestedScrollingParent2>) cast_check(parent, ADXNestedScrollingParent2_class_())))) onStartNestedScrollWithADView:child withADView:target withInt:nestedScrollAxes withInt:type];
  }
  else if (type == ADXViewCompat_TYPE_TOUCH) {
    {
      @try {
        return ADXViewParentCompat_Api21Impl_onStartNestedScrollWithADViewParent_withADView_withADView_withInt_(parent, child, target, nestedScrollAxes);
      }
      @catch (JavaLangAbstractMethodError *e) {
        ADLog_eWithNSString_withNSString_withJavaLangThrowable_(ADXViewParentCompat_TAG, JreStrcat("$@$", @"ViewParent ", parent, @" does not implement interface method onStartNestedScroll"), e);
      }
    }
  }
  return false;
}

void ADXViewParentCompat_onNestedScrollAcceptedWithADViewParent_withADView_withADView_withInt_withInt_(id<ADViewParent> parent, ADView *child, ADView *target, jint nestedScrollAxes, jint type) {
  ADXViewParentCompat_initialize();
  if ([ADXNestedScrollingParent2_class_() isInstance:parent]) {
    [((id<ADXNestedScrollingParent2>) nil_chk(((id<ADXNestedScrollingParent2>) cast_check(parent, ADXNestedScrollingParent2_class_())))) onNestedScrollAcceptedWithADView:child withADView:target withInt:nestedScrollAxes withInt:type];
  }
  else if (type == ADXViewCompat_TYPE_TOUCH) {
    {
      @try {
        ADXViewParentCompat_Api21Impl_onNestedScrollAcceptedWithADViewParent_withADView_withADView_withInt_(parent, child, target, nestedScrollAxes);
      }
      @catch (JavaLangAbstractMethodError *e) {
        ADLog_eWithNSString_withNSString_withJavaLangThrowable_(ADXViewParentCompat_TAG, JreStrcat("$@$", @"ViewParent ", parent, @" does not implement interface method onNestedScrollAccepted"), e);
      }
    }
  }
}

void ADXViewParentCompat_onStopNestedScrollWithADViewParent_withADView_withInt_(id<ADViewParent> parent, ADView *target, jint type) {
  ADXViewParentCompat_initialize();
  if ([ADXNestedScrollingParent2_class_() isInstance:parent]) {
    [((id<ADXNestedScrollingParent2>) nil_chk(((id<ADXNestedScrollingParent2>) cast_check(parent, ADXNestedScrollingParent2_class_())))) onStopNestedScrollWithADView:target withInt:type];
  }
  else if (type == ADXViewCompat_TYPE_TOUCH) {
    {
      @try {
        ADXViewParentCompat_Api21Impl_onStopNestedScrollWithADViewParent_withADView_(parent, target);
      }
      @catch (JavaLangAbstractMethodError *e) {
        ADLog_eWithNSString_withNSString_withJavaLangThrowable_(ADXViewParentCompat_TAG, JreStrcat("$@$", @"ViewParent ", parent, @" does not implement interface method onStopNestedScroll"), e);
      }
    }
  }
}

void ADXViewParentCompat_onNestedScrollWithADViewParent_withADView_withInt_withInt_withInt_withInt_withInt_withIntArray_(id<ADViewParent> parent, ADView *target, jint dxConsumed, jint dyConsumed, jint dxUnconsumed, jint dyUnconsumed, jint type, IOSIntArray *consumed) {
  ADXViewParentCompat_initialize();
  if ([ADXNestedScrollingParent3_class_() isInstance:parent]) {
    [((id<ADXNestedScrollingParent3>) nil_chk(((id<ADXNestedScrollingParent3>) cast_check(parent, ADXNestedScrollingParent3_class_())))) onNestedScrollWithADView:target withInt:dxConsumed withInt:dyConsumed withInt:dxUnconsumed withInt:dyUnconsumed withInt:type withIntArray:consumed];
  }
  else {
    *IOSIntArray_GetRef(nil_chk(consumed), 0) += dxUnconsumed;
    *IOSIntArray_GetRef(consumed, 1) += dyUnconsumed;
    if ([ADXNestedScrollingParent2_class_() isInstance:parent]) {
      [((id<ADXNestedScrollingParent2>) nil_chk(((id<ADXNestedScrollingParent2>) cast_check(parent, ADXNestedScrollingParent2_class_())))) onNestedScrollWithADView:target withInt:dxConsumed withInt:dyConsumed withInt:dxUnconsumed withInt:dyUnconsumed withInt:type];
    }
    else if (type == ADXViewCompat_TYPE_TOUCH) {
      {
        @try {
          ADXViewParentCompat_Api21Impl_onNestedScrollWithADViewParent_withADView_withInt_withInt_withInt_withInt_(parent, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
        }
        @catch (JavaLangAbstractMethodError *e) {
          ADLog_eWithNSString_withNSString_withJavaLangThrowable_(ADXViewParentCompat_TAG, JreStrcat("$@$", @"ViewParent ", parent, @" does not implement interface method onNestedScroll"), e);
        }
      }
    }
  }
}

void ADXViewParentCompat_onNestedPreScrollWithADViewParent_withADView_withInt_withInt_withIntArray_withInt_(id<ADViewParent> parent, ADView *target, jint dx, jint dy, IOSIntArray *consumed, jint type) {
  ADXViewParentCompat_initialize();
  if ([ADXNestedScrollingParent2_class_() isInstance:parent]) {
    [((id<ADXNestedScrollingParent2>) nil_chk(((id<ADXNestedScrollingParent2>) cast_check(parent, ADXNestedScrollingParent2_class_())))) onNestedPreScrollWithADView:target withInt:dx withInt:dy withIntArray:consumed withInt:type];
  }
  else if (type == ADXViewCompat_TYPE_TOUCH) {
    {
      @try {
        ADXViewParentCompat_Api21Impl_onNestedPreScrollWithADViewParent_withADView_withInt_withInt_withIntArray_(parent, target, dx, dy, consumed);
      }
      @catch (JavaLangAbstractMethodError *e) {
        ADLog_eWithNSString_withNSString_withJavaLangThrowable_(ADXViewParentCompat_TAG, JreStrcat("$@$", @"ViewParent ", parent, @" does not implement interface method onNestedPreScroll"), e);
      }
    }
  }
}

jboolean ADXViewParentCompat_onNestedFlingWithADViewParent_withADView_withFloat_withFloat_withBoolean_(id<ADViewParent> parent, ADView *target, jfloat velocityX, jfloat velocityY, jboolean consumed) {
  ADXViewParentCompat_initialize();
  {
    @try {
      return ADXViewParentCompat_Api21Impl_onNestedFlingWithADViewParent_withADView_withFloat_withFloat_withBoolean_(parent, target, velocityX, velocityY, consumed);
    }
    @catch (JavaLangAbstractMethodError *e) {
      ADLog_eWithNSString_withNSString_withJavaLangThrowable_(ADXViewParentCompat_TAG, JreStrcat("$@$", @"ViewParent ", parent, @" does not implement interface method onNestedFling"), e);
    }
  }
  return false;
}

jboolean ADXViewParentCompat_onNestedPreFlingWithADViewParent_withADView_withFloat_withFloat_(id<ADViewParent> parent, ADView *target, jfloat velocityX, jfloat velocityY) {
  ADXViewParentCompat_initialize();
  {
    @try {
      return ADXViewParentCompat_Api21Impl_onNestedPreFlingWithADViewParent_withADView_withFloat_withFloat_(parent, target, velocityX, velocityY);
    }
    @catch (JavaLangAbstractMethodError *e) {
      ADLog_eWithNSString_withNSString_withJavaLangThrowable_(ADXViewParentCompat_TAG, JreStrcat("$@$", @"ViewParent ", parent, @" does not implement interface method onNestedPreFling"), e);
    }
  }
  return false;
}

void ADXViewParentCompat_notifySubtreeAccessibilityStateChangedWithADViewParent_withADView_withADView_withInt_(id<ADViewParent> parent, ADView *child, ADView *source, jint changeType) {
  ADXViewParentCompat_initialize();
}

IOSIntArray *ADXViewParentCompat_getTempNestedScrollConsumed() {
  ADXViewParentCompat_initialize();
  if (ADXViewParentCompat_sTempNestedScrollConsumed == nil) {
    JreStrongAssignAndConsume(&ADXViewParentCompat_sTempNestedScrollConsumed, [IOSIntArray newArrayWithLength:2]);
  }
  else {
    *IOSIntArray_GetRef(ADXViewParentCompat_sTempNestedScrollConsumed, 0) = 0;
    *IOSIntArray_GetRef(ADXViewParentCompat_sTempNestedScrollConsumed, 1) = 0;
  }
  return ADXViewParentCompat_sTempNestedScrollConsumed;
}

IOSObjectArray *ADXViewParentCompat__Annotations$0() {
  return [IOSObjectArray arrayWithObjects:(id[]){ create_JavaLangDeprecated() } count:1 type:JavaLangAnnotationAnnotation_class_()];
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADXViewParentCompat)

@implementation ADXViewParentCompat_Api21Impl

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADXViewParentCompat_Api21Impl_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

+ (jboolean)onStartNestedScrollWithADViewParent:(id<ADViewParent>)viewParent
                                     withADView:(ADView *)view
                                     withADView:(ADView *)view1
                                        withInt:(jint)i {
  return ADXViewParentCompat_Api21Impl_onStartNestedScrollWithADViewParent_withADView_withADView_withInt_(viewParent, view, view1, i);
}

+ (void)onNestedScrollAcceptedWithADViewParent:(id<ADViewParent>)viewParent
                                    withADView:(ADView *)view
                                    withADView:(ADView *)view1
                                       withInt:(jint)i {
  ADXViewParentCompat_Api21Impl_onNestedScrollAcceptedWithADViewParent_withADView_withADView_withInt_(viewParent, view, view1, i);
}

+ (void)onStopNestedScrollWithADViewParent:(id<ADViewParent>)viewParent
                                withADView:(ADView *)view {
  ADXViewParentCompat_Api21Impl_onStopNestedScrollWithADViewParent_withADView_(viewParent, view);
}

+ (void)onNestedScrollWithADViewParent:(id<ADViewParent>)viewParent
                            withADView:(ADView *)view
                               withInt:(jint)i
                               withInt:(jint)i1
                               withInt:(jint)i2
                               withInt:(jint)i3 {
  ADXViewParentCompat_Api21Impl_onNestedScrollWithADViewParent_withADView_withInt_withInt_withInt_withInt_(viewParent, view, i, i1, i2, i3);
}

+ (void)onNestedPreScrollWithADViewParent:(id<ADViewParent>)viewParent
                               withADView:(ADView *)view
                                  withInt:(jint)i
                                  withInt:(jint)i1
                             withIntArray:(IOSIntArray *)ints {
  ADXViewParentCompat_Api21Impl_onNestedPreScrollWithADViewParent_withADView_withInt_withInt_withIntArray_(viewParent, view, i, i1, ints);
}

+ (jboolean)onNestedFlingWithADViewParent:(id<ADViewParent>)viewParent
                               withADView:(ADView *)view
                                withFloat:(jfloat)v
                                withFloat:(jfloat)v1
                              withBoolean:(jboolean)b {
  return ADXViewParentCompat_Api21Impl_onNestedFlingWithADViewParent_withADView_withFloat_withFloat_withBoolean_(viewParent, view, v, v1, b);
}

+ (jboolean)onNestedPreFlingWithADViewParent:(id<ADViewParent>)viewParent
                                  withADView:(ADView *)view
                                   withFloat:(jfloat)v
                                   withFloat:(jfloat)v1 {
  return ADXViewParentCompat_Api21Impl_onNestedPreFlingWithADViewParent_withADView_withFloat_withFloat_(viewParent, view, v, v1);
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x2, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x8, 0, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x8, 2, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x8, 3, 4, -1, -1, -1, -1 },
    { NULL, "V", 0x8, 5, 6, -1, -1, -1, -1 },
    { NULL, "V", 0x8, 7, 8, -1, -1, -1, -1 },
    { NULL, "Z", 0x8, 9, 10, -1, -1, -1, -1 },
    { NULL, "Z", 0x8, 11, 12, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(onStartNestedScrollWithADViewParent:withADView:withADView:withInt:);
  methods[2].selector = @selector(onNestedScrollAcceptedWithADViewParent:withADView:withADView:withInt:);
  methods[3].selector = @selector(onStopNestedScrollWithADViewParent:withADView:);
  methods[4].selector = @selector(onNestedScrollWithADViewParent:withADView:withInt:withInt:withInt:withInt:);
  methods[5].selector = @selector(onNestedPreScrollWithADViewParent:withADView:withInt:withInt:withIntArray:);
  methods[6].selector = @selector(onNestedFlingWithADViewParent:withADView:withFloat:withFloat:withBoolean:);
  methods[7].selector = @selector(onNestedPreFlingWithADViewParent:withADView:withFloat:withFloat:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "onStartNestedScroll", "LADViewParent;LADView;LADView;I", "onNestedScrollAccepted", "onStopNestedScroll", "LADViewParent;LADView;", "onNestedScroll", "LADViewParent;LADView;IIII", "onNestedPreScroll", "LADViewParent;LADView;II[I", "onNestedFling", "LADViewParent;LADView;FFZ", "onNestedPreFling", "LADViewParent;LADView;FF", "LADXViewParentCompat;" };
  static const J2ObjcClassInfo _ADXViewParentCompat_Api21Impl = { "Api21Impl", "androidx.core.view", ptrTable, methods, NULL, 7, 0x8, 8, 0, 13, -1, -1, -1, -1 };
  return &_ADXViewParentCompat_Api21Impl;
}

@end

void ADXViewParentCompat_Api21Impl_init(ADXViewParentCompat_Api21Impl *self) {
  NSObject_init(self);
}

ADXViewParentCompat_Api21Impl *new_ADXViewParentCompat_Api21Impl_init() {
  J2OBJC_NEW_IMPL(ADXViewParentCompat_Api21Impl, init)
}

ADXViewParentCompat_Api21Impl *create_ADXViewParentCompat_Api21Impl_init() {
  J2OBJC_CREATE_IMPL(ADXViewParentCompat_Api21Impl, init)
}

jboolean ADXViewParentCompat_Api21Impl_onStartNestedScrollWithADViewParent_withADView_withADView_withInt_(id<ADViewParent> viewParent, ADView *view, ADView *view1, jint i) {
  ADXViewParentCompat_Api21Impl_initialize();
  return [((id<ADViewParent>) nil_chk(viewParent)) onStartNestedScrollWithADView:view withADView:view1 withInt:i];
}

void ADXViewParentCompat_Api21Impl_onNestedScrollAcceptedWithADViewParent_withADView_withADView_withInt_(id<ADViewParent> viewParent, ADView *view, ADView *view1, jint i) {
  ADXViewParentCompat_Api21Impl_initialize();
  [((id<ADViewParent>) nil_chk(viewParent)) onNestedScrollAcceptedWithADView:view withADView:view1 withInt:i];
}

void ADXViewParentCompat_Api21Impl_onStopNestedScrollWithADViewParent_withADView_(id<ADViewParent> viewParent, ADView *view) {
  ADXViewParentCompat_Api21Impl_initialize();
  [((id<ADViewParent>) nil_chk(viewParent)) onStopNestedScrollWithADView:view];
}

void ADXViewParentCompat_Api21Impl_onNestedScrollWithADViewParent_withADView_withInt_withInt_withInt_withInt_(id<ADViewParent> viewParent, ADView *view, jint i, jint i1, jint i2, jint i3) {
  ADXViewParentCompat_Api21Impl_initialize();
  [((id<ADViewParent>) nil_chk(viewParent)) onNestedScrollWithADView:view withInt:i withInt:i1 withInt:i2 withInt:i3];
}

void ADXViewParentCompat_Api21Impl_onNestedPreScrollWithADViewParent_withADView_withInt_withInt_withIntArray_(id<ADViewParent> viewParent, ADView *view, jint i, jint i1, IOSIntArray *ints) {
  ADXViewParentCompat_Api21Impl_initialize();
  [((id<ADViewParent>) nil_chk(viewParent)) onNestedPreScrollWithADView:view withInt:i withInt:i1 withIntArray:ints];
}

jboolean ADXViewParentCompat_Api21Impl_onNestedFlingWithADViewParent_withADView_withFloat_withFloat_withBoolean_(id<ADViewParent> viewParent, ADView *view, jfloat v, jfloat v1, jboolean b) {
  ADXViewParentCompat_Api21Impl_initialize();
  return [((id<ADViewParent>) nil_chk(viewParent)) onNestedFlingWithADView:view withFloat:v withFloat:v1 withBoolean:b];
}

jboolean ADXViewParentCompat_Api21Impl_onNestedPreFlingWithADViewParent_withADView_withFloat_withFloat_(id<ADViewParent> viewParent, ADView *view, jfloat v, jfloat v1) {
  ADXViewParentCompat_Api21Impl_initialize();
  return [((id<ADViewParent>) nil_chk(viewParent)) onNestedPreFlingWithADView:view withFloat:v withFloat:v1];
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADXViewParentCompat_Api21Impl)
