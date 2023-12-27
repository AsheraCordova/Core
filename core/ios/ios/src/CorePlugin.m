//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\IOSCorePlugin\src\main\java\com\ashera\core\CorePlugin.java
//

#include "Animator.h"
#include "AttributedString.h"
#include "AttributedStringImpl.h"
#include "Bitmap.h"
#include "BitmapFactory.h"
#include "Bundle.h"
#include "CorePlugin.h"
#include "FileUtils.h"
#include "FontMetricsDescriptor.h"
#include "HtmlParserPlugin.h"
#include "IActivity.h"
#include "IFragment.h"
#include "IOSClass.h"
#include "IOSObjectArray.h"
#include "IOSPrimitiveArray.h"
#include "J2ObjC_source.h"
#include "PluginInvoker.h"
#include "PluginManager.h"
#include "ResourceBundleUtils.h"
#include "ShapeDrawableImpl.h"
#include "UINavigatorImpl.h"
#include "java/io/File.h"
#include "java/io/InputStream.h"
#include "java/lang/Float.h"
#include "java/lang/Integer.h"
#include "java/lang/Long.h"
#include "java/lang/Runnable.h"
#include "java/lang/Runtime.h"
#include "java/lang/RuntimeException.h"
#include "java/lang/System.h"
#include "java/util/ArrayList.h"
#include "java/util/List.h"
#include "java/util/Map.h"

#import <sys/utsname.h>

@class JavaIoInputStream;
@protocol JavaLangRunnable;


#pragma clang diagnostic ignored "-Wprotocol"

@interface ASCorePlugin ()

- (id)scheduledTimerWithTimeIntervalWithJavaLangRunnable:(id<JavaLangRunnable>)mTickRunnable
                                               withFloat:(jfloat)delay;

- (void)invalidateTimerWithId:(id)handler;

- (jfloat)getMaxAscentWithId:(id)fontObj;

- (jfloat)getAscentWithId:(id)fontObj;

- (jfloat)getDescentWithId:(id)fontObj;

- (jfloat)getMaxDescentWithId:(id)fontObj;

- (jfloat)getLeadingWithId:(id)fontObj;

- (NSString *)getDeviceName;

- (NSString *)nativeGetExternalFilesDir;

- (void)nativeRunOnMainThreadWithJavaLangRunnable:(id<JavaLangRunnable>)runnable;

@end

inline NSString *ASCorePlugin_get_PLUGIN_NAME_CORE(void);
static NSString *ASCorePlugin_PLUGIN_NAME_CORE = @"core";
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASCorePlugin, PLUGIN_NAME_CORE, NSString *)

inline jint ASCorePlugin_get_density(void);
inline jint ASCorePlugin_set_density(jint value);
inline jint *ASCorePlugin_getRef_density(void);
static jint ASCorePlugin_density = 163;
J2OBJC_STATIC_FIELD_PRIMITIVE(ASCorePlugin, density, jint)

inline ASUINavigatorImpl *ASCorePlugin_get_navigator(void);
inline ASUINavigatorImpl *ASCorePlugin_set_navigator(ASUINavigatorImpl *value);
static ASUINavigatorImpl *ASCorePlugin_navigator;
J2OBJC_STATIC_FIELD_OBJ(ASCorePlugin, navigator, ASUINavigatorImpl *)

__attribute__((unused)) static id ASCorePlugin_scheduledTimerWithTimeIntervalWithJavaLangRunnable_withFloat_(ASCorePlugin *self, id<JavaLangRunnable> mTickRunnable, jfloat delay);

__attribute__((unused)) static void ASCorePlugin_invalidateTimerWithId_(ASCorePlugin *self, id handler);

__attribute__((unused)) static jfloat ASCorePlugin_getMaxAscentWithId_(ASCorePlugin *self, id fontObj);

__attribute__((unused)) static jfloat ASCorePlugin_getAscentWithId_(ASCorePlugin *self, id fontObj);

__attribute__((unused)) static jfloat ASCorePlugin_getDescentWithId_(ASCorePlugin *self, id fontObj);

__attribute__((unused)) static jfloat ASCorePlugin_getMaxDescentWithId_(ASCorePlugin *self, id fontObj);

__attribute__((unused)) static jfloat ASCorePlugin_getLeadingWithId_(ASCorePlugin *self, id fontObj);

__attribute__((unused)) static NSString *ASCorePlugin_getDeviceName(ASCorePlugin *self);

__attribute__((unused)) static NSString *ASCorePlugin_nativeGetExternalFilesDir(ASCorePlugin *self);

__attribute__((unused)) static void ASCorePlugin_nativeRunOnMainThreadWithJavaLangRunnable_(ASCorePlugin *self, id<JavaLangRunnable> runnable);

@interface ASCorePlugin_MyBitmap : NSObject < ADBitmap > {
 @public
  id image_;
}

- (instancetype)initWithJavaIoInputStream:(JavaIoInputStream *)stream;

- (id)nativeGetImageWithByteArray:(IOSByteArray *)bytes;

- (jint)getRowBytes;

+ (jint)getImageWidthWithId:(id)value;

+ (jint)getImageHeightWithId:(id)value;

- (jint)getHeight;

- (id)getImage;

@end

J2OBJC_EMPTY_STATIC_INIT(ASCorePlugin_MyBitmap)

J2OBJC_FIELD_SETTER(ASCorePlugin_MyBitmap, image_, id)

__attribute__((unused)) static void ASCorePlugin_MyBitmap_initWithJavaIoInputStream_(ASCorePlugin_MyBitmap *self, JavaIoInputStream *stream);

__attribute__((unused)) static ASCorePlugin_MyBitmap *new_ASCorePlugin_MyBitmap_initWithJavaIoInputStream_(JavaIoInputStream *stream) NS_RETURNS_RETAINED;

__attribute__((unused)) static ASCorePlugin_MyBitmap *create_ASCorePlugin_MyBitmap_initWithJavaIoInputStream_(JavaIoInputStream *stream);

