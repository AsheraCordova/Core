//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\widget\IAttributable.java
//

#include "IAttributable.h"
#include "J2ObjC_source.h"


@interface ASIAttributable : NSObject

@end

@implementation ASIAttributable

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "LASIAttributable;", 0x401, 0, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 2, 3, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 4, 5, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x401, 6, 7, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x401, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(newInstanceWithASIWidget:);
  methods[1].selector = @selector(loadAttributesWithNSString:);
  methods[2].selector = @selector(setAttributeWithASWidgetAttribute:withNSString:withId:withASILifeCycleDecorator:);
  methods[3].selector = @selector(getAttributeWithASWidgetAttribute:withASILifeCycleDecorator:);
  methods[4].selector = @selector(getLocalName);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "newInstance", "LASIWidget;", "loadAttributes", "LNSString;", "setAttribute", "LASWidgetAttribute;LNSString;LNSObject;LASILifeCycleDecorator;", "getAttribute", "LASWidgetAttribute;LASILifeCycleDecorator;" };
  static const J2ObjcClassInfo _ASIAttributable = { "IAttributable", "com.ashera.widget", ptrTable, methods, NULL, 7, 0x609, 5, 0, -1, -1, -1, -1, -1 };
  return &_ASIAttributable;
}

@end

J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ASIAttributable)
