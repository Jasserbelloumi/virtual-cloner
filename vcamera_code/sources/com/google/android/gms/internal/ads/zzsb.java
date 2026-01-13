package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import o00oOooO.o0O00O0;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public abstract class zzsb extends zzrt {
    private final HashMap zza = new HashMap();
    @o0OO00OO
    private Handler zzb;
    @o0OO00OO
    private zzgi zzc;

    public final void zzA(final Object obj, zzsu zzsuVar) {
        zzdl.zzd(!this.zza.containsKey(obj));
        zzst zzstVar = new zzst() { // from class: com.google.android.gms.internal.ads.zzry
            @Override // com.google.android.gms.internal.ads.zzst
            public final void zza(zzsu zzsuVar2, zzcn zzcnVar) {
                zzsb.this.zzz(obj, zzsuVar2, zzcnVar);
            }
        };
        zzrz zzrzVar = new zzrz(this, obj);
        this.zza.put(obj, new zzsa(zzsuVar, zzstVar, zzrzVar));
        Handler handler = this.zzb;
        handler.getClass();
        zzsuVar.zzh(handler, zzrzVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zzsuVar.zzg(handler2, zzrzVar);
        zzsuVar.zzm(zzstVar, this.zzc, zzb());
        if (zzt()) {
            return;
        }
        zzsuVar.zzi(zzstVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    @o0O00O0
    public final void zzj() {
        for (zzsa zzsaVar : this.zza.values()) {
            zzsaVar.zza.zzi(zzsaVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    @o0O00O0
    public final void zzl() {
        for (zzsa zzsaVar : this.zza.values()) {
            zzsaVar.zza.zzk(zzsaVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    @o0O00O0
    public void zzn(@o0OO00OO zzgi zzgiVar) {
        this.zzc = zzgiVar;
        this.zzb = zzew.zzD(null);
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    @o0O00O0
    public void zzq() {
        for (zzsa zzsaVar : this.zza.values()) {
            zzsaVar.zza.zzp(zzsaVar.zzb);
            zzsaVar.zza.zzs(zzsaVar.zzc);
            zzsaVar.zza.zzr(zzsaVar.zzc);
        }
        this.zza.clear();
    }

    public int zzv(Object obj, int i) {
        return 0;
    }

    public long zzw(Object obj, long j) {
        return j;
    }

    @o0OO00OO
    public zzss zzx(Object obj, zzss zzssVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzsu
    @o0O00O0
    public void zzy() throws IOException {
        for (zzsa zzsaVar : this.zza.values()) {
            zzsaVar.zza.zzy();
        }
    }

    public abstract void zzz(Object obj, zzsu zzsuVar, zzcn zzcnVar);
}
