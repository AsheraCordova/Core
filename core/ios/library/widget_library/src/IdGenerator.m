//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\widget\IdGenerator.java
//

#include "IdGenerator.h"
#include "J2ObjC_source.h"
#include "java/lang/Integer.h"
#include "java/util/HashMap.h"
#include "java/util/Map.h"
#include "java/util/concurrent/atomic/AtomicInteger.h"

@class JavaUtilConcurrentAtomicAtomicInteger;
@protocol JavaUtilMap;


inline JavaUtilConcurrentAtomicAtomicInteger *ASIdGenerator_get_sNextGeneratedId(void);
static JavaUtilConcurrentAtomicAtomicInteger *ASIdGenerator_sNextGeneratedId;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASIdGenerator, sNextGeneratedId, JavaUtilConcurrentAtomicAtomicInteger *)

inline id<JavaUtilMap> ASIdGenerator_get_idMap(void);
inline id<JavaUtilMap> ASIdGenerator_set_idMap(id<JavaUtilMap> value);
static id<JavaUtilMap> ASIdGenerator_idMap;
J2OBJC_STATIC_FIELD_OBJ(ASIdGenerator, idMap, id<JavaUtilMap>)

inline id<JavaUtilMap> ASIdGenerator_get_reverseMap(void);
inline id<JavaUtilMap> ASIdGenerator_set_reverseMap(id<JavaUtilMap> value);
static id<JavaUtilMap> ASIdGenerator_reverseMap;
J2OBJC_STATIC_FIELD_OBJ(ASIdGenerator, reverseMap, id<JavaUtilMap>)

J2OBJC_INITIALIZED_DEFN(ASIdGenerator)

@implementation ASIdGenerator

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASIdGenerator_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

+ (NSString *)getNameWithInt:(jint)id_ {
  return ASIdGenerator_getNameWithInt_(id_);
}

+ (void)setIdWithNSString:(NSString *)name
                  withInt:(jint)id_ {
  ASIdGenerator_setIdWithNSString_withInt_(name, id_);
}

+ (jint)getIdWithNSString:(NSString *)id_ {
  return ASIdGenerator_getIdWithNSString_(id_);
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x9, 0, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 2, 3, -1, -1, -1, -1 },
    { NULL, "I", 0x9, 4, 5, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(getNameWithInt:);
  methods[2].selector = @selector(setIdWithNSString:withInt:);
  methods[3].selector = @selector(getIdWithNSString:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "sNextGeneratedId", "LJavaUtilConcurrentAtomicAtomicInteger;", .constantValue.asLong = 0, 0x1a, -1, 6, -1, -1 },
    { "idMap", "LJavaUtilMap;", .constantValue.asLong = 0, 0xa, -1, 7, 8, -1 },
    { "reverseMap", "LJavaUtilMap;", .constantValue.asLong = 0, 0xa, -1, 9, 10, -1 },
  };
  static const void *ptrTable[] = { "getName", "I", "setId", "LNSString;I", "getId", "LNSString;", &ASIdGenerator_sNextGeneratedId, &ASIdGenerator_idMap, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;", &ASIdGenerator_reverseMap, "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;" };
  static const J2ObjcClassInfo _ASIdGenerator = { "IdGenerator", "com.ashera.widget", ptrTable, methods, fields, 7, 0x1, 4, 3, -1, -1, -1, -1, -1 };
  return &_ASIdGenerator;
}

+ (void)initialize {
  if (self == [ASIdGenerator class]) {
    JreStrongAssignAndConsume(&ASIdGenerator_sNextGeneratedId, new_JavaUtilConcurrentAtomicAtomicInteger_initWithInt_(1));
    JreStrongAssignAndConsume(&ASIdGenerator_idMap, new_JavaUtilHashMap_init());
    JreStrongAssignAndConsume(&ASIdGenerator_reverseMap, new_JavaUtilHashMap_init());
    J2OBJC_SET_INITIALIZED(ASIdGenerator)
  }
}

@end

void ASIdGenerator_init(ASIdGenerator *self) {
  NSObject_init(self);
}

ASIdGenerator *new_ASIdGenerator_init() {
  J2OBJC_NEW_IMPL(ASIdGenerator, init)
}

ASIdGenerator *create_ASIdGenerator_init() {
  J2OBJC_CREATE_IMPL(ASIdGenerator, init)
}

NSString *ASIdGenerator_getNameWithInt_(jint id_) {
  ASIdGenerator_initialize();
  return [((id<JavaUtilMap>) nil_chk(ASIdGenerator_reverseMap)) getWithId:JavaLangInteger_valueOfWithInt_(id_)];
}

void ASIdGenerator_setIdWithNSString_withInt_(NSString *name, jint id_) {
  ASIdGenerator_initialize();
  [((id<JavaUtilMap>) nil_chk(ASIdGenerator_idMap)) putWithId:name withId:JavaLangInteger_valueOfWithInt_(id_)];
  [((id<JavaUtilMap>) nil_chk(ASIdGenerator_reverseMap)) putWithId:JavaLangInteger_valueOfWithInt_(id_) withId:name];
}

jint ASIdGenerator_getIdWithNSString_(NSString *id_) {
  ASIdGenerator_initialize();
  if (id_ != nil && [id_ java_hasPrefix:@"@id/"]) {
    id_ = JreStrcat("$$", @"@+id/", [id_ java_substring:4]);
  }
  if ([((id<JavaUtilMap>) nil_chk(ASIdGenerator_idMap)) containsKeyWithId:id_]) {
    return [((JavaLangInteger *) nil_chk([((id<JavaUtilMap>) nil_chk(ASIdGenerator_idMap)) getWithId:id_])) intValue];
  }
  for (; ; ) {
    jint result = [((JavaUtilConcurrentAtomicAtomicInteger *) nil_chk(ASIdGenerator_sNextGeneratedId)) get];
    jint newValue = result + 1;
    if (newValue > (jint) 0x00FFFFFF) newValue = 1;
    if ([ASIdGenerator_sNextGeneratedId compareAndSetWithInt:result withInt:newValue]) {
      [((id<JavaUtilMap>) nil_chk(ASIdGenerator_idMap)) putWithId:id_ withId:JavaLangInteger_valueOfWithInt_(result)];
      [((id<JavaUtilMap>) nil_chk(ASIdGenerator_reverseMap)) putWithId:JavaLangInteger_valueOfWithInt_(result) withId:id_];
      return result;
    }
  }
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASIdGenerator)
