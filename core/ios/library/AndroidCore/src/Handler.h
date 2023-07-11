//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\os\Handler.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_Handler")
#ifdef RESTRICT_Handler
#define INCLUDE_ALL_Handler 0
#else
#define INCLUDE_ALL_Handler 1
#endif
#undef RESTRICT_Handler

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (ADHandler_) && (INCLUDE_ALL_Handler || defined(INCLUDE_ADHandler))
#define ADHandler_

@class ADLooper;
@class ADMessage;
@class ADMessageQueue;
@protocol ADHandler_Callback;
@protocol ADIMessenger;
@protocol JavaLangRunnable;

/*!
 @brief A Handler allows you to send and process <code>Message</code> and Runnable
  objects associated with a thread's <code>MessageQueue</code>.Each Handler
  instance is associated with a single thread and that thread's message
  queue.
 When you create a new Handler it is bound to a <code>Looper</code>.
  It will deliver messages and runnables to that Looper's message
  queue and execute them on that Looper's thread. 
 <p>There are two main uses for a Handler: (1) to schedule messages and
  runnables to be executed at some point in the future; and (2) to enqueue
  an action to be performed on a different thread than your own. 
 <p>Scheduling messages is accomplished with the 
 <code>post</code>, <code>postAtTime(Runnable, long)</code>,
  <code>postDelayed</code>, <code>sendEmptyMessage</code>,
  <code>sendMessage</code>, <code>sendMessageAtTime</code>, and 
 <code>sendMessageDelayed</code> methods.  The <em>post</em> versions allow
  you to enqueue Runnable objects to be called by the message queue when
  they are received; the <em>sendMessage</em> versions allow you to enqueue
  a <code>Message</code> object containing a bundle of data that will be
  processed by the Handler's <code>handleMessage</code> method (requiring that
  you implement a subclass of Handler).  
 <p>When posting or sending to a Handler, you can either
  allow the item to be processed as soon as the message queue is ready
  to do so, or specify a delay before it gets processed or absolute time for
  it to be processed.  The latter two allow you to implement timeouts,
  ticks, and other timing-based behavior.  
 <p>When a
  process is created for your application, its main thread is dedicated to
  running a message queue that takes care of managing the top-level
  application objects (activities, broadcast receivers, etc) and any windows
  they create.  You can create your own threads, and communicate back with
  the main application thread through a Handler.  This is done by calling
  the same <em>post</em> or <em>sendMessage</em> methods as before, but from
  your new thread.  The given Runnable or Message will then be scheduled
  in the Handler's message queue and processed when appropriate.
 */
@interface ADHandler : NSObject {
 @public
  ADLooper *mLooper_;
  ADMessageQueue *mQueue_;
  id<ADHandler_Callback> mCallback_;
  jboolean mAsynchronous_;
  id<ADIMessenger> mMessenger_;
}

#pragma mark Public

/*!
 @brief Default constructor associates this handler with the <code>Looper</code> for the
  current thread.
 If this thread does not have a looper, this handler won't be able to receive messages
  so an exception is thrown.
 */
- (instancetype)init;

/*!
 @brief Use the <code>Looper</code> for the current thread
  and set whether the handler should be asynchronous.
 Handlers are synchronous by default unless this constructor is used to make
  one that is strictly asynchronous.
  Asynchronous messages represent interrupts or events that do not require global ordering
  with respect to synchronous messages.  Asynchronous messages are not subject to
  the synchronization barriers introduced by <code>MessageQueue.enqueueSyncBarrier(long)</code>.
 @param async If true, the handler calls <code>Message.setAsynchronous(boolean)</code>  for
   each <code>Message</code>  that is sent to it or <code>Runnable</code>  that is posted to it.
 */
- (instancetype)initWithBoolean:(jboolean)async;

/*!
 @brief Constructor associates this handler with the <code>Looper</code> for the
  current thread and takes a callback interface in which you can handle
  messages.
 If this thread does not have a looper, this handler won't be able to receive messages
  so an exception is thrown.
 @param callback The callback interface in which to handle messages, or null.
 */
- (instancetype)initWithADHandler_Callback:(id<ADHandler_Callback>)callback;

/*!
 @brief Use the <code>Looper</code> for the current thread with the specified callback interface
  and set whether the handler should be asynchronous.
 Handlers are synchronous by default unless this constructor is used to make
  one that is strictly asynchronous.
  Asynchronous messages represent interrupts or events that do not require global ordering
  with respect to synchronous messages.  Asynchronous messages are not subject to
  the synchronization barriers introduced by <code>MessageQueue.enqueueSyncBarrier(long)</code>.
 @param callback The callback interface in which to handle messages, or null.
 @param async If true, the handler calls <code>Message.setAsynchronous(boolean)</code>  for
   each <code>Message</code>  that is sent to it or <code>Runnable</code>  that is posted to it.
 */
- (instancetype)initWithADHandler_Callback:(id<ADHandler_Callback>)callback
                               withBoolean:(jboolean)async;

/*!
 @brief Use the provided <code>Looper</code> instead of the default one.
 @param looper The looper, must not be null.
 */
- (instancetype)initWithADLooper:(ADLooper *)looper;

/*!
 @brief Use the provided <code>Looper</code> instead of the default one and take a callback
  interface in which to handle messages.
 @param looper The looper, must not be null.
 @param callback The callback interface in which to handle messages, or null.
 */
- (instancetype)initWithADLooper:(ADLooper *)looper
          withADHandler_Callback:(id<ADHandler_Callback>)callback;

/*!
 @brief Use the provided <code>Looper</code> instead of the default one and take a callback
  interface in which to handle messages.Also set whether the handler
  should be asynchronous.
 Handlers are synchronous by default unless this constructor is used to make
  one that is strictly asynchronous.
  Asynchronous messages represent interrupts or events that do not require global ordering
  with respect to synchronous messages.  Asynchronous messages are not subject to
  the synchronization barriers introduced by conditions such as display vsync.
 @param looper The looper, must not be null.
 @param callback The callback interface in which to handle messages, or null.
 @param async If true, the handler calls <code>Message.setAsynchronous(boolean)</code>  for
   each <code>Message</code>  that is sent to it or <code>Runnable</code>  that is posted to it.
 */
- (instancetype)initWithADLooper:(ADLooper *)looper
          withADHandler_Callback:(id<ADHandler_Callback>)callback
                     withBoolean:(jboolean)async;

/*!
 @brief Create a new Handler whose posted messages and runnables are not subject to
  synchronization barriers such as display vsync.
 <p>Messages sent to an async handler are guaranteed to be ordered with respect to one another,
  but not necessarily with respect to messages from other Handlers.</p>
 - seealso: #createAsync(Looper, Callback)to create an async Handler with custom message handling.
 @param looper the Looper that the new Handler should be bound to
 @return a new async Handler instance
 */
+ (ADHandler *)createAsyncWithADLooper:(ADLooper *)looper;

/*!
 @brief Create a new Handler whose posted messages and runnables are not subject to
  synchronization barriers such as display vsync.
 <p>Messages sent to an async handler are guaranteed to be ordered with respect to one another,
  but not necessarily with respect to messages from other Handlers.</p>
 - seealso: #createAsync(Looper)to create an async Handler without custom message handling.
 @param looper the Looper that the new Handler should be bound to
 @return a new async Handler instance
 */
+ (ADHandler *)createAsyncWithADLooper:(ADLooper *)looper
                withADHandler_Callback:(id<ADHandler_Callback>)callback;

/*!
 @brief Handle system messages here.
 */
- (void)dispatchMessageWithADMessage:(ADMessage *)msg;

/*!
 @brief Executes the message synchronously if called on the same thread this handler corresponds to,
  or <code>pushes it to the queue</code> otherwise
 @return Returns true if the message was successfully ran or placed in to the
          message queue.  Returns false on failure, usually because the
          looper processing the message queue is exiting.
 */
- (jboolean)executeOrSendMessageWithADMessage:(ADMessage *)msg;

- (ADLooper *)getLooper;

/*!
 */
+ (ADHandler *)getMain;

/*!
 @brief Returns a string representing the name of the specified message.
 The default implementation will either return the class name of the
  message callback if any, or the hexadecimal representation of the
  message "what" field.
 @param message The message whose name is being queried
 */
- (NSString *)getMessageNameWithADMessage:(ADMessage *)message;

/*!
 */
- (NSString *)getTraceNameWithADMessage:(ADMessage *)message;

/*!
 @brief Subclasses must implement this to receive messages.
 */
- (void)handleMessageWithADMessage:(ADMessage *)msg;

/*!
 @brief Check if there are any pending posts of messages with callback r in
  the message queue.
 */
- (jboolean)hasCallbacksWithJavaLangRunnable:(id<JavaLangRunnable>)r;

/*!
 @brief Check if there are any pending posts of messages with code 'what' and
  whose obj is 'object' in the message queue.
 */
- (jboolean)hasEqualMessagesWithInt:(jint)what
                             withId:(id)object;

/*!
 @brief Check if there are any pending posts of messages with code 'what' in
  the message queue.
 */
- (jboolean)hasMessagesWithInt:(jint)what;

/*!
 @brief Check if there are any pending posts of messages with code 'what' and
  whose obj is 'object' in the message queue.
 */
- (jboolean)hasMessagesWithInt:(jint)what
                        withId:(id)object;

/*!
 @brief Return whether there are any messages or callbacks currently scheduled on this handler.
 */
- (jboolean)hasMessagesOrCallbacks;

/*!
 */
+ (ADHandler *)mainIfNullWithADHandler:(ADHandler *)handler;

/*!
 @brief Returns a new <code>Message</code> from the global message pool.More efficient than
  creating and allocating new instances.
 The retrieved message has its handler set to this instance (Message.target == this).
   If you don't want that facility, just call Message.obtain() instead.
 */
- (ADMessage *)obtainMessage;

/*!
 @brief Same as <code>obtainMessage()</code>, except that it also sets the what member of the returned Message.
 @param what Value to assign to the returned Message.what field.
 @return A Message from the global message pool.
 */
- (ADMessage *)obtainMessageWithInt:(jint)what;

/*!
 @brief Same as <code>obtainMessage()</code>, except that it also sets the what, arg1 and arg2 members of the returned
  Message.
 @param what Value to assign to the returned Message.what field.
 @param arg1 Value to assign to the returned Message.arg1 field.
 @param arg2 Value to assign to the returned Message.arg2 field.
 @return A Message from the global message pool.
 */
- (ADMessage *)obtainMessageWithInt:(jint)what
                            withInt:(jint)arg1
                            withInt:(jint)arg2;

/*!
 @brief Same as <code>obtainMessage()</code>, except that it also sets the what, obj, arg1,and arg2 values on the 
  returned Message.
 @param what Value to assign to the returned Message.what field.
 @param arg1 Value to assign to the returned Message.arg1 field.
 @param arg2 Value to assign to the returned Message.arg2 field.
 @param obj Value to assign to the returned Message.obj field.
 @return A Message from the global message pool.
 */
- (ADMessage *)obtainMessageWithInt:(jint)what
                            withInt:(jint)arg1
                            withInt:(jint)arg2
                             withId:(id)obj;

/*!
 @brief Same as <code>obtainMessage()</code>, except that it also sets the what and obj members 
  of the returned Message.
 @param what Value to assign to the returned Message.what field.
 @param obj Value to assign to the returned Message.obj field.
 @return A Message from the global message pool.
 */
- (ADMessage *)obtainMessageWithInt:(jint)what
                             withId:(id)obj;

/*!
 @brief Causes the Runnable r to be added to the message queue.
 The runnable will be run on the thread to which this handler is 
  attached.
 @param r The Runnable that will be executed.
 @return Returns true if the Runnable was successfully placed in to the 
          message queue.  Returns false on failure, usually because the
          looper processing the message queue is exiting.
 */
- (jboolean)postWithJavaLangRunnable:(id<JavaLangRunnable>)r;

/*!
 @brief Posts a message to an object that implements Runnable.
 Causes the Runnable r to executed on the next iteration through the
  message queue. The runnable will be run on the thread to which this
  handler is attached. 
 <b>This method is only for use in very special circumstances -- it
  can easily starve the message queue, cause ordering problems, or have
  other unexpected side-effects.</b>
 @param r The Runnable that will be executed.
 @return Returns true if the message was successfully placed in to the 
          message queue.  Returns false on failure, usually because the
          looper processing the message queue is exiting.
 */
