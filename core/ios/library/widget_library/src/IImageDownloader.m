//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\image\IImageDownloader.java
//

#include "IImageDownloader.h"
#include "J2ObjC_source.h"


@interface ASIImageDownloader : NSObject

@end

@implementation ASIImageDownloader

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "V", 0x401, 0, 1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(downloadWithId:withNSString:withId:withId:withASITarget:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "download", "LNSObject;LNSString;LNSObject;LNSObject;LASITarget;" };
  static const J2ObjcClassInfo _ASIImageDownloader = { "IImageDownloader", "com.ashera.image", ptrTable, methods, NULL, 7, 0x609, 1, 0, -1, -1, -1, -1, -1 };
  return &_ASIImageDownloader;
}

@end

J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ASIImageDownloader)
