//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\java\r\android\widget\HorizontalScrollView.java
//

#include "ApplicationInfo.h"
#include "Build.h"
#include "Context.h"
#include "FrameLayout.h"
#include "HorizontalScrollView.h"
#include "J2ObjC_source.h"
#include "View.h"
#include "ViewGroup.h"
#include "java/lang/Integer.h"
#include "java/lang/Math.h"


@interface ADHorizontalScrollView () {
 @public
  jint mLastMotionX_;
  jboolean mIsLayoutDirty_;
  jboolean mIsBeingDragged_;
  jboolean mFillViewport_;
  jboolean mSmoothScrollingEnabled_;
  jint mTouchSlop_HorizontalScrollView_;
  jint mMinimumVelocity_;
  jint mMaximumVelocity_;
  jint mOverscrollDistance_;
  jint mOverflingDistance_;
  jint mActivePointerId_;
  jint originalBottomPadding_;
}

+ (jint)clampWithInt:(jint)n
             withInt:(jint)my
             withInt:(jint)child;

@end

inline jint ADHorizontalScrollView_get_ANIMATED_SCROLL_GAP(void);
#define ADHorizontalScrollView_ANIMATED_SCROLL_GAP 250
J2OBJC_STATIC_FIELD_CONSTANT(ADHorizontalScrollView, ANIMATED_SCROLL_GAP, jint)

inline jint ADHorizontalScrollView_get_INVALID_POINTER(void);
#define ADHorizontalScrollView_INVALID_POINTER -1
J2OBJC_STATIC_FIELD_CONSTANT(ADHorizontalScrollView, INVALID_POINTER, jint)

__attribute__((unused)) static jint ADHorizontalScrollView_clampWithInt_withInt_withInt_(jint n, jint my, jint child);

@implementation ADHorizontalScrollView

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADHorizontalScrollView_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (jboolean)isFillViewport {
  return mFillViewport_;
}

- (void)setFillViewportWithBoolean:(jboolean)fillViewport {
  if (fillViewport != mFillViewport_) {
    mFillViewport_ = fillViewport;
    [self requestLayout];
  }
}

- (void)onMeasureWithInt:(jint)widthMeasureSpec
                 withInt:(jint)heightMeasureSpec {
  [super onMeasureWithInt:widthMeasureSpec withInt:heightMeasureSpec];
  if (!mFillViewport_) {
    return;
  }
  jint widthMode = ADView_MeasureSpec_getModeWithInt_(widthMeasureSpec);
  if (widthMode == ADView_MeasureSpec_UNSPECIFIED) {
    return;
  }
  if ([self getChildCount] > 0) {
    ADView *child = [self getChildAtWithInt:0];
    jint widthPadding;
    jint heightPadding;
    ADFrameLayout_LayoutParams *lp = (ADFrameLayout_LayoutParams *) cast_chk([((ADView *) nil_chk(child)) getLayoutParams], [ADFrameLayout_LayoutParams class]);
    jint targetSdkVersion = ((ADApplicationInfo *) nil_chk([((ADContext *) nil_chk([self getContext])) getApplicationInfo]))->targetSdkVersion_;
    if (targetSdkVersion >= ADBuild_VERSION_CODES_M) {
      widthPadding = mPaddingLeft_ + mPaddingRight_ + ((ADFrameLayout_LayoutParams *) nil_chk(lp))->leftMargin_ + lp->rightMargin_;
      heightPadding = mPaddingTop_ + mPaddingBottom_ + lp->topMargin_ + lp->bottomMargin_;
    }
    else {
      widthPadding = mPaddingLeft_ + mPaddingRight_;
      heightPadding = mPaddingTop_ + mPaddingBottom_;
    }
    jint desiredWidth = [self getMeasuredWidth] - widthPadding;
    if ([child getMeasuredWidth] < desiredWidth) {
      jint childWidthMeasureSpec = ADView_MeasureSpec_makeMeasureSpecWithInt_withInt_(desiredWidth, ADView_MeasureSpec_EXACTLY);
      jint childHeightMeasureSpec = ADViewGroup_getChildMeasureSpecWithInt_withInt_withInt_(heightMeasureSpec, heightPadding, ((ADFrameLayout_LayoutParams *) nil_chk(lp))->height_);
      [child measureWithInt:childWidthMeasureSpec withInt:childHeightMeasureSpec];
    }
  }
}

