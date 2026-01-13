package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.annotation.CheckForNull;
/* loaded from: classes2.dex */
final class zzftl extends zzftk {
    public final AtomicReferenceFieldUpdater zza;
    public final AtomicIntegerFieldUpdater zzb;

    public zzftl(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.zzftk
    public final int zza(zzfto zzftoVar) {
        return this.zzb.decrementAndGet(zzftoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzftk
    public final void zzb(zzfto zzftoVar, @CheckForNull Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.zza;
        while (!androidx.concurrent.futures.o00oOo00.o00oOOo0(atomicReferenceFieldUpdater, zzftoVar, null, set2) && atomicReferenceFieldUpdater.get(zzftoVar) == null) {
        }
    }
}
