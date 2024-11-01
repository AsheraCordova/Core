//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroidX-core\src\main\java\androidx\appcompat\view\menu\MenuParser.java
//

#include "Drawable.h"
#include "HasWidgets.h"
#include "IConverter.h"
#include "IFragment.h"
#include "IOSClass.h"
#include "IOSObjectArray.h"
#include "IWidget.h"
#include "J2ObjC_source.h"
#include "MenuBuilder.h"
#include "MenuItem.h"
#include "MenuItemImpl.h"
#include "MenuParser.h"
#include "PluginInvoker.h"
#include "SubMenuBuilder.h"
#include "SupportMenuItem.h"
#include "View.h"
#include "WidgetFactory.h"
#include "java/lang/Integer.h"
#include "java/util/Iterator.h"
#include "java/util/List.h"
#include "java/util/Map.h"
#include "java/util/Set.h"

@protocol JavaUtilMap;


@interface ADXMenuParser ()

+ (void)parseGroupAndItemWithASHasWidgets:(id<ASHasWidgets>)parent
                       withADXMenuBuilder:(ADXMenuBuilder *)menu
                          withASIFragment:(id<ASIFragment>)fragment
                          withJavaUtilMap:(id<JavaUtilMap>)parentMap
                                  withInt:(jint)groupId;

+ (void)parseGroupWithASHasWidgets:(id<ASHasWidgets>)parent
                withADXMenuBuilder:(ADXMenuBuilder *)menu
                   withASIFragment:(id<ASIFragment>)fragment
                            withId:(id)item;

+ (void)createMenuItemMapOrListWithASHasWidgets:(id<ASHasWidgets>)parent
                             withADXMenuBuilder:(ADXMenuBuilder *)menu
                                withASIFragment:(id<ASIFragment>)fragment
                                         withId:(id)item
                                        withInt:(jint)groupId;

+ (void)createMenuItemWithASHasWidgets:(id<ASHasWidgets>)parent
                    withADXMenuBuilder:(ADXMenuBuilder *)menu
                       withASIFragment:(id<ASIFragment>)fragment
                                withId:(id)payLoad
                               withInt:(jint)groupId;

+ (void)createActionLayoutWithASHasWidgets:(id<ASHasWidgets>)parent
                            withADMenuItem:(id<ADMenuItem>)menuItem
                              withNSString:(NSString *)actionLayout;

@end

__attribute__((unused)) static void ADXMenuParser_parseGroupAndItemWithASHasWidgets_withADXMenuBuilder_withASIFragment_withJavaUtilMap_withInt_(id<ASHasWidgets> parent, ADXMenuBuilder *menu, id<ASIFragment> fragment, id<JavaUtilMap> parentMap, jint groupId);

__attribute__((unused)) static void ADXMenuParser_parseGroupWithASHasWidgets_withADXMenuBuilder_withASIFragment_withId_(id<ASHasWidgets> parent, ADXMenuBuilder *menu, id<ASIFragment> fragment, id item);

__attribute__((unused)) static void ADXMenuParser_createMenuItemMapOrListWithASHasWidgets_withADXMenuBuilder_withASIFragment_withId_withInt_(id<ASHasWidgets> parent, ADXMenuBuilder *menu, id<ASIFragment> fragment, id item, jint groupId);

__attribute__((unused)) static void ADXMenuParser_createMenuItemWithASHasWidgets_withADXMenuBuilder_withASIFragment_withId_withInt_(id<ASHasWidgets> parent, ADXMenuBuilder *menu, id<ASIFragment> fragment, id payLoad, jint groupId);

__attribute__((unused)) static void ADXMenuParser_createActionLayoutWithASHasWidgets_withADMenuItem_withNSString_(id<ASHasWidgets> parent, id<ADMenuItem> menuItem, NSString *actionLayout);

@implementation ADXMenuParser

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADXMenuParser_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

+ (void)parseMenuWithASHasWidgets:(id<ASHasWidgets>)parent
               withADXMenuBuilder:(ADXMenuBuilder *)menu
                     withNSString:(NSString *)json
                  withASIFragment:(id<ASIFragment>)fragment {
  ADXMenuParser_parseMenuWithASHasWidgets_withADXMenuBuilder_withNSString_withASIFragment_(parent, menu, json, fragment);
}

