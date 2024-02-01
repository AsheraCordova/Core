//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\ios_widget_library\src\main\java\com\ashera\layout\WebViewImpl.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_WebViewImpl")
#ifdef RESTRICT_WebViewImpl
#define INCLUDE_ALL_WebViewImpl 0
#else
#define INCLUDE_ALL_WebViewImpl 1
#endif
#undef RESTRICT_WebViewImpl

#if !defined (ASWebViewImpl_) && (INCLUDE_ALL_WebViewImpl || defined(INCLUDE_ASWebViewImpl))
#define ASWebViewImpl_

#define RESTRICT_BaseWidget 1
#define INCLUDE_ASBaseWidget 1
#include "BaseWidget.h"

@class ADWebView;
@class ASWebViewImpl_WebViewBean;
@class ASWebViewImpl_WebViewCommandBuilder;
@class ASWidgetAttribute;
@class IOSClass;
@protocol ASIFragment;
@protocol ASILifeCycleDecorator;
@protocol ASIWidget;
@protocol JavaUtilMap;

@interface ASWebViewImpl : ASBaseWidget {
 @public
  id uiView_;
  ADWebView *measurableView_;
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

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
              withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (ASWebViewImpl_WebViewBean *)getBean;

- (ASWebViewImpl_WebViewCommandBuilder *)getBuilder;

- (id)getPluginWithNSString:(NSString *)plugin;

- (IOSClass *)getViewClass;

- (void)invalidate;

- (void)loadAttributesWithNSString:(NSString *)attributeName;

- (void)nativeCreateWithJavaUtilMap:(id<JavaUtilMap>)params;

- (id<ASIWidget>)newInstance OBJC_METHOD_FAMILY_NONE;

- (void)requestLayout;

- (void)setAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
                             withNSString:(NSString *)strValue
                                   withId:(id)objValue
                withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (void)setIdWithNSString:(NSString *)id_;

- (void)setVisibleWithBoolean:(jboolean)b;

#pragma mark Package-Private

@end

J2OBJC_EMPTY_STATIC_INIT(ASWebViewImpl)

J2OBJC_FIELD_SETTER(ASWebViewImpl, uiView_, id)
J2OBJC_FIELD_SETTER(ASWebViewImpl, measurableView_, ADWebView *)

inline NSString *ASWebViewImpl_get_LOCAL_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASWebViewImpl_LOCAL_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASWebViewImpl, LOCAL_NAME, NSString *)

inline NSString *ASWebViewImpl_get_GROUP_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASWebViewImpl_GROUP_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASWebViewImpl, GROUP_NAME, NSString *)

FOUNDATION_EXPORT void ASWebViewImpl_init(ASWebViewImpl *self);

FOUNDATION_EXPORT ASWebViewImpl *new_ASWebViewImpl_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASWebViewImpl *create_ASWebViewImpl_init(void);

FOUNDATION_EXPORT void ASWebViewImpl_initWithNSString_(ASWebViewImpl *self, NSString *localname);

FOUNDATION_EXPORT ASWebViewImpl *new_ASWebViewImpl_initWithNSString_(NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASWebViewImpl *create_ASWebViewImpl_initWithNSString_(NSString *localname);

FOUNDATION_EXPORT void ASWebViewImpl_initWithNSString_withNSString_(ASWebViewImpl *self, NSString *groupName, NSString *localname);

FOUNDATION_EXPORT ASWebViewImpl *new_ASWebViewImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASWebViewImpl *create_ASWebViewImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname);

J2OBJC_TYPE_LITERAL_HEADER(ASWebViewImpl)

@compatibility_alias ComAsheraLayoutWebViewImpl ASWebViewImpl;

#endif

#if !defined (ASWebViewImpl_WebViewExt_) && (INCLUDE_ALL_WebViewImpl || defined(INCLUDE_ASWebViewImpl_WebViewExt))
#define ASWebViewImpl_WebViewExt_

#define RESTRICT_WebView 1
#define INCLUDE_ADWebView 1
#include "WebView.h"

#define RESTRICT_ILifeCycleDecorator 1
#define INCLUDE_ASILifeCycleDecorator 1
#include "ILifeCycleDecorator.h"

#define RESTRICT_IMaxDimension 1
#define INCLUDE_ASIMaxDimension 1
#include "IMaxDimension.h"

