package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import javax.annotation.Nullable;
/* loaded from: classes2.dex */
public final class zzggo {
    @Nullable
    private ArrayList zza = new ArrayList();
    private zzggl zzb = zzggl.zza;
    @Nullable
    private Integer zzc = null;

    public final zzggo zza(zzfwg zzfwgVar, int i, String str, String str2) {
        ArrayList arrayList = this.zza;
        if (arrayList != null) {
            arrayList.add(new zzggq(zzfwgVar, i, str, str2, null));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    public final zzggo zzb(zzggl zzgglVar) {
        if (this.zza != null) {
            this.zzb = zzgglVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    public final zzggo zzc(int i) {
        if (this.zza != null) {
            this.zzc = Integer.valueOf(i);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    public final zzggs zzd() throws GeneralSecurityException {
        if (this.zza != null) {
            Integer num = this.zzc;
            if (num == null) {
                zzggs zzggsVar = new zzggs(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
                this.zza = null;
                return zzggsVar;
            }
            int intValue = num.intValue();
            ArrayList arrayList = this.zza;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int zza = ((zzggq) arrayList.get(i)).zza();
                i++;
                if (zza == intValue) {
                    zzggs zzggsVar2 = new zzggs(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
                    this.zza = null;
                    return zzggsVar2;
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
