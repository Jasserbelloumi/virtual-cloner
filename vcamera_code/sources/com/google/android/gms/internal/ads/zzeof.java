package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* loaded from: classes2.dex */
public final class zzeof implements zzepm {
    private final String zza;
    private final String zzb;

    public zzeof(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzepm
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        ((Bundle) obj).putString("request_id", ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgy)).booleanValue() ? this.zzb : this.zza);
    }
}
