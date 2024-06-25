//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\IOSCorePlugin\src\main\java\com\ashera\core\UINavigatorImpl.java
//

#include "Bundle.h"
#include "CommonConverters.h"
#include "ConverterFactory.h"
#include "DialogFragment.h"
#include "GenericFragment.h"
#include "IConverter.h"
#include "IFragment.h"
#include "IOSObjectArray.h"
#include "IWidget.h"
#include "J2ObjC_source.h"
#include "ResourceBundleUtils.h"
#include "UINavigatorImpl.h"
#include "java/io/PrintStream.h"
#include "java/lang/Exception.h"
#include "java/lang/Float.h"
#include "java/lang/Integer.h"
#include "java/lang/System.h"
#include "java/util/ArrayList.h"
#include "java/util/List.h"

#include <UIKit/UIKit.h>
#import "ASGenericFragmentController.h"
#import "ASDialogFragmentController.h"
#include "ASMainViewController.h"

@class JavaLangFloat;
@protocol JavaUtilList;


@interface ASUINavigatorImpl () {
 @public
  id navController_;
  ASUINavigatorImpl_FragmentFactory *fragmentFactory_;
  jboolean remeasure_;
}

- (NSString *)getFileNameWithNSStringArray:(IOSObjectArray *)destinationProps
                                   withInt:(jint)noofProps;

- (void)updateViewFrameWithId:(id)controller
                       withId:(id)obj;

- (void)navigateToDialogWithId:(id)rootFragment
                        withId:(id)backdropColor
                  withNSString:(NSString *)windowCloseOnTouchOutside
                  withNSString:(NSString *)backgroundDimEnabled;

- (id)getNavController;

- (id)getRootNavController;

- (void)navigateToControllerWithId:(id)rootFragment
                       withBoolean:(jboolean)finish
                       withBoolean:(jboolean)clear
                           withInt:(jint)popCount
                       withBoolean:(jboolean)remeasure;

- (id)getFragmentWithId:(id)presentedController;

- (void)closeDialogWithId:(id)presentedController;

- (id)getTopPresentedController;

- (void)getGenericFragmentsWithJavaUtilList:(id<JavaUtilList>)fragments;

@end

J2OBJC_FIELD_SETTER(ASUINavigatorImpl, navController_, id)
J2OBJC_FIELD_SETTER(ASUINavigatorImpl, fragmentFactory_, ASUINavigatorImpl_FragmentFactory *)

__attribute__((unused)) static NSString *ASUINavigatorImpl_getFileNameWithNSStringArray_withInt_(ASUINavigatorImpl *self, IOSObjectArray *destinationProps, jint noofProps);

__attribute__((unused)) static void ASUINavigatorImpl_updateViewFrameWithId_withId_(ASUINavigatorImpl *self, id controller, id obj);

__attribute__((unused)) static void ASUINavigatorImpl_navigateToDialogWithId_withId_withNSString_withNSString_(ASUINavigatorImpl *self, id rootFragment, id backdropColor, NSString *windowCloseOnTouchOutside, NSString *backgroundDimEnabled);

__attribute__((unused)) static id ASUINavigatorImpl_getNavController(ASUINavigatorImpl *self);

__attribute__((unused)) static id ASUINavigatorImpl_getRootNavController(ASUINavigatorImpl *self);

__attribute__((unused)) static void ASUINavigatorImpl_navigateToControllerWithId_withBoolean_withBoolean_withInt_withBoolean_(ASUINavigatorImpl *self, id rootFragment, jboolean finish, jboolean clear, jint popCount, jboolean remeasure);

__attribute__((unused)) static id ASUINavigatorImpl_getFragmentWithId_(ASUINavigatorImpl *self, id presentedController);

__attribute__((unused)) static void ASUINavigatorImpl_closeDialogWithId_(ASUINavigatorImpl *self, id presentedController);

__attribute__((unused)) static id ASUINavigatorImpl_getTopPresentedController(ASUINavigatorImpl *self);

__attribute__((unused)) static void ASUINavigatorImpl_getGenericFragmentsWithJavaUtilList_(ASUINavigatorImpl *self, id<JavaUtilList> fragments);

@interface ASUINavigatorImpl_IosDialogFragment : ASDialogFragment {
 @public
  __unsafe_unretained ASUINavigatorImpl *this$0_;
}

- (instancetype)initWithASUINavigatorImpl:(ASUINavigatorImpl *)outer$
                                   withId:(id)dialog
                                  withInt:(jint)layoutWidth
                                  withInt:(jint)layoutHeight
                        withJavaLangFloat:(JavaLangFloat *)marginPercent;

- (void)remeasure;

@end

J2OBJC_EMPTY_STATIC_INIT(ASUINavigatorImpl_IosDialogFragment)

__attribute__((unused)) static void ASUINavigatorImpl_IosDialogFragment_initWithASUINavigatorImpl_withId_withInt_withInt_withJavaLangFloat_(ASUINavigatorImpl_IosDialogFragment *self, ASUINavigatorImpl *outer$, id dialog, jint layoutWidth, jint layoutHeight, JavaLangFloat *marginPercent);

