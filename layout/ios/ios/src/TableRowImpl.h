//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\ios_widget_library\src\main\java\com\ashera\layout\TableRowImpl.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_TableRowImpl")
#ifdef RESTRICT_TableRowImpl
#define INCLUDE_ALL_TableRowImpl 0
#else
#define INCLUDE_ALL_TableRowImpl 1
#endif
#undef RESTRICT_TableRowImpl

#if !defined (ASTableRowImpl_) && (INCLUDE_ALL_TableRowImpl || defined(INCLUDE_ASTableRowImpl))
#define ASTableRowImpl_

#define RESTRICT_BaseHasWidgets 1
#define INCLUDE_ASBaseHasWidgets 1
#include "BaseHasWidgets.h"

@class ASTableRowImpl_TableRowBean;
@class ASTableRowImpl_TableRowCommandBuilder;
@class ASTableRowImpl_TableRowCommandParamsBuilder;
@class ASTableRowImpl_TableRowParamsBean;
@class ASWidgetAttribute;
@class IOSClass;
@protocol ASIFragment;
@protocol ASILifeCycleDecorator;
@protocol ASIWidget;
@protocol JavaUtilMap;

@interface ASTableRowImpl : ASBaseHasWidgets
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

- (ASTableRowImpl_TableRowBean *)getBean;

- (ASTableRowImpl_TableRowCommandBuilder *)getBuilder;

- (id)getChildAttributeWithASIWidget:(id<ASIWidget>)w
               withASWidgetAttribute:(ASWidgetAttribute *)key;

- (ASTableRowImpl_TableRowParamsBean *)getParamsBean;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)getParamsBuilder;

- (id)getPluginWithNSString:(NSString *)plugin;

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

J2OBJC_EMPTY_STATIC_INIT(ASTableRowImpl)

inline NSString *ASTableRowImpl_get_LOCAL_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASTableRowImpl_LOCAL_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASTableRowImpl, LOCAL_NAME, NSString *)

inline NSString *ASTableRowImpl_get_GROUP_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASTableRowImpl_GROUP_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASTableRowImpl, GROUP_NAME, NSString *)

FOUNDATION_EXPORT void ASTableRowImpl_init(ASTableRowImpl *self);

FOUNDATION_EXPORT ASTableRowImpl *new_ASTableRowImpl_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTableRowImpl *create_ASTableRowImpl_init(void);

FOUNDATION_EXPORT void ASTableRowImpl_initWithNSString_(ASTableRowImpl *self, NSString *localname);

FOUNDATION_EXPORT ASTableRowImpl *new_ASTableRowImpl_initWithNSString_(NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTableRowImpl *create_ASTableRowImpl_initWithNSString_(NSString *localname);

FOUNDATION_EXPORT void ASTableRowImpl_initWithNSString_withNSString_(ASTableRowImpl *self, NSString *groupName, NSString *localname);

FOUNDATION_EXPORT ASTableRowImpl *new_ASTableRowImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTableRowImpl *create_ASTableRowImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname);

J2OBJC_TYPE_LITERAL_HEADER(ASTableRowImpl)

@compatibility_alias ComAsheraLayoutTableRowImpl ASTableRowImpl;

#endif

#if !defined (ASTableRowImpl_TableRowExt_) && (INCLUDE_ALL_TableRowImpl || defined(INCLUDE_ASTableRowImpl_TableRowExt))
#define ASTableRowImpl_TableRowExt_

#define RESTRICT_TableRow 1
#define INCLUDE_ADTableRow 1
#include "TableRow.h"

#define RESTRICT_ILifeCycleDecorator 1
#define INCLUDE_ASILifeCycleDecorator 1
#include "ILifeCycleDecorator.h"

#define RESTRICT_IMaxDimension 1
#define INCLUDE_ASIMaxDimension 1
#include "IMaxDimension.h"

