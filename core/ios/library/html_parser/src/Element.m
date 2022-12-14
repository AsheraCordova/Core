//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\html_parser\src\repackaged\org\ccil\cowan\tagsoup\Element.java
//

#include "AttributesImpl.h"
#include "Element.h"
#include "ElementType.h"
#include "J2ObjC_source.h"


@interface TSElement () {
 @public
  TSElementType *theType_;
  TSAttributesImpl *theAtts_;
  TSElement *theNext_;
  jboolean preclosed_;
}

@end

J2OBJC_FIELD_SETTER(TSElement, theType_, TSElementType *)
J2OBJC_FIELD_SETTER(TSElement, theAtts_, TSAttributesImpl *)
J2OBJC_FIELD_SETTER(TSElement, theNext_, TSElement *)

@implementation TSElement

- (instancetype)initWithTSElementType:(TSElementType *)type
                          withBoolean:(jboolean)defaultAttributes {
  TSElement_initWithTSElementType_withBoolean_(self, type, defaultAttributes);
  return self;
}

- (TSElementType *)type {
  return theType_;
}

- (TSAttributesImpl *)atts {
  return theAtts_;
}

- (TSElement *)next {
  return theNext_;
}

- (void)setNextWithTSElement:(TSElement *)next {
  JreStrongAssign(&theNext_, next);
}

- (NSString *)name {
  return [((TSElementType *) nil_chk(theType_)) name];
}

- (NSString *)namespace__ {
  return [((TSElementType *) nil_chk(theType_)) namespace__];
}

- (NSString *)localName {
  return [((TSElementType *) nil_chk(theType_)) localName];
}

- (jint)model {
  return [((TSElementType *) nil_chk(theType_)) model];
}

- (jint)memberOf {
  return [((TSElementType *) nil_chk(theType_)) memberOf];
}

- (jint)flags {
  return [((TSElementType *) nil_chk(theType_)) flags];
}

- (TSElementType *)parent {
  return [((TSElementType *) nil_chk(theType_)) parent];
}

- (jboolean)canContainWithTSElement:(TSElement *)other {
  return [((TSElementType *) nil_chk(theType_)) canContainWithTSElementType:((TSElement *) nil_chk(other))->theType_];
}

- (void)setAttributeWithNSString:(NSString *)name
                    withNSString:(NSString *)type
                    withNSString:(NSString *)value {
  [((TSElementType *) nil_chk(theType_)) setAttributeWithTSAttributesImpl:theAtts_ withNSString:name withNSString:type withNSString:value];
}

- (void)anonymize {
  for (jint i = [((TSAttributesImpl *) nil_chk(theAtts_)) getLength] - 1; i >= 0; i--) {
    if ([((NSString *) nil_chk([((TSAttributesImpl *) nil_chk(theAtts_)) getTypeWithInt:i])) isEqual:@"ID"] || [((NSString *) nil_chk([((TSAttributesImpl *) nil_chk(theAtts_)) getQNameWithInt:i])) isEqual:@"name"]) {
      [((TSAttributesImpl *) nil_chk(theAtts_)) removeAttributeWithInt:i];
    }
  }
}

- (void)clean {
  for (jint i = [((TSAttributesImpl *) nil_chk(theAtts_)) getLength] - 1; i >= 0; i--) {
    NSString *name = JreRetainedLocalValue([((TSAttributesImpl *) nil_chk(theAtts_)) getLocalNameWithInt:i]);
    if ([((TSAttributesImpl *) nil_chk(theAtts_)) getValueWithInt:i] == nil || name == nil || [name java_length] == 0) {
      [((TSAttributesImpl *) nil_chk(theAtts_)) removeAttributeWithInt:i];
      continue;
    }
  }
}

- (void)preclose {
  preclosed_ = true;
}

- (jboolean)isPreclosed {
  return preclosed_;
}

- (void)dealloc {
  RELEASE_(theType_);
  RELEASE_(theAtts_);
  RELEASE_(theNext_);
  [super dealloc];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, 0, -1, -1, -1, -1 },
    { NULL, "LTSElementType;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LTSAttributesImpl;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LTSElement;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 1, 2, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, 3, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LTSElementType;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, 4, 2, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 5, 6, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(initWithTSElementType:withBoolean:);
  methods[1].selector = @selector(type);
  methods[2].selector = @selector(atts);
  methods[3].selector = @selector(next);
  methods[4].selector = @selector(setNextWithTSElement:);
  methods[5].selector = @selector(name);
  methods[6].selector = @selector(namespace__);
  methods[7].selector = @selector(localName);
  methods[8].selector = @selector(model);
  methods[9].selector = @selector(memberOf);
  methods[10].selector = @selector(flags);
  methods[11].selector = @selector(parent);
  methods[12].selector = @selector(canContainWithTSElement:);
  methods[13].selector = @selector(setAttributeWithNSString:withNSString:withNSString:);
  methods[14].selector = @selector(anonymize);
  methods[15].selector = @selector(clean);
  methods[16].selector = @selector(preclose);
  methods[17].selector = @selector(isPreclosed);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "theType_", "LTSElementType;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "theAtts_", "LTSAttributesImpl;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "theNext_", "LTSElement;", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "preclosed_", "Z", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "LTSElementType;Z", "setNext", "LTSElement;", "namespace", "canContain", "setAttribute", "LNSString;LNSString;LNSString;" };
  static const J2ObjcClassInfo _TSElement = { "Element", "repackaged.org.ccil.cowan.tagsoup", ptrTable, methods, fields, 7, 0x1, 18, 4, -1, -1, -1, -1, -1 };
  return &_TSElement;
}

@end

void TSElement_initWithTSElementType_withBoolean_(TSElement *self, TSElementType *type, jboolean defaultAttributes) {
  NSObject_init(self);
  JreStrongAssign(&self->theType_, type);
  if (defaultAttributes) JreStrongAssignAndConsume(&self->theAtts_, new_TSAttributesImpl_initWithOrgXmlSaxAttributes_([((TSElementType *) nil_chk(type)) atts]));
  else JreStrongAssignAndConsume(&self->theAtts_, new_TSAttributesImpl_init());
  JreStrongAssign(&self->theNext_, nil);
  self->preclosed_ = false;
}

TSElement *new_TSElement_initWithTSElementType_withBoolean_(TSElementType *type, jboolean defaultAttributes) {
  J2OBJC_NEW_IMPL(TSElement, initWithTSElementType_withBoolean_, type, defaultAttributes)
}

TSElement *create_TSElement_initWithTSElementType_withBoolean_(TSElementType *type, jboolean defaultAttributes) {
  J2OBJC_CREATE_IMPL(TSElement, initWithTSElementType_withBoolean_, type, defaultAttributes)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(TSElement)
