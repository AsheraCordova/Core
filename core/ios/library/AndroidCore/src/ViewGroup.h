//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\view\ViewGroup.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ViewGroup")
#ifdef RESTRICT_ViewGroup
#define INCLUDE_ALL_ViewGroup 0
#else
#define INCLUDE_ALL_ViewGroup 1
#endif
#undef RESTRICT_ViewGroup
#ifdef INCLUDE_ADViewGroup_MarginLayoutParams
#define INCLUDE_ADViewGroup_LayoutParams 1
#endif

#if !defined (ADViewGroup_) && (INCLUDE_ALL_ViewGroup || defined(INCLUDE_ADViewGroup))
#define ADViewGroup_

#define RESTRICT_View 1
#define INCLUDE_ADView 1
#include "View.h"

#define RESTRICT_ViewParent 1
#define INCLUDE_ADViewParent 1
#include "ViewParent.h"

@class ADLayoutTransition;
@class ADRect;
@class ADViewGroup_LayoutParams;
@class ADView_AttachInfo;
@class IOSIntArray;
@class JavaUtilArrayList;
@protocol ADViewGroup_OnHierarchyChangeListener;

@interface ADViewGroup : ADView < ADViewParent > {
 @public
  JavaUtilArrayList *mDisappearingChildren_;
  id<ADViewGroup_OnHierarchyChangeListener> mOnHierarchyChangeListener_;
  ADView *mFocusedInCluster_;
  jint mGroupFlags_;
  jint mPersistentDrawingCache_;
  jboolean mSuppressLayout_;
  jint mChildUnhandledKeyListeners_;
}

#pragma mark Public

- (instancetype)init;

- (jboolean)addStatesFromChildren;

- (void)addViewWithADView:(ADView *)child;

- (void)addViewWithADView:(ADView *)child
                  withInt:(jint)index;

- (void)addViewWithADView:(ADView *)child
                  withInt:(jint)width
                  withInt:(jint)height;

- (void)addViewWithADView:(ADView *)child
                  withInt:(jint)index
withADViewGroup_LayoutParams:(ADViewGroup_LayoutParams *)params;

- (void)addViewWithADView:(ADView *)child
withADViewGroup_LayoutParams:(ADViewGroup_LayoutParams *)params;

- (void)bringToFront;

- (void)childDrawableStateChangedWithADView:(ADView *)child;

- (void)endViewTransitionWithADView:(ADView *)view;

- (void)focusableViewAvailableWithADView:(ADView *)v;

- (ADView *)getChildAtWithInt:(jint)index;

- (jint)getChildCount;

+ (jint)getChildMeasureSpecWithInt:(jint)spec
                           withInt:(jint)padding
                           withInt:(jint)childDimension;

- (jboolean)getClipToPadding;

- (jint)getLayoutMode;

- (ADLayoutTransition *)getLayoutTransition;

- (ADRect *)getPaddingMaskBounds;

- (jboolean)hasChildWithADView:(ADView *)child;

- (void)incrementChildUnhandledKeyListeners;

- (jint)indexOfChildWithADView:(ADView *)child;

- (void)invalidateChildWithADView:(ADView *)child
                       withADRect:(ADRect *)r;

- (jint)measureHeightOfChildrenWithInt:(jint)widthMeasureSpec
                               withInt:(jint)startPosition
                               withInt:(jint)endPosition
                               withInt:(jint)maxHeight
                               withInt:(jint)disallowPartialChildPosition;

- (void)offsetChildrenTopAndBottomWithInt:(jint)offset;

- (jboolean)onNestedFlingWithADView:(ADView *)target
                          withFloat:(jfloat)velocityX
                          withFloat:(jfloat)velocityY
                        withBoolean:(jboolean)consumed;

- (jboolean)onNestedPreFlingWithADView:(ADView *)target
                             withFloat:(jfloat)velocityX
                             withFloat:(jfloat)velocityY;

- (void)onNestedPreScrollWithADView:(ADView *)target
                            withInt:(jint)dx
                            withInt:(jint)dy
                       withIntArray:(IOSIntArray *)consumed;

- (void)onNestedScrollWithADView:(ADView *)target
                         withInt:(jint)dxConsumed
                         withInt:(jint)dyConsumed
                         withInt:(jint)dxUnconsumed
                         withInt:(jint)dyUnconsumed;

- (void)onNestedScrollAcceptedWithADView:(ADView *)child
                              withADView:(ADView *)target
                                 withInt:(jint)axes;

- (jboolean)onStartNestedScrollWithADView:(ADView *)child
                               withADView:(ADView *)target
                                  withInt:(jint)nestedScrollAxes;

- (void)onStopNestedScrollWithADView:(ADView *)child;

- (void)onViewAddedWithADView:(ADView *)child;

- (void)onViewRemovedWithADView:(ADView *)child;

- (void)recomputeViewAttributesWithADView:(ADView *)child;

- (void)removeAllViews;

- (void)removeAllViewsInLayout;

- (void)removeViewWithADView:(ADView *)view;

- (void)removeViewAtWithInt:(jint)index;

- (void)requestTransitionStartWithADLayoutTransition:(ADLayoutTransition *)transition;

- (void)setAddStatesFromChildrenWithBoolean:(jboolean)addsStates;

- (void)setClipToPaddingWithBoolean:(jboolean)clipToPadding;

- (void)setLayoutModeWithInt:(jint)layoutMode;

- (void)setLayoutTransitionWithADLayoutTransition:(ADLayoutTransition *)transition;

- (void)setOnHierarchyChangeListenerWithADViewGroup_OnHierarchyChangeListener:(id<ADViewGroup_OnHierarchyChangeListener>)listener;

- (void)setRedrawWithBoolean:(jboolean)flag;

- (void)startViewTransitionWithADView:(ADView *)view;

#pragma mark Protected

- (jboolean)addViewInLayoutWithADView:(ADView *)child
                              withInt:(jint)index
         withADViewGroup_LayoutParams:(ADViewGroup_LayoutParams *)params;

- (jboolean)addViewInLayoutWithADView:(ADView *)child
                              withInt:(jint)index
         withADViewGroup_LayoutParams:(ADViewGroup_LayoutParams *)params
                          withBoolean:(jboolean)preventRequestLayout;

- (void)attachViewToParentWithADView:(ADView *)child
                             withInt:(jint)index
        withADViewGroup_LayoutParams:(ADViewGroup_LayoutParams *)params;

- (jboolean)checkLayoutParamsWithADViewGroup_LayoutParams:(ADViewGroup_LayoutParams *)p;

- (void)cleanupLayoutStateWithADView:(ADView *)child;

- (void)detachAllViewsFromParent;

- (void)detachViewFromParentWithInt:(jint)index;

- (void)detachViewFromParentWithADView:(ADView *)child;

- (void)detachViewsFromParentWithInt:(jint)start
                             withInt:(jint)count;

- (void)dispatchSetPressedWithBoolean:(jboolean)pressed;

- (void)drawableStateChanged;

- (ADView *)findViewTraversalWithInt:(jint)id_;

- (ADViewGroup_LayoutParams *)generateDefaultLayoutParams;

- (ADViewGroup_LayoutParams *)generateLayoutParamsWithADViewGroup_LayoutParams:(ADViewGroup_LayoutParams *)p;

- (void)measureChildWithADView:(ADView *)child
                       withInt:(jint)parentWidthMeasureSpec
                       withInt:(jint)parentHeightMeasureSpec;

- (void)measureChildrenWithInt:(jint)widthMeasureSpec
                       withInt:(jint)heightMeasureSpec;

- (void)measureChildWithMarginsWithADView:(ADView *)child
                                  withInt:(jint)parentWidthMeasureSpec
                                  withInt:(jint)widthUsed
                                  withInt:(jint)parentHeightMeasureSpec
                                  withInt:(jint)heightUsed;

- (void)onChildVisibilityChangedWithADView:(ADView *)child
                                   withInt:(jint)oldVisibility
                                   withInt:(jint)newVisibility;

- (IOSIntArray *)onCreateDrawableStateWithInt:(jint)extraSpace;

