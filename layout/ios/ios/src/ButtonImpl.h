//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\ios_widget_library\src\main\java\com\ashera\layout\ButtonImpl.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ButtonImpl")
#ifdef RESTRICT_ButtonImpl
#define INCLUDE_ALL_ButtonImpl 0
#else
#define INCLUDE_ALL_ButtonImpl 1
#endif
#undef RESTRICT_ButtonImpl

#if !defined (ASButtonImpl_) && (INCLUDE_ALL_ButtonImpl || defined(INCLUDE_ASButtonImpl))
#define ASButtonImpl_

#define RESTRICT_BaseWidget 1
#define INCLUDE_ASBaseWidget 1
#include "BaseWidget.h"

#define RESTRICT_ICustomMeasureHeight 1
#define INCLUDE_ASICustomMeasureHeight 1
#include "ICustomMeasureHeight.h"

#define RESTRICT_ICustomMeasureWidth 1
#define INCLUDE_ASICustomMeasureWidth 1
#include "ICustomMeasureWidth.h"

@class ADButton;
@class ASButtonImpl_ButtonBean;
@class ASButtonImpl_ButtonCommandBuilder;
@class ASWidgetAttribute;
@class IOSClass;
@protocol ASIFragment;
@protocol ASILifeCycleDecorator;
@protocol ASIWidget;
@protocol JavaUtilMap;

@interface ASButtonImpl : ASBaseWidget < ASICustomMeasureHeight, ASICustomMeasureWidth > {
 @public
  id uiView_;
  ADButton *measurableView_;
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

- (ASButtonImpl_ButtonBean *)getBean;

- (jint)getBorderPadding;

- (ASButtonImpl_ButtonCommandBuilder *)getBuilder;

- (jint)getLineHeightPadding;

- (jint)getMaxEms;

- (jint)getMaxHeight;

- (jint)getMaxLines;

- (jint)getMaxWidth;

- (jint)getMinEms;

- (jint)getMinLines;

- (id)getPaddingBottom;

- (id)getPaddingLeft;

- (id)getPaddingRight;

- (id)getPaddingTop;

- (id)getPluginWithNSString:(NSString *)plugin;

- (IOSClass *)getViewClass;

- (void)invalidate;

- (void)loadAttributesWithNSString:(NSString *)attributeName;

- (jint)measureHeightWithInt:(jint)width;

- (jint)measureWidth;

- (id<ASIWidget>)newInstance OBJC_METHOD_FAMILY_NONE;

- (void)onRtlPropertiesChangedWithInt:(jint)layoutDirection;

- (void)requestLayout;

- (void)setAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
                             withNSString:(NSString *)strValue
                                   withId:(id)objValue
                withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (void)setIdWithNSString:(NSString *)id_;

- (void)setMyTextWithId:(id)text;

- (void)setPaddingBottomWithId:(id)paddingBottom;

- (void)setPaddingLeftWithId:(id)paddingLeft;

- (void)setPaddingRightWithId:(id)paddingRight;

- (void)setPaddingTopWithId:(id)paddingTop;

- (void)setVisibleWithBoolean:(jboolean)b;

- (void)updatePadding;

#pragma mark Package-Private

@end

J2OBJC_STATIC_INIT(ASButtonImpl)

J2OBJC_FIELD_SETTER(ASButtonImpl, uiView_, id)
J2OBJC_FIELD_SETTER(ASButtonImpl, measurableView_, ADButton *)

inline NSString *ASButtonImpl_get_LOCAL_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASButtonImpl_LOCAL_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASButtonImpl, LOCAL_NAME, NSString *)

inline NSString *ASButtonImpl_get_GROUP_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASButtonImpl_GROUP_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASButtonImpl, GROUP_NAME, NSString *)

FOUNDATION_EXPORT void ASButtonImpl_init(ASButtonImpl *self);

FOUNDATION_EXPORT ASButtonImpl *new_ASButtonImpl_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASButtonImpl *create_ASButtonImpl_init(void);

