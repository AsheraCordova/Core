//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\model\ExpressionMethodHandler.java
//

#include "BaseWidget.h"
#include "ExpressionMethodHandler.h"
#include "IFlatMap.h"
#include "IFragment.h"
#include "IOSClass.h"
#include "IOSObjectArray.h"
#include "IWidget.h"
#include "J2ObjC_source.h"
#include "MethodHandler.h"
#include "MethodHandlerFactory.h"
#include "ModelDataType.h"
#include "ModelExpressionParser.h"
#include "ModelScope.h"
#include "ModelStore.h"
#include "PluginInvoker.h"
#include "java/lang/Boolean.h"
#include "java/lang/Double.h"
#include "java/lang/Float.h"
#include "java/lang/Integer.h"
#include "java/lang/RuntimeException.h"
#include "java/lang/System.h"
#include "java/text/DecimalFormat.h"
#include "java/text/ParseException.h"
#include "java/text/SimpleDateFormat.h"
#include "java/util/ArrayList.h"
#include "java/util/Date.h"
#include "java/util/List.h"
#include "java/util/Map.h"

@protocol JavaUtilMap;


@interface ASExpressionMethodHandler ()

+ (id)ternaryWithASIWidget:(id<ASIWidget>)widget
                    withId:(id)obj
           withJavaUtilMap:(id<JavaUtilMap>)configMap;

+ (id)baseElapsedTimeInMillisWithASIWidget:(id<ASIWidget>)widget
                                    withId:(id)obj
                           withJavaUtilMap:(id<JavaUtilMap>)configMap;

+ (id)getDescFromResWithId:(id)obj
             withASIWidget:(id<ASIWidget>)widget
           withJavaUtilMap:(id<JavaUtilMap>)configMap;

+ (id)formatStringWithId:(id)obj
           withASIWidget:(id<ASIWidget>)widget
         withJavaUtilMap:(id<JavaUtilMap>)configMap;

+ (id)getDescFromModelWithId:(id)obj
               withASIWidget:(id<ASIWidget>)widget
             withJavaUtilMap:(id<JavaUtilMap>)configMap;

+ (id)sizeWithId:(id)obj;

+ (id)concatWithId:(id)obj
     withASIWidget:(id<ASIWidget>)widget
   withJavaUtilMap:(id<JavaUtilMap>)configMap;

+ (id)listToStringWithId:(id)obj
         withJavaUtilMap:(id<JavaUtilMap>)configMap;

+ (id)not__WithId:(id)obj;

+ (id)totalWithASIWidget:(id<ASIWidget>)widget
                  withId:(id)obj
         withJavaUtilMap:(id<JavaUtilMap>)configMap;

+ (NSString *)getDelimiterWithJavaUtilMap:(id<JavaUtilMap>)configMap;

+ (id<JavaUtilMap>)getMapWithId:(id)obj;

+ (id)multiplyWithASIWidget:(id<ASIWidget>)w
                     withId:(id)obj
            withJavaUtilMap:(id<JavaUtilMap>)configMap;

+ (id)getFileAssetWithId:(id)obj
           withASIWidget:(id<ASIWidget>)widget
         withJavaUtilMap:(id<JavaUtilMap>)configMap;

@end

__attribute__((unused)) static id ASExpressionMethodHandler_ternaryWithASIWidget_withId_withJavaUtilMap_(id<ASIWidget> widget, id obj, id<JavaUtilMap> configMap);

__attribute__((unused)) static id ASExpressionMethodHandler_baseElapsedTimeInMillisWithASIWidget_withId_withJavaUtilMap_(id<ASIWidget> widget, id obj, id<JavaUtilMap> configMap);

__attribute__((unused)) static id ASExpressionMethodHandler_getDescFromResWithId_withASIWidget_withJavaUtilMap_(id obj, id<ASIWidget> widget, id<JavaUtilMap> configMap);

__attribute__((unused)) static id ASExpressionMethodHandler_formatStringWithId_withASIWidget_withJavaUtilMap_(id obj, id<ASIWidget> widget, id<JavaUtilMap> configMap);

__attribute__((unused)) static id ASExpressionMethodHandler_getDescFromModelWithId_withASIWidget_withJavaUtilMap_(id obj, id<ASIWidget> widget, id<JavaUtilMap> configMap);

__attribute__((unused)) static id ASExpressionMethodHandler_sizeWithId_(id obj);

__attribute__((unused)) static id ASExpressionMethodHandler_concatWithId_withASIWidget_withJavaUtilMap_(id obj, id<ASIWidget> widget, id<JavaUtilMap> configMap);

