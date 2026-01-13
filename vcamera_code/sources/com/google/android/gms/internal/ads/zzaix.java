package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzaix {
    public final int zza;
    @o0OO00OO
    public final String zzb;
    public final List zzc;
    public final byte[] zzd;

    public zzaix(int i, @o0OO00OO String str, @o0OO00OO List list, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.zzd = bArr;
    }
}
