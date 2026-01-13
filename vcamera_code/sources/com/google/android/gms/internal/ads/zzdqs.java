package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdqs extends com.google.android.gms.ads.internal.client.zzbg {
    public final /* synthetic */ zzdqm zza;
    public final /* synthetic */ zzdqt zzb;

    public zzdqs(zzdqt zzdqtVar, zzdqm zzdqmVar) {
        this.zzb = zzdqtVar;
        this.zza = zzdqmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc() throws RemoteException {
        long j;
        zzdqm zzdqmVar = this.zza;
        j = this.zzb.zza;
        zzdqmVar.zzb(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() throws RemoteException {
        long j;
        zzdqm zzdqmVar = this.zza;
        j = this.zzb.zza;
        zzdqmVar.zzc(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze(int i) throws RemoteException {
        long j;
        zzdqm zzdqmVar = this.zza;
        j = this.zzb.zza;
        zzdqmVar.zzd(j, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        long j;
        zzdqm zzdqmVar = this.zza;
        j = this.zzb.zza;
        zzdqmVar.zzd(j, zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() throws RemoteException {
        long j;
        zzdqm zzdqmVar = this.zza;
        j = this.zzb.zza;
        zzdqmVar.zze(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() throws RemoteException {
        long j;
        zzdqm zzdqmVar = this.zza;
        j = this.zzb.zza;
        zzdqmVar.zzg(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzk() {
    }
}