FOUNDATION_EXPORT void ASButtonImpl_initWithNSString_(ASButtonImpl *self, NSString *localname);

FOUNDATION_EXPORT ASButtonImpl *new_ASButtonImpl_initWithNSString_(NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASButtonImpl *create_ASButtonImpl_initWithNSString_(NSString *localname);

FOUNDATION_EXPORT void ASButtonImpl_initWithNSString_withNSString_(ASButtonImpl *self, NSString *groupName, NSString *localname);

FOUNDATION_EXPORT ASButtonImpl *new_ASButtonImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASButtonImpl *create_ASButtonImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname);

J2OBJC_TYPE_LITERAL_HEADER(ASButtonImpl)

@compatibility_alias ComAsheraLayoutButtonImpl ASButtonImpl;

#endif

#if !defined (ASButtonImpl_DrawableTintMode_) && (INCLUDE_ALL_ButtonImpl || defined(INCLUDE_ASButtonImpl_DrawableTintMode))
#define ASButtonImpl_DrawableTintMode_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASButtonImpl_DrawableTintMode : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASButtonImpl_DrawableTintMode)

FOUNDATION_EXPORT void ASButtonImpl_DrawableTintMode_init(ASButtonImpl_DrawableTintMode *self);

FOUNDATION_EXPORT ASButtonImpl_DrawableTintMode *new_ASButtonImpl_DrawableTintMode_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASButtonImpl_DrawableTintMode *create_ASButtonImpl_DrawableTintMode_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASButtonImpl_DrawableTintMode)

#endif

#if !defined (ASButtonImpl_MarqueeRepeatLimit_) && (INCLUDE_ALL_ButtonImpl || defined(INCLUDE_ASButtonImpl_MarqueeRepeatLimit))
#define ASButtonImpl_MarqueeRepeatLimit_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASButtonImpl_MarqueeRepeatLimit : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

- (jboolean)supportsIntAlso;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASButtonImpl_MarqueeRepeatLimit)

FOUNDATION_EXPORT void ASButtonImpl_MarqueeRepeatLimit_init(ASButtonImpl_MarqueeRepeatLimit *self);

FOUNDATION_EXPORT ASButtonImpl_MarqueeRepeatLimit *new_ASButtonImpl_MarqueeRepeatLimit_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASButtonImpl_MarqueeRepeatLimit *create_ASButtonImpl_MarqueeRepeatLimit_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASButtonImpl_MarqueeRepeatLimit)

#endif

#if !defined (ASButtonImpl_Font_) && (INCLUDE_ALL_ButtonImpl || defined(INCLUDE_ASButtonImpl_Font))
#define ASButtonImpl_Font_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASButtonImpl_Font : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASButtonImpl_Font)

FOUNDATION_EXPORT void ASButtonImpl_Font_init(ASButtonImpl_Font *self);

FOUNDATION_EXPORT ASButtonImpl_Font *new_ASButtonImpl_Font_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASButtonImpl_Font *create_ASButtonImpl_Font_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASButtonImpl_Font)

#endif

#if !defined (ASButtonImpl_TextStyle_) && (INCLUDE_ALL_ButtonImpl || defined(INCLUDE_ASButtonImpl_TextStyle))
#define ASButtonImpl_TextStyle_

#define RESTRICT_AbstractBitFlagConverter 1
#define INCLUDE_ASAbstractBitFlagConverter 1
#include "AbstractBitFlagConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASButtonImpl_TextStyle : ASAbstractBitFlagConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASButtonImpl_TextStyle)

FOUNDATION_EXPORT void ASButtonImpl_TextStyle_init(ASButtonImpl_TextStyle *self);

FOUNDATION_EXPORT ASButtonImpl_TextStyle *new_ASButtonImpl_TextStyle_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASButtonImpl_TextStyle *create_ASButtonImpl_TextStyle_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASButtonImpl_TextStyle)

#endif

