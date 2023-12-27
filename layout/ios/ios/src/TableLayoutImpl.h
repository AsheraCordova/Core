//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\ios_widget_library\src\main\java\com\ashera\layout\TableLayoutImpl.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_TableLayoutImpl")
#ifdef RESTRICT_TableLayoutImpl
#define INCLUDE_ALL_TableLayoutImpl 0
#else
#define INCLUDE_ALL_TableLayoutImpl 1
#endif
#undef RESTRICT_TableLayoutImpl

#if !defined (ASTableLayoutImpl_) && (INCLUDE_ALL_TableLayoutImpl || defined(INCLUDE_ASTableLayoutImpl))
#define ASTableLayoutImpl_

#define RESTRICT_BaseHasWidgets 1
#define INCLUDE_ASBaseHasWidgets 1
#include "BaseHasWidgets.h"

@class ADTableLayout;
@class ASTableLayoutImpl_TableLayoutBean;
@class ASTableLayoutImpl_TableLayoutCommandBuilder;
@class ASTableLayoutImpl_TableLayoutCommandParamsBuilder;
@class ASTableLayoutImpl_TableLayoutParamsBean;
@class ASWidgetAttribute;
@class IOSClass;
@protocol ASIFragment;
@protocol ASILifeCycleDecorator;
@protocol ASIWidget;
@protocol JavaUtilMap;

@interface ASTableLayoutImpl : ASBaseHasWidgets
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

- (ASTableLayoutImpl_TableLayoutBean *)getBean;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)getBuilder;

- (id)getChildAttributeWithASIWidget:(id<ASIWidget>)w
               withASWidgetAttribute:(ASWidgetAttribute *)key;

- (ASTableLayoutImpl_TableLayoutParamsBean *)getParamsBean;

- (ASTableLayoutImpl_TableLayoutCommandParamsBuilder *)getParamsBuilder;

- (id)getPluginWithNSString:(NSString *)plugin;

- (IOSClass *)getViewClass;

- (void)invalidate;

- (void)loadAttributesWithNSString:(NSString *)localName;

- (void)nativeCreateWithJavaUtilMap:(id<JavaUtilMap>)params;

- (id<ASIWidget>)newInstance OBJC_METHOD_FAMILY_NONE;

- (void)parseColumnWithADTableLayout:(ADTableLayout *)tableLayout
                        withNSString:(NSString *)str
                             withInt:(jint)i;

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

J2OBJC_EMPTY_STATIC_INIT(ASTableLayoutImpl)

inline NSString *ASTableLayoutImpl_get_LOCAL_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASTableLayoutImpl_LOCAL_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASTableLayoutImpl, LOCAL_NAME, NSString *)

inline NSString *ASTableLayoutImpl_get_GROUP_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASTableLayoutImpl_GROUP_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASTableLayoutImpl, GROUP_NAME, NSString *)

FOUNDATION_EXPORT void ASTableLayoutImpl_init(ASTableLayoutImpl *self);

FOUNDATION_EXPORT ASTableLayoutImpl *new_ASTableLayoutImpl_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTableLayoutImpl *create_ASTableLayoutImpl_init(void);

FOUNDATION_EXPORT void ASTableLayoutImpl_initWithNSString_(ASTableLayoutImpl *self, NSString *localname);

FOUNDATION_EXPORT ASTableLayoutImpl *new_ASTableLayoutImpl_initWithNSString_(NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTableLayoutImpl *create_ASTableLayoutImpl_initWithNSString_(NSString *localname);

FOUNDATION_EXPORT void ASTableLayoutImpl_initWithNSString_withNSString_(ASTableLayoutImpl *self, NSString *groupName, NSString *localname);

FOUNDATION_EXPORT ASTableLayoutImpl *new_ASTableLayoutImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTableLayoutImpl *create_ASTableLayoutImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname);

J2OBJC_TYPE_LITERAL_HEADER(ASTableLayoutImpl)

@compatibility_alias ComAsheraLayoutTableLayoutImpl ASTableLayoutImpl;

#endif

#if !defined (ASTableLayoutImpl_TableLayoutExt_) && (INCLUDE_ALL_TableLayoutImpl || defined(INCLUDE_ASTableLayoutImpl_TableLayoutExt))
#define ASTableLayoutImpl_TableLayoutExt_

