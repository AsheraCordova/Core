//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroidX-core\src\main\java\androidx\core\view\ViewParentCompat.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ViewParentCompat")
#ifdef RESTRICT_ViewParentCompat
#define INCLUDE_ALL_ViewParentCompat 0
#else
#define INCLUDE_ALL_ViewParentCompat 1
#endif
#undef RESTRICT_ViewParentCompat

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (ADXViewParentCompat_) && (INCLUDE_ALL_ViewParentCompat || defined(INCLUDE_ADXViewParentCompat))
#define ADXViewParentCompat_

@class ADAccessibilityEvent;
@class ADView;
@class IOSIntArray;
@protocol ADViewParent;

/*!
 @brief Helper for accessing features in <code>ViewParent</code>.
 */
@interface ADXViewParentCompat : NSObject

#pragma mark Public

/*!
 @brief Notifies a view parent that the accessibility state of one of its
  descendants has changed and that the structure of the subtree is
  different.
 @param parent ViewParent that contains the target view.
 @param child The direct child whose subtree has changed.
 @param source The descendant view that changed.
 @param changeType A bit mask of the types of changes that occurred. One             or more of:
              
  <ul>             
  <li><code>AccessibilityEvent.CONTENT_CHANGE_TYPE_CONTENT_DESCRIPTION</code>              <li>
 <code>AccessibilityEvent.CONTENT_CHANGE_TYPE_SUBTREE</code>              <li><code>AccessibilityEvent.CONTENT_CHANGE_TYPE_TEXT</code>
               <li><code>AccessibilityEvent.CONTENT_CHANGE_TYPE_UNDEFINED</code>
               </ul>
 */
+ (void)notifySubtreeAccessibilityStateChangedWithADViewParent:(id<ADViewParent>)parent
                                                    withADView:(ADView *)child
                                                    withADView:(ADView *)source
                                                       withInt:(jint)changeType;

/*!
 @brief Request a fling from a nested scroll.
 <p>This method signifies that a nested scrolling child has detected suitable conditions
  for a fling. Generally this means that a touch scroll has ended with a 
 <code>velocity</code> in the direction of scrolling that meets or exceeds the 
 <code>minimum fling velocity</code>
  along a scrollable axis.</p>
  
 <p>If a nested scrolling child view would normally fling but it is at the edge of
  its own content, it can use this method to delegate the fling to its nested scrolling
  parent instead. The parent may optionally consume the fling or observe a child fling.</p>
 @param parent ViewParent that contains the target view.
 @param target View that initiated the nested scroll
 @param velocityX Horizontal velocity in pixels per second
 @param velocityY Vertical velocity in pixels per second
 @param consumed true if the child consumed the fling, false otherwise
 @return true if this parent consumed or otherwise reacted to the fling
 */
+ (jboolean)onNestedFlingWithADViewParent:(id<ADViewParent>)parent
                               withADView:(ADView *)target
                                withFloat:(jfloat)velocityX
                                withFloat:(jfloat)velocityY
                              withBoolean:(jboolean)consumed;

/*!
 @brief React to a nested fling before the target view consumes it.
 <p>This method siginfies that a nested scrolling child has detected a fling with the given
  velocity along each axis. Generally this means that a touch scroll has ended with a 
 <code>velocity</code> in the direction of scrolling that meets or exceeds the 
 <code>minimum fling velocity</code>
  along a scrollable axis.</p>
  
 <p>If a nested scrolling parent is consuming motion as part of a 
 <code>pre-scroll</code>, it may be
  appropriate for it to also consume the pre-fling to complete that same motion. By returning 
 <code>true</code> from this method, the parent indicates that the child should not
  fling its own internal content as well.</p>
 @param parent ViewParent that contains the target view.
 @param target View that initiated the nested scroll
 @param velocityX Horizontal velocity in pixels per second
 @param velocityY Vertical velocity in pixels per second
 @return true if this parent consumed the fling ahead of the target view
 */
+ (jboolean)onNestedPreFlingWithADViewParent:(id<ADViewParent>)parent
                                  withADView:(ADView *)target
                                   withFloat:(jfloat)velocityX
                                   withFloat:(jfloat)velocityY;

