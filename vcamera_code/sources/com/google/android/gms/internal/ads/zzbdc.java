package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class zzbdc {
    private static final AtomicReference zzb = new AtomicReference();
    private static final AtomicReference zzc = new AtomicReference();
    public static final AtomicBoolean zza = new AtomicBoolean();

    public static zzbda zza() {
        return (zzbda) zzb.get();
    }

    public static zzbdb zzb() {
        return (zzbdb) zzc.get();
    }

    public static void zzc(zzbda zzbdaVar) {
        zzb.set(zzbdaVar);
    }
}
