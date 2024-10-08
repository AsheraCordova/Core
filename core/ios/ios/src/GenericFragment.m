//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\IOSCorePlugin\src\main\java\com\ashera\core\GenericFragment.java
//

#include "Bundle.h"
#include "Context.h"
#include "Error.h"
#include "Errors.h"
#include "Event.h"
#include "EventBus.h"
#include "EventExpressionParser.h"
#include "FileUtils.h"
#include "Fragment.h"
#include "GenericFragment.h"
#include "HasWidgets.h"
#include "IActivity.h"
#include "IFragment.h"
#include "IFragmentContainer.h"
#include "IOSClass.h"
#include "IOSObjectArray.h"
#include "IRoot.h"
#include "IWidget.h"
#include "J2ObjC_source.h"
#include "LayoutInflater.h"
#include "ModelDataType.h"
#include "ModelExpressionParser.h"
#include "ModelScope.h"
#include "ModelStore.h"
#include "PluginInvoker.h"
#include "StyleSheet.h"
#include "View.h"
#include "ViewGroup.h"
#include "java/io/IOException.h"
#include "java/io/Serializable.h"
#include "java/io/StringReader.h"
#include "java/lang/Boolean.h"
#include "java/lang/Exception.h"
#include "java/lang/RuntimeException.h"
#include "java/util/ArrayList.h"
#include "java/util/Collection.h"
#include "java/util/HashMap.h"
#include "java/util/List.h"
#include "java/util/Map.h"
#include "java/util/Properties.h"
#include "java/util/Stack.h"
#include "java/util/UUID.h"
#include "java/util/WeakHashMap.h"

@class JavaUtilStack;
@class JavaUtilWeakHashMap;
@protocol JavaUtilList;
@protocol JavaUtilMap;


@interface ASGenericFragment () {
 @public
  id<ASIActivity> activity_;
  NSString *id__;
  NSString *fileName_;
  id view_;
  ASEventBus *eventBus_;
  id<JavaUtilMap> userData_;
  id<ASIWidget> rootWidget_;
  id<CSSStyleSheet> styleSheet_;
  id<JavaUtilMap> devData_;
  id<JavaUtilMap> inlineResources_;
  id<JavaUtilMap> tempCache_;
  jint x_;
  jint y_;
  jint width_;
  jint height_;
  NSString *DELLOC_EVENT_;
  JavaUtilWeakHashMap *listeners_;
  id<JavaUtilList> disposables_;
  jboolean measuring_;
  JavaUtilStack *disableRemeasures_;
  jboolean isPaused_;
  jboolean remeasureOnResume_;
}

- (void)readFileInDevMode;

- (NSString *)getEventDataWithNSString:(NSString *)key;

- (void)sendLifeCycleEventWithNSString:(NSString *)action
                          withNSString:(NSString *)eventExpression
                          withNSString:(NSString *)javascript;

- (ASErrors *)getFatalErrors;

@end

J2OBJC_FIELD_SETTER(ASGenericFragment, activity_, id<ASIActivity>)
J2OBJC_FIELD_SETTER(ASGenericFragment, id__, NSString *)
J2OBJC_FIELD_SETTER(ASGenericFragment, fileName_, NSString *)
J2OBJC_FIELD_SETTER(ASGenericFragment, view_, id)
J2OBJC_FIELD_SETTER(ASGenericFragment, eventBus_, ASEventBus *)
J2OBJC_FIELD_SETTER(ASGenericFragment, userData_, id<JavaUtilMap>)
J2OBJC_FIELD_SETTER(ASGenericFragment, rootWidget_, id<ASIWidget>)
J2OBJC_FIELD_SETTER(ASGenericFragment, styleSheet_, id<CSSStyleSheet>)
J2OBJC_FIELD_SETTER(ASGenericFragment, devData_, id<JavaUtilMap>)
J2OBJC_FIELD_SETTER(ASGenericFragment, inlineResources_, id<JavaUtilMap>)
J2OBJC_FIELD_SETTER(ASGenericFragment, tempCache_, id<JavaUtilMap>)
J2OBJC_FIELD_SETTER(ASGenericFragment, DELLOC_EVENT_, NSString *)
J2OBJC_FIELD_SETTER(ASGenericFragment, listeners_, JavaUtilWeakHashMap *)
J2OBJC_FIELD_SETTER(ASGenericFragment, disposables_, id<JavaUtilList>)
J2OBJC_FIELD_SETTER(ASGenericFragment, disableRemeasures_, JavaUtilStack *)

inline NSString *ASGenericFragment_get_POSTMEASURE_EVENT(void);
static NSString *ASGenericFragment_POSTMEASURE_EVENT;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASGenericFragment, POSTMEASURE_EVENT, NSString *)

inline NSString *ASGenericFragment_get_PREMEASURE_EVENT(void);
static NSString *ASGenericFragment_PREMEASURE_EVENT;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASGenericFragment, PREMEASURE_EVENT, NSString *)

__attribute__((unused)) static void ASGenericFragment_readFileInDevMode(ASGenericFragment *self);

__attribute__((unused)) static NSString *ASGenericFragment_getEventDataWithNSString_(ASGenericFragment *self, NSString *key);