__attribute__((unused)) static ASUINavigatorImpl_IosDialogFragment *new_ASUINavigatorImpl_IosDialogFragment_initWithASUINavigatorImpl_withId_withInt_withInt_withJavaLangFloat_(ASUINavigatorImpl *outer$, id dialog, jint layoutWidth, jint layoutHeight, JavaLangFloat *marginPercent) NS_RETURNS_RETAINED;

__attribute__((unused)) static ASUINavigatorImpl_IosDialogFragment *create_ASUINavigatorImpl_IosDialogFragment_initWithASUINavigatorImpl_withId_withInt_withInt_withJavaLangFloat_(ASUINavigatorImpl *outer$, id dialog, jint layoutWidth, jint layoutHeight, JavaLangFloat *marginPercent);

J2OBJC_TYPE_LITERAL_HEADER(ASUINavigatorImpl_IosDialogFragment)

@interface ASUINavigatorImpl_FragmentFactory_MyFragment : ASGenericFragment

- (instancetype)init;

- (void)createChildFragments;

@end

J2OBJC_EMPTY_STATIC_INIT(ASUINavigatorImpl_FragmentFactory_MyFragment)

__attribute__((unused)) static void ASUINavigatorImpl_FragmentFactory_MyFragment_init(ASUINavigatorImpl_FragmentFactory_MyFragment *self);

__attribute__((unused)) static ASUINavigatorImpl_FragmentFactory_MyFragment *new_ASUINavigatorImpl_FragmentFactory_MyFragment_init(void) NS_RETURNS_RETAINED;

__attribute__((unused)) static ASUINavigatorImpl_FragmentFactory_MyFragment *create_ASUINavigatorImpl_FragmentFactory_MyFragment_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASUINavigatorImpl_FragmentFactory_MyFragment)

@implementation ASUINavigatorImpl

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASUINavigatorImpl_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (instancetype)initWithASUINavigatorImpl_FragmentFactory:(ASUINavigatorImpl_FragmentFactory *)fragmentFactory
                                                   withId:(id)navController
                                              withBoolean:(jboolean)remeasure {
  ASUINavigatorImpl_initWithASUINavigatorImpl_FragmentFactory_withId_withBoolean_(self, fragmentFactory, navController, remeasure);
  return self;
}

- (void)navigateWithNSString:(NSString *)actionId
                withNSString:(NSString *)destinationId
                 withBoolean:(jboolean)inclusive
                 withBoolean:(jboolean)finish
            withJavaUtilList:(id<JavaUtilList>)scopedObjects
             withASIFragment:(id<ASIFragment>)fragment {
  @try {
    jint popCount = 0;
    if (destinationId != nil) {
      popCount = [self getPopCountWithNSString:destinationId withBoolean:inclusive];
    }
    [self navigateWithNSString:actionId withJavaUtilList:scopedObjects withBoolean:finish withInt:popCount withBoolean:inclusive withASIFragment:fragment];
  }
  @catch (ASUINavigatorImpl_DestinatinNotFoundException *e) {
    [((JavaIoPrintStream *) nil_chk(JreLoadStatic(JavaLangSystem, out))) printlnWithNSString:[e getMessage]];
  }
}

- (void)navigateWithNSString:(NSString *)actionId
            withJavaUtilList:(id<JavaUtilList>)scopedObjects
             withASIFragment:(id<ASIFragment>)fragment {
  [self navigateWithNSString:actionId withJavaUtilList:scopedObjects withBoolean:false withInt:0 withBoolean:false withASIFragment:fragment];
}

- (void)navigateWithPopBackStackWithNSString:(NSString *)actionId
                            withJavaUtilList:(id<JavaUtilList>)scopedObjects
                             withASIFragment:(id<ASIFragment>)fragment {
  [self navigateWithNSString:actionId withJavaUtilList:scopedObjects withBoolean:true withInt:0 withBoolean:false withASIFragment:fragment];
}

- (void)navigateAsTopWithNSString:(NSString *)actionId
                 withJavaUtilList:(id<JavaUtilList>)scopedObjects
                  withASIFragment:(id<ASIFragment>)fragment {
  [self navigateWithNSString:actionId withJavaUtilList:scopedObjects withBoolean:false withInt:0 withBoolean:true withASIFragment:fragment];
}

- (void)navigateWithPopBackStackToWithNSString:(NSString *)actionId
                                  withNSString:(NSString *)destinationId
                                   withBoolean:(jboolean)inclusive
                              withJavaUtilList:(id<JavaUtilList>)scopedObjects
                               withASIFragment:(id<ASIFragment>)fragment {
  @try {
    jint popCount = [self getPopCountWithNSString:destinationId withBoolean:inclusive];
    [self navigateWithNSString:actionId withJavaUtilList:scopedObjects withBoolean:false withInt:popCount withBoolean:false withASIFragment:fragment];
  }
  @catch (ASUINavigatorImpl_DestinatinNotFoundException *e) {
    [((JavaIoPrintStream *) nil_chk(JreLoadStatic(JavaLangSystem, out))) printlnWithNSString:[e getMessage]];
  }
}

