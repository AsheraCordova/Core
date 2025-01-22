//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\ios_widget_library\src\main\java\com\ashera\layout\ListViewImpl.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ListViewImpl")
#ifdef RESTRICT_ListViewImpl
#define INCLUDE_ALL_ListViewImpl 0
#else
#define INCLUDE_ALL_ListViewImpl 1
#endif
#undef RESTRICT_ListViewImpl

#if __has_feature(nullability)
#pragma clang diagnostic push
#pragma GCC diagnostic ignored "-Wnullability"
#pragma GCC diagnostic ignored "-Wnullability-completeness"
#endif

#if !defined (ASListViewImpl_) && (INCLUDE_ALL_ListViewImpl || defined(INCLUDE_ASListViewImpl))
#define ASListViewImpl_

#define RESTRICT_BaseHasWidgets 1
#define INCLUDE_ASBaseHasWidgets 1
#include "BaseHasWidgets.h"

@class ASListViewImpl_ListAdapter;
@class ASLoopParam;
@class ASWidgetAttribute;
@class IOSClass;
@protocol ASIFragment;
@protocol ASILifeCycleDecorator;
@protocol ASIWidget;
@protocol JavaUtilList;
@protocol JavaUtilMap;

@interface ASListViewImpl : ASBaseHasWidgets
@property id uiView;

#pragma mark Public

- (instancetype)init;

- (instancetype)initWithNSString:(NSString *)localname;

- (instancetype)initWithNSString:(NSString *)groupName
                    withNSString:(NSString *)localname;

- (void)addWithASIWidget:(id<ASIWidget>)w
                 withInt:(jint)index;

- (void)addAllModelWithId:(id)objValue;

- (jboolean)areWidgetItemsRecycled;

- (id)asNativeWidget;

- (id)asWidget;

- (jint)calculateHeightOfRowWithInt:(jint)index;

- (jboolean)checkIosVersionWithNSString:(NSString *)v;

- (void)clear;

- (void)createWithASIFragment:(id<ASIFragment>)fragment
              withJavaUtilMap:(id<JavaUtilMap>)params;

- (void)drawableStateChanged;

- (id)getAllowsFocus;

- (id)getAllowsFocusDuringEditing;

- (id)getAllowsMultipleSelection;

- (id)getAllowsMultipleSelectionDuringEditing;

- (id)getAllowsSelection;

- (id)getAllowsSelectionDuringEditing;

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
              withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (id)getCellLayoutMarginsFollowReadableWidth;

- (id)getChildAttributeWithASIWidget:(id<ASIWidget>)w
               withASWidgetAttribute:(ASWidgetAttribute *)key;

- (id<JavaUtilList>)getData;

- (id)getDragInteractionEnabled;

- (id)getEstimatedRowHeight;

- (id)getEstimatedSectionFooterHeight;

- (id)getEstimatedSectionHeaderHeight;

- (id)getFillerRowHeight;

- (id)getHasActiveDrag;

- (id)getHasActiveDrop;

- (id)getHasUncommittedUpdates;

- (id)getInsetsContentViewsToSafeArea;

- (id)getIsEditing;

- (id)getIsPrefetchingEnabled;

- (ASListViewImpl_ListAdapter *)getListAdapter;

- (id)getListSelector;

- (id)getNumberOfSections;

- (id)getRemembersLastFocusedIndexPath;

- (id)getRowHeight;

- (id)getScrollX;

- (id)getScrollY;

- (id)getSectionFooterHeight;

- (id)getSectionHeaderHeight;

- (id)getSectionHeaderTopPadding;

- (id)getSectionIndexBackgroundColor;

- (id)getSectionIndexColor;

- (id)getSectionIndexMinimumDisplayRowCount;

- (id)getSectionIndexTrackingBackgroundColor;

- (id)getSelectionFollowsFocus;

- (id)getSeparatorColor;

- (IOSClass *)getViewClass;

- (void)invalidate;

- (void)loadAttributesWithNSString:(NSString *)localName;

- (jdouble)nativeGetScrollXWithId:(id)view;

- (jdouble)nativeGetScrollYWithId:(id)view;

- (void)nativeSetScrollXWithId:(id)view
                       withInt:(jint)value;

