//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\model\FontMetricsDescriptor.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_FontMetricsDescriptor")
#ifdef RESTRICT_FontMetricsDescriptor
#define INCLUDE_ALL_FontMetricsDescriptor 0
#else
#define INCLUDE_ALL_FontMetricsDescriptor 1
#endif
#undef RESTRICT_FontMetricsDescriptor

#if !defined (ASFontMetricsDescriptor_) && (INCLUDE_ALL_FontMetricsDescriptor || defined(INCLUDE_ASFontMetricsDescriptor))
#define ASFontMetricsDescriptor_

@interface ASFontMetricsDescriptor : NSObject {
 @public
  /*!
   @brief The maximum distance above the baseline for the tallest glyph in
  the font at a given text size.
   */
  jint top_;
  /*!
   @brief The recommended distance above the baseline for singled spaced text.
   */
  jint ascent_;
  /*!
   @brief The recommended distance below the baseline for singled spaced text.
   */
  jint descent_;
  /*!
   @brief The maximum distance below the baseline for the lowest glyph in
  the font at a given text size.
   */
  jint bottom_;
  /*!
   @brief The recommended additional space to add between lines of text.
   */
  jint leading_;
}

#pragma mark Public

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASFontMetricsDescriptor)

FOUNDATION_EXPORT void ASFontMetricsDescriptor_init(ASFontMetricsDescriptor *self);

FOUNDATION_EXPORT ASFontMetricsDescriptor *new_ASFontMetricsDescriptor_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASFontMetricsDescriptor *create_ASFontMetricsDescriptor_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASFontMetricsDescriptor)

@compatibility_alias ComAsheraModelFontMetricsDescriptor ASFontMetricsDescriptor;

#endif

#pragma pop_macro("INCLUDE_ALL_FontMetricsDescriptor")
