//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\ios_widget_library\src\main\java\com\ashera\layout\ProgressBarImpl.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ProgressBarImpl")
#ifdef RESTRICT_ProgressBarImpl
#define INCLUDE_ALL_ProgressBarImpl 0
#else
#define INCLUDE_ALL_ProgressBarImpl 1
#endif
#undef RESTRICT_ProgressBarImpl

#if !defined (ASProgressBarImpl_) && (INCLUDE_ALL_ProgressBarImpl || defined(INCLUDE_ASProgressBarImpl))
#define ASProgressBarImpl_

#define RESTRICT_BaseWidget 1
#define INCLUDE_ASBaseWidget 1
#include "BaseWidget.h"

#define RESTRICT_ICustomMeasureHeight 1
#define INCLUDE_ASICustomMeasureHeight 1
#include "ICustomMeasureHeight.h"

#define RESTRICT_ICustomMeasureWidth 1
#define INCLUDE_ASICustomMeasureWidth 1
#include "ICustomMeasureWidth.h"

@class ADProgressBar;
@class ASProgressBarImpl_ProgressBarBean;
@class ASProgressBarImpl_ProgressBarCommandBuilder;
@class ASWidgetAttribute;
@class IOSClass;
@protocol ASIFragment;
@protocol ASILifeCycleDecorator;
@protocol ASIWidget;
@protocol JavaUtilMap;

@interface ASProgressBarImpl : ASBaseWidget < ASICustomMeasureHeight, ASICustomMeasureWidth > {
 @public
  id uiView_;
  ADProgressBar *measurableView_;
}
@property id uiView;

#pragma mark Public

- (instancetype)init;

- (instancetype)initWithNSString:(NSString *)localname;

- (instancetype)initWithNSString:(NSString *)groupName
                    withNSString:(NSString *)localname;

- (void)addForegroundIfNeeded;

- (id)asNativeWidget;

- (id)asWidget;

- (jboolean)checkIosVersionWithNSString:(NSString *)v;

- (void)createWithASIFragment:(id<ASIFragment>)fragment
              withJavaUtilMap:(id<JavaUtilMap>)params;

- (id)createWrapperViewWithId:(id)wrapperParent
                      withInt:(jint)viewtype;

- (id)createWrapperViewHolderWithInt:(jint)viewType;

- (id)createWrapperViewHolderNativeWithInt:(jint)viewType;

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
              withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (ASProgressBarImpl_ProgressBarBean *)getBean;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)getBuilder;

- (id)getColor;

- (id)getForeground;

- (id)getHidesWhenStopped;

- (id)getPluginWithNSString:(NSString *)plugin;

- (IOSClass *)getViewClass;

- (void)invalidate;

- (void)loadAttributesWithNSString:(NSString *)attributeName;

- (jint)measureHeightWithInt:(jint)width;

- (jint)measureWidth;

- (id)nativeAddForeGroundWithASIWidget:(id<ASIWidget>)w;

- (id<ASIWidget>)newInstance OBJC_METHOD_FAMILY_NONE;

- (void)requestLayout;

- (void)setAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
                             withNSString:(NSString *)strValue
                                   withId:(id)objValue
                withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (void)setColorWithId:(id)nativeWidget
                withId:(id)value;

- (void)setHidesWhenStoppedWithId:(id)nativeWidget
                           withId:(id)value;

- (void)setIdWithNSString:(NSString *)id_;

- (void)setVisibleWithBoolean:(jboolean)b;

@end

J2OBJC_EMPTY_STATIC_INIT(ASProgressBarImpl)

J2OBJC_FIELD_SETTER(ASProgressBarImpl, uiView_, id)
J2OBJC_FIELD_SETTER(ASProgressBarImpl, measurableView_, ADProgressBar *)

inline NSString *ASProgressBarImpl_get_LOCAL_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASProgressBarImpl_LOCAL_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASProgressBarImpl, LOCAL_NAME, NSString *)

inline NSString *ASProgressBarImpl_get_GROUP_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASProgressBarImpl_GROUP_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASProgressBarImpl, GROUP_NAME, NSString *)

FOUNDATION_EXPORT void ASProgressBarImpl_init(ASProgressBarImpl *self);

FOUNDATION_EXPORT ASProgressBarImpl *new_ASProgressBarImpl_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASProgressBarImpl *create_ASProgressBarImpl_init(void);

FOUNDATION_EXPORT void ASProgressBarImpl_initWithNSString_(ASProgressBarImpl *self, NSString *localname);

FOUNDATION_EXPORT ASProgressBarImpl *new_ASProgressBarImpl_initWithNSString_(NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASProgressBarImpl *create_ASProgressBarImpl_initWithNSString_(NSString *localname);

FOUNDATION_EXPORT void ASProgressBarImpl_initWithNSString_withNSString_(ASProgressBarImpl *self, NSString *groupName, NSString *localname);

FOUNDATION_EXPORT ASProgressBarImpl *new_ASProgressBarImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASProgressBarImpl *create_ASProgressBarImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname);

J2OBJC_TYPE_LITERAL_HEADER(ASProgressBarImpl)

@compatibility_alias ComAsheraLayoutProgressBarImpl ASProgressBarImpl;

#endif

#if !defined (ASProgressBarImpl_ProgressBarExt_) && (INCLUDE_ALL_ProgressBarImpl || defined(INCLUDE_ASProgressBarImpl_ProgressBarExt))
#define ASProgressBarImpl_ProgressBarExt_

#define RESTRICT_ProgressBar 1
#define INCLUDE_ADProgressBar 1
#include "ProgressBar.h"

#define RESTRICT_ILifeCycleDecorator 1
#define INCLUDE_ASILifeCycleDecorator 1
#include "ILifeCycleDecorator.h"

#define RESTRICT_IMaxDimension 1
#define INCLUDE_ASIMaxDimension 1
#include "IMaxDimension.h"

@class ADContext;
@class ADRect;
@class ADView;
@class ASProgressBarImpl;
@class ASWidgetAttribute;
@class IOSIntArray;
@class IOSObjectArray;
@protocol ASIWidget;
@protocol JavaUtilList;

@interface ASProgressBarImpl_ProgressBarExt : ADProgressBar < ASILifeCycleDecorator, ASIMaxDimension >

#pragma mark Public

- (instancetype)initWithASProgressBarImpl:(ASProgressBarImpl *)outer$;

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

- (jint)nativeMeasureHeightWithId:(id)uiView
                          withInt:(jint)width;

- (jint)nativeMeasureWidthWithId:(id)uiView;

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

- (instancetype)initWithADContext:(ADContext *)arg0 NS_UNAVAILABLE;

- (instancetype)initWithASIWidget:(id<ASIWidget>)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASProgressBarImpl_ProgressBarExt)

FOUNDATION_EXPORT void ASProgressBarImpl_ProgressBarExt_initWithASProgressBarImpl_(ASProgressBarImpl_ProgressBarExt *self, ASProgressBarImpl *outer$);

FOUNDATION_EXPORT ASProgressBarImpl_ProgressBarExt *new_ASProgressBarImpl_ProgressBarExt_initWithASProgressBarImpl_(ASProgressBarImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASProgressBarImpl_ProgressBarExt *create_ASProgressBarImpl_ProgressBarExt_initWithASProgressBarImpl_(ASProgressBarImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASProgressBarImpl_ProgressBarExt)

#endif

#if !defined (ASProgressBarImpl_ProgressBarCommandBuilder_) && (INCLUDE_ALL_ProgressBarImpl || defined(INCLUDE_ASProgressBarImpl_ProgressBarCommandBuilder))
#define ASProgressBarImpl_ProgressBarCommandBuilder_

#define RESTRICT_ViewImpl 1
#define INCLUDE_ASViewImpl_ViewCommandBuilder 1
#include "ViewImpl.h"

@class ASProgressBarImpl;

@interface ASProgressBarImpl_ProgressBarCommandBuilder : ASViewImpl_ViewCommandBuilder

#pragma mark Public

- (instancetype)initWithASProgressBarImpl:(ASProgressBarImpl *)outer$;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)animatorXmlWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)endAnimator;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)executeWithBoolean:(jboolean)setter;

- (id)getIosColor;

- (id)getPaddingBottom;

- (id)getPaddingEnd;

- (id)getPaddingLeft;

- (id)getPaddingRight;

- (id)getPaddingStart;

- (id)getPaddingTop;

- (id)getProgressTint;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)invalidate;