__attribute__((unused)) static id ASCorePlugin_MyBitmap_nativeGetImageWithByteArray_(ASCorePlugin_MyBitmap *self, IOSByteArray *bytes);

__attribute__((unused)) static jint ASCorePlugin_MyBitmap_getImageWidthWithId_(id value);

__attribute__((unused)) static jint ASCorePlugin_MyBitmap_getImageHeightWithId_(id value);

J2OBJC_TYPE_LITERAL_HEADER(ASCorePlugin_MyBitmap)

@interface ASCorePlugin_$Lambda$1 : NSObject < JavaLangRunnable > {
 @public
  ASCorePlugin *this$0_;
  id<JavaLangRunnable> val$runnable_;
}

- (void)run;

@end

J2OBJC_EMPTY_STATIC_INIT(ASCorePlugin_$Lambda$1)

__attribute__((unused)) static void ASCorePlugin_$Lambda$1_initWithASCorePlugin_withJavaLangRunnable_(ASCorePlugin_$Lambda$1 *self, ASCorePlugin *outer$, id<JavaLangRunnable> capture$0);

__attribute__((unused)) static ASCorePlugin_$Lambda$1 *new_ASCorePlugin_$Lambda$1_initWithASCorePlugin_withJavaLangRunnable_(ASCorePlugin *outer$, id<JavaLangRunnable> capture$0) NS_RETURNS_RETAINED;

__attribute__((unused)) static ASCorePlugin_$Lambda$1 *create_ASCorePlugin_$Lambda$1_initWithASCorePlugin_withJavaLangRunnable_(ASCorePlugin *outer$, id<JavaLangRunnable> capture$0);

J2OBJC_INITIALIZED_DEFN(ASCorePlugin)

@implementation ASCorePlugin

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASCorePlugin_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (NSString *)getName {
  return ASCorePlugin_PLUGIN_NAME_CORE;
}

+ (void)initPlugin {
  ASCorePlugin_initPlugin();
}

- (id)invokeWithNSString:(NSString *)name
       withNSObjectArray:(IOSObjectArray *)args {
  switch (JreIndexOfStr(name, (id[]){ @"getAssetMode", @"getDevServerIp", @"getOrientation", @"getScreenWidth", @"getScreenHeight", @"getScreenWidthDp", @"getScreenHeightDp", @"getOS", @"getFileAsset", @"getDensityName", @"getDensity", @"postDelayed", @"removeCallbacks", @"putObjectToBundle", @"releaseNativeResources", @"getFontMetrics", @"createDrawable", @"createAttributedString", @"getDisplayMetricDensity", @"getAttributedBulletHtml", @"getExternalFilesDir", @"getMaxMemory", @"decodeBitmapStream", @"runOnMainThread", @"enqueueTaskForEventLoop" }, 25)) {
    case 0:
    return [self getAssetModeWithASIFragment:(id<ASIFragment>) cast_check(IOSObjectArray_Get(nil_chk(args), 0), ASIFragment_class_())];
    case 1:
    return [self getDevServerIpWithASIFragment:(id<ASIFragment>) cast_check(IOSObjectArray_Get(nil_chk(args), 0), ASIFragment_class_())];
    case 2:
    return [self getOrientation];
    case 3:
    return JavaLangInteger_valueOfWithInt_([self getScreenWidth]);
    case 4:
    return JavaLangInteger_valueOfWithInt_([self getScreenHeight]);
    case 5:
    return JavaLangInteger_valueOfWithInt_([self getScreenWidthDp]);
    case 6:
    return JavaLangInteger_valueOfWithInt_([self getScreenHeightDp]);
    case 7:
    return [self getOS];
    case 8:
    return [self getFileAssetWithNSString:(NSString *) cast_chk(IOSObjectArray_Get(nil_chk(args), 0), [NSString class]) withASIFragment:(id<ASIFragment>) cast_check(IOSObjectArray_Get(args, 1), ASIFragment_class_())];
    case 9:
    return [self getDensityName];
    case 10:
    return JavaLangInteger_valueOfWithInt_([self getDensity]);
    case 11:
    return [self postDelayedWithJavaLangRunnable:(id<JavaLangRunnable>) cast_check(IOSObjectArray_Get(nil_chk(args), 0), JavaLangRunnable_class_()) withInt:[((JavaLangInteger *) nil_chk((JavaLangInteger *) cast_chk(IOSObjectArray_Get(args, 1), [JavaLangInteger class]))) intValue]];
    case 12:
    [self removeCallbacksWithId:IOSObjectArray_Get(nil_chk(args), 0) withJavaLangRunnable:(id<JavaLangRunnable>) cast_check(IOSObjectArray_Get(args, 1), JavaLangRunnable_class_())];
    return nil;
    case 13:
    [self putObjectToBundleWithId:IOSObjectArray_Get(nil_chk(args), 0) withNSString:(NSString *) cast_chk(IOSObjectArray_Get(args, 1), [NSString class]) withId:IOSObjectArray_Get(args, 2)];
    return nil;
    case 14:
    [self releaseNativeResourcesWithJavaUtilList:(id<JavaUtilList>) cast_check(IOSObjectArray_Get(nil_chk(args), 0), JavaUtilList_class_())];
    return nil;
    case 15:
    return [self getFontMetricsWithId:IOSObjectArray_Get(nil_chk(args), 0)];
    case 16:
    return [self createDrawableWithNSString:(NSString *) cast_chk(IOSObjectArray_Get(nil_chk(args), 0), [NSString class])];
    case 17:
    return [self createAttributedStringWithASIFragment:(id<ASIFragment>) cast_check(IOSObjectArray_Get(nil_chk(args), 0), ASIFragment_class_()) withNSString:(NSString *) cast_chk(IOSObjectArray_Get(args, 1), [NSString class])];
    case 18:
    return JavaLangFloat_valueOfWithFloat_([self getDisplayMetricDensity]);
    case 19:
    return [self getAttributedBulletHtml];
    case 20:
    return [self getExternalFilesDirWithId:IOSObjectArray_Get(nil_chk(args), 0)];
    case 21:
    return JavaLangInteger_valueOfWithInt_([self getMaxMemoryWithId:IOSObjectArray_Get(nil_chk(args), 0)]);
    case 22:
    return [self decodeBitmapStreamWithJavaIoInputStream:(JavaIoInputStream *) cast_chk(IOSObjectArray_Get(nil_chk(args), 0), [JavaIoInputStream class]) withId:IOSObjectArray_Get(args, 1)];
    case 23:
    [self runOnMainThreadWithJavaLangRunnable:(id<JavaLangRunnable>) cast_check(IOSObjectArray_Get(nil_chk(args), 0), JavaLangRunnable_class_())];
    return nil;
    case 24:
    [self enqueueTaskForEventLoopWithJavaLangRunnable:(id<JavaLangRunnable>) cast_check(IOSObjectArray_Get(nil_chk(args), 0), JavaLangRunnable_class_()) withLong:[((JavaLangLong *) nil_chk((JavaLangLong *) cast_chk(IOSObjectArray_Get(args, 1), [JavaLangLong class]))) longLongValue]];
    return nil;
    default:
    break;
  }
  @throw new_JavaLangRuntimeException_initWithNSString_(JreStrcat("$$", @"Unknown method ", name));
}

