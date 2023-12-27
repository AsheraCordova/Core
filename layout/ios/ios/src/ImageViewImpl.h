//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\ios_widget_library\src\main\java\com\ashera\layout\ImageViewImpl.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ImageViewImpl")
#ifdef RESTRICT_ImageViewImpl
#define INCLUDE_ALL_ImageViewImpl 0
#else
#define INCLUDE_ALL_ImageViewImpl 1
#endif
#undef RESTRICT_ImageViewImpl

#if !defined (ASImageViewImpl_) && (INCLUDE_ALL_ImageViewImpl || defined(INCLUDE_ASImageViewImpl))
#define ASImageViewImpl_

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
@class ASImageViewImpl_ImageViewBean;
@class ASImageViewImpl_ImageViewCommandBuilder;
@class ASWidgetAttribute;
@class IOSClass;
@class IOSIntArray;
@protocol ASIFragment;
@protocol ASILifeCycleDecorator;
@protocol ASIWidget;
@protocol JavaUtilMap;

@interface ASImageViewImpl : ASBaseWidget < ASIsImage, ASITarget > {
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

- (void)addForegroundIfNeeded;

- (id)asNativeWidget;

- (id)asWidget;

- (jboolean)checkIosVersionWithNSString:(NSString *)v;

- (void)createWithASIFragment:(id<ASIFragment>)fragment
              withJavaUtilMap:(id<JavaUtilMap>)params;

- (void)createMaskWithId:(id)viewToMask
                 withInt:(jint)x
                 withInt:(jint)y
                 withInt:(jint)width
                 withInt:(jint)height;

- (id)createWrapperViewWithId:(id)wrapperParent
                      withInt:(jint)viewtype;

- (id)createWrapperViewHolderWithInt:(jint)viewType;

- (id)createWrapperViewHolderNativeWithInt:(jint)viewType;

- (void)drawableStateChanged;

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
              withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (jint)getBaseLine;

- (ASImageViewImpl_ImageViewBean *)getBean;

- (ASImageViewImpl_ImageViewCommandBuilder *)getBuilder;

- (id)getForeground;

- (id)getImage;

- (IOSIntArray *)getImageDimension;

- (id)getImageNative;

- (id)getPluginWithNSString:(NSString *)plugin;

- (IOSClass *)getViewClass;

- (void)invalidate;

- (void)loadAttributesWithNSString:(NSString *)attributeName;

- (id)nativeAddForeGroundWithASIWidget:(id<ASIWidget>)w;

- (id)nativeCreateViewWithInt:(jint)viewType;

- (id<ASIWidget>)newInstance OBJC_METHOD_FAMILY_NONE;

- (void)onBitmapFailedWithId:(id)errorDrawable;

- (void)onBitmapLoadedWithId:(id)bitmap;

- (void)onPrepareLoadWithId:(id)placeHolderDrawable;

- (void)removeMaskWithId:(id)viewToMask;

- (void)requestLayout;

- (void)setAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
                             withNSString:(NSString *)strValue
                                   withId:(id)objValue
                withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (void)setIdWithNSString:(NSString *)id_;

- (void)setImageWithId:(id)value;

- (void)setImageNativeWithId:(id)value;

- (void)setVisibleWithBoolean:(jboolean)b;

@end

J2OBJC_STATIC_INIT(ASImageViewImpl)

J2OBJC_FIELD_SETTER(ASImageViewImpl, uiView_, id)
J2OBJC_FIELD_SETTER(ASImageViewImpl, measurableView_, ADImageView *)

inline NSString *ASImageViewImpl_get_LOCAL_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASImageViewImpl_LOCAL_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASImageViewImpl, LOCAL_NAME, NSString *)

inline NSString *ASImageViewImpl_get_GROUP_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASImageViewImpl_GROUP_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASImageViewImpl, GROUP_NAME, NSString *)

FOUNDATION_EXPORT void ASImageViewImpl_init(ASImageViewImpl *self);

FOUNDATION_EXPORT ASImageViewImpl *new_ASImageViewImpl_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASImageViewImpl *create_ASImageViewImpl_init(void);

FOUNDATION_EXPORT void ASImageViewImpl_initWithNSString_(ASImageViewImpl *self, NSString *localname);

FOUNDATION_EXPORT ASImageViewImpl *new_ASImageViewImpl_initWithNSString_(NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASImageViewImpl *create_ASImageViewImpl_initWithNSString_(NSString *localname);

FOUNDATION_EXPORT void ASImageViewImpl_initWithNSString_withNSString_(ASImageViewImpl *self, NSString *groupName, NSString *localname);

FOUNDATION_EXPORT ASImageViewImpl *new_ASImageViewImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASImageViewImpl *create_ASImageViewImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname);

J2OBJC_TYPE_LITERAL_HEADER(ASImageViewImpl)

@compatibility_alias ComAsheraLayoutImageViewImpl ASImageViewImpl;

#endif

#if !defined (ASImageViewImpl_ScaleType_) && (INCLUDE_ALL_ImageViewImpl || defined(INCLUDE_ASImageViewImpl_ScaleType))
#define ASImageViewImpl_ScaleType_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASImageViewImpl_ScaleType : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASImageViewImpl_ScaleType)

FOUNDATION_EXPORT void ASImageViewImpl_ScaleType_init(ASImageViewImpl_ScaleType *self);

FOUNDATION_EXPORT ASImageViewImpl_ScaleType *new_ASImageViewImpl_ScaleType_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASImageViewImpl_ScaleType *create_ASImageViewImpl_ScaleType_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASImageViewImpl_ScaleType)

#endif

#if !defined (ASImageViewImpl_ImageViewExt_) && (INCLUDE_ALL_ImageViewImpl || defined(INCLUDE_ASImageViewImpl_ImageViewExt))
#define ASImageViewImpl_ImageViewExt_

#define RESTRICT_ImageView 1
#define INCLUDE_ADImageView 1
#include "ImageView.h"

#define RESTRICT_ILifeCycleDecorator 1
#define INCLUDE_ASILifeCycleDecorator 1
#include "ILifeCycleDecorator.h"

@class ADRect;
@class ADView;
@class ASImageViewImpl;
@class ASWidgetAttribute;
@class IOSIntArray;
@class IOSObjectArray;
@protocol ASIWidget;
@protocol JavaUtilList;

@interface ASImageViewImpl_ImageViewExt : ADImageView < ASILifeCycleDecorator >

#pragma mark Public

- (instancetype)initWithASImageViewImpl:(ASImageViewImpl *)outer$;

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

J2OBJC_EMPTY_STATIC_INIT(ASImageViewImpl_ImageViewExt)

FOUNDATION_EXPORT void ASImageViewImpl_ImageViewExt_initWithASImageViewImpl_(ASImageViewImpl_ImageViewExt *self, ASImageViewImpl *outer$);

FOUNDATION_EXPORT ASImageViewImpl_ImageViewExt *new_ASImageViewImpl_ImageViewExt_initWithASImageViewImpl_(ASImageViewImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASImageViewImpl_ImageViewExt *create_ASImageViewImpl_ImageViewExt_initWithASImageViewImpl_(ASImageViewImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASImageViewImpl_ImageViewExt)

#endif

#if !defined (ASImageViewImpl_ImageViewCommandBuilder_) && (INCLUDE_ALL_ImageViewImpl || defined(INCLUDE_ASImageViewImpl_ImageViewCommandBuilder))
#define ASImageViewImpl_ImageViewCommandBuilder_

#define RESTRICT_ViewImpl 1
#define INCLUDE_ASViewImpl_ViewCommandBuilder 1
#include "ViewImpl.h"

@class ASImageViewImpl;

@interface ASImageViewImpl_ImageViewCommandBuilder : ASViewImpl_ViewCommandBuilder

#pragma mark Public

- (instancetype)initWithASImageViewImpl:(ASImageViewImpl *)outer$;

- (ASImageViewImpl_ImageViewCommandBuilder *)animatorXmlWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)endAnimator;

- (ASImageViewImpl_ImageViewCommandBuilder *)executeWithBoolean:(jboolean)setter;

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

- (ASImageViewImpl_ImageViewCommandBuilder *)invalidate;

- (id)isAdjustViewBounds;

- (id)isBaselineAlignBottom;

- (id)isCropToPadding;

- (ASImageViewImpl_ImageViewCommandBuilder *)notifyDataSetChangedWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)refreshUiFromModelWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)requestLayout;

- (ASImageViewImpl_ImageViewCommandBuilder *)reset;

- (ASImageViewImpl_ImageViewCommandBuilder *)setAdjustViewBoundsWithBoolean:(jboolean)value;

- (ASImageViewImpl_ImageViewCommandBuilder *)setAlphaWithFloat:(jfloat)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setAsDragSourceWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setAttributeUnderTestWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setBackgroundRepeatWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setBackgroundTintModeWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setBackgroundTintWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setBackgroundWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setBaselineWithNSString:(NSString *)value;

- (ASImageViewImpl_ImageViewCommandBuilder *)setBaselineAlignBottomWithBoolean:(jboolean)value;

- (ASImageViewImpl_ImageViewCommandBuilder *)setClickableWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setContentDescriptionWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setCropToPaddingWithBoolean:(jboolean)value;

- (ASImageViewImpl_ImageViewCommandBuilder *)setCustomErrorMessageKeysWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setCustomErrorMessageValuesWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setDuplicateParentStateWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setElevationWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setEnabledWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setErrorStyleWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setFocusableWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setForegroundGravityWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setForegroundRepeatWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setForegroundTintModeWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setForegroundTintWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setForegroundWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIdWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setImageFromUrlWithNSString:(NSString *)value;

- (ASImageViewImpl_ImageViewCommandBuilder *)setImageFromUrlErrorWithNSString:(NSString *)value;

- (ASImageViewImpl_ImageViewCommandBuilder *)setImageFromUrlPlaceHolderWithNSString:(NSString *)value;

- (ASImageViewImpl_ImageViewCommandBuilder *)setInvalidateOnFrameChangeWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosAccessibilityHintWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosAccessibilityIgnoresInvertColorsWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosAccessibilityLabelWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosAccessibilityTraitsWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosAccessibilityValueWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosAlphaWithFloat:(jfloat)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosAutoresizesSubviewsWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosBackgroundColorWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosClearsContextBeforeDrawingWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosClipsToBoundsWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosContentScaleFactorWithFloat:(jfloat)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosInsetsLayoutMarginsFromSafeAreaWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosIsAccessibilityElementWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosIsExclusiveTouchWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosIsHiddenWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosIsMultipleTouchEnabledWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosIsOpaqueWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosIsUserInteractionEnabledWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosLargeContentImageWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosLargeContentTitleWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosLayerBorderColorWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosLayerBorderWidthWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosLayerCornerRadiusWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosLayerMasksToBoundsWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosPreservesSuperviewLayoutMarginsWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosRestorationIdentifierWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosScalesLargeContentImageWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosShowsLargeContentViewerWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosTagWithInt:(jint)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosTintColorWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setIosTranslatesAutoresizingMaskIntoConstraintsWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setKeepScreenOnWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setLayoutDirectionWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setLongClickableWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setMaxHeightWithNSString:(NSString *)value;

- (ASImageViewImpl_ImageViewCommandBuilder *)setMaxWidthWithNSString:(NSString *)value;

- (ASImageViewImpl_ImageViewCommandBuilder *)setMinHeightWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setMinWidthWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setModelParamWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setModelPojoToUiParamsWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setModelPojoToUiWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setModelSyncEventsWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setModelUiToPojoEventIdsWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setModelUiToPojoWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setOnAnimationCancelWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setOnAnimationEndWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setOnAnimationRepeatWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setOnAnimationStartWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setOnClickWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setOnDragWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setOnKeyWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setOnLongClickWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setOnSwipedWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setOnTouchWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setOutsideTouchableWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setPaddingWithNSString:(NSString *)value;

- (ASImageViewImpl_ImageViewCommandBuilder *)setPaddingBottomWithNSString:(NSString *)value;

- (ASImageViewImpl_ImageViewCommandBuilder *)setPaddingEndWithNSString:(NSString *)value;

- (ASImageViewImpl_ImageViewCommandBuilder *)setPaddingHorizontalWithNSString:(NSString *)value;

- (ASImageViewImpl_ImageViewCommandBuilder *)setPaddingLeftWithNSString:(NSString *)value;

- (ASImageViewImpl_ImageViewCommandBuilder *)setPaddingRightWithNSString:(NSString *)value;

- (ASImageViewImpl_ImageViewCommandBuilder *)setPaddingStartWithNSString:(NSString *)value;

- (ASImageViewImpl_ImageViewCommandBuilder *)setPaddingTopWithNSString:(NSString *)value;

- (ASImageViewImpl_ImageViewCommandBuilder *)setPaddingVerticalWithNSString:(NSString *)value;

- (ASImageViewImpl_ImageViewCommandBuilder *)setRotationWithFloat:(jfloat)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setRotationXWithFloat:(jfloat)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setRotationYWithFloat:(jfloat)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setScaleTypeWithNSString:(NSString *)value;

- (ASImageViewImpl_ImageViewCommandBuilder *)setScaleXWithFloat:(jfloat)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setScaleYWithFloat:(jfloat)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setSelectedWithBoolean:(jboolean)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setSrcWithNSString:(NSString *)value;

- (ASImageViewImpl_ImageViewCommandBuilder *)setStyleWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setTextAlignmentWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setTextDirectionWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setTintWithNSString:(NSString *)value;

- (ASImageViewImpl_ImageViewCommandBuilder *)setTransformPivotXWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setTransformPivotYWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setTranslationXWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setTranslationYWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setTranslationZWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setV_maxlengthWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setV_maxWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setV_minlengthWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setV_minWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setV_patternWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setV_requiredWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setV_typeWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setValidationErrorDisplayTypeWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setValidationWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setVisibilityWithNSString:(NSString *)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)setZIndexWithInt:(jint)arg0;

- (ASImageViewImpl_ImageViewCommandBuilder *)startAnimator;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetAdjustViewBounds;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetAlpha;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetBackground;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetBackgroundTint;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetBackgroundTintMode;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetBaseline;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetBaselineAlignBottom;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetClickable;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetContentDescription;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetCropToPadding;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetDuplicateParentState;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetEnabled;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetFocusable;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetForeground;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetForegroundGravity;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetForegroundTint;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetForegroundTintMode;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetId;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosAccessibilityHint;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosAccessibilityIgnoresInvertColors;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosAccessibilityLabel;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosAccessibilityTraits;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosAccessibilityValue;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosAlpha;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosAutoresizesSubviews;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosBackgroundColor;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosClearsContextBeforeDrawing;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosClipsToBounds;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosContentScaleFactor;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosInsetsLayoutMarginsFromSafeArea;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosIsAccessibilityElement;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosIsExclusiveTouch;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosIsFocused;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosIsHidden;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosIsMultipleTouchEnabled;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosIsOpaque;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosIsUserInteractionEnabled;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosLargeContentImage;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosLargeContentTitle;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosPreservesSuperviewLayoutMargins;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosRestorationIdentifier;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosScalesLargeContentImage;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosShowsLargeContentViewer;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosTag;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosTintColor;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetIosTranslatesAutoresizingMaskIntoConstraints;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetKeepScreenOn;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetLayoutDirection;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetLongClickable;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetMaxHeight;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetMaxWidth;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetMinHeight;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetMinWidth;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetModelParam;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetModelPojoToUi;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetModelSyncEvents;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetModelUiToPojo;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetPaddingBottom;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetPaddingEnd;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetPaddingLeft;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetPaddingRight;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetPaddingStart;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetPaddingTop;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetRotation;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetRotationX;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetRotationY;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetScaleType;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetScaleX;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetScaleY;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetSelected;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetSrc;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetTextAlignment;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetTextDirection;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetTint;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetTransformPivotX;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetTransformPivotY;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetTranslationX;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetTranslationY;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetTranslationZ;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetValidateForm;

- (ASImageViewImpl_ImageViewCommandBuilder *)tryGetVisibility;

- (ASImageViewImpl_ImageViewCommandBuilder *)updateModelDataWithNSString:(NSString *)arg0
                                                                  withId:(id)arg1;

- (ASImageViewImpl_ImageViewCommandBuilder *)validateFormWithNSString:(NSString *)arg0;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASImageViewImpl_ImageViewCommandBuilder)

FOUNDATION_EXPORT void ASImageViewImpl_ImageViewCommandBuilder_initWithASImageViewImpl_(ASImageViewImpl_ImageViewCommandBuilder *self, ASImageViewImpl *outer$);

FOUNDATION_EXPORT ASImageViewImpl_ImageViewCommandBuilder *new_ASImageViewImpl_ImageViewCommandBuilder_initWithASImageViewImpl_(ASImageViewImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASImageViewImpl_ImageViewCommandBuilder *create_ASImageViewImpl_ImageViewCommandBuilder_initWithASImageViewImpl_(ASImageViewImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASImageViewImpl_ImageViewCommandBuilder)

#endif

#if !defined (ASImageViewImpl_ImageViewBean_) && (INCLUDE_ALL_ImageViewImpl || defined(INCLUDE_ASImageViewImpl_ImageViewBean))
#define ASImageViewImpl_ImageViewBean_

#define RESTRICT_ViewImpl 1
#define INCLUDE_ASViewImpl_ViewBean 1
#include "ViewImpl.h"

@class ASImageViewImpl;
@protocol ASIWidget;

@interface ASImageViewImpl_ImageViewBean : ASViewImpl_ViewBean

#pragma mark Public

- (instancetype)initWithASImageViewImpl:(ASImageViewImpl *)outer$;

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

- (id)isCropToPadding;

- (void)setAdjustViewBoundsWithBoolean:(jboolean)value;

- (void)setBaselineWithNSString:(NSString *)value;

- (void)setBaselineAlignBottomWithBoolean:(jboolean)value;

- (void)setCropToPaddingWithBoolean:(jboolean)value;

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

J2OBJC_EMPTY_STATIC_INIT(ASImageViewImpl_ImageViewBean)

FOUNDATION_EXPORT void ASImageViewImpl_ImageViewBean_initWithASImageViewImpl_(ASImageViewImpl_ImageViewBean *self, ASImageViewImpl *outer$);

FOUNDATION_EXPORT ASImageViewImpl_ImageViewBean *new_ASImageViewImpl_ImageViewBean_initWithASImageViewImpl_(ASImageViewImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASImageViewImpl_ImageViewBean *create_ASImageViewImpl_ImageViewBean_initWithASImageViewImpl_(ASImageViewImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASImageViewImpl_ImageViewBean)

#endif

#pragma pop_macro("INCLUDE_ALL_ImageViewImpl")
