package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzeov implements zzepm {
    @o0OO00OO
    private final String zza;

    public zzeov(@o0OO00OO String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzepm
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.zza)) {
            return;
        }
        bundle.putString("query_info", this.zza);
    }
}
