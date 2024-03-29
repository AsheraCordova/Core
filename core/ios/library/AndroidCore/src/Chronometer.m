//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\widget\Chronometer.java
//

#include "Chronometer.h"
#include "DateUtils.h"
#include "IOSClass.h"
#include "IOSObjectArray.h"
#include "IWidget.h"
#include "J2ObjC_source.h"
#include "Log.h"
#include "R.h"
#include "Resources.h"
#include "SystemClock.h"
#include "TextView.h"
#include "java/lang/Runnable.h"
#include "java/lang/StringBuilder.h"
#include "java/util/Formatter.h"
#include "java/util/IllegalFormatException.h"
#include "java/util/Locale.h"

@class JavaLangStringBuilder;
@class JavaUtilFormatter;
@class JavaUtilLocale;
@protocol JavaLangRunnable;


@interface ADChronometer () {
 @public
  jlong mBase_;
  jlong mNow_;
  jboolean mVisible_;
  jboolean mStarted_;
  jboolean mRunning_;
  jboolean mLogged_;
  NSString *mFormat_;
  JavaUtilFormatter *mFormatter_;
  JavaUtilLocale *mFormatterLocale_;
  IOSObjectArray *mFormatterArgs_;
  JavaLangStringBuilder *mFormatBuilder_;
  id<ADChronometer_OnChronometerTickListener> mOnChronometerTickListener_;
  JavaLangStringBuilder *mRecycle_;
  jboolean mCountDown_;
  id<JavaLangRunnable> mTickRunnable_Chronometer_;
}

- (void)init__ OBJC_METHOD_FAMILY_NONE;

- (void)updateTextWithLong:(jlong)now;

- (void)updateRunning;

@end

J2OBJC_FIELD_SETTER(ADChronometer, mFormat_, NSString *)
J2OBJC_FIELD_SETTER(ADChronometer, mFormatter_, JavaUtilFormatter *)
J2OBJC_FIELD_SETTER(ADChronometer, mFormatterLocale_, JavaUtilLocale *)
J2OBJC_FIELD_SETTER(ADChronometer, mFormatterArgs_, IOSObjectArray *)
J2OBJC_FIELD_SETTER(ADChronometer, mFormatBuilder_, JavaLangStringBuilder *)
J2OBJC_FIELD_SETTER(ADChronometer, mOnChronometerTickListener_, id<ADChronometer_OnChronometerTickListener>)
J2OBJC_FIELD_SETTER(ADChronometer, mRecycle_, JavaLangStringBuilder *)
J2OBJC_FIELD_SETTER(ADChronometer, mTickRunnable_Chronometer_, id<JavaLangRunnable>)

inline NSString *ADChronometer_get_TAG(void);
static NSString *ADChronometer_TAG = @"Chronometer";
J2OBJC_STATIC_FIELD_OBJ_FINAL(ADChronometer, TAG, NSString *)

inline jint ADChronometer_get_MIN_IN_SEC(void);
#define ADChronometer_MIN_IN_SEC 60
J2OBJC_STATIC_FIELD_CONSTANT(ADChronometer, MIN_IN_SEC, jint)

inline jint ADChronometer_get_HOUR_IN_SEC(void);
#define ADChronometer_HOUR_IN_SEC 3600
J2OBJC_STATIC_FIELD_CONSTANT(ADChronometer, HOUR_IN_SEC, jint)

__attribute__((unused)) static void ADChronometer_init__(ADChronometer *self);

__attribute__((unused)) static void ADChronometer_updateTextWithLong_(ADChronometer *self, jlong now);

__attribute__((unused)) static void ADChronometer_updateRunning(ADChronometer *self);

@interface ADChronometer_OnChronometerTickListener : NSObject

@end

@interface ADChronometer_TickableRunnable : NSObject < JavaLangRunnable > {
 @public
  __unsafe_unretained ADChronometer *this$0_;
}

- (instancetype)initWithADChronometer:(ADChronometer *)outer$;

- (void)run;

@end

J2OBJC_EMPTY_STATIC_INIT(ADChronometer_TickableRunnable)

__attribute__((unused)) static void ADChronometer_TickableRunnable_initWithADChronometer_(ADChronometer_TickableRunnable *self, ADChronometer *outer$);