#if !defined (ASButtonImpl_Ellipsize_) && (INCLUDE_ALL_ButtonImpl || defined(INCLUDE_ASButtonImpl_Ellipsize))
#define ASButtonImpl_Ellipsize_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASButtonImpl_Ellipsize : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASButtonImpl_Ellipsize)

FOUNDATION_EXPORT void ASButtonImpl_Ellipsize_init(ASButtonImpl_Ellipsize *self);

FOUNDATION_EXPORT ASButtonImpl_Ellipsize *new_ASButtonImpl_Ellipsize_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASButtonImpl_Ellipsize *create_ASButtonImpl_Ellipsize_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASButtonImpl_Ellipsize)

#endif

#if !defined (ASButtonImpl_JustificationMode_) && (INCLUDE_ALL_ButtonImpl || defined(INCLUDE_ASButtonImpl_JustificationMode))
#define ASButtonImpl_JustificationMode_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASButtonImpl_JustificationMode : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASButtonImpl_JustificationMode)

FOUNDATION_EXPORT void ASButtonImpl_JustificationMode_init(ASButtonImpl_JustificationMode *self);

FOUNDATION_EXPORT ASButtonImpl_JustificationMode *new_ASButtonImpl_JustificationMode_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASButtonImpl_JustificationMode *create_ASButtonImpl_JustificationMode_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASButtonImpl_JustificationMode)

#endif

#if !defined (ASButtonImpl_ButtonExt_) && (INCLUDE_ALL_ButtonImpl || defined(INCLUDE_ASButtonImpl_ButtonExt))
#define ASButtonImpl_ButtonExt_

#define RESTRICT_Button 1
#define INCLUDE_ADButton 1
#include "Button.h"

#define RESTRICT_ILifeCycleDecorator 1
#define INCLUDE_ASILifeCycleDecorator 1
#include "ILifeCycleDecorator.h"

@class ADRect;
@class ADView;
@class ASButtonImpl;
@class ASWidgetAttribute;
@class IOSIntArray;
@class IOSObjectArray;
@protocol ASIWidget;
@protocol JavaUtilList;

@interface ASButtonImpl_ButtonExt : ADButton < ASILifeCycleDecorator >

#pragma mark Public

- (instancetype)initWithASButtonImpl:(ASButtonImpl *)outer$;

- (jint)computeSizeWithFloat:(jfloat)width;

- (void)drawableStateChanged;

- (void)executeWithNSString:(NSString *)method
          withNSObjectArray:(IOSObjectArray *)canvas;

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)widgetAttribute;

- (jint)getBorderPadding;

- (jint)getBorderWidth;

- (jint)getLineHeight;

- (jint)getLineHeightPadding;

- (void)getLocationOnScreenWithIntArray:(IOSIntArray *)appScreenLocation;

- (id<JavaUtilList>)getMethods;

- (NSString *)getText;

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

- (instancetype)initWithASIWidget:(id<ASIWidget>)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASButtonImpl_ButtonExt)

FOUNDATION_EXPORT void ASButtonImpl_ButtonExt_initWithASButtonImpl_(ASButtonImpl_ButtonExt *self, ASButtonImpl *outer$);

