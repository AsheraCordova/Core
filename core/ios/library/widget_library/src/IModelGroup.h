//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\model\IModelGroup.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_IModelGroup")
#ifdef RESTRICT_IModelGroup
#define INCLUDE_ALL_IModelGroup 0
#else
#define INCLUDE_ALL_IModelGroup 1
#endif
#undef RESTRICT_IModelGroup

#if !defined (ASIModelGroup_) && (INCLUDE_ALL_IModelGroup || defined(INCLUDE_ASIModelGroup))
#define ASIModelGroup_

#define RESTRICT_IModel 1
#define INCLUDE_ASIModel 1
#include "IModel.h"

@protocol JavaUtilList;

@protocol ASIModelGroup < ASIModel, JavaObject >

- (id<JavaUtilList>)getStableIds;

- (NSString *)getModelFor;

- (void)setModelForWithNSString:(NSString *)objValue;

- (void)addModelWithId:(id)model;

- (void)addAllModelWithId:(id)model;

- (void)addModelWithId:(id)model
               withInt:(jint)index;

- (void)removeModelAtIndexWithInt:(jint)index;

- (void)removeModelByIdWithNSString:(NSString *)id_;

- (NSString *)getModelDescPath;

- (void)setModelDescPathWithNSString:(NSString *)modelDescPath;

@end

J2OBJC_EMPTY_STATIC_INIT(ASIModelGroup)

J2OBJC_TYPE_LITERAL_HEADER(ASIModelGroup)

#define ComAsheraModelIModelGroup ASIModelGroup

#endif

#pragma pop_macro("INCLUDE_ALL_IModelGroup")
