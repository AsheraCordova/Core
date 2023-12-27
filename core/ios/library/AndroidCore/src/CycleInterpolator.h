//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\view\animation\CycleInterpolator.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_CycleInterpolator")
#ifdef RESTRICT_CycleInterpolator
#define INCLUDE_ALL_CycleInterpolator 0
#else
#define INCLUDE_ALL_CycleInterpolator 1
#endif
#undef RESTRICT_CycleInterpolator

#if !defined (ADCycleInterpolator_) && (INCLUDE_ALL_CycleInterpolator || defined(INCLUDE_ADCycleInterpolator))
#define ADCycleInterpolator_

#define RESTRICT_BaseInterpolator 1
#define INCLUDE_ADBaseInterpolator 1
#include "BaseInterpolator.h"

/*!
 @brief Repeats the animation for a specified number of cycles.The
  rate of change follows a sinusoidal pattern.
 */
@interface ADCycleInterpolator : ADBaseInterpolator

#pragma mark Public

- (instancetype)initWithFloat:(jfloat)cycles;

/*!
 */
- (jlong)createNativeInterpolator;

/*!
 */
- (jfloat)getInterpolationWithFloat:(jfloat)input;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADCycleInterpolator)

FOUNDATION_EXPORT void ADCycleInterpolator_initWithFloat_(ADCycleInterpolator *self, jfloat cycles);

FOUNDATION_EXPORT ADCycleInterpolator *new_ADCycleInterpolator_initWithFloat_(jfloat cycles) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADCycleInterpolator *create_ADCycleInterpolator_initWithFloat_(jfloat cycles);

J2OBJC_TYPE_LITERAL_HEADER(ADCycleInterpolator)

@compatibility_alias RAndroidViewAnimationCycleInterpolator ADCycleInterpolator;

#endif

#pragma pop_macro("INCLUDE_ALL_CycleInterpolator")
