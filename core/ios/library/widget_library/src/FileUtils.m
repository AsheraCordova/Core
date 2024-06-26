//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-widget_library\widget_library\src\com\ashera\utils\FileUtils.java
//

#include "FileUtils.h"
#include "IOSClass.h"
#include "IOSObjectArray.h"
#include "IOSPrimitiveArray.h"
#include "J2ObjC_source.h"
#include "java/io/BufferedReader.h"
#include "java/io/ByteArrayOutputStream.h"
#include "java/io/File.h"
#include "java/io/FileReader.h"
#include "java/io/IOException.h"
#include "java/io/InputStream.h"
#include "java/io/InputStreamReader.h"
#include "java/io/Reader.h"
#include "java/io/StringReader.h"
#include "java/lang/ClassLoader.h"
#include "java/lang/Exception.h"
#include "java/lang/RuntimeException.h"
#include "java/lang/StringBuilder.h"
#include "java/lang/Thread.h"
#include "java/lang/Throwable.h"
#include "java/net/URI.h"
#include "java/net/URL.h"
#include "java/nio/charset/Charset.h"
#include "java/nio/charset/StandardCharsets.h"
#include "java/nio/file/Path.h"
#include "java/nio/file/Paths.h"
#include "java/util/ArrayList.h"
#include "java/util/HashMap.h"
#include "java/util/List.h"
#include "java/util/Map.h"
#include "java/util/Properties.h"
#include "java/util/Scanner.h"

@class JavaIoInputStream;
@class JavaIoReader;


@interface ASFileUtils ()

+ (NSString *)convertInputStreamToStringWithNSString:(NSString *)fileName
                               withJavaIoInputStream:(JavaIoInputStream *)is;

+ (NSString *)readFileToStringWithJavaIoReader:(JavaIoReader *)input;

@end

__attribute__((unused)) static NSString *ASFileUtils_convertInputStreamToStringWithNSString_withJavaIoInputStream_(NSString *fileName, JavaIoInputStream *is);

__attribute__((unused)) static NSString *ASFileUtils_readFileToStringWithJavaIoReader_(JavaIoReader *input);

@implementation ASFileUtils

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASFileUtils_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

+ (NSString *)readStringFromURLWithNSString:(NSString *)requestURL {
  return ASFileUtils_readStringFromURLWithNSString_(requestURL);
}

+ (NSString *)getFileFromClassPathWithNSString:(NSString *)fileName {
  return ASFileUtils_getFileFromClassPathWithNSString_(fileName);
}

+ (JavaIoInputStream *)getInputStreamFromClassPathWithNSString:(NSString *)fileName {
  return ASFileUtils_getInputStreamFromClassPathWithNSString_(fileName);
}

+ (JavaNetURL *)getFilePathFromClassPathWithNSString:(NSString *)fileName {
  return ASFileUtils_getFilePathFromClassPathWithNSString_(fileName);
}

+ (NSString *)convertInputStreamToStringWithNSString:(NSString *)fileName
                               withJavaIoInputStream:(JavaIoInputStream *)is {
  return ASFileUtils_convertInputStreamToStringWithNSString_withJavaIoInputStream_(fileName, is);
}

+ (id<JavaUtilMap>)readFilesContentWithJavaUtilMap:(id<JavaUtilMap>)urls {
  return ASFileUtils_readFilesContentWithJavaUtilMap_(urls);
}

+ (NSString *)readFileToStringWithJavaIoFile:(JavaIoFile *)filePath {
  return ASFileUtils_readFileToStringWithJavaIoFile_(filePath);
}

+ (NSString *)readFileToStringWithJavaIoReader:(JavaIoReader *)input {
  return ASFileUtils_readFileToStringWithJavaIoReader_(input);
}

+ (JavaUtilProperties *)loadPropertiesFromClassPathWithNSString:(NSString *)fileName {
  return ASFileUtils_loadPropertiesFromClassPathWithNSString_(fileName);
}

+ (JavaUtilProperties *)getFileAsPropertiesWithNSString:(NSString *)fileName {
  return ASFileUtils_getFileAsPropertiesWithNSString_(fileName);
}

+ (id<JavaUtilList>)getFilenamesForDirnameFromCPWithNSString:(NSString *)directoryName {
  return ASFileUtils_getFilenamesForDirnameFromCPWithNSString_(directoryName);
}

