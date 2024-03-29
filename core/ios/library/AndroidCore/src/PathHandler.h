//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-javafx-widget\SWTAndroid\src\main\stub\r\android\graphics\PathHandler.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_PathHandler")
#ifdef RESTRICT_PathHandler
#define INCLUDE_ALL_PathHandler 0
#else
#define INCLUDE_ALL_PathHandler 1
#endif
#undef RESTRICT_PathHandler

#if !defined (ADPathHandler_) && (INCLUDE_ALL_PathHandler || defined(INCLUDE_ADPathHandler))
#define ADPathHandler_

/*!
 @brief This interface must be implemented and then registred as the
  handler of a <code>PathParser</code> instance in order to be
  notified of parsing events.
 @author <a href="mailto:stephane@@hillion.org">Stephane Hillion</a>
 @version $Id: PathHandler.java 475685 2006-11-16 11:16:05Z cam $
 */
@protocol ADPathHandler < JavaObject >

/*!
 @brief Invoked when the path starts.
 @throw BezierParseExceptionif an error occured while processing the path
 */
- (void)startPath;

/*!
 @brief Invoked when the path ends.
 @throw BezierParseExceptionif an error occured while processing the path
 */
- (void)endPath;

/*!
 @brief Invoked when a relative moveto command has been parsed.
 <p>Command : <b>m</b>
 @param x the relative x coordinate for the end point
 @param y the relative y coordinate for the end point
 @throw BezierParseExceptionif an error occured while processing the path
 */
- (void)movetoRelWithFloat:(jfloat)x
                 withFloat:(jfloat)y;

/*!
 @brief Invoked when an absolute moveto command has been parsed.
 <p>Command : <b>M</b>
 @param x the absolute x coordinate for the end point
 @param y the absolute y coordinate for the end point
 @throw BezierParseExceptionif an error occured while processing the path
 */
- (void)movetoAbsWithFloat:(jfloat)x
                 withFloat:(jfloat)y;

/*!
 @brief Invoked when a closepath has been parsed.
 <p>Command : <b>z</b> | <b>Z</b>
 @throw BezierParseExceptionif an error occured while processing the path
 */
- (void)closePath;

/*!
 @brief Invoked when a relative line command has been parsed.
 <p>Command : <b>l</b>
 @param x the relative x coordinates for the end point
 @param y the relative y coordinates for the end point
 @throw BezierParseExceptionif an error occured while processing the path
 */
- (void)linetoRelWithFloat:(jfloat)x
                 withFloat:(jfloat)y;

/*!
 @brief Invoked when an absolute line command has been parsed.
 <p>Command : <b>L</b>
 @param x the absolute x coordinate for the end point
 @param y the absolute y coordinate for the end point
 @throw BezierParseExceptionif an error occured while processing the path
 */
- (void)linetoAbsWithFloat:(jfloat)x
                 withFloat:(jfloat)y;

/*!
 @brief Invoked when an horizontal relative line command has been parsed.
 <p>Command : <b>h</b>
 @param x the relative X coordinate of the end point
 @throw BezierParseExceptionif an error occured while processing the path
 */
- (void)linetoHorizontalRelWithFloat:(jfloat)x;

/*!
 @brief Invoked when an horizontal absolute line command has been parsed.
 <p>Command : <b>H</b>
 @param x the absolute X coordinate of the end point
 @throw BezierParseExceptionif an error occured while processing the path
 */
- (void)linetoHorizontalAbsWithFloat:(jfloat)x;

/*!
 @brief Invoked when a vertical relative line command has been parsed.
 <p>Command : <b>v</b>
 @param y the relative Y coordinate of the end point
 @throw BezierParseExceptionif an error occured while processing the path
 */
- (void)linetoVerticalRelWithFloat:(jfloat)y;

/*!
 @brief Invoked when a vertical absolute line command has been parsed.
 <p>Command : <b>V</b>
 @param y the absolute Y coordinate of the end point
 @throw BezierParseExceptionif an error occured while processing the path
 */
- (void)linetoVerticalAbsWithFloat:(jfloat)y;

/*!
 @brief Invoked when a relative cubic bezier curve command has been parsed.
 <p>Command : <b>c</b>
 @param x1 the relative x coordinate for the first control point
 @param y1 the relative y coordinate for the first control point
 @param x2 the relative x coordinate for the second control point
 @param y2 the relative y coordinate for the second control point
 @param x the relative x coordinate for the end point
 @param y the relative y coordinate for the end point
 @throw BezierParseExceptionif an error occured while processing the path
 */
- (void)curvetoCubicRelWithFloat:(jfloat)x1
                       withFloat:(jfloat)y1
                       withFloat:(jfloat)x2
                       withFloat:(jfloat)y2
                       withFloat:(jfloat)x
                       withFloat:(jfloat)y;

/*!
 @brief Invoked when an absolute cubic bezier curve command has been parsed.
 <p>Command : <b>C</b>
 @param x1 the absolute x coordinate for the first control point
 @param y1 the absolute y coordinate for the first control point
 @param x2 the absolute x coordinate for the second control point
 @param y2 the absolute y coordinate for the second control point
 @param x the absolute x coordinate for the end point
 @param y the absolute y coordinate for the end point
 @throw BezierParseExceptionif an error occured while processing the path
 */
- (void)curvetoCubicAbsWithFloat:(jfloat)x1
                       withFloat:(jfloat)y1
                       withFloat:(jfloat)x2
                       withFloat:(jfloat)y2
                       withFloat:(jfloat)x
                       withFloat:(jfloat)y;