+ (void)parseGroupAndItemWithASHasWidgets:(id<ASHasWidgets>)parent
                       withADXMenuBuilder:(ADXMenuBuilder *)menu
                          withASIFragment:(id<ASIFragment>)fragment
                          withJavaUtilMap:(id<JavaUtilMap>)parentMap
                                  withInt:(jint)groupId {
  ADXMenuParser_parseGroupAndItemWithASHasWidgets_withADXMenuBuilder_withASIFragment_withJavaUtilMap_withInt_(parent, menu, fragment, parentMap, groupId);
}

+ (void)parseGroupWithASHasWidgets:(id<ASHasWidgets>)parent
                withADXMenuBuilder:(ADXMenuBuilder *)menu
                   withASIFragment:(id<ASIFragment>)fragment
                            withId:(id)item {
  ADXMenuParser_parseGroupWithASHasWidgets_withADXMenuBuilder_withASIFragment_withId_(parent, menu, fragment, item);
}

+ (void)createMenuItemMapOrListWithASHasWidgets:(id<ASHasWidgets>)parent
                             withADXMenuBuilder:(ADXMenuBuilder *)menu
                                withASIFragment:(id<ASIFragment>)fragment
                                         withId:(id)item
                                        withInt:(jint)groupId {
  ADXMenuParser_createMenuItemMapOrListWithASHasWidgets_withADXMenuBuilder_withASIFragment_withId_withInt_(parent, menu, fragment, item, groupId);
}

+ (void)createMenuItemWithASHasWidgets:(id<ASHasWidgets>)parent
                    withADXMenuBuilder:(ADXMenuBuilder *)menu
                       withASIFragment:(id<ASIFragment>)fragment
                                withId:(id)payLoad
                               withInt:(jint)groupId {
  ADXMenuParser_createMenuItemWithASHasWidgets_withADXMenuBuilder_withASIFragment_withId_withInt_(parent, menu, fragment, payLoad, groupId);
}

+ (void)createActionLayoutWithASHasWidgets:(id<ASHasWidgets>)parent
                            withADMenuItem:(id<ADMenuItem>)menuItem
                              withNSString:(NSString *)actionLayout {
  ADXMenuParser_createActionLayoutWithASHasWidgets_withADMenuItem_withNSString_(parent, menuItem, actionLayout);
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 0, 1, -1, -1, -1, -1 },
    { NULL, "V", 0xa, 2, 3, -1, 4, -1, -1 },
    { NULL, "V", 0xa, 5, 6, -1, -1, -1, -1 },
    { NULL, "V", 0xa, 7, 8, -1, -1, -1, -1 },
    { NULL, "V", 0xa, 9, 8, -1, -1, -1, -1 },
    { NULL, "V", 0xa, 10, 11, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(parseMenuWithASHasWidgets:withADXMenuBuilder:withNSString:withASIFragment:);
  methods[2].selector = @selector(parseGroupAndItemWithASHasWidgets:withADXMenuBuilder:withASIFragment:withJavaUtilMap:withInt:);
  methods[3].selector = @selector(parseGroupWithASHasWidgets:withADXMenuBuilder:withASIFragment:withId:);
  methods[4].selector = @selector(createMenuItemMapOrListWithASHasWidgets:withADXMenuBuilder:withASIFragment:withId:withInt:);
  methods[5].selector = @selector(createMenuItemWithASHasWidgets:withADXMenuBuilder:withASIFragment:withId:withInt:);
  methods[6].selector = @selector(createActionLayoutWithASHasWidgets:withADMenuItem:withNSString:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "parseMenu", "LASHasWidgets;LADXMenuBuilder;LNSString;LASIFragment;", "parseGroupAndItem", "LASHasWidgets;LADXMenuBuilder;LASIFragment;LJavaUtilMap;I", "(Lcom/ashera/widget/HasWidgets;Landroidx/appcompat/view/menu/MenuBuilder;Lcom/ashera/core/IFragment;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;I)V", "parseGroup", "LASHasWidgets;LADXMenuBuilder;LASIFragment;LNSObject;", "createMenuItemMapOrList", "LASHasWidgets;LADXMenuBuilder;LASIFragment;LNSObject;I", "createMenuItem", "createActionLayout", "LASHasWidgets;LADMenuItem;LNSString;" };
  static const J2ObjcClassInfo _ADXMenuParser = { "MenuParser", "androidx.appcompat.view.menu", ptrTable, methods, NULL, 7, 0x1, 7, 0, -1, -1, -1, -1, -1 };
  return &_ADXMenuParser;
}

