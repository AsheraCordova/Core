//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\Plugin_Converter\src\com\ashera\converter\GravityConverter.java
//

#include "AbstractBitFlagConverter.h"
#include "GravityConverter.h"
#include "IOSClass.h"
#include "IOSObjectArray.h"
#include "J2ObjC_source.h"
#include "java/lang/Integer.h"
#include "java/util/Arrays.h"
#include "java/util/Collection.h"
#include "java/util/HashMap.h"
#include "java/util/List.h"
#include "java/util/Map.h"

@protocol JavaUtilMap;


inline id<JavaUtilMap> ASGravityConverter_get_gravityMap(void);
inline id<JavaUtilMap> ASGravityConverter_set_gravityMap(id<JavaUtilMap> value);
static id<JavaUtilMap> ASGravityConverter_gravityMap;
J2OBJC_STATIC_FIELD_OBJ(ASGravityConverter, gravityMap, id<JavaUtilMap>)

J2OBJC_INITIALIZED_DEFN(ASGravityConverter)

@implementation ASGravityConverter

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASGravityConverter_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (id<JavaUtilMap>)getMapping {
  return ASGravityConverter_gravityMap;
}

- (JavaLangInteger *)getDefault {
  return JavaLangInteger_valueOfWithInt_(ASGravityConverter_NO_GRAVITY);
}

- (id<JavaUtilCollection>)getReverseMappingFlags {
  return JavaUtilArrays_asListWithNSObjectArray_([IOSObjectArray arrayWithObjects:(id[]){ JavaLangInteger_valueOfWithInt_(ASGravityConverter_VERTICAL_GRAVITY_MASK), JavaLangInteger_valueOfWithInt_(ASGravityConverter_HORIZONTAL_GRAVITY_MASK), JavaLangInteger_valueOfWithInt_(ASGravityConverter_CLIP_VERTICAL), JavaLangInteger_valueOfWithInt_(ASGravityConverter_CLIP_HORIZONTAL) } count:4 type:JavaLangInteger_class_()]);
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LJavaUtilMap;", 0x1, -1, -1, -1, 0, -1, -1 },
    { NULL, "LJavaLangInteger;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LJavaUtilCollection;", 0x1, -1, -1, -1, 1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(getMapping);
  methods[2].selector = @selector(getDefault);
  methods[3].selector = @selector(getReverseMappingFlags);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "gravityMap", "LJavaUtilMap;", .constantValue.asLong = 0, 0xa, -1, 2, 3, -1 },
    { "NO_GRAVITY", "I", .constantValue.asInt = ASGravityConverter_NO_GRAVITY, 0x19, -1, -1, -1, -1 },
    { "AXIS_SPECIFIED", "I", .constantValue.asInt = ASGravityConverter_AXIS_SPECIFIED, 0x19, -1, -1, -1, -1 },
    { "AXIS_PULL_BEFORE", "I", .constantValue.asInt = ASGravityConverter_AXIS_PULL_BEFORE, 0x19, -1, -1, -1, -1 },
    { "AXIS_PULL_AFTER", "I", .constantValue.asInt = ASGravityConverter_AXIS_PULL_AFTER, 0x19, -1, -1, -1, -1 },
    { "AXIS_CLIP", "I", .constantValue.asInt = ASGravityConverter_AXIS_CLIP, 0x19, -1, -1, -1, -1 },
    { "AXIS_X_SHIFT", "I", .constantValue.asInt = ASGravityConverter_AXIS_X_SHIFT, 0x19, -1, -1, -1, -1 },
    { "AXIS_Y_SHIFT", "I", .constantValue.asInt = ASGravityConverter_AXIS_Y_SHIFT, 0x19, -1, -1, -1, -1 },
    { "TOP", "I", .constantValue.asInt = ASGravityConverter_TOP, 0x19, -1, -1, -1, -1 },
    { "BOTTOM", "I", .constantValue.asInt = ASGravityConverter_BOTTOM, 0x19, -1, -1, -1, -1 },
    { "LEFT", "I", .constantValue.asInt = ASGravityConverter_LEFT, 0x19, -1, -1, -1, -1 },
    { "RIGHT", "I", .constantValue.asInt = ASGravityConverter_RIGHT, 0x19, -1, -1, -1, -1 },
    { "CENTER_VERTICAL", "I", .constantValue.asInt = ASGravityConverter_CENTER_VERTICAL, 0x19, -1, -1, -1, -1 },
    { "FILL_VERTICAL", "I", .constantValue.asInt = ASGravityConverter_FILL_VERTICAL, 0x19, -1, -1, -1, -1 },
    { "CENTER_HORIZONTAL", "I", .constantValue.asInt = ASGravityConverter_CENTER_HORIZONTAL, 0x19, -1, -1, -1, -1 },
    { "FILL_HORIZONTAL", "I", .constantValue.asInt = ASGravityConverter_FILL_HORIZONTAL, 0x19, -1, -1, -1, -1 },
    { "CENTER", "I", .constantValue.asInt = ASGravityConverter_CENTER, 0x19, -1, -1, -1, -1 },
    { "FILL", "I", .constantValue.asInt = ASGravityConverter_FILL, 0x19, -1, -1, -1, -1 },
    { "CLIP_VERTICAL", "I", .constantValue.asInt = ASGravityConverter_CLIP_VERTICAL, 0x19, -1, -1, -1, -1 },
    { "CLIP_HORIZONTAL", "I", .constantValue.asInt = ASGravityConverter_CLIP_HORIZONTAL, 0x19, -1, -1, -1, -1 },
    { "RELATIVE_LAYOUT_DIRECTION", "I", .constantValue.asInt = ASGravityConverter_RELATIVE_LAYOUT_DIRECTION, 0x19, -1, -1, -1, -1 },
    { "HORIZONTAL_GRAVITY_MASK", "I", .constantValue.asInt = ASGravityConverter_HORIZONTAL_GRAVITY_MASK, 0x19, -1, -1, -1, -1 },
    { "VERTICAL_GRAVITY_MASK", "I", .constantValue.asInt = ASGravityConverter_VERTICAL_GRAVITY_MASK, 0x19, -1, -1, -1, -1 },
    { "DISPLAY_CLIP_VERTICAL", "I", .constantValue.asInt = ASGravityConverter_DISPLAY_CLIP_VERTICAL, 0x19, -1, -1, -1, -1 },
    { "DISPLAY_CLIP_HORIZONTAL", "I", .constantValue.asInt = ASGravityConverter_DISPLAY_CLIP_HORIZONTAL, 0x19, -1, -1, -1, -1 },
    { "START", "I", .constantValue.asInt = ASGravityConverter_START, 0x19, -1, -1, -1, -1 },
    { "END", "I", .constantValue.asInt = ASGravityConverter_END, 0x19, -1, -1, -1, -1 },
    { "RELATIVE_HORIZONTAL_GRAVITY_MASK", "I", .constantValue.asInt = ASGravityConverter_RELATIVE_HORIZONTAL_GRAVITY_MASK, 0x19, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;", "()Ljava/util/Collection<Ljava/lang/Integer;>;", &ASGravityConverter_gravityMap, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;" };
  static const J2ObjcClassInfo _ASGravityConverter = { "GravityConverter", "com.ashera.converter", ptrTable, methods, fields, 7, 0x1, 4, 28, -1, -1, -1, -1, -1 };
  return &_ASGravityConverter;
}

