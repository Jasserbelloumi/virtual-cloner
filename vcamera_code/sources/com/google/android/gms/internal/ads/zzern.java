package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class zzern implements zzepn {
    public final zzfuu zza;
    public final Context zzb;
    public final zzavt zzc;

    public zzern(zzavt zzavtVar, zzfuu zzfuuVar, Context context, byte[] bArr) {
        this.zzc = zzavtVar;
        this.zza = zzfuuVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzero(new JSONObject());
            }
        });
    }
}
