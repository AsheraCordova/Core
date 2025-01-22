//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\ios_widget_library\src\main\java\com\ashera\layout\TextViewImpl.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_TextViewImpl")
#ifdef RESTRICT_TextViewImpl
#define INCLUDE_ALL_TextViewImpl 0
#else
#define INCLUDE_ALL_TextViewImpl 1
#endif
#undef RESTRICT_TextViewImpl

#if !defined (ASTextViewImpl_) && (INCLUDE_ALL_TextViewImpl || defined(INCLUDE_ASTextViewImpl))
#define ASTextViewImpl_

#define RESTRICT_BaseWidget 1
#define INCLUDE_ASBaseWidget 1
#include "BaseWidget.h"

#define RESTRICT_ValidationErrorLabel 1
#define INCLUDE_ASValidationErrorLabel 1
#include "ValidationErrorLabel.h"

@class ADTextView;
@class ASWidgetAttribute;
@class IOSClass;
@protocol ASIFragment;
@protocol ASILifeCycleDecorator;
@protocol ASIWidget;
@protocol JavaUtilMap;

@interface ASTextViewImpl : ASBaseWidget < ASValidationErrorLabel > {
 @public
  id uiView_;
  ADTextView *measurableView_;
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

- (id)getAdjustsFontSizeToFitWidth;

- (id)getAllowsDefaultTighteningForTruncation;

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
              withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (jint)getBaseLine;

- (jint)getBorderPadding;

- (id)getHighlightedTextColor;

- (id)getIsEnabled;

- (id)getIsHighlighted;

- (id)getIsUserInteractionEnabled;

- (jint)getLineHeightPadding;

- (jint)getMaxEms;

- (jint)getMaxHeight;

- (jint)getMaxLines;

- (jint)getMaxWidth;

- (jint)getMinEms;

- (id)getMinimumScaleFactor;

- (jint)getMinLines;

- (id)getNumberOfLines;

- (id)getPreferredMaxLayoutWidth;

- (id)getShadowColor;

- (id)getText;

- (id)getTextColor;

- (IOSClass *)getViewClass;

- (void)invalidate;

- (void)loadAttributesWithNSString:(NSString *)attributeName;

- (id<ASIWidget>)newInstance OBJC_METHOD_FAMILY_NONE;

- (void)onRtlPropertiesChangedWithInt:(jint)layoutDirection;

- (void)requestLayout;

- (void)setAdjustsFontSizeToFitWidthWithId:(id)nativeWidget
                                    withId:(id)value;

- (void)setAllowsDefaultTighteningForTruncationWithId:(id)nativeWidget
                                               withId:(id)value;

- (void)setAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
                             withNSString:(NSString *)strValue
                                   withId:(id)objValue
                withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (void)setErrorMessageWithNSString:(NSString *)message;

- (void)setHighlightedTextColorWithId:(id)nativeWidget
                               withId:(id)value;

- (void)setIdWithNSString:(NSString *)id_;

- (void)setIsEnabledWithId:(id)nativeWidget
                    withId:(id)value;

- (void)setIsHighlightedWithId:(id)nativeWidget
                        withId:(id)value;

- (void)setIsUserInteractionEnabledWithId:(id)nativeWidget
                                   withId:(id)value;

- (void)setMinimumScaleFactorWithId:(id)nativeWidget
                             withId:(id)value;

- (void)setNumberOfLinesWithId:(id)nativeWidget
                        withId:(id)value;

- (void)setPaddingWithId:(id)objValue;

- (void)setPaddingBottomWithId:(id)objValue;

- (void)setPaddingLeftWithId:(id)objValue;

- (void)setPaddingRightWithId:(id)objValue;

- (void)setPaddingTopWithId:(id)objValue;

- (void)setPreferredMaxLayoutWidthWithId:(id)nativeWidget
                                  withId:(id)value;

- (void)setShadowColorWithId:(id)nativeWidget
                      withId:(id)value;

- (void)setTextWithId:(id)nativeWidget
               withId:(id)value;

- (void)setTextColorWithId:(id)nativeWidget
                    withId:(id)value;

- (void)setVisibleWithBoolean:(jboolean)b;

+ (NSString *)toUpperCaseWithNSString:(NSString *)text;

- (void)updatePadding;

#pragma mark Package-Private

@end

J2OBJC_STATIC_INIT(ASTextViewImpl)

J2OBJC_FIELD_SETTER(ASTextViewImpl, uiView_, id)
J2OBJC_FIELD_SETTER(ASTextViewImpl, measurableView_, ADTextView *)

inline NSString *ASTextViewImpl_get_LOCAL_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASTextViewImpl_LOCAL_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASTextViewImpl, LOCAL_NAME, NSString *)

inline NSString *ASTextViewImpl_get_GROUP_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASTextViewImpl_GROUP_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASTextViewImpl, GROUP_NAME, NSString *)

FOUNDATION_EXPORT void ASTextViewImpl_init(ASTextViewImpl *self);

