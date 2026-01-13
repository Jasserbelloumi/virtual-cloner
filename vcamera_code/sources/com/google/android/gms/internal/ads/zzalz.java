package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzalz extends zzgwj implements Closeable {
    private static final zzgwq zza = zzgwq.zzb(zzalz.class);

    public zzalz(zzgwk zzgwkVar, zzaly zzalyVar) throws IOException {
        zzf(zzgwkVar, zzgwkVar.zzc(), zzalyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final String toString() {
        String obj = this.zzd.toString();
        return o00oOOoO.o00oOOo0(o00oOOo0.o00oOOo0(obj, 7), "model(", obj, ")");
    }
}
