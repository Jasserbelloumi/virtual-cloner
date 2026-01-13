package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
/* loaded from: classes2.dex */
public class zzgwg extends zzgwj implements zzamb {
    public zzamc zza;
    public final String zzb = "moov";

    public zzgwg(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzamb
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzamb
    public final void zzb(zzgwk zzgwkVar, ByteBuffer byteBuffer, long j, zzaly zzalyVar) throws IOException {
        zzgwkVar.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzd = zzgwkVar;
        this.zzf = zzgwkVar.zzb();
        zzgwkVar.zze(zzgwkVar.zzb() + j);
        this.zzg = zzgwkVar.zzb();
        this.zzc = zzalyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamb
    public final void zzc(zzamc zzamcVar) {
        this.zza = zzamcVar;
    }
}
