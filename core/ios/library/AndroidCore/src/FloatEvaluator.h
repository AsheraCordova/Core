//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\animation\FloatEvaluator.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_FloatEvaluator")
#ifdef RESTRICT_FloatEvaluator
#define INCLUDE_ALL_FloatEvaluator 0
#else
#define INCLUDE_ALL_FloatEvaluator 1
#endif
#undef RESTRICT_FloatEvaluator

#if !defined (ADFloatEvaluator_) && (INCLUDE_ALL_FloatEvaluator || defined(INCLUDE_ADFloatEvaluator))
#define ADFloatEvaluator_

#define RESTRICT_TypeEvaluator 1
#define INCLUDE_ADTypeEvaluator 1
#include "TypeEvaluator.h"

@class JavaLangFloat;

/*!
 @brief This evaluator can be used to perform type interpolation between <code>float</code> values.
 */
@interface ADFloatEvaluator : NSObject < ADTypeEvaluator >

#pragma mark Public

- (instancetype)init;

/*!
 @brief This function returns the result of linearly interpolating the start and end values, with 
 <code>fraction</code> representing the proportion between the start and end values.The
  calculation is a simple parametric calculation: <code>result = x0 + t * (x1 - x0)</code>,
  where <code>x0</code> is <code>startValue</code>, <code>x1</code> is <code>endValue</code>,
  and <code>t</code> is <code>fraction</code>.
 @param fraction The fraction from the starting to the ending values
 @param startValue The start value; should be of type  <code> float </code>  or
                      <code> Float </code>
 @param endValue The end value; should be of type  <code> float </code>  or  <code> Float </code>
 @return A linear interpolation between the start and end values, given the
          <code>fraction</code> parameter.
 */
- (JavaLangFloat *)evaluateWithFloat:(jfloat)fraction
                              withId:(NSNumber *)startValue
                              withId:(NSNumber *)endValue;

@end

J2OBJC_EMPTY_STATIC_INIT(ADFloatEvaluator)

FOUNDATION_EXPORT void ADFloatEvaluator_init(ADFloatEvaluator *self);

FOUNDATION_EXPORT ADFloatEvaluator *new_ADFloatEvaluator_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADFloatEvaluator *create_ADFloatEvaluator_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADFloatEvaluator)

@compatibility_alias RAndroidAnimationFloatEvaluator ADFloatEvaluator;

#endif

#pragma pop_macro("INCLUDE_ALL_FloatEvaluator")
