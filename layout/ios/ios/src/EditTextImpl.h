//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\ios_widget_library\src\main\java\com\ashera\layout\EditTextImpl.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_EditTextImpl")
#ifdef RESTRICT_EditTextImpl
#define INCLUDE_ALL_EditTextImpl 0
#else
#define INCLUDE_ALL_EditTextImpl 1
#endif
#undef RESTRICT_EditTextImpl

#if !defined (ASEditTextImpl_) && (INCLUDE_ALL_EditTextImpl || defined(INCLUDE_ASEditTextImpl))
#define ASEditTextImpl_

#define RESTRICT_BaseWidget 1
#define INCLUDE_ASBaseWidget 1
#include "BaseWidget.h"

#define RESTRICT_ICustomMeasureHeight 1
#define INCLUDE_ASICustomMeasureHeight 1
#include "ICustomMeasureHeight.h"

#define RESTRICT_ICustomMeasureWidth 1
#define INCLUDE_ASICustomMeasureWidth 1
#include "ICustomMeasureWidth.h"

#define RESTRICT_FormElement 1
#define INCLUDE_ASFormElement 1
#include "FormElement.h"

@class ADEditText;
@class ASWidgetAttribute;
@class IOSClass;
@class IOSObjectArray;
@protocol ASIFragment;
@protocol ASILifeCycleDecorator;
@protocol ASIWidget;
@protocol JavaUtilMap;

@interface ASEditTextImpl : ASBaseWidget < ASICustomMeasureHeight, ASICustomMeasureWidth, ASFormElement > {
 @public
  id uiView_;
  ADEditText *measurableView_;
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

- (void)drawableStateChanged;

- (void)focus;

- (id)getAdjustsFontSizeToFitWidth;

- (id)getAllowsEditingTextAttributes;

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
              withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (id)getBackground;

- (jint)getBorderPadding;

- (id)getClearsOnBeginEditing;

- (id)getClearsOnInsertion;

- (id)getDisabledBackground;

- (id)getForeground;

- (id)getIsEditing;

- (jint)getLineHeightPadding;

- (jint)getMaxEms;

- (jint)getMaxHeight;

- (jint)getMaxLines;

- (jint)getMaxWidth;

- (jint)getMinEms;

- (id)getMinimumFontSize;

- (jint)getMinLines;

- (id)getPlaceholder;

- (id)getText;

- (id)getTextColor;

- (NSString *)getTextEntered;

- (IOSClass *)getViewClass;

- (void)invalidate;

- (id)invokeMethodWithNSString:(NSString *)methodName
             withNSObjectArray:(IOSObjectArray *)args;

- (jboolean)isViewVisible;

- (void)loadAttributesWithNSString:(NSString *)attributeName;

- (jint)measureHeightWithInt:(jint)width;

- (jint)measureWidth;

- (id)nativeAddForeGroundWithASIWidget:(id<ASIWidget>)w;

- (void)nativeSetEnabledWithBoolean:(jboolean)value;

- (id<ASIWidget>)newInstance OBJC_METHOD_FAMILY_NONE;

- (void)onRtlPropertiesChangedWithInt:(jint)layoutDirection;

- (void)requestLayout;

- (void)resetError;

- (void)setAdjustsFontSizeToFitWidthWithId:(id)nativeWidget
                                    withId:(id)value;

- (void)setAllowsEditingTextAttributesWithId:(id)nativeWidget
                                      withId:(id)value;

- (void)setAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
                             withNSString:(NSString *)strValue
                                   withId:(id)objValue
                withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (void)setBackgroundWithId:(id)nativeWidget
                     withId:(id)value;

- (void)setClearsOnBeginEditingWithId:(id)nativeWidget
                               withId:(id)value;

- (void)setClearsOnInsertionWithId:(id)nativeWidget
                            withId:(id)value;

- (void)setDisabledBackgroundWithId:(id)nativeWidget
                             withId:(id)value;

- (void)setEnabledWithId:(id)objValue;

- (void)setIdWithNSString:(NSString *)id_;

- (void)setMinimumFontSizeWithId:(id)nativeWidget
                          withId:(id)value;

- (void)setMyTextWithId:(id)text;

- (void)setPaddingWithId:(id)objValue;

- (void)setPaddingBottomWithId:(id)objValue;

- (void)setPaddingLeftWithId:(id)objValue;

- (void)setPaddingRightWithId:(id)objValue;

- (void)setPaddingTopWithId:(id)objValue;

- (void)setPlaceholderWithId:(id)nativeWidget
                      withId:(id)value;

- (void)setTextWithId:(id)nativeWidget
               withId:(id)value;

- (void)setTextColorWithId:(id)nativeWidget
                    withId:(id)value;

- (void)setVisibleWithBoolean:(jboolean)b;

- (void)showErrorWithNSString:(NSString *)message;

#pragma mark Package-Private

@end

J2OBJC_STATIC_INIT(ASEditTextImpl)

J2OBJC_FIELD_SETTER(ASEditTextImpl, uiView_, id)
J2OBJC_FIELD_SETTER(ASEditTextImpl, measurableView_, ADEditText *)

inline NSString *ASEditTextImpl_get_LOCAL_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASEditTextImpl_LOCAL_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASEditTextImpl, LOCAL_NAME, NSString *)