@class ADRect;
@class ADView;
@class ASTableRowImpl;
@class ASWidgetAttribute;
@class IOSIntArray;
@class IOSObjectArray;
@protocol ASIWidget;
@protocol JavaUtilList;

@interface ASTableRowImpl_TableRowExt : ADTableRow < ASILifeCycleDecorator, ASIMaxDimension >

#pragma mark Public

- (instancetype)initWithASTableRowImpl:(ASTableRowImpl *)outer$;

- (void)drawableStateChanged;

- (void)executeWithNSString:(NSString *)method
          withNSObjectArray:(IOSObjectArray *)canvas;

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)widgetAttribute;

- (void)getLocationOnScreenWithIntArray:(IOSIntArray *)appScreenLocation;

- (jint)getMaxHeight;

- (jint)getMaxWidth;

- (id<JavaUtilList>)getMethods;

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

- (void)setVisibilityWithInt:(jint)visibility;

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

J2OBJC_EMPTY_STATIC_INIT(ASTableRowImpl_TableRowExt)

FOUNDATION_EXPORT void ASTableRowImpl_TableRowExt_initWithASTableRowImpl_(ASTableRowImpl_TableRowExt *self, ASTableRowImpl *outer$);

FOUNDATION_EXPORT ASTableRowImpl_TableRowExt *new_ASTableRowImpl_TableRowExt_initWithASTableRowImpl_(ASTableRowImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTableRowImpl_TableRowExt *create_ASTableRowImpl_TableRowExt_initWithASTableRowImpl_(ASTableRowImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASTableRowImpl_TableRowExt)

#endif

#if !defined (ASTableRowImpl_TableRowCommandBuilder_) && (INCLUDE_ALL_TableRowImpl || defined(INCLUDE_ASTableRowImpl_TableRowCommandBuilder))
#define ASTableRowImpl_TableRowCommandBuilder_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupCommandBuilder 1
#include "ViewGroupImpl.h"

@class ASTableRowImpl;

@interface ASTableRowImpl_TableRowCommandBuilder : ASViewGroupImpl_ViewGroupCommandBuilder

#pragma mark Public

- (instancetype)initWithASTableRowImpl:(ASTableRowImpl *)outer$;

- (ASTableRowImpl_TableRowCommandBuilder *)addAllModelWithId:(id)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)addModelByIndexWithId:(id)arg0
                                                          withId:(id)arg1;

- (ASTableRowImpl_TableRowCommandBuilder *)addModelWithId:(id)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)executeWithBoolean:(jboolean)setter;

- (id)getGravity;

- (id)getWeightSum;

- (ASTableRowImpl_TableRowCommandBuilder *)invalidate;

- (ASTableRowImpl_TableRowCommandBuilder *)notifyDataSetChangedWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)refreshUiFromModelWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)removeModelAtIndexWithInt:(jint)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)removeModelByIdWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)requestLayout;

- (ASTableRowImpl_TableRowCommandBuilder *)reset;

- (ASTableRowImpl_TableRowCommandBuilder *)setAddStatesFromChildrenWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setAlphaWithFloat:(jfloat)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setAsDragSourceWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setAttributeUnderTestWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setBackgroundRepeatWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setBackgroundTintModeWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setBackgroundTintWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setBackgroundWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setChildXmlWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setClickableWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setClipChildrenWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setClipToPaddingWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setContentDescriptionWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setCustomErrorMessageKeysWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setCustomErrorMessageValuesWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setDuplicateParentStateWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setEnabledWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setErrorStyleWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setFocusableWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setForegroundGravityWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setForegroundRepeatWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setForegroundTintModeWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setForegroundTintWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setForegroundWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setGravityWithNSString:(NSString *)value;