- (void)onSetLayoutParamsWithADView:(ADView *)child
       withADViewGroup_LayoutParams:(ADViewGroup_LayoutParams *)layoutParams;

#pragma mark Package-Private

- (void)dispatchAttachedToWindowWithADView_AttachInfo:(ADView_AttachInfo *)info
                                              withInt:(jint)visibility;

- (void)dispatchViewAddedWithADView:(ADView *)child;

- (void)dispatchViewRemovedWithADView:(ADView *)child;

- (void)invalidateInheritedLayoutModeWithInt:(jint)layoutModeOfRoot;

- (jboolean)isLayoutModeOptical;

- (jboolean)isViewTransitioningWithADView:(ADView *)view;

@end

J2OBJC_EMPTY_STATIC_INIT(ADViewGroup)

J2OBJC_FIELD_SETTER(ADViewGroup, mDisappearingChildren_, JavaUtilArrayList *)
J2OBJC_FIELD_SETTER(ADViewGroup, mOnHierarchyChangeListener_, id<ADViewGroup_OnHierarchyChangeListener>)
J2OBJC_FIELD_SETTER(ADViewGroup, mFocusedInCluster_, ADView *)

inline jint ADViewGroup_get_FLAG_CLIP_CHILDREN(void);
#define ADViewGroup_FLAG_CLIP_CHILDREN 1
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup, FLAG_CLIP_CHILDREN, jint)

inline jint ADViewGroup_get_FLAG_INVALIDATE_REQUIRED(void);
#define ADViewGroup_FLAG_INVALIDATE_REQUIRED 4
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup, FLAG_INVALIDATE_REQUIRED, jint)

inline jint ADViewGroup_get_FLAG_ANIMATION_DONE(void);
#define ADViewGroup_FLAG_ANIMATION_DONE 16
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup, FLAG_ANIMATION_DONE, jint)

inline jint ADViewGroup_get_FLAG_OPTIMIZE_INVALIDATE(void);
#define ADViewGroup_FLAG_OPTIMIZE_INVALIDATE 128
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup, FLAG_OPTIMIZE_INVALIDATE, jint)

inline jint ADViewGroup_get_FLAG_CLEAR_TRANSFORMATION(void);
#define ADViewGroup_FLAG_CLEAR_TRANSFORMATION 256
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup, FLAG_CLEAR_TRANSFORMATION, jint)

inline jint ADViewGroup_get_FLAG_USE_CHILD_DRAWING_ORDER(void);
#define ADViewGroup_FLAG_USE_CHILD_DRAWING_ORDER 1024
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup, FLAG_USE_CHILD_DRAWING_ORDER, jint)

inline jint ADViewGroup_get_FLAG_SUPPORT_STATIC_TRANSFORMATIONS(void);
#define ADViewGroup_FLAG_SUPPORT_STATIC_TRANSFORMATIONS 2048
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup, FLAG_SUPPORT_STATIC_TRANSFORMATIONS, jint)

inline jint ADViewGroup_get_FOCUS_BEFORE_DESCENDANTS(void);
#define ADViewGroup_FOCUS_BEFORE_DESCENDANTS 131072
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup, FOCUS_BEFORE_DESCENDANTS, jint)

inline jint ADViewGroup_get_FOCUS_AFTER_DESCENDANTS(void);
#define ADViewGroup_FOCUS_AFTER_DESCENDANTS 262144
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup, FOCUS_AFTER_DESCENDANTS, jint)

inline jint ADViewGroup_get_FOCUS_BLOCK_DESCENDANTS(void);
#define ADViewGroup_FOCUS_BLOCK_DESCENDANTS 393216
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup, FOCUS_BLOCK_DESCENDANTS, jint)

inline jint ADViewGroup_get_FLAG_DISALLOW_INTERCEPT(void);
#define ADViewGroup_FLAG_DISALLOW_INTERCEPT 524288
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup, FLAG_DISALLOW_INTERCEPT, jint)

inline jint ADViewGroup_get_FLAG_IS_TRANSITION_GROUP(void);
#define ADViewGroup_FLAG_IS_TRANSITION_GROUP 16777216
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup, FLAG_IS_TRANSITION_GROUP, jint)

inline jint ADViewGroup_get_FLAG_IS_TRANSITION_GROUP_SET(void);
#define ADViewGroup_FLAG_IS_TRANSITION_GROUP_SET 33554432
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup, FLAG_IS_TRANSITION_GROUP_SET, jint)

inline jint ADViewGroup_get_FLAG_TOUCHSCREEN_BLOCKS_FOCUS(void);
#define ADViewGroup_FLAG_TOUCHSCREEN_BLOCKS_FOCUS 67108864
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup, FLAG_TOUCHSCREEN_BLOCKS_FOCUS, jint)

inline jint ADViewGroup_get_PERSISTENT_NO_CACHE(void);
#define ADViewGroup_PERSISTENT_NO_CACHE 0
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup, PERSISTENT_NO_CACHE, jint)

inline jint ADViewGroup_get_PERSISTENT_ANIMATION_CACHE(void);
#define ADViewGroup_PERSISTENT_ANIMATION_CACHE 1
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup, PERSISTENT_ANIMATION_CACHE, jint)

inline jint ADViewGroup_get_PERSISTENT_SCROLLING_CACHE(void);
#define ADViewGroup_PERSISTENT_SCROLLING_CACHE 2
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup, PERSISTENT_SCROLLING_CACHE, jint)

inline jint ADViewGroup_get_PERSISTENT_ALL_CACHES(void);
#define ADViewGroup_PERSISTENT_ALL_CACHES 3
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup, PERSISTENT_ALL_CACHES, jint)

inline jint ADViewGroup_get_LAYOUT_MODE_CLIP_BOUNDS(void);
#define ADViewGroup_LAYOUT_MODE_CLIP_BOUNDS 0
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup, LAYOUT_MODE_CLIP_BOUNDS, jint)

inline jint ADViewGroup_get_LAYOUT_MODE_OPTICAL_BOUNDS(void);
#define ADViewGroup_LAYOUT_MODE_OPTICAL_BOUNDS 1
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup, LAYOUT_MODE_OPTICAL_BOUNDS, jint)

inline jint ADViewGroup_get_LAYOUT_MODE_DEFAULT(void);
inline jint ADViewGroup_set_LAYOUT_MODE_DEFAULT(jint value);
inline jint *ADViewGroup_getRef_LAYOUT_MODE_DEFAULT(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT jint ADViewGroup_LAYOUT_MODE_DEFAULT;
J2OBJC_STATIC_FIELD_PRIMITIVE(ADViewGroup, LAYOUT_MODE_DEFAULT, jint)

inline jint ADViewGroup_get_CLIP_TO_PADDING_MASK(void);
#define ADViewGroup_CLIP_TO_PADDING_MASK 34
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup, CLIP_TO_PADDING_MASK, jint)

FOUNDATION_EXPORT void ADViewGroup_init(ADViewGroup *self);

FOUNDATION_EXPORT jint ADViewGroup_getChildMeasureSpecWithInt_withInt_withInt_(jint spec, jint padding, jint childDimension);

J2OBJC_TYPE_LITERAL_HEADER(ADViewGroup)

@compatibility_alias RAndroidViewViewGroup ADViewGroup;

#endif

#if !defined (ADViewGroup_OnHierarchyChangeListener_) && (INCLUDE_ALL_ViewGroup || defined(INCLUDE_ADViewGroup_OnHierarchyChangeListener))
#define ADViewGroup_OnHierarchyChangeListener_

@class ADView;

@protocol ADViewGroup_OnHierarchyChangeListener < JavaObject >

- (void)onChildViewAddedWithADView:(ADView *)parent
                        withADView:(ADView *)child;

- (void)onChildViewRemovedWithADView:(ADView *)parent
                          withADView:(ADView *)child;

@end

J2OBJC_EMPTY_STATIC_INIT(ADViewGroup_OnHierarchyChangeListener)

J2OBJC_TYPE_LITERAL_HEADER(ADViewGroup_OnHierarchyChangeListener)

#endif

