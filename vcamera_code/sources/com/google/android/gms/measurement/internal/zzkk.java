package com.google.android.gms.measurement.internal;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkk implements zzej {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzkt zzb;

    public zzkk(zzkt zzktVar, String str) {
        this.zzb = zzktVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    public final void zza(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.zzb.zzK(i, th, bArr, this.zza);
    }
}
