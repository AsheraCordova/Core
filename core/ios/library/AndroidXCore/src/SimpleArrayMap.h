//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroidX-core\src\main\java\androidx\collection\SimpleArrayMap.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_SimpleArrayMap")
#ifdef RESTRICT_SimpleArrayMap
#define INCLUDE_ALL_SimpleArrayMap 0
#else
#define INCLUDE_ALL_SimpleArrayMap 1
#endif
#undef RESTRICT_SimpleArrayMap

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (ADXSimpleArrayMap_) && (INCLUDE_ALL_SimpleArrayMap || defined(INCLUDE_ADXSimpleArrayMap))
#define ADXSimpleArrayMap_

@class IOSIntArray;
@class IOSObjectArray;

/*!
 @brief Base implementation of <code>ArrayMap</code> that doesn't include any standard Java
  container API interoperability.These features are generally heavier-weight ways
  to interact with the container, so discouraged, but they can be useful to make it
  easier to use as a drop-in replacement for HashMap.
 If you don't need them, this
  class can be preferrable since it doesn't bring in any of the implementation of those
  APIs, allowing that code to be stripped by ProGuard.
 */
@interface ADXSimpleArrayMap : NSObject {
 @public
  IOSIntArray *mHashes_;
  IOSObjectArray *mArray_;
  jint mSize_;
}

#pragma mark Public

/*!
 @brief Create a new empty ArrayMap.The default capacity of an array map is 0, and
  will grow once items are added to it.
 */
- (instancetype)init;

/*!
 @brief Create a new ArrayMap with a given initial capacity.
 */
- (instancetype)initWithInt:(jint)capacity;

/*!
 @brief Create a new ArrayMap with the mappings from the given ArrayMap.
 */
- (instancetype)initWithADXSimpleArrayMap:(ADXSimpleArrayMap *)map;

/*!
 @brief Make the array map empty.All storage is released.
 */
- (void)clear;

/*!
 @brief Check whether a key exists in the array.
 @param key The key to search for.
 @return Returns true if the key exists, else false.
 */
- (jboolean)containsKeyWithId:(id)key;

/*!
 @brief Check whether a value exists in the array.This requires a linear search
  through the entire array.
 @param value The value to search for.
 @return Returns true if the value exists, else false.
 */
- (jboolean)containsValueWithId:(id)value;

/*!
 @brief Ensure the array map can hold at least <var>minimumCapacity</var>
  items.
 */
- (void)ensureCapacityWithInt:(jint)minimumCapacity;

/*!
 @brief <p>This implementation returns false if the object is not a Map or
  SimpleArrayMap, or if the maps have different sizes.
 Otherwise, for each
  key in this map, values of both maps are compared. If the values for any
  key are not equal, the method returns false, otherwise it returns true.
 */
- (jboolean)isEqual:(id)object;

/*!
 @brief Retrieve a value from the array.
 @param key The key of the value to retrieve.
 @return Returns the value associated with the given key,
  or null if there is no such key.
 */
- (id)getWithId:(id)key;

/*!
 @brief Retrieve a value from the array, or <code>defaultValue</code> if there is no mapping for the key.
 @param key The key of the value to retrieve.
 @param defaultValue The default mapping of the key
 @return Returns the value associated with the given key,
  or <code>defaultValue</code> if there is no mapping for the key.
 */
- (id)getOrDefaultWithId:(id)key
                  withId:(id)defaultValue;

/*!
 */
- (NSUInteger)hash;

/*!
 @brief Returns the index of a key in the set.
 @param key The key to search for.
 @return Returns the index of the key if it exists, else a negative integer.
 */
- (jint)indexOfKeyWithId:(id)key;

/*!
 @brief Return true if the array map contains no items.
 */
- (jboolean)isEmpty;

/*!
 @brief Return the key at the given index in the array.
 @param index The desired index, must be between 0 and <code>size()</code> -1.
 @return Returns the key stored at the given index.
 */
- (id)keyAtWithInt:(jint)index;

/*!
 @brief Add a new value to the array map.
 @param key The key under which to store the value.   <b> Must not be null. </b>   If
   this key already exists in the array, its value will be replaced.
 @param value The value to store for the given key.
 @return Returns the old value that was stored for the given key, or null if there
  was no such key.
 */
- (id)putWithId:(id)key
         withId:(id)value;

/*!
 @brief Perform a <code>put(Object, Object)</code> of all key/value pairs in <var>array</var>
 @param array The array whose contents are to be retrieved.
 */
- (void)putAllWithADXSimpleArrayMap:(ADXSimpleArrayMap *)array;

/*!
 @brief Add a new value to the array map only if the key does not already have a value or it is
  mapped to <code>null</code>.
 @param key The key under which to store the value.
 @param value The value to store for the given key.
 @return Returns the value that was stored for the given key, or null if there
  was no such key.
 */
- (id)putIfAbsentWithId:(id)key
                 withId:(id)value;

/*!
 @brief Remove an existing key from the array map.
 @param key The key of the mapping to remove.
 @return Returns the value that was stored under the key, or null if there
  was no such key.
 */
- (id)removeWithId:(id)key;

/*!
 @brief Remove an existing key from the array map only if it is currently mapped to <code>value</code>.
 @param key The key of the mapping to remove.
 @param value The value expected to be mapped to the key.
 @return Returns true if the mapping was removed.
 */
- (jboolean)removeWithId:(id)key
                  withId:(id)value;

/*!
 @brief Remove the key/value mapping at the given index.
 @param index The desired index, must be between 0 and <code>size()</code> -1.
 @return Returns the value that was stored at this index.
 */