#if !defined (ADViewGroup_LayoutParams_) && (INCLUDE_ALL_ViewGroup || defined(INCLUDE_ADViewGroup_LayoutParams))
#define ADViewGroup_LayoutParams_

@interface ADViewGroup_LayoutParams : NSObject {
 @public
  jint width_;
  jint height_;
}

#pragma mark Public

- (instancetype)initWithInt:(jint)width
                    withInt:(jint)height;

- (instancetype)initWithADViewGroup_LayoutParams:(ADViewGroup_LayoutParams *)source;

- (void)resolveLayoutDirectionWithInt:(jint)layoutDirection;

#pragma mark Protected

+ (NSString *)sizeToStringWithInt:(jint)size;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ADViewGroup_LayoutParams)

inline jint ADViewGroup_LayoutParams_get_FILL_PARENT(void);
#define ADViewGroup_LayoutParams_FILL_PARENT -1
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup_LayoutParams, FILL_PARENT, jint)

inline jint ADViewGroup_LayoutParams_get_MATCH_PARENT(void);
#define ADViewGroup_LayoutParams_MATCH_PARENT -1
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup_LayoutParams, MATCH_PARENT, jint)

inline jint ADViewGroup_LayoutParams_get_WRAP_CONTENT(void);
#define ADViewGroup_LayoutParams_WRAP_CONTENT -2
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup_LayoutParams, WRAP_CONTENT, jint)

FOUNDATION_EXPORT void ADViewGroup_LayoutParams_initWithInt_withInt_(ADViewGroup_LayoutParams *self, jint width, jint height);

FOUNDATION_EXPORT ADViewGroup_LayoutParams *new_ADViewGroup_LayoutParams_initWithInt_withInt_(jint width, jint height) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADViewGroup_LayoutParams *create_ADViewGroup_LayoutParams_initWithInt_withInt_(jint width, jint height);

FOUNDATION_EXPORT void ADViewGroup_LayoutParams_initWithADViewGroup_LayoutParams_(ADViewGroup_LayoutParams *self, ADViewGroup_LayoutParams *source);

FOUNDATION_EXPORT ADViewGroup_LayoutParams *new_ADViewGroup_LayoutParams_initWithADViewGroup_LayoutParams_(ADViewGroup_LayoutParams *source) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADViewGroup_LayoutParams *create_ADViewGroup_LayoutParams_initWithADViewGroup_LayoutParams_(ADViewGroup_LayoutParams *source);

FOUNDATION_EXPORT void ADViewGroup_LayoutParams_init(ADViewGroup_LayoutParams *self);

FOUNDATION_EXPORT ADViewGroup_LayoutParams *new_ADViewGroup_LayoutParams_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADViewGroup_LayoutParams *create_ADViewGroup_LayoutParams_init(void);

FOUNDATION_EXPORT NSString *ADViewGroup_LayoutParams_sizeToStringWithInt_(jint size);

J2OBJC_TYPE_LITERAL_HEADER(ADViewGroup_LayoutParams)

#endif

#if !defined (ADViewGroup_MarginLayoutParams_) && (INCLUDE_ALL_ViewGroup || defined(INCLUDE_ADViewGroup_MarginLayoutParams))
#define ADViewGroup_MarginLayoutParams_

@class ADViewGroup_LayoutParams;

@interface ADViewGroup_MarginLayoutParams : ADViewGroup_LayoutParams {
 @public
  jint leftMargin_;
  jint topMargin_;
  jint rightMargin_;
  jint bottomMargin_;
  jbyte mMarginFlags_;
}

#pragma mark Public

- (instancetype)initWithInt:(jint)width
                    withInt:(jint)height;

- (instancetype)initWithADViewGroup_LayoutParams:(ADViewGroup_LayoutParams *)source;

- (instancetype)initWithADViewGroup_MarginLayoutParams:(ADViewGroup_MarginLayoutParams *)source;

- (void)copyMarginsFromWithADViewGroup_MarginLayoutParams:(ADViewGroup_MarginLayoutParams *)source OBJC_METHOD_FAMILY_NONE;

- (jint)getLayoutDirection;

- (jint)getMarginEnd;

