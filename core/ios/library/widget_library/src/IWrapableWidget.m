//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\widget\IWrapableWidget.java
//

#include "IWrapableWidget.h"
#include "J2ObjC_source.h"


@interface ASIWrapableWidget : NSObject

@end

@implementation ASIWrapableWidget

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "LNSObject;", 0x401, 0, 1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x401, 2, 3, -1, -1, -1, -1 },
    { NULL, "V", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x401, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(createWrapperViewHolderWithInt:);
  methods[1].selector = @selector(createWrapperViewWithId:withInt:);
  methods[2].selector = @selector(addForegroundIfNeeded);
  methods[3].selector = @selector(getForeground);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "createWrapperViewHolder", "I", "createWrapperView", "LNSObject;I" };
  static const J2ObjcClassInfo _ASIWrapableWidget = { "IWrapableWidget", "com.ashera.widget", ptrTable, methods, NULL, 7, 0x609, 4, 0, -1, -1, -1, -1, -1 };
  return &_ASIWrapableWidget;
}

@end

J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ASIWrapableWidget)