#define RESTRICT_TableLayout 1
#define INCLUDE_ADTableLayout 1
#include "TableLayout.h"

#define RESTRICT_ILifeCycleDecorator 1
#define INCLUDE_ASILifeCycleDecorator 1
#include "ILifeCycleDecorator.h"

#define RESTRICT_IMaxDimension 1
#define INCLUDE_ASIMaxDimension 1
#include "IMaxDimension.h"

@class ADRect;
@class ADView;
@class ASTableLayoutImpl;
@class ASWidgetAttribute;
@class IOSIntArray;
@class IOSObjectArray;
@protocol ASIWidget;
@protocol JavaUtilList;

@interface ASTableLayoutImpl_TableLayoutExt : ADTableLayout < ASILifeCycleDecorator, ASIMaxDimension >

#pragma mark Public

- (instancetype)initWithASTableLayoutImpl:(ASTableLayoutImpl *)outer$;

- (void)drawableStateChanged;

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

J2OBJC_EMPTY_STATIC_INIT(ASTableLayoutImpl_TableLayoutExt)

FOUNDATION_EXPORT void ASTableLayoutImpl_TableLayoutExt_initWithASTableLayoutImpl_(ASTableLayoutImpl_TableLayoutExt *self, ASTableLayoutImpl *outer$);

FOUNDATION_EXPORT ASTableLayoutImpl_TableLayoutExt *new_ASTableLayoutImpl_TableLayoutExt_initWithASTableLayoutImpl_(ASTableLayoutImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTableLayoutImpl_TableLayoutExt *create_ASTableLayoutImpl_TableLayoutExt_initWithASTableLayoutImpl_(ASTableLayoutImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASTableLayoutImpl_TableLayoutExt)

#endif

#if !defined (ASTableLayoutImpl_TableLayoutCommandBuilder_) && (INCLUDE_ALL_TableLayoutImpl || defined(INCLUDE_ASTableLayoutImpl_TableLayoutCommandBuilder))
#define ASTableLayoutImpl_TableLayoutCommandBuilder_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupCommandBuilder 1
#include "ViewGroupImpl.h"

@class ASTableLayoutImpl;

@interface ASTableLayoutImpl_TableLayoutCommandBuilder : ASViewGroupImpl_ViewGroupCommandBuilder

#pragma mark Public

- (instancetype)initWithASTableLayoutImpl:(ASTableLayoutImpl *)outer$;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)addAllModelWithId:(id)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)addModelByIndexWithId:(id)arg0
                                                                withId:(id)arg1;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)addModelWithId:(id)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)animatorXmlWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)endAnimator;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)executeWithBoolean:(jboolean)setter;

- (id)getGravity;

- (id)getWeightSum;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)invalidate;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)notifyDataSetChangedWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)refreshUiFromModelWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)removeModelAtIndexWithInt:(jint)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)removeModelByIdWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)requestLayout;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)reset;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setAddStatesFromChildrenWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setAlphaWithFloat:(jfloat)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setAsDragSourceWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setAttributeUnderTestWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setBackgroundRepeatWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setBackgroundTintModeWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setBackgroundTintWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setBackgroundWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setChildXmlWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setClickableWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setClipChildrenWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setClipToPaddingWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setCollapseColumnsWithNSString:(NSString *)value;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setContentDescriptionWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setCustomErrorMessageKeysWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setCustomErrorMessageValuesWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setDuplicateParentStateWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setElevationWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setEnabledWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setErrorStyleWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setFocusableWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setForegroundGravityWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setForegroundRepeatWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setForegroundTintModeWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setForegroundTintWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setForegroundWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setGravityWithNSString:(NSString *)value;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIdWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setInvalidateOnFrameChangeWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosAccessibilityHintWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosAccessibilityIgnoresInvertColorsWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosAccessibilityLabelWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosAccessibilityTraitsWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosAccessibilityValueWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosAlphaWithFloat:(jfloat)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosAutoresizesSubviewsWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosBackgroundColorWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosClearsContextBeforeDrawingWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosClipsToBoundsWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosContentScaleFactorWithFloat:(jfloat)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosInsetsLayoutMarginsFromSafeAreaWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosIsAccessibilityElementWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosIsExclusiveTouchWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosIsHiddenWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosIsMultipleTouchEnabledWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosIsOpaqueWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosIsUserInteractionEnabledWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosLargeContentImageWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosLargeContentTitleWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosLayerBorderColorWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosLayerBorderWidthWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosLayerCornerRadiusWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosLayerMasksToBoundsWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosPreservesSuperviewLayoutMarginsWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosRestorationIdentifierWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosScalesLargeContentImageWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosShowsLargeContentViewerWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosTagWithInt:(jint)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosTintColorWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setIosTranslatesAutoresizingMaskIntoConstraintsWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setKeepScreenOnWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setLayoutDirectionWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setLayoutModeWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setListitemWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setLongClickableWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setMaxHeightWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setMaxWidthWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setMinHeightWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setMinWidthWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setModelDescPathWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setModelForWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setModelIdPathWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setModelParamWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setModelPojoToUiParamsWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setModelPojoToUiWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setModelSyncEventsWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setModelUiToPojoEventIdsWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setModelUiToPojoWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setOnAnimationCancelWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setOnAnimationEndWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setOnAnimationRepeatWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setOnAnimationStartWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setOnChildViewAddedWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setOnChildViewRemovedWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setOnClickWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setOnDragWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setOnKeyWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setOnLongClickWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setOnSwipedWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setOnTouchWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setOutsideTouchableWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setPaddingBottomWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setPaddingEndWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setPaddingHorizontalWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setPaddingLeftWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setPaddingRightWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setPaddingStartWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setPaddingTopWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setPaddingVerticalWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setPaddingWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setRotationWithFloat:(jfloat)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setRotationXWithFloat:(jfloat)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setRotationYWithFloat:(jfloat)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setScaleXWithFloat:(jfloat)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setScaleYWithFloat:(jfloat)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setSelectedWithBoolean:(jboolean)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setShrinkColumnsWithNSString:(NSString *)value;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setStretchColumnsWithNSString:(NSString *)value;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setStyleWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setTextAlignmentWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setTextDirectionWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setTransformPivotXWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setTransformPivotYWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setTranslationXWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setTranslationYWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setTranslationZWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setV_maxlengthWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setV_maxWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setV_minlengthWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setV_minWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setV_patternWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setV_requiredWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setV_typeWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setValidationErrorDisplayTypeWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setValidationWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setVisibilityWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setWeightSumWithFloat:(jfloat)value;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)setZIndexWithInt:(jint)arg0;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)startAnimator;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetAddStatesFromChildren;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetAlpha;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetBackground;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetBackgroundTint;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetBackgroundTintMode;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetClickable;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetClipChildren;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetClipToPadding;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetContentDescription;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetDuplicateParentState;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetEnabled;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetFocusable;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetForeground;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetForegroundGravity;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetForegroundTint;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetForegroundTintMode;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetGravity;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetId;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosAccessibilityHint;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosAccessibilityIgnoresInvertColors;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosAccessibilityLabel;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosAccessibilityTraits;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosAccessibilityValue;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosAlpha;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosAutoresizesSubviews;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosBackgroundColor;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosClearsContextBeforeDrawing;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosClipsToBounds;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosContentScaleFactor;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosInsetsLayoutMarginsFromSafeArea;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosIsAccessibilityElement;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosIsExclusiveTouch;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosIsFocused;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosIsHidden;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosIsMultipleTouchEnabled;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosIsOpaque;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosIsUserInteractionEnabled;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosLargeContentImage;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosLargeContentTitle;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosPreservesSuperviewLayoutMargins;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosRestorationIdentifier;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosScalesLargeContentImage;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosShowsLargeContentViewer;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosTag;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosTintColor;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetIosTranslatesAutoresizingMaskIntoConstraints;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetKeepScreenOn;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetLayoutDirection;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetLayoutMode;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetLongClickable;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetMaxHeight;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetMaxWidth;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetMinHeight;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetMinWidth;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetModelDescPath;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetModelIdPath;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetModelParam;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetModelPojoToUi;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetModelSyncEvents;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetModelUiToPojo;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetPaddingBottom;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetPaddingEnd;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetPaddingLeft;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetPaddingRight;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetPaddingStart;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetPaddingTop;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetRotation;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetRotationX;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetRotationY;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetScaleX;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetScaleY;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetSelected;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetTextAlignment;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetTextDirection;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetTransformPivotX;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetTransformPivotY;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetTranslationX;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetTranslationY;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetTranslationZ;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetValidateForm;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetVisibility;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)tryGetWeightSum;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)updateModelDataWithNSString:(NSString *)arg0
                                                                      withId:(id)arg1;

