//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\widget\BaseWidget.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_BaseWidget")
#ifdef RESTRICT_BaseWidget
#define INCLUDE_ALL_BaseWidget 0
#else
#define INCLUDE_ALL_BaseWidget 1
#endif
#undef RESTRICT_BaseWidget
#ifdef INCLUDE_ASBaseWidget_LazyBaseWidget
#define INCLUDE_ASBaseWidget 1
#endif

#if !defined (ASBaseWidget_) && (INCLUDE_ALL_BaseWidget || defined(INCLUDE_ASBaseWidget))
#define ASBaseWidget_

#define RESTRICT_IWidget 1
#define INCLUDE_ASIWidget 1
#include "IWidget.h"

@class ASAttributeCommandChain;
@class ASLoopParam;
@class ASModelDataType;
@class ASModelScope;
@class ASWidgetAttribute;
@class ASWidgetAttributeMap;
@class ASWidgetAttributeValue;
@class IOSObjectArray;
@protocol ASAttributeCommand;
@protocol ASHasWidgets;
@protocol ASIConverter;
@protocol ASIFragment;
@protocol ASILifeCycleDecorator;
@protocol ASIWidgetLifeCycleListener;
@protocol ASIWidget_CommandCallBack;
@protocol JavaLangRunnable;
@protocol JavaUtilCollection;
@protocol JavaUtilList;
@protocol JavaUtilMap;
@protocol JavaUtilSet;

@interface ASBaseWidget : NSObject < ASIWidget > {
 @public
  __unsafe_unretained id<ASHasWidgets> parent_;
  ASWidgetAttributeMap *attributes_;
  id<JavaUtilMap> params_;
  id<JavaUtilMap> userData_;
  id<JavaUtilMap> tmpCache_;
  NSString *localName_;
  NSString *groupName_;
  __unsafe_unretained id<ASIFragment> fragment_;
  id<JavaUtilMap> methodListeners_;
}

#pragma mark Public

- (instancetype)initWithNSString:(NSString *)groupName
                    withNSString:(NSString *)localName;

- (void)addDecoratorWithASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (void)addForegroundIfNeeded;

- (void)afterParentInit;

- (void)applyAttributeCommandWithNSString:(NSString *)sourceName
                             withNSString:(NSString *)commandName
                        withNSStringArray:(IOSObjectArray *)attributes
                              withBoolean:(jboolean)add
                        withNSObjectArray:(IOSObjectArray *)args;

- (void)applyModelToWidget;

- (void)applyStyleToWidgetWithASWidgetAttribute:(ASWidgetAttribute *)widgetAttribute
                                         withId:(id)objValue;

- (void)applyThemeConstructorArgsStyleWithNSString:(NSString *)themeName
                                   withJavaUtilMap:(id<JavaUtilMap>)params;

- (void)applyThemeStyleWithNSString:(NSString *)themeName;

- (id)changeModelDataTypeWithASModelDataType:(ASModelDataType *)dataType
                                      withId:(id)obj;

- (void)createWithASIFragment:(id<ASIFragment>)fragment
              withJavaUtilMap:(id<JavaUtilMap>)params;

- (id)createWrapperViewWithId:(id)wrapperParent
                      withInt:(jint)viewtype;

- (id)createWrapperViewHolderWithInt:(jint)viewType;

- (void)drawableStateChanged;

- (void)executeCommandWithASIWidget:(id<ASIWidget>)w
                   withJavaUtilList:(id<JavaUtilList>)commandDataArr
      withASIWidget_CommandCallBack:(id<ASIWidget_CommandCallBack>)command
                            withInt:(jint)methods;

- (void)executeCommandWithJavaUtilMap:(id<JavaUtilMap>)payLoad
        withASIWidget_CommandCallBack:(id<ASIWidget_CommandCallBack>)command
                              withInt:(jint)methods;

- (void)executeMethodListenersWithNSString:(NSString *)methodName
                         withNSObjectArray:(IOSObjectArray *)args;

- (void)executeMethodListenersWithNSString:(NSString *)methodName
                      withJavaLangRunnable:(id<JavaLangRunnable>)callback
                         withNSObjectArray:(IOSObjectArray *)args;

- (id<ASIWidget>)findNearestViewWithNSString:(NSString *)id_;

