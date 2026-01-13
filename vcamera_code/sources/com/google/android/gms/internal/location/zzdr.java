package com.google.android.gms.internal.location;

import com.google.firebase.analytics.FirebaseAnalytics;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdr extends zzds {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzds zzc;

    public zzdr(zzds zzdsVar, int i, int i2) {
        this.zzc = zzdsVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzdm.zza(i, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    @CheckForNull
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.location.zzds, java.util.List
    /* renamed from: zzh */
    public final zzds subList(int i, int i2) {
        zzdm.zzc(i, i2, this.zzb);
        zzds zzdsVar = this.zzc;
        int i3 = this.zza;
        return zzdsVar.subList(i + i3, i2 + i3);
    }
}
