//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\ios_widget_library\src\main\java\com\ashera\layout\ViewOnlyImpl.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ViewOnlyImpl")
#ifdef RESTRICT_ViewOnlyImpl
#define INCLUDE_ALL_ViewOnlyImpl 0
#else
#define INCLUDE_ALL_ViewOnlyImpl 1
#endif
#undef RESTRICT_ViewOnlyImpl

#if !defined (ASViewOnlyImpl_) && (INCLUDE_ALL_ViewOnlyImpl || defined(INCLUDE_ASViewOnlyImpl))
#define ASViewOnlyImpl_

#define RESTRICT_BaseWidget 1
#define INCLUDE_ASBaseWidget 1
#include "BaseWidget.h"

@class ADFrameLayout;
@class ASViewOnlyImpl_ViewOnlyBean;
@class ASViewOnlyImpl_ViewOnlyCommandBuilder;
@class ASWidgetAttribute;
@class IOSClass;
@protocol ASIFragment;
@protocol ASILifeCycleDecorator;
@protocol ASIWidget;
@protocol JavaUtilMap;

@interface ASViewOnlyImpl : ASBaseWidget {
 @public
  id uiView_;
  ADFrameLayout *measurableView_;
}
@property id uiView;

#pragma mark Public

- (instancetype)init;

- (instancetype)initWithNSString:(NSString *)localname;

- (instancetype)initWithNSString:(NSString *)groupName
                    withNSString:(NSString *)localname;

- (id)asNativeWidget;

- (id)asWidget;

- (jboolean)checkIosVersionWithNSString:(NSString *)v;

- (void)createWithASIFragment:(id<ASIFragment>)fragment
              withJavaUtilMap:(id<JavaUtilMap>)params;

- (void)createViewWithJavaUtilMap:(id<JavaUtilMap>)params;

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
              withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (ASViewOnlyImpl_ViewOnlyBean *)getBean;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)getBuilder;

- (id)getPluginWithNSString:(NSString *)plugin;

- (IOSClass *)getViewClass;

- (void)invalidate;

- (void)loadAttributesWithNSString:(NSString *)attributeName;

- (id<ASIWidget>)newInstance OBJC_METHOD_FAMILY_NONE;

- (void)requestLayout;

- (void)setAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
                             withNSString:(NSString *)strValue
                                   withId:(id)objValue
                withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (void)setIdWithNSString:(NSString *)id_;

- (void)setVisibleWithBoolean:(jboolean)b;

@end

J2OBJC_EMPTY_STATIC_INIT(ASViewOnlyImpl)

J2OBJC_FIELD_SETTER(ASViewOnlyImpl, uiView_, id)
J2OBJC_FIELD_SETTER(ASViewOnlyImpl, measurableView_, ADFrameLayout *)

inline NSString *ASViewOnlyImpl_get_LOCAL_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASViewOnlyImpl_LOCAL_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASViewOnlyImpl, LOCAL_NAME, NSString *)

inline NSString *ASViewOnlyImpl_get_GROUP_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASViewOnlyImpl_GROUP_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASViewOnlyImpl, GROUP_NAME, NSString *)

FOUNDATION_EXPORT void ASViewOnlyImpl_init(ASViewOnlyImpl *self);

FOUNDATION_EXPORT ASViewOnlyImpl *new_ASViewOnlyImpl_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASViewOnlyImpl *create_ASViewOnlyImpl_init(void);

FOUNDATION_EXPORT void ASViewOnlyImpl_initWithNSString_(ASViewOnlyImpl *self, NSString *localname);

FOUNDATION_EXPORT ASViewOnlyImpl *new_ASViewOnlyImpl_initWithNSString_(NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASViewOnlyImpl *create_ASViewOnlyImpl_initWithNSString_(NSString *localname);

FOUNDATION_EXPORT void ASViewOnlyImpl_initWithNSString_withNSString_(ASViewOnlyImpl *self, NSString *groupName, NSString *localname);

FOUNDATION_EXPORT ASViewOnlyImpl *new_ASViewOnlyImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASViewOnlyImpl *create_ASViewOnlyImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname);

J2OBJC_TYPE_LITERAL_HEADER(ASViewOnlyImpl)

@compatibility_alias ComAsheraLayoutViewOnlyImpl ASViewOnlyImpl;

#endif

#if !defined (ASViewOnlyImpl_ViewOnlyExt_) && (INCLUDE_ALL_ViewOnlyImpl || defined(INCLUDE_ASViewOnlyImpl_ViewOnlyExt))
#define ASViewOnlyImpl_ViewOnlyExt_

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
@class ASViewOnlyImpl;
@class ASWidgetAttribute;
@class IOSIntArray;
@class IOSObjectArray;
@protocol ASIWidget;
@protocol JavaUtilList;

@interface ASViewOnlyImpl_ViewOnlyExt : ADFrameLayout < ASILifeCycleDecorator, ASIMaxDimension >

#pragma mark Public

- (instancetype)initWithASViewOnlyImpl:(ASViewOnlyImpl *)outer$;

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

J2OBJC_EMPTY_STATIC_INIT(ASViewOnlyImpl_ViewOnlyExt)

FOUNDATION_EXPORT void ASViewOnlyImpl_ViewOnlyExt_initWithASViewOnlyImpl_(ASViewOnlyImpl_ViewOnlyExt *self, ASViewOnlyImpl *outer$);

FOUNDATION_EXPORT ASViewOnlyImpl_ViewOnlyExt *new_ASViewOnlyImpl_ViewOnlyExt_initWithASViewOnlyImpl_(ASViewOnlyImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASViewOnlyImpl_ViewOnlyExt *create_ASViewOnlyImpl_ViewOnlyExt_initWithASViewOnlyImpl_(ASViewOnlyImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASViewOnlyImpl_ViewOnlyExt)

#endif

#if !defined (ASViewOnlyImpl_ViewOnlyCommandBuilder_) && (INCLUDE_ALL_ViewOnlyImpl || defined(INCLUDE_ASViewOnlyImpl_ViewOnlyCommandBuilder))
#define ASViewOnlyImpl_ViewOnlyCommandBuilder_

#define RESTRICT_ViewImpl 1
#define INCLUDE_ASViewImpl_ViewCommandBuilder 1
#include "ViewImpl.h"

@class ASViewOnlyImpl;

@interface ASViewOnlyImpl_ViewOnlyCommandBuilder : ASViewImpl_ViewCommandBuilder

#pragma mark Public

- (instancetype)initWithASViewOnlyImpl:(ASViewOnlyImpl *)outer$;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)animatorXmlWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)endAnimator;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)executeWithBoolean:(jboolean)setter;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)invalidate;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)notifyDataSetChangedWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)refreshUiFromModelWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)requestLayout;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)reset;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setAlphaWithFloat:(jfloat)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setAsDragSourceWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setAttributeUnderTestWithNSString:(NSString *)value;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setBackgroundRepeatWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setBackgroundTintModeWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setBackgroundTintWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setBackgroundWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setClickableWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setContentDescriptionWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setCustomErrorMessageKeysWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setCustomErrorMessageValuesWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setDuplicateParentStateWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setElevationWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setEnabledWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setErrorStyleWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setFocusableWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setForegroundGravityWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setForegroundRepeatWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setForegroundTintModeWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setForegroundTintWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setForegroundWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIdWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setInvalidateOnFrameChangeWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosAccessibilityHintWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosAccessibilityIgnoresInvertColorsWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosAccessibilityLabelWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosAccessibilityTraitsWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosAccessibilityValueWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosAlphaWithFloat:(jfloat)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosAutoresizesSubviewsWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosBackgroundColorWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosClearsContextBeforeDrawingWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosClipsToBoundsWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosContentScaleFactorWithFloat:(jfloat)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosInsetsLayoutMarginsFromSafeAreaWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosIsAccessibilityElementWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosIsExclusiveTouchWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosIsHiddenWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosIsMultipleTouchEnabledWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosIsOpaqueWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosIsUserInteractionEnabledWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosLargeContentImageWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosLargeContentTitleWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosLayerBorderColorWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosLayerBorderWidthWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosLayerCornerRadiusWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosLayerMasksToBoundsWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosPreservesSuperviewLayoutMarginsWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosRestorationIdentifierWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosScalesLargeContentImageWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosShowsLargeContentViewerWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosTagWithInt:(jint)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosTintColorWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setIosTranslatesAutoresizingMaskIntoConstraintsWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setKeepScreenOnWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setLayoutDirectionWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setLongClickableWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setMaxHeightWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setMaxWidthWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setMinHeightWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setMinWidthWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setModelParamWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setModelPojoToUiParamsWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setModelPojoToUiWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setModelSyncEventsWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setModelUiToPojoEventIdsWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setModelUiToPojoWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setOnAnimationCancelWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setOnAnimationEndWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setOnAnimationRepeatWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setOnAnimationStartWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setOnClickWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setOnDragWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setOnKeyWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setOnLongClickWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setOnSwipedWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setOnTouchWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setOutsideTouchableWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setRotationWithFloat:(jfloat)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setRotationXWithFloat:(jfloat)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setRotationYWithFloat:(jfloat)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setScaleXWithFloat:(jfloat)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setScaleYWithFloat:(jfloat)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setSelectedWithBoolean:(jboolean)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setStyleWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setTextAlignmentWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setTextDirectionWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setTransformPivotXWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setTransformPivotYWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setTranslationXWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setTranslationYWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setTranslationZWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setV_maxlengthWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setV_maxWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setV_minlengthWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setV_minWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setV_patternWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setV_requiredWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setV_typeWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setValidationErrorDisplayTypeWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setValidationWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setVisibilityWithNSString:(NSString *)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)setZIndexWithInt:(jint)arg0;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)startAnimator;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetAlpha;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetBackground;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetBackgroundTint;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetBackgroundTintMode;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetClickable;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetContentDescription;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetDuplicateParentState;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetEnabled;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetFocusable;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetForeground;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetForegroundGravity;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetForegroundTint;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetForegroundTintMode;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetId;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosAccessibilityHint;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosAccessibilityIgnoresInvertColors;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosAccessibilityLabel;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosAccessibilityTraits;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosAccessibilityValue;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosAlpha;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosAutoresizesSubviews;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosBackgroundColor;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosClearsContextBeforeDrawing;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosClipsToBounds;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosContentScaleFactor;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosInsetsLayoutMarginsFromSafeArea;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosIsAccessibilityElement;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosIsExclusiveTouch;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosIsFocused;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosIsHidden;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosIsMultipleTouchEnabled;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosIsOpaque;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosIsUserInteractionEnabled;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosLargeContentImage;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosLargeContentTitle;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosPreservesSuperviewLayoutMargins;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosRestorationIdentifier;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosScalesLargeContentImage;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosShowsLargeContentViewer;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosTag;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosTintColor;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetIosTranslatesAutoresizingMaskIntoConstraints;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetKeepScreenOn;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetLayoutDirection;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetLongClickable;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetMaxHeight;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetMaxWidth;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetMinHeight;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetMinWidth;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetModelParam;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetModelPojoToUi;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetModelSyncEvents;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetModelUiToPojo;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetRotation;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetRotationX;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetRotationY;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetScaleX;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetScaleY;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetSelected;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetTextAlignment;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetTextDirection;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetTransformPivotX;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetTransformPivotY;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetTranslationX;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetTranslationY;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetTranslationZ;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetValidateForm;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)tryGetVisibility;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)updateModelDataWithNSString:(NSString *)arg0
                                                                withId:(id)arg1;

- (ASViewOnlyImpl_ViewOnlyCommandBuilder *)validateFormWithNSString:(NSString *)arg0;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASViewOnlyImpl_ViewOnlyCommandBuilder)

FOUNDATION_EXPORT void ASViewOnlyImpl_ViewOnlyCommandBuilder_initWithASViewOnlyImpl_(ASViewOnlyImpl_ViewOnlyCommandBuilder *self, ASViewOnlyImpl *outer$);

FOUNDATION_EXPORT ASViewOnlyImpl_ViewOnlyCommandBuilder *new_ASViewOnlyImpl_ViewOnlyCommandBuilder_initWithASViewOnlyImpl_(ASViewOnlyImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASViewOnlyImpl_ViewOnlyCommandBuilder *create_ASViewOnlyImpl_ViewOnlyCommandBuilder_initWithASViewOnlyImpl_(ASViewOnlyImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASViewOnlyImpl_ViewOnlyCommandBuilder)

#endif

#if !defined (ASViewOnlyImpl_ViewOnlyBean_) && (INCLUDE_ALL_ViewOnlyImpl || defined(INCLUDE_ASViewOnlyImpl_ViewOnlyBean))
#define ASViewOnlyImpl_ViewOnlyBean_

#define RESTRICT_ViewImpl 1
#define INCLUDE_ASViewImpl_ViewBean 1
#include "ViewImpl.h"

@class ASViewOnlyImpl;
@protocol ASIWidget;

@interface ASViewOnlyImpl_ViewOnlyBean : ASViewImpl_ViewBean

#pragma mark Public

- (instancetype)initWithASViewOnlyImpl:(ASViewOnlyImpl *)outer$;

- (void)setAttributeUnderTestWithNSString:(NSString *)value;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithASIWidget:(id<ASIWidget>)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASViewOnlyImpl_ViewOnlyBean)

FOUNDATION_EXPORT void ASViewOnlyImpl_ViewOnlyBean_initWithASViewOnlyImpl_(ASViewOnlyImpl_ViewOnlyBean *self, ASViewOnlyImpl *outer$);

FOUNDATION_EXPORT ASViewOnlyImpl_ViewOnlyBean *new_ASViewOnlyImpl_ViewOnlyBean_initWithASViewOnlyImpl_(ASViewOnlyImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASViewOnlyImpl_ViewOnlyBean *create_ASViewOnlyImpl_ViewOnlyBean_initWithASViewOnlyImpl_(ASViewOnlyImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASViewOnlyImpl_ViewOnlyBean)

#endif

#pragma pop_macro("INCLUDE_ALL_ViewOnlyImpl")