FOUNDATION_EXPORT ASButtonImpl_ButtonExt *new_ASButtonImpl_ButtonExt_initWithASButtonImpl_(ASButtonImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASButtonImpl_ButtonExt *create_ASButtonImpl_ButtonExt_initWithASButtonImpl_(ASButtonImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASButtonImpl_ButtonExt)

#endif

#if !defined (ASButtonImpl_ButtonCommandBuilder_) && (INCLUDE_ALL_ButtonImpl || defined(INCLUDE_ASButtonImpl_ButtonCommandBuilder))
#define ASButtonImpl_ButtonCommandBuilder_

#define RESTRICT_ViewImpl 1
#define INCLUDE_ASViewImpl_ViewCommandBuilder 1
#include "ViewImpl.h"

@class ASButtonImpl;

@interface ASButtonImpl_ButtonCommandBuilder : ASViewImpl_ViewCommandBuilder

#pragma mark Public

- (instancetype)initWithASButtonImpl:(ASButtonImpl *)outer$;

- (ASButtonImpl_ButtonCommandBuilder *)executeWithBoolean:(jboolean)setter;

- (id)getDrawablePadding;

- (id)getEllipsize;

- (id)getFirstBaselineToTopHeight;

- (id)getGravity;

- (id)getHeight;

- (id)getJustificationMode;

- (id)getLastBaselineToBottomHeight;

- (id)getMarqueeRepeatLimit;

- (id)getMaxEms;

- (id)getMaxHeight;

- (id)getMaxLines;

- (id)getMaxWidth;

- (id)getMinEms;

- (id)getMinHeight;

- (id)getMinLines;

- (id)getMinWidth;

- (id)getPaddingBottom;

- (id)getPaddingEnd;

- (id)getPaddingLeft;

- (id)getPaddingRight;

- (id)getPaddingStart;

- (id)getPaddingTop;

- (id)getShadowColor;

- (id)getShadowDx;

- (id)getShadowDy;

- (id)getText;

- (id)getTextColor;

- (id)getTextSize;

- (id)getWidth;

- (ASButtonImpl_ButtonCommandBuilder *)invalidate;

- (ASButtonImpl_ButtonCommandBuilder *)notifyDataSetChangedWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)refreshUiFromModelWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)requestLayout;

- (ASButtonImpl_ButtonCommandBuilder *)reset;

- (ASButtonImpl_ButtonCommandBuilder *)setAlphaWithFloat:(jfloat)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setAsDragSourceWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setAttributeUnderTestWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setBackgroundRepeatWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setBackgroundTintModeWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setBackgroundTintWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setBackgroundWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setClickableWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setContentDescriptionWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setCustomErrorMessageKeysWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setCustomErrorMessageValuesWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setDrawableBottomWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setDrawableEndWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setDrawableLeftWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setDrawablePaddingWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setDrawableRightWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setDrawableStartWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setDrawableTintWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setDrawableTintModeWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setDrawableTopWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setDuplicateParentStateWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setEditableWithBoolean:(jboolean)value;

- (ASButtonImpl_ButtonCommandBuilder *)setEllipsizeWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setEmsWithInt:(jint)value;

- (ASButtonImpl_ButtonCommandBuilder *)setEnabledWithBoolean:(jboolean)value;

- (ASButtonImpl_ButtonCommandBuilder *)setErrorStyleWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setFirstBaselineToTopHeightWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setFocusableWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setFontFamilyWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setForegroundGravityWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setForegroundRepeatWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setForegroundTintModeWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setForegroundTintWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setForegroundWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setGravityWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setHeightWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setIdWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setInvalidateOnFrameChangeWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosAccessibilityHintWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosAccessibilityIgnoresInvertColorsWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosAccessibilityLabelWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosAccessibilityTraitsWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosAccessibilityValueWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosAlphaWithFloat:(jfloat)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosAutoresizesSubviewsWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosBackgroundColorWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosClearsContextBeforeDrawingWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosClipsToBoundsWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosContentScaleFactorWithFloat:(jfloat)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosInsetsLayoutMarginsFromSafeAreaWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosIsAccessibilityElementWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosIsExclusiveTouchWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosIsHiddenWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosIsMultipleTouchEnabledWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosIsOpaqueWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosIsUserInteractionEnabledWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosLargeContentImageWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosLargeContentTitleWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosLayerBorderColorWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosLayerBorderWidthWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosLayerCornerRadiusWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosLayerMasksToBoundsWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosPreservesSuperviewLayoutMarginsWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosRestorationIdentifierWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosScalesLargeContentImageWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosShowsLargeContentViewerWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosTagWithInt:(jint)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosTintColorWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setIosTranslatesAutoresizingMaskIntoConstraintsWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setJustificationModeWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setKeepScreenOnWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setLastBaselineToBottomHeightWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setLayoutDirectionWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setLinesWithInt:(jint)value;

