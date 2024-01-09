//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\view\ViewTreeObserver.java
//

#include "Context.h"
#include "J2ObjC_source.h"
#include "ViewTreeObserver.h"
#include "java/lang/IllegalStateException.h"
#include "java/util/ArrayList.h"

@class JavaUtilArrayList;


@interface ADViewTreeObserver () {
 @public
  ADViewTreeObserver_CopyOnWriteArray *mOnScrollChangedListeners_;
  ADViewTreeObserver_CopyOnWriteArray *mOnPreDrawListeners_;
  jboolean mAlive_;
}

- (void)checkIsAlive;

- (void)kill;

@end

J2OBJC_FIELD_SETTER(ADViewTreeObserver, mOnScrollChangedListeners_, ADViewTreeObserver_CopyOnWriteArray *)
J2OBJC_FIELD_SETTER(ADViewTreeObserver, mOnPreDrawListeners_, ADViewTreeObserver_CopyOnWriteArray *)

__attribute__((unused)) static void ADViewTreeObserver_checkIsAlive(ADViewTreeObserver *self);

__attribute__((unused)) static void ADViewTreeObserver_kill(ADViewTreeObserver *self);

@interface ADViewTreeObserver_OnPreDrawListener : NSObject

@end

@interface ADViewTreeObserver_OnScrollChangedListener : NSObject

@end

@interface ADViewTreeObserver_CopyOnWriteArray () {
 @public
  JavaUtilArrayList *mData_;
  JavaUtilArrayList *mDataCopy_;
  ADViewTreeObserver_Access *mAccess_;
  jboolean mStart_;
}

- (JavaUtilArrayList *)getArray;

@end

J2OBJC_FIELD_SETTER(ADViewTreeObserver_CopyOnWriteArray, mData_, JavaUtilArrayList *)
J2OBJC_FIELD_SETTER(ADViewTreeObserver_CopyOnWriteArray, mDataCopy_, JavaUtilArrayList *)
J2OBJC_FIELD_SETTER(ADViewTreeObserver_CopyOnWriteArray, mAccess_, ADViewTreeObserver_Access *)

__attribute__((unused)) static JavaUtilArrayList *ADViewTreeObserver_CopyOnWriteArray_getArray(ADViewTreeObserver_CopyOnWriteArray *self);

@interface ADViewTreeObserver_Access () {
 @public
  JavaUtilArrayList *mData_;
  jint mSize_;
}

@end

J2OBJC_FIELD_SETTER(ADViewTreeObserver_Access, mData_, JavaUtilArrayList *)

@implementation ADViewTreeObserver

- (void)addOnPreDrawListenerWithADViewTreeObserver_OnPreDrawListener:(id<ADViewTreeObserver_OnPreDrawListener>)listener {
  ADViewTreeObserver_checkIsAlive(self);
  if (mOnPreDrawListeners_ == nil) {
    JreStrongAssignAndConsume(&mOnPreDrawListeners_, new_ADViewTreeObserver_CopyOnWriteArray_init());
  }
  [mOnPreDrawListeners_ addWithId:listener];
}

- (void)removeOnPreDrawListenerWithADViewTreeObserver_OnPreDrawListener:(id<ADViewTreeObserver_OnPreDrawListener>)victim {
  ADViewTreeObserver_checkIsAlive(self);
  if (mOnPreDrawListeners_ == nil) {
    return;
  }
  [mOnPreDrawListeners_ removeWithId:victim];
}

- (void)addOnScrollChangedListenerWithADViewTreeObserver_OnScrollChangedListener:(id<ADViewTreeObserver_OnScrollChangedListener>)listener {
  ADViewTreeObserver_checkIsAlive(self);
  if (mOnScrollChangedListeners_ == nil) {
    JreStrongAssignAndConsume(&mOnScrollChangedListeners_, new_ADViewTreeObserver_CopyOnWriteArray_init());
  }
  [mOnScrollChangedListeners_ addWithId:listener];
}

- (void)removeOnScrollChangedListenerWithADViewTreeObserver_OnScrollChangedListener:(id<ADViewTreeObserver_OnScrollChangedListener>)victim {
  ADViewTreeObserver_checkIsAlive(self);
  if (mOnScrollChangedListeners_ == nil) {
    return;
  }
  [mOnScrollChangedListeners_ removeWithId:victim];
}

- (void)checkIsAlive {
  ADViewTreeObserver_checkIsAlive(self);
}

- (jboolean)isAlive {
  return mAlive_;
}

- (void)kill {
  ADViewTreeObserver_kill(self);
}

