//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\stub\r\android\graphics\BezierPath.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_BezierPath")
#ifdef RESTRICT_BezierPath
#define INCLUDE_ALL_BezierPath 0
#else
#define INCLUDE_ALL_BezierPath 1
#endif
#undef RESTRICT_BezierPath

#if !defined (ADBezierPath_) && (INCLUDE_ALL_BezierPath || defined(INCLUDE_ADBezierPath))
#define ADBezierPath_

@class ADBezierListProducer;
@class ADPointF;
@class IOSFloatArray;
@class JavaUtilLinkedList;
@class JavaUtilRegexMatcher;

@interface ADBezierPath : NSObject {
 @public
  ADBezierListProducer *path_;
}

#pragma mark Public

/*!
 @brief Creates a new instance of Animate
 */
- (instancetype)init;

- (IOSFloatArray *)approximateWithFloat:(jfloat)acceptableError;

/*!
 @brief Evaluates this animation element for the passed interpolation time.Interp
  must be on [0..1].
 */
- (ADPointF *)evalWithFloat:(jfloat)interp;

- (void)parsePathStringWithNSString:(NSString *)d;

#pragma mark Protected

+ (jfloat)nextFloatWithJavaUtilLinkedList:(JavaUtilLinkedList *)l;

- (void)parsePathListWithNSString:(NSString *)list;

@end

J2OBJC_STATIC_INIT(ADBezierPath)

J2OBJC_FIELD_SETTER(ADBezierPath, path_, ADBezierListProducer *)

inline JavaUtilRegexMatcher *ADBezierPath_get_matchPoint(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT JavaUtilRegexMatcher *ADBezierPath_matchPoint;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ADBezierPath, matchPoint, JavaUtilRegexMatcher *)

FOUNDATION_EXPORT void ADBezierPath_init(ADBezierPath *self);

FOUNDATION_EXPORT ADBezierPath *new_ADBezierPath_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADBezierPath *create_ADBezierPath_init(void);

FOUNDATION_EXPORT jfloat ADBezierPath_nextFloatWithJavaUtilLinkedList_(JavaUtilLinkedList *l);

J2OBJC_TYPE_LITERAL_HEADER(ADBezierPath)

@compatibility_alias RAndroidGraphicsBezierPath ADBezierPath;

#endif

#pragma pop_macro("INCLUDE_ALL_BezierPath")