- (ASButtonImpl_ButtonCommandBuilder *)setLongClickableWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setMarqueeRepeatLimitWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setMaxEmsWithInt:(jint)value;

- (ASButtonImpl_ButtonCommandBuilder *)setMaxHeightWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setMaxLengthWithInt:(jint)value;

- (ASButtonImpl_ButtonCommandBuilder *)setMaxLinesWithInt:(jint)value;

- (ASButtonImpl_ButtonCommandBuilder *)setMaxWidthWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setMinEmsWithInt:(jint)value;

- (ASButtonImpl_ButtonCommandBuilder *)setMinHeightWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setMinLinesWithInt:(jint)value;

- (ASButtonImpl_ButtonCommandBuilder *)setMinWidthWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setModelParamWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setModelPojoToUiParamsWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setModelPojoToUiWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setModelSyncEventsWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setModelUiToPojoEventIdsWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setModelUiToPojoWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setOnClickWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setOnDragWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setOnKeyWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setOnLongClickWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setOnSwipedWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setOnTouchWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setOutsideTouchableWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setPaddingWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setPaddingBottomWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setPaddingEndWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setPaddingHorizontalWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setPaddingLeftWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setPaddingRightWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setPaddingStartWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setPaddingTopWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setPaddingVerticalWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setRotationWithFloat:(jfloat)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setRotationXWithFloat:(jfloat)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setRotationYWithFloat:(jfloat)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setScaleXWithFloat:(jfloat)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setScaleYWithFloat:(jfloat)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setScrollHorizontallyWithBoolean:(jboolean)value;

- (ASButtonImpl_ButtonCommandBuilder *)setSelectedWithBoolean:(jboolean)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setShadowColorWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setShadowDxWithFloat:(jfloat)value;

- (ASButtonImpl_ButtonCommandBuilder *)setShadowDyWithFloat:(jfloat)value;

- (ASButtonImpl_ButtonCommandBuilder *)setSingleLineWithBoolean:(jboolean)value;

- (ASButtonImpl_ButtonCommandBuilder *)setStyleWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setTextWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setTextAlignmentWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setTextAllCapsWithBoolean:(jboolean)value;

- (ASButtonImpl_ButtonCommandBuilder *)setTextColorWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setTextDirectionWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setTextFormatWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setTextSizeWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setTextStyleWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setTransformPivotXWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setTransformPivotYWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setTranslationXWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setTranslationYWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setTranslationZWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setTypefaceWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setV_maxlengthWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setV_maxWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setV_minlengthWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setV_minWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setV_patternWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setV_requiredWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setV_typeWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setValidationErrorDisplayTypeWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setValidationWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setVisibilityWithNSString:(NSString *)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)setWidthWithNSString:(NSString *)value;