- (void)dispatchOnScrollChanged {
  ADViewTreeObserver_CopyOnWriteArray *listeners = mOnScrollChangedListeners_;
  if (listeners != nil && [listeners size] > 0) {
    ADViewTreeObserver_Access *access = JreRetainedLocalValue([listeners start]);
    @try {
      jint count = [((ADViewTreeObserver_Access *) nil_chk(access)) size];
      for (jint i = 0; i < count; i++) {
        [((id<ADViewTreeObserver_OnScrollChangedListener>) nil_chk([access getWithInt:i])) onScrollChanged];
      }
    }
    @finally {
      [listeners end];
    }
  }
}

- (instancetype)initWithADContext:(ADContext *)mContext {
  ADViewTreeObserver_initWithADContext_(self, mContext);
  return self;
}

- (void)mergeWithADViewTreeObserver:(ADViewTreeObserver *)observer {
  if (((ADViewTreeObserver *) nil_chk(observer))->mOnScrollChangedListeners_ != nil) {
    if (mOnScrollChangedListeners_ != nil) {
      [mOnScrollChangedListeners_ addAllWithADViewTreeObserver_CopyOnWriteArray:observer->mOnScrollChangedListeners_];
    }
    else {
      JreStrongAssign(&mOnScrollChangedListeners_, observer->mOnScrollChangedListeners_);
    }
  }
}

- (void)dealloc {
  RELEASE_(mOnScrollChangedListeners_);
  RELEASE_(mOnPreDrawListeners_);
  [super dealloc];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "V", 0x1, 0, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 2, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 3, 4, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 5, 4, -1, -1, -1, -1 },
    { NULL, "V", 0x2, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x2, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, NULL, 0x1, -1, 6, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 7, 8, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(addOnPreDrawListenerWithADViewTreeObserver_OnPreDrawListener:);
  methods[1].selector = @selector(removeOnPreDrawListenerWithADViewTreeObserver_OnPreDrawListener:);
  methods[2].selector = @selector(addOnScrollChangedListenerWithADViewTreeObserver_OnScrollChangedListener:);
  methods[3].selector = @selector(removeOnScrollChangedListenerWithADViewTreeObserver_OnScrollChangedListener:);
  methods[4].selector = @selector(checkIsAlive);
  methods[5].selector = @selector(isAlive);
  methods[6].selector = @selector(kill);
  methods[7].selector = @selector(dispatchOnScrollChanged);
  methods[8].selector = @selector(initWithADContext:);
  methods[9].selector = @selector(mergeWithADViewTreeObserver:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "mOnScrollChangedListeners_", "LADViewTreeObserver_CopyOnWriteArray;", .constantValue.asLong = 0, 0x2, -1, -1, 9, -1 },
    { "mOnPreDrawListeners_", "LADViewTreeObserver_CopyOnWriteArray;", .constantValue.asLong = 0, 0x2, -1, -1, 10, -1 },
    { "mAlive_", "Z", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "addOnPreDrawListener", "LADViewTreeObserver_OnPreDrawListener;", "removeOnPreDrawListener", "addOnScrollChangedListener", "LADViewTreeObserver_OnScrollChangedListener;", "removeOnScrollChangedListener", "LADContext;", "merge", "LADViewTreeObserver;", "Lr/android/view/ViewTreeObserver$CopyOnWriteArray<Lr/android/view/ViewTreeObserver$OnScrollChangedListener;>;", "Lr/android/view/ViewTreeObserver$CopyOnWriteArray<Lr/android/view/ViewTreeObserver$OnPreDrawListener;>;", "LADViewTreeObserver_OnPreDrawListener;LADViewTreeObserver_OnScrollChangedListener;LADViewTreeObserver_CopyOnWriteArray;LADViewTreeObserver_Access;" };
  static const J2ObjcClassInfo _ADViewTreeObserver = { "ViewTreeObserver", "r.android.view", ptrTable, methods, fields, 7, 0x11, 10, 3, -1, 11, -1, -1, -1 };
  return &_ADViewTreeObserver;
}

@end

void ADViewTreeObserver_checkIsAlive(ADViewTreeObserver *self) {
  if (!self->mAlive_) {
    @throw create_JavaLangIllegalStateException_initWithNSString_(@"This ViewTreeObserver is not alive, call getViewTreeObserver() again");
  }
}

void ADViewTreeObserver_kill(ADViewTreeObserver *self) {
  self->mAlive_ = false;
}

void ADViewTreeObserver_initWithADContext_(ADViewTreeObserver *self, ADContext *mContext) {
  NSObject_init(self);
  self->mAlive_ = true;
}

