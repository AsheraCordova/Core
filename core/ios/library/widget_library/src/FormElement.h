//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\validations\FormElement.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_FormElement")
#ifdef RESTRICT_FormElement
#define INCLUDE_ALL_FormElement 0
#else
#define INCLUDE_ALL_FormElement 1
#endif
#undef RESTRICT_FormElement

#if !defined (ASFormElement_) && (INCLUDE_ALL_FormElement || defined(INCLUDE_ASFormElement))
#define ASFormElement_

#define RESTRICT_IWidget 1
#define INCLUDE_ASIWidget 1
#include "IWidget.h"

@protocol JavaUtilList;

/*!
 @brief Wrapper interface for views
 */
@protocol ASFormElement < ASIWidget, JavaObject >

- (NSString *)getFormGroupId;

- (NSString *)getTextEntered;

- (jboolean)isViewVisible;

- (void)focus;

- (void)resetError;

- (void)showErrorWithNSString:(NSString *)message;

- (void)setCustomErrorMessageKeysWithJavaUtilList:(id<JavaUtilList>)customErrorMessageKeys;

- (void)setCustomErrorMessageValuesWithJavaUtilList:(id<JavaUtilList>)customErrorMessageValues;

- (NSString *)getCustomMessageWithNSString:(NSString *)key;

- (jint)getValidationErrorDisplayType;

- (void)setValidationErrorDisplayTypeWithInt:(jint)validationErrorDisplayType;

- (void)setNormalStyleWithNSString:(NSString *)style;

- (void)setErrorStyleWithNSString:(NSString *)errorStyle;

@end

J2OBJC_EMPTY_STATIC_INIT(ASFormElement)

inline jint ASFormElement_get_ERROR_DISPLAY_TYPE_POPUP(void);
#define ASFormElement_ERROR_DISPLAY_TYPE_POPUP 1
J2OBJC_STATIC_FIELD_CONSTANT(ASFormElement, ERROR_DISPLAY_TYPE_POPUP, jint)

inline jint ASFormElement_get_ERROR_DISPLAY_TYPE_LABEL(void);
#define ASFormElement_ERROR_DISPLAY_TYPE_LABEL 2
J2OBJC_STATIC_FIELD_CONSTANT(ASFormElement, ERROR_DISPLAY_TYPE_LABEL, jint)

inline jint ASFormElement_get_ERROR_DISPLAY_TYPE_STYLE(void);
#define ASFormElement_ERROR_DISPLAY_TYPE_STYLE 4
J2OBJC_STATIC_FIELD_CONSTANT(ASFormElement, ERROR_DISPLAY_TYPE_STYLE, jint)

J2OBJC_TYPE_LITERAL_HEADER(ASFormElement)

#define ComAsheraValidationsFormElement ASFormElement

#endif

#pragma pop_macro("INCLUDE_ALL_FormElement")
