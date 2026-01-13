package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeeg implements zzfuf {
    public final /* synthetic */ long zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzeyc zzc;
    public final /* synthetic */ zzeyf zzd;
    public final /* synthetic */ zzffb zze;
    public final /* synthetic */ zzeyo zzf;
    public final /* synthetic */ zzeeh zzg;

    public zzeeg(zzeeh zzeehVar, long j, String str, zzeyc zzeycVar, zzeyf zzeyfVar, zzffb zzffbVar, zzeyo zzeyoVar) {
        this.zzg = zzeehVar;
        this.zza = j;
        this.zzb = str;
        this.zzc = zzeycVar;
        this.zzd = zzeyfVar;
        this.zze = zzffbVar;
        this.zzf = zzeyoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8 A[ADDED_TO_REGION] */
    @Override // com.google.android.gms.internal.ads.zzfuf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.lang.Throwable r14) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeeg.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zzb(Object obj) {
        Clock clock;
        boolean z;
        zzeay zzeayVar;
        zzeei zzeeiVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        zzeeh.zzg(this.zzg, this.zzb, 0, elapsedRealtime, this.zzc.zzag, null);
        zzeeh zzeehVar = this.zzg;
        z = zzeehVar.zze;
        if (z) {
            zzeeiVar = zzeehVar.zzb;
            zzeeiVar.zza(this.zzd, this.zzc, 0, null, elapsedRealtime);
        }
        zzeayVar = this.zzg.zzf;
        zzeayVar.zzf(this.zzc, elapsedRealtime, null);
    }
}