- (NSString *)getAssetModeWithASIFragment:(id<ASIFragment>)fragment {
  id<ASIActivity> activity = [((id<ASIFragment>) nil_chk(fragment)) getRootActivity];
  return activity == nil ? @"prod" : [activity getAssetMode];
}

- (NSString *)getDevServerIpWithASIFragment:(id<ASIFragment>)fragment {
  id<ASIActivity> activity = [((id<ASIFragment>) nil_chk(fragment)) getRootActivity];
  return activity == nil ? @"localhost" : [activity getDevServerIp];
}

- (NSString *)getOrientation {
  return [self isLandScape] ? @"landscape" : @"portrait";
}

- (jboolean)isLandScape {
  UIDeviceOrientation orientation = [[UIDevice currentDevice] orientation];
  return UIInterfaceOrientationIsLandscape(orientation);
}

- (jint)getScreenWidth {
  return [self nativeGetScreenWidth];
}

- (jint)nativeGetScreenHeight {
  UIDeviceOrientation orientation = [[UIDevice currentDevice] orientation];
  CGFloat width   = [[UIScreen mainScreen] bounds].size.width;
  CGFloat height   = [[UIScreen mainScreen] bounds].size.height;
  CGRect bounds = CGRectZero;
  
  
  if (UIInterfaceOrientationIsLandscape(orientation)) {
    bounds.size = CGSizeMake(MAX(width, height), MIN(width, height));
  } else {
    bounds.size = CGSizeMake(MIN(width, height), MAX(width, height));
  }
  return bounds.size.height;
}

- (jint)nativeGetScreenWidth {
  UIDeviceOrientation orientation = [[UIDevice currentDevice] orientation];
  CGFloat width   = [[UIScreen mainScreen] bounds].size.width;
  CGFloat height   = [[UIScreen mainScreen] bounds].size.height;
  CGRect bounds = CGRectZero;
  if (UIInterfaceOrientationIsLandscape(orientation)) {
    bounds.size = CGSizeMake(MAX(width, height), MIN(width, height));
  } else {
    bounds.size = CGSizeMake(MIN(width, height), MAX(width, height));
  }
  return bounds.size.width;
}

- (jint)getScreenHeight {
  return [self nativeGetScreenHeight];
}

- (NSString *)getOS {
  return @"ios";
}

- (NSString *)getFileAssetWithNSString:(NSString *)path
                       withASIFragment:(id<ASIFragment>)fragment {
  return ASCorePlugin_getFileAssetWithNSString_(path);
}

+ (NSString *)getFileAssetWithNSString:(NSString *)path {
  return ASCorePlugin_getFileAssetWithNSString_(path);
}

- (NSString *)getDensityName {
  return JreStrcat("I", [self getDensity]);
}

- (jint)getDensity {
  return ASCorePlugin_density;
}

- (id)postDelayedWithJavaLangRunnable:(id<JavaLangRunnable>)mTickRunnable
                              withInt:(jint)delay {
  return ASCorePlugin_scheduledTimerWithTimeIntervalWithJavaLangRunnable_withFloat_(self, mTickRunnable, delay / 1000.0f);
}

- (id)scheduledTimerWithTimeIntervalWithJavaLangRunnable:(id<JavaLangRunnable>)mTickRunnable
                                               withFloat:(jfloat)delay {
  return ASCorePlugin_scheduledTimerWithTimeIntervalWithJavaLangRunnable_withFloat_(self, mTickRunnable, delay);
}

-(void)onTick:(NSTimer *)timer {
  [[timer userInfo] run];
}

- (void)removeCallbacksWithId:(id)handler
         withJavaLangRunnable:(id<JavaLangRunnable>)mTickRunnable {
  ASCorePlugin_invalidateTimerWithId_(self, handler);
}

- (void)invalidateTimerWithId:(id)handler {
  ASCorePlugin_invalidateTimerWithId_(self, handler);
}

- (void)putObjectToBundleWithId:(id)bundle
                   withNSString:(NSString *)key
                         withId:(id)data {
  [((ADBundle *) nil_chk(((ADBundle *) cast_chk(bundle, [ADBundle class])))) putSerializableWithNSString:key withId:data];
}

- (void)releaseNativeResourcesWithJavaUtilList:(id<JavaUtilList>)objects {
  for (id __strong object in nil_chk(objects)) {
    if ([object isKindOfClass:[ADAnimator class]]) {
      [((ADAnimator *) nil_chk(((ADAnimator *) object))) end];
    }
  }
}

