//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\AndroidJMaterial\src\main\java\com\google\android\material\internal\CheckableGroup.java
//

#include "CheckableGroup.h"
#include "J2ObjC_source.h"
#include "MaterialCheckable.h"
#include "View.h"
#include "ViewGroup.h"
#include "java/lang/Integer.h"
#include "java/util/ArrayList.h"
#include "java/util/Collection.h"
#include "java/util/HashMap.h"
#include "java/util/HashSet.h"
#include "java/util/Iterator.h"
#include "java/util/List.h"
#include "java/util/Map.h"
#include "java/util/Set.h"

@protocol JavaUtilMap;
@protocol JavaUtilSet;


@interface ADXCheckableGroup () {
 @public
  id<JavaUtilMap> checkables_;
  id<JavaUtilSet> checkedIds_;
  id<ADXCheckableGroup_OnCheckedStateChangeListener> onCheckedStateChangeListener_;
  jboolean singleSelection_;
  jboolean selectionRequired_;
}

- (jboolean)checkInternalWithADXMaterialCheckable:(id<ADXMaterialCheckable>)checkable;

- (jboolean)uncheckInternalWithADXMaterialCheckable:(id<ADXMaterialCheckable>)checkable
                                        withBoolean:(jboolean)selectionRequired;

- (void)onCheckedStateChanged;

@end

J2OBJC_FIELD_SETTER(ADXCheckableGroup, checkables_, id<JavaUtilMap>)
J2OBJC_FIELD_SETTER(ADXCheckableGroup, checkedIds_, id<JavaUtilSet>)
J2OBJC_FIELD_SETTER(ADXCheckableGroup, onCheckedStateChangeListener_, id<ADXCheckableGroup_OnCheckedStateChangeListener>)

__attribute__((unused)) static jboolean ADXCheckableGroup_checkInternalWithADXMaterialCheckable_(ADXCheckableGroup *self, id<ADXMaterialCheckable> checkable);

__attribute__((unused)) static jboolean ADXCheckableGroup_uncheckInternalWithADXMaterialCheckable_withBoolean_(ADXCheckableGroup *self, id<ADXMaterialCheckable> checkable, jboolean selectionRequired);

__attribute__((unused)) static void ADXCheckableGroup_onCheckedStateChanged(ADXCheckableGroup *self);

@interface ADXCheckableGroup_1 : NSObject < ADXMaterialCheckable_OnCheckedChangeListener > {
 @public
  ADXCheckableGroup *this$0_;
}

- (instancetype)initWithADXCheckableGroup:(ADXCheckableGroup *)outer$;

- (void)onCheckedChangedWithId:(id<ADXMaterialCheckable>)checkable
                   withBoolean:(jboolean)isChecked;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXCheckableGroup_1)

__attribute__((unused)) static void ADXCheckableGroup_1_initWithADXCheckableGroup_(ADXCheckableGroup_1 *self, ADXCheckableGroup *outer$);

__attribute__((unused)) static ADXCheckableGroup_1 *new_ADXCheckableGroup_1_initWithADXCheckableGroup_(ADXCheckableGroup *outer$) NS_RETURNS_RETAINED;

__attribute__((unused)) static ADXCheckableGroup_1 *create_ADXCheckableGroup_1_initWithADXCheckableGroup_(ADXCheckableGroup *outer$);

@interface ADXCheckableGroup_OnCheckedStateChangeListener : NSObject

@end

@implementation ADXCheckableGroup

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADXCheckableGroup_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (void)setSingleSelectionWithBoolean:(jboolean)singleSelection {
  if (self->singleSelection_ != singleSelection) {
    self->singleSelection_ = singleSelection;
    [self clearCheck];
  }
}

- (jboolean)isSingleSelection {
  return singleSelection_;
}

- (void)setSelectionRequiredWithBoolean:(jboolean)selectionRequired {
  self->selectionRequired_ = selectionRequired;
}

- (jboolean)isSelectionRequired {
  return selectionRequired_;
}

