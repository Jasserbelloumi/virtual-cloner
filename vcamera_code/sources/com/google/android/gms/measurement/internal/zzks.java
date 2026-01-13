package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzks {
    public final String zza;
    public long zzb;

    private zzks(zzkt zzktVar, String str) {
        this.zza = str;
        this.zzb = zzktVar.zzav().elapsedRealtime();
    }
}
