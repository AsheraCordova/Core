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

@class ASScrollViewImpl_ScrollViewBean;
@class ASScrollViewImpl_ScrollViewCommandBuilder;
@class ASScrollViewImpl_ScrollViewCommandParamsBuilder;
@class ASScrollViewImpl_ScrollViewParamsBean;
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

- (ASScrollViewImpl_ScrollViewBean *)getBean;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)getBuilder;

- (id)getChildAttributeWithASIWidget:(id<ASIWidget>)w
               withASWidgetAttribute:(ASWidgetAttribute *)key;

- (ASScrollViewImpl_ScrollViewParamsBean *)getParamsBean;

- (ASScrollViewImpl_ScrollViewCommandParamsBuilder *)getParamsBuilder;

- (id)getPluginWithNSString:(NSString *)plugin;

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

#if !defined (ASScrollViewImpl_ScrollViewCommandBuilder_) && (INCLUDE_ALL_ScrollViewImpl || defined(INCLUDE_ASScrollViewImpl_ScrollViewCommandBuilder))
#define ASScrollViewImpl_ScrollViewCommandBuilder_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupCommandBuilder 1
#include "ViewGroupImpl.h"

@class ASScrollViewImpl;

@interface ASScrollViewImpl_ScrollViewCommandBuilder : ASViewGroupImpl_ViewGroupCommandBuilder

#pragma mark Public

- (instancetype)initWithASScrollViewImpl:(ASScrollViewImpl *)outer$;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)addAllModelWithId:(id)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)addModelByIndexWithId:(id)arg0
                                                              withId:(id)arg1;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)addModelWithId:(id)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)animatorXmlWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)endAnimator;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)executeWithBoolean:(jboolean)setter;

- (id)getScrollY;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)invalidate;

- (id)isFillViewport;

- (id)isMeasureAllChildren;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)notifyDataSetChangedWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)refreshUiFromModelWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)removeModelAtIndexWithInt:(jint)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)removeModelByIdWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)requestLayout;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)reset;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setAddStatesFromChildrenWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setAlphaWithFloat:(jfloat)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setAsDragSourceWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setAttributeUnderTestWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setBackgroundRepeatWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setBackgroundTintModeWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setBackgroundTintWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setBackgroundWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setChildXmlWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setClickableWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setClipChildrenWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setClipToPaddingWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setContentDescriptionWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setCustomErrorMessageKeysWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setCustomErrorMessageValuesWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setDuplicateParentStateWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setElevationWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setEnabledWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setErrorStyleWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setFillViewportWithBoolean:(jboolean)value;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setFocusableWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setForegroundGravityWithNSString:(NSString *)value;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setForegroundRepeatWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setForegroundTintModeWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setForegroundTintWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setForegroundWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIdWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setInvalidateOnFrameChangeWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosAccessibilityHintWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosAccessibilityIgnoresInvertColorsWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosAccessibilityLabelWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosAccessibilityTraitsWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosAccessibilityValueWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosAlphaWithFloat:(jfloat)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosAutoresizesSubviewsWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosBackgroundColorWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosClearsContextBeforeDrawingWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosClipsToBoundsWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosContentScaleFactorWithFloat:(jfloat)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosInsetsLayoutMarginsFromSafeAreaWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosIsAccessibilityElementWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosIsExclusiveTouchWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosIsHiddenWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosIsMultipleTouchEnabledWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosIsOpaqueWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosIsUserInteractionEnabledWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosLargeContentImageWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosLargeContentTitleWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosLayerBorderColorWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosLayerBorderWidthWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosLayerCornerRadiusWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosLayerMasksToBoundsWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosPreservesSuperviewLayoutMarginsWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosPreventAutoScrollWithBoolean:(jboolean)value;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosRestorationIdentifierWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosScalesLargeContentImageWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosShowsLargeContentViewerWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosTagWithInt:(jint)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosTintColorWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setIosTranslatesAutoresizingMaskIntoConstraintsWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setKeepScreenOnWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setLayoutDirectionWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setLayoutModeWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setListitemWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setLongClickableWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setMaxHeightWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setMaxWidthWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setMeasureAllChildrenWithBoolean:(jboolean)value;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setMinHeightWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setMinWidthWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setModelDescPathWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setModelForWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setModelIdPathWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setModelParamWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setModelPojoToUiParamsWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setModelPojoToUiWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setModelSyncEventsWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setModelUiToPojoEventIdsWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setModelUiToPojoWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setOnAnimationCancelWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setOnAnimationEndWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setOnAnimationRepeatWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setOnAnimationStartWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setOnChildViewAddedWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setOnChildViewRemovedWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setOnClickWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setOnDragWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setOnKeyWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setOnLongClickWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setOnScrollChangeWithNSString:(NSString *)value;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setOnSwipedWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setOnTouchWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setOutsideTouchableWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setPaddingBottomWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setPaddingEndWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setPaddingHorizontalWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setPaddingLeftWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setPaddingRightWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setPaddingStartWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setPaddingTopWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setPaddingVerticalWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setPaddingWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setRotationWithFloat:(jfloat)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setRotationXWithFloat:(jfloat)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setRotationYWithFloat:(jfloat)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setScaleXWithFloat:(jfloat)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setScaleYWithFloat:(jfloat)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setScrollYWithNSString:(NSString *)value;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setSelectedWithBoolean:(jboolean)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setStyleWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setTextAlignmentWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setTextDirectionWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setTransformPivotXWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setTransformPivotYWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setTranslationXWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setTranslationYWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setTranslationZWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setV_maxlengthWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setV_maxWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setV_minlengthWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setV_minWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setV_patternWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setV_requiredWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setV_typeWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setValidationErrorDisplayTypeWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setValidationWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setVisibilityWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)setZIndexWithInt:(jint)arg0;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)startAnimator;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetAddStatesFromChildren;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetAlpha;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetBackground;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetBackgroundTint;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetBackgroundTintMode;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetClickable;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetClipChildren;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetClipToPadding;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetContentDescription;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetDuplicateParentState;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetEnabled;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetFillViewport;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetFocusable;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetForeground;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetForegroundGravity;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetForegroundTint;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetForegroundTintMode;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetId;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosAccessibilityHint;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosAccessibilityIgnoresInvertColors;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosAccessibilityLabel;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosAccessibilityTraits;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosAccessibilityValue;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosAlpha;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosAutoresizesSubviews;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosBackgroundColor;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosClearsContextBeforeDrawing;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosClipsToBounds;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosContentScaleFactor;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosInsetsLayoutMarginsFromSafeArea;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosIsAccessibilityElement;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosIsExclusiveTouch;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosIsFocused;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosIsHidden;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosIsMultipleTouchEnabled;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosIsOpaque;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosIsUserInteractionEnabled;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosLargeContentImage;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosLargeContentTitle;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosPreservesSuperviewLayoutMargins;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosRestorationIdentifier;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosScalesLargeContentImage;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosShowsLargeContentViewer;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosTag;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosTintColor;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetIosTranslatesAutoresizingMaskIntoConstraints;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetKeepScreenOn;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetLayoutDirection;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetLayoutMode;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetLongClickable;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetMaxHeight;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetMaxWidth;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetMeasureAllChildren;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetMinHeight;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetMinWidth;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetModelDescPath;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetModelIdPath;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetModelParam;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetModelPojoToUi;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetModelSyncEvents;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetModelUiToPojo;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetPaddingBottom;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetPaddingEnd;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetPaddingLeft;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetPaddingRight;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetPaddingStart;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetPaddingTop;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetRotation;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetRotationX;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetRotationY;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetScaleX;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetScaleY;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetScrollY;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetSelected;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetTextAlignment;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetTextDirection;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetTransformPivotX;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetTransformPivotY;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetTranslationX;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetTranslationY;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetTranslationZ;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetValidateForm;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)tryGetVisibility;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)updateModelDataWithNSString:(NSString *)arg0
                                                                    withId:(id)arg1;

- (ASScrollViewImpl_ScrollViewCommandBuilder *)validateFormWithNSString:(NSString *)arg0;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASScrollViewImpl_ScrollViewCommandBuilder)

FOUNDATION_EXPORT void ASScrollViewImpl_ScrollViewCommandBuilder_initWithASScrollViewImpl_(ASScrollViewImpl_ScrollViewCommandBuilder *self, ASScrollViewImpl *outer$);

FOUNDATION_EXPORT ASScrollViewImpl_ScrollViewCommandBuilder *new_ASScrollViewImpl_ScrollViewCommandBuilder_initWithASScrollViewImpl_(ASScrollViewImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASScrollViewImpl_ScrollViewCommandBuilder *create_ASScrollViewImpl_ScrollViewCommandBuilder_initWithASScrollViewImpl_(ASScrollViewImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASScrollViewImpl_ScrollViewCommandBuilder)

#endif

#if !defined (ASScrollViewImpl_ScrollViewBean_) && (INCLUDE_ALL_ScrollViewImpl || defined(INCLUDE_ASScrollViewImpl_ScrollViewBean))
#define ASScrollViewImpl_ScrollViewBean_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupBean 1
#include "ViewGroupImpl.h"

@class ASScrollViewImpl;
@protocol ASIWidget;

@interface ASScrollViewImpl_ScrollViewBean : ASViewGroupImpl_ViewGroupBean

#pragma mark Public

- (instancetype)initWithASScrollViewImpl:(ASScrollViewImpl *)outer$;

- (id)getScrollY;

- (id)isFillViewport;

- (id)isMeasureAllChildren;

- (void)setFillViewportWithBoolean:(jboolean)value;

- (void)setForegroundGravityWithNSString:(NSString *)value;

- (void)setIosPreventAutoScrollWithBoolean:(jboolean)value;

- (void)setMeasureAllChildrenWithBoolean:(jboolean)value;

- (void)setOnScrollChangeWithNSString:(NSString *)value;

- (void)setScrollYWithNSString:(NSString *)value;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithASIWidget:(id<ASIWidget>)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASScrollViewImpl_ScrollViewBean)

FOUNDATION_EXPORT void ASScrollViewImpl_ScrollViewBean_initWithASScrollViewImpl_(ASScrollViewImpl_ScrollViewBean *self, ASScrollViewImpl *outer$);

FOUNDATION_EXPORT ASScrollViewImpl_ScrollViewBean *new_ASScrollViewImpl_ScrollViewBean_initWithASScrollViewImpl_(ASScrollViewImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASScrollViewImpl_ScrollViewBean *create_ASScrollViewImpl_ScrollViewBean_initWithASScrollViewImpl_(ASScrollViewImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASScrollViewImpl_ScrollViewBean)

#endif

#if !defined (ASScrollViewImpl_ScrollViewParamsBean_) && (INCLUDE_ALL_ScrollViewImpl || defined(INCLUDE_ASScrollViewImpl_ScrollViewParamsBean))
#define ASScrollViewImpl_ScrollViewParamsBean_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupParamsBean 1
#include "ViewGroupImpl.h"

@class ASScrollViewImpl;
@protocol ASIWidget;

@interface ASScrollViewImpl_ScrollViewParamsBean : ASViewGroupImpl_ViewGroupParamsBean

#pragma mark Public

- (instancetype)initWithASScrollViewImpl:(ASScrollViewImpl *)outer$;

- (id)getLayoutGravityWithASIWidget:(id<ASIWidget>)w;

- (void)setLayoutGravityWithASIWidget:(id<ASIWidget>)w
                         withNSString:(NSString *)value;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASScrollViewImpl_ScrollViewParamsBean)

FOUNDATION_EXPORT void ASScrollViewImpl_ScrollViewParamsBean_initWithASScrollViewImpl_(ASScrollViewImpl_ScrollViewParamsBean *self, ASScrollViewImpl *outer$);

FOUNDATION_EXPORT ASScrollViewImpl_ScrollViewParamsBean *new_ASScrollViewImpl_ScrollViewParamsBean_initWithASScrollViewImpl_(ASScrollViewImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASScrollViewImpl_ScrollViewParamsBean *create_ASScrollViewImpl_ScrollViewParamsBean_initWithASScrollViewImpl_(ASScrollViewImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASScrollViewImpl_ScrollViewParamsBean)

#endif

#if !defined (ASScrollViewImpl_ScrollViewCommandParamsBuilder_) && (INCLUDE_ALL_ScrollViewImpl || defined(INCLUDE_ASScrollViewImpl_ScrollViewCommandParamsBuilder))
#define ASScrollViewImpl_ScrollViewCommandParamsBuilder_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupCommandParamsBuilder 1
#include "ViewGroupImpl.h"

@class ASScrollViewImpl;

@interface ASScrollViewImpl_ScrollViewCommandParamsBuilder : ASViewGroupImpl_ViewGroupCommandParamsBuilder

#pragma mark Public

- (instancetype)initWithASScrollViewImpl:(ASScrollViewImpl *)outer$;

- (id)getLayoutGravity;

- (ASScrollViewImpl_ScrollViewCommandParamsBuilder *)reset;

- (ASScrollViewImpl_ScrollViewCommandParamsBuilder *)setLayoutGravityWithNSString:(NSString *)value;

- (ASScrollViewImpl_ScrollViewCommandParamsBuilder *)setLayoutMarginBottomWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandParamsBuilder *)setLayoutMarginEndWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandParamsBuilder *)setLayoutMarginHorizontalWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandParamsBuilder *)setLayoutMarginLeftWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandParamsBuilder *)setLayoutMarginRightWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandParamsBuilder *)setLayoutMarginStartWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandParamsBuilder *)setLayoutMarginTopWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandParamsBuilder *)setLayoutMarginVerticalWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandParamsBuilder *)setLayoutMarginWithNSString:(NSString *)arg0;

