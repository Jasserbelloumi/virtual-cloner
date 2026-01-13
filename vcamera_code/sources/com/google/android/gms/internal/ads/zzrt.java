package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public abstract class zzrt implements zzsu {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zztb zzc = new zztb();
    private final zzpt zzd = new zzpt();
    @o0OO00OO
    private Looper zze;
    @o0OO00OO
    private zzcn zzf;
    @o0OO00OO
    private zzno zzg;

    @Override // com.google.android.gms.internal.ads.zzsu
    public /* synthetic */ zzcn zzL() {
        return null;
    }

    public final zzno zzb() {
        zzno zznoVar = this.zzg;
        zzdl.zzb(zznoVar);
        return zznoVar;
    }

    public final zzpt zzc(@o0OO00OO zzss zzssVar) {
        return this.zzd.zza(0, zzssVar);
    }

    public final zzpt zzd(int i, @o0OO00OO zzss zzssVar) {
        return this.zzd.zza(0, zzssVar);
    }

    public final zztb zze(@o0OO00OO zzss zzssVar) {
        return this.zzc.zza(0, zzssVar, 0L);
    }

    public final zztb zzf(int i, @o0OO00OO zzss zzssVar, long j) {
        return this.zzc.zza(0, zzssVar, 0L);
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzg(Handler handler, zzpu zzpuVar) {
        zzpuVar.getClass();
        this.zzd.zzb(handler, zzpuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzh(Handler handler, zztc zztcVar) {
        zztcVar.getClass();
        this.zzc.zzb(handler, zztcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzi(zzst zzstVar) {
        boolean z = !this.zzb.isEmpty();
        this.zzb.remove(zzstVar);
        if (z && this.zzb.isEmpty()) {
            zzj();
        }
    }

    public void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzk(zzst zzstVar) {
        this.zze.getClass();
        boolean isEmpty = this.zzb.isEmpty();
        this.zzb.add(zzstVar);
        if (isEmpty) {
            zzl();
        }
    }

    public void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzm(zzst zzstVar, @o0OO00OO zzgi zzgiVar, zzno zznoVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        zzdl.zzd(z);
        this.zzg = zznoVar;
        zzcn zzcnVar = this.zzf;
        this.zza.add(zzstVar);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zzstVar);
            zzn(zzgiVar);
        } else if (zzcnVar != null) {
            zzk(zzstVar);
            zzstVar.zza(this, zzcnVar);
        }
    }

    public abstract void zzn(@o0OO00OO zzgi zzgiVar);

    public final void zzo(zzcn zzcnVar) {
        this.zzf = zzcnVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzst) arrayList.get(i)).zza(this, zzcnVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzp(zzst zzstVar) {
        this.zza.remove(zzstVar);
        if (!this.zza.isEmpty()) {
            zzi(zzstVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzb.clear();
        zzq();
    }

    public abstract void zzq();

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzr(zzpu zzpuVar) {
        this.zzd.zzc(zzpuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public final void zzs(zztc zztcVar) {
        this.zzc.zzm(zztcVar);
    }

    public final boolean zzt() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    public /* synthetic */ boolean zzu() {
        return true;
    }
}