- (jboolean)postAtFrontOfQueueWithJavaLangRunnable:(id<JavaLangRunnable>)r;

/*!
 @brief Causes the Runnable r to be added to the message queue, to be run
  at a specific time given by <var>uptimeMillis</var>.
 <b>The time-base is <code>r.android.os.SystemClock.uptimeMillis</code>.</b>
  Time spent in deep sleep will add an additional delay to execution.
  The runnable will be run on the thread to which this handler is attached.
 @param r The Runnable that will be executed.
 @param uptimeMillis The absolute time at which the callback should run,          using the 
 <code>r.android.os.SystemClock.uptimeMillis</code>  time-base.
 @return Returns true if the Runnable was successfully placed in to the 
          message queue.  Returns false on failure, usually because the
          looper processing the message queue is exiting.  Note that a
          result of true does not mean the Runnable will be processed -- if
          the looper is quit before the delivery time of the message
          occurs then the message will be dropped.
 */
- (jboolean)postAtTimeWithJavaLangRunnable:(id<JavaLangRunnable>)r
                                  withLong:(jlong)uptimeMillis;

/*!
 @brief Causes the Runnable r to be added to the message queue, to be run
  at a specific time given by <var>uptimeMillis</var>.
 <b>The time-base is <code>r.android.os.SystemClock.uptimeMillis</code>.</b>
  Time spent in deep sleep will add an additional delay to execution.
  The runnable will be run on the thread to which this handler is attached.
 @param r The Runnable that will be executed.
 @param token An instance which can be used to cancel <code>r</code>  via
           <code>removeCallbacksAndMessages</code> .
 @param uptimeMillis The absolute time at which the callback should run,          using the 
 <code>r.android.os.SystemClock.uptimeMillis</code>  time-base.
 @return Returns true if the Runnable was successfully placed in to the 
          message queue.  Returns false on failure, usually because the
          looper processing the message queue is exiting.  Note that a
          result of true does not mean the Runnable will be processed -- if
          the looper is quit before the delivery time of the message
          occurs then the message will be dropped.
 - seealso: r.android.os.SystemClock#uptimeMillis
 */
- (jboolean)postAtTimeWithJavaLangRunnable:(id<JavaLangRunnable>)r
                                    withId:(id)token
                                  withLong:(jlong)uptimeMillis;

/*!
 */
- (jboolean)postDelayedWithJavaLangRunnable:(id<JavaLangRunnable>)r
                                    withInt:(jint)what
                                   withLong:(jlong)delayMillis;

/*!
 @brief Causes the Runnable r to be added to the message queue, to be run
  after the specified amount of time elapses.
 The runnable will be run on the thread to which this handler
  is attached. 
 <b>The time-base is <code>r.android.os.SystemClock.uptimeMillis</code>.</b>
  Time spent in deep sleep will add an additional delay to execution.
 @param r The Runnable that will be executed.
 @param delayMillis The delay (in milliseconds) until the Runnable         will be executed.
 @return Returns true if the Runnable was successfully placed in to the 
          message queue.  Returns false on failure, usually because the
          looper processing the message queue is exiting.  Note that a
          result of true does not mean the Runnable will be processed --
          if the looper is quit before the delivery time of the message
          occurs then the message will be dropped.
 */
- (jboolean)postDelayedWithJavaLangRunnable:(id<JavaLangRunnable>)r
                                   withLong:(jlong)delayMillis;

/*!
 @brief Causes the Runnable r to be added to the message queue, to be run
  after the specified amount of time elapses.
 The runnable will be run on the thread to which this handler
  is attached. 
 <b>The time-base is <code>r.android.os.SystemClock.uptimeMillis</code>.</b>
  Time spent in deep sleep will add an additional delay to execution.
 @param r The Runnable that will be executed.
 @param token An instance which can be used to cancel <code>r</code>  via
           <code>removeCallbacksAndMessages</code> .
 @param delayMillis The delay (in milliseconds) until the Runnable         will be executed.
 @return Returns true if the Runnable was successfully placed in to the
          message queue.  Returns false on failure, usually because the
          looper processing the message queue is exiting.  Note that a
          result of true does not mean the Runnable will be processed --
          if the looper is quit before the delivery time of the message
          occurs then the message will be dropped.
 */