__attribute__((unused)) static id ASExpressionMethodHandler_listToStringWithId_withJavaUtilMap_(id obj, id<JavaUtilMap> configMap);

__attribute__((unused)) static id ASExpressionMethodHandler_not__WithId_(id obj);

__attribute__((unused)) static id ASExpressionMethodHandler_totalWithASIWidget_withId_withJavaUtilMap_(id<ASIWidget> widget, id obj, id<JavaUtilMap> configMap);

__attribute__((unused)) static NSString *ASExpressionMethodHandler_getDelimiterWithJavaUtilMap_(id<JavaUtilMap> configMap);

__attribute__((unused)) static id<JavaUtilMap> ASExpressionMethodHandler_getMapWithId_(id obj);

__attribute__((unused)) static id ASExpressionMethodHandler_multiplyWithASIWidget_withId_withJavaUtilMap_(id<ASIWidget> w, id obj, id<JavaUtilMap> configMap);

__attribute__((unused)) static id ASExpressionMethodHandler_getFileAssetWithId_withASIWidget_withJavaUtilMap_(id obj, id<ASIWidget> widget, id<JavaUtilMap> configMap);

@implementation ASExpressionMethodHandler

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASExpressionMethodHandler_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

+ (id)getValueWithNSString:(NSString *)methodName
                    withId:(id)obj
             withASIWidget:(id<ASIWidget>)widget {
  return ASExpressionMethodHandler_getValueWithNSString_withId_withASIWidget_(methodName, obj, widget);
}

+ (id)ternaryWithASIWidget:(id<ASIWidget>)widget
                    withId:(id)obj
           withJavaUtilMap:(id<JavaUtilMap>)configMap {
  return ASExpressionMethodHandler_ternaryWithASIWidget_withId_withJavaUtilMap_(widget, obj, configMap);
}

+ (id)baseElapsedTimeInMillisWithASIWidget:(id<ASIWidget>)widget
                                    withId:(id)obj
                           withJavaUtilMap:(id<JavaUtilMap>)configMap {
  return ASExpressionMethodHandler_baseElapsedTimeInMillisWithASIWidget_withId_withJavaUtilMap_(widget, obj, configMap);
}

+ (id)getDescFromResWithId:(id)obj
             withASIWidget:(id<ASIWidget>)widget
           withJavaUtilMap:(id<JavaUtilMap>)configMap {
  return ASExpressionMethodHandler_getDescFromResWithId_withASIWidget_withJavaUtilMap_(obj, widget, configMap);
}

+ (id)formatStringWithId:(id)obj
           withASIWidget:(id<ASIWidget>)widget
         withJavaUtilMap:(id<JavaUtilMap>)configMap {
  return ASExpressionMethodHandler_formatStringWithId_withASIWidget_withJavaUtilMap_(obj, widget, configMap);
}

+ (id)getDescFromModelWithId:(id)obj
               withASIWidget:(id<ASIWidget>)widget
             withJavaUtilMap:(id<JavaUtilMap>)configMap {
  return ASExpressionMethodHandler_getDescFromModelWithId_withASIWidget_withJavaUtilMap_(obj, widget, configMap);
}

+ (id)sizeWithId:(id)obj {
  return ASExpressionMethodHandler_sizeWithId_(obj);
}

+ (id)concatWithId:(id)obj
     withASIWidget:(id<ASIWidget>)widget
   withJavaUtilMap:(id<JavaUtilMap>)configMap {
  return ASExpressionMethodHandler_concatWithId_withASIWidget_withJavaUtilMap_(obj, widget, configMap);
}

+ (id)listToStringWithId:(id)obj
         withJavaUtilMap:(id<JavaUtilMap>)configMap {
  return ASExpressionMethodHandler_listToStringWithId_withJavaUtilMap_(obj, configMap);
}

+ (id)not__WithId:(id)obj {
  return ASExpressionMethodHandler_not__WithId_(obj);
}

+ (id)totalWithASIWidget:(id<ASIWidget>)widget
                  withId:(id)obj
         withJavaUtilMap:(id<JavaUtilMap>)configMap {
  return ASExpressionMethodHandler_totalWithASIWidget_withId_withJavaUtilMap_(widget, obj, configMap);
}

+ (NSString *)getDelimiterWithJavaUtilMap:(id<JavaUtilMap>)configMap {
  return ASExpressionMethodHandler_getDelimiterWithJavaUtilMap_(configMap);
}

