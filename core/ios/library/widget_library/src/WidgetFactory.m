//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\widget\WidgetFactory.java
//

#include "HasWidgets.h"
#include "IAttributable.h"
#include "IBehavior.h"
#include "ICompositeDecorator.h"
#include "IDecorator.h"
#include "IFragment.h"
#include "ILifeCycleDecorator.h"
#include "IOSObjectArray.h"
#include "IWidget.h"
#include "J2ObjC_source.h"
#include "WidgetAttribute.h"
#include "WidgetAttributeMap.h"
#include "WidgetFactory.h"
#include "java/lang/Integer.h"
#include "java/util/ArrayList.h"
#include "java/util/Collection.h"
#include "java/util/Comparator.h"
#include "java/util/HashMap.h"
#include "java/util/List.h"
#include "java/util/Map.h"
#include "java/util/Set.h"
#include "java/util/TreeMap.h"
#include "java/util/TreeSet.h"
#include "java/util/function/Function.h"
#include "java/util/function/ToDoubleFunction.h"
#include "java/util/function/ToIntFunction.h"
#include "java/util/function/ToLongFunction.h"

@protocol JavaUtilComparator;
@protocol JavaUtilFunctionFunction;
@protocol JavaUtilFunctionToDoubleFunction;
@protocol JavaUtilFunctionToIntFunction;
@protocol JavaUtilFunctionToLongFunction;
@protocol JavaUtilMap;


#pragma clang diagnostic ignored "-Wprotocol"

@interface ASWidgetFactory ()

+ (void)updateStyleAttrsWithNSString:(NSString *)localname
               withASWidgetAttribute:(ASWidgetAttribute *)widgetAttribute;

@end

inline id<JavaUtilMap> ASWidgetFactory_get_attributeMap(void);
inline id<JavaUtilMap> ASWidgetFactory_set_attributeMap(id<JavaUtilMap> value);
static id<JavaUtilMap> ASWidgetFactory_attributeMap;
J2OBJC_STATIC_FIELD_OBJ(ASWidgetFactory, attributeMap, id<JavaUtilMap>)

inline id<JavaUtilMap> ASWidgetFactory_get_styleAttributes(void);
inline id<JavaUtilMap> ASWidgetFactory_set_styleAttributes(id<JavaUtilMap> value);
static id<JavaUtilMap> ASWidgetFactory_styleAttributes;
J2OBJC_STATIC_FIELD_OBJ(ASWidgetFactory, styleAttributes, id<JavaUtilMap>)

inline id<JavaUtilMap> ASWidgetFactory_get_constructorAttributeMap(void);
inline id<JavaUtilMap> ASWidgetFactory_set_constructorAttributeMap(id<JavaUtilMap> value);
static id<JavaUtilMap> ASWidgetFactory_constructorAttributeMap;
J2OBJC_STATIC_FIELD_OBJ(ASWidgetFactory, constructorAttributeMap, id<JavaUtilMap>)

inline id<JavaUtilMap> ASWidgetFactory_get_registrationMap(void);
inline id<JavaUtilMap> ASWidgetFactory_set_registrationMap(id<JavaUtilMap> value);
static id<JavaUtilMap> ASWidgetFactory_registrationMap;
J2OBJC_STATIC_FIELD_OBJ(ASWidgetFactory, registrationMap, id<JavaUtilMap>)

inline id<JavaUtilMap> ASWidgetFactory_get_decoratorMap(void);
inline id<JavaUtilMap> ASWidgetFactory_set_decoratorMap(id<JavaUtilMap> value);
static id<JavaUtilMap> ASWidgetFactory_decoratorMap;
J2OBJC_STATIC_FIELD_OBJ(ASWidgetFactory, decoratorMap, id<JavaUtilMap>)

inline id<JavaUtilMap> ASWidgetFactory_get_lifeCycleDecoratorMap(void);
inline id<JavaUtilMap> ASWidgetFactory_set_lifeCycleDecoratorMap(id<JavaUtilMap> value);
static id<JavaUtilMap> ASWidgetFactory_lifeCycleDecoratorMap;
J2OBJC_STATIC_FIELD_OBJ(ASWidgetFactory, lifeCycleDecoratorMap, id<JavaUtilMap>)

inline id<JavaUtilMap> ASWidgetFactory_get_behaviorMap(void);
inline id<JavaUtilMap> ASWidgetFactory_set_behaviorMap(id<JavaUtilMap> value);
static id<JavaUtilMap> ASWidgetFactory_behaviorMap;
J2OBJC_STATIC_FIELD_OBJ(ASWidgetFactory, behaviorMap, id<JavaUtilMap>)

inline id<JavaUtilMap> ASWidgetFactory_get_attributableForMap(void);
inline id<JavaUtilMap> ASWidgetFactory_set_attributableForMap(id<JavaUtilMap> value);
static id<JavaUtilMap> ASWidgetFactory_attributableForMap;
J2OBJC_STATIC_FIELD_OBJ(ASWidgetFactory, attributableForMap, id<JavaUtilMap>)

