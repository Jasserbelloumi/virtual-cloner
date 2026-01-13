package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import java.util.Arrays;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OoO00O;
/* loaded from: classes2.dex */
public final class zzcp {
    public final int zzb = 1;
    public final String zzc;
    public final int zzd;
    private final zzaf[] zzg;
    private int zzh;
    private static final String zze = zzew.zzP(0);
    private static final String zzf = zzew.zzP(1);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzco
    };

    public zzcp(String str, zzaf... zzafVarArr) {
        this.zzc = str;
        this.zzg = zzafVarArr;
        int zzb = zzbt.zzb(zzafVarArr[0].zzm);
        this.zzd = zzb == -1 ? zzbt.zzb(zzafVarArr[0].zzl) : zzb;
        zzd(zzafVarArr[0].zzd);
        int i = zzafVarArr[0].zzf;
    }

    private static String zzd(@o0OO00OO String str) {
        return (str == null || str.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str;
    }

    public final boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcp.class == obj.getClass()) {
            zzcp zzcpVar = (zzcp) obj;
            if (this.zzc.equals(zzcpVar.zzc) && Arrays.equals(this.zzg, zzcpVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzh;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.zzg) + ((this.zzc.hashCode() + 527) * 31);
            this.zzh = hashCode;
            return hashCode;
        }
        return i;
    }

    public final int zza(zzaf zzafVar) {
        for (int i = 0; i <= 0; i++) {
            if (zzafVar == this.zzg[i]) {
                return i;
            }
        }
        return -1;
    }

    public final zzaf zzb(int i) {
        return this.zzg[i];
    }

    @o0OoO00O
    public final zzcp zzc(String str) {
        return new zzcp(str, this.zzg);
    }
}
