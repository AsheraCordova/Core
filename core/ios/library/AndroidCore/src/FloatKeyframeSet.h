//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\animation\FloatKeyframeSet.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_FloatKeyframeSet")
#ifdef RESTRICT_FloatKeyframeSet
#define INCLUDE_ALL_FloatKeyframeSet 0
#else
#define INCLUDE_ALL_FloatKeyframeSet 1
#endif
#undef RESTRICT_FloatKeyframeSet

#if !defined (ADFloatKeyframeSet_) && (INCLUDE_ALL_FloatKeyframeSet || defined(INCLUDE_ADFloatKeyframeSet))
#define ADFloatKeyframeSet_

#define RESTRICT_KeyframeSet 1
#define INCLUDE_ADKeyframeSet 1
#include "KeyframeSet.h"

#define RESTRICT_Keyframes 1
#define INCLUDE_ADKeyframes_FloatKeyframes 1
#include "Keyframes.h"

@class IOSClass;
@class IOSObjectArray;

/*!
 @brief This class holds a collection of FloatKeyframe objects and is called by ValueAnimator to calculate
  values between those keyframes for a given animation.The class internal to the animation
  package because it is an implementation detail of how Keyframes are stored and used.
 <p>This type-specific subclass of KeyframeSet, along with the other type-specific subclass for
  int, exists to speed up the getValue() method when there is no custom
  TypeEvaluator set for the animation, so that values can be calculated without autoboxing to the
  Object equivalents of these primitive types.</p>
 */
@interface ADFloatKeyframeSet : ADKeyframeSet < ADKeyframes_FloatKeyframes >

#pragma mark Public

- (instancetype)initPackagePrivateWithADKeyframe_FloatKeyframeArray:(IOSObjectArray *)keyframes;

- (ADFloatKeyframeSet *)java_clone;

- (jfloat)getFloatValueWithFloat:(jfloat)fraction;

- (IOSClass *)getType;

- (id)getValueWithFloat:(jfloat)fraction;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithADKeyframeArray:(IOSObjectArray *)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADFloatKeyframeSet)

FOUNDATION_EXPORT void ADFloatKeyframeSet_initPackagePrivateWithADKeyframe_FloatKeyframeArray_(ADFloatKeyframeSet *self, IOSObjectArray *keyframes);

FOUNDATION_EXPORT ADFloatKeyframeSet *new_ADFloatKeyframeSet_initPackagePrivateWithADKeyframe_FloatKeyframeArray_(IOSObjectArray *keyframes) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADFloatKeyframeSet *create_ADFloatKeyframeSet_initPackagePrivateWithADKeyframe_FloatKeyframeArray_(IOSObjectArray *keyframes);

J2OBJC_TYPE_LITERAL_HEADER(ADFloatKeyframeSet)

@compatibility_alias RAndroidAnimationFloatKeyframeSet ADFloatKeyframeSet;

#endif

#pragma pop_macro("INCLUDE_ALL_FloatKeyframeSet")