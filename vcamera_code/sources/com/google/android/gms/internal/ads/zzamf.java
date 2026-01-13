package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* loaded from: classes2.dex */
public final class zzamf extends zzgwf {
    public ByteBuffer zza;

    public zzamf(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzgwf
    public final void zzf(ByteBuffer byteBuffer) {
        this.zza = byteBuffer;
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }
}
