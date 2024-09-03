//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\IOSConverter\src\main\java\com\ashera\converter\ColorIntConverter.java
//

#include "Color.h"
#include "ColorIntConverter.h"
#include "ColorUtil.h"
#include "IFragment.h"
#include "J2ObjC_source.h"
#include "ResourceBundleUtils.h"
#include "java/lang/Integer.h"
#include "java/util/List.h"
#include "java/util/Map.h"
#include "java/util/ResourceBundle.h"


@implementation ASColorIntConverter

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASColorIntConverter_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (JavaLangInteger *)convertFromWithId:(NSString *)value
                       withJavaUtilMap:(id<JavaUtilMap>)dependentAttributesMap
                       withASIFragment:(id<ASIFragment>)fragment {
  if (value == nil) {
    return nil;
  }
  NSString *color = ASResourceBundleUtils_getStringWithNSString_withNSString_withNSString_withASIFragment_(@"color/color", @"color", value, fragment);
  return JavaLangInteger_valueOfWithInt_(ADColor_parseColorWithNSString_(ASColorUtil_colorToHexWithNSString_(color)));
}

- (NSString *)convertToWithId:(JavaLangInteger *)value
              withASIFragment:(id<ASIFragment>)fragment {
  return ASColorUtil_getColorStringWithInt_([((JavaLangInteger *) nil_chk(value)) intValue]);
}

- (id<JavaUtilList>)getDependentAttributes {
  return nil;
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LJavaLangInteger;", 0x1, 0, 1, -1, 2, -1, -1 },
    { NULL, "LNSString;", 0x1, 3, 4, -1, -1, -1, -1 },
    { NULL, "LJavaUtilList;", 0x1, -1, -1, -1, 5, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(convertFromWithId:withJavaUtilMap:withASIFragment:);
  methods[2].selector = @selector(convertToWithId:withASIFragment:);
  methods[3].selector = @selector(getDependentAttributes);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "resourceBundle_", "LJavaUtilResourceBundle;", .constantValue.asLong = 0, 0x0, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "convertFrom", "LNSString;LJavaUtilMap;LASIFragment;", "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Lcom/ashera/core/IFragment;)Ljava/lang/Integer;", "convertTo", "LJavaLangInteger;LASIFragment;", "()Ljava/util/List<Ljava/lang/String;>;", "Ljava/lang/Object;Lcom/ashera/converter/IConverter<Ljava/lang/Integer;Ljava/lang/String;>;" };
  static const J2ObjcClassInfo _ASColorIntConverter = { "ColorIntConverter", "com.ashera.converter", ptrTable, methods, fields, 7, 0x1, 4, 1, -1, -1, -1, 6, -1 };
  return &_ASColorIntConverter;
}

@end

void ASColorIntConverter_init(ASColorIntConverter *self) {
  NSObject_init(self);
}

ASColorIntConverter *new_ASColorIntConverter_init() {
  J2OBJC_NEW_IMPL(ASColorIntConverter, init)
}

ASColorIntConverter *create_ASColorIntConverter_init() {
  J2OBJC_CREATE_IMPL(ASColorIntConverter, init)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASColorIntConverter)
