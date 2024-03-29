//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroidX-core\src\main\java\androidx\core\view\ScrollingView.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ScrollingView")
#ifdef RESTRICT_ScrollingView
#define INCLUDE_ALL_ScrollingView 0
#else
#define INCLUDE_ALL_ScrollingView 1
#endif
#undef RESTRICT_ScrollingView

#if !defined (ADXScrollingView_) && (INCLUDE_ALL_ScrollingView || defined(INCLUDE_ADXScrollingView))
#define ADXScrollingView_

/*!
 @brief An interface that can be implemented by Views to provide scroll related APIs.
 */
@protocol ADXScrollingView < JavaObject >

/*!
 @brief <p>Compute the horizontal range that the horizontal scrollbar
  represents.
 </p>
  
 <p>The range is expressed in arbitrary units that must be the same as the
  units used by <code>computeHorizontalScrollExtent()</code> and 
 <code>computeHorizontalScrollOffset()</code>.</p>
  
 <p>The default range is the drawing width of this view.</p>
 @return the total horizontal range represented by the horizontal
          scrollbar
 - seealso: #computeHorizontalScrollExtent()
 - seealso: #computeHorizontalScrollOffset()
 */
- (jint)computeHorizontalScrollRange;

/*!
 @brief <p>Compute the horizontal offset of the horizontal scrollbar's thumb
  within the horizontal range.
 This value is used to compute the position
  of the thumb within the scrollbar's track.</p>
  
 <p>The range is expressed in arbitrary units that must be the same as the
  units used by <code>computeHorizontalScrollRange()</code> and 
 <code>computeHorizontalScrollExtent()</code>.</p>
  
 <p>The default offset is the scroll offset of this view.</p>
 @return the horizontal offset of the scrollbar's thumb
 - seealso: #computeHorizontalScrollRange()
 - seealso: #computeHorizontalScrollExtent()
 */
- (jint)computeHorizontalScrollOffset;

/*!
 @brief <p>Compute the horizontal extent of the horizontal scrollbar's thumb
  within the horizontal range.
 This value is used to compute the length
  of the thumb within the scrollbar's track.</p>
  
 <p>The range is expressed in arbitrary units that must be the same as the
  units used by <code>computeHorizontalScrollRange()</code> and 
 <code>computeHorizontalScrollOffset()</code>.</p>
  
 <p>The default extent is the drawing width of this view.</p>
 @return the horizontal extent of the scrollbar's thumb
 - seealso: #computeHorizontalScrollRange()
 - seealso: #computeHorizontalScrollOffset()
 */
- (jint)computeHorizontalScrollExtent;

/*!
 @brief <p>Compute the vertical range that the vertical scrollbar represents.
 </p>
  
 <p>The range is expressed in arbitrary units that must be the same as the
  units used by <code>computeVerticalScrollExtent()</code> and 
 <code>computeVerticalScrollOffset()</code>.</p>
 @return the total vertical range represented by the vertical scrollbar 
 <p>The default range is the drawing height of this view.</p>
 - seealso: #computeVerticalScrollExtent()
 - seealso: #computeVerticalScrollOffset()
 */
- (jint)computeVerticalScrollRange;

/*!
 @brief <p>Compute the vertical offset of the vertical scrollbar's thumb
  within the horizontal range.
 This value is used to compute the position
  of the thumb within the scrollbar's track.</p>
  
 <p>The range is expressed in arbitrary units that must be the same as the
  units used by <code>computeVerticalScrollRange()</code> and 
 <code>computeVerticalScrollExtent()</code>.</p>
  
 <p>The default offset is the scroll offset of this view.</p>
 @return the vertical offset of the scrollbar's thumb
 - seealso: #computeVerticalScrollRange()
 - seealso: #computeVerticalScrollExtent()
 */
- (jint)computeVerticalScrollOffset;

/*!
 @brief <p>Compute the vertical extent of the vertical scrollbar's thumb
  within the vertical range.
 This value is used to compute the length
  of the thumb within the scrollbar's track.</p>
  
 <p>The range is expressed in arbitrary units that must be the same as the
  units used by <code>computeVerticalScrollRange()</code> and 
 <code>computeVerticalScrollOffset()</code>.</p>
  
 <p>The default extent is the drawing height of this view.</p>
 @return the vertical extent of the scrollbar's thumb
 - seealso: #computeVerticalScrollRange()
 - seealso: #computeVerticalScrollOffset()
 */
- (jint)computeVerticalScrollExtent;

@end

J2OBJC_EMPTY_STATIC_INIT(ADXScrollingView)

J2OBJC_TYPE_LITERAL_HEADER(ADXScrollingView)

#define AndroidxCoreViewScrollingView ADXScrollingView

#endif

#pragma pop_macro("INCLUDE_ALL_ScrollingView")
