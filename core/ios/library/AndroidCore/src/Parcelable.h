//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\stub\r\android\os\Parcelable.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_Parcelable")
#ifdef RESTRICT_Parcelable
#define INCLUDE_ALL_Parcelable 0
#else
#define INCLUDE_ALL_Parcelable 1
#endif
#undef RESTRICT_Parcelable

#if !defined (ADParcelable_) && (INCLUDE_ALL_Parcelable || defined(INCLUDE_ADParcelable))
#define ADParcelable_

@protocol ADParcel;

@protocol ADParcelable < JavaObject >

- (jint)describeContents;

- (void)writeToParcelWithADParcel:(id<ADParcel>)outArg
                          withInt:(jint)flags;

@end

J2OBJC_EMPTY_STATIC_INIT(ADParcelable)

J2OBJC_TYPE_LITERAL_HEADER(ADParcelable)

#define RAndroidOsParcelable ADParcelable

#endif

#if !defined (ADParcelable_Creator_) && (INCLUDE_ALL_Parcelable || defined(INCLUDE_ADParcelable_Creator))
#define ADParcelable_Creator_

@class IOSObjectArray;
@protocol ADParcel;

@interface ADParcelable_Creator : NSObject

#pragma mark Public

- (instancetype)init;

- (id)createFromParcelWithADParcel:(id<ADParcel>)inArg;

- (IOSObjectArray *)newArrayWithInt:(jint)size OBJC_METHOD_FAMILY_NONE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADParcelable_Creator)

FOUNDATION_EXPORT void ADParcelable_Creator_init(ADParcelable_Creator *self);

FOUNDATION_EXPORT ADParcelable_Creator *new_ADParcelable_Creator_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADParcelable_Creator *create_ADParcelable_Creator_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADParcelable_Creator)

#endif

#pragma pop_macro("INCLUDE_ALL_Parcelable")
