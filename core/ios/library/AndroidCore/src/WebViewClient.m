//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\stub\r\android\webkit\WebViewClient.java
//

#include "Bitmap.h"
#include "ClientCertRequest.h"
#include "HttpAuthHandler.h"
#include "J2ObjC_source.h"
#include "SslError.h"
#include "SslErrorHandler.h"
#include "WebResourceResponse.h"
#include "WebView.h"
#include "WebViewClient.h"


@implementation ADWebViewClient

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADWebViewClient_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (jboolean)shouldOverrideUrlLoadingWithADWebView:(ADWebView *)view
                                     withNSString:(NSString *)url {
  return false;
}

- (void)onReceivedHttpAuthRequestWithADWebView:(ADWebView *)view
                         withADHttpAuthHandler:(ADHttpAuthHandler *)handler
                                  withNSString:(NSString *)host
                                  withNSString:(NSString *)realm {
}

- (void)onReceivedClientCertRequestWithADWebView:(ADWebView *)view
                         withADClientCertRequest:(ADClientCertRequest *)request {
}

- (void)onPageStartedWithADWebView:(ADWebView *)view
                      withNSString:(NSString *)url
                      withADBitmap:(id<ADBitmap>)favicon {
}

- (void)onPageFinishedWithADWebView:(ADWebView *)view
                       withNSString:(NSString *)url {
}

- (void)onReceivedErrorWithADWebView:(ADWebView *)view
                             withInt:(jint)errorCode
                        withNSString:(NSString *)description_
                        withNSString:(NSString *)failingUrl {
}

- (void)onReceivedSslErrorWithADWebView:(ADWebView *)view
                  withADSslErrorHandler:(ADSslErrorHandler *)handler
                         withADSslError:(ADSslError *)error {
}

- (ADWebResourceResponse *)shouldInterceptRequestWithADWebView:(ADWebView *)view
                                                  withNSString:(NSString *)url {
  return nil;
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, 0, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 2, 3, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 4, 5, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 6, 7, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 8, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 9, 10, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 11, 12, -1, -1, -1, -1 },
    { NULL, "LADWebResourceResponse;", 0x1, 13, 1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(shouldOverrideUrlLoadingWithADWebView:withNSString:);
  methods[2].selector = @selector(onReceivedHttpAuthRequestWithADWebView:withADHttpAuthHandler:withNSString:withNSString:);
  methods[3].selector = @selector(onReceivedClientCertRequestWithADWebView:withADClientCertRequest:);
  methods[4].selector = @selector(onPageStartedWithADWebView:withNSString:withADBitmap:);
  methods[5].selector = @selector(onPageFinishedWithADWebView:withNSString:);
  methods[6].selector = @selector(onReceivedErrorWithADWebView:withInt:withNSString:withNSString:);
  methods[7].selector = @selector(onReceivedSslErrorWithADWebView:withADSslErrorHandler:withADSslError:);
  methods[8].selector = @selector(shouldInterceptRequestWithADWebView:withNSString:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "ERROR_HOST_LOOKUP", "I", .constantValue.asInt = ADWebViewClient_ERROR_HOST_LOOKUP, 0x19, -1, -1, -1, -1 },
    { "ERROR_UNSUPPORTED_SCHEME", "I", .constantValue.asInt = ADWebViewClient_ERROR_UNSUPPORTED_SCHEME, 0x19, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "shouldOverrideUrlLoading", "LADWebView;LNSString;", "onReceivedHttpAuthRequest", "LADWebView;LADHttpAuthHandler;LNSString;LNSString;", "onReceivedClientCertRequest", "LADWebView;LADClientCertRequest;", "onPageStarted", "LADWebView;LNSString;LADBitmap;", "onPageFinished", "onReceivedError", "LADWebView;ILNSString;LNSString;", "onReceivedSslError", "LADWebView;LADSslErrorHandler;LADSslError;", "shouldInterceptRequest" };
  static const J2ObjcClassInfo _ADWebViewClient = { "WebViewClient", "r.android.webkit", ptrTable, methods, fields, 7, 0x1, 9, 2, -1, -1, -1, -1, -1 };
  return &_ADWebViewClient;
}

@end

void ADWebViewClient_init(ADWebViewClient *self) {
  NSObject_init(self);
}

ADWebViewClient *new_ADWebViewClient_init() {
  J2OBJC_NEW_IMPL(ADWebViewClient, init)
}

ADWebViewClient *create_ADWebViewClient_init() {
  J2OBJC_CREATE_IMPL(ADWebViewClient, init)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADWebViewClient)