- (id)removeAtWithInt:(jint)index;

/*!
 @brief Replace the mapping for <code>key</code> only if it is already mapped to a value.
 @param key The key of the mapping to replace.
 @param value The value to store for the given key.
 @return Returns the previous mapped value or null.
 */
- (id)replaceWithId:(id)key
             withId:(id)value;

/*!
 @brief Replace the mapping for <code>key</code> only if it is already mapped to a value.
 @param key The key of the mapping to replace.
 @param oldValue The value expected to be mapped to the key.
 @param newValue The value to store for the given key.
 @return Returns true if the value was replaced.
 */
- (jboolean)replaceWithId:(id)key
                   withId:(id)oldValue
                   withId:(id)newValue;

/*!
 @brief Set the value at a given index in the array.
 @param index The desired index, must be between 0 and <code>size()</code> -1.
 @param value The new value to store at this index.
 @return Returns the previous value at the given index.
 */
- (id)setValueAtWithInt:(jint)index
                 withId:(id)value;

/*!
 @brief Return the number of items in this array map.
 */
- (jint)size;

/*!
 @brief <p>This implementation composes a string by iterating over its mappings.
 If
  this map contains itself as a key or a value, the string "(this Map)"
  will appear in its place.
 */
- (NSString *)description;

/*!
 @brief Return the value at the given index in the array.
 @param index The desired index, must be between 0 and <code>size()</code> -1.
 @return Returns the value stored at the given index.
 */
- (id)valueAtWithInt:(jint)index;

#pragma mark Package-Private

- (jint)indexOfWithId:(id)key
              withInt:(jint)hash_;

- (jint)indexOfNull;

- (jint)indexOfValueWithId:(id)value;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXSimpleArrayMap)

J2OBJC_FIELD_SETTER(ADXSimpleArrayMap, mHashes_, IOSIntArray *)
J2OBJC_FIELD_SETTER(ADXSimpleArrayMap, mArray_, IOSObjectArray *)

/*!
 @brief Caches of small array objects to avoid spamming garbage.The cache
  Object[] variable is a pointer to a linked list of array objects.
 The first entry in the array is a pointer to the next array in the
  list; the second entry is a pointer to the int[] hash code array for it.
 */
inline IOSObjectArray *ADXSimpleArrayMap_get_mBaseCache(void);
inline IOSObjectArray *ADXSimpleArrayMap_set_mBaseCache(IOSObjectArray *value);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT IOSObjectArray *ADXSimpleArrayMap_mBaseCache;
J2OBJC_STATIC_FIELD_OBJ(ADXSimpleArrayMap, mBaseCache, IOSObjectArray *)

inline jint ADXSimpleArrayMap_get_mBaseCacheSize(void);
inline jint ADXSimpleArrayMap_set_mBaseCacheSize(jint value);
inline jint *ADXSimpleArrayMap_getRef_mBaseCacheSize(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT jint ADXSimpleArrayMap_mBaseCacheSize;
J2OBJC_STATIC_FIELD_PRIMITIVE(ADXSimpleArrayMap, mBaseCacheSize, jint)

inline IOSObjectArray *ADXSimpleArrayMap_get_mTwiceBaseCache(void);
inline IOSObjectArray *ADXSimpleArrayMap_set_mTwiceBaseCache(IOSObjectArray *value);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT IOSObjectArray *ADXSimpleArrayMap_mTwiceBaseCache;
J2OBJC_STATIC_FIELD_OBJ(ADXSimpleArrayMap, mTwiceBaseCache, IOSObjectArray *)

inline jint ADXSimpleArrayMap_get_mTwiceBaseCacheSize(void);
inline jint ADXSimpleArrayMap_set_mTwiceBaseCacheSize(jint value);
inline jint *ADXSimpleArrayMap_getRef_mTwiceBaseCacheSize(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT jint ADXSimpleArrayMap_mTwiceBaseCacheSize;
J2OBJC_STATIC_FIELD_PRIMITIVE(ADXSimpleArrayMap, mTwiceBaseCacheSize, jint)

FOUNDATION_EXPORT void ADXSimpleArrayMap_init(ADXSimpleArrayMap *self);

FOUNDATION_EXPORT ADXSimpleArrayMap *new_ADXSimpleArrayMap_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADXSimpleArrayMap *create_ADXSimpleArrayMap_init(void);

FOUNDATION_EXPORT void ADXSimpleArrayMap_initWithInt_(ADXSimpleArrayMap *self, jint capacity);

FOUNDATION_EXPORT ADXSimpleArrayMap *new_ADXSimpleArrayMap_initWithInt_(jint capacity) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADXSimpleArrayMap *create_ADXSimpleArrayMap_initWithInt_(jint capacity);

FOUNDATION_EXPORT void ADXSimpleArrayMap_initWithADXSimpleArrayMap_(ADXSimpleArrayMap *self, ADXSimpleArrayMap *map);

FOUNDATION_EXPORT ADXSimpleArrayMap *new_ADXSimpleArrayMap_initWithADXSimpleArrayMap_(ADXSimpleArrayMap *map) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADXSimpleArrayMap *create_ADXSimpleArrayMap_initWithADXSimpleArrayMap_(ADXSimpleArrayMap *map);

J2OBJC_TYPE_LITERAL_HEADER(ADXSimpleArrayMap)

@compatibility_alias AndroidxCollectionSimpleArrayMap ADXSimpleArrayMap;

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_SimpleArrayMap")