- (ASScrollViewImpl_ScrollViewCommandParamsBuilder *)tryGetLayoutGravity;

- (ASScrollViewImpl_ScrollViewCommandParamsBuilder *)tryGetLayoutMarginBottom;

- (ASScrollViewImpl_ScrollViewCommandParamsBuilder *)tryGetLayoutMarginEnd;

- (ASScrollViewImpl_ScrollViewCommandParamsBuilder *)tryGetLayoutMarginLeft;

- (ASScrollViewImpl_ScrollViewCommandParamsBuilder *)tryGetLayoutMarginRight;

- (ASScrollViewImpl_ScrollViewCommandParamsBuilder *)tryGetLayoutMarginStart;

- (ASScrollViewImpl_ScrollViewCommandParamsBuilder *)tryGetLayoutMarginTop;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASScrollViewImpl_ScrollViewCommandParamsBuilder)

FOUNDATION_EXPORT void ASScrollViewImpl_ScrollViewCommandParamsBuilder_initWithASScrollViewImpl_(ASScrollViewImpl_ScrollViewCommandParamsBuilder *self, ASScrollViewImpl *outer$);

FOUNDATION_EXPORT ASScrollViewImpl_ScrollViewCommandParamsBuilder *new_ASScrollViewImpl_ScrollViewCommandParamsBuilder_initWithASScrollViewImpl_(ASScrollViewImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASScrollViewImpl_ScrollViewCommandParamsBuilder *create_ASScrollViewImpl_ScrollViewCommandParamsBuilder_initWithASScrollViewImpl_(ASScrollViewImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASScrollViewImpl_ScrollViewCommandParamsBuilder)

#endif

#if !defined (ASScrollViewImpl_MyUIScrollViewDelegate_) && (INCLUDE_ALL_ScrollViewImpl || defined(INCLUDE_ASScrollViewImpl_MyUIScrollViewDelegate))
#define ASScrollViewImpl_MyUIScrollViewDelegate_

@class ASScrollViewImpl;
@protocol ADView_OnScrollChangeListener;

@interface ASScrollViewImpl_MyUIScrollViewDelegate : NSObject {
 @public
  jint oldScrollY_;
  jint oldScrollX_;
}

#pragma mark Public

- (instancetype)initWithASScrollViewImpl:(ASScrollViewImpl *)outer$
       withADView_OnScrollChangeListener:(id<ADView_OnScrollChangeListener>)listener;

- (void)nativeScrollChangeListenerWithId:(id)nativeWidget;

- (void)onscrollWithInt:(jint)scrollX
                withInt:(jint)scrollY;

#pragma mark Package-Private

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASScrollViewImpl_MyUIScrollViewDelegate)

FOUNDATION_EXPORT void ASScrollViewImpl_MyUIScrollViewDelegate_initWithASScrollViewImpl_withADView_OnScrollChangeListener_(ASScrollViewImpl_MyUIScrollViewDelegate *self, ASScrollViewImpl *outer$, id<ADView_OnScrollChangeListener> listener);

FOUNDATION_EXPORT ASScrollViewImpl_MyUIScrollViewDelegate *new_ASScrollViewImpl_MyUIScrollViewDelegate_initWithASScrollViewImpl_withADView_OnScrollChangeListener_(ASScrollViewImpl *outer$, id<ADView_OnScrollChangeListener> listener) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASScrollViewImpl_MyUIScrollViewDelegate *create_ASScrollViewImpl_MyUIScrollViewDelegate_initWithASScrollViewImpl_withADView_OnScrollChangeListener_(ASScrollViewImpl *outer$, id<ADView_OnScrollChangeListener> listener);

J2OBJC_TYPE_LITERAL_HEADER(ASScrollViewImpl_MyUIScrollViewDelegate)

#endif

#pragma pop_macro("INCLUDE_ALL_ScrollViewImpl")
