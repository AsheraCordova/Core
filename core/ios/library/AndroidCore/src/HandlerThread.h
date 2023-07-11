//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\os\HandlerThread.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_HandlerThread")
#ifdef RESTRICT_HandlerThread
#define INCLUDE_ALL_HandlerThread 0
#else
#define INCLUDE_ALL_HandlerThread 1
#endif
#undef RESTRICT_HandlerThread

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (ADHandlerThread_) && (INCLUDE_ALL_HandlerThread || defined(INCLUDE_ADHandlerThread))
#define ADHandlerThread_

#define RESTRICT_JavaLangThread 1
#define INCLUDE_JavaLangThread 1
#include "java/lang/Thread.h"

@class ADHandler;
@class ADLooper;
@class JavaLangThreadGroup;
@protocol JavaLangRunnable;

/*!
 @brief A <code>Thread</code> that has a <code>Looper</code>.
 The <code>Looper</code> can then be used to create <code>Handler</code>s.
  <p>
  Note that just like with a regular <code>Thread</code>, <code>start()</code> must still be called.
 */
@interface ADHandlerThread : JavaLangThread {
 @public
  jint mPriority_;
  jint mTid_;
  ADLooper *mLooper_;
}

#pragma mark Public

- (instancetype)initWithNSString:(NSString *)name;

/*!
 @brief Constructs a HandlerThread.
 @param name
 @param priority The priority to run the thread at. The value supplied must be from   
 <code>r.android.os.Process</code>  and not from java.lang.Thread.
 */
- (instancetype)initWithNSString:(NSString *)name
                         withInt:(jint)priority;

/*!
 @brief This method returns the Looper associated with this thread.If this thread not been started
  or for any reason isAlive() returns false, this method will return null.
 If this thread
  has been started, this method will block until the looper has been initialized.
 @return The looper.
 */
- (ADLooper *)getLooper;

/*!
 @return a shared <code>Handler</code> associated with this thread
 */
- (ADHandler *)getThreadHandler;

/*!
 @brief Returns the identifier of this thread.See 100.
 */
- (jint)getThreadId;

/*!
 @brief Quits the handler thread's looper.
 <p>
  Causes the handler thread's looper to terminate without processing any
  more messages in the message queue. 
 </p><p>
  Any attempt to post messages to the queue after the looper is asked to quit will fail.
  For example, the <code>Handler.sendMessage(Message)</code> method will return false. 
 </p><p class="note">
  Using this method may be unsafe because some messages may not be delivered
  before the looper terminates.  Consider using <code>quitSafely</code> instead to ensure
  that all pending work is completed in an orderly manner. 
 </p>
 @return True if the looper looper has been asked to quit or false if the
  thread had not yet started running.
 - seealso: #quitSafely
 */
- (jboolean)quit;

/*!
 @brief Quits the handler thread's looper safely.
 <p>
  Causes the handler thread's looper to terminate as soon as all remaining messages
  in the message queue that are already due to be delivered have been handled.
  Pending delayed messages with due times in the future will not be delivered. 
 </p><p>
  Any attempt to post messages to the queue after the looper is asked to quit will fail.
  For example, the <code>Handler.sendMessage(Message)</code> method will return false. 
 </p><p>
  If the thread has not been started or has finished (that is if 
 <code>getLooper</code> returns null), then false is returned.
  Otherwise the looper is asked to quit and true is returned. 
 </p>
 @return True if the looper looper has been asked to quit or false if the
  thread had not yet started running.
 */
- (jboolean)quitSafely;

- (void)run;

#pragma mark Protected

/*!
 @brief Call back method that can be explicitly overridden if needed to execute some
  setup before Looper loops.
 */
- (void)onLooperPrepared;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

- (instancetype)initWithJavaLangRunnable:(id<JavaLangRunnable>)arg0 NS_UNAVAILABLE;

- (instancetype)initWithJavaLangRunnable:(id<JavaLangRunnable>)arg0
                            withNSString:(NSString *)arg1 NS_UNAVAILABLE;

- (instancetype)initWithJavaLangThreadGroup:(JavaLangThreadGroup *)arg0
                       withJavaLangRunnable:(id<JavaLangRunnable>)arg1 NS_UNAVAILABLE;

- (instancetype)initWithJavaLangThreadGroup:(JavaLangThreadGroup *)arg0
                       withJavaLangRunnable:(id<JavaLangRunnable>)arg1
                               withNSString:(NSString *)arg2 NS_UNAVAILABLE;

- (instancetype)initWithJavaLangThreadGroup:(JavaLangThreadGroup *)arg0
                       withJavaLangRunnable:(id<JavaLangRunnable>)arg1
                               withNSString:(NSString *)arg2
                                   withLong:(jlong)arg3 NS_UNAVAILABLE;

- (instancetype)initWithJavaLangThreadGroup:(JavaLangThreadGroup *)arg0
                               withNSString:(NSString *)arg1 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADHandlerThread)

J2OBJC_FIELD_SETTER(ADHandlerThread, mLooper_, ADLooper *)

FOUNDATION_EXPORT void ADHandlerThread_initWithNSString_(ADHandlerThread *self, NSString *name);

FOUNDATION_EXPORT ADHandlerThread *new_ADHandlerThread_initWithNSString_(NSString *name) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADHandlerThread *create_ADHandlerThread_initWithNSString_(NSString *name);

FOUNDATION_EXPORT void ADHandlerThread_initWithNSString_withInt_(ADHandlerThread *self, NSString *name, jint priority);

FOUNDATION_EXPORT ADHandlerThread *new_ADHandlerThread_initWithNSString_withInt_(NSString *name, jint priority) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADHandlerThread *create_ADHandlerThread_initWithNSString_withInt_(NSString *name, jint priority);

J2OBJC_TYPE_LITERAL_HEADER(ADHandlerThread)

@compatibility_alias RAndroidOsHandlerThread ADHandlerThread;

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_HandlerThread")