- (ASFontMetricsDescriptor *)getFontMetricsWithId:(id)font {
  ASFontMetricsDescriptor *metrics = new_ASFontMetricsDescriptor_init();
  metrics->top_ = JreFpToInt(-ASCorePlugin_getMaxAscentWithId_(self, font));
  metrics->ascent_ = JreFpToInt(-ASCorePlugin_getAscentWithId_(self, font));
  metrics->descent_ = JreFpToInt(-ASCorePlugin_getDescentWithId_(self, font));
  metrics->bottom_ = JreFpToInt(-ASCorePlugin_getMaxDescentWithId_(self, font));
  metrics->leading_ = JreFpToInt(ASCorePlugin_getLeadingWithId_(self, font));
  return metrics;
}

- (jfloat)getMaxAscentWithId:(id)fontObj {
  return ASCorePlugin_getMaxAscentWithId_(self, fontObj);
}

- (jfloat)getAscentWithId:(id)fontObj {
  return ASCorePlugin_getAscentWithId_(self, fontObj);
}

- (jfloat)getDescentWithId:(id)fontObj {
  return ASCorePlugin_getDescentWithId_(self, fontObj);
}

- (jfloat)getMaxDescentWithId:(id)fontObj {
  return ASCorePlugin_getMaxDescentWithId_(self, fontObj);
}

- (jfloat)getLeadingWithId:(id)fontObj {
  return ASCorePlugin_getLeadingWithId_(self, fontObj);
}

- (id)createDrawableWithNSString:(NSString *)type {
  switch (JreIndexOfStr(type, (id[]){ @"shape" }, 1)) {
    case 0:
    return new_ASShapeDrawableImpl_init();
    default:
    break;
  }
  return nil;
}

- (id<ASAttributedString>)createAttributedStringWithASIFragment:(id<ASIFragment>)fragment
                                                   withNSString:(NSString *)text {
  return new_ASAttributedStringImpl_initWithASIFragment_withNSString_(fragment, text);
}

- (jfloat)getDisplayMetricDensity {
  return [self getDensity] / 160.0f;
}

- (NSString *)getDeviceName {
  return ASCorePlugin_getDeviceName(self);
}

- (NSString *)getAttributedBulletHtml {
  return @"\u2022\t";
}

+ (void)navigateAsTopWithNSString:(NSString *)actionId
                           withId:(id)scopedObjects
                  withASIFragment:(id<ASIFragment>)fragment {
  ASCorePlugin_navigateAsTopWithNSString_withId_withASIFragment_(actionId, scopedObjects, fragment);
}

+ (void)navigateWithNSString:(NSString *)actionId
                      withId:(id)scopedObjects
             withASIFragment:(id<ASIFragment>)fragment {
  ASCorePlugin_navigateWithNSString_withId_withASIFragment_(actionId, scopedObjects, fragment);
}

+ (id<JavaUtilList>)getScopedObjectArrayWithId:(id)scopedObjects {
  return ASCorePlugin_getScopedObjectArrayWithId_(scopedObjects);
}

+ (void)navigateWithPopBackStackToWithNSString:(NSString *)actionId
                                  withNSString:(NSString *)destinationId
                                   withBoolean:(jboolean)inclusive
                                        withId:(id)scopedObjects
                               withASIFragment:(id<ASIFragment>)fragment {
  ASCorePlugin_navigateWithPopBackStackToWithNSString_withNSString_withBoolean_withId_withASIFragment_(actionId, destinationId, inclusive, scopedObjects, fragment);
}

+ (void)navigateWithPopBackStackWithNSString:(NSString *)actionId
                                      withId:(id)scopedObjects
                             withASIFragment:(id<ASIFragment>)fragment {
  ASCorePlugin_navigateWithPopBackStackWithNSString_withId_withASIFragment_(actionId, scopedObjects, fragment);
}

+ (void)closeDialog {
  ASCorePlugin_closeDialog();
}

+ (void)popBackStackWithASIFragment:(id<ASIFragment>)fragment {
  ASCorePlugin_popBackStackWithASIFragment_(fragment);
}

+ (void)popBackStackWithASIFragment:(id<ASIFragment>)fragment
                       withNSString:(NSString *)destinationId
                        withBoolean:(jboolean)inclusive {
  ASCorePlugin_popBackStackWithASIFragment_withNSString_withBoolean_(fragment, destinationId, inclusive);
}

+ (NSString *)executeSimpleCommandWithId:(id)commands
                         withASIFragment:(id<ASIFragment>)fragment {
  return ASCorePlugin_executeSimpleCommandWithId_withASIFragment_(commands, fragment);
}

- (jint)getScreenWidthDp {
  return JreFpToInt(([self getScreenWidth] / [self getDisplayMetricDensity]));
}

- (jint)getScreenHeightDp {
  return JreFpToInt(([self getScreenHeight] / [self getDisplayMetricDensity]));
}

- (JavaIoFile *)getExternalFilesDirWithId:(id)context {
  return new_JavaIoFile_initWithNSString_(ASCorePlugin_nativeGetExternalFilesDir(self));
}

- (NSString *)nativeGetExternalFilesDir {
  return ASCorePlugin_nativeGetExternalFilesDir(self);
}

- (jint)getMaxMemoryWithId:(id)context {
  JavaLangRuntime *rt = JavaLangRuntime_getRuntime();
  jint maxMemory = JreFpToInt(([((JavaLangRuntime *) nil_chk(rt)) maxMemory] / (1024 * 1024 * 1.0f)));
  return maxMemory;
}

- (id)decodeBitmapStreamWithJavaIoInputStream:(JavaIoInputStream *)stream
                                       withId:(id)options {
  if (((ADBitmapFactory_Options *) nil_chk(((ADBitmapFactory_Options *) cast_chk(options, [ADBitmapFactory_Options class]))))->inJustDecodeBounds_) {
    return nil;
  }
  return new_ASCorePlugin_MyBitmap_initWithJavaIoInputStream_(stream);
}

