package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public final class zzsc implements zzul {
    public final zzul[] zza;

    public zzsc(zzul[] zzulVarArr) {
        this.zza = zzulVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final long zzb() {
        long j = Long.MAX_VALUE;
        for (zzul zzulVar : this.zza) {
            long zzb = zzulVar.zzb();
            if (zzb != Long.MIN_VALUE) {
                j = Math.min(j, zzb);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final long zzc() {
        long j = Long.MAX_VALUE;
        for (zzul zzulVar : this.zza) {
            long zzc = zzulVar.zzc();
            if (zzc != Long.MIN_VALUE) {
                j = Math.min(j, zzc);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzm(long j) {
        for (zzul zzulVar : this.zza) {
            zzulVar.zzm(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final boolean zzo(long j) {
        zzul[] zzulVarArr;
        boolean z;
        boolean z2 = false;
        do {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zzul zzulVar : this.zza) {
                long zzc2 = zzulVar.zzc();
                boolean z3 = zzc2 != Long.MIN_VALUE && zzc2 <= j;
                if (zzc2 == zzc || z3) {
                    z |= zzulVar.zzo(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final boolean zzp() {
        for (zzul zzulVar : this.zza) {
            if (zzulVar.zzp()) {
                return true;
            }
        }
        return false;
    }
}
