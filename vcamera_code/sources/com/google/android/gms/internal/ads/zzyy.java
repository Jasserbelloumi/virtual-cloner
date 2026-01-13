package com.google.android.gms.internal.ads;

import com.google.common.primitives.SignedBytes;
import org.videolan.libvlc.media.MediaPlayer;
/* loaded from: classes2.dex */
public final class zzyy {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, MediaPlayer.MEDIA_INFO_BAD_INTERLEAVING, MediaPlayer.MEDIA_INFO_BAD_INTERLEAVING, 480, 400, 400, 2048};

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
        if (r11 != 11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0096, code lost:
        if (r11 != 11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009b, code lost:
        if (r11 != 8) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzyx zza(com.google.android.gms.internal.ads.zzem r11) {
        /*
            r0 = 16
            int r1 = r11.zzd(r0)
            int r0 = r11.zzd(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L18
            r0 = 24
            int r0 = r11.zzd(r0)
            r3 = 7
            goto L19
        L18:
            r3 = r2
        L19:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L21
            int r0 = r0 + 2
        L21:
            r7 = r0
            r0 = 2
            int r1 = r11.zzd(r0)
            r3 = 0
            r4 = 3
            if (r1 != r4) goto L3f
            r1 = r3
        L2c:
            int r5 = r11.zzd(r0)
            int r5 = r5 + r1
            boolean r1 = r11.zzn()
            if (r1 != 0) goto L3a
            int r5 = r5 + r4
            r1 = r5
            goto L3f
        L3a:
            int r5 = r5 + 1
            int r1 = r5 << 2
            goto L2c
        L3f:
            r5 = 10
            int r5 = r11.zzd(r5)
            boolean r6 = r11.zzn()
            if (r6 == 0) goto L54
            int r6 = r11.zzd(r4)
            if (r6 <= 0) goto L54
            r11.zzl(r0)
        L54:
            boolean r6 = r11.zzn()
            r8 = 44100(0xac44, float:6.1797E-41)
            r9 = 48000(0xbb80, float:6.7262E-41)
            r10 = 1
            if (r10 == r6) goto L63
            r6 = r8
            goto L64
        L63:
            r6 = r9
        L64:
            int r11 = r11.zzd(r2)
            if (r6 != r8) goto L74
            r8 = 13
            if (r11 != r8) goto L74
            int[] r11 = com.google.android.gms.internal.ads.zzyy.zzb
            r11 = r11[r8]
            r8 = r11
            goto La0
        L74:
            if (r6 != r9) goto L9f
            r8 = 14
            if (r11 >= r8) goto L9f
            int[] r3 = com.google.android.gms.internal.ads.zzyy.zzb
            r3 = r3[r11]
            int r5 = r5 % 5
            r8 = 8
            if (r5 == r10) goto L99
            r9 = 11
            if (r5 == r0) goto L94
            if (r5 == r4) goto L99
            if (r5 == r2) goto L8d
            goto L9f
        L8d:
            if (r11 == r4) goto L9d
            if (r11 == r8) goto L9d
            if (r11 != r9) goto L9f
            goto L9d
        L94:
            if (r11 == r8) goto L9d
            if (r11 != r9) goto L9f
            goto L9d
        L99:
            if (r11 == r4) goto L9d
            if (r11 != r8) goto L9f
        L9d:
            int r3 = r3 + 1
        L9f:
            r8 = r3
        La0:
            com.google.android.gms.internal.ads.zzyx r11 = new com.google.android.gms.internal.ads.zzyx
            r5 = 2
            r9 = 0
            r3 = r11
            r4 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyy.zza(com.google.android.gms.internal.ads.zzem):com.google.android.gms.internal.ads.zzyx");
    }

    public static void zzb(int i, zzen zzenVar) {
        zzenVar.zzC(7);
        byte[] zzH = zzenVar.zzH();
        zzH[0] = -84;
        zzH[1] = SignedBytes.MAX_POWER_OF_TWO;
        zzH[2] = -1;
        zzH[3] = -1;
        zzH[4] = (byte) ((i >> 16) & 255);
        zzH[5] = (byte) ((i >> 8) & 255);
        zzH[6] = (byte) (i & 255);
    }
}
