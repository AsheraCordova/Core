//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\Plugin_Converter\src\com\ashera\converter\JavaEventCommand.java
//

#include "IOSObjectArray.h"
#include "IWidget.h"
#include "J2ObjC_source.h"
#include "JavaEventCommand.h"
#include "ModelDataType.h"
#include "ModelExpressionParser.h"
#include "ModelScope.h"
#include "ModelStore.h"
#include "PluginInvoker.h"
#include "java/lang/Boolean.h"
#include "java/lang/Float.h"
#include "java/lang/NumberFormatException.h"
#include "java/util/Map.h"

@protocol JavaUtilMap;


#pragma clang diagnostic ignored "-Wprotocol"

@interface ASJavaEventCommand ()

- (void)executeCommandWithASIWidget:(id<ASIWidget>)widget
                    withJavaUtilMap:(id<JavaUtilMap>)eventObject
withASJavaEventCommand_SingleParamFunction:(id<ASJavaEventCommand_SingleParamFunction>)func;

- (void)storeObjectWithASIWidget:(id<ASIWidget>)widget
                    withNSString:(NSString *)storeExpression
                          withId:(id)result;

- (id)getObjectWithASIWidget:(id<ASIWidget>)widget
                withNSString:(NSString *)expression;

- (jfloat)getFloatWithId:(id)modelVal;

- (id)incrementWithASIWidget:(id<ASIWidget>)widget
                      withId:(id)modelVal
             withJavaUtilMap:(id<JavaUtilMap>)configMap;

- (id)decrementWithASIWidget:(id<ASIWidget>)widget
                      withId:(id)modelVal
             withJavaUtilMap:(id<JavaUtilMap>)configMap;

- (id)toggleWithASIWidget:(id<ASIWidget>)widget
                   withId:(id)modelVal
          withJavaUtilMap:(id<JavaUtilMap>)configMap;

@end

__attribute__((unused)) static void ASJavaEventCommand_executeCommandWithASIWidget_withJavaUtilMap_withASJavaEventCommand_SingleParamFunction_(ASJavaEventCommand *self, id<ASIWidget> widget, id<JavaUtilMap> eventObject, id<ASJavaEventCommand_SingleParamFunction> func);

__attribute__((unused)) static void ASJavaEventCommand_storeObjectWithASIWidget_withNSString_withId_(ASJavaEventCommand *self, id<ASIWidget> widget, NSString *storeExpression, id result);

__attribute__((unused)) static id ASJavaEventCommand_getObjectWithASIWidget_withNSString_(ASJavaEventCommand *self, id<ASIWidget> widget, NSString *expression);

__attribute__((unused)) static jfloat ASJavaEventCommand_getFloatWithId_(ASJavaEventCommand *self, id modelVal);

__attribute__((unused)) static id ASJavaEventCommand_incrementWithASIWidget_withId_withJavaUtilMap_(ASJavaEventCommand *self, id<ASIWidget> widget, id modelVal, id<JavaUtilMap> configMap);

__attribute__((unused)) static id ASJavaEventCommand_decrementWithASIWidget_withId_withJavaUtilMap_(ASJavaEventCommand *self, id<ASIWidget> widget, id modelVal, id<JavaUtilMap> configMap);

__attribute__((unused)) static id ASJavaEventCommand_toggleWithASIWidget_withId_withJavaUtilMap_(ASJavaEventCommand *self, id<ASIWidget> widget, id modelVal, id<JavaUtilMap> configMap);

@interface ASJavaEventCommand_SingleParamFunction : NSObject

@end

@interface ASJavaEventCommand_$Lambda$1 : NSObject < ASJavaEventCommand_SingleParamFunction > {
 @public
  ASJavaEventCommand *target$_;
}

- (id)applyWithASIWidget:(id<ASIWidget>)a
                  withId:(id)b
         withJavaUtilMap:(id<JavaUtilMap>)c;

@end

J2OBJC_EMPTY_STATIC_INIT(ASJavaEventCommand_$Lambda$1)

__attribute__((unused)) static void ASJavaEventCommand_$Lambda$1_initWithASJavaEventCommand_(ASJavaEventCommand_$Lambda$1 *self, ASJavaEventCommand *outer$);

__attribute__((unused)) static ASJavaEventCommand_$Lambda$1 *new_ASJavaEventCommand_$Lambda$1_initWithASJavaEventCommand_(ASJavaEventCommand *outer$) NS_RETURNS_RETAINED;

