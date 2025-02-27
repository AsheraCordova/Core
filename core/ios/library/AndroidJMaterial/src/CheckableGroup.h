//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\AndroidJMaterial\src\main\java\com\google\android\material\internal\CheckableGroup.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_CheckableGroup")
#ifdef RESTRICT_CheckableGroup
#define INCLUDE_ALL_CheckableGroup 0
#else
#define INCLUDE_ALL_CheckableGroup 1
#endif
#undef RESTRICT_CheckableGroup

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (ADXCheckableGroup_) && (INCLUDE_ALL_CheckableGroup || defined(INCLUDE_ADXCheckableGroup))
#define ADXCheckableGroup_

@class ADViewGroup;
@protocol ADXCheckableGroup_OnCheckedStateChangeListener;
@protocol ADXMaterialCheckable;
@protocol JavaUtilList;
@protocol JavaUtilSet;

/*!
 @brief A helper class to support check group logic.
 */
@interface ADXCheckableGroup : NSObject

#pragma mark Public

- (instancetype)init;

- (void)addCheckableWithADXMaterialCheckable:(id<ADXMaterialCheckable>)checkable;

- (void)checkWithInt:(jint)id_;

- (void)clearCheck;

- (id<JavaUtilSet>)getCheckedIds;

- (id<JavaUtilList>)getCheckedIdsSortedByChildOrderWithADViewGroup:(ADViewGroup *)parent;

- (jint)getSingleCheckedId;

- (jboolean)isSelectionRequired;

- (jboolean)isSingleSelection;

- (void)removeCheckableWithADXMaterialCheckable:(id<ADXMaterialCheckable>)checkable;

- (void)setOnCheckedStateChangeListenerWithADXCheckableGroup_OnCheckedStateChangeListener:(id<ADXCheckableGroup_OnCheckedStateChangeListener>)listener;

- (void)setSelectionRequiredWithBoolean:(jboolean)selectionRequired;

- (void)setSingleSelectionWithBoolean:(jboolean)singleSelection;

- (void)uncheckWithInt:(jint)id_;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXCheckableGroup)

FOUNDATION_EXPORT void ADXCheckableGroup_init(ADXCheckableGroup *self);

FOUNDATION_EXPORT ADXCheckableGroup *new_ADXCheckableGroup_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADXCheckableGroup *create_ADXCheckableGroup_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADXCheckableGroup)

@compatibility_alias ComGoogleAndroidMaterialInternalCheckableGroup ADXCheckableGroup;

#endif

#if !defined (ADXCheckableGroup_OnCheckedStateChangeListener_) && (INCLUDE_ALL_CheckableGroup || defined(INCLUDE_ADXCheckableGroup_OnCheckedStateChangeListener))
#define ADXCheckableGroup_OnCheckedStateChangeListener_

@protocol JavaUtilSet;

/*!
 @brief A listener interface for checked state changes.
 */
@protocol ADXCheckableGroup_OnCheckedStateChangeListener < JavaObject >

- (void)onCheckedStateChangedWithJavaUtilSet:(id<JavaUtilSet>)checkedIds;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXCheckableGroup_OnCheckedStateChangeListener)

J2OBJC_TYPE_LITERAL_HEADER(ADXCheckableGroup_OnCheckedStateChangeListener)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_CheckableGroup")