- (void)nativeSetScrollYWithId:(id)view
                       withInt:(jint)value;

- (id<ASIWidget>)newInstance OBJC_METHOD_FAMILY_NONE;

- (void)notifyDataSetChanged;

- (jboolean)removeWithInt:(jint)index;

- (void)requestLayout;

- (void)setAllowsFocusWithId:(id)nativeWidget
                      withId:(id)value;

- (void)setAllowsFocusDuringEditingWithId:(id)nativeWidget
                                   withId:(id)value;

- (void)setAllowsMultipleSelectionWithId:(id)nativeWidget
                                  withId:(id)value;

- (void)setAllowsMultipleSelectionDuringEditingWithId:(id)nativeWidget
                                               withId:(id)value;

- (void)setAllowsSelectionWithId:(id)nativeWidget
                          withId:(id)value;

- (void)setAllowsSelectionDuringEditingWithId:(id)nativeWidget
                                       withId:(id)value;

- (void)setAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
                             withNSString:(NSString *)strValue
                                   withId:(id)objValue
                withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (void)setCellLayoutMarginsFollowReadableWidthWithId:(id)nativeWidget
                                               withId:(id)value;

- (void)setChildAttributeWithASIWidget:(id<ASIWidget>)w
                 withASWidgetAttribute:(ASWidgetAttribute *)key
                          withNSString:(NSString *)strValue
                                withId:(id)objValue;

- (void)setDragInteractionEnabledWithId:(id)nativeWidget
                                 withId:(id)value;

- (void)setEstimatedRowHeightWithId:(id)nativeWidget
                             withId:(id)value;

- (void)setEstimatedSectionFooterHeightWithId:(id)nativeWidget
                                       withId:(id)value;

- (void)setEstimatedSectionHeaderHeightWithId:(id)nativeWidget
                                       withId:(id)value;

- (void)setFillerRowHeightWithId:(id)nativeWidget
                          withId:(id)value;

- (void)setIdWithNSString:(NSString *)id_;

- (void)setInsetsContentViewsToSafeAreaWithId:(id)nativeWidget
                                       withId:(id)value;

- (void)setIsEditingWithId:(id)nativeWidget
                    withId:(id)value;

- (void)setIsPrefetchingEnabledWithId:(id)nativeWidget
                               withId:(id)value;

- (void)setOnItemClickWithId:(id)objValue;

- (void)setRemembersLastFocusedIndexPathWithId:(id)nativeWidget
                                        withId:(id)value;

- (void)setRowHeightWithId:(id)nativeWidget
                    withId:(id)value;

- (void)setSectionFooterHeightWithId:(id)nativeWidget
                              withId:(id)value;

- (void)setSectionHeaderHeightWithId:(id)nativeWidget
                              withId:(id)value;

- (void)setSectionHeaderTopPaddingWithId:(id)nativeWidget
                                  withId:(id)value;

- (void)setSectionIndexBackgroundColorWithId:(id)nativeWidget
                                      withId:(id)value;

- (void)setSectionIndexColorWithId:(id)nativeWidget
                            withId:(id)value;

- (void)setSectionIndexMinimumDisplayRowCountWithId:(id)nativeWidget
                                             withId:(id)value;

- (void)setSectionIndexTrackingBackgroundColorWithId:(id)nativeWidget
                                              withId:(id)value;

- (void)setSelectionFollowsFocusWithId:(id)nativeWidget
                                withId:(id)value;

- (void)setSeparatorColorWithId:(id)nativeWidget
                         withId:(id)value;

- (void)setVisibleWithBoolean:(jboolean)b;

- (void)updateModelToEventMapWithJavaUtilMap:(id<JavaUtilMap>)eventMap
                                withNSString:(NSString *)eventType
                                withNSString:(NSString *)eventParams;

#pragma mark Protected

- (void)addObjectWithASLoopParam:(ASLoopParam *)childModel
                    withNSString:(NSString *)modelIdPath
                         withInt:(jint)index
                    withNSString:(NSString *)currentLoopVar;

- (void)clearModel;

#pragma mark Package-Private

@end

J2OBJC_EMPTY_STATIC_INIT(ASListViewImpl)

