//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroidX-core\src\main\java\androidx\core\view\ViewCompat.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ViewCompat")
#ifdef RESTRICT_ViewCompat
#define INCLUDE_ALL_ViewCompat 0
#else
#define INCLUDE_ALL_ViewCompat 1
#endif
#undef RESTRICT_ViewCompat

#if !defined (ADXViewCompat_) && (INCLUDE_ALL_ViewCompat || defined(INCLUDE_ADXViewCompat))
#define ADXViewCompat_

@class ADView;
@class ADViewGroup;

@interface ADXViewCompat : NSObject

#pragma mark Public

- (instancetype)init;

+ (jint)combineMeasuredStatesWithInt:(jint)curState
                             withInt:(jint)newState;

+ (void)dispatchApplyWindowInsetsWithADView:(ADView *)child
                                     withId:(id)wi;

+ (void)dispatchFinishTemporaryDetachWithADView:(ADView *)child;

+ (void)dispatchStartTemporaryDetachWithADView:(ADView *)view;

+ (jfloat)getElevationWithADView:(ADView *)child;

+ (jboolean)getFitsSystemWindowsWithADView:(ADView *)view;

+ (jint)getImportantForAccessibilityWithADView:(ADView *)itemView;

+ (jint)getLayoutDirectionWithADView:(ADView *)view;

+ (jint)getMeasuredHeightAndStateWithADView:(ADView *)view;

+ (jint)getMeasuredStateWithADView:(ADView *)child;

+ (jint)getMeasuredWidthAndStateWithADView:(ADView *)view;

+ (jint)getMinimumHeightWithADView:(ADView *)view;

+ (jint)getMinimumWidthWithADView:(ADView *)view;

+ (jint)getPaddingEndWithADView:(ADView *)view;

+ (jint)getPaddingEndWithADViewGroup:(ADViewGroup *)viewGroup;

+ (jint)getPaddingStartWithADView:(ADView *)view;

+ (jint)getPaddingStartWithADViewGroup:(ADViewGroup *)viewGroup;

+ (id)getRootWindowInsetsWithId:(id)drawerLayout;

+ (jboolean)hasTransientStateWithADView:(ADView *)view;

+ (jboolean)isLaidOutWithADView:(ADView *)view;

+ (jboolean)isLayoutDirectionResolvedWithADView:(ADView *)view;

+ (jboolean)isPaddingRelativeWithADView:(ADView *)view;

+ (void)jumpDrawablesToCurrentStateWithADView:(ADView *)itemView;

+ (void)offsetLeftAndRightWithADView:(ADView *)child
                             withInt:(jint)dx;

+ (void)offsetTopAndBottomWithADView:(ADView *)child
                             withInt:(jint)dy;

+ (jint)resolveSizeAndStateWithInt:(jint)size
                           withInt:(jint)measureSpec
                           withInt:(jint)childMeasuredState;

+ (void)setElevationWithADView:(ADView *)child
                     withFloat:(jfloat)mDrawerElevation;

+ (void)setImportantForAccessibilityWithADView:(ADView *)itemView
                                       withInt:(jint)importantForAccessibilityYes;

+ (void)setLayoutDirectionWithADViewGroup:(ADViewGroup *)viewGroup
                                  withInt:(jint)layoutDirection;

+ (void)setPaddingRelativeWithADView:(ADView *)view
                             withInt:(jint)start
                             withInt:(jint)top
                             withInt:(jint)end
                             withInt:(jint)bottom;

+ (void)setXWithADView:(ADView *)child
               withInt:(jint)x;

+ (void)setYWithADView:(ADView *)child
               withInt:(jint)y;

+ (void)stopNestedScrollWithADView:(ADView *)view;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXViewCompat)

inline jint ADXViewCompat_get_MEASURED_STATE_MASK(void);
#define ADXViewCompat_MEASURED_STATE_MASK -16777216
J2OBJC_STATIC_FIELD_CONSTANT(ADXViewCompat, MEASURED_STATE_MASK, jint)

inline jint ADXViewCompat_get_MEASURED_STATE_TOO_SMALL(void);
#define ADXViewCompat_MEASURED_STATE_TOO_SMALL 16777216
J2OBJC_STATIC_FIELD_CONSTANT(ADXViewCompat, MEASURED_STATE_TOO_SMALL, jint)