+ (id<JavaUtilMap>)getMapWithId:(id)obj {
  return ASExpressionMethodHandler_getMapWithId_(obj);
}

+ (jboolean)isVisibleWithId:(id)obj {
  return ASExpressionMethodHandler_isVisibleWithId_(obj);
}

+ (id)multiplyWithASIWidget:(id<ASIWidget>)w
                     withId:(id)obj
            withJavaUtilMap:(id<JavaUtilMap>)configMap {
  return ASExpressionMethodHandler_multiplyWithASIWidget_withId_withJavaUtilMap_(w, obj, configMap);
}

+ (id)getFileAssetWithId:(id)obj
           withASIWidget:(id<ASIWidget>)widget
         withJavaUtilMap:(id<JavaUtilMap>)configMap {
  return ASExpressionMethodHandler_getFileAssetWithId_withASIWidget_withJavaUtilMap_(obj, widget, configMap);
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x9, 0, 1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0xa, 2, 3, -1, 4, -1, -1 },
    { NULL, "LNSObject;", 0xa, 5, 3, -1, 4, -1, -1 },
    { NULL, "LNSObject;", 0xa, 6, 7, -1, 8, -1, -1 },
    { NULL, "LNSObject;", 0xa, 9, 7, -1, 8, -1, -1 },
    { NULL, "LNSObject;", 0xa, 10, 7, -1, 8, -1, -1 },
    { NULL, "LNSObject;", 0xa, 11, 12, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0xa, 13, 7, -1, 8, -1, -1 },
    { NULL, "LNSObject;", 0xa, 14, 15, -1, 16, -1, -1 },
    { NULL, "LNSObject;", 0xa, 17, 12, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0xa, 18, 3, -1, 4, -1, -1 },
    { NULL, "LNSString;", 0xa, 19, 20, -1, 21, -1, -1 },
    { NULL, "LJavaUtilMap;", 0xa, 22, 12, -1, 23, -1, -1 },
    { NULL, "Z", 0x9, 24, 12, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0xa, 25, 3, -1, 4, -1, -1 },
    { NULL, "LNSObject;", 0xa, 26, 7, -1, 8, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(getValueWithNSString:withId:withASIWidget:);
  methods[2].selector = @selector(ternaryWithASIWidget:withId:withJavaUtilMap:);
  methods[3].selector = @selector(baseElapsedTimeInMillisWithASIWidget:withId:withJavaUtilMap:);
  methods[4].selector = @selector(getDescFromResWithId:withASIWidget:withJavaUtilMap:);
  methods[5].selector = @selector(formatStringWithId:withASIWidget:withJavaUtilMap:);
  methods[6].selector = @selector(getDescFromModelWithId:withASIWidget:withJavaUtilMap:);
  methods[7].selector = @selector(sizeWithId:);
  methods[8].selector = @selector(concatWithId:withASIWidget:withJavaUtilMap:);
  methods[9].selector = @selector(listToStringWithId:withJavaUtilMap:);
  methods[10].selector = @selector(not__WithId:);
  methods[11].selector = @selector(totalWithASIWidget:withId:withJavaUtilMap:);
  methods[12].selector = @selector(getDelimiterWithJavaUtilMap:);
  methods[13].selector = @selector(getMapWithId:);
  methods[14].selector = @selector(isVisibleWithId:);
  methods[15].selector = @selector(multiplyWithASIWidget:withId:withJavaUtilMap:);
  methods[16].selector = @selector(getFileAssetWithId:withASIWidget:withJavaUtilMap:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "getValue", "LNSString;LNSObject;LASIWidget;", "ternary", "LASIWidget;LNSObject;LJavaUtilMap;", "(Lcom/ashera/widget/IWidget;Ljava/lang/Object;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljava/lang/Object;", "baseElapsedTimeInMillis", "getDescFromRes", "LNSObject;LASIWidget;LJavaUtilMap;", "(Ljava/lang/Object;Lcom/ashera/widget/IWidget;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljava/lang/Object;", "formatString", "getDescFromModel", "size", "LNSObject;", "concat", "listToString", "LNSObject;LJavaUtilMap;", "(Ljava/lang/Object;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljava/lang/Object;", "not", "total", "getDelimiter", "LJavaUtilMap;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljava/lang/String;", "getMap", "(Ljava/lang/Object;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", "isVisible", "multiply", "getFileAsset" };
  static const J2ObjcClassInfo _ASExpressionMethodHandler = { "ExpressionMethodHandler", "com.ashera.model", ptrTable, methods, NULL, 7, 0x1, 17, 0, -1, -1, -1, -1, -1 };
  return &_ASExpressionMethodHandler;
}