/*!
 @brief React to a nested scroll in progress before the target view consumes a portion of the scroll.
 <p>This version of the method just calls 
 <code>onNestedPreScroll(ViewParent, View, int, int, int[], int)</code> using the touch input
  type.</p>
 @param parent ViewParent that contains the target view.
 @param target View that initiated the nested scroll
 @param dx Horizontal scroll distance in pixels
 @param dy Vertical scroll distance in pixels
 @param consumed Output. The horizontal and vertical scroll distance consumed by this parent
 */
+ (void)onNestedPreScrollWithADViewParent:(id<ADViewParent>)parent
                               withADView:(ADView *)target
                                  withInt:(jint)dx
                                  withInt:(jint)dy
                             withIntArray:(IOSIntArray *)consumed;

/*!
 @brief React to a nested scroll in progress before the target view consumes a portion of the scroll.
 <p>When working with nested scrolling often the parent view may want an opportunity
  to consume the scroll before the nested scrolling child does. An example of this is a
  drawer that contains a scrollable list. The user will want to be able to scroll the list
  fully into view before the list itself begins scrolling.</p>
  
 <p><code>onNestedPreScroll</code> is called when a nested scrolling child invokes 
 <code>ViewCompat.dispatchNestedPreScroll(View, int, int, int[], int[])</code>. The implementation
  should report how any pixels of the scroll reported by dx, dy were consumed in the 
 <code>consumed</code> array. Index 0 corresponds to dx and index 1 corresponds to dy.
  This parameter will never be null. Initial values for consumed[0] and consumed[1]
  will always be 0.</p>
 @param parent ViewParent that contains the target view.
 @param target View that initiated the nested scroll
 @param dx Horizontal scroll distance in pixels
 @param dy Vertical scroll distance in pixels
 @param consumed Output. The horizontal and vertical scroll distance consumed by this parent
 @param type the type of input which cause this scroll event
 */
+ (void)onNestedPreScrollWithADViewParent:(id<ADViewParent>)parent
                               withADView:(ADView *)target
                                  withInt:(jint)dx
                                  withInt:(jint)dy
                             withIntArray:(IOSIntArray *)consumed
                                  withInt:(jint)type;

/*!
 @brief React to a nested scroll in progress.
 <p>This version of the method just calls 
 <code>onNestedScroll(ViewParent, View, int, int, int, int, int)</code> using the touch input
  type.
 @param parent ViewParent that contains the target view.
 @param target The descendent view controlling the nested scroll
 @param dxConsumed Horizontal scroll distance in pixels already consumed by target
 @param dyConsumed Vertical scroll distance in pixels already consumed by target
 @param dxUnconsumed Horizontal scroll distance in pixels not consumed by target
 @param dyUnconsumed Vertical scroll distance in pixels not consumed by target
 */
+ (void)onNestedScrollWithADViewParent:(id<ADViewParent>)parent
                            withADView:(ADView *)target
                               withInt:(jint)dxConsumed
                               withInt:(jint)dyConsumed
                               withInt:(jint)dxUnconsumed
                               withInt:(jint)dyUnconsumed;

/*!
 @brief React to a nested scroll in progress.
 <p>This method will be called when the ViewParent's current nested scrolling child view
  dispatches a nested scroll event. To receive calls to this method the ViewParent must have
  previously returned <code>true</code> for a call to 
 <code>onStartNestedScroll(ViewParent, View, View, int, int)</code>.</p>
  
 <p>Both the consumed and unconsumed portions of the scroll distance are reported to the
  ViewParent. An implementation may choose to use the consumed portion to match or chase scroll
  position of multiple child elements, for example. The unconsumed portion may be used to
  allow continuous dragging of multiple scrolling or draggable elements, such as scrolling
  a list within a vertical drawer where the drawer begins dragging once the edge of inner
  scrolling content is reached.</p>
 @param parent ViewParent that contains the target view.
 @param target The descendant view controlling the nested scroll
 @param dxConsumed Horizontal scroll distance in pixels already consumed by target
 @param dyConsumed Vertical scroll distance in pixels already consumed by target
 @param dxUnconsumed Horizontal scroll distance in pixels not consumed by target
 @param dyUnconsumed Vertical scroll distance in pixels not consumed by target
 @param type the type of input which cause this scroll event
 */
