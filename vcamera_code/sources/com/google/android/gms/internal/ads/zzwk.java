package com.google.android.gms.internal.ads;

import o00oOooO.o0O00O0;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public abstract class zzwk {
    @o0OO00OO
    private zzwj zza;
    @o0OO00OO
    private zzws zzb;

    @o0O00O0
    public void zzh() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzi(zzk zzkVar) {
        throw null;
    }

    public boolean zzl() {
        throw null;
    }

    public abstract zzwl zzn(zzko[] zzkoVarArr, zzur zzurVar, zzss zzssVar, zzcn zzcnVar) throws zzhj;

    public abstract void zzo(@o0OO00OO Object obj);

    public final zzws zzp() {
        zzws zzwsVar = this.zzb;
        zzdl.zzb(zzwsVar);
        return zzwsVar;
    }

    @o0O00O0
    public final void zzq(zzwj zzwjVar, zzws zzwsVar) {
        this.zza = zzwjVar;
        this.zzb = zzwsVar;
    }

    public final void zzr() {
        zzwj zzwjVar = this.zza;
        if (zzwjVar != null) {
            zzwjVar.zzj();
        }
    }
}