__attribute__((unused)) static ASJavaEventCommand_$Lambda$1 *create_ASJavaEventCommand_$Lambda$1_initWithASJavaEventCommand_(ASJavaEventCommand *outer$);

@interface ASJavaEventCommand_$Lambda$2 : NSObject < ASJavaEventCommand_SingleParamFunction > {
 @public
  ASJavaEventCommand *target$_;
}

- (id)applyWithASIWidget:(id<ASIWidget>)a
                  withId:(id)b
         withJavaUtilMap:(id<JavaUtilMap>)c;

@end

J2OBJC_EMPTY_STATIC_INIT(ASJavaEventCommand_$Lambda$2)

__attribute__((unused)) static void ASJavaEventCommand_$Lambda$2_initWithASJavaEventCommand_(ASJavaEventCommand_$Lambda$2 *self, ASJavaEventCommand *outer$);

__attribute__((unused)) static ASJavaEventCommand_$Lambda$2 *new_ASJavaEventCommand_$Lambda$2_initWithASJavaEventCommand_(ASJavaEventCommand *outer$) NS_RETURNS_RETAINED;

__attribute__((unused)) static ASJavaEventCommand_$Lambda$2 *create_ASJavaEventCommand_$Lambda$2_initWithASJavaEventCommand_(ASJavaEventCommand *outer$);

@interface ASJavaEventCommand_$Lambda$3 : NSObject < ASJavaEventCommand_SingleParamFunction > {
 @public
  ASJavaEventCommand *target$_;
}

- (id)applyWithASIWidget:(id<ASIWidget>)a
                  withId:(id)b
         withJavaUtilMap:(id<JavaUtilMap>)c;

@end

J2OBJC_EMPTY_STATIC_INIT(ASJavaEventCommand_$Lambda$3)

__attribute__((unused)) static void ASJavaEventCommand_$Lambda$3_initWithASJavaEventCommand_(ASJavaEventCommand_$Lambda$3 *self, ASJavaEventCommand *outer$);

__attribute__((unused)) static ASJavaEventCommand_$Lambda$3 *new_ASJavaEventCommand_$Lambda$3_initWithASJavaEventCommand_(ASJavaEventCommand *outer$) NS_RETURNS_RETAINED;

__attribute__((unused)) static ASJavaEventCommand_$Lambda$3 *create_ASJavaEventCommand_$Lambda$3_initWithASJavaEventCommand_(ASJavaEventCommand *outer$);

@implementation ASJavaEventCommand

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASJavaEventCommand_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (id)executeCommandWithASIWidget:(id<ASIWidget>)widget
                  withJavaUtilMap:(id<JavaUtilMap>)eventObject
                withNSObjectArray:(IOSObjectArray *)params {
  NSString *event = (NSString *) cast_chk([((id<JavaUtilMap>) nil_chk(eventObject)) getWithId:@"event"], [NSString class]);
  switch (JreIndexOfStr(event, (id[]){ @"increment", @"decrement", @"toggle" }, 3)) {
    case 0:
    ASJavaEventCommand_executeCommandWithASIWidget_withJavaUtilMap_withASJavaEventCommand_SingleParamFunction_(self, widget, eventObject, create_ASJavaEventCommand_$Lambda$1_initWithASJavaEventCommand_(self));
    break;
    case 1:
    ASJavaEventCommand_executeCommandWithASIWidget_withJavaUtilMap_withASJavaEventCommand_SingleParamFunction_(self, widget, eventObject, create_ASJavaEventCommand_$Lambda$2_initWithASJavaEventCommand_(self));
    break;
    case 2:
    ASJavaEventCommand_executeCommandWithASIWidget_withJavaUtilMap_withASJavaEventCommand_SingleParamFunction_(self, widget, eventObject, create_ASJavaEventCommand_$Lambda$3_initWithASJavaEventCommand_(self));
    break;
  }
  return nil;
}

- (void)executeCommandWithASIWidget:(id<ASIWidget>)widget
                    withJavaUtilMap:(id<JavaUtilMap>)eventObject
withASJavaEventCommand_SingleParamFunction:(id<ASJavaEventCommand_SingleParamFunction>)func {
  ASJavaEventCommand_executeCommandWithASIWidget_withJavaUtilMap_withASJavaEventCommand_SingleParamFunction_(self, widget, eventObject, func);
}