+ (void)onNestedScrollWithADViewParent:(id<ADViewParent>)parent
                            withADView:(ADView *)target
                               withInt:(jint)dxConsumed
                               withInt:(jint)dyConsumed
                               withInt:(jint)dxUnconsumed
                               withInt:(jint)dyUnconsumed
                               withInt:(jint)type;

/*!
 @brief React to a nested scroll in progress.
 <p>This method will be called when the ViewParent's current nested scrolling child view
  dispatches a nested scroll event. To receive calls to this method the ViewParent must have
  previously returned <code>true</code> for a call to 
 <code>onStartNestedScroll(ViewParent, View, View, int, int)</code>.</p>
  
 <p>Both the consumed and unconsumed portions of the scroll distance are reported to the
  ViewParent. An implementation may choose to use the consumed portion to match or chase scroll
  position of multiple child elements, for example. The unconsumed portion may be used to
  allow continuous dragging of multiple scrolling or draggable elements, such as scrolling
  a list within a vertical drawer where the drawer begins dragging once the edge of inner
  scrolling content is reached.</p>
 @param parent ViewParent that contains the target view.
 @param target The descendent view controlling the nested scroll
 @param dxConsumed Horizontal scroll distance in pixels already consumed by target
 @param dyConsumed Vertical scroll distance in pixels already consumed by target
 @param dxUnconsumed Horizontal scroll distance in pixels not consumed by target
 @param dyUnconsumed Vertical scroll distance in pixels not consumed by target
 @param type the type of input which cause this scroll event
 @param consumed Output. If not null, upon this method returning, will contain the scroll                  distances consumed by this nested scrolling parent and the scroll distances
                   consumed by any other parent up the view hierarchy.
 */
+ (void)onNestedScrollWithADViewParent:(id<ADViewParent>)parent
                            withADView:(ADView *)target
                               withInt:(jint)dxConsumed
                               withInt:(jint)dyConsumed
                               withInt:(jint)dxUnconsumed
                               withInt:(jint)dyUnconsumed
                               withInt:(jint)type
                          withIntArray:(IOSIntArray *)consumed;

/*!
 @brief React to the successful claiming of a nested scroll operation.
 <p>This version of the method just calls 
 <code>onNestedScrollAccepted(ViewParent, View, View, int, int)</code> using the touch input type. 
 </p>
 @param parent ViewParent that contains the child view.
 @param child Direct child of this ViewParent containing target
 @param target View that initiated the nested scroll
 @param nestedScrollAxes Flags consisting of <code>ViewCompat.SCROLL_AXIS_HORIZONTAL</code> ,
                           <code>ViewCompat.SCROLL_AXIS_VERTICAL</code>  or both
 */
+ (void)onNestedScrollAcceptedWithADViewParent:(id<ADViewParent>)parent
                                    withADView:(ADView *)child
                                    withADView:(ADView *)target
                                       withInt:(jint)nestedScrollAxes;

/*!
 @brief React to the successful claiming of a nested scroll operation.
 <p>This method will be called after 
 <code>onStartNestedScroll</code> returns true.
  It offers an opportunity for the view and its superclasses to perform initial configuration
  for the nested scroll. Implementations of this method should always call their superclass's
  implementation of this method if one is present.</p>
 @param parent ViewParent that contains the child view.
 @param child Direct child of this ViewParent containing target
 @param target View that initiated the nested scroll
 @param nestedScrollAxes Flags consisting of <code>ViewCompat.SCROLL_AXIS_HORIZONTAL</code> ,
                           <code>ViewCompat.SCROLL_AXIS_VERTICAL</code>  or both
 @param type the type of input which cause this scroll event
 - seealso: #onStartNestedScroll(ViewParent, View, View, int)
 - seealso: #onStopNestedScroll(ViewParent, View, int)
 */
+ (void)onNestedScrollAcceptedWithADViewParent:(id<ADViewParent>)parent
                                    withADView:(ADView *)child
                                    withADView:(ADView *)target
                                       withInt:(jint)nestedScrollAxes
                                       withInt:(jint)type;

