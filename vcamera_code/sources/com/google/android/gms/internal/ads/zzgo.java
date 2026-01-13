package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzgo {
    @o0OO00OO
    public byte[] zza;
    @o0OO00OO
    public byte[] zzb;
    public int zzc;
    @o0OO00OO
    public int[] zzd;
    @o0OO00OO
    public int[] zze;
    public int zzf;
    public int zzg;
    public int zzh;
    private final MediaCodec.CryptoInfo zzi;
    @o0OO00OO
    private final zzgn zzj;

    public zzgo() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.zzi = cryptoInfo;
        this.zzj = zzew.zza >= 24 ? new zzgn(cryptoInfo, null) : null;
    }

    public final MediaCodec.CryptoInfo zza() {
        return this.zzi;
    }

    public final void zzb(int i) {
        if (i == 0) {
            return;
        }
        if (this.zzd == null) {
            int[] iArr = new int[1];
            this.zzd = iArr;
            this.zzi.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.zzd;
        iArr2[0] = iArr2[0] + i;
    }

    public final void zzc(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.zzf = i;
        this.zzd = iArr;
        this.zze = iArr2;
        this.zzb = bArr;
        this.zza = bArr2;
        this.zzc = i2;
        this.zzg = i3;
        this.zzh = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.zzi;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (zzew.zza >= 24) {
            zzgn zzgnVar = this.zzj;
            zzgnVar.getClass();
            zzgn.zza(zzgnVar, i3, i4);
        }
    }
}
