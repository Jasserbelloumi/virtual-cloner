package com.google.android.gms.internal.ads;

import android.content.Context;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzdmv implements zzcvj {
    @o0OO00OO
    private final zzcei zza;

    public zzdmv(@o0OO00OO zzcei zzceiVar) {
        this.zza = zzceiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final void zzbn(@o0OO00OO Context context) {
        zzcei zzceiVar = this.zza;
        if (zzceiVar != null) {
            zzceiVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final void zzbp(@o0OO00OO Context context) {
        zzcei zzceiVar = this.zza;
        if (zzceiVar != null) {
            zzceiVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvj
    public final void zzbq(@o0OO00OO Context context) {
        zzcei zzceiVar = this.zza;
        if (zzceiVar != null) {
            zzceiVar.onResume();
        }
    }
}
