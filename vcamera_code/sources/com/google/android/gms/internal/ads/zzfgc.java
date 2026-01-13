package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
/* loaded from: classes2.dex */
public final class zzfgc {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzfgc zza = new zzfgc();
    private Context zzb;

    private zzfgc() {
    }

    public static zzfgc zzb() {
        return zza;
    }

    public final Context zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zzb = context != null ? context.getApplicationContext() : null;
    }
}
