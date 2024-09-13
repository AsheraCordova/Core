//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\animation\KeyframeSet.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_KeyframeSet")
#ifdef RESTRICT_KeyframeSet
#define INCLUDE_ALL_KeyframeSet 0
#else
#define INCLUDE_ALL_KeyframeSet 1
#endif
#undef RESTRICT_KeyframeSet

#if !defined (ADKeyframeSet_) && (INCLUDE_ALL_KeyframeSet || defined(INCLUDE_ADKeyframeSet))
#define ADKeyframeSet_

#define RESTRICT_IKeyframes 1
#define INCLUDE_ADIKeyframes 1
#include "IKeyframes.h"

@class ADKeyframe;
@class ADPath;
@class ADPathKeyframes;
@class IOSClass;
@class IOSFloatArray;
@class IOSIntArray;
@class IOSObjectArray;
@protocol ADTimeInterpolator;
@protocol ADTypeEvaluator;
@protocol JavaUtilList;

/*!
 @brief This class holds a collection of Keyframe objects and is called by ValueAnimator to calculate
  values between those keyframes for a given animation.The class internal to the animation
  package because it is an implementation detail of how IKeyframes are stored and used.
 */
@interface ADKeyframeSet : NSObject < ADIKeyframes > {
 @public
  jint mNumKeyframes_;
  ADKeyframe *mFirstKeyframe_;
  ADKeyframe *mLastKeyframe_;
  id<ADTimeInterpolator> mInterpolator_;
  id<JavaUtilList> mKeyframes_;
  id<ADTypeEvaluator> mEvaluator_;
}

#pragma mark Public

- (instancetype)initWithADKeyframeArray:(IOSObjectArray *)keyframes;

- (ADKeyframeSet *)java_clone;

- (id<JavaUtilList>)getIKeyframes;

- (IOSClass *)getType;

/*!
 @brief Gets the animated value, given the elapsed fraction of the animation (interpolated by the
  animation's interpolator) and the evaluator used to calculate in-between values.This
  function maps the input fraction to the appropriate keyframe interval and a fraction
  between them and returns the interpolated value.
 Note that the input fraction may fall
  outside the [0-1] bounds, if the animation's interpolator made that happen (e.g., a
  spring interpolation that might send the fraction past 1.0). We handle this situation by
  just using the two keyframes at the appropriate end when the value is outside those bounds.
 @param fraction The elapsed fraction of the animation
 @return The animated value.
 */
- (id)getValueWithFloat:(jfloat)fraction;

+ (ADKeyframeSet *)ofFloatWithFloatArray:(IOSFloatArray *)values;

+ (ADKeyframeSet *)ofIntWithIntArray:(IOSIntArray *)values;

+ (ADKeyframeSet *)ofKeyframeWithADKeyframeArray:(IOSObjectArray *)keyframes;

+ (ADKeyframeSet *)ofObjectWithNSObjectArray:(IOSObjectArray *)values;

+ (ADPathKeyframes *)ofPathWithADPath:(ADPath *)path;

+ (ADPathKeyframes *)ofPathWithADPath:(ADPath *)path
                            withFloat:(jfloat)error;

/*!
 @brief Sets the TypeEvaluator to be used when calculating animated values.This object
  is required only for KeyframeSets that are not either IntKeyframeSet or FloatKeyframeSet,
  both of which assume their own evaluator to speed up calculations with those primitive
  types.
 @param evaluator The TypeEvaluator to be used to calculate animated values.
 */
- (void)setEvaluatorWithADTypeEvaluator:(id<ADTypeEvaluator>)evaluator;

- (NSString *)description;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADKeyframeSet)

J2OBJC_FIELD_SETTER(ADKeyframeSet, mFirstKeyframe_, ADKeyframe *)
J2OBJC_FIELD_SETTER(ADKeyframeSet, mLastKeyframe_, ADKeyframe *)
J2OBJC_FIELD_SETTER(ADKeyframeSet, mInterpolator_, id<ADTimeInterpolator>)
J2OBJC_FIELD_SETTER(ADKeyframeSet, mKeyframes_, id<JavaUtilList>)
J2OBJC_FIELD_SETTER(ADKeyframeSet, mEvaluator_, id<ADTypeEvaluator>)

FOUNDATION_EXPORT void ADKeyframeSet_initWithADKeyframeArray_(ADKeyframeSet *self, IOSObjectArray *keyframes);

FOUNDATION_EXPORT ADKeyframeSet *new_ADKeyframeSet_initWithADKeyframeArray_(IOSObjectArray *keyframes) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADKeyframeSet *create_ADKeyframeSet_initWithADKeyframeArray_(IOSObjectArray *keyframes);

FOUNDATION_EXPORT ADKeyframeSet *ADKeyframeSet_ofIntWithIntArray_(IOSIntArray *values);

FOUNDATION_EXPORT ADKeyframeSet *ADKeyframeSet_ofFloatWithFloatArray_(IOSFloatArray *values);

FOUNDATION_EXPORT ADKeyframeSet *ADKeyframeSet_ofKeyframeWithADKeyframeArray_(IOSObjectArray *keyframes);

FOUNDATION_EXPORT ADKeyframeSet *ADKeyframeSet_ofObjectWithNSObjectArray_(IOSObjectArray *values);

FOUNDATION_EXPORT ADPathKeyframes *ADKeyframeSet_ofPathWithADPath_(ADPath *path);

FOUNDATION_EXPORT ADPathKeyframes *ADKeyframeSet_ofPathWithADPath_withFloat_(ADPath *path, jfloat error);

J2OBJC_TYPE_LITERAL_HEADER(ADKeyframeSet)

@compatibility_alias RAndroidAnimationKeyframeSet ADKeyframeSet;

#endif

#pragma pop_macro("INCLUDE_ALL_KeyframeSet")
