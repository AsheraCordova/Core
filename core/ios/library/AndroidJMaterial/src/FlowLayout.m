//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\AndroidJMaterial\src\main\java\com\google\android\material\internal\FlowLayout.java
//

#include "FlowLayout.h"
#include "J2ObjC_source.h"
#include "MarginLayoutParamsCompat.h"
#include "R.h"
#include "View.h"
#include "ViewCompat.h"
#include "ViewGroup.h"
#include "java/lang/Integer.h"
#include "java/lang/Math.h"


@interface ADXFlowLayout () {
 @public
  jint lineSpacing_;
  jint itemSpacing_;
  jboolean singleLine_;
  jint rowCount_;
}

+ (jint)getMeasuredDimensionWithInt:(jint)size
                            withInt:(jint)mode
                            withInt:(jint)childrenEdge;

@end

__attribute__((unused)) static jint ADXFlowLayout_getMeasuredDimensionWithInt_withInt_withInt_(jint size, jint mode, jint childrenEdge);

@implementation ADXFlowLayout

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ADXFlowLayout_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

- (void)setLineSpacingWithInt:(jint)lineSpacing {
  self->lineSpacing_ = lineSpacing;
}

- (void)setItemSpacingWithInt:(jint)itemSpacing {
  self->itemSpacing_ = itemSpacing;
}

- (jboolean)isSingleLine {
  return singleLine_;
}

- (void)setSingleLineWithBoolean:(jboolean)singleLine {
  self->singleLine_ = singleLine;
}

- (void)onMeasureWithInt:(jint)widthMeasureSpec
                 withInt:(jint)heightMeasureSpec {
  jint width = ADView_MeasureSpec_getSizeWithInt_(widthMeasureSpec);
  jint widthMode = ADView_MeasureSpec_getModeWithInt_(widthMeasureSpec);
  jint height = ADView_MeasureSpec_getSizeWithInt_(heightMeasureSpec);
  jint heightMode = ADView_MeasureSpec_getModeWithInt_(heightMeasureSpec);
  jint maxWidth = widthMode == ADView_MeasureSpec_AT_MOST || widthMode == ADView_MeasureSpec_EXACTLY ? width : JavaLangInteger_MAX_VALUE;
  jint childLeft = [self getPaddingLeft];
  jint childTop = [self getPaddingTop];
  jint childBottom = childTop;
  jint childRight = childLeft;
  jint maxChildRight = 0;
  jint maxRight = maxWidth - [self getPaddingRight];
  for (jint i = 0; i < [self getChildCount]; i++) {
    ADView *child = JreRetainedLocalValue([self getChildAtWithInt:i]);
    if ([((ADView *) nil_chk(child)) getVisibility] == ADView_GONE) {
      continue;
    }
    [self measureChildWithADView:child withInt:widthMeasureSpec withInt:heightMeasureSpec];
    ADViewGroup_LayoutParams *lp = JreRetainedLocalValue([child getLayoutParams]);
    jint leftMargin = 0;
    jint rightMargin = 0;
    if ([lp isKindOfClass:[ADViewGroup_MarginLayoutParams class]]) {
      ADViewGroup_MarginLayoutParams *marginLp = (ADViewGroup_MarginLayoutParams *) lp;
      leftMargin += ((ADViewGroup_MarginLayoutParams *) nil_chk(marginLp))->leftMargin_;
      rightMargin += marginLp->rightMargin_;
    }
    childRight = childLeft + leftMargin + [child getMeasuredWidth];
    if (childRight > maxRight && ![self isSingleLine]) {
      childLeft = [self getPaddingLeft];
      childTop = childBottom + lineSpacing_;
    }
    childRight = childLeft + leftMargin + [child getMeasuredWidth];
    childBottom = childTop + [child getMeasuredHeight];
    if (childRight > maxChildRight) {
      maxChildRight = childRight;
    }
    childLeft += (leftMargin + rightMargin + [child getMeasuredWidth]) + itemSpacing_;
    if (i == ([self getChildCount] - 1)) {
      maxChildRight += rightMargin;
    }
  }
  maxChildRight += [self getPaddingRight];
  childBottom += [self getPaddingBottom];
  jint finalWidth = ADXFlowLayout_getMeasuredDimensionWithInt_withInt_withInt_(width, widthMode, maxChildRight);
  jint finalHeight = ADXFlowLayout_getMeasuredDimensionWithInt_withInt_withInt_(height, heightMode, childBottom);
  [self setMeasuredDimensionWithInt:finalWidth withInt:finalHeight];
}

+ (jint)getMeasuredDimensionWithInt:(jint)size
                            withInt:(jint)mode
                            withInt:(jint)childrenEdge {
  return ADXFlowLayout_getMeasuredDimensionWithInt_withInt_withInt_(size, mode, childrenEdge);
}

