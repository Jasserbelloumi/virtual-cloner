package com.google.android.gms.internal.ads;

import android.content.Context;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzcmm implements zzcvj {
    private final zzezs zza;

    public zzcmm(zzezs zzezsVar) {
        this.zza = zzezsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final void zzbn(@o0OO00OO Context context) {
        try {
            this.zza.zzg();
        } catch (zzezc e) {
            zzbza.zzk("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final void zzbp(@o0OO00OO Context context) {
        try {
            this.zza.zzt();
        } catch (zzezc e) {
            zzbza.zzk("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final void zzbq(@o0OO00OO Context context) {
        try {
            this.zza.zzu();
            if (context != null) {
                this.zza.zzs(context);
            }
        } catch (zzezc e) {
            zzbza.zzk("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
