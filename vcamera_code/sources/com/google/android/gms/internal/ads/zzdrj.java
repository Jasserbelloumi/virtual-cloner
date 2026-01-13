package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdrj extends zzbjo {
    public final /* synthetic */ Object zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ zzfec zzd;
    public final /* synthetic */ zzbzs zze;
    public final /* synthetic */ zzdrk zzf;

    public zzdrj(zzdrk zzdrkVar, Object obj, String str, long j, zzfec zzfecVar, zzbzs zzbzsVar) {
        this.zzf = zzdrkVar;
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfecVar;
        this.zze = zzbzsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zze(String str) {
        zzdpr zzdprVar;
        zzdbf zzdbfVar;
        zzfep zzfepVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
            zzdprVar = this.zzf.zzl;
            zzdprVar.zzb(this.zzb, "error");
            zzdbfVar = this.zzf.zzo;
            zzdbfVar.zzb(this.zzb, "error");
            zzfepVar = this.zzf.zzp;
            zzfec zzfecVar = this.zzd;
            zzfecVar.zzc(str);
            zzfecVar.zzf(false);
            zzfepVar.zzb(zzfecVar.zzl());
            this.zze.zzd(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zzf() {
        zzdpr zzdprVar;
        zzdbf zzdbfVar;
        zzfep zzfepVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
            zzdprVar = this.zzf.zzl;
            zzdprVar.zzd(this.zzb);
            zzdbfVar = this.zzf.zzo;
            zzdbfVar.zzd(this.zzb);
            zzfepVar = this.zzf.zzp;
            zzfec zzfecVar = this.zzd;
            zzfecVar.zzf(true);
            zzfepVar.zzb(zzfecVar.zzl());
            this.zze.zzd(Boolean.TRUE);
        }
    }
}
