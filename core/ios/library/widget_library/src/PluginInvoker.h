//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\widget\PluginInvoker.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_PluginInvoker")
#ifdef RESTRICT_PluginInvoker
#define INCLUDE_ALL_PluginInvoker 0
#else
#define INCLUDE_ALL_PluginInvoker 1
#endif
#undef RESTRICT_PluginInvoker

#if !defined (ASPluginInvoker_) && (INCLUDE_ALL_PluginInvoker || defined(INCLUDE_ASPluginInvoker))
#define ASPluginInvoker_

@class ASFontMetricsDescriptor;
@class IOSClass;
@class IOSObjectArray;
@class JavaIoFile;
@class JavaIoInputStream;
@class JavaLangBoolean;
@class JavaLangDouble;
@class JavaLangFloat;
@class JavaLangInteger;
@protocol ASAttributedString;
@protocol ASHasWidgets;
@protocol ASIConverter;
@protocol ASIFragment;
@protocol ASIWidget;
@protocol JavaLangRunnable;
@protocol JavaUtilList;
@protocol JavaUtilMap;

@interface ASPluginInvoker : NSObject

#pragma mark Public

- (instancetype)init;

+ (void)addToCurrentParentWithId:(id)handler
                   withASIWidget:(id<ASIWidget>)widget;

+ (jfloat)convertDpToPixelWithNSString:(NSString *)dimen;

+ (id)convertFromWithASIConverter:(id<ASIConverter>)converter
                  withJavaUtilMap:(id<JavaUtilMap>)dependentAttributesMap
                           withId:(id)value
                  withASIFragment:(id<ASIFragment>)fragment;

+ (NSString *)convertPixelToDpWithId:(id)dimen
                         withBoolean:(jboolean)isInt;

+ (NSString *)convertPixelToSpWithId:(id)dimen
                         withBoolean:(jboolean)isInt;

+ (jfloat)convertSpToPixelWithNSString:(NSString *)dimen;

+ (id)convertToWithASIConverter:(id<ASIConverter>)converter
                         withId:(id)objValue
                withASIFragment:(id<ASIFragment>)fragment;

+ (id<ASAttributedString>)createAttributedStringWithASIFragment:(id<ASIFragment>)fragment
                                                   withNSString:(NSString *)text;

+ (id)createDrawableWithNSString:(NSString *)type;

+ (id)decodeBitmapStreamWithJavaIoInputStream:(JavaIoInputStream *)stream
                                       withId:(id)options;

+ (void)enqueueTaskForEventLoopWithJavaLangRunnable:(id<JavaLangRunnable>)runnable
                                           withLong:(jlong)delay;

+ (IOSObjectArray *)getArrayWithId:(id)payLoad;

+ (NSString *)getAssetModeWithASIFragment:(id<ASIFragment>)fragment;

+ (NSString *)getAttributedBulletHtml;

+ (JavaLangBoolean *)getBooleanWithId:(id)payLoad;

+ (id)getColorWithNSString:(NSString *)color;

+ (id<ASIConverter>)getConverterWithNSString:(NSString *)name;

+ (jint)getDensity;

+ (NSString *)getDensityName;

+ (id<JavaUtilList>)getDependentAttributesWithASIConverter:(id<ASIConverter>)converter;

+ (NSString *)getDevServerIpWithASIFragment:(id<ASIFragment>)fragment;

+ (jfloat)getDisplayMetricDensity;

+ (JavaLangDouble *)getDoubleWithId:(id)object;

+ (JavaIoFile *)getExternalFilesDirWithId:(id)context;

+ (NSString *)getFileAssetWithNSString:(NSString *)path
                       withASIFragment:(id<ASIFragment>)fragment;

+ (JavaLangFloat *)getFloatWithId:(id)object;

+ (ASFontMetricsDescriptor *)getFontMetricsWithId:(id)font;

+ (id)getHandlerWithASHasWidgets:(id<ASHasWidgets>)parent
                         withInt:(jint)index
                 withASIFragment:(id<ASIFragment>)fragment;

+ (JavaLangInteger *)getIntWithId:(id)object;

+ (id<JavaUtilMap>)getJSONCompatMap;

+ (id)getJSONSafeObjWithId:(id)obj;