inline NSString *ASListViewImpl_get_LOCAL_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASListViewImpl_LOCAL_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASListViewImpl, LOCAL_NAME, NSString *)

inline NSString *ASListViewImpl_get_GROUP_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASListViewImpl_GROUP_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASListViewImpl, GROUP_NAME, NSString *)

inline NSString *ASListViewImpl_get_simpleTableIdentifier(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASListViewImpl_simpleTableIdentifier;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASListViewImpl, simpleTableIdentifier, NSString *)

FOUNDATION_EXPORT void ASListViewImpl_init(ASListViewImpl *self);

FOUNDATION_EXPORT ASListViewImpl *new_ASListViewImpl_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASListViewImpl *create_ASListViewImpl_init(void);

FOUNDATION_EXPORT void ASListViewImpl_initWithNSString_(ASListViewImpl *self, NSString *localname);

FOUNDATION_EXPORT ASListViewImpl *new_ASListViewImpl_initWithNSString_(NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASListViewImpl *create_ASListViewImpl_initWithNSString_(NSString *localname);

FOUNDATION_EXPORT void ASListViewImpl_initWithNSString_withNSString_(ASListViewImpl *self, NSString *groupName, NSString *localname);

FOUNDATION_EXPORT ASListViewImpl *new_ASListViewImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASListViewImpl *create_ASListViewImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname);

J2OBJC_TYPE_LITERAL_HEADER(ASListViewImpl)

@compatibility_alias ComAsheraLayoutListViewImpl ASListViewImpl;

#endif

#if !defined (ASListViewImpl_ChoiceMode_) && (INCLUDE_ALL_ListViewImpl || defined(INCLUDE_ASListViewImpl_ChoiceMode))
#define ASListViewImpl_ChoiceMode_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASListViewImpl_ChoiceMode : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASListViewImpl_ChoiceMode)

FOUNDATION_EXPORT void ASListViewImpl_ChoiceMode_init(ASListViewImpl_ChoiceMode *self);

FOUNDATION_EXPORT ASListViewImpl_ChoiceMode *new_ASListViewImpl_ChoiceMode_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASListViewImpl_ChoiceMode *create_ASListViewImpl_ChoiceMode_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASListViewImpl_ChoiceMode)

#endif

#if !defined (ASListViewImpl_IosSeparatorStyle_) && (INCLUDE_ALL_ListViewImpl || defined(INCLUDE_ASListViewImpl_IosSeparatorStyle))
#define ASListViewImpl_IosSeparatorStyle_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASListViewImpl_IosSeparatorStyle : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASListViewImpl_IosSeparatorStyle)

FOUNDATION_EXPORT void ASListViewImpl_IosSeparatorStyle_init(ASListViewImpl_IosSeparatorStyle *self);

FOUNDATION_EXPORT ASListViewImpl_IosSeparatorStyle *new_ASListViewImpl_IosSeparatorStyle_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASListViewImpl_IosSeparatorStyle *create_ASListViewImpl_IosSeparatorStyle_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASListViewImpl_IosSeparatorStyle)

#endif

#if !defined (ASListViewImpl_IosCellSelectionStyle_) && (INCLUDE_ALL_ListViewImpl || defined(INCLUDE_ASListViewImpl_IosCellSelectionStyle))
#define ASListViewImpl_IosCellSelectionStyle_

#define RESTRICT_AbstractEnumToIntConverter 1
#define INCLUDE_ASAbstractEnumToIntConverter 1
#include "AbstractEnumToIntConverter.h"

@class JavaLangInteger;
@protocol JavaUtilMap;

@interface ASListViewImpl_IosCellSelectionStyle : ASAbstractEnumToIntConverter

#pragma mark Public

- (JavaLangInteger *)getDefault;

- (id<JavaUtilMap>)getMapping;

#pragma mark Package-Private

- (instancetype)init;

@end

J2OBJC_EMPTY_STATIC_INIT(ASListViewImpl_IosCellSelectionStyle)

FOUNDATION_EXPORT void ASListViewImpl_IosCellSelectionStyle_init(ASListViewImpl_IosCellSelectionStyle *self);

