//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\Plugin_Converter\src\com\ashera\converter\CommonConverters.java
//

#include "AlphaNumeric.h"
#include "Alphabet.h"
#include "ArrayConverter.h"
#include "BooleanConverter.h"
#include "CommonConverters.h"
#include "ConverterFactory.h"
#include "Date.h"
#include "DimensionConverter.h"
#include "DimensionDpPxIntConverter.h"
#include "DimensionFloatConverter.h"
#include "DimensionPxIntConverter.h"
#include "DimensionSpConverter.h"
#include "DimensionSpIntConverter.h"
#include "DimensionSpPxIntConverter.h"
#include "DoubleConverter.h"
#include "EscapeHtmlCommandConverter.h"
#include "EventCommandFactory.h"
#include "FloatConverter.h"
#include "GravityConverter.h"
#include "IdConverter.h"
#include "ImageStateCommandConverter.h"
#include "InRange.h"
#include "IntConverter.h"
#include "IsEmail.h"
#include "IsMobileNumber.h"
#include "IsNumber.h"
#include "IsPositiveInteger.h"
#include "IsValidPIN.h"
#include "J2ObjC_source.h"
#include "JavaEventCommand.h"
#include "Length.h"
#include "ListToIntArrayConverter.h"
#include "MarqueeCommandConverter.h"
#include "MaxLength.h"
#include "MaxLengthCommandConveter.h"
#include "MaxValue.h"
#include "MinLength.h"
#include "MinValue.h"
#include "NilConverter.h"
#include "NotEmpty.h"
#include "ObjectToMapConverter.h"
#include "PasswordCommandConveter.h"
#include "Pattern.h"
#include "PercentConverter.h"
#include "ResourceStringConverter.h"
#include "StrongPassword.h"
#include "TemplateConverter.h"
#include "TextFormatCommandConverter.h"
#include "Time.h"
#include "TimeConverter.h"
#include "UpperCaseCommandConveter.h"
#include "Url.h"
#include "ValidatorFactory.h"


J2OBJC_INITIALIZED_DEFN(ASCommonConverters)

NSString *ASCommonConverters_dimensionfloat = @"dimensionfloat";
NSString *ASCommonConverters_dimensionsp = @"dimensionsp";
NSString *ASCommonConverters_dimension = @"dimension";
NSString *ASCommonConverters_font = @"font";
NSString *ASCommonConverters_fontweight = @"fontweight";
NSString *ASCommonConverters_fontstyle = @"fontstyle";
NSString *ASCommonConverters_actionItem = @"actionItem";
NSString *ASCommonConverters_intconverter = @"int";
NSString *ASCommonConverters_floatconverter = @"float";
NSString *ASCommonConverters_doubleconverter = @"double";
NSString *ASCommonConverters_behaviorconverter = @"behavior";
NSString *ASCommonConverters_validationconverter = @"validator";
NSString *ASCommonConverters_timeconverter = @"time";
NSString *ASCommonConverters_dimensionspint = @"dimensionspint";
NSString *ASCommonConverters_dimensionsppxint = @"dimensionsppxint";
NSString *ASCommonConverters_resourcestring = @"resourcestring";
NSString *ASCommonConverters_gravity = @"gravity";
NSString *ASCommonConverters_boolean_conv = @"boolean";
NSString *ASCommonConverters_percent = @"percent";
NSString *ASCommonConverters_id = @"id";
NSString *ASCommonConverters_template = @"template";
NSString *ASCommonConverters_dimensionpx = @"dimensionpx";
NSString *ASCommonConverters_dimensionsppx = @"dimensionsppx";
NSString *ASCommonConverters_dimensiondppx = @"dimensiondppx";
NSString *ASCommonConverters_object = @"object";
NSString *ASCommonConverters_array = @"array";
NSString *ASCommonConverters_nil = @"nil";
NSString *ASCommonConverters_listtointarray = @"listtointarray";
NSString *ASCommonConverters_command_generic = @"command_generic";
NSString *ASCommonConverters_command_password = @"command_password";
NSString *ASCommonConverters_command_uppercase = @"command_uppercase";
NSString *ASCommonConverters_command_maxlength = @"command_maxlength";
NSString *ASCommonConverters_command_marquee = @"command_marquee";
NSString *ASCommonConverters_command_escapehtml = @"command_escapehtml";
NSString *ASCommonConverters_command_textformatter = @"command_textformatter";
NSString *ASCommonConverters_command_imagestate = @"command_imagestate";

