//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: /Users/ramm/git/core-widget_library/widget_library/build/classes/com/ashera/widget/ITemplate.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ITemplate")
#ifdef RESTRICT_ITemplate
#define INCLUDE_ALL_ITemplate 0
#else
#define INCLUDE_ALL_ITemplate 1
#endif
#undef RESTRICT_ITemplate

#if !defined (ASITemplate_) && (INCLUDE_ALL_ITemplate || defined(INCLUDE_ASITemplate))
#define ASITemplate_

#define RESTRICT_HasWidgets 1
#define INCLUDE_ASHasWidgets 1
#include "HasWidgets.h"

@protocol ASIWidget;

@protocol ASITemplate < ASHasWidgets, JavaObject >

- (NSString *)getId;

- (id<ASIWidget>)loadLazyWidgets;

- (id<ASIWidget>)loadLazyWidgetsWithId:(id)parentView;

- (id<ASIWidget>)loadLazyWidgetsIntoParentWithASHasWidgets:(id<ASHasWidgets>)parent;

@end

J2OBJC_EMPTY_STATIC_INIT(ASITemplate)

J2OBJC_TYPE_LITERAL_HEADER(ASITemplate)

#define ComAsheraWidgetITemplate ASITemplate

#endif

#pragma pop_macro("INCLUDE_ALL_ITemplate")
