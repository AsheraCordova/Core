//start - license
/*
 * Copyright (c) 2025 Ashera Cordova
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
//end - license
package com.ashera.core.attributedtext;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/**
 * Class to load custom typeface fonts.
 */
public class CustomTypefaceSpan extends MetricAffectingSpan {
    private Typeface tf;
    private int style;

   /**
     * @param family The font family for this typeface.
     * @param start  Start.
     * @param end    End.
     * @param context Context.
     */
    public CustomTypefaceSpan(Typeface typeface, int style) {
        tf = typeface;
        this.style = style;
    }

    @Override
    public void updateDrawState(TextPaint ds) {
        apply(ds);
    }

    @Override
    public void updateMeasureState(TextPaint paint) {
        apply(paint);
    }

   /**
     * @param paint paint.
     * @param family    font family for which the font needs to be loaded.
     */
    private void apply(Paint paint) {
        if (isSystemFont(tf)) {
            if ((style & Typeface.BOLD) != 0) {
                paint.setFakeBoldText(true);
            }

            if ((style & Typeface.ITALIC) != 0) {
                paint.setTextSkewX(-0.25f);
            }

            paint.setTypeface(tf);
        } else {
        	paint.setTypeface(tf);
        }
    }

	private boolean isSystemFont(Typeface tf) {
		return tf == Typeface.DEFAULT || tf == Typeface.SERIF || tf == Typeface.SANS_SERIF || tf == Typeface.MONOSPACE;
	}
}
