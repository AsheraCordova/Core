//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\ios_widget_library\src\main\java\com\ashera\layout\ModelImpl.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ModelImpl")
#ifdef RESTRICT_ModelImpl
#define INCLUDE_ALL_ModelImpl 0
#else
#define INCLUDE_ALL_ModelImpl 1
#endif
#undef RESTRICT_ModelImpl

#if !defined (ASModelImpl_) && (INCLUDE_ALL_ModelImpl || defined(INCLUDE_ASModelImpl))
#define ASModelImpl_

#define RESTRICT_BaseWidget 1
#define INCLUDE_ASBaseWidget 1
#include "BaseWidget.h"

@class ASWidgetAttribute;
@class IOSClass;
@protocol ASIFragment;
@protocol ASILifeCycleDecorator;
@protocol ASIWidget;
@protocol JavaUtilMap;

@interface ASModelImpl : ASBaseWidget {
 @public
  id uiView_;
}
@property id uiView;

#pragma mark Public

- (instancetype)init;

- (id)asNativeWidget;

- (id)asWidget;

- (void)createWithASIFragment:(id<ASIFragment>)fragment
              withJavaUtilMap:(id<JavaUtilMap>)params;

- (void)createView;

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
              withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (IOSClass *)getViewClass;

- (void)loadAttributesWithNSString:(NSString *)attributeName;

- (id<ASIWidget>)newInstance OBJC_METHOD_FAMILY_NONE;

- (void)setAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
                             withNSString:(NSString *)strValue
                                   withId:(id)objValue
                withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

#pragma mark Protected

- (jboolean)applyModelAttributes;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithNSString:(NSString *)arg0
                    withNSString:(NSString *)arg1 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASModelImpl)

J2OBJC_FIELD_SETTER(ASModelImpl, uiView_, id)

inline NSString *ASModelImpl_get_LOCAL_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASModelImpl_LOCAL_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASModelImpl, LOCAL_NAME, NSString *)

inline NSString *ASModelImpl_get_GROUP_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASModelImpl_GROUP_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASModelImpl, GROUP_NAME, NSString *)

FOUNDATION_EXPORT void ASModelImpl_init(ASModelImpl *self);

FOUNDATION_EXPORT ASModelImpl *new_ASModelImpl_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASModelImpl *create_ASModelImpl_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASModelImpl)

@compatibility_alias ComAsheraLayoutModelImpl ASModelImpl;

#endif

#if !defined (ASModelImpl_ViewExt_) && (INCLUDE_ALL_ModelImpl || defined(INCLUDE_ASModelImpl_ViewExt))
#define ASModelImpl_ViewExt_

#define RESTRICT_View 1
#define INCLUDE_ADView 1
#include "View.h"

#define RESTRICT_IViewStub 1
#define INCLUDE_ASIViewStub 1
#include "IViewStub.h"

@class ASModelImpl;

@interface ASModelImpl_ViewExt : ADView < ASIViewStub >

#pragma mark Public

- (instancetype)initWithASModelImpl:(ASModelImpl *)outer$;

- (ADView *)inflateViewWithNSString:(NSString *)layout;

- (void)remeasure;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASModelImpl_ViewExt)

FOUNDATION_EXPORT void ASModelImpl_ViewExt_initWithASModelImpl_(ASModelImpl_ViewExt *self, ASModelImpl *outer$);

FOUNDATION_EXPORT ASModelImpl_ViewExt *new_ASModelImpl_ViewExt_initWithASModelImpl_(ASModelImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASModelImpl_ViewExt *create_ASModelImpl_ViewExt_initWithASModelImpl_(ASModelImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASModelImpl_ViewExt)

#endif

#pragma pop_macro("INCLUDE_ALL_ModelImpl")