- (jint)getMarginStart;

- (jboolean)isLayoutRtl;

- (jboolean)isMarginRelative;

- (void)resolveLayoutDirectionWithInt:(jint)layoutDirection;

- (void)setLayoutDirectionWithInt:(jint)layoutDirection;

- (void)setMarginEndWithInt:(jint)end;

- (void)setMarginsWithInt:(jint)left
                  withInt:(jint)top
                  withInt:(jint)right
                  withInt:(jint)bottom;

- (void)setMarginsRelativeWithInt:(jint)start
                          withInt:(jint)top
                          withInt:(jint)end
                          withInt:(jint)bottom;

- (void)setMarginStartWithInt:(jint)start;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADViewGroup_MarginLayoutParams)

inline jint ADViewGroup_MarginLayoutParams_get_DEFAULT_MARGIN_RELATIVE(void);
#define ADViewGroup_MarginLayoutParams_DEFAULT_MARGIN_RELATIVE ((jint) 0x80000000)
J2OBJC_STATIC_FIELD_CONSTANT(ADViewGroup_MarginLayoutParams, DEFAULT_MARGIN_RELATIVE, jint)

FOUNDATION_EXPORT void ADViewGroup_MarginLayoutParams_initWithInt_withInt_(ADViewGroup_MarginLayoutParams *self, jint width, jint height);

FOUNDATION_EXPORT ADViewGroup_MarginLayoutParams *new_ADViewGroup_MarginLayoutParams_initWithInt_withInt_(jint width, jint height) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADViewGroup_MarginLayoutParams *create_ADViewGroup_MarginLayoutParams_initWithInt_withInt_(jint width, jint height);

FOUNDATION_EXPORT void ADViewGroup_MarginLayoutParams_initWithADViewGroup_MarginLayoutParams_(ADViewGroup_MarginLayoutParams *self, ADViewGroup_MarginLayoutParams *source);

FOUNDATION_EXPORT ADViewGroup_MarginLayoutParams *new_ADViewGroup_MarginLayoutParams_initWithADViewGroup_MarginLayoutParams_(ADViewGroup_MarginLayoutParams *source) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADViewGroup_MarginLayoutParams *create_ADViewGroup_MarginLayoutParams_initWithADViewGroup_MarginLayoutParams_(ADViewGroup_MarginLayoutParams *source);

FOUNDATION_EXPORT void ADViewGroup_MarginLayoutParams_initWithADViewGroup_LayoutParams_(ADViewGroup_MarginLayoutParams *self, ADViewGroup_LayoutParams *source);

FOUNDATION_EXPORT ADViewGroup_MarginLayoutParams *new_ADViewGroup_MarginLayoutParams_initWithADViewGroup_LayoutParams_(ADViewGroup_LayoutParams *source) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADViewGroup_MarginLayoutParams *create_ADViewGroup_MarginLayoutParams_initWithADViewGroup_LayoutParams_(ADViewGroup_LayoutParams *source);

J2OBJC_TYPE_LITERAL_HEADER(ADViewGroup_MarginLayoutParams)

#endif

#if !defined (ADViewGroup_DragEvent_) && (INCLUDE_ALL_ViewGroup || defined(INCLUDE_ADViewGroup_DragEvent))
#define ADViewGroup_DragEvent_

@class ADViewGroup;

@interface ADViewGroup_DragEvent : NSObject

#pragma mark Package-Private

- (instancetype)initWithADViewGroup:(ADViewGroup *)outer$;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADViewGroup_DragEvent)

FOUNDATION_EXPORT void ADViewGroup_DragEvent_initWithADViewGroup_(ADViewGroup_DragEvent *self, ADViewGroup *outer$);

FOUNDATION_EXPORT ADViewGroup_DragEvent *new_ADViewGroup_DragEvent_initWithADViewGroup_(ADViewGroup *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADViewGroup_DragEvent *create_ADViewGroup_DragEvent_initWithADViewGroup_(ADViewGroup *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ADViewGroup_DragEvent)

#endif

#pragma pop_macro("INCLUDE_ALL_ViewGroup")
