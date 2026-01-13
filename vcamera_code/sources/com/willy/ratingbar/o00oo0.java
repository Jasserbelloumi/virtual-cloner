package com.willy.ratingbar;

import android.graphics.drawable.Drawable;
import o00oOooO.o0O0O0o0;
import o00oOooO.o0O0OO0;
import o00oOooO.o0O0o00O;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public interface o00oo0 {
    int getNumStars();

    float getRating();

    int getStarHeight();

    int getStarPadding();

    int getStarWidth();

    float getStepSize();

    boolean isClickable();

    boolean o00oOOo0();

    boolean o00oOOoO();

    boolean o00oOo00();

    void setClearRatingEnabled(boolean z);

    void setClickable(boolean z);

    void setEmptyDrawable(@oo0oO0 Drawable drawable);

    void setEmptyDrawableRes(@o0O0O0o0 int i);

    void setFilledDrawable(@oo0oO0 Drawable drawable);

    void setFilledDrawableRes(@o0O0O0o0 int i);

    void setIsIndicator(boolean z);

    void setMinimumStars(@o0O0OO0(from = 0.0d) float f);

    void setNumStars(int i);

    void setRating(float f);

    void setScrollable(boolean z);

    void setStarHeight(@o0O0o00O(from = 0) int i);

    void setStarPadding(int i);

    void setStarWidth(@o0O0o00O(from = 0) int i);

    void setStepSize(@o0O0OO0(from = 0.1d, to = 1.0d) float f);
}