FOUNDATION_EXPORT ASListViewImpl_IosCellSelectionStyle *new_ASListViewImpl_IosCellSelectionStyle_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASListViewImpl_IosCellSelectionStyle *create_ASListViewImpl_IosCellSelectionStyle_init(void);

J2OBJC_TYPE_LITERAL_HEADER(ASListViewImpl_IosCellSelectionStyle)

#endif

#if !defined (ASListViewImpl_ListViewExt_) && (INCLUDE_ALL_ListViewImpl || defined(INCLUDE_ASListViewImpl_ListViewExt))
#define ASListViewImpl_ListViewExt_

#define RESTRICT_ListView 1
#define INCLUDE_ADListView 1
#include "ListView.h"

#define RESTRICT_ILifeCycleDecorator 1
#define INCLUDE_ASILifeCycleDecorator 1
#include "ILifeCycleDecorator.h"

#define RESTRICT_IMaxDimension 1
#define INCLUDE_ASIMaxDimension 1
#include "IMaxDimension.h"

@class ADRect;
@class ADView;
@class ASListViewImpl;
@class ASWidgetAttribute;
@class IOSIntArray;
@class IOSObjectArray;
@protocol ASIWidget;
@protocol JavaUtilList;

@interface ASListViewImpl_ListViewExt : ADListView < ASILifeCycleDecorator, ASIMaxDimension >

#pragma mark Public

- (instancetype)initWithASListViewImpl:(ASListViewImpl *)outer$;

- (void)drawableStateChanged;

- (void)endViewTransitionWithADView:(ADView *)view;

- (void)executeWithNSString:(NSString *)method
          withNSObjectArray:(IOSObjectArray *)canvas;

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)widgetAttribute;

- (void)getLocationOnScreenWithIntArray:(IOSIntArray *)appScreenLocation;

- (jint)getMaxHeight;

- (jint)getMaxWidth;

- (id<JavaUtilList>)getMethods;

- (id<ASIWidget>)getWidget;

- (void)getWindowVisibleDisplayFrameWithADRect:(ADRect *)displayFrame;

- (ADView *)inflateViewWithNSString:(NSString *)layout;

- (void)initialized OBJC_METHOD_FAMILY_NONE;

- (jint)measureHeightOfChildrenWithInt:(jint)widthMeasureSpec
                               withInt:(jint)startPosition
                               withInt:(jint)endPosition
                               withInt:(jint)maxHeight
                               withInt:(jint)disallowPartialChildPosition;

- (id<ASILifeCycleDecorator>)newInstanceWithASIWidget:(id<ASIWidget>)widget OBJC_METHOD_FAMILY_NONE;

- (void)offsetLeftAndRightWithInt:(jint)offset;

- (void)offsetTopAndBottomWithInt:(jint)offset;

- (void)onMeasureWithInt:(jint)widthMeasureSpec
                 withInt:(jint)heightMeasureSpec;

- (void)remeasure;

- (void)removeFromParent;

- (void)setAttributeWithASWidgetAttribute:(ASWidgetAttribute *)widgetAttribute
                             withNSString:(NSString *)strValue
                                   withId:(id)objValue;

- (void)setMaxHeightWithInt:(jint)height;

- (void)setMaxWidthWithInt:(jint)width;

- (void)setMyAttributeWithNSString:(NSString *)name
                            withId:(id)value;

- (void)setState0WithId:(id)value;

- (void)setState1WithId:(id)value;

- (void)setState2WithId:(id)value;

- (void)setState3WithId:(id)value;

- (void)setState4WithId:(id)value;

- (void)setVisibilityWithInt:(jint)visibility;

- (void)state0;

- (void)state1;

- (void)state2;

- (void)state3;

- (void)state4;

- (void)stateNo;

- (void)stateYes;

- (void)updateMeasuredDimensionWithInt:(jint)width
                               withInt:(jint)height;

#pragma mark Protected

- (void)onLayoutWithBoolean:(jboolean)changed
                    withInt:(jint)l
                    withInt:(jint)t
                    withInt:(jint)r
                    withInt:(jint)b;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASListViewImpl_ListViewExt)

