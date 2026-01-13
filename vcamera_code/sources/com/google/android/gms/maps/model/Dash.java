package com.google.android.gms.maps.model;

import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public final class Dash extends PatternItem {
    public final float length;

    public Dash(float f) {
        super(0, Float.valueOf(Math.max(f, 0.0f)));
        this.length = Math.max(f, 0.0f);
    }

    @Override // com.google.android.gms.maps.model.PatternItem
    @oo0oO0
    public String toString() {
        float f = this.length;
        return "[Dash: length=" + f + "]";
    }
}
