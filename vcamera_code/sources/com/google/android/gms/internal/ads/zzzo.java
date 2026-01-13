package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
final class zzzo {
    private final zzzn zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public zzzo(zzzn zzznVar) {
        this.zza = zzznVar;
    }

    @o0OO00OO
    public final zzzu zza(Object... objArr) {
        Constructor zza;
        synchronized (this.zzb) {
            if (!this.zzb.get()) {
                try {
                    zza = this.zza.zza();
                } catch (ClassNotFoundException unused) {
                    this.zzb.set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            zza = null;
        }
        if (zza == null) {
            return null;
        }
        try {
            return (zzzu) zza.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}
