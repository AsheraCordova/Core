//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\plugin\IPlugin.java
//

#include "IPlugin.h"
#include "J2ObjC_source.h"


@interface ASIPlugin : NSObject

@end

@implementation ASIPlugin

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "LNSString;", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x481, 0, 1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(getName);
  methods[1].selector = @selector(invokeWithNSString:withNSObjectArray:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "invoke", "LNSString;[LNSObject;" };
  static const J2ObjcClassInfo _ASIPlugin = { "IPlugin", "com.ashera.plugin", ptrTable, methods, NULL, 7, 0x609, 2, 0, -1, -1, -1, -1, -1 };
  return &_ASIPlugin;
}

@end

J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ASIPlugin)
