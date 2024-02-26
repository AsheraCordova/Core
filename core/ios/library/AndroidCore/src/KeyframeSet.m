//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\animation\KeyframeSet.java
//

#include "FloatKeyframeSet.h"
#include "IOSClass.h"
#include "IOSObjectArray.h"
#include "IOSPrimitiveArray.h"
#include "IntKeyframeSet.h"
#include "J2ObjC_source.h"
#include "Keyframe.h"
#include "KeyframeSet.h"
#include "Keyframes.h"
#include "Log.h"
#include "Path.h"
#include "PathKeyframes.h"
#include "TimeInterpolator.h"
#include "TypeEvaluator.h"
#include "java/lang/Float.h"
#include "java/lang/Math.h"
#include "java/util/Arrays.h"
#include "java/util/List.h"


@implementation ADKeyframeSet

- (instancetype)initWithADKeyframeArray:(IOSObjectArray *)keyframes {
  ADKeyframeSet_initWithADKeyframeArray_(self, keyframes);
  return self;
}

- (id<JavaUtilList>)getKeyframes {
  return mKeyframes_;
}

+ (ADKeyframeSet *)ofIntWithIntArray:(IOSIntArray *)values {
  return ADKeyframeSet_ofIntWithIntArray_(values);
}

+ (ADKeyframeSet *)ofFloatWithFloatArray:(IOSFloatArray *)values {
  return ADKeyframeSet_ofFloatWithFloatArray_(values);
}

+ (ADKeyframeSet *)ofKeyframeWithADKeyframeArray:(IOSObjectArray *)keyframes {
  return ADKeyframeSet_ofKeyframeWithADKeyframeArray_(keyframes);
}

+ (ADKeyframeSet *)ofObjectWithNSObjectArray:(IOSObjectArray *)values {
  return ADKeyframeSet_ofObjectWithNSObjectArray_(values);
}

+ (ADPathKeyframes *)ofPathWithADPath:(ADPath *)path {
  return ADKeyframeSet_ofPathWithADPath_(path);
}

+ (ADPathKeyframes *)ofPathWithADPath:(ADPath *)path
                            withFloat:(jfloat)error {
  return ADKeyframeSet_ofPathWithADPath_withFloat_(path, error);
}

- (void)setEvaluatorWithADTypeEvaluator:(id<ADTypeEvaluator>)evaluator {
  JreStrongAssign(&mEvaluator_, evaluator);
}

- (IOSClass *)getType {
  return [((ADKeyframe *) nil_chk(mFirstKeyframe_)) getType];
}

- (ADKeyframeSet *)java_clone {
  id<JavaUtilList> keyframes = JreRetainedLocalValue(mKeyframes_);
  jint numKeyframes = [((id<JavaUtilList>) nil_chk(mKeyframes_)) size];
  IOSObjectArray *newKeyframes = [IOSObjectArray arrayWithLength:numKeyframes type:ADKeyframe_class_()];
  for (jint i = 0; i < numKeyframes; ++i) {
    IOSObjectArray_Set(newKeyframes, i, [((ADKeyframe *) nil_chk([((id<JavaUtilList>) nil_chk(keyframes)) getWithInt:i])) java_clone]);
  }
  ADKeyframeSet *newSet = create_ADKeyframeSet_initWithADKeyframeArray_(newKeyframes);
  return newSet;
}