inline jint ADXViewCompat_get_LAYOUT_DIRECTION_RTL(void);
#define ADXViewCompat_LAYOUT_DIRECTION_RTL 1
J2OBJC_STATIC_FIELD_CONSTANT(ADXViewCompat, LAYOUT_DIRECTION_RTL, jint)

inline jint ADXViewCompat_get_MEASURED_HEIGHT_STATE_SHIFT(void);
#define ADXViewCompat_MEASURED_HEIGHT_STATE_SHIFT 16
J2OBJC_STATIC_FIELD_CONSTANT(ADXViewCompat, MEASURED_HEIGHT_STATE_SHIFT, jint)

inline jint ADXViewCompat_get_MEASURED_SIZE_MASK(void);
#define ADXViewCompat_MEASURED_SIZE_MASK 16777215
J2OBJC_STATIC_FIELD_CONSTANT(ADXViewCompat, MEASURED_SIZE_MASK, jint)

inline jint ADXViewCompat_get_LAYOUT_DIRECTION_LTR(void);
#define ADXViewCompat_LAYOUT_DIRECTION_LTR 0
J2OBJC_STATIC_FIELD_CONSTANT(ADXViewCompat, LAYOUT_DIRECTION_LTR, jint)

inline jint ADXViewCompat_get_IMPORTANT_FOR_ACCESSIBILITY_AUTO(void);
#define ADXViewCompat_IMPORTANT_FOR_ACCESSIBILITY_AUTO 0
J2OBJC_STATIC_FIELD_CONSTANT(ADXViewCompat, IMPORTANT_FOR_ACCESSIBILITY_AUTO, jint)

inline jint ADXViewCompat_get_IMPORTANT_FOR_ACCESSIBILITY_NO(void);
#define ADXViewCompat_IMPORTANT_FOR_ACCESSIBILITY_NO 0
J2OBJC_STATIC_FIELD_CONSTANT(ADXViewCompat, IMPORTANT_FOR_ACCESSIBILITY_NO, jint)

inline jint ADXViewCompat_get_IMPORTANT_FOR_ACCESSIBILITY_YES(void);
#define ADXViewCompat_IMPORTANT_FOR_ACCESSIBILITY_YES 0
J2OBJC_STATIC_FIELD_CONSTANT(ADXViewCompat, IMPORTANT_FOR_ACCESSIBILITY_YES, jint)

inline jint ADXViewCompat_get_SCROLL_AXIS_NONE(void);
#define ADXViewCompat_SCROLL_AXIS_NONE 0
J2OBJC_STATIC_FIELD_CONSTANT(ADXViewCompat, SCROLL_AXIS_NONE, jint)

inline jint ADXViewCompat_get_SCROLL_AXIS_HORIZONTAL(void);
#define ADXViewCompat_SCROLL_AXIS_HORIZONTAL 1
J2OBJC_STATIC_FIELD_CONSTANT(ADXViewCompat, SCROLL_AXIS_HORIZONTAL, jint)

inline jint ADXViewCompat_get_SCROLL_AXIS_VERTICAL(void);
#define ADXViewCompat_SCROLL_AXIS_VERTICAL 2
J2OBJC_STATIC_FIELD_CONSTANT(ADXViewCompat, SCROLL_AXIS_VERTICAL, jint)

inline jint ADXViewCompat_get_TYPE_TOUCH(void);
#define ADXViewCompat_TYPE_TOUCH 0
J2OBJC_STATIC_FIELD_CONSTANT(ADXViewCompat, TYPE_TOUCH, jint)

inline jint ADXViewCompat_get_TYPE_NON_TOUCH(void);
#define ADXViewCompat_TYPE_NON_TOUCH 1
J2OBJC_STATIC_FIELD_CONSTANT(ADXViewCompat, TYPE_NON_TOUCH, jint)

FOUNDATION_EXPORT void ADXViewCompat_init(ADXViewCompat *self);

FOUNDATION_EXPORT ADXViewCompat *new_ADXViewCompat_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADXViewCompat *create_ADXViewCompat_init(void);

FOUNDATION_EXPORT jint ADXViewCompat_getMeasuredWidthAndStateWithADView_(ADView *view);

FOUNDATION_EXPORT jint ADXViewCompat_getMeasuredHeightAndStateWithADView_(ADView *view);

