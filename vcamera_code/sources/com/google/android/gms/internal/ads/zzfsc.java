package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzfsc extends zzfpk implements Set {
    public zzfsc(Set set, zzfnv zzfnvVar) {
        super(set, zzfnvVar);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        return zzfsf.zzc(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzfsf.zza(this);
    }
}