- (id)getValueWithFloat:(jfloat)fraction {
  if (mNumKeyframes_ == 2) {
    if (mInterpolator_ != nil) {
      fraction = [mInterpolator_ getInterpolationWithFloat:fraction];
    }
    return [((id<ADTypeEvaluator>) nil_chk(mEvaluator_)) evaluateWithFloat:fraction withId:[((ADKeyframe *) nil_chk(mFirstKeyframe_)) getValue] withId:[((ADKeyframe *) nil_chk(mLastKeyframe_)) getValue]];
  }
  if (fraction <= 0.0f) {
    ADKeyframe *nextKeyframe = [((id<JavaUtilList>) nil_chk(mKeyframes_)) getWithInt:1];
    id<ADTimeInterpolator> interpolator = [((ADKeyframe *) nil_chk(nextKeyframe)) getInterpolator];
    if (interpolator != nil) {
      fraction = [interpolator getInterpolationWithFloat:fraction];
    }
    jfloat prevFraction = [((ADKeyframe *) nil_chk(mFirstKeyframe_)) getFraction];
    jfloat intervalFraction = (fraction - prevFraction) / ([nextKeyframe getFraction] - prevFraction);
    return [((id<ADTypeEvaluator>) nil_chk(mEvaluator_)) evaluateWithFloat:intervalFraction withId:[((ADKeyframe *) nil_chk(mFirstKeyframe_)) getValue] withId:[nextKeyframe getValue]];
  }
  else if (fraction >= 1.0f) {
    ADKeyframe *prevKeyframe = [((id<JavaUtilList>) nil_chk(mKeyframes_)) getWithInt:mNumKeyframes_ - 2];
    id<ADTimeInterpolator> interpolator = [((ADKeyframe *) nil_chk(mLastKeyframe_)) getInterpolator];
    if (interpolator != nil) {
      fraction = [interpolator getInterpolationWithFloat:fraction];
    }
    jfloat prevFraction = [((ADKeyframe *) nil_chk(prevKeyframe)) getFraction];
    jfloat intervalFraction = (fraction - prevFraction) / ([((ADKeyframe *) nil_chk(mLastKeyframe_)) getFraction] - prevFraction);
    return [((id<ADTypeEvaluator>) nil_chk(mEvaluator_)) evaluateWithFloat:intervalFraction withId:[prevKeyframe getValue] withId:[((ADKeyframe *) nil_chk(mLastKeyframe_)) getValue]];
  }
  ADKeyframe *prevKeyframe = JreRetainedLocalValue(mFirstKeyframe_);
  for (jint i = 1; i < mNumKeyframes_; ++i) {
    ADKeyframe *nextKeyframe = JreRetainedLocalValue([((id<JavaUtilList>) nil_chk(mKeyframes_)) getWithInt:i]);
    if (fraction < [((ADKeyframe *) nil_chk(nextKeyframe)) getFraction]) {
      id<ADTimeInterpolator> interpolator = [nextKeyframe getInterpolator];
      jfloat prevFraction = [((ADKeyframe *) nil_chk(prevKeyframe)) getFraction];
      jfloat intervalFraction = (fraction - prevFraction) / ([nextKeyframe getFraction] - prevFraction);
      if (interpolator != nil) {
        intervalFraction = [interpolator getInterpolationWithFloat:intervalFraction];
      }
      return [((id<ADTypeEvaluator>) nil_chk(mEvaluator_)) evaluateWithFloat:intervalFraction withId:[prevKeyframe getValue] withId:[nextKeyframe getValue]];
    }
    prevKeyframe = nextKeyframe;
  }
  return [((ADKeyframe *) nil_chk(mLastKeyframe_)) getValue];
}

- (NSString *)description {
  NSString *returnVal = @" ";
  for (jint i = 0; i < mNumKeyframes_; ++i) {
    JreStrAppend(&returnVal, "@$", [((ADKeyframe *) nil_chk([((id<JavaUtilList>) nil_chk(mKeyframes_)) getWithInt:i])) getValue], @"  ");
  }
  return returnVal;
}

- (id<ADKeyframes>)clone {
  return [self java_clone];
}