- (void)navigateWithNSString:(NSString *)actionId
            withJavaUtilList:(id<JavaUtilList>)scopedObjects
                 withBoolean:(jboolean)finish
                     withInt:(jint)popCount
                 withBoolean:(jboolean)clear
             withASIFragment:(id<ASIFragment>)fragment {
  IOSObjectArray *destinationProps = [((NSString *) nil_chk(actionId)) java_split:@"#" limit:-1];
  NSString *type = IOSObjectArray_Get(nil_chk(destinationProps), 0);
  NSString *resId = IOSObjectArray_Get(destinationProps, 1);
  switch (JreIndexOfStr(type, (id[]){ @"dialog" }, 1)) {
    case 0:
    {
      NSString *fileName = ASUINavigatorImpl_getFileNameWithNSStringArray_withInt_(self, destinationProps, 3);
      jint width = [((JavaLangInteger *) nil_chk((JavaLangInteger *) cast_chk([((id<ASIConverter>) nil_chk(ASConverterFactory_getWithNSString_(ASCommonConverters_dimension))) convertFromWithId:IOSObjectArray_Get(destinationProps, destinationProps->size_ - 3) withJavaUtilMap:nil withASIFragment:fragment], [JavaLangInteger class]))) intValue];
      jint height = [((JavaLangInteger *) nil_chk((JavaLangInteger *) cast_chk([((id<ASIConverter>) nil_chk(ASConverterFactory_getWithNSString_(ASCommonConverters_dimension))) convertFromWithId:IOSObjectArray_Get(destinationProps, destinationProps->size_ - 2) withJavaUtilMap:nil withASIFragment:fragment], [JavaLangInteger class]))) intValue];
      NSString *style = IOSObjectArray_Get(destinationProps, destinationProps->size_ - 1);
      if (style != nil) {
        style = [style java_replace:@"@style/" withSequence:@""];
      }
      NSString *attrStr = ASResourceBundleUtils_getStringWithNSString_withNSString_withASIFragment_(@"values/theme", [((NSString *) nil_chk(style)) java_replace:@"@style/" withSequence:@""], fragment);
      id backdropColor = nil;
      JavaLangFloat *marginPercent = nil;
      NSString *windowCloseOnTouchOutside = nil;
      NSString *backgroundDimEnabled = nil;
      if (attrStr != nil && ![attrStr java_isEmpty]) {
        IOSObjectArray *attrs = [attrStr java_split:@";"];
        {
          IOSObjectArray *a__ = attrs;
          NSString * const *b__ = ((IOSObjectArray *) nil_chk(a__))->buffer_;
          NSString * const *e__ = b__ + a__->size_;
          while (b__ < e__) {
            NSString *attr = *b__++;
            IOSObjectArray *nameAndValue = [((NSString *) nil_chk(attr)) java_split:@"\\:"];
            NSString *key = IOSObjectArray_Get(nil_chk(nameAndValue), 0);
            NSString *value = nameAndValue->size_ <= 1 ? @"" : IOSObjectArray_Get(nameAndValue, 1);
            if ([((NSString *) nil_chk(key)) isEqual:@"marginPercent"]) {
              marginPercent = (JavaLangFloat *) cast_chk([((id<ASIConverter>) nil_chk(ASConverterFactory_getWithNSString_(ASCommonConverters_floatconverter))) convertFromWithId:value withJavaUtilMap:nil withASIFragment:fragment], [JavaLangFloat class]);
            }
            if ([key isEqual:@"backdropColor"]) {
              backdropColor = [((id<ASIConverter>) nil_chk(ASConverterFactory_getWithNSString_(@"color"))) convertFromWithId:value withJavaUtilMap:nil withASIFragment:fragment];
            }
            if ([key isEqual:@"windowCloseOnTouchOutside"]) {
              windowCloseOnTouchOutside = value;
            }
            if ([key isEqual:@"backgroundDimEnabled"]) {
              backgroundDimEnabled = value;
            }
          }
        }
      }
      ASDialogFragment *dialogFragment = new_ASUINavigatorImpl_IosDialogFragment_initWithASUINavigatorImpl_withId_withInt_withInt_withJavaLangFloat_(self, nil, width, height, marginPercent);
      [dialogFragment setArgumentsWithADBundle:ASGenericFragment_getInitialBundleWithNSString_withNSString_withJavaUtilList_(resId, fileName, scopedObjects)];
      ASUINavigatorImpl_navigateToDialogWithId_withId_withNSString_withNSString_(self, dialogFragment, backdropColor, windowCloseOnTouchOutside, backgroundDimEnabled);
      break;
    }
    default:
    {
      NSString *fileName = ASUINavigatorImpl_getFileNameWithNSStringArray_withInt_(self, destinationProps, 0);
      ASGenericFragment *genericFragment = [((ASUINavigatorImpl_FragmentFactory *) nil_chk(self->fragmentFactory_)) getFragment];
      [((ASGenericFragment *) nil_chk(genericFragment)) setArgumentsWithADBundle:ASGenericFragment_getInitialBundleWithNSString_withNSString_withJavaUtilList_(resId, fileName, scopedObjects)];
      ASUINavigatorImpl_navigateToControllerWithId_withBoolean_withBoolean_withInt_withBoolean_(self, genericFragment, finish, clear, popCount, self->remeasure_);
      break;
    }
  }
}

