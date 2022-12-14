//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\Plugin_Converter\src\com\ashera\validations\StrongPassword.java
//

#include "BaseValidator.h"
#include "IFragment.h"
#include "IOSObjectArray.h"
#include "IWidget.h"
#include "J2ObjC_source.h"
#include "ResourceBundleUtils.h"
#include "StrongPassword.h"
#include "Validation.h"


@implementation ASStrongPassword

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASStrongPassword_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (id<ASValidation>)newInstanceWithNSStringArray:(IOSObjectArray *)argument {
  return create_ASStrongPassword_init();
}

- (NSString *)getDefaultErrorMessageWithASIWidget:(id<ASIWidget>)widget {
  NSString *res = ASResourceBundleUtils_getStringWithNSString_withNSString_withNSString_withASIFragment_(@"values/strings", @"string", @"@string/strongpassword_error_message", [((id<ASIWidget>) nil_chk(widget)) getFragment]);
  return res;
}

- (jboolean)isValidWithNSString:(NSString *)password
                  withASIWidget:(id<ASIWidget>)widget {
  jboolean valid = true;
  if (password == nil || [((NSString *) nil_chk([password java_trim])) isEqual:@""]) {
    return true;
  }
  if ([password java_length] < 8) {
    valid = false;
  }
  NSString *upperCaseChars = @"(.*[A-Z].*)";
  if (![password java_matches:upperCaseChars]) {
    valid = false;
  }
  NSString *numbers = @"(.*[0-9].*)";
  if (![password java_matches:numbers]) {
    valid = false;
  }
  NSString *specialChars = @"(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
  if (![password java_matches:specialChars]) {
    valid = false;
  }
  return valid;
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LASValidation;", 0x81, 0, 1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, 2, 3, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, 4, 5, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(newInstanceWithNSStringArray:);
  methods[2].selector = @selector(getDefaultErrorMessageWithASIWidget:);
  methods[3].selector = @selector(isValidWithNSString:withASIWidget:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "newInstance", "[LNSString;", "getDefaultErrorMessage", "LASIWidget;", "isValid", "LNSString;LASIWidget;" };
  static const J2ObjcClassInfo _ASStrongPassword = { "StrongPassword", "com.ashera.validations", ptrTable, methods, NULL, 7, 0x1, 4, 0, -1, -1, -1, -1, -1 };
  return &_ASStrongPassword;
}

@end

void ASStrongPassword_init(ASStrongPassword *self) {
  ASBaseValidator_init(self);
}

ASStrongPassword *new_ASStrongPassword_init() {
  J2OBJC_NEW_IMPL(ASStrongPassword, init)
}

ASStrongPassword *create_ASStrongPassword_init() {
  J2OBJC_CREATE_IMPL(ASStrongPassword, init)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASStrongPassword)