- (void)dealloc {
  RELEASE_(mFirstKeyframe_);
  RELEASE_(mLastKeyframe_);
  RELEASE_(mInterpolator_);
  RELEASE_(mKeyframes_);
  RELEASE_(mEvaluator_);
  [super dealloc];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x81, -1, 0, -1, -1, -1, -1 },
    { NULL, "LJavaUtilList;", 0x1, -1, -1, -1, 1, -1, -1 },
    { NULL, "LADKeyframeSet;", 0x89, 2, 3, -1, -1, -1, -1 },
    { NULL, "LADKeyframeSet;", 0x89, 4, 5, -1, -1, -1, -1 },
    { NULL, "LADKeyframeSet;", 0x89, 6, 0, -1, -1, -1, -1 },
    { NULL, "LADKeyframeSet;", 0x89, 7, 8, -1, -1, -1, -1 },
    { NULL, "LADPathKeyframes;", 0x9, 9, 10, -1, -1, -1, -1 },
    { NULL, "LADPathKeyframes;", 0x9, 9, 11, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 12, 13, -1, -1, -1, -1 },
    { NULL, "LIOSClass;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LADKeyframeSet;", 0x1, 14, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, 15, 16, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, 17, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(initWithADKeyframeArray:);
  methods[1].selector = @selector(getKeyframes);
  methods[2].selector = @selector(ofIntWithIntArray:);
  methods[3].selector = @selector(ofFloatWithFloatArray:);
  methods[4].selector = @selector(ofKeyframeWithADKeyframeArray:);
  methods[5].selector = @selector(ofObjectWithNSObjectArray:);
  methods[6].selector = @selector(ofPathWithADPath:);
  methods[7].selector = @selector(ofPathWithADPath:withFloat:);
  methods[8].selector = @selector(setEvaluatorWithADTypeEvaluator:);
  methods[9].selector = @selector(getType);
  methods[10].selector = @selector(java_clone);
  methods[11].selector = @selector(getValueWithFloat:);
  methods[12].selector = @selector(description);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "mNumKeyframes_", "I", .constantValue.asLong = 0, 0x0, -1, -1, -1, -1 },
    { "mFirstKeyframe_", "LADKeyframe;", .constantValue.asLong = 0, 0x0, -1, -1, -1, -1 },
    { "mLastKeyframe_", "LADKeyframe;", .constantValue.asLong = 0, 0x0, -1, -1, -1, -1 },
    { "mInterpolator_", "LADTimeInterpolator;", .constantValue.asLong = 0, 0x0, -1, -1, -1, -1 },
    { "mKeyframes_", "LJavaUtilList;", .constantValue.asLong = 0, 0x0, -1, -1, 18, -1 },
    { "mEvaluator_", "LADTypeEvaluator;", .constantValue.asLong = 0, 0x0, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "[LADKeyframe;", "()Ljava/util/List<Lr/android/animation/Keyframe;>;", "ofInt", "[I", "ofFloat", "[F", "ofKeyframe", "ofObject", "[LNSObject;", "ofPath", "LADPath;", "LADPath;F", "setEvaluator", "LADTypeEvaluator;", "clone", "getValue", "F", "toString", "Ljava/util/List<Lr/android/animation/Keyframe;>;" };
  static const J2ObjcClassInfo _ADKeyframeSet = { "KeyframeSet", "r.android.animation", ptrTable, methods, fields, 7, 0x1, 13, 6, -1, -1, -1, -1, -1 };
  return &_ADKeyframeSet;
}

- (id)copyWithZone:(NSZone *)zone {
  return [[self java_clone] retain];
}

@end

void ADKeyframeSet_initWithADKeyframeArray_(ADKeyframeSet *self, IOSObjectArray *keyframes) {
  NSObject_init(self);
  self->mNumKeyframes_ = ((IOSObjectArray *) nil_chk(keyframes))->size_;
  JreStrongAssign(&self->mKeyframes_, JavaUtilArrays_asListWithNSObjectArray_(keyframes));
  JreStrongAssign(&self->mFirstKeyframe_, IOSObjectArray_Get(keyframes, 0));
  JreStrongAssign(&self->mLastKeyframe_, IOSObjectArray_Get(keyframes, self->mNumKeyframes_ - 1));
  JreStrongAssign(&self->mInterpolator_, [((ADKeyframe *) nil_chk(self->mLastKeyframe_)) getInterpolator]);
}

ADKeyframeSet *new_ADKeyframeSet_initWithADKeyframeArray_(IOSObjectArray *keyframes) {
  J2OBJC_NEW_IMPL(ADKeyframeSet, initWithADKeyframeArray_, keyframes)
}

ADKeyframeSet *create_ADKeyframeSet_initWithADKeyframeArray_(IOSObjectArray *keyframes) {
  J2OBJC_CREATE_IMPL(ADKeyframeSet, initWithADKeyframeArray_, keyframes)
}

ADKeyframeSet *ADKeyframeSet_ofIntWithIntArray_(IOSIntArray *values) {
  ADKeyframeSet_initialize();
  jint numKeyframes = ((IOSIntArray *) nil_chk(values))->size_;
  IOSObjectArray *keyframes = [IOSObjectArray arrayWithLength:JavaLangMath_maxWithInt_withInt_(numKeyframes, 2) type:ADKeyframe_IntKeyframe_class_()];
  if (numKeyframes == 1) {
    IOSObjectArray_Set(keyframes, 0, (ADKeyframe_IntKeyframe *) cast_chk(ADKeyframe_ofIntWithFloat_(0.0f), [ADKeyframe_IntKeyframe class]));
    IOSObjectArray_Set(keyframes, 1, (ADKeyframe_IntKeyframe *) cast_chk(ADKeyframe_ofIntWithFloat_withInt_(1.0f, IOSIntArray_Get(values, 0)), [ADKeyframe_IntKeyframe class]));
  }
  else {
    IOSObjectArray_Set(keyframes, 0, (ADKeyframe_IntKeyframe *) cast_chk(ADKeyframe_ofIntWithFloat_withInt_(0.0f, IOSIntArray_Get(values, 0)), [ADKeyframe_IntKeyframe class]));
    for (jint i = 1; i < numKeyframes; ++i) {
      IOSObjectArray_Set(keyframes, i, (ADKeyframe_IntKeyframe *) cast_chk(ADKeyframe_ofIntWithFloat_withInt_((jfloat) i / (numKeyframes - 1), IOSIntArray_Get(values, i)), [ADKeyframe_IntKeyframe class]));
    }
  }
  return create_ADIntKeyframeSet_initPackagePrivateWithADKeyframe_IntKeyframeArray_(keyframes);
}

ADKeyframeSet *ADKeyframeSet_ofFloatWithFloatArray_(IOSFloatArray *values) {
  ADKeyframeSet_initialize();
  jboolean badValue = false;
  jint numKeyframes = ((IOSFloatArray *) nil_chk(values))->size_;
  IOSObjectArray *keyframes = [IOSObjectArray arrayWithLength:JavaLangMath_maxWithInt_withInt_(numKeyframes, 2) type:ADKeyframe_FloatKeyframe_class_()];
  if (numKeyframes == 1) {
    IOSObjectArray_Set(keyframes, 0, (ADKeyframe_FloatKeyframe *) cast_chk(ADKeyframe_ofFloatWithFloat_(0.0f), [ADKeyframe_FloatKeyframe class]));
    IOSObjectArray_Set(keyframes, 1, (ADKeyframe_FloatKeyframe *) cast_chk(ADKeyframe_ofFloatWithFloat_withFloat_(1.0f, IOSFloatArray_Get(values, 0)), [ADKeyframe_FloatKeyframe class]));
    if (JavaLangFloat_isNaNWithFloat_(IOSFloatArray_Get(values, 0))) {
      badValue = true;
    }
  }
  else {
    IOSObjectArray_Set(keyframes, 0, (ADKeyframe_FloatKeyframe *) cast_chk(ADKeyframe_ofFloatWithFloat_withFloat_(0.0f, IOSFloatArray_Get(values, 0)), [ADKeyframe_FloatKeyframe class]));
    for (jint i = 1; i < numKeyframes; ++i) {
      IOSObjectArray_Set(keyframes, i, (ADKeyframe_FloatKeyframe *) cast_chk(ADKeyframe_ofFloatWithFloat_withFloat_((jfloat) i / (numKeyframes - 1), IOSFloatArray_Get(values, i)), [ADKeyframe_FloatKeyframe class]));
      if (JavaLangFloat_isNaNWithFloat_(IOSFloatArray_Get(values, i))) {
        badValue = true;
      }
    }
  }
  if (badValue) {
    ADLog_wWithNSString_withNSString_(@"Animator", @"Bad value (NaN) in float animator");
  }
  return create_ADFloatKeyframeSet_initPackagePrivateWithADKeyframe_FloatKeyframeArray_(keyframes);
}

ADKeyframeSet *ADKeyframeSet_ofKeyframeWithADKeyframeArray_(IOSObjectArray *keyframes) {
  ADKeyframeSet_initialize();
  jint numKeyframes = ((IOSObjectArray *) nil_chk(keyframes))->size_;
  jboolean hasFloat = false;
  jboolean hasInt = false;
  jboolean hasOther = false;
  for (jint i = 0; i < numKeyframes; ++i) {
    if ([IOSObjectArray_Get(keyframes, i) isKindOfClass:[ADKeyframe_FloatKeyframe class]]) {
      hasFloat = true;
    }
    else if ([IOSObjectArray_Get(keyframes, i) isKindOfClass:[ADKeyframe_IntKeyframe class]]) {
      hasInt = true;
    }
    else {
      hasOther = true;
    }
  }
  if (hasFloat && !hasInt && !hasOther) {
    IOSObjectArray *floatKeyframes = [IOSObjectArray arrayWithLength:numKeyframes type:ADKeyframe_FloatKeyframe_class_()];
    for (jint i = 0; i < numKeyframes; ++i) {
      IOSObjectArray_Set(floatKeyframes, i, (ADKeyframe_FloatKeyframe *) cast_chk(IOSObjectArray_Get(keyframes, i), [ADKeyframe_FloatKeyframe class]));
    }
    return create_ADFloatKeyframeSet_initPackagePrivateWithADKeyframe_FloatKeyframeArray_(floatKeyframes);
  }
  else if (hasInt && !hasFloat && !hasOther) {
    IOSObjectArray *intKeyframes = [IOSObjectArray arrayWithLength:numKeyframes type:ADKeyframe_IntKeyframe_class_()];
    for (jint i = 0; i < numKeyframes; ++i) {
      IOSObjectArray_Set(intKeyframes, i, (ADKeyframe_IntKeyframe *) cast_chk(IOSObjectArray_Get(keyframes, i), [ADKeyframe_IntKeyframe class]));
    }
    return create_ADIntKeyframeSet_initPackagePrivateWithADKeyframe_IntKeyframeArray_(intKeyframes);
  }
  else {
    return create_ADKeyframeSet_initWithADKeyframeArray_(keyframes);
  }
}

ADKeyframeSet *ADKeyframeSet_ofObjectWithNSObjectArray_(IOSObjectArray *values) {
  ADKeyframeSet_initialize();
  jint numKeyframes = ((IOSObjectArray *) nil_chk(values))->size_;
  IOSObjectArray *keyframes = [IOSObjectArray arrayWithLength:JavaLangMath_maxWithInt_withInt_(numKeyframes, 2) type:ADKeyframe_ObjectKeyframe_class_()];
  if (numKeyframes == 1) {
    IOSObjectArray_Set(keyframes, 0, (ADKeyframe_ObjectKeyframe *) cast_chk(ADKeyframe_ofObjectWithFloat_(0.0f), [ADKeyframe_ObjectKeyframe class]));
    IOSObjectArray_Set(keyframes, 1, (ADKeyframe_ObjectKeyframe *) cast_chk(ADKeyframe_ofObjectWithFloat_withId_(1.0f, IOSObjectArray_Get(values, 0)), [ADKeyframe_ObjectKeyframe class]));
  }
  else {
    IOSObjectArray_Set(keyframes, 0, (ADKeyframe_ObjectKeyframe *) cast_chk(ADKeyframe_ofObjectWithFloat_withId_(0.0f, IOSObjectArray_Get(values, 0)), [ADKeyframe_ObjectKeyframe class]));
    for (jint i = 1; i < numKeyframes; ++i) {
      IOSObjectArray_Set(keyframes, i, (ADKeyframe_ObjectKeyframe *) cast_chk(ADKeyframe_ofObjectWithFloat_withId_((jfloat) i / (numKeyframes - 1), IOSObjectArray_Get(values, i)), [ADKeyframe_ObjectKeyframe class]));
    }
  }
  return create_ADKeyframeSet_initWithADKeyframeArray_(keyframes);
}

ADPathKeyframes *ADKeyframeSet_ofPathWithADPath_(ADPath *path) {
  ADKeyframeSet_initialize();
  return create_ADPathKeyframes_initWithADPath_(path);
}

ADPathKeyframes *ADKeyframeSet_ofPathWithADPath_withFloat_(ADPath *path, jfloat error) {
  ADKeyframeSet_initialize();
  return create_ADPathKeyframes_initWithADPath_withFloat_(path, error);
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADKeyframeSet)