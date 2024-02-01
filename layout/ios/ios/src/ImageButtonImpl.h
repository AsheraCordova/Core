//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\ios_widget_library\src\main\java\com\ashera\layout\ImageButtonImpl.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ImageButtonImpl")
#ifdef RESTRICT_ImageButtonImpl
#define INCLUDE_ALL_ImageButtonImpl 0
#else
#define INCLUDE_ALL_ImageButtonImpl 1
#endif
#undef RESTRICT_ImageButtonImpl

#if !defined (ASImageButtonImpl_) && (INCLUDE_ALL_ImageButtonImpl || defined(INCLUDE_ASImageButtonImpl))
#define ASImageButtonImpl_

#define RESTRICT_BaseWidget 1
#define INCLUDE_ASBaseWidget 1
#include "BaseWidget.h"

#define RESTRICT_IsImage 1
#define INCLUDE_ASIsImage 1
#include "IsImage.h"

#define RESTRICT_ITarget 1
#define INCLUDE_ASITarget 1
#include "ITarget.h"

@class ADImageView;
@class ASImageButtonImpl_ImageButtonBean;
@class ASImageButtonImpl_ImageButtonCommandBuilder;
@class ASWidgetAttribute;
@class IOSClass;
@class IOSIntArray;
@protocol ASIFragment;
@protocol ASILifeCycleDecorator;
@protocol ASIWidget;
@protocol JavaUtilMap;

@interface ASImageButtonImpl : ASBaseWidget < ASIsImage, ASITarget > {
 @public
  id uiView_;
  ADImageView *measurableView_;
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

- (void)drawableStateChanged;

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
              withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (jint)getBaseLine;

- (ASImageButtonImpl_ImageButtonBean *)getBean;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)getBuilder;

- (id)getImage;

- (IOSIntArray *)getImageDimension;

- (id)getPaddingBottom;

- (id)getPaddingLeft;

- (id)getPaddingRight;

- (id)getPaddingTop;

- (id)getPluginWithNSString:(NSString *)plugin;

- (IOSClass *)getViewClass;

- (void)invalidate;

- (void)loadAttributesWithNSString:(NSString *)attributeName;

- (id<ASIWidget>)newInstance OBJC_METHOD_FAMILY_NONE;

- (void)onBitmapFailedWithId:(id)errorDrawable;

- (void)onBitmapLoadedWithId:(id)bitmap;

- (void)onPrepareLoadWithId:(id)placeHolderDrawable;

- (void)requestLayout;

- (void)setAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
                             withNSString:(NSString *)strValue
                                   withId:(id)objValue
                withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (void)setIdWithNSString:(NSString *)id_;

- (void)setImageWithId:(id)value;

- (void)setPaddingBottomWithId:(id)paddingBottom;

- (void)setPaddingLeftWithId:(id)paddingLeft;

- (void)setPaddingRightWithId:(id)paddingRight;

- (void)setPaddingTopWithId:(id)paddingTop;

- (void)setVisibleWithBoolean:(jboolean)b;

- (void)updatePadding;

@end

J2OBJC_STATIC_INIT(ASImageButtonImpl)

J2OBJC_FIELD_SETTER(ASImageButtonImpl, uiView_, id)
J2OBJC_FIELD_SETTER(ASImageButtonImpl, measurableView_, ADImageView *)

inline NSString *ASImageButtonImpl_get_LOCAL_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASImageButtonImpl_LOCAL_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASImageButtonImpl, LOCAL_NAME, NSString *)

inline NSString *ASImageButtonImpl_get_GROUP_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASImageButtonImpl_GROUP_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASImageButtonImpl, GROUP_NAME, NSString *)

FOUNDATION_EXPORT void ASImageButtonImpl_init(ASImageButtonImpl *self);

FOUNDATION_EXPORT ASImageButtonImpl *new_ASImageButtonImpl_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASImageButtonImpl *create_ASImageButtonImpl_init(void);

FOUNDATION_EXPORT void ASImageButtonImpl_initWithNSString_(ASImageButtonImpl *self, NSString *localname);

FOUNDATION_EXPORT ASImageButtonImpl *new_ASImageButtonImpl_initWithNSString_(NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASImageButtonImpl *create_ASImageButtonImpl_initWithNSString_(NSString *localname);

FOUNDATION_EXPORT void ASImageButtonImpl_initWithNSString_withNSString_(ASImageButtonImpl *self, NSString *groupName, NSString *localname);

FOUNDATION_EXPORT ASImageButtonImpl *new_ASImageButtonImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASImageButtonImpl *create_ASImageButtonImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname);

J2OBJC_TYPE_LITERAL_HEADER(ASImageButtonImpl)

@compatibility_alias ComAsheraLayoutImageButtonImpl ASImageButtonImpl;

#endif

#if !defined (ASImageButtonImpl_ScaleType_) && (INCLUDE_ALL_ImageButtonImpl || defined(INCLUDE_ASImageButtonImpl_ScaleType))
#define ASImageButtonImpl_ScaleType_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASImageButtonImpl_ScaleType : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASImageButtonImpl_ScaleType)

FOUNDATION_EXPORT void ASImageButtonImpl_ScaleType_init(ASImageButtonImpl_ScaleType *self);

FOUNDATION_EXPORT ASImageButtonImpl_ScaleType *new_ASImageButtonImpl_ScaleType_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASImageButtonImpl_ScaleType *create_ASImageButtonImpl_ScaleType_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASImageButtonImpl_ScaleType)

#endif

#if !defined (ASImageButtonImpl_ImageButtonExt_) && (INCLUDE_ALL_ImageButtonImpl || defined(INCLUDE_ASImageButtonImpl_ImageButtonExt))
#define ASImageButtonImpl_ImageButtonExt_

#define RESTRICT_ImageView 1
#define INCLUDE_ADImageView 1
#include "ImageView.h"

#define RESTRICT_ILifeCycleDecorator 1
#define INCLUDE_ASILifeCycleDecorator 1
#include "ILifeCycleDecorator.h"

@class ADRect;
@class ADView;
@class ASImageButtonImpl;
@class ASWidgetAttribute;
@class IOSIntArray;
@class IOSObjectArray;
@protocol ASIWidget;
@protocol JavaUtilList;

@interface ASImageButtonImpl_ImageButtonExt : ADImageView < ASILifeCycleDecorator >

#pragma mark Public

- (instancetype)initWithASImageButtonImpl:(ASImageButtonImpl *)outer$;

- (void)drawableStateChanged;

- (void)executeWithNSString:(NSString *)method
          withNSObjectArray:(IOSObjectArray *)canvas;

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)widgetAttribute;

- (void)getLocationOnScreenWithIntArray:(IOSIntArray *)appScreenLocation;

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

- (instancetype)initWithASIWidget:(id<ASIWidget>)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASImageButtonImpl_ImageButtonExt)

FOUNDATION_EXPORT void ASImageButtonImpl_ImageButtonExt_initWithASImageButtonImpl_(ASImageButtonImpl_ImageButtonExt *self, ASImageButtonImpl *outer$);

FOUNDATION_EXPORT ASImageButtonImpl_ImageButtonExt *new_ASImageButtonImpl_ImageButtonExt_initWithASImageButtonImpl_(ASImageButtonImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASImageButtonImpl_ImageButtonExt *create_ASImageButtonImpl_ImageButtonExt_initWithASImageButtonImpl_(ASImageButtonImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASImageButtonImpl_ImageButtonExt)

#endif

#if !defined (ASImageButtonImpl_ImageButtonCommandBuilder_) && (INCLUDE_ALL_ImageButtonImpl || defined(INCLUDE_ASImageButtonImpl_ImageButtonCommandBuilder))
#define ASImageButtonImpl_ImageButtonCommandBuilder_

#define RESTRICT_ViewImpl 1
#define INCLUDE_ASViewImpl_ViewCommandBuilder 1
#include "ViewImpl.h"

@class ASImageButtonImpl;

@interface ASImageButtonImpl_ImageButtonCommandBuilder : ASViewImpl_ViewCommandBuilder

#pragma mark Public

- (instancetype)initWithASImageButtonImpl:(ASImageButtonImpl *)outer$;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)animatorXmlWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)endAnimator;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)executeWithBoolean:(jboolean)setter;

- (id)getBaseline;

- (id)getMaxHeight;

- (id)getMaxWidth;

- (id)getPaddingBottom;

- (id)getPaddingEnd;

- (id)getPaddingLeft;

- (id)getPaddingRight;

- (id)getPaddingStart;

- (id)getPaddingTop;

- (id)getScaleType;

- (id)getSrc;

- (id)getTint;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)invalidate;

- (id)isAdjustViewBounds;

- (id)isBaselineAlignBottom;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)notifyDataSetChangedWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)refreshUiFromModelWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)requestLayout;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)reset;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setAdjustViewBoundsWithBoolean:(jboolean)value;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setAlphaWithFloat:(jfloat)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setAsDragSourceWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setAttributeUnderTestWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setBackgroundRepeatWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setBackgroundTintModeWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setBackgroundTintWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setBackgroundWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setBaselineWithNSString:(NSString *)value;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setBaselineAlignBottomWithBoolean:(jboolean)value;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setBottomWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setClickableWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setContentDescriptionWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setCustomErrorMessageKeysWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setCustomErrorMessageValuesWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setDuplicateParentStateWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setElevationWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setEnabledWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setErrorStyleWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setFocusableWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setForegroundGravityWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setForegroundRepeatWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setForegroundTintModeWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setForegroundTintWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setForegroundWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIdWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setImageFromUrlWithNSString:(NSString *)value;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setImageFromUrlErrorWithNSString:(NSString *)value;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setImageFromUrlPlaceHolderWithNSString:(NSString *)value;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setInvalidateOnFrameChangeWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosAccessibilityHintWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosAccessibilityIgnoresInvertColorsWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosAccessibilityLabelWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosAccessibilityTraitsWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosAccessibilityValueWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosAlphaWithFloat:(jfloat)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosAutoresizesSubviewsWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosBackgroundColorWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosClearsContextBeforeDrawingWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosClipsToBoundsWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosContentScaleFactorWithFloat:(jfloat)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosInsetsLayoutMarginsFromSafeAreaWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosIsAccessibilityElementWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosIsExclusiveTouchWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosIsHiddenWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosIsMultipleTouchEnabledWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosIsOpaqueWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosIsUserInteractionEnabledWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosLargeContentImageWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosLargeContentTitleWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosLayerBorderColorWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosLayerBorderWidthWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosLayerCornerRadiusWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosLayerMasksToBoundsWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosPreservesSuperviewLayoutMarginsWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosRestorationIdentifierWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosScalesLargeContentImageWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosShowsLargeContentViewerWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosTagWithInt:(jint)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosTintColorWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setIosTranslatesAutoresizingMaskIntoConstraintsWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setKeepScreenOnWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setLayoutDirectionWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setLeftWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setLongClickableWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setMaxHeightWithNSString:(NSString *)value;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setMaxWidthWithNSString:(NSString *)value;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setMinHeightWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setMinWidthWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setModelParamWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setModelPojoToUiParamsWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setModelPojoToUiWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setModelSyncEventsWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setModelUiToPojoEventIdsWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setModelUiToPojoWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setOnAnimationCancelWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setOnAnimationEndWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setOnAnimationRepeatWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setOnAnimationStartWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setOnClickWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setOnDragWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setOnKeyWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setOnLongClickWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setOnSwipedWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setOnTouchWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setOutsideTouchableWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setPaddingWithNSString:(NSString *)value;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setPaddingBottomWithNSString:(NSString *)value;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setPaddingEndWithNSString:(NSString *)value;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setPaddingHorizontalWithNSString:(NSString *)value;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setPaddingLeftWithNSString:(NSString *)value;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setPaddingRightWithNSString:(NSString *)value;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setPaddingStartWithNSString:(NSString *)value;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setPaddingTopWithNSString:(NSString *)value;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setPaddingVerticalWithNSString:(NSString *)value;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setRightWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setRotationWithFloat:(jfloat)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setRotationXWithFloat:(jfloat)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setRotationYWithFloat:(jfloat)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setScaleTypeWithNSString:(NSString *)value;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setScaleXWithFloat:(jfloat)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setScaleYWithFloat:(jfloat)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setSelectedWithBoolean:(jboolean)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setSrcWithNSString:(NSString *)value;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setStyleWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setTextAlignmentWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setTextDirectionWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setTintWithNSString:(NSString *)value;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setTopWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setTransformPivotXWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setTransformPivotYWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setTranslationXWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setTranslationYWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setTranslationZWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setV_maxlengthWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setV_maxWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setV_minlengthWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setV_minWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setV_patternWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setV_requiredWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setV_typeWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setValidationErrorDisplayTypeWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setValidationWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setVisibilityWithNSString:(NSString *)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)setZIndexWithInt:(jint)arg0;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)startAnimator;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetAdjustViewBounds;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetAlpha;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetBackground;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetBackgroundTint;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetBackgroundTintMode;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetBaseline;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetBaselineAlignBottom;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetBottom;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetClickable;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetContentDescription;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetDuplicateParentState;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetEnabled;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetFocusable;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetForeground;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetForegroundGravity;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetForegroundTint;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetForegroundTintMode;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetId;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosAccessibilityHint;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosAccessibilityIgnoresInvertColors;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosAccessibilityLabel;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosAccessibilityTraits;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosAccessibilityValue;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosAlpha;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosAutoresizesSubviews;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosBackgroundColor;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosClearsContextBeforeDrawing;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosClipsToBounds;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosContentScaleFactor;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosInsetsLayoutMarginsFromSafeArea;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosIsAccessibilityElement;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosIsExclusiveTouch;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosIsFocused;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosIsHidden;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosIsMultipleTouchEnabled;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosIsOpaque;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosIsUserInteractionEnabled;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosLargeContentImage;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosLargeContentTitle;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosPreservesSuperviewLayoutMargins;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosRestorationIdentifier;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosScalesLargeContentImage;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosShowsLargeContentViewer;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosTag;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosTintColor;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetIosTranslatesAutoresizingMaskIntoConstraints;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetKeepScreenOn;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetLayoutDirection;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetLeft;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetLongClickable;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetMaxHeight;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetMaxWidth;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetMinHeight;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetMinWidth;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetModelParam;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetModelPojoToUi;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetModelSyncEvents;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetModelUiToPojo;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetPaddingBottom;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetPaddingEnd;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetPaddingLeft;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetPaddingRight;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetPaddingStart;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetPaddingTop;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetRight;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetRotation;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetRotationX;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetRotationY;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetScaleType;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetScaleX;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetScaleY;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetSelected;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetSrc;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetTextAlignment;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetTextDirection;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetTint;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetTop;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetTransformPivotX;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetTransformPivotY;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetTranslationX;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetTranslationY;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetTranslationZ;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetValidateForm;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)tryGetVisibility;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)updateModelDataWithNSString:(NSString *)arg0
                                                                      withId:(id)arg1;

