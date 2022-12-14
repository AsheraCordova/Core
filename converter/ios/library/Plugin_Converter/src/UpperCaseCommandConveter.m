//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\Plugin_Converter\src\com\ashera\converter\UpperCaseCommandConveter.java
//

#include "AttributeCommand.h"
#include "BaseAttributeCommand.h"
#include "IOSObjectArray.h"
#include "IWidget.h"
#include "J2ObjC_source.h"
#include "UpperCaseCommandConveter.h"
#include "java/util/Locale.h"


@implementation ASUpperCaseCommandConveter

- (instancetype)initWithNSString:(NSString *)id_ {
  ASUpperCaseCommandConveter_initWithNSString_(self, id_);
  return self;
}

- (id)modifyValueWithASIWidget:(id<ASIWidget>)widget
                        withId:(id)nativeView
                  withNSString:(NSString *)phase
                  withNSString:(NSString *)attributeName
                        withId:(id)value {
  if (value == nil) {
    return nil;
  }
  NSString *text = (NSString *) cast_chk(value, [NSString class]);
  NSString *result = [text java_uppercaseStringWithJRELocale:JavaUtilLocale_getDefault()];
  return result;
}

- (id<ASAttributeCommand>)newInstanceWithNSObjectArray:(IOSObjectArray *)args {
  return create_ASUpperCaseCommandConveter_initWithNSString_(self->id__);
}

- (void)updateArgsWithNSObjectArray:(IOSObjectArray *)args {
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, 0, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, 1, 2, -1, -1, -1, -1 },
    { NULL, "LASAttributeCommand;", 0x81, 3, 4, -1, -1, -1, -1 },
    { NULL, "V", 0x81, 5, 4, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(initWithNSString:);
  methods[1].selector = @selector(modifyValueWithASIWidget:withId:withNSString:withNSString:withId:);
  methods[2].selector = @selector(newInstanceWithNSObjectArray:);
  methods[3].selector = @selector(updateArgsWithNSObjectArray:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "LNSString;", "modifyValue", "LASIWidget;LNSObject;LNSString;LNSString;LNSObject;", "newInstance", "[LNSObject;", "updateArgs" };
  static const J2ObjcClassInfo _ASUpperCaseCommandConveter = { "UpperCaseCommandConveter", "com.ashera.converter", ptrTable, methods, NULL, 7, 0x1, 4, 0, -1, -1, -1, -1, -1 };
  return &_ASUpperCaseCommandConveter;
}

@end

void ASUpperCaseCommandConveter_initWithNSString_(ASUpperCaseCommandConveter *self, NSString *id_) {
  ASBaseAttributeCommand_initWithNSString_(self, id_);
}

ASUpperCaseCommandConveter *new_ASUpperCaseCommandConveter_initWithNSString_(NSString *id_) {
  J2OBJC_NEW_IMPL(ASUpperCaseCommandConveter, initWithNSString_, id_)
}

ASUpperCaseCommandConveter *create_ASUpperCaseCommandConveter_initWithNSString_(NSString *id_) {
  J2OBJC_CREATE_IMPL(ASUpperCaseCommandConveter, initWithNSString_, id_)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASUpperCaseCommandConveter)
