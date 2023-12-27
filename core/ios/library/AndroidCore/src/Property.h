//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\util\Property.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_Property")
#ifdef RESTRICT_Property
#define INCLUDE_ALL_Property 0
#else
#define INCLUDE_ALL_Property 1
#endif
#undef RESTRICT_Property

#if !defined (ADProperty_) && (INCLUDE_ALL_Property || defined(INCLUDE_ADProperty))
#define ADProperty_

@class IOSClass;

/*!
 @brief A property is an abstraction that can be used to represent a <emb>mutable</em> value that is held
  in a <em>host</em> object.The Property's <code>set(Object, Object)</code> or <code>get(Object)</code>
  methods can be implemented in terms of the private fields of the host object, or via "setter" and
  "getter" methods or by some other mechanism, as appropriate.
 */
@interface ADProperty : NSObject

#pragma mark Public

/*!
 @brief A constructor that takes an identifying name and <code>type</code> for the property.
 */
- (instancetype)initWithIOSClass:(IOSClass *)type
                    withNSString:(NSString *)name;

/*!
 @brief Returns the current value that this property represents on the given <code>object</code>.
 */
- (id)getWithId:(id)object;

/*!
 @brief Returns the name for this property.
 */
- (NSString *)getName;

/*!
 @brief Returns the type for this property.
 */
- (IOSClass *)getType;

/*!
 @brief Returns true if the <code>set(Object, Object)</code> method does not set the value on the target
  object (in which case the <code>set()</code> method should throw a <code>NoSuchPropertyException</code>
  exception).This may happen if the Property wraps functionality that
  allows querying the underlying value but not setting it.
 For example, the <code>of(Class,
 Class, String)</code>
  factory method may return a Property with name "foo" for an object that has
  only a <code>getFoo()</code> or <code>isFoo()</code> method, but no matching 
 <code>setFoo()</code> method.
 */
- (jboolean)isReadOnly;

/*!
 @brief This factory method creates and returns a Property given the <code>class</code> and 
 <code>name</code> parameters, where the <code>"name"</code> parameter represents either: 
 <ul>
      <li>a public <code>getName()</code> method on the class which takes no arguments, plus an
      optional public <code>setName()</code> method which takes a value of the same type
      returned by <code>getName()</code>
      <li>a public <code>isName()</code> method on the class which takes no arguments, plus an
      optional public <code>setName()</code> method which takes a value of the same type
      returned by <code>isName()</code>
      <li>a public <code>name</code> field on the class 
 </ul>
 <p>If either of the get/is method alternatives is found on the class, but an appropriate 
 <code>setName()</code> method is not found, the <code>Property</code> will be 
 <code>readOnly</code>.
 Calling the <code>set(Object, Object)</code> method on such
  a property is allowed, but will have no effect.</p>
  
 <p>If neither the methods nor the field are found on the class a 
 <code>NoSuchPropertyException</code> exception will be thrown.</p>
 */
+ (ADProperty *)ofWithIOSClass:(IOSClass *)hostType
                  withIOSClass:(IOSClass *)valueType
                  withNSString:(NSString *)name;

/*!
 @brief Sets the value on <code>object</code> which this property represents.If the method is unable
  to set the value on the target object it will throw an <code>UnsupportedOperationException</code>
  exception.
 */
- (void)setWithId:(id)object
           withId:(id)value;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ADProperty)

FOUNDATION_EXPORT ADProperty *ADProperty_ofWithIOSClass_withIOSClass_withNSString_(IOSClass *hostType, IOSClass *valueType, NSString *name);

FOUNDATION_EXPORT void ADProperty_initWithIOSClass_withNSString_(ADProperty *self, IOSClass *type, NSString *name);

J2OBJC_TYPE_LITERAL_HEADER(ADProperty)

@compatibility_alias RAndroidUtilProperty ADProperty;

#endif

#pragma pop_macro("INCLUDE_ALL_Property")
