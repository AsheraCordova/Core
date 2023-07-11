//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\os\Looper.java
//

#include "IOSClass.h"
#include "IOSObjectArray.h"
#include "J2ObjC_source.h"
#include "Looper.h"
#include "MessageQueue.h"
#include "java/lang/Deprecated.h"
#include "java/lang/Thread.h"
#include "java/lang/annotation/Annotation.h"


@interface ADLooper ()

- (instancetype)initWithBoolean:(jboolean)quitAllowed;

@end

inline ADLooper *ADLooper_get_sMainLooper(void);
inline ADLooper *ADLooper_set_sMainLooper(ADLooper *value);
static ADLooper *ADLooper_sMainLooper;
J2OBJC_STATIC_FIELD_OBJ(ADLooper, sMainLooper, ADLooper *)

__attribute__((unused)) static void ADLooper_initWithBoolean_(ADLooper *self, jboolean quitAllowed);

__attribute__((unused)) static ADLooper *new_ADLooper_initWithBoolean_(jboolean quitAllowed) NS_RETURNS_RETAINED;

__attribute__((unused)) static ADLooper *create_ADLooper_initWithBoolean_(jboolean quitAllowed);

__attribute__((unused)) static IOSObjectArray *ADLooper__Annotations$0(void);

J2OBJC_INITIALIZED_DEFN(ADLooper)

@implementation ADLooper

+ (void)prepare {
  ADLooper_prepare();
}

+ (void)prepareMainLooper {
  ADLooper_prepareMainLooper();
}

+ (ADLooper *)getMainLooper {
  return ADLooper_getMainLooper();
}

+ (void)loop {
  ADLooper_loop();
}

+ (ADLooper *)myLooper {
  return ADLooper_myLooper();
}

+ (ADMessageQueue *)myQueue {
  return ADLooper_myQueue();
}

- (instancetype)initWithBoolean:(jboolean)quitAllowed {
  ADLooper_initWithBoolean_(self, quitAllowed);
  return self;
}

- (jboolean)isCurrentThread {
  return true;
}

- (void)quit {
  [((ADMessageQueue *) nil_chk(mQueue_)) quitWithBoolean:false];
}

- (void)quitSafely {
  [((ADMessageQueue *) nil_chk(mQueue_)) quitWithBoolean:true];
}

- (ADMessageQueue *)getQueue {
  return mQueue_;
}

- (JavaLangThread *)getThread {
  return JavaLangThread_currentThread();
}

- (void)dealloc {
  RELEASE_(mQueue_);
  [super dealloc];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "V", 0x9, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x9, -1, -1, -1, -1, 0, -1 },
    { NULL, "LADLooper;", 0x9, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x9, -1, -1, -1, -1, -1, -1 },
    { NULL, "LADLooper;", 0x9, -1, -1, -1, -1, -1, -1 },
    { NULL, "LADMessageQueue;", 0x9, -1, -1, -1, -1, -1, -1 },
    { NULL, NULL, 0x2, -1, 1, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LADMessageQueue;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LJavaLangThread;", 0x1, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(prepare);
  methods[1].selector = @selector(prepareMainLooper);
  methods[2].selector = @selector(getMainLooper);
  methods[3].selector = @selector(loop);
  methods[4].selector = @selector(myLooper);
  methods[5].selector = @selector(myQueue);
  methods[6].selector = @selector(initWithBoolean:);
  methods[7].selector = @selector(isCurrentThread);
  methods[8].selector = @selector(quit);
  methods[9].selector = @selector(quitSafely);
  methods[10].selector = @selector(getQueue);
  methods[11].selector = @selector(getThread);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "sMainLooper", "LADLooper;", .constantValue.asLong = 0, 0xa, -1, 2, -1, -1 },
    { "mQueue_", "LADMessageQueue;", .constantValue.asLong = 0, 0x10, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { (void *)&ADLooper__Annotations$0, "Z", &ADLooper_sMainLooper };
  static const J2ObjcClassInfo _ADLooper = { "Looper", "r.android.os", ptrTable, methods, fields, 7, 0x11, 12, 2, -1, -1, -1, -1, -1 };
  return &_ADLooper;
}

+ (void)initialize {
  if (self == [ADLooper class]) {
    JreStrongAssignAndConsume(&ADLooper_sMainLooper, new_ADLooper_initWithBoolean_(true));
    J2OBJC_SET_INITIALIZED(ADLooper)
  }
}

@end

void ADLooper_prepare() {
  ADLooper_initialize();
}

void ADLooper_prepareMainLooper() {
  ADLooper_initialize();
}

ADLooper *ADLooper_getMainLooper() {
  ADLooper_initialize();
  @synchronized(ADLooper_class_()) {
    return JreRetainedLocalValue(ADLooper_sMainLooper);
  }
}

void ADLooper_loop() {
  ADLooper_initialize();
}

ADLooper *ADLooper_myLooper() {
  ADLooper_initialize();
  return create_ADLooper_initWithBoolean_(false);
}

ADMessageQueue *ADLooper_myQueue() {
  ADLooper_initialize();
  return ((ADLooper *) nil_chk(ADLooper_myLooper()))->mQueue_;
}

void ADLooper_initWithBoolean_(ADLooper *self, jboolean quitAllowed) {
  NSObject_init(self);
  JreStrongAssignAndConsume(&self->mQueue_, new_ADMessageQueue_initWithBoolean_(quitAllowed));
}

ADLooper *new_ADLooper_initWithBoolean_(jboolean quitAllowed) {
  J2OBJC_NEW_IMPL(ADLooper, initWithBoolean_, quitAllowed)
}

ADLooper *create_ADLooper_initWithBoolean_(jboolean quitAllowed) {
  J2OBJC_CREATE_IMPL(ADLooper, initWithBoolean_, quitAllowed)
}

IOSObjectArray *ADLooper__Annotations$0() {
  return [IOSObjectArray arrayWithObjects:(id[]){ create_JavaLangDeprecated() } count:1 type:JavaLangAnnotationAnnotation_class_()];
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADLooper)
