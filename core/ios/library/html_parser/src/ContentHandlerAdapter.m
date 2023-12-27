//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\html_parser\src\com\ashera\parser\html\ContentHandlerAdapter.java
//

#include "ContentHandlerAdapter.h"
#include "IOSPrimitiveArray.h"
#include "J2ObjC_source.h"
#include "org/xml/sax/Attributes.h"
#include "org/xml/sax/Locator.h"


@implementation ASContentHandlerAdapter

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASContentHandlerAdapter_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (void)setDocumentLocatorWithOrgXmlSaxLocator:(id<OrgXmlSaxLocator>)locator {
}

- (void)startDocument {
}

- (void)endDocument {
}

- (void)startPrefixMappingWithNSString:(NSString *)prefix
                          withNSString:(NSString *)uri {
}

- (void)endPrefixMappingWithNSString:(NSString *)prefix {
}

- (void)startElementWithNSString:(NSString *)uri
                    withNSString:(NSString *)localName
                    withNSString:(NSString *)qName
         withOrgXmlSaxAttributes:(id<OrgXmlSaxAttributes>)atts {
}

- (void)endElementWithNSString:(NSString *)uri
                  withNSString:(NSString *)localName
                  withNSString:(NSString *)qName {
}

- (void)charactersWithCharArray:(IOSCharArray *)ch
                        withInt:(jint)start
                        withInt:(jint)length {
}

- (void)ignorableWhitespaceWithCharArray:(IOSCharArray *)ch
                                 withInt:(jint)start
                                 withInt:(jint)length {
}

- (void)processingInstructionWithNSString:(NSString *)target
                             withNSString:(NSString *)data {
}

- (void)skippedEntityWithNSString:(NSString *)name {
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 0, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, 2, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, 2, -1, -1, -1 },
    { NULL, "V", 0x1, 3, 4, 2, -1, -1, -1 },
    { NULL, "V", 0x1, 5, 6, 2, -1, -1, -1 },
    { NULL, "V", 0x1, 7, 8, 2, -1, -1, -1 },
    { NULL, "V", 0x1, 9, 10, 2, -1, -1, -1 },
    { NULL, "V", 0x1, 11, 12, 2, -1, -1, -1 },
    { NULL, "V", 0x1, 13, 12, 2, -1, -1, -1 },
    { NULL, "V", 0x1, 14, 4, 2, -1, -1, -1 },
    { NULL, "V", 0x1, 15, 6, 2, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(setDocumentLocatorWithOrgXmlSaxLocator:);
  methods[2].selector = @selector(startDocument);
  methods[3].selector = @selector(endDocument);
  methods[4].selector = @selector(startPrefixMappingWithNSString:withNSString:);
  methods[5].selector = @selector(endPrefixMappingWithNSString:);
  methods[6].selector = @selector(startElementWithNSString:withNSString:withNSString:withOrgXmlSaxAttributes:);
  methods[7].selector = @selector(endElementWithNSString:withNSString:withNSString:);
  methods[8].selector = @selector(charactersWithCharArray:withInt:withInt:);
  methods[9].selector = @selector(ignorableWhitespaceWithCharArray:withInt:withInt:);
  methods[10].selector = @selector(processingInstructionWithNSString:withNSString:);
  methods[11].selector = @selector(skippedEntityWithNSString:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "setDocumentLocator", "LOrgXmlSaxLocator;", "LOrgXmlSaxSAXException;", "startPrefixMapping", "LNSString;LNSString;", "endPrefixMapping", "LNSString;", "startElement", "LNSString;LNSString;LNSString;LOrgXmlSaxAttributes;", "endElement", "LNSString;LNSString;LNSString;", "characters", "[CII", "ignorableWhitespace", "processingInstruction", "skippedEntity" };
  static const J2ObjcClassInfo _ASContentHandlerAdapter = { "ContentHandlerAdapter", "com.ashera.parser.html", ptrTable, methods, NULL, 7, 0x1, 12, 0, -1, -1, -1, -1, -1 };
  return &_ASContentHandlerAdapter;
}

@end

void ASContentHandlerAdapter_init(ASContentHandlerAdapter *self) {
  NSObject_init(self);
}

ASContentHandlerAdapter *new_ASContentHandlerAdapter_init() {
  J2OBJC_NEW_IMPL(ASContentHandlerAdapter, init)
}

ASContentHandlerAdapter *create_ASContentHandlerAdapter_init() {
  J2OBJC_CREATE_IMPL(ASContentHandlerAdapter, init)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASContentHandlerAdapter)