__attribute__((unused)) static void ASGenericFragment_sendLifeCycleEventWithNSString_withNSString_withNSString_(ASGenericFragment *self, NSString *action, NSString *eventExpression, NSString *javascript);

__attribute__((unused)) static ASErrors *ASGenericFragment_getFatalErrors(ASGenericFragment *self);

J2OBJC_INITIALIZED_DEFN(ASGenericFragment)

@implementation ASGenericFragment

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASGenericFragment_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (void)addListenerWithASIWidget:(id<ASIWidget>)widget
                          withId:(id)listener {
  if (listeners_ == nil) {
    listeners_ = new_JavaUtilWeakHashMap_init();
  }
  id<JavaUtilList> objects = [self->listeners_ getWithId:widget];
  if (objects == nil) {
    objects = new_JavaUtilArrayList_init();
    (void) [((JavaUtilWeakHashMap *) nil_chk(self->listeners_)) putWithId:widget withId:objects];
  }
  [objects addWithId:listener];
}

- (id<JavaUtilList>)getListenerWithIOSClass:(IOSClass *)type {
  if (listeners_ == nil) {
    return nil;
  }
  id<JavaUtilCollection> values = [listeners_ values];
  id<JavaUtilList> matchedListeners = new_JavaUtilArrayList_init();
  for (id<JavaUtilList> __strong list in nil_chk(values)) {
    for (id __strong o in nil_chk(list)) {
      if ([nil_chk(o) java_getClass] == type) {
        [matchedListeners addWithId:o];
      }
    }
  }
  return matchedListeners;
}

- (id<JavaUtilList>)getListenerWithASIWidget:(id<ASIWidget>)widget
                                withIOSClass:(IOSClass *)type {
  if (listeners_ == nil) {
    return nil;
  }
  id<JavaUtilList> matchedListeners = new_JavaUtilArrayList_init();
  id<JavaUtilList> list = [((JavaUtilWeakHashMap *) nil_chk(listeners_)) getWithId:widget];
  if (list != nil) {
    for (id __strong o in list) {
      if ([nil_chk(o) java_getClass] == type) {
        [matchedListeners addWithId:o];
      }
    }
  }
  return matchedListeners;
}

- (void)removeListenerWithASIWidget:(id<ASIWidget>)widget
                             withId:(id)listener {
  [((id<JavaUtilList>) nil_chk([((JavaUtilWeakHashMap *) nil_chk(listeners_)) getWithId:widget])) removeWithId:listener];
}

- (id<JavaUtilList>)getDisposables {
  return disposables_;
}

- (void)addDisposableWithId:(id)disposable {
  if (disposables_ == nil) {
    disposables_ = new_JavaUtilArrayList_init();
  }
  [disposables_ addWithId:disposable];
}

- (void)clear {
  [((ASEventBus *) nil_chk(eventBus_)) notifyObserversWithNSString:DELLOC_EVENT_ withId:nil];
  [((ASEventBus *) nil_chk(eventBus_)) offAll];
  view_ = nil;
  rootWidget_ = nil;
  styleSheet_ = nil;
  devData_ = nil;
  tempCache_ = nil;
  eventBus_ = nil;
  userData_ = nil;
  ASPluginInvoker_releaseNativeResourcesWithJavaUtilList_(disposables_);
}

+ (ADBundle *)getInitialBundleWithNSString:(NSString *)resId
                              withNSString:(NSString *)fileName
                          withJavaUtilList:(id<JavaUtilList>)scopedObjects {
  return ASGenericFragment_getInitialBundleWithNSString_withNSString_withJavaUtilList_(resId, fileName, scopedObjects);
}

- (void)onAttachWithADContext:(ADContext *)context {
  [super onAttachWithADContext:context];
  if ([ASIActivity_class_() isInstance:context]) {
    [self onAttachWithASIActivity:(id<ASIActivity>) cast_check(context, ASIActivity_class_())];
  }
}

- (void)onAttachWithASIActivity:(id<ASIActivity>)activity {
  self->activity_ = activity;
  self->id__ = [((JavaUtilUUID *) nil_chk(JavaUtilUUID_randomUUID())) description];
  ADBundle *args = [self getArguments];
  self->fileName_ = [((ADBundle *) nil_chk(args)) getStringWithNSString:@"fileName"];
  jint scopedObjectCount = [args getIntWithNSString:@"count"];
  for (jint i = 0; i < scopedObjectCount; i++) {
    NSString *expression = [args getStringWithNSString:JreStrcat("$I", @"expression", i)];
    if (expression != nil && ![expression java_isEmpty]) {
      id payload = [args getSerializableWithNSString:JreStrcat("$I", @"payload", i)];
      ASModelExpressionParser_ModelStoreVarHolder *modelStoreVarHolder = ASModelExpressionParser_parseModelStoreVarExpressionWithNSString_(expression);
      NSString *varName = ((ASModelExpressionParser_ModelStoreVarHolder *) nil_chk(modelStoreVarHolder))->varName_;
      ASModelScope *varScope = modelStoreVarHolder->varScope_;
      ASModelDataType *varType = modelStoreVarHolder->varType_;
      id modelData = ASModelStore_changeModelDataTypeWithASModelDataType_withId_(varType, payload);
      ASModelStore_storeModelToScopeWithNSString_withASModelScope_withId_withASIFragment_withASIWidget_withASLoopParam_(varName, varScope, modelData, self, nil, nil);
    }
  }
  id<ASIFragment> parent = [self getParent];
  while (parent != nil) {
    [((ASEventBus *) nil_chk([parent getEventBus])) addEventBusWithASEventBus:eventBus_];
    parent = [parent getParent];
  }
  ASGenericFragment_sendLifeCycleEventWithNSString_withNSString_withNSString_(self, @"onAttach", ASGenericFragment_getEventDataWithNSString_(self, @"onAttach"), nil);
}