- (jint)computeHorizontalScrollRange {
  jint count = [self getChildCount];
  jint contentWidth = [self getWidth] - mPaddingLeft_ - mPaddingRight_;
  if (count == 0) {
    return contentWidth;
  }
  jint scrollRange = [((ADView *) nil_chk([self getChildAtWithInt:0])) getRight];
  jint scrollX = mScrollX_;
  jint overscrollRight = JavaLangMath_maxWithInt_withInt_(0, scrollRange - contentWidth);
  if (scrollX < 0) {
    scrollRange -= scrollX;
  }
  else if (scrollX > overscrollRight) {
    scrollRange += scrollX - overscrollRight;
  }
  return scrollRange;
}

- (void)measureChildWithMarginsWithADView:(ADView *)child
                                  withInt:(jint)parentWidthMeasureSpec
                                  withInt:(jint)widthUsed
                                  withInt:(jint)parentHeightMeasureSpec
                                  withInt:(jint)heightUsed {
  ADViewGroup_MarginLayoutParams *lp = (ADViewGroup_MarginLayoutParams *) cast_chk([((ADView *) nil_chk(child)) getLayoutParams], [ADViewGroup_MarginLayoutParams class]);
  jint childHeightMeasureSpec = ADViewGroup_getChildMeasureSpecWithInt_withInt_withInt_(parentHeightMeasureSpec, mPaddingTop_ + mPaddingBottom_ + ((ADViewGroup_MarginLayoutParams *) nil_chk(lp))->topMargin_ + lp->bottomMargin_ + heightUsed, lp->height_);
  jint usedTotal = mPaddingLeft_ + mPaddingRight_ + lp->leftMargin_ + lp->rightMargin_ + widthUsed;
  jint childWidthMeasureSpec = ADView_MeasureSpec_makeSafeMeasureSpecWithInt_withInt_(JavaLangMath_maxWithInt_withInt_(0, ADView_MeasureSpec_getSizeWithInt_(parentWidthMeasureSpec) - usedTotal), ADView_MeasureSpec_UNSPECIFIED);
  [child measureWithInt:childWidthMeasureSpec withInt:childHeightMeasureSpec];
}

- (void)requestLayout {
  mIsLayoutDirty_ = true;
  [super requestLayout];
}

- (void)scrollToWithInt:(jint)x
                withInt:(jint)y {
  if ([self getChildCount] > 0) {
    ADView *child = JreRetainedLocalValue([self getChildAtWithInt:0]);
    x = ADHorizontalScrollView_clampWithInt_withInt_withInt_(x, [self getWidth] - mPaddingRight_ - mPaddingLeft_, [((ADView *) nil_chk(child)) getWidth]);
    y = ADHorizontalScrollView_clampWithInt_withInt_withInt_(y, [self getHeight] - mPaddingBottom_ - mPaddingTop_, [child getHeight]);
    if (x != mScrollX_ || y != mScrollY_) {
      [self setMyAttributeWithNSString:@"scrollX" withId:JavaLangInteger_valueOfWithInt_(x)];
    }
  }
}

+ (jint)clampWithInt:(jint)n
             withInt:(jint)my
             withInt:(jint)child {
  return ADHorizontalScrollView_clampWithInt_withInt_withInt_(n, my, child);
}