- (ASTableRowImpl_TableRowCommandBuilder *)setIdWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setInvalidateOnFrameChangeWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosAccessibilityHintWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosAccessibilityIgnoresInvertColorsWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosAccessibilityLabelWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosAccessibilityTraitsWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosAccessibilityValueWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosAlphaWithFloat:(jfloat)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosAutoresizesSubviewsWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosBackgroundColorWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosClearsContextBeforeDrawingWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosClipsToBoundsWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosContentScaleFactorWithFloat:(jfloat)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosInsetsLayoutMarginsFromSafeAreaWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosIsAccessibilityElementWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosIsExclusiveTouchWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosIsHiddenWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosIsMultipleTouchEnabledWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosIsOpaqueWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosIsUserInteractionEnabledWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosLargeContentImageWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosLargeContentTitleWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosLayerBorderColorWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosLayerBorderWidthWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosLayerCornerRadiusWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosLayerMasksToBoundsWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosPreservesSuperviewLayoutMarginsWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosRestorationIdentifierWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosScalesLargeContentImageWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosShowsLargeContentViewerWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosTagWithInt:(jint)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosTintColorWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setIosTranslatesAutoresizingMaskIntoConstraintsWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setKeepScreenOnWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setLayoutDirectionWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setLayoutModeWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setListitemWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setLongClickableWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setMaxHeightWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setMaxWidthWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setMinHeightWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setMinWidthWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setModelDescPathWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setModelForWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setModelIdPathWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setModelParamWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setModelPojoToUiParamsWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setModelPojoToUiWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setModelSyncEventsWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setModelUiToPojoEventIdsWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setModelUiToPojoWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setOnChildViewAddedWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setOnChildViewRemovedWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setOnClickWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setOnDragWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setOnKeyWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setOnLongClickWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setOnSwipedWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setOnTouchWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setOutsideTouchableWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setPaddingBottomWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setPaddingEndWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setPaddingHorizontalWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setPaddingLeftWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setPaddingRightWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setPaddingStartWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setPaddingTopWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setPaddingVerticalWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setPaddingWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setRotationWithFloat:(jfloat)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setRotationXWithFloat:(jfloat)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setRotationYWithFloat:(jfloat)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setScaleXWithFloat:(jfloat)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setScaleYWithFloat:(jfloat)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setSelectedWithBoolean:(jboolean)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setStyleWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setTextAlignmentWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setTextDirectionWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setTransformPivotXWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setTransformPivotYWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setTranslationXWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setTranslationYWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setTranslationZWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setV_maxlengthWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setV_maxWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setV_minlengthWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setV_minWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setV_patternWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setV_requiredWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setV_typeWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setValidationErrorDisplayTypeWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setValidationWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setVisibilityWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)setWeightSumWithFloat:(jfloat)value;

- (ASTableRowImpl_TableRowCommandBuilder *)setZIndexWithInt:(jint)arg0;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetAddStatesFromChildren;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetAlpha;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetBackground;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetBackgroundTint;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetBackgroundTintMode;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetClickable;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetClipChildren;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetClipToPadding;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetContentDescription;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetDuplicateParentState;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetEnabled;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetFocusable;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetForeground;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetForegroundGravity;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetForegroundTint;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetForegroundTintMode;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetGravity;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetId;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosAccessibilityHint;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosAccessibilityIgnoresInvertColors;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosAccessibilityLabel;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosAccessibilityTraits;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosAccessibilityValue;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosAlpha;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosAutoresizesSubviews;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosBackgroundColor;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosClearsContextBeforeDrawing;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosClipsToBounds;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosContentScaleFactor;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosInsetsLayoutMarginsFromSafeArea;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosIsAccessibilityElement;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosIsExclusiveTouch;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosIsFocused;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosIsHidden;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosIsMultipleTouchEnabled;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosIsOpaque;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosIsUserInteractionEnabled;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosLargeContentImage;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosLargeContentTitle;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosPreservesSuperviewLayoutMargins;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosRestorationIdentifier;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosScalesLargeContentImage;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosShowsLargeContentViewer;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosTag;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosTintColor;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetIosTranslatesAutoresizingMaskIntoConstraints;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetKeepScreenOn;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetLayoutDirection;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetLayoutMode;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetLongClickable;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetMaxHeight;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetMaxWidth;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetMinHeight;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetMinWidth;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetModelDescPath;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetModelIdPath;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetModelParam;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetModelPojoToUi;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetModelSyncEvents;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetModelUiToPojo;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetPaddingBottom;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetPaddingEnd;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetPaddingLeft;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetPaddingRight;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetPaddingStart;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetPaddingTop;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetRotation;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetRotationX;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetRotationY;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetScaleX;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetScaleY;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetSelected;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetTextAlignment;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetTextDirection;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetTransformPivotX;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetTransformPivotY;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetTranslationX;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetTranslationY;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetTranslationZ;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetValidateForm;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetVisibility;