- (void)onCreateWithADBundle:(ADBundle *)savedInstanceState {
  [super onCreateWithADBundle:savedInstanceState];
  [self onCreate];
}

- (void)onCreate {
  ASGenericFragment_readFileInDevMode(self);
  ASGenericFragment_sendLifeCycleEventWithNSString_withNSString_withNSString_(self, @"onCreate", ASGenericFragment_getEventDataWithNSString_(self, @"onCreate"), nil);
}

- (void)readFileInDevMode {
  ASGenericFragment_readFileInDevMode(self);
}

- (JavaUtilProperties *)getFileAsPropertiesWithNSString:(NSString *)property
                                        withJavaUtilMap:(id<JavaUtilMap>)resultMap {
  JavaIoStringReader *stringReader = new_JavaIoStringReader_initWithNSString_([((id<JavaUtilMap>) nil_chk(resultMap)) getWithId:property]);
  JavaUtilProperties *properties = new_JavaUtilProperties_init();
  @try {
    @try {
      [properties load__WithJavaIoReader:stringReader];
    }
    @catch (JavaIoIOException *e) {
      [e printStackTrace];
    }
  }
  @finally {
    [stringReader close];
  }
  return properties;
}

- (void)onResume {
  [super onResume];
  if (remeasureOnResume_) {
    [self remeasure];
    remeasureOnResume_ = false;
  }
  isPaused_ = false;
  ASGenericFragment_sendLifeCycleEventWithNSString_withNSString_withNSString_(self, @"onResume", ASGenericFragment_getEventDataWithNSString_(self, @"onResume"), nil);
}

- (NSString *)getEventDataWithNSString:(NSString *)key {
  return ASGenericFragment_getEventDataWithNSString_(self, key);
}

- (ADView *)onCreateViewWithADLayoutInflater:(ADLayoutInflater *)inflater
                             withADViewGroup:(ADViewGroup *)parent
                                withADBundle:(ADBundle *)savedInstanceState {
  return (ADView *) cast_chk([self onCreateViewWithBoolean:false], [ADView class]);
}

- (id)onCreateViewWithBoolean:(jboolean)measure {
  if (view_ == nil) {
    @try {
      id<ASIFragment> rootFragment = [self getParent];
      NSString *myFileName = fileName_;
      if (rootFragment != nil) {
        NSString *html = [rootFragment getInlineResourceWithNSString:fileName_];
        if (html != nil) {
          myFileName = html;
        }
      }
      id<ASIWidget> widget = ASPluginInvoker_parseFragmentWithNSString_withBoolean_withASIFragment_(myFileName, false, self);
      [self createChildFragments];
      if (measure) {
        [self remeasure];
      }
      view_ = [((id<ASIWidget>) nil_chk(widget)) asNativeWidget];
      NSString *javascript = [self getInlineResourceWithNSString:@"javascript"];
      ASGenericFragment_sendLifeCycleEventWithNSString_withNSString_withNSString_(self, @"onCreateView", nil, javascript);
    }
    @catch (JavaLangException *e) {
      [e printStackTrace];
      @throw new_JavaLangRuntimeException_initWithJavaLangThrowable_(e);
    }
    return view_;
  }
  else {
    return view_;
  }
}

- (void)onPause {
  [super onPause];
  isPaused_ = true;
  ASGenericFragment_sendLifeCycleEventWithNSString_withNSString_withNSString_(self, @"onPause", ASGenericFragment_getEventDataWithNSString_(self, @"onPause"), nil);
}

- (void)onViewCreatedWithADView:(ADView *)view
                   withADBundle:(ADBundle *)savedInstanceState {
  [super onViewCreatedWithADView:view withADBundle:savedInstanceState];
}

- (void)onDetach {
  [super onDetach];
  ASGenericFragment_sendLifeCycleEventWithNSString_withNSString_withNSString_(self, @"onDetach", ASGenericFragment_getEventDataWithNSString_(self, @"onDetach"), nil);
  activity_ = nil;
}

- (void)onDestroy {
  [super onDestroy];
  id<ASIFragment> parent = [self getParent];
  while (parent != nil) {
    [((ASEventBus *) nil_chk([parent getEventBus])) removeEventBusWithASEventBus:eventBus_];
    parent = [parent getParent];
  }
  ASGenericFragment_sendLifeCycleEventWithNSString_withNSString_withNSString_(self, @"onDestroy", ASGenericFragment_getEventDataWithNSString_(self, @"onDestroy"), nil);
  [self clear];
}

