package com.google.android.material.color;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.resources.MaterialAttributes;
import o00oOooO.o0O000Oo;
import o00oOooO.o0O00O;
import o00oOooO.o0O0OO0;
import o00oOooO.o0O0o00O;
import o00oOooO.oo0oO0;
import o00oooOo.oOO00OO;
/* loaded from: classes2.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;

    private MaterialColors() {
    }

    @o0O00O
    public static int compositeARGBWithAlpha(@o0O00O int i, @o0O0o00O(from = 0, to = 255) int i2) {
        return oOO00OO.o00ooO(i, (Color.alpha(i) * i2) / 255);
    }

    @o0O00O
    public static int getColor(@oo0oO0 Context context, @o0O000Oo int i, @o0O00O int i2) {
        TypedValue resolve = MaterialAttributes.resolve(context, i);
        return resolve != null ? resolve.data : i2;
    }

    @o0O00O
    public static int getColor(Context context, @o0O000Oo int i, String str) {
        return MaterialAttributes.resolveOrThrow(context, i, str);
    }

    @o0O00O
    public static int getColor(@oo0oO0 View view, @o0O000Oo int i) {
        return MaterialAttributes.resolveOrThrow(view, i);
    }

    @o0O00O
    public static int getColor(@oo0oO0 View view, @o0O000Oo int i, @o0O00O int i2) {
        return getColor(view.getContext(), i, i2);
    }

    @o0O00O
    public static int layer(@o0O00O int i, @o0O00O int i2) {
        return oOO00OO.o00oo0o(i2, i);
    }

    @o0O00O
    public static int layer(@o0O00O int i, @o0O00O int i2, @o0O0OO0(from = 0.0d, to = 1.0d) float f) {
        return layer(i, oOO00OO.o00ooO(i2, Math.round(Color.alpha(i2) * f)));
    }

    @o0O00O
    public static int layer(@oo0oO0 View view, @o0O000Oo int i, @o0O000Oo int i2) {
        return layer(view, i, i2, 1.0f);
    }

    @o0O00O
    public static int layer(@oo0oO0 View view, @o0O000Oo int i, @o0O000Oo int i2, @o0O0OO0(from = 0.0d, to = 1.0d) float f) {
        return layer(getColor(view, i), getColor(view, i2), f);
    }
}
