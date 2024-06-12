//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\model\ModelStore.java
//

#include "IActivity.h"
#include "IFlatMap.h"
#include "IFragment.h"
#include "IOSClass.h"
#include "IWidget.h"
#include "J2ObjC_source.h"
#include "LoopParam.h"
#include "ModelDataType.h"
#include "ModelScope.h"
#include "ModelStore.h"
#include "PlainMap.h"
#include "PluginInvoker.h"
#include "ResourceBundleUtils.h"
#include "java/lang/Boolean.h"
#include "java/lang/Double.h"
#include "java/lang/Integer.h"
#include "java/lang/RuntimeException.h"
#include "java/util/List.h"
#include "java/util/Map.h"


@implementation ASModelStore

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASModelStore_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

+ (void)storeModelToScopeWithNSString:(NSString *)varName
                     withASModelScope:(ASModelScope *)varScope
                               withId:(id)objValue
                      withASIFragment:(id<ASIFragment>)fragment
                        withASIWidget:(id<ASIWidget>)widget
                      withASLoopParam:(ASLoopParam *)loopVarParams {
  ASModelStore_storeModelToScopeWithNSString_withASModelScope_withId_withASIFragment_withASIWidget_withASLoopParam_(varName, varScope, objValue, fragment, widget, loopVarParams);
}

+ (id)getModelFromScopeWithNSString:(NSString *)varName
                   withASModelScope:(ASModelScope *)varScope
                    withASIFragment:(id<ASIFragment>)fragment
                      withASIWidget:(id<ASIWidget>)widget
                    withJavaUtilMap:(id<JavaUtilMap>)loopVarParams {
  return ASModelStore_getModelFromScopeWithNSString_withASModelScope_withASIFragment_withASIWidget_withJavaUtilMap_(varName, varScope, fragment, widget, loopVarParams);
}

+ (id)changeModelDataTypeWithASModelDataType:(ASModelDataType *)dataType
                                      withId:(id)obj {
  return ASModelStore_changeModelDataTypeWithASModelDataType_withId_(dataType, obj);
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 0, 1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x9, 2, 3, -1, 4, -1, -1 },
    { NULL, "LNSObject;", 0x9, 5, 6, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(storeModelToScopeWithNSString:withASModelScope:withId:withASIFragment:withASIWidget:withASLoopParam:);
  methods[2].selector = @selector(getModelFromScopeWithNSString:withASModelScope:withASIFragment:withASIWidget:withJavaUtilMap:);
  methods[3].selector = @selector(changeModelDataTypeWithASModelDataType:withId:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "storeModelToScope", "LNSString;LASModelScope;LNSObject;LASIFragment;LASIWidget;LASLoopParam;", "getModelFromScope", "LNSString;LASModelScope;LASIFragment;LASIWidget;LJavaUtilMap;", "(Ljava/lang/String;Lcom/ashera/model/ModelScope;Lcom/ashera/core/IFragment;Lcom/ashera/widget/IWidget;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljava/lang/Object;", "changeModelDataType", "LASModelDataType;LNSObject;" };
  static const J2ObjcClassInfo _ASModelStore = { "ModelStore", "com.ashera.model", ptrTable, methods, NULL, 7, 0x1, 4, 0, -1, -1, -1, -1, -1 };
  return &_ASModelStore;
}

@end

void ASModelStore_init(ASModelStore *self) {
  NSObject_init(self);
}

ASModelStore *new_ASModelStore_init() {
  J2OBJC_NEW_IMPL(ASModelStore, init)
}

ASModelStore *create_ASModelStore_init() {
  J2OBJC_CREATE_IMPL(ASModelStore, init)
}

void ASModelStore_storeModelToScopeWithNSString_withASModelScope_withId_withASIFragment_withASIWidget_withASLoopParam_(NSString *varName, ASModelScope *varScope, id objValue, id<ASIFragment> fragment, id<ASIWidget> widget, ASLoopParam *loopVarParams) {
  ASModelStore_initialize();
  {
    id<ASIFragment> currentFragment;
    switch ([varScope ordinal]) {
      case ASModelScope_Enum_view:
      [((id<ASIFragment>) nil_chk(fragment)) storeUserDataWithNSString:varName withId:objValue];
      break;
      case ASModelScope_Enum_parentview:
      currentFragment = JreRetainedLocalValue([((id<ASIWidget>) nil_chk(widget)) getFragment]);
      while ([((id<ASIFragment>) nil_chk(currentFragment)) getParent] != nil) {
        currentFragment = [currentFragment getParent];
      }
      [currentFragment storeUserDataWithNSString:varName withId:objValue];
      break;
      case ASModelScope_Enum_session:
      [((id<ASIActivity>) nil_chk([((id<ASIFragment>) nil_chk(fragment)) getRootActivity])) storeUserDataWithNSString:varName withId:objValue];
      break;
      case ASModelScope_Enum_local:
      if (widget != nil) {
        [widget storeUserDataWithNSString:varName withId:objValue];
      }
      else {
        @throw create_JavaLangRuntimeException_initWithNSString_(@"local scope not supported");
      }
      break;
      case ASModelScope_Enum_component:
      if ([((NSString *) nil_chk(varName)) java_contains:@"#"]) {
        [((id<ASIFragment>) nil_chk([((id<ASIWidget>) nil_chk(widget)) getRootFragment])) storeUserDataWithNSString:varName withId:objValue];
      }
      else {
        if ([((id<ASIWidget>) nil_chk(widget)) getComponentId] != nil) {
          [((id<ASIFragment>) nil_chk([widget getRootFragment])) storeUserDataWithNSString:JreStrcat("$C$", [widget getComponentId], '#', varName) withId:objValue];
        }
      }
      break;
      case ASModelScope_Enum_loopvar:
      if (objValue == loopVarParams) {
      }
      else if (loopVarParams != nil) {
        [loopVarParams putWithId:varName withId:objValue];
      }
      else {
        @throw create_JavaLangRuntimeException_initWithNSString_(@"loopvar scope not supported");
      }
      break;
      default:
      @throw create_JavaLangRuntimeException_initWithNSString_(JreStrcat("$@", @"unsupported scope ", varScope));
    }
  }
}

