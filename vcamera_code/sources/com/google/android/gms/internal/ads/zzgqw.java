package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* loaded from: classes2.dex */
public final class zzgqw {
    public static final Charset zza = Charset.forName(C.ASCII_NAME);
    public static final Charset zzb = Charset.forName(C.UTF8_NAME);
    public static final Charset zzc = Charset.forName(C.ISO88591_NAME);
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzgpm zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        int i = zzgpm.zzd;
        zzf = zzgpm.zzI(bArr, 0, 0, false);
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        int zzd2 = zzd(length, bArr, 0, length);
        if (zzd2 == 0) {
            return 1;
        }
        return zzd2;
    }

    public static int zzc(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int zzd(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static Object zze(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object zzf(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static String zzg(byte[] bArr) {
        return new String(bArr, zzb);
    }

    public static boolean zzh(byte[] bArr) {
        return zzgtv.zzi(bArr);
    }
}