- (NSString *)getFileNameWithNSStringArray:(IOSObjectArray *)destinationProps
                                   withInt:(jint)noofProps {
  return ASUINavigatorImpl_getFileNameWithNSStringArray_withInt_(self, destinationProps, noofProps);
}

- (void)updateViewFrameWithId:(id)controller
                       withId:(id)obj {
  ASUINavigatorImpl_updateViewFrameWithId_withId_(self, controller, obj);
}

- (void)navigateToDialogWithId:(id)rootFragment
                        withId:(id)backdropColor
                  withNSString:(NSString *)windowCloseOnTouchOutside
                  withNSString:(NSString *)backgroundDimEnabled {
  ASUINavigatorImpl_navigateToDialogWithId_withId_withNSString_withNSString_(self, rootFragment, backdropColor, windowCloseOnTouchOutside, backgroundDimEnabled);
}

- (id)getNavController {
  return ASUINavigatorImpl_getNavController(self);
}

- (id)getRootNavController {
  return ASUINavigatorImpl_getRootNavController(self);
}

- (void)navigateToControllerWithId:(id)rootFragment
                       withBoolean:(jboolean)finish
                       withBoolean:(jboolean)clear
                           withInt:(jint)popCount
                       withBoolean:(jboolean)remeasure {
  ASUINavigatorImpl_navigateToControllerWithId_withBoolean_withBoolean_withInt_withBoolean_(self, rootFragment, finish, clear, popCount, remeasure);
}

- (void)closeDialogWithASIFragment:(id<ASIFragment>)fragment {
  [self closeDialog];
}

- (void)closeDialog {
  id presentedController = ASUINavigatorImpl_getTopPresentedController(self);
  ASUINavigatorImpl_closeDialogWithId_(self, presentedController);
}

- (id)getFragmentWithId:(id)presentedController {
  return ASUINavigatorImpl_getFragmentWithId_(self, presentedController);
}

- (void)closeDialogWithId:(id)presentedController {
  ASUINavigatorImpl_closeDialogWithId_(self, presentedController);
}

- (id)getTopPresentedController {
  return ASUINavigatorImpl_getTopPresentedController(self);
}

- (void)popBackStackWithASIFragment:(id<ASIFragment>)fragment {
  ASUINavigatorImpl_navigateToControllerWithId_withBoolean_withBoolean_withInt_withBoolean_(self, nil, true, false, 0, self->remeasure_);
}

- (void)getGenericFragmentsWithJavaUtilList:(id<JavaUtilList>)fragments {
  ASUINavigatorImpl_getGenericFragmentsWithJavaUtilList_(self, fragments);
}

- (void)popBackStackWithASIFragment:(id<ASIFragment>)fragment
                       withNSString:(NSString *)destinationId
                        withBoolean:(jboolean)inclusive {
  @try {
    jint popCount = [self getPopCountWithNSString:destinationId withBoolean:inclusive];
    ASUINavigatorImpl_navigateToControllerWithId_withBoolean_withBoolean_withInt_withBoolean_(self, nil, false, false, popCount, self->remeasure_);
  }
  @catch (ASUINavigatorImpl_DestinatinNotFoundException *e) {
    [((JavaIoPrintStream *) nil_chk(JreLoadStatic(JavaLangSystem, out))) printlnWithNSString:[e getMessage]];
  }
}

- (jint)getPopCountWithNSString:(NSString *)destinationId
                    withBoolean:(jboolean)inclusive {
  id<JavaUtilList> fragments = new_JavaUtilArrayList_init();
  ASUINavigatorImpl_getGenericFragmentsWithJavaUtilList_(self, fragments);
  jboolean foundDestination = false;
  jint popCount = 0;
  for (jint i = [fragments size] - 1; i >= 0; i--) {
    ASGenericFragment *genericFragment = [fragments getWithInt:i];
    NSString *id_ = [((ADBundle *) nil_chk(((ADBundle *) cast_chk([((ASGenericFragment *) nil_chk(genericFragment)) getArgumentsBundle], [ADBundle class])))) getStringWithNSString:@"id"];
    if ([((NSString *) nil_chk(id_)) isEqual:destinationId]) {
      foundDestination = true;
      if (inclusive) {
        popCount++;
      }
      break;
    }
    popCount++;
  }
  if (!foundDestination) {
    @throw new_ASUINavigatorImpl_DestinatinNotFoundException_initWithASUINavigatorImpl_withNSString_(self, JreStrcat("$$$", @"Ignoring popBackStack to destination ", destinationId, @" as it was not found on the current back stack"));
  }
  return popCount;
}