id ASModelStore_getModelFromScopeWithNSString_withASModelScope_withASIFragment_withASIWidget_withJavaUtilMap_(NSString *varName, ASModelScope *varScope, id<ASIFragment> fragment, id<ASIWidget> widget, id<JavaUtilMap> loopVarParams) {
  ASModelStore_initialize();
  id obj = nil;
  {
    id<ASIFragment> currentFragment;
    switch ([varScope ordinal]) {
      case ASModelScope_Enum_view:
      obj = [((id<ASIFragment>) nil_chk(fragment)) getUserDataWithNSString:varName];
      break;
      case ASModelScope_Enum_parentview:
      currentFragment = JreRetainedLocalValue([((id<ASIWidget>) nil_chk(widget)) getFragment]);
      while ([((id<ASIFragment>) nil_chk(currentFragment)) getParent] != nil) {
        currentFragment = [currentFragment getParent];
      }
      obj = [currentFragment getUserDataWithNSString:varName];
      break;
      case ASModelScope_Enum_session:
      obj = [((id<ASIActivity>) nil_chk([((id<ASIFragment>) nil_chk(fragment)) getRootActivity])) getUserDataWithNSString:varName];
      break;
      case ASModelScope_Enum_component:
      if ([((id<ASIWidget>) nil_chk(widget)) getComponentId] != nil) {
        if ([((NSString *) nil_chk(varName)) java_contains:@"#"]) {
          obj = [((id<ASIFragment>) nil_chk(fragment)) getUserDataWithNSString:varName];
        }
        else {
          obj = [((id<ASIFragment>) nil_chk(fragment)) getUserDataWithNSString:JreStrcat("$C$", [widget getComponentId], '#', varName)];
        }
      }
      break;
      case ASModelScope_Enum_local:
      if (widget != nil) {
        obj = [widget getUserDataWithNSString:varName];
      }
      else {
        @throw create_JavaLangRuntimeException_initWithNSString_(@"local scope not supported");
      }
      break;
      case ASModelScope_Enum_loopvar:
      if (loopVarParams != nil) {
        obj = [loopVarParams getWithId:varName];
      }
      else {
      }
      break;
      case ASModelScope_Enum_strings:
      return ASResourceBundleUtils_getStringWithNSString_withNSString_withNSString_withASIFragment_(@"values/strings", @"string", JreStrcat("$$", @"@string/", varName), fragment);
      case ASModelScope_Enum_constants:
      return varName;
      default:
      @throw create_JavaLangRuntimeException_initWithNSString_(JreStrcat("$@", @"unsupported scope ", varScope));
    }
  }
  return obj;
}

id ASModelStore_changeModelDataTypeWithASModelDataType_withId_(ASModelDataType *dataType, id obj) {
  ASModelStore_initialize();
  if (dataType != nil) {
    switch ([dataType ordinal]) {
      case ASModelDataType_Enum_map:
      if ([ASIFlatMap_class_() isInstance:obj]) {
        obj = [((id<ASIFlatMap>) nil_chk(((id<ASIFlatMap>) cast_check(obj, ASIFlatMap_class_())))) getHierarchicalMap];
      }
      else {
        obj = ASPluginInvoker_getMapWithId_(obj);
      }
      break;
      case ASModelDataType_Enum_pathmap:
      if (!([ASIFlatMap_class_() isInstance:obj])) {
        obj = create_ASPlainMap_initWithJavaUtilMap_(ASPluginInvoker_getMapWithId_(obj));
      }
      break;
      case ASModelDataType_Enum_list:
      obj = ASPluginInvoker_getListWithId_(obj);
      break;
      case ASModelDataType_Enum_string:
      obj = ASPluginInvoker_getStringWithId_(obj);
      break;
      case ASModelDataType_Enum_bool:
      obj = ASPluginInvoker_getBooleanWithId_(obj);
      break;
      case ASModelDataType_Enum_number:
      obj = ASPluginInvoker_getDoubleWithId_(obj);
      break;
      case ASModelDataType_Enum_integer:
      obj = ASPluginInvoker_getIntWithId_(obj);
      break;
      default:
      break;
    }
  }
  return obj;
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASModelStore)