- (void)runOnMainThreadWithJavaLangRunnable:(id<JavaLangRunnable>)runnable {
  ASCorePlugin_nativeRunOnMainThreadWithJavaLangRunnable_(self, runnable);
}

- (void)nativeRunOnMainThreadWithJavaLangRunnable:(id<JavaLangRunnable>)runnable {
  ASCorePlugin_nativeRunOnMainThreadWithJavaLangRunnable_(self, runnable);
}

- (void)enqueueTaskForEventLoopWithJavaLangRunnable:(id<JavaLangRunnable>)runnable
                                           withLong:(jlong)when {
  jint delayInMills = (jint) (when - JavaLangSystem_currentTimeMillis());
  if (delayInMills <= 0) {
    ASCorePlugin_nativeRunOnMainThreadWithJavaLangRunnable_(self, runnable);
  }
  else {
    (void) [self postDelayedWithJavaLangRunnable:new_ASCorePlugin_$Lambda$1_initWithASCorePlugin_withJavaLangRunnable_(self, runnable) withInt:delayInMills];
  }
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x9, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x81, 0, 1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, 2, 3, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, 4, 3, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x101, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x101, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x101, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, 5, 6, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x109, 5, 7, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, 8, 9, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x102, 10, 11, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 12, 13, -1, -1, -1, -1 },
    { NULL, "V", 0x102, 14, 15, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 16, 17, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 18, 19, -1, 20, -1, -1 },
    { NULL, "LASFontMetricsDescriptor;", 0x1, 21, 15, -1, -1, -1, -1 },
    { NULL, "F", 0x102, 22, 15, -1, -1, -1, -1 },
    { NULL, "F", 0x102, 23, 15, -1, -1, -1, -1 },
    { NULL, "F", 0x102, 24, 15, -1, -1, -1, -1 },
    { NULL, "F", 0x102, 25, 15, -1, -1, -1, -1 },
    { NULL, "F", 0x102, 26, 15, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, 27, 7, -1, -1, -1, -1 },
    { NULL, "LASAttributedString;", 0x1, 28, 29, -1, -1, -1, -1 },
    { NULL, "F", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x102, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 30, 31, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 32, 31, -1, -1, -1, -1 },
    { NULL, "LJavaUtilList;", 0x9, 33, 15, -1, 34, -1, -1 },
    { NULL, "V", 0x9, 35, 36, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 37, 31, -1, -1, -1, -1 },
    { NULL, "V", 0x9, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 38, 3, -1, -1, -1, -1 },
    { NULL, "V", 0x9, 38, 39, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x9, 40, 41, -1, -1, -1, -1 },
    { NULL, "I", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LJavaIoFile;", 0x1, 42, 15, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x102, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x1, 43, 15, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, 44, 45, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 46, 47, -1, -1, -1, -1 },
    { NULL, "V", 0x102, 48, 47, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 49, 50, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(getName);
  methods[2].selector = @selector(initPlugin);
  methods[3].selector = @selector(invokeWithNSString:withNSObjectArray:);
  methods[4].selector = @selector(getAssetModeWithASIFragment:);
  methods[5].selector = @selector(getDevServerIpWithASIFragment:);
  methods[6].selector = @selector(getOrientation);
  methods[7].selector = @selector(isLandScape);
  methods[8].selector = @selector(getScreenWidth);
  methods[9].selector = @selector(nativeGetScreenHeight);
  methods[10].selector = @selector(nativeGetScreenWidth);
  methods[11].selector = @selector(getScreenHeight);
  methods[12].selector = @selector(getOS);
  methods[13].selector = @selector(getFileAssetWithNSString:withASIFragment:);
  methods[14].selector = @selector(getFileAssetWithNSString:);
  methods[15].selector = @selector(getDensityName);
  methods[16].selector = @selector(getDensity);
  methods[17].selector = @selector(postDelayedWithJavaLangRunnable:withInt:);
  methods[18].selector = @selector(scheduledTimerWithTimeIntervalWithJavaLangRunnable:withFloat:);
  methods[19].selector = @selector(removeCallbacksWithId:withJavaLangRunnable:);
  methods[20].selector = @selector(invalidateTimerWithId:);
  methods[21].selector = @selector(putObjectToBundleWithId:withNSString:withId:);
  methods[22].selector = @selector(releaseNativeResourcesWithJavaUtilList:);
  methods[23].selector = @selector(getFontMetricsWithId:);
  methods[24].selector = @selector(getMaxAscentWithId:);
  methods[25].selector = @selector(getAscentWithId:);
  methods[26].selector = @selector(getDescentWithId:);
  methods[27].selector = @selector(getMaxDescentWithId:);
  methods[28].selector = @selector(getLeadingWithId:);
  methods[29].selector = @selector(createDrawableWithNSString:);
  methods[30].selector = @selector(createAttributedStringWithASIFragment:withNSString:);
  methods[31].selector = @selector(getDisplayMetricDensity);
  methods[32].selector = @selector(getDeviceName);
  methods[33].selector = @selector(getAttributedBulletHtml);
  methods[34].selector = @selector(navigateAsTopWithNSString:withId:withASIFragment:);
  methods[35].selector = @selector(navigateWithNSString:withId:withASIFragment:);
  methods[36].selector = @selector(getScopedObjectArrayWithId:);
  methods[37].selector = @selector(navigateWithPopBackStackToWithNSString:withNSString:withBoolean:withId:withASIFragment:);
  methods[38].selector = @selector(navigateWithPopBackStackWithNSString:withId:withASIFragment:);
  methods[39].selector = @selector(closeDialog);
  methods[40].selector = @selector(popBackStackWithASIFragment:);
  methods[41].selector = @selector(popBackStackWithASIFragment:withNSString:withBoolean:);
  methods[42].selector = @selector(executeSimpleCommandWithId:withASIFragment:);
  methods[43].selector = @selector(getScreenWidthDp);
  methods[44].selector = @selector(getScreenHeightDp);
  methods[45].selector = @selector(getExternalFilesDirWithId:);
  methods[46].selector = @selector(nativeGetExternalFilesDir);
  methods[47].selector = @selector(getMaxMemoryWithId:);
  methods[48].selector = @selector(decodeBitmapStreamWithJavaIoInputStream:withId:);
  methods[49].selector = @selector(runOnMainThreadWithJavaLangRunnable:);
  methods[50].selector = @selector(nativeRunOnMainThreadWithJavaLangRunnable:);
  methods[51].selector = @selector(enqueueTaskForEventLoopWithJavaLangRunnable:withLong:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "PLUGIN_NAME_CORE", "LNSString;", .constantValue.asLong = 0, 0x1a, -1, 51, -1, -1 },
    { "density", "I", .constantValue.asLong = 0, 0xa, -1, 52, -1, -1 },
    { "navigator", "LASUINavigatorImpl;", .constantValue.asLong = 0, 0xa, -1, 53, -1, -1 },
  };
  static const void *ptrTable[] = { "invoke", "LNSString;[LNSObject;", "getAssetMode", "LASIFragment;", "getDevServerIp", "getFileAsset", "LNSString;LASIFragment;", "LNSString;", "postDelayed", "LJavaLangRunnable;I", "scheduledTimerWithTimeInterval", "LJavaLangRunnable;F", "removeCallbacks", "LNSObject;LJavaLangRunnable;", "invalidateTimer", "LNSObject;", "putObjectToBundle", "LNSObject;LNSString;LNSObject;", "releaseNativeResources", "LJavaUtilList;", "(Ljava/util/List<Ljava/lang/Object;>;)V", "getFontMetrics", "getMaxAscent", "getAscent", "getDescent", "getMaxDescent", "getLeading", "createDrawable", "createAttributedString", "LASIFragment;LNSString;", "navigateAsTop", "LNSString;LNSObject;LASIFragment;", "navigate", "getScopedObjectArray", "(Ljava/lang/Object;)Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;", "navigateWithPopBackStackTo", "LNSString;LNSString;ZLNSObject;LASIFragment;", "navigateWithPopBackStack", "popBackStack", "LASIFragment;LNSString;Z", "executeSimpleCommand", "LNSObject;LASIFragment;", "getExternalFilesDir", "getMaxMemory", "decodeBitmapStream", "LJavaIoInputStream;LNSObject;", "runOnMainThread", "LJavaLangRunnable;", "nativeRunOnMainThread", "enqueueTaskForEventLoop", "LJavaLangRunnable;J", &ASCorePlugin_PLUGIN_NAME_CORE, &ASCorePlugin_density, &ASCorePlugin_navigator, "LASCorePlugin_MyBitmap;" };
  static const J2ObjcClassInfo _ASCorePlugin = { "CorePlugin", "com.ashera.core", ptrTable, methods, fields, 7, 0x1, 52, 3, -1, 54, -1, -1, -1 };
  return &_ASCorePlugin;
}

