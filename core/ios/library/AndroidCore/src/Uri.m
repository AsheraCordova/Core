//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\stub\r\android\net\Uri.java
//

#include "J2ObjC_source.h"
#include "Uri.h"
#include "java/io/File.h"


@implementation ADUri

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADUri_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (NSString *)getQueryParameterWithNSString:(NSString *)string {
  return nil;
}

+ (ADUri *)parseWithNSString:(NSString *)queryParameter {
  return ADUri_parseWithNSString_(queryParameter);
}

- (NSString *)getScheme {
  return nil;
}

- (NSString *)getPath {
  return nil;
}

+ (ADUri *)fromFileWithJavaIoFile:(JavaIoFile *)file {
  return ADUri_fromFileWithJavaIoFile_(file);
}

- (NSString *)getHost {
  return nil;
}

- (NSString *)getSchemeSpecificPart {
  return nil;
}

- (jboolean)isAbsolute {
  return false;
}

- (id)getPort {
  return nil;
}

- (id)getFragment {
  return nil;
}

- (id)getQuery {
  return nil;
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, 0, 1, -1, -1, -1, -1 },
    { NULL, "LADUri;", 0x9, 2, 1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LADUri;", 0x9, 3, 4, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(getQueryParameterWithNSString:);
  methods[2].selector = @selector(parseWithNSString:);
  methods[3].selector = @selector(getScheme);
  methods[4].selector = @selector(getPath);
  methods[5].selector = @selector(fromFileWithJavaIoFile:);
  methods[6].selector = @selector(getHost);
  methods[7].selector = @selector(getSchemeSpecificPart);
  methods[8].selector = @selector(isAbsolute);
  methods[9].selector = @selector(getPort);
  methods[10].selector = @selector(getFragment);
  methods[11].selector = @selector(getQuery);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "getQueryParameter", "LNSString;", "parse", "fromFile", "LJavaIoFile;", "LADUri_Builder;" };
  static const J2ObjcClassInfo _ADUri = { "Uri", "r.android.net", ptrTable, methods, NULL, 7, 0x1, 12, 0, -1, 5, -1, -1, -1 };
  return &_ADUri;
}

@end

void ADUri_init(ADUri *self) {
  NSObject_init(self);
}

ADUri *new_ADUri_init() {
  J2OBJC_NEW_IMPL(ADUri, init)
}

ADUri *create_ADUri_init() {
  J2OBJC_CREATE_IMPL(ADUri, init)
}

ADUri *ADUri_parseWithNSString_(NSString *queryParameter) {
  ADUri_initialize();
  return nil;
}

ADUri *ADUri_fromFileWithJavaIoFile_(JavaIoFile *file) {
  ADUri_initialize();
  return nil;
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADUri)

@implementation ADUri_Builder

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADUri_Builder_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (ADUri_Builder *)schemeWithNSString:(NSString *)pluginUriScheme {
  return nil;
}

- (ADUri_Builder *)authorityWithNSString:(NSString *)serviceName {
  return nil;
}

- (ADUri_Builder *)appendQueryParameterWithNSString:(NSString *)string
                                       withNSString:(NSString *)string2 {
  return nil;
}

- (ADUri *)build {
  return nil;
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LADUri_Builder;", 0x1, 0, 1, -1, -1, -1, -1 },
    { NULL, "LADUri_Builder;", 0x1, 2, 1, -1, -1, -1, -1 },
    { NULL, "LADUri_Builder;", 0x1, 3, 4, -1, -1, -1, -1 },
    { NULL, "LADUri;", 0x1, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(schemeWithNSString:);
  methods[2].selector = @selector(authorityWithNSString:);
  methods[3].selector = @selector(appendQueryParameterWithNSString:withNSString:);
  methods[4].selector = @selector(build);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "scheme", "LNSString;", "authority", "appendQueryParameter", "LNSString;LNSString;", "LADUri;" };
  static const J2ObjcClassInfo _ADUri_Builder = { "Builder", "r.android.net", ptrTable, methods, NULL, 7, 0x9, 5, 0, 5, -1, -1, -1, -1 };
  return &_ADUri_Builder;
}

@end

void ADUri_Builder_init(ADUri_Builder *self) {
  NSObject_init(self);
}

ADUri_Builder *new_ADUri_Builder_init() {
  J2OBJC_NEW_IMPL(ADUri_Builder, init)
}

ADUri_Builder *create_ADUri_Builder_init() {
  J2OBJC_CREATE_IMPL(ADUri_Builder, init)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADUri_Builder)