/*!
 @brief React to a descendant view initiating a nestable scroll operation, claiming the
  nested scroll operation if appropriate.
 <p>This version of the method just calls 
 <code>onStartNestedScroll(ViewParent, View, View, int, int)</code> using the touch input type. 
 </p>
 @param parent ViewParent that contains the child view.
 @param child Direct child of this ViewParent containing target
 @param target View that initiated the nested scroll
 @param nestedScrollAxes Flags consisting of <code>ViewCompat.SCROLL_AXIS_HORIZONTAL</code> ,
                           <code>ViewCompat.SCROLL_AXIS_VERTICAL</code>  or both
 @return true if this ViewParent accepts the nested scroll operation
 */
+ (jboolean)onStartNestedScrollWithADViewParent:(id<ADViewParent>)parent
                                     withADView:(ADView *)child
                                     withADView:(ADView *)target
                                        withInt:(jint)nestedScrollAxes;

/*!
 @brief React to a descendant view initiating a nestable scroll operation, claiming the
  nested scroll operation if appropriate.
 <p>This method will be called in response to a descendant view invoking 
 <code>ViewCompat.startNestedScroll(View, int)</code>. Each parent up the view hierarchy will be
  given an opportunity to respond and claim the nested scrolling operation by returning 
 <code>true</code>.</p>
  
 <p>This method may be overridden by ViewParent implementations to indicate when the view
  is willing to support a nested scrolling operation that is about to begin. If it returns
  true, this ViewParent will become the target view's nested scrolling parent for the duration
  of the scroll operation in progress. When the nested scroll is finished this ViewParent
  will receive a call to <code>onStopNestedScroll(ViewParent, View, int)</code>.
  </p>
 @param parent ViewParent that contains the child view.
 @param child Direct child of this ViewParent containing target
 @param target View that initiated the nested scroll
 @param nestedScrollAxes Flags consisting of <code>ViewCompat.SCROLL_AXIS_HORIZONTAL</code> ,
                           <code>ViewCompat.SCROLL_AXIS_VERTICAL</code>  or both
 @param type the type of input which cause this scroll event
 @return true if this ViewParent accepts the nested scroll operation
 */
+ (jboolean)onStartNestedScrollWithADViewParent:(id<ADViewParent>)parent
                                     withADView:(ADView *)child
                                     withADView:(ADView *)target
                                        withInt:(jint)nestedScrollAxes
                                        withInt:(jint)type;

/*!
 @brief React to a nested scroll operation ending.
 <p>This version of the method just calls <code>onStopNestedScroll(ViewParent, View, int)</code>
  using the touch input type.</p>
 @param parent ViewParent that contains the target view.
 @param target View that initiated the nested scroll
 */
+ (void)onStopNestedScrollWithADViewParent:(id<ADViewParent>)parent
                                withADView:(ADView *)target;

/*!
 @brief React to a nested scroll operation ending.
 <p>Perform cleanup after a nested scrolling operation.
  This method will be called when a nested scroll stops, for example when a nested touch
  scroll ends with a <code>MotionEvent.ACTION_UP</code> or <code>MotionEvent.ACTION_CANCEL</code> event.
  Implementations of this method should always call their superclass's implementation of this
  method if one is present.</p>
 @param parent ViewParent that contains the target view.
 @param target View that initiated the nested scroll
 @param type the type of input which cause this scroll event
 */
+ (void)onStopNestedScrollWithADViewParent:(id<ADViewParent>)parent
                                withADView:(ADView *)target
                                   withInt:(jint)type;

/*!
 @brief Called by a child to request from its parent to send an <code>AccessibilityEvent</code>.
 The child has already populated a record for itself in the event and is delegating
  to its parent to send the event. The parent can optionally add a record for itself. 
 <p>
  Note: An accessibility event is fired by an individual view which populates the
        event with a record for its state and requests from its parent to perform
        the sending. The parent can optionally add a record for itself before
        dispatching the request to its parent. A parent can also choose not to
        respect the request for sending the event. The accessibility event is sent
        by the topmost view in the view tree.</p>
 @param parent The parent whose method to invoke.
 @param child The child which requests sending the event.
 @param event The event to be sent.
 @return True if the event was sent.
 */
