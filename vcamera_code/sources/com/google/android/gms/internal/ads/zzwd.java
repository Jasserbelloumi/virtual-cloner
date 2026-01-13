package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public final class zzwd {
    public final zzcp zza;
    public final int[] zzb;

    public zzwd(zzcp zzcpVar, int[] iArr, int i) {
        if (iArr.length == 0) {
            zzee.zzc("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzcpVar;
        this.zzb = iArr;
    }
}