__attribute__((unused)) static ADChronometer_TickableRunnable *new_ADChronometer_TickableRunnable_initWithADChronometer_(ADChronometer *outer$) NS_RETURNS_RETAINED;

__attribute__((unused)) static ADChronometer_TickableRunnable *create_ADChronometer_TickableRunnable_initWithADChronometer_(ADChronometer *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ADChronometer_TickableRunnable)

@implementation ADChronometer

- (void)init__ {
  ADChronometer_init__(self);
}

- (void)setCountDownWithBoolean:(jboolean)countDown {
  mCountDown_ = countDown;
  ADChronometer_updateTextWithLong_(self, ADSystemClock_elapsedRealtime());
}

- (jboolean)isCountDown {
  return mCountDown_;
}

- (void)setBaseWithLong:(jlong)base {
  mBase_ = base;
  [self dispatchChronometerTick];
  ADChronometer_updateTextWithLong_(self, ADSystemClock_elapsedRealtime());
}

- (jlong)getBase {
  return mBase_;
}

- (void)setFormatWithNSString:(NSString *)format {
  JreStrongAssign(&mFormat_, format);
  if (format != nil && mFormatBuilder_ == nil) {
    JreStrongAssignAndConsume(&mFormatBuilder_, new_JavaLangStringBuilder_initWithInt_([format java_length] * 2));
  }
}

- (NSString *)getFormat {
  return mFormat_;
}

- (void)setOnChronometerTickListenerWithADChronometer_OnChronometerTickListener:(id<ADChronometer_OnChronometerTickListener>)listener {
  JreStrongAssign(&mOnChronometerTickListener_, listener);
}

- (id<ADChronometer_OnChronometerTickListener>)getOnChronometerTickListener {
  return mOnChronometerTickListener_;
}

- (void)start {
  mStarted_ = true;
  ADChronometer_updateRunning(self);
}

- (void)stop {
  mStarted_ = false;
  ADChronometer_updateRunning(self);
}

- (void)setStartedWithBoolean:(jboolean)started {
  mStarted_ = started;
  ADChronometer_updateRunning(self);
}

- (void)updateTextWithLong:(jlong)now {
  ADChronometer_updateTextWithLong_(self, now);
}

- (void)updateRunning {
  ADChronometer_updateRunning(self);
}

- (void)dispatchChronometerTick {
  if (mOnChronometerTickListener_ != nil) {
    [mOnChronometerTickListener_ onChronometerTickWithADChronometer:self];
  }
}

- (void)postInit {
  mVisible_ = true;
  ADChronometer_init__(self);
}

- (instancetype)initWithASIWidget:(id<ASIWidget>)widget {
  ADChronometer_initWithASIWidget_(self, widget);
  return self;
}

