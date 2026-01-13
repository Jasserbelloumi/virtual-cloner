package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
/* loaded from: classes2.dex */
public final class zzado {
    public static final zzadm zza = new zzadm() { // from class: com.google.android.gms.internal.ads.zzadl
    };

    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    @o00oOooO.o0OO00OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.android.gms.internal.ads.zzbq zza(byte[] r11, int r12, com.google.android.gms.internal.ads.zzadm r13, com.google.android.gms.internal.ads.zzacp r14) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzado.zza(byte[], int, com.google.android.gms.internal.ads.zzadm, com.google.android.gms.internal.ads.zzacp):com.google.android.gms.internal.ads.zzbq");
    }

    private static int zzb(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i, int i2) {
        int zzd = zzd(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return zzd;
        }
        while (true) {
            int length = bArr.length;
            if (zzd >= length - 1) {
                return length;
            }
            if ((zzd - i) % 2 == 0 && bArr[zzd + 1] == 0) {
                return zzd;
            }
            zzd = zzd(bArr, zzd + 1);
        }
    }

    private static int zzd(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int zze(zzen zzenVar, int i) {
        byte[] zzH = zzenVar.zzH();
        int zzc = zzenVar.zzc();
        int i2 = zzc;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= zzc + i) {
                return i;
            }
            if ((zzH[i2] & 255) == 255 && zzH[i3] == 0) {
                System.arraycopy(zzH, i2 + 2, zzH, i3, (i - (i2 - zzc)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0265, code lost:
        if (r9 == 67) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04ec A[Catch: all -> 0x0511, TRY_LEAVE, TryCatch #0 {all -> 0x0511, blocks: (B:224:0x04ec, B:125:0x0211, B:141:0x0267, B:143:0x0279, B:150:0x02ba, B:147:0x029b, B:149:0x02b4, B:162:0x02fc, B:171:0x0343, B:174:0x0378, B:177:0x0389, B:178:0x0391, B:180:0x0397, B:182:0x039e, B:183:0x03a2, B:190:0x03c4, B:194:0x03f1, B:196:0x03fb, B:197:0x042e, B:198:0x043a, B:200:0x0440, B:202:0x0447, B:203:0x044b, B:207:0x0460, B:216:0x048b, B:218:0x04b5, B:219:0x04c4, B:222:0x04db), top: B:236:0x00ed }] */
    @o00oOooO.o0OO00OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzadp zzf(int r35, com.google.android.gms.internal.ads.zzen r36, boolean r37, int r38, @o00oOooO.o0OO00OO com.google.android.gms.internal.ads.zzadm r39) {
        /*
            Method dump skipped, instructions count: 1327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzado.zzf(int, com.google.android.gms.internal.ads.zzen, boolean, int, com.google.android.gms.internal.ads.zzadm):com.google.android.gms.internal.ads.zzadp");
    }

    private static zzfqk zzg(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return zzfqk.zzp("");
        }
        zzfqh zzi = zzfqk.zzi();
        while (true) {
            int zzc = zzc(bArr, i2, i);
            if (i2 >= zzc) {
                break;
            }
            zzi.zzf(new String(bArr, i2, zzc - i2, zzj(i)));
            i2 = zzb(i) + zzc;
        }
        zzfqk zzi2 = zzi.zzi();
        return zzi2.isEmpty() ? zzfqk.zzp("") : zzi2;
    }

    private static String zzh(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    private static String zzi(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static Charset zzj(int i) {
        return i != 1 ? i != 2 ? i != 3 ? zzfnh.zzb : zzfnh.zzc : zzfnh.zzd : zzfnh.zzf;
    }

    private static boolean zzk(zzen zzenVar, int i, int i2, boolean z) {
        int zzm;
        long zzm2;
        int i3;
        int i4;
        int zzc = zzenVar.zzc();
        while (true) {
            try {
                if (zzenVar.zza() < i2) {
                    return true;
                }
                if (i >= 3) {
                    zzm = zzenVar.zze();
                    zzm2 = zzenVar.zzs();
                    i3 = zzenVar.zzo();
                } else {
                    zzm = zzenVar.zzm();
                    zzm2 = zzenVar.zzm();
                    i3 = 0;
                }
                if (zzm == 0 && zzm2 == 0 && i3 == 0) {
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & zzm2) != 0) {
                        return false;
                    }
                    zzm2 = ((zzm2 >> 24) << 21) | (((zzm2 >> 16) & 255) << 14) | (zzm2 & 255) | (((zzm2 >> 8) & 255) << 7);
                }
                if (i == 4) {
                    r4 = i3 & 1;
                    i4 = (i3 & 64) == 0 ? 0 : 1;
                } else if (i == 3) {
                    i4 = (i3 & 32) != 0 ? 1 : 0;
                    if ((i3 & 128) == 0) {
                        r4 = 0;
                    }
                } else {
                    i4 = 0;
                    r4 = 0;
                }
                if (r4 != 0) {
                    i4 += 4;
                }
                if (zzm2 < i4) {
                    return false;
                }
                if (zzenVar.zza() < zzm2) {
                    return false;
                }
                zzenVar.zzG((int) zzm2);
            } finally {
                zzenVar.zzF(zzc);
            }
        }
    }

    private static byte[] zzl(byte[] bArr, int i, int i2) {
        return i2 <= i ? zzew.zzf : Arrays.copyOfRange(bArr, i, i2);
    }
}