- (void)storeObjectWithASIWidget:(id<ASIWidget>)widget
                    withNSString:(NSString *)storeExpression
                          withId:(id)result {
  ASJavaEventCommand_storeObjectWithASIWidget_withNSString_withId_(self, widget, storeExpression, result);
}

- (id)getObjectWithASIWidget:(id<ASIWidget>)widget
                withNSString:(NSString *)expression {
  return ASJavaEventCommand_getObjectWithASIWidget_withNSString_(self, widget, expression);
}

- (jfloat)getFloatWithId:(id)modelVal {
  return ASJavaEventCommand_getFloatWithId_(self, modelVal);
}

- (id)incrementWithASIWidget:(id<ASIWidget>)widget
                      withId:(id)modelVal
             withJavaUtilMap:(id<JavaUtilMap>)configMap {
  return ASJavaEventCommand_incrementWithASIWidget_withId_withJavaUtilMap_(self, widget, modelVal, configMap);
}

- (id)decrementWithASIWidget:(id<ASIWidget>)widget
                      withId:(id)modelVal
             withJavaUtilMap:(id<JavaUtilMap>)configMap {
  return ASJavaEventCommand_decrementWithASIWidget_withId_withJavaUtilMap_(self, widget, modelVal, configMap);
}

- (id)toggleWithASIWidget:(id<ASIWidget>)widget
                   withId:(id)modelVal
          withJavaUtilMap:(id<JavaUtilMap>)configMap {
  return ASJavaEventCommand_toggleWithASIWidget_withId_withJavaUtilMap_(self, widget, modelVal, configMap);
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x81, 0, 1, -1, 2, -1, -1 },
    { NULL, "V", 0x2, 0, 3, -1, 4, -1, -1 },
    { NULL, "V", 0x2, 5, 6, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x2, 7, 8, -1, -1, -1, -1 },
    { NULL, "F", 0x2, 9, 10, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x2, 11, 12, -1, 13, -1, -1 },
    { NULL, "LNSObject;", 0x2, 14, 12, -1, 13, -1, -1 },
    { NULL, "LNSObject;", 0x2, 15, 12, -1, 13, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(executeCommandWithASIWidget:withJavaUtilMap:withNSObjectArray:);
  methods[2].selector = @selector(executeCommandWithASIWidget:withJavaUtilMap:withASJavaEventCommand_SingleParamFunction:);
  methods[3].selector = @selector(storeObjectWithASIWidget:withNSString:withId:);
  methods[4].selector = @selector(getObjectWithASIWidget:withNSString:);
  methods[5].selector = @selector(getFloatWithId:);
  methods[6].selector = @selector(incrementWithASIWidget:withId:withJavaUtilMap:);
  methods[7].selector = @selector(decrementWithASIWidget:withId:withJavaUtilMap:);
  methods[8].selector = @selector(toggleWithASIWidget:withId:withJavaUtilMap:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "executeCommand", "LASIWidget;LJavaUtilMap;[LNSObject;", "(Lcom/ashera/widget/IWidget;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;[Ljava/lang/Object;)Ljava/lang/Object;", "LASIWidget;LJavaUtilMap;LASJavaEventCommand_SingleParamFunction;", "(Lcom/ashera/widget/IWidget;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Lcom/ashera/converter/JavaEventCommand$SingleParamFunction;)V", "storeObject", "LASIWidget;LNSString;LNSObject;", "getObject", "LASIWidget;LNSString;", "getFloat", "LNSObject;", "increment", "LASIWidget;LNSObject;LJavaUtilMap;", "(Lcom/ashera/widget/IWidget;Ljava/lang/Object;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljava/lang/Object;", "decrement", "toggle", "LASJavaEventCommand_SingleParamFunction;" };
  static const J2ObjcClassInfo _ASJavaEventCommand = { "JavaEventCommand", "com.ashera.converter", ptrTable, methods, NULL, 7, 0x1, 9, 0, -1, 16, -1, -1, -1 };
  return &_ASJavaEventCommand;
}

@end

void ASJavaEventCommand_init(ASJavaEventCommand *self) {
  NSObject_init(self);
}

ASJavaEventCommand *new_ASJavaEventCommand_init() {
  J2OBJC_NEW_IMPL(ASJavaEventCommand, init)
}

