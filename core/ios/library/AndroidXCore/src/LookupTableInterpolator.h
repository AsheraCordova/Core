//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroidX-core\src\main\java\androidx\interpolator\view\animation\LookupTableInterpolator.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_LookupTableInterpolator")
#ifdef RESTRICT_LookupTableInterpolator
#define INCLUDE_ALL_LookupTableInterpolator 0
#else
#define INCLUDE_ALL_LookupTableInterpolator 1
#endif
#undef RESTRICT_LookupTableInterpolator

#if !defined (ADXLookupTableInterpolator_) && (INCLUDE_ALL_LookupTableInterpolator || defined(INCLUDE_ADXLookupTableInterpolator))
#define ADXLookupTableInterpolator_

#define RESTRICT_Interpolator 1
#define INCLUDE_ADInterpolator 1
#include "Interpolator.h"

@class IOSFloatArray;

/*!
 @brief An <code>Interpolator</code> that uses a lookup table to compute an interpolation based on a
  given input.
 */
@interface ADXLookupTableInterpolator : NSObject < ADInterpolator >

#pragma mark Public

- (jfloat)getInterpolationWithFloat:(jfloat)input;

#pragma mark Protected

- (instancetype)initPackagePrivateWithFloatArray:(IOSFloatArray *)values;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXLookupTableInterpolator)

FOUNDATION_EXPORT void ADXLookupTableInterpolator_initPackagePrivateWithFloatArray_(ADXLookupTableInterpolator *self, IOSFloatArray *values);

J2OBJC_TYPE_LITERAL_HEADER(ADXLookupTableInterpolator)

@compatibility_alias AndroidxInterpolatorViewAnimationLookupTableInterpolator ADXLookupTableInterpolator;

#endif

#pragma pop_macro("INCLUDE_ALL_LookupTableInterpolator")