FOUNDATION_EXPORT jint ADXViewCompat_getLayoutDirectionWithADView_(ADView *view);

FOUNDATION_EXPORT jint ADXViewCompat_resolveSizeAndStateWithInt_withInt_withInt_(jint size, jint measureSpec, jint childMeasuredState);

FOUNDATION_EXPORT jint ADXViewCompat_combineMeasuredStatesWithInt_withInt_(jint curState, jint newState);

FOUNDATION_EXPORT jint ADXViewCompat_getMeasuredStateWithADView_(ADView *child);

FOUNDATION_EXPORT jint ADXViewCompat_getPaddingStartWithADViewGroup_(ADViewGroup *viewGroup);

FOUNDATION_EXPORT jint ADXViewCompat_getPaddingEndWithADViewGroup_(ADViewGroup *viewGroup);

FOUNDATION_EXPORT void ADXViewCompat_setLayoutDirectionWithADViewGroup_withInt_(ADViewGroup *viewGroup, jint layoutDirection);

FOUNDATION_EXPORT void ADXViewCompat_setPaddingRelativeWithADView_withInt_withInt_withInt_withInt_(ADView *view, jint start, jint top, jint end, jint bottom);

FOUNDATION_EXPORT jint ADXViewCompat_getPaddingStartWithADView_(ADView *view);

FOUNDATION_EXPORT jint ADXViewCompat_getPaddingEndWithADView_(ADView *view);

FOUNDATION_EXPORT void ADXViewCompat_setXWithADView_withInt_(ADView *child, jint x);

FOUNDATION_EXPORT void ADXViewCompat_setYWithADView_withInt_(ADView *child, jint y);

FOUNDATION_EXPORT jint ADXViewCompat_getMinimumHeightWithADView_(ADView *view);

FOUNDATION_EXPORT void ADXViewCompat_jumpDrawablesToCurrentStateWithADView_(ADView *itemView);

FOUNDATION_EXPORT jboolean ADXViewCompat_getFitsSystemWindowsWithADView_(ADView *view);

FOUNDATION_EXPORT void ADXViewCompat_setElevationWithADView_withFloat_(ADView *child, jfloat mDrawerElevation);

FOUNDATION_EXPORT jfloat ADXViewCompat_getElevationWithADView_(ADView *child);

FOUNDATION_EXPORT void ADXViewCompat_dispatchApplyWindowInsetsWithADView_withId_(ADView *child, id wi);

FOUNDATION_EXPORT id ADXViewCompat_getRootWindowInsetsWithId_(id drawerLayout);

FOUNDATION_EXPORT jint ADXViewCompat_getMinimumWidthWithADView_(ADView *view);

FOUNDATION_EXPORT jint ADXViewCompat_getImportantForAccessibilityWithADView_(ADView *itemView);

FOUNDATION_EXPORT void ADXViewCompat_setImportantForAccessibilityWithADView_withInt_(ADView *itemView, jint importantForAccessibilityYes);

FOUNDATION_EXPORT void ADXViewCompat_dispatchFinishTemporaryDetachWithADView_(ADView *child);

FOUNDATION_EXPORT void ADXViewCompat_dispatchStartTemporaryDetachWithADView_(ADView *view);

FOUNDATION_EXPORT jboolean ADXViewCompat_hasTransientStateWithADView_(ADView *view);

FOUNDATION_EXPORT jboolean ADXViewCompat_isLayoutDirectionResolvedWithADView_(ADView *view);

FOUNDATION_EXPORT void ADXViewCompat_offsetLeftAndRightWithADView_withInt_(ADView *child, jint dx);

FOUNDATION_EXPORT void ADXViewCompat_offsetTopAndBottomWithADView_withInt_(ADView *child, jint dy);

FOUNDATION_EXPORT jboolean ADXViewCompat_isLaidOutWithADView_(ADView *view);

FOUNDATION_EXPORT jboolean ADXViewCompat_isPaddingRelativeWithADView_(ADView *view);

FOUNDATION_EXPORT void ADXViewCompat_stopNestedScrollWithADView_(ADView *view);

J2OBJC_TYPE_LITERAL_HEADER(ADXViewCompat)

@compatibility_alias AndroidxCoreViewViewCompat ADXViewCompat;

#endif

#pragma pop_macro("INCLUDE_ALL_ViewCompat")
