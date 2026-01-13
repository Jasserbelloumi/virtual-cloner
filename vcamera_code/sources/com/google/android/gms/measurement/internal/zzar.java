package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.support.v4.media.o00oOOoO;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import o0ooOoOO.oO0OoOO0;
/* loaded from: classes2.dex */
public final class zzar {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final long zzd;
    public final long zze;
    public final zzau zzf;

    public zzar(zzfr zzfrVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzau zzauVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j;
        this.zze = j2;
        if (j2 != 0 && j2 > j) {
            zzfrVar.zzay().zzk().zzb("Event created with reverse previous/current timestamps. appId", zzeh.zzn(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzauVar = new zzau(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzfrVar.zzay().zzd().zza("Param name can't be null");
                } else {
                    Object zzA = zzfrVar.zzv().zzA(next, bundle2.get(next));
                    if (zzA == null) {
                        zzfrVar.zzay().zzk().zzb("Param value can't be null", zzfrVar.zzj().zze(next));
                    } else {
                        zzfrVar.zzv().zzO(bundle2, next, zzA);
                    }
                }
                it.remove();
            }
            zzauVar = new zzau(bundle2);
        }
        this.zzf = zzauVar;
    }

    private zzar(zzfr zzfrVar, String str, String str2, String str3, long j, long j2, zzau zzauVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzauVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j;
        this.zze = j2;
        if (j2 != 0 && j2 > j) {
            zzfrVar.zzay().zzk().zzc("Event created with reverse previous/current timestamps. appId, name", zzeh.zzn(str2), zzeh.zzn(str3));
        }
        this.zzf = zzauVar;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return o00oOOoO.o00oOOo0(oO0OoOO0.o00oOOo0("Event{appId='", str, "', name='", str2, "', params="), this.zzf.toString(), "}");
    }

    public final zzar zza(zzfr zzfrVar, long j) {
        return new zzar(zzfrVar, this.zzc, this.zza, this.zzb, this.zzd, j, this.zzf);
    }
}
