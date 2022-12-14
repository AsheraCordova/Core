//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\image\ImageDownloaderFactory.java
//

#include "IImageDownloader.h"
#include "ImageDownloaderFactory.h"
#include "J2ObjC_source.h"


inline id<ASIImageDownloader> ASImageDownloaderFactory_get_imageDownloader(void);
inline id<ASIImageDownloader> ASImageDownloaderFactory_set_imageDownloader(id<ASIImageDownloader> value);
static id<ASIImageDownloader> ASImageDownloaderFactory_imageDownloader;
J2OBJC_STATIC_FIELD_OBJ(ASImageDownloaderFactory, imageDownloader, id<ASIImageDownloader>)

@implementation ASImageDownloaderFactory

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASImageDownloaderFactory_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

+ (id<ASIImageDownloader>)get {
  return ASImageDownloaderFactory_get();
}

+ (void)register__WithASIImageDownloader:(id<ASIImageDownloader>)imageDownloader {
  ASImageDownloaderFactory_register__WithASIImageDownloader_(imageDownloader);
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LASIImageDownloader;", 0x9, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 0, 1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(get);
  methods[2].selector = @selector(register__WithASIImageDownloader:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "imageDownloader", "LASIImageDownloader;", .constantValue.asLong = 0, 0xa, -1, 2, -1, -1 },
  };
  static const void *ptrTable[] = { "register", "LASIImageDownloader;", &ASImageDownloaderFactory_imageDownloader };
  static const J2ObjcClassInfo _ASImageDownloaderFactory = { "ImageDownloaderFactory", "com.ashera.image", ptrTable, methods, fields, 7, 0x1, 3, 1, -1, -1, -1, -1, -1 };
  return &_ASImageDownloaderFactory;
}

@end

void ASImageDownloaderFactory_init(ASImageDownloaderFactory *self) {
  NSObject_init(self);
}

ASImageDownloaderFactory *new_ASImageDownloaderFactory_init() {
  J2OBJC_NEW_IMPL(ASImageDownloaderFactory, init)
}

ASImageDownloaderFactory *create_ASImageDownloaderFactory_init() {
  J2OBJC_CREATE_IMPL(ASImageDownloaderFactory, init)
}

id<ASIImageDownloader> ASImageDownloaderFactory_get() {
  ASImageDownloaderFactory_initialize();
  return ASImageDownloaderFactory_imageDownloader;
}

void ASImageDownloaderFactory_register__WithASIImageDownloader_(id<ASIImageDownloader> imageDownloader) {
  ASImageDownloaderFactory_initialize();
  JreStrongAssign(&ASImageDownloaderFactory_imageDownloader, imageDownloader);
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASImageDownloaderFactory)
