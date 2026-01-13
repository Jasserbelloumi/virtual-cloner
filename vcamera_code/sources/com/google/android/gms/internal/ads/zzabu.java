package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.avi.AviExtractor;
/* loaded from: classes2.dex */
final class zzabu implements zzabk {
    public final String zza;

    private zzabu(String str) {
        this.zza = str;
    }

    public static zzabu zzb(zzen zzenVar) {
        return new zzabu(zzenVar.zzx(zzenVar.zza(), zzfnh.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final int zza() {
        return AviExtractor.FOURCC_strn;
    }
}