@class ADAttributeSet;
@class ADContext;
@class ADRect;
@class ADView;
@class ASWebViewImpl;
@class ASWidgetAttribute;
@class IOSIntArray;
@class IOSObjectArray;
@protocol ASIWidget;
@protocol JavaUtilList;

@interface ASWebViewImpl_WebViewExt : ADWebView < ASILifeCycleDecorator, ASIMaxDimension >

#pragma mark Public

- (instancetype)initWithASWebViewImpl:(ASWebViewImpl *)outer$;

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

- (instancetype)initWithADContext:(ADContext *)arg0
               withADAttributeSet:(ADAttributeSet *)arg1 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASWebViewImpl_WebViewExt)

FOUNDATION_EXPORT void ASWebViewImpl_WebViewExt_initWithASWebViewImpl_(ASWebViewImpl_WebViewExt *self, ASWebViewImpl *outer$);

FOUNDATION_EXPORT ASWebViewImpl_WebViewExt *new_ASWebViewImpl_WebViewExt_initWithASWebViewImpl_(ASWebViewImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASWebViewImpl_WebViewExt *create_ASWebViewImpl_WebViewExt_initWithASWebViewImpl_(ASWebViewImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASWebViewImpl_WebViewExt)

#endif

#if !defined (ASWebViewImpl_Loader_) && (INCLUDE_ALL_WebViewImpl || defined(INCLUDE_ASWebViewImpl_Loader))
#define ASWebViewImpl_Loader_

@interface ASWebViewImpl_Loader : NSObject

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASWebViewImpl_Loader)

FOUNDATION_EXPORT void ASWebViewImpl_Loader_init(ASWebViewImpl_Loader *self);

FOUNDATION_EXPORT ASWebViewImpl_Loader *new_ASWebViewImpl_Loader_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASWebViewImpl_Loader *create_ASWebViewImpl_Loader_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASWebViewImpl_Loader)

#endif

#if !defined (ASWebViewImpl_Loader_WebViewLoadingListener_) && (INCLUDE_ALL_WebViewImpl || defined(INCLUDE_ASWebViewImpl_Loader_WebViewLoadingListener))
#define ASWebViewImpl_Loader_WebViewLoadingListener_

@class ADView;

@protocol ASWebViewImpl_Loader_WebViewLoadingListener < JavaObject >

- (void)onPageStartedWithADView:(ADView *)view;

@end

J2OBJC_EMPTY_STATIC_INIT(ASWebViewImpl_Loader_WebViewLoadingListener)

J2OBJC_TYPE_LITERAL_HEADER(ASWebViewImpl_Loader_WebViewLoadingListener)

#endif

#if !defined (ASWebViewImpl_Loader_WebViewLoadedListener_) && (INCLUDE_ALL_WebViewImpl || defined(INCLUDE_ASWebViewImpl_Loader_WebViewLoadedListener))
#define ASWebViewImpl_Loader_WebViewLoadedListener_

@class ADView;

@protocol ASWebViewImpl_Loader_WebViewLoadedListener < JavaObject >

- (void)onPageFinishedWithADView:(ADView *)view;

@end

J2OBJC_EMPTY_STATIC_INIT(ASWebViewImpl_Loader_WebViewLoadedListener)

J2OBJC_TYPE_LITERAL_HEADER(ASWebViewImpl_Loader_WebViewLoadedListener)

#endif

#if !defined (ASWebViewImpl_Loader_WebViewErrorListener_) && (INCLUDE_ALL_WebViewImpl || defined(INCLUDE_ASWebViewImpl_Loader_WebViewErrorListener))
#define ASWebViewImpl_Loader_WebViewErrorListener_

@class ADView;

@protocol ASWebViewImpl_Loader_WebViewErrorListener < JavaObject >

- (void)onReceivedErrorWithADView:(ADView *)view
                     withNSString:(NSString *)error;

@end

J2OBJC_EMPTY_STATIC_INIT(ASWebViewImpl_Loader_WebViewErrorListener)

J2OBJC_TYPE_LITERAL_HEADER(ASWebViewImpl_Loader_WebViewErrorListener)

#endif

#if !defined (ASWebViewImpl_WebViewCommandBuilder_) && (INCLUDE_ALL_WebViewImpl || defined(INCLUDE_ASWebViewImpl_WebViewCommandBuilder))
#define ASWebViewImpl_WebViewCommandBuilder_

#define RESTRICT_ViewImpl 1
#define INCLUDE_ASViewImpl_ViewCommandBuilder 1
#include "ViewImpl.h"

@class ASWebViewImpl;

