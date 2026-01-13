package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzaa {
    private final SparseBooleanArray zza;

    public final boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaa) {
            zzaa zzaaVar = (zzaa) obj;
            if (zzew.zza < 24) {
                if (this.zza.size() == zzaaVar.zza.size()) {
                    for (int i = 0; i < this.zza.size(); i++) {
                        if (zza(i) != zzaaVar.zza(i)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return this.zza.equals(zzaaVar.zza);
        }
        return false;
    }

    public final int hashCode() {
        if (zzew.zza < 24) {
            int size = this.zza.size();
            for (int i = 0; i < this.zza.size(); i++) {
                size = (size * 31) + zza(i);
            }
            return size;
        }
        return this.zza.hashCode();
    }

    public final int zza(int i) {
        zzdl.zza(i, 0, this.zza.size());
        return this.zza.keyAt(i);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final boolean zzc(int i) {
        return this.zza.get(i);
    }
}
