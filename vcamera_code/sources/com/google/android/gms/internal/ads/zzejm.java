package com.google.android.gms.internal.ads;

import android.os.Bundle;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzejm implements zzepm {
    @o0OO00OO
    private final String zza;

    public zzejm(@o0OO00OO String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzepm
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.zza;
        if (str != null) {
            bundle.putString("arek", str);
        }
    }
}
