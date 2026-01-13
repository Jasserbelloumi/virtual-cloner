package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
/* loaded from: classes2.dex */
final class zzavx extends PushbackInputStream {
    public final /* synthetic */ zzavy zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzavx(zzavy zzavyVar, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.zza = zzavyVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        zzawa.zze(this.zza.zzc);
        super.close();
    }
}