- (id)isIosHidesWhenStopped;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)notifyDataSetChangedWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)refreshUiFromModelWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)requestLayout;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)reset;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setAlphaWithFloat:(jfloat)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setAsDragSourceWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setAttributeUnderTestWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setBackgroundRepeatWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setBackgroundTintModeWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setBackgroundTintWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setBackgroundWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setBottomWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setClickableWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setContentDescriptionWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setCustomErrorMessageKeysWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setCustomErrorMessageValuesWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setDuplicateParentStateWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setElevationWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setEnabledWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setErrorStyleWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setFocusableWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setForegroundGravityWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setForegroundRepeatWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setForegroundTintModeWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setForegroundTintWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setForegroundWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIdWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setInvalidateOnFrameChangeWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosAccessibilityHintWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosAccessibilityIgnoresInvertColorsWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosAccessibilityLabelWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosAccessibilityTraitsWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosAccessibilityValueWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosAlphaWithFloat:(jfloat)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosAutoresizesSubviewsWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosBackgroundColorWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosClearsContextBeforeDrawingWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosClipsToBoundsWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosColorWithNSString:(NSString *)value;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosContentScaleFactorWithFloat:(jfloat)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosHidesWhenStoppedWithBoolean:(jboolean)value;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosInsetsLayoutMarginsFromSafeAreaWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosIsAccessibilityElementWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosIsExclusiveTouchWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosIsHiddenWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosIsMultipleTouchEnabledWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosIsOpaqueWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosIsUserInteractionEnabledWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosLargeContentImageWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosLargeContentTitleWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosLayerBorderColorWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosLayerBorderWidthWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosLayerCornerRadiusWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosLayerMasksToBoundsWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosPreservesSuperviewLayoutMarginsWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosRestorationIdentifierWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosScalesLargeContentImageWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosShowsLargeContentViewerWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosTagWithInt:(jint)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosTintColorWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setIosTranslatesAutoresizingMaskIntoConstraintsWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setKeepScreenOnWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setLayoutDirectionWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setLeftWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setLongClickableWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setMaxHeightWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setMaxWidthWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setMinHeightWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setMinWidthWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setModelParamWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setModelPojoToUiParamsWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setModelPojoToUiWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setModelSyncEventsWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setModelUiToPojoEventIdsWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setModelUiToPojoWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setOnAnimationCancelWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setOnAnimationEndWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setOnAnimationRepeatWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setOnAnimationStartWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setOnClickWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setOnDragWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setOnKeyWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setOnLongClickWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setOnSwipedWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setOnTouchWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setOutsideTouchableWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setPaddingWithNSString:(NSString *)value;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setPaddingBottomWithNSString:(NSString *)value;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setPaddingEndWithNSString:(NSString *)value;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setPaddingHorizontalWithNSString:(NSString *)value;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setPaddingLeftWithNSString:(NSString *)value;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setPaddingRightWithNSString:(NSString *)value;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setPaddingStartWithNSString:(NSString *)value;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setPaddingTopWithNSString:(NSString *)value;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setPaddingVerticalWithNSString:(NSString *)value;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setProgressTintWithNSString:(NSString *)value;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setRightWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setRotationWithFloat:(jfloat)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setRotationXWithFloat:(jfloat)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setRotationYWithFloat:(jfloat)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setScaleXWithFloat:(jfloat)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setScaleYWithFloat:(jfloat)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setSelectedWithBoolean:(jboolean)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setStyleWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setTextAlignmentWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setTextDirectionWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setTopWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setTransformPivotXWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setTransformPivotYWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setTranslationXWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setTranslationYWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setTranslationZWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setV_maxlengthWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setV_maxWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setV_minlengthWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setV_minWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setV_patternWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setV_requiredWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setV_typeWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setValidationErrorDisplayTypeWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setValidationWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setVisibilityWithNSString:(NSString *)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)setZIndexWithInt:(jint)arg0;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)startAnimator;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetAlpha;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetBackground;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetBackgroundTint;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetBackgroundTintMode;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetBottom;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetClickable;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetContentDescription;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetDuplicateParentState;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetEnabled;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetFocusable;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetForeground;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetForegroundGravity;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetForegroundTint;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetForegroundTintMode;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetId;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosAccessibilityHint;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosAccessibilityIgnoresInvertColors;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosAccessibilityLabel;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosAccessibilityTraits;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosAccessibilityValue;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosAlpha;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosAutoresizesSubviews;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosBackgroundColor;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosClearsContextBeforeDrawing;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosClipsToBounds;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosColor;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosContentScaleFactor;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosHidesWhenStopped;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosInsetsLayoutMarginsFromSafeArea;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosIsAccessibilityElement;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosIsExclusiveTouch;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosIsFocused;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosIsHidden;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosIsMultipleTouchEnabled;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosIsOpaque;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosIsUserInteractionEnabled;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosLargeContentImage;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosLargeContentTitle;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosPreservesSuperviewLayoutMargins;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosRestorationIdentifier;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosScalesLargeContentImage;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosShowsLargeContentViewer;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosTag;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosTintColor;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetIosTranslatesAutoresizingMaskIntoConstraints;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetKeepScreenOn;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetLayoutDirection;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetLeft;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetLongClickable;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetMaxHeight;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetMaxWidth;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetMinHeight;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetMinWidth;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetModelParam;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetModelPojoToUi;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetModelSyncEvents;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetModelUiToPojo;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetPaddingBottom;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetPaddingEnd;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetPaddingLeft;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetPaddingRight;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetPaddingStart;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetPaddingTop;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetProgressTint;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetRight;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetRotation;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetRotationX;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetRotationY;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetScaleX;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetScaleY;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetSelected;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetTextAlignment;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetTextDirection;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetTop;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetTransformPivotX;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetTransformPivotY;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetTranslationX;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetTranslationY;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetTranslationZ;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetValidateForm;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)tryGetVisibility;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)updateModelDataWithNSString:(NSString *)arg0
                                                                      withId:(id)arg1;