inline id<JavaUtilMap> ASWidgetFactory_get_attributableMap(void);
inline id<JavaUtilMap> ASWidgetFactory_set_attributableMap(id<JavaUtilMap> value);
static id<JavaUtilMap> ASWidgetFactory_attributableMap;
J2OBJC_STATIC_FIELD_OBJ(ASWidgetFactory, attributableMap, id<JavaUtilMap>)

inline id<ASICompositeDecorator> ASWidgetFactory_get_compositeDecorator(void);
inline id<ASICompositeDecorator> ASWidgetFactory_set_compositeDecorator(id<ASICompositeDecorator> value);
static id<ASICompositeDecorator> ASWidgetFactory_compositeDecorator;
J2OBJC_STATIC_FIELD_OBJ(ASWidgetFactory, compositeDecorator, id<ASICompositeDecorator>)

__attribute__((unused)) static void ASWidgetFactory_updateStyleAttrsWithNSString_withASWidgetAttribute_(NSString *localname, ASWidgetAttribute *widgetAttribute);

@interface ASWidgetFactory_1 : NSObject < JavaUtilComparator >

- (instancetype)init;

- (jint)compareWithId:(ASWidgetAttribute *)o1
               withId:(ASWidgetAttribute *)o2;

@end

J2OBJC_EMPTY_STATIC_INIT(ASWidgetFactory_1)

__attribute__((unused)) static void ASWidgetFactory_1_init(ASWidgetFactory_1 *self);

__attribute__((unused)) static ASWidgetFactory_1 *new_ASWidgetFactory_1_init(void) NS_RETURNS_RETAINED;

__attribute__((unused)) static ASWidgetFactory_1 *create_ASWidgetFactory_1_init(void);

J2OBJC_INITIALIZED_DEFN(ASWidgetFactory)

@implementation ASWidgetFactory

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASWidgetFactory_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

+ (id<ASIWidget>)createWidgetWithNSString:(NSString *)localName
                             withNSString:(NSString *)themeName
                         withASHasWidgets:(id<ASHasWidgets>)parent
                              withBoolean:(jboolean)addNativeOnly {
  return ASWidgetFactory_createWidgetWithNSString_withNSString_withASHasWidgets_withBoolean_(localName, themeName, parent, addNativeOnly);
}

+ (id<JavaUtilSet>)getConstructorAttributesWithNSString:(NSString *)localname {
  return ASWidgetFactory_getConstructorAttributesWithNSString_(localname);
}

+ (void)registerConstructorAttributeWithNSString:(NSString *)localname
                   withASWidgetAttribute_Builder:(ASWidgetAttribute_Builder *)builder {
  ASWidgetFactory_registerConstructorAttributeWithNSString_withASWidgetAttribute_Builder_(localname, builder);
}

+ (id<ASICompositeDecorator>)getCompositeDecorator {
  return ASWidgetFactory_getCompositeDecorator();
}

+ (void)register__WithASICompositeDecorator:(id<ASICompositeDecorator>)compositeDecorator {
  ASWidgetFactory_register__WithASICompositeDecorator_(compositeDecorator);
}

+ (id<ASIAttributable>)getAttributableWithNSString:(NSString *)localname {
  return ASWidgetFactory_getAttributableWithNSString_(localname);
}

+ (id<JavaUtilList>)getAttributablesWithNSStringArray:(IOSObjectArray *)localnames {
  return ASWidgetFactory_getAttributablesWithNSStringArray_(localnames);
}

+ (id<ASIWidget>)getWithNSString:(NSString *)localname
                     withBoolean:(jboolean)isLazy {
  return ASWidgetFactory_getWithNSString_withBoolean_(localname, isLazy);
}

+ (id<ASIDecorator>)getDecoratorWithASICompositeDecorator:(id<ASICompositeDecorator>)wrappingWidget
                                            withASIWidget:(id<ASIWidget>)wrappedWidget
                                             withNSString:(NSString *)localname {
  return ASWidgetFactory_getDecoratorWithASICompositeDecorator_withASIWidget_withNSString_(wrappingWidget, wrappedWidget, localname);
}

+ (void)loadWidgetWithASIWidget:(id<ASIWidget>)widget
       withASWidgetAttributeMap:(ASWidgetAttributeMap *)attributes
                withASIFragment:(id<ASIFragment>)fragment
                withJavaUtilMap:(id<JavaUtilMap>)params {
  ASWidgetFactory_loadWidgetWithASIWidget_withASWidgetAttributeMap_withASIFragment_withJavaUtilMap_(widget, attributes, fragment, params);
}

+ (void)register__WithASIWidget:(id<ASIWidget>)ui {
  ASWidgetFactory_register__WithASIWidget_(ui);
}

+ (void)registerDecoratorWithASIDecorator:(id<ASIDecorator>)ui {
  ASWidgetFactory_registerDecoratorWithASIDecorator_(ui);
}

+ (jboolean)isAttributeLoadedWithNSString:(NSString *)localname {
  return ASWidgetFactory_isAttributeLoadedWithNSString_(localname);
}