+ (void)initialize {
  if (self == [ASCorePlugin class]) {
    ASCorePlugin_navigator = new_ASUINavigatorImpl_init();
    J2OBJC_SET_INITIALIZED(ASCorePlugin)
  }
}

@end

void ASCorePlugin_init(ASCorePlugin *self) {
  NSObject_init(self);
}

ASCorePlugin *new_ASCorePlugin_init() {
  J2OBJC_NEW_IMPL(ASCorePlugin, init)
}

ASCorePlugin *create_ASCorePlugin_init() {
  J2OBJC_CREATE_IMPL(ASCorePlugin, init)
}

void ASCorePlugin_initPlugin() {
  ASCorePlugin_initialize();
  ASPluginManager_register__WithASIPlugin_(new_ASHtmlParserPlugin_init());
  ASPluginManager_register__WithASIPlugin_(new_ASCorePlugin_init());
}

NSString *ASCorePlugin_getFileAssetWithNSString_(NSString *path) {
  ASCorePlugin_initialize();
  NSError* error = nil;
  NSString *abspath = [[[NSBundle mainBundle] resourcePath] stringByAppendingPathComponent:path];
  NSString *res = [NSString stringWithContentsOfFile: abspath encoding:NSUTF8StringEncoding error: &error];
  return res;
}

id ASCorePlugin_scheduledTimerWithTimeIntervalWithJavaLangRunnable_withFloat_(ASCorePlugin *self, id<JavaLangRunnable> mTickRunnable, jfloat delay) {
  return 	[NSTimer scheduledTimerWithTimeInterval:delay
  target:self
  selector:@selector(onTick:)
  userInfo:mTickRunnable
  repeats:NO];
}

void ASCorePlugin_invalidateTimerWithId_(ASCorePlugin *self, id handler) {
  [((NSTimer*) handler) invalidate];
}

jfloat ASCorePlugin_getMaxAscentWithId_(ASCorePlugin *self, id fontObj) {
  UIFont* font = ((UIFont*) fontObj);
  return font.ascender;
}

jfloat ASCorePlugin_getAscentWithId_(ASCorePlugin *self, id fontObj) {
  UIFont* font = ((UIFont*) fontObj);
  return font.ascender;
}

jfloat ASCorePlugin_getDescentWithId_(ASCorePlugin *self, id fontObj) {
  UIFont* font = ((UIFont*) fontObj);
  return font.descender;
}

jfloat ASCorePlugin_getMaxDescentWithId_(ASCorePlugin *self, id fontObj) {
  UIFont* font = ((UIFont*) fontObj);
  return font.descender;
}

jfloat ASCorePlugin_getLeadingWithId_(ASCorePlugin *self, id fontObj) {
  UIFont* font = ((UIFont*) fontObj);
  return font.lineHeight + font.descender - font.ascender;
}