FOUNDATION_EXPORT void ASListViewImpl_ListViewExt_initWithASListViewImpl_(ASListViewImpl_ListViewExt *self, ASListViewImpl *outer$);

FOUNDATION_EXPORT ASListViewImpl_ListViewExt *new_ASListViewImpl_ListViewExt_initWithASListViewImpl_(ASListViewImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASListViewImpl_ListViewExt *create_ASListViewImpl_ListViewExt_initWithASListViewImpl_(ASListViewImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASListViewImpl_ListViewExt)

#endif

#if !defined (ASListViewImpl_ListAdapter_) && (INCLUDE_ALL_ListViewImpl || defined(INCLUDE_ASListViewImpl_ListAdapter))
#define ASListViewImpl_ListAdapter_

#define RESTRICT_BaseAdapter 1
#define INCLUDE_ADBaseAdapter 1
#include "BaseAdapter.h"

#define RESTRICT_Filterable 1
#define INCLUDE_ADFilterable 1
#include "Filterable.h"

@class ADFilter;
@class ADView;
@class ADViewGroup;
@class ASListViewImpl;

@interface ASListViewImpl_ListAdapter : ADBaseAdapter < ADFilterable >

#pragma mark Public

- (instancetype)initWithASListViewImpl:(ASListViewImpl *)outer$;

- (void)dofilterSyncWithNSString:(NSString *)text;

- (jint)getCount;

- (ADFilter *)getFilter;

- (id)getItemWithInt:(jint)position;

- (jlong)getItemIdWithInt:(jint)position;

- (ADView *)getViewWithInt:(jint)position
                withADView:(ADView *)convertView
           withADViewGroup:(ADViewGroup *)parent;

- (jboolean)hasStableIds;

- (jboolean)isEnabledWithInt:(jint)position;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASListViewImpl_ListAdapter)

FOUNDATION_EXPORT void ASListViewImpl_ListAdapter_initWithASListViewImpl_(ASListViewImpl_ListAdapter *self, ASListViewImpl *outer$);

FOUNDATION_EXPORT ASListViewImpl_ListAdapter *new_ASListViewImpl_ListAdapter_initWithASListViewImpl_(ASListViewImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASListViewImpl_ListAdapter *create_ASListViewImpl_ListAdapter_initWithASListViewImpl_(ASListViewImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASListViewImpl_ListAdapter)

#endif

#if !defined (ASListViewImpl_PostMeasureEventHandler_) && (INCLUDE_ALL_ListViewImpl || defined(INCLUDE_ASListViewImpl_PostMeasureEventHandler))
#define ASListViewImpl_PostMeasureEventHandler_

#define RESTRICT_EventBusHandler 1
#define INCLUDE_ASEventBusHandler 1
#include "EventBusHandler.h"

@class ASListViewImpl;

@interface ASListViewImpl_PostMeasureEventHandler : ASEventBusHandler

#pragma mark Public

- (instancetype)initWithASListViewImpl:(ASListViewImpl *)outer$
                          withNSString:(NSString *)type;

#pragma mark Protected

- (void)doPerformWithId:(id)payload;

// Disallowed inherited constructors, do not use.

- (instancetype)initWithNSString:(NSString *)arg0 NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASListViewImpl_PostMeasureEventHandler)

FOUNDATION_EXPORT void ASListViewImpl_PostMeasureEventHandler_initWithASListViewImpl_withNSString_(ASListViewImpl_PostMeasureEventHandler *self, ASListViewImpl *outer$, NSString *type);

FOUNDATION_EXPORT ASListViewImpl_PostMeasureEventHandler *new_ASListViewImpl_PostMeasureEventHandler_initWithASListViewImpl_withNSString_(ASListViewImpl *outer$, NSString *type) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASListViewImpl_PostMeasureEventHandler *create_ASListViewImpl_PostMeasureEventHandler_initWithASListViewImpl_withNSString_(ASListViewImpl *outer$, NSString *type);

J2OBJC_TYPE_LITERAL_HEADER(ASListViewImpl_PostMeasureEventHandler)

#endif


#if __has_feature(nullability)
#pragma clang diagnostic pop
#endif
#pragma pop_macro("INCLUDE_ALL_ListViewImpl")
