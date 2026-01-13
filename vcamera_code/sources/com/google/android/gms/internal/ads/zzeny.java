package com.google.android.gms.internal.ads;

import android.os.Bundle;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzeny implements zzepm {
    @o0OO00OO
    private final Bundle zza;

    public zzeny(@o0OO00OO Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzepm
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.zza;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}
