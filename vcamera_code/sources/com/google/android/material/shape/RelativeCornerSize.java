package com.google.android.material.shape;

import android.graphics.RectF;
import com.google.common.collect.LinkedHashMultimap;
import java.util.Arrays;
import o00oOooO.o0O0OO0;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public final class RelativeCornerSize implements CornerSize {
    private final float percent;

    public RelativeCornerSize(@o0O0OO0(from = 0.0d, to = 1.0d) float f) {
        this.percent = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RelativeCornerSize) && this.percent == ((RelativeCornerSize) obj).percent;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@oo0oO0 RectF rectF) {
        return rectF.height() * this.percent;
    }

    @o0O0OO0(from = 0.0d, to = LinkedHashMultimap.VALUE_SET_LOAD_FACTOR)
    public float getRelativePercent() {
        return this.percent;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.percent)});
    }
}