- (ASTableLayoutImpl_TableLayoutCommandBuilder *)validateFormWithNSString:(NSString *)arg0;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASTableLayoutImpl_TableLayoutCommandBuilder)

FOUNDATION_EXPORT void ASTableLayoutImpl_TableLayoutCommandBuilder_initWithASTableLayoutImpl_(ASTableLayoutImpl_TableLayoutCommandBuilder *self, ASTableLayoutImpl *outer$);

FOUNDATION_EXPORT ASTableLayoutImpl_TableLayoutCommandBuilder *new_ASTableLayoutImpl_TableLayoutCommandBuilder_initWithASTableLayoutImpl_(ASTableLayoutImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTableLayoutImpl_TableLayoutCommandBuilder *create_ASTableLayoutImpl_TableLayoutCommandBuilder_initWithASTableLayoutImpl_(ASTableLayoutImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASTableLayoutImpl_TableLayoutCommandBuilder)

#endif

#if !defined (ASTableLayoutImpl_TableLayoutBean_) && (INCLUDE_ALL_TableLayoutImpl || defined(INCLUDE_ASTableLayoutImpl_TableLayoutBean))
#define ASTableLayoutImpl_TableLayoutBean_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupBean 1
#include "ViewGroupImpl.h"

@class ASTableLayoutImpl;
@protocol ASIWidget;

@interface ASTableLayoutImpl_TableLayoutBean : ASViewGroupImpl_ViewGroupBean

#pragma mark Public

- (instancetype)initWithASTableLayoutImpl:(ASTableLayoutImpl *)outer$;

- (id)getGravity;

- (id)getWeightSum;

- (void)setCollapseColumnsWithNSString:(NSString *)value;

- (void)setGravityWithNSString:(NSString *)value;

- (void)setShrinkColumnsWithNSString:(NSString *)value;

- (void)setStretchColumnsWithNSString:(NSString *)value;

- (void)setWeightSumWithFloat:(jfloat)value;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithASIWidget:(id<ASIWidget>)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASTableLayoutImpl_TableLayoutBean)

FOUNDATION_EXPORT void ASTableLayoutImpl_TableLayoutBean_initWithASTableLayoutImpl_(ASTableLayoutImpl_TableLayoutBean *self, ASTableLayoutImpl *outer$);

FOUNDATION_EXPORT ASTableLayoutImpl_TableLayoutBean *new_ASTableLayoutImpl_TableLayoutBean_initWithASTableLayoutImpl_(ASTableLayoutImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTableLayoutImpl_TableLayoutBean *create_ASTableLayoutImpl_TableLayoutBean_initWithASTableLayoutImpl_(ASTableLayoutImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASTableLayoutImpl_TableLayoutBean)

#endif

#if !defined (ASTableLayoutImpl_TableLayoutParamsBean_) && (INCLUDE_ALL_TableLayoutImpl || defined(INCLUDE_ASTableLayoutImpl_TableLayoutParamsBean))
#define ASTableLayoutImpl_TableLayoutParamsBean_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupParamsBean 1
#include "ViewGroupImpl.h"

@class ASTableLayoutImpl;
@protocol ASIWidget;

@interface ASTableLayoutImpl_TableLayoutParamsBean : ASViewGroupImpl_ViewGroupParamsBean

#pragma mark Public

- (instancetype)initWithASTableLayoutImpl:(ASTableLayoutImpl *)outer$;

- (id)getLayoutGravityWithASIWidget:(id<ASIWidget>)w;

- (id)getLayoutWeightWithASIWidget:(id<ASIWidget>)w;

- (void)setLayoutGravityWithASIWidget:(id<ASIWidget>)w
                         withNSString:(NSString *)value;

- (void)setLayoutWeightWithASIWidget:(id<ASIWidget>)w
                           withFloat:(jfloat)value;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASTableLayoutImpl_TableLayoutParamsBean)

