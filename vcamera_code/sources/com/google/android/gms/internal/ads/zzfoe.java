package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfoe implements Iterable {
    public final /* synthetic */ CharSequence zza;
    public final /* synthetic */ zzfoh zzb;

    public zzfoe(zzfoh zzfohVar, CharSequence charSequence) {
        this.zzb = zzfohVar;
        this.zza = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzg;
        zzg = this.zzb.zzg(this.zza);
        return zzg;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzfnk.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
