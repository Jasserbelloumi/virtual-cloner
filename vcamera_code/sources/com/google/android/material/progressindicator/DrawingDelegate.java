package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import o00oOooO.o0O00O;
import o00oOooO.o0O0OO0;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {
    public DrawableWithAnimatedVisibilityChange drawable;
    public S spec;

    public DrawingDelegate(S s) {
        this.spec = s;
    }

    public abstract void adjustCanvas(@oo0oO0 Canvas canvas, @o0O0OO0(from = 0.0d, to = 1.0d) float f);

    public abstract void fillIndicator(@oo0oO0 Canvas canvas, @oo0oO0 Paint paint, @o0O0OO0(from = 0.0d, to = 1.0d) float f, @o0O0OO0(from = 0.0d, to = 1.0d) float f2, @o0O00O int i);

    public abstract void fillTrack(@oo0oO0 Canvas canvas, @oo0oO0 Paint paint);

    public abstract int getPreferredHeight();

    public abstract int getPreferredWidth();

    public void registerDrawable(@oo0oO0 DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
        this.drawable = drawableWithAnimatedVisibilityChange;
    }

    public void validateSpecAndAdjustCanvas(@oo0oO0 Canvas canvas, @o0O0OO0(from = 0.0d, to = 1.0d) float f) {
        this.spec.validateSpec();
        adjustCanvas(canvas, f);
    }
}