@implementation ASCommonConverters

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASCommonConverters_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

+ (void)init__ {
  ASCommonConverters_init__();
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 0, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(init__);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "dimensionfloat", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 1, -1, -1 },
    { "dimensionsp", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 2, -1, -1 },
    { "dimension", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 3, -1, -1 },
    { "font", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 4, -1, -1 },
    { "fontweight", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 5, -1, -1 },
    { "fontstyle", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 6, -1, -1 },
    { "actionItem", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 7, -1, -1 },
    { "intconverter", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 8, -1, -1 },
    { "floatconverter", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 9, -1, -1 },
    { "doubleconverter", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 10, -1, -1 },
    { "behaviorconverter", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 11, -1, -1 },
    { "validationconverter", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 12, -1, -1 },
    { "timeconverter", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 13, -1, -1 },
    { "dimensionspint", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 14, -1, -1 },
    { "dimensionsppxint", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 15, -1, -1 },
    { "resourcestring", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 16, -1, -1 },
    { "gravity", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 17, -1, -1 },
    { "boolean_conv", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 18, -1, -1 },
    { "percent", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 19, -1, -1 },
    { "id", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 20, -1, -1 },
    { "template", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 21, -1, -1 },
    { "dimensionpx", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 22, -1, -1 },
    { "dimensionsppx", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 23, -1, -1 },
    { "dimensiondppx", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 24, -1, -1 },
    { "object", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 25, -1, -1 },
    { "array", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 26, -1, -1 },
    { "nil", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 27, -1, -1 },
    { "listtointarray", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 28, -1, -1 },
    { "command_generic", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 29, -1, -1 },
    { "command_password", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 30, -1, -1 },
    { "command_uppercase", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 31, -1, -1 },
    { "command_maxlength", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 32, -1, -1 },
    { "command_marquee", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 33, -1, -1 },
    { "command_escapehtml", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 34, -1, -1 },
    { "command_textformatter", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 35, -1, -1 },
    { "command_imagestate", "LNSString;", .constantValue.asLong = 0, 0x19, -1, 36, -1, -1 },
  };
  static const void *ptrTable[] = { "init", &ASCommonConverters_dimensionfloat, &ASCommonConverters_dimensionsp, &ASCommonConverters_dimension, &ASCommonConverters_font, &ASCommonConverters_fontweight, &ASCommonConverters_fontstyle, &ASCommonConverters_actionItem, &ASCommonConverters_intconverter, &ASCommonConverters_floatconverter, &ASCommonConverters_doubleconverter, &ASCommonConverters_behaviorconverter, &ASCommonConverters_validationconverter, &ASCommonConverters_timeconverter, &ASCommonConverters_dimensionspint, &ASCommonConverters_dimensionsppxint, &ASCommonConverters_resourcestring, &ASCommonConverters_gravity, &ASCommonConverters_boolean_conv, &ASCommonConverters_percent, &ASCommonConverters_id, &ASCommonConverters_template, &ASCommonConverters_dimensionpx, &ASCommonConverters_dimensionsppx, &ASCommonConverters_dimensiondppx, &ASCommonConverters_object, &ASCommonConverters_array, &ASCommonConverters_nil, &ASCommonConverters_listtointarray, &ASCommonConverters_command_generic, &ASCommonConverters_command_password, &ASCommonConverters_command_uppercase, &ASCommonConverters_command_maxlength, &ASCommonConverters_command_marquee, &ASCommonConverters_command_escapehtml, &ASCommonConverters_command_textformatter, &ASCommonConverters_command_imagestate };
  static const J2ObjcClassInfo _ASCommonConverters = { "CommonConverters", "com.ashera.converter", ptrTable, methods, fields, 7, 0x1, 2, 36, -1, -1, -1, -1, -1 };
  return &_ASCommonConverters;
}

