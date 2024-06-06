//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\model\ModelScope.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ModelScope")
#ifdef RESTRICT_ModelScope
#define INCLUDE_ALL_ModelScope 0
#else
#define INCLUDE_ALL_ModelScope 1
#endif
#undef RESTRICT_ModelScope

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (ASModelScope_) && (INCLUDE_ALL_ModelScope || defined(INCLUDE_ASModelScope))
#define ASModelScope_

#define RESTRICT_JavaLangEnum 1
#define INCLUDE_JavaLangEnum 1
#include "java/lang/Enum.h"

@class IOSObjectArray;

typedef NS_ENUM(NSUInteger, ASModelScope_Enum) {
  ASModelScope_Enum_viewmodel = 0,
  ASModelScope_Enum_view = 1,
  ASModelScope_Enum_parentview = 2,
  ASModelScope_Enum_session = 3,
  ASModelScope_Enum_local = 4,
  ASModelScope_Enum_loopvar = 5,
  ASModelScope_Enum_sharedpreference = 6,
  ASModelScope_Enum_sqlllite = 7,
  ASModelScope_Enum_strings = 8,
  ASModelScope_Enum_component = 9,
  ASModelScope_Enum_constants = 10,
};

@interface ASModelScope : JavaLangEnum

#pragma mark Public

+ (ASModelScope *)valueOfWithNSString:(NSString *)name;

+ (IOSObjectArray *)values;

#pragma mark Package-Private

- (ASModelScope_Enum)toNSEnum;

@end

J2OBJC_STATIC_INIT(ASModelScope)

/*! INTERNAL ONLY - Use enum accessors declared below. */
FOUNDATION_EXPORT ASModelScope *ASModelScope_values_[];

inline ASModelScope *ASModelScope_get_viewmodel(void);
J2OBJC_ENUM_CONSTANT(ASModelScope, viewmodel)

inline ASModelScope *ASModelScope_get_view(void);
J2OBJC_ENUM_CONSTANT(ASModelScope, view)

inline ASModelScope *ASModelScope_get_parentview(void);
J2OBJC_ENUM_CONSTANT(ASModelScope, parentview)

inline ASModelScope *ASModelScope_get_session(void);
J2OBJC_ENUM_CONSTANT(ASModelScope, session)

inline ASModelScope *ASModelScope_get_local(void);
J2OBJC_ENUM_CONSTANT(ASModelScope, local)

inline ASModelScope *ASModelScope_get_loopvar(void);
J2OBJC_ENUM_CONSTANT(ASModelScope, loopvar)

inline ASModelScope *ASModelScope_get_sharedpreference(void);
J2OBJC_ENUM_CONSTANT(ASModelScope, sharedpreference)

inline ASModelScope *ASModelScope_get_sqlllite(void);
J2OBJC_ENUM_CONSTANT(ASModelScope, sqlllite)

inline ASModelScope *ASModelScope_get_strings(void);
J2OBJC_ENUM_CONSTANT(ASModelScope, strings)

inline ASModelScope *ASModelScope_get_component(void);
J2OBJC_ENUM_CONSTANT(ASModelScope, component)

inline ASModelScope *ASModelScope_get_constants(void);
J2OBJC_ENUM_CONSTANT(ASModelScope, constants)

FOUNDATION_EXPORT IOSObjectArray *ASModelScope_values(void);

FOUNDATION_EXPORT ASModelScope *ASModelScope_valueOfWithNSString_(NSString *name);

FOUNDATION_EXPORT ASModelScope *ASModelScope_fromOrdinal(NSUInteger ordinal);

J2OBJC_TYPE_LITERAL_HEADER(ASModelScope)

@compatibility_alias ComAsheraModelModelScope ASModelScope;

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_ModelScope")