- (void)onCloseDialog {
  ASGenericFragment_sendLifeCycleEventWithNSString_withNSString_withNSString_(self, @"onCloseDialog", ASGenericFragment_getEventDataWithNSString_(self, @"onCloseDialog"), nil);
}

- (void)onActivityCreatedWithADBundle:(ADBundle *)savedInstanceState {
  [super onActivityCreatedWithADBundle:savedInstanceState];
}

- (void)sendLifeCycleEventWithNSString:(NSString *)action
                          withNSString:(NSString *)eventExpression
                          withNSString:(NSString *)javascript {
  ASGenericFragment_sendLifeCycleEventWithNSString_withNSString_withNSString_(self, action, eventExpression, javascript);
}

- (ASEventBus *)getEventBus {
  return eventBus_;
}

- (id<ASIWidget>)getRootWidget {
  return rootWidget_;
}

- (id<ASIActivity>)getRootActivity {
  return activity_;
}

- (id)getArgumentsBundle {
  return [self getArguments];
}

- (void)setRootWidgetWithASIWidget:(id<ASIWidget>)widget {
  rootWidget_ = widget;
}

- (id)getUserDataWithNSString:(NSString *)key {
  if (userData_ == nil) {
    userData_ = new_JavaUtilHashMap_init();
  }
  return [userData_ getWithId:key];
}

- (void)storeUserDataWithNSString:(NSString *)key
                           withId:(id)object {
  if (userData_ == nil) {
    userData_ = new_JavaUtilHashMap_init();
  }
  (void) [userData_ putWithId:key withId:object];
}

- (jboolean)hasDevDataWithNSString:(NSString *)key {
  return devData_ != nil && [devData_ containsKeyWithId:key];
}

- (id)getDevDataWithNSString:(NSString *)key {
  if (devData_ == nil) {
    return nil;
  }
  return [devData_ getWithId:key];
}

- (id<CSSStyleSheet>)getStyleSheet {
  return self->styleSheet_;
}

- (void)setStyleSheetWithCSSStyleSheet:(id<CSSStyleSheet>)styleSheet {
  self->styleSheet_ = styleSheet;
}

- (jboolean)isViewLoaded {
  return view_ != nil;
}

- (void)storeInTempCacheWithNSString:(NSString *)key
                              withId:(id)object {
  if (tempCache_ == nil) {
    tempCache_ = new_JavaUtilHashMap_init();
  }
  (void) [tempCache_ putWithId:key withId:object];
}

- (id)getFromTempCacheWithNSString:(NSString *)key {
  if (tempCache_ == nil) {
    return nil;
  }
  return [tempCache_ getWithId:key];
}

- (void)setFrameWithInt:(jint)x
                withInt:(jint)y
                withInt:(jint)width
                withInt:(jint)height {
  self->x_ = x;
  self->y_ = y;
  self->width_ = width;
  self->height_ = height;
}

- (void)remeasure {
  id<ASHasWidgets> parent = [((id<ASIWidget>) nil_chk(rootWidget_)) getParent];
  if ([ASIFragmentContainer_class_() isInstance:parent]) {
    [((id<ASIFragment>) nil_chk([((id<ASHasWidgets>) nil_chk(parent)) getRootFragment])) remeasure];
    return;
  }
  if ([self isMeasuring]) {
    return;
  }
  measuring_ = true;
  [((ASEventBus *) nil_chk(eventBus_)) notifyObserversWithNSString:ASGenericFragment_PREMEASURE_EVENT withId:new_ASEvent_initWithASEvent_StandardEvents_(JreLoadEnum(ASEvent_StandardEvents, preMeasure))];
  if (x_ == -1 && y_ == -1 && width_ == -1 && height_ == -1) {
    [((id<ASIRoot>) nil_chk(((id<ASIRoot>) cast_check(rootWidget_, ASIRoot_class_())))) measure];
  }
  else {
    [((id<ASIRoot>) nil_chk(((id<ASIRoot>) cast_check(rootWidget_, ASIRoot_class_())))) measureWithInt:x_ withInt:y_ withInt:width_ withInt:height_];
  }
  [((ASEventBus *) nil_chk(eventBus_)) notifyObserversWithNSString:ASGenericFragment_POSTMEASURE_EVENT withId:new_ASEvent_initWithASEvent_StandardEvents_(JreLoadEnum(ASEvent_StandardEvents, postMeasure))];
  measuring_ = false;
}

- (void)resizeWindowWithInt:(jint)width
                    withInt:(jint)height {
  [self setFrameWithInt:x_ withInt:y_ withInt:width withInt:height];
  if (!isPaused_) {
    [self remeasure];
  }
  else {
    remeasureOnResume_ = true;
  }
}

- (jboolean)isMeasuring {
  return measuring_ || [((JavaUtilStack *) nil_chk(disableRemeasures_)) size] > 0;
}

- (id)getParentForRootWidget {
  return [((id<ASIActivity>) nil_chk(activity_)) getRootWidget];
}

- (NSString *)getFragmentId {
  return id__;
}

- (NSString *)getActionUrl {
  if (fileName_ != nil && ![fileName_ java_hasPrefix:@"layout"]) {
    return (NSString *) cast_chk([((ADBundle *) nil_chk([self getArguments])) getWithNSString:@"id"], [NSString class]);
  }
  return fileName_;
}

