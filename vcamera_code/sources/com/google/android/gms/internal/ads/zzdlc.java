package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class zzdlc implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final zzceu zzb;
    private final Context zzc;
    private final zzdpi zzd;
    private final zzfdk zze;
    private final zzeaf zzf;
    private final Executor zzg;
    private final zzapw zzh;
    private final zzbzg zzi;
    private final zzfff zzj;

    public zzdlc(Context context, Executor executor, zzapw zzapwVar, zzbzg zzbzgVar, com.google.android.gms.ads.internal.zza zzaVar, zzceu zzceuVar, zzeaf zzeafVar, zzfff zzfffVar, zzdpi zzdpiVar, zzfdk zzfdkVar) {
        this.zzc = context;
        this.zzg = executor;
        this.zzh = zzapwVar;
        this.zzi = zzbzgVar;
        this.zza = zzaVar;
        this.zzb = zzceuVar;
        this.zzf = zzeafVar;
        this.zzj = zzfffVar;
        this.zzd = zzdpiVar;
        this.zze = zzfdkVar;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzdlc zzdlcVar) {
        return zzdlcVar.zzc;
    }

    public static /* bridge */ /* synthetic */ zzapw zzb(zzdlc zzdlcVar) {
        return zzdlcVar.zzh;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.zza zzc(zzdlc zzdlcVar) {
        return zzdlcVar.zza;
    }

    public static /* bridge */ /* synthetic */ zzbzg zzd(zzdlc zzdlcVar) {
        return zzdlcVar.zzi;
    }

    public static /* bridge */ /* synthetic */ zzceu zze(zzdlc zzdlcVar) {
        return zzdlcVar.zzb;
    }

    public static /* bridge */ /* synthetic */ zzdpi zzf(zzdlc zzdlcVar) {
        return zzdlcVar.zzd;
    }

    public static /* bridge */ /* synthetic */ zzeaf zzg(zzdlc zzdlcVar) {
        return zzdlcVar.zzf;
    }

    public static /* bridge */ /* synthetic */ zzfdk zzh(zzdlc zzdlcVar) {
        return zzdlcVar.zze;
    }

    public static /* bridge */ /* synthetic */ zzfff zzi(zzdlc zzdlcVar) {
        return zzdlcVar.zzj;
    }

    public static /* bridge */ /* synthetic */ Executor zzj(zzdlc zzdlcVar) {
        return zzdlcVar.zzg;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdlf zzdlfVar = new zzdlf(this);
        zzdlfVar.zzh();
        return zzdlfVar;
    }
}
