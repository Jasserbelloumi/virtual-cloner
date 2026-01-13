package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbjr;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
final class zzei extends zzbjr {
    public final /* synthetic */ zzej zza;

    public /* synthetic */ zzei(zzej zzejVar, zzeh zzehVar) {
        this.zza = zzejVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final void zzb(List list) throws RemoteException {
        int i;
        ArrayList arrayList;
        synchronized (zzej.zzg(this.zza)) {
            zzej.zzj(this.zza, false);
            zzej.zzi(this.zza, true);
            arrayList = new ArrayList(zzej.zzh(this.zza));
            zzej.zzh(this.zza).clear();
        }
        InitializationStatus zzd = zzej.zzd(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(zzd);
        }
    }
}
