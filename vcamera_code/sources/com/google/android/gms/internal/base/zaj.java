package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
final class zaj extends Drawable.ConstantState {
    public int zaa;
    public int zab;

    public zaj(@o0OO00OO zaj zajVar) {
        if (zajVar != null) {
            this.zaa = zajVar.zaa;
            this.zab = zajVar.zab;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.zaa;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new zak(this);
    }
}