- (ASButtonImpl_ButtonCommandBuilder *)setZIndexWithInt:(jint)arg0;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetAlpha;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetBackground;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetBackgroundTint;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetBackgroundTintMode;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetClickable;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetContentDescription;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetDrawablePadding;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetDuplicateParentState;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetEllipsize;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetEnabled;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetFirstBaselineToTopHeight;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetFocusable;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetForeground;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetForegroundGravity;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetForegroundTint;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetForegroundTintMode;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetGravity;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetHeight;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetId;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosAccessibilityHint;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosAccessibilityIgnoresInvertColors;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosAccessibilityLabel;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosAccessibilityTraits;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosAccessibilityValue;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosAlpha;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosAutoresizesSubviews;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosBackgroundColor;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosClearsContextBeforeDrawing;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosClipsToBounds;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosContentScaleFactor;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosInsetsLayoutMarginsFromSafeArea;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosIsAccessibilityElement;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosIsExclusiveTouch;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosIsFocused;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosIsHidden;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosIsMultipleTouchEnabled;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosIsOpaque;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosIsUserInteractionEnabled;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosLargeContentImage;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosLargeContentTitle;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosPreservesSuperviewLayoutMargins;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosRestorationIdentifier;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosScalesLargeContentImage;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosShowsLargeContentViewer;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosTag;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosTintColor;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetIosTranslatesAutoresizingMaskIntoConstraints;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetJustificationMode;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetKeepScreenOn;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetLastBaselineToBottomHeight;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetLayoutDirection;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetLongClickable;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetMarqueeRepeatLimit;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetMaxEms;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetMaxHeight;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetMaxLines;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetMaxWidth;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetMinEms;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetMinHeight;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetMinLines;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetMinWidth;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetModelParam;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetModelPojoToUi;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetModelSyncEvents;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetModelUiToPojo;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetPaddingBottom;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetPaddingEnd;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetPaddingLeft;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetPaddingRight;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetPaddingStart;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetPaddingTop;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetRotation;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetRotationX;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetRotationY;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetScaleX;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetScaleY;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetSelected;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetShadowColor;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetShadowDx;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetShadowDy;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetText;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetTextAlignment;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetTextColor;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetTextDirection;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetTextSize;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetTransformPivotX;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetTransformPivotY;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetTranslationX;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetTranslationY;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetTranslationZ;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetValidateForm;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetVisibility;

- (ASButtonImpl_ButtonCommandBuilder *)tryGetWidth;

- (ASButtonImpl_ButtonCommandBuilder *)updateModelDataWithNSString:(NSString *)arg0
                                                            withId:(id)arg1;

- (ASButtonImpl_ButtonCommandBuilder *)validateFormWithNSString:(NSString *)arg0;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASButtonImpl_ButtonCommandBuilder)

FOUNDATION_EXPORT void ASButtonImpl_ButtonCommandBuilder_initWithASButtonImpl_(ASButtonImpl_ButtonCommandBuilder *self, ASButtonImpl *outer$);

