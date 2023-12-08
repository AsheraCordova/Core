//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\ios_widget_library\src\main\java\com\ashera\layout\LinearLayoutImpl.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_LinearLayoutImpl")
#ifdef RESTRICT_LinearLayoutImpl
#define INCLUDE_ALL_LinearLayoutImpl 0
#else
#define INCLUDE_ALL_LinearLayoutImpl 1
#endif
#undef RESTRICT_LinearLayoutImpl

#if !defined (ASLinearLayoutImpl_) && (INCLUDE_ALL_LinearLayoutImpl || defined(INCLUDE_ASLinearLayoutImpl))
#define ASLinearLayoutImpl_

#define RESTRICT_BaseHasWidgets 1
#define INCLUDE_ASBaseHasWidgets 1
#include "BaseHasWidgets.h"

@class ASLinearLayoutImpl_LinearLayoutBean;
@class ASLinearLayoutImpl_LinearLayoutCommandBuilder;
@class ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder;
@class ASLinearLayoutImpl_LinearLayoutParamsBean;
@class ASWidgetAttribute;
@class IOSClass;
@protocol ASIFragment;
@protocol ASILifeCycleDecorator;
@protocol ASIWidget;
@protocol JavaUtilMap;

@interface ASLinearLayoutImpl : ASBaseHasWidgets
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

- (ASLinearLayoutImpl_LinearLayoutBean *)getBean;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)getBuilder;

- (id)getChildAttributeWithASIWidget:(id<ASIWidget>)w
               withASWidgetAttribute:(ASWidgetAttribute *)key;

- (ASLinearLayoutImpl_LinearLayoutParamsBean *)getParamsBean;

- (ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *)getParamsBuilder;

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

J2OBJC_EMPTY_STATIC_INIT(ASLinearLayoutImpl)

inline NSString *ASLinearLayoutImpl_get_LOCAL_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASLinearLayoutImpl_LOCAL_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASLinearLayoutImpl, LOCAL_NAME, NSString *)

inline NSString *ASLinearLayoutImpl_get_GROUP_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASLinearLayoutImpl_GROUP_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASLinearLayoutImpl, GROUP_NAME, NSString *)

FOUNDATION_EXPORT void ASLinearLayoutImpl_init(ASLinearLayoutImpl *self);

FOUNDATION_EXPORT ASLinearLayoutImpl *new_ASLinearLayoutImpl_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASLinearLayoutImpl *create_ASLinearLayoutImpl_init(void);

FOUNDATION_EXPORT void ASLinearLayoutImpl_initWithNSString_(ASLinearLayoutImpl *self, NSString *localname);

FOUNDATION_EXPORT ASLinearLayoutImpl *new_ASLinearLayoutImpl_initWithNSString_(NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASLinearLayoutImpl *create_ASLinearLayoutImpl_initWithNSString_(NSString *localname);

FOUNDATION_EXPORT void ASLinearLayoutImpl_initWithNSString_withNSString_(ASLinearLayoutImpl *self, NSString *groupName, NSString *localname);

FOUNDATION_EXPORT ASLinearLayoutImpl *new_ASLinearLayoutImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASLinearLayoutImpl *create_ASLinearLayoutImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname);

J2OBJC_TYPE_LITERAL_HEADER(ASLinearLayoutImpl)

@compatibility_alias ComAsheraLayoutLinearLayoutImpl ASLinearLayoutImpl;

#endif

#if !defined (ASLinearLayoutImpl_Orientation_) && (INCLUDE_ALL_LinearLayoutImpl || defined(INCLUDE_ASLinearLayoutImpl_Orientation))
#define ASLinearLayoutImpl_Orientation_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASLinearLayoutImpl_Orientation : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASLinearLayoutImpl_Orientation)

FOUNDATION_EXPORT void ASLinearLayoutImpl_Orientation_init(ASLinearLayoutImpl_Orientation *self);

FOUNDATION_EXPORT ASLinearLayoutImpl_Orientation *new_ASLinearLayoutImpl_Orientation_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASLinearLayoutImpl_Orientation *create_ASLinearLayoutImpl_Orientation_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASLinearLayoutImpl_Orientation)

#endif

#if !defined (ASLinearLayoutImpl_Divider_) && (INCLUDE_ALL_LinearLayoutImpl || defined(INCLUDE_ASLinearLayoutImpl_Divider))
#define ASLinearLayoutImpl_Divider_

