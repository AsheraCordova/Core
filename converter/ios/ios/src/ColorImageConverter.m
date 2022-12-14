//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\IOSConverter\src\main\java\com\ashera\converter\ColorImageConverter.java
//

#include "ColorConverter.h"
#include "ColorImageConverter.h"
#include "Drawable.h"
#include "DrawableFactory.h"
#include "IFragment.h"
#include "IOSClass.h"
#include "J2ObjC_source.h"
#include "PluginInvoker.h"
#include "ResourceBundleUtils.h"
#include "java/lang/RuntimeException.h"
#include "java/util/List.h"
#include "java/util/Map.h"
#include "java/util/regex/Matcher.h"
#include "java/util/regex/Pattern.h"


@interface ASColorImageConverter ()

- (id)nativeLoadImageBundleWithNSString:(NSString *)path;

- (jboolean)isImageWithId:(id)objImage;

- (NSString *)imageAsBase64WithId:(id)objImage;

@end

__attribute__((unused)) static id ASColorImageConverter_nativeLoadImageBundleWithNSString_(ASColorImageConverter *self, NSString *path);

__attribute__((unused)) static jboolean ASColorImageConverter_isImageWithId_(ASColorImageConverter *self, id objImage);

__attribute__((unused)) static NSString *ASColorImageConverter_imageAsBase64WithId_(ASColorImageConverter *self, id objImage);

@implementation ASColorImageConverter

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASColorImageConverter_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (id)convertFromWithId:(NSString *)value
        withJavaUtilMap:(id<JavaUtilMap>)dependentAttributesMap
        withASIFragment:(id<ASIFragment>)fragment {
  if (value == nil) {
    return nil;
  }
  if ([value isEqual:@"@null"]) {
    return @"@null";
  }
  if ([value java_hasPrefix:@"#"] || [value java_hasPrefix:@"@color/"]) {
    return [super convertFromWithId:value withJavaUtilMap:dependentAttributesMap withASIFragment:fragment];
  }
  else if ([value java_hasPrefix:@"@drawable/"]) {
    JavaUtilRegexPattern *pattern = JavaUtilRegexPattern_compileWithNSString_(@"@([a-z0-9_\\-]+)\\/([a-z0-9_\\-]+)");
    JavaUtilRegexMatcher *matcher = [((JavaUtilRegexPattern *) nil_chk(pattern)) matcherWithJavaLangCharSequence:value];
    jboolean matches = [((JavaUtilRegexMatcher *) nil_chk(matcher)) matches];
    if (matches) {
      NSString *fileName = [matcher groupWithInt:2];
      NSString *key1 = [value java_replaceFirst:@"@drawable/" withReplacement:@""];
      NSString *extKey = JreStrcat("$$", fileName, @"_ext");
      NSString *fileExtension = ASResourceBundleUtils_getStringWithNSString_withNSString_withASIFragment_(@"drawable/drawable", extKey, fragment);
      if (fileExtension == nil) {
        fileExtension = @"png";
      }
      if (fileExtension != nil && [fileExtension isEqual:@"xml"]) {
        NSString *json = ASResourceBundleUtils_getStringWithNSString_withNSString_withASIFragment_(@"drawable/drawable", fileName, fragment);
        id<JavaUtilMap> drawable = ASPluginInvoker_unmarshalWithNSString_withIOSClass_(json, JavaUtilMap_class_());
        return ASDrawableFactory_getDrawableWithNSString_withJavaUtilMap_withJavaUtilMap_withASIFragment_(@"colorimage", drawable, dependentAttributesMap, fragment);
      }
      else {
        if ([fileExtension isEqual:@"9.png"]) {
          key1 = JreStrcat("$$", key1, @"_9");
          fileExtension = @"png";
        }
        NSString *path = JreStrcat("$C$", key1, '.', fileExtension);
        return ASColorImageConverter_nativeLoadImageBundleWithNSString_(self, JreStrcat("$$", @"drawable-ios/", path));
      }
    }
  }
  else if ([value java_hasPrefix:@"data:image/png;base64,"]) {
    NSString *pureBase64Encoded = [value java_substring:[value java_indexOfString:@","] + 1];
    return ASColorImageConverter_getImageFromBase64WithId_(pureBase64Encoded);
  }
  @throw new_JavaLangRuntimeException_initWithNSString_(JreStrcat("$$", @"Unable to convert path to image : ", value));
}

+ (id)getImageFromBase64WithId:(id)strEncoded {
  return ASColorImageConverter_getImageFromBase64WithId_(strEncoded);
}