@end

void ASExpressionMethodHandler_init(ASExpressionMethodHandler *self) {
  NSObject_init(self);
}

ASExpressionMethodHandler *new_ASExpressionMethodHandler_init() {
  J2OBJC_NEW_IMPL(ASExpressionMethodHandler, init)
}

ASExpressionMethodHandler *create_ASExpressionMethodHandler_init() {
  J2OBJC_CREATE_IMPL(ASExpressionMethodHandler, init)
}

id ASExpressionMethodHandler_getValueWithNSString_withId_withASIWidget_(NSString *methodName, id obj, id<ASIWidget> widget) {
  ASExpressionMethodHandler_initialize();
  NSString *params = JreRetainedLocalValue([((id<ASIWidget>) nil_chk(widget)) getModelPojoToUiParams]);
  id<JavaUtilMap> configMap = nil;
  if (params != nil) {
    configMap = ASModelExpressionParser_parseSimpleCssExpressionWithNSString_(params);
  }
  id val = nil;
  {
    id<JavaUtilList> handlers;
    switch (JreIndexOfStr(methodName, (id[]){ @"toString", @"not", @"ternary", @"listToString", @"concat", @"size", @"visible", @"gone", @"getDescFromModel", @"formatString", @"getDescFromRes", @"multiply", @"total", @"baseElapsedTimeInMillis", @"getFileAsset" }, 15)) {
      case 0:
      {
        val = ASPluginInvoker_getStringWithId_(obj);
        break;
      }
      case 1:
      {
        val = ASExpressionMethodHandler_not__WithId_(obj);
        break;
      }
      case 2:
      {
        val = ASExpressionMethodHandler_ternaryWithASIWidget_withId_withJavaUtilMap_(widget, obj, configMap);
        break;
      }
      case 3:
      {
        val = ASExpressionMethodHandler_listToStringWithId_withJavaUtilMap_(obj, configMap);
        break;
      }
      case 4:
      {
        val = ASExpressionMethodHandler_concatWithId_withASIWidget_withJavaUtilMap_(obj, widget, configMap);
        break;
      }
      case 5:
      {
        val = ASExpressionMethodHandler_sizeWithId_(obj);
        break;
      }
      case 6:
      {
        val = ASExpressionMethodHandler_isVisibleWithId_(obj) ? @"visible" : @"gone";
        break;
      }
      case 7:
      {
        val = ASExpressionMethodHandler_isVisibleWithId_(obj) ? @"gone" : @"visible";
        break;
      }
      case 8:
      {
        val = ASExpressionMethodHandler_getDescFromModelWithId_withASIWidget_withJavaUtilMap_(obj, widget, configMap);
        break;
      }
      case 9:
      {
        val = ASExpressionMethodHandler_formatStringWithId_withASIWidget_withJavaUtilMap_(obj, widget, configMap);
        break;
      }
      case 10:
      {
        val = ASExpressionMethodHandler_getDescFromResWithId_withASIWidget_withJavaUtilMap_(obj, widget, configMap);
        break;
      }
      case 11:
      {
        val = ASExpressionMethodHandler_multiplyWithASIWidget_withId_withJavaUtilMap_(widget, obj, configMap);
        break;
      }
      case 12:
      {
        val = ASExpressionMethodHandler_totalWithASIWidget_withId_withJavaUtilMap_(widget, obj, configMap);
        break;
      }
      case 13:
      {
        val = ASExpressionMethodHandler_baseElapsedTimeInMillisWithASIWidget_withId_withJavaUtilMap_(widget, obj, configMap);
        break;
      }
      case 14:
      {
        val = ASExpressionMethodHandler_getFileAssetWithId_withASIWidget_withJavaUtilMap_(obj, widget, configMap);
        break;
      }
      default:
      handlers = ASMethodHandlerFactory_getRegistrations();
      for (id<ASMethodHandler> __strong methodHandler in nil_chk(handlers)) {
        id result = JreRetainedLocalValue([((id<ASMethodHandler>) nil_chk(methodHandler)) handleWithNSString:methodName withId:obj withASIWidget:widget]);
        if (result != ASMethodHandler_UNHANDLED) {
          val = result;
          break;
        }
      }
      break;
    }
  }
  if (configMap != nil && [configMap containsKeyWithId:@"numberFormat"]) {
    if ([val isKindOfClass:[NSString class]]) {
      val = JavaLangDouble_valueOfWithDouble_(JavaLangDouble_parseDoubleWithNSString_((NSString *) val));
    }
    JavaTextDecimalFormat *d = create_JavaTextDecimalFormat_initWithNSString_((NSString *) cast_chk([configMap getWithId:@"numberFormat"], [NSString class]));
    val = [d formatWithId:val];
  }
  if (configMap != nil && [configMap containsKeyWithId:@"dateFormat"]) {
    JavaTextSimpleDateFormat *d = create_JavaTextSimpleDateFormat_initWithNSString_((NSString *) cast_chk([configMap getWithId:@"dateFormat"], [NSString class]));
    val = [d formatWithId:val];
  }
  ASModelDataType *modelDataType = nil;
  if (configMap != nil) {
    NSString *finalResultType = (NSString *) cast_chk([configMap getWithId:@"varType"], [NSString class]);
    if (finalResultType != nil) {
      modelDataType = ASModelDataType_valueOfWithNSString_(finalResultType);
    }
  }
  if (modelDataType == nil) {
    modelDataType = JreLoadEnum(ASModelDataType, string);
  }
  val = ASModelStore_changeModelDataTypeWithASModelDataType_withId_(modelDataType, val);
  if (configMap != nil) {
    NSString *varPath = (NSString *) cast_chk([configMap getWithId:@"varPath"], [NSString class]);
    if (varPath != nil) {
      [widget updateModelByPathWithNSString:varPath withId:val withId:obj];
    }
  }
  return val;
}