+ (jboolean)requestSendAccessibilityEventWithADViewParent:(id<ADViewParent>)parent
                                               withADView:(ADView *)child
                                 withADAccessibilityEvent:(ADAccessibilityEvent *)event;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXViewParentCompat)

FOUNDATION_EXPORT jboolean ADXViewParentCompat_requestSendAccessibilityEventWithADViewParent_withADView_withADAccessibilityEvent_(id<ADViewParent> parent, ADView *child, ADAccessibilityEvent *event);

FOUNDATION_EXPORT jboolean ADXViewParentCompat_onStartNestedScrollWithADViewParent_withADView_withADView_withInt_(id<ADViewParent> parent, ADView *child, ADView *target, jint nestedScrollAxes);

FOUNDATION_EXPORT void ADXViewParentCompat_onNestedScrollAcceptedWithADViewParent_withADView_withADView_withInt_(id<ADViewParent> parent, ADView *child, ADView *target, jint nestedScrollAxes);

FOUNDATION_EXPORT void ADXViewParentCompat_onStopNestedScrollWithADViewParent_withADView_(id<ADViewParent> parent, ADView *target);

FOUNDATION_EXPORT void ADXViewParentCompat_onNestedScrollWithADViewParent_withADView_withInt_withInt_withInt_withInt_(id<ADViewParent> parent, ADView *target, jint dxConsumed, jint dyConsumed, jint dxUnconsumed, jint dyUnconsumed);

FOUNDATION_EXPORT void ADXViewParentCompat_onNestedScrollWithADViewParent_withADView_withInt_withInt_withInt_withInt_withInt_(id<ADViewParent> parent, ADView *target, jint dxConsumed, jint dyConsumed, jint dxUnconsumed, jint dyUnconsumed, jint type);

FOUNDATION_EXPORT void ADXViewParentCompat_onNestedPreScrollWithADViewParent_withADView_withInt_withInt_withIntArray_(id<ADViewParent> parent, ADView *target, jint dx, jint dy, IOSIntArray *consumed);

FOUNDATION_EXPORT jboolean ADXViewParentCompat_onStartNestedScrollWithADViewParent_withADView_withADView_withInt_withInt_(id<ADViewParent> parent, ADView *child, ADView *target, jint nestedScrollAxes, jint type);

FOUNDATION_EXPORT void ADXViewParentCompat_onNestedScrollAcceptedWithADViewParent_withADView_withADView_withInt_withInt_(id<ADViewParent> parent, ADView *child, ADView *target, jint nestedScrollAxes, jint type);

FOUNDATION_EXPORT void ADXViewParentCompat_onStopNestedScrollWithADViewParent_withADView_withInt_(id<ADViewParent> parent, ADView *target, jint type);

FOUNDATION_EXPORT void ADXViewParentCompat_onNestedScrollWithADViewParent_withADView_withInt_withInt_withInt_withInt_withInt_withIntArray_(id<ADViewParent> parent, ADView *target, jint dxConsumed, jint dyConsumed, jint dxUnconsumed, jint dyUnconsumed, jint type, IOSIntArray *consumed);

FOUNDATION_EXPORT void ADXViewParentCompat_onNestedPreScrollWithADViewParent_withADView_withInt_withInt_withIntArray_withInt_(id<ADViewParent> parent, ADView *target, jint dx, jint dy, IOSIntArray *consumed, jint type);

FOUNDATION_EXPORT jboolean ADXViewParentCompat_onNestedFlingWithADViewParent_withADView_withFloat_withFloat_withBoolean_(id<ADViewParent> parent, ADView *target, jfloat velocityX, jfloat velocityY, jboolean consumed);

FOUNDATION_EXPORT jboolean ADXViewParentCompat_onNestedPreFlingWithADViewParent_withADView_withFloat_withFloat_(id<ADViewParent> parent, ADView *target, jfloat velocityX, jfloat velocityY);

FOUNDATION_EXPORT void ADXViewParentCompat_notifySubtreeAccessibilityStateChangedWithADViewParent_withADView_withADView_withInt_(id<ADViewParent> parent, ADView *child, ADView *source, jint changeType);

J2OBJC_TYPE_LITERAL_HEADER(ADXViewParentCompat)

@compatibility_alias AndroidxCoreViewViewParentCompat ADXViewParentCompat;

#endif

#if !defined (ADXViewParentCompat_Api21Impl_) && (INCLUDE_ALL_ViewParentCompat || defined(INCLUDE_ADXViewParentCompat_Api21Impl))
#define ADXViewParentCompat_Api21Impl_

@class ADView;
@class IOSIntArray;
@protocol ADViewParent;

@interface ADXViewParentCompat_Api21Impl : NSObject

#pragma mark Package-Private

+ (jboolean)onNestedFlingWithADViewParent:(id<ADViewParent>)viewParent
                               withADView:(ADView *)view
                                withFloat:(jfloat)v
                                withFloat:(jfloat)v1
                              withBoolean:(jboolean)b;

+ (jboolean)onNestedPreFlingWithADViewParent:(id<ADViewParent>)viewParent
                                  withADView:(ADView *)view
                                   withFloat:(jfloat)v
                                   withFloat:(jfloat)v1;

+ (void)onNestedPreScrollWithADViewParent:(id<ADViewParent>)viewParent
                               withADView:(ADView *)view
                                  withInt:(jint)i
                                  withInt:(jint)i1
                             withIntArray:(IOSIntArray *)ints;

+ (void)onNestedScrollWithADViewParent:(id<ADViewParent>)viewParent
                            withADView:(ADView *)view
                               withInt:(jint)i
                               withInt:(jint)i1
                               withInt:(jint)i2
                               withInt:(jint)i3;

+ (void)onNestedScrollAcceptedWithADViewParent:(id<ADViewParent>)viewParent
                                    withADView:(ADView *)view
                                    withADView:(ADView *)view1
                                       withInt:(jint)i;

+ (jboolean)onStartNestedScrollWithADViewParent:(id<ADViewParent>)viewParent
                                     withADView:(ADView *)view
                                     withADView:(ADView *)view1
                                        withInt:(jint)i;

+ (void)onStopNestedScrollWithADViewParent:(id<ADViewParent>)viewParent
                                withADView:(ADView *)view;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXViewParentCompat_Api21Impl)

FOUNDATION_EXPORT jboolean ADXViewParentCompat_Api21Impl_onStartNestedScrollWithADViewParent_withADView_withADView_withInt_(id<ADViewParent> viewParent, ADView *view, ADView *view1, jint i);

FOUNDATION_EXPORT void ADXViewParentCompat_Api21Impl_onNestedScrollAcceptedWithADViewParent_withADView_withADView_withInt_(id<ADViewParent> viewParent, ADView *view, ADView *view1, jint i);

FOUNDATION_EXPORT void ADXViewParentCompat_Api21Impl_onStopNestedScrollWithADViewParent_withADView_(id<ADViewParent> viewParent, ADView *view);

FOUNDATION_EXPORT void ADXViewParentCompat_Api21Impl_onNestedScrollWithADViewParent_withADView_withInt_withInt_withInt_withInt_(id<ADViewParent> viewParent, ADView *view, jint i, jint i1, jint i2, jint i3);

FOUNDATION_EXPORT void ADXViewParentCompat_Api21Impl_onNestedPreScrollWithADViewParent_withADView_withInt_withInt_withIntArray_(id<ADViewParent> viewParent, ADView *view, jint i, jint i1, IOSIntArray *ints);

FOUNDATION_EXPORT jboolean ADXViewParentCompat_Api21Impl_onNestedFlingWithADViewParent_withADView_withFloat_withFloat_withBoolean_(id<ADViewParent> viewParent, ADView *view, jfloat v, jfloat v1, jboolean b);

FOUNDATION_EXPORT jboolean ADXViewParentCompat_Api21Impl_onNestedPreFlingWithADViewParent_withADView_withFloat_withFloat_(id<ADViewParent> viewParent, ADView *view, jfloat v, jfloat v1);

J2OBJC_TYPE_LITERAL_HEADER(ADXViewParentCompat_Api21Impl)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_ViewParentCompat")
