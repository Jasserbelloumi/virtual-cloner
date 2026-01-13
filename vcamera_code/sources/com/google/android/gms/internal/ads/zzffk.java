package com.google.android.gms.internal.ads;

import android.view.View;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public abstract class zzffk {
    public static zzffk zza(zzffl zzfflVar, zzffm zzffmVar) {
        if (zzffi.zzb()) {
            return new zzffo(zzfflVar, zzffmVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void zzb(View view, zzffq zzffqVar, @o0OO00OO String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();
}