@interface ASWebViewImpl_WebViewCommandBuilder : ASViewImpl_ViewCommandBuilder

#pragma mark Public

- (instancetype)initWithASWebViewImpl:(ASWebViewImpl *)outer$;

- (ASWebViewImpl_WebViewCommandBuilder *)animatorXmlWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)endAnimator;

- (ASWebViewImpl_WebViewCommandBuilder *)executeWithBoolean:(jboolean)setter;

- (ASWebViewImpl_WebViewCommandBuilder *)invalidate;

- (ASWebViewImpl_WebViewCommandBuilder *)loadUrlWithNSString:(NSString *)value;

- (ASWebViewImpl_WebViewCommandBuilder *)notifyDataSetChangedWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)refreshUiFromModelWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)requestLayout;

- (ASWebViewImpl_WebViewCommandBuilder *)reset;

- (ASWebViewImpl_WebViewCommandBuilder *)setAlphaWithFloat:(jfloat)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setAsDragSourceWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setAttributeUnderTestWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setBackgroundRepeatWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setBackgroundTintModeWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setBackgroundTintWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setBackgroundWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setBottomWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setClickableWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setContentDescriptionWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setCustomErrorMessageKeysWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setCustomErrorMessageValuesWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setDuplicateParentStateWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setElevationWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setEnabledWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setErrorStyleWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setFocusableWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setForegroundGravityWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setForegroundRepeatWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setForegroundTintModeWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setForegroundTintWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setForegroundWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIdWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setInvalidateOnFrameChangeWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosAccessibilityHintWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosAccessibilityIgnoresInvertColorsWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosAccessibilityLabelWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosAccessibilityTraitsWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosAccessibilityValueWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosAlphaWithFloat:(jfloat)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosAutoresizesSubviewsWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosBackgroundColorWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosClearsContextBeforeDrawingWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosClipsToBoundsWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosContentScaleFactorWithFloat:(jfloat)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosInsetsLayoutMarginsFromSafeAreaWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosIsAccessibilityElementWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosIsExclusiveTouchWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosIsHiddenWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosIsMultipleTouchEnabledWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosIsOpaqueWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosIsUserInteractionEnabledWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosLargeContentImageWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosLargeContentTitleWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosLayerBorderColorWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosLayerBorderWidthWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosLayerCornerRadiusWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosLayerMasksToBoundsWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosPreservesSuperviewLayoutMarginsWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosRestorationIdentifierWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosScalesLargeContentImageWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosShowsLargeContentViewerWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosTagWithInt:(jint)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosTintColorWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setIosTranslatesAutoresizingMaskIntoConstraintsWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setKeepScreenOnWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setLayoutDirectionWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setLeftWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setLongClickableWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setMaxHeightWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setMaxWidthWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setMinHeightWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setMinWidthWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setModelParamWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setModelPojoToUiParamsWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setModelPojoToUiWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setModelSyncEventsWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setModelUiToPojoEventIdsWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setModelUiToPojoWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setOnAnimationCancelWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setOnAnimationEndWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setOnAnimationRepeatWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setOnAnimationStartWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setOnClickWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setOnDragWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setOnKeyWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setOnLongClickWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setOnPageFinishedWithNSString:(NSString *)value;

- (ASWebViewImpl_WebViewCommandBuilder *)setOnPageStartedWithNSString:(NSString *)value;

- (ASWebViewImpl_WebViewCommandBuilder *)setOnReceivedErrorWithNSString:(NSString *)value;

- (ASWebViewImpl_WebViewCommandBuilder *)setOnSwipedWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setOnTouchWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setOutsideTouchableWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setRightWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setRotationWithFloat:(jfloat)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setRotationXWithFloat:(jfloat)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setRotationYWithFloat:(jfloat)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setScaleXWithFloat:(jfloat)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setScaleYWithFloat:(jfloat)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setSelectedWithBoolean:(jboolean)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setStyleWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setTextAlignmentWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setTextDirectionWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setTopWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setTransformPivotXWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setTransformPivotYWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setTranslationXWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setTranslationYWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setTranslationZWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setV_maxlengthWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setV_maxWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setV_minlengthWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setV_minWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setV_patternWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setV_requiredWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setV_typeWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setValidationErrorDisplayTypeWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setValidationWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setVisibilityWithNSString:(NSString *)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)setZIndexWithInt:(jint)arg0;

