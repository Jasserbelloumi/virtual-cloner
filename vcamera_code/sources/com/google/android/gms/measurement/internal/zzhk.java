package com.google.android.gms.measurement.internal;
/* loaded from: classes2.dex */
final class zzhk implements Runnable {
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zza;
    public final /* synthetic */ zzhx zzb;

    public zzhk(zzhx zzhxVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzb = zzhxVar;
        this.zza = zzcfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r6 = this;
            com.google.android.gms.measurement.internal.zzhx r0 = r6.zzb
            com.google.android.gms.measurement.internal.zzfr r0 = r0.zzt
            com.google.android.gms.measurement.internal.zzkc r0 = r0.zzu()
            com.google.android.gms.internal.measurement.zzpa.zzc()
            com.google.android.gms.measurement.internal.zzfr r1 = r0.zzt
            com.google.android.gms.measurement.internal.zzag r1 = r1.zzf()
            com.google.android.gms.measurement.internal.zzdt r2 = com.google.android.gms.measurement.internal.zzdu.zzau
            r3 = 0
            boolean r1 = r1.zzs(r3, r2)
            if (r1 == 0) goto L73
            com.google.android.gms.measurement.internal.zzfr r1 = r0.zzt
            com.google.android.gms.measurement.internal.zzew r1 = r1.zzm()
            com.google.android.gms.measurement.internal.zzai r1 = r1.zzc()
            com.google.android.gms.measurement.internal.zzah r2 = com.google.android.gms.measurement.internal.zzah.ANALYTICS_STORAGE
            boolean r1 = r1.zzi(r2)
            if (r1 != 0) goto L39
            com.google.android.gms.measurement.internal.zzfr r0 = r0.zzt
            com.google.android.gms.measurement.internal.zzeh r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzef r0 = r0.zzl()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            goto L7f
        L39:
            com.google.android.gms.measurement.internal.zzfr r1 = r0.zzt
            com.google.android.gms.measurement.internal.zzew r1 = r1.zzm()
            com.google.android.gms.measurement.internal.zzfr r2 = r0.zzt
            com.google.android.gms.common.util.Clock r2 = r2.zzav()
            long r4 = r2.currentTimeMillis()
            boolean r1 = r1.zzk(r4)
            if (r1 != 0) goto L82
            com.google.android.gms.measurement.internal.zzfr r1 = r0.zzt
            com.google.android.gms.measurement.internal.zzew r1 = r1.zzm()
            com.google.android.gms.measurement.internal.zzes r1 = r1.zzk
            long r1 = r1.zza()
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L62
            goto L82
        L62:
            com.google.android.gms.measurement.internal.zzfr r0 = r0.zzt
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzm()
            com.google.android.gms.measurement.internal.zzes r0 = r0.zzk
            long r0 = r0.zza()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L83
        L73:
            com.google.android.gms.measurement.internal.zzfr r0 = r0.zzt
            com.google.android.gms.measurement.internal.zzeh r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzef r0 = r0.zzl()
            java.lang.String r1 = "getSessionId has been disabled."
        L7f:
            r0.zza(r1)
        L82:
            r0 = r3
        L83:
            if (r0 == 0) goto L97
            com.google.android.gms.measurement.internal.zzhx r1 = r6.zzb
            com.google.android.gms.measurement.internal.zzfr r1 = r1.zzt
            com.google.android.gms.measurement.internal.zzlb r1 = r1.zzv()
            com.google.android.gms.internal.measurement.zzcf r2 = r6.zza
            long r3 = r0.longValue()
            r1.zzU(r2, r3)
            return
        L97:
            com.google.android.gms.internal.measurement.zzcf r0 = r6.zza     // Catch: android.os.RemoteException -> L9d
            r0.zze(r3)     // Catch: android.os.RemoteException -> L9d
            return
        L9d:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzhx r1 = r6.zzb
            com.google.android.gms.measurement.internal.zzfr r1 = r1.zzt
            com.google.android.gms.measurement.internal.zzeh r1 = r1.zzay()
            com.google.android.gms.measurement.internal.zzef r1 = r1.zzd()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.zzb(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhk.run():void");
    }
}
