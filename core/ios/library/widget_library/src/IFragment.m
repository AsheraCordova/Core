//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\core\IFragment.java
//

#include "IFragment.h"
#include "J2ObjC_source.h"


@interface ASIFragment : NSObject

@end

@implementation ASIFragment

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "LNSString;", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 0, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x401, 2, 3, -1, -1, -1, -1 },
    { NULL, "LASEventBus;", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "LASIWidget;", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x401, 4, 5, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x401, 6, 5, -1, -1, -1, -1 },
    { NULL, "LASIActivity;", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 7, 8, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 9, 10, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x401, 11, 5, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 12, 10, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x401, 13, 5, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "LCSSStyleSheet;", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 14, 15, -1, -1, -1, -1 },
    { NULL, "Z", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 16, 17, -1, -1, -1, -1 },
    { NULL, "V", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "LJavaUtilList;", 0x401, -1, -1, -1, 18, -1, -1 },
    { NULL, "V", 0x401, 19, 20, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 21, 22, -1, -1, -1, -1 },
    { NULL, "LJavaUtilList;", 0x401, 23, 24, -1, 25, -1, -1 },
    { NULL, "LJavaUtilList;", 0x401, 23, 26, -1, 27, -1, -1 },
    { NULL, "V", 0x401, 28, 22, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 29, 30, -1, -1, -1, -1 },
    { NULL, "Z", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 31, 32, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x401, 33, 5, -1, -1, -1, -1 },
    { NULL, "V", 0x401, 34, 35, -1, -1, -1, -1 },
    { NULL, "LASIFragment;", 0x401, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x401, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(getFragmentId);
  methods[1].selector = @selector(getActionUrl);
  methods[2].selector = @selector(onAttachWithASIActivity:);
  methods[3].selector = @selector(onDetach);
  methods[4].selector = @selector(onCreate);
  methods[5].selector = @selector(onDestroy);
  methods[6].selector = @selector(onResume);
  methods[7].selector = @selector(onPause);
  methods[8].selector = @selector(onCloseDialog);
  methods[9].selector = @selector(onCreateViewWithBoolean:);
  methods[10].selector = @selector(getEventBus);
  methods[11].selector = @selector(getRootWidget);
  methods[12].selector = @selector(hasDevDataWithNSString:);
  methods[13].selector = @selector(getDevDataWithNSString:);
  methods[14].selector = @selector(getRootActivity);
  methods[15].selector = @selector(getArgumentsBundle);
  methods[16].selector = @selector(setRootWidgetWithASIWidget:);
  methods[17].selector = @selector(storeUserDataWithNSString:withId:);
  methods[18].selector = @selector(getUserDataWithNSString:);
  methods[19].selector = @selector(storeInTempCacheWithNSString:withId:);
  methods[20].selector = @selector(getFromTempCacheWithNSString:);
  methods[21].selector = @selector(getParentForRootWidget);
  methods[22].selector = @selector(getStyleSheet);
  methods[23].selector = @selector(setStyleSheetWithCSSStyleSheet:);
  methods[24].selector = @selector(isViewLoaded);
  methods[25].selector = @selector(setFrameWithInt:withInt:withInt:withInt:);
  methods[26].selector = @selector(remeasure);
  methods[27].selector = @selector(disableRemeasure);
  methods[28].selector = @selector(enableRemeasure);
  methods[29].selector = @selector(getDisposables);
  methods[30].selector = @selector(addDisposableWithId:);
  methods[31].selector = @selector(addListenerWithASIWidget:withId:);
  methods[32].selector = @selector(getListenerWithIOSClass:);
  methods[33].selector = @selector(getListenerWithASIWidget:withIOSClass:);
  methods[34].selector = @selector(removeListenerWithASIWidget:withId:);
  methods[35].selector = @selector(addErrorWithASError:);
  methods[36].selector = @selector(hasErrors);
  methods[37].selector = @selector(resizeWindowWithInt:withInt:);
  methods[38].selector = @selector(getInlineResourceWithNSString:);
  methods[39].selector = @selector(setInlineResourceWithNSString:withNSString:withBoolean:);
  methods[40].selector = @selector(getParent);
  methods[41].selector = @selector(getUId);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "onAttach", "LASIActivity;", "onCreateView", "Z", "hasDevData", "LNSString;", "getDevData", "setRootWidget", "LASIWidget;", "storeUserData", "LNSString;LNSObject;", "getUserData", "storeInTempCache", "getFromTempCache", "setStyleSheet", "LCSSStyleSheet;", "setFrame", "IIII", "()Ljava/util/List<Ljava/lang/Object;>;", "addDisposable", "LNSObject;", "addListener", "LASIWidget;LNSObject;", "getListener", "LIOSClass;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/util/List<TT;>;", "LASIWidget;LIOSClass;", "<T:Ljava/lang/Object;>(Lcom/ashera/widget/IWidget;Ljava/lang/Class<TT;>;)Ljava/util/List<TT;>;", "removeListener", "addError", "LASError;", "resizeWindow", "II", "getInlineResource", "setInlineResource", "LNSString;LNSString;Z" };
  static const J2ObjcClassInfo _ASIFragment = { "IFragment", "com.ashera.core", ptrTable, methods, NULL, 7, 0x609, 42, 0, -1, -1, -1, -1, -1 };
  return &_ASIFragment;
}

@end

J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ASIFragment)
