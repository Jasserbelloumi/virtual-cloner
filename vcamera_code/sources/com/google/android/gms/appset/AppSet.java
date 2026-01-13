package com.google.android.gms.appset;

import android.content.Context;
import com.google.android.gms.internal.appset.zzr;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class AppSet {
    private AppSet() {
    }

    @oo0oO0
    public static AppSetIdClient getClient(@oo0oO0 Context context) {
        return new zzr(context);
    }
}