- (void)adjustPaddingIfScrollBarPresentWithInt:(jint)widthMeasureSpec
                                       withInt:(jint)heightMeasureSpec
                                       withInt:(jint)thumbHeight {
  if ([self getChildCount] > 0) {
    ADView *child = [self getChildAtWithInt:0];
    jint widthPadding;
    jint heightPadding;
    jint targetSdkVersion = ((ADApplicationInfo *) nil_chk([((ADContext *) nil_chk([self getContext])) getApplicationInfo]))->targetSdkVersion_;
    ADFrameLayout_LayoutParams *lp = (ADFrameLayout_LayoutParams *) cast_chk([((ADView *) nil_chk(child)) getLayoutParams], [ADFrameLayout_LayoutParams class]);
    if (targetSdkVersion >= ADBuild_VERSION_CODES_M) {
      widthPadding = mPaddingLeft_ + mPaddingRight_ + ((ADFrameLayout_LayoutParams *) nil_chk(lp))->leftMargin_ + lp->rightMargin_;
      heightPadding = mPaddingTop_ + mPaddingBottom_ + lp->topMargin_ + lp->bottomMargin_;
    }
    else {
      widthPadding = mPaddingLeft_ + mPaddingRight_;
      heightPadding = mPaddingTop_ + mPaddingBottom_;
    }
    jint desiredWidth = [self getMeasuredWidth] - widthPadding;
    if (desiredWidth >= [child getMeasuredWidth]) {
      if (mPaddingBottom_ == thumbHeight && originalBottomPadding_ != thumbHeight) {
        mPaddingBottom_ = originalBottomPadding_;
        [self measureChildWithADView:child withInt:widthMeasureSpec withInt:heightMeasureSpec];
      }
    }
    else {
      if (mPaddingBottom_ < thumbHeight) {
        originalBottomPadding_ = mPaddingBottom_;
        mPaddingBottom_ = thumbHeight;
        [self measureChildWithADView:child withInt:widthMeasureSpec withInt:heightMeasureSpec];
      }
    }
  }
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 0, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x4, 2, 3, -1, -1, -1, -1 },
    { NULL, "I", 0x4, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x4, 4, 5, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 6, 3, -1, -1, -1, -1 },
    { NULL, "I", 0xa, 7, 8, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 9, 8, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(isFillViewport);
  methods[2].selector = @selector(setFillViewportWithBoolean:);
  methods[3].selector = @selector(onMeasureWithInt:withInt:);
  methods[4].selector = @selector(computeHorizontalScrollRange);
  methods[5].selector = @selector(measureChildWithMarginsWithADView:withInt:withInt:withInt:withInt:);
  methods[6].selector = @selector(requestLayout);
  methods[7].selector = @selector(scrollToWithInt:withInt:);
  methods[8].selector = @selector(clampWithInt:withInt:withInt:);
  methods[9].selector = @selector(adjustPaddingIfScrollBarPresentWithInt:withInt:withInt:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "ANIMATED_SCROLL_GAP", "I", .constantValue.asInt = ADHorizontalScrollView_ANIMATED_SCROLL_GAP, 0x1a, -1, -1, -1, -1 },
    { "mLastMotionX_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mIsLayoutDirty_", "Z", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mIsBeingDragged_", "Z", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mFillViewport_", "Z", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mSmoothScrollingEnabled_", "Z", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mTouchSlop_HorizontalScrollView_", "I", .constantValue.asLong = 0, 0x2, 10, -1, -1, -1 },
    { "mMinimumVelocity_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mMaximumVelocity_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mOverscrollDistance_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mOverflingDistance_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "mActivePointerId_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "INVALID_POINTER", "I", .constantValue.asInt = ADHorizontalScrollView_INVALID_POINTER, 0x1a, -1, -1, -1, -1 },
    { "originalBottomPadding_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "setFillViewport", "Z", "onMeasure", "II", "measureChildWithMargins", "LADView;IIII", "scrollTo", "clamp", "III", "adjustPaddingIfScrollBarPresent", "mTouchSlop" };
  static const J2ObjcClassInfo _ADHorizontalScrollView = { "HorizontalScrollView", "r.android.widget", ptrTable, methods, fields, 7, 0x1, 10, 14, -1, -1, -1, -1, -1 };
  return &_ADHorizontalScrollView;
}

@end

void ADHorizontalScrollView_init(ADHorizontalScrollView *self) {
  ADFrameLayout_init(self);
  self->mIsLayoutDirty_ = true;
  self->mIsBeingDragged_ = false;
  self->mSmoothScrollingEnabled_ = true;
  self->mActivePointerId_ = ADHorizontalScrollView_INVALID_POINTER;
  self->originalBottomPadding_ = 0;
}

ADHorizontalScrollView *new_ADHorizontalScrollView_init() {
  J2OBJC_NEW_IMPL(ADHorizontalScrollView, init)
}

ADHorizontalScrollView *create_ADHorizontalScrollView_init() {
  J2OBJC_CREATE_IMPL(ADHorizontalScrollView, init)
}

jint ADHorizontalScrollView_clampWithInt_withInt_withInt_(jint n, jint my, jint child) {
  ADHorizontalScrollView_initialize();
  if (my >= child || n < 0) {
    return 0;
  }
  if ((my + n) > child) {
    return child - my;
  }
  return n;
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADHorizontalScrollView)