FOUNDATION_EXPORT ASTextViewImpl *new_ASTextViewImpl_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTextViewImpl *create_ASTextViewImpl_init(void);

FOUNDATION_EXPORT void ASTextViewImpl_initWithNSString_(ASTextViewImpl *self, NSString *localname);

FOUNDATION_EXPORT ASTextViewImpl *new_ASTextViewImpl_initWithNSString_(NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTextViewImpl *create_ASTextViewImpl_initWithNSString_(NSString *localname);

FOUNDATION_EXPORT void ASTextViewImpl_initWithNSString_withNSString_(ASTextViewImpl *self, NSString *groupName, NSString *localname);

FOUNDATION_EXPORT ASTextViewImpl *new_ASTextViewImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTextViewImpl *create_ASTextViewImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname);

FOUNDATION_EXPORT NSString *ASTextViewImpl_toUpperCaseWithNSString_(NSString *text);

J2OBJC_TYPE_LITERAL_HEADER(ASTextViewImpl)

@compatibility_alias ComAsheraLayoutTextViewImpl ASTextViewImpl;

#endif

#if !defined (ASTextViewImpl_AutoSizeTextType_) && (INCLUDE_ALL_TextViewImpl || defined(INCLUDE_ASTextViewImpl_AutoSizeTextType))
#define ASTextViewImpl_AutoSizeTextType_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASTextViewImpl_AutoSizeTextType : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASTextViewImpl_AutoSizeTextType)

FOUNDATION_EXPORT void ASTextViewImpl_AutoSizeTextType_init(ASTextViewImpl_AutoSizeTextType *self);

FOUNDATION_EXPORT ASTextViewImpl_AutoSizeTextType *new_ASTextViewImpl_AutoSizeTextType_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTextViewImpl_AutoSizeTextType *create_ASTextViewImpl_AutoSizeTextType_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASTextViewImpl_AutoSizeTextType)

#endif

#if !defined (ASTextViewImpl_Ellipsize_) && (INCLUDE_ALL_TextViewImpl || defined(INCLUDE_ASTextViewImpl_Ellipsize))
#define ASTextViewImpl_Ellipsize_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASTextViewImpl_Ellipsize : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASTextViewImpl_Ellipsize)

FOUNDATION_EXPORT void ASTextViewImpl_Ellipsize_init(ASTextViewImpl_Ellipsize *self);

FOUNDATION_EXPORT ASTextViewImpl_Ellipsize *new_ASTextViewImpl_Ellipsize_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTextViewImpl_Ellipsize *create_ASTextViewImpl_Ellipsize_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASTextViewImpl_Ellipsize)

#endif

#if !defined (ASTextViewImpl_MarqueeRepeatLimit_) && (INCLUDE_ALL_TextViewImpl || defined(INCLUDE_ASTextViewImpl_MarqueeRepeatLimit))
#define ASTextViewImpl_MarqueeRepeatLimit_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASTextViewImpl_MarqueeRepeatLimit : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

- (jboolean)supportsIntAlso;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASTextViewImpl_MarqueeRepeatLimit)

FOUNDATION_EXPORT void ASTextViewImpl_MarqueeRepeatLimit_init(ASTextViewImpl_MarqueeRepeatLimit *self);

FOUNDATION_EXPORT ASTextViewImpl_MarqueeRepeatLimit *new_ASTextViewImpl_MarqueeRepeatLimit_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTextViewImpl_MarqueeRepeatLimit *create_ASTextViewImpl_MarqueeRepeatLimit_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASTextViewImpl_MarqueeRepeatLimit)

#endif

#if !defined (ASTextViewImpl_JustificationMode_) && (INCLUDE_ALL_TextViewImpl || defined(INCLUDE_ASTextViewImpl_JustificationMode))
#define ASTextViewImpl_JustificationMode_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASTextViewImpl_JustificationMode : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASTextViewImpl_JustificationMode)

FOUNDATION_EXPORT void ASTextViewImpl_JustificationMode_init(ASTextViewImpl_JustificationMode *self);

FOUNDATION_EXPORT ASTextViewImpl_JustificationMode *new_ASTextViewImpl_JustificationMode_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTextViewImpl_JustificationMode *create_ASTextViewImpl_JustificationMode_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASTextViewImpl_JustificationMode)

#endif

#if !defined (ASTextViewImpl_Font_) && (INCLUDE_ALL_TextViewImpl || defined(INCLUDE_ASTextViewImpl_Font))
#define ASTextViewImpl_Font_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASTextViewImpl_Font : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASTextViewImpl_Font)

FOUNDATION_EXPORT void ASTextViewImpl_Font_init(ASTextViewImpl_Font *self);

FOUNDATION_EXPORT ASTextViewImpl_Font *new_ASTextViewImpl_Font_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTextViewImpl_Font *create_ASTextViewImpl_Font_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASTextViewImpl_Font)

#endif

