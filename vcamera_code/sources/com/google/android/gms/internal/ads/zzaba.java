package com.google.android.gms.internal.ads;

import java.util.Arrays;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzaba {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzaba(int i, byte[] bArr, int i2, int i3) {
        this.zza = i;
        this.zzb = bArr;
        this.zzc = i2;
        this.zzd = i3;
    }

    public final boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaba.class == obj.getClass()) {
            zzaba zzabaVar = (zzaba) obj;
            if (this.zza == zzabaVar.zza && this.zzc == zzabaVar.zzc && this.zzd == zzabaVar.zzd && Arrays.equals(this.zzb, zzabaVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.zzb) + (this.zza * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
