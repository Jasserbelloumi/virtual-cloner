package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* loaded from: classes2.dex */
public final class zzxl {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzxh
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzxk) obj).zza - ((zzxk) obj2).zza;
        }
    };
    private static final Comparator zzb = new Comparator() { // from class: com.google.android.gms.internal.ads.zzxi
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzxk) obj).zzc, ((zzxk) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzxk[] zzd = new zzxk[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzxl(int i) {
    }

    public final float zza(float f) {
        ArrayList arrayList;
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f2 = this.zzg;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.size(); i2++) {
            zzxk zzxkVar = (zzxk) this.zzc.get(i2);
            i += zzxkVar.zzb;
            if (i >= 0.5f * f2) {
                return zzxkVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        return ((zzxk) this.zzc.get(arrayList.size() - 1)).zzc;
    }

    public final void zzb(int i, float f) {
        zzxk zzxkVar;
        int i2;
        zzxk zzxkVar2;
        int i3;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i4 = this.zzh;
        if (i4 > 0) {
            zzxk[] zzxkVarArr = this.zzd;
            int i5 = i4 - 1;
            this.zzh = i5;
            zzxkVar = zzxkVarArr[i5];
        } else {
            zzxkVar = new zzxk(null);
        }
        int i6 = this.zzf;
        this.zzf = i6 + 1;
        zzxkVar.zza = i6;
        zzxkVar.zzb = i;
        zzxkVar.zzc = f;
        this.zzc.add(zzxkVar);
        int i7 = this.zzg + i;
        while (true) {
            this.zzg = i7;
            while (true) {
                int i8 = this.zzg;
                if (i8 <= 2000) {
                    return;
                }
                i2 = i8 - 2000;
                zzxkVar2 = (zzxk) this.zzc.get(0);
                i3 = zzxkVar2.zzb;
                if (i3 <= i2) {
                    this.zzg -= i3;
                    this.zzc.remove(0);
                    int i9 = this.zzh;
                    if (i9 < 5) {
                        zzxk[] zzxkVarArr2 = this.zzd;
                        this.zzh = i9 + 1;
                        zzxkVarArr2[i9] = zzxkVar2;
                    }
                }
            }
            zzxkVar2.zzb = i3 - i2;
            i7 = this.zzg - i2;
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
