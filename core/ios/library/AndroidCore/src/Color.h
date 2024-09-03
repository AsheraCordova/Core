//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\stub\r\android\graphics\Color.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_Color")
#ifdef RESTRICT_Color
#define INCLUDE_ALL_Color 0
#else
#define INCLUDE_ALL_Color 1
#endif
#undef RESTRICT_Color

#if !defined (ADColor_) && (INCLUDE_ALL_Color || defined(INCLUDE_ADColor))
#define ADColor_

@class IOSFloatArray;

@interface ADColor : NSObject

#pragma mark Public

- (instancetype)init;

+ (jint)alphaWithInt:(jint)i;

+ (NSString *)formatColorWithInt:(jint)intColor;

+ (jint)HSVToColorWithFloatArray:(IOSFloatArray *)value;

+ (jint)parseColorWithNSString:(NSString *)colorString;

@end

J2OBJC_EMPTY_STATIC_INIT(ADColor)

inline jint ADColor_get_BLACK(void);
#define ADColor_BLACK -16777216
J2OBJC_STATIC_FIELD_CONSTANT(ADColor, BLACK, jint)

inline jint ADColor_get_RED(void);
#define ADColor_RED -65536
J2OBJC_STATIC_FIELD_CONSTANT(ADColor, RED, jint)

inline jint ADColor_get_WHITE(void);
#define ADColor_WHITE -1
J2OBJC_STATIC_FIELD_CONSTANT(ADColor, WHITE, jint)

FOUNDATION_EXPORT void ADColor_init(ADColor *self);

FOUNDATION_EXPORT ADColor *new_ADColor_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADColor *create_ADColor_init(void);

FOUNDATION_EXPORT jint ADColor_HSVToColorWithFloatArray_(IOSFloatArray *value);

FOUNDATION_EXPORT jint ADColor_alphaWithInt_(jint i);

FOUNDATION_EXPORT jint ADColor_parseColorWithNSString_(NSString *colorString);

FOUNDATION_EXPORT NSString *ADColor_formatColorWithInt_(jint intColor);

J2OBJC_TYPE_LITERAL_HEADER(ADColor)

@compatibility_alias RAndroidGraphicsColor ADColor;

#endif

#pragma pop_macro("INCLUDE_ALL_Color")