#define RESTRICT_AbstractBitFlagConverter 1
#define INCLUDE_ASAbstractBitFlagConverter 1
#include "AbstractBitFlagConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASLinearLayoutImpl_Divider : ASAbstractBitFlagConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASLinearLayoutImpl_Divider)

FOUNDATION_EXPORT void ASLinearLayoutImpl_Divider_init(ASLinearLayoutImpl_Divider *self);

FOUNDATION_EXPORT ASLinearLayoutImpl_Divider *new_ASLinearLayoutImpl_Divider_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASLinearLayoutImpl_Divider *create_ASLinearLayoutImpl_Divider_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASLinearLayoutImpl_Divider)

#endif

#if !defined (ASLinearLayoutImpl_LinearLayoutExt_) && (INCLUDE_ALL_LinearLayoutImpl || defined(INCLUDE_ASLinearLayoutImpl_LinearLayoutExt))
#define ASLinearLayoutImpl_LinearLayoutExt_

#define RESTRICT_LinearLayout 1
#define INCLUDE_ADLinearLayout 1
#include "LinearLayout.h"

#define RESTRICT_ILifeCycleDecorator 1
#define INCLUDE_ASILifeCycleDecorator 1
#include "ILifeCycleDecorator.h"

#define RESTRICT_IMaxDimension 1
#define INCLUDE_ASIMaxDimension 1
#include "IMaxDimension.h"

@class ADContext;
@class ADRect;
@class ADView;
@class ASLinearLayoutImpl;
@class ASWidgetAttribute;
@class IOSIntArray;
@class IOSObjectArray;
@protocol ASIWidget;
@protocol JavaUtilList;

@interface ASLinearLayoutImpl_LinearLayoutExt : ADLinearLayout < ASILifeCycleDecorator, ASIMaxDimension >

#pragma mark Public

- (instancetype)initWithASLinearLayoutImpl:(ASLinearLayoutImpl *)outer$;

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

- (instancetype)initWithADContext:(ADContext *)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASLinearLayoutImpl_LinearLayoutExt)

FOUNDATION_EXPORT void ASLinearLayoutImpl_LinearLayoutExt_initWithASLinearLayoutImpl_(ASLinearLayoutImpl_LinearLayoutExt *self, ASLinearLayoutImpl *outer$);

FOUNDATION_EXPORT ASLinearLayoutImpl_LinearLayoutExt *new_ASLinearLayoutImpl_LinearLayoutExt_initWithASLinearLayoutImpl_(ASLinearLayoutImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASLinearLayoutImpl_LinearLayoutExt *create_ASLinearLayoutImpl_LinearLayoutExt_initWithASLinearLayoutImpl_(ASLinearLayoutImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASLinearLayoutImpl_LinearLayoutExt)

#endif

#if !defined (ASLinearLayoutImpl_LinearLayoutCommandBuilder_) && (INCLUDE_ALL_LinearLayoutImpl || defined(INCLUDE_ASLinearLayoutImpl_LinearLayoutCommandBuilder))
#define ASLinearLayoutImpl_LinearLayoutCommandBuilder_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupCommandBuilder 1
#include "ViewGroupImpl.h"

@class ASLinearLayoutImpl;

@interface ASLinearLayoutImpl_LinearLayoutCommandBuilder : ASViewGroupImpl_ViewGroupCommandBuilder

#pragma mark Public

- (instancetype)initWithASLinearLayoutImpl:(ASLinearLayoutImpl *)outer$;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)addAllModelWithId:(id)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)addModelByIndexWithId:(id)arg0
                                                                  withId:(id)arg1;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)addModelWithId:(id)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)executeWithBoolean:(jboolean)setter;

- (id)getBaselineAlignedChildIndex;

- (id)getDivider;

- (id)getDividerPadding;

- (id)getGravity;

- (id)getOrientation;

- (id)getShowDividers;

- (id)getWeightSum;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)invalidate;

- (id)isBaselineAligned;