- (id)nativeLoadImageBundleWithNSString:(NSString *)path {
  return ASColorImageConverter_nativeLoadImageBundleWithNSString_(self, path);
}

- (NSString *)convertToWithId:(id)value
              withASIFragment:(id<ASIFragment>)fragment {
  if (ASColorImageConverter_isImageWithId_(self, value) || [value isKindOfClass:[ADDrawable class]]) {
    if ([value isKindOfClass:[ADDrawable class]]) {
      value = [((ADDrawable *) nil_chk(((ADDrawable *) value))) getDrawable];
    }
    return ASColorImageConverter_imageAsBase64WithId_(self, value);
  }
  else {
    return [self colorToStringWithId:value];
  }
}

- (jboolean)isImageWithId:(id)objImage {
  return ASColorImageConverter_isImageWithId_(self, objImage);
}

- (NSString *)imageAsBase64WithId:(id)objImage {
  return ASColorImageConverter_imageAsBase64WithId_(self, objImage);
}

- (NSString *)colorToStringWithId:(id)color {
  CGFloat red, green, blue, alpha;
  [((UIColor*) color) getRed:&red green:&green blue:&blue alpha:&alpha];
  return [[NSString stringWithFormat:@"#%02x%02x%02x", (int)(red * 255), (int)(green * 255) , (int)(blue * 255)] uppercaseString];
}

- (id<JavaUtilList>)getDependentAttributes {
  return nil;
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, 0, 1, -1, 2, -1, -1 },
    { NULL, "LNSObject;", 0x109, 3, 4, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x102, 5, 6, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, 7, 8, -1, -1, -1, -1 },
    { NULL, "Z", 0x102, 9, 4, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x102, 10, 4, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x101, 11, 4, -1, -1, -1, -1 },
    { NULL, "LJavaUtilList;", 0x1, -1, -1, -1, 12, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(convertFromWithId:withJavaUtilMap:withASIFragment:);
  methods[2].selector = @selector(getImageFromBase64WithId:);
  methods[3].selector = @selector(nativeLoadImageBundleWithNSString:);
  methods[4].selector = @selector(convertToWithId:withASIFragment:);
  methods[5].selector = @selector(isImageWithId:);
  methods[6].selector = @selector(imageAsBase64WithId:);
  methods[7].selector = @selector(colorToStringWithId:);
  methods[8].selector = @selector(getDependentAttributes);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "convertFrom", "LNSString;LJavaUtilMap;LASIFragment;", "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Lcom/ashera/core/IFragment;)Ljava/lang/Object;", "getImageFromBase64", "LNSObject;", "nativeLoadImageBundle", "LNSString;", "convertTo", "LNSObject;LASIFragment;", "isImage", "imageAsBase64", "colorToString", "()Ljava/util/List<Ljava/lang/String;>;" };
  static const J2ObjcClassInfo _ASColorImageConverter = { "ColorImageConverter", "com.ashera.converter", ptrTable, methods, NULL, 7, 0x1, 9, 0, -1, -1, -1, -1, -1 };
  return &_ASColorImageConverter;
}

@end

void ASColorImageConverter_init(ASColorImageConverter *self) {
  ASColorConverter_init(self);
}

ASColorImageConverter *new_ASColorImageConverter_init() {
  J2OBJC_NEW_IMPL(ASColorImageConverter, init)
}

ASColorImageConverter *create_ASColorImageConverter_init() {
  J2OBJC_CREATE_IMPL(ASColorImageConverter, init)
}

id ASColorImageConverter_getImageFromBase64WithId_(id strEncoded) {
  ASColorImageConverter_initialize();
  NSData *dataEncoded = [[NSData alloc] initWithBase64EncodedString:strEncoded  options:0];
  UIImage *image = [UIImage imageWithData:dataEncoded];
  return image;
}

id ASColorImageConverter_nativeLoadImageBundleWithNSString_(ASColorImageConverter *self, NSString *path) {
  return [UIImage imageNamed:path];
}

jboolean ASColorImageConverter_isImageWithId_(ASColorImageConverter *self, id objImage) {
  return [objImage isKindOfClass:[UIImage class]];
}

NSString *ASColorImageConverter_imageAsBase64WithId_(ASColorImageConverter *self, id objImage) {
  NSData *imageData = UIImagePNGRepresentation(objImage);
  NSString * base64String = [imageData base64EncodedStringWithOptions:0];
  return [NSString stringWithFormat:@"data:image/png;base64,%@", base64String];
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASColorImageConverter)