/*!
 @brief Invoked when a relative smooth cubic bezier curve command has
  been parsed.The first control point is assumed to be the
  reflection of the second control point on the previous command
  relative to the current point.
 <p>Command : <b>s</b>
 @param x2 the relative x coordinate for the second control point
 @param y2 the relative y coordinate for the second control point
 @param x the relative x coordinate for the end point
 @param y the relative y coordinate for the end point
 @throw BezierParseExceptionif an error occured while processing the path
 */
- (void)curvetoCubicSmoothRelWithFloat:(jfloat)x2
                             withFloat:(jfloat)y2
                             withFloat:(jfloat)x
                             withFloat:(jfloat)y;

/*!
 @brief Invoked when an absolute smooth cubic bezier curve command has
  been parsed.The first control point is assumed to be the
  reflection of the second control point on the previous command
  relative to the current point.
 <p>Command : <b>S</b>
 @param x2 the absolute x coordinate for the second control point
 @param y2 the absolute y coordinate for the second control point
 @param x the absolute x coordinate for the end point
 @param y the absolute y coordinate for the end point
 @throw BezierParseExceptionif an error occured while processing the path
 */
- (void)curvetoCubicSmoothAbsWithFloat:(jfloat)x2
                             withFloat:(jfloat)y2
                             withFloat:(jfloat)x
                             withFloat:(jfloat)y;

/*!
 @brief Invoked when a relative quadratic bezier curve command has been parsed.
 <p>Command : <b>q</b>
 @param x1 the relative x coordinate for the control point
 @param y1 the relative y coordinate for the control point
 @param x the relative x coordinate for the end point
 @param y the relative x coordinate for the end point
 @throw BezierParseExceptionif an error occured while processing the path
 */
- (void)curvetoQuadraticRelWithFloat:(jfloat)x1
                           withFloat:(jfloat)y1
                           withFloat:(jfloat)x
                           withFloat:(jfloat)y;

/*!
 @brief Invoked when an absolute quadratic bezier curve command has been parsed.
 <p>Command : <b>Q</b>
 @param x1 the absolute x coordinate for the control point
 @param y1 the absolute y coordinate for the control point
 @param x the absolute x coordinate for the end point
 @param y the absolute x coordinate for the end point
 @throw BezierParseExceptionif an error occured while processing the path
 */
- (void)curvetoQuadraticAbsWithFloat:(jfloat)x1
                           withFloat:(jfloat)y1
                           withFloat:(jfloat)x
                           withFloat:(jfloat)y;

/*!
 @brief Invoked when a relative smooth quadratic bezier curve command
  has been parsed.The control point is assumed to be the
  reflection of the control point on the previous command
  relative to the current point.
 <p>Command : <b>t</b>
 @param x the relative x coordinate for the end point
 @param y the relative y coordinate for the end point
 @throw BezierParseExceptionif an error occured while processing the path
 */
- (void)curvetoQuadraticSmoothRelWithFloat:(jfloat)x
                                 withFloat:(jfloat)y;

/*!
 @brief Invoked when an absolute smooth quadratic bezier curve command
  has been parsed.The control point is assumed to be the
  reflection of the control point on the previous command
  relative to the current point.
 <p>Command : <b>T</b>
 @param x the absolute x coordinate for the end point
 @param y the absolute y coordinate for the end point
 @throw BezierParseExceptionif an error occured while processing the path
 */
- (void)curvetoQuadraticSmoothAbsWithFloat:(jfloat)x
                                 withFloat:(jfloat)y;

/*!
 @brief Invoked when a relative elliptical arc command has been parsed.
 <p>Command : <b>a</b>
 @param rx the X axis radius for the ellipse
 @param ry the Y axis radius for the ellipse
 @param xAxisRotation the rotation angle in degrees for the ellipse's                       X-axis relative to the X-axis
 @param largeArcFlag the value of the large-arc-flag
 @param sweepFlag the value of the sweep-flag
 @param x the relative x coordinate for the end point
 @param y the relative y coordinate for the end point
 @throw BezierParseExceptionif an error occured while processing the path
 */
- (void)arcRelWithFloat:(jfloat)rx
              withFloat:(jfloat)ry
              withFloat:(jfloat)xAxisRotation
            withBoolean:(jboolean)largeArcFlag
            withBoolean:(jboolean)sweepFlag
              withFloat:(jfloat)x
              withFloat:(jfloat)y;

/*!
 @brief Invoked when an absolute elliptical arc command has been parsed.
 <p>Command : <b>A</b>
 @param rx the X axis radius for the ellipse
 @param ry the Y axis radius for the ellipse
 @param xAxisRotation the rotation angle in degrees for the ellipse's                       X-axis relative to the X-axis
 @param largeArcFlag the value of the large-arc-flag
 @param sweepFlag the value of the sweep-flag
 @param x the absolute x coordinate for the end point
 @param y the absolute y coordinate for the end point
 @throw BezierParseExceptionif an error occured while processing the path
 */
- (void)arcAbsWithFloat:(jfloat)rx
              withFloat:(jfloat)ry
              withFloat:(jfloat)xAxisRotation
            withBoolean:(jboolean)largeArcFlag
            withBoolean:(jboolean)sweepFlag
              withFloat:(jfloat)x
              withFloat:(jfloat)y;

@end

J2OBJC_EMPTY_STATIC_INIT(ADPathHandler)

J2OBJC_TYPE_LITERAL_HEADER(ADPathHandler)

#define RAndroidGraphicsPathHandler ADPathHandler

#endif

#pragma pop_macro("INCLUDE_ALL_PathHandler")