id ASExpressionMethodHandler_ternaryWithASIWidget_withId_withJavaUtilMap_(id<ASIWidget> widget, id obj, id<JavaUtilMap> configMap) {
  ASExpressionMethodHandler_initialize();
  id positive = JreRetainedLocalValue([((id<JavaUtilMap>) nil_chk(configMap)) getWithId:@"true"]);
  id negtive = JreRetainedLocalValue([configMap getWithId:@"false"]);
  id result = JreRetainedLocalValue(negtive);
  if (([obj isKindOfClass:[JavaLangBoolean class]] && [((JavaLangBoolean *) nil_chk((JavaLangBoolean *) cast_chk(obj, [JavaLangBoolean class]))) booleanValue])) {
    result = positive;
  }
  if ([((JavaLangBoolean *) nil_chk(ASPluginInvoker_getBooleanWithId_(obj))) booleanValue]) {
    result = positive;
  }
  return [((id<ASIWidget>) nil_chk(widget)) quickConvertWithId:result withNSString:@"resourcestring"];
}

id ASExpressionMethodHandler_baseElapsedTimeInMillisWithASIWidget_withId_withJavaUtilMap_(id<ASIWidget> widget, id obj, id<JavaUtilMap> configMap) {
  ASExpressionMethodHandler_initialize();
  NSString *dateFormat = @"dd/MM/yyyy HH:mm";
  jint defaultValue = 0;
  jboolean allowNegativeValues = false;
  if (configMap != nil) {
    if ([configMap containsKeyWithId:@"dateFormat"]) {
      dateFormat = (NSString *) cast_chk([configMap getWithId:@"dateFormat"], [NSString class]);
    }
    if ([configMap containsKeyWithId:@"defaultValue"]) {
      defaultValue = JavaLangInteger_parseIntWithNSString_((NSString *) cast_chk([configMap getWithId:@"defaultValue"], [NSString class]));
    }
    if ([configMap containsKeyWithId:@"allowNegativeValues"]) {
      allowNegativeValues = [nil_chk([configMap getWithId:@"allowNegativeValues"]) isEqual:@"true"];
    }
  }
  if (obj == nil) {
    return JavaLangInteger_valueOfWithInt_(defaultValue);
  }
  JavaTextSimpleDateFormat *sdateFormat = create_JavaTextSimpleDateFormat_initWithNSString_(dateFormat);
  @try {
    JavaUtilDate *d = JreRetainedLocalValue([sdateFormat parseWithNSString:(NSString *) cast_chk(obj, [NSString class])]);
    jint timeInMillis = (jint) ([((JavaUtilDate *) nil_chk(d)) getTime] - JavaLangSystem_currentTimeMillis());
    if (!allowNegativeValues && timeInMillis < 0) {
      timeInMillis = 0;
    }
    return JavaLangInteger_valueOfWithInt_(timeInMillis);
  }
  @catch (JavaTextParseException *e) {
    @throw create_JavaLangRuntimeException_initWithJavaLangThrowable_(e);
  }
}

