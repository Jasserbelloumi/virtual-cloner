package com.google.android.material.canvas;

import android.graphics.Canvas;
import android.graphics.RectF;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class CanvasCompat {
    private CanvasCompat() {
    }

    public static int saveLayerAlpha(@oo0oO0 Canvas canvas, float f, float f2, float f3, float f4, int i) {
        return canvas.saveLayerAlpha(f, f2, f3, f4, i);
    }

    public static int saveLayerAlpha(@oo0oO0 Canvas canvas, @o0OO00OO RectF rectF, int i) {
        return canvas.saveLayerAlpha(rectF, i);
    }
}