- (void)dealloc {
  RELEASE_(mFormat_);
  RELEASE_(mFormatter_);
  RELEASE_(mFormatterLocale_);
  RELEASE_(mFormatterArgs_);
  RELEASE_(mFormatBuilder_);
  RELEASE_(mOnChronometerTickListener_);
  RELEASE_(mRecycle_);
  RELEASE_(mTickRunnable_Chronometer_);
  [super dealloc];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "V", 0x2, 0, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 1, 2, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 3, 4, -1, -1, -1, -1 },
    { NULL, "J", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 5, 6, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 7, 8, -1, -1, -1, -1 },
    { NULL, "LADChronometer_OnChronometerTickListener;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 9, 2, -1, -1, -1, -1 },
    { NULL, "V", 0x22, 10, 4, -1, -1, -1, -1 },
    { NULL, "V", 0x2, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, NULL, 0x1, -1, 11, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init__);
  methods[1].selector = @selector(setCountDownWithBoolean:);
  methods[2].selector = @selector(isCountDown);
  methods[3].selector = @selector(setBaseWithLong:);
  methods[4].selector = @selector(getBase);
  methods[5].selector = @selector(setFormatWithNSString:);
  methods[6].selector = @selector(getFormat);
  methods[7].selector = @selector(setOnChronometerTickListenerWithADChronometer_OnChronometerTickListener:);
  methods[8].selector = @selector(getOnChronometerTickListener);
  methods[9].selector = @selector(start);
  methods[10].selector = @selector(stop);
  methods[11].selector = @selector(setStartedWithBoolean:);
  methods[12].selector = @selector(updateTextWithLong:);
  methods[13].selector = @selector(updateRunning);
  methods[14].selector = @selector(dispatchChronometerTick);
  methods[15].selector = @selector(postInit);
  methods[16].selector = @selector(initWithASIWidget:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "TAG", "LNSString;", .constantValue.asLong = 0, 0x1a, -1, 12, -1, -1 },
    { "mBase_", "J", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mNow_", "J", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mVisible_", "Z", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mStarted_", "Z", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mRunning_", "Z", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mLogged_", "Z", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mFormat_", "LNSString;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mFormatter_", "LJavaUtilFormatter;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mFormatterLocale_", "LJavaUtilLocale;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mFormatterArgs_", "[LNSObject;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mFormatBuilder_", "LJavaLangStringBuilder;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mOnChronometerTickListener_", "LADChronometer_OnChronometerTickListener;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mRecycle_", "LJavaLangStringBuilder;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mCountDown_", "Z", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "MIN_IN_SEC", "I", .constantValue.asInt = ADChronometer_MIN_IN_SEC, 0x1a, -1, -1, -1, -1 },
    { "HOUR_IN_SEC", "I", .constantValue.asInt = ADChronometer_HOUR_IN_SEC, 0x1a, -1, -1, -1, -1 },
    { "mTickRunnable_Chronometer_", "LJavaLangRunnable;", .constantValue.asLong = 0, 0x12, 13, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "init", "setCountDown", "Z", "setBase", "J", "setFormat", "LNSString;", "setOnChronometerTickListener", "LADChronometer_OnChronometerTickListener;", "setStarted", "updateText", "LASIWidget;", &ADChronometer_TAG, "mTickRunnable", "LADChronometer_OnChronometerTickListener;LADChronometer_TickableRunnable;" };
  static const J2ObjcClassInfo _ADChronometer = { "Chronometer", "r.android.widget", ptrTable, methods, fields, 7, 0x401, 17, 18, -1, 14, -1, -1, -1 };
  return &_ADChronometer;
}

@end

void ADChronometer_init__(ADChronometer *self) {
  self->mBase_ = ADSystemClock_elapsedRealtime();
  ADChronometer_updateTextWithLong_(self, self->mBase_);
}

void ADChronometer_updateTextWithLong_(ADChronometer *self, jlong now) {
  @synchronized(self) {
    self->mNow_ = now;
    jlong seconds = self->mCountDown_ ? self->mBase_ - now : now - self->mBase_;
    seconds /= 1000;
    jboolean negative = false;
    if (seconds < 0) {
      seconds = -seconds;
      negative = true;
    }
    NSString *text = ADDateUtils_formatElapsedTimeWithJavaLangStringBuilder_withLong_(self->mRecycle_, seconds);
    if (negative) {
      text = [((ADResources *) nil_chk([self getResources])) getStringWithInt:JreLoadStatic(ADR_string, negative_duration) withNSString:text];
    }
    if (self->mFormat_ != nil) {
      JavaUtilLocale *loc = JavaUtilLocale_getDefault();
      if (self->mFormatter_ == nil || ![((JavaUtilLocale *) nil_chk(loc)) isEqual:self->mFormatterLocale_]) {
        JreStrongAssign(&self->mFormatterLocale_, loc);
        JreStrongAssignAndConsume(&self->mFormatter_, new_JavaUtilFormatter_initWithJavaLangAppendable_withJavaUtilLocale_(self->mFormatBuilder_, loc));
      }
      [((JavaLangStringBuilder *) nil_chk(self->mFormatBuilder_)) setLengthWithInt:0];
      IOSObjectArray_Set(nil_chk(self->mFormatterArgs_), 0, text);
      @try {
        [((JavaUtilFormatter *) nil_chk(self->mFormatter_)) formatWithNSString:self->mFormat_ withNSObjectArray:self->mFormatterArgs_];
        text = [((JavaLangStringBuilder *) nil_chk(self->mFormatBuilder_)) description];
      }
      @catch (JavaUtilIllegalFormatException *ex) {
        if (!self->mLogged_) {
          ADLog_wWithNSString_withNSString_(ADChronometer_TAG, JreStrcat("$$", @"Illegal format string: ", self->mFormat_));
          self->mLogged_ = true;
        }
      }
    }
    [self setTextWithNSString:text];
  }
}