- (id)isMeasureWithLargestChild;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)notifyDataSetChangedWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)refreshUiFromModelWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)removeModelAtIndexWithInt:(jint)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)removeModelByIdWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)requestLayout;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)reset;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setAddStatesFromChildrenWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setAlphaWithFloat:(jfloat)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setAsDragSourceWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setAttributeUnderTestWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setBackgroundRepeatWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setBackgroundTintModeWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setBackgroundTintWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setBackgroundWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setBaselineAlignedWithBoolean:(jboolean)value;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setBaselineAlignedChildIndexWithInt:(jint)value;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setChildXmlWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setClickableWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setClipChildrenWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setClipToPaddingWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setContentDescriptionWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setCustomErrorMessageKeysWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setCustomErrorMessageValuesWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setDividerWithNSString:(NSString *)value;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setDividerPaddingWithNSString:(NSString *)value;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setDuplicateParentStateWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setEnabledWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setErrorStyleWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setFocusableWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setForegroundGravityWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setForegroundRepeatWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setForegroundTintModeWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setForegroundTintWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setForegroundWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setGravityWithNSString:(NSString *)value;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIdWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setInvalidateOnFrameChangeWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosAccessibilityHintWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosAccessibilityIgnoresInvertColorsWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosAccessibilityLabelWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosAccessibilityTraitsWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosAccessibilityValueWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosAlphaWithFloat:(jfloat)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosAutoresizesSubviewsWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosBackgroundColorWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosClearsContextBeforeDrawingWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosClipsToBoundsWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosContentScaleFactorWithFloat:(jfloat)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosInsetsLayoutMarginsFromSafeAreaWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosIsAccessibilityElementWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosIsExclusiveTouchWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosIsHiddenWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosIsMultipleTouchEnabledWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosIsOpaqueWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosIsUserInteractionEnabledWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosLargeContentImageWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosLargeContentTitleWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosLayerBorderColorWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosLayerBorderWidthWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosLayerCornerRadiusWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosLayerMasksToBoundsWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosPreservesSuperviewLayoutMarginsWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosRestorationIdentifierWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosScalesLargeContentImageWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosShowsLargeContentViewerWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosTagWithInt:(jint)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosTintColorWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setIosTranslatesAutoresizingMaskIntoConstraintsWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setKeepScreenOnWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setLayoutDirectionWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setLayoutModeWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setListitemWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setLongClickableWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setMaxHeightWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setMaxWidthWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setMeasureWithLargestChildWithBoolean:(jboolean)value;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setMinHeightWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setMinWidthWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setModelDescPathWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setModelForWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setModelIdPathWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setModelParamWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setModelPojoToUiParamsWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setModelPojoToUiWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setModelSyncEventsWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setModelUiToPojoEventIdsWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setModelUiToPojoWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setOnChildViewAddedWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setOnChildViewRemovedWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setOnClickWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setOnDragWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setOnKeyWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setOnLongClickWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setOnSwipedWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setOnTouchWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setOrientationWithNSString:(NSString *)value;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setOutsideTouchableWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setPaddingBottomWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setPaddingEndWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setPaddingHorizontalWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setPaddingLeftWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setPaddingRightWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setPaddingStartWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setPaddingTopWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setPaddingVerticalWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setPaddingWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setRotationWithFloat:(jfloat)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setRotationXWithFloat:(jfloat)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setRotationYWithFloat:(jfloat)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setScaleXWithFloat:(jfloat)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setScaleYWithFloat:(jfloat)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setSelectedWithBoolean:(jboolean)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setShowDividersWithNSString:(NSString *)value;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setStyleWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setTextAlignmentWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setTextDirectionWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setTransformPivotXWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setTransformPivotYWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setTranslationXWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setTranslationYWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setTranslationZWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setV_maxlengthWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setV_maxWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setV_minlengthWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setV_minWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setV_patternWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setV_requiredWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setV_typeWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setValidationErrorDisplayTypeWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setValidationWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setVisibilityWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setWeightSumWithFloat:(jfloat)value;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)setZIndexWithInt:(jint)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetAddStatesFromChildren;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetAlpha;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetBackground;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetBackgroundTint;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetBackgroundTintMode;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetBaselineAligned;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetBaselineAlignedChildIndex;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetClickable;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetClipChildren;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetClipToPadding;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetContentDescription;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetDivider;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetDividerPadding;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetDuplicateParentState;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetEnabled;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetFocusable;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetForeground;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetForegroundGravity;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetForegroundTint;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetForegroundTintMode;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetGravity;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetId;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosAccessibilityHint;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosAccessibilityIgnoresInvertColors;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosAccessibilityLabel;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosAccessibilityTraits;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosAccessibilityValue;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosAlpha;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosAutoresizesSubviews;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosBackgroundColor;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosClearsContextBeforeDrawing;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosClipsToBounds;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosContentScaleFactor;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosInsetsLayoutMarginsFromSafeArea;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosIsAccessibilityElement;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosIsExclusiveTouch;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosIsFocused;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosIsHidden;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosIsMultipleTouchEnabled;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosIsOpaque;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosIsUserInteractionEnabled;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosLargeContentImage;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosLargeContentTitle;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosPreservesSuperviewLayoutMargins;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosRestorationIdentifier;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosScalesLargeContentImage;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosShowsLargeContentViewer;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosTag;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosTintColor;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetIosTranslatesAutoresizingMaskIntoConstraints;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetKeepScreenOn;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetLayoutDirection;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetLayoutMode;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetLongClickable;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetMaxHeight;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetMaxWidth;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetMeasureWithLargestChild;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetMinHeight;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetMinWidth;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetModelDescPath;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetModelIdPath;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetModelParam;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetModelPojoToUi;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetModelSyncEvents;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetModelUiToPojo;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetOrientation;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetPaddingBottom;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetPaddingEnd;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetPaddingLeft;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetPaddingRight;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetPaddingStart;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetPaddingTop;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetRotation;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetRotationX;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetRotationY;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetScaleX;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetScaleY;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetSelected;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetShowDividers;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetTextAlignment;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetTextDirection;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetTransformPivotX;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetTransformPivotY;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetTranslationX;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetTranslationY;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetTranslationZ;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetValidateForm;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetVisibility;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)tryGetWeightSum;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)updateModelDataWithNSString:(NSString *)arg0
                                                                        withId:(id)arg1;