- (ASImageButtonImpl_ImageButtonCommandBuilder *)validateFormWithNSString:(NSString *)arg0;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASImageButtonImpl_ImageButtonCommandBuilder)

FOUNDATION_EXPORT void ASImageButtonImpl_ImageButtonCommandBuilder_initWithASImageButtonImpl_(ASImageButtonImpl_ImageButtonCommandBuilder *self, ASImageButtonImpl *outer$);

FOUNDATION_EXPORT ASImageButtonImpl_ImageButtonCommandBuilder *new_ASImageButtonImpl_ImageButtonCommandBuilder_initWithASImageButtonImpl_(ASImageButtonImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASImageButtonImpl_ImageButtonCommandBuilder *create_ASImageButtonImpl_ImageButtonCommandBuilder_initWithASImageButtonImpl_(ASImageButtonImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASImageButtonImpl_ImageButtonCommandBuilder)

#endif

#if !defined (ASImageButtonImpl_ImageButtonBean_) && (INCLUDE_ALL_ImageButtonImpl || defined(INCLUDE_ASImageButtonImpl_ImageButtonBean))
#define ASImageButtonImpl_ImageButtonBean_

#define RESTRICT_ViewImpl 1
#define INCLUDE_ASViewImpl_ViewBean 1
#include "ViewImpl.h"

@class ASImageButtonImpl;
@protocol ASIWidget;

@interface ASImageButtonImpl_ImageButtonBean : ASViewImpl_ViewBean

#pragma mark Public

- (instancetype)initWithASImageButtonImpl:(ASImageButtonImpl *)outer$;

- (id)getBaseline;

- (id)getMaxHeight;

- (id)getMaxWidth;

- (id)getPaddingBottom;

- (id)getPaddingEnd;

- (id)getPaddingLeft;

- (id)getPaddingRight;

- (id)getPaddingStart;

- (id)getPaddingTop;

- (id)getScaleType;

- (id)getSrc;

- (id)getTint;

- (id)isAdjustViewBounds;

- (id)isBaselineAlignBottom;

- (void)setAdjustViewBoundsWithBoolean:(jboolean)value;

- (void)setBaselineWithNSString:(NSString *)value;

- (void)setBaselineAlignBottomWithBoolean:(jboolean)value;

- (void)setImageFromUrlWithNSString:(NSString *)value;

- (void)setImageFromUrlErrorWithNSString:(NSString *)value;

- (void)setImageFromUrlPlaceHolderWithNSString:(NSString *)value;

- (void)setMaxHeightWithNSString:(NSString *)value;

- (void)setMaxWidthWithNSString:(NSString *)value;

- (void)setPaddingWithNSString:(NSString *)value;

- (void)setPaddingBottomWithNSString:(NSString *)value;

- (void)setPaddingEndWithNSString:(NSString *)value;

- (void)setPaddingHorizontalWithNSString:(NSString *)value;

- (void)setPaddingLeftWithNSString:(NSString *)value;

- (void)setPaddingRightWithNSString:(NSString *)value;

- (void)setPaddingStartWithNSString:(NSString *)value;

- (void)setPaddingTopWithNSString:(NSString *)value;

- (void)setPaddingVerticalWithNSString:(NSString *)value;

- (void)setScaleTypeWithNSString:(NSString *)value;

- (void)setSrcWithNSString:(NSString *)value;

- (void)setTintWithNSString:(NSString *)value;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithASIWidget:(id<ASIWidget>)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASImageButtonImpl_ImageButtonBean)

FOUNDATION_EXPORT void ASImageButtonImpl_ImageButtonBean_initWithASImageButtonImpl_(ASImageButtonImpl_ImageButtonBean *self, ASImageButtonImpl *outer$);

FOUNDATION_EXPORT ASImageButtonImpl_ImageButtonBean *new_ASImageButtonImpl_ImageButtonBean_initWithASImageButtonImpl_(ASImageButtonImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASImageButtonImpl_ImageButtonBean *create_ASImageButtonImpl_ImageButtonBean_initWithASImageButtonImpl_(ASImageButtonImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASImageButtonImpl_ImageButtonBean)

#endif

#pragma pop_macro("INCLUDE_ALL_ImageButtonImpl")
