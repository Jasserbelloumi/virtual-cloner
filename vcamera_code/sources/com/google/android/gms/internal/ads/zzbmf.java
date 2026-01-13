package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbmf {
    @VisibleForTesting
    public static final com.google.android.gms.ads.internal.util.zzbb zza = new zzbmd();
    @VisibleForTesting
    public static final com.google.android.gms.ads.internal.util.zzbb zzb = new zzbme();
    private final zzblr zzc;

    public zzbmf(Context context, zzbzg zzbzgVar, String str, @Nullable zzfep zzfepVar) {
        this.zzc = new zzblr(context, zzbzgVar, str, zza, zzb, zzfepVar);
    }

    public final zzblv zza(String str, zzbly zzblyVar, zzblx zzblxVar) {
        return new zzbmj(this.zzc, str, zzblyVar, zzblxVar);
    }

    public final zzbmo zzb() {
        return new zzbmo(this.zzc);
    }
}
