//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\view\animation\AccelerateInterpolator.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_AccelerateInterpolator")
#ifdef RESTRICT_AccelerateInterpolator
#define INCLUDE_ALL_AccelerateInterpolator 0
#else
#define INCLUDE_ALL_AccelerateInterpolator 1
#endif
#undef RESTRICT_AccelerateInterpolator

#if !defined (ADAccelerateInterpolator_) && (INCLUDE_ALL_AccelerateInterpolator || defined(INCLUDE_ADAccelerateInterpolator))
#define ADAccelerateInterpolator_

#define RESTRICT_BaseInterpolator 1
#define INCLUDE_ADBaseInterpolator 1
#include "BaseInterpolator.h"

/*!
 @brief An interpolator where the rate of change starts out slowly and
  and then accelerates.
 */
@interface ADAccelerateInterpolator : ADBaseInterpolator

#pragma mark Public

- (instancetype)init;

/*!
 @brief Constructor
 @param factor Degree to which the animation should be eased. Seting         factor to 1.0f produces a y=x^2 parabola. Increasing factor above
          1.0f  exaggerates the ease-in effect (i.e., it starts even
          slower and ends evens faster)
 */
- (instancetype)initWithFloat:(jfloat)factor;

/*!
 */
- (jlong)createNativeInterpolator;

/*!
 */
- (jfloat)getInterpolationWithFloat:(jfloat)input;

@end

J2OBJC_EMPTY_STATIC_INIT(ADAccelerateInterpolator)

FOUNDATION_EXPORT void ADAccelerateInterpolator_init(ADAccelerateInterpolator *self);

FOUNDATION_EXPORT ADAccelerateInterpolator *new_ADAccelerateInterpolator_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADAccelerateInterpolator *create_ADAccelerateInterpolator_init(void);

FOUNDATION_EXPORT void ADAccelerateInterpolator_initWithFloat_(ADAccelerateInterpolator *self, jfloat factor);

FOUNDATION_EXPORT ADAccelerateInterpolator *new_ADAccelerateInterpolator_initWithFloat_(jfloat factor) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADAccelerateInterpolator *create_ADAccelerateInterpolator_initWithFloat_(jfloat factor);

J2OBJC_TYPE_LITERAL_HEADER(ADAccelerateInterpolator)

@compatibility_alias RAndroidViewAnimationAccelerateInterpolator ADAccelerateInterpolator;

#endif

#pragma pop_macro("INCLUDE_ALL_AccelerateInterpolator")