+ (void)registerAttributeWithNSString:(NSString *)localname
        withASWidgetAttribute_Builder:(ASWidgetAttribute_Builder *)builder {
  ASWidgetFactory_registerAttributeWithNSString_withASWidgetAttribute_Builder_(localname, builder);
}

+ (void)registerAttributeWithNSString:(NSString *)localname
                withASWidgetAttribute:(ASWidgetAttribute *)widgetAttribute {
  ASWidgetFactory_registerAttributeWithNSString_withASWidgetAttribute_(localname, widgetAttribute);
}

+ (void)updateStyleAttrsWithNSString:(NSString *)localname
               withASWidgetAttribute:(ASWidgetAttribute *)widgetAttribute {
  ASWidgetFactory_updateStyleAttrsWithNSString_withASWidgetAttribute_(localname, widgetAttribute);
}

+ (id<JavaUtilSet>)getStyleAttributesWithNSString:(NSString *)localname {
  return ASWidgetFactory_getStyleAttributesWithNSString_(localname);
}

+ (ASWidgetAttribute *)getAttributeWithNSString:(NSString *)localname
                                   withNSString:(NSString *)attributeName {
  return ASWidgetFactory_getAttributeWithNSString_withNSString_(localname, attributeName);
}

+ (id<ASILifeCycleDecorator>)getLifeCycleDecorWithNSString:(NSString *)lifeCycleDecorator
                                             withASIWidget:(id<ASIWidget>)widget {
  return ASWidgetFactory_getLifeCycleDecorWithNSString_withASIWidget_(lifeCycleDecorator, widget);
}

+ (void)registerLifeCycleDecoratorWithNSString:(NSString *)decorator
                     withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)lifeCycleDecorator {
  ASWidgetFactory_registerLifeCycleDecoratorWithNSString_withASILifeCycleDecorator_(decorator, lifeCycleDecorator);
}

+ (void)registerBehaviorWithNSString:(NSString *)decorator
                     withASIBehavior:(id<ASIBehavior>)behavior {
  ASWidgetFactory_registerBehaviorWithNSString_withASIBehavior_(decorator, behavior);
}

+ (id)getBehaviorWithNSString:(NSString *)behavior {
  return ASWidgetFactory_getBehaviorWithNSString_(behavior);
}

+ (void)registerAttributableForWithNSString:(NSString *)localName
                        withASIAttributable:(id<ASIAttributable>)attributable {
  ASWidgetFactory_registerAttributableForWithNSString_withASIAttributable_(localName, attributable);
}