- (ASProgressBarImpl_ProgressBarCommandBuilder *)validateFormWithNSString:(NSString *)arg0;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASProgressBarImpl_ProgressBarCommandBuilder)

FOUNDATION_EXPORT void ASProgressBarImpl_ProgressBarCommandBuilder_initWithASProgressBarImpl_(ASProgressBarImpl_ProgressBarCommandBuilder *self, ASProgressBarImpl *outer$);

FOUNDATION_EXPORT ASProgressBarImpl_ProgressBarCommandBuilder *new_ASProgressBarImpl_ProgressBarCommandBuilder_initWithASProgressBarImpl_(ASProgressBarImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASProgressBarImpl_ProgressBarCommandBuilder *create_ASProgressBarImpl_ProgressBarCommandBuilder_initWithASProgressBarImpl_(ASProgressBarImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASProgressBarImpl_ProgressBarCommandBuilder)

#endif

#if !defined (ASProgressBarImpl_ProgressBarBean_) && (INCLUDE_ALL_ProgressBarImpl || defined(INCLUDE_ASProgressBarImpl_ProgressBarBean))
#define ASProgressBarImpl_ProgressBarBean_

#define RESTRICT_ViewImpl 1
#define INCLUDE_ASViewImpl_ViewBean 1
#include "ViewImpl.h"

@class ASProgressBarImpl;
@protocol ASIWidget;

@interface ASProgressBarImpl_ProgressBarBean : ASViewImpl_ViewBean

#pragma mark Public

- (instancetype)initWithASProgressBarImpl:(ASProgressBarImpl *)outer$;

- (id)getIosColor;

- (id)getPaddingBottom;

- (id)getPaddingEnd;

- (id)getPaddingLeft;

- (id)getPaddingRight;

- (id)getPaddingStart;

- (id)getPaddingTop;

- (id)getProgressTint;

- (id)isIosHidesWhenStopped;

- (void)setIosColorWithNSString:(NSString *)value;

- (void)setIosHidesWhenStoppedWithBoolean:(jboolean)value;

- (void)setPaddingWithNSString:(NSString *)value;

- (void)setPaddingBottomWithNSString:(NSString *)value;

- (void)setPaddingEndWithNSString:(NSString *)value;

- (void)setPaddingHorizontalWithNSString:(NSString *)value;

- (void)setPaddingLeftWithNSString:(NSString *)value;

- (void)setPaddingRightWithNSString:(NSString *)value;

- (void)setPaddingStartWithNSString:(NSString *)value;

- (void)setPaddingTopWithNSString:(NSString *)value;

- (void)setPaddingVerticalWithNSString:(NSString *)value;

- (void)setProgressTintWithNSString:(NSString *)value;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithASIWidget:(id<ASIWidget>)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASProgressBarImpl_ProgressBarBean)

FOUNDATION_EXPORT void ASProgressBarImpl_ProgressBarBean_initWithASProgressBarImpl_(ASProgressBarImpl_ProgressBarBean *self, ASProgressBarImpl *outer$);

FOUNDATION_EXPORT ASProgressBarImpl_ProgressBarBean *new_ASProgressBarImpl_ProgressBarBean_initWithASProgressBarImpl_(ASProgressBarImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASProgressBarImpl_ProgressBarBean *create_ASProgressBarImpl_ProgressBarBean_initWithASProgressBarImpl_(ASProgressBarImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASProgressBarImpl_ProgressBarBean)

#endif

#pragma pop_macro("INCLUDE_ALL_ProgressBarImpl")
