package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public final class zzuy extends zzva {
    private final zzws zzd;
    private final zzfqk zze;
    private final zzdm zzf;

    public zzuy(zzcp zzcpVar, int[] iArr, int i, zzws zzwsVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzdm zzdmVar) {
        super(zzcpVar, iArr, 0);
        this.zzd = zzwsVar;
        this.zze = zzfqk.zzm(list);
        this.zzf = zzdmVar;
    }

    public static /* bridge */ /* synthetic */ zzfqk zzf(zzwd[] zzwdVarArr) {
        long j;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            zzwd zzwdVar = zzwdVarArr[i2];
            if (zzwdVar == null || zzwdVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                zzfqh zzi = zzfqk.zzi();
                zzi.zzf(new zzuw(0L, 0L));
                arrayList.add(zzi);
            }
        }
        long[][] jArr = new long[2];
        int i3 = 0;
        while (true) {
            j = -1;
            if (i3 >= 2) {
                break;
            }
            zzwd zzwdVar2 = zzwdVarArr[i3];
            if (zzwdVar2 == null) {
                jArr[i3] = new long[0];
            } else {
                jArr[i3] = new long[zzwdVar2.zzb.length];
                int i4 = 0;
                while (true) {
                    int[] iArr = zzwdVar2.zzb;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    long j2 = zzwdVar2.zza.zzb(iArr[i4]).zzi;
                    long[] jArr2 = jArr[i3];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr2[i4] = j2;
                    i4++;
                }
                Arrays.sort(jArr[i3]);
            }
            i3++;
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i5 = 0; i5 < 2; i5++) {
            long[] jArr4 = jArr[i5];
            jArr3[i5] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        zzg(arrayList, jArr3);
        zzfqv zza = zzfrn.zzc(zzfrs.zzc()).zzb(2).zza();
        int i6 = 0;
        while (i6 < 2) {
            int length = jArr[i6].length;
            if (length > 1) {
                double[] dArr = new double[length];
                int i7 = i;
                while (true) {
                    long[] jArr5 = jArr[i6];
                    double d = 0.0d;
                    if (i7 >= jArr5.length) {
                        break;
                    }
                    long j3 = jArr5[i7];
                    if (j3 != j) {
                        d = Math.log(j3);
                    }
                    dArr[i7] = d;
                    i7++;
                }
                int i8 = length - 1;
                double d2 = dArr[i8] - dArr[i];
                int i9 = i;
                while (i9 < i8) {
                    double d3 = dArr[i9];
                    i9++;
                    zza.zzs(Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i9]) * 0.5d) - dArr[i]) / d2), Integer.valueOf(i6));
                    i = 0;
                }
            }
            i6++;
            i = 0;
            j = -1;
        }
        zzfqk zzm = zzfqk.zzm(zza.zzt());
        for (int i10 = 0; i10 < zzm.size(); i10++) {
            int intValue = ((Integer) zzm.get(i10)).intValue();
            int i11 = iArr2[intValue] + 1;
            iArr2[intValue] = i11;
            jArr3[intValue] = jArr[intValue][i11];
            zzg(arrayList, jArr3);
        }
        for (int i12 = 0; i12 < 2; i12++) {
            if (arrayList.get(i12) != null) {
                long j4 = jArr3[i12];
                jArr3[i12] = j4 + j4;
            }
        }
        zzg(arrayList, jArr3);
        zzfqh zzi2 = zzfqk.zzi();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            zzfqh zzfqhVar = (zzfqh) arrayList.get(i13);
            zzi2.zzf(zzfqhVar == null ? zzfqk.zzo() : zzfqhVar.zzi());
        }
        return zzi2.zzi();
    }

    private static void zzg(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfqh zzfqhVar = (zzfqh) list.get(i2);
            if (zzfqhVar != null) {
                zzfqhVar.zzf(new zzuw(j, jArr[i2]));
            }
        }
    }
}