+ (void)initialize {
  if (self == [ASGravityConverter class]) {
    JreStrongAssignAndConsume(&ASGravityConverter_gravityMap, new_JavaUtilHashMap_init());
    {
      [ASGravityConverter_gravityMap putWithId:@"top" withId:JavaLangInteger_valueOfWithInt_(ASGravityConverter_TOP)];
      [((id<JavaUtilMap>) nil_chk(ASGravityConverter_gravityMap)) putWithId:@"bottom" withId:JavaLangInteger_valueOfWithInt_(ASGravityConverter_BOTTOM)];
      [((id<JavaUtilMap>) nil_chk(ASGravityConverter_gravityMap)) putWithId:@"left" withId:JavaLangInteger_valueOfWithInt_(ASGravityConverter_LEFT)];
      [((id<JavaUtilMap>) nil_chk(ASGravityConverter_gravityMap)) putWithId:@"right" withId:JavaLangInteger_valueOfWithInt_(ASGravityConverter_RIGHT)];
      [((id<JavaUtilMap>) nil_chk(ASGravityConverter_gravityMap)) putWithId:@"center_vertical" withId:JavaLangInteger_valueOfWithInt_(ASGravityConverter_CENTER_VERTICAL)];
      [((id<JavaUtilMap>) nil_chk(ASGravityConverter_gravityMap)) putWithId:@"fill_vertical" withId:JavaLangInteger_valueOfWithInt_(ASGravityConverter_FILL_VERTICAL)];
      [((id<JavaUtilMap>) nil_chk(ASGravityConverter_gravityMap)) putWithId:@"center_horizontal" withId:JavaLangInteger_valueOfWithInt_(ASGravityConverter_CENTER_HORIZONTAL)];
      [((id<JavaUtilMap>) nil_chk(ASGravityConverter_gravityMap)) putWithId:@"center" withId:JavaLangInteger_valueOfWithInt_(ASGravityConverter_CENTER)];
      [((id<JavaUtilMap>) nil_chk(ASGravityConverter_gravityMap)) putWithId:@"fill" withId:JavaLangInteger_valueOfWithInt_((jint) 0x77)];
      [((id<JavaUtilMap>) nil_chk(ASGravityConverter_gravityMap)) putWithId:@"clip_vertical" withId:JavaLangInteger_valueOfWithInt_(ASGravityConverter_CLIP_VERTICAL)];
      [((id<JavaUtilMap>) nil_chk(ASGravityConverter_gravityMap)) putWithId:@"clip_horizontal" withId:JavaLangInteger_valueOfWithInt_(ASGravityConverter_CLIP_HORIZONTAL)];
      [((id<JavaUtilMap>) nil_chk(ASGravityConverter_gravityMap)) putWithId:@"start" withId:JavaLangInteger_valueOfWithInt_(ASGravityConverter_START)];
      [((id<JavaUtilMap>) nil_chk(ASGravityConverter_gravityMap)) putWithId:@"end" withId:JavaLangInteger_valueOfWithInt_(ASGravityConverter_END)];
      [((id<JavaUtilMap>) nil_chk(ASGravityConverter_gravityMap)) putWithId:@"fill_horizontal" withId:JavaLangInteger_valueOfWithInt_(ASGravityConverter_FILL_HORIZONTAL)];
    }
    J2OBJC_SET_INITIALIZED(ASGravityConverter)
  }
}

@end

void ASGravityConverter_init(ASGravityConverter *self) {
  ASAbstractBitFlagConverter_init(self);
}

ASGravityConverter *new_ASGravityConverter_init() {
  J2OBJC_NEW_IMPL(ASGravityConverter, init)
}

ASGravityConverter *create_ASGravityConverter_init() {
  J2OBJC_CREATE_IMPL(ASGravityConverter, init)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASGravityConverter)
