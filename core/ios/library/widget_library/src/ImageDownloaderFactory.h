//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\image\ImageDownloaderFactory.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ImageDownloaderFactory")
#ifdef RESTRICT_ImageDownloaderFactory
#define INCLUDE_ALL_ImageDownloaderFactory 0
#else
#define INCLUDE_ALL_ImageDownloaderFactory 1
#endif
#undef RESTRICT_ImageDownloaderFactory

#if !defined (ASImageDownloaderFactory_) && (INCLUDE_ALL_ImageDownloaderFactory || defined(INCLUDE_ASImageDownloaderFactory))
#define ASImageDownloaderFactory_

@protocol ASIImageDownloader;

@interface ASImageDownloaderFactory : NSObject

#pragma mark Public

- (instancetype)init;

+ (id<ASIImageDownloader>)get;

+ (void)register__WithASIImageDownloader:(id<ASIImageDownloader>)imageDownloader;

@end

J2OBJC_EMPTY_STATIC_INIT(ASImageDownloaderFactory)

FOUNDATION_EXPORT void ASImageDownloaderFactory_init(ASImageDownloaderFactory *self);

FOUNDATION_EXPORT ASImageDownloaderFactory *new_ASImageDownloaderFactory_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASImageDownloaderFactory *create_ASImageDownloaderFactory_init(void);

FOUNDATION_EXPORT id<ASIImageDownloader> ASImageDownloaderFactory_get(void);

FOUNDATION_EXPORT void ASImageDownloaderFactory_register__WithASIImageDownloader_(id<ASIImageDownloader> imageDownloader);

J2OBJC_TYPE_LITERAL_HEADER(ASImageDownloaderFactory)

@compatibility_alias ComAsheraImageImageDownloaderFactory ASImageDownloaderFactory;

#endif

#pragma pop_macro("INCLUDE_ALL_ImageDownloaderFactory")
