package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
/* loaded from: classes2.dex */
public final class zzys {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, OpusUtil.SAMPLE_RATE, 44100, 32000, 24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzyr zza(byte[] bArr) throws zzbu {
        return zzb(new zzem(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
        if (r11 != 3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzyr zzb(com.google.android.gms.internal.ads.zzem r11, boolean r12) throws com.google.android.gms.internal.ads.zzbu {
        /*
            int r0 = zzc(r11)
            int r1 = zzd(r11)
            r2 = 4
            int r3 = r11.zzd(r2)
            java.lang.String r4 = "mp4a.40."
            java.lang.String r4 = android.support.v4.media.o00oOOo0.o00oOOo0(r4, r0)
            r5 = 22
            r6 = 5
            if (r0 == r6) goto L1c
            r6 = 29
            if (r0 != r6) goto L2a
        L1c:
            int r1 = zzd(r11)
            int r0 = zzc(r11)
            if (r0 != r5) goto L2a
            int r3 = r11.zzd(r2)
        L2a:
            if (r12 == 0) goto Lc9
            r12 = 17
            r6 = 6
            r7 = 1
            r8 = 2
            r9 = 3
            if (r0 == r7) goto L5a
            if (r0 == r8) goto L5a
            if (r0 == r9) goto L5a
            if (r0 == r2) goto L5a
            if (r0 == r6) goto L5a
            r2 = 7
            if (r0 == r2) goto L5a
            if (r0 == r12) goto L5a
            switch(r0) {
                case 19: goto L5a;
                case 20: goto L5a;
                case 21: goto L5a;
                case 22: goto L5a;
                case 23: goto L5a;
                default: goto L44;
            }
        L44:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Unsupported audio object type: "
            r11.append(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.google.android.gms.internal.ads.zzbu r11 = com.google.android.gms.internal.ads.zzbu.zzc(r11)
            throw r11
        L5a:
            boolean r2 = r11.zzn()
            if (r2 == 0) goto L67
            java.lang.String r2 = "AacUtil"
            java.lang.String r10 = "Unexpected frameLengthFlag = 1"
            com.google.android.gms.internal.ads.zzee.zze(r2, r10)
        L67:
            boolean r2 = r11.zzn()
            if (r2 == 0) goto L72
            r2 = 14
            r11.zzl(r2)
        L72:
            boolean r2 = r11.zzn()
            if (r3 == 0) goto Lc3
            r10 = 20
            if (r0 == r6) goto L7f
            if (r0 != r10) goto L82
            r0 = r10
        L7f:
            r11.zzl(r9)
        L82:
            if (r2 == 0) goto L9f
            if (r0 != r5) goto L8c
            r2 = 16
            r11.zzl(r2)
            goto L8d
        L8c:
            r5 = r0
        L8d:
            if (r5 == r12) goto L99
            r12 = 19
            if (r5 == r12) goto L99
            if (r5 == r10) goto L99
            r12 = 23
            if (r5 != r12) goto L9c
        L99:
            r11.zzl(r9)
        L9c:
            r11.zzl(r7)
        L9f:
            switch(r0) {
                case 17: goto La3;
                case 18: goto La2;
                case 19: goto La3;
                case 20: goto La3;
                case 21: goto La3;
                case 22: goto La3;
                case 23: goto La3;
                default: goto La2;
            }
        La2:
            goto Lc9
        La3:
            int r11 = r11.zzd(r8)
            if (r11 == r8) goto Lac
            if (r11 == r9) goto Lad
            goto Lc9
        Lac:
            r9 = r11
        Lad:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Unsupported epConfig: "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.google.android.gms.internal.ads.zzbu r11 = com.google.android.gms.internal.ads.zzbu.zzc(r11)
            throw r11
        Lc3:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            r11.<init>()
            throw r11
        Lc9:
            int[] r11 = com.google.android.gms.internal.ads.zzys.zzc
            r11 = r11[r3]
            r12 = -1
            r0 = 0
            if (r11 == r12) goto Ld7
            com.google.android.gms.internal.ads.zzyr r12 = new com.google.android.gms.internal.ads.zzyr
            r12.<init>(r1, r11, r4, r0)
            return r12
        Ld7:
            com.google.android.gms.internal.ads.zzbu r11 = com.google.android.gms.internal.ads.zzbu.zza(r0, r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzys.zzb(com.google.android.gms.internal.ads.zzem, boolean):com.google.android.gms.internal.ads.zzyr");
    }

    private static int zzc(zzem zzemVar) {
        int zzd = zzemVar.zzd(5);
        return zzd == 31 ? zzemVar.zzd(6) + 32 : zzd;
    }

    private static int zzd(zzem zzemVar) throws zzbu {
        int zzd = zzemVar.zzd(4);
        if (zzd == 15) {
            if (zzemVar.zza() >= 24) {
                return zzemVar.zzd(24);
            }
            throw zzbu.zza("AAC header insufficient data", null);
        } else if (zzd < 13) {
            return zzb[zzd];
        } else {
            throw zzbu.zza("AAC header wrong Sampling Frequency Index", null);
        }
    }
}