NSString *ASCorePlugin_getDeviceName(ASCorePlugin *self) {
  struct utsname systemInfo;
  uname(&systemInfo);
  
  return [NSString stringWithCString:systemInfo.machine
  encoding:NSUTF8StringEncoding];
}

void ASCorePlugin_navigateAsTopWithNSString_withId_withASIFragment_(NSString *actionId, id scopedObjects, id<ASIFragment> fragment) {
  ASCorePlugin_initialize();
  id<JavaUtilList> result = ASCorePlugin_getScopedObjectArrayWithId_(scopedObjects);
  [((ASUINavigatorImpl *) nil_chk(ASCorePlugin_navigator)) navigateAsTopWithNSString:actionId withJavaUtilList:result withASIFragment:fragment];
}

void ASCorePlugin_navigateWithNSString_withId_withASIFragment_(NSString *actionId, id scopedObjects, id<ASIFragment> fragment) {
  ASCorePlugin_initialize();
  id<JavaUtilList> result = ASCorePlugin_getScopedObjectArrayWithId_(scopedObjects);
  [((ASUINavigatorImpl *) nil_chk(ASCorePlugin_navigator)) navigateWithNSString:actionId withJavaUtilList:result withASIFragment:fragment];
}

id<JavaUtilList> ASCorePlugin_getScopedObjectArrayWithId_(id scopedObjects) {
  ASCorePlugin_initialize();
  IOSObjectArray *scopedObjectsArr = ASPluginInvoker_getArrayWithId_(scopedObjects);
  id<JavaUtilList> result = new_JavaUtilArrayList_init();
  {
    IOSObjectArray *a__ = scopedObjectsArr;
    id const *b__ = ((IOSObjectArray *) nil_chk(a__))->buffer_;
    id const *e__ = b__ + a__->size_;
    while (b__ < e__) {
      id map = *b__++;
      [result addWithId:ASPluginInvoker_getMapWithId_(map)];
    }
  }
  return result;
}

void ASCorePlugin_navigateWithPopBackStackToWithNSString_withNSString_withBoolean_withId_withASIFragment_(NSString *actionId, NSString *destinationId, jboolean inclusive, id scopedObjects, id<ASIFragment> fragment) {
  ASCorePlugin_initialize();
  id<JavaUtilList> result = ASCorePlugin_getScopedObjectArrayWithId_(scopedObjects);
  [((ASUINavigatorImpl *) nil_chk(ASCorePlugin_navigator)) navigateWithPopBackStackToWithNSString:actionId withNSString:destinationId withBoolean:inclusive withJavaUtilList:result withASIFragment:fragment];
}

void ASCorePlugin_navigateWithPopBackStackWithNSString_withId_withASIFragment_(NSString *actionId, id scopedObjects, id<ASIFragment> fragment) {
  ASCorePlugin_initialize();
  id<JavaUtilList> result = ASCorePlugin_getScopedObjectArrayWithId_(scopedObjects);
  [((ASUINavigatorImpl *) nil_chk(ASCorePlugin_navigator)) navigateWithPopBackStackWithNSString:actionId withJavaUtilList:result withASIFragment:fragment];
}

void ASCorePlugin_closeDialog() {
  ASCorePlugin_initialize();
  [((ASUINavigatorImpl *) nil_chk(ASCorePlugin_navigator)) closeDialog];
}

void ASCorePlugin_popBackStackWithASIFragment_(id<ASIFragment> fragment) {
  ASCorePlugin_initialize();
  [((ASUINavigatorImpl *) nil_chk(ASCorePlugin_navigator)) popBackStackWithASIFragment:fragment];
}

void ASCorePlugin_popBackStackWithASIFragment_withNSString_withBoolean_(id<ASIFragment> fragment, NSString *destinationId, jboolean inclusive) {
  ASCorePlugin_initialize();
  [((ASUINavigatorImpl *) nil_chk(ASCorePlugin_navigator)) popBackStackWithASIFragment:fragment withNSString:destinationId withBoolean:inclusive];
}

NSString *ASCorePlugin_executeSimpleCommandWithId_withASIFragment_(id commands, id<ASIFragment> fragment) {
  ASCorePlugin_initialize();
  IOSObjectArray *commandsArr = ASPluginInvoker_getArrayWithId_(commands);
  id<JavaUtilMap> resultMap = ASPluginInvoker_getJSONCompatMap();
  {
    IOSObjectArray *a__ = commandsArr;
    id const *b__ = ((IOSObjectArray *) nil_chk(a__))->buffer_;
    id const *e__ = b__ + a__->size_;
    while (b__ < e__) {
      id command = *b__++;
      IOSObjectArray *commandArr = ASPluginInvoker_getArrayWithId_(command);
      NSString *commandName = ASPluginInvoker_getStringWithId_(IOSObjectArray_Get(nil_chk(commandArr), 0));
      {
        IOSObjectArray *keys;
        switch (JreIndexOfStr(commandName, (id[]){ @"loadLocale" }, 1)) {
          case 0:
          keys = ASPluginInvoker_getArrayWithId_(IOSObjectArray_Get(commandArr, 1));
          if (keys != nil && keys->size_ > 0) {
            id<JavaUtilMap> localeMap = ASPluginInvoker_getJSONCompatMap();
            for (jint j = 0; j < keys->size_; j++) {
              NSString *key = ASPluginInvoker_getStringWithId_(IOSObjectArray_Get(keys, j));
              NSString *value = ASResourceBundleUtils_getStringWithNSString_withNSString_withNSString_withASIFragment_(@"values/strings", @"string", key, fragment);
              (void) [((id<JavaUtilMap>) nil_chk(localeMap)) putWithId:key withId:value];
            }
            ASPluginInvoker_putJSONSafeObjectIntoMapWithJavaUtilMap_withNSString_withId_(resultMap, commandName, localeMap);
          }
          break;
          default:
          break;
        }
      }
    }
  }
  return ASPluginInvoker_marshalWithId_(resultMap);
}

