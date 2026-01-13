package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* loaded from: classes2.dex */
public final class zzemi implements zzepm {
    public final String zza;
    public final boolean zzb;

    public zzemi(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzepm
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.zza);
        if (this.zzb) {
            bundle.putString("de", "1");
        }
    }
}