inline NSString *ASEditTextImpl_get_GROUP_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASEditTextImpl_GROUP_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASEditTextImpl, GROUP_NAME, NSString *)

FOUNDATION_EXPORT void ASEditTextImpl_init(ASEditTextImpl *self);

FOUNDATION_EXPORT ASEditTextImpl *new_ASEditTextImpl_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASEditTextImpl *create_ASEditTextImpl_init(void);

FOUNDATION_EXPORT void ASEditTextImpl_initWithNSString_(ASEditTextImpl *self, NSString *localname);

FOUNDATION_EXPORT ASEditTextImpl *new_ASEditTextImpl_initWithNSString_(NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASEditTextImpl *create_ASEditTextImpl_initWithNSString_(NSString *localname);

FOUNDATION_EXPORT void ASEditTextImpl_initWithNSString_withNSString_(ASEditTextImpl *self, NSString *groupName, NSString *localname);

FOUNDATION_EXPORT ASEditTextImpl *new_ASEditTextImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASEditTextImpl *create_ASEditTextImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname);

J2OBJC_TYPE_LITERAL_HEADER(ASEditTextImpl)

@compatibility_alias ComAsheraLayoutEditTextImpl ASEditTextImpl;

#endif

#if !defined (ASEditTextImpl_DrawableTintMode_) && (INCLUDE_ALL_EditTextImpl || defined(INCLUDE_ASEditTextImpl_DrawableTintMode))
#define ASEditTextImpl_DrawableTintMode_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASEditTextImpl_DrawableTintMode : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASEditTextImpl_DrawableTintMode)

FOUNDATION_EXPORT void ASEditTextImpl_DrawableTintMode_init(ASEditTextImpl_DrawableTintMode *self);

FOUNDATION_EXPORT ASEditTextImpl_DrawableTintMode *new_ASEditTextImpl_DrawableTintMode_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASEditTextImpl_DrawableTintMode *create_ASEditTextImpl_DrawableTintMode_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASEditTextImpl_DrawableTintMode)

#endif

#if !defined (ASEditTextImpl_Font_) && (INCLUDE_ALL_EditTextImpl || defined(INCLUDE_ASEditTextImpl_Font))
#define ASEditTextImpl_Font_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASEditTextImpl_Font : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASEditTextImpl_Font)

FOUNDATION_EXPORT void ASEditTextImpl_Font_init(ASEditTextImpl_Font *self);

FOUNDATION_EXPORT ASEditTextImpl_Font *new_ASEditTextImpl_Font_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASEditTextImpl_Font *create_ASEditTextImpl_Font_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASEditTextImpl_Font)

#endif

#if !defined (ASEditTextImpl_TextStyle_) && (INCLUDE_ALL_EditTextImpl || defined(INCLUDE_ASEditTextImpl_TextStyle))
#define ASEditTextImpl_TextStyle_

#define RESTRICT_AbstractBitFlagConverter 1
#define INCLUDE_ASAbstractBitFlagConverter 1
#include "AbstractBitFlagConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASEditTextImpl_TextStyle : ASAbstractBitFlagConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASEditTextImpl_TextStyle)

FOUNDATION_EXPORT void ASEditTextImpl_TextStyle_init(ASEditTextImpl_TextStyle *self);

FOUNDATION_EXPORT ASEditTextImpl_TextStyle *new_ASEditTextImpl_TextStyle_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASEditTextImpl_TextStyle *create_ASEditTextImpl_TextStyle_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASEditTextImpl_TextStyle)

#endif

#if !defined (ASEditTextImpl_Capitalize_) && (INCLUDE_ALL_EditTextImpl || defined(INCLUDE_ASEditTextImpl_Capitalize))
#define ASEditTextImpl_Capitalize_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASEditTextImpl_Capitalize : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASEditTextImpl_Capitalize)

FOUNDATION_EXPORT void ASEditTextImpl_Capitalize_init(ASEditTextImpl_Capitalize *self);

FOUNDATION_EXPORT ASEditTextImpl_Capitalize *new_ASEditTextImpl_Capitalize_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASEditTextImpl_Capitalize *create_ASEditTextImpl_Capitalize_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASEditTextImpl_Capitalize)

#endif

#if !defined (ASEditTextImpl_Numeric_) && (INCLUDE_ALL_EditTextImpl || defined(INCLUDE_ASEditTextImpl_Numeric))
#define ASEditTextImpl_Numeric_

#define RESTRICT_AbstractBitFlagConverter 1
#define INCLUDE_ASAbstractBitFlagConverter 1
#include "AbstractBitFlagConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASEditTextImpl_Numeric : ASAbstractBitFlagConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASEditTextImpl_Numeric)