- (void)onLayoutWithBoolean:(jboolean)sizeChanged
                    withInt:(jint)left
                    withInt:(jint)top
                    withInt:(jint)right
                    withInt:(jint)bottom {
  if ([self getChildCount] == 0) {
    rowCount_ = 0;
    return;
  }
  rowCount_ = 1;
  jboolean isRtl = ADXViewCompat_getLayoutDirectionWithADView_(self) == ADXViewCompat_LAYOUT_DIRECTION_RTL;
  jint paddingStart = isRtl ? [self getPaddingRight] : [self getPaddingLeft];
  jint paddingEnd = isRtl ? [self getPaddingLeft] : [self getPaddingRight];
  jint childStart = paddingStart;
  jint childTop = [self getPaddingTop];
  jint childBottom = childTop;
  jint childEnd;
  jint maxChildEnd = right - left - paddingEnd;
  for (jint i = 0; i < [self getChildCount]; i++) {
    ADView *child = JreRetainedLocalValue([self getChildAtWithInt:i]);
    if ([((ADView *) nil_chk(child)) getVisibility] == ADView_GONE) {
      [child setTagWithInt:JreLoadStatic(ADR_id, row_index_key) withId:JavaLangInteger_valueOfWithInt_(-1)];
      continue;
    }
    ADViewGroup_LayoutParams *lp = JreRetainedLocalValue([child getLayoutParams]);
    jint startMargin = 0;
    jint endMargin = 0;
    if ([lp isKindOfClass:[ADViewGroup_MarginLayoutParams class]]) {
      ADViewGroup_MarginLayoutParams *marginLp = (ADViewGroup_MarginLayoutParams *) lp;
      startMargin = ADXMarginLayoutParamsCompat_getMarginStartWithADViewGroup_MarginLayoutParams_(marginLp);
      endMargin = ADXMarginLayoutParamsCompat_getMarginEndWithADViewGroup_MarginLayoutParams_(marginLp);
    }
    childEnd = childStart + startMargin + [child getMeasuredWidth];
    if (!singleLine_ && (childEnd > maxChildEnd)) {
      childStart = paddingStart;
      childTop = childBottom + lineSpacing_;
      rowCount_++;
    }
    [child setTagWithInt:JreLoadStatic(ADR_id, row_index_key) withId:JavaLangInteger_valueOfWithInt_(rowCount_ - 1)];
    childEnd = childStart + startMargin + [child getMeasuredWidth];
    childBottom = childTop + [child getMeasuredHeight];
    if (isRtl) {
      [child layoutWithInt:maxChildEnd - childEnd withInt:childTop withInt:maxChildEnd - childStart - startMargin withInt:childBottom];
    }
    else {
      [child layoutWithInt:childStart + startMargin withInt:childTop withInt:childEnd withInt:childBottom];
    }
    childStart += (startMargin + endMargin + [child getMeasuredWidth]) + itemSpacing_;
  }
}

- (jint)getRowCount {
  return rowCount_;
}

- (jint)getRowIndexWithADView:(ADView *)child {
  id index = JreRetainedLocalValue([((ADView *) nil_chk(child)) getTagWithInt:JreLoadStatic(ADR_id, row_index_key)]);
  if (!([index isKindOfClass:[JavaLangInteger class]])) {
    return -1;
  }
  return [((JavaLangInteger *) nil_chk((JavaLangInteger *) cast_chk(index, [JavaLangInteger class]))) intValue];
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x4, 0, 1, -1, -1, -1, -1 },
    { NULL, "V", 0x4, 2, 1, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 3, 4, -1, -1, -1, -1 },
    { NULL, "V", 0x4, 5, 6, -1, -1, -1, -1 },
    { NULL, "I", 0xa, 7, 8, -1, -1, -1, -1 },
    { NULL, "V", 0x4, 9, 10, -1, -1, -1, -1 },
    { NULL, "I", 0x4, -1, -1, -1, -1, -1, -1 },
    { NULL, "I", 0x1, 11, 12, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(setLineSpacingWithInt:);
  methods[2].selector = @selector(setItemSpacingWithInt:);
  methods[3].selector = @selector(isSingleLine);
  methods[4].selector = @selector(setSingleLineWithBoolean:);
  methods[5].selector = @selector(onMeasureWithInt:withInt:);
  methods[6].selector = @selector(getMeasuredDimensionWithInt:withInt:withInt:);
  methods[7].selector = @selector(onLayoutWithBoolean:withInt:withInt:withInt:withInt:);
  methods[8].selector = @selector(getRowCount);
  methods[9].selector = @selector(getRowIndexWithADView:);
  #pragma clang diagnostic pop
  static const J2ObjcFieldInfo fields[] = {
    { "lineSpacing_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "itemSpacing_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "singleLine_", "Z", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
    { "rowCount_", "I", .constantValue.asLong = 0, 0x2, -1, -1, -1, -1 },
  };
  static const void *ptrTable[] = { "setLineSpacing", "I", "setItemSpacing", "setSingleLine", "Z", "onMeasure", "II", "getMeasuredDimension", "III", "onLayout", "ZIIII", "getRowIndex", "LADView;" };
  static const J2ObjcClassInfo _ADXFlowLayout = { "FlowLayout", "com.google.android.material.internal", ptrTable, methods, fields, 7, 0x1, 10, 4, -1, -1, -1, -1, -1 };
  return &_ADXFlowLayout;
}

@end

void ADXFlowLayout_init(ADXFlowLayout *self) {
  ADViewGroup_init(self);
}

ADXFlowLayout *new_ADXFlowLayout_init() {
  J2OBJC_NEW_IMPL(ADXFlowLayout, init)
}

ADXFlowLayout *create_ADXFlowLayout_init() {
  J2OBJC_CREATE_IMPL(ADXFlowLayout, init)
}

jint ADXFlowLayout_getMeasuredDimensionWithInt_withInt_withInt_(jint size, jint mode, jint childrenEdge) {
  ADXFlowLayout_initialize();
  switch (mode) {
    case ADView_MeasureSpec_EXACTLY:
    return size;
    case ADView_MeasureSpec_AT_MOST:
    return JavaLangMath_minWithInt_withInt_(childrenEdge, size);
    default:
    return childrenEdge;
  }
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ADXFlowLayout)
