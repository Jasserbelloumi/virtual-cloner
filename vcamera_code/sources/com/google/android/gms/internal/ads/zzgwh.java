package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* loaded from: classes2.dex */
public abstract class zzgwh extends zzgwf implements zzamb {
    private int zza;

    public zzgwh(String str) {
        super("mvhd");
    }

    public final int zzh() {
        if (!this.zzc) {
            zzg();
        }
        return this.zza;
    }

    public final long zzi(ByteBuffer byteBuffer) {
        this.zza = zzama.zzc(byteBuffer.get());
        zzama.zzd(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
