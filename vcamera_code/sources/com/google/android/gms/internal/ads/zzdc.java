package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.o00oo0O0;
import java.util.Arrays;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzdc {
    public static final zzdc zza = new zzdc(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzdc(int i, int i2, int i3) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = zzew.zzW(i3) ? zzew.zzo(i3, i2) : -1;
    }

    public final boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdc) {
            zzdc zzdcVar = (zzdc) obj;
            return this.zzb == zzdcVar.zzb && this.zzc == zzdcVar.zzc && this.zzd == zzdcVar.zzd;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        int i = this.zzb;
        int i2 = this.zzc;
        return android.support.v4.media.o00oOo00.o00oOOo0(o00oo0O0.o00oOOo0("AudioFormat[sampleRate=", i, ", channelCount=", i2, ", encoding="), this.zzd, "]");
    }
}