+ (id<JavaUtilList>)getListWithId:(id)payLoad;

+ (id<JavaUtilMap>)getMapWithId:(id)payLoad;

+ (jint)getMaxMemoryWithId:(id)context;

+ (id)getNativeMapWithJavaUtilMap:(id<JavaUtilMap>)payLoad;

+ (NSString *)getOrientation;

+ (NSString *)getOS;

+ (jint)getScreenHeight;

+ (jint)getScreenHeightDp;

+ (jint)getScreenWidth;

+ (jint)getScreenWidthDp;

+ (NSString *)getStringWithId:(id)object;

+ (void)handlerEndWithId:(id)handler
           withASIWidget:(id<ASIWidget>)widget;

+ (id<ASIWidget>)handlerStartWithId:(id)handler
                      withASIWidget:(id<ASIWidget>)widget
                            withInt:(jint)index;

+ (jboolean)isBooleanWithId:(id)obj;

+ (NSString *)marshalWithId:(id)object;

+ (void)navigateWithNSString:(NSString *)actionId
                withNSString:(NSString *)varExpression
                      withId:(id)payload
             withASIFragment:(id<ASIFragment>)fragment;

+ (id<ASIWidget>)parseWithNSString:(NSString *)html
                       withBoolean:(jboolean)template_
                   withASIFragment:(id<ASIFragment>)fragment;

+ (id<ASIWidget>)parseFileWithNSString:(NSString *)fileName
                           withBoolean:(jboolean)template_
                       withASIFragment:(id<ASIFragment>)fragment;

+ (void)parseIncludeWithASHasWidgets:(id<ASHasWidgets>)parent
                        withNSString:(NSString *)fileName
                        withNSString:(NSString *)componentId
                         withBoolean:(jboolean)template_
                     withASIFragment:(id<ASIFragment>)fragment;

+ (id<ASIWidget>)parseWithParentWithNSString:(NSString *)html
                                 withBoolean:(jboolean)template_
                            withASHasWidgets:(id<ASHasWidgets>)parent
                             withASIFragment:(id<ASIFragment>)fragment;

+ (id)postDelayedWithJavaLangRunnable:(id<JavaLangRunnable>)mTickRunnable
                              withInt:(jint)delay;

+ (void)putJSONSafeObjectIntoMapWithJavaUtilMap:(id<JavaUtilMap>)map
                                   withNSString:(NSString *)key
                                         withId:(id)value;

+ (void)putObjectToBundleWithId:(id)bundle
                   withNSString:(NSString *)key
                         withId:(id)data;

+ (void)registerFontWithNSString:(NSString *)fontFamily
                    withNSString:(NSString *)src
                    withNSString:(NSString *)fontStyle
                    withNSString:(NSString *)fontWeight
                 withJavaUtilMap:(id<JavaUtilMap>)metadata;

+ (void)releaseNativeResourcesWithJavaUtilList:(id<JavaUtilList>)object;

+ (void)removeCallbacksWithId:(id)handler
         withJavaLangRunnable:(id<JavaLangRunnable>)mTickRunnable;

+ (void)runOnMainThreadWithJavaLangRunnable:(id<JavaLangRunnable>)runnable;

+ (id)toJsonTreeWithId:(id)object;

+ (id)unmarshalWithNSString:(NSString *)json
               withIOSClass:(IOSClass *)clazz;

@end

J2OBJC_EMPTY_STATIC_INIT(ASPluginInvoker)

FOUNDATION_EXPORT void ASPluginInvoker_init(ASPluginInvoker *self);

FOUNDATION_EXPORT ASPluginInvoker *new_ASPluginInvoker_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASPluginInvoker *create_ASPluginInvoker_init(void);

FOUNDATION_EXPORT id ASPluginInvoker_convertFromWithASIConverter_withJavaUtilMap_withId_withASIFragment_(id<ASIConverter> converter, id<JavaUtilMap> dependentAttributesMap, id value, id<ASIFragment> fragment);

FOUNDATION_EXPORT id ASPluginInvoker_convertToWithASIConverter_withId_withASIFragment_(id<ASIConverter> converter, id objValue, id<ASIFragment> fragment);

FOUNDATION_EXPORT id<ASIConverter> ASPluginInvoker_getConverterWithNSString_(NSString *name);

