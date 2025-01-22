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

- (id)getImage;

- (IOSIntArray *)getImageDimension;

- (id)getPaddingBottom;

- (id)getPaddingLeft;

- (id)getPaddingRight;

- (id)getPaddingTop;

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

#pragma pop_macro("INCLUDE_ALL_ImageButtonImpl")
