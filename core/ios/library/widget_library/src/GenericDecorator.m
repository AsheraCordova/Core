//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\widget\GenericDecorator.java
//

#include "GenericDecorator.h"
#include "ICompositeDecorator.h"
#include "IDecorator.h"
#include "ILifeCycleDecorator.h"
#include "IWidget.h"
#include "J2ObjC_source.h"
#include "WidgetAttribute.h"
#include "java/util/List.h"
#include "java/util/Map.h"

@protocol JavaUtilList;


@interface ASGenericDecorator () {
 @public
  id<ASIWidget> wrappedWidget_;
  id<ASICompositeDecorator> wrappingWidget_;
  id<JavaUtilList> supportedAttributes_;
}

@end

J2OBJC_FIELD_SETTER(ASGenericDecorator, wrappedWidget_, id<ASIWidget>)
J2OBJC_FIELD_SETTER(ASGenericDecorator, wrappingWidget_, id<ASICompositeDecorator>)
J2OBJC_FIELD_SETTER(ASGenericDecorator, supportedAttributes_, id<JavaUtilList>)

inline NSString *ASGenericDecorator_get_LOCAL_NAME(void);
static NSString *ASGenericDecorator_LOCAL_NAME = @"generic";
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASGenericDecorator, LOCAL_NAME, NSString *)

@implementation ASGenericDecorator

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASGenericDecorator_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (void)setSupportedAttributesWithJavaUtilList:(id<JavaUtilList>)supportedAttributes {
  JreStrongAssign(&self->supportedAttributes_, supportedAttributes);
}

- (id<ASIDecorator>)newInstanceWithASICompositeDecorator:(id<ASICompositeDecorator>)wrappingWidget
                                           withASIWidget:(id<ASIWidget>)wrappedWidget {
  ASGenericDecorator *decorator = create_ASGenericDecorator_init();
  JreStrongAssign(&decorator->wrappedWidget_, wrappedWidget);
  JreStrongAssign(&decorator->wrappingWidget_, wrappingWidget);
  return decorator;
}

- (id<ASIWidget>)getWrappedWidget {
  return wrappedWidget_;
}

- (void)createWithJavaUtilMap:(id<JavaUtilMap>)metadata {
}

- (jboolean)setAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
                                 withNSString:(NSString *)strValue
                                       withId:(id)objValue
                    withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)lifeCycleDecorator {
  if ([((id<JavaUtilList>) nil_chk(supportedAttributes_)) containsWithId:[((ASWidgetAttribute *) nil_chk(key)) getAttributeName]]) {
    [((id<ASICompositeDecorator>) nil_chk(wrappingWidget_)) setAttributeWithASWidgetAttribute:key withNSString:strValue withId:objValue withASILifeCycleDecorator:lifeCycleDecorator withBoolean:true];
    return true;
  }
  return false;
}

- (void)initialized {
}

- (NSString *)getLocalName {
  return ASGenericDecorator_LOCAL_NAME;
}

- (id<JavaUtilList>)getSupportedAttributes {
  return supportedAttributes_;
}

- (void)dealloc {
  RELEASE_(wrappedWidget_);
  RELEASE_(wrappingWidget_);
  RELEASE_(supportedAttributes_);
  [super dealloc];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 0, 1, -1, 2, -1, -1 },
    { NULL, "LASIDecorator;", 0x1, 3, 4, -1, -1, -1, -1 },
    { NULL, "LASIWidget;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 5, 6, -1, 7, -1, -1 },
    { NULL, "Z", 0x1, 8, 9, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LJavaUtilList;", 0x1, -1, -1, -1, 10, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(setSupportedAttributesWithJavaUtilList:);
  methods[2].selector = @selector(newInstanceWithASICompositeDecorator:withASIWidget:);
  methods[3].selector = @selector(getWrappedWidget);
  methods[4].selector = @selector(createWithJavaUtilMap:);
  methods[5].selector = @selector(setAttributeWithASWidgetAttribute:withNSString:withId:withASILifeCycleDecorator:);
  methods[6].selector = @selector(initialized);
  methods[7].selector = @selector(getLocalName);
  methods[8].selector = @selector(getSupportedAttributes);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "LOCAL_NAME", "LNSString;", .constantValue.asLong = 0, 0x1a, -1, 11, -1, -1 },
    { "wrappedWidget_", "LASIWidget;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "wrappingWidget_", "LASICompositeDecorator;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "supportedAttributes_", "LJavaUtilList;", .constantValue.asLong = 0, 0x2, -1, -1, 12, -1 },
  };
  static const void *ptrTable[] = { "setSupportedAttributes", "LJavaUtilList;", "(Ljava/util/List<Ljava/lang/String;>;)V", "newInstance", "LASICompositeDecorator;LASIWidget;", "create", "LJavaUtilMap;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V", "setAttribute", "LASWidgetAttribute;LNSString;LNSObject;LASILifeCycleDecorator;", "()Ljava/util/List<Ljava/lang/String;>;", &ASGenericDecorator_LOCAL_NAME, "Ljava/util/List<Ljava/lang/String;>;" };
  static const J2ObjcClassInfo _ASGenericDecorator = { "GenericDecorator", "com.ashera.widget", ptrTable, methods, fields, 7, 0x1, 9, 4, -1, -1, -1, -1, -1 };
  return &_ASGenericDecorator;
}

@end

void ASGenericDecorator_init(ASGenericDecorator *self) {
  NSObject_init(self);
}

ASGenericDecorator *new_ASGenericDecorator_init() {
  J2OBJC_NEW_IMPL(ASGenericDecorator, init)
}

ASGenericDecorator *create_ASGenericDecorator_init() {
  J2OBJC_CREATE_IMPL(ASGenericDecorator, init)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASGenericDecorator)