- (ASWebViewImpl_WebViewCommandBuilder *)startAnimator;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetAlpha;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetBackground;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetBackgroundTint;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetBackgroundTintMode;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetBottom;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetClickable;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetContentDescription;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetDuplicateParentState;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetEnabled;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetFocusable;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetForeground;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetForegroundGravity;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetForegroundTint;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetForegroundTintMode;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetId;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosAccessibilityHint;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosAccessibilityIgnoresInvertColors;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosAccessibilityLabel;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosAccessibilityTraits;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosAccessibilityValue;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosAlpha;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosAutoresizesSubviews;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosBackgroundColor;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosClearsContextBeforeDrawing;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosClipsToBounds;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosContentScaleFactor;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosInsetsLayoutMarginsFromSafeArea;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosIsAccessibilityElement;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosIsExclusiveTouch;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosIsFocused;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosIsHidden;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosIsMultipleTouchEnabled;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosIsOpaque;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosIsUserInteractionEnabled;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosLargeContentImage;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosLargeContentTitle;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosPreservesSuperviewLayoutMargins;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosRestorationIdentifier;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosScalesLargeContentImage;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosShowsLargeContentViewer;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosTag;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosTintColor;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetIosTranslatesAutoresizingMaskIntoConstraints;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetKeepScreenOn;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetLayoutDirection;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetLeft;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetLongClickable;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetMaxHeight;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetMaxWidth;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetMinHeight;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetMinWidth;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetModelParam;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetModelPojoToUi;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetModelSyncEvents;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetModelUiToPojo;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetRight;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetRotation;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetRotationX;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetRotationY;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetScaleX;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetScaleY;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetSelected;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetTextAlignment;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetTextDirection;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetTop;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetTransformPivotX;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetTransformPivotY;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetTranslationX;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetTranslationY;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetTranslationZ;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetValidateForm;

- (ASWebViewImpl_WebViewCommandBuilder *)tryGetVisibility;

- (ASWebViewImpl_WebViewCommandBuilder *)updateModelDataWithNSString:(NSString *)arg0
                                                              withId:(id)arg1;

- (ASWebViewImpl_WebViewCommandBuilder *)validateFormWithNSString:(NSString *)arg0;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASWebViewImpl_WebViewCommandBuilder)

FOUNDATION_EXPORT void ASWebViewImpl_WebViewCommandBuilder_initWithASWebViewImpl_(ASWebViewImpl_WebViewCommandBuilder *self, ASWebViewImpl *outer$);

FOUNDATION_EXPORT ASWebViewImpl_WebViewCommandBuilder *new_ASWebViewImpl_WebViewCommandBuilder_initWithASWebViewImpl_(ASWebViewImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASWebViewImpl_WebViewCommandBuilder *create_ASWebViewImpl_WebViewCommandBuilder_initWithASWebViewImpl_(ASWebViewImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASWebViewImpl_WebViewCommandBuilder)

#endif

#if !defined (ASWebViewImpl_WebViewBean_) && (INCLUDE_ALL_WebViewImpl || defined(INCLUDE_ASWebViewImpl_WebViewBean))
#define ASWebViewImpl_WebViewBean_

#define RESTRICT_ViewImpl 1
#define INCLUDE_ASViewImpl_ViewBean 1
#include "ViewImpl.h"

@class ASWebViewImpl;
@protocol ASIWidget;

@interface ASWebViewImpl_WebViewBean : ASViewImpl_ViewBean

#pragma mark Public

- (instancetype)initWithASWebViewImpl:(ASWebViewImpl *)outer$;

- (void)loadUrlWithNSString:(NSString *)value;

- (void)setOnPageFinishedWithNSString:(NSString *)value;

- (void)setOnPageStartedWithNSString:(NSString *)value;

- (void)setOnReceivedErrorWithNSString:(NSString *)value;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithASIWidget:(id<ASIWidget>)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASWebViewImpl_WebViewBean)

FOUNDATION_EXPORT void ASWebViewImpl_WebViewBean_initWithASWebViewImpl_(ASWebViewImpl_WebViewBean *self, ASWebViewImpl *outer$);

FOUNDATION_EXPORT ASWebViewImpl_WebViewBean *new_ASWebViewImpl_WebViewBean_initWithASWebViewImpl_(ASWebViewImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASWebViewImpl_WebViewBean *create_ASWebViewImpl_WebViewBean_initWithASWebViewImpl_(ASWebViewImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASWebViewImpl_WebViewBean)

#endif

#pragma pop_macro("INCLUDE_ALL_WebViewImpl")