- (void)setOnCheckedStateChangeListenerWithADXCheckableGroup_OnCheckedStateChangeListener:(id<ADXCheckableGroup_OnCheckedStateChangeListener>)listener {
  JreStrongAssign(&self->onCheckedStateChangeListener_, listener);
}

- (void)addCheckableWithADXMaterialCheckable:(id<ADXMaterialCheckable>)checkable {
  [((id<JavaUtilMap>) nil_chk(checkables_)) putWithId:JavaLangInteger_valueOfWithInt_([((id<ADXMaterialCheckable>) nil_chk(checkable)) getId]) withId:checkable];
  if ([checkable isChecked]) {
    ADXCheckableGroup_checkInternalWithADXMaterialCheckable_(self, checkable);
  }
  [checkable setInternalOnCheckedChangeListenerWithADXMaterialCheckable_OnCheckedChangeListener:create_ADXCheckableGroup_1_initWithADXCheckableGroup_(self)];
}

- (void)removeCheckableWithADXMaterialCheckable:(id<ADXMaterialCheckable>)checkable {
  [((id<ADXMaterialCheckable>) nil_chk(checkable)) setInternalOnCheckedChangeListenerWithADXMaterialCheckable_OnCheckedChangeListener:nil];
  [((id<JavaUtilMap>) nil_chk(checkables_)) removeWithId:JavaLangInteger_valueOfWithInt_([checkable getId])];
  [((id<JavaUtilSet>) nil_chk(checkedIds_)) removeWithId:JavaLangInteger_valueOfWithInt_([checkable getId])];
}

- (void)checkWithInt:(jint)id_ {
  id<ADXMaterialCheckable> checkable = JreRetainedLocalValue([((id<JavaUtilMap>) nil_chk(checkables_)) getWithId:JavaLangInteger_valueOfWithInt_(id_)]);
  if (checkable == nil) {
    return;
  }
  if (ADXCheckableGroup_checkInternalWithADXMaterialCheckable_(self, checkable)) {
    ADXCheckableGroup_onCheckedStateChanged(self);
  }
}

- (void)uncheckWithInt:(jint)id_ {
  id<ADXMaterialCheckable> checkable = JreRetainedLocalValue([((id<JavaUtilMap>) nil_chk(checkables_)) getWithId:JavaLangInteger_valueOfWithInt_(id_)]);
  if (checkable == nil) {
    return;
  }
  if (ADXCheckableGroup_uncheckInternalWithADXMaterialCheckable_withBoolean_(self, checkable, selectionRequired_)) {
    ADXCheckableGroup_onCheckedStateChanged(self);
  }
}

- (void)clearCheck {
  jboolean checkedStateChanged = ![((id<JavaUtilSet>) nil_chk(checkedIds_)) isEmpty];
  for (id<ADXMaterialCheckable> __strong checkable in nil_chk([((id<JavaUtilMap>) nil_chk(checkables_)) values])) {
    ADXCheckableGroup_uncheckInternalWithADXMaterialCheckable_withBoolean_(self, checkable, false);
  }
  if (checkedStateChanged) {
    ADXCheckableGroup_onCheckedStateChanged(self);
  }
}

- (jint)getSingleCheckedId {
  return singleSelection_ && ![((id<JavaUtilSet>) nil_chk(checkedIds_)) isEmpty] ? [((JavaLangInteger *) nil_chk([((id<JavaUtilIterator>) nil_chk([((id<JavaUtilSet>) nil_chk(checkedIds_)) iterator])) next])) intValue] : ADView_NO_ID;
}

- (id<JavaUtilSet>)getCheckedIds {
  return create_JavaUtilHashSet_initWithJavaUtilCollection_(checkedIds_);
}

- (id<JavaUtilList>)getCheckedIdsSortedByChildOrderWithADViewGroup:(ADViewGroup *)parent {
  id<JavaUtilSet> checkedIds = JreRetainedLocalValue([self getCheckedIds]);
  id<JavaUtilList> sortedCheckedIds = create_JavaUtilArrayList_init();
  for (jint i = 0; i < [((ADViewGroup *) nil_chk(parent)) getChildCount]; i++) {
    ADView *child = JreRetainedLocalValue([parent getChildAtWithInt:i]);
    if ([ADXMaterialCheckable_class_() isInstance:child] && [((id<JavaUtilSet>) nil_chk(checkedIds)) containsWithId:JavaLangInteger_valueOfWithInt_([((ADView *) nil_chk(child)) getId])]) {
      [sortedCheckedIds addWithId:JavaLangInteger_valueOfWithInt_([((ADView *) nil_chk(child)) getId])];
    }
  }
  return sortedCheckedIds;
}

- (jboolean)checkInternalWithADXMaterialCheckable:(id<ADXMaterialCheckable>)checkable {
  return ADXCheckableGroup_checkInternalWithADXMaterialCheckable_(self, checkable);
}

- (jboolean)uncheckInternalWithADXMaterialCheckable:(id<ADXMaterialCheckable>)checkable
                                        withBoolean:(jboolean)selectionRequired {
  return ADXCheckableGroup_uncheckInternalWithADXMaterialCheckable_withBoolean_(self, checkable, selectionRequired);
}

- (void)onCheckedStateChanged {
  ADXCheckableGroup_onCheckedStateChanged(self);
}

