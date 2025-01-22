//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\ios_widget_library\src\main\java\com\ashera\layout\ViewGroupModelImpl.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ViewGroupModelImpl")
#ifdef RESTRICT_ViewGroupModelImpl
#define INCLUDE_ALL_ViewGroupModelImpl 0
#else
#define INCLUDE_ALL_ViewGroupModelImpl 1
#endif
#undef RESTRICT_ViewGroupModelImpl

#if !defined (ASViewGroupModelImpl_) && (INCLUDE_ALL_ViewGroupModelImpl || defined(INCLUDE_ASViewGroupModelImpl))
#define ASViewGroupModelImpl_

@class ASSimpleWrapableView;
@class ASWidgetAttribute;
@protocol ASILifeCycleDecorator;
@protocol ASIWidget;

@interface ASViewGroupModelImpl : NSObject

#pragma mark Public

+ (id)getAttributeWithASIWidget:(id<ASIWidget>)w
          withASWidgetAttribute:(ASWidgetAttribute *)key
      withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

+ (id)getChildAttributeWithASIWidget:(id<ASIWidget>)w
               withASWidgetAttribute:(ASWidgetAttribute *)key;

+ (jboolean)isAttributeSupportedWithASWidgetAttribute:(ASWidgetAttribute *)key;

+ (void)register__WithNSString:(NSString *)localName;

+ (void)setAttributeWithASIWidget:(id<ASIWidget>)w
         withASSimpleWrapableView:(ASSimpleWrapableView *)wrapperView
            withASWidgetAttribute:(ASWidgetAttribute *)key
                     withNSString:(NSString *)strValue
                           withId:(id)objValue
        withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

+ (void)setAttributeWithASIWidget:(id<ASIWidget>)w
            withASWidgetAttribute:(ASWidgetAttribute *)key
                     withNSString:(NSString *)strValue
                           withId:(id)objValue
        withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

+ (void)setChildAttributeWithASIWidget:(id<ASIWidget>)w
                 withASWidgetAttribute:(ASWidgetAttribute *)key
                                withId:(id)objValue
                                withId:(id)layoutParams;

@end

J2OBJC_EMPTY_STATIC_INIT(ASViewGroupModelImpl)

FOUNDATION_EXPORT void ASViewGroupModelImpl_register__WithNSString_(NSString *localName);

FOUNDATION_EXPORT void ASViewGroupModelImpl_setAttributeWithASIWidget_withASSimpleWrapableView_withASWidgetAttribute_withNSString_withId_withASILifeCycleDecorator_(id<ASIWidget> w, ASSimpleWrapableView *wrapperView, ASWidgetAttribute *key, NSString *strValue, id objValue, id<ASILifeCycleDecorator> decorator);

FOUNDATION_EXPORT void ASViewGroupModelImpl_setAttributeWithASIWidget_withASWidgetAttribute_withNSString_withId_withASILifeCycleDecorator_(id<ASIWidget> w, ASWidgetAttribute *key, NSString *strValue, id objValue, id<ASILifeCycleDecorator> decorator);

FOUNDATION_EXPORT void ASViewGroupModelImpl_setChildAttributeWithASIWidget_withASWidgetAttribute_withId_withId_(id<ASIWidget> w, ASWidgetAttribute *key, id objValue, id layoutParams);

FOUNDATION_EXPORT id ASViewGroupModelImpl_getAttributeWithASIWidget_withASWidgetAttribute_withASILifeCycleDecorator_(id<ASIWidget> w, ASWidgetAttribute *key, id<ASILifeCycleDecorator> decorator);

FOUNDATION_EXPORT id ASViewGroupModelImpl_getChildAttributeWithASIWidget_withASWidgetAttribute_(id<ASIWidget> w, ASWidgetAttribute *key);

FOUNDATION_EXPORT jboolean ASViewGroupModelImpl_isAttributeSupportedWithASWidgetAttribute_(ASWidgetAttribute *key);

J2OBJC_TYPE_LITERAL_HEADER(ASViewGroupModelImpl)

@compatibility_alias ComAsheraLayoutViewGroupModelImpl ASViewGroupModelImpl;

#endif

#pragma pop_macro("INCLUDE_ALL_ViewGroupModelImpl")