+ (IOSByteArray *)readAllBytesWithJavaIoInputStream:(JavaIoInputStream *)inputStream {
  return ASFileUtils_readAllBytesWithJavaIoInputStream_(inputStream);
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x9, 0, 1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x9, 2, 1, -1, -1, -1, -1 },
    { NULL, "LJavaIoInputStream;", 0x9, 3, 1, -1, -1, -1, -1 },
    { NULL, "LJavaNetURL;", 0x9, 4, 1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0xa, 5, 6, -1, -1, -1, -1 },
    { NULL, "LJavaUtilMap;", 0x9, 7, 8, -1, 9, -1, -1 },
    { NULL, "LNSString;", 0x9, 10, 11, 12, -1, -1, -1 },
    { NULL, "LNSString;", 0xa, 10, 13, 12, -1, -1, -1 },
    { NULL, "LJavaUtilProperties;", 0x9, 14, 1, -1, -1, -1, -1 },
    { NULL, "LJavaUtilProperties;", 0x9, 15, 1, -1, -1, -1, -1 },
    { NULL, "LJavaUtilList;", 0x9, 16, 1, -1, 17, -1, -1 },
    { NULL, "[B", 0x9, 18, 19, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(readStringFromURLWithNSString:);
  methods[2].selector = @selector(getFileFromClassPathWithNSString:);
  methods[3].selector = @selector(getInputStreamFromClassPathWithNSString:);
  methods[4].selector = @selector(getFilePathFromClassPathWithNSString:);
  methods[5].selector = @selector(convertInputStreamToStringWithNSString:withJavaIoInputStream:);
  methods[6].selector = @selector(readFilesContentWithJavaUtilMap:);
  methods[7].selector = @selector(readFileToStringWithJavaIoFile:);
  methods[8].selector = @selector(readFileToStringWithJavaIoReader:);
  methods[9].selector = @selector(loadPropertiesFromClassPathWithNSString:);
  methods[10].selector = @selector(getFileAsPropertiesWithNSString:);
  methods[11].selector = @selector(getFilenamesForDirnameFromCPWithNSString:);
  methods[12].selector = @selector(readAllBytesWithJavaIoInputStream:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "DEFAULT_BUFFER_SIZE", "I", .constantValue.asInt = ASFileUtils_DEFAULT_BUFFER_SIZE, 0x19, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "readStringFromURL", "LNSString;", "getFileFromClassPath", "getInputStreamFromClassPath", "getFilePathFromClassPath", "convertInputStreamToString", "LNSString;LJavaIoInputStream;", "readFilesContent", "LJavaUtilMap;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", "readFileToString", "LJavaIoFile;", "LJavaIoIOException;", "LJavaIoReader;", "loadPropertiesFromClassPath", "getFileAsProperties", "getFilenamesForDirnameFromCP", "(Ljava/lang/String;)Ljava/util/List<Ljava/io/File;>;", "readAllBytes", "LJavaIoInputStream;" };
  static const J2ObjcClassInfo _ASFileUtils = { "FileUtils", "com.ashera.utils", ptrTable, methods, fields, 7, 0x1, 13, 1, -1, -1, -1, -1, -1 };
  return &_ASFileUtils;
}

@end

void ASFileUtils_init(ASFileUtils *self) {
  NSObject_init(self);
}

ASFileUtils *new_ASFileUtils_init() {
  J2OBJC_NEW_IMPL(ASFileUtils, init)
}

ASFileUtils *create_ASFileUtils_init() {
  J2OBJC_CREATE_IMPL(ASFileUtils, init)
}

NSString *ASFileUtils_readStringFromURLWithNSString_(NSString *requestURL) {
  ASFileUtils_initialize();
  JavaUtilScanner *scanner = nil;
  @try {
    scanner = create_JavaUtilScanner_initWithJavaIoInputStream_([create_JavaNetURL_initWithNSString_(requestURL) openStream]);
    [scanner useDelimiterWithNSString:@"\\A"];
    return [scanner hasNext] ? [scanner next] : @"";
  }
  @catch (JavaLangException *e) {
    @throw create_JavaLangRuntimeException_initWithJavaLangThrowable_(e);
  }
  @finally {
    if (scanner != nil) {
      [scanner close];
    }
  }
}

NSString *ASFileUtils_getFileFromClassPathWithNSString_(NSString *fileName) {
  ASFileUtils_initialize();
  return ASFileUtils_convertInputStreamToStringWithNSString_withJavaIoInputStream_(fileName, ASFileUtils_getInputStreamFromClassPathWithNSString_(fileName));
}

JavaIoInputStream *ASFileUtils_getInputStreamFromClassPathWithNSString_(NSString *fileName) {
  ASFileUtils_initialize();
  return [((JavaLangClassLoader *) nil_chk([ASFileUtils_class_() getClassLoader])) getResourceAsStreamWithNSString:fileName];
}

JavaNetURL *ASFileUtils_getFilePathFromClassPathWithNSString_(NSString *fileName) {
  ASFileUtils_initialize();
  return [((JavaLangClassLoader *) nil_chk([ASFileUtils_class_() getClassLoader])) getResourceWithNSString:fileName];
}

NSString *ASFileUtils_convertInputStreamToStringWithNSString_withJavaIoInputStream_(NSString *fileName, JavaIoInputStream *is) {
  ASFileUtils_initialize();
  @try {
    JavaIoByteArrayOutputStream *result = create_JavaIoByteArrayOutputStream_init();
    JavaLangThrowable *__primaryException1 = nil;
    @try {
      IOSByteArray *buffer = [IOSByteArray arrayWithLength:ASFileUtils_DEFAULT_BUFFER_SIZE];
      jint length;
      while ((length = [((JavaIoInputStream *) nil_chk(is)) readWithByteArray:buffer]) != -1) {
        [result writeWithByteArray:buffer withInt:0 withInt:length];
      }
      return [result toStringWithNSString:[((JavaNioCharsetCharset *) nil_chk(JreLoadStatic(JavaNioCharsetStandardCharsets, UTF_8))) name]];
    }
    @catch (JavaLangThrowable *e) {
      __primaryException1 = e;
      @throw e;
    }
    @finally {
      if (result != nil) {
        if (__primaryException1 != nil) {
          @try {
            [result close];
          }
          @catch (JavaLangThrowable *e) {
            [__primaryException1 addSuppressedWithJavaLangThrowable:e];
          }
        }
        else {
          [result close];
        }
      }
    }
  }
  @catch (JavaLangException *e) {
    @throw create_JavaLangRuntimeException_initWithNSString_(fileName);
  }
}

id<JavaUtilMap> ASFileUtils_readFilesContentWithJavaUtilMap_(id<JavaUtilMap> urls) {
  ASFileUtils_initialize();
  id<JavaUtilMap> resultMap = create_JavaUtilHashMap_init();
  return resultMap;
}

NSString *ASFileUtils_readFileToStringWithJavaIoFile_(JavaIoFile *filePath) {
  ASFileUtils_initialize();
  JavaIoReader *input = create_JavaIoFileReader_initWithJavaIoFile_(filePath);
  return ASFileUtils_readFileToStringWithJavaIoReader_(input);
}

NSString *ASFileUtils_readFileToStringWithJavaIoReader_(JavaIoReader *input) {
  ASFileUtils_initialize();
  JavaIoBufferedReader *reader = create_JavaIoBufferedReader_initWithJavaIoReader_(input);
  JavaLangStringBuilder *fileData = create_JavaLangStringBuilder_initWithInt_(1000);
  IOSCharArray *buf = [IOSCharArray arrayWithLength:10];
  jint numRead = 0;
  while ((numRead = [reader readWithCharArray:buf]) != -1) {
    NSString *readData = NSString_java_valueOfChars_offset_count_(buf, 0, numRead);
    [fileData appendWithNSString:readData];
    buf = [IOSCharArray arrayWithLength:1024];
  }
  [reader close];
  return [fileData description];
}

JavaUtilProperties *ASFileUtils_loadPropertiesFromClassPathWithNSString_(NSString *fileName) {
  ASFileUtils_initialize();
  JavaUtilProperties *properties = create_JavaUtilProperties_init();
  JavaIoStringReader *stringReader = nil;
  @try {
    NSString *fileContent = ASFileUtils_readFileToStringWithJavaIoReader_(create_JavaIoInputStreamReader_initWithJavaIoInputStream_(ASFileUtils_getInputStreamFromClassPathWithNSString_(fileName)));
    stringReader = create_JavaIoStringReader_initWithNSString_(fileContent);
    [properties load__WithJavaIoReader:stringReader];
  }
  @catch (JavaIoIOException *e) {
    @throw create_JavaLangRuntimeException_initWithJavaLangThrowable_(e);
  }
  @finally {
    if (stringReader != nil) {
      [stringReader close];
    }
  }
  return properties;
}

