//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\os\Bundle.java
//

#include "Bundle.h"
#include "J2ObjC_source.h"
#include "java/lang/Integer.h"
#include "java/util/HashMap.h"

@class JavaUtilHashMap;


@interface ADBundle () {
 @public
  JavaUtilHashMap *mExtras_;
}

@end

J2OBJC_FIELD_SETTER(ADBundle, mExtras_, JavaUtilHashMap *)

@implementation ADBundle

- (instancetype)initWithADBundle:(ADBundle *)data {
  ADBundle_initWithADBundle_(self, data);
  return self;
}

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADBundle_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (void)putSerializableWithNSString:(NSString *)name
                             withId:(id)value {
  [self putObjectWithNSString:name withId:value];
}

- (void)putObjectWithNSString:(NSString *)name
                       withId:(id)value {
  if (mExtras_ == nil) {
    JreStrongAssignAndConsume(&mExtras_, new_JavaUtilHashMap_init());
  }
  [mExtras_ putWithId:name withId:value];
}

- (id)getWithNSString:(NSString *)key {
  if (mExtras_ == nil) {
    return nil;
  }
  return [mExtras_ getWithId:key];
}

- (ADBundle *)getBundleWithNSString:(NSString *)name {
  return (ADBundle *) cast_chk([self getWithNSString:name], [ADBundle class]);
}

- (void)putIntWithNSString:(NSString *)name
                   withInt:(jint)value {
  [self putObjectWithNSString:name withId:JavaLangInteger_valueOfWithInt_(value)];
}

- (void)putStringWithNSString:(NSString *)name
                 withNSString:(NSString *)value {
  [self putObjectWithNSString:name withId:value];
}

- (void)putBundleWithNSString:(NSString *)name
                 withNSString:(NSString *)value {
  [self putObjectWithNSString:name withId:value];
}

- (NSString *)getStringWithNSString:(NSString *)name {
  return (NSString *) cast_chk([self getWithNSString:name], [NSString class]);
}

- (void)putBundleWithNSString:(NSString *)name
                 withADBundle:(ADBundle *)onSaveInstanceState {
}

- (id)getSerializableWithNSString:(NSString *)key {
  return [self getWithNSString:key];
}

- (jint)getIntWithNSString:(NSString *)key {
  id object = JreRetainedLocalValue([self getWithNSString:key]);
  return object == nil ? 0 : [(JavaLangInteger *) cast_chk(object, [JavaLangInteger class]) intValue];
}

- (id)java_clone {
  return nil;
}

- (void)dealloc {
  RELEASE_(mExtras_);
  [super dealloc];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, 0, -1, -1, -1, -1 },
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 1, 2, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 3, 2, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, 4, 5, -1, -1, -1, -1 },
    { NULL, "LADBundle;", 0x1, 6, 5, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 7, 8, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 9, 10, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 11, 10, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, 12, 5, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 11, 13, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, 14, 5, -1, -1, -1, -1 },
    { NULL, "I", 0x1, 15, 5, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, 16, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(initWithADBundle:);
  methods[1].selector = @selector(init);
  methods[2].selector = @selector(putSerializableWithNSString:withId:);
  methods[3].selector = @selector(putObjectWithNSString:withId:);
  methods[4].selector = @selector(getWithNSString:);
  methods[5].selector = @selector(getBundleWithNSString:);
  methods[6].selector = @selector(putIntWithNSString:withInt:);
  methods[7].selector = @selector(putStringWithNSString:withNSString:);
  methods[8].selector = @selector(putBundleWithNSString:withNSString:);
  methods[9].selector = @selector(getStringWithNSString:);
  methods[10].selector = @selector(putBundleWithNSString:withADBundle:);
  methods[11].selector = @selector(getSerializableWithNSString:);
  methods[12].selector = @selector(getIntWithNSString:);
  methods[13].selector = @selector(java_clone);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "mExtras_", "LJavaUtilHashMap;", .constantValue.asLong = 0, 0x2, -1, -1, 17, -1 },
  };
  static const void *ptrTable[] = { "LADBundle;", "putSerializable", "LNSString;LNSObject;", "putObject", "get", "LNSString;", "getBundle", "putInt", "LNSString;I", "putString", "LNSString;LNSString;", "putBundle", "getString", "LNSString;LADBundle;", "getSerializable", "getInt", "clone", "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" };
  static const J2ObjcClassInfo _ADBundle = { "Bundle", "r.android.os", ptrTable, methods, fields, 7, 0x1, 14, 1, -1, -1, -1, -1, -1 };
  return &_ADBundle;
}

@end

void ADBundle_initWithADBundle_(ADBundle *self, ADBundle *data) {
  NSObject_init(self);
}

ADBundle *new_ADBundle_initWithADBundle_(ADBundle *data) {
  J2OBJC_NEW_IMPL(ADBundle, initWithADBundle_, data)
}

ADBundle *create_ADBundle_initWithADBundle_(ADBundle *data) {
  J2OBJC_CREATE_IMPL(ADBundle, initWithADBundle_, data)
}

void ADBundle_init(ADBundle *self) {
  NSObject_init(self);
}

ADBundle *new_ADBundle_init() {
  J2OBJC_NEW_IMPL(ADBundle, init)
}

ADBundle *create_ADBundle_init() {
  J2OBJC_CREATE_IMPL(ADBundle, init)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADBundle)
