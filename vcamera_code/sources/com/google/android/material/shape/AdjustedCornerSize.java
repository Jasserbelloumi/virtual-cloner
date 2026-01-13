package com.google.android.material.shape;

import android.graphics.RectF;
import java.util.Arrays;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class AdjustedCornerSize implements CornerSize {
    private final float adjustment;
    private final CornerSize other;

    public AdjustedCornerSize(float f, @oo0oO0 CornerSize cornerSize) {
        while (cornerSize instanceof AdjustedCornerSize) {
            cornerSize = ((AdjustedCornerSize) cornerSize).other;
            f += ((AdjustedCornerSize) cornerSize).adjustment;
        }
        this.other = cornerSize;
        this.adjustment = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdjustedCornerSize) {
            AdjustedCornerSize adjustedCornerSize = (AdjustedCornerSize) obj;
            return this.other.equals(adjustedCornerSize.other) && this.adjustment == adjustedCornerSize.adjustment;
        }
        return false;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@oo0oO0 RectF rectF) {
        return Math.max(0.0f, this.other.getCornerSize(rectF) + this.adjustment);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.other, Float.valueOf(this.adjustment)});
    }
}