JavaUtilProperties *ASFileUtils_getFileAsPropertiesWithNSString_(NSString *fileName) {
  ASFileUtils_initialize();
  JavaUtilProperties *properties = create_JavaUtilProperties_init();
  JavaIoStringReader *stringReader = nil;
  @try {
    NSString *fileContent = ASFileUtils_readFileToStringWithJavaIoFile_(create_JavaIoFile_initWithNSString_(fileName));
    stringReader = create_JavaIoStringReader_initWithNSString_(fileContent);
    @try {
      [properties load__WithJavaIoReader:stringReader];
    }
    @catch (JavaIoIOException *e) {
      [e printStackTrace];
    }
  }
  @catch (JavaIoIOException *e) {
    @throw create_JavaLangRuntimeException_initWithJavaLangThrowable_(e);
  }
  @finally {
    if (stringReader != nil) {
      [stringReader close];
    }
  }
  return properties;
}

id<JavaUtilList> ASFileUtils_getFilenamesForDirnameFromCPWithNSString_(NSString *directoryName) {
  ASFileUtils_initialize();
  @try {
    id<JavaUtilList> filenames = create_JavaUtilArrayList_init();
    JavaNetURL *url = JreRetainedLocalValue([((JavaLangClassLoader *) nil_chk([((JavaLangThread *) nil_chk(JavaLangThread_currentThread())) getContextClassLoader])) getResourceWithNSString:directoryName]);
    if (url != nil) {
      if ([((NSString *) nil_chk([url getProtocol])) isEqual:@"file"]) {
        JavaIoFile *file = JreRetainedLocalValue([((id<JavaNioFilePath>) nil_chk(JavaNioFilePaths_getWithJavaNetURI_([url toURI]))) toFile]);
        if (file != nil) {
          IOSObjectArray *files = [file listFiles];
          if (files != nil) {
            {
              IOSObjectArray *a__ = files;
              JavaIoFile * const *b__ = a__->buffer_;
              JavaIoFile * const *e__ = b__ + a__->size_;
              while (b__ < e__) {
                JavaIoFile *filename = *b__++;
                [filenames addWithId:filename];
              }
            }
          }
        }
      }
    }
    return filenames;
  }
  @catch (JavaLangException *e) {
    @throw create_JavaLangRuntimeException_initWithJavaLangThrowable_(e);
  }
}

IOSByteArray *ASFileUtils_readAllBytesWithJavaIoInputStream_(JavaIoInputStream *inputStream) {
  ASFileUtils_initialize();
  jint bufLen = 4 * (jint) 0x400;
  IOSByteArray *buf = [IOSByteArray arrayWithLength:bufLen];
  jint readLen;
  @try {
    JavaIoByteArrayOutputStream *outputStream = create_JavaIoByteArrayOutputStream_init();
    JavaLangThrowable *__primaryException1 = nil;
    @try {
      while ((readLen = [((JavaIoInputStream *) nil_chk(inputStream)) readWithByteArray:buf withInt:0 withInt:bufLen]) != -1) [outputStream writeWithByteArray:buf withInt:0 withInt:readLen];
      return [outputStream toByteArray];
    }
    @catch (JavaLangThrowable *e) {
      __primaryException1 = e;
      @throw e;
    }
    @finally {
      if (outputStream != nil) {
        if (__primaryException1 != nil) {
          @try {
            [outputStream close];
          }
          @catch (JavaLangThrowable *e) {
            [__primaryException1 addSuppressedWithJavaLangThrowable:e];
          }
        }
        else {
          [outputStream close];
        }
      }
    }
  }
  @catch (JavaIoIOException *e) {
    @throw create_JavaLangRuntimeException_initWithJavaLangThrowable_(e);
  }
  @finally {
    @try {
      [((JavaIoInputStream *) nil_chk(inputStream)) close];
    }
    @catch (JavaIoIOException *e) {
    }
  }
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASFileUtils)