FOUNDATION_EXPORT void ASEditTextImpl_Numeric_init(ASEditTextImpl_Numeric *self);

FOUNDATION_EXPORT ASEditTextImpl_Numeric *new_ASEditTextImpl_Numeric_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASEditTextImpl_Numeric *create_ASEditTextImpl_Numeric_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASEditTextImpl_Numeric)

#endif

#if !defined (ASEditTextImpl_InputType_) && (INCLUDE_ALL_EditTextImpl || defined(INCLUDE_ASEditTextImpl_InputType))
#define ASEditTextImpl_InputType_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASEditTextImpl_InputType : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASEditTextImpl_InputType)

FOUNDATION_EXPORT void ASEditTextImpl_InputType_init(ASEditTextImpl_InputType *self);

FOUNDATION_EXPORT ASEditTextImpl_InputType *new_ASEditTextImpl_InputType_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASEditTextImpl_InputType *create_ASEditTextImpl_InputType_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASEditTextImpl_InputType)

#endif

#if !defined (ASEditTextImpl_ImeOptions_) && (INCLUDE_ALL_EditTextImpl || defined(INCLUDE_ASEditTextImpl_ImeOptions))
#define ASEditTextImpl_ImeOptions_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASEditTextImpl_ImeOptions : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASEditTextImpl_ImeOptions)

FOUNDATION_EXPORT void ASEditTextImpl_ImeOptions_init(ASEditTextImpl_ImeOptions *self);

FOUNDATION_EXPORT ASEditTextImpl_ImeOptions *new_ASEditTextImpl_ImeOptions_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASEditTextImpl_ImeOptions *create_ASEditTextImpl_ImeOptions_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASEditTextImpl_ImeOptions)

#endif

#if !defined (ASEditTextImpl_IosBorderStyle_) && (INCLUDE_ALL_EditTextImpl || defined(INCLUDE_ASEditTextImpl_IosBorderStyle))
#define ASEditTextImpl_IosBorderStyle_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASEditTextImpl_IosBorderStyle : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASEditTextImpl_IosBorderStyle)

FOUNDATION_EXPORT void ASEditTextImpl_IosBorderStyle_init(ASEditTextImpl_IosBorderStyle *self);

FOUNDATION_EXPORT ASEditTextImpl_IosBorderStyle *new_ASEditTextImpl_IosBorderStyle_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASEditTextImpl_IosBorderStyle *create_ASEditTextImpl_IosBorderStyle_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASEditTextImpl_IosBorderStyle)

#endif

#if !defined (ASEditTextImpl_InputView_) && (INCLUDE_ALL_EditTextImpl || defined(INCLUDE_ASEditTextImpl_InputView))
#define ASEditTextImpl_InputView_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASEditTextImpl_InputView : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASEditTextImpl_InputView)

FOUNDATION_EXPORT void ASEditTextImpl_InputView_init(ASEditTextImpl_InputView *self);

FOUNDATION_EXPORT ASEditTextImpl_InputView *new_ASEditTextImpl_InputView_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASEditTextImpl_InputView *create_ASEditTextImpl_InputView_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASEditTextImpl_InputView)

#endif

#if !defined (ASEditTextImpl_EditTextExt_) && (INCLUDE_ALL_EditTextImpl || defined(INCLUDE_ASEditTextImpl_EditTextExt))
#define ASEditTextImpl_EditTextExt_

#define RESTRICT_EditText 1
#define INCLUDE_ADEditText 1
#include "EditText.h"

#define RESTRICT_ILifeCycleDecorator 1
#define INCLUDE_ASILifeCycleDecorator 1
#include "ILifeCycleDecorator.h"

@class ADContext;
@class ADRect;
@class ADView;
@class ASEditTextImpl;
@class ASWidgetAttribute;
@class IOSIntArray;
@class IOSObjectArray;
@protocol ASIWidget;
@protocol JavaUtilList;

@interface ASEditTextImpl_EditTextExt : ADEditText < ASILifeCycleDecorator >

#pragma mark Public

- (instancetype)initWithASEditTextImpl:(ASEditTextImpl *)outer$;

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

- (instancetype)init NS_UNAVAILABLE;

- (instancetype)initWithADContext:(ADContext *)arg0 NS_UNAVAILABLE;

- (instancetype)initWithASIWidget:(id<ASIWidget>)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASEditTextImpl_EditTextExt)

FOUNDATION_EXPORT void ASEditTextImpl_EditTextExt_initWithASEditTextImpl_(ASEditTextImpl_EditTextExt *self, ASEditTextImpl *outer$);

FOUNDATION_EXPORT ASEditTextImpl_EditTextExt *new_ASEditTextImpl_EditTextExt_initWithASEditTextImpl_(ASEditTextImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASEditTextImpl_EditTextExt *create_ASEditTextImpl_EditTextExt_initWithASEditTextImpl_(ASEditTextImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASEditTextImpl_EditTextExt)

#endif

#pragma pop_macro("INCLUDE_ALL_EditTextImpl")
