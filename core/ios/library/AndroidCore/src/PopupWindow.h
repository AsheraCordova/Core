//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\widget\PopupWindow.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_PopupWindow")
#ifdef RESTRICT_PopupWindow
#define INCLUDE_ALL_PopupWindow 0
#else
#define INCLUDE_ALL_PopupWindow 1
#endif
#undef RESTRICT_PopupWindow

#if !defined (ADPopupWindow_) && (INCLUDE_ALL_PopupWindow || defined(INCLUDE_ADPopupWindow))
#define ADPopupWindow_

@class ADRelativeLayout_LayoutParams;
@class ADView;
@protocol ADIBinder;
@protocol ADPopupWindow_OnDismissListener;

@interface ADPopupWindow : NSObject

#pragma mark Public

- (instancetype)init;

- (jint)computeFlagsWithInt:(jint)curFlags;

- (void)dismiss;

- (jint)getMaxAvailableHeightWithADView:(ADView *)anchor;

- (jint)getMaxAvailableHeightWithADView:(ADView *)anchor
                                withInt:(jint)yOffset;

- (jint)getMaxAvailableHeightWithADView:(ADView *)anchor
                                withInt:(jint)yOffset
                            withBoolean:(jboolean)ignoreBottomDecorations;

- (jboolean)isAboveAnchor;

- (jboolean)isShowing;

- (void)remeasure;

- (void)setAttachedInDecorWithBoolean:(jboolean)enabled;

- (void)setContentViewWithADView:(ADView *)contentView;

- (void)setHeightWithInt:(jint)height;

- (void)setOnDismissListenerWithADPopupWindow_OnDismissListener:(id<ADPopupWindow_OnDismissListener>)onDismissListener;

- (void)setOverlapAnchorWithBoolean:(jboolean)overlapAnchor;

- (void)setWidthWithInt:(jint)width;

- (void)showAsDropDownWithADView:(ADView *)anchor;

- (void)showAsDropDownWithADView:(ADView *)anchor
                         withInt:(jint)xoff
                         withInt:(jint)yoff;

- (void)showAsDropDownWithADView:(ADView *)anchor
                         withInt:(jint)xoff
                         withInt:(jint)yoff
                         withInt:(jint)gravity;

- (void)showAsDropDownWithADView:(ADView *)decorView
                      withADView:(ADView *)anchor
withADRelativeLayout_LayoutParams:(ADRelativeLayout_LayoutParams *)outParams
                         withInt:(jint)xOffset
                         withInt:(jint)yOffset
                         withInt:(jint)gravity;

- (void)showAtLocationWithADIBinder:(id<ADIBinder>)token
                            withInt:(jint)gravity
                            withInt:(jint)x
                            withInt:(jint)y;

- (void)showAtLocationWithADView:(ADView *)parent
                         withInt:(jint)gravity
                         withInt:(jint)x
                         withInt:(jint)y;

- (void)showAtLocationWithADView:(ADView *)decorView
withADRelativeLayout_LayoutParams:(ADRelativeLayout_LayoutParams *)outParams
                         withInt:(jint)x
                         withInt:(jint)y
                         withInt:(jint)gravity;

- (void)update;

- (void)updateWithInt:(jint)width
              withInt:(jint)height;

- (void)updateWithInt:(jint)x
              withInt:(jint)y
              withInt:(jint)width
              withInt:(jint)height;

- (void)updateWithInt:(jint)x
              withInt:(jint)y
              withInt:(jint)width
              withInt:(jint)height
          withBoolean:(jboolean)force;

- (void)updateWithADView:(ADView *)anchor
                 withInt:(jint)width
                 withInt:(jint)height;

- (void)updateWithADView:(ADView *)anchor
                 withInt:(jint)xoff
                 withInt:(jint)yoff
                 withInt:(jint)width
                 withInt:(jint)height;

#pragma mark Protected

- (void)attachToAnchorWithADView:(ADView *)anchor
                         withInt:(jint)xoff
                         withInt:(jint)yoff
                         withInt:(jint)gravity;

- (ADRelativeLayout_LayoutParams *)createPopupLayoutParamsWithADIBinder:(id<ADIBinder>)token;

- (void)detachFromAnchor;

- (jboolean)findDropDownPositionWithADView:(ADView *)anchor
         withADRelativeLayout_LayoutParams:(ADRelativeLayout_LayoutParams *)outParams
                                   withInt:(jint)xOffset
                                   withInt:(jint)yOffset
                                   withInt:(jint)width
                                   withInt:(jint)height
                                   withInt:(jint)gravity
                               withBoolean:(jboolean)allowScroll;