void ADChronometer_updateRunning(ADChronometer *self) {
  jboolean running = self->mVisible_ && self->mStarted_ && [self isShown];
  if (running != self->mRunning_) {
    if (running) {
      ADChronometer_updateTextWithLong_(self, ADSystemClock_elapsedRealtime());
      [self dispatchChronometerTick];
      [self postDelayedWithJavaLangRunnable:self->mTickRunnable_Chronometer_ withInt:1000];
    }
    else {
      [self removeCallbacksWithJavaLangRunnable:self->mTickRunnable_Chronometer_];
    }
    self->mRunning_ = running;
  }
}

void ADChronometer_initWithASIWidget_(ADChronometer *self, id<ASIWidget> widget) {
  ADTextView_initWithASIWidget_(self, widget);
  JreStrongAssignAndConsume(&self->mFormatterArgs_, [IOSObjectArray newArrayWithLength:1 type:NSObject_class_()]);
  JreStrongAssignAndConsume(&self->mRecycle_, new_JavaLangStringBuilder_initWithInt_(8));
  JreStrongAssignAndConsume(&self->mTickRunnable_Chronometer_, new_ADChronometer_TickableRunnable_initWithADChronometer_(self));
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADChronometer)

@implementation ADChronometer_OnChronometerTickListener

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "V", 0x401, 0, 1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(onChronometerTickWithADChronometer:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "onChronometerTick", "LADChronometer;" };
  static const J2ObjcClassInfo _ADChronometer_OnChronometerTickListener = { "OnChronometerTickListener", "r.android.widget", ptrTable, methods, NULL, 7, 0x609, 1, 0, 1, -1, -1, -1, -1 };
  return &_ADChronometer_OnChronometerTickListener;
}

@end

J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ADChronometer_OnChronometerTickListener)

@implementation ADChronometer_TickableRunnable

- (instancetype)initWithADChronometer:(ADChronometer *)outer$ {
  ADChronometer_TickableRunnable_initWithADChronometer_(self, outer$);
  return self;
}

- (void)run {
  if (this$0_->mRunning_) {
    ADChronometer_updateTextWithLong_(this$0_, ADSystemClock_elapsedRealtime());
    [this$0_ dispatchChronometerTick];
    [this$0_ postDelayedWithJavaLangRunnable:this$0_->mTickRunnable_Chronometer_ withInt:1000];
  }
}

- (void)__javaClone:(ADChronometer_TickableRunnable *)original {
  [super __javaClone:original];
  [this$0_ release];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x2, -1, 0, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(initWithADChronometer:);
  methods[1].selector = @selector(run);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "this$0_", "LADChronometer;", .constantValue.asLong = 0, 0x1012, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "LADChronometer;" };
  static const J2ObjcClassInfo _ADChronometer_TickableRunnable = { "TickableRunnable", "r.android.widget", ptrTable, methods, fields, 7, 0x12, 2, 1, 0, -1, -1, -1, -1 };
  return &_ADChronometer_TickableRunnable;
}

@end

void ADChronometer_TickableRunnable_initWithADChronometer_(ADChronometer_TickableRunnable *self, ADChronometer *outer$) {
  self->this$0_ = outer$;
  NSObject_init(self);
}

ADChronometer_TickableRunnable *new_ADChronometer_TickableRunnable_initWithADChronometer_(ADChronometer *outer$) {
  J2OBJC_NEW_IMPL(ADChronometer_TickableRunnable, initWithADChronometer_, outer$)
}

ADChronometer_TickableRunnable *create_ADChronometer_TickableRunnable_initWithADChronometer_(ADChronometer *outer$) {
  J2OBJC_CREATE_IMPL(ADChronometer_TickableRunnable, initWithADChronometer_, outer$)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADChronometer_TickableRunnable)