id ASExpressionMethodHandler_getDescFromResWithId_withASIWidget_withJavaUtilMap_(id obj, id<ASIWidget> widget, id<JavaUtilMap> configMap) {
  ASExpressionMethodHandler_initialize();
  if (configMap != nil) {
    NSString *delimiter = ASExpressionMethodHandler_getDelimiterWithJavaUtilMap_(configMap);
    id<JavaUtilList> entries = (id<JavaUtilList>) cast_check([((id<ASIWidget>) nil_chk(widget)) quickConvertWithId:JreStrcat("$@", @"@array/", [configMap getWithId:@"entries"]) withNSString:@"array" withNSString:@"resourcestring" withNSString:nil], JavaUtilList_class_());
    id<JavaUtilList> values = (id<JavaUtilList>) cast_check([widget quickConvertWithId:JreStrcat("$@", @"@array/", [configMap getWithId:@"values"]) withNSString:@"array" withNSString:@"resourcestring" withNSString:nil], JavaUtilList_class_());
    id<JavaUtilList> descs = create_JavaUtilArrayList_init();
    id<JavaUtilList> listStrs = ASPluginInvoker_getListWithId_(obj);
    if (listStrs == nil) {
      listStrs = create_JavaUtilArrayList_init();
      [listStrs addWithId:obj];
    }
    for (id __strong listStr in listStrs) {
      for (jint i = 0; i < [((id<JavaUtilList>) nil_chk(values)) size]; i++) {
        NSString *value = JreRetainedLocalValue([values getWithInt:i]);
        if ([((NSString *) nil_chk(value)) isEqual:listStr]) {
          [descs addWithId:[((id<JavaUtilList>) nil_chk(entries)) getWithInt:i]];
        }
      }
    }
    return NSString_java_joinWithJavaLangCharSequence_withJavaLangCharSequenceArray_(delimiter, [descs toArrayWithNSObjectArray:[IOSObjectArray arrayWithLength:0 type:NSString_class_()]]);
  }
  return @"";
}

id ASExpressionMethodHandler_formatStringWithId_withASIWidget_withJavaUtilMap_(id obj, id<ASIWidget> widget, id<JavaUtilMap> configMap) {
  ASExpressionMethodHandler_initialize();
  if (configMap != nil) {
    NSString *format = (NSString *) cast_chk([((id<ASIWidget>) nil_chk(widget)) quickConvertWithId:[configMap getWithId:@"format"] withNSString:@"resourcestring"], [NSString class]);
    IOSObjectArray *fields = [((NSString *) nil_chk(((NSString *) cast_chk([configMap getWithId:@"fields"], [NSString class])))) java_split:@","];
    id<JavaUtilList> objParams = create_JavaUtilArrayList_init();
    {
      IOSObjectArray *a__ = fields;
      NSString * const *b__ = ((IOSObjectArray *) nil_chk(a__))->buffer_;
      NSString * const *e__ = b__ + a__->size_;
      while (b__ < e__) {
        NSString *path = *b__++;
        [objParams addWithId:ASPluginInvoker_getStringWithId_([widget getModelByPathWithNSString:path withId:obj])];
      }
    }
    return NSString_java_formatWithNSString_withNSObjectArray_(format, [objParams toArray]);
  }
  return @"";
}

id ASExpressionMethodHandler_getDescFromModelWithId_withASIWidget_withJavaUtilMap_(id obj, id<ASIWidget> widget, id<JavaUtilMap> configMap) {
  ASExpressionMethodHandler_initialize();
  if (configMap != nil) {
    ASModelExpressionParser_ModelFromScopeHolder *modelFromScopeHolder = ASModelExpressionParser_parseModelFromScopeWithNSString_((NSString *) cast_chk([configMap getWithId:@"scope"], [NSString class]));
    id<JavaUtilList> dropDownVals = ASPluginInvoker_getListWithId_([((ASBaseWidget *) nil_chk(((ASBaseWidget *) cast_chk(widget, [ASBaseWidget class])))) getModelByPathWithNSString:((ASModelExpressionParser_ModelFromScopeHolder *) nil_chk(modelFromScopeHolder))->varPath_ withId:[((id<ASIWidget>) nil_chk(widget)) getModelFromScopeWithNSString:modelFromScopeHolder->varName_ withASModelScope:modelFromScopeHolder->varScope_]]);
    NSString *delimiter = ASExpressionMethodHandler_getDelimiterWithJavaUtilMap_(configMap);
    if ([JavaUtilList_class_() isInstance:dropDownVals]) {
      id<JavaUtilList> listStrs = ASPluginInvoker_getListWithId_(obj);
      id<JavaUtilList> descs = create_JavaUtilArrayList_init();
      if (listStrs == nil) {
        listStrs = create_JavaUtilArrayList_init();
        [listStrs addWithId:obj];
      }
      for (id __strong listStr in listStrs) {
        for (id __strong dropDownVal in nil_chk(dropDownVals)) {
          id id_ = JreRetainedLocalValue([widget getModelByPathWithNSString:(NSString *) cast_chk([configMap getWithId:@"id"], [NSString class]) withId:dropDownVal]);
          if (id_ != nil && [id_ isEqual:listStr]) {
            [descs addWithId:(NSString *) cast_chk([widget getModelByPathWithNSString:(NSString *) cast_chk([configMap getWithId:@"value"], [NSString class]) withId:dropDownVal], [NSString class])];
          }
        }
      }
      return NSString_java_joinWithJavaLangCharSequence_withJavaLangCharSequenceArray_(delimiter, [descs toArrayWithNSObjectArray:[IOSObjectArray arrayWithLength:0 type:NSString_class_()]]);
    }
  }
  return @"";
}

