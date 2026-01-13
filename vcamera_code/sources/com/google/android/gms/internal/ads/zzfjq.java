package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class zzfjq {
    public final /* synthetic */ zzfjr zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzfjq(zzfjr zzfjrVar, byte[] bArr, zzfjp zzfjpVar) {
        this.zza = zzfjrVar;
        this.zzb = bArr;
    }

    public final zzfjq zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzfjq zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfjr zzfjrVar = this.zza;
            if (zzfjrVar.zzb) {
                zzfjrVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException unused) {
        }
    }
}