FOUNDATION_EXPORT id<JavaUtilList> ASPluginInvoker_getDependentAttributesWithASIConverter_(id<ASIConverter> converter);

FOUNDATION_EXPORT id ASPluginInvoker_getColorWithNSString_(NSString *color);

FOUNDATION_EXPORT jfloat ASPluginInvoker_convertDpToPixelWithNSString_(NSString *dimen);

FOUNDATION_EXPORT jfloat ASPluginInvoker_convertSpToPixelWithNSString_(NSString *dimen);

FOUNDATION_EXPORT NSString *ASPluginInvoker_convertPixelToDpWithId_withBoolean_(id dimen, jboolean isInt);

FOUNDATION_EXPORT NSString *ASPluginInvoker_convertPixelToSpWithId_withBoolean_(id dimen, jboolean isInt);

FOUNDATION_EXPORT id<JavaUtilMap> ASPluginInvoker_getMapWithId_(id payLoad);

FOUNDATION_EXPORT id ASPluginInvoker_getNativeMapWithJavaUtilMap_(id<JavaUtilMap> payLoad);

FOUNDATION_EXPORT void ASPluginInvoker_putJSONSafeObjectIntoMapWithJavaUtilMap_withNSString_withId_(id<JavaUtilMap> map, NSString *key, id value);

FOUNDATION_EXPORT IOSObjectArray *ASPluginInvoker_getArrayWithId_(id payLoad);

FOUNDATION_EXPORT id<JavaUtilList> ASPluginInvoker_getListWithId_(id payLoad);

FOUNDATION_EXPORT jboolean ASPluginInvoker_isBooleanWithId_(id obj);

FOUNDATION_EXPORT JavaLangBoolean *ASPluginInvoker_getBooleanWithId_(id payLoad);

FOUNDATION_EXPORT NSString *ASPluginInvoker_getStringWithId_(id object);

FOUNDATION_EXPORT JavaLangInteger *ASPluginInvoker_getIntWithId_(id object);

FOUNDATION_EXPORT JavaLangFloat *ASPluginInvoker_getFloatWithId_(id object);

FOUNDATION_EXPORT JavaLangDouble *ASPluginInvoker_getDoubleWithId_(id object);

FOUNDATION_EXPORT NSString *ASPluginInvoker_marshalWithId_(id object);

FOUNDATION_EXPORT id ASPluginInvoker_toJsonTreeWithId_(id object);

FOUNDATION_EXPORT id ASPluginInvoker_unmarshalWithNSString_withIOSClass_(NSString *json, IOSClass *clazz);

FOUNDATION_EXPORT id<JavaUtilMap> ASPluginInvoker_getJSONCompatMap(void);

FOUNDATION_EXPORT id ASPluginInvoker_getJSONSafeObjWithId_(id obj);

FOUNDATION_EXPORT void ASPluginInvoker_navigateWithNSString_withNSString_withId_withASIFragment_(NSString *actionId, NSString *varExpression, id payload, id<ASIFragment> fragment);

FOUNDATION_EXPORT id<ASIWidget> ASPluginInvoker_parseWithNSString_withBoolean_withASIFragment_(NSString *html, jboolean template_, id<ASIFragment> fragment);

FOUNDATION_EXPORT id<ASIWidget> ASPluginInvoker_parseWithParentWithNSString_withBoolean_withASHasWidgets_withASIFragment_(NSString *html, jboolean template_, id<ASHasWidgets> parent, id<ASIFragment> fragment);

FOUNDATION_EXPORT id<ASIWidget> ASPluginInvoker_parseFileWithNSString_withBoolean_withASIFragment_(NSString *fileName, jboolean template_, id<ASIFragment> fragment);

FOUNDATION_EXPORT void ASPluginInvoker_parseIncludeWithASHasWidgets_withNSString_withNSString_withBoolean_withASIFragment_(id<ASHasWidgets> parent, NSString *fileName, NSString *componentId, jboolean template_, id<ASIFragment> fragment);

FOUNDATION_EXPORT id ASPluginInvoker_getHandlerWithASHasWidgets_withInt_withASIFragment_(id<ASHasWidgets> parent, jint index, id<ASIFragment> fragment);

