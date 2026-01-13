package com.google.android.gms.internal.measurement;

import android.content.Context;
import javax.annotation.Nullable;
import o00ooOO0.o0O000O;
/* loaded from: classes2.dex */
final class zzhc extends zzhz {
    private final Context zza;
    private final zzii zzb;

    public zzhc(Context context, @Nullable zzii zziiVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.zza = context;
        this.zzb = zziiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhz) {
            zzhz zzhzVar = (zzhz) obj;
            if (this.zza.equals(zzhzVar.zza())) {
                zzii zziiVar = this.zzb;
                zzii zzb = zzhzVar.zzb();
                if (zziiVar != null ? zziiVar.equals(zzb) : zzb == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        zzii zziiVar = this.zzb;
        return hashCode ^ (zziiVar == null ? 0 : zziiVar.hashCode());
    }

    public final String toString() {
        return o0O000O.o00oOOo0("FlagsContext{context=", this.zza.toString(), ", hermeticFileOverrides=", String.valueOf(this.zzb), "}");
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    @Nullable
    public final zzii zzb() {
        return this.zzb;
    }
}