#if !defined (ASTextViewImpl_TextStyle_) && (INCLUDE_ALL_TextViewImpl || defined(INCLUDE_ASTextViewImpl_TextStyle))
#define ASTextViewImpl_TextStyle_

#define RESTRICT_AbstractBitFlagConverter 1
#define INCLUDE_ASAbstractBitFlagConverter 1
#include "AbstractBitFlagConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASTextViewImpl_TextStyle : ASAbstractBitFlagConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASTextViewImpl_TextStyle)

FOUNDATION_EXPORT void ASTextViewImpl_TextStyle_init(ASTextViewImpl_TextStyle *self);

FOUNDATION_EXPORT ASTextViewImpl_TextStyle *new_ASTextViewImpl_TextStyle_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTextViewImpl_TextStyle *create_ASTextViewImpl_TextStyle_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASTextViewImpl_TextStyle)

#endif

#if !defined (ASTextViewImpl_DrawableTintMode_) && (INCLUDE_ALL_TextViewImpl || defined(INCLUDE_ASTextViewImpl_DrawableTintMode))
#define ASTextViewImpl_DrawableTintMode_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASTextViewImpl_DrawableTintMode : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASTextViewImpl_DrawableTintMode)

FOUNDATION_EXPORT void ASTextViewImpl_DrawableTintMode_init(ASTextViewImpl_DrawableTintMode *self);

FOUNDATION_EXPORT ASTextViewImpl_DrawableTintMode *new_ASTextViewImpl_DrawableTintMode_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTextViewImpl_DrawableTintMode *create_ASTextViewImpl_DrawableTintMode_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASTextViewImpl_DrawableTintMode)

#endif

#if !defined (ASTextViewImpl_TextViewExt_) && (INCLUDE_ALL_TextViewImpl || defined(INCLUDE_ASTextViewImpl_TextViewExt))
#define ASTextViewImpl_TextViewExt_

#define RESTRICT_TextView 1
#define INCLUDE_ADTextView 1
#include "TextView.h"

#define RESTRICT_ILifeCycleDecorator 1
#define INCLUDE_ASILifeCycleDecorator 1
#include "ILifeCycleDecorator.h"

@class ADRect;
@class ADView;
@class ASTextViewImpl;
@class ASWidgetAttribute;
@class IOSIntArray;
@class IOSObjectArray;
@protocol ASIWidget;
@protocol JavaUtilList;

@interface ASTextViewImpl_TextViewExt : ADTextView < ASILifeCycleDecorator >

#pragma mark Public

- (instancetype)initWithASTextViewImpl:(ASTextViewImpl *)outer$;

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

- (void)onRtlPropertiesChangedWithInt:(jint)layoutDirection;

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

J2OBJC_EMPTY_STATIC_INIT(ASTextViewImpl_TextViewExt)

FOUNDATION_EXPORT void ASTextViewImpl_TextViewExt_initWithASTextViewImpl_(ASTextViewImpl_TextViewExt *self, ASTextViewImpl *outer$);

FOUNDATION_EXPORT ASTextViewImpl_TextViewExt *new_ASTextViewImpl_TextViewExt_initWithASTextViewImpl_(ASTextViewImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTextViewImpl_TextViewExt *create_ASTextViewImpl_TextViewExt_initWithASTextViewImpl_(ASTextViewImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASTextViewImpl_TextViewExt)

#endif

#if !defined (ASTextViewImpl_PostMeasureHandler_) && (INCLUDE_ALL_TextViewImpl || defined(INCLUDE_ASTextViewImpl_PostMeasureHandler))
#define ASTextViewImpl_PostMeasureHandler_

#define RESTRICT_EventBusHandler 1
#define INCLUDE_ASEventBusHandler 1
#include "EventBusHandler.h"

@class ASTextViewImpl;

@interface ASTextViewImpl_PostMeasureHandler : ASEventBusHandler

#pragma mark Public

- (instancetype)initWithASTextViewImpl:(ASTextViewImpl *)outer$
                          withNSString:(NSString *)type;

#pragma mark Protected

- (void)doPerformWithId:(id)payload;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithNSString:(NSString *)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASTextViewImpl_PostMeasureHandler)

FOUNDATION_EXPORT void ASTextViewImpl_PostMeasureHandler_initWithASTextViewImpl_withNSString_(ASTextViewImpl_PostMeasureHandler *self, ASTextViewImpl *outer$, NSString *type);

FOUNDATION_EXPORT ASTextViewImpl_PostMeasureHandler *new_ASTextViewImpl_PostMeasureHandler_initWithASTextViewImpl_withNSString_(ASTextViewImpl *outer$, NSString *type) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASTextViewImpl_PostMeasureHandler *create_ASTextViewImpl_PostMeasureHandler_initWithASTextViewImpl_withNSString_(ASTextViewImpl *outer$, NSString *type);

J2OBJC_TYPE_LITERAL_HEADER(ASTextViewImpl_PostMeasureHandler)

#endif

#pragma pop_macro("INCLUDE_ALL_TextViewImpl")
