//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\graphics\PointF.java
//

#include "IOSClass.h"
#include "IOSObjectArray.h"
#include "J2ObjC_source.h"
#include "Parcel.h"
#include "Parcelable.h"
#include "Point.h"
#include "PointF.h"
#include "java/lang/Float.h"
#include "java/lang/Math.h"


@interface ADPointF_1 : ADParcelable_Creator

- (instancetype)init;

/*!
 @brief Return a new point from the data in the specified parcel.
 */
- (ADPointF *)createFromParcelWithADParcel:(id<ADParcel>)inArg;

/*!
 @brief Return an array of rectangles of the specified size.
 */
- (IOSObjectArray *)newArrayWithInt:(jint)size OBJC_METHOD_FAMILY_NONE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADPointF_1)

__attribute__((unused)) static void ADPointF_1_init(ADPointF_1 *self);

__attribute__((unused)) static ADPointF_1 *new_ADPointF_1_init(void) NS_RETURNS_RETAINED;

__attribute__((unused)) static ADPointF_1 *create_ADPointF_1_init(void);

J2OBJC_INITIALIZED_DEFN(ADPointF)

ADParcelable_Creator *ADPointF_CREATOR;

@implementation ADPointF

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADPointF_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (instancetype)initWithFloat:(jfloat)x
                    withFloat:(jfloat)y {
  ADPointF_initWithFloat_withFloat_(self, x, y);
  return self;
}

- (instancetype)initWithADPoint:(ADPoint *)p {
  ADPointF_initWithADPoint_(self, p);
  return self;
}

- (instancetype)initWithADPointF:(ADPointF *)p {
  ADPointF_initWithADPointF_(self, p);
  return self;
}

- (void)setWithFloat:(jfloat)x
           withFloat:(jfloat)y {
  self->x_ = x;
  self->y_ = y;
}

- (void)setWithADPointF:(ADPointF *)p {
  self->x_ = ((ADPointF *) nil_chk(p))->x_;
  self->y_ = p->y_;
}

- (void)negate {
  x_ = -x_;
  y_ = -y_;
}

- (void)offsetWithFloat:(jfloat)dx
              withFloat:(jfloat)dy {
  JrePlusAssignFloatF(&x_, dx);
  JrePlusAssignFloatF(&y_, dy);
}

- (jboolean)equalsWithFloat:(jfloat)x
                  withFloat:(jfloat)y {
  return self->x_ == x && self->y_ == y;
}

- (jboolean)isEqual:(id)o {
  if (self == o) return true;
  if (o == nil || [self java_getClass] != [o java_getClass]) return false;
  ADPointF *pointF = (ADPointF *) cast_chk(o, [ADPointF class]);
  if (JavaLangFloat_compareWithFloat_withFloat_(pointF->x_, x_) != 0) return false;
  if (JavaLangFloat_compareWithFloat_withFloat_(pointF->y_, y_) != 0) return false;
  return true;
}

- (NSUInteger)hash {
  jint result = (x_ != +0.0f ? JavaLangFloat_floatToIntBitsWithFloat_(x_) : 0);
  result = 31 * result + (y_ != +0.0f ? JavaLangFloat_floatToIntBitsWithFloat_(y_) : 0);
  return result;
}

- (NSString *)description {
  return JreStrcat("$F$FC", @"PointF(", x_, @", ", y_, ')');
}

- (jfloat)length {
  return ADPointF_lengthWithFloat_withFloat_(x_, y_);
}

+ (jfloat)lengthWithFloat:(jfloat)x
                withFloat:(jfloat)y {
  return ADPointF_lengthWithFloat_withFloat_(x, y);
}

- (jint)describeContents {
  return 0;
}

- (void)writeToParcelWithADParcel:(id<ADParcel>)outArg
                          withInt:(jint)flags {
  [((id<ADParcel>) nil_chk(outArg)) writeFloatWithFloat:x_];
  [outArg writeFloatWithFloat:y_];
}

- (void)readFromParcelWithADParcel:(id<ADParcel>)inArg {
  x_ = [((id<ADParcel>) nil_chk(inArg)) readFloat];
  y_ = [inArg readFloat];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, NULL, 0x1, -1, 0, -1, -1, -1, -1 },
    { NULL, NULL, 0x1, -1, 1, -1, -1, -1, -1 },
    { NULL, NULL, 0x1, -1, 2, -1, -1, -1, -1 },
    { NULL, "V", 0x11, 3, 0, -1, -1, -1, -1 },
    { NULL, "V", 0x11, 3, 2, -1, -1, -1, -1 },
    { NULL, "V", 0x11, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x11, 4, 0, -1, -1, -1, -1 },
    { NULL, "Z", 0x11, 5, 0, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, 5, 6, -1, -1, -1, -1 },
    { NULL, "I", 0x1, 7, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, 8, -1, -1, -1, -1, -1 },
    { NULL, "F", 0x11, -1, -1, -1, -1, -1, -1 },
    { NULL, "F", 0x9, 9, 0, -1, -1, -1, -1 },
    { NULL, "I", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 10, 11, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 12, 13, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(initWithFloat:withFloat:);
  methods[2].selector = @selector(initWithADPoint:);
  methods[3].selector = @selector(initWithADPointF:);
  methods[4].selector = @selector(setWithFloat:withFloat:);
  methods[5].selector = @selector(setWithADPointF:);
  methods[6].selector = @selector(negate);
  methods[7].selector = @selector(offsetWithFloat:withFloat:);
  methods[8].selector = @selector(equalsWithFloat:withFloat:);
  methods[9].selector = @selector(isEqual:);
  methods[10].selector = @selector(hash);
  methods[11].selector = @selector(description);
  methods[12].selector = @selector(length);
  methods[13].selector = @selector(lengthWithFloat:withFloat:);
  methods[14].selector = @selector(describeContents);
  methods[15].selector = @selector(writeToParcelWithADParcel:withInt:);
  methods[16].selector = @selector(readFromParcelWithADParcel:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "x_", "F", .constantValue.asLong = 0, 0x1, -1, -1, -1, -1 },
    { "y_", "F", .constantValue.asLong = 0, 0x1, -1, -1, -1, -1 },
    { "CREATOR", "LADParcelable_Creator;", .constantValue.asLong = 0, 0x19, -1, 14, 15, -1 },
  };
  static const void *ptrTable[] = { "FF", "LADPoint;", "LADPointF;", "set", "offset", "equals", "LNSObject;", "hashCode", "toString", "length", "writeToParcel", "LADParcel;I", "readFromParcel", "LADParcel;", &ADPointF_CREATOR, "Lr/android/os/Parcelable$Creator<Lr/android/graphics/PointF;>;" };
  static const J2ObjcClassInfo _ADPointF = { "PointF", "r.android.graphics", ptrTable, methods, fields, 7, 0x1, 17, 3, -1, -1, -1, -1, -1 };
  return &_ADPointF;
}

