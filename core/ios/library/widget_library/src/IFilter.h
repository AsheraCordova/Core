//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\converter\IFilter.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_IFilter")
#ifdef RESTRICT_IFilter
#define INCLUDE_ALL_IFilter 0
#else
#define INCLUDE_ALL_IFilter 1
#endif
#undef RESTRICT_IFilter

#if !defined (ASIFilter_) && (INCLUDE_ALL_IFilter || defined(INCLUDE_ASIFilter))
#define ASIFilter_

@protocol ASIFilter < JavaObject >

- (jboolean)filterWithNSString:(NSString *)value
                  withNSString:(NSString *)query;

@end

J2OBJC_EMPTY_STATIC_INIT(ASIFilter)

J2OBJC_TYPE_LITERAL_HEADER(ASIFilter)

#define ComAsheraConverterIFilter ASIFilter

#endif

#pragma pop_macro("INCLUDE_ALL_IFilter")