NSString *ASCorePlugin_nativeGetExternalFilesDir(ASCorePlugin *self) {
  NSArray *paths=NSSearchPathForDirectoriesInDomains(NSCachesDirectory,NSUserDomainMask, YES);
  NSString *directory = [paths objectAtIndex:0];
  return directory;
}

void ASCorePlugin_nativeRunOnMainThreadWithJavaLangRunnable_(ASCorePlugin *self, id<JavaLangRunnable> runnable) {
  dispatch_async(dispatch_get_main_queue(), ^{
    [runnable run];
  });
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASCorePlugin)

@implementation ASCorePlugin_MyBitmap

- (instancetype)initWithJavaIoInputStream:(JavaIoInputStream *)stream {
  ASCorePlugin_MyBitmap_initWithJavaIoInputStream_(self, stream);
  return self;
}

- (id)nativeGetImageWithByteArray:(IOSByteArray *)bytes {
  return ASCorePlugin_MyBitmap_nativeGetImageWithByteArray_(self, bytes);
}

- (jint)getRowBytes {
  return ASCorePlugin_MyBitmap_getImageWidthWithId_(image_) * 4;
}

+ (jint)getImageWidthWithId:(id)value {
  return ASCorePlugin_MyBitmap_getImageWidthWithId_(value);
}

+ (jint)getImageHeightWithId:(id)value {
  return ASCorePlugin_MyBitmap_getImageHeightWithId_(value);
}

- (jint)getHeight {
  return ASCorePlugin_MyBitmap_getImageHeightWithId_(image_);
}

- (id)getImage {
  return image_;
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, 0, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x102, 1, 2, -1, -1, -1, -1 },
    { NULL, "I", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x109, 3, 4, -1, -1, -1, -1 },
    { NULL, "I", 0x109, 5, 4, -1, -1, -1, -1 },
    { NULL, "I", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x1, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(initWithJavaIoInputStream:);
  methods[1].selector = @selector(nativeGetImageWithByteArray:);
  methods[2].selector = @selector(getRowBytes);
  methods[3].selector = @selector(getImageWidthWithId:);
  methods[4].selector = @selector(getImageHeightWithId:);
  methods[5].selector = @selector(getHeight);
  methods[6].selector = @selector(getImage);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "image_", "LNSObject;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "LJavaIoInputStream;", "nativeGetImage", "[B", "getImageWidth", "LNSObject;", "getImageHeight", "LASCorePlugin;" };
  static const J2ObjcClassInfo _ASCorePlugin_MyBitmap = { "MyBitmap", "com.ashera.core", ptrTable, methods, fields, 7, 0x1a, 7, 1, 6, -1, -1, -1, -1 };
  return &_ASCorePlugin_MyBitmap;
}

@end

void ASCorePlugin_MyBitmap_initWithJavaIoInputStream_(ASCorePlugin_MyBitmap *self, JavaIoInputStream *stream) {
  NSObject_init(self);
  IOSByteArray *bytes = ASFileUtils_readAllBytesWithJavaIoInputStream_(stream);
  self->image_ = ASCorePlugin_MyBitmap_nativeGetImageWithByteArray_(self, bytes);
}

ASCorePlugin_MyBitmap *new_ASCorePlugin_MyBitmap_initWithJavaIoInputStream_(JavaIoInputStream *stream) {
  J2OBJC_NEW_IMPL(ASCorePlugin_MyBitmap, initWithJavaIoInputStream_, stream)
}

ASCorePlugin_MyBitmap *create_ASCorePlugin_MyBitmap_initWithJavaIoInputStream_(JavaIoInputStream *stream) {
  J2OBJC_CREATE_IMPL(ASCorePlugin_MyBitmap, initWithJavaIoInputStream_, stream)
}

id ASCorePlugin_MyBitmap_nativeGetImageWithByteArray_(ASCorePlugin_MyBitmap *self, IOSByteArray *bytes) {
  NSData *data = [bytes toNSData];
  UIImage *image = [UIImage imageWithData:data];
  return image;
}

jint ASCorePlugin_MyBitmap_getImageWidthWithId_(id value) {
  ASCorePlugin_MyBitmap_initialize();
  UIImage* image = ((UIImage*) value);
  return image.size.width;
}

jint ASCorePlugin_MyBitmap_getImageHeightWithId_(id value) {
  ASCorePlugin_MyBitmap_initialize();
  UIImage* image = ((UIImage*) value);
  return image.size.height;
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASCorePlugin_MyBitmap)

@implementation ASCorePlugin_$Lambda$1

- (void)run {
  ASCorePlugin_nativeRunOnMainThreadWithJavaLangRunnable_(this$0_, val$runnable_);
}

@end

void ASCorePlugin_$Lambda$1_initWithASCorePlugin_withJavaLangRunnable_(ASCorePlugin_$Lambda$1 *self, ASCorePlugin *outer$, id<JavaLangRunnable> capture$0) {
  self->this$0_ = outer$;
  self->val$runnable_ = capture$0;
  NSObject_init(self);
}

ASCorePlugin_$Lambda$1 *new_ASCorePlugin_$Lambda$1_initWithASCorePlugin_withJavaLangRunnable_(ASCorePlugin *outer$, id<JavaLangRunnable> capture$0) {
  J2OBJC_NEW_IMPL(ASCorePlugin_$Lambda$1, initWithASCorePlugin_withJavaLangRunnable_, outer$, capture$0)
}

ASCorePlugin_$Lambda$1 *create_ASCorePlugin_$Lambda$1_initWithASCorePlugin_withJavaLangRunnable_(ASCorePlugin *outer$, id<JavaLangRunnable> capture$0) {
  J2OBJC_CREATE_IMPL(ASCorePlugin_$Lambda$1, initWithASCorePlugin_withJavaLangRunnable_, outer$, capture$0)
}