- (void)dealloc {
  RELEASE_(checkables_);
  RELEASE_(checkedIds_);
  RELEASE_(onCheckedStateChangeListener_);
  [super dealloc];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 0, 1, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 2, 1, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 3, 4, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 5, 6, -1, 7, -1, -1 },
    { NULL, "V", 0x1, 8, 6, -1, 7, -1, -1 },
    { NULL, "V", 0x1, 9, 10, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 11, 10, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LJavaUtilSet;", 0x1, -1, -1, -1, 12, -1, -1 },
    { NULL, "LJavaUtilList;", 0x1, 13, 14, -1, 15, -1, -1 },
    { NULL, "Z", 0x2, 16, 6, -1, 17, -1, -1 },
    { NULL, "Z", 0x2, 18, 19, -1, 20, -1, -1 },
    { NULL, "V", 0x2, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(setSingleSelectionWithBoolean:);
  methods[2].selector = @selector(isSingleSelection);
  methods[3].selector = @selector(setSelectionRequiredWithBoolean:);
  methods[4].selector = @selector(isSelectionRequired);
  methods[5].selector = @selector(setOnCheckedStateChangeListenerWithADXCheckableGroup_OnCheckedStateChangeListener:);
  methods[6].selector = @selector(addCheckableWithADXMaterialCheckable:);
  methods[7].selector = @selector(removeCheckableWithADXMaterialCheckable:);
  methods[8].selector = @selector(checkWithInt:);
  methods[9].selector = @selector(uncheckWithInt:);
  methods[10].selector = @selector(clearCheck);
  methods[11].selector = @selector(getSingleCheckedId);
  methods[12].selector = @selector(getCheckedIds);
  methods[13].selector = @selector(getCheckedIdsSortedByChildOrderWithADViewGroup:);
  methods[14].selector = @selector(checkInternalWithADXMaterialCheckable:);
  methods[15].selector = @selector(uncheckInternalWithADXMaterialCheckable:withBoolean:);
  methods[16].selector = @selector(onCheckedStateChanged);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "checkables_", "LJavaUtilMap;", .constantValue.asLong = 0, 0x12, -1, -1, 21, -1 },
    { "checkedIds_", "LJavaUtilSet;", .constantValue.asLong = 0, 0x12, -1, -1, 22, -1 },
    { "onCheckedStateChangeListener_", "LADXCheckableGroup_OnCheckedStateChangeListener;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "singleSelection_", "Z", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "selectionRequired_", "Z", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "setSingleSelection", "Z", "setSelectionRequired", "setOnCheckedStateChangeListener", "LADXCheckableGroup_OnCheckedStateChangeListener;", "addCheckable", "LADXMaterialCheckable;", "(TT;)V", "removeCheckable", "check", "I", "uncheck", "()Ljava/util/Set<Ljava/lang/Integer;>;", "getCheckedIdsSortedByChildOrder", "LADViewGroup;", "(Lr/android/view/ViewGroup;)Ljava/util/List<Ljava/lang/Integer;>;", "checkInternal", "(Lcom/google/android/material/internal/MaterialCheckable<TT;>;)Z", "uncheckInternal", "LADXMaterialCheckable;Z", "(Lcom/google/android/material/internal/MaterialCheckable<TT;>;Z)Z", "Ljava/util/Map<Ljava/lang/Integer;TT;>;", "Ljava/util/Set<Ljava/lang/Integer;>;", "<T::Lcom/google/android/material/internal/MaterialCheckable<TT;>;>Ljava/lang/Object;" };
  static const J2ObjcClassInfo _ADXCheckableGroup = { "CheckableGroup", "com.google.android.material.internal", ptrTable, methods, fields, 7, 0x1, 17, 5, -1, 4, -1, 23, -1 };
  return &_ADXCheckableGroup;
}

@end

void ADXCheckableGroup_init(ADXCheckableGroup *self) {
  NSObject_init(self);
  JreStrongAssignAndConsume(&self->checkables_, new_JavaUtilHashMap_init());
  JreStrongAssignAndConsume(&self->checkedIds_, new_JavaUtilHashSet_init());
}

ADXCheckableGroup *new_ADXCheckableGroup_init() {
  J2OBJC_NEW_IMPL(ADXCheckableGroup, init)
}

ADXCheckableGroup *create_ADXCheckableGroup_init() {
  J2OBJC_CREATE_IMPL(ADXCheckableGroup, init)
}

jboolean ADXCheckableGroup_checkInternalWithADXMaterialCheckable_(ADXCheckableGroup *self, id<ADXMaterialCheckable> checkable) {
  jint id_ = [((id<ADXMaterialCheckable>) nil_chk(checkable)) getId];
  if ([((id<JavaUtilSet>) nil_chk(self->checkedIds_)) containsWithId:JavaLangInteger_valueOfWithInt_(id_)]) {
    return false;
  }
  id<ADXMaterialCheckable> singleCheckedItem = JreRetainedLocalValue([((id<JavaUtilMap>) nil_chk(self->checkables_)) getWithId:JavaLangInteger_valueOfWithInt_([self getSingleCheckedId])]);
  if (singleCheckedItem != nil) {
    ADXCheckableGroup_uncheckInternalWithADXMaterialCheckable_withBoolean_(self, singleCheckedItem, false);
  }
  jboolean checkedStateChanged = [self->checkedIds_ addWithId:JavaLangInteger_valueOfWithInt_(id_)];
  if (![checkable isChecked]) {
    [checkable setCheckedWithBoolean:true];
  }
  return checkedStateChanged;
}

jboolean ADXCheckableGroup_uncheckInternalWithADXMaterialCheckable_withBoolean_(ADXCheckableGroup *self, id<ADXMaterialCheckable> checkable, jboolean selectionRequired) {
  jint id_ = [((id<ADXMaterialCheckable>) nil_chk(checkable)) getId];
  if (![((id<JavaUtilSet>) nil_chk(self->checkedIds_)) containsWithId:JavaLangInteger_valueOfWithInt_(id_)]) {
    return false;
  }
  if (selectionRequired && [self->checkedIds_ size] == 1 && [self->checkedIds_ containsWithId:JavaLangInteger_valueOfWithInt_(id_)]) {
    [checkable setCheckedWithBoolean:true];
    return false;
  }
  jboolean checkedStateChanged = [self->checkedIds_ removeWithId:JavaLangInteger_valueOfWithInt_(id_)];
  if ([checkable isChecked]) {
    [checkable setCheckedWithBoolean:false];
  }
  return checkedStateChanged;
}

void ADXCheckableGroup_onCheckedStateChanged(ADXCheckableGroup *self) {
  if (self->onCheckedStateChangeListener_ != nil) {
    [self->onCheckedStateChangeListener_ onCheckedStateChangedWithJavaUtilSet:[self getCheckedIds]];
  }
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADXCheckableGroup)

@implementation ADXCheckableGroup_1

- (instancetype)initWithADXCheckableGroup:(ADXCheckableGroup *)outer$ {
  ADXCheckableGroup_1_initWithADXCheckableGroup_(self, outer$);
  return self;
}

- (void)onCheckedChangedWithId:(id<ADXMaterialCheckable>)checkable
                   withBoolean:(jboolean)isChecked {
  if (isChecked ? ADXCheckableGroup_checkInternalWithADXMaterialCheckable_(this$0_, checkable) : ADXCheckableGroup_uncheckInternalWithADXMaterialCheckable_withBoolean_(this$0_, checkable, this$0_->selectionRequired_)) {
    ADXCheckableGroup_onCheckedStateChanged(this$0_);
  }
}

- (void)dealloc {
  RELEASE_(this$0_);
  [super dealloc];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x0, -1, 0, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 1, 2, -1, 3, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(initWithADXCheckableGroup:);
  methods[1].selector = @selector(onCheckedChangedWithId:withBoolean:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "this$0_", "LADXCheckableGroup;", .constantValue.asLong = 0, 0x1012, -1, -1, 4, -1 },
  };
  static const void *ptrTable[] = { "LADXCheckableGroup;", "onCheckedChanged", "LADXMaterialCheckable;Z", "(TT;Z)V", "Lcom/google/android/material/internal/CheckableGroup<TT;>;", "addCheckableWithADXMaterialCheckable:", "Ljava/lang/Object;Lcom/google/android/material/internal/MaterialCheckable$OnCheckedChangeListener<TT;>;" };
  static const J2ObjcClassInfo _ADXCheckableGroup_1 = { "", "com.google.android.material.internal", ptrTable, methods, fields, 7, 0x8010, 2, 1, 0, -1, 5, 6, -1 };
  return &_ADXCheckableGroup_1;
}

