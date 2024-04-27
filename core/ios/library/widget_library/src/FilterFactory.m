//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\converter\FilterFactory.java
//

#include "FilterFactory.h"
#include "IFilter.h"
#include "IOSClass.h"
#include "J2ObjC_source.h"
#include "LowerCasePrefixFilter.h"
#include "java/util/HashMap.h"
#include "java/util/Map.h"

@protocol JavaUtilMap;


inline id<JavaUtilMap> ASFilterFactory_get_registrationMap(void);
inline id<JavaUtilMap> ASFilterFactory_set_registrationMap(id<JavaUtilMap> value);
static id<JavaUtilMap> ASFilterFactory_registrationMap;
J2OBJC_STATIC_FIELD_OBJ(ASFilterFactory, registrationMap, id<JavaUtilMap>)

J2OBJC_INITIALIZED_DEFN(ASFilterFactory)

NSString *ASFilterFactory_DEFAULT_FILTER;

@implementation ASFilterFactory

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASFilterFactory_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

+ (id<ASIFilter>)getWithNSString:(NSString *)localname {
  return ASFilterFactory_getWithNSString_(localname);
}

+ (void)register__WithNSString:(NSString *)localname
                 withASIFilter:(id<ASIFilter>)converter {
  ASFilterFactory_register__WithNSString_withASIFilter_(localname, converter);
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LASIFilter;", 0x9, 0, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 2, 3, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(getWithNSString:);
  methods[2].selector = @selector(register__WithNSString:withASIFilter:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "DEFAULT_FILTER", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 4, -1, -1 },
    { "registrationMap", "LJavaUtilMap;", .constantValue.asLong = 0, 0xa, -1, 5, 6, -1 },
  };
  static const void *ptrTable[] = { "get", "LNSString;", "register", "LNSString;LASIFilter;", &ASFilterFactory_DEFAULT_FILTER, &ASFilterFactory_registrationMap, "Ljava/util/Map<Ljava/lang/String;Lcom/ashera/converter/IFilter;>;" };
  static const J2ObjcClassInfo _ASFilterFactory = { "FilterFactory", "com.ashera.converter", ptrTable, methods, fields, 7, 0x1, 3, 2, -1, -1, -1, -1, -1 };
  return &_ASFilterFactory;
}

+ (void)initialize {
  if (self == [ASFilterFactory class]) {
    JreStrongAssign(&ASFilterFactory_DEFAULT_FILTER, [ASLowerCasePrefixFilter_class_() getName]);
    JreStrongAssignAndConsume(&ASFilterFactory_registrationMap, new_JavaUtilHashMap_init());
    {
      ASFilterFactory_register__WithNSString_withASIFilter_(ASFilterFactory_DEFAULT_FILTER, create_ASLowerCasePrefixFilter_init());
    }
    J2OBJC_SET_INITIALIZED(ASFilterFactory)
  }
}

@end

void ASFilterFactory_init(ASFilterFactory *self) {
  NSObject_init(self);
}

ASFilterFactory *new_ASFilterFactory_init() {
  J2OBJC_NEW_IMPL(ASFilterFactory, init)
}

ASFilterFactory *create_ASFilterFactory_init() {
  J2OBJC_CREATE_IMPL(ASFilterFactory, init)
}

id<ASIFilter> ASFilterFactory_getWithNSString_(NSString *localname) {
  ASFilterFactory_initialize();
  id<ASIFilter> converter = JreRetainedLocalValue([((id<JavaUtilMap>) nil_chk(ASFilterFactory_registrationMap)) getWithId:localname]);
  if (converter != nil) {
    return converter;
  }
  return nil;
}

void ASFilterFactory_register__WithNSString_withASIFilter_(NSString *localname, id<ASIFilter> converter) {
  ASFilterFactory_initialize();
  [((id<JavaUtilMap>) nil_chk(ASFilterFactory_registrationMap)) putWithId:localname withId:converter];
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASFilterFactory)
