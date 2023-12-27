//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\content\res\ConstantState.java
//

#include "ConstantState.h"
#include "J2ObjC_source.h"
#include "Resources.h"


@implementation ADConstantState

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADConstantState_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (jint)getChangingConfigurations {
  // can't call an abstract method
  [self doesNotRecognizeSelector:_cmd];
  return 0;
}

- (id)newInstance {
  // can't call an abstract method
  [self doesNotRecognizeSelector:_cmd];
  return 0;
}

- (id)newInstanceWithADResources:(ADResources *)res {
  return [self newInstance];
}

- (id)newInstanceWithADResources:(ADResources *)res
           withADResources_Theme:(ADResources_Theme *)theme {
  return [self newInstanceWithADResources:res];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x401, -1, -1, -1, 0, -1, -1 },
    { NULL, "LNSObject;", 0x1, 1, 2, -1, 3, -1, -1 },
    { NULL, "LNSObject;", 0x1, 1, 4, -1, 5, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(getChangingConfigurations);
  methods[2].selector = @selector(newInstance);
  methods[3].selector = @selector(newInstanceWithADResources:);
  methods[4].selector = @selector(newInstanceWithADResources:withADResources_Theme:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "()TT;", "newInstance", "LADResources;", "(Lr/android/content/res/Resources;)TT;", "LADResources;LADResources_Theme;", "(Lr/android/content/res/Resources;Lr/android/content/res/Resources$Theme;)TT;", "<T:Ljava/lang/Object;>Ljava/lang/Object;" };
  static const J2ObjcClassInfo _ADConstantState = { "ConstantState", "r.android.content.res", ptrTable, methods, NULL, 7, 0x401, 5, 0, -1, -1, -1, 6, -1 };
  return &_ADConstantState;
}

@end

void ADConstantState_init(ADConstantState *self) {
  NSObject_init(self);
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADConstantState)