FOUNDATION_EXPORT void ASTableLayoutImpl_TableLayoutParamsBean_initWithASTableLayoutImpl_(ASTableLayoutImpl_TableLayoutParamsBean *self, ASTableLayoutImpl *outer$);

FOUNDATION_EXPORT ASTableLayoutImpl_TableLayoutParamsBean *new_ASTableLayoutImpl_TableLayoutParamsBean_initWithASTableLayoutImpl_(ASTableLayoutImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTableLayoutImpl_TableLayoutParamsBean *create_ASTableLayoutImpl_TableLayoutParamsBean_initWithASTableLayoutImpl_(ASTableLayoutImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASTableLayoutImpl_TableLayoutParamsBean)

#endif

#if !defined (ASTableLayoutImpl_TableLayoutCommandParamsBuilder_) && (INCLUDE_ALL_TableLayoutImpl || defined(INCLUDE_ASTableLayoutImpl_TableLayoutCommandParamsBuilder))
#define ASTableLayoutImpl_TableLayoutCommandParamsBuilder_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupCommandParamsBuilder 1
#include "ViewGroupImpl.h"

@class ASTableLayoutImpl;

@interface ASTableLayoutImpl_TableLayoutCommandParamsBuilder : ASViewGroupImpl_ViewGroupCommandParamsBuilder

#pragma mark Public

- (instancetype)initWithASTableLayoutImpl:(ASTableLayoutImpl *)outer$;

- (id)getLayoutGravity;

- (id)getLayoutWeight;

- (ASTableLayoutImpl_TableLayoutCommandParamsBuilder *)reset;

- (ASTableLayoutImpl_TableLayoutCommandParamsBuilder *)setLayoutGravityWithNSString:(NSString *)value;

- (ASTableLayoutImpl_TableLayoutCommandParamsBuilder *)setLayoutMarginBottomWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandParamsBuilder *)setLayoutMarginEndWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandParamsBuilder *)setLayoutMarginHorizontalWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandParamsBuilder *)setLayoutMarginLeftWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandParamsBuilder *)setLayoutMarginRightWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandParamsBuilder *)setLayoutMarginStartWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandParamsBuilder *)setLayoutMarginTopWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandParamsBuilder *)setLayoutMarginVerticalWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandParamsBuilder *)setLayoutMarginWithNSString:(NSString *)arg0;

- (ASTableLayoutImpl_TableLayoutCommandParamsBuilder *)setLayoutWeightWithFloat:(jfloat)value;

- (ASTableLayoutImpl_TableLayoutCommandParamsBuilder *)tryGetLayoutGravity;

- (ASTableLayoutImpl_TableLayoutCommandParamsBuilder *)tryGetLayoutMarginBottom;

- (ASTableLayoutImpl_TableLayoutCommandParamsBuilder *)tryGetLayoutMarginEnd;

- (ASTableLayoutImpl_TableLayoutCommandParamsBuilder *)tryGetLayoutMarginLeft;

- (ASTableLayoutImpl_TableLayoutCommandParamsBuilder *)tryGetLayoutMarginRight;

- (ASTableLayoutImpl_TableLayoutCommandParamsBuilder *)tryGetLayoutMarginStart;

- (ASTableLayoutImpl_TableLayoutCommandParamsBuilder *)tryGetLayoutMarginTop;

- (ASTableLayoutImpl_TableLayoutCommandParamsBuilder *)tryGetLayoutWeight;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASTableLayoutImpl_TableLayoutCommandParamsBuilder)

FOUNDATION_EXPORT void ASTableLayoutImpl_TableLayoutCommandParamsBuilder_initWithASTableLayoutImpl_(ASTableLayoutImpl_TableLayoutCommandParamsBuilder *self, ASTableLayoutImpl *outer$);

FOUNDATION_EXPORT ASTableLayoutImpl_TableLayoutCommandParamsBuilder *new_ASTableLayoutImpl_TableLayoutCommandParamsBuilder_initWithASTableLayoutImpl_(ASTableLayoutImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTableLayoutImpl_TableLayoutCommandParamsBuilder *create_ASTableLayoutImpl_TableLayoutCommandParamsBuilder_initWithASTableLayoutImpl_(ASTableLayoutImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASTableLayoutImpl_TableLayoutCommandParamsBuilder)

#endif

#pragma pop_macro("INCLUDE_ALL_TableLayoutImpl")
