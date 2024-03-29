//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\os\Messenger.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_Messenger")
#ifdef RESTRICT_Messenger
#define INCLUDE_ALL_Messenger 0
#else
#define INCLUDE_ALL_Messenger 1
#endif
#undef RESTRICT_Messenger

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (ADMessenger_) && (INCLUDE_ALL_Messenger || defined(INCLUDE_ADMessenger))
#define ADMessenger_

@class ADHandler;
@class ADMessage;
@protocol ADIBinder;

/*!
 @brief Reference to a Handler, which others can use to send messages to it.
 This allows for the implementation of message-based communication across
  processes, by creating a Messenger pointing to a Handler in one process,
  and handing that Messenger to another process. 
 <p>Note: the implementation underneath is just a simple wrapper around a 
 <code>Binder</code> that is used to perform the communication.  This means
  semantically you should treat it as such: this class does not impact process
  lifecycle management (you must be using some higher-level component to tell
  the system that your process needs to continue running), the connection will
  break if your process goes away for any reason, etc.</p>
 */
@interface ADMessenger : NSObject

#pragma mark Public

/*!
 @brief Create a new Messenger pointing to the given Handler.Any Message
  objects sent through this Messenger will appear in the Handler as if 
 <code>Handler.sendMessage(Message)</code> had
  been called directly.
 @param target The Handler that will receive sent messages.
 */
- (instancetype)initWithADHandler:(ADHandler *)target;

/*!
 @brief Create a Messenger from a raw IBinder, which had previously been
  retrieved with <code>getBinder</code>.
 @param target The IBinder this Messenger should communicate with.
 */
- (instancetype)initWithADIBinder:(id<ADIBinder>)target;

- (jint)describeContents;

/*!
 @brief Comparison operator on two Messenger objects, such that true
  is returned then they both point to the same Handler.
 */
- (jboolean)isEqual:(id)otherObj;

/*!
 @brief Retrieve the IBinder that this Messenger is using to communicate with
  its associated Handler.
 @return Returns the IBinder backing this Messenger.
 */
- (id<ADIBinder>)getBinder;

- (NSUInteger)hash;

/*!
 @brief Send a Message to this Messenger's Handler.
 @param message The Message to send.  Usually retrieved through  
 <code>Message.obtain()</code> .
 @throw RemoteExceptionThrows DeadObjectException if the target
  Handler no longer exists.
 */
- (void)sendWithADMessage:(ADMessage *)message;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADMessenger)

FOUNDATION_EXPORT void ADMessenger_initWithADHandler_(ADMessenger *self, ADHandler *target);

FOUNDATION_EXPORT ADMessenger *new_ADMessenger_initWithADHandler_(ADHandler *target) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADMessenger *create_ADMessenger_initWithADHandler_(ADHandler *target);

FOUNDATION_EXPORT void ADMessenger_initWithADIBinder_(ADMessenger *self, id<ADIBinder> target);

FOUNDATION_EXPORT ADMessenger *new_ADMessenger_initWithADIBinder_(id<ADIBinder> target) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADMessenger *create_ADMessenger_initWithADIBinder_(id<ADIBinder> target);

J2OBJC_TYPE_LITERAL_HEADER(ADMessenger)

@compatibility_alias RAndroidOsMessenger ADMessenger;

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_Messenger")