- (void)disableRemeasure {
  (void) [((JavaUtilStack *) nil_chk(disableRemeasures_)) pushWithId:JavaLangBoolean_valueOfWithBoolean_(true)];
}

- (void)enableRemeasure {
  (void) [((JavaUtilStack *) nil_chk(disableRemeasures_)) pop];
}

- (void)addErrorWithASError:(ASError *)error {
  [((ASErrors *) nil_chk(ASGenericFragment_getFatalErrors(self))) addErrorWithASError:error];
  [((id<ASIRoot>) nil_chk(((id<ASIRoot>) cast_check(rootWidget_, ASIRoot_class_())))) displayErrorIndicator];
}

- (jboolean)hasErrors {
  return [((id<JavaUtilList>) nil_chk([((ASErrors *) nil_chk(ASGenericFragment_getFatalErrors(self))) getErrors])) size] > 0;
}

- (ASErrors *)getFatalErrors {
  return ASGenericFragment_getFatalErrors(self);
}

- (NSString *)getInlineResourceWithNSString:(NSString *)key {
  if (inlineResources_ == nil) {
    return nil;
  }
  return [inlineResources_ getWithId:key];
}

- (void)setInlineResourceWithNSString:(NSString *)key
                         withNSString:(NSString *)value
                          withBoolean:(jboolean)append {
  if (inlineResources_ == nil) {
    inlineResources_ = new_JavaUtilHashMap_init();
  }
  if (!append || [inlineResources_ getWithId:key] == nil) {
    (void) [((id<JavaUtilMap>) nil_chk(inlineResources_)) putWithId:key withId:value];
  }
  else {
    (void) [((id<JavaUtilMap>) nil_chk(inlineResources_)) putWithId:key withId:JreStrcat("$$", [inlineResources_ getWithId:key], value)];
  }
}

- (NSString *)getUId {
  return id__;
}

- (id<ASIFragment>)getParent {
  ADXFragment *parentFragment = [self getParentFragment];
  while (parentFragment != nil) {
    if ([ASIFragment_class_() isInstance:parentFragment]) {
      return (id<ASIFragment>) cast_check(parentFragment, ASIFragment_class_());
    }
    parentFragment = [parentFragment getParentFragment];
  }
  return nil;
}

- (void)createChildFragments {
}