- (ADView *)getAnchor;

- (ADRelativeLayout_LayoutParams *)getDecorViewLayoutParams;

- (jboolean)hasContentView;

- (jboolean)hasDecorView;

- (void)updateWithADView:(ADView *)anchor
withADRelativeLayout_LayoutParams:(ADRelativeLayout_LayoutParams *)params;

- (void)updateAboveAnchorWithBoolean:(jboolean)aboveAnchor;

#pragma mark Package-Private

- (void)initOutParamsWithADView:(ADView *)contentView OBJC_METHOD_FAMILY_NONE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADPopupWindow)

inline jint ADPopupWindow_get_INPUT_METHOD_FROM_FOCUSABLE(void);
#define ADPopupWindow_INPUT_METHOD_FROM_FOCUSABLE 0
J2OBJC_STATIC_FIELD_CONSTANT(ADPopupWindow, INPUT_METHOD_FROM_FOCUSABLE, jint)

inline jint ADPopupWindow_get_INPUT_METHOD_NEEDED(void);
#define ADPopupWindow_INPUT_METHOD_NEEDED 1
J2OBJC_STATIC_FIELD_CONSTANT(ADPopupWindow, INPUT_METHOD_NEEDED, jint)

inline jint ADPopupWindow_get_INPUT_METHOD_NOT_NEEDED(void);
#define ADPopupWindow_INPUT_METHOD_NOT_NEEDED 2
J2OBJC_STATIC_FIELD_CONSTANT(ADPopupWindow, INPUT_METHOD_NOT_NEEDED, jint)

FOUNDATION_EXPORT void ADPopupWindow_init(ADPopupWindow *self);

FOUNDATION_EXPORT ADPopupWindow *new_ADPopupWindow_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADPopupWindow *create_ADPopupWindow_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADPopupWindow)

@compatibility_alias RAndroidWidgetPopupWindow ADPopupWindow;

#endif

#if !defined (ADPopupWindow_OnDismissListener_) && (INCLUDE_ALL_PopupWindow || defined(INCLUDE_ADPopupWindow_OnDismissListener))
#define ADPopupWindow_OnDismissListener_

@protocol ADPopupWindow_OnDismissListener < JavaObject >

- (void)onDismiss;

@end

J2OBJC_EMPTY_STATIC_INIT(ADPopupWindow_OnDismissListener)

J2OBJC_TYPE_LITERAL_HEADER(ADPopupWindow_OnDismissListener)

#endif

#if !defined (ADPopupWindow_TransitionManager_) && (INCLUDE_ALL_PopupWindow || defined(INCLUDE_ADPopupWindow_TransitionManager))
#define ADPopupWindow_TransitionManager_

@class ADView;

@interface ADPopupWindow_TransitionManager : NSObject

#pragma mark Public

+ (void)endTransitionsWithADView:(ADView *)mDecorView;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ADPopupWindow_TransitionManager)

FOUNDATION_EXPORT void ADPopupWindow_TransitionManager_init(ADPopupWindow_TransitionManager *self);

FOUNDATION_EXPORT ADPopupWindow_TransitionManager *new_ADPopupWindow_TransitionManager_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADPopupWindow_TransitionManager *create_ADPopupWindow_TransitionManager_init(void);

FOUNDATION_EXPORT void ADPopupWindow_TransitionManager_endTransitionsWithADView_(ADView *mDecorView);

J2OBJC_TYPE_LITERAL_HEADER(ADPopupWindow_TransitionManager)

#endif

#if !defined (ADPopupWindow_Transition_) && (INCLUDE_ALL_PopupWindow || defined(INCLUDE_ADPopupWindow_Transition))
#define ADPopupWindow_Transition_

@class ADPopupWindow;

@interface ADPopupWindow_Transition : NSObject

#pragma mark Package-Private

- (instancetype)initWithADPopupWindow:(ADPopupWindow *)outer$;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADPopupWindow_Transition)

FOUNDATION_EXPORT void ADPopupWindow_Transition_initWithADPopupWindow_(ADPopupWindow_Transition *self, ADPopupWindow *outer$);

FOUNDATION_EXPORT ADPopupWindow_Transition *new_ADPopupWindow_Transition_initWithADPopupWindow_(ADPopupWindow *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADPopupWindow_Transition *create_ADPopupWindow_Transition_initWithADPopupWindow_(ADPopupWindow *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ADPopupWindow_Transition)

#endif

#pragma pop_macro("INCLUDE_ALL_PopupWindow")
