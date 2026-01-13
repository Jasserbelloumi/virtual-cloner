package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzgpy {
    public static final zzgpy zza = new zzgpy(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc;
    private static volatile zzgpy zzd;
    private final Map zze;

    public zzgpy() {
        this.zze = new HashMap();
    }

    public zzgpy(boolean z) {
        this.zze = Collections.emptyMap();
    }

    public static zzgpy zza() {
        return zza;
    }

    public static zzgpy zzb() {
        zzgpy zzgpyVar = zzd;
        if (zzgpyVar != null) {
            return zzgpyVar;
        }
        synchronized (zzgpy.class) {
            zzgpy zzgpyVar2 = zzd;
            if (zzgpyVar2 != null) {
                return zzgpyVar2;
            }
            zzgpy zzb2 = zzgqg.zzb(zzgpy.class);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final zzgqk zzc(zzgrw zzgrwVar, int i) {
        return (zzgqk) this.zze.get(new zzgpx(zzgrwVar, i));
    }
}