- (ASTableRowImpl_TableRowCommandBuilder *)tryGetWeightSum;

- (ASTableRowImpl_TableRowCommandBuilder *)updateModelDataWithNSString:(NSString *)arg0
                                                                withId:(id)arg1;

- (ASTableRowImpl_TableRowCommandBuilder *)validateFormWithNSString:(NSString *)arg0;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASTableRowImpl_TableRowCommandBuilder)

FOUNDATION_EXPORT void ASTableRowImpl_TableRowCommandBuilder_initWithASTableRowImpl_(ASTableRowImpl_TableRowCommandBuilder *self, ASTableRowImpl *outer$);

FOUNDATION_EXPORT ASTableRowImpl_TableRowCommandBuilder *new_ASTableRowImpl_TableRowCommandBuilder_initWithASTableRowImpl_(ASTableRowImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTableRowImpl_TableRowCommandBuilder *create_ASTableRowImpl_TableRowCommandBuilder_initWithASTableRowImpl_(ASTableRowImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASTableRowImpl_TableRowCommandBuilder)

#endif

#if !defined (ASTableRowImpl_TableRowBean_) && (INCLUDE_ALL_TableRowImpl || defined(INCLUDE_ASTableRowImpl_TableRowBean))
#define ASTableRowImpl_TableRowBean_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupBean 1
#include "ViewGroupImpl.h"

@class ASTableRowImpl;
@protocol ASIWidget;

@interface ASTableRowImpl_TableRowBean : ASViewGroupImpl_ViewGroupBean

#pragma mark Public

- (instancetype)initWithASTableRowImpl:(ASTableRowImpl *)outer$;

- (id)getGravity;

- (id)getWeightSum;

- (void)setGravityWithNSString:(NSString *)value;

- (void)setWeightSumWithFloat:(jfloat)value;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithASIWidget:(id<ASIWidget>)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASTableRowImpl_TableRowBean)

FOUNDATION_EXPORT void ASTableRowImpl_TableRowBean_initWithASTableRowImpl_(ASTableRowImpl_TableRowBean *self, ASTableRowImpl *outer$);

FOUNDATION_EXPORT ASTableRowImpl_TableRowBean *new_ASTableRowImpl_TableRowBean_initWithASTableRowImpl_(ASTableRowImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTableRowImpl_TableRowBean *create_ASTableRowImpl_TableRowBean_initWithASTableRowImpl_(ASTableRowImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASTableRowImpl_TableRowBean)

#endif

#if !defined (ASTableRowImpl_TableRowParamsBean_) && (INCLUDE_ALL_TableRowImpl || defined(INCLUDE_ASTableRowImpl_TableRowParamsBean))
#define ASTableRowImpl_TableRowParamsBean_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupParamsBean 1
#include "ViewGroupImpl.h"

@class ASTableRowImpl;
@protocol ASIWidget;

@interface ASTableRowImpl_TableRowParamsBean : ASViewGroupImpl_ViewGroupParamsBean

#pragma mark Public

- (instancetype)initWithASTableRowImpl:(ASTableRowImpl *)outer$;

- (id)getLayoutColumnWithASIWidget:(id<ASIWidget>)w;

- (id)getLayoutGravityWithASIWidget:(id<ASIWidget>)w;

- (id)getLayoutSpanWithASIWidget:(id<ASIWidget>)w;

- (id)getLayoutWeightWithASIWidget:(id<ASIWidget>)w;

- (void)setLayoutColumnWithASIWidget:(id<ASIWidget>)w
                             withInt:(jint)value;

- (void)setLayoutGravityWithASIWidget:(id<ASIWidget>)w
                         withNSString:(NSString *)value;

- (void)setLayoutSpanWithASIWidget:(id<ASIWidget>)w
                           withInt:(jint)value;

- (void)setLayoutWeightWithASIWidget:(id<ASIWidget>)w
                           withFloat:(jfloat)value;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASTableRowImpl_TableRowParamsBean)

