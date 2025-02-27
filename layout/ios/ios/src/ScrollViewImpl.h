//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\ios_widget_library\src\main\java\com\ashera\layout\ScrollViewImpl.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ScrollViewImpl")
#ifdef RESTRICT_ScrollViewImpl
#define INCLUDE_ALL_ScrollViewImpl 0
#else
#define INCLUDE_ALL_ScrollViewImpl 1
#endif
#undef RESTRICT_ScrollViewImpl

#if !defined (ASScrollViewImpl_) && (INCLUDE_ALL_ScrollViewImpl || defined(INCLUDE_ASScrollViewImpl))
#define ASScrollViewImpl_

#define RESTRICT_BaseHasWidgets 1
#define INCLUDE_ASBaseHasWidgets 1
#include "BaseHasWidgets.h"

@class ASWidgetAttribute;
@class IOSClass;
@protocol ASIFragment;
@protocol ASILifeCycleDecorator;
@protocol ASIWidget;
@protocol JavaUtilMap;

@interface ASScrollViewImpl : ASBaseHasWidgets
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

- (id)getScrollX;

- (id)getScrollY;

- (IOSClass *)getViewClass;

- (void)invalidate;

- (void)loadAttributesWithNSString:(NSString *)localName;

- (jdouble)nativeGetScrollXWithId:(id)view;

- (jdouble)nativeGetScrollYWithId:(id)view;

- (id)nativescrollViewCreate;

- (void)nativeSetScrollXWithId:(id)view
                       withInt:(jint)value;

- (void)nativeSetScrollYWithId:(id)view
                       withInt:(jint)value;

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

J2OBJC_EMPTY_STATIC_INIT(ASScrollViewImpl)

inline NSString *ASScrollViewImpl_get_LOCAL_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASScrollViewImpl_LOCAL_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASScrollViewImpl, LOCAL_NAME, NSString *)

inline NSString *ASScrollViewImpl_get_GROUP_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASScrollViewImpl_GROUP_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASScrollViewImpl, GROUP_NAME, NSString *)

FOUNDATION_EXPORT void ASScrollViewImpl_init(ASScrollViewImpl *self);

FOUNDATION_EXPORT ASScrollViewImpl *new_ASScrollViewImpl_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASScrollViewImpl *create_ASScrollViewImpl_init(void);

FOUNDATION_EXPORT void ASScrollViewImpl_initWithNSString_(ASScrollViewImpl *self, NSString *localname);

FOUNDATION_EXPORT ASScrollViewImpl *new_ASScrollViewImpl_initWithNSString_(NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASScrollViewImpl *create_ASScrollViewImpl_initWithNSString_(NSString *localname);

FOUNDATION_EXPORT void ASScrollViewImpl_initWithNSString_withNSString_(ASScrollViewImpl *self, NSString *groupName, NSString *localname);

FOUNDATION_EXPORT ASScrollViewImpl *new_ASScrollViewImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASScrollViewImpl *create_ASScrollViewImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname);

J2OBJC_TYPE_LITERAL_HEADER(ASScrollViewImpl)

@compatibility_alias ComAsheraLayoutScrollViewImpl ASScrollViewImpl;

#endif

#if !defined (ASScrollViewImpl_ScrollViewExt_) && (INCLUDE_ALL_ScrollViewImpl || defined(INCLUDE_ASScrollViewImpl_ScrollViewExt))
#define ASScrollViewImpl_ScrollViewExt_

#define RESTRICT_ScrollView 1
#define INCLUDE_ADScrollView 1
#include "ScrollView.h"

#define RESTRICT_ILifeCycleDecorator 1
#define INCLUDE_ASILifeCycleDecorator 1
#include "ILifeCycleDecorator.h"

#define RESTRICT_IMaxDimension 1
#define INCLUDE_ASIMaxDimension 1
#include "IMaxDimension.h"

@class ADRect;
@class ADView;
@class ASScrollViewImpl;
@class ASWidgetAttribute;
@class IOSIntArray;
@class IOSObjectArray;
@protocol ASIWidget;
@protocol JavaUtilList;

@interface ASScrollViewImpl_ScrollViewExt : ADScrollView < ASILifeCycleDecorator, ASIMaxDimension >

#pragma mark Public

- (instancetype)initWithASScrollViewImpl:(ASScrollViewImpl *)outer$;

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

J2OBJC_EMPTY_STATIC_INIT(ASScrollViewImpl_ScrollViewExt)

FOUNDATION_EXPORT void ASScrollViewImpl_ScrollViewExt_initWithASScrollViewImpl_(ASScrollViewImpl_ScrollViewExt *self, ASScrollViewImpl *outer$);

FOUNDATION_EXPORT ASScrollViewImpl_ScrollViewExt *new_ASScrollViewImpl_ScrollViewExt_initWithASScrollViewImpl_(ASScrollViewImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASScrollViewImpl_ScrollViewExt *create_ASScrollViewImpl_ScrollViewExt_initWithASScrollViewImpl_(ASScrollViewImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASScrollViewImpl_ScrollViewExt)

#endif

#if !defined (ASScrollViewImpl_MyUIScrollViewDelegate_) && (INCLUDE_ALL_ScrollViewImpl || defined(INCLUDE_ASScrollViewImpl_MyUIScrollViewDelegate))
#define ASScrollViewImpl_MyUIScrollViewDelegate_

@class ASScrollViewImpl;

@interface ASScrollViewImpl_MyUIScrollViewDelegate : NSObject {
 @public
  jint oldScrollY_;
  jint oldScrollX_;
}

#pragma mark Public

- (instancetype)initWithASScrollViewImpl:(ASScrollViewImpl *)outer$;

- (void)nativeScrollChangeListenerWithId:(id)nativeWidget;

- (void)onscrollWithInt:(jint)scrollX
                withInt:(jint)scrollY;

#pragma mark Package-Private

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASScrollViewImpl_MyUIScrollViewDelegate)

FOUNDATION_EXPORT void ASScrollViewImpl_MyUIScrollViewDelegate_initWithASScrollViewImpl_(ASScrollViewImpl_MyUIScrollViewDelegate *self, ASScrollViewImpl *outer$);

FOUNDATION_EXPORT ASScrollViewImpl_MyUIScrollViewDelegate *new_ASScrollViewImpl_MyUIScrollViewDelegate_initWithASScrollViewImpl_(ASScrollViewImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASScrollViewImpl_MyUIScrollViewDelegate *create_ASScrollViewImpl_MyUIScrollViewDelegate_initWithASScrollViewImpl_(ASScrollViewImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASScrollViewImpl_MyUIScrollViewDelegate)

#endif

#pragma pop_macro("INCLUDE_ALL_ScrollViewImpl")
