//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\ios_widget_library\src\main\java\com\ashera\layout\MeasurableCompoundButton.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_MeasurableCompoundButton")
#ifdef RESTRICT_MeasurableCompoundButton
#define INCLUDE_ALL_MeasurableCompoundButton 0
#else
#define INCLUDE_ALL_MeasurableCompoundButton 1
#endif
#undef RESTRICT_MeasurableCompoundButton

#if !defined (ASMeasurableCompoundButton_) && (INCLUDE_ALL_MeasurableCompoundButton || defined(INCLUDE_ASMeasurableCompoundButton))
#define ASMeasurableCompoundButton_

#define RESTRICT_CompoundButton 1
#define INCLUDE_ADCompoundButton 1
#include "CompoundButton.h"

@protocol ASIWidget;

@interface ASMeasurableCompoundButton : ADCompoundButton

#pragma mark Public

- (instancetype)initWithASIWidget:(id<ASIWidget>)widget;

- (jint)nativeMeasureHeightWithId:(id)uiView
                          withInt:(jint)width;

- (jint)nativeMeasureWidthWithId:(id)uiView;

@end

J2OBJC_EMPTY_STATIC_INIT(ASMeasurableCompoundButton)

FOUNDATION_EXPORT void ASMeasurableCompoundButton_initWithASIWidget_(ASMeasurableCompoundButton *self, id<ASIWidget> widget);

FOUNDATION_EXPORT ASMeasurableCompoundButton *new_ASMeasurableCompoundButton_initWithASIWidget_(id<ASIWidget> widget) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASMeasurableCompoundButton *create_ASMeasurableCompoundButton_initWithASIWidget_(id<ASIWidget> widget);

J2OBJC_TYPE_LITERAL_HEADER(ASMeasurableCompoundButton)

@compatibility_alias ComAsheraLayoutMeasurableCompoundButton ASMeasurableCompoundButton;

#endif

#pragma pop_macro("INCLUDE_ALL_MeasurableCompoundButton")
