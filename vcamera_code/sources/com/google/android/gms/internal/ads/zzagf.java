package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.mp4.Sniffer;
import java.io.IOException;
/* loaded from: classes2.dex */
final class zzagf {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Atom.TYPE_avc1, Atom.TYPE_hvc1, Atom.TYPE_hev1, Atom.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, Sniffer.BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean zza(zzzv zzzvVar) throws IOException {
        return zzc(zzzvVar, true, false);
    }

    public static boolean zzb(zzzv zzzvVar, boolean z) throws IOException {
        return zzc(zzzvVar, false, false);
    }

    private static boolean zzc(zzzv zzzvVar, boolean z, boolean z2) throws IOException {
        boolean z3;
        long zzd = zzzvVar.zzd();
        long j = -1;
        int i = (zzd > (-1L) ? 1 : (zzd == (-1L) ? 0 : -1));
        long j2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (i != 0 && zzd <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j2 = zzd;
        }
        zzen zzenVar = new zzen(64);
        int i2 = (int) j2;
        boolean z4 = false;
        int i3 = 0;
        boolean z5 = false;
        while (i3 < i2) {
            zzenVar.zzC(8);
            if (!zzzvVar.zzm(zzenVar.zzH(), z4 ? 1 : 0, 8, true)) {
                z3 = z4 ? 1 : 0;
                break;
            }
            long zzs = zzenVar.zzs();
            int zze = zzenVar.zze();
            int i4 = 16;
            if (zzs == 1) {
                zzzvVar.zzh(zzenVar.zzH(), 8, 8);
                zzenVar.zzE(16);
                zzs = zzenVar.zzr();
            } else {
                if (zzs == 0) {
                    long zzd2 = zzzvVar.zzd();
                    if (zzd2 != j) {
                        zzs = (zzd2 - zzzvVar.zze()) + 8;
                    }
                }
                i4 = 8;
            }
            long j3 = i4;
            if (zzs < j3) {
                return z4;
            }
            i3 += i4;
            if (zze == 1836019574) {
                i2 += (int) zzs;
                if (i != 0 && i2 > zzd) {
                    i2 = (int) zzd;
                }
                j = -1;
            } else if (zze == 1836019558 || zze == 1836475768) {
                z3 = true;
                break;
            } else {
                zzen zzenVar2 = zzenVar;
                long j4 = zzs;
                if ((i3 + zzs) - j3 >= i2) {
                    break;
                }
                int i5 = (int) (j4 - j3);
                i3 += i5;
                if (zze == 1718909296) {
                    if (i5 < 8) {
                        return false;
                    }
                    zzenVar2.zzC(i5);
                    zzzvVar.zzh(zzenVar2.zzH(), 0, i5);
                    int i6 = i5 >> 2;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (i7 != 1) {
                            int zze2 = zzenVar2.zze();
                            if ((zze2 >>> 8) != 3368816) {
                                if (zze2 == 1751476579) {
                                    zze2 = 1751476579;
                                }
                                int[] iArr = zza;
                                for (int i8 = 0; i8 < 29; i8++) {
                                    if (iArr[i8] != zze2) {
                                    }
                                }
                                continue;
                            }
                            z5 = true;
                            break;
                        }
                        zzenVar2.zzG(4);
                    }
                    if (!z5) {
                        return false;
                    }
                } else if (i5 != 0) {
                    zzzvVar.zzg(i5);
                }
                zzenVar = zzenVar2;
                j = -1;
                z4 = false;
            }
        }
        z3 = false;
        return z5 && z == z3;
    }
}
