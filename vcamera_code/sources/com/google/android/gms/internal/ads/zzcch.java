package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzcch extends zzalx {
    public static final zzcch zzb = new zzcch();

    @Override // com.google.android.gms.internal.ads.zzalx
    public final zzamb zza(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new zzamd() : "mvhd".equals(str) ? new zzame() : new zzamf(str);
    }
}
