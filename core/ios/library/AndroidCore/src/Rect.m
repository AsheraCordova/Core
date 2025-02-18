//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\graphics\Rect.java
//

#include "J2ObjC_source.h"
#include "Rect.h"
#include "java/lang/StringBuilder.h"


@implementation ADRect

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADRect_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (instancetype)initWithInt:(jint)left
                    withInt:(jint)top
                    withInt:(jint)right
                    withInt:(jint)bottom {
  ADRect_initWithInt_withInt_withInt_withInt_(self, left, top, right, bottom);
  return self;
}

- (instancetype)initWithADRect:(ADRect *)r {
  ADRect_initWithADRect_(self, r);
  return self;
}

- (jint)width {
  return right_ - left_;
}

- (jint)height {
  return bottom_ - top_;
}

- (void)setWithInt:(jint)left
           withInt:(jint)top
           withInt:(jint)right
           withInt:(jint)bottom {
  self->left_ = left;
  self->top_ = top;
  self->right_ = right;
  self->bottom_ = bottom;
}

- (void)setWithADRect:(ADRect *)src {
  self->left_ = ((ADRect *) nil_chk(src))->left_;
  self->top_ = src->top_;
  self->right_ = src->right_;
  self->bottom_ = src->bottom_;
}

- (void)setEmpty {
  left_ = right_ = top_ = bottom_ = 0;
}

- (jboolean)isEmpty {
  return left_ >= right_ || top_ >= bottom_;
}

- (void)offsetWithInt:(jint)dx
              withInt:(jint)dy {
  left_ += dx;
  top_ += dy;
  right_ += dx;
  bottom_ += dy;
}

- (jboolean)containsWithADRect:(ADRect *)r {
  return self->left_ < self->right_ && self->top_ < self->bottom_ && left_ <= ((ADRect *) nil_chk(r))->left_ && top_ <= r->top_ && right_ >= r->right_ && bottom_ >= r->bottom_;
}

- (jboolean)containsWithInt:(jint)x
                    withInt:(jint)y {
  return left_ < right_ && top_ < bottom_ && x >= left_ && x < right_ && y >= top_ && y < bottom_;
}

- (NSString *)toShortString {
  return [self toShortStringWithJavaLangStringBuilder:create_JavaLangStringBuilder_initWithInt_(32)];
}

- (NSString *)toShortStringWithJavaLangStringBuilder:(JavaLangStringBuilder *)sb {
  [((JavaLangStringBuilder *) nil_chk(sb)) setLengthWithInt:0];
  [sb appendWithChar:'['];
  [sb appendWithInt:left_];
  [sb appendWithChar:','];
  [sb appendWithInt:top_];
  [sb appendWithNSString:@"]["];
  [sb appendWithInt:right_];
  [sb appendWithChar:','];
  [sb appendWithInt:bottom_];
  [sb appendWithChar:']'];
  return [sb description];
}

- (void)insetWithADRect:(ADRect *)insets {
  left_ += ((ADRect *) nil_chk(insets))->left_;
  top_ += insets->top_;
  right_ -= insets->right_;
  bottom_ -= insets->bottom_;
}

- (void)insetWithInt:(jint)dx
             withInt:(jint)dy {
  left_ += dx;
  top_ += dy;
  right_ -= dx;
  bottom_ -= dy;
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, NULL, 0x1, -1, 0, -1, -1, -1, -1 },
    { NULL, NULL, 0x1, -1, 1, -1, -1, -1, -1 },
    { NULL, "I", 0x11, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x11, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 2, 0, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 2, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x11, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 3, 4, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, 5, 1, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, 5, 4, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, 6, 7, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 8, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 8, 4, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(initWithInt:withInt:withInt:withInt:);
  methods[2].selector = @selector(initWithADRect:);
  methods[3].selector = @selector(width);
  methods[4].selector = @selector(height);
  methods[5].selector = @selector(setWithInt:withInt:withInt:withInt:);
  methods[6].selector = @selector(setWithADRect:);
  methods[7].selector = @selector(setEmpty);
  methods[8].selector = @selector(isEmpty);
  methods[9].selector = @selector(offsetWithInt:withInt:);
  methods[10].selector = @selector(containsWithADRect:);
  methods[11].selector = @selector(containsWithInt:withInt:);
  methods[12].selector = @selector(toShortString);
  methods[13].selector = @selector(toShortStringWithJavaLangStringBuilder:);
  methods[14].selector = @selector(insetWithADRect:);
  methods[15].selector = @selector(insetWithInt:withInt:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "left_", "I", .constantValue.asLong = 0, 0x1, -1, -1, -1, -1 },
    { "top_", "I", .constantValue.asLong = 0, 0x1, -1, -1, -1, -1 },
    { "right_", "I", .constantValue.asLong = 0, 0x1, -1, -1, -1, -1 },
    { "bottom_", "I", .constantValue.asLong = 0, 0x1, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "IIII", "LADRect;", "set", "offset", "II", "contains", "toShortString", "LJavaLangStringBuilder;", "inset" };
  static const J2ObjcClassInfo _ADRect = { "Rect", "r.android.graphics", ptrTable, methods, fields, 7, 0x11, 16, 4, -1, -1, -1, -1, -1 };
  return &_ADRect;
}

@end

void ADRect_init(ADRect *self) {
  NSObject_init(self);
}

ADRect *new_ADRect_init() {
  J2OBJC_NEW_IMPL(ADRect, init)
}

ADRect *create_ADRect_init() {
  J2OBJC_CREATE_IMPL(ADRect, init)
}

void ADRect_initWithInt_withInt_withInt_withInt_(ADRect *self, jint left, jint top, jint right, jint bottom) {
  NSObject_init(self);
  self->left_ = left;
  self->top_ = top;
  self->right_ = right;
  self->bottom_ = bottom;
}

ADRect *new_ADRect_initWithInt_withInt_withInt_withInt_(jint left, jint top, jint right, jint bottom) {
  J2OBJC_NEW_IMPL(ADRect, initWithInt_withInt_withInt_withInt_, left, top, right, bottom)
}

ADRect *create_ADRect_initWithInt_withInt_withInt_withInt_(jint left, jint top, jint right, jint bottom) {
  J2OBJC_CREATE_IMPL(ADRect, initWithInt_withInt_withInt_withInt_, left, top, right, bottom)
}

void ADRect_initWithADRect_(ADRect *self, ADRect *r) {
  NSObject_init(self);
  if (r == nil) {
    self->left_ = self->top_ = self->right_ = self->bottom_ = 0;
  }
  else {
    self->left_ = r->left_;
    self->top_ = r->top_;
    self->right_ = r->right_;
    self->bottom_ = r->bottom_;
  }
}

ADRect *new_ADRect_initWithADRect_(ADRect *r) {
  J2OBJC_NEW_IMPL(ADRect, initWithADRect_, r)
}

ADRect *create_ADRect_initWithADRect_(ADRect *r) {
  J2OBJC_CREATE_IMPL(ADRect, initWithADRect_, r)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADRect)
