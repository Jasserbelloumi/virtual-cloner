package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzje implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzq zzc;
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzd;
    public final /* synthetic */ zzjm zze;

    public zzje(zzjm zzjmVar, String str, String str2, zzq zzqVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zze = zzjmVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqVar;
        this.zzd = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                zzjm zzjmVar = this.zze;
                zzdxVar = zzjmVar.zzb;
                if (zzdxVar == null) {
                    zzjmVar.zzt.zzay().zzd().zzc("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
                } else {
                    Preconditions.checkNotNull(this.zzc);
                    arrayList = zzlb.zzH(zzdxVar.zzf(this.zza, this.zzb, this.zzc));
                    this.zze.zzQ();
                }
            } catch (RemoteException e) {
                this.zze.zzt.zzay().zzd().zzd("Failed to get conditional properties; remote exception", this.zza, this.zzb, e);
            }
        } finally {
            this.zze.zzt.zzv().zzQ(this.zzd, arrayList);
        }
    }
}