FOUNDATION_EXPORT ASButtonImpl_ButtonCommandBuilder *new_ASButtonImpl_ButtonCommandBuilder_initWithASButtonImpl_(ASButtonImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASButtonImpl_ButtonCommandBuilder *create_ASButtonImpl_ButtonCommandBuilder_initWithASButtonImpl_(ASButtonImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASButtonImpl_ButtonCommandBuilder)

#endif

#if !defined (ASButtonImpl_ButtonBean_) && (INCLUDE_ALL_ButtonImpl || defined(INCLUDE_ASButtonImpl_ButtonBean))
#define ASButtonImpl_ButtonBean_

#define RESTRICT_ViewImpl 1
#define INCLUDE_ASViewImpl_ViewBean 1
#include "ViewImpl.h"

@class ASButtonImpl;
@protocol ASIWidget;

@interface ASButtonImpl_ButtonBean : ASViewImpl_ViewBean

#pragma mark Public

- (instancetype)initWithASButtonImpl:(ASButtonImpl *)outer$;

- (id)getDrawablePadding;

- (id)getEllipsize;

- (id)getFirstBaselineToTopHeight;

- (id)getGravity;

- (id)getHeight;

- (id)getJustificationMode;

- (id)getLastBaselineToBottomHeight;

- (id)getMarqueeRepeatLimit;

- (id)getMaxEms;

- (id)getMaxHeight;

- (id)getMaxLines;

- (id)getMaxWidth;

- (id)getMinEms;

- (id)getMinHeight;

- (id)getMinLines;

- (id)getMinWidth;

- (id)getPaddingBottom;

- (id)getPaddingEnd;

- (id)getPaddingLeft;

- (id)getPaddingRight;

- (id)getPaddingStart;

- (id)getPaddingTop;

- (id)getShadowColor;

- (id)getShadowDx;

- (id)getShadowDy;

- (id)getText;

- (id)getTextColor;

- (id)getTextSize;

- (id)getWidth;

- (void)setDrawableBottomWithNSString:(NSString *)value;

- (void)setDrawableEndWithNSString:(NSString *)value;

- (void)setDrawableLeftWithNSString:(NSString *)value;

- (void)setDrawablePaddingWithNSString:(NSString *)value;

- (void)setDrawableRightWithNSString:(NSString *)value;

- (void)setDrawableStartWithNSString:(NSString *)value;

- (void)setDrawableTintWithNSString:(NSString *)value;

- (void)setDrawableTintModeWithNSString:(NSString *)value;

- (void)setDrawableTopWithNSString:(NSString *)value;

- (void)setEditableWithBoolean:(jboolean)value;

- (void)setEllipsizeWithNSString:(NSString *)value;

- (void)setEmsWithInt:(jint)value;

- (void)setEnabledWithBoolean:(jboolean)value;

- (void)setFirstBaselineToTopHeightWithNSString:(NSString *)value;

- (void)setFontFamilyWithNSString:(NSString *)value;

- (void)setGravityWithNSString:(NSString *)value;

- (void)setHeightWithNSString:(NSString *)value;

- (void)setJustificationModeWithNSString:(NSString *)value;

- (void)setLastBaselineToBottomHeightWithNSString:(NSString *)value;

- (void)setLinesWithInt:(jint)value;

- (void)setMarqueeRepeatLimitWithNSString:(NSString *)value;

- (void)setMaxEmsWithInt:(jint)value;

- (void)setMaxHeightWithNSString:(NSString *)value;

- (void)setMaxLengthWithInt:(jint)value;

- (void)setMaxLinesWithInt:(jint)value;

- (void)setMaxWidthWithNSString:(NSString *)value;

- (void)setMinEmsWithInt:(jint)value;

- (void)setMinHeightWithNSString:(NSString *)value;

- (void)setMinLinesWithInt:(jint)value;

- (void)setMinWidthWithNSString:(NSString *)value;

- (void)setPaddingWithNSString:(NSString *)value;

- (void)setPaddingBottomWithNSString:(NSString *)value;

- (void)setPaddingEndWithNSString:(NSString *)value;

- (void)setPaddingHorizontalWithNSString:(NSString *)value;

- (void)setPaddingLeftWithNSString:(NSString *)value;

- (void)setPaddingRightWithNSString:(NSString *)value;

- (void)setPaddingStartWithNSString:(NSString *)value;

- (void)setPaddingTopWithNSString:(NSString *)value;

- (void)setPaddingVerticalWithNSString:(NSString *)value;

- (void)setScrollHorizontallyWithBoolean:(jboolean)value;

- (void)setShadowColorWithNSString:(NSString *)value;

- (void)setShadowDxWithFloat:(jfloat)value;

- (void)setShadowDyWithFloat:(jfloat)value;

- (void)setSingleLineWithBoolean:(jboolean)value;

- (void)setTextWithNSString:(NSString *)value;

- (void)setTextAllCapsWithBoolean:(jboolean)value;

- (void)setTextColorWithNSString:(NSString *)value;

- (void)setTextFormatWithNSString:(NSString *)value;

- (void)setTextSizeWithNSString:(NSString *)value;

- (void)setTextStyleWithNSString:(NSString *)value;

- (void)setTypefaceWithNSString:(NSString *)value;

- (void)setWidthWithNSString:(NSString *)value;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithASIWidget:(id<ASIWidget>)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASButtonImpl_ButtonBean)

FOUNDATION_EXPORT void ASButtonImpl_ButtonBean_initWithASButtonImpl_(ASButtonImpl_ButtonBean *self, ASButtonImpl *outer$);

FOUNDATION_EXPORT ASButtonImpl_ButtonBean *new_ASButtonImpl_ButtonBean_initWithASButtonImpl_(ASButtonImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASButtonImpl_ButtonBean *create_ASButtonImpl_ButtonBean_initWithASButtonImpl_(ASButtonImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASButtonImpl_ButtonBean)

#endif

#pragma pop_macro("INCLUDE_ALL_ButtonImpl")