id ASExpressionMethodHandler_sizeWithId_(id obj) {
  ASExpressionMethodHandler_initialize();
  if ([JavaUtilList_class_() isInstance:obj]) {
    return JreStrcat("I", [((id<JavaUtilList>) nil_chk(((id<JavaUtilList>) cast_check(obj, JavaUtilList_class_())))) size]);
  }
  return @"0";
}

id ASExpressionMethodHandler_concatWithId_withASIWidget_withJavaUtilMap_(id obj, id<ASIWidget> widget, id<JavaUtilMap> configMap) {
  ASExpressionMethodHandler_initialize();
  NSString *result = @"";
  if (configMap != nil) {
    NSString *delimiter = @" ";
    if ([configMap containsKeyWithId:@"separator"]) {
      delimiter = (NSString *) cast_chk([configMap getWithId:@"separator"], [NSString class]);
    }
    NSString *fields = (NSString *) cast_chk([configMap getWithId:@"fields"], [NSString class]);
    IOSObjectArray *props = [((NSString *) nil_chk(fields)) java_split:@","];
    for (jint i = 0; i < ((IOSObjectArray *) nil_chk(props))->size_; i++) {
      NSString *prop = IOSObjectArray_Get(props, i);
      if (![result isEqual:@""]) {
        JreStrAppend(&result, "$", delimiter);
      }
      id val = JreRetainedLocalValue([((id<ASIWidget>) nil_chk(widget)) getModelByPathWithNSString:prop withId:obj]);
      if (val != nil) {
        JreStrAppend(&result, "@", val);
      }
    }
  }
  return result;
}

id ASExpressionMethodHandler_listToStringWithId_withJavaUtilMap_(id obj, id<JavaUtilMap> configMap) {
  ASExpressionMethodHandler_initialize();
  id<JavaUtilList> listStrs = ASPluginInvoker_getListWithId_(obj);
  NSString *result = @"";
  NSString *delimiter = @", ";
  if (configMap != nil) {
    if ([configMap containsKeyWithId:@"separator"]) {
      delimiter = (NSString *) cast_chk([configMap getWithId:@"separator"], [NSString class]);
    }
  }
  if (listStrs != nil) {
    for (id __strong listStr in listStrs) {
      if (![result isEqual:@""]) {
        JreStrAppend(&result, "$", delimiter);
      }
      id val = ASPluginInvoker_getStringWithId_(listStr);
      if (val != nil) {
        JreStrAppend(&result, "@", val);
      }
    }
  }
  return result;
}

id ASExpressionMethodHandler_not__WithId_(id obj) {
  ASExpressionMethodHandler_initialize();
  if ([obj isKindOfClass:[JavaLangBoolean class]]) {
    return JavaLangBoolean_valueOfWithBoolean_(![((JavaLangBoolean *) nil_chk(((JavaLangBoolean *) obj))) booleanValue]);
  }
  if (ASPluginInvoker_isBooleanWithId_(obj)) {
    return JavaLangBoolean_valueOfWithBoolean_(![((JavaLangBoolean *) nil_chk(ASPluginInvoker_getBooleanWithId_(obj))) booleanValue]);
  }
  return JavaLangBoolean_valueOfWithBoolean_(false);
}

