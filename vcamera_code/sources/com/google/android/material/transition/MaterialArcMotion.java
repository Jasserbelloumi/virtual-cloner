package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import o00oOooO.oo0oO0;
import o0O0Oo0o.o0O000O;
/* loaded from: classes2.dex */
public final class MaterialArcMotion extends o0O000O {
    private static PointF getControlPoint(float f, float f2, float f3, float f4) {
        return f2 > f4 ? new PointF(f3, f2) : new PointF(f, f4);
    }

    @Override // o0O0Oo0o.o0O000O
    @oo0oO0
    public Path getPath(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        PointF controlPoint = getControlPoint(f, f2, f3, f4);
        path.quadTo(controlPoint.x, controlPoint.y, f3, f4);
        return path;
    }
}
