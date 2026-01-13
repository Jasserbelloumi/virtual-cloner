package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;
/* loaded from: classes2.dex */
final class zzbrv extends zzbrq {
    public final /* synthetic */ UpdateClickUrlCallback zza;

    public zzbrv(zzbrz zzbrzVar, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza = updateClickUrlCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbrr
    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbrr
    public final void zzf(List list) {
        this.zza.onSuccess((Uri) list.get(0));
    }
}
