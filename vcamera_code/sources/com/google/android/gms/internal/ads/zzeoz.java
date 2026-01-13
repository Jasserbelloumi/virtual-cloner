package com.google.android.gms.internal.ads;

import android.os.Bundle;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzeoz implements zzepm {
    @o0OO00OO
    public final String zza;
    @o0OO00OO
    public final String zzb;
    @o0OO00OO
    public final String zzc;
    @o0OO00OO
    public final String zzd;
    @o0OO00OO
    public final Long zze;

    public zzeoz(@o0OO00OO String str, @o0OO00OO String str2, @o0OO00OO String str3, @o0OO00OO String str4, @o0OO00OO Long l) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l;
    }

    @Override // com.google.android.gms.internal.ads.zzepm
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzezi.zzc(bundle, "gmp_app_id", this.zza);
        zzezi.zzc(bundle, "fbs_aiid", this.zzb);
        zzezi.zzc(bundle, "fbs_aeid", this.zzc);
        zzezi.zzc(bundle, "apm_id_origin", this.zzd);
        Long l = this.zze;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
