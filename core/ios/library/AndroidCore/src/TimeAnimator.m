//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\animation\TimeAnimator.java
//

#include "AnimationUtils.h"
#include "J2ObjC_source.h"
#include "TimeAnimator.h"
#include "ValueAnimator.h"
#include "java/lang/Math.h"


@interface ADTimeAnimator () {
 @public
  id<ADTimeAnimator_TimeListener> mListener_;
  jlong mPreviousTime_;
}

@end

J2OBJC_FIELD_SETTER(ADTimeAnimator, mListener_, id<ADTimeAnimator_TimeListener>)

@interface ADTimeAnimator_TimeListener : NSObject

@end

@implementation ADTimeAnimator

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADTimeAnimator_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (void)start {
  mPreviousTime_ = -1;
  [super start];
}

- (jboolean)animateBasedOnTimeWithLong:(jlong)currentTime {
  if (mListener_ != nil) {
    jlong totalTime = currentTime - mStartTime_;
    jlong deltaTime = (mPreviousTime_ < 0) ? 0 : (currentTime - mPreviousTime_);
    mPreviousTime_ = currentTime;
    [mListener_ onTimeUpdateWithADTimeAnimator:self withLong:totalTime withLong:deltaTime];
  }
  return false;
}

- (void)setCurrentPlayTimeWithLong:(jlong)playTime {
  jlong currentTime = ADAnimationUtils_currentAnimationTimeMillis();
  mStartTime_ = JavaLangMath_maxWithLong_withLong_(mStartTime_, currentTime - playTime);
  mStartTimeCommitted_ = true;
  [self animateBasedOnTimeWithLong:currentTime];
}

- (void)setTimeListenerWithADTimeAnimator_TimeListener:(id<ADTimeAnimator_TimeListener>)listener {
  JreStrongAssign(&mListener_, listener);
}

- (void)animateValueWithFloat:(jfloat)fraction {
}

- (void)initAnimation {
}

- (void)dealloc {
  RELEASE_(mListener_);
  [super dealloc];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x0, 0, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 2, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 3, 4, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 5, 6, -1, -1, -1, -1 },
    { NULL, "V", 0x0, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(start);
  methods[2].selector = @selector(animateBasedOnTimeWithLong:);
  methods[3].selector = @selector(setCurrentPlayTimeWithLong:);
  methods[4].selector = @selector(setTimeListenerWithADTimeAnimator_TimeListener:);
  methods[5].selector = @selector(animateValueWithFloat:);
  methods[6].selector = @selector(initAnimation);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "mListener_", "LADTimeAnimator_TimeListener;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mPreviousTime_", "J", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "animateBasedOnTime", "J", "setCurrentPlayTime", "setTimeListener", "LADTimeAnimator_TimeListener;", "animateValue", "F" };
  static const J2ObjcClassInfo _ADTimeAnimator = { "TimeAnimator", "r.android.animation", ptrTable, methods, fields, 7, 0x1, 7, 2, -1, 4, -1, -1, -1 };
  return &_ADTimeAnimator;
}

@end

void ADTimeAnimator_init(ADTimeAnimator *self) {
  ADValueAnimator_init(self);
  self->mPreviousTime_ = -1;
}

ADTimeAnimator *new_ADTimeAnimator_init() {
  J2OBJC_NEW_IMPL(ADTimeAnimator, init)
}

ADTimeAnimator *create_ADTimeAnimator_init() {
  J2OBJC_CREATE_IMPL(ADTimeAnimator, init)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADTimeAnimator)

@implementation ADTimeAnimator_TimeListener

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "V", 0x401, 0, 1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(onTimeUpdateWithADTimeAnimator:withLong:withLong:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "onTimeUpdate", "LADTimeAnimator;JJ", "LADTimeAnimator;" };
  static const J2ObjcClassInfo _ADTimeAnimator_TimeListener = { "TimeListener", "r.android.animation", ptrTable, methods, NULL, 7, 0x609, 1, 0, 2, -1, -1, -1, -1 };
  return &_ADTimeAnimator_TimeListener;
}

@end

J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ADTimeAnimator_TimeListener)
