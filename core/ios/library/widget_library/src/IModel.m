//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\model\IModel.java
//

#include "IModel.h"
#include "J2ObjC_source.h"


@interface ASIModel : NSObject

@end

@implementation ASIModel

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "LNSString;", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "LASLoopParam;", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x401, 0, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 2, 3, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 4, 5, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 6, 5, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 7, 5, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 8, 5, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 9, 5, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 10, 5, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 11, 5, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 12, 13, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 14, 5, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 15, 16, -1, 17, -1, -1 },
    { NULL, "LJavaUtilList;", 0x401, -1, -1, -1, 18, -1, -1 },
    { NULL, "V", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 19, 20, -1, -1, -1, -1 },
    { NULL, "V", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x401, 21, 20, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 22, 23, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(getModelIdPath);
  methods[1].selector = @selector(getModelSyncEvents);
  methods[2].selector = @selector(getModelParam);
  methods[3].selector = @selector(getModelPojoToUi);
  methods[4].selector = @selector(getModelPojoToUiParams);
  methods[5].selector = @selector(getModelUiToPojoEventIds);
  methods[6].selector = @selector(getModelUiToPojo);
  methods[7].selector = @selector(getLoopParam);
  methods[8].selector = @selector(getModelFromScopeWithNSString:withASModelScope:);
  methods[9].selector = @selector(storeModelToScopeWithNSString:withASModelScope:withId:);
  methods[10].selector = @selector(setModelIdPathWithNSString:);
  methods[11].selector = @selector(setModelSyncEventsWithNSString:);
  methods[12].selector = @selector(setModelParamWithNSString:);
  methods[13].selector = @selector(setModelPojoToUiWithNSString:);
  methods[14].selector = @selector(setModelPojoToUiParamsWithNSString:);
  methods[15].selector = @selector(setModelUiToPojoWithNSString:);
  methods[16].selector = @selector(setModelUiToPojoEventIdsWithNSString:);
  methods[17].selector = @selector(setLoopParamWithASLoopParam:);
  methods[18].selector = @selector(syncModelFromUiToPojoWithNSString:);
  methods[19].selector = @selector(updateModelToEventMapWithJavaUtilMap:withNSString:withNSString:);
  methods[20].selector = @selector(getEventBusHandlers);
  methods[21].selector = @selector(notifyDataSetChanged);
  methods[22].selector = @selector(updateModelDataWithNSString:withId:);
  methods[23].selector = @selector(applyModelToWidget);
  methods[24].selector = @selector(getModelByPathWithNSString:withId:);
  methods[25].selector = @selector(updateModelByPathWithNSString:withId:withId:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "getModelFromScope", "LNSString;LASModelScope;", "storeModelToScope", "LNSString;LASModelScope;LNSObject;", "setModelIdPath", "LNSString;", "setModelSyncEvents", "setModelParam", "setModelPojoToUi", "setModelPojoToUiParams", "setModelUiToPojo", "setModelUiToPojoEventIds", "setLoopParam", "LASLoopParam;", "syncModelFromUiToPojo", "updateModelToEventMap", "LJavaUtilMap;LNSString;LNSString;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/util/List<Lcom/ashera/widget/bus/EventBusHandler;>;", "updateModelData", "LNSString;LNSObject;", "getModelByPath", "updateModelByPath", "LNSString;LNSObject;LNSObject;" };
  static const J2ObjcClassInfo _ASIModel = { "IModel", "com.ashera.model", ptrTable, methods, NULL, 7, 0x609, 26, 0, -1, -1, -1, -1, -1 };
  return &_ASIModel;
}

@end

J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ASIModel)
