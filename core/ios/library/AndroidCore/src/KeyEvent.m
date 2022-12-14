//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\stub\r\android\view\KeyEvent.java
//

#include "J2ObjC_source.h"
#include "KeyEvent.h"


@interface ADKeyEvent () {
 @public
  jint action_;
  jint keyCode_;
}

@end

@implementation ADKeyEvent

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADKeyEvent_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (jint)getAction {
  return action_;
}

- (void)setActionWithInt:(jint)action {
  self->action_ = action;
}

- (jint)getKeyCode {
  return keyCode_;
}

- (void)setKeyCodeWithInt:(jint)keyCode {
  self->keyCode_ = keyCode;
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 0, 1, -1, -1, -1, -1 },
    { NULL, "I", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 2, 1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(getAction);
  methods[2].selector = @selector(setActionWithInt:);
  methods[3].selector = @selector(getKeyCode);
  methods[4].selector = @selector(setKeyCodeWithInt:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "KEYCODE_BACK", "I", .constantValue.asInt = ADKeyEvent_KEYCODE_BACK, 0x19, -1, -1, -1, -1 },
    { "KEYCODE_VOLUME_UP", "I", .constantValue.asInt = ADKeyEvent_KEYCODE_VOLUME_UP, 0x19, -1, -1, -1, -1 },
    { "KEYCODE_VOLUME_DOWN", "I", .constantValue.asInt = ADKeyEvent_KEYCODE_VOLUME_DOWN, 0x19, -1, -1, -1, -1 },
    { "KEYCODE_MENU", "I", .constantValue.asInt = ADKeyEvent_KEYCODE_MENU, 0x19, -1, -1, -1, -1 },
    { "ACTION_DOWN", "I", .constantValue.asInt = ADKeyEvent_ACTION_DOWN, 0x19, -1, -1, -1, -1 },
    { "ACTION_UP", "I", .constantValue.asInt = ADKeyEvent_ACTION_UP, 0x19, -1, -1, -1, -1 },
    { "KEYCODE_SEARCH", "I", .constantValue.asInt = ADKeyEvent_KEYCODE_SEARCH, 0x19, -1, -1, -1, -1 },
    { "action_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "keyCode_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "setAction", "I", "setKeyCode" };
  static const J2ObjcClassInfo _ADKeyEvent = { "KeyEvent", "r.android.view", ptrTable, methods, fields, 7, 0x1, 5, 9, -1, -1, -1, -1, -1 };
  return &_ADKeyEvent;
}

@end

void ADKeyEvent_init(ADKeyEvent *self) {
  NSObject_init(self);
}

ADKeyEvent *new_ADKeyEvent_init() {
  J2OBJC_NEW_IMPL(ADKeyEvent, init)
}

ADKeyEvent *create_ADKeyEvent_init() {
  J2OBJC_CREATE_IMPL(ADKeyEvent, init)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADKeyEvent)
