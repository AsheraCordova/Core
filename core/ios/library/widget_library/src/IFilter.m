//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\converter\IFilter.java
//

#include "IFilter.h"
#include "J2ObjC_source.h"


@interface ASIFilter : NSObject

@end

@implementation ASIFilter

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "Z", 0x401, 0, 1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(filterWithNSString:withNSString:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "filter", "LNSString;LNSString;" };
  static const J2ObjcClassInfo _ASIFilter = { "IFilter", "com.ashera.converter", ptrTable, methods, NULL, 7, 0x609, 1, 0, -1, -1, -1, -1, -1 };
  return &_ASIFilter;
}

@end

J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ASIFilter)
