//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\css_parser\src\com\ashera\css\TokenMgrError.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_TokenMgrError")
#ifdef RESTRICT_TokenMgrError
#define INCLUDE_ALL_TokenMgrError 0
#else
#define INCLUDE_ALL_TokenMgrError 1
#endif
#undef RESTRICT_TokenMgrError

#if !defined (CSSTokenMgrError_) && (INCLUDE_ALL_TokenMgrError || defined(INCLUDE_CSSTokenMgrError))
#define CSSTokenMgrError_

#define RESTRICT_JavaLangError 1
#define INCLUDE_JavaLangError 1
#include "java/lang/Error.h"

@class JavaLangThrowable;

/*!
 @brief Token Manager Error.
 */
@interface CSSTokenMgrError : JavaLangError {
 @public
  /*!
   @brief Indicates the reason why the exception is thrown.It will have
  one of the above 4 values.
   */
  jint errorCode_;
}

#pragma mark Public

/*!
 @brief No arg constructor.
 */
- (instancetype)initPackagePrivate;

/*!
 @brief Full Constructor.
 */
- (instancetype)initPackagePrivateWithBoolean:(jboolean)EOFSeen
                                      withInt:(jint)lexState
                                      withInt:(jint)errorLine
                                      withInt:(jint)errorColumn
                                 withNSString:(NSString *)errorAfter
                                     withChar:(jchar)curChar
                                      withInt:(jint)reason;

/*!
 @brief Constructor with message and reason.
 */
- (instancetype)initPackagePrivateWithNSString:(NSString *)message
                                       withInt:(jint)reason;

/*!
 @brief You can also modify the body of this method to customize your error messages.
 For example, cases like LOOP_DETECTED and INVALID_LEXICAL_STATE are not
  of end-users concern, so you can return something like :
      "Internal Error : Please file a bug report .... "
  from this method for such cases in the release version of your parser.
 */
- (NSString *)getMessage;

#pragma mark Protected

/*!
 @brief Replaces unprintable characters by their escaped (or unicode escaped)
  equivalents in the given string
 */
+ (NSString *)addEscapesWithNSString:(NSString *)str;

/*!
 @brief Returns a detailed message for the Error when it is thrown by the
  token manager to indicate a lexical error.
 Parameters :
     EOFSeen     : indicates if EOF caused the lexical error
     curLexState : lexical state in which this error occurred
     errorLine   : line number when the error occurred
     errorColumn : column number when the error occurred
     errorAfter  : prefix that was seen before this error occurred
     curchar     : the offending character
  Note: You can customize the lexical error message by modifying this method.
 */
+ (NSString *)LexicalErrorWithBoolean:(jboolean)EOFSeen
                              withInt:(jint)lexState
                              withInt:(jint)errorLine
                              withInt:(jint)errorColumn
                         withNSString:(NSString *)errorAfter
                             withChar:(jchar)curChar;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

- (instancetype)initWithJavaLangThrowable:(JavaLangThrowable *)arg0 NS_UNAVAILABLE;

- (instancetype)initWithNSString:(NSString *)arg0 NS_UNAVAILABLE;

- (instancetype)initWithNSString:(NSString *)arg0
           withJavaLangThrowable:(JavaLangThrowable *)arg1 NS_UNAVAILABLE;

- (instancetype)initWithNSString:(NSString *)arg0
           withJavaLangThrowable:(JavaLangThrowable *)arg1
                     withBoolean:(jboolean)arg2
                     withBoolean:(jboolean)arg3 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(CSSTokenMgrError)

/*!
 @brief Lexical error occurred.
 */
inline jint CSSTokenMgrError_get_LEXICAL_ERROR(void);
#define CSSTokenMgrError_LEXICAL_ERROR 0
J2OBJC_STATIC_FIELD_CONSTANT(CSSTokenMgrError, LEXICAL_ERROR, jint)

/*!
 @brief An attempt was made to create a second instance of a static token manager.
 */
inline jint CSSTokenMgrError_get_STATIC_LEXER_ERROR(void);
#define CSSTokenMgrError_STATIC_LEXER_ERROR 1
J2OBJC_STATIC_FIELD_CONSTANT(CSSTokenMgrError, STATIC_LEXER_ERROR, jint)

/*!
 @brief Tried to change to an invalid lexical state.
 */
inline jint CSSTokenMgrError_get_INVALID_LEXICAL_STATE(void);
#define CSSTokenMgrError_INVALID_LEXICAL_STATE 2
J2OBJC_STATIC_FIELD_CONSTANT(CSSTokenMgrError, INVALID_LEXICAL_STATE, jint)

/*!
 @brief Detected (and bailed out of) an infinite loop in the token manager.
 */
inline jint CSSTokenMgrError_get_LOOP_DETECTED(void);
#define CSSTokenMgrError_LOOP_DETECTED 3
J2OBJC_STATIC_FIELD_CONSTANT(CSSTokenMgrError, LOOP_DETECTED, jint)

FOUNDATION_EXPORT NSString *CSSTokenMgrError_addEscapesWithNSString_(NSString *str);

FOUNDATION_EXPORT NSString *CSSTokenMgrError_LexicalErrorWithBoolean_withInt_withInt_withInt_withNSString_withChar_(jboolean EOFSeen, jint lexState, jint errorLine, jint errorColumn, NSString *errorAfter, jchar curChar);

FOUNDATION_EXPORT void CSSTokenMgrError_initPackagePrivate(CSSTokenMgrError *self);

FOUNDATION_EXPORT CSSTokenMgrError *new_CSSTokenMgrError_initPackagePrivate(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT CSSTokenMgrError *create_CSSTokenMgrError_initPackagePrivate(void);

FOUNDATION_EXPORT void CSSTokenMgrError_initPackagePrivateWithNSString_withInt_(CSSTokenMgrError *self, NSString *message, jint reason);

FOUNDATION_EXPORT CSSTokenMgrError *new_CSSTokenMgrError_initPackagePrivateWithNSString_withInt_(NSString *message, jint reason) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT CSSTokenMgrError *create_CSSTokenMgrError_initPackagePrivateWithNSString_withInt_(NSString *message, jint reason);

FOUNDATION_EXPORT void CSSTokenMgrError_initPackagePrivateWithBoolean_withInt_withInt_withInt_withNSString_withChar_withInt_(CSSTokenMgrError *self, jboolean EOFSeen, jint lexState, jint errorLine, jint errorColumn, NSString *errorAfter, jchar curChar, jint reason);

FOUNDATION_EXPORT CSSTokenMgrError *new_CSSTokenMgrError_initPackagePrivateWithBoolean_withInt_withInt_withInt_withNSString_withChar_withInt_(jboolean EOFSeen, jint lexState, jint errorLine, jint errorColumn, NSString *errorAfter, jchar curChar, jint reason) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT CSSTokenMgrError *create_CSSTokenMgrError_initPackagePrivateWithBoolean_withInt_withInt_withInt_withNSString_withChar_withInt_(jboolean EOFSeen, jint lexState, jint errorLine, jint errorColumn, NSString *errorAfter, jchar curChar, jint reason);

J2OBJC_TYPE_LITERAL_HEADER(CSSTokenMgrError)

@compatibility_alias ComAsheraCssTokenMgrError CSSTokenMgrError;

#endif

#pragma pop_macro("INCLUDE_ALL_TokenMgrError")
