//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\converter\ConverterFactory.java
//

#include "AttributeCommand.h"
#include "ConverterFactory.h"
#include "IConverter.h"
#include "IOSObjectArray.h"
#include "J2ObjC_source.h"
#include "java/util/HashMap.h"
#include "java/util/Map.h"

@protocol JavaUtilMap;


inline id<JavaUtilMap> ASConverterFactory_get_registrationMap(void);
inline id<JavaUtilMap> ASConverterFactory_set_registrationMap(id<JavaUtilMap> value);
static id<JavaUtilMap> ASConverterFactory_registrationMap;
J2OBJC_STATIC_FIELD_OBJ(ASConverterFactory, registrationMap, id<JavaUtilMap>)

inline id<JavaUtilMap> ASConverterFactory_get_commandConverters(void);
inline id<JavaUtilMap> ASConverterFactory_set_commandConverters(id<JavaUtilMap> value);
static id<JavaUtilMap> ASConverterFactory_commandConverters;
J2OBJC_STATIC_FIELD_OBJ(ASConverterFactory, commandConverters, id<JavaUtilMap>)

J2OBJC_INITIALIZED_DEFN(ASConverterFactory)

@implementation ASConverterFactory

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASConverterFactory_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

+ (id<ASIConverter>)getWithNSString:(NSString *)localname {
  return ASConverterFactory_getWithNSString_(localname);
}

+ (void)register__WithNSString:(NSString *)localname
              withASIConverter:(id<ASIConverter>)converter {
  ASConverterFactory_register__WithNSString_withASIConverter_(localname, converter);
}

+ (id<ASAttributeCommand>)getCommandConverterWithNSString:(NSString *)localname
                                        withNSObjectArray:(IOSObjectArray *)args {
  return ASConverterFactory_getCommandConverterWithNSString_withNSObjectArray_(localname, args);
}

+ (void)registerCommandConverterWithASAttributeCommand:(id<ASAttributeCommand>)converter {
  ASConverterFactory_registerCommandConverterWithASAttributeCommand_(converter);
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LASIConverter;", 0x9, 0, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 2, 3, -1, -1, -1, -1 },
    { NULL, "LASAttributeCommand;", 0x89, 4, 5, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 6, 7, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(getWithNSString:);
  methods[2].selector = @selector(register__WithNSString:withASIConverter:);
  methods[3].selector = @selector(getCommandConverterWithNSString:withNSObjectArray:);
  methods[4].selector = @selector(registerCommandConverterWithASAttributeCommand:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "registrationMap", "LJavaUtilMap;", .constantValue.asLong = 0, 0xa, -1, 8, 9, -1 },
    { "commandConverters", "LJavaUtilMap;", .constantValue.asLong = 0, 0xa, -1, 10, 11, -1 },
  };
  static const void *ptrTable[] = { "get", "LNSString;", "register", "LNSString;LASIConverter;", "getCommandConverter", "LNSString;[LNSObject;", "registerCommandConverter", "LASAttributeCommand;", &ASConverterFactory_registrationMap, "Ljava/util/Map<Ljava/lang/String;Lcom/ashera/converter/IConverter;>;", &ASConverterFactory_commandConverters, "Ljava/util/Map<Ljava/lang/String;Lcom/ashera/widget/AttributeCommand;>;" };
  static const J2ObjcClassInfo _ASConverterFactory = { "ConverterFactory", "com.ashera.converter", ptrTable, methods, fields, 7, 0x1, 5, 2, -1, -1, -1, -1, -1 };
  return &_ASConverterFactory;
}

+ (void)initialize {
  if (self == [ASConverterFactory class]) {
    JreStrongAssignAndConsume(&ASConverterFactory_registrationMap, new_JavaUtilHashMap_init());
    JreStrongAssignAndConsume(&ASConverterFactory_commandConverters, new_JavaUtilHashMap_init());
    J2OBJC_SET_INITIALIZED(ASConverterFactory)
  }
}

@end

void ASConverterFactory_init(ASConverterFactory *self) {
  NSObject_init(self);
}

ASConverterFactory *new_ASConverterFactory_init() {
  J2OBJC_NEW_IMPL(ASConverterFactory, init)
}

ASConverterFactory *create_ASConverterFactory_init() {
  J2OBJC_CREATE_IMPL(ASConverterFactory, init)
}

id<ASIConverter> ASConverterFactory_getWithNSString_(NSString *localname) {
  ASConverterFactory_initialize();
  id<ASIConverter> converter = JreRetainedLocalValue([((id<JavaUtilMap>) nil_chk(ASConverterFactory_registrationMap)) getWithId:localname]);
  if (converter != nil) {
    return converter;
  }
  return nil;
}

void ASConverterFactory_register__WithNSString_withASIConverter_(NSString *localname, id<ASIConverter> converter) {
  ASConverterFactory_initialize();
  [((id<JavaUtilMap>) nil_chk(ASConverterFactory_registrationMap)) putWithId:localname withId:converter];
}

id<ASAttributeCommand> ASConverterFactory_getCommandConverterWithNSString_withNSObjectArray_(NSString *localname, IOSObjectArray *args) {
  ASConverterFactory_initialize();
  id<ASAttributeCommand> converter = JreRetainedLocalValue([((id<JavaUtilMap>) nil_chk(ASConverterFactory_commandConverters)) getWithId:localname]);
  if (converter != nil) {
    return [converter newInstanceWithNSObjectArray:args];
  }
  return nil;
}

void ASConverterFactory_registerCommandConverterWithASAttributeCommand_(id<ASAttributeCommand> converter) {
  ASConverterFactory_initialize();
  [((id<JavaUtilMap>) nil_chk(ASConverterFactory_commandConverters)) putWithId:[((id<ASAttributeCommand>) nil_chk(converter)) getId] withId:converter];
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASConverterFactory)
