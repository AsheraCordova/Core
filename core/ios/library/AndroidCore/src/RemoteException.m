//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\os\RemoteException.java
//

#include "J2ObjC_source.h"
#include "RemoteException.h"
#include "java/lang/Exception.h"


@implementation ADRemoteException

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADRemoteException_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  #pragma clang diagnostic pop
  static const J2ObjcClassInfo _ADRemoteException = { "RemoteException", "r.android.os", NULL, methods, NULL, 7, 0x1, 1, 0, -1, -1, -1, -1, -1 };
  return &_ADRemoteException;
}

@end

void ADRemoteException_init(ADRemoteException *self) {
  JavaLangException_init(self);
}

ADRemoteException *new_ADRemoteException_init() {
  J2OBJC_NEW_IMPL(ADRemoteException, init)
}

ADRemoteException *create_ADRemoteException_init() {
  J2OBJC_CREATE_IMPL(ADRemoteException, init)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADRemoteException)