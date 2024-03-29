//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\animation\Animator.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_Animator")
#ifdef RESTRICT_Animator
#define INCLUDE_ALL_Animator 0
#else
#define INCLUDE_ALL_Animator 1
#endif
#undef RESTRICT_Animator

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (ADAnimator_) && (INCLUDE_ALL_Animator || defined(INCLUDE_ADAnimator))
#define ADAnimator_

@class ADConstantState;
@class ADLongArray;
@class JavaUtilArrayList;
@protocol ADAnimator_AnimatorCaller;
@protocol ADAnimator_AnimatorListener;
@protocol ADAnimator_AnimatorPauseListener;
@protocol ADTimeInterpolator;

/*!
 @brief This is the superclass for classes which provide basic support for animations which can be
  started, ended, and have <code>AnimatorListeners</code> added to them.
 */
@interface ADAnimator : NSObject < NSCopying > {
 @public
  /*!
   @brief The set of listeners to be sent events through the life of an animation.
   */
  JavaUtilArrayList *mListeners_;
  /*!
   @brief The set of listeners to be sent pause/resume events through the life
  of an animation.
   */
  JavaUtilArrayList *mPauseListeners_;
  /*!
   @brief Whether this animator is currently in a paused state.
   */
  jboolean mPaused_;
  /*!
   @brief A set of flags which identify the type of configuration changes that can affect this
  Animator.Used by the Animator cache.
   */
  jint mChangingConfigurations_;
  /*!
   @brief Tracks whether we've notified listeners of the onAnimationStart() event.This can be
  complex to keep track of since we notify listeners at different times depending on
  startDelay and whether start() was called before end().
   */
  jboolean mStartListenersCalled_;
}

#pragma mark Public

- (instancetype)init;

/*!
 @brief Adds a listener to the set of listeners that are sent events through the life of an
  animation, such as start, repeat, and end.
 @param listener the listener to be added to the current set of listeners for this animation.
 */
- (void)addListenerWithADAnimator_AnimatorListener:(id<ADAnimator_AnimatorListener>)listener;

/*!
 @brief Adds a pause listener to this animator.
 @param listener the listener to be added to the current set of pause listeners  for this animation.
 */
- (void)addPauseListenerWithADAnimator_AnimatorPauseListener:(id<ADAnimator_AnimatorPauseListener>)listener;

/*!
 @brief Sets the changing configurations value to the union of the current changing configurations
  and the provided configs.
 This method is called while loading the animator.
 */
- (void)appendChangingConfigurationsWithInt:(jint)configs;

/*!
 @brief Cancels the animation.Unlike <code>end()</code>, <code>cancel()</code> causes the animation to
  stop in its tracks, sending an 
 <code>r.android.animation.Animator.AnimatorListener.onAnimationCancel(Animator)</code> to
  its listeners, followed by an 
 <code>r.android.animation.Animator.AnimatorListener.onAnimationEnd(Animator)</code> message.
 <p>This method must be called on the thread that is running the animation.</p>
 */
- (void)cancel;

/*!
 */
- (jboolean)canReverse;

- (ADAnimator *)java_clone;

/*!
 @brief Return a <code>r.android.content.res.ConstantState</code> instance that holds the shared state of
  this Animator.
 <p>
  This constant state is used to create new instances of this animator when needed, instead
  of re-loading it from resources. Default implementation creates a new 
 <code>AnimatorConstantState</code>. You can override this method to provide your custom logic or
  return null if you don't want this animator to be cached.
 @return The ConfigurationBoundResourceCache.BaseConstantState associated to this Animator.
 - seealso: r.android.content.res.ConstantState
 - seealso: #clone()
 */
- (ADConstantState *)createConstantState;

/*!
 @brief Ends the animation.This causes the animation to assign the end value of the property being
  animated, then calling the 
 <code>r.android.animation.Animator.AnimatorListener.onAnimationEnd(Animator)</code> method on
  its listeners.
 <p>This method must be called on the thread that is running the animation.</p>
 */
- (void)end;

/*!
 @brief Gets the duration for delaying pausing animators when apps go into the background.
 Used by AnimationHandler when requested to pause animators.
 */
+ (jlong)getBackgroundPauseDelay;

/*!
 @brief Return a mask of the configuration parameters for which this animator may change, requiring
  that it should be re-created from Resources.The default implementation returns whatever
  value was provided through setChangingConfigurations(int) or 0 by default.
 @return Returns a mask of the changing configuration parameters, as defined by 
 <code>r.android.content.pm.ActivityInfo</code>.
 - seealso: r.android.content.pm.ActivityInfo
 */
- (jint)getChangingConfigurations;

/*!
 @brief Gets the duration of the animation.
 @return The length of the animation, in milliseconds.
 */
- (jlong)getDuration;

/*!
 @brief Returns the timing interpolator that this animation uses.
 @return The timing interpolator for this animation.
 */
- (id<ADTimeInterpolator>)getInterpolator;

/*!
 @brief Gets the set of <code>r.android.animation.Animator.AnimatorListener</code> objects that are currently
  listening for events on this <code>Animator</code> object.
 @return ArrayList<AnimatorListener> The set of listeners.
 */
- (JavaUtilArrayList *)getListeners;

/*!
 @brief The amount of time, in milliseconds, to delay processing the animation
  after <code>start()</code> is called.
 @return the number of milliseconds to delay running the animation
 */
- (jlong)getStartDelay;

/*!
 @brief Gets the total duration of the animation, accounting for animation sequences, start delay,
  and repeating.Return <code>DURATION_INFINITE</code> if the duration is infinite.
 @return Total time an animation takes to finish, starting from the time <code>start()</code>
           is called. <code>DURATION_INFINITE</code> will be returned if the animation or any
           child animation repeats infinite times.
 */
- (jlong)getTotalDuration;

/*!
 @brief Returns whether this animator is currently in a paused state.
 @return True if the animator is currently paused, false otherwise.
 - seealso: #pause()
 - seealso: #resume()
 */
- (jboolean)isPaused;

/*!
 @brief Returns whether this Animator is currently running (having been started and gone past any
  initial startDelay period and not yet ended).
 @return Whether the Animator is running.
 */
- (jboolean)isRunning;

/*!
 @brief Returns whether this Animator has been started and not yet ended.For reusable
  Animators (which most Animators are, apart from the one-shot animator produced by 
 <code>createCircularReveal()</code>
 ),
  this state is a superset of <code>isRunning()</code>, because an Animator with a
  nonzero <code>startDelay</code> will return true for <code>isStarted()</code> during
  the delay phase, whereas <code>isRunning()</code> will return true only after the delay phase
  is complete.
 Non-reusable animators will always return true after they have been
  started, because they cannot return to a non-started state.
 @return Whether the Animator has been started and not yet ended.
 */
- (jboolean)isStarted;

/*!
 @brief Pauses a running animation.This method should only be called on the same thread on
  which the animation was started.
 If the animation has not yet been <code>started</code>
  or has since ended, then the call is ignored. Paused
  animations can be resumed by calling <code>resume()</code>.
 - seealso: #resume()
 - seealso: #isPaused()
 - seealso: AnimatorPauseListener
 */
- (void)pause;

/*!
 @brief Removes all <code>listeners</code>
  and <code>pauseListeners</code>
  from this object.
 */
- (void)removeAllListeners;

/*!
 @brief Removes a listener from the set listening to this animation.
 @param listener the listener to be removed from the current set of listeners for this                  animation.
 */
- (void)removeListenerWithADAnimator_AnimatorListener:(id<ADAnimator_AnimatorListener>)listener;

/*!
 @brief Removes a pause listener from the set listening to this animation.
 @param listener the listener to be removed from the current set of pause  listeners for this animation.
 */
- (void)removePauseListenerWithADAnimator_AnimatorPauseListener:(id<ADAnimator_AnimatorPauseListener>)listener;

/*!
 @brief Resumes a paused animation, causing the animator to pick up where it left off
  when it was paused.This method should only be called on the same thread on
  which the animation was started.
 Calls to resume() on an animator that is
  not currently paused will be ignored.
 - seealso: #pause()
 - seealso: #isPaused()
 - seealso: AnimatorPauseListener
 */
- (void)resume;

/*!
 */
- (void)reverse;

/*!
 @brief <p>Whether or not the Animator is allowed to run asynchronously off of
  the UI thread.
 This is a hint that informs the Animator that it is
  OK to run the animation off-thread, however the Animator may decide
  that it must run the animation on the UI thread anyway. 
 <p>Regardless of whether or not the animation runs asynchronously, all
  listener callbacks will be called on the UI thread.</p>
  
 <p>To be able to use this hint the following must be true:</p>
  <ol>
  <li>The animator is immutable while <code>isStarted()</code> is true. Requests
     to change duration, delay, etc... may be ignored.</li>
  <li>Lifecycle callback events may be asynchronous. Events such as
     <code>Animator.AnimatorListener.onAnimationEnd(Animator)</code> or
     <code>Animator.AnimatorListener.onAnimationRepeat(Animator)</code> may end up delayed
     as they must be posted back to the UI thread, and any actions performed
     by those callbacks (such as starting new animations) will not happen
     in the same frame.</li>
  <li>State change requests (<code>cancel()</code>, <code>end()</code>, <code>reverse()</code>, etc...)
     may be asynchronous. It is guaranteed that all state changes that are
     performed on the UI thread in the same frame will be applied as a single
     atomic update, however that frame may be the current frame,
     the next frame, or some future frame. This will also impact the observed
     state of the Animator. For example, <code>isStarted()</code> may still return true
     after a call to <code>end()</code>. Using the lifecycle callbacks is preferred over
     queries to <code>isStarted()</code>, <code>isRunning()</code>, and <code>isPaused()</code>
     for this reason.</li>
  </ol>
 */
- (void)setAllowRunningAsynchronouslyWithBoolean:(jboolean)mayRunAsync;

/*!
 @brief Sets the behavior of animator pausing when apps go into the background.
 This is exposed as a test API for verification, but is intended for use by internal/
  platform code, potentially for use by a system property that could disable it
  system wide.
 @param enable Enable (default behavior) or disable background pausing behavior.
 */
+ (void)setAnimatorPausingEnabledWithBoolean:(jboolean)enable;

/*!
 @brief Sets the duration for delaying pausing animators when apps go into the background.
 Used by AnimationHandler when requested to pause animators.
 */
+ (void)setBackgroundPauseDelayWithLong:(jlong)value;

/*!
 @brief Set a mask of the configuration parameters for which this animator may change, requiring
  that it be re-created from resource.
 @param configs A mask of the changing configuration parameters, as  defined by 
 <code>r.android.content.pm.ActivityInfo</code> .
 - seealso: r.android.content.pm.ActivityInfo
 */
- (void)setChangingConfigurationsWithInt:(jint)configs;

/*!
 @brief Sets the duration of the animation.
 @param duration The length of the animation, in milliseconds.
 */
- (ADAnimator *)setDurationWithLong:(jlong)duration;

/*!
 @brief The time interpolator used in calculating the elapsed fraction of the
  animation.The interpolator determines whether the animation runs with
  linear or non-linear motion, such as acceleration and deceleration.
 The
  default value is <code>r.android.view.animation.AccelerateDecelerateInterpolator</code>.
 @param value the interpolator to be used by this animation
 */
- (void)setInterpolatorWithADTimeInterpolator:(id<ADTimeInterpolator>)value;

/*!
 @brief The amount of time, in milliseconds, to delay processing the animation
  after <code>start()</code> is called.
 @param startDelay The amount of the delay, in milliseconds
 */
- (void)setStartDelayWithLong:(jlong)startDelay;

/*!
 @brief Sets the target object whose property will be animated by this animation.Not all subclasses
  operate on target objects (for example, <code>ValueAnimator</code>, but this method
  is on the superclass for the convenience of dealing generically with those subclasses
  that do handle targets.
 <p>
  <strong>Note:</strong> The target is stored as a weak reference internally to avoid leaking
  resources by having animators directly reference old targets. Therefore, you should
  ensure that animator targets always have a hard reference elsewhere.
 @param target The object being animated
 */
- (void)setTargetWithId:(id)target;

/*!
 @brief This method tells the object to use appropriate information to extract
  ending values for the animation.For example, a AnimatorSet object will pass
  this call to its child objects to tell them to set up the values.
 A
  ObjectAnimator object will use the information it has about its target object
  and PropertyValuesHolder objects to get the start values for its properties.
  A ValueAnimator object will ignore the request since it does not have enough
  information (such as a target object) to gather these values.
 */
- (void)setupEndValues;

/*!
 @brief This method tells the object to use appropriate information to extract
  starting values for the animation.For example, a AnimatorSet object will pass
  this call to its child objects to tell them to set up the values.
 A
  ObjectAnimator object will use the information it has about its target object
  and PropertyValuesHolder objects to get the start values for its properties.
  A ValueAnimator object will ignore the request since it does not have enough
  information (such as a target object) to gather these values.
 */
- (void)setupStartValues;

/*!
 @brief Starts this animation.If the animation has a nonzero startDelay, the animation will start
  running after that delay elapses.
 A non-delayed animation will have its initial
  value(s) set immediately, followed by calls to 
 <code>AnimatorListener.onAnimationStart(Animator)</code> for any listeners of this animator. 
 <p>The animation started by calling this method will be run on the thread that called
  this method. This thread should have a Looper on it (a runtime exception will be thrown if
  this is not the case). Also, if the animation will animate
  properties of objects in the view hierarchy, then the calling thread should be the UI
  thread for that view hierarchy.</p>
 */
- (void)start;

#pragma mark Package-Private

/*!
 @brief Internal use only.This animates any animation that has ended since lastPlayTime.
 If an animation hasn't been finished, no change will be made.
 */
- (void)animateSkipToEndsWithLong:(jlong)currentPlayTime
                         withLong:(jlong)lastPlayTime;

/*!
 @brief Internal use only.Changes the value of the animator as if currentPlayTime has passed since
  the start of the animation.
 Therefore, currentPlayTime includes the start delay, and any
  repetition. lastPlayTime is similar and is used to calculate how many repeats have been
  done between the two times.
 */
- (void)animateValuesInRangeWithLong:(jlong)currentPlayTime
                            withLong:(jlong)lastPlayTime;

/*!
 @brief Calls <code>call</code> for every item in <code>list</code> with <code>animator</code> and 
 <code>isReverse</code> as parameters.
 @param list The list of items to make calls on.
 @param call The method to call for each item in list.
 @param animator The animator parameter of call.
 @param isReverse The isReverse parameter of call.
 */
- (void)callOnListWithJavaUtilArrayList:(JavaUtilArrayList *)list
          withADAnimator_AnimatorCaller:(id<ADAnimator_AnimatorCaller>)call
                                 withId:(id)animator
                            withBoolean:(jboolean)isReverse;

/*!
 @brief Internal use only.Adds all start times (after delay) to and end times to times.
 The value must include offset.
 */
- (void)getStartAndEndTimesWithADLongArray:(ADLongArray *)times
                                  withLong:(jlong)offset;

/*!
 @brief Internal use only.
 Returns whether the animation has start/end values setup. For most of the animations, this
  should always be true. For ObjectAnimators, the start values are setup in the initialization
  of the animation.
 */
- (jboolean)isInitialized;

- (void)notifyEndListenersWithBoolean:(jboolean)isReversing;

/*!
 @brief Calls notification for each AnimatorListener.
 @param notification The notification method to call on each listener.
 @param isReverse When this is used with start/end, this is the isReverse parameter. For                   other calls, this is ignored.
 */
- (void)notifyListenersWithADAnimator_AnimatorCaller:(id<ADAnimator_AnimatorCaller>)notification
                                         withBoolean:(jboolean)isReverse;

/*!
 @brief Call pause/resume on each AnimatorPauseListener.
 @param notification Either ON_PAUSE or ON_RESUME to call onPause or onResume on each                      listener.
 */
- (void)notifyPauseListenersWithADAnimator_AnimatorCaller:(id<ADAnimator_AnimatorCaller>)notification;

- (void)notifyStartListenersWithBoolean:(jboolean)isReversing;

- (jboolean)pulseAnimationFrameWithLong:(jlong)frameTime;

/*!
 @brief Internal use only.
 Skips the animation value to end/start, depending on whether the play direction is forward
  or backward.
 @param inReverse whether the end value is based on a reverse direction. If yes, this is                   equivalent to skip to start value in a forward playing direction.
 */
- (void)skipToEndValueWithBoolean:(jboolean)inReverse;

/*!
 @brief Internal use only.
 This call starts the animation in regular or reverse direction without requiring them to
  register frame callbacks. The caller will be responsible for all the subsequent animation
  pulses. Specifically, the caller needs to call doAnimationFrame(...) for the animation on
  every frame.
 @param inReverse whether the animation should play in reverse direction
 */
- (void)startWithoutPulsingWithBoolean:(jboolean)inReverse;

@end

J2OBJC_EMPTY_STATIC_INIT(ADAnimator)

J2OBJC_FIELD_SETTER(ADAnimator, mListeners_, JavaUtilArrayList *)
J2OBJC_FIELD_SETTER(ADAnimator, mPauseListeners_, JavaUtilArrayList *)

/*!
 @brief The value used to indicate infinite duration (e.g.when Animators repeat infinitely).
 */
inline jlong ADAnimator_get_DURATION_INFINITE(void);
#define ADAnimator_DURATION_INFINITE -1LL
J2OBJC_STATIC_FIELD_CONSTANT(ADAnimator, DURATION_INFINITE, jlong)

FOUNDATION_EXPORT void ADAnimator_init(ADAnimator *self);

FOUNDATION_EXPORT void ADAnimator_setBackgroundPauseDelayWithLong_(jlong value);

FOUNDATION_EXPORT jlong ADAnimator_getBackgroundPauseDelay(void);

FOUNDATION_EXPORT void ADAnimator_setAnimatorPausingEnabledWithBoolean_(jboolean enable);

J2OBJC_TYPE_LITERAL_HEADER(ADAnimator)

@compatibility_alias RAndroidAnimationAnimator ADAnimator;

#endif

#if !defined (ADAnimator_AnimatorListener_) && (INCLUDE_ALL_Animator || defined(INCLUDE_ADAnimator_AnimatorListener))
#define ADAnimator_AnimatorListener_

@class ADAnimator;

/*!
 @brief <p>An animation listener receives notifications from an animation.
 Notifications indicate animation related events, such as the end or the
  repetition of the animation.</p>
 */
@protocol ADAnimator_AnimatorListener < JavaObject >

/*!
 @brief <p>Notifies the start of the animation as well as the animation's overall play direction.
 This method's default behavior is to call <code>onAnimationStart(Animator)</code>. This
  method can be overridden, though not required, to get the additional play direction info
  when an animation starts. Skipping calling super when overriding this method results in 
 <code>onAnimationStart(Animator)</code> not getting called.
 @param animation The started animation.
 @param isReverse Whether the animation is playing in reverse.
 */
- (void)onAnimationStartWithADAnimator:(ADAnimator *)animation
                           withBoolean:(jboolean)isReverse;

/*!
 @brief <p>Notifies the end of the animation.
 This callback is not invoked
  for animations with repeat count set to INFINITE.</p>
  
 <p>This method's default behavior is to call <code>onAnimationEnd(Animator)</code>. This
  method can be overridden, though not required, to get the additional play direction info
  when an animation ends. Skipping calling super when overriding this method results in 
 <code>onAnimationEnd(Animator)</code> not getting called.
 @param animation The animation which reached its end.
 @param isReverse Whether the animation is playing in reverse.
 */
- (void)onAnimationEndWithADAnimator:(ADAnimator *)animation
                         withBoolean:(jboolean)isReverse;

/*!
 @brief <p>Notifies the start of the animation.
 </p>
 @param animation The started animation.
 */
- (void)onAnimationStartWithADAnimator:(ADAnimator *)animation;

/*!
 @brief <p>Notifies the end of the animation.
 This callback is not invoked
  for animations with repeat count set to INFINITE.</p>
 @param animation The animation which reached its end.
 */
- (void)onAnimationEndWithADAnimator:(ADAnimator *)animation;

/*!
 @brief <p>Notifies the cancellation of the animation.
 This callback is not invoked
  for animations with repeat count set to INFINITE.</p>
 @param animation The animation which was canceled.
 */
- (void)onAnimationCancelWithADAnimator:(ADAnimator *)animation;

/*!
 @brief <p>Notifies the repetition of the animation.
 </p>
 @param animation The animation which was repeated.
 */
- (void)onAnimationRepeatWithADAnimator:(ADAnimator *)animation;

@end

J2OBJC_EMPTY_STATIC_INIT(ADAnimator_AnimatorListener)

FOUNDATION_EXPORT void ADAnimator_AnimatorListener_onAnimationStartWithADAnimator_withBoolean_(id<ADAnimator_AnimatorListener> self, ADAnimator *animation, jboolean isReverse);

FOUNDATION_EXPORT void ADAnimator_AnimatorListener_onAnimationEndWithADAnimator_withBoolean_(id<ADAnimator_AnimatorListener> self, ADAnimator *animation, jboolean isReverse);

J2OBJC_TYPE_LITERAL_HEADER(ADAnimator_AnimatorListener)

#endif

#if !defined (ADAnimator_AnimatorPauseListener_) && (INCLUDE_ALL_Animator || defined(INCLUDE_ADAnimator_AnimatorPauseListener))
#define ADAnimator_AnimatorPauseListener_

@class ADAnimator;

/*!
 @brief A pause listener receives notifications from an animation when the
  animation is <code>paused</code> or <code>resumed</code>.
 - seealso: #addPauseListener(AnimatorPauseListener)
 */
@protocol ADAnimator_AnimatorPauseListener < JavaObject >

/*!
 @brief <p>Notifies that the animation was paused.
 </p>
 @param animation The animaton being paused.
 - seealso: #pause()
 */
- (void)onAnimationPauseWithADAnimator:(ADAnimator *)animation;

/*!
 @brief <p>Notifies that the animation was resumed, after being
  previously paused.
 </p>
 @param animation The animation being resumed.
 - seealso: #resume()
 */
- (void)onAnimationResumeWithADAnimator:(ADAnimator *)animation;

@end

J2OBJC_EMPTY_STATIC_INIT(ADAnimator_AnimatorPauseListener)

J2OBJC_TYPE_LITERAL_HEADER(ADAnimator_AnimatorPauseListener)

#endif

#if !defined (ADAnimator_AnimatorCaller_) && (INCLUDE_ALL_Animator || defined(INCLUDE_ADAnimator_AnimatorCaller))
#define ADAnimator_AnimatorCaller_

/*!
 @brief Internally used by <code>callOnList(ArrayList, AnimatorCaller, Object, boolean)</code> to
  make a call on all children of a list.This can be for start, stop, pause, cancel, update,
  etc notifications.
 */
@protocol ADAnimator_AnimatorCaller < JavaObject >

- (void)callWithId:(id)listener
            withId:(id)animator
       withBoolean:(jboolean)isReverse;

@end

@interface ADAnimator_AnimatorCaller : NSObject

@end

J2OBJC_STATIC_INIT(ADAnimator_AnimatorCaller)

inline id<ADAnimator_AnimatorCaller> ADAnimator_AnimatorCaller_get_ON_START(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT id<ADAnimator_AnimatorCaller> ADAnimator_AnimatorCaller_ON_START;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ADAnimator_AnimatorCaller, ON_START, id<ADAnimator_AnimatorCaller>)

inline id<ADAnimator_AnimatorCaller> ADAnimator_AnimatorCaller_get_ON_END(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT id<ADAnimator_AnimatorCaller> ADAnimator_AnimatorCaller_ON_END;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ADAnimator_AnimatorCaller, ON_END, id<ADAnimator_AnimatorCaller>)

inline id<ADAnimator_AnimatorCaller> ADAnimator_AnimatorCaller_get_ON_CANCEL(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT id<ADAnimator_AnimatorCaller> ADAnimator_AnimatorCaller_ON_CANCEL;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ADAnimator_AnimatorCaller, ON_CANCEL, id<ADAnimator_AnimatorCaller>)

inline id<ADAnimator_AnimatorCaller> ADAnimator_AnimatorCaller_get_ON_REPEAT(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT id<ADAnimator_AnimatorCaller> ADAnimator_AnimatorCaller_ON_REPEAT;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ADAnimator_AnimatorCaller, ON_REPEAT, id<ADAnimator_AnimatorCaller>)

inline id<ADAnimator_AnimatorCaller> ADAnimator_AnimatorCaller_get_ON_PAUSE(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT id<ADAnimator_AnimatorCaller> ADAnimator_AnimatorCaller_ON_PAUSE;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ADAnimator_AnimatorCaller, ON_PAUSE, id<ADAnimator_AnimatorCaller>)

inline id<ADAnimator_AnimatorCaller> ADAnimator_AnimatorCaller_get_ON_RESUME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT id<ADAnimator_AnimatorCaller> ADAnimator_AnimatorCaller_ON_RESUME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ADAnimator_AnimatorCaller, ON_RESUME, id<ADAnimator_AnimatorCaller>)

inline id<ADAnimator_AnimatorCaller> ADAnimator_AnimatorCaller_get_ON_UPDATE(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT id<ADAnimator_AnimatorCaller> ADAnimator_AnimatorCaller_ON_UPDATE;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ADAnimator_AnimatorCaller, ON_UPDATE, id<ADAnimator_AnimatorCaller>)

J2OBJC_TYPE_LITERAL_HEADER(ADAnimator_AnimatorCaller)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_Animator")
