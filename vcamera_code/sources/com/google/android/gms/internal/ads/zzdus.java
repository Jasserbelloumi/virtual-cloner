package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
/* loaded from: classes2.dex */
public final class zzdus extends zzbti {
    public final /* synthetic */ zzdut zza;

    public zzdus(zzdut zzdutVar) {
        this.zza = zzdutVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtj
    public final void zze(com.google.android.gms.ads.internal.util.zzaz zzazVar) {
        this.zza.zza.zze(zzazVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtj
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzd(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
