package com.google.android.material.shape;

import android.graphics.RectF;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public class CornerTreatment {
    @Deprecated
    public void getCornerPath(float f, float f2, @oo0oO0 ShapePath shapePath) {
    }

    public void getCornerPath(@oo0oO0 ShapePath shapePath, float f, float f2, float f3) {
        getCornerPath(f, f2, shapePath);
    }

    public void getCornerPath(@oo0oO0 ShapePath shapePath, float f, float f2, @oo0oO0 RectF rectF, @oo0oO0 CornerSize cornerSize) {
        getCornerPath(shapePath, f, f2, cornerSize.getCornerSize(rectF));
    }
}
