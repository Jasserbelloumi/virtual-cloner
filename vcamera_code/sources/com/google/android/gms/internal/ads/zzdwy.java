package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
/* loaded from: classes2.dex */
public final class zzdwy extends zzbtf {
    public final /* synthetic */ zzdwz zza;

    public zzdwy(zzdwz zzdwzVar) {
        this.zza = zzdwzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zze(com.google.android.gms.ads.internal.util.zzaz zzazVar) {
        this.zza.zza.zze(zzazVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzd(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