- (id<ASIWidget>)findWidgetByIdWithNSString:(NSString *)id_;

- (id)getAnimator;

- (ASWidgetAttribute *)getAttributeWithASHasWidgets:(id<ASHasWidgets>)parent
                                       withNSString:(NSString *)localName
                                       withNSString:(NSString *)key;

- (id)getAttributeWithNSString:(NSString *)attributeName
                   withBoolean:(jboolean)skipConvert;

- (id<ASAttributeCommand>)getAttributeCommandWithNSString:(NSString *)sourceName
                                             withNSString:(NSString *)commandName
                                        withNSObjectArray:(IOSObjectArray *)args;

- (ASAttributeCommandChain *)getAttributeCommandChainWithNSString:(NSString *)sourceName;

- (id)getAttributeCommandValueWithNSString:(NSString *)sourceName
                              withNSString:(NSString *)commandName
                              withNSString:(NSString *)attributeName;

- (ASWidgetAttributeMap *)getAttributes;

- (NSString *)getAttributeValueWithNSString:(NSString *)attr;

- (NSString *)getAttributeValueWithNSString:(NSString *)attr
                   withASWidgetAttributeMap:(ASWidgetAttributeMap *)attributes;

- (ASWidgetAttributeValue *)getAttributeValueWithASWidgetAttribute:(ASWidgetAttribute *)attr
                                          withASWidgetAttributeMap:(ASWidgetAttributeMap *)attributes;

- (jint)getBaseLine;

- (NSString *)getBehaviorGroupId;

- (NSString *)getComponentId;

- (NSString *)getCustomMessageWithNSString:(NSString *)key;

- (NSString *)getErrorStyle;

- (id<JavaUtilSet>)getEventBubblers;

- (id<JavaUtilList>)getEventBusHandlers;

- (id)getFieldValueUsingReflectionWithId:(id)targetObject
                            withNSString:(NSString *)fieldName;

- (id)getForeground;

- (NSString *)getFormGroupId;

- (id<ASIFragment>)getFragment;

- (id)getFromTempCacheWithNSString:(NSString *)key;

- (NSString *)getGroupName;

- (NSString *)getId;

- (jint)getIdAsInt;

- (id<ASIWidgetLifeCycleListener>)getListener;

- (NSString *)getLocalName;

- (ASLoopParam *)getLoopParam;

- (id)getModelByPathWithNSString:(NSString *)varPath
                          withId:(id)obj;

- (id)getModelFromScopeWithNSString:(NSString *)varName
                   withASModelScope:(ASModelScope *)varScope;

- (id)getModelFromScopeWithNSString:(NSString *)varName
                   withASModelScope:(ASModelScope *)varScope
                    withASLoopParam:(ASLoopParam *)loopParam;

- (NSString *)getModelIdPath;

- (NSString *)getModelParam;

- (NSString *)getModelPojoToUi;

- (NSString *)getModelPojoToUiParams;

- (NSString *)getModelSyncEvents;

- (NSString *)getModelUiToPojo;

- (NSString *)getModelUiToPojoEventIds;

- (NSString *)getNormalStyle;

- (id<JavaUtilMap>)getParams;

- (id<ASHasWidgets>)getParent;

- (id)getUserDataWithNSString:(NSString *)key;

- (jint)getValidationErrorDisplayType;

- (jint)getZIndex;

- (jboolean)hasBufferedAttributes;

- (jboolean)hasFeatureWithNSString:(NSString *)key
                      withNSString:(NSString *)featureName;

- (jboolean)hasMethodListenerWithNSString:(NSString *)methodName;

- (void)initialized OBJC_METHOD_FAMILY_NONE;

- (void)invalidate;

- (id)invokeMethodWithNSString:(NSString *)methodName
             withNSObjectArray:(IOSObjectArray *)args;

+ (id)invokePrivateMethodUsingReflectionWithId:(id)obj
                                  withNSString:(NSString *)methodName
                             withNSObjectArray:(IOSObjectArray *)params;

- (jboolean)isAfterParentInitRequired;

- (jboolean)isInitialised;

- (jboolean)isInvalidateOnFrameChange;

- (id<ASIWidget>)loadLazyWidgetsWithASHasWidgets:(id<ASHasWidgets>)parent;

