//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\util\LayoutDirection.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_LayoutDirection")
#ifdef RESTRICT_LayoutDirection
#define INCLUDE_ALL_LayoutDirection 0
#else
#define INCLUDE_ALL_LayoutDirection 1
#endif
#undef RESTRICT_LayoutDirection

#if !defined (ADLayoutDirection_) && (INCLUDE_ALL_LayoutDirection || defined(INCLUDE_ADLayoutDirection))
#define ADLayoutDirection_

/*!
 @brief A class for defining layout directions.A layout direction can be left-to-right (LTR)
  or right-to-left (RTL).
 It can also be inherited (from a parent) or deduced from the default
  language script of a locale.
 */
@interface ADLayoutDirection : NSObject

@end

J2OBJC_EMPTY_STATIC_INIT(ADLayoutDirection)

/*!
 @brief An undefined layout direction.
 */
inline jint ADLayoutDirection_get_UNDEFINED(void);
#define ADLayoutDirection_UNDEFINED -1
J2OBJC_STATIC_FIELD_CONSTANT(ADLayoutDirection, UNDEFINED, jint)

/*!
 @brief Horizontal layout direction is from Left to Right.
 */
inline jint ADLayoutDirection_get_LTR(void);
#define ADLayoutDirection_LTR 0
J2OBJC_STATIC_FIELD_CONSTANT(ADLayoutDirection, LTR, jint)

/*!
 @brief Horizontal layout direction is from Right to Left.
 */
inline jint ADLayoutDirection_get_RTL(void);
#define ADLayoutDirection_RTL 1
J2OBJC_STATIC_FIELD_CONSTANT(ADLayoutDirection, RTL, jint)

/*!
 @brief Horizontal layout direction is inherited.
 */
inline jint ADLayoutDirection_get_INHERIT(void);
#define ADLayoutDirection_INHERIT 2
J2OBJC_STATIC_FIELD_CONSTANT(ADLayoutDirection, INHERIT, jint)

/*!
 @brief Horizontal layout direction is deduced from the default language script for the locale.
 */
inline jint ADLayoutDirection_get_LOCALE(void);
#define ADLayoutDirection_LOCALE 3
J2OBJC_STATIC_FIELD_CONSTANT(ADLayoutDirection, LOCALE, jint)

J2OBJC_TYPE_LITERAL_HEADER(ADLayoutDirection)

@compatibility_alias RAndroidUtilLayoutDirection ADLayoutDirection;

#endif

#pragma pop_macro("INCLUDE_ALL_LayoutDirection")
