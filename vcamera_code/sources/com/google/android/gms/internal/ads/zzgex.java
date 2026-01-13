package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* loaded from: classes2.dex */
public final class zzgex extends zzggc {
    private final int zza;
    private final int zzb;
    private final zzgev zzc;

    public /* synthetic */ zzgex(int i, int i2, zzgev zzgevVar, zzgew zzgewVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzgevVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgex) {
            zzgex zzgexVar = (zzgex) obj;
            return zzgexVar.zza == this.zza && zzgexVar.zzb() == zzb() && zzgexVar.zzc == this.zzc;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        int i = this.zzb;
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder();
        sb.append("AES-CMAC Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte tags, and ");
        return android.support.v4.media.o00oOo00.o00oOOo0(sb, i2, "-byte key)");
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        zzgev zzgevVar = this.zzc;
        if (zzgevVar == zzgev.zzd) {
            return this.zzb;
        }
        if (zzgevVar == zzgev.zza || zzgevVar == zzgev.zzb || zzgevVar == zzgev.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgev zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzc != zzgev.zzd;
    }
}