ASJavaEventCommand *create_ASJavaEventCommand_init() {
  J2OBJC_CREATE_IMPL(ASJavaEventCommand, init)
}

void ASJavaEventCommand_executeCommandWithASIWidget_withJavaUtilMap_withASJavaEventCommand_SingleParamFunction_(ASJavaEventCommand *self, id<ASIWidget> widget, id<JavaUtilMap> eventObject, id<ASJavaEventCommand_SingleParamFunction> func) {
  NSString *eventParams = (NSString *) cast_chk([((id<JavaUtilMap>) nil_chk(eventObject)) getWithId:@"eventParams"], [NSString class]);
  if (eventParams != nil) {
    id<JavaUtilMap> configMap = ASModelExpressionParser_parseSimpleCssExpressionWithNSString_(eventParams);
    NSString *getExpression = (NSString *) cast_chk([((id<JavaUtilMap>) nil_chk(configMap)) getWithId:@"exp_get"], [NSString class]);
    NSString *storeExpression = (NSString *) cast_chk([configMap getWithId:@"exp_store"], [NSString class]);
    id modelVal = ASJavaEventCommand_getObjectWithASIWidget_withNSString_(self, widget, getExpression);
    id result = JreRetainedLocalValue([((id<ASJavaEventCommand_SingleParamFunction>) nil_chk(func)) applyWithASIWidget:widget withId:modelVal withJavaUtilMap:configMap]);
    ASJavaEventCommand_storeObjectWithASIWidget_withNSString_withId_(self, widget, storeExpression, result);
  }
}

void ASJavaEventCommand_storeObjectWithASIWidget_withNSString_withId_(ASJavaEventCommand *self, id<ASIWidget> widget, NSString *storeExpression, id result) {
  ASModelExpressionParser_ModelUpdateToScopeHolder *modelUpdateToScopeHolder = ASModelExpressionParser_parseModelUpdateToScopeWithNSString_(storeExpression);
  NSString *varPath = JreRetainedLocalValue(((ASModelExpressionParser_ModelUpdateToScopeHolder *) nil_chk(modelUpdateToScopeHolder))->varPath_);
  NSString *varName = JreRetainedLocalValue(modelUpdateToScopeHolder->varName_);
  ASModelScope *varScope = JreRetainedLocalValue(modelUpdateToScopeHolder->varScope_);
  result = ASModelStore_changeModelDataTypeWithASModelDataType_withId_(modelUpdateToScopeHolder->varType_, result);
  if ([((NSString *) nil_chk(varPath)) isEqual:@"."]) {
    [((id<ASIWidget>) nil_chk(widget)) storeModelToScopeWithNSString:varName withASModelScope:varScope withId:result];
  }
  else {
    id obj = JreRetainedLocalValue([((id<ASIWidget>) nil_chk(widget)) getModelFromScopeWithNSString:varName withASModelScope:varScope]);
    [widget updateModelByPathWithNSString:varPath withId:result withId:obj];
  }
}

id ASJavaEventCommand_getObjectWithASIWidget_withNSString_(ASJavaEventCommand *self, id<ASIWidget> widget, NSString *expression) {
  ASModelExpressionParser_ModelFromScopeHolder *modelFromScopeHolder = ASModelExpressionParser_parseModelFromScopeWithNSString_(expression);
  NSString *varPath = JreRetainedLocalValue(((ASModelExpressionParser_ModelFromScopeHolder *) nil_chk(modelFromScopeHolder))->varPath_);
  NSString *varName = JreRetainedLocalValue(modelFromScopeHolder->varName_);
  ASModelScope *varScope = JreRetainedLocalValue(modelFromScopeHolder->varScope_);
  id obj = JreRetainedLocalValue([((id<ASIWidget>) nil_chk(widget)) getModelFromScopeWithNSString:varName withASModelScope:varScope]);
  obj = [widget getModelByPathWithNSString:varPath withId:obj];
  return obj;
}

jfloat ASJavaEventCommand_getFloatWithId_(ASJavaEventCommand *self, id modelVal) {
  jfloat val = 0;
  @try {
    val = [((JavaLangFloat *) nil_chk(ASPluginInvoker_getFloatWithId_(modelVal))) floatValue];
  }
  @catch (JavaLangNumberFormatException *e) {
  }
  return val;
}

