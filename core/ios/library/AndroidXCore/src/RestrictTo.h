//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroidX-core\src\main\java\androidx\annotation\RestrictTo.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_RestrictTo")
#ifdef RESTRICT_RestrictTo
#define INCLUDE_ALL_RestrictTo 0
#else
#define INCLUDE_ALL_RestrictTo 1
#endif
#undef RESTRICT_RestrictTo

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (ADXRestrictTo_) && (INCLUDE_ALL_RestrictTo || defined(INCLUDE_ADXRestrictTo))
#define ADXRestrictTo_

#define RESTRICT_JavaLangAnnotationAnnotation 1
#define INCLUDE_JavaLangAnnotationAnnotation 1
#include "java/lang/annotation/Annotation.h"

@class IOSClass;
@class IOSObjectArray;

@protocol ADXRestrictTo < JavaLangAnnotationAnnotation >

@property (readonly) IOSObjectArray *value;

- (jboolean)isEqual:(id)obj;

- (NSUInteger)hash;

@end

@interface ADXRestrictTo : NSObject < ADXRestrictTo > {
 @public
  IOSObjectArray *value_;
}

@end

J2OBJC_EMPTY_STATIC_INIT(ADXRestrictTo)

FOUNDATION_EXPORT id<ADXRestrictTo> create_ADXRestrictTo(IOSObjectArray *value);

J2OBJC_TYPE_LITERAL_HEADER(ADXRestrictTo)

#define AndroidxAnnotationRestrictTo ADXRestrictTo

#endif

#if !defined (ADXRestrictTo_Scope_) && (INCLUDE_ALL_RestrictTo || defined(INCLUDE_ADXRestrictTo_Scope))
#define ADXRestrictTo_Scope_

#define RESTRICT_JavaLangEnum 1
#define INCLUDE_JavaLangEnum 1
#include "java/lang/Enum.h"

@class IOSObjectArray;

typedef NS_ENUM(NSUInteger, ADXRestrictTo_Scope_Enum) {
  ADXRestrictTo_Scope_Enum_LIBRARY = 0,
  ADXRestrictTo_Scope_Enum_LIBRARY_GROUP = 1,
  ADXRestrictTo_Scope_Enum_LIBRARY_GROUP_PREFIX = 2,
  ADXRestrictTo_Scope_Enum_GROUP_ID = 3,
  ADXRestrictTo_Scope_Enum_TESTS = 4,
  ADXRestrictTo_Scope_Enum_SUBCLASSES = 5,
};

@interface ADXRestrictTo_Scope : JavaLangEnum

#pragma mark Public

+ (ADXRestrictTo_Scope *)valueOfWithNSString:(NSString *)name;

+ (IOSObjectArray *)values;

#pragma mark Package-Private

- (ADXRestrictTo_Scope_Enum)toNSEnum;

@end

J2OBJC_STATIC_INIT(ADXRestrictTo_Scope)

/*! INTERNAL ONLY - Use enum accessors declared below. */
FOUNDATION_EXPORT ADXRestrictTo_Scope *ADXRestrictTo_Scope_values_[];

inline ADXRestrictTo_Scope *ADXRestrictTo_Scope_get_LIBRARY(void);
J2OBJC_ENUM_CONSTANT(ADXRestrictTo_Scope, LIBRARY)

inline ADXRestrictTo_Scope *ADXRestrictTo_Scope_get_LIBRARY_GROUP(void);
J2OBJC_ENUM_CONSTANT(ADXRestrictTo_Scope, LIBRARY_GROUP)

inline ADXRestrictTo_Scope *ADXRestrictTo_Scope_get_LIBRARY_GROUP_PREFIX(void);
J2OBJC_ENUM_CONSTANT(ADXRestrictTo_Scope, LIBRARY_GROUP_PREFIX)

/*!
 */
inline ADXRestrictTo_Scope *ADXRestrictTo_Scope_get_GROUP_ID(void);
J2OBJC_ENUM_CONSTANT(ADXRestrictTo_Scope, GROUP_ID)

inline ADXRestrictTo_Scope *ADXRestrictTo_Scope_get_TESTS(void);
J2OBJC_ENUM_CONSTANT(ADXRestrictTo_Scope, TESTS)

inline ADXRestrictTo_Scope *ADXRestrictTo_Scope_get_SUBCLASSES(void);
J2OBJC_ENUM_CONSTANT(ADXRestrictTo_Scope, SUBCLASSES)

FOUNDATION_EXPORT IOSObjectArray *ADXRestrictTo_Scope_values(void);

FOUNDATION_EXPORT ADXRestrictTo_Scope *ADXRestrictTo_Scope_valueOfWithNSString_(NSString *name);

FOUNDATION_EXPORT ADXRestrictTo_Scope *ADXRestrictTo_Scope_fromOrdinal(NSUInteger ordinal);

J2OBJC_TYPE_LITERAL_HEADER(ADXRestrictTo_Scope)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_RestrictTo")
