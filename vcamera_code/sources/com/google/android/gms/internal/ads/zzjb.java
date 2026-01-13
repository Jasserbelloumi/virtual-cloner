package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjb implements zzjv {
    private final Object zza;
    private zzcn zzb;

    public zzjb(Object obj, zzcn zzcnVar) {
        this.zza = obj;
        this.zzb = zzcnVar;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzjb zzjbVar, zzcn zzcnVar) {
        zzjbVar.zzb = zzcnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final zzcn zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final Object zzb() {
        return this.zza;
    }
}
