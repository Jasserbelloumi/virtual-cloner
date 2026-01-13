package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbtt implements Callable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzbtv zzb;

    public zzbtt(zzbtv zzbtvVar, Context context) {
        this.zzb = zzbtvVar;
        this.zza = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        WeakHashMap weakHashMap;
        zzbts zza;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzb.zza;
        zzbtu zzbtuVar = (zzbtu) weakHashMap.get(this.zza);
        if (zzbtuVar != null) {
            if (((Long) zzbca.zza.zze()).longValue() + zzbtuVar.zza >= com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()) {
                zza = new zzbtr(this.zza, zzbtuVar.zzb).zza();
                zzbtv zzbtvVar = this.zzb;
                weakHashMap2 = zzbtvVar.zza;
                weakHashMap2.put(this.zza, new zzbtu(zzbtvVar, zza));
                return zza;
            }
        }
        zza = new zzbtr(this.zza).zza();
        zzbtv zzbtvVar2 = this.zzb;
        weakHashMap2 = zzbtvVar2.zza;
        weakHashMap2.put(this.zza, new zzbtu(zzbtvVar2, zza));
        return zza;
    }
}
