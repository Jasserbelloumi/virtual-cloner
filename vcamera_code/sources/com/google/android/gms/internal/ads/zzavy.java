package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;
import java.util.concurrent.Future;
import o00oOooO.o0OO00OO;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzavy implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    public final /* synthetic */ zzavq zza;
    public final /* synthetic */ zzbzs zzb;
    public final /* synthetic */ zzawa zzc;

    public zzavy(zzawa zzawaVar, zzavq zzavqVar, zzbzs zzbzsVar) {
        this.zzc = zzawaVar;
        this.zza = zzavqVar;
        this.zzb = zzbzsVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@o0OO00OO Bundle bundle) {
        Object obj;
        boolean z;
        final zzavp zzavpVar;
        obj = this.zzc.zzd;
        synchronized (obj) {
            zzawa zzawaVar = this.zzc;
            z = zzawaVar.zzb;
            if (z) {
                return;
            }
            zzawaVar.zzb = true;
            zzavpVar = this.zzc.zza;
            if (zzavpVar == null) {
                return;
            }
            zzfuu zzfuuVar = zzbzn.zza;
            final zzavq zzavqVar = this.zza;
            final zzbzs zzbzsVar = this.zzb;
            final zzfut zza = zzfuuVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzavv
                @Override // java.lang.Runnable
                public final void run() {
                    zzavy zzavyVar = zzavy.this;
                    zzavp zzavpVar2 = zzavpVar;
                    zzavq zzavqVar2 = zzavqVar;
                    zzbzs zzbzsVar2 = zzbzsVar;
                    try {
                        zzavs zzq = zzavpVar2.zzq();
                        zzavn zzg = zzavpVar2.zzp() ? zzq.zzg(zzavqVar2) : zzq.zzf(zzavqVar2);
                        if (!zzg.zze()) {
                            zzbzsVar2.zze(new RuntimeException("No entry contents."));
                            zzawa.zze(zzavyVar.zzc);
                            return;
                        }
                        zzavx zzavxVar = new zzavx(zzavyVar, zzg.zzc(), 1);
                        int read = zzavxVar.read();
                        if (read == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zzavxVar.unread(read);
                        zzbzsVar2.zzd(zzawc.zzb(zzavxVar, zzg.zzd(), zzg.zzg(), zzg.zza(), zzg.zzf()));
                    } catch (RemoteException | IOException e) {
                        zzbza.zzh("Unable to obtain a cache service instance.", e);
                        zzbzsVar2.zze(e);
                        zzawa.zze(zzavyVar.zzc);
                    }
                }
            });
            final zzbzs zzbzsVar2 = this.zzb;
            zzbzsVar2.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzavw
                @Override // java.lang.Runnable
                public final void run() {
                    zzbzs zzbzsVar3 = zzbzs.this;
                    Future future = zza;
                    if (zzbzsVar3.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, zzbzn.zzf);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
