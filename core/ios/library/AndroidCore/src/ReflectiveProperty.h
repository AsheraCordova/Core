//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\util\ReflectiveProperty.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ReflectiveProperty")
#ifdef RESTRICT_ReflectiveProperty
#define INCLUDE_ALL_ReflectiveProperty 0
#else
#define INCLUDE_ALL_ReflectiveProperty 1
#endif
#undef RESTRICT_ReflectiveProperty

#if !defined (ADReflectiveProperty_) && (INCLUDE_ALL_ReflectiveProperty || defined(INCLUDE_ADReflectiveProperty))
#define ADReflectiveProperty_

#define RESTRICT_Property 1
#define INCLUDE_ADProperty 1
#include "Property.h"

@class IOSClass;

/*!
 @brief Internal class to automatically generate a Property for a given class/name pair, given the
  specification of <code>Property.of(java.lang.Class, java.lang.Class, java.lang.String)</code>
 */
@interface ADReflectiveProperty : ADProperty

#pragma mark Public

/*!
 @brief For given property name 'name', look for getName/isName method or 'name' field.
 Also look for setName method (optional - could be readonly). Failing method getters and
  field results in throwing NoSuchPropertyException.
 @param propertyHolder The class on which the methods or field are found
 @param name The name of the property, where this name is capitalized and appended to  "get" and "is to search for the appropriate methods. If the get/is methods are not found,
   the constructor will search for a field with that exact name.
 */
- (instancetype)initPackagePrivateWithIOSClass:(IOSClass *)propertyHolder
                                  withIOSClass:(IOSClass *)valueType
                                  withNSString:(NSString *)name;

- (id)getWithId:(id)object;

/*!
 @brief Returns false if there is no setter or public field underlying this Property.
 */
- (jboolean)isReadOnly;

- (void)setWithId:(id)object
           withId:(id)value;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithIOSClass:(IOSClass *)arg0
                    withNSString:(NSString *)arg1 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADReflectiveProperty)

FOUNDATION_EXPORT void ADReflectiveProperty_initPackagePrivateWithIOSClass_withIOSClass_withNSString_(ADReflectiveProperty *self, IOSClass *propertyHolder, IOSClass *valueType, NSString *name);

FOUNDATION_EXPORT ADReflectiveProperty *new_ADReflectiveProperty_initPackagePrivateWithIOSClass_withIOSClass_withNSString_(IOSClass *propertyHolder, IOSClass *valueType, NSString *name) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADReflectiveProperty *create_ADReflectiveProperty_initPackagePrivateWithIOSClass_withIOSClass_withNSString_(IOSClass *propertyHolder, IOSClass *valueType, NSString *name);

J2OBJC_TYPE_LITERAL_HEADER(ADReflectiveProperty)

@compatibility_alias RAndroidUtilReflectiveProperty ADReflectiveProperty;

#endif

#pragma pop_macro("INCLUDE_ALL_ReflectiveProperty")