- (jboolean)postDelayedWithJavaLangRunnable:(id<JavaLangRunnable>)r
                                     withId:(id)token
                                   withLong:(jlong)delayMillis;

/*!
 @brief Remove any pending posts of Runnable r that are in the message queue.
 */
- (void)removeCallbacksWithJavaLangRunnable:(id<JavaLangRunnable>)r;

/*!
 @brief Remove any pending posts of Runnable <var>r</var> with Object 
 <var>token</var> that are in the message queue.If <var>token</var> is null,
  all callbacks will be removed.
 */
- (void)removeCallbacksWithJavaLangRunnable:(id<JavaLangRunnable>)r
                                     withId:(id)token;

/*!
 @brief Remove any pending posts of callbacks and sent messages whose 
 <var>obj</var> is <var>token</var>.If <var>token</var> is null,
  all callbacks and messages will be removed.
 */
- (void)removeCallbacksAndEqualMessagesWithId:(id)token;

/*!
 @brief Remove any pending posts of callbacks and sent messages whose 
 <var>obj</var> is <var>token</var>.If <var>token</var> is null,
  all callbacks and messages will be removed.
 */
- (void)removeCallbacksAndMessagesWithId:(id)token;

/*!
 @brief Remove any pending posts of messages with code 'what' and whose obj is
  'object' that are in the message queue.If <var>object</var> is null,
  all messages will be removed.
 <p>
  Similar to <code>removeMessages(int, Object)</code> but uses object equality
  (<code>Object.equals(Object)</code>) instead of reference equality (==) in
  determining whether object is the message's obj'.
 */
- (void)removeEqualMessagesWithInt:(jint)what
                            withId:(id)object;

/*!
 @brief Remove any pending posts of messages with code 'what' that are in the
  message queue.
 */
- (void)removeMessagesWithInt:(jint)what;

/*!
 @brief Remove any pending posts of messages with code 'what' and whose obj is
  'object' that are in the message queue.If <var>object</var> is null,
  all messages will be removed.
 */
- (void)removeMessagesWithInt:(jint)what
                       withId:(id)object;

/*!
 @brief Runs the specified task synchronously.
 <p>
  If the current thread is the same as the handler thread, then the runnable
  runs immediately without being enqueued.  Otherwise, posts the runnable
  to the handler and waits for it to complete before returning. 
 </p><p>
  This method is dangerous!  Improper use can result in deadlocks.
  Never call this method while any locks are held or use it in a
  possibly re-entrant manner. 
 </p><p>
  This method is occasionally useful in situations where a background thread
  must synchronously await completion of a task that must run on the
  handler's thread.  However, this problem is often a symptom of bad design.
  Consider improving the design (if possible) before resorting to this method. 
 </p><p>
  One example of where you might want to use this method is when you just
  set up a Handler thread and need to perform some initialization steps on
  it before continuing execution. 
 </p><p>
  If timeout occurs then this method returns <code>false</code> but the runnable
  will remain posted on the handler and may already be in progress or
  complete at a later time. 
 </p><p>
  When using this method, be sure to use <code>Looper.quitSafely</code> when
  quitting the looper.  Otherwise <code>runWithScissors</code> may hang indefinitely.
  (TODO: We should fix this by making MessageQueue aware of blocking runnables.) 
 </p>
 @param r The Runnable that will be executed synchronously.
 @param timeout The timeout in milliseconds, or 0 to wait indefinitely.
 @return Returns true if the Runnable was successfully executed.
          Returns false on failure, usually because the
          looper processing the message queue is exiting.
 */
- (jboolean)runWithScissorsWithJavaLangRunnable:(id<JavaLangRunnable>)r
                                       withLong:(jlong)timeout;

/*!
 @brief Sends a Message containing only the what value.
 @return Returns true if the message was successfully placed in to the 
          message queue.  Returns false on failure, usually because the
          looper processing the message queue is exiting.
 */