- (ASLinearLayoutImpl_LinearLayoutCommandBuilder *)validateFormWithNSString:(NSString *)arg0;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASLinearLayoutImpl_LinearLayoutCommandBuilder)

FOUNDATION_EXPORT void ASLinearLayoutImpl_LinearLayoutCommandBuilder_initWithASLinearLayoutImpl_(ASLinearLayoutImpl_LinearLayoutCommandBuilder *self, ASLinearLayoutImpl *outer$);

FOUNDATION_EXPORT ASLinearLayoutImpl_LinearLayoutCommandBuilder *new_ASLinearLayoutImpl_LinearLayoutCommandBuilder_initWithASLinearLayoutImpl_(ASLinearLayoutImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASLinearLayoutImpl_LinearLayoutCommandBuilder *create_ASLinearLayoutImpl_LinearLayoutCommandBuilder_initWithASLinearLayoutImpl_(ASLinearLayoutImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASLinearLayoutImpl_LinearLayoutCommandBuilder)

#endif

#if !defined (ASLinearLayoutImpl_LinearLayoutBean_) && (INCLUDE_ALL_LinearLayoutImpl || defined(INCLUDE_ASLinearLayoutImpl_LinearLayoutBean))
#define ASLinearLayoutImpl_LinearLayoutBean_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupBean 1
#include "ViewGroupImpl.h"

@class ASLinearLayoutImpl;
@protocol ASIWidget;

@interface ASLinearLayoutImpl_LinearLayoutBean : ASViewGroupImpl_ViewGroupBean

#pragma mark Public

- (instancetype)initWithASLinearLayoutImpl:(ASLinearLayoutImpl *)outer$;

- (id)getBaselineAlignedChildIndex;

- (id)getDivider;

- (id)getDividerPadding;

- (id)getGravity;

- (id)getOrientation;

- (id)getShowDividers;

- (id)getWeightSum;

- (id)isBaselineAligned;

- (id)isMeasureWithLargestChild;

- (void)setBaselineAlignedWithBoolean:(jboolean)value;

- (void)setBaselineAlignedChildIndexWithInt:(jint)value;

- (void)setDividerWithNSString:(NSString *)value;

- (void)setDividerPaddingWithNSString:(NSString *)value;

- (void)setGravityWithNSString:(NSString *)value;

- (void)setMeasureWithLargestChildWithBoolean:(jboolean)value;

- (void)setOrientationWithNSString:(NSString *)value;

- (void)setShowDividersWithNSString:(NSString *)value;

- (void)setWeightSumWithFloat:(jfloat)value;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithASIWidget:(id<ASIWidget>)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASLinearLayoutImpl_LinearLayoutBean)

FOUNDATION_EXPORT void ASLinearLayoutImpl_LinearLayoutBean_initWithASLinearLayoutImpl_(ASLinearLayoutImpl_LinearLayoutBean *self, ASLinearLayoutImpl *outer$);

