package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
/* loaded from: classes2.dex */
final class zzbnz implements InitializationCompleteCallback {
    public final /* synthetic */ zzbjp zza;

    public zzbnz(zzbof zzbofVar, zzbjp zzbjpVar) {
        this.zza = zzbjpVar;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e) {
            zzbza.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        } catch (RemoteException e) {
            zzbza.zzh("", e);
        }
    }
}