- (id<ASIWidget>)loadLazyWidgetsWithASHasWidgets:(id<ASHasWidgets>)parent
                                         withInt:(jint)index
                                    withNSString:(NSString *)idKey
                                 withASLoopParam:(ASLoopParam *)model;

- (id<ASIWidget>)loadLazyWidgetsWithASLoopParam:(ASLoopParam *)model;

- (id<ASIWidget>)newLazyInstance OBJC_METHOD_FAMILY_NONE;

- (void)notifyDataSetChanged;

- (id)quickConvertWithId:(id)objValue
            withNSString:(NSString *)type;

- (id)quickConvertWithId:(id)objValue
            withNSString:(NSString *)type
            withNSString:(NSString *)arrayType
            withNSString:(NSString *)finalArrayType;

- (void)reapplyAttributeCommandWithNSString:(NSString *)sourceName
                               withNSString:(NSString *)commandName
                               withNSString:(NSString *)phase
                          withNSObjectArray:(IOSObjectArray *)args;

- (void)registerForAttributeCommandChainWithNSStringArray:(IOSObjectArray *)attrs;

- (void)registerForAttributeCommandChainWithPhaseWithNSString:(NSString *)phase
                                            withNSStringArray:(IOSObjectArray *)attrs;

- (void)removeAttributeCommandFromChainWithNSString:(NSString *)sourceName
                                  withNSStringArray:(IOSObjectArray *)attributes
                             withASAttributeCommand:(id<ASAttributeCommand>)attributeCommand;

- (void)removeObjectListenersWithASIWidget:(id<ASIWidget>)widget;

- (void)replayBufferedEvents;

- (void)requestLayout;

- (void)requestLayoutNInvalidateIfRequiredWithInt:(jint)updateUiFlag;

- (void)rerunCommandOnSourceWithNSString:(NSString *)sourceName
                            withNSString:(NSString *)phase;

- (void)restoreToDefaultState;

- (void)runAttributeCommandsWithId:(id)nativeWidget
                      withNSString:(NSString *)phase
                      withNSString:(NSString *)commandFilterRegex
                 withNSObjectArray:(IOSObjectArray *)args;

- (void)setAnimatorWithId:(id)animator;

- (void)setAttributeWithNSString:(NSString *)key
                          withId:(id)objValue
                     withBoolean:(jboolean)skipConvert;

- (void)setAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
                             withNSString:(NSString *)strValue
                                   withId:(id)objValue
                withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (void)setBehaviorGroupIdWithNSString:(NSString *)behaviorGroupId;

- (void)setComponentIdWithNSString:(NSString *)componentId;

- (void)setCustomErrorMessageKeysWithJavaUtilList:(id<JavaUtilList>)customErrorMessageKeys;

- (void)setCustomErrorMessageValuesWithJavaUtilList:(id<JavaUtilList>)customErrorMessageValues;

- (void)setDrawableBoundsWithInt:(jint)l
                         withInt:(jint)t
                         withInt:(jint)r
                         withInt:(jint)b;

- (void)setErrorStyleWithNSString:(NSString *)errorStyle;

- (void)setEventBubblersWithJavaUtilCollection:(id<JavaUtilCollection>)flags;

- (jboolean)setFieldUsingReflectionWithId:(id)targetObject
                             withNSString:(NSString *)fieldName
                                   withId:(id)fieldValue;

- (void)setIdWithNSString:(NSString *)id_;

- (void)setInvalidateOnFrameChangeWithBoolean:(jboolean)invalidateOnFrameChange;

- (void)setListenerWithASIWidgetLifeCycleListener:(id<ASIWidgetLifeCycleListener>)listener;

- (void)setLoopParamWithASLoopParam:(ASLoopParam *)loopParam;

- (void)setModelIdPathWithNSString:(NSString *)modelIdPath;

- (void)setModelParamWithNSString:(NSString *)modelParam;

- (void)setModelPojoToUiWithNSString:(NSString *)syncExpression;

- (void)setModelPojoToUiParamsWithNSString:(NSString *)params;

- (void)setModelSyncEventsWithNSString:(NSString *)modelSyncEvents;

- (void)setModelUiToPojoWithNSString:(NSString *)syncExpression;

- (void)setModelUiToPojoEventIdsWithNSString:(NSString *)val;

- (void)setNormalStyleWithNSString:(NSString *)normalStyle;

