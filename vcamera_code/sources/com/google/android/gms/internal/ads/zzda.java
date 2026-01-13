package com.google.android.gms.internal.ads;

import o00oOooO.o0O0OO0;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzda {
    @o0O0o00O(from = 0)
    public final int zzc;
    @o0O0o00O(from = 0)
    public final int zzd;
    @o0O0o00O(from = 0, to = 359)
    public final int zze;
    @o0O0OO0(from = 0.0d, fromInclusive = false)
    public final float zzf;
    public static final zzda zza = new zzda(0, 0, 0, 1.0f);
    private static final String zzg = zzew.zzP(0);
    private static final String zzh = zzew.zzP(1);
    private static final String zzi = zzew.zzP(2);
    private static final String zzj = zzew.zzP(3);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzcz
    };

    public zzda(@o0O0o00O(from = 0) int i, @o0O0o00O(from = 0) int i2, @o0O0o00O(from = 0, to = 359) int i3, @o0O0OO0(from = 0.0d, fromInclusive = false) float f) {
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = f;
    }

    public final boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzda) {
            zzda zzdaVar = (zzda) obj;
            if (this.zzc == zzdaVar.zzc && this.zzd == zzdaVar.zzd && this.zze == zzdaVar.zze && this.zzf == zzdaVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zzc + 217) * 31) + this.zzd) * 31) + this.zze) * 31) + Float.floatToRawIntBits(this.zzf);
    }
}
