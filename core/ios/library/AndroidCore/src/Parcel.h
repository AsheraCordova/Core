//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\stub\r\android\os\Parcel.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_Parcel")
#ifdef RESTRICT_Parcel
#define INCLUDE_ALL_Parcel 0
#else
#define INCLUDE_ALL_Parcel 1
#endif
#undef RESTRICT_Parcel

#if !defined (ADParcel_) && (INCLUDE_ALL_Parcel || defined(INCLUDE_ADParcel))
#define ADParcel_

@class IOSIntArray;
@class JavaLangClassLoader;
@protocol JavaUtilList;

@protocol ADParcel < JavaObject >

- (jfloat)readFloat;

- (void)writeFloatWithFloat:(jfloat)value;

- (void)readIntArrayWithIntArray:(IOSIntArray *)mGapPerSpan;

- (id<JavaUtilList>)readArrayListWithJavaLangClassLoader:(JavaLangClassLoader *)classLoader;

- (void)writeListWithJavaUtilList:(id<JavaUtilList>)mFullSpanItems;

- (jint)readInt;

- (void)writeIntWithInt:(jint)x;

@end

J2OBJC_EMPTY_STATIC_INIT(ADParcel)

J2OBJC_TYPE_LITERAL_HEADER(ADParcel)

#define RAndroidOsParcel ADParcel

#endif

#pragma pop_macro("INCLUDE_ALL_Parcel")
