//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroidX-core\src\main\java\androidx\interpolator\view\animation\FastOutSlowInInterpolator.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_FastOutSlowInInterpolator")
#ifdef RESTRICT_FastOutSlowInInterpolator
#define INCLUDE_ALL_FastOutSlowInInterpolator 0
#else
#define INCLUDE_ALL_FastOutSlowInInterpolator 1
#endif
#undef RESTRICT_FastOutSlowInInterpolator

#if !defined (ADXFastOutSlowInInterpolator_) && (INCLUDE_ALL_FastOutSlowInInterpolator || defined(INCLUDE_ADXFastOutSlowInInterpolator))
#define ADXFastOutSlowInInterpolator_

#define RESTRICT_LookupTableInterpolator 1
#define INCLUDE_ADXLookupTableInterpolator 1
#include "LookupTableInterpolator.h"

@class IOSFloatArray;

/*!
 @brief Interpolator corresponding to <code>r.android.R.interpolator.fast_out_slow_in</code>.
 Uses a lookup table for the Bezier curve from (0,0) to (1,1) with control points:
  P0 (0, 0)
  P1 (0.4, 0)
  P2 (0.2, 1.0)
  P3 (1.0, 1.0)
 */
@interface ADXFastOutSlowInInterpolator : ADXLookupTableInterpolator

#pragma mark Public

- (instancetype)init;

// Disallowed inherited constructors, do not use.

- (instancetype)initPackagePrivateWithFloatArray:(IOSFloatArray *)arg0 NS_UNAVAILABLE;

@end

J2OBJC_STATIC_INIT(ADXFastOutSlowInInterpolator)

FOUNDATION_EXPORT void ADXFastOutSlowInInterpolator_init(ADXFastOutSlowInInterpolator *self);

FOUNDATION_EXPORT ADXFastOutSlowInInterpolator *new_ADXFastOutSlowInInterpolator_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADXFastOutSlowInInterpolator *create_ADXFastOutSlowInInterpolator_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADXFastOutSlowInInterpolator)

@compatibility_alias AndroidxInterpolatorViewAnimationFastOutSlowInInterpolator ADXFastOutSlowInInterpolator;

#endif

#pragma pop_macro("INCLUDE_ALL_FastOutSlowInInterpolator")