- (id<ASIFragment>)getActiveFragmentWithASIFragment:(id<ASIFragment>)fragment {
  id<JavaUtilList> fragments = new_JavaUtilArrayList_init();
  ASUINavigatorImpl_getGenericFragmentsWithJavaUtilList_(self, fragments);
  return [fragments getWithInt:[fragments size] - 1];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, NULL, 0x1, -1, 0, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 1, 2, -1, 3, -1, -1 },
    { NULL, "V", 0x1, 1, 4, -1, 5, -1, -1 },
    { NULL, "V", 0x1, 6, 4, -1, 5, -1, -1 },
    { NULL, "V", 0x1, 7, 4, -1, 5, -1, -1 },
    { NULL, "V", 0x1, 8, 9, -1, 10, -1, -1 },
    { NULL, "V", 0x1, 1, 11, -1, 12, -1, -1 },
    { NULL, "LNSString;", 0x2, 13, 14, -1, -1, -1, -1 },
    { NULL, "V", 0x102, 15, 16, -1, -1, -1, -1 },
    { NULL, "V", 0x102, 17, 18, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x2, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x102, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x102, 19, 20, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 21, 22, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x102, 23, 24, -1, -1, -1, -1 },
    { NULL, "V", 0x102, 21, 24, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x102, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 25, 22, -1, -1, -1, -1 },
    { NULL, "V", 0x102, 26, 27, -1, 28, -1, -1 },
    { NULL, "V", 0x1, 25, 29, -1, -1, -1, -1 },
    { NULL, "I", 0x1, 30, 31, 32, -1, -1, -1 },
    { NULL, "LASIFragment;", 0x1, 33, 22, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(initWithASUINavigatorImpl_FragmentFactory:withId:withBoolean:);
  methods[2].selector = @selector(navigateWithNSString:withNSString:withBoolean:withBoolean:withJavaUtilList:withASIFragment:);
  methods[3].selector = @selector(navigateWithNSString:withJavaUtilList:withASIFragment:);
  methods[4].selector = @selector(navigateWithPopBackStackWithNSString:withJavaUtilList:withASIFragment:);
  methods[5].selector = @selector(navigateAsTopWithNSString:withJavaUtilList:withASIFragment:);
  methods[6].selector = @selector(navigateWithPopBackStackToWithNSString:withNSString:withBoolean:withJavaUtilList:withASIFragment:);
  methods[7].selector = @selector(navigateWithNSString:withJavaUtilList:withBoolean:withInt:withBoolean:withASIFragment:);
  methods[8].selector = @selector(getFileNameWithNSStringArray:withInt:);
  methods[9].selector = @selector(updateViewFrameWithId:withId:);
  methods[10].selector = @selector(navigateToDialogWithId:withId:withNSString:withNSString:);
  methods[11].selector = @selector(getNavController);
  methods[12].selector = @selector(getRootNavController);
  methods[13].selector = @selector(navigateToControllerWithId:withBoolean:withBoolean:withInt:withBoolean:);
  methods[14].selector = @selector(closeDialogWithASIFragment:);
  methods[15].selector = @selector(closeDialog);
  methods[16].selector = @selector(getFragmentWithId:);
  methods[17].selector = @selector(closeDialogWithId:);
  methods[18].selector = @selector(getTopPresentedController);
  methods[19].selector = @selector(popBackStackWithASIFragment:);
  methods[20].selector = @selector(getGenericFragmentsWithJavaUtilList:);
  methods[21].selector = @selector(popBackStackWithASIFragment:withNSString:withBoolean:);
  methods[22].selector = @selector(getPopCountWithNSString:withBoolean:);
  methods[23].selector = @selector(getActiveFragmentWithASIFragment:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "navController_", "LNSObject;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "fragmentFactory_", "LASUINavigatorImpl_FragmentFactory;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "remeasure_", "Z", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "LASUINavigatorImpl_FragmentFactory;LNSObject;Z", "navigate", "LNSString;LNSString;ZZLJavaUtilList;LASIFragment;", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;Lcom/ashera/core/IFragment;)V", "LNSString;LJavaUtilList;LASIFragment;", "(Ljava/lang/String;Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;Lcom/ashera/core/IFragment;)V", "navigateWithPopBackStack", "navigateAsTop", "navigateWithPopBackStackTo", "LNSString;LNSString;ZLJavaUtilList;LASIFragment;", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;Lcom/ashera/core/IFragment;)V", "LNSString;LJavaUtilList;ZIZLASIFragment;", "(Ljava/lang/String;Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;ZIZLcom/ashera/core/IFragment;)V", "getFileName", "[LNSString;I", "updateViewFrame", "LNSObject;LNSObject;", "navigateToDialog", "LNSObject;LNSObject;LNSString;LNSString;", "navigateToController", "LNSObject;ZZIZ", "closeDialog", "LASIFragment;", "getFragment", "LNSObject;", "popBackStack", "getGenericFragments", "LJavaUtilList;", "(Ljava/util/List<Lcom/ashera/core/GenericFragment;>;)V", "LASIFragment;LNSString;Z", "getPopCount", "LNSString;Z", "LASUINavigatorImpl_DestinatinNotFoundException;", "getActiveFragment", "LASUINavigatorImpl_IosDialogFragment;LASUINavigatorImpl_DestinatinNotFoundException;LASUINavigatorImpl_FragmentFactory;" };
  static const J2ObjcClassInfo _ASUINavigatorImpl = { "UINavigatorImpl", "com.ashera.core", ptrTable, methods, fields, 7, 0x1, 24, 3, -1, 34, -1, -1, -1 };
  return &_ASUINavigatorImpl;
}

@end

void ASUINavigatorImpl_init(ASUINavigatorImpl *self) {
  NSObject_init(self);
  self->remeasure_ = true;
  self->fragmentFactory_ = new_ASUINavigatorImpl_FragmentFactory_init();
}

