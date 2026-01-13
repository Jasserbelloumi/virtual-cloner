package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public abstract class zzwh extends zzwk {
    @o0OO00OO
    private zzwg zza;

    public abstract Pair zzb(zzwg zzwgVar, int[][][] iArr, int[] iArr2, zzss zzssVar, zzcn zzcnVar) throws zzhj;

    @Override // com.google.android.gms.internal.ads.zzwk
    public final zzwl zzn(zzko[] zzkoVarArr, zzur zzurVar, zzss zzssVar, zzcn zzcnVar) throws zzhj {
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzcp[][] zzcpVarArr = new zzcp[3];
        int[][][] iArr3 = new int[3][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzurVar.zzc;
            zzcpVarArr[i] = new zzcp[i2];
            iArr3[i] = new int[i2];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzkoVarArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < zzurVar.zzc) {
            zzcp zzb = zzurVar.zzb(i5);
            int i6 = zzb.zzd;
            int i7 = i3;
            int i8 = 0;
            int i9 = 0;
            boolean z2 = true;
            while (i8 < i3) {
                zzko zzkoVar = zzkoVarArr[i8];
                int i10 = 0;
                for (int i11 = 0; i11 <= 0; i11++) {
                    i10 = Math.max(i10, zzkoVar.zzO(zzb.zzb(i11)) & 7);
                }
                boolean z3 = iArr2[i8] == 0;
                if (i10 > i9) {
                    z2 = z3;
                    i7 = i8;
                    i9 = i10;
                } else if (i10 == i9 && i6 == 5 && !z2 && z3) {
                    i7 = i8;
                    i9 = i10;
                    z2 = true;
                }
                i8++;
                i3 = 2;
            }
            if (i7 == i3) {
                iArr = new int[1];
            } else {
                zzko zzkoVar2 = zzkoVarArr[i7];
                int[] iArr5 = new int[1];
                for (int i12 = 0; i12 <= 0; i12++) {
                    iArr5[i12] = zzkoVar2.zzO(zzb.zzb(i12));
                }
                iArr = iArr5;
            }
            int i13 = iArr2[i7];
            zzcpVarArr[i7][i13] = zzb;
            iArr3[i7][i13] = iArr;
            iArr2[i7] = i13 + 1;
            i5++;
            i3 = 2;
        }
        zzur[] zzurVarArr = new zzur[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i14 = 0;
        while (i14 < i3) {
            int i15 = iArr2[i14];
            zzurVarArr[i14] = new zzur((zzcp[]) zzew.zzaf(zzcpVarArr[i14], i15));
            iArr3[i14] = (int[][]) zzew.zzaf(iArr3[i14], i15);
            strArr[i14] = zzkoVarArr[i14].zzK();
            iArr6[i14] = zzkoVarArr[i14].zzb();
            i14++;
            i3 = 2;
        }
        int i16 = i3;
        zzwg zzwgVar = new zzwg(strArr, iArr6, zzurVarArr, iArr4, iArr3, new zzur((zzcp[]) zzew.zzaf(zzcpVarArr[i16], iArr2[i16])));
        Pair zzb2 = zzb(zzwgVar, iArr3, iArr4, zzssVar, zzcnVar);
        zzwi[] zzwiVarArr = (zzwi[]) zzb2.second;
        List[] listArr = new List[zzwiVarArr.length];
        for (int i17 = 0; i17 < zzwiVarArr.length; i17++) {
            zzwi zzwiVar = zzwiVarArr[i17];
            listArr[i17] = zzwiVar != null ? zzfqk.zzp(zzwiVar) : zzfqk.zzo();
        }
        zzfqh zzfqhVar = new zzfqh();
        for (int i18 = 0; i18 < 2; i18++) {
            zzur zzd = zzwgVar.zzd(i18);
            List list = listArr[i18];
            for (int i19 = 0; i19 < zzd.zzc; i19++) {
                zzcp zzb3 = zzd.zzb(i19);
                boolean z4 = zzwgVar.zza(i18, i19, false) != 0;
                int i20 = zzb3.zzb;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i21 = 0; i21 <= 0; i21++) {
                    iArr7[i21] = zzwgVar.zzb(i18, i19, i21) & 7;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= list.size()) {
                            z = false;
                            break;
                        }
                        zzwi zzwiVar2 = (zzwi) list.get(i22);
                        if (zzwiVar2.zze().equals(zzb3) && zzwiVar2.zzb(i21) != -1) {
                            z = true;
                            break;
                        }
                        i22++;
                    }
                    zArr[i21] = z;
                }
                zzfqhVar.zzf(new zzcx(zzb3, z4, iArr7, zArr));
            }
        }
        zzur zze = zzwgVar.zze();
        for (int i23 = 0; i23 < zze.zzc; i23++) {
            zzcp zzb4 = zze.zzb(i23);
            int i24 = zzb4.zzb;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            zzfqhVar.zzf(new zzcx(zzb4, false, iArr8, new boolean[1]));
        }
        return new zzwl((zzkp[]) zzb2.first, (zzwe[]) zzb2.second, new zzcy(zzfqhVar.zzi()), zzwgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwk
    public final void zzo(@o0OO00OO Object obj) {
        this.zza = (zzwg) obj;
    }
}