+ (void)initialize {
  if (self == [ADPointF class]) {
    JreStrongAssignAndConsume(&ADPointF_CREATOR, new_ADPointF_1_init());
    J2OBJC_SET_INITIALIZED(ADPointF)
  }
}

@end

void ADPointF_init(ADPointF *self) {
  NSObject_init(self);
}

ADPointF *new_ADPointF_init() {
  J2OBJC_NEW_IMPL(ADPointF, init)
}

ADPointF *create_ADPointF_init() {
  J2OBJC_CREATE_IMPL(ADPointF, init)
}

void ADPointF_initWithFloat_withFloat_(ADPointF *self, jfloat x, jfloat y) {
  NSObject_init(self);
  self->x_ = x;
  self->y_ = y;
}

ADPointF *new_ADPointF_initWithFloat_withFloat_(jfloat x, jfloat y) {
  J2OBJC_NEW_IMPL(ADPointF, initWithFloat_withFloat_, x, y)
}

ADPointF *create_ADPointF_initWithFloat_withFloat_(jfloat x, jfloat y) {
  J2OBJC_CREATE_IMPL(ADPointF, initWithFloat_withFloat_, x, y)
}

void ADPointF_initWithADPoint_(ADPointF *self, ADPoint *p) {
  NSObject_init(self);
  self->x_ = ((ADPoint *) nil_chk(p))->x_;
  self->y_ = p->y_;
}

ADPointF *new_ADPointF_initWithADPoint_(ADPoint *p) {
  J2OBJC_NEW_IMPL(ADPointF, initWithADPoint_, p)
}

ADPointF *create_ADPointF_initWithADPoint_(ADPoint *p) {
  J2OBJC_CREATE_IMPL(ADPointF, initWithADPoint_, p)
}

void ADPointF_initWithADPointF_(ADPointF *self, ADPointF *p) {
  NSObject_init(self);
  self->x_ = ((ADPointF *) nil_chk(p))->x_;
  self->y_ = p->y_;
}

ADPointF *new_ADPointF_initWithADPointF_(ADPointF *p) {
  J2OBJC_NEW_IMPL(ADPointF, initWithADPointF_, p)
}

ADPointF *create_ADPointF_initWithADPointF_(ADPointF *p) {
  J2OBJC_CREATE_IMPL(ADPointF, initWithADPointF_, p)
}

jfloat ADPointF_lengthWithFloat_withFloat_(jfloat x, jfloat y) {
  ADPointF_initialize();
  return (jfloat) JavaLangMath_hypotWithDouble_withDouble_(x, y);
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADPointF)

@implementation ADPointF_1

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADPointF_1_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (ADPointF *)createFromParcelWithADParcel:(id<ADParcel>)inArg {
  ADPointF *r = create_ADPointF_init();
  [r readFromParcelWithADParcel:inArg];
  return r;
}

- (IOSObjectArray *)newArrayWithInt:(jint)size {
  return [IOSObjectArray arrayWithLength:size type:ADPointF_class_()];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "LADPointF;", 0x1, 0, 1, -1, -1, -1, -1 },
    { NULL, "[LADPointF;", 0x1, 2, 3, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(createFromParcelWithADParcel:);
  methods[2].selector = @selector(newArrayWithInt:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "createFromParcel", "LADParcel;", "newArray", "I", "LADPointF;", "Lr/android/os/Parcelable$Creator<Lr/android/graphics/PointF;>;" };
  static const J2ObjcClassInfo _ADPointF_1 = { "", "r.android.graphics", ptrTable, methods, NULL, 7, 0x8018, 3, 0, 4, -1, -1, 5, -1 };
  return &_ADPointF_1;
}

@end

void ADPointF_1_init(ADPointF_1 *self) {
  ADParcelable_Creator_init(self);
}

ADPointF_1 *new_ADPointF_1_init() {
  J2OBJC_NEW_IMPL(ADPointF_1, init)
}

ADPointF_1 *create_ADPointF_1_init() {
  J2OBJC_CREATE_IMPL(ADPointF_1, init)
}