+ (void)initialize {
  if (self == [ASCommonConverters class]) {
    {
      ASConverterFactory_register__WithNSString_withASIConverter_(ASCommonConverters_boolean_conv, create_ASBooleanConverter_init());
      ASConverterFactory_register__WithNSString_withASIConverter_(ASCommonConverters_dimension, create_ASDimensionConverter_init());
      ASConverterFactory_register__WithNSString_withASIConverter_(ASCommonConverters_dimensionsp, create_ASDimensionSpConverter_init());
      ASConverterFactory_register__WithNSString_withASIConverter_(ASCommonConverters_dimensionspint, create_ASDimensionSpIntConverter_init());
      ASConverterFactory_register__WithNSString_withASIConverter_(ASCommonConverters_dimensionsppxint, create_ASDimensionSpPxIntConverter_init());
      ASConverterFactory_register__WithNSString_withASIConverter_(ASCommonConverters_floatconverter, create_ASFloatConverter_init());
      ASConverterFactory_register__WithNSString_withASIConverter_(ASCommonConverters_doubleconverter, create_ASDoubleConverter_init());
      ASConverterFactory_register__WithNSString_withASIConverter_(ASCommonConverters_resourcestring, create_ASResourceStringConverter_init());
      ASConverterFactory_register__WithNSString_withASIConverter_(ASCommonConverters_gravity, create_ASGravityConverter_init());
      ASConverterFactory_register__WithNSString_withASIConverter_(ASCommonConverters_id, create_ASIdConverter_init());
      ASConverterFactory_register__WithNSString_withASIConverter_(ASCommonConverters_intconverter, create_ASIntConverter_init());
      ASConverterFactory_register__WithNSString_withASIConverter_(ASCommonConverters_percent, create_ASPercentConverter_init());
      ASConverterFactory_register__WithNSString_withASIConverter_(ASCommonConverters_dimensionfloat, create_ASDimensionFloatConverter_init());
      ASConverterFactory_register__WithNSString_withASIConverter_(ASCommonConverters_timeconverter, create_ASTimeConverter_init());
      ASConverterFactory_register__WithNSString_withASIConverter_(ASCommonConverters_template, create_ASTemplateConverter_init());
      ASConverterFactory_register__WithNSString_withASIConverter_(ASCommonConverters_dimensionsppx, create_ASDimensionSpPxIntConverter_init());
      ASConverterFactory_register__WithNSString_withASIConverter_(ASCommonConverters_dimensionpx, create_ASDimensionPxIntConverter_init());
      ASConverterFactory_register__WithNSString_withASIConverter_(ASCommonConverters_dimensiondppx, create_ASDimensionDpPxIntConverter_init());
      ASConverterFactory_register__WithNSString_withASIConverter_(ASCommonConverters_object, create_ASObjectToMapConverter_init());
      ASConverterFactory_register__WithNSString_withASIConverter_(ASCommonConverters_array, create_ASArrayConverter_init());
      ASConverterFactory_register__WithNSString_withASIConverter_(ASCommonConverters_listtointarray, create_ASListToIntArrayConverter_init());
      ASConverterFactory_register__WithNSString_withASIConverter_(ASCommonConverters_nil, create_ASNilConverter_init());
      ASConverterFactory_registerCommandConverterWithASAttributeCommand_(create_ASPasswordCommandConveter_initWithNSString_(ASCommonConverters_command_password));
      ASConverterFactory_registerCommandConverterWithASAttributeCommand_(create_ASUpperCaseCommandConveter_initWithNSString_(ASCommonConverters_command_uppercase));
      ASConverterFactory_registerCommandConverterWithASAttributeCommand_(create_ASMaxLengthCommandConveter_initWithNSString_(ASCommonConverters_command_maxlength));
      ASConverterFactory_registerCommandConverterWithASAttributeCommand_(create_ASMarqueeCommandConverter_initWithNSString_(ASCommonConverters_command_marquee));
      ASConverterFactory_registerCommandConverterWithASAttributeCommand_(create_ASEscapeHtmlCommandConverter_initWithNSString_(ASCommonConverters_command_escapehtml));
      ASConverterFactory_registerCommandConverterWithASAttributeCommand_(create_ASTextFormatCommandConverter_initWithNSString_(ASCommonConverters_command_textformatter));
      ASConverterFactory_registerCommandConverterWithASAttributeCommand_(create_ASImageStateCommandConverter_initWithNSString_(ASCommonConverters_command_imagestate));
      ASValidatorFactory_register__WithNSString_withASValidation_(@"alphabet", create_ASAlphabet_init());
      ASValidatorFactory_register__WithNSString_withASValidation_(@"alphanumeric", create_ASAlphaNumeric_init());
      ASValidatorFactory_register__WithNSString_withASValidation_(@"date", create_ASDate_init());
      ASValidatorFactory_register__WithNSString_withASValidation_(@"inrange", create_ASInRange_init());
      ASValidatorFactory_register__WithNSString_withASValidation_(@"email", create_ASIsEmail_init());
      ASValidatorFactory_register__WithNSString_withASValidation_(@"mobilenumber", create_ASIsMobileNumber_init());
      ASValidatorFactory_register__WithNSString_withASValidation_(@"number", create_ASIsNumber_init());
      ASValidatorFactory_register__WithNSString_withASValidation_(@"integer", create_ASIsPositiveInteger_init());
      ASValidatorFactory_register__WithNSString_withASValidation_(@"pin", create_ASIsValidPIN_init());
      ASValidatorFactory_register__WithNSString_withASValidation_(@"length", create_ASLength_init());
      ASValidatorFactory_register__WithNSString_withASValidation_(@"required", create_ASNotEmpty_init());
      ASValidatorFactory_register__WithNSString_withASValidation_(@"strongpassword", create_ASStrongPassword_init());
      ASValidatorFactory_register__WithNSString_withASValidation_(@"time", create_ASTime_init());
      ASValidatorFactory_register__WithNSString_withASValidation_(@"pattern", create_ASPattern_init());
      ASValidatorFactory_register__WithNSString_withASValidation_(@"minlength", create_ASMinLength_init());
      ASValidatorFactory_register__WithNSString_withASValidation_(@"maxlength", create_ASMaxLength_init());
      ASValidatorFactory_register__WithNSString_withASValidation_(@"maxvalue", create_ASMaxValue_init());
      ASValidatorFactory_register__WithNSString_withASValidation_(@"minvalue", create_ASMinValue_init());
      ASValidatorFactory_register__WithNSString_withASValidation_(@"url", create_ASUrl_init());
      ASEventCommandFactory_registerCommandWithNSString_withASEventCommand_(@"java", create_ASJavaEventCommand_init());
    }
    J2OBJC_SET_INITIALIZED(ASCommonConverters)
  }
}

@end

void ASCommonConverters_init(ASCommonConverters *self) {
  NSObject_init(self);
}

ASCommonConverters *new_ASCommonConverters_init() {
  J2OBJC_NEW_IMPL(ASCommonConverters, init)
}

ASCommonConverters *create_ASCommonConverters_init() {
  J2OBJC_CREATE_IMPL(ASCommonConverters, init)
}

void ASCommonConverters_init__() {
  ASCommonConverters_initialize();
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASCommonConverters)