- (void)setOnMethodCalledWithBoolean:(jboolean)onMethodCalled;

- (void)setParamsWithJavaUtilMap:(id<JavaUtilMap>)params;

- (void)setParentWithASHasWidgets:(id<ASHasWidgets>)parent;

- (void)setValidationErrorDisplayTypeWithInt:(jint)validationErrorDisplayType;

- (void)setVisibleWithBoolean:(jboolean)b;

- (void)setZIndexWithInt:(jint)zIndex;

- (void)storeInTempCacheWithNSString:(NSString *)key
                              withId:(id)object;

- (void)storeModelToScopeWithNSString:(NSString *)varName
                     withASModelScope:(ASModelScope *)varScope
                               withId:(id)objValue;

- (void)storeModelToScopeWithNSString:(NSString *)varName
                     withASModelScope:(ASModelScope *)varScope
                               withId:(id)objValue
                      withASLoopParam:(ASLoopParam *)loopParam;

- (void)storeUserDataWithNSString:(NSString *)key
                           withId:(id)object;

- (void)syncModelFromUiToPojoWithNSString:(NSString *)eventType;

- (id)unwrapWithId:(id)widget;

- (void)updateMeasuredDimensionWithInt:(jint)width
                               withInt:(jint)height;

- (void)updateModelByPathWithNSString:(NSString *)varPath
                               withId:(id)objValue
                               withId:(id)obj;

- (void)updateModelDataWithNSString:(NSString *)expression
                             withId:(id)data;

- (void)updateModelToEventMapWithJavaUtilMap:(id<JavaUtilMap>)eventMap
                                withNSString:(NSString *)eventParams
                             withASLoopParam:(ASLoopParam *)loopParam;

- (void)updateModelToEventMapWithJavaUtilMap:(id<JavaUtilMap>)eventMap
                                withNSString:(NSString *)eventType
                                withNSString:(NSString *)eventParams;

- (void)updateWidgetMapWithASWidgetAttribute:(ASWidgetAttribute *)attribute
                            withJavaUtilList:(id<JavaUtilList>)list;

- (void)updateWidgetMapWithASWidgetAttribute:(ASWidgetAttribute *)key
                  withASWidgetAttributeValue:(ASWidgetAttributeValue *)value;

- (void)updateWidgetMapWithASWidgetAttributeMap:(ASWidgetAttributeMap *)attributes;

#pragma mark Protected

- (jboolean)applyModelAttributes;

- (void)applyStyleToWidgets;

- (void)attributeBuffered;

- (jboolean)checkIfAttributeMatchesWithASWidgetAttributeValue:(ASWidgetAttributeValue *)attribute;

- (jboolean)getBooleanWithId:(id)val;

- (id<JavaUtilMap>)getDependentAttributesMapWithASIConverter:(id<ASIConverter>)converter;

- (void)replayBufferedEventsInternal;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASBaseWidget)

J2OBJC_FIELD_SETTER(ASBaseWidget, attributes_, ASWidgetAttributeMap *)
J2OBJC_FIELD_SETTER(ASBaseWidget, params_, id<JavaUtilMap>)
J2OBJC_FIELD_SETTER(ASBaseWidget, userData_, id<JavaUtilMap>)
J2OBJC_FIELD_SETTER(ASBaseWidget, tmpCache_, id<JavaUtilMap>)
J2OBJC_FIELD_SETTER(ASBaseWidget, localName_, NSString *)
J2OBJC_FIELD_SETTER(ASBaseWidget, groupName_, NSString *)
J2OBJC_FIELD_SETTER(ASBaseWidget, methodListeners_, id<JavaUtilMap>)

FOUNDATION_EXPORT void ASBaseWidget_initWithNSString_withNSString_(ASBaseWidget *self, NSString *groupName, NSString *localName);

FOUNDATION_EXPORT id ASBaseWidget_invokePrivateMethodUsingReflectionWithId_withNSString_withNSObjectArray_(id obj, NSString *methodName, IOSObjectArray *params);

J2OBJC_TYPE_LITERAL_HEADER(ASBaseWidget)

@compatibility_alias ComAsheraWidgetBaseWidget ASBaseWidget;

#endif

