package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjd implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzq zzd;
    public final /* synthetic */ zzjm zze;

    public zzjd(zzjm zzjmVar, AtomicReference atomicReference, String str, String str2, String str3, zzq zzqVar) {
        this.zze = zzjmVar;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjm zzjmVar;
        zzdx zzdxVar;
        AtomicReference atomicReference2;
        List zzg;
        synchronized (this.zza) {
            try {
                zzjmVar = this.zze;
                zzdxVar = zzjmVar.zzb;
            } catch (RemoteException e) {
                this.zze.zzt.zzay().zzd().zzd("(legacy) Failed to get conditional properties; remote exception", null, this.zzb, e);
                this.zza.set(Collections.emptyList());
                atomicReference = this.zza;
            }
            if (zzdxVar == null) {
                zzjmVar.zzt.zzay().zzd().zzd("(legacy) Failed to get conditional properties; not connected to service", null, this.zzb, this.zzc);
                this.zza.set(Collections.emptyList());
                this.zza.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                Preconditions.checkNotNull(this.zzd);
                atomicReference2 = this.zza;
                zzg = zzdxVar.zzf(this.zzb, this.zzc, this.zzd);
            } else {
                atomicReference2 = this.zza;
                zzg = zzdxVar.zzg(null, this.zzb, this.zzc);
            }
            atomicReference2.set(zzg);
            this.zze.zzQ();
            atomicReference = this.zza;
            atomicReference.notify();
        }
    }
}