FOUNDATION_EXPORT ASLinearLayoutImpl_LinearLayoutBean *new_ASLinearLayoutImpl_LinearLayoutBean_initWithASLinearLayoutImpl_(ASLinearLayoutImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASLinearLayoutImpl_LinearLayoutBean *create_ASLinearLayoutImpl_LinearLayoutBean_initWithASLinearLayoutImpl_(ASLinearLayoutImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASLinearLayoutImpl_LinearLayoutBean)

#endif

#if !defined (ASLinearLayoutImpl_LinearLayoutParamsBean_) && (INCLUDE_ALL_LinearLayoutImpl || defined(INCLUDE_ASLinearLayoutImpl_LinearLayoutParamsBean))
#define ASLinearLayoutImpl_LinearLayoutParamsBean_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupParamsBean 1
#include "ViewGroupImpl.h"

@class ASLinearLayoutImpl;
@protocol ASIWidget;

@interface ASLinearLayoutImpl_LinearLayoutParamsBean : ASViewGroupImpl_ViewGroupParamsBean

#pragma mark Public

- (instancetype)initWithASLinearLayoutImpl:(ASLinearLayoutImpl *)outer$;

- (id)getLayoutGravityWithASIWidget:(id<ASIWidget>)w;

- (id)getLayoutWeightWithASIWidget:(id<ASIWidget>)w;

- (void)setLayoutGravityWithASIWidget:(id<ASIWidget>)w
                         withNSString:(NSString *)value;

- (void)setLayoutWeightWithASIWidget:(id<ASIWidget>)w
                           withFloat:(jfloat)value;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASLinearLayoutImpl_LinearLayoutParamsBean)

FOUNDATION_EXPORT void ASLinearLayoutImpl_LinearLayoutParamsBean_initWithASLinearLayoutImpl_(ASLinearLayoutImpl_LinearLayoutParamsBean *self, ASLinearLayoutImpl *outer$);

FOUNDATION_EXPORT ASLinearLayoutImpl_LinearLayoutParamsBean *new_ASLinearLayoutImpl_LinearLayoutParamsBean_initWithASLinearLayoutImpl_(ASLinearLayoutImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASLinearLayoutImpl_LinearLayoutParamsBean *create_ASLinearLayoutImpl_LinearLayoutParamsBean_initWithASLinearLayoutImpl_(ASLinearLayoutImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASLinearLayoutImpl_LinearLayoutParamsBean)

#endif

#if !defined (ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder_) && (INCLUDE_ALL_LinearLayoutImpl || defined(INCLUDE_ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder))
#define ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder_

#define RESTRICT_ViewGroupImpl 1
#define INCLUDE_ASViewGroupImpl_ViewGroupCommandParamsBuilder 1
#include "ViewGroupImpl.h"

@class ASLinearLayoutImpl;

@interface ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder : ASViewGroupImpl_ViewGroupCommandParamsBuilder

#pragma mark Public

- (instancetype)initWithASLinearLayoutImpl:(ASLinearLayoutImpl *)outer$;

- (id)getLayoutGravity;

- (id)getLayoutWeight;

- (ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *)reset;

- (ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *)setLayoutGravityWithNSString:(NSString *)value;

- (ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *)setLayoutMarginBottomWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *)setLayoutMarginEndWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *)setLayoutMarginHorizontalWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *)setLayoutMarginLeftWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *)setLayoutMarginRightWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *)setLayoutMarginStartWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *)setLayoutMarginTopWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *)setLayoutMarginVerticalWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *)setLayoutMarginWithNSString:(NSString *)arg0;

- (ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *)setLayoutWeightWithFloat:(jfloat)value;

- (ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *)tryGetLayoutGravity;

- (ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *)tryGetLayoutMarginBottom;

- (ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *)tryGetLayoutMarginEnd;

- (ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *)tryGetLayoutMarginLeft;

- (ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *)tryGetLayoutMarginRight;

- (ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *)tryGetLayoutMarginStart;

- (ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *)tryGetLayoutMarginTop;

- (ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *)tryGetLayoutWeight;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder)

FOUNDATION_EXPORT void ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder_initWithASLinearLayoutImpl_(ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *self, ASLinearLayoutImpl *outer$);

FOUNDATION_EXPORT ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *new_ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder_initWithASLinearLayoutImpl_(ASLinearLayoutImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder *create_ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder_initWithASLinearLayoutImpl_(ASLinearLayoutImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASLinearLayoutImpl_LinearLayoutCommandParamsBuilder)

#endif

#pragma pop_macro("INCLUDE_ALL_LinearLayoutImpl")