#if !defined (ASBaseWidget_LazyBaseWidget_) && (INCLUDE_ALL_BaseWidget || defined(INCLUDE_ASBaseWidget_LazyBaseWidget))
#define ASBaseWidget_LazyBaseWidget_

@class ASBaseWidget;
@class ASWidgetAttribute;
@class IOSClass;
@protocol ASIFragment;
@protocol ASILifeCycleDecorator;
@protocol ASIWidget;
@protocol JavaUtilMap;

@interface ASBaseWidget_LazyBaseWidget : ASBaseWidget

#pragma mark Public

- (instancetype)initWithASBaseWidget:(ASBaseWidget *)outer$;

- (id)asNativeWidget;

- (id)asWidget;

- (void)createWithASIFragment:(id<ASIFragment>)fragment
              withJavaUtilMap:(id<JavaUtilMap>)params;

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
              withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (NSString *)getGroupName;

- (NSString *)getLocalName;

- (IOSClass *)getViewClass;

- (void)initialized OBJC_METHOD_FAMILY_NONE;

- (void)loadAttributesWithNSString:(NSString *)localName;

- (id<ASIWidget>)newInstance OBJC_METHOD_FAMILY_NONE;

- (void)setAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
                             withNSString:(NSString *)strValue
                                   withId:(id)objValue
                withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithNSString:(NSString *)arg0
                    withNSString:(NSString *)arg1 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASBaseWidget_LazyBaseWidget)

FOUNDATION_EXPORT void ASBaseWidget_LazyBaseWidget_initWithASBaseWidget_(ASBaseWidget_LazyBaseWidget *self, ASBaseWidget *outer$);

FOUNDATION_EXPORT ASBaseWidget_LazyBaseWidget *new_ASBaseWidget_LazyBaseWidget_initWithASBaseWidget_(ASBaseWidget *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASBaseWidget_LazyBaseWidget *create_ASBaseWidget_LazyBaseWidget_initWithASBaseWidget_(ASBaseWidget *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASBaseWidget_LazyBaseWidget)

#endif

#if !defined (ASBaseWidget_EventHolder_) && (INCLUDE_ALL_BaseWidget || defined(INCLUDE_ASBaseWidget_EventHolder))
#define ASBaseWidget_EventHolder_

@class ASBaseWidget;
@class ASWidgetAttribute;
@protocol ASIWidget;

@interface ASBaseWidget_EventHolder : NSObject {
 @public
  ASWidgetAttribute *widgetAttribute_;
  id<ASIWidget> childWidget_;
  id objValue_;
}

#pragma mark Public

- (instancetype)initWithASBaseWidget:(ASBaseWidget *)outer$
               withASWidgetAttribute:(ASWidgetAttribute *)widgetAttribute
                       withASIWidget:(id<ASIWidget>)childWidget
                              withId:(id)objValue;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASBaseWidget_EventHolder)

J2OBJC_FIELD_SETTER(ASBaseWidget_EventHolder, widgetAttribute_, ASWidgetAttribute *)
J2OBJC_FIELD_SETTER(ASBaseWidget_EventHolder, childWidget_, id<ASIWidget>)
J2OBJC_FIELD_SETTER(ASBaseWidget_EventHolder, objValue_, id)

FOUNDATION_EXPORT void ASBaseWidget_EventHolder_initWithASBaseWidget_withASWidgetAttribute_withASIWidget_withId_(ASBaseWidget_EventHolder *self, ASBaseWidget *outer$, ASWidgetAttribute *widgetAttribute, id<ASIWidget> childWidget, id objValue);

FOUNDATION_EXPORT ASBaseWidget_EventHolder *new_ASBaseWidget_EventHolder_initWithASBaseWidget_withASWidgetAttribute_withASIWidget_withId_(ASBaseWidget *outer$, ASWidgetAttribute *widgetAttribute, id<ASIWidget> childWidget, id objValue) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASBaseWidget_EventHolder *create_ASBaseWidget_EventHolder_initWithASBaseWidget_withASWidgetAttribute_withASIWidget_withId_(ASBaseWidget *outer$, ASWidgetAttribute *widgetAttribute, id<ASIWidget> childWidget, id objValue);

J2OBJC_TYPE_LITERAL_HEADER(ASBaseWidget_EventHolder)

#endif

#pragma pop_macro("INCLUDE_ALL_BaseWidget")
