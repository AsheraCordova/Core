//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: /Users/ramm/git/core-widget_library/widget_library/build/classes/com/ashera/widget/HasText.java
//

#include "HasText.h"
#include "J2ObjC_source.h"

@interface ASHasText : NSObject

@end

@implementation ASHasText

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "LNSString;", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 0, 1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(getText);
  methods[1].selector = @selector(setTextWithNSString:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "setText", "LNSString;" };
  static const J2ObjcClassInfo _ASHasText = { "HasText", "com.ashera.widget", ptrTable, methods, NULL, 7, 0x609, 2, 0, -1, -1, -1, -1, -1 };
  return &_ASHasText;
}

@end

J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ASHasText)