ASUINavigatorImpl *new_ASUINavigatorImpl_init() {
  J2OBJC_NEW_IMPL(ASUINavigatorImpl, init)
}

ASUINavigatorImpl *create_ASUINavigatorImpl_init() {
  J2OBJC_CREATE_IMPL(ASUINavigatorImpl, init)
}

void ASUINavigatorImpl_initWithASUINavigatorImpl_FragmentFactory_withId_withBoolean_(ASUINavigatorImpl *self, ASUINavigatorImpl_FragmentFactory *fragmentFactory, id navController, jboolean remeasure) {
  NSObject_init(self);
  self->remeasure_ = true;
  self->navController_ = navController;
  self->fragmentFactory_ = fragmentFactory;
  self->remeasure_ = remeasure;
}

ASUINavigatorImpl *new_ASUINavigatorImpl_initWithASUINavigatorImpl_FragmentFactory_withId_withBoolean_(ASUINavigatorImpl_FragmentFactory *fragmentFactory, id navController, jboolean remeasure) {
  J2OBJC_NEW_IMPL(ASUINavigatorImpl, initWithASUINavigatorImpl_FragmentFactory_withId_withBoolean_, fragmentFactory, navController, remeasure)
}

ASUINavigatorImpl *create_ASUINavigatorImpl_initWithASUINavigatorImpl_FragmentFactory_withId_withBoolean_(ASUINavigatorImpl_FragmentFactory *fragmentFactory, id navController, jboolean remeasure) {
  J2OBJC_CREATE_IMPL(ASUINavigatorImpl, initWithASUINavigatorImpl_FragmentFactory_withId_withBoolean_, fragmentFactory, navController, remeasure)
}

NSString *ASUINavigatorImpl_getFileNameWithNSStringArray_withInt_(ASUINavigatorImpl *self, IOSObjectArray *destinationProps, jint noofProps) {
  NSString *fileName = @"";
  NSString *separator = @"";
  for (jint i = 2; i < ((IOSObjectArray *) nil_chk(destinationProps))->size_ - noofProps; i++) {
    NSString *destinationProp = IOSObjectArray_Get(destinationProps, i);
    (void) JreStrAppendStrong(&fileName, "$$", separator, destinationProp);
    separator = @"#";
  }
  return fileName;
}

void ASUINavigatorImpl_updateViewFrameWithId_withId_(ASUINavigatorImpl *self, id controller, id obj) {
  UIView* uiview = (UIView*) obj;
  UINavigationController* currentController =  (UINavigationController*) controller;
  [uiview setFrame:CGRectMake((currentController.view.frame.size.width-uiview.frame.size.width)/2, (currentController.view.frame.size.height-uiview.frame.size.height)/2, uiview.frame.size.width, uiview.frame.size.height)];
}

void ASUINavigatorImpl_navigateToDialogWithId_withId_withNSString_withNSString_(ASUINavigatorImpl *self, id rootFragment, id backdropColor, NSString *windowCloseOnTouchOutside, NSString *backgroundDimEnabled) {
  ASMainViewController* mainViewController = (ASMainViewController*) [UIApplication sharedApplication].delegate.window.rootViewController;
  UIViewController* presentedController = [self getTopPresentedController];
  ASDialogFragmentController* v = [ASDialogFragmentController new];
  v.backdropColor = (UIColor*)backdropColor;
  v.windowCloseOnTouchOutside = windowCloseOnTouchOutside;
  v.backgroundDimEnabled = backgroundDimEnabled;
  v.modalPresentationStyle = UIModalPresentationOverFullScreen;
  v.rootFragment = rootFragment;
  v.cordovaActivity = mainViewController.cordovaActivity;
  [presentedController presentViewController:v animated:YES completion:nil];
}

id ASUINavigatorImpl_getNavController(ASUINavigatorImpl *self) {
  if (self->navController_ != nil) {
    return self->navController_;
  }
  else {
    return ASUINavigatorImpl_getRootNavController(self);
  }
}

id ASUINavigatorImpl_getRootNavController(ASUINavigatorImpl *self) {
  ASMainViewController* mainViewController = (ASMainViewController*) [UIApplication sharedApplication].delegate.window.rootViewController;
  UINavigationController* navController =  (UINavigationController*) mainViewController.navController;
  return navController;
}

void ASUINavigatorImpl_navigateToControllerWithId_withBoolean_withBoolean_withInt_withBoolean_(ASUINavigatorImpl *self, id rootFragment, jboolean finish, jboolean clear, jint popCount, jboolean remeasure) {
  ASMainViewController* mainViewController = (ASMainViewController*) [UIApplication sharedApplication].delegate.window.rootViewController;
  UINavigationController* navController =  (UINavigationController*) [self getNavController];
  NSMutableArray *viewControllers = [NSMutableArray arrayWithArray:[navController viewControllers]];
  
  if (finish) {
    [viewControllers removeLastObject];
  }
  if (clear) {
    [viewControllers removeAllObjects];
  }
  if (popCount > 0) {
    for (NSUInteger i = 0; i < popCount; i++) {
      [viewControllers removeLastObject];
    }
  }
  
  if (rootFragment != nil) {
    ASGenericFragmentController* v = [ASGenericFragmentController new];
    v.rootFragment = rootFragment;
    v.remeasure_ = remeasure;
    v.cordovaActivity = mainViewController.cordovaActivity;
    [viewControllers addObject:v];
  }
  
  [CATransaction begin];
  [navController setViewControllers:viewControllers animated:YES];
  [CATransaction commit];
}

