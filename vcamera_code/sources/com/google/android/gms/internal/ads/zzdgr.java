package com.google.android.gms.internal.ads;

import androidx.collection.o00ooO0;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzdgr {
    public zzbey zza;
    public zzbev zzb;
    public zzbfl zzc;
    public zzbfi zzd;
    public zzbkg zze;
    public final o00ooO0 zzf = new o00ooO0();
    public final o00ooO0 zzg = new o00ooO0();

    public final zzdgr zza(zzbev zzbevVar) {
        this.zzb = zzbevVar;
        return this;
    }

    public final zzdgr zzb(zzbey zzbeyVar) {
        this.zza = zzbeyVar;
        return this;
    }

    public final zzdgr zzc(String str, zzbfe zzbfeVar, @o0OO00OO zzbfb zzbfbVar) {
        this.zzf.put(str, zzbfeVar);
        if (zzbfbVar != null) {
            this.zzg.put(str, zzbfbVar);
        }
        return this;
    }

    public final zzdgr zzd(zzbkg zzbkgVar) {
        this.zze = zzbkgVar;
        return this;
    }

    public final zzdgr zze(zzbfi zzbfiVar) {
        this.zzd = zzbfiVar;
        return this;
    }

    public final zzdgr zzf(zzbfl zzbflVar) {
        this.zzc = zzbflVar;
        return this;
    }

    public final zzdgt zzg() {
        return new zzdgt(this);
    }
}
