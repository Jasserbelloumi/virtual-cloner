package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* loaded from: classes2.dex */
public final class zzemm implements zzepm {
    private final boolean zza;

    public zzemm(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzepm
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        ((Bundle) obj).putBoolean("is_gbid", this.zza);
    }
}