- (id<ASIFragment>)getRootFragment {
  id<ASIFragment> rootFragment = self;
  ADXFragment *parentFragment = [self getParentFragment];
  while (parentFragment != nil) {
    if ([ASIFragment_class_() isInstance:parentFragment]) {
      rootFragment = (id<ASIFragment>) cast_check(parentFragment, ASIFragment_class_());
    }
    parentFragment = [parentFragment getParentFragment];
  }
  return rootFragment;
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 0, 1, -1, -1, -1, -1 },
    { NULL, "LJavaUtilList;", 0x1, 2, 3, -1, 4, -1, -1 },
    { NULL, "LJavaUtilList;", 0x1, 2, 5, -1, 6, -1, -1 },
    { NULL, "V", 0x1, 7, 1, -1, -1, -1, -1 },
    { NULL, "LJavaUtilList;", 0x1, -1, -1, -1, 8, -1, -1 },
    { NULL, "V", 0x1, 9, 10, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LADBundle;", 0x9, 11, 12, -1, 13, -1, -1 },
    { NULL, "V", 0x1, 14, 15, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 14, 16, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 17, 18, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x2, -1, -1, -1, -1, -1, -1 },
    { NULL, "LJavaUtilProperties;", 0x1, 19, 20, -1, 21, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x2, 22, 23, -1, -1, -1, -1 },
    { NULL, "LADView;", 0x1, 24, 25, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, 24, 26, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 27, 28, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 29, 18, -1, -1, -1, -1 },
    { NULL, "V", 0x2, 30, 31, -1, -1, -1, -1 },
    { NULL, "LASEventBus;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LASIWidget;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LASIActivity;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 32, 33, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, 34, 23, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 35, 36, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, 37, 23, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, 38, 23, -1, -1, -1, -1 },
    { NULL, "LCSSStyleSheet;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 39, 40, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 41, 36, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, 42, 23, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 43, 44, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 45, 46, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 47, 48, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LASErrors;", 0x2, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, 49, 23, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 50, 51, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LASIFragment;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LASIFragment;", 0x1, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(addListenerWithASIWidget:withId:);
  methods[2].selector = @selector(getListenerWithIOSClass:);
  methods[3].selector = @selector(getListenerWithASIWidget:withIOSClass:);
  methods[4].selector = @selector(removeListenerWithASIWidget:withId:);
  methods[5].selector = @selector(getDisposables);
  methods[6].selector = @selector(addDisposableWithId:);
  methods[7].selector = @selector(clear);
  methods[8].selector = @selector(getInitialBundleWithNSString:withNSString:withJavaUtilList:);
  methods[9].selector = @selector(onAttachWithADContext:);
  methods[10].selector = @selector(onAttachWithASIActivity:);
  methods[11].selector = @selector(onCreateWithADBundle:);
  methods[12].selector = @selector(onCreate);
  methods[13].selector = @selector(readFileInDevMode);
  methods[14].selector = @selector(getFileAsPropertiesWithNSString:withJavaUtilMap:);
  methods[15].selector = @selector(onResume);
  methods[16].selector = @selector(getEventDataWithNSString:);
  methods[17].selector = @selector(onCreateViewWithADLayoutInflater:withADViewGroup:withADBundle:);
  methods[18].selector = @selector(onCreateViewWithBoolean:);
  methods[19].selector = @selector(onPause);
  methods[20].selector = @selector(onViewCreatedWithADView:withADBundle:);
  methods[21].selector = @selector(onDetach);
  methods[22].selector = @selector(onDestroy);
  methods[23].selector = @selector(onCloseDialog);
  methods[24].selector = @selector(onActivityCreatedWithADBundle:);
  methods[25].selector = @selector(sendLifeCycleEventWithNSString:withNSString:withNSString:);
  methods[26].selector = @selector(getEventBus);
  methods[27].selector = @selector(getRootWidget);
  methods[28].selector = @selector(getRootActivity);
  methods[29].selector = @selector(getArgumentsBundle);
  methods[30].selector = @selector(setRootWidgetWithASIWidget:);
  methods[31].selector = @selector(getUserDataWithNSString:);
  methods[32].selector = @selector(storeUserDataWithNSString:withId:);
  methods[33].selector = @selector(hasDevDataWithNSString:);
  methods[34].selector = @selector(getDevDataWithNSString:);
  methods[35].selector = @selector(getStyleSheet);
  methods[36].selector = @selector(setStyleSheetWithCSSStyleSheet:);
  methods[37].selector = @selector(isViewLoaded);
  methods[38].selector = @selector(storeInTempCacheWithNSString:withId:);
  methods[39].selector = @selector(getFromTempCacheWithNSString:);
  methods[40].selector = @selector(setFrameWithInt:withInt:withInt:withInt:);
  methods[41].selector = @selector(remeasure);
  methods[42].selector = @selector(resizeWindowWithInt:withInt:);
  methods[43].selector = @selector(isMeasuring);
  methods[44].selector = @selector(getParentForRootWidget);
  methods[45].selector = @selector(getFragmentId);
  methods[46].selector = @selector(getActionUrl);
  methods[47].selector = @selector(disableRemeasure);
  methods[48].selector = @selector(enableRemeasure);
  methods[49].selector = @selector(addErrorWithASError:);
  methods[50].selector = @selector(hasErrors);
  methods[51].selector = @selector(getFatalErrors);
  methods[52].selector = @selector(getInlineResourceWithNSString:);
  methods[53].selector = @selector(setInlineResourceWithNSString:withNSString:withBoolean:);
  methods[54].selector = @selector(getUId);
  methods[55].selector = @selector(getParent);
  methods[56].selector = @selector(createChildFragments);
  methods[57].selector = @selector(getRootFragment);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "activity_", "LASIActivity;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "id__", "LNSString;", .constantValue.asLong = 0, 0x2, 52, -1, -1, -1 },
    { "fileName_", "LNSString;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "view_", "LNSObject;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "eventBus_", "LASEventBus;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "userData_", "LJavaUtilMap;", .constantValue.asLong = 0, 0x2, -1, -1, 53, -1 },
    { "rootWidget_", "LASIWidget;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "styleSheet_", "LCSSStyleSheet;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "devData_", "LJavaUtilMap;", .constantValue.asLong = 0, 0x2, -1, -1, 53, -1 },
    { "inlineResources_", "LJavaUtilMap;", .constantValue.asLong = 0, 0x2, -1, -1, 54, -1 },
    { "tempCache_", "LJavaUtilMap;", .constantValue.asLong = 0, 0x2, -1, -1, 53, -1 },
    { "x_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "y_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "width_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "height_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "DELLOC_EVENT_", "LNSString;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "POSTMEASURE_EVENT", "LNSString;", .constantValue.asLong = 0, 0x1a, -1, 55, -1, -1 },
    { "PREMEASURE_EVENT", "LNSString;", .constantValue.asLong = 0, 0x1a, -1, 56, -1, -1 },
    { "listeners_", "LJavaUtilWeakHashMap;", .constantValue.asLong = 0, 0x2, -1, -1, 57, -1 },
    { "disposables_", "LJavaUtilList;", .constantValue.asLong = 0, 0x2, -1, -1, 58, -1 },
    { "measuring_", "Z", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "disableRemeasures_", "LJavaUtilStack;", .constantValue.asLong = 0, 0x2, -1, -1, 59, -1 },
    { "isPaused_", "Z", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "remeasureOnResume_", "Z", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "addListener", "LASIWidget;LNSObject;", "getListener", "LIOSClass;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljava/util/List<TT;>;", "LASIWidget;LIOSClass;", "<T:Ljava/lang/Object;>(Lcom/ashera/widget/IWidget;Ljava/lang/Class<TT;>;)Ljava/util/List<TT;>;", "removeListener", "()Ljava/util/List<Ljava/lang/Object;>;", "addDisposable", "LNSObject;", "getInitialBundle", "LNSString;LNSString;LJavaUtilList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;)Lr/android/os/Bundle;", "onAttach", "LADContext;", "LASIActivity;", "onCreate", "LADBundle;", "getFileAsProperties", "LNSString;LJavaUtilMap;", "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/util/Properties;", "getEventData", "LNSString;", "onCreateView", "LADLayoutInflater;LADViewGroup;LADBundle;", "Z", "onViewCreated", "LADView;LADBundle;", "onActivityCreated", "sendLifeCycleEvent", "LNSString;LNSString;LNSString;", "setRootWidget", "LASIWidget;", "getUserData", "storeUserData", "LNSString;LNSObject;", "hasDevData", "getDevData", "setStyleSheet", "LCSSStyleSheet;", "storeInTempCache", "getFromTempCache", "setFrame", "IIII", "resizeWindow", "II", "addError", "LASError;", "getInlineResource", "setInlineResource", "LNSString;LNSString;Z", "id", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", &ASGenericFragment_POSTMEASURE_EVENT, &ASGenericFragment_PREMEASURE_EVENT, "Ljava/util/WeakHashMap<Lcom/ashera/widget/IWidget;Ljava/util/List<Ljava/lang/Object;>;>;", "Ljava/util/List<Ljava/lang/Object;>;", "Ljava/util/Stack<Ljava/lang/Boolean;>;" };
  static const J2ObjcClassInfo _ASGenericFragment = { "GenericFragment", "com.ashera.core", ptrTable, methods, fields, 7, 0x1, 58, 24, -1, -1, -1, -1, -1 };
  return &_ASGenericFragment;
}

+ (void)initialize {
  if (self == [ASGenericFragment class]) {
    ASGenericFragment_POSTMEASURE_EVENT = [((ASEvent_StandardEvents *) nil_chk(JreLoadEnum(ASEvent_StandardEvents, postMeasure))) description];
    ASGenericFragment_PREMEASURE_EVENT = [((ASEvent_StandardEvents *) nil_chk(JreLoadEnum(ASEvent_StandardEvents, preMeasure))) description];
    J2OBJC_SET_INITIALIZED(ASGenericFragment)
  }
}

@end

void ASGenericFragment_init(ASGenericFragment *self) {
  ADXFragment_init(self);
  self->eventBus_ = new_ASEventBus_init();
  self->x_ = -1;
  self->y_ = -1;
  self->width_ = -1;
  self->height_ = -1;
  self->DELLOC_EVENT_ = [((ASEvent_StandardEvents *) nil_chk(JreLoadEnum(ASEvent_StandardEvents, dealloc))) description];
  self->disableRemeasures_ = new_JavaUtilStack_init();
}

ASGenericFragment *new_ASGenericFragment_init() {
  J2OBJC_NEW_IMPL(ASGenericFragment, init)
}

ASGenericFragment *create_ASGenericFragment_init() {
  J2OBJC_CREATE_IMPL(ASGenericFragment, init)
}

ADBundle *ASGenericFragment_getInitialBundleWithNSString_withNSString_withJavaUtilList_(NSString *resId, NSString *fileName, id<JavaUtilList> scopedObjects) {
  ASGenericFragment_initialize();
  ADBundle *bundle = new_ADBundle_init();
  [bundle putStringWithNSString:@"fileName" withNSString:fileName];
  [bundle putStringWithNSString:@"id" withNSString:resId];
  if (scopedObjects != nil && ![scopedObjects isEmpty]) {
    jint scopedObjectCount = [scopedObjects size];
    [bundle putIntWithNSString:@"count" withInt:scopedObjectCount];
    for (jint i = 0; i < scopedObjectCount; i++) {
      id<JavaUtilMap> map = ASPluginInvoker_getMapWithId_([scopedObjects getWithInt:i]);
      [bundle putStringWithNSString:JreStrcat("$I", @"expression", i) withNSString:ASPluginInvoker_getStringWithId_([((id<JavaUtilMap>) nil_chk(map)) getWithId:@"expression"])];
      id payload = [map getWithId:@"payload"];
      if ([JavaIoSerializable_class_() isInstance:payload]) {
        [bundle putSerializableWithNSString:JreStrcat("$I", @"payload", i) withId:(id<JavaIoSerializable>) cast_check(payload, JavaIoSerializable_class_())];
      }
      else {
        ASPluginInvoker_putObjectToBundleWithId_withNSString_withId_(bundle, JreStrcat("$I", @"payload", i), payload);
      }
    }
  }
  return bundle;
}

void ASGenericFragment_readFileInDevMode(ASGenericFragment *self) {
  if ([@"dev" isEqual:[((id<ASIActivity>) nil_chk(self->activity_)) getAssetMode]]) {
    self->devData_ = new_JavaUtilHashMap_init();
    JavaUtilHashMap *urlMap = new_JavaUtilHashMap_init();
    NSString *devServerIp = [((id<ASIActivity>) nil_chk(self->activity_)) getDevServerIp];
    (void) [urlMap putWithId:JreStrcat("$$", @"www/", self->fileName_) withId:NSString_java_formatWithNSString_withNSObjectArray_(@"http://%s/%s", [IOSObjectArray newArrayWithObjects:(id[]){ devServerIp, JreStrcat("$$", @"app/src/main/res/", self->fileName_) } count:2 type:NSObject_class_()])];
    (void) [urlMap putWithId:@"www/css/styles.css" withId:NSString_java_formatWithNSString_withNSObjectArray_(@"http://%s/%s", [IOSObjectArray newArrayWithObjects:(id[]){ devServerIp, @"app/src/main/assets/www/css/styles.css" } count:2 type:NSObject_class_()])];
    (void) [urlMap putWithId:@"strings" withId:NSString_java_formatWithNSString_withNSObjectArray_(@"http://%s/%s", [IOSObjectArray newArrayWithObjects:(id[]){ devServerIp, @"src/strings.properties" } count:2 type:NSObject_class_()])];
    (void) [urlMap putWithId:@"colors" withId:NSString_java_formatWithNSString_withNSObjectArray_(@"http://%s/%s", [IOSObjectArray newArrayWithObjects:(id[]){ devServerIp, @"src/colors.properties" } count:2 type:NSObject_class_()])];
    (void) [urlMap putWithId:@"dimens" withId:NSString_java_formatWithNSString_withNSObjectArray_(@"http://%s/%s", [IOSObjectArray newArrayWithObjects:(id[]){ devServerIp, @"src/dimens.properties" } count:2 type:NSObject_class_()])];
    id<JavaUtilMap> resultMap = ASFileUtils_readFilesContentWithJavaUtilMap_(urlMap);
    [((id<JavaUtilMap>) nil_chk(self->devData_)) putAllWithJavaUtilMap:resultMap];
    JavaUtilProperties *strings = [self getFileAsPropertiesWithNSString:@"strings" withJavaUtilMap:resultMap];
    JavaUtilProperties *colors = [self getFileAsPropertiesWithNSString:@"colors" withJavaUtilMap:resultMap];
    JavaUtilProperties *dimens = [self getFileAsPropertiesWithNSString:@"dimens" withJavaUtilMap:resultMap];
    (void) [((id<JavaUtilMap>) nil_chk(self->devData_)) putWithId:@"strings" withId:strings];
    (void) [((id<JavaUtilMap>) nil_chk(self->devData_)) putWithId:@"colors" withId:colors];
    (void) [((id<JavaUtilMap>) nil_chk(self->devData_)) putWithId:@"dimens" withId:dimens];
  }
}

NSString *ASGenericFragment_getEventDataWithNSString_(ASGenericFragment *self, NSString *key) {
  id myData = [self getUserDataWithNSString:key];
  if (myData == nil) {
    return nil;
  }
  NSString *onResumeEventExpr = ASPluginInvoker_getStringWithId_(myData);
  return onResumeEventExpr;
}

void ASGenericFragment_sendLifeCycleEventWithNSString_withNSString_withNSString_(ASGenericFragment *self, NSString *action, NSString *eventExpression, NSString *javascript) {
  if (self->activity_ != nil) {
    id<JavaUtilMap> dataMap = ASPluginInvoker_getJSONCompatMap();
    (void) [((id<JavaUtilMap>) nil_chk(dataMap)) putWithId:@"action" withId:@"nativeevent"];
    (void) [dataMap putWithId:@"event" withId:action];
    (void) [dataMap putWithId:@"actionUrl" withId:[self getActionUrl]];
    (void) [dataMap putWithId:@"fragmentId" withId:self->id__];
    JavaUtilArrayList *parentFragments = new_JavaUtilArrayList_init();
    id<ASIFragment> parentFragment = [self getParent];
    while (parentFragment != nil) {
      [parentFragments addWithId:[parentFragment getUId]];
      parentFragment = [parentFragment getParent];
    }
    if ([parentFragments size] > 0) {
      (void) [dataMap putWithId:@"parentFragments" withId:NSString_java_joinWithJavaLangCharSequence_withJavaLangIterable_(@",", parentFragments)];
    }
    if (javascript != nil) {
      (void) [dataMap putWithId:@"javascript" withId:javascript];
    }
    if (eventExpression != nil) {
      (void) ASEventExpressionParser_parseEventExpressionWithNSString_withJavaUtilMap_(eventExpression, dataMap);
      [((id<ASIWidget>) nil_chk(self->rootWidget_)) updateModelToEventMapWithJavaUtilMap:dataMap withNSString:(NSString *) cast_chk([dataMap getWithId:ASEventExpressionParser_KEY_EVENT], [NSString class]) withNSString:(NSString *) cast_chk([dataMap getWithId:ASEventExpressionParser_KEY_EVENT_ARGS], [NSString class])];
    }
    [((id<ASIActivity>) nil_chk(self->activity_)) sendEventMessageWithJavaUtilMap:dataMap];
  }
}

ASErrors *ASGenericFragment_getFatalErrors(ASGenericFragment *self) {
  NSString *errorKey = @"fatalErrors";
  ASErrors *errors = (ASErrors *) cast_chk([self getUserDataWithNSString:errorKey], [ASErrors class]);
  if (errors == nil) {
    errors = new_ASErrors_init();
    [self storeUserDataWithNSString:errorKey withId:errors];
  }
  return errors;
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASGenericFragment)