@end

void ADXMenuParser_init(ADXMenuParser *self) {
  NSObject_init(self);
}

ADXMenuParser *new_ADXMenuParser_init() {
  J2OBJC_NEW_IMPL(ADXMenuParser, init)
}

ADXMenuParser *create_ADXMenuParser_init() {
  J2OBJC_CREATE_IMPL(ADXMenuParser, init)
}

void ADXMenuParser_parseMenuWithASHasWidgets_withADXMenuBuilder_withNSString_withASIFragment_(id<ASHasWidgets> parent, ADXMenuBuilder *menu, NSString *json, id<ASIFragment> fragment) {
  ADXMenuParser_initialize();
  id<JavaUtilMap> jsonMap = ASPluginInvoker_unmarshalWithNSString_withIOSClass_(json, JavaUtilMap_class_());
  if ([((id<JavaUtilMap>) nil_chk(jsonMap)) containsKeyWithId:@"menu"]) {
    id<JavaUtilMap> menuMap = ASPluginInvoker_getMapWithId_([jsonMap getWithId:@"menu"]);
    ADXMenuParser_parseGroupAndItemWithASHasWidgets_withADXMenuBuilder_withASIFragment_withJavaUtilMap_withInt_(parent, menu, fragment, menuMap, 0);
  }
}

void ADXMenuParser_parseGroupAndItemWithASHasWidgets_withADXMenuBuilder_withASIFragment_withJavaUtilMap_withInt_(id<ASHasWidgets> parent, ADXMenuBuilder *menu, id<ASIFragment> fragment, id<JavaUtilMap> parentMap, jint groupId) {
  ADXMenuParser_initialize();
  for (id<JavaUtilIterator> iterator = JreRetainedLocalValue([((id<JavaUtilSet>) nil_chk([((id<JavaUtilMap>) nil_chk(parentMap)) entrySet])) iterator]); [((id<JavaUtilIterator>) nil_chk(iterator)) hasNext]; ) {
    id<JavaUtilMap_Entry> entry_ = JreRetainedLocalValue([iterator next]);
    id item = JreRetainedLocalValue([((id<JavaUtilMap_Entry>) nil_chk(entry_)) getValue]);
    {
      id<JavaUtilList> itemList;
      switch (JreIndexOfStr([entry_ getKey], (id[]){ @"item", @"group" }, 2)) {
        case 0:
        ADXMenuParser_createMenuItemMapOrListWithASHasWidgets_withADXMenuBuilder_withASIFragment_withId_withInt_(parent, menu, fragment, item, groupId);
        break;
        case 1:
        itemList = ASPluginInvoker_getListWithId_(item);
        if (itemList != nil) {
          for (id __strong itemObj in itemList) {
            ADXMenuParser_parseGroupWithASHasWidgets_withADXMenuBuilder_withASIFragment_withId_(parent, menu, fragment, itemObj);
          }
        }
        else {
          ADXMenuParser_parseGroupWithASHasWidgets_withADXMenuBuilder_withASIFragment_withId_(parent, menu, fragment, item);
        }
        break;
        default:
        break;
      }
    }
  }
}

