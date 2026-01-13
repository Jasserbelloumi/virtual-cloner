package com.google.android.gms.internal.ads;

import java.io.Serializable;
/* loaded from: classes2.dex */
final class zzfrq extends zzfrs implements Serializable {
    public static final zzfrq zza = new zzfrq();

    private zzfrq() {
    }

    @Override // com.google.android.gms.internal.ads.zzfrs, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final zzfrs zza() {
        return zzfsa.zza;
    }
}