FOUNDATION_EXPORT void ASTableRowImpl_TableRowParamsBean_initWithASTableRowImpl_(ASTableRowImpl_TableRowParamsBean *self, ASTableRowImpl *outer$);

FOUNDATION_EXPORT ASTableRowImpl_TableRowParamsBean *new_ASTableRowImpl_TableRowParamsBean_initWithASTableRowImpl_(ASTableRowImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTableRowImpl_TableRowParamsBean *create_ASTableRowImpl_TableRowParamsBean_initWithASTableRowImpl_(ASTableRowImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASTableRowImpl_TableRowParamsBean)

#endif

#if !defined (ASTableRowImpl_TableRowCommandParamsBuilder_) && (INCLUDE_ALL_TableRowImpl || defined(INCLUDE_ASTableRowImpl_TableRowCommandParamsBuilder))
#define ASTableRowImpl_TableRowCommandParamsBuilder_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupCommandParamsBuilder 1
#include "ViewGroupImpl.h"

@class ASTableRowImpl;

@interface ASTableRowImpl_TableRowCommandParamsBuilder : ASViewGroupImpl_ViewGroupCommandParamsBuilder

#pragma mark Public

- (instancetype)initWithASTableRowImpl:(ASTableRowImpl *)outer$;

- (id)getLayoutColumn;

- (id)getLayoutGravity;

- (id)getLayoutSpan;

- (id)getLayoutWeight;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)reset;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)setLayoutColumnWithInt:(jint)value;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)setLayoutGravityWithNSString:(NSString *)value;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)setLayoutMarginBottomWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)setLayoutMarginEndWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)setLayoutMarginHorizontalWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)setLayoutMarginLeftWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)setLayoutMarginRightWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)setLayoutMarginStartWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)setLayoutMarginTopWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)setLayoutMarginVerticalWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)setLayoutMarginWithNSString:(NSString *)arg0;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)setLayoutSpanWithInt:(jint)value;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)setLayoutWeightWithFloat:(jfloat)value;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)tryGetLayoutColumn;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)tryGetLayoutGravity;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)tryGetLayoutMarginBottom;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)tryGetLayoutMarginEnd;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)tryGetLayoutMarginLeft;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)tryGetLayoutMarginRight;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)tryGetLayoutMarginStart;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)tryGetLayoutMarginTop;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)tryGetLayoutSpan;

- (ASTableRowImpl_TableRowCommandParamsBuilder *)tryGetLayoutWeight;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASTableRowImpl_TableRowCommandParamsBuilder)

FOUNDATION_EXPORT void ASTableRowImpl_TableRowCommandParamsBuilder_initWithASTableRowImpl_(ASTableRowImpl_TableRowCommandParamsBuilder *self, ASTableRowImpl *outer$);

FOUNDATION_EXPORT ASTableRowImpl_TableRowCommandParamsBuilder *new_ASTableRowImpl_TableRowCommandParamsBuilder_initWithASTableRowImpl_(ASTableRowImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTableRowImpl_TableRowCommandParamsBuilder *create_ASTableRowImpl_TableRowCommandParamsBuilder_initWithASTableRowImpl_(ASTableRowImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASTableRowImpl_TableRowCommandParamsBuilder)

#endif

#pragma pop_macro("INCLUDE_ALL_TableRowImpl")