ADViewTreeObserver *new_ADViewTreeObserver_initWithADContext_(ADContext *mContext) {
  J2OBJC_NEW_IMPL(ADViewTreeObserver, initWithADContext_, mContext)
}

ADViewTreeObserver *create_ADViewTreeObserver_initWithADContext_(ADContext *mContext) {
  J2OBJC_CREATE_IMPL(ADViewTreeObserver, initWithADContext_, mContext)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADViewTreeObserver)

@implementation ADViewTreeObserver_OnPreDrawListener

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "Z", 0x401, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(onPreDraw);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "LADViewTreeObserver;" };
  static const J2ObjcClassInfo _ADViewTreeObserver_OnPreDrawListener = { "OnPreDrawListener", "r.android.view", ptrTable, methods, NULL, 7, 0x609, 1, 0, 0, -1, -1, -1, -1 };
  return &_ADViewTreeObserver_OnPreDrawListener;
}

@end

J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ADViewTreeObserver_OnPreDrawListener)

@implementation ADViewTreeObserver_OnScrollChangedListener

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "V", 0x401, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(onScrollChanged);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "LADViewTreeObserver;" };
  static const J2ObjcClassInfo _ADViewTreeObserver_OnScrollChangedListener = { "OnScrollChangedListener", "r.android.view", ptrTable, methods, NULL, 7, 0x609, 1, 0, 0, -1, -1, -1, -1 };
  return &_ADViewTreeObserver_OnScrollChangedListener;
}

@end

J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ADViewTreeObserver_OnScrollChangedListener)

@implementation ADViewTreeObserver_CopyOnWriteArray

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADViewTreeObserver_CopyOnWriteArray_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (JavaUtilArrayList *)getArray {
  return ADViewTreeObserver_CopyOnWriteArray_getArray(self);
}

- (ADViewTreeObserver_Access *)start {
  if (mStart_) @throw create_JavaLangIllegalStateException_initWithNSString_(@"Iteration already started");
  mStart_ = true;
  JreStrongAssign(&mDataCopy_, nil);
  JreStrongAssign(&((ADViewTreeObserver_Access *) nil_chk(mAccess_))->mData_, mData_);
  mAccess_->mSize_ = [((JavaUtilArrayList *) nil_chk(mData_)) size];
  return mAccess_;
}

- (void)end {
  if (!mStart_) @throw create_JavaLangIllegalStateException_initWithNSString_(@"Iteration not started");
  mStart_ = false;
  if (mDataCopy_ != nil) {
    JreStrongAssign(&mData_, mDataCopy_);
    [((JavaUtilArrayList *) nil_chk(((ADViewTreeObserver_Access *) nil_chk(mAccess_))->mData_)) clear];
    mAccess_->mSize_ = 0;
  }
  JreStrongAssign(&mDataCopy_, nil);
}

- (jint)size {
  return [((JavaUtilArrayList *) nil_chk(ADViewTreeObserver_CopyOnWriteArray_getArray(self))) size];
}

- (void)addWithId:(id)item {
  [((JavaUtilArrayList *) nil_chk(ADViewTreeObserver_CopyOnWriteArray_getArray(self))) addWithId:item];
}

- (void)addAllWithADViewTreeObserver_CopyOnWriteArray:(ADViewTreeObserver_CopyOnWriteArray *)array {
  [((JavaUtilArrayList *) nil_chk(ADViewTreeObserver_CopyOnWriteArray_getArray(self))) addAllWithJavaUtilCollection:((ADViewTreeObserver_CopyOnWriteArray *) nil_chk(array))->mData_];
}

- (void)removeWithId:(id)item {
  [((JavaUtilArrayList *) nil_chk(ADViewTreeObserver_CopyOnWriteArray_getArray(self))) removeWithId:item];
}

- (void)clear {
  [((JavaUtilArrayList *) nil_chk(ADViewTreeObserver_CopyOnWriteArray_getArray(self))) clear];
}

