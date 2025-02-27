//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\IOSJSONAdapter\src\main\java\com\ashera\jsonadapter\JSONAdapter.java
//

#include "J2ObjC_source.h"
#include "JSONAdapter.h"


@interface ASJSONAdapter : NSObject

@end

@implementation ASJSONAdapter

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "LJavaUtilMap;", 0x401, 0, 1, -1, 2, -1, -1 },
    { NULL, "LNSObject;", 0x401, 3, 4, -1, 5, -1, -1 },
    { NULL, "V", 0x401, 6, 7, -1, 8, -1, -1 },
    { NULL, "[LNSObject;", 0x401, 9, 1, -1, -1, -1, -1 },
    { NULL, "LJavaUtilList;", 0x401, 10, 1, -1, 11, -1, -1 },
    { NULL, "Z", 0x401, 12, 1, -1, -1, -1, -1 },
    { NULL, "LJavaLangBoolean;", 0x401, 13, 1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x401, 14, 1, -1, -1, -1, -1 },
    { NULL, "LJavaLangInteger;", 0x401, 15, 1, -1, -1, -1, -1 },
    { NULL, "LJavaLangFloat;", 0x401, 16, 1, -1, -1, -1, -1 },
    { NULL, "LJavaLangDouble;", 0x401, 17, 1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x401, 18, 1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x401, 19, 1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x401, 20, 21, -1, 22, -1, -1 },
    { NULL, "LJavaUtilMap;", 0x401, -1, -1, -1, 23, -1, -1 },
    { NULL, "LNSObject;", 0x401, 24, 1, -1, -1, -1, -1 },
    { NULL, "Z", 0x401, 25, 1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(getMapWithId:);
  methods[1].selector = @selector(getNativeMapWithJavaUtilMap:);
  methods[2].selector = @selector(putJSONSafeObjectIntoMapWithJavaUtilMap:withNSString:withId:);
  methods[3].selector = @selector(getArrayWithId:);
  methods[4].selector = @selector(getListWithId:);
  methods[5].selector = @selector(isBooleanWithId:);
  methods[6].selector = @selector(getBooleanWithId:);
  methods[7].selector = @selector(getStringWithId:);
  methods[8].selector = @selector(getIntWithId:);
  methods[9].selector = @selector(getFloatWithId:);
  methods[10].selector = @selector(getDoubleWithId:);
  methods[11].selector = @selector(marshalWithId:);
  methods[12].selector = @selector(toJsonTreeWithId:);
  methods[13].selector = @selector(unmarshalWithNSString:withIOSClass:);
  methods[14].selector = @selector(getJSONCompatMap);
  methods[15].selector = @selector(getJSONSafeObjWithId:);
  methods[16].selector = @selector(isNullWithId:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "getMap", "LNSObject;", "(Ljava/lang/Object;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", "getNativeMap", "LJavaUtilMap;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljava/lang/Object;", "putJSONSafeObjectIntoMap", "LJavaUtilMap;LNSString;LNSObject;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/lang/String;Ljava/lang/Object;)V", "getArray", "getList", "(Ljava/lang/Object;)Ljava/util/List<Ljava/lang/Object;>;", "isBoolean", "getBoolean", "getString", "getInt", "getFloat", "getDouble", "marshal", "toJsonTree", "unmarshal", "LNSString;LIOSClass;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TT;>;)TT;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", "getJSONSafeObj", "isNull" };
  static const J2ObjcClassInfo _ASJSONAdapter = { "JSONAdapter", "com.ashera.jsonadapter", ptrTable, methods, NULL, 7, 0x609, 17, 0, -1, -1, -1, -1, -1 };
  return &_ASJSONAdapter;
}

@end

J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ASJSONAdapter)