id ASJavaEventCommand_incrementWithASIWidget_withId_withJavaUtilMap_(ASJavaEventCommand *self, id<ASIWidget> widget, id modelVal, id<JavaUtilMap> configMap) {
  jfloat val = ASJavaEventCommand_getFloatWithId_(self, modelVal);
  jfloat increment = 1;
  if ([((id<JavaUtilMap>) nil_chk(configMap)) containsKeyWithId:@"inc"]) {
    increment = ASJavaEventCommand_getFloatWithId_(self, [configMap getWithId:@"inc"]);
  }
  if ([configMap containsKeyWithId:@"exp_inc"]) {
    increment = ASJavaEventCommand_getFloatWithId_(self, ASJavaEventCommand_getObjectWithASIWidget_withNSString_(self, widget, (NSString *) cast_chk([configMap getWithId:@"exp_inc"], [NSString class])));
  }
  JrePlusAssignFloatF(&val, increment);
  if ([configMap containsKeyWithId:@"max"]) {
    jfloat max = ASJavaEventCommand_getFloatWithId_(self, [configMap getWithId:@"max"]);
    if (val > max) {
      val = max;
    }
  }
  if ([configMap containsKeyWithId:@"exp_max"]) {
    jfloat max = ASJavaEventCommand_getFloatWithId_(self, ASJavaEventCommand_getObjectWithASIWidget_withNSString_(self, widget, (NSString *) cast_chk([configMap getWithId:@"exp_max"], [NSString class])));
    if (val > max) {
      val = max;
    }
  }
  return JavaLangFloat_valueOfWithFloat_(val);
}

id ASJavaEventCommand_decrementWithASIWidget_withId_withJavaUtilMap_(ASJavaEventCommand *self, id<ASIWidget> widget, id modelVal, id<JavaUtilMap> configMap) {
  jfloat val = ASJavaEventCommand_getFloatWithId_(self, modelVal);
  jfloat decrement = 1;
  if ([((id<JavaUtilMap>) nil_chk(configMap)) containsKeyWithId:@"dec"]) {
    decrement = ASJavaEventCommand_getFloatWithId_(self, [configMap getWithId:@"dec"]);
  }
  if ([configMap containsKeyWithId:@"dec_inc"]) {
    decrement = ASJavaEventCommand_getFloatWithId_(self, ASJavaEventCommand_getObjectWithASIWidget_withNSString_(self, widget, (NSString *) cast_chk([configMap getWithId:@"dec_inc"], [NSString class])));
  }
  JreMinusAssignFloatF(&val, decrement);
  if ([configMap containsKeyWithId:@"min"]) {
    jfloat min = ASJavaEventCommand_getFloatWithId_(self, [configMap getWithId:@"min"]);
    if (val < min) {
      val = min;
    }
  }
  if ([configMap containsKeyWithId:@"exp_min"]) {
    jfloat min = ASJavaEventCommand_getFloatWithId_(self, ASJavaEventCommand_getObjectWithASIWidget_withNSString_(self, widget, (NSString *) cast_chk([configMap getWithId:@"exp_min"], [NSString class])));
    if (val < min) {
      val = min;
    }
  }
  return JavaLangFloat_valueOfWithFloat_(val);
}

id ASJavaEventCommand_toggleWithASIWidget_withId_withJavaUtilMap_(ASJavaEventCommand *self, id<ASIWidget> widget, id modelVal, id<JavaUtilMap> configMap) {
  JavaLangBoolean *val = ASPluginInvoker_getBooleanWithId_(modelVal);
  return val != nil && [val booleanValue] ? JreLoadStatic(JavaLangBoolean, FALSE) : JreLoadStatic(JavaLangBoolean, TRUE);
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASJavaEventCommand)

@implementation ASJavaEventCommand_SingleParamFunction

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "LNSObject;", 0x401, 0, 1, -1, 2, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(applyWithASIWidget:withId:withJavaUtilMap:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "apply", "LASIWidget;LNSObject;LJavaUtilMap;", "(Lcom/ashera/widget/IWidget;Ljava/lang/Object;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljava/lang/Object;", "LASJavaEventCommand;" };
  static const J2ObjcClassInfo _ASJavaEventCommand_SingleParamFunction = { "SingleParamFunction", "com.ashera.converter", ptrTable, methods, NULL, 7, 0x608, 1, 0, 3, -1, -1, -1, -1 };
  return &_ASJavaEventCommand_SingleParamFunction;
}

