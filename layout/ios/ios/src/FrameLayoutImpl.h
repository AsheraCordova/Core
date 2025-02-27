//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\ios_widget_library\src\main\java\com\ashera\layout\FrameLayoutImpl.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_FrameLayoutImpl")
#ifdef RESTRICT_FrameLayoutImpl
#define INCLUDE_ALL_FrameLayoutImpl 0
#else
#define INCLUDE_ALL_FrameLayoutImpl 1
#endif
#undef RESTRICT_FrameLayoutImpl

#if !defined (ASFrameLayoutImpl_) && (INCLUDE_ALL_FrameLayoutImpl || defined(INCLUDE_ASFrameLayoutImpl))
#define ASFrameLayoutImpl_

#define RESTRICT_BaseHasWidgets 1
#define INCLUDE_ASBaseHasWidgets 1
#include "BaseHasWidgets.h"

@class ASWidgetAttribute;
@class IOSClass;
@protocol ASIFragment;
@protocol ASILifeCycleDecorator;
@protocol ASIWidget;
@protocol JavaUtilMap;

@interface ASFrameLayoutImpl : ASBaseHasWidgets
@property id uiView;

#pragma mark Public

- (instancetype)init;

- (instancetype)initWithNSString:(NSString *)localname;

- (instancetype)initWithNSString:(NSString *)groupName
                    withNSString:(NSString *)localname;

- (void)addWithASIWidget:(id<ASIWidget>)w
                 withInt:(jint)index;

- (id)asNativeWidget;

- (id)asWidget;

- (jboolean)checkIosVersionWithNSString:(NSString *)v;

- (void)createWithASIFragment:(id<ASIFragment>)fragment
              withJavaUtilMap:(id<JavaUtilMap>)params;

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
              withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (id)getChildAttributeWithASIWidget:(id<ASIWidget>)w
               withASWidgetAttribute:(ASWidgetAttribute *)key;

- (IOSClass *)getViewClass;

- (void)invalidate;

- (void)loadAttributesWithNSString:(NSString *)localName;

- (void)nativeCreateWithJavaUtilMap:(id<JavaUtilMap>)params;

- (id<ASIWidget>)newInstance OBJC_METHOD_FAMILY_NONE;

- (jboolean)removeWithInt:(jint)index;

- (jboolean)removeWithASIWidget:(id<ASIWidget>)w;

- (void)requestLayout;

- (void)setAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
                             withNSString:(NSString *)strValue
                                   withId:(id)objValue
                withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (void)setChildAttributeWithASIWidget:(id<ASIWidget>)w
                 withASWidgetAttribute:(ASWidgetAttribute *)key
                          withNSString:(NSString *)strValue
                                withId:(id)objValue;

- (void)setIdWithNSString:(NSString *)id_;

- (void)setVisibleWithBoolean:(jboolean)b;

@end

J2OBJC_EMPTY_STATIC_INIT(ASFrameLayoutImpl)

inline NSString *ASFrameLayoutImpl_get_LOCAL_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASFrameLayoutImpl_LOCAL_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASFrameLayoutImpl, LOCAL_NAME, NSString *)

inline NSString *ASFrameLayoutImpl_get_GROUP_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASFrameLayoutImpl_GROUP_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASFrameLayoutImpl, GROUP_NAME, NSString *)

FOUNDATION_EXPORT void ASFrameLayoutImpl_init(ASFrameLayoutImpl *self);

FOUNDATION_EXPORT ASFrameLayoutImpl *new_ASFrameLayoutImpl_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASFrameLayoutImpl *create_ASFrameLayoutImpl_init(void);

FOUNDATION_EXPORT void ASFrameLayoutImpl_initWithNSString_(ASFrameLayoutImpl *self, NSString *localname);

FOUNDATION_EXPORT ASFrameLayoutImpl *new_ASFrameLayoutImpl_initWithNSString_(NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASFrameLayoutImpl *create_ASFrameLayoutImpl_initWithNSString_(NSString *localname);

FOUNDATION_EXPORT void ASFrameLayoutImpl_initWithNSString_withNSString_(ASFrameLayoutImpl *self, NSString *groupName, NSString *localname);

FOUNDATION_EXPORT ASFrameLayoutImpl *new_ASFrameLayoutImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASFrameLayoutImpl *create_ASFrameLayoutImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname);

J2OBJC_TYPE_LITERAL_HEADER(ASFrameLayoutImpl)

@compatibility_alias ComAsheraLayoutFrameLayoutImpl ASFrameLayoutImpl;

