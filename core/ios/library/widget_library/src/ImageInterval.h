//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\attributedtext\ImageInterval.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ImageInterval")
#ifdef RESTRICT_ImageInterval
#define INCLUDE_ALL_ImageInterval 0
#else
#define INCLUDE_ALL_ImageInterval 1
#endif
#undef RESTRICT_ImageInterval

#if !defined (ASImageInterval_) && (INCLUDE_ALL_ImageInterval || defined(INCLUDE_ASImageInterval))
#define ASImageInterval_

#define RESTRICT_Interval 1
#define INCLUDE_ASInterval 1
#include "Interval.h"

@class IOSObjectArray;

@interface ASImageInterval : ASInterval

#pragma mark Public

- (instancetype)initWithInt:(jint)start
                    withInt:(jint)end
               withNSString:(NSString *)src;

- (IOSObjectArray *)getArgs;

- (NSString *)getSrc;

- (ASInterval *)makeNodeWithInt:(jint)start
                        withInt:(jint)end
              withNSObjectArray:(IOSObjectArray *)arguments;

- (void)setSrcWithNSString:(NSString *)src;

- (NSString *)description;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithInt:(jint)arg0
                    withInt:(jint)arg1 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASImageInterval)

FOUNDATION_EXPORT void ASImageInterval_initWithInt_withInt_withNSString_(ASImageInterval *self, jint start, jint end, NSString *src);

FOUNDATION_EXPORT ASImageInterval *new_ASImageInterval_initWithInt_withInt_withNSString_(jint start, jint end, NSString *src) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASImageInterval *create_ASImageInterval_initWithInt_withInt_withNSString_(jint start, jint end, NSString *src);

J2OBJC_TYPE_LITERAL_HEADER(ASImageInterval)

@compatibility_alias ComAsheraAttributedtextImageInterval ASImageInterval;

#endif

#pragma pop_macro("INCLUDE_ALL_ImageInterval")
