package com.google.android.material.shape;

import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public class EdgeTreatment {
    public boolean forceIntersection() {
        return false;
    }

    public void getEdgePath(float f, float f2, float f3, @oo0oO0 ShapePath shapePath) {
        shapePath.lineTo(f, 0.0f);
    }

    @Deprecated
    public void getEdgePath(float f, float f2, @oo0oO0 ShapePath shapePath) {
        getEdgePath(f, f / 2.0f, f2, shapePath);
    }
}