id ASUINavigatorImpl_getFragmentWithId_(ASUINavigatorImpl *self, id presentedController) {
  if ([presentedController class] == [ASDialogFragmentController class]) {
    ASDialogFragmentController* presentedViewController = (ASDialogFragmentController*) presentedController;
    return presentedViewController.rootFragment;
  }
  return nil;
}

void ASUINavigatorImpl_closeDialogWithId_(ASUINavigatorImpl *self, id presentedController) {
  if ([presentedController class] == [ASDialogFragmentController class]) {
    ASDialogFragmentController* presentedViewController = (ASDialogFragmentController*) presentedController;
    [presentedViewController dismiss];
  }
}

id ASUINavigatorImpl_getTopPresentedController(ASUINavigatorImpl *self) {
  ASMainViewController* mainViewController = (ASMainViewController*) [UIApplication sharedApplication].delegate.window.rootViewController;
  UIViewController* presentedController = mainViewController;
  
  while (presentedController.presentedViewController != nil) {
    presentedController = presentedController.presentedViewController;
  }
  
  return presentedController;
}

void ASUINavigatorImpl_getGenericFragmentsWithJavaUtilList_(ASUINavigatorImpl *self, id<JavaUtilList> fragments) {
  UINavigationController* navController =  (UINavigationController*) [self getNavController];
  NSMutableArray *viewControllers = [NSMutableArray arrayWithArray:[navController viewControllers]];
  
  for (UIViewController *vc in viewControllers) {
    if ([vc isKindOfClass:[ASGenericFragmentController class]]) {
      [fragments addWithId: ((ASGenericFragmentController*) vc).rootFragment];
    }
  }
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASUINavigatorImpl)

@implementation ASUINavigatorImpl_IosDialogFragment

- (instancetype)initWithASUINavigatorImpl:(ASUINavigatorImpl *)outer$
                                   withId:(id)dialog
                                  withInt:(jint)layoutWidth
                                  withInt:(jint)layoutHeight
                        withJavaLangFloat:(JavaLangFloat *)marginPercent {
  ASUINavigatorImpl_IosDialogFragment_initWithASUINavigatorImpl_withId_withInt_withInt_withJavaLangFloat_(self, outer$, dialog, layoutWidth, layoutHeight, marginPercent);
  return self;
}

- (void)remeasure {
  [super remeasure];
  if (![self isMeasuring]) {
    id uiview = [((id<ASIWidget>) nil_chk([self getRootWidget])) asNativeWidget];
    ASUINavigatorImpl_updateViewFrameWithId_withId_(this$0_, ASUINavigatorImpl_getTopPresentedController(this$0_), uiview);
  }
}

- (void)__javaClone:(ASUINavigatorImpl_IosDialogFragment *)original {
  [super __javaClone:original];
  JreRelease(this$0_);
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x2, -1, 0, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(initWithASUINavigatorImpl:withId:withInt:withInt:withJavaLangFloat:);
  methods[1].selector = @selector(remeasure);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "this$0_", "LASUINavigatorImpl;", .constantValue.asLong = 0, 0x1012, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "LASUINavigatorImpl;LNSObject;IILJavaLangFloat;", "LASUINavigatorImpl;" };
  static const J2ObjcClassInfo _ASUINavigatorImpl_IosDialogFragment = { "IosDialogFragment", "com.ashera.core", ptrTable, methods, fields, 7, 0x12, 2, 1, 1, -1, -1, -1, -1 };
  return &_ASUINavigatorImpl_IosDialogFragment;
}

@end

void ASUINavigatorImpl_IosDialogFragment_initWithASUINavigatorImpl_withId_withInt_withInt_withJavaLangFloat_(ASUINavigatorImpl_IosDialogFragment *self, ASUINavigatorImpl *outer$, id dialog, jint layoutWidth, jint layoutHeight, JavaLangFloat *marginPercent) {
  self->this$0_ = outer$;
  ASDialogFragment_initWithId_withInt_withInt_withJavaLangFloat_(self, dialog, layoutWidth, layoutHeight, marginPercent);
}

ASUINavigatorImpl_IosDialogFragment *new_ASUINavigatorImpl_IosDialogFragment_initWithASUINavigatorImpl_withId_withInt_withInt_withJavaLangFloat_(ASUINavigatorImpl *outer$, id dialog, jint layoutWidth, jint layoutHeight, JavaLangFloat *marginPercent) {
  J2OBJC_NEW_IMPL(ASUINavigatorImpl_IosDialogFragment, initWithASUINavigatorImpl_withId_withInt_withInt_withJavaLangFloat_, outer$, dialog, layoutWidth, layoutHeight, marginPercent)
}