#endif

#if !defined (ASFrameLayoutImpl_FrameLayoutExt_) && (INCLUDE_ALL_FrameLayoutImpl || defined(INCLUDE_ASFrameLayoutImpl_FrameLayoutExt))
#define ASFrameLayoutImpl_FrameLayoutExt_

#define RESTRICT_FrameLayout 1
#define INCLUDE_ADFrameLayout 1
#include "FrameLayout.h"

#define RESTRICT_ILifeCycleDecorator 1
#define INCLUDE_ASILifeCycleDecorator 1
#include "ILifeCycleDecorator.h"

#define RESTRICT_IMaxDimension 1
#define INCLUDE_ASIMaxDimension 1
#include "IMaxDimension.h"

@class ADRect;
@class ADView;
@class ASFrameLayoutImpl;
@class ASWidgetAttribute;
@class IOSIntArray;
@class IOSObjectArray;
@protocol ASIWidget;
@protocol JavaUtilList;

@interface ASFrameLayoutImpl_FrameLayoutExt : ADFrameLayout < ASILifeCycleDecorator, ASIMaxDimension >

#pragma mark Public

- (instancetype)initWithASFrameLayoutImpl:(ASFrameLayoutImpl *)outer$;

- (void)drawableStateChanged;

- (void)endViewTransitionWithADView:(ADView *)view;

- (void)executeWithNSString:(NSString *)method
          withNSObjectArray:(IOSObjectArray *)canvas;

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)widgetAttribute;

- (void)getLocationOnScreenWithIntArray:(IOSIntArray *)appScreenLocation;

- (jint)getMaxHeight;

- (jint)getMaxWidth;

- (id<JavaUtilList>)getMethods;

- (id<ASIWidget>)getWidget;

- (void)getWindowVisibleDisplayFrameWithADRect:(ADRect *)displayFrame;

- (ADView *)inflateViewWithNSString:(NSString *)layout;

- (void)initialized OBJC_METHOD_FAMILY_NONE;

- (id<ASILifeCycleDecorator>)newInstanceWithASIWidget:(id<ASIWidget>)widget OBJC_METHOD_FAMILY_NONE;

- (void)offsetLeftAndRightWithInt:(jint)offset;

- (void)offsetTopAndBottomWithInt:(jint)offset;

- (void)onMeasureWithInt:(jint)widthMeasureSpec
                 withInt:(jint)heightMeasureSpec;

- (void)remeasure;

- (void)removeFromParent;

- (void)setAttributeWithASWidgetAttribute:(ASWidgetAttribute *)widgetAttribute
                             withNSString:(NSString *)strValue
                                   withId:(id)objValue;

- (void)setMaxHeightWithInt:(jint)height;

- (void)setMaxWidthWithInt:(jint)width;

- (void)setMyAttributeWithNSString:(NSString *)name
                            withId:(id)value;

- (void)setState0WithId:(id)value;

- (void)setState1WithId:(id)value;

- (void)setState2WithId:(id)value;

- (void)setState3WithId:(id)value;

- (void)setState4WithId:(id)value;

- (void)setVisibilityWithInt:(jint)visibility;

- (void)state0;

- (void)state1;

- (void)state2;

- (void)state3;

- (void)state4;

- (void)stateNo;

- (void)stateYes;

- (void)updateMeasuredDimensionWithInt:(jint)width
                               withInt:(jint)height;

#pragma mark Protected

- (void)onLayoutWithBoolean:(jboolean)changed
                    withInt:(jint)l
                    withInt:(jint)t
                    withInt:(jint)r
                    withInt:(jint)b;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASFrameLayoutImpl_FrameLayoutExt)

FOUNDATION_EXPORT void ASFrameLayoutImpl_FrameLayoutExt_initWithASFrameLayoutImpl_(ASFrameLayoutImpl_FrameLayoutExt *self, ASFrameLayoutImpl *outer$);

FOUNDATION_EXPORT ASFrameLayoutImpl_FrameLayoutExt *new_ASFrameLayoutImpl_FrameLayoutExt_initWithASFrameLayoutImpl_(ASFrameLayoutImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASFrameLayoutImpl_FrameLayoutExt *create_ASFrameLayoutImpl_FrameLayoutExt_initWithASFrameLayoutImpl_(ASFrameLayoutImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASFrameLayoutImpl_FrameLayoutExt)

#endif

#pragma pop_macro("INCLUDE_ALL_FrameLayoutImpl")
