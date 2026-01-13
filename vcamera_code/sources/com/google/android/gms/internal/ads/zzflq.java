package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
/* loaded from: classes2.dex */
public final class zzflq {
    @SuppressLint({"RestrictedApi"})
    public static zzflp zza(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new zzflr(new zzflx(context));
    }
}
