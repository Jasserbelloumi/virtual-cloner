package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;
/* loaded from: classes2.dex */
final class zzfqr extends zzfon {
    public final /* synthetic */ Iterator zza;
    public final /* synthetic */ zzfnv zzb;

    public zzfqr(Iterator it, zzfnv zzfnvVar) {
        this.zza = it;
        this.zzb = zzfnvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfon
    @CheckForNull
    public final Object zza() {
        while (this.zza.hasNext()) {
            Object next = this.zza.next();
            if (this.zzb.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
