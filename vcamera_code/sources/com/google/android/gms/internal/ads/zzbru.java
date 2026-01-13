package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;
/* loaded from: classes2.dex */
final class zzbru extends zzbrq {
    public final /* synthetic */ UpdateImpressionUrlsCallback zza;

    public zzbru(zzbrz zzbrzVar, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza = updateImpressionUrlsCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbrr
    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbrr
    public final void zzf(List list) {
        this.zza.onSuccess(list);
    }
}