void ADXMenuParser_parseGroupWithASHasWidgets_withADXMenuBuilder_withASIFragment_withId_(id<ASHasWidgets> parent, ADXMenuBuilder *menu, id<ASIFragment> fragment, id item) {
  ADXMenuParser_initialize();
  id<JavaUtilMap> itemMap = ASPluginInvoker_getMapWithId_(item);
  jint menugroupId = 0;
  if ([((id<JavaUtilMap>) nil_chk(itemMap)) containsKeyWithId:@"@android:id"]) {
    menugroupId = [((JavaLangInteger *) nil_chk((JavaLangInteger *) cast_chk(ASPluginInvoker_convertFromWithASIConverter_withJavaUtilMap_withId_withASIFragment_(ASPluginInvoker_getConverterWithNSString_(@"id"), nil, [itemMap getWithId:@"@android:id"], fragment), [JavaLangInteger class]))) intValue];
  }
  ADXMenuParser_parseGroupAndItemWithASHasWidgets_withADXMenuBuilder_withASIFragment_withJavaUtilMap_withInt_(parent, menu, fragment, itemMap, menugroupId);
}

void ADXMenuParser_createMenuItemMapOrListWithASHasWidgets_withADXMenuBuilder_withASIFragment_withId_withInt_(id<ASHasWidgets> parent, ADXMenuBuilder *menu, id<ASIFragment> fragment, id item, jint groupId) {
  ADXMenuParser_initialize();
  id<JavaUtilList> itemList = ASPluginInvoker_getListWithId_(item);
  if (itemList != nil) {
    for (id __strong itemObj in itemList) {
      ADXMenuParser_createMenuItemWithASHasWidgets_withADXMenuBuilder_withASIFragment_withId_withInt_(parent, menu, fragment, itemObj, groupId);
    }
  }
  else {
    ADXMenuParser_createMenuItemWithASHasWidgets_withADXMenuBuilder_withASIFragment_withId_withInt_(parent, menu, fragment, item, groupId);
  }
}