id ASExpressionMethodHandler_totalWithASIWidget_withId_withJavaUtilMap_(id<ASIWidget> widget, id obj, id<JavaUtilMap> configMap) {
  ASExpressionMethodHandler_initialize();
  id<JavaUtilList> objList = ASPluginInvoker_getListWithId_(obj);
  jfloat sum = 0;
  for (id __strong object in nil_chk(objList)) {
    JrePlusAssignFloatF(&sum, [((JavaLangFloat *) nil_chk(ASPluginInvoker_getFloatWithId_([((id<ASIWidget>) nil_chk(widget)) getModelByPathWithNSString:(NSString *) cast_chk([((id<JavaUtilMap>) nil_chk(configMap)) getWithId:@"path"], [NSString class]) withId:object]))) floatValue]);
  }
  return JavaLangFloat_valueOfWithFloat_(sum);
}

NSString *ASExpressionMethodHandler_getDelimiterWithJavaUtilMap_(id<JavaUtilMap> configMap) {
  ASExpressionMethodHandler_initialize();
  NSString *delimiter = @", ";
  if ([((id<JavaUtilMap>) nil_chk(configMap)) containsKeyWithId:@"separator"]) {
    delimiter = (NSString *) cast_chk([configMap getWithId:@"separator"], [NSString class]);
  }
  return delimiter;
}

id<JavaUtilMap> ASExpressionMethodHandler_getMapWithId_(id obj) {
  ASExpressionMethodHandler_initialize();
  if ([JavaUtilMap_class_() isInstance:obj]) {
    return (id<JavaUtilMap>) cast_check(obj, JavaUtilMap_class_());
  }
  if ([ASIFlatMap_class_() isInstance:obj]) {
    return [((id<ASIFlatMap>) nil_chk(((id<ASIFlatMap>) cast_check(obj, ASIFlatMap_class_())))) getHierarchicalMap];
  }
  return nil;
}

jboolean ASExpressionMethodHandler_isVisibleWithId_(id obj) {
  ASExpressionMethodHandler_initialize();
  if ([JavaUtilList_class_() isInstance:obj]) {
    return [((id<JavaUtilList>) nil_chk(((id<JavaUtilList>) cast_check(obj, JavaUtilList_class_())))) size] > 0;
  }
  if ([obj isKindOfClass:[NSString class]]) {
    return ![((NSString *) nil_chk(((NSString *) obj))) java_isEmpty];
  }
  if ([obj isKindOfClass:[JavaLangBoolean class]]) {
    return [((JavaLangBoolean *) nil_chk((JavaLangBoolean *) obj)) booleanValue];
  }
  if (ASPluginInvoker_isBooleanWithId_(obj)) {
    return [((JavaLangBoolean *) nil_chk(ASPluginInvoker_getBooleanWithId_(obj))) booleanValue];
  }
  return obj != nil;
}

id ASExpressionMethodHandler_multiplyWithASIWidget_withId_withJavaUtilMap_(id<ASIWidget> w, id obj, id<JavaUtilMap> configMap) {
  ASExpressionMethodHandler_initialize();
  jfloat val1 = 0;
  jfloat val2 = 0;
  if ([((id<JavaUtilMap>) nil_chk(configMap)) containsKeyWithId:@"op1"]) {
    val1 = [((JavaLangFloat *) nil_chk(ASPluginInvoker_getFloatWithId_([((id<ASIWidget>) nil_chk(w)) getModelByPathWithNSString:(NSString *) cast_chk([configMap getWithId:@"op1"], [NSString class]) withId:obj]))) floatValue];
  }
  if ([configMap containsKeyWithId:@"op2"]) {
    val2 = [((JavaLangFloat *) nil_chk(ASPluginInvoker_getFloatWithId_([((id<ASIWidget>) nil_chk(w)) getModelByPathWithNSString:(NSString *) cast_chk([configMap getWithId:@"op2"], [NSString class]) withId:obj]))) floatValue];
  }
  return JavaLangFloat_valueOfWithFloat_(val1 * val2);
}

id ASExpressionMethodHandler_getFileAssetWithId_withASIWidget_withJavaUtilMap_(id obj, id<ASIWidget> widget, id<JavaUtilMap> configMap) {
  ASExpressionMethodHandler_initialize();
  if (obj == nil || [obj isEqual:@""]) {
    return nil;
  }
  return ASPluginInvoker_getFileAssetWithNSString_withASIFragment_((NSString *) cast_chk(obj, [NSString class]), [((id<ASIWidget>) nil_chk(widget)) getFragment]);
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASExpressionMethodHandler)