+ (id<JavaUtilCollection>)getAttributesWithNSString:(NSString *)localName {
  return ASWidgetFactory_getAttributesWithNSString_(localName);
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LASIWidget;", 0x9, 0, 1, -1, -1, -1, -1 },
    { NULL, "LJavaUtilSet;", 0x9, 2, 3, -1, 4, -1, -1 },
    { NULL, "V", 0x9, 5, 6, -1, -1, -1, -1 },
    { NULL, "LASICompositeDecorator;", 0x9, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 7, 8, -1, -1, -1, -1 },
    { NULL, "LASIAttributable;", 0x9, 9, 3, -1, -1, -1, -1 },
    { NULL, "LJavaUtilList;", 0x89, 10, 11, -1, 12, -1, -1 },
    { NULL, "LASIWidget;", 0x9, 13, 14, -1, -1, -1, -1 },
    { NULL, "LASIDecorator;", 0x9, 15, 16, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 17, 18, -1, 19, -1, -1 },
    { NULL, "V", 0x9, 7, 20, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 21, 22, -1, -1, -1, -1 },
    { NULL, "Z", 0x9, 23, 3, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 24, 6, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 24, 25, -1, -1, -1, -1 },
    { NULL, "V", 0xa, 26, 25, -1, -1, -1, -1 },
    { NULL, "LJavaUtilSet;", 0x9, 27, 3, -1, 28, -1, -1 },
    { NULL, "LASWidgetAttribute;", 0x9, 29, 30, -1, -1, -1, -1 },
    { NULL, "LASILifeCycleDecorator;", 0x9, 31, 32, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 33, 34, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 35, 36, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x9, 37, 3, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 38, 39, -1, -1, -1, -1 },
    { NULL, "LJavaUtilCollection;", 0x9, 40, 3, -1, 41, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(createWidgetWithNSString:withNSString:withASHasWidgets:withBoolean:);
  methods[2].selector = @selector(getConstructorAttributesWithNSString:);
  methods[3].selector = @selector(registerConstructorAttributeWithNSString:withASWidgetAttribute_Builder:);
  methods[4].selector = @selector(getCompositeDecorator);
  methods[5].selector = @selector(register__WithASICompositeDecorator:);
  methods[6].selector = @selector(getAttributableWithNSString:);
  methods[7].selector = @selector(getAttributablesWithNSStringArray:);
  methods[8].selector = @selector(getWithNSString:withBoolean:);
  methods[9].selector = @selector(getDecoratorWithASICompositeDecorator:withASIWidget:withNSString:);
  methods[10].selector = @selector(loadWidgetWithASIWidget:withASWidgetAttributeMap:withASIFragment:withJavaUtilMap:);
  methods[11].selector = @selector(register__WithASIWidget:);
  methods[12].selector = @selector(registerDecoratorWithASIDecorator:);
  methods[13].selector = @selector(isAttributeLoadedWithNSString:);
  methods[14].selector = @selector(registerAttributeWithNSString:withASWidgetAttribute_Builder:);
  methods[15].selector = @selector(registerAttributeWithNSString:withASWidgetAttribute:);
  methods[16].selector = @selector(updateStyleAttrsWithNSString:withASWidgetAttribute:);
  methods[17].selector = @selector(getStyleAttributesWithNSString:);
  methods[18].selector = @selector(getAttributeWithNSString:withNSString:);
  methods[19].selector = @selector(getLifeCycleDecorWithNSString:withASIWidget:);
  methods[20].selector = @selector(registerLifeCycleDecoratorWithNSString:withASILifeCycleDecorator:);
  methods[21].selector = @selector(registerBehaviorWithNSString:withASIBehavior:);
  methods[22].selector = @selector(getBehaviorWithNSString:);
  methods[23].selector = @selector(registerAttributableForWithNSString:withASIAttributable:);
  methods[24].selector = @selector(getAttributesWithNSString:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "attributeMap", "LJavaUtilMap;", .constantValue.asLong = 0, 0xa, -1, 42, 43, -1 },
    { "styleAttributes", "LJavaUtilMap;", .constantValue.asLong = 0, 0xa, -1, 44, 45, -1 },
    { "constructorAttributeMap", "LJavaUtilMap;", .constantValue.asLong = 0, 0xa, -1, 46, 43, -1 },
    { "registrationMap", "LJavaUtilMap;", .constantValue.asLong = 0, 0xa, -1, 47, 48, -1 },
    { "decoratorMap", "LJavaUtilMap;", .constantValue.asLong = 0, 0xa, -1, 49, 50, -1 },
    { "lifeCycleDecoratorMap", "LJavaUtilMap;", .constantValue.asLong = 0, 0xa, -1, 51, 52, -1 },
    { "behaviorMap", "LJavaUtilMap;", .constantValue.asLong = 0, 0xa, -1, 53, 54, -1 },
    { "attributableForMap", "LJavaUtilMap;", .constantValue.asLong = 0, 0xa, -1, 55, 56, -1 },
    { "attributableMap", "LJavaUtilMap;", .constantValue.asLong = 0, 0xa, -1, 57, 58, -1 },
    { "compositeDecorator", "LASICompositeDecorator;", .constantValue.asLong = 0, 0xa, -1, 59, -1, -1 },
  };
  static const void *ptrTable[] = { "createWidget", "LNSString;LNSString;LASHasWidgets;Z", "getConstructorAttributes", "LNSString;", "(Ljava/lang/String;)Ljava/util/Set<Ljava/lang/String;>;", "registerConstructorAttribute", "LNSString;LASWidgetAttribute_Builder;", "register", "LASICompositeDecorator;", "getAttributable", "getAttributables", "[LNSString;", "([Ljava/lang/String;)Ljava/util/List<Lcom/ashera/widget/IAttributable;>;", "get", "LNSString;Z", "getDecorator", "LASICompositeDecorator;LASIWidget;LNSString;", "loadWidget", "LASIWidget;LASWidgetAttributeMap;LASIFragment;LJavaUtilMap;", "(Lcom/ashera/widget/IWidget;Lcom/ashera/widget/WidgetAttributeMap;Lcom/ashera/core/IFragment;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V", "LASIWidget;", "registerDecorator", "LASIDecorator;", "isAttributeLoaded", "registerAttribute", "LNSString;LASWidgetAttribute;", "updateStyleAttrs", "getStyleAttributes", "(Ljava/lang/String;)Ljava/util/Set<Lcom/ashera/widget/WidgetAttribute;>;", "getAttribute", "LNSString;LNSString;", "getLifeCycleDecor", "LNSString;LASIWidget;", "registerLifeCycleDecorator", "LNSString;LASILifeCycleDecorator;", "registerBehavior", "LNSString;LASIBehavior;", "getBehavior", "registerAttributableFor", "LNSString;LASIAttributable;", "getAttributes", "(Ljava/lang/String;)Ljava/util/Collection<Lcom/ashera/widget/WidgetAttribute;>;", &ASWidgetFactory_attributeMap, "Ljava/util/Map<Ljava/lang/String;Ljava/util/TreeMap<Ljava/lang/String;Lcom/ashera/widget/WidgetAttribute;>;>;", &ASWidgetFactory_styleAttributes, "Ljava/util/Map<Ljava/lang/String;Ljava/util/Set<Lcom/ashera/widget/WidgetAttribute;>;>;", &ASWidgetFactory_constructorAttributeMap, &ASWidgetFactory_registrationMap, "Ljava/util/Map<Ljava/lang/String;Lcom/ashera/widget/IWidget;>;", &ASWidgetFactory_decoratorMap, "Ljava/util/Map<Ljava/lang/String;Lcom/ashera/widget/IDecorator;>;", &ASWidgetFactory_lifeCycleDecoratorMap, "Ljava/util/Map<Ljava/lang/String;Lcom/ashera/widget/ILifeCycleDecorator;>;", &ASWidgetFactory_behaviorMap, "Ljava/util/Map<Ljava/lang/String;Lcom/ashera/widget/IBehavior;>;", &ASWidgetFactory_attributableForMap, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/ashera/widget/IAttributable;>;>;", &ASWidgetFactory_attributableMap, "Ljava/util/Map<Ljava/lang/String;Lcom/ashera/widget/IAttributable;>;", &ASWidgetFactory_compositeDecorator };
  static const J2ObjcClassInfo _ASWidgetFactory = { "WidgetFactory", "com.ashera.widget", ptrTable, methods, fields, 7, 0x1, 25, 10, -1, -1, -1, -1, -1 };
  return &_ASWidgetFactory;
}

+ (void)initialize {
  if (self == [ASWidgetFactory class]) {
    JreStrongAssignAndConsume(&ASWidgetFactory_attributeMap, new_JavaUtilHashMap_init());
    JreStrongAssignAndConsume(&ASWidgetFactory_styleAttributes, new_JavaUtilHashMap_init());
    JreStrongAssignAndConsume(&ASWidgetFactory_constructorAttributeMap, new_JavaUtilHashMap_init());
    JreStrongAssignAndConsume(&ASWidgetFactory_registrationMap, new_JavaUtilHashMap_init());
    JreStrongAssignAndConsume(&ASWidgetFactory_decoratorMap, new_JavaUtilHashMap_init());
    JreStrongAssignAndConsume(&ASWidgetFactory_lifeCycleDecoratorMap, new_JavaUtilHashMap_init());
    JreStrongAssignAndConsume(&ASWidgetFactory_behaviorMap, new_JavaUtilHashMap_init());
    JreStrongAssignAndConsume(&ASWidgetFactory_attributableForMap, new_JavaUtilHashMap_init());
    JreStrongAssignAndConsume(&ASWidgetFactory_attributableMap, new_JavaUtilHashMap_init());
    J2OBJC_SET_INITIALIZED(ASWidgetFactory)
  }
}

@end

void ASWidgetFactory_init(ASWidgetFactory *self) {
  NSObject_init(self);
}

ASWidgetFactory *new_ASWidgetFactory_init() {
  J2OBJC_NEW_IMPL(ASWidgetFactory, init)
}

ASWidgetFactory *create_ASWidgetFactory_init() {
  J2OBJC_CREATE_IMPL(ASWidgetFactory, init)
}

id<ASIWidget> ASWidgetFactory_createWidgetWithNSString_withNSString_withASHasWidgets_withBoolean_(NSString *localName, NSString *themeName, id<ASHasWidgets> parent, jboolean addNativeOnly) {
  ASWidgetFactory_initialize();
  id<ASIWidget> widget = ASWidgetFactory_getWithNSString_withBoolean_(localName, false);
  [((id<ASIWidget>) nil_chk(widget)) setParentWithASHasWidgets:parent];
  id<JavaUtilMap> params = create_JavaUtilHashMap_init();
  [widget applyThemeConstructorArgsStyleWithNSString:themeName withJavaUtilMap:params];
  [widget createWithASIFragment:[((id<ASHasWidgets>) nil_chk(parent)) getFragment] withJavaUtilMap:params];
  [widget applyThemeStyleWithNSString:themeName];
  if (addNativeOnly) {
    [parent addWithASIWidget:widget withInt:-2];
  }
  else {
    [parent addWithASIWidget:widget withInt:-1];
  }
  [widget initialized];
  return widget;
}

id<JavaUtilSet> ASWidgetFactory_getConstructorAttributesWithNSString_(NSString *localname) {
  ASWidgetFactory_initialize();
  JavaUtilTreeMap *treeMap = JreRetainedLocalValue([((id<JavaUtilMap>) nil_chk(ASWidgetFactory_constructorAttributeMap)) getWithId:localname]);
  if (treeMap == nil) {
    return nil;
  }
  return [treeMap keySet];
}

void ASWidgetFactory_registerConstructorAttributeWithNSString_withASWidgetAttribute_Builder_(NSString *localname, ASWidgetAttribute_Builder *builder) {
  ASWidgetFactory_initialize();
  ASWidgetAttribute *widgetAttribute = JreRetainedLocalValue([((ASWidgetAttribute_Builder *) nil_chk(builder)) build]);
  if (![((id<JavaUtilMap>) nil_chk(ASWidgetFactory_constructorAttributeMap)) containsKeyWithId:localname]) {
    [((id<JavaUtilMap>) nil_chk(ASWidgetFactory_constructorAttributeMap)) putWithId:localname withId:create_JavaUtilTreeMap_init()];
  }
  NSString *attributeName = JreRetainedLocalValue([((ASWidgetAttribute *) nil_chk(widgetAttribute)) getAttributeName]);
  if (![((JavaUtilTreeMap *) nil_chk([((id<JavaUtilMap>) nil_chk(ASWidgetFactory_constructorAttributeMap)) getWithId:localname])) containsKeyWithId:attributeName]) {
    [((JavaUtilTreeMap *) nil_chk([((id<JavaUtilMap>) nil_chk(ASWidgetFactory_constructorAttributeMap)) getWithId:localname])) putWithId:attributeName withId:widgetAttribute];
  }
}

id<ASICompositeDecorator> ASWidgetFactory_getCompositeDecorator() {
  ASWidgetFactory_initialize();
  return ASWidgetFactory_compositeDecorator;
}

void ASWidgetFactory_register__WithASICompositeDecorator_(id<ASICompositeDecorator> compositeDecorator) {
  ASWidgetFactory_initialize();
  JreStrongAssign(&ASWidgetFactory_compositeDecorator, compositeDecorator);
}

id<ASIAttributable> ASWidgetFactory_getAttributableWithNSString_(NSString *localname) {
  ASWidgetFactory_initialize();
  return [((id<JavaUtilMap>) nil_chk(ASWidgetFactory_attributableMap)) getWithId:localname];
}

id<JavaUtilList> ASWidgetFactory_getAttributablesWithNSStringArray_(IOSObjectArray *localnames) {
  ASWidgetFactory_initialize();
  id<JavaUtilList> attributables = create_JavaUtilArrayList_init();
  {
    IOSObjectArray *a__ = localnames;
    NSString * const *b__ = ((IOSObjectArray *) nil_chk(a__))->buffer_;
    NSString * const *e__ = b__ + a__->size_;
    while (b__ < e__) {
      NSString *localname = *b__++;
      id<JavaUtilList> list = JreRetainedLocalValue([((id<JavaUtilMap>) nil_chk(ASWidgetFactory_attributableForMap)) getWithId:localname]);
      if (list != nil) {
        [attributables addAllWithJavaUtilCollection:list];
      }
    }
  }
  return attributables;
}

id<ASIWidget> ASWidgetFactory_getWithNSString_withBoolean_(NSString *localname, jboolean isLazy) {
  ASWidgetFactory_initialize();
  id<ASIWidget> widgetPrototype = JreRetainedLocalValue([((id<JavaUtilMap>) nil_chk(ASWidgetFactory_registrationMap)) getWithId:localname]);
  if (widgetPrototype != nil) {
    if (isLazy) {
      id<ASIWidget> newLazyInstance = JreRetainedLocalValue([widgetPrototype newLazyInstance]);
      if (!ASWidgetFactory_isAttributeLoadedWithNSString_(localname)) {
        [((id<ASIWidget>) nil_chk(newLazyInstance)) loadAttributesWithNSString:localname];
        [widgetPrototype loadAttributesWithNSString:localname];
      }
      return newLazyInstance;
    }
    id<ASIWidget> newInstance = JreRetainedLocalValue([widgetPrototype newInstance]);
    if (!ASWidgetFactory_isAttributeLoadedWithNSString_(localname)) {
      [((id<ASIWidget>) nil_chk(newInstance)) loadAttributesWithNSString:localname];
    }
    return newInstance;
  }
  return nil;
}

id<ASIDecorator> ASWidgetFactory_getDecoratorWithASICompositeDecorator_withASIWidget_withNSString_(id<ASICompositeDecorator> wrappingWidget, id<ASIWidget> wrappedWidget, NSString *localname) {
  ASWidgetFactory_initialize();
  id<ASIDecorator> widgetPrototype = JreRetainedLocalValue([((id<JavaUtilMap>) nil_chk(ASWidgetFactory_decoratorMap)) getWithId:localname]);
  if (widgetPrototype != nil) {
    if (!ASWidgetFactory_isAttributeLoadedWithNSString_([((id<ASICompositeDecorator>) nil_chk(wrappingWidget)) getLocalName])) {
      [wrappingWidget loadAttributesWithNSString:[wrappingWidget getLocalName]];
    }
    return [widgetPrototype newInstanceWithASICompositeDecorator:wrappingWidget withASIWidget:wrappedWidget];
  }
  return nil;
}

void ASWidgetFactory_loadWidgetWithASIWidget_withASWidgetAttributeMap_withASIFragment_withJavaUtilMap_(id<ASIWidget> widget, ASWidgetAttributeMap *attributes, id<ASIFragment> fragment, id<JavaUtilMap> params) {
  ASWidgetFactory_initialize();
  [((id<ASIWidget>) nil_chk(widget)) createWithASIFragment:fragment withJavaUtilMap:params];
  if (attributes != nil) {
    [widget updateWidgetMapWithASWidgetAttributeMap:attributes];
  }
  [widget initialized];
}

void ASWidgetFactory_register__WithASIWidget_(id<ASIWidget> ui) {
  ASWidgetFactory_initialize();
  [((id<JavaUtilMap>) nil_chk(ASWidgetFactory_registrationMap)) putWithId:[((id<ASIWidget>) nil_chk(ui)) getLocalName] withId:ui];
}

void ASWidgetFactory_registerDecoratorWithASIDecorator_(id<ASIDecorator> ui) {
  ASWidgetFactory_initialize();
  [((id<JavaUtilMap>) nil_chk(ASWidgetFactory_decoratorMap)) putWithId:[((id<ASIDecorator>) nil_chk(ui)) getLocalName] withId:ui];
}

jboolean ASWidgetFactory_isAttributeLoadedWithNSString_(NSString *localname) {
  ASWidgetFactory_initialize();
  return [((id<JavaUtilMap>) nil_chk(ASWidgetFactory_attributeMap)) containsKeyWithId:localname];
}

void ASWidgetFactory_registerAttributeWithNSString_withASWidgetAttribute_Builder_(NSString *localname, ASWidgetAttribute_Builder *builder) {
  ASWidgetFactory_initialize();
  ASWidgetFactory_registerAttributeWithNSString_withASWidgetAttribute_(localname, [((ASWidgetAttribute_Builder *) nil_chk(builder)) build]);
}

void ASWidgetFactory_registerAttributeWithNSString_withASWidgetAttribute_(NSString *localname, ASWidgetAttribute *widgetAttribute) {
  ASWidgetFactory_initialize();
  if ([((ASWidgetAttribute *) nil_chk(widgetAttribute)) getStylePriority] != nil) {
    ASWidgetFactory_updateStyleAttrsWithNSString_withASWidgetAttribute_(localname, widgetAttribute);
  }
  if (![((id<JavaUtilMap>) nil_chk(ASWidgetFactory_attributeMap)) containsKeyWithId:localname]) {
    [((id<JavaUtilMap>) nil_chk(ASWidgetFactory_attributeMap)) putWithId:localname withId:create_JavaUtilTreeMap_init()];
  }
  NSString *attributeName = JreRetainedLocalValue([widgetAttribute getAttributeName]);
  if (![((JavaUtilTreeMap *) nil_chk([((id<JavaUtilMap>) nil_chk(ASWidgetFactory_attributeMap)) getWithId:localname])) containsKeyWithId:attributeName]) {
    [((JavaUtilTreeMap *) nil_chk([((id<JavaUtilMap>) nil_chk(ASWidgetFactory_attributeMap)) getWithId:localname])) putWithId:attributeName withId:widgetAttribute];
  }
}

void ASWidgetFactory_updateStyleAttrsWithNSString_withASWidgetAttribute_(NSString *localname, ASWidgetAttribute *widgetAttribute) {
  ASWidgetFactory_initialize();
  if (![((id<JavaUtilMap>) nil_chk(ASWidgetFactory_styleAttributes)) containsKeyWithId:localname]) {
    [((id<JavaUtilMap>) nil_chk(ASWidgetFactory_styleAttributes)) putWithId:localname withId:create_JavaUtilTreeSet_initWithJavaUtilComparator_(create_ASWidgetFactory_1_init())];
  }
  [((id<JavaUtilSet>) nil_chk([((id<JavaUtilMap>) nil_chk(ASWidgetFactory_styleAttributes)) getWithId:localname])) addWithId:widgetAttribute];
}

id<JavaUtilSet> ASWidgetFactory_getStyleAttributesWithNSString_(NSString *localname) {
  ASWidgetFactory_initialize();
  return [((id<JavaUtilMap>) nil_chk(ASWidgetFactory_styleAttributes)) getWithId:localname];
}

ASWidgetAttribute *ASWidgetFactory_getAttributeWithNSString_withNSString_(NSString *localname, NSString *attributeName) {
  ASWidgetFactory_initialize();
  JavaUtilTreeMap *treeMap = JreRetainedLocalValue([((id<JavaUtilMap>) nil_chk(ASWidgetFactory_attributeMap)) getWithId:localname]);
  if (treeMap != nil) {
    return [treeMap getWithId:attributeName];
  }
  return nil;
}

id<ASILifeCycleDecorator> ASWidgetFactory_getLifeCycleDecorWithNSString_withASIWidget_(NSString *lifeCycleDecorator, id<ASIWidget> widget) {
  ASWidgetFactory_initialize();
  id<ASILifeCycleDecorator> decorator = JreRetainedLocalValue([((id<JavaUtilMap>) nil_chk(ASWidgetFactory_lifeCycleDecoratorMap)) getWithId:lifeCycleDecorator]);
  if (decorator != nil) {
    return [decorator newInstanceWithASIWidget:widget];
  }
  return nil;
}

void ASWidgetFactory_registerLifeCycleDecoratorWithNSString_withASILifeCycleDecorator_(NSString *decorator, id<ASILifeCycleDecorator> lifeCycleDecorator) {
  ASWidgetFactory_initialize();
  [((id<JavaUtilMap>) nil_chk(ASWidgetFactory_lifeCycleDecoratorMap)) putWithId:decorator withId:lifeCycleDecorator];
}

void ASWidgetFactory_registerBehaviorWithNSString_withASIBehavior_(NSString *decorator, id<ASIBehavior> behavior) {
  ASWidgetFactory_initialize();
  [((id<JavaUtilMap>) nil_chk(ASWidgetFactory_behaviorMap)) putWithId:decorator withId:behavior];
}

id ASWidgetFactory_getBehaviorWithNSString_(NSString *behavior) {
  ASWidgetFactory_initialize();
  id<ASIBehavior> decorator = JreRetainedLocalValue([((id<JavaUtilMap>) nil_chk(ASWidgetFactory_behaviorMap)) getWithId:behavior]);
  if (decorator != nil) {
    return [decorator newInstance];
  }
  return nil;
}

void ASWidgetFactory_registerAttributableForWithNSString_withASIAttributable_(NSString *localName, id<ASIAttributable> attributable) {
  ASWidgetFactory_initialize();
  if (![((id<JavaUtilMap>) nil_chk(ASWidgetFactory_attributableForMap)) containsKeyWithId:localName]) {
    [((id<JavaUtilMap>) nil_chk(ASWidgetFactory_attributableForMap)) putWithId:localName withId:create_JavaUtilArrayList_init()];
  }
  [((id<JavaUtilMap>) nil_chk(ASWidgetFactory_attributableMap)) putWithId:[((id<ASIAttributable>) nil_chk(attributable)) getLocalName] withId:attributable];
  [((id<JavaUtilList>) nil_chk([((id<JavaUtilMap>) nil_chk(ASWidgetFactory_attributableForMap)) getWithId:localName])) addWithId:attributable];
}

id<JavaUtilCollection> ASWidgetFactory_getAttributesWithNSString_(NSString *localName) {
  ASWidgetFactory_initialize();
  return [((JavaUtilTreeMap *) nil_chk([((id<JavaUtilMap>) nil_chk(ASWidgetFactory_attributeMap)) getWithId:localName])) values];
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASWidgetFactory)

@implementation ASWidgetFactory_1

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASWidgetFactory_1_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (jint)compareWithId:(ASWidgetAttribute *)o1
               withId:(ASWidgetAttribute *)o2 {
  if ([((NSString *) nil_chk([((ASWidgetAttribute *) nil_chk(o1)) getAttributeName])) isEqual:[((ASWidgetAttribute *) nil_chk(o2)) getAttributeName]]) {
    return 0;
  }
  return [((JavaLangInteger *) nil_chk([o2 getStylePriority])) intValue] - [((JavaLangInteger *) nil_chk([o1 getStylePriority])) intValue];
}

- (id<JavaUtilComparator>)reversed {
  return JavaUtilComparator_reversed(self);
}

- (id<JavaUtilComparator>)thenComparingWithJavaUtilComparator:(id<JavaUtilComparator>)arg0 {
  return JavaUtilComparator_thenComparingWithJavaUtilComparator_(self, arg0);
}

- (id<JavaUtilComparator>)thenComparingWithJavaUtilFunctionFunction:(id<JavaUtilFunctionFunction>)arg0
                                             withJavaUtilComparator:(id<JavaUtilComparator>)arg1 {
  return JavaUtilComparator_thenComparingWithJavaUtilFunctionFunction_withJavaUtilComparator_(self, arg0, arg1);
}

- (id<JavaUtilComparator>)thenComparingWithJavaUtilFunctionFunction:(id<JavaUtilFunctionFunction>)arg0 {
  return JavaUtilComparator_thenComparingWithJavaUtilFunctionFunction_(self, arg0);
}

- (id<JavaUtilComparator>)thenComparingIntWithJavaUtilFunctionToIntFunction:(id<JavaUtilFunctionToIntFunction>)arg0 {
  return JavaUtilComparator_thenComparingIntWithJavaUtilFunctionToIntFunction_(self, arg0);
}

- (id<JavaUtilComparator>)thenComparingLongWithJavaUtilFunctionToLongFunction:(id<JavaUtilFunctionToLongFunction>)arg0 {
  return JavaUtilComparator_thenComparingLongWithJavaUtilFunctionToLongFunction_(self, arg0);
}

- (id<JavaUtilComparator>)thenComparingDoubleWithJavaUtilFunctionToDoubleFunction:(id<JavaUtilFunctionToDoubleFunction>)arg0 {
  return JavaUtilComparator_thenComparingDoubleWithJavaUtilFunctionToDoubleFunction_(self, arg0);
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x1, 0, 1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(compareWithId:withId:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "compare", "LASWidgetAttribute;LASWidgetAttribute;", "LASWidgetFactory;", "updateStyleAttrsWithNSString:withASWidgetAttribute:", "Ljava/lang/Object;Ljava/util/Comparator<Lcom/ashera/widget/WidgetAttribute;>;" };
  static const J2ObjcClassInfo _ASWidgetFactory_1 = { "", "com.ashera.widget", ptrTable, methods, NULL, 7, 0x8018, 2, 0, 2, -1, 3, 4, -1 };
  return &_ASWidgetFactory_1;
}

@end

void ASWidgetFactory_1_init(ASWidgetFactory_1 *self) {
  NSObject_init(self);
}

ASWidgetFactory_1 *new_ASWidgetFactory_1_init() {
  J2OBJC_NEW_IMPL(ASWidgetFactory_1, init)
}

ASWidgetFactory_1 *create_ASWidgetFactory_1_init() {
  J2OBJC_CREATE_IMPL(ASWidgetFactory_1, init)
}