@end

J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ASJavaEventCommand_SingleParamFunction)

@implementation ASJavaEventCommand_$Lambda$1

- (id)applyWithASIWidget:(id<ASIWidget>)a
                  withId:(id)b
         withJavaUtilMap:(id<JavaUtilMap>)c {
  return ASJavaEventCommand_incrementWithASIWidget_withId_withJavaUtilMap_(target$_, a, b, c);
}

- (void)dealloc {
  RELEASE_(target$_);
  [super dealloc];
}

@end

void ASJavaEventCommand_$Lambda$1_initWithASJavaEventCommand_(ASJavaEventCommand_$Lambda$1 *self, ASJavaEventCommand *outer$) {
  JreStrongAssign(&self->target$_, outer$);
  NSObject_init(self);
}

ASJavaEventCommand_$Lambda$1 *new_ASJavaEventCommand_$Lambda$1_initWithASJavaEventCommand_(ASJavaEventCommand *outer$) {
  J2OBJC_NEW_IMPL(ASJavaEventCommand_$Lambda$1, initWithASJavaEventCommand_, outer$)
}

ASJavaEventCommand_$Lambda$1 *create_ASJavaEventCommand_$Lambda$1_initWithASJavaEventCommand_(ASJavaEventCommand *outer$) {
  J2OBJC_CREATE_IMPL(ASJavaEventCommand_$Lambda$1, initWithASJavaEventCommand_, outer$)
}

@implementation ASJavaEventCommand_$Lambda$2

- (id)applyWithASIWidget:(id<ASIWidget>)a
                  withId:(id)b
         withJavaUtilMap:(id<JavaUtilMap>)c {
  return ASJavaEventCommand_decrementWithASIWidget_withId_withJavaUtilMap_(target$_, a, b, c);
}

- (void)dealloc {
  RELEASE_(target$_);
  [super dealloc];
}

@end

void ASJavaEventCommand_$Lambda$2_initWithASJavaEventCommand_(ASJavaEventCommand_$Lambda$2 *self, ASJavaEventCommand *outer$) {
  JreStrongAssign(&self->target$_, outer$);
  NSObject_init(self);
}

ASJavaEventCommand_$Lambda$2 *new_ASJavaEventCommand_$Lambda$2_initWithASJavaEventCommand_(ASJavaEventCommand *outer$) {
  J2OBJC_NEW_IMPL(ASJavaEventCommand_$Lambda$2, initWithASJavaEventCommand_, outer$)
}

ASJavaEventCommand_$Lambda$2 *create_ASJavaEventCommand_$Lambda$2_initWithASJavaEventCommand_(ASJavaEventCommand *outer$) {
  J2OBJC_CREATE_IMPL(ASJavaEventCommand_$Lambda$2, initWithASJavaEventCommand_, outer$)
}

@implementation ASJavaEventCommand_$Lambda$3

- (id)applyWithASIWidget:(id<ASIWidget>)a
                  withId:(id)b
         withJavaUtilMap:(id<JavaUtilMap>)c {
  return ASJavaEventCommand_toggleWithASIWidget_withId_withJavaUtilMap_(target$_, a, b, c);
}

- (void)dealloc {
  RELEASE_(target$_);
  [super dealloc];
}

@end

void ASJavaEventCommand_$Lambda$3_initWithASJavaEventCommand_(ASJavaEventCommand_$Lambda$3 *self, ASJavaEventCommand *outer$) {
  JreStrongAssign(&self->target$_, outer$);
  NSObject_init(self);
}

ASJavaEventCommand_$Lambda$3 *new_ASJavaEventCommand_$Lambda$3_initWithASJavaEventCommand_(ASJavaEventCommand *outer$) {
  J2OBJC_NEW_IMPL(ASJavaEventCommand_$Lambda$3, initWithASJavaEventCommand_, outer$)
}

ASJavaEventCommand_$Lambda$3 *create_ASJavaEventCommand_$Lambda$3_initWithASJavaEventCommand_(ASJavaEventCommand *outer$) {
  J2OBJC_CREATE_IMPL(ASJavaEventCommand_$Lambda$3, initWithASJavaEventCommand_, outer$)
}
