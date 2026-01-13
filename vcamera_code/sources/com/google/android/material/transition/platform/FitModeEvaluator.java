package com.google.android.material.transition.platform;

import android.graphics.RectF;
import o00oOooO.o0OOooO0;
/* JADX INFO: Access modifiers changed from: package-private */
@o0OOooO0(21)
/* loaded from: classes2.dex */
public interface FitModeEvaluator {
    void applyMask(RectF rectF, float f, FitModeResult fitModeResult);

    FitModeResult evaluate(float f, float f2, float f3, float f4, float f5, float f6, float f7);

    boolean shouldMaskStartBounds(FitModeResult fitModeResult);
}