FOUNDATION_EXPORT id<ASIWidget> ASPluginInvoker_handlerStartWithId_withASIWidget_withInt_(id handler, id<ASIWidget> widget, jint index);

FOUNDATION_EXPORT void ASPluginInvoker_handlerEndWithId_withASIWidget_(id handler, id<ASIWidget> widget);

FOUNDATION_EXPORT void ASPluginInvoker_addToCurrentParentWithId_withASIWidget_(id handler, id<ASIWidget> widget);

FOUNDATION_EXPORT NSString *ASPluginInvoker_getAssetModeWithASIFragment_(id<ASIFragment> fragment);

FOUNDATION_EXPORT NSString *ASPluginInvoker_getDevServerIpWithASIFragment_(id<ASIFragment> fragment);

FOUNDATION_EXPORT NSString *ASPluginInvoker_getOrientation(void);

FOUNDATION_EXPORT jint ASPluginInvoker_getScreenWidth(void);

FOUNDATION_EXPORT jint ASPluginInvoker_getScreenHeight(void);

FOUNDATION_EXPORT jint ASPluginInvoker_getScreenWidthDp(void);

FOUNDATION_EXPORT jint ASPluginInvoker_getScreenHeightDp(void);

FOUNDATION_EXPORT NSString *ASPluginInvoker_getOS(void);

FOUNDATION_EXPORT NSString *ASPluginInvoker_getFileAssetWithNSString_withASIFragment_(NSString *path, id<ASIFragment> fragment);

FOUNDATION_EXPORT NSString *ASPluginInvoker_getDensityName(void);

FOUNDATION_EXPORT jint ASPluginInvoker_getDensity(void);

FOUNDATION_EXPORT id ASPluginInvoker_postDelayedWithJavaLangRunnable_withInt_(id<JavaLangRunnable> mTickRunnable, jint delay);

FOUNDATION_EXPORT void ASPluginInvoker_removeCallbacksWithId_withJavaLangRunnable_(id handler, id<JavaLangRunnable> mTickRunnable);

FOUNDATION_EXPORT void ASPluginInvoker_putObjectToBundleWithId_withNSString_withId_(id bundle, NSString *key, id data);

FOUNDATION_EXPORT void ASPluginInvoker_releaseNativeResourcesWithJavaUtilList_(id<JavaUtilList> object);

FOUNDATION_EXPORT ASFontMetricsDescriptor *ASPluginInvoker_getFontMetricsWithId_(id font);

FOUNDATION_EXPORT id ASPluginInvoker_createDrawableWithNSString_(NSString *type);

FOUNDATION_EXPORT id<ASAttributedString> ASPluginInvoker_createAttributedStringWithASIFragment_withNSString_(id<ASIFragment> fragment, NSString *text);

FOUNDATION_EXPORT jfloat ASPluginInvoker_getDisplayMetricDensity(void);

FOUNDATION_EXPORT NSString *ASPluginInvoker_getAttributedBulletHtml(void);

FOUNDATION_EXPORT JavaIoFile *ASPluginInvoker_getExternalFilesDirWithId_(id context);

FOUNDATION_EXPORT jint ASPluginInvoker_getMaxMemoryWithId_(id context);

FOUNDATION_EXPORT id ASPluginInvoker_decodeBitmapStreamWithJavaIoInputStream_withId_(JavaIoInputStream *stream, id options);

FOUNDATION_EXPORT void ASPluginInvoker_runOnMainThreadWithJavaLangRunnable_(id<JavaLangRunnable> runnable);

FOUNDATION_EXPORT void ASPluginInvoker_enqueueTaskForEventLoopWithJavaLangRunnable_withLong_(id<JavaLangRunnable> runnable, jlong delay);

FOUNDATION_EXPORT void ASPluginInvoker_registerFontWithNSString_withNSString_withNSString_withNSString_withJavaUtilMap_(NSString *fontFamily, NSString *src, NSString *fontStyle, NSString *fontWeight, id<JavaUtilMap> metadata);

J2OBJC_TYPE_LITERAL_HEADER(ASPluginInvoker)

@compatibility_alias ComAsheraWidgetPluginInvoker ASPluginInvoker;

#endif

#pragma pop_macro("INCLUDE_ALL_PluginInvoker")