- (jboolean)sendEmptyMessageWithInt:(jint)what;

/*!
 @brief Sends a Message containing only the what value, to be delivered 
  at a specific time.
 - seealso: #sendMessageAtTime(r.android.os.Message, long)
 @return Returns true if the message was successfully placed in to the 
          message queue.  Returns false on failure, usually because the
          looper processing the message queue is exiting.
 */
- (jboolean)sendEmptyMessageAtTimeWithInt:(jint)what
                                 withLong:(jlong)uptimeMillis;

/*!
 @brief Sends a Message containing only the what value, to be delivered
  after the specified amount of time elapses.
 - seealso: #sendMessageDelayed(r.android.os.Message, long)
 @return Returns true if the message was successfully placed in to the 
          message queue.  Returns false on failure, usually because the
          looper processing the message queue is exiting.
 */
- (jboolean)sendEmptyMessageDelayedWithInt:(jint)what
                                  withLong:(jlong)delayMillis;

/*!
 @brief Pushes a message onto the end of the message queue after all pending messages
  before the current time.It will be received in <code>handleMessage</code>,
  in the thread attached to this handler.
 @return Returns true if the message was successfully placed in to the 
          message queue.  Returns false on failure, usually because the
          looper processing the message queue is exiting.
 */
- (jboolean)sendMessageWithADMessage:(ADMessage *)msg;

/*!
 @brief Enqueue a message at the front of the message queue, to be processed on
  the next iteration of the message loop.You will receive it in 
 <code>handleMessage</code>, in the thread attached to this handler.
 <b>This method is only for use in very special circumstances -- it
  can easily starve the message queue, cause ordering problems, or have
  other unexpected side-effects.</b>
 @return Returns true if the message was successfully placed in to the 
          message queue.  Returns false on failure, usually because the
          looper processing the message queue is exiting.
 */
- (jboolean)sendMessageAtFrontOfQueueWithADMessage:(ADMessage *)msg;

/*!
 @brief Enqueue a message into the message queue after all pending messages
  before the absolute time (in milliseconds) <var>uptimeMillis</var>.
 <b>The time-base is <code>r.android.os.SystemClock.uptimeMillis</code>.</b>
  Time spent in deep sleep will add an additional delay to execution.
  You will receive it in <code>handleMessage</code>, in the thread attached
  to this handler.
 @param uptimeMillis The absolute time at which the message should be          delivered, using the
           
 <code>r.android.os.SystemClock.uptimeMillis</code>  time-base.
 @return Returns true if the message was successfully placed in to the 
          message queue.  Returns false on failure, usually because the
          looper processing the message queue is exiting.  Note that a
          result of true does not mean the message will be processed -- if
          the looper is quit before the delivery time of the message
          occurs then the message will be dropped.
 */
- (jboolean)sendMessageAtTimeWithADMessage:(ADMessage *)msg
                                  withLong:(jlong)uptimeMillis;

/*!
 @brief Enqueue a message into the message queue after all pending messages
  before (current time + delayMillis).You will receive it in 
 <code>handleMessage</code>, in the thread attached to this handler.
 @return Returns true if the message was successfully placed in to the 
          message queue.  Returns false on failure, usually because the
          looper processing the message queue is exiting.  Note that a
          result of true does not mean the message will be processed -- if
          the looper is quit before the delivery time of the message
          occurs then the message will be dropped.
 */
- (jboolean)sendMessageDelayedWithADMessage:(ADMessage *)msg
                                   withLong:(jlong)delayMillis;

- (NSString *)description;

#pragma mark Package-Private

- (id<ADIMessenger>)getIMessenger;

@end

J2OBJC_EMPTY_STATIC_INIT(ADHandler)

J2OBJC_FIELD_SETTER(ADHandler, mLooper_, ADLooper *)
J2OBJC_FIELD_SETTER(ADHandler, mQueue_, ADMessageQueue *)
J2OBJC_FIELD_SETTER(ADHandler, mCallback_, id<ADHandler_Callback>)
J2OBJC_FIELD_SETTER(ADHandler, mMessenger_, id<ADIMessenger>)

