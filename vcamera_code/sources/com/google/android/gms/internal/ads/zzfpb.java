package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
class zzfpb implements Iterator {
    public final Iterator zza;
    public final Collection zzb;
    public final /* synthetic */ zzfpc zzc;

    public zzfpb(zzfpc zzfpcVar) {
        this.zzc = zzfpcVar;
        Collection collection = zzfpcVar.zzb;
        this.zzb = collection;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public zzfpb(zzfpc zzfpcVar, Iterator it) {
        this.zzc = zzfpcVar;
        this.zzb = zzfpcVar.zzb;
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        zzfpf.zze(this.zzc.zze);
        this.zzc.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }
}
