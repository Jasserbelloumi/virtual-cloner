package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* loaded from: classes2.dex */
final class zzgtk implements Iterator {
    public final Iterator zza;
    public final /* synthetic */ zzgtl zzb;

    public zzgtk(zzgtl zzgtlVar) {
        zzgre zzgreVar;
        this.zzb = zzgtlVar;
        zzgreVar = zzgtlVar.zza;
        this.zza = zzgreVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
