//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\util\IntProperty.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_IntProperty")
#ifdef RESTRICT_IntProperty
#define INCLUDE_ALL_IntProperty 0
#else
#define INCLUDE_ALL_IntProperty 1
#endif
#undef RESTRICT_IntProperty

#if !defined (ADIntProperty_) && (INCLUDE_ALL_IntProperty || defined(INCLUDE_ADIntProperty))
#define ADIntProperty_

#define RESTRICT_Property 1
#define INCLUDE_ADProperty 1
#include "Property.h"

@class IOSClass;
@class JavaLangInteger;

/*!
 @brief An implementation of <code>r.android.util.Property</code> to be used specifically with fields of type 
 <code>int</code>.This type-specific subclass enables performance benefit by allowing
  calls to a <code>setValue()</code> function that takes the primitive 
 <code>int</code> type and avoids autoboxing and other overhead associated with the 
 <code>Integer</code> class.
 */
@interface ADIntProperty : ADProperty

#pragma mark Public

- (instancetype)initWithNSString:(NSString *)name;

- (JavaLangInteger *)getWithId:(id)arg0;

- (void)setWithId:(id)object
           withId:(JavaLangInteger *)value;

/*!
 @brief A type-specific variant of <code>set(Object, Integer)</code> that is faster when dealing
  with fields of type <code>int</code>.
 */
- (void)setValueWithId:(id)object
               withInt:(jint)value;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithIOSClass:(IOSClass *)arg0
                    withNSString:(NSString *)arg1 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADIntProperty)

FOUNDATION_EXPORT void ADIntProperty_initWithNSString_(ADIntProperty *self, NSString *name);

J2OBJC_TYPE_LITERAL_HEADER(ADIntProperty)

@compatibility_alias RAndroidUtilIntProperty ADIntProperty;

#endif

#pragma pop_macro("INCLUDE_ALL_IntProperty")
