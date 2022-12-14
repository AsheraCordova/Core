//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\stub\r\android\webkit\ClientCertRequest.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ClientCertRequest")
#ifdef RESTRICT_ClientCertRequest
#define INCLUDE_ALL_ClientCertRequest 0
#else
#define INCLUDE_ALL_ClientCertRequest 1
#endif
#undef RESTRICT_ClientCertRequest

#if !defined (ADClientCertRequest_) && (INCLUDE_ALL_ClientCertRequest || defined(INCLUDE_ADClientCertRequest))
#define ADClientCertRequest_

@class IOSObjectArray;
@protocol JavaSecurityPrivateKey;

@interface ADClientCertRequest : NSObject

#pragma mark Public

- (instancetype)init;

- (void)cancel;

- (NSString *)getHost;

- (IOSObjectArray *)getKeyTypes;

- (jint)getPort;

- (IOSObjectArray *)getPrincipals;

- (void)ignore;

- (void)proceedWithJavaSecurityPrivateKey:(id<JavaSecurityPrivateKey>)privateKey
 withJavaSecurityCertX509CertificateArray:(IOSObjectArray *)chain;

@end

J2OBJC_EMPTY_STATIC_INIT(ADClientCertRequest)

FOUNDATION_EXPORT void ADClientCertRequest_init(ADClientCertRequest *self);

FOUNDATION_EXPORT ADClientCertRequest *new_ADClientCertRequest_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ADClientCertRequest *create_ADClientCertRequest_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ADClientCertRequest)

@compatibility_alias RAndroidWebkitClientCertRequest ADClientCertRequest;

#endif

#pragma pop_macro("INCLUDE_ALL_ClientCertRequest")