ASUINavigatorImpl_IosDialogFragment *create_ASUINavigatorImpl_IosDialogFragment_initWithASUINavigatorImpl_withId_withInt_withInt_withJavaLangFloat_(ASUINavigatorImpl *outer$, id dialog, jint layoutWidth, jint layoutHeight, JavaLangFloat *marginPercent) {
  J2OBJC_CREATE_IMPL(ASUINavigatorImpl_IosDialogFragment, initWithASUINavigatorImpl_withId_withInt_withInt_withJavaLangFloat_, outer$, dialog, layoutWidth, layoutHeight, marginPercent)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASUINavigatorImpl_IosDialogFragment)

@implementation ASUINavigatorImpl_DestinatinNotFoundException

- (instancetype)initWithASUINavigatorImpl:(ASUINavigatorImpl *)outer$
                             withNSString:(NSString *)message {
  ASUINavigatorImpl_DestinatinNotFoundException_initWithASUINavigatorImpl_withNSString_(self, outer$, message);
  return self;
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, 0, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(initWithASUINavigatorImpl:withNSString:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "LASUINavigatorImpl;LNSString;", "LASUINavigatorImpl;" };
  static const J2ObjcClassInfo _ASUINavigatorImpl_DestinatinNotFoundException = { "DestinatinNotFoundException", "com.ashera.core", ptrTable, methods, NULL, 7, 0x0, 1, 0, 1, -1, -1, -1, -1 };
  return &_ASUINavigatorImpl_DestinatinNotFoundException;
}

@end

void ASUINavigatorImpl_DestinatinNotFoundException_initWithASUINavigatorImpl_withNSString_(ASUINavigatorImpl_DestinatinNotFoundException *self, ASUINavigatorImpl *outer$, NSString *message) {
  JavaLangException_initWithNSString_(self, message);
}

ASUINavigatorImpl_DestinatinNotFoundException *new_ASUINavigatorImpl_DestinatinNotFoundException_initWithASUINavigatorImpl_withNSString_(ASUINavigatorImpl *outer$, NSString *message) {
  J2OBJC_NEW_IMPL(ASUINavigatorImpl_DestinatinNotFoundException, initWithASUINavigatorImpl_withNSString_, outer$, message)
}

ASUINavigatorImpl_DestinatinNotFoundException *create_ASUINavigatorImpl_DestinatinNotFoundException_initWithASUINavigatorImpl_withNSString_(ASUINavigatorImpl *outer$, NSString *message) {
  J2OBJC_CREATE_IMPL(ASUINavigatorImpl_DestinatinNotFoundException, initWithASUINavigatorImpl_withNSString_, outer$, message)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASUINavigatorImpl_DestinatinNotFoundException)

@implementation ASUINavigatorImpl_FragmentFactory

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASUINavigatorImpl_FragmentFactory_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (ASGenericFragment *)getFragment {
  return new_ASUINavigatorImpl_FragmentFactory_MyFragment_init();
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LASGenericFragment;", 0x1, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(getFragment);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "LASUINavigatorImpl;", "LASUINavigatorImpl_FragmentFactory_MyFragment;" };
  static const J2ObjcClassInfo _ASUINavigatorImpl_FragmentFactory = { "FragmentFactory", "com.ashera.core", ptrTable, methods, NULL, 7, 0x9, 2, 0, 0, 1, -1, -1, -1 };
  return &_ASUINavigatorImpl_FragmentFactory;
}

@end

void ASUINavigatorImpl_FragmentFactory_init(ASUINavigatorImpl_FragmentFactory *self) {
  NSObject_init(self);
}

ASUINavigatorImpl_FragmentFactory *new_ASUINavigatorImpl_FragmentFactory_init() {
  J2OBJC_NEW_IMPL(ASUINavigatorImpl_FragmentFactory, init)
}

ASUINavigatorImpl_FragmentFactory *create_ASUINavigatorImpl_FragmentFactory_init() {
  J2OBJC_CREATE_IMPL(ASUINavigatorImpl_FragmentFactory, init)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASUINavigatorImpl_FragmentFactory)

@implementation ASUINavigatorImpl_FragmentFactory_MyFragment

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASUINavigatorImpl_FragmentFactory_MyFragment_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (void)createChildFragments {
  [self executePendingTransactions];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x2, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(createChildFragments);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "LASUINavigatorImpl_FragmentFactory;" };
  static const J2ObjcClassInfo _ASUINavigatorImpl_FragmentFactory_MyFragment = { "MyFragment", "com.ashera.core", ptrTable, methods, NULL, 7, 0xa, 2, 0, 0, -1, -1, -1, -1 };
  return &_ASUINavigatorImpl_FragmentFactory_MyFragment;
}

@end

void ASUINavigatorImpl_FragmentFactory_MyFragment_init(ASUINavigatorImpl_FragmentFactory_MyFragment *self) {
  ASGenericFragment_init(self);
}

ASUINavigatorImpl_FragmentFactory_MyFragment *new_ASUINavigatorImpl_FragmentFactory_MyFragment_init() {
  J2OBJC_NEW_IMPL(ASUINavigatorImpl_FragmentFactory_MyFragment, init)
}

ASUINavigatorImpl_FragmentFactory_MyFragment *create_ASUINavigatorImpl_FragmentFactory_MyFragment_init() {
  J2OBJC_CREATE_IMPL(ASUINavigatorImpl_FragmentFactory_MyFragment, init)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASUINavigatorImpl_FragmentFactory_MyFragment)