FOUNDATION_EXPORT void ADHandler_init(ADHandler *self);

FOUNDATION_EXPORT ADHandler *new_ADHandler_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADHandler *create_ADHandler_init(void);

FOUNDATION_EXPORT void ADHandler_initWithADHandler_Callback_(ADHandler *self, id<ADHandler_Callback> callback);

FOUNDATION_EXPORT ADHandler *new_ADHandler_initWithADHandler_Callback_(id<ADHandler_Callback> callback) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADHandler *create_ADHandler_initWithADHandler_Callback_(id<ADHandler_Callback> callback);

FOUNDATION_EXPORT void ADHandler_initWithADLooper_(ADHandler *self, ADLooper *looper);

FOUNDATION_EXPORT ADHandler *new_ADHandler_initWithADLooper_(ADLooper *looper) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADHandler *create_ADHandler_initWithADLooper_(ADLooper *looper);

FOUNDATION_EXPORT void ADHandler_initWithADLooper_withADHandler_Callback_(ADHandler *self, ADLooper *looper, id<ADHandler_Callback> callback);

FOUNDATION_EXPORT ADHandler *new_ADHandler_initWithADLooper_withADHandler_Callback_(ADLooper *looper, id<ADHandler_Callback> callback) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADHandler *create_ADHandler_initWithADLooper_withADHandler_Callback_(ADLooper *looper, id<ADHandler_Callback> callback);

FOUNDATION_EXPORT void ADHandler_initWithBoolean_(ADHandler *self, jboolean async);

FOUNDATION_EXPORT ADHandler *new_ADHandler_initWithBoolean_(jboolean async) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADHandler *create_ADHandler_initWithBoolean_(jboolean async);

FOUNDATION_EXPORT void ADHandler_initWithADHandler_Callback_withBoolean_(ADHandler *self, id<ADHandler_Callback> callback, jboolean async);

FOUNDATION_EXPORT ADHandler *new_ADHandler_initWithADHandler_Callback_withBoolean_(id<ADHandler_Callback> callback, jboolean async) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADHandler *create_ADHandler_initWithADHandler_Callback_withBoolean_(id<ADHandler_Callback> callback, jboolean async);

FOUNDATION_EXPORT void ADHandler_initWithADLooper_withADHandler_Callback_withBoolean_(ADHandler *self, ADLooper *looper, id<ADHandler_Callback> callback, jboolean async);

FOUNDATION_EXPORT ADHandler *new_ADHandler_initWithADLooper_withADHandler_Callback_withBoolean_(ADLooper *looper, id<ADHandler_Callback> callback, jboolean async) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADHandler *create_ADHandler_initWithADLooper_withADHandler_Callback_withBoolean_(ADLooper *looper, id<ADHandler_Callback> callback, jboolean async);

FOUNDATION_EXPORT ADHandler *ADHandler_createAsyncWithADLooper_(ADLooper *looper);

FOUNDATION_EXPORT ADHandler *ADHandler_createAsyncWithADLooper_withADHandler_Callback_(ADLooper *looper, id<ADHandler_Callback> callback);

FOUNDATION_EXPORT ADHandler *ADHandler_getMain(void);

FOUNDATION_EXPORT ADHandler *ADHandler_mainIfNullWithADHandler_(ADHandler *handler);

J2OBJC_TYPE_LITERAL_HEADER(ADHandler)

@compatibility_alias RAndroidOsHandler ADHandler;

#endif

#if !defined (ADHandler_Callback_) && (INCLUDE_ALL_Handler || defined(INCLUDE_ADHandler_Callback))
#define ADHandler_Callback_

@class ADMessage;

/*!
 @brief Callback interface you can use when instantiating a Handler to avoid
  having to implement your own subclass of Handler.
 */
@protocol ADHandler_Callback < JavaObject >

/*!
 @param msg A <code>Message</code>  object
 @return True if no further handling is desired
 */
- (jboolean)handleMessageWithADMessage:(ADMessage *)msg;

@end

J2OBJC_EMPTY_STATIC_INIT(ADHandler_Callback)

J2OBJC_TYPE_LITERAL_HEADER(ADHandler_Callback)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_Handler")