void ADXMenuParser_createMenuItemWithASHasWidgets_withADXMenuBuilder_withASIFragment_withId_withInt_(id<ASHasWidgets> parent, ADXMenuBuilder *menu, id<ASIFragment> fragment, id payLoad, jint groupId) {
  ADXMenuParser_initialize();
  id<JavaUtilMap> itemMap = ASPluginInvoker_getMapWithId_(payLoad);
  jint id_ = 0;
  jint categoryOrder = 0;
  NSString *title = @"";
  ADDrawable *icon = nil;
  jint showAsAction = -1;
  if ([((id<JavaUtilMap>) nil_chk(itemMap)) containsKeyWithId:@"@android:id"]) {
    id_ = [((JavaLangInteger *) nil_chk((JavaLangInteger *) cast_chk(ASPluginInvoker_convertFromWithASIConverter_withJavaUtilMap_withId_withASIFragment_(ASPluginInvoker_getConverterWithNSString_(@"id"), nil, [itemMap getWithId:@"@android:id"], fragment), [JavaLangInteger class]))) intValue];
  }
  if ([itemMap containsKeyWithId:@"@android:title"]) {
    title = (NSString *) cast_chk(ASPluginInvoker_convertFromWithASIConverter_withJavaUtilMap_withId_withASIFragment_(ASPluginInvoker_getConverterWithNSString_(@"resourcestring"), nil, [itemMap getWithId:@"@android:title"], fragment), [NSString class]);
  }
  if ([itemMap containsKeyWithId:@"@android:icon"]) {
    icon = (ADDrawable *) cast_chk(ASPluginInvoker_convertFromWithASIConverter_withJavaUtilMap_withId_withASIFragment_(ASPluginInvoker_getConverterWithNSString_(@"drawable"), nil, [itemMap getWithId:@"@android:icon"], fragment), [ADDrawable class]);
  }
  if ([itemMap containsKeyWithId:@"@app:showAsAction"]) {
    ASWidgetFactory_getWithNSString_withBoolean_(@"androidx.appcompat.widget.ActionMenuView", false);
    showAsAction = [((JavaLangInteger *) nil_chk((JavaLangInteger *) cast_chk(ASPluginInvoker_convertFromWithASIConverter_withJavaUtilMap_withId_withASIFragment_(ASPluginInvoker_getConverterWithNSString_(@"androidx.appcompat.widget.ActionMenuView.showAsAction"), nil, [itemMap getWithId:@"@app:showAsAction"], fragment), [JavaLangInteger class]))) intValue];
  }
  id<ADMenuItem> menuItem = JreRetainedLocalValue([((ADXMenuBuilder *) nil_chk(menu)) addWithInt:groupId withInt:id_ withInt:categoryOrder withJavaLangCharSequence:title]);
  [((id<ADMenuItem>) nil_chk(menuItem)) setEnabledWithBoolean:true];
  [menuItem setVisibleWithBoolean:true];
  jboolean actionViewSpecified = false;
  if ([itemMap containsKeyWithId:@"@app:actionViewClass"]) {
    ADView *actionView = ((ADView *) cast_chk([((id<ASIWidget>) nil_chk(ASWidgetFactory_createWidgetWithNSString_withNSString_withASHasWidgets_withBoolean_((NSString *) cast_chk([itemMap getWithId:@"@app:actionViewClass"], [NSString class]), @"", parent, false))) asWidget], [ADView class]));
    if ([ADXSupportMenuItem_class_() isInstance:menuItem]) {
      [((id<ADXSupportMenuItem>) cast_check(menuItem, ADXSupportMenuItem_class_())) setActionViewWithADView:actionView];
    }
    actionViewSpecified = true;
  }
  if ([itemMap containsKeyWithId:@"@app:actionLayout"]) {
    NSString *actionLayout = (NSString *) cast_chk([itemMap getWithId:@"@app:actionLayout"], [NSString class]);
    ADXMenuParser_createActionLayoutWithASHasWidgets_withADMenuItem_withNSString_(parent, menuItem, actionLayout);
  }
  if ([itemMap containsKeyWithId:@"@android:actionLayout"]) {
    NSString *actionLayout = (NSString *) cast_chk([itemMap getWithId:@"@android:actionLayout"], [NSString class]);
    ADXMenuParser_createActionLayoutWithASHasWidgets_withADMenuItem_withNSString_(parent, menuItem, actionLayout);
  }
  if (icon != nil) {
    [menuItem setIconWithADDrawable:icon];
  }
  if (showAsAction != -1) {
    [menuItem setShowAsActionWithInt:showAsAction];
  }
  if ([itemMap containsKeyWithId:@"menu"]) {
    id<JavaUtilMap> menuMap = ASPluginInvoker_getMapWithId_([itemMap getWithId:@"menu"]);
    ADXSubMenuBuilder *subMenu = create_ADXSubMenuBuilder_initWithADContext_withADXMenuBuilder_withADXMenuItemImpl_(nil, menu, (ADXMenuItemImpl *) cast_chk(menuItem, [ADXMenuItemImpl class]));
    [((ADXMenuItemImpl *) cast_chk(menuItem, [ADXMenuItemImpl class])) setSubMenuWithADXSubMenuBuilder:subMenu];
    ADXMenuParser_parseGroupAndItemWithASHasWidgets_withADXMenuBuilder_withASIFragment_withJavaUtilMap_withInt_(parent, subMenu, fragment, menuMap, 0);
  }
}

void ADXMenuParser_createActionLayoutWithASHasWidgets_withADMenuItem_withNSString_(id<ASHasWidgets> parent, id<ADMenuItem> menuItem, NSString *actionLayout) {
  ADXMenuParser_initialize();
  id<ASIWidget> template_ = (id<ASIWidget>) cast_check([((id<ASHasWidgets>) nil_chk(parent)) quickConvertWithId:actionLayout withNSString:@"template"], ASIWidget_class_());
  id<ASIWidget> widget = JreRetainedLocalValue([((id<ASIWidget>) nil_chk(template_)) loadLazyWidgetsWithASHasWidgets:parent]);
  if ([ADXSupportMenuItem_class_() isInstance:menuItem]) {
    [((id<ADXSupportMenuItem>) nil_chk(((id<ADXSupportMenuItem>) cast_check(menuItem, ADXSupportMenuItem_class_())))) setActionViewWithADView:(ADView *) cast_chk([((id<ASIWidget>) nil_chk(widget)) asWidget], [ADView class])];
  }
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADXMenuParser)