- (void)dealloc {
  RELEASE_(mData_);
  RELEASE_(mDataCopy_);
  RELEASE_(mAccess_);
  [super dealloc];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "LJavaUtilArrayList;", 0x2, -1, -1, -1, 0, -1, -1 },
    { NULL, "LADViewTreeObserver_Access;", 0x0, -1, -1, -1, 1, -1, -1 },
    { NULL, "V", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x0, 2, 3, -1, 4, -1, -1 },
    { NULL, "V", 0x0, 5, 6, -1, 7, -1, -1 },
    { NULL, "V", 0x0, 8, 3, -1, 4, -1, -1 },
    { NULL, "V", 0x0, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(getArray);
  methods[2].selector = @selector(start);
  methods[3].selector = @selector(end);
  methods[4].selector = @selector(size);
  methods[5].selector = @selector(addWithId:);
  methods[6].selector = @selector(addAllWithADViewTreeObserver_CopyOnWriteArray:);
  methods[7].selector = @selector(removeWithId:);
  methods[8].selector = @selector(clear);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "mData_", "LJavaUtilArrayList;", .constantValue.asLong = 0, 0x2, -1, -1, 9, -1 },
    { "mDataCopy_", "LJavaUtilArrayList;", .constantValue.asLong = 0, 0x2, -1, -1, 9, -1 },
    { "mAccess_", "LADViewTreeObserver_Access;", .constantValue.asLong = 0, 0x12, -1, -1, 10, -1 },
    { "mStart_", "Z", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "()Ljava/util/ArrayList<TT;>;", "()Lr/android/view/ViewTreeObserver$Access<TT;>;", "add", "LNSObject;", "(TT;)V", "addAll", "LADViewTreeObserver_CopyOnWriteArray;", "(Lr/android/view/ViewTreeObserver$CopyOnWriteArray<TT;>;)V", "remove", "Ljava/util/ArrayList<TT;>;", "Lr/android/view/ViewTreeObserver$Access<TT;>;", "LADViewTreeObserver;", "<T:Ljava/lang/Object;>Ljava/lang/Object;" };
  static const J2ObjcClassInfo _ADViewTreeObserver_CopyOnWriteArray = { "CopyOnWriteArray", "r.android.view", ptrTable, methods, fields, 7, 0x8, 9, 4, 11, -1, -1, 12, -1 };
  return &_ADViewTreeObserver_CopyOnWriteArray;
}

@end

void ADViewTreeObserver_CopyOnWriteArray_init(ADViewTreeObserver_CopyOnWriteArray *self) {
  NSObject_init(self);
  JreStrongAssignAndConsume(&self->mData_, new_JavaUtilArrayList_init());
  JreStrongAssignAndConsume(&self->mAccess_, new_ADViewTreeObserver_Access_init());
}

ADViewTreeObserver_CopyOnWriteArray *new_ADViewTreeObserver_CopyOnWriteArray_init() {
  J2OBJC_NEW_IMPL(ADViewTreeObserver_CopyOnWriteArray, init)
}

ADViewTreeObserver_CopyOnWriteArray *create_ADViewTreeObserver_CopyOnWriteArray_init() {
  J2OBJC_CREATE_IMPL(ADViewTreeObserver_CopyOnWriteArray, init)
}

JavaUtilArrayList *ADViewTreeObserver_CopyOnWriteArray_getArray(ADViewTreeObserver_CopyOnWriteArray *self) {
  if (self->mStart_) {
    if (self->mDataCopy_ == nil) JreStrongAssignAndConsume(&self->mDataCopy_, new_JavaUtilArrayList_initWithJavaUtilCollection_(self->mData_));
    return self->mDataCopy_;
  }
  return self->mData_;
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADViewTreeObserver_CopyOnWriteArray)

@implementation ADViewTreeObserver_Access

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADViewTreeObserver_Access_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (id)getWithInt:(jint)index {
  return [((JavaUtilArrayList *) nil_chk(mData_)) getWithInt:index];
}

- (jint)size {
  return mSize_;
}

- (void)dealloc {
  RELEASE_(mData_);
  [super dealloc];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x0, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSObject;", 0x0, 0, 1, -1, 2, -1, -1 },
    { NULL, "I", 0x0, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(getWithInt:);
  methods[2].selector = @selector(size);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "mData_", "LJavaUtilArrayList;", .constantValue.asLong = 0, 0x2, -1, -1, 3, -1 },
    { "mSize_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "get", "I", "(I)TT;", "Ljava/util/ArrayList<TT;>;", "LADViewTreeObserver;", "<T:Ljava/lang/Object;>Ljava/lang/Object;" };
  static const J2ObjcClassInfo _ADViewTreeObserver_Access = { "Access", "r.android.view", ptrTable, methods, fields, 7, 0x8, 3, 2, 4, -1, -1, 5, -1 };
  return &_ADViewTreeObserver_Access;
}

@end

void ADViewTreeObserver_Access_init(ADViewTreeObserver_Access *self) {
  NSObject_init(self);
}

ADViewTreeObserver_Access *new_ADViewTreeObserver_Access_init() {
  J2OBJC_NEW_IMPL(ADViewTreeObserver_Access, init)
}

ADViewTreeObserver_Access *create_ADViewTreeObserver_Access_init() {
  J2OBJC_CREATE_IMPL(ADViewTreeObserver_Access, init)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADViewTreeObserver_Access)