@end

void ADXCheckableGroup_1_initWithADXCheckableGroup_(ADXCheckableGroup_1 *self, ADXCheckableGroup *outer$) {
  JreStrongAssign(&self->this$0_, outer$);
  NSObject_init(self);
}

ADXCheckableGroup_1 *new_ADXCheckableGroup_1_initWithADXCheckableGroup_(ADXCheckableGroup *outer$) {
  J2OBJC_NEW_IMPL(ADXCheckableGroup_1, initWithADXCheckableGroup_, outer$)
}

ADXCheckableGroup_1 *create_ADXCheckableGroup_1_initWithADXCheckableGroup_(ADXCheckableGroup *outer$) {
  J2OBJC_CREATE_IMPL(ADXCheckableGroup_1, initWithADXCheckableGroup_, outer$)
}

@implementation ADXCheckableGroup_OnCheckedStateChangeListener

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, "V", 0x401, 0, 1, -1, 2, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(onCheckedStateChangedWithJavaUtilSet:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "onCheckedStateChanged", "LJavaUtilSet;", "(Ljava/util/Set<Ljava/lang/Integer;>;)V", "LADXCheckableGroup;" };
  static const J2ObjcClassInfo _ADXCheckableGroup_OnCheckedStateChangeListener = { "OnCheckedStateChangeListener", "com.google.android.material.internal", ptrTable, methods, NULL, 7, 0x609, 1, 0, 3, -1, -1, -1, -1 };
  return &_ADXCheckableGroup_OnCheckedStateChangeListener;
}

@end

J2OBJC_INTERFACE_TYPE_LITERAL_SOURCE(ADXCheckableGroup_OnCheckedStateChangeListener)
